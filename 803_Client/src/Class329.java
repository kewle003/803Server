/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class329
{
    public static Class329 aClass329_5031 = new Class329();
    public static Class329 aClass329_5032 = new Class329();
    
    Class329() {
	/* empty */
    }
    
    static final void method6027(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	Class241_Sub39_Sub14 class241_sub39_sub14
	    = Class123.aClass292_1579.method5686(i_0_, (byte) 76);
	int i_2_ = class241_sub39_sub14.anIntArray10967[i_1_];
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_2_;
    }
    
    static final void method6028(ClientScriptData class454, int i) {
	Class322.method5951((((ClientScriptData) class454)
			     .aClass475_Sub1_Sub2_Sub1_6223),
			    class454, (byte) 14);
    }
    
    static void method6029(int i, int i_3_, int i_4_, int i_5_, int i_6_,
			   int i_7_, int i_8_, int i_9_, int i_10_, int i_11_,
			   int i_12_, int i_13_, int i_14_, int i_15_,
			   boolean bool, int i_16_, short i_17_) {
	if (0 != i_3_ && i_5_ != -1) {
	    Entity class475_sub1_sub1_sub3 = null;
	    if (i_3_ < 0) {
		int i_18_ = -i_3_ - 1;
		if (i_18_ == 1124115145 * client.myPlayerIndex)
		    class475_sub1_sub1_sub3
			= Class21.myPlayer;
		else
		    class475_sub1_sub1_sub3
			= client.localPlayers[i_18_];
	    } else {
		int i_19_ = i_3_ - 1;
		ObjectNode class241_sub26
		    = ((ObjectNode)
		       client.aClass407_8457.get((long) i_19_));
		if (null != class241_sub26)
		    class475_sub1_sub1_sub3 = ((Entity)
					       class241_sub26.objectValue);
	    }
	    if (class475_sub1_sub1_sub3 != null) {
		Class554 class554
		    = class475_sub1_sub1_sub3.method17787(268037353);
		if (null != class554.anIntArrayArray7231
		    && null != class554.anIntArrayArray7231[i_5_])
		    i_6_ -= class554.anIntArrayArray7231[i_5_][1];
		if (class554.anIntArrayArray7203 != null
		    && null != class554.anIntArrayArray7203[i_5_])
		    i_6_ -= class554.anIntArrayArray7203[i_5_][1];
	    }
	}
	Projectile class475_sub1_sub1_sub4
	    = new Projectile(client.aClass238_8477
					      .method4751(-1694775533),
					  i, Class323.basePlane * 1061320561,
					  1061320561 * Class323.basePlane,
					  i_8_, i_9_, i_6_,
					  i_12_ + client.anInt8296,
					  i_13_ + client.anInt8296, i_14_,
					  i_15_, i_3_, i_4_, i_7_, bool, i_5_,
					  i_16_);
	class475_sub1_sub1_sub4.method17887
	    (i_10_, i_11_,
	     Class96_Sub5.method16046(i_10_, i_11_,
				      Class323.basePlane * 1061320561,
				      2115103667) - i_7_,
	     i_12_ + client.anInt8296, 2111341463);
	client.aClass429_8478.addNode
	    (new Class241_Sub39_Sub16(class475_sub1_sub1_sub4),
	     (short) -26110);
    }
}
