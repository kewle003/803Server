/* Class614 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class614 implements Interface59
{
    public static Class614 aClass614_7805;
    public static Class614 aClass614_7806;
    public static Class614 aClass614_7807;
    public static Class614 aClass614_7808;
    public static Class614 aClass614_7809;
    public static Class614 aClass614_7810;
    public static Class614 aClass614_7811;
    static Class614 aClass614_7812;
    public static Class614 aClass614_7813 = new Class614("", 10);
    public static Class614 aClass614_7814;
    public static Class614 aClass614_7815;
    public int anInt7816;
    public static Class614 aClass614_7817;
    public static Class614 aClass614_7818;
    public static Class614 aClass614_7819;
    public static Class614 aClass614_7820;
    public static Class614 aClass614_7821;
    public static Class614 aClass614_7822;
    public static Class614 aClass614_7823;
    static Class614 aClass614_7824;
    public static Class614 aClass614_7825;
    public static Class614 aClass614_7826;
    
    static {
	aClass614_7806 = new Class614("", 11);
	aClass614_7807 = new Class614("", 12);
	aClass614_7819 = new Class614("", 13);
	aClass614_7809 = new Class614("", 14);
	aClass614_7810 = new Class614("", 15);
	aClass614_7811 = new Class614("", 16);
	aClass614_7808 = new Class614("", 17);
	aClass614_7815 = new Class614("", 18);
	aClass614_7814 = new Class614("", 19);
	aClass614_7822 = new Class614("", 20);
	aClass614_7825 = new Class614("", 21);
	aClass614_7817 = new Class614("", 22);
	aClass614_7818 = new Class614("", 23);
	aClass614_7826 = new Class614("", 24);
	aClass614_7820 = new Class614("", 25);
	aClass614_7821 = new Class614("", 26);
	aClass614_7805 = new Class614("", 27);
	aClass614_7823 = new Class614("", 28);
	aClass614_7824 = new Class614("", 73);
	aClass614_7812 = new Class614("", 76);
    }
    
    Class614(String string, int i) {
	anInt7816 = i * -1605897427;
    }
    
    public static void method13246(int i, String string, byte i_0_) {
	int i_1_ = 794073197 * GPI.viewportPlayerCount;
	int[] is = GPI.viewportPlayerIndicies;
	boolean bool = false;
	for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
	    Player player = client.localPlayers[is[i_2_]];
	    if (player != null && (player != Class21.myPlayer) 
	    		&& null != player.nameUnfiltered && player.nameUnfiltered.equalsIgnoreCase(string)) {
			OutgoingOpcode opcode = null;
			if (i == 1) {
				opcode = OutgoingOpcode.PLAYER_OPTION_1_PACKET;
			} else if (i == 4) {
				opcode = OutgoingOpcode.PLAYER_OPTION_4_PACKET;
			} else if (i == 5) {
				opcode = OutgoingOpcode.PLAYER_OPTION_5_PACKET;
			} else if (i == 6) {
				opcode = OutgoingOpcode.PLAYER_OPTION_6_PACKET;
			} else if (i == 7) {
				opcode = OutgoingOpcode.PLAYER_OPTION_7_PACKET;
			} else if (i == 9) {
				opcode = OutgoingOpcode.PLAYER_OPTION_9_PACKET;
			}
			if (opcode != null) {
			    Class241_Sub27 class241_sub27
				= Class445_Sub26.makePacket(opcode,
							     (client.aClass190_8340
							      .packetCipher),
							     16711935);
			    class241_sub27.data
				.writeShortA(is[i_2_], -1976131462);
			    class241_sub27.data
				.writeByte(0, -1149924045);
			    client.aClass190_8340.sendPacket(class241_sub27,
							     -2030896755);
			}
			bool = true;
			break;
	    }
	}
	if (!bool)
	    Class629.appendClientMessage(4,
				 new StringBuilder().append
				     (ClientMessage.UNABLETOFIND.getLocalisedMessage
				      (VarPlayerDomain.currentLocale, (short) 32714))
				     .append
				     (string).toString(),
				 -1519542919);
    }
    
    static final void method13247(ClientScriptData class454, int i) {
	Class241_Sub16 class241_sub16
	    = (Class241_Sub16) (((ClientScriptData) class454).objectStack
				[(((ClientScriptData) class454).objectStackPointer
				  -= -1650705371) * -290357331]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class241_sub16.anInt8979 * 810948919;
    }
}
