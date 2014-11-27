/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.URL;

public class Class343
{
    public static final int anInt5317 = 1;
    public static final int anInt5318 = 26;
    public static final int anInt5319 = 23;
    public static final int anInt5320 = 2;
    public static final int anInt5321 = 25;
    public static final int anInt5322 = 24;
    public static final int anInt5323 = 9;
    public static final int anInt5324 = 6;
    public static final int anInt5325 = 13;
    public static final int anInt5326 = 8;
    public static final int anInt5327 = 10;
    public static final int anInt5328 = 28;
    public static final int anInt5329 = 29;
    public static final int anInt5330 = 7;
    public static final int anInt5331 = 11;
    public static final int anInt5332 = 22;
    public static final int anInt5333 = 15;
    public static final int anInt5334 = 5;
    public static final int anInt5335 = 16;
    public static final int anInt5336 = 21;
    public static final int anInt5337 = 4;
    public static final int anInt5338 = 27;
    public static final int anInt5339 = 17;
    public static final int anInt5340 = 14;
    public static final int anInt5341 = 19;
    public static final int anInt5342 = 20;
    
    Class343() throws Throwable {
	throw new Error();
    }
    
    static boolean decodeRegionHash/*method6132*/(RSBitBuffer buffer, int playerIdx, byte i_0_) {
		int type = buffer.readBits(2, 468135516);
		if (type == 0) {
		    if (buffer.readBits(1, 489109319) != 0) {
		    	decodeRegionHash(buffer, playerIdx, (byte) 1);
		    }
			//System.out.println("[Global1] Decoding player at: "+playerIdx);
		    int posX = buffer.readBits(6, 1974978136);
		    int posY = buffer.readBits(6, -580506257);
		    boolean bool = buffer.readBits(1, 2085279950) == 1;
		    if (bool) {
		    	GPI.maskUpdates[(GPI.maskUpdateCount += 847942421) * 1511793725 - 1] = playerIdx;
		    }
		    if (client.localPlayers[playerIdx] != null) {
		    	throw new RuntimeException("Player: "+client.localPlayers[playerIdx]+", index="+playerIdx);
		    }
		    Class26 class26 = GPI.playerRegions[playerIdx];
		    Player player = (client.localPlayers[playerIdx]
		    		= new Player(client.aClass238_8477.method4751(-1440655263)));
		    player.entityIndex = playerIdx * 1641239953;
		    if (null != GPI.aClass241_Sub3Array2373[playerIdx]) {
		    	player.decodeCharacterData(GPI.aClass241_Sub3Array2373[playerIdx], (byte) 14);
		    }
		    if (GPI.aClass241_Sub3Array2366[playerIdx] != null) {
		    	player.method17955(GPI.aClass241_Sub3Array2366[playerIdx], -703139675);
		    }
		    player.setDirection((((Class26) class26).anInt214) * -775956185,
							     true, (byte) 66);
		    player.facingEntity = ((Class26) class26).anInt216 * 1475516513;
		    int i_4_ = ((Class26) class26).regionHash * -2069261233;
		    int i_5_ = i_4_ >> 28;
		    int i_6_ = i_4_ >> 14 & 0xff;
		    int i_7_ = i_4_ & 0xff;
		    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		    int i_8_ = (i_6_ << 6) + posX - class522.baseX * 127679513;
		    int i_9_ = posY + (i_7_ << 6) - class522.baseY * 468558693;
		    player.aBool11496 = ((Class26) class26).aBool217;
		    player.aBool11494 = ((Class26) class26).aBool218;
		    player.moveTypeQueue[0]= GPI.playerMovementTypes[playerIdx];
		    player.nodePlane = player.aByte8745 = (byte) i_5_;
		    if (client.aClass238_8477.method4753((byte) -60).method4331(i_8_, i_9_, 522137584)) {
		    	player.aByte8745++;
		    }
		    player.setPosition(i_8_, i_9_, 1504372680);
		    GPI.playerRegions[playerIdx] = null;
		    return true;
		}
		if (1 == type) {//Switched planes
		    int planeOffset = buffer.readBits(2, -581102080);
		    int regionHash = (-2069261233 * ((Class26) GPI.playerRegions[playerIdx]).regionHash);
		    ((Class26) GPI.playerRegions[playerIdx]).regionHash
				= (((planeOffset + (regionHash >> 28) & 0x3) << 28) + (regionHash & 0xfffffff)) * -1163590993;
		    return false;
		}
		if (2 == type) {//Moved to neighboring region
		    int hash = buffer.readBits(5, 1672476813);
		    int planeOff = hash >> 3 & 0x3;
		    int direction = hash & 0x7;
		    int lastRegion = (((Class26) GPI.playerRegions[playerIdx]).regionHash * -2069261233);
		    if (!GPI.$assertionsDisabled
			&& (GPI.playerMovementTypes[playerIdx] < 0
			    || GPI.playerMovementTypes[playerIdx] > 3)) {
		    	throw new AssertionError();
		    }
		    int planePos = (lastRegion >> 28) + planeOff & 0x3;
		    int regionX = lastRegion >> 14 & 0xff;
		    int regionY = lastRegion & 0xff;
		    if (direction == 0) {
		    	regionX--;
		    	regionY--;
		    }
		    if (1 == direction) {
		    	regionY--;
		    }
		    if (direction == 2) {
		    	regionX++;
		    	regionY--;
		    }
		    if (3 == direction) {
		    	regionX--;
		    }
		    if (4 == direction) {
		    	regionX++;
		    }
		    if (direction == 5) {
		    	regionX--;
		    	regionY++;
		    }
		    if (6 == direction) {
		    	regionY++;
		    }
		    if (7 == direction) {
		    	regionX++;
		    	regionY++;
		    }
		    Class531.method11848(Class84.method1836(-2017575047),
					 GPI.playerMovementTypes[playerIdx], 1720507078);
		    ((Class26) GPI.playerRegions[playerIdx]).regionHash
				= ((regionX << 14) + (planePos << 28) + regionY) * -1163590993;
		    return false;
		}
		int regionOffset = buffer.readBits(20, 1505824935);
		int moveType = regionOffset >> 18 & 0x3;
		int planeOffset = regionOffset >> 16 & 0x3;
		int xOffset = regionOffset >> 8 & 0xff;
		int yOffset = regionOffset & 0xff;
		int regionHash = ((Class26) GPI.playerRegions[playerIdx]).regionHash * -2069261233;
		GPI.playerMovementTypes[playerIdx] = (byte) (moveType - 1);
		if (!GPI.$assertionsDisabled
		    && (GPI.playerMovementTypes[playerIdx] < 0
			|| GPI.playerMovementTypes[playerIdx] > 3)) {
		    throw new AssertionError();
		}
		int plane = planeOffset + (regionHash >> 28) & 0x3;
		int regionX = xOffset + (regionHash >> 14) & 0xff;
		int regionY = regionHash + yOffset & 0xff;
		Class531.method11848(Class84.method1836(-2135988220), moveType - 1, 334893584);
		((Class26) GPI.playerRegions[playerIdx]).regionHash
		    = (regionY + ((regionX << 14) + (plane << 28))) * -1163590993;
		return false;
    }
    
    static final void processLogin/*method6133*/(int i) {
		if (Class13.anInt101 * 1195617353 != 1
		    && 104 != 1195617353 * Class13.anInt101) {
		    do {
			try {
			    int i_28_;
			    if (0 == Class13.anInt115 * -850222383
				&& Class13.anInt101 * 1195617353 < 96)
				i_28_ = 500;
			    else
				i_28_ = 2000;
			    if (Class13.aBool80 && 1195617353 * Class13.anInt101 >= 63)
				i_28_ = 6000;
			    if ((289 == Class13.anInt77 * -47430143
				 && Class13.anInt101 * 1195617353 != 210
				 && 1572493461 * Class13.anInt110 != 42)
				|| (172 == Class13.anInt77 * -47430143
				    && -2029421995 * Class13.anInt75 != 49
				    && -2029421995 * Class13.anInt75 != 52))
				Class13.anInt121 += -897595343;
			    if (Class13.anInt121 * -1951231791 > i_28_) {
				Exception_Sub5.aClass190_10704.closeConnection(1691320034);
				if (-850222383 * Class13.anInt115 < 3) {
				    if (289 == Class13.anInt77 * -47430143)
					Class193.aClass397_2297.method7114(1451781846);
				    else
					Class609.aClass397_7759.method7114(1451781846);
				    Class13.anInt121 = 0;
				    Class13.anInt115 += 161150513;
				    Class13.anInt101 = -1152359031;
				} else {
				    Class13.anInt101 = 1448084985;
				    Class175.setLoginResponse(-5, 95949855);
				    ParamType.method13195((byte) -35);
				    break;
				}
			    }
			    if (17 == 1195617353 * Class13.anInt101) {
				if (289 == -47430143 * Class13.anInt77)
				    Exception_Sub5.aClass190_10704.method3892
					(Class24.method928((Class193.aClass397_2297
								.method7111
							    (-1008037231)),
							   15000, (byte) 48),
					 Class193.aClass397_2297.aString5786,
					 520389028);
				else
				    Exception_Sub5.aClass190_10704.method3892
					(Class24.method928((Class609.aClass397_7759
								.method7111
							    (-1897280574)),
							   15000, (byte) -115),
					 Class609.aClass397_7759.aString5786,
					 1523422005);
				Exception_Sub5.aClass190_10704.method3880((byte) 47);
				Class241_Sub27 class241_sub27
				    = Class475_Sub1_Sub3.method17004(1681087888);
				if (Class13.aBool80) {
				    class241_sub27.data.writeByte
					((Class256.aClass256_4150.anInt4153
					  * 2087126207),
					 -1512406421);
				    class241_sub27.data
					.writeShort(0, -484048531);
				    int i_29_ = 421967667 * (class241_sub27
							     .data
							     .pointer);
				    class241_sub27.data
					.writeInt(803, -1694210990);
				    class241_sub27.data
					.writeInt(1, 488035351);
				    if (-47430143 * Class13.anInt77 == 289)
					class241_sub27.data
					    .writeByte
					    ((1766317249 * client.anInt8288 == 4 ? 1
					      : 0),
					     -1311070610);
				    RSByteBuffer class241_sub3
					= Class577.method12684((byte) -50);
				    class241_sub3.writeByte((Class13.anInt81
							       * 1391949991),
							      -773163991);
				    class241_sub3.writeShort((int) (Math.random()
								     * 9.9999999E7),
							      -484048531);
				    class241_sub3.writeByte(VarPlayerDomain
								  .currentLocale
								  .getId((byte) 0),
							      -326429820);
				    class241_sub3.writeInt((-2074968733
							       * client.anInt8270),
							      -854856253);
				    for (int i_30_ = 0; i_30_ < 6; i_30_++)
					class241_sub3.writeInt
					    ((int) (Math.random() * 9.9999999E7),
					     -1484755206);
				    class241_sub3.method14627(-7247048686966732057L
							      * client.aLong8306);
				    class241_sub3.writeByte((-1202509675
							       * (client.currentGame
								  .anInt6357)),
							      121902397);
				    class241_sub3.writeByte((int) (Math.random()
								     * 9.9999999E7),
							      -1322029016);
				    class241_sub3.applyRSA(RSAKeys.LOGIN_PUBLIC_KEY,
							      RSAKeys.LOGIN_MODULUS,
							      (byte) -1);
				    class241_sub27.data.writeBytes
					(class241_sub3.payload, 0,
					 class241_sub3.pointer * 421967667,
					 752061035);
				    class241_sub27.data.endPacketVarShort
					(421967667 * (class241_sub27
						      .data
						      .pointer) - i_29_,
					 (byte) 106);
				} else
				    class241_sub27.data.writeByte
					((2087126207
					  * Class256.aClass256_4142.anInt4153),
					 -1428414276);
				Exception_Sub5.aClass190_10704
				    .sendPacket(class241_sub27, -2034412417);
				Exception_Sub5.aClass190_10704.method3894((byte) 100);
				Class13.anInt101 = 1940961575;
			    }
			    if (31 == 1195617353 * Class13.anInt101) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (1015098965).isAvailable(1, -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (-1728123250).read
				    ((((ServerConnection) Exception_Sub5.aClass190_10704)
				      .inputBuffer.payload),
				     0, 1, 2088329665);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				int i_31_ = ((ServerConnection) Exception_Sub5.aClass190_10704)
						.inputBuffer
						.readUnsignedByte((byte) 50);
				if (0 != i_31_) {
				    Class13.anInt101 = 1448084985;
				    Class95.method2106(i_31_, (byte) 101);
				    Class175.setLoginResponse(i_31_, -1960942297);
				    Exception_Sub5.aClass190_10704
					.closeConnection(2018489615);
				    ParamType.method13195((byte) -16);
				    break;
				}
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				if (Class13.aBool80)
				    Class13.anInt101 = 739314885;
				else
				    Class13.anInt101 = 1429342111;
			    }
			    if (Class13.anInt101 * 1195617353 == 45) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (-1362450767).isAvailable(2, -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (859747622).read
				    ((((ServerConnection) Exception_Sub5.aClass190_10704)
				      .inputBuffer.payload),
				     0, 2, 1983145821);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = ((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer
					  .readUnsignedShort(1162222719) * -681042949;
				Class13.anInt101 = -1959704449;
			    }
			    if (Class13.anInt101 * 1195617353 == 55) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (-780546407).isAvailable
				     (((((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer.pointer)
				       * 421967667),
				      -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (-451520068).read
				    ((((ServerConnection) Exception_Sub5.aClass190_10704)
				      .inputBuffer.payload),
				     0,
				     (((ServerConnection) Exception_Sub5.aClass190_10704)
				      .inputBuffer.pointer) * 421967667,
				     2132803592);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer
				    .method14664(Class13.anIntArray79, -2023468398);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				String string
				    = ((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer
					  .readJagString(1465718483);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				String string_32_
				    = JSFunction.aClass348_5363.getName(1933869313);
				Class16.method853(string, true, string_32_,
						  client.aBool8440, -1796196245);
				Class13.anInt101 = 1035040839;
			    }
			    if (1195617353 * Class13.anInt101 == 63) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (-1444589140).isAvailable(1, -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (-824411037).read
				    ((((ServerConnection) Exception_Sub5.aClass190_10704)
				      .inputBuffer.payload),
				     0, 1, 2001878003);
				if (1 == ((((ServerConnection) Exception_Sub5.aClass190_10704)
					   .inputBuffer.payload[0])
					  & 0xff))
				    Class13.anInt101 = 1281479134;
			    }
			    if (78 == 1195617353 * Class13.anInt101) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (-1747219467).isAvailable(16, -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (-733793732).read
				    ((((ServerConnection) Exception_Sub5.aClass190_10704)
				      .inputBuffer.payload),
				     0, 16, 2090094986);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 1988214704;
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer
				    .method14664(Class13.anIntArray79, -2023468398);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				Class13.aLong82
				    = (((ServerConnection) Exception_Sub5.aClass190_10704)
					   .inputBuffer
					   .readLong((short) 3188)
				       * -7226492194362182485L);
				Class13.aLong111
				    = (((ServerConnection) Exception_Sub5.aClass190_10704)
					   .inputBuffer
					   .readLong((short) 26552)
				       * 4049046998799193519L);
				Class13.anInt101 = 1429342111;
			    }
			    if (1195617353 * Class13.anInt101 == 87) {
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				Exception_Sub5.aClass190_10704.method3880((byte) 1);
				Class241_Sub27 class241_sub27
				    = Class475_Sub1_Sub3.method17004(930271902);
				RSBitBuffer class241_sub3_sub1
				    = class241_sub27.data;
				if (289 == Class13.anInt77 * -47430143) {
				    Class256 class256;
				    if (Class13.aBool80)
					class256 = Class256.aClass256_4151;
				    else
					class256 = Class256.aClass256_4143;
				    class241_sub3_sub1.writeByte((class256.anInt4153
								    * 2087126207),
								   98418736);
				    class241_sub3_sub1.writeShort(0, -484048531);
				    int i_33_ = class241_sub3_sub1.pointer * 421967667;
				    int i_34_ = 421967667 * class241_sub3_sub1.pointer;
				    if (!Class13.aBool80) {
					class241_sub3_sub1.writeInt(803, -25990913);
					class241_sub3_sub1.writeInt(1, 620957870);
					class241_sub3_sub1.writeByte
					    ((4 == 1766317249 * client.anInt8288 ? 1
					      : 0),
					     -608042897);
					i_34_ = 421967667 * class241_sub3_sub1.pointer;
					RSByteBuffer secureBuffer = Class120_Sub20.encodePasswordBlock(-939333818);
					class241_sub3_sub1.writeBytes(
							secureBuffer.payload, 0,
					    	secureBuffer.pointer * 421967667,
					    	752061035);
					i_34_
					    = 421967667 * class241_sub3_sub1.pointer;
					class241_sub3_sub1.writeByte
					    (-1L == (Class13.aLong82
						     * -3469600135743429117L) ? 1 : 0,
					     -909621147);
					if (Class13.aLong82 * -3469600135743429117L
					    == -1L)
					    class241_sub3_sub1.writeString
						(Class13.aString112, -397985125);
					else
					    class241_sub3_sub1.method14627
						(-3469600135743429117L
						 * Class13.aLong82);
				    }
				    class241_sub3_sub1.writeByte
					(Class474.getDisplayMode(383192455), -902798044);
				    class241_sub3_sub1.writeShort((Class494.canvasWid
								    * -1080559003),
								   -484048531);
				    class241_sub3_sub1.writeShort((Class67.canvasHei
								    * 963058943),
								   -484048531);
				    class241_sub3_sub1.writeByte
					(Class241_Sub5_Sub9.aClass241_Sub9_11043
					     .aClass445_Sub10_8852
					     .method14189((byte) 26),
					 -1459221750);
				    Class445_Sub9.method14184(class241_sub3_sub1,
							      1857065776);
				    class241_sub3_sub1.writeString(client.aString8269,
								   391254905);
				    class241_sub3_sub1.writeInt((-2074968733
								    * (client
								       .anInt8270)),
								   1107729662);
				    RSByteBuffer class241_sub3
					= Class241_Sub5_Sub9.aClass241_Sub9_11043.method14910(852662963);
				    class241_sub3_sub1.writeByte(((class241_sub3.pointer)
								    * 421967667),
								   -1806319123);
				    class241_sub3_sub1.writeBytes(class241_sub3.payload, 0,
					 421967667 * class241_sub3.pointer,
					 752061035);
				    client.aBool8297 = true;
				    RSByteBuffer class241_sub3_35_
					= (new RSByteBuffer
					   (Class6.aClass241_Sub12_38
						.method14954((byte) 1)));
				    Class6.aClass241_Sub12_38
					.method14956(class241_sub3_35_, 593436870);
				    class241_sub3_sub1.writeBytes
					(class241_sub3_35_.payload, 0,
					 class241_sub3_35_.payload.length,
					 752061035);
				    class241_sub3_sub1.writeInt((-364544137 * (client.anInt8342)),
								   -781330080);
				    class241_sub3_sub1.writeInt((-359762931
								    * (client
								       .anInt8275)),
								   8074919);
				    class241_sub3_sub1.writeInt((client.anInt8431
								    * -2013609075),
								   1314639998);
				    class241_sub3_sub1.writeString((Class424
								    .aString6068),
								   -2144666887);
				    class241_sub3_sub1.writeByte
					(null == client.aString8278 ? 0 : 1,
					 948921168);
				    if (client.aString8278 != null)
					class241_sub3_sub1.writeString((client
									.aString8278),
								       877643393);
				    class241_sub3_sub1.writeByte
					((Class120_Sub18.aClass585_10604
					      .method12840("jagtheora", (byte) 0)
					  ? 1 : 0),
					 -1551473884);
				    class241_sub3_sub1.writeByte((client.aBool8267
								    ? 1 : 0),
								   398042653);
				    class241_sub3_sub1.writeByte((client.aBool8282
								    ? 1 : 0),
								   -1071283705);
				    class241_sub3_sub1.writeByte((Class95.anInt1332
								    * -2022180553),
								   -2151986);
				    class241_sub3_sub1.writeInt((-296956191
								    * (client
								       .anInt8285)),
								   -2080676081);
				    class241_sub3_sub1.writeString(client.aString8286, 373830616);
				    class241_sub3_sub1.writeByte
					((null == Class395.aClass397_5774
					  || ((-2019487531
					       * Class395.aClass397_5774.nodeID)
					      != -2019487531 * (Class193.aClass397_2297
								.nodeID))) ? 1 : 0,
					 917988644);
				    class241_sub3_sub1.writeShort((-2019487531
								    * (Class609
								       .aClass397_7759
								       .nodeID)),
								   -484048531);
				    class241_sub3_sub1.writeShort(((Class395
								     .aClass397_5773
								     .nodeID)
								    * -2019487531),
								   -484048531);
				    Class303.method5854(class241_sub3_sub1,
							-1948691260);
				    class241_sub3_sub1.method14665
					(Class13.anIntArray79, i_34_,
					 class241_sub3_sub1.pointer * 421967667,
					 347423274);
				    class241_sub3_sub1.endPacketVarShort
					((class241_sub3_sub1.pointer * 421967667
					  - i_33_),
					 (byte) 23);
				} else {
				    Class256 class256;
				    if (Class13.aBool80)
					class256 = Class256.aClass256_4151;
				    else
					class256 = Class256.aClass256_4144;
				    class241_sub3_sub1.writeByte((2087126207
								    * (class256
								       .anInt4153)),
								   -615584101);
				    class241_sub3_sub1.writeShort(0, -484048531);
				    int i_36_
					= class241_sub3_sub1.pointer * 421967667;
				    int i_37_
					= class241_sub3_sub1.pointer * 421967667;
				    if (!Class13.aBool80) {
					class241_sub3_sub1.writeInt(803,
								       -828370474);
					class241_sub3_sub1.writeInt(1, 1982633565);
					RSByteBuffer class241_sub3
					    = Class120_Sub20.encodePasswordBlock(-1756630109);
					class241_sub3_sub1.writeBytes
					    (class241_sub3.payload, 0,
					     421967667 * class241_sub3.pointer,
					     752061035);
					i_37_
					    = 421967667 * class241_sub3_sub1.pointer;
					class241_sub3_sub1.writeByte
					    (-1L == (-3469600135743429117L
						     * Class13.aLong82) ? 1 : 0,
					     -1583131049);
					if (-3469600135743429117L * Class13.aLong82
					    == -1L)
					    class241_sub3_sub1.writeString
						(Class13.aString112, 1219827569);
					else
					    class241_sub3_sub1.method14627
						(-3469600135743429117L
						 * Class13.aLong82);
				    }
				    class241_sub3_sub1.writeByte(((client
								     .currentGame
								     .anInt6357)
								    * -1202509675),
								   1479738787);
				    class241_sub3_sub1.writeByte
					(VarPlayerDomain.currentLocale.getId((byte) 0),
					 -777850537);
				    class241_sub3_sub1.writeByte
					(Class474.getDisplayMode(-739299379), 1605090568);
				    class241_sub3_sub1.writeShort((-1080559003
								    * (Class494
								       .canvasWid)),
								   -484048531);
				    class241_sub3_sub1.writeShort((Class67.canvasHei
								    * 963058943),
								   -484048531);
				    class241_sub3_sub1.writeByte
					(Class241_Sub5_Sub9.aClass241_Sub9_11043
					     .aClass445_Sub10_8852
					     .method14189((byte) -33),
					 99001167);
				    Class445_Sub9.method14184(class241_sub3_sub1,
							      2083293541);
				    class241_sub3_sub1.writeString(client.aString8269,
								   1569191126);
				    RSByteBuffer class241_sub3
					= Class241_Sub5_Sub9.aClass241_Sub9_11043
					      .method14910(590754129);
				    class241_sub3_sub1.writeByte((421967667
								    * (class241_sub3
								       .pointer)),
								   1263032349);
				    class241_sub3_sub1.writeBytes
					(class241_sub3.payload, 0,
					 421967667 * class241_sub3.pointer,
					 752061035);
				    RSByteBuffer class241_sub3_38_
					= (new RSByteBuffer
					   (Class6.aClass241_Sub12_38
						.method14954((byte) 1)));
				    Class6.aClass241_Sub12_38
					.method14956(class241_sub3_38_, 1006512118);
				    class241_sub3_sub1.writeBytes
					(class241_sub3_38_.payload, 0,
					 class241_sub3_38_.payload.length,
					 752061035);
				    class241_sub3_sub1.writeInt((client.anInt8342 * -364544137), 1705515851);
				    class241_sub3_sub1
					.writeString(Class424.aString6068, 1073034664);
				    class241_sub3_sub1.writeInt((client.anInt8270
								    * -2074968733),
								   1058429040);
				    class241_sub3_sub1.writeInt((client.anInt8285
								    * -296956191),
								   1396279115);
				    class241_sub3_sub1.writeString(client.aString8286,
								   -1047550553);
				    class241_sub3_sub1.writeByte((-2022180553
								    * (Class95
								       .anInt1332)),
								   820406126);
				    Class303.method5854(class241_sub3_sub1, 275022742);
				    class241_sub3_sub1.method14665
					(Class13.anIntArray79, i_37_,
					 421967667 * class241_sub3_sub1.pointer,
					 1063112116);
				    class241_sub3_sub1.endPacketVarShort
					((421967667 * class241_sub3_sub1.pointer
					  - i_36_),
					 (byte) 64);
				}
				Exception_Sub5.aClass190_10704
				    .sendPacket(class241_sub27, -2108464895);
				Exception_Sub5.aClass190_10704.method3894((byte) 100);
				Exception_Sub5.aClass190_10704.packetCipher
				    = new IsaacCipher(Class13.anIntArray79);
				for (int i_39_ = 0; i_39_ < 4; i_39_++)
				    Class13.anIntArray79[i_39_] += 50;
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .aClass418_2256
				    = new IsaacCipher(Class13.anIntArray79);
				new IsaacCipher(Class13.anIntArray79);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.setCipher
				    ((((ServerConnection) Exception_Sub5.aClass190_10704)
				      .aClass418_2256),
				     1562346835);
				Class13.anIntArray79 = null;
				Class13.anInt101 = 1577205088;
			    }
			    if (1195617353 * Class13.anInt101 == 96) {
					if (!Exception_Sub5.aClass190_10704.getIO
						 (-2002745484).isAvailable(1, -341343911))
					    break;
					Exception_Sub5.aClass190_10704.getIO
					    (-932403827).read
					    ((((ServerConnection) Exception_Sub5.aClass190_10704)
					      .inputBuffer.payload),
					     0, 1, 2070568799);
					int response = ((ServerConnection) Exception_Sub5.aClass190_10704)
							.inputBuffer
							.readUnsignedByte((byte) 90);
					((ServerConnection) Exception_Sub5.aClass190_10704)
					    .inputBuffer.pointer
					    = 0;
					if (response == 21) {
					    Class13.anInt101 = -776800633;//127
					} else {
					    if (1 == response) {
							Class13.anInt101 = 276983080;//104
							Class175.setLoginResponse(response, -231048487);
							break;
					    }
					    if (52 == response) {
							InputStream_Sub1.anInt8605 = -100519843 * response;
							Class13.anInt101 = 849692114;
					    } else if (2 == response) {
							if (Class13.aBool93) {
							    Class13.aBool93 = false;
							    Class13.anInt101 = -1152359031;//17
							    break;
							}
							if (289 == -47430143 * Class13.anInt77) {
							    Class473.varClientDomain
								.method16179(94831912);
							    Class13.anInt101 = 1293281045;//253
							} else
							    Class13.anInt101 = -1978447323;//141
					    } else if (response == 15) {
							Exception_Sub5.aClass190_10704.incommingPacketSize = -1798937138;
							Class13.anInt101 = -992694143;//201
					    } else {
							if (23 == response
							    && -850222383 * Class13.anInt115 < 3) {
							    Class13.anInt121 = 0;
							    Class13.anInt115 += 161150513;
							    Class13.anInt101 = -1152359031;//17
							    Exception_Sub5.aClass190_10704
								.closeConnection(348812026);
							    break;
							}
							if (42 == response) {
							    Class13.anInt101 = -844831166;//210
							    Class175.setLoginResponse(response, -1605921484);
							    break;
							}
							if (172 == Class13.anInt77 * -47430143
							    && response == 49
							    && 1766317249 * client.anInt8288 != 5) {
							    if (-2029421995 * Class13.anInt75 != 52) {
							    	Class175.setLoginResponse(response, -939802229);
							    }
							    break;
							}
							if (Class13.aBool78 && !Class13.aBool80
							    && 1391949991 * Class13.anInt81 != -1
							    && response == 35) {
							    Class13.aBool80 = true;
							    Class13.anInt121 = 0;
							    Class13.anInt101 = -1152359031;//17
							    Exception_Sub5.aClass190_10704
								.closeConnection(-367850403);
							    break;
							}
							if (53 == response) {
							    Class13.anInt101 = 1145418068;//244
							} else {
							    Class13.anInt101 = 1448084985;//1
							    Class175.setLoginResponse(response, -251868228);
							    Exception_Sub5.aClass190_10704
								.closeConnection(211843553);
							    ParamType.method13195((byte) -60);
							    break;
							}
					    }
					}
			    }
			    if (1195617353 * Class13.anInt101 == 127) {
				if (Exception_Sub5.aClass190_10704.getIO
					(530858676).isAvailable(1, -341343911)) {
				    Exception_Sub5.aClass190_10704.getIO
					(-177232182).read
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer.payload),
					 0, 1, 1963733425);
				    int i_41_
					= ((((ServerConnection) Exception_Sub5.aClass190_10704)
					    .inputBuffer.payload
					    [0])
					   & 0xff);
				    Class13.anInt94 = i_41_ * -1584407454;
				    Class13.anInt101 = 1448084985;
				    Class175.setLoginResponse(21, -1501328849);
				    Exception_Sub5.aClass190_10704
					.closeConnection(-1210726754);
				    ParamType.method13195((byte) -42);
				}
			    } else if (210 == 1195617353 * Class13.anInt101) {
				if (Exception_Sub5.aClass190_10704.getIO
					(529322073).isAvailable(2, -341343911)) {
				    Exception_Sub5.aClass190_10704.getIO
					(-1397080406).read
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer.payload),
					 0, 2, 2090215108);
				    Class13.anInt114
					= (-172763715
					   * ((((((ServerConnection)
						  Exception_Sub5.aClass190_10704)
						 .inputBuffer
						 .payload[0])
						& 0xff)
					       << 8)
					      + ((((ServerConnection)
						   Exception_Sub5.aClass190_10704)
						  .inputBuffer
						  .payload[1])
						 & 0xff)));
				    Class13.anInt101 = 1577205088;
				}
			    } else if (244 == 1195617353 * Class13.anInt101) {
				if (Exception_Sub5.aClass190_10704.getIO
					(-2108104787).isAvailable(4, -341343911)) {
				    Exception_Sub5.aClass190_10704.getIO
					(-57585356).read
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer.payload),
					 0, 4, 1965951365);
				    Class13.anInt126
					= ((ServerConnection) Exception_Sub5.aClass190_10704)
					      .inputBuffer
					      .readInt((byte) 123) * 1750668871;
				    ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer.pointer
					= 0;
				    Class13.anInt101 = 1448084985;
				    Class175.setLoginResponse(53, -323132934);
				    Exception_Sub5.aClass190_10704
					.closeConnection(-111569420);
				    ParamType.method13195((byte) -62);
				}
			    } else if (Class13.anInt101 * 1195617353 == 197) {
				if (-1010359307 * InputStream_Sub1.anInt8605 == 29) {
				    if (!Exception_Sub5.aClass190_10704.getIO
					     (1293434425).isAvailable(1, -341343911))
					break;
				    Exception_Sub5.aClass190_10704.getIO
					(-1848811057).read
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer.payload),
					 0, 1, 2088046498);
				    Class13.anInt123
					= ((((ServerConnection) Exception_Sub5.aClass190_10704)
					    .inputBuffer.payload
					    [0])
					   & 0xff) * 1465399761;
				} else if (45 == (InputStream_Sub1.anInt8605
						  * -1010359307)) {
				    if (!Exception_Sub5.aClass190_10704.getIO
					     (1275126346).isAvailable(3, -341343911))
					break;
				    Exception_Sub5.aClass190_10704.getIO
					(-454719403).read
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer.payload),
					 0, 3, 2120502372);
				    Class13.anInt123
					= ((((ServerConnection) Exception_Sub5.aClass190_10704)
					    .inputBuffer.payload
					    [0])
					   & 0xff) * 1465399761;
				    Class13.anInt83
					= ((((((ServerConnection)
					       Exception_Sub5.aClass190_10704)
					      .inputBuffer.payload
					      [1])
					     & 0xff)
					    << 8)
					   + ((((ServerConnection)
						Exception_Sub5.aClass190_10704)
					       .inputBuffer.payload
					       [2])
					      & 0xff)) * 437675423;
				} else
				    throw new IllegalStateException();
				Class13.anInt101 = 1448084985;
				Class175.setLoginResponse((-1010359307
						     * InputStream_Sub1.anInt8605),
						    -662322350);
				Exception_Sub5.aClass190_10704.closeConnection(-1186901218);
				ParamType.method13195((byte) -3);
			    } else if (226 == Class13.anInt101 * 1195617353) {
				if (Exception_Sub5.aClass190_10704.getIO
					(528486022).isAvailable(2, -341343911)) {
				    Exception_Sub5.aClass190_10704.getIO
					(-681924833).read
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer.payload),
					 0, 2, 2047666542);
				    ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer.pointer
					= 0;
				    Class351.anInt5426
					= ((ServerConnection) Exception_Sub5.aClass190_10704)
					      .inputBuffer
					      .readUnsignedShort(1162222719) * 212368833;
				    ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer.pointer
					= 0;
				    Class13.anInt101 = -1947902538;
				}
			    } else if (1195617353 * Class13.anInt101 == 230) {
				if (Exception_Sub5.aClass190_10704.getIO
					(-2091901311).isAvailable
				    (Class351.anInt5426 * 293638721, -341343911)) {
				    Exception_Sub5.aClass190_10704.getIO
					(-1415187943).read
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer.payload),
					 0, Class351.anInt5426 * 293638721,
					 2099824753);
				    ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer.pointer
					= 0;
				    byte[] is
					= new byte[293638721 * Class351.anInt5426 + 1];
				    ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer.readEncodeBytes
					(is, 0, Class351.anInt5426 * 293638721,
					 607564197);
				    ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer.pointer
					= 0;
				    RSByteBuffer class241_sub3
					= new RSByteBuffer(is);
				    String string
					= class241_sub3.readString(-1009401457);
				    Class446.method7895(string, true, client.aBool8440,
							-1815142638);
				    Class175.setLoginResponse((-1010359307
							 * InputStream_Sub1.anInt8605),
							-1319332773);
				    if (Class13.anInt77 * -47430143 == 172
					&& 5 != client.anInt8288 * 1766317249)
					Class13.anInt101 = 1577205088;
				    else {
					Class13.anInt101 = 1448084985;
					Exception_Sub5.aClass190_10704
					    .closeConnection(-132959702);
					ParamType.method13195((byte) -17);
				    }
				}
			    } else {
				if (253 == 1195617353 * Class13.anInt101) {
				    if (!Exception_Sub5.aClass190_10704.getIO(915704898)
				    		.isAvailable(2, -341343911)) {
				    	break;
				    }
				    Exception_Sub5.aClass190_10704.getIO(-1494296880)
				    	.read(Exception_Sub5.aClass190_10704.inputBuffer.payload,
				    			0, 2, 2075829861);
				    Exception_Sub5.aClass190_10704.inputBuffer.pointer = 0;
				    Exception_Sub5.aClass190_10704.incommingPacketSize
						= Exception_Sub5.aClass190_10704
					      .inputBuffer.readUnsignedShort(1162222719) * -1248015079;
				    Class13.anInt101 = 91634355;//267
				}
				if (267 == Class13.anInt101 * 1195617353) {
				    if (!Exception_Sub5.aClass190_10704.getIO
					     (-1333346596).isAvailable
					 (1912225577 * (((ServerConnection) (Exception_Sub5
								     .aClass190_10704))
							.incommingPacketSize),
					  -341343911))
					break;
				    Exception_Sub5.aClass190_10704.getIO
					(-1577233025).read
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer.payload),
					 0,
					 1912225577 * (((ServerConnection)
							Exception_Sub5.aClass190_10704)
						       .incommingPacketSize),
					 2051798772);
				    ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer.pointer
					= 0;
				    boolean isFinished
						= (Exception_Sub5.aClass190_10704.inputBuffer.readUnsignedByte((byte) -14) == 1);
				    while ((421967667 * Exception_Sub5.aClass190_10704.inputBuffer.pointer)
					   < (Exception_Sub5.aClass190_10704.incommingPacketSize * 1912225577)) {
						Class254 class254 = Class463.VAR_CLIENT_LIST.decodeVarValue(
						    		Exception_Sub5.aClass190_10704.inputBuffer, (byte) 27);
						Class473.varClientDomain.varValues.method335(
								class254.key * 623518843,
								class254.value, (byte) -60);
				    }
				    if (isFinished) {
						Class241_Sub27 packet = Class475_Sub1_Sub3.method17004(-1202433479);
						RSBitBuffer buffer = packet.data;
						buffer.writeByte((2087126207 * Class256.aClass256_4152.anInt4153), -1953660089);
						Exception_Sub5.aClass190_10704.sendPacket(packet, -1901306377);
						Exception_Sub5.aClass190_10704.method3894((byte) 100);
						Class13.anInt101 = -2027734982;//138
				    } else {
				    	Class13.anInt101 = 1293281045;//253
				    }
				}
				if (Class13.anInt101 * 1195617353 == 138) {
				    if (!Exception_Sub5.aClass190_10704.getIO
					     (-1319685636).isAvailable(1, -341343911)) {
				    	break;
				    }
				    Exception_Sub5.aClass190_10704.getIO
					(1461639972).read
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer.payload),
					 0, 1, 1961129211);
				    int responseCode
					= ((((ServerConnection) Exception_Sub5.aClass190_10704)
					    .inputBuffer.payload[0]) & 0xff);
				    if (2 != responseCode) {
						if (responseCode == 29 || responseCode == 45) {
						    InputStream_Sub1.anInt8605 = -100519843 * responseCode;
						    Class13.anInt101 = 1804900509;
						} else {
						    Class13.anInt101 = 1448084985;
						    Class175.setLoginResponse(responseCode, -1780061224);
						    Exception_Sub5.aClass190_10704.closeConnection(145403010);
						    ParamType.method13195((byte) -124);
						    break;
						}
						break;
				    }
				    Class13.anInt101 = -1978447323;
				}
				if (1195617353 * Class13.anInt101 == 141) {
				    if (!Exception_Sub5.aClass190_10704.getIO
					     (730826356).isAvailable(1, -341343911))
					break;
				    Exception_Sub5.aClass190_10704.getIO(1711582353)
				    	.read(
				    			Exception_Sub5.aClass190_10704.inputBuffer.payload,
				    			0, 1, 2109029281);
				    Class384.anInt5702
					= 112037823 * ((((ServerConnection) (Exception_Sub5
								     .aClass190_10704))
							.inputBuffer.payload[0]) & 0xff);
				    Class13.anInt101 = 1114873283;
				}
				if (155 == 1195617353 * Class13.anInt101) {
				    RSBitBuffer stream
					= (((ServerConnection) Exception_Sub5.aClass190_10704)
					   .inputBuffer);
				    if (289 == Class13.anInt77 * -47430143) {//World
						if (!Exception_Sub5.aClass190_10704.getIO
							 (-260371500).isAvailable
						     (Class384.anInt5702 * -752984001,
						      -341343911))
						    break;
						Exception_Sub5.aClass190_10704.getIO(-167513485).read
						    (stream.payload, 0,
						     -752984001 * Class384.anInt5702,
						     2132474073);
						stream.pointer = 0;
						client.playerRights = stream.readUnsignedByte((byte) 28) * -562486153;
						client.anInt8508 = stream.readUnsignedByte((byte) -80) * -2064149665;
						client.aBool8441 = stream.readUnsignedByte((byte) -17) == 1;
						client.aBool8442 = stream.readUnsignedByte((byte) -42) == 1;
						client.aBool8443 = stream.readUnsignedByte((byte) -16) == 1;
						client.isQcWorld = stream.readUnsignedByte((byte) 36) == 1;
						client.myPlayerIndex = stream.readUnsignedShort(1162222719) * -738519175;
						client.isP2pAccount = stream.readUnsignedByte((byte) -26) == 1;
						Class203.anInt2425 = stream.method14643((byte) 21) * 1122928185;
						client.isP2pWorld = stream.readUnsignedByte((byte) -22) == 1;
						Class120_Sub22.aString10627 = stream.readString(-1840639385);
						client.aClass238_8477.getObjectLoader(-1890178860)
						    .method11851(client.isP2pWorld, 1089105586);
						Class277.aClass236_4389.method4706(319662648)
							.getObjectLoader(-2056697925)
						    .method11851(client.isP2pWorld, 1089105586);
						JS5.itemDefLoader.setAllowMembers(client.isP2pWorld, (byte) 32);
						MasterIndex.npcDefLoader.method7227(client.isP2pWorld, (short) 29002);
				    } else {//Lobby
						if (!Exception_Sub5.aClass190_10704.getIO
							 (-2098965776).isAvailable
						     (Class384.anInt5702 * -752984001,
						      -341343911)) {
						    break;
						}
						Exception_Sub5.aClass190_10704.getIO
						    (-1013942676).read
						    (stream.payload, 0,
						     -752984001 * Class384.anInt5702,
						     2078609907);
						stream.pointer = 0;
						client.playerRights = stream.readUnsignedByte((byte) 18) * -562486153;
						client.anInt8508 = (stream.readUnsignedByte((byte) -58) * -2064149665);
						client.aBool8441 = stream.readUnsignedByte((byte) -74) == 1;
						Class203.anInt2425 = (stream.method14643((byte) -66) * 1122928185);
						Class21.myPlayer.gender = (byte) stream.readUnsignedByte((byte) -42);
						client.aBool8442 = stream.readUnsignedByte((byte) -100) == 1;
						client.aBool8443 = (stream.readUnsignedByte((byte) 4) == 1);
						Class541.aLong7009 = (stream.readLong((short) 24005) * 7560864676624469187L);
						Class209_Sub1.aLong10285
						    = (((6353119288506319851L
							 * Class541.aLong7009)
							- Class50.method1249((byte) 1)
							- stream
							      .method14729((byte) -67))
						       * -7079703363933644479L);
						int flags = stream.readUnsignedByte((byte) -9);
						client.isP2pAccount = (flags & 0x1) != 0;
						Class599.aBool7714 = 0 != (flags & 0x2);
						Class249.anInt3998 = stream.readInt((byte) 31) * 416479871;
						Class111.anInt1513 = stream.readInt((byte) 14) * 1711374871;
						ParamType.anInt7740 = (stream.readUnsignedShort(1162222719) * -2120604853);
						Class10.anInt68 = (stream.readUnsignedShort(1162222719) * -522392027);
						Class120.anInt1566 = (stream.readUnsignedShort(1162222719) * 1781214315);
						Class539.anInt7001 = (stream.readInt((byte) 116) * 1625681393);
						Class621.aClass4_7876 = new Class4(-970497263 * Class539.anInt7001);
						new Thread(Class621.aClass4_7876).start();
						Class187.anInt2205 = stream.readUnsignedByte((byte) 22) * 405558217;
						Class219.anInt2559 = stream.readUnsignedShort(1162222719) * 53778005;
						ClientScriptCaller.anInt8978 = (stream.readUnsignedShort(1162222719) * -624416675);
						Class167.aBool2063 = stream.readUnsignedByte((byte) -3) == 1;
						Class21.myPlayer.nameUnfiltered
						    = Class21.myPlayer.nameFiltered
						    = RuntimeException_Sub3.myPlayerDisplayName
						    = stream.readJagString(662791817);
						Class417.anInt6018
						    = (stream
							   .readUnsignedByte((byte) -39)
						       * 1638451587);
						Class77.anInt1131
						    = stream
							  .readInt((byte) 86) * 188343509;
						Class395.aClass397_5774 = new Server();
						Class395.aClass397_5774.nodeID
						    = (stream
							   .readUnsignedShort(1162222719)
						       * 1167304829);
						if ((-2019487531
						     * Class395.aClass397_5774.nodeID)
						    == 65535)
						    Class395.aClass397_5774.nodeID
							= -1167304829;
						Class395.aClass397_5774.aString5786
						    = stream
							  .readJagString(1038816467);
						if (Class416.aClass470_6012
						    != Class470.aClass470_6345) {
						    Class395.aClass397_5774.anInt5790
							= (170709369 * (Class395.aClass397_5774
									.nodeID)
							   + 1350095168);
						    Class395.aClass397_5774.anInt5788
							= (170297199 * (Class395.aClass397_5774
									.nodeID)
							   + -147867408);
						}
						if ((Class470.aClass470_6339
						     != Class416.aClass470_6012)
						    && ((Class470.aClass470_6341
							 != Class416.aClass470_6012)
							|| client.playerRights * 482866503 < 2)
						    && (Class193.aClass397_2297.method7113
							(Class395.aClass397_5777, (byte) 13)))
						    ClientScriptCaller.method14987((byte) -108);
				    }
				    if (client.aBool8441 && !client.aBool8443 || client.isP2pAccount) {
						try {
						    Class396.callNoParamater(Class421.gameApplet,
									"zap", (byte) -65);
						} catch (Throwable throwable) {
						    if (client.aBool8268) {
							try {
							    Class421.gameApplet
								.getAppletContext
								().showDocument
								(new URL(Class421
									     .gameApplet
									     .getCodeBase(),
									 "blank.ws"),
								 "tbi");
							} catch (Exception exception) {
							    /* empty */
							}
						    }
						}
				    } else {
						try {
						    Class396.callNoParamater(Class421.gameApplet,
									"unzap", (byte) -100);
						} catch (Throwable throwable) {
						    /* empty */
						}
				    }
				    if (Class416.aClass470_6012
					== Class470.aClass470_6345)
					JSFunction.aClass348_5364.method6212((byte) 0);
				    if (289 == -47430143 * Class13.anInt77)
					Class13.anInt101 = 61089570;
				    else {
					Class13.anInt101 = 1448084985;
					Class175.setLoginResponse(2, -1865535878);
					Class639.method13607(-470484636);
					Class496.setClientStage(2, (byte) -35);
					((ServerConnection) Exception_Sub5.aClass190_10704)
					    .currentPacket
					    = null;
					break;
				    }
				}
				if (1195617353 * Class13.anInt101 == 178) {
				    if (!Exception_Sub5.aClass190_10704.getIO
					     (-1882236549).isAvailable(3, -341343911))
					break;
				    Exception_Sub5.aClass190_10704.getIO
					(-2142494433).read
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .inputBuffer.payload),
					 0, 3, 2089263761);
				    Class13.anInt101 = 110377229;
				}
				if (Class13.anInt101 * 1195617353 == 181) {
				    RSBitBuffer class241_sub3_sub1
					= (((ServerConnection) Exception_Sub5.aClass190_10704)
					   .inputBuffer);
				    class241_sub3_sub1.pointer = 0;
				    if (class241_sub3_sub1.method17041(-397923205)) {
					if (!Exception_Sub5.aClass190_10704.getIO
						 (1975574155).isAvailable(1, -341343911))
					    break;
					Exception_Sub5.aClass190_10704.getIO
					    (244730175).read
					    (class241_sub3_sub1.payload, 3, 1,
					     2046240964);
				    }
				    ((ServerConnection) Exception_Sub5.aClass190_10704).currentPacket
					= (Class452.method10546((byte) -1)[class241_sub3_sub1.readPacketOpcode(1388400054)]);
				    ((ServerConnection) Exception_Sub5.aClass190_10704).incommingPacketSize
					= (class241_sub3_sub1.readUnsignedShort(1162222719) * -1248015079);
				    Class13.anInt101 = 1312023919;
				}
				if (Class13.anInt101 * 1195617353 == 167) {
				    if (Exception_Sub5.aClass190_10704.getIO
					    (832335922).isAvailable
					((((ServerConnection) Exception_Sub5.aClass190_10704)
					  .incommingPacketSize) * 1912225577,
					 -341343911)) {
					Exception_Sub5.aClass190_10704.getIO
					    (-1423514722).read
					    ((((ServerConnection)
					       Exception_Sub5.aClass190_10704)
					      .inputBuffer
					      .payload),
					     0,
					     (((ServerConnection) (Exception_Sub5
							   .aClass190_10704)).incommingPacketSize
					      * 1912225577),
					     2119069783);
					((ServerConnection) Exception_Sub5.aClass190_10704)
					    .inputBuffer.pointer
					    = 0;
					int expectedSize = (1912225577 * Exception_Sub5.aClass190_10704.incommingPacketSize);
					Class13.anInt101 = 1448084985;
					Class175.setLoginResponse(2, -571852818);
					Class26.initGameWorld((byte) 58);
					Class25.decodePlayerInit((Exception_Sub5.aClass190_10704.inputBuffer), (byte) 31);
					int regionBlockSize = (expectedSize - 
							(421967667 * Exception_Sub5.aClass190_10704.inputBuffer.pointer));
					RSBitBuffer regionBlock = new RSBitBuffer(regionBlockSize);
					System.arraycopy(
	                                        Exception_Sub5.aClass190_10704.inputBuffer.payload,
	                                        (Exception_Sub5.aClass190_10704.inputBuffer.pointer * 421967667),
	                                        regionBlock.payload, 0,
	                                        regionBlockSize);
					((ServerConnection) Exception_Sub5.aClass190_10704)
					    .inputBuffer.pointer
					    += regionBlockSize * -681042949;
					if (Exception_Sub5.aClass190_10704.currentPacket == IncommingOpcode.DYNAMIC_MAP_REGION_PACKET) {
					    client.aClass238_8477.setMapScene(
	                                            new Class234(MapType.aClass235_2703, regionBlock), 2000113198);
	                                } else {
					    client.aClass238_8477.setMapScene(
	                                            new Class234(MapType.STATIC_MAP, regionBlock),  1747450604);
	                                }
					if ((421967667
					     * (((ServerConnection)
						 Exception_Sub5.aClass190_10704)
						.inputBuffer.pointer))
					    != expectedSize)
					    throw new RuntimeException
						      (new StringBuilder().append
							   ((((ServerConnection)
							      (Exception_Sub5
							       .aClass190_10704))
							     .inputBuffer
							     .pointer) * 421967667)
							   .append
							   (" ").append
							   (expectedSize).toString());
					((ServerConnection) Exception_Sub5.aClass190_10704)
					    .currentPacket
					    = null;
				    }
				} else {
				    if (201 != 1195617353 * Class13.anInt101)
					break;
				    if ((((ServerConnection) Exception_Sub5.aClass190_10704)
					 .incommingPacketSize) * 1912225577
					== -2) {
					if (!Exception_Sub5.aClass190_10704.getIO
						 (-986988021)
						 .isAvailable(2, -341343911))
					    break;
					Exception_Sub5.aClass190_10704.getIO
					    (-101538750).read
					    ((((ServerConnection)
					       Exception_Sub5.aClass190_10704)
					      .inputBuffer
					      .payload),
					     0, 2, 1995373913);
					((ServerConnection) Exception_Sub5.aClass190_10704)
					    .inputBuffer.pointer
					    = 0;
					((ServerConnection) Exception_Sub5.aClass190_10704)
					    .incommingPacketSize
					    = (((ServerConnection)
						Exception_Sub5.aClass190_10704)
						   .inputBuffer
						   .readUnsignedShort(1162222719)
					       * -1248015079);
				    }
				    if (Exception_Sub5.aClass190_10704.getIO
					    (268098761).isAvailable
					(1912225577 * (((ServerConnection)
							Exception_Sub5.aClass190_10704)
						       .incommingPacketSize),
					 -341343911)) {
					Exception_Sub5.aClass190_10704.getIO
					    (-1470750605).read
					    ((((ServerConnection)
					       Exception_Sub5.aClass190_10704)
					      .inputBuffer
					      .payload),
					     0,
					     (((ServerConnection) (Exception_Sub5
							   .aClass190_10704)).incommingPacketSize
					      * 1912225577),
					     1992053979);
					((ServerConnection) Exception_Sub5.aClass190_10704).inputBuffer.pointer
					    = 0;
					int i_46_ = ((((ServerConnection) Exception_Sub5.aClass190_10704).incommingPacketSize)
						     * 1912225577);
					Class13.anInt101 = 1448084985;
					Class175.setLoginResponse(15, -144721583);
					Class589.method12906(464112876);
					Class25.decodePlayerInit((((ServerConnection)
							    (Exception_Sub5
							     .aClass190_10704))
							   .inputBuffer),
							  (byte) 116);
					if (((((ServerConnection)
					       Exception_Sub5.aClass190_10704)
					      .inputBuffer.pointer)
					     * 421967667)
					    != i_46_)
					    throw new RuntimeException
						      (new StringBuilder().append
							   (421967667
							    * (((ServerConnection)
								(Exception_Sub5
								 .aClass190_10704))
							       .inputBuffer
							       .pointer))
							   .append
							   (" ").append
							   (i_46_).toString());
					((ServerConnection) Exception_Sub5.aClass190_10704)
					    .currentPacket
					    = null;
				    }
				}
			    }
			} catch (IOException ioexception) {
			    Exception_Sub5.aClass190_10704.closeConnection(-419517130);
			    if (-850222383 * Class13.anInt115 < 3) {
					if (289 == Class13.anInt77 * -47430143) {
					    Class193.aClass397_2297.method7114(1451781846);
					} else {
					    Class609.aClass397_7759.method7114(1451781846);
					}
					Class13.anInt121 = 0;
					Class13.anInt115 += 161150513;
					Class13.anInt101 = -1152359031;
			    } else {
					Class13.anInt101 = 1448084985;
					Class175.setLoginResponse(-4, 40329586);
					ParamType.method13195((byte) -32);
			    }
			    break;
			}
			break;
		    } while (false);
		}
    }
}
