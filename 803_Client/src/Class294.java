/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class294
{
    static Class294 aClass294_4495;
    public static Class294 aClass294_4496 = new Class294(1);
    int anInt4497;
    protected static int frameWid;//anInt4498
    
    Class294(int i) {
	((Class294) this).anInt4497 = 2134562939 * i;
    }
    
    static {
	aClass294_4495 = new Class294(0);
    }
    
    static final void method5697(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -65) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray945
	    = Class299.extractCs2Params(string, class454, -186654283);
	class58.hasClientScript = true;
    }
    
    static final void method5698(ClientScriptData class454, byte i) {
	ClientScriptCaller.method14987((byte) -3);
    }
    
    static final void method5699(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = ((ClientScriptData) class454).clanSettings.ownerSlot * -749252521;
    }
    
    public static final void sendFriendNote/*method5700*/(String friendName, String note, int i) {
		ServerConnection conn = ClanChannelDelta.method6943(-1693716288);
		Class241_Sub27 packet = Class445_Sub26.makePacket(
				OutgoingOpcode.FRIEND_NOTE_PACKET,
				conn.packetCipher, 16711935);
		if (note.length() > 30) {
			note = note.substring(0, 30);
		}
		packet.data.writeByte(
				(Class421.getEncodedStringLength(friendName, -1816037873) + Class421.getEncodedStringLength(note, -1855247435)),
				26511872);
		packet.data.writeString(note, 251695518);
		packet.data.writeString(friendName, 1589217128);
		conn.sendPacket(packet, -1838268635);
    }
    
    static void method5701(Entity class475_sub1_sub1_sub3,
			   int i, int i_1_) {
	if (null != class475_sub1_sub1_sub3.anIntArray11397) {
	    Class448 class448
		= ((Class448)
		   Class531.method11848(Class84.method1836(-2082114073), i,
					1078291785));
	    int i_2_ = (class475_sub1_sub1_sub3.anIntArray11397
			[class448.method7917(-1022559071)]);
	    if (i_2_ != class475_sub1_sub1_sub3.aClass409_11375
			    .method7346(-1093020604)) {
		class475_sub1_sub1_sub3.aClass409_11375.method7348
		    (i_2_, class475_sub1_sub1_sub3.aClass409_11375
			       .method7354((byte) 82), -1534700758);
		class475_sub1_sub1_sub3.anInt11430
		    = class475_sub1_sub1_sub3.queuedStepCount * -1740946833;
	    }
	}
    }
}
