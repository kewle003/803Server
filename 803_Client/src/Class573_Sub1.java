/* Class573_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class573_Sub1 extends Class573
{
    static HashMap aHashMap8766;
    static int anInt8767;
    static int anInt8768;
    static int anInt8769;
    public static int anInt8770;
    static boolean aBool8771;
    public static boolean aBool8772;
    static int anInt8773;
    static boolean aBool8774;
    static boolean aBool8775;
    static boolean aBool8776;
    static int anInt8777;
    static boolean aBool8778;
    static int anInt8779;
    static boolean aBool8780;
    static HashMap aHashMap8781;
    public static HashTable aClass407_8782;
    static int anInt8783;
    static Class639[][] aClass639ArrayArray8784;
    static int anInt8785;
    public static boolean aBool8786;
    public static int anInt8787;
    public static HashTable aClass407_8788;
    static Class443 aClass443_8789;
    static int anInt8790 = 0;
    public static boolean aBool8791;
    public static boolean aBool8792;
    public static int anInt8793;
    static int anInt8794;
    static Class96[][] aClass96ArrayArray8795;
    
    static void method14534(int i) {
	WorldTile.anInt10182 = -1822006837 * i;
	anInt8773 = -362944491;
	anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    static {
	anInt8767 = -1951265843;
	anInt8768 = -1362645074;
	anInt8769 = 1886984872;
	anInt8770 = 809184205;
	anInt8793 = 536395262;
	anInt8787 = 0;
	anInt8773 = -362944491;
	anInt8794 = -1265261197;
	aBool8775 = false;
	anInt8779 = -450468067;
	anInt8777 = 174268209;
	aBool8778 = false;
	aClass96ArrayArray8795 = new Class96[3][5];
	aClass639ArrayArray8784 = new Class639[3][5];
	aHashMap8781 = new HashMap();
	aHashMap8766 = new HashMap();
	anInt8783 = anInt8770 * -1978949439;
	anInt8785 = anInt8793 * 1227044387;
	aBool8771 = false;
	aBool8786 = false;
	aClass407_8782 = new HashTable(8);
	aClass407_8788 = new HashTable(8);
	aClass443_8789 = new Class443(new NodeCollection());
	aBool8772 = false;
	aBool8791 = false;
	aBool8792 = false;
	aBool8780 = false;
	aBool8776 = false;
	aBool8774 = false;
    }
    
    static final void method14535(Class103 class103, Class107 class107) {
	if (-16261253 * anInt8787 != 100
	    && aClass241_Sub39_Sub12_7405 != null) {
	    Class50.method1249((byte) 1);
	    Class50.method1249((byte) 1);
	    if (anInt8787 * -16261253 < 10) {
		for (int i = 0; i < aClass96ArrayArray8795.length; i++) {
		    for (int i_0_ = 0; i_0_ < aClass96ArrayArray8795[i].length;
			 i_0_++) {
			Class284.SPRITES_ARCHIVE.method4250
			    (aClass497_7374.anIntArrayArray6547[i][i_0_],
			     1456937934);
			Class120_Sub7.FONTS_ARCHIVE.method4250
			    (aClass497_7374.anIntArrayArray6547[i][i_0_],
			     -348676478);
		    }
		}
		if (!aClass210_7376.containerIdentifierExists((aClass241_Sub39_Sub12_7405
						.aString10922),
					       291573036)) {
		    anInt8787 = (Class608.WORLD_MAP_ARCHIVE.method4210
				 (aClass241_Sub39_Sub12_7405.aString10922,
				  -996314704)) / 10 * 594094003;
		    return;
		}
		anInt8787 = 1645972734;
	    }
	    if (10 == anInt8787 * -16261253) {
		anInt7388 = (219733397 * aClass241_Sub39_Sub12_7405.anInt10931
			     >> 6 << 6);
		anInt7389
		    = (-1017960145 * aClass241_Sub39_Sub12_7405.anInt10930 >> 6
		       << 6);
		anInt7390 = 64 + (((-1741001739
				    * aClass241_Sub39_Sub12_7405.anInt10929)
				   >> 6 << 6)
				  - anInt7388);
		anInt7391 = (aClass241_Sub39_Sub12_7405.anInt10924 * 1587526511
			     >> 6 << 6) - anInt7389 + 64;
		int[] is = new int[3];
		int i = -1;
		int i_1_ = -1;
		Class287 class287
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386);
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		if (aClass241_Sub39_Sub12_7405.method17257
		    (Class21.myPlayer.nodePlane,
		     (((int) class287.aFloat4477 >> 9)
		      + class522.baseX * 127679513),
		     (((int) class287.aFloat4479 >> 9)
		      + class522.baseY * 468558693),
		     is, 2019991565)) {
		    i = is[1] - anInt7388;
		    i_1_ = is[2] - anInt7389;
		}
		if (!aBool8778 && i >= 0 && i < anInt7390 && i_1_ >= 0
		    && i_1_ < anInt7391) {
		    i += (int) (Math.random() * 10.0) - 5;
		    i_1_ += (int) (Math.random() * 10.0) - 5;
		    WorldTile.anInt10182 = -1822006837 * i;
		    WorldTile.anInt10183 = i_1_ * -1182123501;
		} else if (-1 != anInt8779 * -1451463477
			   && -1 != -1595136465 * anInt8777) {
		    aClass241_Sub39_Sub12_7405.method17256((anInt8779
							    * -1451463477),
							   (anInt8777
							    * -1595136465),
							   is, -1359517326);
		    if (is != null) {
			WorldTile.anInt10182
			    = -1822006837 * (is[1] - anInt7388);
			WorldTile.anInt10183
			    = (is[2] - anInt7389) * -1182123501;
		    }
		    anInt8777 = 174268209;
		    anInt8779 = -450468067;
		    aBool8778 = false;
		} else {
		    aClass241_Sub39_Sub12_7405.method17256
			((aClass241_Sub39_Sub12_7405.anInt10928 * 519913137
			  >> 14) & 0x3fff,
			 (aClass241_Sub39_Sub12_7405.anInt10928 * 519913137
			  & 0x3fff),
			 is, -73528861);
		    WorldTile.anInt10182
			= -1822006837 * (is[1] - anInt7388);
		    WorldTile.anInt10183
			= -1182123501 * (is[2] - anInt7389);
		}
		if (25 == 414094675 * aClass241_Sub39_Sub12_7405.anInt10927) {
		    aFloat7408 = 2.0F;
		    aFloat7402 = 2.0F;
		} else if (aClass241_Sub39_Sub12_7405.anInt10927 * 414094675
			   == 37) {
		    aFloat7408 = 3.0F;
		    aFloat7402 = 3.0F;
		} else if (aClass241_Sub39_Sub12_7405.anInt10927 * 414094675
			   == 50) {
		    aFloat7408 = 4.0F;
		    aFloat7402 = 4.0F;
		} else if (aClass241_Sub39_Sub12_7405.anInt10927 * 414094675
			   == 75) {
		    aFloat7408 = 6.0F;
		    aFloat7402 = 6.0F;
		} else if (414094675 * aClass241_Sub39_Sub12_7405.anInt10927
			   == 100) {
		    aFloat7408 = 8.0F;
		    aFloat7402 = 8.0F;
		} else if (200 == (414094675
				   * aClass241_Sub39_Sub12_7405.anInt10927)) {
		    aFloat7408 = 16.0F;
		    aFloat7402 = 16.0F;
		} else {
		    aFloat7408 = 8.0F;
		    aFloat7402 = 8.0F;
		}
		anInt7381 = (int) aFloat7402 >> 1;
		aByteArrayArrayArray7380
		    = Class336.method6078(anInt7381, 1400426177);
		Class288.method5661(497318259);
		method12555();
		Class120_Sub23.aClass429_10631 = new NodeCollection();
		anInt7384 += (int) (Math.random() * 5.0) - 2;
		if (anInt7384 < -8)
		    anInt7384 = -8;
		if (anInt7384 > 8)
		    anInt7384 = 8;
		anInt7433 += (int) (Math.random() * 5.0) - 2;
		if (anInt7433 < -16)
		    anInt7433 = -16;
		if (anInt7433 > 16)
		    anInt7433 = 16;
		method12584(class107, anInt7384 >> 2 << 10, anInt7433 >> 1);
		aClass524_7370.method11737(1024, 256, 2131649029);
		aClass598_7436.method13124(256, 256, -1934930660);
		aClass532_7421.method11853(4096, 1141357207);
		Class541.aClass199_Sub1_7008.method16869(256, 261015552);
		anInt8787 = -1003021828;
	    } else if (20 == anInt8787 * -16261253) {
		if (aBool7423) {
		    if (method12564(class103, anInt7384, anInt7433, aBool7423))
			anInt8787 = 1285901812;
		} else {
		    Class572.method12549(true, 2004382152);
		    method12564(class103, anInt7384, anInt7433, aBool7423);
		    anInt8787 = 1285901812;
		    Class572.method12549(true, 1948317522);
		    SoundManager.method1241(1482319719);
		}
	    } else if (60 == anInt8787 * -16261253) {
		if (aClass210_7376.method4204(new StringBuilder().append
						  (aClass241_Sub39_Sub12_7405
						   .aString10922)
						  .append
						  ("_staticelements")
						  .toString(),
					      1589443093)) {
		    if (!aClass210_7376.containerIdentifierExists
			 (new StringBuilder().append
			      (aClass241_Sub39_Sub12_7405.aString10922).append
			      ("_staticelements").toString(),
			  -332342389))
			return;
		    aClass564_7386
			= Class349.method6233(aClass210_7376,
					      new StringBuilder().append
						  (aClass241_Sub39_Sub12_7405
						   .aString10922)
						  .append
						  ("_staticelements")
						  .toString(),
					      client.isP2pWorld, (byte) 72);
		} else
		    aClass564_7386 = new Class564(0);
		method12640();
		anInt8787 = -1363092750;
		Class572.method12549(true, 1901817264);
		SoundManager.method1241(1482319719);
	    } else if (anInt8787 * -16261253 >= 70) {
		for (int i = 0; i < 3; i++) {
		    for (int i_2_ = 0; i_2_ < 5; i_2_++) {
			if (null == aClass96ArrayArray8795[i][i_2_]
			    || aClass639ArrayArray8784[i][i_2_] == null) {
			    aClass96ArrayArray8795[i][i_2_]
				= (Class96) (Class425.aClass344_6080.method6161
					     (client.anInterface26_8552,
					      (aClass497_7374
					       .anIntArrayArray6547[i][i_2_]),
					      true, true, -301427505));
			    aClass639ArrayArray8784[i][i_2_]
				= Class482.method11026((Class120_Sub7
							.FONTS_ARCHIVE),
						       (aClass497_7374
							.anIntArrayArray6547[i]
							[i_2_]),
						       -1649460016);
			    if (null != aClass96ArrayArray8795[i][i_2_]
				&& null != aClass639ArrayArray8784[i][i_2_])
				anInt8787 += 1782282009;
			    else
				return;
			}
		    }
		}
		anInt8787 = -720141844;
		System.gc();
	    }
	}
    }
    
    static void method14536(Class103 class103, NodeCollection class429, int i,
			    int i_3_) {
	Class120_Sub23.aClass429_10631.method7652((byte) 83);
	if (!aBool8786) {
	    for (Class241_Sub41 class241_sub41
		     = (Class241_Sub41) class429.method7694(16711935);
		 null != class241_sub41;
		 class241_sub41
		     = (Class241_Sub41) class429.method7692(735287866)) {
		Class515 class515
		    = aClass524_7370.method11745((class241_sub41.anInt10158
						  * -1454932011),
						 -1968672599);
		if (Class241_Sub16.method15018(class515, -965805977)) {
		    boolean bool
			= Class449.method7936(class103, class241_sub41,
					      class515, i, i_3_, (byte) 0);
		    if (bool)
			Class576.method12670(class103, class241_sub41,
					     class515, (short) 10415);
		}
	    }
	}
    }
    
    static void method14537() {
	if (WorldTile.anInt10182 * 257473507 < 0) {
	    WorldTile.anInt10182 = 0;
	    anInt8773 = -362944491;
	    anInt8794 = -1265261197;
	}
	if (WorldTile.anInt10182 * 257473507 > anInt7390) {
	    WorldTile.anInt10182 = -1822006837 * anInt7390;
	    anInt8773 = -362944491;
	    anInt8794 = -1265261197;
	}
	if (291545115 * WorldTile.anInt10183 < 0) {
	    WorldTile.anInt10183 = 0;
	    anInt8773 = -362944491;
	    anInt8794 = -1265261197;
	}
	if (291545115 * WorldTile.anInt10183 > anInt7391) {
	    WorldTile.anInt10183 = -1182123501 * anInt7391;
	    anInt8773 = -362944491;
	    anInt8794 = -1265261197;
	}
    }
    
    public static int method14538(int i, int i_4_, int i_5_) {
	if (anInt8787 * -16261253 < 100)
	    return -2;
	int i_6_ = -2;
	int i_7_ = 2147483647;
	int i_8_ = i_4_ - anInt7388;
	int i_9_ = i_5_ - anInt7389;
	for (Class241_Sub41 class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7694(16711935);
	     class241_sub41 != null;
	     class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7692(1810524783)) {
	    if (-1454932011 * class241_sub41.anInt10158 == i) {
		int i_10_ = class241_sub41.anInt10154 * 669485685;
		int i_11_ = -1535798317 * class241_sub41.anInt10152;
		int i_12_ = i_10_ + anInt7388 << 14 | anInt7389 + i_11_;
		int i_13_ = ((i_8_ - i_10_) * (i_8_ - i_10_)
			     + (i_9_ - i_11_) * (i_9_ - i_11_));
		if (i_6_ < 0 || i_13_ < i_7_) {
		    i_6_ = i_12_;
		    i_7_ = i_13_;
		}
	    }
	}
	return i_6_;
    }
    
    public static void method14539(boolean bool) {
	aBool8771 = bool;
    }
    
    public static int method14540(int i) {
	if (anInt8790 * -1310014867 == i)
	    return aBool8774 ? 1 : 0;
	if (i == anInt8767 * 2090457349)
	    return aBool8780 ? 1 : 0;
	if (anInt8768 * -1104278553 == i)
	    return aBool8776 ? 1 : 0;
	return -1;
    }
    
    static void method14541() {
	Class493.method11268(-422489290);
	aClass241_Sub39_Sub12_7405 = null;
	Class423.aClass241_Sub39_Sub12_6067 = null;
	aClass407_8782.method7293(-2039568666);
	aClass407_8788.method7293(-529372903);
	for (int i = 0; i < 3; i++) {
	    for (int i_14_ = 0; i_14_ < 5; i_14_++) {
		aClass96ArrayArray8795[i][i_14_] = null;
		aClass639ArrayArray8784[i][i_14_] = null;
	    }
	}
    }
    
    public static Class241_Sub39_Sub12 method14542() {
	return aClass241_Sub39_Sub12_7405;
    }
    
    static void method14543() {
	Class493.method11268(-1166304746);
	aClass241_Sub39_Sub12_7405 = null;
	Class423.aClass241_Sub39_Sub12_6067 = null;
	aClass407_8782.method7293(101257872);
	aClass407_8788.method7293(1534660612);
	for (int i = 0; i < 3; i++) {
	    for (int i_15_ = 0; i_15_ < 5; i_15_++) {
		aClass96ArrayArray8795[i][i_15_] = null;
		aClass639ArrayArray8784[i][i_15_] = null;
	    }
	}
    }
    
    static void method14544(Class103 class103, int i, int i_16_, int i_17_,
			    int i_18_) {
	class103.method2445(i, i_16_, i_17_ + i, i_18_ + i_16_);
	if (-16261253 * anInt8787 < 100) {
	    int i_19_ = 20;
	    int i_20_ = i_17_ / 2 + i;
	    int i_21_ = i_16_ + i_18_ / 2 - 18 - i_19_;
	    class103.method2396(i, i_16_, i_17_, i_18_, -16777216, 0);
	    class103.method2268(i_20_ - 152, i_21_, 304, 34,
				client.aColorArray8320
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    class103.method2396(i_20_ - 150, 2 + i_21_, -48783759 * anInt8787,
				30,
				client.aColorArray8319
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    Class81.aClass96_1149.method2113
		(ClientMessage.LOADINGDOTDOTDOT.getLocalisedMessage(VarPlayerDomain.currentLocale,
						     (short) 25237),
		 i_20_, i_21_ + i_19_,
		 client.aColorArray8321[client.anInt8414 * 1238854867]
		     .getRGB(),
		 -1, -1128005475);
	} else {
	    int i_22_ = (WorldTile.anInt10182 * 257473507
			 - (int) ((float) i_17_ / aFloat7408));
	    int i_23_ = (291545115 * WorldTile.anInt10183
			 + (int) ((float) i_18_ / aFloat7408));
	    int i_24_ = (WorldTile.anInt10182 * 257473507
			 + (int) ((float) i_17_ / aFloat7408));
	    int i_25_ = (WorldTile.anInt10183 * 291545115
			 - (int) ((float) i_18_ / aFloat7408));
	    Class544.anInt7049
		= (257473507 * WorldTile.anInt10182
		   - (int) ((float) i_17_ / aFloat7408)) * 1401407989;
	    Class545.anInt7050
		= -835767841 * (WorldTile.anInt10183 * 291545115
				- (int) ((float) i_18_ / aFloat7408));
	    Class483.anInt6462
		= -1541102307 * (int) ((float) (2 * i_17_) / aFloat7408);
	    Class583.anInt7583
		= -1595324773 * (int) ((float) (i_18_ * 2) / aFloat7408);
	    aClass129_7414 = aClass129_7412;
	    method12569(anInt7388 + i_22_, i_23_ + anInt7389,
			anInt7388 + i_24_, i_25_ + anInt7389, i, i_16_,
			i_17_ + i, i_18_ + i_16_ + 1);
	    method12570(class103, !aBool8780, !aBool8776, client.isP2pWorld,
			false);
	    NodeCollection class429 = method12577(class103);
	    Class525.method11757(class103, class429, 0, 0, -2115507991);
	    if (client.aBool8449) {
		int i_26_ = i + i_17_ - 5;
		int i_27_ = i_16_ + i_18_ - 8;
		Class5.aClass96_26.method2112
		    (new StringBuilder().append("Fps: ").append
			 (GameShell3.currentFpsRate * 2016113751).append
			 (" (").append
			 (GameShell3.anInt7635 * -2022955371).append
			 (" ms)").toString(),
		     i_26_, i_27_, 16776960, -1, -1675818270);
		i_27_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_28_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_29_ = 16776960;
		if (i_28_ > 65536)
		    i_29_ = 16711680;
		Class5.aClass96_26.method2112(new StringBuilder().append
						  ("Mem:").append
						  (i_28_).append
						  ("k").toString(),
					      i_26_, i_27_, i_29_, -1,
					      -1619418582);
		i_27_ -= 15;
	    }
	    aClass129_7412.clean(5, -2123047386);
	}
    }
    
    static void method14545(int i, int i_30_, int i_31_) {
	if (1008 == i)
	    Class561.method12372(Class614.aClass614_7813, i_30_, i_31_,
				 57862026);
	else if (1009 == i)
	    Class561.method12372(Class614.aClass614_7806, i_30_, i_31_,
				 -389206924);
	else if (i == 1010)
	    Class561.method12372(Class614.aClass614_7807, i_30_, i_31_,
				 646952523);
	else if (i == 1011)
	    Class561.method12372(Class614.aClass614_7819, i_30_, i_31_,
				 1437335250);
	else if (i == 1012)
	    Class561.method12372(Class614.aClass614_7809, i_30_, i_31_,
				 -556443558);
    }
    
    static void method14546(Class103 class103, int i, int i_32_, int i_33_,
			    int i_34_) {
	class103.method2445(i, i_32_, i_33_ + i, i_34_ + i_32_);
	if (-16261253 * anInt8787 < 100) {
	    int i_35_ = 20;
	    int i_36_ = i_33_ / 2 + i;
	    int i_37_ = i_32_ + i_34_ / 2 - 18 - i_35_;
	    class103.method2396(i, i_32_, i_33_, i_34_, -16777216, 0);
	    class103.method2268(i_36_ - 152, i_37_, 304, 34,
				client.aColorArray8320
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    class103.method2396(i_36_ - 150, 2 + i_37_, -48783759 * anInt8787,
				30,
				client.aColorArray8319
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    Class81.aClass96_1149.method2113
		(ClientMessage.LOADINGDOTDOTDOT.getLocalisedMessage(VarPlayerDomain.currentLocale,
						     (short) 24644),
		 i_36_, i_37_ + i_35_,
		 client.aColorArray8321[client.anInt8414 * 1238854867]
		     .getRGB(),
		 -1, -151029166);
	} else {
	    int i_38_ = (WorldTile.anInt10182 * 257473507
			 - (int) ((float) i_33_ / aFloat7408));
	    int i_39_ = (291545115 * WorldTile.anInt10183
			 + (int) ((float) i_34_ / aFloat7408));
	    int i_40_ = (WorldTile.anInt10182 * 257473507
			 + (int) ((float) i_33_ / aFloat7408));
	    int i_41_ = (WorldTile.anInt10183 * 291545115
			 - (int) ((float) i_34_ / aFloat7408));
	    Class544.anInt7049
		= (257473507 * WorldTile.anInt10182
		   - (int) ((float) i_33_ / aFloat7408)) * 1401407989;
	    Class545.anInt7050
		= -835767841 * (WorldTile.anInt10183 * 291545115
				- (int) ((float) i_34_ / aFloat7408));
	    Class483.anInt6462
		= -1541102307 * (int) ((float) (2 * i_33_) / aFloat7408);
	    Class583.anInt7583
		= -1595324773 * (int) ((float) (i_34_ * 2) / aFloat7408);
	    aClass129_7414 = aClass129_7412;
	    method12569(anInt7388 + i_38_, i_39_ + anInt7389,
			anInt7388 + i_40_, i_41_ + anInt7389, i, i_32_,
			i_33_ + i, i_34_ + i_32_ + 1);
	    method12570(class103, !aBool8780, !aBool8776, client.isP2pWorld,
			false);
	    NodeCollection class429 = method12577(class103);
	    Class525.method11757(class103, class429, 0, 0, -1896042790);
	    if (client.aBool8449) {
		int i_42_ = i + i_33_ - 5;
		int i_43_ = i_32_ + i_34_ - 8;
		Class5.aClass96_26.method2112
		    (new StringBuilder().append("Fps: ").append
			 (GameShell3.currentFpsRate * 2016113751).append
			 (" (").append
			 (GameShell3.anInt7635 * -2022955371).append
			 (" ms)").toString(),
		     i_42_, i_43_, 16776960, -1, -1930142077);
		i_43_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_44_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_45_ = 16776960;
		if (i_44_ > 65536)
		    i_45_ = 16711680;
		Class5.aClass96_26.method2112(new StringBuilder().append
						  ("Mem:").append
						  (i_44_).append
						  ("k").toString(),
					      i_42_, i_43_, i_45_, -1,
					      -1823170682);
		i_43_ -= 15;
	    }
	    aClass129_7412.clean(5, -2060341404);
	}
    }
    
    static void method14547(Class103 class103, int i, int i_46_, int i_47_,
			    int i_48_) {
	class103.method2445(i, i_46_, i_47_ + i, i_48_ + i_46_);
	if (-16261253 * anInt8787 < 100) {
	    int i_49_ = 20;
	    int i_50_ = i_47_ / 2 + i;
	    int i_51_ = i_46_ + i_48_ / 2 - 18 - i_49_;
	    class103.method2396(i, i_46_, i_47_, i_48_, -16777216, 0);
	    class103.method2268(i_50_ - 152, i_51_, 304, 34,
				client.aColorArray8320
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    class103.method2396(i_50_ - 150, 2 + i_51_, -48783759 * anInt8787,
				30,
				client.aColorArray8319
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    Class81.aClass96_1149.method2113
		(ClientMessage.LOADINGDOTDOTDOT.getLocalisedMessage(VarPlayerDomain.currentLocale,
						     (short) 21917),
		 i_50_, i_51_ + i_49_,
		 client.aColorArray8321[client.anInt8414 * 1238854867]
		     .getRGB(),
		 -1, 1209582144);
	} else {
	    int i_52_ = (WorldTile.anInt10182 * 257473507
			 - (int) ((float) i_47_ / aFloat7408));
	    int i_53_ = (291545115 * WorldTile.anInt10183
			 + (int) ((float) i_48_ / aFloat7408));
	    int i_54_ = (WorldTile.anInt10182 * 257473507
			 + (int) ((float) i_47_ / aFloat7408));
	    int i_55_ = (WorldTile.anInt10183 * 291545115
			 - (int) ((float) i_48_ / aFloat7408));
	    Class544.anInt7049
		= (257473507 * WorldTile.anInt10182
		   - (int) ((float) i_47_ / aFloat7408)) * 1401407989;
	    Class545.anInt7050
		= -835767841 * (WorldTile.anInt10183 * 291545115
				- (int) ((float) i_48_ / aFloat7408));
	    Class483.anInt6462
		= -1541102307 * (int) ((float) (2 * i_47_) / aFloat7408);
	    Class583.anInt7583
		= -1595324773 * (int) ((float) (i_48_ * 2) / aFloat7408);
	    aClass129_7414 = aClass129_7412;
	    method12569(anInt7388 + i_52_, i_53_ + anInt7389,
			anInt7388 + i_54_, i_55_ + anInt7389, i, i_46_,
			i_47_ + i, i_48_ + i_46_ + 1);
	    method12570(class103, !aBool8780, !aBool8776, client.isP2pWorld,
			false);
	    NodeCollection class429 = method12577(class103);
	    Class525.method11757(class103, class429, 0, 0, -1702364487);
	    if (client.aBool8449) {
		int i_56_ = i + i_47_ - 5;
		int i_57_ = i_46_ + i_48_ - 8;
		Class5.aClass96_26.method2112
		    (new StringBuilder().append("Fps: ").append
			 (GameShell3.currentFpsRate * 2016113751).append
			 (" (").append
			 (GameShell3.anInt7635 * -2022955371).append
			 (" ms)").toString(),
		     i_56_, i_57_, 16776960, -1, -2045013321);
		i_57_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_58_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_59_ = 16776960;
		if (i_58_ > 65536)
		    i_59_ = 16711680;
		Class5.aClass96_26.method2112(new StringBuilder().append
						  ("Mem:").append
						  (i_58_).append
						  ("k").toString(),
					      i_56_, i_57_, i_59_, -1,
					      -2006377322);
		i_57_ -= 15;
	    }
	    aClass129_7412.clean(5, -2085859753);
	}
    }
    
    static void method14548(Class103 class103, int i, int i_60_, int i_61_,
			    int i_62_) {
	class103.method2445(i, i_60_, i_61_ + i, i_62_ + i_60_);
	if (-16261253 * anInt8787 < 100) {
	    int i_63_ = 20;
	    int i_64_ = i_61_ / 2 + i;
	    int i_65_ = i_60_ + i_62_ / 2 - 18 - i_63_;
	    class103.method2396(i, i_60_, i_61_, i_62_, -16777216, 0);
	    class103.method2268(i_64_ - 152, i_65_, 304, 34,
				client.aColorArray8320
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    class103.method2396(i_64_ - 150, 2 + i_65_, -48783759 * anInt8787,
				30,
				client.aColorArray8319
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    Class81.aClass96_1149.method2113
		(ClientMessage.LOADINGDOTDOTDOT.getLocalisedMessage(VarPlayerDomain.currentLocale,
						     (short) 20451),
		 i_64_, i_65_ + i_63_,
		 client.aColorArray8321[client.anInt8414 * 1238854867]
		     .getRGB(),
		 -1, -1223099478);
	} else {
	    int i_66_ = (WorldTile.anInt10182 * 257473507
			 - (int) ((float) i_61_ / aFloat7408));
	    int i_67_ = (291545115 * WorldTile.anInt10183
			 + (int) ((float) i_62_ / aFloat7408));
	    int i_68_ = (WorldTile.anInt10182 * 257473507
			 + (int) ((float) i_61_ / aFloat7408));
	    int i_69_ = (WorldTile.anInt10183 * 291545115
			 - (int) ((float) i_62_ / aFloat7408));
	    Class544.anInt7049
		= (257473507 * WorldTile.anInt10182
		   - (int) ((float) i_61_ / aFloat7408)) * 1401407989;
	    Class545.anInt7050
		= -835767841 * (WorldTile.anInt10183 * 291545115
				- (int) ((float) i_62_ / aFloat7408));
	    Class483.anInt6462
		= -1541102307 * (int) ((float) (2 * i_61_) / aFloat7408);
	    Class583.anInt7583
		= -1595324773 * (int) ((float) (i_62_ * 2) / aFloat7408);
	    aClass129_7414 = aClass129_7412;
	    method12569(anInt7388 + i_66_, i_67_ + anInt7389,
			anInt7388 + i_68_, i_69_ + anInt7389, i, i_60_,
			i_61_ + i, i_62_ + i_60_ + 1);
	    method12570(class103, !aBool8780, !aBool8776, client.isP2pWorld,
			false);
	    NodeCollection class429 = method12577(class103);
	    Class525.method11757(class103, class429, 0, 0, -1577788326);
	    if (client.aBool8449) {
		int i_70_ = i + i_61_ - 5;
		int i_71_ = i_60_ + i_62_ - 8;
		Class5.aClass96_26.method2112
		    (new StringBuilder().append("Fps: ").append
			 (GameShell3.currentFpsRate * 2016113751).append
			 (" (").append
			 (GameShell3.anInt7635 * -2022955371).append
			 (" ms)").toString(),
		     i_70_, i_71_, 16776960, -1, -1919553233);
		i_71_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_72_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_73_ = 16776960;
		if (i_72_ > 65536)
		    i_73_ = 16711680;
		Class5.aClass96_26.method2112(new StringBuilder().append
						  ("Mem:").append
						  (i_72_).append
						  ("k").toString(),
					      i_70_, i_71_, i_73_, -1,
					      -1780805762);
		i_71_ -= 15;
	    }
	    aClass129_7412.clean(5, -2067837123);
	}
    }
    
    static void method14549(Class103 class103, int i, int i_74_, int i_75_,
			    int i_76_) {
	class103.method2445(i, i_74_, i_75_ + i, i_76_ + i_74_);
	if (-16261253 * anInt8787 < 100) {
	    int i_77_ = 20;
	    int i_78_ = i_75_ / 2 + i;
	    int i_79_ = i_74_ + i_76_ / 2 - 18 - i_77_;
	    class103.method2396(i, i_74_, i_75_, i_76_, -16777216, 0);
	    class103.method2268(i_78_ - 152, i_79_, 304, 34,
				client.aColorArray8320
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    class103.method2396(i_78_ - 150, 2 + i_79_, -48783759 * anInt8787,
				30,
				client.aColorArray8319
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    Class81.aClass96_1149.method2113
		(ClientMessage.LOADINGDOTDOTDOT.getLocalisedMessage(VarPlayerDomain.currentLocale,
						     (short) 30135),
		 i_78_, i_79_ + i_77_,
		 client.aColorArray8321[client.anInt8414 * 1238854867]
		     .getRGB(),
		 -1, -851583174);
	} else {
	    int i_80_ = (WorldTile.anInt10182 * 257473507
			 - (int) ((float) i_75_ / aFloat7408));
	    int i_81_ = (291545115 * WorldTile.anInt10183
			 + (int) ((float) i_76_ / aFloat7408));
	    int i_82_ = (WorldTile.anInt10182 * 257473507
			 + (int) ((float) i_75_ / aFloat7408));
	    int i_83_ = (WorldTile.anInt10183 * 291545115
			 - (int) ((float) i_76_ / aFloat7408));
	    Class544.anInt7049
		= (257473507 * WorldTile.anInt10182
		   - (int) ((float) i_75_ / aFloat7408)) * 1401407989;
	    Class545.anInt7050
		= -835767841 * (WorldTile.anInt10183 * 291545115
				- (int) ((float) i_76_ / aFloat7408));
	    Class483.anInt6462
		= -1541102307 * (int) ((float) (2 * i_75_) / aFloat7408);
	    Class583.anInt7583
		= -1595324773 * (int) ((float) (i_76_ * 2) / aFloat7408);
	    aClass129_7414 = aClass129_7412;
	    method12569(anInt7388 + i_80_, i_81_ + anInt7389,
			anInt7388 + i_82_, i_83_ + anInt7389, i, i_74_,
			i_75_ + i, i_76_ + i_74_ + 1);
	    method12570(class103, !aBool8780, !aBool8776, client.isP2pWorld,
			false);
	    NodeCollection class429 = method12577(class103);
	    Class525.method11757(class103, class429, 0, 0, -1584040289);
	    if (client.aBool8449) {
		int i_84_ = i + i_75_ - 5;
		int i_85_ = i_74_ + i_76_ - 8;
		Class5.aClass96_26.method2112
		    (new StringBuilder().append("Fps: ").append
			 (GameShell3.currentFpsRate * 2016113751).append
			 (" (").append
			 (GameShell3.anInt7635 * -2022955371).append
			 (" ms)").toString(),
		     i_84_, i_85_, 16776960, -1, -1843436164);
		i_85_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_86_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_87_ = 16776960;
		if (i_86_ > 65536)
		    i_87_ = 16711680;
		Class5.aClass96_26.method2112(new StringBuilder().append
						  ("Mem:").append
						  (i_86_).append
						  ("k").toString(),
					      i_84_, i_85_, i_87_, -1,
					      -2123464755);
		i_85_ -= 15;
	    }
	    aClass129_7412.clean(5, -2133098639);
	}
    }
    
    static void method14550(int i, int i_88_, int i_89_, int i_90_) {
	float f = (float) anInt7391 / (float) anInt7390;
	int i_91_ = i_89_;
	int i_92_ = i_90_;
	if (f < 1.0F)
	    i_92_ = (int) ((float) i_89_ * f);
	else
	    i_91_ = (int) ((float) i_90_ / f);
	i -= (i_89_ - i_91_) / 2;
	i_88_ -= (i_90_ - i_92_) / 2;
	WorldTile.anInt10182 = -1822006837 * (anInt7390 * i / i_91_);
	WorldTile.anInt10183
	    = -1182123501 * (anInt7391 - i_88_ * anInt7391 / i_92_);
	anInt8773 = -362944491;
	anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    static void method14551(Class103 class103, Class241_Sub41 class241_sub41,
			    Class515 class515) {
	Class168 class168 = class515.method11584(class103, -148240626);
	if (class168 != null) {
	    int i = class168.method3631();
	    if (class168.method3606() > i)
		i = class168.method3606();
	    int i_93_ = 10;
	    int i_94_ = class241_sub41.anInt10156 * 843218033;
	    int i_95_ = -464680849 * class241_sub41.anInt10157;
	    int i_96_ = 0;
	    int i_97_ = 0;
	    if (class515.aString6756 != null) {
		i_97_
		    = Class40.aClass639_594.method13596(class515.aString6756,
							(-1080559003
							 * Class494.canvasWid),
							0, null, -2140141889);
		i_96_ = Class40.aClass639_594.method13567(class515.aString6756,
							  (Class494.canvasWid
							   * -1080559003),
							  null, 191976802);
	    }
	    int i_98_ = 843218033 * class241_sub41.anInt10156 + i / 2;
	    int i_99_ = class241_sub41.anInt10157 * -464680849;
	    if (i_94_ < anInt7430 + i) {
		i_94_ = anInt7430;
		i_98_ = i_96_ / 2 + (i_93_ + (anInt7430 + i / 2)) + 5;
	    } else if (i_94_ > anInt7395 - i) {
		i_94_ = anInt7395 - i;
		i_98_ = anInt7395 - i / 2 - i_93_ - i_96_ / 2 - 5;
	    }
	    if (i_95_ < i + anInt7431) {
		i_95_ = anInt7431;
		i_99_ = anInt7431 + i_93_ + i / 2;
	    } else if (i_95_ > anInt7425 - i) {
		i_95_ = anInt7425 - i;
		i_99_ = anInt7425 - i / 2 - i_93_ - i_97_;
	    }
	    int i_100_
		= ((int) (Math.atan2((double) (i_94_
					       - 843218033 * (class241_sub41
							      .anInt10156)),
				     (double) (i_95_
					       - (class241_sub41.anInt10157
						  * -464680849)))
			  / 3.141592653589793 * 32767.0)
		   & 0xffff);
	    class168.method3620((float) i_94_ + (float) i / 2.0F,
				(float) i / 2.0F + (float) i_95_, 4096,
				i_100_);
	    int i_101_ = -2;
	    int i_102_ = -2;
	    int i_103_ = -2;
	    int i_104_ = -2;
	    if (null != class515.aString6756) {
		i_101_ = i_98_ - i_96_ / 2 - 5;
		i_102_ = i_99_;
		i_103_ = 10 + (i_96_ + i_101_);
		i_104_ = 3 + (i_102_ + i_97_);
		if (153554575 * class515.anInt6741 != 0)
		    class103.method2263(i_101_, i_102_, i_103_ - i_101_,
					i_104_ - i_102_,
					153554575 * class515.anInt6741,
					(byte) -54);
		if (0 != 1284846821 * class515.anInt6767)
		    class103.method2262(i_101_, i_102_, i_103_ - i_101_,
					i_104_ - i_102_,
					class515.anInt6767 * 1284846821,
					-1388184652);
		Class355.aClass96_5452.method2114
		    (class515.aString6756, i_98_, i_99_, i_96_, i_97_,
		     ~0xffffff | 2101573455 * class515.anInt6750,
		     -105193781 * aClass497_7374.anInt6545, 1, 0, 0, null,
		     null, null, 0, 0, 1994880660);
	    }
	    if (-1 != -705700883 * class515.anInt6772
		|| class515.aString6756 != null) {
		Class241_Sub46 class241_sub46
		    = new Class241_Sub46(class241_sub41);
		((Class241_Sub46) class241_sub46).anInt10269
		    = -325331477 * (i_94_ - i / 2);
		((Class241_Sub46) class241_sub46).anInt10268
		    = (i_94_ + i / 2) * 781884803;
		((Class241_Sub46) class241_sub46).anInt10275
		    = (i_95_ - i) * -645579975;
		((Class241_Sub46) class241_sub46).anInt10267
		    = i_95_ * -1470931421;
		((Class241_Sub46) class241_sub46).anInt10270
		    = 492641787 * i_101_;
		((Class241_Sub46) class241_sub46).anInt10272
		    = -717652979 * i_103_;
		((Class241_Sub46) class241_sub46).anInt10271
		    = i_102_ * -1274657791;
		((Class241_Sub46) class241_sub46).anInt10274
		    = 872919199 * i_104_;
		Class120_Sub23.aClass429_10631.addNode(class241_sub46,
							  (short) -13909);
	    }
	}
    }
    
    static boolean method14552(Class515 class515) {
	if (class515 == null)
	    return false;
	if (!class515.aBool6743)
	    return false;
	if (!class515.method11587(anInterface13_7373, anInterface11_7372,
				  -1629182948))
	    return false;
	if (aClass407_8782.get((long) (-1948486001
					      * class515.anInt6731))
	    != null)
	    return false;
	if (aClass407_8788.get((long) (-1123109927
					      * class515.anInt6770))
	    != null)
	    return false;
	if (null != class515.aString6756) {
	    if (0 == class515.anInt6760 * 723243945 && aBool8772)
		return false;
	    if (723243945 * class515.anInt6760 == 1 && aBool8791)
		return false;
	    if (class515.anInt6760 * 723243945 == 2 && aBool8792)
		return false;
	}
	return true;
    }
    
    static void method14553(boolean bool) {
	GameScene class522 = Class21.myPlayer
				.method17801(2139718603);
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = method12651(127679513 * class522.baseX,
			  class522.baseY * 468558693);
	if (null == class241_sub39_sub12)
	    class241_sub39_sub12
		= method12560(aClass497_7374.anInt6529 * -431953051);
	if (Class423.aClass241_Sub39_Sub12_6067 != class241_sub39_sub12
	    || bool) {
	    Class423.aClass241_Sub39_Sub12_6067 = class241_sub39_sub12;
	    boolean bool_105_ = method12558(class241_sub39_sub12);
	    if (bool_105_) {
		aBool7423 = true;
		Class493.method11268(-1123184708);
	    }
	}
    }
    
    static void method14554(Class103 class103, Class241_Sub41 class241_sub41,
			    Class515 class515) {
	Class168 class168 = class515.method11584(class103, -659212177);
	if (class168 != null) {
	    int i = class168.method3631();
	    if (class168.method3606() > i)
		i = class168.method3606();
	    int i_106_ = 10;
	    int i_107_ = class241_sub41.anInt10156 * 843218033;
	    int i_108_ = -464680849 * class241_sub41.anInt10157;
	    int i_109_ = 0;
	    int i_110_ = 0;
	    if (class515.aString6756 != null) {
		i_110_
		    = Class40.aClass639_594.method13596(class515.aString6756,
							(-1080559003
							 * Class494.canvasWid),
							0, null, -1017059497);
		i_109_
		    = Class40.aClass639_594.method13567(class515.aString6756,
							(Class494.canvasWid
							 * -1080559003),
							null, -1913375430);
	    }
	    int i_111_ = 843218033 * class241_sub41.anInt10156 + i / 2;
	    int i_112_ = class241_sub41.anInt10157 * -464680849;
	    if (i_107_ < anInt7430 + i) {
		i_107_ = anInt7430;
		i_111_ = i_109_ / 2 + (i_106_ + (anInt7430 + i / 2)) + 5;
	    } else if (i_107_ > anInt7395 - i) {
		i_107_ = anInt7395 - i;
		i_111_ = anInt7395 - i / 2 - i_106_ - i_109_ / 2 - 5;
	    }
	    if (i_108_ < i + anInt7431) {
		i_108_ = anInt7431;
		i_112_ = anInt7431 + i_106_ + i / 2;
	    } else if (i_108_ > anInt7425 - i) {
		i_108_ = anInt7425 - i;
		i_112_ = anInt7425 - i / 2 - i_106_ - i_110_;
	    }
	    int i_113_
		= ((int) (Math.atan2((double) (i_107_
					       - 843218033 * (class241_sub41
							      .anInt10156)),
				     (double) (i_108_
					       - (class241_sub41.anInt10157
						  * -464680849)))
			  / 3.141592653589793 * 32767.0)
		   & 0xffff);
	    class168.method3620((float) i_107_ + (float) i / 2.0F,
				(float) i / 2.0F + (float) i_108_, 4096,
				i_113_);
	    int i_114_ = -2;
	    int i_115_ = -2;
	    int i_116_ = -2;
	    int i_117_ = -2;
	    if (null != class515.aString6756) {
		i_114_ = i_111_ - i_109_ / 2 - 5;
		i_115_ = i_112_;
		i_116_ = 10 + (i_109_ + i_114_);
		i_117_ = 3 + (i_115_ + i_110_);
		if (153554575 * class515.anInt6741 != 0)
		    class103.method2263(i_114_, i_115_, i_116_ - i_114_,
					i_117_ - i_115_,
					153554575 * class515.anInt6741,
					(byte) -126);
		if (0 != 1284846821 * class515.anInt6767)
		    class103.method2262(i_114_, i_115_, i_116_ - i_114_,
					i_117_ - i_115_,
					class515.anInt6767 * 1284846821,
					-779130938);
		Class355.aClass96_5452.method2114
		    (class515.aString6756, i_111_, i_112_, i_109_, i_110_,
		     ~0xffffff | 2101573455 * class515.anInt6750,
		     -105193781 * aClass497_7374.anInt6545, 1, 0, 0, null,
		     null, null, 0, 0, 956679151);
	    }
	    if (-1 != -705700883 * class515.anInt6772
		|| class515.aString6756 != null) {
		Class241_Sub46 class241_sub46
		    = new Class241_Sub46(class241_sub41);
		((Class241_Sub46) class241_sub46).anInt10269
		    = -325331477 * (i_107_ - i / 2);
		((Class241_Sub46) class241_sub46).anInt10268
		    = (i_107_ + i / 2) * 781884803;
		((Class241_Sub46) class241_sub46).anInt10275
		    = (i_108_ - i) * -645579975;
		((Class241_Sub46) class241_sub46).anInt10267
		    = i_108_ * -1470931421;
		((Class241_Sub46) class241_sub46).anInt10270
		    = 492641787 * i_114_;
		((Class241_Sub46) class241_sub46).anInt10272
		    = -717652979 * i_116_;
		((Class241_Sub46) class241_sub46).anInt10271
		    = i_115_ * -1274657791;
		((Class241_Sub46) class241_sub46).anInt10274
		    = 872919199 * i_117_;
		Class120_Sub23.aClass429_10631.addNode(class241_sub46,
							  (short) -22305);
	    }
	}
    }
    
    static void method14555(int i) {
	int i_118_;
	if (0 == i)
	    i_118_ = 0;
	else if (i == 1)
	    i_118_ = 1;
	else if (i == 2)
	    i_118_ = 2;
	else
	    return;
	int i_119_;
	if (2.0 == (double) aFloat7402)
	    i_119_ = 0;
	else if (3.0 == (double) aFloat7402)
	    i_119_ = 1;
	else if (4.0 == (double) aFloat7402)
	    i_119_ = 2;
	else if ((double) aFloat7402 == 6.0)
	    i_119_ = 3;
	else if ((double) aFloat7402 >= 8.0)
	    i_119_ = 4;
	else
	    return;
	Class355.aClass96_5452 = aClass96ArrayArray8795[i_118_][i_119_];
	Class40.aClass639_594 = aClass639ArrayArray8784[i_118_][i_119_];
    }
    
    static void method14556(int i) {
	int i_120_;
	if (0 == i)
	    i_120_ = 0;
	else if (i == 1)
	    i_120_ = 1;
	else if (i == 2)
	    i_120_ = 2;
	else
	    return;
	int i_121_;
	if (2.0 == (double) aFloat7402)
	    i_121_ = 0;
	else if (3.0 == (double) aFloat7402)
	    i_121_ = 1;
	else if (4.0 == (double) aFloat7402)
	    i_121_ = 2;
	else if ((double) aFloat7402 == 6.0)
	    i_121_ = 3;
	else if ((double) aFloat7402 >= 8.0)
	    i_121_ = 4;
	else
	    return;
	Class355.aClass96_5452 = aClass96ArrayArray8795[i_120_][i_121_];
	Class40.aClass639_594 = aClass639ArrayArray8784[i_120_][i_121_];
    }
    
    static void method14557(int i) {
	int i_122_;
	if (0 == i)
	    i_122_ = 0;
	else if (i == 1)
	    i_122_ = 1;
	else if (i == 2)
	    i_122_ = 2;
	else
	    return;
	int i_123_;
	if (2.0 == (double) aFloat7402)
	    i_123_ = 0;
	else if (3.0 == (double) aFloat7402)
	    i_123_ = 1;
	else if (4.0 == (double) aFloat7402)
	    i_123_ = 2;
	else if ((double) aFloat7402 == 6.0)
	    i_123_ = 3;
	else if ((double) aFloat7402 >= 8.0)
	    i_123_ = 4;
	else
	    return;
	Class355.aClass96_5452 = aClass96ArrayArray8795[i_122_][i_123_];
	Class40.aClass639_594 = aClass639ArrayArray8784[i_122_][i_123_];
    }
    
    static void method14558(int i) {
	int i_124_;
	if (0 == i)
	    i_124_ = 0;
	else if (i == 1)
	    i_124_ = 1;
	else if (i == 2)
	    i_124_ = 2;
	else
	    return;
	int i_125_;
	if (2.0 == (double) aFloat7402)
	    i_125_ = 0;
	else if (3.0 == (double) aFloat7402)
	    i_125_ = 1;
	else if (4.0 == (double) aFloat7402)
	    i_125_ = 2;
	else if ((double) aFloat7402 == 6.0)
	    i_125_ = 3;
	else if ((double) aFloat7402 >= 8.0)
	    i_125_ = 4;
	else
	    return;
	Class355.aClass96_5452 = aClass96ArrayArray8795[i_124_][i_125_];
	Class40.aClass639_594 = aClass639ArrayArray8784[i_124_][i_125_];
    }
    
    static void method14559(Class103 class103, Class241_Sub41 class241_sub41,
			    Class515 class515, int i, int i_126_, int i_127_,
			    int i_128_) {
	int i_129_ = i - 5;
	int i_130_ = i_126_ + 2;
	if (0 != 153554575 * class515.anInt6741)
	    class103.method2263(i_129_, i_130_, i_128_ + 10,
				i_126_ + i_127_ - i_130_ + 1,
				153554575 * class515.anInt6741, (byte) -110);
	if (0 != class515.anInt6767 * 1284846821)
	    class103.method2262(i_129_, i_130_, i_128_ + 10,
				1 + (i_127_ + i_126_ - i_130_),
				1284846821 * class515.anInt6767, -1585639371);
	int i_131_ = class515.anInt6750 * 2101573455;
	if (class241_sub41.aBool10155
	    && class515.anInt6736 * -2126282339 != -1)
	    i_131_ = class515.anInt6736 * -2126282339;
	Class355.aClass96_5452.method2114(class515.aString6756, i, i_126_,
					  i_128_, i_127_, ~0xffffff | i_131_,
					  (aClass497_7374.anInt6545
					   * -105193781),
					  1, 0, 0, null, null, null, 0, 0,
					  -1934371984);
    }
    
    static final void method14560(Class103 class103, Class107 class107) {
	if (-16261253 * anInt8787 != 100
	    && aClass241_Sub39_Sub12_7405 != null) {
	    Class50.method1249((byte) 1);
	    Class50.method1249((byte) 1);
	    if (anInt8787 * -16261253 < 10) {
		for (int i = 0; i < aClass96ArrayArray8795.length; i++) {
		    for (int i_132_ = 0;
			 i_132_ < aClass96ArrayArray8795[i].length; i_132_++) {
			Class284.SPRITES_ARCHIVE.method4250
			    (aClass497_7374.anIntArrayArray6547[i][i_132_],
			     1014917000);
			Class120_Sub7.FONTS_ARCHIVE.method4250
			    (aClass497_7374.anIntArrayArray6547[i][i_132_],
			     396189537);
		    }
		}
		if (!aClass210_7376.containerIdentifierExists((aClass241_Sub39_Sub12_7405
						.aString10922),
					       1255302737)) {
		    anInt8787 = (Class608.WORLD_MAP_ARCHIVE.method4210
				 (aClass241_Sub39_Sub12_7405.aString10922,
				  -1546404285)) / 10 * 594094003;
		    return;
		}
		anInt8787 = 1645972734;
	    }
	    if (10 == anInt8787 * -16261253) {
		anInt7388 = (219733397 * aClass241_Sub39_Sub12_7405.anInt10931
			     >> 6 << 6);
		anInt7389
		    = (-1017960145 * aClass241_Sub39_Sub12_7405.anInt10930 >> 6
		       << 6);
		anInt7390 = 64 + (((-1741001739
				    * aClass241_Sub39_Sub12_7405.anInt10929)
				   >> 6 << 6)
				  - anInt7388);
		anInt7391 = (aClass241_Sub39_Sub12_7405.anInt10924 * 1587526511
			     >> 6 << 6) - anInt7389 + 64;
		int[] is = new int[3];
		int i = -1;
		int i_133_ = -1;
		Class287 class287
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386);
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		if (aClass241_Sub39_Sub12_7405.method17257
		    (Class21.myPlayer.nodePlane,
		     (((int) class287.aFloat4477 >> 9)
		      + class522.baseX * 127679513),
		     (((int) class287.aFloat4479 >> 9)
		      + class522.baseY * 468558693),
		     is, -634702195)) {
		    i = is[1] - anInt7388;
		    i_133_ = is[2] - anInt7389;
		}
		if (!aBool8778 && i >= 0 && i < anInt7390 && i_133_ >= 0
		    && i_133_ < anInt7391) {
		    i += (int) (Math.random() * 10.0) - 5;
		    i_133_ += (int) (Math.random() * 10.0) - 5;
		    WorldTile.anInt10182 = -1822006837 * i;
		    WorldTile.anInt10183 = i_133_ * -1182123501;
		} else if (-1 != anInt8779 * -1451463477
			   && -1 != -1595136465 * anInt8777) {
		    aClass241_Sub39_Sub12_7405.method17256((anInt8779
							    * -1451463477),
							   (anInt8777
							    * -1595136465),
							   is, -1836931429);
		    if (is != null) {
			WorldTile.anInt10182
			    = -1822006837 * (is[1] - anInt7388);
			WorldTile.anInt10183
			    = (is[2] - anInt7389) * -1182123501;
		    }
		    anInt8777 = 174268209;
		    anInt8779 = -450468067;
		    aBool8778 = false;
		} else {
		    aClass241_Sub39_Sub12_7405.method17256
			((aClass241_Sub39_Sub12_7405.anInt10928 * 519913137
			  >> 14) & 0x3fff,
			 (aClass241_Sub39_Sub12_7405.anInt10928 * 519913137
			  & 0x3fff),
			 is, 183490476);
		    WorldTile.anInt10182
			= -1822006837 * (is[1] - anInt7388);
		    WorldTile.anInt10183
			= -1182123501 * (is[2] - anInt7389);
		}
		if (25 == 414094675 * aClass241_Sub39_Sub12_7405.anInt10927) {
		    aFloat7408 = 2.0F;
		    aFloat7402 = 2.0F;
		} else if (aClass241_Sub39_Sub12_7405.anInt10927 * 414094675
			   == 37) {
		    aFloat7408 = 3.0F;
		    aFloat7402 = 3.0F;
		} else if (aClass241_Sub39_Sub12_7405.anInt10927 * 414094675
			   == 50) {
		    aFloat7408 = 4.0F;
		    aFloat7402 = 4.0F;
		} else if (aClass241_Sub39_Sub12_7405.anInt10927 * 414094675
			   == 75) {
		    aFloat7408 = 6.0F;
		    aFloat7402 = 6.0F;
		} else if (414094675 * aClass241_Sub39_Sub12_7405.anInt10927
			   == 100) {
		    aFloat7408 = 8.0F;
		    aFloat7402 = 8.0F;
		} else if (200 == (414094675
				   * aClass241_Sub39_Sub12_7405.anInt10927)) {
		    aFloat7408 = 16.0F;
		    aFloat7402 = 16.0F;
		} else {
		    aFloat7408 = 8.0F;
		    aFloat7402 = 8.0F;
		}
		anInt7381 = (int) aFloat7402 >> 1;
		aByteArrayArrayArray7380
		    = Class336.method6078(anInt7381, 828272915);
		Class288.method5661(497318259);
		method12555();
		Class120_Sub23.aClass429_10631 = new NodeCollection();
		anInt7384 += (int) (Math.random() * 5.0) - 2;
		if (anInt7384 < -8)
		    anInt7384 = -8;
		if (anInt7384 > 8)
		    anInt7384 = 8;
		anInt7433 += (int) (Math.random() * 5.0) - 2;
		if (anInt7433 < -16)
		    anInt7433 = -16;
		if (anInt7433 > 16)
		    anInt7433 = 16;
		method12584(class107, anInt7384 >> 2 << 10, anInt7433 >> 1);
		aClass524_7370.method11737(1024, 256, 2131649029);
		aClass598_7436.method13124(256, 256, -960851021);
		aClass532_7421.method11853(4096, 1141357207);
		Class541.aClass199_Sub1_7008.method16869(256, 261015552);
		anInt8787 = -1003021828;
	    } else if (20 == anInt8787 * -16261253) {
		if (aBool7423) {
		    if (method12564(class103, anInt7384, anInt7433, aBool7423))
			anInt8787 = 1285901812;
		} else {
		    Class572.method12549(true, 2058410300);
		    method12564(class103, anInt7384, anInt7433, aBool7423);
		    anInt8787 = 1285901812;
		    Class572.method12549(true, 1994940414);
		    SoundManager.method1241(1482319719);
		}
	    } else if (60 == anInt8787 * -16261253) {
		if (aClass210_7376.method4204(new StringBuilder().append
						  (aClass241_Sub39_Sub12_7405
						   .aString10922)
						  .append
						  ("_staticelements")
						  .toString(),
					      931855259)) {
		    if (!aClass210_7376.containerIdentifierExists
			 (new StringBuilder().append
			      (aClass241_Sub39_Sub12_7405.aString10922).append
			      ("_staticelements").toString(),
			  -187106852))
			return;
		    aClass564_7386
			= Class349.method6233(aClass210_7376,
					      new StringBuilder().append
						  (aClass241_Sub39_Sub12_7405
						   .aString10922)
						  .append
						  ("_staticelements")
						  .toString(),
					      client.isP2pWorld, (byte) 88);
		} else
		    aClass564_7386 = new Class564(0);
		method12640();
		anInt8787 = -1363092750;
		Class572.method12549(true, 1958985989);
		SoundManager.method1241(1482319719);
	    } else if (anInt8787 * -16261253 >= 70) {
		for (int i = 0; i < 3; i++) {
		    for (int i_134_ = 0; i_134_ < 5; i_134_++) {
			if (null == aClass96ArrayArray8795[i][i_134_]
			    || aClass639ArrayArray8784[i][i_134_] == null) {
			    aClass96ArrayArray8795[i][i_134_]
				= (Class96) (Class425.aClass344_6080.method6161
					     (client.anInterface26_8552,
					      (aClass497_7374
					       .anIntArrayArray6547[i]
					       [i_134_]),
					      true, true, -625187526));
			    aClass639ArrayArray8784[i][i_134_]
				= Class482.method11026((Class120_Sub7
							.FONTS_ARCHIVE),
						       (aClass497_7374
							.anIntArrayArray6547[i]
							[i_134_]),
						       -622347118);
			    if (null != aClass96ArrayArray8795[i][i_134_]
				&& null != aClass639ArrayArray8784[i][i_134_])
				anInt8787 += 1782282009;
			    else
				return;
			}
		    }
		}
		anInt8787 = -720141844;
		System.gc();
	    }
	}
    }
    
    static final void method14561(Class103 class103, int i, int i_135_,
				  int i_136_, int i_137_) {
	class103.method2445(i, i_135_, i_136_ + i, i_135_ + i_137_);
	class103.method2263(i, i_135_, i_136_, i_137_, -16777216, (byte) -18);
	if (-16261253 * anInt8787 >= 100) {
	    float f = (float) anInt7391 / (float) anInt7390;
	    int i_138_ = i_136_;
	    int i_139_ = i_137_;
	    if (f < 1.0F)
		i_139_ = (int) (f * (float) i_136_);
	    else
		i_138_ = (int) ((float) i_137_ / f);
	    i += (i_136_ - i_138_) / 2;
	    i_135_ += (i_137_ - i_139_) / 2;
	    if (Class117.aClass168_1554 == null
		|| Class117.aClass168_1554.method3631() != i_138_
		|| Class117.aClass168_1554.method3606() != i_139_) {
		aClass129_7414 = aClass129_7413;
		method12569(anInt7388, anInt7391 + anInt7389,
			    anInt7390 + anInt7388, anInt7389, i, i_135_,
			    i_138_ + i, i_135_ + i_139_);
		method12570(class103, false, false, client.isP2pWorld, true);
		class103.method2291();
		Class117.aClass168_1554
		    = class103.method2290(i, i_135_, i_138_, i_139_, true);
	    }
	    Class117.aClass168_1554.method3646(i, i_135_);
	    int i_140_ = Class483.anInt6462 * 1010648373 * i_138_ / anInt7390;
	    int i_141_ = -928895085 * Class583.anInt7583 * i_139_ / anInt7391;
	    int i_142_
		= -884090275 * Class544.anInt7049 * i_138_ / anInt7390 + i;
	    int i_143_ = (i_135_ + i_139_
			  - Class545.anInt7050 * 686934559 * i_139_ / anInt7391
			  - i_141_);
	    int i_144_ = -1996554240;
	    if (client.currentGame == GameDefinition.STELLARDAWN)
		i_144_ = -1996488705;
	    class103.method2396(i_142_, i_143_, i_140_, i_141_, i_144_, 1);
	    class103.method2268(i_142_, i_143_, i_140_, i_141_, i_144_, 0);
	    for (Class241_Sub41 class241_sub41
		     = (Class241_Sub41) aClass429_7387.method7694(16711935);
		 class241_sub41 != null;
		 class241_sub41 = ((Class241_Sub41)
				   aClass429_7387.method7692(1310078325))) {
		Class515 class515
		    = aClass524_7370.method11745((-1454932011
						  * class241_sub41.anInt10158),
						 -834841550);
		if (Class241_Sub16.method15018(class515, -1145884687)) {
		    Class2 class2
			= ((Class2)
			   aHashMap8781.get(Integer.valueOf(-1454932011
							    * (class241_sub41
							       .anInt10158))));
		    if (null == class2)
			class2 = (Class2) (aHashMap8766.get
					   (Integer.valueOf(class515.anInt6770
							    * -1123109927)));
		    if (null != class2) {
			int i_145_;
			if (-1866104785 * ((Class2) class2).anInt13
			    > anInt8785 * 881484909 / 2)
			    i_145_ = ((anInt8785 * 1440352403
				       - 884649681 * ((Class2) class2).anInt13)
				      / (881484909 * anInt8785));
			else
			    i_145_ = (((Class2) class2).anInt13 * 884649681
				      / (anInt8785 * 881484909));
			int i_146_ = i + i_138_ * (class241_sub41.anInt10154
						   * 669485685) / anInt7390;
			int i_147_
			    = (((anInt7391
				 - class241_sub41.anInt10152 * -1535798317)
				* i_139_ / anInt7391)
			       + i_135_);
			class103.method2263(i_146_ - 2, i_147_ - 2, 4, 4,
					    i_145_ << 24 | 0xffff00,
					    (byte) -102);
		    }
		}
	    }
	    aClass129_7413.clean(5, -2132096663);
	}
    }
    
    static final void method14562(Class103 class103, int i, int i_148_,
				  int i_149_, int i_150_) {
	class103.method2445(i, i_148_, i_149_ + i, i_148_ + i_150_);
	class103.method2263(i, i_148_, i_149_, i_150_, -16777216, (byte) -83);
	if (-16261253 * anInt8787 >= 100) {
	    float f = (float) anInt7391 / (float) anInt7390;
	    int i_151_ = i_149_;
	    int i_152_ = i_150_;
	    if (f < 1.0F)
		i_152_ = (int) (f * (float) i_149_);
	    else
		i_151_ = (int) ((float) i_150_ / f);
	    i += (i_149_ - i_151_) / 2;
	    i_148_ += (i_150_ - i_152_) / 2;
	    if (Class117.aClass168_1554 == null
		|| Class117.aClass168_1554.method3631() != i_151_
		|| Class117.aClass168_1554.method3606() != i_152_) {
		aClass129_7414 = aClass129_7413;
		method12569(anInt7388, anInt7391 + anInt7389,
			    anInt7390 + anInt7388, anInt7389, i, i_148_,
			    i_151_ + i, i_148_ + i_152_);
		method12570(class103, false, false, client.isP2pWorld, true);
		class103.method2291();
		Class117.aClass168_1554
		    = class103.method2290(i, i_148_, i_151_, i_152_, true);
	    }
	    Class117.aClass168_1554.method3646(i, i_148_);
	    int i_153_ = Class483.anInt6462 * 1010648373 * i_151_ / anInt7390;
	    int i_154_ = -928895085 * Class583.anInt7583 * i_152_ / anInt7391;
	    int i_155_
		= -884090275 * Class544.anInt7049 * i_151_ / anInt7390 + i;
	    int i_156_ = (i_148_ + i_152_
			  - Class545.anInt7050 * 686934559 * i_152_ / anInt7391
			  - i_154_);
	    int i_157_ = -1996554240;
	    if (client.currentGame == GameDefinition.STELLARDAWN)
		i_157_ = -1996488705;
	    class103.method2396(i_155_, i_156_, i_153_, i_154_, i_157_, 1);
	    class103.method2268(i_155_, i_156_, i_153_, i_154_, i_157_, 0);
	    for (Class241_Sub41 class241_sub41
		     = (Class241_Sub41) aClass429_7387.method7694(16711935);
		 class241_sub41 != null;
		 class241_sub41 = ((Class241_Sub41)
				   aClass429_7387.method7692(1124397442))) {
		Class515 class515
		    = aClass524_7370.method11745((-1454932011
						  * class241_sub41.anInt10158),
						 239435541);
		if (Class241_Sub16.method15018(class515, 1159123067)) {
		    Class2 class2
			= ((Class2)
			   aHashMap8781.get(Integer.valueOf(-1454932011
							    * (class241_sub41
							       .anInt10158))));
		    if (null == class2)
			class2 = (Class2) (aHashMap8766.get
					   (Integer.valueOf(class515.anInt6770
							    * -1123109927)));
		    if (null != class2) {
			int i_158_;
			if (-1866104785 * ((Class2) class2).anInt13
			    > anInt8785 * 881484909 / 2)
			    i_158_ = ((anInt8785 * 1440352403
				       - 884649681 * ((Class2) class2).anInt13)
				      / (881484909 * anInt8785));
			else
			    i_158_ = (((Class2) class2).anInt13 * 884649681
				      / (anInt8785 * 881484909));
			int i_159_ = i + i_151_ * (class241_sub41.anInt10154
						   * 669485685) / anInt7390;
			int i_160_
			    = (((anInt7391
				 - class241_sub41.anInt10152 * -1535798317)
				* i_152_ / anInt7391)
			       + i_148_);
			class103.method2263(i_159_ - 2, i_160_ - 2, 4, 4,
					    i_158_ << 24 | 0xffff00, (byte) 2);
		    }
		}
	    }
	    aClass129_7413.clean(5, -2039155771);
	}
    }
    
    static final void method14563(Class103 class103, int i, int i_161_,
				  int i_162_, int i_163_) {
	class103.method2445(i, i_161_, i_162_ + i, i_161_ + i_163_);
	class103.method2263(i, i_161_, i_162_, i_163_, -16777216, (byte) -50);
	if (-16261253 * anInt8787 >= 100) {
	    float f = (float) anInt7391 / (float) anInt7390;
	    int i_164_ = i_162_;
	    int i_165_ = i_163_;
	    if (f < 1.0F)
		i_165_ = (int) (f * (float) i_162_);
	    else
		i_164_ = (int) ((float) i_163_ / f);
	    i += (i_162_ - i_164_) / 2;
	    i_161_ += (i_163_ - i_165_) / 2;
	    if (Class117.aClass168_1554 == null
		|| Class117.aClass168_1554.method3631() != i_164_
		|| Class117.aClass168_1554.method3606() != i_165_) {
		aClass129_7414 = aClass129_7413;
		method12569(anInt7388, anInt7391 + anInt7389,
			    anInt7390 + anInt7388, anInt7389, i, i_161_,
			    i_164_ + i, i_161_ + i_165_);
		method12570(class103, false, false, client.isP2pWorld, true);
		class103.method2291();
		Class117.aClass168_1554
		    = class103.method2290(i, i_161_, i_164_, i_165_, true);
	    }
	    Class117.aClass168_1554.method3646(i, i_161_);
	    int i_166_ = Class483.anInt6462 * 1010648373 * i_164_ / anInt7390;
	    int i_167_ = -928895085 * Class583.anInt7583 * i_165_ / anInt7391;
	    int i_168_
		= -884090275 * Class544.anInt7049 * i_164_ / anInt7390 + i;
	    int i_169_ = (i_161_ + i_165_
			  - Class545.anInt7050 * 686934559 * i_165_ / anInt7391
			  - i_167_);
	    int i_170_ = -1996554240;
	    if (client.currentGame == GameDefinition.STELLARDAWN)
		i_170_ = -1996488705;
	    class103.method2396(i_168_, i_169_, i_166_, i_167_, i_170_, 1);
	    class103.method2268(i_168_, i_169_, i_166_, i_167_, i_170_, 0);
	    for (Class241_Sub41 class241_sub41
		     = (Class241_Sub41) aClass429_7387.method7694(16711935);
		 class241_sub41 != null;
		 class241_sub41
		     = (Class241_Sub41) aClass429_7387.method7692(339109284)) {
		Class515 class515
		    = aClass524_7370.method11745((-1454932011
						  * class241_sub41.anInt10158),
						 -1659410644);
		if (Class241_Sub16.method15018(class515, -655676501)) {
		    Class2 class2
			= ((Class2)
			   aHashMap8781.get(Integer.valueOf(-1454932011
							    * (class241_sub41
							       .anInt10158))));
		    if (null == class2)
			class2 = (Class2) (aHashMap8766.get
					   (Integer.valueOf(class515.anInt6770
							    * -1123109927)));
		    if (null != class2) {
			int i_171_;
			if (-1866104785 * ((Class2) class2).anInt13
			    > anInt8785 * 881484909 / 2)
			    i_171_ = ((anInt8785 * 1440352403
				       - 884649681 * ((Class2) class2).anInt13)
				      / (881484909 * anInt8785));
			else
			    i_171_ = (((Class2) class2).anInt13 * 884649681
				      / (anInt8785 * 881484909));
			int i_172_ = i + i_164_ * (class241_sub41.anInt10154
						   * 669485685) / anInt7390;
			int i_173_
			    = (((anInt7391
				 - class241_sub41.anInt10152 * -1535798317)
				* i_165_ / anInt7391)
			       + i_161_);
			class103.method2263(i_172_ - 2, i_173_ - 2, 4, 4,
					    i_171_ << 24 | 0xffff00, (byte) 0);
		    }
		}
	    }
	    aClass129_7413.clean(5, -2015874520);
	}
    }
    
    static final void method14564(int i, int i_174_) {
	if (aFloat7408 < aFloat7402) {
	    aFloat7408 += (double) aFloat7408 / 30.0;
	    if (aFloat7408 > aFloat7402)
		aFloat7408 = aFloat7402;
	    Class288.method5661(497318259);
	    anInt7381 = (int) aFloat7402 >> 1;
	    aByteArrayArrayArray7380
		= Class336.method6078(anInt7381, 1838439777);
	} else if (aFloat7408 > aFloat7402) {
	    aFloat7408 -= (double) aFloat7408 / 30.0;
	    if (aFloat7408 < aFloat7402)
		aFloat7408 = aFloat7402;
	    Class288.method5661(497318259);
	    anInt7381 = (int) aFloat7402 >> 1;
	    aByteArrayArrayArray7380
		= Class336.method6078(anInt7381, 1384605178);
	}
	if (-1 != -1959962429 * anInt8773 && anInt8794 * 1985083461 != -1) {
	    int i_175_ = (-1959962429 * anInt8773
			  - 257473507 * WorldTile.anInt10182);
	    if (i_175_ != 0)
		i_175_ /= Math.min(anInt8769 * 432783869, Math.abs(i_175_));
	    int i_176_ = (1985083461 * anInt8794
			  - WorldTile.anInt10183 * 291545115);
	    if (i_176_ != 0)
		i_176_ /= Math.min(432783869 * anInt8769, Math.abs(i_176_));
	    WorldTile.anInt10182
		= ((i_175_ + 257473507 * WorldTile.anInt10182)
		   * -1822006837);
	    WorldTile.anInt10183
		= -1182123501 * (i_176_
				 + 291545115 * WorldTile.anInt10183);
	    if (0 == i_175_ && i_176_ == 0) {
		anInt8773 = -362944491;
		anInt8794 = -1265261197;
	    }
	    Class288.method5661(497318259);
	}
	Iterator iterator = aHashMap8781.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class2 class2 = (Class2) ((Map.Entry) iterator.next()).getValue();
	    ((Class2) class2).anInt13 -= -668481841;
	    if (0 == ((Class2) class2).anInt13 * -1866104785) {
		if (1883083225 * ((Class2) class2).anInt12 <= 1 && !aBool8771)
		    iterator.remove();
		else {
		    ((Class2) class2).anInt12 -= -733094295;
		    ((Class2) class2).anInt13 = -902921693 * anInt8785;
		}
	    }
	}
	iterator = aHashMap8766.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class2 class2 = (Class2) ((Map.Entry) iterator.next()).getValue();
	    ((Class2) class2).anInt13 -= -668481841;
	    if (0 == -1866104785 * ((Class2) class2).anInt13) {
		if (1883083225 * ((Class2) class2).anInt12 <= 1 && !aBool8771)
		    iterator.remove();
		else {
		    ((Class2) class2).anInt12 -= -733094295;
		    ((Class2) class2).anInt13 = -902921693 * anInt8785;
		}
	    }
	}
	if (aBool8775 && Class120_Sub23.aClass429_10631 != null) {
	    for (Class241_Sub46 class241_sub46
		     = ((Class241_Sub46)
			Class120_Sub23.aClass429_10631.method7694(16711935));
		 class241_sub46 != null;
		 class241_sub46
		     = (Class241_Sub46) Class120_Sub23.aClass429_10631
					    .method7692(975744995)) {
		Class515 class515
		    = aClass524_7370.method11745((-1454932011
						  * (((Class241_Sub46)
						      class241_sub46)
						     .aClass241_Sub41_10273
						     .anInt10158)),
						 -349134734);
		if (class241_sub46.method16583(i, i_174_, -1654630694)) {
		    if (null != class515.aStringArray6745) {
			if (null != class515.aStringArray6745[4])
			    Class534.method11882
				(class515.aStringArray6745[4],
				 class515.aString6746, -1, 1012, -1,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 false, -1236921043);
			if (null != class515.aStringArray6745[3])
			    Class534.method11882
				(class515.aStringArray6745[3],
				 class515.aString6746, -1, 1011, -1,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 false, -1236921043);
			if (class515.aStringArray6745[2] != null)
			    Class534.method11882
				(class515.aStringArray6745[2],
				 class515.aString6746, -1, 1010, -1,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 false, -1236921043);
			if (class515.aStringArray6745[1] != null)
			    Class534.method11882
				(class515.aStringArray6745[1],
				 class515.aString6746, -1, 1009, -1,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 -1123109927 * class515.anInt6770, 0, true,
				 false,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 false, -1236921043);
			if (null != class515.aStringArray6745[0])
			    Class534.method11882
				(class515.aStringArray6745[0],
				 class515.aString6746, -1, 1008, -1,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 false, -1236921043);
		    }
		    if (!((Class241_Sub46) class241_sub46)
			 .aClass241_Sub41_10273.aBool10155) {
			((Class241_Sub46) class241_sub46)
			    .aClass241_Sub41_10273.aBool10155
			    = true;
			Class561.method12372(Class614.aClass614_7810,
					     (((Class241_Sub46) class241_sub46)
					      .aClass241_Sub41_10273
					      .anInt10158) * -1454932011,
					     class515.anInt6770 * -1123109927,
					     -1490157738);
		    }
		    if (((Class241_Sub46) class241_sub46).aClass241_Sub41_10273
			.aBool10155)
			Class561.method12372
			    (Class614.aClass614_7808,
			     -1454932011 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273.anInt10158),
			     class515.anInt6770 * -1123109927, 677862542);
		} else if (((Class241_Sub46) class241_sub46)
			   .aClass241_Sub41_10273.aBool10155) {
		    ((Class241_Sub46) class241_sub46).aClass241_Sub41_10273
			.aBool10155
			= false;
		    Class561.method12372(Class614.aClass614_7811,
					 (-1454932011
					  * (((Class241_Sub46) class241_sub46)
					     .aClass241_Sub41_10273
					     .anInt10158)),
					 -1123109927 * class515.anInt6770,
					 -1489436558);
		}
	    }
	}
    }
    
    static final void method14565(int i, int i_177_) {
	if (aFloat7408 < aFloat7402) {
	    aFloat7408 += (double) aFloat7408 / 30.0;
	    if (aFloat7408 > aFloat7402)
		aFloat7408 = aFloat7402;
	    Class288.method5661(497318259);
	    anInt7381 = (int) aFloat7402 >> 1;
	    aByteArrayArrayArray7380
		= Class336.method6078(anInt7381, 1436961845);
	} else if (aFloat7408 > aFloat7402) {
	    aFloat7408 -= (double) aFloat7408 / 30.0;
	    if (aFloat7408 < aFloat7402)
		aFloat7408 = aFloat7402;
	    Class288.method5661(497318259);
	    anInt7381 = (int) aFloat7402 >> 1;
	    aByteArrayArrayArray7380
		= Class336.method6078(anInt7381, 760036639);
	}
	if (-1 != -1959962429 * anInt8773 && anInt8794 * 1985083461 != -1) {
	    int i_178_ = (-1959962429 * anInt8773
			  - 257473507 * WorldTile.anInt10182);
	    if (i_178_ != 0)
		i_178_ /= Math.min(anInt8769 * 432783869, Math.abs(i_178_));
	    int i_179_ = (1985083461 * anInt8794
			  - WorldTile.anInt10183 * 291545115);
	    if (i_179_ != 0)
		i_179_ /= Math.min(432783869 * anInt8769, Math.abs(i_179_));
	    WorldTile.anInt10182
		= ((i_178_ + 257473507 * WorldTile.anInt10182)
		   * -1822006837);
	    WorldTile.anInt10183
		= -1182123501 * (i_179_
				 + 291545115 * WorldTile.anInt10183);
	    if (0 == i_178_ && i_179_ == 0) {
		anInt8773 = -362944491;
		anInt8794 = -1265261197;
	    }
	    Class288.method5661(497318259);
	}
	Iterator iterator = aHashMap8781.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class2 class2 = (Class2) ((Map.Entry) iterator.next()).getValue();
	    ((Class2) class2).anInt13 -= -668481841;
	    if (0 == ((Class2) class2).anInt13 * -1866104785) {
		if (1883083225 * ((Class2) class2).anInt12 <= 1 && !aBool8771)
		    iterator.remove();
		else {
		    ((Class2) class2).anInt12 -= -733094295;
		    ((Class2) class2).anInt13 = -902921693 * anInt8785;
		}
	    }
	}
	iterator = aHashMap8766.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class2 class2 = (Class2) ((Map.Entry) iterator.next()).getValue();
	    ((Class2) class2).anInt13 -= -668481841;
	    if (0 == -1866104785 * ((Class2) class2).anInt13) {
		if (1883083225 * ((Class2) class2).anInt12 <= 1 && !aBool8771)
		    iterator.remove();
		else {
		    ((Class2) class2).anInt12 -= -733094295;
		    ((Class2) class2).anInt13 = -902921693 * anInt8785;
		}
	    }
	}
	if (aBool8775 && Class120_Sub23.aClass429_10631 != null) {
	    for (Class241_Sub46 class241_sub46
		     = ((Class241_Sub46)
			Class120_Sub23.aClass429_10631.method7694(16711935));
		 class241_sub46 != null;
		 class241_sub46
		     = (Class241_Sub46) Class120_Sub23.aClass429_10631
					    .method7692(152747004)) {
		Class515 class515
		    = aClass524_7370.method11745((-1454932011
						  * (((Class241_Sub46)
						      class241_sub46)
						     .aClass241_Sub41_10273
						     .anInt10158)),
						 -906657354);
		if (class241_sub46.method16583(i, i_177_, -1743596136)) {
		    if (null != class515.aStringArray6745) {
			if (null != class515.aStringArray6745[4])
			    Class534.method11882
				(class515.aStringArray6745[4],
				 class515.aString6746, -1, 1012, -1,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 false, -1236921043);
			if (null != class515.aStringArray6745[3])
			    Class534.method11882
				(class515.aStringArray6745[3],
				 class515.aString6746, -1, 1011, -1,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 false, -1236921043);
			if (class515.aStringArray6745[2] != null)
			    Class534.method11882
				(class515.aStringArray6745[2],
				 class515.aString6746, -1, 1010, -1,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 false, -1236921043);
			if (class515.aStringArray6745[1] != null)
			    Class534.method11882
				(class515.aStringArray6745[1],
				 class515.aString6746, -1, 1009, -1,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 -1123109927 * class515.anInt6770, 0, true,
				 false,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 false, -1236921043);
			if (null != class515.aStringArray6745[0])
			    Class534.method11882
				(class515.aStringArray6745[0],
				 class515.aString6746, -1, 1008, -1,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 false, -1236921043);
		    }
		    if (!((Class241_Sub46) class241_sub46)
			 .aClass241_Sub41_10273.aBool10155) {
			((Class241_Sub46) class241_sub46)
			    .aClass241_Sub41_10273.aBool10155
			    = true;
			Class561.method12372(Class614.aClass614_7810,
					     (((Class241_Sub46) class241_sub46)
					      .aClass241_Sub41_10273
					      .anInt10158) * -1454932011,
					     class515.anInt6770 * -1123109927,
					     -31960725);
		    }
		    if (((Class241_Sub46) class241_sub46).aClass241_Sub41_10273
			.aBool10155)
			Class561.method12372
			    (Class614.aClass614_7808,
			     -1454932011 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273.anInt10158),
			     class515.anInt6770 * -1123109927, 2009674685);
		} else if (((Class241_Sub46) class241_sub46)
			   .aClass241_Sub41_10273.aBool10155) {
		    ((Class241_Sub46) class241_sub46).aClass241_Sub41_10273
			.aBool10155
			= false;
		    Class561.method12372(Class614.aClass614_7811,
					 (-1454932011
					  * (((Class241_Sub46) class241_sub46)
					     .aClass241_Sub41_10273
					     .anInt10158)),
					 -1123109927 * class515.anInt6770,
					 1868142412);
		}
	    }
	}
    }
    
    static void method14566(int i) {
	WorldTile.anInt10183 = -1182123501 * i;
	anInt8794 = -1265261197;
	anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    static void method14567() {
	Class120_Sub23.aClass429_10631 = null;
	anInt8787 = 0;
	anInt7419 = 0;
	Class417.aClass58_6019 = null;
	method12561();
	aClass429_7387.method7652((byte) 29);
	aClass564_7386 = null;
	aClass129_7412.reset(-1926416230);
	aClass129_7413.reset(-589546171);
	Class117.aClass168_1554 = null;
	anInt8773 = -362944491;
	anInt8794 = -1265261197;
	if (null != aClass524_7370) {
	    aClass524_7370.method11734((byte) 1);
	    aClass524_7370.method11737(128, 64, 2131649029);
	}
	if (aClass598_7436 != null)
	    aClass598_7436.method13124(64, 64, -1313082755);
	if (null != aClass532_7421)
	    aClass532_7421.method11853(256, 1141357207);
	Class541.aClass199_Sub1_7008.method16869(64, 261015552);
    }
    
    public static void method14568() {
	aHashMap8781.clear();
	aHashMap8766.clear();
    }
    
    public static void method14569(int i, int i_180_, int i_181_,
				   boolean bool) {
	Class241_Sub39_Sub12 class241_sub39_sub12 = aClass241_Sub39_Sub12_7405;
	method12557(i);
	aBool7423 = false;
	if (aClass241_Sub39_Sub12_7405 != class241_sub39_sub12)
	    Class493.method11268(-1655254579);
	anInt8779 = i_180_ * 450468067;
	anInt8777 = i_181_ * -174268209;
	aBool8778 = bool;
    }
    
    public static void method14570(int i) {
	Class2 class2 = (Class2) aHashMap8781.get(Integer.valueOf(i));
	if (null == class2)
	    class2 = new Class2();
	((Class2) class2).anInt12 = anInt8783 * -1980703257;
	((Class2) class2).anInt13 = anInt8785 * -902921693;
	aHashMap8781.put(Integer.valueOf(i), class2);
    }
    
    public static void method14571() {
	RSAKeys.method861(true, (byte) 30);
    }
    
    static void method14572() {
	Class493.method11268(-209544814);
	aClass241_Sub39_Sub12_7405 = null;
	Class423.aClass241_Sub39_Sub12_6067 = null;
	aClass407_8782.method7293(1531866001);
	aClass407_8788.method7293(660454804);
	for (int i = 0; i < 3; i++) {
	    for (int i_182_ = 0; i_182_ < 5; i_182_++) {
		aClass96ArrayArray8795[i][i_182_] = null;
		aClass639ArrayArray8784[i][i_182_] = null;
	    }
	}
    }
    
    public static Class241_Sub39_Sub12 method14573() {
	return aClass241_Sub39_Sub12_7405;
    }
    
    public static void method14574(int i, int i_183_) {
	WorldTile.anInt10182 = -1822006837 * (i - anInt7388);
	WorldTile.anInt10183 = (i_183_ - anInt7389) * -1182123501;
	anInt8773 = -362944491;
	anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    static void method14575(int i) {
	WorldTile.anInt10182 = -1822006837 * i;
	anInt8773 = -362944491;
	anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    static void method14576(int i) {
	WorldTile.anInt10182 = -1822006837 * i;
	anInt8773 = -362944491;
	anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    public static int method14577() {
	if (2.0 == (double) aFloat7402)
	    return 25;
	if ((double) aFloat7402 == 3.0)
	    return 37;
	if ((double) aFloat7402 == 4.0)
	    return 50;
	if (6.0 == (double) aFloat7402)
	    return 75;
	if (8.0 == (double) aFloat7402)
	    return 100;
	return 200;
    }
    
    static void method14578(int i) {
	WorldTile.anInt10183 = -1182123501 * i;
	anInt8794 = -1265261197;
	anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    static void method14579(int i) {
	WorldTile.anInt10183 = -1182123501 * i;
	anInt8794 = -1265261197;
	anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    public static void method14580(int i, int i_184_, int i_185_,
				   boolean bool) {
	Class241_Sub39_Sub12 class241_sub39_sub12 = aClass241_Sub39_Sub12_7405;
	method12557(i);
	aBool7423 = false;
	if (aClass241_Sub39_Sub12_7405 != class241_sub39_sub12)
	    Class493.method11268(-1666855806);
	anInt8779 = i_184_ * 450468067;
	anInt8777 = i_185_ * -174268209;
	aBool8778 = bool;
    }
    
    public static void method14581(int i) {
	if (i == 25)
	    aFloat7402 = 2.0F;
	else if (37 == i)
	    aFloat7402 = 3.0F;
	else if (i == 50)
	    aFloat7402 = 4.0F;
	else if (75 == i)
	    aFloat7402 = 6.0F;
	else if (100 == i)
	    aFloat7402 = 8.0F;
	else if (i == 200)
	    aFloat7402 = 16.0F;
	anInt8794 = -1265261197;
	anInt8794 = -1265261197;
    }
    
    public static void method14582(int i) {
	if (i == 25)
	    aFloat7402 = 2.0F;
	else if (37 == i)
	    aFloat7402 = 3.0F;
	else if (i == 50)
	    aFloat7402 = 4.0F;
	else if (75 == i)
	    aFloat7402 = 6.0F;
	else if (100 == i)
	    aFloat7402 = 8.0F;
	else if (i == 200)
	    aFloat7402 = 16.0F;
	anInt8794 = -1265261197;
	anInt8794 = -1265261197;
    }
    
    static void method14583(Class103 class103, int i, int i_186_, int i_187_,
			    int i_188_) {
	class103.method2445(i, i_186_, i_187_ + i, i_188_ + i_186_);
	if (-16261253 * anInt8787 < 100) {
	    int i_189_ = 20;
	    int i_190_ = i_187_ / 2 + i;
	    int i_191_ = i_186_ + i_188_ / 2 - 18 - i_189_;
	    class103.method2396(i, i_186_, i_187_, i_188_, -16777216, 0);
	    class103.method2268(i_190_ - 152, i_191_, 304, 34,
				client.aColorArray8320
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    class103.method2396(i_190_ - 150, 2 + i_191_,
				-48783759 * anInt8787, 30,
				client.aColorArray8319
				    [client.anInt8414 * 1238854867].getRGB(),
				0);
	    Class81.aClass96_1149.method2113
		(ClientMessage.LOADINGDOTDOTDOT.getLocalisedMessage(VarPlayerDomain.currentLocale,
						     (short) 17241),
		 i_190_, i_191_ + i_189_,
		 client.aColorArray8321[client.anInt8414 * 1238854867]
		     .getRGB(),
		 -1, -1592850449);
	} else {
	    int i_192_ = (WorldTile.anInt10182 * 257473507
			  - (int) ((float) i_187_ / aFloat7408));
	    int i_193_ = (291545115 * WorldTile.anInt10183
			  + (int) ((float) i_188_ / aFloat7408));
	    int i_194_ = (WorldTile.anInt10182 * 257473507
			  + (int) ((float) i_187_ / aFloat7408));
	    int i_195_ = (WorldTile.anInt10183 * 291545115
			  - (int) ((float) i_188_ / aFloat7408));
	    Class544.anInt7049
		= (257473507 * WorldTile.anInt10182
		   - (int) ((float) i_187_ / aFloat7408)) * 1401407989;
	    Class545.anInt7050
		= -835767841 * (WorldTile.anInt10183 * 291545115
				- (int) ((float) i_188_ / aFloat7408));
	    Class483.anInt6462
		= -1541102307 * (int) ((float) (2 * i_187_) / aFloat7408);
	    Class583.anInt7583
		= -1595324773 * (int) ((float) (i_188_ * 2) / aFloat7408);
	    aClass129_7414 = aClass129_7412;
	    method12569(anInt7388 + i_192_, i_193_ + anInt7389,
			anInt7388 + i_194_, i_195_ + anInt7389, i, i_186_,
			i_187_ + i, i_188_ + i_186_ + 1);
	    method12570(class103, !aBool8780, !aBool8776, client.isP2pWorld,
			false);
	    NodeCollection class429 = method12577(class103);
	    Class525.method11757(class103, class429, 0, 0, -1962373561);
	    if (client.aBool8449) {
		int i_196_ = i + i_187_ - 5;
		int i_197_ = i_186_ + i_188_ - 8;
		Class5.aClass96_26.method2112
		    (new StringBuilder().append("Fps: ").append
			 (GameShell3.currentFpsRate * 2016113751).append
			 (" (").append
			 (GameShell3.anInt7635 * -2022955371).append
			 (" ms)").toString(),
		     i_196_, i_197_, 16776960, -1, -2130589919);
		i_197_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_198_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_199_ = 16776960;
		if (i_198_ > 65536)
		    i_199_ = 16711680;
		Class5.aClass96_26.method2112(new StringBuilder().append
						  ("Mem:").append
						  (i_198_).append
						  ("k").toString(),
					      i_196_, i_197_, i_199_, -1,
					      -1723914220);
		i_197_ -= 15;
	    }
	    aClass129_7412.clean(5, -1982458124);
	}
    }
    
    static void method14584(int i, int i_200_, int i_201_, int i_202_) {
	float f = (float) anInt7391 / (float) anInt7390;
	int i_203_ = i_201_;
	int i_204_ = i_202_;
	if (f < 1.0F)
	    i_204_ = (int) ((float) i_201_ * f);
	else
	    i_203_ = (int) ((float) i_202_ / f);
	i -= (i_201_ - i_203_) / 2;
	i_200_ -= (i_202_ - i_204_) / 2;
	WorldTile.anInt10182 = -1822006837 * (anInt7390 * i / i_203_);
	WorldTile.anInt10183
	    = -1182123501 * (anInt7391 - i_200_ * anInt7391 / i_204_);
	anInt8773 = -362944491;
	anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    static void method14585(int i, int i_205_, int i_206_, int i_207_) {
	float f = (float) anInt7391 / (float) anInt7390;
	int i_208_ = i_206_;
	int i_209_ = i_207_;
	if (f < 1.0F)
	    i_209_ = (int) ((float) i_206_ * f);
	else
	    i_208_ = (int) ((float) i_207_ / f);
	i -= (i_206_ - i_208_) / 2;
	i_205_ -= (i_207_ - i_209_) / 2;
	WorldTile.anInt10182 = -1822006837 * (anInt7390 * i / i_208_);
	WorldTile.anInt10183
	    = -1182123501 * (anInt7391 - i_205_ * anInt7391 / i_209_);
	anInt8773 = -362944491;
	anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    Class573_Sub1() throws Throwable {
	throw new Error();
    }
    
    public static int method14586() {
	if (2.0 == (double) aFloat7402)
	    return 25;
	if ((double) aFloat7402 == 3.0)
	    return 37;
	if ((double) aFloat7402 == 4.0)
	    return 50;
	if (6.0 == (double) aFloat7402)
	    return 75;
	if (8.0 == (double) aFloat7402)
	    return 100;
	return 200;
    }
    
    public static int method14587() {
	if (2.0 == (double) aFloat7402)
	    return 25;
	if ((double) aFloat7402 == 3.0)
	    return 37;
	if ((double) aFloat7402 == 4.0)
	    return 50;
	if (6.0 == (double) aFloat7402)
	    return 75;
	if (8.0 == (double) aFloat7402)
	    return 100;
	return 200;
    }
    
    public static int method14588() {
	if (2.0 == (double) aFloat7402)
	    return 25;
	if ((double) aFloat7402 == 3.0)
	    return 37;
	if ((double) aFloat7402 == 4.0)
	    return 50;
	if (6.0 == (double) aFloat7402)
	    return 75;
	if (8.0 == (double) aFloat7402)
	    return 100;
	return 200;
    }
    
    static void method14589(int i, int i_210_, int i_211_) {
	if (1008 == i)
	    Class561.method12372(Class614.aClass614_7813, i_210_, i_211_,
				 -1199006332);
	else if (1009 == i)
	    Class561.method12372(Class614.aClass614_7806, i_210_, i_211_,
				 -2017466520);
	else if (i == 1010)
	    Class561.method12372(Class614.aClass614_7807, i_210_, i_211_,
				 101804286);
	else if (i == 1011)
	    Class561.method12372(Class614.aClass614_7819, i_210_, i_211_,
				 -1346030548);
	else if (i == 1012)
	    Class561.method12372(Class614.aClass614_7809, i_210_, i_211_,
				 -1021425117);
    }
    
    public static void method14590(int i) {
	Class2 class2 = (Class2) aHashMap8766.get(Integer.valueOf(i));
	if (null == class2)
	    class2 = new Class2();
	((Class2) class2).anInt12 = -1980703257 * anInt8783;
	((Class2) class2).anInt13 = -902921693 * anInt8785;
	aHashMap8766.put(Integer.valueOf(i), class2);
    }
    
    public static void method14591(int i) {
	Class2 class2 = (Class2) aHashMap8766.get(Integer.valueOf(i));
	if (null == class2)
	    class2 = new Class2();
	((Class2) class2).anInt12 = -1980703257 * anInt8783;
	((Class2) class2).anInt13 = -902921693 * anInt8785;
	aHashMap8766.put(Integer.valueOf(i), class2);
    }
    
    public static void method14592(int i) {
	if (i < 1)
	    anInt8783 = anInt8770 * -1978949439;
	else
	    anInt8783 = i * -381438161;
    }
    
    public static void method14593(int i) {
	if (i < 1)
	    anInt8783 = anInt8770 * -1978949439;
	else
	    anInt8783 = i * -381438161;
    }
    
    public static void method14594(int i) {
	if (i < 1)
	    anInt8785 = anInt8793 * 1227044387;
	else
	    anInt8785 = i * -494320283;
    }
    
    public static void method14595(int i) {
	if (i < 1)
	    anInt8785 = anInt8793 * 1227044387;
	else
	    anInt8785 = i * -494320283;
    }
    
    static void method14596() {
	Class120_Sub23.aClass429_10631 = null;
	anInt8787 = 0;
	anInt7419 = 0;
	Class417.aClass58_6019 = null;
	method12561();
	aClass429_7387.method7652((byte) 117);
	aClass564_7386 = null;
	aClass129_7412.reset(-868619732);
	aClass129_7413.reset(-106990542);
	Class117.aClass168_1554 = null;
	anInt8773 = -362944491;
	anInt8794 = -1265261197;
	if (null != aClass524_7370) {
	    aClass524_7370.method11734((byte) 1);
	    aClass524_7370.method11737(128, 64, 2131649029);
	}
	if (aClass598_7436 != null)
	    aClass598_7436.method13124(64, 64, -1667731929);
	if (null != aClass532_7421)
	    aClass532_7421.method11853(256, 1141357207);
	Class541.aClass199_Sub1_7008.method16869(64, 261015552);
    }
    
    public static void method14597(int i, int i_212_) {
	anInt8773 = 362944491 * (i - anInt7388);
	anInt8794 = 1265261197 * (i_212_ - anInt7389);
    }
    
    public static void method14598() {
	RSAKeys.method861(true, (byte) -80);
    }
    
    static void method14599(Class103 class103, NodeCollection class429, int i,
			    int i_213_) {
	Class120_Sub23.aClass429_10631.method7652((byte) 68);
	if (!aBool8786) {
	    for (Class241_Sub41 class241_sub41
		     = (Class241_Sub41) class429.method7694(16711935);
		 null != class241_sub41;
		 class241_sub41
		     = (Class241_Sub41) class429.method7692(1073659981)) {
		Class515 class515
		    = aClass524_7370.method11745((class241_sub41.anInt10158
						  * -1454932011),
						 -876808181);
		if (Class241_Sub16.method15018(class515, 512102710)) {
		    boolean bool
			= Class449.method7936(class103, class241_sub41,
					      class515, i, i_213_, (byte) 0);
		    if (bool)
			Class576.method12670(class103, class241_sub41,
					     class515, (short) 5220);
		}
	    }
	}
    }
    
    public static int method14600(int i, int i_214_, int i_215_) {
	if (anInt8787 * -16261253 < 100)
	    return -2;
	int i_216_ = -2;
	int i_217_ = 2147483647;
	int i_218_ = i_214_ - anInt7388;
	int i_219_ = i_215_ - anInt7389;
	for (Class241_Sub41 class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7694(16711935);
	     class241_sub41 != null;
	     class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7692(1850107462)) {
	    if (-1454932011 * class241_sub41.anInt10158 == i) {
		int i_220_ = class241_sub41.anInt10154 * 669485685;
		int i_221_ = -1535798317 * class241_sub41.anInt10152;
		int i_222_ = i_220_ + anInt7388 << 14 | anInt7389 + i_221_;
		int i_223_ = ((i_218_ - i_220_) * (i_218_ - i_220_)
			      + (i_219_ - i_221_) * (i_219_ - i_221_));
		if (i_216_ < 0 || i_223_ < i_217_) {
		    i_216_ = i_222_;
		    i_217_ = i_223_;
		}
	    }
	}
	return i_216_;
    }
    
    public static Class241_Sub41 method14601() {
	if (aClass429_7387 == null || aClass443_8789 == null)
	    return null;
	aClass443_8789.method7863(aClass429_7387, (byte) 103);
	Class241_Sub41 class241_sub41
	    = (Class241_Sub41) aClass443_8789.method7865(-1384003000);
	if (null == class241_sub41)
	    return null;
	Class515 class515
	    = aClass524_7370.method11745((class241_sub41.anInt10158
					  * -1454932011),
					 1399483478);
	if (null == class515 || !class515.aBool6769
	    || !class515.method11587(anInterface13_7373, anInterface11_7372,
				     -1686754631))
	    return Class604.method13198((byte) -117);
	return class241_sub41;
    }
    
    public static Class241_Sub41 method14602() {
	if (aClass429_7387 == null || aClass443_8789 == null)
	    return null;
	aClass443_8789.method7863(aClass429_7387, (byte) 51);
	Class241_Sub41 class241_sub41
	    = (Class241_Sub41) aClass443_8789.method7865(-258377764);
	if (null == class241_sub41)
	    return null;
	Class515 class515
	    = aClass524_7370.method11745((class241_sub41.anInt10158
					  * -1454932011),
					 1949286199);
	if (null == class515 || !class515.aBool6769
	    || !class515.method11587(anInterface13_7373, anInterface11_7372,
				     -2080113471))
	    return Class604.method13198((byte) -33);
	return class241_sub41;
    }
    
    public static Class241_Sub41 method14603() {
	if (aClass429_7387 == null || aClass443_8789 == null)
	    return null;
	aClass443_8789.method7863(aClass429_7387, (byte) 8);
	Class241_Sub41 class241_sub41
	    = (Class241_Sub41) aClass443_8789.method7865(1219543589);
	if (null == class241_sub41)
	    return null;
	Class515 class515
	    = aClass524_7370.method11745((class241_sub41.anInt10158
					  * -1454932011),
					 1627785736);
	if (null == class515 || !class515.aBool6769
	    || !class515.method11587(anInterface13_7373, anInterface11_7372,
				     1808615465))
	    return Class604.method13198((byte) -21);
	return class241_sub41;
    }
    
    public static boolean method14604(int i, boolean bool) {
	if (i == -1310014867 * anInt8790)
	    aBool8774 = bool;
	else if (2090457349 * anInt8767 == i)
	    aBool8780 = bool;
	else if (i == anInt8768 * -1104278553)
	    aBool8776 = bool;
	else
	    return false;
	return true;
    }
    
    static void method14605() {
	int i = -1;
	if (null != aClass241_Sub39_Sub12_7405)
	    i = aClass241_Sub39_Sub12_7405.anInt10925 * 1100684019;
	Class493.method11268(-1221698170);
	for (int i_224_ = 0; i_224_ < 3; i_224_++) {
	    for (int i_225_ = 0; i_225_ < 5; i_225_++) {
		aClass96ArrayArray8795[i_224_][i_225_] = null;
		aClass639ArrayArray8784[i_224_][i_225_] = null;
	    }
	}
	aClass241_Sub39_Sub12_7405 = null;
	if (i != -1)
	    Class440.method7832(i, -1, -1, false, (byte) 23);
    }
    
    public static void method14606() {
	aHashMap8781.clear();
	aHashMap8766.clear();
    }
    
    public static Class241_Sub41 method14607() {
	if (aClass429_7387 == null || aClass443_8789 == null)
	    return null;
	for (Class241_Sub41 class241_sub41
		 = (Class241_Sub41) aClass443_8789.next();
	     class241_sub41 != null;
	     class241_sub41 = (Class241_Sub41) aClass443_8789.next()) {
	    Class515 class515
		= aClass524_7370.method11745((-1454932011
					      * class241_sub41.anInt10158),
					     691530502);
	    if (null != class515 && class515.aBool6769
		&& class515.method11587(anInterface13_7373, anInterface11_7372,
					986392220))
		return class241_sub41;
	}
	return null;
    }
    
    public static void method14608(int i, int i_226_) {
	anInt8773 = 362944491 * (i - anInt7388);
	anInt8794 = 1265261197 * (i_226_ - anInt7389);
    }
    
    public static boolean method14609(int i, boolean bool) {
	if (i == -1310014867 * anInt8790)
	    aBool8774 = bool;
	else if (2090457349 * anInt8767 == i)
	    aBool8780 = bool;
	else if (i == anInt8768 * -1104278553)
	    aBool8776 = bool;
	else
	    return false;
	return true;
    }
    
    public static boolean method14610(int i, boolean bool) {
	if (i == -1310014867 * anInt8790)
	    aBool8774 = bool;
	else if (2090457349 * anInt8767 == i)
	    aBool8780 = bool;
	else if (i == anInt8768 * -1104278553)
	    aBool8776 = bool;
	else
	    return false;
	return true;
    }
    
    static void method14611(Class103 class103, Class241_Sub41 class241_sub41,
			    Class515 class515, int i, int i_227_, int i_228_,
			    int i_229_) {
	int i_230_ = i - 5;
	int i_231_ = i_227_ + 2;
	if (0 != 153554575 * class515.anInt6741)
	    class103.method2263(i_230_, i_231_, i_229_ + 10,
				i_227_ + i_228_ - i_231_ + 1,
				153554575 * class515.anInt6741, (byte) 2);
	if (0 != class515.anInt6767 * 1284846821)
	    class103.method2262(i_230_, i_231_, i_229_ + 10,
				1 + (i_228_ + i_227_ - i_231_),
				1284846821 * class515.anInt6767, 668422903);
	int i_232_ = class515.anInt6750 * 2101573455;
	if (class241_sub41.aBool10155
	    && class515.anInt6736 * -2126282339 != -1)
	    i_232_ = class515.anInt6736 * -2126282339;
	Class355.aClass96_5452.method2114(class515.aString6756, i, i_227_,
					  i_229_, i_228_, ~0xffffff | i_232_,
					  (aClass497_7374.anInt6545
					   * -105193781),
					  1, 0, 0, null, null, null, 0, 0,
					  -1516972290);
    }
    
    public static int method14612(int i) {
	if (anInt8790 * -1310014867 == i)
	    return aBool8774 ? 1 : 0;
	if (i == anInt8767 * 2090457349)
	    return aBool8780 ? 1 : 0;
	if (anInt8768 * -1104278553 == i)
	    return aBool8776 ? 1 : 0;
	return -1;
    }
}
