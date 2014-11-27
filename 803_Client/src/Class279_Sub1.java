/* Class279_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class279_Sub1 extends Class279
{
    int anInt10290;
    Class241_Sub39_Sub5 aClass241_Sub39_Sub5_10291;
    Class207 aClass207_10292;
    Class291 aClass291_10293;
    Class568 aClass568_10294;
    Class568 aClass568_10295;
    static final int anInt10296 = 0;
    int anInt10297;
    long aLong10298;
    int anInt10299;
    ReferenceTable aClass286_10300;
    static final byte aByte10301 = 0;
    static final byte aByte10302 = 1;
    Class209 aClass209_10303;
    int anInt10304 = 0;
    boolean aBool10305;
    HashTable aClass407_10306 = new HashTable(16);
    static final byte aByte10307 = -1;
    boolean aBool10308;
    byte[] aByteArray10309;
    int anInt10310 = 0;
    NodeCollection aClass429_10311;
    NodeCollection aClass429_10312 = new NodeCollection();
    boolean aBool10313;
    boolean aBool10314;
    byte[] aByteArray10315;
    static final int anInt10316 = 250;
    static CRC32 aCRC32_10317 = new CRC32();
    static final int anInt10318 = 1000;
    static final int anInt10319 = 1;
    static final int anInt10320 = 2;
    
    boolean method16597(byte i) {
	return null != ((Class279_Sub1) this).aClass207_10292;
    }
    
    public int method16598() {
	if (null == ((Class279_Sub1) this).aClass286_10300)
	    return 0;
	return 522206277 * (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryCount);
    }
    
    public int method16599() {
	if (((Class279_Sub1) this).aClass286_10300 == null)
	    return 0;
	if (!((Class279_Sub1) this).aBool10314)
	    return (522206277
		    * (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryCount));
	Node class241
	    = ((Class279_Sub1) this).aClass429_10311.method7694(16711935);
	if (null == class241)
	    return 0;
	return (int) (class241.hashCode * 4356572401218184725L);
    }
    
    public int method16600(int i) {
	if (method5458(-2064113656) == null) {
	    if (null == ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291)
		return 0;
	    return ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
		       .method17109(16711935);
	}
	return 100;
    }
    
    ReferenceTable method5458(int i) {
	if (null != ((Class279_Sub1) this).aClass286_10300)
	    return ((Class279_Sub1) this).aClass286_10300;
	if (((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 == null) {
	    if (((Class279_Sub1) this).aClass209_10303.method4141(338137818))
		return null;
	    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
		= (((Class279_Sub1) this).aClass209_10303.method4139
		   (255, 1785130223 * ((Class279_Sub1) this).anInt10290,
		    (byte) 0, true, (byte) 84));
	}
	if (((Class241_Sub39_Sub5)
	     ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291)
	    .aBool10839)
	    return null;
	byte[] is = ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
			.method17108(-510488418);
	if (((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
	    instanceof Class241_Sub39_Sub5_Sub1) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		((Class279_Sub1) this).aClass286_10300
		    = new ReferenceTable(is,
				   (1755530243
				    * ((Class279_Sub1) this).anInt10297),
				   ((Class279_Sub1) this).aByteArray10309);
		if (1122249127 * ((ReferenceTable) (((Class279_Sub1) this)
					      .aClass286_10300)).version
		    != ((Class279_Sub1) this).anInt10299 * 1141430379)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		((Class279_Sub1) this).aClass286_10300 = null;
		if (((Class279_Sub1) this).aClass209_10303
			.method4141(412208095))
		    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 = null;
		else
		    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (255,
			    ((Class279_Sub1) this).anInt10290 * 1785130223,
			    (byte) 0, true, (byte) 89));
		return null;
	    }
	} else {
	    try {
		if (null == is)
		    throw new RuntimeException();
		((Class279_Sub1) this).aClass286_10300
		    = new ReferenceTable(is,
				   (1755530243
				    * ((Class279_Sub1) this).anInt10297),
				   ((Class279_Sub1) this).aByteArray10309);
	    } catch (RuntimeException runtimeexception) {
		((Class279_Sub1) this).aClass209_10303.method4143
		    (255, ((Class279_Sub1) this).anInt10290 * 1785130223,
		     2057847036);
		((Class279_Sub1) this).aClass286_10300 = null;
		if (((Class279_Sub1) this).aClass209_10303
			.method4141(-723068028))
		    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 = null;
		else
		    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (255,
			    ((Class279_Sub1) this).anInt10290 * 1785130223,
			    (byte) 0, true, (byte) 73));
		return null;
	    }
	    if (((Class279_Sub1) this).aClass568_10295 != null)
		((Class279_Sub1) this).aClass291_10293.method5667
		    (((Class279_Sub1) this).anInt10290 * 1785130223, is,
		     ((Class279_Sub1) this).aClass568_10295, 985457225);
	}
	((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 = null;
	if (null != ((Class279_Sub1) this).aClass568_10294) {
	    ((Class279_Sub1) this).aByteArray10315
		= new byte[(((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .indexCount) * -546788063];
	    ((Class279_Sub1) this).anInt10304 = 0;
	}
	return ((Class279_Sub1) this).aClass286_10300;
    }
    
    byte[] method5457(int i, int i_0_) {
	Class241_Sub39_Sub5 class241_sub39_sub5
	    = method16601(i, 0, -1946789914);
	if (null == class241_sub39_sub5)
	    return null;
	byte[] is = class241_sub39_sub5.method17108(-510488418);
	class241_sub39_sub5.remove((byte) 36);
	return is;
    }
    
    Class241_Sub39_Sub5 method16601(int i, int i_1_, int i_2_) {
	Class241_Sub39_Sub5 class241_sub39_sub5
	    = ((Class241_Sub39_Sub5)
	       ((Class279_Sub1) this).aClass407_10306.get((long) i));
	if (class241_sub39_sub5 != null && 0 == i_1_
	    && !((Class241_Sub39_Sub5) class241_sub39_sub5).urgent
	    && ((Class241_Sub39_Sub5) class241_sub39_sub5).aBool10839) {
	    class241_sub39_sub5.remove((byte) 36);
	    class241_sub39_sub5 = null;
	}
	if (class241_sub39_sub5 == null) {
	    if (i_1_ == 0) {
		if (null != ((Class279_Sub1) this).aClass568_10294
		    && -1 != ((Class279_Sub1) this).aByteArray10315[i])
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass291_10293.method5666
			   (i, ((Class279_Sub1) this).aClass568_10294,
			    -83429673));
		else if (null != ((Class279_Sub1) this).aClass207_10292) {
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass207_10292.method4101
			   (((Class279_Sub1) this).anInt10290 * 1785130223, i,
			    (byte) 2, true,
			    ((ReferenceTable) (((Class279_Sub1) this)
					 .aClass286_10300)).entryCrcs[i],
			    ((ReferenceTable) (((Class279_Sub1) this)
					 .aClass286_10300)).entryVersions[i],
			    (byte) 11));
		    if (null == class241_sub39_sub5)
			return null;
		} else if (!((Class279_Sub1) this).aClass209_10303
				.method4141(-742272899))
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (((Class279_Sub1) this).anInt10290 * 1785130223, i,
			    (byte) 2, true, (byte) 108));
		else
		    return null;
	    } else if (1 == i_1_) {
		if (((Class279_Sub1) this).aClass568_10294 == null)
		    throw new RuntimeException();
		class241_sub39_sub5
		    = (((Class279_Sub1) this).aClass291_10293.method5665
		       (i, ((Class279_Sub1) this).aClass568_10294, (byte) 88));
	    } else if (2 == i_1_) {
		if (null == ((Class279_Sub1) this).aClass568_10294)
		    throw new RuntimeException();
		if (((Class279_Sub1) this).aByteArray10315[i] != -1)
		    throw new RuntimeException();
		if (null != ((Class279_Sub1) this).aClass207_10292)
		    return null;
		if (!((Class279_Sub1) this).aClass209_10303
			 .method4149(16777215))
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (((Class279_Sub1) this).anInt10290 * 1785130223, i,
			    (byte) 2, false, (byte) 126));
		else
		    return null;
	    } else
		throw new RuntimeException();
	    ((Class279_Sub1) this).aClass407_10306
		.put(class241_sub39_sub5, (long) i);
	}
	if (((Class241_Sub39_Sub5) class241_sub39_sub5).aBool10839)
	    return null;
	byte[] is = class241_sub39_sub5.method17108(-510488418);
	if (class241_sub39_sub5 instanceof Class241_Sub39_Sub5_Sub1) {
	    Class241_Sub39_Sub5 class241_sub39_sub5_3_;
	    try {
		if (is == null || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10317.reset();
		aCRC32_10317.update(is, 0, is.length - 2);
		int i_4_ = (int) aCRC32_10317.getValue();
		if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		     .entryCrcs[i])
		    != i_4_)
		    throw new RuntimeException();
		if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		     .entryDigests) != null
		    && (null
			!= (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryDigests[i]))) {
		    byte[] is_5_
			= (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			   .entryDigests[i]);
		    byte[] is_6_ = Class187.whirlpool(is, 0, is.length - 2,
						       (short) 255);
		    for (int i_7_ = 0; i_7_ < 64; i_7_++) {
			if (is_5_[i_7_] != is_6_[i_7_])
			    throw new RuntimeException();
		    }
		}
		int i_8_ = ((is[is.length - 1] & 0xff)
			    + ((is[is.length - 2] & 0xff) << 8));
		if (i_8_
		    != ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			 .entryVersions[i])
			& 0xffff))
		    throw new RuntimeException();
		if (1 != ((Class279_Sub1) this).aByteArray10315[i]) {
		    if (((Class279_Sub1) this).aByteArray10315[i] != 0) {
			/* empty */
		    }
		    ((Class279_Sub1) this).anInt10304 += 53108709;
		    ((Class279_Sub1) this).aByteArray10315[i] = (byte) 1;
		}
		if (!((Class241_Sub39_Sub5) class241_sub39_sub5).urgent)
		    class241_sub39_sub5.remove((byte) 36);
		class241_sub39_sub5_3_ = class241_sub39_sub5;
	    } catch (Exception exception) {
		((Class279_Sub1) this).aByteArray10315[i] = (byte) -1;
		class241_sub39_sub5.remove((byte) 36);
		if (((Class241_Sub39_Sub5) class241_sub39_sub5).urgent) {
		    if (((Class279_Sub1) this).aClass207_10292 != null) {
			if (!((Class279_Sub1) this).aClass207_10292
				 .method4096(-1242413694)) {
			    Class241_Sub39_Sub5_Sub2 class241_sub39_sub5_sub2
				= (((Class279_Sub1) this).aClass207_10292
				       .method4101
				   ((((Class279_Sub1) this).anInt10290
				     * 1785130223),
				    i, (byte) 2, true,
				    (((ReferenceTable)
				      ((Class279_Sub1) this).aClass286_10300)
				     .entryCrcs[i]),
				    (((ReferenceTable)
				      ((Class279_Sub1) this).aClass286_10300)
				     .entryVersions[i]),
				    (byte) 74));
			    if (class241_sub39_sub5_sub2 != null)
				((Class279_Sub1) this).aClass407_10306
				    .put
				    (class241_sub39_sub5_sub2, (long) i);
			}
		    } else if (!((Class279_Sub1) this).aClass209_10303
				    .method4141(-228297429)) {
			Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
			    = (((Class279_Sub1) this).aClass209_10303
				   .method4139
			       (((Class279_Sub1) this).anInt10290 * 1785130223,
				i, (byte) 2, true, (byte) 77));
			((Class279_Sub1) this).aClass407_10306
			    .put(class241_sub39_sub5_sub3, (long) i);
		    }
		}
		return null;
	    }
	    return class241_sub39_sub5_3_;
	}
	try {
	    if (null == is || is.length <= 2) {
		if (((Class279_Sub1) this).aClass207_10292 != null) {
		    class241_sub39_sub5.remove((byte) 36);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10317.reset();
	    aCRC32_10317.update(is, 0, is.length - 2);
	    int i_9_ = (int) aCRC32_10317.getValue();
	    if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		 .entryCrcs[i])
		!= i_9_)
		throw new RuntimeException();
	    if (null != (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			 .entryDigests)
		&& null != (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryDigests[i])) {
		byte[] is_10_
		    = (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryDigests[i]);
		byte[] is_11_
		    = Class187.whirlpool(is, 0, is.length - 2, (short) 255);
		for (int i_12_ = 0; i_12_ < 64; i_12_++) {
		    if (is_10_[i_12_] != is_11_[i_12_])
			throw new RuntimeException();
		}
	    }
	    if (((Class279_Sub1) this).aClass207_10292 != null) {
		((Class279_Sub1) this).aClass209_10303.anInt2472 = 0;
		((Class279_Sub1) this).aClass209_10303.anInt2473 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    ((Class279_Sub1) this).aClass209_10303.method4143
		(((Class279_Sub1) this).anInt10290 * 1785130223, i,
		 2057847036);
	    class241_sub39_sub5.remove((byte) 36);
	    if (((Class241_Sub39_Sub5) class241_sub39_sub5).urgent) {
		if (null != ((Class279_Sub1) this).aClass207_10292) {
		    if (!((Class279_Sub1) this).aClass207_10292
			     .method4096(840483690)) {
			Class241_Sub39_Sub5_Sub2 class241_sub39_sub5_sub2
			    = (((Class279_Sub1) this).aClass207_10292
				   .method4101
			       (((Class279_Sub1) this).anInt10290 * 1785130223,
				i, (byte) 2, true,
				(((ReferenceTable)
				  ((Class279_Sub1) this).aClass286_10300)
				 .entryCrcs[i]),
				(((ReferenceTable)
				  ((Class279_Sub1) this).aClass286_10300)
				 .entryVersions[i]),
				(byte) 41));
			if (class241_sub39_sub5_sub2 != null)
			    ((Class279_Sub1) this).aClass407_10306.put
				(class241_sub39_sub5_sub2, (long) i);
		    }
		} else if (!((Class279_Sub1) this).aClass209_10303
				.method4141(-501328448)) {
		    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (1785130223 * ((Class279_Sub1) this).anInt10290, i,
			    (byte) 2, true, (byte) 89));
		    ((Class279_Sub1) this).aClass407_10306
			.put(class241_sub39_sub5_sub3, (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2]
	    = (byte) ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryVersions[i])
		      >>> 8);
	is[is.length - 1]
	    = (byte) (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		      .entryVersions[i]);
	if (((Class279_Sub1) this).aClass568_10294 != null) {
	    ((Class279_Sub1) this).aClass291_10293.method5667
		(i, is, ((Class279_Sub1) this).aClass568_10294, 985457225);
	    if (((Class279_Sub1) this).aByteArray10315[i] != 1) {
		((Class279_Sub1) this).anInt10304 += 53108709;
		((Class279_Sub1) this).aByteArray10315[i] = (byte) 1;
	    }
	}
	if (!((Class241_Sub39_Sub5) class241_sub39_sub5).urgent)
	    class241_sub39_sub5.remove((byte) 36);
	return class241_sub39_sub5;
    }
    
    void method16602(int i) {
	if (null != ((Class279_Sub1) this).aClass429_10311
	    && method5458(-2064113656) != null) {
	    for (Node class241 = ((Class279_Sub1) this).aClass429_10312
					 .method7694(16711935);
		 null != class241;
		 class241 = ((Class279_Sub1) this).aClass429_10312
				.method7692(142050409)) {
		int i_13_ = (int) (class241.hashCode * 4356572401218184725L);
		if (i_13_ < 0
		    || (i_13_
			>= (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .indexCount) * -546788063)
		    || (0
			== (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryChildCounts[i_13_])))
		    class241.remove((byte) 36);
		else {
		    if (0 == ((Class279_Sub1) this).aByteArray10315[i_13_])
			method16601(i_13_, 1, -1235353120);
		    if (-1 == ((Class279_Sub1) this).aByteArray10315[i_13_])
			method16601(i_13_, 2, -1387435762);
		    if (((Class279_Sub1) this).aByteArray10315[i_13_] == 1)
			class241.remove((byte) 36);
		}
	    }
	}
    }
    
    void method16603(int i) {
	if (((Class279_Sub1) this).aClass429_10311 != null) {
	    if (method5458(-2064113656) == null)
		return;
	    if (((Class279_Sub1) this).aBool10314) {
		boolean bool = true;
		for (Node class241 = ((Class279_Sub1) this)
					     .aClass429_10311
					     .method7694(16711935);
		     class241 != null;
		     class241 = ((Class279_Sub1) this).aClass429_10311
				    .method7692(658959867)) {
		    int i_14_
			= (int) (4356572401218184725L * class241.hashCode);
		    if (0 == ((Class279_Sub1) this).aByteArray10315[i_14_])
			method16601(i_14_, 1, -2015755091);
		    if (((Class279_Sub1) this).aByteArray10315[i_14_] != 0)
			class241.remove((byte) 36);
		    else
			bool = false;
		}
		while (-1238682343 * ((Class279_Sub1) this).anInt10310
		       < (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			  .entryChildCounts).length) {
		    if (0
			== (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryChildCounts
			    [-1238682343 * ((Class279_Sub1) this).anInt10310]))
			((Class279_Sub1) this).anInt10310 += -730769623;
		    else {
			if (-162161657 * (((Class291) (((Class279_Sub1) this)
						       .aClass291_10293))
					  .anInt4486)
			    >= 250) {
			    bool = false;
			    break;
			}
			if (0 == (((Class279_Sub1) this).aByteArray10315
				  [(-1238682343
				    * ((Class279_Sub1) this).anInt10310)]))
			    method16601((-1238682343
					 * ((Class279_Sub1) this).anInt10310),
					1, -2136253878);
			if (0 == (((Class279_Sub1) this).aByteArray10315
				  [(-1238682343
				    * ((Class279_Sub1) this).anInt10310)])) {
			    Node class241 = new Node();
			    class241.hashCode
				= (5341015304404088821L
				   * (long) ((Class279_Sub1) this).anInt10310);
			    ((Class279_Sub1) this).aClass429_10311
				.addNode(class241, (short) -5644);
			    bool = false;
			}
			((Class279_Sub1) this).anInt10310 += -730769623;
		    }
		}
		if (bool) {
		    ((Class279_Sub1) this).aBool10314 = false;
		    ((Class279_Sub1) this).anInt10310 = 0;
		}
	    } else if (((Class279_Sub1) this).aBool10305) {
		boolean bool = true;
		for (Node class241 = ((Class279_Sub1) this)
					     .aClass429_10311
					     .method7694(16711935);
		     null != class241;
		     class241 = ((Class279_Sub1) this).aClass429_10311
				    .method7692(625475497)) {
		    int i_15_
			= (int) (4356572401218184725L * class241.hashCode);
		    if (1 != ((Class279_Sub1) this).aByteArray10315[i_15_])
			method16601(i_15_, 2, -1949383354);
		    if (1 == ((Class279_Sub1) this).aByteArray10315[i_15_])
			class241.remove((byte) 36);
		    else
			bool = false;
		}
		while (((Class279_Sub1) this).anInt10310 * -1238682343
		       < (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			  .entryChildCounts).length) {
		    if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			 .entryChildCounts
			 [((Class279_Sub1) this).anInt10310 * -1238682343])
			== 0)
			((Class279_Sub1) this).anInt10310 += -730769623;
		    else {
			if (((Class279_Sub1) this).aClass209_10303
				.method4149(16777215)) {
			    bool = false;
			    break;
			}
			if (1 != (((Class279_Sub1) this).aByteArray10315
				  [(-1238682343
				    * ((Class279_Sub1) this).anInt10310)]))
			    method16601((-1238682343
					 * ((Class279_Sub1) this).anInt10310),
					2, -1446975577);
			if (1 != (((Class279_Sub1) this).aByteArray10315
				  [(((Class279_Sub1) this).anInt10310
				    * -1238682343)])) {
			    Node class241 = new Node();
			    class241.hashCode
				= ((long) ((Class279_Sub1) this).anInt10310
				   * 5341015304404088821L);
			    ((Class279_Sub1) this).aClass429_10311
				.addNode(class241, (short) -19705);
			    bool = false;
			}
			((Class279_Sub1) this).anInt10310 += -730769623;
		    }
		}
		if (bool) {
		    ((Class279_Sub1) this).aBool10305 = false;
		    ((Class279_Sub1) this).anInt10310 = 0;
		}
	    } else
		((Class279_Sub1) this).aClass429_10311 = null;
	}
	if (((Class279_Sub1) this).aBool10313
	    && (Class50.method1249((byte) 1)
		>= ((Class279_Sub1) this).aLong10298 * 3200458081289168455L)) {
	    for (Class241_Sub39_Sub5 class241_sub39_sub5
		     = (Class241_Sub39_Sub5) ((Class279_Sub1) this)
						 .aClass407_10306
						 .method7294(2090894173);
		 null != class241_sub39_sub5;
		 class241_sub39_sub5
		     = (Class241_Sub39_Sub5) ((Class279_Sub1) this)
						 .aClass407_10306
						 .method7295(1497619325)) {
		if (!((Class241_Sub39_Sub5) class241_sub39_sub5).aBool10839) {
		    if (((Class241_Sub39_Sub5) class241_sub39_sub5)
			.aBool10838) {
			if (!((Class241_Sub39_Sub5) class241_sub39_sub5)
			     .urgent)
			    throw new RuntimeException();
			class241_sub39_sub5.remove((byte) 36);
		    } else
			((Class241_Sub39_Sub5) class241_sub39_sub5).aBool10838
			    = true;
		}
	    }
	    ((Class279_Sub1) this).aLong10298
		= ((Class50.method1249((byte) 1) + 1000L)
		   * 8829191502366827383L);
	}
    }
    
    void method16604() {
	if (null != ((Class279_Sub1) this).aClass429_10311
	    && method5458(-2064113656) != null) {
	    for (Node class241 = ((Class279_Sub1) this).aClass429_10312
					 .method7694(16711935);
		 null != class241;
		 class241 = ((Class279_Sub1) this).aClass429_10312
				.method7692(750378825)) {
		int i = (int) (class241.hashCode * 4356572401218184725L);
		if (i < 0
		    || (i
			>= (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .indexCount) * -546788063)
		    || 0 == ((ReferenceTable) (((Class279_Sub1) this)
					 .aClass286_10300)).entryChildCounts[i])
		    class241.remove((byte) 36);
		else {
		    if (0 == ((Class279_Sub1) this).aByteArray10315[i])
			method16601(i, 1, -1795886519);
		    if (-1 == ((Class279_Sub1) this).aByteArray10315[i])
			method16601(i, 2, -1506000569);
		    if (((Class279_Sub1) this).aByteArray10315[i] == 1)
			class241.remove((byte) 36);
		}
	    }
	}
    }
    
    void method16605() {
	if (((Class279_Sub1) this).aClass429_10311 != null) {
	    if (method5458(-2064113656) == null)
		return;
	    if (((Class279_Sub1) this).aBool10314) {
		boolean bool = true;
		for (Node class241 = ((Class279_Sub1) this)
					     .aClass429_10311
					     .method7694(16711935);
		     class241 != null;
		     class241 = ((Class279_Sub1) this).aClass429_10311
				    .method7692(201105902)) {
		    int i = (int) (4356572401218184725L * class241.hashCode);
		    if (0 == ((Class279_Sub1) this).aByteArray10315[i])
			method16601(i, 1, -1445870014);
		    if (((Class279_Sub1) this).aByteArray10315[i] != 0)
			class241.remove((byte) 36);
		    else
			bool = false;
		}
		while (-1238682343 * ((Class279_Sub1) this).anInt10310
		       < (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			  .entryChildCounts).length) {
		    if (0
			== (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryChildCounts
			    [-1238682343 * ((Class279_Sub1) this).anInt10310]))
			((Class279_Sub1) this).anInt10310 += -730769623;
		    else {
			if (-162161657 * (((Class291) (((Class279_Sub1) this)
						       .aClass291_10293))
					  .anInt4486)
			    >= 250) {
			    bool = false;
			    break;
			}
			if (0 == (((Class279_Sub1) this).aByteArray10315
				  [(-1238682343
				    * ((Class279_Sub1) this).anInt10310)]))
			    method16601((-1238682343
					 * ((Class279_Sub1) this).anInt10310),
					1, -1735419323);
			if (0 == (((Class279_Sub1) this).aByteArray10315
				  [(-1238682343
				    * ((Class279_Sub1) this).anInt10310)])) {
			    Node class241 = new Node();
			    class241.hashCode
				= (5341015304404088821L
				   * (long) ((Class279_Sub1) this).anInt10310);
			    ((Class279_Sub1) this).aClass429_10311
				.addNode(class241, (short) -1229);
			    bool = false;
			}
			((Class279_Sub1) this).anInt10310 += -730769623;
		    }
		}
		if (bool) {
		    ((Class279_Sub1) this).aBool10314 = false;
		    ((Class279_Sub1) this).anInt10310 = 0;
		}
	    } else if (((Class279_Sub1) this).aBool10305) {
		boolean bool = true;
		for (Node class241 = ((Class279_Sub1) this)
					     .aClass429_10311
					     .method7694(16711935);
		     null != class241;
		     class241 = ((Class279_Sub1) this).aClass429_10311
				    .method7692(502812289)) {
		    int i = (int) (4356572401218184725L * class241.hashCode);
		    if (1 != ((Class279_Sub1) this).aByteArray10315[i])
			method16601(i, 2, -1838375611);
		    if (1 == ((Class279_Sub1) this).aByteArray10315[i])
			class241.remove((byte) 36);
		    else
			bool = false;
		}
		while (((Class279_Sub1) this).anInt10310 * -1238682343
		       < (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			  .entryChildCounts).length) {
		    if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			 .entryChildCounts
			 [((Class279_Sub1) this).anInt10310 * -1238682343])
			== 0)
			((Class279_Sub1) this).anInt10310 += -730769623;
		    else {
			if (((Class279_Sub1) this).aClass209_10303
				.method4149(16777215)) {
			    bool = false;
			    break;
			}
			if (1 != (((Class279_Sub1) this).aByteArray10315
				  [(-1238682343
				    * ((Class279_Sub1) this).anInt10310)]))
			    method16601((-1238682343
					 * ((Class279_Sub1) this).anInt10310),
					2, -1732916290);
			if (1 != (((Class279_Sub1) this).aByteArray10315
				  [(((Class279_Sub1) this).anInt10310
				    * -1238682343)])) {
			    Node class241 = new Node();
			    class241.hashCode
				= ((long) ((Class279_Sub1) this).anInt10310
				   * 5341015304404088821L);
			    ((Class279_Sub1) this).aClass429_10311
				.addNode(class241, (short) -20056);
			    bool = false;
			}
			((Class279_Sub1) this).anInt10310 += -730769623;
		    }
		}
		if (bool) {
		    ((Class279_Sub1) this).aBool10305 = false;
		    ((Class279_Sub1) this).anInt10310 = 0;
		}
	    } else
		((Class279_Sub1) this).aClass429_10311 = null;
	}
	if (((Class279_Sub1) this).aBool10313
	    && (Class50.method1249((byte) 1)
		>= ((Class279_Sub1) this).aLong10298 * 3200458081289168455L)) {
	    for (Class241_Sub39_Sub5 class241_sub39_sub5
		     = (Class241_Sub39_Sub5) ((Class279_Sub1) this)
						 .aClass407_10306
						 .method7294(2090894173);
		 null != class241_sub39_sub5;
		 class241_sub39_sub5
		     = (Class241_Sub39_Sub5) ((Class279_Sub1) this)
						 .aClass407_10306
						 .method7295(1983813518)) {
		if (!((Class241_Sub39_Sub5) class241_sub39_sub5).aBool10839) {
		    if (((Class241_Sub39_Sub5) class241_sub39_sub5)
			.aBool10838) {
			if (!((Class241_Sub39_Sub5) class241_sub39_sub5)
			     .urgent)
			    throw new RuntimeException();
			class241_sub39_sub5.remove((byte) 36);
		    } else
			((Class241_Sub39_Sub5) class241_sub39_sub5).aBool10838
			    = true;
		}
	    }
	    ((Class279_Sub1) this).aLong10298
		= ((Class50.method1249((byte) 1) + 1000L)
		   * 8829191502366827383L);
	}
    }
    
    public int method16606(byte i) {
	if (((Class279_Sub1) this).aClass286_10300 == null)
	    return 0;
	if (!((Class279_Sub1) this).aBool10314)
	    return (522206277
		    * (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryCount));
	Node class241
	    = ((Class279_Sub1) this).aClass429_10311.method7694(16711935);
	if (null == class241)
	    return 0;
	return (int) (class241.hashCode * 4356572401218184725L);
    }
    
    public void method16607(int i) {
	if (null == ((Class279_Sub1) this).aClass207_10292
	    && ((Class279_Sub1) this).aClass568_10294 != null) {
	    ((Class279_Sub1) this).aBool10305 = true;
	    ((Class279_Sub1) this).aBool10308 = true;
	    if (null == ((Class279_Sub1) this).aClass429_10311)
		((Class279_Sub1) this).aClass429_10311 = new NodeCollection();
	}
    }
    
    void method5462(int i, int i_16_) {
	if (((Class279_Sub1) this).aClass568_10294 != null) {
	    for (Node class241 = ((Class279_Sub1) this).aClass429_10312
					 .method7694(16711935);
		 class241 != null;
		 class241 = ((Class279_Sub1) this).aClass429_10312
				.method7692(1132788296)) {
		if ((long) i == 4356572401218184725L * class241.hashCode)
		    return;
	    }
	    Node class241 = new Node();
	    class241.hashCode = -84545867636262595L * (long) i;
	    ((Class279_Sub1) this).aClass429_10312.addNode(class241,
							      (short) -6118);
	}
    }
    
    int method5459(int i, short i_17_) {
	Class241_Sub39_Sub5 class241_sub39_sub5
	    = ((Class241_Sub39_Sub5)
	       ((Class279_Sub1) this).aClass407_10306.get((long) i));
	if (class241_sub39_sub5 != null)
	    return class241_sub39_sub5.method17109(16711935);
	return 0;
    }
    
    public boolean method16608(int i) {
	return ((Class279_Sub1) this).aBool10308;
    }
    
    public int method16609(int i) {
	return -1703754259 * ((Class279_Sub1) this).anInt10304;
    }
    
    public void method16610() {
	if (null == ((Class279_Sub1) this).aClass207_10292
	    && ((Class279_Sub1) this).aClass568_10294 != null) {
	    ((Class279_Sub1) this).aBool10305 = true;
	    ((Class279_Sub1) this).aBool10308 = true;
	    if (null == ((Class279_Sub1) this).aClass429_10311)
		((Class279_Sub1) this).aClass429_10311 = new NodeCollection();
	}
    }
    
    ReferenceTable method5456() {
	if (null != ((Class279_Sub1) this).aClass286_10300)
	    return ((Class279_Sub1) this).aClass286_10300;
	if (((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 == null) {
	    if (((Class279_Sub1) this).aClass209_10303.method4141(-793010846))
		return null;
	    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
		= (((Class279_Sub1) this).aClass209_10303.method4139
		   (255, 1785130223 * ((Class279_Sub1) this).anInt10290,
		    (byte) 0, true, (byte) 125));
	}
	if (((Class241_Sub39_Sub5)
	     ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291)
	    .aBool10839)
	    return null;
	byte[] is = ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
			.method17108(-510488418);
	if (((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
	    instanceof Class241_Sub39_Sub5_Sub1) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		((Class279_Sub1) this).aClass286_10300
		    = new ReferenceTable(is,
				   (1755530243
				    * ((Class279_Sub1) this).anInt10297),
				   ((Class279_Sub1) this).aByteArray10309);
		if (1122249127 * ((ReferenceTable) (((Class279_Sub1) this)
					      .aClass286_10300)).version
		    != ((Class279_Sub1) this).anInt10299 * 1141430379)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		((Class279_Sub1) this).aClass286_10300 = null;
		if (((Class279_Sub1) this).aClass209_10303
			.method4141(-753841157))
		    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 = null;
		else
		    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (255,
			    ((Class279_Sub1) this).anInt10290 * 1785130223,
			    (byte) 0, true, (byte) 101));
		return null;
	    }
	} else {
	    try {
		if (null == is)
		    throw new RuntimeException();
		((Class279_Sub1) this).aClass286_10300
		    = new ReferenceTable(is,
				   (1755530243
				    * ((Class279_Sub1) this).anInt10297),
				   ((Class279_Sub1) this).aByteArray10309);
	    } catch (RuntimeException runtimeexception) {
		((Class279_Sub1) this).aClass209_10303.method4143
		    (255, ((Class279_Sub1) this).anInt10290 * 1785130223,
		     2057847036);
		((Class279_Sub1) this).aClass286_10300 = null;
		if (((Class279_Sub1) this).aClass209_10303
			.method4141(-1601622205))
		    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 = null;
		else
		    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (255,
			    ((Class279_Sub1) this).anInt10290 * 1785130223,
			    (byte) 0, true, (byte) 110));
		return null;
	    }
	    if (((Class279_Sub1) this).aClass568_10295 != null)
		((Class279_Sub1) this).aClass291_10293.method5667
		    (((Class279_Sub1) this).anInt10290 * 1785130223, is,
		     ((Class279_Sub1) this).aClass568_10295, 985457225);
	}
	((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 = null;
	if (null != ((Class279_Sub1) this).aClass568_10294) {
	    ((Class279_Sub1) this).aByteArray10315
		= new byte[(((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .indexCount) * -546788063];
	    ((Class279_Sub1) this).anInt10304 = 0;
	}
	return ((Class279_Sub1) this).aClass286_10300;
    }
    
    byte[] method5461(int i) {
	Class241_Sub39_Sub5 class241_sub39_sub5
	    = method16601(i, 0, -1167163848);
	if (null == class241_sub39_sub5)
	    return null;
	byte[] is = class241_sub39_sub5.method17108(-510488418);
	class241_sub39_sub5.remove((byte) 36);
	return is;
    }
    
    void method5460(int i) {
	if (((Class279_Sub1) this).aClass568_10294 != null) {
	    for (Node class241 = ((Class279_Sub1) this).aClass429_10312
					 .method7694(16711935);
		 class241 != null;
		 class241 = ((Class279_Sub1) this).aClass429_10312
				.method7692(-156804856)) {
		if ((long) i == 4356572401218184725L * class241.hashCode)
		    return;
	    }
	    Node class241 = new Node();
	    class241.hashCode = -84545867636262595L * (long) i;
	    ((Class279_Sub1) this).aClass429_10312.addNode(class241,
							      (short) -9508);
	}
    }
    
    void method16611() {
	if (null != ((Class279_Sub1) this).aClass429_10311
	    && method5458(-2064113656) != null) {
	    for (Node class241 = ((Class279_Sub1) this).aClass429_10312
					 .method7694(16711935);
		 null != class241;
		 class241 = ((Class279_Sub1) this).aClass429_10312
				.method7692(939719401)) {
		int i = (int) (class241.hashCode * 4356572401218184725L);
		if (i < 0
		    || (i
			>= (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .indexCount) * -546788063)
		    || 0 == ((ReferenceTable) (((Class279_Sub1) this)
					 .aClass286_10300)).entryChildCounts[i])
		    class241.remove((byte) 36);
		else {
		    if (0 == ((Class279_Sub1) this).aByteArray10315[i])
			method16601(i, 1, -1713454652);
		    if (-1 == ((Class279_Sub1) this).aByteArray10315[i])
			method16601(i, 2, -1499676457);
		    if (((Class279_Sub1) this).aByteArray10315[i] == 1)
			class241.remove((byte) 36);
		}
	    }
	}
    }
    
    int method5464(int i) {
	Class241_Sub39_Sub5 class241_sub39_sub5
	    = ((Class241_Sub39_Sub5)
	       ((Class279_Sub1) this).aClass407_10306.get((long) i));
	if (class241_sub39_sub5 != null)
	    return class241_sub39_sub5.method17109(16711935);
	return 0;
    }
    
    public int method16612() {
	if (((Class279_Sub1) this).aClass286_10300 == null)
	    return 0;
	if (!((Class279_Sub1) this).aBool10314)
	    return (522206277
		    * (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryCount));
	Node class241
	    = ((Class279_Sub1) this).aClass429_10311.method7694(16711935);
	if (null == class241)
	    return 0;
	return (int) (class241.hashCode * 4356572401218184725L);
    }
    
    void method16613(int i, byte[] is, int i_18_, int i_19_) {
	if (!method16626(i, is, i_18_, i_19_, 1263897967)) {
	    ((Class279_Sub1) this).anInt10297 = -2117564757 * i;
	    ((Class279_Sub1) this).aByteArray10309 = is;
	    ((Class279_Sub1) this).anInt10299 = i_18_ * 1075123267;
	    ((Class279_Sub1) this).aClass286_10300 = null;
	    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 = null;
	    if (!((Class279_Sub1) this).aClass209_10303
		     .method4141(-1900701005))
		((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
		    = (((Class279_Sub1) this).aClass209_10303.method4139
		       (255, ((Class279_Sub1) this).anInt10290 * 1785130223,
			(byte) 0, true, (byte) 106));
	}
    }
    
    void method16614(int i, byte[] is, int i_20_, int i_21_) {
	if (!method16626(i, is, i_20_, i_21_, -2093015876)) {
	    ((Class279_Sub1) this).anInt10297 = -2117564757 * i;
	    ((Class279_Sub1) this).aByteArray10309 = is;
	    ((Class279_Sub1) this).anInt10299 = i_20_ * 1075123267;
	    ((Class279_Sub1) this).aClass286_10300 = null;
	    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 = null;
	    if (!((Class279_Sub1) this).aClass209_10303.method4141(50811648))
		((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
		    = (((Class279_Sub1) this).aClass209_10303.method4139
		       (255, ((Class279_Sub1) this).anInt10290 * 1785130223,
			(byte) 0, true, (byte) 73));
	}
    }
    
    void method16615(int i, byte[] is, int i_22_, int i_23_) {
	if (!method16626(i, is, i_22_, i_23_, -529497565)) {
	    ((Class279_Sub1) this).anInt10297 = -2117564757 * i;
	    ((Class279_Sub1) this).aByteArray10309 = is;
	    ((Class279_Sub1) this).anInt10299 = i_22_ * 1075123267;
	    ((Class279_Sub1) this).aClass286_10300 = null;
	    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 = null;
	    if (!((Class279_Sub1) this).aClass209_10303.method4141(-804404561))
		((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
		    = (((Class279_Sub1) this).aClass209_10303.method4139
		       (255, ((Class279_Sub1) this).anInt10290 * 1785130223,
			(byte) 0, true, (byte) 72));
	}
    }
    
    boolean method16616(int i, byte[] is, int i_24_, int i_25_) {
	if (1755530243 * ((Class279_Sub1) this).anInt10297 == i
	    && i_24_ == ((Class279_Sub1) this).anInt10299 * 1141430379) {
	    boolean bool = true;
	    for (int i_26_ = 0;
		 i_26_ < ((Class279_Sub1) this).aByteArray10309.length;
		 i_26_++) {
		if (is[i_26_]
		    != ((Class279_Sub1) this).aByteArray10309[i_26_]) {
		    bool = false;
		    break;
		}
	    }
	    if (bool)
		return true;
	}
	return false;
    }
    
    public int method16617() {
	if (method5458(-2064113656) == null) {
	    if (null == ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291)
		return 0;
	    return ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
		       .method17109(16711935);
	}
	return 100;
    }
    
    Class241_Sub39_Sub5 method16618(int i, int i_27_) {
	Class241_Sub39_Sub5 class241_sub39_sub5
	    = ((Class241_Sub39_Sub5)
	       ((Class279_Sub1) this).aClass407_10306.get((long) i));
	if (class241_sub39_sub5 != null && 0 == i_27_
	    && !((Class241_Sub39_Sub5) class241_sub39_sub5).urgent
	    && ((Class241_Sub39_Sub5) class241_sub39_sub5).aBool10839) {
	    class241_sub39_sub5.remove((byte) 36);
	    class241_sub39_sub5 = null;
	}
	if (class241_sub39_sub5 == null) {
	    if (i_27_ == 0) {
		if (null != ((Class279_Sub1) this).aClass568_10294
		    && -1 != ((Class279_Sub1) this).aByteArray10315[i])
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass291_10293.method5666
			   (i, ((Class279_Sub1) this).aClass568_10294,
			    -1019246490));
		else if (null != ((Class279_Sub1) this).aClass207_10292) {
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass207_10292.method4101
			   (((Class279_Sub1) this).anInt10290 * 1785130223, i,
			    (byte) 2, true,
			    ((ReferenceTable) (((Class279_Sub1) this)
					 .aClass286_10300)).entryCrcs[i],
			    ((ReferenceTable) (((Class279_Sub1) this)
					 .aClass286_10300)).entryVersions[i],
			    (byte) 24));
		    if (null == class241_sub39_sub5)
			return null;
		} else if (!((Class279_Sub1) this).aClass209_10303
				.method4141(1389008504))
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (((Class279_Sub1) this).anInt10290 * 1785130223, i,
			    (byte) 2, true, (byte) 104));
		else
		    return null;
	    } else if (1 == i_27_) {
		if (((Class279_Sub1) this).aClass568_10294 == null)
		    throw new RuntimeException();
		class241_sub39_sub5
		    = (((Class279_Sub1) this).aClass291_10293.method5665
		       (i, ((Class279_Sub1) this).aClass568_10294,
			(byte) 116));
	    } else if (2 == i_27_) {
		if (null == ((Class279_Sub1) this).aClass568_10294)
		    throw new RuntimeException();
		if (((Class279_Sub1) this).aByteArray10315[i] != -1)
		    throw new RuntimeException();
		if (null != ((Class279_Sub1) this).aClass207_10292)
		    return null;
		if (!((Class279_Sub1) this).aClass209_10303
			 .method4149(16777215))
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (((Class279_Sub1) this).anInt10290 * 1785130223, i,
			    (byte) 2, false, (byte) 111));
		else
		    return null;
	    } else
		throw new RuntimeException();
	    ((Class279_Sub1) this).aClass407_10306
		.put(class241_sub39_sub5, (long) i);
	}
	if (((Class241_Sub39_Sub5) class241_sub39_sub5).aBool10839)
	    return null;
	byte[] is = class241_sub39_sub5.method17108(-510488418);
	if (class241_sub39_sub5 instanceof Class241_Sub39_Sub5_Sub1) {
	    Class241_Sub39_Sub5 class241_sub39_sub5_28_;
	    try {
		if (is == null || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10317.reset();
		aCRC32_10317.update(is, 0, is.length - 2);
		int i_29_ = (int) aCRC32_10317.getValue();
		if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		     .entryCrcs[i])
		    != i_29_)
		    throw new RuntimeException();
		if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		     .entryDigests) != null
		    && (null
			!= (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryDigests[i]))) {
		    byte[] is_30_
			= (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			   .entryDigests[i]);
		    byte[] is_31_ = Class187.whirlpool(is, 0, is.length - 2,
							(short) 255);
		    for (int i_32_ = 0; i_32_ < 64; i_32_++) {
			if (is_30_[i_32_] != is_31_[i_32_])
			    throw new RuntimeException();
		    }
		}
		int i_33_ = ((is[is.length - 1] & 0xff)
			     + ((is[is.length - 2] & 0xff) << 8));
		if (i_33_
		    != ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			 .entryVersions[i])
			& 0xffff))
		    throw new RuntimeException();
		if (1 != ((Class279_Sub1) this).aByteArray10315[i]) {
		    if (((Class279_Sub1) this).aByteArray10315[i] != 0) {
			/* empty */
		    }
		    ((Class279_Sub1) this).anInt10304 += 53108709;
		    ((Class279_Sub1) this).aByteArray10315[i] = (byte) 1;
		}
		if (!((Class241_Sub39_Sub5) class241_sub39_sub5).urgent)
		    class241_sub39_sub5.remove((byte) 36);
		class241_sub39_sub5_28_ = class241_sub39_sub5;
	    } catch (Exception exception) {
		((Class279_Sub1) this).aByteArray10315[i] = (byte) -1;
		class241_sub39_sub5.remove((byte) 36);
		if (((Class241_Sub39_Sub5) class241_sub39_sub5).urgent) {
		    if (((Class279_Sub1) this).aClass207_10292 != null) {
			if (!((Class279_Sub1) this).aClass207_10292
				 .method4096(-612368267)) {
			    Class241_Sub39_Sub5_Sub2 class241_sub39_sub5_sub2
				= (((Class279_Sub1) this).aClass207_10292
				       .method4101
				   ((((Class279_Sub1) this).anInt10290
				     * 1785130223),
				    i, (byte) 2, true,
				    (((ReferenceTable)
				      ((Class279_Sub1) this).aClass286_10300)
				     .entryCrcs[i]),
				    (((ReferenceTable)
				      ((Class279_Sub1) this).aClass286_10300)
				     .entryVersions[i]),
				    (byte) 104));
			    if (class241_sub39_sub5_sub2 != null)
				((Class279_Sub1) this).aClass407_10306
				    .put
				    (class241_sub39_sub5_sub2, (long) i);
			}
		    } else if (!((Class279_Sub1) this).aClass209_10303
				    .method4141(-746024699)) {
			Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
			    = (((Class279_Sub1) this).aClass209_10303
				   .method4139
			       (((Class279_Sub1) this).anInt10290 * 1785130223,
				i, (byte) 2, true, (byte) 85));
			((Class279_Sub1) this).aClass407_10306
			    .put(class241_sub39_sub5_sub3, (long) i);
		    }
		}
		return null;
	    }
	    return class241_sub39_sub5_28_;
	}
	try {
	    if (null == is || is.length <= 2) {
		if (((Class279_Sub1) this).aClass207_10292 != null) {
		    class241_sub39_sub5.remove((byte) 36);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10317.reset();
	    aCRC32_10317.update(is, 0, is.length - 2);
	    int i_34_ = (int) aCRC32_10317.getValue();
	    if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		 .entryCrcs[i])
		!= i_34_)
		throw new RuntimeException();
	    if (null != (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			 .entryDigests)
		&& null != (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryDigests[i])) {
		byte[] is_35_
		    = (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryDigests[i]);
		byte[] is_36_
		    = Class187.whirlpool(is, 0, is.length - 2, (short) 255);
		for (int i_37_ = 0; i_37_ < 64; i_37_++) {
		    if (is_35_[i_37_] != is_36_[i_37_])
			throw new RuntimeException();
		}
	    }
	    if (((Class279_Sub1) this).aClass207_10292 != null) {
		((Class279_Sub1) this).aClass209_10303.anInt2472 = 0;
		((Class279_Sub1) this).aClass209_10303.anInt2473 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    ((Class279_Sub1) this).aClass209_10303.method4143
		(((Class279_Sub1) this).anInt10290 * 1785130223, i,
		 2057847036);
	    class241_sub39_sub5.remove((byte) 36);
	    if (((Class241_Sub39_Sub5) class241_sub39_sub5).urgent) {
		if (null != ((Class279_Sub1) this).aClass207_10292) {
		    if (!((Class279_Sub1) this).aClass207_10292
			     .method4096(-575023111)) {
			Class241_Sub39_Sub5_Sub2 class241_sub39_sub5_sub2
			    = (((Class279_Sub1) this).aClass207_10292
				   .method4101
			       (((Class279_Sub1) this).anInt10290 * 1785130223,
				i, (byte) 2, true,
				(((ReferenceTable)
				  ((Class279_Sub1) this).aClass286_10300)
				 .entryCrcs[i]),
				(((ReferenceTable)
				  ((Class279_Sub1) this).aClass286_10300)
				 .entryVersions[i]),
				(byte) 21));
			if (class241_sub39_sub5_sub2 != null)
			    ((Class279_Sub1) this).aClass407_10306.put
				(class241_sub39_sub5_sub2, (long) i);
		    }
		} else if (!((Class279_Sub1) this).aClass209_10303
				.method4141(-852623681)) {
		    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (1785130223 * ((Class279_Sub1) this).anInt10290, i,
			    (byte) 2, true, (byte) 107));
		    ((Class279_Sub1) this).aClass407_10306
			.put(class241_sub39_sub5_sub3, (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2]
	    = (byte) ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryVersions[i])
		      >>> 8);
	is[is.length - 1]
	    = (byte) (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		      .entryVersions[i]);
	if (((Class279_Sub1) this).aClass568_10294 != null) {
	    ((Class279_Sub1) this).aClass291_10293.method5667
		(i, is, ((Class279_Sub1) this).aClass568_10294, 985457225);
	    if (((Class279_Sub1) this).aByteArray10315[i] != 1) {
		((Class279_Sub1) this).anInt10304 += 53108709;
		((Class279_Sub1) this).aByteArray10315[i] = (byte) 1;
	    }
	}
	if (!((Class241_Sub39_Sub5) class241_sub39_sub5).urgent)
	    class241_sub39_sub5.remove((byte) 36);
	return class241_sub39_sub5;
    }
    
    void method5463(int i) {
	if (((Class279_Sub1) this).aClass568_10294 != null) {
	    for (Node class241 = ((Class279_Sub1) this).aClass429_10312
					 .method7694(16711935);
		 class241 != null;
		 class241 = ((Class279_Sub1) this).aClass429_10312
				.method7692(659329161)) {
		if ((long) i == 4356572401218184725L * class241.hashCode)
		    return;
	    }
	    Node class241 = new Node();
	    class241.hashCode = -84545867636262595L * (long) i;
	    ((Class279_Sub1) this).aClass429_10312.addNode(class241,
							      (short) -2418);
	}
    }
    
    public int method16619(int i) {
	if (null == ((Class279_Sub1) this).aClass286_10300)
	    return 0;
	return 522206277 * (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryCount);
    }
    
    int method5465(int i) {
	Class241_Sub39_Sub5 class241_sub39_sub5
	    = ((Class241_Sub39_Sub5)
	       ((Class279_Sub1) this).aClass407_10306.get((long) i));
	if (class241_sub39_sub5 != null)
	    return class241_sub39_sub5.method17109(16711935);
	return 0;
    }
    
    public int method16620() {
	if (((Class279_Sub1) this).aClass286_10300 == null)
	    return 0;
	if (!((Class279_Sub1) this).aBool10314)
	    return (522206277
		    * (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryCount));
	Node class241
	    = ((Class279_Sub1) this).aClass429_10311.method7694(16711935);
	if (null == class241)
	    return 0;
	return (int) (class241.hashCode * 4356572401218184725L);
    }
    
    public int method16621() {
	if (null == ((Class279_Sub1) this).aClass286_10300)
	    return 0;
	return 522206277 * (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryCount);
    }
    
    Class279_Sub1(int i, Class568 class568, Class568 class568_38_,
		  Class209 class209, Class207 class207, Class291 class291,
		  int i_39_, byte[] is, int i_40_, boolean bool, int i_41_) {
	((Class279_Sub1) this).aLong10298 = 0L;
	((Class279_Sub1) this).anInt10290 = -1740258801 * i;
	((Class279_Sub1) this).aClass568_10294 = class568;
	if (((Class279_Sub1) this).aClass568_10294 == null)
	    ((Class279_Sub1) this).aBool10314 = false;
	else {
	    ((Class279_Sub1) this).aBool10314 = true;
	    ((Class279_Sub1) this).aClass429_10311 = new NodeCollection();
	}
	((Class279_Sub1) this).aClass568_10295 = class568_38_;
	((Class279_Sub1) this).aClass209_10303 = class209;
	((Class279_Sub1) this).aClass207_10292 = class207;
	((Class279_Sub1) this).aClass291_10293 = class291;
	((Class279_Sub1) this).anInt10297 = -2117564757 * i_39_;
	((Class279_Sub1) this).aByteArray10309 = is;
	((Class279_Sub1) this).anInt10299 = i_40_ * 1075123267;
	((Class279_Sub1) this).aBool10313 = bool;
	if (null != ((Class279_Sub1) this).aClass568_10295)
	    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
		= (((Class279_Sub1) this).aClass291_10293.method5666
		   (((Class279_Sub1) this).anInt10290 * 1785130223,
		    ((Class279_Sub1) this).aClass568_10295, -1757353894));
    }
    
    public int method16622() {
	if (null == ((Class279_Sub1) this).aClass286_10300)
	    return 0;
	return 522206277 * (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryCount);
    }
    
    public int method16623() {
	return -1703754259 * ((Class279_Sub1) this).anInt10304;
    }
    
    public int method16624() {
	return -1703754259 * ((Class279_Sub1) this).anInt10304;
    }
    
    void method16625(boolean bool) {
	((Class279_Sub1) this).aClass207_10292.method4103(bool,
							  (short) -10889);
    }
    
    boolean method16626(int i, byte[] is, int i_42_, int i_43_, int i_44_) {
	if (1755530243 * ((Class279_Sub1) this).anInt10297 == i
	    && i_42_ == ((Class279_Sub1) this).anInt10299 * 1141430379) {
	    boolean bool = true;
	    for (int i_45_ = 0;
		 i_45_ < ((Class279_Sub1) this).aByteArray10309.length;
		 i_45_++) {
		if (is[i_45_]
		    != ((Class279_Sub1) this).aByteArray10309[i_45_]) {
		    bool = false;
		    break;
		}
	    }
	    if (bool)
		return true;
	}
	return false;
    }
    
    public int method16627() {
	if (((Class279_Sub1) this).aClass286_10300 == null)
	    return 0;
	if (!((Class279_Sub1) this).aBool10314)
	    return (522206277
		    * (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryCount));
	Node class241
	    = ((Class279_Sub1) this).aClass429_10311.method7694(16711935);
	if (null == class241)
	    return 0;
	return (int) (class241.hashCode * 4356572401218184725L);
    }
    
    public void method16628() {
	if (null == ((Class279_Sub1) this).aClass207_10292
	    && ((Class279_Sub1) this).aClass568_10294 != null) {
	    ((Class279_Sub1) this).aBool10305 = true;
	    ((Class279_Sub1) this).aBool10308 = true;
	    if (null == ((Class279_Sub1) this).aClass429_10311)
		((Class279_Sub1) this).aClass429_10311 = new NodeCollection();
	}
    }
    
    Class241_Sub39_Sub5 method16629(int i, int i_46_) {
	Class241_Sub39_Sub5 class241_sub39_sub5
	    = ((Class241_Sub39_Sub5)
	       ((Class279_Sub1) this).aClass407_10306.get((long) i));
	if (class241_sub39_sub5 != null && 0 == i_46_
	    && !((Class241_Sub39_Sub5) class241_sub39_sub5).urgent
	    && ((Class241_Sub39_Sub5) class241_sub39_sub5).aBool10839) {
	    class241_sub39_sub5.remove((byte) 36);
	    class241_sub39_sub5 = null;
	}
	if (class241_sub39_sub5 == null) {
	    if (i_46_ == 0) {
		if (null != ((Class279_Sub1) this).aClass568_10294
		    && -1 != ((Class279_Sub1) this).aByteArray10315[i])
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass291_10293.method5666
			   (i, ((Class279_Sub1) this).aClass568_10294,
			    1347236899));
		else if (null != ((Class279_Sub1) this).aClass207_10292) {
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass207_10292.method4101
			   (((Class279_Sub1) this).anInt10290 * 1785130223, i,
			    (byte) 2, true,
			    ((ReferenceTable) (((Class279_Sub1) this)
					 .aClass286_10300)).entryCrcs[i],
			    ((ReferenceTable) (((Class279_Sub1) this)
					 .aClass286_10300)).entryVersions[i],
			    (byte) 81));
		    if (null == class241_sub39_sub5)
			return null;
		} else if (!((Class279_Sub1) this).aClass209_10303
				.method4141(1661203246))
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (((Class279_Sub1) this).anInt10290 * 1785130223, i,
			    (byte) 2, true, (byte) 113));
		else
		    return null;
	    } else if (1 == i_46_) {
		if (((Class279_Sub1) this).aClass568_10294 == null)
		    throw new RuntimeException();
		class241_sub39_sub5
		    = (((Class279_Sub1) this).aClass291_10293.method5665
		       (i, ((Class279_Sub1) this).aClass568_10294, (byte) 65));
	    } else if (2 == i_46_) {
		if (null == ((Class279_Sub1) this).aClass568_10294)
		    throw new RuntimeException();
		if (((Class279_Sub1) this).aByteArray10315[i] != -1)
		    throw new RuntimeException();
		if (null != ((Class279_Sub1) this).aClass207_10292)
		    return null;
		if (!((Class279_Sub1) this).aClass209_10303
			 .method4149(16777215))
		    class241_sub39_sub5
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (((Class279_Sub1) this).anInt10290 * 1785130223, i,
			    (byte) 2, false, (byte) 127));
		else
		    return null;
	    } else
		throw new RuntimeException();
	    ((Class279_Sub1) this).aClass407_10306
		.put(class241_sub39_sub5, (long) i);
	}
	if (((Class241_Sub39_Sub5) class241_sub39_sub5).aBool10839)
	    return null;
	byte[] is = class241_sub39_sub5.method17108(-510488418);
	if (class241_sub39_sub5 instanceof Class241_Sub39_Sub5_Sub1) {
	    Class241_Sub39_Sub5 class241_sub39_sub5_47_;
	    try {
		if (is == null || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10317.reset();
		aCRC32_10317.update(is, 0, is.length - 2);
		int i_48_ = (int) aCRC32_10317.getValue();
		if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		     .entryCrcs[i])
		    != i_48_)
		    throw new RuntimeException();
		if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		     .entryDigests) != null
		    && (null
			!= (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryDigests[i]))) {
		    byte[] is_49_
			= (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			   .entryDigests[i]);
		    byte[] is_50_ = Class187.whirlpool(is, 0, is.length - 2,
							(short) 255);
		    for (int i_51_ = 0; i_51_ < 64; i_51_++) {
			if (is_49_[i_51_] != is_50_[i_51_])
			    throw new RuntimeException();
		    }
		}
		int i_52_ = ((is[is.length - 1] & 0xff)
			     + ((is[is.length - 2] & 0xff) << 8));
		if (i_52_
		    != ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			 .entryVersions[i])
			& 0xffff))
		    throw new RuntimeException();
		if (1 != ((Class279_Sub1) this).aByteArray10315[i]) {
		    if (((Class279_Sub1) this).aByteArray10315[i] != 0) {
			/* empty */
		    }
		    ((Class279_Sub1) this).anInt10304 += 53108709;
		    ((Class279_Sub1) this).aByteArray10315[i] = (byte) 1;
		}
		if (!((Class241_Sub39_Sub5) class241_sub39_sub5).urgent)
		    class241_sub39_sub5.remove((byte) 36);
		class241_sub39_sub5_47_ = class241_sub39_sub5;
	    } catch (Exception exception) {
		((Class279_Sub1) this).aByteArray10315[i] = (byte) -1;
		class241_sub39_sub5.remove((byte) 36);
		if (((Class241_Sub39_Sub5) class241_sub39_sub5).urgent) {
		    if (((Class279_Sub1) this).aClass207_10292 != null) {
			if (!((Class279_Sub1) this).aClass207_10292
				 .method4096(-2049812292)) {
			    Class241_Sub39_Sub5_Sub2 class241_sub39_sub5_sub2
				= (((Class279_Sub1) this).aClass207_10292
				       .method4101
				   ((((Class279_Sub1) this).anInt10290
				     * 1785130223),
				    i, (byte) 2, true,
				    (((ReferenceTable)
				      ((Class279_Sub1) this).aClass286_10300)
				     .entryCrcs[i]),
				    (((ReferenceTable)
				      ((Class279_Sub1) this).aClass286_10300)
				     .entryVersions[i]),
				    (byte) 116));
			    if (class241_sub39_sub5_sub2 != null)
				((Class279_Sub1) this).aClass407_10306
				    .put
				    (class241_sub39_sub5_sub2, (long) i);
			}
		    } else if (!((Class279_Sub1) this).aClass209_10303
				    .method4141(1640276660)) {
			Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
			    = (((Class279_Sub1) this).aClass209_10303
				   .method4139
			       (((Class279_Sub1) this).anInt10290 * 1785130223,
				i, (byte) 2, true, (byte) 98));
			((Class279_Sub1) this).aClass407_10306
			    .put(class241_sub39_sub5_sub3, (long) i);
		    }
		}
		return null;
	    }
	    return class241_sub39_sub5_47_;
	}
	try {
	    if (null == is || is.length <= 2) {
		if (((Class279_Sub1) this).aClass207_10292 != null) {
		    class241_sub39_sub5.remove((byte) 36);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10317.reset();
	    aCRC32_10317.update(is, 0, is.length - 2);
	    int i_53_ = (int) aCRC32_10317.getValue();
	    if ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		 .entryCrcs[i])
		!= i_53_)
		throw new RuntimeException();
	    if (null != (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			 .entryDigests)
		&& null != (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
			    .entryDigests[i])) {
		byte[] is_54_
		    = (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryDigests[i]);
		byte[] is_55_
		    = Class187.whirlpool(is, 0, is.length - 2, (short) 255);
		for (int i_56_ = 0; i_56_ < 64; i_56_++) {
		    if (is_54_[i_56_] != is_55_[i_56_])
			throw new RuntimeException();
		}
	    }
	    if (((Class279_Sub1) this).aClass207_10292 != null) {
		((Class279_Sub1) this).aClass209_10303.anInt2472 = 0;
		((Class279_Sub1) this).aClass209_10303.anInt2473 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    ((Class279_Sub1) this).aClass209_10303.method4143
		(((Class279_Sub1) this).anInt10290 * 1785130223, i,
		 2057847036);
	    class241_sub39_sub5.remove((byte) 36);
	    if (((Class241_Sub39_Sub5) class241_sub39_sub5).urgent) {
		if (null != ((Class279_Sub1) this).aClass207_10292) {
		    if (!((Class279_Sub1) this).aClass207_10292
			     .method4096(1805456772)) {
			Class241_Sub39_Sub5_Sub2 class241_sub39_sub5_sub2
			    = (((Class279_Sub1) this).aClass207_10292
				   .method4101
			       (((Class279_Sub1) this).anInt10290 * 1785130223,
				i, (byte) 2, true,
				(((ReferenceTable)
				  ((Class279_Sub1) this).aClass286_10300)
				 .entryCrcs[i]),
				(((ReferenceTable)
				  ((Class279_Sub1) this).aClass286_10300)
				 .entryVersions[i]),
				(byte) 48));
			if (class241_sub39_sub5_sub2 != null)
			    ((Class279_Sub1) this).aClass407_10306.put
				(class241_sub39_sub5_sub2, (long) i);
		    }
		} else if (!((Class279_Sub1) this).aClass209_10303
				.method4141(-1854997485)) {
		    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
			= (((Class279_Sub1) this).aClass209_10303.method4139
			   (1785130223 * ((Class279_Sub1) this).anInt10290, i,
			    (byte) 2, true, (byte) 95));
		    ((Class279_Sub1) this).aClass407_10306
			.put(class241_sub39_sub5_sub3, (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2]
	    = (byte) ((((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		       .entryVersions[i])
		      >>> 8);
	is[is.length - 1]
	    = (byte) (((ReferenceTable) ((Class279_Sub1) this).aClass286_10300)
		      .entryVersions[i]);
	if (((Class279_Sub1) this).aClass568_10294 != null) {
	    ((Class279_Sub1) this).aClass291_10293.method5667
		(i, is, ((Class279_Sub1) this).aClass568_10294, 985457225);
	    if (((Class279_Sub1) this).aByteArray10315[i] != 1) {
		((Class279_Sub1) this).anInt10304 += 53108709;
		((Class279_Sub1) this).aByteArray10315[i] = (byte) 1;
	    }
	}
	if (!((Class241_Sub39_Sub5) class241_sub39_sub5).urgent)
	    class241_sub39_sub5.remove((byte) 36);
	return class241_sub39_sub5;
    }
    
    void method16630(int i, byte[] is, int i_57_, int i_58_, byte i_59_) {
	if (!method16626(i, is, i_57_, i_58_, 1294273906)) {
	    ((Class279_Sub1) this).anInt10297 = -2117564757 * i;
	    ((Class279_Sub1) this).aByteArray10309 = is;
	    ((Class279_Sub1) this).anInt10299 = i_57_ * 1075123267;
	    ((Class279_Sub1) this).aClass286_10300 = null;
	    ((Class279_Sub1) this).aClass241_Sub39_Sub5_10291 = null;
	    if (!((Class279_Sub1) this).aClass209_10303.method4141(-157438542))
		((Class279_Sub1) this).aClass241_Sub39_Sub5_10291
		    = (((Class279_Sub1) this).aClass209_10303.method4139
		       (255, ((Class279_Sub1) this).anInt10290 * 1785130223,
			(byte) 0, true, (byte) 90));
	}
    }
    
    public boolean method16631() {
	return ((Class279_Sub1) this).aBool10308;
    }
    
    public boolean method16632() {
	return ((Class279_Sub1) this).aBool10308;
    }
    
    public boolean method16633() {
	return ((Class279_Sub1) this).aBool10308;
    }
    
    void method16634(boolean bool) {
	((Class279_Sub1) this).aClass207_10292.method4103(bool, (short) -6054);
    }
    
    void method16635(boolean bool, int i) {
	((Class279_Sub1) this).aClass207_10292.method4103(bool,
							  (short) -14145);
    }
    
    void method16636(boolean bool) {
	((Class279_Sub1) this).aClass207_10292.method4103(bool, (short) -9179);
    }
    
    void method16637(boolean bool) {
	((Class279_Sub1) this).aClass207_10292.method4103(bool, (short) -1741);
    }
    
    boolean method16638() {
	return null != ((Class279_Sub1) this).aClass207_10292;
    }
    
    boolean method16639() {
	return null != ((Class279_Sub1) this).aClass207_10292;
    }
    
    public static boolean method16640(int i, byte i_60_) {
	return (17 == i || 13 == i || i == 11 || i == 12 || i == 8 || 10 == i
		|| 3 == i);
    }
}
