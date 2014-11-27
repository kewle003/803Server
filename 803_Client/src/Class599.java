/* Class599 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class599
{
    int anInt7711;
    WeakReference_Sub1[] aWeakReference_Sub1Array7712;
    ReferenceQueue aReferenceQueue7713 = new ReferenceQueue();
    public static boolean aBool7714;
    
    public ArrayList method13135(short i) {
	method13138(-85266525);
	ArrayList arraylist
	    = new ArrayList(-1748448803 * ((Class599) this).anInt7711);
	WeakReference_Sub1[] weakreference_sub1s
	    = ((Class599) this).aWeakReference_Sub1Array7712;
	for (int i_0_ = 0; i_0_ < weakreference_sub1s.length; i_0_++) {
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s[i_0_];
		 null != weakreference_sub1;
		 weakreference_sub1
		     = (((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709)) {
		Object object = weakreference_sub1.get();
		if (object != null)
		    arraylist.add(object);
	    }
	}
	return arraylist;
    }
    
    public void method13136(Object object, Object object_1_, byte i) {
	if (null == object)
	    throw new NullPointerException();
	method13138(-895934543);
	int i_2_ = System.identityHashCode(object);
	int i_3_
	    = i_2_ & ((Class599) this).aWeakReference_Sub1Array7712.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class599) this).aWeakReference_Sub1Array7712[i_3_];
	if (null == weakreference_sub1) {
	    ((Class599) this).aWeakReference_Sub1Array7712[i_3_]
		= new WeakReference_Sub1(object,
					 ((Class599) this).aReferenceQueue7713,
					 i_2_, object_1_);
	    ((Class599) this).anInt7711 += 522311285;
	    if (-1748448803 * ((Class599) this).anInt7711
		>= ((Class599) this).aWeakReference_Sub1Array7712.length)
		method13139(-2132999363);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = (((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709)) {
		if ((((WeakReference_Sub1) weakreference_sub1)
		     .aWeakReference_Sub1_10709)
		    == null) {
		    ((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709
			= new WeakReference_Sub1(object,
						 (((Class599) this)
						  .aReferenceQueue7713),
						 i_2_, object_1_);
		    ((Class599) this).anInt7711 += 522311285;
		    if (((Class599) this).anInt7711 * -1748448803
			>= (((Class599) this)
			    .aWeakReference_Sub1Array7712).length)
			method13139(-2143695120);
		    break;
		}
	    }
	}
    }
    
    public void method13137(Object object, int i) {
	if (object == null)
	    throw new NullPointerException();
	method13138(-921377126);
	int i_4_ = System.identityHashCode(object);
	int i_5_
	    = i_4_ & ((Class599) this).aWeakReference_Sub1Array7712.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class599) this).aWeakReference_Sub1Array7712[i_5_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		((Class599) this).aWeakReference_Sub1Array7712[i_5_]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_10709);
		((Class599) this).anInt7711 -= 522311285;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_6_
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_10709);
		    if (null == weakreference_sub1_6_)
			break;
		    if (weakreference_sub1_6_.get() == object) {
			((WeakReference_Sub1) weakreference_sub1)
			    .aWeakReference_Sub1_10709
			    = (((WeakReference_Sub1) weakreference_sub1_6_)
			       .aWeakReference_Sub1_10709);
			((Class599) this).anInt7711 -= 522311285;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_6_;
		}
	    }
	}
    }
    
    void method13138(int i) {
	for (;;) {
	    WeakReference_Sub1 weakreference_sub1
		= ((WeakReference_Sub1)
		   ((Class599) this).aReferenceQueue7713.poll());
	    if (null == weakreference_sub1)
		break;
	    int i_7_
		= ((((WeakReference_Sub1) weakreference_sub1).anInt10710
		    * 1025892265)
		   & (((Class599) this).aWeakReference_Sub1Array7712.length
		      - 1));
	    WeakReference_Sub1 weakreference_sub1_8_
		= ((Class599) this).aWeakReference_Sub1Array7712[i_7_];
	    if (weakreference_sub1 == weakreference_sub1_8_) {
		((Class599) this).aWeakReference_Sub1Array7712[i_7_]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_10709);
		((Class599) this).anInt7711 -= 522311285;
	    } else {
		for (/**/;
		     (null != weakreference_sub1_8_
		      && (weakreference_sub1
			  != (((WeakReference_Sub1) weakreference_sub1_8_)
			      .aWeakReference_Sub1_10709)));
		     weakreference_sub1_8_
			 = (((WeakReference_Sub1) weakreference_sub1_8_)
			    .aWeakReference_Sub1_10709)) {
		    /* empty */
		}
		if (weakreference_sub1_8_ != null) {
		    ((WeakReference_Sub1) weakreference_sub1_8_)
			.aWeakReference_Sub1_10709
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_10709);
		    ((Class599) this).anInt7711 -= 522311285;
		}
	    }
	}
    }
    
    void method13139(int i) {
	WeakReference_Sub1[] weakreference_sub1s
	    = ((Class599) this).aWeakReference_Sub1Array7712;
	((Class599) this).aWeakReference_Sub1Array7712
	    = new WeakReference_Sub1[weakreference_sub1s.length * 2];
	WeakReference_Sub1[] weakreference_sub1s_9_ = weakreference_sub1s;
	for (int i_10_ = 0; i_10_ < weakreference_sub1s_9_.length; i_10_++) {
	    WeakReference_Sub1 weakreference_sub1_11_;
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s_9_[i_10_];
		 weakreference_sub1 != null;
		 weakreference_sub1 = weakreference_sub1_11_) {
		weakreference_sub1_11_
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_10709);
		int i_12_
		    = ((1025892265
			* ((WeakReference_Sub1) weakreference_sub1).anInt10710)
		       & (((Class599) this).aWeakReference_Sub1Array7712.length
			  - 1));
		((WeakReference_Sub1) weakreference_sub1)
		    .aWeakReference_Sub1_10709
		    = ((Class599) this).aWeakReference_Sub1Array7712[i_12_];
		((Class599) this).aWeakReference_Sub1Array7712[i_12_]
		    = weakreference_sub1;
	    }
	}
    }
    
    public Class599() {
	((Class599) this).aWeakReference_Sub1Array7712
	    = new WeakReference_Sub1[16];
    }
    
    public void method13140(Object object, Object object_13_) {
	if (null == object)
	    throw new NullPointerException();
	method13138(-1772752548);
	int i = System.identityHashCode(object);
	int i_14_
	    = i & ((Class599) this).aWeakReference_Sub1Array7712.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class599) this).aWeakReference_Sub1Array7712[i_14_];
	if (null == weakreference_sub1) {
	    ((Class599) this).aWeakReference_Sub1Array7712[i_14_]
		= new WeakReference_Sub1(object,
					 ((Class599) this).aReferenceQueue7713,
					 i, object_13_);
	    ((Class599) this).anInt7711 += 522311285;
	    if (-1748448803 * ((Class599) this).anInt7711
		>= ((Class599) this).aWeakReference_Sub1Array7712.length)
		method13139(-2137021059);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = (((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709)) {
		if ((((WeakReference_Sub1) weakreference_sub1)
		     .aWeakReference_Sub1_10709)
		    == null) {
		    ((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709
			= new WeakReference_Sub1(object,
						 (((Class599) this)
						  .aReferenceQueue7713),
						 i, object_13_);
		    ((Class599) this).anInt7711 += 522311285;
		    if (((Class599) this).anInt7711 * -1748448803
			>= (((Class599) this)
			    .aWeakReference_Sub1Array7712).length)
			method13139(-2131105125);
		    break;
		}
	    }
	}
    }
    
    public void method13141(Object object, Object object_15_) {
	if (null == object)
	    throw new NullPointerException();
	method13138(-774057664);
	int i = System.identityHashCode(object);
	int i_16_
	    = i & ((Class599) this).aWeakReference_Sub1Array7712.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class599) this).aWeakReference_Sub1Array7712[i_16_];
	if (null == weakreference_sub1) {
	    ((Class599) this).aWeakReference_Sub1Array7712[i_16_]
		= new WeakReference_Sub1(object,
					 ((Class599) this).aReferenceQueue7713,
					 i, object_15_);
	    ((Class599) this).anInt7711 += 522311285;
	    if (-1748448803 * ((Class599) this).anInt7711
		>= ((Class599) this).aWeakReference_Sub1Array7712.length)
		method13139(-2132875219);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = (((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709)) {
		if ((((WeakReference_Sub1) weakreference_sub1)
		     .aWeakReference_Sub1_10709)
		    == null) {
		    ((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709
			= new WeakReference_Sub1(object,
						 (((Class599) this)
						  .aReferenceQueue7713),
						 i, object_15_);
		    ((Class599) this).anInt7711 += 522311285;
		    if (((Class599) this).anInt7711 * -1748448803
			>= (((Class599) this)
			    .aWeakReference_Sub1Array7712).length)
			method13139(-2128621333);
		    break;
		}
	    }
	}
    }
    
    public void method13142(Object object, Object object_17_) {
	if (null == object)
	    throw new NullPointerException();
	method13138(5173255);
	int i = System.identityHashCode(object);
	int i_18_
	    = i & ((Class599) this).aWeakReference_Sub1Array7712.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class599) this).aWeakReference_Sub1Array7712[i_18_];
	if (null == weakreference_sub1) {
	    ((Class599) this).aWeakReference_Sub1Array7712[i_18_]
		= new WeakReference_Sub1(object,
					 ((Class599) this).aReferenceQueue7713,
					 i, object_17_);
	    ((Class599) this).anInt7711 += 522311285;
	    if (-1748448803 * ((Class599) this).anInt7711
		>= ((Class599) this).aWeakReference_Sub1Array7712.length)
		method13139(-2132980503);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = (((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709)) {
		if ((((WeakReference_Sub1) weakreference_sub1)
		     .aWeakReference_Sub1_10709)
		    == null) {
		    ((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709
			= new WeakReference_Sub1(object,
						 (((Class599) this)
						  .aReferenceQueue7713),
						 i, object_17_);
		    ((Class599) this).anInt7711 += 522311285;
		    if (((Class599) this).anInt7711 * -1748448803
			>= (((Class599) this)
			    .aWeakReference_Sub1Array7712).length)
			method13139(-2141302337);
		    break;
		}
	    }
	}
    }
    
    public void method13143(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method13138(-1517050462);
	int i = System.identityHashCode(object);
	int i_19_
	    = i & ((Class599) this).aWeakReference_Sub1Array7712.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class599) this).aWeakReference_Sub1Array7712[i_19_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		((Class599) this).aWeakReference_Sub1Array7712[i_19_]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_10709);
		((Class599) this).anInt7711 -= 522311285;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_20_
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_10709);
		    if (null == weakreference_sub1_20_)
			break;
		    if (weakreference_sub1_20_.get() == object) {
			((WeakReference_Sub1) weakreference_sub1)
			    .aWeakReference_Sub1_10709
			    = (((WeakReference_Sub1) weakreference_sub1_20_)
			       .aWeakReference_Sub1_10709);
			((Class599) this).anInt7711 -= 522311285;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_20_;
		}
	    }
	}
    }
    
    public void method13144(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method13138(175718266);
	int i = System.identityHashCode(object);
	int i_21_
	    = i & ((Class599) this).aWeakReference_Sub1Array7712.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class599) this).aWeakReference_Sub1Array7712[i_21_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		((Class599) this).aWeakReference_Sub1Array7712[i_21_]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_10709);
		((Class599) this).anInt7711 -= 522311285;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_22_
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_10709);
		    if (null == weakreference_sub1_22_)
			break;
		    if (weakreference_sub1_22_.get() == object) {
			((WeakReference_Sub1) weakreference_sub1)
			    .aWeakReference_Sub1_10709
			    = (((WeakReference_Sub1) weakreference_sub1_22_)
			       .aWeakReference_Sub1_10709);
			((Class599) this).anInt7711 -= 522311285;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_22_;
		}
	    }
	}
    }
    
    public void method13145(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method13138(-1130013897);
	int i = System.identityHashCode(object);
	int i_23_
	    = i & ((Class599) this).aWeakReference_Sub1Array7712.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class599) this).aWeakReference_Sub1Array7712[i_23_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		((Class599) this).aWeakReference_Sub1Array7712[i_23_]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_10709);
		((Class599) this).anInt7711 -= 522311285;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_24_
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_10709);
		    if (null == weakreference_sub1_24_)
			break;
		    if (weakreference_sub1_24_.get() == object) {
			((WeakReference_Sub1) weakreference_sub1)
			    .aWeakReference_Sub1_10709
			    = (((WeakReference_Sub1) weakreference_sub1_24_)
			       .aWeakReference_Sub1_10709);
			((Class599) this).anInt7711 -= 522311285;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_24_;
		}
	    }
	}
    }
    
    public void method13146(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method13138(-142360138);
	int i = System.identityHashCode(object);
	int i_25_
	    = i & ((Class599) this).aWeakReference_Sub1Array7712.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class599) this).aWeakReference_Sub1Array7712[i_25_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		((Class599) this).aWeakReference_Sub1Array7712[i_25_]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_10709);
		((Class599) this).anInt7711 -= 522311285;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_26_
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_10709);
		    if (null == weakreference_sub1_26_)
			break;
		    if (weakreference_sub1_26_.get() == object) {
			((WeakReference_Sub1) weakreference_sub1)
			    .aWeakReference_Sub1_10709
			    = (((WeakReference_Sub1) weakreference_sub1_26_)
			       .aWeakReference_Sub1_10709);
			((Class599) this).anInt7711 -= 522311285;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_26_;
		}
	    }
	}
    }
    
    public ArrayList method13147() {
	method13138(-662951769);
	ArrayList arraylist
	    = new ArrayList(-1748448803 * ((Class599) this).anInt7711);
	WeakReference_Sub1[] weakreference_sub1s
	    = ((Class599) this).aWeakReference_Sub1Array7712;
	for (int i = 0; i < weakreference_sub1s.length; i++) {
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s[i];
		 null != weakreference_sub1;
		 weakreference_sub1
		     = (((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709)) {
		Object object = weakreference_sub1.get();
		if (object != null)
		    arraylist.add(object);
	    }
	}
	return arraylist;
    }
    
    public ArrayList method13148() {
	method13138(-287873498);
	ArrayList arraylist
	    = new ArrayList(-1748448803 * ((Class599) this).anInt7711);
	WeakReference_Sub1[] weakreference_sub1s
	    = ((Class599) this).aWeakReference_Sub1Array7712;
	for (int i = 0; i < weakreference_sub1s.length; i++) {
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s[i];
		 null != weakreference_sub1;
		 weakreference_sub1
		     = (((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_10709)) {
		Object object = weakreference_sub1.get();
		if (object != null)
		    arraylist.add(object);
	    }
	}
	return arraylist;
    }
    
    public static final void method13149(boolean bool, int i) {
	if (!bool) {
	    Class371.aClass476_5573.method10907((byte) 121);
	    Class120_Sub12.aClass394_10530.method7058(-1442310162);
	    CS2MapList.aClass350_6031.method6239(1706559697);
	    client.aClass238_8477.getObjectLoader(-2098324918)
		.method11849((short) -3351);
	    MasterIndex.npcDefLoader.method7229(-1843871505);
	    JS5.itemDefLoader.cacheReset((byte) 38);
	    Class394.animationDefLoader.method12298(1882522568);
	    Class240.graphicsDefLoader.method10582(372929059);
	    Class541.aClass199_Sub1_7008.cacheReset(-1950020471);
	    Class177.VAR_PLAYER_LIST.cacheReset(-19424375);
	    Class333.VAR_NPC_LIST.cacheReset(-770516240);
	    Class443.VAR_CLAN_LIST.cacheReset(-770516240);
	    VarBitType.VAR_CLAN_SETTINGS_LIST.cacheReset(-770516240);
	    Class79.aClass539_1138.method11911(-909255916);
	    Class8.aClass598_46.method13118(1956728404);
	    Class441.aClass524_6158.method11734((byte) 1);
	    Class621.paramTypeList.cacheReset(382864337);
	    Class380.aClass577_5657.method12674(-1340778532);
	    Class326.aClass74_5015.method1751(188315363);
	    Class120_Sub8.aClass619_10502.method13324(-895507327);
	    GameShell3.cursorTypeList.cacheReset(-1463290625);
	    Class633.hitMarkTypeList.cacheReset((byte) 51);
	    IncommingOpcode.aClass581_5298.method12749(1143618898);
	    Class55.method1369(-565959576);
	    Class409_Sub1.method14047(-1518519248);
	    Class425.aClass344_6080.method6143(1734196796);
	    Class53.method1297(808841320);
	    if (Class416.aClass470_6012 != Class470.aClass470_6345) {
		for (int i_27_ = 0;
		     i_27_ < HashTable.aByteArrayArray5912.length; i_27_++)
		    HashTable.aByteArrayArray5912[i_27_] = null;
		client.anInt8294 = 0;
	    }
	    client.aClass238_8477.method4833(-529091643)
		.method11411(1315867147);
	    Class254.method5035((byte) 64);
	    Class486.method11126((byte) -66);
	    Class540.method11931((byte) 25);
	    Class189.method3878((byte) 107);
	    Class450.aClass129_6196.reset(-1697250374);
	    client.aClass129_8325.reset(-145960629);
	    client.aClass129_8326.reset(-756682274);
	    Class16.aClass129_172.reset(-907676864);
	    client.aClass129_8580.reset(-2030609382);
	}
	VarDomainType.method4373(-682013140);
	Js5Archive.method1391((byte) -104);
    }
}
