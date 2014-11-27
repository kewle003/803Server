/* Class357 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

public abstract class Class357 implements Interface39
{
    int anInt5461;
    JS5 aClass210_5462;
    Class326 aClass326_5463;
    Class96 aClass96_5464;
    JS5 aClass210_5465;
    long aLong5466;
    public static Image anImage5467;
    
    public void method215(boolean bool, byte i) {
	int i_0_ = ((((Class357) this).aClass326_5463.aClass330_5008.method6031
		     (-664032457 * ((Class357) this).aClass326_5463.anInt5006,
		      -2047397293 * client.anInt8432, 1818461329))
		    + 601610705 * ((Class357) this).aClass326_5463.anInt5014);
	int i_1_ = ((((Class357) this).aClass326_5463.aClass324_5007.method5965
		     (524993587 * ((Class357) this).aClass326_5463.anInt5011,
		      -533394329 * client.anInt8433, 2073269423))
		    + -942384019 * ((Class357) this).aClass326_5463.anInt5009);
	method6453(bool, i_0_, i_1_, -387897807);
	method6454(bool, i_0_, i_1_, 1161571911);
	String string = CcDeltaNode.aClass70_9022.method1693((short) -8710);
	if ((Class50.method1249((byte) 1)
	     - ((Class357) this).aLong5466 * -8439055229337867209L)
	    > 10000L)
	    string = new StringBuilder().append(string).append(" (").append
			 ((CcDeltaNode.aClass70_9022.method1702(-1612464390)
			   .anInt5478) * -601665271)
			 .append
			 (")").toString();
	((Class357) this).aClass96_5464.method2113
	    (string,
	     (-664032457 * ((Class357) this).aClass326_5463.anInt5006 / 2
	      + i_0_),
	     (((Class357) this).aClass326_5463.anInt5012 * -305994951
	      + (i_1_
		 + ((Class357) this).aClass326_5463.anInt5011 * 524993587 / 2
		 + 4)),
	     -401483607 * ((Class357) this).aClass326_5463.anInt5010, -1,
	     101633028);
    }
    
    public void method29() {
	Class639 class639
	    = Class482.method11026(((Class357) this).aClass210_5462,
				   -2074180427 * (((Class357) this)
						  .aClass326_5463.anInt5013),
				   -1333288445);
	((Class357) this).aClass96_5464
	    = (Class236.aClass103_2713.method2296
	       (class639,
		Class160.method3440(((Class357) this).aClass210_5465,
				    -2074180427 * (((Class357) this)
						   .aClass326_5463.anInt5013)),
		true));
    }
    
    public void method191(int i) {
	Class639 class639
	    = Class482.method11026(((Class357) this).aClass210_5462,
				   -2074180427 * (((Class357) this)
						  .aClass326_5463.anInt5013),
				   -1145112254);
	((Class357) this).aClass96_5464
	    = (Class236.aClass103_2713.method2296
	       (class639,
		Class160.method3440(((Class357) this).aClass210_5465,
				    -2074180427 * (((Class357) this)
						   .aClass326_5463.anInt5013)),
		true));
    }
    
    public boolean method107(int i) {
	boolean bool = true;
	if (!((Class357) this).aClass210_5465.method4250((-2074180427
							  * (((Class357) this)
							     .aClass326_5463
							     .anInt5013)),
							 877706679))
	    bool = false;
	if (!((Class357) this).aClass210_5462.method4250((-2074180427
							  * (((Class357) this)
							     .aClass326_5463
							     .anInt5013)),
							 -310598187))
	    bool = false;
	return bool;
    }
    
    abstract void method6453(boolean bool, int i, int i_2_, int i_3_);
    
    abstract void method6454(boolean bool, int i, int i_4_, int i_5_);
    
    int method6455(byte i) {
	int i_6_ = CcDeltaNode.aClass70_9022.method1716(-1230015284);
	int i_7_ = 100 * i_6_;
	if (i_6_ == 1170817571 * ((Class357) this).anInt5461 && 0 != i_6_) {
	    int i_8_ = CcDeltaNode.aClass70_9022.method1697((byte) -15);
	    if (i_8_ > i_6_) {
		long l
		    = (-8439055229337867209L * ((Class357) this).aLong5466
		       - CcDeltaNode.aClass70_9022.method1706(2062764908));
		if (l > 0L) {
		    long l_9_
			= l * 10000L / (long) i_6_ * (long) (i_8_ - i_6_);
		    long l_10_ = ((Class50.method1249((byte) 1)
				   - (-8439055229337867209L
				      * ((Class357) this).aLong5466))
				  * 10000L);
		    if (l_10_ < l_9_)
			i_7_ = (int) ((long) (i_6_ * 100)
				      + (100L * ((long) (i_8_ - i_6_) * l_10_)
					 / l_9_));
		    else
			i_7_ = 100 * i_8_;
		}
	    }
	} else {
	    ((Class357) this).anInt5461 = i_6_ * 599424395;
	    ((Class357) this).aLong5466
		= Class50.method1249((byte) 1) * -2635189634788914809L;
	}
	return i_7_;
    }
    
    public void method213(boolean bool) {
	int i = ((((Class357) this).aClass326_5463.aClass330_5008.method6031
		  (-664032457 * ((Class357) this).aClass326_5463.anInt5006,
		   -2047397293 * client.anInt8432, -1482701881))
		 + 601610705 * ((Class357) this).aClass326_5463.anInt5014);
	int i_11_
	    = ((((Class357) this).aClass326_5463.aClass324_5007.method5965
		(524993587 * ((Class357) this).aClass326_5463.anInt5011,
		 -533394329 * client.anInt8433, 2066732009))
	       + -942384019 * ((Class357) this).aClass326_5463.anInt5009);
	method6453(bool, i, i_11_, 791839061);
	method6454(bool, i, i_11_, 873148820);
	String string = CcDeltaNode.aClass70_9022.method1693((short) 19098);
	if ((Class50.method1249((byte) 1)
	     - ((Class357) this).aLong5466 * -8439055229337867209L)
	    > 10000L)
	    string = new StringBuilder().append(string).append(" (").append
			 ((CcDeltaNode.aClass70_9022.method1702(-1612464390)
			   .anInt5478) * -601665271)
			 .append
			 (")").toString();
	((Class357) this).aClass96_5464.method2113
	    (string,
	     -664032457 * ((Class357) this).aClass326_5463.anInt5006 / 2 + i,
	     (((Class357) this).aClass326_5463.anInt5012 * -305994951
	      + (i_11_
		 + ((Class357) this).aClass326_5463.anInt5011 * 524993587 / 2
		 + 4)),
	     -401483607 * ((Class357) this).aClass326_5463.anInt5010, -1,
	     1691663344);
    }
    
    public void method212(boolean bool) {
	int i = ((((Class357) this).aClass326_5463.aClass330_5008.method6031
		  (-664032457 * ((Class357) this).aClass326_5463.anInt5006,
		   -2047397293 * client.anInt8432, -768104972))
		 + 601610705 * ((Class357) this).aClass326_5463.anInt5014);
	int i_12_
	    = ((((Class357) this).aClass326_5463.aClass324_5007.method5965
		(524993587 * ((Class357) this).aClass326_5463.anInt5011,
		 -533394329 * client.anInt8433, 2122028792))
	       + -942384019 * ((Class357) this).aClass326_5463.anInt5009);
	method6453(bool, i, i_12_, 202896489);
	method6454(bool, i, i_12_, 1111628896);
	String string = CcDeltaNode.aClass70_9022.method1693((short) -8732);
	if ((Class50.method1249((byte) 1)
	     - ((Class357) this).aLong5466 * -8439055229337867209L)
	    > 10000L)
	    string = new StringBuilder().append(string).append(" (").append
			 ((CcDeltaNode.aClass70_9022.method1702(-1612464390)
			   .anInt5478) * -601665271)
			 .append
			 (")").toString();
	((Class357) this).aClass96_5464.method2113
	    (string,
	     -664032457 * ((Class357) this).aClass326_5463.anInt5006 / 2 + i,
	     (((Class357) this).aClass326_5463.anInt5012 * -305994951
	      + (i_12_
		 + ((Class357) this).aClass326_5463.anInt5011 * 524993587 / 2
		 + 4)),
	     -401483607 * ((Class357) this).aClass326_5463.anInt5010, -1,
	     1921165840);
    }
    
    Class357(JS5 class210, JS5 class210_13_, Class326 class326) {
	((Class357) this).aClass210_5465 = class210;
	((Class357) this).aClass210_5462 = class210_13_;
	((Class357) this).aClass326_5463 = class326;
    }
    
    public void method216(boolean bool) {
	int i = ((((Class357) this).aClass326_5463.aClass330_5008.method6031
		  (-664032457 * ((Class357) this).aClass326_5463.anInt5006,
		   -2047397293 * client.anInt8432, 1392724576))
		 + 601610705 * ((Class357) this).aClass326_5463.anInt5014);
	int i_14_
	    = ((((Class357) this).aClass326_5463.aClass324_5007.method5965
		(524993587 * ((Class357) this).aClass326_5463.anInt5011,
		 -533394329 * client.anInt8433, 2062543879))
	       + -942384019 * ((Class357) this).aClass326_5463.anInt5009);
	method6453(bool, i, i_14_, -430033303);
	method6454(bool, i, i_14_, 2144087117);
	String string = CcDeltaNode.aClass70_9022.method1693((short) 15686);
	if ((Class50.method1249((byte) 1)
	     - ((Class357) this).aLong5466 * -8439055229337867209L)
	    > 10000L)
	    string = new StringBuilder().append(string).append(" (").append
			 ((CcDeltaNode.aClass70_9022.method1702(-1612464390)
			   .anInt5478) * -601665271)
			 .append
			 (")").toString();
	((Class357) this).aClass96_5464.method2113
	    (string,
	     -664032457 * ((Class357) this).aClass326_5463.anInt5006 / 2 + i,
	     (((Class357) this).aClass326_5463.anInt5012 * -305994951
	      + (i_14_
		 + ((Class357) this).aClass326_5463.anInt5011 * 524993587 / 2
		 + 4)),
	     -401483607 * ((Class357) this).aClass326_5463.anInt5010, -1,
	     2145460663);
    }
    
    abstract void method6456(boolean bool, int i, int i_15_);
    
    public boolean method117() {
	boolean bool = true;
	if (!((Class357) this).aClass210_5465.method4250((-2074180427
							  * (((Class357) this)
							     .aClass326_5463
							     .anInt5013)),
							 -154801025))
	    bool = false;
	if (!((Class357) this).aClass210_5462.method4250((-2074180427
							  * (((Class357) this)
							     .aClass326_5463
							     .anInt5013)),
							 1083548894))
	    bool = false;
	return bool;
    }
    
    public boolean method114() {
	boolean bool = true;
	if (!((Class357) this).aClass210_5465.method4250((-2074180427
							  * (((Class357) this)
							     .aClass326_5463
							     .anInt5013)),
							 -416341051))
	    bool = false;
	if (!((Class357) this).aClass210_5462.method4250((-2074180427
							  * (((Class357) this)
							     .aClass326_5463
							     .anInt5013)),
							 174216108))
	    bool = false;
	return bool;
    }
    
    public void method214(boolean bool) {
	int i = ((((Class357) this).aClass326_5463.aClass330_5008.method6031
		  (-664032457 * ((Class357) this).aClass326_5463.anInt5006,
		   -2047397293 * client.anInt8432, 1260937459))
		 + 601610705 * ((Class357) this).aClass326_5463.anInt5014);
	int i_16_
	    = ((((Class357) this).aClass326_5463.aClass324_5007.method5965
		(524993587 * ((Class357) this).aClass326_5463.anInt5011,
		 -533394329 * client.anInt8433, 1878735160))
	       + -942384019 * ((Class357) this).aClass326_5463.anInt5009);
	method6453(bool, i, i_16_, 2116008127);
	method6454(bool, i, i_16_, 1427319339);
	String string
	    = CcDeltaNode.aClass70_9022.method1693((short) -20247);
	if ((Class50.method1249((byte) 1)
	     - ((Class357) this).aLong5466 * -8439055229337867209L)
	    > 10000L)
	    string = new StringBuilder().append(string).append(" (").append
			 ((CcDeltaNode.aClass70_9022.method1702(-1612464390)
			   .anInt5478) * -601665271)
			 .append
			 (")").toString();
	((Class357) this).aClass96_5464.method2113
	    (string,
	     -664032457 * ((Class357) this).aClass326_5463.anInt5006 / 2 + i,
	     (((Class357) this).aClass326_5463.anInt5012 * -305994951
	      + (i_16_
		 + ((Class357) this).aClass326_5463.anInt5011 * 524993587 / 2
		 + 4)),
	     -401483607 * ((Class357) this).aClass326_5463.anInt5010, -1,
	     1793741178);
    }
    
    int method6457() {
	int i = CcDeltaNode.aClass70_9022.method1716(-1230015284);
	int i_17_ = 100 * i;
	if (i == 1170817571 * ((Class357) this).anInt5461 && 0 != i) {
	    int i_18_ = CcDeltaNode.aClass70_9022.method1697((byte) 50);
	    if (i_18_ > i) {
		long l
		    = (-8439055229337867209L * ((Class357) this).aLong5466
		       - CcDeltaNode.aClass70_9022.method1706(2040476483));
		if (l > 0L) {
		    long l_19_ = l * 10000L / (long) i * (long) (i_18_ - i);
		    long l_20_ = ((Class50.method1249((byte) 1)
				   - (-8439055229337867209L
				      * ((Class357) this).aLong5466))
				  * 10000L);
		    if (l_20_ < l_19_)
			i_17_ = (int) ((long) (i * 100)
				       + (100L * ((long) (i_18_ - i) * l_20_)
					  / l_19_));
		    else
			i_17_ = 100 * i_18_;
		}
	    }
	} else {
	    ((Class357) this).anInt5461 = i * 599424395;
	    ((Class357) this).aLong5466
		= Class50.method1249((byte) 1) * -2635189634788914809L;
	}
	return i_17_;
    }
    
    public boolean method218() {
	boolean bool = true;
	if (!((Class357) this).aClass210_5465.method4250((-2074180427
							  * (((Class357) this)
							     .aClass326_5463
							     .anInt5013)),
							 -492422120))
	    bool = false;
	if (!((Class357) this).aClass210_5462.method4250((-2074180427
							  * (((Class357) this)
							     .aClass326_5463
							     .anInt5013)),
							 -525536873))
	    bool = false;
	return bool;
    }
    
    public boolean method217() {
	boolean bool = true;
	if (!((Class357) this).aClass210_5465.method4250((-2074180427
							  * (((Class357) this)
							     .aClass326_5463
							     .anInt5013)),
							 1842470620))
	    bool = false;
	if (!((Class357) this).aClass210_5462.method4250((-2074180427
							  * (((Class357) this)
							     .aClass326_5463
							     .anInt5013)),
							 1417083688))
	    bool = false;
	return bool;
    }
    
    abstract void method6458(boolean bool, int i, int i_21_);
    
    abstract void method6459(boolean bool, int i, int i_22_);
    
    abstract void method6460(boolean bool, int i, int i_23_);
    
    abstract void method6461(boolean bool, int i, int i_24_);
    
    public void method27() {
	Class639 class639
	    = Class482.method11026(((Class357) this).aClass210_5462,
				   -2074180427 * (((Class357) this)
						  .aClass326_5463.anInt5013),
				   -643438132);
	((Class357) this).aClass96_5464
	    = (Class236.aClass103_2713.method2296
	       (class639,
		Class160.method3440(((Class357) this).aClass210_5465,
				    -2074180427 * (((Class357) this)
						   .aClass326_5463.anInt5013)),
		true));
    }
    
    public static void method6462(byte i) {
	Class596.method13081();
    }
    
    static final void method6463(ClientScriptData class454, short i) {
	Class4.method473(class454, -875873204);
    }
    
    static void method6464(int i, int i_25_) {
	for (Node class241 = client.aClass407_8519.method7294(2090894173);
	     null != class241;
	     class241 = client.aClass407_8519.method7295(430989712)) {
	    if ((long) i
		== (4356572401218184725L * class241.hashCode >> 48 & 0xffffL))
		class241.remove((byte) 36);
	}
    }
    
    public static void method6465(int i, int i_26_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(7, (long) i);
		class241_sub39_sub13.method17278((byte) -30);
    }
    
    static final void method6466(ClientScriptData class454, int i) {
	int i_27_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_27_, (byte) -119);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_27_ >> 16];
	Class59.method1597(class58, class35, class454, -1851537897);
    }
}
