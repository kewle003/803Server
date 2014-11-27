/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class26
{
    int anInt214;
    int regionHash;//anInt215
    int anInt216;
    boolean aBool217;
    boolean aBool218;
    
    Class26() {
	/* empty */
    }
    
    static void openUID/*method945*/(int i) {
		try {
			File file = new File(Class6.homeDir, "random.dat");
			if (file.exists()) {
				GameShell3.uidDat = new Class414(new RS3File(file, "rw", 25L), 24, 0);
			} else {
				while_51_:
				for (int i_0_ = 0; i_0_ < JSFunction.historicCacheDirectories.length; i_0_++) {
					for (int i_1_ = 0; i_1_ < Class636.historicCacheLocations.length; i_1_++) {
						File file_2_
							= new File(new StringBuilder().append
								   (Class636.historicCacheLocations[i_1_])
								   .append
								   (JSFunction.historicCacheDirectories[i_0_])
								   .append
								   (File.separatorChar).append
								   ("random.dat").toString());
						if (file_2_.exists()) {
							GameShell3.uidDat = new Class414(new RS3File(file_2_, "rw", 25L), 24, 0);
							break while_51_;
						}
					}
				}
			}
			if (GameShell3.uidDat == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i_3_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_3_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				GameShell3.uidDat = new Class414(new RS3File(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
    }
    
    public static void method946(int[] is, float[] fs, float[] fs_4_, byte i) {
	Class225.method4628(is, fs, fs_4_, 0, is.length - 1, 1014325945);
    }
    
    static final void method947(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	int i_5_ = -1;
	int i_6_ = -1;
	Class118 class118
	    = class58.method1518(Class236.aClass103_2713, -405657521);
	if (class118 != null) {
	    i_5_ = class118.anInt1560 * 1403518843;
	    i_6_ = 574765281 * class118.anInt1556;
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_5_;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_6_;
    }
    
    static final void method948(ClientScriptData class454, short i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886
		  .method14116(-1579952918) ? 1 : 0;
    }
    
    static final void method949(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_7_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_8_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class455 class455;
	if (((ClientScriptData) class454).aBool6246)
	    class455 = ((ClientScriptData) class454).aClass455_6230;
	else
	    class455 = ((ClientScriptData) class454).aClass455_6229;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class455.method10558((((ClientScriptData) class454)
				    .varEntity
				    .aClass35_11437),
				   i_7_, i_8_, -1090137305) ? 1 : 0;
    }
    
    static final void getSortedMemberIndex/*method950*/(ClientScriptData scriptData, byte i) {
    	scriptData.integerStack[1482319719 * scriptData.intStackPointer - 1]
    			= scriptData.currentChannel.generateSortedList(429989872)
    				[scriptData.integerStack[1482319719 * scriptData.intStackPointer - 1]];
    }
    
    public static void method951(String string, int i) {
	if (1766317249 * client.anInt8288 == 8) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4107,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShort(0, -484048531);
	    int i_9_ = (421967667
			* class241_sub27.data.pointer);
	    class241_sub27.data.writeString(string,
								-783817784);
	    class241_sub27.data.pointer += -472333347;
	    class241_sub27.data.method14665
		(Class9.anIntArray50, i_9_,
		 421967667 * class241_sub27.data.pointer,
		 768716766);
	    class241_sub27.data.endPacketVarShort
		((421967667 * class241_sub27.data.pointer
		  - i_9_),
		 (byte) 103);
	    client.aClass190_8339.sendPacket(class241_sub27, -1837209356);
	    Class455.aClass432_6247 = Class432.aClass432_6102;
	}
    }
    
    static final void method952(ClientScriptData class454, int i) {
	int i_10_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class120_Sub15.method16788(i_10_ >> 14 & 0x3fff, i_10_ & 0x3fff,
				   (byte) 0);
    }
    
    public static int method953(Class241_Sub39_Sub11 class241_sub39_sub11,
				int i) {
	if (Class16.aBool141)
	    return 6;
	if (class241_sub39_sub11 == null)
	    return 0;
	int i_11_
	    = (-142243581
	       * ((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10879);
	if (Class62.method1618(i_11_, -1665049973))
	    return 1;
	if (Class107.method2687(i_11_, 365278659))
	    return 2;
	if (AnimationConfig.method11961(i_11_, -1069471517))
	    return 3;
	if (Class321.method5931(i_11_, (byte) 2))
	    return 4;
	if (ObjectDefinition.method11809(i_11_, 316754470))
	    return 7;
	if (i_11_ == 16)
	    return 8;
	return 5;
    }
    
    static final void method954(InterfaceComponent class58, InterfaceDefinition class35,
				ClientScriptData class454, int i) {
	class58.aBool876
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	WorldType.refreshComponent(class58, 2020747386);
    }
    
    static void initGameWorld/*method955*/(byte i) {
	if (1766317249 * client.anInt8288 == 6)
	    Class506.method11488((short) 22157);
	client.aClass190_8339.closeConnection(-1386167425);
	Class83.method1833(-1975241649);
	Class47.isWindowFocused = true;
	ClientMessage.method13510(1564992904);
	for (int i_12_ = 0; i_12_ < client.aClass192Array8301.length; i_12_++)
	    client.aClass192Array8301[i_12_] = null;
	client.aBool8544 = false;
	client.anInt8491 = ((int) (Math.random() * 100.0) - 50) * 1368877013;
	client.anInt8370 = ((int) (Math.random() * 110.0) - 55) * -334054455;
	client.anInt8521 = ((int) (Math.random() * 80.0) - 40) * 2001102403;
	client.anInt8513 = ((int) (Math.random() * 120.0) - 60) * 205222569;
	client.anInt8377 = ((int) (Math.random() * 30.0) - 20) * -415721163;
	client.aFloat8581
	    = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
	Class130.method3068(2077279836);
	for (int i_13_ = 0; i_13_ < 2048; i_13_++)
	    client.localPlayers[i_13_] = null;
	Class21.myPlayer = null;
	client.localNpcCount = 0;
	client.anInt8434 = 0;
	client.aClass407_8457.method7293(-402543790);
	client.aClass429_8478.method7652((byte) 108);
	client.aClass407_8454.method7293(-1650699889);
	client.aClass421_8376.method7521((byte) -81);
	client.aClass407_8452.method7293(-2032870847);
	WorldObject.aClass429_10039 = new NodeCollection();
	WorldObject.aClass429_10053 = new NodeCollection();
	Class563.anInt7304 = 0;
	Class473.anInt6379 = 0;
	Class434.anInt6120 = 0;
	Class53.anInt691 = 0;
	Class46.anInt625 = 0;
	Class421.anInt6040 = 0;
	Class380_Sub2.anInt10409 = 0;
	Class327.anInt5020 = 0;
	Class180.anInt2136 = 0;
	Class62.anInt1029 = 0;
	if (-1 != 1629309841 * client.anInt8466)
	    Class451.method10535(1629309841 * client.anInt8466, (byte) 62);
	for (Class241_Sub11 class241_sub11
		 = ((Class241_Sub11)
		    client.aClass407_8467.method7294(2090894173));
	     null != class241_sub11;
	     class241_sub11 = ((Class241_Sub11)
			       client.aClass407_8467.method7295(1946297218))) {
	    if (!class241_sub11.hasNext((byte) 19)) {
		class241_sub11 = (Class241_Sub11) client.aClass407_8467
						      .method7294(2090894173);
		if (class241_sub11 == null)
		    break;
	    }
	    Class40.method1047(class241_sub11, true, false, -257471535);
	}
	client.anInt8466 = -1376966001;
	client.aClass407_8467 = new HashTable(8);
	Class339.method6120(283165038);
	client.aClass58_8384 = null;
	for (int i_14_ = 0; i_14_ < 8; i_14_++) {
	    client.playerOptionMessages[i_14_] = null;
	    client.aBoolArray8450[i_14_] = false;
	    client.playerOptionCursors[i_14_] = -1;
	}
	Class540.method11933(-1515888760);
	client.aBool8540 = true;
	for (int i_15_ = 0; i_15_ < 108; i_15_++) {
	    client.aBoolArray8523[i_15_] = true;
        }
	for (int i_16_ = 0; i_16_ < 6; i_16_++) {
	    client.aClass220Array8426[i_16_] = new Class220();
        }
	client.aClass238_8477.method4833(1049635920).method11400(-912663696);
	client.aBool8392 = true;
	Class504.aShortArray6634 = ObjectDefinition.aShortArray6828
	    = NPCDefinition.aShortArray5800 = ItemDefinition.clientpalette
	    = new short[256];
	Class353.aString5444
	    = ClientMessage.WALKHERE.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 23105);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870,
	     Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869
		 .method14352((byte) -119),
	     (byte) 2);
	client.anInt8342 = 0;
	Class122.method2983(-1992872039);
	Class583.aClass468_7582 = null;
	Class593.aLong7630 = 0L;
    }
}
