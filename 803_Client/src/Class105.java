/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.EventQueue;

public abstract class Class105
{
    static EventQueue eventQueue;//anEventQueue1486
    
    public abstract int method2653();
    
    abstract boolean method114();
    
    public abstract int method2654();
    
    public abstract void method28();
    
    abstract boolean method162();
    
    public abstract int method2655();
    
    public abstract int method2656();
    
    public abstract int method2657();
    
    Class105() {
	/* empty */
    }
    
    abstract boolean method115();
    
    public abstract void method164();
    
    abstract boolean method2658();
    
    abstract boolean method2659();
    
    public abstract void method148();
    
    public abstract void method149();
    
    public abstract int method2660();
    
    static final void method2661(ClientScriptData class454, int i) {
	client.aClass58_8365 = null;
	client.aClass58_8499 = null;
    }
    
    public static final void kickClanUser/*method2662*/(boolean isMainCc, int memberIndex, int i_0_) {
		ClanChannel channel = (isMainCc ? Class324.mainClanChannel : Class239.guestClanChannel);
		if (channel != null && memberIndex >= 0
		    && memberIndex < 81956567 * channel.memberCount) {
		    ClanChannelUser ccUser = channel.channelUsers[memberIndex];
		    if (-1 == ccUser.rank) {
				String name = ccUser.displayName;
				ServerConnection conn = ClanChannelDelta.method6943(-1219026958);
				Class241_Sub27 packet = Class445_Sub26.makePacket(
						OutgoingOpcode.CLAN_KICKUSER,
						conn.packetCipher, 16711935);
				packet.data.writeByte(
						3 + Class421.getEncodedStringLength(name, -2084457221), -1675850081);
				packet.data.writeByte(isMainCc ? 1 : 0, 1166240826);
				packet.data.writeShort(memberIndex, -484048531);
				packet.data.writeString(name, -1746869710);
				conn.sendPacket(packet, -1868853902);
		    }
		}
    }
    
    static int method2663(int i) {
	int i_1_ = Class86.currentLoadingStage.anInt5478 * -601665271;
	if (i_1_ < Class68.aClass359Array1065.length - 1)
	    Class86.currentLoadingStage = Class68.aClass359Array1065[1 + i_1_];
	return 100;
    }
}
