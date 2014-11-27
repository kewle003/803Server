/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class68
{
    static Interface37[] anInterface37Array1056;
    static int[] anIntArray1057
	= { 6, 4, 1, 2, 0, 4, 0, 50, 2, 2, 2, 0, 2, 1, 5, 0, 2, 1, 1, 1, 1, 1,
	    0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2 };
    static boolean aBool1058;
    static int anInt1059;
    static Class615 aClass615_1060;
    static JS5 aClass210_1061;
    static int anInt1062;
    static final String aString1063 = " - ";
    static boolean aBool1064;
    static LoadingScreenDef[] aClass359Array1065;
    static int anInt1066;
    
    static void method1649(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 67);
	    if (0 == i)
		break;
	    if (i == 1)
		Class501.anInt6587
		    = class241_sub3.readUnsignedShort(1162222719) * 430086479;
	}
    }
    
    static {
	if (Class84.aBool1159) {
	    anIntArray1057[0] += anIntArray1057[14];
	    anIntArray1057[14] = 0;
	    anIntArray1057[0] += anIntArray1057[40];
	    anIntArray1057[40] = 0;
	}
	anInt1059 = 1586779297;
	aBool1064 = false;
	anInt1066 = -309641425;
    }
    
    static void method1650(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -70);
	    if (0 == i)
		break;
	    if (i == 1)
		Class501.anInt6587
		    = class241_sub3.readUnsignedShort(1162222719) * 430086479;
	}
    }
    
    public static void method1651() {
	aBool1064 = true;
	Class349.aString5383 = Class13.aString112;
	Class445_Sub11.aString8646 = Class13.aString113;
	Class362_Sub1.gameLogout(false, 1114327050);
	Class86.method1850(620294792);
	aClass359Array1065 = null;
	Class281.aClass280_4428 = null;
	Class496.setClientStage(0, (byte) -101);
    }
    
    public static void method1652() {
	aBool1064 = true;
	Class349.aString5383 = Class13.aString112;
	Class445_Sub11.aString8646 = Class13.aString113;
	Class362_Sub1.gameLogout(false, 753507404);
	Class86.method1850(620294792);
	aClass359Array1065 = null;
	Class281.aClass280_4428 = null;
	Class496.setClientStage(0, (byte) -108);
    }
    
    public static void method1653(boolean bool) {
	if (null == CcDeltaNode.aClass70_9022)
	    Class524.method11748(1185445791);
	if (bool)
	    CcDeltaNode.aClass70_9022.method1699(-1661385496);
    }
    
    public static void method1654(boolean bool) {
	if (null == CcDeltaNode.aClass70_9022)
	    Class524.method11748(647721622);
	if (bool)
	    CcDeltaNode.aClass70_9022.method1699(486783454);
    }
    
    public static void method1655(boolean bool) {
	if (null == CcDeltaNode.aClass70_9022)
	    Class524.method11748(-449623825);
	if (bool)
	    CcDeltaNode.aClass70_9022.method1699(1814938874);
    }
    
    public static int method1656() {
	return -811276229 * Class421.anInt6039;
    }
    
    public static void method1657() {
	if (aClass359Array1065 == null) {
	    aClass359Array1065 = LoadingScreenDef.method6479(1415923089);
	    Class86.currentLoadingStage = aClass359Array1065[0];
	    Class445_Sub3.aLong8621
		= Class50.method1249((byte) 1) * -4219732048522441833L;
	}
	if (null == CcDeltaNode.aClass70_9022)
	    Class524.method11748(-502798423);
	LoadingScreenDef class359 = Class86.currentLoadingStage;
	int i = Class118.runClientLoading((byte) 18);
	if (Class86.currentLoadingStage == class359) {
	    Class116.aString1545
		= ((LoadingScreenDef) Class86.currentLoadingStage).aClass635_5476
		      .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 22157);
	    Class115.aString1536 = Class116.aString1545;
	    if (((LoadingScreenDef) Class86.currentLoadingStage).aBool5499)
		Class474.anInt6386
		    = (-1148753783
		       * (i * (633090493 * (((LoadingScreenDef) Class86.currentLoadingStage)
					    .anInt5497)
			       - (-1299978731
				  * (((LoadingScreenDef) Class86.currentLoadingStage)
				     .anInt5496))) / 100
			  + -1299978731 * (((LoadingScreenDef) Class86.currentLoadingStage)
					   .anInt5496)));
	    if (((LoadingScreenDef) Class86.currentLoadingStage).aBool5498)
		Class115.aString1536
		    = new StringBuilder().append(Class115.aString1536).append
			  (" - ").append
			  (159550905 * Class474.anInt6386).append
			  ("%").toString();
	} else if (Class86.currentLoadingStage == LoadingScreenDef.LOADING_STAGE_17) {
	    CcDeltaNode.aClass70_9022 = null;
	    Class496.setClientStage(17, (byte) -5);
	    if (aBool1064) {
		aBool1064 = false;
		Class241_Sub11.method14943(Class349.aString5383,
					   Class445_Sub11.aString8646,
					   -1818687548);
	    }
	} else {
	    Class116.aString1545
		= ((LoadingScreenDef) class359).aClass635_5495
		      .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 31322);
	    Class115.aString1536 = Class116.aString1545;
	    if (((LoadingScreenDef) Class86.currentLoadingStage).aBool5498)
		Class115.aString1536
		    = new StringBuilder().append(Class115.aString1536).append
			  (((LoadingScreenDef) class359).anInt5497 * 633090493).append
			  ("%").toString();
	    Class474.anInt6386 = ((LoadingScreenDef) class359).anInt5497 * -275356123;
	    if (((LoadingScreenDef) Class86.currentLoadingStage).aBool5499
		|| ((LoadingScreenDef) class359).aBool5499)
		Class445_Sub3.aLong8621
		    = Class50.method1249((byte) 1) * -4219732048522441833L;
	}
	if (CcDeltaNode.aClass70_9022 != null) {
	    CcDeltaNode.aClass70_9022.method1696
		(520848576188654631L * Class445_Sub3.aLong8621,
		 Class116.aString1545, Class115.aString1536,
		 Class474.anInt6386 * 159550905, Class86.currentLoadingStage,
		 -68014115);
	    if (anInterface37Array1056 != null) {
		for (int i_0_ = 1698263199 * anInt1059 + 1;
		     i_0_ < anInterface37Array1056.length; i_0_++) {
		    if ((anInterface37Array1056[i_0_].method199(-610002903)
			 >= 100)
			&& anInt1059 * 1698263199 == i_0_ - 1
			&& 1766317249 * client.anInt8288 != 0
			&& CcDeltaNode.aClass70_9022
			       .method1694(1242050872)) {
			try {
			    anInterface37Array1056[i_0_]
				.method195(-1477543924);
			} catch (Exception exception) {
			    anInterface37Array1056 = null;
			    break;
			}
			CcDeltaNode.aClass70_9022.method1695
			    (anInterface37Array1056[i_0_], -1867770715);
			anInt1059 += -1586779297;
			if ((1698263199 * anInt1059
			     >= anInterface37Array1056.length - 1)
			    && anInterface37Array1056.length > 1)
			    anInt1059 = (aClass615_1060.method13252(1916895623)
					 ? 0 : -1) * -1586779297;
		    }
		}
	    }
	}
    }
    
    public static void method1658() {
	if (anInterface37Array1056 != null) {
	    Interface37[] interface37s = anInterface37Array1056;
	    for (int i = 0; i < interface37s.length; i++) {
		Interface37 interface37 = interface37s[i];
		interface37.method195(-1477543924);
	    }
	}
    }
    
    public static void method1659() {
	if (anInterface37Array1056 != null) {
	    Interface37[] interface37s = anInterface37Array1056;
	    for (int i = 0; i < interface37s.length; i++) {
		Interface37 interface37 = interface37s[i];
		interface37.method195(-1477543924);
	    }
	}
    }
    
    static int method1660() {
	int i = Class86.currentLoadingStage.anInt5478 * -601665271;
	if (i < aClass359Array1065.length - 1)
	    Class86.currentLoadingStage = aClass359Array1065[1 + i];
	return 100;
    }
    
    Class68() throws Throwable {
	throw new Error();
    }
    
    static int method1661() {
	int i = Class86.currentLoadingStage.anInt5478 * -601665271;
	if (i < aClass359Array1065.length - 1)
	    Class86.currentLoadingStage = aClass359Array1065[1 + i];
	return 100;
    }
    public static int method1666() {
	return CcDeltaNode.aClass70_9022.method1692(905689068);
    }
    
    public static int method1667() {
	return CcDeltaNode.aClass70_9022.method1692(905689068);
    }
    
    static void method1668(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -22);
	    if (0 == i)
		break;
	    if (i == 1)
		Class501.anInt6587
		    = class241_sub3.readUnsignedShort(1162222719) * 430086479;
	}
    }
    
    static void method1669(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -52);
	    if (0 == i)
		break;
	    if (i == 1) {
		int i_21_ = class241_sub3.readUnsignedShort(1162222719);
		Class402.soundManager.method1165(i_21_, (byte) 29);
	    }
	}
    }
    
    public static int method1670() {
	return -835485591 * anInt1062;
    }
    
    public static int method1671() {
	return -835485591 * anInt1062;
    }
    
    public static int method1672() {
	return -835485591 * anInt1062;
    }
    
    static int method1673() {
	int i = Class86.currentLoadingStage.anInt5478 * -601665271;
	if (i < aClass359Array1065.length - 1)
	    Class86.currentLoadingStage = aClass359Array1065[1 + i];
	return 100;
    }
    
    public static void method1674() {
	if (CcDeltaNode.aClass70_9022 != null)
	    CcDeltaNode.aClass70_9022.method1703((byte) -79);
	if (null != Class384.aThread5701) {
	    for (;;) {
		try {
		    Class384.aThread5701.join();
		    break;
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
    
    static void method1675(int i) {
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub3_8885
		.method14100((short) -17620)
	    == 1)
	    Class277.aClass236_4389.method4707(new Class234((MapType
							     .aClass235_2707),
							    null),
					       -179305294);
	else {
	    client.aClass238_8477.method4768((byte) 5);
	    Class55.method1371(1646546113);
	}
    }
    
    public static boolean method1676(String string, int i, String string_22_,
				     int i_23_) {
		if (i == 0) {
		    boolean bool;
		    try {
			if (!Class242.aString2780.startsWith("win"))
			    throw new Exception();
			if (!string.startsWith("http://")
			    && !string.startsWith("https://"))
			    throw new Exception();
			String string_24_
			    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
			for (int i_25_ = 0; i_25_ < string.length(); i_25_++) {
			    if (string_24_.indexOf(string.charAt(i_25_)) == -1)
				throw new Exception();
			}
			Runtime.getRuntime().exec(new StringBuilder().append
						      ("cmd /c start \"j\" \"").append
						      (string).append
						      ("\"").toString());
			bool = true;
		    } catch (Throwable throwable) {
			return false;
		    }
		    return bool;
		}
		if (i == 1) {
		    boolean bool;
		    try {
			Object object
			    = Class396.method7104(Class242.anApplet2781, string_22_,
						  (new Object[]
						   { new URL(Class242.anApplet2781
								 .getCodeBase(),
							     string).toString() }),
						  -1115332279);
			bool = null != object;
		    } catch (Throwable throwable) {
			return false;
		    }
		    return bool;
		}
		if (2 == i) {
		    boolean bool;
		    try {
			Class242.anApplet2781.getAppletContext().showDocument
			    (new URL(Class242.anApplet2781.getCodeBase(), string),
			     "_blank");
			bool = true;
		    } catch (Exception exception) {
			return false;
		    }
		    return bool;
		}
		if (i == 3) {
		    try {
			Class396.callNoParamater(Class242.anApplet2781, "loggedout",
					    (byte) -93);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		    boolean bool;
		    try {
			Class242.anApplet2781.getAppletContext().showDocument
			    (new URL(Class242.anApplet2781.getCodeBase(), string),
			     "_top");
			bool = true;
		    } catch (Exception exception) {
			return false;
		    }
		    return bool;
		}
		throw new IllegalArgumentException();
    }
    
    static final void method1677(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_26_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_27_ = (((ClientScriptData) class454).integerStack
		     [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = CursorType.method13500(i_26_, i_27_, false, -982148763);
    }
    
    static void method1678(int i, int i_28_, int i_29_, int i_30_, int i_31_) {
	Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(20, (long) i_28_ << 32 | (long) i);
	class241_sub39_sub13.method17279((byte) 0);
	((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941
	    = -1741260507 * i_29_;
	((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951
	    = 1861259375 * i_30_;
    }
    
    static final void method1679(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class135.method3101(class58, class35, class454, (byte) 36);
    }
}
