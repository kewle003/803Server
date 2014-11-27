/* Class579 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class Class579 implements Interface47
{
    static Class579 aClass579_7557 = new Class579(0);
    public static Class579 aClass579_7558 = new Class579(1);
    int anInt7559;
    public static Class279_Sub1[] cacheFiles;//aClass279_Sub1Array7560
    
    public int method10() {
	return ((Class579) this).anInt7559 * -38691031;
    }
    
    public int method9() {
	return ((Class579) this).anInt7559 * -38691031;
    }
    
    static Class579[] method12704() {
	return new Class579[] { aClass579_7557, aClass579_7558 };
    }
    
    public int getId(byte i) {
	return ((Class579) this).anInt7559 * -38691031;
    }
    
    public int method11() {
	return ((Class579) this).anInt7559 * -38691031;
    }
    
    public int method147() {
	return ((Class579) this).anInt7559 * -38691031;
    }
    
    static Class579[] method12705() {
	return new Class579[] { aClass579_7557, aClass579_7558 };
    }
    
    static Class579[] method12706() {
	return new Class579[] { aClass579_7557, aClass579_7558 };
    }
    
    Class579(int i) {
	((Class579) this).anInt7559 = -1792316135 * i;
    }
    
    static final void method12707(ClientScriptData class454, int i) {
	int i_0_ = Class241_Sub5_Sub9.aClass241_Sub9_11043
		       .aClass445_Sub26_8869.method14352((byte) -20);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1) ? 0 : i_0_,
	     (byte) 2);
	Class514.method11576((byte) -1);
    }
    
    static final void method12708(ClientScriptData class454, byte i) {
	Js5Archive.method1388(1375714169);
    }
    
    static final void method12709(int i, int i_1_, int i_2_, int i_3_,
				  byte i_4_) {
	for (int i_5_ = 0; i_5_ < -787147009 * client.anInt8396; i_5_++) {
	    Rectangle rectangle = client.aRectangleArray8525[i_5_];
	    if (rectangle.width + rectangle.x > i && rectangle.x < i_2_ + i
		&& rectangle.y + rectangle.height > i_1_
		&& rectangle.y < i_3_ + i_1_)
		client.aBoolArray8523[i_5_] = true;
	}
    }
    
    static final void method12710(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_7_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class120_Sub19.method16845(i_6_, i_7_, true, false, -1130885408);
    }
    
    public static InterfaceDefinition method12711(int i, int i_8_) {
	return Class187.aClass35Array2203[i >> 16];
    }
    
    static void method12712(byte i) {
	if (Class236.aClass103_2713 != null) {
	    client.aClass238_8477.method4786(-185681490);
	    Class55.method1371(1628918677);
	    Class590.method12911(-583580992);
	    Class277.method5370(-209804591);
	    client.aClass238_8477.method4741(192458183);
	    Class357.method6462((byte) -88);
	    LongNode.method15108((short) 31575);
	    Class599.method13149(false, 1082746064);
	    Class92.method2069((byte) -119);
	    CsDeltaNode.method14871(-1903297317);
	    Class249.method5004(127123796);
	    for (int i_9_ = 0; i_9_ < client.aClass246Array8302.length;
		 i_9_++) {
		if (null != client.aClass246Array8302[i_9_])
		    client.aClass246Array8302[i_9_].aClass89_3967 = null;
	    }
	    for (int i_10_ = 0; i_10_ < 2048; i_10_++) {
		Player class475_sub1_sub1_sub3_sub1
		    = client.localPlayers[i_10_];
		if (null != class475_sub1_sub1_sub3_sub1) {
		    for (int i_11_ = 0;
			 i_11_ < (class475_sub1_sub1_sub3_sub1
				  .aClass89Array11435).length;
			 i_11_++)
			class475_sub1_sub1_sub3_sub1.aClass89Array11435[i_11_]
			    = null;
		}
	    }
	    for (int i_12_ = 0; i_12_ < 743597371 * client.anInt8434;
		 i_12_++) {
		NPC class475_sub1_sub1_sub3_sub2
		    = ((NPC)
		       client.aClass241_Sub26Array8276[i_12_].objectValue);
		if (null != class475_sub1_sub1_sub3_sub2) {
		    for (int i_13_ = 0;
			 i_13_ < (class475_sub1_sub1_sub3_sub2
				  .aClass89Array11435).length;
			 i_13_++)
			class475_sub1_sub1_sub3_sub2.aClass89Array11435[i_13_]
			    = null;
		}
	    }
	    client.aClass407_8454.method7293(-1967545166);
	    Class236.aClass103_2713.method2220((byte) 0);
	    Class236.aClass103_2713 = null;
	}
    }
}
