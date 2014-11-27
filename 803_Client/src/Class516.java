/* Class516 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class516
{
    int anInt6773;
    int anInt6774;
    HashTable aClass407_6775;
    Class410 aClass410_6776 = new Class410();
    
    public final void method11605(Object object, Interface55 interface55) {
	method11627(object, interface55, 1);
    }
    
    public final Object method11606(Interface55 interface55) {
	long l = interface55.method425();
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.get(l));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.method7289((byte) -18))) {
	    if (((Class241_Sub39_Sub8) class241_sub39_sub8)
		    .anInterface55_10857.method427(interface55)) {
		Object object = class241_sub39_sub8.method17166();
		if (object == null) {
		    class241_sub39_sub8.remove((byte) 36);
		    class241_sub39_sub8.method16441((byte) 2);
		    ((Class516) this).anInt6774
			+= (((Class241_Sub39_Sub8) class241_sub39_sub8)
			    .anInt10858);
		} else {
		    if (class241_sub39_sub8.method17167()) {
			Class241_Sub39_Sub8_Sub1 class241_sub39_sub8_sub1
			    = (new Class241_Sub39_Sub8_Sub1
			       (interface55, object,
				(((Class241_Sub39_Sub8) class241_sub39_sub8)
				 .anInt10858)));
			((Class516) this).aClass407_6775.put
			    (class241_sub39_sub8_sub1,
			     (class241_sub39_sub8.hashCode
			      * 4356572401218184725L));
			((Class516) this).aClass410_6776
			    .method7431(class241_sub39_sub8_sub1, (byte) -42);
			class241_sub39_sub8_sub1.aLong10147 = 0L;
			class241_sub39_sub8.remove((byte) 36);
			class241_sub39_sub8.method16441((byte) 2);
		    } else {
			((Class516) this).aClass410_6776
			    .method7431(class241_sub39_sub8, (byte) -70);
			class241_sub39_sub8.aLong10147 = 0L;
		    }
		    return object;
		}
	    }
	}
	return null;
    }
    
    final void method11607(Interface55 interface55) {
	long l = interface55.method425();
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.get(l));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.method7289((byte) -37))) {
	    if (((Class241_Sub39_Sub8) class241_sub39_sub8)
		    .anInterface55_10857.method427(interface55)) {
		method11608(class241_sub39_sub8);
		break;
	    }
	}
    }
    
    final void method11608(Class241_Sub39_Sub8 class241_sub39_sub8) {
	if (class241_sub39_sub8 != null) {
	    class241_sub39_sub8.remove((byte) 36);
	    class241_sub39_sub8.method16441((byte) 2);
	    ((Class516) this).anInt6774
		+= ((Class241_Sub39_Sub8) class241_sub39_sub8).anInt10858;
	}
    }
    
    public final void method11609(Object object, Interface55 interface55) {
	method11627(object, interface55, 1);
    }
    
    public final int method11610() {
	return ((Class516) this).anInt6774;
    }
    
    public final void method11611() {
	((Class516) this).aClass410_6776.method7434(-2003465798);
	((Class516) this).aClass407_6775.method7293(1075015915);
	((Class516) this).anInt6774 = ((Class516) this).anInt6773;
    }
    
    public final void method11612() {
	((Class516) this).aClass410_6776.method7434(-1904334105);
	((Class516) this).aClass407_6775.method7293(-618270912);
	((Class516) this).anInt6774 = ((Class516) this).anInt6773;
    }
    
    public final int method11613() {
	return ((Class516) this).anInt6773;
    }
    
    public final int method11614() {
	return ((Class516) this).anInt6774;
    }
    
    final void method11615(Object object, Interface55 interface55, int i) {
	if (i > ((Class516) this).anInt6773)
	    throw new IllegalStateException();
	method11607(interface55);
	((Class516) this).anInt6774 -= i;
	while (((Class516) this).anInt6774 < 0) {
	    Class241_Sub39_Sub8 class241_sub39_sub8
		= ((Class241_Sub39_Sub8)
		   ((Class516) this).aClass410_6776.method7432(16777472));
	    method11608(class241_sub39_sub8);
	}
	Class241_Sub39_Sub8_Sub1 class241_sub39_sub8_sub1
	    = new Class241_Sub39_Sub8_Sub1(interface55, object, i);
	((Class516) this).aClass407_6775.put(class241_sub39_sub8_sub1,
						    interface55.method425());
	((Class516) this).aClass410_6776.method7431(class241_sub39_sub8_sub1,
						    (byte) -85);
	class241_sub39_sub8_sub1.aLong10147 = 0L;
    }
    
    public final Object method11616(Interface55 interface55) {
	long l = interface55.method425();
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.get(l));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.method7289((byte) 21))) {
	    if (((Class241_Sub39_Sub8) class241_sub39_sub8)
		    .anInterface55_10857.method427(interface55)) {
		Object object = class241_sub39_sub8.method17166();
		if (object == null) {
		    class241_sub39_sub8.remove((byte) 36);
		    class241_sub39_sub8.method16441((byte) 2);
		    ((Class516) this).anInt6774
			+= (((Class241_Sub39_Sub8) class241_sub39_sub8)
			    .anInt10858);
		} else {
		    if (class241_sub39_sub8.method17167()) {
			Class241_Sub39_Sub8_Sub1 class241_sub39_sub8_sub1
			    = (new Class241_Sub39_Sub8_Sub1
			       (interface55, object,
				(((Class241_Sub39_Sub8) class241_sub39_sub8)
				 .anInt10858)));
			((Class516) this).aClass407_6775.put
			    (class241_sub39_sub8_sub1,
			     (class241_sub39_sub8.hashCode
			      * 4356572401218184725L));
			((Class516) this).aClass410_6776
			    .method7431(class241_sub39_sub8_sub1, (byte) -28);
			class241_sub39_sub8_sub1.aLong10147 = 0L;
			class241_sub39_sub8.remove((byte) 36);
			class241_sub39_sub8.method16441((byte) 2);
		    } else {
			((Class516) this).aClass410_6776
			    .method7431(class241_sub39_sub8, (byte) -37);
			class241_sub39_sub8.aLong10147 = 0L;
		    }
		    return object;
		}
	    }
	}
	return null;
    }
    
    final void method11617(Interface55 interface55) {
	long l = interface55.method425();
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.get(l));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.method7289((byte) -16))) {
	    if (((Class241_Sub39_Sub8) class241_sub39_sub8)
		    .anInterface55_10857.method427(interface55)) {
		method11608(class241_sub39_sub8);
		break;
	    }
	}
    }
    
    final void method11618(Interface55 interface55) {
	long l = interface55.method425();
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.get(l));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.method7289((byte) -9))) {
	    if (((Class241_Sub39_Sub8) class241_sub39_sub8)
		    .anInterface55_10857.method427(interface55)) {
		method11608(class241_sub39_sub8);
		break;
	    }
	}
    }
    
    final void method11619(Interface55 interface55) {
	long l = interface55.method425();
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.get(l));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass407_6775.method7289((byte) 47))) {
	    if (((Class241_Sub39_Sub8) class241_sub39_sub8)
		    .anInterface55_10857.method427(interface55)) {
		method11608(class241_sub39_sub8);
		break;
	    }
	}
    }
    
    public final void method11620(int i) {
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7440(-1397088259));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7435((byte) -1))) {
	    if (class241_sub39_sub8.method17167()) {
		if (class241_sub39_sub8.method17166() == null) {
		    class241_sub39_sub8.remove((byte) 36);
		    class241_sub39_sub8.method16441((byte) 2);
		    ((Class516) this).anInt6774
			+= (((Class241_Sub39_Sub8) class241_sub39_sub8)
			    .anInt10858);
		}
	    } else if ((class241_sub39_sub8.aLong10147
			+= 7038950999658635139L) * 251842045416236843L
		       > (long) i) {
		Class241_Sub39_Sub8_Sub2 class241_sub39_sub8_sub2
		    = (new Class241_Sub39_Sub8_Sub2
		       ((((Class241_Sub39_Sub8) class241_sub39_sub8)
			 .anInterface55_10857),
			class241_sub39_sub8.method17166(),
			(((Class241_Sub39_Sub8) class241_sub39_sub8)
			 .anInt10858)));
		((Class516) this).aClass407_6775.put
		    (class241_sub39_sub8_sub2,
		     class241_sub39_sub8.hashCode * 4356572401218184725L);
		Class506.method11487(class241_sub39_sub8_sub2,
				     class241_sub39_sub8, 1612161464);
		class241_sub39_sub8.remove((byte) 36);
		class241_sub39_sub8.method16441((byte) 2);
	    }
	}
    }
    
    public final void method11621(Object object, Interface55 interface55) {
	method11627(object, interface55, 1);
    }
    
    public final void method11622() {
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7440(-1397088259));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7435((byte) -1))) {
	    if (class241_sub39_sub8.method17167()) {
		class241_sub39_sub8.remove((byte) 36);
		class241_sub39_sub8.method16441((byte) 2);
		((Class516) this).anInt6774
		    += ((Class241_Sub39_Sub8) class241_sub39_sub8).anInt10858;
	    }
	}
    }
    
    public final int method11623() {
	return ((Class516) this).anInt6774;
    }
    
    public final void method11624(int i) {
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7440(-1397088259));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7435((byte) -1))) {
	    if (class241_sub39_sub8.method17167()) {
		if (class241_sub39_sub8.method17166() == null) {
		    class241_sub39_sub8.remove((byte) 36);
		    class241_sub39_sub8.method16441((byte) 2);
		    ((Class516) this).anInt6774
			+= (((Class241_Sub39_Sub8) class241_sub39_sub8)
			    .anInt10858);
		}
	    } else if ((class241_sub39_sub8.aLong10147
			+= 7038950999658635139L) * 251842045416236843L
		       > (long) i) {
		Class241_Sub39_Sub8_Sub2 class241_sub39_sub8_sub2
		    = (new Class241_Sub39_Sub8_Sub2
		       ((((Class241_Sub39_Sub8) class241_sub39_sub8)
			 .anInterface55_10857),
			class241_sub39_sub8.method17166(),
			(((Class241_Sub39_Sub8) class241_sub39_sub8)
			 .anInt10858)));
		((Class516) this).aClass407_6775.put
		    (class241_sub39_sub8_sub2,
		     class241_sub39_sub8.hashCode * 4356572401218184725L);
		Class506.method11487(class241_sub39_sub8_sub2,
				     class241_sub39_sub8, 1612161464);
		class241_sub39_sub8.remove((byte) 36);
		class241_sub39_sub8.method16441((byte) 2);
	    }
	}
    }
    
    public final void method11625(int i) {
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7440(-1397088259));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7435((byte) -1))) {
	    if (class241_sub39_sub8.method17167()) {
		if (class241_sub39_sub8.method17166() == null) {
		    class241_sub39_sub8.remove((byte) 36);
		    class241_sub39_sub8.method16441((byte) 2);
		    ((Class516) this).anInt6774
			+= (((Class241_Sub39_Sub8) class241_sub39_sub8)
			    .anInt10858);
		}
	    } else if ((class241_sub39_sub8.aLong10147
			+= 7038950999658635139L) * 251842045416236843L
		       > (long) i) {
		Class241_Sub39_Sub8_Sub2 class241_sub39_sub8_sub2
		    = (new Class241_Sub39_Sub8_Sub2
		       ((((Class241_Sub39_Sub8) class241_sub39_sub8)
			 .anInterface55_10857),
			class241_sub39_sub8.method17166(),
			(((Class241_Sub39_Sub8) class241_sub39_sub8)
			 .anInt10858)));
		((Class516) this).aClass407_6775.put
		    (class241_sub39_sub8_sub2,
		     class241_sub39_sub8.hashCode * 4356572401218184725L);
		Class506.method11487(class241_sub39_sub8_sub2,
				     class241_sub39_sub8, 1612161464);
		class241_sub39_sub8.remove((byte) 36);
		class241_sub39_sub8.method16441((byte) 2);
	    }
	}
    }
    
    public final void method11626(int i) {
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7440(-1397088259));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7435((byte) -1))) {
	    if (class241_sub39_sub8.method17167()) {
		if (class241_sub39_sub8.method17166() == null) {
		    class241_sub39_sub8.remove((byte) 36);
		    class241_sub39_sub8.method16441((byte) 2);
		    ((Class516) this).anInt6774
			+= (((Class241_Sub39_Sub8) class241_sub39_sub8)
			    .anInt10858);
		}
	    } else if ((class241_sub39_sub8.aLong10147
			+= 7038950999658635139L) * 251842045416236843L
		       > (long) i) {
		Class241_Sub39_Sub8_Sub2 class241_sub39_sub8_sub2
		    = (new Class241_Sub39_Sub8_Sub2
		       ((((Class241_Sub39_Sub8) class241_sub39_sub8)
			 .anInterface55_10857),
			class241_sub39_sub8.method17166(),
			(((Class241_Sub39_Sub8) class241_sub39_sub8)
			 .anInt10858)));
		((Class516) this).aClass407_6775.put
		    (class241_sub39_sub8_sub2,
		     class241_sub39_sub8.hashCode * 4356572401218184725L);
		Class506.method11487(class241_sub39_sub8_sub2,
				     class241_sub39_sub8, 1612161464);
		class241_sub39_sub8.remove((byte) 36);
		class241_sub39_sub8.method16441((byte) 2);
	    }
	}
    }
    
    final void method11627(Object object, Interface55 interface55, int i) {
	if (i > ((Class516) this).anInt6773)
	    throw new IllegalStateException();
	method11607(interface55);
	((Class516) this).anInt6774 -= i;
	while (((Class516) this).anInt6774 < 0) {
	    Class241_Sub39_Sub8 class241_sub39_sub8
		= ((Class241_Sub39_Sub8)
		   ((Class516) this).aClass410_6776.method7432(16777472));
	    method11608(class241_sub39_sub8);
	}
	Class241_Sub39_Sub8_Sub1 class241_sub39_sub8_sub1
	    = new Class241_Sub39_Sub8_Sub1(interface55, object, i);
	((Class516) this).aClass407_6775.put(class241_sub39_sub8_sub1,
						    interface55.method425());
	((Class516) this).aClass410_6776.method7431(class241_sub39_sub8_sub1,
						    (byte) -11);
	class241_sub39_sub8_sub1.aLong10147 = 0L;
    }
    
    public final void method11628(int i) {
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7440(-1397088259));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7435((byte) -1))) {
	    if (class241_sub39_sub8.method17167()) {
		if (class241_sub39_sub8.method17166() == null) {
		    class241_sub39_sub8.remove((byte) 36);
		    class241_sub39_sub8.method16441((byte) 2);
		    ((Class516) this).anInt6774
			+= (((Class241_Sub39_Sub8) class241_sub39_sub8)
			    .anInt10858);
		}
	    } else if ((class241_sub39_sub8.aLong10147
			+= 7038950999658635139L) * 251842045416236843L
		       > (long) i) {
		Class241_Sub39_Sub8_Sub2 class241_sub39_sub8_sub2
		    = (new Class241_Sub39_Sub8_Sub2
		       ((((Class241_Sub39_Sub8) class241_sub39_sub8)
			 .anInterface55_10857),
			class241_sub39_sub8.method17166(),
			(((Class241_Sub39_Sub8) class241_sub39_sub8)
			 .anInt10858)));
		((Class516) this).aClass407_6775.put
		    (class241_sub39_sub8_sub2,
		     class241_sub39_sub8.hashCode * 4356572401218184725L);
		Class506.method11487(class241_sub39_sub8_sub2,
				     class241_sub39_sub8, 1612161464);
		class241_sub39_sub8.remove((byte) 36);
		class241_sub39_sub8.method16441((byte) 2);
	    }
	}
    }
    
    public final void method11629() {
	((Class516) this).aClass410_6776.method7434(-1900550533);
	((Class516) this).aClass407_6775.method7293(1493961482);
	((Class516) this).anInt6774 = ((Class516) this).anInt6773;
    }
    
    public final int method11630() {
	return ((Class516) this).anInt6773;
    }
    
    public final void method11631() {
	((Class516) this).aClass410_6776.method7434(-105201844);
	((Class516) this).aClass407_6775.method7293(-29353704);
	((Class516) this).anInt6774 = ((Class516) this).anInt6773;
    }
    
    public final void method11632(Object object, Interface55 interface55) {
	method11627(object, interface55, 1);
    }
    
    public final int method11633() {
	return ((Class516) this).anInt6773;
    }
    
    final void method11634(Class241_Sub39_Sub8 class241_sub39_sub8) {
	if (class241_sub39_sub8 != null) {
	    class241_sub39_sub8.remove((byte) 36);
	    class241_sub39_sub8.method16441((byte) 2);
	    ((Class516) this).anInt6774
		+= ((Class241_Sub39_Sub8) class241_sub39_sub8).anInt10858;
	}
    }
    
    public Class516(int i) {
	((Class516) this).anInt6773 = i;
	((Class516) this).anInt6774 = i;
	int i_0_;
	for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
	    /* empty */
	}
	((Class516) this).aClass407_6775 = new HashTable(i_0_);
    }
    
    public final void method11635() {
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7440(-1397088259));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7435((byte) -1))) {
	    if (class241_sub39_sub8.method17167()) {
		class241_sub39_sub8.remove((byte) 36);
		class241_sub39_sub8.method16441((byte) 2);
		((Class516) this).anInt6774
		    += ((Class241_Sub39_Sub8) class241_sub39_sub8).anInt10858;
	    }
	}
    }
    
    public final void method11636() {
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7440(-1397088259));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7435((byte) -1))) {
	    if (class241_sub39_sub8.method17167()) {
		class241_sub39_sub8.remove((byte) 36);
		class241_sub39_sub8.method16441((byte) 2);
		((Class516) this).anInt6774
		    += ((Class241_Sub39_Sub8) class241_sub39_sub8).anInt10858;
	    }
	}
    }
    
    public final void method11637() {
	for (Class241_Sub39_Sub8 class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7440(-1397088259));
	     class241_sub39_sub8 != null;
	     class241_sub39_sub8
		 = ((Class241_Sub39_Sub8)
		    ((Class516) this).aClass410_6776.method7435((byte) -1))) {
	    if (class241_sub39_sub8.method17167()) {
		class241_sub39_sub8.remove((byte) 36);
		class241_sub39_sub8.method16441((byte) 2);
		((Class516) this).anInt6774
		    += ((Class241_Sub39_Sub8) class241_sub39_sub8).anInt10858;
	    }
	}
    }
}
