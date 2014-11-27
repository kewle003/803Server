/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class487
{
    static int anInt6470;
    static HashTable aClass407_6471;
    static int anInt6472;
    static int anInt6473;
    static int anInt6474;
    static List aList6475;
    static int anInt6476 = 0;
    static int anInt6477;
    static Class247_Sub1_Sub1_Sub1[] aClass247_Sub1_Sub1_Sub1Array6478;
    static int anInt6479;
    static int anInt6480;
    
    Class487() throws Throwable {
	throw new Error();
    }
    
    public static void method11128(Class552 class552, Class103 class103) {
	Iterator iterator = aList6475.iterator();
	while (iterator.hasNext()) {
	    Class489 class489 = (Class489) iterator.next();
	    if (((Class489) class489).aBool6490)
		class489.method11163(class552, class103);
	}
    }
    
    public static void method11129(JS5 class210) {
	anInt6476 = 0;
	anInt6473 = 0;
	aList6475 = new LinkedList();
	aClass247_Sub1_Sub1_Sub1Array6478 = new Class247_Sub1_Sub1_Sub1[1024];
	Class42.aClass489Array602
	    = new Class489[1 + Class90.anIntArray1300[275753719 * anInt6480]];
	anInt6474 = 0;
	anInt6472 = 0;
	Class75.method1763(class210, 1464738637);
	Class25.method936(class210, -2089154533);
    }
    
    public static void method11130(JS5 class210) {
	anInt6476 = 0;
	anInt6473 = 0;
	aList6475 = new LinkedList();
	aClass247_Sub1_Sub1_Sub1Array6478 = new Class247_Sub1_Sub1_Sub1[1024];
	Class42.aClass489Array602
	    = new Class489[1 + Class90.anIntArray1300[275753719 * anInt6480]];
	anInt6474 = 0;
	anInt6472 = 0;
	Class75.method1763(class210, -1248280713);
	Class25.method936(class210, -1580104898);
    }
    
    public static void method11131(Class552 class552, Class103 class103) {
	Iterator iterator = aList6475.iterator();
	while (iterator.hasNext()) {
	    Class489 class489 = (Class489) iterator.next();
	    if (((Class489) class489).aBool6490)
		class489.method11163(class552, class103);
	}
    }
    
    public static void method11132(Class103 class103, long l) {
	anInt6477 = anInt6470 * -1226220859;
	anInt6470 = 0;
	Class50.method1249((byte) 1);
	Iterator iterator = aList6475.iterator();
	while (iterator.hasNext()) {
	    Class489 class489 = (Class489) iterator.next();
	    boolean bool = class489.method11156(class103, l);
	    if (!bool) {
		iterator.remove();
		Class42.aClass489Array602[anInt6472 * 741457535] = class489;
		anInt6472 = ((1 + 741457535 * anInt6472
			      & Class90.anIntArray1300[anInt6480 * 275753719])
			     * 2087453055);
	    }
	}
    }
    
    public static void method11133(Class103 class103, long l) {
	anInt6477 = anInt6470 * -1226220859;
	anInt6470 = 0;
	Class50.method1249((byte) 1);
	Iterator iterator = aList6475.iterator();
	while (iterator.hasNext()) {
	    Class489 class489 = (Class489) iterator.next();
	    boolean bool = class489.method11156(class103, l);
	    if (!bool) {
		iterator.remove();
		Class42.aClass489Array602[anInt6472 * 741457535] = class489;
		anInt6472 = ((1 + 741457535 * anInt6472
			      & Class90.anIntArray1300[anInt6480 * 275753719])
			     * 2087453055);
	    }
	}
    }
    
    public static void method11134(Class552 class552, Class103 class103) {
	Iterator iterator = aList6475.iterator();
	while (iterator.hasNext()) {
	    Class489 class489 = (Class489) iterator.next();
	    if (((Class489) class489).aBool6490)
		class489.method11163(class552, class103);
	}
    }
    
    public static void method11135(int i) {
	if (i < 0 || i > 2)
	    i = 0;
	anInt6480 = i * 862860999;
	Class42.aClass489Array602
	    = new Class489[Class90.anIntArray1300[anInt6480 * 275753719] + 1];
	anInt6474 = 0;
	anInt6472 = 0;
    }
    
    public static void method11136(int i) {
	if (i < 0 || i > 2)
	    i = 0;
	anInt6480 = i * 862860999;
	Class42.aClass489Array602
	    = new Class489[Class90.anIntArray1300[anInt6480 * 275753719] + 1];
	anInt6474 = 0;
	anInt6472 = 0;
    }
    
    public static void method11137(Class552 class552, Class103 class103) {
	Iterator iterator = aList6475.iterator();
	while (iterator.hasNext()) {
	    Class489 class489 = (Class489) iterator.next();
	    if (((Class489) class489).aBool6490)
		class489.method11163(class552, class103);
	}
    }
    
    static {
	anInt6473 = 0;
	anInt6474 = 0;
	anInt6472 = 0;
	anInt6470 = 0;
	anInt6477 = 0;
	aClass407_6471 = new HashTable(8);
	anInt6479 = 0;
	anInt6480 = 1725721998;
    }
    
    public static void method11138() {
	aClass407_6471 = new HashTable(8);
	anInt6479 = 0;
	Iterator iterator = aList6475.iterator();
	while (iterator.hasNext()) {
	    Class489 class489 = (Class489) iterator.next();
	    class489.method11175();
	}
    }
    
    public static void method11139(JS5 class210) {
	anInt6476 = 0;
	anInt6473 = 0;
	aList6475 = new LinkedList();
	aClass247_Sub1_Sub1_Sub1Array6478 = new Class247_Sub1_Sub1_Sub1[1024];
	Class42.aClass489Array602
	    = new Class489[1 + Class90.anIntArray1300[275753719 * anInt6480]];
	anInt6474 = 0;
	anInt6472 = 0;
	Class75.method1763(class210, -1175460653);
	Class25.method936(class210, -665751245);
    }
    
    public static void method11140() {
	aClass407_6471 = new HashTable(8);
	anInt6479 = 0;
	Iterator iterator = aList6475.iterator();
	while (iterator.hasNext()) {
	    Class489 class489 = (Class489) iterator.next();
	    class489.method11175();
	}
    }
    
    public static void method11141(int i) {
	if (i < 0 || i > 2)
	    i = 0;
	anInt6480 = i * 862860999;
	Class42.aClass489Array602
	    = new Class489[Class90.anIntArray1300[anInt6480 * 275753719] + 1];
	anInt6474 = 0;
	anInt6472 = 0;
    }
    
    public static void method11142(int i) {
	if (i < 0 || i > 2)
	    i = 0;
	anInt6480 = i * 862860999;
	Class42.aClass489Array602
	    = new Class489[Class90.anIntArray1300[anInt6480 * 275753719] + 1];
	anInt6474 = 0;
	anInt6472 = 0;
    }
    
    public static int method11143() {
	return 275753719 * anInt6480;
    }
    
    public static int method11144() {
	return 275753719 * anInt6480;
    }
    
    public static void method11145(int[] is, Object[] objects, int i, int i_0_,
				   int i_1_) {
	if (i < i_0_) {
	    int i_2_ = (i_0_ + i) / 2;
	    int i_3_ = i;
	    int i_4_ = is[i_2_];
	    is[i_2_] = is[i_0_];
	    is[i_0_] = i_4_;
	    Object object = objects[i_2_];
	    objects[i_2_] = objects[i_0_];
	    objects[i_0_] = object;
	    int i_5_ = 2147483647 == i_4_ ? 0 : 1;
	    for (int i_6_ = i; i_6_ < i_0_; i_6_++) {
		if (is[i_6_] < i_4_ + (i_6_ & i_5_)) {
		    int i_7_ = is[i_6_];
		    is[i_6_] = is[i_3_];
		    is[i_3_] = i_7_;
		    Object object_8_ = objects[i_6_];
		    objects[i_6_] = objects[i_3_];
		    objects[i_3_++] = object_8_;
		}
	    }
	    is[i_0_] = is[i_3_];
	    is[i_3_] = i_4_;
	    objects[i_0_] = objects[i_3_];
	    objects[i_3_] = object;
	    method11145(is, objects, i, i_3_ - 1, -530253391);
	    method11145(is, objects, 1 + i_3_, i_0_, -530253391);
	}
    }
    
    static final void method11146(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.method13624(class58).method15040((short) -18686);
    }
    
    static final void method11147(ClientScriptData class454, byte i) {
	if (Class442.aBool6160 && null != Class228.aFrame2674)
	    Class537.method11899(Class241_Sub5_Sub9.aClass241_Sub9_11043
				     .aClass445_Sub30_8878
				     .method14386(-801965113),
				 -1, -1, false, 1482319719);
    }
}
