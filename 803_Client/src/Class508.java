/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class Class508
{
    public static Class508 aClass508_6672;
    static Class508 aClass508_6673;
    static Class508 aClass508_6674 = new Class508(0);
    public static JS5 MODELS_ARCHIVE;//aClass210_6675
    
    static {
	aClass508_6673 = new Class508(1);
	aClass508_6672 = new Class508(2);
    }
    
    Class508(int i) {
	/* empty */
    }
    
    static final void method11510(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -5);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.anInt870 * 89728509;
    }
    
    static final void method11511(ClientScriptData class454, byte i) {
	String string = "";
	if (null != Class12.aClipboard74) {
	    Transferable transferable = Class12.aClipboard74.getContents(null);
	    if (transferable != null) {
		try {
		    string
			= (String) transferable.getTransferData(DataFlavor
								.stringFlavor);
		    if (null == string)
			string = "";
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = string;
    }
    
    static boolean method11512(Interface24 interface24, int i) {
	ObjectDefinition class526
	    = client.aClass238_8477.getObjectLoader(-1891069776)
		  .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	if (-1 == -1848119147 * class526.anInt6864)
	    return true;
	Class601 class601
	    = Class8.aClass598_46.method13117(-1848119147 * class526.anInt6864,
					      -1638866305);
	if (class601.anInt7729 * 1186810875 == -1)
	    return true;
	return class601.method13161(-853152358);
    }
    
    static final void method11513(ClientScriptData class454, int i) {
	if (client.anInt8508 * -1699772257 >= 5
	    && client.anInt8508 * -1699772257 <= 9)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= client.anInt8508 * -1699772257;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    public static final void sendIgnoreNote/*method11514*/(String ignoreName, String note, int i) {
		ServerConnection conn = ClanChannelDelta.method6943(-1979092558);
		Class241_Sub27 packet = Class445_Sub26.makePacket(
				OutgoingOpcode.IGNORE_NOTE_PACKET,
				conn.packetCipher, 16711935);
		if (note.length() > 30) {
			note = note.substring(0, 30);
		}
		packet.data.writeByte(
				Class421.getEncodedStringLength(ignoreName, -1796309503) + Class421.getEncodedStringLength(note, -1756150568),
				390482931);
		packet.data.writeString(ignoreName, -516664421);
		packet.data.writeString(note, -380651698);
		conn.sendPacket(packet, -1921794616);
    }
    
    static final void method11515(ClientScriptData class454, int i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = Class123.aClass292_1579.method5686(i_2_, (byte) 35).aString10966;
    }
}
