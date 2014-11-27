/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PlayerRights implements Interface47
{
    static PlayerRights JMOD;//aClass328_5021
    static PlayerRights PMOD;//aClass328_5022
    static PlayerRights VIP;//aClass328_5023
    static PlayerRights LMOD;//aClass328_5024
    public boolean ignorable;//aBool5025
    static PlayerRights NORMAL = new PlayerRights(0, -1, true, false, true);//aClass328_5026
    int rightsID;//anInt5027
    public int chatIcon;//anInt5028
    public boolean bypassChatFilter;//aBool5029
    static PlayerRights VIP_PMOD;//aClass328_5030
    
    public int method147() {
    	return -1806616721 * rightsID;
    }
    
    public int getId(byte i) {
    	return -1806616721 * rightsID;
    }
    
    static {
		PMOD = new PlayerRights(1, 0, true, true, true);
		JMOD = new PlayerRights(2, 1, true, true, false);
		LMOD = new PlayerRights(3, 8, false, true, true);
		VIP = new PlayerRights(4, 9, false, false, true);
		VIP_PMOD = new PlayerRights(5, 10, false, true, true);
    }
    
    public int method11() {
    	return -1806616721 * rightsID;
    }
    
    public int method10() {
    	return -1806616721 * rightsID;
    }
    
    public static PlayerRights[] method6019() {
	return (new PlayerRights[]
		{ PMOD, NORMAL, VIP,
		  VIP_PMOD, JMOD, LMOD });
    }
    
    public int method9() {
	return -1806616721 * rightsID;
    }
    
    public static PlayerRights[] method6020() {
	return (new PlayerRights[]
		{ PMOD, NORMAL, VIP,
		  VIP_PMOD, JMOD, LMOD });
    }
    
    public static PlayerRights[] method6021() {
	return (new PlayerRights[]
		{ PMOD, NORMAL, VIP,
		  VIP_PMOD, JMOD, LMOD });
    }
    
    PlayerRights(int id, int icon, boolean bool, boolean bool_1_, boolean bool_2_) {
		rightsID = id * -725481585;
		chatIcon = icon * 364387213;
		bypassChatFilter = bool_1_;
		ignorable = bool_2_;
    }
    
    public static PlayerRights[] method6022() {
	return (new PlayerRights[]
		{ PMOD, NORMAL, VIP,
		  VIP_PMOD, JMOD, LMOD });
    }
    
    static final void method6023(ClientScriptData class454, int i) {
	if ((((ClientScriptData) class454).integerStack
	     [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	    == 1)
	    ((ClientScriptData) class454).step
		+= (1924545709
		    * (((ClientScriptData) class454).integerConstants
		       [((ClientScriptData) class454).step * 1938982693]));
    }
    
    static final void storeClanMinTalk/*method6024*/(ClientScriptData scriptData, int i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = scriptData.clanSettings.rankTalk;
    }
    
    static final void method6025(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	Class83.method1831(class58, class454, (byte) 21);
    }
    
    public static final void leaveFriendsChat/*method6026*/(int i) {
		ServerConnection conn = ClanChannelDelta.method6943(-1375148613);
		Class241_Sub27 packet = Class445_Sub26.makePacket(
				OutgoingOpcode.JOIN_FRIENDS_CHAT_PACKET,
				conn.packetCipher, 16711935);
		packet.data.writeByte(0, 129564613);
		conn.sendPacket(packet, -1917646914);
    }
}
