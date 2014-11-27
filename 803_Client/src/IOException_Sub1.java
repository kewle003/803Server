/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class IOException_Sub1 extends IOException
{
    IOException_Sub1(String string) {
	super(string);
    }
    
    static final void method17928(ClientScriptData class454, int i) {
	boolean bool = false;
	if (client.aBool8267) {
	    try {
		Object object
		    = (JSFunction.aClass348_5368.method6209
		       ((new Object[]
			 { Integer.valueOf(Class203.anInt2425 * 1489471497),
			   Boolean.valueOf((Class21
					    .myPlayer
					    .gender) == 1),
			   Integer.valueOf(((ClientScriptData) class454).integerStack
					   [(((ClientScriptData) class454).intStackPointer
					     -= 1736754263) * 1482319719]) }),
			-976134809));
		if (object != null)
		    bool = ((Boolean) object).booleanValue();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = bool ? 1 : 0;
    }
}
