/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class15
{
    static boolean aBool132 = false;
    static int anInt133;
    static int anInt134;
    
    static void method696() {
	Class380_Sub1 class380_sub1
	    = ((Class380_Sub1)
	       Class78.aClass351_Sub1_1133.method6283(1653931323));
	Class434_Sub2 class434_sub2
	    = (Class434_Sub2) Class78.aClass351_Sub1_1133.method6284((byte) 1);
	Class287 class287 = class380_sub1.method6867(133423683);
	Class278 class278 = class434_sub2.method14071(-1975083048);
	if (client.aClass58_8474 != null) {
	    int i = client.aClass58_8474.anInt850 * 439139681;
	    int i_0_ = 1463495207 * client.aClass58_8474.scrollMinY;
	    float f = 1000.0F;
	    float f_1_
		= (float) (2.0 * Math.atan((double) ((float) i / 2.0F / f)));
	    float f_2_ = (float) (2.0 * Math.atan((double) ((float) i_0_ / 2.0F
							    / f)));
	    try {
		Class78.aClass351_Sub1_1133.method6259(f_1_, f_2_, (byte) -10);
	    } catch (Exception_Sub5 exception_sub5) {
		/* empty */
	    }
	}
	if (Class106.aClass580_1503.method12715(1505972690)) {
	    Class278 class278_3_ = Class278.method5414();
	    class278_3_.method5409(1.0F, 0.0F, 0.0F,
				   (float) (Class106.aClass580_1503
						.method12740((byte) -74)
					    - 952227459 * anInt134) / 200.0F);
	    class278.method5396(class278_3_);
	    Class287 class287_4_ = Class287.method5561(0.0F, 1.0F, 0.0F);
	    class287_4_.method5592(class278);
	    Class278 class278_5_ = Class278.method5414();
	    class278_5_.method5385(class287_4_,
				   ((float) (414645191 * anInt133
					     - Class106.aClass580_1503
						   .method12718(177714947))
				    / 200.0F));
	    class278.method5396(class278_5_);
	    class434_sub2.method14070(class278, 443507561);
	}
	anInt133
	    = Class106.aClass580_1503.method12718(605617419) * -1487514121;
	anInt134
	    = Class106.aClass580_1503.method12740((byte) -114) * 1790552107;
	class278.method5390();
	if (Class119.aClass578_1564.isKeyPressed(98, -1016346882)) {
	    Class287 class287_6_ = Class287.method5561(0.0F, 0.0F, 25.0F);
	    class287_6_.method5592(class278);
	    class287_6_.aFloat4474 *= -1.0F;
	    class287.method5574(class287_6_);
	}
	if (Class119.aClass578_1564.isKeyPressed(99, -1016346882)) {
	    Class287 class287_7_ = Class287.method5561(0.0F, 0.0F, -25.0F);
	    class287_7_.method5592(class278);
	    class287_7_.aFloat4474 *= -1.0F;
	    class287.method5574(class287_7_);
	}
	if (Class119.aClass578_1564.isKeyPressed(96, -1016346882)) {
	    Class287 class287_8_ = Class287.method5561(-25.0F, 0.0F, 0.0F);
	    class287_8_.method5592(class278);
	    class287_8_.aFloat4474 *= -1.0F;
	    class287.method5574(class287_8_);
	}
	if (Class119.aClass578_1564.isKeyPressed(97, -1016346882)) {
	    Class287 class287_9_ = Class287.method5561(25.0F, 0.0F, 0.0F);
	    class287_9_.method5592(class278);
	    class287_9_.aFloat4474 *= -1.0F;
	    class287.method5574(class287_9_);
	}
	Class241_Sub16 class241_sub16
	    = new Class241_Sub16(0, (int) class287.aFloat4477,
				 (int) class287.aFloat4474,
				 (int) class287.aFloat4479);
	class380_sub1.method16656(class241_sub16, (byte) -18);
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	int i = class522.baseX * 127679513 << 9;
	int i_10_ = 468558693 * class522.baseY << 9;
	Class78.aClass351_Sub1_1133.method6255(0.02F,
					       (client.aClass238_8477
						    .method4759
						(-35878102)
						.anIntArrayArrayArray4562),
					       client.aClass238_8477
						   .method4753((byte) -119),
					       i, i_10_, -1742751015);
    }
    
    static void method697(Class241_Sub16 class241_sub16) {
	Class78.aClass351_Sub1_1133 = new Class351_Sub1(client.aClass25_8409);
	Class78.aClass351_Sub1_1133.method6257(Class43.aClass43_605,
					       170709369);
	try {
	    Class380_Sub1 class380_sub1
		= ((Class380_Sub1)
		   Class78.aClass351_Sub1_1133.method6267(Class39.aClass39_588,
							  false, -206624996));
	    Class434_Sub2 class434_sub2
		= ((Class434_Sub2)
		   Class78.aClass351_Sub1_1133
		       .method6258(Class61.aClass61_1022, false, 869339269));
	    class380_sub1.method16656(class241_sub16, (byte) -38);
	    class434_sub2.method14070(new Class278(0.0F, 0.0F, 0.0F),
				      443507561);
	    Class78.aClass351_Sub1_1133.method6268
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F), (byte) 28);
	    Class78.aClass351_Sub1_1133.method6264
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 533403663);
	    Class78.aClass351_Sub1_1133.method6379
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F), (byte) 83);
	    Class78.aClass351_Sub1_1133.method6263
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 (byte) -111);
	} catch (Exception_Sub5 exception_sub5) {
	    /* empty */
	}
	anInt133
	    = Class106.aClass580_1503.method12718(917391564) * -1487514121;
	anInt134
	    = Class106.aClass580_1503.method12740((byte) -16) * 1790552107;
	aBool132 = true;
    }
    
    static void method698() {
	Class78.aClass351_Sub1_1133 = null;
	aBool132 = false;
    }
    
    static void method699(Class241_Sub16 class241_sub16) {
	Class78.aClass351_Sub1_1133 = new Class351_Sub1(client.aClass25_8409);
	Class78.aClass351_Sub1_1133.method6257(Class43.aClass43_605,
					       170709369);
	try {
	    Class380_Sub1 class380_sub1
		= ((Class380_Sub1)
		   Class78.aClass351_Sub1_1133.method6267(Class39.aClass39_588,
							  false, -1505320607));
	    Class434_Sub2 class434_sub2
		= ((Class434_Sub2)
		   Class78.aClass351_Sub1_1133
		       .method6258(Class61.aClass61_1022, false, -1135949269));
	    class380_sub1.method16656(class241_sub16, (byte) -29);
	    class434_sub2.method14070(new Class278(0.0F, 0.0F, 0.0F),
				      443507561);
	    Class78.aClass351_Sub1_1133.method6268
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F), (byte) 42);
	    Class78.aClass351_Sub1_1133.method6264
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 -1525610993);
	    Class78.aClass351_Sub1_1133.method6379
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F), (byte) 38);
	    Class78.aClass351_Sub1_1133.method6263
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 (byte) -70);
	} catch (Exception_Sub5 exception_sub5) {
	    /* empty */
	}
	anInt133
	    = Class106.aClass580_1503.method12718(1366265918) * -1487514121;
	anInt134
	    = Class106.aClass580_1503.method12740((byte) -42) * 1790552107;
	aBool132 = true;
    }
    
    static void method700(Class241_Sub16 class241_sub16) {
	Class78.aClass351_Sub1_1133 = new Class351_Sub1(client.aClass25_8409);
	Class78.aClass351_Sub1_1133.method6257(Class43.aClass43_605,
					       170709369);
	try {
	    Class380_Sub1 class380_sub1
		= ((Class380_Sub1)
		   Class78.aClass351_Sub1_1133.method6267(Class39.aClass39_588,
							  false, -1449824462));
	    Class434_Sub2 class434_sub2
		= ((Class434_Sub2)
		   Class78.aClass351_Sub1_1133
		       .method6258(Class61.aClass61_1022, false, 1662893447));
	    class380_sub1.method16656(class241_sub16, (byte) -63);
	    class434_sub2.method14070(new Class278(0.0F, 0.0F, 0.0F),
				      443507561);
	    Class78.aClass351_Sub1_1133.method6268
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F), (byte) 92);
	    Class78.aClass351_Sub1_1133.method6264
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 744748398);
	    Class78.aClass351_Sub1_1133.method6379
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F), (byte) 23);
	    Class78.aClass351_Sub1_1133.method6263
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 (byte) -103);
	} catch (Exception_Sub5 exception_sub5) {
	    /* empty */
	}
	anInt133
	    = Class106.aClass580_1503.method12718(2042355541) * -1487514121;
	anInt134 = Class106.aClass580_1503.method12740((byte) -4) * 1790552107;
	aBool132 = true;
    }
    
    static void method701(Class241_Sub16 class241_sub16) {
	Class78.aClass351_Sub1_1133 = new Class351_Sub1(client.aClass25_8409);
	Class78.aClass351_Sub1_1133.method6257(Class43.aClass43_605,
					       170709369);
	try {
	    Class380_Sub1 class380_sub1
		= ((Class380_Sub1)
		   Class78.aClass351_Sub1_1133.method6267(Class39.aClass39_588,
							  false, -313441814));
	    Class434_Sub2 class434_sub2
		= ((Class434_Sub2)
		   Class78.aClass351_Sub1_1133
		       .method6258(Class61.aClass61_1022, false, 413481146));
	    class380_sub1.method16656(class241_sub16, (byte) -32);
	    class434_sub2.method14070(new Class278(0.0F, 0.0F, 0.0F),
				      443507561);
	    Class78.aClass351_Sub1_1133.method6268
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F), (byte) 79);
	    Class78.aClass351_Sub1_1133.method6264
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 1456907336);
	    Class78.aClass351_Sub1_1133.method6379
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F),
		 (byte) 122);
	    Class78.aClass351_Sub1_1133.method6263
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 (byte) -91);
	} catch (Exception_Sub5 exception_sub5) {
	    /* empty */
	}
	anInt133
	    = Class106.aClass580_1503.method12718(1771158575) * -1487514121;
	anInt134 = Class106.aClass580_1503.method12740((byte) -4) * 1790552107;
	aBool132 = true;
    }
    
    static void method702() {
	Class78.aClass351_Sub1_1133 = null;
	aBool132 = false;
    }
    
    static void method703(Class241_Sub16 class241_sub16) {
	Class78.aClass351_Sub1_1133 = new Class351_Sub1(client.aClass25_8409);
	Class78.aClass351_Sub1_1133.method6257(Class43.aClass43_605,
					       170709369);
	try {
	    Class380_Sub1 class380_sub1
		= ((Class380_Sub1)
		   Class78.aClass351_Sub1_1133.method6267(Class39.aClass39_588,
							  false, -1786767536));
	    Class434_Sub2 class434_sub2
		= ((Class434_Sub2)
		   Class78.aClass351_Sub1_1133
		       .method6258(Class61.aClass61_1022, false, 369838248));
	    class380_sub1.method16656(class241_sub16, (byte) 43);
	    class434_sub2.method14070(new Class278(0.0F, 0.0F, 0.0F),
				      443507561);
	    Class78.aClass351_Sub1_1133.method6268
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F), (byte) 54);
	    Class78.aClass351_Sub1_1133.method6264
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 411422934);
	    Class78.aClass351_Sub1_1133.method6379
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F), (byte) 19);
	    Class78.aClass351_Sub1_1133.method6263
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 (byte) -97);
	} catch (Exception_Sub5 exception_sub5) {
	    /* empty */
	}
	anInt133
	    = Class106.aClass580_1503.method12718(461139305) * -1487514121;
	anInt134 = Class106.aClass580_1503.method12740((byte) -7) * 1790552107;
	aBool132 = true;
    }
    
    static void method704() {
	Class78.aClass351_Sub1_1133 = null;
	aBool132 = false;
    }
    
    static boolean method705() {
	return aBool132;
    }
    
    static boolean method706() {
	return aBool132;
    }
    
    Class15() throws Throwable {
	throw new Error();
    }
    
    static boolean method707() {
	return aBool132;
    }
    
    public static int method708(long l) {
	return (int) (l / 86400000L) - 11745;
    }
}
