/* Class352_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class352_Sub1 extends Class352
{
    Class116 aClass116_10321;
    static final int anInt10322 = 6;
    static final int anInt10323 = 1;
    static final int anInt10324 = 2;
    static final int anInt10325 = 0;
    static final int anInt10326 = 4;
    static final int anInt10327 = 5;
    static final int anInt10328 = 3;
    static final int anInt10329 = 0;
    static final int anInt10330 = 7;
    static final int anInt10331 = 1;
    static final int anInt10332 = 2;
    static final int anInt10333 = 3;
    Class55[] aClass55Array10334 = new Class55[3];
    int[][] anIntArrayArray10335 = new int[3][7];
    int[] anIntArray10336;
    Class285 aClass285_10337 = new Class285(1.0F, 1.0F, 1.0F, 1.0F);
    Class285 aClass285_10338 = new Class285(0.0F, 0.0F, 0.0F, 0.0F);
    
    public void method6409(int i, int i_0_) {
	switch (i) {
	case 0:
	    ((Class352_Sub1) this).aClass285_10337.method5528(i_0_);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	case 2:
	    ((Class352_Sub1) this).aClass285_10337.method5528(i_0_);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	case 4:
	    ((Class352_Sub1) this).aClass285_10337.method5528(-1);
	    ((Class352_Sub1) this).aClass285_10338.method5528(i_0_);
	    ((Class352_Sub1) this).aClass285_10338.method5550();
	    break;
	case 3:
	    ((Class352_Sub1) this).aClass285_10337
		.method5528(0xffffff | i_0_ & ~0xffffff);
	    ((Class352_Sub1) this).aClass285_10338.method5528(i_0_ & 0xffffff);
	    break;
	case 1:
	    ((Class352_Sub1) this).aClass285_10337.method5528(-1);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	}
    }
    
    boolean method16647(int i) throws Exception_Sub7 {
	((Class352_Sub1) this).aClass116_10321
	    = aClass103_Sub3_5430.method15784("Sprite");
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class352_Sub1) this).aClass116_10321.method2815("WVPMatrix",
								(byte) -11);
	Class241_Sub23_Sub1 class241_sub23_sub1_1_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("SpriteSampler", (byte) -61);
	Class241_Sub23_Sub1 class241_sub23_sub1_2_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("MaskSampler",
								(byte) -30);
	Class241_Sub23_Sub1 class241_sub23_sub1_3_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("MulColour",
								(byte) -24);
	Class241_Sub23_Sub1 class241_sub23_sub1_4_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("AddColour",
								(byte) -2);
	Class241_Sub23_Sub1 class241_sub23_sub1_5_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("SpriteTexCoordMatrix", (byte) -120);
	Class241_Sub23_Sub1 class241_sub23_sub1_6_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("MaskTexCoordMatrix", (byte) -43);
	((Class352_Sub1) this).aClass55Array10334[0]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("Normal",
								(byte) 1);
	((Class352_Sub1) this).aClass55Array10334[1]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("Masked",
								(byte) 1);
	((Class352_Sub1) this).aClass55Array10334[2]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("AlphaTex",
								(byte) 1);
	for (int i_7_ = 0; i_7_ < 3; i_7_++) {
	    int i_8_ = (((Class352_Sub1) this).aClass116_10321.method2813
			(((Class352_Sub1) this).aClass55Array10334[i_7_],
			 (byte) -22));
	    ((Class352_Sub1) this).anIntArrayArray10335[i_7_][0]
		= class241_sub23_sub1.method17408(i_8_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i_7_][1]
		= class241_sub23_sub1_1_.method17408(i_8_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i_7_][2]
		= class241_sub23_sub1_2_.method17408(i_8_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i_7_][5]
		= class241_sub23_sub1_3_.method17408(i_8_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i_7_][6]
		= class241_sub23_sub1_4_.method17408(i_8_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i_7_][3]
		= class241_sub23_sub1_5_.method17408(i_8_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i_7_][4]
		= class241_sub23_sub1_6_.method17408(i_8_);
	}
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[0]);
	return true;
    }
    
    public void method6407() {
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[1]);
	((Class352_Sub1) this).aClass116_10321.method2805();
	((Class352_Sub1) this).anIntArray10336
	    = (((Class352_Sub1) this).anIntArrayArray10335
	       [((Class352_Sub1) this).aClass116_10321
		    .method2816(-1078874736)]);
	((Class352_Sub1) this).aClass116_10321.method2861
	    (((Class352_Sub1) this).anIntArray10336[2], 1, anInterface41_5429,
	     -1371090252);
	((Class352_Sub1) this).aClass116_10321.method2834
	    (((Class352_Sub1) this).anIntArray10336[4], aClass268_5427,
	     (byte) -43);
	method16650(-1871397630);
    }
    
    boolean method16648() throws Exception_Sub7 {
	((Class352_Sub1) this).aClass116_10321
	    = aClass103_Sub3_5430.method15784("Sprite");
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class352_Sub1) this).aClass116_10321.method2815("WVPMatrix",
								(byte) -20);
	Class241_Sub23_Sub1 class241_sub23_sub1_9_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("SpriteSampler", (byte) -68);
	Class241_Sub23_Sub1 class241_sub23_sub1_10_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("MaskSampler",
								(byte) -112);
	Class241_Sub23_Sub1 class241_sub23_sub1_11_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("MulColour",
								(byte) -59);
	Class241_Sub23_Sub1 class241_sub23_sub1_12_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("AddColour",
								(byte) -80);
	Class241_Sub23_Sub1 class241_sub23_sub1_13_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("SpriteTexCoordMatrix", (byte) -32);
	Class241_Sub23_Sub1 class241_sub23_sub1_14_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("MaskTexCoordMatrix", (byte) -22);
	((Class352_Sub1) this).aClass55Array10334[0]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("Normal",
								(byte) 1);
	((Class352_Sub1) this).aClass55Array10334[1]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("Masked",
								(byte) 1);
	((Class352_Sub1) this).aClass55Array10334[2]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("AlphaTex",
								(byte) 1);
	for (int i = 0; i < 3; i++) {
	    int i_15_
		= (((Class352_Sub1) this).aClass116_10321.method2813
		   (((Class352_Sub1) this).aClass55Array10334[i], (byte) -85));
	    ((Class352_Sub1) this).anIntArrayArray10335[i][0]
		= class241_sub23_sub1.method17408(i_15_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][1]
		= class241_sub23_sub1_9_.method17408(i_15_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][2]
		= class241_sub23_sub1_10_.method17408(i_15_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][5]
		= class241_sub23_sub1_11_.method17408(i_15_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][6]
		= class241_sub23_sub1_12_.method17408(i_15_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][3]
		= class241_sub23_sub1_13_.method17408(i_15_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][4]
		= class241_sub23_sub1_14_.method17408(i_15_);
	}
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[0]);
	return true;
    }
    
    public void method6410() {
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[0]);
	((Class352_Sub1) this).aClass116_10321.method2805();
	((Class352_Sub1) this).anIntArray10336
	    = (((Class352_Sub1) this).anIntArrayArray10335
	       [((Class352_Sub1) this).aClass116_10321
		    .method2816(-702020701)]);
	method16650(-1733033316);
    }
    
    public void method6408(int i, int i_16_) {
	switch (i) {
	case 0:
	    ((Class352_Sub1) this).aClass285_10337.method5528(i_16_);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	case 2:
	    ((Class352_Sub1) this).aClass285_10337.method5528(i_16_);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	case 4:
	    ((Class352_Sub1) this).aClass285_10337.method5528(-1);
	    ((Class352_Sub1) this).aClass285_10338.method5528(i_16_);
	    ((Class352_Sub1) this).aClass285_10338.method5550();
	    break;
	case 3:
	    ((Class352_Sub1) this).aClass285_10337
		.method5528(0xffffff | i_16_ & ~0xffffff);
	    ((Class352_Sub1) this).aClass285_10338
		.method5528(i_16_ & 0xffffff);
	    break;
	case 1:
	    ((Class352_Sub1) this).aClass285_10337.method5528(-1);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	}
    }
    
    public void method6415() {
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[1]);
	((Class352_Sub1) this).aClass116_10321.method2805();
	((Class352_Sub1) this).anIntArray10336
	    = (((Class352_Sub1) this).anIntArrayArray10335
	       [((Class352_Sub1) this).aClass116_10321
		    .method2816(1741659874)]);
	((Class352_Sub1) this).aClass116_10321.method2861
	    (((Class352_Sub1) this).anIntArray10336[2], 1, anInterface41_5429,
	     -1739809083);
	((Class352_Sub1) this).aClass116_10321.method2834
	    (((Class352_Sub1) this).anIntArray10336[4], aClass268_5427,
	     (byte) -2);
	method16650(-1880987696);
    }
    
    public void method6411(int i, int i_17_) {
	switch (i) {
	case 0:
	    ((Class352_Sub1) this).aClass285_10337.method5528(i_17_);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	case 2:
	    ((Class352_Sub1) this).aClass285_10337.method5528(i_17_);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	case 4:
	    ((Class352_Sub1) this).aClass285_10337.method5528(-1);
	    ((Class352_Sub1) this).aClass285_10338.method5528(i_17_);
	    ((Class352_Sub1) this).aClass285_10338.method5550();
	    break;
	case 3:
	    ((Class352_Sub1) this).aClass285_10337
		.method5528(0xffffff | i_17_ & ~0xffffff);
	    ((Class352_Sub1) this).aClass285_10338
		.method5528(i_17_ & 0xffffff);
	    break;
	case 1:
	    ((Class352_Sub1) this).aClass285_10337.method5528(-1);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	}
    }
    
    public void method6412(int i, int i_18_) {
	switch (i) {
	case 0:
	    ((Class352_Sub1) this).aClass285_10337.method5528(i_18_);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	case 2:
	    ((Class352_Sub1) this).aClass285_10337.method5528(i_18_);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	case 4:
	    ((Class352_Sub1) this).aClass285_10337.method5528(-1);
	    ((Class352_Sub1) this).aClass285_10338.method5528(i_18_);
	    ((Class352_Sub1) this).aClass285_10338.method5550();
	    break;
	case 3:
	    ((Class352_Sub1) this).aClass285_10337
		.method5528(0xffffff | i_18_ & ~0xffffff);
	    ((Class352_Sub1) this).aClass285_10338
		.method5528(i_18_ & 0xffffff);
	    break;
	case 1:
	    ((Class352_Sub1) this).aClass285_10337.method5528(-1);
	    ((Class352_Sub1) this).aClass285_10338.method5528(0);
	    break;
	}
    }
    
    public void method6413() {
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[0]);
	((Class352_Sub1) this).aClass116_10321.method2805();
	((Class352_Sub1) this).anIntArray10336
	    = (((Class352_Sub1) this).anIntArrayArray10335
	       [((Class352_Sub1) this).aClass116_10321
		    .method2816(1236891078)]);
	method16650(-1896301071);
    }
    
    public void method6414() {
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[0]);
	((Class352_Sub1) this).aClass116_10321.method2805();
	((Class352_Sub1) this).anIntArray10336
	    = (((Class352_Sub1) this).anIntArrayArray10335
	       [((Class352_Sub1) this).aClass116_10321.method2816(584008431)]);
	method16650(-2036442369);
    }
    
    void method16649() {
	((Class352_Sub1) this).aClass116_10321.method2861
	    (((Class352_Sub1) this).anIntArray10336[1], 0, anInterface41_5433,
	     -1531096203);
	aClass103_Sub3_5430.method15652(aClass268_5428);
	((Class352_Sub1) this).aClass116_10321.method2877
	    (((Class352_Sub1) this).anIntArray10336[0], aClass268_5428,
	     -40006444);
	((Class352_Sub1) this).aClass116_10321.method2834
	    (((Class352_Sub1) this).anIntArray10336[3], aClass268_5431,
	     (byte) -23);
	((Class352_Sub1) this).aClass116_10321.method2830
	    (((Class352_Sub1) this).anIntArray10336[5],
	     ((Class352_Sub1) this).aClass285_10337.aFloat4454,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4452,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4453,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4451, (byte) 82);
	((Class352_Sub1) this).aClass116_10321.method2830
	    (((Class352_Sub1) this).anIntArray10336[6],
	     ((Class352_Sub1) this).aClass285_10338.aFloat4454,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4452,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4453,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4451, (byte) 90);
	aClass103_Sub3_5430.method15955(0, anInterface40_5432);
	aClass103_Sub3_5430.method15716(aClass366_5435);
	aClass103_Sub3_5430.method15623(Class310.aClass310_4823, anInt5434, 2);
    }
    
    public void method6416() {
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[1]);
	((Class352_Sub1) this).aClass116_10321.method2805();
	((Class352_Sub1) this).anIntArray10336
	    = (((Class352_Sub1) this).anIntArrayArray10335
	       [((Class352_Sub1) this).aClass116_10321.method2816(218884137)]);
	((Class352_Sub1) this).aClass116_10321.method2861
	    (((Class352_Sub1) this).anIntArray10336[2], 1, anInterface41_5429,
	     -1953906398);
	((Class352_Sub1) this).aClass116_10321.method2834
	    (((Class352_Sub1) this).anIntArray10336[4], aClass268_5427,
	     (byte) -38);
	method16650(-1824726770);
    }
    
    public void method6418() {
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[1]);
	((Class352_Sub1) this).aClass116_10321.method2805();
	((Class352_Sub1) this).anIntArray10336
	    = (((Class352_Sub1) this).anIntArrayArray10335
	       [((Class352_Sub1) this).aClass116_10321
		    .method2816(1192065225)]);
	((Class352_Sub1) this).aClass116_10321.method2861
	    (((Class352_Sub1) this).anIntArray10336[2], 1, anInterface41_5429,
	     -2132427440);
	((Class352_Sub1) this).aClass116_10321.method2834
	    (((Class352_Sub1) this).anIntArray10336[4], aClass268_5427,
	     (byte) -111);
	method16650(-1902224011);
    }
    
    void method16650(int i) {
	((Class352_Sub1) this).aClass116_10321.method2861
	    (((Class352_Sub1) this).anIntArray10336[1], 0, anInterface41_5433,
	     -1452429851);
	aClass103_Sub3_5430.method15652(aClass268_5428);
	((Class352_Sub1) this).aClass116_10321.method2877
	    (((Class352_Sub1) this).anIntArray10336[0], aClass268_5428,
	     -1522333465);
	((Class352_Sub1) this).aClass116_10321.method2834
	    (((Class352_Sub1) this).anIntArray10336[3], aClass268_5431,
	     (byte) -25);
	((Class352_Sub1) this).aClass116_10321.method2830
	    (((Class352_Sub1) this).anIntArray10336[5],
	     ((Class352_Sub1) this).aClass285_10337.aFloat4454,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4452,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4453,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4451, (byte) 124);
	((Class352_Sub1) this).aClass116_10321.method2830
	    (((Class352_Sub1) this).anIntArray10336[6],
	     ((Class352_Sub1) this).aClass285_10338.aFloat4454,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4452,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4453,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4451, (byte) 101);
	aClass103_Sub3_5430.method15955(0, anInterface40_5432);
	aClass103_Sub3_5430.method15716(aClass366_5435);
	aClass103_Sub3_5430.method15623(Class310.aClass310_4823, anInt5434, 2);
    }
    
    boolean method16651() throws Exception_Sub7 {
	((Class352_Sub1) this).aClass116_10321
	    = aClass103_Sub3_5430.method15784("Sprite");
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class352_Sub1) this).aClass116_10321.method2815("WVPMatrix",
								(byte) -122);
	Class241_Sub23_Sub1 class241_sub23_sub1_19_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("SpriteSampler", (byte) -66);
	Class241_Sub23_Sub1 class241_sub23_sub1_20_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("MaskSampler",
								(byte) -122);
	Class241_Sub23_Sub1 class241_sub23_sub1_21_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("MulColour",
								(byte) -54);
	Class241_Sub23_Sub1 class241_sub23_sub1_22_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("AddColour",
								(byte) -83);
	Class241_Sub23_Sub1 class241_sub23_sub1_23_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("SpriteTexCoordMatrix", (byte) -78);
	Class241_Sub23_Sub1 class241_sub23_sub1_24_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("MaskTexCoordMatrix", (byte) -47);
	((Class352_Sub1) this).aClass55Array10334[0]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("Normal",
								(byte) 1);
	((Class352_Sub1) this).aClass55Array10334[1]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("Masked",
								(byte) 1);
	((Class352_Sub1) this).aClass55Array10334[2]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("AlphaTex",
								(byte) 1);
	for (int i = 0; i < 3; i++) {
	    int i_25_ = (((Class352_Sub1) this).aClass116_10321.method2813
			 (((Class352_Sub1) this).aClass55Array10334[i],
			  (byte) -100));
	    ((Class352_Sub1) this).anIntArrayArray10335[i][0]
		= class241_sub23_sub1.method17408(i_25_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][1]
		= class241_sub23_sub1_19_.method17408(i_25_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][2]
		= class241_sub23_sub1_20_.method17408(i_25_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][5]
		= class241_sub23_sub1_21_.method17408(i_25_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][6]
		= class241_sub23_sub1_22_.method17408(i_25_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][3]
		= class241_sub23_sub1_23_.method17408(i_25_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][4]
		= class241_sub23_sub1_24_.method17408(i_25_);
	}
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[0]);
	return true;
    }
    
    boolean method16652() throws Exception_Sub7 {
	((Class352_Sub1) this).aClass116_10321
	    = aClass103_Sub3_5430.method15784("Sprite");
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class352_Sub1) this).aClass116_10321.method2815("WVPMatrix",
								(byte) -58);
	Class241_Sub23_Sub1 class241_sub23_sub1_26_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("SpriteSampler", (byte) -14);
	Class241_Sub23_Sub1 class241_sub23_sub1_27_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("MaskSampler",
								(byte) -36);
	Class241_Sub23_Sub1 class241_sub23_sub1_28_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("MulColour",
								(byte) -46);
	Class241_Sub23_Sub1 class241_sub23_sub1_29_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("AddColour",
								(byte) -13);
	Class241_Sub23_Sub1 class241_sub23_sub1_30_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("SpriteTexCoordMatrix", (byte) -114);
	Class241_Sub23_Sub1 class241_sub23_sub1_31_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("MaskTexCoordMatrix", (byte) -92);
	((Class352_Sub1) this).aClass55Array10334[0]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("Normal",
								(byte) 1);
	((Class352_Sub1) this).aClass55Array10334[1]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("Masked",
								(byte) 1);
	((Class352_Sub1) this).aClass55Array10334[2]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("AlphaTex",
								(byte) 1);
	for (int i = 0; i < 3; i++) {
	    int i_32_
		= (((Class352_Sub1) this).aClass116_10321.method2813
		   (((Class352_Sub1) this).aClass55Array10334[i], (byte) -64));
	    ((Class352_Sub1) this).anIntArrayArray10335[i][0]
		= class241_sub23_sub1.method17408(i_32_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][1]
		= class241_sub23_sub1_26_.method17408(i_32_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][2]
		= class241_sub23_sub1_27_.method17408(i_32_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][5]
		= class241_sub23_sub1_28_.method17408(i_32_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][6]
		= class241_sub23_sub1_29_.method17408(i_32_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][3]
		= class241_sub23_sub1_30_.method17408(i_32_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][4]
		= class241_sub23_sub1_31_.method17408(i_32_);
	}
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[0]);
	return true;
    }
    
    public void method6417() {
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[1]);
	((Class352_Sub1) this).aClass116_10321.method2805();
	((Class352_Sub1) this).anIntArray10336
	    = (((Class352_Sub1) this).anIntArrayArray10335
	       [((Class352_Sub1) this).aClass116_10321.method2816(461024533)]);
	((Class352_Sub1) this).aClass116_10321.method2861
	    (((Class352_Sub1) this).anIntArray10336[2], 1, anInterface41_5429,
	     -1341049456);
	((Class352_Sub1) this).aClass116_10321.method2834
	    (((Class352_Sub1) this).anIntArray10336[4], aClass268_5427,
	     (byte) -12);
	method16650(-1891575719);
    }
    
    boolean method16653() throws Exception_Sub7 {
	((Class352_Sub1) this).aClass116_10321
	    = aClass103_Sub3_5430.method15784("Sprite");
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class352_Sub1) this).aClass116_10321.method2815("WVPMatrix",
								(byte) -83);
	Class241_Sub23_Sub1 class241_sub23_sub1_33_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("SpriteSampler", (byte) -93);
	Class241_Sub23_Sub1 class241_sub23_sub1_34_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("MaskSampler",
								(byte) -32);
	Class241_Sub23_Sub1 class241_sub23_sub1_35_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("MulColour",
								(byte) -50);
	Class241_Sub23_Sub1 class241_sub23_sub1_36_
	    = ((Class352_Sub1) this).aClass116_10321.method2815("AddColour",
								(byte) -48);
	Class241_Sub23_Sub1 class241_sub23_sub1_37_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("SpriteTexCoordMatrix", (byte) -96);
	Class241_Sub23_Sub1 class241_sub23_sub1_38_
	    = ((Class352_Sub1) this).aClass116_10321
		  .method2815("MaskTexCoordMatrix", (byte) -75);
	((Class352_Sub1) this).aClass55Array10334[0]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("Normal",
								(byte) 1);
	((Class352_Sub1) this).aClass55Array10334[1]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("Masked",
								(byte) 1);
	((Class352_Sub1) this).aClass55Array10334[2]
	    = ((Class352_Sub1) this).aClass116_10321.method2810("AlphaTex",
								(byte) 1);
	for (int i = 0; i < 3; i++) {
	    int i_39_
		= (((Class352_Sub1) this).aClass116_10321.method2813
		   (((Class352_Sub1) this).aClass55Array10334[i], (byte) -80));
	    ((Class352_Sub1) this).anIntArrayArray10335[i][0]
		= class241_sub23_sub1.method17408(i_39_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][1]
		= class241_sub23_sub1_33_.method17408(i_39_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][2]
		= class241_sub23_sub1_34_.method17408(i_39_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][5]
		= class241_sub23_sub1_35_.method17408(i_39_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][6]
		= class241_sub23_sub1_36_.method17408(i_39_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][3]
		= class241_sub23_sub1_37_.method17408(i_39_);
	    ((Class352_Sub1) this).anIntArrayArray10335[i][4]
		= class241_sub23_sub1_38_.method17408(i_39_);
	}
	((Class352_Sub1) this).aClass116_10321
	    .method2895(((Class352_Sub1) this).aClass55Array10334[0]);
	return true;
    }
    
    void method16654() {
	((Class352_Sub1) this).aClass116_10321.method2861
	    (((Class352_Sub1) this).anIntArray10336[1], 0, anInterface41_5433,
	     -1707498561);
	aClass103_Sub3_5430.method15652(aClass268_5428);
	((Class352_Sub1) this).aClass116_10321.method2877
	    (((Class352_Sub1) this).anIntArray10336[0], aClass268_5428,
	     -707388755);
	((Class352_Sub1) this).aClass116_10321.method2834
	    (((Class352_Sub1) this).anIntArray10336[3], aClass268_5431,
	     (byte) -128);
	((Class352_Sub1) this).aClass116_10321.method2830
	    (((Class352_Sub1) this).anIntArray10336[5],
	     ((Class352_Sub1) this).aClass285_10337.aFloat4454,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4452,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4453,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4451, (byte) 88);
	((Class352_Sub1) this).aClass116_10321.method2830
	    (((Class352_Sub1) this).anIntArray10336[6],
	     ((Class352_Sub1) this).aClass285_10338.aFloat4454,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4452,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4453,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4451, (byte) 67);
	aClass103_Sub3_5430.method15955(0, anInterface40_5432);
	aClass103_Sub3_5430.method15716(aClass366_5435);
	aClass103_Sub3_5430.method15623(Class310.aClass310_4823, anInt5434, 2);
    }
    
    public Class352_Sub1(Class103_Sub3 class103_sub3) throws Exception_Sub7 {
	super(class103_sub3);
	method16647(-504491608);
    }
    
    void method16655() {
	((Class352_Sub1) this).aClass116_10321.method2861
	    (((Class352_Sub1) this).anIntArray10336[1], 0, anInterface41_5433,
	     -1401863403);
	aClass103_Sub3_5430.method15652(aClass268_5428);
	((Class352_Sub1) this).aClass116_10321.method2877
	    (((Class352_Sub1) this).anIntArray10336[0], aClass268_5428,
	     641398180);
	((Class352_Sub1) this).aClass116_10321.method2834
	    (((Class352_Sub1) this).anIntArray10336[3], aClass268_5431,
	     (byte) -60);
	((Class352_Sub1) this).aClass116_10321.method2830
	    (((Class352_Sub1) this).anIntArray10336[5],
	     ((Class352_Sub1) this).aClass285_10337.aFloat4454,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4452,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4453,
	     ((Class352_Sub1) this).aClass285_10337.aFloat4451, (byte) 36);
	((Class352_Sub1) this).aClass116_10321.method2830
	    (((Class352_Sub1) this).anIntArray10336[6],
	     ((Class352_Sub1) this).aClass285_10338.aFloat4454,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4452,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4453,
	     ((Class352_Sub1) this).aClass285_10338.aFloat4451, (byte) 80);
	aClass103_Sub3_5430.method15955(0, anInterface40_5432);
	aClass103_Sub3_5430.method15716(aClass366_5435);
	aClass103_Sub3_5430.method15623(Class310.aClass310_4823, anInt5434, 2);
    }
}
