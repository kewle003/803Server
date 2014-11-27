/* Class554 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class554
{
    public int anInt7202;
    public int[][] anIntArrayArray7203;
    public int anInt7204;
    public int anInt7205;
    int anInt7206;
    public int anInt7207;
    public int anInt7208;
    public int[] anIntArray7209;
    public int anInt7210;
    public int anInt7211;
    public int anInt7212;
    public int anInt7213;
    public int anInt7214;
    public int anInt7215;
    public int anInt7216;
    public int anInt7217;
    public int anInt7218;
    Class539 aClass539_7219;
    public int anInt7220;
    public int anInt7221;
    public int anInt7222;
    public int[] anIntArray7223;
    public int anInt7224;
    public int anInt7225;
    public int anInt7226;
    public int anInt7227;
    public int anInt7228;
    public int anInt7229;
    public int anInt7230;
    public int[][] anIntArrayArray7231;
    public int anInt7232;
    Class266[] aClass266Array7233;
    public int[] anIntArray7234;
    public int anInt7235 = 1027957245;
    public int anInt7236;
    public int[] anIntArray7237 = null;
    public int anInt7238;
    public int anInt7239;
    public int anInt7240;
    public int anInt7241;
    public int anInt7242;
    public int anInt7243;
    public int anInt7244;
    public int anInt7245;
    public boolean aBool7246;
    
    public int method12256(int i) {
	if (anInt7235 * -1505395541 != -1)
	    return -1505395541 * anInt7235;
	if (anIntArray7237 != null) {
	    int i_0_
		= (int) (Math.random()
			 * (double) (((Class554) this).anInt7206 * 359151825));
	    int i_1_;
	    for (i_1_ = 0; i_0_ >= anIntArray7223[i_1_]; i_1_++)
		i_0_ -= anIntArray7223[i_1_];
	    return anIntArray7237[i_1_];
	}
	return -1;
    }
    
    void method12257(RSByteBuffer class241_sub3, short i) {
	for (;;) {
	    int i_2_ = class241_sub3.readUnsignedByte((byte) 2);
	    if (i_2_ == 0)
		break;
	    method12270(class241_sub3, i_2_, -88318933);
	}
    }
    
    public Class266[] method12258(byte i) {
	if (((Class554) this).aClass266Array7233 != null)
	    return ((Class554) this).aClass266Array7233;
	if (null == anIntArrayArray7231)
	    return null;
	((Class554) this).aClass266Array7233
	    = new Class266[anIntArrayArray7231.length];
	for (int i_3_ = 0; i_3_ < anIntArrayArray7231.length; i_3_++) {
	    int i_4_ = 0;
	    int i_5_ = 0;
	    int i_6_ = 0;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    int i_9_ = 0;
	    if (null != anIntArrayArray7231[i_3_]) {
		i_4_ = anIntArrayArray7231[i_3_][0];
		i_5_ = anIntArrayArray7231[i_3_][1];
		i_6_ = anIntArrayArray7231[i_3_][2];
		i_7_ = anIntArrayArray7231[i_3_][3] << 3;
		i_8_ = anIntArrayArray7231[i_3_][4] << 3;
		i_9_ = anIntArrayArray7231[i_3_][5] << 3;
	    }
	    if (i_4_ != 0 || 0 != i_5_ || i_6_ != 0 || 0 != i_7_ || i_8_ != 0
		|| i_9_ != 0) {
		Class266 class266 = (((Class554) this).aClass266Array7233[i_3_]
				     = new Class266());
		if (0 != i_9_)
		    class266.method5128(0.0F, 0.0F, 1.0F,
					Class282.method5490(i_9_));
		if (i_7_ != 0)
		    class266.method5128(1.0F, 0.0F, 0.0F,
					Class282.method5490(i_7_));
		if (0 != i_8_)
		    class266.method5128(0.0F, 1.0F, 0.0F,
					Class282.method5490(i_8_));
		class266.method5133((float) i_4_, (float) i_5_, (float) i_6_);
	    }
	}
	return ((Class554) this).aClass266Array7233;
    }
    
    public int[] method12259() {
	HashTable class407 = new HashTable(16);
	Class54.method1302(-1505395541 * anInt7235, class407, (byte) -82);
	if (null != anIntArray7237) {
	    int[] is = anIntArray7237;
	    for (int i = 0; i < is.length; i++) {
		int i_10_ = is[i];
		Class54.method1302(i_10_, class407, (byte) 42);
	    }
	}
	Class54.method1302(625021175 * anInt7207, class407, (byte) 6);
	Class54.method1302(anInt7204 * -1067363865, class407, (byte) 41);
	Class54.method1302(anInt7205 * -1617403095, class407, (byte) -12);
	Class54.method1302(anInt7228 * -203277519, class407, (byte) -76);
	Class54.method1302(anInt7211 * -1870316067, class407, (byte) 7);
	Class54.method1302(anInt7210 * 1498943393, class407, (byte) 95);
	Class54.method1302(anInt7213 * -1503148783, class407, (byte) 55);
	Class54.method1302(1122571643 * anInt7214, class407, (byte) -39);
	Class54.method1302(anInt7215 * -526852481, class407, (byte) -99);
	Class54.method1302(anInt7226 * -1591850491, class407, (byte) -95);
	Class54.method1302(anInt7217 * -504629317, class407, (byte) -26);
	Class54.method1302(62833745 * anInt7216, class407, (byte) 5);
	Class54.method1302(anInt7212 * -216997439, class407, (byte) -39);
	Class54.method1302(2130754419 * anInt7220, class407, (byte) -51);
	Class54.method1302(1624976163 * anInt7221, class407, (byte) 38);
	Class54.method1302(anInt7222 * -255072849, class407, (byte) 1);
	Class54.method1302(-1478993197 * anInt7243, class407, (byte) -39);
	Class54.method1302(anInt7224 * 635865937, class407, (byte) -117);
	Class54.method1302(anInt7225 * -1024030939, class407, (byte) -35);
	Class54.method1302(1403807483 * anInt7208, class407, (byte) 105);
	int[] is = new int[class407.method7306(1993429356)];
	int i = 0;
	Iterator iterator = class407.iterator();
	while (iterator.hasNext()) {
	    Node class241 = (Node) iterator.next();
	    is[i++] = (int) (4356572401218184725L * class241.hashCode);
	}
	return is;
    }
    
    public boolean method12260(int i, int i_11_) {
	if (-1 == i)
	    return false;
	if (i == -1505395541 * anInt7235)
	    return true;
	if (anIntArray7237 != null) {
	    for (int i_12_ = 0; i_12_ < anIntArray7237.length; i_12_++) {
		if (anIntArray7237[i_12_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    Class554() {
	anIntArray7223 = null;
	((Class554) this).anInt7206 = 0;
	anInt7207 = 1731284793;
	anInt7204 = 1865338409;
	anInt7205 = -45017369;
	anInt7228 = -212024785;
	anInt7211 = 1901395339;
	anInt7210 = -1777964129;
	anInt7213 = 497300495;
	anInt7214 = -799637939;
	anInt7215 = -828694911;
	anInt7226 = -1116664525;
	anInt7217 = -2009216371;
	anInt7216 = -943260849;
	anInt7212 = -497430081;
	anInt7220 = -867033531;
	anInt7221 = -2146786443;
	anInt7222 = 960196273;
	anInt7243 = -230231387;
	anInt7224 = -693738929;
	anInt7225 = 2135802707;
	anInt7208 = 326257613;
	anInt7227 = 0;
	anInt7232 = 0;
	anInt7229 = 0;
	anInt7230 = 0;
	anInt7236 = 0;
	anInt7245 = 0;
	anInt7238 = 0;
	anInt7239 = 0;
	anInt7240 = 0;
	anInt7241 = 0;
	anInt7242 = 0;
	anInt7202 = 0;
	anInt7244 = 834326813;
	anInt7218 = 1884071353;
	aBool7246 = true;
    }
    
    public int[] method12261(byte i) {
	HashTable class407 = new HashTable(16);
	Class54.method1302(-1505395541 * anInt7235, class407, (byte) 36);
	if (null != anIntArray7237) {
	    int[] is = anIntArray7237;
	    for (int i_13_ = 0; i_13_ < is.length; i_13_++) {
		int i_14_ = is[i_13_];
		Class54.method1302(i_14_, class407, (byte) -113);
	    }
	}
	Class54.method1302(625021175 * anInt7207, class407, (byte) -100);
	Class54.method1302(anInt7204 * -1067363865, class407, (byte) -8);
	Class54.method1302(anInt7205 * -1617403095, class407, (byte) 14);
	Class54.method1302(anInt7228 * -203277519, class407, (byte) -32);
	Class54.method1302(anInt7211 * -1870316067, class407, (byte) 30);
	Class54.method1302(anInt7210 * 1498943393, class407, (byte) 18);
	Class54.method1302(anInt7213 * -1503148783, class407, (byte) -58);
	Class54.method1302(1122571643 * anInt7214, class407, (byte) 12);
	Class54.method1302(anInt7215 * -526852481, class407, (byte) -29);
	Class54.method1302(anInt7226 * -1591850491, class407, (byte) -30);
	Class54.method1302(anInt7217 * -504629317, class407, (byte) -35);
	Class54.method1302(62833745 * anInt7216, class407, (byte) 35);
	Class54.method1302(anInt7212 * -216997439, class407, (byte) -58);
	Class54.method1302(2130754419 * anInt7220, class407, (byte) -1);
	Class54.method1302(1624976163 * anInt7221, class407, (byte) -31);
	Class54.method1302(anInt7222 * -255072849, class407, (byte) 5);
	Class54.method1302(-1478993197 * anInt7243, class407, (byte) 9);
	Class54.method1302(anInt7224 * 635865937, class407, (byte) 23);
	Class54.method1302(anInt7225 * -1024030939, class407, (byte) 25);
	Class54.method1302(1403807483 * anInt7208, class407, (byte) 54);
	int[] is = new int[class407.method7306(1382604873)];
	int i_15_ = 0;
	Iterator iterator = class407.iterator();
	while (iterator.hasNext()) {
	    Node class241 = (Node) iterator.next();
	    is[i_15_++] = (int) (4356572401218184725L * class241.hashCode);
	}
	return is;
    }
    
    public int[] method12262() {
	HashTable class407 = new HashTable(16);
	Class54.method1302(-1505395541 * anInt7235, class407, (byte) 54);
	if (null != anIntArray7237) {
	    int[] is = anIntArray7237;
	    for (int i = 0; i < is.length; i++) {
		int i_16_ = is[i];
		Class54.method1302(i_16_, class407, (byte) -95);
	    }
	}
	Class54.method1302(625021175 * anInt7207, class407, (byte) 23);
	Class54.method1302(anInt7204 * -1067363865, class407, (byte) 89);
	Class54.method1302(anInt7205 * -1617403095, class407, (byte) 85);
	Class54.method1302(anInt7228 * -203277519, class407, (byte) -6);
	Class54.method1302(anInt7211 * -1870316067, class407, (byte) -77);
	Class54.method1302(anInt7210 * 1498943393, class407, (byte) 37);
	Class54.method1302(anInt7213 * -1503148783, class407, (byte) -57);
	Class54.method1302(1122571643 * anInt7214, class407, (byte) 45);
	Class54.method1302(anInt7215 * -526852481, class407, (byte) -90);
	Class54.method1302(anInt7226 * -1591850491, class407, (byte) -44);
	Class54.method1302(anInt7217 * -504629317, class407, (byte) 61);
	Class54.method1302(62833745 * anInt7216, class407, (byte) 8);
	Class54.method1302(anInt7212 * -216997439, class407, (byte) 18);
	Class54.method1302(2130754419 * anInt7220, class407, (byte) 8);
	Class54.method1302(1624976163 * anInt7221, class407, (byte) 22);
	Class54.method1302(anInt7222 * -255072849, class407, (byte) -41);
	Class54.method1302(-1478993197 * anInt7243, class407, (byte) -6);
	Class54.method1302(anInt7224 * 635865937, class407, (byte) 20);
	Class54.method1302(anInt7225 * -1024030939, class407, (byte) -89);
	Class54.method1302(1403807483 * anInt7208, class407, (byte) 6);
	int[] is = new int[class407.method7306(289140407)];
	int i = 0;
	Iterator iterator = class407.iterator();
	while (iterator.hasNext()) {
	    Node class241 = (Node) iterator.next();
	    is[i++] = (int) (4356572401218184725L * class241.hashCode);
	}
	return is;
    }
    
    void method12263(RSByteBuffer class241_sub3, int i) {
	if (1 == i) {
	    anInt7235 = class241_sub3.readBigSmart((byte) 45) * -1027957245;
	    anInt7205 = class241_sub3.readBigSmart((byte) 5) * 45017369;
	} else if (2 == i)
	    anInt7217 = class241_sub3.readBigSmart((byte) -115) * 2009216371;
	else if (i == 3)
	    anInt7216 = class241_sub3.readBigSmart((byte) -23) * 943260849;
	else if (i == 4)
	    anInt7212 = class241_sub3.readBigSmart((byte) -36) * 497430081;
	else if (5 == i)
	    anInt7220 = class241_sub3.readBigSmart((byte) -102) * 867033531;
	else if (6 == i)
	    anInt7213 = class241_sub3.readBigSmart((byte) -16) * -497300495;
	else if (7 == i)
	    anInt7214 = class241_sub3.readBigSmart((byte) -24) * 799637939;
	else if (8 == i)
	    anInt7215 = class241_sub3.readBigSmart((byte) -76) * 828694911;
	else if (9 == i)
	    anInt7226 = class241_sub3.readBigSmart((byte) -14) * 1116664525;
	else if (i == 26) {
	    anInt7227 = ((short) (class241_sub3.readUnsignedByte((byte) -63) * 4)
			 * 835365935);
	    anInt7232 = ((short) (class241_sub3.readUnsignedByte((byte) 13) * 4)
			 * 1636541333);
	} else if (i == 27) {
	    if (anIntArrayArray7231 == null)
		anIntArrayArray7231
		    = new int[(((Class539) ((Class554) this).aClass539_7219)
			       .aClass504_6999.anIntArray6629).length][];
	    int i_17_ = class241_sub3.readUnsignedByte((byte) 102);
	    anIntArrayArray7231[i_17_] = new int[6];
	    for (int i_18_ = 0; i_18_ < 6; i_18_++)
		anIntArrayArray7231[i_17_][i_18_]
		    = class241_sub3.readShort((byte) 97);
	} else if (28 == i) {
	    int i_19_ = class241_sub3.readUnsignedByte((byte) 71);
	    anIntArray7209 = new int[i_19_];
	    for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
		anIntArray7209[i_20_] = class241_sub3.readUnsignedByte((byte) 79);
		if (anIntArray7209[i_20_] == 255)
		    anIntArray7209[i_20_] = -1;
	    }
	} else if (i == 29)
	    anInt7236 = class241_sub3.readUnsignedByte((byte) -17) * -284027547;
	else if (30 == i)
	    anInt7245 = class241_sub3.readUnsignedShort(1162222719) * 124639539;
	else if (31 == i)
	    anInt7238 = class241_sub3.readUnsignedByte((byte) 43) * 490882911;
	else if (32 == i)
	    anInt7239 = class241_sub3.readUnsignedShort(1162222719) * 2129661211;
	else if (i == 33)
	    anInt7240 = class241_sub3.readShort((byte) 59) * -666036889;
	else if (34 == i)
	    anInt7241 = class241_sub3.readUnsignedByte((byte) -36) * -1350482499;
	else if (35 == i)
	    anInt7242 = class241_sub3.readUnsignedShort(1162222719) * 1057652713;
	else if (i == 36)
	    anInt7202 = class241_sub3.readShort((byte) 75) * -789603425;
	else if (i == 37)
	    anInt7244 = class241_sub3.readUnsignedByte((byte) -50) * -834326813;
	else if (i == 38)
	    anInt7207 = class241_sub3.readBigSmart((byte) -43) * -1731284793;
	else if (i == 39)
	    anInt7204 = class241_sub3.readBigSmart((byte) -21) * -1865338409;
	else if (i == 40)
	    anInt7228 = class241_sub3.readBigSmart((byte) -17) * 212024785;
	else if (41 == i)
	    anInt7211 = class241_sub3.readBigSmart((byte) 24) * -1901395339;
	else if (42 == i)
	    anInt7210 = class241_sub3.readBigSmart((byte) 7) * 1777964129;
	else if (i == 43)
	    class241_sub3.readUnsignedShort(1162222719);
	else if (i == 44)
	    class241_sub3.readUnsignedShort(1162222719);
	else if (45 == i)
	    anInt7218 = class241_sub3.readUnsignedShort(1162222719) * -1884071353;
	else if (i == 46)
	    anInt7221 = class241_sub3.readBigSmart((byte) -46) * 2146786443;
	else if (i == 47)
	    anInt7222 = class241_sub3.readBigSmart((byte) 71) * -960196273;
	else if (i == 48)
	    anInt7243 = class241_sub3.readBigSmart((byte) -53) * 230231387;
	else if (49 == i)
	    anInt7224 = class241_sub3.readBigSmart((byte) -34) * 693738929;
	else if (50 == i)
	    anInt7225 = class241_sub3.readBigSmart((byte) 50) * -2135802707;
	else if (i == 51)
	    anInt7208 = class241_sub3.readBigSmart((byte) 60) * -326257613;
	else if (52 == i) {
	    int i_21_ = class241_sub3.readUnsignedByte((byte) 32);
	    anIntArray7237 = new int[i_21_];
	    anIntArray7223 = new int[i_21_];
	    for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
		anIntArray7237[i_22_] = class241_sub3.readBigSmart((byte) -60);
		int i_23_ = class241_sub3.readUnsignedByte((byte) -40);
		anIntArray7223[i_22_] = i_23_;
		((Class554) this).anInt7206 += 1032003633 * i_23_;
	    }
	} else if (53 == i)
	    aBool7246 = false;
	else if (i == 54) {
	    anInt7229
		= (class241_sub3.readUnsignedByte((byte) -22) << 6) * -1313201589;
	    anInt7230
		= (class241_sub3.readUnsignedByte((byte) 40) << 6) * 457530535;
	} else if (i == 55) {
	    if (anIntArray7234 == null)
		anIntArray7234
		    = new int[(((Class539) ((Class554) this).aClass539_7219)
			       .aClass504_6999.anIntArray6629).length];
	    int i_24_ = class241_sub3.readUnsignedByte((byte) -50);
	    anIntArray7234[i_24_] = class241_sub3.readUnsignedShort(1162222719);
	} else if (56 == i) {
	    if (null == anIntArrayArray7203)
		anIntArrayArray7203
		    = new int[(((Class539) ((Class554) this).aClass539_7219)
			       .aClass504_6999.anIntArray6629).length][];
	    int i_25_ = class241_sub3.readUnsignedByte((byte) 17);
	    anIntArrayArray7203[i_25_] = new int[3];
	    for (int i_26_ = 0; i_26_ < 3; i_26_++)
		anIntArrayArray7203[i_25_][i_26_]
		    = class241_sub3.readShort((byte) 65);
	}
    }
    
    public Class266[] method12264() {
	if (((Class554) this).aClass266Array7233 != null)
	    return ((Class554) this).aClass266Array7233;
	if (null == anIntArrayArray7231)
	    return null;
	((Class554) this).aClass266Array7233
	    = new Class266[anIntArrayArray7231.length];
	for (int i = 0; i < anIntArrayArray7231.length; i++) {
	    int i_27_ = 0;
	    int i_28_ = 0;
	    int i_29_ = 0;
	    int i_30_ = 0;
	    int i_31_ = 0;
	    int i_32_ = 0;
	    if (null != anIntArrayArray7231[i]) {
		i_27_ = anIntArrayArray7231[i][0];
		i_28_ = anIntArrayArray7231[i][1];
		i_29_ = anIntArrayArray7231[i][2];
		i_30_ = anIntArrayArray7231[i][3] << 3;
		i_31_ = anIntArrayArray7231[i][4] << 3;
		i_32_ = anIntArrayArray7231[i][5] << 3;
	    }
	    if (i_27_ != 0 || 0 != i_28_ || i_29_ != 0 || 0 != i_30_
		|| i_31_ != 0 || i_32_ != 0) {
		Class266 class266
		    = ((Class554) this).aClass266Array7233[i] = new Class266();
		if (0 != i_32_)
		    class266.method5128(0.0F, 0.0F, 1.0F,
					Class282.method5490(i_32_));
		if (i_30_ != 0)
		    class266.method5128(1.0F, 0.0F, 0.0F,
					Class282.method5490(i_30_));
		if (0 != i_31_)
		    class266.method5128(0.0F, 1.0F, 0.0F,
					Class282.method5490(i_31_));
		class266.method5133((float) i_27_, (float) i_28_,
				    (float) i_29_);
	    }
	}
	return ((Class554) this).aClass266Array7233;
    }
    
    public boolean method12265(int i) {
	if (-1 == i)
	    return false;
	if (i == -1505395541 * anInt7235)
	    return true;
	if (anIntArray7237 != null) {
	    for (int i_33_ = 0; i_33_ < anIntArray7237.length; i_33_++) {
		if (anIntArray7237[i_33_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method12266(int i) {
	if (-1 == i)
	    return false;
	if (i == -1505395541 * anInt7235)
	    return true;
	if (anIntArray7237 != null) {
	    for (int i_34_ = 0; i_34_ < anIntArray7237.length; i_34_++) {
		if (anIntArray7237[i_34_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    public int method12267() {
	if (anInt7235 * -1505395541 != -1)
	    return -1505395541 * anInt7235;
	if (anIntArray7237 != null) {
	    int i
		= (int) (Math.random()
			 * (double) (((Class554) this).anInt7206 * 359151825));
	    int i_35_;
	    for (i_35_ = 0; i >= anIntArray7223[i_35_]; i_35_++)
		i -= anIntArray7223[i_35_];
	    return anIntArray7237[i_35_];
	}
	return -1;
    }
    
    public Class266[] method12268() {
	if (((Class554) this).aClass266Array7233 != null)
	    return ((Class554) this).aClass266Array7233;
	if (null == anIntArrayArray7231)
	    return null;
	((Class554) this).aClass266Array7233
	    = new Class266[anIntArrayArray7231.length];
	for (int i = 0; i < anIntArrayArray7231.length; i++) {
	    int i_36_ = 0;
	    int i_37_ = 0;
	    int i_38_ = 0;
	    int i_39_ = 0;
	    int i_40_ = 0;
	    int i_41_ = 0;
	    if (null != anIntArrayArray7231[i]) {
		i_36_ = anIntArrayArray7231[i][0];
		i_37_ = anIntArrayArray7231[i][1];
		i_38_ = anIntArrayArray7231[i][2];
		i_39_ = anIntArrayArray7231[i][3] << 3;
		i_40_ = anIntArrayArray7231[i][4] << 3;
		i_41_ = anIntArrayArray7231[i][5] << 3;
	    }
	    if (i_36_ != 0 || 0 != i_37_ || i_38_ != 0 || 0 != i_39_
		|| i_40_ != 0 || i_41_ != 0) {
		Class266 class266
		    = ((Class554) this).aClass266Array7233[i] = new Class266();
		if (0 != i_41_)
		    class266.method5128(0.0F, 0.0F, 1.0F,
					Class282.method5490(i_41_));
		if (i_39_ != 0)
		    class266.method5128(1.0F, 0.0F, 0.0F,
					Class282.method5490(i_39_));
		if (0 != i_40_)
		    class266.method5128(0.0F, 1.0F, 0.0F,
					Class282.method5490(i_40_));
		class266.method5133((float) i_36_, (float) i_37_,
				    (float) i_38_);
	    }
	}
	return ((Class554) this).aClass266Array7233;
    }
    
    void method12269(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 62);
	    if (i == 0)
		break;
	    method12270(class241_sub3, i, -1517204813);
	}
    }
    
    void method12270(RSByteBuffer class241_sub3, int i, int i_42_) {
	if (1 == i) {
	    anInt7235 = class241_sub3.readBigSmart((byte) -98) * -1027957245;
	    anInt7205 = class241_sub3.readBigSmart((byte) 26) * 45017369;
	} else if (2 == i)
	    anInt7217 = class241_sub3.readBigSmart((byte) 5) * 2009216371;
	else if (i == 3)
	    anInt7216 = class241_sub3.readBigSmart((byte) -32) * 943260849;
	else if (i == 4)
	    anInt7212 = class241_sub3.readBigSmart((byte) 49) * 497430081;
	else if (5 == i)
	    anInt7220 = class241_sub3.readBigSmart((byte) -77) * 867033531;
	else if (6 == i)
	    anInt7213 = class241_sub3.readBigSmart((byte) 48) * -497300495;
	else if (7 == i)
	    anInt7214 = class241_sub3.readBigSmart((byte) 16) * 799637939;
	else if (8 == i)
	    anInt7215 = class241_sub3.readBigSmart((byte) 57) * 828694911;
	else if (9 == i)
	    anInt7226 = class241_sub3.readBigSmart((byte) 25) * 1116664525;
	else if (i == 26) {
	    anInt7227 = ((short) (class241_sub3.readUnsignedByte((byte) 46) * 4)
			 * 835365935);
	    anInt7232 = ((short) (class241_sub3.readUnsignedByte((byte) -35) * 4)
			 * 1636541333);
	} else if (i == 27) {
	    if (anIntArrayArray7231 == null)
		anIntArrayArray7231
		    = new int[(((Class539) ((Class554) this).aClass539_7219)
			       .aClass504_6999.anIntArray6629).length][];
	    int i_43_ = class241_sub3.readUnsignedByte((byte) 59);
	    anIntArrayArray7231[i_43_] = new int[6];
	    for (int i_44_ = 0; i_44_ < 6; i_44_++)
		anIntArrayArray7231[i_43_][i_44_]
		    = class241_sub3.readShort((byte) 63);
	} else if (28 == i) {
	    int i_45_ = class241_sub3.readUnsignedByte((byte) 72);
	    anIntArray7209 = new int[i_45_];
	    for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
		anIntArray7209[i_46_] = class241_sub3.readUnsignedByte((byte) 28);
		if (anIntArray7209[i_46_] == 255)
		    anIntArray7209[i_46_] = -1;
	    }
	} else if (i == 29)
	    anInt7236 = class241_sub3.readUnsignedByte((byte) -3) * -284027547;
	else if (30 == i)
	    anInt7245 = class241_sub3.readUnsignedShort(1162222719) * 124639539;
	else if (31 == i)
	    anInt7238 = class241_sub3.readUnsignedByte((byte) -12) * 490882911;
	else if (32 == i)
	    anInt7239 = class241_sub3.readUnsignedShort(1162222719) * 2129661211;
	else if (i == 33)
	    anInt7240 = class241_sub3.readShort((byte) 59) * -666036889;
	else if (34 == i)
	    anInt7241 = class241_sub3.readUnsignedByte((byte) -52) * -1350482499;
	else if (35 == i)
	    anInt7242 = class241_sub3.readUnsignedShort(1162222719) * 1057652713;
	else if (i == 36)
	    anInt7202 = class241_sub3.readShort((byte) 120) * -789603425;
	else if (i == 37)
	    anInt7244 = class241_sub3.readUnsignedByte((byte) -57) * -834326813;
	else if (i == 38)
	    anInt7207 = class241_sub3.readBigSmart((byte) 26) * -1731284793;
	else if (i == 39)
	    anInt7204 = class241_sub3.readBigSmart((byte) -15) * -1865338409;
	else if (i == 40)
	    anInt7228 = class241_sub3.readBigSmart((byte) -71) * 212024785;
	else if (41 == i)
	    anInt7211 = class241_sub3.readBigSmart((byte) 65) * -1901395339;
	else if (42 == i)
	    anInt7210 = class241_sub3.readBigSmart((byte) -15) * 1777964129;
	else if (i == 43)
	    class241_sub3.readUnsignedShort(1162222719);
	else if (i == 44)
	    class241_sub3.readUnsignedShort(1162222719);
	else if (45 == i)
	    anInt7218 = class241_sub3.readUnsignedShort(1162222719) * -1884071353;
	else if (i == 46)
	    anInt7221 = class241_sub3.readBigSmart((byte) 43) * 2146786443;
	else if (i == 47)
	    anInt7222 = class241_sub3.readBigSmart((byte) 5) * -960196273;
	else if (i == 48)
	    anInt7243 = class241_sub3.readBigSmart((byte) -92) * 230231387;
	else if (49 == i)
	    anInt7224 = class241_sub3.readBigSmart((byte) -45) * 693738929;
	else if (50 == i)
	    anInt7225 = class241_sub3.readBigSmart((byte) -75) * -2135802707;
	else if (i == 51)
	    anInt7208 = class241_sub3.readBigSmart((byte) -85) * -326257613;
	else if (52 == i) {
	    int i_47_ = class241_sub3.readUnsignedByte((byte) -63);
	    anIntArray7237 = new int[i_47_];
	    anIntArray7223 = new int[i_47_];
	    for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
		anIntArray7237[i_48_] = class241_sub3.readBigSmart((byte) -10);
		int i_49_ = class241_sub3.readUnsignedByte((byte) -28);
		anIntArray7223[i_48_] = i_49_;
		((Class554) this).anInt7206 += 1032003633 * i_49_;
	    }
	} else if (53 == i)
	    aBool7246 = false;
	else if (i == 54) {
	    anInt7229
		= (class241_sub3.readUnsignedByte((byte) 11) << 6) * -1313201589;
	    anInt7230
		= (class241_sub3.readUnsignedByte((byte) -76) << 6) * 457530535;
	} else if (i == 55) {
	    if (anIntArray7234 == null)
		anIntArray7234
		    = new int[(((Class539) ((Class554) this).aClass539_7219)
			       .aClass504_6999.anIntArray6629).length];
	    int i_50_ = class241_sub3.readUnsignedByte((byte) -49);
	    anIntArray7234[i_50_] = class241_sub3.readUnsignedShort(1162222719);
	} else if (56 == i) {
	    if (null == anIntArrayArray7203)
		anIntArrayArray7203
		    = new int[(((Class539) ((Class554) this).aClass539_7219)
			       .aClass504_6999.anIntArray6629).length][];
	    int i_51_ = class241_sub3.readUnsignedByte((byte) 0);
	    anIntArrayArray7203[i_51_] = new int[3];
	    for (int i_52_ = 0; i_52_ < 3; i_52_++)
		anIntArrayArray7203[i_51_][i_52_]
		    = class241_sub3.readShort((byte) 110);
	}
    }
    
    static final void method12271(int i, HashTable class407) {
	if (i != -1 && class407.get((long) i) == null)
	    class407.put(new Node(), (long) i);
    }
    
    static final void method12272(int i, HashTable class407) {
	if (i != -1 && class407.get((long) i) == null)
	    class407.put(new Node(), (long) i);
    }
    
    static final void method12273(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class322.method5954(class58, class35, class454, -627049227);
    }
    
    static char method12274(char c, Language class437, int i) {
	if (c >= '\u00c0' && c <= '\u00ff') {
	    if (c >= '\u00c0' && c <= '\u00c6')
		return 'A';
	    if (c == '\u00c7')
		return 'C';
	    if (c >= '\u00c8' && c <= '\u00cb')
		return 'E';
	    if (c >= '\u00cc' && c <= '\u00cf')
		return 'I';
	    if (c == '\u00d1' && Language.aClass437_6139 != class437)
		return 'N';
	    if (c >= '\u00d2' && c <= '\u00d6')
		return 'O';
	    if (c >= '\u00d9' && c <= '\u00dc')
		return 'U';
	    if ('\u00dd' == c)
		return 'Y';
	    if (c == '\u00df')
		return 's';
	    if (c >= '\u00e0' && c <= '\u00e6')
		return 'a';
	    if ('\u00e7' == c)
		return 'c';
	    if (c >= '\u00e8' && c <= '\u00eb')
		return 'e';
	    if (c >= '\u00ec' && c <= '\u00ef')
		return 'i';
	    if (c == '\u00f1' && class437 != Language.aClass437_6139)
		return 'n';
	    if (c >= '\u00f2' && c <= '\u00f6')
		return 'o';
	    if (c >= '\u00f9' && c <= '\u00fc')
		return 'u';
	    if ('\u00fd' == c || '\u00ff' == c)
		return 'y';
	}
	if ('\u0152' == c)
	    return 'O';
	if (c == '\u0153')
	    return 'o';
	if ('\u0178' == c)
	    return 'Y';
	return c;
    }
    
    public static byte[] method12275(byte[] is, int i) {
	if (null == is)
	    return null;
	byte[] is_53_ = new byte[is.length];
	System.arraycopy(is, 0, is_53_, 0, is.length);
	return is_53_;
    }
    
    static void method12276(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [1482319719 * ((ClientScriptData) class454).intStackPointer - 1]
	    = Class326_Sub3.aClass482_10288.method11010
		  ((((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer - 1]),
		   (short) -2793)
		  .method10968(Class1.aClass19_11, -983187887) ? 1 : 0;
    }
    
    static final void method12277(ClientScriptData class454, byte i) {
	int i_54_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_54_, (byte) -80);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_54_ >> 16];
	Class451.setMouseOverEvent(class58, class35, class454, (byte) -116);
    }
}
