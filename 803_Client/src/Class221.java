/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class221
{
    boolean aBool2567;
    float aFloat2568;
    float aFloat2569;
    Class393 aClass393_2570;
    List aList2571;
    Object anObject2572;
    Class287 aClass287_2573;
    int anInt2574;
    int anInt2575;
    int anInt2576;
    float aFloat2577;
    Interface20 anInterface20_2578;
    float aFloat2579;
    boolean aBool2580;
    int anInt2581;
    boolean aBool2582;
    Object anObject2583;
    Class223 aClass223_2584 = Class223.aClass223_2599;
    Interface52 anInterface52_2585;
    
    public void method4387() {
	if (!((Class221) this).aBool2567
	    && (Class223.aClass223_2601 != ((Class221) this).aClass223_2584
		&& Class223.aClass223_2602 != ((Class221) this).aClass223_2584
		&& ((Class221) this).aClass223_2584 != Class223.aClass223_2599
		&& ((Class221) this).aClass223_2584 != Class223.aClass223_2598)
	    && ((((Class221) this).aClass223_2584.anInt2603 * 2103253931
		 <= Class223.aClass223_2594.anInt2603 * 2103253931)
		|| (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		    >= 2103253931 * Class223.aClass223_2596.anInt2603)))
	    ((Class221) this).aClass223_2584 = Class223.aClass223_2595;
    }
    
    void method4388(byte i) {
	((Class221) this).anInterface52_2585 = null;
	((Class221) this).aClass223_2584 = Class223.aClass223_2599;
	((Class221) this).aBool2567 = false;
	((Class221) this).aList2571.clear();
	((Class221) this).anObject2572 = null;
	((Class221) this).aClass287_2573 = null;
	((Class221) this).anInt2574 = 47519429;
	((Class221) this).aBool2580 = false;
	((Class221) this).anInt2576 = 0;
	((Class221) this).aFloat2569 = 0.0F;
	((Class221) this).anInterface20_2578 = null;
	((Class221) this).aFloat2579 = 0.0F;
	((Class221) this).aFloat2577 = 0.0F;
	((Class221) this).anInt2581 = 0;
	((Class221) this).aBool2582 = false;
	((Class221) this).anObject2583 = null;
	((Class221) this).anInt2575 = 0;
	((Class221) this).aFloat2568 = 1.0F;
    }
    
    public Interface52 method4389() {
	return ((Class221) this).anInterface52_2585;
    }
    
    public void method4390(int i) {
	if (((Class221) this).aClass223_2584 != Class223.aClass223_2596
	    && Class223.aClass223_2600 != ((Class221) this).aClass223_2584)
	    method4405(0, -938332436);
	Iterator iterator = ((Class221) this).aList2571.iterator();
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-1848785828) != this)
		iterator.remove();
	    else
		class225.method4508((byte) -57);
	}
	method4388((byte) 4);
	((Class221) this).aClass223_2584 = Class223.aClass223_2602;
    }
    
    public void method4391(Object object) {
	((Class221) this).anObject2572 = object;
    }
    
    public void method4392(int i) {
	if (Class223.aClass223_2601 != ((Class221) this).aClass223_2584
	    && Class223.aClass223_2602 != ((Class221) this).aClass223_2584
	    && Class223.aClass223_2599 != ((Class221) this).aClass223_2584
	    && ((Class221) this).aClass223_2584 != Class223.aClass223_2598) {
	    if ((((Class221) this).aClass223_2584 == Class223.aClass223_2595
		 || (Class223.aClass223_2593
		     == ((Class221) this).aClass223_2584))
		&& !((Class221) this).aBool2567)
		((Class221) this).aBool2567 = true;
	    else if ((2103253931 * ((Class221) this).aClass223_2584.anInt2603
		      < Class223.aClass223_2595.anInt2603 * 2103253931)
		     || ((2103253931
			  * ((Class221) this).aClass223_2584.anInt2603)
			 >= Class223.aClass223_2596.anInt2603 * 2103253931)) {
		((Class221) this).aClass223_2584 = Class223.aClass223_2595;
		((Class221) this).aBool2567 = true;
	    }
	}
    }
    
    public void method4393(boolean bool, byte i) {
	/* empty */
    }
    
    public void method4394(int i) {
	Iterator iterator = ((Class221) this).aList2571.iterator();
	((Class221) this).aClass223_2584 = Class223.aClass223_2596;
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-1183386229) == this)
		class225.method4526(-963953270);
	}
    }
    
    public void method4395(byte i) {
	Iterator iterator = ((Class221) this).aList2571.iterator();
	((Class221) this).aClass223_2584 = Class223.aClass223_2595;
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-1935444833) == this)
		class225.method4527(-404218621);
	}
    }
    
    public void method4396(Interface20 interface20, int i) {
	((Class221) this).anInterface20_2578 = interface20;
    }
    
    public void method4397(int i) {
	if (((Class221) this).aClass223_2584 == Class223.aClass223_2595) {
	    Class508 class508
		= ((Class221) this).anInterface52_2585.method373((byte) 1);
	    if (class508 == Class508.aClass508_6672)
		((Class221) this).aClass223_2584 = Class223.aClass223_2593;
	}
	if (Class223.aClass223_2593 == ((Class221) this).aClass223_2584
	    && true == ((Class221) this).aBool2567) {
	    Class225 class225 = (((Class221) this).aClass393_2570.method7030
				 (((Class221) this).anInterface52_2585
				      .method377(-1497275714),
				  (byte) 5));
	    if (null != class225) {
		boolean bool = ((Class221) this).anInterface52_2585
				   .method414(-1212250703);
		Class298 class298 = new Class298(this);
		boolean bool_0_
		    = (class225.method4511
		       (bool ? null : ((Class221) this).anInterface52_2585
					  .method375(0, 317474291),
			bool ? class298 : null,
			((Class221) this).anInt2574 * 1835796467,
			(((Class221) this).anInt2575 * 1609877885 > 0 ? 0.0F
			 : ((Class221) this).aFloat2569),
			false, ((Class221) this).aBool2580,
			2022594045 * ((Class221) this).anInt2576,
			((Class221) this).aFloat2568, this, -1307922799));
		if (true == bool_0_) {
		    ((Class221) this).aClass223_2584 = Class223.aClass223_2597;
		    class225.method4571(((Class221) this).anInterface20_2578,
					-521884595);
		    class225.method4565(((Class221) this).aFloat2569,
					(((Class221) this).anInt2575
					 * 1609877885),
					439139681);
		    class225.method4512(-1533605373);
		    ((Class221) this).aList2571.add(class225);
		    ((Class221) this).aBool2567 = false;
		} else {
		    if (class225.method4597(2144422350)
			== Class239.aClass239_2765)
			((Class221) this).aClass223_2584
			    = Class223.aClass223_2600;
		    class225.method4508((byte) -23);
		}
	    }
	}
	Iterator iterator = ((Class221) this).aList2571.iterator();
	boolean bool = true;
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-1750185348) != this)
		iterator.remove();
	    else {
		if (Class223.aClass223_2598
		    == ((Class221) this).aClass223_2584) {
		    if (class225.method4510((byte) 106) == 0.0F)
			class225.method4513((short) 32431);
		    else
			bool = false;
		}
		if (class225.method4588((byte) 21) == true
		    || class225.method4505((byte) 110) == true) {
		    class225.method4508((byte) -87);
		    iterator.remove();
		} else
		    bool = false;
	    }
	}
	if (bool
	    && (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		>= Class223.aClass223_2597.anInt2603 * 2103253931)
	    && (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		< Class223.aClass223_2596.anInt2603 * 2103253931)) {
	    if (Class223.aClass223_2598 == ((Class221) this).aClass223_2584)
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
	    else
		((Class221) this).aClass223_2584 = Class223.aClass223_2600;
	}
    }
    
    public Class223 method4398(int i) {
	return ((Class221) this).aClass223_2584;
    }
    
    public Object method4399() {
	return ((Class221) this).anObject2583;
    }
    
    public Object method4400(int i) {
	return ((Class221) this).anObject2572;
    }
    
    public void method4401(Object object, int i) {
	((Class221) this).anObject2583 = object;
    }
    
    public Object method4402(byte i) {
	return ((Class221) this).anObject2583;
    }
    
    public int method4403(byte i) {
	return ((Class221) this).anInt2574 * 1835796467;
    }
    
    public void method4404(boolean bool) {
	/* empty */
    }
    
    public void method4405(int i, int i_1_) {
	if (((Class221) this).aClass223_2584.anInt2603 * 2103253931
	    < Class223.aClass223_2596.anInt2603 * 2103253931) {
	    if (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		< Class223.aClass223_2597.anInt2603 * 2103253931) {
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
		((Class221) this).aBool2567 = false;
	    } else if (i <= 0) {
		Iterator iterator = ((Class221) this).aList2571.iterator();
		while (iterator.hasNext()) {
		    Class225 class225 = (Class225) iterator.next();
		    if (class225.method4521(-343907620) != this)
			iterator.remove();
		    else
			class225.method4513((short) 25569);
		}
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
		((Class221) this).aBool2567 = false;
	    } else {
		((Class221) this).aClass223_2584 = Class223.aClass223_2598;
		Iterator iterator = ((Class221) this).aList2571.iterator();
		while (iterator.hasNext()) {
		    Class225 class225 = (Class225) iterator.next();
		    if (class225.method4521(-940356562) != this)
			iterator.remove();
		    else
			class225.method4565(0.0F, i, 439139681);
		}
	    }
	}
    }
    
    public float method4406(int i) {
	return ((Class221) this).aFloat2577;
    }
    
    public void method4407(Class287 class287, int i) {
	((Class221) this).aClass287_2573 = class287;
    }
    
    public Class287 method4408(int i) {
	return ((Class221) this).aClass287_2573;
    }
    
    public float method4409(int i) {
	return ((Class221) this).aFloat2579;
    }
    
    public Object method4410() {
	return ((Class221) this).anObject2572;
    }
    
    public void method4411(float f, int i) {
	((Class221) this).aFloat2579 = f;
    }
    
    public void method4412(float f, byte i) {
	((Class221) this).aFloat2577 = f;
    }
    
    public void method4413(int i, boolean bool, byte i_2_) {
	((Class221) this).aBool2582 = bool;
	((Class221) this).anInt2581 = i * -2141464245;
    }
    
    public boolean method4414(int i) {
	((Class221) this).aBool2582 = false;
	return -867309469 * ((Class221) this).anInt2581 != 0;
    }
    
    public void method4415(int i) {
	if (-867309469 * ((Class221) this).anInt2581 > -1
	    && !((Class221) this).aBool2582)
	    ((Class221) this).anInt2581 -= -2141464245;
	if (((Class221) this).anInt2581 * -867309469 == 0)
	    method4392(2063822846);
    }
    
    public void method4416(Object object, byte i) {
	((Class221) this).anObject2572 = object;
    }
    
    public void method4417(boolean bool, int i, byte i_3_) {
	((Class221) this).aBool2580 = bool;
	((Class221) this).anInt2576 = 721694549 * i;
    }
    
    public Interface52 method4418(byte i) {
	return ((Class221) this).anInterface52_2585;
    }
    
    void method4419() {
	((Class221) this).anInterface52_2585 = null;
	((Class221) this).aClass223_2584 = Class223.aClass223_2599;
	((Class221) this).aBool2567 = false;
	((Class221) this).aList2571.clear();
	((Class221) this).anObject2572 = null;
	((Class221) this).aClass287_2573 = null;
	((Class221) this).anInt2574 = 47519429;
	((Class221) this).aBool2580 = false;
	((Class221) this).anInt2576 = 0;
	((Class221) this).aFloat2569 = 0.0F;
	((Class221) this).anInterface20_2578 = null;
	((Class221) this).aFloat2579 = 0.0F;
	((Class221) this).aFloat2577 = 0.0F;
	((Class221) this).anInt2581 = 0;
	((Class221) this).aBool2582 = false;
	((Class221) this).anObject2583 = null;
	((Class221) this).anInt2575 = 0;
	((Class221) this).aFloat2568 = 1.0F;
    }
    
    public Object method4420() {
	return ((Class221) this).anObject2583;
    }
    
    public void method4421(Interface52 interface52) {
	((Class221) this).anInterface52_2585 = interface52;
	((Class221) this).aFloat2569 = 0.0F;
	((Class221) this).aClass223_2584 = Class223.aClass223_2594;
    }
    
    public void method4422(int i) {
	if (((Class221) this).aClass223_2584.anInt2603 * 2103253931
	    < Class223.aClass223_2596.anInt2603 * 2103253931) {
	    if (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		< Class223.aClass223_2597.anInt2603 * 2103253931) {
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
		((Class221) this).aBool2567 = false;
	    } else if (i <= 0) {
		Iterator iterator = ((Class221) this).aList2571.iterator();
		while (iterator.hasNext()) {
		    Class225 class225 = (Class225) iterator.next();
		    if (class225.method4521(-1911471375) != this)
			iterator.remove();
		    else
			class225.method4513((short) 17667);
		}
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
		((Class221) this).aBool2567 = false;
	    } else {
		((Class221) this).aClass223_2584 = Class223.aClass223_2598;
		Iterator iterator = ((Class221) this).aList2571.iterator();
		while (iterator.hasNext()) {
		    Class225 class225 = (Class225) iterator.next();
		    if (class225.method4521(-1933317801) != this)
			iterator.remove();
		    else
			class225.method4565(0.0F, i, 439139681);
		}
	    }
	}
    }
    
    public void method4423() {
	if (!((Class221) this).aBool2567
	    && (Class223.aClass223_2601 != ((Class221) this).aClass223_2584
		&& Class223.aClass223_2602 != ((Class221) this).aClass223_2584
		&& ((Class221) this).aClass223_2584 != Class223.aClass223_2599
		&& ((Class221) this).aClass223_2584 != Class223.aClass223_2598)
	    && ((((Class221) this).aClass223_2584.anInt2603 * 2103253931
		 <= Class223.aClass223_2594.anInt2603 * 2103253931)
		|| (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		    >= 2103253931 * Class223.aClass223_2596.anInt2603)))
	    ((Class221) this).aClass223_2584 = Class223.aClass223_2595;
    }
    
    public void method4424() {
	if (!((Class221) this).aBool2567
	    && (Class223.aClass223_2601 != ((Class221) this).aClass223_2584
		&& Class223.aClass223_2602 != ((Class221) this).aClass223_2584
		&& ((Class221) this).aClass223_2584 != Class223.aClass223_2599
		&& ((Class221) this).aClass223_2584 != Class223.aClass223_2598)
	    && ((((Class221) this).aClass223_2584.anInt2603 * 2103253931
		 <= Class223.aClass223_2594.anInt2603 * 2103253931)
		|| (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		    >= 2103253931 * Class223.aClass223_2596.anInt2603)))
	    ((Class221) this).aClass223_2584 = Class223.aClass223_2595;
    }
    
    public void method4425() {
	if (Class223.aClass223_2601 != ((Class221) this).aClass223_2584
	    && Class223.aClass223_2602 != ((Class221) this).aClass223_2584
	    && Class223.aClass223_2599 != ((Class221) this).aClass223_2584
	    && ((Class221) this).aClass223_2584 != Class223.aClass223_2598) {
	    if ((((Class221) this).aClass223_2584 == Class223.aClass223_2595
		 || (Class223.aClass223_2593
		     == ((Class221) this).aClass223_2584))
		&& !((Class221) this).aBool2567)
		((Class221) this).aBool2567 = true;
	    else if ((2103253931 * ((Class221) this).aClass223_2584.anInt2603
		      < Class223.aClass223_2595.anInt2603 * 2103253931)
		     || ((2103253931
			  * ((Class221) this).aClass223_2584.anInt2603)
			 >= Class223.aClass223_2596.anInt2603 * 2103253931)) {
		((Class221) this).aClass223_2584 = Class223.aClass223_2595;
		((Class221) this).aBool2567 = true;
	    }
	}
    }
    
    public void method4426() {
	if (Class223.aClass223_2601 != ((Class221) this).aClass223_2584
	    && Class223.aClass223_2602 != ((Class221) this).aClass223_2584
	    && Class223.aClass223_2599 != ((Class221) this).aClass223_2584
	    && ((Class221) this).aClass223_2584 != Class223.aClass223_2598) {
	    if ((((Class221) this).aClass223_2584 == Class223.aClass223_2595
		 || (Class223.aClass223_2593
		     == ((Class221) this).aClass223_2584))
		&& !((Class221) this).aBool2567)
		((Class221) this).aBool2567 = true;
	    else if ((2103253931 * ((Class221) this).aClass223_2584.anInt2603
		      < Class223.aClass223_2595.anInt2603 * 2103253931)
		     || ((2103253931
			  * ((Class221) this).aClass223_2584.anInt2603)
			 >= Class223.aClass223_2596.anInt2603 * 2103253931)) {
		((Class221) this).aClass223_2584 = Class223.aClass223_2595;
		((Class221) this).aBool2567 = true;
	    }
	}
    }
    
    public Class221(Class393 class393) {
	((Class221) this).aBool2567 = false;
	((Class221) this).anInt2575 = 0;
	((Class221) this).aClass393_2570 = class393;
	((Class221) this).aList2571 = new ArrayList();
    }
    
    public void method4427(int i) {
	if (((Class221) this).aClass223_2584.anInt2603 * 2103253931
	    < Class223.aClass223_2596.anInt2603 * 2103253931) {
	    if (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		< Class223.aClass223_2597.anInt2603 * 2103253931) {
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
		((Class221) this).aBool2567 = false;
	    } else if (i <= 0) {
		Iterator iterator = ((Class221) this).aList2571.iterator();
		while (iterator.hasNext()) {
		    Class225 class225 = (Class225) iterator.next();
		    if (class225.method4521(-1474934960) != this)
			iterator.remove();
		    else
			class225.method4513((short) 27710);
		}
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
		((Class221) this).aBool2567 = false;
	    } else {
		((Class221) this).aClass223_2584 = Class223.aClass223_2598;
		Iterator iterator = ((Class221) this).aList2571.iterator();
		while (iterator.hasNext()) {
		    Class225 class225 = (Class225) iterator.next();
		    if (class225.method4521(-1095030652) != this)
			iterator.remove();
		    else
			class225.method4565(0.0F, i, 439139681);
		}
	    }
	}
    }
    
    public void method4428(int i, int i_4_) {
	((Class221) this).anInt2574 = i * -47519429;
    }
    
    public void method4429(int i) {
	if (((Class221) this).aClass223_2584.anInt2603 * 2103253931
	    < Class223.aClass223_2596.anInt2603 * 2103253931) {
	    if (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		< Class223.aClass223_2597.anInt2603 * 2103253931) {
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
		((Class221) this).aBool2567 = false;
	    } else if (i <= 0) {
		Iterator iterator = ((Class221) this).aList2571.iterator();
		while (iterator.hasNext()) {
		    Class225 class225 = (Class225) iterator.next();
		    if (class225.method4521(-820688479) != this)
			iterator.remove();
		    else
			class225.method4513((short) 16886);
		}
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
		((Class221) this).aBool2567 = false;
	    } else {
		((Class221) this).aClass223_2584 = Class223.aClass223_2598;
		Iterator iterator = ((Class221) this).aList2571.iterator();
		while (iterator.hasNext()) {
		    Class225 class225 = (Class225) iterator.next();
		    if (class225.method4521(-2108443166) != this)
			iterator.remove();
		    else
			class225.method4565(0.0F, i, 439139681);
		}
	    }
	}
    }
    
    public void method4430(int i) {
	if (((Class221) this).aClass223_2584.anInt2603 * 2103253931
	    < Class223.aClass223_2596.anInt2603 * 2103253931) {
	    if (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		< Class223.aClass223_2597.anInt2603 * 2103253931) {
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
		((Class221) this).aBool2567 = false;
	    } else if (i <= 0) {
		Iterator iterator = ((Class221) this).aList2571.iterator();
		while (iterator.hasNext()) {
		    Class225 class225 = (Class225) iterator.next();
		    if (class225.method4521(-1467511422) != this)
			iterator.remove();
		    else
			class225.method4513((short) 13800);
		}
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
		((Class221) this).aBool2567 = false;
	    } else {
		((Class221) this).aClass223_2584 = Class223.aClass223_2598;
		Iterator iterator = ((Class221) this).aList2571.iterator();
		while (iterator.hasNext()) {
		    Class225 class225 = (Class225) iterator.next();
		    if (class225.method4521(-1980614673) != this)
			iterator.remove();
		    else
			class225.method4565(0.0F, i, 439139681);
		}
	    }
	}
    }
    
    public void method4431(Class287 class287) {
	((Class221) this).aClass287_2573 = class287;
    }
    
    public float method4432() {
	return ((Class221) this).aFloat2579;
    }
    
    public void method4433() {
	Iterator iterator = ((Class221) this).aList2571.iterator();
	((Class221) this).aClass223_2584 = Class223.aClass223_2595;
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-1812181392) == this)
		class225.method4527(-275927622);
	}
    }
    
    public void method4434() {
	Iterator iterator = ((Class221) this).aList2571.iterator();
	((Class221) this).aClass223_2584 = Class223.aClass223_2595;
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-1269467791) == this)
		class225.method4527(-1054963924);
	}
    }
    
    public void method4435(Interface20 interface20) {
	((Class221) this).anInterface20_2578 = interface20;
    }
    
    public void method4436() {
	if (((Class221) this).aClass223_2584 == Class223.aClass223_2595) {
	    Class508 class508
		= ((Class221) this).anInterface52_2585.method373((byte) 8);
	    if (class508 == Class508.aClass508_6672)
		((Class221) this).aClass223_2584 = Class223.aClass223_2593;
	}
	if (Class223.aClass223_2593 == ((Class221) this).aClass223_2584
	    && true == ((Class221) this).aBool2567) {
	    Class225 class225 = (((Class221) this).aClass393_2570.method7030
				 (((Class221) this).anInterface52_2585
				      .method377(-1616959695),
				  (byte) 87));
	    if (null != class225) {
		boolean bool = ((Class221) this).anInterface52_2585
				   .method414(-991103748);
		Class298 class298 = new Class298(this);
		boolean bool_5_
		    = (class225.method4511
		       (bool ? null : ((Class221) this).anInterface52_2585
					  .method375(0, 317474291),
			bool ? class298 : null,
			((Class221) this).anInt2574 * 1835796467,
			(((Class221) this).anInt2575 * 1609877885 > 0 ? 0.0F
			 : ((Class221) this).aFloat2569),
			false, ((Class221) this).aBool2580,
			2022594045 * ((Class221) this).anInt2576,
			((Class221) this).aFloat2568, this, 545833419));
		if (true == bool_5_) {
		    ((Class221) this).aClass223_2584 = Class223.aClass223_2597;
		    class225.method4571(((Class221) this).anInterface20_2578,
					233424665);
		    class225.method4565(((Class221) this).aFloat2569,
					(((Class221) this).anInt2575
					 * 1609877885),
					439139681);
		    class225.method4512(-2046278373);
		    ((Class221) this).aList2571.add(class225);
		    ((Class221) this).aBool2567 = false;
		} else {
		    if (class225.method4597(2144422350)
			== Class239.aClass239_2765)
			((Class221) this).aClass223_2584
			    = Class223.aClass223_2600;
		    class225.method4508((byte) -74);
		}
	    }
	}
	Iterator iterator = ((Class221) this).aList2571.iterator();
	boolean bool = true;
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-873698056) != this)
		iterator.remove();
	    else {
		if (Class223.aClass223_2598
		    == ((Class221) this).aClass223_2584) {
		    if (class225.method4510((byte) 110) == 0.0F)
			class225.method4513((short) 32691);
		    else
			bool = false;
		}
		if (class225.method4588((byte) 81) == true
		    || class225.method4505((byte) 49) == true) {
		    class225.method4508((byte) -10);
		    iterator.remove();
		} else
		    bool = false;
	    }
	}
	if (bool
	    && (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		>= Class223.aClass223_2597.anInt2603 * 2103253931)
	    && (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		< Class223.aClass223_2596.anInt2603 * 2103253931)) {
	    if (Class223.aClass223_2598 == ((Class221) this).aClass223_2584)
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
	    else
		((Class221) this).aClass223_2584 = Class223.aClass223_2600;
	}
    }
    
    public void method4437(Interface52 interface52, byte i) {
	((Class221) this).anInterface52_2585 = interface52;
	((Class221) this).aFloat2569 = 0.0F;
	((Class221) this).aClass223_2584 = Class223.aClass223_2594;
    }
    
    public void method4438(int i) {
	if (!((Class221) this).aBool2567
	    && (Class223.aClass223_2601 != ((Class221) this).aClass223_2584
		&& Class223.aClass223_2602 != ((Class221) this).aClass223_2584
		&& ((Class221) this).aClass223_2584 != Class223.aClass223_2599
		&& ((Class221) this).aClass223_2584 != Class223.aClass223_2598)
	    && ((((Class221) this).aClass223_2584.anInt2603 * 2103253931
		 <= Class223.aClass223_2594.anInt2603 * 2103253931)
		|| (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		    >= 2103253931 * Class223.aClass223_2596.anInt2603)))
	    ((Class221) this).aClass223_2584 = Class223.aClass223_2595;
    }
    
    public Class223 method4439() {
	return ((Class221) this).aClass223_2584;
    }
    
    public void method4440(float f, int i, int i_6_) {
	((Class221) this).aFloat2569 = f;
	int i_7_ = 0;
	Iterator iterator = ((Class221) this).aList2571.iterator();
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-1455435224) != this)
		((Class221) this).aList2571.remove(class225);
	    else {
		class225.method4565(((Class221) this).aFloat2569, i,
				    439139681);
		i_7_++;
	    }
	}
	if (i_7_ == 0)
	    ((Class221) this).anInt2575 = 71088085 * i;
    }
    
    public Object method4441() {
	return ((Class221) this).anObject2583;
    }
    
    public Object method4442() {
	return ((Class221) this).anObject2572;
    }
    
    public float method4443() {
	return ((Class221) this).aFloat2577;
    }
    
    public void method4444(Object object) {
	((Class221) this).anObject2583 = object;
    }
    
    public void method4445(int i, boolean bool) {
	((Class221) this).aBool2582 = bool;
	((Class221) this).anInt2581 = i * -2141464245;
    }
    
    public void method4446() {
	Iterator iterator = ((Class221) this).aList2571.iterator();
	((Class221) this).aClass223_2584 = Class223.aClass223_2596;
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-2040826725) == this)
		class225.method4526(765288271);
	}
    }
    
    public float method4447() {
	return ((Class221) this).aFloat2577;
    }
    
    public int method4448() {
	return ((Class221) this).anInt2574 * 1835796467;
    }
    
    public void method4449() {
	if (Class223.aClass223_2601 != ((Class221) this).aClass223_2584
	    && Class223.aClass223_2602 != ((Class221) this).aClass223_2584
	    && Class223.aClass223_2599 != ((Class221) this).aClass223_2584
	    && ((Class221) this).aClass223_2584 != Class223.aClass223_2598) {
	    if ((((Class221) this).aClass223_2584 == Class223.aClass223_2595
		 || (Class223.aClass223_2593
		     == ((Class221) this).aClass223_2584))
		&& !((Class221) this).aBool2567)
		((Class221) this).aBool2567 = true;
	    else if ((2103253931 * ((Class221) this).aClass223_2584.anInt2603
		      < Class223.aClass223_2595.anInt2603 * 2103253931)
		     || ((2103253931
			  * ((Class221) this).aClass223_2584.anInt2603)
			 >= Class223.aClass223_2596.anInt2603 * 2103253931)) {
		((Class221) this).aClass223_2584 = Class223.aClass223_2595;
		((Class221) this).aBool2567 = true;
	    }
	}
    }
    
    public void method4450(Object object) {
	((Class221) this).anObject2583 = object;
    }
    
    public int method4451() {
	return ((Class221) this).anInt2574 * 1835796467;
    }
    
    public void method4452(int i) {
	((Class221) this).anInt2574 = i * -47519429;
    }
    
    public void method4453(int i) {
	((Class221) this).anInt2574 = i * -47519429;
    }
    
    public void method4454(int i) {
	((Class221) this).anInt2574 = i * -47519429;
    }
    
    public void method4455(int i) {
	((Class221) this).anInt2574 = i * -47519429;
    }
    
    public void method4456(boolean bool) {
	/* empty */
    }
    
    public void method4457(Object object) {
	((Class221) this).anObject2583 = object;
    }
    
    public void method4458() {
	if (((Class221) this).aClass223_2584 == Class223.aClass223_2595) {
	    Class508 class508
		= ((Class221) this).anInterface52_2585.method373((byte) 49);
	    if (class508 == Class508.aClass508_6672)
		((Class221) this).aClass223_2584 = Class223.aClass223_2593;
	}
	if (Class223.aClass223_2593 == ((Class221) this).aClass223_2584
	    && true == ((Class221) this).aBool2567) {
	    Class225 class225 = (((Class221) this).aClass393_2570.method7030
				 (((Class221) this).anInterface52_2585
				      .method377(-1290401595),
				  (byte) 26));
	    if (null != class225) {
		boolean bool = ((Class221) this).anInterface52_2585
				   .method414(322733890);
		Class298 class298 = new Class298(this);
		boolean bool_8_
		    = (class225.method4511
		       (bool ? null : ((Class221) this).anInterface52_2585
					  .method375(0, 317474291),
			bool ? class298 : null,
			((Class221) this).anInt2574 * 1835796467,
			(((Class221) this).anInt2575 * 1609877885 > 0 ? 0.0F
			 : ((Class221) this).aFloat2569),
			false, ((Class221) this).aBool2580,
			2022594045 * ((Class221) this).anInt2576,
			((Class221) this).aFloat2568, this, -2077078620));
		if (true == bool_8_) {
		    ((Class221) this).aClass223_2584 = Class223.aClass223_2597;
		    class225.method4571(((Class221) this).anInterface20_2578,
					1668351711);
		    class225.method4565(((Class221) this).aFloat2569,
					(((Class221) this).anInt2575
					 * 1609877885),
					439139681);
		    class225.method4512(-1215306770);
		    ((Class221) this).aList2571.add(class225);
		    ((Class221) this).aBool2567 = false;
		} else {
		    if (class225.method4597(2144422350)
			== Class239.aClass239_2765)
			((Class221) this).aClass223_2584
			    = Class223.aClass223_2600;
		    class225.method4508((byte) -112);
		}
	    }
	}
	Iterator iterator = ((Class221) this).aList2571.iterator();
	boolean bool = true;
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-983790371) != this)
		iterator.remove();
	    else {
		if (Class223.aClass223_2598
		    == ((Class221) this).aClass223_2584) {
		    if (class225.method4510((byte) 50) == 0.0F)
			class225.method4513((short) 18982);
		    else
			bool = false;
		}
		if (class225.method4588((byte) 91) == true
		    || class225.method4505((byte) 4) == true) {
		    class225.method4508((byte) -98);
		    iterator.remove();
		} else
		    bool = false;
	    }
	}
	if (bool
	    && (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		>= Class223.aClass223_2597.anInt2603 * 2103253931)
	    && (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		< Class223.aClass223_2596.anInt2603 * 2103253931)) {
	    if (Class223.aClass223_2598 == ((Class221) this).aClass223_2584)
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
	    else
		((Class221) this).aClass223_2584 = Class223.aClass223_2600;
	}
    }
    
    public void method4459(Class287 class287) {
	((Class221) this).aClass287_2573 = class287;
    }
    
    void method4460() {
	((Class221) this).anInterface52_2585 = null;
	((Class221) this).aClass223_2584 = Class223.aClass223_2599;
	((Class221) this).aBool2567 = false;
	((Class221) this).aList2571.clear();
	((Class221) this).anObject2572 = null;
	((Class221) this).aClass287_2573 = null;
	((Class221) this).anInt2574 = 47519429;
	((Class221) this).aBool2580 = false;
	((Class221) this).anInt2576 = 0;
	((Class221) this).aFloat2569 = 0.0F;
	((Class221) this).anInterface20_2578 = null;
	((Class221) this).aFloat2579 = 0.0F;
	((Class221) this).aFloat2577 = 0.0F;
	((Class221) this).anInt2581 = 0;
	((Class221) this).aBool2582 = false;
	((Class221) this).anObject2583 = null;
	((Class221) this).anInt2575 = 0;
	((Class221) this).aFloat2568 = 1.0F;
    }
    
    public void method4461() {
	if (((Class221) this).aClass223_2584 == Class223.aClass223_2595) {
	    Class508 class508
		= ((Class221) this).anInterface52_2585.method373((byte) 94);
	    if (class508 == Class508.aClass508_6672)
		((Class221) this).aClass223_2584 = Class223.aClass223_2593;
	}
	if (Class223.aClass223_2593 == ((Class221) this).aClass223_2584
	    && true == ((Class221) this).aBool2567) {
	    Class225 class225 = (((Class221) this).aClass393_2570.method7030
				 (((Class221) this).anInterface52_2585
				      .method377(-1572899723),
				  (byte) 21));
	    if (null != class225) {
		boolean bool = ((Class221) this).anInterface52_2585
				   .method414(-1731908441);
		Class298 class298 = new Class298(this);
		boolean bool_9_
		    = (class225.method4511
		       (bool ? null : ((Class221) this).anInterface52_2585
					  .method375(0, 317474291),
			bool ? class298 : null,
			((Class221) this).anInt2574 * 1835796467,
			(((Class221) this).anInt2575 * 1609877885 > 0 ? 0.0F
			 : ((Class221) this).aFloat2569),
			false, ((Class221) this).aBool2580,
			2022594045 * ((Class221) this).anInt2576,
			((Class221) this).aFloat2568, this, 1751333472));
		if (true == bool_9_) {
		    ((Class221) this).aClass223_2584 = Class223.aClass223_2597;
		    class225.method4571(((Class221) this).anInterface20_2578,
					-1880177640);
		    class225.method4565(((Class221) this).aFloat2569,
					(((Class221) this).anInt2575
					 * 1609877885),
					439139681);
		    class225.method4512(637780625);
		    ((Class221) this).aList2571.add(class225);
		    ((Class221) this).aBool2567 = false;
		} else {
		    if (class225.method4597(2144422350)
			== Class239.aClass239_2765)
			((Class221) this).aClass223_2584
			    = Class223.aClass223_2600;
		    class225.method4508((byte) -13);
		}
	    }
	}
	Iterator iterator = ((Class221) this).aList2571.iterator();
	boolean bool = true;
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-1992525696) != this)
		iterator.remove();
	    else {
		if (Class223.aClass223_2598
		    == ((Class221) this).aClass223_2584) {
		    if (class225.method4510((byte) 25) == 0.0F)
			class225.method4513((short) 4730);
		    else
			bool = false;
		}
		if (class225.method4588((byte) 27) == true
		    || class225.method4505((byte) 120) == true) {
		    class225.method4508((byte) -23);
		    iterator.remove();
		} else
		    bool = false;
	    }
	}
	if (bool
	    && (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		>= Class223.aClass223_2597.anInt2603 * 2103253931)
	    && (2103253931 * ((Class221) this).aClass223_2584.anInt2603
		< Class223.aClass223_2596.anInt2603 * 2103253931)) {
	    if (Class223.aClass223_2598 == ((Class221) this).aClass223_2584)
		((Class221) this).aClass223_2584 = Class223.aClass223_2596;
	    else
		((Class221) this).aClass223_2584 = Class223.aClass223_2600;
	}
    }
    
    public void method4462() {
	Iterator iterator = ((Class221) this).aList2571.iterator();
	((Class221) this).aClass223_2584 = Class223.aClass223_2596;
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-1897039039) == this)
		class225.method4526(-1970444621);
	}
    }
    
    public void method4463(float f, int i) {
	if (!(f < 0.0F))
	    ((Class221) this).aFloat2568 = f;
    }
    
    public float method4464() {
	return ((Class221) this).aFloat2577;
    }
    
    public void method4465(float f) {
	((Class221) this).aFloat2579 = f;
    }
    
    public void method4466(int i, boolean bool) {
	((Class221) this).aBool2582 = bool;
	((Class221) this).anInt2581 = i * -2141464245;
    }
    
    public Object method4467() {
	return ((Class221) this).anObject2572;
    }
    
    public boolean method4468() {
	((Class221) this).aBool2582 = false;
	return -867309469 * ((Class221) this).anInt2581 != 0;
    }
    
    public boolean method4469() {
	((Class221) this).aBool2582 = false;
	return -867309469 * ((Class221) this).anInt2581 != 0;
    }
    
    public void method4470(float f, int i) {
	((Class221) this).aFloat2569 = f;
	int i_10_ = 0;
	Iterator iterator = ((Class221) this).aList2571.iterator();
	while (iterator.hasNext()) {
	    Class225 class225 = (Class225) iterator.next();
	    if (class225.method4521(-981213415) != this)
		((Class221) this).aList2571.remove(class225);
	    else {
		class225.method4565(((Class221) this).aFloat2569, i,
				    439139681);
		i_10_++;
	    }
	}
	if (i_10_ == 0)
	    ((Class221) this).anInt2575 = 71088085 * i;
    }
    
    public void method4471(boolean bool, int i) {
	((Class221) this).aBool2580 = bool;
	((Class221) this).anInt2576 = 721694549 * i;
    }
    
    public void method4472(boolean bool, int i) {
	((Class221) this).aBool2580 = bool;
	((Class221) this).anInt2576 = 721694549 * i;
    }
    
    public void method4473(boolean bool, int i) {
	((Class221) this).aBool2580 = bool;
	((Class221) this).anInt2576 = 721694549 * i;
    }
    
    public void method4474(float f) {
	if (!(f < 0.0F))
	    ((Class221) this).aFloat2568 = f;
    }
    
    public void method4475(float f) {
	if (!(f < 0.0F))
	    ((Class221) this).aFloat2568 = f;
    }
    
    static String method4476(int[] is, byte i) {
	StringBuilder stringbuilder = new StringBuilder();
	int i_11_ = -1959242957 * Class214.anInt2514;
	for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
	    Class480 class480
		= Class326_Sub3.aClass482_10288.method11010(is[i_12_],
							    (short) -22583);
	    if (-25282143 * class480.anInt6439 != -1) {
		Class168 class168
		    = ((Class168)
		       Class16.aClass129_172.get((long) ((class480
								 .anInt6439)
								* -25282143)));
		if (null == class168) {
		    Class108 class108
			= Class160.method3437(Class284.SPRITES_ARCHIVE,
					      class480.anInt6439 * -25282143,
					      0);
		    if (class108 != null) {
			class168 = Class236.aClass103_2713.method2289(class108,
								      true);
			Class16.aClass129_172.put(class168,
							 (long) ((class480
								  .anInt6439)
								 * -25282143));
		    }
		}
		if (null != class168) {
		    Class133.aClass168Array1613[i_11_] = class168;
		    stringbuilder.append(" <img=").append(i_11_).append(">");
		    i_11_++;
		}
	    }
	}
	return stringbuilder.toString();
    }
    
    static void method4477(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_13_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_14_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	ParamType class603
	    = Class621.paramTypeList.list(i_14_, 310848362);
	if (class603.method13186(-1334223273)) {
	    String string = class603.defaultstr;
	    if (-1 == i_13_)
		((ClientScriptData) class454).objectStack
		    [((((ClientScriptData) class454).objectStackPointer += -1650705371)
		      * -290357331) - 1]
		    = string;
	    else
		((ClientScriptData) class454).objectStack
		    [((((ClientScriptData) class454).objectStackPointer += -1650705371)
		      * -290357331) - 1]
		    = Class326_Sub3.aClass482_10288.method11010
			  (i_13_, (short) 29757)
			  .method10964(i_14_, string, 2001298986);
	} else {
	    int i_15_ = class603.defaultint * 2015998927;
	    if (i_13_ == -1)
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = i_15_;
	    else
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = Class326_Sub3.aClass482_10288.method11010
			  (i_13_, (short) 4724)
			  .method10963(i_14_, i_15_, (byte) 65);
	}
    }
    
    static final void method4478(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class80.method1806(class58, class35, class454, -732836919);
    }
    
    static final void setContextMenuOption/*method4479*/(InterfaceComponent component, 
    		InterfaceDefinition iFace, ClientScriptData scriptData, int i) {
		int optionID
		    = (scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719] - 1);
		if (optionID < 0 || optionID > 9) {
			scriptData.objectStackPointer -= -1650705371;
		} else {
			component.setContextMenuOption(optionID,
					(String) scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331],
				    (byte) 16);
		}
    }
    
    static final void method4480(ClientScriptData class454, int i) {
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = Class573.method12560(((ClientScriptData) class454).integerStack
				   [(((ClientScriptData) class454).intStackPointer
				     -= 1736754263) * 1482319719]);
	if (class241_sub39_sub12 == null
	    || class241_sub39_sub12.aString10932 == null)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class241_sub39_sub12.aString10932;
    }
    
    static final void method4481(ClientScriptData class454, int i) {
	Class241_Sub39_Sub11 class241_sub39_sub11
	    = Class585.method12849(392887074);
	if (Class26.method953(class241_sub39_sub11, -1347698923) == 7) {
	    int i_17_ = (int) class241_sub39_sub11.method17211((short) -22281);
	    if (i_17_ >= 0 && i_17_ <= 794073197 * GPI.viewportPlayerCount) {
		Player class475_sub1_sub1_sub3_sub1
		    = client.localPlayers[i_17_];
		if (null != class475_sub1_sub1_sub3_sub1) {
		    ((ClientScriptData) class454).varEntity
			= class475_sub1_sub1_sub3_sub1;
		    ((ClientScriptData) class454).integerStack
			[((((ClientScriptData) class454).intStackPointer += 1736754263)
			  * 1482319719) - 1]
			= 1;
		    return;
		}
	    }
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
    }
}
