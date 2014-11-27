/* Class393_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class393_Sub2 extends Class393
{
    Thread aThread10258;
    static final float aFloat10259 = 2.0F;
    Class308 aClass308_10260;
    volatile boolean aBool10261 = false;
    Runnable aRunnable10262;
    Thread aThread10263;
    List aList10264 = new ArrayList();
    HashMap aHashMap10265;
    Runnable aRunnable10266;
    
    public Class308 method7050() {
	return ((Class393_Sub2) this).aClass308_10260;
    }
    
    public Class393_Sub2(Class493 class493) {
	((Class393_Sub2) this).aRunnable10262 = new Class566(this);
	((Class393_Sub2) this).aRunnable10266 = new Class572(this);
	((Class393_Sub2) this).aClass308_10260 = new Class308(this);
	((Class393_Sub2) this).aHashMap10265 = new HashMap();
	Iterator iterator = class493.aHashMap6518.keySet().iterator();
	while (iterator.hasNext()) {
	    Class301 class301 = (Class301) iterator.next();
	    ((Class393_Sub2) this).aHashMap10265.put(class301,
						     (new Class225
						      [((Integer)
							class493
							    .aHashMap6518
							    .get(class301))
							   .intValue()]));
	}
	iterator = ((Class393_Sub2) this).aHashMap10265.keySet().iterator();
	while (iterator.hasNext()) {
	    Class301 class301 = (Class301) iterator.next();
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub2) this).aHashMap10265.get(class301));
	    for (int i = 0; i < class225s.length; i++) {
		Class57 class57 = new Class57(2.0F);
		class57.method325(0, Class320.aClass320_4878,
				  Class329.aClass329_5031, 2);
		class225s[i] = new Class225(class301, 8192, 3, class57, this);
	    }
	}
	Class565 class565 = new Class565(this, 44100.0F, 32768);
	Class565 class565_0_ = new Class565(this, 22050.0F, 16384);
	((Class393_Sub2) this).aList10264.add(class565);
	((Class393_Sub2) this).aList10264.add(class565_0_);
	((Class393_Sub2) this).aThread10258
	    = new Thread(((Class393_Sub2) this).aRunnable10266);
	((Class393_Sub2) this).aThread10263
	    = new Thread(((Class393_Sub2) this).aRunnable10262);
	((Class393_Sub2) this).aThread10258.setPriority(10);
	((Class393_Sub2) this).aThread10263.setPriority(10);
	((Class393_Sub2) this).aThread10258.start();
	((Class393_Sub2) this).aThread10263.start();
    }
    
    public void method7045(int i) {
	if (((Class393_Sub2) this).aClass308_10260 != null)
	    ((Class393_Sub2) this).aClass308_10260.method5856(1502415929);
	Iterator iterator
	    = ((Class393_Sub2) this).aHashMap10265.keySet().iterator();
	while (iterator.hasNext()) {
	    Class301 class301 = (Class301) iterator.next();
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub2) this).aHashMap10265.get(class301));
	    if (!class301.aBool4618) {
		boolean bool = false;
		for (int i_1_ = 0; i_1_ < class225s.length; i_1_++) {
		    class225s[i_1_].method4520(-560109369);
		    bool |= class225s[i_1_].method4519(792952663);
		}
		if (bool)
		    Arrays.sort(class225s, new Class561(this));
	    }
	    int i_2_ = 6;
	    boolean bool = false;
	    int i_3_ = class225s.length - 1;
	    while (false == bool) {
		float f = class225s[i_3_].method4517(-680661374);
		Class239 class239 = class225s[i_3_].method4597(2144422350);
		if (f < 0.0F) {
		    if (class239 == Class239.aClass239_2759
			|| class239 == Class239.aClass239_2761
			|| class239 == Class239.aClass239_2764)
			class225s[i_3_].method4513((short) 24153);
		} else
		    bool = true;
		if (--i_3_ < 0)
		    bool = true;
	    }
	    if (i_3_ >= class225s.length - i_2_) {
		for (/**/; i_3_ >= class225s.length - i_2_; i_3_--) {
		    Class239 class239 = class225s[i_3_].method4597(2144422350);
		    if (class239 == Class239.aClass239_2759)
			class225s[i_3_].method4513((short) 15140);
		}
	    }
	}
    }
    
    public int method7031(Object object, int i) {
	if (null != object && object instanceof Class569) {
	    Class569 class569 = (Class569) object;
	    synchronized (((Class569) class569).aClass565_7340) {
		int i_4_ = class569.method12480(326644607);
		return i_4_;
	    }
	}
	return 0;
    }
    
    Class565 method16577(float f, short i) {
	float f_5_ = -1.0F;
	float f_6_ = 3.4028235E38F;
	Class565 class565 = null;
	Iterator iterator = ((Class393_Sub2) this).aList10264.iterator();
	while (iterator.hasNext()) {
	    Class565 class565_7_ = (Class565) iterator.next();
	    float f_8_ = ((Class565) class565_7_).aFloat7316;
	    float f_9_ = Math.abs(f_8_ - f);
	    if (f_5_ < 0.0F || f_9_ < f_6_) {
		f_5_ = f_8_;
		f_6_ = f_9_;
		class565 = class565_7_;
	    }
	}
	return class565;
    }
    
    public Object method7026(int i, int i_10_, Class320 class320,
			     Class329 class329, int i_11_, float f,
			     byte i_12_) {
	Class565 class565 = method16577(f * (float) i_10_, (short) -4623);
	Class569 class569
	    = new Class569(this, class565, i_11_, (float) i_10_ * f,
			   -32980023 * class320.anInt4875, i < 2 ? 2 : i,
			   (class320 == Class320.aClass320_4878
			    || class320 == Class320.aClass320_4873),
			   class329 == Class329.aClass329_5032);
	synchronized (((Class569) class569).aClass565_7340) {
	    ((Class569) class569).aClass565_7340.method12424(class569,
							     360799241);
	}
	return class569;
    }
    
    public void method7027(Object object, int i) {
	if (object != null && object instanceof Class569) {
	    Class569 class569 = (Class569) object;
	    synchronized (((Class569) class569).aClass565_7340) {
		((Class569) class569).aClass565_7340.method12425(class569,
								 1654109115);
	    }
	}
    }
    
    public void method7028(Object object, byte[] is, int i, int i_13_,
			   byte i_14_) {
	if (object != null && object instanceof Class569) {
	    Class569 class569 = (Class569) object;
	    synchronized (((Class569) class569).aClass565_7340) {
		class569.method12479(is, i, i_13_, -2035725524);
	    }
	}
    }
    
    public Class225 method7030(Class301 class301, byte i) {
	synchronized (((Class393_Sub2) this).aHashMap10265) {
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub2) this).aHashMap10265.get(class301));
	    if (null == class225s) {
		Class225 class225 = null;
		return class225;
	    }
	    for (int i_15_ = 0; i_15_ < class225s.length; i_15_++) {
		Class225 class225 = class225s[i_15_];
		Class239 class239 = class225.method4597(2144422350);
		if (Class239.aClass239_2762 == class239) {
		    class225.method4507(-1272115566);
		    Class225 class225_16_ = class225;
		    return class225_16_;
		}
	    }
	}
	return null;
    }
    
    Object method7040(Class322 class322, int i) {
	return null;
    }
    
    public void method7037(Object object, byte[] is, int i, int i_17_) {
	if (object != null && object instanceof Class569) {
	    Class569 class569 = (Class569) object;
	    synchronized (((Class569) class569).aClass565_7340) {
		class569.method12479(is, i, i_17_, -1998439670);
	    }
	}
    }
    
    public void method7046(byte i) {
	HashMap hashmap = method16579(287613289);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class301 class301 = (Class301) iterator.next();
		Class225[] class225s = (Class225[]) hashmap.get(class301);
		for (int i_18_ = 0; i_18_ < class225s.length; i_18_++) {
		    if (class225s[i_18_].method4597(2144422350)
			!= Class239.aClass239_2762) {
			class225s[i_18_].method4513((short) 29845);
			class225s[i_18_].method4508((byte) -54);
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
		    for (int i_19_ = 0; i_19_ < class225s.length; i_19_++) {
			if (class225s[i_19_].method4597(2144422350)
			    != Class239.aClass239_2762) {
			    class225s[i_19_].method4520(-1711777958);
			    bool = false;
			}
		    }
		}
	    }
	    Class380_Sub2.method16722(10L);
	}
	((Class393_Sub2) this).aBool10261 = true;
	try {
	    ((Class393_Sub2) this).aThread10258.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class393_Sub2) this).aThread10263.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public Class225 method7035(Class301 class301) {
	synchronized (((Class393_Sub2) this).aHashMap10265) {
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub2) this).aHashMap10265.get(class301));
	    if (null == class225s) {
		Class225 class225 = null;
		return class225;
	    }
	    for (int i = 0; i < class225s.length; i++) {
		Class225 class225 = class225s[i];
		Class239 class239 = class225.method4597(2144422350);
		if (Class239.aClass239_2762 == class239) {
		    class225.method4507(-565477541);
		    Class225 class225_20_ = class225;
		    return class225_20_;
		}
	    }
	}
	return null;
    }
    
    public Class308 method7052() {
	return ((Class393_Sub2) this).aClass308_10260;
    }
    
    public Class308 method7051() {
	return ((Class393_Sub2) this).aClass308_10260;
    }
    
    public Object method7036(int i, int i_21_, Class320 class320,
			     Class329 class329, int i_22_, float f) {
	Class565 class565 = method16577(f * (float) i_21_, (short) 9744);
	Class569 class569
	    = new Class569(this, class565, i_22_, (float) i_21_ * f,
			   -32980023 * class320.anInt4875, i < 2 ? 2 : i,
			   (class320 == Class320.aClass320_4878
			    || class320 == Class320.aClass320_4873),
			   class329 == Class329.aClass329_5032);
	synchronized (((Class569) class569).aClass565_7340) {
	    ((Class569) class569).aClass565_7340.method12424(class569,
							     1721784750);
	}
	return class569;
    }
    
    public Object method7042(int i, int i_23_, Class320 class320,
			     Class329 class329, int i_24_, float f) {
	Class565 class565 = method16577(f * (float) i_23_, (short) 1784);
	Class569 class569
	    = new Class569(this, class565, i_24_, (float) i_23_ * f,
			   -32980023 * class320.anInt4875, i < 2 ? 2 : i,
			   (class320 == Class320.aClass320_4878
			    || class320 == Class320.aClass320_4873),
			   class329 == Class329.aClass329_5032);
	synchronized (((Class569) class569).aClass565_7340) {
	    ((Class569) class569).aClass565_7340.method12424(class569,
							     -185210698);
	}
	return class569;
    }
    
    public void method7038(Object object) {
	if (object != null && object instanceof Class569) {
	    Class569 class569 = (Class569) object;
	    synchronized (((Class569) class569).aClass565_7340) {
		((Class569) class569).aClass565_7340.method12425(class569,
								 -643587612);
	    }
	}
    }
    
    public void method7039(Object object) {
	if (object != null && object instanceof Class569) {
	    Class569 class569 = (Class569) object;
	    synchronized (((Class569) class569).aClass565_7340) {
		((Class569) class569).aClass565_7340.method12425(class569,
								 -374216437);
	    }
	}
    }
    
    public Class308 method7049() {
	return ((Class393_Sub2) this).aClass308_10260;
    }
    
    public void method7024() {
	if (((Class393_Sub2) this).aClass308_10260 != null)
	    ((Class393_Sub2) this).aClass308_10260.method5856(-544321224);
	Iterator iterator
	    = ((Class393_Sub2) this).aHashMap10265.keySet().iterator();
	while (iterator.hasNext()) {
	    Class301 class301 = (Class301) iterator.next();
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub2) this).aHashMap10265.get(class301));
	    if (!class301.aBool4618) {
		boolean bool = false;
		for (int i = 0; i < class225s.length; i++) {
		    class225s[i].method4520(-1635172801);
		    bool |= class225s[i].method4519(792952663);
		}
		if (bool)
		    Arrays.sort(class225s, new Class561(this));
	    }
	    int i = 6;
	    boolean bool = false;
	    int i_25_ = class225s.length - 1;
	    while (false == bool) {
		float f = class225s[i_25_].method4517(-1968789057);
		Class239 class239 = class225s[i_25_].method4597(2144422350);
		if (f < 0.0F) {
		    if (class239 == Class239.aClass239_2759
			|| class239 == Class239.aClass239_2761
			|| class239 == Class239.aClass239_2764)
			class225s[i_25_].method4513((short) 12858);
		} else
		    bool = true;
		if (--i_25_ < 0)
		    bool = true;
	    }
	    if (i_25_ >= class225s.length - i) {
		for (/**/; i_25_ >= class225s.length - i; i_25_--) {
		    Class239 class239
			= class225s[i_25_].method4597(2144422350);
		    if (class239 == Class239.aClass239_2759)
			class225s[i_25_].method4513((short) 32120);
		}
	    }
	}
    }
    
    HashMap method16578() {
	return ((Class393_Sub2) this).aHashMap10265;
    }
    
    public Class225 method7025(Class301 class301) {
	synchronized (((Class393_Sub2) this).aHashMap10265) {
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub2) this).aHashMap10265.get(class301));
	    if (null == class225s) {
		Class225 class225 = null;
		return class225;
	    }
	    for (int i = 0; i < class225s.length; i++) {
		Class225 class225 = class225s[i];
		Class239 class239 = class225.method4597(2144422350);
		if (Class239.aClass239_2762 == class239) {
		    class225.method4507(1854876792);
		    Class225 class225_26_ = class225;
		    return class225_26_;
		}
	    }
	}
	return null;
    }
    
    HashMap method16579(int i) {
	return ((Class393_Sub2) this).aHashMap10265;
    }
    
    Object method7043(Class322 class322) {
	return null;
    }
    
    public void method7034() {
	HashMap hashmap = method16579(287613289);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class301 class301 = (Class301) iterator.next();
		Class225[] class225s = (Class225[]) hashmap.get(class301);
		for (int i = 0; i < class225s.length; i++) {
		    if (class225s[i].method4597(2144422350)
			!= Class239.aClass239_2762) {
			class225s[i].method4513((short) 10335);
			class225s[i].method4508((byte) -70);
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
			    class225s[i].method4520(920714187);
			    bool = false;
			}
		    }
		}
	    }
	    Class380_Sub2.method16722(10L);
	}
	((Class393_Sub2) this).aBool10261 = true;
	try {
	    ((Class393_Sub2) this).aThread10258.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class393_Sub2) this).aThread10263.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method7047() {
	HashMap hashmap = method16579(287613289);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class301 class301 = (Class301) iterator.next();
		Class225[] class225s = (Class225[]) hashmap.get(class301);
		for (int i = 0; i < class225s.length; i++) {
		    if (class225s[i].method4597(2144422350)
			!= Class239.aClass239_2762) {
			class225s[i].method4513((short) 30361);
			class225s[i].method4508((byte) -64);
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
			    class225s[i].method4520(515561082);
			    bool = false;
			}
		    }
		}
	    }
	    Class380_Sub2.method16722(10L);
	}
	((Class393_Sub2) this).aBool10261 = true;
	try {
	    ((Class393_Sub2) this).aThread10258.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class393_Sub2) this).aThread10263.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method7048() {
	HashMap hashmap = method16579(287613289);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class301 class301 = (Class301) iterator.next();
		Class225[] class225s = (Class225[]) hashmap.get(class301);
		for (int i = 0; i < class225s.length; i++) {
		    if (class225s[i].method4597(2144422350)
			!= Class239.aClass239_2762) {
			class225s[i].method4513((short) 10824);
			class225s[i].method4508((byte) -81);
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
			    class225s[i].method4520(466555360);
			    bool = false;
			}
		    }
		}
	    }
	    Class380_Sub2.method16722(10L);
	}
	((Class393_Sub2) this).aBool10261 = true;
	try {
	    ((Class393_Sub2) this).aThread10258.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class393_Sub2) this).aThread10263.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    HashMap method16580() {
	return ((Class393_Sub2) this).aHashMap10265;
    }
    
    public void method7041(Object object, byte[] is, int i, int i_27_) {
	if (object != null && object instanceof Class569) {
	    Class569 class569 = (Class569) object;
	    synchronized (((Class569) class569).aClass565_7340) {
		class569.method12479(is, i, i_27_, -2096915104);
	    }
	}
    }
    
    public int method7033(Object object) {
	if (null != object && object instanceof Class569) {
	    Class569 class569 = (Class569) object;
	    synchronized (((Class569) class569).aClass565_7340) {
		int i = class569.method12480(326991661);
		return i;
	    }
	}
	return 0;
    }
    
    public Object method7029(int i, int i_28_, Class320 class320,
			     Class329 class329, int i_29_, float f) {
	Class565 class565 = method16577(f * (float) i_28_, (short) 7317);
	Class569 class569
	    = new Class569(this, class565, i_29_, (float) i_28_ * f,
			   -32980023 * class320.anInt4875, i < 2 ? 2 : i,
			   (class320 == Class320.aClass320_4878
			    || class320 == Class320.aClass320_4873),
			   class329 == Class329.aClass329_5032);
	synchronized (((Class569) class569).aClass565_7340) {
	    ((Class569) class569).aClass565_7340.method12424(class569,
							     -137945115);
	}
	return class569;
    }
    
    public Class225 method7044(Class301 class301) {
	synchronized (((Class393_Sub2) this).aHashMap10265) {
	    Class225[] class225s
		= ((Class225[])
		   ((Class393_Sub2) this).aHashMap10265.get(class301));
	    if (null == class225s) {
		Class225 class225 = null;
		return class225;
	    }
	    for (int i = 0; i < class225s.length; i++) {
		Class225 class225 = class225s[i];
		Class239 class239 = class225.method4597(2144422350);
		if (Class239.aClass239_2762 == class239) {
		    class225.method4507(47971066);
		    Class225 class225_30_ = class225;
		    return class225_30_;
		}
	    }
	}
	return null;
    }
    
    public Class308 method7032(int i) {
	return ((Class393_Sub2) this).aClass308_10260;
    }
    
    static int method16581(byte[] data, int offset, int length, byte i_32_) {
		int i_33_ = -1;
		for (int index = offset; index < length; index++) {
		    i_33_ = i_33_ >>> 8 ^ RSByteBuffer.anIntArray8798[(i_33_ ^ data[index]) & 0xff];
		}
		i_33_ ^= 0xffffffff;
		return i_33_;
    }
    
    static final void method16582(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class246.method4941(class58, class35, class454, (byte) -58);
    }
}
