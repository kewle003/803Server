/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class224 implements Interface34
{
    Class225 this$0;
    
    public void method190() {
	((Class224) this).this$0.method4530(true, -2027950575);
    }
    
    public void method191(int i) {
	((Class224) this).this$0.method4530(true, -510711605);
    }
    
    Class224(Class225 class225) {
	((Class224) this).this$0 = class225;
    }
    
    public void method28() {
	((Class224) this).this$0.method4530(true, -180291135);
    }
    
    static final void method4494(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -49);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	Class527.method11823(class58, class35, class454, (byte) 97);
    }
    
    static final void method4495(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 439139681 * class58.anInt850;
    }
    
    static final void method4496(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class568.method12477(i_1_, i_2_, false, 223033254);
    }
    
    static final void method4497(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
    }
    
    public static byte[] method4498(String string, int i) {
	int i_3_ = string.length();
	if (0 == i_3_)
	    return new byte[0];
	int i_4_ = i_3_ + 3 & ~0x3;
	int i_5_ = i_4_ / 4 * 3;
	if (i_4_ - 2 >= i_3_ || Class576.method12669(string.charAt(i_4_ - 2),
						     -1786072826) == -1)
	    i_5_ -= 2;
	else if (i_4_ - 1 >= i_3_
		 || (Class576.method12669(string.charAt(i_4_ - 1), 2127344815)
		     == -1))
	    i_5_--;
	byte[] is = new byte[i_5_];
	Class465.method10715(string, is, 0, 414229387);
	return is;
    }
    
    static void method4499(InterfaceComponent[] class58s, InterfaceComponent class58, boolean bool,
			   byte i) {
	int i_6_
	    = (1257300791 * class58.scrollMaxX != 0
	       ? 1257300791 * class58.scrollMaxX : 439139681 * class58.anInt850);
	int i_7_ = (class58.scrollMaxY * 1204737107 != 0
		    ? 1204737107 * class58.scrollMaxY
		    : class58.scrollMinY * 1463495207);
	Class164.method3537(class58s, class58.componentHash * 445907013, i_6_, i_7_,
			    bool, -1362176803);
	if (class58.aClass58Array1000 != null)
	    Class164.method3537(class58.aClass58Array1000,
				class58.componentHash * 445907013, i_6_, i_7_, bool,
				-1190535891);
	Class241_Sub11 class241_sub11
	    = ((Class241_Sub11)
	       client.aClass407_8467.get((long) (class58.componentHash
							* 445907013)));
	if (class241_sub11 != null)
	    Class195.method3998(-443552671 * class241_sub11.interfaceID, i_6_,
				i_7_, bool, 925306881);
	if (client.aClass58_8474 == class58) {
	    int i_8_ = 794073197 * GPI.viewportPlayerCount;
	    int[] is = GPI.viewportPlayerIndicies;
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
		Player class475_sub1_sub1_sub3_sub1
		    = client.localPlayers[is[i_9_]];
		if (class475_sub1_sub1_sub3_sub1 != null)
		    class475_sub1_sub1_sub3_sub1.method17831(i_6_, i_7_, bool,
							     1482319719);
	    }
	    for (int i_10_ = 0; i_10_ < client.localNpcCount * -1837469873;
		 i_10_++) {
		int i_11_ = client.localNpcIndicies[i_10_];
		ObjectNode class241_sub26
		    = ((ObjectNode)
		       client.aClass407_8457.get((long) i_11_));
		if (class241_sub26 != null)
		    ((Entity) class241_sub26.objectValue)
			.method17831(i_6_, i_7_, bool, 1482319719);
	    }
	}
    }
    
    static final void method4500(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_12_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_13_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_12_ | 1 << i_13_;
    }
    
    static final void method4501(ClientScriptData class454, int i) {
	boolean bool
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       != 0);
	if (null != Class21.myPlayer.aClass490_11499)
	    Class21.myPlayer.aClass490_11499
		.method11204(bool, 1260718006);
    }
}
