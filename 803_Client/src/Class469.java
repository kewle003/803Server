/* Class469 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

public class Class469
{
    static int method10747(char c, Language class437) {
	int i = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i = 1 + (c << 4);
	}
	if (c == 241 && Language.aClass437_6139 == class437)
	    i = 1762;
	return i;
    }
    
    public static int method10748(CharSequence charsequence,
				  CharSequence charsequence_0_,
				  Language class437) {
	int i = charsequence.length();
	int i_1_ = charsequence_0_.length();
	int i_2_ = 0;
	int i_3_ = 0;
	char c = '\0';
	char c_4_ = '\0';
	while (i_2_ - c < i || i_3_ - c_4_ < i_1_) {
	    if (i_2_ - c >= i)
		return -1;
	    if (i_3_ - c_4_ >= i_1_)
		return 1;
	    char c_5_;
	    if (c != 0) {
		c_5_ = c;
		boolean bool = false;
	    } else
		c_5_ = charsequence.charAt(i_2_++);
	    char c_6_;
	    if (c_4_ != 0) {
		c_6_ = c_4_;
		boolean bool = false;
	    } else
		c_6_ = charsequence_0_.charAt(i_3_++);
	    c = Class241_Sub21.method15058(c_5_, (byte) 0);
	    c_4_ = Class241_Sub21.method15058(c_6_, (byte) -42);
	    c_5_ = Class554.method12274(c_5_, class437, 128038617);
	    c_6_ = Class554.method12274(c_6_, class437, 128038617);
	    if (c_5_ != c_6_ && (Character.toUpperCase(c_5_)
				 != Character.toUpperCase(c_6_))) {
		c_5_ = Character.toLowerCase(c_5_);
		c_6_ = Character.toLowerCase(c_6_);
		if (c_5_ != c_6_)
		    return (Class500.method11373(c_5_, class437, (byte) 6)
			    - Class500.method11373(c_6_, class437,
						   (byte) 111));
	    }
	}
	int i_7_ = Math.min(i, i_1_);
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    if (Language.aClass437_6130 == class437) {
		i_2_ = i - 1 - i_8_;
		i_3_ = i_1_ - 1 - i_8_;
	    } else
		i_2_ = i_3_ = i_8_;
	    char c_9_ = charsequence.charAt(i_2_);
	    char c_10_ = charsequence_0_.charAt(i_3_);
	    if (c_9_ != c_10_ && (Character.toUpperCase(c_9_)
				  != Character.toUpperCase(c_10_))) {
		c_9_ = Character.toLowerCase(c_9_);
		c_10_ = Character.toLowerCase(c_10_);
		if (c_9_ != c_10_)
		    return (Class500.method11373(c_9_, class437, (byte) 101)
			    - Class500.method11373(c_10_, class437,
						   (byte) 92));
	    }
	}
	int i_11_ = i - i_1_;
	if (0 != i_11_)
	    return i_11_;
	for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
	    char c_13_ = charsequence.charAt(i_12_);
	    char c_14_ = charsequence_0_.charAt(i_12_);
	    if (c_13_ != c_14_)
		return (Class500.method11373(c_13_, class437, (byte) 67)
			- Class500.method11373(c_14_, class437, (byte) 101));
	}
	return 0;
    }
    
    static char method10749(char c, Language class437) {
	if (c >= '\u00c0' && c <= '\u00ff') {
	    if (c >= '\u00c0' && c <= '\u00c6')
		return 'A';
	    if (c == '\u00c7')
		return 'C';
	    if (c >= '\u00c8' && c <= '\u00cb')
		return 'E';
	    if (c >= '\u00cc' && c <= '\u00cf')
		return 'I';
	    if (c == '\u00d1' && Language.aClass437_6139 != class437)
		return 'N';
	    if (c >= '\u00d2' && c <= '\u00d6')
		return 'O';
	    if (c >= '\u00d9' && c <= '\u00dc')
		return 'U';
	    if ('\u00dd' == c)
		return 'Y';
	    if (c == '\u00df')
		return 's';
	    if (c >= '\u00e0' && c <= '\u00e6')
		return 'a';
	    if ('\u00e7' == c)
		return 'c';
	    if (c >= '\u00e8' && c <= '\u00eb')
		return 'e';
	    if (c >= '\u00ec' && c <= '\u00ef')
		return 'i';
	    if (c == '\u00f1' && class437 != Language.aClass437_6139)
		return 'n';
	    if (c >= '\u00f2' && c <= '\u00f6')
		return 'o';
	    if (c >= '\u00f9' && c <= '\u00fc')
		return 'u';
	    if ('\u00fd' == c || '\u00ff' == c)
		return 'y';
	}
	if ('\u0152' == c)
	    return 'O';
	if (c == '\u0153')
	    return 'o';
	if ('\u0178' == c)
	    return 'Y';
	return c;
    }
    
    static char method10750(char c) {
	if (c == '\u00c6')
	    return 'E';
	if (c == '\u00e6')
	    return 'e';
	if ('\u00df' == c)
	    return 's';
	if ('\u0152' == c)
	    return 'E';
	if (c == '\u0153')
	    return 'e';
	return '\0';
    }
    
    static int method10751(char c, Language class437) {
	int i = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i = 1 + (c << 4);
	}
	if (c == 241 && Language.aClass437_6139 == class437)
	    i = 1762;
	return i;
    }
    
    static int method10752(char c, Language class437) {
	int i = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i = 1 + (c << 4);
	}
	if (c == 241 && Language.aClass437_6139 == class437)
	    i = 1762;
	return i;
    }
    
    public static String method10753(long l, int i, boolean bool,
				     Language class437) {
	char c = ',';
	char c_15_ = '.';
	if (class437 == Language.LOCALE_EN) {
	    c = '.';
	    c_15_ = ',';
	}
	if (Language.aClass437_6130 == class437)
	    c_15_ = '\u00a0';
	boolean bool_16_ = false;
	if (l < 0L) {
	    bool_16_ = true;
	    l = -l;
	}
	StringBuilder stringbuilder = new StringBuilder(26);
	if (i > 0) {
	    for (int i_17_ = 0; i_17_ < i; i_17_++) {
		int i_18_ = (int) l;
		l /= 10L;
		stringbuilder.append((char) (i_18_ + 48 - (int) l * 10));
	    }
	    stringbuilder.append(c);
	}
	int i_19_ = 0;
	for (;;) {
	    int i_20_ = (int) l;
	    l /= 10L;
	    stringbuilder.append((char) (48 + i_20_ - (int) l * 10));
	    if (0L == l)
		break;
	    if (bool && ++i_19_ % 3 == 0)
		stringbuilder.append(c_15_);
	}
	if (bool_16_)
	    stringbuilder.append('-');
	return stringbuilder.reverse().toString();
    }
    
    static int method10754(char c, Language class437) {
	int i = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i = 1 + (c << 4);
	}
	if (c == 241 && Language.aClass437_6139 == class437)
	    i = 1762;
	return i;
    }
    
    Class469() throws Throwable {
	throw new Error();
    }
    
    public static String method10755(long l, int i, boolean bool,
				     Language class437) {
	char c = ',';
	char c_21_ = '.';
	if (class437 == Language.LOCALE_EN) {
	    c = '.';
	    c_21_ = ',';
	}
	if (Language.aClass437_6130 == class437)
	    c_21_ = '\u00a0';
	boolean bool_22_ = false;
	if (l < 0L) {
	    bool_22_ = true;
	    l = -l;
	}
	StringBuilder stringbuilder = new StringBuilder(26);
	if (i > 0) {
	    for (int i_23_ = 0; i_23_ < i; i_23_++) {
		int i_24_ = (int) l;
		l /= 10L;
		stringbuilder.append((char) (i_24_ + 48 - (int) l * 10));
	    }
	    stringbuilder.append(c);
	}
	int i_25_ = 0;
	for (;;) {
	    int i_26_ = (int) l;
	    l /= 10L;
	    stringbuilder.append((char) (48 + i_26_ - (int) l * 10));
	    if (0L == l)
		break;
	    if (bool && ++i_25_ % 3 == 0)
		stringbuilder.append(c_21_);
	}
	if (bool_22_)
	    stringbuilder.append('-');
	return stringbuilder.reverse().toString();
    }
    
    static final void method10756(InterfaceComponent class58, ClientScriptData class454, byte i) {
	int i_27_ = 10;
	int i_28_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_29_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class70.method1727(class58, i_27_, i_28_, i_29_, class454, 1743923845);
    }
    
    static void method10757(int i) {
	Class119.aClass578_1564.method12691((byte) 0);
	Class106.aClass580_1503.method12721(-290357331);
	ObjectDefinition.aclient6907.addcanvas((byte) 7);
	Class344.canvas.setBackground(Color.black);
	client.currentCursor = -69039677;
	Class119.aClass578_1564
	    = Class410.method7457(Class344.canvas, (byte) 46);
	Class106.aClass580_1503
	    = Class442.method7847(Class344.canvas, true, 1326685119);
    }
    
    public static int method10758(long l) {
	Class447.method7916(l);
	return Class638.aCalendar8252.get(1);
    }
}
