/* Exception_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub5 extends Exception
{
    static ServerConnection aClass190_10704;
    public static Class168 aClass168_10705;
    
    Exception_Sub5() {
	/* empty */
    }
    
    static final void saveObjectValue/*method16954*/(ClientScriptData scriptData, byte i) {
		scriptData.objectValues[scriptData.integerConstants[scriptData.step * 1938982693]]
			= scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331];
    }
    
    static Class241_Sub39_Sub13 method16955(int i) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = ((Class241_Sub39_Sub13)
	       Class241_Sub39_Sub13.aClass410_10958.method7440(-1397088259));
	if (null != class241_sub39_sub13) {
	    class241_sub39_sub13.remove((byte) 36);
	    class241_sub39_sub13.method16441((byte) 2);
	    return class241_sub39_sub13;
	}
	for (;;) {
	    class241_sub39_sub13
		= (Class241_Sub39_Sub13) Class241_Sub39_Sub13
					     .aClass410_10959
					     .method7440(-1397088259);
	    if (null == class241_sub39_sub13)
		return null;
	    if (class241_sub39_sub13.method17353(1118274258)
		> Class50.method1249((byte) 1))
		return null;
	    class241_sub39_sub13.remove((byte) 36);
	    class241_sub39_sub13.method16441((byte) 2);
	    if (0L != (class241_sub39_sub13.aLong10147 * 251842045416236843L
		       & ~0x7fffffffffffffffL))
		return class241_sub39_sub13;
	}
    }
}
