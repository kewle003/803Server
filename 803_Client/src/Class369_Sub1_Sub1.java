/* Class369_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class369_Sub1_Sub1 extends Class369_Sub1
{
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10667;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10668;
    public int anInt10669;
    Class55 aClass55_10670;
    Class55 aClass55_10671;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10672;
    public Class268 aClass268_10673 = new Class268();
    Class375 aClass375_10674;
    public Class268 aClass268_10675 = new Class268();
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10676;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10677;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10678;
    float[] aFloatArray10679;
    public int anInt10680;
    float aFloat10681;
    public int anInt10682;
    float[] aFloatArray10683 = new float[4];
    public int anInt10684;
    
    public void method16925(int i) {
	if (((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627)
	    aClass116_10598
		.method2895(((Class369_Sub1_Sub1) this).aClass55_10670);
	else
	    aClass116_10598
		.method2895(((Class369_Sub1_Sub1) this).aClass55_10671);
	aClass116_10598.method2805();
	if (((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627)
	    aClass116_10598.method2828((((Class369_Sub1_Sub1) this)
					.aClass241_Sub23_Sub1_10678),
				       0,
				       (((Class369_Sub1_Sub1) this)
					.aClass375_10674.anInterface38_5628),
				       -557220821);
	aClass116_10598.method2837((((Class369_Sub1_Sub1) this)
				    .aClass241_Sub23_Sub1_10667),
				   aClass268_10675, (byte) -82);
	aClass116_10598.method2837((((Class369_Sub1_Sub1) this)
				    .aClass241_Sub23_Sub1_10672),
				   aClass268_10673, (byte) -101);
	aClass116_10598.method2823
	    (((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10677,
	     new Class285(((Class369_Sub1_Sub1) this).aFloatArray10683[0],
			  ((Class369_Sub1_Sub1) this).aFloatArray10683[1],
			  ((Class369_Sub1_Sub1) this).aFloatArray10683[2],
			  ((Class369_Sub1_Sub1) this).aFloatArray10683[3]),
	     16711935);
	aClass116_10598.method2823
	    (((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10676,
	     new Class285(((Class369_Sub1_Sub1) this).aFloatArray10679[0],
			  ((Class369_Sub1_Sub1) this).aFloatArray10679[1],
			  ((Class369_Sub1_Sub1) this).aFloatArray10679[2],
			  ((Class369_Sub1_Sub1) this).aFloatArray10679[3]),
	     16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub1) this)
				    .aClass241_Sub23_Sub1_10668),
				   new Class285((((Class369_Sub1_Sub1) this)
						 .aFloat10681),
						0.0F, 0.0F, 0.0F),
				   16711935);
	aClass103_Sub3_5566.method15726(Class310.aClass310_4822,
					anInt10680 * -303836651,
					anInt10682 * -640404647,
					anInt10669 * 1723256295,
					2141729887 * anInt10684);
    }
    
    boolean method16800() throws Exception_Sub7 {
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10667
	    = aClass116_10598.method2815("WorldMatrix", (byte) -84);
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10672
	    = aClass116_10598.method2815("WVPMatrix", (byte) -125);
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10677
	    = aClass116_10598.method2815("UGenerationPlane", (byte) -5);
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10676
	    = aClass116_10598.method2815("VGenerationPlane", (byte) -123);
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10668
	    = aClass116_10598.method2815("Time", (byte) -18);
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10678
	    = aClass116_10598.method2815("billowSampler3D", (byte) -49);
	if (((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627) {
	    ((Class369_Sub1_Sub1) this).aClass55_10670
		= aClass116_10598.method2810("Waterfall3D", (byte) 1);
	    aClass116_10598
		.method2895(((Class369_Sub1_Sub1) this).aClass55_10670);
	} else {
	    ((Class369_Sub1_Sub1) this).aClass55_10671
		= aClass116_10598.method2810("Waterfall2D", (byte) 1);
	    aClass116_10598
		.method2895(((Class369_Sub1_Sub1) this).aClass55_10671);
	}
	return true;
    }
    
    public void method16926(int i, int i_0_, int i_1_) {
	float f = (float) (1 + (i & 0x3)) * -5.0E-4F;
	float f_2_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_3_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	if (bool) {
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[0] = f_3_;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[1] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[2] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[3] = 0.0F;
	} else {
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[0] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[1] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[2] = f_3_;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[3] = 0.0F;
	}
	((Class369_Sub1_Sub1) this).aFloatArray10679[0] = 0.0F;
	((Class369_Sub1_Sub1) this).aFloatArray10679[1] = f_3_;
	((Class369_Sub1_Sub1) this).aFloatArray10679[2] = 0.0F;
	((Class369_Sub1_Sub1) this).aFloatArray10679[3]
	    = (float) aClass103_Sub3_5566.anInt9601 * f % 1.0F;
	if (!((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627) {
	    int i_4_ = (int) (16.0F * ((float) aClass103_Sub3_5566.anInt9601
				       * f_2_));
	    aClass103_Sub3_5566.method15856(((Class369_Sub1_Sub1) this)
					    .aClass375_10674
					    .anInterface41Array5630
					    [i_4_ % 16]);
	} else
	    ((Class369_Sub1_Sub1) this).aFloat10681
		= (float) ((double) aClass103_Sub3_5566.anInt9601
			   * (double) f_2_ % 1.0);
    }
    
    public void method16927(int i, int i_5_) {
	float f = (float) (1 + (i & 0x3)) * -5.0E-4F;
	float f_6_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_7_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	if (bool) {
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[0] = f_7_;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[1] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[2] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[3] = 0.0F;
	} else {
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[0] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[1] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[2] = f_7_;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[3] = 0.0F;
	}
	((Class369_Sub1_Sub1) this).aFloatArray10679[0] = 0.0F;
	((Class369_Sub1_Sub1) this).aFloatArray10679[1] = f_7_;
	((Class369_Sub1_Sub1) this).aFloatArray10679[2] = 0.0F;
	((Class369_Sub1_Sub1) this).aFloatArray10679[3]
	    = (float) aClass103_Sub3_5566.anInt9601 * f % 1.0F;
	if (!((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627) {
	    int i_8_ = (int) (16.0F * ((float) aClass103_Sub3_5566.anInt9601
				       * f_6_));
	    aClass103_Sub3_5566.method15856(((Class369_Sub1_Sub1) this)
					    .aClass375_10674
					    .anInterface41Array5630
					    [i_8_ % 16]);
	} else
	    ((Class369_Sub1_Sub1) this).aFloat10681
		= (float) ((double) aClass103_Sub3_5566.anInt9601
			   * (double) f_6_ % 1.0);
    }
    
    public Class369_Sub1_Sub1
	(Class103_Sub3 class103_sub3, Class375 class375)
	throws Exception_Sub7 {
	super(class103_sub3);
	((Class369_Sub1_Sub1) this).aFloatArray10679 = new float[4];
	((Class369_Sub1_Sub1) this).aClass375_10674 = class375;
	if (((Class369_Sub1_Sub1) this).aClass375_10674.method6721()
	    && class103_sub3.method15605())
	    method16799("Waterfall");
    }
    
    public void method16928(int i, int i_9_) {
	float f = (float) (1 + (i & 0x3)) * -5.0E-4F;
	float f_10_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_11_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	if (bool) {
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[0] = f_11_;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[1] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[2] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[3] = 0.0F;
	} else {
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[0] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[1] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[2] = f_11_;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[3] = 0.0F;
	}
	((Class369_Sub1_Sub1) this).aFloatArray10679[0] = 0.0F;
	((Class369_Sub1_Sub1) this).aFloatArray10679[1] = f_11_;
	((Class369_Sub1_Sub1) this).aFloatArray10679[2] = 0.0F;
	((Class369_Sub1_Sub1) this).aFloatArray10679[3]
	    = (float) aClass103_Sub3_5566.anInt9601 * f % 1.0F;
	if (!((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627) {
	    int i_12_ = (int) (16.0F * ((float) aClass103_Sub3_5566.anInt9601
					* f_10_));
	    aClass103_Sub3_5566.method15856(((Class369_Sub1_Sub1) this)
					    .aClass375_10674
					    .anInterface41Array5630
					    [i_12_ % 16]);
	} else
	    ((Class369_Sub1_Sub1) this).aFloat10681
		= (float) ((double) aClass103_Sub3_5566.anInt9601
			   * (double) f_10_ % 1.0);
    }
    
    public void method16929(int i, int i_13_) {
	float f = (float) (1 + (i & 0x3)) * -5.0E-4F;
	float f_14_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_15_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	if (bool) {
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[0] = f_15_;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[1] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[2] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[3] = 0.0F;
	} else {
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[0] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[1] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[2] = f_15_;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[3] = 0.0F;
	}
	((Class369_Sub1_Sub1) this).aFloatArray10679[0] = 0.0F;
	((Class369_Sub1_Sub1) this).aFloatArray10679[1] = f_15_;
	((Class369_Sub1_Sub1) this).aFloatArray10679[2] = 0.0F;
	((Class369_Sub1_Sub1) this).aFloatArray10679[3]
	    = (float) aClass103_Sub3_5566.anInt9601 * f % 1.0F;
	if (!((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627) {
	    int i_16_ = (int) (16.0F * ((float) aClass103_Sub3_5566.anInt9601
					* f_14_));
	    aClass103_Sub3_5566.method15856(((Class369_Sub1_Sub1) this)
					    .aClass375_10674
					    .anInterface41Array5630
					    [i_16_ % 16]);
	} else
	    ((Class369_Sub1_Sub1) this).aFloat10681
		= (float) ((double) aClass103_Sub3_5566.anInt9601
			   * (double) f_14_ % 1.0);
    }
    
    public void method16930(int i, int i_17_) {
	float f = (float) (1 + (i & 0x3)) * -5.0E-4F;
	float f_18_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_19_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	if (bool) {
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[0] = f_19_;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[1] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[2] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[3] = 0.0F;
	} else {
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[0] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[1] = 0.0F;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[2] = f_19_;
	    ((Class369_Sub1_Sub1) this).aFloatArray10683[3] = 0.0F;
	}
	((Class369_Sub1_Sub1) this).aFloatArray10679[0] = 0.0F;
	((Class369_Sub1_Sub1) this).aFloatArray10679[1] = f_19_;
	((Class369_Sub1_Sub1) this).aFloatArray10679[2] = 0.0F;
	((Class369_Sub1_Sub1) this).aFloatArray10679[3]
	    = (float) aClass103_Sub3_5566.anInt9601 * f % 1.0F;
	if (!((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627) {
	    int i_20_ = (int) (16.0F * ((float) aClass103_Sub3_5566.anInt9601
					* f_18_));
	    aClass103_Sub3_5566.method15856(((Class369_Sub1_Sub1) this)
					    .aClass375_10674
					    .anInterface41Array5630
					    [i_20_ % 16]);
	} else
	    ((Class369_Sub1_Sub1) this).aFloat10681
		= (float) ((double) aClass103_Sub3_5566.anInt9601
			   * (double) f_18_ % 1.0);
    }
    
    boolean method16815() throws Exception_Sub7 {
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10667
	    = aClass116_10598.method2815("WorldMatrix", (byte) -46);
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10672
	    = aClass116_10598.method2815("WVPMatrix", (byte) -83);
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10677
	    = aClass116_10598.method2815("UGenerationPlane", (byte) -3);
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10676
	    = aClass116_10598.method2815("VGenerationPlane", (byte) -103);
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10668
	    = aClass116_10598.method2815("Time", (byte) -59);
	((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10678
	    = aClass116_10598.method2815("billowSampler3D", (byte) -32);
	if (((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627) {
	    ((Class369_Sub1_Sub1) this).aClass55_10670
		= aClass116_10598.method2810("Waterfall3D", (byte) 1);
	    aClass116_10598
		.method2895(((Class369_Sub1_Sub1) this).aClass55_10670);
	} else {
	    ((Class369_Sub1_Sub1) this).aClass55_10671
		= aClass116_10598.method2810("Waterfall2D", (byte) 1);
	    aClass116_10598
		.method2895(((Class369_Sub1_Sub1) this).aClass55_10671);
	}
	return true;
    }
    
    public void method16931() {
	if (((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627)
	    aClass116_10598
		.method2895(((Class369_Sub1_Sub1) this).aClass55_10670);
	else
	    aClass116_10598
		.method2895(((Class369_Sub1_Sub1) this).aClass55_10671);
	aClass116_10598.method2805();
	if (((Class369_Sub1_Sub1) this).aClass375_10674.aBool5627)
	    aClass116_10598.method2828((((Class369_Sub1_Sub1) this)
					.aClass241_Sub23_Sub1_10678),
				       0,
				       (((Class369_Sub1_Sub1) this)
					.aClass375_10674.anInterface38_5628),
				       1830684946);
	aClass116_10598.method2837((((Class369_Sub1_Sub1) this)
				    .aClass241_Sub23_Sub1_10667),
				   aClass268_10675, (byte) -93);
	aClass116_10598.method2837((((Class369_Sub1_Sub1) this)
				    .aClass241_Sub23_Sub1_10672),
				   aClass268_10673, (byte) -18);
	aClass116_10598.method2823
	    (((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10677,
	     new Class285(((Class369_Sub1_Sub1) this).aFloatArray10683[0],
			  ((Class369_Sub1_Sub1) this).aFloatArray10683[1],
			  ((Class369_Sub1_Sub1) this).aFloatArray10683[2],
			  ((Class369_Sub1_Sub1) this).aFloatArray10683[3]),
	     16711935);
	aClass116_10598.method2823
	    (((Class369_Sub1_Sub1) this).aClass241_Sub23_Sub1_10676,
	     new Class285(((Class369_Sub1_Sub1) this).aFloatArray10679[0],
			  ((Class369_Sub1_Sub1) this).aFloatArray10679[1],
			  ((Class369_Sub1_Sub1) this).aFloatArray10679[2],
			  ((Class369_Sub1_Sub1) this).aFloatArray10679[3]),
	     16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub1) this)
				    .aClass241_Sub23_Sub1_10668),
				   new Class285((((Class369_Sub1_Sub1) this)
						 .aFloat10681),
						0.0F, 0.0F, 0.0F),
				   16711935);
	aClass103_Sub3_5566.method15726(Class310.aClass310_4822,
					anInt10680 * -303836651,
					anInt10682 * -640404647,
					anInt10669 * 1723256295,
					2141729887 * anInt10684);
    }
}
