/* Class529 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class529 implements Interface47
{
    public static Class529 aClass529_6942 = new Class529(0);
    public static Class529 aClass529_6943 = new Class529(1);
    public static Class529 aClass529_6944 = new Class529(2);
    int anInt6945;
    
    public int method147() {
	return ((Class529) this).anInt6945 * -2143504245;
    }
    
    public int getId(byte i) {
	return ((Class529) this).anInt6945 * -2143504245;
    }
    
    public int method9() {
	return ((Class529) this).anInt6945 * -2143504245;
    }
    
    Class529(int i) {
	((Class529) this).anInt6945 = i * 1247538979;
    }
    
    public static Class529[] method11829() {
	return (new Class529[]
		{ aClass529_6944, aClass529_6942, aClass529_6943 });
    }
    
    public int method10() {
	return ((Class529) this).anInt6945 * -2143504245;
    }
    
    public int method11() {
	return ((Class529) this).anInt6945 * -2143504245;
    }
    
    public static Class529[] method11830() {
	return (new Class529[]
		{ aClass529_6944, aClass529_6942, aClass529_6943 });
    }
    
    public static Class529[] method11831() {
	return (new Class529[]
		{ aClass529_6944, aClass529_6942, aClass529_6943 });
    }
    
    static final void method11832(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).anInt6231 -= 1421070234;
	if ((((ClientScriptData) class454).longStack
	     [-735224571 * ((ClientScriptData) class454).anInt6231])
	    < (((ClientScriptData) class454).longStack
	       [1 + ((ClientScriptData) class454).anInt6231 * -735224571]))
	    ((ClientScriptData) class454).step
		+= (1924545709
		    * (((ClientScriptData) class454).integerConstants
		       [1938982693 * ((ClientScriptData) class454).step]));
    }
    
    static final void method11833(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class281.method5488(class58, class35, true, 0, class454, 1032219588);
    }
    
    static final void method11834(Class475_Sub1 class475_sub1, int i,
				  boolean bool, byte i_0_) {
	Class241_Sub10.method14937(class475_sub1, i, false, bool, -985749834);
    }
    
    static final void decodeWorldUpdatePacket/*method11835*/(SubIncommingOpcode opcode, int i) {
		RSBitBuffer stream = ((ServerConnection) client.aClass190_8340).inputBuffer;
		if (opcode == SubIncommingOpcode.SPAWN_OBJECT) {
		    int offsetHash = stream.readUnsignedByteS((byte) 48);
		    int posX = Class65.baseTileX * -585685807 + (offsetHash >> 4 & 0x7);
		    int posY = 902154613 * Class74.baseTileY + (offsetHash & 0x7);
		    int objectID = stream.readIntV1((short) 22682);
		    int settings = stream.readByteC((byte) 77);
		    int type = settings >> 2;
		    int rotation = settings & 0x3;
		    int i_8_ = client.anIntArray8351[type];
		    
		    if (client.aClass238_8477.method4756(-1935211007).method4698(1630145764)
		    		|| (posX >= 0 && posY >= 0
		    		&& posX < client.aClass238_8477.method4744(-1908689304)
		    		&& posY < client.aClass238_8477.method4745(-1492382093))) {
		    	//System.out.println("Spawning object "+objectID+" of type "+type+" at position x="+posX+", y="+posY);
		    	Class507.method11508(1061320561 * Class323.basePlane, posX,
		    			posY, i_8_, objectID, type, rotation, -1398881654);
		    }
		} else if (SubIncommingOpcode.aClass341_5307 == opcode) {
		    int i_9_ = stream.readUnsignedByte((byte) 88);
		    int i_10_ = Class65.baseTileX * -585685807 + (i_9_ >> 4 & 0x7);
		    int i_11_ = Class74.baseTileY * 902154613 + (i_9_ & 0x7);
		    int i_12_ = stream.readUnsignedShort(1162222719);
		    if (65535 == i_12_) {
		    	i_12_ = -1;
		    }
		    int i_13_ = stream.readUnsignedByte((byte) -115);
		    int i_14_ = i_13_ >> 4 & 0xf;
		    int i_15_ = i_13_ & 0x7;
		    int i_16_ = stream.readUnsignedByte((byte) 81);
		    int i_17_ = stream.readUnsignedByte((byte) -55);
		    int i_18_ = stream.readUnsignedShort(1162222719);
		    if (client.aClass238_8477.method4756(-2054789421)
			!= MapType.aClass235_2701) {
			if (i_10_ >= 0 && i_11_ >= 0
			    && i_10_ < client.aClass238_8477.method4744(-1961718667)
			    && i_11_ < client.aClass238_8477.method4745(-1589808376)) {
			    int i_19_ = 1 + i_14_;
			    if ((Class21.myPlayer
				 .scenePositionXQueue[0]) >= i_10_ - i_19_
				&& (Class21.myPlayer.scenePositionXQueue[0]) <= i_19_ + i_10_
				&& (Class21.myPlayer
				    .scenePositionYQueue[0]) >= i_11_ - i_19_
				&& (Class21.myPlayer
				    .scenePositionYQueue[0]) <= i_19_ + i_11_) {
				Class287 class287
				    = new Class287((float) (i_10_ << 9), 0.0F,
						   (float) (i_11_ << 9));
				int i_20_ = Class323.basePlane * 1061320561;
				Class402.soundManager.method1162
				    (Class112.aClass112_1523, i_12_, i_15_, i_17_,
				     Class130.aClass130_1597.method3067(-960497231),
				     Class127.aClass127_1584, 0.0F,
				     (float) (i_14_ << 9), class287, i_20_, i_18_,
				     i_16_, 167576383);
			    }
			}
		    }
		} else if (SubIncommingOpcode.aClass341_5308 == opcode) {
		    int i_21_ = stream.readUnsignedByte((byte) 31);
		    int i_22_ = (i_21_ >> 4 & 0xf) + -1171371614 * Class65.baseTileX;
		    int i_23_ = Class74.baseTileY * 1804309226 + (i_21_ & 0xf);
		    int i_24_ = stream.readUnsignedByte((byte) 96);
		    boolean bool = (i_24_ & 0x1) != 0;
		    boolean bool_25_ = (i_24_ & 0x2) != 0;
		    int i_26_ = bool_25_ ? i_24_ >> 2 : -1;
		    int i_27_ = i_22_ + stream.getByte(-1218986875);
		    int i_28_ = i_23_ + stream.getByte(-995243264);
		    int i_29_ = stream.readShort((byte) 55);
		    int i_30_ = stream.readShort((byte) 55);
		    int i_31_ = stream.readUnsignedShort(1162222719);
		    int i_32_ = stream.readUnsignedByte((byte) -30);
		    if (bool_25_) {
		    	i_32_ = (byte) i_32_;
		    } else {
		    	i_32_ *= 4;
		    }
		    int i_33_ = stream.readUnsignedByte((byte) -30) * 4;
		    int i_34_ = stream.readUnsignedShort(1162222719);
		    int i_35_ = stream.readUnsignedShort(1162222719);
		    int i_36_ = stream.readUnsignedByte((byte) 45);
		    int i_37_ = stream.readUnsignedShort(1162222719);
		    if (i_36_ == 255)
			i_36_ = -1;
		    int i_38_ = stream.readShort((byte) 65);
		    if (client.aClass238_8477.method4756(-2010214940)
			!= MapType.aClass235_2701) {
			if (i_22_ >= 0 && i_23_ >= 0
			    && (i_22_
				< client.aClass238_8477.method4744(-2003716734) * 2)
			    && (i_23_
				< client.aClass238_8477.method4744(-2072460446) * 2)
			    && i_27_ >= 0 && i_28_ >= 0
			    && i_27_ < client.aClass238_8477.method4745(1263837118) * 2
			    && i_28_ < client.aClass238_8477.method4745(-515668930) * 2
			    && 65535 != i_31_) {
			    i_22_ *= 256;
			    i_23_ = 256 * i_23_;
			    i_27_ = 256 * i_27_;
			    i_28_ = 256 * i_28_;
			    i_32_ <<= 2;
			    i_33_ <<= 2;
			    i_37_ <<= 2;
			    Class329.method6029(i_31_, i_29_, i_30_, i_26_, i_32_,
						i_33_, i_22_, i_23_, i_27_, i_28_,
						i_34_, i_35_, i_36_, i_37_, bool,
						i_38_, (short) 16383);
			}
		    }
		} else if (opcode == SubIncommingOpcode.aClass341_5310) {
		    int i_39_ = stream.readUnsignedLEShort((short) 21851);
		    int i_40_ = stream.readUnsignedShortA((byte) 105);
		    int i_41_ = stream.readUnsignedByteS((byte) 115);
		    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		    int i_42_ = (i_41_ & 0x7) + Class74.baseTileY * 902154613;
		    int i_43_ = i_42_ + 468558693 * class522.baseY;
		    int i_44_ = (i_41_ >> 4 & 0x7) + Class65.baseTileX * -585685807;
		    int i_45_ = i_44_ + class522.baseX * 127679513;
		    int i_46_ = stream.readUnsignedLEShortA(899491853);
		    if (1124115145 * client.myPlayerIndex != i_40_) {
			boolean bool
			    = (i_44_ >= 0 && i_42_ >= 0
			       && i_44_ < client.aClass238_8477.method4744(-2031933018)
			       && (i_42_
				   < client.aClass238_8477.method4745(1728956226)));
			if (bool || client.aClass238_8477.method4756(-2041064013)
					.method4698(2005929918)) {
			    ObjectDefinition.method11810(Class323.basePlane * 1061320561,
						 i_45_, i_43_,
						 new GroundItem(i_39_, i_46_),
						 650839625);
			    if (bool)
				Class39.method1041(1061320561 * Class323.basePlane,
						   i_44_, i_42_, 1381365630);
			}
		    }
		} else if (SubIncommingOpcode.aClass341_5306 == opcode) {
		    int i_47_ = stream.readUnsignedByte((byte) -91);
		    int i_48_ = -585685807 * Class65.baseTileX + (i_47_ >> 4 & 0x7);
		    int i_49_ = Class74.baseTileY * 902154613 + (i_47_ & 0x7);
		    int i_50_ = stream.readUnsignedShort(1162222719);
		    if (65535 == i_50_)
			i_50_ = -1;
		    int i_51_ = stream.readUnsignedShort(1162222719);
		    int i_52_ = stream.readUnsignedShort(1162222719);
		    int i_53_ = stream.readUnsignedByte((byte) -40);
		    int i_54_ = stream.readShort((byte) 71);
		    if (client.aClass238_8477.method4756(-2007484551)
			!= MapType.aClass235_2701) {
			if (i_48_ >= 0 && i_49_ >= 0
			    && i_48_ < client.aClass238_8477.method4744(-1713954870)
			    && i_49_ < client.aClass238_8477.method4745(-1838692936)) {
			    if (-1 == i_50_) {
				Class241_Sub39_Sub7 class241_sub39_sub7
				    = ((Class241_Sub39_Sub7)
				       client.aClass407_8454
					   .get((long) (i_48_ << 16 | i_49_)));
				if (class241_sub39_sub7 != null) {
				    ((Class241_Sub39_Sub7) class241_sub39_sub7)
					.aClass475_Sub1_Sub1_Sub5_10856
					.method17935((byte) -15);
				    class241_sub39_sub7.remove((byte) 36);
				}
			    } else {
				int i_55_ = 256 + 512 * i_48_;
				int i_56_ = 512 * i_49_ + 256;
				int i_57_ = 1061320561 * Class323.basePlane;
				if (i_57_ < 3
				    && client.aClass238_8477.method4753
					   ((byte) -113)
					   .method4331(i_48_, i_49_, -854225479))
				    i_57_++;
				Class475_Sub1_Sub1_Sub5 class475_sub1_sub1_sub5
				    = (new Class475_Sub1_Sub1_Sub5
				       (client.aClass238_8477.method4751(-1878345077),
					i_50_, i_52_, 1061320561 * Class323.basePlane,
					i_57_, i_55_,
					Class96_Sub5.method16046(i_55_, i_56_,
								 (Class323.basePlane
								  * 1061320561),
								 427692533) - i_51_,
					i_56_, i_48_, i_48_, i_49_, i_49_, i_53_,
					false, i_54_));
				client.aClass407_8454.put
				    (new Class241_Sub39_Sub7(class475_sub1_sub1_sub5),
				     (long) (i_48_ << 16 | i_49_));
			    }
			}
		    }
		} else if (SubIncommingOpcode.aClass341_5300 == opcode) {
		    int offsetHash = stream.readUnsignedByteS((byte) 15);
		    int posX = Class65.baseTileX * -585685807 + (offsetHash >> 4 & 0x7);
		    int posY = (offsetHash & 0x7) + Class74.baseTileY * 902154613;
		    int i_61_ = stream.getByteA(-2067666340);
		    int settingsHash = stream.getByteA(-2033501750);
		    int type = settingsHash >> 2;
		    int rotation = settingsHash & 0x3;
		    int i_65_ = client.anIntArray8351[type];
		    int objectID = stream.readLEInt(714919659);
		    if (client.aClass238_8477.method4756(-2028857252) != MapType.aClass235_2701) {
		    	Class462.method10658(1061320561 * Class323.basePlane, posX,
		    			posY, i_65_, type, rotation, objectID, i_61_, 1124154155);
		    }
		} else if (SubIncommingOpcode.aClass341_5303 == opcode) {
		    int objectID = stream.readIntV2(1274614902);
		    int offsetHash = stream.readUnsignedByte((byte) 54);
		    int posX = Class65.baseTileX * -585685807 + (offsetHash >> 4 & 0x7);
		    int posY = (offsetHash & 0x7) + 902154613 * Class74.baseTileY;
		    int flags = stream.readUnsignedByte((byte) -4);
		    int settingsHash = stream.getByteA(-2106242752);
		    int type = settingsHash >> 2;
		    int i_74_ = client.anIntArray8351[type];
		    if (Class527.aClass527_6909.anInt6931 * -2030829961 == type) {
		    	type = Class527.aClass527_6928.anInt6931 * -2030829961;
		    }
		    if ((flags & 0x1) == 1) {
		    	SkillData.method11328(1061320561 * Class323.basePlane, posX,
		    			posY, i_74_, objectID, type, null, 1789603315);
		    } else {
				int[] is = null;
				if (2 == (flags & 0x2)) {
				    int i_75_ = stream.readUnsignedByte((byte) -46);
				    is = new int[i_75_];
				    for (int i_76_ = 0; i_76_ < i_75_; i_76_++)
					is[i_76_] = stream.readInt((byte) 75);
				}
				short[] is_77_ = null;
				if (4 == (flags & 0x4)) {
				    int i_78_ = stream.readUnsignedByte((byte) -78);
				    is_77_ = new short[i_78_];
				    for (int i_79_ = 0; i_79_ < i_78_; i_79_++)
					is_77_[i_79_] = (short) stream
								    .readUnsignedShort(1162222719);
				}
				short[] is_80_ = null;
				if (8 == (flags & 0x8)) {
				    int i_81_ = stream.readUnsignedByte((byte) 61);
				    is_80_ = new short[i_81_];
				    for (int i_82_ = 0; i_82_ < i_81_; i_82_++)
					is_80_[i_82_] = (short) stream
								    .readUnsignedShort(1162222719);
				}
				SkillData.method11328(Class323.basePlane * 1061320561, posX,
						posY, i_74_, objectID, type,
						     new Class536((WorldObject.aLong10054 * 3178866609636973503L),
								  is, is_77_, is_80_), 2135925770);
				WorldObject.aLong10054 += 432003252590924863L;
		    }
		} else if (opcode == SubIncommingOpcode.aClass341_5299) {
		    int i_83_ = stream.readUnsignedByte((byte) -72);
		    int i_84_ = Class65.baseTileX * -585685807 + (i_83_ >> 4 & 0x7);
		    int i_85_ = (i_83_ & 0x7) + 902154613 * Class74.baseTileY;
		    int i_86_ = stream.readUnsignedShort(1162222719);
		    if (65535 == i_86_) {
		    	i_86_ = -1;
		    }
		    int i_87_ = stream.readUnsignedByte((byte) -96);
		    int i_88_ = i_87_ >> 4 & 0xf;
		    int i_89_ = i_87_ & 0x7;
		    int i_90_ = stream.readUnsignedByte((byte) -27);
		    int i_91_ = stream.readUnsignedByte((byte) -14);
		    int i_92_ = stream.readUnsignedShort(1162222719);
		    boolean bool = stream.readUnsignedByte((byte) -108) == 1;
		    if (client.aClass238_8477.method4756(-1931391389) != MapType.aClass235_2701) {
				if (i_84_ >= 0 && i_85_ >= 0
						&& i_84_ < client.aClass238_8477.method4744(-1732738704)
						&& i_85_ < client.aClass238_8477.method4745(-1823163757)) {
				    int i_93_ = i_88_ + 1;
				    if ((Class21.myPlayer.scenePositionXQueue[0]) >= i_84_ - i_93_
					&& (Class21.myPlayer
					    .scenePositionXQueue[0]) <= i_93_ + i_84_
					&& (Class21.myPlayer
					    .scenePositionYQueue[0]) >= i_85_ - i_93_
					&& (Class21.myPlayer
					    .scenePositionYQueue[0]) <= i_93_ + i_85_) {
					Class287 class287
					    = new Class287((float) (i_84_ << 9), 0.0F,
							   (float) (i_85_ << 9));
					int i_94_ = Class323.basePlane * 1061320561;
					int i_95_
					    = (bool
					       ? Class130.aClass130_1603.method3067(-960497231)
					       : Class130.aClass130_1597
						     .method3067(-960497231));
					Class402.soundManager.method1162
					    (Class112.aClass112_1523, i_86_, i_89_, i_91_,
					     i_95_, Class127.aClass127_1584, 0.0F,
					     (float) (i_88_ << 9), class287, i_94_, i_92_,
					     i_90_, -1500946707);
				    }
				}
		    }
		} else if (SubIncommingOpcode.PROJECTILE == opcode) {
		    int startOffset = stream.readUnsignedByte((byte) 38);
		    boolean bool = 0 != (startOffset & 0x80);
		    int startX = -585685807 * Class65.baseTileX + (startOffset >> 3 & 0x7);
		    int startY = Class74.baseTileY * 902154613 + (startOffset & 0x7);
		    int endX = startX + stream.getByte(-1412528428);
		    int endY = startY + stream.getByte(-30879190);
		    int targetEntityID = stream.readShort((byte) 119);
		    int gfxId = stream.readUnsignedShort(1162222719);
		    int startHeight = stream.readUnsignedByte((byte) -5) * 4;
		    int endHeight = stream.readUnsignedByte((byte) -49) * 4;
		    int delay = stream.readUnsignedShort(1162222719);
		    int duration = stream.readUnsignedShort(1162222719);
		    int curve = stream.readUnsignedByte((byte) 14);
		    int i_108_ = stream.readUnsignedShort(1162222719);
		    int i_109_ = stream.readShort((byte) 47);
		    if (255 == curve) {
		    	curve = -1;
		    }
		    if (client.aClass238_8477.method4756(-1982611143) != MapType.aClass235_2701) {
				if (startX >= 0 && startY >= 0
						&& startX < client.aClass238_8477.method4744(-1855411338)
						&& startY < client.aClass238_8477.method4745(-662505008)
						&& endX >= 0 && endY >= 0
						&& endX < client.aClass238_8477.method4744(-1820000496)
						&& endY < client.aClass238_8477.method4745(-1965114764)
						&& 65535 != gfxId) {
					startX = 256 + startX * 512;
					startY = startY * 512 + 256;
					endX = endX * 512 + 256;
					endY = 256 + endY * 512;
					startHeight <<= 2;
					endHeight <<= 2;
				    i_108_ <<= 2;
				    Projectile projectile = new Projectile(
				    		client.aClass238_8477.method4751(-785370930),
				    		gfxId, 1061320561 * Class323.basePlane,
				    		1061320561 * Class323.basePlane, startX, startY,
				    		startHeight, delay + client.anInt8296,
				    		duration + client.anInt8296, curve, i_108_, 0,
				    		targetEntityID, endHeight, bool, -1, i_109_);
				    projectile.method17887(endX, endY,
				    		Class96_Sub5.method16046(endX, endY,
				    				(Class323.basePlane* 1061320561),
				    				638525531) - endHeight,
				    		client.anInt8296 + delay, 1212496695);
				    client.aClass429_8478.addNode(
				    		new Class241_Sub39_Sub16(projectile),
				    		(short) -16934);
				}
		    }
		} else if (opcode == SubIncommingOpcode.REMOVE_GROUND_ITEM) {
		    int itemID = stream.readUnsignedLEShortA(1547504211);
		    int offsetHash = stream.readUnsignedByteS((byte) 13);
		    GameScene lastRegion = client.aClass238_8477.method4806((byte) 1);
		    int yOffset = (offsetHash & 0x7) + Class74.baseTileY * 902154613;
		    int posY = 468558693 * lastRegion.baseY + yOffset;
		    int xOffset = (offsetHash >> 4 & 0x7) + -585685807 * Class65.baseTileX;
		    int posX = xOffset + lastRegion.baseX * 127679513;
		    WorldTile tile = ((WorldTile) client.aClass407_8452.get(
		    		(long) (1061320561 * Class323.basePlane << 28 | posY << 14 | posX)));
		    //System.out.println("Removing item "+itemID+" at position x="+posX+", y="+posY);
		    if (tile != null) {
				for (GroundItem item = (GroundItem) tile.aClass429_10181.method7694(16711935);
						null != item;
						item = (GroundItem) tile.aClass429_10181.method7692(2080787545)) {
				    if ((itemID & 0x7fff) == 2088213913 * item.itemID) {
				    	item.remove((byte) 36);
						break;
				    }
				}
				if (tile.aClass429_10181.isEmpty(-89156775)) {
					tile.remove((byte) 36);
				}
				if (xOffset >= 0 && yOffset >= 0
						&& xOffset < client.aClass238_8477.method4744(-1742720987)
						&& yOffset < client.aClass238_8477.method4745(899310585)) {
				    Class39.method1041(Class323.basePlane * 1061320561, xOffset, yOffset, 76747028);
				}
		    }
		} else if (opcode == SubIncommingOpcode.TILE_MESSAGE) {
		    stream.readUnsignedByte((byte) 20);
		    int offsetHash = stream.readUnsignedByte((byte) -53);
		    int posX = -585685807 * Class65.baseTileX + (offsetHash >> 4 & 0x7);
		    int posY = Class74.baseTileY * 902154613 + (offsetHash & 0x7);
		    int delay = stream.readUnsignedShort(1162222719);
		    int height = stream.readUnsignedByte((byte) 53);
		    int colour = stream.readTriByte(1771646547);
		    String message = stream.readString(-494722720);
		    if (client.aClass238_8477.method4756(-2045523534) != MapType.aClass235_2701) {
		    	Class403.method7212(Class323.basePlane * 1061320561, posX,
		    			posY, height, delay, colour, message, 2033600830);
		    }
		} else if (opcode == SubIncommingOpcode.ADD_GROUND_ITEM) {
		    int itemID = stream.readUnsignedLEShort((short) 30754);
		    int amount = stream.readUnsignedShortA((byte) 93);
		    int offsetHash = stream.readUnsignedByte((byte) -19);
		    GameScene position = client.aClass238_8477.method4806((byte) 1);
		    int yOffset = (offsetHash & 0x7) + 902154613 * Class74.baseTileY;
		    int posY = 468558693 * position.baseY + yOffset;
		    int xOffset = -585685807 * Class65.baseTileX + (offsetHash >> 4 & 0x7);
		    int posX = position.baseX * 127679513 + xOffset;
		    //System.out.println("Adding item "+itemID+" at position x="+posX+", y="+posY);
		    //System.out.println("xInTile="+(posHash >> 4 & 0x7)+", yInTile="+(posHash & 0x7));
		    //System.out.println("Ground item "+itemID+" at x="+posX+", y="+posY);
		    //System.out.println("Position x="+(position.baseX * 127679513)+", y="+(468558693 * position.baseY));
		    boolean bool = (xOffset >= 0 && yOffset >= 0
			   && xOffset < client.aClass238_8477.method4744(-2049074378)
			   && yOffset < client.aClass238_8477.method4745(1661793517));
		    if (bool || client.aClass238_8477.method4756(-2077835492).method4698(1841227271)) {
		    	ObjectDefinition.method11810(Class323.basePlane * 1061320561, posX,
		    			posY, new GroundItem(itemID, amount), 786296811);
		    	if (bool) {
		    		Class39.method1041(1061320561 * Class323.basePlane, xOffset, yOffset, -905253997);
		    	}
		    }
		} else if (SubIncommingOpcode.aClass341_5302 == opcode) {
		    int i_129_ = stream.readUnsignedByte((byte) -64);
		    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		    int i_130_ = (i_129_ & 0x7) + Class74.baseTileY * 902154613;
		    int i_131_ = class522.baseY * 468558693 + i_130_;
		    int i_132_ = (i_129_ >> 4 & 0x7) + -585685807 * Class65.baseTileX;
		    int i_133_ = 127679513 * class522.baseX + i_132_;
		    int i_134_ = stream.readUnsignedShort(1162222719);
		    int i_135_ = stream.readUnsignedShort(1162222719);
		    int i_136_ = stream.readUnsignedShort(1162222719);
		    if (null != client.aClass407_8452) {
			WorldTile class241_sub44
			    = ((WorldTile)
			       (client.aClass407_8452.get
				((long) (1061320561 * Class323.basePlane << 28
					 | i_131_ << 14 | i_133_))));
			if (null != class241_sub44) {
			    for (GroundItem class241_sub31
				     = (GroundItem) class241_sub44
							    .aClass429_10181
							    .method7694(16711935);
				 null != class241_sub31;
				 class241_sub31
				     = (GroundItem) class241_sub44
							    .aClass429_10181
							    .method7692(1469510996)) {
				if ((class241_sub31.itemID * 2088213913
				     == (i_134_ & 0x7fff))
				    && i_135_ == (((GroundItem) class241_sub31)
						  .itemAmount) * 7683145) {
				    class241_sub31.remove((byte) 36);
				    ((GroundItem) class241_sub31).itemAmount
					= i_136_ * -2146208263;
				    ObjectDefinition.method11810((Class323.basePlane
							  * 1061320561),
							 i_133_, i_131_,
							 class241_sub31, -269192534);
				    break;
				}
			    }
			    if (i_132_ >= 0 && i_130_ >= 0
				&& (i_132_
				    < client.aClass238_8477.method4744(-1765486616))
				&& (i_130_
				    < client.aClass238_8477.method4745(-1076092592)))
				Class39.method1041(Class323.basePlane * 1061320561,
						   i_132_, i_130_, -177933743);
			}
		    }
		} else if (opcode == SubIncommingOpcode.aClass341_5301) {
		    int objectID = stream.readInt((byte) 25);
		    int i_138_ = stream.readUnsignedByte((byte) 94);
		    client.aClass238_8477.getObjectLoader(-1842038270)
		    	.getObjectDefinition(objectID, 577892407).method11793(i_138_, (byte) 59);
		} else if (opcode == SubIncommingOpcode.DESTROY_OBJECT) {
		    int settings = stream.readUnsignedByte((byte) 33);
		    int type = settings >> 2;
		    int rotation = settings & 0x3;
		    int i_142_ = client.anIntArray8351[type];
		    int offsetHash = stream.readUnsignedByte((byte) -12);
		    int posX = (offsetHash >> 4 & 0x7) + Class65.baseTileX * -585685807;
		    int posY = (offsetHash & 0x7) + Class74.baseTileY * 902154613;
		    //System.out.println("Destroying object at position x="+posX+", y="+posY);
		    if (client.aClass238_8477.method4756(-1938668587).method4698(2121507370)
		    		|| (posX >= 0 && posY >= 0
		    		&& posX < client.aClass238_8477.method4744(-2076448030)
		    		&& posY < client.aClass238_8477.method4745(31619157))) {
		    	Class507.method11508(1061320561 * Class323.basePlane, posX,
		    			posY, i_142_, -1, type, rotation, -1883232072);
		    }
		} else {
		    VarType.method3770(new StringBuilder().append("").append
					    (opcode).toString(),
					new RuntimeException(), -669183253);
		    Class362_Sub1.gameLogout(false, 2096302562);
		}
    }
    
    static final void method11836(ClientScriptData class454, byte i) {
	int i_146_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class515 class515
	    = Class441.aClass524_6158.method11745(i_146_, -1406156821);
	if (class515.aString6756 == null)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class515.aString6756;
    }
}
