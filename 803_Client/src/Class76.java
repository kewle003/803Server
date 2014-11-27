/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class76
{
    static Class76 aClass76_1110;
    static Class76 aClass76_1111;
    static Class76 aClass76_1112 = new Class76(0);
    int anInt1113;
    
    static {
	aClass76_1111 = new Class76(1);
	aClass76_1110 = new Class76(2);
    }
    
    Class76(int i) {
	((Class76) this).anInt1113 = 718976995 * i;
    }
    
    static Class76 method1768(int i) {
	if (i == ((Class76) aClass76_1112).anInt1113 * 2063615435)
	    return aClass76_1112;
	if (i == ((Class76) aClass76_1111).anInt1113 * 2063615435)
	    return aClass76_1111;
	if (i == 2063615435 * ((Class76) aClass76_1110).anInt1113)
	    return aClass76_1110;
	return null;
    }
    
    public static void method1769(float[] fs, int[] is, int i, int i_0_,
				  int i_1_) {
	if (i < i_0_) {
	    int i_2_ = (i + i_0_) / 2;
	    int i_3_ = i;
	    float f = fs[i_2_];
	    fs[i_2_] = fs[i_0_];
	    fs[i_0_] = f;
	    int i_4_ = is[i_2_];
	    is[i_2_] = is[i_0_];
	    is[i_0_] = i_4_;
	    for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
		if (fs[i_5_] > f) {
		    float f_6_ = fs[i_5_];
		    fs[i_5_] = fs[i_3_];
		    fs[i_3_] = f_6_;
		    int i_7_ = is[i_5_];
		    is[i_5_] = is[i_3_];
		    is[i_3_++] = i_7_;
		}
	    }
	    fs[i_0_] = fs[i_3_];
	    fs[i_3_] = f;
	    is[i_0_] = is[i_3_];
	    is[i_3_] = i_4_;
	    method1769(fs, is, i, i_3_ - 1, 149220399);
	    method1769(fs, is, i_3_ + 1, i_0_, -731039172);
	}
    }
    
    static final void method1770(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	byte[] is = { (byte) ((ClientScriptData) class454).integerStack
			     [((ClientScriptData) class454).intStackPointer * 1482319719] };
	byte[] is_8_
	    = { (byte) ((ClientScriptData) class454).integerStack
		       [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer] };
	int i_9_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_9_, (byte) -39);
	Class124.method2995(class58, is, is_8_, class454, -1474777819);
    }
    
    static final void method1771(InterfaceComponent class58, ClientScriptData class454, int i) {
	if (-400164103 * ((ClientScriptData) class454).anInt6216 >= 10)
	    throw new RuntimeException();
	if (class58.anObjectArray983 != null) {
	    ClientScriptCaller class241_sub14 = new ClientScriptCaller();
	    class241_sub14.component = class58;
	    class241_sub14.paramaters = class58.anObjectArray983;
	    ((ClientScriptCaller) class241_sub14).anInt8977
		= 1089746931 + ((ClientScriptData) class454).anInt6216 * -95635109;
	    client.aClass429_8541.addNode(class241_sub14, (short) -27810);
	}
    }
    
    public static boolean method1772(int i, byte i_10_) {
	return i == (i & -i);
    }
    
    public static byte method1773(char c, int i) {
	byte i_11_;
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    i_11_ = (byte) c;
	else if (c == '\u20ac')
	    i_11_ = (byte) -128;
	else if (c == '\u201a')
	    i_11_ = (byte) -126;
	else if ('\u0192' == c)
	    i_11_ = (byte) -125;
	else if (c == '\u201e')
	    i_11_ = (byte) -124;
	else if (c == '\u2026')
	    i_11_ = (byte) -123;
	else if ('\u2020' == c)
	    i_11_ = (byte) -122;
	else if ('\u2021' == c)
	    i_11_ = (byte) -121;
	else if (c == '\u02c6')
	    i_11_ = (byte) -120;
	else if ('\u2030' == c)
	    i_11_ = (byte) -119;
	else if ('\u0160' == c)
	    i_11_ = (byte) -118;
	else if ('\u2039' == c)
	    i_11_ = (byte) -117;
	else if (c == '\u0152')
	    i_11_ = (byte) -116;
	else if (c == '\u017d')
	    i_11_ = (byte) -114;
	else if (c == '\u2018')
	    i_11_ = (byte) -111;
	else if (c == '\u2019')
	    i_11_ = (byte) -110;
	else if (c == '\u201c')
	    i_11_ = (byte) -109;
	else if ('\u201d' == c)
	    i_11_ = (byte) -108;
	else if (c == '\u2022')
	    i_11_ = (byte) -107;
	else if ('\u2013' == c)
	    i_11_ = (byte) -106;
	else if (c == '\u2014')
	    i_11_ = (byte) -105;
	else if (c == '\u02dc')
	    i_11_ = (byte) -104;
	else if (c == '\u2122')
	    i_11_ = (byte) -103;
	else if ('\u0161' == c)
	    i_11_ = (byte) -102;
	else if ('\u203a' == c)
	    i_11_ = (byte) -101;
	else if ('\u0153' == c)
	    i_11_ = (byte) -100;
	else if (c == '\u017e')
	    i_11_ = (byte) -98;
	else if ('\u0178' == c)
	    i_11_ = (byte) -97;
	else
	    i_11_ = (byte) 63;
	return i_11_;
    }
}
