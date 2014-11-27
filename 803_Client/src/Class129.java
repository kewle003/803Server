/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

public final class Class129
{
    HashTable aClass407_1590;
    int anInt1591;
    Interface7 anInterface7_1592;
    Class410 aClass410_1593 = new Class410();
    int anInt1594;
    
    public void method3020(Object object, long l, int i) {
	if (i > anInt1591 * 1623178677)
	    throw new IllegalStateException();
	method3046(l);
	anInt1594 -= i * -486430225;
	while (1168155919 * anInt1594 < 0) {
	    Class241_Sub39_Sub15 class241_sub39_sub15
		= ((Class241_Sub39_Sub15)
		   aClass410_1593.method7432(16777472));
	    if (class241_sub39_sub15 == null)
		throw new RuntimeException("");
	    if (class241_sub39_sub15.method17390((byte) 77)) {
		/* empty */
	    }
	    method3062(class241_sub39_sub15, -534248621);
	    if (null != anInterface7_1592)
		anInterface7_1592.method45
		    (class241_sub39_sub15.method17392(-1192049059), 989891361);
	}
	Class241_Sub39_Sub15_Sub2 class241_sub39_sub15_sub2
	    = new Class241_Sub39_Sub15_Sub2(object, i);
	aClass407_1590.put(class241_sub39_sub15_sub2,
						    l);
	aClass410_1593.method7431(class241_sub39_sub15_sub2,
						    (byte) -123);
	class241_sub39_sub15_sub2.aLong10147 = 0L;
    }
    
    public void method3021(Interface7 interface7, int i) {
	anInterface7_1592 = interface7;
    }
    
    public Class129(int i, int i_0_) {
	anInt1591 = i * -1620113251;
	anInt1594 = -486430225 * i;
	int i_1_;
	for (i_1_ = 1; i_1_ + i_1_ < i && i_1_ < i_0_; i_1_ += i_1_) {
	    /* empty */
	}
	aClass407_1590 = new HashTable(i_1_);
    }
    
    public Object get/*method3022*/(long l) {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.get(l));
	if (class241_sub39_sub15 == null)
	    return null;
	Object object = class241_sub39_sub15.method17392(-59349753);
	if (object == null) {
	    class241_sub39_sub15.remove((byte) 36);
	    class241_sub39_sub15.method16441((byte) 2);
	    anInt1594
		+= (((Class241_Sub39_Sub15) class241_sub39_sub15).anInt10970
		    * 1192661491);
	    return null;
	}
	if (class241_sub39_sub15.method17390((byte) 114)) {
	    Class241_Sub39_Sub15_Sub2 class241_sub39_sub15_sub2
		= new Class241_Sub39_Sub15_Sub2(object,
						(((Class241_Sub39_Sub15)
						  class241_sub39_sub15)
						 .anInt10970) * 1833184317);
	    aClass407_1590.put
		(class241_sub39_sub15_sub2,
		 4356572401218184725L * class241_sub39_sub15.hashCode);
	    aClass410_1593
		.method7431(class241_sub39_sub15_sub2, (byte) -26);
	    class241_sub39_sub15_sub2.aLong10147 = 0L;
	    class241_sub39_sub15.remove((byte) 36);
	    class241_sub39_sub15.method16441((byte) 2);
	} else {
	    aClass410_1593.method7431(class241_sub39_sub15,
							(byte) -60);
	    class241_sub39_sub15.aLong10147 = 0L;
	}
	return object;
    }
    
    void method3023(Class241_Sub39_Sub15 class241_sub39_sub15) {
	if (null != class241_sub39_sub15) {
	    class241_sub39_sub15.remove((byte) 36);
	    class241_sub39_sub15.method16441((byte) 2);
	    anInt1594
		+= 1192661491 * (((Class241_Sub39_Sub15) class241_sub39_sub15)
				 .anInt10970);
	}
    }
    
    public int method3024() {
	int i = 0;
	for (Class241_Sub39_Sub15 class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7440(-1397088259));
	     null != class241_sub39_sub15;
	     class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7435((byte) -1))) {
	    if (!class241_sub39_sub15.method17390((byte) 64))
		i++;
	}
	return i;
    }
    
    public int method3025() {
	int i = 0;
	for (Class241_Sub39_Sub15 class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7440(-1397088259));
	     null != class241_sub39_sub15;
	     class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7435((byte) -1))) {
	    if (!class241_sub39_sub15.method17390((byte) 106))
		i++;
	}
	return i;
    }
    
    public void method3026(Object object, long l, int i, int i_2_) {
	if (i > anInt1591 * 1623178677)
	    throw new IllegalStateException();
	method3046(l);
	anInt1594 -= i * -486430225;
	while (1168155919 * anInt1594 < 0) {
	    Class241_Sub39_Sub15 class241_sub39_sub15
		= ((Class241_Sub39_Sub15)
		   aClass410_1593.method7432(16777472));
	    if (class241_sub39_sub15 == null)
		throw new RuntimeException("");
	    if (class241_sub39_sub15.method17390((byte) 124)) {
		/* empty */
	    }
	    method3062(class241_sub39_sub15, -26135731);
	    if (null != anInterface7_1592)
		anInterface7_1592.method45
		    (class241_sub39_sub15.method17392(-1193112615), 633414885);
	}
	Class241_Sub39_Sub15_Sub2 class241_sub39_sub15_sub2
	    = new Class241_Sub39_Sub15_Sub2(object, i);
	aClass407_1590.put(class241_sub39_sub15_sub2,
						    l);
	aClass410_1593.method7431(class241_sub39_sub15_sub2,
						    (byte) -30);
	class241_sub39_sub15_sub2.aLong10147 = 0L;
    }
    
    public void clean/*method3027*/(int i, int i_3_) {
		for (Class241_Sub39_Sub15 class241_sub39_sub15
			 = ((Class241_Sub39_Sub15)
			    aClass410_1593.method7440(-1397088259));
		     class241_sub39_sub15 != null;
		     class241_sub39_sub15
			 = ((Class241_Sub39_Sub15)
			    aClass410_1593.method7435((byte) -1))) {
		    if (class241_sub39_sub15.method17390((byte) 18)) {
				if (class241_sub39_sub15.method17392(242440319) == null) {
				    class241_sub39_sub15.remove((byte) 36);
				    class241_sub39_sub15.method16441((byte) 2);
				    anInt1594 += 1192661491 * ((Class241_Sub39_Sub15) class241_sub39_sub15).anInt10970;
				}
		    } else if ((class241_sub39_sub15.aLong10147
				+= 7038950999658635139L) * 251842045416236843L > (long) i) {
		    	Class241_Sub39_Sub15_Sub1 class241_sub39_sub15_sub1
		    		= (new Class241_Sub39_Sub15_Sub1(class241_sub39_sub15.method17392(-509409322),
		    				1833184317 * ((Class241_Sub39_Sub15) class241_sub39_sub15).anInt10970));
				aClass407_1590.put(class241_sub39_sub15_sub1, class241_sub39_sub15.hashCode * 4356572401218184725L);
				Class506.method11487(class241_sub39_sub15_sub1, class241_sub39_sub15, 1612161464);
				class241_sub39_sub15.remove((byte) 36);
				class241_sub39_sub15.method16441((byte) 2);
		    }
		}
    }
    
    public int method3028(int i) {
	return anInt1594 * 1168155919;
    }
    
    public Object method3029() {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.method7295(374324062));
	while (class241_sub39_sub15 != null) {
	    Object object = class241_sub39_sub15.method17392(539558922);
	    if (null == object) {
		Class241_Sub39_Sub15 class241_sub39_sub15_4_
		    = class241_sub39_sub15;
		class241_sub39_sub15
		    = (Class241_Sub39_Sub15) ((Class129) this)
						 .aClass407_1590
						 .method7295(-300077444);
		class241_sub39_sub15_4_.remove((byte) 36);
		class241_sub39_sub15_4_.method16441((byte) 2);
		anInt1594
		    += 1192661491 * ((Class241_Sub39_Sub15)
				     class241_sub39_sub15_4_).anInt10970;
	    } else
		return object;
	}
	return null;
    }
    
    public Object method3030() {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.method7294(2090894173));
	while (class241_sub39_sub15 != null) {
	    Object object = class241_sub39_sub15.method17392(-1818685062);
	    if (object == null) {
		Class241_Sub39_Sub15 class241_sub39_sub15_5_
		    = class241_sub39_sub15;
		class241_sub39_sub15
		    = ((Class241_Sub39_Sub15)
		       aClass407_1590.method7295(720359565));
		class241_sub39_sub15_5_.remove((byte) 36);
		class241_sub39_sub15_5_.method16441((byte) 2);
		anInt1594
		    += (((Class241_Sub39_Sub15) class241_sub39_sub15_5_)
			.anInt10970) * 1192661491;
	    } else
		return object;
	}
	return null;
    }
    
    public int method3031(int i) {
	int i_6_ = 0;
	for (Class241_Sub39_Sub15 class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7440(-1397088259));
	     null != class241_sub39_sub15;
	     class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7435((byte) -1))) {
	    if (!class241_sub39_sub15.method17390((byte) 93))
		i_6_++;
	}
	return i_6_;
    }
    
    public void removeSoftReferences/*method3032*/(byte i) {
		for (Class241_Sub39_Sub15 class241_sub39_sub15 = ((Class241_Sub39_Sub15) aClass410_1593.method7440(-1397088259));
				class241_sub39_sub15 != null;
				class241_sub39_sub15 = ((Class241_Sub39_Sub15) aClass410_1593.method7435((byte) -1))) {
		    if (class241_sub39_sub15.method17390((byte) 127)) {
				class241_sub39_sub15.remove((byte) 36);
				class241_sub39_sub15.method16441((byte) 2);
				anInt1594 += (((Class241_Sub39_Sub15) class241_sub39_sub15).anInt10970) * 1192661491;
		    }
		}
    }
    
    public Object method3033(byte i) {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.method7294(2090894173));
	while (class241_sub39_sub15 != null) {
	    Object object = class241_sub39_sub15.method17392(-488286624);
	    if (object == null) {
		Class241_Sub39_Sub15 class241_sub39_sub15_7_
		    = class241_sub39_sub15;
		class241_sub39_sub15
		    = ((Class241_Sub39_Sub15)
		       aClass407_1590.method7295(444398467));
		class241_sub39_sub15_7_.remove((byte) 36);
		class241_sub39_sub15_7_.method16441((byte) 2);
		anInt1594
		    += (((Class241_Sub39_Sub15) class241_sub39_sub15_7_)
			.anInt10970) * 1192661491;
	    } else
		return object;
	}
	return null;
    }
    
    public Object method3034(int i) {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.method7295(1678309630));
	while (class241_sub39_sub15 != null) {
	    Object object = class241_sub39_sub15.method17392(-1101559415);
	    if (null == object) {
		Class241_Sub39_Sub15 class241_sub39_sub15_8_
		    = class241_sub39_sub15;
		class241_sub39_sub15
		    = (Class241_Sub39_Sub15) ((Class129) this)
						 .aClass407_1590
						 .method7295(1577101312);
		class241_sub39_sub15_8_.remove((byte) 36);
		class241_sub39_sub15_8_.method16441((byte) 2);
		anInt1594
		    += 1192661491 * ((Class241_Sub39_Sub15)
				     class241_sub39_sub15_8_).anInt10970;
	    } else
		return object;
	}
	return null;
    }
    
    public void method3035(Interface7 interface7) {
	anInterface7_1592 = interface7;
    }
    
    public void method3036(Interface7 interface7) {
	anInterface7_1592 = interface7;
    }
    
    public void method3037() {
	for (Class241_Sub39_Sub15 class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7440(-1397088259));
	     class241_sub39_sub15 != null;
	     class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7435((byte) -1))) {
	    if (class241_sub39_sub15.method17390((byte) 25)) {
		class241_sub39_sub15.remove((byte) 36);
		class241_sub39_sub15.method16441((byte) 2);
		anInt1594
		    += (((Class241_Sub39_Sub15) class241_sub39_sub15)
			.anInt10970) * 1192661491;
	    }
	}
    }
    
    public Object method3038(long l) {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.get(l));
	if (class241_sub39_sub15 == null)
	    return null;
	Object object = class241_sub39_sub15.method17392(-231654862);
	if (object == null) {
	    class241_sub39_sub15.remove((byte) 36);
	    class241_sub39_sub15.method16441((byte) 2);
	    anInt1594
		+= (((Class241_Sub39_Sub15) class241_sub39_sub15).anInt10970
		    * 1192661491);
	    return null;
	}
	if (class241_sub39_sub15.method17390((byte) 53)) {
	    Class241_Sub39_Sub15_Sub2 class241_sub39_sub15_sub2
		= new Class241_Sub39_Sub15_Sub2(object,
						(((Class241_Sub39_Sub15)
						  class241_sub39_sub15)
						 .anInt10970) * 1833184317);
	    aClass407_1590.put
		(class241_sub39_sub15_sub2,
		 4356572401218184725L * class241_sub39_sub15.hashCode);
	    aClass410_1593
		.method7431(class241_sub39_sub15_sub2, (byte) -45);
	    class241_sub39_sub15_sub2.aLong10147 = 0L;
	    class241_sub39_sub15.remove((byte) 36);
	    class241_sub39_sub15.method16441((byte) 2);
	} else {
	    aClass410_1593.method7431(class241_sub39_sub15,
							(byte) -123);
	    class241_sub39_sub15.aLong10147 = 0L;
	}
	return object;
    }
    
    public void method3039(long l) {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.get(l));
	method3062(class241_sub39_sub15, -1746555861);
    }
    
    public void method3040(long l) {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.get(l));
	method3062(class241_sub39_sub15, -804380314);
    }
    
    public void method3041(Interface7 interface7) {
	anInterface7_1592 = interface7;
    }
    
    public void method3042() {
	for (Class241_Sub39_Sub15 class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7440(-1397088259));
	     class241_sub39_sub15 != null;
	     class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7435((byte) -1))) {
	    if (class241_sub39_sub15.method17390((byte) 29)) {
		class241_sub39_sub15.remove((byte) 36);
		class241_sub39_sub15.method16441((byte) 2);
		anInt1594
		    += (((Class241_Sub39_Sub15) class241_sub39_sub15)
			.anInt10970) * 1192661491;
	    }
	}
    }
    
    void method3043(Class241_Sub39_Sub15 class241_sub39_sub15) {
	if (null != class241_sub39_sub15) {
	    class241_sub39_sub15.remove((byte) 36);
	    class241_sub39_sub15.method16441((byte) 2);
	    anInt1594
		+= 1192661491 * (((Class241_Sub39_Sub15) class241_sub39_sub15)
				 .anInt10970);
	}
    }
    
    public void method3044(Object object, long l, int i) {
	if (i > anInt1591 * 1623178677)
	    throw new IllegalStateException();
	method3046(l);
	anInt1594 -= i * -486430225;
	while (1168155919 * anInt1594 < 0) {
	    Class241_Sub39_Sub15 class241_sub39_sub15
		= ((Class241_Sub39_Sub15)
		   aClass410_1593.method7432(16777472));
	    if (class241_sub39_sub15 == null)
		throw new RuntimeException("");
	    if (class241_sub39_sub15.method17390((byte) 110)) {
		/* empty */
	    }
	    method3062(class241_sub39_sub15, -878956318);
	    if (null != anInterface7_1592)
		anInterface7_1592.method45
		    (class241_sub39_sub15.method17392(-561471095), -102681365);
	}
	Class241_Sub39_Sub15_Sub2 class241_sub39_sub15_sub2
	    = new Class241_Sub39_Sub15_Sub2(object, i);
	aClass407_1590.put(class241_sub39_sub15_sub2,
						    l);
	aClass410_1593.method7431(class241_sub39_sub15_sub2,
						    (byte) -5);
	class241_sub39_sub15_sub2.aLong10147 = 0L;
    }
    
    public void method3045(Object object, long l, int i) {
	if (i > anInt1591 * 1623178677)
	    throw new IllegalStateException();
	method3046(l);
	anInt1594 -= i * -486430225;
	while (1168155919 * anInt1594 < 0) {
	    Class241_Sub39_Sub15 class241_sub39_sub15
		= ((Class241_Sub39_Sub15)
		   aClass410_1593.method7432(16777472));
	    if (class241_sub39_sub15 == null)
		throw new RuntimeException("");
	    if (class241_sub39_sub15.method17390((byte) 120)) {
		/* empty */
	    }
	    method3062(class241_sub39_sub15, -852586425);
	    if (null != anInterface7_1592)
		anInterface7_1592.method45
		    (class241_sub39_sub15.method17392(-338855514),
		     -2025084510);
	}
	Class241_Sub39_Sub15_Sub2 class241_sub39_sub15_sub2
	    = new Class241_Sub39_Sub15_Sub2(object, i);
	aClass407_1590.put(class241_sub39_sub15_sub2,
						    l);
	aClass410_1593.method7431(class241_sub39_sub15_sub2,
						    (byte) -54);
	class241_sub39_sub15_sub2.aLong10147 = 0L;
    }
    
    public void method3046(long l) {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.get(l));
	method3062(class241_sub39_sub15, 29863241);
    }
    
    public void method3047(Object object, long l, int i) {
	if (i > anInt1591 * 1623178677)
	    throw new IllegalStateException();
	method3046(l);
	anInt1594 -= i * -486430225;
	while (1168155919 * anInt1594 < 0) {
	    Class241_Sub39_Sub15 class241_sub39_sub15
		= ((Class241_Sub39_Sub15)
		   aClass410_1593.method7432(16777472));
	    if (class241_sub39_sub15 == null)
		throw new RuntimeException("");
	    if (class241_sub39_sub15.method17390((byte) 126)) {
		/* empty */
	    }
	    method3062(class241_sub39_sub15, -1408995149);
	    if (null != anInterface7_1592)
		anInterface7_1592.method45
		    (class241_sub39_sub15.method17392(-822281509),
		     -1000683070);
	}
	Class241_Sub39_Sub15_Sub2 class241_sub39_sub15_sub2
	    = new Class241_Sub39_Sub15_Sub2(object, i);
	aClass407_1590.put(class241_sub39_sub15_sub2,
						    l);
	aClass410_1593.method7431(class241_sub39_sub15_sub2,
						    (byte) -98);
	class241_sub39_sub15_sub2.aLong10147 = 0L;
    }
    
    public void method3048() {
	aClass410_1593.method7434(-1683368071);
	aClass407_1590.method7293(-1378011578);
	anInt1594 = 603166971 * anInt1591;
    }
    
    public void method3049() {
	aClass410_1593.method7434(-1272006729);
	aClass407_1590.method7293(-58423631);
	anInt1594 = 603166971 * anInt1591;
    }
    
    public int method3050() {
	return anInt1591 * 1623178677;
    }
    
    public void reset/*method3051*/(int i) {
		aClass410_1593.method7434(-1000045365);
		aClass407_1590.method7293(-355458895);
		anInt1594 = 603166971 * anInt1591;
    }
    
    public int method3052(int i) {
	return anInt1591 * 1623178677;
    }
    
    public void method3053(long l) {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.get(l));
	method3062(class241_sub39_sub15, -773359694);
    }
    
    public int method3054() {
	int i = 0;
	for (Class241_Sub39_Sub15 class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7440(-1397088259));
	     null != class241_sub39_sub15;
	     class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7435((byte) -1))) {
	    if (!class241_sub39_sub15.method17390((byte) 105))
		i++;
	}
	return i;
    }
    
    public void put/*method3055*/(Object object, long l) {
    	method3026(object, l, 1, 2092988792);
    }
    
    public Class129(int i) {
	this(i, i);
    }
    
    public Object method3056() {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.method7294(2090894173));
	while (class241_sub39_sub15 != null) {
	    Object object = class241_sub39_sub15.method17392(-1899527382);
	    if (object == null) {
		Class241_Sub39_Sub15 class241_sub39_sub15_9_
		    = class241_sub39_sub15;
		class241_sub39_sub15
		    = ((Class241_Sub39_Sub15)
		       aClass407_1590.method7295(428702066));
		class241_sub39_sub15_9_.remove((byte) 36);
		class241_sub39_sub15_9_.method16441((byte) 2);
		anInt1594
		    += (((Class241_Sub39_Sub15) class241_sub39_sub15_9_)
			.anInt10970) * 1192661491;
	    } else
		return object;
	}
	return null;
    }
    
    public Object method3057() {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.method7294(2090894173));
	while (class241_sub39_sub15 != null) {
	    Object object = class241_sub39_sub15.method17392(58742065);
	    if (object == null) {
		Class241_Sub39_Sub15 class241_sub39_sub15_10_
		    = class241_sub39_sub15;
		class241_sub39_sub15
		    = ((Class241_Sub39_Sub15)
		       aClass407_1590.method7295(108070225));
		class241_sub39_sub15_10_.remove((byte) 36);
		class241_sub39_sub15_10_.method16441((byte) 2);
		anInt1594
		    += (((Class241_Sub39_Sub15) class241_sub39_sub15_10_)
			.anInt10970) * 1192661491;
	    } else
		return object;
	}
	return null;
    }
    
    public Object method3058() {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.method7294(2090894173));
	while (class241_sub39_sub15 != null) {
	    Object object = class241_sub39_sub15.method17392(-858144040);
	    if (object == null) {
		Class241_Sub39_Sub15 class241_sub39_sub15_11_
		    = class241_sub39_sub15;
		class241_sub39_sub15
		    = (Class241_Sub39_Sub15) ((Class129) this)
						 .aClass407_1590
						 .method7295(1428655389);
		class241_sub39_sub15_11_.remove((byte) 36);
		class241_sub39_sub15_11_.method16441((byte) 2);
		anInt1594
		    += (((Class241_Sub39_Sub15) class241_sub39_sub15_11_)
			.anInt10970) * 1192661491;
	    } else
		return object;
	}
	return null;
    }
    
    public int method3059() {
	int i = 0;
	for (Class241_Sub39_Sub15 class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7440(-1397088259));
	     null != class241_sub39_sub15;
	     class241_sub39_sub15
		 = ((Class241_Sub39_Sub15)
		    aClass410_1593.method7435((byte) -1))) {
	    if (!class241_sub39_sub15.method17390((byte) 101))
		i++;
	}
	return i;
    }
    
    public Object method3060() {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.method7294(2090894173));
	while (class241_sub39_sub15 != null) {
	    Object object = class241_sub39_sub15.method17392(-1992016030);
	    if (object == null) {
		Class241_Sub39_Sub15 class241_sub39_sub15_12_
		    = class241_sub39_sub15;
		class241_sub39_sub15
		    = ((Class241_Sub39_Sub15)
		       aClass407_1590.method7295(803288776));
		class241_sub39_sub15_12_.remove((byte) 36);
		class241_sub39_sub15_12_.method16441((byte) 2);
		anInt1594
		    += (((Class241_Sub39_Sub15) class241_sub39_sub15_12_)
			.anInt10970) * 1192661491;
	    } else
		return object;
	}
	return null;
    }
    
    public Object method3061() {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.method7295(-118469286));
	while (class241_sub39_sub15 != null) {
	    Object object = class241_sub39_sub15.method17392(461922066);
	    if (null == object) {
		Class241_Sub39_Sub15 class241_sub39_sub15_13_
		    = class241_sub39_sub15;
		class241_sub39_sub15
		    = ((Class241_Sub39_Sub15)
		       aClass407_1590.method7295(903228397));
		class241_sub39_sub15_13_.remove((byte) 36);
		class241_sub39_sub15_13_.method16441((byte) 2);
		anInt1594
		    += 1192661491 * ((Class241_Sub39_Sub15)
				     class241_sub39_sub15_13_).anInt10970;
	    } else
		return object;
	}
	return null;
    }
    
    void method3062(Class241_Sub39_Sub15 class241_sub39_sub15, int i) {
	if (null != class241_sub39_sub15) {
	    class241_sub39_sub15.remove((byte) 36);
	    class241_sub39_sub15.method16441((byte) 2);
	    anInt1594
		+= 1192661491 * (((Class241_Sub39_Sub15) class241_sub39_sub15)
				 .anInt10970);
	}
    }
    
    public Object method3063() {
	Class241_Sub39_Sub15 class241_sub39_sub15
	    = ((Class241_Sub39_Sub15)
	       aClass407_1590.method7295(322842837));
	while (class241_sub39_sub15 != null) {
	    Object object = class241_sub39_sub15.method17392(-99282010);
	    if (null == object) {
		Class241_Sub39_Sub15 class241_sub39_sub15_14_
		    = class241_sub39_sub15;
		class241_sub39_sub15
		    = ((Class241_Sub39_Sub15)
		       aClass407_1590.method7295(695127069));
		class241_sub39_sub15_14_.remove((byte) 36);
		class241_sub39_sub15_14_.method16441((byte) 2);
		anInt1594
		    += 1192661491 * ((Class241_Sub39_Sub15)
				     class241_sub39_sub15_14_).anInt10970;
	    } else
		return object;
	}
	return null;
    }
    
    static final void method3064(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.anInt8471 * 395911653;
    }
    
    public static int method3065(int i, int i_15_, int i_16_) {
	if (313906813 * Class128.aClass513_1589.anInt6711 == -1)
	    return 1;
	if (i != Class241_Sub5_Sub9.aClass241_Sub9_11043
		     .aClass445_Sub11_8893.method14197((byte) 4)) {
	    Class96.method2168
		(i,
		 ClientMessage.PROFILING.getLocalisedMessage(VarPlayerDomain.currentLocale,
						     (short) 17383),
		 true, -197405327);
	    if (Class241_Sub5_Sub9.aClass241_Sub9_11043
		    .aClass445_Sub11_8893.method14197((byte) 65)
		!= i)
		return -1;
	}
	int i_17_;
	try {
	    Dimension dimension = Class344.canvas.getSize();
	    Class434_Sub5.method14141
		(ClientMessage.PROFILING.getLocalisedMessage(VarPlayerDomain.currentLocale,
						     (short) 32640),
		 true, Class236.aClass103_2713, Class5.aClass96_26,
		 Class5.aClass639_25, 657368527);
	    Class161 class161
		= Class161.method3448(Class508.MODELS_ARCHIVE,
				      (313906813
				       * Class128.aClass513_1589.anInt6711),
				      0);
	    long l = Class50.method1249((byte) 1);
	    Class236.aClass103_2713.method2572();
	    client.aClass266_8290.method5131(0.0F, 256.0F, 0.0F);
	    Class236.aClass103_2713.method2512(client.aClass266_8290);
	    Class268 class268 = Class236.aClass103_2713.method2226();
	    class268.method5268((float) (dimension.width / 2),
				(float) (dimension.height / 2), 512.0F, 512.0F,
				(float) client.aClass238_8477
					    .method4749((byte) 110),
				(float) client.aClass238_8477
					    .method4750(23464271),
				(float) dimension.width,
				(float) dimension.height);
	    Class236.aClass103_2713.method2309(class268);
	    Class236.aClass103_2713.method2311(1.0F);
	    Class236.aClass103_2713.method2227(16777215, 0.5F, 0.5F, 20.0F,
					       -50.0F, 30.0F);
	    Class89 class89
		= Class236.aClass103_2713.method2356(class161, 2048, 64, 64,
						     768);
	    int i_18_ = 0;
	while_102_:
	    for (int i_19_ = 0; i_19_ < 500; i_19_++) {
		Class236.aClass103_2713.method2450(3, 0);
		for (int i_20_ = 15; i_20_ >= 0; i_20_--) {
		    for (int i_21_ = 0; i_21_ <= i_20_; i_21_++) {
			client.aClass266_8291.method5131
			    ((float) (int) (512.0F * ((float) i_21_
						      - (float) i_20_ / 2.0F)),
			     0.0F, (float) (512 * (1 + i_20_)));
			class89.method1890(client.aClass266_8291, null, 0);
			i_18_++;
			if (Class50.method1249((byte) 1) - l >= (long) i_15_)
			    break while_102_;
		    }
		}
	    }
	    Class236.aClass103_2713.method2436();
	    long l_22_
		= (long) (i_18_ * 1000) / (Class50.method1249((byte) 1) - l);
	    Class236.aClass103_2713.method2450(3, 0);
	    i_17_ = (int) l_22_;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return -1;
	}
	return i_17_;
    }
    
    static long method3066(int i) {
	return Class124.aClass593_1580.method12934(-1786503238);
    }
}
