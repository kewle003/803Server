/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class228
{
    public static Class228 aClass228_2670;
    public static Class228 aClass228_2671;
    static Class228 aClass228_2672 = new Class228();
    static Class228 aClass228_2673;
    public static Frame aFrame2674;
    
    static {
	aClass228_2671 = new Class228();
	aClass228_2670 = new Class228();
	aClass228_2673 = new Class228();
    }
    
    Class228() {
	/* empty */
    }
    
    static final void method4656(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class573_Sub1.aBool8786 ? 1 : 0;
    }
    
    static final void method4657(ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (string.startsWith(Class475_Sub1_Sub5_Sub1.method17724(0,
								  1552509438))
	    || string.startsWith(Class475_Sub1_Sub5_Sub1
				     .method17724(1, 474543200)))
	    string = string.substring(7);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class443.isFriend(string, (byte) 64) ? 1 : 0;
    }
    
    static final void method4658(ClientScriptData class454, byte i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -127);
	Class561.method12367(class58, class454, 397086362);
    }
}
