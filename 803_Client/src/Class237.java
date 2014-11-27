/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class237
{
    static Interface18 anInterface18_2714;
    
    public static void method4729(Interface18 interface18) {
	if (anInterface18_2714 != null)
	    throw new IllegalStateException("");
	anInterface18_2714 = interface18;
    }
    
    Class237() throws Throwable {
	throw new Error();
    }
    
    public static void method4730(Interface18 interface18) {
	if (anInterface18_2714 != null)
	    throw new IllegalStateException("");
	anInterface18_2714 = interface18;
    }
    
    public static void method4731(Interface18 interface18) {
	if (anInterface18_2714 != null)
	    throw new IllegalStateException("");
	anInterface18_2714 = interface18;
    }
    
    public static Interface18 method4732() {
	if (anInterface18_2714 == null)
	    throw new IllegalStateException("");
	return anInterface18_2714;
    }
    
    public static boolean method4733() {
	return anInterface18_2714 != null;
    }
    
    public static boolean method4734() {
	return anInterface18_2714 != null;
    }
    
    static final void method4735(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = Class372.method6659((byte) 37);
	if (class241_sub39_sub12 != null) {
	    boolean bool
		= class241_sub39_sub12.method17255(i_0_ >> 14 & 0x3fff,
						   i_0_ & 0x3fff,
						   Class450.anIntArray6199,
						   (byte) 64);
	    if (bool) {
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = Class450.anIntArray6199[1];
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = Class450.anIntArray6199[2];
	    } else {
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = -1;
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = -1;
	    }
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	}
    }
    
    static final void method4736(ClientScriptData class454, int i) {
	String string = null;
	if (Class621.aClass4_7876 != null)
	    string = Class621.aClass4_7876.method470(1449156561);
	if (null == string)
	    string = "";
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = string;
    }
    
    static long method4737(Interface24 interface24, int i, int i_1_,
			   int i_2_) {
	long l = 4194304L;
	long l_3_ = -9223372036854775808L;
	ObjectDefinition class526
	    = client.aClass238_8477.getObjectLoader(-1832247009)
		  .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	long l_4_
	    = (long) (i | i_1_ << 7 | interface24.method139(591463713) << 14
		      | interface24.method140(991815580) << 20 | 0x40000000);
	if (class526.anInt6848 * -1389471035 == 0)
	    l_4_ |= l_3_;
	if (class526.anInt6881 * -309513503 == 1)
	    l_4_ |= l;
	l_4_ |= (long) interface24.method146((byte) 0) << 32;
	return l_4_;
    }
}
