/* Class355 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class355
{
    String aString5449;
    String aString5450;
    String aString5451;
    static Class96 aClass96_5452;
    
    Class355(String string, String string_0_, String string_1_) {
	((Class355) this).aString5450 = string;
	((Class355) this).aString5449 = string_0_;
	((Class355) this).aString5451 = string_1_;
    }
    
    static ClientScript method6436(Class614 class614, int i, int i_2_,
					  int i_3_) {
	int i_4_ = 1620825253 * class614.anInt7816 | i << 10;
	ClientScript class241_sub39_sub1
	    = ((ClientScript)
	       Class494.aClass109_6520.method2754((long) i_4_ << 16));
	if (class241_sub39_sub1 != null)
	    return class241_sub39_sub1;
	byte[] is = (Class547.CS2_ARCHIVE.method4194
		     (Class547.CS2_ARCHIVE.method4203(i_4_, 392793640),
		      -1342320069));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class241_sub39_sub1 = Class275.method5347(is, (byte) 65);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_4_).toString());
	    }
	    class241_sub39_sub1.aClass614_10821 = class614;
	    Class494.aClass109_6520.method2755(class241_sub39_sub1,
					       (long) i_4_ << 16);
	    return class241_sub39_sub1;
	}
	i_4_ = 1620825253 * class614.anInt7816 | i_2_ + 65536 << 10;
	class241_sub39_sub1
	    = ((ClientScript)
	       Class494.aClass109_6520.method2754((long) i_4_ << 16));
	if (class241_sub39_sub1 != null)
	    return class241_sub39_sub1;
	is = (Class547.CS2_ARCHIVE.method4194
	      (Class547.CS2_ARCHIVE.method4203(i_4_, -1066888832),
	       1305311010));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class241_sub39_sub1 = Class275.method5347(is, (byte) 67);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_4_).toString());
	    }
	    class241_sub39_sub1.aClass614_10821 = class614;
	    Class494.aClass109_6520.method2755(class241_sub39_sub1,
					       (long) i_4_ << 16);
	    return class241_sub39_sub1;
	}
	i_4_ = 1620825253 * class614.anInt7816 | 0x3fffc00;
	class241_sub39_sub1
	    = ((ClientScript)
	       Class494.aClass109_6520.method2754((long) i_4_ << 16));
	if (null != class241_sub39_sub1)
	    return class241_sub39_sub1;
	is = (Class547.CS2_ARCHIVE.method4194
	      (Class547.CS2_ARCHIVE.method4203(i_4_, 1916544049),
	       589319227));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class241_sub39_sub1 = Class275.method5347(is, (byte) 122);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_4_).toString());
	    }
	    class241_sub39_sub1.aClass614_10821 = class614;
	    Class494.aClass109_6520.method2755(class241_sub39_sub1,
					       (long) i_4_ << 16);
	    return class241_sub39_sub1;
	}
	return null;
    }
    
    static void method6437(Class241_Sub39_Sub11 class241_sub39_sub11, int i) {
		if (class241_sub39_sub11 != null) {
		    Class16.aClass429_150.addNode(class241_sub39_sub11,
						     (short) -7689);
		    Class16.anInt148 += 431696667;
		    //Object object = null;
		    Class241_Sub39_Sub10 class241_sub39_sub10;
		    if (!((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10878
			&& !"".equals(((Class241_Sub39_Sub11) class241_sub39_sub11)
				      .aString10869)) {
			long l = (544876251290631095L
				  * (((Class241_Sub39_Sub11) class241_sub39_sub11)
				     .aLong10872));
			for (class241_sub39_sub10
				 = ((Class241_Sub39_Sub10)
				    Class16.aClass407_180.get(l));
			     (class241_sub39_sub10 != null
			      && !(((Class241_Sub39_Sub10) class241_sub39_sub10)
				       .aString10865.equals
				   (((Class241_Sub39_Sub11) class241_sub39_sub11)
				    .aString10869)));
			     class241_sub39_sub10
				 = ((Class241_Sub39_Sub10)
				    Class16.aClass407_180.method7289((byte) -93))) {
			    /* empty */
			}
			if (null == class241_sub39_sub10) {
			    class241_sub39_sub10
				= ((Class241_Sub39_Sub10)
				   Class16.aClass129_155.get(l));
			    if (null != class241_sub39_sub10
				&& !(((Class241_Sub39_Sub10) class241_sub39_sub10)
					 .aString10865.equals
				     (((Class241_Sub39_Sub11) class241_sub39_sub11)
				      .aString10869)))
				class241_sub39_sub10 = null;
			    if (class241_sub39_sub10 == null)
				class241_sub39_sub10
				    = new Class241_Sub39_Sub10(((Class241_Sub39_Sub11)
								class241_sub39_sub11)
							       .aString10869);
			    Class16.aClass407_180.put(class241_sub39_sub10, l);
			    Class16.anInt149 += -1884741155;
			}
		    } else {
			class241_sub39_sub10
			    = new Class241_Sub39_Sub10(((Class241_Sub39_Sub11)
							class241_sub39_sub11)
						       .aString10869);
			Class16.anInt149 += -1884741155;
		    }
		    if (class241_sub39_sub10.method17197(class241_sub39_sub11,
							 1213359744))
			Class88.method1854(class241_sub39_sub10, (byte) -39);
		}
    }
    
    static final void method6438(ClientScriptData class454, short i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class133.method3086(string, 472684571);
    }
    
    public static String method6439(String string, int i) {
	StringBuilder stringbuilder = new StringBuilder();
	int i_5_ = string.length();
	for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
	    char c = string.charAt(i_6_);
	    if (37 == c && i_5_ > 2 + i_6_) {
		c = string.charAt(1 + i_6_);
		boolean bool = false;
		int i_7_;
		if (c >= 48 && c <= 57)
		    i_7_ = c - 48;
		else if (c >= 97 && c <= 102)
		    i_7_ = 10 + c - 97;
		else if (c >= 65 && c <= 70)
		    i_7_ = c + 10 - 65;
		else {
		    stringbuilder.append('%');
		    continue;
		}
		i_7_ *= 16;
		int i_8_ = string.charAt(2 + i_6_);
		if (i_8_ >= 48 && i_8_ <= 57)
		    i_7_ += i_8_ - 48;
		else if (i_8_ >= 97 && i_8_ <= 102)
		    i_7_ += 10 + i_8_ - 97;
		else if (i_8_ >= 65 && i_8_ <= 70)
		    i_7_ += i_8_ + 10 - 65;
		else {
		    stringbuilder.append('%');
		    continue;
		}
		if (0 != i_7_ && Class257.method5057((byte) i_7_, 607230303))
		    stringbuilder.append(Class80.method1809((byte) i_7_,
							    2073574594));
		i_6_ += 2;
	    } else if (43 == c)
		stringbuilder.append(' ');
	    else
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
}
