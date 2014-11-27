/* Class639 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class639
{
    static String[] aStringArray8255 = new String[100];
    byte[][] aByteArrayArray8256;
    byte[] aByteArray8257;
    public int anInt8258;
    public int anInt8259;
    public int anInt8260;
    static InterfaceComponent[] aClass58Array8261;
    
    public int method13559(int i, char c) {
	if (((Class639) this).aByteArrayArray8256 != null)
	    return ((Class639) this).aByteArrayArray8256[i][c];
	return 0;
    }
    
    public int method13560(int i, char c, int i_0_) {
	if (((Class639) this).aByteArrayArray8256 != null)
	    return ((Class639) this).aByteArrayArray8256[i][c];
	return 0;
    }
    
    public int method13561(int i, int i_1_) {
	return ((Class639) this).aByteArray8257[i] & 0xff;
    }
    
    public int method13562(String string, byte i) {
	return method13579(string, null, 1190536090);
    }
    
    public int method13563(String string, int i, int i_2_, int i_3_, int i_4_,
			   Interface63[] interface63s, int i_5_) {
	if (0 == i_2_)
	    i_2_ = anInt8259 * 1118868451;
	int i_6_ = method13565(string, new int[] { i }, aStringArray8255,
			       interface63s, (byte) 25);
	if (0 == i_6_)
	    return 0;
	if (i_4_ < 0)
	    i_4_ = 0;
	i_4_ /= i_2_;
	if (i_4_ >= i_6_)
	    i_4_ = i_6_ - 1;
	String string_7_ = aStringArray8255[i_4_];
	int i_8_ = 0;
	int i_9_ = 0;
	int i_10_;
	for (i_10_ = 0; i_10_ < i_3_ && i_8_ < string_7_.length();
	     i_10_ = method13579(string_7_.substring(0, ++i_8_), interface63s,
				 1190536090))
	    i_9_ = i_10_;
	if (i_8_ == string_7_.length() && string_7_.endsWith("<br>"))
	    i_8_ -= 4;
	if (i_3_ - i_9_ < i_10_ - i_3_)
	    i_8_--;
	for (int i_11_ = 0; i_11_ < i_4_; i_11_++)
	    i_8_ += aStringArray8255[i_11_].length();
	return i_8_;
    }
    
    public String method13564(String string, int i, Interface63[] interface63s,
			      int i_12_) {
	if (method13579(string, interface63s, 1190536090) <= i)
	    return string;
	i -= method13579("...", null, 1190536090);
	int i_13_ = -1;
	int i_14_ = -1;
	int i_15_ = 0;
	int i_16_ = string.length();
	String string_17_ = "";
	for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
	    char c = string.charAt(i_18_);
	    if (60 == c)
		i_13_ = i_18_;
	    else {
		if (62 == c && -1 != i_13_) {
		    String string_19_ = string.substring(i_13_ + 1, i_18_);
		    i_13_ = -1;
		    if (string_19_.equals("lt"))
			c = '<';
		    else if (string_19_.equals("gt"))
			c = '>';
		    else if (string_19_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_19_.equals("shy"))
			c = '\u00ad';
		    else if (string_19_.equals("times"))
			c = '\u00d7';
		    else if (string_19_.equals("euro"))
			c = '\u20ac';
		    else if (string_19_.equals("copy"))
			c = '\u00a9';
		    else if (string_19_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_19_.startsWith("img=")
			    && null != interface63s) {
			    try {
				int i_20_
				    = Class324.method5975(string_19_
							      .substring(4),
							  -952789660);
				i_15_ += interface63s[i_20_].method64();
				i_14_ = -1;
				if (i_15_ > i)
				    return new StringBuilder().append
					       (string_17_).append
					       ("...").toString();
				string_17_ = string.substring(0, i_18_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i_13_ == -1) {
		    i_15_
			+= (((Class639) this).aByteArray8257
			    [Class76.method1773(c, 769562710) & 0xff]) & 0xff;
		    if (null != ((Class639) this).aByteArrayArray8256
			&& -1 != i_14_)
			i_15_
			    += ((Class639) this).aByteArrayArray8256[i_14_][c];
		    i_14_ = c;
		    int i_21_ = i_15_;
		    if (((Class639) this).aByteArrayArray8256 != null)
			i_21_ += ((Class639) this).aByteArrayArray8256[c][46];
		    if (i_21_ > i)
			return new StringBuilder().append(string_17_).append
				   ("...").toString();
		    string_17_ = string.substring(0, 1 + i_18_);
		}
	    }
	}
	return string;
    }
    
    public int method13565(String string, int[] is, String[] strings,
			   Interface63[] interface63s, byte i) {
	return method13566(string, is, strings, interface63s, true,
			   -1008474306);
    }
    
    int method13566(String string, int[] is, String[] strings,
		    Interface63[] interface63s, boolean bool, int i) {
	if (string == null)
	    return 0;
	int i_22_ = 0;
	int i_23_ = 0;
	int i_24_ = -1;
	int i_25_ = 0;
	int i_26_ = 0;
	int i_27_ = -1;
	int i_28_ = -1;
	int i_29_ = 0;
	int i_30_ = string.length();
	for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
	    int i_32_
		= Class76.method1773(string.charAt(i_31_), 473167673) & 0xff;
	    int i_33_ = 0;
	    if (60 == i_32_)
		i_27_ = i_31_;
	    else {
		int i_34_;
		if (-1 != i_27_) {
		    if (i_32_ != 62)
			continue;
		    i_34_ = i_27_;
		    String string_35_ = string.substring(1 + i_27_, i_31_);
		    i_27_ = -1;
		    if (string_35_.equals("br")) {
			strings[i_29_] = string.substring(i_23_, i_31_ + 1);
			if (++i_29_ >= strings.length)
			    return 0;
			i_23_ = i_31_ + 1;
			i_22_ = 0;
			i_24_ = -1;
			i_28_ = -1;
			continue;
		    }
		    if (string_35_.equals("lt")) {
			i_33_ += method13561(60, 1341791968);
			if (((Class639) this).aByteArrayArray8256 != null
			    && -1 != i_28_)
			    i_33_ += (((Class639) this).aByteArrayArray8256
				      [i_28_][60]);
			i_28_ = 60;
		    } else if (string_35_.equals("gt")) {
			i_33_ += method13561(62, 1399957106);
			if (((Class639) this).aByteArrayArray8256 != null
			    && i_28_ != -1)
			    i_33_ += (((Class639) this).aByteArrayArray8256
				      [i_28_][62]);
			i_28_ = 62;
		    } else if (string_35_.equals("nbsp")) {
			i_33_ += method13561(160, 1697259545);
			if (null != ((Class639) this).aByteArrayArray8256
			    && -1 != i_28_)
			    i_33_ += (((Class639) this).aByteArrayArray8256
				      [i_28_][160]);
			i_28_ = 160;
		    } else if (string_35_.equals("shy")) {
			i_33_ += method13561(173, 1426406905);
			if (((Class639) this).aByteArrayArray8256 != null
			    && -1 != i_28_)
			    i_33_ += (((Class639) this).aByteArrayArray8256
				      [i_28_][173]);
			i_28_ = 173;
		    } else if (string_35_.equals("times")) {
			i_33_ += method13561(215, 1522522343);
			if (null != ((Class639) this).aByteArrayArray8256
			    && i_28_ != -1)
			    i_33_ += (((Class639) this).aByteArrayArray8256
				      [i_28_][215]);
			i_28_ = 215;
		    } else if (string_35_.equals("euro")) {
			i_33_ += method13561(8364, 1968775547);
			if (null != ((Class639) this).aByteArrayArray8256
			    && -1 != i_28_)
			    i_33_ += (((Class639) this).aByteArrayArray8256
				      [i_28_][8364]);
			i_28_ = 8364;
		    } else if (string_35_.equals("copy")) {
			i_33_ += method13561(169, 1117415552);
			if (((Class639) this).aByteArrayArray8256 != null
			    && i_28_ != -1)
			    i_33_ += (((Class639) this).aByteArrayArray8256
				      [i_28_][169]);
			i_28_ = 169;
		    } else if (string_35_.equals("reg")) {
			i_33_ += method13561(174, 1253562139);
			if (null != ((Class639) this).aByteArrayArray8256
			    && i_28_ != -1)
			    i_33_ += (((Class639) this).aByteArrayArray8256
				      [i_28_][174]);
			i_28_ = 174;
		    } else if (string_35_.startsWith("img=")
			       && null != interface63s) {
			try {
			    int i_36_
				= Class324.method5975(string_35_.substring(4),
						      -952789660);
			    i_33_ += interface63s[i_36_].method64();
			    i_28_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		    i_32_ = -1;
		} else {
		    i_34_ = i_31_;
		    i_33_ += method13561(i_32_, 1148926215);
		    if (((Class639) this).aByteArrayArray8256 != null
			&& -1 != i_28_)
			i_33_ += (((Class639) this).aByteArrayArray8256[i_28_]
				  [i_32_]);
		    i_28_ = i_32_;
		}
		if (i_33_ > 0) {
		    i_22_ += i_33_;
		    if (is != null) {
			if (32 == i_32_) {
			    i_24_ = i_31_;
			    i_25_ = i_22_;
			    i_26_ = bool ? 1 : 0;
			}
			if (i_22_
			    > is[i_29_ < is.length ? i_29_ : is.length - 1]) {
			    if (i_24_ >= 0) {
				strings[i_29_]
				    = string.substring(i_23_,
						       1 + i_24_ - i_26_);
				if (++i_29_ >= strings.length)
				    return 0;
				i_23_ = 1 + i_24_;
				i_24_ = -1;
				i_22_ -= i_25_;
				i_28_ = -1;
			    } else {
				strings[i_29_]
				    = string.substring(i_23_, i_34_);
				if (++i_29_ >= strings.length)
				    return 0;
				i_23_ = i_34_;
				i_24_ = -1;
				i_22_ = i_33_;
				i_28_ = -1;
			    }
			}
			if (i_32_ == 45) {
			    i_24_ = i_31_;
			    i_25_ = i_22_;
			    i_26_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_23_) {
	    strings[i_29_] = string.substring(i_23_, string.length());
	    i_29_++;
	}
	return i_29_;
    }
    
    public int method13567(String string, int i, Interface63[] interface63s,
			   int i_37_) {
	int i_38_ = method13565(string, new int[] { i }, aStringArray8255,
				interface63s, (byte) 25);
	int i_39_ = 0;
	for (int i_40_ = 0; i_40_ < i_38_; i_40_++) {
	    int i_41_ = method13579(aStringArray8255[i_40_], interface63s,
				    1190536090);
	    if (i_41_ > i_39_)
		i_39_ = i_41_;
	}
	return i_39_;
    }
    
    public int method13568(String string, int i, Interface63[] interface63s,
			   int i_42_) {
	return method13565(string, new int[] { i }, aStringArray8255,
			   interface63s, (byte) 25);
    }
    
    public int method13569(String string, int i, Interface63[] interface63s) {
	int i_43_ = method13565(string, new int[] { i }, aStringArray8255,
				interface63s, (byte) 25);
	int i_44_ = 0;
	for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
	    int i_46_ = method13579(aStringArray8255[i_45_], interface63s,
				    1190536090);
	    if (i_46_ > i_44_)
		i_44_ = i_46_;
	}
	return i_44_;
    }
    
    static int method13570(byte[][] is, byte[][] is_47_, int[] is_48_,
			   byte[] is_49_, int[] is_50_, int i, int i_51_) {
	int i_52_ = is_48_[i];
	int i_53_ = is_50_[i] + i_52_;
	int i_54_ = is_48_[i_51_];
	int i_55_ = i_54_ + is_50_[i_51_];
	int i_56_ = i_52_;
	if (i_54_ > i_52_)
	    i_56_ = i_54_;
	int i_57_ = i_53_;
	if (i_55_ < i_53_)
	    i_57_ = i_55_;
	int i_58_ = is_49_[i] & 0xff;
	if ((is_49_[i_51_] & 0xff) < i_58_)
	    i_58_ = is_49_[i_51_] & 0xff;
	byte[] is_59_ = is_47_[i];
	byte[] is_60_ = is[i_51_];
	int i_61_ = i_56_ - i_52_;
	int i_62_ = i_56_ - i_54_;
	for (int i_63_ = i_56_; i_63_ < i_57_; i_63_++) {
	    int i_64_ = is_59_[i_61_++] + is_60_[i_62_++];
	    if (i_64_ < i_58_)
		i_58_ = i_64_;
	}
	return -i_58_;
    }
    
    public int method13571(String string, int i, int i_65_, int i_66_,
			   int i_67_, Interface63[] interface63s) {
	if (0 == i_65_)
	    i_65_ = anInt8259 * 1118868451;
	int i_68_ = method13565(string, new int[] { i }, aStringArray8255,
				interface63s, (byte) 25);
	if (0 == i_68_)
	    return 0;
	if (i_67_ < 0)
	    i_67_ = 0;
	i_67_ /= i_65_;
	if (i_67_ >= i_68_)
	    i_67_ = i_68_ - 1;
	String string_69_ = aStringArray8255[i_67_];
	int i_70_ = 0;
	int i_71_ = 0;
	int i_72_;
	for (i_72_ = 0; i_72_ < i_66_ && i_70_ < string_69_.length();
	     i_72_ = method13579(string_69_.substring(0, ++i_70_),
				 interface63s, 1190536090))
	    i_71_ = i_72_;
	if (i_70_ == string_69_.length() && string_69_.endsWith("<br>"))
	    i_70_ -= 4;
	if (i_66_ - i_71_ < i_72_ - i_66_)
	    i_70_--;
	for (int i_73_ = 0; i_73_ < i_67_; i_73_++)
	    i_70_ += aStringArray8255[i_73_].length();
	return i_70_;
    }
    
    public static Class639 method13572(JS5 class210, int i, int i_74_) {
	byte[] is = class210.getfile(i, i_74_, 508066754);
	if (null == is)
	    return null;
	return new Class639(is);
    }
    
    public static Class639 method13573(JS5 class210, int i) {
	byte[] is = class210.method4194(i, 670550595);
	if (null == is)
	    return null;
	return new Class639(is);
    }
    
    public int method13574(int i, char c) {
	if (((Class639) this).aByteArrayArray8256 != null)
	    return ((Class639) this).aByteArrayArray8256[i][c];
	return 0;
    }
    
    public int method13575(String string, Interface63[] interface63s) {
	if (string == null)
	    return 0;
	int i = -1;
	int i_75_ = -1;
	int i_76_ = 0;
	int i_77_ = string.length();
	for (int i_78_ = 0; i_78_ < i_77_; i_78_++) {
	    char c = string.charAt(i_78_);
	    if (c == 60)
		i = i_78_;
	    else {
		if (c == 62 && i != -1) {
		    String string_79_ = string.substring(1 + i, i_78_);
		    i = -1;
		    if (string_79_.equals("lt"))
			c = '<';
		    else if (string_79_.equals("gt"))
			c = '>';
		    else if (string_79_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_79_.equals("shy"))
			c = '\u00ad';
		    else if (string_79_.equals("times"))
			c = '\u00d7';
		    else if (string_79_.equals("euro"))
			c = '\u20ac';
		    else if (string_79_.equals("copy"))
			c = '\u00a9';
		    else if (string_79_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_79_.startsWith("img=")
			    && interface63s != null) {
			    try {
				int i_80_
				    = Class324.method5975(string_79_
							      .substring(4),
							  -952789660);
				i_76_ += interface63s[i_80_].method64();
				i_75_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i == -1) {
		    i_76_
			+= (((Class639) this).aByteArray8257
			    [Class76.method1773(c, 1332186636) & 0xff]) & 0xff;
		    if (((Class639) this).aByteArrayArray8256 != null
			&& i_75_ != -1)
			i_76_
			    += ((Class639) this).aByteArrayArray8256[i_75_][c];
		    i_75_ = c;
		}
	    }
	}
	return i_76_;
    }
    
    static int method13576(byte[][] is, byte[][] is_81_, int[] is_82_,
			   byte[] is_83_, int[] is_84_, int i, int i_85_) {
	int i_86_ = is_82_[i];
	int i_87_ = is_84_[i] + i_86_;
	int i_88_ = is_82_[i_85_];
	int i_89_ = i_88_ + is_84_[i_85_];
	int i_90_ = i_86_;
	if (i_88_ > i_86_)
	    i_90_ = i_88_;
	int i_91_ = i_87_;
	if (i_89_ < i_87_)
	    i_91_ = i_89_;
	int i_92_ = is_83_[i] & 0xff;
	if ((is_83_[i_85_] & 0xff) < i_92_)
	    i_92_ = is_83_[i_85_] & 0xff;
	byte[] is_93_ = is_81_[i];
	byte[] is_94_ = is[i_85_];
	int i_95_ = i_90_ - i_86_;
	int i_96_ = i_90_ - i_88_;
	for (int i_97_ = i_90_; i_97_ < i_91_; i_97_++) {
	    int i_98_ = is_93_[i_95_++] + is_94_[i_96_++];
	    if (i_98_ < i_92_)
		i_92_ = i_98_;
	}
	return -i_92_;
    }
    
    public int method13577(int i, char c) {
	if (((Class639) this).aByteArrayArray8256 != null)
	    return ((Class639) this).aByteArrayArray8256[i][c];
	return 0;
    }
    
    public int method13578(String string, int i, int i_99_, int i_100_,
			   int i_101_, Interface63[] interface63s) {
	if (0 == i_99_)
	    i_99_ = anInt8259 * 1118868451;
	int i_102_ = method13565(string, new int[] { i }, aStringArray8255,
				 interface63s, (byte) 25);
	if (0 == i_102_)
	    return 0;
	if (i_101_ < 0)
	    i_101_ = 0;
	i_101_ /= i_99_;
	if (i_101_ >= i_102_)
	    i_101_ = i_102_ - 1;
	String string_103_ = aStringArray8255[i_101_];
	int i_104_ = 0;
	int i_105_ = 0;
	int i_106_;
	for (i_106_ = 0; i_106_ < i_100_ && i_104_ < string_103_.length();
	     i_106_ = method13579(string_103_.substring(0, ++i_104_),
				  interface63s, 1190536090))
	    i_105_ = i_106_;
	if (i_104_ == string_103_.length() && string_103_.endsWith("<br>"))
	    i_104_ -= 4;
	if (i_100_ - i_105_ < i_106_ - i_100_)
	    i_104_--;
	for (int i_107_ = 0; i_107_ < i_101_; i_107_++)
	    i_104_ += aStringArray8255[i_107_].length();
	return i_104_;
    }
    
    public int method13579(String string, Interface63[] interface63s, int i) {
	if (string == null)
	    return 0;
	int i_108_ = -1;
	int i_109_ = -1;
	int i_110_ = 0;
	int i_111_ = string.length();
	for (int i_112_ = 0; i_112_ < i_111_; i_112_++) {
	    char c = string.charAt(i_112_);
	    if (c == 60)
		i_108_ = i_112_;
	    else {
		if (c == 62 && i_108_ != -1) {
		    String string_113_ = string.substring(1 + i_108_, i_112_);
		    i_108_ = -1;
		    if (string_113_.equals("lt"))
			c = '<';
		    else if (string_113_.equals("gt"))
			c = '>';
		    else if (string_113_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_113_.equals("shy"))
			c = '\u00ad';
		    else if (string_113_.equals("times"))
			c = '\u00d7';
		    else if (string_113_.equals("euro"))
			c = '\u20ac';
		    else if (string_113_.equals("copy"))
			c = '\u00a9';
		    else if (string_113_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_113_.startsWith("img=")
			    && interface63s != null) {
			    try {
				int i_114_
				    = Class324.method5975(string_113_
							      .substring(4),
							  -952789660);
				i_110_ += interface63s[i_114_].method64();
				i_109_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i_108_ == -1) {
		    i_110_
			+= (((Class639) this).aByteArray8257
			    [Class76.method1773(c, 1500925709) & 0xff]) & 0xff;
		    if (((Class639) this).aByteArrayArray8256 != null
			&& i_109_ != -1)
			i_110_ += (((Class639) this).aByteArrayArray8256
				   [i_109_][c]);
		    i_109_ = c;
		}
	    }
	}
	return i_110_;
    }
    
    public int method13580(int i, char c) {
	if (((Class639) this).aByteArrayArray8256 != null)
	    return ((Class639) this).aByteArrayArray8256[i][c];
	return 0;
    }
    
    Class639(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	int i = class241_sub3.readUnsignedByte((byte) 33);
	if (0 != i)
	    throw new RuntimeException("");
	boolean bool = class241_sub3.readUnsignedByte((byte) -25) == 1;
	((Class639) this).aByteArray8257 = new byte[256];
	class241_sub3.readBytes(((Class639) this).aByteArray8257, 0, 256,
				  (byte) 20);
	if (bool) {
	    int[] is_115_ = new int[256];
	    int[] is_116_ = new int[256];
	    for (int i_117_ = 0; i_117_ < 256; i_117_++)
		is_115_[i_117_] = class241_sub3.readUnsignedByte((byte) 8);
	    for (int i_118_ = 0; i_118_ < 256; i_118_++)
		is_116_[i_118_] = class241_sub3.readUnsignedByte((byte) -90);
	    byte[][] is_119_ = new byte[256][];
	    for (int i_120_ = 0; i_120_ < 256; i_120_++) {
		is_119_[i_120_] = new byte[is_115_[i_120_]];
		byte i_121_ = 0;
		for (int i_122_ = 0; i_122_ < is_119_[i_120_].length;
		     i_122_++) {
		    i_121_ += class241_sub3.getByte(-881427896);
		    is_119_[i_120_][i_122_] = i_121_;
		}
	    }
	    byte[][] is_123_ = new byte[256][];
	    for (int i_124_ = 0; i_124_ < 256; i_124_++) {
		is_123_[i_124_] = new byte[is_115_[i_124_]];
		byte i_125_ = 0;
		for (int i_126_ = 0; i_126_ < is_123_[i_124_].length;
		     i_126_++) {
		    i_125_ += class241_sub3.getByte(-952864143);
		    is_123_[i_124_][i_126_] = i_125_;
		}
	    }
	    ((Class639) this).aByteArrayArray8256 = new byte[256][256];
	    for (int i_127_ = 0; i_127_ < 256; i_127_++) {
		if (32 != i_127_ && i_127_ != 160) {
		    for (int i_128_ = 0; i_128_ < 256; i_128_++) {
			if (i_128_ != 32 && 160 != i_128_)
			    ((Class639) this).aByteArrayArray8256[i_127_]
				[i_128_]
				= (byte) Class40.method1045(is_119_, is_123_,
							    is_116_,
							    (((Class639) this)
							     .aByteArray8257),
							    is_115_, i_127_,
							    i_128_,
							    -2094591882);
		    }
		}
	    }
	    anInt8259 = (is_116_[32] + is_115_[32]) * 1277512139;
	} else
	    anInt8259 = class241_sub3.readUnsignedByte((byte) 31) * 1277512139;
	class241_sub3.readUnsignedByte((byte) -50);
	class241_sub3.readUnsignedByte((byte) -47);
	anInt8258 = class241_sub3.readUnsignedByte((byte) -29) * -243239635;
	anInt8260 = class241_sub3.readUnsignedByte((byte) -60) * 844444231;
    }
    
    public int method13581(int i, char c) {
	if (((Class639) this).aByteArrayArray8256 != null)
	    return ((Class639) this).aByteArrayArray8256[i][c];
	return 0;
    }
    
    public int method13582(int i, char c) {
	if (((Class639) this).aByteArrayArray8256 != null)
	    return ((Class639) this).aByteArrayArray8256[i][c];
	return 0;
    }
    
    public int method13583(String string, int[] is, String[] strings,
			   Interface63[] interface63s) {
	return method13566(string, is, strings, interface63s, true,
			   -1008474306);
    }
    
    public int method13584(String string, int i, Interface63[] interface63s) {
	int i_129_ = method13565(string, new int[] { i }, aStringArray8255,
				 interface63s, (byte) 25);
	int i_130_ = 0;
	for (int i_131_ = 0; i_131_ < i_129_; i_131_++) {
	    int i_132_ = method13579(aStringArray8255[i_131_], interface63s,
				     1190536090);
	    if (i_132_ > i_130_)
		i_130_ = i_132_;
	}
	return i_130_;
    }
    
    public static Class639 method13585(JS5 class210, int i) {
	byte[] is = class210.method4194(i, -72712373);
	if (null == is)
	    return null;
	return new Class639(is);
    }
    
    public int method13586(String string, Interface63[] interface63s) {
	if (string == null)
	    return 0;
	int i = -1;
	int i_133_ = -1;
	int i_134_ = 0;
	int i_135_ = string.length();
	for (int i_136_ = 0; i_136_ < i_135_; i_136_++) {
	    char c = string.charAt(i_136_);
	    if (c == 60)
		i = i_136_;
	    else {
		if (c == 62 && i != -1) {
		    String string_137_ = string.substring(1 + i, i_136_);
		    i = -1;
		    if (string_137_.equals("lt"))
			c = '<';
		    else if (string_137_.equals("gt"))
			c = '>';
		    else if (string_137_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_137_.equals("shy"))
			c = '\u00ad';
		    else if (string_137_.equals("times"))
			c = '\u00d7';
		    else if (string_137_.equals("euro"))
			c = '\u20ac';
		    else if (string_137_.equals("copy"))
			c = '\u00a9';
		    else if (string_137_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_137_.startsWith("img=")
			    && interface63s != null) {
			    try {
				int i_138_
				    = Class324.method5975(string_137_
							      .substring(4),
							  -952789660);
				i_134_ += interface63s[i_138_].method64();
				i_133_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i == -1) {
		    i_134_
			+= (((Class639) this).aByteArray8257
			    [Class76.method1773(c, 1087670731) & 0xff]) & 0xff;
		    if (((Class639) this).aByteArrayArray8256 != null
			&& i_133_ != -1)
			i_134_ += (((Class639) this).aByteArrayArray8256
				   [i_133_][c]);
		    i_133_ = c;
		}
	    }
	}
	return i_134_;
    }
    
    public int method13587(int i, char c) {
	if (((Class639) this).aByteArrayArray8256 != null)
	    return ((Class639) this).aByteArrayArray8256[i][c];
	return 0;
    }
    
    public String method13588(String string, int i,
			      Interface63[] interface63s) {
	if (method13579(string, interface63s, 1190536090) <= i)
	    return string;
	i -= method13579("...", null, 1190536090);
	int i_139_ = -1;
	int i_140_ = -1;
	int i_141_ = 0;
	int i_142_ = string.length();
	String string_143_ = "";
	for (int i_144_ = 0; i_144_ < i_142_; i_144_++) {
	    char c = string.charAt(i_144_);
	    if (60 == c)
		i_139_ = i_144_;
	    else {
		if (62 == c && -1 != i_139_) {
		    String string_145_ = string.substring(i_139_ + 1, i_144_);
		    i_139_ = -1;
		    if (string_145_.equals("lt"))
			c = '<';
		    else if (string_145_.equals("gt"))
			c = '>';
		    else if (string_145_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_145_.equals("shy"))
			c = '\u00ad';
		    else if (string_145_.equals("times"))
			c = '\u00d7';
		    else if (string_145_.equals("euro"))
			c = '\u20ac';
		    else if (string_145_.equals("copy"))
			c = '\u00a9';
		    else if (string_145_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_145_.startsWith("img=")
			    && null != interface63s) {
			    try {
				int i_146_
				    = Class324.method5975(string_145_
							      .substring(4),
							  -952789660);
				i_141_ += interface63s[i_146_].method64();
				i_140_ = -1;
				if (i_141_ > i)
				    return new StringBuilder().append
					       (string_143_).append
					       ("...").toString();
				string_143_ = string.substring(0, i_144_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i_139_ == -1) {
		    i_141_
			+= (((Class639) this).aByteArray8257
			    [Class76.method1773(c, 544486191) & 0xff]) & 0xff;
		    if (null != ((Class639) this).aByteArrayArray8256
			&& -1 != i_140_)
			i_141_ += (((Class639) this).aByteArrayArray8256
				   [i_140_][c]);
		    i_140_ = c;
		    int i_147_ = i_141_;
		    if (((Class639) this).aByteArrayArray8256 != null)
			i_147_ += ((Class639) this).aByteArrayArray8256[c][46];
		    if (i_147_ > i)
			return new StringBuilder().append(string_143_).append
				   ("...").toString();
		    string_143_ = string.substring(0, 1 + i_144_);
		}
	    }
	}
	return string;
    }
    
    public int method13589(String string, int[] is, String[] strings,
			   Interface63[] interface63s) {
	return method13566(string, is, strings, interface63s, true,
			   -1008474306);
    }
    
    public int method13590(String string, int[] is, String[] strings,
			   Interface63[] interface63s) {
	return method13566(string, is, strings, interface63s, true,
			   -1008474306);
    }
    
    public Point method13591(String string, int i, int i_148_, int i_149_,
			     Interface63[] interface63s) {
	if (i_149_ <= 0)
	    return new Point(0, i_148_ + -351886683 * anInt8258);
	if (i_149_ > string.length())
	    i_149_ = string.length();
	if (i_148_ == 0)
	    i_148_ = anInt8259 * 1118868451;
	int i_150_ = method13566(string, new int[] { i }, aStringArray8255,
				 interface63s, false, -1008474306);
	int i_151_ = 0;
	for (int i_152_ = 0; i_152_ < i_150_; i_152_++) {
	    int i_153_ = aStringArray8255[i_152_].length();
	    if (i_153_ + i_151_ > i_149_
		|| i_152_ == i_150_ - 1 && i_149_ == string.length()) {
		String string_154_ = string.substring(i_151_, i_149_);
		if (string_154_.endsWith("<br>")) {
		    string_154_ = "";
		    i_151_ += i_153_;
		    i_152_++;
		}
		int i_155_
		    = method13579(string_154_, interface63s, 1190536090);
		int i_156_ = i_148_ * i_152_ + -351886683 * anInt8258;
		return new Point(i_155_, i_156_);
	    }
	    i_151_ += i_153_;
	}
	return null;
    }
    
    int method13592(String string, int[] is, String[] strings,
		    Interface63[] interface63s, boolean bool) {
	if (string == null)
	    return 0;
	int i = 0;
	int i_157_ = 0;
	int i_158_ = -1;
	int i_159_ = 0;
	int i_160_ = 0;
	int i_161_ = -1;
	int i_162_ = -1;
	int i_163_ = 0;
	int i_164_ = string.length();
	for (int i_165_ = 0; i_165_ < i_164_; i_165_++) {
	    int i_166_
		= Class76.method1773(string.charAt(i_165_), 376723004) & 0xff;
	    int i_167_ = 0;
	    if (60 == i_166_)
		i_161_ = i_165_;
	    else {
		int i_168_;
		if (-1 != i_161_) {
		    if (i_166_ != 62)
			continue;
		    i_168_ = i_161_;
		    String string_169_ = string.substring(1 + i_161_, i_165_);
		    i_161_ = -1;
		    if (string_169_.equals("br")) {
			strings[i_163_] = string.substring(i_157_, i_165_ + 1);
			if (++i_163_ >= strings.length)
			    return 0;
			i_157_ = i_165_ + 1;
			i = 0;
			i_158_ = -1;
			i_162_ = -1;
			continue;
		    }
		    if (string_169_.equals("lt")) {
			i_167_ += method13561(60, 1482104957);
			if (((Class639) this).aByteArrayArray8256 != null
			    && -1 != i_162_)
			    i_167_ += (((Class639) this).aByteArrayArray8256
				       [i_162_][60]);
			i_162_ = 60;
		    } else if (string_169_.equals("gt")) {
			i_167_ += method13561(62, 1449959045);
			if (((Class639) this).aByteArrayArray8256 != null
			    && i_162_ != -1)
			    i_167_ += (((Class639) this).aByteArrayArray8256
				       [i_162_][62]);
			i_162_ = 62;
		    } else if (string_169_.equals("nbsp")) {
			i_167_ += method13561(160, 923727977);
			if (null != ((Class639) this).aByteArrayArray8256
			    && -1 != i_162_)
			    i_167_ += (((Class639) this).aByteArrayArray8256
				       [i_162_][160]);
			i_162_ = 160;
		    } else if (string_169_.equals("shy")) {
			i_167_ += method13561(173, 1146131948);
			if (((Class639) this).aByteArrayArray8256 != null
			    && -1 != i_162_)
			    i_167_ += (((Class639) this).aByteArrayArray8256
				       [i_162_][173]);
			i_162_ = 173;
		    } else if (string_169_.equals("times")) {
			i_167_ += method13561(215, 1834060932);
			if (null != ((Class639) this).aByteArrayArray8256
			    && i_162_ != -1)
			    i_167_ += (((Class639) this).aByteArrayArray8256
				       [i_162_][215]);
			i_162_ = 215;
		    } else if (string_169_.equals("euro")) {
			i_167_ += method13561(8364, 1745590894);
			if (null != ((Class639) this).aByteArrayArray8256
			    && -1 != i_162_)
			    i_167_ += (((Class639) this).aByteArrayArray8256
				       [i_162_][8364]);
			i_162_ = 8364;
		    } else if (string_169_.equals("copy")) {
			i_167_ += method13561(169, 868031981);
			if (((Class639) this).aByteArrayArray8256 != null
			    && i_162_ != -1)
			    i_167_ += (((Class639) this).aByteArrayArray8256
				       [i_162_][169]);
			i_162_ = 169;
		    } else if (string_169_.equals("reg")) {
			i_167_ += method13561(174, 905481365);
			if (null != ((Class639) this).aByteArrayArray8256
			    && i_162_ != -1)
			    i_167_ += (((Class639) this).aByteArrayArray8256
				       [i_162_][174]);
			i_162_ = 174;
		    } else if (string_169_.startsWith("img=")
			       && null != interface63s) {
			try {
			    int i_170_
				= Class324.method5975(string_169_.substring(4),
						      -952789660);
			    i_167_ += interface63s[i_170_].method64();
			    i_162_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		    i_166_ = -1;
		} else {
		    i_168_ = i_165_;
		    i_167_ += method13561(i_166_, 1645712778);
		    if (((Class639) this).aByteArrayArray8256 != null
			&& -1 != i_162_)
			i_167_ += (((Class639) this).aByteArrayArray8256
				   [i_162_][i_166_]);
		    i_162_ = i_166_;
		}
		if (i_167_ > 0) {
		    i += i_167_;
		    if (is != null) {
			if (32 == i_166_) {
			    i_158_ = i_165_;
			    i_159_ = i;
			    i_160_ = bool ? 1 : 0;
			}
			if (i > is[(i_163_ < is.length ? i_163_
				    : is.length - 1)]) {
			    if (i_158_ >= 0) {
				strings[i_163_]
				    = string.substring(i_157_,
						       1 + i_158_ - i_160_);
				if (++i_163_ >= strings.length)
				    return 0;
				i_157_ = 1 + i_158_;
				i_158_ = -1;
				i -= i_159_;
				i_162_ = -1;
			    } else {
				strings[i_163_]
				    = string.substring(i_157_, i_168_);
				if (++i_163_ >= strings.length)
				    return 0;
				i_157_ = i_168_;
				i_158_ = -1;
				i = i_167_;
				i_162_ = -1;
			    }
			}
			if (i_166_ == 45) {
			    i_158_ = i_165_;
			    i_159_ = i;
			    i_160_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_157_) {
	    strings[i_163_] = string.substring(i_157_, string.length());
	    i_163_++;
	}
	return i_163_;
    }
    
    int method13593(String string, int[] is, String[] strings,
		    Interface63[] interface63s, boolean bool) {
	if (string == null)
	    return 0;
	int i = 0;
	int i_171_ = 0;
	int i_172_ = -1;
	int i_173_ = 0;
	int i_174_ = 0;
	int i_175_ = -1;
	int i_176_ = -1;
	int i_177_ = 0;
	int i_178_ = string.length();
	for (int i_179_ = 0; i_179_ < i_178_; i_179_++) {
	    int i_180_
		= Class76.method1773(string.charAt(i_179_), 634957437) & 0xff;
	    int i_181_ = 0;
	    if (60 == i_180_)
		i_175_ = i_179_;
	    else {
		int i_182_;
		if (-1 != i_175_) {
		    if (i_180_ != 62)
			continue;
		    i_182_ = i_175_;
		    String string_183_ = string.substring(1 + i_175_, i_179_);
		    i_175_ = -1;
		    if (string_183_.equals("br")) {
			strings[i_177_] = string.substring(i_171_, i_179_ + 1);
			if (++i_177_ >= strings.length)
			    return 0;
			i_171_ = i_179_ + 1;
			i = 0;
			i_172_ = -1;
			i_176_ = -1;
			continue;
		    }
		    if (string_183_.equals("lt")) {
			i_181_ += method13561(60, 1963797012);
			if (((Class639) this).aByteArrayArray8256 != null
			    && -1 != i_176_)
			    i_181_ += (((Class639) this).aByteArrayArray8256
				       [i_176_][60]);
			i_176_ = 60;
		    } else if (string_183_.equals("gt")) {
			i_181_ += method13561(62, 2031982027);
			if (((Class639) this).aByteArrayArray8256 != null
			    && i_176_ != -1)
			    i_181_ += (((Class639) this).aByteArrayArray8256
				       [i_176_][62]);
			i_176_ = 62;
		    } else if (string_183_.equals("nbsp")) {
			i_181_ += method13561(160, 1064873396);
			if (null != ((Class639) this).aByteArrayArray8256
			    && -1 != i_176_)
			    i_181_ += (((Class639) this).aByteArrayArray8256
				       [i_176_][160]);
			i_176_ = 160;
		    } else if (string_183_.equals("shy")) {
			i_181_ += method13561(173, 1813231085);
			if (((Class639) this).aByteArrayArray8256 != null
			    && -1 != i_176_)
			    i_181_ += (((Class639) this).aByteArrayArray8256
				       [i_176_][173]);
			i_176_ = 173;
		    } else if (string_183_.equals("times")) {
			i_181_ += method13561(215, 1366396305);
			if (null != ((Class639) this).aByteArrayArray8256
			    && i_176_ != -1)
			    i_181_ += (((Class639) this).aByteArrayArray8256
				       [i_176_][215]);
			i_176_ = 215;
		    } else if (string_183_.equals("euro")) {
			i_181_ += method13561(8364, 840243702);
			if (null != ((Class639) this).aByteArrayArray8256
			    && -1 != i_176_)
			    i_181_ += (((Class639) this).aByteArrayArray8256
				       [i_176_][8364]);
			i_176_ = 8364;
		    } else if (string_183_.equals("copy")) {
			i_181_ += method13561(169, 2060037002);
			if (((Class639) this).aByteArrayArray8256 != null
			    && i_176_ != -1)
			    i_181_ += (((Class639) this).aByteArrayArray8256
				       [i_176_][169]);
			i_176_ = 169;
		    } else if (string_183_.equals("reg")) {
			i_181_ += method13561(174, 1261463608);
			if (null != ((Class639) this).aByteArrayArray8256
			    && i_176_ != -1)
			    i_181_ += (((Class639) this).aByteArrayArray8256
				       [i_176_][174]);
			i_176_ = 174;
		    } else if (string_183_.startsWith("img=")
			       && null != interface63s) {
			try {
			    int i_184_
				= Class324.method5975(string_183_.substring(4),
						      -952789660);
			    i_181_ += interface63s[i_184_].method64();
			    i_176_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		    i_180_ = -1;
		} else {
		    i_182_ = i_179_;
		    i_181_ += method13561(i_180_, 1474869483);
		    if (((Class639) this).aByteArrayArray8256 != null
			&& -1 != i_176_)
			i_181_ += (((Class639) this).aByteArrayArray8256
				   [i_176_][i_180_]);
		    i_176_ = i_180_;
		}
		if (i_181_ > 0) {
		    i += i_181_;
		    if (is != null) {
			if (32 == i_180_) {
			    i_172_ = i_179_;
			    i_173_ = i;
			    i_174_ = bool ? 1 : 0;
			}
			if (i > is[(i_177_ < is.length ? i_177_
				    : is.length - 1)]) {
			    if (i_172_ >= 0) {
				strings[i_177_]
				    = string.substring(i_171_,
						       1 + i_172_ - i_174_);
				if (++i_177_ >= strings.length)
				    return 0;
				i_171_ = 1 + i_172_;
				i_172_ = -1;
				i -= i_173_;
				i_176_ = -1;
			    } else {
				strings[i_177_]
				    = string.substring(i_171_, i_182_);
				if (++i_177_ >= strings.length)
				    return 0;
				i_171_ = i_182_;
				i_172_ = -1;
				i = i_181_;
				i_176_ = -1;
			    }
			}
			if (i_180_ == 45) {
			    i_172_ = i_179_;
			    i_173_ = i;
			    i_174_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_171_) {
	    strings[i_177_] = string.substring(i_171_, string.length());
	    i_177_++;
	}
	return i_177_;
    }
    
    int method13594(String string, int[] is, String[] strings,
		    Interface63[] interface63s, boolean bool) {
	if (string == null)
	    return 0;
	int i = 0;
	int i_185_ = 0;
	int i_186_ = -1;
	int i_187_ = 0;
	int i_188_ = 0;
	int i_189_ = -1;
	int i_190_ = -1;
	int i_191_ = 0;
	int i_192_ = string.length();
	for (int i_193_ = 0; i_193_ < i_192_; i_193_++) {
	    int i_194_
		= Class76.method1773(string.charAt(i_193_), 1552665784) & 0xff;
	    int i_195_ = 0;
	    if (60 == i_194_)
		i_189_ = i_193_;
	    else {
		int i_196_;
		if (-1 != i_189_) {
		    if (i_194_ != 62)
			continue;
		    i_196_ = i_189_;
		    String string_197_ = string.substring(1 + i_189_, i_193_);
		    i_189_ = -1;
		    if (string_197_.equals("br")) {
			strings[i_191_] = string.substring(i_185_, i_193_ + 1);
			if (++i_191_ >= strings.length)
			    return 0;
			i_185_ = i_193_ + 1;
			i = 0;
			i_186_ = -1;
			i_190_ = -1;
			continue;
		    }
		    if (string_197_.equals("lt")) {
			i_195_ += method13561(60, 2109879667);
			if (((Class639) this).aByteArrayArray8256 != null
			    && -1 != i_190_)
			    i_195_ += (((Class639) this).aByteArrayArray8256
				       [i_190_][60]);
			i_190_ = 60;
		    } else if (string_197_.equals("gt")) {
			i_195_ += method13561(62, 1217475385);
			if (((Class639) this).aByteArrayArray8256 != null
			    && i_190_ != -1)
			    i_195_ += (((Class639) this).aByteArrayArray8256
				       [i_190_][62]);
			i_190_ = 62;
		    } else if (string_197_.equals("nbsp")) {
			i_195_ += method13561(160, 1058829125);
			if (null != ((Class639) this).aByteArrayArray8256
			    && -1 != i_190_)
			    i_195_ += (((Class639) this).aByteArrayArray8256
				       [i_190_][160]);
			i_190_ = 160;
		    } else if (string_197_.equals("shy")) {
			i_195_ += method13561(173, 1334538738);
			if (((Class639) this).aByteArrayArray8256 != null
			    && -1 != i_190_)
			    i_195_ += (((Class639) this).aByteArrayArray8256
				       [i_190_][173]);
			i_190_ = 173;
		    } else if (string_197_.equals("times")) {
			i_195_ += method13561(215, 886253722);
			if (null != ((Class639) this).aByteArrayArray8256
			    && i_190_ != -1)
			    i_195_ += (((Class639) this).aByteArrayArray8256
				       [i_190_][215]);
			i_190_ = 215;
		    } else if (string_197_.equals("euro")) {
			i_195_ += method13561(8364, 1584344191);
			if (null != ((Class639) this).aByteArrayArray8256
			    && -1 != i_190_)
			    i_195_ += (((Class639) this).aByteArrayArray8256
				       [i_190_][8364]);
			i_190_ = 8364;
		    } else if (string_197_.equals("copy")) {
			i_195_ += method13561(169, 1738206141);
			if (((Class639) this).aByteArrayArray8256 != null
			    && i_190_ != -1)
			    i_195_ += (((Class639) this).aByteArrayArray8256
				       [i_190_][169]);
			i_190_ = 169;
		    } else if (string_197_.equals("reg")) {
			i_195_ += method13561(174, 1455471947);
			if (null != ((Class639) this).aByteArrayArray8256
			    && i_190_ != -1)
			    i_195_ += (((Class639) this).aByteArrayArray8256
				       [i_190_][174]);
			i_190_ = 174;
		    } else if (string_197_.startsWith("img=")
			       && null != interface63s) {
			try {
			    int i_198_
				= Class324.method5975(string_197_.substring(4),
						      -952789660);
			    i_195_ += interface63s[i_198_].method64();
			    i_190_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		    i_194_ = -1;
		} else {
		    i_196_ = i_193_;
		    i_195_ += method13561(i_194_, 1399423077);
		    if (((Class639) this).aByteArrayArray8256 != null
			&& -1 != i_190_)
			i_195_ += (((Class639) this).aByteArrayArray8256
				   [i_190_][i_194_]);
		    i_190_ = i_194_;
		}
		if (i_195_ > 0) {
		    i += i_195_;
		    if (is != null) {
			if (32 == i_194_) {
			    i_186_ = i_193_;
			    i_187_ = i;
			    i_188_ = bool ? 1 : 0;
			}
			if (i > is[(i_191_ < is.length ? i_191_
				    : is.length - 1)]) {
			    if (i_186_ >= 0) {
				strings[i_191_]
				    = string.substring(i_185_,
						       1 + i_186_ - i_188_);
				if (++i_191_ >= strings.length)
				    return 0;
				i_185_ = 1 + i_186_;
				i_186_ = -1;
				i -= i_187_;
				i_190_ = -1;
			    } else {
				strings[i_191_]
				    = string.substring(i_185_, i_196_);
				if (++i_191_ >= strings.length)
				    return 0;
				i_185_ = i_196_;
				i_186_ = -1;
				i = i_195_;
				i_190_ = -1;
			    }
			}
			if (i_194_ == 45) {
			    i_186_ = i_193_;
			    i_187_ = i;
			    i_188_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_185_) {
	    strings[i_191_] = string.substring(i_185_, string.length());
	    i_191_++;
	}
	return i_191_;
    }
    
    public int method13595(String string) {
	return method13579(string, null, 1190536090);
    }
    
    public int method13596(String string, int i, int i_199_,
			   Interface63[] interface63s, int i_200_) {
	if (0 == i_199_)
	    i_199_ = 1118868451 * anInt8259;
	int i_201_ = method13565(string, new int[] { i }, aStringArray8255,
				 interface63s, (byte) 25);
	int i_202_ = i_199_ * (i_201_ - 1);
	return 326424439 * anInt8260 + (i_202_ + anInt8258 * -351886683);
    }
    
    public int method13597(String string, int i, Interface63[] interface63s) {
	int i_203_ = method13565(string, new int[] { i }, aStringArray8255,
				 interface63s, (byte) 25);
	int i_204_ = 0;
	for (int i_205_ = 0; i_205_ < i_203_; i_205_++) {
	    int i_206_ = method13579(aStringArray8255[i_205_], interface63s,
				     1190536090);
	    if (i_206_ > i_204_)
		i_204_ = i_206_;
	}
	return i_204_;
    }
    
    public int method13598(String string, int i, int i_207_,
			   Interface63[] interface63s) {
	if (0 == i_207_)
	    i_207_ = 1118868451 * anInt8259;
	int i_208_ = method13565(string, new int[] { i }, aStringArray8255,
				 interface63s, (byte) 25);
	int i_209_ = i_207_ * (i_208_ - 1);
	return 326424439 * anInt8260 + (i_209_ + anInt8258 * -351886683);
    }
    
    public int method13599(String string, int i, int i_210_,
			   Interface63[] interface63s) {
	if (0 == i_210_)
	    i_210_ = 1118868451 * anInt8259;
	int i_211_ = method13565(string, new int[] { i }, aStringArray8255,
				 interface63s, (byte) 25);
	int i_212_ = i_210_ * (i_211_ - 1);
	return 326424439 * anInt8260 + (i_212_ + anInt8258 * -351886683);
    }
    
    public int method13600(String string, int i, int i_213_,
			   Interface63[] interface63s) {
	if (0 == i_213_)
	    i_213_ = 1118868451 * anInt8259;
	int i_214_ = method13565(string, new int[] { i }, aStringArray8255,
				 interface63s, (byte) 25);
	int i_215_ = i_213_ * (i_214_ - 1);
	return 326424439 * anInt8260 + (i_215_ + anInt8258 * -351886683);
    }
    
    public int method13601(String string) {
	return method13579(string, null, 1190536090);
    }
    
    public Point method13602(String string, int i, int i_216_, int i_217_,
			     Interface63[] interface63s, int i_218_) {
	if (i_217_ <= 0)
	    return new Point(0, i_216_ + -351886683 * anInt8258);
	if (i_217_ > string.length())
	    i_217_ = string.length();
	if (i_216_ == 0)
	    i_216_ = anInt8259 * 1118868451;
	int i_219_ = method13566(string, new int[] { i }, aStringArray8255,
				 interface63s, false, -1008474306);
	int i_220_ = 0;
	for (int i_221_ = 0; i_221_ < i_219_; i_221_++) {
	    int i_222_ = aStringArray8255[i_221_].length();
	    if (i_222_ + i_220_ > i_217_
		|| i_221_ == i_219_ - 1 && i_217_ == string.length()) {
		String string_223_ = string.substring(i_220_, i_217_);
		if (string_223_.endsWith("<br>")) {
		    string_223_ = "";
		    i_220_ += i_222_;
		    i_221_++;
		}
		int i_224_
		    = method13579(string_223_, interface63s, 1190536090);
		int i_225_ = i_216_ * i_221_ + -351886683 * anInt8258;
		return new Point(i_224_, i_225_);
	    }
	    i_220_ += i_222_;
	}
	return null;
    }
    
    public String method13603(String string, int i,
			      Interface63[] interface63s) {
	if (method13579(string, interface63s, 1190536090) <= i)
	    return string;
	i -= method13579("...", null, 1190536090);
	int i_226_ = -1;
	int i_227_ = -1;
	int i_228_ = 0;
	int i_229_ = string.length();
	String string_230_ = "";
	for (int i_231_ = 0; i_231_ < i_229_; i_231_++) {
	    char c = string.charAt(i_231_);
	    if (60 == c)
		i_226_ = i_231_;
	    else {
		if (62 == c && -1 != i_226_) {
		    String string_232_ = string.substring(i_226_ + 1, i_231_);
		    i_226_ = -1;
		    if (string_232_.equals("lt"))
			c = '<';
		    else if (string_232_.equals("gt"))
			c = '>';
		    else if (string_232_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_232_.equals("shy"))
			c = '\u00ad';
		    else if (string_232_.equals("times"))
			c = '\u00d7';
		    else if (string_232_.equals("euro"))
			c = '\u20ac';
		    else if (string_232_.equals("copy"))
			c = '\u00a9';
		    else if (string_232_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_232_.startsWith("img=")
			    && null != interface63s) {
			    try {
				int i_233_
				    = Class324.method5975(string_232_
							      .substring(4),
							  -952789660);
				i_228_ += interface63s[i_233_].method64();
				i_227_ = -1;
				if (i_228_ > i)
				    return new StringBuilder().append
					       (string_230_).append
					       ("...").toString();
				string_230_ = string.substring(0, i_231_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i_226_ == -1) {
		    i_228_
			+= (((Class639) this).aByteArray8257
			    [Class76.method1773(c, 2128768846) & 0xff]) & 0xff;
		    if (null != ((Class639) this).aByteArrayArray8256
			&& -1 != i_227_)
			i_228_ += (((Class639) this).aByteArrayArray8256
				   [i_227_][c]);
		    i_227_ = c;
		    int i_234_ = i_228_;
		    if (((Class639) this).aByteArrayArray8256 != null)
			i_234_ += ((Class639) this).aByteArrayArray8256[c][46];
		    if (i_234_ > i)
			return new StringBuilder().append(string_230_).append
				   ("...").toString();
		    string_230_ = string.substring(0, 1 + i_231_);
		}
	    }
	}
	return string;
    }
    
    public static final void method13604(int i, int i_235_, byte i_236_) {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	i -= class522.baseX * 127679513;
	if (i < 0)
	    i = 0;
	else if (i >= client.aClass238_8477.method4744(-1378476971))
	    i = client.aClass238_8477.method4744(-1822833991);
	i_235_ -= 468558693 * class522.baseY;
	if (i_235_ < 0)
	    i_235_ = 0;
	else if (i_235_ >= client.aClass238_8477.method4745(33899924))
	    i_235_ = client.aClass238_8477.method4745(1582851183);
	Class509.method11526(-1293100327);
	Class291.anInt4488 = -255345193 * Class462.anInt6284;
	Class354_Sub2.anInt10492 = -1132859793 * Class636.anInt8248;
	client.anInt8557 = ((i << 9) + 256) * 1531796105;
	client.anInt8361 = (256 + (i_235_ << 9)) * -1761506027;
	Class296.anInt4513 = -1510039747;
	Class254.anInt4134 = -162819257;
	Class245.anInt3961 = -1540801703;
    }
    
    static final void method13605(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      != 0) ? 1 : 0,
	     (byte) 2);
	Class167.method3600((short) -2304);
	client.aClass238_8477.method4768((byte) 5);
    }
    
    public static int method13606(int i, int i_237_, int i_238_) {
	i_237_ = (i & 0x7f) * i_237_ >> 7;
	if (i_237_ < 2)
	    i_237_ = 2;
	else if (i_237_ > 126)
	    i_237_ = 126;
	return i_237_ + (i & 0xff80);
    }
    
    static void method13607(int i) {
	Class83.method1833(-1733947284);
    }
    
    static String method13608(String string, int i) {
	String string_239_ = null;
	int i_240_ = string.indexOf("--> ");
	if (i_240_ >= 0) {
	    string_239_ = string.substring(0, 4 + i_240_);
	    string = string.substring(i_240_ + 4);
	}
	if (string.startsWith("directlogin ")) {
	    int i_241_ = string.indexOf(" ", "directlogin ".length());
	    if (i_241_ >= 0) {
		int i_242_ = string.length();
		string = new StringBuilder().append
			     (string.substring(0, i_241_)).append
			     (" ").toString();
		for (int i_243_ = i_241_ + 1; i_243_ < i_242_; i_243_++)
		    string = new StringBuilder().append(string).append("*")
				 .toString();
	    }
	}
	if (null != string_239_)
	    return new StringBuilder().append(string_239_).append(string)
		       .toString();
	return string;
    }
}
