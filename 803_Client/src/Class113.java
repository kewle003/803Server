/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.List;

public class Class113
{
    List aList1528;
    SoundManager this$0;
    
    void method2781(Class221 class221) {
	((Class113) this).aList1528.remove(class221);
    }
    
    void method2782(Class221 class221, byte i) {
	((Class113) this).aList1528.add(class221);
    }
    
    void method2783(Class221 class221, int i) {
	((Class113) this).aList1528.remove(class221);
    }
    
    List method2784(int i) {
	return ((Class113) this).aList1528;
    }
    
    boolean method2785(Class221 class221) {
	return ((Class113) this).aList1528.contains(class221);
    }
    
    void method2786(Class221 class221) {
	((Class113) this).aList1528.add(class221);
    }
    
    void method2787(Class221 class221) {
	((Class113) this).aList1528.remove(class221);
    }
    
    Class113(SoundManager class49) {
	((Class113) this).this$0 = class49;
	((Class113) this).aList1528 = new ArrayList();
    }
    
    void method2788(Class221 class221) {
	((Class113) this).aList1528.add(class221);
    }
    
    List method2789() {
	return ((Class113) this).aList1528;
    }
    
    List method2790() {
	return ((Class113) this).aList1528;
    }
    
    boolean method2791(Class221 class221, int i) {
	return ((Class113) this).aList1528.contains(class221);
    }
    
    static final void method2792(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, int i_5_) {
	int i_6_ = 794073197 * GPI.viewportPlayerCount;
	int[] is = GPI.viewportPlayerIndicies;
	client.anInt8592 = 0;
	int i_7_;
	if (-831877317 * client.anInt8266 == 4)
	    i_7_ = Class25.aClass93Array213.length;
	else
	    i_7_ = i_6_ + client.localNpcCount * -1837469873;
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    NPCDefinition class401 = null;
	    Entity class475_sub1_sub1_sub3;
	    if (client.anInt8266 * -831877317 == 4) {
		Class93 class93 = Class25.aClass93Array213[i_8_];
		if (!class93.aBool1323)
		    continue;
		class475_sub1_sub1_sub3 = class93.method2083(-1418964529);
		if (1627677985 * class475_sub1_sub1_sub3.anInt11376
		    != client.anInt8407 * 485246749)
		    continue;
		if (class93.anInt1320 * -2090966541 >= 0) {
		    class401 = ((NPC)
				class475_sub1_sub1_sub3).definition;
		    if (class401.transformTo != null) {
			class401 = class401.method7176(Class1.aClass19_11,
						       Class1.aClass19_11,
						       (byte) 113);
			if (class401 == null)
			    continue;
		    }
		}
	    } else {
		if (i_8_ < i_6_)
		    class475_sub1_sub1_sub3
			= (client.localPlayers
			   [is[i_8_]]);
		else {
		    class475_sub1_sub1_sub3
			= ((Entity)
			   (((ObjectNode)
			     (client.aClass407_8457.get
			      ((long) client.localNpcIndicies[i_8_ - i_6_])))
			    .objectValue));
		    class401 = ((NPC)
				class475_sub1_sub1_sub3).definition;
		    if (class401.transformTo != null) {
			class401 = class401.method7176(Class1.aClass19_11,
						       Class1.aClass19_11,
						       (byte) 66);
			if (null == class401)
			    continue;
		    }
		}
		if (class475_sub1_sub1_sub3.anInt11382 * -1903532337 < 0
		    || ((class475_sub1_sub1_sub3.anInt11376 * 1627677985
			 != 485246749 * client.anInt8407)
			&& (class475_sub1_sub1_sub3.nodePlane
			    != (Class21.myPlayer
				.nodePlane))))
		    continue;
	    }
	    Class529.method11834(class475_sub1_sub1_sub3,
				 class475_sub1_sub1_sub3
				     .method14464(770678446),
				 false, (byte) 82);
	    if (!(client.aFloatArray8336[0] < 0.0F)) {
		if (class475_sub1_sub1_sub3.method17853((short) 24533)) {
		    Class249 class249
			= class475_sub1_sub1_sub3.method17792(-2088020458);
		    if (class249 != null
			&& (client.anInt8592 * -824827517
			    < -1067689283 * client.anInt8453)) {
			client.anIntArray8459[client.anInt8592 * -824827517]
			    = ((Class5.aClass639_19.method13562
				(class249.method4991(542817258), (byte) 108))
			       / 2);
			client.anIntArray8530[client.anInt8592 * -824827517]
			    = (int) client.aFloatArray8336[0];
			client.anIntArray8531[-824827517 * client.anInt8592]
			    = (int) client.aFloatArray8336[1];
			client.aClass249Array8533[(-824827517
						   * client.anInt8592)]
			    = class249;
			client.anInt8592 += -2007829205;
		    }
		}
		int i_9_ = (int) ((float) i_0_ + client.aFloatArray8336[1]);
		i_9_ -= -351886683 * Class5.aClass639_19.anInt8258;
		boolean bool = false;
		if (!class475_sub1_sub1_sub3.aBool11379
		    && !class475_sub1_sub1_sub3.aClass421_11394
			    .method7538(1662553855)) {
		    for (Class247_Sub4 class247_sub4
			     = (Class247_Sub4) class475_sub1_sub1_sub3
						   .aClass421_11394
						   .method7525(-1943025584);
			 null != class247_sub4;
			 class247_sub4
			     = (Class247_Sub4) class475_sub1_sub1_sub3
						   .aClass421_11394
						   .method7526(1563964046)) {
			Class247_Sub5 class247_sub5
			    = class247_sub4.method16473(client.anInt8296,
							1357365213);
			if (class247_sub5 != null) {
			    Class570 class570 = class247_sub4.aClass570_10180;
			    Player class475_sub1_sub1_sub3_sub1
				= (client
				   .localPlayers
				   [is[i_8_]]);
			    Class168 class168;
			    Class168 class168_10_;
			    if (null != class475_sub1_sub1_sub3_sub1
				&& class475_sub1_sub1_sub3_sub1.aBool11496) {
				class168
				    = class570.method12494((Class236
							    .aClass103_2713),
							   1130952652);
				class168_10_
				    = class570.method12493((Class236
							    .aClass103_2713),
							   (byte) 3);
			    } else {
				class168
				    = class570.method12492((Class236
							    .aClass103_2713),
							   -1820008182);
				class168_10_
				    = class570.method12491((Class236
							    .aClass103_2713),
							   -302988500);
			    }
			    if (null != class168 && class168_10_ != null) {
				int i_11_ = 255;
				int i_12_ = -1;
				int i_13_ = (client.anInt8296
					     - (-858481697
						* class247_sub5.anInt10194));
				int i_14_ = (class168_10_.method3631()
					     * (class247_sub5.anInt10195
						* -1927703609)
					     / 255);
				if (class247_sub5.anInt10197 * -889658763
				    > i_13_) {
				    int i_15_ = (0 == (-1181606647
						       * class570.anInt7353)
						 ? 0
						 : (i_13_
						    / (class570.anInt7353
						       * -1181606647)
						    * (-1181606647
						       * class570.anInt7353)));
				    int i_16_ = (class168_10_.method3631()
						 * (class247_sub5.anInt10196
						    * 1125290527)
						 / 255);
				    i_12_ = i_16_ + (i_15_ * (i_14_ - i_16_)
						     / (-889658763
							* (class247_sub5
							   .anInt10197)));
				} else {
				    i_12_ = i_14_;
				    int i_17_
					= ((-889658763
					    * class247_sub5.anInt10197)
					   + 450053955 * class570.anInt7348
					   - i_13_);
				    if (class570.anInt7352 * 1335319443 >= 0)
					i_11_ = ((i_17_ << 8)
						 / ((class570.anInt7348
						     * 450053955)
						    - (class570.anInt7352
						       * 1335319443)));
				}
				if (-1927703609 * class247_sub5.anInt10195 > 0
				    && i_12_ < 2)
				    i_12_ = 2;
				int i_18_ = class168.method3606();
				int i_19_
				    = (int) ((float) i
					     + client.aFloatArray8336[0]
					     - (float) (class168.method3631()
							>> 1));
				i_9_ -= i_18_;
				if (i_11_ >= 0 && i_11_ < 255) {
				    int i_20_ = i_11_ << 24;
				    int i_21_ = i_20_ | 0xffffff;
				    class168.method3666(i_19_, i_9_, 0, i_21_,
							1);
				    Class236.aClass103_2713.method2258
					(i_19_, i_9_, i_12_ + i_19_,
					 i_18_ + i_9_);
				    class168_10_.method3666(i_19_, i_9_, 0,
							    i_21_, 1);
				} else {
				    class168.method3646(i_19_, i_9_);
				    Class236.aClass103_2713.method2258
					(i_19_, i_9_, i_19_ + i_12_,
					 i_9_ + i_18_);
				    class168_10_.method3646(i_19_, i_9_);
				}
				Class236.aClass103_2713.method2445(i, i_0_,
								   i + i_1_,
								   (i_2_
								    + i_0_));
				i_9_ -= 2;
				bool = true;
			    }
			} else if (class247_sub4.method16478(1097708799))
			    class247_sub4.method4944((byte) 5);
		    }
		}
		if (!bool)
		    i_9_ -= Class128.aClass513_1589.anInt6710 * -626972631 + 2;
		if (!class475_sub1_sub1_sub3.aBool11379) {
		    if (null == class401) {
			Player class475_sub1_sub1_sub3_sub1
			    = ((Player)
			       class475_sub1_sub1_sub3);
			for (int i_22_ = 0;
			     i_22_ < (class475_sub1_sub1_sub3_sub1
				      .anIntArray11508).length;
			     i_22_++) {
			    if ((class475_sub1_sub1_sub3_sub1.anIntArray11508
				 [i_22_])
				>= 0) {
				Object object = null;
				int i_23_ = (class475_sub1_sub1_sub3_sub1
					     .anIntArray11508[i_22_]);
				int i_24_ = (class475_sub1_sub1_sub3_sub1
					     .anIntArray11501[i_22_]);
				long l = (long) (i_24_ << 8 | i_23_);
				Class168 class168
				    = ((Class168)
				       client.aClass129_8326.get(l));
				if (null == class168) {
				    Class108[] class108s
					= (Class160.method3439
					   (Class284.SPRITES_ARCHIVE, i_24_,
					    0));
				    if (null == class108s)
					continue;
				    class168
					= (Class236.aClass103_2713.method2289
					   (class108s[i_23_], true));
				    client.aClass129_8326.put(class168,
								     l);
				}
				if (class168 != null) {
				    i_9_ -= class168.method3606();
				    class168.method3646
					((int) ((float) i
						+ client.aFloatArray8336[0]
						- 12.0F),
					 i_9_);
				    i_9_ -= 2;
				}
			    }
			}
		    } else {
			NPC class475_sub1_sub1_sub3_sub2
			    = ((NPC)
			       class475_sub1_sub1_sub3);
			int[] is_25_ = (null != (class475_sub1_sub1_sub3_sub2
						 .aClass400_11529)
					? (class475_sub1_sub1_sub3_sub2
					   .aClass400_11529.anIntArray5797)
					: (class475_sub1_sub1_sub3_sub2
					   .definition.anIntArray5869));
			short[] is_26_
			    = (null != (class475_sub1_sub1_sub3_sub2
					.aClass400_11529)
			       ? (class475_sub1_sub1_sub3_sub2.aClass400_11529
				  .aShortArray5796)
			       : (class475_sub1_sub1_sub3_sub2.definition
				  .aShortArray5833));
			if (is_26_ != null && is_25_ != null) {
			    int i_27_ = 0;
			    for (/**/; i_27_ < is_26_.length; i_27_++) {
				if (is_26_[i_27_] >= 0 && is_25_[i_27_] >= 0) {
				    Object object = null;
				    long l = (long) (is_25_[i_27_] << 8
						     | is_26_[i_27_]);
				    Class168 class168
					= (Class168) client.aClass129_8326
							 .get(l);
				    if (class168 == null) {
					Class108[] class108s
					    = (Class160.method3439
					       (Class284.SPRITES_ARCHIVE,
						is_25_[i_27_], 0));
					if (class108s == null)
					    continue;
					class168 = (Class236.aClass103_2713
							.method2289
						    (class108s[is_26_[i_27_]],
						     true));
					client.aClass129_8326
					    .put(class168, l);
				    }
				    if (null != class168) {
					i_9_ -= class168.method3606();
					class168.method3646
					    ((int) (client.aFloatArray8336[0]
						    + (float) i
						    - (float) ((class168
								    .method3631
								())
							       >> 1)),
					     i_9_);
					i_9_ -= 2;
				    }
				}
			    }
			}
		    }
		}
		if (class475_sub1_sub1_sub3
		    instanceof Player) {
		    if (i_8_ >= 0) {
			int i_28_ = 0;
			Class192[] class192s = client.aClass192Array8301;
			for (int i_29_ = 0; i_29_ < class192s.length;
			     i_29_++) {
			    Class192 class192 = class192s[i_29_];
			    if (class192 != null
				&& 10 == -1685117145 * class192.anInt2288
				&& (is[i_8_]
				    == class192.anInt2287 * 810214515)) {
				Class168 class168
				    = (Class191.aClass168Array2284
				       [(((Class192) class192).anInt2285
					 * 1521214931)]);
				if (class168.method3606() > i_28_)
				    i_28_ = class168.method3606();
				class168.method3646((int) ((float) i
							   + (client
							      .aFloatArray8336
							      [0])
							   - 12.0F),
						    (i_9_
						     - class168.method3606()));
			    }
			}
			if (i_28_ > 0)
			    i_9_ -= 2 + i_28_;
		    }
		} else {
		    int i_30_ = 0;
		    Class192[] class192s = client.aClass192Array8301;
		    for (int i_31_ = 0; i_31_ < class192s.length; i_31_++) {
			Class192 class192 = class192s[i_31_];
			if (class192 != null
			    && 1 == class192.anInt2288 * -1685117145
			    && (810214515 * class192.anInt2287
				== client.localNpcIndicies[i_8_ - i_6_])) {
			    Class168 class168
				= (Class191.aClass168Array2284
				   [(1521214931
				     * ((Class192) class192).anInt2285)]);
			    if (class168.method3606() > i_30_)
				i_30_ = class168.method3606();
			    boolean bool_32_;
			    if (509289615 * ((Class192) class192).anInt2294
				== 0)
				bool_32_ = true;
			    else {
				int i_33_
				    = (Class70.method1725(-1157094861) * 1000
				       / (((Class192) class192).anInt2294
					  * 509289615)
				       / 2);
				bool_32_
				    = client.anInt8296 % (2 * i_33_) < i_33_;
			    }
			    if (bool_32_)
				class168.method3646
				    ((int) (client.aFloatArray8336[0]
					    + (float) i - 12.0F),
				     i_9_ - class168.method3606());
			}
		    }
		    if (i_30_ > 0)
			i_9_ -= 2 + i_30_;
		}
		int i_34_ = 0;
		for (/**/;
		     i_34_ < Class128.aClass513_1589.maxhitmarks * 941792245;
		     i_34_++) {
		    int i_35_ = class475_sub1_sub1_sub3.anIntArray11391[i_34_];
		    int i_36_ = class475_sub1_sub1_sub3.anIntArray11419[i_34_];
		    HitMarkType class560 = null;
		    int i_37_ = 0;
		    if (i_36_ >= 0) {
			if (i_35_ <= client.anInt8296)
			    continue;
			class560
			    = (Class633.hitMarkTypeList.list
			       (class475_sub1_sub1_sub3.anIntArray11419[i_34_],
				-1960679234));
			if (class560 != null
			    && class560.anIntArray7294 != null) {
			    class560 = class560.method12334(Class1.aClass19_11,
							    Class1.aClass19_11,
							    -808104679);
			    if (class560 == null) {
				class475_sub1_sub1_sub3.anIntArray11391[i_34_]
				    = -1;
				continue;
			    }
			}
			i_37_ = class560.anInt7292 * 699273815;
		    } else if (i_35_ < 0)
			continue;
		    int i_38_ = class475_sub1_sub1_sub3.anIntArray11392[i_34_];
		    HitMarkType class560_39_ = null;
		    if (i_38_ >= 0) {
			class560_39_
			    = Class633.hitMarkTypeList.list(i_38_,
								  -1393519604);
			if (null != class560_39_
			    && class560_39_.anIntArray7294 != null)
			    class560_39_
				= class560_39_.method12334(Class1.aClass19_11,
							   Class1.aClass19_11,
							   -808104679);
		    }
		    if (i_35_ - i_37_ <= client.anInt8296) {
			if (null == class560)
			    class475_sub1_sub1_sub3.anIntArray11391[i_34_]
				= -1;
			else {
			    int i_40_ = (class475_sub1_sub1_sub3
					     .method14464(1414264984)
					 / 2);
			    Class529.method11834(class475_sub1_sub1_sub3,
						 i_40_, false, (byte) 64);
			    if (client.aFloatArray8336[0] > -1.0F) {
				client.aFloatArray8336[0]
				    += (float) (Class128.aClass513_1589
						.hitmarkpos_x[i_34_]);
				client.aFloatArray8336[1]
				    += (float) (Class128.aClass513_1589
						.hitmarkpos_y[i_34_]);
				Object object = null;
				Object object_41_ = null;
				Object object_42_ = null;
				Object object_43_ = null;
				int i_44_ = 0;
				int i_45_ = 0;
				int i_46_ = 0;
				int i_47_ = 0;
				int i_48_ = 0;
				int i_49_ = 0;
				int i_50_ = 0;
				int i_51_ = 0;
				Class168 class168 = null;
				Class168 class168_52_ = null;
				Class168 class168_53_ = null;
				Class168 class168_54_ = null;
				int i_55_ = 0;
				int i_56_ = 0;
				int i_57_ = 0;
				int i_58_ = 0;
				int i_59_ = 0;
				int i_60_ = 0;
				int i_61_ = 0;
				int i_62_ = 0;
				Class168 class168_63_
				    = class560.method12351((Class236
							    .aClass103_2713),
							   159474911);
				if (null != class168_63_) {
				    i_44_ = class168_63_.method3631();
				    class168_63_
					.method3612(client.anIntArray8598);
				    i_48_ = client.anIntArray8598[0];
				}
				Class168 class168_64_
				    = class560.method12339((Class236
							    .aClass103_2713),
							   -1795457068);
				if (class168_64_ != null) {
				    i_45_ = class168_64_.method3631();
				    class168_64_
					.method3612(client.anIntArray8598);
				    i_49_ = client.anIntArray8598[0];
				}
				Class168 class168_65_
				    = class560.method12336((Class236
							    .aClass103_2713),
							   637894083);
				if (null != class168_65_) {
				    i_46_ = class168_65_.method3631();
				    class168_65_
					.method3612(client.anIntArray8598);
				    i_50_ = client.anIntArray8598[0];
				}
				Class168 class168_66_
				    = class560.method12349((Class236
							    .aClass103_2713),
							   -675685962);
				if (null != class168_66_) {
				    i_47_ = class168_66_.method3631();
				    class168_66_
					.method3612(client.anIntArray8598);
				    i_51_ = client.anIntArray8598[0];
				}
				if (null != class560_39_) {
				    class168 = (class560_39_.method12351
						(Class236.aClass103_2713,
						 805198322));
				    if (null != class168) {
					i_55_ = class168.method3631();
					class168
					    .method3612(client.anIntArray8598);
					i_59_ = client.anIntArray8598[0];
				    }
				    class168_52_ = (class560_39_.method12339
						    (Class236.aClass103_2713,
						     -284711334));
				    if (null != class168_52_) {
					i_56_ = class168_52_.method3631();
					class168_52_
					    .method3612(client.anIntArray8598);
					i_60_ = client.anIntArray8598[0];
				    }
				    class168_53_ = (class560_39_.method12336
						    (Class236.aClass103_2713,
						     637894083));
				    if (null != class168_53_) {
					i_57_ = class168_53_.method3631();
					class168_53_
					    .method3612(client.anIntArray8598);
					i_61_ = client.anIntArray8598[0];
				    }
				    class168_54_ = (class560_39_.method12349
						    (Class236.aClass103_2713,
						     777967112));
				    if (null != class168_54_) {
					i_58_ = class168_54_.method3631();
					class168_54_
					    .method3612(client.anIntArray8598);
					i_62_ = client.anIntArray8598[0];
				    }
				}
				Class96 class96 = Class247_Sub2.aClass96_10073;
				Class96 class96_67_
				    = Class247_Sub2.aClass96_10073;
				Class639 class639 = Class494.aClass639_6519;
				Class639 class639_68_
				    = Class494.aClass639_6519;
				int i_69_ = class560.anInt7279 * 1085458021;
				if (i_69_ >= 0) {
				    Class96 class96_70_
					= ((Class96)
					   (Class425.aClass344_6080.method6161
					    (client.anInterface26_8552, i_69_,
					     true, class560.aBool7275,
					     56487333)));
				    Class639 class639_71_
					= (Class425.aClass344_6080.method6141
					   (client.anInterface26_8552, i_69_,
					    (byte) 20));
				    if (class96_70_ != null
					&& class639_71_ != null) {
					class96 = class96_70_;
					class639 = class639_71_;
				    }
				}
				if (null != class560_39_) {
				    i_69_
					= 1085458021 * class560_39_.anInt7279;
				    if (i_69_ >= 0) {
					Class96 class96_72_
					    = ((Class96)
					       (Class425.aClass344_6080
						    .method6161
						(client.anInterface26_8552,
						 i_69_, true,
						 class560_39_.aBool7275,
						 -1874466721)));
					Class639 class639_73_
					    = (Class425.aClass344_6080
						   .method6141
					       (client.anInterface26_8552,
						i_69_, (byte) 111));
					if (null != class96_72_
					    && null != class639_73_) {
					    class96_67_ = class96_72_;
					    class639_68_ = class639_73_;
					}
				    }
				}
				Object object_74_ = null;
				String string = null;
				boolean bool_75_ = false;
				int i_76_ = 0;
				String string_77_
				    = (class560.method12345
				       ((class475_sub1_sub1_sub3
					 .anIntArray11372[i_34_]),
					(byte) 42));
				int i_78_ = class639.method13562(string_77_,
								 (byte) 25);
				if (class560_39_ != null) {
				    string = (class560_39_.method12345
					      ((class475_sub1_sub1_sub3
						.anIntArray11393[i_34_]),
					       (byte) -17));
				    i_76_
					= class639_68_.method13562(string,
								   (byte) 74);
				}
				int i_79_ = 0;
				int i_80_ = 0;
				if (i_45_ > 0)
				    i_79_ = i_78_ / i_45_ + 1;
				if (null != class560_39_ && i_56_ > 0)
				    i_80_ = i_76_ / i_56_ + 1;
				int i_81_ = 0;
				int i_82_ = i_81_;
				if (i_44_ > 0)
				    i_81_ += i_44_;
				i_81_ += 2;
				int i_83_ = i_81_;
				if (i_46_ > 0)
				    i_81_ += i_46_;
				int i_84_ = i_81_;
				int i_85_ = i_81_;
				if (i_45_ > 0) {
				    int i_86_ = i_45_ * i_79_;
				    i_81_ += i_86_;
				    i_85_ += (i_86_ - i_78_) / 2;
				} else
				    i_81_ += i_78_;
				int i_87_ = i_81_;
				if (i_47_ > 0)
				    i_81_ += i_47_;
				int i_88_ = 0;
				int i_89_ = 0;
				int i_90_ = 0;
				int i_91_ = 0;
				int i_92_ = 0;
				if (null != class560_39_) {
				    i_81_ += 2;
				    i_88_ = i_81_;
				    if (i_55_ > 0)
					i_81_ += i_55_;
				    i_81_ += 2;
				    i_89_ = i_81_;
				    if (i_57_ > 0)
					i_81_ += i_57_;
				    i_90_ = i_81_;
				    i_92_ = i_81_;
				    if (i_56_ > 0) {
					int i_93_ = i_80_ * i_56_;
					i_81_ += i_93_;
					i_92_ += (i_93_ - i_76_) / 2;
				    } else
					i_81_ += i_76_;
				    i_91_ = i_81_;
				    if (i_58_ > 0)
					i_81_ += i_58_;
				}
				int i_94_ = ((class475_sub1_sub1_sub3
					      .anIntArray11391[i_34_])
					     - client.anInt8296);
				int i_95_
				    = (-541416049 * class560.anInt7283
				       - (-541416049 * class560.anInt7283
					  * i_94_
					  / (699273815 * class560.anInt7292)));
				int i_96_
				    = (-(219721691 * class560.anInt7284)
				       + (219721691 * class560.anInt7284
					  * i_94_
					  / (699273815 * class560.anInt7292)));
				int i_97_ = (int) ((float) i_95_
						   + (client.aFloatArray8336[0]
						      + (float) i
						      - (float) (i_81_ >> 1)));
				int i_98_
				    = (int) ((float) i_96_
					     + ((float) i_0_
						+ client.aFloatArray8336[1]
						- 12.0F));
				int i_99_ = (247316611 * class560.anInt7291
					     + (i_98_ + 15));
				int i_100_ = 0;
				if (null != class560_39_)
				    i_100_
					= i_98_ + 15 + (class560_39_.anInt7291
							* 247316611);
				int i_101_ = 255;
				if (class560.anInt7288 * -929771953 >= 0)
				    i_101_ = ((i_94_ << 8)
					      / (699273815 * class560.anInt7292
						 - (class560.anInt7288
						    * -929771953)));
				if (i_101_ >= 0 && i_101_ < 255) {
				    int i_102_ = i_101_ << 24;
				    int i_103_ = i_102_ | 0xffffff;
				    if (class168_63_ != null)
					class168_63_.method3666((i_97_ + i_82_
								 - i_48_),
								i_98_, 0,
								i_103_, 1);
				    if (class168_65_ != null)
					class168_65_.method3666
					    ((i_83_ + i_97_ - i_50_
					      + (class560.anInt7281
						 * -1260469935)),
					     i_98_ + (455129863
						      * class560.anInt7293),
					     0, i_103_, 1);
				    if (class168_64_ != null) {
					for (int i_104_ = 0; i_104_ < i_79_;
					     i_104_++)
					    class168_64_.method3666
						((i_104_ * i_45_
						  + (i_84_ + i_97_ - i_49_)
						  + (class560.anInt7281
						     * -1260469935)),
						 i_98_ + (class560.anInt7293
							  * 455129863),
						 0, i_103_, 1);
				    }
				    if (null != class168_66_)
					class168_66_.method3666
					    ((-1260469935 * class560.anInt7281
					      + (i_97_ + i_87_ - i_51_)),
					     i_98_ + (455129863
						      * class560.anInt7293),
					     0, i_103_, 1);
				    class96.method2128(string_77_,
						       i_97_ + i_85_, i_99_,
						       ((1229368249
							 * class560.anInt7280)
							| i_102_),
						       0, 1841717961);
				    if (null != class560_39_) {
					if (null != class168)
					    class168.method3666((i_88_ + i_97_
								 - i_59_),
								i_98_, 0,
								i_103_, 1);
					if (class168_53_ != null)
					    class168_53_.method3666
						(((class560_39_.anInt7281
						   * -1260469935)
						  + (i_89_ + i_97_ - i_61_)),
						 (class560_39_.anInt7293
						  * 455129863) + i_98_,
						 0, i_103_, 1);
					if (class168_52_ != null) {
					    for (int i_105_ = 0;
						 i_105_ < i_80_; i_105_++)
						class168_52_.method3666
						    (((class560_39_.anInt7281
						       * -1260469935)
						      + (i_90_ + i_97_ - i_60_
							 + i_105_ * i_56_)),
						     (i_98_
						      + (class560_39_.anInt7293
							 * 455129863)),
						     0, i_103_, 1);
					}
					if (null != class168_54_)
					    class168_54_.method3666
						(((class560_39_.anInt7281
						   * -1260469935)
						  + (i_91_ + i_97_ - i_62_)),
						 (i_98_
						  + (class560_39_.anInt7293
						     * 455129863)),
						 0, i_103_, 1);
					class96_67_.method2128(string,
							       i_92_ + i_97_,
							       i_100_,
							       (((class560_39_
								  .anInt7280)
								 * 1229368249)
								| i_102_),
							       0, 1841717961);
				    }
				} else {
				    if (null != class168_63_)
					class168_63_.method3646((i_82_ + i_97_
								 - i_48_),
								i_98_);
				    if (class168_65_ != null)
					class168_65_.method3646
					    ((-1260469935 * class560.anInt7281
					      + (i_83_ + i_97_ - i_50_)),
					     i_98_ + (class560.anInt7293
						      * 455129863));
				    if (class168_64_ != null) {
					for (int i_106_ = 0; i_106_ < i_79_;
					     i_106_++)
					    class168_64_.method3646
						((i_106_ * i_45_
						  + (i_97_ + i_84_ - i_49_)
						  + (-1260469935
						     * class560.anInt7281)),
						 (i_98_
						  + (455129863
						     * class560.anInt7293)));
				    }
				    if (class168_66_ != null)
					class168_66_.method3646
					    ((i_97_ + i_87_ - i_51_
					      + (-1260469935
						 * class560.anInt7281)),
					     i_98_ + (class560.anInt7293
						      * 455129863));
				    class96.method2128(string_77_,
						       i_97_ + i_85_, i_99_,
						       ((1229368249
							 * class560.anInt7280)
							| ~0xffffff),
						       0, 1841717961);
				    if (class560_39_ != null) {
					if (null != class168)
					    class168.method3646((i_88_ + i_97_
								 - i_59_),
								i_98_);
					if (null != class168_53_)
					    class168_53_.method3646
						((i_97_ + i_89_ - i_61_
						  + (-1260469935
						     * (class560_39_
							.anInt7281))),
						 (class560_39_.anInt7293
						  * 455129863) + i_98_);
					if (null != class168_52_) {
					    for (int i_107_ = 0;
						 i_107_ < i_80_; i_107_++)
						class168_52_.method3646
						    (((class560_39_.anInt7281
						       * -1260469935)
						      + (i_90_ + i_97_ - i_60_
							 + i_56_ * i_107_)),
						     (455129863 * (class560_39_
								   .anInt7293)
						      + i_98_));
					}
					if (class168_54_ != null)
					    class168_54_.method3646
						((i_97_ + i_91_ - i_62_
						  + (class560_39_.anInt7281
						     * -1260469935)),
						 (i_98_
						  + 455129863 * (class560_39_
								 .anInt7293)));
					class96_67_.method2128(string,
							       i_92_ + i_97_,
							       i_100_,
							       (((class560_39_
								  .anInt7280)
								 * 1229368249)
								| ~0xffffff),
							       0, 1841717961);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i_108_ = 0; i_108_ < -411921995 * client.anInt8410;
	     i_108_++) {
	    int i_109_ = client.anIntArray8408[i_108_];
	    Entity class475_sub1_sub1_sub3;
	    if (i_109_ < 2048)
		class475_sub1_sub1_sub3
		    = client.localPlayers[i_109_];
	    else
		class475_sub1_sub1_sub3
		    = ((Entity)
		       (((ObjectNode)
			 client.aClass407_8457.get((long) (i_109_
								  - 2048)))
			.objectValue));
	    int i_110_ = client.anIntArray8349[i_108_];
	    Entity class475_sub1_sub1_sub3_111_;
	    if (i_110_ < 2048)
		class475_sub1_sub1_sub3_111_
		    = client.localPlayers[i_110_];
	    else
		class475_sub1_sub1_sub3_111_
		    = ((Entity)
		       (((ObjectNode)
			 client.aClass407_8457.get((long) (i_110_
								  - 2048)))
			.objectValue));
	    Class124.method2997(class475_sub1_sub1_sub3,
				class475_sub1_sub1_sub3_111_,
				(class475_sub1_sub1_sub3.anInt11380
				 -= 1212748481) * -339051199,
				i, i_0_, i_1_, i_2_, i_3_, i_4_, -2039657680);
	}
	int i_112_ = (-351886683 * Class5.aClass639_19.anInt8258
		      + Class5.aClass639_19.anInt8260 * 326424439 + 2);
	for (int i_113_ = 0; i_113_ < client.anInt8592 * -824827517;
	     i_113_++) {
	    int i_114_ = client.anIntArray8530[i_113_];
	    int i_115_ = client.anIntArray8531[i_113_];
	    int i_116_ = client.anIntArray8459[i_113_];
	    boolean bool = true;
	    while (bool) {
		bool = false;
		for (int i_117_ = 0; i_117_ < i_113_; i_117_++) {
		    if (i_115_ + 2 > client.anIntArray8531[i_117_] - i_112_
			&& i_115_ - i_112_ < 2 + client.anIntArray8531[i_117_]
			&& i_114_ - i_116_ < (client.anIntArray8459[i_117_]
					      + client.anIntArray8530[i_117_])
			&& i_114_ + i_116_ > (client.anIntArray8530[i_117_]
					      - client.anIntArray8459[i_117_])
			&& client.anIntArray8531[i_117_] - i_112_ < i_115_) {
			i_115_ = client.anIntArray8531[i_117_] - i_112_;
			bool = true;
		    }
		}
	    }
	    client.anIntArray8531[i_113_] = i_115_;
	    String string
		= client.aClass249Array8533[i_113_].method4991(862132277);
	    if (0 == 1869258529 * client.anInt8277) {
		int i_118_ = 16776960;
		int i_119_ = client.aClass249Array8533[i_113_]
				 .method4993((byte) -110);
		if (i_119_ < 6)
		    i_118_ = client.anIntArray8534[i_119_];
		if (i_119_ == 6)
		    i_118_ = (485246749 * client.anInt8407 % 20 < 10 ? 16711680
			      : 16776960);
		if (i_119_ == 7)
		    i_118_
			= 485246749 * client.anInt8407 % 20 < 10 ? 255 : 65535;
		if (8 == i_119_)
		    i_118_ = (client.anInt8407 * 485246749 % 20 < 10 ? 45056
			      : 8454016);
		if (9 == i_119_) {
		    int i_120_ = 150 - (client.aClass249Array8533[i_113_]
					    .method4995(2128977702)
					* 150
					/ client.aClass249Array8533[i_113_]
					      .method4992(1961561853));
		    if (i_120_ < 50)
			i_118_ = 1280 * i_120_ + 16711680;
		    else if (i_120_ < 100)
			i_118_ = 16776960 - 327680 * (i_120_ - 50);
		    else if (i_120_ < 150)
			i_118_ = 5 * (i_120_ - 100) + 65280;
		}
		if (10 == i_119_) {
		    int i_121_ = 150 - (client.aClass249Array8533[i_113_]
					    .method4995(2128977702)
					* 150
					/ client.aClass249Array8533[i_113_]
					      .method4992(336266223));
		    if (i_121_ < 50)
			i_118_ = 16711680 + 5 * i_121_;
		    else if (i_121_ < 100)
			i_118_ = 16711935 - 327680 * (i_121_ - 50);
		    else if (i_121_ < 150)
			i_118_ = 255 + (i_121_ - 100) * 327680 - 5 * (i_121_
								      - 100);
		}
		if (i_119_ == 11) {
		    int i_122_ = 150 - (client.aClass249Array8533[i_113_]
					    .method4995(2128977702)
					* 150
					/ client.aClass249Array8533[i_113_]
					      .method4992(-118431609));
		    if (i_122_ < 50)
			i_118_ = 16777215 - 327685 * i_122_;
		    else if (i_122_ < 100)
			i_118_ = 65280 + 327685 * (i_122_ - 50);
		    else if (i_122_ < 150)
			i_118_ = 16777215 - 327680 * (i_122_ - 100);
		}
		int i_123_ = i_118_ | ~0xffffff;
		int i_124_ = client.aClass249Array8533[i_113_]
				 .method5000(-2085186938);
		if (0 == i_124_)
		    Class81.aClass96_1149.method2113(string, i + i_114_,
						     i_115_ + i_0_, i_123_,
						     -16777216, 1974463572);
		if (1 == i_124_)
		    Class81.aClass96_1149.method2116(string, i + i_114_,
						     i_0_ + i_115_, i_123_,
						     -16777216,
						     (485246749
						      * client.anInt8407),
						     1933477868);
		if (i_124_ == 2)
		    Class81.aClass96_1149.method2117(string, i_114_ + i,
						     i_115_ + i_0_, i_123_,
						     -16777216,
						     (client.anInt8407
						      * 485246749),
						     -342211561);
		if (3 == i_124_) {
		    int i_125_ = 150 - (client.aClass249Array8533[i_113_]
					    .method4995(2128977702)
					* 150
					/ client.aClass249Array8533[i_113_]
					      .method4992(982803202));
		    Class81.aClass96_1149.method2141(string, i + i_114_,
						     i_115_ + i_0_, i_123_,
						     -16777216,
						     (485246749
						      * client.anInt8407),
						     i_125_, -682473533);
		}
		if (i_124_ == 4) {
		    int i_126_ = 150 - (client.aClass249Array8533[i_113_]
					    .method4995(2128977702)
					* 150
					/ client.aClass249Array8533[i_113_]
					      .method4992(1474742359));
		    int i_127_
			= i_126_ * (Class5.aClass639_19.method13562(string,
								    (byte) 66)
				    + 100) / 150;
		    Class236.aClass103_2713.method2258(i_114_ + i - 50, i_0_,
						       50 + (i_114_ + i),
						       i_0_ + i_2_);
		    Class81.aClass96_1149.method2128(string,
						     i + i_114_ + 50 - i_127_,
						     i_0_ + i_115_, i_123_,
						     -16777216, 1841717961);
		    Class236.aClass103_2713.method2445(i, i_0_, i + i_1_,
						       i_0_ + i_2_);
		}
		if (5 == i_124_) {
		    int i_128_ = 150 - (client.aClass249Array8533[i_113_]
					    .method4995(2128977702)
					* 150
					/ client.aClass249Array8533[i_113_]
					      .method4992(1188642141));
		    int i_129_ = 0;
		    if (i_128_ < 25)
			i_129_ = i_128_ - 25;
		    else if (i_128_ > 125)
			i_129_ = i_128_ - 125;
		    int i_130_ = (-351886683 * Class5.aClass639_19.anInt8258
				  + Class5.aClass639_19.anInt8260 * 326424439);
		    Class236.aClass103_2713.method2258(i,
						       (i_115_ + i_0_ - i_130_
							- 1),
						       i + i_1_,
						       i_0_ + i_115_ + 5);
		    Class81.aClass96_1149.method2113(string, i_114_ + i,
						     i_0_ + i_115_ + i_129_,
						     i_123_, -16777216,
						     -2013012104);
		    Class236.aClass103_2713.method2445(i, i_0_, i + i_1_,
						       i_0_ + i_2_);
		}
	    } else
		Class81.aClass96_1149.method2113(string, i + i_114_,
						 i_0_ + i_115_, -256,
						 -16777216, -2022588871);
	}
    }
    
    static final void method2793(ClientScriptData class454, int i) {
	boolean bool
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       != 0);
	int i_131_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = Class247.method4952((long) i_131_, 0, bool,
				  VarPlayerDomain.currentLocale, 681083744);
    }
}
