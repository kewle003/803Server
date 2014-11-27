/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class451
{
    public static String method10495(int i, boolean bool) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class590.method12909(i, 10, bool, 1213011492);
    }
    
    static int method10496(CharSequence charsequence, char c) {
	int i = 0;
	int i_0_ = charsequence.length();
	for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
	    if (charsequence.charAt(i_1_) == c)
		i++;
	}
	return i;
    }
    
    static int method10497(CharSequence charsequence, char c) {
	int i = 0;
	int i_2_ = charsequence.length();
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    if (charsequence.charAt(i_3_) == c)
		i++;
	}
	return i;
    }
    
    public static String method10498(Object[] objects, int i, int i_4_) {
	if (i_4_ == 0)
	    return "";
	if (i_4_ == 1) {
	    CharSequence charsequence = (CharSequence) objects[i];
	    if (null == charsequence)
		return "null";
	    return charsequence.toString();
	}
	int i_5_ = i + i_4_;
	int i_6_ = 0;
	for (int i_7_ = i; i_7_ < i_5_; i_7_++) {
	    CharSequence charsequence = (CharSequence) objects[i_7_];
	    if (charsequence == null)
		i_6_ += 4;
	    else
		i_6_ += charsequence.length();
	}
	StringBuilder stringbuilder = new StringBuilder(i_6_);
	for (int i_8_ = i; i_8_ < i_5_; i_8_++) {
	    CharSequence charsequence = (CharSequence) objects[i_8_];
	    if (charsequence == null)
		stringbuilder.append("null");
	    else
		stringbuilder.append(charsequence);
	}
	return stringbuilder.toString();
    }
    
    static boolean method10499(CharSequence charsequence, int i,
			       boolean bool) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	int i_11_ = 0;
	int i_12_ = charsequence.length();
	for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
	    int i_14_ = charsequence.charAt(i_13_);
	    if (i_13_ == 0) {
		if (45 == i_14_) {
		    bool_9_ = true;
		    continue;
		}
		if (43 == i_14_ && bool)
		    continue;
	    }
	    if (i_14_ >= 48 && i_14_ <= 57)
		i_14_ -= 48;
	    else if (i_14_ >= 65 && i_14_ <= 90)
		i_14_ -= 55;
	    else if (i_14_ >= 97 && i_14_ <= 122)
		i_14_ -= 87;
	    else
		return false;
	    if (i_14_ >= i)
		return false;
	    if (bool_9_)
		i_14_ = -i_14_;
	    int i_15_ = i_14_ + i_11_ * i;
	    if (i_11_ != i_15_ / i)
		return false;
	    i_11_ = i_15_;
	    bool_10_ = true;
	}
	return bool_10_;
    }
    
    public static boolean method10500(char c) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
    
    public static boolean method10501(char c) {
	if (c >= ' ' && c <= '~')
	    return true;
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if ('\u20ac' == c || '\u0152' == c || c == '\u2014' || '\u0153' == c
	    || '\u0178' == c)
	    return true;
	return false;
    }
    
    public static long method10502(CharSequence charsequence) {
	int i = charsequence.length();
	long l = 0L;
	for (int i_16_ = 0; i_16_ < i; i_16_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_16_);
	return l;
    }
    
    static boolean method10503(CharSequence charsequence, int i,
			       boolean bool) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_17_ = false;
	boolean bool_18_ = false;
	int i_19_ = 0;
	int i_20_ = charsequence.length();
	for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
	    int i_22_ = charsequence.charAt(i_21_);
	    if (i_21_ == 0) {
		if (45 == i_22_) {
		    bool_17_ = true;
		    continue;
		}
		if (43 == i_22_ && bool)
		    continue;
	    }
	    if (i_22_ >= 48 && i_22_ <= 57)
		i_22_ -= 48;
	    else if (i_22_ >= 65 && i_22_ <= 90)
		i_22_ -= 55;
	    else if (i_22_ >= 97 && i_22_ <= 122)
		i_22_ -= 87;
	    else
		return false;
	    if (i_22_ >= i)
		return false;
	    if (bool_17_)
		i_22_ = -i_22_;
	    int i_23_ = i_22_ + i_19_ * i;
	    if (i_19_ != i_23_ / i)
		return false;
	    i_19_ = i_23_;
	    bool_18_ = true;
	}
	return bool_18_;
    }
    
    static int method10504(CharSequence charsequence, int i, boolean bool) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_24_ = false;
	boolean bool_25_ = false;
	int i_26_ = 0;
	int i_27_ = charsequence.length();
	for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
	    int i_29_ = charsequence.charAt(i_28_);
	    if (0 == i_28_) {
		if (45 == i_29_) {
		    bool_24_ = true;
		    continue;
		}
		if (i_29_ == 43 && bool)
		    continue;
	    }
	    if (i_29_ >= 48 && i_29_ <= 57)
		i_29_ -= 48;
	    else if (i_29_ >= 65 && i_29_ <= 90)
		i_29_ -= 55;
	    else if (i_29_ >= 97 && i_29_ <= 122)
		i_29_ -= 87;
	    else
		throw new NumberFormatException();
	    if (i_29_ >= i)
		throw new NumberFormatException();
	    if (bool_24_)
		i_29_ = -i_29_;
	    int i_30_ = i * i_26_ + i_29_;
	    if (i_26_ != i_30_ / i)
		throw new NumberFormatException();
	    i_26_ = i_30_;
	    bool_25_ = true;
	}
	if (!bool_25_)
	    throw new NumberFormatException();
	return i_26_;
    }
    
    public static boolean method10505(CharSequence charsequence) {
	return Class248.method4987(charsequence, 10, true, 642740103);
    }
    
    Class451() throws Throwable {
	throw new Error();
    }
    
    public static String method10506(int i, boolean bool) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class590.method12909(i, 10, bool, 1213011492);
    }
    
    public static boolean method10507(CharSequence charsequence) {
	return Class248.method4987(charsequence, 10, true, 1347941594);
    }
    
    public static String method10508(int i, boolean bool) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class590.method12909(i, 10, bool, 1213011492);
    }
    
    static String method10509(int i, int i_31_, boolean bool) {
	if (i_31_ < 2 || i_31_ > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i_31_).toString());
	if (!bool || i < 0)
	    return Integer.toString(i, i_31_);
	int i_32_ = 2;
	int i_33_ = i / i_31_;
	while (i_33_ != 0) {
	    i_33_ /= i_31_;
	    i_32_++;
	}
	char[] cs = new char[i_32_];
	cs[0] = '+';
	for (int i_34_ = i_32_ - 1; i_34_ > 0; i_34_--) {
	    int i_35_ = i;
	    i /= i_31_;
	    int i_36_ = i_35_ - i * i_31_;
	    if (i_36_ >= 10)
		cs[i_34_] = (char) (i_36_ + 87);
	    else
		cs[i_34_] = (char) (48 + i_36_);
	}
	return new String(cs);
    }
    
    static String method10510(int i, int i_37_, boolean bool) {
	if (i_37_ < 2 || i_37_ > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i_37_).toString());
	if (!bool || i < 0)
	    return Integer.toString(i, i_37_);
	int i_38_ = 2;
	int i_39_ = i / i_37_;
	while (i_39_ != 0) {
	    i_39_ /= i_37_;
	    i_38_++;
	}
	char[] cs = new char[i_38_];
	cs[0] = '+';
	for (int i_40_ = i_38_ - 1; i_40_ > 0; i_40_--) {
	    int i_41_ = i;
	    i /= i_37_;
	    int i_42_ = i_41_ - i * i_37_;
	    if (i_42_ >= 10)
		cs[i_40_] = (char) (i_42_ + 87);
	    else
		cs[i_40_] = (char) (48 + i_42_);
	}
	return new String(cs);
    }
    
    public static int method10511(CharSequence charsequence) {
	int i = charsequence.length();
	int i_43_ = 0;
	for (int i_44_ = 0; i_44_ < i; i_44_++)
	    i_43_ = ((i_43_ << 5) - i_43_
		     + Class76.method1773(charsequence.charAt(i_44_),
					  1683731370));
	return i_43_;
    }
    
    public static int method10512(CharSequence charsequence) {
	int i = charsequence.length();
	int i_45_ = 0;
	for (int i_46_ = 0; i_46_ < i; i_46_++)
	    i_45_ = (i_45_ << 5) - i_45_ + charsequence.charAt(i_46_);
	return i_45_;
    }
    
    public static String method10513(String string, char c,
				     String string_47_) {
	int i = string.length();
	int i_48_ = string_47_.length();
	int i_49_ = i;
	int i_50_ = i_48_ - 1;
	if (0 != i_50_) {
	    int i_51_ = 0;
	    for (;;) {
		i_51_ = string.indexOf(c, i_51_);
		if (i_51_ < 0)
		    break;
		i_51_++;
		i_49_ += i_50_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_49_);
	int i_52_ = 0;
	for (;;) {
	    int i_53_ = string.indexOf(c, i_52_);
	    if (i_53_ < 0)
		break;
	    stringbuilder.append(string.substring(i_52_, i_53_));
	    stringbuilder.append(string_47_);
	    i_52_ = 1 + i_53_;
	}
	stringbuilder.append(string.substring(i_52_));
	return stringbuilder.toString();
    }
    
    public static long method10514(CharSequence charsequence) {
	int i = charsequence.length();
	long l = 0L;
	for (int i_54_ = 0; i_54_ < i; i_54_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_54_);
	return l;
    }
    
    public static long method10515(CharSequence charsequence) {
	int i = charsequence.length();
	long l = 0L;
	for (int i_55_ = 0; i_55_ < i; i_55_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_55_);
	return l;
    }
    
    public static long method10516(CharSequence charsequence) {
	int i = charsequence.length();
	long l = 0L;
	for (int i_56_ = 0; i_56_ < i; i_56_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_56_);
	return l;
    }
    
    public static boolean method10517(char c) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
    
    public static int method10518(CharSequence charsequence) {
	return Class403.method7210(charsequence, 10, true, (byte) -60);
    }
    
    public static boolean method10519(char c) {
	return c >= '0' && c <= '9';
    }
    
    public static boolean method10520(char c) {
	return c >= '0' && c <= '9';
    }
    
    public static boolean method10521(char c) {
	return c >= '0' && c <= '9';
    }
    
    public static boolean method10522(char c) {
	return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z'
		|| c >= 'a' && c <= 'z');
    }
    
    public static boolean method10523(char c) {
	return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z'
		|| c >= 'a' && c <= 'z');
    }
    
    public static String method10524(String string, char c,
				     String string_57_) {
	int i = string.length();
	int i_58_ = string_57_.length();
	int i_59_ = i;
	int i_60_ = i_58_ - 1;
	if (0 != i_60_) {
	    int i_61_ = 0;
	    for (;;) {
		i_61_ = string.indexOf(c, i_61_);
		if (i_61_ < 0)
		    break;
		i_61_++;
		i_59_ += i_60_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_59_);
	int i_62_ = 0;
	for (;;) {
	    int i_63_ = string.indexOf(c, i_62_);
	    if (i_63_ < 0)
		break;
	    stringbuilder.append(string.substring(i_62_, i_63_));
	    stringbuilder.append(string_57_);
	    i_62_ = 1 + i_63_;
	}
	stringbuilder.append(string.substring(i_62_));
	return stringbuilder.toString();
    }
    
    public static String method10525(String string, char c,
				     String string_64_) {
	int i = string.length();
	int i_65_ = string_64_.length();
	int i_66_ = i;
	int i_67_ = i_65_ - 1;
	if (0 != i_67_) {
	    int i_68_ = 0;
	    for (;;) {
		i_68_ = string.indexOf(c, i_68_);
		if (i_68_ < 0)
		    break;
		i_68_++;
		i_66_ += i_67_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_66_);
	int i_69_ = 0;
	for (;;) {
	    int i_70_ = string.indexOf(c, i_69_);
	    if (i_70_ < 0)
		break;
	    stringbuilder.append(string.substring(i_69_, i_70_));
	    stringbuilder.append(string_64_);
	    i_69_ = 1 + i_70_;
	}
	stringbuilder.append(string.substring(i_69_));
	return stringbuilder.toString();
    }
    
    public static int method10526(CharSequence charsequence, int i) {
	return Class403.method7210(charsequence, i, true, (byte) -61);
    }
    
    public static String[] method10527(String string, char c) {
	int i = ServerConnection.method3909(string, c, (short) 16484);
	String[] strings = new String[i + 1];
	int i_71_ = 0;
	int i_72_ = 0;
	for (int i_73_ = 0; i_73_ < i; i_73_++) {
	    int i_74_;
	    for (i_74_ = i_72_; string.charAt(i_74_) != c; i_74_++) {
		/* empty */
	    }
	    strings[i_71_++] = string.substring(i_72_, i_74_);
	    i_72_ = i_74_ + 1;
	}
	strings[i] = string.substring(i_72_);
	return strings;
    }
    
    public static String[] method10528(String string, char c) {
	int i = ServerConnection.method3909(string, c, (short) 3040);
	String[] strings = new String[i + 1];
	int i_75_ = 0;
	int i_76_ = 0;
	for (int i_77_ = 0; i_77_ < i; i_77_++) {
	    int i_78_;
	    for (i_78_ = i_76_; string.charAt(i_78_) != c; i_78_++) {
		/* empty */
	    }
	    strings[i_75_++] = string.substring(i_76_, i_78_);
	    i_76_ = i_78_ + 1;
	}
	strings[i] = string.substring(i_76_);
	return strings;
    }
    
    public static String[] method10529(String string, char c) {
	int i = ServerConnection.method3909(string, c, (short) 11760);
	String[] strings = new String[i + 1];
	int i_79_ = 0;
	int i_80_ = 0;
	for (int i_81_ = 0; i_81_ < i; i_81_++) {
	    int i_82_;
	    for (i_82_ = i_80_; string.charAt(i_82_) != c; i_82_++) {
		/* empty */
	    }
	    strings[i_79_++] = string.substring(i_80_, i_82_);
	    i_80_ = i_82_ + 1;
	}
	strings[i] = string.substring(i_80_);
	return strings;
    }
    
    static boolean method10530(CharSequence charsequence, int i,
			       boolean bool) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_83_ = false;
	boolean bool_84_ = false;
	int i_85_ = 0;
	int i_86_ = charsequence.length();
	for (int i_87_ = 0; i_87_ < i_86_; i_87_++) {
	    int i_88_ = charsequence.charAt(i_87_);
	    if (i_87_ == 0) {
		if (45 == i_88_) {
		    bool_83_ = true;
		    continue;
		}
		if (43 == i_88_ && bool)
		    continue;
	    }
	    if (i_88_ >= 48 && i_88_ <= 57)
		i_88_ -= 48;
	    else if (i_88_ >= 65 && i_88_ <= 90)
		i_88_ -= 55;
	    else if (i_88_ >= 97 && i_88_ <= 122)
		i_88_ -= 87;
	    else
		return false;
	    if (i_88_ >= i)
		return false;
	    if (bool_83_)
		i_88_ = -i_88_;
	    int i_89_ = i_88_ + i_85_ * i;
	    if (i_85_ != i_89_ / i)
		return false;
	    i_85_ = i_89_;
	    bool_84_ = true;
	}
	return bool_84_;
    }
    
    public static boolean method10531(char c) {
	if (c >= ' ' && c <= '~')
	    return true;
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if ('\u20ac' == c || '\u0152' == c || c == '\u2014' || '\u0153' == c
	    || '\u0178' == c)
	    return true;
	return false;
    }
    
    public static boolean method10532(char c) {
	if (c >= ' ' && c <= '~')
	    return true;
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if ('\u20ac' == c || '\u0152' == c || c == '\u2014' || '\u0153' == c
	    || '\u0178' == c)
	    return true;
	return false;
    }
    
    public static boolean method10533(char c) {
	if (c >= ' ' && c <= '~')
	    return true;
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if ('\u20ac' == c || '\u0152' == c || c == '\u2014' || '\u0153' == c
	    || '\u0178' == c)
	    return true;
	return false;
    }
    
    static final void method10534(ClientScriptData class454, int i) {
	Class370.method6618(class454,
			    (((ClientScriptData) class454)
			     .varEntity),
			    (byte) -18);
    }
    
    public static void method10535(int i, byte i_90_) {
	Class473.aBoolArray6378[i] = false;
	IsaacCipher.method7509(i, 1697037574);
    }
    
    static final void method10536(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_91_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_92_ = (((ClientScriptData) class454).integerStack
		     [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	if (i_91_ != -1) {
	    if (i_92_ > 255)
		i_92_ = 255;
	    else if (i_92_ < 0)
		i_92_ = 0;
	    Class270.method5303(i_91_, i_92_, false, (byte) 63);
	}
    }
    
    static final void setMouseOverEvent/*method10537*/(InterfaceComponent component, 
    		InterfaceDefinition iFace, ClientScriptData scriptData, byte i) {
		String params = (String) 
				scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331];
		if (Class8.extractVarWatchKeys(params, scriptData, (byte) -19) != null) {
			params = params.substring(0, params.length() - 1);
		}
		component.onMouseOverScript
		    = Class299.extractCs2Params(params, scriptData, -1059837716);
		component.hasClientScript = true;
    }
}
