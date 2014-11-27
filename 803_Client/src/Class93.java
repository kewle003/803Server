/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class93
{
    public int anInt1320;
    int anInt1321;
    Player aClass475_Sub1_Sub1_Sub3_Sub1_1322;
    public boolean aBool1323 = false;
    int[] anIntArray1324;
    NPC aClass475_Sub1_Sub1_Sub3_Sub2_1325 = null;
    static final int anInt1326 = 25;
    
    boolean method2078() {
	if (-2090966541 * anInt1320 >= 0) {
	    NPCDefinition class401
		= MasterIndex.npcDefLoader.getNpcDefinition(anInt1320 * -2090966541,
						     -1856138214);
	    boolean bool = class401.method7147(279762851);
	    if (null == ((Class93) this).anIntArray1324) {
		Class554 class554
		    = Class79.aClass539_1138.method11908((1952014657
							  * (class401
							     .renderEmote)),
							 -1764734797);
		((Class93) this).anIntArray1324
		    = class554.method12261((byte) -26);
	    }
	    int[] is = ((Class93) this).anIntArray1324;
	    for (int i = 0; i < is.length; i++) {
		int i_0_ = is[i];
		bool &= Class394.animationDefLoader.getAnimationDefinition
			    (i_0_, (byte) -45).method12012(1058739755);
	    }
	    return bool;
	}
	return true;
    }
    
    void method2079(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
	if (!aBool1323) {
	    aBool1323 = true;
	    if (-2090966541 * anInt1320 >= 0) {
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		    = (new NPC
		       (client.aClass238_8477.method4751(-992333354), 25));
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.entityIndex
		    = -757996939 * ((Class93) this).anInt1321;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.anInt11410
		    = client.anInt8296 * 216794573;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.setDefinition
		    (MasterIndex.npcDefLoader
			 .getNpcDefinition(-2090966541 * anInt1320, -968439338),
		     -1203132678);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.method17781
		    ((((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		      .definition.size) * 19489015,
		     (byte) -30);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.anInt11400
		    = -687691613 * ((((Class93) this)
				     .aClass475_Sub1_Sub1_Sub3_Sub2_1325
				     .definition.headsIcon) * 607575013
				    << 3);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.anInt11382
		    = (((Class104.anInt1474 += 1952203933) * 1653891509 - 1)
		       * 62840879);
	    } else {
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		    = new Player(client.aClass238_8477.method4751(-2042117021), 25);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		    .decodeCharacterData(HitMarkType.aClass241_Sub3_7297, (byte) 14);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.entityIndex
		    = ((Class93) this).anInt1321 * -757996939;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.anInt11410
		    = 216794573 * client.anInt8296;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.anInt11382
		    = (((Class104.anInt1474 += 1952203933) * 1653891509 - 1)
		       * 62840879);
	    }
	}
	if (-2090966541 * anInt1320 >= 0) {
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.method17994
		(i_2_, i, i_1_, true,
		 ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		     .method17782(-350635047),
		 -16777216);
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		.setDirection(i_3_, true, (byte) 93);
	} else {
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.nodePlane
		= ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.aByte8745
		= (byte) i_2_;
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		.setPosition(i, i_1_, 1828846670);
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		.setDirection(i_3_, true, (byte) 105);
	}
    }
    
    void method2080(int i) {
	((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325 = null;
	((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322 = null;
	aBool1323 = false;
    }
    
    void method2081(int i, int i_5_, int i_6_, byte i_7_) {
	if (((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325 != null)
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.method17994
		(i, i_5_, i_6_, true,
		 ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		     .method17782(-1078244122),
		 -16777216);
	else {
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.nodePlane
		= ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.aByte8745
		= (byte) i;
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		.setPosition(i_5_, i_6_, 475838996);
	}
    }
    
    Class93(RSByteBuffer class241_sub3, int i) {
	((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322 = null;
	((Class93) this).anInt1321 = i * -1208644819;
	int i_8_ = class241_sub3.readUnsignedByte((byte) 52);
	switch (i_8_) {
	default:
	    anInt1320 = -1557208891;
	    break;
	case 0:
	    anInt1320 = class241_sub3.readBigSmart((byte) -26) * 1557208891;
	    break;
	case 1:
	    anInt1320 = -1557208891;
	}
	class241_sub3.readString(2031983385);
    }
    
    boolean method2082(int i) {
	if (-2090966541 * anInt1320 >= 0) {
	    NPCDefinition class401
		= MasterIndex.npcDefLoader.getNpcDefinition(anInt1320 * -2090966541,
						     -686789317);
	    boolean bool = class401.method7147(741427411);
	    if (null == ((Class93) this).anIntArray1324) {
		Class554 class554
		    = Class79.aClass539_1138.method11908((1952014657
							  * (class401
							     .renderEmote)),
							 -2132198354);
		((Class93) this).anIntArray1324
		    = class554.method12261((byte) -71);
	    }
	    int[] is = ((Class93) this).anIntArray1324;
	    for (int i_9_ = 0; i_9_ < is.length; i_9_++) {
		int i_10_ = is[i_9_];
		bool &= Class394.animationDefLoader.getAnimationDefinition
			    (i_10_, (byte) -112).method12012(1095497168);
	    }
	    return bool;
	}
	return true;
    }
    
    public Entity method2083(int i) {
	if (((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325 != null)
	    return ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325;
	return ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322;
    }
    
    void method2084(int i, int i_11_, int i_12_) {
	if (((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325 != null)
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.method17994
		(i, i_11_, i_12_, true,
		 ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		     .method17782(1038751118),
		 -16777216);
	else {
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.nodePlane
		= ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.aByte8745
		= (byte) i;
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		.setPosition(i_11_, i_12_, 115055553);
	}
    }
    
    void method2085() {
	((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325 = null;
	((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322 = null;
	aBool1323 = false;
    }
    
    void method2086(int i, int i_13_, int i_14_, int i_15_) {
	if (!aBool1323) {
	    aBool1323 = true;
	    if (-2090966541 * anInt1320 >= 0) {
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		    = (new NPC
		       (client.aClass238_8477.method4751(-1381416740), 25));
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.entityIndex
		    = -757996939 * ((Class93) this).anInt1321;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.anInt11410
		    = client.anInt8296 * 216794573;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.setDefinition
		    (MasterIndex.npcDefLoader
			 .getNpcDefinition(-2090966541 * anInt1320, -1151594385),
		     1123160602);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.method17781
		    ((((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		      .definition.size) * 19489015,
		     (byte) -36);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.anInt11400
		    = -687691613 * ((((Class93) this)
				     .aClass475_Sub1_Sub1_Sub3_Sub2_1325
				     .definition.headsIcon) * 607575013
				    << 3);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.anInt11382
		    = (((Class104.anInt1474 += 1952203933) * 1653891509 - 1)
		       * 62840879);
	    } else {
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		    = (new Player
		       (client.aClass238_8477.method4751(-690276458), 25));
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		    .decodeCharacterData(HitMarkType.aClass241_Sub3_7297, (byte) 14);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.entityIndex
		    = ((Class93) this).anInt1321 * -757996939;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.anInt11410
		    = 216794573 * client.anInt8296;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.anInt11382
		    = (((Class104.anInt1474 += 1952203933) * 1653891509 - 1)
		       * 62840879);
	    }
	}
	if (-2090966541 * anInt1320 >= 0) {
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.method17994
		(i_14_, i, i_13_, true,
		 ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		     .method17782(28979747),
		 -16777216);
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		.setDirection(i_15_, true, (byte) 74);
	} else {
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.nodePlane
		= ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.aByte8745
		= (byte) i_14_;
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		.setPosition(i, i_13_, 1412753141);
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		.setDirection(i_15_, true, (byte) 71);
	}
    }
    
    public Entity method2087() {
	if (((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325 != null)
	    return ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325;
	return ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322;
    }
    
    public Entity method2088() {
	if (((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325 != null)
	    return ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325;
	return ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322;
    }
    
    public Entity method2089() {
	if (((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325 != null)
	    return ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325;
	return ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322;
    }
    
    public Entity method2090() {
	if (((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325 != null)
	    return ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325;
	return ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322;
    }
    
    void method2091(int i, int i_16_, int i_17_, int i_18_) {
	if (!aBool1323) {
	    aBool1323 = true;
	    if (-2090966541 * anInt1320 >= 0) {
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		    = (new NPC
		       (client.aClass238_8477.method4751(-830053714), 25));
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.entityIndex
		    = -757996939 * ((Class93) this).anInt1321;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.anInt11410
		    = client.anInt8296 * 216794573;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.setDefinition
		    (MasterIndex.npcDefLoader
			 .getNpcDefinition(-2090966541 * anInt1320, -212042924),
		     -471367357);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.method17781
		    ((((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		      .definition.size) * 19489015,
		     (byte) -97);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.anInt11400
		    = -687691613 * ((((Class93) this)
				     .aClass475_Sub1_Sub1_Sub3_Sub2_1325
				     .definition.headsIcon) * 607575013
				    << 3);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.anInt11382
		    = (((Class104.anInt1474 += 1952203933) * 1653891509 - 1)
		       * 62840879);
	    } else {
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		    = (new Player
		       (client.aClass238_8477.method4751(-1322971544), 25));
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		    .decodeCharacterData(HitMarkType.aClass241_Sub3_7297, (byte) 14);
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.entityIndex
		    = ((Class93) this).anInt1321 * -757996939;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.anInt11410
		    = 216794573 * client.anInt8296;
		((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.anInt11382
		    = (((Class104.anInt1474 += 1952203933) * 1653891509 - 1)
		       * 62840879);
	    }
	}
	if (-2090966541 * anInt1320 >= 0) {
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325.method17994
		(i_17_, i, i_16_, true,
		 ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		     .method17782(2135753136),
		 -16777216);
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub2_1325
		.setDirection(i_18_, true, (byte) 15);
	} else {
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.nodePlane
		= ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322.aByte8745
		= (byte) i_17_;
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		.setPosition(i, i_16_, 1342155319);
	    ((Class93) this).aClass475_Sub1_Sub1_Sub3_Sub1_1322
		.setDirection(i_18_, true, (byte) 23);
	}
    }
    
    static void method2092(Class103 class103, int i, int i_19_,
			   InterfaceComponent class58, int i_20_, int i_21_) {
	for (int i_22_ = 7; i_22_ >= 0; i_22_--) {
	    for (int i_23_ = 127; i_23_ >= 0; i_23_--) {
		int i_24_
		    = (i_20_ & 0x3f) << 10 | (i_22_ & 0x7) << 7 | i_23_ & 0x7f;
		Class81.method1812(false, true, 953486904);
		int i_25_ = Class474.anIntArray6382[i_24_];
		Class238.method4876(false, true, 1122786318);
		class103.method2396(i + (class58.anInt850 * 439139681 * i_23_
					 >> 7),
				    ((7 - i_22_) * (1463495207
						    * class58.scrollMinY)
				     >> 3) + i_19_,
				    1 + (class58.anInt850 * 439139681 >> 7),
				    1 + (class58.scrollMinY * 1463495207 >> 3),
				    ~0xffffff | i_25_, 0);
	    }
	}
    }
    
    public static Class465 method2093(int i, int i_26_) {
	Class465[] class465s = Class75.method1767(-1008660662);
	for (int i_27_ = 0; i_27_ < class465s.length; i_27_++) {
	    if (i == 2119010589 * class465s[i_27_].anInt6298)
		return class465s[i_27_];
	}
	return null;
    }
    
    static final void method2094(ClientScriptData class454, byte i) {
	int i_28_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_28_, (byte) -3);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_28_ >> 16];
	Class281.method5488(class58, class35, true, 2, class454, 646361480);
    }
    
    public static void method2095(byte i) {
	for (Class241_Sub10 class241_sub10
		 = ((Class241_Sub10)
		    Class447.aClass407_6181.method7294(2090894173));
	     class241_sub10 != null;
	     class241_sub10 = ((Class241_Sub10)
			       Class447.aClass407_6181.method7295(192500177)))
	    Class19.method880((((Class241_Sub10) class241_sub10).anInt8899
			       * 1570057341),
			      (short) -8960);
    }
    
    static final void method2096(int i, int i_29_, int i_30_, int i_31_,
				 int i_32_, int i_33_, int i_34_) {
	for (Class247_Sub6 class247_sub6
		 = ((Class247_Sub6)
		    client.aClass421_8376.method7525(-1076802361));
	     class247_sub6 != null;
	     class247_sub6 = ((Class247_Sub6)
			      client.aClass421_8376.method7526(1836156392))) {
	    if (client.anInt8296
		>= -712125091 * ((Class247_Sub6) class247_sub6).anInt10282)
		class247_sub6.method4944((byte) -16);
	    else {
		Class123.method2992
		    (((Class247_Sub6) class247_sub6).anInt10278 * 1384276713,
		     (((Class247_Sub6) class247_sub6).anInt10277 * -1474974867
		      << 9) + 256,
		     (256
		      + (((Class247_Sub6) class247_sub6).anInt10279 * 573702877
			 << 9)),
		     0, 511003218 * ((Class247_Sub6) class247_sub6).anInt10280,
		     false, false, 1047462026);
		Class81.aClass96_1149.method2113
		    (((Class247_Sub6) class247_sub6).aString10283,
		     (int) (client.aFloatArray8336[0] + (float) i),
		     (int) (client.aFloatArray8336[1] + (float) i_29_),
		     ~0xffffff | (((Class247_Sub6) class247_sub6).anInt10281
				  * 100832041),
		     0, 248593491);
	    }
	}
    }
}
