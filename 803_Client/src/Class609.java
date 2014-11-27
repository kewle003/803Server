/* Class609 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class609
{
    public static Server aClass397_7759;
    
    public static String method13223(CharSequence charsequence) {
	int i = charsequence.length();
	StringBuilder stringbuilder = new StringBuilder(i);
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    char c = charsequence.charAt(i_0_);
	    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'
		|| c >= '0' && c <= '9' || '.' == c || '-' == c || '*' == c
		|| c == '_')
		stringbuilder.append(c);
	    else if (c == ' ')
		stringbuilder.append('+');
	    else {
		int i_1_ = Class76.method1773(c, 610835639);
		stringbuilder.append('%');
		int i_2_ = i_1_ >> 4 & 0xf;
		if (i_2_ >= 10)
		    stringbuilder.append((char) (55 + i_2_));
		else
		    stringbuilder.append((char) (48 + i_2_));
		i_2_ = i_1_ & 0xf;
		if (i_2_ >= 10)
		    stringbuilder.append((char) (i_2_ + 55));
		else
		    stringbuilder.append((char) (48 + i_2_));
	    }
	}
	return stringbuilder.toString();
    }
    
    Class609() throws Throwable {
	throw new Error();
    }
    
    public static String method13224(CharSequence charsequence) {
	int i = charsequence.length();
	StringBuilder stringbuilder = new StringBuilder(i);
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    char c = charsequence.charAt(i_3_);
	    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'
		|| c >= '0' && c <= '9' || '.' == c || '-' == c || '*' == c
		|| c == '_')
		stringbuilder.append(c);
	    else if (c == ' ')
		stringbuilder.append('+');
	    else {
		int i_4_ = Class76.method1773(c, 1323370813);
		stringbuilder.append('%');
		int i_5_ = i_4_ >> 4 & 0xf;
		if (i_5_ >= 10)
		    stringbuilder.append((char) (55 + i_5_));
		else
		    stringbuilder.append((char) (48 + i_5_));
		i_5_ = i_4_ & 0xf;
		if (i_5_ >= 10)
		    stringbuilder.append((char) (i_5_ + 55));
		else
		    stringbuilder.append((char) (48 + i_5_));
	    }
	}
	return stringbuilder.toString();
    }
    
    public static String method13225(String string) {
	StringBuilder stringbuilder = new StringBuilder();
	int i = string.length();
	for (int i_6_ = 0; i_6_ < i; i_6_++) {
	    char c = string.charAt(i_6_);
	    if (37 == c && i > 2 + i_6_) {
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
		if (0 != i_7_ && Class257.method5057((byte) i_7_, 1944535933))
		    stringbuilder.append(Class80.method1809((byte) i_7_,
							    537723693));
		i_6_ += 2;
	    } else if (43 == c)
		stringbuilder.append(' ');
	    else
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
    
    static final void method13226(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class622.method13359(string, 37077408);
    }
}
