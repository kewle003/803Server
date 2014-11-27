/* Class486 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class486
{
    public static int method11120(CharSequence charsequence) {
	int i = charsequence.length();
	int i_0_ = 0;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    char c = charsequence.charAt(i_1_);
	    if (c <= '\u007f')
		i_0_++;
	    else if (c <= '\u07ff')
		i_0_ += 2;
	    else
		i_0_ += 3;
	}
	return i_0_;
    }
    
    Class486() throws Throwable {
	throw new Error();
    }
    
    public static int method11121(CharSequence charsequence) {
	int i = charsequence.length();
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    char c = charsequence.charAt(i_3_);
	    if (c <= '\u007f')
		i_2_++;
	    else if (c <= '\u07ff')
		i_2_ += 2;
	    else
		i_2_ += 3;
	}
	return i_2_;
    }
    
    public static int method11122(CharSequence charsequence) {
	int i = charsequence.length();
	int i_4_ = 0;
	for (int i_5_ = 0; i_5_ < i; i_5_++) {
	    char c = charsequence.charAt(i_5_);
	    if (c <= '\u007f')
		i_4_++;
	    else if (c <= '\u07ff')
		i_4_ += 2;
	    else
		i_4_ += 3;
	}
	return i_4_;
    }
    
    public static int method11123(byte[] is, int i,
				  CharSequence charsequence) {
	int i_6_ = charsequence.length();
	int i_7_ = i;
	for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
	    int i_9_ = charsequence.charAt(i_8_);
	    if (i_9_ <= 127)
		is[i_7_++] = (byte) i_9_;
	    else if (i_9_ <= 2047) {
		is[i_7_++] = (byte) (0xc0 | i_9_ >> 6);
		is[i_7_++] = (byte) (0x80 | i_9_ & 0x3f);
	    } else {
		is[i_7_++] = (byte) (0xe0 | i_9_ >> 12);
		is[i_7_++] = (byte) (0x80 | i_9_ >> 6 & 0x3f);
		is[i_7_++] = (byte) (0x80 | i_9_ & 0x3f);
	    }
	}
	return i_7_ - i;
    }
    
    static final void method11124(ClientScriptData class454, byte i) {
	Class65.method1637(Class295.method5721((byte) -21), class454,
			   558179480);
    }
    
    static final void method11125(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class167.aBool2063 ? 1 : 0;
    }
    
    public static void method11126(byte i) {
	synchronized (Class24.aClass129_210) {
	    Class24.aClass129_210.reset(-1224799981);
	}
    }
    
    static final void method11127(ClientScriptData class454, int i) {
	((ClientScriptData) class454).anInt6231 -= 1421070234;
	if ((((ClientScriptData) class454).longStack
	     [-735224571 * ((ClientScriptData) class454).anInt6231 + 1])
	    == (((ClientScriptData) class454).longStack
		[-735224571 * ((ClientScriptData) class454).anInt6231]))
	    ((ClientScriptData) class454).step
		+= (1924545709
		    * (((ClientScriptData) class454).integerConstants
		       [((ClientScriptData) class454).step * 1938982693]));
    }
}
