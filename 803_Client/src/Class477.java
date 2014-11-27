/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class477
{
    public int anInt6401;
    
    public Class477(int i) {
	anInt6401 = i * 1036614483;
    }
    
    static final void method10917(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893
		  .method14197((byte) -69);
    }
    
    public static int method10918(CharSequence charsequence, int i, int i_0_,
				  byte[] is, int i_1_, int i_2_) {
	int i_3_ = i_0_ - i;
	for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
	    char c = charsequence.charAt(i_4_ + i);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_1_ + i_4_] = (byte) c;
	    else if ('\u20ac' == c)
		is[i_4_ + i_1_] = (byte) -128;
	    else if (c == '\u201a')
		is[i_1_ + i_4_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_4_ + i_1_] = (byte) -125;
	    else if ('\u201e' == c)
		is[i_4_ + i_1_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_1_ + i_4_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_1_ + i_4_] = (byte) -122;
	    else if (c == '\u2021')
		is[i_4_ + i_1_] = (byte) -121;
	    else if ('\u02c6' == c)
		is[i_4_ + i_1_] = (byte) -120;
	    else if (c == '\u2030')
		is[i_4_ + i_1_] = (byte) -119;
	    else if (c == '\u0160')
		is[i_4_ + i_1_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_1_ + i_4_] = (byte) -117;
	    else if ('\u0152' == c)
		is[i_1_ + i_4_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_4_ + i_1_] = (byte) -114;
	    else if ('\u2018' == c)
		is[i_1_ + i_4_] = (byte) -111;
	    else if (c == '\u2019')
		is[i_4_ + i_1_] = (byte) -110;
	    else if ('\u201c' == c)
		is[i_1_ + i_4_] = (byte) -109;
	    else if ('\u201d' == c)
		is[i_4_ + i_1_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_1_ + i_4_] = (byte) -107;
	    else if (c == '\u2013')
		is[i_4_ + i_1_] = (byte) -106;
	    else if ('\u2014' == c)
		is[i_1_ + i_4_] = (byte) -105;
	    else if ('\u02dc' == c)
		is[i_1_ + i_4_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_4_ + i_1_] = (byte) -103;
	    else if (c == '\u0161')
		is[i_4_ + i_1_] = (byte) -102;
	    else if ('\u203a' == c)
		is[i_4_ + i_1_] = (byte) -101;
	    else if (c == '\u0153')
		is[i_4_ + i_1_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_1_ + i_4_] = (byte) -98;
	    else if (c == '\u0178')
		is[i_4_ + i_1_] = (byte) -97;
	    else
		is[i_4_ + i_1_] = (byte) 63;
	}
	return i_3_;
    }
    
    public static RS3File openPrefs/*method10919*/(String filename, String game, boolean bool, byte i) {
		File file = new File(Class116.cacheDirectory,
				     new StringBuilder().append("preferences").append(filename).append
					 (".dat").toString());
		do {
		    if (file.exists()) {
			RS3File class408;
			try {
			    RS3File class408_6_ = new RS3File(file, "rw", 10000L);
			    class408 = class408_6_;
			} catch (IOException ioexception) {
			    break;
			}
			return class408;
		    }
		} while (false);
		String string_7_ = "";
		if (Class360.historicCacheId * 1547576273 == 33)
		    string_7_ = "_rc";
		else if (34 == Class360.historicCacheId * 1547576273)
		    string_7_ = "_wip";
		File file_8_ = new File(Class6.homeDir,
					new StringBuilder().append("jagex_").append
					    (game).append
					    ("_preferences").append
					    (filename).append
					    (string_7_).append
					    (".dat").toString());
		do {
		    if (!bool && file_8_.exists()) {
			RS3File class408;
			try {
			    RS3File class408_9_ = new RS3File(file_8_, "rw", 10000L);
			    class408 = class408_9_;
			} catch (IOException ioexception) {
			    break;
			}
			return class408;
		    }
		} while (false);
		RS3File class408;
		try {
		    RS3File class408_10_ = new RS3File(file, "rw", 10000L);
		    class408 = class408_10_;
		} catch (IOException ioexception) {
		    throw new RuntimeException();
		}
		return class408;
    }
    
    public static Class89 method10920
	(Class103 class103, int i, int i_11_, int i_12_, int i_13_, int i_14_,
	 Class89 class89, int i_15_, int i_16_, int i_17_, int i_18_,
	 Class409 class409, int i_19_) {
	if (class89 == null)
	    return null;
	int i_20_ = 2055;
	if (class409 != null) {
	    i_20_ |= class409.method7356(102307787);
	    i_20_ &= ~0x200;
	}
	long l = (((long) i_16_ << 48)
		  + (((long) i_15_ << 32)
		     + (long) (i_14_ + (i_17_ << 16) + (i_18_ << 24))));
	Class89 class89_21_;
	synchronized (Class24.aClass129_210) {
	    class89_21_ = (Class89) Class24.aClass129_210.get(l);
	}
	if (class89_21_ == null
	    || class103.method2301(class89_21_.method1866(), i_20_) != 0) {
	    if (class89_21_ != null)
		i_20_ = class103.method2302(i_20_, class89_21_.method1866());
	    int i_22_;
	    if (1 == i_14_)
		i_22_ = 9;
	    else if (i_14_ == 2)
		i_22_ = 12;
	    else if (i_14_ == 3)
		i_22_ = 15;
	    else if (i_14_ == 4)
		i_22_ = 18;
	    else
		i_22_ = 21;
	    int i_23_ = 3;
	    int[] is = { 64, 96, 128 };
	    Class161 class161 = new Class161(1 + i_23_ * i_22_,
					     2 * (i_22_ * i_23_) - i_22_, 0);
	    int i_24_ = class161.method3451(0, 0, 0);
	    int[][] is_25_ = new int[i_23_][i_22_];
	    for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
		int i_27_ = is[i_26_];
		int i_28_ = is[i_26_];
		for (int i_29_ = 0; i_29_ < i_22_; i_29_++) {
		    int i_30_ = (i_29_ << 14) / i_22_;
		    int i_31_ = Class282.anIntArray4430[i_30_] * i_27_ >> 14;
		    int i_32_ = i_28_ * Class282.anIntArray4441[i_30_] >> 14;
		    is_25_[i_26_][i_29_]
			= class161.method3451(i_31_, 0, i_32_);
		}
	    }
	    for (int i_33_ = 0; i_33_ < i_23_; i_33_++) {
		int i_34_ = (i_33_ * 256 + 128) / i_23_;
		int i_35_ = 256 - i_34_;
		byte i_36_ = (byte) (i_17_ * i_35_ + i_34_ * i_18_ >> 8);
		short i_37_
		    = (short) (((i_34_ * (i_16_ & 0x7f) + i_35_ * (i_15_
								   & 0x7f)
				 & 0x7f00)
				+ ((i_34_ * (i_16_ & 0x380) + i_35_ * (i_15_
								       & 0x380)
				    & 0x38000)
				   + (((i_16_ & 0xfc00) * i_34_
				       + i_35_ * (i_15_ & 0xfc00))
				      & 0xfc0000)))
			       >> 8);
		for (int i_38_ = 0; i_38_ < i_22_; i_38_++) {
		    if (0 == i_33_)
			class161.method3452(i_24_,
					    is_25_[0][(1 + i_38_) % i_22_],
					    is_25_[0][i_38_], (byte) 1,
					    (byte) -1, i_37_, i_36_,
					    (short) -1);
		    else {
			class161.method3452(is_25_[i_33_ - 1][i_38_],
					    (is_25_[i_33_ - 1]
					     [(i_38_ + 1) % i_22_]),
					    is_25_[i_33_][(i_38_ + 1) % i_22_],
					    (byte) 1, (byte) -1, i_37_, i_36_,
					    (short) -1);
			class161.method3452(is_25_[i_33_ - 1][i_38_],
					    is_25_[i_33_][(1 + i_38_) % i_22_],
					    is_25_[i_33_][i_38_], (byte) 1,
					    (byte) -1, i_37_, i_36_,
					    (short) -1);
		    }
		}
	    }
	    class89_21_
		= class103.method2356(class161, i_20_,
				      610682175 * Class24.anInt209, 64, 768);
	    synchronized (Class24.aClass129_210) {
		Class24.aClass129_210.put(class89_21_, l);
	    }
	}
	int i_39_ = class89.method1895();
	int i_40_ = class89.method1906();
	int i_41_ = class89.method1899();
	int i_42_ = class89.method1996();
	if (class409 != null) {
	    class89_21_ = class89_21_.method2019((byte) 3, i_20_, true);
	    class89_21_.method1863(i_40_ - i_39_ >> 1, 128,
				   i_42_ - i_41_ >> 1);
	    class89_21_.method1927(i_39_ + i_40_ >> 1, 0, i_41_ + i_42_ >> 1);
	    class409.method7398(class89_21_, (byte) -39);
	} else {
	    class89_21_ = class89_21_.method2019((byte) 3, i_20_, true);
	    class89_21_.method1863(i_40_ - i_39_ >> 1, 128,
				   i_42_ - i_41_ >> 1);
	    class89_21_.method1927(i_40_ + i_39_ >> 1, 0, i_42_ + i_41_ >> 1);
	}
	if (i_11_ != 0)
	    class89_21_.method1870(i_11_);
	if (i_12_ != 0)
	    class89_21_.method1980(i_12_);
	if (0 != i_13_)
	    class89_21_.method1927(0, i_13_, 0);
	return class89_21_;
    }
    
    static final void method10921(ClientScriptData class454, byte i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	Class167.method3600((short) 8303);
	client.aBool8297 = false;
    }
    
    public static Class89 method10922(Class103 class103, int i, int i_43_,
				      int i_44_, int i_45_, int i_46_,
				      int i_47_) {
	long l = (long) i_46_;
	Class89 class89 = (Class89) Class192.aClass129_2295.get(l);
	int i_48_ = 2055;
	if (class89 == null) {
	    Class161 class161
		= Class161.method3448(Class508.MODELS_ARCHIVE, i_46_, 0);
	    if (class161 == null)
		return null;
	    if (class161.anInt1789 < 13)
		class161.method3464(2);
	    class89 = class103.method2356(class161, i_48_,
					  -1880495197 * Class192.anInt2296, 64,
					  768);
	    Class192.aClass129_2295.put(class89, l);
	}
	class89 = class89.method2019((byte) 6, i_48_, true);
	if (0 != i)
	    class89.method1868(i);
	if (0 != i_43_)
	    class89.method1870(i_43_);
	if (0 != i_44_)
	    class89.method1980(i_44_);
	if (0 != i_45_)
	    class89.method1927(0, i_45_, 0);
	return class89;
    }
    
    static final void setVarcompTextFormat/*method10923*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
		InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
		Class119.setComponentTextFormat(class58, class35, scriptData, -1811393838);
    }
    
    static final void method10924(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -63) != null)
	    string = string.substring(0, string.length() - 1);
	class58.onVarClanChangeScript
	    = Class299.extractCs2Params(string, class454, -50438756);
	class58.hasClientScript = true;
    }
    
    static void setComponentObject/*method10925*/(int compHash, int i_49_, int i_50_, int i_51_, short i_52_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(8, (long) compHash);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 = -1741260507 * i_49_;
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951 = i_50_ * 1861259375;
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10935 = i_51_ * -1424982471;
    }
}
