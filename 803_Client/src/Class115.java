/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class115
{
    String aString1529;
    Class38 aClass38_1530;
    String aString1531;
    int anInt1532 = 1038909459;
    Class38 aClass38_1533;
    public int[] anIntArray1534;
    public int[] anIntArray1535;
    static String aString1536;
    
    void method2799(Class54 class54, int i) {
	int i_0_ = class54.method1300(1582508574);
	((Class115) this).aClass38_1533 = Class40.method1050(847532933)[i_0_];
	if (((Class115) this).aClass38_1533 == Class38.aClass38_460) {
	    int i_1_ = class54.method1300(1495535146);
	    ((Class115) this).aClass38_1530
		= Class40.method1050(847532933)[i_1_];
	    ((Class115) this).anInt1532
		= class54.method1300(2146800106) * -1038909459;
	}
	((Class115) this).aString1529 = class54.method1298(28698380);
	((Class115) this).aString1531 = class54.method1298(812491644);
	int i_2_ = class54.method1300(1985698115);
	anIntArray1534 = new int[i_2_];
	anIntArray1535 = new int[i_2_];
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    anIntArray1534[i_3_] = class54.method1300(1721841826);
	    anIntArray1535[i_3_] = class54.method1300(1711310622);
	}
    }
    
    Class115() {
	/* empty */
    }
    
    void method2800(Class54 class54) {
	int i = class54.method1300(1833313970);
	((Class115) this).aClass38_1533 = Class40.method1050(847532933)[i];
	if (((Class115) this).aClass38_1533 == Class38.aClass38_460) {
	    int i_4_ = class54.method1300(1738621528);
	    ((Class115) this).aClass38_1530
		= Class40.method1050(847532933)[i_4_];
	    ((Class115) this).anInt1532
		= class54.method1300(1883422687) * -1038909459;
	}
	((Class115) this).aString1529 = class54.method1298(-1763106161);
	((Class115) this).aString1531 = class54.method1298(-1503768981);
	int i_5_ = class54.method1300(1645613861);
	anIntArray1534 = new int[i_5_];
	anIntArray1535 = new int[i_5_];
	for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
	    anIntArray1534[i_6_] = class54.method1300(1640232352);
	    anIntArray1535[i_6_] = class54.method1300(1854371931);
	}
    }
    
    static final void sendTextInput/*method2801*/(ClientScriptData scriptData, short i) {
		String text = (String) scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331];
		Class241_Sub27 packet = Class445_Sub26.makePacket(
				OutgoingOpcode.ENTER_NAME_PACKET,
				client.aClass190_8340.packetCipher, 16711935);
		packet.data.writeByte(text.length() + 1, -113268302);
		packet.data.writeString(text, -1507500983);
		client.aClass190_8340.sendPacket(packet, -1840810174);
    }
    
    static final void moduloValues/*method2802*/(ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= -821458770;
		int val1 = scriptData.integerStack[scriptData.intStackPointer * 1482319719];
		int val2 = scriptData.integerStack[1 + scriptData.intStackPointer * 1482319719];
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = val1 % val2;
    }
    
    public static Class507_Sub1 method2803(int i, byte i_9_) {
	if (!Class509.aBool6680 || i < Class120_Sub15.anInt10541 * 1652918313
	    || i > -505875311 * Class509.anInt6681)
	    return null;
	return (Class509.aClass507_Sub1Array6676
		[i - 1652918313 * Class120_Sub15.anInt10541]);
    }
}
