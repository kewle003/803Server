/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class239
{
    static Class239 aClass239_2758;
    public static Class239 aClass239_2759;
    static Class239 aClass239_2760 = new Class239(0);
    public static Class239 aClass239_2761;
    public static Class239 aClass239_2762 = new Class239(1);
    static Class239 aClass239_2763;
    public static Class239 aClass239_2764;
    static Class239 aClass239_2765;
    static Class239 aClass239_2766;
    int anInt2767;
    public static ClanChannel guestClanChannel;//aClass241_Sub6_2768
    
    static {
	aClass239_2758 = new Class239(2);
	aClass239_2761 = new Class239(3);
	aClass239_2764 = new Class239(4);
	aClass239_2759 = new Class239(5);
	aClass239_2763 = new Class239(6);
	aClass239_2765 = new Class239(7);
	aClass239_2766 = new Class239(8);
    }
    
    Class239(int i) {
	((Class239) this).anInt2767 = i * 1058659401;
    }
    
    static void method4882(InterfaceDefinition class35, InterfaceComponent class58, int i) {
	if (class58 != null) {
	    if (-1 != class58.slot1 * -389932081) {
		InterfaceComponent class58_0_
		    = (class35.components
		       [class58.parentNode * -152977625 & 0xffff]);
		if (null != class58_0_) {
		    if (class58_0_.aClass58Array1000
			== class58_0_.aClass58Array836) {
			class58_0_.aClass58Array1000
			    = new InterfaceComponent[class58_0_.aClass58Array836.length];
			class58_0_.aClass58Array1000[0] = class58;
			Class430.method7707(class58_0_.aClass58Array836, 0,
					    class58_0_.aClass58Array1000, 1,
					    class58.slot1 * -389932081);
			Class430.method7707(class58_0_.aClass58Array836,
					    1 + -389932081 * class58.slot1,
					    class58_0_.aClass58Array1000,
					    1 + -389932081 * class58.slot1,
					    (class58_0_.aClass58Array836.length
					     - class58.slot1 * -389932081
					     - 1));
		    } else {
			int i_1_ = 0;
			InterfaceComponent[] class58s;
			for (class58s = class58_0_.aClass58Array1000;
			     (i_1_ < class58s.length
			      && class58s[i_1_] != class58);
			     i_1_++) {
			    /* empty */
			}
			if (i_1_ < class58s.length) {
			    Class430.method7707(class58s, 0, class58s, 1,
						i_1_);
			    class58s[0] = class58;
			}
		    }
		}
	    } else {
		InterfaceComponent[] class58s = class35.method1000(269130669);
		int i_2_;
		for (i_2_ = 0;
		     i_2_ < class58s.length && class58s[i_2_] != class58;
		     i_2_++) {
		    /* empty */
		}
		if (i_2_ < class58s.length) {
		    Class430.method7707(class58s, 0, class58s, 1, i_2_);
		    class58s[0] = class58;
		}
	    }
	}
    }
    
    static final void method4883(ClientScriptData class454, int i) {
	Class597.method13113(140428066);
    }
    
    static final void method4884(ClientScriptData class454, byte i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886
		  .method7880(i_3_, 996762312);
    }
    
    static final void method4885(ClientScriptData class454, int i) {
		((ClientScriptData) class454).integerStack[(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
			= 1043710575 * client.systemUpdateTimer;
    }
}
