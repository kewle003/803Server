/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class462
{
    static char[] shiftCharacters/*aCharArray6283*/ = 
    	{ '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
	    '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0',
	    '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d',
	    '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
	    '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
    public static int anInt6284;
    
    public static boolean method10644(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if ('\0' != c) {
	    char[] cs = shiftCharacters;
	    for (int i = 0; i < cs.length; i++) {
		char c_0_ = cs[i];
		if (c == c_0_)
		    return true;
	    }
	}
	return false;
    }
    
    Class462() throws Throwable {
	throw new Error();
    }
    
    public static boolean method10645(byte i) {
	int i_1_ = i & 0xff;
	if (i_1_ == 0)
	    return false;
	if (i_1_ >= 128 && i_1_ < 160 && shiftCharacters[i_1_ - 128] == 0)
	    return false;
	return true;
    }
    
    public static String method10646(byte[] is) {
	return Class95.getMessageFromBytes(is, 0, is.length, -949072930);
    }
    
    public static char method10647(byte i) {
	int i_2_ = i & 0xff;
	if (i_2_ == 0)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (Integer.toString(i_2_, 16))
						   .toString());
	if (i_2_ >= 128 && i_2_ < 160) {
	    int i_3_ = shiftCharacters[i_2_ - 128];
	    if (0 == i_3_)
		i_3_ = 63;
	    i_2_ = i_3_;
	}
	return (char) i_2_;
    }
    
    public static byte[] method10648(CharSequence charsequence) {
	int i = charsequence.length();
	byte[] is = new byte[i];
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    char c = charsequence.charAt(i_4_);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_4_] = (byte) c;
	    else if (c == '\u20ac')
		is[i_4_] = (byte) -128;
	    else if ('\u201a' == c)
		is[i_4_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_4_] = (byte) -125;
	    else if (c == '\u201e')
		is[i_4_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_4_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_4_] = (byte) -122;
	    else if (c == '\u2021')
		is[i_4_] = (byte) -121;
	    else if (c == '\u02c6')
		is[i_4_] = (byte) -120;
	    else if (c == '\u2030')
		is[i_4_] = (byte) -119;
	    else if ('\u0160' == c)
		is[i_4_] = (byte) -118;
	    else if ('\u2039' == c)
		is[i_4_] = (byte) -117;
	    else if (c == '\u0152')
		is[i_4_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_4_] = (byte) -114;
	    else if (c == '\u2018')
		is[i_4_] = (byte) -111;
	    else if (c == '\u2019')
		is[i_4_] = (byte) -110;
	    else if (c == '\u201c')
		is[i_4_] = (byte) -109;
	    else if (c == '\u201d')
		is[i_4_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_4_] = (byte) -107;
	    else if (c == '\u2013')
		is[i_4_] = (byte) -106;
	    else if (c == '\u2014')
		is[i_4_] = (byte) -105;
	    else if ('\u02dc' == c)
		is[i_4_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_4_] = (byte) -103;
	    else if (c == '\u0161')
		is[i_4_] = (byte) -102;
	    else if (c == '\u203a')
		is[i_4_] = (byte) -101;
	    else if (c == '\u0153')
		is[i_4_] = (byte) -100;
	    else if (c == '\u017e')
		is[i_4_] = (byte) -98;
	    else if ('\u0178' == c)
		is[i_4_] = (byte) -97;
	    else
		is[i_4_] = (byte) 63;
	}
	return is;
    }
    
    public static int method10649(CharSequence charsequence, int i, int i_5_,
				  byte[] is, int i_6_) {
	int i_7_ = i_5_ - i;
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    char c = charsequence.charAt(i_8_ + i);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_6_ + i_8_] = (byte) c;
	    else if ('\u20ac' == c)
		is[i_8_ + i_6_] = (byte) -128;
	    else if (c == '\u201a')
		is[i_6_ + i_8_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_8_ + i_6_] = (byte) -125;
	    else if ('\u201e' == c)
		is[i_8_ + i_6_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_6_ + i_8_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_6_ + i_8_] = (byte) -122;
	    else if (c == '\u2021')
		is[i_8_ + i_6_] = (byte) -121;
	    else if ('\u02c6' == c)
		is[i_8_ + i_6_] = (byte) -120;
	    else if (c == '\u2030')
		is[i_8_ + i_6_] = (byte) -119;
	    else if (c == '\u0160')
		is[i_8_ + i_6_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_6_ + i_8_] = (byte) -117;
	    else if ('\u0152' == c)
		is[i_6_ + i_8_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_8_ + i_6_] = (byte) -114;
	    else if ('\u2018' == c)
		is[i_6_ + i_8_] = (byte) -111;
	    else if (c == '\u2019')
		is[i_8_ + i_6_] = (byte) -110;
	    else if ('\u201c' == c)
		is[i_6_ + i_8_] = (byte) -109;
	    else if ('\u201d' == c)
		is[i_8_ + i_6_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_6_ + i_8_] = (byte) -107;
	    else if (c == '\u2013')
		is[i_8_ + i_6_] = (byte) -106;
	    else if ('\u2014' == c)
		is[i_6_ + i_8_] = (byte) -105;
	    else if ('\u02dc' == c)
		is[i_6_ + i_8_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_8_ + i_6_] = (byte) -103;
	    else if (c == '\u0161')
		is[i_8_ + i_6_] = (byte) -102;
	    else if ('\u203a' == c)
		is[i_8_ + i_6_] = (byte) -101;
	    else if (c == '\u0153')
		is[i_8_ + i_6_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_6_ + i_8_] = (byte) -98;
	    else if (c == '\u0178')
		is[i_8_ + i_6_] = (byte) -97;
	    else
		is[i_8_ + i_6_] = (byte) 63;
	}
	return i_7_;
    }
    
    public static int method10650(CharSequence charsequence, int i, int i_9_,
				  byte[] is, int i_10_) {
	int i_11_ = i_9_ - i;
	for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
	    char c = charsequence.charAt(i_12_ + i);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_10_ + i_12_] = (byte) c;
	    else if ('\u20ac' == c)
		is[i_12_ + i_10_] = (byte) -128;
	    else if (c == '\u201a')
		is[i_10_ + i_12_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_12_ + i_10_] = (byte) -125;
	    else if ('\u201e' == c)
		is[i_12_ + i_10_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_10_ + i_12_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_10_ + i_12_] = (byte) -122;
	    else if (c == '\u2021')
		is[i_12_ + i_10_] = (byte) -121;
	    else if ('\u02c6' == c)
		is[i_12_ + i_10_] = (byte) -120;
	    else if (c == '\u2030')
		is[i_12_ + i_10_] = (byte) -119;
	    else if (c == '\u0160')
		is[i_12_ + i_10_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_10_ + i_12_] = (byte) -117;
	    else if ('\u0152' == c)
		is[i_10_ + i_12_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_12_ + i_10_] = (byte) -114;
	    else if ('\u2018' == c)
		is[i_10_ + i_12_] = (byte) -111;
	    else if (c == '\u2019')
		is[i_12_ + i_10_] = (byte) -110;
	    else if ('\u201c' == c)
		is[i_10_ + i_12_] = (byte) -109;
	    else if ('\u201d' == c)
		is[i_12_ + i_10_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_10_ + i_12_] = (byte) -107;
	    else if (c == '\u2013')
		is[i_12_ + i_10_] = (byte) -106;
	    else if ('\u2014' == c)
		is[i_10_ + i_12_] = (byte) -105;
	    else if ('\u02dc' == c)
		is[i_10_ + i_12_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_12_ + i_10_] = (byte) -103;
	    else if (c == '\u0161')
		is[i_12_ + i_10_] = (byte) -102;
	    else if ('\u203a' == c)
		is[i_12_ + i_10_] = (byte) -101;
	    else if (c == '\u0153')
		is[i_12_ + i_10_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_10_ + i_12_] = (byte) -98;
	    else if (c == '\u0178')
		is[i_12_ + i_10_] = (byte) -97;
	    else
		is[i_12_ + i_10_] = (byte) 63;
	}
	return i_11_;
    }
    
    public static int method10651(CharSequence charsequence, int i, int i_13_,
				  byte[] is, int i_14_) {
	int i_15_ = i_13_ - i;
	for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
	    char c = charsequence.charAt(i_16_ + i);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_14_ + i_16_] = (byte) c;
	    else if ('\u20ac' == c)
		is[i_16_ + i_14_] = (byte) -128;
	    else if (c == '\u201a')
		is[i_14_ + i_16_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_16_ + i_14_] = (byte) -125;
	    else if ('\u201e' == c)
		is[i_16_ + i_14_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_14_ + i_16_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_14_ + i_16_] = (byte) -122;
	    else if (c == '\u2021')
		is[i_16_ + i_14_] = (byte) -121;
	    else if ('\u02c6' == c)
		is[i_16_ + i_14_] = (byte) -120;
	    else if (c == '\u2030')
		is[i_16_ + i_14_] = (byte) -119;
	    else if (c == '\u0160')
		is[i_16_ + i_14_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_14_ + i_16_] = (byte) -117;
	    else if ('\u0152' == c)
		is[i_14_ + i_16_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_16_ + i_14_] = (byte) -114;
	    else if ('\u2018' == c)
		is[i_14_ + i_16_] = (byte) -111;
	    else if (c == '\u2019')
		is[i_16_ + i_14_] = (byte) -110;
	    else if ('\u201c' == c)
		is[i_14_ + i_16_] = (byte) -109;
	    else if ('\u201d' == c)
		is[i_16_ + i_14_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_14_ + i_16_] = (byte) -107;
	    else if (c == '\u2013')
		is[i_16_ + i_14_] = (byte) -106;
	    else if ('\u2014' == c)
		is[i_14_ + i_16_] = (byte) -105;
	    else if ('\u02dc' == c)
		is[i_14_ + i_16_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_16_ + i_14_] = (byte) -103;
	    else if (c == '\u0161')
		is[i_16_ + i_14_] = (byte) -102;
	    else if ('\u203a' == c)
		is[i_16_ + i_14_] = (byte) -101;
	    else if (c == '\u0153')
		is[i_16_ + i_14_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_14_ + i_16_] = (byte) -98;
	    else if (c == '\u0178')
		is[i_16_ + i_14_] = (byte) -97;
	    else
		is[i_16_ + i_14_] = (byte) 63;
	}
	return i_15_;
    }
    
    public static int method10652(CharSequence charsequence, int i, int i_17_,
				  byte[] is, int i_18_) {
	int i_19_ = i_17_ - i;
	for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
	    char c = charsequence.charAt(i_20_ + i);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_18_ + i_20_] = (byte) c;
	    else if ('\u20ac' == c)
		is[i_20_ + i_18_] = (byte) -128;
	    else if (c == '\u201a')
		is[i_18_ + i_20_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_20_ + i_18_] = (byte) -125;
	    else if ('\u201e' == c)
		is[i_20_ + i_18_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_18_ + i_20_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_18_ + i_20_] = (byte) -122;
	    else if (c == '\u2021')
		is[i_20_ + i_18_] = (byte) -121;
	    else if ('\u02c6' == c)
		is[i_20_ + i_18_] = (byte) -120;
	    else if (c == '\u2030')
		is[i_20_ + i_18_] = (byte) -119;
	    else if (c == '\u0160')
		is[i_20_ + i_18_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_18_ + i_20_] = (byte) -117;
	    else if ('\u0152' == c)
		is[i_18_ + i_20_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_20_ + i_18_] = (byte) -114;
	    else if ('\u2018' == c)
		is[i_18_ + i_20_] = (byte) -111;
	    else if (c == '\u2019')
		is[i_20_ + i_18_] = (byte) -110;
	    else if ('\u201c' == c)
		is[i_18_ + i_20_] = (byte) -109;
	    else if ('\u201d' == c)
		is[i_20_ + i_18_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_18_ + i_20_] = (byte) -107;
	    else if (c == '\u2013')
		is[i_20_ + i_18_] = (byte) -106;
	    else if ('\u2014' == c)
		is[i_18_ + i_20_] = (byte) -105;
	    else if ('\u02dc' == c)
		is[i_18_ + i_20_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_20_ + i_18_] = (byte) -103;
	    else if (c == '\u0161')
		is[i_20_ + i_18_] = (byte) -102;
	    else if ('\u203a' == c)
		is[i_20_ + i_18_] = (byte) -101;
	    else if (c == '\u0153')
		is[i_20_ + i_18_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_18_ + i_20_] = (byte) -98;
	    else if (c == '\u0178')
		is[i_20_ + i_18_] = (byte) -97;
	    else
		is[i_20_ + i_18_] = (byte) 63;
	}
	return i_19_;
    }
    
    public static String method10653(byte[] is) {
	return Class95.getMessageFromBytes(is, 0, is.length, -949072930);
    }
    
    public static String method10654(byte[] is) {
	return Class95.getMessageFromBytes(is, 0, is.length, -949072930);
    }
    
    public static String method10655(byte[] is) {
	return Class95.getMessageFromBytes(is, 0, is.length, -949072930);
    }
    
    public static char method10656(byte i) {
	int i_21_ = i & 0xff;
	if (i_21_ == 0)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (Integer.toString(i_21_,
								     16))
						   .toString());
	if (i_21_ >= 128 && i_21_ < 160) {
	    int i_22_ = shiftCharacters[i_21_ - 128];
	    if (0 == i_22_)
		i_22_ = 63;
	    i_21_ = i_22_;
	}
	return (char) i_21_;
    }
    
    public static String method10657(byte[] is) {
	return Class95.getMessageFromBytes(is, 0, is.length, -949072930);
    }
    
    public static void method10658(int i, int i_23_, int i_24_, int i_25_,
				   int i_26_, int i_27_, int i_28_, int i_29_,
				   int i_30_) {
	if (i_23_ >= 0 && i_24_ >= 0
	    && i_23_ < client.aClass238_8477.method4744(-1971322961) - 1
	    && i_24_ < client.aClass238_8477.method4745(1867269987) - 1) {
	    if (client.aClass238_8477.method4751(-1788719751) != null) {
		if (i_25_ == 0) {
		    Interface24 interface24
			= ((Interface24)
			   client.aClass238_8477.method4751(-1337598589)
			       .method12132(i, i_23_, i_24_, (byte) 7));
		    Interface24 interface24_31_
			= ((Interface24)
			   client.aClass238_8477.method4751(-1325664006)
			       .method12133(i, i_23_, i_24_, (byte) -79));
		    if (null != interface24 && 2 != i_26_) {
			if (interface24 instanceof Class475_Sub1_Sub3_Sub1)
			    ((Class475_Sub1_Sub3_Sub1) interface24)
				.aClass248_11299
				.method4969(i_28_, i_29_, -2041185737);
			else
			    Class519.method11673(i, i_25_, i_23_, i_24_,
						 interface24
						     .method146((byte) 0),
						 i_27_, i_26_, i_28_, i_29_,
						 -2143572392);
		    }
		    if (interface24_31_ != null) {
			if (interface24_31_ instanceof Class475_Sub1_Sub3_Sub1)
			    ((Class475_Sub1_Sub3_Sub1) interface24_31_)
				.aClass248_11299
				.method4969(i_28_, i_29_, -2041185737);
			else
			    Class519.method11673(i, i_25_, i_23_, i_24_,
						 interface24_31_
						     .method146((byte) 0),
						 i_27_, i_26_, i_28_, i_29_,
						 -1192838019);
		    }
		} else if (1 == i_25_) {
		    Interface24 interface24
			= ((Interface24)
			   client.aClass238_8477.method4751(-2123775744)
			       .method12162(i, i_23_, i_24_, -286024853));
		    if (interface24 != null) {
			if (interface24 instanceof Class475_Sub1_Sub5_Sub1)
			    ((Class475_Sub1_Sub5_Sub1) interface24)
				.aClass248_11314
				.method4969(i_28_, i_29_, -2041185737);
			else {
			    int i_32_ = interface24.method146((byte) 0);
			    if (i_26_ == 4 || 5 == i_26_)
				Class519.method11673(i, i_25_, i_23_, i_24_,
						     i_32_, i_27_, 4, i_28_,
						     i_29_, -1500357330);
			    else if (i_26_ == 6)
				Class519.method11673(i, i_25_, i_23_, i_24_,
						     i_32_, 4 + i_27_, 4,
						     i_28_, i_29_, -833527017);
			    else if (7 == i_26_)
				Class519.method11673(i, i_25_, i_23_, i_24_,
						     i_32_,
						     (2 + i_27_ & 0x3) + 4, 4,
						     i_28_, i_29_,
						     -2067564087);
			    else if (8 == i_26_) {
				Class519.method11673(i, i_25_, i_23_, i_24_,
						     i_32_, 4 + i_27_, 4,
						     i_28_, i_29_,
						     -1078917994);
				Class519.method11673(i, i_25_, i_23_, i_24_,
						     i_32_,
						     (i_27_ + 2 & 0x3) + 4, 4,
						     i_28_, i_29_,
						     -2068461183);
			    }
			}
		    }
		} else if (2 == i_25_) {
		    Interface24 interface24
			= ((Interface24)
			   (client.aClass238_8477.method4751(-1798910950)
				.method12136
			    (i, i_23_, i_24_, client.anInterface57_8577,
			     657330695)));
		    if (null != interface24) {
			if (11 == i_26_)
			    i_26_ = 10;
			if (interface24 instanceof Class475_Sub1_Sub1_Sub2)
			    ((Class475_Sub1_Sub1_Sub2) interface24)
				.aClass248_11371
				.method4969(i_28_, i_29_, -2041185737);
			else
			    Class519.method11673(i, i_25_, i_23_, i_24_,
						 interface24
						     .method146((byte) 0),
						 i_27_, i_26_, i_28_, i_29_,
						 -1880278757);
		    }
		} else if (3 == i_25_) {
		    Interface24 interface24
			= ((Interface24)
			   client.aClass238_8477.method4751(-1335628288)
			       .method12100(i, i_23_, i_24_, 2132844314));
		    if (interface24 != null) {
			if (interface24 instanceof Class475_Sub1_Sub4_Sub2)
			    ((Class475_Sub1_Sub4_Sub2) interface24)
				.aClass248_11366
				.method4969(i_28_, i_29_, -2041185737);
			else
			    Class519.method11673(i, i_25_, i_23_, i_24_,
						 interface24
						     .method146((byte) 0),
						 i_27_, i_26_, i_28_, i_29_,
						 209827894);
		    }
		}
	    }
	}
    }
    
    static void processItemOnItem/*method10659*/(InterfaceComponent component, byte i) {
		if (client.aBool8544) {
		    if (component.onItemSwapScript != null) {
				InterfaceComponent component2 = Class218_Sub3.method16576(
						(-1349195347 * RSGraphics.prevComponentHash),
						1196348233 * client.prevComponentSlot1, (byte) -64);
				if (component2 != null) {
				    ClientScriptCaller caller = new ClientScriptCaller();
				    caller.component = component;
				    caller.prevComponent = component2;
				    caller.paramaters = component.onItemSwapScript;
				    Class42.method1067(caller, 1403677413);
				}
		    }
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.ITEM_ON_ITEM_PACKET,
		    		client.aClass190_8340.packetCipher, 16711935);
		    packet.data.writeLEShortA(client.prevComponentSlot2 * 2122695965, (byte) 15);
		    packet.data.writeLEInt(-1349195347 * RSGraphics.prevComponentHash, -1206000724);
		    packet.data.writeIntV1(445907013 * component.componentHash, (byte) 0);
		    packet.data.writeLEShort(1196348233 * client.prevComponentSlot1, 1605379531);
		    packet.data.writeLEShort(-389932081 * component.slot1, -1712209295);
		    packet.data.writeShortA(877329925 * component.slot2, -382816014);
		    client.aClass190_8340.sendPacket(packet, -1946479769);
		}
    }
    
    static final void method10660(ClientScriptData class454, int i) {
	int i_34_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_34_, (byte) -90);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_34_ >> 16];
	Class162.method3518(class58, class35, class454, 925885771);
    }
}
