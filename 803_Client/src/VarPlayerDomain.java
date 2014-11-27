/* Class517 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class VarPlayerDomain implements VarDomain
{
    HashTable aClass407_6777 = new HashTable(128);
    static final long aLong6778 = 4611686018427387904L;
    static final long aLong6779 = 4611686018427387903L;
    static final long aLong6780 = 1L;
    int[] anIntArray6781 = new int[Class177.VAR_PLAYER_LIST.length(1766317249)];
    int[] anIntArray6782 = new int[Class177.VAR_PLAYER_LIST.length(1766317249)];
    static final long aLong6783 = 500L;
    public static Language currentLocale;//aClass437_6784
    
    public int dummyMethod67(VarType class179) {
    	return (anIntArray6782[class179.id * 414229387]);
    }
    
    public void dummyMethod76(VarBitType class316, int i) {
	try {
	    int i_0_
		= class316.setVarbitValue((anIntArray6782
				       [414229387 * (class316.baseVar
						     .id)]),
				      i, (byte) 47);
	    setVarValueInt(class316.baseVar, i_0_, -1919827805);
	} catch (VarBitOverflowException exception_sub1) {
	    /* empty */
	}
    }
    
    public void method11638(short i) {
		for (int index = 0; index < Class177.VAR_PLAYER_LIST.length(1766317249); index++) {
		    VarPlayerType class179_sub2 = ((VarPlayerType) Class177.VAR_PLAYER_LIST.list(index, -1716699266));
		    if (class179_sub2 != null) {
				anIntArray6781[index] = 0;
				anIntArray6782[index] = 0;
		    }
		}
		aClass407_6777 = new HashTable(128);
    }
    
    public int getVarValueInt(VarType class179, int i) {
    	return anIntArray6782[class179.id * 414229387];
    }
    
    public void setVarValueInt(VarType class179, int i, int i_2_) {
		anIntArray6782[414229387 * class179.id] = i;
		LongNode class241_sub28 = ((LongNode) aClass407_6777.get((long) (414229387 * class179.id)));
		if (class241_sub28 != null) {
		    class241_sub28.longValue = ((Class50.method1249((byte) 1) + 500L) * -6855925735381116717L);
		} else {
		    class241_sub28 = new LongNode(Class50.method1249((byte) 1) + 500L);
		    aClass407_6777.put(class241_sub28, (long) (414229387 * class179.id));
		}
    }
    
    public long method85(VarType class179) {
    	throw new UnsupportedOperationException();
    }
    
    public void dummyMethod83(VarType class179, int i) {
	anIntArray6782[414229387 * class179.id] = i;
	LongNode class241_sub28
	    = ((LongNode)
	       aClass407_6777
		   .get((long) (414229387 * class179.id)));
	if (class241_sub28 != null)
	    class241_sub28.longValue = ((Class50.method1249((byte) 1) + 500L)
					* -6855925735381116717L);
	else {
	    class241_sub28
		= new LongNode(Class50.method1249((byte) 1) + 500L);
	    aClass407_6777.put
		(class241_sub28, (long) (414229387 * class179.id));
	}
    }
    
    public void dummyMethod82(VarType class179, int i) {
	anIntArray6782[414229387 * class179.id] = i;
	LongNode class241_sub28
	    = ((LongNode)
	       aClass407_6777
		   .get((long) (414229387 * class179.id)));
	if (class241_sub28 != null)
	    class241_sub28.longValue = ((Class50.method1249((byte) 1) + 500L)
					* -6855925735381116717L);
	else {
	    class241_sub28
		= new LongNode(Class50.method1249((byte) 1) + 500L);
	    aClass407_6777.put
		(class241_sub28, (long) (414229387 * class179.id));
	}
    }
    
    public long getVarValueLong(VarType class179, byte i) {
    	throw new UnsupportedOperationException();
    }
    
    public int getVarBitValue(VarBitType class316, short i) {
	return class316.getVarbitValue((anIntArray6782
				    [(414229387
				      * class316.baseVar.id)]),
				   2073007763);
    }
    
    public Object getVarValue/*method77*/(VarType class179, int i) {
    	throw new UnsupportedOperationException();
    }
    
    public void setVarValue(VarType class179, Object object, byte i) {
	throw new UnsupportedOperationException();
    }
    
    public int dummyMethod72(VarBitType class316) {
	return class316.getVarbitValue((anIntArray6782
				    [(414229387
				      * class316.baseVar.id)]),
				   1141670885);
    }
    
    public int dummyMethod66(VarType class179) {
	return (anIntArray6782
		[class179.id * 414229387]);
    }
    
    public int method11639(boolean bool) {
	long l = Class50.method1249((byte) 1);
	for (LongNode class241_sub28
		 = ((LongNode)
		    (bool
		     ? aClass407_6777.method7294(2090894173)
		     : aClass407_6777
			   .method7295(2041463811)));
	     class241_sub28 != null;
	     class241_sub28 = (LongNode) ((VarPlayerDomain) this)
						   .aClass407_6777
						   .method7295(876070673)) {
	    if ((-1969238413959512229L * class241_sub28.longValue
		 & 0x3fffffffffffffffL)
		< l) {
		if ((-1969238413959512229L * class241_sub28.longValue
		     & 0x4000000000000000L)
		    != 0L) {
		    int i = (int) (4356572401218184725L
				   * class241_sub28.hashCode);
		    anIntArray6782[i]
			= anIntArray6781[i];
		    class241_sub28.remove((byte) 36);
		    return i;
		}
		class241_sub28.remove((byte) 36);
	    }
	}
	return -1;
    }
    
    public int dummyMethod70(VarType class179) {
	return (anIntArray6782
		[class179.id * 414229387]);
    }
    
    public int dummyMethod71(VarBitType class316) {
	return class316.getVarbitValue((anIntArray6782
				    [(414229387
				      * class316.baseVar.id)]),
				   1861256372);
    }
    
    public void method74(VarType class179, long l) {
    	throw new UnsupportedOperationException();
    }
    
    public int method11640(boolean bool, byte i) {
	long l = Class50.method1249((byte) 1);
	for (LongNode class241_sub28
		 = ((LongNode)
		    (bool
		     ? aClass407_6777.method7294(2090894173)
		     : aClass407_6777
			   .method7295(-294663132)));
	     class241_sub28 != null;
	     class241_sub28 = (LongNode) ((VarPlayerDomain) this)
						   .aClass407_6777
						   .method7295(1445569998)) {
	    if ((-1969238413959512229L * class241_sub28.longValue
		 & 0x3fffffffffffffffL)
		< l) {
		if ((-1969238413959512229L * class241_sub28.longValue
		     & 0x4000000000000000L)
		    != 0L) {
		    int i_3_ = (int) (4356572401218184725L
				      * class241_sub28.hashCode);
		    anIntArray6782[i_3_]
			= anIntArray6781[i_3_];
		    class241_sub28.remove((byte) 36);
		    return i_3_;
		}
		class241_sub28.remove((byte) 36);
	    }
	}
	return -1;
    }
    
    public void setVarValueLong(VarType class179, long l) {
	throw new UnsupportedOperationException();
    }
    
    public void dummyMethod84(VarType class179, int i) {
	anIntArray6782[414229387 * class179.id] = i;
	LongNode class241_sub28
	    = ((LongNode)
	       aClass407_6777
		   .get((long) (414229387 * class179.id)));
	if (class241_sub28 != null)
	    class241_sub28.longValue = ((Class50.method1249((byte) 1) + 500L)
					* -6855925735381116717L);
	else {
	    class241_sub28
		= new LongNode(Class50.method1249((byte) 1) + 500L);
	    aClass407_6777.put
		(class241_sub28, (long) (414229387 * class179.id));
	}
    }
    
    public void setVarp/*method11641*/(VarType key, int value, byte i_4_) {
		anIntArray6781[key.id * 414229387] = value;
		LongNode class241_sub28
		    = ((LongNode) aClass407_6777.get((long) (414229387 * key.id)));
		if (null != class241_sub28) {
		    if (-1969238413959512229L * class241_sub28.longValue != 4611686018427387905L)
			class241_sub28.longValue
			    = (Class50.method1249((byte) 1) + 500L
			       | 0x4000000000000000L) * -6855925735381116717L;
		} else {
		    class241_sub28 = new LongNode(4611686018427387905L);
		    aClass407_6777.put(class241_sub28, (long) (414229387 * key.id));
		}
    }
    
    public long method86(VarType class179) {
    	throw new UnsupportedOperationException();
    }
    
    public long method87(VarType class179) {
    	throw new UnsupportedOperationException();
    }
    
    public int dummyMethod65(VarType class179) {
    	return (anIntArray6782[class179.id * 414229387]);
    }
    
    public void setVarBit/*method11642*/(VarBitType key, int value, int i_5_) {
		try {
		    int fullValue = key.setVarbitValue(anIntArray6781[414229387 * (key.baseVar.id)], value, (byte) 61);
		    setVarp(key.baseVar, fullValue, (byte) 127);
		} catch (VarBitOverflowException exception_sub1) {
		    /* empty */
		}
    }
    
    public void method89(VarType class179, long l) {
	throw new UnsupportedOperationException();
    }
    
    public Object dummyMethod73(VarType class179) {
	throw new UnsupportedOperationException();
    }
    
    public void dummyMethod90(VarType class179, Object object) {
	throw new UnsupportedOperationException();
    }
    
    public void method91(VarBitType class316, int i) {
	try {
	    int i_7_
		= class316.setVarbitValue((anIntArray6782
				       [414229387 * (class316.baseVar
						     .id)]),
				      i, (byte) 85);
	    setVarValueInt(class316.baseVar, i_7_, 718396059);
	} catch (VarBitOverflowException exception_sub1) {
	    /* empty */
	}
    }
    
    public void method11643(VarBitType class316, int i) {
	try {
	    int i_8_
		= class316.setVarbitValue((anIntArray6781
				       [414229387 * (class316.baseVar
						     .id)]),
				      i, (byte) 18);
	    setVarp(class316.baseVar, i_8_, (byte) 127);
	} catch (VarBitOverflowException exception_sub1) {
	    /* empty */
	}
    }
    
    public int method11644(boolean bool) {
	long l = Class50.method1249((byte) 1);
	for (LongNode class241_sub28
		 = ((LongNode)
		    (bool
		     ? aClass407_6777.method7294(2090894173)
		     : aClass407_6777
			   .method7295(1711120485)));
	     class241_sub28 != null;
	     class241_sub28 = (LongNode) ((VarPlayerDomain) this)
						   .aClass407_6777
						   .method7295(249149379)) {
	    if ((-1969238413959512229L * class241_sub28.longValue
		 & 0x3fffffffffffffffL)
		< l) {
		if ((-1969238413959512229L * class241_sub28.longValue
		     & 0x4000000000000000L)
		    != 0L) {
		    int i = (int) (4356572401218184725L
				   * class241_sub28.hashCode);
		    anIntArray6782[i]
			= anIntArray6781[i];
		    class241_sub28.remove((byte) 36);
		    return i;
		}
		class241_sub28.remove((byte) 36);
	    }
	}
	return -1;
    }
    
    public void setVarBitValue(VarBitType class316, int i, int i_9_) {
		try {
		    int i_10_ = class316.setVarbitValue(anIntArray6782[414229387 * (class316.baseVar.id)], i, (byte) 34);
		    setVarValueInt(class316.baseVar, i_10_, -627040344);
		} catch (VarBitOverflowException exception_sub1) {
		    /* empty */
		}
    }
    
    public void method11645() {
	for (int i = 0;
	     i < Class177.VAR_PLAYER_LIST.length(1766317249);
	     i++) {
	    VarPlayerType class179_sub2
		= ((VarPlayerType)
		   Class177.VAR_PLAYER_LIST.list(i,
								 -1628470617));
	    if (class179_sub2 != null) {
		anIntArray6781[i] = 0;
		anIntArray6782[i] = 0;
	    }
	}
	aClass407_6777 = new HashTable(128);
    }
    
    public void method11646() {
	for (int i = 0;
	     i < Class177.VAR_PLAYER_LIST.length(1766317249);
	     i++) {
	    VarPlayerType class179_sub2
		= ((VarPlayerType)
		   Class177.VAR_PLAYER_LIST.list(i,
								 -1499019486));
	    if (class179_sub2 != null) {
		anIntArray6781[i] = 0;
		anIntArray6782[i] = 0;
	    }
	}
	aClass407_6777 = new HashTable(128);
    }
    
    public void method11647() {
	for (int i = 0;
	     i < Class177.VAR_PLAYER_LIST.length(1766317249);
	     i++) {
	    VarPlayerType class179_sub2
		= ((VarPlayerType)
		   Class177.VAR_PLAYER_LIST.list(i,
								 -2136306567));
	    if (class179_sub2 != null) {
		anIntArray6781[i] = 0;
		anIntArray6782[i] = 0;
	    }
	}
	aClass407_6777 = new HashTable(128);
    }
    
    public void method11648(VarType class179, int i) {
	anIntArray6781[class179.id * 414229387] = i;
	LongNode class241_sub28
	    = ((LongNode)
	       aClass407_6777
		   .get((long) (414229387 * class179.id)));
	if (null != class241_sub28) {
	    if (-1969238413959512229L * class241_sub28.longValue
		!= 4611686018427387905L)
		class241_sub28.longValue
		    = (Class50.method1249((byte) 1) + 500L
		       | 0x4000000000000000L) * -6855925735381116717L;
	} else {
	    class241_sub28 = new LongNode(4611686018427387905L);
	    aClass407_6777.put
		(class241_sub28, (long) (414229387 * class179.id));
	}
    }
    
    public void method11649(VarType class179, int i) {
	anIntArray6781[class179.id * 414229387] = i;
	LongNode class241_sub28
	    = ((LongNode)
	       aClass407_6777
		   .get((long) (414229387 * class179.id)));
	if (null != class241_sub28) {
	    if (-1969238413959512229L * class241_sub28.longValue
		!= 4611686018427387905L)
		class241_sub28.longValue
		    = (Class50.method1249((byte) 1) + 500L
		       | 0x4000000000000000L) * -6855925735381116717L;
	} else {
	    class241_sub28 = new LongNode(4611686018427387905L);
	    aClass407_6777.put
		(class241_sub28, (long) (414229387 * class179.id));
	}
    }
    
    public void method11650(VarBitType class316, int i) {
	try {
	    int i_11_
		= class316.setVarbitValue((anIntArray6781
				       [414229387 * (class316.baseVar
						     .id)]),
				      i, (byte) 36);
	    setVarp(class316.baseVar, i_11_, (byte) 127);
	} catch (VarBitOverflowException exception_sub1) {
	    /* empty */
	}
    }
    
    public void method88(VarType class179, long l) {
	throw new UnsupportedOperationException();
    }
    
    public static int method11651(int i, byte i_12_) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_13_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_14_ = (double) (i & 0xff) / 256.0;
	double d_15_ = d;
	if (d_13_ < d_15_)
	    d_15_ = d_13_;
	if (d_14_ < d_15_)
	    d_15_ = d_14_;
	double d_16_ = d;
	if (d_13_ > d_16_)
	    d_16_ = d_13_;
	if (d_14_ > d_16_)
	    d_16_ = d_14_;
	double d_17_ = 0.0;
	double d_18_ = 0.0;
	double d_19_ = (d_16_ + d_15_) / 2.0;
	if (d_15_ != d_16_) {
	    if (d_19_ < 0.5)
		d_18_ = (d_16_ - d_15_) / (d_15_ + d_16_);
	    if (d_19_ >= 0.5)
		d_18_ = (d_16_ - d_15_) / (2.0 - d_16_ - d_15_);
	    if (d == d_16_)
		d_17_ = (d_13_ - d_14_) / (d_16_ - d_15_);
	    else if (d_16_ == d_13_)
		d_17_ = 2.0 + (d_14_ - d) / (d_16_ - d_15_);
	    else if (d_16_ == d_14_)
		d_17_ = 4.0 + (d - d_13_) / (d_16_ - d_15_);
	}
	d_17_ /= 6.0;
	int i_20_ = (int) (d_17_ * 256.0);
	int i_21_ = (int) (d_18_ * 256.0);
	int i_22_ = (int) (d_19_ * 256.0);
	if (i_21_ < 0)
	    i_21_ = 0;
	else if (i_21_ > 255)
	    i_21_ = 255;
	if (i_22_ < 0)
	    i_22_ = 0;
	else if (i_22_ > 255)
	    i_22_ = 255;
	if (i_22_ > 243)
	    i_21_ >>= 4;
	else if (i_22_ > 217)
	    i_21_ >>= 3;
	else if (i_22_ > 192)
	    i_21_ >>= 2;
	else if (i_22_ > 179)
	    i_21_ >>= 1;
	return ((i_22_ >> 1)
		+ (((i_20_ & 0xff) >> 2 << 10) + (i_21_ >> 5 << 7)));
    }
    
    static final void method11652(ClientScriptData class454, int i) {
	throw new RuntimeException("");
    }
    
    static final void method11653(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub6_8872
		  .method14143(1932570551);
    }
    
    static final void method11654(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aBool8422 ? 1 : 0;
    }
    
    static final void method11655(ClientScriptData class454, int i) {
	long l = Class50.method1249((byte) 1);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) (l / 86400000L) - 11745;
    }
    
    static final void method11656(int i) {
	if (client.aFloat8406 < 1090.0F)
	    client.aFloat8406 = 1090.0F;
	if (client.aFloat8406 > 2879.0F)
	    client.aFloat8406 = 2879.0F;
	for (/**/; client.aFloat8581 >= 16384.0F;
	     client.aFloat8581 -= 16384.0F) {
	    /* empty */
	}
	for (/**/; client.aFloat8581 < 0.0F; client.aFloat8581 += 16384.0F) {
	    /* empty */
	}
	Class215 class215 = client.aClass238_8477.method4753((byte) -49);
	Class552 class552 = client.aClass238_8477.method4751(-1703872906);
	int i_23_ = 97141979 * Class291.anInt4488 >> 9;
	int i_24_ = 970310639 * Class354_Sub2.anInt10492 >> 9;
	int i_25_
	    = Class96_Sub5.method16046(97141979 * Class291.anInt4488,
				       Class354_Sub2.anInt10492 * 970310639,
				       Class357_Sub1.anInt10357 * 993680393,
				       744562769);
	int i_26_ = 0;
	if (i_23_ > 3 && i_24_ > 3
	    && i_23_ < client.aClass238_8477.method4744(-1504717815) - 4
	    && i_24_ < client.aClass238_8477.method4745(-6034979) - 4) {
	    for (int i_27_ = i_23_ - 4; i_27_ <= 4 + i_23_; i_27_++) {
		for (int i_28_ = i_24_ - 4; i_28_ <= i_24_ + 4; i_28_++) {
		    int i_29_ = Class357_Sub1.anInt10357 * 993680393;
		    if (i_29_ < 3
			&& class215.method4331(i_27_, i_28_, 91627344))
			i_29_++;
		    int i_30_ = 0;
		    byte[][] is
			= client.aClass238_8477.method4752(i_29_, -1529868783);
		    if (null != is)
			i_30_ = 8 * (is[i_27_][i_28_] & 0xff) << 2;
		    if (null != class552.aClass166Array7184
			&& null != class552.aClass166Array7184[i_29_]) {
			int i_31_
			    = (i_25_
			       - (class552.aClass166Array7184[i_29_]
				      .method3551(i_27_, i_28_, -2140336049)
				  - i_30_));
			if (i_31_ > i_26_)
			    i_26_ = i_31_;
		    }
		}
	    }
	}
	int i_32_ = (i_26_ >> 2) * 1536;
	if (i_32_ > 786432)
	    i_32_ = 786432;
	if (i_32_ < 262144)
	    i_32_ = 262144;
	if (i_32_ > client.anInt8542 * 56985941)
	    client.anInt8542
		+= (i_32_ - 56985941 * client.anInt8542) / 24 * 71183357;
	else if (i_32_ < 56985941 * client.anInt8542)
	    client.anInt8542
		+= 71183357 * ((i_32_ - 56985941 * client.anInt8542) / 80);
    }
}
