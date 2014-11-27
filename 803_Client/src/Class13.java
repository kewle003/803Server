/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.URL;

public class Class13
{
    public static int anInt75;
    static final int anInt76 = 289;
    static int anInt77;
    static boolean aBool78 = false;
    static int[] anIntArray79;
    static boolean aBool80 = false;
    static int anInt81 = -1017556759;
    static long aLong82 = 7226492194362182485L;
    public static int anInt83;
    static final int anInt84 = 1;
    public static int anInt85;
    public static int anInt86;
    static final int anInt87 = 181;
    static final int anInt88 = 55;
    static final int anInt89 = 63;
    static final int anInt90 = 78;
    static final int anInt91 = 87;
    static final int anInt92 = 96;
    static boolean aBool93;
    public static int anInt94;
    static final int anInt95 = 230;
    static final int anInt96 = 138;
    static final int anInt97 = 17;
    static final int anInt98 = 155;
    static final int anInt99 = 167;
    static final int anInt100 = 178;
    static int anInt101 = 1448084985;
    static final int anInt102 = 197;
    static final int anInt103 = 141;
    static final int anInt104 = 210;
    static final int anInt105 = 226;
    static final int anInt106 = 31;
    static final int anInt107 = 244;
    static final int anInt108 = 253;
    static final int anInt109 = 267;
    public static int anInt110;
    static long aLong111 = 0L;
    public static String aString112 = "";
    public static String aString113 = "";
    public static int anInt114;
    static int anInt115;
    static final int anInt116 = 201;
    static final int anInt117 = 104;
    static final int anInt118 = 172;
    static final int anInt119 = 45;
    public static int anInt120;
    static int anInt121 = 0;
    static final int anInt122 = 114;
    public static int anInt123;
    static final int anInt124 = 4;
    static boolean hasLobby;//aBool125
    public static int anInt126;
    static final int anInt127 = 127;
    
    static boolean method605() {
	anInt77 = 78183201;
	Exception_Sub5.aClass190_10704 = client.aClass190_8340;
	if (client.aByteArray8273 != null) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(client.aByteArray8273);
	    aLong82 = (class241_sub3.readLong((short) 11908)
		       * -7226492194362182485L);
	    aLong111 = (class241_sub3.readLong((short) 13363)
			* 4049046998799193519L);
	}
	if (aLong82 * -3469600135743429117L < 0L) {
	    Class175.setLoginResponse(35, -705554080);
	    return false;
	}
	return CcDeltaNode.method15095(false, true, "", "",
					  -3469600135743429117L * aLong82);
    }
    
    static {
	anInt115 = 0;
	anInt75 = 695245318;
	anInt110 = 1937545862;
	anInt85 = -1430349054;
	anInt86 = -524501011;
	anInt120 = -1443950587;
	anInt94 = 0;
	anInt83 = -437675423;
	anInt123 = -1465399761;
	anInt114 = 0;
	hasLobby = false;
	anInt126 = 0;
	aBool93 = false;
    }
    
    static void method606() {
	if (1766317249 * client.anInt8288 == 6)
	    Class506.method11488((short) 10937);
	client.aClass190_8339.closeConnection(-66786972);
	Class83.method1833(-649752911);
	Class47.isWindowFocused = true;
	ClientMessage.method13510(1801480044);
	for (int i = 0; i < client.aClass192Array8301.length; i++)
	    client.aClass192Array8301[i] = null;
	client.aBool8544 = false;
	client.anInt8491 = ((int) (Math.random() * 100.0) - 50) * 1368877013;
	client.anInt8370 = ((int) (Math.random() * 110.0) - 55) * -334054455;
	client.anInt8521 = ((int) (Math.random() * 80.0) - 40) * 2001102403;
	client.anInt8513 = ((int) (Math.random() * 120.0) - 60) * 205222569;
	client.anInt8377 = ((int) (Math.random() * 30.0) - 20) * -415721163;
	client.aFloat8581
	    = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
	Class130.method3068(1908584211);
	for (int i = 0; i < 2048; i++)
	    client.localPlayers[i] = null;
	Class21.myPlayer = null;
	client.localNpcCount = 0;
	client.anInt8434 = 0;
	client.aClass407_8457.method7293(-382795978);
	client.aClass429_8478.method7652((byte) 23);
	client.aClass407_8454.method7293(-2084023630);
	client.aClass421_8376.method7521((byte) -83);
	client.aClass407_8452.method7293(-1664541170);
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
	    Class451.method10535(1629309841 * client.anInt8466, (byte) -96);
	for (Class241_Sub11 class241_sub11
		 = ((Class241_Sub11)
		    client.aClass407_8467.method7294(2090894173));
	     null != class241_sub11;
	     class241_sub11 = ((Class241_Sub11)
			       client.aClass407_8467.method7295(1759219664))) {
	    if (!class241_sub11.hasNext((byte) 100)) {
		class241_sub11 = (Class241_Sub11) client.aClass407_8467
						      .method7294(2090894173);
		if (class241_sub11 == null)
		    break;
	    }
	    Class40.method1047(class241_sub11, true, false, 531671484);
	}
	client.anInt8466 = -1376966001;
	client.aClass407_8467 = new HashTable(8);
	Class339.method6120(-619863428);
	client.aClass58_8384 = null;
	for (int i = 0; i < 8; i++) {
	    client.playerOptionMessages[i] = null;
	    client.aBoolArray8450[i] = false;
	    client.playerOptionCursors[i] = -1;
	}
	Class540.method11933(-988907850);
	client.aBool8540 = true;
	for (int i = 0; i < 108; i++)
	    client.aBoolArray8523[i] = true;
	for (int i = 0; i < 6; i++)
	    client.aClass220Array8426[i] = new Class220();
	client.aClass238_8477.method4833(989513940).method11400(-267140131);
	client.aBool8392 = true;
	Class504.aShortArray6634 = ObjectDefinition.aShortArray6828
	    = NPCDefinition.aShortArray5800 = ItemDefinition.clientpalette
	    = new short[256];
	Class353.aString5444
	    = ClientMessage.WALKHERE.getLocalisedMessage(VarPlayerDomain.currentLocale,
						  (short) 24302);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870,
	     Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869
		 .method14352((byte) -6),
	     (byte) 2);
	client.anInt8342 = 0;
	Class122.method2983(-2100096083);
	Class583.aClass468_7582 = null;
	Class593.aLong7630 = 0L;
    }
    
    static boolean method607(String string, String string_0_) {
	anInt77 = 1651570860;
	Exception_Sub5.aClass190_10704 = client.aClass190_8339;
	return CcDeltaNode.method15095(false, false, string, string_0_,
					  -1L);
    }
    
    static boolean method608() {
	if (null != client.aByteArray8273)
	    return Class46.method1124((byte) 109);
	if (anInt81 * 1391949991 != -1)
	    return Class322.method5953(1734886387);
	return Class565.method12433(aString112, aString113, 270315418);
    }
    
    public static final void method609() {
	anInt101 = 1448084985;
	anInt110 = 1937545862;
	anInt75 = 695245318;
    }
    
    static final void method610() {
	aLong82 = 7226492194362182485L;
	aLong111 = 0L;
	anInt81 = -1017556759;
    }
    
    static final void method611() {
	aLong82 = 7226492194362182485L;
	aLong111 = 0L;
	anInt81 = -1017556759;
    }
    
    public static final void method612() {
	if (anInt101 * 1195617353 != 1) {
	    Exception_Sub5.aClass190_10704.closeConnection(613223982);
	    Class241_Sub18_Sub1.method17144(1624381804);
	    ParamType.method13195((byte) -101);
	}
    }
    
    public static final void method613() {
	if (anInt101 * 1195617353 != 1) {
	    Exception_Sub5.aClass190_10704.closeConnection(490561998);
	    Class241_Sub18_Sub1.method17144(1624381804);
	    ParamType.method13195((byte) -114);
	}
    }
    
    public static final void method614() {
	if (anInt101 * 1195617353 != 1) {
	    Exception_Sub5.aClass190_10704.closeConnection(1430917951);
	    Class241_Sub18_Sub1.method17144(1624381804);
	    ParamType.method13195((byte) -39);
	}
    }
    
    static boolean method615(String string, String string_1_) {
	anInt77 = 78183201;
	Exception_Sub5.aClass190_10704 = client.aClass190_8340;
	return CcDeltaNode.method15095(false, false, string, string_1_,
					  -1L);
    }
    
    public static void method616(int i) {
	if (Class393.method7054(-1676741262)) {
	    if (1391949991 * anInt81 != i)
		aLong82 = 7226492194362182485L;
	    anInt81 = i * 1017556759;
	    Class496.setClientStage(12, (byte) -83);
	}
    }
    
    public static final boolean method617() {
	return 1 != anInt101 * 1195617353;
    }
    
    public static void method618() {
	if (104 == anInt101 * 1195617353)
	    anInt101 = 1872931042;
    }
    
    public static void method619(String string, String string_2_) {
	if (string.length() <= 320 && Class393.method7054(-1676741262)) {
	    Class47.method1132(-1134049181);
	    aString112 = string;
	    aString113 = string_2_;
	    Class496.setClientStage(12, (byte) -66);
	}
    }
    
    public static void method620(String string, String string_3_) {
	if (string.length() <= 320 && Class393.method7054(-1676741262)) {
	    Class47.method1132(764076460);
	    aString112 = string;
	    aString113 = string_3_;
	    Class496.setClientStage(12, (byte) -92);
	}
    }
    
    static boolean method621() {
	anInt77 = 1651570860;
	Exception_Sub5.aClass190_10704 = client.aClass190_8339;
	return CcDeltaNode.method15095((aLong82 * -3469600135743429117L
					   == -1L),
					  true, "", "",
					  aLong82 * -3469600135743429117L);
    }
    
    public static void method622(int i) {
	if (Class393.method7054(-1676741262)) {
	    if (1391949991 * anInt81 != i)
		aLong82 = 7226492194362182485L;
	    anInt81 = i * 1017556759;
	    Class496.setClientStage(12, (byte) -5);
	}
    }
    
    public static void method623(String string, String string_4_) {
	if (string.length() <= 320 && Class393.method7054(-1676741262)) {
	    client.aClass190_8339.closeConnection(2009533412);
	    Class47.method1132(-112647704);
	    aString112 = string;
	    aString113 = string_4_;
	    Class496.setClientStage(11, (byte) -47);
	}
    }
    
    public static void method624(String string, String string_5_) {
	if (string.length() <= 320 && Class393.method7054(-1676741262)) {
	    client.aClass190_8339.closeConnection(635543661);
	    Class47.method1132(-480525469);
	    aString112 = string;
	    aString113 = string_5_;
	    Class496.setClientStage(11, (byte) -32);
	}
    }
    
    public static void method625(int i) {
	if (Class393.method7054(-1676741262)) {
	    if (i != anInt81 * 1391949991)
		aLong82 = 7226492194362182485L;
	    anInt81 = i * 1017556759;
	    client.aClass190_8339.closeConnection(1785774505);
	    Class496.setClientStage(11, (byte) -75);
	}
    }
    
    public static void method626(int i) {
	if (Class393.method7054(-1676741262)) {
	    if (i != anInt81 * 1391949991)
		aLong82 = 7226492194362182485L;
	    anInt81 = i * 1017556759;
	    client.aClass190_8339.closeConnection(1881678792);
	    Class496.setClientStage(11, (byte) -13);
	}
    }
    
    public static void method627() {
	if (client.anInt8288 * 1766317249 == 2
	    && (!Class261.method5091(752265704)
		&& !Class109.method2762(576200937)))
	    Class496.setClientStage(16, (byte) -39);
    }
    
    static boolean method628() {
	if (client.aByteArray8273 != null)
	    return Class483.method11047(-178639332);
	if (anInt81 * 1391949991 != -1)
	    return Class459.method10604(1550403178);
	return Class326.method6006(aString112, aString113, 1216129818);
    }
    
    static boolean method629() {
	anInt77 = 1651570860;
	Exception_Sub5.aClass190_10704 = client.aClass190_8339;
	if (client.aByteArray8273 != null) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(client.aByteArray8273);
	    aLong82 = (class241_sub3.readLong((short) 17164)
		       * -7226492194362182485L);
	    aLong111 = (class241_sub3.readLong((short) 16109)
			* 4049046998799193519L);
	}
	if (-3469600135743429117L * aLong82 < 0L) {
	    Class175.setLoginResponse(35, -1681414655);
	    return false;
	}
	return CcDeltaNode.method15095(false, true, "", "",
					  aLong82 * -3469600135743429117L);
    }
    
    static void method630() {
	if (1766317249 * client.anInt8288 == 6)
	    Class506.method11488((short) 8633);
	client.aClass190_8339.closeConnection(-872224997);
	Class83.method1833(-1948838665);
	Class47.isWindowFocused = true;
	ClientMessage.method13510(1705599096);
	for (int i = 0; i < client.aClass192Array8301.length; i++)
	    client.aClass192Array8301[i] = null;
	client.aBool8544 = false;
	client.anInt8491 = ((int) (Math.random() * 100.0) - 50) * 1368877013;
	client.anInt8370 = ((int) (Math.random() * 110.0) - 55) * -334054455;
	client.anInt8521 = ((int) (Math.random() * 80.0) - 40) * 2001102403;
	client.anInt8513 = ((int) (Math.random() * 120.0) - 60) * 205222569;
	client.anInt8377 = ((int) (Math.random() * 30.0) - 20) * -415721163;
	client.aFloat8581
	    = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
	Class130.method3068(2045356369);
	for (int i = 0; i < 2048; i++)
	    client.localPlayers[i] = null;
	Class21.myPlayer = null;
	client.localNpcCount = 0;
	client.anInt8434 = 0;
	client.aClass407_8457.method7293(-1241904230);
	client.aClass429_8478.method7652((byte) 123);
	client.aClass407_8454.method7293(-18150766);
	client.aClass421_8376.method7521((byte) -84);
	client.aClass407_8452.method7293(-936093743);
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
	    Class451.method10535(1629309841 * client.anInt8466, (byte) -39);
	for (Class241_Sub11 class241_sub11
		 = ((Class241_Sub11)
		    client.aClass407_8467.method7294(2090894173));
	     null != class241_sub11;
	     class241_sub11 = ((Class241_Sub11)
			       client.aClass407_8467.method7295(-375413418))) {
	    if (!class241_sub11.hasNext((byte) 83)) {
		class241_sub11 = (Class241_Sub11) client.aClass407_8467
						      .method7294(2090894173);
		if (class241_sub11 == null)
		    break;
	    }
	    Class40.method1047(class241_sub11, true, false, 71117253);
	}
	client.anInt8466 = -1376966001;
	client.aClass407_8467 = new HashTable(8);
	Class339.method6120(-1180492852);
	client.aClass58_8384 = null;
	for (int i = 0; i < 8; i++) {
	    client.playerOptionMessages[i] = null;
	    client.aBoolArray8450[i] = false;
	    client.playerOptionCursors[i] = -1;
	}
	Class540.method11933(-1515905738);
	client.aBool8540 = true;
	for (int i = 0; i < 108; i++)
	    client.aBoolArray8523[i] = true;
	for (int i = 0; i < 6; i++)
	    client.aClass220Array8426[i] = new Class220();
	client.aClass238_8477.method4833(1591591913).method11400(1301588019);
	client.aBool8392 = true;
	Class504.aShortArray6634 = ObjectDefinition.aShortArray6828
	    = NPCDefinition.aShortArray5800 = ItemDefinition.clientpalette
	    = new short[256];
	Class353.aString5444
	    = ClientMessage.WALKHERE.getLocalisedMessage(VarPlayerDomain.currentLocale,
						  (short) 22509);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870,
	     Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869
		 .method14352((byte) -97),
	     (byte) 2);
	client.anInt8342 = 0;
	Class122.method2983(-1935388990);
	Class583.aClass468_7582 = null;
	Class593.aLong7630 = 0L;
    }
    
    public static final void method631() {
	if (anInt101 * 1195617353 != 1) {
	    Exception_Sub5.aClass190_10704.closeConnection(1132699852);
	    Class241_Sub18_Sub1.method17144(1624381804);
	    ParamType.method13195((byte) -70);
	}
    }
    
    static boolean method632(String string, String string_6_) {
	anInt77 = 78183201;
	Exception_Sub5.aClass190_10704 = client.aClass190_8340;
	return CcDeltaNode.method15095(false, false, string, string_6_,
					  -1L);
    }
    
    static boolean method633() {
	anInt77 = 78183201;
	Exception_Sub5.aClass190_10704 = client.aClass190_8340;
	if (client.aByteArray8273 != null) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(client.aByteArray8273);
	    aLong82 = (class241_sub3.readLong((short) 12044)
		       * -7226492194362182485L);
	    aLong111 = (class241_sub3.readLong((short) 22494)
			* 4049046998799193519L);
	}
	if (aLong82 * -3469600135743429117L < 0L) {
	    Class175.setLoginResponse(35, -1423412290);
	    return false;
	}
	return CcDeltaNode.method15095(false, true, "", "",
					  -3469600135743429117L * aLong82);
    }
    
    static RSByteBuffer method634() {
	RSByteBuffer class241_sub3 = Class577.method12684((byte) -5);
	class241_sub3.method14627(0L);
	class241_sub3.writeString(aString113, 1640376371);
	class241_sub3.method14627(-8566645190624485041L * aLong111);
	class241_sub3.method14627(client.aLong8306 * -7247048686966732057L);
	class241_sub3.applyRSA(RSAKeys.LOGIN_PUBLIC_KEY,
				  RSAKeys.LOGIN_MODULUS, (byte) -1);
	return class241_sub3;
    }
    
    static boolean method635() {
	anInt77 = 78183201;
	Exception_Sub5.aClass190_10704 = client.aClass190_8340;
	if (client.aByteArray8273 != null) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(client.aByteArray8273);
	    aLong82 = (class241_sub3.readLong((short) 17961)
		       * -7226492194362182485L);
	    aLong111 = (class241_sub3.readLong((short) 26207)
			* 4049046998799193519L);
	}
	if (aLong82 * -3469600135743429117L < 0L) {
	    Class175.setLoginResponse(35, -2032270231);
	    return false;
	}
	return CcDeltaNode.method15095(false, true, "", "",
					  -3469600135743429117L * aLong82);
    }
    
    public static void method636() {
	if (104 == anInt101 * 1195617353)
	    anInt101 = 1872931042;
    }
    
    static boolean method637() {
	anInt77 = 78183201;
	Exception_Sub5.aClass190_10704 = client.aClass190_8340;
	return CcDeltaNode.method15095((aLong82 * -3469600135743429117L
					   == -1L),
					  true, "", "",
					  -3469600135743429117L * aLong82);
    }
    
    static void method638() {
	if (Class222.method4487(1766317249 * client.anInt8288, -1968784739)) {
	    if (client.aClass190_8339.getIO(-1163288891) == null)
		Class496.setClientStage(11, (byte) -79);
	    else
		Class496.setClientStage(2, (byte) -56);
	} else if (11 == 1766317249 * client.anInt8288
		   || 12 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(17, (byte) -87);
	else if (1766317249 * client.anInt8288 == 5)
	    Class496.setClientStage(17, (byte) -78);
    }
    
    static boolean method639() {
	anInt77 = 1651570860;
	Exception_Sub5.aClass190_10704 = client.aClass190_8339;
	return CcDeltaNode.method15095((aLong82 * -3469600135743429117L
					   == -1L),
					  true, "", "",
					  aLong82 * -3469600135743429117L);
    }
    
    static boolean method640() {
	anInt77 = 1651570860;
	Exception_Sub5.aClass190_10704 = client.aClass190_8339;
	return CcDeltaNode.method15095((aLong82 * -3469600135743429117L
					   == -1L),
					  true, "", "",
					  aLong82 * -3469600135743429117L);
    }
    
    static boolean method641(boolean bool, boolean bool_7_, String string,
			     String string_8_, long l) {
	aBool80 = bool;
	if (!bool_7_)
	    anInt81 = -1017556759;
	aBool78 = bool_7_;
	aString112 = string;
	aString113 = string_8_;
	aLong82 = l * -7226492194362182485L;
	if (!aBool78 && (aString112.equals("") || aString113.equals(""))) {
	    Class175.setLoginResponse(3, -984411728);
	    ParamType.method13195((byte) -27);
	    return false;
	}
	if (-47430143 * anInt77 != 172) {
	    anInt94 = 0;
	    anInt123 = -1465399761;
	    anInt83 = -437675423;
	}
	Exception_Sub5.aClass190_10704.aBool2275 = false;
	Class175.setLoginResponse(-3, -1951025434);
	anInt101 = -1152359031;
	anInt121 = 0;
	anInt115 = 0;
	return true;
    }
    
    static final void method642() {
	if (anInt101 * 1195617353 != 1 && 104 != 1195617353 * anInt101) {
	    do {
		try {
		    int i;
		    if (0 == anInt115 * -850222383
			&& anInt101 * 1195617353 < 96)
			i = 500;
		    else
			i = 2000;
		    if (aBool80 && 1195617353 * anInt101 >= 63)
			i = 6000;
		    if ((289 == anInt77 * -47430143
			 && anInt101 * 1195617353 != 210
			 && 1572493461 * anInt110 != 42)
			|| (172 == anInt77 * -47430143
			    && -2029421995 * anInt75 != 49
			    && -2029421995 * anInt75 != 52))
			anInt121 += -897595343;
		    if (anInt121 * -1951231791 > i) {
			Exception_Sub5.aClass190_10704.closeConnection(171968669);
			if (-850222383 * anInt115 < 3) {
			    if (289 == anInt77 * -47430143)
				Class193.aClass397_2297.method7114(1451781846);
			    else
				Class609.aClass397_7759.method7114(1451781846);
			    anInt121 = 0;
			    anInt115 += 161150513;
			    anInt101 = -1152359031;
			} else {
			    anInt101 = 1448084985;
			    Class175.setLoginResponse(-5, -1636491212);
			    ParamType.method13195((byte) -59);
			    break;
			}
		    }
		    if (17 == 1195617353 * anInt101) {
			if (289 == -47430143 * anInt77)
			    Exception_Sub5.aClass190_10704.method3892
				(Class24.method928(Class193.aClass397_2297
						       .method7111(2136164110),
						   15000, (byte) 74),
				 Class193.aClass397_2297.aString5786,
				 -757543775);
			else
			    Exception_Sub5.aClass190_10704.method3892
				(Class24.method928(Class609.aClass397_7759
						       .method7111(1097745839),
						   15000, (byte) -48),
				 Class609.aClass397_7759.aString5786,
				 1305685534);
			Exception_Sub5.aClass190_10704.method3880((byte) -104);
			Class241_Sub27 class241_sub27
			    = Class475_Sub1_Sub3.method17004(969828875);
			if (aBool80) {
			    class241_sub27.data.writeByte
				((Class256.aClass256_4150.anInt4153
				  * 2087126207),
				 -2115780206);
			    class241_sub27.data
				.writeShort(0, -484048531);
			    int i_9_ = 421967667 * (class241_sub27
						    .data
						    .pointer);
			    class241_sub27.data
				.writeInt(803, 1673894691);
			    class241_sub27.data
				.writeInt(1, 125390991);
			    if (-47430143 * anInt77 == 289)
				class241_sub27.data
				    .writeByte
				    ((1766317249 * client.anInt8288 == 4 ? 1
				      : 0),
				     1506666015);
			    RSByteBuffer class241_sub3
				= Class577.method12684((byte) -96);
			    class241_sub3.writeByte(anInt81 * 1391949991,
						      -670801460);
			    class241_sub3.writeShort((int) (Math.random()
							     * 9.9999999E7),
						      -484048531);
			    class241_sub3.writeByte(VarPlayerDomain
							  .currentLocale
							  .getId((byte) 0),
						      91523063);
			    class241_sub3.writeInt((-2074968733
						       * client.anInt8270),
						      2031632618);
			    for (int i_10_ = 0; i_10_ < 6; i_10_++)
				class241_sub3.writeInt
				    ((int) (Math.random() * 9.9999999E7),
				     1002325152);
			    class241_sub3.method14627(-7247048686966732057L
						      * client.aLong8306);
			    class241_sub3.writeByte((-1202509675
						       * (client.currentGame
							  .anInt6357)),
						      -1548728226);
			    class241_sub3.writeByte((int) (Math.random()
							     * 9.9999999E7),
						      -1982334638);
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
					      .pointer) - i_9_,
				 (byte) 124);
			} else
			    class241_sub27.data.writeByte
				((2087126207
				  * Class256.aClass256_4142.anInt4153),
				 1430583534);
			Exception_Sub5.aClass190_10704
			    .sendPacket(class241_sub27, -1794676571);
			Exception_Sub5.aClass190_10704.method3894((byte) 100);
			anInt101 = 1940961575;
		    }
		    if (31 == 1195617353 * anInt101) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (2119631303).isAvailable(1, -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (-1054030431).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0, 1, 2041274546);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			int i_11_ = ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer
					.readUnsignedByte((byte) -68);
			if (0 != i_11_) {
			    anInt101 = 1448084985;
			    Class95.method2106(i_11_, (byte) 29);
			    Class175.setLoginResponse(i_11_, -257321752);
			    Exception_Sub5.aClass190_10704
				.closeConnection(-1344170712);
			    ParamType.method13195((byte) -44);
			    break;
			}
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			if (aBool80)
			    anInt101 = 739314885;
			else
			    anInt101 = 1429342111;
		    }
		    if (anInt101 * 1195617353 == 45) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (-324314573).isAvailable(2, -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (-1173415762).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0, 2, 2117010754);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = ((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer
				  .readUnsignedShort(1162222719) * -681042949;
			anInt101 = -1959704449;
		    }
		    if (anInt101 * 1195617353 == 55) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (371730725).isAvailable
			     (((((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer)
			       * 421967667),
			      -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (889293994).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0,
			     (((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.pointer) * 421967667,
			     1985811791);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer
			    .method14664(anIntArray79, -2023468398);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			String string
			    = ((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer
				  .readJagString(361534915);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			String string_12_
			    = JSFunction.aClass348_5363.getName(1792522523);
			Class16.method853(string, true, string_12_,
					  client.aBool8440, -1796196245);
			anInt101 = 1035040839;
		    }
		    if (1195617353 * anInt101 == 63) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (-1036443260).isAvailable(1, -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (-583817165).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0, 1, 2006718510);
			if (1 == ((((ServerConnection) Exception_Sub5.aClass190_10704)
				   .inputBuffer.payload[0])
				  & 0xff))
			    anInt101 = 1281479134;
		    }
		    if (78 == 1195617353 * anInt101) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (1679081676).isAvailable(16, -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (-1437879964).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0, 16, 1988129395);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 1988214704;
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer
			    .method14664(anIntArray79, -2023468398);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			aLong82 = (((ServerConnection) Exception_Sub5.aClass190_10704)
				       .inputBuffer
				       .readLong((short) 18411)
				   * -7226492194362182485L);
			aLong111 = (((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer
					.readLong((short) 3767)
				    * 4049046998799193519L);
			anInt101 = 1429342111;
		    }
		    if (1195617353 * anInt101 == 87) {
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			Exception_Sub5.aClass190_10704.method3880((byte) -20);
			Class241_Sub27 class241_sub27
			    = Class475_Sub1_Sub3.method17004(113542660);
			RSBitBuffer class241_sub3_sub1
			    = class241_sub27.data;
			if (289 == anInt77 * -47430143) {
			    Class256 class256;
			    if (aBool80)
				class256 = Class256.aClass256_4151;
			    else
				class256 = Class256.aClass256_4143;
			    class241_sub3_sub1.writeByte((class256.anInt4153
							    * 2087126207),
							   -1905036117);
			    class241_sub3_sub1.writeShort(0, -484048531);
			    int i_13_
				= class241_sub3_sub1.pointer * 421967667;
			    int i_14_
				= 421967667 * class241_sub3_sub1.pointer;
			    if (!aBool80) {
				class241_sub3_sub1.writeInt(803,
							       -1508494508);
				class241_sub3_sub1.writeInt(1, -2014647014);
				class241_sub3_sub1.writeByte
				    ((4 == 1766317249 * client.anInt8288 ? 1
				      : 0),
				     698375926);
				i_14_
				    = 421967667 * class241_sub3_sub1.pointer;
				RSByteBuffer class241_sub3
				    = Class120_Sub20.encodePasswordBlock(-1031191160);
				class241_sub3_sub1.writeBytes
				    (class241_sub3.payload, 0,
				     class241_sub3.pointer * 421967667,
				     752061035);
				i_14_
				    = 421967667 * class241_sub3_sub1.pointer;
				class241_sub3_sub1.writeByte
				    ((-1L == aLong82 * -3469600135743429117L
				      ? 1 : 0),
				     94363237);
				if (aLong82 * -3469600135743429117L == -1L)
				    class241_sub3_sub1.writeString(aString112,
								   1497277531);
				else
				    class241_sub3_sub1.method14627
					(-3469600135743429117L * aLong82);
			    }
			    class241_sub3_sub1.writeByte
				(Class474.getDisplayMode(-165466649), 660780158);
			    class241_sub3_sub1.writeShort((Class494.canvasWid
							    * -1080559003),
							   -484048531);
			    class241_sub3_sub1.writeShort((Class67.canvasHei
							    * 963058943),
							   -484048531);
			    class241_sub3_sub1.writeByte
				(Class241_Sub5_Sub9.aClass241_Sub9_11043
				     .aClass445_Sub10_8852
				     .method14189((byte) 14),
				 -1937939118);
			    Class445_Sub9.method14184(class241_sub3_sub1,
						      1997504328);
			    class241_sub3_sub1.writeString(client.aString8269,
							   -1976844379);
			    class241_sub3_sub1.writeInt((-2074968733
							    * (client
							       .anInt8270)),
							   -1748398070);
			    RSByteBuffer class241_sub3
				= Class241_Sub5_Sub9.aClass241_Sub9_11043
				      .method14910(1767706273);
			    class241_sub3_sub1.writeByte(((class241_sub3
							     .pointer)
							    * 421967667),
							   -575747722);
			    class241_sub3_sub1.writeBytes
				(class241_sub3.payload, 0,
				 421967667 * class241_sub3.pointer,
				 752061035);
			    client.aBool8297 = true;
			    RSByteBuffer class241_sub3_15_
				= (new RSByteBuffer
				   (Class6.aClass241_Sub12_38
					.method14954((byte) 1)));
			    Class6.aClass241_Sub12_38
				.method14956(class241_sub3_15_, -1424112740);
			    class241_sub3_sub1.writeBytes
				(class241_sub3_15_.payload, 0,
				 class241_sub3_15_.payload.length,
				 752061035);
			    class241_sub3_sub1.writeInt((-364544137
							    * (client
							       .anInt8342)),
							   630743910);
			    class241_sub3_sub1.writeInt((-359762931
							    * (client
							       .anInt8275)),
							   -49244757);
			    class241_sub3_sub1.writeInt((client.anInt8431
							    * -2013609075),
							   2074171839);
			    class241_sub3_sub1.writeString((Class424
							    .aString6068),
							   -1687717297);
			    class241_sub3_sub1.writeByte
				(null == client.aString8278 ? 0 : 1,
				 892541269);
			    if (client.aString8278 != null)
				class241_sub3_sub1.writeString((client
								.aString8278),
							       -1524879196);
			    class241_sub3_sub1.writeByte
				((Class120_Sub18.aClass585_10604
				      .method12840("jagtheora", (byte) 0)
				  ? 1 : 0),
				 756968502);
			    class241_sub3_sub1.writeByte((client.aBool8267
							    ? 1 : 0),
							   -512406549);
			    class241_sub3_sub1.writeByte((client.aBool8282
							    ? 1 : 0),
							   -1947637446);
			    class241_sub3_sub1.writeByte((Class95.anInt1332
							    * -2022180553),
							   693012260);
			    class241_sub3_sub1.writeInt((-296956191
							    * (client
							       .anInt8285)),
							   -1265579947);
			    class241_sub3_sub1.writeString(client.aString8286,
							   1527442440);
			    class241_sub3_sub1.writeByte
				((null == Class395.aClass397_5774
				  || ((-2019487531
				       * Class395.aClass397_5774.nodeID)
				      != -2019487531 * (Class193.aClass397_2297
							.nodeID))) ? 1 : 0,
				 286055497);
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
						-2095048303);
			    class241_sub3_sub1.method14665(anIntArray79, i_14_,
							   ((class241_sub3_sub1
							     .pointer)
							    * 421967667),
							   1086881265);
			    class241_sub3_sub1.endPacketVarShort
				((class241_sub3_sub1.pointer * 421967667
				  - i_13_),
				 (byte) 4);
			} else {
			    Class256 class256;
			    if (aBool80)
				class256 = Class256.aClass256_4151;
			    else
				class256 = Class256.aClass256_4144;
			    class241_sub3_sub1.writeByte((2087126207
							    * (class256
							       .anInt4153)),
							   -340351744);
			    class241_sub3_sub1.writeShort(0, -484048531);
			    int i_16_
				= class241_sub3_sub1.pointer * 421967667;
			    int i_17_
				= class241_sub3_sub1.pointer * 421967667;
			    if (!aBool80) {
				class241_sub3_sub1.writeInt(803, 363217001);
				class241_sub3_sub1.writeInt(1, 1534320983);
				RSByteBuffer class241_sub3
				    = Class120_Sub20.encodePasswordBlock(-502128463);
				class241_sub3_sub1.writeBytes
				    (class241_sub3.payload, 0,
				     421967667 * class241_sub3.pointer,
				     752061035);
				i_17_
				    = 421967667 * class241_sub3_sub1.pointer;
				class241_sub3_sub1.writeByte
				    ((-1L == -3469600135743429117L * aLong82
				      ? 1 : 0),
				     811264793);
				if (-3469600135743429117L * aLong82 == -1L)
				    class241_sub3_sub1.writeString(aString112,
								   1093399528);
				else
				    class241_sub3_sub1.method14627
					(-3469600135743429117L * aLong82);
			    }
			    class241_sub3_sub1.writeByte(((client
							     .currentGame
							     .anInt6357)
							    * -1202509675),
							   -1490237179);
			    class241_sub3_sub1.writeByte
				(VarPlayerDomain.currentLocale.getId((byte) 0),
				 -612555478);
			    class241_sub3_sub1.writeByte
				(Class474.getDisplayMode(1002786167), 506818300);
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
				     .method14189((byte) -16),
				 -1521797498);
			    Class445_Sub9.method14184(class241_sub3_sub1,
						      2061062169);
			    class241_sub3_sub1.writeString(client.aString8269,
							   -835299262);
			    RSByteBuffer class241_sub3
				= Class241_Sub5_Sub9.aClass241_Sub9_11043
				      .method14910(573174861);
			    class241_sub3_sub1.writeByte((421967667
							    * (class241_sub3
							       .pointer)),
							   -442110475);
			    class241_sub3_sub1.writeBytes
				(class241_sub3.payload, 0,
				 421967667 * class241_sub3.pointer,
				 752061035);
			    RSByteBuffer class241_sub3_18_
				= (new RSByteBuffer
				   (Class6.aClass241_Sub12_38
					.method14954((byte) 1)));
			    Class6.aClass241_Sub12_38
				.method14956(class241_sub3_18_, -1127263867);
			    class241_sub3_sub1.writeBytes
				(class241_sub3_18_.payload, 0,
				 class241_sub3_18_.payload.length,
				 752061035);
			    class241_sub3_sub1.writeInt((client.anInt8342
							    * -364544137),
							   -1123286589);
			    class241_sub3_sub1.writeString((Class424
							    .aString6068),
							   -1277774770);
			    class241_sub3_sub1.writeInt((client.anInt8270
							    * -2074968733),
							   1072614430);
			    class241_sub3_sub1.writeInt((client.anInt8285
							    * -296956191),
							   -583665665);
			    class241_sub3_sub1.writeString(client.aString8286,
							   -1312798735);
			    class241_sub3_sub1.writeByte((-2022180553
							    * (Class95
							       .anInt1332)),
							   -100301257);
			    Class303.method5854(class241_sub3_sub1,
						-1308013961);
			    class241_sub3_sub1.method14665
				(anIntArray79, i_17_,
				 421967667 * class241_sub3_sub1.pointer,
				 2049174713);
			    class241_sub3_sub1.endPacketVarShort
				((421967667 * class241_sub3_sub1.pointer
				  - i_16_),
				 (byte) 45);
			}
			Exception_Sub5.aClass190_10704
			    .sendPacket(class241_sub27, -1862766086);
			Exception_Sub5.aClass190_10704.method3894((byte) 100);
			Exception_Sub5.aClass190_10704.packetCipher
			    = new IsaacCipher(anIntArray79);
			for (int i_19_ = 0; i_19_ < 4; i_19_++)
			    anIntArray79[i_19_] += 50;
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .aClass418_2256
			    = new IsaacCipher(anIntArray79);
			new IsaacCipher(anIntArray79);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.setCipher
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .aClass418_2256),
			     -2061168751);
			anIntArray79 = null;
			anInt101 = 1577205088;
		    }
		    if (1195617353 * anInt101 == 96) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (1350616857).isAvailable(1, -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (-525562785).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0, 1, 2059962932);
			int i_20_ = ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer
					.readUnsignedByte((byte) 44);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			if (i_20_ == 21)
			    anInt101 = -776800633;
			else {
			    if (1 == i_20_) {
				anInt101 = 276983080;
				Class175.setLoginResponse(i_20_, -162107676);
				break;
			    }
			    if (52 == i_20_) {
				InputStream_Sub1.anInt8605
				    = -100519843 * i_20_;
				anInt101 = 849692114;
			    } else if (2 == i_20_) {
				if (aBool93) {
				    aBool93 = false;
				    anInt101 = -1152359031;
				    break;
				}
				if (289 == -47430143 * anInt77) {
				    Class473.varClientDomain
					.method16179(111753884);
				    anInt101 = 1293281045;
				} else
				    anInt101 = -1978447323;
			    } else if (i_20_ == 15) {
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .incommingPacketSize
				    = -1798937138;
				anInt101 = -992694143;
			    } else {
				if (23 == i_20_ && -850222383 * anInt115 < 3) {
				    anInt121 = 0;
				    anInt115 += 161150513;
				    anInt101 = -1152359031;
				    Exception_Sub5.aClass190_10704
					.closeConnection(231464747);
				    break;
				}
				if (42 == i_20_) {
				    anInt101 = -844831166;
				    Class175.setLoginResponse(i_20_, -796707963);
				    break;
				}
				if (172 == anInt77 * -47430143 && i_20_ == 49
				    && 1766317249 * client.anInt8288 != 5) {
				    if (-2029421995 * anInt75 != 52)
					Class175.setLoginResponse(i_20_,
							    -1964095014);
				    break;
				}
				if (aBool78 && !aBool80
				    && 1391949991 * anInt81 != -1
				    && i_20_ == 35) {
				    aBool80 = true;
				    anInt121 = 0;
				    anInt101 = -1152359031;
				    Exception_Sub5.aClass190_10704
					.closeConnection(-1068821295);
				    break;
				}
				if (53 == i_20_)
				    anInt101 = 1145418068;
				else {
				    anInt101 = 1448084985;
				    Class175.setLoginResponse(i_20_, -666901972);
				    Exception_Sub5.aClass190_10704
					.closeConnection(1348536769);
				    ParamType.method13195((byte) -26);
				    break;
				}
			    }
			}
		    }
		    if (1195617353 * anInt101 == 127) {
			if (Exception_Sub5.aClass190_10704.getIO
				(1261183031).isAvailable(1, -341343911)) {
			    Exception_Sub5.aClass190_10704.getIO
				(879817441).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 1, 2144256358);
			    int i_21_
				= ((((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.payload
				    [0])
				   & 0xff);
			    anInt94 = i_21_ * -1584407454;
			    anInt101 = 1448084985;
			    Class175.setLoginResponse(21, -523351639);
			    Exception_Sub5.aClass190_10704
				.closeConnection(106339713);
			    ParamType.method13195((byte) -4);
			}
		    } else if (210 == 1195617353 * anInt101) {
			if (Exception_Sub5.aClass190_10704.getIO
				(-974893642).isAvailable(2, -341343911)) {
			    Exception_Sub5.aClass190_10704.getIO
				(-763849523).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 2, 2119940029);
			    anInt114 = (-172763715
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
			    anInt101 = 1577205088;
			}
		    } else if (244 == 1195617353 * anInt101) {
			if (Exception_Sub5.aClass190_10704.getIO
				(-1875025420).isAvailable(4, -341343911)) {
			    Exception_Sub5.aClass190_10704.getIO
				(1646047680).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 4, 2109754465);
			    anInt126
				= ((ServerConnection) Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .readInt((byte) 10) * 1750668871;
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer
				= 0;
			    anInt101 = 1448084985;
			    Class175.setLoginResponse(53, -71649278);
			    Exception_Sub5.aClass190_10704
				.closeConnection(-846133803);
			    ParamType.method13195((byte) -80);
			}
		    } else if (anInt101 * 1195617353 == 197) {
			if (-1010359307 * InputStream_Sub1.anInt8605 == 29) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (1856281648).isAvailable(1, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(2078981026).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 1, 2087652094);
			    anInt123
				= ((((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.payload
				    [0])
				   & 0xff) * 1465399761;
			} else if (45 == (InputStream_Sub1.anInt8605
					  * -1010359307)) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (1296479646).isAvailable(3, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(-1357082062).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 3, 2049437130);
			    anInt123
				= ((((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.payload
				    [0])
				   & 0xff) * 1465399761;
			    anInt83 = ((((((ServerConnection)
					   Exception_Sub5.aClass190_10704)
					  .inputBuffer
					  .payload[1])
					 & 0xff)
					<< 8)
				       + ((((ServerConnection)
					    Exception_Sub5.aClass190_10704)
					   .inputBuffer
					   .payload[2])
					  & 0xff)) * 437675423;
			} else
			    throw new IllegalStateException();
			anInt101 = 1448084985;
			Class175.setLoginResponse((-1010359307
					     * InputStream_Sub1.anInt8605),
					    36836528);
			Exception_Sub5.aClass190_10704.closeConnection(526312482);
			ParamType.method13195((byte) -12);
		    } else if (226 == anInt101 * 1195617353) {
			if (Exception_Sub5.aClass190_10704.getIO
				(-961286291).isAvailable(2, -341343911)) {
			    Exception_Sub5.aClass190_10704.getIO
				(-1452349543).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 2, 1980400945);
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
			    anInt101 = -1947902538;
			}
		    } else if (1195617353 * anInt101 == 230) {
			if (Exception_Sub5.aClass190_10704.getIO
				(-792923678).isAvailable
			    (Class351.anInt5426 * 293638721, -341343911)) {
			    Exception_Sub5.aClass190_10704.getIO
				(-1536205319).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, Class351.anInt5426 * 293638721,
				 2076233829);
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer
				= 0;
			    byte[] is
				= new byte[293638721 * Class351.anInt5426 + 1];
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.readEncodeBytes
				(is, 0, Class351.anInt5426 * 293638721,
				 -881638046);
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer
				= 0;
			    RSByteBuffer class241_sub3
				= new RSByteBuffer(is);
			    String string
				= class241_sub3.readString(1637618082);
			    Class446.method7895(string, true, client.aBool8440,
						-1815142638);
			    Class175.setLoginResponse((-1010359307
						 * InputStream_Sub1.anInt8605),
						-1320144946);
			    if (anInt77 * -47430143 == 172
				&& 5 != client.anInt8288 * 1766317249)
				anInt101 = 1577205088;
			    else {
				anInt101 = 1448084985;
				Exception_Sub5.aClass190_10704
				    .closeConnection(119776967);
				ParamType.method13195((byte) -103);
			    }
			}
		    } else {
			if (253 == 1195617353 * anInt101) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (-190542752).isAvailable(2, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(-1453003270).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 2, 2098333788);
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer
				= 0;
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.incommingPacketSize
				= ((ServerConnection) Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .readUnsignedShort(1162222719) * -1248015079;
			    anInt101 = 91634355;
			}
			if (267 == anInt101 * 1195617353) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (-210540931).isAvailable
				 (1912225577 * (((ServerConnection) (Exception_Sub5
							     .aClass190_10704))
						.incommingPacketSize),
				  -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(-494000541).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0,
				 1912225577 * (((ServerConnection)
						Exception_Sub5.aClass190_10704)
					       .incommingPacketSize),
				 2003070472);
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer
				= 0;
			    boolean bool
				= (((ServerConnection) Exception_Sub5.aClass190_10704)
				       .inputBuffer
				       .readUnsignedByte((byte) -56)
				   == 1);
			    while (421967667 * (((ServerConnection) (Exception_Sub5
							     .aClass190_10704))
						.inputBuffer
						.pointer)
				   < (((ServerConnection) (Exception_Sub5
						   .aClass190_10704)).incommingPacketSize
				      * 1912225577)) {
				Class254 class254
				    = (Class463.VAR_CLIENT_LIST
					   .decodeVarValue
				       ((((ServerConnection)
					  Exception_Sub5.aClass190_10704)
					 .inputBuffer),
					(byte) 104));
				Class473.varClientDomain
				    .varValues.method335
				    (class254.key * 623518843,
				     class254.value, (byte) 71);
			    }
			    if (bool) {
				Class241_Sub27 class241_sub27
				    = Class475_Sub1_Sub3
					  .method17004(-1907486499);
				RSBitBuffer class241_sub3_sub1
				    = class241_sub27.data;
				class241_sub3_sub1.writeByte
				    ((2087126207
				      * Class256.aClass256_4152.anInt4153),
				     -459264298);
				Exception_Sub5.aClass190_10704
				    .sendPacket(class241_sub27, -2110811157);
				Exception_Sub5.aClass190_10704
				    .method3894((byte) 100);
				anInt101 = -2027734982;
			    } else
				anInt101 = 1293281045;
			}
			if (anInt101 * 1195617353 == 138) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (-1661226482).isAvailable(1, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(-157690722).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 1, 2015776639);
			    int i_22_
				= ((((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.payload
				    [0])
				   & 0xff);
			    if (2 != i_22_) {
				if (i_22_ == 29 || i_22_ == 45) {
				    InputStream_Sub1.anInt8605
					= -100519843 * i_22_;
				    anInt101 = 1804900509;
				} else {
				    anInt101 = 1448084985;
				    Class175.setLoginResponse(i_22_, -2004255387);
				    Exception_Sub5.aClass190_10704
					.closeConnection(658473070);
				    ParamType.method13195((byte) -108);
				    break;
				}
				break;
			    }
			    anInt101 = -1978447323;
			}
			if (1195617353 * anInt101 == 141) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (-2132021702).isAvailable(1, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(-889739694).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 1, 2012139370);
			    Class384.anInt5702
				= 112037823 * ((((ServerConnection) (Exception_Sub5
							     .aClass190_10704))
						.inputBuffer
						.payload[0])
					       & 0xff);
			    anInt101 = 1114873283;
			}
			if (155 == 1195617353 * anInt101) {
			    RSBitBuffer class241_sub3_sub1
				= (((ServerConnection) Exception_Sub5.aClass190_10704)
				   .inputBuffer);
			    if (289 == anInt77 * -47430143) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (-1640969334).isAvailable
				     (Class384.anInt5702 * -752984001,
				      -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (199709676).read
				    (class241_sub3_sub1.payload, 0,
				     -752984001 * Class384.anInt5702,
				     2067552880);
				class241_sub3_sub1.pointer = 0;
				client.playerRights
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 48) * -562486153;
				client.anInt8508 = (class241_sub3_sub1
							.readUnsignedByte((byte) 14)
						    * -2064149665);
				client.aBool8441
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -78) == 1;
				client.aBool8442
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 17) == 1;
				client.aBool8443
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 67) == 1;
				client.isQcWorld
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 45) == 1;
				client.myPlayerIndex
				    = (class241_sub3_sub1
					   .readUnsignedShort(1162222719)
				       * -738519175);
				client.isP2pAccount
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 13) == 1;
				Class203.anInt2425
				    = class241_sub3_sub1
					  .method14643((byte) 67) * 1122928185;
				client.isP2pWorld
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -7) == 1;
				Class120_Sub22.aString10627
				    = class241_sub3_sub1.readString(2357897);
				client.aClass238_8477.getObjectLoader
				    (-1975068661)
				    .method11851(client.isP2pWorld, 1089105586);
				Class277.aClass236_4389.method4706
				    (988109348).getObjectLoader
				    (-2122542027)
				    .method11851(client.isP2pWorld, 1089105586);
				JS5.itemDefLoader
				    .setAllowMembers(client.isP2pWorld, (byte) 32);
				MasterIndex.npcDefLoader.method7227
				    (client.isP2pWorld, (short) 19490);
			    } else {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (-19447561).isAvailable
				     (Class384.anInt5702 * -752984001,
				      -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (386262070).read
				    (class241_sub3_sub1.payload, 0,
				     -752984001 * Class384.anInt5702,
				     2140905301);
				class241_sub3_sub1.pointer = 0;
				client.playerRights
				    = (class241_sub3_sub1
					   .readUnsignedByte((byte) -18)
				       * -562486153);
				client.anInt8508 = (class241_sub3_sub1
							.readUnsignedByte((byte) -8)
						    * -2064149665);
				client.aBool8441
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -78) == 1;
				Class203.anInt2425
				    = (class241_sub3_sub1
					   .method14643((byte) -73)
				       * 1122928185);
				Class21.myPlayer
				    .gender
				    = (byte) class241_sub3_sub1
						 .readUnsignedByte((byte) 21);
				client.aBool8442
				    = (class241_sub3_sub1.readUnsignedByte((byte) 7)
				       == 1);
				client.aBool8443
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 40) == 1;
				Class541.aLong7009
				    = (class241_sub3_sub1
					   .readLong((short) 11154)
				       * 7560864676624469187L);
				Class209_Sub1.aLong10285
				    = (((6353119288506319851L
					 * Class541.aLong7009)
					- Class50.method1249((byte) 1)
					- class241_sub3_sub1
					      .method14729((byte) -109))
				       * -7079703363933644479L);
				int i_23_ = class241_sub3_sub1
						.readUnsignedByte((byte) 56);
				client.isP2pAccount = (i_23_ & 0x1) != 0;
				Class599.aBool7714 = 0 != (i_23_ & 0x2);
				Class249.anInt3998
				    = class241_sub3_sub1
					  .readInt((byte) 92) * 416479871;
				Class111.anInt1513
				    = class241_sub3_sub1
					  .readInt((byte) 53) * 1711374871;
				ParamType.anInt7740
				    = (class241_sub3_sub1
					   .readUnsignedShort(1162222719)
				       * -2120604853);
				Class10.anInt68 = (class241_sub3_sub1
						       .readUnsignedShort(1162222719)
						   * -522392027);
				Class120.anInt1566
				    = (class241_sub3_sub1
					   .readUnsignedShort(1162222719)
				       * 1781214315);
				Class539.anInt7001
				    = (class241_sub3_sub1
					   .readInt((byte) 123)
				       * 1625681393);
				Class621.aClass4_7876
				    = new Class4(-970497263
						 * Class539.anInt7001);
				new Thread(Class621.aClass4_7876).start();
				Class187.anInt2205
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -18) * 405558217;
				Class219.anInt2559
				    = class241_sub3_sub1
					  .readUnsignedShort(1162222719) * 53778005;
				ClientScriptCaller.anInt8978
				    = (class241_sub3_sub1
					   .readUnsignedShort(1162222719)
				       * -624416675);
				Class167.aBool2063
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 57) == 1;
				Class21.myPlayer
				    .nameUnfiltered
				    = Class21
					  .myPlayer
					  .nameFiltered
				    = RuntimeException_Sub3.myPlayerDisplayName
				    = class241_sub3_sub1
					  .readJagString(2046222856);
				Class417.anInt6018
				    = (class241_sub3_sub1
					   .readUnsignedByte((byte) -28)
				       * 1638451587);
				Class77.anInt1131
				    = class241_sub3_sub1
					  .readInt((byte) 81) * 188343509;
				Class395.aClass397_5774 = new Server();
				Class395.aClass397_5774.nodeID
				    = (class241_sub3_sub1
					   .readUnsignedShort(1162222719)
				       * 1167304829);
				if ((-2019487531
				     * Class395.aClass397_5774.nodeID)
				    == 65535)
				    Class395.aClass397_5774.nodeID
					= -1167304829;
				Class395.aClass397_5774.aString5786
				    = class241_sub3_sub1
					  .readJagString(-1582586467);
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
					(Class395.aClass397_5777, (byte) 100)))
				    ClientScriptCaller.method14987((byte) -91);
			    }
			    if (client.aBool8441 && !client.aBool8443
				|| client.isP2pAccount) {
				try {
				    Class396.callNoParamater(Class421.gameApplet,
							"zap", (byte) -60);
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
							"unzap", (byte) -15);
				} catch (Throwable throwable) {
				    /* empty */
				}
			    }
			    if (Class416.aClass470_6012
				== Class470.aClass470_6345)
				JSFunction.aClass348_5364.method6212((byte) 0);
			    if (289 == -47430143 * anInt77)
				anInt101 = 61089570;
			    else {
				anInt101 = 1448084985;
				Class175.setLoginResponse(2, -62580778);
				Class639.method13607(-470484636);
				Class496.setClientStage(2, (byte) -99);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .currentPacket
				    = null;
				break;
			    }
			}
			if (1195617353 * anInt101 == 178) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (111206907).isAvailable(3, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(-2021549857).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 3, 2110063244);
			    anInt101 = 110377229;
			}
			if (anInt101 * 1195617353 == 181) {
			    RSBitBuffer class241_sub3_sub1
				= (((ServerConnection) Exception_Sub5.aClass190_10704)
				   .inputBuffer);
			    class241_sub3_sub1.pointer = 0;
			    if (class241_sub3_sub1.method17041(1388660706)) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (-242383456)
					 .isAvailable(1, -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (1662391312).read
				    (class241_sub3_sub1.payload, 3, 1,
				     1963258336);
			    }
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.currentPacket
				= (Class452.method10546((byte) -114)
				   [class241_sub3_sub1
					.readPacketOpcode(1478048978)]);
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.incommingPacketSize
				= (class241_sub3_sub1.readUnsignedShort(1162222719)
				   * -1248015079);
			    anInt101 = 1312023919;
			}
			if (anInt101 * 1195617353 == 167) {
			    if (Exception_Sub5.aClass190_10704.getIO
				    (1992183443).isAvailable
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .incommingPacketSize) * 1912225577,
				 -341343911)) {
				Exception_Sub5.aClass190_10704.getIO
				    (226182908).read
				    ((((ServerConnection)
				       Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .payload),
				     0,
				     (((ServerConnection) (Exception_Sub5
						   .aClass190_10704)).incommingPacketSize
				      * 1912225577),
				     1980063063);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				int i_24_ = (1912225577
					     * (((ServerConnection) (Exception_Sub5
							     .aClass190_10704))
						.incommingPacketSize));
				anInt101 = 1448084985;
				Class175.setLoginResponse(2, -774733965);
				Class26.initGameWorld((byte) -58);
				Class25.decodePlayerInit((((ServerConnection)
						    (Exception_Sub5
						     .aClass190_10704))
						   .inputBuffer),
						  (byte) 23);
				int i_25_
				    = (i_24_
				       - (421967667
					  * (((ServerConnection)
					      Exception_Sub5.aClass190_10704)
					     .inputBuffer
					     .pointer)));
				RSBitBuffer class241_sub3_sub1
				    = new RSBitBuffer(i_25_);
				System.arraycopy
				    ((((ServerConnection)
				       Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .payload),
				     ((((ServerConnection)
					Exception_Sub5.aClass190_10704)
				       .inputBuffer.pointer)
				      * 421967667),
				     class241_sub3_sub1.payload, 0,
				     i_25_);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    += i_25_ * -681042949;
				if ((((ServerConnection)
				      Exception_Sub5.aClass190_10704)
				     .currentPacket)
				    == IncommingOpcode.DYNAMIC_MAP_REGION_PACKET)
				    client.aClass238_8477.setMapScene
					(new Class234(MapType.aClass235_2703,
						      class241_sub3_sub1),
					 2141454649);
				else
				    client.aClass238_8477.setMapScene
					(new Class234(MapType.STATIC_MAP,
						      class241_sub3_sub1),
					 1764094078);
				if ((421967667
				     * (((ServerConnection)
					 Exception_Sub5.aClass190_10704)
					.inputBuffer.pointer))
				    != i_24_)
				    throw new RuntimeException
					      (new StringBuilder().append
						   ((((ServerConnection)
						      (Exception_Sub5
						       .aClass190_10704))
						     .inputBuffer
						     .pointer) * 421967667)
						   .append
						   (" ").append
						   (i_24_).toString());
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .currentPacket
				    = null;
			    }
			} else {
			    if (201 != 1195617353 * anInt101)
				break;
			    if ((((ServerConnection) Exception_Sub5.aClass190_10704)
				 .incommingPacketSize) * 1912225577
				== -2) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (-1404623822)
					 .isAvailable(2, -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (-1911899793).read
				    ((((ServerConnection)
				       Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .payload),
				     0, 2, 2029213285);
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
				    (583314585).isAvailable
				(1912225577 * (((ServerConnection)
						Exception_Sub5.aClass190_10704)
					       .incommingPacketSize),
				 -341343911)) {
				Exception_Sub5.aClass190_10704.getIO
				    (-1039680931).read
				    ((((ServerConnection)
				       Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .payload),
				     0,
				     (((ServerConnection) (Exception_Sub5
						   .aClass190_10704)).incommingPacketSize
				      * 1912225577),
				     2067821994);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				int i_26_ = ((((ServerConnection)
					       Exception_Sub5.aClass190_10704)
					      .incommingPacketSize)
					     * 1912225577);
				anInt101 = 1448084985;
				Class175.setLoginResponse(15, -1588930954);
				Class589.method12906(-1080023436);
				Class25.decodePlayerInit((((ServerConnection)
						    (Exception_Sub5
						     .aClass190_10704))
						   .inputBuffer),
						  (byte) 117);
				if (((((ServerConnection)
				       Exception_Sub5.aClass190_10704)
				      .inputBuffer.pointer)
				     * 421967667)
				    != i_26_)
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
						   (i_26_).toString());
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .currentPacket
				    = null;
			    }
			}
		    }
		} catch (IOException ioexception) {
		    Exception_Sub5.aClass190_10704.closeConnection(-545256355);
		    if (-850222383 * anInt115 < 3) {
			if (289 == anInt77 * -47430143)
			    Class193.aClass397_2297.method7114(1451781846);
			else
			    Class609.aClass397_7759.method7114(1451781846);
			anInt121 = 0;
			anInt115 += 161150513;
			anInt101 = -1152359031;
		    } else {
			anInt101 = 1448084985;
			Class175.setLoginResponse(-4, -1495427673);
			ParamType.method13195((byte) -58);
		    }
		    break;
		}
		break;
	    } while (false);
	}
    }
    
    static final void method643() {
	if (anInt101 * 1195617353 != 1 && 104 != 1195617353 * anInt101) {
	    do {
		try {
		    int i;
		    if (0 == anInt115 * -850222383
			&& anInt101 * 1195617353 < 96)
			i = 500;
		    else
			i = 2000;
		    if (aBool80 && 1195617353 * anInt101 >= 63)
			i = 6000;
		    if ((289 == anInt77 * -47430143
			 && anInt101 * 1195617353 != 210
			 && 1572493461 * anInt110 != 42)
			|| (172 == anInt77 * -47430143
			    && -2029421995 * anInt75 != 49
			    && -2029421995 * anInt75 != 52))
			anInt121 += -897595343;
		    if (anInt121 * -1951231791 > i) {
			Exception_Sub5.aClass190_10704.closeConnection(-142858781);
			if (-850222383 * anInt115 < 3) {
			    if (289 == anInt77 * -47430143)
				Class193.aClass397_2297.method7114(1451781846);
			    else
				Class609.aClass397_7759.method7114(1451781846);
			    anInt121 = 0;
			    anInt115 += 161150513;
			    anInt101 = -1152359031;
			} else {
			    anInt101 = 1448084985;
			    Class175.setLoginResponse(-5, -763842934);
			    ParamType.method13195((byte) -110);
			    break;
			}
		    }
		    if (17 == 1195617353 * anInt101) {
			if (289 == -47430143 * anInt77)
			    Exception_Sub5.aClass190_10704.method3892
				(Class24.method928(Class193.aClass397_2297
						       .method7111(392987245),
						   15000, (byte) -70),
				 Class193.aClass397_2297.aString5786,
				 -2111136375);
			else
			    Exception_Sub5.aClass190_10704.method3892
				(Class24.method928(Class609.aClass397_7759
						       .method7111(-894356280),
						   15000, (byte) 64),
				 Class609.aClass397_7759.aString5786,
				 824299604);
			Exception_Sub5.aClass190_10704.method3880((byte) 35);
			Class241_Sub27 class241_sub27
			    = Class475_Sub1_Sub3.method17004(-564671028);
			if (aBool80) {
			    class241_sub27.data.writeByte
				((Class256.aClass256_4150.anInt4153
				  * 2087126207),
				 1620724130);
			    class241_sub27.data
				.writeShort(0, -484048531);
			    int i_27_ = 421967667 * (class241_sub27
						     .data
						     .pointer);
			    class241_sub27.data
				.writeInt(803, 1633987052);
			    class241_sub27.data
				.writeInt(1, 1844653167);
			    if (-47430143 * anInt77 == 289)
				class241_sub27.data
				    .writeByte
				    ((1766317249 * client.anInt8288 == 4 ? 1
				      : 0),
				     1345395746);
			    RSByteBuffer class241_sub3
				= Class577.method12684((byte) -36);
			    class241_sub3.writeByte(anInt81 * 1391949991,
						      -464218869);
			    class241_sub3.writeShort((int) (Math.random()
							     * 9.9999999E7),
						      -484048531);
			    class241_sub3.writeByte(VarPlayerDomain
							  .currentLocale
							  .getId((byte) 0),
						      -1455947009);
			    class241_sub3.writeInt((-2074968733
						       * client.anInt8270),
						      465804204);
			    for (int i_28_ = 0; i_28_ < 6; i_28_++)
				class241_sub3.writeInt
				    ((int) (Math.random() * 9.9999999E7),
				     1651561652);
			    class241_sub3.method14627(-7247048686966732057L
						      * client.aLong8306);
			    class241_sub3.writeByte((-1202509675
						       * (client.currentGame
							  .anInt6357)),
						      636880609);
			    class241_sub3.writeByte((int) (Math.random()
							     * 9.9999999E7),
						      946298948);
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
					      .pointer) - i_27_,
				 (byte) 28);
			} else
			    class241_sub27.data.writeByte
				((2087126207
				  * Class256.aClass256_4142.anInt4153),
				 1154657558);
			Exception_Sub5.aClass190_10704
			    .sendPacket(class241_sub27, -1785558667);
			Exception_Sub5.aClass190_10704.method3894((byte) 100);
			anInt101 = 1940961575;
		    }
		    if (31 == 1195617353 * anInt101) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (-857876552).isAvailable(1, -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (-969930379).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0, 1, 2113296238);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			int i_29_ = ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer
					.readUnsignedByte((byte) -78);
			if (0 != i_29_) {
			    anInt101 = 1448084985;
			    Class95.method2106(i_29_, (byte) 11);
			    Class175.setLoginResponse(i_29_, -797187395);
			    Exception_Sub5.aClass190_10704
				.closeConnection(1149949401);
			    ParamType.method13195((byte) 3);
			    break;
			}
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			if (aBool80)
			    anInt101 = 739314885;
			else
			    anInt101 = 1429342111;
		    }
		    if (anInt101 * 1195617353 == 45) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (-935785632).isAvailable(2, -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (-1123841619).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0, 2, 2117636491);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = ((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer
				  .readUnsignedShort(1162222719) * -681042949;
			anInt101 = -1959704449;
		    }
		    if (anInt101 * 1195617353 == 55) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (-1277296560).isAvailable
			     (((((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer)
			       * 421967667),
			      -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (898272467).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0,
			     (((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.pointer) * 421967667,
			     2070724247);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer
			    .method14664(anIntArray79, -2023468398);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			String string
			    = ((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer
				  .readJagString(685045733);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			String string_30_
			    = JSFunction.aClass348_5363.getName(1834317169);
			Class16.method853(string, true, string_30_,
					  client.aBool8440, -1796196245);
			anInt101 = 1035040839;
		    }
		    if (1195617353 * anInt101 == 63) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (746479692).isAvailable(1, -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (-2125772767).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0, 1, 2036976635);
			if (1 == ((((ServerConnection) Exception_Sub5.aClass190_10704)
				   .inputBuffer.payload[0])
				  & 0xff))
			    anInt101 = 1281479134;
		    }
		    if (78 == 1195617353 * anInt101) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (-1699728089).isAvailable(16, -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (2023227849).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0, 16, 2039539681);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 1988214704;
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer
			    .method14664(anIntArray79, -2023468398);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			aLong82 = (((ServerConnection) Exception_Sub5.aClass190_10704)
				       .inputBuffer
				       .readLong((short) 23082)
				   * -7226492194362182485L);
			aLong111 = (((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer
					.readLong((short) 31175)
				    * 4049046998799193519L);
			anInt101 = 1429342111;
		    }
		    if (1195617353 * anInt101 == 87) {
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			Exception_Sub5.aClass190_10704.method3880((byte) 63);
			Class241_Sub27 class241_sub27
			    = Class475_Sub1_Sub3.method17004(-889016177);
			RSBitBuffer class241_sub3_sub1
			    = class241_sub27.data;
			if (289 == anInt77 * -47430143) {
			    Class256 class256;
			    if (aBool80)
				class256 = Class256.aClass256_4151;
			    else
				class256 = Class256.aClass256_4143;
			    class241_sub3_sub1.writeByte((class256.anInt4153
							    * 2087126207),
							   -1546729544);
			    class241_sub3_sub1.writeShort(0, -484048531);
			    int i_31_
				= class241_sub3_sub1.pointer * 421967667;
			    int i_32_
				= 421967667 * class241_sub3_sub1.pointer;
			    if (!aBool80) {
				class241_sub3_sub1.writeInt(803, 384896468);
				class241_sub3_sub1.writeInt(1, -463925718);
				class241_sub3_sub1.writeByte
				    ((4 == 1766317249 * client.anInt8288 ? 1
				      : 0),
				     -847129325);
				i_32_
				    = 421967667 * class241_sub3_sub1.pointer;
				RSByteBuffer class241_sub3
				    = Class120_Sub20.encodePasswordBlock(-541651713);
				class241_sub3_sub1.writeBytes
				    (class241_sub3.payload, 0,
				     class241_sub3.pointer * 421967667,
				     752061035);
				i_32_
				    = 421967667 * class241_sub3_sub1.pointer;
				class241_sub3_sub1.writeByte
				    ((-1L == aLong82 * -3469600135743429117L
				      ? 1 : 0),
				     1606775245);
				if (aLong82 * -3469600135743429117L == -1L)
				    class241_sub3_sub1
					.writeString(aString112, -1226173188);
				else
				    class241_sub3_sub1.method14627
					(-3469600135743429117L * aLong82);
			    }
			    class241_sub3_sub1.writeByte
				(Class474.getDisplayMode(1641497494),
				 -2039679224);
			    class241_sub3_sub1.writeShort((Class494.canvasWid
							    * -1080559003),
							   -484048531);
			    class241_sub3_sub1.writeShort((Class67.canvasHei
							    * 963058943),
							   -484048531);
			    class241_sub3_sub1.writeByte
				(Class241_Sub5_Sub9.aClass241_Sub9_11043
				     .aClass445_Sub10_8852
				     .method14189((byte) -94),
				 -246243997);
			    Class445_Sub9.method14184(class241_sub3_sub1,
						      1898845393);
			    class241_sub3_sub1.writeString(client.aString8269,
							   1380839976);
			    class241_sub3_sub1.writeInt((-2074968733
							    * (client
							       .anInt8270)),
							   -1625282678);
			    RSByteBuffer class241_sub3
				= Class241_Sub5_Sub9.aClass241_Sub9_11043
				      .method14910(1956407391);
			    class241_sub3_sub1.writeByte(((class241_sub3
							     .pointer)
							    * 421967667),
							   -1962305229);
			    class241_sub3_sub1.writeBytes
				(class241_sub3.payload, 0,
				 421967667 * class241_sub3.pointer,
				 752061035);
			    client.aBool8297 = true;
			    RSByteBuffer class241_sub3_33_
				= (new RSByteBuffer
				   (Class6.aClass241_Sub12_38
					.method14954((byte) 1)));
			    Class6.aClass241_Sub12_38
				.method14956(class241_sub3_33_, 2046633034);
			    class241_sub3_sub1.writeBytes
				(class241_sub3_33_.payload, 0,
				 class241_sub3_33_.payload.length,
				 752061035);
			    class241_sub3_sub1.writeInt((-364544137
							    * (client
							       .anInt8342)),
							   -669051253);
			    class241_sub3_sub1.writeInt((-359762931
							    * (client
							       .anInt8275)),
							   -70347442);
			    class241_sub3_sub1.writeInt((client.anInt8431
							    * -2013609075),
							   1480967759);
			    class241_sub3_sub1
				.writeString(Class424.aString6068, 824530070);
			    class241_sub3_sub1.writeByte
				(null == client.aString8278 ? 0 : 1,
				 -423506428);
			    if (client.aString8278 != null)
				class241_sub3_sub1
				    .writeString(client.aString8278, 45504220);
			    class241_sub3_sub1.writeByte
				((Class120_Sub18.aClass585_10604
				      .method12840("jagtheora", (byte) 0)
				  ? 1 : 0),
				 1212176789);
			    class241_sub3_sub1.writeByte((client.aBool8267
							    ? 1 : 0),
							   -1049140477);
			    class241_sub3_sub1.writeByte((client.aBool8282
							    ? 1 : 0),
							   -543352562);
			    class241_sub3_sub1.writeByte((Class95.anInt1332
							    * -2022180553),
							   -1969937266);
			    class241_sub3_sub1.writeInt((-296956191
							    * (client
							       .anInt8285)),
							   1175282065);
			    class241_sub3_sub1.writeString(client.aString8286,
							   -735213871);
			    class241_sub3_sub1.writeByte
				((null == Class395.aClass397_5774
				  || ((-2019487531
				       * Class395.aClass397_5774.nodeID)
				      != -2019487531 * (Class193.aClass397_2297
							.nodeID))) ? 1 : 0,
				 -1333856051);
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
			    Class303.method5854(class241_sub3_sub1, 87275216);
			    class241_sub3_sub1.method14665(anIntArray79, i_32_,
							   ((class241_sub3_sub1
							     .pointer)
							    * 421967667),
							   389082006);
			    class241_sub3_sub1.endPacketVarShort
				((class241_sub3_sub1.pointer * 421967667
				  - i_31_),
				 (byte) 124);
			} else {
			    Class256 class256;
			    if (aBool80)
				class256 = Class256.aClass256_4151;
			    else
				class256 = Class256.aClass256_4144;
			    class241_sub3_sub1.writeByte((2087126207
							    * (class256
							       .anInt4153)),
							   289229287);
			    class241_sub3_sub1.writeShort(0, -484048531);
			    int i_34_
				= class241_sub3_sub1.pointer * 421967667;
			    int i_35_
				= class241_sub3_sub1.pointer * 421967667;
			    if (!aBool80) {
				class241_sub3_sub1.writeInt(803,
							       1238567874);
				class241_sub3_sub1.writeInt(1, 1714296527);
				RSByteBuffer class241_sub3
				    = Class120_Sub20.encodePasswordBlock(-1261399427);
				class241_sub3_sub1.writeBytes
				    (class241_sub3.payload, 0,
				     421967667 * class241_sub3.pointer,
				     752061035);
				i_35_
				    = 421967667 * class241_sub3_sub1.pointer;
				class241_sub3_sub1.writeByte
				    ((-1L == -3469600135743429117L * aLong82
				      ? 1 : 0),
				     -1354231511);
				if (-3469600135743429117L * aLong82 == -1L)
				    class241_sub3_sub1
					.writeString(aString112, -1545610294);
				else
				    class241_sub3_sub1.method14627
					(-3469600135743429117L * aLong82);
			    }
			    class241_sub3_sub1.writeByte(((client
							     .currentGame
							     .anInt6357)
							    * -1202509675),
							   1061979535);
			    class241_sub3_sub1.writeByte
				(VarPlayerDomain.currentLocale.getId((byte) 0),
				 1364498527);
			    class241_sub3_sub1.writeByte
				(Class474.getDisplayMode(159909680), -862150698);
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
				     .method14189((byte) 66),
				 1189978030);
			    Class445_Sub9.method14184(class241_sub3_sub1,
						      1937035313);
			    class241_sub3_sub1.writeString(client.aString8269,
							   -1424602303);
			    RSByteBuffer class241_sub3
				= Class241_Sub5_Sub9.aClass241_Sub9_11043
				      .method14910(1522744028);
			    class241_sub3_sub1.writeByte((421967667
							    * (class241_sub3
							       .pointer)),
							   106698712);
			    class241_sub3_sub1.writeBytes
				(class241_sub3.payload, 0,
				 421967667 * class241_sub3.pointer,
				 752061035);
			    RSByteBuffer class241_sub3_36_
				= (new RSByteBuffer
				   (Class6.aClass241_Sub12_38
					.method14954((byte) 1)));
			    Class6.aClass241_Sub12_38
				.method14956(class241_sub3_36_, 1860941867);
			    class241_sub3_sub1.writeBytes
				(class241_sub3_36_.payload, 0,
				 class241_sub3_36_.payload.length,
				 752061035);
			    class241_sub3_sub1.writeInt((client.anInt8342
							    * -364544137),
							   -1486443590);
			    class241_sub3_sub1
				.writeString(Class424.aString6068, -36488190);
			    class241_sub3_sub1.writeInt((client.anInt8270
							    * -2074968733),
							   -1939669854);
			    class241_sub3_sub1.writeInt((client.anInt8285
							    * -296956191),
							   -1686302448);
			    class241_sub3_sub1.writeString(client.aString8286,
							   -808844802);
			    class241_sub3_sub1.writeByte((-2022180553
							    * (Class95
							       .anInt1332)),
							   742032591);
			    Class303.method5854(class241_sub3_sub1,
						-991590028);
			    class241_sub3_sub1.method14665
				(anIntArray79, i_35_,
				 421967667 * class241_sub3_sub1.pointer,
				 5454884);
			    class241_sub3_sub1.endPacketVarShort
				((421967667 * class241_sub3_sub1.pointer
				  - i_34_),
				 (byte) 115);
			}
			Exception_Sub5.aClass190_10704
			    .sendPacket(class241_sub27, -1717032282);
			Exception_Sub5.aClass190_10704.method3894((byte) 100);
			Exception_Sub5.aClass190_10704.packetCipher
			    = new IsaacCipher(anIntArray79);
			for (int i_37_ = 0; i_37_ < 4; i_37_++)
			    anIntArray79[i_37_] += 50;
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .aClass418_2256
			    = new IsaacCipher(anIntArray79);
			new IsaacCipher(anIntArray79);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.setCipher
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .aClass418_2256),
			     -255638307);
			anIntArray79 = null;
			anInt101 = 1577205088;
		    }
		    if (1195617353 * anInt101 == 96) {
			if (!Exception_Sub5.aClass190_10704.getIO
				 (449198291).isAvailable(1, -341343911))
			    break;
			Exception_Sub5.aClass190_10704.getIO
			    (1265141635).read
			    ((((ServerConnection) Exception_Sub5.aClass190_10704)
			      .inputBuffer.payload),
			     0, 1, 2074773240);
			int i_38_ = ((ServerConnection) Exception_Sub5.aClass190_10704)
					.inputBuffer
					.readUnsignedByte((byte) -41);
			((ServerConnection) Exception_Sub5.aClass190_10704)
			    .inputBuffer.pointer
			    = 0;
			if (i_38_ == 21)
			    anInt101 = -776800633;
			else {
			    if (1 == i_38_) {
				anInt101 = 276983080;
				Class175.setLoginResponse(i_38_, -1190305709);
				break;
			    }
			    if (52 == i_38_) {
				InputStream_Sub1.anInt8605
				    = -100519843 * i_38_;
				anInt101 = 849692114;
			    } else if (2 == i_38_) {
				if (aBool93) {
				    aBool93 = false;
				    anInt101 = -1152359031;
				    break;
				}
				if (289 == -47430143 * anInt77) {
				    Class473.varClientDomain
					.method16179(1527721597);
				    anInt101 = 1293281045;
				} else
				    anInt101 = -1978447323;
			    } else if (i_38_ == 15) {
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .incommingPacketSize
				    = -1798937138;
				anInt101 = -992694143;
			    } else {
				if (23 == i_38_ && -850222383 * anInt115 < 3) {
				    anInt121 = 0;
				    anInt115 += 161150513;
				    anInt101 = -1152359031;
				    Exception_Sub5.aClass190_10704
					.closeConnection(1549302410);
				    break;
				}
				if (42 == i_38_) {
				    anInt101 = -844831166;
				    Class175.setLoginResponse(i_38_, -1518211600);
				    break;
				}
				if (172 == anInt77 * -47430143 && i_38_ == 49
				    && 1766317249 * client.anInt8288 != 5) {
				    if (-2029421995 * anInt75 != 52)
					Class175.setLoginResponse(i_38_, -983981252);
				    break;
				}
				if (aBool78 && !aBool80
				    && 1391949991 * anInt81 != -1
				    && i_38_ == 35) {
				    aBool80 = true;
				    anInt121 = 0;
				    anInt101 = -1152359031;
				    Exception_Sub5.aClass190_10704
					.closeConnection(-1092801035);
				    break;
				}
				if (53 == i_38_)
				    anInt101 = 1145418068;
				else {
				    anInt101 = 1448084985;
				    Class175.setLoginResponse(i_38_, -1269042153);
				    Exception_Sub5.aClass190_10704
					.closeConnection(1806334529);
				    ParamType.method13195((byte) -61);
				    break;
				}
			    }
			}
		    }
		    if (1195617353 * anInt101 == 127) {
			if (Exception_Sub5.aClass190_10704.getIO
				(1520637559).isAvailable(1, -341343911)) {
			    Exception_Sub5.aClass190_10704.getIO
				(1670020645).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 1, 1957379725);
			    int i_39_
				= ((((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.payload
				    [0])
				   & 0xff);
			    anInt94 = i_39_ * -1584407454;
			    anInt101 = 1448084985;
			    Class175.setLoginResponse(21, -673950870);
			    Exception_Sub5.aClass190_10704
				.closeConnection(-1496679712);
			    ParamType.method13195((byte) -66);
			}
		    } else if (210 == 1195617353 * anInt101) {
			if (Exception_Sub5.aClass190_10704.getIO
				(1487252601).isAvailable(2, -341343911)) {
			    Exception_Sub5.aClass190_10704.getIO
				(-199419348).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 2, 2037358438);
			    anInt114 = (-172763715
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
			    anInt101 = 1577205088;
			}
		    } else if (244 == 1195617353 * anInt101) {
			if (Exception_Sub5.aClass190_10704.getIO
				(-2002952306).isAvailable(4, -341343911)) {
			    Exception_Sub5.aClass190_10704.getIO
				(319148364).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 4, 2111641617);
			    anInt126
				= ((ServerConnection) Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .readInt((byte) 92) * 1750668871;
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer
				= 0;
			    anInt101 = 1448084985;
			    Class175.setLoginResponse(53, -314418281);
			    Exception_Sub5.aClass190_10704
				.closeConnection(716135842);
			    ParamType.method13195((byte) -35);
			}
		    } else if (anInt101 * 1195617353 == 197) {
			if (-1010359307 * InputStream_Sub1.anInt8605 == 29) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (-1449750830).isAvailable(1, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(743740675).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 1, 2016884332);
			    anInt123
				= ((((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.payload
				    [0])
				   & 0xff) * 1465399761;
			} else if (45 == (InputStream_Sub1.anInt8605
					  * -1010359307)) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (977287370).isAvailable(3, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(-563665365).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 3, 1958500922);
			    anInt123
				= ((((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.payload
				    [0])
				   & 0xff) * 1465399761;
			    anInt83 = ((((((ServerConnection)
					   Exception_Sub5.aClass190_10704)
					  .inputBuffer
					  .payload[1])
					 & 0xff)
					<< 8)
				       + ((((ServerConnection)
					    Exception_Sub5.aClass190_10704)
					   .inputBuffer
					   .payload[2])
					  & 0xff)) * 437675423;
			} else
			    throw new IllegalStateException();
			anInt101 = 1448084985;
			Class175.setLoginResponse((-1010359307
					     * InputStream_Sub1.anInt8605),
					    -461851199);
			Exception_Sub5.aClass190_10704.closeConnection(1652222642);
			ParamType.method13195((byte) -21);
		    } else if (226 == anInt101 * 1195617353) {
			if (Exception_Sub5.aClass190_10704.getIO
				(-1163075198).isAvailable(2, -341343911)) {
			    Exception_Sub5.aClass190_10704.getIO
				(17043842).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 2, 1954877975);
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
			    anInt101 = -1947902538;
			}
		    } else if (1195617353 * anInt101 == 230) {
			if (Exception_Sub5.aClass190_10704.getIO
				(-1706964587).isAvailable
			    (Class351.anInt5426 * 293638721, -341343911)) {
			    Exception_Sub5.aClass190_10704.getIO
				(2057233731).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, Class351.anInt5426 * 293638721,
				 2141060145);
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer
				= 0;
			    byte[] is
				= new byte[293638721 * Class351.anInt5426 + 1];
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.readEncodeBytes
				(is, 0, Class351.anInt5426 * 293638721,
				 -313483847);
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer
				= 0;
			    RSByteBuffer class241_sub3
				= new RSByteBuffer(is);
			    String string
				= class241_sub3.readString(-362044592);
			    Class446.method7895(string, true, client.aBool8440,
						-1815142638);
			    Class175.setLoginResponse((-1010359307
						 * InputStream_Sub1.anInt8605),
						-127432988);
			    if (anInt77 * -47430143 == 172
				&& 5 != client.anInt8288 * 1766317249)
				anInt101 = 1577205088;
			    else {
				anInt101 = 1448084985;
				Exception_Sub5.aClass190_10704
				    .closeConnection(-1490806021);
				ParamType.method13195((byte) -44);
			    }
			}
		    } else {
			if (253 == 1195617353 * anInt101) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (-1329035713).isAvailable(2, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(-562024527).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 2, 2074555000);
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer
				= 0;
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.incommingPacketSize
				= ((ServerConnection) Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .readUnsignedShort(1162222719) * -1248015079;
			    anInt101 = 91634355;
			}
			if (267 == anInt101 * 1195617353) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (1657277036).isAvailable
				 (1912225577 * (((ServerConnection) (Exception_Sub5
							     .aClass190_10704))
						.incommingPacketSize),
				  -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(1973737126).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0,
				 1912225577 * (((ServerConnection)
						Exception_Sub5.aClass190_10704)
					       .incommingPacketSize),
				 1978874179);
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.inputBuffer.pointer
				= 0;
			    boolean bool
				= (((ServerConnection) Exception_Sub5.aClass190_10704)
				       .inputBuffer
				       .readUnsignedByte((byte) -64)
				   == 1);
			    while (421967667 * (((ServerConnection) (Exception_Sub5
							     .aClass190_10704))
						.inputBuffer
						.pointer)
				   < (((ServerConnection) (Exception_Sub5
						   .aClass190_10704)).incommingPacketSize
				      * 1912225577)) {
				Class254 class254
				    = (Class463.VAR_CLIENT_LIST
					   .decodeVarValue
				       ((((ServerConnection)
					  Exception_Sub5.aClass190_10704)
					 .inputBuffer),
					(byte) 97));
				Class473.varClientDomain
				    .varValues.method335
				    (class254.key * 623518843,
				     class254.value, (byte) -48);
			    }
			    if (bool) {
				Class241_Sub27 class241_sub27
				    = Class475_Sub1_Sub3
					  .method17004(-970273309);
				RSBitBuffer class241_sub3_sub1
				    = class241_sub27.data;
				class241_sub3_sub1.writeByte
				    ((2087126207
				      * Class256.aClass256_4152.anInt4153),
				     1565600240);
				Exception_Sub5.aClass190_10704
				    .sendPacket(class241_sub27, -1819170378);
				Exception_Sub5.aClass190_10704
				    .method3894((byte) 100);
				anInt101 = -2027734982;
			    } else
				anInt101 = 1293281045;
			}
			if (anInt101 * 1195617353 == 138) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (344666317).isAvailable(1, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(-1278126040).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 1, 1983201630);
			    int i_40_
				= ((((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.payload
				    [0])
				   & 0xff);
			    if (2 != i_40_) {
				if (i_40_ == 29 || i_40_ == 45) {
				    InputStream_Sub1.anInt8605
					= -100519843 * i_40_;
				    anInt101 = 1804900509;
				} else {
				    anInt101 = 1448084985;
				    Class175.setLoginResponse(i_40_, 42790130);
				    Exception_Sub5.aClass190_10704
					.closeConnection(101345662);
				    ParamType.method13195((byte) 0);
				    break;
				}
				break;
			    }
			    anInt101 = -1978447323;
			}
			if (1195617353 * anInt101 == 141) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (1703663325).isAvailable(1, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(730760180).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 1, 2092020700);
			    Class384.anInt5702
				= 112037823 * ((((ServerConnection) (Exception_Sub5
							     .aClass190_10704))
						.inputBuffer
						.payload[0])
					       & 0xff);
			    anInt101 = 1114873283;
			}
			if (155 == 1195617353 * anInt101) {
			    RSBitBuffer class241_sub3_sub1
				= (((ServerConnection) Exception_Sub5.aClass190_10704)
				   .inputBuffer);
			    if (289 == anInt77 * -47430143) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (-128280321).isAvailable
				     (Class384.anInt5702 * -752984001,
				      -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (1603157520).read
				    (class241_sub3_sub1.payload, 0,
				     -752984001 * Class384.anInt5702,
				     2032525280);
				class241_sub3_sub1.pointer = 0;
				client.playerRights
				    = (class241_sub3_sub1
					   .readUnsignedByte((byte) -13)
				       * -562486153);
				client.anInt8508
				    = (class241_sub3_sub1
					   .readUnsignedByte((byte) -22)
				       * -2064149665);
				client.aBool8441
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 17) == 1;
				client.aBool8442
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -30) == 1;
				client.aBool8443
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -6) == 1;
				client.isQcWorld
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -54) == 1;
				client.myPlayerIndex
				    = (class241_sub3_sub1
					   .readUnsignedShort(1162222719)
				       * -738519175);
				client.isP2pAccount
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -21) == 1;
				Class203.anInt2425
				    = class241_sub3_sub1
					  .method14643((byte) 23) * 1122928185;
				client.isP2pWorld
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -50) == 1;
				Class120_Sub22.aString10627
				    = class241_sub3_sub1
					  .readString(-1703891606);
				client.aClass238_8477.getObjectLoader
				    (-1831538778)
				    .method11851(client.isP2pWorld, 1089105586);
				Class277.aClass236_4389.method4706
				    (-650158403).getObjectLoader
				    (-2002084486)
				    .method11851(client.isP2pWorld, 1089105586);
				JS5.itemDefLoader
				    .setAllowMembers(client.isP2pWorld, (byte) 32);
				MasterIndex.npcDefLoader.method7227
				    (client.isP2pWorld, (short) 30835);
			    } else {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (2056011651).isAvailable
				     (Class384.anInt5702 * -752984001,
				      -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (1867504220).read
				    (class241_sub3_sub1.payload, 0,
				     -752984001 * Class384.anInt5702,
				     2001702841);
				class241_sub3_sub1.pointer = 0;
				client.playerRights
				    = (class241_sub3_sub1
					   .readUnsignedByte((byte) -30)
				       * -562486153);
				client.anInt8508 = (class241_sub3_sub1
							.readUnsignedByte((byte) 48)
						    * -2064149665);
				client.aBool8441
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 33) == 1;
				Class203.anInt2425
				    = class241_sub3_sub1
					  .method14643((byte) 26) * 1122928185;
				Class21.myPlayer
				    .gender
				    = (byte) class241_sub3_sub1
						 .readUnsignedByte((byte) -34);
				client.aBool8442
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -24) == 1;
				client.aBool8443
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 102) == 1;
				Class541.aLong7009
				    = (class241_sub3_sub1
					   .readLong((short) 25336)
				       * 7560864676624469187L);
				Class209_Sub1.aLong10285
				    = (((6353119288506319851L
					 * Class541.aLong7009)
					- Class50.method1249((byte) 1)
					- class241_sub3_sub1
					      .method14729((byte) -42))
				       * -7079703363933644479L);
				int i_41_ = class241_sub3_sub1
						.readUnsignedByte((byte) 16);
				client.isP2pAccount = (i_41_ & 0x1) != 0;
				Class599.aBool7714 = 0 != (i_41_ & 0x2);
				Class249.anInt3998
				    = class241_sub3_sub1
					  .readInt((byte) 103) * 416479871;
				Class111.anInt1513
				    = class241_sub3_sub1
					  .readInt((byte) 96) * 1711374871;
				ParamType.anInt7740
				    = (class241_sub3_sub1
					   .readUnsignedShort(1162222719)
				       * -2120604853);
				Class10.anInt68 = (class241_sub3_sub1
						       .readUnsignedShort(1162222719)
						   * -522392027);
				Class120.anInt1566
				    = (class241_sub3_sub1
					   .readUnsignedShort(1162222719)
				       * 1781214315);
				Class539.anInt7001
				    = class241_sub3_sub1
					  .readInt((byte) 59) * 1625681393;
				Class621.aClass4_7876
				    = new Class4(-970497263
						 * Class539.anInt7001);
				new Thread(Class621.aClass4_7876).start();
				Class187.anInt2205
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) 80) * 405558217;
				Class219.anInt2559
				    = class241_sub3_sub1
					  .readUnsignedShort(1162222719) * 53778005;
				ClientScriptCaller.anInt8978
				    = (class241_sub3_sub1
					   .readUnsignedShort(1162222719)
				       * -624416675);
				Class167.aBool2063
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -30) == 1;
				Class21.myPlayer
				    .nameUnfiltered
				    = Class21
					  .myPlayer
					  .nameFiltered
				    = RuntimeException_Sub3.myPlayerDisplayName
				    = class241_sub3_sub1
					  .readJagString(679541846);
				Class417.anInt6018
				    = class241_sub3_sub1
					  .readUnsignedByte((byte) -1) * 1638451587;
				Class77.anInt1131
				    = class241_sub3_sub1
					  .readInt((byte) 73) * 188343509;
				Class395.aClass397_5774 = new Server();
				Class395.aClass397_5774.nodeID
				    = (class241_sub3_sub1
					   .readUnsignedShort(1162222719)
				       * 1167304829);
				if ((-2019487531
				     * Class395.aClass397_5774.nodeID)
				    == 65535)
				    Class395.aClass397_5774.nodeID
					= -1167304829;
				Class395.aClass397_5774.aString5786
				    = class241_sub3_sub1
					  .readJagString(1854779365);
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
					(Class395.aClass397_5777, (byte) -20)))
				    ClientScriptCaller.method14987((byte) -105);
			    }
			    if (client.aBool8441 && !client.aBool8443
				|| client.isP2pAccount) {
				try {
				    Class396.callNoParamater(Class421.gameApplet,
							"zap", (byte) -45);
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
							"unzap", (byte) -56);
				} catch (Throwable throwable) {
				    /* empty */
				}
			    }
			    if (Class416.aClass470_6012
				== Class470.aClass470_6345)
				JSFunction.aClass348_5364.method6212((byte) 0);
			    if (289 == -47430143 * anInt77)
				anInt101 = 61089570;
			    else {
				anInt101 = 1448084985;
				Class175.setLoginResponse(2, -1705455276);
				Class639.method13607(-470484636);
				Class496.setClientStage(2, (byte) -96);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .currentPacket
				    = null;
				break;
			    }
			}
			if (1195617353 * anInt101 == 178) {
			    if (!Exception_Sub5.aClass190_10704.getIO
				     (1974922428).isAvailable(3, -341343911))
				break;
			    Exception_Sub5.aClass190_10704.getIO
				(952410401).read
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .inputBuffer.payload),
				 0, 3, 2002149190);
			    anInt101 = 110377229;
			}
			if (anInt101 * 1195617353 == 181) {
			    RSBitBuffer class241_sub3_sub1
				= (((ServerConnection) Exception_Sub5.aClass190_10704)
				   .inputBuffer);
			    class241_sub3_sub1.pointer = 0;
			    if (class241_sub3_sub1.method17041(-1981903399)) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (2132417547)
					 .isAvailable(1, -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (1512967329).read
				    (class241_sub3_sub1.payload, 3, 1,
				     2114812937);
			    }
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.currentPacket
				= (Class452.method10546((byte) 0)
				   [class241_sub3_sub1
					.readPacketOpcode(1121339675)]);
			    ((ServerConnection) Exception_Sub5.aClass190_10704)
				.incommingPacketSize
				= (class241_sub3_sub1.readUnsignedShort(1162222719)
				   * -1248015079);
			    anInt101 = 1312023919;
			}
			if (anInt101 * 1195617353 == 167) {
			    if (Exception_Sub5.aClass190_10704.getIO
				    (2982391).isAvailable
				((((ServerConnection) Exception_Sub5.aClass190_10704)
				  .incommingPacketSize) * 1912225577,
				 -341343911)) {
				Exception_Sub5.aClass190_10704.getIO
				    (1333284773).read
				    ((((ServerConnection)
				       Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .payload),
				     0,
				     (((ServerConnection) (Exception_Sub5
						   .aClass190_10704)).incommingPacketSize
				      * 1912225577),
				     1994450219);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				int i_42_ = (1912225577
					     * (((ServerConnection) (Exception_Sub5
							     .aClass190_10704))
						.incommingPacketSize));
				anInt101 = 1448084985;
				Class175.setLoginResponse(2, -1229265802);
				Class26.initGameWorld((byte) 80);
				Class25.decodePlayerInit((((ServerConnection)
						    (Exception_Sub5
						     .aClass190_10704))
						   .inputBuffer),
						  (byte) 121);
				int i_43_
				    = (i_42_
				       - (421967667
					  * (((ServerConnection)
					      Exception_Sub5.aClass190_10704)
					     .inputBuffer
					     .pointer)));
				RSBitBuffer class241_sub3_sub1
				    = new RSBitBuffer(i_43_);
				System.arraycopy
				    ((((ServerConnection)
				       Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .payload),
				     ((((ServerConnection)
					Exception_Sub5.aClass190_10704)
				       .inputBuffer.pointer)
				      * 421967667),
				     class241_sub3_sub1.payload, 0,
				     i_43_);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    += i_43_ * -681042949;
				if ((((ServerConnection)
				      Exception_Sub5.aClass190_10704)
				     .currentPacket)
				    == IncommingOpcode.DYNAMIC_MAP_REGION_PACKET)
				    client.aClass238_8477.setMapScene
					(new Class234(MapType.aClass235_2703,
						      class241_sub3_sub1),
					 1712536550);
				else
				    client.aClass238_8477.setMapScene
					(new Class234(MapType.STATIC_MAP,
						      class241_sub3_sub1),
					 1609633768);
				if ((421967667
				     * (((ServerConnection)
					 Exception_Sub5.aClass190_10704)
					.inputBuffer.pointer))
				    != i_42_)
				    throw new RuntimeException
					      (new StringBuilder().append
						   ((((ServerConnection)
						      (Exception_Sub5
						       .aClass190_10704))
						     .inputBuffer
						     .pointer) * 421967667)
						   .append
						   (" ").append
						   (i_42_).toString());
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .currentPacket
				    = null;
			    }
			} else {
			    if (201 != 1195617353 * anInt101)
				break;
			    if ((((ServerConnection) Exception_Sub5.aClass190_10704)
				 .incommingPacketSize) * 1912225577
				== -2) {
				if (!Exception_Sub5.aClass190_10704.getIO
					 (-2147230413)
					 .isAvailable(2, -341343911))
				    break;
				Exception_Sub5.aClass190_10704.getIO
				    (233616657).read
				    ((((ServerConnection)
				       Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .payload),
				     0, 2, 2144779498);
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
				    (-1926248267).isAvailable
				(1912225577 * (((ServerConnection)
						Exception_Sub5.aClass190_10704)
					       .incommingPacketSize),
				 -341343911)) {
				Exception_Sub5.aClass190_10704.getIO
				    (-381654925).read
				    ((((ServerConnection)
				       Exception_Sub5.aClass190_10704)
				      .inputBuffer
				      .payload),
				     0,
				     (((ServerConnection) (Exception_Sub5
						   .aClass190_10704)).incommingPacketSize
				      * 1912225577),
				     1988744646);
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .inputBuffer.pointer
				    = 0;
				int i_44_ = ((((ServerConnection)
					       Exception_Sub5.aClass190_10704)
					      .incommingPacketSize)
					     * 1912225577);
				anInt101 = 1448084985;
				Class175.setLoginResponse(15, -1161495902);
				Class589.method12906(-332093999);
				Class25.decodePlayerInit((((ServerConnection)
						    (Exception_Sub5
						     .aClass190_10704))
						   .inputBuffer),
						  (byte) 59);
				if (((((ServerConnection)
				       Exception_Sub5.aClass190_10704)
				      .inputBuffer.pointer)
				     * 421967667)
				    != i_44_)
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
						   (i_44_).toString());
				((ServerConnection) Exception_Sub5.aClass190_10704)
				    .currentPacket
				    = null;
			    }
			}
		    }
		} catch (IOException ioexception) {
		    Exception_Sub5.aClass190_10704.closeConnection(-1018550767);
		    if (-850222383 * anInt115 < 3) {
			if (289 == anInt77 * -47430143)
			    Class193.aClass397_2297.method7114(1451781846);
			else
			    Class609.aClass397_7759.method7114(1451781846);
			anInt121 = 0;
			anInt115 += 161150513;
			anInt101 = -1152359031;
		    } else {
			anInt101 = 1448084985;
			Class175.setLoginResponse(-4, -1260672230);
			ParamType.method13195((byte) -128);
		    }
		    break;
		}
		break;
	    } while (false);
	}
    }
    
    static void method644(int i) {
	/* empty */
    }
    
    static void method645(int i) {
	/* empty */
    }
    
    static void method646(int i) {
	/* empty */
    }
    
    static void method647() {
	Class83.method1833(-737562975);
    }
    
    static RSByteBuffer method648() {
	RSByteBuffer class241_sub3 = Class577.method12684((byte) -117);
	class241_sub3.method14627(0L);
	class241_sub3.writeString(aString113, -428621976);
	class241_sub3.method14627(-8566645190624485041L * aLong111);
	class241_sub3.method14627(client.aLong8306 * -7247048686966732057L);
	class241_sub3.applyRSA(RSAKeys.LOGIN_PUBLIC_KEY,
				  RSAKeys.LOGIN_MODULUS, (byte) -1);
	return class241_sub3;
    }
    
    static void method649() {
	Exception_Sub5.aClass190_10704.method3880((byte) -28);
	((ServerConnection) Exception_Sub5.aClass190_10704)
	    .inputBuffer.pointer
	    = 0;
	((ServerConnection) Exception_Sub5.aClass190_10704).currentPacket = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2272 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2273 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2274 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).incommingPacketSize = 0;
	((ServerConnection) Exception_Sub5.aClass190_10704).anInt2269 = 0;
	client.systemUpdateTimer = 0;
	Class122.method2983(-2074704048);
	Class610.method13227((byte) 42);
	for (int i = 0; i < 2048; i++)
	    client.localPlayers[i] = null;
	Class21.myPlayer = null;
	for (int i = 0; i < client.anInt8434 * 743597371; i++) {
	    Entity class475_sub1_sub1_sub3
		= ((Entity)
		   client.aClass241_Sub26Array8276[i].objectValue);
	    if (class475_sub1_sub1_sub3 != null)
		class475_sub1_sub1_sub3.facingEntity = -1027225177;
	}
	Class540.method11933(-856054557);
	Class592.method12924(Class520.method11690(-615607100), 1067071248);
	Class496.setClientStage(19, (byte) -117);
	for (int i = 0; i < 108; i++)
	    client.aBoolArray8523[i] = true;
	Class9.method573(Exception_Sub5.aClass190_10704, -1383789900);
	Class583.aClass468_7582 = null;
	Class593.aLong7630 = 0L;
	Class211.method4286((byte) -37);
	Class473.varClientDomain.method16180(-426195873);
    }
    
    static boolean method650() {
	anInt77 = 78183201;
	Exception_Sub5.aClass190_10704 = client.aClass190_8340;
	return CcDeltaNode.method15095((aLong82 * -3469600135743429117L
					   == -1L),
					  true, "", "",
					  -3469600135743429117L * aLong82);
    }
    
    static void method651(RSBitBuffer class241_sub3_sub1) {
	class241_sub3_sub1.writeInt(Class187.aClass210_2204
					   .method4195((byte) 112),
				       1214245621);
	class241_sub3_sub1.writeInt(Class577.aClass210_7450
					   .method4195((byte) 49),
				       911762301);
	class241_sub3_sub1.writeInt(Class120_Sub2.CONFIG_ARCHIVE
					   .method4195((byte) 112),
				       880055490);
	class241_sub3_sub1.writeInt(Class218_Sub5.INTERFACES_ARCHIVE
					   .method4195((byte) 25),
				       -1644949815);
	class241_sub3_sub1.writeInt(Class120_Sub22.LANDSCAPES_ARCHIVE
					   .method4195((byte) 46),
				       -371634696);
	class241_sub3_sub1.writeInt(Class508.MODELS_ARCHIVE
					   .method4195((byte) 77),
				       2018702899);
	class241_sub3_sub1.writeInt(Class284.SPRITES_ARCHIVE
					   .method4195((byte) 71),
				       165421408);
	class241_sub3_sub1.writeInt(Class177.TEXTURES_ARCHIVE
					   .method4195((byte) 72),
				       1584309063);
	class241_sub3_sub1.writeInt(Class209.HUFFMAN_ARCHIVE
					   .method4195((byte) 90),
				       1420648840);
	class241_sub3_sub1.writeInt(Class547.CS2_ARCHIVE
					   .method4195((byte) 116),
				       -1877710890);
	class241_sub3_sub1.writeInt(Class120_Sub7.FONTS_ARCHIVE
					   .method4195((byte) 60),
				       1843008426);
	if (!Class84.aBool1159)
	    class241_sub3_sub1.writeInt(AnimationConfigLoader.aClass210_6996
					       .method4195((byte) 73),
					   280256940);
	class241_sub3_sub1.writeInt(Class496.OBJECTS_ARCHIVE
					   .method4195((byte) 50),
				       1660917209);
	class241_sub3_sub1.writeInt(Class132.CS2_MAPS_ARCHIVE
					   .method4195((byte) 23),
				       425098142);
	class241_sub3_sub1.writeInt(Js5Archive.NPCS_ARCHIVE
					   .method4195((byte) 105),
				       -297846260);
	class241_sub3_sub1.writeInt(Class640.ITEMS_ARCHIVE
					   .method4195((byte) 59),
				       1991237231);
	class241_sub3_sub1.writeInt(Class601.ANIMATIONS_ARCHIVE
					   .method4195((byte) 52),
				       -1376266460);
	class241_sub3_sub1.writeInt(Class452.GRAPHICS_ARCHIVE
					   .method4195((byte) 10),
				       902278316);
	class241_sub3_sub1.writeInt(Class117.GENERAL_MAPS_ARCHIVE
					   .method4195((byte) 57),
				       -1175883178);
	class241_sub3_sub1.writeInt(Class608.WORLD_MAP_ARCHIVE
					   .method4195((byte) 86),
				       -947962603);
	class241_sub3_sub1.writeInt(Class630.QC_MESSAGE_ARCHIVE
					   .method4195((byte) 103),
				       -593309725);
	class241_sub3_sub1.writeInt(Class445_Sub23.QC_MENU_ARCHIVE
					   .method4195((byte) 127),
				       111205733);
	class241_sub3_sub1.writeInt(Class565.aClass210_7321
					   .method4195((byte) 49),
				       925214973);
	class241_sub3_sub1.writeInt(Player
					   .aClass210_11519
					   .method4195((byte) 71),
				       663834589);
	class241_sub3_sub1.writeInt(Class349.DEFAULTS_ARCHIVE
					   .method4195((byte) 6),
				       1004943007);
	class241_sub3_sub1.writeInt(Class394.aClass210_5769
					   .method4195((byte) 8),
				       1361563395);
	class241_sub3_sub1.writeInt(Class505.DLLS_ARCHIVE
					   .method4195((byte) 99),
				       -300398650);
	class241_sub3_sub1.writeInt(Class200.SHADERS_ARCHIVE
					   .method4195((byte) 14),
				       -1362647688);
	class241_sub3_sub1.writeInt(Class327.method6017((byte) -3),
				       -715748074);
	class241_sub3_sub1.writeInt(Class133.method3087(1768101106),
				       268491908);
	class241_sub3_sub1.writeInt(Class112.aClass210_1527
					   .method4195((byte) 87),
				       -1364888255);
	class241_sub3_sub1.writeInt(SoundManager.aClass210_672
					   .method4195((byte) 89),
				       -1451734368);
	class241_sub3_sub1.writeInt(Class223.GRAPHIC_CONFIG_ARCHIVE
					   .method4195((byte) 100),
				       1174893971);
	class241_sub3_sub1.writeInt(0, -671114934);
	class241_sub3_sub1.writeInt(0, -813499040);
	if (!Class84.aBool1159)
	    class241_sub3_sub1.writeInt(Class507.aClass210_6671
					       .method4195((byte) 65),
					   -1347818956);
    }
    
    static boolean method652() {
	if (client.aByteArray8273 != null)
	    return Class483.method11047(-1889498800);
	if (anInt81 * 1391949991 != -1)
	    return Class459.method10604(1353113681);
	return Class326.method6006(aString112, aString113, -646588992);
    }
    
    static void method653() {
	Exception_Sub5.aClass190_10704.method3880((byte) 62);
	((ServerConnection) Exception_Sub5.aClass190_10704)
	    .inputBuffer.pointer
	    = 0;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2272 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2273 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2274 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).anInt2269 = 0;
	client.systemUpdateTimer = 0;
	Class456.method10576(1289476813);
	client.friendListStage = 0;
	client.friendListSize = 0;
	client.ignoreListSize = 0;
	client.currentFriendsChatName = null;
	Class357_Sub1.currentFcSize = 0;
	Class350.currentFcUsers = null;
	Class24.guestClanSettings = null;
	GraphicsDefinitionLoader.mainClanSettings = null;
	Class70.method1726(-70323208);
	for (int i = 0;
	     i < ((Class19) Class1.aClass19_11).skills.length;
	     i++) {
	    SkillData class498
		= new SkillData(Class227.skillTypeList.method11455(i,
								   2029779252),
			       false);
	    class498.setExperience(0, -1239942004);
	    class498.setCurrentLevel(0, 1779720445);
	    ((Class19) Class1.aClass19_11).skills[i] = class498;
	}
	Class1.aClass19_11.varPlayerDomain.method11638((short) 32005);
	RSByteBuffer.method14846(-1413245547);
	Class9.method573(Exception_Sub5.aClass190_10704, -968731378);
    }
    
    static void method654(RSBitBuffer class241_sub3_sub1) {
	class241_sub3_sub1.writeInt(Class187.aClass210_2204
					   .method4195((byte) 104),
				       -1642847352);
	class241_sub3_sub1.writeInt(Class577.aClass210_7450
					   .method4195((byte) 4),
				       -1119252823);
	class241_sub3_sub1.writeInt(Class120_Sub2.CONFIG_ARCHIVE
					   .method4195((byte) 35),
				       -1857773405);
	class241_sub3_sub1.writeInt(Class218_Sub5.INTERFACES_ARCHIVE
					   .method4195((byte) 77),
				       -1110495890);
	class241_sub3_sub1.writeInt(Class120_Sub22.LANDSCAPES_ARCHIVE
					   .method4195((byte) 27),
				       1319992783);
	class241_sub3_sub1.writeInt(Class508.MODELS_ARCHIVE
					   .method4195((byte) 68),
				       491969273);
	class241_sub3_sub1.writeInt(Class284.SPRITES_ARCHIVE
					   .method4195((byte) 104),
				       -539539253);
	class241_sub3_sub1.writeInt(Class177.TEXTURES_ARCHIVE
					   .method4195((byte) 84),
				       -589876635);
	class241_sub3_sub1.writeInt(Class209.HUFFMAN_ARCHIVE
					   .method4195((byte) 32),
				       544092495);
	class241_sub3_sub1.writeInt(Class547.CS2_ARCHIVE
					   .method4195((byte) 68),
				       965276103);
	class241_sub3_sub1.writeInt(Class120_Sub7.FONTS_ARCHIVE
					   .method4195((byte) 59),
				       -1898773183);
	if (!Class84.aBool1159)
	    class241_sub3_sub1.writeInt(AnimationConfigLoader.aClass210_6996
					       .method4195((byte) 108),
					   -1277867861);
	class241_sub3_sub1.writeInt(Class496.OBJECTS_ARCHIVE
					   .method4195((byte) 14),
				       -719286655);
	class241_sub3_sub1.writeInt(Class132.CS2_MAPS_ARCHIVE
					   .method4195((byte) 117),
				       847849255);
	class241_sub3_sub1.writeInt(Js5Archive.NPCS_ARCHIVE
					   .method4195((byte) 11),
				       1173719988);
	class241_sub3_sub1.writeInt(Class640.ITEMS_ARCHIVE
					   .method4195((byte) 63),
				       926520150);
	class241_sub3_sub1.writeInt(Class601.ANIMATIONS_ARCHIVE
					   .method4195((byte) 76),
				       1890843986);
	class241_sub3_sub1.writeInt(Class452.GRAPHICS_ARCHIVE
					   .method4195((byte) 79),
				       1165381970);
	class241_sub3_sub1.writeInt(Class117.GENERAL_MAPS_ARCHIVE
					   .method4195((byte) 106),
				       -785680829);
	class241_sub3_sub1.writeInt(Class608.WORLD_MAP_ARCHIVE
					   .method4195((byte) 100),
				       -1972629109);
	class241_sub3_sub1.writeInt(Class630.QC_MESSAGE_ARCHIVE
					   .method4195((byte) 55),
				       1944898241);
	class241_sub3_sub1.writeInt(Class445_Sub23.QC_MENU_ARCHIVE
					   .method4195((byte) 31),
				       -1479990968);
	class241_sub3_sub1.writeInt(Class565.aClass210_7321
					   .method4195((byte) 50),
				       -1363178376);
	class241_sub3_sub1.writeInt(Player
					   .aClass210_11519
					   .method4195((byte) 5),
				       -2050016107);
	class241_sub3_sub1.writeInt(Class349.DEFAULTS_ARCHIVE
					   .method4195((byte) 51),
				       1209623475);
	class241_sub3_sub1.writeInt(Class394.aClass210_5769
					   .method4195((byte) 106),
				       1375665045);
	class241_sub3_sub1.writeInt(Class505.DLLS_ARCHIVE
					   .method4195((byte) 112),
				       -1159270636);
	class241_sub3_sub1.writeInt(Class200.SHADERS_ARCHIVE
					   .method4195((byte) 50),
				       1577633453);
	class241_sub3_sub1.writeInt(Class327.method6017((byte) 89),
				       1860088022);
	class241_sub3_sub1.writeInt(Class133.method3087(1950580135),
				       -1318429314);
	class241_sub3_sub1.writeInt(Class112.aClass210_1527
					   .method4195((byte) 36),
				       1258682576);
	class241_sub3_sub1.writeInt(SoundManager.aClass210_672
					   .method4195((byte) 25),
				       -386576383);
	class241_sub3_sub1.writeInt(Class223.GRAPHIC_CONFIG_ARCHIVE
					   .method4195((byte) 89),
				       101319376);
	class241_sub3_sub1.writeInt(0, 2088761797);
	class241_sub3_sub1.writeInt(0, 502296004);
	if (!Class84.aBool1159)
	    class241_sub3_sub1.writeInt(Class507.aClass210_6671
					       .method4195((byte) 38),
					   -1962838471);
    }
    
    static void method655() {
	Class83.method1833(-1288994796);
    }
    
    static RSByteBuffer method656() {
	RSByteBuffer class241_sub3 = new RSByteBuffer(518);
	anIntArray79 = new int[4];
	anIntArray79[0] = (int) (Math.random() * 9.9999999E7);
	anIntArray79[1] = (int) (Math.random() * 9.9999999E7);
	anIntArray79[2] = (int) (Math.random() * 9.9999999E7);
	anIntArray79[3] = (int) (Math.random() * 9.9999999E7);
	class241_sub3.writeByte(10, 1114072041);
	class241_sub3.writeInt(anIntArray79[0], -1804133209);
	class241_sub3.writeInt(anIntArray79[1], 90122922);
	class241_sub3.writeInt(anIntArray79[2], 244699184);
	class241_sub3.writeInt(anIntArray79[3], 2091868025);
	return class241_sub3;
    }
    
    static void method657() {
	if (1766317249 * client.anInt8288 == 6)
	    Class506.method11488((short) 26560);
	client.aClass190_8339.closeConnection(-1233408869);
	Class83.method1833(-1382757979);
	Class47.isWindowFocused = true;
	ClientMessage.method13510(2037793489);
	for (int i = 0; i < client.aClass192Array8301.length; i++)
	    client.aClass192Array8301[i] = null;
	client.aBool8544 = false;
	client.anInt8491 = ((int) (Math.random() * 100.0) - 50) * 1368877013;
	client.anInt8370 = ((int) (Math.random() * 110.0) - 55) * -334054455;
	client.anInt8521 = ((int) (Math.random() * 80.0) - 40) * 2001102403;
	client.anInt8513 = ((int) (Math.random() * 120.0) - 60) * 205222569;
	client.anInt8377 = ((int) (Math.random() * 30.0) - 20) * -415721163;
	client.aFloat8581
	    = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
	Class130.method3068(2133196939);
	for (int i = 0; i < 2048; i++)
	    client.localPlayers[i] = null;
	Class21.myPlayer = null;
	client.localNpcCount = 0;
	client.anInt8434 = 0;
	client.aClass407_8457.method7293(-850143915);
	client.aClass429_8478.method7652((byte) 61);
	client.aClass407_8454.method7293(-1972877676);
	client.aClass421_8376.method7521((byte) -10);
	client.aClass407_8452.method7293(-1545908979);
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
	    Class451.method10535(1629309841 * client.anInt8466, (byte) -66);
	for (Class241_Sub11 class241_sub11
		 = ((Class241_Sub11)
		    client.aClass407_8467.method7294(2090894173));
	     null != class241_sub11;
	     class241_sub11 = ((Class241_Sub11)
			       client.aClass407_8467.method7295(-247780164))) {
	    if (!class241_sub11.hasNext((byte) 72)) {
		class241_sub11 = (Class241_Sub11) client.aClass407_8467
						      .method7294(2090894173);
		if (class241_sub11 == null)
		    break;
	    }
	    Class40.method1047(class241_sub11, true, false, -368329704);
	}
	client.anInt8466 = -1376966001;
	client.aClass407_8467 = new HashTable(8);
	Class339.method6120(-1658940023);
	client.aClass58_8384 = null;
	for (int i = 0; i < 8; i++) {
	    client.playerOptionMessages[i] = null;
	    client.aBoolArray8450[i] = false;
	    client.playerOptionCursors[i] = -1;
	}
	Class540.method11933(-231109041);
	client.aBool8540 = true;
	for (int i = 0; i < 108; i++)
	    client.aBoolArray8523[i] = true;
	for (int i = 0; i < 6; i++)
	    client.aClass220Array8426[i] = new Class220();
	client.aClass238_8477.method4833(892438103).method11400(-577092150);
	client.aBool8392 = true;
	Class504.aShortArray6634 = ObjectDefinition.aShortArray6828
	    = NPCDefinition.aShortArray5800 = ItemDefinition.clientpalette
	    = new short[256];
	Class353.aString5444
	    = ClientMessage.WALKHERE.getLocalisedMessage(VarPlayerDomain.currentLocale,
						  (short) 20212);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870,
	     Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869
		 .method14352((byte) -117),
	     (byte) 2);
	client.anInt8342 = 0;
	Class122.method2983(-1966213009);
	Class583.aClass468_7582 = null;
	Class593.aLong7630 = 0L;
    }
    
    Class13() throws Throwable {
	throw new Error();
    }
    
    static void method658() {
	Class83.method1833(-1455118894);
    }
    
    static void method659() {
	if (1766317249 * client.anInt8288 == 6)
	    Class506.method11488((short) 13040);
	client.aClass190_8339.closeConnection(-1315765147);
	Class83.method1833(-349255803);
	Class47.isWindowFocused = true;
	ClientMessage.method13510(1783883900);
	for (int i = 0; i < client.aClass192Array8301.length; i++)
	    client.aClass192Array8301[i] = null;
	client.aBool8544 = false;
	client.anInt8491 = ((int) (Math.random() * 100.0) - 50) * 1368877013;
	client.anInt8370 = ((int) (Math.random() * 110.0) - 55) * -334054455;
	client.anInt8521 = ((int) (Math.random() * 80.0) - 40) * 2001102403;
	client.anInt8513 = ((int) (Math.random() * 120.0) - 60) * 205222569;
	client.anInt8377 = ((int) (Math.random() * 30.0) - 20) * -415721163;
	client.aFloat8581
	    = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
	Class130.method3068(1903891589);
	for (int i = 0; i < 2048; i++)
	    client.localPlayers[i] = null;
	Class21.myPlayer = null;
	client.localNpcCount = 0;
	client.anInt8434 = 0;
	client.aClass407_8457.method7293(-322990204);
	client.aClass429_8478.method7652((byte) 84);
	client.aClass407_8454.method7293(641045320);
	client.aClass421_8376.method7521((byte) -65);
	client.aClass407_8452.method7293(4185387);
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
	    Class451.method10535(1629309841 * client.anInt8466, (byte) -2);
	for (Class241_Sub11 class241_sub11
		 = ((Class241_Sub11)
		    client.aClass407_8467.method7294(2090894173));
	     null != class241_sub11;
	     class241_sub11 = ((Class241_Sub11)
			       client.aClass407_8467.method7295(132537159))) {
	    if (!class241_sub11.hasNext((byte) 114)) {
		class241_sub11 = (Class241_Sub11) client.aClass407_8467
						      .method7294(2090894173);
		if (class241_sub11 == null)
		    break;
	    }
	    Class40.method1047(class241_sub11, true, false, -1747068960);
	}
	client.anInt8466 = -1376966001;
	client.aClass407_8467 = new HashTable(8);
	Class339.method6120(9232289);
	client.aClass58_8384 = null;
	for (int i = 0; i < 8; i++) {
	    client.playerOptionMessages[i] = null;
	    client.aBoolArray8450[i] = false;
	    client.playerOptionCursors[i] = -1;
	}
	Class540.method11933(-1700596407);
	client.aBool8540 = true;
	for (int i = 0; i < 108; i++)
	    client.aBoolArray8523[i] = true;
	for (int i = 0; i < 6; i++)
	    client.aClass220Array8426[i] = new Class220();
	client.aClass238_8477.method4833(1460383099).method11400(-618877084);
	client.aBool8392 = true;
	Class504.aShortArray6634 = ObjectDefinition.aShortArray6828
	    = NPCDefinition.aShortArray5800 = ItemDefinition.clientpalette
	    = new short[256];
	Class353.aString5444
	    = ClientMessage.WALKHERE.getLocalisedMessage(VarPlayerDomain.currentLocale,
						  (short) 29386);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870,
	     Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869
		 .method14352((byte) -21),
	     (byte) 2);
	client.anInt8342 = 0;
	Class122.method2983(-2108551949);
	Class583.aClass468_7582 = null;
	Class593.aLong7630 = 0L;
    }
    
    static void method660() {
	Exception_Sub5.aClass190_10704.method3880((byte) -32);
	((ServerConnection) Exception_Sub5.aClass190_10704)
	    .inputBuffer.pointer
	    = 0;
	((ServerConnection) Exception_Sub5.aClass190_10704).currentPacket = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2272 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2273 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2274 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).incommingPacketSize = 0;
	((ServerConnection) Exception_Sub5.aClass190_10704).anInt2269 = 0;
	client.systemUpdateTimer = 0;
	Class122.method2983(-2130049226);
	Class610.method13227((byte) 14);
	for (int i = 0; i < 2048; i++)
	    client.localPlayers[i] = null;
	Class21.myPlayer = null;
	for (int i = 0; i < client.anInt8434 * 743597371; i++) {
	    Entity class475_sub1_sub1_sub3
		= ((Entity)
		   client.aClass241_Sub26Array8276[i].objectValue);
	    if (class475_sub1_sub1_sub3 != null)
		class475_sub1_sub1_sub3.facingEntity = -1027225177;
	}
	Class540.method11933(-1682366939);
	Class592.method12924(Class520.method11690(30995025), -232264968);
	Class496.setClientStage(19, (byte) -87);
	for (int i = 0; i < 108; i++)
	    client.aBoolArray8523[i] = true;
	Class9.method573(Exception_Sub5.aClass190_10704, -1174561511);
	Class583.aClass468_7582 = null;
	Class593.aLong7630 = 0L;
	Class211.method4286((byte) -15);
	Class473.varClientDomain.method16180(-794399910);
    }
    
    static void method661() {
	Exception_Sub5.aClass190_10704.method3880((byte) 63);
	((ServerConnection) Exception_Sub5.aClass190_10704)
	    .inputBuffer.pointer
	    = 0;
	((ServerConnection) Exception_Sub5.aClass190_10704).currentPacket = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2272 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2273 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2274 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).incommingPacketSize = 0;
	((ServerConnection) Exception_Sub5.aClass190_10704).anInt2269 = 0;
	client.systemUpdateTimer = 0;
	Class122.method2983(-2142312976);
	Class610.method13227((byte) 88);
	for (int i = 0; i < 2048; i++)
	    client.localPlayers[i] = null;
	Class21.myPlayer = null;
	for (int i = 0; i < client.anInt8434 * 743597371; i++) {
	    Entity class475_sub1_sub1_sub3
		= ((Entity)
		   client.aClass241_Sub26Array8276[i].objectValue);
	    if (class475_sub1_sub1_sub3 != null)
		class475_sub1_sub1_sub3.facingEntity = -1027225177;
	}
	Class540.method11933(-682869253);
	Class592.method12924(Class520.method11690(-47898379), -476782882);
	Class496.setClientStage(19, (byte) -128);
	for (int i = 0; i < 108; i++)
	    client.aBoolArray8523[i] = true;
	Class9.method573(Exception_Sub5.aClass190_10704, -1689663379);
	Class583.aClass468_7582 = null;
	Class593.aLong7630 = 0L;
	Class211.method4286((byte) 14);
	Class473.varClientDomain.method16180(600208980);
    }
    
    static boolean method662(String string, String string_45_) {
	anInt77 = 78183201;
	Exception_Sub5.aClass190_10704 = client.aClass190_8340;
	return CcDeltaNode.method15095(false, false, string, string_45_,
					  -1L);
    }
    
    static boolean method663() {
	if (client.anInt8288 * 1766317249 != 17)
	    return false;
	if (Class261.method5091(206326165) || Class109.method2762(1055966275))
	    return false;
	return true;
    }
    
    static boolean method664() {
	if (client.anInt8288 * 1766317249 != 17)
	    return false;
	if (Class261.method5091(1584670671) || Class109.method2762(-437666704))
	    return false;
	return true;
    }
    
    static boolean method665(int i, int i_46_) {
	return (i == 59 || i == 2 || 8 == i || i == 17 || i == 15 || 16 == i
		|| i == 58);
    }
    
    public static void method666(byte i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 1,
	     (byte) 2);
	Class40.method1042(932869315);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 4,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(-909567015).method11400(-2056253341);
	client.aBool8307 = true;
    }
    
    static final void storeString/*method667*/(ClientScriptData scriptData, int i) {
    	scriptData.objectStack[(scriptData.objectStackPointer += -1650705371) * -290357331 - 1]
    			= scriptData.script
    				.objectConstants[1938982693 * scriptData.step];
    }
    
    static final void loadScript/*method668*/(ClientScriptData scriptData, byte i) {
		int scriptID = scriptData.integerConstants[scriptData.step * 1938982693];
		ClientScript newScript = ClanChannelDelta.method6938(scriptID, (byte) -18);
		if (newScript == null) {
			throw new RuntimeException();
		}
		int[] is = new int[newScript.anInt10814 * 1601258603];
		Object[] objects = new Object[1764338319 * newScript.anInt10811];
		long[] ls = new long[2113590673 * newScript.anInt10816];
		for (int i_48_ = 0; i_48_ < 132834641 * newScript.anInt10817; i_48_++)
			is[i_48_]
			= (scriptData.integerStack
			   [i_48_ + (scriptData.intStackPointer * 1482319719
					 - newScript.anInt10817 * 132834641)]);
		for (int i_49_ = 0; i_49_ < newScript.anInt10818 * 2025701481; i_49_++) {
			objects[i_49_]
			= (scriptData.objectStack
			   [(-290357331 * scriptData.objectStackPointer
				 - 2025701481 * newScript.anInt10818 + i_49_)]);
		}
		for (int i_50_ = 0; i_50_ < newScript.anInt10819 * 1997069839; i_50_++) {
			ls[i_50_] = scriptData.longStack
						[-735224571 * scriptData.anInt6231 - 1997069839 * newScript.anInt10819 + i_50_];
		}
		scriptData.intStackPointer -= 1563030151 * newScript.anInt10817;
		scriptData.objectStackPointer -= newScript.anInt10818 * -1853789395;
		scriptData.anInt6231 -= -72328445 * newScript.anInt10819;
		Class466 class466 = new Class466();
		((Class466) class466).aClass241_Sub39_Sub1_6315 = scriptData.script;
		((Class466) class466).anInt6314 = -391455379 * scriptData.step;
		((Class466) class466).anIntArray6316 = scriptData.integerVariables;
		((Class466) class466).anObjectArray6313 = scriptData.objectValues;
		((Class466) class466).aLongArray6317 = scriptData.aLongArray6222;
		if (-1018886827 * scriptData.anInt6227 >= scriptData.aClass466Array6228.length) {
			throw new RuntimeException();
		}
		scriptData.aClass466Array6228[(scriptData.anInt6227 += 2140327933) * -1018886827 - 1]
			= class466;
		scriptData.script = newScript;
		scriptData.actions = scriptData.script.actions;
		scriptData.integerConstants = scriptData.script.integerConstants;
		scriptData.step = -1924545709;
		scriptData.integerVariables = is;
		scriptData.objectValues = objects;
		scriptData.aLongArray6222 = ls;
    }
    
    static final void method669(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.isP2pWorld ? 1 : 0;
    }
    
    static final void method670(ClientScriptData class454, int i) {
	Class629.method13475(1883548346);
    }
    
    static final void getCurrentTime/*method671*/(ClientScriptData scriptData, int i) {
		long l = Class50.method1249((byte) 1);
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = (int) (l / 60000L);
    }
    
    static void method672(int i, int i_51_, int i_52_, boolean bool, int i_53_,
			  boolean bool_54_, int i_55_) {
	if (i < i_51_) {
	    int i_56_ = (i + i_51_) / 2;
	    int i_57_ = i;
	    Class507_Sub1 class507_sub1
		= Class395.aClass507_Sub1Array5780[i_56_];
	    Class395.aClass507_Sub1Array5780[i_56_]
		= Class395.aClass507_Sub1Array5780[i_51_];
	    Class395.aClass507_Sub1Array5780[i_51_] = class507_sub1;
	    for (int i_58_ = i; i_58_ < i_51_; i_58_++) {
		if (NPCDefinition.method7186((Class395.aClass507_Sub1Array5780
					 [i_58_]),
					class507_sub1, i_52_, bool, i_53_,
					bool_54_, (byte) 105)
		    <= 0) {
		    Class507_Sub1 class507_sub1_59_
			= Class395.aClass507_Sub1Array5780[i_58_];
		    Class395.aClass507_Sub1Array5780[i_58_]
			= Class395.aClass507_Sub1Array5780[i_57_];
		    Class395.aClass507_Sub1Array5780[i_57_++]
			= class507_sub1_59_;
		}
	    }
	    Class395.aClass507_Sub1Array5780[i_51_]
		= Class395.aClass507_Sub1Array5780[i_57_];
	    Class395.aClass507_Sub1Array5780[i_57_] = class507_sub1;
	    method672(i, i_57_ - 1, i_52_, bool, i_53_, bool_54_, -236787094);
	    method672(i_57_ + 1, i_51_, i_52_, bool, i_53_, bool_54_,
		      -673982506);
	}
    }
    
    public static void method673(int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 0,
	     (byte) 2);
	Class40.method1042(329783575);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 2,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(325194926).method11400(1197927224);
	client.aBool8307 = true;
    }
}
