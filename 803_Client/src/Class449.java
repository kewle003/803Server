/* Class449 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class449
{
    int anInt6193;
    GameScene aClass522_6194;
    int anInt6195;
    
    int method7925(byte i) {
	return client.anIntArray8351[1745492321 * ((Class449) this).anInt6193];
    }
    
    public Interface24 method7926() {
	Interface24 interface24 = method7927(-296841552);
	if (interface24 == null)
	    return null;
	if (interface24.method146((byte) 0)
	    != ((Class449) this).anInt6195 * 1855103841)
	    return null;
	return interface24;
    }
    
    Interface24 method7927(int i) {
	int i_0_ = 635486009 * ((Class449) this).aClass522_6194.anInt6807;
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	int i_1_ = (127679513 * ((Class449) this).aClass522_6194.baseX
		    - 127679513 * class522.baseX);
	int i_2_ = (((Class449) this).aClass522_6194.baseY * 468558693
		    - class522.baseY * 468558693);
	if (i_1_ < 0 || i_2_ < 0
	    || i_1_ >= client.aClass238_8477.method4744(-1865559436)
	    || i_2_ >= client.aClass238_8477.method4745(1158919751)
	    || client.aClass238_8477.method4751(-1740501708) == null)
	    return null;
	switch (method7925((byte) 57)) {
	case 3:
	    return ((Interface24)
		    client.aClass238_8477.method4751(-1767690864)
			.method12100(i_0_, i_1_, i_2_, 1733029615));
	default:
	    return null;
	case 0:
	    return (Interface24) client.aClass238_8477.method4751
				     (-1346455870)
				     .method12132(i_0_, i_1_, i_2_, (byte) 7);
	case 1:
	    return ((Interface24)
		    client.aClass238_8477.method4751(-607795385)
			.method12162(i_0_, i_1_, i_2_, 1767652709));
	case 2:
	    return ((Interface24)
		    (client.aClass238_8477.method4751(-1910028932).method12136
		     (i_0_, i_1_, i_2_, client.anInterface57_8577,
		      -1606433200)));
	}
    }
    
    Interface24 method7928() {
	int i = 635486009 * ((Class449) this).aClass522_6194.anInt6807;
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	int i_3_ = (127679513 * ((Class449) this).aClass522_6194.baseX
		    - 127679513 * class522.baseX);
	int i_4_ = (((Class449) this).aClass522_6194.baseY * 468558693
		    - class522.baseY * 468558693);
	if (i_3_ < 0 || i_4_ < 0
	    || i_3_ >= client.aClass238_8477.method4744(-1428174128)
	    || i_4_ >= client.aClass238_8477.method4745(539238664)
	    || client.aClass238_8477.method4751(-1136760954) == null)
	    return null;
	switch (method7925((byte) 81)) {
	case 3:
	    return (Interface24) client.aClass238_8477.method4751
				     (-1477290140)
				     .method12100(i, i_3_, i_4_, 2135212951);
	default:
	    return null;
	case 0:
	    return (Interface24) client.aClass238_8477.method4751
				     (-1915316412)
				     .method12132(i, i_3_, i_4_, (byte) 7);
	case 1:
	    return (Interface24) client.aClass238_8477.method4751
				     (-885436127)
				     .method12162(i, i_3_, i_4_, 1234141924);
	case 2:
	    return ((Interface24)
		    (client.aClass238_8477.method4751(-1108833827).method12136
		     (i, i_3_, i_4_, client.anInterface57_8577, 327850971)));
	}
    }
    
    int method7929() {
	return client.anIntArray8351[1745492321 * ((Class449) this).anInt6193];
    }
    
    int method7930() {
	return client.anIntArray8351[1745492321 * ((Class449) this).anInt6193];
    }
    
    public Interface24 method7931() {
	Interface24 interface24 = method7927(8763436);
	if (interface24 == null)
	    return null;
	if (interface24.method146((byte) 0)
	    != ((Class449) this).anInt6195 * 1855103841)
	    return null;
	return interface24;
    }
    
    public Interface24 method7932(int i) {
	Interface24 interface24 = method7927(-1526051619);
	if (interface24 == null)
	    return null;
	if (interface24.method146((byte) 0)
	    != ((Class449) this).anInt6195 * 1855103841)
	    return null;
	return interface24;
    }
    
    public Interface24 method7933() {
	Interface24 interface24 = method7927(680267674);
	if (interface24 == null)
	    return null;
	if (interface24.method146((byte) 0)
	    != ((Class449) this).anInt6195 * 1855103841)
	    return null;
	return interface24;
    }
    
    public Class449(GameScene class522, int i, int i_5_, int i_6_) {
	((Class449) this).aClass522_6194 = class522;
	((Class449) this).anInt6193 = -1202697567 * i;
	((Class449) this).anInt6195 = -1571864415 * i_6_;
    }
    
    static final void method7934(boolean bool, ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	if (bool)
	    WorldTile.method16487(class35, class58, 1591999643);
	else
	    Class239.method4882(class35, class58, -454390035);
    }
    
    static final void method7935(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub6_8889
		  .method14143(1933300569);
    }
    
    static boolean method7936(Class103 class103, Class241_Sub41 class241_sub41,
			      Class515 class515, int i, int i_7_, byte i_8_) {
	if (Class573_Sub1.aBool7432 && !client.isP2pWorld
	    && !Class573_Sub1.method12625((class241_sub41.anInt10154
					   * 669485685),
					  (class241_sub41.anInt10152
					   * -1535798317)))
	    return false;
	int i_9_ = 2147483647;
	int i_10_ = -2147483648;
	int i_11_ = 2147483647;
	int i_12_ = -2147483648;
	if (null != class515.anIntArray6737) {
	    i_9_ = (((-1967356869 * class515.anInt6757
		      + class241_sub41.anInt10154 * 669485685
		      - Class573_Sub1.anInt7426)
		     * (Class573_Sub1.anInt7395 - Class573_Sub1.anInt7430)
		     / (Class573_Sub1.anInt7428 - Class573_Sub1.anInt7426))
		    + Class573_Sub1.anInt7430);
	    i_10_
		= (Class573_Sub1.anInt7430
		   + ((Class573_Sub1.anInt7395 - Class573_Sub1.anInt7430)
		      * (669485685 * class241_sub41.anInt10154
			 + class515.anInt6759 * 1389678465
			 - Class573_Sub1.anInt7426)
		      / (Class573_Sub1.anInt7428 - Class573_Sub1.anInt7426)));
	    i_12_
		= (Class573_Sub1.anInt7425
		   - ((class241_sub41.anInt10152 * -1535798317
		       + class515.anInt6742 * -1576680733
		       - Class573_Sub1.anInt7429)
		      * (Class573_Sub1.anInt7425 - Class573_Sub1.anInt7431)
		      / (Class573_Sub1.anInt7427 - Class573_Sub1.anInt7429)));
	    i_11_
		= (Class573_Sub1.anInt7425
		   - ((-1535798317 * class241_sub41.anInt10152
		       + -1423735679 * class515.anInt6747
		       - Class573_Sub1.anInt7429)
		      * (Class573_Sub1.anInt7425 - Class573_Sub1.anInt7431)
		      / (Class573_Sub1.anInt7427 - Class573_Sub1.anInt7429)));
	}
	Class168 class168 = null;
	int i_13_ = 0;
	int i_14_ = 0;
	int i_15_ = 0;
	int i_16_ = 0;
	if (-705700883 * class515.anInt6772 != -1) {
	    if (class241_sub41.aBool10155
		&& 926228791 * class515.anInt6733 != -1)
		class168 = class515.method11579(class103, true, (byte) 2);
	    else
		class168 = class515.method11579(class103, false, (byte) 2);
	    if (null != class168) {
		i_13_ = (843218033 * class241_sub41.anInt10156
			 - (class168.method64() + 1 >> 1));
		if (i_13_ < i_9_)
		    i_9_ = i_13_;
		i_14_ = (843218033 * class241_sub41.anInt10156
			 + (class168.method64() + 1 >> 1));
		if (i_14_ > i_10_)
		    i_10_ = i_14_;
		i_15_ = (class241_sub41.anInt10157 * -464680849
			 - class168.method3616());
		if (i_15_ < i_11_)
		    i_11_ = i_15_;
		i_16_ = -464680849 * class241_sub41.anInt10157;
		if (i_16_ > i_12_)
		    i_12_ = i_16_;
	    }
	}
	Class168 class168_17_ = null;
	if (-337524425 * class515.anInt6748 != -1)
	    class168_17_ = class515.method11583(class103, 1745027244);
	int i_18_ = 0;
	int i_19_ = 0;
	int i_20_ = 0;
	int i_21_ = 0;
	int i_22_ = 0;
	int i_23_ = 0;
	int i_24_ = 0;
	int i_25_ = 0;
	if (class515.aString6756 != null) {
	    Class506.method11489(723243945 * class515.anInt6760, (byte) -78);
	    if (null != Class355.aClass96_5452) {
		i_25_
		    = Class40.aClass639_594.method13596(class515.aString6756,
							(-1080559003
							 * Class494.canvasWid),
							0, null, -834868232);
		i_20_ = Class40.aClass639_594.method13567(class515.aString6756,
							  (Class494.canvasWid
							   * -1080559003),
							  null, 1869637061);
		i_18_ = (843218033 * class241_sub41.anInt10156 - i_20_ / 2
			 + ((Class573_Sub1.anInt7395 - Class573_Sub1.anInt7430)
			    * (-637021619 * class515.anInt6765)
			    / (Class573_Sub1.anInt7428
			       - Class573_Sub1.anInt7426)));
		i_19_
		    = (-464680849 * class241_sub41.anInt10157
		       - (1094805451 * class515.anInt6766
			  * (Class573_Sub1.anInt7425 - Class573_Sub1.anInt7431)
			  / (Class573_Sub1.anInt7427
			     - Class573_Sub1.anInt7429)));
		if (null == class168)
		    i_19_ -= i_25_ / 2;
		else
		    i_19_ -= (class168.method3616() >> 1) + i_25_;
		i_21_ = i + i_18_;
		if (i_21_ < i_9_)
		    i_9_ = i_21_;
		i_22_ = i + (i_20_ + i_18_);
		if (i_22_ > i_10_)
		    i_10_ = i_22_;
		i_23_ = i_7_ + i_19_;
		if (i_23_ < i_11_)
		    i_11_ = i_23_;
		i_24_ = i_25_ + i_19_ + i_7_;
		if (i_24_ > i_12_)
		    i_12_ = i_24_;
	    }
	}
	if (i_10_ < Class573_Sub1.anInt7430 || i_9_ > Class573_Sub1.anInt7395
	    || i_12_ < Class573_Sub1.anInt7431
	    || i_11_ > Class573_Sub1.anInt7425)
	    return true;
	Class573_Sub1.method12580(class103, class241_sub41, class515);
	if (class168 != null) {
	    Class2 class2
		= (Class2) (Class573_Sub1.aHashMap8781.get
			    (Integer.valueOf(class241_sub41.anInt10158
					     * -1454932011)));
	    if (null == class2)
		class2 = (Class2) (Class573_Sub1.aHashMap8766.get
				   (Integer.valueOf(-1123109927
						    * class515.anInt6770)));
	    if (class2 != null && class515.anInt6748 * -337524425 == -1) {
		int i_26_;
		if (((Class2) class2).anInt13 * -1866104785
		    > 881484909 * Class573_Sub1.anInt8785 / 2)
		    i_26_ = ((Class573_Sub1.anInt8785 * 1440352403
			      - ((Class2) class2).anInt13 * 884649681)
			     / (Class573_Sub1.anInt8785 * 881484909));
		else
		    i_26_ = (884649681 * ((Class2) class2).anInt13
			     / (881484909 * Class573_Sub1.anInt8785));
		int i_27_ = i_26_ << 24 | 0xffff00;
		if (class103 instanceof Class103_Sub3) {
		    class103.method2263((843218033 * class241_sub41.anInt10156
					 - class168.method3631() / 2 - 7),
					(-464680849 * class241_sub41.anInt10157
					 - class168.method3631() - 7),
					class168.method3631() + 14,
					class168.method3631() + 14, i_27_,
					(byte) -72);
		    class103.method2263((class241_sub41.anInt10156 * 843218033
					 - class168.method3631() / 2 - 5),
					(class241_sub41.anInt10157 * -464680849
					 - class168.method3631() - 5),
					class168.method3631() + 10,
					class168.method3631() + 10, i_27_,
					(byte) -69);
		    class103.method2263((class241_sub41.anInt10156 * 843218033
					 - class168.method3631() / 2 - 3),
					(class241_sub41.anInt10157 * -464680849
					 - class168.method3631() - 3),
					class168.method3631() + 6,
					class168.method3631() + 6, i_27_,
					(byte) -104);
		    class103.method2263((843218033 * class241_sub41.anInt10156
					 - class168.method3631() / 2 - 1),
					(-464680849 * class241_sub41.anInt10157
					 - class168.method3631() - 1),
					class168.method3631() + 2,
					class168.method3631() + 2, i_27_,
					(byte) -25);
		    class103.method2263((843218033 * class241_sub41.anInt10156
					 - class168.method3631() / 2),
					(-464680849 * class241_sub41.anInt10157
					 - class168.method3631()),
					class168.method3631(),
					class168.method3631(), i_27_,
					(byte) -125);
		} else {
		    class103.method2264(class241_sub41.anInt10156 * 843218033,
					(class241_sub41.anInt10157 * -464680849
					 - (class168.method3631() + 1) / 2),
					class168.method3631() / 2 + 7, i_27_,
					(byte) 0);
		    class103.method2264(843218033 * class241_sub41.anInt10156,
					(-464680849 * class241_sub41.anInt10157
					 - (class168.method3631() + 1) / 2
					 - 1),
					class168.method3631() / 2 + 5, i_27_,
					(byte) 0);
		    class103.method2264(843218033 * class241_sub41.anInt10156,
					(class241_sub41.anInt10157 * -464680849
					 - (class168.method3631() + 1) / 2
					 - 1),
					class168.method3631() / 2 + 3, i_27_,
					(byte) 0);
		    class103.method2264(class241_sub41.anInt10156 * 843218033,
					(class241_sub41.anInt10157 * -464680849
					 - (class168.method3631() + 1) / 2
					 - 1),
					class168.method3631() / 2 + 1, i_27_,
					(byte) 0);
		    class103.method2264(843218033 * class241_sub41.anInt10156,
					(-464680849 * class241_sub41.anInt10157
					 - (class168.method3631() + 1) / 2
					 - 1),
					class168.method3631() / 2, i_27_,
					(byte) 0);
		}
	    }
	    class168.method3646((class241_sub41.anInt10156 * 843218033
				 - (class168.method64() >> 1)),
				(-464680849 * class241_sub41.anInt10157
				 - class168.method3616()));
	    if (null != class2 && class168_17_ != null) {
		int i_28_;
		if (-1866104785 * ((Class2) class2).anInt13
		    > Class573_Sub1.anInt8785 * 881484909 / 2)
		    i_28_ = ((Class573_Sub1.anInt8785 * 1440352403
			      - ((Class2) class2).anInt13 * 884649681)
			     / (881484909 * Class573_Sub1.anInt8785));
		else
		    i_28_ = (884649681 * ((Class2) class2).anInt13
			     / (Class573_Sub1.anInt8785 * 881484909));
		int i_29_ = i_28_ << 24 | 0xffff00;
		class168_17_.method3666((843218033 * class241_sub41.anInt10156
					 - (class168_17_.method64() >> 1)),
					(class241_sub41.anInt10157 * -464680849
					 - (class168_17_.method3616()
					    + class168.method3616()) / 2),
					0, i_29_, 1);
	    }
	}
	if (null != class515.aString6756 && null != Class355.aClass96_5452)
	    NPCDefinitionLoader.method7246(class103, class241_sub41, class515, i_18_,
				i_19_, i_25_, i_20_, (byte) 1);
	if (-1 != class515.anInt6772 * -705700883
	    || null != class515.aString6756) {
	    Class241_Sub46 class241_sub46 = new Class241_Sub46(class241_sub41);
	    ((Class241_Sub46) class241_sub46).anInt10269 = i_13_ * -325331477;
	    ((Class241_Sub46) class241_sub46).anInt10268 = i_14_ * 781884803;
	    ((Class241_Sub46) class241_sub46).anInt10275 = i_15_ * -645579975;
	    ((Class241_Sub46) class241_sub46).anInt10267 = i_16_ * -1470931421;
	    ((Class241_Sub46) class241_sub46).anInt10270 = 492641787 * i_21_;
	    ((Class241_Sub46) class241_sub46).anInt10272 = -717652979 * i_22_;
	    ((Class241_Sub46) class241_sub46).anInt10271 = i_23_ * -1274657791;
	    ((Class241_Sub46) class241_sub46).anInt10274 = i_24_ * 872919199;
	    Class120_Sub23.aClass429_10631.addNode(class241_sub46,
						      (short) -32617);
	}
	return false;
    }
}
