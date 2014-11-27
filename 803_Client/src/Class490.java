/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class490
{
    static int[] anIntArray6500 = { 8, 11, 4, 6, 9, 7, 10, 0 };
    public int[] anIntArray6501;
    static final int anInt6502 = 1073741823;
    long aLong6503;
    Class604[] aClass604Array6504;
    long aLong6505;
    int anInt6506;
    public boolean aBool6507;
    public int anInt6508 = 947219277;
    int[] anIntArray6509;
    public static final int anInt6510 = -2147483648;
    public static final int anInt6511 = 1073741824;
    static Class129 aClass129_6512 = new Class129(260);
    static Class129 aClass129_6513 = new Class129(5);
    
    public Class89 method11200
	(Class103 class103, int i, Class539 class539, Class350 class350,
	 NPCDefinitionLoader class405, ItemDefinitionLoader class618, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class409 class409_0_,
	 Class409[] class409s, int[] is, int i_1_, boolean bool,
	 Class504 class504) {
	if (-1 != -614581637 * anInt6508)
	    return (class405.getNpcDefinition(anInt6508 * -614581637, -830226547)
			.method7160
		    (class103, i, class539, interface13, interface11, class409,
		     class409_0_, class409s, is, i_1_, null, (byte) 44));
	int i_2_ = i;
	long l = -8561193760609408777L * ((Class490) this).aLong6503;
	int[] is_3_ = ((Class490) this).anIntArray6509;
	boolean bool_4_ = false;
	boolean bool_5_ = false;
	if (null != class409) {
	    AnimationDefinition class549 = class409.method7345((byte) 0);
	    if (null != class549
		&& (2118549971 * class549.anInt7077 >= 0
		    || -1074722755 * class549.itemInHand >= 0)) {
		is_3_ = new int[((Class490) this).anIntArray6509.length];
		for (int i_6_ = 0; i_6_ < is_3_.length; i_6_++)
		    is_3_[i_6_] = ((Class490) this).anIntArray6509[i_6_];
		if (2118549971 * class549.anInt7077 >= 0
		    && -1 != class504.anInt6627 * -693450691) {
		    bool_4_ = true;
		    if (2118549971 * class549.anInt7077 == 65535) {
			is_3_[class504.anInt6627 * -693450691] = 0;
			for (int i_7_ = 0;
			     i_7_ < class504.anIntArray6628.length; i_7_++)
			    is_3_[class504.anIntArray6628[i_7_]] = 0;
			l ^= ~0xffffffffL;
		    } else {
			is_3_[-693450691 * class504.anInt6627]
			    = class549.anInt7077 * 2118549971 | 0x40000000;
			for (int i_8_ = 0;
			     i_8_ < class504.anIntArray6628.length; i_8_++)
			    is_3_[class504.anIntArray6628[i_8_]] = 0;
			l ^= ((long) is_3_[-693450691 * class504.anInt6627]
			      << 32);
		    }
		}
		if (-1074722755 * class549.itemInHand >= 0
		    && -1 != class504.anInt6631 * -1130705117) {
		    bool_5_ = true;
		    if (65535 == class549.itemInHand * -1074722755) {
			is_3_[class504.anInt6631 * -1130705117] = 0;
			for (int i_9_ = 0;
			     i_9_ < class504.anIntArray6633.length; i_9_++)
			    is_3_[class504.anIntArray6633[i_9_]] = 0;
			l ^= 0xffffffffL;
		    } else {
			is_3_[class504.anInt6631 * -1130705117]
			    = -1074722755 * class549.itemInHand | 0x40000000;
			for (int i_10_ = 0;
			     i_10_ < class504.anIntArray6633.length; i_10_++)
			    is_3_[class504.anIntArray6633[i_10_]] = 0;
			l ^= (long) is_3_[class504.anInt6631 * -1130705117];
		    }
		}
	    }
	}
	boolean bool_11_ = false;
	int i_12_ = class409s != null ? class409s.length : 0;
	for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
	    if (null != class409s[i_13_]) {
		i_2_ |= class409s[i_13_].method7356(-209088581);
		bool_11_ = true;
	    }
	}
	if (class409 != null) {
	    i_2_ |= class409.method7356(-792811530);
	    bool_11_ = true;
	}
	if (null != class409_0_) {
	    i_2_ |= class409_0_.method7356(-347522106);
	    bool_11_ = true;
	}
	boolean bool_14_ = false;
	if (is != null) {
	    for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
		if (is[i_15_] != -1) {
		    i_2_ |= 0x20;
		    bool_14_ = true;
		}
	    }
	}
	Class89 class89;
	synchronized (aClass129_6512) {
	    class89 = (Class89) aClass129_6512.get(l);
	}
	Class554 class554 = null;
	if (-1 != ((Class490) this).anInt6506 * 1868674289)
	    class554 = class539.method11908((1868674289
					     * ((Class490) this).anInt6506),
					    -819251931);
	if (class89 == null
	    || class103.method2301(class89.method1866(), i_2_) != 0) {
	    if (null != class89)
		i_2_ = class103.method2302(i_2_, class89.method1866());
	    int i_16_ = i_2_;
	    boolean bool_17_ = false;
	    for (int i_18_ = 0; i_18_ < is_3_.length; i_18_++) {
		int i_19_ = is_3_[i_18_];
		Class604 class604 = null;
		boolean bool_20_ = false;
		if (bool_4_) {
		    if (i_18_ == class504.anInt6627 * -693450691)
			bool_20_ = true;
		    else {
			for (int i_21_ = 0;
			     i_21_ < class504.anIntArray6628.length; i_21_++) {
			    if (class504.anIntArray6628[i_21_] == i_18_) {
				bool_20_ = true;
				break;
			    }
			}
		    }
		}
		if (bool_5_) {
		    if (class504.anInt6631 * -1130705117 == i_18_)
			bool_20_ = true;
		    else {
			for (int i_22_ = 0;
			     i_22_ < class504.anIntArray6633.length; i_22_++) {
			    if (class504.anIntArray6633[i_22_] == i_18_) {
				bool_20_ = true;
				break;
			    }
			}
		    }
		}
		if (0 != (i_19_ & 0x40000000)) {
		    if (!bool_20_
			&& null != ((Class490) this).aClass604Array6504
			&& ((Class490) this).aClass604Array6504[i_18_] != null)
			class604 = ((Class490) this).aClass604Array6504[i_18_];
		    if (!class618.list
			     (i_19_ & 0x3fffffff, (short) 24029)
			     .method13374(aBool6507, class604, (byte) 1))
			bool_17_ = true;
		} else if ((i_19_ & ~0x7fffffff) != 0
			   && !class350.method6244
				   (i_19_ & 0x3fffffff, -938707019)
				   .method6652(-1417162320))
		    bool_17_ = true;
	    }
	    if (bool_17_) {
		if (-1L
		    != 6130168555163744417L * ((Class490) this).aLong6505) {
		    synchronized (aClass129_6512) {
			class89 = (Class89) (aClass129_6512.get
					     (((Class490) this).aLong6505
					      * 6130168555163744417L));
		    }
		}
		if (class89 == null
		    || class103.method2301(class89.method1866(), i_2_) != 0)
		    return null;
	    } else {
		Class161[] class161s = new Class161[is_3_.length];
		for (int i_23_ = 0; i_23_ < is_3_.length; i_23_++) {
		    int i_24_ = is_3_[i_23_];
		    Class604 class604 = null;
		    boolean bool_25_
			= 5 == i_23_ && bool_4_ || i_23_ == 3 && bool_5_;
		    if (0 != (i_24_ & 0x40000000)) {
			if (!bool_25_
			    && null != ((Class490) this).aClass604Array6504
			    && (((Class490) this).aClass604Array6504[i_23_]
				!= null))
			    class604
				= ((Class490) this).aClass604Array6504[i_23_];
			Class161 class161
			    = class618.list
				  (i_24_ & 0x3fffffff, (short) -10686)
				  .method13375(aBool6507, class604, 42365628);
			if (class161 != null)
			    class161s[i_23_] = class161;
		    } else if (0 != (i_24_ & ~0x7fffffff)) {
			Class161 class161
			    = class350.method6244
				  (i_24_ & 0x3fffffff, -484162787)
				  .method6638(2071328586);
			if (null != class161)
			    class161s[i_23_] = class161;
		    }
		}
		if (class554 != null && null != class554.anIntArrayArray7231) {
		    for (int i_26_ = 0;
			 i_26_ < class554.anIntArrayArray7231.length;
			 i_26_++) {
			if (class161s[i_26_] != null) {
			    int i_27_ = 0;
			    int i_28_ = 0;
			    int i_29_ = 0;
			    int i_30_ = 0;
			    int i_31_ = 0;
			    int i_32_ = 0;
			    if (class554.anIntArrayArray7231[i_26_] != null) {
				i_27_ = class554.anIntArrayArray7231[i_26_][0];
				i_28_ = class554.anIntArrayArray7231[i_26_][1];
				i_29_ = class554.anIntArrayArray7231[i_26_][2];
				i_30_ = (class554.anIntArrayArray7231[i_26_][3]
					 << 3);
				i_31_ = (class554.anIntArrayArray7231[i_26_][4]
					 << 3);
				i_32_ = (class554.anIntArrayArray7231[i_26_][5]
					 << 3);
			    }
			    if (0 != i_30_ || i_31_ != 0 || 0 != i_32_)
				class161s[i_26_].method3489(i_30_, i_31_,
							    i_32_);
			    if (i_27_ != 0 || i_28_ != 0 || 0 != i_29_)
				class161s[i_26_].method3459(i_27_, i_28_,
							    i_29_);
			}
		    }
		}
		Class161 class161 = new Class161(class161s, class161s.length);
		i_16_ |= 0x4000;
		class89 = class103.method2356(class161, i_16_,
					      -1976761445 * (Class380_Sub3_Sub2
							     .anInt10661),
					      64, 850);
		for (int i_33_ = 0; i_33_ < 10; i_33_++) {
		    for (int i_34_ = 0;
			 i_34_ < Class558.aShortArrayArray7261[i_33_].length;
			 i_34_++) {
			if (anIntArray6501[i_33_]
			    < (Class561.aShortArrayArrayArray7298[i_33_]
			       [i_34_]).length)
			    class89.method1908((Class558.aShortArrayArray7261
						[i_33_][i_34_]),
					       (Class561
						.aShortArrayArrayArray7298
						[i_33_][i_34_]
						[anIntArray6501[i_33_]]));
		    }
		}
		class89.method1922();
		if (bool) {
		    class89.method1928(i_2_);
		    synchronized (aClass129_6512) {
			aClass129_6512.put(class89, l);
		    }
		    ((Class490) this).aLong6505 = 6937002535259073377L * l;
		}
	    }
	}
	Class89 class89_35_ = class89.method2019((byte) 4, i_2_, true);
	if (!bool_11_ && !bool_14_)
	    return class89_35_;
	Class266[] class266s = null;
	if (class554 != null)
	    class266s = class554.method12258((byte) -24);
	if (bool_14_ && null != class266s) {
	    for (int i_36_ = 0; i_36_ < is.length; i_36_++) {
		if (class266s[i_36_] != null)
		    class89_35_.method1857(class266s[i_36_], 1 << i_36_, true);
	    }
	}
	int i_37_ = 0;
	int i_38_ = 1;
	while (i_37_ < i_12_) {
	    if (null != class409s[i_37_])
		class409s[i_37_].method7358(class89_35_, 0, i_38_,
					    -1773141377);
	    i_37_++;
	    i_38_ <<= 1;
	}
	if (bool_14_) {
	    for (i_37_ = 0; i_37_ < is.length; i_37_++) {
		if (is[i_37_] != -1) {
		    i_38_ = is[i_37_] - i_1_;
		    i_38_ &= 0x3fff;
		    Class266 class266 = new Class266();
		    class266.method5125(0.0F, 1.0F, 0.0F,
					Class282.method5490(i_38_));
		    class89_35_.method1857(class266, 1 << i_37_, false);
		}
	    }
	}
	if (bool_14_ && null != class266s) {
	    for (i_37_ = 0; i_37_ < is.length; i_37_++) {
		if (null != class266s[i_37_])
		    class89_35_.method1857(class266s[i_37_], 1 << i_37_,
					   false);
	    }
	}
	if (null != class409 && class409_0_ != null)
	    Class117.method2931(class89_35_, class409, class409_0_, -40313703);
	else if (class409 != null)
	    class409.method7357(class89_35_, 0, (byte) -37);
	else if (class409_0_ != null)
	    class409_0_.method7357(class89_35_, 0, (byte) -10);
	return class89_35_;
    }
    
    public void method11201(int i, int[] is, Class604[] class604s,
			    int[] is_39_, boolean bool, int i_40_, int i_41_) {
	if (1868674289 * ((Class490) this).anInt6506 != i)
	    ((Class490) this).anInt6506 = i * 1807924241;
	((Class490) this).anIntArray6509 = is;
	((Class490) this).aClass604Array6504 = class604s;
	anIntArray6501 = is_39_;
	aBool6507 = bool;
	anInt6508 = i_40_ * -947219277;
	method11206((byte) 107);
    }
    
    public void method11202(int i, int i_42_, ItemDefinitionLoader class618) {
	if (-1 == i_42_)
	    ((Class490) this).anIntArray6509[i] = 0;
	else if (class618.list(i_42_, (short) -114) != null) {
	    ((Class490) this).anIntArray6509[i] = i_42_ | 0x40000000;
	    method11206((byte) 88);
	}
    }
    
    public void method11203(int i, int i_43_, byte i_44_) {
	anIntArray6501[i] = i_43_;
	method11206((byte) 64);
    }
    
    public void method11204(boolean bool, int i) {
	aBool6507 = bool;
	method11206((byte) 103);
    }
    
    public static void method11205() {
	synchronized (aClass129_6512) {
	    aClass129_6512.removeSoftReferences((byte) -36);
	}
	synchronized (aClass129_6513) {
	    aClass129_6513.removeSoftReferences((byte) 26);
	}
    }
    
    void method11206(byte i) {
	long[] ls = RSByteBuffer.aLongArray8800;
	((Class490) this).aLong6503 = 1804695797121066809L;
	((Class490) this).aLong6503
	    = (-1804695797121066809L
	       * (((Class490) this).aLong6503 * -8561193760609408777L >>> 8
		  ^ ls[(int) (((((Class490) this).aLong6503
				* -8561193760609408777L)
			       ^ (long) ((((Class490) this).anInt6506
					  * 1868674289)
					 >> 8))
			      & 0xffL)]));
	((Class490) this).aLong6503
	    = (((Class490) this).aLong6503 * -8561193760609408777L >>> 8
	       ^ ls[(int) ((((Class490) this).aLong6503 * -8561193760609408777L
			    ^ (long) (1868674289
				      * ((Class490) this).anInt6506))
			   & 0xffL)]) * -1804695797121066809L;
	for (int i_45_ = 0; i_45_ < ((Class490) this).anIntArray6509.length;
	     i_45_++) {
	    ((Class490) this).aLong6503
		= (((Class490) this).aLong6503 * -8561193760609408777L >>> 8
		   ^ ls[(int) (((((Class490) this).aLong6503
				 * -8561193760609408777L)
				^ (long) ((((Class490) this).anIntArray6509
					   [i_45_])
					  >> 24))
			       & 0xffL)]) * -1804695797121066809L;
	    ((Class490) this).aLong6503
		= (-1804695797121066809L
		   * (((Class490) this).aLong6503 * -8561193760609408777L >>> 8
		      ^ ls[(int) (((((Class490) this).aLong6503
				    * -8561193760609408777L)
				   ^ (long) ((((Class490) this).anIntArray6509
					      [i_45_])
					     >> 16))
				  & 0xffL)]));
	    ((Class490) this).aLong6503
		= (-1804695797121066809L
		   * (-8561193760609408777L * ((Class490) this).aLong6503 >>> 8
		      ^ ls[(int) (((((Class490) this).aLong6503
				    * -8561193760609408777L)
				   ^ (long) ((((Class490) this).anIntArray6509
					      [i_45_])
					     >> 8))
				  & 0xffL)]));
	    ((Class490) this).aLong6503
		= (-8561193760609408777L * ((Class490) this).aLong6503 >>> 8
		   ^ ls[(int) (((-8561193760609408777L
				 * ((Class490) this).aLong6503)
				^ (long) (((Class490) this).anIntArray6509
					  [i_45_]))
			       & 0xffL)]) * -1804695797121066809L;
	}
	if (null != ((Class490) this).aClass604Array6504) {
	    for (int i_46_ = 0;
		 i_46_ < ((Class490) this).aClass604Array6504.length;
		 i_46_++) {
		if (null != ((Class490) this).aClass604Array6504[i_46_]) {
		    int[] is;
		    int[] is_47_;
		    if (aBool6507) {
			is = (((Class490) this).aClass604Array6504[i_46_]
			      .anIntArray7746);
			is_47_ = (((Class490) this).aClass604Array6504[i_46_]
				  .anIntArray7743);
		    } else {
			is = (((Class490) this).aClass604Array6504[i_46_]
			      .anIntArray7742);
			is_47_ = (((Class490) this).aClass604Array6504[i_46_]
				  .anIntArray7747);
		    }
		    if (is != null) {
			for (int i_48_ = 0; i_48_ < is.length; i_48_++) {
			    ((Class490) this).aLong6503
				= (-1804695797121066809L
				   * ((-8561193760609408777L
				       * ((Class490) this).aLong6503) >>> 8
				      ^ ls[(int) (((-8561193760609408777L
						    * (((Class490) this)
						       .aLong6503))
						   ^ (long) (is[i_48_] >> 8))
						  & 0xffL)]));
			    ((Class490) this).aLong6503
				= (-1804695797121066809L
				   * ((-8561193760609408777L
				       * ((Class490) this).aLong6503) >>> 8
				      ^ ls[(int) (((((Class490) this).aLong6503
						    * -8561193760609408777L)
						   ^ (long) is[i_48_])
						  & 0xffL)]));
			}
		    }
		    if (is_47_ != null) {
			for (int i_49_ = 0; i_49_ < is_47_.length; i_49_++) {
			    ((Class490) this).aLong6503
				= (((-8561193760609408777L
				     * ((Class490) this).aLong6503) >>> 8
				    ^ ls[(int) (((((Class490) this).aLong6503
						  * -8561193760609408777L)
						 ^ (long) (is_47_[i_49_] >> 8))
						& 0xffL)])
				   * -1804695797121066809L);
			    ((Class490) this).aLong6503
				= (((((Class490) this).aLong6503
				     * -8561193760609408777L) >>> 8
				    ^ ls[(int) (((((Class490) this).aLong6503
						  * -8561193760609408777L)
						 ^ (long) is_47_[i_49_])
						& 0xffL)])
				   * -1804695797121066809L);
			}
		    }
		    if (null != (((Class490) this).aClass604Array6504[i_46_]
				 .aShortArray7749)) {
			for (int i_50_ = 0;
			     i_50_ < (((Class490) this).aClass604Array6504
				      [i_46_].aShortArray7749).length;
			     i_50_++) {
			    ((Class490) this).aLong6503
				= (-1804695797121066809L
				   * ((((Class490) this).aLong6503
				       * -8561193760609408777L) >>> 8
				      ^ (ls
					 [(int) (((-8561193760609408777L
						   * (((Class490) this)
						      .aLong6503))
						  ^ (long) ((((Class490) this)
							     .aClass604Array6504
							     [i_46_]
							     .aShortArray7749
							     [i_50_])
							    >> 8))
						 & 0xffL)])));
			    ((Class490) this).aLong6503
				= (((-8561193760609408777L
				     * ((Class490) this).aLong6503) >>> 8
				    ^ (ls
				       [(int) (((-8561193760609408777L
						 * ((Class490) this).aLong6503)
						^ (long) (((Class490) this)
							  .aClass604Array6504
							  [i_46_]
							  .aShortArray7749
							  [i_50_]))
					       & 0xffL)]))
				   * -1804695797121066809L);
			}
		    }
		    if (null != (((Class490) this).aClass604Array6504[i_46_]
				 .aShortArray7750)) {
			for (int i_51_ = 0;
			     i_51_ < (((Class490) this).aClass604Array6504
				      [i_46_].aShortArray7750).length;
			     i_51_++) {
			    ((Class490) this).aLong6503
				= (-1804695797121066809L
				   * ((((Class490) this).aLong6503
				       * -8561193760609408777L) >>> 8
				      ^ (ls
					 [(int) (((-8561193760609408777L
						   * (((Class490) this)
						      .aLong6503))
						  ^ (long) ((((Class490) this)
							     .aClass604Array6504
							     [i_46_]
							     .aShortArray7750
							     [i_51_])
							    >> 8))
						 & 0xffL)])));
			    ((Class490) this).aLong6503
				= (((((Class490) this).aLong6503
				     * -8561193760609408777L) >>> 8
				    ^ (ls
				       [(int) (((-8561193760609408777L
						 * ((Class490) this).aLong6503)
						^ (long) (((Class490) this)
							  .aClass604Array6504
							  [i_46_]
							  .aShortArray7750
							  [i_51_]))
					       & 0xffL)]))
				   * -1804695797121066809L);
			}
		    }
		}
	    }
	}
	for (int i_52_ = 0; i_52_ < 10; i_52_++)
	    ((Class490) this).aLong6503
		= (-1804695797121066809L
		   * (-8561193760609408777L * ((Class490) this).aLong6503 >>> 8
		      ^ ls[(int) (((((Class490) this).aLong6503
				    * -8561193760609408777L)
				   ^ (long) anIntArray6501[i_52_])
				  & 0xffL)]));
	((Class490) this).aLong6503
	    = (((Class490) this).aLong6503 * -8561193760609408777L >>> 8
	       ^ ls[(int) ((((Class490) this).aLong6503 * -8561193760609408777L
			    ^ (long) (aBool6507 ? 1 : 0))
			   & 0xffL)]) * -1804695797121066809L;
    }
    
    public void method11207(boolean bool) {
	aBool6507 = bool;
	method11206((byte) 71);
    }
    
    public Class89 method11208
	(Class103 class103, int i, Class350 class350, NPCDefinitionLoader class405,
	 ItemDefinitionLoader class618, Interface13 interface13, Interface11 interface11,
	 Class409 class409, int i_53_) {
	if (-1 != -614581637 * anInt6508)
	    return (class405.getNpcDefinition(-614581637 * anInt6508, -222404924)
			.method7146
		    (class103, i, interface13, interface11, class409, null,
		     (byte) 0));
	int i_54_ = class409 != null ? i | class409.method7356(1676608938) : i;
	Class89 class89;
	synchronized (aClass129_6513) {
	    class89 = ((Class89)
		       aClass129_6513.get(((Class490) this).aLong6503
						 * -8561193760609408777L));
	}
	if (null == class89
	    || class103.method2301(class89.method1866(), i_54_) != 0) {
	    if (null != class89)
		i_54_ = class103.method2302(i_54_, class89.method1866());
	    int i_55_ = i_54_;
	    boolean bool = false;
	    for (int i_56_ = 0;
		 i_56_ < ((Class490) this).anIntArray6509.length; i_56_++) {
		int i_57_ = ((Class490) this).anIntArray6509[i_56_];
		Class604 class604 = null;
		if ((i_57_ & 0x40000000) != 0) {
		    if (null != ((Class490) this).aClass604Array6504
			&& ((Class490) this).aClass604Array6504[i_56_] != null)
			class604 = ((Class490) this).aClass604Array6504[i_56_];
		    if (!class618.list
			     (i_57_ & 0x3fffffff, (short) -11212)
			     .method13376(aBool6507, class604, -1198667134))
			bool = true;
		} else if (0 != (i_57_ & ~0x7fffffff)
			   && !class350.method6244
				   (i_57_ & 0x3fffffff, -151067368)
				   .method6632(1580548314))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class161[] class161s
		= new Class161[((Class490) this).anIntArray6509.length];
	    int i_58_ = 0;
	    for (int i_59_ = 0;
		 i_59_ < ((Class490) this).anIntArray6509.length; i_59_++) {
		int i_60_ = ((Class490) this).anIntArray6509[i_59_];
		Class604 class604 = null;
		if ((i_60_ & 0x40000000) != 0) {
		    if (((Class490) this).aClass604Array6504 != null
			&& null != ((Class490) this).aClass604Array6504[i_59_])
			class604 = ((Class490) this).aClass604Array6504[i_59_];
		    Class161 class161
			= class618.list
			      (i_60_ & 0x3fffffff, (short) 3277)
			      .method13377(aBool6507, class604, 735376370);
		    if (class161 != null)
			class161s[i_58_++] = class161;
		} else if ((i_60_ & ~0x7fffffff) != 0) {
		    Class161 class161
			= class350.method6244
			      (i_60_ & 0x3fffffff, -345997636)
			      .method6654(1000940863);
		    if (class161 != null)
			class161s[i_58_++] = class161;
		}
	    }
	    Class161 class161 = new Class161(class161s, i_58_);
	    i_55_ |= 0x4000;
	    class89 = class103.method2356(class161, i_55_,
					  (Class380_Sub3_Sub2.anInt10661
					   * -1976761445),
					  64, 768);
	    for (int i_61_ = 0; i_61_ < 10; i_61_++) {
		for (int i_62_ = 0;
		     i_62_ < Class558.aShortArrayArray7261[i_61_].length;
		     i_62_++) {
		    if (anIntArray6501[i_61_]
			< (Class561.aShortArrayArrayArray7298[i_61_]
			   [i_62_]).length)
			class89.method1908((Class558.aShortArrayArray7261
					    [i_61_][i_62_]),
					   (Class561.aShortArrayArrayArray7298
					    [i_61_][i_62_]
					    [anIntArray6501[i_61_]]));
		}
	    }
	    class89.method1928(i_54_);
	    synchronized (aClass129_6513) {
		aClass129_6513.put(class89,
					  (-8561193760609408777L
					   * ((Class490) this).aLong6503));
	    }
	}
	if (null == class409)
	    return class89;
	Class89 class89_63_ = class89.method2019((byte) 4, i_54_, true);
	class409.method7357(class89_63_, 0, (byte) -8);
	return class89_63_;
    }
    
    public void method11209(int i, int i_64_, Class350 class350) {
	int i_65_ = anIntArray6500[i];
	if (class350.method6244(i_64_, -1049576245) != null) {
	    ((Class490) this).anIntArray6509[i_65_] = i_64_ | ~0x7fffffff;
	    method11206((byte) 53);
	}
    }
    
    public void method11210(int i, int i_66_, Class350 class350) {
	int i_67_ = anIntArray6500[i];
	if (class350.method6244(i_66_, 718112030) != null) {
	    ((Class490) this).anIntArray6509[i_67_] = i_66_ | ~0x7fffffff;
	    method11206((byte) 19);
	}
    }
    
    public void method11211(int i, int i_68_, Class350 class350, byte i_69_) {
	int i_70_ = anIntArray6500[i];
	if (class350.method6244(i_68_, -1950339325) != null) {
	    ((Class490) this).anIntArray6509[i_70_] = i_68_ | ~0x7fffffff;
	    method11206((byte) 81);
	}
    }
    
    public void method11212(int i, int[] is, Class604[] class604s,
			    int[] is_71_, boolean bool, int i_72_) {
	if (1868674289 * ((Class490) this).anInt6506 != i)
	    ((Class490) this).anInt6506 = i * 1807924241;
	((Class490) this).anIntArray6509 = is;
	((Class490) this).aClass604Array6504 = class604s;
	anIntArray6501 = is_71_;
	aBool6507 = bool;
	anInt6508 = i_72_ * -947219277;
	method11206((byte) 81);
    }
    
    public Class89 method11213(Class103 class103, int i, Class350 class350,
			       AnimationDefinitionLoader class556, Class409 class409, int i_73_,
			       int i_74_, int i_75_, int i_76_) {
	int i_77_ = null != class409 ? i | class409.method7356(-938871892) : i;
	long l = (long) i_75_ << 32 | (long) (i_74_ << 16) | (long) i_73_;
	Class89 class89;
	synchronized (aClass129_6513) {
	    class89 = (Class89) aClass129_6513.get(l);
	}
	if (class89 == null
	    || class103.method2301(class89.method1866(), i_77_) != 0) {
	    if (null != class89)
		i_77_ = class103.method2302(i_77_, class89.method1866());
	    int i_78_ = i_77_;
	    Class161[] class161s = new Class161[3];
	    int i_79_ = 0;
	    if (class350.method6244(i_73_, 331082199).method6632(-1410239366)
		&& class350.method6244(i_74_, 429476705).method6632(471466820)
		&& class350.method6244(i_75_, -1284584848)
		       .method6632(-1598348647)) {
		Class161 class161 = class350.method6244(i_73_, -1473468837)
					.method6654(403404807);
		if (null != class161)
		    class161s[i_79_++] = class161;
		class161 = class350.method6244(i_74_, -1764778314)
			       .method6654(-96474058);
		if (class161 != null)
		    class161s[i_79_++] = class161;
		class161 = class350.method6244(i_75_, -1958865035)
			       .method6654(1964166097);
		if (class161 != null)
		    class161s[i_79_++] = class161;
		class161 = new Class161(class161s, i_79_);
		i_78_ |= 0x4000;
		class89 = class103.method2356(class161, i_78_,
					      -1976761445 * (Class380_Sub3_Sub2
							     .anInt10661),
					      64, 768);
		for (int i_80_ = 0; i_80_ < 10; i_80_++) {
		    for (int i_81_ = 0;
			 i_81_ < Class558.aShortArrayArray7261[i_80_].length;
			 i_81_++) {
			if (anIntArray6501[i_80_]
			    < (Class561.aShortArrayArrayArray7298[i_80_]
			       [i_81_]).length)
			    class89.method1908((Class558.aShortArrayArray7261
						[i_80_][i_81_]),
					       (Class561
						.aShortArrayArrayArray7298
						[i_80_][i_81_]
						[anIntArray6501[i_80_]]));
		    }
		}
		class89.method1928(i_77_);
		synchronized (aClass129_6513) {
		    aClass129_6513.put(class89, l);
		}
	    } else
		return null;
	}
	if (null == class409)
	    return class89;
	class89 = class89.method2019((byte) 4, i_77_, true);
	class409.method7357(class89, 0, (byte) -86);
	return class89;
    }
    
    public void method11214(int i, int i_82_, Class350 class350) {
	int i_83_ = anIntArray6500[i];
	if (class350.method6244(i_82_, -477531915) != null) {
	    ((Class490) this).anIntArray6509[i_83_] = i_82_ | ~0x7fffffff;
	    method11206((byte) 71);
	}
    }
    
    public void method11215(int i, int i_84_, Class350 class350) {
	int i_85_ = anIntArray6500[i];
	if (class350.method6244(i_84_, -1789499306) != null) {
	    ((Class490) this).anIntArray6509[i_85_] = i_84_ | ~0x7fffffff;
	    method11206((byte) 108);
	}
    }
    
    public void method11216(int i, int i_86_, ItemDefinitionLoader class618, int i_87_) {
	if (-1 == i_86_)
	    ((Class490) this).anIntArray6509[i] = 0;
	else if (class618.list(i_86_, (short) 12611) != null) {
	    ((Class490) this).anIntArray6509[i] = i_86_ | 0x40000000;
	    method11206((byte) 84);
	}
    }
    
    public void method11217(int i, int i_88_, Class350 class350) {
	int i_89_ = anIntArray6500[i];
	if (class350.method6244(i_88_, -2127304777) != null) {
	    ((Class490) this).anIntArray6509[i_89_] = i_88_ | ~0x7fffffff;
	    method11206((byte) 103);
	}
    }
    
    public void method11218(int i, int i_90_) {
	anIntArray6501[i] = i_90_;
	method11206((byte) 5);
    }
    
    public void method11219(boolean bool) {
	aBool6507 = bool;
	method11206((byte) 86);
    }
    
    public void method11220(int i, int i_91_, ItemDefinitionLoader class618) {
	if (-1 == i_91_)
	    ((Class490) this).anIntArray6509[i] = 0;
	else if (class618.list(i_91_, (short) 15915) != null) {
	    ((Class490) this).anIntArray6509[i] = i_91_ | 0x40000000;
	    method11206((byte) 6);
	}
    }
    
    public Class89 method11221(
    		Class103 class103, int i, Class539 class539, Class350 class350,
    		NPCDefinitionLoader class405, ItemDefinitionLoader class618, Interface13 interface13,
    		Interface11 interface11, Class409 class409, Class409 class409_92_,
    		Class409[] class409s, int[] is, int i_93_, boolean bool,
    		Class504 class504, int i_94_) {
		if (-1 != -614581637 * anInt6508)
		    return class405.getNpcDefinition(anInt6508 * -614581637, -695342434)
				.method7160
			    (class103, i, class539, interface13, interface11, class409,
			     class409_92_, class409s, is, i_93_, null, (byte) 105);
		int i_95_ = i;
		long l = -8561193760609408777L * ((Class490) this).aLong6503;
		int[] is_96_ = ((Class490) this).anIntArray6509;
		boolean bool_97_ = false;
		boolean bool_98_ = false;
		if (null != class409) {
		    AnimationDefinition class549 = class409.method7345((byte) 33);
		    if (null != class549
			&& (2118549971 * class549.anInt7077 >= 0
			    || -1074722755 * class549.itemInHand >= 0)) {
			is_96_ = new int[((Class490) this).anIntArray6509.length];
			for (int i_99_ = 0; i_99_ < is_96_.length; i_99_++)
			    is_96_[i_99_] = ((Class490) this).anIntArray6509[i_99_];
			if (2118549971 * class549.anInt7077 >= 0
			    && -1 != class504.anInt6627 * -693450691) {
			    bool_97_ = true;
			    if (2118549971 * class549.anInt7077 == 65535) {
				is_96_[class504.anInt6627 * -693450691] = 0;
				for (int i_100_ = 0;
				     i_100_ < class504.anIntArray6628.length; i_100_++)
				    is_96_[class504.anIntArray6628[i_100_]] = 0;
				l ^= ~0xffffffffL;
			    } else {
				is_96_[-693450691 * class504.anInt6627]
				    = class549.anInt7077 * 2118549971 | 0x40000000;
				for (int i_101_ = 0;
				     i_101_ < class504.anIntArray6628.length; i_101_++)
				    is_96_[class504.anIntArray6628[i_101_]] = 0;
				l ^= ((long) is_96_[-693450691 * class504.anInt6627]
				      << 32);
			    }
			}
			if (-1074722755 * class549.itemInHand >= 0
			    && -1 != class504.anInt6631 * -1130705117) {
			    bool_98_ = true;
			    if (65535 == class549.itemInHand * -1074722755) {
				is_96_[class504.anInt6631 * -1130705117] = 0;
				for (int i_102_ = 0;
				     i_102_ < class504.anIntArray6633.length; i_102_++)
				    is_96_[class504.anIntArray6633[i_102_]] = 0;
				l ^= 0xffffffffL;
			    } else {
				is_96_[class504.anInt6631 * -1130705117]
				    = -1074722755 * class549.itemInHand | 0x40000000;
				for (int i_103_ = 0;
				     i_103_ < class504.anIntArray6633.length; i_103_++)
				    is_96_[class504.anIntArray6633[i_103_]] = 0;
				l ^= (long) is_96_[class504.anInt6631 * -1130705117];
			    }
			}
		    }
		}
		boolean bool_104_ = false;
		int i_105_ = class409s != null ? class409s.length : 0;
		for (int i_106_ = 0; i_106_ < i_105_; i_106_++) {
		    if (null != class409s[i_106_]) {
			i_95_ |= class409s[i_106_].method7356(1466154128);
			bool_104_ = true;
		    }
		}
		if (class409 != null) {
		    i_95_ |= class409.method7356(-447929343);
		    bool_104_ = true;
		}
		if (null != class409_92_) {
		    i_95_ |= class409_92_.method7356(-334084693);
		    bool_104_ = true;
		}
		boolean bool_107_ = false;
		if (is != null) {
		    for (int i_108_ = 0; i_108_ < is.length; i_108_++) {
			if (is[i_108_] != -1) {
			    i_95_ |= 0x20;
			    bool_107_ = true;
			}
		    }
		}
		Class89 class89;
		synchronized (aClass129_6512) {
		    class89 = (Class89) aClass129_6512.get(l);
		}
		Class554 class554 = null;
		if (-1 != ((Class490) this).anInt6506 * 1868674289)
		    class554 = class539.method11908((1868674289
						     * ((Class490) this).anInt6506),
						    -1583013094);
		if (class89 == null
		    || class103.method2301(class89.method1866(), i_95_) != 0) {
		    if (null != class89)
			i_95_ = class103.method2302(i_95_, class89.method1866());
		    int i_109_ = i_95_;
		    boolean bool_110_ = false;
		    for (int i_111_ = 0; i_111_ < is_96_.length; i_111_++) {
			int i_112_ = is_96_[i_111_];
			Class604 class604 = null;
			boolean bool_113_ = false;
			if (bool_97_) {
			    if (i_111_ == class504.anInt6627 * -693450691)
				bool_113_ = true;
			    else {
				for (int i_114_ = 0;
				     i_114_ < class504.anIntArray6628.length;
				     i_114_++) {
				    if (class504.anIntArray6628[i_114_] == i_111_) {
					bool_113_ = true;
					break;
				    }
				}
			    }
			}
			if (bool_98_) {
			    if (class504.anInt6631 * -1130705117 == i_111_)
				bool_113_ = true;
			    else {
				for (int i_115_ = 0;
				     i_115_ < class504.anIntArray6633.length;
				     i_115_++) {
				    if (class504.anIntArray6633[i_115_] == i_111_) {
					bool_113_ = true;
					break;
				    }
				}
			    }
			}
			if (0 != (i_112_ & 0x40000000)) {
			    if (!bool_113_
				&& null != ((Class490) this).aClass604Array6504
				&& (((Class490) this).aClass604Array6504[i_111_]
				    != null))
				class604
				    = ((Class490) this).aClass604Array6504[i_111_];
			    if (!class618.list
				     (i_112_ & 0x3fffffff, (short) 19070)
				     .method13374(aBool6507, class604, (byte) 1))
				bool_110_ = true;
			} else if ((i_112_ & ~0x7fffffff) != 0
				   && !class350.method6244
					   (i_112_ & 0x3fffffff, -1401356131)
					   .method6652(-634752050))
			    bool_110_ = true;
		    }
		    if (bool_110_) {
			if (-1L
			    != 6130168555163744417L * ((Class490) this).aLong6505) {
			    synchronized (aClass129_6512) {
				class89 = (Class89) (aClass129_6512.get
						     (((Class490) this).aLong6505
						      * 6130168555163744417L));
			    }
			}
			if (class89 == null
			    || class103.method2301(class89.method1866(), i_95_) != 0)
			    return null;
		    } else {
			Class161[] class161s = new Class161[is_96_.length];
			for (int i_116_ = 0; i_116_ < is_96_.length; i_116_++) {
			    int i_117_ = is_96_[i_116_];
			    Class604 class604 = null;
			    boolean bool_118_
				= 5 == i_116_ && bool_97_ || i_116_ == 3 && bool_98_;
			    if (0 != (i_117_ & 0x40000000)) {
				if (!bool_118_
				    && null != ((Class490) this).aClass604Array6504
				    && (((Class490) this).aClass604Array6504[i_116_]
					!= null))
				    class604
					= ((Class490) this).aClass604Array6504[i_116_];
				Class161 class161
				    = (class618.list
					   (i_117_ & 0x3fffffff, (short) 18233)
					   .method13375
				       (aBool6507, class604, -1461671628));
				if (class161 != null)
				    class161s[i_116_] = class161;
			    } else if (0 != (i_117_ & ~0x7fffffff)) {
				Class161 class161
				    = class350.method6244
					  (i_117_ & 0x3fffffff, -150317260)
					  .method6638(2071328586);
				if (null != class161)
				    class161s[i_116_] = class161;
			    }
			}
			if (class554 != null && null != class554.anIntArrayArray7231) {
			    for (int i_119_ = 0;
				 i_119_ < class554.anIntArrayArray7231.length;
				 i_119_++) {
				if (class161s[i_119_] != null) {
				    int i_120_ = 0;
				    int i_121_ = 0;
				    int i_122_ = 0;
				    int i_123_ = 0;
				    int i_124_ = 0;
				    int i_125_ = 0;
				    if (class554.anIntArrayArray7231[i_119_] != null) {
					i_120_
					    = class554.anIntArrayArray7231[i_119_][0];
					i_121_
					    = class554.anIntArrayArray7231[i_119_][1];
					i_122_
					    = class554.anIntArrayArray7231[i_119_][2];
					i_123_
					    = (class554.anIntArrayArray7231[i_119_][3]
					       << 3);
					i_124_
					    = (class554.anIntArrayArray7231[i_119_][4]
					       << 3);
					i_125_
					    = (class554.anIntArrayArray7231[i_119_][5]
					       << 3);
				    }
				    if (0 != i_123_ || i_124_ != 0 || 0 != i_125_)
					class161s[i_119_].method3489(i_123_, i_124_,
								     i_125_);
				    if (i_120_ != 0 || i_121_ != 0 || 0 != i_122_)
					class161s[i_119_].method3459(i_120_, i_121_,
								     i_122_);
				}
			    }
			}
			Class161 class161 = new Class161(class161s, class161s.length);
			i_109_ |= 0x4000;
			class89 = class103.method2356(class161, i_109_,
						      -1976761445 * (Class380_Sub3_Sub2
								     .anInt10661),
						      64, 850);
			for (int i_126_ = 0; i_126_ < 10; i_126_++) {
			    for (int i_127_ = 0;
				 i_127_ < Class558.aShortArrayArray7261[i_126_].length;
				 i_127_++) {
				if (anIntArray6501[i_126_]
				    < (Class561.aShortArrayArrayArray7298[i_126_]
				       [i_127_]).length)
				    class89.method1908((Class558.aShortArrayArray7261
							[i_126_][i_127_]),
						       (Class561
							.aShortArrayArrayArray7298
							[i_126_][i_127_]
							[anIntArray6501[i_126_]]));
			    }
			}
			class89.method1922();
			if (bool) {
			    class89.method1928(i_95_);
			    synchronized (aClass129_6512) {
				aClass129_6512.put(class89, l);
			    }
			    ((Class490) this).aLong6505 = 6937002535259073377L * l;
			}
		    }
		}
		Class89 class89_128_ = class89.method2019((byte) 4, i_95_, true);
		if (!bool_104_ && !bool_107_)
		    return class89_128_;
		Class266[] class266s = null;
		if (class554 != null)
		    class266s = class554.method12258((byte) -53);
		if (bool_107_ && null != class266s) {
		    for (int i_129_ = 0; i_129_ < is.length; i_129_++) {
			if (class266s[i_129_] != null)
			    class89_128_.method1857(class266s[i_129_], 1 << i_129_,
						    true);
		    }
		}
		int i_130_ = 0;
		int i_131_ = 1;
		while (i_130_ < i_105_) {
		    if (null != class409s[i_130_])
			class409s[i_130_].method7358(class89_128_, 0, i_131_,
						     -224926300);
		    i_130_++;
		    i_131_ <<= 1;
		}
		if (bool_107_) {
		    for (i_130_ = 0; i_130_ < is.length; i_130_++) {
			if (is[i_130_] != -1) {
			    i_131_ = is[i_130_] - i_93_;
			    i_131_ &= 0x3fff;
			    Class266 class266 = new Class266();
			    class266.method5125(0.0F, 1.0F, 0.0F,
						Class282.method5490(i_131_));
			    class89_128_.method1857(class266, 1 << i_130_, false);
			}
		    }
		}
		if (bool_107_ && null != class266s) {
		    for (i_130_ = 0; i_130_ < is.length; i_130_++) {
			if (null != class266s[i_130_])
			    class89_128_.method1857(class266s[i_130_], 1 << i_130_,
						    false);
		    }
		}
		if (null != class409 && class409_92_ != null)
		    Class117.method2931(class89_128_, class409, class409_92_,
					-1720752753);
		else if (class409 != null)
		    class409.method7357(class89_128_, 0, (byte) -17);
		else if (class409_92_ != null)
		    class409_92_.method7357(class89_128_, 0, (byte) -105);
		return class89_128_;
    }
    
    public void method11222(int i, int i_132_, ItemDefinitionLoader class618) {
	if (-1 == i_132_)
	    ((Class490) this).anIntArray6509[i] = 0;
	else if (class618.list(i_132_, (short) -28564) != null) {
	    ((Class490) this).anIntArray6509[i] = i_132_ | 0x40000000;
	    method11206((byte) 121);
	}
    }
    
    public void method11223(int i, int i_133_, ItemDefinitionLoader class618) {
	if (-1 == i_133_)
	    ((Class490) this).anIntArray6509[i] = 0;
	else if (class618.list(i_133_, (short) 7163) != null) {
	    ((Class490) this).anIntArray6509[i] = i_133_ | 0x40000000;
	    method11206((byte) 102);
	}
    }
    
    public static void method11224(int i) {
	synchronized (aClass129_6512) {
	    aClass129_6512.clean(i, -2053564004);
	}
	synchronized (aClass129_6513) {
	    aClass129_6513.clean(i, -1987610519);
	}
    }
    
    public static void method11225(int i) {
	synchronized (aClass129_6512) {
	    aClass129_6512.clean(i, -2089230396);
	}
	synchronized (aClass129_6513) {
	    aClass129_6513.clean(i, -1989592857);
	}
    }
    
    public void method11226(int i, int[] is, Class604[] class604s,
			    int[] is_134_, boolean bool, int i_135_) {
	if (1868674289 * ((Class490) this).anInt6506 != i)
	    ((Class490) this).anInt6506 = i * 1807924241;
	((Class490) this).anIntArray6509 = is;
	((Class490) this).aClass604Array6504 = class604s;
	anIntArray6501 = is_134_;
	aBool6507 = bool;
	anInt6508 = i_135_ * -947219277;
	method11206((byte) 104);
    }
    
    void method11227() {
	long[] ls = RSByteBuffer.aLongArray8800;
	((Class490) this).aLong6503 = 1804695797121066809L;
	((Class490) this).aLong6503
	    = (-1804695797121066809L
	       * (((Class490) this).aLong6503 * -8561193760609408777L >>> 8
		  ^ ls[(int) (((((Class490) this).aLong6503
				* -8561193760609408777L)
			       ^ (long) ((((Class490) this).anInt6506
					  * 1868674289)
					 >> 8))
			      & 0xffL)]));
	((Class490) this).aLong6503
	    = (((Class490) this).aLong6503 * -8561193760609408777L >>> 8
	       ^ ls[(int) ((((Class490) this).aLong6503 * -8561193760609408777L
			    ^ (long) (1868674289
				      * ((Class490) this).anInt6506))
			   & 0xffL)]) * -1804695797121066809L;
	for (int i = 0; i < ((Class490) this).anIntArray6509.length; i++) {
	    ((Class490) this).aLong6503
		= (((Class490) this).aLong6503 * -8561193760609408777L >>> 8
		   ^ ls[(int) (((((Class490) this).aLong6503
				 * -8561193760609408777L)
				^ (long) (((Class490) this).anIntArray6509[i]
					  >> 24))
			       & 0xffL)]) * -1804695797121066809L;
	    ((Class490) this).aLong6503
		= (-1804695797121066809L
		   * (((Class490) this).aLong6503 * -8561193760609408777L >>> 8
		      ^ (ls
			 [(int) (((((Class490) this).aLong6503
				   * -8561193760609408777L)
				  ^ (long) (((Class490) this).anIntArray6509[i]
					    >> 16))
				 & 0xffL)])));
	    ((Class490) this).aLong6503
		= (-1804695797121066809L
		   * (-8561193760609408777L * ((Class490) this).aLong6503 >>> 8
		      ^ (ls
			 [(int) (((((Class490) this).aLong6503
				   * -8561193760609408777L)
				  ^ (long) (((Class490) this).anIntArray6509[i]
					    >> 8))
				 & 0xffL)])));
	    ((Class490) this).aLong6503
		= (-8561193760609408777L * ((Class490) this).aLong6503 >>> 8
		   ^ ls[(int) (((-8561193760609408777L
				 * ((Class490) this).aLong6503)
				^ (long) ((Class490) this).anIntArray6509[i])
			       & 0xffL)]) * -1804695797121066809L;
	}
	if (null != ((Class490) this).aClass604Array6504) {
	    for (int i = 0; i < ((Class490) this).aClass604Array6504.length;
		 i++) {
		if (null != ((Class490) this).aClass604Array6504[i]) {
		    int[] is;
		    int[] is_136_;
		    if (aBool6507) {
			is = (((Class490) this).aClass604Array6504[i]
			      .anIntArray7746);
			is_136_ = (((Class490) this).aClass604Array6504[i]
				   .anIntArray7743);
		    } else {
			is = (((Class490) this).aClass604Array6504[i]
			      .anIntArray7742);
			is_136_ = (((Class490) this).aClass604Array6504[i]
				   .anIntArray7747);
		    }
		    if (is != null) {
			for (int i_137_ = 0; i_137_ < is.length; i_137_++) {
			    ((Class490) this).aLong6503
				= (-1804695797121066809L
				   * ((-8561193760609408777L
				       * ((Class490) this).aLong6503) >>> 8
				      ^ ls[(int) (((-8561193760609408777L
						    * (((Class490) this)
						       .aLong6503))
						   ^ (long) (is[i_137_] >> 8))
						  & 0xffL)]));
			    ((Class490) this).aLong6503
				= (-1804695797121066809L
				   * ((-8561193760609408777L
				       * ((Class490) this).aLong6503) >>> 8
				      ^ ls[(int) (((((Class490) this).aLong6503
						    * -8561193760609408777L)
						   ^ (long) is[i_137_])
						  & 0xffL)]));
			}
		    }
		    if (is_136_ != null) {
			for (int i_138_ = 0; i_138_ < is_136_.length;
			     i_138_++) {
			    ((Class490) this).aLong6503
				= (((-8561193760609408777L
				     * ((Class490) this).aLong6503) >>> 8
				    ^ ls[(int) (((((Class490) this).aLong6503
						  * -8561193760609408777L)
						 ^ (long) (is_136_[i_138_]
							   >> 8))
						& 0xffL)])
				   * -1804695797121066809L);
			    ((Class490) this).aLong6503
				= (((((Class490) this).aLong6503
				     * -8561193760609408777L) >>> 8
				    ^ ls[(int) (((((Class490) this).aLong6503
						  * -8561193760609408777L)
						 ^ (long) is_136_[i_138_])
						& 0xffL)])
				   * -1804695797121066809L);
			}
		    }
		    if (null != (((Class490) this).aClass604Array6504[i]
				 .aShortArray7749)) {
			for (int i_139_ = 0;
			     i_139_ < (((Class490) this).aClass604Array6504[i]
				       .aShortArray7749).length;
			     i_139_++) {
			    ((Class490) this).aLong6503
				= (-1804695797121066809L
				   * ((((Class490) this).aLong6503
				       * -8561193760609408777L) >>> 8
				      ^ (ls
					 [(int) (((-8561193760609408777L
						   * (((Class490) this)
						      .aLong6503))
						  ^ (long) ((((Class490) this)
							     .aClass604Array6504
							     [i]
							     .aShortArray7749
							     [i_139_])
							    >> 8))
						 & 0xffL)])));
			    ((Class490) this).aLong6503
				= (((-8561193760609408777L
				     * ((Class490) this).aLong6503) >>> 8
				    ^ (ls
				       [(int) (((-8561193760609408777L
						 * ((Class490) this).aLong6503)
						^ (long) (((Class490) this)
							  .aClass604Array6504
							  [i].aShortArray7749
							  [i_139_]))
					       & 0xffL)]))
				   * -1804695797121066809L);
			}
		    }
		    if (null != (((Class490) this).aClass604Array6504[i]
				 .aShortArray7750)) {
			for (int i_140_ = 0;
			     i_140_ < (((Class490) this).aClass604Array6504[i]
				       .aShortArray7750).length;
			     i_140_++) {
			    ((Class490) this).aLong6503
				= (-1804695797121066809L
				   * ((((Class490) this).aLong6503
				       * -8561193760609408777L) >>> 8
				      ^ (ls
					 [(int) (((-8561193760609408777L
						   * (((Class490) this)
						      .aLong6503))
						  ^ (long) ((((Class490) this)
							     .aClass604Array6504
							     [i]
							     .aShortArray7750
							     [i_140_])
							    >> 8))
						 & 0xffL)])));
			    ((Class490) this).aLong6503
				= (((((Class490) this).aLong6503
				     * -8561193760609408777L) >>> 8
				    ^ (ls
				       [(int) (((-8561193760609408777L
						 * ((Class490) this).aLong6503)
						^ (long) (((Class490) this)
							  .aClass604Array6504
							  [i].aShortArray7750
							  [i_140_]))
					       & 0xffL)]))
				   * -1804695797121066809L);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 10; i++)
	    ((Class490) this).aLong6503
		= (-1804695797121066809L
		   * (-8561193760609408777L * ((Class490) this).aLong6503 >>> 8
		      ^ ls[(int) (((((Class490) this).aLong6503
				    * -8561193760609408777L)
				   ^ (long) anIntArray6501[i])
				  & 0xffL)]));
	((Class490) this).aLong6503
	    = (((Class490) this).aLong6503 * -8561193760609408777L >>> 8
	       ^ ls[(int) ((((Class490) this).aLong6503 * -8561193760609408777L
			    ^ (long) (aBool6507 ? 1 : 0))
			   & 0xffL)]) * -1804695797121066809L;
    }
    
    public static void method11228() {
	synchronized (aClass129_6512) {
	    aClass129_6512.reset(320632945);
	}
	synchronized (aClass129_6513) {
	    aClass129_6513.reset(-1588923255);
	}
    }
    
    public static void method11229(int i) {
	synchronized (aClass129_6512) {
	    aClass129_6512.clean(i, -2120088181);
	}
	synchronized (aClass129_6513) {
	    aClass129_6513.clean(i, -2053721171);
	}
    }
    
    public static void method11230(int i) {
	synchronized (aClass129_6512) {
	    aClass129_6512.clean(i, -2127762268);
	}
	synchronized (aClass129_6513) {
	    aClass129_6513.clean(i, -2049586785);
	}
    }
    
    public void method11231(int i, int i_141_, ItemDefinitionLoader class618) {
	if (-1 == i_141_)
	    ((Class490) this).anIntArray6509[i] = 0;
	else if (class618.list(i_141_, (short) 2847) != null) {
	    ((Class490) this).anIntArray6509[i] = i_141_ | 0x40000000;
	    method11206((byte) 27);
	}
    }
    
    public void method11232(int i, int[] is, Class604[] class604s,
			    int[] is_142_, boolean bool, int i_143_) {
	if (1868674289 * ((Class490) this).anInt6506 != i)
	    ((Class490) this).anInt6506 = i * 1807924241;
	((Class490) this).anIntArray6509 = is;
	((Class490) this).aClass604Array6504 = class604s;
	anIntArray6501 = is_142_;
	aBool6507 = bool;
	anInt6508 = i_143_ * -947219277;
	method11206((byte) 126);
    }
    
    public static void method11233() {
	synchronized (aClass129_6512) {
	    aClass129_6512.reset(-525726788);
	}
	synchronized (aClass129_6513) {
	    aClass129_6513.reset(37218827);
	}
    }
    
    public static boolean method11234(int i, int i_144_, byte i_145_) {
	if (null == Class483.aClass393_6461
	    || Class483.aClass393_6461.method7032(1799214701) == null)
	    return false;
	if (i == i_144_)
	    return true;
	Class322 class322 = Class483.aClass393_6461.method7032(1618318787)
				.method5858(i, (byte) 0);
	Class322 class322_146_ = Class483.aClass393_6461.method7032
				     (458386382).method5858(i_144_, (byte) 0);
	Class322 class322_147_ = class322;
    while_75_:
	do {
	    do {
		if (null == class322_147_)
		    break while_75_;
		class322_147_ = class322_147_.method5939(1928653732);
		if (class322_146_ == class322_147_)
		    return true;
	    } while (class322 != class322_147_);
	    return false;
	} while (false);
	class322_147_ = class322_146_;
    while_76_:
	do {
	    do {
		if (null == class322_147_)
		    break while_76_;
		class322_147_ = class322_147_.method5939(1883815751);
		if (class322 == class322_147_)
		    return true;
	    } while (class322_147_ != class322_146_);
	    return false;
	} while (false);
	return false;
    }
    
    static final void method11235(ClientScriptData class454, byte i) {
	int i_148_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_148_, (byte) -2);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_148_ >> 16];
	Class477.method10924(class58, class35, class454, (byte) 120);
    }
    
    static final void getBitValue/*method11236*/(ClientScriptData scriptData, byte i) {
    	scriptData.intStackPointer -= -821458770;
		int value = scriptData.integerStack[1482319719 * scriptData.intStackPointer];
		int bit = scriptData.integerStack[scriptData.intStackPointer * 1482319719 + 1];
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = 0 != (value & 1 << bit) ? 1 : 0;
    }
    
    static final void method11237(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class21.myPlayer.method17801
		  (2119290027).method11702((byte) 32);
    }
    
    static int method11238
	(Player class475_sub1_sub1_sub3_sub1, int i) {
	int i_151_ = 446821985 * class475_sub1_sub1_sub3_sub1.anInt11505;
	Class554 class554
	    = class475_sub1_sub1_sub3_sub1.method17787(1843715196);
	int i_152_ = class475_sub1_sub1_sub3_sub1.aClass409_Sub1_11405
			 .method7346(-619542907);
	if (-1 == i_152_
	    || class475_sub1_sub1_sub3_sub1.aClass409_Sub1_11405.aBool8600)
	    i_151_ = -196777165 * class475_sub1_sub1_sub3_sub1.anInt11509;
	else if (i_152_ == class554.anInt7213 * -1503148783
		 || class554.anInt7214 * 1122571643 == i_152_
		 || i_152_ == class554.anInt7226 * -1591850491
		 || -526852481 * class554.anInt7215 == i_152_)
	    i_151_ = 869941981 * class475_sub1_sub1_sub3_sub1.anInt11512;
	else if (i_152_ == -504629317 * class554.anInt7217
		 || i_152_ == class554.anInt7216 * 62833745
		 || class554.anInt7220 * 2130754419 == i_152_
		 || i_152_ == -216997439 * class554.anInt7212)
	    i_151_ = class475_sub1_sub1_sub3_sub1.anInt11510 * -405630403;
	return i_151_;
    }
    
    public static Class241_Sub24_Sub1 method11239
	(int i, int i_153_, int i_154_, int i_155_, int i_156_) {
	synchronized (Class241_Sub24_Sub1.aClass241_Sub24_Sub1Array10780) {
	    Class241_Sub24_Sub1 class241_sub24_sub1;
	    if (-2086892939 * Class488.anInt6483 == 0)
		class241_sub24_sub1 = new Class241_Sub24_Sub1();
	    else
		class241_sub24_sub1
		    = (Class241_Sub24_Sub1.aClass241_Sub24_Sub1Array10780
		       [(Class488.anInt6483 -= 1470199261) * -2086892939]);
	    ((Class241_Sub24_Sub1) class241_sub24_sub1).xCoordinate
		= 850681963 * i;
	    ((Class241_Sub24_Sub1) class241_sub24_sub1).yCoordinate
		= i_153_ * -1756179103;
	    ((Class241_Sub24_Sub1) class241_sub24_sub1).anInt10751
		= i_154_ * -1713280661;
	    ((Class241_Sub24_Sub1) class241_sub24_sub1).anInt10757
		= -1914432953 * i_155_;
	    ((Class241_Sub24_Sub1) class241_sub24_sub1).aLong10783
		= Class50.method1249((byte) 1) * -1217558828804291409L;
	    Class241_Sub24_Sub1 class241_sub24_sub1_157_ = class241_sub24_sub1;
	    return class241_sub24_sub1_157_;
	}
    }
}
