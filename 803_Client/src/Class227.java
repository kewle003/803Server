/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class227
{
    public static SkillDefaults skillTypeList;//aClass502_2669
    
    public static void method4651(boolean bool) {
	Class402.soundManager.method1235(392621058);
	if (Class120_Sub1.method15109(client.anInt8288 * 1766317249,
				      -1115250553)) {
	    ServerConnection[] class190s = client.aClass190Array8397;
	    for (int i = 0; i < class190s.length; i++) {
		ServerConnection class190 = class190s[i];
		class190.anInt2262 += 1768708987;
		if (1352485811 * class190.anInt2262 < 50 && !bool)
		    return;
		class190.anInt2262 = 0;
		if (!class190.aBool2275
		    && class190.getIO(1670649259) != null) {
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.PING_PACKET,
						     class190.packetCipher,
						     16711935);
		    class190.sendPacket(class241_sub27, -1967448832);
		    try {
			class190.method3894((byte) 100);
		    } catch (IOException ioexception) {
			class190.aBool2275 = true;
		    }
		}
	    }
	    Class402.soundManager.method1235(-456973236);
	}
    }
    
    public static void method4652(boolean bool) {
	Class402.soundManager.method1235(766816938);
	if (Class120_Sub1.method15109(client.anInt8288 * 1766317249,
				      2010891065)) {
	    ServerConnection[] class190s = client.aClass190Array8397;
	    for (int i = 0; i < class190s.length; i++) {
		ServerConnection class190 = class190s[i];
		class190.anInt2262 += 1768708987;
		if (1352485811 * class190.anInt2262 < 50 && !bool)
		    return;
		class190.anInt2262 = 0;
		if (!class190.aBool2275
		    && class190.getIO(-301059297) != null) {
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.PING_PACKET,
						     class190.packetCipher,
						     16711935);
		    class190.sendPacket(class241_sub27, -1642106345);
		    try {
			class190.method3894((byte) 100);
		    } catch (IOException ioexception) {
			class190.aBool2275 = true;
		    }
		}
	    }
	    Class402.soundManager.method1235(-702001505);
	}
    }
    
    Class227() throws Throwable {
	throw new Error();
    }
    
    public static void method4653(boolean bool) {
	Class402.soundManager.method1235(653678825);
	if (Class120_Sub1.method15109(client.anInt8288 * 1766317249,
				      -457756365)) {
	    ServerConnection[] class190s = client.aClass190Array8397;
	    for (int i = 0; i < class190s.length; i++) {
		ServerConnection class190 = class190s[i];
		class190.anInt2262 += 1768708987;
		if (1352485811 * class190.anInt2262 < 50 && !bool)
		    return;
		class190.anInt2262 = 0;
		if (!class190.aBool2275
		    && class190.getIO(1604998656) != null) {
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.PING_PACKET,
						     class190.packetCipher,
						     16711935);
		    class190.sendPacket(class241_sub27, -1883590416);
		    try {
			class190.method3894((byte) 100);
		    } catch (IOException ioexception) {
			class190.aBool2275 = true;
		    }
		}
	    }
	    Class402.soundManager.method1235(1122947295);
	}
    }
    
    static final void method4654(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class21.myPlayer.aClass8_11406
		  .method514((byte) 28) >> 3;
    }
    
    static final void method4655(ClientScriptData class454, int i) {
	if (1 == Class441.anInt6159 * -1271209509)
	    Class200.aBool2395 = true;
	else if (-1271209509 * Class441.anInt6159 == 3)
	    Class200.aBool2397 = true;
    }
}
