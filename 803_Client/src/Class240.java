/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class240
{
    public static String aString2769;
    public static String aString2770;
    public static String aString2771;
    static String aString2772;
    public static GraphicsDefinitionLoader graphicsDefLoader;//aClass457_2773
    
    Class240() throws Throwable {
	throw new Error();
    }
    
    static {
	String string = "Unknown";
	try {
	    string = System.getProperty("java.vendor").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("java.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.name").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString2771 = string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString2769 = string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString2772 = string.toLowerCase();
	aString2770 = String.format("%s (%s) [%s]",
				    new Object[] { aString2771, aString2769,
						   aString2772 });
	string = "~/";
	try {
	    string = System.getProperty("user.home").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	new File(string);
    }
    
    static final void method4886(InterfaceComponent class58, ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_1_
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       - 1);
	int i_2_ = i_1_;
	if (6 != -982148763 * class58.modelType
	    && -982148763 * class58.modelType != 2)
	    throw new RuntimeException("");
	NPCDefinition class401
	    = MasterIndex.npcDefLoader.getNpcDefinition(class58.anInt879 * 1965460551,
						 -1645250079);
	if (null == class58.aClass404_1014)
	    class58.aClass404_1014
		= new Class404(class401, 6 == class58.modelType * -982148763);
	class58.aClass404_1014.aLong5882
	    = Class247.method4945((byte) 1) * 7399085059860748217L;
	if (null != class401.aByteArray5814) {
	    if (i_1_ < 0 || i_1_ >= class401.aByteArray5814.length)
		throw new RuntimeException("");
	    i_2_ = class401.aByteArray5814[i_1_];
	}
	if (class401.aShortArray5849 == null || i_2_ < 0
	    || i_2_ >= class401.aShortArray5849.length)
	    throw new RuntimeException("");
	class58.aClass404_1014.aShortArray5883[i_2_] = (short) i_0_;
	WorldType.refreshComponent(class58, -1680966601);
    }
    
    static final void method4887(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.isQcWorld ? 1 : 0;
    }
    
    static final void storeFcUserIsPlayer/*method4888*/(ClientScriptData scriptData, int i) {
		int index = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		if (Class350.currentFcUsers != null
				&& index < -612332369 * Class357_Sub1.currentFcSize
				&& Class350.currentFcUsers[index].replyToName.equalsIgnoreCase(Class21.myPlayer.nameUnfiltered)) {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= 1;
		} else {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= 0;
		}
    }
    
    static final void method4889(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.anInt8385 * 1957253445 - client.anInt8390 * 1189851199;
    }
    
    static final void method4890(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class261.method5091(-1620013050) ? 1 : 0;
    }
    
    public static String stripCode/*method4891*/(String string, int i) {
		int length = string.length();
		int codeLength = 0;
		for (int index = 0; index < length; index++) {
		    char c = string.charAt(index);
		    if ('<' == c || c == '>') {
		    	codeLength += 3;
		    }
		}
		StringBuilder output = new StringBuilder(length + codeLength);
		for (int index = 0; index < length; index++) {
		    char c = string.charAt(index);
		    if (c == '<') {
		    	output.append("<lt>");
		    } else if ('>' == c) {
		    	output.append("<gt>");
		    } else {
		    	output.append(c);
		    }
		}
		return output.toString();
    }
    
    public static final void joinFriendsChat/*method4892*/(String ownerName, byte i) {
		if (!ownerName.equals("")) {
			ServerConnection conn = ClanChannelDelta.method6943(-986033218);
			Class241_Sub27 packet = Class445_Sub26.makePacket(
					OutgoingOpcode.JOIN_FRIENDS_CHAT_PACKET,
					conn.packetCipher, 16711935);
			packet.data.writeByte(Class421.getEncodedStringLength(ownerName, -1814059262), -1523677379);
			packet.data.writeString(ownerName, 393068327);
			conn.sendPacket(packet, -1545360874);
		}
    }
}
