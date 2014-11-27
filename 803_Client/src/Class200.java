/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class200
{
    static final int anInt2386 = 100000;
    static final float aFloat2387 = 1.3F;
    static final int anInt2388 = 50000;
    static final int anInt2389 = 10000;
    static final int anInt2390 = 100;
    static final int anInt2391 = 501;
    static boolean aBool2392;
    static final long aLong2393 = 64425238954L;
    static final long aLong2394 = 60129613779L;
    public static boolean aBool2395 = false;
    static final int anInt2396 = 1000;
    public static boolean aBool2397 = false;
    public static int anInt2398;
    public static JS5 SHADERS_ARCHIVE;//aClass210_2399
    static int anInt2400;
    
    static void method4046(Class628_Sub1 class628_sub1, int i, int i_0_) {
	class628_sub1.method14314(i, 1031274587);
	int i_1_;
	if (i_0_ > 100000) {
	    Class13.method666((byte) 27);
	    i_1_ = 4;
	} else if (i_0_ > 50000) {
	    Class448.method7924(694012827);
	    i_1_ = 3;
	} else if (i_0_ > 10000) {
	    Class13.method673(1755947461);
	    i_1_ = 2;
	} else {
	    WorldTile.method16486(true, -21468392);
	    i_1_ = 1;
	}
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893
		.method14197((byte) 23)
	    != i) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879,
		 i, (byte) 2);
	    GraphicsDefaults.method11570(i, false, 1945822518);
	} else
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14912
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893,
		 true, 1451806907);
	Class167.method3600((short) 10575);
	class628_sub1.method14319(i_1_, -340476419);
    }
    
    static {
	aBool2392 = false;
    }
    
    static Class241_Sub9 method4047() {
	RS3File class408 = null;
	Class241_Sub9 class241_sub9
	    = new Class241_Sub9(client.currentGame, 0);
	try {
	    class408
		= Class477.openPrefs("", client.currentGame.name,
				       false, (byte) -44);
	    byte[] is = new byte[(int) class408.method7326(-542107572)];
	    int i;
	    for (int i_2_ = 0; i_2_ < is.length; i_2_ += i) {
		i = class408.method7327(is, i_2_, is.length - i_2_, (byte) 36);
		if (-1 == i)
		    throw new IOException();
	    }
	    class241_sub9 = new Class241_Sub9(new RSByteBuffer(is),
					      client.currentGame, 0);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class408 != null)
		class408.close((byte) 36);
	} catch (Exception exception) {
	    /* empty */
	}
	return class241_sub9;
    }
    
    static Class241_Sub9 method4048() {
	RS3File class408 = null;
	Class241_Sub9 class241_sub9
	    = new Class241_Sub9(client.currentGame, 0);
	try {
	    class408
		= Class477.openPrefs("", client.currentGame.name,
				       false, (byte) -9);
	    byte[] is = new byte[(int) class408.method7326(-542107572)];
	    int i;
	    for (int i_3_ = 0; i_3_ < is.length; i_3_ += i) {
		i = class408.method7327(is, i_3_, is.length - i_3_, (byte) 6);
		if (-1 == i)
		    throw new IOException();
	    }
	    class241_sub9 = new Class241_Sub9(new RSByteBuffer(is),
					      client.currentGame, 0);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class408 != null)
		class408.close((byte) 54);
	} catch (Exception exception) {
	    /* empty */
	}
	return class241_sub9;
    }
    
    static Class241_Sub9 method4049() {
	RS3File class408 = null;
	Class241_Sub9 class241_sub9
	    = new Class241_Sub9(client.currentGame, 0);
	try {
	    class408
		= Class477.openPrefs("", client.currentGame.name,
				       false, (byte) -3);
	    byte[] is = new byte[(int) class408.method7326(-542107572)];
	    int i;
	    for (int i_4_ = 0; i_4_ < is.length; i_4_ += i) {
		i = class408.method7327(is, i_4_, is.length - i_4_, (byte) 18);
		if (-1 == i)
		    throw new IOException();
	    }
	    class241_sub9 = new Class241_Sub9(new RSByteBuffer(is),
					      client.currentGame, 0);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class408 != null)
		class408.close((byte) 71);
	} catch (Exception exception) {
	    /* empty */
	}
	return class241_sub9;
    }
    
    public static void method4050() {
	RS3File class408 = null;
	try {
	    class408
		= Class477.openPrefs("", client.currentGame.name,
				       true, (byte) -82);
	    RSByteBuffer class241_sub3
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .method14910(1758718932);
	    class408.write(class241_sub3.payload, 0,
				class241_sub3.pointer * 421967667,
				(byte) 62);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class408 != null)
		class408.close((byte) 1);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static void method4051() {
	RS3File class408 = null;
	try {
	    class408
		= Class477.openPrefs("", client.currentGame.name,
				       true, (byte) -25);
	    RSByteBuffer class241_sub3
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .method14910(1633584031);
	    class408.write(class241_sub3.payload, 0,
				class241_sub3.pointer * 421967667,
				(byte) 43);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class408 != null)
		class408.close((byte) 63);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static int method4052() {
	Class628_Sub1 class628_sub1 = Class44.method1104(-995793113);
	Class584.method12831(class628_sub1, -882343011);
	return class628_sub1.method13472((byte) 69);
    }
    
    static void method4053() {
	if (GameShell3.cpucount * -1006958513 > 1)
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub19_8882,
		 4, (byte) 2);
	else
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub19_8882,
		 2, (byte) 2);
    }
    
    static void method4054(Class628_Sub1 class628_sub1) {
	class628_sub1.method14314(0, 1757906527);
	int i;
	if (GameShell3.maxmemory * -1901361259 >= 96) {
	    int i_5_ = Class345.method6177((byte) 56);
	    if (i_5_ <= 100) {
		Class13.method666((byte) -63);
		i = 4;
	    } else if (i_5_ <= 501) {
		Class448.method7924(694012827);
		i = 3;
	    } else if (i_5_ <= 1000) {
		Class13.method673(1755947461);
		i = 2;
	    } else {
		WorldTile.method16486(true, -199961234);
		i = 1;
	    }
	    class628_sub1.method14315(0, i_5_, 802355177);
	} else {
	    WorldTile.method16486(true, -2111050509);
	    i = 1;
	    class628_sub1.method14313(64, (byte) -13);
	}
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893
		.method14197((byte) -93)
	    != 0) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879,
		 0, (byte) 2);
	    GraphicsDefaults.method11570(0, false, 1945822518);
	} else
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14912
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893,
		 true, 1987820430);
	Class167.method3600((short) 3593);
	class628_sub1.method14319(i, -535456305);
    }
    
    static void method4055(Class628_Sub1 class628_sub1) {
	class628_sub1.method14314(0, 1194295096);
	int i;
	if (GameShell3.maxmemory * -1901361259 >= 96) {
	    int i_6_ = Class345.method6177((byte) 79);
	    if (i_6_ <= 100) {
		Class13.method666((byte) 76);
		i = 4;
	    } else if (i_6_ <= 501) {
		Class448.method7924(694012827);
		i = 3;
	    } else if (i_6_ <= 1000) {
		Class13.method673(1755947461);
		i = 2;
	    } else {
		WorldTile.method16486(true, -991436848);
		i = 1;
	    }
	    class628_sub1.method14315(0, i_6_, 681793579);
	} else {
	    WorldTile.method16486(true, -1201326534);
	    i = 1;
	    class628_sub1.method14313(64, (byte) -32);
	}
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893
		.method14197((byte) -4)
	    != 0) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879,
		 0, (byte) 2);
	    GraphicsDefaults.method11570(0, false, 1945822518);
	} else
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14912
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893,
		 true, 1886397489);
	Class167.method3600((short) 91);
	class628_sub1.method14319(i, -1108146045);
    }
    
    static void method4056(Class628_Sub1 class628_sub1) {
	class628_sub1.method14314(0, 885197933);
	int i;
	if (GameShell3.maxmemory * -1901361259 >= 96) {
	    int i_7_ = Class345.method6177((byte) 0);
	    if (i_7_ <= 100) {
		Class13.method666((byte) -57);
		i = 4;
	    } else if (i_7_ <= 501) {
		Class448.method7924(694012827);
		i = 3;
	    } else if (i_7_ <= 1000) {
		Class13.method673(1755947461);
		i = 2;
	    } else {
		WorldTile.method16486(true, -1747887169);
		i = 1;
	    }
	    class628_sub1.method14315(0, i_7_, 26760479);
	} else {
	    WorldTile.method16486(true, -1146054357);
	    i = 1;
	    class628_sub1.method14313(64, (byte) 59);
	}
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893
		.method14197((byte) -21)
	    != 0) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879,
		 0, (byte) 2);
	    GraphicsDefaults.method11570(0, false, 1945822518);
	} else
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14912
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893,
		 true, 2052242979);
	Class167.method3600((short) 5352);
	class628_sub1.method14319(i, -617234572);
    }
    
    static Class628_Sub1 method4057() {
	Class628_Sub1 class628_sub1 = new Class628_Sub1();
	boolean bool = false;
	boolean bool_8_ = false;
	boolean bool_9_ = false;
	if (Class83.osName.startsWith("win")) {
	    bool_8_ = true;
	    bool = true;
	    bool_9_ = true;
	} else {
	    bool = true;
	    bool_9_ = true;
	}
	if (aBool2395) {
	    class628_sub1.method14313(16, (byte) 4);
	    bool = false;
	}
	if (aBool2397) {
	    class628_sub1.method14313(32, (byte) 56);
	    bool_8_ = false;
	}
	if (aBool2392) {
	    class628_sub1.method14313(16384, (byte) -65);
	    bool_9_ = false;
	}
	if (!bool && !bool_8_) {
	    Class293.method5694(class628_sub1, (byte) -68);
	    return class628_sub1;
	}
	int i = -1;
	int i_10_ = -1;
	int i_11_ = -1;
	if (bool_8_) {
	    try {
		Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub25_8884),
		     3, (byte) 2);
		Class167.method3600((short) -17002);
		i_10_ = Class129.method3065(3, 1000, 935028736);
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub11_8893.method14197((byte) -63)
		    == 3) {
		    class628_sub1.method14313(4, (byte) 59);
		    Class174 class174 = Class236.aClass103_2713.method2623();
		    long l = (3790016697209787005L * class174.aLong2100
			      & 0xffffffffffffL);
		    switch (class174.anInt2104 * 824514313) {
		    case 4098: {
			boolean bool_12_ = l >= 60129613779L;
			bool &= bool_12_;
			if (!bool_12_)
			    class628_sub1.method14313(512, (byte) 79);
			break;
		    }
		    case 4318: {
			boolean bool_13_ = l >= 64425238954L;
			bool &= bool_13_;
			if (!bool_13_)
			    class628_sub1.method14313(256, (byte) -24);
			break;
		    }
		    }
		}
	    } catch (Exception exception) {
		class628_sub1.method14313(4096, (byte) 67);
	    }
	}
	if (bool_9_) {
	    try {
		Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub25_8884),
		     5, (byte) 2);
		Class167.method3600((short) 12472);
		i_11_ = Class129.method3065(5, 1000, -1166981800);
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub11_8893.method14197((byte) 3)
		    == 5)
		    class628_sub1.method14313(8192, (byte) -49);
	    } catch (Exception exception) {
		class628_sub1.method14313(32768, (byte) -54);
	    }
	}
	if (bool) {
	    try {
		Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub25_8884),
		     4, (byte) 2);
		Class167.method3600((short) 1854);
		i = Class129.method3065(1, 1000, -615231187);
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub11_8893.method14197((byte) -57)
		    == 1)
		    class628_sub1.method14313(2, (byte) -47);
	    } catch (Exception exception) {
		class628_sub1.method14313(2048, (byte) 62);
	    }
	}
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub25_8884, 0,
	     (byte) 2);
	if (-1 == i && -1 == i_10_) {
	    Class293.method5694(class628_sub1, (byte) -44);
	    return class628_sub1;
	}
	class628_sub1.method14315(3, i_10_, -508103724);
	class628_sub1.method14315(1, i, -1069156736);
	class628_sub1.method14315(5, i_11_, 800642384);
	i_10_ *= 1.3F;
	if (i_10_ > 100000 && i > 100000 || i_10_ > i)
	    Class249.method5006(class628_sub1, 3, i == -1 ? i_10_ : i,
				-240280938);
	else
	    Class249.method5006(class628_sub1, 1, -1 == i_10_ ? i : i_10_,
				-264823404);
	return class628_sub1;
    }
    
    static void method4058() {
	if (GameShell3.cpucount * -1006958513 > 1)
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub19_8882,
		 4, (byte) 2);
	else
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub19_8882,
		 2, (byte) 2);
    }
    
    static void method4059(Class628_Sub1 class628_sub1, int i, int i_14_) {
	class628_sub1.method14314(i, 1222722903);
	int i_15_;
	if (i_14_ > 100000) {
	    Class13.method666((byte) 6);
	    i_15_ = 4;
	} else if (i_14_ > 50000) {
	    Class448.method7924(694012827);
	    i_15_ = 3;
	} else if (i_14_ > 10000) {
	    Class13.method673(1755947461);
	    i_15_ = 2;
	} else {
	    WorldTile.method16486(true, -1987937176);
	    i_15_ = 1;
	}
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893
		.method14197((byte) 92)
	    != i) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879,
		 i, (byte) 2);
	    GraphicsDefaults.method11570(i, false, 1945822518);
	} else
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14912
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893,
		 true, 1729488975);
	Class167.method3600((short) -5577);
	class628_sub1.method14319(i_15_, -244088262);
    }
    
    public static void method4060() {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 1,
	     (byte) 2);
	Class40.method1042(-832253847);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 4,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(107735326).method11400(-1945180297);
	client.aBool8307 = true;
    }
    
    public static void method4061() {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 1,
	     (byte) 2);
	Class40.method1042(-1495024213);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 4,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(2115509568).method11400(-340235176);
	client.aBool8307 = true;
    }
    
    public static void method4062() {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 1,
	     (byte) 2);
	Class40.method1042(1655267224);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 4,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(119850536).method11400(1022395302);
	client.aBool8307 = true;
    }
    
    public static void method4063() {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 1,
	     (byte) 2);
	Class40.method1042(648119678);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 3,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(1055300732).method11400(291722978);
	client.aBool8307 = true;
    }
    
    public static void method4064() {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 1,
	     (byte) 2);
	Class40.method1042(-618327919);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 3,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(-3362157).method11400(-443567678);
	client.aBool8307 = true;
    }
    
    public static void method4065() {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 0,
	     (byte) 2);
	Class40.method1042(159205330);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 2,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(1720895079).method11400(-402396276);
	client.aBool8307 = true;
    }
    
    public static void method4066() {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 0,
	     (byte) 2);
	Class40.method1042(405683948);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 2,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(-603033213).method11400(-467396216);
	client.aBool8307 = true;
    }
    
    public static void method4067() {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 0,
	     (byte) 2);
	Class40.method1042(-759731499);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 2,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(1706873886).method11400(-1767493971);
	client.aBool8307 = true;
    }
    
    static Class628_Sub1 method4068() {
	Class628_Sub1 class628_sub1 = new Class628_Sub1();
	boolean bool = false;
	boolean bool_16_ = false;
	boolean bool_17_ = false;
	if (Class83.osName.startsWith("win")) {
	    bool_16_ = true;
	    bool = true;
	    bool_17_ = true;
	} else {
	    bool = true;
	    bool_17_ = true;
	}
	if (aBool2395) {
	    class628_sub1.method14313(16, (byte) -90);
	    bool = false;
	}
	if (aBool2397) {
	    class628_sub1.method14313(32, (byte) -49);
	    bool_16_ = false;
	}
	if (aBool2392) {
	    class628_sub1.method14313(16384, (byte) -50);
	    bool_17_ = false;
	}
	if (!bool && !bool_16_) {
	    Class293.method5694(class628_sub1, (byte) -119);
	    return class628_sub1;
	}
	int i = -1;
	int i_18_ = -1;
	int i_19_ = -1;
	if (bool_16_) {
	    try {
		Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub25_8884),
		     3, (byte) 2);
		Class167.method3600((short) 6833);
		i_18_ = Class129.method3065(3, 1000, -418729294);
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub11_8893.method14197((byte) -38)
		    == 3) {
		    class628_sub1.method14313(4, (byte) -69);
		    Class174 class174 = Class236.aClass103_2713.method2623();
		    long l = (3790016697209787005L * class174.aLong2100
			      & 0xffffffffffffL);
		    switch (class174.anInt2104 * 824514313) {
		    case 4098: {
			boolean bool_20_ = l >= 60129613779L;
			bool &= bool_20_;
			if (!bool_20_)
			    class628_sub1.method14313(512, (byte) 3);
			break;
		    }
		    case 4318: {
			boolean bool_21_ = l >= 64425238954L;
			bool &= bool_21_;
			if (!bool_21_)
			    class628_sub1.method14313(256, (byte) -15);
			break;
		    }
		    }
		}
	    } catch (Exception exception) {
		class628_sub1.method14313(4096, (byte) -18);
	    }
	}
	if (bool_17_) {
	    try {
		Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub25_8884),
		     5, (byte) 2);
		Class167.method3600((short) -204);
		i_19_ = Class129.method3065(5, 1000, 871230689);
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub11_8893.method14197((byte) -91)
		    == 5)
		    class628_sub1.method14313(8192, (byte) 49);
	    } catch (Exception exception) {
		class628_sub1.method14313(32768, (byte) 31);
	    }
	}
	if (bool) {
	    try {
		Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub25_8884),
		     4, (byte) 2);
		Class167.method3600((short) -12431);
		i = Class129.method3065(1, 1000, 189100736);
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub11_8893.method14197((byte) 0)
		    == 1)
		    class628_sub1.method14313(2, (byte) -28);
	    } catch (Exception exception) {
		class628_sub1.method14313(2048, (byte) 98);
	    }
	}
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub25_8884, 0,
	     (byte) 2);
	if (-1 == i && -1 == i_18_) {
	    Class293.method5694(class628_sub1, (byte) -35);
	    return class628_sub1;
	}
	class628_sub1.method14315(3, i_18_, 746353624);
	class628_sub1.method14315(1, i, -228260643);
	class628_sub1.method14315(5, i_19_, -2040317749);
	i_18_ *= 1.3F;
	if (i_18_ > 100000 && i > 100000 || i_18_ > i)
	    Class249.method5006(class628_sub1, 3, i == -1 ? i_18_ : i,
				2130271243);
	else
	    Class249.method5006(class628_sub1, 1, -1 == i_18_ ? i : i_18_,
				-1251460989);
	return class628_sub1;
    }
    
    public static void method4069(boolean bool) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     -915921191 * Class71.aClass71_1088.anInt1093, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 0,
	     (byte) 2);
	Class40.method1042(-904174927);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 1,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(1918263358).method11400(787690334);
	client.aBool8307 = true;
    }
    
    Class200() throws Throwable {
	throw new Error();
    }
    
    public static Class330[] method4070(byte i) {
	return (new Class330[]
		{ Class330.aClass330_5033, Class330.aClass330_5034,
		  Class330.aClass330_5035 });
    }
    
    static final void method4071(ClientScriptData class454, int i) {
	if ((Class445_Sub16.aClass351_Sub1_8660.method6332((short) -22507)
	     != Class39.aClass39_586)
	    || (Class445_Sub16.aClass351_Sub1_8660.method6356(-1100316565)
		!= Class61.aClass61_1020))
	    throw new RuntimeException();
	Class287 class287
	    = ((Class380_Sub2)
	       Class445_Sub16.aClass351_Sub1_8660.method6283(1771626787))
		  .method16691(1482319719);
	Class287 class287_22_
	    = ((Class434_Sub5)
	       Class445_Sub16.aClass351_Sub1_8660.method6284((byte) 1))
		  .method14128((byte) 25);
	Class287 class287_23_ = Class287.method5562(class287);
	class287_23_.method5577(class287_22_);
	float f = Class107.method2684(class287_23_.aFloat4477,
				      class287_23_.aFloat4479, (byte) 12);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) ((double) f * 2607.5945876176133) & 0x3fff;
    }
    
    public static int method4072(CharSequence charsequence, int i, int i_24_) {
	return Class403.method7210(charsequence, i, true, (byte) 41);
    }
    
    static final void method4073(ClientScriptData class454, int i) {
	Class13.method673(1755947461);
	Class486.method11126((byte) -123);
	client.aClass238_8477.method4768((byte) 5);
	Class167.method3600((short) 1121);
	client.aBool8297 = false;
    }
    
    static final void method4074(ClientScriptData class454, short i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub23_8855
		  .method14330((byte) 72);
    }
}
