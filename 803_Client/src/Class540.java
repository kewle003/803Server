/* Class540 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Method;

public class Class540
{
    static Class241_Sub39_Sub11 aClass241_Sub39_Sub11_7002;
    public static int anInt7003;
    
    public static void method11925(float f, Class287 class287,
				   Class278 class278, Class287 class287_0_,
				   Class287 class287_1_, Class287 class287_2_,
				   float f_3_, float f_4_, float f_5_) {
	if (!class287_0_.method5601(class287)) {
	    Class287 class287_6_ = Class287.method5561(0.0F, 0.0F, 0.0F);
	    Class287 class287_7_
		= Class287.method5562(Class287.method5578(class287_0_,
							  class287));
	    class287_7_.method5592(class278);
	    Class287 class287_8_
		= Class287.method5578(class287_7_, class287_6_);
	    float f_9_ = class287_8_.method5559();
	    if (Float.POSITIVE_INFINITY == class287_2_.aFloat4477
		|| Float.isNaN(class287.aFloat4477) || f_9_ > f_4_
		|| f_9_ < f_5_) {
		class287.method5655(class287_0_);
		class287_1_.method5645();
	    } else {
		class278.method5390();
		Class287 class287_10_ = Class287.method5561(1.0F, 0.0F, 0.0F);
		Class287 class287_11_ = Class287.method5561(0.0F, 1.0F, 0.0F);
		Class287 class287_12_ = Class287.method5561(0.0F, 0.0F, 1.0F);
		class287_10_.method5592(class278);
		class287_11_.method5592(class278);
		class287_12_.method5592(class278);
		Class287 class287_13_
		    = Class287.method5561(Class287.method5580(class287_10_,
							      class287_1_),
					  Class287.method5580(class287_11_,
							      class287_1_),
					  Class287.method5580(class287_12_,
							      class287_1_));
		Class287 class287_14_ = Class287.method5562(class287_13_);
		Class287 class287_15_
		    = (Class287.method5561
		       (class287_8_.aFloat4477 * class287_2_.aFloat4477,
			class287_8_.aFloat4474 * class287_2_.aFloat4474,
			class287_2_.aFloat4479 * class287_8_.aFloat4479));
		class287_14_.method5651(class287_15_, f);
		class287_14_.method5588(f_3_);
		Class287 class287_16_
		    = Class287.method5591(class287_10_,
					  class287_14_.aFloat4477);
		class287_16_.method5651(class287_11_, class287_14_.aFloat4474);
		class287_16_.method5651(class287_12_, class287_14_.aFloat4479);
		class287_1_.method5655(class287_16_);
		class287.method5574(Class287.method5591(class287_1_, f));
	    }
	}
    }
    
    Class540() throws Throwable {
	throw new Error();
    }
    
    public static void method11926
	(float f, Class287 class287, Class278 class278, Class287 class287_17_,
	 Class287 class287_18_, Class287 class287_19_, float f_20_,
	 float f_21_, float f_22_) {
	if (!class287_17_.method5601(class287)) {
	    Class287 class287_23_ = Class287.method5561(0.0F, 0.0F, 0.0F);
	    Class287 class287_24_
		= Class287.method5562(Class287.method5578(class287_17_,
							  class287));
	    class287_24_.method5592(class278);
	    Class287 class287_25_
		= Class287.method5578(class287_24_, class287_23_);
	    float f_26_ = class287_25_.method5559();
	    if (Float.POSITIVE_INFINITY == class287_19_.aFloat4477
		|| Float.isNaN(class287.aFloat4477) || f_26_ > f_21_
		|| f_26_ < f_22_) {
		class287.method5655(class287_17_);
		class287_18_.method5645();
	    } else {
		class278.method5390();
		Class287 class287_27_ = Class287.method5561(1.0F, 0.0F, 0.0F);
		Class287 class287_28_ = Class287.method5561(0.0F, 1.0F, 0.0F);
		Class287 class287_29_ = Class287.method5561(0.0F, 0.0F, 1.0F);
		class287_27_.method5592(class278);
		class287_28_.method5592(class278);
		class287_29_.method5592(class278);
		Class287 class287_30_
		    = Class287.method5561(Class287.method5580(class287_27_,
							      class287_18_),
					  Class287.method5580(class287_28_,
							      class287_18_),
					  Class287.method5580(class287_29_,
							      class287_18_));
		Class287 class287_31_ = Class287.method5562(class287_30_);
		Class287 class287_32_
		    = (Class287.method5561
		       (class287_25_.aFloat4477 * class287_19_.aFloat4477,
			class287_25_.aFloat4474 * class287_19_.aFloat4474,
			class287_19_.aFloat4479 * class287_25_.aFloat4479));
		class287_31_.method5651(class287_32_, f);
		class287_31_.method5588(f_20_);
		Class287 class287_33_
		    = Class287.method5591(class287_27_,
					  class287_31_.aFloat4477);
		class287_33_.method5651(class287_28_, class287_31_.aFloat4474);
		class287_33_.method5651(class287_29_, class287_31_.aFloat4479);
		class287_18_.method5655(class287_33_);
		class287.method5574(Class287.method5591(class287_18_, f));
	    }
	}
    }
    
    public static void method11927
	(float f, Class287 class287, Class278 class278, Class287 class287_34_,
	 Class287 class287_35_, Class287 class287_36_, float f_37_,
	 float f_38_, float f_39_) {
	if (!class287_34_.method5601(class287)) {
	    Class287 class287_40_ = Class287.method5561(0.0F, 0.0F, 0.0F);
	    Class287 class287_41_
		= Class287.method5562(Class287.method5578(class287_34_,
							  class287));
	    class287_41_.method5592(class278);
	    Class287 class287_42_
		= Class287.method5578(class287_41_, class287_40_);
	    float f_43_ = class287_42_.method5559();
	    if (Float.POSITIVE_INFINITY == class287_36_.aFloat4477
		|| Float.isNaN(class287.aFloat4477) || f_43_ > f_38_
		|| f_43_ < f_39_) {
		class287.method5655(class287_34_);
		class287_35_.method5645();
	    } else {
		class278.method5390();
		Class287 class287_44_ = Class287.method5561(1.0F, 0.0F, 0.0F);
		Class287 class287_45_ = Class287.method5561(0.0F, 1.0F, 0.0F);
		Class287 class287_46_ = Class287.method5561(0.0F, 0.0F, 1.0F);
		class287_44_.method5592(class278);
		class287_45_.method5592(class278);
		class287_46_.method5592(class278);
		Class287 class287_47_
		    = Class287.method5561(Class287.method5580(class287_44_,
							      class287_35_),
					  Class287.method5580(class287_45_,
							      class287_35_),
					  Class287.method5580(class287_46_,
							      class287_35_));
		Class287 class287_48_ = Class287.method5562(class287_47_);
		Class287 class287_49_
		    = (Class287.method5561
		       (class287_42_.aFloat4477 * class287_36_.aFloat4477,
			class287_42_.aFloat4474 * class287_36_.aFloat4474,
			class287_36_.aFloat4479 * class287_42_.aFloat4479));
		class287_48_.method5651(class287_49_, f);
		class287_48_.method5588(f_37_);
		Class287 class287_50_
		    = Class287.method5591(class287_44_,
					  class287_48_.aFloat4477);
		class287_50_.method5651(class287_45_, class287_48_.aFloat4474);
		class287_50_.method5651(class287_46_, class287_48_.aFloat4479);
		class287_35_.method5655(class287_50_);
		class287.method5574(Class287.method5591(class287_35_, f));
	    }
	}
    }
    
    static final void setOnlineStatus/*method11928*/(ClientScriptData scriptData, int i) {
	scriptData.intStackPointer -= 915295493;
	client.publicChatStatus = 868091143 * scriptData.integerStack[scriptData.intStackPointer * 1482319719];
	Class38.currentOnlineStatus
	    = Class3.method463(scriptData.integerStack[1 + (scriptData.intStackPointer * 1482319719)], 877627580);
	if (Class38.currentOnlineStatus == null) {
	    Class38.currentOnlineStatus = OnlineStatus.FRIENDS;
        }
	client.tradeStatus = scriptData.integerStack[scriptData.intStackPointer * 1482319719 + 2] * 78873981;
	ServerConnection conn = ClanChannelDelta.method6943(-1892786902);
	Class241_Sub27 packet = Class445_Sub26.makePacket(
                OutgoingOpcode.SET_CHATFILTERSETTINGS,
                conn.packetCipher, 16711935);
	packet.data.writeByte(client.publicChatStatus * 1460689079, 375368516);
	packet.data.writeByte(1473893111 * Class38.currentOnlineStatus.opcode, -1555691932);
	packet.data.writeByte(client.tradeStatus * 741399509, 963358422);
	conn.sendPacket(packet, -1967717247);
    }
    
    static final void method11929(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class26.method951(string, 1737496332);
    }
    
    static final void method11930(ClientScriptData class454, short i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_51_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_52_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	int i_53_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	Class134.createComponent((((ClientScriptData) class454)
			     .varEntity.aClass35_11437),
			    i_51_ & 0xffff, i_52_, i_53_,
			    ((ClientScriptData) class454).aBool6246, class454,
			    (byte) 0);
    }
    
    public static void method11931(byte i) {
	Class325.aClass129_4952.reset(-1068486427);
    }
    
    public static void method11932(Canvas canvas, int i) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    static void method11933(int i) {
	Class241_Sub34.aClass407_10083.method7293(548531403);
    }
}
