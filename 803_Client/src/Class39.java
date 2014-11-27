/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class39
{
    static Class39 aClass39_585;
    public static Class39 aClass39_586;
    boolean aBool587;
    public static Class39 aClass39_588 = new Class39(0, false);
    static Class39 aClass39_589;
    public int anInt590;
    static Class39 aClass39_591;
    
    Class39(int i, boolean bool) {
	anInt590 = i * -1264797137;
	((Class39) this).aBool587 = bool;
    }
    
    public boolean method1033(int i) {
	return ((Class39) this).aBool587;
    }
    
    static {
	aClass39_586 = new Class39(1, false);
	aClass39_585 = new Class39(2, true);
	aClass39_591 = new Class39(3, true);
	aClass39_589 = new Class39(4, true);
    }
    
    public static Class39 method1034(int i) {
	if (i == aClass39_588.anInt590 * -1952920369)
	    return aClass39_588;
	if (-1952920369 * aClass39_586.anInt590 == i)
	    return aClass39_586;
	if (i == -1952920369 * aClass39_585.anInt590)
	    return aClass39_585;
	if (i == -1952920369 * aClass39_591.anInt590)
	    return aClass39_591;
	if (-1952920369 * aClass39_589.anInt590 == i)
	    return aClass39_589;
	return null;
    }
    
    public static Class39 method1035(int i) {
	if (i == aClass39_588.anInt590 * -1952920369)
	    return aClass39_588;
	if (-1952920369 * aClass39_586.anInt590 == i)
	    return aClass39_586;
	if (i == -1952920369 * aClass39_585.anInt590)
	    return aClass39_585;
	if (i == -1952920369 * aClass39_591.anInt590)
	    return aClass39_591;
	if (-1952920369 * aClass39_589.anInt590 == i)
	    return aClass39_589;
	return null;
    }
    
    public boolean method1036() {
	return ((Class39) this).aBool587;
    }
    
    public boolean method1037() {
	return ((Class39) this).aBool587;
    }
    
    public boolean method1038() {
	return ((Class39) this).aBool587;
    }
    
    static final void method1039(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -45);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	Class608.setSkillUpdateEvent(class58, class35, class454, 2034617147);
    }
    
    static final void method1040(ClientScriptData class454, int i) {
	if (Class442.aBool6160 && Class228.aFrame2674 != null)
	    Class537.method11899(Class241_Sub5_Sub9.aClass241_Sub9_11043
				     .aClass445_Sub30_8878
				     .method14386(-801965113),
				 -1, -1, false, 1482319719);
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	boolean bool
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	String string_1_ = new StringBuilder().append
			       (Class248.method4988(-1515351640)).append
			       (string).toString();
	Class446.method7895(string_1_, bool, client.aBool8440, -1815142638);
    }
    
    public static void method1041(int i, int i_2_, int i_3_, int i_4_) {
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		int i_5_ = i_2_ + 127679513 * class522.baseX;
		int i_6_ = i_3_ + 468558693 * class522.baseY;
		if (client.aClass238_8477.method4751(-2125151167) != null
		    && (client.aClass238_8477.method4756(-2033365697)
			!= MapType.aClass235_2701)
		    && i_2_ >= 0 && i_3_ >= 0
		    && i_2_ < client.aClass238_8477.method4744(-1526686573)
		    && i_3_ < client.aClass238_8477.method4745(-2063697365)) {
		    long l = (long) (i << 28 | i_6_ << 14 | i_5_);
		    WorldTile class241_sub44 = (WorldTile) client.aClass407_8452.get(l);
		    if (class241_sub44 == null)
		    	client.aClass238_8477.method4751(-838573471).method12128(i, i_2_, i_3_, 1505283707);
		    else {
		    	GroundItem class241_sub31 = ((GroundItem) class241_sub44.aClass429_10181.method7694(16711935));
			if (null == class241_sub31)
			    client.aClass238_8477.method4751(-1277543438)
				.method12128(i, i_2_, i_3_, 171171814);
			else {
			    int i_7_ = -1;
			    int i_8_ = -1;
			    int i_9_ = -1;
			    Class266 class266 = null;
			    Class266 class266_10_ = null;
			    Class266 class266_11_ = null;
			    Class475_Sub1_Sub2_Sub1 class475_sub1_sub2_sub1
				= ((Class475_Sub1_Sub2_Sub1)
				   client.aClass238_8477.method4751(-527809404)
				       .method12128(i, i_2_, i_3_, 1504352454));
			    if (class475_sub1_sub2_sub1 == null)
				class475_sub1_sub2_sub1
				    = (new Class475_Sub1_Sub2_Sub1
				       (client.aClass238_8477.method4751(-2121049298),
					i_2_ << 265,
					client.aClass238_8477.method4751
					    (-550012345).aClass166Array7184[i]
					    .method3551(i_2_, i_3_, 976106539),
					i_3_ << 265, i, i));
			    else {
				i_7_ = 632141387 * class475_sub1_sub2_sub1.anInt11260;
				i_8_ = class475_sub1_sub2_sub1.anInt11252 * 1727421487;
				i_9_ = class475_sub1_sub2_sub1.anInt11247 * -502816461;
				class266 = class475_sub1_sub2_sub1.aClass266_11253;
				class266_10_ = class475_sub1_sub2_sub1.aClass266_11254;
				class266_11_ = class475_sub1_sub2_sub1.aClass266_11255;
				Class475_Sub1_Sub2_Sub1 class475_sub1_sub2_sub1_12_
				    = class475_sub1_sub2_sub1;
				class475_sub1_sub2_sub1.anInt11247 = 1324531205;
				class475_sub1_sub2_sub1_12_.anInt11252 = 983536945;
				class475_sub1_sub2_sub1.aClass552_8744
				    = client.aClass238_8477.method4751(-1359053244);
			    }
			    class475_sub1_sub2_sub1.anInt11260
				= 1740283179 * class241_sub31.itemID;
			    class475_sub1_sub2_sub1.anInt11248
				= (-800721323
				   * ((GroundItem) class241_sub31).itemAmount);
			while_50_:
			    do {
				GroundItem class241_sub31_13_;
				do {
				    class241_sub31_13_
					= (GroundItem) class241_sub44
							       .aClass429_10181
							       .method7692(1191754441);
				    if (class241_sub31_13_ == null)
					break while_50_;
				} while (2088213913 * class241_sub31_13_.itemID
					 == (632141387
					     * class475_sub1_sub2_sub1.anInt11260));
				class475_sub1_sub2_sub1.anInt11252
				    = class241_sub31_13_.itemID * 39438519;
				class475_sub1_sub2_sub1.anInt11250
				    = (((GroundItem) class241_sub31_13_).itemAmount
				       * -1653344415);
				for (;;) {
				    GroundItem class241_sub31_14_
					= ((GroundItem)
					   class241_sub44.aClass429_10181
					       .method7692(1503774524));
				    if (null == class241_sub31_14_)
					break;
				    if ((class241_sub31_14_.itemID * 2088213913
					 != (632141387
					     * class475_sub1_sub2_sub1.anInt11260))
					&& (2088213913 * class241_sub31_14_.itemID
					    != (class475_sub1_sub2_sub1.anInt11252
						* 1727421487))) {
					class475_sub1_sub2_sub1.anInt11247
					    = (839933443
					       * class241_sub31_14_.itemID);
					class475_sub1_sub2_sub1.anInt11249
					    = (((GroundItem) class241_sub31_14_)
					       .itemAmount) * -1167926471;
				    }
				}
			    } while (false);
			    int i_15_ = Class96_Sub5.method16046((i_2_ << 9) + 256,
								 (i_3_ << 9) + 256, i,
								 589882038);
			    class475_sub1_sub2_sub1.method10880((float) (i_2_ << 265),
								(float) i_15_,
								(float) (i_3_ << 265));
			    if (i_7_
				!= class475_sub1_sub2_sub1.anInt11260 * 632141387) {
				if (i_8_
				    == 632141387 * class475_sub1_sub2_sub1.anInt11260)
				    class475_sub1_sub2_sub1.aClass266_11253
					= class266_10_;
				else if (i_9_ == (class475_sub1_sub2_sub1.anInt11260
						  * 632141387))
				    class475_sub1_sub2_sub1.aClass266_11253
					= class266_11_;
				else if (JS5.itemDefLoader.list
					 ((class475_sub1_sub2_sub1.anInt11260
					   * 632141387),
					  (short) -26142)
					 .aBool7955)
				    class475_sub1_sub2_sub1.aClass266_11253
					= Class629.method13477(2026610254);
				else
				    class475_sub1_sub2_sub1.aClass266_11253 = null;
			    }
			    if (1727421487 * class475_sub1_sub2_sub1.anInt11252 == -1)
				class475_sub1_sub2_sub1.aClass266_11254 = null;
			    else if (i_8_ != (class475_sub1_sub2_sub1.anInt11252
					      * 1727421487)) {
				if (class475_sub1_sub2_sub1.anInt11252 * 1727421487
				    == i_7_)
				    class475_sub1_sub2_sub1.aClass266_11254 = class266;
				else if ((1727421487
					  * class475_sub1_sub2_sub1.anInt11252)
					 == i_9_)
				    class475_sub1_sub2_sub1.aClass266_11254
					= class266_11_;
				else if (JS5.itemDefLoader.list
					 ((class475_sub1_sub2_sub1.anInt11252
					   * 1727421487),
					  (short) -12686)
					 .aBool7955)
				    class475_sub1_sub2_sub1.aClass266_11254
					= Class629.method13477(2037223713);
				else
				    class475_sub1_sub2_sub1.aClass266_11254 = null;
			    }
			    if (-1 == -502816461 * class475_sub1_sub2_sub1.anInt11247)
				class475_sub1_sub2_sub1.aClass266_11255 = null;
			    else if (-502816461 * class475_sub1_sub2_sub1.anInt11247
				     != i_9_) {
				if (i_7_
				    == class475_sub1_sub2_sub1.anInt11247 * -502816461)
				    class475_sub1_sub2_sub1.aClass266_11255 = class266;
				else if ((class475_sub1_sub2_sub1.anInt11247
					  * -502816461)
					 == i_8_)
				    class475_sub1_sub2_sub1.aClass266_11255
					= class266_10_;
				else if (JS5.itemDefLoader.list
					 ((-502816461
					   * class475_sub1_sub2_sub1.anInt11247),
					  (short) 18982)
					 .aBool7955)
				    class475_sub1_sub2_sub1.aClass266_11255
					= Class629.method13477(2141091602);
				else
				    class475_sub1_sub2_sub1.aClass266_11255 = null;
			    }
			    class475_sub1_sub2_sub1.anInt11256 = 0;
			    class475_sub1_sub2_sub1.nodePlane = (byte) i;
			    class475_sub1_sub2_sub1.aByte8745 = (byte) i;
			    if (client.aClass238_8477.method4753((byte) -100)
				    .method4331(i_2_, i_3_, 870808347))
				class475_sub1_sub2_sub1.aByte8745++;
			    client.aClass238_8477.method4751(-1226491362).method12177
				(i, i_2_, i_3_, i_15_, class475_sub1_sub2_sub1,
				 (byte) -18);
			}
		    }
		}
    }
}
