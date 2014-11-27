/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class194
{
    static int anInt2299;
    static boolean aBool2300 = false;
    static boolean aBool2301 = false;
    static boolean aBool2302;
    static int anInt2303;
    static int[] anIntArray2304;
    static final double aDouble2305 = 100.0;
    static int[] anIntArray2306;
    static NodeCollection aClass429_2307;
    public static int minimapFlagX;//anInt2308
    public static int minimapFlagY;//anInt2309
    static boolean aBool2310;
    static int anInt2311;
    static final int anInt2312 = 48;
    static int[] anIntArray2313;
    
    static boolean method3943(int i, int i_0_, int i_1_) {
	Class552 class552 = client.aClass238_8477.method4751(-1584656213);
	boolean bool = true;
	Interface24 interface24
	    = (Interface24) class552.method12132(i, i_0_, i_1_, (byte) 7);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -643802242);
	interface24
	    = (Interface24) class552.method12136(i, i_0_, i_1_,
						 client.anInterface57_8577,
						 -757539099);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -1012036195);
	interface24
	    = (Interface24) class552.method12100(i, i_0_, i_1_, 1280353450);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -1827525510);
	return bool;
    }
    
    public static void method3944() {
	int i = client.aClass238_8477.method4744(-2031959830);
	int i_2_ = client.aClass238_8477.method4745(1417232108);
	Class458.aBoolArrayArray6260 = new boolean[i >> 3][i_2_ >> 3];
    }
    
    static void method3945() {
	anInt2311 = 0;
	minimapFlagX = 980260023;
	minimapFlagY = 1262506991;
    }
    
    public static void method3946() {
	Class65.aClass168_1046 = null;
	anInt2299 = -472227899;
    }
    
    public static void method3947() {
	Class65.aClass168_1046 = null;
	anInt2299 = -472227899;
    }
    
    public static void method3948() {
	Class65.aClass168_1046 = null;
	anInt2299 = -472227899;
    }
    
    public static void method3949() {
	anInt2299 = -472227899;
    }
    
    static boolean method3950(Interface24 interface24, ObjectDefinitionLoader class532,
			      int i, int i_3_) {
	if (null == interface24)
	    return false;
	ObjectDefinition class526
	    = class532.getObjectDefinition(interface24.method146((byte) 0), 577892407);
	if (class526.membersObject && !client.isP2pWorld)
	    return false;
	int i_4_ = class526.mapSpriteID * 8166631;
	if (class526.toObjectIDs != null) {
	    for (int i_5_ = 0; i_5_ < class526.toObjectIDs.length; i_5_++) {
		if (-1 != class526.toObjectIDs[i_5_]) {
		    ObjectDefinition class526_6_
			= class532.getObjectDefinition(class526.toObjectIDs[i_5_],
					       577892407);
		    if (8166631 * class526_6_.mapSpriteID >= 0)
			i_4_ = class526_6_.mapSpriteID * 8166631;
		}
	    }
	}
	if (i_4_ >= 0) {
	    anIntArray2306[anInt2303 * -1037886889]
		= -2079513015 * class526.objectID;
	    anIntArray2304[-1037886889 * anInt2303] = i;
	    anIntArray2313[-1037886889 * anInt2303] = i_3_;
	    anInt2303 += -54496921;
	    return true;
	}
	return false;
    }
    
    public static void method3951() {
	int i = client.aClass238_8477.method4744(-1987420795);
	int i_7_ = client.aClass238_8477.method4745(567904585);
	Class458.aBoolArrayArray6260 = new boolean[i >> 3][i_7_ >> 3];
    }
    
    static void method3952(Class103 class103, Class135 class135,
			   InterfaceComponent class58, int i, int i_8_, int i_9_,
			   int i_10_, int i_11_) {
	Class515 class515
	    = Class441.aClass524_6158.method11745(i_11_, 2043861031);
	if (class515 != null && class515.aBool6744
	    && class515.method11587(Class1.aClass19_11, Class1.aClass19_11,
				    -1244653077)) {
	    if (null != class515.anIntArray6737) {
		int[] is = new int[class515.anIntArray6737.length];
		for (int i_12_ = 0; i_12_ < is.length / 2; i_12_++) {
		    int i_13_;
		    if (4 == 115241065 * Class296.anInt4513)
			i_13_ = ((int) ((double) Class445_Sub16
						     .aClass351_Sub1_8660
						     .method6292((byte) 122)
					* 2607.5945876176133)
				 + client.anInt8513 * 390680985) & 0x3fff;
		    else if (115241065 * Class296.anInt4513 == 5)
			i_13_ = (int) client.aFloat8581 & 0x3fff;
		    else
			i_13_ = ((int) client.aFloat8581
				 + client.anInt8513 * 390680985) & 0x3fff;
		    int i_14_ = Class282.anIntArray4430[i_13_];
		    int i_15_ = Class282.anIntArray4441[i_13_];
		    if (Class296.anInt4513 * 115241065 != 5) {
			i_14_
			    = i_14_ * 256 / (256
					     + client.anInt8377 * 1747300637);
			i_15_ = i_15_ * 256 / (1747300637 * client.anInt8377
					       + 256);
		    }
		    is[i_12_ * 2]
			= ((((i_9_ + class515.anIntArray6737[2 * i_12_] * 4)
			     * i_15_)
			    + (i_14_
			       * (4 * class515.anIntArray6737[1 + 2 * i_12_]
				  + i_10_)))
			   >> 14) + (class58.anInt850 * 439139681 / 2 + i);
		    is[2 * i_12_ + 1]
			= (i_8_ + 1463495207 * class58.scrollMinY / 2
			   - ((i_15_ * (i_10_ + (class515.anIntArray6737
						 [2 * i_12_ + 1]) * 4)
			       - (i_14_
				  * (4 * class515.anIntArray6737[i_12_ * 2]
				     + i_9_)))
			      >> 14));
		}
		Class118 class118 = class58.method1518(class103, -1586804466);
		if (null != class118)
		    Class99.method2177(class103, is,
				       1002290129 * class515.anInt6761,
				       class118.anIntArray1555,
				       class118.anIntArray1557);
		if (1183606681 * class515.anInt6762 > 0) {
		    for (int i_16_ = 0; i_16_ < is.length / 2 - 1; i_16_++) {
			int i_17_ = is[i_16_ * 2];
			int i_18_ = is[1 + 2 * i_16_];
			int i_19_ = is[2 * (i_16_ + 1)];
			int i_20_ = is[1 + 2 * (1 + i_16_)];
			if (i_19_ < i_17_) {
			    int i_21_ = i_17_;
			    int i_22_ = i_18_;
			    i_17_ = i_19_;
			    i_18_ = i_20_;
			    i_19_ = i_21_;
			    i_20_ = i_22_;
			} else if (i_19_ == i_17_ && i_20_ < i_18_) {
			    int i_23_ = i_18_;
			    i_18_ = i_20_;
			    i_20_ = i_23_;
			}
			if (class135 != null)
			    class103.method2297
				(i_17_, i_18_, i_19_, i_20_,
				 (class515.anIntArray6758
				  [class515.aByteArray6768[i_16_] & 0xff]),
				 1, class135, i, i_8_,
				 1183606681 * class515.anInt6762,
				 2024392745 * class515.anInt6763,
				 -1103664939 * class515.anInt6764);
			else
			    class103.method2276
				(i_17_, i_18_, i_19_, i_20_,
				 (class515.anIntArray6758
				  [class515.aByteArray6768[i_16_] & 0xff]),
				 1, class515.anInt6762 * 1183606681,
				 class515.anInt6763 * 2024392745,
				 -1103664939 * class515.anInt6764);
		    }
		    int i_24_ = is[is.length - 2];
		    int i_25_ = is[is.length - 1];
		    int i_26_ = is[0];
		    int i_27_ = is[1];
		    if (i_26_ < i_24_) {
			int i_28_ = i_24_;
			int i_29_ = i_25_;
			i_24_ = i_26_;
			i_25_ = i_27_;
			i_26_ = i_28_;
			i_27_ = i_29_;
		    } else if (i_24_ == i_26_ && i_27_ < i_25_) {
			int i_30_ = i_25_;
			i_25_ = i_27_;
			i_27_ = i_30_;
		    }
		    if (null != class135)
			class103.method2297(i_24_, i_25_, i_26_, i_27_,
					    (class515.anIntArray6758
					     [(class515.aByteArray6768
					       [(class515.aByteArray6768.length
						 - 1)]) & 0xff]),
					    1, class135, i, i_8_,
					    class515.anInt6762 * 1183606681,
					    2024392745 * class515.anInt6763,
					    -1103664939 * class515.anInt6764);
		    else
			class103.method2276(i_24_, i_25_, i_26_, i_27_,
					    (class515.anIntArray6758
					     [(class515.aByteArray6768
					       [(class515.aByteArray6768.length
						 - 1)]) & 0xff]),
					    1, class515.anInt6762 * 1183606681,
					    2024392745 * class515.anInt6763,
					    class515.anInt6764 * -1103664939);
		} else if (class135 != null) {
		    for (int i_31_ = 0; i_31_ < is.length / 2 - 1; i_31_++)
			class103.method2380(is[i_31_ * 2], is[2 * i_31_ + 1],
					    is[2 * (1 + i_31_)],
					    is[1 + 2 * (1 + i_31_)],
					    (class515.anIntArray6758
					     [(class515.aByteArray6768[i_31_]
					       & 0xff)]),
					    1, class135, i, i_8_);
		    class103.method2380(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class515.anIntArray6758
					 [(class515.aByteArray6768
					   [(class515.aByteArray6768.length
					     - 1)]) & 0xff]),
					1, class135, i, i_8_);
		} else {
		    for (int i_32_ = 0; i_32_ < is.length / 2 - 1; i_32_++)
			class103.method2274(is[i_32_ * 2], is[1 + i_32_ * 2],
					    is[(1 + i_32_) * 2],
					    is[(1 + i_32_) * 2 + 1],
					    (class515.anIntArray6758
					     [(class515.aByteArray6768[i_32_]
					       & 0xff)]),
					    1);
		    class103.method2274(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class515.anIntArray6758
					 [(class515.aByteArray6768
					   [(class515.aByteArray6768.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class168 class168 = null;
	    if (-1 != class515.anInt6772 * -705700883) {
		class168 = class515.method11579(class103, false, (byte) 2);
		if (null != class168)
		    Class212.method4293(class58, class135, i, i_8_, i_9_,
					i_10_, class168,
					(double) (987031167
						  * (Class128.aClass513_1589
						     .anInt6717)));
	    }
	    if (class515.aString6756 != null) {
		int i_33_ = 0;
		if (class168 != null)
		    i_33_ = class168.method3606();
		Class96 class96 = Class247_Sub2.aClass96_10073;
		Class639 class639 = Class494.aClass639_6519;
		if (1 == class515.anInt6760 * 723243945) {
		    class96 = Class5.aClass96_26;
		    class639 = Class5.aClass639_25;
		}
		if (723243945 * class515.anInt6760 == 2) {
		    class96 = Class81.aClass96_1149;
		    class639 = Class5.aClass639_19;
		}
		Class344.method6174(class58, class135, i, i_8_, i_9_, i_10_,
				    i_33_, class515.aString6756, class96,
				    class639, class515.anInt6750 * 2101573455,
				    (byte) 6);
	    }
	}
    }
    
    static void method3953(InterfaceComponent class58, Class135 class135, int i,
			   int i_34_, int i_35_, int i_36_, Class168 class168,
			   double d) {
	if (class168 != null) {
	    int i_37_;
	    if (4 == 115241065 * Class296.anInt4513)
		i_37_ = ((int) ((double) Class445_Sub16.aClass351_Sub1_8660
					     .method6292((byte) 62)
				* 2607.5945876176133)
			 + 390680985 * client.anInt8513) & 0x3fff;
	    else if (5 == Class296.anInt4513 * 115241065)
		i_37_ = (int) client.aFloat8581 & 0x3fff;
	    else
		i_37_ = ((int) client.aFloat8581 + 390680985 * client.anInt8513
			 & 0x3fff);
	    int i_38_ = (Math.max(439139681 * class58.anInt850 / 2,
				  1463495207 * class58.scrollMinY / 2)
			 + 10);
	    int i_39_ = i_36_ * i_36_ + i_35_ * i_35_;
	    if (i_39_ <= i_38_ * i_38_) {
		int i_40_ = Class282.anIntArray4430[i_37_];
		int i_41_ = Class282.anIntArray4441[i_37_];
		if (Class296.anInt4513 * 115241065 != 5) {
		    i_40_
			= 256 * i_40_ / (256 + client.anInt8377 * 1747300637);
		    i_41_
			= i_41_ * 256 / (256 + client.anInt8377 * 1747300637);
		}
		int i_42_ = i_35_ * i_41_ + i_40_ * i_36_ >> 14;
		int i_43_ = i_36_ * i_41_ - i_40_ * i_35_ >> 14;
		double d_44_ = d / 100.0;
		if (null != class135) {
		    if (1.0 == d_44_)
			class168.method3679((i
					     + 439139681 * class58.anInt850 / 2
					     + i_42_
					     - class168.method64() / 2),
					    (i_34_
					     + (1463495207 * class58.scrollMinY
						/ 2)
					     - i_43_ - class168.method3616()),
					    class135, i, i_34_);
		    else
			class168.method3614
			    ((i_42_ + (class58.anInt850 * 439139681 / 2 + i)
			      - (int) ((double) (class168.method64() / 2)
				       * d_44_)),
			     (1463495207 * class58.scrollMinY / 2 + i_34_ - i_43_
			      - (int) ((double) class168.method3616()
				       * d_44_)),
			     (int) ((double) class168.method64() * d_44_),
			     (int) ((double) class168.method3616() * d_44_));
		} else {
		    if (1.0 == d_44_)
			class168.method3646
			    ((i_42_ + (i + 439139681 * class58.anInt850 / 2)
			      - class168.method64() / 2),
			     (i_34_ + class58.scrollMinY * 1463495207 / 2 - i_43_
			      - class168.method3616()));
		    class168.method3614
			((i + 439139681 * class58.anInt850 / 2 + i_42_
			  - (int) ((double) (class168.method64() / 2)
				   * d_44_)),
			 (1463495207 * class58.scrollMinY / 2 + i_34_ - i_43_
			  - (int) ((double) class168.method3616() * d_44_)),
			 (int) ((double) class168.method64() * d_44_),
			 (int) ((double) class168.method3616() * d_44_));
		}
	    }
	}
    }
    
    static void method3954(Class103 class103, int i, int i_45_,
			   InterfaceComponent class58, Class135 class135, int i_46_,
			   int i_47_) {
	for (int i_48_ = 0; i_48_ < client.localNpcCount * -1837469873; i_48_++) {
	    ObjectNode class241_sub26
		= ((ObjectNode)
		   client.aClass407_8457
		       .get((long) client.localNpcIndicies[i_48_]));
	    if (null != class241_sub26) {
		NPC class475_sub1_sub1_sub3_sub2
		    = ((NPC)
		       class241_sub26.objectValue);
		if (class475_sub1_sub1_sub3_sub2.method17992((byte) -31)
		    && (Class21.myPlayer.nodePlane
			== class475_sub1_sub1_sub3_sub2.nodePlane)) {
		    NPCDefinition class401
			= class475_sub1_sub1_sub3_sub2.definition;
		    if (class401 != null && class401.transformTo != null)
			class401 = class401.method7176(Class1.aClass19_11,
						       Class1.aClass19_11,
						       (byte) 25);
		    if (class401 != null && class401.visibleOnMap
			&& class401.aBool5839) {
			Class287 class287
			    = (class475_sub1_sub1_sub3_sub2.method10874()
			       .aClass287_4386);
			int i_49_ = (int) class287.aFloat4477 / 128 - i / 128;
			int i_50_
			    = (int) class287.aFloat4479 / 128 - i_45_ / 128;
			if (-1 != -290022879 * class401.anInt5837)
			    Class106.method2674(class103, class135, class58,
						i_46_, i_47_, i_49_, i_50_,
						(class401.anInt5837
						 * -290022879),
						(byte) 23);
			else
			    Class1.method452(class58, class135, i_46_, i_47_,
					     i_49_, i_50_,
					     HitMarkTypeList.aClass168Array7251[1],
					     1937696813);
		    }
		}
	    }
	}
    }
    
    static void method3955(Class103 class103) {
	if ((Class21.myPlayer.nodePlane
	     != anInt2299 * -1342949133)
	    && client.aClass238_8477.method4751(-596998051) != null) {
	    Class50.method1249((byte) 1);
	    if (Class241_Sub41.method16449(class103,
					   (Class21
					    .myPlayer
					    .nodePlane),
					   (byte) -12))
		anInt2299
		    = (472227899
		       * Class21.myPlayer.nodePlane);
	}
    }
    
    static {
	anInt2299 = -472227899;
	anInt2303 = 0;
	anIntArray2304 = new int[1009];
	anIntArray2313 = new int[1012];
	anIntArray2306 = new int[1011];
	aClass429_2307 = new NodeCollection();
	minimapFlagX = 980260023;
	minimapFlagY = 1262506991;
	aBool2302 = true;
	aBool2310 = false;
	anInt2311 = 0;
    }
    
    public static void method3956() {
	int i = client.aClass238_8477.method4744(-2079580710);
	int i_51_ = client.aClass238_8477.method4745(1627400228);
	Class458.aBoolArrayArray6260 = new boolean[i >> 3][i_51_ >> 3];
    }
    
    static void method3957(int i) {
	anInt2303 = 0;
	int i_52_ = client.aClass238_8477.method4744(-1860468066);
	int i_53_ = client.aClass238_8477.method4745(687660857);
	Class215 class215 = client.aClass238_8477.method4753((byte) -89);
	Class552 class552 = client.aClass238_8477.method4751(-723898115);
	ObjectDefinitionLoader class532 = client.aClass238_8477.getObjectLoader(-1937428047);
	int i_54_ = i;
	if (null != Class21.myPlayer) {
	    int i_55_
		= (Class21.myPlayer.scenePositionXQueue[0]
		   >> 3);
	    int i_56_
		= (Class21.myPlayer.scenePositionYQueue[0]
		   >> 3);
	    if (i_55_ >= 0 && i_55_ < Class458.aBoolArrayArray6260.length
		&& i_56_ >= 0
		&& i_56_ < Class458.aBoolArrayArray6260[i_55_].length
		&& Class458.aBoolArrayArray6260[i_55_][i_56_])
		i_54_ = 0;
	}
	for (int i_57_ = 0; i_57_ < i_52_; i_57_++) {
	    for (int i_58_ = 0; i_58_ < i_53_; i_58_++) {
		for (int i_59_ = i_54_; i_59_ <= 1 + i && i_59_ <= 3;
		     i_59_++) {
		    if ((i_59_ < i || class215.method4332(i, i_59_, i_57_,
							  i_58_, 2080324141))
			&& !(Class112.method2780
			     ((Interface24) class552.method12100(i_59_, i_57_,
								 i_58_,
								 1333689975),
			      class532, i_57_, i_58_, 1519458169))
			&& !(Class112.method2780
			     (((Interface24)
			       class552.method12136(i_59_, i_57_, i_58_,
						    client.anInterface57_8577,
						    796743337)),
			      class532, i_57_, i_58_, 1617453608))
			&& !(Class112.method2780
			     ((Interface24) class552.method12132(i_59_, i_57_,
								 i_58_,
								 (byte) 7),
			      class532, i_57_, i_58_, 2143667330))
			&& !(Class112.method2780
			     ((Interface24) class552.method12162(i_59_, i_57_,
								 i_58_,
								 -1898263266),
			      class532, i_57_, i_58_, 1499791722))) {
			/* empty */
		    }
		}
	    }
	}
    }
    
    static void method3958(int i) {
	anInt2303 = 0;
	int i_60_ = client.aClass238_8477.method4744(-1710375024);
	int i_61_ = client.aClass238_8477.method4745(1968618168);
	Class215 class215 = client.aClass238_8477.method4753((byte) -115);
	Class552 class552 = client.aClass238_8477.method4751(-1273902703);
	ObjectDefinitionLoader class532 = client.aClass238_8477.getObjectLoader(-2137813708);
	int i_62_ = i;
	if (null != Class21.myPlayer) {
	    int i_63_
		= (Class21.myPlayer.scenePositionXQueue[0]
		   >> 3);
	    int i_64_
		= (Class21.myPlayer.scenePositionYQueue[0]
		   >> 3);
	    if (i_63_ >= 0 && i_63_ < Class458.aBoolArrayArray6260.length
		&& i_64_ >= 0
		&& i_64_ < Class458.aBoolArrayArray6260[i_63_].length
		&& Class458.aBoolArrayArray6260[i_63_][i_64_])
		i_62_ = 0;
	}
	for (int i_65_ = 0; i_65_ < i_60_; i_65_++) {
	    for (int i_66_ = 0; i_66_ < i_61_; i_66_++) {
		for (int i_67_ = i_62_; i_67_ <= 1 + i && i_67_ <= 3;
		     i_67_++) {
		    if ((i_67_ < i || class215.method4332(i, i_67_, i_65_,
							  i_66_, 1987596610))
			&& !(Class112.method2780
			     ((Interface24) class552.method12100(i_67_, i_65_,
								 i_66_,
								 1735831541),
			      class532, i_65_, i_66_, 2092136774))
			&& !(Class112.method2780
			     (((Interface24)
			       class552.method12136(i_67_, i_65_, i_66_,
						    client.anInterface57_8577,
						    -1125830775)),
			      class532, i_65_, i_66_, 1103630491))
			&& !(Class112.method2780
			     ((Interface24) class552.method12132(i_67_, i_65_,
								 i_66_,
								 (byte) 7),
			      class532, i_65_, i_66_, 1647698175))
			&& !(Class112.method2780
			     ((Interface24) class552.method12162(i_67_, i_65_,
								 i_66_,
								 1403661255),
			      class532, i_65_, i_66_, 1120102985))) {
			/* empty */
		    }
		}
	    }
	}
    }
    
    static void method3959(Class103 class103, int i, int i_68_, int i_69_,
			   int i_70_, int i_71_, int i_72_, int i_73_) {
	Class552 class552 = client.aClass238_8477.method4751(-1131058948);
	Interface24 interface24
	    = (Interface24) class552.method12132(i, i_68_, i_69_, (byte) 7);
	if (null != interface24) {
	    ObjectDefinition class526
		= client.aClass238_8477.getObjectLoader(-2068034380)
		      .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	    int i_74_ = interface24.method140(1966692109) & 0x3;
	    int i_75_ = interface24.method139(591463713);
	    if (-1 != class526.anInt6864 * -1848119147)
		Exception_Sub4.method16945(class103, class526, i_74_, i_70_,
					   i_71_, (byte) -95);
	    else {
		int i_76_ = i_72_;
		if (-1389471035 * class526.anInt6848 > 0)
		    i_76_ = i_73_;
		if (-2030829961 * Class527.aClass527_6932.anInt6931 == i_75_
		    || (i_75_
			== -2030829961 * Class527.aClass527_6910.anInt6931)) {
		    if (i_74_ == 0)
			class103.method2241(i_70_, i_71_, 4, i_76_,
					    -517857856);
		    else if (1 == i_74_)
			class103.method2265(i_70_, i_71_, 4, i_76_,
					    -2039639982);
		    else if (2 == i_74_)
			class103.method2241(3 + i_70_, i_71_, 4, i_76_,
					    -517857856);
		    else if (3 == i_74_)
			class103.method2265(i_70_, 3 + i_71_, 4, i_76_,
					    -1749487207);
		}
		if (i_75_ == -2030829961 * Class527.aClass527_6916.anInt6931) {
		    if (i_74_ == 0)
			class103.method2263(i_70_, i_71_, 1, 1, i_76_,
					    (byte) -32);
		    else if (1 == i_74_)
			class103.method2263(i_70_ + 3, i_71_, 1, 1, i_76_,
					    (byte) -3);
		    else if (2 == i_74_)
			class103.method2263(i_70_ + 3, i_71_ + 3, 1, 1, i_76_,
					    (byte) -75);
		    else if (3 == i_74_)
			class103.method2263(i_70_, i_71_ + 3, 1, 1, i_76_,
					    (byte) -80);
		}
		if (Class527.aClass527_6910.anInt6931 * -2030829961 == i_75_) {
		    if (0 == i_74_)
			class103.method2265(i_70_, i_71_, 4, i_76_,
					    -1280957433);
		    else if (1 == i_74_)
			class103.method2241(3 + i_70_, i_71_, 4, i_76_,
					    -517857856);
		    else if (i_74_ == 2)
			class103.method2265(i_70_, 3 + i_71_, 4, i_76_,
					    -1697698219);
		    else if (3 == i_74_)
			class103.method2241(i_70_, i_71_, 4, i_76_,
					    -517857856);
		}
	    }
	}
	interface24
	    = (Interface24) class552.method12136(i, i_68_, i_69_,
						 client.anInterface57_8577,
						 -727197063);
	if (interface24 != null) {
	    ObjectDefinition class526
		= client.aClass238_8477.getObjectLoader(-1851465293)
		      .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	    int i_77_ = interface24.method140(-902488324) & 0x3;
	    int i_78_ = interface24.method139(591463713);
	    if (-1 != -1848119147 * class526.anInt6864)
		Exception_Sub4.method16945(class103, class526, i_77_, i_70_,
					   i_71_, (byte) 34);
	    else if (i_78_
		     == Class527.aClass527_6912.anInt6931 * -2030829961) {
		int i_79_ = -1118482;
		if (-1389471035 * class526.anInt6848 > 0)
		    i_79_ = -1179648;
		if (i_77_ == 0 || i_77_ == 2)
		    class103.method2517(i_70_, 3 + i_71_, i_70_ + 3, i_71_,
					i_79_, 223909001);
		else
		    class103.method2517(i_70_, i_71_, 3 + i_70_, i_71_ + 3,
					i_79_, 223909001);
	    }
	}
	interface24
	    = (Interface24) class552.method12100(i, i_68_, i_69_, 1808873040);
	if (null != interface24) {
	    ObjectDefinition class526
		= client.aClass238_8477.getObjectLoader(-1939490218)
		      .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	    int i_80_ = interface24.method140(269848098) & 0x3;
	    if (-1 != -1848119147 * class526.anInt6864)
		Exception_Sub4.method16945(class103, class526, i_80_, i_70_,
					   i_71_, (byte) -37);
	}
    }
    
    static boolean method3960(Interface24 interface24, ObjectDefinitionLoader class532,
			      int i, int i_81_) {
		if (null == interface24) {
		    return false;
		}
		ObjectDefinition class526
		    = class532.getObjectDefinition(interface24.method146((byte) 0), 577892407);
		if (class526.membersObject && !client.isP2pWorld) {
		    return false;
		}
		int i_82_ = class526.mapSpriteID * 8166631;
		if (class526.toObjectIDs != null) {
		    for (int i_83_ = 0; i_83_ < class526.toObjectIDs.length; i_83_++) {
				if (-1 != class526.toObjectIDs[i_83_]) {
				    ObjectDefinition class526_84_
					= class532.getObjectDefinition(class526.toObjectIDs[i_83_], 577892407);
				    if (8166631 * class526_84_.mapSpriteID >= 0) {
				    	i_82_ = class526_84_.mapSpriteID * 8166631;
				    }
				}
		    }
		}
		if (i_82_ >= 0) {
		    anIntArray2306[anInt2303 * -1037886889] = -2079513015 * class526.objectID;
		    anIntArray2304[-1037886889 * anInt2303] = i;
		    anIntArray2313[-1037886889 * anInt2303] = i_81_;
		    anInt2303 += -54496921;
		    return true;
		}
		return false;
    }
    
    static void method3961(Class103 class103, Class135 class135,
			   InterfaceComponent class58, int i, int i_85_, int i_86_,
			   int i_87_, int i_88_) {
	Class515 class515
	    = Class441.aClass524_6158.method11745(i_88_, -637564624);
	if (class515 != null && class515.aBool6744
	    && class515.method11587(Class1.aClass19_11, Class1.aClass19_11,
				    164493416)) {
	    if (null != class515.anIntArray6737) {
		int[] is = new int[class515.anIntArray6737.length];
		for (int i_89_ = 0; i_89_ < is.length / 2; i_89_++) {
		    int i_90_;
		    if (4 == 115241065 * Class296.anInt4513)
			i_90_ = ((int) ((double) Class445_Sub16
						     .aClass351_Sub1_8660
						     .method6292((byte) 101)
					* 2607.5945876176133)
				 + client.anInt8513 * 390680985) & 0x3fff;
		    else if (115241065 * Class296.anInt4513 == 5)
			i_90_ = (int) client.aFloat8581 & 0x3fff;
		    else
			i_90_ = ((int) client.aFloat8581
				 + client.anInt8513 * 390680985) & 0x3fff;
		    int i_91_ = Class282.anIntArray4430[i_90_];
		    int i_92_ = Class282.anIntArray4441[i_90_];
		    if (Class296.anInt4513 * 115241065 != 5) {
			i_91_
			    = i_91_ * 256 / (256
					     + client.anInt8377 * 1747300637);
			i_92_ = i_92_ * 256 / (1747300637 * client.anInt8377
					       + 256);
		    }
		    is[i_89_ * 2]
			= ((((i_86_ + class515.anIntArray6737[2 * i_89_] * 4)
			     * i_92_)
			    + (i_91_
			       * (4 * class515.anIntArray6737[1 + 2 * i_89_]
				  + i_87_)))
			   >> 14) + (class58.anInt850 * 439139681 / 2 + i);
		    is[2 * i_89_ + 1]
			= (i_85_ + 1463495207 * class58.scrollMinY / 2
			   - ((i_92_ * (i_87_ + (class515.anIntArray6737
						 [2 * i_89_ + 1]) * 4)
			       - (i_91_
				  * (4 * class515.anIntArray6737[i_89_ * 2]
				     + i_86_)))
			      >> 14));
		}
		Class118 class118 = class58.method1518(class103, -1865272511);
		if (null != class118)
		    Class99.method2177(class103, is,
				       1002290129 * class515.anInt6761,
				       class118.anIntArray1555,
				       class118.anIntArray1557);
		if (1183606681 * class515.anInt6762 > 0) {
		    for (int i_93_ = 0; i_93_ < is.length / 2 - 1; i_93_++) {
			int i_94_ = is[i_93_ * 2];
			int i_95_ = is[1 + 2 * i_93_];
			int i_96_ = is[2 * (i_93_ + 1)];
			int i_97_ = is[1 + 2 * (1 + i_93_)];
			if (i_96_ < i_94_) {
			    int i_98_ = i_94_;
			    int i_99_ = i_95_;
			    i_94_ = i_96_;
			    i_95_ = i_97_;
			    i_96_ = i_98_;
			    i_97_ = i_99_;
			} else if (i_96_ == i_94_ && i_97_ < i_95_) {
			    int i_100_ = i_95_;
			    i_95_ = i_97_;
			    i_97_ = i_100_;
			}
			if (class135 != null)
			    class103.method2297
				(i_94_, i_95_, i_96_, i_97_,
				 (class515.anIntArray6758
				  [class515.aByteArray6768[i_93_] & 0xff]),
				 1, class135, i, i_85_,
				 1183606681 * class515.anInt6762,
				 2024392745 * class515.anInt6763,
				 -1103664939 * class515.anInt6764);
			else
			    class103.method2276
				(i_94_, i_95_, i_96_, i_97_,
				 (class515.anIntArray6758
				  [class515.aByteArray6768[i_93_] & 0xff]),
				 1, class515.anInt6762 * 1183606681,
				 class515.anInt6763 * 2024392745,
				 -1103664939 * class515.anInt6764);
		    }
		    int i_101_ = is[is.length - 2];
		    int i_102_ = is[is.length - 1];
		    int i_103_ = is[0];
		    int i_104_ = is[1];
		    if (i_103_ < i_101_) {
			int i_105_ = i_101_;
			int i_106_ = i_102_;
			i_101_ = i_103_;
			i_102_ = i_104_;
			i_103_ = i_105_;
			i_104_ = i_106_;
		    } else if (i_101_ == i_103_ && i_104_ < i_102_) {
			int i_107_ = i_102_;
			i_102_ = i_104_;
			i_104_ = i_107_;
		    }
		    if (null != class135)
			class103.method2297(i_101_, i_102_, i_103_, i_104_,
					    (class515.anIntArray6758
					     [(class515.aByteArray6768
					       [(class515.aByteArray6768.length
						 - 1)]) & 0xff]),
					    1, class135, i, i_85_,
					    class515.anInt6762 * 1183606681,
					    2024392745 * class515.anInt6763,
					    -1103664939 * class515.anInt6764);
		    else
			class103.method2276(i_101_, i_102_, i_103_, i_104_,
					    (class515.anIntArray6758
					     [(class515.aByteArray6768
					       [(class515.aByteArray6768.length
						 - 1)]) & 0xff]),
					    1, class515.anInt6762 * 1183606681,
					    2024392745 * class515.anInt6763,
					    class515.anInt6764 * -1103664939);
		} else if (class135 != null) {
		    for (int i_108_ = 0; i_108_ < is.length / 2 - 1; i_108_++)
			class103.method2380(is[i_108_ * 2], is[2 * i_108_ + 1],
					    is[2 * (1 + i_108_)],
					    is[1 + 2 * (1 + i_108_)],
					    (class515.anIntArray6758
					     [(class515.aByteArray6768[i_108_]
					       & 0xff)]),
					    1, class135, i, i_85_);
		    class103.method2380(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class515.anIntArray6758
					 [(class515.aByteArray6768
					   [(class515.aByteArray6768.length
					     - 1)]) & 0xff]),
					1, class135, i, i_85_);
		} else {
		    for (int i_109_ = 0; i_109_ < is.length / 2 - 1; i_109_++)
			class103.method2274(is[i_109_ * 2], is[1 + i_109_ * 2],
					    is[(1 + i_109_) * 2],
					    is[(1 + i_109_) * 2 + 1],
					    (class515.anIntArray6758
					     [(class515.aByteArray6768[i_109_]
					       & 0xff)]),
					    1);
		    class103.method2274(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class515.anIntArray6758
					 [(class515.aByteArray6768
					   [(class515.aByteArray6768.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class168 class168 = null;
	    if (-1 != class515.anInt6772 * -705700883) {
		class168 = class515.method11579(class103, false, (byte) 2);
		if (null != class168)
		    Class212.method4293(class58, class135, i, i_85_, i_86_,
					i_87_, class168,
					(double) (987031167
						  * (Class128.aClass513_1589
						     .anInt6717)));
	    }
	    if (class515.aString6756 != null) {
		int i_110_ = 0;
		if (class168 != null)
		    i_110_ = class168.method3606();
		Class96 class96 = Class247_Sub2.aClass96_10073;
		Class639 class639 = Class494.aClass639_6519;
		if (1 == class515.anInt6760 * 723243945) {
		    class96 = Class5.aClass96_26;
		    class639 = Class5.aClass639_25;
		}
		if (723243945 * class515.anInt6760 == 2) {
		    class96 = Class81.aClass96_1149;
		    class639 = Class5.aClass639_19;
		}
		Class344.method6174(class58, class135, i, i_85_, i_86_, i_87_,
				    i_110_, class515.aString6756, class96,
				    class639, class515.anInt6750 * 2101573455,
				    (byte) 6);
	    }
	}
    }
    
    static boolean method3962(int i, int i_111_, int i_112_) {
	Class552 class552 = client.aClass238_8477.method4751(-1845843315);
	boolean bool = true;
	Interface24 interface24
	    = (Interface24) class552.method12132(i, i_111_, i_112_, (byte) 7);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, 1449327998);
	interface24
	    = (Interface24) class552.method12136(i, i_111_, i_112_,
						 client.anInterface57_8577,
						 1822706344);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, 201837221);
	interface24 = (Interface24) class552.method12100(i, i_111_, i_112_,
							 1622682162);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -1018246121);
	return bool;
    }
    
    static boolean method3963(int i, int i_113_, int i_114_) {
	Class552 class552 = client.aClass238_8477.method4751(-1245829275);
	boolean bool = true;
	Interface24 interface24
	    = (Interface24) class552.method12132(i, i_113_, i_114_, (byte) 7);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -1748169262);
	interface24
	    = (Interface24) class552.method12136(i, i_113_, i_114_,
						 client.anInterface57_8577,
						 976631566);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, 1314417722);
	interface24 = (Interface24) class552.method12100(i, i_113_, i_114_,
							 2078647067);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -313644086);
	return bool;
    }
    
    static void method3964(Class103 class103, int i, int i_115_,
			   InterfaceComponent class58, Class135 class135, int i_116_,
			   int i_117_) {
	for (int i_118_ = 0; i_118_ < client.localNpcCount * -1837469873;
	     i_118_++) {
	    ObjectNode class241_sub26
		= ((ObjectNode)
		   client.aClass407_8457
		       .get((long) client.localNpcIndicies[i_118_]));
	    if (null != class241_sub26) {
		NPC class475_sub1_sub1_sub3_sub2
		    = ((NPC)
		       class241_sub26.objectValue);
		if (class475_sub1_sub1_sub3_sub2.method17992((byte) -40)
		    && (Class21.myPlayer.nodePlane
			== class475_sub1_sub1_sub3_sub2.nodePlane)) {
		    NPCDefinition class401
			= class475_sub1_sub1_sub3_sub2.definition;
		    if (class401 != null && class401.transformTo != null)
			class401 = class401.method7176(Class1.aClass19_11,
						       Class1.aClass19_11,
						       (byte) 50);
		    if (class401 != null && class401.visibleOnMap
			&& class401.aBool5839) {
			Class287 class287
			    = (class475_sub1_sub1_sub3_sub2.method10874()
			       .aClass287_4386);
			int i_119_ = (int) class287.aFloat4477 / 128 - i / 128;
			int i_120_
			    = (int) class287.aFloat4479 / 128 - i_115_ / 128;
			if (-1 != -290022879 * class401.anInt5837)
			    Class106.method2674(class103, class135, class58,
						i_116_, i_117_, i_119_, i_120_,
						(class401.anInt5837
						 * -290022879),
						(byte) 64);
			else
			    Class1.method452(class58, class135, i_116_, i_117_,
					     i_119_, i_120_,
					     HitMarkTypeList.aClass168Array7251[1],
					     938489521);
		    }
		}
	    }
	}
    }
    
    static boolean method3965(Interface24 interface24) {
	ObjectDefinition class526
	    = client.aClass238_8477.getObjectLoader(-1939927864)
		  .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	if (-1 == -1848119147 * class526.anInt6864)
	    return true;
	Class601 class601
	    = Class8.aClass598_46.method13117(-1848119147 * class526.anInt6864,
					      -1766871394);
	if (class601.anInt7729 * 1186810875 == -1)
	    return true;
	return class601.method13161(-943309329);
    }
    
    static boolean method3966(Interface24 interface24) {
	ObjectDefinition class526
	    = client.aClass238_8477.getObjectLoader(-1874654848)
		  .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	if (-1 == -1848119147 * class526.anInt6864)
	    return true;
	Class601 class601
	    = Class8.aClass598_46.method13117(-1848119147 * class526.anInt6864,
					      -917354993);
	if (class601.anInt7729 * 1186810875 == -1)
	    return true;
	return class601.method13161(144799267);
    }
    
    static boolean method3967(Interface24 interface24) {
	ObjectDefinition class526
	    = client.aClass238_8477.getObjectLoader(-2083803911)
		  .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	if (-1 == -1848119147 * class526.anInt6864)
	    return true;
	Class601 class601
	    = Class8.aClass598_46.method13117(-1848119147 * class526.anInt6864,
					      1158171576);
	if (class601.anInt7729 * 1186810875 == -1)
	    return true;
	return class601.method13161(-602237576);
    }
    
    static void method3968(InterfaceComponent class58, Class135 class135, int i,
			   int i_121_, int i_122_, int i_123_,
			   Class168 class168, double d) {
	if (class168 != null) {
	    int i_124_;
	    if (4 == 115241065 * Class296.anInt4513)
		i_124_ = ((int) ((double) Class445_Sub16
					      .aClass351_Sub1_8660
					      .method6292((byte) 25)
				 * 2607.5945876176133)
			  + 390680985 * client.anInt8513) & 0x3fff;
	    else if (5 == Class296.anInt4513 * 115241065)
		i_124_ = (int) client.aFloat8581 & 0x3fff;
	    else
		i_124_
		    = ((int) client.aFloat8581 + 390680985 * client.anInt8513
		       & 0x3fff);
	    int i_125_ = (Math.max(439139681 * class58.anInt850 / 2,
				   1463495207 * class58.scrollMinY / 2)
			  + 10);
	    int i_126_ = i_123_ * i_123_ + i_122_ * i_122_;
	    if (i_126_ <= i_125_ * i_125_) {
		int i_127_ = Class282.anIntArray4430[i_124_];
		int i_128_ = Class282.anIntArray4441[i_124_];
		if (Class296.anInt4513 * 115241065 != 5) {
		    i_127_
			= 256 * i_127_ / (256 + client.anInt8377 * 1747300637);
		    i_128_
			= i_128_ * 256 / (256 + client.anInt8377 * 1747300637);
		}
		int i_129_ = i_122_ * i_128_ + i_127_ * i_123_ >> 14;
		int i_130_ = i_123_ * i_128_ - i_127_ * i_122_ >> 14;
		double d_131_ = d / 100.0;
		if (null != class135) {
		    if (1.0 == d_131_)
			class168.method3679((i
					     + 439139681 * class58.anInt850 / 2
					     + i_129_
					     - class168.method64() / 2),
					    (i_121_
					     + (1463495207 * class58.scrollMinY
						/ 2)
					     - i_130_ - class168.method3616()),
					    class135, i, i_121_);
		    else
			class168.method3614
			    ((i_129_ + (class58.anInt850 * 439139681 / 2 + i)
			      - (int) ((double) (class168.method64() / 2)
				       * d_131_)),
			     (1463495207 * class58.scrollMinY / 2 + i_121_
			      - i_130_
			      - (int) ((double) class168.method3616()
				       * d_131_)),
			     (int) ((double) class168.method64() * d_131_),
			     (int) ((double) class168.method3616() * d_131_));
		} else {
		    if (1.0 == d_131_)
			class168.method3646
			    ((i_129_ + (i + 439139681 * class58.anInt850 / 2)
			      - class168.method64() / 2),
			     (i_121_ + class58.scrollMinY * 1463495207 / 2
			      - i_130_ - class168.method3616()));
		    class168.method3614
			((i + 439139681 * class58.anInt850 / 2 + i_129_
			  - (int) ((double) (class168.method64() / 2)
				   * d_131_)),
			 (1463495207 * class58.scrollMinY / 2 + i_121_ - i_130_
			  - (int) ((double) class168.method3616() * d_131_)),
			 (int) ((double) class168.method64() * d_131_),
			 (int) ((double) class168.method3616() * d_131_));
		}
	    }
	}
    }
    
    static void method3969(Class103 class103, int i, int i_132_, int i_133_,
			   int i_134_, int i_135_, int i_136_, int i_137_) {
	Class552 class552 = client.aClass238_8477.method4751(-1267499561);
	Interface24 interface24
	    = (Interface24) class552.method12132(i, i_132_, i_133_, (byte) 7);
	if (null != interface24) {
	    ObjectDefinition class526
		= client.aClass238_8477.getObjectLoader(-2133600855)
		      .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	    int i_138_ = interface24.method140(-1639990242) & 0x3;
	    int i_139_ = interface24.method139(591463713);
	    if (-1 != class526.anInt6864 * -1848119147)
		Exception_Sub4.method16945(class103, class526, i_138_, i_134_,
					   i_135_, (byte) -54);
	    else {
		int i_140_ = i_136_;
		if (-1389471035 * class526.anInt6848 > 0)
		    i_140_ = i_137_;
		if (-2030829961 * Class527.aClass527_6932.anInt6931 == i_139_
		    || (i_139_
			== -2030829961 * Class527.aClass527_6910.anInt6931)) {
		    if (i_138_ == 0)
			class103.method2241(i_134_, i_135_, 4, i_140_,
					    -517857856);
		    else if (1 == i_138_)
			class103.method2265(i_134_, i_135_, 4, i_140_,
					    -390470098);
		    else if (2 == i_138_)
			class103.method2241(3 + i_134_, i_135_, 4, i_140_,
					    -517857856);
		    else if (3 == i_138_)
			class103.method2265(i_134_, 3 + i_135_, 4, i_140_,
					    -602978230);
		}
		if (i_139_
		    == -2030829961 * Class527.aClass527_6916.anInt6931) {
		    if (i_138_ == 0)
			class103.method2263(i_134_, i_135_, 1, 1, i_140_,
					    (byte) -53);
		    else if (1 == i_138_)
			class103.method2263(i_134_ + 3, i_135_, 1, 1, i_140_,
					    (byte) -113);
		    else if (2 == i_138_)
			class103.method2263(i_134_ + 3, i_135_ + 3, 1, 1,
					    i_140_, (byte) -21);
		    else if (3 == i_138_)
			class103.method2263(i_134_, i_135_ + 3, 1, 1, i_140_,
					    (byte) -10);
		}
		if (Class527.aClass527_6910.anInt6931 * -2030829961
		    == i_139_) {
		    if (0 == i_138_)
			class103.method2265(i_134_, i_135_, 4, i_140_,
					    -307234921);
		    else if (1 == i_138_)
			class103.method2241(3 + i_134_, i_135_, 4, i_140_,
					    -517857856);
		    else if (i_138_ == 2)
			class103.method2265(i_134_, 3 + i_135_, 4, i_140_,
					    1434707210);
		    else if (3 == i_138_)
			class103.method2241(i_134_, i_135_, 4, i_140_,
					    -517857856);
		}
	    }
	}
	interface24
	    = (Interface24) class552.method12136(i, i_132_, i_133_,
						 client.anInterface57_8577,
						 -827755508);
	if (interface24 != null) {
	    ObjectDefinition class526
		= client.aClass238_8477.getObjectLoader(-1845921911)
		      .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	    int i_141_ = interface24.method140(-689226826) & 0x3;
	    int i_142_ = interface24.method139(591463713);
	    if (-1 != -1848119147 * class526.anInt6864)
		Exception_Sub4.method16945(class103, class526, i_141_, i_134_,
					   i_135_, (byte) 0);
	    else if (i_142_
		     == Class527.aClass527_6912.anInt6931 * -2030829961) {
		int i_143_ = -1118482;
		if (-1389471035 * class526.anInt6848 > 0)
		    i_143_ = -1179648;
		if (i_141_ == 0 || i_141_ == 2)
		    class103.method2517(i_134_, 3 + i_135_, i_134_ + 3, i_135_,
					i_143_, 223909001);
		else
		    class103.method2517(i_134_, i_135_, 3 + i_134_, i_135_ + 3,
					i_143_, 223909001);
	    }
	}
	interface24 = (Interface24) class552.method12100(i, i_132_, i_133_,
							 2126933895);
	if (null != interface24) {
	    ObjectDefinition class526
		= client.aClass238_8477.getObjectLoader(-1905616378)
		      .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	    int i_144_ = interface24.method140(1533134328) & 0x3;
	    if (-1 != -1848119147 * class526.anInt6864)
		Exception_Sub4.method16945(class103, class526, i_144_, i_134_,
					   i_135_, (byte) -3);
	}
    }
    
    static void method3970(Class103 class103, ObjectDefinition class526, int i,
			   int i_145_, int i_146_) {
	Class601 class601
	    = Class8.aClass598_46.method13117(class526.anInt6864 * -1848119147,
					      -587686351);
	if (-1 != class601.anInt7729 * 1186810875) {
	    if (class526.aBool6865) {
		i += class526.anInt6851 * 1592819903;
		i &= 0x3;
	    } else
		i = 0;
	    Class168 class168
		= class601.method13157(class103, i, class526.aBool6867,
				       (byte) -67);
	    if (null != class168) {
		int i_147_ = 1351092869 * class526.sizeX;
		int i_148_ = 333584223 * class526.sizeY;
		if ((i & 0x1) == 1) {
		    i_147_ = class526.sizeY * 333584223;
		    i_148_ = 1351092869 * class526.sizeX;
		}
		int i_149_ = class168.method64();
		int i_150_ = class168.method3616();
		if (class601.aBool7726) {
		    i_149_ = i_147_ * 4;
		    i_150_ = i_148_ * 4;
		}
		if (class601.anInt7727 * 987858283 != 0)
		    class168.method3615(i_145_, i_146_ - 4 * (i_148_ - 1),
					i_149_, i_150_, 0,
					(~0xffffff
					 | 987858283 * class601.anInt7727),
					1);
		else
		    class168.method3614(i_145_, i_146_ - 4 * (i_148_ - 1),
					i_149_, i_150_);
	    }
	}
    }
    
    static void method3971(Class103 class103, ObjectDefinition class526, int i,
			   int i_151_, int i_152_) {
	Class601 class601
	    = Class8.aClass598_46.method13117(class526.anInt6864 * -1848119147,
					      1349910437);
	if (-1 != class601.anInt7729 * 1186810875) {
	    if (class526.aBool6865) {
		i += class526.anInt6851 * 1592819903;
		i &= 0x3;
	    } else
		i = 0;
	    Class168 class168
		= class601.method13157(class103, i, class526.aBool6867,
				       (byte) -112);
	    if (null != class168) {
		int i_153_ = 1351092869 * class526.sizeX;
		int i_154_ = 333584223 * class526.sizeY;
		if ((i & 0x1) == 1) {
		    i_153_ = class526.sizeY * 333584223;
		    i_154_ = 1351092869 * class526.sizeX;
		}
		int i_155_ = class168.method64();
		int i_156_ = class168.method3616();
		if (class601.aBool7726) {
		    i_155_ = i_153_ * 4;
		    i_156_ = i_154_ * 4;
		}
		if (class601.anInt7727 * 987858283 != 0)
		    class168.method3615(i_151_, i_152_ - 4 * (i_154_ - 1),
					i_155_, i_156_, 0,
					(~0xffffff
					 | 987858283 * class601.anInt7727),
					1);
		else
		    class168.method3614(i_151_, i_152_ - 4 * (i_154_ - 1),
					i_155_, i_156_);
	    }
	}
    }
    
    static boolean method3972(Class103 class103, int i) {
	class103.method2291();
	Class50.method1249((byte) 1);
	if (!class103.method2304(-451935997))
	    return false;
	int i_157_ = client.aClass238_8477.method4744(-1931651269);
	int i_158_ = client.aClass238_8477.method4745(-1729321176);
	Class215 class215 = client.aClass238_8477.method4753((byte) -108);
	Class552 class552 = client.aClass238_8477.method4751(-755980336);
	int i_159_ = i;
	if (null != Class21.myPlayer) {
	    int i_160_
		= (Class21.myPlayer.scenePositionXQueue[0]
		   >> 3);
	    int i_161_
		= (Class21.myPlayer.scenePositionYQueue[0]
		   >> 3);
	    if (i_160_ >= 0 && i_160_ < Class458.aBoolArrayArray6260.length
		&& i_161_ >= 0
		&& i_161_ < Class458.aBoolArrayArray6260[i_160_].length
		&& Class458.aBoolArrayArray6260[i_160_][i_161_])
		i_159_ = 0;
	}
	int i_162_ = i_157_ / 2;
	int i_163_ = 0;
	int i_164_ = 0;
	boolean bool = true;
	for (int i_165_ = i_163_; i_165_ < i_157_ + i_163_; i_165_++) {
	    for (int i_166_ = i_164_; i_166_ < i_164_ + i_158_; i_166_++) {
		for (int i_167_ = i_159_; i_167_ <= 3; i_167_++) {
		    if (i_167_ < i
			|| class215.method4332(i, i_167_, i_165_, i_166_,
					       2113597469)) {
			int i_168_ = i_167_;
			if (class215.method4331(i_165_, i_166_, 1296095634))
			    i_168_--;
			if (i_168_ >= 0)
			    bool &= ReferenceTable.method5556(i_168_, i_165_, i_166_,
							(byte) 107);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_169_ = 48 + (48 + i_157_ * 4);
	int[] is = new int[i_169_ * i_169_];
	for (int i_170_ = 0; i_170_ < is.length; i_170_++)
	    is[i_170_] = 0;
	Class105_Sub2 class105_sub2 = null;
	int i_171_ = 0;
	int i_172_ = 0;
	if (aBool2301) {
	    Class65.aClass168_1046
		= class103.method2590(i_169_, i_169_, false, true);
	    class105_sub2 = class103.method2248();
	    class105_sub2.method15585(0, Class65.aClass168_1046.method3608());
	    Interface5 interface5 = class103.method2249(i_169_, i_169_);
	    class105_sub2.method15584(interface5);
	    class103.method2244(class105_sub2, -519163929);
	    i_162_ = i_157_;
	    i_171_ = 48;
	    i_172_ = 48;
	    class103.method2450(1, 0);
	} else
	    Class65.aClass168_1046 = class103.method2259(is, 0, i_169_, i_169_,
							 i_169_, (byte) 99);
	client.aClass238_8477.method4833(977416606).method11401(1711952426);
	int i_173_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_174_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_175_ = ((int) (Math.random() * 8.0) << 16
		      | (int) (Math.random() * 8.0) << 8
		      | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[i_162_ + 1 + 2][i_162_ + 1 + 2];
	for (int i_176_ = i_163_; i_176_ < i_163_ + i_157_; i_176_ += i_162_) {
	    for (int i_177_ = i_164_; i_177_ < i_164_ + i_158_;
		 i_177_ += i_162_) {
		int i_178_ = i_171_;
		int i_179_ = i_172_;
		int i_180_ = i_176_;
		if (i_180_ > 0) {
		    i_180_--;
		    i_178_ += 4;
		}
		int i_181_ = i_177_;
		if (i_181_ > 0)
		    i_181_--;
		int i_182_ = i_162_ + i_176_;
		if (i_182_ < i_157_)
		    i_182_++;
		int i_183_ = i_177_ + i_162_;
		if (i_183_ < i_158_) {
		    i_183_++;
		    i_179_ += 4;
		}
		if (aBool2300)
		    class103.method2572();
		else
		    class103.method2445(0, 0, 4 * i_162_ + i_178_,
					4 * i_162_ + i_179_);
		class103.method2450(3, -16777216);
		int i_184_ = i_162_;
		if (i_184_ > i_157_ - 1)
		    i_184_ = i_157_ - 1;
		for (int i_185_ = i_159_; i_185_ <= 3; i_185_++) {
		    for (int i_186_ = 0; i_186_ <= i_184_; i_186_++) {
			for (int i_187_ = 0; i_187_ <= i_184_; i_187_++)
			    bools[i_186_][i_187_]
				= (i_185_ < i
				   || class215.method4332(i, i_185_,
							  i_186_ + i_180_,
							  i_187_ + i_181_,
							  1945211075));
		    }
		    class552.aClass166Array7179[i_185_].method3548
			(i_171_, i_172_, 1024, i_180_, i_181_, i_182_, i_183_,
			 bools);
		    for (int i_188_ = -4; i_188_ < i_162_; i_188_++) {
			for (int i_189_ = -4; i_189_ < i_162_; i_189_++) {
			    int i_190_ = i_188_ + i_176_;
			    int i_191_ = i_189_ + i_177_;
			    if (i_190_ >= i_163_ && i_191_ >= i_164_
				&& (i_185_ < i
				    || class215.method4332(i, i_185_, i_190_,
							   i_191_,
							   1991078058))) {
				int i_192_ = i_185_;
				if (class215.method4331(i_190_, i_191_,
							-1577522342))
				    i_192_--;
				if (i_192_ >= 0)
				    Class583.method12825
					(class103, i_192_, i_190_, i_191_,
					 i_178_ + 4 * i_188_,
					 i_179_ + (i_162_ - i_189_) * 4 - 4,
					 i_173_, i_174_, -691169956);
			    }
			}
		    }
		}
		class103.method2396(i_178_, i_179_, 4 * i_162_, i_162_ * 4,
				    i_175_, 2);
		class103.method2291();
		if (!aBool2301) {
		    Class65.aClass168_1046.method3675
			(48 + (i_176_ - i_163_) * 4,
			 48 + i_158_ * 4 - 4 * (i_177_ - i_164_) - 4 * i_162_,
			 i_162_ * 4, 4 * i_162_, i_178_, i_179_);
		    if (aBool2300) {
			Class65.aClass168_1046.method3646(256, 0);
			try {
			    class103.method2217((byte) 55);
			    Class380_Sub2.method16722(2000L);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
	    }
	}
	if (aBool2301) {
	    class103.method2245(class105_sub2, -520502582);
	    if (aBool2300) {
		Class65.aClass168_1046.method3646(256, 0);
		try {
		    class103.method2217((byte) 97);
		    Class380_Sub2.method16722(2000L);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class103.method2572();
	class103.method2450(1, 1);
	Class69.method1683((byte) 14);
	anInt2303 = 0;
	aClass429_2307.method7652((byte) 4);
	if (!aBool2310) {
	    Class558.method12326(i, 730940890);
	    Class564 class564 = client.aClass238_8477.method4860(1806333349);
	    if (null != class564) {
		Class441.aClass524_6158.method11737(1024, 64, 2131649029);
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		for (int i_193_ = 0; i_193_ < class564.anInt7308 * 81284827;
		     i_193_++) {
		    int i_194_ = class564.anIntArray7306[i_193_];
		    if (Class21.myPlayer.nodePlane
			== i_194_ >> 28) {
			int i_195_ = ((i_194_ >> 14 & 0x3fff)
				      - 127679513 * class522.baseX);
			int i_196_ = ((i_194_ & 0x3fff)
				      - 468558693 * class522.baseY);
			if (i_195_ >= 0 && i_195_ < i_157_ && i_196_ >= 0
			    && i_196_ < i_158_)
			    aClass429_2307.addNode
				(new IntegerNode(i_193_), (short) -1897);
			else {
			    Class515 class515
				= (Class441.aClass524_6158.method11745
				   (class564.anIntArray7307[i_193_],
				    647213442));
			    if (class515.anIntArray6737 != null
				&& (class515.anInt6759 * 1389678465 + i_195_
				    >= 0)
				&& (-1967356869 * class515.anInt6757 + i_195_
				    < i_157_)
				&& (i_196_ + class515.anInt6747 * -1423735679
				    >= 0)
				&& (i_196_ + class515.anInt6742 * -1576680733
				    < i_158_))
				aClass429_2307.addNode
				    (new IntegerNode(i_193_),
				     (short) -5272);
			}
		    }
		}
		Class441.aClass524_6158.method11737(128, 64, 2131649029);
	    }
	}
	return true;
    }
    
    static void method3973(Class103 class103, int i, int i_197_,
			   InterfaceComponent class58, Class135 class135, int i_198_,
			   int i_199_) {
	for (int i_200_ = 0; i_200_ < client.localNpcCount * -1837469873;
	     i_200_++) {
	    ObjectNode class241_sub26
		= ((ObjectNode)
		   client.aClass407_8457
		       .get((long) client.localNpcIndicies[i_200_]));
	    if (null != class241_sub26) {
		NPC class475_sub1_sub1_sub3_sub2
		    = ((NPC)
		       class241_sub26.objectValue);
		if (class475_sub1_sub1_sub3_sub2.method17992((byte) 26)
		    && (Class21.myPlayer.nodePlane
			== class475_sub1_sub1_sub3_sub2.nodePlane)) {
		    NPCDefinition class401
			= class475_sub1_sub1_sub3_sub2.definition;
		    if (class401 != null && class401.transformTo != null)
			class401 = class401.method7176(Class1.aClass19_11,
						       Class1.aClass19_11,
						       (byte) 3);
		    if (class401 != null && class401.visibleOnMap
			&& class401.aBool5839) {
			Class287 class287
			    = (class475_sub1_sub1_sub3_sub2.method10874()
			       .aClass287_4386);
			int i_201_ = (int) class287.aFloat4477 / 128 - i / 128;
			int i_202_
			    = (int) class287.aFloat4479 / 128 - i_197_ / 128;
			if (-1 != -290022879 * class401.anInt5837)
			    Class106.method2674(class103, class135, class58,
						i_198_, i_199_, i_201_, i_202_,
						(class401.anInt5837
						 * -290022879),
						(byte) 61);
			else
			    Class1.method452(class58, class135, i_198_, i_199_,
					     i_201_, i_202_,
					     HitMarkTypeList.aClass168Array7251[1],
					     550757160);
		    }
		}
	    }
	}
    }
    
    static void method3974(Class103 class103) {
	if ((Class21.myPlayer.nodePlane
	     != anInt2299 * -1342949133)
	    && client.aClass238_8477.method4751(-1560123042) != null) {
	    Class50.method1249((byte) 1);
	    if (Class241_Sub41.method16449(class103,
					   (Class21
					    .myPlayer
					    .nodePlane),
					   (byte) -57))
		anInt2299
		    = (472227899
		       * Class21.myPlayer.nodePlane);
	}
    }
    
    static void method3975(Class103 class103, int i, int i_203_,
			   InterfaceComponent class58, Class135 class135, int i_204_,
			   int i_205_) {
	for (int i_206_ = 0; i_206_ < client.localNpcCount * -1837469873;
	     i_206_++) {
	    ObjectNode class241_sub26
		= ((ObjectNode)
		   client.aClass407_8457
		       .get((long) client.localNpcIndicies[i_206_]));
	    if (null != class241_sub26) {
		NPC class475_sub1_sub1_sub3_sub2
		    = ((NPC)
		       class241_sub26.objectValue);
		if (class475_sub1_sub1_sub3_sub2.method17992((byte) 38)
		    && (Class21.myPlayer.nodePlane
			== class475_sub1_sub1_sub3_sub2.nodePlane)) {
		    NPCDefinition class401
			= class475_sub1_sub1_sub3_sub2.definition;
		    if (class401 != null && class401.transformTo != null)
			class401 = class401.method7176(Class1.aClass19_11,
						       Class1.aClass19_11,
						       (byte) 110);
		    if (class401 != null && class401.visibleOnMap
			&& class401.aBool5839) {
			Class287 class287
			    = (class475_sub1_sub1_sub3_sub2.method10874()
			       .aClass287_4386);
			int i_207_ = (int) class287.aFloat4477 / 128 - i / 128;
			int i_208_
			    = (int) class287.aFloat4479 / 128 - i_203_ / 128;
			if (-1 != -290022879 * class401.anInt5837)
			    Class106.method2674(class103, class135, class58,
						i_204_, i_205_, i_207_, i_208_,
						(class401.anInt5837
						 * -290022879),
						(byte) 32);
			else
			    Class1.method452(class58, class135, i_204_, i_205_,
					     i_207_, i_208_,
					     HitMarkTypeList.aClass168Array7251[1],
					     -80449317);
		    }
		}
	    }
	}
    }
    
    static void method3976(InterfaceComponent class58, Class135 class135, int i,
			   int i_209_, int i_210_, int i_211_, int i_212_,
			   String string, Class96 class96, Class639 class639,
			   int i_213_) {
	int i_214_;
	if (4 == 115241065 * Class296.anInt4513)
	    i_214_ = ((int) ((double) Class445_Sub16.aClass351_Sub1_8660
					  .method6292((byte) 63)
			     * 2607.5945876176133)
		      + client.anInt8513 * 390680985) & 0x3fff;
	else if (5 == 115241065 * Class296.anInt4513)
	    i_214_ = (int) client.aFloat8581 & 0x3fff;
	else
	    i_214_ = (client.anInt8513 * 390680985 + (int) client.aFloat8581
		      & 0x3fff);
	int i_215_ = (Math.max(class58.anInt850 * 439139681 / 2,
			       class58.scrollMinY * 1463495207 / 2)
		      + 10);
	int i_216_ = i_210_ * i_210_ + i_211_ * i_211_;
	if (i_216_ <= i_215_ * i_215_) {
	    int i_217_ = Class282.anIntArray4430[i_214_];
	    int i_218_ = Class282.anIntArray4441[i_214_];
	    if (Class296.anInt4513 * 115241065 != 5) {
		i_217_ = 256 * i_217_ / (1747300637 * client.anInt8377 + 256);
		i_218_ = 256 * i_218_ / (256 + client.anInt8377 * 1747300637);
	    }
	    int i_219_ = i_211_ * i_217_ + i_218_ * i_210_ >> 14;
	    int i_220_ = i_211_ * i_218_ - i_217_ * i_210_ >> 14;
	    int i_221_ = class639.method13567(string, 100, null, -1291633673);
	    int i_222_
		= class639.method13596(string, 100, 0, null, -1034564232);
	    i_219_ -= i_221_ / 2;
	    if (i_219_ >= -(439139681 * class58.anInt850)
		&& i_219_ <= 439139681 * class58.anInt850
		&& i_220_ >= -(1463495207 * class58.scrollMinY)
		&& i_220_ <= class58.scrollMinY * 1463495207)
		class96.method2114(string,
				   (class58.anInt850 * 439139681 / 2
				    + (i + i_219_)),
				   (class58.scrollMinY * 1463495207 / 2 + i_209_
				    - i_220_ - i_212_ - i_222_),
				   i_221_, 50, i_213_, 0, 1, 0, 0, null, null,
				   class135, i, i_209_, 1500431595);
	}
    }
    
    static void method3977(int i) {
	anInt2303 = 0;
	int i_223_ = client.aClass238_8477.method4744(-1886625247);
	int i_224_ = client.aClass238_8477.method4745(-1395548588);
	Class215 class215 = client.aClass238_8477.method4753((byte) -74);
	Class552 class552 = client.aClass238_8477.method4751(-745484603);
	ObjectDefinitionLoader class532 = client.aClass238_8477.getObjectLoader(-2144543784);
	int i_225_ = i;
	if (null != Class21.myPlayer) {
	    int i_226_
		= (Class21.myPlayer.scenePositionXQueue[0]
		   >> 3);
	    int i_227_
		= (Class21.myPlayer.scenePositionYQueue[0]
		   >> 3);
	    if (i_226_ >= 0 && i_226_ < Class458.aBoolArrayArray6260.length
		&& i_227_ >= 0
		&& i_227_ < Class458.aBoolArrayArray6260[i_226_].length
		&& Class458.aBoolArrayArray6260[i_226_][i_227_])
		i_225_ = 0;
	}
	for (int i_228_ = 0; i_228_ < i_223_; i_228_++) {
	    for (int i_229_ = 0; i_229_ < i_224_; i_229_++) {
		for (int i_230_ = i_225_; i_230_ <= 1 + i && i_230_ <= 3;
		     i_230_++) {
		    if ((i_230_ < i || class215.method4332(i, i_230_, i_228_,
							   i_229_, 2041701206))
			&& !(Class112.method2780
			     (((Interface24)
			       class552.method12100(i_230_, i_228_, i_229_,
						    1975630889)),
			      class532, i_228_, i_229_, 1566439862))
			&& !(Class112.method2780
			     (((Interface24)
			       class552.method12136(i_230_, i_228_, i_229_,
						    client.anInterface57_8577,
						    -522340238)),
			      class532, i_228_, i_229_, 1996365937))
			&& !(Class112.method2780
			     (((Interface24)
			       class552.method12132(i_230_, i_228_, i_229_,
						    (byte) 7)),
			      class532, i_228_, i_229_, 1806256661))
			&& !(Class112.method2780
			     (((Interface24)
			       class552.method12162(i_230_, i_228_, i_229_,
						    948818161)),
			      class532, i_228_, i_229_, 1165697053))) {
			/* empty */
		    }
		}
	    }
	}
    }
    
    static void method3978(int i, int i_231_, InterfaceComponent class58,
			   Class135 class135, int i_232_, int i_233_) {
	int i_234_ = GPI.viewportPlayerCount * 794073197;
	int[] is = GPI.viewportPlayerIndicies;
	for (int i_235_ = 0; i_235_ < i_234_; i_235_++) {
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[is[i_235_]];
	    if (class475_sub1_sub1_sub3_sub1 != null
		&& class475_sub1_sub1_sub3_sub1.method17963(575138183)
		&& !class475_sub1_sub1_sub3_sub1.hidden
		&& (class475_sub1_sub1_sub3_sub1
		    != Class21.myPlayer)
		&& (class475_sub1_sub1_sub3_sub1.nodePlane
		    == Class21.myPlayer.nodePlane)) {
		Class287 class287 = (class475_sub1_sub1_sub3_sub1.method10874()
				     .aClass287_4386);
		int i_236_ = (int) class287.aFloat4477 / 128 - i / 128;
		int i_237_ = (int) class287.aFloat4479 / 128 - i_231_ / 128;
		boolean bool = false;
		for (int i_238_ = 0; i_238_ < 1557840217 * client.friendListSize;
		     i_238_++) {
		    Friend class18 = client.friendList[i_238_];
		    if (class475_sub1_sub1_sub3_sub1.nameUnfiltered
			    .equals(class18.currentName)
			&& 1337402161 * class18.serverNodeID != 0) {
			bool = true;
			break;
		    }
		}
		boolean bool_239_ = false;
		for (int i_240_ = 0;
		     i_240_ < -612332369 * Class357_Sub1.currentFcSize;
		     i_240_++) {
		    if (class475_sub1_sub1_sub3_sub1.nameUnfiltered.equals
			(Class350.currentFcUsers[i_240_].replyToName)) {
			bool_239_ = true;
			break;
		    }
		}
		boolean bool_241_ = false;
		if (-786517937 * (Class21.myPlayer
				  .anInt11495) != 0
		    && 0 != (class475_sub1_sub1_sub3_sub1.anInt11495
			     * -786517937)
		    && (class475_sub1_sub1_sub3_sub1.anInt11495 * -786517937
			== (Class21.myPlayer
			    .anInt11495) * -786517937))
		    bool_241_ = true;
		if ((class475_sub1_sub1_sub3_sub1.aClass490_11499.anInt6508
		     * -614581637) != -1
		    && (MasterIndex.npcDefLoader.getNpcDefinition
			((class475_sub1_sub1_sub3_sub1.aClass490_11499
			  .anInt6508) * -614581637,
			 -1492848591)
			.aBool5871))
		    Class1.method452(class58, class135, i_232_, i_233_, i_236_,
				     i_237_, HitMarkTypeList.aClass168Array7251[1],
				     566663715);
		else if (class475_sub1_sub1_sub3_sub1.aBool11496)
		    Class1.method452(class58, class135, i_232_, i_233_, i_236_,
				     i_237_, HitMarkTypeList.aClass168Array7251[6],
				     2135906939);
		else if (bool_241_)
		    Class1.method452(class58, class135, i_232_, i_233_, i_236_,
				     i_237_, HitMarkTypeList.aClass168Array7251[4],
				     1378145911);
		else if (class475_sub1_sub1_sub3_sub1.aBool11494)
		    Class1.method452(class58, class135, i_232_, i_233_, i_236_,
				     i_237_, HitMarkTypeList.aClass168Array7251[7],
				     658877930);
		else if (bool)
		    Class1.method452(class58, class135, i_232_, i_233_, i_236_,
				     i_237_, HitMarkTypeList.aClass168Array7251[3],
				     1892703959);
		else if (bool_239_)
		    Class1.method452(class58, class135, i_232_, i_233_, i_236_,
				     i_237_, HitMarkTypeList.aClass168Array7251[5],
				     2069825685);
		else
		    Class1.method452(class58, class135, i_232_, i_233_, i_236_,
				     i_237_, HitMarkTypeList.aClass168Array7251[2],
				     -402765456);
	    }
	}
    }
    
    static void method3979(int i, int i_242_, InterfaceComponent class58,
			   Class135 class135, int i_243_, int i_244_) {
	int i_245_ = GPI.viewportPlayerCount * 794073197;
	int[] is = GPI.viewportPlayerIndicies;
	for (int i_246_ = 0; i_246_ < i_245_; i_246_++) {
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[is[i_246_]];
	    if (class475_sub1_sub1_sub3_sub1 != null
		&& class475_sub1_sub1_sub3_sub1.method17963(-113557886)
		&& !class475_sub1_sub1_sub3_sub1.hidden
		&& (class475_sub1_sub1_sub3_sub1
		    != Class21.myPlayer)
		&& (class475_sub1_sub1_sub3_sub1.nodePlane
		    == Class21.myPlayer.nodePlane)) {
		Class287 class287 = (class475_sub1_sub1_sub3_sub1.method10874()
				     .aClass287_4386);
		int i_247_ = (int) class287.aFloat4477 / 128 - i / 128;
		int i_248_ = (int) class287.aFloat4479 / 128 - i_242_ / 128;
		boolean bool = false;
		for (int i_249_ = 0; i_249_ < 1557840217 * client.friendListSize;
		     i_249_++) {
		    Friend class18 = client.friendList[i_249_];
		    if (class475_sub1_sub1_sub3_sub1.nameUnfiltered
			    .equals(class18.currentName)
			&& 1337402161 * class18.serverNodeID != 0) {
			bool = true;
			break;
		    }
		}
		boolean bool_250_ = false;
		for (int i_251_ = 0;
		     i_251_ < -612332369 * Class357_Sub1.currentFcSize;
		     i_251_++) {
		    if (class475_sub1_sub1_sub3_sub1.nameUnfiltered.equals
			(Class350.currentFcUsers[i_251_].replyToName)) {
			bool_250_ = true;
			break;
		    }
		}
		boolean bool_252_ = false;
		if (-786517937 * (Class21.myPlayer
				  .anInt11495) != 0
		    && 0 != (class475_sub1_sub1_sub3_sub1.anInt11495
			     * -786517937)
		    && (class475_sub1_sub1_sub3_sub1.anInt11495 * -786517937
			== (Class21.myPlayer
			    .anInt11495) * -786517937))
		    bool_252_ = true;
		if ((class475_sub1_sub1_sub3_sub1.aClass490_11499.anInt6508
		     * -614581637) != -1
		    && (MasterIndex.npcDefLoader.getNpcDefinition
			((class475_sub1_sub1_sub3_sub1.aClass490_11499
			  .anInt6508) * -614581637,
			 -1914823794)
			.aBool5871))
		    Class1.method452(class58, class135, i_243_, i_244_, i_247_,
				     i_248_, HitMarkTypeList.aClass168Array7251[1],
				     -21049621);
		else if (class475_sub1_sub1_sub3_sub1.aBool11496)
		    Class1.method452(class58, class135, i_243_, i_244_, i_247_,
				     i_248_, HitMarkTypeList.aClass168Array7251[6],
				     1760925135);
		else if (bool_252_)
		    Class1.method452(class58, class135, i_243_, i_244_, i_247_,
				     i_248_, HitMarkTypeList.aClass168Array7251[4],
				     405992158);
		else if (class475_sub1_sub1_sub3_sub1.aBool11494)
		    Class1.method452(class58, class135, i_243_, i_244_, i_247_,
				     i_248_, HitMarkTypeList.aClass168Array7251[7],
				     1003045281);
		else if (bool)
		    Class1.method452(class58, class135, i_243_, i_244_, i_247_,
				     i_248_, HitMarkTypeList.aClass168Array7251[3],
				     -549617733);
		else if (bool_250_)
		    Class1.method452(class58, class135, i_243_, i_244_, i_247_,
				     i_248_, HitMarkTypeList.aClass168Array7251[5],
				     126726565);
		else
		    Class1.method452(class58, class135, i_243_, i_244_, i_247_,
				     i_248_, HitMarkTypeList.aClass168Array7251[2],
				     1044848038);
	    }
	}
    }
    
    static void method3980(int i, int i_253_, InterfaceComponent class58,
			   Class118 class118, int i_254_, int i_255_) {
	Class192[] class192s = client.aClass192Array8301;
	for (int i_256_ = 0; i_256_ < class192s.length; i_256_++) {
	    Class192 class192 = class192s[i_256_];
	    if (class192 != null && 0 != -1685117145 * class192.anInt2288
		&& client.anInt8296 % 20 < 10) {
		if (1 == -1685117145 * class192.anInt2288) {
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   (client.aClass407_8457.get
			    ((long) (810214515 * class192.anInt2287))));
		    if (null != class241_sub26) {
			NPC class475_sub1_sub1_sub3_sub2
			    = ((NPC)
			       class241_sub26.objectValue);
			Class287 class287
			    = (class475_sub1_sub1_sub3_sub2.method10874()
			       .aClass287_4386);
			int i_257_ = (int) class287.aFloat4477 / 128 - i / 128;
			int i_258_
			    = (int) class287.aFloat4479 / 128 - i_253_ / 128;
			Class120_Sub21.method16850(class58, class118, i_254_,
						   i_255_, i_257_, i_258_,
						   (((Class192) class192)
						    .anInt2285) * 1521214931,
						   360000L);
		    }
		}
		if (2 == class192.anInt2288 * -1685117145) {
		    int i_259_
			= 1718000347 * class192.anInt2289 / 128 - i / 128;
		    int i_260_ = (-1357301451 * class192.anInt2290 / 128
				  - i_253_ / 128);
		    long l = (long) (1020811893 * class192.anInt2293 << 7);
		    l *= l;
		    Class120_Sub21.method16850(class58, class118, i_254_,
					       i_255_, i_259_, i_260_,
					       (((Class192) class192).anInt2285
						* 1521214931),
					       l);
		}
		if (class192.anInt2288 * -1685117145 == 10
		    && 810214515 * class192.anInt2287 >= 0
		    && (class192.anInt2287 * 810214515
			< (client
			   .localPlayers).length)) {
		    Player class475_sub1_sub1_sub3_sub1
			= (client.localPlayers
			   [810214515 * class192.anInt2287]);
		    if (class475_sub1_sub1_sub3_sub1 != null) {
			Class287 class287
			    = (class475_sub1_sub1_sub3_sub1.method10874()
			       .aClass287_4386);
			int i_261_ = (int) class287.aFloat4477 / 128 - i / 128;
			int i_262_
			    = (int) class287.aFloat4479 / 128 - i_253_ / 128;
			Class120_Sub21.method16850(class58, class118, i_254_,
						   i_255_, i_261_, i_262_,
						   (1521214931
						    * (((Class192) class192)
						       .anInt2285)),
						   360000L);
		    }
		}
	    }
	}
    }
    
    static void method3981(Class103 class103, InterfaceComponent class58, int i,
			   int i_263_) {
	if (null != Class21.myPlayer) {
	    class103.method2291();
	    Class118 class118 = null;
	    Class135 class135 = null;
	    if (5 == class58.componentType * -1579470857) {
		class118 = class58.method1518(class103, 1124416835);
		if (class118 == null)
		    return;
		class135 = class118.aClass135_1559;
		if ((1403518843 * class118.anInt1560
		     != 439139681 * class58.anInt850)
		    || (574765281 * class118.anInt1556
			!= 1463495207 * class58.scrollMinY))
		    throw new IllegalStateException("");
	    }
	    class103.method2445(i, i_263_, i + 439139681 * class58.anInt850,
				i_263_ + 1463495207 * class58.scrollMinY);
	    if (2 != 630280401 * anInt2311 && 630280401 * anInt2311 != 5
		&& Class65.aClass168_1046 != null) {
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		int i_264_;
		int i_265_;
		int i_266_;
		int i_267_;
		if (5 == 115241065 * Class296.anInt4513) {
		    i_264_ = 1750875065 * client.anInt8557;
		    i_265_ = -1494721987 * client.anInt8361;
		    i_266_ = (int) -client.aFloat8581 & 0x3fff;
		    i_267_ = 4096;
		} else {
		    Class287 class287 = Class21.myPlayer.method10874().aClass287_4386;
		    i_264_ = (int) class287.aFloat4477;
		    i_265_ = (int) class287.aFloat4479;
		    if (115241065 * Class296.anInt4513 == 4) {
				i_266_ = ((int) -((double) Class445_Sub16
						       .aClass351_Sub1_8660
						       .method6292((byte) 43)
					  * 2607.5945876176133)
				  + 390680985 * client.anInt8513) & 0x3fff;
			} else {
				i_266_ = (390680985 * client.anInt8513
					+ (int) -client.aFloat8581) & 0x3fff;
			}
		    i_267_ = 4096 - client.anInt8377 * -2107960880;
		}
		int i_268_ = 48 + i_264_ / 128;
		int i_269_
		    = (48 + client.aClass238_8477.method4745(259184780) * 4
		       - i_265_ / 128);
		if (class135 != null)
		    Class65.aClass168_1046.method3625
			(((float) (class58.anInt850 * 439139681) / 2.0F
			  + (float) i),
			 ((float) (class58.scrollMinY * 1463495207) / 2.0F
			  + (float) i_263_),
			 (float) i_268_, (float) i_269_, i_267_, i_266_ << 2,
			 class135, i, i_263_);
		else
		    Class65.aClass168_1046.method3623
			(((float) (class58.anInt850 * 439139681) / 2.0F
			  + (float) i),
			 ((float) (1463495207 * class58.scrollMinY) / 2.0F
			  + (float) i_263_),
			 (float) i_268_, (float) i_269_, i_267_, i_266_ << 2,
			 1, -1, 1);
		Class564 class564
		    = client.aClass238_8477.method4860(-393021981);
		for (IntegerNode class241_sub22
			 = ((IntegerNode)
			    aClass429_2307.method7694(16711935));
		     null != class241_sub22;
		     class241_sub22 = ((IntegerNode)
				       aClass429_2307.method7692(941140472))) {
		    int i_270_ = -1859754807 * class241_sub22.intValue;
		    int i_271_
			= ((class564.anIntArray7306[i_270_] >> 14 & 0x3fff)
			   - class522.baseX * 127679513);
		    int i_272_ = ((class564.anIntArray7306[i_270_] & 0x3fff)
				  - class522.baseY * 468558693);
		    int i_273_ = 2 + 4 * i_271_ - i_264_ / 128;
		    int i_274_ = 4 * i_272_ + 2 - i_265_ / 128;
		    Class106.method2674(class103, class135, class58, i, i_263_,
					i_273_, i_274_,
					class564.anIntArray7307[i_270_],
					(byte) 104);
		}
		for (int i_275_ = 0; i_275_ < anInt2303 * -1037886889;
		     i_275_++) {
		    int i_276_ = 4 * anIntArray2304[i_275_] + 2 - i_264_ / 128;
		    int i_277_ = 2 + 4 * anIntArray2313[i_275_] - i_265_ / 128;
		    ObjectDefinition objDef = client.aClass238_8477
					.getObjectLoader(-1906106390).getObjectDefinition(anIntArray2306[i_275_], 577892407);
		    if (objDef.toObjectIDs != null) {
				objDef = objDef.method11768(Class1.aClass19_11, Class1.aClass19_11, -1220985888);
				if (null == objDef || 8166631 * objDef.mapSpriteID == -1) {
					continue;
				}
		    }
		    Class106.method2674(class103, class135, class58, i, i_263_,
					i_276_, i_277_,
					8166631 * objDef.mapSpriteID,
					(byte) 105);
		}
		for (WorldTile class241_sub44
			 = ((WorldTile)
			    client.aClass407_8452.method7294(2090894173));
		     class241_sub44 != null;
		     class241_sub44
			 = ((WorldTile)
			    client.aClass407_8452.method7295(633678104))) {
		    int i_278_ = (int) ((class241_sub44.hashCode
					 * 4356572401218184725L) >> 28
					& 0x3L);
		    if (anInt2299 * -1342949133 == i_278_) {
			int i_279_ = ((int) ((4356572401218184725L
					      * class241_sub44.hashCode)
					     & 0x3fffL)
				      - 127679513 * class522.baseX);
			int i_280_ = ((int) ((class241_sub44.hashCode
					      * 4356572401218184725L) >> 14
					     & 0x3fffL)
				      - class522.baseY * 468558693);
			int i_281_ = i_279_ * 4 + 2 - i_264_ / 128;
			int i_282_ = 4 * i_280_ + 2 - i_265_ / 128;
			Class1.method452(class58, class135, i, i_263_, i_281_,
					 i_282_,
					 HitMarkTypeList.aClass168Array7251[0],
					 535421105);
		    }
		}
		Class96_Sub1.method15364(class103, i_264_, i_265_, class58,
					 class135, i, i_263_, (byte) 28);
		Class12.method601(i_264_, i_265_, class58, class135, i, i_263_,
				  -1680393658);
		Class371.method6631(i_264_, i_265_, class58, class118, i,
				    i_263_, (byte) 0);
		if (5 != 115241065 * Class296.anInt4513) {
		    if (1813149433 * minimapFlagX != -1) {
			int i_283_
			    = (2 + -1337336860 * minimapFlagX - i_264_ / 128
			       + (Class21.myPlayer
				      .method17782(2063373944)
				  - 1) * 2);
			int i_284_
			    = (minimapFlagY * -758443068 + 2 - i_265_ / 128
			       + (Class21.myPlayer
				      .method17782(1843924931)
				  - 1) * 2);
			Class1.method452(class58, class135, i, i_263_, i_283_,
					 i_284_,
					 (Class360.aClass168Array5502
					  [aBool2302 ? 1 : 0]),
					 1587352003);
		    }
		    if (!Class21.myPlayer.hidden)
			class103.method2263((class58.anInt850 * 439139681 / 2
					     + i - 1),
					    i_263_ + (class58.scrollMinY
						      * 1463495207 / 2) - 1,
					    3, 3, -1, (byte) -35);
		}
	    } else if (null != class135)
		class103.method2495(-16777216, class135, i, i_263_);
	}
    }
    
    static void method3982(int i, int i_285_, InterfaceComponent class58,
			   Class118 class118, int i_286_, int i_287_) {
	Class192[] class192s = client.aClass192Array8301;
	for (int i_288_ = 0; i_288_ < class192s.length; i_288_++) {
	    Class192 class192 = class192s[i_288_];
	    if (class192 != null && 0 != -1685117145 * class192.anInt2288
		&& client.anInt8296 % 20 < 10) {
		if (1 == -1685117145 * class192.anInt2288) {
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   (client.aClass407_8457.get
			    ((long) (810214515 * class192.anInt2287))));
		    if (null != class241_sub26) {
			NPC class475_sub1_sub1_sub3_sub2
			    = ((NPC)
			       class241_sub26.objectValue);
			Class287 class287
			    = (class475_sub1_sub1_sub3_sub2.method10874()
			       .aClass287_4386);
			int i_289_ = (int) class287.aFloat4477 / 128 - i / 128;
			int i_290_
			    = (int) class287.aFloat4479 / 128 - i_285_ / 128;
			Class120_Sub21.method16850(class58, class118, i_286_,
						   i_287_, i_289_, i_290_,
						   (((Class192) class192)
						    .anInt2285) * 1521214931,
						   360000L);
		    }
		}
		if (2 == class192.anInt2288 * -1685117145) {
		    int i_291_
			= 1718000347 * class192.anInt2289 / 128 - i / 128;
		    int i_292_ = (-1357301451 * class192.anInt2290 / 128
				  - i_285_ / 128);
		    long l = (long) (1020811893 * class192.anInt2293 << 7);
		    l *= l;
		    Class120_Sub21.method16850(class58, class118, i_286_,
					       i_287_, i_291_, i_292_,
					       (((Class192) class192).anInt2285
						* 1521214931),
					       l);
		}
		if (class192.anInt2288 * -1685117145 == 10
		    && 810214515 * class192.anInt2287 >= 0
		    && (class192.anInt2287 * 810214515
			< (client
			   .localPlayers).length)) {
		    Player class475_sub1_sub1_sub3_sub1
			= (client.localPlayers
			   [810214515 * class192.anInt2287]);
		    if (class475_sub1_sub1_sub3_sub1 != null) {
			Class287 class287
			    = (class475_sub1_sub1_sub3_sub1.method10874()
			       .aClass287_4386);
			int i_293_ = (int) class287.aFloat4477 / 128 - i / 128;
			int i_294_
			    = (int) class287.aFloat4479 / 128 - i_285_ / 128;
			Class120_Sub21.method16850(class58, class118, i_286_,
						   i_287_, i_293_, i_294_,
						   (1521214931
						    * (((Class192) class192)
						       .anInt2285)),
						   360000L);
		    }
		}
	    }
	}
    }
    
    static void method3983(int i, int i_295_, boolean bool) {
	Class458.aBoolArrayArray6260[i][i_295_] = bool;
    }
    
    static void method3984(Class103 class103, Class135 class135,
			   InterfaceComponent class58, int i, int i_296_, int i_297_,
			   int i_298_, int i_299_) {
	Class515 class515
	    = Class441.aClass524_6158.method11745(i_299_, 406854674);
	if (class515 != null && class515.aBool6744
	    && class515.method11587(Class1.aClass19_11, Class1.aClass19_11,
				    -1966914260)) {
	    if (null != class515.anIntArray6737) {
		int[] is = new int[class515.anIntArray6737.length];
		for (int i_300_ = 0; i_300_ < is.length / 2; i_300_++) {
		    int i_301_;
		    if (4 == 115241065 * Class296.anInt4513)
			i_301_ = ((int) ((double) Class445_Sub16
						      .aClass351_Sub1_8660
						      .method6292((byte) 17)
					 * 2607.5945876176133)
				  + client.anInt8513 * 390680985) & 0x3fff;
		    else if (115241065 * Class296.anInt4513 == 5)
			i_301_ = (int) client.aFloat8581 & 0x3fff;
		    else
			i_301_ = ((int) client.aFloat8581
				  + client.anInt8513 * 390680985) & 0x3fff;
		    int i_302_ = Class282.anIntArray4430[i_301_];
		    int i_303_ = Class282.anIntArray4441[i_301_];
		    if (Class296.anInt4513 * 115241065 != 5) {
			i_302_
			    = i_302_ * 256 / (256
					      + client.anInt8377 * 1747300637);
			i_303_ = i_303_ * 256 / (1747300637 * client.anInt8377
						 + 256);
		    }
		    is[i_300_ * 2]
			= ((((i_297_ + class515.anIntArray6737[2 * i_300_] * 4)
			     * i_303_)
			    + (i_302_
			       * (4 * class515.anIntArray6737[1 + 2 * i_300_]
				  + i_298_)))
			   >> 14) + (class58.anInt850 * 439139681 / 2 + i);
		    is[2 * i_300_ + 1]
			= (i_296_ + 1463495207 * class58.scrollMinY / 2
			   - ((i_303_ * (i_298_ + (class515.anIntArray6737
						   [2 * i_300_ + 1]) * 4)
			       - (i_302_
				  * (4 * class515.anIntArray6737[i_300_ * 2]
				     + i_297_)))
			      >> 14));
		}
		Class118 class118 = class58.method1518(class103, 1024568331);
		if (null != class118)
		    Class99.method2177(class103, is,
				       1002290129 * class515.anInt6761,
				       class118.anIntArray1555,
				       class118.anIntArray1557);
		if (1183606681 * class515.anInt6762 > 0) {
		    for (int i_304_ = 0; i_304_ < is.length / 2 - 1;
			 i_304_++) {
			int i_305_ = is[i_304_ * 2];
			int i_306_ = is[1 + 2 * i_304_];
			int i_307_ = is[2 * (i_304_ + 1)];
			int i_308_ = is[1 + 2 * (1 + i_304_)];
			if (i_307_ < i_305_) {
			    int i_309_ = i_305_;
			    int i_310_ = i_306_;
			    i_305_ = i_307_;
			    i_306_ = i_308_;
			    i_307_ = i_309_;
			    i_308_ = i_310_;
			} else if (i_307_ == i_305_ && i_308_ < i_306_) {
			    int i_311_ = i_306_;
			    i_306_ = i_308_;
			    i_308_ = i_311_;
			}
			if (class135 != null)
			    class103.method2297
				(i_305_, i_306_, i_307_, i_308_,
				 (class515.anIntArray6758
				  [class515.aByteArray6768[i_304_] & 0xff]),
				 1, class135, i, i_296_,
				 1183606681 * class515.anInt6762,
				 2024392745 * class515.anInt6763,
				 -1103664939 * class515.anInt6764);
			else
			    class103.method2276
				(i_305_, i_306_, i_307_, i_308_,
				 (class515.anIntArray6758
				  [class515.aByteArray6768[i_304_] & 0xff]),
				 1, class515.anInt6762 * 1183606681,
				 class515.anInt6763 * 2024392745,
				 -1103664939 * class515.anInt6764);
		    }
		    int i_312_ = is[is.length - 2];
		    int i_313_ = is[is.length - 1];
		    int i_314_ = is[0];
		    int i_315_ = is[1];
		    if (i_314_ < i_312_) {
			int i_316_ = i_312_;
			int i_317_ = i_313_;
			i_312_ = i_314_;
			i_313_ = i_315_;
			i_314_ = i_316_;
			i_315_ = i_317_;
		    } else if (i_312_ == i_314_ && i_315_ < i_313_) {
			int i_318_ = i_313_;
			i_313_ = i_315_;
			i_315_ = i_318_;
		    }
		    if (null != class135)
			class103.method2297(i_312_, i_313_, i_314_, i_315_,
					    (class515.anIntArray6758
					     [(class515.aByteArray6768
					       [(class515.aByteArray6768.length
						 - 1)]) & 0xff]),
					    1, class135, i, i_296_,
					    class515.anInt6762 * 1183606681,
					    2024392745 * class515.anInt6763,
					    -1103664939 * class515.anInt6764);
		    else
			class103.method2276(i_312_, i_313_, i_314_, i_315_,
					    (class515.anIntArray6758
					     [(class515.aByteArray6768
					       [(class515.aByteArray6768.length
						 - 1)]) & 0xff]),
					    1, class515.anInt6762 * 1183606681,
					    2024392745 * class515.anInt6763,
					    class515.anInt6764 * -1103664939);
		} else if (class135 != null) {
		    for (int i_319_ = 0; i_319_ < is.length / 2 - 1; i_319_++)
			class103.method2380(is[i_319_ * 2], is[2 * i_319_ + 1],
					    is[2 * (1 + i_319_)],
					    is[1 + 2 * (1 + i_319_)],
					    (class515.anIntArray6758
					     [(class515.aByteArray6768[i_319_]
					       & 0xff)]),
					    1, class135, i, i_296_);
		    class103.method2380(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class515.anIntArray6758
					 [(class515.aByteArray6768
					   [(class515.aByteArray6768.length
					     - 1)]) & 0xff]),
					1, class135, i, i_296_);
		} else {
		    for (int i_320_ = 0; i_320_ < is.length / 2 - 1; i_320_++)
			class103.method2274(is[i_320_ * 2], is[1 + i_320_ * 2],
					    is[(1 + i_320_) * 2],
					    is[(1 + i_320_) * 2 + 1],
					    (class515.anIntArray6758
					     [(class515.aByteArray6768[i_320_]
					       & 0xff)]),
					    1);
		    class103.method2274(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class515.anIntArray6758
					 [(class515.aByteArray6768
					   [(class515.aByteArray6768.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class168 class168 = null;
	    if (-1 != class515.anInt6772 * -705700883) {
		class168 = class515.method11579(class103, false, (byte) 2);
		if (null != class168)
		    Class212.method4293(class58, class135, i, i_296_, i_297_,
					i_298_, class168,
					(double) (987031167
						  * (Class128.aClass513_1589
						     .anInt6717)));
	    }
	    if (class515.aString6756 != null) {
		int i_321_ = 0;
		if (class168 != null)
		    i_321_ = class168.method3606();
		Class96 class96 = Class247_Sub2.aClass96_10073;
		Class639 class639 = Class494.aClass639_6519;
		if (1 == class515.anInt6760 * 723243945) {
		    class96 = Class5.aClass96_26;
		    class639 = Class5.aClass639_25;
		}
		if (723243945 * class515.anInt6760 == 2) {
		    class96 = Class81.aClass96_1149;
		    class639 = Class5.aClass639_19;
		}
		Class344.method6174(class58, class135, i, i_296_, i_297_,
				    i_298_, i_321_, class515.aString6756,
				    class96, class639,
				    class515.anInt6750 * 2101573455, (byte) 6);
	    }
	}
    }
    
    static void method3985(InterfaceComponent class58, Class118 class118, int i,
			   int i_322_, int i_323_, int i_324_, int i_325_,
			   long l) {
	int i_326_ = i_323_ * i_323_ + i_324_ * i_324_;
	if ((long) i_326_ <= l) {
	    int i_327_;
	    if (4 == Class296.anInt4513 * 115241065)
		i_327_ = ((int) ((double) Class445_Sub16
					      .aClass351_Sub1_8660
					      .method6292((byte) 102)
				 * 2607.5945876176133)
			  + client.anInt8513 * 390680985) & 0x3fff;
	    else if (115241065 * Class296.anInt4513 == 5)
		i_327_ = (int) client.aFloat8581 & 0x3fff;
	    else
		i_327_
		    = ((int) client.aFloat8581 + 390680985 * client.anInt8513
		       & 0x3fff);
	    int i_328_ = Class282.anIntArray4430[i_327_];
	    int i_329_ = Class282.anIntArray4441[i_327_];
	    if (Class296.anInt4513 * 115241065 != 5) {
		i_328_ = 256 * i_328_ / (1747300637 * client.anInt8377 + 256);
		i_329_ = 256 * i_329_ / (1747300637 * client.anInt8377 + 256);
	    }
	    int i_330_ = i_328_ * i_324_ + i_323_ * i_329_ >> 14;
	    int i_331_ = i_329_ * i_324_ - i_323_ * i_328_ >> 14;
	    Class168 class168 = Class481.aClass168Array6456[i_325_];
	    int i_332_ = class168.method3631();
	    int i_333_ = class168.method3606();
	    int i_334_
		= class58.anInt850 * 439139681 / 2 + i_330_ - i_332_ / 2;
	    int i_335_ = i_334_ + i_332_;
	    int i_336_ = 1463495207 * class58.scrollMinY / 2 + -i_331_ - i_333_;
	    int i_337_ = i_336_ + i_333_;
	    boolean bool;
	    if (null != class118)
		bool = (!class118.method2933(i_334_, i_336_, (byte) 18)
			|| !class118.method2933(i_335_, i_336_, (byte) 29)
			|| !class118.method2933(i_334_, i_337_, (byte) 30)
			|| !class118.method2933(i_335_, i_337_, (byte) -106));
	    else {
		int i_338_ = i_333_;
		int i_339_ = i_332_ / 2;
		bool = (i_336_ <= -i_338_
			|| i_337_ >= 1463495207 * class58.scrollMinY
			|| i_334_ <= -i_339_
			|| i_335_ >= class58.anInt850 * 439139681 + i_339_);
	    }
	    if (bool) {
		double d = Math.atan2((double) i_330_, (double) i_331_);
		double d_340_ = Math.atan2((double) Math.abs(i_330_),
					   (double) Math.abs(i_331_));
		double d_341_
		    = Math.atan2((double) (439139681 * class58.anInt850 / 2),
				 (double) (1463495207 * class58.scrollMinY / 2));
		boolean bool_342_ = false;
		double d_343_ = 0.0;
		int i_344_;
		if (d_340_ < d_341_) {
		    d_343_ = 1.5707963267948966 - d;
		    i_344_ = 1463495207 * class58.scrollMinY / 2;
		} else {
		    d_343_ = d;
		    i_344_ = class58.anInt850 * 439139681 / 2;
		}
		int i_345_ = Math.abs((int) -((double) i_344_
					      * Math.sin(1.5707963267948966)
					      / Math.sin(d_343_)));
		Class5.aClass168Array27[i_325_].method3619
		    (((float) (439139681 * class58.anInt850) / 2.0F + (float) i
		      + 0.0F),
		     ((float) i_322_
		      + (float) (1463495207 * class58.scrollMinY) / 2.0F - 0.0F),
		     (float) Class5.aClass168Array27[i_325_].method64() / 2.0F,
		     (float) i_345_, 4096,
		     (int) (-d / 6.283185307179586 * 65535.0));
	    } else if (class118 != null)
		class168.method3679(i_334_ + i, i_336_ + i_322_,
				    class118.aClass135_1559, i, i_322_);
	    else
		class168.method3646(i + i_334_, i_336_ + i_322_);
	}
    }
    
    static void method3986(InterfaceComponent class58, Class118 class118, int i,
			   int i_346_, int i_347_, int i_348_, int i_349_,
			   long l) {
	int i_350_ = i_347_ * i_347_ + i_348_ * i_348_;
	if ((long) i_350_ <= l) {
	    int i_351_;
	    if (4 == Class296.anInt4513 * 115241065)
		i_351_ = ((int) ((double) Class445_Sub16
					      .aClass351_Sub1_8660
					      .method6292((byte) 28)
				 * 2607.5945876176133)
			  + client.anInt8513 * 390680985) & 0x3fff;
	    else if (115241065 * Class296.anInt4513 == 5)
		i_351_ = (int) client.aFloat8581 & 0x3fff;
	    else
		i_351_
		    = ((int) client.aFloat8581 + 390680985 * client.anInt8513
		       & 0x3fff);
	    int i_352_ = Class282.anIntArray4430[i_351_];
	    int i_353_ = Class282.anIntArray4441[i_351_];
	    if (Class296.anInt4513 * 115241065 != 5) {
		i_352_ = 256 * i_352_ / (1747300637 * client.anInt8377 + 256);
		i_353_ = 256 * i_353_ / (1747300637 * client.anInt8377 + 256);
	    }
	    int i_354_ = i_352_ * i_348_ + i_347_ * i_353_ >> 14;
	    int i_355_ = i_353_ * i_348_ - i_347_ * i_352_ >> 14;
	    Class168 class168 = Class481.aClass168Array6456[i_349_];
	    int i_356_ = class168.method3631();
	    int i_357_ = class168.method3606();
	    int i_358_
		= class58.anInt850 * 439139681 / 2 + i_354_ - i_356_ / 2;
	    int i_359_ = i_358_ + i_356_;
	    int i_360_ = 1463495207 * class58.scrollMinY / 2 + -i_355_ - i_357_;
	    int i_361_ = i_360_ + i_357_;
	    boolean bool;
	    if (null != class118)
		bool = (!class118.method2933(i_358_, i_360_, (byte) -71)
			|| !class118.method2933(i_359_, i_360_, (byte) -16)
			|| !class118.method2933(i_358_, i_361_, (byte) 0)
			|| !class118.method2933(i_359_, i_361_, (byte) -117));
	    else {
		int i_362_ = i_357_;
		int i_363_ = i_356_ / 2;
		bool = (i_360_ <= -i_362_
			|| i_361_ >= 1463495207 * class58.scrollMinY
			|| i_358_ <= -i_363_
			|| i_359_ >= class58.anInt850 * 439139681 + i_363_);
	    }
	    if (bool) {
		double d = Math.atan2((double) i_354_, (double) i_355_);
		double d_364_ = Math.atan2((double) Math.abs(i_354_),
					   (double) Math.abs(i_355_));
		double d_365_
		    = Math.atan2((double) (439139681 * class58.anInt850 / 2),
				 (double) (1463495207 * class58.scrollMinY / 2));
		boolean bool_366_ = false;
		double d_367_ = 0.0;
		int i_368_;
		if (d_364_ < d_365_) {
		    d_367_ = 1.5707963267948966 - d;
		    i_368_ = 1463495207 * class58.scrollMinY / 2;
		} else {
		    d_367_ = d;
		    i_368_ = class58.anInt850 * 439139681 / 2;
		}
		int i_369_ = Math.abs((int) -((double) i_368_
					      * Math.sin(1.5707963267948966)
					      / Math.sin(d_367_)));
		Class5.aClass168Array27[i_349_].method3619
		    (((float) (439139681 * class58.anInt850) / 2.0F + (float) i
		      + 0.0F),
		     ((float) i_346_
		      + (float) (1463495207 * class58.scrollMinY) / 2.0F - 0.0F),
		     (float) Class5.aClass168Array27[i_349_].method64() / 2.0F,
		     (float) i_369_, 4096,
		     (int) (-d / 6.283185307179586 * 65535.0));
	    } else if (class118 != null)
		class168.method3679(i_358_ + i, i_360_ + i_346_,
				    class118.aClass135_1559, i, i_346_);
	    else
		class168.method3646(i + i_358_, i_360_ + i_346_);
	}
    }
    
    static void method3987(InterfaceComponent class58, Class135 class135, int i,
			   int i_370_, int i_371_, int i_372_,
			   Class168 class168) {
	Class212.method4293(class58, class135, i, i_370_, i_371_, i_372_,
			    class168, 100.0);
    }
    
    static void method3988(InterfaceComponent class58, Class135 class135, int i,
			   int i_373_, int i_374_, int i_375_,
			   Class168 class168, double d) {
	if (class168 != null) {
	    int i_376_;
	    if (4 == 115241065 * Class296.anInt4513)
		i_376_ = ((int) ((double) Class445_Sub16
					      .aClass351_Sub1_8660
					      .method6292((byte) 41)
				 * 2607.5945876176133)
			  + 390680985 * client.anInt8513) & 0x3fff;
	    else if (5 == Class296.anInt4513 * 115241065)
		i_376_ = (int) client.aFloat8581 & 0x3fff;
	    else
		i_376_
		    = ((int) client.aFloat8581 + 390680985 * client.anInt8513
		       & 0x3fff);
	    int i_377_ = (Math.max(439139681 * class58.anInt850 / 2,
				   1463495207 * class58.scrollMinY / 2)
			  + 10);
	    int i_378_ = i_375_ * i_375_ + i_374_ * i_374_;
	    if (i_378_ <= i_377_ * i_377_) {
		int i_379_ = Class282.anIntArray4430[i_376_];
		int i_380_ = Class282.anIntArray4441[i_376_];
		if (Class296.anInt4513 * 115241065 != 5) {
		    i_379_
			= 256 * i_379_ / (256 + client.anInt8377 * 1747300637);
		    i_380_
			= i_380_ * 256 / (256 + client.anInt8377 * 1747300637);
		}
		int i_381_ = i_374_ * i_380_ + i_379_ * i_375_ >> 14;
		int i_382_ = i_375_ * i_380_ - i_379_ * i_374_ >> 14;
		double d_383_ = d / 100.0;
		if (null != class135) {
		    if (1.0 == d_383_)
			class168.method3679((i
					     + 439139681 * class58.anInt850 / 2
					     + i_381_
					     - class168.method64() / 2),
					    (i_373_
					     + (1463495207 * class58.scrollMinY
						/ 2)
					     - i_382_ - class168.method3616()),
					    class135, i, i_373_);
		    else
			class168.method3614
			    ((i_381_ + (class58.anInt850 * 439139681 / 2 + i)
			      - (int) ((double) (class168.method64() / 2)
				       * d_383_)),
			     (1463495207 * class58.scrollMinY / 2 + i_373_
			      - i_382_
			      - (int) ((double) class168.method3616()
				       * d_383_)),
			     (int) ((double) class168.method64() * d_383_),
			     (int) ((double) class168.method3616() * d_383_));
		} else {
		    if (1.0 == d_383_)
			class168.method3646
			    ((i_381_ + (i + 439139681 * class58.anInt850 / 2)
			      - class168.method64() / 2),
			     (i_373_ + class58.scrollMinY * 1463495207 / 2
			      - i_382_ - class168.method3616()));
		    class168.method3614
			((i + 439139681 * class58.anInt850 / 2 + i_381_
			  - (int) ((double) (class168.method64() / 2)
				   * d_383_)),
			 (1463495207 * class58.scrollMinY / 2 + i_373_ - i_382_
			  - (int) ((double) class168.method3616() * d_383_)),
			 (int) ((double) class168.method64() * d_383_),
			 (int) ((double) class168.method3616() * d_383_));
		}
	    }
	}
    }
    
    public static void method3989() {
	anInt2299 = -472227899;
    }
    
    static void method3990(Class103 class103, InterfaceComponent class58, int i,
			   int i_384_) {
	if (null != Class21.myPlayer) {
	    class103.method2291();
	    Class118 class118 = null;
	    Class135 class135 = null;
	    if (5 == class58.componentType * -1579470857) {
		class118 = class58.method1518(class103, -1149319474);
		if (class118 == null)
		    return;
		class135 = class118.aClass135_1559;
		if ((1403518843 * class118.anInt1560
		     != 439139681 * class58.anInt850)
		    || (574765281 * class118.anInt1556
			!= 1463495207 * class58.scrollMinY))
		    throw new IllegalStateException("");
	    }
	    class103.method2445(i, i_384_, i + 439139681 * class58.anInt850,
				i_384_ + 1463495207 * class58.scrollMinY);
	    if (2 != 630280401 * anInt2311 && 630280401 * anInt2311 != 5
		&& Class65.aClass168_1046 != null) {
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		int i_385_;
		int i_386_;
		int i_387_;
		int i_388_;
		if (5 == 115241065 * Class296.anInt4513) {
		    i_385_ = 1750875065 * client.anInt8557;
		    i_386_ = -1494721987 * client.anInt8361;
		    i_387_ = (int) -client.aFloat8581 & 0x3fff;
		    i_388_ = 4096;
		} else {
		    Class287 class287
			= (Class21.myPlayer
			       .method10874
			   ().aClass287_4386);
		    i_385_ = (int) class287.aFloat4477;
		    i_386_ = (int) class287.aFloat4479;
		    if (115241065 * Class296.anInt4513 == 4)
			i_387_ = ((int) -((double) Class445_Sub16
						       .aClass351_Sub1_8660
						       .method6292((byte) 66)
					  * 2607.5945876176133)
				  + 390680985 * client.anInt8513) & 0x3fff;
		    else
			i_387_ = (390680985 * client.anInt8513
				  + (int) -client.aFloat8581) & 0x3fff;
		    i_388_ = 4096 - client.anInt8377 * -2107960880;
		}
		int i_389_ = 48 + i_385_ / 128;
		int i_390_
		    = (48 + client.aClass238_8477.method4745(1220938162) * 4
		       - i_386_ / 128);
		if (class135 != null)
		    Class65.aClass168_1046.method3625
			(((float) (class58.anInt850 * 439139681) / 2.0F
			  + (float) i),
			 ((float) (class58.scrollMinY * 1463495207) / 2.0F
			  + (float) i_384_),
			 (float) i_389_, (float) i_390_, i_388_, i_387_ << 2,
			 class135, i, i_384_);
		else
		    Class65.aClass168_1046.method3623
			(((float) (class58.anInt850 * 439139681) / 2.0F
			  + (float) i),
			 ((float) (1463495207 * class58.scrollMinY) / 2.0F
			  + (float) i_384_),
			 (float) i_389_, (float) i_390_, i_388_, i_387_ << 2,
			 1, -1, 1);
		Class564 class564
		    = client.aClass238_8477.method4860(-1008244697);
		for (IntegerNode class241_sub22
			 = ((IntegerNode)
			    aClass429_2307.method7694(16711935));
		     null != class241_sub22;
		     class241_sub22
			 = ((IntegerNode)
			    aClass429_2307.method7692(1361685793))) {
		    int i_391_ = -1859754807 * class241_sub22.intValue;
		    int i_392_
			= ((class564.anIntArray7306[i_391_] >> 14 & 0x3fff)
			   - class522.baseX * 127679513);
		    int i_393_ = ((class564.anIntArray7306[i_391_] & 0x3fff)
				  - class522.baseY * 468558693);
		    int i_394_ = 2 + 4 * i_392_ - i_385_ / 128;
		    int i_395_ = 4 * i_393_ + 2 - i_386_ / 128;
		    Class106.method2674(class103, class135, class58, i, i_384_,
					i_394_, i_395_,
					class564.anIntArray7307[i_391_],
					(byte) 49);
		}
		for (int i_396_ = 0; i_396_ < anInt2303 * -1037886889;
		     i_396_++) {
		    int i_397_ = 4 * anIntArray2304[i_396_] + 2 - i_385_ / 128;
		    int i_398_ = 2 + 4 * anIntArray2313[i_396_] - i_386_ / 128;
		    ObjectDefinition class526
			= client.aClass238_8477.getObjectLoader(-2041097463)
			      .getObjectDefinition(anIntArray2306[i_396_], 577892407);
		    if (class526.toObjectIDs != null) {
			class526 = class526.method11768(Class1.aClass19_11,
							Class1.aClass19_11,
							-1415370298);
			if (null == class526
			    || 8166631 * class526.mapSpriteID == -1)
			    continue;
		    }
		    Class106.method2674(class103, class135, class58, i, i_384_,
					i_397_, i_398_,
					8166631 * class526.mapSpriteID,
					(byte) 93);
		}
		for (WorldTile class241_sub44
			 = ((WorldTile)
			    client.aClass407_8452.method7294(2090894173));
		     class241_sub44 != null;
		     class241_sub44
			 = ((WorldTile)
			    client.aClass407_8452.method7295(171083844))) {
		    int i_399_ = (int) ((class241_sub44.hashCode
					 * 4356572401218184725L) >> 28
					& 0x3L);
		    if (anInt2299 * -1342949133 == i_399_) {
			int i_400_ = ((int) ((4356572401218184725L
					      * class241_sub44.hashCode)
					     & 0x3fffL)
				      - 127679513 * class522.baseX);
			int i_401_ = ((int) ((class241_sub44.hashCode
					      * 4356572401218184725L) >> 14
					     & 0x3fffL)
				      - class522.baseY * 468558693);
			int i_402_ = i_400_ * 4 + 2 - i_385_ / 128;
			int i_403_ = 4 * i_401_ + 2 - i_386_ / 128;
			Class1.method452(class58, class135, i, i_384_, i_402_,
					 i_403_,
					 HitMarkTypeList.aClass168Array7251[0],
					 450544638);
		    }
		}
		Class96_Sub1.method15364(class103, i_385_, i_386_, class58,
					 class135, i, i_384_, (byte) -60);
		Class12.method601(i_385_, i_386_, class58, class135, i, i_384_,
				  884475734);
		Class371.method6631(i_385_, i_386_, class58, class118, i,
				    i_384_, (byte) 0);
		if (5 != 115241065 * Class296.anInt4513) {
		    if (1813149433 * minimapFlagX != -1) {
			int i_404_
			    = (2 + -1337336860 * minimapFlagX - i_385_ / 128
			       + (Class21.myPlayer
				      .method17782(730206472)
				  - 1) * 2);
			int i_405_
			    = (minimapFlagY * -758443068 + 2 - i_386_ / 128
			       + (Class21.myPlayer
				      .method17782(-103192624)
				  - 1) * 2);
			Class1.method452(class58, class135, i, i_384_, i_404_,
					 i_405_,
					 (Class360.aClass168Array5502
					  [aBool2302 ? 1 : 0]),
					 827993256);
		    }
		    if (!Class21.myPlayer.hidden)
			class103.method2263((class58.anInt850 * 439139681 / 2
					     + i - 1),
					    i_384_ + (class58.scrollMinY
						      * 1463495207 / 2) - 1,
					    3, 3, -1, (byte) -72);
		}
	    } else if (null != class135)
		class103.method2495(-16777216, class135, i, i_384_);
	}
    }
    
    static void method3991(InterfaceComponent class58, Class135 class135, int i,
			   int i_406_, int i_407_, int i_408_,
			   Class168 class168, double d) {
	if (class168 != null) {
	    int i_409_;
	    if (4 == 115241065 * Class296.anInt4513)
		i_409_ = ((int) ((double) Class445_Sub16
					      .aClass351_Sub1_8660
					      .method6292((byte) 117)
				 * 2607.5945876176133)
			  + 390680985 * client.anInt8513) & 0x3fff;
	    else if (5 == Class296.anInt4513 * 115241065)
		i_409_ = (int) client.aFloat8581 & 0x3fff;
	    else
		i_409_
		    = ((int) client.aFloat8581 + 390680985 * client.anInt8513
		       & 0x3fff);
	    int i_410_ = (Math.max(439139681 * class58.anInt850 / 2,
				   1463495207 * class58.scrollMinY / 2)
			  + 10);
	    int i_411_ = i_408_ * i_408_ + i_407_ * i_407_;
	    if (i_411_ <= i_410_ * i_410_) {
		int i_412_ = Class282.anIntArray4430[i_409_];
		int i_413_ = Class282.anIntArray4441[i_409_];
		if (Class296.anInt4513 * 115241065 != 5) {
		    i_412_
			= 256 * i_412_ / (256 + client.anInt8377 * 1747300637);
		    i_413_
			= i_413_ * 256 / (256 + client.anInt8377 * 1747300637);
		}
		int i_414_ = i_407_ * i_413_ + i_412_ * i_408_ >> 14;
		int i_415_ = i_408_ * i_413_ - i_412_ * i_407_ >> 14;
		double d_416_ = d / 100.0;
		if (null != class135) {
		    if (1.0 == d_416_)
			class168.method3679((i
					     + 439139681 * class58.anInt850 / 2
					     + i_414_
					     - class168.method64() / 2),
					    (i_406_
					     + (1463495207 * class58.scrollMinY
						/ 2)
					     - i_415_ - class168.method3616()),
					    class135, i, i_406_);
		    else
			class168.method3614
			    ((i_414_ + (class58.anInt850 * 439139681 / 2 + i)
			      - (int) ((double) (class168.method64() / 2)
				       * d_416_)),
			     (1463495207 * class58.scrollMinY / 2 + i_406_
			      - i_415_
			      - (int) ((double) class168.method3616()
				       * d_416_)),
			     (int) ((double) class168.method64() * d_416_),
			     (int) ((double) class168.method3616() * d_416_));
		} else {
		    if (1.0 == d_416_)
			class168.method3646
			    ((i_414_ + (i + 439139681 * class58.anInt850 / 2)
			      - class168.method64() / 2),
			     (i_406_ + class58.scrollMinY * 1463495207 / 2
			      - i_415_ - class168.method3616()));
		    class168.method3614
			((i + 439139681 * class58.anInt850 / 2 + i_414_
			  - (int) ((double) (class168.method64() / 2)
				   * d_416_)),
			 (1463495207 * class58.scrollMinY / 2 + i_406_ - i_415_
			  - (int) ((double) class168.method3616() * d_416_)),
			 (int) ((double) class168.method64() * d_416_),
			 (int) ((double) class168.method3616() * d_416_));
		}
	    }
	}
    }
    
    static boolean method3992(int i, int i_417_, int i_418_) {
	Class552 class552 = client.aClass238_8477.method4751(-529166612);
	boolean bool = true;
	Interface24 interface24
	    = (Interface24) class552.method12132(i, i_417_, i_418_, (byte) 7);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -1041454599);
	interface24
	    = (Interface24) class552.method12136(i, i_417_, i_418_,
						 client.anInterface57_8577,
						 1166657231);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -1104463454);
	interface24 = (Interface24) class552.method12100(i, i_417_, i_418_,
							 1893440801);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, 1328970856);
	return bool;
    }
    
    static void method3993(int i, int i_419_, boolean bool) {
	Class458.aBoolArrayArray6260[i][i_419_] = bool;
    }
    
    static void method3994(int i, int i_420_, boolean bool) {
	Class458.aBoolArrayArray6260[i][i_420_] = bool;
    }
    
    Class194() throws Throwable {
	throw new Error();
    }
    
    static void method3995(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [((ClientScriptData) class454).intStackPointer * 1482319719 - 1]
	    = Class326_Sub3.aClass482_10288.method11010
		  ((((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer - 1]),
		   (short) 2468)
		  .method10973(Class1.aClass19_11, 1700117222) ? 1 : 0;
    }
    
    static final void method3996(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
    }
    
    public static int method3997(Random random, int i, byte i_421_) {
	if (random == null) {
	    random = Class637.aRandom8249;
	    if (null == random) {
		synchronized (Class637.anObject8250) {
		    if (Class637.aRandom8249 == null)
			Class637.aRandom8249 = new Random();
		    random = Class637.aRandom8249;
		}
	    }
	}
	if (i <= 0)
	    throw new IllegalArgumentException();
	if (Class76.method1772(i, (byte) 52))
	    return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i
			  >> 32);
	int i_422_ = -2147483648 - (int) (4294967296L % (long) i);
	int i_423_;
	do
	    i_423_ = random.nextInt();
	while (i_423_ >= i_422_);
	return GameDefinition.method10781(i_423_, i, 758591751);
    }
}
