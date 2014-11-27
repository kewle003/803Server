/* Class542 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Stack;

public class Class542
{
    static Stack aStack7010 = new Stack();
    public Class475_Sub1 aClass475_Sub1_7011;
    boolean aBool7012;
    Class576 aClass576_7013;
    
    static void method11945(Class542 class542) {
	class542.aClass475_Sub1_7011 = null;
	synchronized (aStack7010) {
	    if (aStack7010.size() < 200)
		aStack7010.push(class542);
	}
    }
    
    public boolean method11946(Class103 class103, int i, int i_0_, byte i_1_) {
	int i_2_ = aClass475_Sub1_7011.method14447((byte) 3);
	if (aClass475_Sub1_7011.aClass97Array8748 != null) {
	    for (int i_3_ = 0;
		 i_3_ < aClass475_Sub1_7011.aClass97Array8748.length; i_3_++) {
		aClass475_Sub1_7011.aClass97Array8748[i_3_].anInt1348 <<= i_2_;
		if ((aClass475_Sub1_7011.aClass97Array8748[i_3_].method2171
		     ((((Class576) ((Class542) this).aClass576_7013).anInt7446
		       * -865992723) + i,
		      (((Class576) ((Class542) this).aClass576_7013).anInt7445
		       * 1963729237) + i_0_))
		    && aClass475_Sub1_7011.method14448(class103, i, i_0_,
						       -1261427163)) {
		    aClass475_Sub1_7011.aClass97Array8748[i_3_].anInt1348
			>>= i_2_;
		    return true;
		}
		aClass475_Sub1_7011.aClass97Array8748[i_3_].anInt1348 >>= i_2_;
	    }
	}
	return false;
    }
    
    Class542() {
	/* empty */
    }
    
    static void method11947(Class542 class542) {
	class542.aClass475_Sub1_7011 = null;
	synchronized (aStack7010) {
	    if (aStack7010.size() < 200)
		aStack7010.push(class542);
	}
    }
    
    public static Class542 method11948(boolean bool) {
	synchronized (aStack7010) {
	    Class542 class542;
	    if (aStack7010.isEmpty())
		class542 = new Class542();
	    else
		class542 = (Class542) aStack7010.pop();
	    ((Class542) class542).aBool7012 = bool;
	    Class542 class542_4_ = class542;
	    return class542_4_;
	}
    }
    
    static final void setComponentCursor/*method11949*/(InterfaceComponent component, InterfaceDefinition iFace,
				  ClientScriptData scriptData, int i) {
		int cursorID = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		int optionID = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		if (optionID >= 1 && optionID <= 10) {
			component.setMenuCursor(optionID - 1, cursorID, (byte) 6);
		}
    }
    
    public static byte[] getMessageData/*method11950*/(CharSequence charsequence, int i) {
		int length = charsequence.length();
		byte[] output = new byte[length];
		for (int index = 0; index < length; index++) {
		    char c = charsequence.charAt(index);
		    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') {
		    	output[index] = (byte) c;
		    } else if (c == '\u20ac') {
		    	output[index] = (byte) -128;
		    } else if ('\u201a' == c) {
		    	output[index] = (byte) -126;
		    } else if ('\u0192' == c) {
		    	output[index] = (byte) -125;
		    } else if (c == '\u201e') {
		    	output[index] = (byte) -124;
		    } else if (c == '\u2026') {
		    	output[index] = (byte) -123;
		    } else if (c == '\u2020') {
		    	output[index] = (byte) -122;
		    } else if (c == '\u2021') {
		    	output[index] = (byte) -121;
		    } else if (c == '\u02c6') {
		    	output[index] = (byte) -120;
		    } else if (c == '\u2030') {
		    	output[index] = (byte) -119;
		    } else if ('\u0160' == c) {
		    	output[index] = (byte) -118;
		    } else if ('\u2039' == c) {
		    	output[index] = (byte) -117;
		    } else if (c == '\u0152') {
		    	output[index] = (byte) -116;
		    } else if ('\u017d' == c) {
		    	output[index] = (byte) -114;
		    } else if (c == '\u2018') {
		    	output[index] = (byte) -111;
		    } else if (c == '\u2019') {
		    	output[index] = (byte) -110;
		    } else if (c == '\u201c') {
		    	output[index] = (byte) -109;
		    } else if (c == '\u201d') {
		    	output[index] = (byte) -108;
		    } else if ('\u2022' == c) {
		    	output[index] = (byte) -107;
		    } else if (c == '\u2013') {
		    	output[index] = (byte) -106;
		    } else if (c == '\u2014') {
		    	output[index] = (byte) -105;
		    } else if ('\u02dc' == c) {
		    	output[index] = (byte) -104;
		    } else if ('\u2122' == c) {
		    	output[index] = (byte) -103;
		    } else if (c == '\u0161') {
		    	output[index] = (byte) -102;
		    } else if (c == '\u203a') {
		    	output[index] = (byte) -101;
		    } else if (c == '\u0153') {
		    	output[index] = (byte) -100;
		    } else if (c == '\u017e') {
		    	output[index] = (byte) -98;
		    } else if ('\u0178' == c) {
		    	output[index] = (byte) -97;
		    } else {
		    	output[index] = (byte) 63;
		    }
		}
		return output;
    }
    
    static final void method11951(ClientScriptData class454, int i) {
	int i_9_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867
		  .method7880(i_9_, 996762312);
    }
    
    static final void method11952(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1;
    }
}
