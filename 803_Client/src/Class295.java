/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class Class295
{
    AbstractQueue_Sub1 anAbstractQueue_Sub1_4499;
    Map aMap4500;
    long aLong4501;
    AbstractQueue_Sub1 anAbstractQueue_Sub1_4502;
    Comparator aComparator4503 = new Class208(this);
    Class294 aClass294_4504;
    int anInt4505;
    
    Class295(long l, int i, Class294 class294) {
	((Class295) this).aLong4501 = l * -4817945986374435711L;
	((Class295) this).anInt4505 = i * -1533795801;
	((Class295) this).aClass294_4504 = class294;
	if (-1 == ((Class295) this).anInt4505 * -1630982761) {
	    ((Class295) this).aMap4500 = new HashMap(64);
	    ((Class295) this).anAbstractQueue_Sub1_4502
		= new AbstractQueue_Sub1(64,
					 ((Class295) this).aComparator4503);
	    ((Class295) this).anAbstractQueue_Sub1_4499 = null;
	} else {
	    if (null == ((Class295) this).aClass294_4504)
		throw new IllegalArgumentException("");
	    ((Class295) this).aMap4500
		= new HashMap(((Class295) this).anInt4505 * -1630982761);
	    ((Class295) this).anAbstractQueue_Sub1_4502
		= new AbstractQueue_Sub1((((Class295) this).anInt4505
					  * -1630982761),
					 ((Class295) this).aComparator4503);
	    ((Class295) this).anAbstractQueue_Sub1_4499
		= new AbstractQueue_Sub1(((Class295) this).anInt4505
					 * -1630982761);
	}
    }
    
    void method5702(int i) {
	if (((Class295) this).aLong4501 * 7353181063411811201L == -1L)
	    throw new IllegalStateException("");
	long l = (System.currentTimeMillis()
		  - 7353181063411811201L * ((Class295) this).aLong4501);
	while (!((Class295) this).anAbstractQueue_Sub1_4502.isEmpty()) {
	    Class213 class213
		= ((Class213)
		   ((Class295) this).anAbstractQueue_Sub1_4502.peek());
	    if (-2386260644002240157L * ((Class213) class213).aLong2508 < l) {
		((Class295) this).aMap4500
		    .remove(((Class213) class213).anObject2510);
		((Class295) this).anAbstractQueue_Sub1_4502.remove(class213);
		if (method5703(-1661978457))
		    ((Class295) this).anAbstractQueue_Sub1_4499
			.remove(class213);
	    } else
		break;
	}
    }
    
    boolean method5703(int i) {
	return -1630982761 * ((Class295) this).anInt4505 != -1;
    }
    
    public Object method5704(Object object, int i) {
	synchronized (this) {
	    if (-1L != ((Class295) this).aLong4501 * 7353181063411811201L)
		method5702(1996414058);
	    Class213 class213
		= (Class213) ((Class295) this).aMap4500.get(object);
	    if (class213 == null) {
		Object object_0_ = null;
		return object_0_;
	    }
	    method5707(class213, false, (byte) 87);
	    Object object_1_ = ((Class213) class213).anObject2509;
	    return object_1_;
	}
    }
    
    public Object method5705(Object object, Object object_2_, int i) {
	synchronized (this) {
	    if (((Class295) this).aLong4501 * 7353181063411811201L != -1L)
		method5702(1844375261);
	    Class213 class213
		= (Class213) ((Class295) this).aMap4500.get(object);
	    if (class213 != null) {
		Object object_3_ = ((Class213) class213).anObject2509;
		((Class213) class213).anObject2509 = object_2_;
		method5707(class213, false, (byte) 87);
		Object object_4_ = object_3_;
		return object_4_;
	    }
	    if (method5703(-1342965241)
		&& (((Class295) this).aMap4500.size()
		    == -1630982761 * ((Class295) this).anInt4505)) {
		Class213 class213_5_
		    = ((Class213)
		       ((Class295) this).anAbstractQueue_Sub1_4499.remove());
		((Class295) this).aMap4500
		    .remove(((Class213) class213_5_).anObject2510);
		((Class295) this).anAbstractQueue_Sub1_4502
		    .remove(class213_5_);
	    }
	    Class213 class213_6_ = new Class213(object_2_, object);
	    ((Class295) this).aMap4500.put(object, class213_6_);
	    method5707(class213_6_, true, (byte) 87);
	    Object object_7_ = null;
	    return object_7_;
	}
    }
    
    public Object method5706(Object object, int i) {
	synchronized (this) {
	    if (-1L != 7353181063411811201L * ((Class295) this).aLong4501)
		method5702(1706606922);
	    Class213 class213
		= (Class213) ((Class295) this).aMap4500.remove(object);
	    if (class213 != null) {
		((Class295) this).anAbstractQueue_Sub1_4502.remove(class213);
		if (method5703(-2056089748))
		    ((Class295) this).anAbstractQueue_Sub1_4499
			.remove(class213);
		Object object_8_ = ((Class213) class213).anObject2509;
		return object_8_;
	    }
	    Object object_9_ = null;
	    return object_9_;
	}
    }
    
    void method5707(Class213 class213, boolean bool, byte i) {
	if (!bool) {
	    ((Class295) this).anAbstractQueue_Sub1_4502.remove(class213);
	    if (method5703(-1750611899)
		&& !((Class295) this).anAbstractQueue_Sub1_4499
			.remove(class213))
		throw new IllegalStateException("");
	}
	((Class213) class213).aLong2508
	    = System.currentTimeMillis() * -4519216632241561525L;
	if (method5703(-1561690370)) {
	    switch (-500480333 * (((Class294) ((Class295) this).aClass294_4504)
				  .anInt4497)) {
	    case 0:
		((Class213) class213).aLong2511 += -3842228587627614621L;
		break;
	    case 1:
		((Class213) class213).aLong2511
		    = ((Class213) class213).aLong2508 * -866990483523450039L;
		break;
	    }
	    ((Class295) this).anAbstractQueue_Sub1_4499.add(class213);
	}
	((Class295) this).anAbstractQueue_Sub1_4502.add(class213);
    }
    
    boolean method5708() {
	return -1630982761 * ((Class295) this).anInt4505 != -1;
    }
    
    void method5709() {
	if (((Class295) this).aLong4501 * 7353181063411811201L == -1L)
	    throw new IllegalStateException("");
	long l = (System.currentTimeMillis()
		  - 7353181063411811201L * ((Class295) this).aLong4501);
	while (!((Class295) this).anAbstractQueue_Sub1_4502.isEmpty()) {
	    Class213 class213
		= ((Class213)
		   ((Class295) this).anAbstractQueue_Sub1_4502.peek());
	    if (-2386260644002240157L * ((Class213) class213).aLong2508 < l) {
		((Class295) this).aMap4500
		    .remove(((Class213) class213).anObject2510);
		((Class295) this).anAbstractQueue_Sub1_4502.remove(class213);
		if (method5703(-1511139189))
		    ((Class295) this).anAbstractQueue_Sub1_4499
			.remove(class213);
	    } else
		break;
	}
    }
    
    boolean method5710() {
	return -1630982761 * ((Class295) this).anInt4505 != -1;
    }
    
    public Class295(int i, Class294 class294) {
	this(-1L, i, class294);
    }
    
    public Object method5711(Object object) {
	synchronized (this) {
	    if (-1L != ((Class295) this).aLong4501 * 7353181063411811201L)
		method5702(1408673569);
	    Class213 class213
		= (Class213) ((Class295) this).aMap4500.get(object);
	    if (class213 == null) {
		Object object_10_ = null;
		return object_10_;
	    }
	    method5707(class213, false, (byte) 87);
	    Object object_11_ = ((Class213) class213).anObject2509;
	    return object_11_;
	}
    }
    
    public Object method5712(Object object, Object object_12_) {
	synchronized (this) {
	    if (((Class295) this).aLong4501 * 7353181063411811201L != -1L)
		method5702(1546958148);
	    Class213 class213
		= (Class213) ((Class295) this).aMap4500.get(object);
	    if (class213 != null) {
		Object object_13_ = ((Class213) class213).anObject2509;
		((Class213) class213).anObject2509 = object_12_;
		method5707(class213, false, (byte) 87);
		Object object_14_ = object_13_;
		return object_14_;
	    }
	    if (method5703(-1562605208)
		&& (((Class295) this).aMap4500.size()
		    == -1630982761 * ((Class295) this).anInt4505)) {
		Class213 class213_15_
		    = ((Class213)
		       ((Class295) this).anAbstractQueue_Sub1_4499.remove());
		((Class295) this).aMap4500
		    .remove(((Class213) class213_15_).anObject2510);
		((Class295) this).anAbstractQueue_Sub1_4502
		    .remove(class213_15_);
	    }
	    Class213 class213_16_ = new Class213(object_12_, object);
	    ((Class295) this).aMap4500.put(object, class213_16_);
	    method5707(class213_16_, true, (byte) 87);
	    Object object_17_ = null;
	    return object_17_;
	}
    }
    
    public Object method5713(Object object) {
	synchronized (this) {
	    if (-1L != 7353181063411811201L * ((Class295) this).aLong4501)
		method5702(1598447331);
	    Class213 class213
		= (Class213) ((Class295) this).aMap4500.remove(object);
	    if (class213 != null) {
		((Class295) this).anAbstractQueue_Sub1_4502.remove(class213);
		if (method5703(-1615879233))
		    ((Class295) this).anAbstractQueue_Sub1_4499
			.remove(class213);
		Object object_18_ = ((Class213) class213).anObject2509;
		return object_18_;
	    }
	    Object object_19_ = null;
	    return object_19_;
	}
    }
    
    public Object method5714(Object object) {
	synchronized (this) {
	    if (-1L != 7353181063411811201L * ((Class295) this).aLong4501)
		method5702(1256000341);
	    Class213 class213
		= (Class213) ((Class295) this).aMap4500.remove(object);
	    if (class213 != null) {
		((Class295) this).anAbstractQueue_Sub1_4502.remove(class213);
		if (method5703(-1749405217))
		    ((Class295) this).anAbstractQueue_Sub1_4499
			.remove(class213);
		Object object_20_ = ((Class213) class213).anObject2509;
		return object_20_;
	    }
	    Object object_21_ = null;
	    return object_21_;
	}
    }
    
    public Object method5715(Object object) {
	synchronized (this) {
	    if (-1L != ((Class295) this).aLong4501 * 7353181063411811201L)
		method5702(1521664109);
	    Class213 class213
		= (Class213) ((Class295) this).aMap4500.get(object);
	    if (class213 == null) {
		Object object_22_ = null;
		return object_22_;
	    }
	    method5707(class213, false, (byte) 87);
	    Object object_23_ = ((Class213) class213).anObject2509;
	    return object_23_;
	}
    }
    
    void method5716(Class213 class213, boolean bool) {
	if (!bool) {
	    ((Class295) this).anAbstractQueue_Sub1_4502.remove(class213);
	    if (method5703(-1596797340)
		&& !((Class295) this).anAbstractQueue_Sub1_4499
			.remove(class213))
		throw new IllegalStateException("");
	}
	((Class213) class213).aLong2508
	    = System.currentTimeMillis() * -4519216632241561525L;
	if (method5703(-1451467137)) {
	    switch (-500480333 * (((Class294) ((Class295) this).aClass294_4504)
				  .anInt4497)) {
	    case 0:
		((Class213) class213).aLong2511 += -3842228587627614621L;
		break;
	    case 1:
		((Class213) class213).aLong2511
		    = ((Class213) class213).aLong2508 * -866990483523450039L;
		break;
	    }
	    ((Class295) this).anAbstractQueue_Sub1_4499.add(class213);
	}
	((Class295) this).anAbstractQueue_Sub1_4502.add(class213);
    }
    
    void method5717() {
	if (((Class295) this).aLong4501 * 7353181063411811201L == -1L)
	    throw new IllegalStateException("");
	long l = (System.currentTimeMillis()
		  - 7353181063411811201L * ((Class295) this).aLong4501);
	while (!((Class295) this).anAbstractQueue_Sub1_4502.isEmpty()) {
	    Class213 class213
		= ((Class213)
		   ((Class295) this).anAbstractQueue_Sub1_4502.peek());
	    if (-2386260644002240157L * ((Class213) class213).aLong2508 < l) {
		((Class295) this).aMap4500
		    .remove(((Class213) class213).anObject2510);
		((Class295) this).anAbstractQueue_Sub1_4502.remove(class213);
		if (method5703(-2044129837))
		    ((Class295) this).anAbstractQueue_Sub1_4499
			.remove(class213);
	    } else
		break;
	}
    }
    
    void method5718() {
	if (((Class295) this).aLong4501 * 7353181063411811201L == -1L)
	    throw new IllegalStateException("");
	long l = (System.currentTimeMillis()
		  - 7353181063411811201L * ((Class295) this).aLong4501);
	while (!((Class295) this).anAbstractQueue_Sub1_4502.isEmpty()) {
	    Class213 class213
		= ((Class213)
		   ((Class295) this).anAbstractQueue_Sub1_4502.peek());
	    if (-2386260644002240157L * ((Class213) class213).aLong2508 < l) {
		((Class295) this).aMap4500
		    .remove(((Class213) class213).anObject2510);
		((Class295) this).anAbstractQueue_Sub1_4502.remove(class213);
		if (method5703(-1607779218))
		    ((Class295) this).anAbstractQueue_Sub1_4499
			.remove(class213);
	    } else
		break;
	}
    }
    
    static final void method5719(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_24_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_25_ = (((ClientScriptData) class454).integerStack
		     [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	ParamType class603
	    = Class621.paramTypeList.list(i_25_, 1479550779);
	if (class603.method13186(-219135480))
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= client.aClass238_8477.getObjectLoader(-2090857430).getObjectDefinition
		      (i_24_, 577892407)
		      .method11786(i_25_, class603.defaultstr, 2112261007);
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= (client.aClass238_8477.getObjectLoader(-2078277949).getObjectDefinition
		       (i_24_, 577892407).method11769
		   (i_25_, class603.defaultint * 2015998927, -19348853));
    }
    
    static final void method5720(ClientScriptData class454, int i) {
	if ((((ClientScriptData) class454).integerStack
	     [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	    == 0)
	    ((ClientScriptData) class454).step
		+= (1924545709
		    * (((ClientScriptData) class454).integerConstants
		       [((ClientScriptData) class454).step * 1938982693]));
    }
    
    public static Class241_Sub39_Sub11 method5721(byte i) {
	return Class478.aClass241_Sub39_Sub11_6402;
    }
}
