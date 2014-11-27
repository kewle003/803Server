/* Class218_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218_Sub1 extends VarDomainType
{
    Object method4365(VarType class179) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 56);
    }
    
    Class218_Sub1(Js5ConfigGroup class37, int i, boolean bool, boolean bool_0_) {
		super(class37, i, bool, bool_0_);
    }
    
    Object method4364(VarType class179, byte i) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 78);
    }
    
    Object method4371(VarType class179) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 111);
    }
    
    Object method4368(VarType class179) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 59);
    }
    
    public static void method16527(byte i) {
	for (Class241_Sub38 class241_sub38
		 = ((Class241_Sub38)
		    Class241_Sub38.aClass429_10116.method7694(16711935));
	     null != class241_sub38;
	     class241_sub38 = (Class241_Sub38) Class241_Sub38
						   .aClass429_10116
						   .method7692(1196534446)) {
	    if (((Class241_Sub38) class241_sub38).aBool10120)
		class241_sub38.method16432(1154214944);
	}
	for (Class241_Sub38 class241_sub38
		 = ((Class241_Sub38)
		    Class241_Sub38.aClass429_10117.method7694(16711935));
	     class241_sub38 != null;
	     class241_sub38 = (Class241_Sub38) Class241_Sub38
						   .aClass429_10117
						   .method7692(1614167105)) {
	    if (((Class241_Sub38) class241_sub38).aBool10120)
		class241_sub38.method16432(2073662458);
	}
    }
    
    static final void method16528(Class103 class103, Class107 class107,
				  int i) {
	if (-16261253 * Class573_Sub1.anInt8787 != 100
	    && Class573_Sub1.aClass241_Sub39_Sub12_7405 != null) {
	    Class50.method1249((byte) 1);
	    Class50.method1249((byte) 1);
	    if (Class573_Sub1.anInt8787 * -16261253 < 10) {
		for (int i_1_ = 0;
		     i_1_ < Class573_Sub1.aClass96ArrayArray8795.length;
		     i_1_++) {
		    for (int i_2_ = 0;
			 (i_2_
			  < Class573_Sub1.aClass96ArrayArray8795[i_1_].length);
			 i_2_++) {
			Class284.SPRITES_ARCHIVE.method4250
			    ((Class573_Sub1.aClass497_7374.anIntArrayArray6547
			      [i_1_][i_2_]),
			     2106428192);
			Class120_Sub7.FONTS_ARCHIVE.method4250
			    ((Class573_Sub1.aClass497_7374.anIntArrayArray6547
			      [i_1_][i_2_]),
			     -486172945);
		    }
		}
		if (!Class573_Sub1.aClass210_7376.containerIdentifierExists
		     (Class573_Sub1.aClass241_Sub39_Sub12_7405.aString10922,
		      -1439987859)) {
		    Class573_Sub1.anInt8787
			= (Class608.WORLD_MAP_ARCHIVE.method4210
			   ((Class573_Sub1.aClass241_Sub39_Sub12_7405
			     .aString10922),
			    -1303008648)) / 10 * 594094003;
		    return;
		}
		Class573_Sub1.anInt8787 = 1645972734;
	    }
	    if (10 == Class573_Sub1.anInt8787 * -16261253) {
		Class573_Sub1.anInt7388
		    = 219733397 * (Class573_Sub1.aClass241_Sub39_Sub12_7405
				   .anInt10931) >> 6 << 6;
		Class573_Sub1.anInt7389
		    = -1017960145 * (Class573_Sub1.aClass241_Sub39_Sub12_7405
				     .anInt10930) >> 6 << 6;
		Class573_Sub1.anInt7390
		    = 64 + ((-1741001739 * (Class573_Sub1
					    .aClass241_Sub39_Sub12_7405
					    .anInt10929)
			     >> 6 << 6)
			    - Class573_Sub1.anInt7388);
		Class573_Sub1.anInt7391
		    = ((Class573_Sub1.aClass241_Sub39_Sub12_7405.anInt10924
			* 1587526511)
		       >> 6 << 6) - Class573_Sub1.anInt7389 + 64;
		int[] is = new int[3];
		int i_3_ = -1;
		int i_4_ = -1;
		Class287 class287
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386);
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		if (Class573_Sub1.aClass241_Sub39_Sub12_7405.method17257
		    (Class21.myPlayer.nodePlane,
		     (((int) class287.aFloat4477 >> 9)
		      + class522.baseX * 127679513),
		     (((int) class287.aFloat4479 >> 9)
		      + class522.baseY * 468558693),
		     is, 1764907289)) {
		    i_3_ = is[1] - Class573_Sub1.anInt7388;
		    i_4_ = is[2] - Class573_Sub1.anInt7389;
		}
		if (!Class573_Sub1.aBool8778 && i_3_ >= 0
		    && i_3_ < Class573_Sub1.anInt7390 && i_4_ >= 0
		    && i_4_ < Class573_Sub1.anInt7391) {
		    i_3_ += (int) (Math.random() * 10.0) - 5;
		    i_4_ += (int) (Math.random() * 10.0) - 5;
		    WorldTile.anInt10182 = -1822006837 * i_3_;
		    WorldTile.anInt10183 = i_4_ * -1182123501;
		} else if (-1 != Class573_Sub1.anInt8779 * -1451463477
			   && -1 != -1595136465 * Class573_Sub1.anInt8777) {
		    Class573_Sub1.aClass241_Sub39_Sub12_7405.method17256
			(Class573_Sub1.anInt8779 * -1451463477,
			 Class573_Sub1.anInt8777 * -1595136465, is,
			 -1479289136);
		    if (is != null) {
			WorldTile.anInt10182
			    = -1822006837 * (is[1] - Class573_Sub1.anInt7388);
			WorldTile.anInt10183
			    = (is[2] - Class573_Sub1.anInt7389) * -1182123501;
		    }
		    Class573_Sub1.anInt8777 = 174268209;
		    Class573_Sub1.anInt8779 = -450468067;
		    Class573_Sub1.aBool8778 = false;
		} else {
		    Class573_Sub1.aClass241_Sub39_Sub12_7405.method17256
			((Class573_Sub1.aClass241_Sub39_Sub12_7405.anInt10928
			  * 519913137) >> 14 & 0x3fff,
			 (Class573_Sub1.aClass241_Sub39_Sub12_7405.anInt10928
			  * 519913137) & 0x3fff,
			 is, -423463266);
		    WorldTile.anInt10182
			= -1822006837 * (is[1] - Class573_Sub1.anInt7388);
		    WorldTile.anInt10183
			= -1182123501 * (is[2] - Class573_Sub1.anInt7389);
		}
		if (25 == 414094675 * (Class573_Sub1.aClass241_Sub39_Sub12_7405
				       .anInt10927)) {
		    Class573_Sub1.aFloat7408 = 2.0F;
		    Class573_Sub1.aFloat7402 = 2.0F;
		} else if ((Class573_Sub1.aClass241_Sub39_Sub12_7405.anInt10927
			    * 414094675)
			   == 37) {
		    Class573_Sub1.aFloat7408 = 3.0F;
		    Class573_Sub1.aFloat7402 = 3.0F;
		} else if ((Class573_Sub1.aClass241_Sub39_Sub12_7405.anInt10927
			    * 414094675)
			   == 50) {
		    Class573_Sub1.aFloat7408 = 4.0F;
		    Class573_Sub1.aFloat7402 = 4.0F;
		} else if ((Class573_Sub1.aClass241_Sub39_Sub12_7405.anInt10927
			    * 414094675)
			   == 75) {
		    Class573_Sub1.aFloat7408 = 6.0F;
		    Class573_Sub1.aFloat7402 = 6.0F;
		} else if (414094675 * (Class573_Sub1
					.aClass241_Sub39_Sub12_7405.anInt10927)
			   == 100) {
		    Class573_Sub1.aFloat7408 = 8.0F;
		    Class573_Sub1.aFloat7402 = 8.0F;
		} else if (200 == 414094675 * (Class573_Sub1
					       .aClass241_Sub39_Sub12_7405
					       .anInt10927)) {
		    Class573_Sub1.aFloat7408 = 16.0F;
		    Class573_Sub1.aFloat7402 = 16.0F;
		} else {
		    Class573_Sub1.aFloat7408 = 8.0F;
		    Class573_Sub1.aFloat7402 = 8.0F;
		}
		Class573_Sub1.anInt7381 = (int) Class573_Sub1.aFloat7402 >> 1;
		Class573_Sub1.aByteArrayArrayArray7380
		    = Class336.method6078(Class573_Sub1.anInt7381, 881539720);
		Class288.method5661(497318259);
		Class573_Sub1.method12555();
		Class120_Sub23.aClass429_10631 = new NodeCollection();
		Class573_Sub1.anInt7384 += (int) (Math.random() * 5.0) - 2;
		if (Class573_Sub1.anInt7384 < -8)
		    Class573_Sub1.anInt7384 = -8;
		if (Class573_Sub1.anInt7384 > 8)
		    Class573_Sub1.anInt7384 = 8;
		Class573_Sub1.anInt7433 += (int) (Math.random() * 5.0) - 2;
		if (Class573_Sub1.anInt7433 < -16)
		    Class573_Sub1.anInt7433 = -16;
		if (Class573_Sub1.anInt7433 > 16)
		    Class573_Sub1.anInt7433 = 16;
		Class573_Sub1.method12584(class107,
					  Class573_Sub1.anInt7384 >> 2 << 10,
					  Class573_Sub1.anInt7433 >> 1);
		Class573_Sub1.aClass524_7370.method11737(1024, 256,
							 2131649029);
		Class573_Sub1.aClass598_7436.method13124(256, 256, -919136086);
		Class573_Sub1.aClass532_7421.method11853(4096, 1141357207);
		Class541.aClass199_Sub1_7008.method16869(256, 261015552);
		Class573_Sub1.anInt8787 = -1003021828;
	    } else if (20 == Class573_Sub1.anInt8787 * -16261253) {
		if (Class573_Sub1.aBool7423) {
		    if (Class573_Sub1.method12564(class103,
						  Class573_Sub1.anInt7384,
						  Class573_Sub1.anInt7433,
						  Class573_Sub1.aBool7423))
			Class573_Sub1.anInt8787 = 1285901812;
		} else {
		    Class572.method12549(true, 1737025843);
		    Class573_Sub1.method12564(class103,
					      Class573_Sub1.anInt7384,
					      Class573_Sub1.anInt7433,
					      Class573_Sub1.aBool7423);
		    Class573_Sub1.anInt8787 = 1285901812;
		    Class572.method12549(true, 2040065425);
		    SoundManager.method1241(1482319719);
		}
	    } else if (60 == Class573_Sub1.anInt8787 * -16261253) {
		if (Class573_Sub1.aClass210_7376.method4204
		    (new StringBuilder().append
			 (Class573_Sub1.aClass241_Sub39_Sub12_7405
			  .aString10922)
			 .append
			 ("_staticelements").toString(),
		     1559405064)) {
		    if (!Class573_Sub1.aClass210_7376.containerIdentifierExists
			 (new StringBuilder().append
			      (Class573_Sub1.aClass241_Sub39_Sub12_7405
			       .aString10922)
			      .append
			      ("_staticelements").toString(),
			  -1142273777))
			return;
		    Class573_Sub1.aClass564_7386
			= Class349.method6233(Class573_Sub1.aClass210_7376,
					      new StringBuilder().append
						  (Class573_Sub1
						   .aClass241_Sub39_Sub12_7405
						   .aString10922)
						  .append
						  ("_staticelements")
						  .toString(),
					      client.isP2pWorld, (byte) 104);
		} else
		    Class573_Sub1.aClass564_7386 = new Class564(0);
		Class573_Sub1.method12640();
		Class573_Sub1.anInt8787 = -1363092750;
		Class572.method12549(true, 1951298224);
		SoundManager.method1241(1482319719);
	    } else if (Class573_Sub1.anInt8787 * -16261253 >= 70) {
		for (int i_5_ = 0; i_5_ < 3; i_5_++) {
		    for (int i_6_ = 0; i_6_ < 5; i_6_++) {
			if (null == (Class573_Sub1.aClass96ArrayArray8795[i_5_]
				     [i_6_])
			    || (Class573_Sub1.aClass639ArrayArray8784[i_5_]
				[i_6_]) == null) {
			    Class573_Sub1.aClass96ArrayArray8795[i_5_][i_6_]
				= (Class96) (Class425.aClass344_6080.method6161
					     (client.anInterface26_8552,
					      (Class573_Sub1.aClass497_7374
					       .anIntArrayArray6547[i_5_]
					       [i_6_]),
					      true, true, -1759927128));
			    Class573_Sub1.aClass639ArrayArray8784[i_5_][i_6_]
				= Class482.method11026((Class120_Sub7
							.FONTS_ARCHIVE),
						       (Class573_Sub1
							.aClass497_7374
							.anIntArrayArray6547
							[i_5_][i_6_]),
						       -520054825);
			    if (null != (Class573_Sub1.aClass96ArrayArray8795
					 [i_5_][i_6_])
				&& null != (Class573_Sub1
					    .aClass639ArrayArray8784[i_5_]
					    [i_6_]))
				Class573_Sub1.anInt8787 += 1782282009;
			    else
				return;
			}
		    }
		}
		Class573_Sub1.anInt8787 = -720141844;
		System.gc();
	    }
	}
    }
    
    static final void method16529(ClientScriptData class454, int i) {
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_7_, (byte) -61);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_7_ >> 16];
	Class101.method2206(class58, class35, class454, 1934685297);
    }
    
    public static int[][] method16530(int i, int i_8_, int i_9_, int i_10_,
				      int i_11_, int i_12_, float f,
				      boolean bool, int i_13_) {
	int[][] is = new int[i_8_][i];
	Class241_Sub2_Sub1 class241_sub2_sub1 = new Class241_Sub2_Sub1();
	((Class241_Sub2_Sub1) class241_sub2_sub1).aBool10803 = bool;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10799
	    = -1127959001 * i_10_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10800
	    = -2006378971 * i_11_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10801
	    = -1880909763 * i_12_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10802
	    = (int) (f * 4096.0F) * -1481008203;
	class241_sub2_sub1.method17037(-1675665158);
	Class620.method13332(i, i_8_, -622171815);
	for (int i_14_ = 0; i_14_ < i_8_; i_14_++)
	    class241_sub2_sub1.method17032(i_14_, is[i_14_], (byte) 0);
	return is;
    }
}
