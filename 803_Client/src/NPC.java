/* Class475_Sub1_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPC extends Entity
{
    public String npcName;//aString11520
    public int anInt11521 = 373723239;
    public int anInt11522 = -836941349;
    int[] anIntArray11523;
    public static int anInt11524 = -1265497825;
    public static int anInt11525 = 1674654299;
    int anInt11526;
    public NPCDefinition definition;//aClass401_11527
    public int combatLevel;//anInt11528
    public Class400 aClass400_11529;
    public int anInt11530 = -1041382731;
    public Class404 aClass404_11531;
    int anInt11532;
    int anInt11533;
    int[] anIntArray11534;
    int anInt11535;
    public static byte myCurrentFcRank;//aByte11536
    
    public int method17867() {
	if (definition.transformTo != null) {
	    NPCDefinition class401
		= definition.method7176(Class1.aClass19_11,
					     Class1.aClass19_11, (byte) 18);
	    if (null != class401 && -1 != class401.anInt5834 * -285191453)
		return -285191453 * class401.anInt5834;
	}
	return -285191453 * definition.anInt5834;
    }
    
    public int method10() {
	return -546698383 * entityIndex;
    }
    
    Class542 method14455(Class103 class103, int i) {
	if (null == definition
	    || !method17989(class103, 526336, -200044316))
	    return null;
	Class266 class266 = method10893();
	Class276 class276 = method10874();
	Class266 class266_0_ = class103.method2595();
	int i_1_ = aClass8_11406.method514((byte) 53);
	Class548 class548
	    = (aClass552_8744.aClass548ArrayArrayArray7169[nodePlane]
	       [(int) class276.aClass287_4386.aFloat4477 >> 9]
	       [(int) class276.aClass287_4386.aFloat4479 >> 9]);
	if (class548 != null && null != class548.aClass475_Sub1_Sub4_7058) {
	    int i_2_ = ((-1554267337
			 * anInt11399)
			- class548.aClass475_Sub1_Sub4_7058.aShort10742);
	    anInt11399
		= (int) ((float) (-1554267337
				  * (((NPC) this)
				     .anInt11399))
			 - (float) i_2_ / 10.0F) * 665281159;
	} else
	    anInt11399
		= (665281159
		   * (int) ((float) ((((NPC) this)
				      .anInt11399)
				     * -1554267337)
			    - (float) (-1554267337
				       * (((NPC) this)
					  .anInt11399)) / 10.0F));
	class266_0_.method5175(class266);
	class266_0_.method5133(0.0F,
			       (float) (-20
					- (-1554267337
					   * ((NPC)
					      this).anInt11399)),
			       0.0F);
	Class554 class554 = method17787(1239830226);
	NPCDefinition class401
	    = (definition.transformTo != null
	       ? definition.method7176(Class1.aClass19_11,
					    Class1.aClass19_11, (byte) 81)
	       : definition);
	boolean bool = class401.aClass272_5846 != null;
	aBool11432 = false;
	Class542 class542 = null;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		.method14854(-1888673265) == 1
	    && class401.aBool5831 && class554.aBool7246) {
	    Class409 class409 = ((aClass409_11375.method7364(-270883871)
				  && aClass409_11375.method7349(-1935267199))
				 ? aClass409_11375 : null);
	    Class409_Sub1 class409_sub1
		= ((aClass409_Sub1_11405.method7364(1696749100)
		    && (!aClass409_Sub1_11405.aBool8600 || null == class409))
		   ? aClass409_Sub1_11405 : null);
	    short i_3_ = Class128.aClass513_1589.aShort6719;
	    byte i_4_ = Class128.aClass513_1589.aByte6713;
	    if (definition.aShort5806 > -1) {
		i_3_ = definition.aShort5806;
		i_4_ = definition.aByte5847;
	    }
	    Class89 class89;
	    if (i_3_ > -1
		&& Class241_Sub5_Sub9.aClass241_Sub9_11043
		       .aClass445_Sub33_8890.method14529(-485668821) == 1)
		class89 = (Class520.method11694
			   (class103, i_1_,
			    -195854529 * (((NPC) this)
					  .anInt11383),
			    -192864185 * (((NPC) this)
					  .anInt11384),
			    (anInt11385
			     * -389722201),
			    aClass89Array11435[0], i_3_, i_4_,
			    (null != class409_sub1 ? (Class409) class409_sub1
			     : class409),
			    51804962));
	    else
		class89 = (Class477.method10920
			   (class103, i_1_,
			    (anInt11383
			     * -195854529),
			    -192864185 * (((NPC) this)
					  .anInt11384),
			    -389722201 * (((NPC) this)
					  .anInt11385),
			    definition.size * 19489015,
			    aClass89Array11435[0],
			    definition.aShort5844 & 0xffff,
			    definition.aShort5843 & 0xffff,
			    definition.aByte5861 & 0xff,
			    definition.aByte5845 & 0xff,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    -1195253253));
	    if (null != class89) {
		class542 = Class128.method3016(method18000(-821617576),
					       -2091673491);
		aBool11432 = true;
		class103.method2308(false);
		if (bool)
		    class89.method1890(class266_0_, null, 0);
		else {
		    if (aClass97Array8748 == null
			|| (aClass97Array8748.length
			    < aClass89Array11435.length + 1))
			method14465(aClass89Array11435.length + 1, 790983932);
		    class89.method1890(class266_0_,
				       (aClass97Array8748
					[aClass89Array11435.length]),
				       0);
		}
		class103.method2308(true);
	    }
	}
	if (bool) {
	    if (aClass97Array8748 == null || aClass97Array8748.length > 1)
		method14465(1, 2044347545);
	    class103.method2282(class266_0_, aClass97Array8748[0],
				class401.aClass272_5846);
	} else if (null == aClass97Array8748
		   || aClass97Array8748.length < aClass89Array11435.length)
	    method14465(aClass89Array11435.length, 1795806191);
	if (null == class542)
	    class542
		= Class128.method3016(method18000(-1116287361), -2076221883);
	method17775(class103, aClass89Array11435, class266_0_, false,
		    -1947638283);
	for (int i_5_ = 0; i_5_ < aClass89Array11435.length; i_5_++) {
	    if (aClass89Array11435[i_5_] != null) {
		if (definition.aBool5853)
		    aClass89Array11435[i_5_].method1911
			((anInt11532
			  * 124635235),
			 (anInt11533
			  * -127947159),
			 (-1695568079
			  * anInt11526),
			 (1207275961
			  * anInt11535));
		if (bool)
		    aClass89Array11435[i_5_].method1890(class266_0_, null, 0);
		else
		    aClass89Array11435[i_5_]
			.method1890(class266_0_, aClass97Array8748[i_5_], 0);
	    } else if (!bool)
		aClass97Array8748[i_5_].aBool1352 = false;
	}
	if (aClass489_11420 != null) {
	    Class98 class98 = ((NPC) this)
				  .aClass489_11420.method11164();
	    class103.method2305(class98);
	}
	for (int i_6_ = 0; i_6_ < aClass89Array11435.length; i_6_++) {
	    if (null != aClass89Array11435[i_6_])
		aBool11432
		    |= aClass89Array11435[i_6_].method2052();
	    aClass89Array11435[i_6_] = null;
	}
	anInt11376 = -96196995 * client.anInt8407;
	return class542;
    }
    
    void method17986(int i) {
	anInt11532
	    = (32 + (int) (Math.random() * 4.0)) * -1313146549;
	anInt11533
	    = (3 + (int) (Math.random() * 2.0)) * -198655527;
	anInt11526
	    = (16 + (int) (Math.random() * 3.0)) * 1240287697;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890
		.method14529(-485668821)
	    == 1)
	    anInt11535
		= (int) (Math.random() * 6.0) * 1699685513;
	else
	    anInt11535
		= (int) (Math.random() * 12.0) * 1699685513;
    }
    
    public void setDefinition/*method17987*/(NPCDefinition def, int i) {
    	setDefinition(def, true, true, true, 2041631928);
    }
    
    public void setDefinition/*method17988*/(NPCDefinition newDef, boolean setName, boolean setCombat, boolean bool_8_, int i) {
		if (definition != newDef && Class16.aBool141 
				&& Class480.method11005(-546698383 * entityIndex, -1007244065)) {
		    Class198.method4036((byte) 4);
		}
		definition = newDef;
		if (definition != null) {
		    if (setName) {
		    	npcName = definition.name;
		    }
		    if (setCombat) {
		    	combatLevel = 572907823 * definition.combatLevel;
		    }
		    if (bool_8_) {
		    	aClass400_11529 = null;
		    }
		}
		if (aClass489_11420 != null) {
		    aClass489_11420.method11152();
		}
    }
    
    public Class535 method14457(Class103 class103, int i) {
	return null;
    }
    
    final void method14453(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_9_, int i_10_, boolean bool,
			   int i_11_) {
	throw new IllegalStateException();
    }
    
    boolean method17989(Class103 class103, int i, int i_12_) {
	int i_13_ = i;
	Class554 class554 = method17787(670010897);
	Class409 class409 = ((aClass409_11375.method7364(1965881065)
			      && !aClass409_11375.method7349(-1119189423))
			     ? aClass409_11375 : null);
	Class409_Sub1 class409_sub1
	    = ((aClass409_Sub1_11405.method7364(1975773423)
		&& (!aClass409_Sub1_11405.aBool8600 || null == class409))
	       ? aClass409_Sub1_11405 : null);
	int i_14_ = 2147359439 * class554.anInt7227;
	int i_15_ = class554.anInt7232 * -1419210819;
	if (i_14_ != 0 || i_15_ != 0 || class554.anInt7240 * -1037683113 != 0
	    || class554.anInt7202 * -1595752353 != 0)
	    i |= 0x7;
	boolean bool
	    = (aByte11413 != 0 && client.anInt8296 >= anInt11408 * 230032561
	       && client.anInt8296 < anInt11389 * 758296401);
	if (bool)
	    i |= 0x80000;
	boolean bool_16_ = false;
	if (anInt11438 * -1284882411
	    != 0) {
	    NPCDefinition class401
		= (definition.transformTo != null
		   ? definition.method7176(Class1.aClass19_11,
						Class1.aClass19_11, (byte) 49)
		   : definition);
	    if (class401 == null
		|| (client.anInt8296
		    >= (-1355192533 * class401.anInt5809
			+ (anInt11414
			   * 394609597))))
		anInt11438 = 0;
	    else {
		anInt11438
		    = ((255 - (255
			       * (client.anInt8296
				  - 394609597 * ((NPC)
						 this).anInt11414)
			       / (class401.anInt5809 * -1355192533)))
		       * -1810395331);
		bool_16_ = true;
	    }
	}
	if (bool_16_)
	    i |= 0x100;
	int i_17_ = aClass8_11406.method514((byte) -50);
	Class89 class89
	    = (aClass89Array11435[0]
	       = definition.method7145(class103, i,
					    Class79.aClass539_1138,
					    Class1.aClass19_11,
					    Class1.aClass19_11, class409,
					    class409_sub1,
					    aClass409_Sub3_Sub1Array11417,
					    anIntArray11418, i_17_,
					    aClass404_11531,
					    method17860((short) 11258), false,
					    2078209298));
	if (class89 == null)
	    return false;
	anInt11377
	    = class89.method1902() * -1315890617;
	anInt11378
	    = class89.method1901() * -414801591;
	class89.method1894();
	method17784(class89, 1801368954);
	if (i_14_ != 0 || i_15_ != 0) {
	    method17786(i_17_, i_14_, i_15_, class554.anInt7229 * -1378871453,
			class554.anInt7230 * -2120578281, 1670412300);
	    if (0 != (-195854529
		      * anInt11383))
		aClass89Array11435[0].method1870
		    (-195854529
		     * anInt11383);
	    if (anInt11384 * -192864185
		!= 0)
		aClass89Array11435[0].method1980
		    (anInt11384
		     * -192864185);
	    if (anInt11385 * -389722201
		!= 0)
		aClass89Array11435[0].method1927
		    (0, (anInt11385
			 * -389722201), 0);
	} else
	    method17786(i_17_, method17782(-411664137) << 9,
			method17782(261044004) << 9, 0, 0, -1502106693);
	if (bool)
	    class89.method1911(aByte11416, aByte11395, aByte11412,
			       aByte11413 & 0xff);
	if (bool_16_)
	    class89.method1909((byte) (-1284882411
				       * (((NPC) this)
					  .anInt11438)),
			       null);
	method17785(class103, class554, i_13_, i_14_, i_15_, i_17_,
		    -408875678);
	return true;
    }
    
    void method14493(Class103 class103, byte i) {
	if (definition != null
	    && (aBool11433
		|| method17989(class103, 0, -200044316))) {
	    Class266 class266 = class103.method2595();
	    class266.method5175(method10893());
	    class266.method5133(0.0F, -5.0F, 0.0F);
	    method17775(class103, aClass89Array11435, class266,
			aBool11433,
			-1947638283);
	    for (int i_18_ = 0; i_18_ < aClass89Array11435.length; i_18_++)
		aClass89Array11435[i_18_] = null;
	}
    }
    
    public void method17990(NPCDefinition class401, boolean bool, boolean bool_19_,
			    boolean bool_20_) {
	if (definition != class401 && Class16.aBool141
	    && Class480.method11005(-546698383 * entityIndex, -532932570))
	    Class198.method4036((byte) 4);
	definition = class401;
	if (definition != null) {
	    if (bool)
		npcName = definition.name;
	    if (bool_19_)
		combatLevel = 572907823 * definition.combatLevel;
	    if (bool_20_)
		aClass400_11529 = null;
	}
	if (aClass489_11420 != null)
	    aClass489_11420
		.method11152();
    }
    
    final void method14481(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_21_, int i_22_, boolean bool) {
	throw new IllegalStateException();
    }
    
    public void method17991(int i, int i_23_, int i_24_, boolean bool,
			    int i_25_) {
	nodePlane = aByte8745 = (byte) i;
	if (client.aClass238_8477.method4753((byte) -30)
		.method4331(i_23_, i_24_, -456982256))
	    aByte8745++;
	if (aClass409_11375.method7364(-773336151)
	    && (aClass409_11375.method7345((byte) 38).anInt7081 * 377701637
		== 1)) {
	    anIntArray11397 = null;
	    aClass409_11375.method7347(-1, 1308960518);
	}
	for (int i_26_ = 0; i_26_ < aClass244Array11404.length; i_26_++) {
	    if (aClass244Array11404[i_26_].graphicsID * 1967872619 != -1) {
		GraphicsDefinition class460
		    = (Class240.graphicsDefLoader.getGraphicsDefinition
		       (1967872619 * aClass244Array11404[i_26_].graphicsID,
			1232200923));
		if (class460.aBool6277 && -1 != class460.anInt6267 * 850723107
		    && (Class394.animationDefLoader.getAnimationDefinition
			(850723107 * class460.anInt6267, (byte) -87)
			.anInt7081) * 377701637 == 1) {
		    aClass244Array11404[i_26_].aClass409_3935
			.method7347(-1, -1532519279);
		    aClass244Array11404[i_26_].graphicsID = 1386773949;
		}
	    }
	}
	if (!bool) {
	    int i_27_ = i_23_ - scenePositionXQueue[0];
	    int i_28_ = i_24_ - scenePositionYQueue[0];
	    if (i_27_ >= -8 && i_27_ <= 8 && i_28_ >= -8 && i_28_ <= 8) {
		if (-316498507 * queuedStepCount < scenePositionXQueue.length - 1)
		    queuedStepCount += 1631398045;
		for (int i_29_ = -316498507 * queuedStepCount; i_29_ > 0; i_29_--) {
		    scenePositionXQueue[i_29_] = scenePositionXQueue[i_29_ - 1];
		    scenePositionYQueue[i_29_] = scenePositionYQueue[i_29_ - 1];
		    moveTypeQueue[i_29_] = moveTypeQueue[i_29_ - 1];
		}
		scenePositionXQueue[0] = i_23_;
		scenePositionYQueue[0] = i_24_;
		moveTypeQueue[0] = Class448.aClass448_6186.aByte6187;
		return;
	    }
	}
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = i_23_;
	scenePositionYQueue[0] = i_24_;
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) ((i_25_ << 8) + (scenePositionXQueue[0] << 9));
	class287.aFloat4479
	    = (float) ((i_25_ << 8) + (scenePositionYQueue[0] << 9));
	method10898(class287);
	class287.method5564();
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    public final boolean method17992(byte i) {
	if (definition == null)
	    return false;
	return true;
    }
    
    public int method17799(int i) {
	if (definition.transformTo != null) {
	    NPCDefinition class401
		= definition.method7176(Class1.aClass19_11,
					     Class1.aClass19_11, (byte) 11);
	    if (null != class401 && -1 != class401.anInt5834 * -285191453)
		return -285191453 * class401.anInt5834;
	}
	return -285191453 * definition.anInt5834;
    }
    
    public void method17993(int i, int i_30_, int i_31_, boolean bool,
			    int i_32_) {
	nodePlane = aByte8745 = (byte) i;
	if (client.aClass238_8477.method4753((byte) -6)
		.method4331(i_30_, i_31_, 61468103))
	    aByte8745++;
	if (aClass409_11375.method7364(1396670419)
	    && (aClass409_11375.method7345((byte) -18).anInt7081 * 377701637
		== 1)) {
	    anIntArray11397 = null;
	    aClass409_11375.method7347(-1, 1605528948);
	}
	for (int i_33_ = 0; i_33_ < aClass244Array11404.length; i_33_++) {
	    if (aClass244Array11404[i_33_].graphicsID * 1967872619 != -1) {
		GraphicsDefinition class460
		    = (Class240.graphicsDefLoader.getGraphicsDefinition
		       (1967872619 * aClass244Array11404[i_33_].graphicsID,
			1232200923));
		if (class460.aBool6277 && -1 != class460.anInt6267 * 850723107
		    && (Class394.animationDefLoader.getAnimationDefinition
			(850723107 * class460.anInt6267, (byte) -92)
			.anInt7081) * 377701637 == 1) {
		    aClass244Array11404[i_33_].aClass409_3935
			.method7347(-1, -1210439912);
		    aClass244Array11404[i_33_].graphicsID = 1386773949;
		}
	    }
	}
	if (!bool) {
	    int i_34_ = i_30_ - scenePositionXQueue[0];
	    int i_35_ = i_31_ - scenePositionYQueue[0];
	    if (i_34_ >= -8 && i_34_ <= 8 && i_35_ >= -8 && i_35_ <= 8) {
		if (-316498507 * queuedStepCount < scenePositionXQueue.length - 1)
		    queuedStepCount += 1631398045;
		for (int i_36_ = -316498507 * queuedStepCount; i_36_ > 0; i_36_--) {
		    scenePositionXQueue[i_36_] = scenePositionXQueue[i_36_ - 1];
		    scenePositionYQueue[i_36_] = scenePositionYQueue[i_36_ - 1];
		    moveTypeQueue[i_36_] = moveTypeQueue[i_36_ - 1];
		}
		scenePositionXQueue[0] = i_30_;
		scenePositionYQueue[0] = i_31_;
		moveTypeQueue[0] = Class448.aClass448_6186.aByte6187;
		return;
	    }
	}
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = i_30_;
	scenePositionYQueue[0] = i_31_;
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) ((i_32_ << 8) + (scenePositionXQueue[0] << 9));
	class287.aFloat4479
	    = (float) ((i_32_ << 8) + (scenePositionYQueue[0] << 9));
	method10898(class287);
	class287.method5564();
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    Class542 method14472(Class103 class103) {
	if (null == definition
	    || !method17989(class103, 526336, -200044316))
	    return null;
	Class266 class266 = method10893();
	Class276 class276 = method10874();
	Class266 class266_37_ = class103.method2595();
	int i = aClass8_11406.method514((byte) 61);
	Class548 class548
	    = (aClass552_8744.aClass548ArrayArrayArray7169[nodePlane]
	       [(int) class276.aClass287_4386.aFloat4477 >> 9]
	       [(int) class276.aClass287_4386.aFloat4479 >> 9]);
	if (class548 != null && null != class548.aClass475_Sub1_Sub4_7058) {
	    int i_38_ = ((-1554267337
			  * anInt11399)
			 - class548.aClass475_Sub1_Sub4_7058.aShort10742);
	    anInt11399
		= (int) ((float) (-1554267337
				  * (((NPC) this)
				     .anInt11399))
			 - (float) i_38_ / 10.0F) * 665281159;
	} else
	    anInt11399
		= (665281159
		   * (int) ((float) ((((NPC) this)
				      .anInt11399)
				     * -1554267337)
			    - (float) (-1554267337
				       * (((NPC) this)
					  .anInt11399)) / 10.0F));
	class266_37_.method5175(class266);
	class266_37_.method5133(0.0F,
				(float) (-20
					 - (-1554267337
					    * ((NPC)
					       this).anInt11399)),
				0.0F);
	Class554 class554 = method17787(1836385911);
	NPCDefinition class401
	    = (definition.transformTo != null
	       ? definition.method7176(Class1.aClass19_11,
					    Class1.aClass19_11, (byte) 94)
	       : definition);
	boolean bool = class401.aClass272_5846 != null;
	aBool11432 = false;
	Class542 class542 = null;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		.method14854(729712881) == 1
	    && class401.aBool5831 && class554.aBool7246) {
	    Class409 class409 = ((aClass409_11375.method7364(86474972)
				  && aClass409_11375.method7349(188118641))
				 ? aClass409_11375 : null);
	    Class409_Sub1 class409_sub1
		= ((aClass409_Sub1_11405.method7364(-1382642314)
		    && (!aClass409_Sub1_11405.aBool8600 || null == class409))
		   ? aClass409_Sub1_11405 : null);
	    short i_39_ = Class128.aClass513_1589.aShort6719;
	    byte i_40_ = Class128.aClass513_1589.aByte6713;
	    if (definition.aShort5806 > -1) {
		i_39_ = definition.aShort5806;
		i_40_ = definition.aByte5847;
	    }
	    Class89 class89;
	    if (i_39_ > -1
		&& Class241_Sub5_Sub9.aClass241_Sub9_11043
		       .aClass445_Sub33_8890.method14529(-485668821) == 1)
		class89 = (Class520.method11694
			   (class103, i,
			    -195854529 * (((NPC) this)
					  .anInt11383),
			    -192864185 * (((NPC) this)
					  .anInt11384),
			    (anInt11385
			     * -389722201),
			    aClass89Array11435[0], i_39_, i_40_,
			    (null != class409_sub1 ? (Class409) class409_sub1
			     : class409),
			    -249992343));
	    else
		class89 = (Class477.method10920
			   (class103, i,
			    (anInt11383
			     * -195854529),
			    -192864185 * (((NPC) this)
					  .anInt11384),
			    -389722201 * (((NPC) this)
					  .anInt11385),
			    definition.size * 19489015,
			    aClass89Array11435[0],
			    definition.aShort5844 & 0xffff,
			    definition.aShort5843 & 0xffff,
			    definition.aByte5861 & 0xff,
			    definition.aByte5845 & 0xff,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    1256039881));
	    if (null != class89) {
		class542 = Class128.method3016(method18000(-1911110461),
					       -2144523380);
		aBool11432 = true;
		class103.method2308(false);
		if (bool)
		    class89.method1890(class266_37_, null, 0);
		else {
		    if (aClass97Array8748 == null
			|| (aClass97Array8748.length
			    < aClass89Array11435.length + 1))
			method14465(aClass89Array11435.length + 1, 384113371);
		    class89.method1890(class266_37_,
				       (aClass97Array8748
					[aClass89Array11435.length]),
				       0);
		}
		class103.method2308(true);
	    }
	}
	if (bool) {
	    if (aClass97Array8748 == null || aClass97Array8748.length > 1)
		method14465(1, 599766539);
	    class103.method2282(class266_37_, aClass97Array8748[0],
				class401.aClass272_5846);
	} else if (null == aClass97Array8748
		   || aClass97Array8748.length < aClass89Array11435.length)
	    method14465(aClass89Array11435.length, 1556805479);
	if (null == class542)
	    class542
		= Class128.method3016(method18000(147487481), -2066240624);
	method17775(class103, aClass89Array11435, class266_37_, false,
		    -1947638283);
	for (int i_41_ = 0; i_41_ < aClass89Array11435.length; i_41_++) {
	    if (aClass89Array11435[i_41_] != null) {
		if (definition.aBool5853)
		    aClass89Array11435[i_41_].method1911
			((anInt11532
			  * 124635235),
			 (anInt11533
			  * -127947159),
			 (-1695568079
			  * anInt11526),
			 (1207275961
			  * anInt11535));
		if (bool)
		    aClass89Array11435[i_41_].method1890(class266_37_, null,
							 0);
		else
		    aClass89Array11435[i_41_]
			.method1890(class266_37_, aClass97Array8748[i_41_], 0);
	    } else if (!bool)
		aClass97Array8748[i_41_].aBool1352 = false;
	}
	if (aClass489_11420 != null) {
	    Class98 class98 = ((NPC) this)
				  .aClass489_11420.method11164();
	    class103.method2305(class98);
	}
	for (int i_42_ = 0; i_42_ < aClass89Array11435.length; i_42_++) {
	    if (null != aClass89Array11435[i_42_])
		aBool11432
		    |= aClass89Array11435[i_42_].method2052();
	    aClass89Array11435[i_42_] = null;
	}
	anInt11376 = -96196995 * client.anInt8407;
	return class542;
    }
    
    int method14447(byte i) {
	if (null == definition)
	    return 0;
	return -785615381 * definition.anInt5868;
    }
    
    boolean method14448(Class103 class103, int i, int i_43_, int i_44_) {
	if (definition == null)
	    return false;
	if (null != definition.aClass272_5846)
	    return class103.method2280(i, i_43_, method10893(),
				       definition.aClass272_5846,
				       (byte) -65);
	if (!method17989(class103, 131072, -200044316))
	    return false;
	Class266 class266 = method10893();
	boolean bool = false;
	for (int i_45_ = 0; i_45_ < aClass89Array11435.length; i_45_++) {
	    if (aClass89Array11435[i_45_] != null) {
		boolean bool_46_;
	    while_111_:
		do {
		    do {
			if (-785615381 * definition.anInt5868 <= 0) {
			    if (-1
				== -1569132395 * definition.anInt5827) {
				if (19489015 * definition.size != 1)
				    break;
			    } else if (1 != (-1569132395
					     * definition.anInt5827))
				break;
			}
			bool_46_ = true;
			break while_111_;
		    } while (false);
		    bool_46_ = false;
		} while (false);
		boolean bool_47_ = bool_46_;
		boolean bool_48_
		    = aClass89Array11435[i_45_].method1891(i, i_43_, class266,
							   bool_47_,
							   (-785615381
							    * (definition
							       .anInt5868)));
		if (bool_48_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_49_ = 0; i_49_ < aClass89Array11435.length; i_49_++)
	    aClass89Array11435[i_49_] = null;
	return bool;
    }
    
    final boolean method14450(int i) {
	return false;
    }
    
    public void method17994(int plane, int xPos, int yPos, boolean bool, int i_52_, int i_53_) {
	nodePlane = aByte8745 = (byte) plane;
	if (client.aClass238_8477.method4753((byte) -15)
		.method4331(xPos, yPos, -668485677))
	    aByte8745++;
	if (aClass409_11375.method7364(-1826419146)
	    && (aClass409_11375.method7345((byte) 50).anInt7081 * 377701637
		== 1)) {
	    anIntArray11397 = null;
	    aClass409_11375.method7347(-1, 557181336);
	}
	for (int i_54_ = 0; i_54_ < aClass244Array11404.length; i_54_++) {
	    if (aClass244Array11404[i_54_].graphicsID * 1967872619 != -1) {
		GraphicsDefinition class460
		    = (Class240.graphicsDefLoader.getGraphicsDefinition
		       (1967872619 * aClass244Array11404[i_54_].graphicsID,
			1232200923));
		if (class460.aBool6277 && -1 != class460.anInt6267 * 850723107
		    && ((Class394.animationDefLoader.getAnimationDefinition
			 (850723107 * class460.anInt6267, (byte) -3).anInt7081)
			* 377701637) == 1) {
		    aClass244Array11404[i_54_].aClass409_3935
			.method7347(-1, 170124611);
		    aClass244Array11404[i_54_].graphicsID = 1386773949;
		}
	    }
	}
	if (!bool) {
	    int i_55_ = xPos - scenePositionXQueue[0];
	    int i_56_ = yPos - scenePositionYQueue[0];
	    if (i_55_ >= -8 && i_55_ <= 8 && i_56_ >= -8 && i_56_ <= 8) {
		if (-316498507 * queuedStepCount < scenePositionXQueue.length - 1)
		    queuedStepCount += 1631398045;
		for (int i_57_ = -316498507 * queuedStepCount; i_57_ > 0; i_57_--) {
		    scenePositionXQueue[i_57_] = scenePositionXQueue[i_57_ - 1];
		    scenePositionYQueue[i_57_] = scenePositionYQueue[i_57_ - 1];
		    moveTypeQueue[i_57_] = moveTypeQueue[i_57_ - 1];
		}
		scenePositionXQueue[0] = xPos;
		scenePositionYQueue[0] = yPos;
		moveTypeQueue[0] = Class448.aClass448_6186.aByte6187;
		return;
	    }
	}
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = xPos;
	scenePositionYQueue[0] = yPos;
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) ((i_52_ << 8) + (scenePositionXQueue[0] << 9));
	class287.aFloat4479
	    = (float) ((i_52_ << 8) + (scenePositionYQueue[0] << 9));
	method10898(class287);
	class287.method5564();
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    public int method17865() {
	return -546698383 * entityIndex + 1;
    }
    
    int method17844() {
	if (-1 != anInt11530 * -1587321757)
	    return anInt11530 * -1587321757;
	if (null != definition.transformTo) {
	    NPCDefinition class401
		= definition.method7176(Class1.aClass19_11,
					     Class1.aClass19_11, (byte) 77);
	    if (class401 != null && -1 != class401.renderEmote * 1952014657)
		return 1952014657 * class401.renderEmote;
	}
	return definition.renderEmote * 1952014657;
    }
    
    public int method17995(int i, int i_58_) {
	return anIntArray11534[i];
    }
    
    public void method17996(int i, int i_59_, int i_60_, int i_61_) {
	anIntArray11523[i] = i_59_;
	anIntArray11534[i] = i_60_;
    }
    
    public Class249 method17816() {
	if (aClass249_11387 != null
	    && ((Class249) (((NPC) this)
			    .aClass249_11387)).aString3993 == null)
	    return null;
	return aClass249_11387;
    }
    
    public Class249 method17792(int i) {
	if (aClass249_11387 != null
	    && ((Class249) (((NPC) this)
			    .aClass249_11387)).aString3993 == null)
	    return null;
	return aClass249_11387;
    }
    
    public void method17997(String string, int i, int i_62_, short i_63_) {
	int i_64_ = (Class70.method1725(-1722494532)
		     * (Class128.aClass513_1589.npcChatTimeout * -478642913));
	method17769(string, i, i_62_, i_64_, 315620437);
    }
    
    boolean method17998() {
	return definition.aBool5839;
    }
    
    final boolean method14477() {
	return false;
    }
    
    public Class67 method7() {
	return Class67.aClass67_1052;
    }
    
    public Class241_Sub16 method3(int i) {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	return Class2.method459(nodePlane,
				((int) method10874().aClass287_4386.aFloat4477
				 + class522.baseX * 947401216),
				-(int) method10874().aClass287_4386.aFloat4474,
				((int) method10874().aClass287_4386.aFloat4479
				 + class522.baseY * -616117760),
				(byte) 27);
    }
    
    public Class278 method13(int i) {
	Class278 class278 = Class278.method5414();
	class278.method5395(Class282.method5490(-267726731
						* aClass8_11406.anInt44),
			    0.0F, 0.0F);
	return class278;
    }
    
    public Class287 method5(byte i) {
	return Class287.method5560();
    }
    
    public boolean method14461(int i) {
	if (definition.transformTo != null
	    && (definition.method7176(Class1.aClass19_11,
					   Class1.aClass19_11, (byte) 114)
		== null))
	    return false;
	return true;
    }
    
    public Class67 method6() {
	return Class67.aClass67_1052;
    }
    
    public final boolean method17999() {
	if (definition == null)
	    return false;
	return true;
    }
    
    public NPC(Class552 class552) {
	super(class552, Class333.VAR_NPC_LIST);
	anIntArray11523 = new int[6];
	anIntArray11534 = new int[6];
	method17986(-1302588695);
    }
    
    public int method9() {
	return -546698383 * entityIndex;
    }
    
    public Class67 method8() {
	return Class67.aClass67_1052;
    }
    
    public int method11() {
	return -546698383 * entityIndex;
    }
    
    public Class241_Sub16 method12() {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	return Class2.method459(nodePlane,
				((int) method10874().aClass287_4386.aFloat4477
				 + class522.baseX * 947401216),
				-(int) method10874().aClass287_4386.aFloat4474,
				((int) method10874().aClass287_4386.aFloat4479
				 + class522.baseY * -616117760),
				(byte) 41);
    }
    
    public Class241_Sub16 method4() {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	return Class2.method459(nodePlane,
				((int) method10874().aClass287_4386.aFloat4477
				 + class522.baseX * 947401216),
				-(int) method10874().aClass287_4386.aFloat4474,
				((int) method10874().aClass287_4386.aFloat4479
				 + class522.baseY * -616117760),
				(byte) 123);
    }
    
    public boolean method17802() {
	return Class128.aClass513_1589.npcShouldDisplayChat;
    }
    
    public Class278 method15() {
	Class278 class278 = Class278.method5414();
	class278.method5395(Class282.method5490(-267726731
						* aClass8_11406.anInt44),
			    0.0F, 0.0F);
	return class278;
    }
    
    public NPC(Class552 class552, int i) {
	super(class552, i, Class333.VAR_NPC_LIST);
	anIntArray11523 = new int[6];
	anIntArray11534 = new int[6];
	method17986(-754630465);
    }
    
    public Class278 method1() {
	Class278 class278 = Class278.method5414();
	class278.method5395(Class282.method5490(-267726731
						* aClass8_11406.anInt44),
			    0.0F, 0.0F);
	return class278;
    }
    
    public Class287 method18() {
	return Class287.method5560();
    }
    
    public Class287 method19() {
	return Class287.method5560();
    }
    
    public Class241_Sub16 method17() {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	return Class2.method459(nodePlane,
				((int) method10874().aClass287_4386.aFloat4477
				 + class522.baseX * 947401216),
				-(int) method10874().aClass287_4386.aFloat4474,
				((int) method10874().aClass287_4386.aFloat4479
				 + class522.baseY * -616117760),
				(byte) 90);
    }
    
    boolean method18000(int i) {
	return definition.aBool5839;
    }
    
    public boolean method17853(short i) {
	return Class128.aClass513_1589.npcShouldDisplayChat;
    }
    
    Class542 method14473(Class103 class103) {
	if (null == definition
	    || !method17989(class103, 526336, -200044316))
	    return null;
	Class266 class266 = method10893();
	Class276 class276 = method10874();
	Class266 class266_65_ = class103.method2595();
	int i = aClass8_11406.method514((byte) -53);
	Class548 class548
	    = (aClass552_8744.aClass548ArrayArrayArray7169[nodePlane]
	       [(int) class276.aClass287_4386.aFloat4477 >> 9]
	       [(int) class276.aClass287_4386.aFloat4479 >> 9]);
	if (class548 != null && null != class548.aClass475_Sub1_Sub4_7058) {
	    int i_66_ = ((-1554267337
			  * anInt11399)
			 - class548.aClass475_Sub1_Sub4_7058.aShort10742);
	    anInt11399
		= (int) ((float) (-1554267337
				  * (((NPC) this)
				     .anInt11399))
			 - (float) i_66_ / 10.0F) * 665281159;
	} else
	    anInt11399
		= (665281159
		   * (int) ((float) ((((NPC) this)
				      .anInt11399)
				     * -1554267337)
			    - (float) (-1554267337
				       * (((NPC) this)
					  .anInt11399)) / 10.0F));
	class266_65_.method5175(class266);
	class266_65_.method5133(0.0F,
				(float) (-20
					 - (-1554267337
					    * ((NPC)
					       this).anInt11399)),
				0.0F);
	Class554 class554 = method17787(-297712801);
	NPCDefinition class401
	    = (definition.transformTo != null
	       ? definition.method7176(Class1.aClass19_11,
					    Class1.aClass19_11, (byte) 26)
	       : definition);
	boolean bool = class401.aClass272_5846 != null;
	aBool11432 = false;
	Class542 class542 = null;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		.method14854(-1613316404) == 1
	    && class401.aBool5831 && class554.aBool7246) {
	    Class409 class409 = ((aClass409_11375.method7364(-1901652366)
				  && aClass409_11375.method7349(-956764288))
				 ? aClass409_11375 : null);
	    Class409_Sub1 class409_sub1
		= ((aClass409_Sub1_11405.method7364(1662785602)
		    && (!aClass409_Sub1_11405.aBool8600 || null == class409))
		   ? aClass409_Sub1_11405 : null);
	    short i_67_ = Class128.aClass513_1589.aShort6719;
	    byte i_68_ = Class128.aClass513_1589.aByte6713;
	    if (definition.aShort5806 > -1) {
		i_67_ = definition.aShort5806;
		i_68_ = definition.aByte5847;
	    }
	    Class89 class89;
	    if (i_67_ > -1
		&& Class241_Sub5_Sub9.aClass241_Sub9_11043
		       .aClass445_Sub33_8890.method14529(-485668821) == 1)
		class89 = (Class520.method11694
			   (class103, i,
			    -195854529 * (((NPC) this)
					  .anInt11383),
			    -192864185 * (((NPC) this)
					  .anInt11384),
			    (anInt11385
			     * -389722201),
			    aClass89Array11435[0], i_67_, i_68_,
			    (null != class409_sub1 ? (Class409) class409_sub1
			     : class409),
			    -207430977));
	    else
		class89 = (Class477.method10920
			   (class103, i,
			    (anInt11383
			     * -195854529),
			    -192864185 * (((NPC) this)
					  .anInt11384),
			    -389722201 * (((NPC) this)
					  .anInt11385),
			    definition.size * 19489015,
			    aClass89Array11435[0],
			    definition.aShort5844 & 0xffff,
			    definition.aShort5843 & 0xffff,
			    definition.aByte5861 & 0xff,
			    definition.aByte5845 & 0xff,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    -1868992633));
	    if (null != class89) {
		class542 = Class128.method3016(method18000(-572244607),
					       -2134593625);
		aBool11432 = true;
		class103.method2308(false);
		if (bool)
		    class89.method1890(class266_65_, null, 0);
		else {
		    if (aClass97Array8748 == null
			|| (aClass97Array8748.length
			    < aClass89Array11435.length + 1))
			method14465(aClass89Array11435.length + 1, 891237759);
		    class89.method1890(class266_65_,
				       (aClass97Array8748
					[aClass89Array11435.length]),
				       0);
		}
		class103.method2308(true);
	    }
	}
	if (bool) {
	    if (aClass97Array8748 == null || aClass97Array8748.length > 1)
		method14465(1, 463026552);
	    class103.method2282(class266_65_, aClass97Array8748[0],
				class401.aClass272_5846);
	} else if (null == aClass97Array8748
		   || aClass97Array8748.length < aClass89Array11435.length)
	    method14465(aClass89Array11435.length, 1092592966);
	if (null == class542)
	    class542
		= Class128.method3016(method18000(558645925), -2114841753);
	method17775(class103, aClass89Array11435, class266_65_, false,
		    -1947638283);
	for (int i_69_ = 0; i_69_ < aClass89Array11435.length; i_69_++) {
	    if (aClass89Array11435[i_69_] != null) {
		if (definition.aBool5853)
		    aClass89Array11435[i_69_].method1911
			((anInt11532
			  * 124635235),
			 (anInt11533
			  * -127947159),
			 (-1695568079
			  * anInt11526),
			 (1207275961
			  * anInt11535));
		if (bool)
		    aClass89Array11435[i_69_].method1890(class266_65_, null,
							 0);
		else
		    aClass89Array11435[i_69_]
			.method1890(class266_65_, aClass97Array8748[i_69_], 0);
	    } else if (!bool)
		aClass97Array8748[i_69_].aBool1352 = false;
	}
	if (aClass489_11420 != null) {
	    Class98 class98 = ((NPC) this)
				  .aClass489_11420.method11164();
	    class103.method2305(class98);
	}
	for (int i_70_ = 0; i_70_ < aClass89Array11435.length; i_70_++) {
	    if (null != aClass89Array11435[i_70_])
		aBool11432
		    |= aClass89Array11435[i_70_].method2052();
	    aClass89Array11435[i_70_] = null;
	}
	anInt11376 = -96196995 * client.anInt8407;
	return class542;
    }
    
    boolean method18001(Class103 class103, int i) {
	int i_71_ = i;
	Class554 class554 = method17787(1859472898);
	Class409 class409 = ((aClass409_11375.method7364(-874615596)
			      && !aClass409_11375.method7349(-1280076637))
			     ? aClass409_11375 : null);
	Class409_Sub1 class409_sub1
	    = ((aClass409_Sub1_11405.method7364(-1689685885)
		&& (!aClass409_Sub1_11405.aBool8600 || null == class409))
	       ? aClass409_Sub1_11405 : null);
	int i_72_ = 2147359439 * class554.anInt7227;
	int i_73_ = class554.anInt7232 * -1419210819;
	if (i_72_ != 0 || i_73_ != 0 || class554.anInt7240 * -1037683113 != 0
	    || class554.anInt7202 * -1595752353 != 0)
	    i |= 0x7;
	boolean bool
	    = (aByte11413 != 0 && client.anInt8296 >= anInt11408 * 230032561
	       && client.anInt8296 < anInt11389 * 758296401);
	if (bool)
	    i |= 0x80000;
	boolean bool_74_ = false;
	if (anInt11438 * -1284882411
	    != 0) {
	    NPCDefinition class401
		= (definition.transformTo != null
		   ? definition.method7176(Class1.aClass19_11,
						Class1.aClass19_11, (byte) 119)
		   : definition);
	    if (class401 == null
		|| (client.anInt8296
		    >= (-1355192533 * class401.anInt5809
			+ (anInt11414
			   * 394609597))))
		anInt11438 = 0;
	    else {
		anInt11438
		    = ((255 - (255
			       * (client.anInt8296
				  - 394609597 * ((NPC)
						 this).anInt11414)
			       / (class401.anInt5809 * -1355192533)))
		       * -1810395331);
		bool_74_ = true;
	    }
	}
	if (bool_74_)
	    i |= 0x100;
	int i_75_ = aClass8_11406.method514((byte) -11);
	Class89 class89
	    = (aClass89Array11435[0]
	       = definition.method7145(class103, i,
					    Class79.aClass539_1138,
					    Class1.aClass19_11,
					    Class1.aClass19_11, class409,
					    class409_sub1,
					    aClass409_Sub3_Sub1Array11417,
					    anIntArray11418, i_75_,
					    aClass404_11531,
					    method17860((short) 11933), false,
					    1847121689));
	if (class89 == null)
	    return false;
	anInt11377
	    = class89.method1902() * -1315890617;
	anInt11378
	    = class89.method1901() * -414801591;
	class89.method1894();
	method17784(class89, -2015813010);
	if (i_72_ != 0 || i_73_ != 0) {
	    method17786(i_75_, i_72_, i_73_, class554.anInt7229 * -1378871453,
			class554.anInt7230 * -2120578281, 2088073990);
	    if (0 != (-195854529
		      * anInt11383))
		aClass89Array11435[0].method1870
		    (-195854529
		     * anInt11383);
	    if (anInt11384 * -192864185
		!= 0)
		aClass89Array11435[0].method1980
		    (anInt11384
		     * -192864185);
	    if (anInt11385 * -389722201
		!= 0)
		aClass89Array11435[0].method1927
		    (0, (anInt11385
			 * -389722201), 0);
	} else
	    method17786(i_75_, method17782(-693675200) << 9,
			method17782(1840422921) << 9, 0, 0, -1402987453);
	if (bool)
	    class89.method1911(aByte11416, aByte11395, aByte11412,
			       aByte11413 & 0xff);
	if (bool_74_)
	    class89.method1909((byte) (-1284882411
				       * (((NPC) this)
					  .anInt11438)),
			       null);
	method17785(class103, class554, i_71_, i_72_, i_73_, i_75_,
		    2042297371);
	return true;
    }
    
    final void method14483() {
	throw new IllegalStateException();
    }
    
    void method14476(Class103 class103) {
	if (definition != null
	    && (aBool11433
		|| method17989(class103, 0, -200044316))) {
	    Class266 class266 = class103.method2595();
	    class266.method5175(method10893());
	    class266.method5133(0.0F, -5.0F, 0.0F);
	    method17775(class103, aClass89Array11435, class266,
			aBool11433,
			-1947638283);
	    for (int i = 0; i < aClass89Array11435.length; i++)
		aClass89Array11435[i] = null;
	}
    }
    
    public void method18002(int i) {
	anInt11438 = -2089308733;
	anInt11414
	    = 101552021 * client.anInt8296;
    }
    
    public boolean method14494() {
	if (definition.transformTo != null
	    && (definition.method7176(Class1.aClass19_11,
					   Class1.aClass19_11, (byte) 58)
		== null))
	    return false;
	return true;
    }
    
    final boolean method14479() {
	return false;
    }
    
    final void method14480(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_76_, int i_77_, boolean bool) {
	throw new IllegalStateException();
    }
    
    public void method18003(NPCDefinition class401, boolean bool, boolean bool_78_,
			    boolean bool_79_) {
	if (definition != class401 && Class16.aBool141
	    && Class480.method11005(-546698383 * entityIndex, -779995713))
	    Class198.method4036((byte) 4);
	definition = class401;
	if (definition != null) {
	    if (bool)
		npcName = definition.name;
	    if (bool_78_)
		combatLevel = 572907823 * definition.combatLevel;
	    if (bool_79_)
		aClass400_11529 = null;
	}
	if (aClass489_11420 != null)
	    aClass489_11420
		.method11152();
    }
    
    final void method14482(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_80_, int i_81_, boolean bool) {
	throw new IllegalStateException();
    }
    
    int method17845() {
	if (-1 != anInt11530 * -1587321757)
	    return anInt11530 * -1587321757;
	if (null != definition.transformTo) {
	    NPCDefinition class401
		= definition.method7176(Class1.aClass19_11,
					     Class1.aClass19_11, (byte) 66);
	    if (class401 != null && -1 != class401.renderEmote * 1952014657)
		return 1952014657 * class401.renderEmote;
	}
	return definition.renderEmote * 1952014657;
    }
    
    final void method14478() {
	throw new IllegalStateException();
    }
    
    int method17843() {
	if (-1 != anInt11530 * -1587321757)
	    return anInt11530 * -1587321757;
	if (null != definition.transformTo) {
	    NPCDefinition class401
		= definition.method7176(Class1.aClass19_11,
					     Class1.aClass19_11, (byte) 105);
	    if (class401 != null && -1 != class401.renderEmote * 1952014657)
		return 1952014657 * class401.renderEmote;
	}
	return definition.renderEmote * 1952014657;
    }
    
    final boolean method14456() {
	return false;
    }
    
    Class542 method14474(Class103 class103) {
	if (null == definition
	    || !method17989(class103, 526336, -200044316))
	    return null;
	Class266 class266 = method10893();
	Class276 class276 = method10874();
	Class266 class266_82_ = class103.method2595();
	int i = aClass8_11406.method514((byte) -113);
	Class548 class548
	    = (aClass552_8744.aClass548ArrayArrayArray7169[nodePlane]
	       [(int) class276.aClass287_4386.aFloat4477 >> 9]
	       [(int) class276.aClass287_4386.aFloat4479 >> 9]);
	if (class548 != null && null != class548.aClass475_Sub1_Sub4_7058) {
	    int i_83_ = ((-1554267337
			  * anInt11399)
			 - class548.aClass475_Sub1_Sub4_7058.aShort10742);
	    anInt11399
		= (int) ((float) (-1554267337
				  * (((NPC) this)
				     .anInt11399))
			 - (float) i_83_ / 10.0F) * 665281159;
	} else
	    anInt11399
		= (665281159
		   * (int) ((float) ((((NPC) this)
				      .anInt11399)
				     * -1554267337)
			    - (float) (-1554267337
				       * (((NPC) this)
					  .anInt11399)) / 10.0F));
	class266_82_.method5175(class266);
	class266_82_.method5133(0.0F,
				(float) (-20
					 - (-1554267337
					    * ((NPC)
					       this).anInt11399)),
				0.0F);
	Class554 class554 = method17787(1942930688);
	NPCDefinition class401
	    = (definition.transformTo != null
	       ? definition.method7176(Class1.aClass19_11,
					    Class1.aClass19_11, (byte) 54)
	       : definition);
	boolean bool = class401.aClass272_5846 != null;
	aBool11432 = false;
	Class542 class542 = null;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		.method14854(-622704103) == 1
	    && class401.aBool5831 && class554.aBool7246) {
	    Class409 class409 = ((aClass409_11375.method7364(-1881586586)
				  && aClass409_11375.method7349(-1193231413))
				 ? aClass409_11375 : null);
	    Class409_Sub1 class409_sub1
		= ((aClass409_Sub1_11405.method7364(1599417184)
		    && (!aClass409_Sub1_11405.aBool8600 || null == class409))
		   ? aClass409_Sub1_11405 : null);
	    short i_84_ = Class128.aClass513_1589.aShort6719;
	    byte i_85_ = Class128.aClass513_1589.aByte6713;
	    if (definition.aShort5806 > -1) {
		i_84_ = definition.aShort5806;
		i_85_ = definition.aByte5847;
	    }
	    Class89 class89;
	    if (i_84_ > -1
		&& Class241_Sub5_Sub9.aClass241_Sub9_11043
		       .aClass445_Sub33_8890.method14529(-485668821) == 1)
		class89 = (Class520.method11694
			   (class103, i,
			    -195854529 * (((NPC) this)
					  .anInt11383),
			    -192864185 * (((NPC) this)
					  .anInt11384),
			    (anInt11385
			     * -389722201),
			    aClass89Array11435[0], i_84_, i_85_,
			    (null != class409_sub1 ? (Class409) class409_sub1
			     : class409),
			    471431470));
	    else
		class89 = (Class477.method10920
			   (class103, i,
			    (anInt11383
			     * -195854529),
			    -192864185 * (((NPC) this)
					  .anInt11384),
			    -389722201 * (((NPC) this)
					  .anInt11385),
			    definition.size * 19489015,
			    aClass89Array11435[0],
			    definition.aShort5844 & 0xffff,
			    definition.aShort5843 & 0xffff,
			    definition.aByte5861 & 0xff,
			    definition.aByte5845 & 0xff,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    1952018997));
	    if (null != class89) {
		class542 = Class128.method3016(method18000(-164737618),
					       -2131008375);
		aBool11432 = true;
		class103.method2308(false);
		if (bool)
		    class89.method1890(class266_82_, null, 0);
		else {
		    if (aClass97Array8748 == null
			|| (aClass97Array8748.length
			    < aClass89Array11435.length + 1))
			method14465(aClass89Array11435.length + 1, 1765513814);
		    class89.method1890(class266_82_,
				       (aClass97Array8748
					[aClass89Array11435.length]),
				       0);
		}
		class103.method2308(true);
	    }
	}
	if (bool) {
	    if (aClass97Array8748 == null || aClass97Array8748.length > 1)
		method14465(1, 2123207492);
	    class103.method2282(class266_82_, aClass97Array8748[0],
				class401.aClass272_5846);
	} else if (null == aClass97Array8748
		   || aClass97Array8748.length < aClass89Array11435.length)
	    method14465(aClass89Array11435.length, 1723915707);
	if (null == class542)
	    class542
		= Class128.method3016(method18000(-951441437), -2076931770);
	method17775(class103, aClass89Array11435, class266_82_, false,
		    -1947638283);
	for (int i_86_ = 0; i_86_ < aClass89Array11435.length; i_86_++) {
	    if (aClass89Array11435[i_86_] != null) {
		if (definition.aBool5853)
		    aClass89Array11435[i_86_].method1911
			((anInt11532
			  * 124635235),
			 (anInt11533
			  * -127947159),
			 (-1695568079
			  * anInt11526),
			 (1207275961
			  * anInt11535));
		if (bool)
		    aClass89Array11435[i_86_].method1890(class266_82_, null,
							 0);
		else
		    aClass89Array11435[i_86_]
			.method1890(class266_82_, aClass97Array8748[i_86_], 0);
	    } else if (!bool)
		aClass97Array8748[i_86_].aBool1352 = false;
	}
	if (aClass489_11420 != null) {
	    Class98 class98 = ((NPC) this)
				  .aClass489_11420.method11164();
	    class103.method2305(class98);
	}
	for (int i_87_ = 0; i_87_ < aClass89Array11435.length; i_87_++) {
	    if (null != aClass89Array11435[i_87_])
		aBool11432
		    |= aClass89Array11435[i_87_].method2052();
	    aClass89Array11435[i_87_] = null;
	}
	anInt11376 = -96196995 * client.anInt8407;
	return class542;
    }
    
    public boolean method17800() {
	return Class128.aClass513_1589.npcShouldDisplayChat;
    }
    
    public boolean method17770() {
	return Class128.aClass513_1589.npcShouldDisplayChat;
    }
    
    public final boolean method18004() {
	if (definition == null)
	    return false;
	return true;
    }
    
    boolean method18005() {
	return definition.aBool5839;
    }
    
    int method14485() {
	if (null == definition)
	    return 0;
	return -785615381 * definition.anInt5868;
    }
    
    int method14491() {
	if (null == definition)
	    return 0;
	return -785615381 * definition.anInt5868;
    }
    
    int method14487() {
	if (null == definition)
	    return 0;
	return -785615381 * definition.anInt5868;
    }
    
    public Class278 method16() {
	Class278 class278 = Class278.method5414();
	class278.method5395(Class282.method5490(-267726731
						* aClass8_11406.anInt44),
			    0.0F, 0.0F);
	return class278;
    }
    
    public final void method18006(Class439 class439, int i, int i_88_) {
	int i_89_ = scenePositionXQueue[0];
	int i_90_ = scenePositionYQueue[0];
	switch (class439.anInt6146 * 1591010161) {
	case 6:
	    i_89_--;
	    i_90_--;
	    break;
	case 3:
	    i_89_++;
	    break;
	case 2:
	    i_89_--;
	    i_90_++;
	    break;
	case 1:
	    i_89_++;
	    i_90_++;
	    break;
	case 5:
	    i_89_--;
	    break;
	case 4:
	    i_90_++;
	    break;
	case 0:
	    i_90_--;
	    break;
	case 7:
	    i_89_++;
	    i_90_--;
	    break;
	}
	if (aClass409_11375.method7364(-1969822390)
	    && (aClass409_11375.method7345((byte) 53).anInt7081 * 377701637
		== 1)) {
	    anIntArray11397 = null;
	    aClass409_11375.method7347(-1, 1736422961);
	}
	for (int i_91_ = 0; i_91_ < aClass244Array11404.length; i_91_++) {
	    if (1967872619 * aClass244Array11404[i_91_].graphicsID != -1) {
		GraphicsDefinition class460
		    = (Class240.graphicsDefLoader.getGraphicsDefinition
		       (1967872619 * aClass244Array11404[i_91_].graphicsID,
			1232200923));
		if (class460.aBool6277 && -1 != 850723107 * class460.anInt6267
		    && (Class394.animationDefLoader.getAnimationDefinition
			(class460.anInt6267 * 850723107, (byte) -112)
			.anInt7081) * 377701637 == 1) {
		    aClass244Array11404[i_91_].aClass409_3935
			.method7347(-1, -106574008);
		    aClass244Array11404[i_91_].graphicsID = 1386773949;
		}
	    }
	}
	if (queuedStepCount * -316498507 < scenePositionXQueue.length - 1)
	    queuedStepCount += 1631398045;
	for (int i_92_ = queuedStepCount * -316498507; i_92_ > 0; i_92_--) {
	    scenePositionXQueue[i_92_] = scenePositionXQueue[i_92_ - 1];
	    scenePositionYQueue[i_92_] = scenePositionYQueue[i_92_ - 1];
	    moveTypeQueue[i_92_] = moveTypeQueue[i_92_ - 1];
	}
	scenePositionXQueue[0] = i_89_;
	scenePositionYQueue[0] = i_90_;
	moveTypeQueue[0] = (byte) i;
    }
    
    public Class249 method17868() {
	if (aClass249_11387 != null
	    && ((Class249) (((NPC) this)
			    .aClass249_11387)).aString3993 == null)
	    return null;
	return aClass249_11387;
    }
    
    boolean method14488(Class103 class103, int i, int i_93_) {
	if (definition == null)
	    return false;
	if (null != definition.aClass272_5846)
	    return class103.method2280(i, i_93_, method10893(),
				       definition.aClass272_5846,
				       (byte) 87);
	if (!method17989(class103, 131072, -200044316))
	    return false;
	Class266 class266 = method10893();
	boolean bool = false;
	for (int i_94_ = 0; i_94_ < aClass89Array11435.length; i_94_++) {
	    if (aClass89Array11435[i_94_] != null) {
		boolean bool_95_;
	    while_112_:
		do {
		    do {
			if (-785615381 * definition.anInt5868 <= 0) {
			    if (-1
				== -1569132395 * definition.anInt5827) {
				if (19489015 * definition.size != 1)
				    break;
			    } else if (1 != (-1569132395
					     * definition.anInt5827))
				break;
			}
			bool_95_ = true;
			break while_112_;
		    } while (false);
		    bool_95_ = false;
		} while (false);
		boolean bool_96_ = bool_95_;
		boolean bool_97_
		    = aClass89Array11435[i_94_].method1891(i, i_93_, class266,
							   bool_96_,
							   (-785615381
							    * (definition
							       .anInt5868)));
		if (bool_97_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_98_ = 0; i_98_ < aClass89Array11435.length; i_98_++)
	    aClass89Array11435[i_98_] = null;
	return bool;
    }
    
    void method18007() {
	anInt11532
	    = (32 + (int) (Math.random() * 4.0)) * -1313146549;
	anInt11533
	    = (3 + (int) (Math.random() * 2.0)) * -198655527;
	anInt11526
	    = (16 + (int) (Math.random() * 3.0)) * 1240287697;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890
		.method14529(-485668821)
	    == 1)
	    anInt11535
		= (int) (Math.random() * 6.0) * 1699685513;
	else
	    anInt11535
		= (int) (Math.random() * 12.0) * 1699685513;
    }
    
    public void method18008(NPCDefinition class401) {
	setDefinition(class401, true, true, true, 754263235);
    }
    
    public int method2(byte i) {
	return -546698383 * entityIndex;
    }
    
    public void method18009(NPCDefinition class401, boolean bool, boolean bool_99_,
			    boolean bool_100_) {
	if (definition != class401 && Class16.aBool141
	    && Class480.method11005(-546698383 * entityIndex, 551239101))
	    Class198.method4036((byte) 4);
	definition = class401;
	if (definition != null) {
	    if (bool)
		npcName = definition.name;
	    if (bool_99_)
		combatLevel = 572907823 * definition.combatLevel;
	    if (bool_100_)
		aClass400_11529 = null;
	}
	if (aClass489_11420 != null)
	    aClass489_11420
		.method11152();
    }
    
    Class542 method14475(Class103 class103) {
	if (null == definition
	    || !method17989(class103, 526336, -200044316))
	    return null;
	Class266 class266 = method10893();
	Class276 class276 = method10874();
	Class266 class266_101_ = class103.method2595();
	int i = aClass8_11406.method514((byte) 47);
	Class548 class548
	    = (aClass552_8744.aClass548ArrayArrayArray7169[nodePlane]
	       [(int) class276.aClass287_4386.aFloat4477 >> 9]
	       [(int) class276.aClass287_4386.aFloat4479 >> 9]);
	if (class548 != null && null != class548.aClass475_Sub1_Sub4_7058) {
	    int i_102_ = ((-1554267337
			   * anInt11399)
			  - class548.aClass475_Sub1_Sub4_7058.aShort10742);
	    anInt11399
		= (int) ((float) (-1554267337
				  * (((NPC) this)
				     .anInt11399))
			 - (float) i_102_ / 10.0F) * 665281159;
	} else
	    anInt11399
		= (665281159
		   * (int) ((float) ((((NPC) this)
				      .anInt11399)
				     * -1554267337)
			    - (float) (-1554267337
				       * (((NPC) this)
					  .anInt11399)) / 10.0F));
	class266_101_.method5175(class266);
	class266_101_.method5133(0.0F,
				 (float) (-20
					  - (-1554267337
					     * ((NPC)
						this).anInt11399)),
				 0.0F);
	Class554 class554 = method17787(48214986);
	NPCDefinition class401
	    = (definition.transformTo != null
	       ? definition.method7176(Class1.aClass19_11,
					    Class1.aClass19_11, (byte) 46)
	       : definition);
	boolean bool = class401.aClass272_5846 != null;
	aBool11432 = false;
	Class542 class542 = null;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		.method14854(590336950) == 1
	    && class401.aBool5831 && class554.aBool7246) {
	    Class409 class409 = ((aClass409_11375.method7364(369093163)
				  && aClass409_11375.method7349(-1267933514))
				 ? aClass409_11375 : null);
	    Class409_Sub1 class409_sub1
		= ((aClass409_Sub1_11405.method7364(-1315508011)
		    && (!aClass409_Sub1_11405.aBool8600 || null == class409))
		   ? aClass409_Sub1_11405 : null);
	    short i_103_ = Class128.aClass513_1589.aShort6719;
	    byte i_104_ = Class128.aClass513_1589.aByte6713;
	    if (definition.aShort5806 > -1) {
		i_103_ = definition.aShort5806;
		i_104_ = definition.aByte5847;
	    }
	    Class89 class89;
	    if (i_103_ > -1
		&& Class241_Sub5_Sub9.aClass241_Sub9_11043
		       .aClass445_Sub33_8890.method14529(-485668821) == 1)
		class89 = (Class520.method11694
			   (class103, i,
			    -195854529 * (((NPC) this)
					  .anInt11383),
			    -192864185 * (((NPC) this)
					  .anInt11384),
			    (anInt11385
			     * -389722201),
			    aClass89Array11435[0], i_103_, i_104_,
			    (null != class409_sub1 ? (Class409) class409_sub1
			     : class409),
			    -90782999));
	    else
		class89 = (Class477.method10920
			   (class103, i,
			    (anInt11383
			     * -195854529),
			    -192864185 * (((NPC) this)
					  .anInt11384),
			    -389722201 * (((NPC) this)
					  .anInt11385),
			    definition.size * 19489015,
			    aClass89Array11435[0],
			    definition.aShort5844 & 0xffff,
			    definition.aShort5843 & 0xffff,
			    definition.aByte5861 & 0xff,
			    definition.aByte5845 & 0xff,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    2050505882));
	    if (null != class89) {
		class542 = Class128.method3016(method18000(-756029713),
					       -2093379598);
		aBool11432 = true;
		class103.method2308(false);
		if (bool)
		    class89.method1890(class266_101_, null, 0);
		else {
		    if (aClass97Array8748 == null
			|| (aClass97Array8748.length
			    < aClass89Array11435.length + 1))
			method14465(aClass89Array11435.length + 1, 283655824);
		    class89.method1890(class266_101_,
				       (aClass97Array8748
					[aClass89Array11435.length]),
				       0);
		}
		class103.method2308(true);
	    }
	}
	if (bool) {
	    if (aClass97Array8748 == null || aClass97Array8748.length > 1)
		method14465(1, -166890156);
	    class103.method2282(class266_101_, aClass97Array8748[0],
				class401.aClass272_5846);
	} else if (null == aClass97Array8748
		   || aClass97Array8748.length < aClass89Array11435.length)
	    method14465(aClass89Array11435.length, 2016068194);
	if (null == class542)
	    class542
		= Class128.method3016(method18000(-1017992530), -2083227248);
	method17775(class103, aClass89Array11435, class266_101_, false,
		    -1947638283);
	for (int i_105_ = 0; i_105_ < aClass89Array11435.length; i_105_++) {
	    if (aClass89Array11435[i_105_] != null) {
		if (definition.aBool5853)
		    aClass89Array11435[i_105_].method1911
			((anInt11532
			  * 124635235),
			 (anInt11533
			  * -127947159),
			 (-1695568079
			  * anInt11526),
			 (1207275961
			  * anInt11535));
		if (bool)
		    aClass89Array11435[i_105_].method1890(class266_101_, null,
							  0);
		else
		    aClass89Array11435[i_105_].method1890(class266_101_,
							  (aClass97Array8748
							   [i_105_]),
							  0);
	    } else if (!bool)
		aClass97Array8748[i_105_].aBool1352 = false;
	}
	if (aClass489_11420 != null) {
	    Class98 class98 = ((NPC) this)
				  .aClass489_11420.method11164();
	    class103.method2305(class98);
	}
	for (int i_106_ = 0; i_106_ < aClass89Array11435.length; i_106_++) {
	    if (null != aClass89Array11435[i_106_])
		aBool11432
		    |= aClass89Array11435[i_106_].method2052();
	    aClass89Array11435[i_106_] = null;
	}
	anInt11376 = -96196995 * client.anInt8407;
	return class542;
    }
    
    boolean method18010(Class103 class103, int i) {
	int i_107_ = i;
	Class554 class554 = method17787(938592724);
	Class409 class409 = ((aClass409_11375.method7364(-1003257634)
			      && !aClass409_11375.method7349(-947256457))
			     ? aClass409_11375 : null);
	Class409_Sub1 class409_sub1
	    = ((aClass409_Sub1_11405.method7364(-1281608967)
		&& (!aClass409_Sub1_11405.aBool8600 || null == class409))
	       ? aClass409_Sub1_11405 : null);
	int i_108_ = 2147359439 * class554.anInt7227;
	int i_109_ = class554.anInt7232 * -1419210819;
	if (i_108_ != 0 || i_109_ != 0 || class554.anInt7240 * -1037683113 != 0
	    || class554.anInt7202 * -1595752353 != 0)
	    i |= 0x7;
	boolean bool
	    = (aByte11413 != 0 && client.anInt8296 >= anInt11408 * 230032561
	       && client.anInt8296 < anInt11389 * 758296401);
	if (bool)
	    i |= 0x80000;
	boolean bool_110_ = false;
	if (anInt11438 * -1284882411
	    != 0) {
	    NPCDefinition class401
		= (definition.transformTo != null
		   ? definition.method7176(Class1.aClass19_11,
						Class1.aClass19_11, (byte) 63)
		   : definition);
	    if (class401 == null
		|| (client.anInt8296
		    >= (-1355192533 * class401.anInt5809
			+ (anInt11414
			   * 394609597))))
		anInt11438 = 0;
	    else {
		anInt11438
		    = ((255 - (255
			       * (client.anInt8296
				  - 394609597 * ((NPC)
						 this).anInt11414)
			       / (class401.anInt5809 * -1355192533)))
		       * -1810395331);
		bool_110_ = true;
	    }
	}
	if (bool_110_)
	    i |= 0x100;
	int i_111_ = aClass8_11406.method514((byte) 8);
	Class89 class89
	    = (aClass89Array11435[0]
	       = definition.method7145(class103, i,
					    Class79.aClass539_1138,
					    Class1.aClass19_11,
					    Class1.aClass19_11, class409,
					    class409_sub1,
					    aClass409_Sub3_Sub1Array11417,
					    anIntArray11418, i_111_,
					    aClass404_11531,
					    method17860((short) 30290), false,
					    1992232053));
	if (class89 == null)
	    return false;
	anInt11377
	    = class89.method1902() * -1315890617;
	anInt11378
	    = class89.method1901() * -414801591;
	class89.method1894();
	method17784(class89, 1840351252);
	if (i_108_ != 0 || i_109_ != 0) {
	    method17786(i_111_, i_108_, i_109_,
			class554.anInt7229 * -1378871453,
			class554.anInt7230 * -2120578281, -1260745581);
	    if (0 != (-195854529
		      * anInt11383))
		aClass89Array11435[0].method1870
		    (-195854529
		     * anInt11383);
	    if (anInt11384 * -192864185
		!= 0)
		aClass89Array11435[0].method1980
		    (anInt11384
		     * -192864185);
	    if (anInt11385 * -389722201
		!= 0)
		aClass89Array11435[0].method1927
		    (0, (anInt11385
			 * -389722201), 0);
	} else
	    method17786(i_111_, method17782(1355064753) << 9,
			method17782(-224127525) << 9, 0, 0, -183579663);
	if (bool)
	    class89.method1911(aByte11416, aByte11395, aByte11412,
			       aByte11413 & 0xff);
	if (bool_110_)
	    class89.method1909((byte) (-1284882411
				       * (((NPC) this)
					  .anInt11438)),
			       null);
	method17785(class103, class554, i_107_, i_108_, i_109_, i_111_,
		    859914198);
	return true;
    }
    
    public int method18011(int i, int i_112_) {
	return anIntArray11523[i];
    }
    
    boolean method18012(Class103 class103, int i) {
	int i_113_ = i;
	Class554 class554 = method17787(-1040378963);
	Class409 class409 = ((aClass409_11375.method7364(619829292)
			      && !aClass409_11375.method7349(-1964589525))
			     ? aClass409_11375 : null);
	Class409_Sub1 class409_sub1
	    = ((aClass409_Sub1_11405.method7364(-823909987)
		&& (!aClass409_Sub1_11405.aBool8600 || null == class409))
	       ? aClass409_Sub1_11405 : null);
	int i_114_ = 2147359439 * class554.anInt7227;
	int i_115_ = class554.anInt7232 * -1419210819;
	if (i_114_ != 0 || i_115_ != 0 || class554.anInt7240 * -1037683113 != 0
	    || class554.anInt7202 * -1595752353 != 0)
	    i |= 0x7;
	boolean bool
	    = (aByte11413 != 0 && client.anInt8296 >= anInt11408 * 230032561
	       && client.anInt8296 < anInt11389 * 758296401);
	if (bool)
	    i |= 0x80000;
	boolean bool_116_ = false;
	if (anInt11438 * -1284882411
	    != 0) {
	    NPCDefinition class401
		= (definition.transformTo != null
		   ? definition.method7176(Class1.aClass19_11,
						Class1.aClass19_11, (byte) 6)
		   : definition);
	    if (class401 == null
		|| (client.anInt8296
		    >= (-1355192533 * class401.anInt5809
			+ (anInt11414
			   * 394609597))))
		anInt11438 = 0;
	    else {
		anInt11438
		    = ((255 - (255
			       * (client.anInt8296
				  - 394609597 * ((NPC)
						 this).anInt11414)
			       / (class401.anInt5809 * -1355192533)))
		       * -1810395331);
		bool_116_ = true;
	    }
	}
	if (bool_116_)
	    i |= 0x100;
	int i_117_ = aClass8_11406.method514((byte) -14);
	Class89 class89
	    = (aClass89Array11435[0]
	       = definition.method7145(class103, i,
					    Class79.aClass539_1138,
					    Class1.aClass19_11,
					    Class1.aClass19_11, class409,
					    class409_sub1,
					    aClass409_Sub3_Sub1Array11417,
					    anIntArray11418, i_117_,
					    aClass404_11531,
					    method17860((short) 7450), false,
					    1867950048));
	if (class89 == null)
	    return false;
	anInt11377
	    = class89.method1902() * -1315890617;
	anInt11378
	    = class89.method1901() * -414801591;
	class89.method1894();
	method17784(class89, -142263287);
	if (i_114_ != 0 || i_115_ != 0) {
	    method17786(i_117_, i_114_, i_115_,
			class554.anInt7229 * -1378871453,
			class554.anInt7230 * -2120578281, 1573267100);
	    if (0 != (-195854529
		      * anInt11383))
		aClass89Array11435[0].method1870
		    (-195854529
		     * anInt11383);
	    if (anInt11384 * -192864185
		!= 0)
		aClass89Array11435[0].method1980
		    (anInt11384
		     * -192864185);
	    if (anInt11385 * -389722201
		!= 0)
		aClass89Array11435[0].method1927
		    (0, (anInt11385
			 * -389722201), 0);
	} else
	    method17786(i_117_, method17782(-868075162) << 9,
			method17782(-972954885) << 9, 0, 0, 2043513427);
	if (bool)
	    class89.method1911(aByte11416, aByte11395, aByte11412,
			       aByte11413 & 0xff);
	if (bool_116_)
	    class89.method1909((byte) (-1284882411
				       * (((NPC) this)
					  .anInt11438)),
			       null);
	method17785(class103, class554, i_113_, i_114_, i_115_, i_117_,
		    61807574);
	return true;
    }
    
    boolean method18013(Class103 class103, int i) {
	int i_118_ = i;
	Class554 class554 = method17787(-1667464748);
	Class409 class409 = ((aClass409_11375.method7364(1732486750)
			      && !aClass409_11375.method7349(-636120060))
			     ? aClass409_11375 : null);
	Class409_Sub1 class409_sub1
	    = ((aClass409_Sub1_11405.method7364(1310670321)
		&& (!aClass409_Sub1_11405.aBool8600 || null == class409))
	       ? aClass409_Sub1_11405 : null);
	int i_119_ = 2147359439 * class554.anInt7227;
	int i_120_ = class554.anInt7232 * -1419210819;
	if (i_119_ != 0 || i_120_ != 0 || class554.anInt7240 * -1037683113 != 0
	    || class554.anInt7202 * -1595752353 != 0)
	    i |= 0x7;
	boolean bool
	    = (aByte11413 != 0 && client.anInt8296 >= anInt11408 * 230032561
	       && client.anInt8296 < anInt11389 * 758296401);
	if (bool)
	    i |= 0x80000;
	boolean bool_121_ = false;
	if (anInt11438 * -1284882411
	    != 0) {
	    NPCDefinition class401
		= (definition.transformTo != null
		   ? definition.method7176(Class1.aClass19_11,
						Class1.aClass19_11, (byte) 54)
		   : definition);
	    if (class401 == null
		|| (client.anInt8296
		    >= (-1355192533 * class401.anInt5809
			+ (anInt11414
			   * 394609597))))
		anInt11438 = 0;
	    else {
		anInt11438
		    = ((255 - (255
			       * (client.anInt8296
				  - 394609597 * ((NPC)
						 this).anInt11414)
			       / (class401.anInt5809 * -1355192533)))
		       * -1810395331);
		bool_121_ = true;
	    }
	}
	if (bool_121_)
	    i |= 0x100;
	int i_122_ = aClass8_11406.method514((byte) 11);
	Class89 class89
	    = (aClass89Array11435[0]
	       = definition.method7145(class103, i,
					    Class79.aClass539_1138,
					    Class1.aClass19_11,
					    Class1.aClass19_11, class409,
					    class409_sub1,
					    aClass409_Sub3_Sub1Array11417,
					    anIntArray11418, i_122_,
					    aClass404_11531,
					    method17860((short) 1165), false,
					    2124699413));
	if (class89 == null)
	    return false;
	anInt11377
	    = class89.method1902() * -1315890617;
	anInt11378
	    = class89.method1901() * -414801591;
	class89.method1894();
	method17784(class89, 399829265);
	if (i_119_ != 0 || i_120_ != 0) {
	    method17786(i_122_, i_119_, i_120_,
			class554.anInt7229 * -1378871453,
			class554.anInt7230 * -2120578281, 1302243284);
	    if (0 != (-195854529
		      * anInt11383))
		aClass89Array11435[0].method1870
		    (-195854529
		     * anInt11383);
	    if (anInt11384 * -192864185
		!= 0)
		aClass89Array11435[0].method1980
		    (anInt11384
		     * -192864185);
	    if (anInt11385 * -389722201
		!= 0)
		aClass89Array11435[0].method1927
		    (0, (anInt11385
			 * -389722201), 0);
	} else
	    method17786(i_122_, method17782(1696849007) << 9,
			method17782(-49926358) << 9, 0, 0, 1752301042);
	if (bool)
	    class89.method1911(aByte11416, aByte11395, aByte11412,
			       aByte11413 & 0xff);
	if (bool_121_)
	    class89.method1909((byte) (-1284882411
				       * (((NPC) this)
					  .anInt11438)),
			       null);
	method17785(class103, class554, i_118_, i_119_, i_120_, i_122_,
		    -47913758);
	return true;
    }
    
    public final void method18014(Class439 class439, int i) {
	int i_123_ = scenePositionXQueue[0];
	int i_124_ = scenePositionYQueue[0];
	switch (class439.anInt6146 * 1591010161) {
	case 6:
	    i_123_--;
	    i_124_--;
	    break;
	case 3:
	    i_123_++;
	    break;
	case 2:
	    i_123_--;
	    i_124_++;
	    break;
	case 1:
	    i_123_++;
	    i_124_++;
	    break;
	case 5:
	    i_123_--;
	    break;
	case 4:
	    i_124_++;
	    break;
	case 0:
	    i_124_--;
	    break;
	case 7:
	    i_123_++;
	    i_124_--;
	    break;
	}
	if (aClass409_11375.method7364(-470937398)
	    && (aClass409_11375.method7345((byte) -31).anInt7081 * 377701637
		== 1)) {
	    anIntArray11397 = null;
	    aClass409_11375.method7347(-1, 545894520);
	}
	for (int i_125_ = 0; i_125_ < aClass244Array11404.length; i_125_++) {
	    if (1967872619 * aClass244Array11404[i_125_].graphicsID != -1) {
		GraphicsDefinition class460
		    = (Class240.graphicsDefLoader.getGraphicsDefinition
		       (1967872619 * aClass244Array11404[i_125_].graphicsID,
			1232200923));
		if (class460.aBool6277 && -1 != 850723107 * class460.anInt6267
		    && (Class394.animationDefLoader.getAnimationDefinition
			(class460.anInt6267 * 850723107, (byte) -100)
			.anInt7081) * 377701637 == 1) {
		    aClass244Array11404[i_125_].aClass409_3935
			.method7347(-1, 526356221);
		    aClass244Array11404[i_125_].graphicsID = 1386773949;
		}
	    }
	}
	if (queuedStepCount * -316498507 < scenePositionXQueue.length - 1)
	    queuedStepCount += 1631398045;
	for (int i_126_ = queuedStepCount * -316498507; i_126_ > 0; i_126_--) {
	    scenePositionXQueue[i_126_] = scenePositionXQueue[i_126_ - 1];
	    scenePositionYQueue[i_126_] = scenePositionYQueue[i_126_ - 1];
	    moveTypeQueue[i_126_] = moveTypeQueue[i_126_ - 1];
	}
	scenePositionXQueue[0] = i_123_;
	scenePositionYQueue[0] = i_124_;
	moveTypeQueue[0] = (byte) i;
    }
    
    public void method18015(int i, int i_127_, int i_128_, boolean bool,
			    int i_129_) {
	nodePlane = aByte8745 = (byte) i;
	if (client.aClass238_8477.method4753((byte) -21)
		.method4331(i_127_, i_128_, 1319684319))
	    aByte8745++;
	if (aClass409_11375.method7364(-865070150)
	    && (aClass409_11375.method7345((byte) -19).anInt7081 * 377701637
		== 1)) {
	    anIntArray11397 = null;
	    aClass409_11375.method7347(-1, -2100503805);
	}
	for (int i_130_ = 0; i_130_ < aClass244Array11404.length; i_130_++) {
	    if (aClass244Array11404[i_130_].graphicsID * 1967872619 != -1) {
		GraphicsDefinition class460
		    = (Class240.graphicsDefLoader.getGraphicsDefinition
		       (1967872619 * aClass244Array11404[i_130_].graphicsID,
			1232200923));
		if (class460.aBool6277 && -1 != class460.anInt6267 * 850723107
		    && (Class394.animationDefLoader.getAnimationDefinition
			(850723107 * class460.anInt6267, (byte) -62)
			.anInt7081) * 377701637 == 1) {
		    aClass244Array11404[i_130_].aClass409_3935
			.method7347(-1, 306129619);
		    aClass244Array11404[i_130_].graphicsID = 1386773949;
		}
	    }
	}
	if (!bool) {
	    int i_131_ = i_127_ - scenePositionXQueue[0];
	    int i_132_ = i_128_ - scenePositionYQueue[0];
	    if (i_131_ >= -8 && i_131_ <= 8 && i_132_ >= -8 && i_132_ <= 8) {
		if (-316498507 * queuedStepCount < scenePositionXQueue.length - 1)
		    queuedStepCount += 1631398045;
		for (int i_133_ = -316498507 * queuedStepCount; i_133_ > 0;
		     i_133_--) {
		    scenePositionXQueue[i_133_] = scenePositionXQueue[i_133_ - 1];
		    scenePositionYQueue[i_133_] = scenePositionYQueue[i_133_ - 1];
		    moveTypeQueue[i_133_] = moveTypeQueue[i_133_ - 1];
		}
		scenePositionXQueue[0] = i_127_;
		scenePositionYQueue[0] = i_128_;
		moveTypeQueue[0] = Class448.aClass448_6186.aByte6187;
		return;
	    }
	}
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = i_127_;
	scenePositionYQueue[0] = i_128_;
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) ((i_129_ << 8) + (scenePositionXQueue[0] << 9));
	class287.aFloat4479
	    = (float) ((i_129_ << 8) + (scenePositionYQueue[0] << 9));
	method10898(class287);
	class287.method5564();
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    public int method14464(int i) {
	if (null != definition.transformTo) {
	    NPCDefinition class401
		= definition.method7176(Class1.aClass19_11,
					     Class1.aClass19_11, (byte) 106);
	    if (null != class401 && -1 != 1671108779 * class401.anInt5859)
		return 1671108779 * class401.anInt5859;
	}
	return (1671108779 * definition.anInt5859 != -1
		? 1671108779 * definition.anInt5859
		: super.method14464(793562832));
    }
    
    public void method18016(int i, int i_134_, int i_135_) {
	anIntArray11523[i] = i_134_;
	anIntArray11534[i] = i_135_;
    }
    
    public void method18017(int i, int i_136_, int i_137_, boolean bool,
			    int i_138_) {
	nodePlane = aByte8745 = (byte) i;
	if (client.aClass238_8477.method4753((byte) -46)
		.method4331(i_136_, i_137_, -1205532977))
	    aByte8745++;
	if (aClass409_11375.method7364(929699777)
	    && (aClass409_11375.method7345((byte) -20).anInt7081 * 377701637
		== 1)) {
	    anIntArray11397 = null;
	    aClass409_11375.method7347(-1, -514829829);
	}
	for (int i_139_ = 0; i_139_ < aClass244Array11404.length; i_139_++) {
	    if (aClass244Array11404[i_139_].graphicsID * 1967872619 != -1) {
		GraphicsDefinition class460
		    = (Class240.graphicsDefLoader.getGraphicsDefinition
		       (1967872619 * aClass244Array11404[i_139_].graphicsID,
			1232200923));
		if (class460.aBool6277 && -1 != class460.anInt6267 * 850723107
		    && (Class394.animationDefLoader.getAnimationDefinition
			(850723107 * class460.anInt6267, (byte) -45)
			.anInt7081) * 377701637 == 1) {
		    aClass244Array11404[i_139_].aClass409_3935
			.method7347(-1, -706348217);
		    aClass244Array11404[i_139_].graphicsID = 1386773949;
		}
	    }
	}
	if (!bool) {
	    int i_140_ = i_136_ - scenePositionXQueue[0];
	    int i_141_ = i_137_ - scenePositionYQueue[0];
	    if (i_140_ >= -8 && i_140_ <= 8 && i_141_ >= -8 && i_141_ <= 8) {
		if (-316498507 * queuedStepCount < scenePositionXQueue.length - 1)
		    queuedStepCount += 1631398045;
		for (int i_142_ = -316498507 * queuedStepCount; i_142_ > 0;
		     i_142_--) {
		    scenePositionXQueue[i_142_] = scenePositionXQueue[i_142_ - 1];
		    scenePositionYQueue[i_142_] = scenePositionYQueue[i_142_ - 1];
		    moveTypeQueue[i_142_] = moveTypeQueue[i_142_ - 1];
		}
		scenePositionXQueue[0] = i_136_;
		scenePositionYQueue[0] = i_137_;
		moveTypeQueue[0] = Class448.aClass448_6186.aByte6187;
		return;
	    }
	}
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = i_136_;
	scenePositionYQueue[0] = i_137_;
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) ((i_138_ << 8) + (scenePositionXQueue[0] << 9));
	class287.aFloat4479
	    = (float) ((i_138_ << 8) + (scenePositionYQueue[0] << 9));
	method10898(class287);
	class287.method5564();
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    public void method18018(int i, int i_143_, int i_144_, boolean bool,
			    int i_145_) {
	nodePlane = aByte8745 = (byte) i;
	if (client.aClass238_8477.method4753((byte) -117)
		.method4331(i_143_, i_144_, -957575127))
	    aByte8745++;
	if (aClass409_11375.method7364(1572640458)
	    && (aClass409_11375.method7345((byte) 70).anInt7081 * 377701637
		== 1)) {
	    anIntArray11397 = null;
	    aClass409_11375.method7347(-1, 393932689);
	}
	for (int i_146_ = 0; i_146_ < aClass244Array11404.length; i_146_++) {
	    if (aClass244Array11404[i_146_].graphicsID * 1967872619 != -1) {
		GraphicsDefinition class460
		    = (Class240.graphicsDefLoader.getGraphicsDefinition
		       (1967872619 * aClass244Array11404[i_146_].graphicsID,
			1232200923));
		if (class460.aBool6277 && -1 != class460.anInt6267 * 850723107
		    && (Class394.animationDefLoader.getAnimationDefinition
			(850723107 * class460.anInt6267, (byte) -66)
			.anInt7081) * 377701637 == 1) {
		    aClass244Array11404[i_146_].aClass409_3935
			.method7347(-1, -217337298);
		    aClass244Array11404[i_146_].graphicsID = 1386773949;
		}
	    }
	}
	if (!bool) {
	    int i_147_ = i_143_ - scenePositionXQueue[0];
	    int i_148_ = i_144_ - scenePositionYQueue[0];
	    if (i_147_ >= -8 && i_147_ <= 8 && i_148_ >= -8 && i_148_ <= 8) {
		if (-316498507 * queuedStepCount < scenePositionXQueue.length - 1)
		    queuedStepCount += 1631398045;
		for (int i_149_ = -316498507 * queuedStepCount; i_149_ > 0;
		     i_149_--) {
		    scenePositionXQueue[i_149_] = scenePositionXQueue[i_149_ - 1];
		    scenePositionYQueue[i_149_] = scenePositionYQueue[i_149_ - 1];
		    moveTypeQueue[i_149_] = moveTypeQueue[i_149_ - 1];
		}
		scenePositionXQueue[0] = i_143_;
		scenePositionYQueue[0] = i_144_;
		moveTypeQueue[0] = Class448.aClass448_6186.aByte6187;
		return;
	    }
	}
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = i_143_;
	scenePositionYQueue[0] = i_144_;
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) ((i_145_ << 8) + (scenePositionXQueue[0] << 9));
	class287.aFloat4479
	    = (float) ((i_145_ << 8) + (scenePositionYQueue[0] << 9));
	method10898(class287);
	class287.method5564();
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    public Class67 method14(int i) {
	return Class67.aClass67_1052;
    }
    
    public final boolean method18019() {
	if (definition == null)
	    return false;
	return true;
    }
    
    public int method14471() {
	if (null != definition.transformTo) {
	    NPCDefinition class401
		= definition.method7176(Class1.aClass19_11,
					     Class1.aClass19_11, (byte) 31);
	    if (null != class401 && -1 != 1671108779 * class401.anInt5859)
		return 1671108779 * class401.anInt5859;
	}
	return (1671108779 * definition.anInt5859 != -1
		? 1671108779 * definition.anInt5859
		: super.method14464(-966146891));
    }
    
    final void method14454(byte i) {
	throw new IllegalStateException();
    }
    
    public final boolean method18020() {
	if (definition == null)
	    return false;
	return true;
    }
    
    int method17860(short i) {
	if (-1 != anInt11530 * -1587321757)
	    return anInt11530 * -1587321757;
	if (null != definition.transformTo) {
	    NPCDefinition class401
		= definition.method7176(Class1.aClass19_11,
					     Class1.aClass19_11, (byte) 73);
	    if (class401 != null && -1 != class401.renderEmote * 1952014657)
		return 1952014657 * class401.renderEmote;
	}
	return definition.renderEmote * 1952014657;
    }
    
    public void method18021(int i, int i_150_, int i_151_, boolean bool,
			    int i_152_) {
	nodePlane = aByte8745 = (byte) i;
	if (client.aClass238_8477.method4753((byte) -118)
		.method4331(i_150_, i_151_, -1422469032))
	    aByte8745++;
	if (aClass409_11375.method7364(-1467843509)
	    && (aClass409_11375.method7345((byte) -80).anInt7081 * 377701637
		== 1)) {
	    anIntArray11397 = null;
	    aClass409_11375.method7347(-1, 273793030);
	}
	for (int i_153_ = 0; i_153_ < aClass244Array11404.length; i_153_++) {
	    if (aClass244Array11404[i_153_].graphicsID * 1967872619 != -1) {
		GraphicsDefinition class460
		    = (Class240.graphicsDefLoader.getGraphicsDefinition
		       (1967872619 * aClass244Array11404[i_153_].graphicsID,
			1232200923));
		if (class460.aBool6277 && -1 != class460.anInt6267 * 850723107
		    && (Class394.animationDefLoader.getAnimationDefinition
			(850723107 * class460.anInt6267, (byte) -59)
			.anInt7081) * 377701637 == 1) {
		    aClass244Array11404[i_153_].aClass409_3935
			.method7347(-1, -243120671);
		    aClass244Array11404[i_153_].graphicsID = 1386773949;
		}
	    }
	}
	if (!bool) {
	    int i_154_ = i_150_ - scenePositionXQueue[0];
	    int i_155_ = i_151_ - scenePositionYQueue[0];
	    if (i_154_ >= -8 && i_154_ <= 8 && i_155_ >= -8 && i_155_ <= 8) {
		if (-316498507 * queuedStepCount < scenePositionXQueue.length - 1)
		    queuedStepCount += 1631398045;
		for (int i_156_ = -316498507 * queuedStepCount; i_156_ > 0;
		     i_156_--) {
		    scenePositionXQueue[i_156_] = scenePositionXQueue[i_156_ - 1];
		    scenePositionYQueue[i_156_] = scenePositionYQueue[i_156_ - 1];
		    moveTypeQueue[i_156_] = moveTypeQueue[i_156_ - 1];
		}
		scenePositionXQueue[0] = i_150_;
		scenePositionYQueue[0] = i_151_;
		moveTypeQueue[0] = Class448.aClass448_6186.aByte6187;
		return;
	    }
	}
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = i_150_;
	scenePositionYQueue[0] = i_151_;
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) ((i_152_ << 8) + (scenePositionXQueue[0] << 9));
	class287.aFloat4479
	    = (float) ((i_152_ << 8) + (scenePositionYQueue[0] << 9));
	method10898(class287);
	class287.method5564();
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    boolean method18022() {
	return definition.aBool5839;
    }
    
    boolean method18023() {
	return definition.aBool5839;
    }
    
    public int method18024(int i) {
	return anIntArray11523[i];
    }
    
    public int method18025(int i) {
	return anIntArray11534[i];
    }
    
    public void method18026(int i, int i_157_, int i_158_) {
	anIntArray11523[i] = i_157_;
	anIntArray11534[i] = i_158_;
    }
    
    public Class535 method14470(Class103 class103) {
	return null;
    }
    
    public void method18027(int i, int i_159_, int i_160_) {
	anIntArray11523[i] = i_159_;
	anIntArray11534[i] = i_160_;
    }
    
    public boolean method14449() {
	if (definition.transformTo != null
	    && (definition.method7176(Class1.aClass19_11,
					   Class1.aClass19_11, (byte) 127)
		== null))
	    return false;
	return true;
    }
    
    public int method17832(int i) {
	return -546698383 * entityIndex + 1;
    }
    
    public static void method18028(JS5 class210, int i) {
	Class5.anInt17
	    = class210.identifierToIndex("p11_full", -187631888) * -842830973;
	Class456.anInt6250
	    = class210.identifierToIndex("p12_full", -187631888) * -383372793;
	IllegalArgumentException_Sub1.anInt11493
	    = class210.identifierToIndex("b12_full", -187631888) * 1075262299;
    }
    
    static final void method18029(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class13.anInt114 * -2063463019;
    }
    
    static Class241_Sub39_Sub13 method18030(int i, long hash) {
		Class241_Sub39_Sub13.aBool10964 = false;
		Class241_Sub39_Sub13 class241_sub39_sub13
		    = (Class241_Sub39_Sub13) Class241_Sub39_Sub13.aClass407_10960
						 .get((long) i << 56 | hash);
		if (null == class241_sub39_sub13) {
		    class241_sub39_sub13 = new Class241_Sub39_Sub13(i, hash);
		    Class241_Sub39_Sub13.aClass407_10960.put(class241_sub39_sub13,
		    		class241_sub39_sub13.hashCode * 4356572401218184725L);
		    Class241_Sub39_Sub13.aBool10964 = true;
		}
		return class241_sub39_sub13;
    }
}
