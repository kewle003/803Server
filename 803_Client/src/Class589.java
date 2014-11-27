/* Class589 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class589
{
    boolean aBool7595;
    int anInt7596;
    boolean aBool7597;
    Class596 aClass596_7598;
    Class596[] aClass596Array7599;
    Class596[] aClass596Array7600;
    int anInt7601;
    int anInt7602 = -746226741;
    int anInt7603;
    byte[] aByteArray7604;
    int anInt7605;
    static final int anInt7606 = 512;
    Class579 aClass579_7607;
    int anInt7608;
    int anInt7609;
    int anInt7610;
    int anInt7611;
    int anInt7612;
    Class89 aClass89_7613;
    static Interface6 anInterface6_7614;
    Class168 aClass168_7615;
    Class589 aClass589_7616;
    int anInt7617;
    int anInt7618;
    int anInt7619;
    
    void method12867(Class103 class103, int i) {
	try {
	    boolean bool
		= Class448.aClass210_6192.containerExists((60292163
						      * (((Class589) this)
							 .anInt7612)),
						     -267952656);
	    if (bool) {
		class103.method2227(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		Class161 class161
		    = Class161.method3448(Class448.aClass210_6192,
					  (60292163
					   * ((Class589) this).anInt7612),
					  0);
		((Class589) this).aClass89_7613
		    = class103.method2356(class161, 1099776, 0, 255, 1);
		byte[] is = ((Class589) this).aClass89_7613.method1907();
		if (is == null)
		    ((Class589) this).aByteArray7604 = null;
		else {
		    ((Class589) this).aByteArray7604 = new byte[is.length];
		    System.arraycopy(is, 0, ((Class589) this).aByteArray7604,
				     0, is.length);
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public Class589 method12868() {
	return ((Class589) this).aClass589_7616;
    }
    
    public void method12869(Class589 class589_0_, int i) {
	if (((Class589) this).aBool7595)
	    ((Class589) this).anInt7619
		= ((Class589) this).anInt7605 * 1745045077;
	else if (null != class589_0_ && ((Class589) class589_0_).aBool7595)
	    ((Class589) this).anInt7619
		= 1839655391 - 1745045077 * ((Class589) class589_0_).anInt7605;
	else
	    ((Class589) this).anInt7619 = 0;
	((Class589) this).aBool7595 = true;
	((Class589) this).aClass589_7616 = class589_0_;
	((Class589) this).anInt7605 = 0;
    }
    
    public void method12870(Class103 class103, int i, int i_1_, int i_2_,
			    int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
			    int i_8_) {
	method12876(class103, i, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, 0, i_8_,
		    true, false, -2042538515);
    }
    
    public boolean method12871(int i) {
	return ((Class589) this).aBool7595;
    }
    
    public Class589 method12872(int i) {
	return ((Class589) this).aClass589_7616;
    }
    
    public boolean method12873(Class103 class103, int i, int i_9_, int i_10_) {
	if (-2120765923 * ((Class589) this).anInt7602 != i) {
	    ((Class589) this).anInt7602 = i * 746226741;
	    int i_11_ = RSAKeys.method860(i, -1959341094);
	    if (i_11_ > 512)
		i_11_ = 512;
	    if (i_11_ <= 0)
		i_11_ = 1;
	    if (i_11_ != -295401159 * ((Class589) this).anInt7610) {
		((Class589) this).anInt7610 = -60713719 * i_11_;
		((Class589) this).aClass168_7615 = null;
	    }
	    if (null != ((Class589) this).aClass596Array7599) {
		((Class589) this).anInt7601 = 0;
		int[] is
		    = new int[((Class589) this).aClass596Array7599.length];
		for (int i_12_ = 0;
		     i_12_ < ((Class589) this).aClass596Array7599.length;
		     i_12_++) {
		    Class596 class596
			= ((Class589) this).aClass596Array7599[i_12_];
		    if (class596.method13082
			(((Class589) this).anInt7603 * 35682497,
			 ((Class589) this).anInt7611 * 2047222037,
			 -777950975 * ((Class589) this).anInt7617,
			 -2120765923 * ((Class589) this).anInt7602)) {
			is[1870879349 * ((Class589) this).anInt7601]
			    = ((Class596) class596).anInt7687;
			((Class589) this).aClass596Array7600
			    [((((Class589) this).anInt7601 += 6825437)
			      * 1870879349) - 1]
			    = class596;
		    }
		}
		Class487.method11145(is, ((Class589) this).aClass596Array7600,
				     0,
				     (1870879349 * ((Class589) this).anInt7601
				      - 1),
				     -530253391);
	    }
	    ((Class589) this).aBool7597 = true;
	}
	boolean bool = false;
	if (((Class589) this).aBool7597) {
	    ((Class589) this).aBool7597 = false;
	    for (int i_13_ = 1870879349 * ((Class589) this).anInt7601 - 1;
		 i_13_ >= 0; i_13_--) {
		boolean bool_14_
		    = (((Class589) this).aClass596Array7600[i_13_].method13083
		       (class103, ((Class589) this).aClass596_7598));
		Class589 class589_15_ = this;
		((Class589) class589_15_).aBool7597
		    = ((Class589) class589_15_).aBool7597 | !bool_14_;
		bool |= bool_14_;
	    }
	}
	if (0 == i_9_ || !class103.method2286())
	    ((Class589) this).aClass89_7613 = null;
	else if (null == ((Class589) this).aClass89_7613
		 && ((Class589) this).anInt7612 * 60292163 >= 0)
	    method12867(class103, -1156484109);
	if (((Class589) this).aClass589_7616 != null
	    && ((Class589) this).aClass589_7616 != this) {
	    ((Class589) this).aClass589_7616.method12897(796241398);
	    bool |= ((Class589) this).aClass589_7616
			.method12873(class103, i, i_9_, -895069125);
	}
	return bool;
    }
    
    void method12874(Class103 class103) {
	try {
	    boolean bool
		= Class448.aClass210_6192.containerExists((60292163
						      * (((Class589) this)
							 .anInt7612)),
						     733869821);
	    if (bool) {
		class103.method2227(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		Class161 class161
		    = Class161.method3448(Class448.aClass210_6192,
					  (60292163
					   * ((Class589) this).anInt7612),
					  0);
		((Class589) this).aClass89_7613
		    = class103.method2356(class161, 1099776, 0, 255, 1);
		byte[] is = ((Class589) this).aClass89_7613.method1907();
		if (is == null)
		    ((Class589) this).aByteArray7604 = null;
		else {
		    ((Class589) this).aByteArray7604 = new byte[is.length];
		    System.arraycopy(is, 0, ((Class589) this).aByteArray7604,
				     0, is.length);
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method12875(Class103 class103, int i, int i_16_, int i_17_,
			    int i_18_, int i_19_, int i_20_, int i_21_,
			    int i_22_, int i_23_, int i_24_) {
	method12876(class103, i, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, 0,
		    i_23_, true, false, -1967840574);
    }
    
    public void method12876(Class103 class103, int i, int i_25_, int i_26_,
			    int i_27_, int i_28_, int i_29_, int i_30_,
			    int i_31_, int i_32_, boolean bool,
			    boolean bool_33_, int i_34_) {
	int i_35_ = 0;
	if (((Class589) this).aBool7595)
	    i_35_ = 241093813 * ((Class589) this).anInt7605;
	if (((Class589) this).aClass589_7616 != null) {
	    Class589 class589_36_ = this;
	    Class589 class589_37_ = ((Class589) this).aClass589_7616;
	    if (class589_36_.hashCode() > class589_37_.hashCode()) {
		class589_36_ = ((Class589) this).aClass589_7616;
		class589_37_ = this;
		i_35_ = 255 - i_35_;
	    }
	    class589_36_.method12877(class103, i, i_25_, i_26_, i_27_, i_28_,
				     i_29_, i_30_, i_31_, i_32_, bool,
				     bool_33_, i_35_, (byte) -41);
	    class589_37_.method12877(class103, i, i_25_, i_26_, i_27_, i_28_,
				     i_29_, i_30_, i_31_, i_32_, false,
				     bool_33_, 255 - i_35_, (byte) 23);
	} else {
	    if (1267744975 * ((Class589) this).anInt7596 == -1)
		class103.method2396(i_25_, i_26_, i_27_, i_28_,
				    ~0xffffff | i_32_, 0);
	    method12877(class103, i, i_25_, i_26_, i_27_, i_28_, i_29_, i_30_,
			i_31_, i_32_, bool, bool_33_, i_35_, (byte) 15);
	}
    }
    
    void method12877(Class103 class103, int i, int i_38_, int i_39_, int i_40_,
		     int i_41_, int i_42_, int i_43_, int i_44_, int i_45_,
		     boolean bool, boolean bool_46_, int i_47_, byte i_48_) {
	int i_49_ = 255 - i_47_;
	class103.method2292();
	if (((Class589) this).aClass89_7613 == null) {
	    class103.method2450(2, 0);
	    i_43_ = i + i_43_ & 0x3fff;
	    if (1267744975 * ((Class589) this).anInt7596 != -1
		&& 0 != -295401159 * ((Class589) this).anInt7610) {
		Class101 class101
		    = Class128.aClass107_1588.method2680((1267744975
							  * (((Class589) this)
							     .anInt7596)),
							 -1694722517);
		if (null == ((Class589) this).aClass168_7615
		    && (anInterface6_7614.method31
			(218388063 * class101.anInt1403,
			 (Class529.aClass529_6944 == class101.aClass529_1391
			  ? Class537.aClass537_6990 : Class537.aClass537_6991),
			 0.7F, -295401159 * ((Class589) this).anInt7610,
			 -295401159 * ((Class589) this).anInt7610, false,
			 1653130420))) {
		    int[] is
			= (Class529.aClass529_6944 == class101.aClass529_1391
			   ? (anInterface6_7614.method30
			      (218388063 * class101.anInt1403, 0.7F,
			       -295401159 * ((Class589) this).anInt7610,
			       ((Class589) this).anInt7610 * -295401159, false,
			       -2086874277))
			   : (anInterface6_7614.method37
			      (218388063 * class101.anInt1403, 0.7F,
			       ((Class589) this).anInt7610 * -295401159,
			       ((Class589) this).anInt7610 * -295401159, false,
			       1677589222)));
		    ((Class589) this).anInt7608 = -1746461879 * is[0];
		    ((Class589) this).anInt7609
			= -946316475 * is[is.length - 1];
		    ((Class589) this).aClass168_7615
			= class103.method2259(is, 0,
					      class101.anInt1406 * 608905203,
					      class101.anInt1406 * 608905203,
					      class101.anInt1406 * 608905203,
					      (byte) -120);
		}
		int i_50_
		    = (i_49_ == 255
		       ? (class101.aClass529_1391 == Class529.aClass529_6944
			  ? 1 : 0)
		       : 1);
		if (1 == i_50_ && bool)
		    class103.method2396(i_38_, i_39_, i_40_, i_41_, i_45_, 0);
		if (((Class589) this).aClass168_7615 != null) {
		    int i_51_ = i_42_ * i_41_ / -4096;
		    int i_52_;
		    for (i_52_ = (i_40_ - i_41_) / 2 + i_43_ * i_41_ / 4096;
			 i_52_ > i_41_; i_52_ -= i_41_) {
			/* empty */
		    }
		    for (/**/; i_52_ < 0; i_52_ += i_41_) {
			/* empty */
		    }
		    if (Class579.aClass579_7558
			== ((Class589) this).aClass579_7607) {
			for (int i_53_ = i_52_ - i_41_; i_53_ < i_40_;
			     i_53_ += i_41_)
			    ((Class589) this).aClass168_7615.method3615
				(i_38_ + i_53_, i_51_ + i_39_, i_41_, i_41_, 0,
				 i_49_ << 24 | 0xffffff, i_50_);
			if ((((Class589) this).anInt7608 * 1010616057
			     & ~0xffffff)
			    != 0)
			    class103.method2263(0, 0, i_40_, i_51_ + i_39_ + 1,
						(((Class589) this).anInt7608
						 * 1010616057),
						(byte) -72);
			if ((-499318899 * ((Class589) this).anInt7609
			     & ~0xffffff)
			    != 0)
			    class103.method2263(0, i_41_ + (i_39_ + i_51_),
						i_40_,
						i_41_ - (i_51_ + i_39_
							 + i_41_),
						(((Class589) this).anInt7609
						 * -499318899),
						(byte) -30);
		    } else {
			for (/**/; i_51_ > i_41_; i_51_ -= i_41_) {
			    /* empty */
			}
			for (/**/; i_51_ < 0; i_51_ += i_41_) {
			    /* empty */
			}
			for (int i_54_ = i_52_ - i_41_; i_54_ < i_40_;
			     i_54_ += i_41_) {
			    for (int i_55_ = i_51_ - i_41_; i_55_ < i_41_;
				 i_55_ += i_41_)
				((Class589) this).aClass168_7615.method3615
				    (i_54_ + i_38_, i_39_ + i_55_, i_41_,
				     i_41_, 0, i_49_ << 24 | 0xffffff, i_50_);
			}
		    }
		}
	    } else
		class103.method2396(i_38_, i_39_, i_40_, i_41_,
				    i_49_ << 24 | i_45_, bool ? 0 : 1);
	} else if (bool_46_) {
	    Class268 class268 = class103.method2310();
	    Class268 class268_56_ = class103.method2310();
	    class268.aFloatArray4353[2] = class268.aFloatArray4353[3];
	    class268.aFloatArray4353[6] = class268.aFloatArray4353[7];
	    class268.aFloatArray4353[10] = class268.aFloatArray4353[11];
	    class268.aFloatArray4353[14] = class268.aFloatArray4353[15];
	    class103.method2309(class268);
	    method12878(class103, i_42_, i_43_, i_44_, i_47_, -1644632753);
	    class103.method2309(class268_56_);
	} else {
	    if (bool)
		class103.method2450(3, i_45_);
	    method12878(class103, i_42_, i_43_, i_44_, i_47_, -1312126938);
	}
	for (int i_57_ = ((Class589) this).anInt7601 * 1870879349 - 1;
	     i_57_ >= 0; i_57_--)
	    ((Class589) this).aClass596Array7600[i_57_].method13084
		(class103, i_38_, i_39_, i_40_, i_41_, i_42_, i_43_,
		 35682497 * ((Class589) this).anInt7603,
		 ((Class589) this).anInt7611 * 2047222037,
		 -777950975 * ((Class589) this).anInt7617, i_49_);
	class103.method2450(2, 0);
	class103.method2293();
    }
    
    void method12878(Class103 class103, int i, int i_58_, int i_59_, int i_60_,
		     int i_61_) {
	Class266 class266 = class103.method2307();
	Class266 class266_62_ = new Class266();
	class266_62_.method5131(0.0F, 0.0F, 0.0F);
	class266_62_.method5128(0.0F, -1.0F, 0.0F,
				Class282.method5490(-i_58_ & 0x3fff));
	class266_62_.method5128(-1.0F, 0.0F, 0.0F,
				Class282.method5490(-i & 0x3fff));
	class266_62_.method5128(0.0F, 0.0F, -1.0F,
				Class282.method5490(-i_59_ & 0x3fff));
	class103.method2512(class266_62_);
	Class266 class266_63_ = new Class266();
	if (((Class589) this).anInt7618 * -1913146963 != i_60_) {
	    ((Class589) this).aClass89_7613
		.method1909((byte) i_60_, ((Class589) this).aByteArray7604);
	    ((Class589) this).anInt7618 = 1581177381 * i_60_;
	}
	((Class589) this).aClass89_7613.method1890(class266_63_, null, 0);
	class103.method2512(class266);
    }
    
    public static void method12879(JS5 class210, Class107 class107,
				   Interface6 interface6) {
	Class448.aClass210_6192 = class210;
	Class128.aClass107_1588 = class107;
	anInterface6_7614 = interface6;
    }
    
    void method12880(Class103 class103) {
	try {
	    boolean bool
		= Class448.aClass210_6192.containerExists((60292163
						      * (((Class589) this)
							 .anInt7612)),
						     -409672987);
	    if (bool) {
		class103.method2227(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		Class161 class161
		    = Class161.method3448(Class448.aClass210_6192,
					  (60292163
					   * ((Class589) this).anInt7612),
					  0);
		((Class589) this).aClass89_7613
		    = class103.method2356(class161, 1099776, 0, 255, 1);
		byte[] is = ((Class589) this).aClass89_7613.method1907();
		if (is == null)
		    ((Class589) this).aByteArray7604 = null;
		else {
		    ((Class589) this).aByteArray7604 = new byte[is.length];
		    System.arraycopy(is, 0, ((Class589) this).aByteArray7604,
				     0, is.length);
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static void method12881(JS5 class210, Class107 class107,
				   Interface6 interface6) {
	Class448.aClass210_6192 = class210;
	Class128.aClass107_1588 = class107;
	anInterface6_7614 = interface6;
    }
    
    public void method12882(int i, int i_64_) {
	if (((Class589) this).aBool7595) {
	    /* empty */
	}
	((Class589) this).anInt7605
	    = (375964061
	       * (i * (i_64_ - -378925855 * ((Class589) this).anInt7619) / 255
		  + ((Class589) this).anInt7619 * -378925855));
    }
    
    public void method12883(int i, int i_65_) {
	if (((Class589) this).aBool7595) {
	    /* empty */
	}
	((Class589) this).anInt7605
	    = (375964061
	       * (i * (i_65_ - -378925855 * ((Class589) this).anInt7619) / 255
		  + ((Class589) this).anInt7619 * -378925855));
    }
    
    public boolean method12884() {
	return ((Class589) this).aBool7595;
    }
    
    public Class589 method12885() {
	return ((Class589) this).aClass589_7616;
    }
    
    void method12886(Class103 class103, int i, int i_66_, int i_67_,
		     int i_68_) {
	Class266 class266 = class103.method2307();
	Class266 class266_69_ = new Class266();
	class266_69_.method5131(0.0F, 0.0F, 0.0F);
	class266_69_.method5128(0.0F, -1.0F, 0.0F,
				Class282.method5490(-i_66_ & 0x3fff));
	class266_69_.method5128(-1.0F, 0.0F, 0.0F,
				Class282.method5490(-i & 0x3fff));
	class266_69_.method5128(0.0F, 0.0F, -1.0F,
				Class282.method5490(-i_67_ & 0x3fff));
	class103.method2512(class266_69_);
	Class266 class266_70_ = new Class266();
	if (((Class589) this).anInt7618 * -1913146963 != i_68_) {
	    ((Class589) this).aClass89_7613
		.method1909((byte) i_68_, ((Class589) this).aByteArray7604);
	    ((Class589) this).anInt7618 = 1581177381 * i_68_;
	}
	((Class589) this).aClass89_7613.method1890(class266_70_, null, 0);
	class103.method2512(class266);
    }
    
    public void method12887(int i, int i_71_, int i_72_) {
	if (((Class589) this).aBool7595) {
	    /* empty */
	}
	((Class589) this).anInt7605
	    = (375964061
	       * (i * (i_71_ - -378925855 * ((Class589) this).anInt7619) / 255
		  + ((Class589) this).anInt7619 * -378925855));
    }
    
    public boolean method12888(Class103 class103, int i, int i_73_) {
	if (-2120765923 * ((Class589) this).anInt7602 != i) {
	    ((Class589) this).anInt7602 = i * 746226741;
	    int i_74_ = RSAKeys.method860(i, -1959341094);
	    if (i_74_ > 512)
		i_74_ = 512;
	    if (i_74_ <= 0)
		i_74_ = 1;
	    if (i_74_ != -295401159 * ((Class589) this).anInt7610) {
		((Class589) this).anInt7610 = -60713719 * i_74_;
		((Class589) this).aClass168_7615 = null;
	    }
	    if (null != ((Class589) this).aClass596Array7599) {
		((Class589) this).anInt7601 = 0;
		int[] is
		    = new int[((Class589) this).aClass596Array7599.length];
		for (int i_75_ = 0;
		     i_75_ < ((Class589) this).aClass596Array7599.length;
		     i_75_++) {
		    Class596 class596
			= ((Class589) this).aClass596Array7599[i_75_];
		    if (class596.method13082
			(((Class589) this).anInt7603 * 35682497,
			 ((Class589) this).anInt7611 * 2047222037,
			 -777950975 * ((Class589) this).anInt7617,
			 -2120765923 * ((Class589) this).anInt7602)) {
			is[1870879349 * ((Class589) this).anInt7601]
			    = ((Class596) class596).anInt7687;
			((Class589) this).aClass596Array7600
			    [((((Class589) this).anInt7601 += 6825437)
			      * 1870879349) - 1]
			    = class596;
		    }
		}
		Class487.method11145(is, ((Class589) this).aClass596Array7600,
				     0,
				     (1870879349 * ((Class589) this).anInt7601
				      - 1),
				     -530253391);
	    }
	    ((Class589) this).aBool7597 = true;
	}
	boolean bool = false;
	if (((Class589) this).aBool7597) {
	    ((Class589) this).aBool7597 = false;
	    for (int i_76_ = 1870879349 * ((Class589) this).anInt7601 - 1;
		 i_76_ >= 0; i_76_--) {
		boolean bool_77_
		    = (((Class589) this).aClass596Array7600[i_76_].method13083
		       (class103, ((Class589) this).aClass596_7598));
		Class589 class589_78_ = this;
		((Class589) class589_78_).aBool7597
		    = ((Class589) class589_78_).aBool7597 | !bool_77_;
		bool |= bool_77_;
	    }
	}
	if (0 == i_73_ || !class103.method2286())
	    ((Class589) this).aClass89_7613 = null;
	else if (null == ((Class589) this).aClass89_7613
		 && ((Class589) this).anInt7612 * 60292163 >= 0)
	    method12867(class103, -170450869);
	if (((Class589) this).aClass589_7616 != null
	    && ((Class589) this).aClass589_7616 != this) {
	    ((Class589) this).aClass589_7616.method12897(796241398);
	    bool |= ((Class589) this).aClass589_7616
			.method12873(class103, i, i_73_, -196892144);
	}
	return bool;
    }
    
    void method12889(Class103 class103, int i, int i_79_, int i_80_, int i_81_,
		     int i_82_, int i_83_, int i_84_, int i_85_, int i_86_,
		     boolean bool, boolean bool_87_, int i_88_) {
	int i_89_ = 255 - i_88_;
	class103.method2292();
	if (((Class589) this).aClass89_7613 == null) {
	    class103.method2450(2, 0);
	    i_84_ = i + i_84_ & 0x3fff;
	    if (1267744975 * ((Class589) this).anInt7596 != -1
		&& 0 != -295401159 * ((Class589) this).anInt7610) {
		Class101 class101
		    = Class128.aClass107_1588.method2680((1267744975
							  * (((Class589) this)
							     .anInt7596)),
							 164524870);
		if (null == ((Class589) this).aClass168_7615
		    && (anInterface6_7614.method31
			(218388063 * class101.anInt1403,
			 (Class529.aClass529_6944 == class101.aClass529_1391
			  ? Class537.aClass537_6990 : Class537.aClass537_6991),
			 0.7F, -295401159 * ((Class589) this).anInt7610,
			 -295401159 * ((Class589) this).anInt7610, false,
			 -64790074))) {
		    int[] is
			= (Class529.aClass529_6944 == class101.aClass529_1391
			   ? (anInterface6_7614.method30
			      (218388063 * class101.anInt1403, 0.7F,
			       -295401159 * ((Class589) this).anInt7610,
			       ((Class589) this).anInt7610 * -295401159, false,
			       -2086874277))
			   : (anInterface6_7614.method37
			      (218388063 * class101.anInt1403, 0.7F,
			       ((Class589) this).anInt7610 * -295401159,
			       ((Class589) this).anInt7610 * -295401159, false,
			       -376778496)));
		    ((Class589) this).anInt7608 = -1746461879 * is[0];
		    ((Class589) this).anInt7609
			= -946316475 * is[is.length - 1];
		    ((Class589) this).aClass168_7615
			= class103.method2259(is, 0,
					      class101.anInt1406 * 608905203,
					      class101.anInt1406 * 608905203,
					      class101.anInt1406 * 608905203,
					      (byte) 69);
		}
		int i_90_
		    = (i_89_ == 255
		       ? (class101.aClass529_1391 == Class529.aClass529_6944
			  ? 1 : 0)
		       : 1);
		if (1 == i_90_ && bool)
		    class103.method2396(i_79_, i_80_, i_81_, i_82_, i_86_, 0);
		if (((Class589) this).aClass168_7615 != null) {
		    int i_91_ = i_83_ * i_82_ / -4096;
		    int i_92_;
		    for (i_92_ = (i_81_ - i_82_) / 2 + i_84_ * i_82_ / 4096;
			 i_92_ > i_82_; i_92_ -= i_82_) {
			/* empty */
		    }
		    for (/**/; i_92_ < 0; i_92_ += i_82_) {
			/* empty */
		    }
		    if (Class579.aClass579_7558
			== ((Class589) this).aClass579_7607) {
			for (int i_93_ = i_92_ - i_82_; i_93_ < i_81_;
			     i_93_ += i_82_)
			    ((Class589) this).aClass168_7615.method3615
				(i_79_ + i_93_, i_91_ + i_80_, i_82_, i_82_, 0,
				 i_89_ << 24 | 0xffffff, i_90_);
			if ((((Class589) this).anInt7608 * 1010616057
			     & ~0xffffff)
			    != 0)
			    class103.method2263(0, 0, i_81_, i_91_ + i_80_ + 1,
						(((Class589) this).anInt7608
						 * 1010616057),
						(byte) -24);
			if ((-499318899 * ((Class589) this).anInt7609
			     & ~0xffffff)
			    != 0)
			    class103.method2263(0, i_82_ + (i_80_ + i_91_),
						i_81_,
						i_82_ - (i_91_ + i_80_
							 + i_82_),
						(((Class589) this).anInt7609
						 * -499318899),
						(byte) -2);
		    } else {
			for (/**/; i_91_ > i_82_; i_91_ -= i_82_) {
			    /* empty */
			}
			for (/**/; i_91_ < 0; i_91_ += i_82_) {
			    /* empty */
			}
			for (int i_94_ = i_92_ - i_82_; i_94_ < i_81_;
			     i_94_ += i_82_) {
			    for (int i_95_ = i_91_ - i_82_; i_95_ < i_82_;
				 i_95_ += i_82_)
				((Class589) this).aClass168_7615.method3615
				    (i_94_ + i_79_, i_80_ + i_95_, i_82_,
				     i_82_, 0, i_89_ << 24 | 0xffffff, i_90_);
			}
		    }
		}
	    } else
		class103.method2396(i_79_, i_80_, i_81_, i_82_,
				    i_89_ << 24 | i_86_, bool ? 0 : 1);
	} else if (bool_87_) {
	    Class268 class268 = class103.method2310();
	    Class268 class268_96_ = class103.method2310();
	    class268.aFloatArray4353[2] = class268.aFloatArray4353[3];
	    class268.aFloatArray4353[6] = class268.aFloatArray4353[7];
	    class268.aFloatArray4353[10] = class268.aFloatArray4353[11];
	    class268.aFloatArray4353[14] = class268.aFloatArray4353[15];
	    class103.method2309(class268);
	    method12878(class103, i_83_, i_84_, i_85_, i_88_, -2076183906);
	    class103.method2309(class268_96_);
	} else {
	    if (bool)
		class103.method2450(3, i_86_);
	    method12878(class103, i_83_, i_84_, i_85_, i_88_, -735017562);
	}
	for (int i_97_ = ((Class589) this).anInt7601 * 1870879349 - 1;
	     i_97_ >= 0; i_97_--)
	    ((Class589) this).aClass596Array7600[i_97_].method13084
		(class103, i_79_, i_80_, i_81_, i_82_, i_83_, i_84_,
		 35682497 * ((Class589) this).anInt7603,
		 ((Class589) this).anInt7611 * 2047222037,
		 -777950975 * ((Class589) this).anInt7617, i_89_);
	class103.method2450(2, 0);
	class103.method2293();
    }
    
    public Class589(int i, Class596[] class596s, int i_98_, int i_99_,
		    int i_100_, int i_101_, Class579 class579, int i_102_) {
	((Class589) this).aBool7597 = true;
	((Class589) this).anInt7603 = i_99_ * 484972353;
	((Class589) this).anInt7611 = -1017305539 * i_100_;
	((Class589) this).anInt7617 = i_101_ * 1919915777;
	((Class589) this).anInt7596 = 2086454831 * i;
	((Class589) this).aClass596Array7599 = class596s;
	((Class589) this).aClass579_7607 = class579;
	if (class596s != null) {
	    ((Class589) this).aClass596Array7600
		= new Class596[class596s.length];
	    ((Class589) this).aClass596_7598
		= i_98_ >= 0 ? class596s[i_98_] : null;
	} else {
	    ((Class589) this).aClass596Array7600 = null;
	    ((Class589) this).aClass596_7598 = null;
	}
	((Class589) this).anInt7612 = i_102_ * -2100350869;
    }
    
    public boolean method12890(Class103 class103, int i, int i_103_) {
	if (-2120765923 * ((Class589) this).anInt7602 != i) {
	    ((Class589) this).anInt7602 = i * 746226741;
	    int i_104_ = RSAKeys.method860(i, -1959341094);
	    if (i_104_ > 512)
		i_104_ = 512;
	    if (i_104_ <= 0)
		i_104_ = 1;
	    if (i_104_ != -295401159 * ((Class589) this).anInt7610) {
		((Class589) this).anInt7610 = -60713719 * i_104_;
		((Class589) this).aClass168_7615 = null;
	    }
	    if (null != ((Class589) this).aClass596Array7599) {
		((Class589) this).anInt7601 = 0;
		int[] is
		    = new int[((Class589) this).aClass596Array7599.length];
		for (int i_105_ = 0;
		     i_105_ < ((Class589) this).aClass596Array7599.length;
		     i_105_++) {
		    Class596 class596
			= ((Class589) this).aClass596Array7599[i_105_];
		    if (class596.method13082
			(((Class589) this).anInt7603 * 35682497,
			 ((Class589) this).anInt7611 * 2047222037,
			 -777950975 * ((Class589) this).anInt7617,
			 -2120765923 * ((Class589) this).anInt7602)) {
			is[1870879349 * ((Class589) this).anInt7601]
			    = ((Class596) class596).anInt7687;
			((Class589) this).aClass596Array7600
			    [((((Class589) this).anInt7601 += 6825437)
			      * 1870879349) - 1]
			    = class596;
		    }
		}
		Class487.method11145(is, ((Class589) this).aClass596Array7600,
				     0,
				     (1870879349 * ((Class589) this).anInt7601
				      - 1),
				     -530253391);
	    }
	    ((Class589) this).aBool7597 = true;
	}
	boolean bool = false;
	if (((Class589) this).aBool7597) {
	    ((Class589) this).aBool7597 = false;
	    for (int i_106_ = 1870879349 * ((Class589) this).anInt7601 - 1;
		 i_106_ >= 0; i_106_--) {
		boolean bool_107_
		    = (((Class589) this).aClass596Array7600[i_106_].method13083
		       (class103, ((Class589) this).aClass596_7598));
		Class589 class589_108_ = this;
		((Class589) class589_108_).aBool7597
		    = ((Class589) class589_108_).aBool7597 | !bool_107_;
		bool |= bool_107_;
	    }
	}
	if (0 == i_103_ || !class103.method2286())
	    ((Class589) this).aClass89_7613 = null;
	else if (null == ((Class589) this).aClass89_7613
		 && ((Class589) this).anInt7612 * 60292163 >= 0)
	    method12867(class103, 1639515441);
	if (((Class589) this).aClass589_7616 != null
	    && ((Class589) this).aClass589_7616 != this) {
	    ((Class589) this).aClass589_7616.method12897(796241398);
	    bool |= ((Class589) this).aClass589_7616
			.method12873(class103, i, i_103_, -1523110973);
	}
	return bool;
    }
    
    public void method12891(Class103 class103, int i, int i_109_, int i_110_,
			    int i_111_, int i_112_, int i_113_, int i_114_,
			    int i_115_, int i_116_) {
	method12876(class103, i, i_109_, i_110_, i_111_, i_112_, i_113_,
		    i_114_, 0, i_116_, true, false, -900942452);
    }
    
    public void method12892(Class103 class103, int i, int i_117_, int i_118_,
			    int i_119_, int i_120_, int i_121_, int i_122_,
			    int i_123_, int i_124_) {
	method12876(class103, i, i_117_, i_118_, i_119_, i_120_, i_121_,
		    i_122_, 0, i_124_, true, false, -2146804694);
    }
    
    public void method12893(Class103 class103, int i, int i_125_, int i_126_,
			    int i_127_, int i_128_, int i_129_, int i_130_,
			    int i_131_, int i_132_) {
	method12876(class103, i, i_125_, i_126_, i_127_, i_128_, i_129_,
		    i_130_, 0, i_132_, true, false, -496614627);
    }
    
    public static void method12894(JS5 class210, Class107 class107,
				   Interface6 interface6) {
	Class448.aClass210_6192 = class210;
	Class128.aClass107_1588 = class107;
	anInterface6_7614 = interface6;
    }
    
    void method12895(Class103 class103, int i, int i_133_, int i_134_,
		     int i_135_, int i_136_, int i_137_, int i_138_,
		     int i_139_, int i_140_, boolean bool, boolean bool_141_,
		     int i_142_) {
	int i_143_ = 255 - i_142_;
	class103.method2292();
	if (((Class589) this).aClass89_7613 == null) {
	    class103.method2450(2, 0);
	    i_138_ = i + i_138_ & 0x3fff;
	    if (1267744975 * ((Class589) this).anInt7596 != -1
		&& 0 != -295401159 * ((Class589) this).anInt7610) {
		Class101 class101
		    = Class128.aClass107_1588.method2680((1267744975
							  * (((Class589) this)
							     .anInt7596)),
							 2137480358);
		if (null == ((Class589) this).aClass168_7615
		    && (anInterface6_7614.method31
			(218388063 * class101.anInt1403,
			 (Class529.aClass529_6944 == class101.aClass529_1391
			  ? Class537.aClass537_6990 : Class537.aClass537_6991),
			 0.7F, -295401159 * ((Class589) this).anInt7610,
			 -295401159 * ((Class589) this).anInt7610, false,
			 -1003997355))) {
		    int[] is
			= (Class529.aClass529_6944 == class101.aClass529_1391
			   ? (anInterface6_7614.method30
			      (218388063 * class101.anInt1403, 0.7F,
			       -295401159 * ((Class589) this).anInt7610,
			       ((Class589) this).anInt7610 * -295401159, false,
			       -2086874277))
			   : (anInterface6_7614.method37
			      (218388063 * class101.anInt1403, 0.7F,
			       ((Class589) this).anInt7610 * -295401159,
			       ((Class589) this).anInt7610 * -295401159, false,
			       1254267424)));
		    ((Class589) this).anInt7608 = -1746461879 * is[0];
		    ((Class589) this).anInt7609
			= -946316475 * is[is.length - 1];
		    ((Class589) this).aClass168_7615
			= class103.method2259(is, 0,
					      class101.anInt1406 * 608905203,
					      class101.anInt1406 * 608905203,
					      class101.anInt1406 * 608905203,
					      (byte) -127);
		}
		int i_144_
		    = (i_143_ == 255
		       ? (class101.aClass529_1391 == Class529.aClass529_6944
			  ? 1 : 0)
		       : 1);
		if (1 == i_144_ && bool)
		    class103.method2396(i_133_, i_134_, i_135_, i_136_, i_140_,
					0);
		if (((Class589) this).aClass168_7615 != null) {
		    int i_145_ = i_137_ * i_136_ / -4096;
		    int i_146_;
		    for (i_146_
			     = (i_135_ - i_136_) / 2 + i_138_ * i_136_ / 4096;
			 i_146_ > i_136_; i_146_ -= i_136_) {
			/* empty */
		    }
		    for (/**/; i_146_ < 0; i_146_ += i_136_) {
			/* empty */
		    }
		    if (Class579.aClass579_7558
			== ((Class589) this).aClass579_7607) {
			for (int i_147_ = i_146_ - i_136_; i_147_ < i_135_;
			     i_147_ += i_136_)
			    ((Class589) this).aClass168_7615.method3615
				(i_133_ + i_147_, i_145_ + i_134_, i_136_,
				 i_136_, 0, i_143_ << 24 | 0xffffff, i_144_);
			if ((((Class589) this).anInt7608 * 1010616057
			     & ~0xffffff)
			    != 0)
			    class103.method2263(0, 0, i_135_,
						i_145_ + i_134_ + 1,
						(((Class589) this).anInt7608
						 * 1010616057),
						(byte) -102);
			if ((-499318899 * ((Class589) this).anInt7609
			     & ~0xffffff)
			    != 0)
			    class103.method2263(0, i_136_ + (i_134_ + i_145_),
						i_135_,
						i_136_ - (i_145_ + i_134_
							  + i_136_),
						(((Class589) this).anInt7609
						 * -499318899),
						(byte) -74);
		    } else {
			for (/**/; i_145_ > i_136_; i_145_ -= i_136_) {
			    /* empty */
			}
			for (/**/; i_145_ < 0; i_145_ += i_136_) {
			    /* empty */
			}
			for (int i_148_ = i_146_ - i_136_; i_148_ < i_135_;
			     i_148_ += i_136_) {
			    for (int i_149_ = i_145_ - i_136_; i_149_ < i_136_;
				 i_149_ += i_136_)
				((Class589) this).aClass168_7615.method3615
				    (i_148_ + i_133_, i_134_ + i_149_, i_136_,
				     i_136_, 0, i_143_ << 24 | 0xffffff,
				     i_144_);
			}
		    }
		}
	    } else
		class103.method2396(i_133_, i_134_, i_135_, i_136_,
				    i_143_ << 24 | i_140_, bool ? 0 : 1);
	} else if (bool_141_) {
	    Class268 class268 = class103.method2310();
	    Class268 class268_150_ = class103.method2310();
	    class268.aFloatArray4353[2] = class268.aFloatArray4353[3];
	    class268.aFloatArray4353[6] = class268.aFloatArray4353[7];
	    class268.aFloatArray4353[10] = class268.aFloatArray4353[11];
	    class268.aFloatArray4353[14] = class268.aFloatArray4353[15];
	    class103.method2309(class268);
	    method12878(class103, i_137_, i_138_, i_139_, i_142_, -813721729);
	    class103.method2309(class268_150_);
	} else {
	    if (bool)
		class103.method2450(3, i_140_);
	    method12878(class103, i_137_, i_138_, i_139_, i_142_, -1754190378);
	}
	for (int i_151_ = ((Class589) this).anInt7601 * 1870879349 - 1;
	     i_151_ >= 0; i_151_--)
	    ((Class589) this).aClass596Array7600[i_151_].method13084
		(class103, i_133_, i_134_, i_135_, i_136_, i_137_, i_138_,
		 35682497 * ((Class589) this).anInt7603,
		 ((Class589) this).anInt7611 * 2047222037,
		 -777950975 * ((Class589) this).anInt7617, i_143_);
	class103.method2450(2, 0);
	class103.method2293();
    }
    
    void method12896(Class103 class103, int i, int i_152_, int i_153_,
		     int i_154_) {
	Class266 class266 = class103.method2307();
	Class266 class266_155_ = new Class266();
	class266_155_.method5131(0.0F, 0.0F, 0.0F);
	class266_155_.method5128(0.0F, -1.0F, 0.0F,
				 Class282.method5490(-i_152_ & 0x3fff));
	class266_155_.method5128(-1.0F, 0.0F, 0.0F,
				 Class282.method5490(-i & 0x3fff));
	class266_155_.method5128(0.0F, 0.0F, -1.0F,
				 Class282.method5490(-i_153_ & 0x3fff));
	class103.method2512(class266_155_);
	Class266 class266_156_ = new Class266();
	if (((Class589) this).anInt7618 * -1913146963 != i_154_) {
	    ((Class589) this).aClass89_7613
		.method1909((byte) i_154_, ((Class589) this).aByteArray7604);
	    ((Class589) this).anInt7618 = 1581177381 * i_154_;
	}
	((Class589) this).aClass89_7613.method1890(class266_156_, null, 0);
	class103.method2512(class266);
    }
    
    public void method12897(int i) {
	((Class589) this).aBool7595 = false;
	((Class589) this).aClass589_7616 = null;
	((Class589) this).anInt7605 = 0;
    }
    
    void method12898(Class103 class103, int i, int i_157_, int i_158_,
		     int i_159_) {
	Class266 class266 = class103.method2307();
	Class266 class266_160_ = new Class266();
	class266_160_.method5131(0.0F, 0.0F, 0.0F);
	class266_160_.method5128(0.0F, -1.0F, 0.0F,
				 Class282.method5490(-i_157_ & 0x3fff));
	class266_160_.method5128(-1.0F, 0.0F, 0.0F,
				 Class282.method5490(-i & 0x3fff));
	class266_160_.method5128(0.0F, 0.0F, -1.0F,
				 Class282.method5490(-i_158_ & 0x3fff));
	class103.method2512(class266_160_);
	Class266 class266_161_ = new Class266();
	if (((Class589) this).anInt7618 * -1913146963 != i_159_) {
	    ((Class589) this).aClass89_7613
		.method1909((byte) i_159_, ((Class589) this).aByteArray7604);
	    ((Class589) this).anInt7618 = 1581177381 * i_159_;
	}
	((Class589) this).aClass89_7613.method1890(class266_161_, null, 0);
	class103.method2512(class266);
    }
    
    static boolean method12899(int i, byte i_162_) {
	return (i >= Class527.aClass527_6930.anInt6931 * -2030829961
		&& i <= -2030829961 * Class527.aClass527_6921.anInt6931);
    }
    
    static final void method12900(ClientScriptData class454, int i) {
	int i_163_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_163_, (byte) -125);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_163_ >> 16];
	Class303.method5847(class58, class35, class454, 1155492743);
    }
    
    static final void method12901(ClientScriptData class454, int i) {
	int i_164_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (-1 != i_164_)
	    Class19.method880(i_164_, (short) -2172);
    }
    
    static int method12902(Class507_Sub1 class507_sub1,
			   Class507_Sub1 class507_sub1_165_, int i,
			   boolean bool, int i_166_) {
	if (1 == i) {
	    int i_167_ = -760939251 * class507_sub1.anInt6669;
	    int i_168_ = -760939251 * class507_sub1_165_.anInt6669;
	    if (!bool) {
		if (-1 == i_167_)
		    i_167_ = 2001;
		if (-1 == i_168_)
		    i_168_ = 2001;
	    }
	    return i_167_ - i_168_;
	}
	if (2 == i)
	    return Class22.method901(class507_sub1.method14433(16711935),
				     class507_sub1_165_.method14433(16711935),
				     VarPlayerDomain.currentLocale, 1400778917);
	if (i == 3) {
	    if (class507_sub1.aString8737.equals("-")) {
		if (class507_sub1_165_.aString8737.equals("-"))
		    return 0;
		return bool ? -1 : 1;
	    }
	    if (class507_sub1_165_.aString8737.equals("-"))
		return bool ? 1 : -1;
	    return Class22.method901(class507_sub1.aString8737,
				     class507_sub1_165_.aString8737,
				     VarPlayerDomain.currentLocale, 1268948681);
	}
	if (i == 4)
	    return (class507_sub1.method11494(-2078797361)
		    ? class507_sub1_165_.method11494(-1849342594) ? 0 : 1
		    : class507_sub1_165_.method11494(-1588186770) ? -1 : 0);
	if (i == 5)
	    return (class507_sub1.method11492(868390169)
		    ? class507_sub1_165_.method11492(1725924789) ? 0 : 1
		    : class507_sub1_165_.method11492(1406202061) ? -1 : 0);
	if (i == 6)
	    return (class507_sub1.method11493((short) 12875)
		    ? class507_sub1_165_.method11493((short) 11938) ? 0 : 1
		    : class507_sub1_165_.method11493((short) 30157) ? -1 : 0);
	if (i == 7)
	    return (class507_sub1.method11495(113649157)
		    ? class507_sub1_165_.method11495(897631168) ? 0 : 1
		    : class507_sub1_165_.method11495(1090893874) ? -1 : 0);
	if (i == 8) {
	    int i_169_ = 212635377 * class507_sub1.anInt8735;
	    int i_170_ = 212635377 * class507_sub1_165_.anInt8735;
	    if (bool) {
		if (1000 == i_169_)
		    i_169_ = -1;
		if (1000 == i_170_)
		    i_170_ = -1;
	    } else {
		if (i_169_ == -1)
		    i_169_ = 1000;
		if (-1 == i_170_)
		    i_170_ = 1000;
	    }
	    return i_169_ - i_170_;
	}
	return (class507_sub1.anInt8739 * -1855666127
		- -1855666127 * class507_sub1_165_.anInt8739);
    }
    
    static final void method12903(ClientScriptData class454, byte i) {
	Class562.method12383((String) (((ClientScriptData) class454).objectStack
				       [(((ClientScriptData) class454).objectStackPointer
					 -= -1650705371) * -290357331]),
			     151465876);
    }
    
    static String method12904(String string, boolean bool, int i) {
	String string_171_ = bool ? "https://" : "http://";
	if (Class416.aClass470_6012 == Class470.aClass470_6343)
	    string = new StringBuilder().append(string).append("-wtrc")
			 .toString();
	else if (Class416.aClass470_6012 == Class470.aClass470_6341)
	    string = new StringBuilder().append(string).append("-wtqa")
			 .toString();
	else if (Class470.aClass470_6347 == Class416.aClass470_6012)
	    string = new StringBuilder().append(string).append("-wtwip")
			 .toString();
	else if (Class470.aClass470_6338 == Class416.aClass470_6012)
	    string
		= new StringBuilder().append(string).append("-wti").toString();
	else if (Class470.aClass470_6340 == Class416.aClass470_6012)
	    string = new StringBuilder().append(string).append("-demo")
			 .toString();
	else if (Class470.aClass470_6339 == Class416.aClass470_6012)
	    string = "local";
	String string_172_ = "";
	if (client.aString8269 != null)
	    string_172_ = new StringBuilder().append("/p=").append
			      (client.aString8269).toString();
	String string_173_ = new StringBuilder().append
				 (client.currentGame.name).append
				 (".com").toString();
	return new StringBuilder().append(string_171_).append(string).append
		   (".").append
		   (string_173_).append
		   ("/l=").append
		   (-1326047777 * VarPlayerDomain.currentLocale.anInt6140).append
		   ("/a=").append
		   (client.anInt8270 * -2074968733).append
		   (string_172_).append
		   ("/").toString();
    }
    
    static final void method12905(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1) ? 1 : 0,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(668066959).method11400(-602804357);
	Class167.method3600((short) 10622);
	client.aBool8297 = false;
    }
    
    static void method12906(int i) {
	Exception_Sub5.aClass190_10704.method3880((byte) 1);
	((ServerConnection) Exception_Sub5.aClass190_10704)
	    .inputBuffer.pointer
	    = 0;
	((ServerConnection) Exception_Sub5.aClass190_10704).currentPacket = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2272 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2273 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).aClass340_2274 = null;
	((ServerConnection) Exception_Sub5.aClass190_10704).incommingPacketSize = 0;
	((ServerConnection) Exception_Sub5.aClass190_10704).anInt2269 = 0;
	client.systemUpdateTimer = 0;
	Class122.method2983(-1904668091);
	Class610.method13227((byte) 13);
	for (int i_174_ = 0; i_174_ < 2048; i_174_++)
	    client.localPlayers[i_174_] = null;
	Class21.myPlayer = null;
	for (int i_175_ = 0; i_175_ < client.anInt8434 * 743597371; i_175_++) {
	    Entity class475_sub1_sub1_sub3
		= ((Entity)
		   client.aClass241_Sub26Array8276[i_175_].objectValue);
	    if (class475_sub1_sub1_sub3 != null)
		class475_sub1_sub1_sub3.facingEntity = -1027225177;
	}
	Class540.method11933(-1067316801);
	Class592.method12924(Class520.method11690(34612848), -1730533547);
	Class496.setClientStage(19, (byte) -106);
	for (int i_176_ = 0; i_176_ < 108; i_176_++)
	    client.aBoolArray8523[i_176_] = true;
	Class9.method573(Exception_Sub5.aClass190_10704, -558649873);
	Class583.aClass468_7582 = null;
	Class593.aLong7630 = 0L;
	Class211.method4286((byte) -83);
	Class473.varClientDomain.method16180(-1575519803);
    }
}
