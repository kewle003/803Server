/* Class550 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class550
{
    public boolean aBool7090 = true;
    boolean aBool7091 = true;
    static final int anInt7092 = 10;
    static final float aFloat7093 = 3.0F;
    int anInt7094;
    int[] anIntArray7095;
    int[] anIntArray7096;
    boolean aBool7097 = false;
    int anInt7098;
    int anInt7099;
    int[][][] anIntArrayArrayArray7100;
    int anInt7101;
    Class553[] aClass553Array7102;
    Class559 aClass559_7103;
    int anInt7104;
    int anInt7105;
    int[] anIntArray7106;
    Class553[] aClass553Array7107;
    Class553[] aClass553Array7108;
    int[] anIntArray7109;
    static Class103 aClass103_7110;
    static final int anInt7111 = 102;
    Class552 aClass552_7112;
    int anInt7113;
    int[] anIntArray7114;
    Class553[] aClass553Array7115;
    float[] aFloatArray7116;
    int[] anIntArray7117;
    int anInt7118;
    int[] anIntArray7119;
    boolean aBool7120;
    
    final boolean method12033(int i, int i_0_, int i_1_) {
	aClass103_7110.method2338((float) i, (float) i_0_, (float) i_1_,
				  ((Class550) this).aFloatArray7116);
	if (((Class550) this).aFloatArray7116[2] < 50.0F)
	    return false;
	((Class550) this).aFloatArray7116[0] /= 3.0F;
	((Class550) this).aFloatArray7116[1] /= 3.0F;
	return true;
    }
    
    public void method12034(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			    int i_6_) {
	if (i == 8 || i == 16) {
	    if (i == 8) {
		int i_7_ = i_3_ << (((Class550) this).aClass552_7112.anInt7123
				    * 1591782305);
		int i_8_
		    = i_7_ + (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7124) * -1302211377;
		int i_9_ = i_4_ << (((Class550) this).aClass552_7112.anInt7123
				    * 1591782305);
		int i_10_
		    = i_9_ + (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7124) * -1302211377;
		int i_11_ = ((Class550) this).aClass552_7112
				.aClass166Array7179[i_2_]
				.method3551(i_3_, i_4_, -1457870840);
		int i_12_
		    = ((Class550) this).aClass552_7112.aClass166Array7179
			  [i_2_].method3551(i_3_ + 1, i_4_ + 1, -2049728613);
		((Class550) this).aClass553Array7115
		    [((Class550) this).anInt7105++]
		    = new Class553(((Class550) this).aClass552_7112, i, i_2_,
				   i_7_, i_8_, i_8_, i_7_, i_11_, i_12_,
				   i_12_ - i_5_, i_11_ - i_5_, i_9_, i_10_,
				   i_10_, i_9_);
	    } else {
		int i_13_
		    = ((i_3_ << (((Class550) this).aClass552_7112.anInt7123
				 * 1591782305))
		       + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7124) * -1302211377);
		int i_14_
		    = i_13_ - (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7124) * -1302211377;
		int i_15_ = i_4_ << (((Class550) this).aClass552_7112.anInt7123
				     * 1591782305);
		int i_16_
		    = i_15_ + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7124) * -1302211377;
		int i_17_ = ((Class550) this).aClass552_7112
				.aClass166Array7179[i_2_]
				.method3551(i_3_ + 1, i_4_, -1953964487);
		int i_18_ = ((Class550) this).aClass552_7112
				.aClass166Array7179[i_2_]
				.method3551(i_3_, i_4_ + 1, -2018923954);
		((Class550) this).aClass553Array7115
		    [((Class550) this).anInt7105++]
		    = new Class553(((Class550) this).aClass552_7112, i, i_2_,
				   i_13_, i_14_, i_14_, i_13_, i_17_, i_18_,
				   i_18_ - i_5_, i_17_ - i_5_, i_15_, i_16_,
				   i_16_, i_15_);
	    }
	} else {
	    Class548 class548
		= (((Class550) this).aClass552_7112
		   .aClass548ArrayArrayArray7169[i_2_][i_3_][i_4_]);
	    if (class548 == null)
		((Class550) this).aClass552_7112
		    .aClass548ArrayArrayArray7169[i_2_][i_3_][i_4_]
		    = class548 = new Class548(i_2_);
	    if (i == 1) {
		((Class548) class548).aShort7062 = (short) i_5_;
		((Class548) class548).aShort7057 = (short) i_6_;
	    } else if (i == 2) {
		((Class548) class548).aShort7064 = (short) i_5_;
		((Class548) class548).aShort7065 = (short) i_6_;
	    }
	    if (((Class550) this).aBool7097)
		method12037();
	}
    }
    
    public void method12035(int i, int i_19_, int i_20_, int i_21_) {
	if (i == 8 || i == 16) {
	    for (int i_22_ = 0; i_22_ < ((Class550) this).anInt7105; i_22_++) {
		Class553 class553
		    = ((Class550) this).aClass553Array7115[i_22_];
		if (((Class553) class553).aByte7185 == i
		    && ((Class553) class553).aByte7195 == i_19_
		    && ((((Class553) class553).aShort7192 == i_20_
			 && ((Class553) class553).aShort7194 == i_21_)
			|| (((Class553) class553).aShort7193 == i_20_
			    && ((Class553) class553).aShort7197 == i_21_))) {
		    if (i_22_ != ((Class550) this).anInt7105)
			System.arraycopy(((Class550) this).aClass553Array7115,
					 i_22_ + 1,
					 ((Class550) this).aClass553Array7115,
					 i_22_,
					 ((((Class550) this)
					   .aClass553Array7115).length
					  - (i_22_ + 1)));
		    ((Class550) this).anInt7105--;
		    break;
		}
	    }
	} else {
	    Class548 class548
		= (((Class550) this).aClass552_7112
		   .aClass548ArrayArrayArray7169[i_19_][i_20_][i_21_]);
	    if (class548 != null) {
		if (i == 1)
		    ((Class548) class548).aShort7062 = (short) 0;
		else if (i == 2)
		    ((Class548) class548).aShort7064 = (short) 0;
	    }
	    method12037();
	}
    }
    
    public void method12036(int i, int i_23_, int i_24_, int i_25_) {
	if (i == 8 || i == 16) {
	    for (int i_26_ = 0; i_26_ < ((Class550) this).anInt7105; i_26_++) {
		Class553 class553
		    = ((Class550) this).aClass553Array7115[i_26_];
		if (((Class553) class553).aByte7185 == i
		    && ((Class553) class553).aByte7195 == i_23_
		    && ((((Class553) class553).aShort7192 == i_24_
			 && ((Class553) class553).aShort7194 == i_25_)
			|| (((Class553) class553).aShort7193 == i_24_
			    && ((Class553) class553).aShort7197 == i_25_))) {
		    if (i_26_ != ((Class550) this).anInt7105)
			System.arraycopy(((Class550) this).aClass553Array7115,
					 i_26_ + 1,
					 ((Class550) this).aClass553Array7115,
					 i_26_,
					 ((((Class550) this)
					   .aClass553Array7115).length
					  - (i_26_ + 1)));
		    ((Class550) this).anInt7105--;
		    break;
		}
	    }
	} else {
	    Class548 class548
		= (((Class550) this).aClass552_7112
		   .aClass548ArrayArrayArray7169[i_23_][i_24_][i_25_]);
	    if (class548 != null) {
		if (i == 1)
		    ((Class548) class548).aShort7062 = (short) 0;
		else if (i == 2)
		    ((Class548) class548).aShort7064 = (short) 0;
	    }
	    method12037();
	}
    }
    
    void method12037() {
	for (int i = 0; i < ((Class550) this).anInt7104; i++)
	    ((Class550) this).aClass553Array7107[i] = null;
	((Class550) this).anInt7104 = 0;
	for (int i = 0;
	     i < ((Class550) this).aClass552_7112.anInt7132 * 532429613; i++) {
	    for (int i_27_ = 0;
		 (i_27_
		  < ((Class550) this).aClass552_7112.anInt7138 * 120442351);
		 i_27_++) {
		for (int i_28_ = 0;
		     i_28_ < (((Class550) this).aClass552_7112.anInt7142
			      * -2069974325);
		     i_28_++) {
		    Class548 class548
			= (((Class550) this).aClass552_7112
			   .aClass548ArrayArrayArray7169[i][i_28_][i_27_]);
		    if (class548 != null) {
			if (((Class548) class548).aShort7062 > 0)
			    ((Class548) class548).aShort7062 *= -1;
			if (((Class548) class548).aShort7064 > 0)
			    ((Class548) class548).aShort7064 *= -1;
		    }
		}
	    }
	}
	for (int i = 0;
	     i < ((Class550) this).aClass552_7112.anInt7132 * 532429613; i++) {
	    for (int i_29_ = 0;
		 (i_29_
		  < ((Class550) this).aClass552_7112.anInt7138 * 120442351);
		 i_29_++) {
		for (int i_30_ = 0;
		     i_30_ < (((Class550) this).aClass552_7112.anInt7142
			      * -2069974325);
		     i_30_++) {
		    Class548 class548
			= (((Class550) this).aClass552_7112
			   .aClass548ArrayArrayArray7169[i][i_30_][i_29_]);
		    if (class548 != null) {
			boolean bool
			    = ((((Class550) this).aClass552_7112
				.aClass548ArrayArrayArray7169[0][i_30_]
				[i_29_]) != null
			       && (((Class550) this).aClass552_7112
				   .aClass548ArrayArrayArray7169[0][i_30_]
				   [i_29_].aClass548_7063) != null);
			if (((Class548) class548).aShort7062 < 0) {
			    int i_31_ = i_29_;
			    int i_32_ = i_29_;
			    int i_33_ = i;
			    int i_34_ = i;
			    Class548 class548_35_
				= (((Class550) this).aClass552_7112
				   .aClass548ArrayArrayArray7169[i][i_30_]
				   [i_31_ - 1]);
			    int i_36_;
			    for (i_36_ = (((Class550) this).aClass552_7112
					      .aClass166Array7179[i].method3551
					  (i_30_, i_29_, -590202412));
				 (i_31_ > 0 && class548_35_ != null
				  && ((Class548) class548_35_).aShort7062 < 0
				  && (((Class548) class548_35_).aShort7062
				      == ((Class548) class548).aShort7062)
				  && (((Class548) class548_35_).aShort7057
				      == ((Class548) class548).aShort7057)
				  && i_36_ == (((Class550) this)
						   .aClass552_7112
						   .aClass166Array7179[i]
						   .method3551
					       (i_30_, i_31_ - 1, -54754027))
				  && (i_31_ - 1 <= 0
				      || i_36_ == (((Class550) this)
						       .aClass552_7112
						       .aClass166Array7179[i]
						       .method3551
						   (i_30_, i_31_ - 2,
						    -2124798190)))
				  && i_32_ - i_31_ <= 10);
				 class548_35_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i][i_30_]
					[i_31_ - 1]))
				i_31_--;
			    for (class548_35_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i][i_30_]
					[i_32_ + 1]);
				 (i_32_ < (((Class550) this).aClass552_7112
					   .anInt7142) * -2069974325
				  && class548_35_ != null
				  && ((Class548) class548_35_).aShort7062 < 0
				  && (((Class548) class548_35_).aShort7062
				      == ((Class548) class548).aShort7062)
				  && (((Class548) class548_35_).aShort7057
				      == ((Class548) class548).aShort7057)
				  && i_36_ == (((Class550) this)
						   .aClass552_7112
						   .aClass166Array7179[i]
						   .method3551
					       (i_30_, i_32_ + 1, 1034550846))
				  && (i_32_ + 1 >= ((((Class550) this)
						     .aClass552_7112.anInt7142)
						    * -2069974325)
				      || i_36_ == (((Class550) this)
						       .aClass552_7112
						       .aClass166Array7179[i]
						       .method3551
						   (i_30_, i_32_ + 2,
						    -1508620992)))
				  && i_32_ - i_31_ <= 10);
				 class548_35_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i][i_30_]
					[i_32_ + 1]))
				i_32_++;
			    int i_37_ = i_34_ - i_33_ + 1;
			    int i_38_
				= ((Class550) this).aClass552_7112
				      .aClass166Array7179
				      [bool ? i_33_ + 1 : i_33_]
				      .method3551(i_30_, i_31_, -375654324);
			    int i_39_
				= (i_38_
				   + ((Class548) class548).aShort7062 * i_37_);
			    int i_40_
				= (((Class550) this).aClass552_7112
				       .aClass166Array7179
				       [bool ? i_33_ + 1 : i_33_].method3551
				   (i_30_, i_32_ + 1, -1922411142));
			    int i_41_
				= (i_40_
				   + ((Class548) class548).aShort7062 * i_37_);
			    int i_42_
				= i_30_ << (((Class550) this).aClass552_7112
					    .anInt7123) * 1591782305;
			    int i_43_
				= i_31_ << (((Class550) this).aClass552_7112
					    .anInt7123) * 1591782305;
			    int i_44_
				= ((i_32_ << (((Class550) this).aClass552_7112
					      .anInt7123) * 1591782305)
				   + (((Class552) (((Class550) this)
						   .aClass552_7112)).anInt7124
				      * -1302211377));
			    ((Class550) this).aClass553Array7107
				[((Class550) this).anInt7104++]
				= (new Class553
				   (((Class550) this).aClass552_7112, 1, i_34_,
				    i_42_ + ((Class548) class548).aShort7057,
				    i_42_ + ((Class548) class548).aShort7057,
				    i_42_ + ((Class548) class548).aShort7057,
				    i_42_ + ((Class548) class548).aShort7057,
				    i_38_, i_40_, i_41_, i_39_, i_43_, i_44_,
				    i_44_, i_43_));
			    for (int i_45_ = i_33_; i_45_ <= i_34_; i_45_++) {
				for (int i_46_ = i_31_; i_46_ <= i_32_;
				     i_46_++)
				    ((Class548)
				     (((Class550) this).aClass552_7112
				      .aClass548ArrayArrayArray7169[i_45_]
				      [i_30_][i_46_])).aShort7062
					*= -1;
			    }
			}
			if (((Class548) class548).aShort7064 < 0) {
			    int i_47_ = i_30_;
			    int i_48_ = i_30_;
			    int i_49_ = i;
			    int i_50_ = i;
			    Class548 class548_51_
				= (((Class550) this).aClass552_7112
				   .aClass548ArrayArrayArray7169[i][i_47_ - 1]
				   [i_29_]);
			    int i_52_;
			    for (i_52_ = (((Class550) this).aClass552_7112
					      .aClass166Array7179[i].method3551
					  (i_30_, i_29_, 417359614));
				 (i_47_ > 0 && class548_51_ != null
				  && ((Class548) class548_51_).aShort7064 < 0
				  && (((Class548) class548_51_).aShort7064
				      == ((Class548) class548).aShort7064)
				  && (((Class548) class548_51_).aShort7065
				      == ((Class548) class548).aShort7065)
				  && i_52_ == (((Class550) this)
						   .aClass552_7112
						   .aClass166Array7179[i]
						   .method3551
					       (i_47_ - 1, i_29_, 216819359))
				  && (i_47_ - 1 <= 0
				      || (i_52_
					  == (((Class550) this)
						  .aClass552_7112
						  .aClass166Array7179[i]
						  .method3551
					      (i_47_ - 2, i_29_, -972284738))))
				  && i_48_ - i_47_ <= 10);
				 class548_51_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i]
					[i_47_ - 1][i_29_]))
				i_47_--;
			    for (class548_51_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i]
					[i_48_ + 1][i_29_]);
				 (i_48_ < (((Class550) this).aClass552_7112
					   .anInt7138) * 120442351
				  && class548_51_ != null
				  && ((Class548) class548_51_).aShort7064 < 0
				  && (((Class548) class548_51_).aShort7064
				      == ((Class548) class548).aShort7064)
				  && (((Class548) class548_51_).aShort7065
				      == ((Class548) class548).aShort7065)
				  && i_52_ == (((Class550) this)
						   .aClass552_7112
						   .aClass166Array7179[i]
						   .method3551
					       (i_48_ + 1, i_29_, 1022076196))
				  && (i_48_ + 1 >= ((((Class550) this)
						     .aClass552_7112.anInt7138)
						    * 120442351)
				      || i_52_ == (((Class550) this)
						       .aClass552_7112
						       .aClass166Array7179[i]
						       .method3551
						   (i_48_ + 2, i_29_,
						    -1315238285)))
				  && i_48_ - i_47_ <= 10);
				 class548_51_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i]
					[i_48_ + 1][i_29_]))
				i_48_++;
			    int i_53_ = i_50_ - i_49_ + 1;
			    int i_54_
				= ((Class550) this).aClass552_7112
				      .aClass166Array7179
				      [bool ? i_49_ + 1 : i_49_]
				      .method3551(i_47_, i_29_, -1896400126);
			    int i_55_
				= (i_54_
				   + ((Class548) class548).aShort7064 * i_53_);
			    int i_56_
				= ((Class550) this).aClass552_7112
				      .aClass166Array7179
				      [bool ? i_49_ + 1 : i_49_]
				      .method3551(i_48_ + 1, i_29_, -11408531);
			    int i_57_
				= (i_56_
				   + ((Class548) class548).aShort7064 * i_53_);
			    int i_58_
				= i_47_ << (((Class550) this).aClass552_7112
					    .anInt7123) * 1591782305;
			    int i_59_
				= ((i_48_ << (((Class550) this).aClass552_7112
					      .anInt7123) * 1591782305)
				   + (((Class552) (((Class550) this)
						   .aClass552_7112)).anInt7124
				      * -1302211377));
			    int i_60_
				= i_29_ << (((Class550) this).aClass552_7112
					    .anInt7123) * 1591782305;
			    ((Class550) this).aClass553Array7107
				[((Class550) this).anInt7104++]
				= (new Class553
				   (((Class550) this).aClass552_7112, 2, i_50_,
				    i_58_, i_59_, i_59_, i_58_, i_54_, i_56_,
				    i_57_, i_55_,
				    i_60_ + ((Class548) class548).aShort7065,
				    i_60_ + ((Class548) class548).aShort7065,
				    i_60_ + ((Class548) class548).aShort7065,
				    i_60_ + ((Class548) class548).aShort7065));
			    for (int i_61_ = i_49_; i_61_ <= i_50_; i_61_++) {
				for (int i_62_ = i_47_; i_62_ <= i_48_;
				     i_62_++)
				    ((Class548)
				     (((Class550) this).aClass552_7112
				      .aClass548ArrayArrayArray7169[i_61_]
				      [i_62_][i_29_])).aShort7064
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	((Class550) this).aBool7097 = true;
    }
    
    boolean method12038(Class553 class553, int i) {
	if (!method12042(((Class553) class553).anIntArray7196[i],
			 ((Class553) class553).anIntArray7200[i],
			 ((Class553) class553).anIntArray7191[i]))
	    return false;
	((Class553) class553).aShortArray7199[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[0];
	((Class553) class553).aShortArray7190[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[1];
	((Class553) class553).aShortArray7201[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[2];
	return true;
    }
    
    void method12039(Class103 class103, int i) {
	aClass103_7110 = class103;
	if (!aBool7090 || !((Class550) this).aBool7091)
	    ((Class550) this).anInt7094 = 0;
	else {
	    if (((Class550) this).aBool7120)
		((Class552) ((Class550) this).aClass552_7112)
		    .aClass402_7182.method7188((byte) 124);
	    aClass103_7110.method2236(((Class550) this).anIntArray7117);
	    if ((((Class550) this).anInt7118
		 != (int) ((float) ((Class550) this).anIntArray7117[0] / 3.0F))
		|| (((Class550) this).anInt7113
		    != (int) ((float) ((Class550) this).anIntArray7117[1]
			      / 3.0F))) {
		((Class550) this).anInt7118
		    = (int) ((float) ((Class550) this).anIntArray7117[0]
			     / 3.0F);
		((Class550) this).anInt7113
		    = (int) ((float) ((Class550) this).anIntArray7117[1]
			     / 3.0F);
		((Class550) this).anIntArray7114
		    = new int[(((Class550) this).anInt7118
			       * ((Class550) this).anInt7113)];
	    }
	    ((Class550) this).anInt7094 = 0;
	    for (int i_63_ = 0; i_63_ < ((Class550) this).anInt7101; i_63_++)
		method12040(aClass103_7110,
			    ((Class550) this).aClass553Array7102[i_63_], i);
	    for (int i_64_ = 0; i_64_ < ((Class550) this).anInt7104; i_64_++)
		method12040(aClass103_7110,
			    ((Class550) this).aClass553Array7107[i_64_], i);
	    for (int i_65_ = 0; i_65_ < ((Class550) this).anInt7105; i_65_++)
		method12040(aClass103_7110,
			    ((Class550) this).aClass553Array7115[i_65_], i);
	    ((Class559) ((Class550) this).aClass559_7103).anInt7263 = 0;
	    if (((Class550) this).anInt7094 > 0) {
		int i_66_ = ((Class550) this).anIntArray7114.length;
		int i_67_ = i_66_ - i_66_ & 0x7;
		int i_68_ = 0;
		while (i_68_ < i_67_) {
		    ((Class550) this).anIntArray7114[i_68_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_68_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_68_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_68_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_68_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_68_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_68_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_68_++] = 2147483647;
		}
		while (i_68_ < i_66_)
		    ((Class550) this).anIntArray7114[i_68_++] = 2147483647;
		((Class559) ((Class550) this).aClass559_7103).anInt7268 = 1;
		for (int i_69_ = 0; i_69_ < ((Class550) this).anInt7094;
		     i_69_++) {
		    Class553 class553
			= ((Class550) this).aClass553Array7108[i_69_];
		    ((Class550) this).aClass559_7103.method12328
			(((Class553) class553).aShortArray7190[0],
			 ((Class553) class553).aShortArray7190[1],
			 ((Class553) class553).aShortArray7190[3],
			 ((Class553) class553).aShortArray7199[0],
			 ((Class553) class553).aShortArray7199[1],
			 ((Class553) class553).aShortArray7199[3],
			 ((Class553) class553).aShortArray7201[0],
			 ((Class553) class553).aShortArray7201[1],
			 ((Class553) class553).aShortArray7201[3]);
		    ((Class550) this).aClass559_7103.method12328
			(((Class553) class553).aShortArray7190[1],
			 ((Class553) class553).aShortArray7190[2],
			 ((Class553) class553).aShortArray7190[3],
			 ((Class553) class553).aShortArray7199[1],
			 ((Class553) class553).aShortArray7199[2],
			 ((Class553) class553).aShortArray7199[3],
			 ((Class553) class553).aShortArray7201[1],
			 ((Class553) class553).aShortArray7201[2],
			 ((Class553) class553).aShortArray7201[3]);
		}
		((Class559) ((Class550) this).aClass559_7103).anInt7268 = 2;
	    }
	    if (((Class550) this).aBool7120)
		((Class552) ((Class550) this).aClass552_7112)
		    .aClass402_7182.method7188((byte) 105);
	}
    }
    
    void method12040(Class103 class103, Class553 class553, int i) {
	aClass103_7110 = class103;
	if (((Class550) this).anIntArray7109 != null
	    && ((Class553) class553).aByte7195 >= i) {
	    for (int i_70_ = 0;
		 i_70_ < ((Class550) this).anIntArray7109.length; i_70_++) {
		if (((Class550) this).anIntArray7109[i_70_] != -1000000
		    && ((((Class553) class553).anIntArray7200[0]
			 <= ((Class550) this).anIntArray7109[i_70_])
			|| (((Class553) class553).anIntArray7200[1]
			    <= ((Class550) this).anIntArray7109[i_70_])
			|| (((Class553) class553).anIntArray7200[2]
			    <= ((Class550) this).anIntArray7109[i_70_])
			|| (((Class553) class553).anIntArray7200[3]
			    <= ((Class550) this).anIntArray7109[i_70_]))
		    && ((((Class553) class553).anIntArray7196[0]
			 <= ((Class550) this).anIntArray7106[i_70_])
			|| (((Class553) class553).anIntArray7196[1]
			    <= ((Class550) this).anIntArray7106[i_70_])
			|| (((Class553) class553).anIntArray7196[2]
			    <= ((Class550) this).anIntArray7106[i_70_])
			|| (((Class553) class553).anIntArray7196[3]
			    <= ((Class550) this).anIntArray7106[i_70_]))
		    && ((((Class553) class553).anIntArray7196[0]
			 >= ((Class550) this).anIntArray7095[i_70_])
			|| (((Class553) class553).anIntArray7196[1]
			    >= ((Class550) this).anIntArray7095[i_70_])
			|| (((Class553) class553).anIntArray7196[2]
			    >= ((Class550) this).anIntArray7095[i_70_])
			|| (((Class553) class553).anIntArray7196[3]
			    >= ((Class550) this).anIntArray7095[i_70_]))
		    && ((((Class553) class553).anIntArray7191[0]
			 <= ((Class550) this).anIntArray7119[i_70_])
			|| (((Class553) class553).anIntArray7191[1]
			    <= ((Class550) this).anIntArray7119[i_70_])
			|| (((Class553) class553).anIntArray7191[2]
			    <= ((Class550) this).anIntArray7119[i_70_])
			|| (((Class553) class553).anIntArray7191[3]
			    <= ((Class550) this).anIntArray7119[i_70_]))
		    && ((((Class553) class553).anIntArray7191[0]
			 >= ((Class550) this).anIntArray7096[i_70_])
			|| (((Class553) class553).anIntArray7191[1]
			    >= ((Class550) this).anIntArray7096[i_70_])
			|| (((Class553) class553).anIntArray7191[2]
			    >= ((Class550) this).anIntArray7096[i_70_])
			|| (((Class553) class553).anIntArray7191[3]
			    >= ((Class550) this).anIntArray7096[i_70_])))
		    return;
	    }
	}
	if (((Class553) class553).aByte7185 == 1) {
	    int i_71_
		= (((Class553) class553).aShort7192
		   - (((Class552) ((Class550) this).aClass552_7112).anInt7128
		      * -985319149)
		   + (((Class552) ((Class550) this).aClass552_7112).anInt7165
		      * 1222806433));
	    if (i_71_ >= 0
		&& i_71_ <= ((((Class552) ((Class550) this).aClass552_7112)
			      .anInt7165) * 1222806433
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433)) {
		int i_72_ = (((Class553) class553).aShort7194
			     - (((Class552) ((Class550) this).aClass552_7112)
				.anInt7160) * -1234452287
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		if (i_72_ < 0)
		    i_72_ = 0;
		else if (i_72_
			 > ((((Class552) ((Class550) this).aClass552_7112)
			     .anInt7165) * 1222806433
			    + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433))
		    return;
		int i_73_ = (((Class553) class553).aShort7197
			     - (((Class552) ((Class550) this).aClass552_7112)
				.anInt7160) * -1234452287
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		if (i_73_
		    > ((((Class552) ((Class550) this).aClass552_7112).anInt7165
			* 1222806433)
		       + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7165) * 1222806433))
		    i_73_ = ((((Class552) ((Class550) this).aClass552_7112)
			      .anInt7165) * 1222806433
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		else if (i_73_ < 0)
		    return;
		boolean bool = false;
	    while_105_:
		do {
		    do {
			if (i_72_ > i_73_)
			    break while_105_;
		    } while (!((Class552) ((Class550) this).aClass552_7112)
			      .aBoolArrayArray7134[i_71_][i_72_++]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f
			= (float) ((((Class552) (((Class550) this)
						 .aClass552_7112)).anInt7153
				    * 1475282513)
				   - ((Class553) class553).anIntArray7196[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) ((Class550) this).anInt7098)
			&& method12041(class553, 0) && method12041(class553, 1)
			&& method12041(class553, 2)
			&& method12041(class553, 3))
			((Class550) this).aClass553Array7108
			    [((Class550) this).anInt7094++]
			    = class553;
		}
	    }
	} else if (((Class553) class553).aByte7185 == 2) {
	    int i_74_
		= (((Class553) class553).aShort7194
		   - (((Class552) ((Class550) this).aClass552_7112).anInt7160
		      * -1234452287)
		   + (((Class552) ((Class550) this).aClass552_7112).anInt7165
		      * 1222806433));
	    if (i_74_ >= 0
		&& i_74_ <= ((((Class552) ((Class550) this).aClass552_7112)
			      .anInt7165) * 1222806433
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433)) {
		int i_75_ = (((Class553) class553).aShort7192
			     - (((Class552) ((Class550) this).aClass552_7112)
				.anInt7128) * -985319149
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		if (i_75_ < 0)
		    i_75_ = 0;
		else if (i_75_
			 > ((((Class552) ((Class550) this).aClass552_7112)
			     .anInt7165) * 1222806433
			    + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433))
		    return;
		int i_76_ = (((Class553) class553).aShort7193
			     - (((Class552) ((Class550) this).aClass552_7112)
				.anInt7128) * -985319149
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		if (i_76_
		    > ((((Class552) ((Class550) this).aClass552_7112).anInt7165
			* 1222806433)
		       + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7165) * 1222806433))
		    i_76_ = ((((Class552) ((Class550) this).aClass552_7112)
			      .anInt7165) * 1222806433
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		else if (i_76_ < 0)
		    return;
		boolean bool = false;
	    while_106_:
		do {
		    do {
			if (i_75_ > i_76_)
			    break while_106_;
		    } while (!((Class552) ((Class550) this).aClass552_7112)
			      .aBoolArrayArray7134[i_75_++][i_74_]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f
			= (float) ((((Class552) (((Class550) this)
						 .aClass552_7112)).anInt7162
				    * 683928855)
				   - ((Class553) class553).anIntArray7191[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) ((Class550) this).anInt7098)
			&& method12041(class553, 0) && method12041(class553, 1)
			&& method12041(class553, 2)
			&& method12041(class553, 3))
			((Class550) this).aClass553Array7108
			    [((Class550) this).anInt7094++]
			    = class553;
		}
	    }
	} else if (((Class553) class553).aByte7185 == 16
		   || ((Class553) class553).aByte7185 == 8) {
	    int i_77_
		= (((Class553) class553).aShort7192
		   - (((Class552) ((Class550) this).aClass552_7112).anInt7128
		      * -985319149)
		   + (((Class552) ((Class550) this).aClass552_7112).anInt7165
		      * 1222806433));
	    if (i_77_ >= 0
		&& i_77_ <= ((((Class552) ((Class550) this).aClass552_7112)
			      .anInt7165) * 1222806433
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433)) {
		int i_78_ = (((Class553) class553).aShort7194
			     - (((Class552) ((Class550) this).aClass552_7112)
				.anInt7160) * -1234452287
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		if (i_78_ >= 0
		    && (i_78_
			<= ((((Class552) ((Class550) this).aClass552_7112)
			     .anInt7165) * 1222806433
			    + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433))
		    && (((Class552) ((Class550) this).aClass552_7112)
			.aBoolArrayArray7134[i_77_][i_78_])) {
		    float f
			= (float) ((((Class552) (((Class550) this)
						 .aClass552_7112)).anInt7153
				    * 1475282513)
				   - ((Class553) class553).anIntArray7196[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_79_
			= (float) ((((Class552) (((Class550) this)
						 .aClass552_7112)).anInt7162
				    * 683928855)
				   - ((Class553) class553).anIntArray7191[0]);
		    if (f_79_ < 0.0F)
			f_79_ *= -1.0F;
		    if ((!(f < (float) ((Class550) this).anInt7098)
			 || !(f_79_ < (float) ((Class550) this).anInt7098))
			&& method12041(class553, 0) && method12041(class553, 1)
			&& method12041(class553, 2)
			&& method12041(class553, 3))
			((Class550) this).aClass553Array7108
			    [((Class550) this).anInt7094++]
			    = class553;
		}
	    }
	} else if (((Class553) class553).aByte7185 == 4) {
	    float f = (float) (((Class553) class553).anIntArray7200[0]
			       - (((Class552) ((Class550) this).aClass552_7112)
				  .anInt7163) * -140983513);
	    if (!(f <= (float) ((Class550) this).anInt7099)) {
		int i_80_ = (((Class553) class553).aShort7194
			     - (((Class552) ((Class550) this).aClass552_7112)
				.anInt7160) * -1234452287
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		if (i_80_ < 0)
		    i_80_ = 0;
		else if (i_80_
			 > ((((Class552) ((Class550) this).aClass552_7112)
			     .anInt7165) * 1222806433
			    + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433))
		    return;
		int i_81_ = (((Class553) class553).aShort7197
			     - (((Class552) ((Class550) this).aClass552_7112)
				.anInt7160) * -1234452287
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		if (i_81_
		    > ((((Class552) ((Class550) this).aClass552_7112).anInt7165
			* 1222806433)
		       + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7165) * 1222806433))
		    i_81_ = ((((Class552) ((Class550) this).aClass552_7112)
			      .anInt7165) * 1222806433
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		else if (i_81_ < 0)
		    return;
		int i_82_ = (((Class553) class553).aShort7192
			     - (((Class552) ((Class550) this).aClass552_7112)
				.anInt7128) * -985319149
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		if (i_82_ < 0)
		    i_82_ = 0;
		else if (i_82_
			 > ((((Class552) ((Class550) this).aClass552_7112)
			     .anInt7165) * 1222806433
			    + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433))
		    return;
		int i_83_ = (((Class553) class553).aShort7193
			     - (((Class552) ((Class550) this).aClass552_7112)
				.anInt7128) * -985319149
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		if (i_83_
		    > ((((Class552) ((Class550) this).aClass552_7112).anInt7165
			* 1222806433)
		       + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7165) * 1222806433))
		    i_83_ = ((((Class552) ((Class550) this).aClass552_7112)
			      .anInt7165) * 1222806433
			     + (((Class552) ((Class550) this).aClass552_7112)
				.anInt7165) * 1222806433);
		else if (i_83_ < 0)
		    return;
		boolean bool = false;
	    while_107_:
		for (int i_84_ = i_82_; i_84_ <= i_83_; i_84_++) {
		    for (int i_85_ = i_80_; i_85_ <= i_81_; i_85_++) {
			if (((Class552) ((Class550) this).aClass552_7112)
			    .aBoolArrayArray7134[i_84_][i_85_]) {
			    bool = true;
			    break while_107_;
			}
		    }
		}
		if (bool && method12041(class553, 0)
		    && method12041(class553, 1) && method12041(class553, 2)
		    && method12041(class553, 3))
		    ((Class550) this).aClass553Array7108
			[((Class550) this).anInt7094++]
			= class553;
	    }
	}
    }
    
    boolean method12041(Class553 class553, int i) {
	if (!method12042(((Class553) class553).anIntArray7196[i],
			 ((Class553) class553).anIntArray7200[i],
			 ((Class553) class553).anIntArray7191[i]))
	    return false;
	((Class553) class553).aShortArray7199[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[0];
	((Class553) class553).aShortArray7190[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[1];
	((Class553) class553).aShortArray7201[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[2];
	return true;
    }
    
    final boolean method12042(int i, int i_86_, int i_87_) {
	aClass103_7110.method2338((float) i, (float) i_86_, (float) i_87_,
				  ((Class550) this).aFloatArray7116);
	if (((Class550) this).aFloatArray7116[2] < 50.0F)
	    return false;
	((Class550) this).aFloatArray7116[0] /= 3.0F;
	((Class550) this).aFloatArray7116[1] /= 3.0F;
	return true;
    }
    
    boolean method12043(int i, int i_88_, int i_89_) {
	if (!aBool7090 || !((Class550) this).aBool7091)
	    return false;
	if (((Class559) ((Class550) this).aClass559_7103).anInt7263 < 102)
	    return false;
	int i_90_
	    = ((Class550) this).anIntArrayArrayArray7100[i][i_88_][i_89_];
	if (i_90_ == -(((Class552) ((Class550) this).aClass552_7112).anInt7164
		       * -833909065))
	    return false;
	if (i_90_ == (((Class552) ((Class550) this).aClass552_7112).anInt7164
		      * -833909065))
	    return true;
	if (((Class550) this).aClass552_7112.aClass166Array7184
	    == ((Class550) this).aClass552_7112.aClass166Array7140)
	    return false;
	int i_91_
	    = i_88_ << ((Class550) this).aClass552_7112.anInt7123 * 1591782305;
	int i_92_
	    = i_89_ << ((Class550) this).aClass552_7112.anInt7123 * 1591782305;
	if (method12066(i_91_ + 1,
			((Class550) this).aClass552_7112.aClass166Array7184
			    [i].method3551(i_88_, i_89_, -376381101),
			i_92_ + 1,
			i_91_ + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377 - 1,
			((Class550) this).aClass552_7112.aClass166Array7184
			    [i].method3551(i_88_ + 1, i_89_ + 1, -367118373),
			i_92_ + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377 - 1,
			i_91_ + 1,
			((Class550) this).aClass552_7112.aClass166Array7184
			    [i].method3551(i_88_, i_89_ + 1, -491725400),
			i_92_ + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377 - 1)
	    && (method12066
		(i_91_ + 1,
		 ((Class550) this).aClass552_7112.aClass166Array7184[i]
		     .method3551(i_88_, i_89_, -618774747),
		 i_92_ + 1,
		 i_91_ + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7124) * -1302211377 - 1,
		 ((Class550) this).aClass552_7112.aClass166Array7184[i]
		     .method3551(i_88_ + 1, i_89_, -1940223019),
		 i_92_ + 1,
		 i_91_ + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7124) * -1302211377 - 1,
		 ((Class550) this).aClass552_7112.aClass166Array7184[i]
		     .method3551(i_88_ + 1, i_89_ + 1, -254470796),
		 i_92_ + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7124) * -1302211377 - 1))) {
	    ((Class550) this).anIntArrayArrayArray7100[i][i_88_][i_89_]
		= (((Class552) ((Class550) this).aClass552_7112).anInt7164
		   * -833909065);
	    return true;
	}
	((Class550) this).anIntArrayArrayArray7100[i][i_88_][i_89_]
	    = -(((Class552) ((Class550) this).aClass552_7112).anInt7164
		* -833909065);
	return false;
    }
    
    boolean method12044(Class475_Sub1_Sub3 class475_sub1_sub3, int i,
			int i_93_, int i_94_) {
	if (!aBool7090 || !((Class550) this).aBool7091)
	    return false;
	if (((Class559) ((Class550) this).aClass559_7103).anInt7263 < 102)
	    return false;
	if (!method12043(i, i_93_, i_94_))
	    return false;
	int i_95_
	    = i_93_ << ((Class550) this).aClass552_7112.anInt7123 * 1591782305;
	int i_96_
	    = i_94_ << ((Class550) this).aClass552_7112.anInt7123 * 1591782305;
	int i_97_ = (((Class550) this).aClass552_7112.aClass166Array7184[i]
			 .method3551(i_93_, i_94_, -1530037580)
		     - 1);
	int i_98_ = i_97_ + class475_sub1_sub3.method14468((byte) 36);
	if (class475_sub1_sub3.aShort10724 == 1) {
	    if (!method12066(i_95_, i_97_, i_96_, i_95_, i_98_, i_96_, i_95_,
			     i_98_,
			     (i_96_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377)))
		return false;
	    if (!method12066(i_95_, i_97_, i_96_, i_95_, i_98_,
			     (i_96_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377),
			     i_95_, i_97_,
			     (i_96_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377)))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 2) {
	    if (!method12066
		 (i_95_, i_97_,
		  i_96_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_95_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_98_,
		  i_96_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_95_, i_98_,
		  i_96_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377))
		return false;
	    if (!method12066
		 (i_95_, i_97_,
		  i_96_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_95_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_97_,
		  i_96_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_95_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_98_,
		  i_96_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 4) {
	    if (!method12066
		 (i_95_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_97_, i_96_,
		  i_95_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_98_, i_96_,
		  i_95_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_98_,
		  i_96_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377))
		return false;
	    if (!method12066
		 (i_95_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_97_, i_96_,
		  i_95_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_98_,
		  i_96_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_95_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377,
		  i_97_,
		  i_96_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 8) {
	    if (!method12066(i_95_, i_97_, i_96_,
			     (i_95_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377),
			     i_98_, i_96_, i_95_, i_98_, i_96_))
		return false;
	    if (!method12066(i_95_, i_97_, i_96_,
			     (i_95_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377),
			     i_97_, i_96_,
			     (i_95_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377),
			     i_98_, i_96_))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 16) {
	    if (!method12048(i_95_, i_97_,
			     (i_96_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7141) * -558976661),
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661,
			     i_98_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 32) {
	    if (!method12048((i_95_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7141) * -558976661),
			     i_97_,
			     (i_96_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7141) * -558976661),
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661,
			     i_98_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 64) {
	    if (!method12048((i_95_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7141) * -558976661),
			     i_97_, i_96_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661,
			     i_98_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 128) {
	    if (!method12048(i_95_, i_97_, i_96_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661,
			     i_98_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661))
		return false;
	    return true;
	}
	return true;
    }
    
    boolean method12045(int i, int i_99_, int i_100_, int i_101_) {
	if (!aBool7090 || !((Class550) this).aBool7091)
	    return false;
	if (((Class559) ((Class550) this).aClass559_7103).anInt7263 < 102)
	    return false;
	if (!method12043(i, i_99_, i_100_))
	    return false;
	int i_102_
	    = i_99_ << ((Class550) this).aClass552_7112.anInt7123 * 1591782305;
	int i_103_
	    = (i_100_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	if (method12048(i_102_,
			((Class550) this).aClass552_7112.aClass166Array7184
			    [i].method3551(i_99_, i_100_, 229829989),
			i_103_,
			(((Class552) ((Class550) this).aClass552_7112)
			 .anInt7124) * -1302211377,
			i_101_,
			(((Class552) ((Class550) this).aClass552_7112)
			 .anInt7124) * -1302211377))
	    return true;
	return false;
    }
    
    boolean method12046(int i, int i_104_, int i_105_, int i_106_, int i_107_,
			Class535 class535) {
	if (!aBool7090 || !((Class550) this).aBool7091)
	    return false;
	if (((Class559) ((Class550) this).aClass559_7103).anInt7263 < 102)
	    return false;
	if (i_104_ < 0 || i_106_ < 0
	    || i_105_ >= ((Class550) this).anIntArrayArrayArray7100[i].length
	    || i_107_ >= (((Class550) this).anIntArrayArrayArray7100[i]
			  [i_104_]).length)
	    return false;
	if (i_104_ == i_105_ && i_106_ == i_107_) {
	    if (!method12043(i, i_104_, i_106_))
		return false;
	    if (method12050(class535))
		return true;
	    return false;
	}
	for (int i_108_ = i_104_; i_108_ <= i_105_; i_108_++) {
	    for (int i_109_ = i_106_; i_109_ <= i_107_; i_109_++) {
		if ((((Class550) this).anIntArrayArrayArray7100[i][i_108_]
		     [i_109_])
		    == -((((Class552) ((Class550) this).aClass552_7112)
			  .anInt7164)
			 * -833909065))
		    return false;
	    }
	}
	if (!method12050(class535))
	    return false;
	return true;
    }
    
    public void method12047() {
	method12037();
    }
    
    final boolean method12048(int i, int i_110_, int i_111_, int i_112_,
			      int i_113_, int i_114_) {
	int i_115_ = i + i_112_;
	int i_116_ = i_110_ + i_113_;
	int i_117_ = i_111_ + i_114_;
	if (!method12066(i, i_116_, i_111_, i_115_, i_116_, i_117_, i, i_116_,
			 i_117_))
	    return false;
	if (!method12066(i, i_116_, i_111_, i_115_, i_116_, i_111_, i_115_,
			 i_116_, i_117_))
	    return false;
	if (i < (((Class552) ((Class550) this).aClass552_7112).anInt7153
		 * 1475282513)) {
	    if (!method12066(i, i_110_, i_117_, i, i_116_, i_111_, i, i_116_,
			     i_117_))
		return false;
	    if (!method12066(i, i_110_, i_117_, i, i_110_, i_111_, i, i_116_,
			     i_111_))
		return false;
	} else {
	    if (!method12066(i_115_, i_110_, i_117_, i_115_, i_116_, i_111_,
			     i_115_, i_116_, i_117_))
		return false;
	    if (!method12066(i_115_, i_110_, i_117_, i_115_, i_110_, i_111_,
			     i_115_, i_116_, i_111_))
		return false;
	}
	if (i_111_ < (((Class552) ((Class550) this).aClass552_7112).anInt7162
		      * 683928855)) {
	    if (!method12066(i, i_110_, i_111_, i_115_, i_116_, i_111_, i,
			     i_116_, i_111_))
		return false;
	    if (!method12066(i, i_110_, i_111_, i_115_, i_110_, i_111_, i_115_,
			     i_116_, i_111_))
		return false;
	} else {
	    if (!method12066(i, i_110_, i_117_, i_115_, i_116_, i_117_, i,
			     i_116_, i_117_))
		return false;
	    if (!method12066(i, i_110_, i_117_, i_115_, i_110_, i_117_, i_115_,
			     i_116_, i_117_))
		return false;
	}
	return true;
    }
    
    public void method12049(int i, int i_118_, int i_119_, int i_120_,
			    int i_121_, int i_122_, int i_123_, int i_124_) {
	((Class550) this).aClass553Array7102[((Class550) this).anInt7101++]
	    = new Class553(((Class550) this).aClass552_7112, i, i_118_, i_119_,
			   i_120_, i_120_, i_119_, i_123_, i_124_, i_124_,
			   i_123_, i_121_, i_121_, i_122_, i_122_);
    }
    
    final boolean method12050(Class535 class535) {
	if (class535 == null)
	    return false;
	return method12048(((Class535) class535).anInt6980,
			   ((Class535) class535).anInt6982,
			   ((Class535) class535).anInt6978,
			   (((Class535) class535).anInt6981
			    - ((Class535) class535).anInt6980),
			   (((Class535) class535).anInt6979
			    - ((Class535) class535).anInt6982),
			   (((Class535) class535).anInt6984
			    - ((Class535) class535).anInt6978));
    }
    
    public void method12051(int i, int i_125_, int i_126_, int i_127_) {
	if (i == 8 || i == 16) {
	    for (int i_128_ = 0; i_128_ < ((Class550) this).anInt7105;
		 i_128_++) {
		Class553 class553
		    = ((Class550) this).aClass553Array7115[i_128_];
		if (((Class553) class553).aByte7185 == i
		    && ((Class553) class553).aByte7195 == i_125_
		    && ((((Class553) class553).aShort7192 == i_126_
			 && ((Class553) class553).aShort7194 == i_127_)
			|| (((Class553) class553).aShort7193 == i_126_
			    && ((Class553) class553).aShort7197 == i_127_))) {
		    if (i_128_ != ((Class550) this).anInt7105)
			System.arraycopy(((Class550) this).aClass553Array7115,
					 i_128_ + 1,
					 ((Class550) this).aClass553Array7115,
					 i_128_,
					 ((((Class550) this)
					   .aClass553Array7115).length
					  - (i_128_ + 1)));
		    ((Class550) this).anInt7105--;
		    break;
		}
	    }
	} else {
	    Class548 class548
		= (((Class550) this).aClass552_7112
		   .aClass548ArrayArrayArray7169[i_125_][i_126_][i_127_]);
	    if (class548 != null) {
		if (i == 1)
		    ((Class548) class548).aShort7062 = (short) 0;
		else if (i == 2)
		    ((Class548) class548).aShort7064 = (short) 0;
	    }
	    method12037();
	}
    }
    
    public void method12052(int i, int i_129_, int i_130_, int i_131_) {
	if (i == 8 || i == 16) {
	    for (int i_132_ = 0; i_132_ < ((Class550) this).anInt7105;
		 i_132_++) {
		Class553 class553
		    = ((Class550) this).aClass553Array7115[i_132_];
		if (((Class553) class553).aByte7185 == i
		    && ((Class553) class553).aByte7195 == i_129_
		    && ((((Class553) class553).aShort7192 == i_130_
			 && ((Class553) class553).aShort7194 == i_131_)
			|| (((Class553) class553).aShort7193 == i_130_
			    && ((Class553) class553).aShort7197 == i_131_))) {
		    if (i_132_ != ((Class550) this).anInt7105)
			System.arraycopy(((Class550) this).aClass553Array7115,
					 i_132_ + 1,
					 ((Class550) this).aClass553Array7115,
					 i_132_,
					 ((((Class550) this)
					   .aClass553Array7115).length
					  - (i_132_ + 1)));
		    ((Class550) this).anInt7105--;
		    break;
		}
	    }
	} else {
	    Class548 class548
		= (((Class550) this).aClass552_7112
		   .aClass548ArrayArrayArray7169[i_129_][i_130_][i_131_]);
	    if (class548 != null) {
		if (i == 1)
		    ((Class548) class548).aShort7062 = (short) 0;
		else if (i == 2)
		    ((Class548) class548).aShort7064 = (short) 0;
	    }
	    method12037();
	}
    }
    
    public void method12053() {
	method12037();
    }
    
    public void method12054() {
	method12037();
    }
    
    boolean method12055(Class553 class553, int i) {
	if (!method12042(((Class553) class553).anIntArray7196[i],
			 ((Class553) class553).anIntArray7200[i],
			 ((Class553) class553).anIntArray7191[i]))
	    return false;
	((Class553) class553).aShortArray7199[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[0];
	((Class553) class553).aShortArray7190[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[1];
	((Class553) class553).aShortArray7201[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[2];
	return true;
    }
    
    final boolean method12056(Class535 class535) {
	if (class535 == null)
	    return false;
	return method12048(((Class535) class535).anInt6980,
			   ((Class535) class535).anInt6982,
			   ((Class535) class535).anInt6978,
			   (((Class535) class535).anInt6981
			    - ((Class535) class535).anInt6980),
			   (((Class535) class535).anInt6979
			    - ((Class535) class535).anInt6982),
			   (((Class535) class535).anInt6984
			    - ((Class535) class535).anInt6978));
    }
    
    public void method12057(int i, int i_133_, int i_134_, int i_135_,
			    int i_136_, int i_137_, int i_138_, int i_139_) {
	((Class550) this).aClass553Array7102[((Class550) this).anInt7101++]
	    = new Class553(((Class550) this).aClass552_7112, i, i_133_, i_134_,
			   i_135_, i_135_, i_134_, i_138_, i_139_, i_139_,
			   i_138_, i_136_, i_136_, i_137_, i_137_);
    }
    
    public void method12058(int i, int i_140_, int i_141_, int i_142_,
			    int i_143_, int i_144_, int i_145_, int i_146_) {
	((Class550) this).aClass553Array7102[((Class550) this).anInt7101++]
	    = new Class553(((Class550) this).aClass552_7112, i, i_140_, i_141_,
			   i_142_, i_142_, i_141_, i_145_, i_146_, i_146_,
			   i_145_, i_143_, i_143_, i_144_, i_144_);
    }
    
    final boolean method12059(Class535 class535) {
	if (class535 == null)
	    return false;
	return method12048(((Class535) class535).anInt6980,
			   ((Class535) class535).anInt6982,
			   ((Class535) class535).anInt6978,
			   (((Class535) class535).anInt6981
			    - ((Class535) class535).anInt6980),
			   (((Class535) class535).anInt6979
			    - ((Class535) class535).anInt6982),
			   (((Class535) class535).anInt6984
			    - ((Class535) class535).anInt6978));
    }
    
    void method12060(Class103 class103, Class553 class553, int i) {
	aClass103_7110 = class103;
	if (((Class550) this).anIntArray7109 != null
	    && ((Class553) class553).aByte7195 >= i) {
	    for (int i_147_ = 0;
		 i_147_ < ((Class550) this).anIntArray7109.length; i_147_++) {
		if (((Class550) this).anIntArray7109[i_147_] != -1000000
		    && ((((Class553) class553).anIntArray7200[0]
			 <= ((Class550) this).anIntArray7109[i_147_])
			|| (((Class553) class553).anIntArray7200[1]
			    <= ((Class550) this).anIntArray7109[i_147_])
			|| (((Class553) class553).anIntArray7200[2]
			    <= ((Class550) this).anIntArray7109[i_147_])
			|| (((Class553) class553).anIntArray7200[3]
			    <= ((Class550) this).anIntArray7109[i_147_]))
		    && ((((Class553) class553).anIntArray7196[0]
			 <= ((Class550) this).anIntArray7106[i_147_])
			|| (((Class553) class553).anIntArray7196[1]
			    <= ((Class550) this).anIntArray7106[i_147_])
			|| (((Class553) class553).anIntArray7196[2]
			    <= ((Class550) this).anIntArray7106[i_147_])
			|| (((Class553) class553).anIntArray7196[3]
			    <= ((Class550) this).anIntArray7106[i_147_]))
		    && ((((Class553) class553).anIntArray7196[0]
			 >= ((Class550) this).anIntArray7095[i_147_])
			|| (((Class553) class553).anIntArray7196[1]
			    >= ((Class550) this).anIntArray7095[i_147_])
			|| (((Class553) class553).anIntArray7196[2]
			    >= ((Class550) this).anIntArray7095[i_147_])
			|| (((Class553) class553).anIntArray7196[3]
			    >= ((Class550) this).anIntArray7095[i_147_]))
		    && ((((Class553) class553).anIntArray7191[0]
			 <= ((Class550) this).anIntArray7119[i_147_])
			|| (((Class553) class553).anIntArray7191[1]
			    <= ((Class550) this).anIntArray7119[i_147_])
			|| (((Class553) class553).anIntArray7191[2]
			    <= ((Class550) this).anIntArray7119[i_147_])
			|| (((Class553) class553).anIntArray7191[3]
			    <= ((Class550) this).anIntArray7119[i_147_]))
		    && ((((Class553) class553).anIntArray7191[0]
			 >= ((Class550) this).anIntArray7096[i_147_])
			|| (((Class553) class553).anIntArray7191[1]
			    >= ((Class550) this).anIntArray7096[i_147_])
			|| (((Class553) class553).anIntArray7191[2]
			    >= ((Class550) this).anIntArray7096[i_147_])
			|| (((Class553) class553).anIntArray7191[3]
			    >= ((Class550) this).anIntArray7096[i_147_])))
		    return;
	    }
	}
	if (((Class553) class553).aByte7185 == 1) {
	    int i_148_
		= (((Class553) class553).aShort7192
		   - (((Class552) ((Class550) this).aClass552_7112).anInt7128
		      * -985319149)
		   + (((Class552) ((Class550) this).aClass552_7112).anInt7165
		      * 1222806433));
	    if (i_148_ >= 0
		&& i_148_ <= ((((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433)) {
		int i_149_ = (((Class553) class553).aShort7194
			      - (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7160) * -1234452287
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		if (i_149_ < 0)
		    i_149_ = 0;
		else if (i_149_
			 > ((((Class552) ((Class550) this).aClass552_7112)
			     .anInt7165) * 1222806433
			    + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433))
		    return;
		int i_150_ = (((Class553) class553).aShort7197
			      - (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7160) * -1234452287
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		if (i_150_
		    > ((((Class552) ((Class550) this).aClass552_7112).anInt7165
			* 1222806433)
		       + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7165) * 1222806433))
		    i_150_ = ((((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		else if (i_150_ < 0)
		    return;
		boolean bool = false;
	    while_108_:
		do {
		    do {
			if (i_149_ > i_150_)
			    break while_108_;
		    } while (!((Class552) ((Class550) this).aClass552_7112)
			      .aBoolArrayArray7134[i_148_][i_149_++]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f
			= (float) ((((Class552) (((Class550) this)
						 .aClass552_7112)).anInt7153
				    * 1475282513)
				   - ((Class553) class553).anIntArray7196[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) ((Class550) this).anInt7098)
			&& method12041(class553, 0) && method12041(class553, 1)
			&& method12041(class553, 2)
			&& method12041(class553, 3))
			((Class550) this).aClass553Array7108
			    [((Class550) this).anInt7094++]
			    = class553;
		}
	    }
	} else if (((Class553) class553).aByte7185 == 2) {
	    int i_151_
		= (((Class553) class553).aShort7194
		   - (((Class552) ((Class550) this).aClass552_7112).anInt7160
		      * -1234452287)
		   + (((Class552) ((Class550) this).aClass552_7112).anInt7165
		      * 1222806433));
	    if (i_151_ >= 0
		&& i_151_ <= ((((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433)) {
		int i_152_ = (((Class553) class553).aShort7192
			      - (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7128) * -985319149
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		if (i_152_ < 0)
		    i_152_ = 0;
		else if (i_152_
			 > ((((Class552) ((Class550) this).aClass552_7112)
			     .anInt7165) * 1222806433
			    + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433))
		    return;
		int i_153_ = (((Class553) class553).aShort7193
			      - (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7128) * -985319149
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		if (i_153_
		    > ((((Class552) ((Class550) this).aClass552_7112).anInt7165
			* 1222806433)
		       + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7165) * 1222806433))
		    i_153_ = ((((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		else if (i_153_ < 0)
		    return;
		boolean bool = false;
	    while_109_:
		do {
		    do {
			if (i_152_ > i_153_)
			    break while_109_;
		    } while (!((Class552) ((Class550) this).aClass552_7112)
			      .aBoolArrayArray7134[i_152_++][i_151_]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f
			= (float) ((((Class552) (((Class550) this)
						 .aClass552_7112)).anInt7162
				    * 683928855)
				   - ((Class553) class553).anIntArray7191[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) ((Class550) this).anInt7098)
			&& method12041(class553, 0) && method12041(class553, 1)
			&& method12041(class553, 2)
			&& method12041(class553, 3))
			((Class550) this).aClass553Array7108
			    [((Class550) this).anInt7094++]
			    = class553;
		}
	    }
	} else if (((Class553) class553).aByte7185 == 16
		   || ((Class553) class553).aByte7185 == 8) {
	    int i_154_
		= (((Class553) class553).aShort7192
		   - (((Class552) ((Class550) this).aClass552_7112).anInt7128
		      * -985319149)
		   + (((Class552) ((Class550) this).aClass552_7112).anInt7165
		      * 1222806433));
	    if (i_154_ >= 0
		&& i_154_ <= ((((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433)) {
		int i_155_ = (((Class553) class553).aShort7194
			      - (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7160) * -1234452287
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		if (i_155_ >= 0
		    && (i_155_
			<= ((((Class552) ((Class550) this).aClass552_7112)
			     .anInt7165) * 1222806433
			    + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433))
		    && (((Class552) ((Class550) this).aClass552_7112)
			.aBoolArrayArray7134[i_154_][i_155_])) {
		    float f
			= (float) ((((Class552) (((Class550) this)
						 .aClass552_7112)).anInt7153
				    * 1475282513)
				   - ((Class553) class553).anIntArray7196[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_156_
			= (float) ((((Class552) (((Class550) this)
						 .aClass552_7112)).anInt7162
				    * 683928855)
				   - ((Class553) class553).anIntArray7191[0]);
		    if (f_156_ < 0.0F)
			f_156_ *= -1.0F;
		    if ((!(f < (float) ((Class550) this).anInt7098)
			 || !(f_156_ < (float) ((Class550) this).anInt7098))
			&& method12041(class553, 0) && method12041(class553, 1)
			&& method12041(class553, 2)
			&& method12041(class553, 3))
			((Class550) this).aClass553Array7108
			    [((Class550) this).anInt7094++]
			    = class553;
		}
	    }
	} else if (((Class553) class553).aByte7185 == 4) {
	    float f = (float) (((Class553) class553).anIntArray7200[0]
			       - (((Class552) ((Class550) this).aClass552_7112)
				  .anInt7163) * -140983513);
	    if (!(f <= (float) ((Class550) this).anInt7099)) {
		int i_157_ = (((Class553) class553).aShort7194
			      - (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7160) * -1234452287
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		if (i_157_ < 0)
		    i_157_ = 0;
		else if (i_157_
			 > ((((Class552) ((Class550) this).aClass552_7112)
			     .anInt7165) * 1222806433
			    + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433))
		    return;
		int i_158_ = (((Class553) class553).aShort7197
			      - (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7160) * -1234452287
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		if (i_158_
		    > ((((Class552) ((Class550) this).aClass552_7112).anInt7165
			* 1222806433)
		       + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7165) * 1222806433))
		    i_158_ = ((((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		else if (i_158_ < 0)
		    return;
		int i_159_ = (((Class553) class553).aShort7192
			      - (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7128) * -985319149
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		if (i_159_ < 0)
		    i_159_ = 0;
		else if (i_159_
			 > ((((Class552) ((Class550) this).aClass552_7112)
			     .anInt7165) * 1222806433
			    + (((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433))
		    return;
		int i_160_ = (((Class553) class553).aShort7193
			      - (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7128) * -985319149
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		if (i_160_
		    > ((((Class552) ((Class550) this).aClass552_7112).anInt7165
			* 1222806433)
		       + (((Class552) ((Class550) this).aClass552_7112)
			  .anInt7165) * 1222806433))
		    i_160_ = ((((Class552) ((Class550) this).aClass552_7112)
			       .anInt7165) * 1222806433
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7165) * 1222806433);
		else if (i_160_ < 0)
		    return;
		boolean bool = false;
	    while_110_:
		for (int i_161_ = i_159_; i_161_ <= i_160_; i_161_++) {
		    for (int i_162_ = i_157_; i_162_ <= i_158_; i_162_++) {
			if (((Class552) ((Class550) this).aClass552_7112)
			    .aBoolArrayArray7134[i_161_][i_162_]) {
			    bool = true;
			    break while_110_;
			}
		    }
		}
		if (bool && method12041(class553, 0)
		    && method12041(class553, 1) && method12041(class553, 2)
		    && method12041(class553, 3))
		    ((Class550) this).aClass553Array7108
			[((Class550) this).anInt7094++]
			= class553;
	    }
	}
    }
    
    final boolean method12061(Class535 class535) {
	if (class535 == null)
	    return false;
	return method12048(((Class535) class535).anInt6980,
			   ((Class535) class535).anInt6982,
			   ((Class535) class535).anInt6978,
			   (((Class535) class535).anInt6981
			    - ((Class535) class535).anInt6980),
			   (((Class535) class535).anInt6979
			    - ((Class535) class535).anInt6982),
			   (((Class535) class535).anInt6984
			    - ((Class535) class535).anInt6978));
    }
    
    boolean method12062(Class553 class553, int i) {
	if (!method12042(((Class553) class553).anIntArray7196[i],
			 ((Class553) class553).anIntArray7200[i],
			 ((Class553) class553).anIntArray7191[i]))
	    return false;
	((Class553) class553).aShortArray7199[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[0];
	((Class553) class553).aShortArray7190[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[1];
	((Class553) class553).aShortArray7201[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[2];
	return true;
    }
    
    void method12063() {
	for (int i = 0; i < ((Class550) this).anInt7104; i++)
	    ((Class550) this).aClass553Array7107[i] = null;
	((Class550) this).anInt7104 = 0;
	for (int i = 0;
	     i < ((Class550) this).aClass552_7112.anInt7132 * 532429613; i++) {
	    for (int i_163_ = 0;
		 (i_163_
		  < ((Class550) this).aClass552_7112.anInt7138 * 120442351);
		 i_163_++) {
		for (int i_164_ = 0;
		     i_164_ < (((Class550) this).aClass552_7112.anInt7142
			       * -2069974325);
		     i_164_++) {
		    Class548 class548
			= (((Class550) this).aClass552_7112
			   .aClass548ArrayArrayArray7169[i][i_164_][i_163_]);
		    if (class548 != null) {
			if (((Class548) class548).aShort7062 > 0)
			    ((Class548) class548).aShort7062 *= -1;
			if (((Class548) class548).aShort7064 > 0)
			    ((Class548) class548).aShort7064 *= -1;
		    }
		}
	    }
	}
	for (int i = 0;
	     i < ((Class550) this).aClass552_7112.anInt7132 * 532429613; i++) {
	    for (int i_165_ = 0;
		 (i_165_
		  < ((Class550) this).aClass552_7112.anInt7138 * 120442351);
		 i_165_++) {
		for (int i_166_ = 0;
		     i_166_ < (((Class550) this).aClass552_7112.anInt7142
			       * -2069974325);
		     i_166_++) {
		    Class548 class548
			= (((Class550) this).aClass552_7112
			   .aClass548ArrayArrayArray7169[i][i_166_][i_165_]);
		    if (class548 != null) {
			boolean bool
			    = ((((Class550) this).aClass552_7112
				.aClass548ArrayArrayArray7169[0][i_166_]
				[i_165_]) != null
			       && (((Class550) this).aClass552_7112
				   .aClass548ArrayArrayArray7169[0][i_166_]
				   [i_165_].aClass548_7063) != null);
			if (((Class548) class548).aShort7062 < 0) {
			    int i_167_ = i_165_;
			    int i_168_ = i_165_;
			    int i_169_ = i;
			    int i_170_ = i;
			    Class548 class548_171_
				= (((Class550) this).aClass552_7112
				   .aClass548ArrayArrayArray7169[i][i_166_]
				   [i_167_ - 1]);
			    int i_172_;
			    for (i_172_
				     = (((Class550) this).aClass552_7112
					    .aClass166Array7179[i].method3551
					(i_166_, i_165_, 458010455));
				 (i_167_ > 0 && class548_171_ != null
				  && ((Class548) class548_171_).aShort7062 < 0
				  && (((Class548) class548_171_).aShort7062
				      == ((Class548) class548).aShort7062)
				  && (((Class548) class548_171_).aShort7057
				      == ((Class548) class548).aShort7057)
				  && (i_172_
				      == (((Class550) this).aClass552_7112
					      .aClass166Array7179[i].method3551
					  (i_166_, i_167_ - 1, -1616952557)))
				  && (i_167_ - 1 <= 0
				      || i_172_ == (((Class550) this)
							.aClass552_7112
							.aClass166Array7179[i]
							.method3551
						    (i_166_, i_167_ - 2,
						     -848638369)))
				  && i_168_ - i_167_ <= 10);
				 class548_171_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i]
					[i_166_][i_167_ - 1]))
				i_167_--;
			    for (class548_171_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i]
					[i_166_][i_168_ + 1]);
				 (i_168_ < (((Class550) this).aClass552_7112
					    .anInt7142) * -2069974325
				  && class548_171_ != null
				  && ((Class548) class548_171_).aShort7062 < 0
				  && (((Class548) class548_171_).aShort7062
				      == ((Class548) class548).aShort7062)
				  && (((Class548) class548_171_).aShort7057
				      == ((Class548) class548).aShort7057)
				  && (i_172_
				      == (((Class550) this).aClass552_7112
					      .aClass166Array7179[i].method3551
					  (i_166_, i_168_ + 1, -826612633)))
				  && (i_168_ + 1 >= (((Class550) this)
						     .aClass552_7112
						     .anInt7142) * -2069974325
				      || i_172_ == (((Class550) this)
							.aClass552_7112
							.aClass166Array7179[i]
							.method3551
						    (i_166_, i_168_ + 2,
						     -770972220)))
				  && i_168_ - i_167_ <= 10);
				 class548_171_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i]
					[i_166_][i_168_ + 1]))
				i_168_++;
			    int i_173_ = i_170_ - i_169_ + 1;
			    int i_174_
				= ((Class550) this).aClass552_7112
				      .aClass166Array7179
				      [bool ? i_169_ + 1 : i_169_]
				      .method3551(i_166_, i_167_, -1534532497);
			    int i_175_
				= i_174_ + (((Class548) class548).aShort7062
					    * i_173_);
			    int i_176_
				= (((Class550) this).aClass552_7112
				       .aClass166Array7179
				       [bool ? i_169_ + 1 : i_169_].method3551
				   (i_166_, i_168_ + 1, -1596254722));
			    int i_177_
				= i_176_ + (((Class548) class548).aShort7062
					    * i_173_);
			    int i_178_
				= i_166_ << (((Class550) this).aClass552_7112
					     .anInt7123) * 1591782305;
			    int i_179_
				= i_167_ << (((Class550) this).aClass552_7112
					     .anInt7123) * 1591782305;
			    int i_180_
				= ((i_168_ << (((Class550) this).aClass552_7112
					       .anInt7123) * 1591782305)
				   + (((Class552) (((Class550) this)
						   .aClass552_7112)).anInt7124
				      * -1302211377));
			    ((Class550) this).aClass553Array7107
				[((Class550) this).anInt7104++]
				= (new Class553
				   (((Class550) this).aClass552_7112, 1,
				    i_170_,
				    i_178_ + ((Class548) class548).aShort7057,
				    i_178_ + ((Class548) class548).aShort7057,
				    i_178_ + ((Class548) class548).aShort7057,
				    i_178_ + ((Class548) class548).aShort7057,
				    i_174_, i_176_, i_177_, i_175_, i_179_,
				    i_180_, i_180_, i_179_));
			    for (int i_181_ = i_169_; i_181_ <= i_170_;
				 i_181_++) {
				for (int i_182_ = i_167_; i_182_ <= i_168_;
				     i_182_++)
				    ((Class548)
				     (((Class550) this).aClass552_7112
				      .aClass548ArrayArrayArray7169[i_181_]
				      [i_166_][i_182_])).aShort7062
					*= -1;
			    }
			}
			if (((Class548) class548).aShort7064 < 0) {
			    int i_183_ = i_166_;
			    int i_184_ = i_166_;
			    int i_185_ = i;
			    int i_186_ = i;
			    Class548 class548_187_
				= (((Class550) this).aClass552_7112
				   .aClass548ArrayArrayArray7169[i][i_183_ - 1]
				   [i_165_]);
			    int i_188_;
			    for (i_188_
				     = (((Class550) this).aClass552_7112
					    .aClass166Array7179[i].method3551
					(i_166_, i_165_, 705996482));
				 (i_183_ > 0 && class548_187_ != null
				  && ((Class548) class548_187_).aShort7064 < 0
				  && (((Class548) class548_187_).aShort7064
				      == ((Class548) class548).aShort7064)
				  && (((Class548) class548_187_).aShort7065
				      == ((Class548) class548).aShort7065)
				  && (i_188_
				      == (((Class550) this).aClass552_7112
					      .aClass166Array7179[i].method3551
					  (i_183_ - 1, i_165_, -1866036146)))
				  && (i_183_ - 1 <= 0
				      || i_188_ == (((Class550) this)
							.aClass552_7112
							.aClass166Array7179[i]
							.method3551
						    (i_183_ - 2, i_165_,
						     -1188933191)))
				  && i_184_ - i_183_ <= 10);
				 class548_187_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i]
					[i_183_ - 1][i_165_]))
				i_183_--;
			    for (class548_187_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i]
					[i_184_ + 1][i_165_]);
				 (i_184_ < (((Class550) this).aClass552_7112
					    .anInt7138) * 120442351
				  && class548_187_ != null
				  && ((Class548) class548_187_).aShort7064 < 0
				  && (((Class548) class548_187_).aShort7064
				      == ((Class548) class548).aShort7064)
				  && (((Class548) class548_187_).aShort7065
				      == ((Class548) class548).aShort7065)
				  && (i_188_
				      == (((Class550) this).aClass552_7112
					      .aClass166Array7179[i].method3551
					  (i_184_ + 1, i_165_, -916966146)))
				  && (i_184_ + 1 >= (((Class550) this)
						     .aClass552_7112
						     .anInt7138) * 120442351
				      || i_188_ == (((Class550) this)
							.aClass552_7112
							.aClass166Array7179[i]
							.method3551
						    (i_184_ + 2, i_165_,
						     -1912675142)))
				  && i_184_ - i_183_ <= 10);
				 class548_187_
				     = (((Class550) this).aClass552_7112
					.aClass548ArrayArrayArray7169[i]
					[i_184_ + 1][i_165_]))
				i_184_++;
			    int i_189_ = i_186_ - i_185_ + 1;
			    int i_190_
				= ((Class550) this).aClass552_7112
				      .aClass166Array7179
				      [bool ? i_185_ + 1 : i_185_]
				      .method3551(i_183_, i_165_, -1215616239);
			    int i_191_
				= i_190_ + (((Class548) class548).aShort7064
					    * i_189_);
			    int i_192_
				= (((Class550) this).aClass552_7112
				       .aClass166Array7179
				       [bool ? i_185_ + 1 : i_185_].method3551
				   (i_184_ + 1, i_165_, -825894403));
			    int i_193_
				= i_192_ + (((Class548) class548).aShort7064
					    * i_189_);
			    int i_194_
				= i_183_ << (((Class550) this).aClass552_7112
					     .anInt7123) * 1591782305;
			    int i_195_
				= ((i_184_ << (((Class550) this).aClass552_7112
					       .anInt7123) * 1591782305)
				   + (((Class552) (((Class550) this)
						   .aClass552_7112)).anInt7124
				      * -1302211377));
			    int i_196_
				= i_165_ << (((Class550) this).aClass552_7112
					     .anInt7123) * 1591782305;
			    ((Class550) this).aClass553Array7107
				[((Class550) this).anInt7104++]
				= (new Class553
				   (((Class550) this).aClass552_7112, 2,
				    i_186_, i_194_, i_195_, i_195_, i_194_,
				    i_190_, i_192_, i_193_, i_191_,
				    i_196_ + ((Class548) class548).aShort7065,
				    i_196_ + ((Class548) class548).aShort7065,
				    i_196_ + ((Class548) class548).aShort7065,
				    (i_196_
				     + ((Class548) class548).aShort7065)));
			    for (int i_197_ = i_185_; i_197_ <= i_186_;
				 i_197_++) {
				for (int i_198_ = i_183_; i_198_ <= i_184_;
				     i_198_++)
				    ((Class548)
				     (((Class550) this).aClass552_7112
				      .aClass548ArrayArrayArray7169[i_197_]
				      [i_198_][i_165_])).aShort7064
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	((Class550) this).aBool7097 = true;
    }
    
    Class550(Class552 class552) {
	((Class550) this).anInt7094 = 0;
	((Class550) this).aFloatArray7116 = new float[3];
	((Class550) this).anIntArray7117 = new int[2];
	((Class550) this).anInt7118 = -1;
	((Class550) this).anInt7113 = -1;
	((Class550) this).aBool7120 = true;
	((Class550) this).anInt7098
	    = ((Class552) class552).anInt7124 * -1302211377;
	((Class550) this).anInt7099
	    = ((Class552) class552).anInt7124 * -1302211377;
	((Class550) this).aClass552_7112 = class552;
	((Class550) this).aClass553Array7102 = new Class553[524];
	((Class550) this).anInt7101 = 0;
	((Class550) this).aClass553Array7107 = new Class553[2020];
	((Class550) this).anInt7104 = 0;
	((Class550) this).aClass553Array7115 = new Class553[1007];
	((Class550) this).anInt7105 = 0;
	((Class550) this).aClass553Array7108 = new Class553[1029];
	((Class550) this).anInt7094 = 0;
	((Class550) this).anIntArrayArrayArray7100
	    = (new int[((Class550) this).aClass552_7112.anInt7132 * 532429613]
	       [((Class550) this).aClass552_7112.anInt7138 * 120442351 + 1]
	       [((Class550) this).aClass552_7112.anInt7142 * -2069974325 + 1]);
	((Class550) this).aBool7097 = false;
	aBool7090 = true;
	if (aBool7090)
	    ((Class550) this).aClass559_7103 = new Class559(this);
    }
    
    boolean method12064(Class553 class553, int i) {
	if (!method12042(((Class553) class553).anIntArray7196[i],
			 ((Class553) class553).anIntArray7200[i],
			 ((Class553) class553).anIntArray7191[i]))
	    return false;
	((Class553) class553).aShortArray7199[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[0];
	((Class553) class553).aShortArray7190[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[1];
	((Class553) class553).aShortArray7201[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[2];
	return true;
    }
    
    final boolean method12065(int i, int i_199_, int i_200_) {
	aClass103_7110.method2338((float) i, (float) i_199_, (float) i_200_,
				  ((Class550) this).aFloatArray7116);
	if (((Class550) this).aFloatArray7116[2] < 50.0F)
	    return false;
	((Class550) this).aFloatArray7116[0] /= 3.0F;
	((Class550) this).aFloatArray7116[1] /= 3.0F;
	return true;
    }
    
    final boolean method12066(int i, int i_201_, int i_202_, int i_203_,
			      int i_204_, int i_205_, int i_206_, int i_207_,
			      int i_208_) {
	if (!method12042(i, i_201_, i_202_))
	    return false;
	i = (int) ((Class550) this).aFloatArray7116[0];
	i_201_ = (int) ((Class550) this).aFloatArray7116[1];
	i_202_ = (int) ((Class550) this).aFloatArray7116[2];
	if (!method12042(i_203_, i_204_, i_205_))
	    return false;
	i_203_ = (int) ((Class550) this).aFloatArray7116[0];
	i_204_ = (int) ((Class550) this).aFloatArray7116[1];
	i_205_ = (int) ((Class550) this).aFloatArray7116[2];
	if (!method12042(i_206_, i_207_, i_208_))
	    return false;
	i_206_ = (int) ((Class550) this).aFloatArray7116[0];
	i_207_ = (int) ((Class550) this).aFloatArray7116[1];
	i_208_ = (int) ((Class550) this).aFloatArray7116[2];
	return ((Class550) this).aClass559_7103.method12328(i_201_, i_204_,
							    i_207_, i, i_203_,
							    i_206_, i_202_,
							    i_205_, i_208_);
    }
    
    final boolean method12067(int i, int i_209_, int i_210_) {
	aClass103_7110.method2338((float) i, (float) i_209_, (float) i_210_,
				  ((Class550) this).aFloatArray7116);
	if (((Class550) this).aFloatArray7116[2] < 50.0F)
	    return false;
	((Class550) this).aFloatArray7116[0] /= 3.0F;
	((Class550) this).aFloatArray7116[1] /= 3.0F;
	return true;
    }
    
    boolean method12068(int i, int i_211_, int i_212_) {
	if (!aBool7090 || !((Class550) this).aBool7091)
	    return false;
	if (((Class559) ((Class550) this).aClass559_7103).anInt7263 < 102)
	    return false;
	int i_213_
	    = ((Class550) this).anIntArrayArrayArray7100[i][i_211_][i_212_];
	if (i_213_ == -(((Class552) ((Class550) this).aClass552_7112).anInt7164
			* -833909065))
	    return false;
	if (i_213_ == (((Class552) ((Class550) this).aClass552_7112).anInt7164
		       * -833909065))
	    return true;
	if (((Class550) this).aClass552_7112.aClass166Array7184
	    == ((Class550) this).aClass552_7112.aClass166Array7140)
	    return false;
	int i_214_
	    = (i_211_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	int i_215_
	    = (i_212_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	if (method12066(i_214_ + 1,
			((Class550) this).aClass552_7112.aClass166Array7184
			    [i].method3551(i_211_, i_212_, 954769460),
			i_215_ + 1,
			i_214_ + (((Class552) ((Class550) this).aClass552_7112)
				  .anInt7124) * -1302211377 - 1,
			((Class550) this).aClass552_7112.aClass166Array7184
			    [i].method3551(i_211_ + 1, i_212_ + 1, -924810437),
			i_215_ + (((Class552) ((Class550) this).aClass552_7112)
				  .anInt7124) * -1302211377 - 1,
			i_214_ + 1,
			((Class550) this).aClass552_7112.aClass166Array7184
			    [i].method3551(i_211_, i_212_ + 1, 8499908),
			i_215_ + (((Class552) ((Class550) this).aClass552_7112)
				  .anInt7124) * -1302211377 - 1)
	    && (method12066
		(i_214_ + 1,
		 ((Class550) this).aClass552_7112.aClass166Array7184[i]
		     .method3551(i_211_, i_212_, -1958812007),
		 i_215_ + 1,
		 i_214_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377 - 1,
		 ((Class550) this).aClass552_7112.aClass166Array7184[i]
		     .method3551(i_211_ + 1, i_212_, 711302979),
		 i_215_ + 1,
		 i_214_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377 - 1,
		 ((Class550) this).aClass552_7112.aClass166Array7184[i]
		     .method3551(i_211_ + 1, i_212_ + 1, 131632090),
		 i_215_ + (((Class552) ((Class550) this).aClass552_7112)
			   .anInt7124) * -1302211377 - 1))) {
	    ((Class550) this).anIntArrayArrayArray7100[i][i_211_][i_212_]
		= (((Class552) ((Class550) this).aClass552_7112).anInt7164
		   * -833909065);
	    return true;
	}
	((Class550) this).anIntArrayArrayArray7100[i][i_211_][i_212_]
	    = -(((Class552) ((Class550) this).aClass552_7112).anInt7164
		* -833909065);
	return false;
    }
    
    public void method12069() {
	method12037();
    }
    
    boolean method12070(int i, int i_216_, int i_217_, int i_218_) {
	if (!aBool7090 || !((Class550) this).aBool7091)
	    return false;
	if (((Class559) ((Class550) this).aClass559_7103).anInt7263 < 102)
	    return false;
	if (!method12043(i, i_216_, i_217_))
	    return false;
	int i_219_
	    = (i_216_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	int i_220_
	    = (i_217_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	if (method12048(i_219_,
			((Class550) this).aClass552_7112.aClass166Array7184
			    [i].method3551(i_216_, i_217_, -627052622),
			i_220_,
			(((Class552) ((Class550) this).aClass552_7112)
			 .anInt7124) * -1302211377,
			i_218_,
			(((Class552) ((Class550) this).aClass552_7112)
			 .anInt7124) * -1302211377))
	    return true;
	return false;
    }
    
    boolean method12071(int i, int i_221_, int i_222_, int i_223_) {
	if (!aBool7090 || !((Class550) this).aBool7091)
	    return false;
	if (((Class559) ((Class550) this).aClass559_7103).anInt7263 < 102)
	    return false;
	if (!method12043(i, i_221_, i_222_))
	    return false;
	int i_224_
	    = (i_221_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	int i_225_
	    = (i_222_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	if (method12048(i_224_,
			((Class550) this).aClass552_7112.aClass166Array7184
			    [i].method3551(i_221_, i_222_, -513296178),
			i_225_,
			(((Class552) ((Class550) this).aClass552_7112)
			 .anInt7124) * -1302211377,
			i_223_,
			(((Class552) ((Class550) this).aClass552_7112)
			 .anInt7124) * -1302211377))
	    return true;
	return false;
    }
    
    boolean method12072(int i, int i_226_, int i_227_, int i_228_) {
	if (!aBool7090 || !((Class550) this).aBool7091)
	    return false;
	if (((Class559) ((Class550) this).aClass559_7103).anInt7263 < 102)
	    return false;
	if (!method12043(i, i_226_, i_227_))
	    return false;
	int i_229_
	    = (i_226_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	int i_230_
	    = (i_227_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	if (method12048(i_229_,
			((Class550) this).aClass552_7112.aClass166Array7184
			    [i].method3551(i_226_, i_227_, -656061979),
			i_230_,
			(((Class552) ((Class550) this).aClass552_7112)
			 .anInt7124) * -1302211377,
			i_228_,
			(((Class552) ((Class550) this).aClass552_7112)
			 .anInt7124) * -1302211377))
	    return true;
	return false;
    }
    
    final boolean method12073(int i, int i_231_, int i_232_, int i_233_,
			      int i_234_, int i_235_, int i_236_, int i_237_,
			      int i_238_) {
	if (!method12042(i, i_231_, i_232_))
	    return false;
	i = (int) ((Class550) this).aFloatArray7116[0];
	i_231_ = (int) ((Class550) this).aFloatArray7116[1];
	i_232_ = (int) ((Class550) this).aFloatArray7116[2];
	if (!method12042(i_233_, i_234_, i_235_))
	    return false;
	i_233_ = (int) ((Class550) this).aFloatArray7116[0];
	i_234_ = (int) ((Class550) this).aFloatArray7116[1];
	i_235_ = (int) ((Class550) this).aFloatArray7116[2];
	if (!method12042(i_236_, i_237_, i_238_))
	    return false;
	i_236_ = (int) ((Class550) this).aFloatArray7116[0];
	i_237_ = (int) ((Class550) this).aFloatArray7116[1];
	i_238_ = (int) ((Class550) this).aFloatArray7116[2];
	return ((Class550) this).aClass559_7103.method12328(i_231_, i_234_,
							    i_237_, i, i_233_,
							    i_236_, i_232_,
							    i_235_, i_238_);
    }
    
    boolean method12074(int i, int i_239_, int i_240_, int i_241_, int i_242_,
			Class535 class535) {
	if (!aBool7090 || !((Class550) this).aBool7091)
	    return false;
	if (((Class559) ((Class550) this).aClass559_7103).anInt7263 < 102)
	    return false;
	if (i_239_ < 0 || i_241_ < 0
	    || i_240_ >= ((Class550) this).anIntArrayArrayArray7100[i].length
	    || i_242_ >= (((Class550) this).anIntArrayArrayArray7100[i]
			  [i_239_]).length)
	    return false;
	if (i_239_ == i_240_ && i_241_ == i_242_) {
	    if (!method12043(i, i_239_, i_241_))
		return false;
	    if (method12050(class535))
		return true;
	    return false;
	}
	for (int i_243_ = i_239_; i_243_ <= i_240_; i_243_++) {
	    for (int i_244_ = i_241_; i_244_ <= i_242_; i_244_++) {
		if ((((Class550) this).anIntArrayArrayArray7100[i][i_243_]
		     [i_244_])
		    == -((((Class552) ((Class550) this).aClass552_7112)
			  .anInt7164)
			 * -833909065))
		    return false;
	    }
	}
	if (!method12050(class535))
	    return false;
	return true;
    }
    
    boolean method12075(Class475_Sub1_Sub3 class475_sub1_sub3, int i,
			int i_245_, int i_246_) {
	if (!aBool7090 || !((Class550) this).aBool7091)
	    return false;
	if (((Class559) ((Class550) this).aClass559_7103).anInt7263 < 102)
	    return false;
	if (!method12043(i, i_245_, i_246_))
	    return false;
	int i_247_
	    = (i_245_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	int i_248_
	    = (i_246_
	       << ((Class550) this).aClass552_7112.anInt7123 * 1591782305);
	int i_249_ = (((Class550) this).aClass552_7112.aClass166Array7184
			  [i].method3551(i_245_, i_246_, -143580192)
		      - 1);
	int i_250_ = i_249_ + class475_sub1_sub3.method14468((byte) 66);
	if (class475_sub1_sub3.aShort10724 == 1) {
	    if (!method12066(i_247_, i_249_, i_248_, i_247_, i_250_, i_248_,
			     i_247_, i_250_,
			     (i_248_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377)))
		return false;
	    if (!method12066(i_247_, i_249_, i_248_, i_247_, i_250_,
			     (i_248_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377),
			     i_247_, i_249_,
			     (i_248_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377)))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 2) {
	    if (!method12066
		 (i_247_, i_249_,
		  i_248_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_247_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_250_,
		  i_248_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_247_, i_250_,
		  i_248_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377))
		return false;
	    if (!method12066
		 (i_247_, i_249_,
		  i_248_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_247_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_249_,
		  i_248_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_247_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_250_,
		  i_248_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 4) {
	    if (!method12066
		 (i_247_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_249_, i_248_,
		  i_247_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_250_, i_248_,
		  i_247_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_250_,
		  i_248_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377))
		return false;
	    if (!method12066
		 (i_247_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_249_, i_248_,
		  i_247_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_250_,
		  i_248_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_247_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377,
		  i_249_,
		  i_248_ + (((Class552) ((Class550) this).aClass552_7112)
			    .anInt7124) * -1302211377))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 8) {
	    if (!method12066(i_247_, i_249_, i_248_,
			     (i_247_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377),
			     i_250_, i_248_, i_247_, i_250_, i_248_))
		return false;
	    if (!method12066(i_247_, i_249_, i_248_,
			     (i_247_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377),
			     i_249_, i_248_,
			     (i_247_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7124) * -1302211377),
			     i_250_, i_248_))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 16) {
	    if (!method12048(i_247_, i_249_,
			     (i_248_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7141) * -558976661),
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661,
			     i_250_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 32) {
	    if (!method12048((i_247_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7141) * -558976661),
			     i_249_,
			     (i_248_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7141) * -558976661),
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661,
			     i_250_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 64) {
	    if (!method12048((i_247_
			      + (((Class552) ((Class550) this).aClass552_7112)
				 .anInt7141) * -558976661),
			     i_249_, i_248_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661,
			     i_250_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661))
		return false;
	    return true;
	}
	if (class475_sub1_sub3.aShort10724 == 128) {
	    if (!method12048(i_247_, i_249_, i_248_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661,
			     i_250_,
			     (((Class552) ((Class550) this).aClass552_7112)
			      .anInt7141) * -558976661))
		return false;
	    return true;
	}
	return true;
    }
    
    boolean method12076(Class553 class553, int i) {
	if (!method12042(((Class553) class553).anIntArray7196[i],
			 ((Class553) class553).anIntArray7200[i],
			 ((Class553) class553).anIntArray7191[i]))
	    return false;
	((Class553) class553).aShortArray7199[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[0];
	((Class553) class553).aShortArray7190[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[1];
	((Class553) class553).aShortArray7201[i]
	    = (short) (int) ((Class550) this).aFloatArray7116[2];
	return true;
    }
    
    void method12077(Class103 class103, int i) {
	aClass103_7110 = class103;
	if (!aBool7090 || !((Class550) this).aBool7091)
	    ((Class550) this).anInt7094 = 0;
	else {
	    if (((Class550) this).aBool7120)
		((Class552) ((Class550) this).aClass552_7112)
		    .aClass402_7182.method7188((byte) 90);
	    aClass103_7110.method2236(((Class550) this).anIntArray7117);
	    if ((((Class550) this).anInt7118
		 != (int) ((float) ((Class550) this).anIntArray7117[0] / 3.0F))
		|| (((Class550) this).anInt7113
		    != (int) ((float) ((Class550) this).anIntArray7117[1]
			      / 3.0F))) {
		((Class550) this).anInt7118
		    = (int) ((float) ((Class550) this).anIntArray7117[0]
			     / 3.0F);
		((Class550) this).anInt7113
		    = (int) ((float) ((Class550) this).anIntArray7117[1]
			     / 3.0F);
		((Class550) this).anIntArray7114
		    = new int[(((Class550) this).anInt7118
			       * ((Class550) this).anInt7113)];
	    }
	    ((Class550) this).anInt7094 = 0;
	    for (int i_251_ = 0; i_251_ < ((Class550) this).anInt7101;
		 i_251_++)
		method12040(aClass103_7110,
			    ((Class550) this).aClass553Array7102[i_251_], i);
	    for (int i_252_ = 0; i_252_ < ((Class550) this).anInt7104;
		 i_252_++)
		method12040(aClass103_7110,
			    ((Class550) this).aClass553Array7107[i_252_], i);
	    for (int i_253_ = 0; i_253_ < ((Class550) this).anInt7105;
		 i_253_++)
		method12040(aClass103_7110,
			    ((Class550) this).aClass553Array7115[i_253_], i);
	    ((Class559) ((Class550) this).aClass559_7103).anInt7263 = 0;
	    if (((Class550) this).anInt7094 > 0) {
		int i_254_ = ((Class550) this).anIntArray7114.length;
		int i_255_ = i_254_ - i_254_ & 0x7;
		int i_256_ = 0;
		while (i_256_ < i_255_) {
		    ((Class550) this).anIntArray7114[i_256_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_256_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_256_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_256_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_256_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_256_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_256_++] = 2147483647;
		    ((Class550) this).anIntArray7114[i_256_++] = 2147483647;
		}
		while (i_256_ < i_254_)
		    ((Class550) this).anIntArray7114[i_256_++] = 2147483647;
		((Class559) ((Class550) this).aClass559_7103).anInt7268 = 1;
		for (int i_257_ = 0; i_257_ < ((Class550) this).anInt7094;
		     i_257_++) {
		    Class553 class553
			= ((Class550) this).aClass553Array7108[i_257_];
		    ((Class550) this).aClass559_7103.method12328
			(((Class553) class553).aShortArray7190[0],
			 ((Class553) class553).aShortArray7190[1],
			 ((Class553) class553).aShortArray7190[3],
			 ((Class553) class553).aShortArray7199[0],
			 ((Class553) class553).aShortArray7199[1],
			 ((Class553) class553).aShortArray7199[3],
			 ((Class553) class553).aShortArray7201[0],
			 ((Class553) class553).aShortArray7201[1],
			 ((Class553) class553).aShortArray7201[3]);
		    ((Class550) this).aClass559_7103.method12328
			(((Class553) class553).aShortArray7190[1],
			 ((Class553) class553).aShortArray7190[2],
			 ((Class553) class553).aShortArray7190[3],
			 ((Class553) class553).aShortArray7199[1],
			 ((Class553) class553).aShortArray7199[2],
			 ((Class553) class553).aShortArray7199[3],
			 ((Class553) class553).aShortArray7201[1],
			 ((Class553) class553).aShortArray7201[2],
			 ((Class553) class553).aShortArray7201[3]);
		}
		((Class559) ((Class550) this).aClass559_7103).anInt7268 = 2;
	    }
	    if (((Class550) this).aBool7120)
		((Class552) ((Class550) this).aClass552_7112)
		    .aClass402_7182.method7188((byte) 10);
	}
    }
    
    final boolean method12078(int i, int i_258_, int i_259_, int i_260_,
			      int i_261_, int i_262_) {
	int i_263_ = i + i_260_;
	int i_264_ = i_258_ + i_261_;
	int i_265_ = i_259_ + i_262_;
	if (!method12066(i, i_264_, i_259_, i_263_, i_264_, i_265_, i, i_264_,
			 i_265_))
	    return false;
	if (!method12066(i, i_264_, i_259_, i_263_, i_264_, i_259_, i_263_,
			 i_264_, i_265_))
	    return false;
	if (i < (((Class552) ((Class550) this).aClass552_7112).anInt7153
		 * 1475282513)) {
	    if (!method12066(i, i_258_, i_265_, i, i_264_, i_259_, i, i_264_,
			     i_265_))
		return false;
	    if (!method12066(i, i_258_, i_265_, i, i_258_, i_259_, i, i_264_,
			     i_259_))
		return false;
	} else {
	    if (!method12066(i_263_, i_258_, i_265_, i_263_, i_264_, i_259_,
			     i_263_, i_264_, i_265_))
		return false;
	    if (!method12066(i_263_, i_258_, i_265_, i_263_, i_258_, i_259_,
			     i_263_, i_264_, i_259_))
		return false;
	}
	if (i_259_ < (((Class552) ((Class550) this).aClass552_7112).anInt7162
		      * 683928855)) {
	    if (!method12066(i, i_258_, i_259_, i_263_, i_264_, i_259_, i,
			     i_264_, i_259_))
		return false;
	    if (!method12066(i, i_258_, i_259_, i_263_, i_258_, i_259_, i_263_,
			     i_264_, i_259_))
		return false;
	} else {
	    if (!method12066(i, i_258_, i_265_, i_263_, i_264_, i_265_, i,
			     i_264_, i_265_))
		return false;
	    if (!method12066(i, i_258_, i_265_, i_263_, i_258_, i_265_, i_263_,
			     i_264_, i_265_))
		return false;
	}
	return true;
    }
    
    final boolean method12079(Class535 class535) {
	if (class535 == null)
	    return false;
	return method12048(((Class535) class535).anInt6980,
			   ((Class535) class535).anInt6982,
			   ((Class535) class535).anInt6978,
			   (((Class535) class535).anInt6981
			    - ((Class535) class535).anInt6980),
			   (((Class535) class535).anInt6979
			    - ((Class535) class535).anInt6982),
			   (((Class535) class535).anInt6984
			    - ((Class535) class535).anInt6978));
    }
}
