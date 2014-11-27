/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public class Class494
{
    static Class639 aClass639_6519;
    static Class109 aClass109_6520 = new Class109(128);
    public static int canvasWid;//anInt6521
    
    public static void method11270() {
	aClass109_6520.method2756(-1602239976);
    }
    
    static ClientScript method11271(int i) {
	ClientScript class241_sub39_sub1
	    = (ClientScript) aClass109_6520.method2754((long) i);
	if (null != class241_sub39_sub1)
	    return class241_sub39_sub1;
	byte[] is = Class547.CS2_ARCHIVE.getfile(i, 0, -1188004775);
	if (is == null || is.length <= 1)
	    return null;
	try {
	    class241_sub39_sub1 = Class275.method5347(is, (byte) 71);
	} catch (Exception exception) {
	    throw new RuntimeException(new StringBuilder().append
					   (exception.getMessage()).append
					   (" ").append
					   (i).toString());
	}
	aClass109_6520.method2755(class241_sub39_sub1, (long) i);
	return class241_sub39_sub1;
    }
    
    public static void method11272() {
	aClass109_6520.method2756(-2050456544);
    }
    
    static ClientScript method11273(Class614 class614, int i,
					   int i_0_) {
	int i_1_ = 1620825253 * class614.anInt7816 | i << 10;
	ClientScript class241_sub39_sub1
	    = ((ClientScript)
	       aClass109_6520.method2754((long) i_1_ << 16));
	if (class241_sub39_sub1 != null)
	    return class241_sub39_sub1;
	byte[] is = (Class547.CS2_ARCHIVE.method4194
		     (Class547.CS2_ARCHIVE.method4203(i_1_, 890691550),
		      180461400));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class241_sub39_sub1 = Class275.method5347(is, (byte) 103);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_1_).toString());
	    }
	    class241_sub39_sub1.aClass614_10821 = class614;
	    aClass109_6520.method2755(class241_sub39_sub1, (long) i_1_ << 16);
	    return class241_sub39_sub1;
	}
	i_1_ = 1620825253 * class614.anInt7816 | i_0_ + 65536 << 10;
	class241_sub39_sub1 = ((ClientScript)
			       aClass109_6520.method2754((long) i_1_ << 16));
	if (class241_sub39_sub1 != null)
	    return class241_sub39_sub1;
	is = (Class547.CS2_ARCHIVE.method4194
	      (Class547.CS2_ARCHIVE.method4203(i_1_, -1917725883),
	       866419933));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class241_sub39_sub1 = Class275.method5347(is, (byte) 15);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_1_).toString());
	    }
	    class241_sub39_sub1.aClass614_10821 = class614;
	    aClass109_6520.method2755(class241_sub39_sub1, (long) i_1_ << 16);
	    return class241_sub39_sub1;
	}
	i_1_ = 1620825253 * class614.anInt7816 | 0x3fffc00;
	class241_sub39_sub1 = ((ClientScript)
			       aClass109_6520.method2754((long) i_1_ << 16));
	if (null != class241_sub39_sub1)
	    return class241_sub39_sub1;
	is = (Class547.CS2_ARCHIVE.method4194
	      (Class547.CS2_ARCHIVE.method4203(i_1_, -1364903761),
	       268540223));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class241_sub39_sub1 = Class275.method5347(is, (byte) 112);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_1_).toString());
	    }
	    class241_sub39_sub1.aClass614_10821 = class614;
	    aClass109_6520.method2755(class241_sub39_sub1, (long) i_1_ << 16);
	    return class241_sub39_sub1;
	}
	return null;
    }
    
    Class494() throws Throwable {
	throw new Error();
    }
    
    static ClientScript method11274(int i) {
	ClientScript class241_sub39_sub1
	    = (ClientScript) aClass109_6520.method2754((long) i);
	if (null != class241_sub39_sub1)
	    return class241_sub39_sub1;
	byte[] is = Class547.CS2_ARCHIVE.getfile(i, 0, 751010931);
	if (is == null || is.length <= 1)
	    return null;
	try {
	    class241_sub39_sub1 = Class275.method5347(is, (byte) 49);
	} catch (Exception exception) {
	    throw new RuntimeException(new StringBuilder().append
					   (exception.getMessage()).append
					   (" ").append
					   (i).toString());
	}
	aClass109_6520.method2755(class241_sub39_sub1, (long) i);
	return class241_sub39_sub1;
    }
    
    public static void method11275() {
	aClass109_6520.method2756(476884096);
    }
    
    static final void method11276(ClientScriptData class454, int i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_2_, (byte) -83);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_2_ >> 16];
	IsaacCipher.method7507(class58, class35, class454, 1177190798);
    }
    
    static final void method11277(ClientScriptData class454, short i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aClass220Array8426[i_3_].anInt2566 * -1108393173;
    }
    
    public static Interface47 method11278(Class var_class, int i, byte i_4_) {
	synchronized (Class438.aMap6143) {
	    Map map = (Map) Class438.aMap6143.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface47[] interface47s
		    = (Interface47[]) var_class.getEnumConstants();
		for (int i_5_ = 0; i_5_ < interface47s.length; i_5_++) {
		    Interface47 interface47 = interface47s[i_5_];
		    map.put(Integer.valueOf(interface47.getId((byte) 0)),
			    interface47);
		}
		Class438.aMap6143.put(var_class, map);
	    }
	    Interface47 interface47
		= (Interface47) map.get(Integer.valueOf(i));
	    return interface47;
	}
    }
    
    static final boolean isSeperator/*method11279*/(char c, int i) {
    	return c == '\u00a0' || ' ' == c || c == '_' || c == '-';
    }
    
    static final void ifLtSkip/*method11280*/(ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= -821458770;
		if (scriptData.integerStack[1482319719 * scriptData.intStackPointer]
				< scriptData.integerStack[scriptData.intStackPointer * 1482319719 + 1]) {
			scriptData.step += (scriptData.integerConstants[scriptData.step * 1938982693] * 1924545709);
		}
    }
    
    public static int convertStringIdentifier/*method11281*/(CharSequence charsequence, int i) {
		int i_6_ = charsequence.length();
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
			i_7_ = ((i_7_ << 5) - i_7_ + Class76.method1773(charsequence.charAt(i_8_), 374177275));
		}
		return i_7_;
    }
}
