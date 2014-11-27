/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133
{
    static Class168[] aClass168Array1613;
    static Class133 aClass133_1614;
    static Class133 aClass133_1615;
    static Class168 aClass168_1616;
    static Class133 aClass133_1617 = new Class133();
    
    Class133() {
	/* empty */
    }
    
    static {
	aClass133_1614 = new Class133();
	aClass133_1615 = new Class133();
    }
    
    public static void method3086(String string, int i) {
	if (client.anInt8288 * 1766317249 == 8) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4022,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(0, -565673285);
	    int i_0_ = (421967667
			* class241_sub27.data.pointer);
	    class241_sub27.data.writeString(string,
								-700792840);
	    class241_sub27.data.pointer += -472333347;
	    class241_sub27.data.method14665
		(Class9.anIntArray50, i_0_,
		 421967667 * class241_sub27.data.pointer,
		 337924691);
	    class241_sub27.data.endPacketVarByte
		((421967667 * class241_sub27.data.pointer
		  - i_0_),
		 2145817594);
	    client.aClass190_8339.sendPacket(class241_sub27, -1494361910);
	    GameShell3$FrameParameters.aClass425_4007 = Class425.aClass425_6076;
	}
    }
    
    public static int method3087(int i) {
	return -835485591 * Class68.anInt1062;
    }
    
    static final void method3088(ClientScriptData scriptData, int i) {
		int i_1_ = (scriptData.integerConstants[scriptData.step * 1938982693] >> 16);
		int i_2_ = (scriptData.integerConstants[scriptData.step * 1938982693] & 0xffff);
		int i_3_ = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		if (i_3_ < 0 || i_3_ > 5000) {
		    throw new RuntimeException();
		}
		scriptData.anIntArray6219[i_1_] = i_3_;
		int i_4_ = -1;
		if (105 == i_2_) {
		    i_4_ = 0;
		}
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			scriptData.anIntArrayArray6220[i_1_][i_5_] = i_4_;
		}
    }
    
    public static Class326 method3089(RSByteBuffer class241_sub3, int i) {
	Class326 class326 = Class257.method5058(class241_sub3, 2034683528);
	int i_6_ = class241_sub3.readBigSmart((byte) 78);
	int i_7_ = class241_sub3.readBigSmart((byte) 14);
	int i_8_ = class241_sub3.readBigSmart((byte) -44);
	int i_9_ = class241_sub3.readBigSmart((byte) 88);
	int i_10_ = class241_sub3.readBigSmart((byte) 82);
	int i_11_ = class241_sub3.readBigSmart((byte) -4);
	return new Class326_Sub1(class326.aClass330_5008,
				 class326.aClass324_5007,
				 601610705 * class326.anInt5014,
				 -942384019 * class326.anInt5009,
				 class326.anInt5006 * -664032457,
				 524993587 * class326.anInt5011,
				 -305994951 * class326.anInt5012,
				 class326.anInt5013 * -2074180427,
				 -401483607 * class326.anInt5010, i_6_, i_7_,
				 i_8_, i_9_, i_10_, i_11_);
    }
    
    public static final void method3090(int i, int i_12_) {
	if (null != Class324.mainClanChannel
	    && (i >= 0
		&& i < 81956567 * Class324.mainClanChannel.memberCount)) {
	    ClanChannelUser class373
		= Class324.mainClanChannel.channelUsers[i];
	    if (-1 == class373.rank) {
		ServerConnection class190 = ClanChannelDelta.method6943(-1901976848);
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4058,
						 class190.packetCipher,
						 16711935);
		class241_sub27.data.writeByte
		    (2 + Class421.getEncodedStringLength(class373.displayName,
					     -1968938131),
		     -1343030414);
		class241_sub27.data
		    .writeShort(i, -484048531);
		class241_sub27.data
		    .writeString(class373.displayName, -1974455477);
		class190.sendPacket(class241_sub27, -2078897623);
	    }
	}
    }
    
    static void method3091(int i) {
	/* empty */
    }
}
