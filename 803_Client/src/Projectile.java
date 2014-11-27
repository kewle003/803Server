/* Class475_Sub1_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Projectile extends Class475_Sub1_Sub1
{
    public int anInt11454;
    int anInt11455;
    public int anInt11456;
    public int anInt11457;
    double aDouble11458;
    int anInt11459;
    int anInt11460;
    int anInt11461;
    double aDouble11462;
    int anInt11463;
    boolean aBool11464;
    boolean aBool11465 = false;
    int anInt11466;
    double aDouble11467;
    Class489 aClass489_11468;
    double aDouble11469;
    double aDouble11470;
    Class409 aClass409_11471;
    int anInt11472 = 0;
    public int anInt11473;
    int anInt11474;
    boolean aBool11475 = false;
    
    void method14476(Class103 class103) {
	Class89 class89 = method17890(class103, 0, -373812133);
	if (null != class89) {
	    Class266 class266 = method10893();
	    anInt11472
		= class89.method1902() * -1018945979;
	    class89.method1894();
	    method17891(class103, class89, class266, (byte) 72);
	}
    }
    
    public Projectile(Class552 class552, int gfxId, int i_0_, int i_1_, int i_2_, int i_3_,
    		int i_4_, int i_5_, int i_6_, int curve, int i_8_, int i_9_, int targetID,
    		int i_11_, boolean bool, int i_12_, int i_13_) {
		super(class552, i_0_, i_1_, i_2_,
		      Class96_Sub5.method16046(i_2_, i_3_, i_0_, 922805386) - i_4_,
		      i_3_, i_2_ >> 9, i_2_ >> 9, i_3_ >> 9, i_3_ >> 9, false,
		      (byte) 0);
		anInt11474 = 0;
		anInt11459 = -365879423 * gfxId;
		anInt11457 = 1366756011 * i_5_;
		anInt11454 = i_6_ * -107871423;
		anInt11466 = curve * 949180091;
		anInt11460 = 514940157 * i_8_;
		anInt11461 = i_9_ * -1075959255;
		anInt11473 = targetID * 233279755;
		anInt11455 = 1921979543 * i_4_;
		anInt11456 = 1228131495 * i_11_;
		aBool11464 = bool;
		aBool11465 = false;
		anInt11463 = i_12_ * -749924115;
		anInt11474 = -1750261169 * i_13_;
		int i_14_ = (Class240.graphicsDefLoader.getGraphicsDefinition
			     (anInt11459 * 1624187009,
			      1232200923)
			     .anInt6267) * 850723107;
		aClass409_11471
		    = new Class409_Sub3(this, false);
		aClass409_11471.method7347(i_14_,
									    519679123);
		method14465(1, 1396609178);
    }
    
    boolean method14452(byte i) {
	return aBool11475;
    }
    
    public int method14492() {
	return 1631405197 * anInt11472;
    }
    
    public int method17886(int i) {
	return -1080380241 * anInt11474;
    }
    
    boolean method14466() {
	return false;
    }
    
    public final void method17887(int i, int i_15_, int i_16_, int i_17_,
				  int i_18_) {
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	if (!aBool11465) {
	    float f = (float) i - class287.aFloat4477;
	    float f_19_ = (float) i_15_ - class287.aFloat4479;
	    float f_20_ = (float) Math.sqrt((double) (f * f + f_19_ * f_19_));
	    if (f_20_ != 0.0F) {
		class287.aFloat4477
		    += f * (float) (408330325
				    * (((Projectile) this)
				       .anInt11460)) / f_20_;
		class287.aFloat4479
		    += f_19_ * (float) (408330325
					* (((Projectile) this)
					   .anInt11460)) / f_20_;
	    }
	    if (aBool11464)
		class287.aFloat4474
		    = (float) (Class96_Sub5.method16046((int) (class287
							       .aFloat4477),
							(int) (class287
							       .aFloat4479),
							nodePlane, 369568721)
			       - (anInt11455
				  * -779769049));
	    method10898(class287);
	}
	double d = (double) (170167489 * anInt11454 + 1 - i_17_);
	aDouble11462
	    = (double) ((float) i - class287.aFloat4477) / d;
	aDouble11467
	    = (double) ((float) i_15_ - class287.aFloat4479) / d;
	aDouble11458
	    = Math.sqrt((aDouble11467
			 * aDouble11467)
			+ (aDouble11462
			   * aDouble11462));
	if (-1 != anInt11466 * 1902149235) {
	    if (!aBool11465)
		aDouble11469
		    = (-aDouble11458
		       * Math.tan((double) ((((Projectile) this)
					     .anInt11466)
					    * 1902149235) * 0.02454369));
	    aDouble11470
		= (((double) ((float) i_16_ - class287.aFloat4474)
		    - aDouble11469 * d)
		   * 2.0 / (d * d));
	} else
	    aDouble11469
		= (double) ((float) i_16_ - class287.aFloat4474) / d;
	class287.method5564();
    }
    
    public void method17888(int i) {
	if (!aBool11465) {
	    if (712970777 * anInt11461 != 0) {
		Entity class475_sub1_sub1_sub3 = null;
		if (-831877317 * client.anInt8266 == 4)
		    class475_sub1_sub1_sub3
			= Class25.aClass93Array213
			      [(anInt11461
				* 712970777) - 1]
			      .method2083(-1324147267);
		else if ((712970777
			  * anInt11461)
			 < 0) {
		    int i_21_ = (-(anInt11461
				   * 712970777)
				 - 1);
		    if (client.myPlayerIndex * 1124115145 == i_21_)
			class475_sub1_sub1_sub3
			    = Class21.myPlayer;
		    else
			class475_sub1_sub1_sub3
			    = (client.localPlayers
			       [i_21_]);
		} else {
		    int i_22_ = ((anInt11461
				  * 712970777)
				 - 1);
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i_22_));
		    if (class241_sub26 != null)
			class475_sub1_sub1_sub3
			    = ((Entity)
			       class241_sub26.objectValue);
		}
		if (null != class475_sub1_sub1_sub3) {
		    Class287 class287
			= class475_sub1_sub1_sub3.method10874().aClass287_4386;
		    method10880(class287.aFloat4477,
				(float) ((Class96_Sub5.method16046
					  ((int) class287.aFloat4477,
					   (int) class287.aFloat4479,
					   nodePlane, -446001758))
					 - (((Projectile) this)
					    .anInt11455) * -779769049),
				class287.aFloat4479);
		    if ((anInt11463
			 * 1098894565)
			>= 0) {
			Class554 class554
			    = class475_sub1_sub1_sub3.method17787(1535210854);
			int i_23_ = 0;
			int i_24_ = 0;
			if (class554.anIntArrayArray7231 != null
			    && (class554.anIntArrayArray7231
				[(anInt11463
				  * 1098894565)]) != null) {
			    i_23_ += (class554.anIntArrayArray7231
				      [1098894565 * ((Projectile)
						     this).anInt11463]
				      [0]);
			    i_24_ += (class554.anIntArrayArray7231
				      [1098894565 * ((Projectile)
						     this).anInt11463]
				      [2]);
			}
			if (null != class554.anIntArrayArray7203
			    && null != (class554.anIntArrayArray7203
					[(1098894565
					  * (((Projectile) this)
					     .anInt11463))])) {
			    i_23_ += (class554.anIntArrayArray7203
				      [1098894565 * ((Projectile)
						     this).anInt11463]
				      [0]);
			    i_24_ += (class554.anIntArrayArray7203
				      [(((Projectile) this)
					.anInt11463) * 1098894565]
				      [2]);
			}
			if (0 != i_23_ || 0 != i_24_) {
			    int i_25_ = class475_sub1_sub1_sub3
					    .aClass8_11406
					    .method514((byte) 14);
			    int i_26_ = i_25_;
			    if (class475_sub1_sub1_sub3.anIntArray11418 != null
				&& (class475_sub1_sub1_sub3.anIntArray11418
				    [(((Projectile) this)
				      .anInt11463) * 1098894565]) != -1)
				i_26_
				    = (class475_sub1_sub1_sub3.anIntArray11418
				       [(((Projectile) this)
					 .anInt11463) * 1098894565]);
			    int i_27_ = i_26_ - i_25_ & 0x3fff;
			    int i_28_ = Class282.anIntArray4430[i_27_];
			    int i_29_ = Class282.anIntArray4441[i_27_];
			    int i_30_ = i_28_ * i_24_ + i_23_ * i_29_ >> 14;
			    i_24_ = i_24_ * i_29_ - i_28_ * i_23_ >> 14;
			    i_23_ = i_30_;
			    Class287 class287_31_
				= Class287.method5562(method10874()
						      .aClass287_4386);
			    class287_31_.aFloat4477 += (float) i_23_;
			    class287_31_.aFloat4479 += (float) i_24_;
			    method10898(class287_31_);
			    class287_31_.method5564();
			}
		    }
		}
	    }
	}
    }
    
    public final void method17889(int i, int i_32_) {
	aBool11465 = true;
	Class276 class276 = new Class276(method10874());
	class276.aClass287_4386.aFloat4477
	    += (double) i * aDouble11462;
	class276.aClass287_4386.aFloat4479
	    += (double) i * aDouble11467;
	if (aBool11464)
	    class276.aClass287_4386.aFloat4474
		= (float) (Class96_Sub5.method16046((int) (class276
							   .aClass287_4386
							   .aFloat4477),
						    (int) (class276
							   .aClass287_4386
							   .aFloat4479),
						    nodePlane, -340336826)
			   - (-779769049
			      * anInt11455));
	else if (-1
		 != anInt11466 * 1902149235) {
	    class276.aClass287_4386.aFloat4474
		+= (aDouble11469 * (double) i
		    + (aDouble11470 * 0.5
		       * (double) i * (double) i));
	    aDouble11469
		+= (double) i * aDouble11470;
	} else
	    class276.aClass287_4386.aFloat4474
		+= (double) i * aDouble11469;
	class276.aClass278_4385.method5409
	    (1.0F, 0.0F, 0.0F,
	     (float) Math.atan2(aDouble11469,
				(((Projectile) this)
				 .aDouble11458)));
	Class278 class278 = Class278.method5414();
	class278.method5409
	    (0.0F, 1.0F, 0.0F,
	     ((float) Math.atan2(aDouble11462,
				 aDouble11467)
	      - 3.1415927F));
	class276.aClass278_4385.method5396(class278);
	class278.method5375();
	method10876(class276);
	if (aClass409_11471
		.method7411(1, (byte) 1)
	    && aClass409_11471
		   .method7419((byte) 64))
	    aClass409_11471
		.method7379(1737743024);
    }
    
    Class89 method17890(Class103 class103, int i, int i_33_) {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition((1624187009
						   * ((Projectile)
						      this).anInt11459),
						  1232200923);
	return class460.method10624(class103, i,
				    (((Projectile) this)
				     .aClass409_11471),
				    (byte) 2, (byte) -119);
    }
    
    Class542 method14455(Class103 class103, int i) {
	Class89 class89 = method17890(class103, 2048, 1306466465);
	if (class89 == null)
	    return null;
	Class266 class266 = method10893();
	method17891(class103, class89, class266, (byte) 29);
	Class542 class542 = Class128.method3016(false, -2080068107);
	class89.method1890(class266, aClass97Array8748[0], 0);
	if (aClass489_11468 != null) {
	    Class98 class98 = ((Projectile) this)
				  .aClass489_11468.method11164();
	    class103.method2305(class98);
	}
	aBool11475 = class89.method2052();
	class89.method1894();
	anInt11472
	    = class89.method1902() * -1018945979;
	return class542;
    }
    
    void method14493(Class103 class103, byte i) {
	Class89 class89 = method17890(class103, 0, -1475084449);
	if (null != class89) {
	    Class266 class266 = method10893();
	    anInt11472
		= class89.method1902() * -1018945979;
	    class89.method1894();
	    method17891(class103, class89, class266, (byte) 61);
	}
    }
    
    public int method14468(byte i) {
	return 1631405197 * anInt11472;
    }
    
    void method17891(Class103 class103, Class89 class89, Class266 class266,
		     byte i) {
	class89.method1915(class266);
	Class106[] class106s = class89.method2051();
	Class167[] class167s = class89.method1917();
	if ((null == aClass489_11468
	     || aClass489_11468.aBool6487)
	    && (class106s != null || class167s != null))
	    aClass489_11468
		= Class489.method11182(client.anInt8296, true);
	if (null != aClass489_11468) {
	    aClass489_11468.method11158
		(class103, (long) client.anInt8296, class106s, class167s,
		 false);
	    aClass489_11468.method11162
		(nodePlane, aShort10717, aShort10716, aShort10718,
		 aShort10719);
	}
    }
    
    public void method17892(int i) {
	if (aClass489_11468 != null)
	    aClass489_11468.method11154();
    }
    
    Class89 method17893(Class103 class103, int i) {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition((1624187009
						   * ((Projectile)
						      this).anInt11459),
						  1232200923);
	return class460.method10624(class103, i,
				    (((Projectile) this)
				     .aClass409_11471),
				    (byte) 2, (byte) -87);
    }
    
    final boolean method14450(int i) {
	return false;
    }
    
    public int method17894() {
	return -1080380241 * anInt11474;
    }
    
    final void method14454(byte i) {
	throw new IllegalStateException();
    }
    
    final boolean method14477() {
	return false;
    }
    
    public int method17895() {
	return -1080380241 * anInt11474;
    }
    
    boolean method14451() {
	return aBool11475;
    }
    
    final boolean method14456() {
	return false;
    }
    
    public Class535 method14470(Class103 class103) {
	return null;
    }
    
    Class542 method14472(Class103 class103) {
	Class89 class89 = method17890(class103, 2048, 986368817);
	if (class89 == null)
	    return null;
	Class266 class266 = method10893();
	method17891(class103, class89, class266, (byte) 41);
	Class542 class542 = Class128.method3016(false, -2104541354);
	class89.method1890(class266, aClass97Array8748[0], 0);
	if (aClass489_11468 != null) {
	    Class98 class98 = ((Projectile) this)
				  .aClass489_11468.method11164();
	    class103.method2305(class98);
	}
	aBool11475 = class89.method2052();
	class89.method1894();
	anInt11472
	    = class89.method1902() * -1018945979;
	return class542;
    }
    
    Class542 method14473(Class103 class103) {
	Class89 class89 = method17890(class103, 2048, -28145720);
	if (class89 == null)
	    return null;
	Class266 class266 = method10893();
	method17891(class103, class89, class266, (byte) 62);
	Class542 class542 = Class128.method3016(false, -2131708290);
	class89.method1890(class266, aClass97Array8748[0], 0);
	if (aClass489_11468 != null) {
	    Class98 class98 = ((Projectile) this)
				  .aClass489_11468.method11164();
	    class103.method2305(class98);
	}
	aBool11475 = class89.method2052();
	class89.method1894();
	anInt11472
	    = class89.method1902() * -1018945979;
	return class542;
    }
    
    Class542 method14474(Class103 class103) {
	Class89 class89 = method17890(class103, 2048, -221013273);
	if (class89 == null)
	    return null;
	Class266 class266 = method10893();
	method17891(class103, class89, class266, (byte) 93);
	Class542 class542 = Class128.method3016(false, -2093394681);
	class89.method1890(class266, aClass97Array8748[0], 0);
	if (aClass489_11468 != null) {
	    Class98 class98 = ((Projectile) this)
				  .aClass489_11468.method11164();
	    class103.method2305(class98);
	}
	aBool11475 = class89.method2052();
	class89.method1894();
	anInt11472
	    = class89.method1902() * -1018945979;
	return class542;
    }
    
    Class542 method14475(Class103 class103) {
	Class89 class89 = method17890(class103, 2048, -2097333361);
	if (class89 == null)
	    return null;
	Class266 class266 = method10893();
	method17891(class103, class89, class266, (byte) 101);
	Class542 class542 = Class128.method3016(false, -2089650296);
	class89.method1890(class266, aClass97Array8748[0], 0);
	if (aClass489_11468 != null) {
	    Class98 class98 = ((Projectile) this)
				  .aClass489_11468.method11164();
	    class103.method2305(class98);
	}
	aBool11475 = class89.method2052();
	class89.method1894();
	anInt11472
	    = class89.method1902() * -1018945979;
	return class542;
    }
    
    void method17896(Class103 class103, Class89 class89, Class266 class266) {
	class89.method1915(class266);
	Class106[] class106s = class89.method2051();
	Class167[] class167s = class89.method1917();
	if ((null == aClass489_11468
	     || aClass489_11468.aBool6487)
	    && (class106s != null || class167s != null))
	    aClass489_11468
		= Class489.method11182(client.anInt8296, true);
	if (null != aClass489_11468) {
	    aClass489_11468.method11158
		(class103, (long) client.anInt8296, class106s, class167s,
		 false);
	    aClass489_11468.method11162
		(nodePlane, aShort10717, aShort10716, aShort10718,
		 aShort10719);
	}
    }
    
    public final void method17897(int i) {
	aBool11465 = true;
	Class276 class276 = new Class276(method10874());
	class276.aClass287_4386.aFloat4477
	    += (double) i * aDouble11462;
	class276.aClass287_4386.aFloat4479
	    += (double) i * aDouble11467;
	if (aBool11464)
	    class276.aClass287_4386.aFloat4474
		= (float) (Class96_Sub5.method16046((int) (class276
							   .aClass287_4386
							   .aFloat4477),
						    (int) (class276
							   .aClass287_4386
							   .aFloat4479),
						    nodePlane, 393021834)
			   - (-779769049
			      * anInt11455));
	else if (-1
		 != anInt11466 * 1902149235) {
	    class276.aClass287_4386.aFloat4474
		+= (aDouble11469 * (double) i
		    + (aDouble11470 * 0.5
		       * (double) i * (double) i));
	    aDouble11469
		+= (double) i * aDouble11470;
	} else
	    class276.aClass287_4386.aFloat4474
		+= (double) i * aDouble11469;
	class276.aClass278_4385.method5409
	    (1.0F, 0.0F, 0.0F,
	     (float) Math.atan2(aDouble11469,
				(((Projectile) this)
				 .aDouble11458)));
	Class278 class278 = Class278.method5414();
	class278.method5409
	    (0.0F, 1.0F, 0.0F,
	     ((float) Math.atan2(aDouble11462,
				 aDouble11467)
	      - 3.1415927F));
	class276.aClass278_4385.method5396(class278);
	class278.method5375();
	method10876(class276);
	if (aClass409_11471
		.method7411(1, (byte) 1)
	    && aClass409_11471
		   .method7419((byte) 9))
	    aClass409_11471
		.method7379(833518139);
    }
    
    boolean method14488(Class103 class103, int i, int i_34_) {
	return false;
    }
    
    final boolean method14479() {
	return false;
    }
    
    final void method14480(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_35_, int i_36_, boolean bool) {
	throw new IllegalStateException();
    }
    
    void method16999(int i) {
	Class287 class287 = method10874().aClass287_4386;
	aShort10717 = aShort10716
	    = (short) (int) (class287.aFloat4477 / 512.0F);
	aShort10718 = aShort10719
	    = (short) (int) (class287.aFloat4479 / 512.0F);
    }
    
    final void method14482(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_37_, int i_38_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method14481(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_39_, int i_40_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method14478() {
	throw new IllegalStateException();
    }
    
    void method17000() {
	Class287 class287 = method10874().aClass287_4386;
	aShort10717 = aShort10716
	    = (short) (int) (class287.aFloat4477 / 512.0F);
	aShort10718 = aShort10719
	    = (short) (int) (class287.aFloat4479 / 512.0F);
    }
    
    void method17001() {
	Class287 class287 = method10874().aClass287_4386;
	aShort10717 = aShort10716
	    = (short) (int) (class287.aFloat4477 / 512.0F);
	aShort10718 = aShort10719
	    = (short) (int) (class287.aFloat4479 / 512.0F);
    }
    
    void method17002() {
	Class287 class287 = method10874().aClass287_4386;
	aShort10717 = aShort10716
	    = (short) (int) (class287.aFloat4477 / 512.0F);
	aShort10718 = aShort10719
	    = (short) (int) (class287.aFloat4479 / 512.0F);
    }
    
    void method17003() {
	Class287 class287 = method10874().aClass287_4386;
	aShort10717 = aShort10716
	    = (short) (int) (class287.aFloat4477 / 512.0F);
	aShort10718 = aShort10719
	    = (short) (int) (class287.aFloat4479 / 512.0F);
    }
    
    boolean method14448(Class103 class103, int i, int i_41_, int i_42_) {
	return false;
    }
    
    public Class535 method14457(Class103 class103, int i) {
	return null;
    }
    
    boolean method14467() {
	return aBool11475;
    }
    
    public final void method17898(int i, int i_43_, int i_44_, int i_45_) {
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	if (!aBool11465) {
	    float f = (float) i - class287.aFloat4477;
	    float f_46_ = (float) i_43_ - class287.aFloat4479;
	    float f_47_ = (float) Math.sqrt((double) (f * f + f_46_ * f_46_));
	    if (f_47_ != 0.0F) {
		class287.aFloat4477
		    += f * (float) (408330325
				    * (((Projectile) this)
				       .anInt11460)) / f_47_;
		class287.aFloat4479
		    += f_46_ * (float) (408330325
					* (((Projectile) this)
					   .anInt11460)) / f_47_;
	    }
	    if (aBool11464)
		class287.aFloat4474
		    = (float) (Class96_Sub5.method16046((int) (class287
							       .aFloat4477),
							(int) (class287
							       .aFloat4479),
							nodePlane, 534301645)
			       - (anInt11455
				  * -779769049));
	    method10898(class287);
	}
	double d = (double) (170167489 * anInt11454 + 1 - i_45_);
	aDouble11462
	    = (double) ((float) i - class287.aFloat4477) / d;
	aDouble11467
	    = (double) ((float) i_43_ - class287.aFloat4479) / d;
	aDouble11458
	    = Math.sqrt((aDouble11467
			 * aDouble11467)
			+ (aDouble11462
			   * aDouble11462));
	if (-1 != anInt11466 * 1902149235) {
	    if (!aBool11465)
		aDouble11469
		    = (-aDouble11458
		       * Math.tan((double) ((((Projectile) this)
					     .anInt11466)
					    * 1902149235) * 0.02454369));
	    aDouble11470
		= (((double) ((float) i_44_ - class287.aFloat4474)
		    - aDouble11469 * d)
		   * 2.0 / (d * d));
	} else
	    aDouble11469
		= (double) ((float) i_44_ - class287.aFloat4474) / d;
	class287.method5564();
    }
    
    final void method14453(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_48_, int i_49_, boolean bool,
			   int i_50_) {
	throw new IllegalStateException();
    }
    
    public void method17899() {
	if (!aBool11465) {
	    if (712970777 * anInt11461 != 0) {
		Entity class475_sub1_sub1_sub3 = null;
		if (-831877317 * client.anInt8266 == 4)
		    class475_sub1_sub1_sub3
			= Class25.aClass93Array213
			      [(anInt11461
				* 712970777) - 1]
			      .method2083(-132897262);
		else if ((712970777
			  * anInt11461)
			 < 0) {
		    int i = (-(anInt11461
			       * 712970777)
			     - 1);
		    if (client.myPlayerIndex * 1124115145 == i)
			class475_sub1_sub1_sub3
			    = Class21.myPlayer;
		    else
			class475_sub1_sub1_sub3
			    = client.localPlayers[i];
		} else {
		    int i = ((anInt11461
			      * 712970777)
			     - 1);
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i));
		    if (class241_sub26 != null)
			class475_sub1_sub1_sub3
			    = ((Entity)
			       class241_sub26.objectValue);
		}
		if (null != class475_sub1_sub1_sub3) {
		    Class287 class287
			= class475_sub1_sub1_sub3.method10874().aClass287_4386;
		    method10880(class287.aFloat4477,
				(float) ((Class96_Sub5.method16046
					  ((int) class287.aFloat4477,
					   (int) class287.aFloat4479,
					   nodePlane, 600988150))
					 - (((Projectile) this)
					    .anInt11455) * -779769049),
				class287.aFloat4479);
		    if ((anInt11463
			 * 1098894565)
			>= 0) {
			Class554 class554
			    = class475_sub1_sub1_sub3.method17787(1091087037);
			int i = 0;
			int i_51_ = 0;
			if (class554.anIntArrayArray7231 != null
			    && (class554.anIntArrayArray7231
				[(anInt11463
				  * 1098894565)]) != null) {
			    i += (class554.anIntArrayArray7231
				  [1098894565 * ((Projectile)
						 this).anInt11463]
				  [0]);
			    i_51_ += (class554.anIntArrayArray7231
				      [1098894565 * ((Projectile)
						     this).anInt11463]
				      [2]);
			}
			if (null != class554.anIntArrayArray7203
			    && null != (class554.anIntArrayArray7203
					[(1098894565
					  * (((Projectile) this)
					     .anInt11463))])) {
			    i += (class554.anIntArrayArray7203
				  [1098894565 * ((Projectile)
						 this).anInt11463]
				  [0]);
			    i_51_ += (class554.anIntArrayArray7203
				      [(((Projectile) this)
					.anInt11463) * 1098894565]
				      [2]);
			}
			if (0 != i || 0 != i_51_) {
			    int i_52_ = class475_sub1_sub1_sub3
					    .aClass8_11406
					    .method514((byte) 69);
			    int i_53_ = i_52_;
			    if (class475_sub1_sub1_sub3.anIntArray11418 != null
				&& (class475_sub1_sub1_sub3.anIntArray11418
				    [(((Projectile) this)
				      .anInt11463) * 1098894565]) != -1)
				i_53_
				    = (class475_sub1_sub1_sub3.anIntArray11418
				       [(((Projectile) this)
					 .anInt11463) * 1098894565]);
			    int i_54_ = i_53_ - i_52_ & 0x3fff;
			    int i_55_ = Class282.anIntArray4430[i_54_];
			    int i_56_ = Class282.anIntArray4441[i_54_];
			    int i_57_ = i_55_ * i_51_ + i * i_56_ >> 14;
			    i_51_ = i_51_ * i_56_ - i_55_ * i >> 14;
			    i = i_57_;
			    Class287 class287_58_
				= Class287.method5562(method10874()
						      .aClass287_4386);
			    class287_58_.aFloat4477 += (float) i;
			    class287_58_.aFloat4479 += (float) i_51_;
			    method10898(class287_58_);
			    class287_58_.method5564();
			}
		    }
		}
	    }
	}
    }
    
    public void method17900() {
	if (!aBool11465) {
	    if (712970777 * anInt11461 != 0) {
		Entity class475_sub1_sub1_sub3 = null;
		if (-831877317 * client.anInt8266 == 4)
		    class475_sub1_sub1_sub3
			= Class25.aClass93Array213
			      [(anInt11461
				* 712970777) - 1]
			      .method2083(-557223265);
		else if ((712970777
			  * anInt11461)
			 < 0) {
		    int i = (-(anInt11461
			       * 712970777)
			     - 1);
		    if (client.myPlayerIndex * 1124115145 == i)
			class475_sub1_sub1_sub3
			    = Class21.myPlayer;
		    else
			class475_sub1_sub1_sub3
			    = client.localPlayers[i];
		} else {
		    int i = ((anInt11461
			      * 712970777)
			     - 1);
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i));
		    if (class241_sub26 != null)
			class475_sub1_sub1_sub3
			    = ((Entity)
			       class241_sub26.objectValue);
		}
		if (null != class475_sub1_sub1_sub3) {
		    Class287 class287
			= class475_sub1_sub1_sub3.method10874().aClass287_4386;
		    method10880(class287.aFloat4477,
				(float) ((Class96_Sub5.method16046
					  ((int) class287.aFloat4477,
					   (int) class287.aFloat4479,
					   nodePlane, -903869339))
					 - (((Projectile) this)
					    .anInt11455) * -779769049),
				class287.aFloat4479);
		    if ((anInt11463
			 * 1098894565)
			>= 0) {
			Class554 class554
			    = class475_sub1_sub1_sub3.method17787(-655091926);
			int i = 0;
			int i_59_ = 0;
			if (class554.anIntArrayArray7231 != null
			    && (class554.anIntArrayArray7231
				[(anInt11463
				  * 1098894565)]) != null) {
			    i += (class554.anIntArrayArray7231
				  [1098894565 * ((Projectile)
						 this).anInt11463]
				  [0]);
			    i_59_ += (class554.anIntArrayArray7231
				      [1098894565 * ((Projectile)
						     this).anInt11463]
				      [2]);
			}
			if (null != class554.anIntArrayArray7203
			    && null != (class554.anIntArrayArray7203
					[(1098894565
					  * (((Projectile) this)
					     .anInt11463))])) {
			    i += (class554.anIntArrayArray7203
				  [1098894565 * ((Projectile)
						 this).anInt11463]
				  [0]);
			    i_59_ += (class554.anIntArrayArray7203
				      [(((Projectile) this)
					.anInt11463) * 1098894565]
				      [2]);
			}
			if (0 != i || 0 != i_59_) {
			    int i_60_ = class475_sub1_sub1_sub3
					    .aClass8_11406
					    .method514((byte) -44);
			    int i_61_ = i_60_;
			    if (class475_sub1_sub1_sub3.anIntArray11418 != null
				&& (class475_sub1_sub1_sub3.anIntArray11418
				    [(((Projectile) this)
				      .anInt11463) * 1098894565]) != -1)
				i_61_
				    = (class475_sub1_sub1_sub3.anIntArray11418
				       [(((Projectile) this)
					 .anInt11463) * 1098894565]);
			    int i_62_ = i_61_ - i_60_ & 0x3fff;
			    int i_63_ = Class282.anIntArray4430[i_62_];
			    int i_64_ = Class282.anIntArray4441[i_62_];
			    int i_65_ = i_63_ * i_59_ + i * i_64_ >> 14;
			    i_59_ = i_59_ * i_64_ - i_63_ * i >> 14;
			    i = i_65_;
			    Class287 class287_66_
				= Class287.method5562(method10874()
						      .aClass287_4386);
			    class287_66_.aFloat4477 += (float) i;
			    class287_66_.aFloat4479 += (float) i_59_;
			    method10898(class287_66_);
			    class287_66_.method5564();
			}
		    }
		}
	    }
	}
    }
    
    Class89 method17901(Class103 class103, int i) {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition((1624187009
						   * ((Projectile)
						      this).anInt11459),
						  1232200923);
	return class460.method10624(class103, i,
				    (((Projectile) this)
				     .aClass409_11471),
				    (byte) 2, (byte) -48);
    }
    
    public void method17902() {
	if (!aBool11465) {
	    if (712970777 * anInt11461 != 0) {
		Entity class475_sub1_sub1_sub3 = null;
		if (-831877317 * client.anInt8266 == 4)
		    class475_sub1_sub1_sub3
			= Class25.aClass93Array213
			      [(anInt11461
				* 712970777) - 1]
			      .method2083(-973044976);
		else if ((712970777
			  * anInt11461)
			 < 0) {
		    int i = (-(anInt11461
			       * 712970777)
			     - 1);
		    if (client.myPlayerIndex * 1124115145 == i)
			class475_sub1_sub1_sub3
			    = Class21.myPlayer;
		    else
			class475_sub1_sub1_sub3
			    = client.localPlayers[i];
		} else {
		    int i = ((anInt11461
			      * 712970777)
			     - 1);
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i));
		    if (class241_sub26 != null)
			class475_sub1_sub1_sub3
			    = ((Entity)
			       class241_sub26.objectValue);
		}
		if (null != class475_sub1_sub1_sub3) {
		    Class287 class287
			= class475_sub1_sub1_sub3.method10874().aClass287_4386;
		    method10880(class287.aFloat4477,
				(float) ((Class96_Sub5.method16046
					  ((int) class287.aFloat4477,
					   (int) class287.aFloat4479,
					   nodePlane, 1756005860))
					 - (((Projectile) this)
					    .anInt11455) * -779769049),
				class287.aFloat4479);
		    if ((anInt11463
			 * 1098894565)
			>= 0) {
			Class554 class554
			    = class475_sub1_sub1_sub3.method17787(-1368025100);
			int i = 0;
			int i_67_ = 0;
			if (class554.anIntArrayArray7231 != null
			    && (class554.anIntArrayArray7231
				[(anInt11463
				  * 1098894565)]) != null) {
			    i += (class554.anIntArrayArray7231
				  [1098894565 * ((Projectile)
						 this).anInt11463]
				  [0]);
			    i_67_ += (class554.anIntArrayArray7231
				      [1098894565 * ((Projectile)
						     this).anInt11463]
				      [2]);
			}
			if (null != class554.anIntArrayArray7203
			    && null != (class554.anIntArrayArray7203
					[(1098894565
					  * (((Projectile) this)
					     .anInt11463))])) {
			    i += (class554.anIntArrayArray7203
				  [1098894565 * ((Projectile)
						 this).anInt11463]
				  [0]);
			    i_67_ += (class554.anIntArrayArray7203
				      [(((Projectile) this)
					.anInt11463) * 1098894565]
				      [2]);
			}
			if (0 != i || 0 != i_67_) {
			    int i_68_ = class475_sub1_sub1_sub3
					    .aClass8_11406
					    .method514((byte) 93);
			    int i_69_ = i_68_;
			    if (class475_sub1_sub1_sub3.anIntArray11418 != null
				&& (class475_sub1_sub1_sub3.anIntArray11418
				    [(((Projectile) this)
				      .anInt11463) * 1098894565]) != -1)
				i_69_
				    = (class475_sub1_sub1_sub3.anIntArray11418
				       [(((Projectile) this)
					 .anInt11463) * 1098894565]);
			    int i_70_ = i_69_ - i_68_ & 0x3fff;
			    int i_71_ = Class282.anIntArray4430[i_70_];
			    int i_72_ = Class282.anIntArray4441[i_70_];
			    int i_73_ = i_71_ * i_67_ + i * i_72_ >> 14;
			    i_67_ = i_67_ * i_72_ - i_71_ * i >> 14;
			    i = i_73_;
			    Class287 class287_74_
				= Class287.method5562(method10874()
						      .aClass287_4386);
			    class287_74_.aFloat4477 += (float) i;
			    class287_74_.aFloat4479 += (float) i_67_;
			    method10898(class287_74_);
			    class287_74_.method5564();
			}
		    }
		}
	    }
	}
    }
    
    public final void method17903(int i) {
	aBool11465 = true;
	Class276 class276 = new Class276(method10874());
	class276.aClass287_4386.aFloat4477
	    += (double) i * aDouble11462;
	class276.aClass287_4386.aFloat4479
	    += (double) i * aDouble11467;
	if (aBool11464)
	    class276.aClass287_4386.aFloat4474
		= (float) (Class96_Sub5.method16046((int) (class276
							   .aClass287_4386
							   .aFloat4477),
						    (int) (class276
							   .aClass287_4386
							   .aFloat4479),
						    nodePlane, 397176982)
			   - (-779769049
			      * anInt11455));
	else if (-1
		 != anInt11466 * 1902149235) {
	    class276.aClass287_4386.aFloat4474
		+= (aDouble11469 * (double) i
		    + (aDouble11470 * 0.5
		       * (double) i * (double) i));
	    aDouble11469
		+= (double) i * aDouble11470;
	} else
	    class276.aClass287_4386.aFloat4474
		+= (double) i * aDouble11469;
	class276.aClass278_4385.method5409
	    (1.0F, 0.0F, 0.0F,
	     (float) Math.atan2(aDouble11469,
				(((Projectile) this)
				 .aDouble11458)));
	Class278 class278 = Class278.method5414();
	class278.method5409
	    (0.0F, 1.0F, 0.0F,
	     ((float) Math.atan2(aDouble11462,
				 aDouble11467)
	      - 3.1415927F));
	class276.aClass278_4385.method5396(class278);
	class278.method5375();
	method10876(class276);
	if (aClass409_11471
		.method7411(1, (byte) 1)
	    && aClass409_11471
		   .method7419((byte) 122))
	    aClass409_11471
		.method7379(1531395524);
    }
    
    public final void method17904(int i, int i_75_, int i_76_, int i_77_) {
	Class287 class287 = Class287.method5562(method10874().aClass287_4386);
	if (!aBool11465) {
	    float f = (float) i - class287.aFloat4477;
	    float f_78_ = (float) i_75_ - class287.aFloat4479;
	    float f_79_ = (float) Math.sqrt((double) (f * f + f_78_ * f_78_));
	    if (f_79_ != 0.0F) {
		class287.aFloat4477
		    += f * (float) (408330325
				    * (((Projectile) this)
				       .anInt11460)) / f_79_;
		class287.aFloat4479
		    += f_78_ * (float) (408330325
					* (((Projectile) this)
					   .anInt11460)) / f_79_;
	    }
	    if (aBool11464)
		class287.aFloat4474
		    = (float) (Class96_Sub5.method16046((int) (class287
							       .aFloat4477),
							(int) (class287
							       .aFloat4479),
							nodePlane, 1478177816)
			       - (anInt11455
				  * -779769049));
	    method10898(class287);
	}
	double d = (double) (170167489 * anInt11454 + 1 - i_77_);
	aDouble11462
	    = (double) ((float) i - class287.aFloat4477) / d;
	aDouble11467
	    = (double) ((float) i_75_ - class287.aFloat4479) / d;
	aDouble11458
	    = Math.sqrt((aDouble11467
			 * aDouble11467)
			+ (aDouble11462
			   * aDouble11462));
	if (-1 != anInt11466 * 1902149235) {
	    if (!aBool11465)
		aDouble11469
		    = (-aDouble11458
		       * Math.tan((double) ((((Projectile) this)
					     .anInt11466)
					    * 1902149235) * 0.02454369));
	    aDouble11470
		= (((double) ((float) i_76_ - class287.aFloat4474)
		    - aDouble11469 * d)
		   * 2.0 / (d * d));
	} else
	    aDouble11469
		= (double) ((float) i_76_ - class287.aFloat4474) / d;
	class287.method5564();
    }
    
    boolean method14469(byte i) {
	return false;
    }
    
    Class89 method17905(Class103 class103, int i) {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition((1624187009
						   * ((Projectile)
						      this).anInt11459),
						  1232200923);
	return class460.method10624(class103, i,
				    (((Projectile) this)
				     .aClass409_11471),
				    (byte) 2, (byte) -119);
    }
    
    final void method14483() {
	throw new IllegalStateException();
    }
    
    public void method17906() {
	if (!aBool11465) {
	    if (712970777 * anInt11461 != 0) {
		Entity class475_sub1_sub1_sub3 = null;
		if (-831877317 * client.anInt8266 == 4)
		    class475_sub1_sub1_sub3
			= Class25.aClass93Array213
			      [(anInt11461
				* 712970777) - 1]
			      .method2083(-752468483);
		else if ((712970777
			  * anInt11461)
			 < 0) {
		    int i = (-(anInt11461
			       * 712970777)
			     - 1);
		    if (client.myPlayerIndex * 1124115145 == i)
			class475_sub1_sub1_sub3
			    = Class21.myPlayer;
		    else
			class475_sub1_sub1_sub3
			    = client.localPlayers[i];
		} else {
		    int i = ((anInt11461
			      * 712970777)
			     - 1);
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i));
		    if (class241_sub26 != null)
			class475_sub1_sub1_sub3
			    = ((Entity)
			       class241_sub26.objectValue);
		}
		if (null != class475_sub1_sub1_sub3) {
		    Class287 class287
			= class475_sub1_sub1_sub3.method10874().aClass287_4386;
		    method10880(class287.aFloat4477,
				(float) ((Class96_Sub5.method16046
					  ((int) class287.aFloat4477,
					   (int) class287.aFloat4479,
					   nodePlane, 479968120))
					 - (((Projectile) this)
					    .anInt11455) * -779769049),
				class287.aFloat4479);
		    if ((anInt11463
			 * 1098894565)
			>= 0) {
			Class554 class554
			    = class475_sub1_sub1_sub3.method17787(-557144911);
			int i = 0;
			int i_80_ = 0;
			if (class554.anIntArrayArray7231 != null
			    && (class554.anIntArrayArray7231
				[(anInt11463
				  * 1098894565)]) != null) {
			    i += (class554.anIntArrayArray7231
				  [1098894565 * ((Projectile)
						 this).anInt11463]
				  [0]);
			    i_80_ += (class554.anIntArrayArray7231
				      [1098894565 * ((Projectile)
						     this).anInt11463]
				      [2]);
			}
			if (null != class554.anIntArrayArray7203
			    && null != (class554.anIntArrayArray7203
					[(1098894565
					  * (((Projectile) this)
					     .anInt11463))])) {
			    i += (class554.anIntArrayArray7203
				  [1098894565 * ((Projectile)
						 this).anInt11463]
				  [0]);
			    i_80_ += (class554.anIntArrayArray7203
				      [(((Projectile) this)
					.anInt11463) * 1098894565]
				      [2]);
			}
			if (0 != i || 0 != i_80_) {
			    int i_81_ = class475_sub1_sub1_sub3
					    .aClass8_11406.method514((byte) 8);
			    int i_82_ = i_81_;
			    if (class475_sub1_sub1_sub3.anIntArray11418 != null
				&& (class475_sub1_sub1_sub3.anIntArray11418
				    [(((Projectile) this)
				      .anInt11463) * 1098894565]) != -1)
				i_82_
				    = (class475_sub1_sub1_sub3.anIntArray11418
				       [(((Projectile) this)
					 .anInt11463) * 1098894565]);
			    int i_83_ = i_82_ - i_81_ & 0x3fff;
			    int i_84_ = Class282.anIntArray4430[i_83_];
			    int i_85_ = Class282.anIntArray4441[i_83_];
			    int i_86_ = i_84_ * i_80_ + i * i_85_ >> 14;
			    i_80_ = i_80_ * i_85_ - i_84_ * i >> 14;
			    i = i_86_;
			    Class287 class287_87_
				= Class287.method5562(method10874()
						      .aClass287_4386);
			    class287_87_.aFloat4477 += (float) i;
			    class287_87_.aFloat4479 += (float) i_80_;
			    method10898(class287_87_);
			    class287_87_.method5564();
			}
		    }
		}
	    }
	}
    }
    
    public void method17907() {
	if (aClass489_11468 != null)
	    aClass489_11468.method11154();
    }
    
    public void method17908() {
	if (aClass489_11468 != null)
	    aClass489_11468.method11154();
    }
    
    public void method17909() {
	if (aClass489_11468 != null)
	    aClass489_11468.method11154();
    }
}
