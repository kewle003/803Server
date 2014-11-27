/* Class120_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Class120_Sub10 extends Class120
{
    int anInt10506;
    Class221 aClass221_10507;
    int anInt10508;
    int anInt10509;
    int anInt10510;
    
    void method2959(int i) {
	if (((Class120_Sub10) this).aClass221_10507 != null) {
	    ((Class120_Sub10) this).aClass221_10507.method4405(50,
							       -1336122987);
	    Class402.soundManager.method1136((((Class120_Sub10) this)
					       .aClass221_10507),
					      (byte) -32);
	    ((Class120_Sub10) this).aClass221_10507 = null;
	}
    }
    
    void method2967() {
	if (((Class120_Sub10) this).aClass221_10507 != null) {
	    ((Class120_Sub10) this).aClass221_10507.method4405(50,
							       -2060424795);
	    Class402.soundManager.method1136((((Class120_Sub10) this)
					       .aClass221_10507),
					      (byte) -19);
	    ((Class120_Sub10) this).aClass221_10507 = null;
	}
    }
    
    public void method2958(int i) {
	if (null != ((Class120_Sub10) this).aClass221_10507)
	    ((Class120_Sub10) this).aClass221_10507.method4392(1910526244);
    }
    
    public void method2961() {
	if (null != ((Class120_Sub10) this).aClass221_10507)
	    ((Class120_Sub10) this).aClass221_10507.method4392(1702922251);
    }
    
    void method2965() {
	if (((Class120_Sub10) this).aClass221_10507 != null) {
	    ((Class120_Sub10) this).aClass221_10507.method4405(50, -729057193);
	    Class402.soundManager.method1136((((Class120_Sub10) this)
					       .aClass221_10507),
					      (byte) -21);
	    ((Class120_Sub10) this).aClass221_10507 = null;
	}
    }
    
    void method2963() {
	if (((Class120_Sub10) this).aClass221_10507 != null) {
	    ((Class120_Sub10) this).aClass221_10507.method4405(50, -609015988);
	    Class402.soundManager.method1136((((Class120_Sub10) this)
					       .aClass221_10507),
					      (byte) -9);
	    ((Class120_Sub10) this).aClass221_10507 = null;
	}
    }
    
    Class120_Sub10(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub10) this).anInt10510
	    = class241_sub3.readUnsignedShort(1162222719) * -968451277;
	((Class120_Sub10) this).anInt10506
	    = class241_sub3.readUnsignedByte((byte) -46) * 242547311;
	((Class120_Sub10) this).anInt10508
	    = class241_sub3.readUnsignedByte((byte) -65) * 75218235;
	((Class120_Sub10) this).anInt10509
	    = class241_sub3.readUnsignedByte((byte) 33) * -685660959;
	((Class120_Sub10) this).aClass221_10507
	    = (Class402.soundManager.method1161
	       (Class112.aClass112_1522, this,
		((Class120_Sub10) this).anInt10510 * 1373296635,
		1166188321 * ((Class120_Sub10) this).anInt10509,
		1742185615 * ((Class120_Sub10) this).anInt10506,
		Class130.aClass130_1597.method3067(-960497231),
		Class127.aClass127_1587, 0.0F, 0.0F, null, 0,
		((Class120_Sub10) this).anInt10508 * -1233120269, false,
		1786922212));
	if (((Class120_Sub10) this).aClass221_10507 != null)
	    ((Class120_Sub10) this).aClass221_10507.method4438(734868731);
    }
    
    void method2966() {
	if (((Class120_Sub10) this).aClass221_10507 != null) {
	    ((Class120_Sub10) this).aClass221_10507.method4405(50,
							       -1863564196);
	    Class402.soundManager.method1136((((Class120_Sub10) this)
					       .aClass221_10507),
					      (byte) -23);
	    ((Class120_Sub10) this).aClass221_10507 = null;
	}
    }
    
    public static void runCommand/*method16779*/(String commandString, boolean clientCommand, boolean bool_0_, int i) {
	do {
	    try {
		if (commandString.equalsIgnoreCase("commands")
		    || commandString.equalsIgnoreCase("help")) {
		    Class21.addline("commands - This command", (byte) 85);
		    Class21.addline("cls - Clear console", (byte) 85);
		    Class21.addline("displayfps - Toggle FPS and other information", (byte) 85);
		    Class21.addline
			("renderer - Print graphics renderer information",
			 (byte) 85);
		    Class21.addline("heap - Print java memory information",
				      (byte) 85);
		    Class21.addline("getcamerapos - Print location and direction of camera for use in bug reports", (byte) 85);
		    Class21.addline("getclientvarp - Print the value of the specified client varp", (byte) 85);
		    Class21.addline("getclientvarpbit - Print the value of the specified client varp bit", (byte) 85);
		} else if (commandString.equalsIgnoreCase("cls")) {
		    Class185.anInt2179 = 0;
		    Class185.anInt2184 = 0;
		} else if (commandString.equalsIgnoreCase("displayfps")) {
		    client.aBool8449 = !client.aBool8449;
		    if (client.aBool8449)
			Class21.addline("FPS on", (byte) 85);
		    else
			Class21.addline("FPS off", (byte) 85);
		} else if (commandString.equals("renderer")) {
		    Class174 class174 = Class236.aClass103_2713.method2623();
		    Class21.addline(new StringBuilder().append
					  ("Toolkit ID: ").append
					  (Class241_Sub5_Sub9
					       .aClass241_Sub9_11043
					       .aClass445_Sub11_8893
					       .method14197((byte) -85))
					  .toString(),
				      (byte) 85);
		    Class21.addline(new StringBuilder().append
					  ("Vendor: ").append
					  (class174.anInt2104 * 824514313)
					  .toString(),
				      (byte) 85);
		    Class21.addline(new StringBuilder().append("Name: ")
					  .append
					  (class174.aString2106).toString(),
				      (byte) 85);
		    Class21.addline(new StringBuilder().append
					  ("Version: ").append
					  (class174.anInt2108 * 1967361051)
					  .toString(),
				      (byte) 85);
		    Class21.addline(new StringBuilder().append
					  ("Device: ").append
					  (class174.aString2103).toString(),
				      (byte) 85);
		    Class21.addline(new StringBuilder().append
					  ("Driver Version: ").append
					  (class174.aLong2100
					   * 3790016697209787005L)
					  .toString(),
				      (byte) 85);
		    String string_1_ = Class236.aClass103_2713.method2284();
		    if (string_1_.length() > 0)
			Class21.addline(string_1_, (byte) 85);
		} else if (commandString.equals("heap")) {
		    Class21.addline(new StringBuilder().append("Heap: ")
					  .append
					  (GameShell3.maxmemory * -1901361259)
					  .append
					  ("MB").toString(),
				      (byte) 85);
                } else {
		    if (!commandString.equalsIgnoreCase("getcamerapos"))
			break;
		    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		    if (4 == Class296.anInt4513 * 115241065) {
			Class287 class287 = Class445_Sub16.aClass351_Sub1_8660
						.method6288(1244654669);
			Class287 class287_2_
			    = Class445_Sub16.aClass351_Sub1_8660
				  .method6285(1736754263);
			Class21.addline
			    (new StringBuilder().append("Pos: ").append
				 (new GameScene((Class21.myPlayer.nodePlane),
				       (int) class287.aFloat4477 >> 9,
				       (int) class287.aFloat4479 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class96_Sub5.method16046
				   (((int) class287.aFloat4477
				     - (127679513 * class522.baseX << 9)),
				    ((int) class287.aFloat4479
				     - (468558693 * class522.baseY << 9)),
				    (Class21.myPlayer
				     .nodePlane),
				    97231761)) + (int) class287.aFloat4474)
				 .toString(),
			     (byte) 85);
			Class21.addline
			    (new StringBuilder().append("Look: ").append
				 (new GameScene
				      ((Class21.myPlayer.nodePlane),
				       (int) class287_2_.aFloat4477 >> 9,
				       (int) class287_2_.aFloat4479 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class96_Sub5.method16046
				   (((int) class287_2_.aFloat4477
				     - (127679513 * class522.baseX << 9)),
				    ((int) class287.aFloat4479
				     - (468558693 * class522.baseY << 9)),
				    (Class21.myPlayer
				     .nodePlane),
				    -241157745)) + (int) class287.aFloat4474)
				 .toString(),
			     (byte) 85);
		    } else {
			Class21.addline
			    (new StringBuilder().append("Pos: ").append
				 (Class21.myPlayer
				  .nodePlane)
				 .append
				 (",").append
				 (((133333741 * Class462.anInt6284 >> 9)
				   + 127679513 * class522.baseX) >> 6)
				 .append
				 (",").append
				 ((class522.baseY * 468558693
				   + (-271636831 * Class636.anInt8248 >> 9))
				  >> 6)
				 .append
				 (",").append
				 ((127679513 * class522.baseX
				   + (133333741 * Class462.anInt6284 >> 9))
				  & 0x3f)
				 .append
				 (",").append
				 (((Class636.anInt8248 * -271636831 >> 9)
				   + class522.baseY * 468558693) & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class96_Sub5.method16046
				   (Class462.anInt6284 * 133333741,
				    -271636831 * Class636.anInt8248,
				    (Class21.myPlayer
				     .nodePlane),
				    1510774699))
				  - -781800491 * Class175.anInt2123)
				 .toString(),
			     (byte) 85);
			Class21.addline
			    (new StringBuilder().append("Look: ").append
				 (Class21.myPlayer.nodePlane)
				 .append
				 (",").append
				 ((Class421.anInt6040 * 920883151
				   + 127679513 * class522.baseX) >> 6)
				 .append
				 (",").append
				 ((class522.baseY * 468558693
				   + 1409626397 * Class380_Sub2.anInt10409)
				  >> 6)
				 .append
				 (",").append
				 ((class522.baseX * 127679513
				   + Class421.anInt6040 * 920883151) & 0x3f)
				 .append
				 (",").append
				 ((Class380_Sub2.anInt10409 * 1409626397
				   + class522.baseY * 468558693) & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class96_Sub5.method16046
				   (Class421.anInt6040 * 920883151,
				    1409626397 * Class380_Sub2.anInt10409,
				    (Class21.myPlayer.nodePlane),
				    1430366172))
				  - Class327.anInt5020 * 1939578505)
				 .toString(),
			     (byte) 85);
		    }
		}
	    } catch (Exception exception) {
		Class21.addline((ClientMessage.DEBUG_CONSOLE_ERROR.getLocalisedMessage
				   (VarPlayerDomain.currentLocale, (short) 28035)),
				  (byte) 85);
	    }
	    return;
	} while (false);
	if (Class416.aClass470_6012 != Class470.aClass470_6345
	    || client.playerRights * 482866503 >= 2) {
	    try {
		if (commandString.equalsIgnoreCase("wm1")) {
		    Class537.method11899(1, -1, -1, false, 1482319719);
		    if (Class474.getDisplayMode(-2127110243) == 1)
		    	Class21.addline("Success", (byte) 85);
		    else
		    	Class21.addline("Failure", (byte) 85);
		    return;
		}
		if (commandString.equalsIgnoreCase("wm2")) {
		    Class537.method11899(2, -1, -1, false, 1482319719);
		    if (Class474.getDisplayMode(922102915) == 2)
		    	Class21.addline("Success", (byte) 85);
		    else
		    	Class21.addline("Failure", (byte) 85);
		    return;
		}
		if (Class442.aBool6160 && commandString.equalsIgnoreCase("wm3")) {
		    Class537.method11899(3, 1024, 768, false, 1482319719);
		    if (Class474.getDisplayMode(1026455866) == 3)
			Class21.addline("Success", (byte) 85);
		    else
			Class21.addline("Failure", (byte) 85);
		    return;
		}
		if (commandString.startsWith("setlobby ")) {
		    if (17 != client.anInt8288 * 1766317249)
			Class21.addline("Failure", (byte) 85);
		    else {
			int i_3_ = -1;
			//Object object = null;
			commandString = commandString.substring(9);
			int i_4_ = commandString.indexOf(' ');
			if (i_4_ == -1)
			    Class21.addline("Failure", (byte) 85);
			else {
			    try {
				i_3_
				    = Integer.parseInt(commandString.substring(0,
									i_4_));
			    } catch (NumberFormatException numberformatexception) {
				/* empty */
			    }
			    if (i_3_ == -1)
				Class21.addline("Failure", (byte) 85);
			    else {
				String string_5_
				    = new StringBuilder().append
					  (commandString.substring(1 + i_4_).trim())
					  .append
					  (".runescape.com").toString();
				Class84.method1840(string_5_, i_3_,
						   (byte) -101);
				Class21.addline("Success", (byte) 85);
				return;
			    }
			    return;
			}
			return;
		    }
		    return;
		}
		if (commandString.startsWith("setmediastream ")) {
		    if (17 != 1766317249 * client.anInt8288)
			Class21.addline("Failure", (byte) 85);
		    else {
			int i_6_ = -1;
			//Object object = null;
			commandString = commandString.substring(15);
			int i_7_ = commandString.indexOf(' ');
			if (-1 == i_7_)
			    Class21.addline("Failure", (byte) 85);
			else {
			    try {
				i_6_
				    = Integer.parseInt(commandString.substring(0,
									i_7_));
			    } catch (NumberFormatException numberformatexception) {
				/* empty */
			    }
			    if (i_6_ == -1)
				Class21.addline("Failure", (byte) 85);
			    else {
				String string_8_
				    = new StringBuilder().append
					  (commandString.substring(i_7_ + 1).trim())
					  .append
					  (".runescape.com").toString();
				Class530.method11841(string_8_, i_6_,
						     -2056131718);
				Class120_Sub15.aClass207_10542.method4095
				    (Class395.aClass397_5773.aString5786,
				     Class395.aClass397_5773
					 .method7112(1084595858),
				     -1580446602);
				Class281.aClass280_4428.method5479(-585977005);
				Class21.addline("Success", (byte) 85);
				return;
			    }
			    return;
			}
			return;
		    }
		    return;
		}
		if (commandString.equalsIgnoreCase("tk0")) {
		    GraphicsDefaults.method11570(0, false, 1945822518);
		    if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub11_8893.method14197((byte) 37) == 0) {
				Class21.addline("Success", (byte) 85);
				Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
				    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
				      .aClass445_Sub11_8879),
				     0, (byte) 2);
				Class167.method3600((short) -2113);
				client.aBool8297 = false;
		    } else
			Class21.addline("Failure", (byte) 85);
		    return;
		}
		if (commandString.equalsIgnoreCase("tk1")) {
		    GraphicsDefaults.method11570(1, false, 1945822518);
		    if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub11_8893.method14197((byte) 54)
			== 1) {
			Class21.addline("Success", (byte) 85);
			Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub11_8879),
			     1, (byte) 2);
			Class167.method3600((short) -21411);
			client.aBool8297 = false;
		    } else
			Class21.addline("Failure", (byte) 85);
		    return;
		}
		if (commandString.equalsIgnoreCase("tk3")) {
		    GraphicsDefaults.method11570(3, false, 1945822518);
		    if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub11_8893.method14197((byte) 30)
			== 3) {
			Class21.addline("Success", (byte) 85);
			Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub11_8879),
			     3, (byte) 2);
			Class167.method3600((short) 13085);
			client.aBool8297 = false;
		    } else
			Class21.addline("Failure", (byte) 85);
		    return;
		}
		if (commandString.equalsIgnoreCase("tk5")) {
		    GraphicsDefaults.method11570(5, false, 1945822518);
		    if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub11_8893.method14197((byte) -4) == 5) {
				Class21.addline("Success", (byte) 85);
				Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
				    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
				      .aClass445_Sub11_8879),
				     5, (byte) 2);
				Class167.method3600((short) 2732);
				client.aBool8297 = false;
		    } else {
		    	Class21.addline("Failure", (byte) 85);
		    }
		    return;
		}
		if (commandString.equalsIgnoreCase("clientdrop")) {
		    if (client.anInt8288 * 1766317249 == 19)
			Class199.dropClient(-1227634679);
		    else if (9 == client.anInt8288 * 1766317249)
			client.aClass190_8340.aBool2275 = true;
		    return;
		}
		if (commandString.equalsIgnoreCase("breakcon")) {
		    ServerConnection[] class190s = client.aClass190Array8397;
		    for (int i_9_ = 0; i_9_ < class190s.length; i_9_++) {
			ServerConnection class190 = class190s[i_9_];
			if (class190.getIO(-775849570) != null)
			    class190.getIO(1928881032).resetByteCounts(1568830819);
		    }
		    Class117.aClass209_1552.method4166(443582742);
		    return;
		}
		if (commandString.startsWith("getclientvarpbit")) {
		    int i_10_ = Integer.parseInt(commandString.substring(17));
		    Class21.addline(new StringBuilder().append
					  ("varpbit=").append
					  (Class1.aClass19_11.getVarBitValue
					   (Class1.aClass19_11.method93(i_10_, 1156950420),
					    (short) 6617))
					  .toString(),
				      (byte) 85);
		    return;
		}
		if (commandString.startsWith("getclientvarp")) {
		    int i_11_ = Integer.parseInt(commandString.substring(14));
		    Class21.addline
			(new StringBuilder().append("varp=").append
			     (Class1.aClass19_11.getVarValueInt
			      (Class1.aClass19_11.method96((VarDomainType.PLAYER),
							   i_11_, (byte) 72),
			       -1860892041))
			     .toString(),
			 (byte) 85);
		    return;
		}
		if (commandString.startsWith("directlogin")) {
		    String[] strings
			= Class225.method4625(commandString.substring(12), ' ', 2060394738);
		    if (2 == strings.length)
			Class241_Sub11.method14943(strings[0], strings[1],
						   -1718307336);
		    return;
		}
		if (commandString.startsWith("snlogin ")) {
		    String[] strings = Class225.method4625(commandString.substring(8), ' ', 645190054);
		    int i_12_ = Integer.parseInt(strings[0]);
		    Class41.method1062(i_12_, -135174840);
		    return;
		}
		if (commandString.startsWith("setoutput ")) {
		    File file = new File(commandString.substring(10));
		    if (file.exists()) {
			file = new File(new StringBuilder().append
					    (commandString.substring(10)).append
					    (".").append
					    (Class50.method1249((byte) 1))
					    .append
					    (".log").toString());
			if (file.exists()) {
			    Class21.addline("file already exists!",
					      (byte) 85);
			    return;
			}
		    }
		    if (null != Class185.aFileOutputStream2187) {
			Class185.aFileOutputStream2187.close();
			Class185.aFileOutputStream2187 = null;
		    }
		    try {
			Class185.aFileOutputStream2187
			    = new FileOutputStream(file);
		    } catch (FileNotFoundException filenotfoundexception) {
			Class21.addline(new StringBuilder().append
					      ("Could not create ").append
					      (file.getName()).toString(),
					  (byte) 85);
		    } catch (SecurityException securityexception) {
			Class21.addline(new StringBuilder().append
					      ("Cannot write to ").append
					      (file.getName()).toString(),
					  (byte) 85);
		    }
		    return;
		}
		if (commandString.equals("closeoutput")) {
		    if (Class185.aFileOutputStream2187 != null)
			Class185.aFileOutputStream2187.close();
		    Class185.aFileOutputStream2187 = null;
		    return;
		}
		if (commandString.startsWith("runscript ")) {
		    File file = new File(commandString.substring(10));
		    if (!file.exists()) {
			Class21.addline("No such file", (byte) 85);
			return;
		    }
		    byte[] is = Class225.method4626(file, 1726661240);
		    if (null == is) {
			Class21.addline("Failed to read file", (byte) 85);
			return;
		    }
		    String[] strings
			= (Class225.method4625
			   ((Class209.method4178
			     (Class135.method3104(is, -1385171075), '\r', "",
			      1651733943)),
			    '\n', 1017826679));
		    Class436.method7797(strings, (short) -629);
		}
		if (19 == client.anInt8288 * 1766317249
		    || 1766317249 * client.anInt8288 == 2) {
		    ServerConnection conn = ClanChannelDelta.method6943(-1578041566);
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.COMMANDS_PACKET,
		    		conn.packetCipher, 16711935);
		    packet.data.writeByte(commandString.length() + 3, -1321475137);
		    packet.data.writeByte(clientCommand ? 1 : 0, 190465142);
		    packet.data.writeByte(bool_0_ ? 1 : 0, 553525512);
		    packet.data.writeString(commandString, 1470589246);
		    conn.sendPacket(packet, -1681102700);
		}
	    } catch (Exception exception) {
		Class21.addline((ClientMessage.DEBUG_CONSOLE_ERROR.getLocalisedMessage
				   (VarPlayerDomain.currentLocale, (short) 30335)),
				  (byte) 85);
		return;
	    }
	}
	if (19 != client.anInt8288 * 1766317249
	    && 2 != client.anInt8288 * 1766317249)
	    Class21.addline(new StringBuilder().append
				  (ClientMessage.DEBUG_CONSOLE_UNKNOWNCOMMAND.getLocalisedMessage
				   (VarPlayerDomain.currentLocale, (short) 30268))
				  .append
				  (commandString).toString(),
			      (byte) 85);
    }
}
