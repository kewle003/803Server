/* Class241_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub41 extends Node
{
    public int anInt10152;
    public int anInt10153;
    public int anInt10154;
    public boolean aBool10155;
    public int anInt10156;
    public int anInt10157;
    public int anInt10158 = -6013309;
    
    Class241_Sub41(int i) {
	aBool10155 = false;
	anInt10158 = i * 6013309;
    }
    
    static boolean method16449(Class103 class103, int i, byte i_0_) {
	class103.method2291();
	Class50.method1249((byte) 1);
	if (!class103.method2304(-451935997))
	    return false;
	int i_1_ = client.aClass238_8477.method4744(-1848536577);
	int i_2_ = client.aClass238_8477.method4745(-1027665675);
	Class215 class215 = client.aClass238_8477.method4753((byte) -99);
	Class552 class552 = client.aClass238_8477.method4751(-553294614);
	int i_3_ = i;
	if (null != Class21.myPlayer) {
	    int i_4_
		= (Class21.myPlayer.scenePositionXQueue[0]
		   >> 3);
	    int i_5_
		= (Class21.myPlayer.scenePositionYQueue[0]
		   >> 3);
	    if (i_4_ >= 0 && i_4_ < Class458.aBoolArrayArray6260.length
		&& i_5_ >= 0
		&& i_5_ < Class458.aBoolArrayArray6260[i_4_].length
		&& Class458.aBoolArrayArray6260[i_4_][i_5_])
		i_3_ = 0;
	}
	int i_6_ = i_1_ / 2;
	int i_7_ = 0;
	int i_8_ = 0;
	boolean bool = true;
	for (int i_9_ = i_7_; i_9_ < i_1_ + i_7_; i_9_++) {
	    for (int i_10_ = i_8_; i_10_ < i_8_ + i_2_; i_10_++) {
		for (int i_11_ = i_3_; i_11_ <= 3; i_11_++) {
		    if (i_11_ < i || class215.method4332(i, i_11_, i_9_, i_10_,
							 2078909594)) {
			int i_12_ = i_11_;
			if (class215.method4331(i_9_, i_10_, 1476916201))
			    i_12_--;
			if (i_12_ >= 0)
			    bool &= ReferenceTable.method5556(i_12_, i_9_, i_10_,
							(byte) 107);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_13_ = 48 + (48 + i_1_ * 4);
	int[] is = new int[i_13_ * i_13_];
	for (int i_14_ = 0; i_14_ < is.length; i_14_++)
	    is[i_14_] = 0;
	Class105_Sub2 class105_sub2 = null;
	int i_15_ = 0;
	int i_16_ = 0;
	if (Class194.aBool2301) {
	    Class65.aClass168_1046
		= class103.method2590(i_13_, i_13_, false, true);
	    class105_sub2 = class103.method2248();
	    class105_sub2.method15585(0, Class65.aClass168_1046.method3608());
	    Interface5 interface5 = class103.method2249(i_13_, i_13_);
	    class105_sub2.method15584(interface5);
	    class103.method2244(class105_sub2, -519163929);
	    i_6_ = i_1_;
	    i_15_ = 48;
	    i_16_ = 48;
	    class103.method2450(1, 0);
	} else
	    Class65.aClass168_1046
		= class103.method2259(is, 0, i_13_, i_13_, i_13_, (byte) 3);
	client.aClass238_8477.method4833(-252460424).method11401(1310223404);
	int i_17_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_18_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_19_ = ((int) (Math.random() * 8.0) << 16
		     | (int) (Math.random() * 8.0) << 8
		     | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[i_6_ + 1 + 2][i_6_ + 1 + 2];
	for (int i_20_ = i_7_; i_20_ < i_7_ + i_1_; i_20_ += i_6_) {
	    for (int i_21_ = i_8_; i_21_ < i_8_ + i_2_; i_21_ += i_6_) {
		int i_22_ = i_15_;
		int i_23_ = i_16_;
		int i_24_ = i_20_;
		if (i_24_ > 0) {
		    i_24_--;
		    i_22_ += 4;
		}
		int i_25_ = i_21_;
		if (i_25_ > 0)
		    i_25_--;
		int i_26_ = i_6_ + i_20_;
		if (i_26_ < i_1_)
		    i_26_++;
		int i_27_ = i_21_ + i_6_;
		if (i_27_ < i_2_) {
		    i_27_++;
		    i_23_ += 4;
		}
		if (Class194.aBool2300)
		    class103.method2572();
		else
		    class103.method2445(0, 0, 4 * i_6_ + i_22_,
					4 * i_6_ + i_23_);
		class103.method2450(3, -16777216);
		int i_28_ = i_6_;
		if (i_28_ > i_1_ - 1)
		    i_28_ = i_1_ - 1;
		for (int i_29_ = i_3_; i_29_ <= 3; i_29_++) {
		    for (int i_30_ = 0; i_30_ <= i_28_; i_30_++) {
			for (int i_31_ = 0; i_31_ <= i_28_; i_31_++)
			    bools[i_30_][i_31_]
				= (i_29_ < i
				   || class215.method4332(i, i_29_,
							  i_30_ + i_24_,
							  i_31_ + i_25_,
							  1866141421));
		    }
		    class552.aClass166Array7179[i_29_].method3548(i_15_, i_16_,
								  1024, i_24_,
								  i_25_, i_26_,
								  i_27_,
								  bools);
		    for (int i_32_ = -4; i_32_ < i_6_; i_32_++) {
			for (int i_33_ = -4; i_33_ < i_6_; i_33_++) {
			    int i_34_ = i_32_ + i_20_;
			    int i_35_ = i_33_ + i_21_;
			    if (i_34_ >= i_7_ && i_35_ >= i_8_
				&& (i_29_ < i
				    || class215.method4332(i, i_29_, i_34_,
							   i_35_,
							   1978076174))) {
				int i_36_ = i_29_;
				if (class215.method4331(i_34_, i_35_,
							-751046203))
				    i_36_--;
				if (i_36_ >= 0)
				    Class583.method12825(class103, i_36_,
							 i_34_, i_35_,
							 i_22_ + 4 * i_32_,
							 (i_23_
							  + (i_6_ - i_33_) * 4
							  - 4),
							 i_17_, i_18_,
							 -933338025);
			    }
			}
		    }
		}
		class103.method2396(i_22_, i_23_, 4 * i_6_, i_6_ * 4, i_19_,
				    2);
		class103.method2291();
		if (!Class194.aBool2301) {
		    Class65.aClass168_1046.method3675(48 + (i_20_ - i_7_) * 4,
						      (48 + i_2_ * 4
						       - 4 * (i_21_ - i_8_)
						       - 4 * i_6_),
						      i_6_ * 4, 4 * i_6_,
						      i_22_, i_23_);
		    if (Class194.aBool2300) {
			Class65.aClass168_1046.method3646(256, 0);
			try {
			    class103.method2217((byte) 32);
			    Class380_Sub2.method16722(2000L);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
	    }
	}
	if (Class194.aBool2301) {
	    class103.method2245(class105_sub2, -18497516);
	    if (Class194.aBool2300) {
		Class65.aClass168_1046.method3646(256, 0);
		try {
		    class103.method2217((byte) 12);
		    Class380_Sub2.method16722(2000L);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class103.method2572();
	class103.method2450(1, 1);
	Class69.method1683((byte) 14);
	Class194.anInt2303 = 0;
	Class194.aClass429_2307.method7652((byte) 25);
	if (!Class194.aBool2310) {
	    Class558.method12326(i, 2093462906);
	    Class564 class564 = client.aClass238_8477.method4860(2075296288);
	    if (null != class564) {
		Class441.aClass524_6158.method11737(1024, 64, 2131649029);
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		for (int i_37_ = 0; i_37_ < class564.anInt7308 * 81284827;
		     i_37_++) {
		    int i_38_ = class564.anIntArray7306[i_37_];
		    if (Class21.myPlayer.nodePlane
			== i_38_ >> 28) {
			int i_39_ = ((i_38_ >> 14 & 0x3fff)
				     - 127679513 * class522.baseX);
			int i_40_ = ((i_38_ & 0x3fff)
				     - 468558693 * class522.baseY);
			if (i_39_ >= 0 && i_39_ < i_1_ && i_40_ >= 0
			    && i_40_ < i_2_)
			    Class194.aClass429_2307.addNode
				(new IntegerNode(i_37_), (short) -1550);
			else {
			    Class515 class515
				= (Class441.aClass524_6158.method11745
				   (class564.anIntArray7307[i_37_],
				    -798276456));
			    if (class515.anIntArray6737 != null
				&& class515.anInt6759 * 1389678465 + i_39_ >= 0
				&& (-1967356869 * class515.anInt6757 + i_39_
				    < i_1_)
				&& (i_40_ + class515.anInt6747 * -1423735679
				    >= 0)
				&& (i_40_ + class515.anInt6742 * -1576680733
				    < i_2_))
				Class194.aClass429_2307.addNode
				    (new IntegerNode(i_37_),
				     (short) -31054);
			}
		    }
		}
		Class441.aClass524_6158.method11737(128, 64, 2131649029);
	    }
	}
	return true;
    }
    
    static final void method16450(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	class58.anInt990
	    = (((ClientScriptData) class454).integerStack
	       [1482319719 * ((ClientScriptData) class454).intStackPointer]) * 2043733113;
	class58.anInt947
	    = 431616775 * (((ClientScriptData) class454).integerStack
			   [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	WorldType.refreshComponent(class58, -834218520);
    }
}
