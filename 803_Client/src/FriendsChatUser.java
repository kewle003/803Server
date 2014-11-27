/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class FriendsChatUser
{
    String protocolName;//aString2375
    public String displayName;//aString2376
    public int nodeID;//anInt2377
    public String worldName;//aString2378
    public String replyToName;//aString2379
    public byte rank;//aByte2380
    
    FriendsChatUser() {
	/* empty */
    }
    
    static final void method4023(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = Class372.method6659((byte) -68);
	if (class241_sub39_sub12 != null) {
	    boolean bool
		= class241_sub39_sub12.method17257(i_0_ >> 28 & 0x3,
						   i_0_ >> 14 & 0x3fff,
						   i_0_ & 0x3fff,
						   Class450.anIntArray6199,
						   1785834373);
	    if (bool) {
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = Class450.anIntArray6199[1];
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = Class450.anIntArray6199[2];
	    } else {
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = -1;
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = -1;
	    }
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	}
    }
    
    static final void method4024(ClientScriptData class454, byte i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -124);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
	WorldType.method10547(class58, class35, class454, (byte) 96);
    }
}
