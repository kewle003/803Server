/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Desktop;
import java.net.URI;
import java.net.URL;

public class Class242
{
    static final int anInt2777 = 2;
    public static final int anInt2778 = 1;
    static final int anInt2779 = 0;
    static String aString2780;
    static Applet anApplet2781 = null;
    static final int anInt2782 = 3;
    static int[] anIntArray2783;
    
    static {
	aString2780 = null;
    }
    
    public static boolean method4901(String string, int i, String string_0_) {
	if (i == 0) {
	    boolean bool;
	    try {
		if (!aString2780.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_1_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
		    if (string_1_.indexOf(string.charAt(i_2_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (i == 1) {
	    boolean bool;
	    try {
		Object object
		    = Class396.method7104(anApplet2781, string_0_,
					  (new Object[]
					   { new URL
						 (anApplet2781.getCodeBase(),
						  string)
						 .toString() }),
					  925426890);
		bool = null != object;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet2781.getAppletContext().showDocument
		    (new URL(anApplet2781.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class396.callNoParamater(anApplet2781, "loggedout", (byte) -21);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet2781.getAppletContext().showDocument
		    (new URL(anApplet2781.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    public static void method4902(Applet applet, String string) {
	anApplet2781 = applet;
	aString2780 = string;
    }
    
    public static void method4903(String string, boolean bool,
				  boolean bool_3_) {
	Class16.method853(string, bool, "openjs", bool_3_, -1796196245);
    }
    
    public static void method4904(String string, boolean bool,
				  boolean bool_4_) {
	Class16.method853(string, bool, "openjs", bool_4_, -1796196245);
    }
    
    public static void method4905(String string, boolean bool,
				  String string_5_, boolean bool_6_) {
	if (bool) {
	    do {
		if (!bool_6_ && Desktop.isDesktopSupported()
		    && Desktop.getDesktop()
			   .isSupported(Desktop.Action.BROWSE)) {
		    try {
			Desktop.getDesktop().browse(new URI(string));
		    } catch (Exception exception) {
			break;
		    }
		    return;
		}
	    } while (false);
	    if (aString2780.startsWith("win") && !bool_6_)
		Class330.method6035(string, 0, 1467128901);
	    else if (aString2780.startsWith("mac"))
		Class68.method1676(string, 1, string_5_, -1460381707);
	    else
		Class330.method6035(string, 2, 1467128901);
	} else
	    Class330.method6035(string, 3, 1467128901);
    }
    
    public static boolean method4906(String string, int i, String string_7_) {
	if (i == 0) {
	    boolean bool;
	    try {
		if (!aString2780.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_8_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_9_ = 0; i_9_ < string.length(); i_9_++) {
		    if (string_8_.indexOf(string.charAt(i_9_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (i == 1) {
	    boolean bool;
	    try {
		Object object
		    = Class396.method7104(anApplet2781, string_7_,
					  (new Object[]
					   { new URL
						 (anApplet2781.getCodeBase(),
						  string)
						 .toString() }),
					  1366408899);
		bool = null != object;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet2781.getAppletContext().showDocument
		    (new URL(anApplet2781.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class396.callNoParamater(anApplet2781, "loggedout", (byte) -126);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet2781.getAppletContext().showDocument
		    (new URL(anApplet2781.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    public static boolean method4907(String string, int i, String string_10_) {
	if (i == 0) {
	    boolean bool;
	    try {
		if (!aString2780.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_11_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_12_ = 0; i_12_ < string.length(); i_12_++) {
		    if (string_11_.indexOf(string.charAt(i_12_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (i == 1) {
	    boolean bool;
	    try {
		Object object
		    = Class396.method7104(anApplet2781, string_10_,
					  (new Object[]
					   { new URL
						 (anApplet2781.getCodeBase(),
						  string)
						 .toString() }),
					  1116087920);
		bool = null != object;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet2781.getAppletContext().showDocument
		    (new URL(anApplet2781.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class396.callNoParamater(anApplet2781, "loggedout", (byte) -60);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet2781.getAppletContext().showDocument
		    (new URL(anApplet2781.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    Class242() throws Throwable {
	throw new Error();
    }
    
    public static boolean method4908(String string, int i, String string_13_) {
	if (i == 0) {
	    boolean bool;
	    try {
		if (!aString2780.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_14_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_15_ = 0; i_15_ < string.length(); i_15_++) {
		    if (string_14_.indexOf(string.charAt(i_15_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (i == 1) {
	    boolean bool;
	    try {
		Object object
		    = Class396.method7104(anApplet2781, string_13_,
					  (new Object[]
					   { new URL
						 (anApplet2781.getCodeBase(),
						  string)
						 .toString() }),
					  -382488024);
		bool = null != object;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet2781.getAppletContext().showDocument
		    (new URL(anApplet2781.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class396.callNoParamater(anApplet2781, "loggedout", (byte) -54);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet2781.getAppletContext().showDocument
		    (new URL(anApplet2781.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    static final void method4909(ClientScriptData class454, int i) {
	int i_16_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_16_, (byte) -3);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_16_ >> 16];
	HitMarkTypeList.method12290(class58, class35, class454, (byte) 0);
    }
    
    static final void method4910(ClientScriptData class454, byte i) {
	int i_17_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_17_, (byte) -34);
	Class570.method12516(class58, class454, (short) -5557);
    }
    
    static final void method4911(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.anInt8470 * 475273047;
    }
}
