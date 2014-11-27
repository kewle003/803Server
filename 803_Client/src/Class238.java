/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.Iterator;

public class Class238
{
    Class564 aClass564_2715;
    MapType currentMapType;//aClass235_2716
    MapType aClass235_2717;
    Class71 aClass71_2718;
    byte[][] landContainerData;//aByteArrayArray2719
    Class299_Sub1 aClass299_Sub1_2720;
    GameScene aClass522_2721 = new GameScene();
    GameScene aClass522_2722 = new GameScene();
    int currentRegionY;//anInt2723
    float aFloat2724;
    int anInt2725;
    int anInt2726;
    Class552 aClass552_2727;
    Class501 aClass501_2728;
    Class299_Sub1 aClass299_Sub1_2729;
    int anInt2730;
    int anInt2731;
    Class241_Sub39_Sub12 aClass241_Sub39_Sub12_2732;
    int[][] anIntArrayArray2733;
    Class230 aClass230_2734 = new Class230(0, 0, 0, 0);
    public long aLong2735;
    ObjectDefinitionLoader objectLoader;//aClass532_2736
    byte[][] mapContainerData;//aByteArrayArray2737
    boolean aBool2738;
    int anInt2739;
    Class228 aClass228_2740;
    int anInt2741 = 0;
    int anInt2742 = -1201920359;
    int anInt2743 = 0;
    int anInt2744 = -229524959;
    int currentRegionX;//anInt2745
    int anInt2746 = 0;
    Class215 aClass215_2747;
    byte[][] aByteArrayArray2748;
    int[][] anIntArrayArray2749;
    byte[][] aByteArrayArray2750;
    byte[][] aByteArrayArray2751;
    public boolean aBool2752 = false;
    byte[][][] aByteArrayArrayArray2753;
    int[][][] anIntArrayArrayArray2754;//anIntArrayArrayArray2754
    int[] anIntArray2755;
    int[] archiveKeys;//anIntArray2756
    static int anInt2757;
    
    void method4738() {
	if (MapType.aClass235_2701 != currentMapType
	    && aClass235_2717 != MapType.aClass235_2701) {
	    if (MapType.aClass235_2703 == currentMapType
		|| MapType.aClass235_2705 == currentMapType
		|| ((currentMapType
		     != aClass235_2717)
		    && ((MapType.STATIC_MAP
			 == currentMapType)
			|| (MapType.STATIC_MAP
			    == aClass235_2717)))) {
		Iterator<?> iterator = client.aClass407_8457.iterator();
		while (iterator.hasNext()) {
		    ObjectNode class241_sub26
			= (ObjectNode) iterator.next();
		    Class638.method13558(((NPC)
					  class241_sub26.objectValue),
					 -825668477);
		}
		client.localNpcCount = 0;
		client.anInt8434 = 0;
		client.aClass407_8457.method7293(-166498585);
	    }
	    aClass235_2717
		= currentMapType;
	}
    }
    
    void method4739(byte i) {
		method4775(Class400.method7139(Class241_Sub5_Sub9
						   .aClass241_Sub9_11043
						   .aClass445_Sub8_8856
						   .method14165(1776472191),
						   -1959242957),
			   (byte) 0);
		int i_0_ = 127679513 * aClass522_2721.baseX;
		int i_1_ = 468558693 * aClass522_2721.baseY;
		int i_2_ = (133333741 * Class462.anInt6284 >> 12) + (i_0_ >> 3);
		int i_3_ = (Class636.anInt8248 * -271636831 >> 12) + (i_1_ >> 3);
		Class21.myPlayer.nodePlane = (byte) 0;
		Class357_Sub1.anInt10357 = 0;
		Class21.myPlayer.setPosition(8, 8, 1915894481);
		int i_4_ = 18;
		anIntArray2755 = new int[i_4_];
		archiveKeys = new int[i_4_];
		mapContainerData = new byte[i_4_][];
		landContainerData = new byte[i_4_][];
		aByteArrayArray2751 = new byte[i_4_][];
		aByteArrayArray2750 = new byte[i_4_][];
		aByteArrayArray2748 = new byte[i_4_][];
		i_4_ = 0;
		for (int i_5_ = (i_2_ - (-38896491 * anInt2725 >> 4)) / 8;
				(i_5_ <= (i_2_ + (anInt2725 * -38896491 >> 4)) / 8);
				i_5_++) {
			for (int i_6_ = (i_3_ - (-1590385573 * anInt2726 >> 4)) / 8;
					i_6_ <= ((-1590385573 * anInt2726 >> 4) + i_3_) / 8;
					i_6_++) {
				int i_7_ = (i_5_ << 8) + i_6_;
				if (Class120_Sub22.LANDSCAPES_ARCHIVE.method4183(
						getArchiveKey(i_5_, i_6_, -1799406217),
						Class216.VIRTUAL_MAPS.anInt2533 * -1449220255,
						-1965501348)) {
					anIntArray2755[i_4_] = i_7_;
					archiveKeys[i_4_] = getArchiveKey(i_5_, i_6_, -1925394715);
					i_4_++;
				}
			}
		}
		anInt2746 = i_4_ * 662674737;
		int i_8_;
		if (client.anInt8288 * 1766317249 == 17)
			i_8_ = 13;
		else if (1766317249 * client.anInt8288 == 16)
			i_8_ = 14;
		else if (2 == client.anInt8288 * 1766317249)
			i_8_ = 1;
		else if (8 == 1766317249 * client.anInt8288)
			i_8_ = 3;
		else
			throw new RuntimeException(new StringBuilder().append("").append
						   (1766317249 * client.anInt8288)
						   .toString());
		method4777(i_2_, i_3_, i_8_, false, -186280549);
    }
    
    public Class228 method4740(byte i) {
	return aClass228_2740;
    }
    
    public void method4741(int i) {
	aClass501_2728
	    = new Class501(Class236.aClass103_2713, Class284.SPRITES_ARCHIVE,
			   anInt2725 * -38896491 >> 3,
			   anInt2726 * -1590385573 >> 3);
    }
    
    public int method4742(int i) {
	return 100 - (1278929348 * anInt2743
		      / (-1525134879 * anInt2744));
    }
    
    void method4743(Class299_Sub1 class299_sub1, byte[][] is) {
	int i = is.length;
	for (int i_9_ = 0; i_9_ < i; i_9_++) {
	    byte[] is_10_ = is[i_9_];
	    if (is_10_ != null) {
		RSByteBuffer class241_sub3 = new RSByteBuffer(is_10_);
		int i_11_ = anIntArray2755[i_9_] >> 8;
		int i_12_ = anIntArray2755[i_9_] & 0xff;
		int i_13_
		    = i_11_ * 64 - (aClass522_2721.baseX
				    * 127679513);
		int i_14_
		    = 64 * i_12_ - 468558693 * (((Class238) this)
						.aClass522_2721.baseY);
		if (!aBool2738
		    && Class402.soundManager != null)
		    Class402.soundManager.method1235(-278440307);
		class299_sub1.unpackMapData
		    (class241_sub3, i_13_, i_14_,
		     aClass522_2721.baseX * 127679513,
		     468558693 * aClass522_2721.baseY,
		     155089483);
		class299_sub1.method16558(Class236.aClass103_2713,
					  class241_sub3, i_13_, i_14_,
					  1185333458);
	    }
	}
	for (int i_15_ = 0; i_15_ < i; i_15_++) {
	    int i_16_
		= ((anIntArray2755[i_15_] >> 8) * 64
		   - aClass522_2721.baseX * 127679513);
	    int i_17_
		= (64 * (anIntArray2755[i_15_] & 0xff)
		   - 468558693 * aClass522_2721.baseY);
	    byte[] is_18_ = is[i_15_];
	    if (null == is_18_
		&& -1657296635 * currentRegionY < 800) {
		if (!aBool2738
		    && Class402.soundManager != null)
		    Class402.soundManager.method1235(-397439496);
		class299_sub1.method5740(i_16_, i_17_, 64, 64, -1240545199);
	    }
	}
    }
    
    public int method4744(int i) {
	return -38896491 * anInt2725;
    }
    
    public int method4745(int i) {
	return anInt2726 * -1590385573;
    }
    
    public int method4746() {
	return 100 - (784237428 * anInt2741
		      / (-2053976663 * anInt2742));
    }
    
    public MapType method4747() {
	return currentMapType;
    }
    
    void dummyMethod4748(int i) {
	int i_19_ = (aClass522_2721.baseX * 127679513
		     - 127679513 * aClass522_2722.baseX);
	int i_20_ = (aClass522_2721.baseY * 468558693
		     - aClass522_2722.baseY * 468558693);
	if (9 == i) {
	    for (int i_21_ = 0; i_21_ < client.anInt8434 * 743597371;
		 i_21_++) {
		ObjectNode class241_sub26
		    = client.aClass241_Sub26Array8276[i_21_];
		if (null != class241_sub26) {
		    NPC class475_sub1_sub1_sub3_sub2
			= ((NPC)
			   class241_sub26.objectValue);
		    for (int i_22_ = 0;
			 i_22_ < (class475_sub1_sub1_sub3_sub2
				  .scenePositionXQueue).length;
			 i_22_++) {
			class475_sub1_sub1_sub3_sub2.scenePositionXQueue[i_22_]
			    -= i_19_;
			class475_sub1_sub1_sub3_sub2.scenePositionYQueue[i_22_]
			    -= i_20_;
		    }
		    Class287 class287
			= Class287.method5562(class475_sub1_sub1_sub3_sub2
						  .method10874
					      ().aClass287_4386);
		    class287.aFloat4477 -= (float) (512 * i_19_);
		    class287.aFloat4479 -= (float) (512 * i_20_);
		    class475_sub1_sub1_sub3_sub2.method10898(class287);
		    class287.method5564();
		}
	    }
	} else {
	    boolean bool = false;
	    client.localNpcCount = 0;
	    int i_23_ = 1559833088 * anInt2725 - 512;
	    int i_24_ = 1766372864 * anInt2726 - 512;
	    for (int i_25_ = 0; i_25_ < 743597371 * client.anInt8434;
		 i_25_++) {
		ObjectNode class241_sub26
		    = client.aClass241_Sub26Array8276[i_25_];
		if (null != class241_sub26) {
		    NPC class475_sub1_sub1_sub3_sub2
			= ((NPC)
			   class241_sub26.objectValue);
		    Class287 class287
			= Class287.method5562(class475_sub1_sub1_sub3_sub2
						  .method10874
					      ().aClass287_4386);
		    class287.aFloat4477 -= (float) (i_19_ * 512);
		    class287.aFloat4479 -= (float) (512 * i_20_);
		    class475_sub1_sub1_sub3_sub2.method10898(class287);
		    if ((int) class287.aFloat4477 < 0
			|| (int) class287.aFloat4477 > i_23_
			|| (int) class287.aFloat4479 < 0
			|| (int) class287.aFloat4479 > i_24_) {
			class475_sub1_sub1_sub3_sub2.setDefinition(null,
								 -163312854);
			class241_sub26.remove((byte) 36);
			bool = true;
		    } else {
			boolean bool_26_ = true;
			for (int i_27_ = 0;
			     i_27_ < (class475_sub1_sub1_sub3_sub2
				      .scenePositionXQueue).length;
			     i_27_++) {
			    class475_sub1_sub1_sub3_sub2.scenePositionXQueue[i_27_]
				-= i_19_;
			    class475_sub1_sub1_sub3_sub2.scenePositionYQueue[i_27_]
				-= i_20_;
			    if ((class475_sub1_sub1_sub3_sub2.scenePositionXQueue
				 [i_27_]) < 0
				|| ((class475_sub1_sub1_sub3_sub2
				     .scenePositionXQueue[i_27_])
				    >= -38896491 * anInt2725)
				|| (class475_sub1_sub1_sub3_sub2
				    .scenePositionYQueue[i_27_]) < 0
				|| ((class475_sub1_sub1_sub3_sub2
				     .scenePositionYQueue[i_27_])
				    >= (anInt2726
					* -1590385573)))
				bool_26_ = false;
			}
			if (bool_26_)
			    client.localNpcIndicies[((client.localNpcCount
						    += 1541490607)
						   * -1837469873) - 1]
				= (-546698383
				   * class475_sub1_sub1_sub3_sub2.entityIndex);
			else {
			    class475_sub1_sub1_sub3_sub2
				.setDefinition(null, -61012785);
			    class241_sub26.remove((byte) 36);
			    bool = true;
			}
		    }
		    class287.method5564();
		}
	    }
	    if (bool) {
		client.anInt8434
		    = client.aClass407_8457.method7306(4295488) * 1674259443;
		int i_28_ = 0;
		Iterator<?> iterator = client.aClass407_8457.iterator();
		while (iterator.hasNext()) {
		    ObjectNode class241_sub26
			= (ObjectNode) iterator.next();
		    client.aClass241_Sub26Array8276[i_28_++] = class241_sub26;
		}
	    }
	}
	for (int i_29_ = 0; i_29_ < 2048; i_29_++) {
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[i_29_];
	    if (null != class475_sub1_sub1_sub3_sub1) {
		for (int i_30_ = 0;
		     (i_30_
		      < class475_sub1_sub1_sub3_sub1.scenePositionXQueue.length);
		     i_30_++) {
		    class475_sub1_sub1_sub3_sub1.scenePositionXQueue[i_30_]
			-= i_19_;
		    class475_sub1_sub1_sub3_sub1.scenePositionYQueue[i_30_]
			-= i_20_;
		}
		Class287 class287
		    = Class287.method5562(class475_sub1_sub1_sub3_sub1
					      .method10874().aClass287_4386);
		class287.aFloat4477 -= (float) (512 * i_19_);
		class287.aFloat4479 -= (float) (i_20_ * 512);
		class475_sub1_sub1_sub3_sub1.method10898(class287);
		class287.method5564();
	    }
	}
	Class192[] class192s = client.aClass192Array8301;
	for (int i_31_ = 0; i_31_ < class192s.length; i_31_++) {
	    Class192 class192 = class192s[i_31_];
	    if (class192 != null) {
		class192.anInt2289 -= i_19_ * 1000515072;
		class192.anInt2290 -= -266192384 * i_20_;
	    }
	}
	for (WorldObject class241_sub30
		 = ((WorldObject)
		    WorldObject.aClass429_10039.method7694(16711935));
	     class241_sub30 != null;
	     class241_sub30 = (WorldObject) WorldObject
						   .aClass429_10039
						   .method7692(634527215)) {
	    class241_sub30.posX -= -620199377 * i_19_;
	    class241_sub30.posY -= i_20_ * -1643505007;
	    ObjectDefinition class526
		= objectLoader.getObjectDefinition(((class241_sub30
								 .id)
								* 289493935),
							       577892407);
	    int i_32_;
	    int i_33_;
	    if ((class241_sub30.rotation * 1543441831 & 0x1) == 0) {
		i_32_ = class526.sizeX * 1351092869;
		i_33_ = 333584223 * class526.sizeY;
	    } else {
		i_32_ = 333584223 * class526.sizeY;
		i_33_ = class526.sizeX * 1351092869;
	    }
	    if (MapType.aClass235_2706 != currentMapType
		&& (class241_sub30.posX * 1204421839 + i_32_ <= 0
		    || i_33_ + -320018831 * class241_sub30.posY <= 0
		    || (1204421839 * class241_sub30.posX
			>= -38896491 * anInt2725)
		    || (-320018831 * class241_sub30.posY
			>= anInt2726 * -1590385573)))
		class241_sub30.remove((byte) 36);
	}
	for (WorldObject class241_sub30
		 = ((WorldObject)
		    WorldObject.aClass429_10053.method7694(16711935));
	     class241_sub30 != null;
	     class241_sub30 = (WorldObject) WorldObject
						   .aClass429_10053
						   .method7692(-348182380)) {
	    class241_sub30.posX -= -620199377 * i_19_;
	    class241_sub30.posY -= i_20_ * -1643505007;
	    ObjectDefinition class526
		= objectLoader.getObjectDefinition(((class241_sub30
								 .id)
								* 289493935),
							       577892407);
	    int i_34_;
	    int i_35_;
	    if (0 == (1543441831 * class241_sub30.rotation & 0x1)) {
		i_34_ = class526.sizeX * 1351092869;
		i_35_ = class526.sizeY * 333584223;
	    } else {
		i_34_ = 333584223 * class526.sizeY;
		i_35_ = class526.sizeX * 1351092869;
	    }
	    if (currentMapType != MapType.aClass235_2706
		&& (i_34_ + class241_sub30.posX * 1204421839 <= 0
		    || -320018831 * class241_sub30.posY + i_35_ <= 0
		    || (class241_sub30.posX * 1204421839
			>= -38896491 * anInt2725)
		    || (class241_sub30.posY * -320018831
			>= -1590385573 * anInt2726)))
		class241_sub30.remove((byte) 36);
	}
	for (WorldTile class241_sub44
		 = ((WorldTile)
		    client.aClass407_8452.method7294(2090894173));
	     class241_sub44 != null;
	     class241_sub44 = ((WorldTile)
			       client.aClass407_8452.method7295(1134480037))) {
	    int i_36_
		= (int) (4356572401218184725L * class241_sub44.hashCode >> 28
			 & 0x3L);
	    int i_37_ = (int) (4356572401218184725L * class241_sub44.hashCode
			       & 0x3fffL);
	    int i_38_
		= (i_37_
		   - 127679513 * aClass522_2721.baseX);
	    int i_39_
		= (int) (4356572401218184725L * class241_sub44.hashCode >> 14
			 & 0x3fffL);
	    int i_40_
		= (i_39_
		   - 468558693 * aClass522_2721.baseY);
	    if (null != aClass552_2727) {
		if (i_38_ < 0 || i_40_ < 0
		    || i_38_ >= -38896491 * anInt2725
		    || i_40_ >= -1590385573 * anInt2726
		    || i_38_ >= (aClass552_2727.anInt7138
				 * 120442351)
		    || i_40_ >= (aClass552_2727.anInt7142
				 * -2069974325)) {
		    if (MapType.aClass235_2706
			!= currentMapType)
			class241_sub44.remove((byte) 36);
		} else if (null != (aClass552_2727
				    .aClass548ArrayArrayArray7169))
		    aClass552_2727
			.method12128(i_36_, i_38_, i_40_, 1574126672);
	    }
	}
	if (0 != Class194.minimapFlagX * 1813149433) {
	    Class194.minimapFlagX -= i_19_ * -980260023;
	    Class194.minimapFlagY -= -1262506991 * i_20_;
	}
	Class19.method881(false, 1378454883);
	if (9 == i) {
	    client.anInt8557 -= -1699409408 * i_19_;
	    client.anInt8361 -= 52046336 * i_20_;
	    Class291.anInt4488 -= i_19_ * -399596032;
	    Class354_Sub2.anInt10492 -= 731258368 * i_20_;
	    if (5 != 115241065 * Class296.anInt4513
		&& 115241065 * Class296.anInt4513 != 4)
		Class592.method12924(Class520.method11690(-1739966429),
				     -125723239);
	} else {
	    Class563.anInt7304 -= i_19_ * 1851273669;
	    Class473.anInt6379 -= i_20_ * -587410343;
	    Class421.anInt6040 -= i_19_ * 1596135215;
	    Class380_Sub2.anInt10409 -= i_20_ * 1825904949;
	    Class462.anInt6284 -= i_19_ * 1549126144;
	    Class636.anInt8248 -= 477807104 * i_20_;
	    if (Math.abs(i_19_) > anInt2725 * -38896491
		|| Math.abs(i_20_) > -1590385573 * anInt2726)
		aClass501_2728.method11400(-994074147);
	}
	Class122.method2983(-2094391728);
	Class55.method1371(2116564276);
	client.aClass407_8454.method7293(754295142);
	client.aClass429_8478.method7652((byte) 118);
	client.aClass421_8376.method7521((byte) -87);
	Class445_Sub25.method14350(1863550608);
    }
    
    public int method4749(byte i) {
	return anInt2730 * -595491209;
    }
    
    public int method4750(int i) {
	return 1960870891 * anInt2731;
    }
    
    public Class552 method4751(int i) {
	return aClass552_2727;
    }
    
    public byte[][] method4752(int i, int i_41_) {
	if (null != aClass299_Sub1_2720
	    && null != (aClass299_Sub1_2720
			.aByteArrayArrayArray4531)
	    && (aClass299_Sub1_2720.aByteArrayArrayArray4531
		[i]) != null)
	    return (aClass299_Sub1_2720
		    .aByteArrayArrayArray4531[i]);
	return null;
    }
    
    public Class215 method4753(byte i) {
	return aClass215_2747;
    }
    
    void method4754(Class299_Sub1 class299_sub1, byte[][] is) {
	for (int i = 0; i < 918780881 * class299_sub1.anInt4526; i++) {
	    if (!aBool2738)
		Class402.soundManager.method1235(87420834);
	    for (int i_42_ = 0;
		 i_42_ < -38896491 * anInt2725 >> 3;
		 i_42_++) {
		for (int i_43_ = 0;
		     i_43_ < anInt2726 * -1590385573 >> 3;
		     i_43_++) {
		    int i_44_ = (anIntArrayArrayArray2754[i]
				 [i_42_][i_43_]);
		    if (-1 != i_44_) {
			int i_45_ = i_44_ >> 24 & 0x3;
			if (!class299_sub1.aBool4519 || i_45_ == 0) {
			    int i_46_ = i_44_ >> 1 & 0x3;
			    int i_47_ = i_44_ >> 14 & 0x3ff;
			    int i_48_ = i_44_ >> 3 & 0x7ff;
			    int i_49_ = (i_47_ / 8 << 8) + i_48_ / 8;
			    for (int i_50_ = 0;
				 (i_50_
				  < anIntArray2755.length);
				 i_50_++) {
				if (i_49_ == (anIntArray2755
					      [i_50_])
				    && is[i_50_] != null) {
				    class299_sub1.method16538
					(Class236.aClass103_2713, is[i_50_], i,
					 i_42_ * 8, 8 * i_43_, i_45_,
					 8 * (i_47_ & 0x7), 8 * (i_48_ & 0x7),
					 i_46_, -919089529);
				    break;
				}
			    }
			}
		    }
		    if (aBool2738)
			method4781(5, -1335688823);
		}
	    }
	}
    }
    
    public ObjectDefinitionLoader getObjectLoader/*method4755*/(int i) {
    	return objectLoader;
    }
    
    public MapType method4756(int i) {
	return currentMapType;
    }
    
    public int[][] method4757(int i) {
	return anIntArrayArray2749;
    }
    
    public int method4758(byte i) {
	return 100 - (784237428 * anInt2741
		      / (-2053976663 * anInt2742));
    }
    
    public Class238(boolean bool) {
	aBool2738 = bool;
    }
    
    public Class299_Sub1 method4759(int i) {
	return aClass299_Sub1_2720;
    }
    
    public void method4760(ObjectDefinitionLoader class532, int i) {
	objectLoader = class532;
    }
    
    public void method4761(int i) {
	aClass522_2721 = new GameScene();
	currentRegionY = 0;
	currentRegionX = 0;
    }
    
    void method4762(RSBitBuffer class241_sub3_sub1) {
	int i = class241_sub3_sub1.readUnsignedByteS((byte) 65);
	int i_51_ = class241_sub3_sub1.readUnsignedByte((byte) -21);
	int i_52_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	int i_53_ = class241_sub3_sub1.readUnsignedLEShortA(-42832022);
	boolean bool = class241_sub3_sub1.readByteC((byte) 3) == 1;
	if (!aBool2738)
	    method4837(-2138072526);
	method4775(Class400.method7139(i, -1959242957), (byte) 0);
	anIntArray2755 = new int[i_51_];
	archiveKeys = new int[i_51_];
	mapContainerData = new byte[i_51_][];
	landContainerData = new byte[i_51_][];
	aByteArrayArray2751 = null;
	aByteArrayArray2750 = new byte[i_51_][];
	aByteArrayArray2748 = new byte[i_51_][];
	i_51_ = 0;
	for (int i_54_ = (i_53_ - (anInt2725 * -38896491
				   >> 4)) / 8;
	     (i_54_
	      <= ((anInt2725 * -38896491 >> 4) + i_53_) / 8);
	     i_54_++) {
	    for (int i_55_ = (i_52_
			      - (anInt2726 * -1590385573
				 >> 4)) / 8;
		 i_55_ <= ((-1590385573 * anInt2726 >> 4)
			   + i_52_) / 8;
		 i_55_++) {
		if (Class120_Sub22.LANDSCAPES_ARCHIVE.method4183
		    (getArchiveKey(i_54_, i_55_, -1863786375),
		     Class216.VIRTUAL_MAPS.anInt2533 * -1449220255,
		     -1875919480)) {
		    anIntArray2755[i_51_]
			= (i_54_ << 8) + i_55_;
		    archiveKeys[i_51_]
			= getArchiveKey(i_54_, i_55_, -2107204795);
		    i_51_++;
		}
	    }
	}
	anInt2746 = 662674737 * i_51_;
	method4777(i_53_, i_52_, 9, bool, 1904953831);
    }
    
    public void method4763(int i) {
	aClass228_2740 = Class228.aClass228_2672;
	anInt2741 = 0;
	anInt2742 = -1201920359;
	anInt2743 = 0;
	anInt2744 = -229524959;
	anInt2739 = 0;
    }
    
    public void method4764() {
	aClass228_2740 = Class228.aClass228_2672;
	anInt2741 = 0;
	anInt2742 = -1201920359;
	anInt2743 = 0;
	anInt2744 = -229524959;
	anInt2739 = 0;
    }
    
    public void method4765(int i) {
	aClass501_2728.method11379(this, null, 0,
						     (short) 500);
    }
    
    public void method4766(int i) {
	anInt2730 = 685248376;
	if (-38896491 * anInt2725 == 0)
	    anInt2731 = -1915588726;
	else
	    anInt2731
		= -943354685 * (int) (34.46
				      * (double) (anInt2725
						  * -38896491));
	anInt2731
	    = -943354685 * (anInt2731 * 1960870891 << 2);
	if (Class236.aClass103_2713.method2573())
	    anInt2731 += -1961261568;
    }
    
    void method4767(Class238 class238_56_, byte i) {
	boolean bool = ((Class238) class238_56_).aBool2738;
	((Class238) class238_56_).aBool2738 = aBool2738;
	aBool2738 = bool;
	MapType class235 = ((Class238) class238_56_).aClass235_2717;
	((Class238) class238_56_).aClass235_2717
	    = aClass235_2717;
	aClass235_2717 = class235;
	((Class238) class238_56_).aClass522_2722
	    = aClass522_2721;
	aClass522_2722
	    = ((Class238) class238_56_).aClass522_2721;
	aClass501_2728
	    .method11381(class238_56_.method4833(1811257275), (byte) 54);
    }
    
    public void method4768(byte i) {
	if (aBool2738) {
	    method4763(2057024252);
	    Class238 class238_57_ = client.aClass238_8477;
	    anInt2746 = 1 * ((Class238) class238_57_).anInt2746;
	    anIntArray2755 = ((Class238) class238_57_).anIntArray2755;
	    archiveKeys = ((Class238) class238_57_).archiveKeys;
	    mapContainerData = ((Class238) class238_57_).mapContainerData;
	    landContainerData = ((Class238) class238_57_).landContainerData;
	    aByteArrayArray2751 = ((Class238) class238_57_).aByteArrayArray2751;
	    aByteArrayArray2750 = ((Class238) class238_57_).aByteArrayArray2750;
	    aByteArrayArray2748 = ((Class238) class238_57_).aByteArrayArray2748;
	    aClass215_2747 = ((Class238) class238_57_).aClass215_2747;
	    aClass501_2728 = ((Class238) class238_57_).aClass501_2728;
	    anIntArrayArrayArray2754 = ((Class238) class238_57_).anIntArrayArrayArray2754;
	    anInt2730 = ((Class238) class238_57_).anInt2730 * 1;
	    anInt2731 = ((Class238) class238_57_).anInt2731 * 1;
	    aClass241_Sub39_Sub12_2732 = ((Class238) class238_57_).aClass241_Sub39_Sub12_2732;
	    aClass564_2715 = ((Class238) class238_57_).aClass564_2715;
	    anIntArrayArray2733 = ((Class238) class238_57_).anIntArrayArray2733;
	    anIntArrayArray2749 = ((Class238) class238_57_).anIntArrayArray2749;
	    aByteArrayArrayArray2753 = ((Class238) class238_57_).aByteArrayArrayArray2753;
	    currentMapType = ((Class238) class238_57_).currentMapType;
	    aClass71_2718 = ((Class238) class238_57_).aClass71_2718;
	    aClass522_2721 = ((Class238) class238_57_).aClass522_2721;
	    aClass522_2722 = ((Class238) class238_57_).aClass522_2722;
	    currentRegionX = ((Class238) class238_57_).currentRegionX * 1;
	    currentRegionY = ((Class238) class238_57_).currentRegionY * 1;
	    anInt2725 = ((Class238) class238_57_).anInt2725 * 1;
	    anInt2726 = ((Class238) class238_57_).anInt2726 * 1;
	} else if (17 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(13, (byte) -70);
	else if (client.anInt8288 * 1766317249 == 2)
	    Class496.setClientStage(1, (byte) -127);
	else if (16 == 1766317249 * client.anInt8288)
	    Class496.setClientStage(14, (byte) -77);
	else if (19 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(9, (byte) -4);
	else if (client.anInt8288 * 1766317249 == 8)
	    Class496.setClientStage(3, (byte) -23);
    }
    
    public void setMapScene/*method4769*/(Class234 class234, int i) {
		currentMapType = ((Class234) class234).mapType;
		if (MapType.aClass235_2704 == currentMapType) {
		    method4739((byte) -1);
		} else if (MapType.STATIC_MAP == currentMapType) {
		    decodeStaticRegion(((Class234) class234).mapData, (byte) 1);
		} else if (currentMapType == MapType.aClass235_2701) {
		    method4773((byte) 70);
		} else if (currentMapType.allowDynamicMapScene(1180067912)) {
		    method4772(((Class234) class234).mapData, (byte) 2);
		}
    }
    
    public GameScene method4770() {
	return aClass522_2721;
    }
    
    void decodeStaticRegion/*method4771*/(RSBitBuffer buffer, byte i) {
		int mapSize = buffer.readUnsignedByteS((byte) 118);
		int regionCount = buffer.readUnsignedByte((byte) -57);
		int regionY = buffer.readUnsignedShort(1162222719);
		int regionX = buffer.readUnsignedLEShortA(1440807107);
		boolean forceRefresh = buffer.readByteC((byte) 89) == 1;
		//System.out.println("mapSize="+mapSize+", regionCount="+regionCount+", regionY="+regionY+", regionX="+regionX+", forceRefresh="+forceRefresh);
		if (!aBool2738) {
		    method4837(-2144608451);
		}
		method4775(Class400.method7139(mapSize, -1959242957), (byte) 0);
		anIntArray2755 = new int[regionCount];
		archiveKeys = new int[regionCount];
		mapContainerData = new byte[regionCount][];
		landContainerData = new byte[regionCount][];
		aByteArrayArray2751 = null;
		aByteArrayArray2750 = new byte[regionCount][];
		aByteArrayArray2748 = new byte[regionCount][];
		regionCount = 0;
		for (int x = (regionX - (anInt2725 * -38896491 >> 4)) / 8;
				x <= ((anInt2725 * -38896491 >> 4) + regionX) / 8; x++) {
		    for (int y = (regionY - (anInt2726 * -1590385573 >> 4)) / 8;
		    		y <= ((-1590385573 * anInt2726 >> 4) + regionY) / 8; y++) {
				if (Class120_Sub22.LANDSCAPES_ARCHIVE.method4183(
						getArchiveKey(x, y, -2012577506),
						Class216.VIRTUAL_MAPS.anInt2533 * -1449220255, -1372161413)) {
				    anIntArray2755[regionCount] = (x << 8) + y;
				    archiveKeys[regionCount] = getArchiveKey(x, y, -1594588741);
				    regionCount++;
				}
		    }
		}
		anInt2746 = 662674737 * regionCount;
		method4777(regionX, regionY, 9, forceRefresh, -262220041);
    }
    
    void method4772(RSBitBuffer class241_sub3_sub1, byte i) {
	int i_64_ = class241_sub3_sub1.readUnsignedLEShortA(-276956104);
	int i_65_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	int i_66_ = class241_sub3_sub1.readUnsignedByteS((byte) 65);
	int i_67_ = class241_sub3_sub1.getByteA(-2075427392);
	boolean bool = (i_67_ & 0x1) != 0;
	int i_68_ = class241_sub3_sub1.readByteC((byte) 45);
	if (1 == i_68_)
	    currentMapType = MapType.aClass235_2703;
	else if (2 == i_68_)
	    currentMapType = MapType.aClass235_2700;
	else if (3 == i_68_)
	    currentMapType = MapType.aClass235_2705;
	else if (i_68_ == 4)
	    currentMapType = MapType.aClass235_2706;
	if (!aBool2738)
	    method4837(-2085516257);
	method4775(Class400.method7139(i_66_, -1959242957), (byte) 0);
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_69_ = 0; i_69_ < 4; i_69_++) {
	    for (int i_70_ = 0;
		 i_70_ < -38896491 * anInt2725 >> 3;
		 i_70_++) {
		for (int i_71_ = 0;
		     i_71_ < anInt2726 * -1590385573 >> 3;
		     i_71_++) {
		    int i_72_ = class241_sub3_sub1.readBits(1, 1600418237);
		    if (1 == i_72_)
			anIntArrayArrayArray2754[i_69_]
			    [i_70_][i_71_]
			    = class241_sub3_sub1.readBits(26, -794726366);
		    else
			anIntArrayArrayArray2754[i_69_]
			    [i_70_][i_71_]
			    = -1;
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) -124);
	int i_73_ = class241_sub3_sub1.readUnsignedByte((byte) 2);
	anIntArray2755 = new int[i_73_];
	archiveKeys = new int[i_73_];
	mapContainerData = new byte[i_73_][];
	landContainerData = new byte[i_73_][];
	aByteArrayArray2751 = null;
	aByteArrayArray2750 = new byte[i_73_][];
	aByteArrayArray2748 = new byte[i_73_][];
	i_73_ = 0;
	for (int i_74_ = 0; i_74_ < 4; i_74_++) {
	    for (int i_75_ = 0;
		 i_75_ < -38896491 * anInt2725 >> 3;
		 i_75_++) {
		for (int i_76_ = 0;
		     i_76_ < anInt2726 * -1590385573 >> 3;
		     i_76_++) {
		    int i_77_ = (anIntArrayArrayArray2754
				 [i_74_][i_75_][i_76_]);
		    if (i_77_ != -1) {
			int i_78_ = i_77_ >> 14 & 0x3ff;
			int i_79_ = i_77_ >> 3 & 0x7ff;
			int i_80_ = (i_78_ / 8 << 8) + i_79_ / 8;
			for (int i_81_ = 0; i_81_ < i_73_; i_81_++) {
			    if (i_80_
				== anIntArray2755[i_81_]) {
				i_80_ = -1;
				break;
			    }
			}
			if (-1 != i_80_) {
			    int i_82_ = i_80_ >> 8 & 0xff;
			    int i_83_ = i_80_ & 0xff;
			    if (Class120_Sub22.LANDSCAPES_ARCHIVE.method4183
				(getArchiveKey(i_82_, i_83_, -1995503534),
				 (Class216.VIRTUAL_MAPS.anInt2533
				  * -1449220255),
				 -1257912111)) {
				anIntArray2755[i_73_]
				    = i_80_;
				archiveKeys[i_73_]
				    = getArchiveKey(i_82_, i_83_, -1601954494);
				i_73_++;
			    }
			}
		    }
		}
	    }
	}
	anInt2746 = i_73_ * 662674737;
	method4777(i_65_, i_64_, 9, bool, -688367173);
    }
    
    void method4773(byte i) {
	aClass235_2717 = currentMapType;
	method4775(Class71.aClass71_1088, (byte) 0);
	for (int i_84_ = 0; i_84_ < 4; i_84_++) {
	    for (int i_85_ = 0;
		 i_85_ < anInt2725 * -38896491 >> 3;
		 i_85_++) {
		for (int i_86_ = 0;
		     i_86_ < anInt2726 * -1590385573 >> 3;
		     i_86_++)
		    anIntArrayArrayArray2754[i_84_]
			[i_85_][i_86_]
			= -1;
	    }
	}
	for (Class241_Sub32 class241_sub32
		 = ((Class241_Sub32)
		    Class104.aClass429_1484.method7694(16711935));
	     class241_sub32 != null;
	     class241_sub32 = (Class241_Sub32) Class104.aClass429_1484
						   .method7692(1057820538)) {
	    int i_87_ = 587544409 * class241_sub32.anInt10065;
	    boolean bool = (i_87_ & 0x1) == 1;
	    int i_88_ = 634343263 * class241_sub32.anInt10057 >> 3;
	    int i_89_ = class241_sub32.anInt10059 * -1171046323 >> 3;
	    int i_90_ = class241_sub32.anInt10061 * -2086197959;
	    int i_91_ = 1735542785 * class241_sub32.anInt10058;
	    int i_92_ = 462372249 * class241_sub32.anInt10060;
	    int i_93_ = 1638174091 * class241_sub32.anInt10062;
	    int i_94_ = -2087712063 * class241_sub32.anInt10063;
	    int i_95_ = class241_sub32.anInt10064 * -1618719577;
	    int i_96_ = 0;
	    int i_97_ = 0;
	    int i_98_ = 1;
	    int i_99_ = 1;
	    if (i_87_ == 1) {
		i_97_ = i_94_ - 1;
		i_98_ = -1;
	    } else if (2 == i_87_) {
		i_97_ = i_94_ - 1;
		i_96_ = i_95_ - 1;
		i_98_ = -1;
		i_99_ = -1;
	    } else if (3 == i_87_) {
		i_96_ = i_95_ - 1;
		i_98_ = 1;
		i_99_ = -1;
	    }
	    int i_100_ = i_89_;
	    while (i_100_ < i_95_ + i_89_) {
		int i_101_ = i_97_;
		int i_102_ = i_88_;
		while (i_102_ < i_94_ + i_88_) {
		    if (bool)
			anIntArrayArrayArray2754[i_93_]
			    [i_90_ + i_96_][i_101_ + i_91_]
			    = ((i_92_ << 24) + (i_102_ << 14) + (i_100_ << 3)
			       + (i_87_ << 1));
		    else
			anIntArrayArrayArray2754[i_93_]
			    [i_90_ + i_101_][i_96_ + i_91_]
			    = (i_87_ << 1) + ((i_100_ << 3)
					      + ((i_102_ << 14)
						 + (i_92_ << 24)));
		    i_102_++;
		    i_101_ += i_98_;
		}
		i_100_++;
		i_96_ += i_99_;
	    }
	}
	int i_103_ = 592347845 * client.anInt8357;
	anIntArray2755 = new int[i_103_];
	archiveKeys = new int[i_103_];
	mapContainerData = new byte[i_103_][];
	landContainerData = new byte[i_103_][];
	aByteArrayArray2751 = null;
	aByteArrayArray2750 = new byte[i_103_][];
	aByteArrayArray2748 = new byte[i_103_][];
	i_103_ = 0;
	for (Class241_Sub32 class241_sub32
		 = ((Class241_Sub32)
		    Class104.aClass429_1484.method7694(16711935));
	     class241_sub32 != null;
	     class241_sub32 = (Class241_Sub32) Class104.aClass429_1484
						   .method7692(-138192104)) {
	    int i_104_ = class241_sub32.anInt10057 * 634343263 >>> 3;
	    int i_105_ = class241_sub32.anInt10059 * -1171046323 >>> 3;
	    int i_106_ = class241_sub32.anInt10063 * -2087712063 + i_104_;
	    if (0 == (i_106_ & 0x7))
		i_106_--;
	    i_106_ >>>= 3;
	    int i_107_ = class241_sub32.anInt10064 * -1618719577 + i_105_;
	    if ((i_107_ & 0x7) == 0)
		i_107_--;
	    i_107_ >>>= 3;
	    for (int i_108_ = i_104_ >>> 3; i_108_ <= i_106_; i_108_++) {
	    while_53_:
		for (int i_109_ = i_105_ >>> 3; i_109_ <= i_107_; i_109_++) {
		    int i_110_ = i_108_ << 8 | i_109_;
		    for (int i_111_ = 0; i_111_ < i_103_; i_111_++) {
			if (anIntArray2755[i_111_] == i_110_)
			    continue while_53_;
		    }
		    if (Class120_Sub22.LANDSCAPES_ARCHIVE.method4183
			(getArchiveKey(i_108_, i_109_, -1280021754),
			 Class216.VIRTUAL_MAPS.anInt2533 * -1449220255,
			 -1460896462)) {
			anIntArray2755[i_103_] = i_110_;
			archiveKeys[i_103_]
			    = getArchiveKey(i_108_, i_109_, -1904738857);
			i_103_++;
		    }
		}
	    }
	}
	anInt2746 = 662674737 * i_103_;
	method4777(-38896491 * anInt2725 >> 4,
		   -1590385573 * anInt2726 >> 4, 9, false,
		   -638341478);
    }
    
    int getArchiveKey/*method4774*/(int x, int y, int i_113_) {
    	return x | y << 7;
    }
    
    void method4775(Class71 class71, byte i) {
	if (class71 != aClass71_2718) {
	    anInt2725 = (anInt2726 = class71.anInt1094 * 1209676345) * -1963560657;
	    anIntArrayArrayArray2754 = (new int[4][anInt2725 * -38896491 >> 3][anInt2726 * -1590385573 >> 3]);
	    anIntArrayArray2733 = (new int[-38896491 * anInt2725][anInt2726 * -1590385573]);
	    anIntArrayArray2749= (new int[-38896491 * anInt2725][anInt2726 * -1590385573]);
	    aByteArrayArrayArray2753
		= (new byte[4][-38896491 * anInt2725]
		   [-1590385573 * anInt2726]);
	    aClass215_2747
		= new Class215(4, anInt2725 * -38896491,
			       -1590385573 * anInt2726);
	    method4741(-128958308);
	    LongNode.method15108((short) 25671);
	    aClass71_2718 = class71;
	}
    }
    
    void dummyMethod4776(int i) {
	int i_114_
	    = (aClass522_2721.baseX * 127679513
	       - 127679513 * aClass522_2722.baseX);
	int i_115_
	    = (aClass522_2721.baseY * 468558693
	       - aClass522_2722.baseY * 468558693);
	if (9 == i) {
	    for (int i_116_ = 0; i_116_ < client.anInt8434 * 743597371;
		 i_116_++) {
		ObjectNode class241_sub26
		    = client.aClass241_Sub26Array8276[i_116_];
		if (null != class241_sub26) {
		    NPC class475_sub1_sub1_sub3_sub2
			= ((NPC)
			   class241_sub26.objectValue);
		    for (int i_117_ = 0;
			 i_117_ < (class475_sub1_sub1_sub3_sub2
				   .scenePositionXQueue).length;
			 i_117_++) {
			class475_sub1_sub1_sub3_sub2.scenePositionXQueue[i_117_]
			    -= i_114_;
			class475_sub1_sub1_sub3_sub2.scenePositionYQueue[i_117_]
			    -= i_115_;
		    }
		    Class287 class287
			= Class287.method5562(class475_sub1_sub1_sub3_sub2
						  .method10874
					      ().aClass287_4386);
		    class287.aFloat4477 -= (float) (512 * i_114_);
		    class287.aFloat4479 -= (float) (512 * i_115_);
		    class475_sub1_sub1_sub3_sub2.method10898(class287);
		    class287.method5564();
		}
	    }
	} else {
	    boolean bool = false;
	    client.localNpcCount = 0;
	    int i_118_ = 1559833088 * anInt2725 - 512;
	    int i_119_ = 1766372864 * anInt2726 - 512;
	    for (int i_120_ = 0; i_120_ < 743597371 * client.anInt8434;
		 i_120_++) {
		ObjectNode class241_sub26
		    = client.aClass241_Sub26Array8276[i_120_];
		if (null != class241_sub26) {
		    NPC class475_sub1_sub1_sub3_sub2
			= ((NPC)
			   class241_sub26.objectValue);
		    Class287 class287
			= Class287.method5562(class475_sub1_sub1_sub3_sub2
						  .method10874
					      ().aClass287_4386);
		    class287.aFloat4477 -= (float) (i_114_ * 512);
		    class287.aFloat4479 -= (float) (512 * i_115_);
		    class475_sub1_sub1_sub3_sub2.method10898(class287);
		    if ((int) class287.aFloat4477 < 0
			|| (int) class287.aFloat4477 > i_118_
			|| (int) class287.aFloat4479 < 0
			|| (int) class287.aFloat4479 > i_119_) {
			class475_sub1_sub1_sub3_sub2.setDefinition(null,
								 571502073);
			class241_sub26.remove((byte) 36);
			bool = true;
		    } else {
			boolean bool_121_ = true;
			for (int i_122_ = 0;
			     i_122_ < (class475_sub1_sub1_sub3_sub2
				       .scenePositionXQueue).length;
			     i_122_++) {
			    class475_sub1_sub1_sub3_sub2.scenePositionXQueue
				[i_122_]
				-= i_114_;
			    class475_sub1_sub1_sub3_sub2.scenePositionYQueue
				[i_122_]
				-= i_115_;
			    if ((class475_sub1_sub1_sub3_sub2.scenePositionXQueue
				 [i_122_]) < 0
				|| ((class475_sub1_sub1_sub3_sub2
				     .scenePositionXQueue[i_122_])
				    >= -38896491 * anInt2725)
				|| (class475_sub1_sub1_sub3_sub2
				    .scenePositionYQueue[i_122_]) < 0
				|| ((class475_sub1_sub1_sub3_sub2
				     .scenePositionYQueue[i_122_])
				    >= (anInt2726
					* -1590385573)))
				bool_121_ = false;
			}
			if (bool_121_)
			    client.localNpcIndicies[((client.localNpcCount
						    += 1541490607)
						   * -1837469873) - 1]
				= (-546698383
				   * class475_sub1_sub1_sub3_sub2.entityIndex);
			else {
			    class475_sub1_sub1_sub3_sub2
				.setDefinition(null, -275160174);
			    class241_sub26.remove((byte) 36);
			    bool = true;
			}
		    }
		    class287.method5564();
		}
	    }
	    if (bool) {
		client.anInt8434
		    = client.aClass407_8457.method7306(876384890) * 1674259443;
		int i_123_ = 0;
		Iterator<?> iterator = client.aClass407_8457.iterator();
		while (iterator.hasNext()) {
		    ObjectNode class241_sub26
			= (ObjectNode) iterator.next();
		    client.aClass241_Sub26Array8276[i_123_++] = class241_sub26;
		}
	    }
	}
	for (int i_124_ = 0; i_124_ < 2048; i_124_++) {
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[i_124_];
	    if (null != class475_sub1_sub1_sub3_sub1) {
		for (int i_125_ = 0;
		     (i_125_
		      < class475_sub1_sub1_sub3_sub1.scenePositionXQueue.length);
		     i_125_++) {
		    class475_sub1_sub1_sub3_sub1.scenePositionXQueue[i_125_]
			-= i_114_;
		    class475_sub1_sub1_sub3_sub1.scenePositionYQueue[i_125_]
			-= i_115_;
		}
		Class287 class287
		    = Class287.method5562(class475_sub1_sub1_sub3_sub1
					      .method10874().aClass287_4386);
		class287.aFloat4477 -= (float) (512 * i_114_);
		class287.aFloat4479 -= (float) (i_115_ * 512);
		class475_sub1_sub1_sub3_sub1.method10898(class287);
		class287.method5564();
	    }
	}
	Class192[] class192s = client.aClass192Array8301;
	for (int i_126_ = 0; i_126_ < class192s.length; i_126_++) {
	    Class192 class192 = class192s[i_126_];
	    if (class192 != null) {
		class192.anInt2289 -= i_114_ * 1000515072;
		class192.anInt2290 -= -266192384 * i_115_;
	    }
	}
	for (WorldObject class241_sub30
		 = ((WorldObject)
		    WorldObject.aClass429_10039.method7694(16711935));
	     class241_sub30 != null;
	     class241_sub30 = (WorldObject) WorldObject
						   .aClass429_10039
						   .method7692(1859864041)) {
	    class241_sub30.posX -= -620199377 * i_114_;
	    class241_sub30.posY -= i_115_ * -1643505007;
	    ObjectDefinition class526
		= objectLoader.getObjectDefinition(((class241_sub30
								 .id)
								* 289493935),
							       577892407);
	    int i_127_;
	    int i_128_;
	    if ((class241_sub30.rotation * 1543441831 & 0x1) == 0) {
		i_127_ = class526.sizeX * 1351092869;
		i_128_ = 333584223 * class526.sizeY;
	    } else {
		i_127_ = 333584223 * class526.sizeY;
		i_128_ = class526.sizeX * 1351092869;
	    }
	    if (MapType.aClass235_2706 != currentMapType
		&& (class241_sub30.posX * 1204421839 + i_127_ <= 0
		    || i_128_ + -320018831 * class241_sub30.posY <= 0
		    || (1204421839 * class241_sub30.posX
			>= -38896491 * anInt2725)
		    || (-320018831 * class241_sub30.posY
			>= anInt2726 * -1590385573)))
		class241_sub30.remove((byte) 36);
	}
	for (WorldObject class241_sub30
		 = ((WorldObject)
		    WorldObject.aClass429_10053.method7694(16711935));
	     class241_sub30 != null;
	     class241_sub30 = (WorldObject) WorldObject
						   .aClass429_10053
						   .method7692(457054294)) {
	    class241_sub30.posX -= -620199377 * i_114_;
	    class241_sub30.posY -= i_115_ * -1643505007;
	    ObjectDefinition class526
		= objectLoader.getObjectDefinition(((class241_sub30
								 .id)
								* 289493935),
							       577892407);
	    int i_129_;
	    int i_130_;
	    if (0 == (1543441831 * class241_sub30.rotation & 0x1)) {
		i_129_ = class526.sizeX * 1351092869;
		i_130_ = class526.sizeY * 333584223;
	    } else {
		i_129_ = 333584223 * class526.sizeY;
		i_130_ = class526.sizeX * 1351092869;
	    }
	    if (currentMapType != MapType.aClass235_2706
		&& (i_129_ + class241_sub30.posX * 1204421839 <= 0
		    || -320018831 * class241_sub30.posY + i_130_ <= 0
		    || (class241_sub30.posX * 1204421839
			>= -38896491 * anInt2725)
		    || (class241_sub30.posY * -320018831
			>= -1590385573 * anInt2726)))
		class241_sub30.remove((byte) 36);
	}
	for (WorldTile class241_sub44
		 = ((WorldTile)
		    client.aClass407_8452.method7294(2090894173));
	     class241_sub44 != null;
	     class241_sub44 = ((WorldTile)
			       client.aClass407_8452.method7295(-331071731))) {
	    int i_131_
		= (int) (4356572401218184725L * class241_sub44.hashCode >> 28
			 & 0x3L);
	    int i_132_ = (int) (4356572401218184725L * class241_sub44.hashCode
				& 0x3fffL);
	    int i_133_
		= (i_132_
		   - 127679513 * aClass522_2721.baseX);
	    int i_134_
		= (int) (4356572401218184725L * class241_sub44.hashCode >> 14
			 & 0x3fffL);
	    int i_135_
		= (i_134_
		   - 468558693 * aClass522_2721.baseY);
	    if (null != aClass552_2727) {
		if (i_133_ < 0 || i_135_ < 0
		    || i_133_ >= -38896491 * anInt2725
		    || i_135_ >= -1590385573 * anInt2726
		    || i_133_ >= (aClass552_2727.anInt7138
				  * 120442351)
		    || i_135_ >= (aClass552_2727.anInt7142
				  * -2069974325)) {
		    if (MapType.aClass235_2706
			!= currentMapType)
			class241_sub44.remove((byte) 36);
		} else if (null != (aClass552_2727
				    .aClass548ArrayArrayArray7169))
		    aClass552_2727
			.method12128(i_131_, i_133_, i_135_, 1799331682);
	    }
	}
	if (0 != Class194.minimapFlagX * 1813149433) {
	    Class194.minimapFlagX -= i_114_ * -980260023;
	    Class194.minimapFlagY -= -1262506991 * i_115_;
	}
	Class19.method881(false, 1749882743);
	if (9 == i) {
	    client.anInt8557 -= -1699409408 * i_114_;
	    client.anInt8361 -= 52046336 * i_115_;
	    Class291.anInt4488 -= i_114_ * -399596032;
	    Class354_Sub2.anInt10492 -= 731258368 * i_115_;
	    if (5 != 115241065 * Class296.anInt4513
		&& 115241065 * Class296.anInt4513 != 4)
		Class592.method12924(Class520.method11690(893470042),
				     -2059542876);
	} else {
	    Class563.anInt7304 -= i_114_ * 1851273669;
	    Class473.anInt6379 -= i_115_ * -587410343;
	    Class421.anInt6040 -= i_114_ * 1596135215;
	    Class380_Sub2.anInt10409 -= i_115_ * 1825904949;
	    Class462.anInt6284 -= i_114_ * 1549126144;
	    Class636.anInt8248 -= 477807104 * i_115_;
	    if (Math.abs(i_114_) > anInt2725 * -38896491
		|| (Math.abs(i_115_)
		    > -1590385573 * anInt2726))
		aClass501_2728.method11400(-847121628);
	}
	Class122.method2983(-2132134034);
	Class55.method1371(1929407076);
	client.aClass407_8454.method7293(133669748);
	client.aClass429_8478.method7652((byte) 11);
	client.aClass421_8376.method7521((byte) -73);
	Class445_Sub25.method14350(601248969);
    }
    
    void method4777(int regionX, int regionY, int stage, boolean forceRefresh, int i_138_) {
		if (-831877317 * client.anInt8266 == 1) {
		    if (aBool2738) {
		    	throw new IllegalStateException();
		    }
		    client.anInt8266 = -327526951;
		    client.anInt8352 = -504628557;
		}
		if (forceRefresh || regionX != currentRegionX * -1821522969 || regionY != currentRegionY * -1657296635) {
		    currentRegionX = 675061719 * regionX;
		    currentRegionY = -1345602611 * regionY;
		    if (!aBool2738) {
		    	Class496.setClientStage(stage, (byte) -22);
		    	Class434_Sub5.method14141(ClientMessage.LOADING.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 21309),
		    			true, Class236.aClass103_2713, Class5.aClass96_26, Class5.aClass639_25, 886666853);
		    }
		    if (aClass522_2721 != null) {
		    	aClass522_2722 = aClass522_2721;
		    } else { 
		    	aClass522_2722 = new GameScene(0, 0, 0);
		    }
		    aClass522_2721 = new GameScene(0,
		    		(-1821522969 * currentRegionX - (anInt2725 * -38896491 >> 4)) * 8,
		    		(-1657296635 * currentRegionY - (anInt2726 * -1590385573 >> 4)) * 8);
		    aClass241_Sub39_Sub12_2732 = Class573.method12651(
		    		(-38896491 * anInt2725 / 2 + aClass522_2721.baseX * 127679513),
		    		(-38896491 * anInt2725 / 2 + aClass522_2721.baseY * 468558693));
		    aClass564_2715 = null;
		    if (!aBool2738) {
		    	method4801(stage, (byte) 106);
		    }
		}
    }
    
    void method4778(Class238 class238_139_) {
	boolean bool = ((Class238) class238_139_).aBool2738;
	((Class238) class238_139_).aBool2738 = aBool2738;
	aBool2738 = bool;
	MapType class235 = ((Class238) class238_139_).aClass235_2717;
	((Class238) class238_139_).aClass235_2717
	    = aClass235_2717;
	aClass235_2717 = class235;
	((Class238) class238_139_).aClass522_2722
	    = aClass522_2721;
	aClass522_2722
	    = ((Class238) class238_139_).aClass522_2721;
	aClass501_2728
	    .method11381(class238_139_.method4833(329875577), (byte) 49);
    }
    
    public int method4779() {
	return anInt2730 * -595491209;
    }
    
    public boolean loadRegion(byte i) {//Used
		if (!aBool2738) {
		    Class572.method12549(false, 2020661041);
		}
		anInt2741 = 0;
		for (int index = 0; index < anInt2746 * 233085905; index++) {
		    if (!Class120_Sub22.LANDSCAPES_ARCHIVE.containerExists((archiveKeys[index]), -236163111)) {
		    	anInt2741 += -205428115;
		    }
		}
		if (null == aClass564_2715) {
		    if (null != aClass241_Sub39_Sub12_2732 && Class608.WORLD_MAP_ARCHIVE.method4204(
					new StringBuilder().append(aClass241_Sub39_Sub12_2732.aString10922).append ("_staticelements").toString(),
					2097009761)) {
				if (!Class608.WORLD_MAP_ARCHIVE.containerIdentifierExists(
						new StringBuilder().append(aClass241_Sub39_Sub12_2732.aString10922).append("_staticelements").toString(),
						1829516714)) {
				    anInt2741 += -205428115;
				} else {
				    aClass564_2715 = Class349.method6233(
				    		Class608.WORLD_MAP_ARCHIVE,
				    		new StringBuilder().append(aClass241_Sub39_Sub12_2732.aString10922).append("_staticelements").toString(),
				    		client.isP2pWorld, (byte) 62);
				}
		    } else {
		    	aClass564_2715 = new Class564(0);
		    }
		}
		if (-1838993563 * anInt2741 > 0) {
		    if (-2053976663 * anInt2742
			< anInt2741 * -1838993563)
			anInt2742
			    = anInt2741 * -694398627;
		    aClass228_2740 = Class228.aClass228_2671;
		    return false;
		}
		for (int index = 0; index < anInt2746 * 233085905; index++) {
		    if (mapContainerData[index] == null) {
				mapContainerData[index] = Class120_Sub22.LANDSCAPES_ARCHIVE.getfile(
						archiveKeys[index], -1449220255 * Class216.VIRTUAL_MAPS.anInt2533, -994969999);
			}
			//System.out.println("Reading "+archiveKeys[index]+", 3: map_size="+mapContainerData[index].length);
		    if (landContainerData[index] == null) {
				landContainerData[index] = Class120_Sub22.LANDSCAPES_ARCHIVE.getfile(
						archiveKeys[index], -1449220255 * Class216.PHYSICAL_NODES.anInt2533, 1503188569);
			}
		    if (null == aByteArrayArray2750[index]) {
		    	aByteArrayArray2750[index] = Class120_Sub22.LANDSCAPES_ARCHIVE.getfile(
		    			archiveKeys[index], Class216.aClass216_2528.anInt2533 * -1449220255, -872626678);
		    }
		    if (aByteArrayArray2748[index] == null) {
		    	aByteArrayArray2748[index] = Class120_Sub22.LANDSCAPES_ARCHIVE.getfile(
		    			archiveKeys[index], Class216.aClass216_2527.anInt2533 * -1449220255, 755461354);
		    }
		    if (null != aByteArrayArray2751 && aByteArrayArray2751[index] == null) {
		    	aByteArrayArray2751[index] = Class120_Sub22.LANDSCAPES_ARCHIVE.getfile(
		    			archiveKeys[index], -1449220255 * Class216.aClass216_2525.anInt2533, -541069275);
		    }
		}
		int i_142_ = 1601927193 * anInt2743;
		Class477 class477 = new Class477(-1);
		Class477 class477_143_ = new Class477(-1);
		anInt2743 = 0;
		for (int index = 0; index < 233085905 * anInt2746; index++) {
		    byte[] is = landContainerData[index];
		    if (is != null) {
				int i_145_ = (64 * (anIntArray2755[index] >> 8) - (aClass522_2721.baseX * 127679513));
				int i_146_ = ((anIntArray2755[index] & 0xff) * 64 - (468558693 * aClass522_2721.baseY));
				if (currentMapType.allowDynamicMapScene(915477474)) {
				    i_145_ = 10;
				    i_146_ = 10;
				}
				int i_147_ = Class472.method10782(objectLoader, is, i_145_, i_146_,
						(anInt2725 * -38896491), (-1590385573 * anInt2726), class477_143_, class477, (byte) -8);
				if (i_147_ > 0) {
				    anInt2743 += i_147_ * -690985943;
				}
		    }
		    is = aByteArrayArray2748[index];
		    if (is != null) {
				int i_148_ = ((anIntArray2755[index] >> 8) * 64 - (aClass522_2721.baseX * 127679513));
				int i_149_ = (64 * (anIntArray2755[index] & 0xff) - (468558693 * aClass522_2721.baseY));
				if (currentMapType.allowDynamicMapScene(-1778262219)) {
				    i_148_ = 10;
				    i_149_ = 10;
				}
				int i_150_ = Class472.method10782(objectLoader, is, i_148_, i_149_, 
						-38896491 * anInt2725, anInt2726 * -1590385573, class477_143_, class477, (byte) -116);
				if (i_150_ > 0) {
				    anInt2743 += i_150_ * -690985943;
				}
		    }
		}
		if (anInt2743 * 1601927193 > 0) {
		    if (i_142_ == anInt2743 * 1601927193) {
				if (0 != anInt2739 * -574552805 && 1000 == (client.anInt8296 - anInt2739 * -574552805)) {
				    Class125.method2999(400457947 * class477_143_.anInt6401,
							class477.anInt6401 * 400457947,
							(anInt2743
							 * 1601927193),
							168689786);
				    Class222.method4483((byte) 125);
				}
		    } else {
		    	anInt2739 = client.anInt8296 * -1541223149;
		    }
		    if (-1525134879 * anInt2744 < 1601927193 * anInt2743) {
		    	anInt2744 = anInt2743 * -1508530887;
		    }
		    aClass228_2740 = Class228.aClass228_2670;
		    return false;
		}
		if (!aBool2738 && aClass228_2740 != Class228.aClass228_2672) {
		    Class434_Sub5.method14141(
		    		new StringBuilder().append(ClientMessage.LOADING.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 32213))
		    			.append(Class6.aString35).append("(100%)").toString(),
		    		true, Class236.aClass103_2713, Class5.aClass96_26,
		    		Class5.aClass639_25, 1008556625);
		}
		aClass228_2740 = Class228.aClass228_2673;
		if (!aBool2738 && Class402.soundManager != null) {
		    Class402.soundManager.method1235(2066778349);
		}
		if (!aBool2738) {
		    for (int index = 0; index < 2048; index++) {
			Player player = client.localPlayers[index];
			if (player != null)
				player.aClass552_8744 = null;
		    }
		    for (int i_152_ = 0; i_152_ < client.aClass241_Sub26Array8276.length; i_152_++) {
				ObjectNode class241_sub26 = client.aClass241_Sub26Array8276[i_152_];
				if (class241_sub26 != null) {
				    ((Class475_Sub1) class241_sub26.objectValue).aClass552_8744 = null;
				}
		    }
		}
		if (!aBool2738) {
		    Class599.method13149(true, 1082746064);
		}
		if (!aBool2738) {
		    Class93.method2095((byte) 57);
		}
		boolean bool = false;
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867.method14362((byte) 42) == 2) {
		    for (int i_153_ = 0; i_153_ < anInt2746 * 233085905; i_153_++) {
				if (aByteArrayArray2748[i_153_] != null || null != aByteArrayArray2750[i_153_]) {
				    bool = true;
				    break;
				}
		    }
		}
		int i_154_
		    = (GameShell3$FrameParameters.method5022(Class241_Sub5_Sub9.aClass241_Sub9_11043
					       .aClass445_Sub16_8858
					       .method14248((byte) -99),
					   (short) 30050).anInt1157
		       * 754258872);
		if (Class236.aClass103_2713.method2573()) {
		    i_154_++;
		}
		method4766(-2127038010);
		method4805((byte) 124);
		aClass552_2727
		    = new Class552(Class236.aClass103_2713, 9, 4,
				   -38896491 * anInt2725,
				   anInt2726 * -1590385573, i_154_,
				   bool, Class236.aClass103_2713.method2315() > 0);
		aClass552_2727.method12102(false, (byte) 38);
		aClass552_2727.method12149(-1292028001 * client.anInt8482, (byte) -29);
		if (0 != -1292028001 * client.anInt8482) {
		    aClass552_2727.method12101(Class247_Sub2.aClass96_10073, 623518843);
		} else {
		    aClass552_2727.method12101(null, 623518843);
		}
		aClass230_2734 = new Class230();
		aFloat2724 = -0.05F + (float) (Math.random() / 10.0);
		aClass299_Sub1_2720
		    = new Class299_Sub1(aClass552_2727,
					objectLoader, 4,
					-38896491 * anInt2725,
					anInt2726 * -1590385573,
					false, aClass215_2747,
					aClass501_2728);
		aClass299_Sub1_2720.method5738(1569062469);
		aClass299_Sub1_2720.anInt4521
		    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865
			  .method14150(2034584974) * 929667653;
		aClass299_Sub1_2720.aBool4522
		    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867
			  .method14362((byte) 9) == 2;
		aClass299_Sub1_2720.aBool4523
		    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864
			  .method14500(1611106168) == 1;
		aClass299_Sub1_2720.aBool4547
		    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861
			  .method14378(-684421672) == 1;
		aClass299_Sub1_2720.aBool4525
		    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890
			  .method14529(-485668821) == 1;
		if (!currentMapType.allowDynamicMapScene(-1559695015)) {
		    method4782(aClass299_Sub1_2720, mapContainerData, (byte) -120);
		} else {
		    method4783(aClass299_Sub1_2720, mapContainerData, 203903097);
		}
		if (aBool2738)
		    method4781(50, -2135849194);
		aClass501_2728.method11388
		    (-38896491 * anInt2725 >> 4,
		     -1590385573 * anInt2726 >> 4, -191448020);
		aClass501_2728.method11377(this, 1944516215);
		if (bool) {
		    aClass552_2727.method12102(true, (byte) -67);
		    aClass299_Sub1_2729
			= new Class299_Sub1(aClass552_2727,
					    objectLoader, 1,
					    -38896491 * anInt2725,
					    -1590385573 * anInt2726,
					    true, aClass215_2747,
					    aClass501_2728);
		    aClass299_Sub1_2729.method5738(1569062469);
		    aClass299_Sub1_2729.anInt4521 = Class241_Sub5_Sub9.aClass241_Sub9_11043
		    		.aClass445_Sub7_8865.method14150(961495124) * 929667653;
		    aClass299_Sub1_2729.aBool4522 = Class241_Sub5_Sub9.aClass241_Sub9_11043
		    		.aClass445_Sub27_8867.method14362((byte) -59) == 2;
		    aClass299_Sub1_2729.aBool4523 = Class241_Sub5_Sub9.aClass241_Sub9_11043
		    		.aClass445_Sub32_8864.method14500(2135710433) == 1;
		    aClass299_Sub1_2729.aBool4547 = Class241_Sub5_Sub9.aClass241_Sub9_11043
		    		.aClass445_Sub29_8861.method14378(-65572630) == 1;
		    aClass299_Sub1_2729.aBool4525 = Class241_Sub5_Sub9.aClass241_Sub9_11043
		    		.aClass445_Sub33_8890.method14529(-485668821) == 1;
		    if (!currentMapType.allowDynamicMapScene(276457606)) {
				method4782(aClass299_Sub1_2729, aByteArrayArray2750, (byte) -27);
				if (!aBool2738) {
				    Class572.method12549(true, 2121365512);
				}
		    } else {
				method4783(aClass299_Sub1_2729, aByteArrayArray2750, 203903097);
				if (!aBool2738) {
				    Class572.method12549(true, 1834287789);
				}
		    }
		    aClass299_Sub1_2729.method5745(0, (aClass299_Sub1_2720.anIntArrayArrayArray4562[0]), 2136376948);
		    aClass299_Sub1_2729.method5772(Class236.aClass103_2713, null, 1383076474);
		    aClass552_2727.method12102(false, (byte) 15);
		    if (aBool2738) {
		    	method4781(50, -1042038334);
		    }
		}
		aClass299_Sub1_2720.method5772(Class236.aClass103_2713,
				(bool ? aClass299_Sub1_2729.anIntArrayArrayArray4562 : null), -1940055660);
		if (!currentMapType.allowDynamicMapScene(-1911703283)) {
		    if (!aBool2738) {
		    	Class572.method12549(true, 1870238938);
		    }
		    method4784(aClass299_Sub1_2720, landContainerData, 907957223);
		    if (null != aByteArrayArray2751) {
		    	method4868(-475963659);
		    }
		} else {
		    if (!aBool2738) {
		    	Class572.method12549(true, 2027207541);
		    }
		    method4857(aClass299_Sub1_2720, landContainerData, -1647594723);
		}
		if (!aBool2738) {
		    Class572.method12549(true, 2083679015);
		}
		aClass299_Sub1_2720.method5747
		    (Class236.aClass103_2713,
		     (bool ? aClass552_2727.aClass166Array7140[0]
		      : null),
		     null, -1832786469);
		if (aBool2738) {
		    method4781(75, -1035569025);
		}
		aClass299_Sub1_2720.method16544(Class236.aClass103_2713, false, -681802302);
		if (aBool2738) {
		    method4781(75, -1737804959);
		}
		if (!aBool2738) {
		    Class572.method12549(true, 2068849494);
		}
		if (bool) {
		    aClass552_2727.method12102(true, (byte) 15);
		    if (!aBool2738) {
		    	Class572.method12549(true, 1921594022);
		    }
		    if (!currentMapType.allowDynamicMapScene(-2063595464)) {
		    	method4784(aClass299_Sub1_2729, aByteArrayArray2748, 734042097);
		    } else {
		    	method4857(aClass299_Sub1_2729, aByteArrayArray2748, -1288397958);
		    }
		    if (!aBool2738) {
		    	Class572.method12549(true, 1828718901);
		    }
		    aClass299_Sub1_2729.method5747
			(Class236.aClass103_2713, null,
			 aClass552_2727.aClass166Array7179[0],
			 -77649639);
		    aClass299_Sub1_2729.method16544(Class236.aClass103_2713, true, 325250642);
		    if (!aBool2738) {
		    	Class572.method12549(true, 1773976696);
		    }
		    aClass552_2727.method12102(false, (byte) -3);
		    if (aBool2738) {
		    	method4781(50, -1172129947);
		    }
		}
		aClass299_Sub1_2720.method5739(1984018205);
		if (aClass299_Sub1_2729 != null) {
		    aClass299_Sub1_2729.method5739(2102207231);
		}
		aClass552_2727.method12103(-1904410806);
		if (aBool2738) {
		    Class50.method1249((byte) 1);
		    while (!Class236.aClass103_2713.method2304(-451935997)) {
		    	method4781(1, -1806482519);
		    }
		}
		boolean bool_155_ = false;
		if (aBool2738) {
		    Class238 class238_156_ = client.aClass238_8477;
		    method4767(class238_156_, (byte) 0);
		    Class277.aClass236_4389.method4720(class238_156_, -581788135);
		    bool_155_ = true;
		    Class50.method1249((byte) 1);
		    synchronized (client.anObject8348) {
				client.aBool8346 = true;
				try {
				    client.anObject8348.wait();
				} catch (InterruptedException interruptedexception) {
				    /* empty */
				}
		    }
		    client.aClass238_8477 = this;
		    class238_156_.method4805((byte) 120);
		    method4801(9, (byte) 72);
		    method4837(-2096806172);
		} else {
		    Class402.soundManager.method1235(1159487986);
		    aClass501_2728.method11404(-944680562);
		    SoundManager.method1241(1482319719);
		}
		for (int i_157_ = 0; i_157_ < 4; i_157_++) {
		    for (int i_158_ = 0;
			 i_158_ < anInt2725 * -38896491; i_158_++) {
			for (int i_159_ = 0;
			     i_159_ < anInt2726 * -1590385573;
			     i_159_++)
			    Class39.method1041(i_157_, i_158_, i_159_, -205967946);
		    }
		}
		for (int i_160_ = 0; i_160_ < client.aClass246Array8302.length; i_160_++) {
		    if (client.aClass246Array8302[i_160_] != null) {
		    	client.aClass246Array8302[i_160_].method4925((byte) 29);
		    }
		}
		Class514.method11576((byte) -61);
		Class574.method12661(-1690072746);
		if (Class262.getEnvironment(-264464666) == GameShell3.Environment.APPLICATION
		    && client.aClass190_8340.getIO(1996588827) != null && 9 == client.anInt8288 * 1766317249) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.aClass253_4037,
		    		client.aClass190_8340.packetCipher, 16711935);
		    packet.data.writeInt(1057001181, 1456737154);
		    client.aClass190_8340.sendPacket(packet, -2102827870);
		}
		if (!currentMapType.allowDynamicMapScene(-883923785)) {
		    int i_161_ = ((currentRegionX * -1821522969 - (-38896491 * anInt2725 >> 4)) / 8);
		    int i_162_ = ((-1821522969 * currentRegionX + (anInt2725 * -38896491 >> 4)) / 8);
		    int i_163_ = ((-1657296635 * currentRegionY - (anInt2726 * -1590385573 >> 4)) / 8);
		    int i_164_ = (((-1590385573 * anInt2726 >> 4) + currentRegionY * -1657296635) / 8);
		    for (int i_165_ = i_161_ - 1; i_165_ <= 1 + i_162_; i_165_++) {
				for (int i_166_ = i_163_ - 1; i_166_ <= i_164_ + 1; i_166_++) {
				    if (i_165_ < i_161_ || i_165_ > i_162_ || i_166_ < i_163_ || i_166_ > i_164_) {
				    	Class120_Sub22.LANDSCAPES_ARCHIVE.method4241(
				    			getArchiveKey(i_165_, i_166_, -1371436670), (byte) 6);
				    }
				}
		    }
		}
		if (1766317249 * client.anInt8288 == 13) {
		    Class496.setClientStage(17, (byte) -55);
		} else if (1 == 1766317249 * client.anInt8288) {
		    Class496.setClientStage(2, (byte) -5);
		} else if (14 == client.anInt8288 * 1766317249) {
		    Class496.setClientStage(16, (byte) -10);
		} else if (client.anInt8288 * 1766317249 == 3) {
		    Class496.setClientStage(8, (byte) -47);
		} else {
		    Class496.setClientStage(19, (byte) -26);
		    if (client.aClass190_8340.getIO(-386824321) != null) {
				Class241_Sub27 packet = Class445_Sub26.makePacket(
						OutgoingOpcode.REGION_LOADING_COMPLETED_PACKET,
						client.aClass190_8340.packetCipher, 16711935);
				client.aClass190_8340.sendPacket(packet, -1601300581);
		    }
		}
		if (aBool2752) {
		    Class21.addline(Long.toString(
		    		Class50.method1249((byte) 1) - (aLong2735 * 7027199058859763887L)), (byte) 85);
		    aBool2752 = false;
		}
		if (bool_155_) {
		    synchronized (client.anObject8503) {
		    	client.anObject8503.notify();
		    }
		}
		return true;
    }
    
    void method4781(int i, int i_167_) {
	try {
	    Thread.sleep((long) i);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method4782(Class299_Sub1 class299_sub1, byte[][] is, byte i) {
		int i_168_ = is.length;
		for (int index = 0; index < i_168_; index++) {
			byte[] data = is[index];
			if (data != null) {
				RSByteBuffer buffer = new RSByteBuffer(data);
				int i_171_ = anIntArray2755[index] >> 8;
				int i_172_ = anIntArray2755[index] & 0xff;
				int i_173_ = i_171_ * 64 - (aClass522_2721.baseX * 127679513);
				int i_174_ = 64 * i_172_ - 468558693 * aClass522_2721.baseY;
				if (!aBool2738 && Class402.soundManager != null) {
					Class402.soundManager.method1235(870503939);
				}
				class299_sub1.unpackMapData(buffer, i_173_, i_174_, 
						aClass522_2721.baseX * 127679513,
						468558693 * aClass522_2721.baseY, 58198122);
				class299_sub1.method16558(Class236.aClass103_2713,
							  buffer, i_173_, i_174_, 587340003);
			}
		}
		for (int index = 0; index < i_168_; index++) {
			int i_176_ = ((anIntArray2755[index] >> 8) * 64 - aClass522_2721.baseX * 127679513);
			int i_177_ = (64 * (anIntArray2755[index] & 0xff) - 468558693 * aClass522_2721.baseY);
			byte[] is_178_ = is[index];
			if (null == is_178_ && -1657296635 * currentRegionY < 800) {
				if (!aBool2738 && Class402.soundManager != null) {
					Class402.soundManager.method1235(-596346265);
				}
				class299_sub1.method5740(i_176_, i_177_, 64, 64, -1213177649);
			}
		}
    }
    
    void method4783(Class299_Sub1 class299_sub1, byte[][] mapData, int i) {
	for (int plane = 0; plane < 918780881 * class299_sub1.anInt4526; plane++) {
	    if (!aBool2738) {
	    	Class402.soundManager.method1235(1810975938);
	    }
	    for (int deltaX = 0; deltaX < anInt2725 * -38896491 >> 3; deltaX++) {
	    	for (int deltaY = 0; deltaY < anInt2726 * -1590385573 >> 3; deltaY++) {
			    int i_182_ = anIntArrayArrayArray2754[plane][deltaX][deltaY];
			    if (-1 != i_182_) {
					int i_183_ = i_182_ >> 24 & 0x3;
					if (!class299_sub1.aBool4519 || i_183_ == 0) {
					    int i_184_ = i_182_ >> 1 & 0x3;
					    int i_185_ = i_182_ >> 14 & 0x3ff;
					    int i_186_ = i_182_ >> 3 & 0x7ff;
					    int i_187_ = (i_185_ / 8 << 8) + i_186_ / 8;
					    for (int i_188_ = 0; (i_188_ < anIntArray2755.length); i_188_++) {
							if ((anIntArray2755[i_188_] == i_187_) && mapData[i_188_] != null) {
							    RSByteBuffer buffer = new RSByteBuffer(mapData[i_188_]);
							    class299_sub1.method5743(buffer,
							    		plane, 8 * deltaX, deltaY * 8,
										     i_183_, i_185_,
										     i_186_, i_184_,
										     (byte) -25);
							    class299_sub1.method16536(Class236.aClass103_2713,
							    		buffer, plane, deltaX * 8,
							    		deltaY * 8, i_183_, i_185_, i_186_,
							    		i_184_, 203871494);
							    break;
							}
					    }
					}
			    }
	    	}
	    }
	}
	for (int i_189_ = 0; i_189_ < class299_sub1.anInt4526 * 918780881;
	     i_189_++) {
	    if (!aBool2738)
		Class402.soundManager.method1235(451150489);
	    for (int i_190_ = 0;
		 i_190_ < -38896491 * anInt2725 >> 3;
		 i_190_++) {
		for (int i_191_ = 0;
		     i_191_ < anInt2726 * -1590385573 >> 3;
		     i_191_++) {
		    int i_192_ = (anIntArrayArrayArray2754
				  [i_189_][i_190_][i_191_]);
		    if (-1 == i_192_)
			class299_sub1.method5757(i_189_, i_190_ * 8,
						 i_191_ * 8, 8, 8,
						 -1071084864);
		}
	    }
	}
    }
    
    void method4784(Class299_Sub1 class299_sub1, byte[][] landscapeData, int i) {
		for (int index = 0; index < 233085905 * anInt2746; index++) {
		    byte[] data = landscapeData[index];
		    if (null != data) {
				int i_195_ = ((anIntArray2755[index] >> 8) * 64 - (aClass522_2721.baseX * 127679513));
				int i_196_ = ((anIntArray2755[index] & 0xff) * 64 - (aClass522_2721.baseY * 468558693));
				if (!aBool2738) {
				    Class402.soundManager.method1235(1434081391);
				}
				class299_sub1.unpackNodeData(Class236.aClass103_2713, data, i_195_, i_196_, -972893814);
				if (aBool2738) {
				    method4781(10, -1284300848);
				}
		    }
		}
    }
    
    public byte[][][] method4785(int i) {
	return aByteArrayArrayArray2753;
    }
    
    public void method4786(int i) {
	if (aClass552_2727 != null) {
	    Class277.method5370(-209804591);
	    aClass552_2727.aClass576_7180
		.method12663((byte) 32);
	    aClass552_2727 = null;
	}
    }
    
    public Class230 method4787(byte i) {
	return aClass230_2734;
    }
    
    public MapType method4788() {
	return currentMapType;
    }
    
    void method4789() {
	aClass299_Sub1_2729 = null;
	aClass299_Sub1_2720 = null;
	if (aClass215_2747 != null)
	    aClass215_2747.method4329(1048577711);
	if (aClass501_2728 != null)
	    aClass501_2728.method11387((byte) -36);
	if (aClass552_2727 != null) {
	    aClass552_2727.aClass576_7180
		.method12663((byte) 81);
	    aClass552_2727 = null;
	}
    }
    
    public MapType method4790() {
	return currentMapType;
    }
    
    public Class228 method4791() {
	return aClass228_2740;
    }
    
    public int method4792() {
	return 100 - (1278929348 * anInt2743
		      / (-1525134879 * anInt2744));
    }
    
    public int method4793() {
	return 100 - (784237428 * anInt2741
		      / (-2053976663 * anInt2742));
    }
    
    public Class230 method4794() {
	return aClass230_2734;
    }
    
    public GameScene method4795() {
	return aClass522_2721;
    }
    
    public MapType method4796() {
	return currentMapType;
    }
    
    public int method4797() {
	return -38896491 * anInt2725;
    }
    
    public int method4798() {
	return -38896491 * anInt2725;
    }
    
    public int method4799() {
	return anInt2726 * -1590385573;
    }
    
    public Class564 method4800() {
	return aClass564_2715;
    }
    
    void method4801(int i, byte i_197_) {
		int i_198_ = (aClass522_2721.baseX * 127679513 - 127679513 * aClass522_2722.baseX);
		int i_199_ = (aClass522_2721.baseY * 468558693 - aClass522_2722.baseY * 468558693);
		if (9 == i) {
		    for (int index = 0; index < client.anInt8434 * 743597371; index++) {
				ObjectNode class241_sub26 = client.aClass241_Sub26Array8276[index];
				if (null != class241_sub26) {
				    NPC npc = ((NPC) class241_sub26.objectValue);
				    for (int i_201_ = 0; i_201_ < npc.scenePositionXQueue.length; i_201_++) {
				    	npc.scenePositionXQueue[i_201_] -= i_198_;
				    	npc.scenePositionYQueue[i_201_] -= i_199_;
				    }
				    Class287 class287 = Class287.method5562(npc.method10874().aClass287_4386);
				    class287.aFloat4477 -= (float) (512 * i_198_);
				    class287.aFloat4479 -= (float) (512 * i_199_);
				    npc.method10898(class287);
				    class287.method5564();
				}
		    }
		} else {
		    boolean bool = false;
		    client.localNpcCount = 0;
		    int i_202_ = 1559833088 * anInt2725 - 512;
		    int i_203_ = 1766372864 * anInt2726 - 512;
		    for (int i_204_ = 0; i_204_ < 743597371 * client.anInt8434; i_204_++) {
				ObjectNode class241_sub26 = client.aClass241_Sub26Array8276[i_204_];
				if (null != class241_sub26) {
				    NPC npc = ((NPC) class241_sub26.objectValue);
				    Class287 class287 = Class287.method5562(npc.method10874().aClass287_4386);
				    class287.aFloat4477 -= (float) (i_198_ * 512);
				    class287.aFloat4479 -= (float) (512 * i_199_);
				    npc.method10898(class287);
				    if ((int) class287.aFloat4477 < 0 || (int) class287.aFloat4477 > i_202_
				    		|| (int) class287.aFloat4479 < 0 || (int) class287.aFloat4479 > i_203_) {
				    	npc.setDefinition(null, 1408792449);
						class241_sub26.remove((byte) 36);
						bool = true;
				    } else {
						boolean bool_205_ = true;
						for (int i_206_ = 0; i_206_ < npc.scenePositionXQueue.length; i_206_++) {
							npc.scenePositionXQueue[i_206_] -= i_198_;
							npc.scenePositionYQueue[i_206_] -= i_199_;
						    if ((npc.scenePositionXQueue[i_206_]) < 0
						    		|| ((npc.scenePositionXQueue[i_206_]) >= -38896491 * anInt2725)
						    		|| (npc.scenePositionYQueue[i_206_]) < 0
						    		|| ((npc.scenePositionYQueue[i_206_]) >= (anInt2726 * -1590385573))) {
						    	bool_205_ = false;
						    }
						}
						if (bool_205_) {
						    client.localNpcIndicies[((client.localNpcCount+= 1541490607) * -1837469873) - 1]
						    		= (-546698383 * npc.entityIndex);
						} else {
							npc.setDefinition(null, 188209819);
						    class241_sub26.remove((byte) 36);
						    bool = true;
						}
				    }
				    class287.method5564();
				}
		    }
		    if (bool) {
				client.anInt8434 = client.aClass407_8457.method7306(961477773) * 1674259443;
				int i_207_ = 0;
				Iterator<?> iterator = client.aClass407_8457.iterator();
				while (iterator.hasNext()) {
				    ObjectNode class241_sub26 = (ObjectNode) iterator.next();
				    client.aClass241_Sub26Array8276[i_207_++] = class241_sub26;
				}
		    }
		}
		for (int index = 0; index < 2048; index++) {
		    Player player = client.localPlayers[index];
		    if (null != player) {
				for (int i_209_ = 0; (i_209_ < player.scenePositionXQueue.length); i_209_++) {
					player.scenePositionXQueue[i_209_] -= i_198_;
					player.scenePositionYQueue[i_209_] -= i_199_;
				}
				Class287 class287 = Class287.method5562(player.method10874().aClass287_4386);
				class287.aFloat4477 -= (float) (512 * i_198_);
				class287.aFloat4479 -= (float) (i_199_ * 512);
				player.method10898(class287);
				class287.method5564();
		    }
		}
		Class192[] class192s = client.aClass192Array8301;
		for (int i_210_ = 0; i_210_ < class192s.length; i_210_++) {
		    Class192 class192 = class192s[i_210_];
		    if (class192 != null) {
				class192.anInt2289 -= i_198_ * 1000515072;
				class192.anInt2290 -= -266192384 * i_199_;
		    }
		}
		for (WorldObject class241_sub30 = ((WorldObject) WorldObject.aClass429_10039.method7694(16711935));
				class241_sub30 != null;
				class241_sub30 = (WorldObject) WorldObject.aClass429_10039.method7692(395716732)) {
		    class241_sub30.posX -= -620199377 * i_198_;
		    class241_sub30.posY -= i_199_ * -1643505007;
		    ObjectDefinition class526 = objectLoader.getObjectDefinition(
		    		(class241_sub30.id * 289493935), 577892407);
		    int i_211_;
		    int i_212_;
		    if ((class241_sub30.rotation * 1543441831 & 0x1) == 0) {
				i_211_ = class526.sizeX * 1351092869;
				i_212_ = 333584223 * class526.sizeY;
		    } else {
				i_211_ = 333584223 * class526.sizeY;
				i_212_ = class526.sizeX * 1351092869;
		    }
		    if (MapType.aClass235_2706 != currentMapType
			&& (class241_sub30.posX * 1204421839 + i_211_ <= 0
			    || i_212_ + -320018831 * class241_sub30.posY <= 0
			    || (1204421839 * class241_sub30.posX
				>= -38896491 * anInt2725)
			    || (-320018831 * class241_sub30.posY
				>= anInt2726 * -1590385573)))
			class241_sub30.remove((byte) 36);
		}
		for (WorldObject class241_sub30
			 = ((WorldObject)
			    WorldObject.aClass429_10053.method7694(16711935));
		     class241_sub30 != null;
		     class241_sub30 = (WorldObject) WorldObject
							   .aClass429_10053
							   .method7692(-418859442)) {
		    class241_sub30.posX -= -620199377 * i_198_;
		    class241_sub30.posY -= i_199_ * -1643505007;
		    ObjectDefinition class526
			= objectLoader.getObjectDefinition(((class241_sub30
									 .id)
									* 289493935),
								       577892407);
		    int i_213_;
		    int i_214_;
		    if (0 == (1543441831 * class241_sub30.rotation & 0x1)) {
			i_213_ = class526.sizeX * 1351092869;
			i_214_ = class526.sizeY * 333584223;
		    } else {
			i_213_ = 333584223 * class526.sizeY;
			i_214_ = class526.sizeX * 1351092869;
		    }
		    if (currentMapType != MapType.aClass235_2706
			&& (i_213_ + class241_sub30.posX * 1204421839 <= 0
			    || -320018831 * class241_sub30.posY + i_214_ <= 0
			    || (class241_sub30.posX * 1204421839
				>= -38896491 * anInt2725)
			    || (class241_sub30.posY * -320018831
				>= -1590385573 * anInt2726)))
			class241_sub30.remove((byte) 36);
		}
		for (WorldTile class241_sub44
			 = ((WorldTile)
			    client.aClass407_8452.method7294(2090894173));
		     class241_sub44 != null;
		     class241_sub44 = ((WorldTile)
				       client.aClass407_8452.method7295(908401684))) {
		    int i_215_
			= (int) (4356572401218184725L * class241_sub44.hashCode >> 28
				 & 0x3L);
		    int i_216_ = (int) (4356572401218184725L * class241_sub44.hashCode
					& 0x3fffL);
		    int i_217_
			= (i_216_
			   - 127679513 * aClass522_2721.baseX);
		    int i_218_
			= (int) (4356572401218184725L * class241_sub44.hashCode >> 14
				 & 0x3fffL);
		    int i_219_
			= (i_218_
			   - 468558693 * aClass522_2721.baseY);
		    if (null != aClass552_2727) {
			if (i_217_ < 0 || i_219_ < 0
			    || i_217_ >= -38896491 * anInt2725
			    || i_219_ >= -1590385573 * anInt2726
			    || i_217_ >= (aClass552_2727.anInt7138
					  * 120442351)
			    || i_219_ >= (aClass552_2727.anInt7142
					  * -2069974325)) {
			    if (MapType.aClass235_2706
				!= currentMapType)
				class241_sub44.remove((byte) 36);
			} else if (null != (aClass552_2727
					    .aClass548ArrayArrayArray7169))
			    aClass552_2727
				.method12128(i_215_, i_217_, i_219_, -1418458301);
		    }
		}
		if (0 != Class194.minimapFlagX * 1813149433) {
		    Class194.minimapFlagX -= i_198_ * -980260023;
		    Class194.minimapFlagY -= -1262506991 * i_199_;
		}
		Class19.method881(false, 1508169584);
		if (9 == i) {
		    client.anInt8557 -= -1699409408 * i_198_;
		    client.anInt8361 -= 52046336 * i_199_;
		    Class291.anInt4488 -= i_198_ * -399596032;
		    Class354_Sub2.anInt10492 -= 731258368 * i_199_;
		    if (5 != 115241065 * Class296.anInt4513 && 115241065 * Class296.anInt4513 != 4) {
		    	Class592.method12924(Class520.method11690(-1157380297), -350527124);
		    }
		} else {
		    Class563.anInt7304 -= i_198_ * 1851273669;
		    Class473.anInt6379 -= i_199_ * -587410343;
		    Class421.anInt6040 -= i_198_ * 1596135215;
		    Class380_Sub2.anInt10409 -= i_199_ * 1825904949;
		    Class462.anInt6284 -= i_198_ * 1549126144;
		    Class636.anInt8248 -= 477807104 * i_199_;
		    if (Math.abs(i_198_) > anInt2725 * -38896491
		    		|| (Math.abs(i_199_) > -1590385573 * anInt2726)) {
		    	aClass501_2728.method11400(-684149885);
		    }
		}
		Class122.method2983(-2005474295);
		Class55.method1371(2027744121);
		client.aClass407_8454.method7293(189443203);
		client.aClass429_8478.method7652((byte) 103);
		client.aClass421_8376.method7521((byte) -48);
		Class445_Sub25.method14350(1316171485);
    }
    
    public Class564 method4802() {
    	return aClass564_2715;
    }
    
    public boolean dummyMethod4803() {
	if (!aBool2738)
	    Class572.method12549(false, 1895369380);
	anInt2741 = 0;
	for (int i = 0; i < anInt2746 * 233085905; i++) {
	    if (!Class120_Sub22.LANDSCAPES_ARCHIVE.containerExists(archiveKeys[i], 890352328)) {
			anInt2741 += -205428115;
		}
	}
	if (null == aClass564_2715) {
	    if (null != aClass241_Sub39_Sub12_2732
		&& (Class608.WORLD_MAP_ARCHIVE.method4204
		    (new StringBuilder().append
			 (aClass241_Sub39_Sub12_2732
			  .aString10922)
			 .append
			 ("_staticelements").toString(),
		     1243702865))) {
		if (!Class608.WORLD_MAP_ARCHIVE.containerIdentifierExists
		     (new StringBuilder().append
			  (aClass241_Sub39_Sub12_2732
			   .aString10922)
			  .append
			  ("_staticelements").toString(),
		      491710453))
		    anInt2741 += -205428115;
		else
		    aClass564_2715
			= Class349.method6233(Class608.WORLD_MAP_ARCHIVE,
					      new StringBuilder().append
						  (((Class238) this)
						   .aClass241_Sub39_Sub12_2732
						   .aString10922)
						  .append
						  ("_staticelements")
						  .toString(),
					      client.isP2pWorld, (byte) 108);
	    } else
		aClass564_2715 = new Class564(0);
	}
	if (-1838993563 * anInt2741 > 0) {
	    if (-2053976663 * anInt2742
		< anInt2741 * -1838993563)
		anInt2742
		    = anInt2741 * -694398627;
	    aClass228_2740 = Class228.aClass228_2671;
	    return false;
	}
	for (int i = 0; i < anInt2746 * 233085905; i++) {
	    if (mapContainerData[i] == null)
		mapContainerData[i]
		    = (Class120_Sub22.LANDSCAPES_ARCHIVE.getfile
		       (archiveKeys[i],
			-1449220255 * Class216.VIRTUAL_MAPS.anInt2533,
			71820771));
	    if (landContainerData[i] == null)
		landContainerData[i]
		    = (Class120_Sub22.LANDSCAPES_ARCHIVE.getfile
		       (archiveKeys[i],
			-1449220255 * Class216.PHYSICAL_NODES.anInt2533,
			349485171));
	    if (null == aByteArrayArray2750[i])
		aByteArrayArray2750[i]
		    = (Class120_Sub22.LANDSCAPES_ARCHIVE.getfile
		       (archiveKeys[i],
			Class216.aClass216_2528.anInt2533 * -1449220255,
			-1322143376));
	    if (aByteArrayArray2748[i] == null)
		aByteArrayArray2748[i]
		    = (Class120_Sub22.LANDSCAPES_ARCHIVE.getfile
		       (archiveKeys[i],
			Class216.aClass216_2527.anInt2533 * -1449220255,
			1539156960));
	    if (null != aByteArrayArray2751
		&& aByteArrayArray2751[i] == null)
		aByteArrayArray2751[i]
		    = (Class120_Sub22.LANDSCAPES_ARCHIVE.getfile
		       (archiveKeys[i],
			-1449220255 * Class216.aClass216_2525.anInt2533,
			-981228006));
	}
	int i = 1601927193 * anInt2743;
	Class477 class477 = new Class477(-1);
	Class477 class477_220_ = new Class477(-1);
	anInt2743 = 0;
	for (int i_221_ = 0; i_221_ < 233085905 * anInt2746;
	     i_221_++) {
	    byte[] is = landContainerData[i_221_];
	    if (is != null) {
		int i_222_
		    = (64 * (anIntArray2755[i_221_] >> 8)
		       - (aClass522_2721.baseX
			  * 127679513));
		int i_223_
		    = ((anIntArray2755[i_221_] & 0xff) * 64
		       - (468558693
			  * aClass522_2721.baseY));
		if (currentMapType.allowDynamicMapScene(-832623222)) {
		    i_222_ = 10;
		    i_223_ = 10;
		}
		int i_224_ = (Class472.method10782
			      (objectLoader, is, i_222_,
			       i_223_, anInt2725 * -38896491,
			       -1590385573 * anInt2726,
			       class477_220_, class477, (byte) -90));
		if (i_224_ > 0)
		    anInt2743 += i_224_ * -690985943;
	    }
	    is = aByteArrayArray2748[i_221_];
	    if (is != null) {
		int i_225_
		    = ((anIntArray2755[i_221_] >> 8) * 64
		       - (aClass522_2721.baseX
			  * 127679513));
		int i_226_
		    = (64 * (anIntArray2755[i_221_] & 0xff)
		       - (468558693
			  * aClass522_2721.baseY));
		if (currentMapType.allowDynamicMapScene(-841946675)) {
		    i_225_ = 10;
		    i_226_ = 10;
		}
		int i_227_ = (Class472.method10782
			      (objectLoader, is, i_225_,
			       i_226_, -38896491 * anInt2725,
			       anInt2726 * -1590385573,
			       class477_220_, class477, (byte) -35));
		if (i_227_ > 0)
		    anInt2743 += i_227_ * -690985943;
	    }
	}
	if (anInt2743 * 1601927193 > 0) {
	    if (i == anInt2743 * 1601927193) {
		if (0 != anInt2739 * -574552805
		    && 1000 == (client.anInt8296
				- anInt2739 * -574552805)) {
		    Class125.method2999(400457947 * class477_220_.anInt6401,
					class477.anInt6401 * 400457947,
					(anInt2743
					 * 1601927193),
					-775094368);
		    Class222.method4483((byte) 41);
		}
	    } else
		anInt2739 = client.anInt8296 * -1541223149;
	    if (-1525134879 * anInt2744
		< 1601927193 * anInt2743)
		anInt2744
		    = anInt2743 * -1508530887;
	    aClass228_2740 = Class228.aClass228_2670;
	    return false;
	}
	if (!aBool2738
	    && aClass228_2740 != Class228.aClass228_2672)
	    Class434_Sub5.method14141
		(new StringBuilder().append
		     (ClientMessage.LOADING
			  .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 30294))
		     .append
		     (Class6.aString35).append
		     ("(100%)").toString(),
		 true, Class236.aClass103_2713, Class5.aClass96_26,
		 Class5.aClass639_25, 1574417256);
	aClass228_2740 = Class228.aClass228_2673;
	if (!aBool2738 && Class402.soundManager != null)
	    Class402.soundManager.method1235(-437024152);
	if (!aBool2738) {
	    for (int i_228_ = 0; i_228_ < 2048; i_228_++) {
		Player class475_sub1_sub1_sub3_sub1
		    = client.localPlayers[i_228_];
		if (class475_sub1_sub1_sub3_sub1 != null)
		    class475_sub1_sub1_sub3_sub1.aClass552_8744 = null;
	    }
	    for (int i_229_ = 0;
		 i_229_ < client.aClass241_Sub26Array8276.length; i_229_++) {
		ObjectNode class241_sub26
		    = client.aClass241_Sub26Array8276[i_229_];
		if (class241_sub26 != null)
		    ((Class475_Sub1)
		     class241_sub26.objectValue).aClass552_8744
			= null;
	    }
	}
	if (!aBool2738)
	    Class599.method13149(true, 1082746064);
	if (!aBool2738)
	    Class93.method2095((byte) 80);
	boolean bool = false;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867
		.method14362((byte) -22)
	    == 2) {
	    for (int i_230_ = 0;
		 i_230_ < anInt2746 * 233085905; i_230_++) {
		if (aByteArrayArray2748[i_230_] != null
		    || null != aByteArrayArray2750[i_230_]) {
		    bool = true;
		    break;
		}
	    }
	}
	int i_231_
	    = (GameShell3$FrameParameters.method5022(Class241_Sub5_Sub9.aClass241_Sub9_11043
				       .aClass445_Sub16_8858
				       .method14248((byte) -96),
				   (short) 20329).anInt1157
	       * 754258872);
	if (Class236.aClass103_2713.method2573())
	    i_231_++;
	method4766(-1767847962);
	method4805((byte) 71);
	aClass552_2727
	    = new Class552(Class236.aClass103_2713, 9, 4,
			   -38896491 * anInt2725,
			   anInt2726 * -1590385573, i_231_,
			   bool, Class236.aClass103_2713.method2315() > 0);
	aClass552_2727.method12102(false, (byte) 0);
	aClass552_2727
	    .method12149(-1292028001 * client.anInt8482, (byte) -126);
	if (0 != -1292028001 * client.anInt8482)
	    aClass552_2727
		.method12101(Class247_Sub2.aClass96_10073, 623518843);
	else
	    aClass552_2727.method12101(null, 623518843);
	aClass230_2734 = new Class230();
	aFloat2724 = -0.05F + (float) (Math.random() / 10.0);
	aClass299_Sub1_2720
	    = new Class299_Sub1(aClass552_2727,
				objectLoader, 4,
				-38896491 * anInt2725,
				anInt2726 * -1590385573,
				false, aClass215_2747,
				aClass501_2728);
	aClass299_Sub1_2720.method5738(1569062469);
	aClass299_Sub1_2720.anInt4521
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865
		  .method14150(894684211) * 929667653;
	aClass299_Sub1_2720.aBool4522
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867
		  .method14362((byte) 26) == 2;
	aClass299_Sub1_2720.aBool4523
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864
		  .method14500(1157312663) == 1;
	aClass299_Sub1_2720.aBool4547
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861
		  .method14378(-1854640136) == 1;
	aClass299_Sub1_2720.aBool4525
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890
		  .method14529(-485668821) == 1;
	if (!currentMapType.allowDynamicMapScene(1216739924))
	    method4782(aClass299_Sub1_2720,
		       mapContainerData, (byte) -122);
	else
	    method4783(aClass299_Sub1_2720,
		       mapContainerData, 203903097);
	if (aBool2738)
	    method4781(50, -1164154683);
	aClass501_2728.method11388
	    (-38896491 * anInt2725 >> 4,
	     -1590385573 * anInt2726 >> 4, -136236771);
	aClass501_2728.method11377(this, 1482721553);
	if (bool) {
	    aClass552_2727.method12102(true, (byte) 65);
	    aClass299_Sub1_2729
		= new Class299_Sub1(aClass552_2727,
				    objectLoader, 1,
				    -38896491 * anInt2725,
				    -1590385573 * anInt2726,
				    true, aClass215_2747,
				    aClass501_2728);
	    aClass299_Sub1_2729.method5738(1569062469);
	    aClass299_Sub1_2729.anInt4521
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub7_8865.method14150(1214064568) * 929667653;
	    aClass299_Sub1_2729.aBool4522
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub27_8867.method14362((byte) -48) == 2;
	    aClass299_Sub1_2729.aBool4523
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub32_8864.method14500(1756049175) == 1;
	    aClass299_Sub1_2729.aBool4547
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub29_8861.method14378(181813066) == 1;
	    aClass299_Sub1_2729.aBool4525
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub33_8890.method14529(-485668821) == 1;
	    if (!currentMapType.allowDynamicMapScene(-1261807033)) {
		method4782(aClass299_Sub1_2729,
			   aByteArrayArray2750, (byte) -123);
		if (!aBool2738)
		    Class572.method12549(true, 1686293817);
	    } else {
		method4783(aClass299_Sub1_2729,
			   aByteArrayArray2750, 203903097);
		if (!aBool2738)
		    Class572.method12549(true, 2090244448);
	    }
	    aClass299_Sub1_2729.method5745
		(0, (aClass299_Sub1_2720
		     .anIntArrayArrayArray4562[0]), 2135198574);
	    aClass299_Sub1_2729
		.method5772(Class236.aClass103_2713, null, 842704759);
	    aClass552_2727.method12102(false, (byte) -10);
	    if (aBool2738)
		method4781(50, -1575674574);
	}
	aClass299_Sub1_2720.method5772
	    (Class236.aClass103_2713,
	     (bool
	      ? aClass299_Sub1_2729.anIntArrayArrayArray4562
	      : null),
	     1677540915);
	if (!currentMapType.allowDynamicMapScene(-1773320666)) {
	    if (!aBool2738)
		Class572.method12549(true, 2087214838);
	    method4784(aClass299_Sub1_2720,
		       landContainerData, -655996428);
	    if (null != aByteArrayArray2751)
		method4868(-2086799075);
	} else {
	    if (!aBool2738)
		Class572.method12549(true, 1738345178);
	    method4857(aClass299_Sub1_2720,
		       landContainerData, -1203793031);
	}
	if (!aBool2738)
	    Class572.method12549(true, 1865928029);
	aClass299_Sub1_2720.method5747
	    (Class236.aClass103_2713,
	     (bool ? aClass552_2727.aClass166Array7140[0]
	      : null),
	     null, 1531848425);
	if (aBool2738)
	    method4781(75, -1748303048);
	aClass299_Sub1_2720
	    .method16544(Class236.aClass103_2713, false, -181202213);
	if (aBool2738)
	    method4781(75, -1090022453);
	if (!aBool2738)
	    Class572.method12549(true, 2046251412);
	if (bool) {
	    aClass552_2727.method12102(true, (byte) 36);
	    if (!aBool2738)
		Class572.method12549(true, 1831287813);
	    if (!currentMapType.allowDynamicMapScene(663013297))
		method4784(aClass299_Sub1_2729,
			   aByteArrayArray2748, -450647186);
	    else
		method4857(aClass299_Sub1_2729,
			   aByteArrayArray2748, -1455683703);
	    if (!aBool2738)
		Class572.method12549(true, 2104757904);
	    aClass299_Sub1_2729.method5747
		(Class236.aClass103_2713, null,
		 aClass552_2727.aClass166Array7179[0],
		 -1403082196);
	    aClass299_Sub1_2729
		.method16544(Class236.aClass103_2713, true, -611311305);
	    if (!aBool2738)
		Class572.method12549(true, 1794866377);
	    aClass552_2727.method12102(false, (byte) 47);
	    if (aBool2738)
		method4781(50, -1114274640);
	}
	aClass299_Sub1_2720.method5739(1620122755);
	if (aClass299_Sub1_2729 != null)
	    aClass299_Sub1_2729.method5739(1841740007);
	aClass552_2727.method12103(-2063385693);
	if (aBool2738) {
	    Class50.method1249((byte) 1);
	    while (!Class236.aClass103_2713.method2304(-451935997))
		method4781(1, -1874341040);
	}
	boolean bool_232_ = false;
	if (aBool2738) {
	    Class238 class238_233_ = client.aClass238_8477;
	    method4767(class238_233_, (byte) 0);
	    Class277.aClass236_4389.method4720(class238_233_, -581788135);
	    bool_232_ = true;
	    Class50.method1249((byte) 1);
	    synchronized (client.anObject8348) {
		client.aBool8346 = true;
		try {
		    client.anObject8348.wait();
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	    client.aClass238_8477 = this;
	    class238_233_.method4805((byte) 43);
	    method4801(9, (byte) 43);
	    method4837(-2090370864);
	} else {
	    Class402.soundManager.method1235(-548932520);
	    aClass501_2728.method11404(-944680562);
	    SoundManager.method1241(1482319719);
	}
	for (int i_234_ = 0; i_234_ < 4; i_234_++) {
	    for (int i_235_ = 0;
		 i_235_ < anInt2725 * -38896491; i_235_++) {
		for (int i_236_ = 0;
		     i_236_ < anInt2726 * -1590385573;
		     i_236_++)
		    Class39.method1041(i_234_, i_235_, i_236_, 1504403664);
	    }
	}
	for (int i_237_ = 0; i_237_ < client.aClass246Array8302.length;
	     i_237_++) {
	    if (client.aClass246Array8302[i_237_] != null)
		client.aClass246Array8302[i_237_].method4925((byte) 54);
	}
	Class514.method11576((byte) -29);
	Class574.method12661(-1690072746);
	if (Class262.getEnvironment(1828059764) == GameShell3.Environment.APPLICATION
	    && client.aClass190_8340.getIO(544832489) != null
	    && 9 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4037,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeInt(1057001181,
								-114816633);
	    client.aClass190_8340.sendPacket(class241_sub27, -1896065975);
	}
	if (!currentMapType.allowDynamicMapScene(-936793976)) {
	    int i_238_ = ((currentRegionX * -1821522969
			   - (-38896491 * anInt2725 >> 4))
			  / 8);
	    int i_239_ = ((-1821522969 * currentRegionX
			   + (anInt2725 * -38896491 >> 4))
			  / 8);
	    int i_240_ = ((-1657296635 * currentRegionY
			   - (anInt2726 * -1590385573 >> 4))
			  / 8);
	    int i_241_ = (((-1590385573 * anInt2726 >> 4)
			   + currentRegionY * -1657296635)
			  / 8);
	    for (int i_242_ = i_238_ - 1; i_242_ <= 1 + i_239_; i_242_++) {
		for (int i_243_ = i_240_ - 1; i_243_ <= i_241_ + 1; i_243_++) {
		    if (i_242_ < i_238_ || i_242_ > i_239_ || i_243_ < i_240_
			|| i_243_ > i_241_)
			Class120_Sub22.LANDSCAPES_ARCHIVE.method4241
			    (getArchiveKey(i_242_, i_243_, -2125823125),
			     (byte) -61);
		}
	    }
	}
	if (1766317249 * client.anInt8288 == 13)
	    Class496.setClientStage(17, (byte) -65);
	else if (1 == 1766317249 * client.anInt8288)
	    Class496.setClientStage(2, (byte) -100);
	else if (14 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(16, (byte) -58);
	else if (client.anInt8288 * 1766317249 == 3)
	    Class496.setClientStage(8, (byte) -17);
	else {
	    Class496.setClientStage(19, (byte) -117);
	    if (client.aClass190_8340.getIO(569940871) != null) {
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(OutgoingOpcode.REGION_LOADING_COMPLETED_PACKET,
						 (client.aClass190_8340
						  .packetCipher),
						 16711935);
		client.aClass190_8340.sendPacket(class241_sub27, -2087348233);
	    }
	}
	if (aBool2752) {
	    Class21.addline(Long.toString(Class50.method1249((byte) 1)
					    - (aLong2735
					       * 7027199058859763887L)),
			      (byte) 85);
	    aBool2752 = false;
	}
	if (bool_232_) {
	    synchronized (client.anObject8503) {
		client.anObject8503.notify();
	    }
	}
	return true;
    }
    
    public Class230 method4804() {
	return aClass230_2734;
    }
    
    void method4805(byte i) {
	aClass299_Sub1_2729 = null;
	aClass299_Sub1_2720 = null;
	if (aClass215_2747 != null)
	    aClass215_2747.method4329(884234515);
	if (aClass501_2728 != null)
	    aClass501_2728.method11387((byte) -67);
	if (aClass552_2727 != null) {
	    aClass552_2727.aClass576_7180
		.method12663((byte) 35);
	    aClass552_2727 = null;
	}
    }
    
    public GameScene method4806(byte i) {
	return aClass522_2721;
    }
    
    public int method4807() {
	return anInt2730 * -595491209;
    }
    
    public int method4808() {
	return anInt2730 * -595491209;
    }
    
    void method4809() {
	int i = aByteArrayArray2751.length;
	for (int i_244_ = 0; i_244_ < i; i_244_++) {
	    if (aByteArrayArray2751[i_244_] != null) {
		int i_245_ = -1;
		for (int i_246_ = 0; i_246_ < 138843337 * client.anInt8350;
		     i_246_++) {
		    if (client.anIntArray8546[i_246_]
			== anIntArray2755[i_244_]) {
			i_245_ = i_246_;
			break;
		    }
		}
		if (-1 == i_245_) {
		    client.anIntArray8546[client.anInt8350 * 138843337]
			= anIntArray2755[i_244_];
		    i_245_ = (client.anInt8350 += 545113465) * 138843337 - 1;
		}
		RSByteBuffer class241_sub3
		    = new RSByteBuffer(aByteArrayArray2751
					[i_244_]);
		int i_247_ = 0;
		while ((class241_sub3.pointer * 421967667
			< aByteArrayArray2751[i_244_].length)
		       && i_247_ < 511
		       && -1837469873 * client.localNpcCount < 1023) {
		    int i_248_ = i_245_ | i_247_++ << 6;
		    int i_249_ = class241_sub3.readUnsignedShort(1162222719);
		    int i_250_ = i_249_ >> 14;
		    int i_251_ = i_249_ >> 7 & 0x3f;
		    int i_252_ = i_249_ & 0x3f;
		    int i_253_
			= (64 * (anIntArray2755[i_244_] >> 8)
			   - (127679513
			      * aClass522_2721.baseX)
			   + i_251_);
		    int i_254_ = ((anIntArray2755[i_244_]
				   & 0xff) * 64
				  - 468558693 * (((Class238) this)
						 .aClass522_2721.baseY)
				  + i_252_);
		    NPCDefinition class401
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   (class241_sub3.readUnsignedShort(1162222719),
			    -1738634483));
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i_248_));
		    if (class241_sub26 == null
			&& (class401.walkMask & 0x1) > 0 && i_253_ >= 0
			&& (class401.size * 19489015 + i_253_
			    < -38896491 * anInt2725)
			&& i_254_ >= 0
			&& (class401.size * 19489015 + i_254_
			    < -1590385573 * anInt2726)) {
			NPC class475_sub1_sub1_sub3_sub2
			    = (new NPC
			       (aClass552_2727));
			class475_sub1_sub1_sub3_sub2.entityIndex
			    = 1641239953 * i_248_;
			ObjectNode class241_sub26_255_
			    = new ObjectNode(class475_sub1_sub1_sub3_sub2);
			client.aClass407_8457.put(class241_sub26_255_,
							 (long) i_248_);
			client.aClass241_Sub26Array8276
			    [(client.anInt8434 += 1674259443) * 743597371 - 1]
			    = class241_sub26_255_;
			client.localNpcIndicies[((client.localNpcCount += 1541490607)
					       * -1837469873) - 1]
			    = i_248_;
			class475_sub1_sub1_sub3_sub2.anInt11410
			    = 216794573 * client.anInt8296;
			class475_sub1_sub1_sub3_sub2.setDefinition(class401,
								 1274846965);
			class475_sub1_sub1_sub3_sub2.method17781
			    (19489015 * (class475_sub1_sub1_sub3_sub2
					 .definition.size),
			     (byte) -38);
			class475_sub1_sub1_sub3_sub2.anInt11400
			    = (607575013 * (class475_sub1_sub1_sub3_sub2
					    .definition.headsIcon)
			       << 3) * -687691613;
			class475_sub1_sub1_sub3_sub2.setDirection
			    (class475_sub1_sub1_sub3_sub2.definition
				 .respawnDirection.method7822
				 (1609262383).getId((byte) 0) << 11 & 0x3fff,
			     true, (byte) 39);
			class475_sub1_sub1_sub3_sub2.method17994
			    (i_250_, i_253_, i_254_, true,
			     class475_sub1_sub1_sub3_sub2
				 .method17782(1181491656),
			     -16777216);
		    }
		}
	    }
	}
    }
    
    void method4810() {
	aClass235_2717 = currentMapType;
	method4775(Class71.aClass71_1088, (byte) 0);
	for (int i = 0; i < 4; i++) {
	    for (int i_256_ = 0;
		 i_256_ < anInt2725 * -38896491 >> 3;
		 i_256_++) {
		for (int i_257_ = 0;
		     i_257_ < anInt2726 * -1590385573 >> 3;
		     i_257_++)
		    anIntArrayArrayArray2754[i][i_256_]
			[i_257_]
			= -1;
	    }
	}
	for (Class241_Sub32 class241_sub32
		 = ((Class241_Sub32)
		    Class104.aClass429_1484.method7694(16711935));
	     class241_sub32 != null;
	     class241_sub32 = (Class241_Sub32) Class104.aClass429_1484
						   .method7692(1301591595)) {
	    int i = 587544409 * class241_sub32.anInt10065;
	    boolean bool = (i & 0x1) == 1;
	    int i_258_ = 634343263 * class241_sub32.anInt10057 >> 3;
	    int i_259_ = class241_sub32.anInt10059 * -1171046323 >> 3;
	    int i_260_ = class241_sub32.anInt10061 * -2086197959;
	    int i_261_ = 1735542785 * class241_sub32.anInt10058;
	    int i_262_ = 462372249 * class241_sub32.anInt10060;
	    int i_263_ = 1638174091 * class241_sub32.anInt10062;
	    int i_264_ = -2087712063 * class241_sub32.anInt10063;
	    int i_265_ = class241_sub32.anInt10064 * -1618719577;
	    int i_266_ = 0;
	    int i_267_ = 0;
	    int i_268_ = 1;
	    int i_269_ = 1;
	    if (i == 1) {
		i_267_ = i_264_ - 1;
		i_268_ = -1;
	    } else if (2 == i) {
		i_267_ = i_264_ - 1;
		i_266_ = i_265_ - 1;
		i_268_ = -1;
		i_269_ = -1;
	    } else if (3 == i) {
		i_266_ = i_265_ - 1;
		i_268_ = 1;
		i_269_ = -1;
	    }
	    int i_270_ = i_259_;
	    while (i_270_ < i_265_ + i_259_) {
		int i_271_ = i_267_;
		int i_272_ = i_258_;
		while (i_272_ < i_264_ + i_258_) {
		    if (bool)
			anIntArrayArrayArray2754[i_263_]
			    [i_260_ + i_266_][i_271_ + i_261_]
			    = ((i_262_ << 24) + (i_272_ << 14) + (i_270_ << 3)
			       + (i << 1));
		    else
			anIntArrayArrayArray2754[i_263_]
			    [i_260_ + i_271_][i_266_ + i_261_]
			    = (i << 1) + ((i_270_ << 3)
					  + ((i_272_ << 14) + (i_262_ << 24)));
		    i_272_++;
		    i_271_ += i_268_;
		}
		i_270_++;
		i_266_ += i_269_;
	    }
	}
	int i = 592347845 * client.anInt8357;
	anIntArray2755 = new int[i];
	archiveKeys = new int[i];
	mapContainerData = new byte[i][];
	landContainerData = new byte[i][];
	aByteArrayArray2751 = null;
	aByteArrayArray2750 = new byte[i][];
	aByteArrayArray2748 = new byte[i][];
	i = 0;
	for (Class241_Sub32 class241_sub32
		 = ((Class241_Sub32)
		    Class104.aClass429_1484.method7694(16711935));
	     class241_sub32 != null;
	     class241_sub32 = (Class241_Sub32) Class104.aClass429_1484
						   .method7692(1523446457)) {
	    int i_273_ = class241_sub32.anInt10057 * 634343263 >>> 3;
	    int i_274_ = class241_sub32.anInt10059 * -1171046323 >>> 3;
	    int i_275_ = class241_sub32.anInt10063 * -2087712063 + i_273_;
	    if (0 == (i_275_ & 0x7))
		i_275_--;
	    i_275_ >>>= 3;
	    int i_276_ = class241_sub32.anInt10064 * -1618719577 + i_274_;
	    if ((i_276_ & 0x7) == 0)
		i_276_--;
	    i_276_ >>>= 3;
	    for (int i_277_ = i_273_ >>> 3; i_277_ <= i_275_; i_277_++) {
	    while_55_:
		for (int i_278_ = i_274_ >>> 3; i_278_ <= i_276_; i_278_++) {
		    int i_279_ = i_277_ << 8 | i_278_;
		    for (int i_280_ = 0; i_280_ < i; i_280_++) {
			if (anIntArray2755[i_280_] == i_279_)
			    continue while_55_;
		    }
		    if (Class120_Sub22.LANDSCAPES_ARCHIVE.method4183
			(getArchiveKey(i_277_, i_278_, -1458177744),
			 Class216.VIRTUAL_MAPS.anInt2533 * -1449220255,
			 -1613939695)) {
			anIntArray2755[i] = i_279_;
			archiveKeys[i]
			    = getArchiveKey(i_277_, i_278_, -2040708755);
			i++;
		    }
		}
	    }
	}
	anInt2746 = 662674737 * i;
	method4777(-38896491 * anInt2725 >> 4,
		   -1590385573 * anInt2726 >> 4, 9, false,
		   -1948501775);
    }
    
    public int method4811() {
	return 1960870891 * anInt2731;
    }
    
    public void method4812(byte[][][] is, byte i) {
	aByteArrayArrayArray2753 = is;
    }
    
    public byte[][] method4813(int i) {
	if (null != aClass299_Sub1_2720
	    && null != (aClass299_Sub1_2720
			.aByteArrayArrayArray4531)
	    && (aClass299_Sub1_2720.aByteArrayArrayArray4531
		[i]) != null)
	    return (aClass299_Sub1_2720
		    .aByteArrayArrayArray4531[i]);
	return null;
    }
    
    public Class215 method4814() {
	return aClass215_2747;
    }
    
    public Class215 method4815() {
	return aClass215_2747;
    }
    
    public Class215 method4816() {
	return aClass215_2747;
    }
    
    public Class501 method4817() {
	return aClass501_2728;
    }
    
    public int[][] method4818() {
	return anIntArrayArray2733;
    }
    
    void method4819(Class299_Sub1 class299_sub1, byte[][] is) {
	for (int i = 0; i < 918780881 * class299_sub1.anInt4526; i++) {
	    if (!aBool2738)
		Class402.soundManager.method1235(-733063033);
	    for (int i_281_ = 0;
		 i_281_ < -38896491 * anInt2725 >> 3;
		 i_281_++) {
		for (int i_282_ = 0;
		     i_282_ < anInt2726 * -1590385573 >> 3;
		     i_282_++) {
		    int i_283_ = (anIntArrayArrayArray2754[i]
				  [i_281_][i_282_]);
		    if (-1 != i_283_) {
			int i_284_ = i_283_ >> 24 & 0x3;
			if (!class299_sub1.aBool4519 || i_284_ == 0) {
			    int i_285_ = i_283_ >> 1 & 0x3;
			    int i_286_ = i_283_ >> 14 & 0x3ff;
			    int i_287_ = i_283_ >> 3 & 0x7ff;
			    int i_288_ = (i_286_ / 8 << 8) + i_287_ / 8;
			    for (int i_289_ = 0;
				 (i_289_
				  < anIntArray2755.length);
				 i_289_++) {
				if (i_288_ == (anIntArray2755
					       [i_289_])
				    && is[i_289_] != null) {
				    class299_sub1.method16538
					(Class236.aClass103_2713, is[i_289_],
					 i, i_281_ * 8, 8 * i_282_, i_284_,
					 8 * (i_286_ & 0x7),
					 8 * (i_287_ & 0x7), i_285_,
					 -673222023);
				    break;
				}
			    }
			}
		    }
		    if (aBool2738)
			method4781(5, -1348068203);
		}
	    }
	}
    }
    
    public int[][] method4820() {
	return anIntArrayArray2733;
    }
    
    public byte[][][] method4821() {
	return aByteArrayArrayArray2753;
    }
    
    public byte[][][] method4822() {
	return aByteArrayArrayArray2753;
    }
    
    public Class299_Sub1 method4823() {
	return aClass299_Sub1_2720;
    }
    
    public Class299_Sub1 method4824() {
	return aClass299_Sub1_2720;
    }
    
    public Class299_Sub1 method4825() {
	return aClass299_Sub1_2720;
    }
    
    public void method4826(ObjectDefinitionLoader class532) {
	objectLoader = class532;
    }
    
    public void method4827(ObjectDefinitionLoader class532) {
	objectLoader = class532;
    }
    
    public void method4828(ObjectDefinitionLoader class532) {
	objectLoader = class532;
    }
    
    public void method4829() {
	aClass522_2721 = new GameScene();
	currentRegionY = 0;
	currentRegionX = 0;
    }
    
    public int method4830() {
	return anInt2730 * -595491209;
    }
    
    public void method4831() {
	if (aClass552_2727 != null) {
	    Class277.method5370(-209804591);
	    aClass552_2727.aClass576_7180
		.method12663((byte) 61);
	    aClass552_2727 = null;
	}
    }
    
    public void method4832() {
	if (aClass552_2727 != null) {
	    Class277.method5370(-209804591);
	    aClass552_2727.aClass576_7180
		.method12663((byte) 91);
	    aClass552_2727 = null;
	}
    }
    
    public Class501 method4833(int i) {
	return aClass501_2728;
    }
    
    public void method4834() {
	aClass501_2728.method11379(this, null, 0,
						     (short) 500);
    }
    
    public void method4835() {
	aClass228_2740 = Class228.aClass228_2672;
	anInt2741 = 0;
	anInt2742 = -1201920359;
	anInt2743 = 0;
	anInt2744 = -229524959;
	anInt2739 = 0;
    }
    
    public void method4836() {
	if (aClass552_2727 != null) {
	    Class277.method5370(-209804591);
	    aClass552_2727.aClass576_7180
		.method12663((byte) 79);
	    aClass552_2727 = null;
	}
    }
    
    void method4837(int i) {
	if (MapType.aClass235_2701 != currentMapType
	    && aClass235_2717 != MapType.aClass235_2701) {
	    if (MapType.aClass235_2703 == currentMapType
		|| MapType.aClass235_2705 == currentMapType
		|| ((currentMapType
		     != aClass235_2717)
		    && ((MapType.STATIC_MAP
			 == currentMapType)
			|| (MapType.STATIC_MAP
			    == aClass235_2717)))) {
		Iterator<?> iterator = client.aClass407_8457.iterator();
		while (iterator.hasNext()) {
		    ObjectNode class241_sub26
			= (ObjectNode) iterator.next();
		    Class638.method13558(((NPC)
					  class241_sub26.objectValue),
					 -825668477);
		}
		client.localNpcCount = 0;
		client.anInt8434 = 0;
		client.aClass407_8457.method7293(-222416814);
	    }
	    aClass235_2717
		= currentMapType;
	}
    }
    
    public void method4838() {
	anInt2730 = 685248376;
	if (-38896491 * anInt2725 == 0)
	    anInt2731 = -1915588726;
	else
	    anInt2731
		= -943354685 * (int) (34.46
				      * (double) (anInt2725
						  * -38896491));
	anInt2731
	    = -943354685 * (anInt2731 * 1960870891 << 2);
	if (Class236.aClass103_2713.method2573())
	    anInt2731 += -1961261568;
    }
    
    public int method4839() {
	return anInt2730 * -595491209;
    }
    
    public void method4840() {
	if (aBool2738) {
	    method4763(2015807565);
	    Class238 class238_290_ = client.aClass238_8477;
	    anInt2746
		= 1 * ((Class238) class238_290_).anInt2746;
	    anIntArray2755
		= ((Class238) class238_290_).anIntArray2755;
	    archiveKeys
		= ((Class238) class238_290_).archiveKeys;
	    mapContainerData
		= ((Class238) class238_290_).mapContainerData;
	    landContainerData
		= ((Class238) class238_290_).landContainerData;
	    aByteArrayArray2751
		= ((Class238) class238_290_).aByteArrayArray2751;
	    aByteArrayArray2750
		= ((Class238) class238_290_).aByteArrayArray2750;
	    aByteArrayArray2748
		= ((Class238) class238_290_).aByteArrayArray2748;
	    aClass215_2747
		= ((Class238) class238_290_).aClass215_2747;
	    aClass501_2728
		= ((Class238) class238_290_).aClass501_2728;
	    anIntArrayArrayArray2754
		= ((Class238) class238_290_).anIntArrayArrayArray2754;
	    anInt2730
		= ((Class238) class238_290_).anInt2730 * 1;
	    anInt2731
		= ((Class238) class238_290_).anInt2731 * 1;
	    aClass241_Sub39_Sub12_2732
		= ((Class238) class238_290_).aClass241_Sub39_Sub12_2732;
	    aClass564_2715
		= ((Class238) class238_290_).aClass564_2715;
	    anIntArrayArray2733
		= ((Class238) class238_290_).anIntArrayArray2733;
	    anIntArrayArray2749
		= ((Class238) class238_290_).anIntArrayArray2749;
	    aByteArrayArrayArray2753
		= ((Class238) class238_290_).aByteArrayArrayArray2753;
	    currentMapType
		= ((Class238) class238_290_).currentMapType;
	    aClass71_2718
		= ((Class238) class238_290_).aClass71_2718;
	    aClass522_2721
		= ((Class238) class238_290_).aClass522_2721;
	    aClass522_2722
		= ((Class238) class238_290_).aClass522_2722;
	    currentRegionX
		= ((Class238) class238_290_).currentRegionX * 1;
	    currentRegionY
		= ((Class238) class238_290_).currentRegionY * 1;
	    anInt2725
		= ((Class238) class238_290_).anInt2725 * 1;
	    anInt2726
		= ((Class238) class238_290_).anInt2726 * 1;
	} else if (17 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(13, (byte) -116);
	else if (client.anInt8288 * 1766317249 == 2)
	    Class496.setClientStage(1, (byte) -16);
	else if (16 == 1766317249 * client.anInt8288)
	    Class496.setClientStage(14, (byte) -127);
	else if (19 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(9, (byte) -2);
	else if (client.anInt8288 * 1766317249 == 8)
	    Class496.setClientStage(3, (byte) -76);
    }
    
    int method4841(int i, int i_291_) {
	return i | i_291_ << 7;
    }
    
    public void method4842() {
	if (aBool2738) {
	    method4763(1598395927);
	    Class238 class238_292_ = client.aClass238_8477;
	    anInt2746
		= 1 * ((Class238) class238_292_).anInt2746;
	    anIntArray2755
		= ((Class238) class238_292_).anIntArray2755;
	    archiveKeys
		= ((Class238) class238_292_).archiveKeys;
	    mapContainerData
		= ((Class238) class238_292_).mapContainerData;
	    landContainerData
		= ((Class238) class238_292_).landContainerData;
	    aByteArrayArray2751
		= ((Class238) class238_292_).aByteArrayArray2751;
	    aByteArrayArray2750
		= ((Class238) class238_292_).aByteArrayArray2750;
	    aByteArrayArray2748
		= ((Class238) class238_292_).aByteArrayArray2748;
	    aClass215_2747
		= ((Class238) class238_292_).aClass215_2747;
	    aClass501_2728
		= ((Class238) class238_292_).aClass501_2728;
	    anIntArrayArrayArray2754
		= ((Class238) class238_292_).anIntArrayArrayArray2754;
	    anInt2730
		= ((Class238) class238_292_).anInt2730 * 1;
	    anInt2731
		= ((Class238) class238_292_).anInt2731 * 1;
	    aClass241_Sub39_Sub12_2732
		= ((Class238) class238_292_).aClass241_Sub39_Sub12_2732;
	    aClass564_2715
		= ((Class238) class238_292_).aClass564_2715;
	    anIntArrayArray2733
		= ((Class238) class238_292_).anIntArrayArray2733;
	    anIntArrayArray2749
		= ((Class238) class238_292_).anIntArrayArray2749;
	    aByteArrayArrayArray2753
		= ((Class238) class238_292_).aByteArrayArrayArray2753;
	    currentMapType
		= ((Class238) class238_292_).currentMapType;
	    aClass71_2718
		= ((Class238) class238_292_).aClass71_2718;
	    aClass522_2721
		= ((Class238) class238_292_).aClass522_2721;
	    aClass522_2722
		= ((Class238) class238_292_).aClass522_2722;
	    currentRegionX
		= ((Class238) class238_292_).currentRegionX * 1;
	    currentRegionY
		= ((Class238) class238_292_).currentRegionY * 1;
	    anInt2725
		= ((Class238) class238_292_).anInt2725 * 1;
	    anInt2726
		= ((Class238) class238_292_).anInt2726 * 1;
	} else if (17 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(13, (byte) -49);
	else if (client.anInt8288 * 1766317249 == 2)
	    Class496.setClientStage(1, (byte) -92);
	else if (16 == 1766317249 * client.anInt8288)
	    Class496.setClientStage(14, (byte) -74);
	else if (19 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(9, (byte) -106);
	else if (client.anInt8288 * 1766317249 == 8)
	    Class496.setClientStage(3, (byte) -115);
    }
    
    void method4843() {
	method4775(Class400.method7139(Class241_Sub5_Sub9
					   .aClass241_Sub9_11043
					   .aClass445_Sub8_8856
					   .method14165(-22808634),
				       -1959242957),
		   (byte) 0);
	int i = 127679513 * aClass522_2721.baseX;
	int i_293_ = 468558693 * aClass522_2721.baseY;
	int i_294_ = (133333741 * Class462.anInt6284 >> 12) + (i >> 3);
	int i_295_ = (Class636.anInt8248 * -271636831 >> 12) + (i_293_ >> 3);
	Class21.myPlayer.nodePlane = (byte) 0;
	Class357_Sub1.anInt10357 = 0;
	Class21.myPlayer.setPosition(8, 8, 609662823);
	int i_296_ = 18;
	anIntArray2755 = new int[i_296_];
	archiveKeys = new int[i_296_];
	mapContainerData = new byte[i_296_][];
	landContainerData = new byte[i_296_][];
	aByteArrayArray2751 = new byte[i_296_][];
	aByteArrayArray2750 = new byte[i_296_][];
	aByteArrayArray2748 = new byte[i_296_][];
	i_296_ = 0;
	for (int i_297_ = (i_294_ - (-38896491 * anInt2725
				     >> 4)) / 8;
	     i_297_ <= (i_294_
			+ (anInt2725 * -38896491 >> 4)) / 8;
	     i_297_++) {
	    for (int i_298_ = (i_295_
			       - (-1590385573 * anInt2726
				  >> 4)) / 8;
		 i_298_ <= ((-1590385573 * anInt2726 >> 4)
			    + i_295_) / 8;
		 i_298_++) {
		int i_299_ = (i_297_ << 8) + i_298_;
		if (Class120_Sub22.LANDSCAPES_ARCHIVE.method4183
		    (getArchiveKey(i_297_, i_298_, -2094631704),
		     Class216.VIRTUAL_MAPS.anInt2533 * -1449220255,
		     -1969848035)) {
		    anIntArray2755[i_296_] = i_299_;
		    archiveKeys[i_296_]
			= getArchiveKey(i_297_, i_298_, -1364578758);
		    i_296_++;
		}
	    }
	}
	anInt2746 = i_296_ * 662674737;
	int i_300_;
	if (client.anInt8288 * 1766317249 == 17)
	    i_300_ = 13;
	else if (1766317249 * client.anInt8288 == 16)
	    i_300_ = 14;
	else if (2 == client.anInt8288 * 1766317249)
	    i_300_ = 1;
	else if (8 == 1766317249 * client.anInt8288)
	    i_300_ = 3;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (1766317249 * client.anInt8288)
					   .toString());
	method4777(i_294_, i_295_, i_300_, false, -1666120908);
    }
    
    void method4844(Class299_Sub1 class299_sub1, byte[][] is) {
	for (int i = 0; i < 918780881 * class299_sub1.anInt4526; i++) {
	    if (!aBool2738)
			Class402.soundManager.method1235(973924324);
	    for (int i_301_ = 0;
		 i_301_ < -38896491 * anInt2725 >> 3;
		 i_301_++) {
		for (int i_302_ = 0;
		     i_302_ < anInt2726 * -1590385573 >> 3;
		     i_302_++) {
		    int i_303_ = (anIntArrayArrayArray2754[i]
				  [i_301_][i_302_]);
		    if (-1 != i_303_) {
			int i_304_ = i_303_ >> 24 & 0x3;
			if (!class299_sub1.aBool4519 || i_304_ == 0) {
			    int i_305_ = i_303_ >> 1 & 0x3;
			    int i_306_ = i_303_ >> 14 & 0x3ff;
			    int i_307_ = i_303_ >> 3 & 0x7ff;
			    int i_308_ = (i_306_ / 8 << 8) + i_307_ / 8;
			    for (int i_309_ = 0;
				 (i_309_
				  < anIntArray2755.length);
				 i_309_++) {
				if (i_308_ == (anIntArray2755
					       [i_309_])
				    && is[i_309_] != null) {
				    class299_sub1.method16538
					(Class236.aClass103_2713, is[i_309_],
					 i, i_301_ * 8, 8 * i_302_, i_304_,
					 8 * (i_306_ & 0x7),
					 8 * (i_307_ & 0x7), i_305_,
					 -117285077);
				    break;
				}
			    }
			}
		    }
		    if (aBool2738)
			method4781(5, -1880146469);
		}
	    }
	}
    }
    
    void method4845(RSBitBuffer class241_sub3_sub1) {
	int i = class241_sub3_sub1.readUnsignedLEShortA(1175000915);
	int i_310_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	int i_311_ = class241_sub3_sub1.readUnsignedByteS((byte) 125);
	int i_312_ = class241_sub3_sub1.getByteA(-1928857317);
	boolean bool = (i_312_ & 0x1) != 0;
	int i_313_ = class241_sub3_sub1.readByteC((byte) 97);
	if (1 == i_313_)
	    currentMapType = MapType.aClass235_2703;
	else if (2 == i_313_)
	    currentMapType = MapType.aClass235_2700;
	else if (3 == i_313_)
	    currentMapType = MapType.aClass235_2705;
	else if (i_313_ == 4)
	    currentMapType = MapType.aClass235_2706;
	if (!aBool2738)
	    method4837(-2145790983);
	method4775(Class400.method7139(i_311_, -1959242957), (byte) 0);
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_314_ = 0; i_314_ < 4; i_314_++) {
	    for (int i_315_ = 0;
		 i_315_ < -38896491 * anInt2725 >> 3;
		 i_315_++) {
		for (int i_316_ = 0;
		     i_316_ < anInt2726 * -1590385573 >> 3;
		     i_316_++) {
		    int i_317_ = class241_sub3_sub1.readBits(1, 986572480);
		    if (1 == i_317_)
			anIntArrayArrayArray2754[i_314_]
			    [i_315_][i_316_]
			    = class241_sub3_sub1.readBits(26, 200478529);
		    else
			anIntArrayArrayArray2754[i_314_]
			    [i_315_][i_316_]
			    = -1;
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) 2);
	int i_318_ = class241_sub3_sub1.readUnsignedByte((byte) -5);
	anIntArray2755 = new int[i_318_];
	archiveKeys = new int[i_318_];
	mapContainerData = new byte[i_318_][];
	landContainerData = new byte[i_318_][];
	aByteArrayArray2751 = null;
	aByteArrayArray2750 = new byte[i_318_][];
	aByteArrayArray2748 = new byte[i_318_][];
	i_318_ = 0;
	for (int i_319_ = 0; i_319_ < 4; i_319_++) {
	    for (int i_320_ = 0;
		 i_320_ < -38896491 * anInt2725 >> 3;
		 i_320_++) {
		for (int i_321_ = 0;
		     i_321_ < anInt2726 * -1590385573 >> 3;
		     i_321_++) {
		    int i_322_ = (anIntArrayArrayArray2754
				  [i_319_][i_320_][i_321_]);
		    if (i_322_ != -1) {
			int i_323_ = i_322_ >> 14 & 0x3ff;
			int i_324_ = i_322_ >> 3 & 0x7ff;
			int i_325_ = (i_323_ / 8 << 8) + i_324_ / 8;
			for (int i_326_ = 0; i_326_ < i_318_; i_326_++) {
			    if (i_325_
				== anIntArray2755[i_326_]) {
				i_325_ = -1;
				break;
			    }
			}
			if (-1 != i_325_) {
			    int i_327_ = i_325_ >> 8 & 0xff;
			    int i_328_ = i_325_ & 0xff;
			    if (Class120_Sub22.LANDSCAPES_ARCHIVE.method4183
				(getArchiveKey(i_327_, i_328_, -1515928426),
				 (Class216.VIRTUAL_MAPS.anInt2533
				  * -1449220255),
				 -2123977434)) {
				anIntArray2755[i_318_]
				    = i_325_;
				archiveKeys[i_318_]
				    = getArchiveKey(i_327_, i_328_, -1857907312);
				i_318_++;
			    }
			}
		    }
		}
	    }
	}
	anInt2746 = i_318_ * 662674737;
	method4777(i_310_, i, 9, bool, -93787950);
    }
    
    public Class564 method4846() {
	return aClass564_2715;
    }
    
    void method4847(RSBitBuffer class241_sub3_sub1) {
	int i = class241_sub3_sub1.readUnsignedLEShortA(1676278393);
	int i_329_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	int i_330_ = class241_sub3_sub1.readUnsignedByteS((byte) 52);
	int i_331_ = class241_sub3_sub1.getByteA(-2020390646);
	boolean bool = (i_331_ & 0x1) != 0;
	int i_332_ = class241_sub3_sub1.readByteC((byte) 68);
	if (1 == i_332_)
	    currentMapType = MapType.aClass235_2703;
	else if (2 == i_332_)
	    currentMapType = MapType.aClass235_2700;
	else if (3 == i_332_)
	    currentMapType = MapType.aClass235_2705;
	else if (i_332_ == 4)
	    currentMapType = MapType.aClass235_2706;
	if (!aBool2738)
	    method4837(-2134647448);
	method4775(Class400.method7139(i_330_, -1959242957), (byte) 0);
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_333_ = 0; i_333_ < 4; i_333_++) {
	    for (int i_334_ = 0;
		 i_334_ < -38896491 * anInt2725 >> 3;
		 i_334_++) {
		for (int i_335_ = 0;
		     i_335_ < anInt2726 * -1590385573 >> 3;
		     i_335_++) {
		    int i_336_ = class241_sub3_sub1.readBits(1, -641512095);
		    if (1 == i_336_)
			anIntArrayArrayArray2754[i_333_]
			    [i_334_][i_335_]
			    = class241_sub3_sub1.readBits(26, 796370424);
		    else
			anIntArrayArrayArray2754[i_333_]
			    [i_334_][i_335_]
			    = -1;
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) -2);
	int i_337_ = class241_sub3_sub1.readUnsignedByte((byte) 79);
	anIntArray2755 = new int[i_337_];
	archiveKeys = new int[i_337_];
	mapContainerData = new byte[i_337_][];
	landContainerData = new byte[i_337_][];
	aByteArrayArray2751 = null;
	aByteArrayArray2750 = new byte[i_337_][];
	aByteArrayArray2748 = new byte[i_337_][];
	i_337_ = 0;
	for (int i_338_ = 0; i_338_ < 4; i_338_++) {
	    for (int i_339_ = 0;
		 i_339_ < -38896491 * anInt2725 >> 3;
		 i_339_++) {
		for (int i_340_ = 0;
		     i_340_ < anInt2726 * -1590385573 >> 3;
		     i_340_++) {
		    int i_341_ = (anIntArrayArrayArray2754
				  [i_338_][i_339_][i_340_]);
		    if (i_341_ != -1) {
			int i_342_ = i_341_ >> 14 & 0x3ff;
			int i_343_ = i_341_ >> 3 & 0x7ff;
			int i_344_ = (i_342_ / 8 << 8) + i_343_ / 8;
			for (int i_345_ = 0; i_345_ < i_337_; i_345_++) {
			    if (i_344_
				== anIntArray2755[i_345_]) {
				i_344_ = -1;
				break;
			    }
			}
			if (-1 != i_344_) {
			    int i_346_ = i_344_ >> 8 & 0xff;
			    int i_347_ = i_344_ & 0xff;
			    if (Class120_Sub22.LANDSCAPES_ARCHIVE.method4183
				(getArchiveKey(i_346_, i_347_, -1693344389),
				 (Class216.VIRTUAL_MAPS.anInt2533
				  * -1449220255),
				 -1543905717)) {
				anIntArray2755[i_337_]
				    = i_344_;
				archiveKeys[i_337_]
				    = getArchiveKey(i_346_, i_347_, -1969206872);
				i_337_++;
			    }
			}
		    }
		}
	    }
	}
	anInt2746 = i_337_ * 662674737;
	method4777(i_329_, i, 9, bool, -943098947);
    }
    
    public void method4848() {
	if (aBool2738) {
	    method4763(1985964660);
	    Class238 class238_348_ = client.aClass238_8477;
	    anInt2746
		= 1 * ((Class238) class238_348_).anInt2746;
	    anIntArray2755
		= ((Class238) class238_348_).anIntArray2755;
	    archiveKeys
		= ((Class238) class238_348_).archiveKeys;
	    mapContainerData
		= ((Class238) class238_348_).mapContainerData;
	    landContainerData
		= ((Class238) class238_348_).landContainerData;
	    aByteArrayArray2751
		= ((Class238) class238_348_).aByteArrayArray2751;
	    aByteArrayArray2750
		= ((Class238) class238_348_).aByteArrayArray2750;
	    aByteArrayArray2748
		= ((Class238) class238_348_).aByteArrayArray2748;
	    aClass215_2747
		= ((Class238) class238_348_).aClass215_2747;
	    aClass501_2728
		= ((Class238) class238_348_).aClass501_2728;
	    anIntArrayArrayArray2754
		= ((Class238) class238_348_).anIntArrayArrayArray2754;
	    anInt2730
		= ((Class238) class238_348_).anInt2730 * 1;
	    anInt2731
		= ((Class238) class238_348_).anInt2731 * 1;
	    aClass241_Sub39_Sub12_2732
		= ((Class238) class238_348_).aClass241_Sub39_Sub12_2732;
	    aClass564_2715
		= ((Class238) class238_348_).aClass564_2715;
	    anIntArrayArray2733
		= ((Class238) class238_348_).anIntArrayArray2733;
	    anIntArrayArray2749
		= ((Class238) class238_348_).anIntArrayArray2749;
	    aByteArrayArrayArray2753
		= ((Class238) class238_348_).aByteArrayArrayArray2753;
	    currentMapType
		= ((Class238) class238_348_).currentMapType;
	    aClass71_2718
		= ((Class238) class238_348_).aClass71_2718;
	    aClass522_2721
		= ((Class238) class238_348_).aClass522_2721;
	    aClass522_2722
		= ((Class238) class238_348_).aClass522_2722;
	    currentRegionX
		= ((Class238) class238_348_).currentRegionX * 1;
	    currentRegionY
		= ((Class238) class238_348_).currentRegionY * 1;
	    anInt2725
		= ((Class238) class238_348_).anInt2725 * 1;
	    anInt2726
		= ((Class238) class238_348_).anInt2726 * 1;
	} else if (17 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(13, (byte) -120);
	else if (client.anInt8288 * 1766317249 == 2)
	    Class496.setClientStage(1, (byte) -64);
	else if (16 == 1766317249 * client.anInt8288)
	    Class496.setClientStage(14, (byte) -60);
	else if (19 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(9, (byte) -111);
	else if (client.anInt8288 * 1766317249 == 8)
	    Class496.setClientStage(3, (byte) -15);
    }
    
    int method4849(int i, int i_349_) {
	return i | i_349_ << 7;
    }
    
    public int[][] method4850() {
	return anIntArrayArray2733;
    }
    
    int method4851(int i, int i_350_) {
	return i | i_350_ << 7;
    }
    
    int method4852(int i, int i_351_) {
	return i | i_351_ << 7;
    }
    
    void method4853() {
	if (MapType.aClass235_2701 != currentMapType
	    && aClass235_2717 != MapType.aClass235_2701) {
	    if (MapType.aClass235_2703 == currentMapType
		|| MapType.aClass235_2705 == currentMapType
		|| ((currentMapType
		     != aClass235_2717)
		    && ((MapType.STATIC_MAP
			 == currentMapType)
			|| (MapType.STATIC_MAP
			    == aClass235_2717)))) {
		Iterator<?> iterator = client.aClass407_8457.iterator();
		while (iterator.hasNext()) {
		    ObjectNode class241_sub26
			= (ObjectNode) iterator.next();
		    Class638.method13558(((NPC)
					  class241_sub26.objectValue),
					 -825668477);
		}
		client.localNpcCount = 0;
		client.anInt8434 = 0;
		client.aClass407_8457.method7293(-1760089456);
	    }
	    aClass235_2717
		= currentMapType;
	}
    }
    
    void method4854() {
	if (MapType.aClass235_2701 != currentMapType
	    && aClass235_2717 != MapType.aClass235_2701) {
	    if (MapType.aClass235_2703 == currentMapType
		|| MapType.aClass235_2705 == currentMapType
		|| ((currentMapType
		     != aClass235_2717)
		    && ((MapType.STATIC_MAP
			 == currentMapType)
			|| (MapType.STATIC_MAP
			    == aClass235_2717)))) {
		Iterator<?> iterator = client.aClass407_8457.iterator();
		while (iterator.hasNext()) {
		    ObjectNode class241_sub26
			= (ObjectNode) iterator.next();
		    Class638.method13558(((NPC)
					  class241_sub26.objectValue),
					 -825668477);
		}
		client.localNpcCount = 0;
		client.anInt8434 = 0;
		client.aClass407_8457.method7293(920816350);
	    }
	    aClass235_2717
		= currentMapType;
	}
    }
    
    public float method4855() {
	return aFloat2724;
    }
    
    void method4856(int i, int i_352_, int i_353_, boolean bool) {
	if (-831877317 * client.anInt8266 == 1) {
	    if (aBool2738) {
			throw new IllegalStateException();
		}
	    client.anInt8266 = -327526951;
	    client.anInt8352 = -504628557;
	}
	if (bool || i != currentRegionX * -1821522969
	    || i_352_ != currentRegionY * -1657296635) {
	    currentRegionX = 675061719 * i;
	    currentRegionY = -1345602611 * i_352_;
	    if (!aBool2738) {
		Class496.setClientStage(i_353_, (byte) -70);
		Class434_Sub5.method14141
		    (ClientMessage.LOADING
			 .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 23576),
		     true, Class236.aClass103_2713, Class5.aClass96_26,
		     Class5.aClass639_25, 372363679);
	    }
	    if (aClass522_2721 != null)
		aClass522_2722
		    = aClass522_2721;
	    else
		aClass522_2722 = new GameScene(0, 0, 0);
	    aClass522_2721 = new GameScene(0,
			       (-1821522969 * currentRegionX
				- (anInt2725 * -38896491
				   >> 4)) * 8,
			       (-1657296635 * currentRegionY
				- (anInt2726 * -1590385573
				   >> 4)) * 8);
	    aClass241_Sub39_Sub12_2732
		= (Class573.method12651
		   ((-38896491 * anInt2725 / 2
		     + aClass522_2721.baseX * 127679513),
		    (-38896491 * anInt2725 / 2
		     + (aClass522_2721.baseY
			* 468558693))));
	    aClass564_2715 = null;
	    if (!aBool2738)
		method4801(i_353_, (byte) 47);
	}
    }
    
    void method4857(Class299_Sub1 class299_sub1, byte[][] is, int i) {
		for (int i_354_ = 0; i_354_ < 918780881 * class299_sub1.anInt4526; i_354_++) {
		    if (!aBool2738) {
		    	Class402.soundManager.method1235(1917712884);
		    }
		    for (int i_355_ = 0; i_355_ < -38896491 * anInt2725 >> 3; i_355_++) {
				for (int i_356_ = 0; i_356_ < anInt2726 * -1590385573 >> 3; i_356_++) {
				    int i_357_ = anIntArrayArrayArray2754[i_354_][i_355_][i_356_];
				    if (-1 != i_357_) {
						int i_358_ = i_357_ >> 24 & 0x3;
						if (!class299_sub1.aBool4519 || i_358_ == 0) {
						    int i_359_ = i_357_ >> 1 & 0x3;
						    int i_360_ = i_357_ >> 14 & 0x3ff;
						    int i_361_ = i_357_ >> 3 & 0x7ff;
						    int i_362_ = (i_360_ / 8 << 8) + i_361_ / 8;
						    for (int i_363_ = 0; i_363_ < anIntArray2755.length; i_363_++) {
								if (i_362_ == anIntArray2755[i_363_] && is[i_363_] != null) {
								    class299_sub1.method16538
									(Class236.aClass103_2713, is[i_363_],
									 i_354_, i_355_ * 8, 8 * i_356_,
									 i_358_, 8 * (i_360_ & 0x7),
									 8 * (i_361_ & 0x7), i_359_,
									 -1371218448);
								    break;
								}
						    }
						}
				    }
				    if (aBool2738)
					method4781(5, -1672313514);
				}
		    }
		}
    }
    
    void method4858(int i) {
	int i_364_
	    = (aClass522_2721.baseX * 127679513
	       - 127679513 * aClass522_2722.baseX);
	int i_365_
	    = (aClass522_2721.baseY * 468558693
	       - aClass522_2722.baseY * 468558693);
	if (9 == i) {
	    for (int i_366_ = 0; i_366_ < client.anInt8434 * 743597371;
		 i_366_++) {
		ObjectNode class241_sub26
		    = client.aClass241_Sub26Array8276[i_366_];
		if (null != class241_sub26) {
		    NPC class475_sub1_sub1_sub3_sub2
			= ((NPC)
			   class241_sub26.objectValue);
		    for (int i_367_ = 0;
			 i_367_ < (class475_sub1_sub1_sub3_sub2
				   .scenePositionXQueue).length;
			 i_367_++) {
			class475_sub1_sub1_sub3_sub2.scenePositionXQueue[i_367_]
			    -= i_364_;
			class475_sub1_sub1_sub3_sub2.scenePositionYQueue[i_367_]
			    -= i_365_;
		    }
		    Class287 class287
			= Class287.method5562(class475_sub1_sub1_sub3_sub2
						  .method10874
					      ().aClass287_4386);
		    class287.aFloat4477 -= (float) (512 * i_364_);
		    class287.aFloat4479 -= (float) (512 * i_365_);
		    class475_sub1_sub1_sub3_sub2.method10898(class287);
		    class287.method5564();
		}
	    }
	} else {
	    boolean bool = false;
	    client.localNpcCount = 0;
	    int i_368_ = 1559833088 * anInt2725 - 512;
	    int i_369_ = 1766372864 * anInt2726 - 512;
	    for (int i_370_ = 0; i_370_ < 743597371 * client.anInt8434;
		 i_370_++) {
		ObjectNode class241_sub26
		    = client.aClass241_Sub26Array8276[i_370_];
		if (null != class241_sub26) {
		    NPC class475_sub1_sub1_sub3_sub2
			= ((NPC)
			   class241_sub26.objectValue);
		    Class287 class287
			= Class287.method5562(class475_sub1_sub1_sub3_sub2
						  .method10874
					      ().aClass287_4386);
		    class287.aFloat4477 -= (float) (i_364_ * 512);
		    class287.aFloat4479 -= (float) (512 * i_365_);
		    class475_sub1_sub1_sub3_sub2.method10898(class287);
		    if ((int) class287.aFloat4477 < 0
			|| (int) class287.aFloat4477 > i_368_
			|| (int) class287.aFloat4479 < 0
			|| (int) class287.aFloat4479 > i_369_) {
			class475_sub1_sub1_sub3_sub2.setDefinition(null,
								 -1704034135);
			class241_sub26.remove((byte) 36);
			bool = true;
		    } else {
			boolean bool_371_ = true;
			for (int i_372_ = 0;
			     i_372_ < (class475_sub1_sub1_sub3_sub2
				       .scenePositionXQueue).length;
			     i_372_++) {
			    class475_sub1_sub1_sub3_sub2.scenePositionXQueue
				[i_372_]
				-= i_364_;
			    class475_sub1_sub1_sub3_sub2.scenePositionYQueue
				[i_372_]
				-= i_365_;
			    if ((class475_sub1_sub1_sub3_sub2.scenePositionXQueue
				 [i_372_]) < 0
				|| ((class475_sub1_sub1_sub3_sub2
				     .scenePositionXQueue[i_372_])
				    >= -38896491 * anInt2725)
				|| (class475_sub1_sub1_sub3_sub2
				    .scenePositionYQueue[i_372_]) < 0
				|| ((class475_sub1_sub1_sub3_sub2
				     .scenePositionYQueue[i_372_])
				    >= (anInt2726
					* -1590385573)))
				bool_371_ = false;
			}
			if (bool_371_)
			    client.localNpcIndicies[((client.localNpcCount
						    += 1541490607)
						   * -1837469873) - 1]
				= (-546698383
				   * class475_sub1_sub1_sub3_sub2.entityIndex);
			else {
			    class475_sub1_sub1_sub3_sub2
				.setDefinition(null, 1832755154);
			    class241_sub26.remove((byte) 36);
			    bool = true;
			}
		    }
		    class287.method5564();
		}
	    }
	    if (bool) {
		client.anInt8434
		    = (client.aClass407_8457.method7306(1051006864)
		       * 1674259443);
		int i_373_ = 0;
		Iterator<?> iterator = client.aClass407_8457.iterator();
		while (iterator.hasNext()) {
		    ObjectNode class241_sub26
			= (ObjectNode) iterator.next();
		    client.aClass241_Sub26Array8276[i_373_++] = class241_sub26;
		}
	    }
	}
	for (int i_374_ = 0; i_374_ < 2048; i_374_++) {
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[i_374_];
	    if (null != class475_sub1_sub1_sub3_sub1) {
		for (int i_375_ = 0;
		     (i_375_
		      < class475_sub1_sub1_sub3_sub1.scenePositionXQueue.length);
		     i_375_++) {
		    class475_sub1_sub1_sub3_sub1.scenePositionXQueue[i_375_]
			-= i_364_;
		    class475_sub1_sub1_sub3_sub1.scenePositionYQueue[i_375_]
			-= i_365_;
		}
		Class287 class287
		    = Class287.method5562(class475_sub1_sub1_sub3_sub1
					      .method10874().aClass287_4386);
		class287.aFloat4477 -= (float) (512 * i_364_);
		class287.aFloat4479 -= (float) (i_365_ * 512);
		class475_sub1_sub1_sub3_sub1.method10898(class287);
		class287.method5564();
	    }
	}
	Class192[] class192s = client.aClass192Array8301;
	for (int i_376_ = 0; i_376_ < class192s.length; i_376_++) {
	    Class192 class192 = class192s[i_376_];
	    if (class192 != null) {
		class192.anInt2289 -= i_364_ * 1000515072;
		class192.anInt2290 -= -266192384 * i_365_;
	    }
	}
	for (WorldObject class241_sub30
		 = ((WorldObject)
		    WorldObject.aClass429_10039.method7694(16711935));
	     class241_sub30 != null;
	     class241_sub30 = (WorldObject) WorldObject
						   .aClass429_10039
						   .method7692(-22347575)) {
	    class241_sub30.posX -= -620199377 * i_364_;
	    class241_sub30.posY -= i_365_ * -1643505007;
	    ObjectDefinition class526
		= objectLoader.getObjectDefinition(((class241_sub30
								 .id)
								* 289493935),
							       577892407);
	    int i_377_;
	    int i_378_;
	    if ((class241_sub30.rotation * 1543441831 & 0x1) == 0) {
		i_377_ = class526.sizeX * 1351092869;
		i_378_ = 333584223 * class526.sizeY;
	    } else {
		i_377_ = 333584223 * class526.sizeY;
		i_378_ = class526.sizeX * 1351092869;
	    }
	    if (MapType.aClass235_2706 != currentMapType
		&& (class241_sub30.posX * 1204421839 + i_377_ <= 0
		    || i_378_ + -320018831 * class241_sub30.posY <= 0
		    || (1204421839 * class241_sub30.posX
			>= -38896491 * anInt2725)
		    || (-320018831 * class241_sub30.posY
			>= anInt2726 * -1590385573)))
		class241_sub30.remove((byte) 36);
	}
	for (WorldObject class241_sub30
		 = ((WorldObject)
		    WorldObject.aClass429_10053.method7694(16711935));
	     class241_sub30 != null;
	     class241_sub30 = (WorldObject) WorldObject
						   .aClass429_10053
						   .method7692(107288074)) {
	    class241_sub30.posX -= -620199377 * i_364_;
	    class241_sub30.posY -= i_365_ * -1643505007;
	    ObjectDefinition class526
		= objectLoader.getObjectDefinition(((class241_sub30
								 .id)
								* 289493935),
							       577892407);
	    int i_379_;
	    int i_380_;
	    if (0 == (1543441831 * class241_sub30.rotation & 0x1)) {
		i_379_ = class526.sizeX * 1351092869;
		i_380_ = class526.sizeY * 333584223;
	    } else {
		i_379_ = 333584223 * class526.sizeY;
		i_380_ = class526.sizeX * 1351092869;
	    }
	    if (currentMapType != MapType.aClass235_2706
		&& (i_379_ + class241_sub30.posX * 1204421839 <= 0
		    || -320018831 * class241_sub30.posY + i_380_ <= 0
		    || (class241_sub30.posX * 1204421839
			>= -38896491 * anInt2725)
		    || (class241_sub30.posY * -320018831
			>= -1590385573 * anInt2726)))
		class241_sub30.remove((byte) 36);
	}
	for (WorldTile class241_sub44
		 = ((WorldTile)
		    client.aClass407_8452.method7294(2090894173));
	     class241_sub44 != null;
	     class241_sub44 = ((WorldTile)
			       client.aClass407_8452.method7295(1832217265))) {
	    int i_381_
		= (int) (4356572401218184725L * class241_sub44.hashCode >> 28
			 & 0x3L);
	    int i_382_ = (int) (4356572401218184725L * class241_sub44.hashCode
				& 0x3fffL);
	    int i_383_
		= (i_382_
		   - 127679513 * aClass522_2721.baseX);
	    int i_384_
		= (int) (4356572401218184725L * class241_sub44.hashCode >> 14
			 & 0x3fffL);
	    int i_385_
		= (i_384_
		   - 468558693 * aClass522_2721.baseY);
	    if (null != aClass552_2727) {
		if (i_383_ < 0 || i_385_ < 0
		    || i_383_ >= -38896491 * anInt2725
		    || i_385_ >= -1590385573 * anInt2726
		    || i_383_ >= (aClass552_2727.anInt7138
				  * 120442351)
		    || i_385_ >= (aClass552_2727.anInt7142
				  * -2069974325)) {
		    if (MapType.aClass235_2706
			!= currentMapType)
			class241_sub44.remove((byte) 36);
		} else if (null != (aClass552_2727
				    .aClass548ArrayArrayArray7169))
		    aClass552_2727
			.method12128(i_381_, i_383_, i_385_, -754933939);
	    }
	}
	if (0 != Class194.minimapFlagX * 1813149433) {
	    Class194.minimapFlagX -= i_364_ * -980260023;
	    Class194.minimapFlagY -= -1262506991 * i_365_;
	}
	Class19.method881(false, 1708269995);
	if (9 == i) {
	    client.anInt8557 -= -1699409408 * i_364_;
	    client.anInt8361 -= 52046336 * i_365_;
	    Class291.anInt4488 -= i_364_ * -399596032;
	    Class354_Sub2.anInt10492 -= 731258368 * i_365_;
	    if (5 != 115241065 * Class296.anInt4513
		&& 115241065 * Class296.anInt4513 != 4)
		Class592.method12924(Class520.method11690(-1470082832),
				     -1776607542);
	} else {
	    Class563.anInt7304 -= i_364_ * 1851273669;
	    Class473.anInt6379 -= i_365_ * -587410343;
	    Class421.anInt6040 -= i_364_ * 1596135215;
	    Class380_Sub2.anInt10409 -= i_365_ * 1825904949;
	    Class462.anInt6284 -= i_364_ * 1549126144;
	    Class636.anInt8248 -= 477807104 * i_365_;
	    if (Math.abs(i_364_) > anInt2725 * -38896491
		|| (Math.abs(i_365_)
		    > -1590385573 * anInt2726))
		aClass501_2728.method11400(87337337);
	}
	Class122.method2983(-1923263150);
	Class55.method1371(1685082220);
	client.aClass407_8454.method7293(-1633895133);
	client.aClass429_8478.method7652((byte) 39);
	client.aClass421_8376.method7521((byte) -54);
	Class445_Sub25.method14350(168183218);
    }
    
    public int[][] method4859(int i) {
	return anIntArrayArray2733;
    }
    
    public Class564 method4860(int i) {
	return aClass564_2715;
    }
    
    public void method4861() {
	aClass228_2740 = Class228.aClass228_2672;
	anInt2741 = 0;
	anInt2742 = -1201920359;
	anInt2743 = 0;
	anInt2744 = -229524959;
	anInt2739 = 0;
    }
    
    void method4862(int i) {
	try {
	    Thread.sleep((long) i);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public void method4863() {
	aClass228_2740 = Class228.aClass228_2672;
	anInt2741 = 0;
	anInt2742 = -1201920359;
	anInt2743 = 0;
	anInt2744 = -229524959;
	anInt2739 = 0;
    }
    
    void method4864(Class299_Sub1 class299_sub1, byte[][] is) {
	for (int i = 0; i < 918780881 * class299_sub1.anInt4526; i++) {
	    if (!aBool2738)
		Class402.soundManager.method1235(943887572);
	    for (int i_386_ = 0;
		 i_386_ < anInt2725 * -38896491 >> 3;
		 i_386_++) {
		for (int i_387_ = 0;
		     i_387_ < anInt2726 * -1590385573 >> 3;
		     i_387_++) {
		    int i_388_ = (anIntArrayArrayArray2754[i]
				  [i_386_][i_387_]);
		    if (-1 != i_388_) {
			int i_389_ = i_388_ >> 24 & 0x3;
			if (!class299_sub1.aBool4519 || i_389_ == 0) {
			    int i_390_ = i_388_ >> 1 & 0x3;
			    int i_391_ = i_388_ >> 14 & 0x3ff;
			    int i_392_ = i_388_ >> 3 & 0x7ff;
			    int i_393_ = (i_391_ / 8 << 8) + i_392_ / 8;
			    for (int i_394_ = 0;
				 (i_394_
				  < anIntArray2755.length);
				 i_394_++) {
				if ((anIntArray2755[i_394_]
				     == i_393_)
				    && is[i_394_] != null) {
				    RSByteBuffer class241_sub3
					= new RSByteBuffer(is[i_394_]);
				    class299_sub1.method5743(class241_sub3, i,
							     8 * i_386_,
							     i_387_ * 8,
							     i_389_, i_391_,
							     i_392_, i_390_,
							     (byte) 71);
				    class299_sub1.method16536
					(Class236.aClass103_2713,
					 class241_sub3, i, i_386_ * 8,
					 i_387_ * 8, i_389_, i_391_, i_392_,
					 i_390_, -1777795549);
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i = 0; i < class299_sub1.anInt4526 * 918780881; i++) {
	    if (!aBool2738)
		Class402.soundManager.method1235(535262741);
	    for (int i_395_ = 0;
		 i_395_ < -38896491 * anInt2725 >> 3;
		 i_395_++) {
		for (int i_396_ = 0;
		     i_396_ < anInt2726 * -1590385573 >> 3;
		     i_396_++) {
		    int i_397_ = (anIntArrayArrayArray2754[i]
				  [i_395_][i_396_]);
		    if (-1 == i_397_)
			class299_sub1.method5757(i, i_395_ * 8, i_396_ * 8, 8,
						 8, -1071084864);
		}
	    }
	}
    }
    
    void method4865(Class299_Sub1 class299_sub1, byte[][] is) {
	for (int i = 0; i < 233085905 * anInt2746; i++) {
	    byte[] is_398_ = is[i];
	    if (null != is_398_) {
		int i_399_ = ((anIntArray2755[i] >> 8) * 64
			      - (aClass522_2721.baseX
				 * 127679513));
		int i_400_ = ((anIntArray2755[i] & 0xff) * 64
			      - (aClass522_2721.baseY
				 * 468558693));
		if (!aBool2738)
		    Class402.soundManager.method1235(1128377286);
		class299_sub1.unpackNodeData(Class236.aClass103_2713, is_398_,
					  i_399_, i_400_, 997310675);
		if (aBool2738)
		    method4781(10, -1149867796);
	    }
	}
    }
    
    void method4866(Class299_Sub1 class299_sub1, byte[][] is) {
	for (int i = 0; i < 918780881 * class299_sub1.anInt4526; i++) {
	    if (!aBool2738)
		Class402.soundManager.method1235(-816210159);
	    for (int i_401_ = 0;
		 i_401_ < -38896491 * anInt2725 >> 3;
		 i_401_++) {
		for (int i_402_ = 0;
		     i_402_ < anInt2726 * -1590385573 >> 3;
		     i_402_++) {
		    int i_403_ = (anIntArrayArrayArray2754[i]
				  [i_401_][i_402_]);
		    if (-1 != i_403_) {
			int i_404_ = i_403_ >> 24 & 0x3;
			if (!class299_sub1.aBool4519 || i_404_ == 0) {
			    int i_405_ = i_403_ >> 1 & 0x3;
			    int i_406_ = i_403_ >> 14 & 0x3ff;
			    int i_407_ = i_403_ >> 3 & 0x7ff;
			    int i_408_ = (i_406_ / 8 << 8) + i_407_ / 8;
			    for (int i_409_ = 0;
				 (i_409_
				  < anIntArray2755.length);
				 i_409_++) {
				if (i_408_ == (anIntArray2755
					       [i_409_])
				    && is[i_409_] != null) {
				    class299_sub1.method16538
					(Class236.aClass103_2713, is[i_409_],
					 i, i_401_ * 8, 8 * i_402_, i_404_,
					 8 * (i_406_ & 0x7),
					 8 * (i_407_ & 0x7), i_405_,
					 562423986);
				    break;
				}
			    }
			}
		    }
		    if (aBool2738)
			method4781(5, -1155894882);
		}
	    }
	}
    }
    
    public int method4867() {
	return 1960870891 * anInt2731;
    }
    
    void method4868(int i) {
	int i_410_ = aByteArrayArray2751.length;
	for (int i_411_ = 0; i_411_ < i_410_; i_411_++) {
	    if (aByteArrayArray2751[i_411_] != null) {
		int i_412_ = -1;
		for (int i_413_ = 0; i_413_ < 138843337 * client.anInt8350;
		     i_413_++) {
		    if (client.anIntArray8546[i_413_]
			== anIntArray2755[i_411_]) {
			i_412_ = i_413_;
			break;
		    }
		}
		if (-1 == i_412_) {
		    client.anIntArray8546[client.anInt8350 * 138843337]
			= anIntArray2755[i_411_];
		    i_412_ = (client.anInt8350 += 545113465) * 138843337 - 1;
		}
		RSByteBuffer class241_sub3
		    = new RSByteBuffer(aByteArrayArray2751
					[i_411_]);
		int i_414_ = 0;
		while ((class241_sub3.pointer * 421967667
			< aByteArrayArray2751[i_411_].length)
		       && i_414_ < 511
		       && -1837469873 * client.localNpcCount < 1023) {
		    int i_415_ = i_412_ | i_414_++ << 6;
		    int i_416_ = class241_sub3.readUnsignedShort(1162222719);
		    int i_417_ = i_416_ >> 14;
		    int i_418_ = i_416_ >> 7 & 0x3f;
		    int i_419_ = i_416_ & 0x3f;
		    int i_420_
			= (64 * (anIntArray2755[i_411_] >> 8)
			   - (127679513
			      * aClass522_2721.baseX)
			   + i_418_);
		    int i_421_ = ((anIntArray2755[i_411_]
				   & 0xff) * 64
				  - 468558693 * (((Class238) this)
						 .aClass522_2721.baseY)
				  + i_419_);
		    NPCDefinition class401
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   (class241_sub3.readUnsignedShort(1162222719),
			    -1992184570));
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i_415_));
		    if (class241_sub26 == null
			&& (class401.walkMask & 0x1) > 0 && i_420_ >= 0
			&& (class401.size * 19489015 + i_420_
			    < -38896491 * anInt2725)
			&& i_421_ >= 0
			&& (class401.size * 19489015 + i_421_
			    < -1590385573 * anInt2726)) {
			NPC class475_sub1_sub1_sub3_sub2
			    = (new NPC
			       (aClass552_2727));
			class475_sub1_sub1_sub3_sub2.entityIndex
			    = 1641239953 * i_415_;
			ObjectNode class241_sub26_422_
			    = new ObjectNode(class475_sub1_sub1_sub3_sub2);
			client.aClass407_8457.put(class241_sub26_422_,
							 (long) i_415_);
			client.aClass241_Sub26Array8276
			    [(client.anInt8434 += 1674259443) * 743597371 - 1]
			    = class241_sub26_422_;
			client.localNpcIndicies[((client.localNpcCount += 1541490607)
					       * -1837469873) - 1]
			    = i_415_;
			class475_sub1_sub1_sub3_sub2.anInt11410
			    = 216794573 * client.anInt8296;
			class475_sub1_sub1_sub3_sub2.setDefinition(class401,
								 -764508991);
			class475_sub1_sub1_sub3_sub2.method17781
			    (19489015 * (class475_sub1_sub1_sub3_sub2
					 .definition.size),
			     (byte) -71);
			class475_sub1_sub1_sub3_sub2.anInt11400
			    = (607575013 * (class475_sub1_sub1_sub3_sub2
					    .definition.headsIcon)
			       << 3) * -687691613;
			class475_sub1_sub1_sub3_sub2.setDirection
			    (class475_sub1_sub1_sub3_sub2.definition
				 .respawnDirection.method7822
				 (1609262383).getId((byte) 0) << 11 & 0x3fff,
			     true, (byte) 75);
			class475_sub1_sub1_sub3_sub2.method17994
			    (i_417_, i_420_, i_421_, true,
			     class475_sub1_sub1_sub3_sub2
				 .method17782(1410980110),
			     -16777216);
		    }
		}
	    }
	}
    }
    
    public float method4869(int i) {
	return aFloat2724;
    }
    
    void method4870(Class299_Sub1 class299_sub1, byte[][] is) {
	for (int i = 0; i < 918780881 * class299_sub1.anInt4526; i++) {
	    if (!aBool2738)
		Class402.soundManager.method1235(1037583580);
	    for (int i_423_ = 0;
		 i_423_ < -38896491 * anInt2725 >> 3;
		 i_423_++) {
		for (int i_424_ = 0;
		     i_424_ < anInt2726 * -1590385573 >> 3;
		     i_424_++) {
		    int i_425_ = (anIntArrayArrayArray2754[i]
				  [i_423_][i_424_]);
		    if (-1 != i_425_) {
			int i_426_ = i_425_ >> 24 & 0x3;
			if (!class299_sub1.aBool4519 || i_426_ == 0) {
			    int i_427_ = i_425_ >> 1 & 0x3;
			    int i_428_ = i_425_ >> 14 & 0x3ff;
			    int i_429_ = i_425_ >> 3 & 0x7ff;
			    int i_430_ = (i_428_ / 8 << 8) + i_429_ / 8;
			    for (int i_431_ = 0;
				 (i_431_
				  < anIntArray2755.length);
				 i_431_++) {
				if (i_430_ == (anIntArray2755
					       [i_431_])
				    && is[i_431_] != null) {
				    class299_sub1.method16538
					(Class236.aClass103_2713, is[i_431_],
					 i, i_423_ * 8, 8 * i_424_, i_426_,
					 8 * (i_428_ & 0x7),
					 8 * (i_429_ & 0x7), i_427_,
					 -1204319874);
				    break;
				}
			    }
			}
		    }
		    if (aBool2738)
			method4781(5, -1455293856);
		}
	    }
	}
    }
    
    void method4871(Class299_Sub1 class299_sub1, byte[][] is) {
	for (int i = 0; i < 918780881 * class299_sub1.anInt4526; i++) {
	    if (!aBool2738)
		Class402.soundManager.method1235(1883639814);
	    for (int i_432_ = 0;
		 i_432_ < -38896491 * anInt2725 >> 3;
		 i_432_++) {
		for (int i_433_ = 0;
		     i_433_ < anInt2726 * -1590385573 >> 3;
		     i_433_++) {
		    int i_434_ = (anIntArrayArrayArray2754[i]
				  [i_432_][i_433_]);
		    if (-1 != i_434_) {
			int i_435_ = i_434_ >> 24 & 0x3;
			if (!class299_sub1.aBool4519 || i_435_ == 0) {
			    int i_436_ = i_434_ >> 1 & 0x3;
			    int i_437_ = i_434_ >> 14 & 0x3ff;
			    int i_438_ = i_434_ >> 3 & 0x7ff;
			    int i_439_ = (i_437_ / 8 << 8) + i_438_ / 8;
			    for (int i_440_ = 0;
				 (i_440_
				  < anIntArray2755.length);
				 i_440_++) {
				if (i_439_ == (anIntArray2755
					       [i_440_])
				    && is[i_440_] != null) {
				    class299_sub1.method16538
					(Class236.aClass103_2713, is[i_440_],
					 i, i_432_ * 8, 8 * i_433_, i_435_,
					 8 * (i_437_ & 0x7),
					 8 * (i_438_ & 0x7), i_436_,
					 792409712);
				    break;
				}
			    }
			}
		    }
		    if (aBool2738)
			method4781(5, -1451332648);
		}
	    }
	}
    }
    
    void method4872() {
	method4775(Class400.method7139(Class241_Sub5_Sub9
					   .aClass241_Sub9_11043
					   .aClass445_Sub8_8856
					   .method14165(1646292400),
				       -1959242957),
		   (byte) 0);
	int i = 127679513 * aClass522_2721.baseX;
	int i_441_ = 468558693 * aClass522_2721.baseY;
	int i_442_ = (133333741 * Class462.anInt6284 >> 12) + (i >> 3);
	int i_443_ = (Class636.anInt8248 * -271636831 >> 12) + (i_441_ >> 3);
	Class21.myPlayer.nodePlane = (byte) 0;
	Class357_Sub1.anInt10357 = 0;
	Class21.myPlayer.setPosition(8, 8, 353995080);
	int i_444_ = 18;
	anIntArray2755 = new int[i_444_];
	archiveKeys = new int[i_444_];
	mapContainerData = new byte[i_444_][];
	landContainerData = new byte[i_444_][];
	aByteArrayArray2751 = new byte[i_444_][];
	aByteArrayArray2750 = new byte[i_444_][];
	aByteArrayArray2748 = new byte[i_444_][];
	i_444_ = 0;
	for (int i_445_ = (i_442_ - (-38896491 * anInt2725
				     >> 4)) / 8;
	     i_445_ <= (i_442_
			+ (anInt2725 * -38896491 >> 4)) / 8;
	     i_445_++) {
	    for (int i_446_ = (i_443_
			       - (-1590385573 * anInt2726
				  >> 4)) / 8;
		 i_446_ <= ((-1590385573 * anInt2726 >> 4)
			    + i_443_) / 8;
		 i_446_++) {
		int i_447_ = (i_445_ << 8) + i_446_;
		if (Class120_Sub22.LANDSCAPES_ARCHIVE.method4183
		    (getArchiveKey(i_445_, i_446_, -1635827786),
		     Class216.VIRTUAL_MAPS.anInt2533 * -1449220255,
		     -1293986478)) {
		    anIntArray2755[i_444_] = i_447_;
		    archiveKeys[i_444_]
			= getArchiveKey(i_445_, i_446_, -1871311897);
		    i_444_++;
		}
	    }
	}
	anInt2746 = i_444_ * 662674737;
	int i_448_;
	if (client.anInt8288 * 1766317249 == 17)
	    i_448_ = 13;
	else if (1766317249 * client.anInt8288 == 16)
	    i_448_ = 14;
	else if (2 == client.anInt8288 * 1766317249)
	    i_448_ = 1;
	else if (8 == 1766317249 * client.anInt8288)
	    i_448_ = 3;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (1766317249 * client.anInt8288)
					   .toString());
	method4777(i_442_, i_443_, i_448_, false, 19792687);
    }
    
    void method4873() {
	int i = aByteArrayArray2751.length;
	for (int i_449_ = 0; i_449_ < i; i_449_++) {
	    if (aByteArrayArray2751[i_449_] != null) {
		int i_450_ = -1;
		for (int i_451_ = 0; i_451_ < 138843337 * client.anInt8350;
		     i_451_++) {
		    if (client.anIntArray8546[i_451_]
			== anIntArray2755[i_449_]) {
			i_450_ = i_451_;
			break;
		    }
		}
		if (-1 == i_450_) {
		    client.anIntArray8546[client.anInt8350 * 138843337]
			= anIntArray2755[i_449_];
		    i_450_ = (client.anInt8350 += 545113465) * 138843337 - 1;
		}
		RSByteBuffer class241_sub3
		    = new RSByteBuffer(aByteArrayArray2751
					[i_449_]);
		int i_452_ = 0;
		while ((class241_sub3.pointer * 421967667
			< aByteArrayArray2751[i_449_].length)
		       && i_452_ < 511
		       && -1837469873 * client.localNpcCount < 1023) {
		    int i_453_ = i_450_ | i_452_++ << 6;
		    int i_454_ = class241_sub3.readUnsignedShort(1162222719);
		    int i_455_ = i_454_ >> 14;
		    int i_456_ = i_454_ >> 7 & 0x3f;
		    int i_457_ = i_454_ & 0x3f;
		    int i_458_
			= (64 * (anIntArray2755[i_449_] >> 8)
			   - (127679513
			      * aClass522_2721.baseX)
			   + i_456_);
		    int i_459_ = ((anIntArray2755[i_449_]
				   & 0xff) * 64
				  - 468558693 * (((Class238) this)
						 .aClass522_2721.baseY)
				  + i_457_);
		    NPCDefinition class401
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   (class241_sub3.readUnsignedShort(1162222719),
			    -641195672));
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i_453_));
		    if (class241_sub26 == null
			&& (class401.walkMask & 0x1) > 0 && i_458_ >= 0
			&& (class401.size * 19489015 + i_458_
			    < -38896491 * anInt2725)
			&& i_459_ >= 0
			&& (class401.size * 19489015 + i_459_
			    < -1590385573 * anInt2726)) {
			NPC class475_sub1_sub1_sub3_sub2
			    = (new NPC
			       (aClass552_2727));
			class475_sub1_sub1_sub3_sub2.entityIndex
			    = 1641239953 * i_453_;
			ObjectNode class241_sub26_460_
			    = new ObjectNode(class475_sub1_sub1_sub3_sub2);
			client.aClass407_8457.put(class241_sub26_460_,
							 (long) i_453_);
			client.aClass241_Sub26Array8276
			    [(client.anInt8434 += 1674259443) * 743597371 - 1]
			    = class241_sub26_460_;
			client.localNpcIndicies[((client.localNpcCount += 1541490607)
					       * -1837469873) - 1]
			    = i_453_;
			class475_sub1_sub1_sub3_sub2.anInt11410
			    = 216794573 * client.anInt8296;
			class475_sub1_sub1_sub3_sub2.setDefinition(class401,
								 917700514);
			class475_sub1_sub1_sub3_sub2.method17781
			    (19489015 * (class475_sub1_sub1_sub3_sub2
					 .definition.size),
			     (byte) -100);
			class475_sub1_sub1_sub3_sub2.anInt11400
			    = (607575013 * (class475_sub1_sub1_sub3_sub2
					    .definition.headsIcon)
			       << 3) * -687691613;
			class475_sub1_sub1_sub3_sub2.setDirection
			    (class475_sub1_sub1_sub3_sub2.definition
				 .respawnDirection.method7822
				 (1609262383).getId((byte) 0) << 11 & 0x3fff,
			     true, (byte) 58);
			class475_sub1_sub1_sub3_sub2.method17994
			    (i_455_, i_458_, i_459_, true,
			     class475_sub1_sub1_sub3_sub2
				 .method17782(1908371815),
			     -16777216);
		    }
		}
	    }
	}
    }
    
    void method4874() {
	int i = aByteArrayArray2751.length;
	for (int i_461_ = 0; i_461_ < i; i_461_++) {
	    if (aByteArrayArray2751[i_461_] != null) {
		int i_462_ = -1;
		for (int i_463_ = 0; i_463_ < 138843337 * client.anInt8350;
		     i_463_++) {
		    if (client.anIntArray8546[i_463_]
			== anIntArray2755[i_461_]) {
			i_462_ = i_463_;
			break;
		    }
		}
		if (-1 == i_462_) {
		    client.anIntArray8546[client.anInt8350 * 138843337]
			= anIntArray2755[i_461_];
		    i_462_ = (client.anInt8350 += 545113465) * 138843337 - 1;
		}
		RSByteBuffer class241_sub3
		    = new RSByteBuffer(aByteArrayArray2751
					[i_461_]);
		int i_464_ = 0;
		while ((class241_sub3.pointer * 421967667
			< aByteArrayArray2751[i_461_].length)
		       && i_464_ < 511
		       && -1837469873 * client.localNpcCount < 1023) {
		    int i_465_ = i_462_ | i_464_++ << 6;
		    int i_466_ = class241_sub3.readUnsignedShort(1162222719);
		    int i_467_ = i_466_ >> 14;
		    int i_468_ = i_466_ >> 7 & 0x3f;
		    int i_469_ = i_466_ & 0x3f;
		    int i_470_
			= (64 * (anIntArray2755[i_461_] >> 8)
			   - (127679513
			      * aClass522_2721.baseX)
			   + i_468_);
		    int i_471_ = ((anIntArray2755[i_461_]
				   & 0xff) * 64
				  - 468558693 * (((Class238) this)
						 .aClass522_2721.baseY)
				  + i_469_);
		    NPCDefinition class401
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   (class241_sub3.readUnsignedShort(1162222719),
			    -1190917232));
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i_465_));
		    if (class241_sub26 == null
			&& (class401.walkMask & 0x1) > 0 && i_470_ >= 0
			&& (class401.size * 19489015 + i_470_
			    < -38896491 * anInt2725)
			&& i_471_ >= 0
			&& (class401.size * 19489015 + i_471_
			    < -1590385573 * anInt2726)) {
			NPC class475_sub1_sub1_sub3_sub2
			    = (new NPC
			       (aClass552_2727));
			class475_sub1_sub1_sub3_sub2.entityIndex
			    = 1641239953 * i_465_;
			ObjectNode class241_sub26_472_
			    = new ObjectNode(class475_sub1_sub1_sub3_sub2);
			client.aClass407_8457.put(class241_sub26_472_,
							 (long) i_465_);
			client.aClass241_Sub26Array8276
			    [(client.anInt8434 += 1674259443) * 743597371 - 1]
			    = class241_sub26_472_;
			client.localNpcIndicies[((client.localNpcCount += 1541490607)
					       * -1837469873) - 1]
			    = i_465_;
			class475_sub1_sub1_sub3_sub2.anInt11410
			    = 216794573 * client.anInt8296;
			class475_sub1_sub1_sub3_sub2.setDefinition(class401,
								 -1806116527);
			class475_sub1_sub1_sub3_sub2.method17781
			    (19489015 * (class475_sub1_sub1_sub3_sub2
					 .definition.size),
			     (byte) -12);
			class475_sub1_sub1_sub3_sub2.anInt11400
			    = (607575013 * (class475_sub1_sub1_sub3_sub2
					    .definition.headsIcon)
			       << 3) * -687691613;
			class475_sub1_sub1_sub3_sub2.setDirection
			    (class475_sub1_sub1_sub3_sub2.definition
				 .respawnDirection.method7822
				 (1609262383).getId((byte) 0) << 11 & 0x3fff,
			     true, (byte) 34);
			class475_sub1_sub1_sub3_sub2.method17994
			    (i_467_, i_470_, i_471_, true,
			     class475_sub1_sub1_sub3_sub2
				 .method17782(804977172),
			     -16777216);
		    }
		}
	    }
	}
    }
    
    void method4875() {
	int i = aByteArrayArray2751.length;
	for (int i_473_ = 0; i_473_ < i; i_473_++) {
	    if (aByteArrayArray2751[i_473_] != null) {
		int i_474_ = -1;
		for (int i_475_ = 0; i_475_ < 138843337 * client.anInt8350;
		     i_475_++) {
		    if (client.anIntArray8546[i_475_]
			== anIntArray2755[i_473_]) {
			i_474_ = i_475_;
			break;
		    }
		}
		if (-1 == i_474_) {
		    client.anIntArray8546[client.anInt8350 * 138843337]
			= anIntArray2755[i_473_];
		    i_474_ = (client.anInt8350 += 545113465) * 138843337 - 1;
		}
		RSByteBuffer class241_sub3
		    = new RSByteBuffer(aByteArrayArray2751
					[i_473_]);
		int i_476_ = 0;
		while ((class241_sub3.pointer * 421967667
			< aByteArrayArray2751[i_473_].length)
		       && i_476_ < 511
		       && -1837469873 * client.localNpcCount < 1023) {
		    int i_477_ = i_474_ | i_476_++ << 6;
		    int i_478_ = class241_sub3.readUnsignedShort(1162222719);
		    int i_479_ = i_478_ >> 14;
		    int i_480_ = i_478_ >> 7 & 0x3f;
		    int i_481_ = i_478_ & 0x3f;
		    int i_482_
			= (64 * (anIntArray2755[i_473_] >> 8)
			   - (127679513
			      * aClass522_2721.baseX)
			   + i_480_);
		    int i_483_ = ((anIntArray2755[i_473_]
				   & 0xff) * 64
				  - 468558693 * (((Class238) this)
						 .aClass522_2721.baseY)
				  + i_481_);
		    NPCDefinition class401
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   (class241_sub3.readUnsignedShort(1162222719),
			    -1403460558));
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i_477_));
		    if (class241_sub26 == null
			&& (class401.walkMask & 0x1) > 0 && i_482_ >= 0
			&& (class401.size * 19489015 + i_482_
			    < -38896491 * anInt2725)
			&& i_483_ >= 0
			&& (class401.size * 19489015 + i_483_
			    < -1590385573 * anInt2726)) {
			NPC class475_sub1_sub1_sub3_sub2
			    = (new NPC
			       (aClass552_2727));
			class475_sub1_sub1_sub3_sub2.entityIndex
			    = 1641239953 * i_477_;
			ObjectNode class241_sub26_484_
			    = new ObjectNode(class475_sub1_sub1_sub3_sub2);
			client.aClass407_8457.put(class241_sub26_484_,
							 (long) i_477_);
			client.aClass241_Sub26Array8276
			    [(client.anInt8434 += 1674259443) * 743597371 - 1]
			    = class241_sub26_484_;
			client.localNpcIndicies[((client.localNpcCount += 1541490607)
					       * -1837469873) - 1]
			    = i_477_;
			class475_sub1_sub1_sub3_sub2.anInt11410
			    = 216794573 * client.anInt8296;
			class475_sub1_sub1_sub3_sub2.setDefinition(class401,
								 1848825461);
			class475_sub1_sub1_sub3_sub2.method17781
			    (19489015 * (class475_sub1_sub1_sub3_sub2
					 .definition.size),
			     (byte) -36);
			class475_sub1_sub1_sub3_sub2.anInt11400
			    = (607575013 * (class475_sub1_sub1_sub3_sub2
					    .definition.headsIcon)
			       << 3) * -687691613;
			class475_sub1_sub1_sub3_sub2.setDirection
			    (class475_sub1_sub1_sub3_sub2.definition
				 .respawnDirection.method7822
				 (1609262383).getId((byte) 0) << 11 & 0x3fff,
			     true, (byte) 98);
			class475_sub1_sub1_sub3_sub2.method17994
			    (i_479_, i_482_, i_483_, true,
			     class475_sub1_sub1_sub3_sub2
				 .method17782(2110852617),
			     -16777216);
		    }
		}
	    }
	}
    }
    
    public static void method4876(boolean bool, boolean bool_485_, int i) {
	if (bool) {
	    Class474.anInt6384 -= -2094050269;
	    if (Class474.anInt6384 * -463078517 == 0)
		Class474.anIntArray6382 = null;
	}
	if (bool_485_) {
	    Class474.anInt6381 -= -1311077067;
	    if (Class474.anInt6381 * -501015267 == 0)
		Class474.anIntArray6383 = null;
	}
    }
    
    static final void method4877(ClientScriptData class454, int i) {
	int i_486_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_486_, (byte) -35);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_486_ >> 16];
	Class92.method2071(class58, class35, class454, 474237697);
    }
    
    static final void method4878(InterfaceComponent class58, ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
	int i_487_ = ((((ClientScriptData) class454).integerStack
		       [1482319719 * ((ClientScriptData) class454).intStackPointer])
		      - 1);
	if (i_487_ < 0 || i_487_ > 9)
	    throw new RuntimeException();
	Class475_Sub1_Sub5_Sub1.method17723(class58, i_487_, class454,
					    -316500858);
    }
    
    static final void method4879(ClientScriptData class454, int i) {
	int i_488_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_488_, (byte) -61);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_488_ >> 16];
	Class105_Sub1_Sub3_Sub1.method17884(class58, class35, class454,
					    (short) 10001);
    }
    
    public static int method4880(byte[] is, int i, int i_489_) {
    	return Class393_Sub2.method16581(is, 0, i, (byte) -105);
    }
    
    public static void method4881(String string, String string_490_, int i) {
	if (string.length() <= 320 && Class393.method7054(-1676741262)) {
	    client.aClass190_8339.closeConnection(-995734335);
	    Class47.method1132(1164367137);
	    Class13.aString112 = string;
	    Class13.aString113 = string_490_;
	    Class496.setClientStage(11, (byte) -10);
	}
    }
}
