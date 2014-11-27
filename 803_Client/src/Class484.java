/* Class484 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class Class484
{
    static Class464_Sub1 aClass464_Sub1_6463;
    static Class464_Sub2 aClass464_Sub2_6464;
    static boolean aBool6465;
    static int anInt6466;
    static long aLong6467 = 6972232757595454843L;
    static Queue aQueue6468;
    
    public static void method11049() {
	Class426.method7581(910091424);
	aClass464_Sub1_6463.method10681((byte) 118);
	aClass464_Sub2_6464.method10681((byte) 109);
	if (802559093 * client.anInt8317 > 0) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.EVENT_KEYBOARD,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data
		.writeShort(client.anInt8317 * -1084730924, -484048531);
	    for (int i = 0; i < 802559093 * client.anInt8317; i++) {
		Interface58 interface58 = client.anInterface58Array8318[i];
		long l = (interface58.method435(1482319719)
			  - -6111726823487216051L * aLong6467);
		if (l > 16777215L)
		    l = 16777215L;
		aLong6467 = (interface58.method435(1482319719)
			     * -6972232757595454843L);
		class241_sub27.data.writeByte
		    (interface58.getKeyCode(-883962889), 1006996463);
		class241_sub27.data.writeTriByte((int) l,
								    494249962);
	    }
	    client.aClass190_8340.sendPacket(class241_sub27, -1762233609);
	}
	if (-1280722955 * anInt6466 > 0)
	    anInt6466 -= -833094563;
	if (client.aBool8392 && -1280722955 * anInt6466 <= 0) {
	    anInt6466 = 517977924;
	    client.aBool8392 = false;
	    int i;
	    int i_0_;
	    if (115241065 * Class296.anInt4513 == 4) {
		if (Class445_Sub16.aClass351_Sub1_8660
			.method6332((short) -3058)
		    == Class39.aClass39_586) {
		    Class380_Sub2 class380_sub2
			= (Class380_Sub2) Class445_Sub16
					      .aClass351_Sub1_8660
					      .method6283(2104691016);
		    i = Class553.method12255(class380_sub2.aClass278_10406,
					     523028124) >> 3;
		    int i_1_ = 1024;
		    i_0_ = (i_1_ * 3 - (Class322.method5956((class380_sub2
							     .aClass278_10406),
							    (byte) 2)
					>> 3)) % (i_1_ * 2);
		} else {
		    i = 0;
		    i_0_ = 0;
		}
	    } else {
		i = (int) client.aFloat8406 >> 3;
		i_0_ = (int) client.aFloat8581 >> 3;
	    }
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.CAMERA_MOVEMENT_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShortA(i_0_,
								-387197516);
	    class241_sub27.data.writeShort(i, -484048531);
	    client.aClass190_8340.sendPacket(class241_sub27, -1552349714);
	}
	if (aBool6465 != Class47.isWindowFocused) {
	    aBool6465 = Class47.isWindowFocused;
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.EVENT_APPLET_FOCUS,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data
		.writeByte(Class47.isWindowFocused ? 1 : 0, 1150033277);
	    client.aClass190_8340.sendPacket(class241_sub27, -1695683980);
	}
	if (!client.aBool8297) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.REFLECTION_CHECK_REPLY,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(0, -936949546);
	    int i = (421967667
		     * class241_sub27.data.pointer);
	    RSByteBuffer class241_sub3
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .method14910(2037250150);
	    class241_sub27.data.writeBytes
		(class241_sub3.payload, 0,
		 class241_sub3.pointer * 421967667, 752061035);
	    class241_sub27.data.endPacketVarByte
		((class241_sub27.data.pointer * 421967667
		  - i),
		 2003141133);
	    client.aClass190_8340.sendPacket(class241_sub27, -1565439039);
	    client.aBool8297 = true;
	}
    }
    
    Class484() throws Throwable {
	throw new Error();
    }
    
    static {
	anInt6466 = 0;
	aBool6465 = true;
	aClass464_Sub1_6463 = new Class464_Sub1();
	aClass464_Sub2_6464 = new Class464_Sub2();
	aQueue6468 = new LinkedList();
    }
    
    public static void method11050() {
	Class120_Sub8.method16777((byte) -95);
    }
    
    public static void method11051() {
	if (Class468.method10746(1104818933))
	    Entity.method17870(new Class472(), -1024620592);
    }
    
    public static void method11052() {
	Class120_Sub8.method16777((byte) -72);
    }
    
    public static void method11053() {
	Class120_Sub8.method16777((byte) -8);
    }
    
    static void method11054() {
	synchronized (aQueue6468) {
	    Point point;
	    if (Class344.canvas.isShowing())
		point = Class344.canvas.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class241_Sub24_Sub1 class241_sub24_sub1
		    = (Class241_Sub24_Sub1) aQueue6468.poll();
		if (null == class241_sub24_sub1)
		    break;
		if (null == point || !Class344.canvas.isShowing()
		    || !Class47.isWindowFocused)
		    class241_sub24_sub1.method15070(-65327075);
		else {
		    class241_sub24_sub1.method17009(point, (short) 10848);
		    if (!class241_sub24_sub1.method17008((byte) 26)
			&& (class241_sub24_sub1.getX((byte) -68)
			    < Class494.canvasWid * -1080559003)
			&& (class241_sub24_sub1.getY((byte) 27)
			    < Class67.canvasHei * 963058943)
			&& class241_sub24_sub1.getX((byte) -9) >= 0
			&& class241_sub24_sub1.getY((byte) 29) >= 0) {
			int i = class241_sub24_sub1.method15064(439348282);
			if (class241_sub24_sub1.method15064(358814181) == -1)
			    aClass464_Sub2_6464
				.method10683(class241_sub24_sub1, 1175720415);
			else if (Class298.method5736(i, -938250717))
			    aClass464_Sub2_6464
				.method14613(class241_sub24_sub1, 1369956649);
		    }
		}
	    }
	}
    }
    
    public static void method11055(Class241_Sub24 class241_sub24) {
	if (!Class120_Sub1.method15109(client.anInt8288 * 1766317249,
				       -263832258))
	    class241_sub24.method15070(-1880164881);
	else
	    aClass464_Sub1_6463.method10683(class241_sub24, -984620379);
    }
    
    public static void method11056() {
	Class120_Sub8.method16777((byte) -87);
    }
    
    public static void method11057() {
	aClass464_Sub1_6463.method10682(-1231811563);
	aClass464_Sub2_6464.method10682(-1231811563);
	aLong6467 = 6972232757595454843L;
	aBool6465 = true;
    }
    
    static void method11058() {
	synchronized (aQueue6468) {
	    Point point;
	    if (Class344.canvas.isShowing())
		point = Class344.canvas.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class241_Sub24_Sub1 class241_sub24_sub1
		    = (Class241_Sub24_Sub1) aQueue6468.poll();
		if (null == class241_sub24_sub1)
		    break;
		if (null == point || !Class344.canvas.isShowing()
		    || !Class47.isWindowFocused)
		    class241_sub24_sub1.method15070(-333227283);
		else {
		    class241_sub24_sub1.method17009(point, (short) 2939);
		    if (!class241_sub24_sub1.method17008((byte) 28)
			&& (class241_sub24_sub1.getX((byte) 25)
			    < Class494.canvasWid * -1080559003)
			&& (class241_sub24_sub1.getY((byte) 110)
			    < Class67.canvasHei * 963058943)
			&& class241_sub24_sub1.getX((byte) -83) >= 0
			&& class241_sub24_sub1.getY((byte) 90) >= 0) {
			int i = class241_sub24_sub1.method15064(1210791028);
			if (class241_sub24_sub1.method15064(637039649) == -1)
			    aClass464_Sub2_6464
				.method10683(class241_sub24_sub1, -1442938919);
			else if (Class298.method5736(i, -938250717))
			    aClass464_Sub2_6464
				.method14613(class241_sub24_sub1, 70297456);
		    }
		}
	    }
	}
    }
    
    public static void method11059() {
	synchronized (aQueue6468) {
	    for (;;) {
		Class241_Sub24_Sub1 class241_sub24_sub1
		    = (Class241_Sub24_Sub1) aQueue6468.poll();
		if (null == class241_sub24_sub1)
		    break;
		class241_sub24_sub1.method15070(-1347471172);
	    }
	}
    }
    
    public static void method11060(Class241_Sub24 class241_sub24) {
	if (!Class120_Sub1.method15109(client.anInt8288 * 1766317249,
				       207573182))
	    class241_sub24.method15070(-451070988);
	else
	    aClass464_Sub1_6463.method10683(class241_sub24, 1804056704);
    }
    
    public static void method11061() {
	synchronized (aQueue6468) {
	    for (;;) {
		Class241_Sub24_Sub1 class241_sub24_sub1
		    = (Class241_Sub24_Sub1) aQueue6468.poll();
		if (null == class241_sub24_sub1)
		    break;
		class241_sub24_sub1.method15070(-931732748);
	    }
	}
    }
    
    public static void method11062() {
	Class426.method7581(-148030525);
	aClass464_Sub1_6463.method10681((byte) 95);
	aClass464_Sub2_6464.method10681((byte) 97);
	if (802559093 * client.anInt8317 > 0) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.EVENT_KEYBOARD,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data
		.writeShort(client.anInt8317 * -1084730924, -484048531);
	    for (int i = 0; i < 802559093 * client.anInt8317; i++) {
		Interface58 interface58 = client.anInterface58Array8318[i];
		long l = (interface58.method435(1482319719)
			  - -6111726823487216051L * aLong6467);
		if (l > 16777215L)
		    l = 16777215L;
		aLong6467 = (interface58.method435(1482319719)
			     * -6972232757595454843L);
		class241_sub27.data.writeByte
		    (interface58.getKeyCode(-883962889), -1639869153);
		class241_sub27.data
		    .writeTriByte((int) l, -1834869560);
	    }
	    client.aClass190_8340.sendPacket(class241_sub27, -1511140813);
	}
	if (-1280722955 * anInt6466 > 0)
	    anInt6466 -= -833094563;
	if (client.aBool8392 && -1280722955 * anInt6466 <= 0) {
	    anInt6466 = 517977924;
	    client.aBool8392 = false;
	    int i;
	    int i_2_;
	    if (115241065 * Class296.anInt4513 == 4) {
		if (Class445_Sub16.aClass351_Sub1_8660
			.method6332((short) -32499)
		    == Class39.aClass39_586) {
		    Class380_Sub2 class380_sub2
			= (Class380_Sub2) Class445_Sub16
					      .aClass351_Sub1_8660
					      .method6283(2080671681);
		    i = Class553.method12255(class380_sub2.aClass278_10406,
					     -640557785) >> 3;
		    int i_3_ = 1024;
		    i_2_ = (i_3_ * 3 - (Class322.method5956((class380_sub2
							     .aClass278_10406),
							    (byte) 101)
					>> 3)) % (i_3_ * 2);
		} else {
		    i = 0;
		    i_2_ = 0;
		}
	    } else {
		i = (int) client.aFloat8406 >> 3;
		i_2_ = (int) client.aFloat8581 >> 3;
	    }
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.CAMERA_MOVEMENT_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShortA(i_2_,
								-550905443);
	    class241_sub27.data.writeShort(i, -484048531);
	    client.aClass190_8340.sendPacket(class241_sub27, -2021103399);
	}
	if (aBool6465 != Class47.isWindowFocused) {
	    aBool6465 = Class47.isWindowFocused;
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.EVENT_APPLET_FOCUS,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data
		.writeByte(Class47.isWindowFocused ? 1 : 0, -961282617);
	    client.aClass190_8340.sendPacket(class241_sub27, -2005643449);
	}
	if (!client.aBool8297) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.REFLECTION_CHECK_REPLY,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(0, 208164207);
	    int i = (421967667
		     * class241_sub27.data.pointer);
	    RSByteBuffer class241_sub3
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .method14910(1458599924);
	    class241_sub27.data.writeBytes
		(class241_sub3.payload, 0,
		 class241_sub3.pointer * 421967667, 752061035);
	    class241_sub27.data.endPacketVarByte
		((class241_sub27.data.pointer * 421967667
		  - i),
		 1787425276);
	    client.aClass190_8340.sendPacket(class241_sub27, -1653341306);
	    client.aBool8297 = true;
	}
    }
    
    static final void method11063(ClientScriptData class454, int i) {
	Class507_Sub1 class507_sub1 = Class164.method3536(205381025);
	if (class507_sub1 != null) {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class507_sub1.anInt8739 * -1855666127;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class507_sub1.anInt6664 * 2058706651;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class507_sub1.aString8737;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class507_sub1.method14432((byte) -120);
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class507_sub1.method14433(16711935);
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class507_sub1.anInt6669 * -760939251;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 212635377 * class507_sub1.anInt8735;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class507_sub1.aString8736;
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	}
    }
    
    static final void method11064(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class120_Sub1.method15109(client.anInt8288 * 1766317249,
					366204534) ? 1 : 0;
    }
}
