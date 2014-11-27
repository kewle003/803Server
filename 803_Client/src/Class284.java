/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class284 implements Interface64
{
    JS5 aClass210_4449;
    public static JS5 SPRITES_ARCHIVE;//aClass210_4450
    
    public int method146(byte i) {
	if (((Class284) this).aClass210_4449.method4191((byte) 6))
	    return 100;
	return ((Class284) this).aClass210_4449.method4193(2003643909);
    }
    
    public Class632 method448() {
	return Class632.aClass632_8052;
    }
    
    public Class632 method446(byte i) {
	return Class632.aClass632_8052;
    }
    
    Class284(JS5 class210) {
	((Class284) this).aClass210_4449 = class210;
    }
    
    public int method447() {
	if (((Class284) this).aClass210_4449.method4191((byte) 6))
	    return 100;
	return ((Class284) this).aClass210_4449.method4193(4718025);
    }
    
    public Class632 method449() {
	return Class632.aClass632_8052;
    }
    
    public Class632 method450() {
	return Class632.aClass632_8052;
    }
    
    static final void method5519(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	if (Class21.myPlayer.aClass490_11499 != null)
	    Class21.myPlayer.aClass490_11499
		.method11216(i_0_, i_1_, JS5.itemDefLoader, 631025463);
    }
    
    static final void method5520(ClientScriptData class454, byte i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	ItemDefinition class623
	    = JS5.itemDefLoader.list(i_2_, (short) -27228);
	if (-1 == -1365591143 * class623.noteTemplateID
	    && class623.noteID * -2142812803 >= 0)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -2142812803 * class623.noteID;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= i_2_;
    }
    
    public static void method5521(String string, boolean bool, int i) {
	string = string.toLowerCase();
	Class72.anInt1099 = 0;
	if (-1013509011 * client.anInt8313 != -1078012699 * client.anInt8574
	    || bool != client.aBool8362
	    || !string.equals(Class402.aString5872)) {
	    Class402.aString5872 = string;
	    client.anInt8574 = client.anInt8313 * 312807657;
	    client.aBool8362 = bool;
	    short[] is = new short[16];
	    int i_3_ = 0;
	    int i_4_ = bool ? 32768 : 0;
	    int i_5_
		= i_4_ + (bool ? -1285159007 * Class72.aClass625_1100.anInt7963
			  : -773274793 * Class72.aClass625_1100.anInt7965);
	    for (int i_6_ = i_4_; i_6_ < i_5_; i_6_++) {
		Class241_Sub39_Sub9 class241_sub39_sub9
		    = Class72.aClass625_1100.list(i_6_, 1802011041);
		if (class241_sub39_sub9.aBool10864
		    && class241_sub39_sub9.method17178((byte) -81).toLowerCase
			   ().indexOf(string) != -1) {
		    if (i_3_ >= 50) {
			Class120_Sub16.anInt10563 = -364935133;
			Class66_Sub2.aShortArray10479 = null;
			return;
		    }
		    if (i_3_ >= is.length) {
			short[] is_7_ = new short[is.length * 2];
			for (int i_8_ = 0; i_8_ < i_3_; i_8_++)
			    is_7_[i_8_] = is[i_8_];
			is = is_7_;
		    }
		    is[i_3_++] = (short) i_6_;
		}
	    }
	    Class66_Sub2.aShortArray10479 = is;
	    Class120_Sub16.anInt10563 = i_3_ * 364935133;
	    String[] strings
		= new String[678860917 * Class120_Sub16.anInt10563];
	    for (int i_9_ = 0; i_9_ < Class120_Sub16.anInt10563 * 678860917;
		 i_9_++)
		strings[i_9_]
		    = Class72.aClass625_1100.list
			  (is[i_9_], -1106116423).method17178((byte) -18);
	    Class482.method11025(strings, Class66_Sub2.aShortArray10479,
				 (byte) 108);
	}
    }
    
    static void unpackLocationUpdate/*method5522*/(RSBitBuffer buffer, int playerIdx, int i_10_) {
		GameScene scene = client.aClass238_8477.method4806((byte) 1);
		boolean maskUpdateNeeded = (buffer.readBits(1, 331963822) == 1);
		if (maskUpdateNeeded) {
		    GPI.maskUpdates[(GPI.maskUpdateCount += 847942421) * 1511793725 - 1] = playerIdx;
		}
		int type = buffer.readBits(2, -843235407);
		Player player = client.localPlayers[playerIdx];
		if (0 == type) {//Removal request
		    if (!maskUpdateNeeded) {
				if (1124115145 * client.myPlayerIndex == playerIdx) {
				    throw new RuntimeException();
				}
				Class26 class26 = GPI.playerRegions[playerIdx] = new Class26();
				Class84.method1836(-2018665393);
				((Class26) class26).regionHash = ((
						((player.scenePositionYQueue[0] + 468558693 * scene.baseY) >> 6)
						+ ((127679513 * scene.baseX + player.scenePositionXQueue[0]) >> 6 << 14)
						+ (player.nodePlane << 28))
				        * -1163590993);
				if (player.facingDirection * -989200205 != -1) {
				    ((Class26) class26).anInt214 = (-1934976107 * player.facingDirection);
				} else {
				    ((Class26) class26).anInt214 = player.aClass8_11406.method514((byte) 87) * -381679977;
				}
				((Class26) class26).anInt216 = 1730284449 * player.facingEntity;
				((Class26) class26).aBool217 = player.aBool11496;
				((Class26) class26).aBool218 = player.aBool11494;
				if (player.anInt11513 * 1294463297 > 0) {
				    Class361_Sub1.method16755(player, 1482319719);
				}
				client.localPlayers[playerIdx] = null;
				if (buffer.readBits(1, -270696800) != 0) {
				    Class343.decodeRegionHash(buffer, playerIdx, (byte) 1);
				}
		    }
		} else if (1 == type) {//Walking
		    int direction = buffer.readBits(3, -14217514);
		    int i_13_ = buffer.readBits(1, 1262715935);
		    int posX = player.scenePositionXQueue[0];
		    int posY = player.scenePositionYQueue[0];
		    if (1 == i_13_) {
				int i_16_ = buffer.readBits(2, 989788494);
				switch (i_16_) {
				case 1:
					player.moveTo(posX - 1, posY, GPI.playerMovementTypes[playerIdx], 1991284002);
				    break;
				case 2:
					player.moveTo(posX + 1, posY, GPI.playerMovementTypes[playerIdx], -1992944517);
				    break;
				case 0:
					player.moveTo(posX, 1 + posY, GPI.playerMovementTypes[playerIdx], 941827355);
				    break;
				case 3:
					player.moveTo(posX, posY - 1, GPI.playerMovementTypes[playerIdx], 1566847612);
				    break;
				}
		    }
		    if (0 == direction) {
		    	posX--;
		    	posY--;
		    } else if (1 == direction) {
		    	posY--;
		    } else if (2 == direction) {
		    	posX++;
		    	posY--;
		    } else if (3 == direction) {
		    	posX--;
		    } else if (direction == 4) {
		    	posX++;
		    } else if (direction == 5) {
		    	posX--;
		    	posY++;
		    } else if (direction == 6) {
		    	posY++;
		    } else if (direction == 7) {
		    	posX++;
		    	posY++;
		    }
		    //System.out.println("Received walk: direction="+direction+", posX="+posX+", posY="+posY);
		    player.moveTo(posX, posY, GPI.playerMovementTypes[playerIdx], 120703078);
		} else if (2 == type) {//Running
		    int direction = buffer.readBits(4, 247615379);
		    int posX = player.scenePositionXQueue[0];
		    int posY = player.scenePositionYQueue[0];
		    if (0 == direction) {
				posX -= 2;
				posY -= 2;
		    } else if (1 == direction) {
				posX--;
				posY -= 2;
		    } else if (direction == 2) {
		    	posY -= 2;
		    } else if (3 == direction) {
				posX++;
				posY -= 2;
		    } else if (direction == 4) {
				posX += 2;
				posY -= 2;
		    } else if (5 == direction) {
				posX -= 2;
				posY--;
		    } else if (6 == direction) {
				posX += 2;
				posY--;
		    } else if (direction == 7) {
		    	posX -= 2;
		    } else if (8 == direction) {
		    	posX += 2;
		    } else if (9 == direction) {
				posX -= 2;
				posY++;
		    } else if (10 == direction) {
				posX += 2;
				posY++;
		    } else if (direction == 11) {
				posX -= 2;
				posY += 2;
		    } else if (12 == direction) {
				posX--;
				posY += 2;
		    } else if (direction == 13) {
		    	posY += 2;
		    } else if (direction == 14) {
				posX++;
				posY += 2;
		    } else if (direction == 15) {
				posX += 2;
				posY += 2;
		    }
		    //System.out.println("Received run: direction="+direction+", posX="+posX+", posY="+posY);
		    player.moveTo(posX, posY, GPI.playerMovementTypes[playerIdx], -1084829981);
		} else {//Teleported
		    int inRange = buffer.readBits(1, 88592820);
		    if (0 == inRange) {
				int moveHash = buffer.readBits(15, 1126274827);
				int moveType = moveHash >> 12 & 0x7;
				int planeOffset = (byte) (moveHash >> 10) & 0x3;
				int xOffset = moveHash >> 5 & 0x1f;
				if (xOffset > 15) {
					xOffset -= 32;
				}
				int yOffset = moveHash & 0x1f;
				if (yOffset > 15) {
					yOffset -= 32;
				}
				int locX = player.scenePositionXQueue[0] + xOffset;
				int locY = player.scenePositionYQueue[0] + yOffset;
				if (Class448.aClass448_6188.anInt6189 * -21180569 == moveType) {
					player.setPosition(locX, locY, 1359206985);
				} else {
				    GPI.playerMovementTypes[playerIdx] = (byte) (moveType - 1);
				    player.moveTo(locX, locY, GPI.playerMovementTypes[playerIdx], -2109302346);
				    //System.out.println("Received movement: posX="+locX+", posY="+locY+", type="+moveType +", offX="+xOffset+", offY="+yOffset);
				    
				}
				player.nodePlane = player.aByte8745 = (byte) (player.nodePlane + planeOffset & 0x3);
				if (client.aClass238_8477.method4753((byte) -1).method4331(locX, locY, -1530796947)) {
					player.aByte8745++;
				}
				if (1124115145 * client.myPlayerIndex == playerIdx
				    && (Class357_Sub1.anInt10357 * 993680393 != player.nodePlane)) {
				    Class357_Sub1.anInt10357 = -1355156935 * player.nodePlane;
				}
		    } else {
				int moveType = buffer.readBits(3, -761177329);
				int moveHash = buffer.readBits(30, 1431420282);
				int planeOffset = moveHash >> 28 & 0x3;
				int xOffset = moveHash >> 14 & 0x3fff;
				int yOffset = moveHash & 0x3fff;
				int locX = ((xOffset + (127679513 * scene.baseX
						+ player.scenePositionXQueue[0]) & 0x3fff)
						- scene.baseX * 127679513);
				int locY = ((yOffset + (468558693 * scene.baseY
						+ player.scenePositionYQueue[0]) & 0x3fff)
						- 468558693 * scene.baseY);
				if (-21180569 * Class448.aClass448_6188.anInt6189 == moveType) {
					player.setPosition(locX, locY, 1733384021);
				} else {
				    GPI.playerMovementTypes[playerIdx] = (byte) (moveType - 1);
				    player.moveTo(locX, locY, GPI.playerMovementTypes[playerIdx], 305389813);
				}
				player.nodePlane = player.aByte8745 = (byte) (player.nodePlane + planeOffset & 0x3);
				if (client.aClass238_8477.method4753((byte) -18).method4331(locX, locY, -935642774)) {
					player.aByte8745++;
				}
				if (client.myPlayerIndex * 1124115145 == playerIdx) {
				    Class357_Sub1.anInt10357 = -1355156935 * player.nodePlane;
				}
		    }
		}
    }
    
    static final void method5523(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class331.method6042(class58, class35, class454, 1214979898);
    }
}
