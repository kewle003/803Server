/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class127
{
    static Class127 aClass127_1583;
    public static Class127 aClass127_1584 = new Class127();
    static Class127 aClass127_1585;
    static Class127 aClass127_1586 = new Class127();
    public static Class127 aClass127_1587;
    
    Class127() {
	/* empty */
    }
    
    static {
	aClass127_1585 = new Class127();
	aClass127_1583 = new Class127();
	aClass127_1587 = new Class127();
    }
    
    static final void method3012(ClientScriptData class454, int i) {
	long l
	    = (((ClientScriptData) class454).longStack
	       [(((ClientScriptData) class454).anInt6231 -= 710535117) * -735224571]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = -1L == l ? "" : Long.toString(l, 36).toUpperCase();
    }
    
    static final void method3013(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	boolean bool = ((((ClientScriptData) class454).integerStack
			 [1482319719 * ((ClientScriptData) class454).intStackPointer])
			== 1);
	boolean bool_0_
	    = 1 == (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class445_Sub16.aClass351_Sub1_8660.method6274(bool, bool_0_,
						      -906604932);
    }
    
    static final void method3014(ClientScriptData class454, int i) {
	if (client.currentFriendsChatName != null)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= Class47.method1134(client.currentFriendsChatName, (byte) 1);
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
    }
}
