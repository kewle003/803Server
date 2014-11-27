/* Class593 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class593
{
    static long aLong7630;
    static int anInt7631;
    
    abstract int method12926(long l);
    
    public static Class593 method12927() {
	Class593_Sub1 class593_sub1;
	try {
	    class593_sub1 = new Class593_Sub1();
	} catch (Throwable throwable) {
	    return new Class593_Sub2();
	}
	return class593_sub1;
    }
    
    abstract void method12928(byte i);
    
    abstract long method12929(byte i);
    
    abstract long method12930();
    
    final int method12931(long l) {
		long l_0_ = method12929((byte) -63);
		if (l_0_ > 0L)
			Class380_Sub2.method16722(l_0_);
		return method12935(l);
    }
    
    abstract void method12932();
    
    Class593() {
	/* empty */
    }
    
    abstract long method12933();
    
    abstract long method12934(int i);
    
    abstract int method12935(long l);
    
    abstract int method12936(long l);
    
    abstract int method12937(long l);
    
    abstract int method12938(long l);
    
    abstract long method12939();
    
    abstract long method12940();
    
    abstract long method12941();
    
    public static Class593 method12942() {
	Class593_Sub1 class593_sub1;
	try {
	    class593_sub1 = new Class593_Sub1();
	} catch (Throwable throwable) {
	    return new Class593_Sub2();
	}
	return class593_sub1;
    }
    
    abstract void method12943();
    
    public static Class593 method12944() {
	Class593_Sub1 class593_sub1;
	try {
	    class593_sub1 = new Class593_Sub1();
	} catch (Throwable throwable) {
	    return new Class593_Sub2();
	}
	return class593_sub1;
    }
    
    final int method12945(long l) {
	long l_1_ = method12929((byte) 9);
	if (l_1_ > 0L)
	    Class380_Sub2.method16722(l_1_);
	return method12935(l);
    }
    
    static final void method12946(ClientScriptData class454, int i) {
	if (!Class445_Sub16.aClass351_Sub1_8660.method6332((short) -11987)
		 .method1033(611598373))
	    throw new RuntimeException();
	Class380_Sub3 class380_sub3
	    = ((Class380_Sub3)
	       Class445_Sub16.aClass351_Sub1_8660.method6283(2044139005));
	class380_sub3.method16725(Class43.aClass283_607, -1, 0.0F, 914236220);
	client.aBool8392 = true;
    }
    
    static final void method12947(ClientScriptData class454, int i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (Class394.animationDefLoader.getAnimationDefinition(i_2_, (byte) -119).duration
	       * 2135913037);
    }
}
