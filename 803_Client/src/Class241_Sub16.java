/* Class241_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub16 extends Node implements Interface61
{
    public int anInt8979;
    static int anInt8980;
    static Class241_Sub16[] aClass241_Sub16Array8981 = new Class241_Sub16[0];
    public int anInt8982;
    public int anInt8983;
    public int anInt8984;
    
    public void method439(RSByteBuffer class241_sub3, int i) {
	method14992(class241_sub3, -127564922);
    }
    
    public Class241_Sub16(int i, int i_0_, int i_1_, int i_2_) {
	anInt8979 = -1669927801 * i;
	anInt8982 = -795143013 * i_0_;
	anInt8983 = i_1_ * 313978279;
	anInt8984 = i_2_ * -1732086989;
    }
    
    Class241_Sub16(Class241_Sub16 class241_sub16_3_) {
	anInt8979 = class241_sub16_3_.anInt8979 * 1;
	anInt8982 = class241_sub16_3_.anInt8982 * 1;
	anInt8983 = 1 * class241_sub16_3_.anInt8983;
	anInt8984 = class241_sub16_3_.anInt8984 * 1;
    }
    
    Class241_Sub16(int i, boolean bool) {
	if (-1 == i)
	    anInt8979 = 1669927801;
	else {
	    anInt8979 = -1669927801 * (i >> 28 & 0x3);
	    anInt8982 = -795143013 * ((i >> 14 & 0x3fff) << 9);
	    anInt8983 = 0;
	    anInt8984 = ((i & 0x3fff) << 9) * -1732086989;
	    if (bool) {
		anInt8982 += -1693148416;
		anInt8984 += -1032637696;
	    }
	}
    }
    
    public int method64() {
	return Class351_Sub1.method16840(-1714043776);
    }
    
    void method14989(Class241_Sub16 class241_sub16_4_, int i) {
	anInt8979 = 1 * class241_sub16_4_.anInt8979;
	anInt8982 = 1 * class241_sub16_4_.anInt8982;
	anInt8983 = class241_sub16_4_.anInt8983 * 1;
	anInt8984 = class241_sub16_4_.anInt8984 * 1;
    }
    
    public static Class241_Sub16 method14990(int i, boolean bool) {
	synchronized (aClass241_Sub16Array8981) {
	    if (0 == anInt8980 * -1956990347) {
		Class241_Sub16 class241_sub16 = new Class241_Sub16(i, bool);
		return class241_sub16;
	    }
	    aClass241_Sub16Array8981
		[(anInt8980 -= -1131147811) * -1956990347]
		.method15012(i, bool, 138111141);
	    Class241_Sub16 class241_sub16
		= aClass241_Sub16Array8981[anInt8980 * -1956990347];
	    return class241_sub16;
	}
    }
    
    public Class287 method14991(byte i) {
	return new Class287((float) (anInt8982 * 576500115),
			    (float) (666561047 * anInt8983),
			    (float) (anInt8984 * -989675525));
    }
    
    void method14992(RSByteBuffer class241_sub3, int i) {
	class241_sub3.writeByte(810948919 * anInt8979, -2012687339);
	class241_sub3.writeInt(576500115 * anInt8982, 1114737669);
	class241_sub3.writeInt(666561047 * anInt8983, 938267803);
	class241_sub3.writeInt(anInt8984 * -989675525, 1484029721);
    }
    
    public String toString() {
	return new StringBuilder().append("Level: ").append
		   (anInt8979 * 810948919).append
		   (" Coord: ").append
		   (576500115 * anInt8982).append
		   (",").append
		   (666561047 * anInt8983).append
		   (",").append
		   (anInt8984 * -989675525).append
		   (" Coord Split: ").append
		   (576500115 * anInt8982 >> 15).append
		   (",").append
		   (-989675525 * anInt8984 >> 15).append
		   (",").append
		   (anInt8982 * 576500115 >> 9 & 0x3f).append
		   (",").append
		   (anInt8984 * -989675525 >> 9 & 0x3f).append
		   (",").append
		   (576500115 * anInt8982 & 0x1ff).append
		   (",").append
		   (anInt8984 * -989675525 & 0x1ff).toString();
    }
    
    public int method436(int i) {
	return Class351_Sub1.method16840(-1695441658);
    }
    
    public void method442(RSByteBuffer class241_sub3) {
	method14992(class241_sub3, -350240279);
    }
    
    public static Class241_Sub16 method14993(int i, int i_5_, int i_6_,
					     int i_7_) {
	synchronized (aClass241_Sub16Array8981) {
	    if (0 == -1956990347 * anInt8980) {
		Class241_Sub16 class241_sub16
		    = new Class241_Sub16(i, i_5_, i_6_, i_7_);
		return class241_sub16;
	    }
	    aClass241_Sub16Array8981
		[(anInt8980 -= -1131147811) * -1956990347]
		.method15016(i, i_5_, i_6_, i_7_, 1797375428);
	    Class241_Sub16 class241_sub16
		= aClass241_Sub16Array8981[anInt8980 * -1956990347];
	    return class241_sub16;
	}
    }
    
    public String method14994() {
	return new StringBuilder().append("Level: ").append
		   (anInt8979 * 810948919).append
		   (" Coord: ").append
		   (576500115 * anInt8982).append
		   (",").append
		   (666561047 * anInt8983).append
		   (",").append
		   (anInt8984 * -989675525).append
		   (" Coord Split: ").append
		   (576500115 * anInt8982 >> 15).append
		   (",").append
		   (-989675525 * anInt8984 >> 15).append
		   (",").append
		   (anInt8982 * 576500115 >> 9 & 0x3f).append
		   (",").append
		   (anInt8984 * -989675525 >> 9 & 0x3f).append
		   (",").append
		   (576500115 * anInt8982 & 0x1ff).append
		   (",").append
		   (anInt8984 * -989675525 & 0x1ff).toString();
    }
    
    public String method14995() {
	return new StringBuilder().append("Level: ").append
		   (anInt8979 * 810948919).append
		   (" Coord: ").append
		   (576500115 * anInt8982).append
		   (",").append
		   (666561047 * anInt8983).append
		   (",").append
		   (anInt8984 * -989675525).append
		   (" Coord Split: ").append
		   (576500115 * anInt8982 >> 15).append
		   (",").append
		   (-989675525 * anInt8984 >> 15).append
		   (",").append
		   (anInt8982 * 576500115 >> 9 & 0x3f).append
		   (",").append
		   (anInt8984 * -989675525 >> 9 & 0x3f).append
		   (",").append
		   (576500115 * anInt8982 & 0x1ff).append
		   (",").append
		   (anInt8984 * -989675525 & 0x1ff).toString();
    }
    
    public String method14996() {
	return new StringBuilder().append("Level: ").append
		   (anInt8979 * 810948919).append
		   (" Coord: ").append
		   (576500115 * anInt8982).append
		   (",").append
		   (666561047 * anInt8983).append
		   (",").append
		   (anInt8984 * -989675525).append
		   (" Coord Split: ").append
		   (576500115 * anInt8982 >> 15).append
		   (",").append
		   (-989675525 * anInt8984 >> 15).append
		   (",").append
		   (anInt8982 * 576500115 >> 9 & 0x3f).append
		   (",").append
		   (anInt8984 * -989675525 >> 9 & 0x3f).append
		   (",").append
		   (576500115 * anInt8982 & 0x1ff).append
		   (",").append
		   (anInt8984 * -989675525 & 0x1ff).toString();
    }
    
    public static Class241_Sub16 method14997(int i, int i_8_, int i_9_,
					     int i_10_) {
	synchronized (aClass241_Sub16Array8981) {
	    if (0 == -1956990347 * anInt8980) {
		Class241_Sub16 class241_sub16
		    = new Class241_Sub16(i, i_8_, i_9_, i_10_);
		return class241_sub16;
	    }
	    aClass241_Sub16Array8981
		[(anInt8980 -= -1131147811) * -1956990347]
		.method15016(i, i_8_, i_9_, i_10_, -875759952);
	    Class241_Sub16 class241_sub16
		= aClass241_Sub16Array8981[anInt8980 * -1956990347];
	    return class241_sub16;
	}
    }
    
    void method14998(int i, boolean bool) {
	if (i == -1)
	    anInt8979 = 1669927801;
	else {
	    anInt8979 = -1669927801 * (i >> 28 & 0x3);
	    anInt8982 = -795143013 * ((i >> 14 & 0x3fff) << 9);
	    anInt8983 = 0;
	    anInt8984 = -1732086989 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt8982 += -1693148416;
		anInt8984 += -1032637696;
	    }
	}
    }
    
    public static Class241_Sub16 method14999(int i, int i_11_, int i_12_,
					     int i_13_) {
	synchronized (aClass241_Sub16Array8981) {
	    if (0 == -1956990347 * anInt8980) {
		Class241_Sub16 class241_sub16
		    = new Class241_Sub16(i, i_11_, i_12_, i_13_);
		return class241_sub16;
	    }
	    aClass241_Sub16Array8981
		[(anInt8980 -= -1131147811) * -1956990347]
		.method15016(i, i_11_, i_12_, i_13_, -217618831);
	    Class241_Sub16 class241_sub16
		= aClass241_Sub16Array8981[anInt8980 * -1956990347];
	    return class241_sub16;
	}
    }
    
    public static Class241_Sub16 method15000(Class241_Sub16 class241_sub16) {
	synchronized (aClass241_Sub16Array8981) {
	    if (0 == -1956990347 * anInt8980) {
		Class241_Sub16 class241_sub16_14_
		    = new Class241_Sub16(class241_sub16);
		return class241_sub16_14_;
	    }
	    aClass241_Sub16Array8981
		[(anInt8980 -= -1131147811) * -1956990347]
		.method14989(class241_sub16, 902141971);
	    Class241_Sub16 class241_sub16_15_
		= aClass241_Sub16Array8981[-1956990347 * anInt8980];
	    return class241_sub16_15_;
	}
    }
    
    public static Class241_Sub16 method15001(int i, boolean bool) {
	synchronized (aClass241_Sub16Array8981) {
	    if (0 == anInt8980 * -1956990347) {
		Class241_Sub16 class241_sub16 = new Class241_Sub16(i, bool);
		return class241_sub16;
	    }
	    aClass241_Sub16Array8981
		[(anInt8980 -= -1131147811) * -1956990347]
		.method15012(i, bool, -1528955402);
	    Class241_Sub16 class241_sub16
		= aClass241_Sub16Array8981[anInt8980 * -1956990347];
	    return class241_sub16;
	}
    }
    
    void method15002(int i, int i_16_, int i_17_, int i_18_) {
	anInt8979 = i * -1669927801;
	anInt8982 = i_16_ * -795143013;
	anInt8983 = i_17_ * 313978279;
	anInt8984 = i_18_ * -1732086989;
    }
    
    public Class287 method15003() {
	return new Class287((float) (anInt8982 * 576500115),
			    (float) (666561047 * anInt8983),
			    (float) (anInt8984 * -989675525));
    }
    
    public void method306(RSByteBuffer class241_sub3) {
	method14992(class241_sub3, -1030000654);
    }
    
    void method15004(int i, boolean bool) {
	if (i == -1)
	    anInt8979 = 1669927801;
	else {
	    anInt8979 = -1669927801 * (i >> 28 & 0x3);
	    anInt8982 = -795143013 * ((i >> 14 & 0x3fff) << 9);
	    anInt8983 = 0;
	    anInt8984 = -1732086989 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt8982 += -1693148416;
		anInt8984 += -1032637696;
	    }
	}
    }
    
    void method15005(Class241_Sub16 class241_sub16_19_) {
	anInt8979 = 1 * class241_sub16_19_.anInt8979;
	anInt8982 = 1 * class241_sub16_19_.anInt8982;
	anInt8983 = class241_sub16_19_.anInt8983 * 1;
	anInt8984 = class241_sub16_19_.anInt8984 * 1;
    }
    
    void method15006(int i, boolean bool) {
	if (i == -1)
	    anInt8979 = 1669927801;
	else {
	    anInt8979 = -1669927801 * (i >> 28 & 0x3);
	    anInt8982 = -795143013 * ((i >> 14 & 0x3fff) << 9);
	    anInt8983 = 0;
	    anInt8984 = -1732086989 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt8982 += -1693148416;
		anInt8984 += -1032637696;
	    }
	}
    }
    
    public Class287 method15007() {
	return new Class287((float) (anInt8982 * 576500115),
			    (float) (666561047 * anInt8983),
			    (float) (anInt8984 * -989675525));
    }
    
    public static Class241_Sub16 method15008(int i, boolean bool) {
	synchronized (aClass241_Sub16Array8981) {
	    if (0 == anInt8980 * -1956990347) {
		Class241_Sub16 class241_sub16 = new Class241_Sub16(i, bool);
		return class241_sub16;
	    }
	    aClass241_Sub16Array8981
		[(anInt8980 -= -1131147811) * -1956990347]
		.method15012(i, bool, 1427884670);
	    Class241_Sub16 class241_sub16
		= aClass241_Sub16Array8981[anInt8980 * -1956990347];
	    return class241_sub16;
	}
    }
    
    public Class241_Sub16() {
	anInt8979 = 1669927801;
    }
    
    void method15009(Class241_Sub16 class241_sub16_20_) {
	anInt8979 = 1 * class241_sub16_20_.anInt8979;
	anInt8982 = 1 * class241_sub16_20_.anInt8982;
	anInt8983 = class241_sub16_20_.anInt8983 * 1;
	anInt8984 = class241_sub16_20_.anInt8984 * 1;
    }
    
    void method15010(RSByteBuffer class241_sub3) {
	class241_sub3.writeByte(810948919 * anInt8979, -792292111);
	class241_sub3.writeInt(576500115 * anInt8982, -433695138);
	class241_sub3.writeInt(666561047 * anInt8983, 77601685);
	class241_sub3.writeInt(anInt8984 * -989675525, 1734147436);
    }
    
    void method15011(RSByteBuffer class241_sub3) {
	class241_sub3.writeByte(810948919 * anInt8979, 1529823354);
	class241_sub3.writeInt(576500115 * anInt8982, -1713694457);
	class241_sub3.writeInt(666561047 * anInt8983, 1410966024);
	class241_sub3.writeInt(anInt8984 * -989675525, -1578514581);
    }
    
    void method15012(int i, boolean bool, int i_21_) {
	if (i == -1)
	    anInt8979 = 1669927801;
	else {
	    anInt8979 = -1669927801 * (i >> 28 & 0x3);
	    anInt8982 = -795143013 * ((i >> 14 & 0x3fff) << 9);
	    anInt8983 = 0;
	    anInt8984 = -1732086989 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt8982 += -1693148416;
		anInt8984 += -1032637696;
	    }
	}
    }
    
    static int method15013() {
	return 13;
    }
    
    void method15014(RSByteBuffer class241_sub3) {
	class241_sub3.writeByte(810948919 * anInt8979, 1734442359);
	class241_sub3.writeInt(576500115 * anInt8982, 1077931454);
	class241_sub3.writeInt(666561047 * anInt8983, 288932151);
	class241_sub3.writeInt(anInt8984 * -989675525, 676532524);
    }
    
    static int method15015() {
	return 13;
    }
    
    void method15016(int i, int i_22_, int i_23_, int i_24_, int i_25_) {
	anInt8979 = i * -1669927801;
	anInt8982 = i_22_ * -795143013;
	anInt8983 = i_23_ * 313978279;
	anInt8984 = i_24_ * -1732086989;
    }
    
    public int method52() {
	return Class351_Sub1.method16840(1990303799);
    }
    
    static int method15017() {
	return 13;
    }
    
    public void method441(RSByteBuffer class241_sub3) {
	method14992(class241_sub3, -1768009941);
    }
    
    public void method440(RSByteBuffer class241_sub3, byte i) {
	anInt8979 = class241_sub3.readUnsignedByte((byte) 52) * -1669927801;
	anInt8982 = class241_sub3.readInt((byte) 78) * -795143013;
	anInt8983 = class241_sub3.readInt((byte) 82) * 313978279;
	anInt8984 = class241_sub3.readInt((byte) 53) * -1732086989;
    }
    
    public void method443(RSByteBuffer class241_sub3) {
	anInt8979 = class241_sub3.readUnsignedByte((byte) 69) * -1669927801;
	anInt8982 = class241_sub3.readInt((byte) 98) * -795143013;
	anInt8983 = class241_sub3.readInt((byte) 5) * 313978279;
	anInt8984 = class241_sub3.readInt((byte) 89) * -1732086989;
    }
    
    static boolean method15018(Class515 class515, int i) {
	if (class515 == null)
	    return false;
	if (!class515.aBool6743)
	    return false;
	if (!class515.method11587(Class573_Sub1.anInterface13_7373,
				  Class573_Sub1.anInterface11_7372,
				  2008640295))
	    return false;
	if (Class573_Sub1.aClass407_8782
		.get((long) (-1948486001 * class515.anInt6731))
	    != null)
	    return false;
	if (Class573_Sub1.aClass407_8788
		.get((long) (-1123109927 * class515.anInt6770))
	    != null)
	    return false;
	if (null != class515.aString6756) {
	    if (0 == class515.anInt6760 * 723243945 && Class573_Sub1.aBool8772)
		return false;
	    if (723243945 * class515.anInt6760 == 1 && Class573_Sub1.aBool8791)
		return false;
	    if (class515.anInt6760 * 723243945 == 2 && Class573_Sub1.aBool8792)
		return false;
	}
	return true;
    }
}
