/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class83
{
    static Class83 aClass83_1153;
    static Class83 aClass83_1154 = new Class83(0, 4);
    static Class83 aClass83_1155;
    int anInt1156;
    public int anInt1157;
    public static String osName;//aString1158
    
    public static Class83 method1827(int i) {
	Class83[] class83s = Class112.method2779(-1612114981);
	for (int i_0_ = 0; i_0_ < class83s.length; i_0_++) {
	    Class83 class83 = class83s[i_0_];
	    if (((Class83) class83).anInt1156 * -1013075467 == i)
		return class83;
	}
	return null;
    }
    
    static Class83[] method1828() {
	return new Class83[] { aClass83_1155, aClass83_1153, aClass83_1154 };
    }
    
    static Class83[] method1829() {
	return new Class83[] { aClass83_1155, aClass83_1153, aClass83_1154 };
    }
    
    static {
	aClass83_1153 = new Class83(1, 5);
	aClass83_1155 = new Class83(2, 6);
    }
    
    static Class83[] method1830() {
	return new Class83[] { aClass83_1155, aClass83_1153, aClass83_1154 };
    }
    
    Class83(int i, int i_1_) {
	((Class83) this).anInt1156 = -1278037411 * i;
	anInt1157 = -89532601 * i_1_;
    }
    
    static final void method1831(InterfaceComponent class58, ClientScriptData class454, byte i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_3_
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       - 1);
	int i_4_ = i_3_;
	if (-982148763 * class58.modelType != 6
	    && -982148763 * class58.modelType != 2)
	    throw new RuntimeException("");
	NPCDefinition class401
	    = MasterIndex.npcDefLoader.getNpcDefinition(class58.anInt879 * 1965460551,
						 -874285732);
	if (null == class58.aClass404_1014)
	    class58.aClass404_1014
		= new Class404(class401, class58.modelType * -982148763 == 6);
	class58.aClass404_1014.aLong5882
	    = Class247.method4945((byte) 1) * 7399085059860748217L;
	if (null != class401.aByteArray5815) {
	    if (i_3_ < 0 || i_3_ >= class401.aByteArray5815.length)
		throw new RuntimeException("");
	    i_4_ = class401.aByteArray5815[i_3_];
	}
	if (class401.aShortArray5813 == null || i_4_ < 0
	    || i_4_ >= class401.aShortArray5813.length)
	    throw new RuntimeException("");
	class58.aClass404_1014.aShortArray5884[i_4_] = (short) i_2_;
	WorldType.refreshComponent(class58, -556346941);
    }
    
    static final void method1832(ClientScriptData class454, int i) {
	ServerConnection class190 = ClanChannelDelta.method6943(-1412293541);
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4075,
					 class190.packetCipher, 16711935);
	class241_sub27.data.writeByte(0, 277809764);
	int i_5_
	    = class241_sub27.data.pointer * 421967667;
	class241_sub27.data.writeByte(2, 1098507748);
	class241_sub27.data.writeShort
	    (-1422545021 * ((ClientScriptData) class454).aClass333_6242.anInt5058,
	     -484048531);
	((ClientScriptData) class454).aClass333_6242.aClass241_Sub39_Sub9_5059
	    .method17176
	    (class241_sub27.data,
	     ((ClientScriptData) class454).aClass333_6242.anIntArray5060, 56142522);
	class241_sub27.data.endPacketVarByte
	    ((421967667 * class241_sub27.data.pointer
	      - i_5_),
	     1485353667);
	class190.sendPacket(class241_sub27, -1940612992);
    }
    
    static void method1833(int i) {
	Exception_Sub5.aClass190_10704.method3880((byte) 36);
	((ServerConnection) Exception_Sub5.aClass190_10704)
	    .inputBuffer.pointer
	    = 0;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2272 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2273 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2274 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).anInt2269 = 0;
	client.systemUpdateTimer = 0;
	Class456.method10576(1000710262);
	client.friendListStage = 0;
	client.friendListSize = 0;
	client.ignoreListSize = 0;
	client.currentFriendsChatName = null;
	Class357_Sub1.currentFcSize = 0;
	Class350.currentFcUsers = null;
	Class24.guestClanSettings = null;
	GraphicsDefinitionLoader.mainClanSettings = null;
	Class70.method1726(-510492883);
	for (int i_6_ = 0;
	     i_6_ < ((Class19) Class1.aClass19_11).skills.length;
	     i_6_++) {
	    SkillData class498
		= new SkillData(Class227.skillTypeList.method11455(i_6_,
								   2107271413),
			       false);
	    class498.setExperience(0, -1505361764);
	    class498.setCurrentLevel(0, 1940137379);
	    ((Class19) Class1.aClass19_11).skills[i_6_] = class498;
	}
	Class1.aClass19_11.varPlayerDomain.method11638((short) 4105);
	RSByteBuffer.method14846(1865777541);
	Class9.method573(Exception_Sub5.aClass190_10704, -1653347165);
    }
    
    static boolean method1834(int i) {
	return Class16.anInt148 * 1327183635 > 0;
    }
}
