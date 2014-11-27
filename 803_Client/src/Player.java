/* Class475_Sub1_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Player extends Entity
{
    public boolean aBool11494;
    public int anInt11495;
    public boolean aBool11496;
    String suffixTitle;//aString11497
    public byte gender = 0;//aByte11498
    public Class490 aClass490_11499;
    public boolean aBool11500;
    public int[] anIntArray11501;
    public int anInt11502;
    public int anInt11503;
    public int anInt11504;
    public int anInt11505;
    public int facingDirection;//anInt11506
    String prefixTitle;//aString11507
    public int[] anIntArray11508;
    public int anInt11509;
    public int anInt11510;
    public String nameFiltered;//aString11511
    public int anInt11512;
    public int anInt11513;
    public int anInt11514;
    int anInt11515;
    public int anInt11516;
    public boolean hidden;//aBool11517
    public String nameUnfiltered;//aString11518
    public static JS5 aClass210_11519;
    
    public Class287 method18() {
	return Class287.method5560();
    }
    
    public Player(Class552 class552, int maxSteps) {
		super(class552, maxSteps, Class177.VAR_PLAYER_LIST);
		anIntArray11508 = new int[8];
		anIntArray11501 = new int[8];
		anInt11502 = 0;
		anInt11503 = 0;
		anInt11504 = -254862605;
		anInt11516 = 0;
		facingDirection = -1164488315;
		aBool11500 = false;
		anInt11495 = 0;
		anInt11509 = 906459141;
		anInt11510 = -1062671637;
		anInt11505 = -502607265;
		anInt11512 = -1423156597;
		anInt11513 = 0;
		anInt11514 = -1730258633;
		aBool11496 = false;
		hidden = false;
		aBool11494 = false;
		method17956((byte) 68);
    }
    
    public void decodeAppearance/*method17953*/(RSByteBuffer buffer, byte i, short i_0_) {
		gender = i;
		int i_1_ = -1;
		anInt11495 = 0;
		int[] is = new int[Class506.aClass504_6662.anIntArray6629.length];
		Class604[] class604s = new Class604[Class506.aClass504_6662.anIntArray6629.length];
		ItemDefinition[] class623s = new ItemDefinition[Class506.aClass504_6662.anIntArray6629.length];
		//System.out.println("Length: "+Class506.aClass504_6662.anIntArray6629.length);//18 slots total
		for (int slotID = 0; slotID < Class506.aClass504_6662.anIntArray6629.length; slotID++) {
		    if (Class506.aClass504_6662.anIntArray6629[slotID] != 1) {
		    	int id1 = buffer.readUnsignedByte((byte) 2);
				if (id1 == 0) {
				    is[slotID] = 0;
				} else {
					//System.out.println("Non-zero item at slot: "+slotID);
				    int id2 = buffer.readUnsignedByte((byte) 51);
				    int itemID = id2 + (id1 << 8);
				    if (0 == slotID && itemID == 65535) {
						i_1_ = buffer.readBigSmart((byte) -76);
						anInt11495 = (buffer.readUnsignedByte((byte) 57) * 1247438511);
						break;//Override set?
				    }
				    if (itemID >= 16384) {//Item
				    	itemID -= 16384;
						is[slotID] = itemID | 0x40000000;
						class623s[slotID] = JS5.itemDefLoader.list(itemID, (short) -7289);
						int i_6_ = class623s[slotID].teamID * -1475055411;
						if (i_6_ != 0) {
						    anInt11495 = 1247438511 * i_6_;
						}
				    } else {
				    	is[slotID] = itemID - 256 | ~0x7fffffff;//Body style
				    }
				}
		    }
		}
		if (-1 == i_1_) {
		    int hash = buffer.readUnsignedShort(1162222719);
			//System.out.println("Hash: "+hash);
		    int slotFlag = 0;
		    for (int slotID = 0; slotID < Class506.aClass504_6662.anIntArray6629.length; slotID++) {
				if (Class506.aClass504_6662.anIntArray6629[slotID] == 0) {
				    if ((hash & 1 << slotFlag) != 0) {
				    	class604s[slotID] = Class52.method1288(class623s[slotID], buffer, 613022603);
				    }
				    slotFlag++;
				}
		    }
		}
		int[] colour = new int[10];
		for (int index = 0; index < 10; index++) {
		    int cPart = buffer.readUnsignedByte((byte) 38);
		    if (Class561.aShortArrayArrayArray7298.length < 1 || cPart < 0
		    		|| (cPart >= Class561.aShortArrayArrayArray7298[index][0].length)) {
		    	cPart = 0;
		    }
		    colour[index] = cPart;
		}
		anInt11515 = buffer.readUnsignedShort(1162222719) * 2080125219;//Render emote
		if (null == aClass490_11499) {
		    aClass490_11499 = new Class490();//PlayerComposite
		}
		int i_13_ = aClass490_11499.anInt6508 * -614581637;
		int[] is_14_ = aClass490_11499.anIntArray6501;
		aClass490_11499.method11201(method17860((short) 30638), is, class604s, colour, 1 == gender, i_1_, 995463485);
		if (i_1_ != i_13_) {
		    Class287 class287 = Class287.method5562(method10874().aClass287_4386);
		    class287.aFloat4477 = (float) ((scenePositionXQueue[0] << 9) + (method17782(51703023) << 8));
		    class287.aFloat4479 = (float) ((scenePositionYQueue[0] << 9) + (method17782(887801393) << 8));
		    method10898(class287);
		    class287.method5564();
		}
		if (client.myPlayerIndex * 1124115145 == -546698383 * entityIndex && null != is_14_) {
		    for (int i_15_ = 0; i_15_ < colour.length; i_15_++) {
				if (colour[i_15_] != is_14_[i_15_]) {
				    JS5.itemDefLoader.method13307(1984604631);
				    break;
				}
		    }
		}
		if (null != aClass489_11420) {
		    aClass489_11420.method11152();
		}
		if (aClass409_Sub1_11405.method7364(993733370)
		    && aClass409_Sub1_11405.aBool8600) {
		    Class554 class554 = method17787(1196231697);
		    if (!class554.method12260(aClass409_Sub1_11405
						  .method7346(-1023098316),
					      1284208842)) {
			aClass409_Sub1_11405.method7347(-1, 1701840161);
			aClass409_Sub1_11405.aBool8600 = false;
		    }
		}
    }
    
    public final void decodeCharacterData/*method17954*/(RSByteBuffer playerData, byte i) {
    	playerData.pointer = 0;
		int flags = playerData.readUnsignedByte((byte) -59);
		//System.out.println("Decoding appearance update for player: "+displayName+" at index: "+(index*-546698383));
		byte gender = (byte) (flags & 0x1);
		boolean bool = 0 != (flags & 0x4);
		int i_18_ = super.method17782(1372153697);
		method17781((flags >> 3 & 0x7) + 1, (byte) -91);
		boolean hasPrefixTitle = (flags & 0x40) != 0;
		boolean hasSuffixTitle = (flags & 0x80) != 0;
		Class287 class287 = Class287.method5562(method10874().aClass287_4386);
		class287.aFloat4477 += (float) (method17782(-577003336) - i_18_ << 8);
		class287.aFloat4479 += (float) (method17782(1547729976) - i_18_ << 8);
		method10898(class287);
		class287.method5564();
		if (hasPrefixTitle) {
		    prefixTitle = playerData.readJagString(520607369);
		} else {
		    prefixTitle = null;
		}
		if (hasSuffixTitle) {
		    suffixTitle = playerData.readJagString(996549337);
		} else {
		    suffixTitle = null;
		}
		hidden = playerData.getByte(767288490) == 1;
		if (Class416.aClass470_6012 == Class470.aClass470_6345
		    && 482866503 * client.playerRights >= 2) {
		    hidden = false;
		}
		decodeAppearance(playerData, gender, (short) -24199);
		nameFiltered = playerData.readString(-1518195136);
		nameUnfiltered = nameFiltered;
		if (this == Class21.myPlayer) {
		    RuntimeException_Sub3.myPlayerDisplayName = nameFiltered;
		}
		//System.out.println("Display name: "+displayName);
		anInt11502 = playerData.readUnsignedByte((byte) -40) * 1928498121;//Skill level
		if (bool) {
		    anInt11516 = playerData.readUnsignedShort(1162222719) * -162920741;
		    if (65535 == 1682998611 * anInt11516) {
		    	anInt11516 = 162920741;
		    }
		    anInt11503 = anInt11502 * 1523604377;
		    anInt11504 = -254862605;
		} else {
		    anInt11516 = 0;
		    anInt11503 = playerData.readUnsignedByte((byte) -22) * 670432801;//Skill offset level
		    anInt11504 = playerData.readUnsignedByte((byte) -42) * 254862605;
		    if (anInt11504 * -870747707 == 255) {
		    	anInt11504 = -254862605;
		    }
		}
		//System.out.println("Skill: "+(anInt11502 * 1523604377));
		int i_21_ = 1294463297 * anInt11513;
		anInt11513 = playerData.readUnsignedByte((byte) 71) * -776102207;
		//System.out.println("NPC stuff: "+(anInt11513 * 1294463297));
		if (0 != anInt11513 * 1294463297) {//NPC-related stuff...
		    int i_22_ = anInt11509 * -196777165;
		    int i_23_ = anInt11510 * -405630403;
		    int i_24_ = anInt11505 * 446821985;
		    int i_25_ = 869941981 * anInt11512;
		    int i_26_ = anInt11514 * -603334023;
		    anInt11509 = playerData.readUnsignedShort(1162222719) * -906459141;
		    anInt11510 = playerData.readUnsignedShort(1162222719) * 1062671637;
		    anInt11505 = playerData.readUnsignedShort(1162222719) * 502607265;
		    anInt11512 = playerData.readUnsignedShort(1162222719) * 1423156597;
		    anInt11514 = playerData.readUnsignedByte((byte) 15) * -124686391;
		    if (anInt11513 * 1294463297 != i_21_
			|| i_22_ != anInt11509 * -196777165
			|| i_23_ != -405630403 * anInt11510
			|| i_24_ != 446821985 * anInt11505
			|| anInt11512 * 869941981 != i_25_
			|| i_26_ != anInt11514 * -603334023) {
		    	Class4.method474(this, -1177368634);
		    }
		} else {
		    Class361_Sub1.method16755(this, 1482319719);
		}
		//System.out.println("Appearance block size: "+(playerData.pointer * 421967667));
    }
    
    public void method17955(RSByteBuffer class241_sub3, int i) {
	class241_sub3.pointer = 0;
	int i_27_ = class241_sub3.readUnsignedByte((byte) -69);
	for (int i_28_ = 0; i_28_ < anIntArray11508.length; i_28_++) {
	    if (0 != (i_27_ & 1 << i_28_)) {
		int i_29_ = class241_sub3.readUnsignedByte((byte) -87);
		int i_30_ = class241_sub3.readUnsignedShort(1162222719);
		anIntArray11508[i_28_] = i_29_;
		anIntArray11501[i_28_] = i_30_;
	    } else {
		anIntArray11508[i_28_] = -1;
		anIntArray11501[i_28_] = -1;
	    }
	}
    }
    
    void method17956(byte i) {
	for (int i_31_ = 0; i_31_ < anIntArray11508.length; i_31_++)
	    anIntArray11508[i_31_] = -1;
	for (int i_32_ = 0; i_32_ < anIntArray11501.length; i_32_++)
	    anIntArray11501[i_32_] = -1;
    }
    
    public Class535 method14457(Class103 class103, int i) {
	return null;
    }
    
    Class542 method14455(Class103 class103, int i) {
	if (aClass490_11499 == null
	    || !method17957(class103, 2048, -776094808))
	    return null;
	Class266 class266 = class103.method2595();
	Class266 class266_33_ = method10893();
	Class276 class276 = method10874();
	int i_34_ = aClass8_11406.method514((byte) 36);
	Class548 class548
	    = (aClass552_8744.aClass548ArrayArrayArray7169[nodePlane]
	       [(int) class276.aClass287_4386.aFloat4477 >> 9]
	       [(int) class276.aClass287_4386.aFloat4479 >> 9]);
	if (null != class548 && class548.aClass475_Sub1_Sub4_7058 != null) {
	    int i_35_ = ((-1554267337
			  * anInt11399)
			 - class548.aClass475_Sub1_Sub4_7058.aShort10742);
	    anInt11399
		= (int) ((float) ((((Player) this)
				   .anInt11399)
				  * -1554267337)
			 - (float) i_35_ / 10.0F) * 665281159;
	} else
	    anInt11399
		= (int) ((float) (-1554267337
				  * (((Player) this)
				     .anInt11399))
			 - (float) (-1554267337
				    * (((Player) this)
				       .anInt11399)) / 10.0F) * 665281159;
	class266.method5175(class266_33_);
	class266.method5133(0.0F,
			    (float) (-20 - (-1554267337
					    * ((Player)
					       this).anInt11399)),
			    0.0F);
	Class542 class542 = null;
	aBool11432 = false;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		.method14854(152137457)
	    == 1) {
	    Class554 class554 = method17787(1919825250);
	    if (class554.aBool7246
		&& (-1 == -614581637 * aClass490_11499.anInt6508
		    || (MasterIndex.npcDefLoader.getNpcDefinition
			(-614581637 * aClass490_11499.anInt6508, -1622420119)
			.aBool5831))) {
		Class409 class409
		    = ((aClass409_11375.method7364(1747505697)
			&& aClass409_11375.method7349(-1400535114))
		       ? aClass409_11375 : null);
		Class409_Sub1 class409_sub1
		    = ((aClass409_Sub1_11405.method7364(1676785)
			&& (!aClass409_Sub1_11405.aBool8600
			    || class409 == null))
		       ? aClass409_Sub1_11405 : null);
		short i_36_ = Class128.aClass513_1589.aShort6719;
		byte i_37_ = Class128.aClass513_1589.aByte6713;
		if (-1 != -614581637 * aClass490_11499.anInt6508) {
		    i_36_ = (MasterIndex.npcDefLoader.getNpcDefinition
			     (aClass490_11499.anInt6508 * -614581637,
			      -1501139391)
			     .aShort5806);
		    i_37_
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   (-614581637 * aClass490_11499.anInt6508, -421929831)
			   .aByte5847);
		}
		//Object object = null;
		Class89 class89;
		if (i_36_ > -1
		    && Class241_Sub5_Sub9.aClass241_Sub9_11043
			   .aClass445_Sub33_8890.method14529(-485668821) == 1)
		    class89
			= (Class520.method11694
			   (class103, i_34_,
			    -195854529 * (((Player) this)
					  .anInt11383),
			    (anInt11384
			     * -192864185),
			    (anInt11385
			     * -389722201),
			    aClass89Array11435[0], i_36_, i_37_,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    1800467239));
		else
		    class89
			= (Class477.method10920
			   (class103, i_34_,
			    -195854529 * (((Player) this)
					  .anInt11383),
			    (anInt11384
			     * -192864185),
			    (anInt11385
			     * -389722201),
			    1, aClass89Array11435[0], 0, 0, 160, 240,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    -1861534921));
		if (null != class89) {
		    if (null == aClass97Array8748
			|| (aClass97Array8748.length
			    < aClass89Array11435.length + 1))
			method14465(1 + aClass89Array11435.length, 1810356356);
		    class542 = Class128.method3016(true, -2143394661);
		    aBool11432 = true;
		    class103.method2308(false);
		    class89.method1890(class266,
				       (aClass97Array8748
					[aClass89Array11435.length]),
				       0);
		    class103.method2308(true);
		}
	    }
	}
	if (this == Class21.myPlayer) {
	    for (int i_38_ = client.aClass192Array8301.length - 1; i_38_ >= 0;
		 i_38_--) {
		Class192 class192 = client.aClass192Array8301[i_38_];
		if (null != class192
		    && class192.anInt2292 * 1105497879 != -1) {
		    if (1 == class192.anInt2288 * -1685117145) {
			ObjectNode class241_sub26
			    = ((ObjectNode)
			       (client.aClass407_8457.get
				((long) (class192.anInt2287 * 810214515))));
			if (class241_sub26 != null) {
			    NPC class475_sub1_sub1_sub3_sub2
				= ((NPC)
				   class241_sub26.objectValue);
			    Class287 class287
				= (Class287.method5578
				   ((class475_sub1_sub1_sub3_sub2.method10874()
				     .aClass287_4386),
				    Class21
					.myPlayer
					.method10874().aClass287_4386));
			    int i_39_ = (int) class287.aFloat4477;
			    int i_40_ = (int) class287.aFloat4479;
			    method17966(class103, class266,
					aClass89Array11435[0], (long) i_39_,
					(long) i_40_,
					1105497879 * class192.anInt2292,
					92160000L);
			}
		    }
		    if (2 == -1685117145 * class192.anInt2288) {
			Class287 class287
			    = (Class21.myPlayer
				   .method10874
			       ().aClass287_4386);
			long l = (long) (1718000347 * class192.anInt2289
					 - (int) class287.aFloat4477);
			long l_41_ = (long) (-1357301451 * class192.anInt2290
					     - (int) class287.aFloat4479);
			long l_42_
			    = (long) (1020811893 * class192.anInt2293 << 9);
			l_42_ *= l_42_;
			method17966(class103, class266, aClass89Array11435[0],
				    l, l_41_, 1105497879 * class192.anInt2292,
				    l_42_);
		    }
		    if (10 == class192.anInt2288 * -1685117145
			&& class192.anInt2287 * 810214515 >= 0
			&& (810214515 * class192.anInt2287
			    < (client
			       .localPlayers).length)) {
			Player class475_sub1_sub1_sub3_sub1_43_
			    = (client.localPlayers
			       [class192.anInt2287 * 810214515]);
			if (class475_sub1_sub1_sub3_sub1_43_ != null) {
			    Class287 class287
				= (Class287.method5578
				   (class475_sub1_sub1_sub3_sub1_43_
					.method10874().aClass287_4386,
				    Class21
					.myPlayer
					.method10874().aClass287_4386));
			    int i_44_ = (int) class287.aFloat4477;
			    int i_45_ = (int) class287.aFloat4479;
			    method17966(class103, class266,
					aClass89Array11435[0], (long) i_44_,
					(long) i_45_,
					1105497879 * class192.anInt2292,
					92160000L);
			}
		    }
		}
	    }
	}
	class266.method5175(class266_33_);
	class266.method5133(0.0F,
			    (float) (-5
				     - (((Player) this)
					.anInt11399) * -1554267337),
			    0.0F);
	if (aClass97Array8748 == null
	    || aClass97Array8748.length < aClass89Array11435.length)
	    method14465(aClass89Array11435.length, 1607141265);
	if (class542 == null)
	    class542 = Class128.method3016(true, -2091647198);
	method17775(class103, aClass89Array11435, class266, false,
		    -1947638283);
	for (int i_46_ = 0; i_46_ < aClass89Array11435.length; i_46_++) {
	    if (aClass89Array11435[i_46_] != null)
		aClass89Array11435[i_46_].method1890
		    (class266, aClass97Array8748[i_46_],
		     (Class21.myPlayer == this ? 1
		      : 0));
	    else
		aClass97Array8748[i_46_].aBool1352 = false;
	}
	if (aClass489_11420 != null) {
	    Class98 class98 = ((Player) this)
				  .aClass489_11420.method11164();
	    class103.method2305(class98);
	}
	for (int i_47_ = 0; i_47_ < aClass89Array11435.length; i_47_++) {
	    if (aClass89Array11435[i_47_] != null)
		aBool11432
		    |= aClass89Array11435[i_47_].method2052();
	    aClass89Array11435[i_47_] = null;
	}
	anInt11376 = client.anInt8407 * -96196995;
	return class542;
    }
    
    void method14493(Class103 class103, byte i) {
	if (aClass490_11499 != null
	    && (aBool11433
		|| method17957(class103, 0, 721960652))) {
	    Class266 class266 = class103.method2595();
	    class266.method5186(method10874());
	    class266.method5133(0.0F, -5.0F, 0.0F);
	    method17775(class103, aClass89Array11435, class266,
			aBool11433,
			-1947638283);
	    for (int i_48_ = 0; i_48_ < aClass89Array11435.length; i_48_++)
		aClass89Array11435[i_48_] = null;
	}
    }
    
    final boolean method14456() {
	return false;
    }
    
    boolean method17957(Class103 class103, int i, int i_49_) {
	int i_50_ = i;
	Class554 class554 = method17787(1327951977);
	Class409 class409 = ((aClass409_11375.method7364(1643652540)
			      && !aClass409_11375.method7349(-216436633))
			     ? aClass409_11375 : null);
	Class409_Sub1 class409_sub1
	    = ((aClass409_Sub1_11405.method7364(-1582094368) && !aBool11500
		&& (!aClass409_Sub1_11405.aBool8600 || null == class409))
	       ? aClass409_Sub1_11405 : null);
	int i_51_ = 2147359439 * class554.anInt7227;
	int i_52_ = class554.anInt7232 * -1419210819;
	if (i_51_ != 0 || 0 != i_52_ || 0 != class554.anInt7240 * -1037683113
	    || 0 != class554.anInt7202 * -1595752353)
	    i |= 0x7;
	int i_53_ = aClass8_11406.method514((byte) -81);
	boolean bool
	    = (0 != aByte11413 && client.anInt8296 >= anInt11408 * 230032561
	       && client.anInt8296 < 758296401 * anInt11389);
	if (bool)
	    i |= 0x80000;
	Class89 class89
	    = (aClass89Array11435[0]
	       = aClass490_11499.method11221(class103, i,
					     Class79.aClass539_1138,
					     CS2MapList.aClass350_6031,
					     MasterIndex.npcDefLoader,
					     JS5.itemDefLoader,
					     Class1.aClass19_11,
					     Class1.aClass19_11, class409,
					     class409_sub1,
					     aClass409_Sub3_Sub1Array11417,
					     anIntArray11418, i_53_, true,
					     Class506.aClass504_6662,
					     -1538486423));
	int i_54_ = GameScene.method11719(355958652);
	if (-1901361259 * GameShell3.maxmemory < 96 && i_54_ > 50)
	    Class333.method6063((byte) -37);
	if (Class416.aClass470_6012 != Class470.aClass470_6345 && i_54_ < 50) {
	    int i_55_;
	    for (i_55_ = 50 - i_54_; i_55_ > client.anInt8294 * -1823574619;
		 client.anInt8294 += 1918069293)
		HashTable.aByteArrayArray5912[client.anInt8294 * -1823574619]
		    = new byte[102400];
	    while (i_55_ < client.anInt8294 * -1823574619) {
		client.anInt8294 -= 1918069293;
		HashTable.aByteArrayArray5912[-1823574619 * client.anInt8294]
		    = null;
	    }
	} else if (Class470.aClass470_6345 != Class416.aClass470_6012) {
	    HashTable.aByteArrayArray5912 = new byte[50][];
	    client.anInt8294 = 0;
	}
	if (class89 == null)
	    return false;
	anInt11377
	    = class89.method1902() * -1315890617;
	anInt11378
	    = class89.method1901() * -414801591;
	class89.method1894();
	method17784(class89, -2030133970);
	if (i_51_ != 0 || i_52_ != 0) {
	    method17786(i_53_, i_51_, i_52_, class554.anInt7229 * -1378871453,
			class554.anInt7230 * -2120578281, -1291649046);
	    if (0 != (-195854529
		      * anInt11383))
		class89.method1870((((Player) this)
				    .anInt11383) * -195854529);
	    if (anInt11384 * -192864185
		!= 0)
		class89.method1980(-192864185 * ((Player)
						 this).anInt11384);
	    if (0 != (-389722201
		      * anInt11385))
		class89.method1927(0, (((Player) this)
				       .anInt11385) * -389722201, 0);
	} else
	    method17786(i_53_, method17782(-53994518) << 9,
			method17782(1308977025) << 9, 0, 0, 271091656);
	if (bool)
	    class89.method1911(aByte11416, aByte11395, aByte11412,
			       aByte11413 & 0xff);
	if (!aBool11500)
	    method17785(class103, class554, i_50_, i_51_, i_52_, i_53_,
			-598269054);
	return true;
    }
    
    public String getFormattedName/*method17958*/(boolean filtered, int i) {
		String name = "";
		if (prefixTitle != null) {
			name = prefixTitle;
		}
		if (filtered) {
			name = new StringBuilder().append(name)
		    		.append(nameFiltered).toString();
		} else {
			name = new StringBuilder().append(name)
		    		.append(nameUnfiltered).toString();
		}
		if (null != suffixTitle) {
			name = new StringBuilder().append(name)
		    	.append(suffixTitle).toString();
		}
		return name;
    }
    
    public String getName/*method17959*/(boolean filtered, int i) {
		if (filtered) {
		    return nameFiltered;
		}
		return nameUnfiltered;
    }
    
    public final void moveTo/*method17960*/(int posX, int posY, byte type, int i_58_) {
		if (aClass409_11375.method7364(1694922607)
				&& (aClass409_11375.method7345((byte) -50).anInt7081 * 377701637 == 1)) {
		    anIntArray11397 = null;
		    aClass409_11375.method7347(-1, -7072354);
		}
		for (int index = 0; index < aClass244Array11404.length; index++) {
		    if (-1 != 1967872619 * aClass244Array11404[index].graphicsID) {
				GraphicsDefinition gfx = Class240.graphicsDefLoader.getGraphicsDefinition(
	                                1967872619 * aClass244Array11404[index].graphicsID, 1232200923);
				if (gfx.aBool6277 && gfx.anInt6267 * 850723107 != -1
						&& Class394.animationDefLoader.getAnimationDefinition(
				    		gfx.anInt6267 * 850723107, (byte) -124).anInt7081 * 377701637 == 1) {
				    aClass244Array11404[index].aClass409_3935.method7347(-1, 609055609);
				    aClass244Array11404[index].graphicsID = 1386773949;
				}
		    }
		}
		facingDirection = -1164488315;
		if (posX < 0 || posX >= client.aClass238_8477.method4744(-1692187775)
		    || posY < 0 || posY >= client.aClass238_8477.method4745(624288780)) {
		    setPosition(posX, posY, 1476355395);
		} else if (scenePositionXQueue[0] < 0
			 || (scenePositionXQueue[0] >= client.aClass238_8477.method4744(-1510426056))
			 || scenePositionYQueue[0] < 0
			 || (scenePositionYQueue[0] >= client.aClass238_8477.method4745(-1077866369))) {
		    setPosition(posX, posY, 1842037663);
		} else {
		    queueMovement(posX, posY, type, (byte) 14);
		}
    }
    
    public void setPosition/*method17961*/(int posX, int posY, int i_61_) {
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = posX;
	scenePositionYQueue[0] = posY;
	int i_62_ = method17782(2090397607);
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477 = (float) (256 * i_62_ + 512 * scenePositionXQueue[0]);
	class287.aFloat4479 = (float) (i_62_ * 256 + scenePositionYQueue[0] * 512);
	method10898(class287);
	class287.method5564();
	if (this == Class21.myPlayer) {
	    client.aClass238_8477.method4833(-477435015).method11400(-679787108);
        }
	if (null != aClass489_11420)
	    aClass489_11420.method11152();
    }
    
    final void queueMovement/*method17962*/(int posX, int posY, byte type, byte i_65_) {
		if (queuedStepCount * -316498507 < scenePositionXQueue.length - 1) {
		    queuedStepCount += 1631398045;
	        }
		for (int index = queuedStepCount * -316498507; index > 0; index--) {
		    scenePositionXQueue[index] = scenePositionXQueue[index - 1];
		    scenePositionYQueue[index] = scenePositionYQueue[index - 1];
		    moveTypeQueue[index] = moveTypeQueue[index - 1];
		}
		scenePositionXQueue[0] = posX;
		scenePositionYQueue[0] = posY;
		moveTypeQueue[0] = type;
    }
    
    public final boolean method17963(int i) {
	if (aClass490_11499 == null)
	    return false;
	return true;
    }
    
    Class542 method14474(Class103 class103) {
	if (aClass490_11499 == null
	    || !method17957(class103, 2048, -1115305926))
	    return null;
	Class266 class266 = class103.method2595();
	Class266 class266_67_ = method10893();
	Class276 class276 = method10874();
	int i = aClass8_11406.method514((byte) 92);
	Class548 class548
	    = (aClass552_8744.aClass548ArrayArrayArray7169[nodePlane]
	       [(int) class276.aClass287_4386.aFloat4477 >> 9]
	       [(int) class276.aClass287_4386.aFloat4479 >> 9]);
	if (null != class548 && class548.aClass475_Sub1_Sub4_7058 != null) {
	    int i_68_ = ((-1554267337
			  * anInt11399)
			 - class548.aClass475_Sub1_Sub4_7058.aShort10742);
	    anInt11399
		= (int) ((float) ((((Player) this)
				   .anInt11399)
				  * -1554267337)
			 - (float) i_68_ / 10.0F) * 665281159;
	} else
	    anInt11399
		= (int) ((float) (-1554267337
				  * (((Player) this)
				     .anInt11399))
			 - (float) (-1554267337
				    * (((Player) this)
				       .anInt11399)) / 10.0F) * 665281159;
	class266.method5175(class266_67_);
	class266.method5133(0.0F,
			    (float) (-20 - (-1554267337
					    * ((Player)
					       this).anInt11399)),
			    0.0F);
	Class542 class542 = null;
	aBool11432 = false;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		.method14854(-1066620562)
	    == 1) {
	    Class554 class554 = method17787(-392163455);
	    if (class554.aBool7246
		&& (-1 == -614581637 * aClass490_11499.anInt6508
		    || (MasterIndex.npcDefLoader.getNpcDefinition
			(-614581637 * aClass490_11499.anInt6508, -725563576)
			.aBool5831))) {
		Class409 class409
		    = ((aClass409_11375.method7364(-1255224739)
			&& aClass409_11375.method7349(-770176274))
		       ? aClass409_11375 : null);
		Class409_Sub1 class409_sub1
		    = ((aClass409_Sub1_11405.method7364(-351161551)
			&& (!aClass409_Sub1_11405.aBool8600
			    || class409 == null))
		       ? aClass409_Sub1_11405 : null);
		short i_69_ = Class128.aClass513_1589.aShort6719;
		byte i_70_ = Class128.aClass513_1589.aByte6713;
		if (-1 != -614581637 * aClass490_11499.anInt6508) {
		    i_69_
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   (aClass490_11499.anInt6508 * -614581637, -231800546)
			   .aShort5806);
		    i_70_
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   (-614581637 * aClass490_11499.anInt6508, -889791937)
			   .aByte5847);
		}
		//Object object = null;
		Class89 class89;
		if (i_69_ > -1
		    && Class241_Sub5_Sub9.aClass241_Sub9_11043
			   .aClass445_Sub33_8890.method14529(-485668821) == 1)
		    class89
			= (Class520.method11694
			   (class103, i,
			    -195854529 * (((Player) this)
					  .anInt11383),
			    (anInt11384
			     * -192864185),
			    (anInt11385
			     * -389722201),
			    aClass89Array11435[0], i_69_, i_70_,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    -330600360));
		else
		    class89
			= (Class477.method10920
			   (class103, i,
			    -195854529 * (((Player) this)
					  .anInt11383),
			    (anInt11384
			     * -192864185),
			    (anInt11385
			     * -389722201),
			    1, aClass89Array11435[0], 0, 0, 160, 240,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    -725875480));
		if (null != class89) {
		    if (null == aClass97Array8748
			|| (aClass97Array8748.length
			    < aClass89Array11435.length + 1))
			method14465(1 + aClass89Array11435.length, 1048705916);
		    class542 = Class128.method3016(true, -2090395771);
		    aBool11432 = true;
		    class103.method2308(false);
		    class89.method1890(class266,
				       (aClass97Array8748
					[aClass89Array11435.length]),
				       0);
		    class103.method2308(true);
		}
	    }
	}
	if (this == Class21.myPlayer) {
	    for (int i_71_ = client.aClass192Array8301.length - 1; i_71_ >= 0;
		 i_71_--) {
		Class192 class192 = client.aClass192Array8301[i_71_];
		if (null != class192
		    && class192.anInt2292 * 1105497879 != -1) {
		    if (1 == class192.anInt2288 * -1685117145) {
			ObjectNode class241_sub26
			    = ((ObjectNode)
			       (client.aClass407_8457.get
				((long) (class192.anInt2287 * 810214515))));
			if (class241_sub26 != null) {
			    NPC class475_sub1_sub1_sub3_sub2
				= ((NPC)
				   class241_sub26.objectValue);
			    Class287 class287
				= (Class287.method5578
				   ((class475_sub1_sub1_sub3_sub2.method10874()
				     .aClass287_4386),
				    Class21
					.myPlayer
					.method10874().aClass287_4386));
			    int i_72_ = (int) class287.aFloat4477;
			    int i_73_ = (int) class287.aFloat4479;
			    method17966(class103, class266,
					aClass89Array11435[0], (long) i_72_,
					(long) i_73_,
					1105497879 * class192.anInt2292,
					92160000L);
			}
		    }
		    if (2 == -1685117145 * class192.anInt2288) {
			Class287 class287
			    = (Class21.myPlayer
				   .method10874
			       ().aClass287_4386);
			long l = (long) (1718000347 * class192.anInt2289
					 - (int) class287.aFloat4477);
			long l_74_ = (long) (-1357301451 * class192.anInt2290
					     - (int) class287.aFloat4479);
			long l_75_
			    = (long) (1020811893 * class192.anInt2293 << 9);
			l_75_ *= l_75_;
			method17966(class103, class266, aClass89Array11435[0],
				    l, l_74_, 1105497879 * class192.anInt2292,
				    l_75_);
		    }
		    if (10 == class192.anInt2288 * -1685117145
			&& class192.anInt2287 * 810214515 >= 0
			&& (810214515 * class192.anInt2287
			    < (client
			       .localPlayers).length)) {
			Player class475_sub1_sub1_sub3_sub1_76_
			    = (client.localPlayers
			       [class192.anInt2287 * 810214515]);
			if (class475_sub1_sub1_sub3_sub1_76_ != null) {
			    Class287 class287
				= (Class287.method5578
				   (class475_sub1_sub1_sub3_sub1_76_
					.method10874().aClass287_4386,
				    Class21
					.myPlayer
					.method10874().aClass287_4386));
			    int i_77_ = (int) class287.aFloat4477;
			    int i_78_ = (int) class287.aFloat4479;
			    method17966(class103, class266,
					aClass89Array11435[0], (long) i_77_,
					(long) i_78_,
					1105497879 * class192.anInt2292,
					92160000L);
			}
		    }
		}
	    }
	}
	class266.method5175(class266_67_);
	class266.method5133(0.0F,
			    (float) (-5
				     - (((Player) this)
					.anInt11399) * -1554267337),
			    0.0F);
	if (aClass97Array8748 == null
	    || aClass97Array8748.length < aClass89Array11435.length)
	    method14465(aClass89Array11435.length, 190950748);
	if (class542 == null)
	    class542 = Class128.method3016(true, -2143176949);
	method17775(class103, aClass89Array11435, class266, false,
		    -1947638283);
	for (int i_79_ = 0; i_79_ < aClass89Array11435.length; i_79_++) {
	    if (aClass89Array11435[i_79_] != null)
		aClass89Array11435[i_79_].method1890
		    (class266, aClass97Array8748[i_79_],
		     (Class21.myPlayer == this ? 1
		      : 0));
	    else
		aClass97Array8748[i_79_].aBool1352 = false;
	}
	if (aClass489_11420 != null) {
	    Class98 class98 = ((Player) this)
				  .aClass489_11420.method11164();
	    class103.method2305(class98);
	}
	for (int i_80_ = 0; i_80_ < aClass89Array11435.length; i_80_++) {
	    if (aClass89Array11435[i_80_] != null)
		aBool11432
		    |= aClass89Array11435[i_80_].method2052();
	    aClass89Array11435[i_80_] = null;
	}
	anInt11376 = client.anInt8407 * -96196995;
	return class542;
    }
    
    int method17860(short i) {
	return anInt11515 * 710117003;
    }
    
    public Class241_Sub16 method3(int i) {
    	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
    	return Class2.method459(nodePlane,
				((int) method10874().aClass287_4386.aFloat4477
				 + 947401216 * class522.baseX),
				-(int) method10874().aClass287_4386.aFloat4474,
				((int) method10874().aClass287_4386.aFloat4479
				 + class522.baseY * -616117760),
				(byte) 39);
    }
    
    boolean method14448(Class103 class103, int i, int i_81_, int i_82_) {
	if (aClass490_11499 == null
	    || !method17957(class103, 131072, 607179102))
	    return false;
	Class266 class266 = method10893();
	boolean bool = false;
	for (int i_83_ = 0; i_83_ < aClass89Array11435.length; i_83_++) {
	    if (null != aClass89Array11435[i_83_]
		&& aClass89Array11435[i_83_].method1891(i, i_81_, class266,
							true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_84_ = 0; i_84_ < aClass89Array11435.length; i_84_++)
	    aClass89Array11435[i_84_] = null;
	return bool;
    }
    
    final boolean method14450(int i) {
	return false;
    }
    
    final void method14453(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_85_, int i_86_, boolean bool,
			   int i_87_) {
	throw new IllegalStateException();
    }
    
    public final void method17964(RSByteBuffer class241_sub3) {
	class241_sub3.pointer = 0;
	int i = class241_sub3.readUnsignedByte((byte) 6);
	byte i_88_ = (byte) (i & 0x1);
	boolean bool = 0 != (i & 0x4);
	int i_89_ = super.method17782(-358861499);
	method17781((i >> 3 & 0x7) + 1, (byte) -51);
	boolean bool_90_ = (i & 0x40) != 0;
	boolean bool_91_ = (i & 0x80) != 0;
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477 += (float) (method17782(-67016672) - i_89_ << 8);
	class287.aFloat4479 += (float) (method17782(-770720579) - i_89_ << 8);
	method10898(class287);
	class287.method5564();
	if (bool_90_)
	    prefixTitle
		= class241_sub3.readJagString(-1912340560);
	else
	    prefixTitle = null;
	if (bool_91_)
	    suffixTitle
		= class241_sub3.readJagString(-1226737353);
	else
	    suffixTitle = null;
	hidden = class241_sub3.getByte(-692130438) == 1;
	if (Class416.aClass470_6012 == Class470.aClass470_6345
	    && 482866503 * client.playerRights >= 2)
	    hidden = false;
	decodeAppearance(class241_sub3, i_88_, (short) -32320);
	nameFiltered = class241_sub3.readString(138382758);
	nameUnfiltered = nameFiltered;
	if (this == Class21.myPlayer)
	    RuntimeException_Sub3.myPlayerDisplayName = nameFiltered;
	anInt11502 = class241_sub3.readUnsignedByte((byte) 77) * 1928498121;
	if (bool) {
	    anInt11516 = class241_sub3.readUnsignedShort(1162222719) * -162920741;
	    if (65535 == 1682998611 * anInt11516)
		anInt11516 = 162920741;
	    anInt11503 = anInt11502 * 1523604377;
	    anInt11504 = -254862605;
	} else {
	    anInt11516 = 0;
	    anInt11503 = class241_sub3.readUnsignedByte((byte) 83) * 670432801;
	    anInt11504 = class241_sub3.readUnsignedByte((byte) -17) * 254862605;
	    if (anInt11504 * -870747707 == 255)
		anInt11504 = -254862605;
	}
	int i_92_ = 1294463297 * anInt11513;
	anInt11513 = class241_sub3.readUnsignedByte((byte) -44) * -776102207;
	if (0 != anInt11513 * 1294463297) {
	    int i_93_ = anInt11509 * -196777165;
	    int i_94_ = anInt11510 * -405630403;
	    int i_95_ = anInt11505 * 446821985;
	    int i_96_ = 869941981 * anInt11512;
	    int i_97_ = anInt11514 * -603334023;
	    anInt11509 = class241_sub3.readUnsignedShort(1162222719) * -906459141;
	    anInt11510 = class241_sub3.readUnsignedShort(1162222719) * 1062671637;
	    anInt11505 = class241_sub3.readUnsignedShort(1162222719) * 502607265;
	    anInt11512 = class241_sub3.readUnsignedShort(1162222719) * 1423156597;
	    anInt11514 = class241_sub3.readUnsignedByte((byte) 94) * -124686391;
	    if (anInt11513 * 1294463297 != i_92_
		|| i_93_ != anInt11509 * -196777165
		|| i_94_ != -405630403 * anInt11510
		|| i_95_ != 446821985 * anInt11505
		|| anInt11512 * 869941981 != i_96_
		|| i_97_ != anInt11514 * -603334023)
		Class4.method474(this, -1177368634);
	} else
	    Class361_Sub1.method16755(this, 1482319719);
    }
    
    final void method14454(byte i) {
	throw new IllegalStateException();
    }
    
    public Class249 method17792(int i) {
	if (aClass249_11387 != null) {
	    if (null == ((Class249) (aClass249_11387)).aString3993)
		return null;
	    if (0 == 1460689079 * client.publicChatStatus
		|| 1460689079 * client.publicChatStatus == 3
		|| (1 == 1460689079 * client.publicChatStatus && Class443.isFriend(nameUnfiltered, (byte) 64))) {
		return aClass249_11387;
            }
	}
	return null;
    }
    
    void method14476(Class103 class103) {
	if (aClass490_11499 != null
	    && (aBool11433
		|| method17957(class103, 0, -1224746406))) {
	    Class266 class266 = class103.method2595();
	    class266.method5186(method10874());
	    class266.method5133(0.0F, -5.0F, 0.0F);
	    method17775(class103, aClass89Array11435, class266,
			aBool11433,
			-1947638283);
	    for (int i = 0; i < aClass89Array11435.length; i++)
		aClass89Array11435[i] = null;
	}
    }
    
    public Class67 method14(int i) {
	return Class67.aClass67_1054;
    }
    
    Class542 method14472(Class103 class103) {
	if (aClass490_11499 == null
	    || !method17957(class103, 2048, -348766185))
	    return null;
	Class266 class266 = class103.method2595();
	Class266 class266_98_ = method10893();
	Class276 class276 = method10874();
	int i = aClass8_11406.method514((byte) -37);
	Class548 class548
	    = (aClass552_8744.aClass548ArrayArrayArray7169[nodePlane]
	       [(int) class276.aClass287_4386.aFloat4477 >> 9]
	       [(int) class276.aClass287_4386.aFloat4479 >> 9]);
	if (null != class548 && class548.aClass475_Sub1_Sub4_7058 != null) {
	    int i_99_ = ((-1554267337
			  * anInt11399)
			 - class548.aClass475_Sub1_Sub4_7058.aShort10742);
	    anInt11399
		= (int) ((float) ((((Player) this)
				   .anInt11399)
				  * -1554267337)
			 - (float) i_99_ / 10.0F) * 665281159;
	} else
	    anInt11399
		= (int) ((float) (-1554267337
				  * (((Player) this)
				     .anInt11399))
			 - (float) (-1554267337
				    * (((Player) this)
				       .anInt11399)) / 10.0F) * 665281159;
	class266.method5175(class266_98_);
	class266.method5133(0.0F,
			    (float) (-20 - (-1554267337
					    * ((Player)
					       this).anInt11399)),
			    0.0F);
	Class542 class542 = null;
	aBool11432 = false;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		.method14854(921069675)
	    == 1) {
	    Class554 class554 = method17787(997735524);
	    if (class554.aBool7246
		&& (-1 == -614581637 * aClass490_11499.anInt6508
		    || (MasterIndex.npcDefLoader.getNpcDefinition
			(-614581637 * aClass490_11499.anInt6508, -1602513604)
			.aBool5831))) {
		Class409 class409
		    = ((aClass409_11375.method7364(954025952)
			&& aClass409_11375.method7349(-294930050))
		       ? aClass409_11375 : null);
		Class409_Sub1 class409_sub1
		    = ((aClass409_Sub1_11405.method7364(-202893940)
			&& (!aClass409_Sub1_11405.aBool8600
			    || class409 == null))
		       ? aClass409_Sub1_11405 : null);
		short i_100_ = Class128.aClass513_1589.aShort6719;
		byte i_101_ = Class128.aClass513_1589.aByte6713;
		if (-1 != -614581637 * aClass490_11499.anInt6508) {
		    i_100_ = (MasterIndex.npcDefLoader.getNpcDefinition
			      (aClass490_11499.anInt6508 * -614581637,
			       -1324248409)
			      .aShort5806);
		    i_101_ = (MasterIndex.npcDefLoader.getNpcDefinition
			      (-614581637 * aClass490_11499.anInt6508,
			       -1778740165)
			      .aByte5847);
		}
		//Object object = null;
		Class89 class89;
		if (i_100_ > -1
		    && Class241_Sub5_Sub9.aClass241_Sub9_11043
			   .aClass445_Sub33_8890.method14529(-485668821) == 1)
		    class89
			= (Class520.method11694
			   (class103, i,
			    -195854529 * (((Player) this)
					  .anInt11383),
			    (anInt11384
			     * -192864185),
			    (anInt11385
			     * -389722201),
			    aClass89Array11435[0], i_100_, i_101_,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    675810206));
		else
		    class89
			= (Class477.method10920
			   (class103, i,
			    -195854529 * (((Player) this)
					  .anInt11383),
			    (anInt11384
			     * -192864185),
			    (anInt11385
			     * -389722201),
			    1, aClass89Array11435[0], 0, 0, 160, 240,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    -1741477646));
		if (null != class89) {
		    if (null == aClass97Array8748
			|| (aClass97Array8748.length
			    < aClass89Array11435.length + 1))
			method14465(1 + aClass89Array11435.length, -315411668);
		    class542 = Class128.method3016(true, -2081215555);
		    aBool11432 = true;
		    class103.method2308(false);
		    class89.method1890(class266,
				       (aClass97Array8748
					[aClass89Array11435.length]),
				       0);
		    class103.method2308(true);
		}
	    }
	}
	if (this == Class21.myPlayer) {
	    for (int i_102_ = client.aClass192Array8301.length - 1;
		 i_102_ >= 0; i_102_--) {
		Class192 class192 = client.aClass192Array8301[i_102_];
		if (null != class192
		    && class192.anInt2292 * 1105497879 != -1) {
		    if (1 == class192.anInt2288 * -1685117145) {
			ObjectNode class241_sub26
			    = ((ObjectNode)
			       (client.aClass407_8457.get
				((long) (class192.anInt2287 * 810214515))));
			if (class241_sub26 != null) {
			    NPC class475_sub1_sub1_sub3_sub2
				= ((NPC)
				   class241_sub26.objectValue);
			    Class287 class287
				= (Class287.method5578
				   ((class475_sub1_sub1_sub3_sub2.method10874()
				     .aClass287_4386),
				    Class21
					.myPlayer
					.method10874().aClass287_4386));
			    int i_103_ = (int) class287.aFloat4477;
			    int i_104_ = (int) class287.aFloat4479;
			    method17966(class103, class266,
					aClass89Array11435[0], (long) i_103_,
					(long) i_104_,
					1105497879 * class192.anInt2292,
					92160000L);
			}
		    }
		    if (2 == -1685117145 * class192.anInt2288) {
			Class287 class287
			    = (Class21.myPlayer
				   .method10874
			       ().aClass287_4386);
			long l = (long) (1718000347 * class192.anInt2289
					 - (int) class287.aFloat4477);
			long l_105_ = (long) (-1357301451 * class192.anInt2290
					      - (int) class287.aFloat4479);
			long l_106_
			    = (long) (1020811893 * class192.anInt2293 << 9);
			l_106_ *= l_106_;
			method17966(class103, class266, aClass89Array11435[0],
				    l, l_105_, 1105497879 * class192.anInt2292,
				    l_106_);
		    }
		    if (10 == class192.anInt2288 * -1685117145
			&& class192.anInt2287 * 810214515 >= 0
			&& (810214515 * class192.anInt2287
			    < (client
			       .localPlayers).length)) {
			Player class475_sub1_sub1_sub3_sub1_107_
			    = (client.localPlayers
			       [class192.anInt2287 * 810214515]);
			if (class475_sub1_sub1_sub3_sub1_107_ != null) {
			    Class287 class287
				= (Class287.method5578
				   (class475_sub1_sub1_sub3_sub1_107_
					.method10874().aClass287_4386,
				    Class21
					.myPlayer
					.method10874().aClass287_4386));
			    int i_108_ = (int) class287.aFloat4477;
			    int i_109_ = (int) class287.aFloat4479;
			    method17966(class103, class266,
					aClass89Array11435[0], (long) i_108_,
					(long) i_109_,
					1105497879 * class192.anInt2292,
					92160000L);
			}
		    }
		}
	    }
	}
	class266.method5175(class266_98_);
	class266.method5133(0.0F,
			    (float) (-5
				     - (((Player) this)
					.anInt11399) * -1554267337),
			    0.0F);
	if (aClass97Array8748 == null
	    || aClass97Array8748.length < aClass89Array11435.length)
	    method14465(aClass89Array11435.length, 282114981);
	if (class542 == null)
	    class542 = Class128.method3016(true, -2125717120);
	method17775(class103, aClass89Array11435, class266, false,
		    -1947638283);
	for (int i_110_ = 0; i_110_ < aClass89Array11435.length; i_110_++) {
	    if (aClass89Array11435[i_110_] != null)
		aClass89Array11435[i_110_].method1890
		    (class266, aClass97Array8748[i_110_],
		     (Class21.myPlayer == this ? 1
		      : 0));
	    else
		aClass97Array8748[i_110_].aBool1352 = false;
	}
	if (aClass489_11420 != null) {
	    Class98 class98 = ((Player) this)
				  .aClass489_11420.method11164();
	    class103.method2305(class98);
	}
	for (int i_111_ = 0; i_111_ < aClass89Array11435.length; i_111_++) {
	    if (aClass89Array11435[i_111_] != null)
		aBool11432
		    |= aClass89Array11435[i_111_].method2052();
	    aClass89Array11435[i_111_] = null;
	}
	anInt11376 = client.anInt8407 * -96196995;
	return class542;
    }
    
    public Class535 method14470(Class103 class103) {
	return null;
    }
    
    public Class278 method13(int i) {
	Class278 class278 = Class278.method5414();
	class278.method5395(Class282.method5490(-267726731
						* aClass8_11406.anInt44),
			    0.0F, 0.0F);
	return class278;
    }
    
    public void method17965(int i, int i_112_) {
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = i;
	scenePositionYQueue[0] = i_112_;
	int i_113_ = method17782(2003606149);
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) (256 * i_113_ + 512 * scenePositionXQueue[0]);
	class287.aFloat4479
	    = (float) (i_113_ * 256 + scenePositionYQueue[0] * 512);
	method10898(class287);
	class287.method5564();
	if (this == Class21.myPlayer)
	    client.aClass238_8477.method4833(2013657464)
		.method11400(-183020359);
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    void method17966(Class103 class103, Class266 class266, Class89 class89,
		     long l, long l_114_, int i, long l_115_) {
	long l_116_ = l * l + l_114_ * l_114_;
	if (l_116_ >= 262144L && l_116_ <= l_115_) {
	    int i_117_
		= ((int) ((Math.atan2((double) l, (double) l_114_)
			   * 2607.5945876176133)
			  - (double) aClass8_11406.method514((byte) -42))
		   & 0x3fff);
	    Class89 class89_118_
		= Class477.method10922(class103, i_117_,
				       (((Player) this)
					.anInt11383) * -195854529,
				       (((Player) this)
					.anInt11384) * -192864185,
				       (((Player) this)
					.anInt11385) * -389722201,
				       i, 243074879);
	    if (null != class89_118_) {
		class103.method2308(false);
		class89_118_.method1890(class266, null, 0);
		class103.method2308(true);
	    }
	}
    }
    
    public Class67 method6() {
	return Class67.aClass67_1054;
    }
    
    public Class67 method7() {
	return Class67.aClass67_1054;
    }
    
    public void method17967(int i, int i_119_) {
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = i;
	scenePositionYQueue[0] = i_119_;
	int i_120_ = method17782(327748615);
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) (256 * i_120_ + 512 * scenePositionXQueue[0]);
	class287.aFloat4479
	    = (float) (i_120_ * 256 + scenePositionYQueue[0] * 512);
	method10898(class287);
	class287.method5564();
	if (this == Class21.myPlayer)
	    client.aClass238_8477.method4833(1475791281)
		.method11400(1535699712);
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    public int method9() {
	return -546698383 * entityIndex;
    }
    
    public int method10() {
	return -546698383 * entityIndex;
    }
    
    public int method11() {
	return -546698383 * entityIndex;
    }
    
    public int method2(byte i) {
	return -546698383 * entityIndex;
    }
    
    public Class241_Sub16 method4() {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	return Class2.method459(nodePlane,
				((int) method10874().aClass287_4386.aFloat4477
				 + 947401216 * class522.baseX),
				-(int) method10874().aClass287_4386.aFloat4474,
				((int) method10874().aClass287_4386.aFloat4479
				 + class522.baseY * -616117760),
				(byte) 67);
    }
    
    public int method17867() {
	return -1;
    }
    
    public Class278 method15() {
	Class278 class278 = Class278.method5414();
	class278.method5395(Class282.method5490(-267726731
						* aClass8_11406.anInt44),
			    0.0F, 0.0F);
	return class278;
    }
    
    public Class278 method16() {
	Class278 class278 = Class278.method5414();
	class278.method5395(Class282.method5490(-267726731
						* aClass8_11406.anInt44),
			    0.0F, 0.0F);
	return class278;
    }
    
    public Class278 method1() {
	Class278 class278 = Class278.method5414();
	class278.method5395(Class282.method5490(-267726731
						* aClass8_11406.anInt44),
			    0.0F, 0.0F);
	return class278;
    }
    
    public String method17968(boolean bool) {
		if (bool)
		    return nameFiltered;
		return nameUnfiltered;
    }
    
    public Class287 method19() {
	return Class287.method5560();
    }
    
    final void method14478() {
	throw new IllegalStateException();
    }
    
    public Class249 method17868() {
	if (aClass249_11387 != null) {
	    if (null == ((Class249) (((Player) this)
				     .aClass249_11387)).aString3993)
		return null;
	    if (0 == 1460689079 * client.publicChatStatus
		|| 1460689079 * client.publicChatStatus == 3
		|| (1 == 1460689079 * client.publicChatStatus
		    && Class443.isFriend(nameUnfiltered, (byte) 64)))
		return aClass249_11387;
	}
	return null;
    }
    
    Class542 method14473(Class103 class103) {
	if (aClass490_11499 == null
	    || !method17957(class103, 2048, 1250982650))
	    return null;
	Class266 class266 = class103.method2595();
	Class266 class266_121_ = method10893();
	Class276 class276 = method10874();
	int i = aClass8_11406.method514((byte) -41);
	Class548 class548
	    = (aClass552_8744.aClass548ArrayArrayArray7169[nodePlane]
	       [(int) class276.aClass287_4386.aFloat4477 >> 9]
	       [(int) class276.aClass287_4386.aFloat4479 >> 9]);
	if (null != class548 && class548.aClass475_Sub1_Sub4_7058 != null) {
	    int i_122_ = ((-1554267337
			   * anInt11399)
			  - class548.aClass475_Sub1_Sub4_7058.aShort10742);
	    anInt11399
		= (int) ((float) ((((Player) this)
				   .anInt11399)
				  * -1554267337)
			 - (float) i_122_ / 10.0F) * 665281159;
	} else
	    anInt11399
		= (int) ((float) (-1554267337
				  * (((Player) this)
				     .anInt11399))
			 - (float) (-1554267337
				    * (((Player) this)
				       .anInt11399)) / 10.0F) * 665281159;
	class266.method5175(class266_121_);
	class266.method5133(0.0F,
			    (float) (-20 - (-1554267337
					    * ((Player)
					       this).anInt11399)),
			    0.0F);
	Class542 class542 = null;
	aBool11432 = false;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		.method14854(-50766043)
	    == 1) {
	    Class554 class554 = method17787(451472414);
	    if (class554.aBool7246
		&& (-1 == -614581637 * aClass490_11499.anInt6508
		    || (MasterIndex.npcDefLoader.getNpcDefinition
			(-614581637 * aClass490_11499.anInt6508, -1880058765)
			.aBool5831))) {
		Class409 class409
		    = ((aClass409_11375.method7364(586234522)
			&& aClass409_11375.method7349(-1368621837))
		       ? aClass409_11375 : null);
		Class409_Sub1 class409_sub1
		    = ((aClass409_Sub1_11405.method7364(-598812451)
			&& (!aClass409_Sub1_11405.aBool8600
			    || class409 == null))
		       ? aClass409_Sub1_11405 : null);
		short i_123_ = Class128.aClass513_1589.aShort6719;
		byte i_124_ = Class128.aClass513_1589.aByte6713;
		if (-1 != -614581637 * aClass490_11499.anInt6508) {
		    i_123_
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   (aClass490_11499.anInt6508 * -614581637, -576879262)
			   .aShort5806);
		    i_124_ = (MasterIndex.npcDefLoader.getNpcDefinition
			      (-614581637 * aClass490_11499.anInt6508,
			       -1510466934)
			      .aByte5847);
		}
		//Object object = null;
		Class89 class89;
		if (i_123_ > -1
		    && Class241_Sub5_Sub9.aClass241_Sub9_11043
			   .aClass445_Sub33_8890.method14529(-485668821) == 1)
		    class89
			= (Class520.method11694
			   (class103, i,
			    -195854529 * (((Player) this)
					  .anInt11383),
			    (anInt11384
			     * -192864185),
			    (anInt11385
			     * -389722201),
			    aClass89Array11435[0], i_123_, i_124_,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    201932135));
		else
		    class89
			= (Class477.method10920
			   (class103, i,
			    -195854529 * (((Player) this)
					  .anInt11383),
			    (anInt11384
			     * -192864185),
			    (anInt11385
			     * -389722201),
			    1, aClass89Array11435[0], 0, 0, 160, 240,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    1423308456));
		if (null != class89) {
		    if (null == aClass97Array8748
			|| (aClass97Array8748.length
			    < aClass89Array11435.length + 1))
			method14465(1 + aClass89Array11435.length, 1350181231);
		    class542 = Class128.method3016(true, -2103810505);
		    aBool11432 = true;
		    class103.method2308(false);
		    class89.method1890(class266,
				       (aClass97Array8748
					[aClass89Array11435.length]),
				       0);
		    class103.method2308(true);
		}
	    }
	}
	if (this == Class21.myPlayer) {
	    for (int i_125_ = client.aClass192Array8301.length - 1;
		 i_125_ >= 0; i_125_--) {
		Class192 class192 = client.aClass192Array8301[i_125_];
		if (null != class192
		    && class192.anInt2292 * 1105497879 != -1) {
		    if (1 == class192.anInt2288 * -1685117145) {
			ObjectNode class241_sub26
			    = ((ObjectNode)
			       (client.aClass407_8457.get
				((long) (class192.anInt2287 * 810214515))));
			if (class241_sub26 != null) {
			    NPC class475_sub1_sub1_sub3_sub2
				= ((NPC)
				   class241_sub26.objectValue);
			    Class287 class287
				= (Class287.method5578
				   ((class475_sub1_sub1_sub3_sub2.method10874()
				     .aClass287_4386),
				    Class21
					.myPlayer
					.method10874().aClass287_4386));
			    int i_126_ = (int) class287.aFloat4477;
			    int i_127_ = (int) class287.aFloat4479;
			    method17966(class103, class266,
					aClass89Array11435[0], (long) i_126_,
					(long) i_127_,
					1105497879 * class192.anInt2292,
					92160000L);
			}
		    }
		    if (2 == -1685117145 * class192.anInt2288) {
			Class287 class287
			    = (Class21.myPlayer
				   .method10874
			       ().aClass287_4386);
			long l = (long) (1718000347 * class192.anInt2289
					 - (int) class287.aFloat4477);
			long l_128_ = (long) (-1357301451 * class192.anInt2290
					      - (int) class287.aFloat4479);
			long l_129_
			    = (long) (1020811893 * class192.anInt2293 << 9);
			l_129_ *= l_129_;
			method17966(class103, class266, aClass89Array11435[0],
				    l, l_128_, 1105497879 * class192.anInt2292,
				    l_129_);
		    }
		    if (10 == class192.anInt2288 * -1685117145
			&& class192.anInt2287 * 810214515 >= 0
			&& (810214515 * class192.anInt2287
			    < (client
			       .localPlayers).length)) {
			Player class475_sub1_sub1_sub3_sub1_130_
			    = (client.localPlayers
			       [class192.anInt2287 * 810214515]);
			if (class475_sub1_sub1_sub3_sub1_130_ != null) {
			    Class287 class287
				= (Class287.method5578
				   (class475_sub1_sub1_sub3_sub1_130_
					.method10874().aClass287_4386,
				    Class21
					.myPlayer
					.method10874().aClass287_4386));
			    int i_131_ = (int) class287.aFloat4477;
			    int i_132_ = (int) class287.aFloat4479;
			    method17966(class103, class266,
					aClass89Array11435[0], (long) i_131_,
					(long) i_132_,
					1105497879 * class192.anInt2292,
					92160000L);
			}
		    }
		}
	    }
	}
	class266.method5175(class266_121_);
	class266.method5133(0.0F,
			    (float) (-5
				     - (((Player) this)
					.anInt11399) * -1554267337),
			    0.0F);
	if (aClass97Array8748 == null
	    || aClass97Array8748.length < aClass89Array11435.length)
	    method14465(aClass89Array11435.length, 562925019);
	if (class542 == null)
	    class542 = Class128.method3016(true, -2108409877);
	method17775(class103, aClass89Array11435, class266, false,
		    -1947638283);
	for (int i_133_ = 0; i_133_ < aClass89Array11435.length; i_133_++) {
	    if (aClass89Array11435[i_133_] != null)
		aClass89Array11435[i_133_].method1890
		    (class266, aClass97Array8748[i_133_],
		     (Class21.myPlayer == this ? 1
		      : 0));
	    else
		aClass97Array8748[i_133_].aBool1352 = false;
	}
	if (aClass489_11420 != null) {
	    Class98 class98 = ((Player) this)
				  .aClass489_11420.method11164();
	    class103.method2305(class98);
	}
	for (int i_134_ = 0; i_134_ < aClass89Array11435.length; i_134_++) {
	    if (aClass89Array11435[i_134_] != null)
		aBool11432
		    |= aClass89Array11435[i_134_].method2052();
	    aClass89Array11435[i_134_] = null;
	}
	anInt11376 = client.anInt8407 * -96196995;
	return class542;
    }
    
    public boolean method17853(short i) {
	return Class128.aClass513_1589.playerShouldDisplayChat;
    }
    
    Class542 method14475(Class103 class103) {
	if (aClass490_11499 == null
	    || !method17957(class103, 2048, -1404454247))
	    return null;
	Class266 class266 = class103.method2595();
	Class266 class266_135_ = method10893();
	Class276 class276 = method10874();
	int i = aClass8_11406.method514((byte) -81);
	Class548 class548
	    = (aClass552_8744.aClass548ArrayArrayArray7169[nodePlane]
	       [(int) class276.aClass287_4386.aFloat4477 >> 9]
	       [(int) class276.aClass287_4386.aFloat4479 >> 9]);
	if (null != class548 && class548.aClass475_Sub1_Sub4_7058 != null) {
	    int i_136_ = ((-1554267337
			   * anInt11399)
			  - class548.aClass475_Sub1_Sub4_7058.aShort10742);
	    anInt11399
		= (int) ((float) ((((Player) this)
				   .anInt11399)
				  * -1554267337)
			 - (float) i_136_ / 10.0F) * 665281159;
	} else
	    anInt11399
		= (int) ((float) (-1554267337
				  * (((Player) this)
				     .anInt11399))
			 - (float) (-1554267337
				    * (((Player) this)
				       .anInt11399)) / 10.0F) * 665281159;
	class266.method5175(class266_135_);
	class266.method5133(0.0F,
			    (float) (-20 - (-1554267337
					    * ((Player)
					       this).anInt11399)),
			    0.0F);
	Class542 class542 = null;
	aBool11432 = false;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		.method14854(-277247420)
	    == 1) {
	    Class554 class554 = method17787(731811552);
	    if (class554.aBool7246
		&& (-1 == -614581637 * aClass490_11499.anInt6508
		    || (MasterIndex.npcDefLoader.getNpcDefinition
			(-614581637 * aClass490_11499.anInt6508, -915167307)
			.aBool5831))) {
		Class409 class409 = ((aClass409_11375.method7364(359096358)
				      && aClass409_11375.method7349(193019337))
				     ? aClass409_11375 : null);
		Class409_Sub1 class409_sub1
		    = ((aClass409_Sub1_11405.method7364(525637368)
			&& (!aClass409_Sub1_11405.aBool8600
			    || class409 == null))
		       ? aClass409_Sub1_11405 : null);
		short i_137_ = Class128.aClass513_1589.aShort6719;
		byte i_138_ = Class128.aClass513_1589.aByte6713;
		if (-1 != -614581637 * aClass490_11499.anInt6508) {
		    i_137_ = (MasterIndex.npcDefLoader.getNpcDefinition
			      (aClass490_11499.anInt6508 * -614581637,
			       -1424851752)
			      .aShort5806);
		    i_138_
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   (-614581637 * aClass490_11499.anInt6508, -562600505)
			   .aByte5847);
		}
		//Object object = null;
		Class89 class89;
		if (i_137_ > -1
		    && Class241_Sub5_Sub9.aClass241_Sub9_11043
			   .aClass445_Sub33_8890.method14529(-485668821) == 1)
		    class89
			= (Class520.method11694
			   (class103, i,
			    -195854529 * (((Player) this)
					  .anInt11383),
			    (anInt11384
			     * -192864185),
			    (anInt11385
			     * -389722201),
			    aClass89Array11435[0], i_137_, i_138_,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    2124702796));
		else
		    class89
			= (Class477.method10920
			   (class103, i,
			    -195854529 * (((Player) this)
					  .anInt11383),
			    (anInt11384
			     * -192864185),
			    (anInt11385
			     * -389722201),
			    1, aClass89Array11435[0], 0, 0, 160, 240,
			    (class409_sub1 != null ? (Class409) class409_sub1
			     : class409),
			    -1630514246));
		if (null != class89) {
		    if (null == aClass97Array8748
			|| (aClass97Array8748.length
			    < aClass89Array11435.length + 1))
			method14465(1 + aClass89Array11435.length, 1751451806);
		    class542 = Class128.method3016(true, -2136861744);
		    aBool11432 = true;
		    class103.method2308(false);
		    class89.method1890(class266,
				       (aClass97Array8748
					[aClass89Array11435.length]),
				       0);
		    class103.method2308(true);
		}
	    }
	}
	if (this == Class21.myPlayer) {
	    for (int i_139_ = client.aClass192Array8301.length - 1;
		 i_139_ >= 0; i_139_--) {
		Class192 class192 = client.aClass192Array8301[i_139_];
		if (null != class192
		    && class192.anInt2292 * 1105497879 != -1) {
		    if (1 == class192.anInt2288 * -1685117145) {
			ObjectNode class241_sub26
			    = ((ObjectNode)
			       (client.aClass407_8457.get
				((long) (class192.anInt2287 * 810214515))));
			if (class241_sub26 != null) {
			    NPC class475_sub1_sub1_sub3_sub2
				= ((NPC)
				   class241_sub26.objectValue);
			    Class287 class287
				= (Class287.method5578
				   ((class475_sub1_sub1_sub3_sub2.method10874()
				     .aClass287_4386),
				    Class21
					.myPlayer
					.method10874().aClass287_4386));
			    int i_140_ = (int) class287.aFloat4477;
			    int i_141_ = (int) class287.aFloat4479;
			    method17966(class103, class266,
					aClass89Array11435[0], (long) i_140_,
					(long) i_141_,
					1105497879 * class192.anInt2292,
					92160000L);
			}
		    }
		    if (2 == -1685117145 * class192.anInt2288) {
			Class287 class287
			    = (Class21.myPlayer
				   .method10874
			       ().aClass287_4386);
			long l = (long) (1718000347 * class192.anInt2289
					 - (int) class287.aFloat4477);
			long l_142_ = (long) (-1357301451 * class192.anInt2290
					      - (int) class287.aFloat4479);
			long l_143_
			    = (long) (1020811893 * class192.anInt2293 << 9);
			l_143_ *= l_143_;
			method17966(class103, class266, aClass89Array11435[0],
				    l, l_142_, 1105497879 * class192.anInt2292,
				    l_143_);
		    }
		    if (10 == class192.anInt2288 * -1685117145
			&& class192.anInt2287 * 810214515 >= 0
			&& (810214515 * class192.anInt2287
			    < (client
			       .localPlayers).length)) {
			Player class475_sub1_sub1_sub3_sub1_144_
			    = (client.localPlayers
			       [class192.anInt2287 * 810214515]);
			if (class475_sub1_sub1_sub3_sub1_144_ != null) {
			    Class287 class287
				= (Class287.method5578
				   (class475_sub1_sub1_sub3_sub1_144_
					.method10874().aClass287_4386,
				    Class21
					.myPlayer
					.method10874().aClass287_4386));
			    int i_145_ = (int) class287.aFloat4477;
			    int i_146_ = (int) class287.aFloat4479;
			    method17966(class103, class266,
					aClass89Array11435[0], (long) i_145_,
					(long) i_146_,
					1105497879 * class192.anInt2292,
					92160000L);
			}
		    }
		}
	    }
	}
	class266.method5175(class266_135_);
	class266.method5133(0.0F,
			    (float) (-5
				     - (((Player) this)
					.anInt11399) * -1554267337),
			    0.0F);
	if (aClass97Array8748 == null
	    || aClass97Array8748.length < aClass89Array11435.length)
	    method14465(aClass89Array11435.length, 630420994);
	if (class542 == null)
	    class542 = Class128.method3016(true, -2126444975);
	method17775(class103, aClass89Array11435, class266, false,
		    -1947638283);
	for (int i_147_ = 0; i_147_ < aClass89Array11435.length; i_147_++) {
	    if (aClass89Array11435[i_147_] != null)
		aClass89Array11435[i_147_].method1890
		    (class266, aClass97Array8748[i_147_],
		     (Class21.myPlayer == this ? 1
		      : 0));
	    else
		aClass97Array8748[i_147_].aBool1352 = false;
	}
	if (aClass489_11420 != null) {
	    Class98 class98 = ((Player) this)
				  .aClass489_11420.method11164();
	    class103.method2305(class98);
	}
	for (int i_148_ = 0; i_148_ < aClass89Array11435.length; i_148_++) {
	    if (aClass89Array11435[i_148_] != null)
		aBool11432
		    |= aClass89Array11435[i_148_].method2052();
	    aClass89Array11435[i_148_] = null;
	}
	anInt11376 = client.anInt8407 * -96196995;
	return class542;
    }
    
    public void method17969(int i, int i_149_) {
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = i;
	scenePositionYQueue[0] = i_149_;
	int i_150_ = method17782(863570504);
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) (256 * i_150_ + 512 * scenePositionXQueue[0]);
	class287.aFloat4479
	    = (float) (i_150_ * 256 + scenePositionYQueue[0] * 512);
	method10898(class287);
	class287.method5564();
	if (this == Class21.myPlayer)
	    client.aClass238_8477.method4833(-941582189)
		.method11400(-20631064);
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    final boolean method14477() {
	return false;
    }
    
    public int method17832(int i) {
	return -(-546698383 * entityIndex) - 1;
    }
    
    final boolean method14479() {
	return false;
    }
    
    final void method14480(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_151_, int i_152_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method14481(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_153_, int i_154_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method14482(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_155_, int i_156_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method14483() {
	throw new IllegalStateException();
    }
    
    public int method17799(int i) {
	return -1;
    }
    
    public int method17829() {
	if (null != aClass490_11499
	    && -1 != aClass490_11499.anInt6508 * -614581637)
	    return ((MasterIndex.npcDefLoader.getNpcDefinition
		     (-614581637 * aClass490_11499.anInt6508, -744750074)
		     .size)
		    * 19489015);
	return super.method17782(924505684);
    }
    
    public int method17790() {
	if (null != aClass490_11499
	    && -1 != aClass490_11499.anInt6508 * -614581637)
	    return ((MasterIndex.npcDefLoader.getNpcDefinition
		     (-614581637 * aClass490_11499.anInt6508, -1279503609)
		     .size)
		    * 19489015);
	return super.method17782(143865131);
    }
    
    int method17843() {
	return anInt11515 * 710117003;
    }
    
    int method17844() {
	return anInt11515 * 710117003;
    }
    
    int method17845() {
	return anInt11515 * 710117003;
    }
    
    public boolean method17800() {
	return Class128.aClass513_1589.playerShouldDisplayChat;
    }
    
    public boolean method17770() {
	return Class128.aClass513_1589.playerShouldDisplayChat;
    }
    
    public boolean method17802() {
	return Class128.aClass513_1589.playerShouldDisplayChat;
    }
    
    public int method17865() {
	return -(-546698383 * entityIndex) - 1;
    }
    
    boolean method14488(Class103 class103, int i, int i_157_) {
	if (aClass490_11499 == null
	    || !method17957(class103, 131072, 144463071))
	    return false;
	Class266 class266 = method10893();
	boolean bool = false;
	for (int i_158_ = 0; i_158_ < aClass89Array11435.length; i_158_++) {
	    if (null != aClass89Array11435[i_158_]
		&& aClass89Array11435[i_158_].method1891(i, i_157_, class266,
							 true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_159_ = 0; i_159_ < aClass89Array11435.length; i_159_++)
	    aClass89Array11435[i_159_] = null;
	return bool;
    }
    
    public void method17970(String string, int i, int i_160_) {
	method17769(string, i, i_160_,
		    (Class70.method1725(-1166754123)
		     * (Class128.aClass513_1589.playerChatTimeout * -532154217)),
		    832077595);
    }
    
    public final void method17971(RSByteBuffer class241_sub3) {
	class241_sub3.pointer = 0;
	int i = class241_sub3.readUnsignedByte((byte) -82);
	byte i_161_ = (byte) (i & 0x1);
	boolean bool = 0 != (i & 0x4);
	int i_162_ = super.method17782(1211812223);
	method17781((i >> 3 & 0x7) + 1, (byte) 1);
	boolean bool_163_ = (i & 0x40) != 0;
	boolean bool_164_ = (i & 0x80) != 0;
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477 += (float) (method17782(-938957217) - i_162_ << 8);
	class287.aFloat4479 += (float) (method17782(-368873511) - i_162_ << 8);
	method10898(class287);
	class287.method5564();
	if (bool_163_)
	    prefixTitle
		= class241_sub3.readJagString(1835647126);
	else
	    prefixTitle = null;
	if (bool_164_)
	    suffixTitle
		= class241_sub3.readJagString(-1021682778);
	else
	    suffixTitle = null;
	hidden = class241_sub3.getByte(-988398571) == 1;
	if (Class416.aClass470_6012 == Class470.aClass470_6345
	    && 482866503 * client.playerRights >= 2)
	    hidden = false;
	decodeAppearance(class241_sub3, i_161_, (short) -15066);
	nameFiltered = class241_sub3.readString(1591189480);
	nameUnfiltered = nameFiltered;
	if (this == Class21.myPlayer)
	    RuntimeException_Sub3.myPlayerDisplayName = nameFiltered;
	anInt11502 = class241_sub3.readUnsignedByte((byte) -8) * 1928498121;
	if (bool) {
	    anInt11516 = class241_sub3.readUnsignedShort(1162222719) * -162920741;
	    if (65535 == 1682998611 * anInt11516)
		anInt11516 = 162920741;
	    anInt11503 = anInt11502 * 1523604377;
	    anInt11504 = -254862605;
	} else {
	    anInt11516 = 0;
	    anInt11503 = class241_sub3.readUnsignedByte((byte) 74) * 670432801;
	    anInt11504 = class241_sub3.readUnsignedByte((byte) 8) * 254862605;
	    if (anInt11504 * -870747707 == 255)
		anInt11504 = -254862605;
	}
	int i_165_ = 1294463297 * anInt11513;
	anInt11513 = class241_sub3.readUnsignedByte((byte) 32) * -776102207;
	if (0 != anInt11513 * 1294463297) {
	    int i_166_ = anInt11509 * -196777165;
	    int i_167_ = anInt11510 * -405630403;
	    int i_168_ = anInt11505 * 446821985;
	    int i_169_ = 869941981 * anInt11512;
	    int i_170_ = anInt11514 * -603334023;
	    anInt11509 = class241_sub3.readUnsignedShort(1162222719) * -906459141;
	    anInt11510 = class241_sub3.readUnsignedShort(1162222719) * 1062671637;
	    anInt11505 = class241_sub3.readUnsignedShort(1162222719) * 502607265;
	    anInt11512 = class241_sub3.readUnsignedShort(1162222719) * 1423156597;
	    anInt11514 = class241_sub3.readUnsignedByte((byte) -42) * -124686391;
	    if (anInt11513 * 1294463297 != i_165_
		|| i_166_ != anInt11509 * -196777165
		|| i_167_ != -405630403 * anInt11510
		|| i_168_ != 446821985 * anInt11505
		|| anInt11512 * 869941981 != i_169_
		|| i_170_ != anInt11514 * -603334023)
		Class4.method474(this, -1177368634);
	} else
	    Class361_Sub1.method16755(this, 1482319719);
    }
    
    public final void method17972(RSByteBuffer class241_sub3) {
	class241_sub3.pointer = 0;
	int i = class241_sub3.readUnsignedByte((byte) 54);
	byte i_171_ = (byte) (i & 0x1);
	boolean bool = 0 != (i & 0x4);
	int i_172_ = super.method17782(-1035397879);
	method17781((i >> 3 & 0x7) + 1, (byte) -34);
	boolean bool_173_ = (i & 0x40) != 0;
	boolean bool_174_ = (i & 0x80) != 0;
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477 += (float) (method17782(1283038977) - i_172_ << 8);
	class287.aFloat4479 += (float) (method17782(1778350481) - i_172_ << 8);
	method10898(class287);
	class287.method5564();
	if (bool_173_)
	    prefixTitle
		= class241_sub3.readJagString(748842930);
	else
	    prefixTitle = null;
	if (bool_174_)
	    suffixTitle
		= class241_sub3.readJagString(-623644824);
	else
	    suffixTitle = null;
	hidden = class241_sub3.getByte(577333560) == 1;
	if (Class416.aClass470_6012 == Class470.aClass470_6345
	    && 482866503 * client.playerRights >= 2)
	    hidden = false;
	decodeAppearance(class241_sub3, i_171_, (short) -4262);
	nameFiltered = class241_sub3.readString(1424513322);
	nameUnfiltered = nameFiltered;
	if (this == Class21.myPlayer)
	    RuntimeException_Sub3.myPlayerDisplayName = nameFiltered;
	anInt11502 = class241_sub3.readUnsignedByte((byte) 50) * 1928498121;
	if (bool) {
	    anInt11516 = class241_sub3.readUnsignedShort(1162222719) * -162920741;
	    if (65535 == 1682998611 * anInt11516)
		anInt11516 = 162920741;
	    anInt11503 = anInt11502 * 1523604377;
	    anInt11504 = -254862605;
	} else {
	    anInt11516 = 0;
	    anInt11503 = class241_sub3.readUnsignedByte((byte) -37) * 670432801;
	    anInt11504 = class241_sub3.readUnsignedByte((byte) -51) * 254862605;
	    if (anInt11504 * -870747707 == 255)
		anInt11504 = -254862605;
	}
	int i_175_ = 1294463297 * anInt11513;
	anInt11513 = class241_sub3.readUnsignedByte((byte) -67) * -776102207;
	if (0 != anInt11513 * 1294463297) {
	    int i_176_ = anInt11509 * -196777165;
	    int i_177_ = anInt11510 * -405630403;
	    int i_178_ = anInt11505 * 446821985;
	    int i_179_ = 869941981 * anInt11512;
	    int i_180_ = anInt11514 * -603334023;
	    anInt11509 = class241_sub3.readUnsignedShort(1162222719) * -906459141;
	    anInt11510 = class241_sub3.readUnsignedShort(1162222719) * 1062671637;
	    anInt11505 = class241_sub3.readUnsignedShort(1162222719) * 502607265;
	    anInt11512 = class241_sub3.readUnsignedShort(1162222719) * 1423156597;
	    anInt11514 = class241_sub3.readUnsignedByte((byte) -13) * -124686391;
	    if (anInt11513 * 1294463297 != i_175_
		|| i_176_ != anInt11509 * -196777165
		|| i_177_ != -405630403 * anInt11510
		|| i_178_ != 446821985 * anInt11505
		|| anInt11512 * 869941981 != i_179_
		|| i_180_ != anInt11514 * -603334023)
		Class4.method474(this, -1177368634);
	} else
	    Class361_Sub1.method16755(this, 1482319719);
    }
    
    void method17973() {
	for (int i = 0; i < anIntArray11508.length; i++)
	    anIntArray11508[i] = -1;
	for (int i = 0; i < anIntArray11501.length; i++)
	    anIntArray11501[i] = -1;
    }
    
    void method17974() {
	for (int i = 0; i < anIntArray11508.length; i++)
	    anIntArray11508[i] = -1;
	for (int i = 0; i < anIntArray11501.length; i++)
	    anIntArray11501[i] = -1;
    }
    
    void method17975(Class103 class103, Class266 class266, Class89 class89,
		     long l, long l_181_, int i, long l_182_) {
	long l_183_ = l * l + l_181_ * l_181_;
	if (l_183_ >= 262144L && l_183_ <= l_182_) {
	    int i_184_ = ((int) ((Math.atan2((double) l, (double) l_181_)
				  * 2607.5945876176133)
				 - (double) aClass8_11406.method514((byte) 12))
			  & 0x3fff);
	    Class89 class89_185_
		= Class477.method10922(class103, i_184_,
				       (((Player) this)
					.anInt11383) * -195854529,
				       (((Player) this)
					.anInt11384) * -192864185,
				       (((Player) this)
					.anInt11385) * -389722201,
				       i, 408643609);
	    if (null != class89_185_) {
		class103.method2308(false);
		class89_185_.method1890(class266, null, 0);
		class103.method2308(true);
	    }
	}
    }
    
    void method17976(Class103 class103, Class266 class266, Class89 class89,
		     long l, long l_186_, int i, long l_187_) {
	long l_188_ = l * l + l_186_ * l_186_;
	if (l_188_ >= 262144L && l_188_ <= l_187_) {
	    int i_189_
		= ((int) ((Math.atan2((double) l, (double) l_186_)
			   * 2607.5945876176133)
			  - (double) aClass8_11406.method514((byte) -39))
		   & 0x3fff);
	    Class89 class89_190_
		= Class477.method10922(class103, i_189_,
				       (((Player) this)
					.anInt11383) * -195854529,
				       (((Player) this)
					.anInt11384) * -192864185,
				       (((Player) this)
					.anInt11385) * -389722201,
				       i, 2028449822);
	    if (null != class89_190_) {
		class103.method2308(false);
		class89_190_.method1890(class266, null, 0);
		class103.method2308(true);
	    }
	}
    }
    
    boolean method17977(Class103 class103, int i) {
	int i_191_ = i;
	Class554 class554 = method17787(733549813);
	Class409 class409 = ((aClass409_11375.method7364(-630743631)
			      && !aClass409_11375.method7349(-965191259))
			     ? aClass409_11375 : null);
	Class409_Sub1 class409_sub1
	    = ((aClass409_Sub1_11405.method7364(-1679996989) && !aBool11500
		&& (!aClass409_Sub1_11405.aBool8600 || null == class409))
	       ? aClass409_Sub1_11405 : null);
	int i_192_ = 2147359439 * class554.anInt7227;
	int i_193_ = class554.anInt7232 * -1419210819;
	if (i_192_ != 0 || 0 != i_193_ || 0 != class554.anInt7240 * -1037683113
	    || 0 != class554.anInt7202 * -1595752353)
	    i |= 0x7;
	int i_194_ = aClass8_11406.method514((byte) -39);
	boolean bool
	    = (0 != aByte11413 && client.anInt8296 >= anInt11408 * 230032561
	       && client.anInt8296 < 758296401 * anInt11389);
	if (bool)
	    i |= 0x80000;
	Class89 class89
	    = (aClass89Array11435[0]
	       = aClass490_11499.method11221(class103, i,
					     Class79.aClass539_1138,
					     CS2MapList.aClass350_6031,
					     MasterIndex.npcDefLoader,
					     JS5.itemDefLoader,
					     Class1.aClass19_11,
					     Class1.aClass19_11, class409,
					     class409_sub1,
					     aClass409_Sub3_Sub1Array11417,
					     anIntArray11418, i_194_, true,
					     Class506.aClass504_6662,
					     1320600291));
	int i_195_ = GameScene.method11719(-1311318267);
	if (-1901361259 * GameShell3.maxmemory < 96 && i_195_ > 50)
	    Class333.method6063((byte) -84);
	if (Class416.aClass470_6012 != Class470.aClass470_6345
	    && i_195_ < 50) {
	    int i_196_;
	    for (i_196_ = 50 - i_195_; i_196_ > client.anInt8294 * -1823574619;
		 client.anInt8294 += 1918069293)
		HashTable.aByteArrayArray5912[client.anInt8294 * -1823574619]
		    = new byte[102400];
	    while (i_196_ < client.anInt8294 * -1823574619) {
		client.anInt8294 -= 1918069293;
		HashTable.aByteArrayArray5912[-1823574619 * client.anInt8294]
		    = null;
	    }
	} else if (Class470.aClass470_6345 != Class416.aClass470_6012) {
	    HashTable.aByteArrayArray5912 = new byte[50][];
	    client.anInt8294 = 0;
	}
	if (class89 == null)
	    return false;
	anInt11377
	    = class89.method1902() * -1315890617;
	anInt11378
	    = class89.method1901() * -414801591;
	class89.method1894();
	method17784(class89, -1859877247);
	if (i_192_ != 0 || i_193_ != 0) {
	    method17786(i_194_, i_192_, i_193_,
			class554.anInt7229 * -1378871453,
			class554.anInt7230 * -2120578281, -1078921916);
	    if (0 != (-195854529
		      * anInt11383))
		class89.method1870((((Player) this)
				    .anInt11383) * -195854529);
	    if (anInt11384 * -192864185
		!= 0)
		class89.method1980(-192864185 * ((Player)
						 this).anInt11384);
	    if (0 != (-389722201
		      * anInt11385))
		class89.method1927(0, (((Player) this)
				       .anInt11385) * -389722201, 0);
	} else
	    method17786(i_194_, method17782(896353811) << 9,
			method17782(-883595153) << 9, 0, 0, 1383036603);
	if (bool)
	    class89.method1911(aByte11416, aByte11395, aByte11412,
			       aByte11413 & 0xff);
	if (!aBool11500)
	    method17785(class103, class554, i_191_, i_192_, i_193_, i_194_,
			1587033955);
	return true;
    }
    
    public String method17978(boolean bool) {
	if (bool)
	    return nameFiltered;
	return nameUnfiltered;
    }
    
    public String method17979(boolean bool) {
	if (bool)
	    return nameFiltered;
	return nameUnfiltered;
    }
    
    public void method17980(String string, int i, int i_197_) {
	method17769(string, i, i_197_,
		    (Class70.method1725(-892051376)
		     * (Class128.aClass513_1589.playerChatTimeout * -532154217)),
		    -584265377);
    }
    
    public final void method17981(int i, int i_198_, byte i_199_) {
	if (aClass409_11375.method7364(-840529778)
	    && (aClass409_11375.method7345((byte) -65).anInt7081 * 377701637
		== 1)) {
	    anIntArray11397 = null;
	    aClass409_11375.method7347(-1, -866024168);
	}
	for (int i_200_ = 0; i_200_ < aClass244Array11404.length; i_200_++) {
	    if (-1 != 1967872619 * aClass244Array11404[i_200_].graphicsID) {
		GraphicsDefinition class460
		    = (Class240.graphicsDefLoader.getGraphicsDefinition
		       (1967872619 * aClass244Array11404[i_200_].graphicsID,
			1232200923));
		if (class460.aBool6277 && class460.anInt6267 * 850723107 != -1
		    && (Class394.animationDefLoader.getAnimationDefinition
			(class460.anInt6267 * 850723107, (byte) -35)
			.anInt7081) * 377701637 == 1) {
		    aClass244Array11404[i_200_].aClass409_3935
			.method7347(-1, 203105117);
		    aClass244Array11404[i_200_].graphicsID = 1386773949;
		}
	    }
	}
	facingDirection = -1164488315;
	if (i < 0 || i >= client.aClass238_8477.method4744(-1734366214)
	    || i_198_ < 0
	    || i_198_ >= client.aClass238_8477.method4745(-672116666))
	    setPosition(i, i_198_, 1086602047);
	else if (scenePositionXQueue[0] < 0
		 || (scenePositionXQueue[0]
		     >= client.aClass238_8477.method4744(-2132451966))
		 || scenePositionYQueue[0] < 0
		 || (scenePositionYQueue[0]
		     >= client.aClass238_8477.method4745(1450286905)))
	    setPosition(i, i_198_, 643926151);
	else
	    queueMovement(i, i_198_, i_199_, (byte) -21);
    }
    
    public void method17982(int i, int i_201_) {
	queuedStepCount = 0;
	anInt11430 = 0;
	anInt11429 = 0;
	scenePositionXQueue[0] = i;
	scenePositionYQueue[0] = i_201_;
	int i_202_ = method17782(-658964383);
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	class287.aFloat4477
	    = (float) (256 * i_202_ + 512 * scenePositionXQueue[0]);
	class287.aFloat4479
	    = (float) (i_202_ * 256 + scenePositionYQueue[0] * 512);
	method10898(class287);
	class287.method5564();
	if (this == Class21.myPlayer)
	    client.aClass238_8477.method4833(1022056025)
		.method11400(822333702);
	if (null != aClass489_11420)
	    aClass489_11420
		.method11152();
    }
    
    public int method17782(int i) {
	if (null != aClass490_11499
	    && -1 != aClass490_11499.anInt6508 * -614581637)
	    return ((MasterIndex.npcDefLoader.getNpcDefinition
		     (-614581637 * aClass490_11499.anInt6508, -1541716232)
		     .size)
		    * 19489015);
	return super.method17782(939315782);
    }
    
    final void method17983(int i, int i_203_, byte i_204_) {
	if (queuedStepCount * -316498507 < scenePositionXQueue.length - 1)
	    queuedStepCount += 1631398045;
	for (int i_205_ = queuedStepCount * -316498507; i_205_ > 0; i_205_--) {
	    scenePositionXQueue[i_205_] = scenePositionXQueue[i_205_ - 1];
	    scenePositionYQueue[i_205_] = scenePositionYQueue[i_205_ - 1];
	    moveTypeQueue[i_205_] = moveTypeQueue[i_205_ - 1];
	}
	scenePositionXQueue[0] = i;
	scenePositionYQueue[0] = i_203_;
	moveTypeQueue[0] = i_204_;
    }
    
    public void setOverheadMessage/*method17984*/(String message, int i, int i_206_, byte i_207_) {
    	method17769(message, i, i_206_,
		    (Class70.method1725(-449156621)
		     * (Class128.aClass513_1589.playerChatTimeout * -532154217)),
		    462921322);
    }
    
    public Class241_Sub16 method12() {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	return Class2.method459(nodePlane,
				((int) method10874().aClass287_4386.aFloat4477
				 + 947401216 * class522.baseX),
				-(int) method10874().aClass287_4386.aFloat4474,
				((int) method10874().aClass287_4386.aFloat4479
				 + class522.baseY * -616117760),
				(byte) 84);
    }
    
    public Class241_Sub16 method17() {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	return Class2.method459(nodePlane,
				((int) method10874().aClass287_4386.aFloat4477
				 + 947401216 * class522.baseX),
				-(int) method10874().aClass287_4386.aFloat4474,
				((int) method10874().aClass287_4386.aFloat4479
				 + class522.baseY * -616117760),
				(byte) 103);
    }
    
    public Class67 method8() {
	return Class67.aClass67_1054;
    }
    
    public Class249 method17816() {
	if (aClass249_11387 != null) {
	    if (null == ((Class249) (((Player) this)
				     .aClass249_11387)).aString3993)
		return null;
	    if (0 == 1460689079 * client.publicChatStatus
		|| 1460689079 * client.publicChatStatus == 3
		|| (1 == 1460689079 * client.publicChatStatus
		    && Class443.isFriend(nameUnfiltered, (byte) 64)))
		return aClass249_11387;
	}
	return null;
    }
    
    public Class287 method5(byte i) {
	return Class287.method5560();
    }
    
    public Player(Class552 class552) {
	super(class552, Class177.VAR_PLAYER_LIST);
	anIntArray11508 = new int[8];
	anIntArray11501 = new int[8];
	anInt11502 = 0;
	anInt11503 = 0;
	anInt11504 = -254862605;
	anInt11516 = 0;
	facingDirection = -1164488315;
	aBool11500 = false;
	anInt11495 = 0;
	anInt11509 = 906459141;
	anInt11510 = -1062671637;
	anInt11505 = -502607265;
	anInt11512 = -1423156597;
	anInt11513 = 0;
	anInt11514 = -1730258633;
	aBool11496 = false;
	hidden = false;
	aBool11494 = false;
	method17956((byte) -67);
    }
    
    static final void method17985(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStackPointer -= 993556554;
	String string
	    = (String) (((ClientScriptData) class454).objectStack
			[-290357331 * ((ClientScriptData) class454).objectStackPointer]);
	String string_208_
	    = (String) (((ClientScriptData) class454).objectStack
			[((ClientScriptData) class454).objectStackPointer * -290357331 + 1]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = new StringBuilder().append(string).append(string_208_)
		  .toString();
    }
}
