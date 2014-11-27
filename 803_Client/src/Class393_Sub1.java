/* Class393_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Class393_Sub1 extends Class393
{
    volatile boolean aBool10205 = false;
    HashMap aHashMap10206;
    Class308 aClass308_10207;
    Thread aThread10208;
    long aLong10209 = Class50.method1249((byte) 1) * -1958101015210733147L;
    Thread aThread10210;
    static final float aFloat10211 = 2.0F;
    Runnable aRunnable10212 = new Class170(this);
    Runnable aRunnable10213 = new Class177(this);
    
    public int method7031(Object object, int i) {
	long l = Class50.method1249((byte) 1);
	int i_0_ = (int) (180000.0F
			  / ((float) (l - (((Class393_Sub1) this).aLong10209
					   * 3116109862644624941L))
			     / 1000.0F));
	((Class393_Sub1) this).aLong10209 = -1958101015210733147L * l;
	return i_0_;
    }
    
    public Class393_Sub1(Class493 class493) {
	((Class393_Sub1) this).aClass308_10207 = new Class308(this);
	((Class393_Sub1) this).aHashMap10206 = new HashMap();
	Iterator iterator = class493.aHashMap6518.keySet().iterator();
	while (iterator.hasNext()) {
	    Class301 class301 = (Class301) iterator.next();
	    ((Class393_Sub1) this).aHashMap10206.put(class301,
						     (new Class225
						      [((Integer)
							class493
							    .aHashMap6518
							    .get(class301))
							   .intValue()]));
	}
	iterator = ((Class393_Sub1) this).aHashMap10206.keySet().iterator();
	while (iterator.hasNext()) {
	    Class301 class301 = (Class301) iterator.next();
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub1) this).aHashMap10206.get(class301));
	    for (int i = 0; i < class225s.length; i++) {
		Class57 class57 = new Class57(2.0F);
		class57.method325(0, Class320.aClass320_4878,
				  Class329.aClass329_5031, 2);
		class225s[i] = new Class225(class301, 32768, 3, class57, this);
	    }
	}
	((Class393_Sub1) this).aThread10210
	    = new Thread(((Class393_Sub1) this).aRunnable10213);
	((Class393_Sub1) this).aThread10208
	    = new Thread(((Class393_Sub1) this).aRunnable10212);
	((Class393_Sub1) this).aThread10210.setPriority(1);
	((Class393_Sub1) this).aThread10208.setPriority(1);
	((Class393_Sub1) this).aThread10210.start();
	((Class393_Sub1) this).aThread10208.start();
    }
    
    public void method7045(int i) {
	if (((Class393_Sub1) this).aClass308_10207 != null)
	    ((Class393_Sub1) this).aClass308_10207.method5856(826129773);
	Iterator iterator
	    = ((Class393_Sub1) this).aHashMap10206.keySet().iterator();
	while (iterator.hasNext()) {
	    Class301 class301 = (Class301) iterator.next();
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub1) this).aHashMap10206.get(class301));
	    if (!class301.aBool4618) {
		boolean bool = false;
		for (int i_1_ = 0; i_1_ < class225s.length; i_1_++) {
		    class225s[i_1_].method4520(-1759934789);
		    bool |= class225s[i_1_].method4519(792952663);
		}
		if (bool)
		    Arrays.sort(class225s, new Class176(this));
	    }
	    int i_2_ = 3;
	    boolean bool = false;
	    int i_3_ = class225s.length - 1;
	    while (false == bool) {
		float f = class225s[i_3_].method4517(-1967178452);
		Class239 class239 = class225s[i_3_].method4597(2144422350);
		if (f < 0.0F) {
		    if (class239 == Class239.aClass239_2759
			|| class239 == Class239.aClass239_2761
			|| class239 == Class239.aClass239_2764)
			class225s[i_3_].method4513((short) 26920);
		} else
		    bool = true;
		if (--i_3_ < 0)
		    bool = true;
	    }
	    if (i_3_ >= class225s.length - i_2_) {
		for (/**/; i_3_ >= class225s.length - i_2_; i_3_--) {
		    Class239 class239 = class225s[i_3_].method4597(2144422350);
		    if (Class239.aClass239_2759 == class239)
			class225s[i_3_].method4513((short) 6301);
		}
	    }
	}
    }
    
    public Class308 method7050() {
	return ((Class393_Sub1) this).aClass308_10207;
    }
    
    public void method7037(Object object, byte[] is, int i, int i_4_) {
	/* empty */
    }
    
    public void method7027(Object object, int i) {
	/* empty */
    }
    
    public void method7028(Object object, byte[] is, int i, int i_5_,
			   byte i_6_) {
	/* empty */
    }
    
    public Class225 method7030(Class301 class301, byte i) {
	synchronized (((Class393_Sub1) this).aHashMap10206) {
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub1) this).aHashMap10206.get(class301));
	    if (class225s == null) {
		Class225 class225 = null;
		return class225;
	    }
	    for (int i_7_ = 0; i_7_ < class225s.length; i_7_++) {
		Class225 class225 = class225s[i_7_];
		Class239 class239 = class225.method4597(2144422350);
		if (class239 == Class239.aClass239_2762) {
		    class225.method4507(-1405668753);
		    Class225 class225_8_ = class225;
		    return class225_8_;
		}
	    }
	}
	return null;
    }
    
    Object method7040(Class322 class322, int i) {
	return null;
    }
    
    public Class308 method7032(int i) {
	return ((Class393_Sub1) this).aClass308_10207;
    }
    
    public Class308 method7051() {
	return ((Class393_Sub1) this).aClass308_10207;
    }
    
    public void method7034() {
	HashMap hashmap = method16514(186323026);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class301 class301 = (Class301) iterator.next();
		Class225[] class225s = (Class225[]) hashmap.get(class301);
		for (int i = 0; i < class225s.length; i++) {
		    if (class225s[i].method4597(2144422350)
			!= Class239.aClass239_2762) {
			class225s[i].method4513((short) 9628);
			class225s[i].method4508((byte) -119);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    Class225[] class225s = (Class225[]) hashmap.get(class301);
		    for (int i = 0; i < class225s.length; i++) {
			if (class225s[i].method4597(2144422350)
			    != Class239.aClass239_2762) {
			    class225s[i].method4520(505571206);
			    bool = false;
			}
		    }
		}
	    }
	    Class380_Sub2.method16722(10L);
	}
	((Class393_Sub1) this).aBool10205 = true;
	try {
	    ((Class393_Sub1) this).aThread10210.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class393_Sub1) this).aThread10208.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method7024() {
	if (((Class393_Sub1) this).aClass308_10207 != null)
	    ((Class393_Sub1) this).aClass308_10207.method5856(-432573022);
	Iterator iterator
	    = ((Class393_Sub1) this).aHashMap10206.keySet().iterator();
	while (iterator.hasNext()) {
	    Class301 class301 = (Class301) iterator.next();
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub1) this).aHashMap10206.get(class301));
	    if (!class301.aBool4618) {
		boolean bool = false;
		for (int i = 0; i < class225s.length; i++) {
		    class225s[i].method4520(466986237);
		    bool |= class225s[i].method4519(792952663);
		}
		if (bool)
		    Arrays.sort(class225s, new Class176(this));
	    }
	    int i = 3;
	    boolean bool = false;
	    int i_9_ = class225s.length - 1;
	    while (false == bool) {
		float f = class225s[i_9_].method4517(584919392);
		Class239 class239 = class225s[i_9_].method4597(2144422350);
		if (f < 0.0F) {
		    if (class239 == Class239.aClass239_2759
			|| class239 == Class239.aClass239_2761
			|| class239 == Class239.aClass239_2764)
			class225s[i_9_].method4513((short) 23671);
		} else
		    bool = true;
		if (--i_9_ < 0)
		    bool = true;
	    }
	    if (i_9_ >= class225s.length - i) {
		for (/**/; i_9_ >= class225s.length - i; i_9_--) {
		    Class239 class239 = class225s[i_9_].method4597(2144422350);
		    if (Class239.aClass239_2759 == class239)
			class225s[i_9_].method4513((short) 14365);
		}
	    }
	}
    }
    
    public Object method7042(int i, int i_10_, Class320 class320,
			     Class329 class329, int i_11_, float f) {
	return new Object();
    }
    
    public Object method7036(int i, int i_12_, Class320 class320,
			     Class329 class329, int i_13_, float f) {
	return new Object();
    }
    
    public void method7046(byte i) {
	HashMap hashmap = method16514(913589928);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class301 class301 = (Class301) iterator.next();
		Class225[] class225s = (Class225[]) hashmap.get(class301);
		for (int i_14_ = 0; i_14_ < class225s.length; i_14_++) {
		    if (class225s[i_14_].method4597(2144422350)
			!= Class239.aClass239_2762) {
			class225s[i_14_].method4513((short) 15065);
			class225s[i_14_].method4508((byte) -23);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    Class225[] class225s = (Class225[]) hashmap.get(class301);
		    for (int i_15_ = 0; i_15_ < class225s.length; i_15_++) {
			if (class225s[i_15_].method4597(2144422350)
			    != Class239.aClass239_2762) {
			    class225s[i_15_].method4520(-1231298519);
			    bool = false;
			}
		    }
		}
	    }
	    Class380_Sub2.method16722(10L);
	}
	((Class393_Sub1) this).aBool10205 = true;
	try {
	    ((Class393_Sub1) this).aThread10210.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class393_Sub1) this).aThread10208.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    HashMap method16514(int i) {
	return ((Class393_Sub1) this).aHashMap10206;
    }
    
    public void method7038(Object object) {
	/* empty */
    }
    
    public void method7039(Object object) {
	/* empty */
    }
    
    public void method7047() {
	HashMap hashmap = method16514(-634343184);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class301 class301 = (Class301) iterator.next();
		Class225[] class225s = (Class225[]) hashmap.get(class301);
		for (int i = 0; i < class225s.length; i++) {
		    if (class225s[i].method4597(2144422350)
			!= Class239.aClass239_2762) {
			class225s[i].method4513((short) 7755);
			class225s[i].method4508((byte) -41);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    Class225[] class225s = (Class225[]) hashmap.get(class301);
		    for (int i = 0; i < class225s.length; i++) {
			if (class225s[i].method4597(2144422350)
			    != Class239.aClass239_2762) {
			    class225s[i].method4520(229599908);
			    bool = false;
			}
		    }
		}
	    }
	    Class380_Sub2.method16722(10L);
	}
	((Class393_Sub1) this).aBool10205 = true;
	try {
	    ((Class393_Sub1) this).aThread10210.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class393_Sub1) this).aThread10208.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method7041(Object object, byte[] is, int i, int i_16_) {
	/* empty */
    }
    
    public Class225 method7035(Class301 class301) {
	synchronized (((Class393_Sub1) this).aHashMap10206) {
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub1) this).aHashMap10206.get(class301));
	    if (class225s == null) {
		Class225 class225 = null;
		return class225;
	    }
	    for (int i = 0; i < class225s.length; i++) {
		Class225 class225 = class225s[i];
		Class239 class239 = class225.method4597(2144422350);
		if (class239 == Class239.aClass239_2762) {
		    class225.method4507(353143113);
		    Class225 class225_17_ = class225;
		    return class225_17_;
		}
	    }
	}
	return null;
    }
    
    public Class225 method7025(Class301 class301) {
	synchronized (((Class393_Sub1) this).aHashMap10206) {
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub1) this).aHashMap10206.get(class301));
	    if (class225s == null) {
		Class225 class225 = null;
		return class225;
	    }
	    for (int i = 0; i < class225s.length; i++) {
		Class225 class225 = class225s[i];
		Class239 class239 = class225.method4597(2144422350);
		if (class239 == Class239.aClass239_2762) {
		    class225.method4507(-1869978624);
		    Class225 class225_18_ = class225;
		    return class225_18_;
		}
	    }
	}
	return null;
    }
    
    Object method7043(Class322 class322) {
	return null;
    }
    
    public Class225 method7044(Class301 class301) {
	synchronized (((Class393_Sub1) this).aHashMap10206) {
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub1) this).aHashMap10206.get(class301));
	    if (class225s == null) {
		Class225 class225 = null;
		return class225;
	    }
	    for (int i = 0; i < class225s.length; i++) {
		Class225 class225 = class225s[i];
		Class239 class239 = class225.method4597(2144422350);
		if (class239 == Class239.aClass239_2762) {
		    class225.method4507(-1926624980);
		    Class225 class225_19_ = class225;
		    return class225_19_;
		}
	    }
	}
	return null;
    }
    
    public Object method7029(int i, int i_20_, Class320 class320,
			     Class329 class329, int i_21_, float f) {
	return new Object();
    }
    
    HashMap method16515() {
	return ((Class393_Sub1) this).aHashMap10206;
    }
    
    public void method7048() {
	HashMap hashmap = method16514(1924870906);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class301 class301 = (Class301) iterator.next();
		Class225[] class225s = (Class225[]) hashmap.get(class301);
		for (int i = 0; i < class225s.length; i++) {
		    if (class225s[i].method4597(2144422350)
			!= Class239.aClass239_2762) {
			class225s[i].method4513((short) 30757);
			class225s[i].method4508((byte) -63);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    Class225[] class225s = (Class225[]) hashmap.get(class301);
		    for (int i = 0; i < class225s.length; i++) {
			if (class225s[i].method4597(2144422350)
			    != Class239.aClass239_2762) {
			    class225s[i].method4520(2144689741);
			    bool = false;
			}
		    }
		}
	    }
	    Class380_Sub2.method16722(10L);
	}
	((Class393_Sub1) this).aBool10205 = true;
	try {
	    ((Class393_Sub1) this).aThread10210.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class393_Sub1) this).aThread10208.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public Class308 method7049() {
	return ((Class393_Sub1) this).aClass308_10207;
    }
    
    public Object method7026(int i, int i_22_, Class320 class320,
			     Class329 class329, int i_23_, float f,
			     byte i_24_) {
	return new Object();
    }
    
    public int method7033(Object object) {
	long l = Class50.method1249((byte) 1);
	int i = (int) (180000.0F
		       / ((float) (l - (((Class393_Sub1) this).aLong10209
					* 3116109862644624941L))
			  / 1000.0F));
	((Class393_Sub1) this).aLong10209 = -1958101015210733147L * l;
	return i;
    }
    
    public Class308 method7052() {
	return ((Class393_Sub1) this).aClass308_10207;
    }
    
    public static void method16516(int i, int i_25_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(23, (long) i);
	class241_sub39_sub13.method17278((byte) -68);
    }
}
