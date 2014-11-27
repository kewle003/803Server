/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class62
{
    static Huffman huffmanEncoder;//aClass82_1028
    static int anInt1029;
    
    Class62() throws Throwable {
	throw new Error();
    }
    
    public static String method1609(RSByteBuffer class241_sub3) {
	return Class241_Sub39_Sub12.huffmanDecrypt(class241_sub3, 32767,
						2066731325);
    }
    
    public static void method1610(Huffman class82) {
	huffmanEncoder = class82;
    }
    
    public static void method1611(Huffman class82) {
	huffmanEncoder = class82;
    }
    
    public static int method1612(RSByteBuffer class241_sub3, String string) {
	int i = 421967667 * class241_sub3.pointer;
	byte[] is = Class542.getMessageData(string, 468558693);
	class241_sub3.writePSmart(is.length, -2121792536);
	class241_sub3.pointer
	    += huffmanEncoder.encryptMessage(is, 0, is.length,
					class241_sub3.payload,
					class241_sub3.pointer * 421967667,
					(byte) 60) * -681042949;
	return class241_sub3.pointer * 421967667 - i;
    }
    
    public static String method1613(RSByteBuffer class241_sub3) {
	return Class241_Sub39_Sub12.huffmanDecrypt(class241_sub3, 32767,
						2057250200);
    }
    
    static String method1614(RSByteBuffer class241_sub3, int i) {
	String string;
	try {
	    int i_0_ = class241_sub3.readSmart((short) -19759);
	    if (i_0_ > i)
		i_0_ = i;
	    byte[] is = new byte[i_0_];
	    class241_sub3.pointer
		+= (huffmanEncoder.decryptMessage(class241_sub3.payload,
					     (421967667
					      * class241_sub3.pointer),
					     is, 0, i_0_, (byte) -10)
		    * -681042949);
	    String string_1_ = Class95.getMessageFromBytes(is, 0, i_0_, -949072930);
	    string = string_1_;
	} catch (Exception exception) {
	    return "Cabbage";
	}
	return string;
    }
    
    static final void method1615(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 3]);
	Class287 class287
	    = Class287.method5561((float) i_2_, (float) i_3_, (float) i_4_);
	if (-1.0F == class287.aFloat4477)
	    class287.aFloat4477 = Float.POSITIVE_INFINITY;
	if (-1.0F == class287.aFloat4474)
	    class287.aFloat4474 = Float.POSITIVE_INFINITY;
	if (class287.aFloat4479 == -1.0F)
	    class287.aFloat4479 = Float.POSITIVE_INFINITY;
	Class445_Sub16.aClass351_Sub1_8660.method6263(class287, (byte) -110);
	Class445_Sub16.aClass351_Sub1_8660.method6260((float) i_5_ / 1000.0F,
						      1789825217);
	class287.method5564();
    }
    
    static final void method1616(InterfaceComponent class58, ClientScriptData class454, int i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_7_
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       - 1);
	if (-982148763 * class58.modelType != 6)
	    throw new RuntimeException("");
	NPCDefinition class401
	    = MasterIndex.npcDefLoader.getNpcDefinition(1965460551 * class58.anInt879,
						 -1304749689);
	if (class58.aClass404_1014 == null)
	    class58.aClass404_1014 = new Class404(class401, true);
	class58.aClass404_1014.aLong5882
	    = Class247.method4945((byte) 1) * 7399085059860748217L;
	if (i_7_ < 0 || i_7_ >= class401.modelIDs.length)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i_7_).toString());
	class58.aClass404_1014.anIntArray5879[i_7_] = i_6_;
	WorldType.refreshComponent(class58, 791050580);
    }
    
    static final void method1617(int i) {
	Class371.aClass476_5573.method10909((byte) 1);
	Class120_Sub12.aClass394_10530.method7060((byte) 62);
	CS2MapList.aClass350_6031.method6242(1046784641);
	client.aClass238_8477.getObjectLoader(-1848033924).method11856((byte) -78);
	MasterIndex.npcDefLoader.method7232(16711935);
	JS5.itemDefLoader.method13290(1616796015);
	Class394.animationDefLoader.method12300((short) 32767);
	Class240.graphicsDefLoader.method10591(-366324074);
	Class541.aClass199_Sub1_7008.cacheRemoveSoftReferences((byte) 74);
	Class177.VAR_PLAYER_LIST.cacheRemoveSoftReferences((short) 31967);
	Class333.VAR_NPC_LIST.cacheRemoveSoftReferences(-840876376);
	Class443.VAR_CLAN_LIST.cacheRemoveSoftReferences(1811270251);
	VarBitType.VAR_CLAN_SETTINGS_LIST.cacheRemoveSoftReferences(365413651);
	Class79.aClass539_1138.method11910((byte) -96);
	Class8.aClass598_46.method13123(2021184221);
	Class441.aClass524_6158.method11739(1729356744);
	Class621.paramTypeList.cacheRemoveSoftReferences((short) -31956);
	Class380.aClass577_5657.method12677(-74399999);
	Class326.aClass74_5015.method1753((byte) 0);
	Class120_Sub8.aClass619_10502.method13326(-977297934);
	GameShell3.cursorTypeList.cacheRemoveSoftReferences((byte) 1);
	Class633.hitMarkTypeList.cacheRemoveSoftReferences((byte) 8);
	IncommingOpcode.aClass581_5298.method12751((byte) -121);
	Class337.method6084((byte) 119);
	Class206.method4089((byte) 105);
	Class425.aClass344_6080.method6145(1414081589);
	Class445_Sub9.method14185(1746164299);
	Class533.method11876(1894473422);
	client.aClass129_8325.removeSoftReferences((byte) -4);
	client.aClass129_8326.removeSoftReferences((byte) -6);
	Class16.aClass129_172.removeSoftReferences((byte) -41);
	Class450.aClass129_6196.removeSoftReferences((byte) -3);
	client.aClass129_8580.removeSoftReferences((byte) 63);
    }
    
    static boolean method1618(int i, int i_8_) {
	return 57 == i || i == 58 || i == 1007 || 25 == i || i == 30;
    }
}
