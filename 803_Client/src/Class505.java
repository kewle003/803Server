/* Class505 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class505
{
    Class503 aClass503_6635;
    int anInt6636;
    Class325 aClass325_6637;
    int anInt6638;
    Class421 aClass421_6639;
    int anInt6640;
    long aLong6641;
    boolean aBool6642;
    Class489 aClass489_6643;
    Class503 aClass503_6644;
    boolean aBool6645;
    int anInt6646;
    int anInt6647 = 0;
    int anInt6648;
    int anInt6649;
    int anInt6650;
    int anInt6651;
    boolean aBool6652;
    Class106 aClass106_6653;
    static File cacheLocator;//aFile6654
    public static JS5 DLLS_ARCHIVE;//aClass210_6655
    
    void method11468(Class103 class103, long l, int i, boolean bool) {
	if (((Class505) this).aBool6642)
	    bool = false;
	else if (275753719 * Class487.anInt6480
		 < 815444107 * ((Class505) this).aClass325_6637.anInt4968)
	    bool = false;
	else if (1676131937 * Class487.anInt6477
		 > Class90.anIntArray1311[275753719 * Class487.anInt6480])
	    bool = false;
	else if (((Class505) this).aBool6652)
	    bool = false;
	else if (1809874433 * ((Class505) this).aClass325_6637.anInt4967
		 != -1) {
	    int i_0_
		= (int) (l
			 - 895246674369456091L * ((Class505) this).aLong6641);
	    if (!((Class505) this).aClass325_6637.aBool4965
		&& (i_0_
		    > 1809874433 * ((Class505) this).aClass325_6637.anInt4967))
		bool = false;
	    else
		i_0_
		    %= ((Class505) this).aClass325_6637.anInt4967 * 1809874433;
	    if (!((Class505) this).aClass325_6637.aBool4964
		&& i_0_ < (-1523198763
			   * ((Class505) this).aClass325_6637.anInt4966))
		bool = false;
	    if (((Class505) this).aClass325_6637.aBool4964
		&& i_0_ >= (-1523198763
			    * ((Class505) this).aClass325_6637.anInt4966))
		bool = false;
	}
	((Class505) this).anInt6648 = 0;
	for (Class247_Sub1_Sub1_Sub1 class247_sub1_sub1_sub1
		 = ((Class247_Sub1_Sub1_Sub1)
		    ((Class505) this).aClass421_6639.method7525(-163177866));
	     null != class247_sub1_sub1_sub1;
	     class247_sub1_sub1_sub1
		 = (Class247_Sub1_Sub1_Sub1) ((Class505) this)
						 .aClass421_6639
						 .method7526(-1063075187)) {
	    class247_sub1_sub1_sub1.method17648(l, i);
	    ((Class505) this).anInt6648 += -1599596327;
	}
	if (bool) {
	    int i_1_
		= (((((Class503) ((Class505) this).aClass503_6635).anInt6614
		     * -1709083431)
		    + (878777913 * ((Class503)
				    ((Class505) this).aClass503_6635).anInt6617
		       + 701732807 * ((Class503) (((Class505) this)
						  .aClass503_6635)).anInt6616))
		   / 3);
	    int i_2_
		= (((1531456601
		     * ((Class503) ((Class505) this).aClass503_6635).anInt6621)
		    + ((((Class503) ((Class505) this).aClass503_6635).anInt6618
			* 709188769)
		       + (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6615) * -601488629))
		   / 3);
	    int i_3_
		= (((((Class503) ((Class505) this).aClass503_6635).anInt6622
		     * -1488927469)
		    + ((((Class503) ((Class505) this).aClass503_6635).anInt6623
			* -1056430591)
		       + (-1576695729
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6624))))
		   / 3);
	    if (1184628225 * (((Class503) ((Class505) this).aClass503_6635)
			      .anInt6620) != i_1_
		|| (((Class503) ((Class505) this).aClass503_6635).anInt6619
		    * -1194700497) != i_2_
		|| (((Class503) ((Class505) this).aClass503_6635).anInt6625
		    * -1125838207) != i_3_
		|| !((Class505) this).aBool6645) {
		((Class503) ((Class505) this).aClass503_6635).anInt6620
		    = i_1_ * 1365770753;
		((Class503) ((Class505) this).aClass503_6635).anInt6619
		    = 89691599 * i_2_;
		((Class503) ((Class505) this).aClass503_6635).anInt6625
		    = i_3_ * -237949567;
		int i_4_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6617
			* 878777913)
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6616) * 701732807);
		int i_5_
		    = (709188769 * ((Class503)
				    ((Class505) this).aClass503_6635).anInt6618
		       - (-601488629
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6615)));
		int i_6_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6624
			* -1576695729)
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6623) * -1056430591);
		int i_7_
		    = (-1709083431 * ((Class503) (((Class505) this)
						  .aClass503_6635)).anInt6614
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6616) * 701732807);
		int i_8_
		    = (1531456601 * ((Class503) (((Class505) this)
						 .aClass503_6635)).anInt6621
		       - (-601488629
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6615)));
		int i_9_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6622
			* -1488927469)
		       - (-1056430591
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6623)));
		((Class505) this).anInt6638
		    = 75958031 * (i_5_ * i_9_ - i_8_ * i_6_);
		((Class505) this).anInt6646
		    = -718452939 * (i_7_ * i_6_ - i_4_ * i_9_);
		for (((Class505) this).anInt6636
			 = (i_4_ * i_8_ - i_5_ * i_7_) * 39655331;
		     (((Class505) this).anInt6638 * -1756297233 > 32767
		      || 1543377693 * ((Class505) this).anInt6646 > 32767
		      || 581948427 * ((Class505) this).anInt6636 > 32767
		      || ((Class505) this).anInt6638 * -1756297233 < -32767
		      || 1543377693 * ((Class505) this).anInt6646 < -32767
		      || ((Class505) this).anInt6636 * 581948427 < -32767);
		     ((Class505) this).anInt6636
			 = 39655331 * (((Class505) this).anInt6636 * 581948427
				       >> 1)) {
		    ((Class505) this).anInt6638
			= 75958031 * (-1756297233 * ((Class505) this).anInt6638
				      >> 1);
		    ((Class505) this).anInt6646
			= (-718452939
			   * (((Class505) this).anInt6646 * 1543377693 >> 1));
		}
		int i_10_
		    = (int) (Math.sqrt
			     ((double) ((((Class505) this).anInt6636
					 * 581948427
					 * (581948427
					    * ((Class505) this).anInt6636))
					+ ((-1756297233
					    * ((Class505) this).anInt6638
					    * (((Class505) this).anInt6638
					       * -1756297233))
					   + (((Class505) this).anInt6646
					      * 1543377693
					      * (1543377693
						 * (((Class505) this)
						    .anInt6646)))))));
		if (i_10_ <= 0)
		    i_10_ = 1;
		((Class505) this).anInt6638
		    = (-324634607 * ((Class505) this).anInt6638 / i_10_
		       * 75958031);
		((Class505) this).anInt6646
		    = (((Class505) this).anInt6646 * -1383043869 / i_10_
		       * -718452939);
		((Class505) this).anInt6636
		    = 39655331 * (-950686731 * ((Class505) this).anInt6636
				  / i_10_);
		if (((Class505) this).aClass325_6637.aShort4986 > 0
		    || ((Class505) this).aClass325_6637.aShort4934 > 0) {
		    int i_11_ = (int) (Math.atan2((double) ((((Class505) this)
							     .anInt6636)
							    * 581948427),
						  (double) ((((Class505) this)
							     .anInt6638)
							    * -1756297233))
				       * 2607.5945876176133);
		    int i_12_
			= (int) ((Math.atan2
				  ((double) (((Class505) this).anInt6646
					     * 1543377693),
				   Math.sqrt((double) ((-1756297233
							* (((Class505) this)
							   .anInt6638)
							* (-1756297233
							   * (((Class505) this)
							      .anInt6638)))
						       + ((((Class505) this)
							   .anInt6636)
							  * 581948427
							  * ((((Class505) this)
							      .anInt6636)
							     * 581948427))))))
				 * 2607.5945876176133);
		    ((Class505) this).anInt6649
			= (-1977864375
			   * (((Class505) this).aClass325_6637.aShort4986
			      - ((Class505) this).aClass325_6637.aShort4951));
		    ((Class505) this).anInt6640
			= (-617520941
			   * (i_11_
			      + ((Class505) this).aClass325_6637.aShort4951
			      - (1338766073 * ((Class505) this).anInt6649
				 >> 1)));
		    ((Class505) this).anInt6651
			= ((((Class505) this).aClass325_6637.aShort4934
			    - ((Class505) this).aClass325_6637.aShort4933)
			   * -1586566881);
		    ((Class505) this).anInt6650
			= ((((Class505) this).aClass325_6637.aShort4933 + i_12_
			    - (1147753183 * ((Class505) this).anInt6651 >> 1))
			   * 2033137971);
		}
		((Class505) this).aBool6645 = true;
	    }
	    ((Class505) this).anInt6647
		+= ((int) ((double) i
			   * ((double) (1587926389
					* (((Class505) this).aClass325_6637
					   .anInt4984))
			      + (Math.random()
				 * (double) (546242917 * (((Class505) this)
							  .aClass325_6637
							  .anInt4971)
					     - 1587926389 * (((Class505) this)
							     .aClass325_6637
							     .anInt4984)))))
		    * 547694693);
	    if (((Class505) this).anInt6647 * 796215661 > 63) {
		int i_13_ = ((Class505) this).anInt6647 * 796215661 >> 6;
		((Class505) this).anInt6647
		    = ((796215661 * ((Class505) this).anInt6647 & 0x3f)
		       * 547694693);
		int i_14_ = (i << 8) / i_13_;
		int i_15_ = 0;
		int i_16_ = 0;
		while (i_16_ < i_13_) {
		    int i_17_;
		    int i_18_;
		    int i_19_;
		    if (((Class505) this).aClass325_6637.aShort4986 > 0
			|| ((Class505) this).aClass325_6637.aShort4934 > 0) {
			int i_20_
			    = (((Class505) this).anInt6640 * -293734565
			       + (int) ((double) (((Class505) this).anInt6649
						  * 1338766073)
					* Math.random()));
			i_20_ &= 0x3fff;
			int i_21_ = Class282.anIntArray4430[i_20_];
			int i_22_ = Class282.anIntArray4441[i_20_];
			int i_23_
			    = (818899451 * ((Class505) this).anInt6650
			       + (int) ((double) (((Class505) this).anInt6651
						  * 1147753183)
					* Math.random()));
			i_23_ &= 0x1fff;
			int i_24_ = Class282.anIntArray4430[i_23_];
			int i_25_ = Class282.anIntArray4441[i_23_];
			int i_26_ = 13;
			i_17_ = i_24_ * i_22_ >> i_26_;
			i_18_ = (i_25_ << 1) * -1;
			i_19_ = i_24_ * i_21_ >> i_26_;
		    } else {
			i_17_ = -1756297233 * ((Class505) this).anInt6638;
			i_18_ = 1543377693 * ((Class505) this).anInt6646;
			i_19_ = ((Class505) this).anInt6636 * 581948427;
		    }
		    float f = (float) Math.random();
		    float f_27_ = (float) Math.random();
		    if (f + f_27_ > 1.0F) {
			f = 1.0F - f;
			f_27_ = 1.0F - f_27_;
		    }
		    float f_28_ = 1.0F - (f + f_27_);
		    int i_29_
			= (int) (f * (float) (701732807
					      * (((Class503) (((Class505) this)
							      .aClass503_6635))
						 .anInt6616))
				 + (float) (878777913
					    * (((Class503) (((Class505) this)
							    .aClass503_6635))
					       .anInt6617)) * f_27_
				 + f_28_ * (float) (-1709083431
						    * (((Class503)
							(((Class505) this)
							 .aClass503_6635))
						       .anInt6614)));
		    int i_30_
			= (int) ((float) ((((Class503)
					    ((Class505) this).aClass503_6635)
					   .anInt6621)
					  * 1531456601) * f_28_
				 + ((float) ((((Class503) (((Class505) this)
							   .aClass503_6635))
					      .anInt6618)
					     * 709188769) * f_27_
				    + (float) ((((Class503) (((Class505) this)
							     .aClass503_6635))
						.anInt6615)
					       * -601488629) * f));
		    int i_31_
			= (int) ((float) (-1488927469
					  * (((Class503)
					      ((Class505) this).aClass503_6635)
					     .anInt6622)) * f_28_
				 + (f_27_ * (float) (-1576695729
						     * (((Class503)
							 (((Class505) this)
							  .aClass503_6635))
							.anInt6624))
				    + (float) (-1056430591
					       * (((Class503)
						   (((Class505) this)
						    .aClass503_6635))
						  .anInt6623)) * f));
		    int i_32_
			= ((1333858919
			    * ((Class505) this).aClass325_6637.anInt4935)
			   + (int) (Math.random()
				    * (double) (1086546799 * (((Class505) this)
							      .aClass325_6637
							      .anInt4936)
						- (1333858919
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4935)))));
		    int i_33_
			= ((103375735
			    * ((Class505) this).aClass325_6637.anInt4993)
			   + (int) (Math.random()
				    * (double) (680609465 * (((Class505) this)
							     .aClass325_6637
							     .anInt4978)
						- (103375735
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4993)))));
		    int i_34_
			= ((-45955699
			    * ((Class505) this).aClass325_6637.anInt4941)
			   + (int) (Math.random()
				    * (double) (((((Class505) this)
						  .aClass325_6637.anInt4957)
						 * -1248350419)
						- (-45955699
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4941)))));
		    int i_35_ = (((Class505) this).aClass325_6637.anInt4955
				 * 1307392903);
		    if (0 != (292885605
			      * ((Class505) this).aClass325_6637.anInt5004)) {
			if ((-1757377113
			     * ((Class505) this).aClass325_6637.anInt4926)
			    == 0)
			    i_35_
				+= (int) (Math.random()
					  * (double) (1 + (292885605
							   * (((Class505) this)
							      .aClass325_6637
							      .anInt5004))));
			else
			    i_35_ += ((int) (Math.random()
					     * (double) (((((Class505) this)
							   .aClass325_6637
							   .anInt4926)
							  * -1757377113)
							 + 1))
				      * ((((Class505) this).aClass325_6637
					  .anInt5004)
					 * 292885605
					 / (-1757377113
					    * (((Class505) this).aClass325_6637
					       .anInt4926))));
		    }
		    int i_36_ = (((Class505) this).aClass325_6637.anInt4960
				 * -335502761);
		    if (0 != (391077559
			      * ((Class505) this).aClass325_6637.anInt5005))
			i_36_ += (int) (Math.random()
					* (double) ((((Class505) this)
						     .aClass325_6637
						     .anInt5005) * 391077559
						    + 1));
		    int i_37_;
		    if (((Class505) this).aClass325_6637.aBool4947) {
			double d = Math.random();
			i_37_
			    = ((int) ((double) (2039894325
						* (((Class505) this)
						   .aClass325_6637.anInt4945))
				      + (double) (1368691389
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4962)) * d) << 16
			       | (int) ((double) (771755579
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4974)) * d
					+ (double) (-642843419
						    * (((Class505) this)
						       .aClass325_6637
						       .anInt4985))) << 8
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4988)
						  * 1695964871)
					+ (double) (-1857521795
						    * (((Class505) this)
						       .aClass325_6637
						       .anInt4930)) * d)
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4991)
						  * -1837898999)
					+ (Math.random()
					   * (double) ((((Class505) this)
							.aClass325_6637
							.anInt4953)
						       * 1077870337))) << 24);
		    } else
			i_37_
			    = ((int) ((double) (2039894325
						* (((Class505) this)
						   .aClass325_6637.anInt4945))
				      + (Math.random()
					 * (double) ((((Class505) this)
						      .aClass325_6637
						      .anInt4962)
						     * 1368691389))) << 16
			       | (int) ((double) (-642843419
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4985))
					+ (Math.random()
					   * (double) (771755579
						       * (((Class505) this)
							  .aClass325_6637
							  .anInt4974)))) << 8
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4988)
						  * 1695964871)
					+ (Math.random()
					   * (double) (-1857521795
						       * (((Class505) this)
							  .aClass325_6637
							  .anInt4930))))
			       | ((int) ((double) ((((Class505) this)
						    .aClass325_6637.anInt4991)
						   * -1837898999)
					 + (Math.random()
					    * (double) (1077870337
							* (((Class505) this)
							   .aClass325_6637
							   .anInt4953))))
				  << 24));
		    int i_38_ = (-1474701413
				 * ((Class505) this).aClass325_6637.anInt4931);
		    if (!class103.method2232()
			&& !((Class505) this).aClass325_6637.aBool4976)
			i_38_ = -1;
		    Class247_Sub1_Sub1_Sub1 class247_sub1_sub1_sub1;
		    if (1435230355 * Class487.anInt6473
			!= Class487.anInt6476 * 1515285899) {
			class247_sub1_sub1_sub1
			    = (Class487.aClass247_Sub1_Sub1_Sub1Array6478
			       [Class487.anInt6476 * 1515285899]);
			Class487.anInt6476
			    = (-1790520797
			       * (1 + 1515285899 * Class487.anInt6476
				  & 0x3ff));
			class247_sub1_sub1_sub1.method17646
			    (this, i_29_, i_30_, i_31_, i_17_, i_18_, i_19_,
			     i_32_, i_33_, i_37_, i_34_, i_35_, i_36_, i_38_,
			     ((Class505) this).aClass325_6637.aBool4969,
			     ((Class505) this).aClass325_6637.aBool4977);
		    } else
			class247_sub1_sub1_sub1
			    = (new Class247_Sub1_Sub1_Sub1
			       (this, i_29_, i_30_, i_31_, i_17_, i_18_, i_19_,
				i_32_, i_33_, i_37_, i_34_, i_35_, i_36_,
				i_38_,
				((Class505) this).aClass325_6637.aBool4969,
				((Class505) this).aClass325_6637.aBool4977));
		    if (i_15_ > 256)
			class247_sub1_sub1_sub1.method17648(l, i_15_ >> 8);
		    ((Class505) this).anInt6648 += -1599596327;
		    i_16_++;
		    i_15_ += i_14_;
		}
	    }
	}
	if (!((Class505) this).aClass503_6635
		 .method11460(((Class505) this).aClass503_6644, (byte) 96)) {
	    Class503 class503 = ((Class505) this).aClass503_6644;
	    ((Class505) this).aClass503_6644
		= ((Class505) this).aClass503_6635;
	    ((Class505) this).aClass503_6635 = class503;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6616
		= ((Class505) this).aClass106_6653.anInt1487 * 48887857;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6615
		= ((Class505) this).aClass106_6653.anInt1495 * -1532379311;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6623
		= ((Class505) this).aClass106_6653.anInt1498 * -1284816513;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6617
		= ((Class505) this).aClass106_6653.anInt1497 * 188797131;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6618
		= -1886219871 * ((Class505) this).aClass106_6653.anInt1496;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6624
		= ((Class505) this).aClass106_6653.anInt1499 * -358561697;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6614
		= ((Class505) this).aClass106_6653.anInt1500 * 264343231;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6621
		= ((Class505) this).aClass106_6653.anInt1501 * 373068629;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6622
		= ((Class505) this).aClass106_6653.anInt1502 * -996355931;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6620
		= 1 * ((Class503) ((Class505) this).aClass503_6644).anInt6620;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6619
		= 1 * ((Class503) ((Class505) this).aClass503_6644).anInt6619;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6625
		= ((Class503) ((Class505) this).aClass503_6644).anInt6625 * 1;
	}
	Class487.anInt6470 += ((Class505) this).anInt6648 * 592196213;
    }
    
    void method11469() {
	((Class503) ((Class505) this).aClass503_6635).anInt6616
	    = 48887857 * ((Class505) this).aClass106_6653.anInt1487;
	((Class503) ((Class505) this).aClass503_6635).anInt6615
	    = ((Class505) this).aClass106_6653.anInt1495 * -1532379311;
	((Class503) ((Class505) this).aClass503_6635).anInt6623
	    = ((Class505) this).aClass106_6653.anInt1498 * -1284816513;
	((Class503) ((Class505) this).aClass503_6635).anInt6617
	    = 188797131 * ((Class505) this).aClass106_6653.anInt1497;
	((Class503) ((Class505) this).aClass503_6635).anInt6618
	    = ((Class505) this).aClass106_6653.anInt1496 * -1886219871;
	((Class503) ((Class505) this).aClass503_6635).anInt6624
	    = ((Class505) this).aClass106_6653.anInt1499 * -358561697;
	((Class503) ((Class505) this).aClass503_6635).anInt6614
	    = ((Class505) this).aClass106_6653.anInt1500 * 264343231;
	((Class503) ((Class505) this).aClass503_6635).anInt6621
	    = ((Class505) this).aClass106_6653.anInt1501 * 373068629;
	((Class503) ((Class505) this).aClass503_6635).anInt6622
	    = -996355931 * ((Class505) this).aClass106_6653.anInt1502;
	if (((((Class503) ((Class505) this).aClass503_6635).anInt6616
	      * 701732807)
	     == (878777913
		 * ((Class503) ((Class505) this).aClass503_6635).anInt6617))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6614
		 * -1709083431)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6617
		    * 878777913))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6615
		 * -601488629)
		== (709188769
		    * ((Class503) ((Class505) this).aClass503_6635).anInt6618))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6621
		 * 1531456601)
		== (709188769
		    * ((Class503) ((Class505) this).aClass503_6635).anInt6618))
	    && ((-1576695729
		 * ((Class503) ((Class505) this).aClass503_6635).anInt6624)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6623
		    * -1056430591))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6622
		 * -1488927469)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6624
		    * -1576695729)))
	    ((Class505) this).aBool6652 = true;
	else if (((Class505) this).aBool6652) {
	    ((Class505) this).aBool6652 = false;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6616
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6616;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6615
		= ((Class503) ((Class505) this).aClass503_6635).anInt6615 * 1;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6623
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6623;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6617
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6617;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6618
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6618;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6624
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6624;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6614
		= ((Class503) ((Class505) this).aClass503_6635).anInt6614 * 1;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6621
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6621;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6622
		= ((Class503) ((Class505) this).aClass503_6635).anInt6622 * 1;
	}
    }
    
    void method11470(Class103 class103, long l, int i, boolean bool,
		     int i_39_) {
	if (((Class505) this).aBool6642)
	    bool = false;
	else if (275753719 * Class487.anInt6480
		 < 815444107 * ((Class505) this).aClass325_6637.anInt4968)
	    bool = false;
	else if (1676131937 * Class487.anInt6477
		 > Class90.anIntArray1311[275753719 * Class487.anInt6480])
	    bool = false;
	else if (((Class505) this).aBool6652)
	    bool = false;
	else if (1809874433 * ((Class505) this).aClass325_6637.anInt4967
		 != -1) {
	    int i_40_
		= (int) (l
			 - 895246674369456091L * ((Class505) this).aLong6641);
	    if (!((Class505) this).aClass325_6637.aBool4965
		&& (i_40_
		    > 1809874433 * ((Class505) this).aClass325_6637.anInt4967))
		bool = false;
	    else
		i_40_
		    %= ((Class505) this).aClass325_6637.anInt4967 * 1809874433;
	    if (!((Class505) this).aClass325_6637.aBool4964
		&& i_40_ < (-1523198763
			    * ((Class505) this).aClass325_6637.anInt4966))
		bool = false;
	    if (((Class505) this).aClass325_6637.aBool4964
		&& i_40_ >= (-1523198763
			     * ((Class505) this).aClass325_6637.anInt4966))
		bool = false;
	}
	((Class505) this).anInt6648 = 0;
	for (Class247_Sub1_Sub1_Sub1 class247_sub1_sub1_sub1
		 = ((Class247_Sub1_Sub1_Sub1)
		    ((Class505) this).aClass421_6639.method7525(179456184));
	     null != class247_sub1_sub1_sub1;
	     class247_sub1_sub1_sub1
		 = ((Class247_Sub1_Sub1_Sub1)
		    ((Class505) this).aClass421_6639.method7526(331685324))) {
	    class247_sub1_sub1_sub1.method17648(l, i);
	    ((Class505) this).anInt6648 += -1599596327;
	}
	if (bool) {
	    int i_41_
		= (((((Class503) ((Class505) this).aClass503_6635).anInt6614
		     * -1709083431)
		    + (878777913 * ((Class503)
				    ((Class505) this).aClass503_6635).anInt6617
		       + 701732807 * ((Class503) (((Class505) this)
						  .aClass503_6635)).anInt6616))
		   / 3);
	    int i_42_
		= (((1531456601
		     * ((Class503) ((Class505) this).aClass503_6635).anInt6621)
		    + ((((Class503) ((Class505) this).aClass503_6635).anInt6618
			* 709188769)
		       + (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6615) * -601488629))
		   / 3);
	    int i_43_
		= (((((Class503) ((Class505) this).aClass503_6635).anInt6622
		     * -1488927469)
		    + ((((Class503) ((Class505) this).aClass503_6635).anInt6623
			* -1056430591)
		       + (-1576695729
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6624))))
		   / 3);
	    if (1184628225 * (((Class503) ((Class505) this).aClass503_6635)
			      .anInt6620) != i_41_
		|| (((Class503) ((Class505) this).aClass503_6635).anInt6619
		    * -1194700497) != i_42_
		|| (((Class503) ((Class505) this).aClass503_6635).anInt6625
		    * -1125838207) != i_43_
		|| !((Class505) this).aBool6645) {
		((Class503) ((Class505) this).aClass503_6635).anInt6620
		    = i_41_ * 1365770753;
		((Class503) ((Class505) this).aClass503_6635).anInt6619
		    = 89691599 * i_42_;
		((Class503) ((Class505) this).aClass503_6635).anInt6625
		    = i_43_ * -237949567;
		int i_44_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6617
			* 878777913)
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6616) * 701732807);
		int i_45_
		    = (709188769 * ((Class503)
				    ((Class505) this).aClass503_6635).anInt6618
		       - (-601488629
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6615)));
		int i_46_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6624
			* -1576695729)
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6623) * -1056430591);
		int i_47_
		    = (-1709083431 * ((Class503) (((Class505) this)
						  .aClass503_6635)).anInt6614
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6616) * 701732807);
		int i_48_
		    = (1531456601 * ((Class503) (((Class505) this)
						 .aClass503_6635)).anInt6621
		       - (-601488629
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6615)));
		int i_49_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6622
			* -1488927469)
		       - (-1056430591
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6623)));
		((Class505) this).anInt6638
		    = 75958031 * (i_45_ * i_49_ - i_48_ * i_46_);
		((Class505) this).anInt6646
		    = -718452939 * (i_47_ * i_46_ - i_44_ * i_49_);
		for (((Class505) this).anInt6636
			 = (i_44_ * i_48_ - i_45_ * i_47_) * 39655331;
		     (((Class505) this).anInt6638 * -1756297233 > 32767
		      || 1543377693 * ((Class505) this).anInt6646 > 32767
		      || 581948427 * ((Class505) this).anInt6636 > 32767
		      || ((Class505) this).anInt6638 * -1756297233 < -32767
		      || 1543377693 * ((Class505) this).anInt6646 < -32767
		      || ((Class505) this).anInt6636 * 581948427 < -32767);
		     ((Class505) this).anInt6636
			 = 39655331 * (((Class505) this).anInt6636 * 581948427
				       >> 1)) {
		    ((Class505) this).anInt6638
			= 75958031 * (-1756297233 * ((Class505) this).anInt6638
				      >> 1);
		    ((Class505) this).anInt6646
			= (-718452939
			   * (((Class505) this).anInt6646 * 1543377693 >> 1));
		}
		int i_50_
		    = (int) (Math.sqrt
			     ((double) ((((Class505) this).anInt6636
					 * 581948427
					 * (581948427
					    * ((Class505) this).anInt6636))
					+ ((-1756297233
					    * ((Class505) this).anInt6638
					    * (((Class505) this).anInt6638
					       * -1756297233))
					   + (((Class505) this).anInt6646
					      * 1543377693
					      * (1543377693
						 * (((Class505) this)
						    .anInt6646)))))));
		if (i_50_ <= 0)
		    i_50_ = 1;
		((Class505) this).anInt6638
		    = (-324634607 * ((Class505) this).anInt6638 / i_50_
		       * 75958031);
		((Class505) this).anInt6646
		    = (((Class505) this).anInt6646 * -1383043869 / i_50_
		       * -718452939);
		((Class505) this).anInt6636
		    = 39655331 * (-950686731 * ((Class505) this).anInt6636
				  / i_50_);
		if (((Class505) this).aClass325_6637.aShort4986 > 0
		    || ((Class505) this).aClass325_6637.aShort4934 > 0) {
		    int i_51_ = (int) (Math.atan2((double) ((((Class505) this)
							     .anInt6636)
							    * 581948427),
						  (double) ((((Class505) this)
							     .anInt6638)
							    * -1756297233))
				       * 2607.5945876176133);
		    int i_52_
			= (int) ((Math.atan2
				  ((double) (((Class505) this).anInt6646
					     * 1543377693),
				   Math.sqrt((double) ((-1756297233
							* (((Class505) this)
							   .anInt6638)
							* (-1756297233
							   * (((Class505) this)
							      .anInt6638)))
						       + ((((Class505) this)
							   .anInt6636)
							  * 581948427
							  * ((((Class505) this)
							      .anInt6636)
							     * 581948427))))))
				 * 2607.5945876176133);
		    ((Class505) this).anInt6649
			= (-1977864375
			   * (((Class505) this).aClass325_6637.aShort4986
			      - ((Class505) this).aClass325_6637.aShort4951));
		    ((Class505) this).anInt6640
			= (-617520941
			   * (i_51_
			      + ((Class505) this).aClass325_6637.aShort4951
			      - (1338766073 * ((Class505) this).anInt6649
				 >> 1)));
		    ((Class505) this).anInt6651
			= ((((Class505) this).aClass325_6637.aShort4934
			    - ((Class505) this).aClass325_6637.aShort4933)
			   * -1586566881);
		    ((Class505) this).anInt6650
			= ((((Class505) this).aClass325_6637.aShort4933 + i_52_
			    - (1147753183 * ((Class505) this).anInt6651 >> 1))
			   * 2033137971);
		}
		((Class505) this).aBool6645 = true;
	    }
	    ((Class505) this).anInt6647
		+= ((int) ((double) i
			   * ((double) (1587926389
					* (((Class505) this).aClass325_6637
					   .anInt4984))
			      + (Math.random()
				 * (double) (546242917 * (((Class505) this)
							  .aClass325_6637
							  .anInt4971)
					     - 1587926389 * (((Class505) this)
							     .aClass325_6637
							     .anInt4984)))))
		    * 547694693);
	    if (((Class505) this).anInt6647 * 796215661 > 63) {
		int i_53_ = ((Class505) this).anInt6647 * 796215661 >> 6;
		((Class505) this).anInt6647
		    = ((796215661 * ((Class505) this).anInt6647 & 0x3f)
		       * 547694693);
		int i_54_ = (i << 8) / i_53_;
		int i_55_ = 0;
		int i_56_ = 0;
		while (i_56_ < i_53_) {
		    int i_57_;
		    int i_58_;
		    int i_59_;
		    if (((Class505) this).aClass325_6637.aShort4986 > 0
			|| ((Class505) this).aClass325_6637.aShort4934 > 0) {
			int i_60_
			    = (((Class505) this).anInt6640 * -293734565
			       + (int) ((double) (((Class505) this).anInt6649
						  * 1338766073)
					* Math.random()));
			i_60_ &= 0x3fff;
			int i_61_ = Class282.anIntArray4430[i_60_];
			int i_62_ = Class282.anIntArray4441[i_60_];
			int i_63_
			    = (818899451 * ((Class505) this).anInt6650
			       + (int) ((double) (((Class505) this).anInt6651
						  * 1147753183)
					* Math.random()));
			i_63_ &= 0x1fff;
			int i_64_ = Class282.anIntArray4430[i_63_];
			int i_65_ = Class282.anIntArray4441[i_63_];
			int i_66_ = 13;
			i_57_ = i_64_ * i_62_ >> i_66_;
			i_58_ = (i_65_ << 1) * -1;
			i_59_ = i_64_ * i_61_ >> i_66_;
		    } else {
			i_57_ = -1756297233 * ((Class505) this).anInt6638;
			i_58_ = 1543377693 * ((Class505) this).anInt6646;
			i_59_ = ((Class505) this).anInt6636 * 581948427;
		    }
		    float f = (float) Math.random();
		    float f_67_ = (float) Math.random();
		    if (f + f_67_ > 1.0F) {
			f = 1.0F - f;
			f_67_ = 1.0F - f_67_;
		    }
		    float f_68_ = 1.0F - (f + f_67_);
		    int i_69_
			= (int) (f * (float) (701732807
					      * (((Class503) (((Class505) this)
							      .aClass503_6635))
						 .anInt6616))
				 + (float) (878777913
					    * (((Class503) (((Class505) this)
							    .aClass503_6635))
					       .anInt6617)) * f_67_
				 + f_68_ * (float) (-1709083431
						    * (((Class503)
							(((Class505) this)
							 .aClass503_6635))
						       .anInt6614)));
		    int i_70_
			= (int) ((float) ((((Class503)
					    ((Class505) this).aClass503_6635)
					   .anInt6621)
					  * 1531456601) * f_68_
				 + ((float) ((((Class503) (((Class505) this)
							   .aClass503_6635))
					      .anInt6618)
					     * 709188769) * f_67_
				    + (float) ((((Class503) (((Class505) this)
							     .aClass503_6635))
						.anInt6615)
					       * -601488629) * f));
		    int i_71_
			= (int) ((float) (-1488927469
					  * (((Class503)
					      ((Class505) this).aClass503_6635)
					     .anInt6622)) * f_68_
				 + (f_67_ * (float) (-1576695729
						     * (((Class503)
							 (((Class505) this)
							  .aClass503_6635))
							.anInt6624))
				    + (float) (-1056430591
					       * (((Class503)
						   (((Class505) this)
						    .aClass503_6635))
						  .anInt6623)) * f));
		    int i_72_
			= ((1333858919
			    * ((Class505) this).aClass325_6637.anInt4935)
			   + (int) (Math.random()
				    * (double) (1086546799 * (((Class505) this)
							      .aClass325_6637
							      .anInt4936)
						- (1333858919
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4935)))));
		    int i_73_
			= ((103375735
			    * ((Class505) this).aClass325_6637.anInt4993)
			   + (int) (Math.random()
				    * (double) (680609465 * (((Class505) this)
							     .aClass325_6637
							     .anInt4978)
						- (103375735
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4993)))));
		    int i_74_
			= ((-45955699
			    * ((Class505) this).aClass325_6637.anInt4941)
			   + (int) (Math.random()
				    * (double) (((((Class505) this)
						  .aClass325_6637.anInt4957)
						 * -1248350419)
						- (-45955699
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4941)))));
		    int i_75_ = (((Class505) this).aClass325_6637.anInt4955
				 * 1307392903);
		    if (0 != (292885605
			      * ((Class505) this).aClass325_6637.anInt5004)) {
			if ((-1757377113
			     * ((Class505) this).aClass325_6637.anInt4926)
			    == 0)
			    i_75_
				+= (int) (Math.random()
					  * (double) (1 + (292885605
							   * (((Class505) this)
							      .aClass325_6637
							      .anInt5004))));
			else
			    i_75_ += ((int) (Math.random()
					     * (double) (((((Class505) this)
							   .aClass325_6637
							   .anInt4926)
							  * -1757377113)
							 + 1))
				      * ((((Class505) this).aClass325_6637
					  .anInt5004)
					 * 292885605
					 / (-1757377113
					    * (((Class505) this).aClass325_6637
					       .anInt4926))));
		    }
		    int i_76_ = (((Class505) this).aClass325_6637.anInt4960
				 * -335502761);
		    if (0 != (391077559
			      * ((Class505) this).aClass325_6637.anInt5005))
			i_76_ += (int) (Math.random()
					* (double) ((((Class505) this)
						     .aClass325_6637
						     .anInt5005) * 391077559
						    + 1));
		    int i_77_;
		    if (((Class505) this).aClass325_6637.aBool4947) {
			double d = Math.random();
			i_77_
			    = ((int) ((double) (2039894325
						* (((Class505) this)
						   .aClass325_6637.anInt4945))
				      + (double) (1368691389
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4962)) * d) << 16
			       | (int) ((double) (771755579
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4974)) * d
					+ (double) (-642843419
						    * (((Class505) this)
						       .aClass325_6637
						       .anInt4985))) << 8
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4988)
						  * 1695964871)
					+ (double) (-1857521795
						    * (((Class505) this)
						       .aClass325_6637
						       .anInt4930)) * d)
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4991)
						  * -1837898999)
					+ (Math.random()
					   * (double) ((((Class505) this)
							.aClass325_6637
							.anInt4953)
						       * 1077870337))) << 24);
		    } else
			i_77_
			    = ((int) ((double) (2039894325
						* (((Class505) this)
						   .aClass325_6637.anInt4945))
				      + (Math.random()
					 * (double) ((((Class505) this)
						      .aClass325_6637
						      .anInt4962)
						     * 1368691389))) << 16
			       | (int) ((double) (-642843419
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4985))
					+ (Math.random()
					   * (double) (771755579
						       * (((Class505) this)
							  .aClass325_6637
							  .anInt4974)))) << 8
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4988)
						  * 1695964871)
					+ (Math.random()
					   * (double) (-1857521795
						       * (((Class505) this)
							  .aClass325_6637
							  .anInt4930))))
			       | ((int) ((double) ((((Class505) this)
						    .aClass325_6637.anInt4991)
						   * -1837898999)
					 + (Math.random()
					    * (double) (1077870337
							* (((Class505) this)
							   .aClass325_6637
							   .anInt4953))))
				  << 24));
		    int i_78_ = (-1474701413
				 * ((Class505) this).aClass325_6637.anInt4931);
		    if (!class103.method2232()
			&& !((Class505) this).aClass325_6637.aBool4976)
			i_78_ = -1;
		    Class247_Sub1_Sub1_Sub1 class247_sub1_sub1_sub1;
		    if (1435230355 * Class487.anInt6473
			!= Class487.anInt6476 * 1515285899) {
			class247_sub1_sub1_sub1
			    = (Class487.aClass247_Sub1_Sub1_Sub1Array6478
			       [Class487.anInt6476 * 1515285899]);
			Class487.anInt6476
			    = (-1790520797
			       * (1 + 1515285899 * Class487.anInt6476
				  & 0x3ff));
			class247_sub1_sub1_sub1.method17646
			    (this, i_69_, i_70_, i_71_, i_57_, i_58_, i_59_,
			     i_72_, i_73_, i_77_, i_74_, i_75_, i_76_, i_78_,
			     ((Class505) this).aClass325_6637.aBool4969,
			     ((Class505) this).aClass325_6637.aBool4977);
		    } else
			class247_sub1_sub1_sub1
			    = (new Class247_Sub1_Sub1_Sub1
			       (this, i_69_, i_70_, i_71_, i_57_, i_58_, i_59_,
				i_72_, i_73_, i_77_, i_74_, i_75_, i_76_,
				i_78_,
				((Class505) this).aClass325_6637.aBool4969,
				((Class505) this).aClass325_6637.aBool4977));
		    if (i_55_ > 256)
			class247_sub1_sub1_sub1.method17648(l, i_55_ >> 8);
		    ((Class505) this).anInt6648 += -1599596327;
		    i_56_++;
		    i_55_ += i_54_;
		}
	    }
	}
	if (!((Class505) this).aClass503_6635
		 .method11460(((Class505) this).aClass503_6644, (byte) 79)) {
	    Class503 class503 = ((Class505) this).aClass503_6644;
	    ((Class505) this).aClass503_6644
		= ((Class505) this).aClass503_6635;
	    ((Class505) this).aClass503_6635 = class503;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6616
		= ((Class505) this).aClass106_6653.anInt1487 * 48887857;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6615
		= ((Class505) this).aClass106_6653.anInt1495 * -1532379311;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6623
		= ((Class505) this).aClass106_6653.anInt1498 * -1284816513;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6617
		= ((Class505) this).aClass106_6653.anInt1497 * 188797131;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6618
		= -1886219871 * ((Class505) this).aClass106_6653.anInt1496;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6624
		= ((Class505) this).aClass106_6653.anInt1499 * -358561697;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6614
		= ((Class505) this).aClass106_6653.anInt1500 * 264343231;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6621
		= ((Class505) this).aClass106_6653.anInt1501 * 373068629;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6622
		= ((Class505) this).aClass106_6653.anInt1502 * -996355931;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6620
		= 1 * ((Class503) ((Class505) this).aClass503_6644).anInt6620;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6619
		= 1 * ((Class503) ((Class505) this).aClass503_6644).anInt6619;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6625
		= ((Class503) ((Class505) this).aClass503_6644).anInt6625 * 1;
	}
	Class487.anInt6470 += ((Class505) this).anInt6648 * 592196213;
    }
    
    void method11471(Class552 class552, Class103 class103, long l) {
	for (Class247_Sub1_Sub1_Sub1 class247_sub1_sub1_sub1
		 = ((Class247_Sub1_Sub1_Sub1)
		    ((Class505) this).aClass421_6639.method7525(-811085105));
	     null != class247_sub1_sub1_sub1;
	     class247_sub1_sub1_sub1
		 = ((Class247_Sub1_Sub1_Sub1)
		    ((Class505) this).aClass421_6639.method7526(1083246354)))
	    class247_sub1_sub1_sub1.method17649(class552, class103, l);
    }
    
    Class505(Class103 class103, Class106 class106, Class489 class489, long l) {
	((Class505) this).aBool6642 = false;
	((Class505) this).aClass503_6635 = new Class503();
	((Class505) this).aClass503_6644 = new Class503();
	((Class505) this).aBool6652 = false;
	((Class505) this).aBool6645 = false;
	((Class505) this).aClass106_6653 = class106;
	((Class505) this).aClass489_6643 = class489;
	((Class505) this).aLong6641 = -6486662182254969773L * l;
	((Class505) this).aClass325_6637
	    = ((Class505) this).aClass106_6653.method2669(2075965156);
	if (!class103.method2232()
	    && ((Class505) this).aClass325_6637.anInt4992 * 411604123 != -1)
	    ((Class505) this).aClass325_6637
		= Class530.method11844(411604123 * (((Class505) this)
						    .aClass325_6637.anInt4992),
				       -1056145482);
	((Class505) this).aClass421_6639 = new Class421();
	((Class505) this).anInt6647
	    = (int) ((double) (796215661 * ((Class505) this).anInt6647)
		     + Math.random() * 64.0) * 547694693;
	method11477(1087656365);
	((Class503) ((Class505) this).aClass503_6644).anInt6616
	    = 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6616;
	((Class503) ((Class505) this).aClass503_6644).anInt6615
	    = ((Class503) ((Class505) this).aClass503_6635).anInt6615 * 1;
	((Class503) ((Class505) this).aClass503_6644).anInt6623
	    = ((Class503) ((Class505) this).aClass503_6635).anInt6623 * 1;
	((Class503) ((Class505) this).aClass503_6644).anInt6617
	    = ((Class503) ((Class505) this).aClass503_6635).anInt6617 * 1;
	((Class503) ((Class505) this).aClass503_6644).anInt6618
	    = ((Class503) ((Class505) this).aClass503_6635).anInt6618 * 1;
	((Class503) ((Class505) this).aClass503_6644).anInt6624
	    = 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6624;
	((Class503) ((Class505) this).aClass503_6644).anInt6614
	    = 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6614;
	((Class503) ((Class505) this).aClass503_6644).anInt6621
	    = 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6621;
	((Class503) ((Class505) this).aClass503_6644).anInt6622
	    = ((Class503) ((Class505) this).aClass503_6635).anInt6622 * 1;
    }
    
    void method11472() {
	((Class503) ((Class505) this).aClass503_6635).anInt6616
	    = 48887857 * ((Class505) this).aClass106_6653.anInt1487;
	((Class503) ((Class505) this).aClass503_6635).anInt6615
	    = ((Class505) this).aClass106_6653.anInt1495 * -1532379311;
	((Class503) ((Class505) this).aClass503_6635).anInt6623
	    = ((Class505) this).aClass106_6653.anInt1498 * -1284816513;
	((Class503) ((Class505) this).aClass503_6635).anInt6617
	    = 188797131 * ((Class505) this).aClass106_6653.anInt1497;
	((Class503) ((Class505) this).aClass503_6635).anInt6618
	    = ((Class505) this).aClass106_6653.anInt1496 * -1886219871;
	((Class503) ((Class505) this).aClass503_6635).anInt6624
	    = ((Class505) this).aClass106_6653.anInt1499 * -358561697;
	((Class503) ((Class505) this).aClass503_6635).anInt6614
	    = ((Class505) this).aClass106_6653.anInt1500 * 264343231;
	((Class503) ((Class505) this).aClass503_6635).anInt6621
	    = ((Class505) this).aClass106_6653.anInt1501 * 373068629;
	((Class503) ((Class505) this).aClass503_6635).anInt6622
	    = -996355931 * ((Class505) this).aClass106_6653.anInt1502;
	if (((((Class503) ((Class505) this).aClass503_6635).anInt6616
	      * 701732807)
	     == (878777913
		 * ((Class503) ((Class505) this).aClass503_6635).anInt6617))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6614
		 * -1709083431)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6617
		    * 878777913))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6615
		 * -601488629)
		== (709188769
		    * ((Class503) ((Class505) this).aClass503_6635).anInt6618))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6621
		 * 1531456601)
		== (709188769
		    * ((Class503) ((Class505) this).aClass503_6635).anInt6618))
	    && ((-1576695729
		 * ((Class503) ((Class505) this).aClass503_6635).anInt6624)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6623
		    * -1056430591))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6622
		 * -1488927469)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6624
		    * -1576695729)))
	    ((Class505) this).aBool6652 = true;
	else if (((Class505) this).aBool6652) {
	    ((Class505) this).aBool6652 = false;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6616
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6616;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6615
		= ((Class503) ((Class505) this).aClass503_6635).anInt6615 * 1;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6623
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6623;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6617
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6617;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6618
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6618;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6624
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6624;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6614
		= ((Class503) ((Class505) this).aClass503_6635).anInt6614 * 1;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6621
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6621;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6622
		= ((Class503) ((Class505) this).aClass503_6635).anInt6622 * 1;
	}
    }
    
    void method11473() {
	((Class503) ((Class505) this).aClass503_6635).anInt6616
	    = 48887857 * ((Class505) this).aClass106_6653.anInt1487;
	((Class503) ((Class505) this).aClass503_6635).anInt6615
	    = ((Class505) this).aClass106_6653.anInt1495 * -1532379311;
	((Class503) ((Class505) this).aClass503_6635).anInt6623
	    = ((Class505) this).aClass106_6653.anInt1498 * -1284816513;
	((Class503) ((Class505) this).aClass503_6635).anInt6617
	    = 188797131 * ((Class505) this).aClass106_6653.anInt1497;
	((Class503) ((Class505) this).aClass503_6635).anInt6618
	    = ((Class505) this).aClass106_6653.anInt1496 * -1886219871;
	((Class503) ((Class505) this).aClass503_6635).anInt6624
	    = ((Class505) this).aClass106_6653.anInt1499 * -358561697;
	((Class503) ((Class505) this).aClass503_6635).anInt6614
	    = ((Class505) this).aClass106_6653.anInt1500 * 264343231;
	((Class503) ((Class505) this).aClass503_6635).anInt6621
	    = ((Class505) this).aClass106_6653.anInt1501 * 373068629;
	((Class503) ((Class505) this).aClass503_6635).anInt6622
	    = -996355931 * ((Class505) this).aClass106_6653.anInt1502;
	if (((((Class503) ((Class505) this).aClass503_6635).anInt6616
	      * 701732807)
	     == (878777913
		 * ((Class503) ((Class505) this).aClass503_6635).anInt6617))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6614
		 * -1709083431)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6617
		    * 878777913))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6615
		 * -601488629)
		== (709188769
		    * ((Class503) ((Class505) this).aClass503_6635).anInt6618))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6621
		 * 1531456601)
		== (709188769
		    * ((Class503) ((Class505) this).aClass503_6635).anInt6618))
	    && ((-1576695729
		 * ((Class503) ((Class505) this).aClass503_6635).anInt6624)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6623
		    * -1056430591))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6622
		 * -1488927469)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6624
		    * -1576695729)))
	    ((Class505) this).aBool6652 = true;
	else if (((Class505) this).aBool6652) {
	    ((Class505) this).aBool6652 = false;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6616
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6616;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6615
		= ((Class503) ((Class505) this).aClass503_6635).anInt6615 * 1;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6623
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6623;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6617
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6617;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6618
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6618;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6624
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6624;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6614
		= ((Class503) ((Class505) this).aClass503_6635).anInt6614 * 1;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6621
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6621;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6622
		= ((Class503) ((Class505) this).aClass503_6635).anInt6622 * 1;
	}
    }
    
    void method11474() {
	((Class503) ((Class505) this).aClass503_6635).anInt6616
	    = 48887857 * ((Class505) this).aClass106_6653.anInt1487;
	((Class503) ((Class505) this).aClass503_6635).anInt6615
	    = ((Class505) this).aClass106_6653.anInt1495 * -1532379311;
	((Class503) ((Class505) this).aClass503_6635).anInt6623
	    = ((Class505) this).aClass106_6653.anInt1498 * -1284816513;
	((Class503) ((Class505) this).aClass503_6635).anInt6617
	    = 188797131 * ((Class505) this).aClass106_6653.anInt1497;
	((Class503) ((Class505) this).aClass503_6635).anInt6618
	    = ((Class505) this).aClass106_6653.anInt1496 * -1886219871;
	((Class503) ((Class505) this).aClass503_6635).anInt6624
	    = ((Class505) this).aClass106_6653.anInt1499 * -358561697;
	((Class503) ((Class505) this).aClass503_6635).anInt6614
	    = ((Class505) this).aClass106_6653.anInt1500 * 264343231;
	((Class503) ((Class505) this).aClass503_6635).anInt6621
	    = ((Class505) this).aClass106_6653.anInt1501 * 373068629;
	((Class503) ((Class505) this).aClass503_6635).anInt6622
	    = -996355931 * ((Class505) this).aClass106_6653.anInt1502;
	if (((((Class503) ((Class505) this).aClass503_6635).anInt6616
	      * 701732807)
	     == (878777913
		 * ((Class503) ((Class505) this).aClass503_6635).anInt6617))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6614
		 * -1709083431)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6617
		    * 878777913))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6615
		 * -601488629)
		== (709188769
		    * ((Class503) ((Class505) this).aClass503_6635).anInt6618))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6621
		 * 1531456601)
		== (709188769
		    * ((Class503) ((Class505) this).aClass503_6635).anInt6618))
	    && ((-1576695729
		 * ((Class503) ((Class505) this).aClass503_6635).anInt6624)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6623
		    * -1056430591))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6622
		 * -1488927469)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6624
		    * -1576695729)))
	    ((Class505) this).aBool6652 = true;
	else if (((Class505) this).aBool6652) {
	    ((Class505) this).aBool6652 = false;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6616
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6616;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6615
		= ((Class503) ((Class505) this).aClass503_6635).anInt6615 * 1;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6623
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6623;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6617
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6617;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6618
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6618;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6624
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6624;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6614
		= ((Class503) ((Class505) this).aClass503_6635).anInt6614 * 1;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6621
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6621;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6622
		= ((Class503) ((Class505) this).aClass503_6635).anInt6622 * 1;
	}
    }
    
    void method11475(Class103 class103, long l, int i, boolean bool) {
	if (((Class505) this).aBool6642)
	    bool = false;
	else if (275753719 * Class487.anInt6480
		 < 815444107 * ((Class505) this).aClass325_6637.anInt4968)
	    bool = false;
	else if (1676131937 * Class487.anInt6477
		 > Class90.anIntArray1311[275753719 * Class487.anInt6480])
	    bool = false;
	else if (((Class505) this).aBool6652)
	    bool = false;
	else if (1809874433 * ((Class505) this).aClass325_6637.anInt4967
		 != -1) {
	    int i_79_
		= (int) (l
			 - 895246674369456091L * ((Class505) this).aLong6641);
	    if (!((Class505) this).aClass325_6637.aBool4965
		&& (i_79_
		    > 1809874433 * ((Class505) this).aClass325_6637.anInt4967))
		bool = false;
	    else
		i_79_
		    %= ((Class505) this).aClass325_6637.anInt4967 * 1809874433;
	    if (!((Class505) this).aClass325_6637.aBool4964
		&& i_79_ < (-1523198763
			    * ((Class505) this).aClass325_6637.anInt4966))
		bool = false;
	    if (((Class505) this).aClass325_6637.aBool4964
		&& i_79_ >= (-1523198763
			     * ((Class505) this).aClass325_6637.anInt4966))
		bool = false;
	}
	((Class505) this).anInt6648 = 0;
	for (Class247_Sub1_Sub1_Sub1 class247_sub1_sub1_sub1
		 = ((Class247_Sub1_Sub1_Sub1)
		    ((Class505) this).aClass421_6639.method7525(-1150502781));
	     null != class247_sub1_sub1_sub1;
	     class247_sub1_sub1_sub1
		 = ((Class247_Sub1_Sub1_Sub1)
		    ((Class505) this).aClass421_6639.method7526(1459699525))) {
	    class247_sub1_sub1_sub1.method17648(l, i);
	    ((Class505) this).anInt6648 += -1599596327;
	}
	if (bool) {
	    int i_80_
		= (((((Class503) ((Class505) this).aClass503_6635).anInt6614
		     * -1709083431)
		    + (878777913 * ((Class503)
				    ((Class505) this).aClass503_6635).anInt6617
		       + 701732807 * ((Class503) (((Class505) this)
						  .aClass503_6635)).anInt6616))
		   / 3);
	    int i_81_
		= (((1531456601
		     * ((Class503) ((Class505) this).aClass503_6635).anInt6621)
		    + ((((Class503) ((Class505) this).aClass503_6635).anInt6618
			* 709188769)
		       + (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6615) * -601488629))
		   / 3);
	    int i_82_
		= (((((Class503) ((Class505) this).aClass503_6635).anInt6622
		     * -1488927469)
		    + ((((Class503) ((Class505) this).aClass503_6635).anInt6623
			* -1056430591)
		       + (-1576695729
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6624))))
		   / 3);
	    if (1184628225 * (((Class503) ((Class505) this).aClass503_6635)
			      .anInt6620) != i_80_
		|| (((Class503) ((Class505) this).aClass503_6635).anInt6619
		    * -1194700497) != i_81_
		|| (((Class503) ((Class505) this).aClass503_6635).anInt6625
		    * -1125838207) != i_82_
		|| !((Class505) this).aBool6645) {
		((Class503) ((Class505) this).aClass503_6635).anInt6620
		    = i_80_ * 1365770753;
		((Class503) ((Class505) this).aClass503_6635).anInt6619
		    = 89691599 * i_81_;
		((Class503) ((Class505) this).aClass503_6635).anInt6625
		    = i_82_ * -237949567;
		int i_83_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6617
			* 878777913)
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6616) * 701732807);
		int i_84_
		    = (709188769 * ((Class503)
				    ((Class505) this).aClass503_6635).anInt6618
		       - (-601488629
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6615)));
		int i_85_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6624
			* -1576695729)
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6623) * -1056430591);
		int i_86_
		    = (-1709083431 * ((Class503) (((Class505) this)
						  .aClass503_6635)).anInt6614
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6616) * 701732807);
		int i_87_
		    = (1531456601 * ((Class503) (((Class505) this)
						 .aClass503_6635)).anInt6621
		       - (-601488629
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6615)));
		int i_88_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6622
			* -1488927469)
		       - (-1056430591
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6623)));
		((Class505) this).anInt6638
		    = 75958031 * (i_84_ * i_88_ - i_87_ * i_85_);
		((Class505) this).anInt6646
		    = -718452939 * (i_86_ * i_85_ - i_83_ * i_88_);
		for (((Class505) this).anInt6636
			 = (i_83_ * i_87_ - i_84_ * i_86_) * 39655331;
		     (((Class505) this).anInt6638 * -1756297233 > 32767
		      || 1543377693 * ((Class505) this).anInt6646 > 32767
		      || 581948427 * ((Class505) this).anInt6636 > 32767
		      || ((Class505) this).anInt6638 * -1756297233 < -32767
		      || 1543377693 * ((Class505) this).anInt6646 < -32767
		      || ((Class505) this).anInt6636 * 581948427 < -32767);
		     ((Class505) this).anInt6636
			 = 39655331 * (((Class505) this).anInt6636 * 581948427
				       >> 1)) {
		    ((Class505) this).anInt6638
			= 75958031 * (-1756297233 * ((Class505) this).anInt6638
				      >> 1);
		    ((Class505) this).anInt6646
			= (-718452939
			   * (((Class505) this).anInt6646 * 1543377693 >> 1));
		}
		int i_89_
		    = (int) (Math.sqrt
			     ((double) ((((Class505) this).anInt6636
					 * 581948427
					 * (581948427
					    * ((Class505) this).anInt6636))
					+ ((-1756297233
					    * ((Class505) this).anInt6638
					    * (((Class505) this).anInt6638
					       * -1756297233))
					   + (((Class505) this).anInt6646
					      * 1543377693
					      * (1543377693
						 * (((Class505) this)
						    .anInt6646)))))));
		if (i_89_ <= 0)
		    i_89_ = 1;
		((Class505) this).anInt6638
		    = (-324634607 * ((Class505) this).anInt6638 / i_89_
		       * 75958031);
		((Class505) this).anInt6646
		    = (((Class505) this).anInt6646 * -1383043869 / i_89_
		       * -718452939);
		((Class505) this).anInt6636
		    = 39655331 * (-950686731 * ((Class505) this).anInt6636
				  / i_89_);
		if (((Class505) this).aClass325_6637.aShort4986 > 0
		    || ((Class505) this).aClass325_6637.aShort4934 > 0) {
		    int i_90_ = (int) (Math.atan2((double) ((((Class505) this)
							     .anInt6636)
							    * 581948427),
						  (double) ((((Class505) this)
							     .anInt6638)
							    * -1756297233))
				       * 2607.5945876176133);
		    int i_91_
			= (int) ((Math.atan2
				  ((double) (((Class505) this).anInt6646
					     * 1543377693),
				   Math.sqrt((double) ((-1756297233
							* (((Class505) this)
							   .anInt6638)
							* (-1756297233
							   * (((Class505) this)
							      .anInt6638)))
						       + ((((Class505) this)
							   .anInt6636)
							  * 581948427
							  * ((((Class505) this)
							      .anInt6636)
							     * 581948427))))))
				 * 2607.5945876176133);
		    ((Class505) this).anInt6649
			= (-1977864375
			   * (((Class505) this).aClass325_6637.aShort4986
			      - ((Class505) this).aClass325_6637.aShort4951));
		    ((Class505) this).anInt6640
			= (-617520941
			   * (i_90_
			      + ((Class505) this).aClass325_6637.aShort4951
			      - (1338766073 * ((Class505) this).anInt6649
				 >> 1)));
		    ((Class505) this).anInt6651
			= ((((Class505) this).aClass325_6637.aShort4934
			    - ((Class505) this).aClass325_6637.aShort4933)
			   * -1586566881);
		    ((Class505) this).anInt6650
			= ((((Class505) this).aClass325_6637.aShort4933 + i_91_
			    - (1147753183 * ((Class505) this).anInt6651 >> 1))
			   * 2033137971);
		}
		((Class505) this).aBool6645 = true;
	    }
	    ((Class505) this).anInt6647
		+= ((int) ((double) i
			   * ((double) (1587926389
					* (((Class505) this).aClass325_6637
					   .anInt4984))
			      + (Math.random()
				 * (double) (546242917 * (((Class505) this)
							  .aClass325_6637
							  .anInt4971)
					     - 1587926389 * (((Class505) this)
							     .aClass325_6637
							     .anInt4984)))))
		    * 547694693);
	    if (((Class505) this).anInt6647 * 796215661 > 63) {
		int i_92_ = ((Class505) this).anInt6647 * 796215661 >> 6;
		((Class505) this).anInt6647
		    = ((796215661 * ((Class505) this).anInt6647 & 0x3f)
		       * 547694693);
		int i_93_ = (i << 8) / i_92_;
		int i_94_ = 0;
		int i_95_ = 0;
		while (i_95_ < i_92_) {
		    int i_96_;
		    int i_97_;
		    int i_98_;
		    if (((Class505) this).aClass325_6637.aShort4986 > 0
			|| ((Class505) this).aClass325_6637.aShort4934 > 0) {
			int i_99_
			    = (((Class505) this).anInt6640 * -293734565
			       + (int) ((double) (((Class505) this).anInt6649
						  * 1338766073)
					* Math.random()));
			i_99_ &= 0x3fff;
			int i_100_ = Class282.anIntArray4430[i_99_];
			int i_101_ = Class282.anIntArray4441[i_99_];
			int i_102_
			    = (818899451 * ((Class505) this).anInt6650
			       + (int) ((double) (((Class505) this).anInt6651
						  * 1147753183)
					* Math.random()));
			i_102_ &= 0x1fff;
			int i_103_ = Class282.anIntArray4430[i_102_];
			int i_104_ = Class282.anIntArray4441[i_102_];
			int i_105_ = 13;
			i_96_ = i_103_ * i_101_ >> i_105_;
			i_97_ = (i_104_ << 1) * -1;
			i_98_ = i_103_ * i_100_ >> i_105_;
		    } else {
			i_96_ = -1756297233 * ((Class505) this).anInt6638;
			i_97_ = 1543377693 * ((Class505) this).anInt6646;
			i_98_ = ((Class505) this).anInt6636 * 581948427;
		    }
		    float f = (float) Math.random();
		    float f_106_ = (float) Math.random();
		    if (f + f_106_ > 1.0F) {
			f = 1.0F - f;
			f_106_ = 1.0F - f_106_;
		    }
		    float f_107_ = 1.0F - (f + f_106_);
		    int i_108_
			= (int) (f * (float) (701732807
					      * (((Class503) (((Class505) this)
							      .aClass503_6635))
						 .anInt6616))
				 + (float) (878777913
					    * (((Class503) (((Class505) this)
							    .aClass503_6635))
					       .anInt6617)) * f_106_
				 + f_107_ * (float) (-1709083431
						     * (((Class503)
							 (((Class505) this)
							  .aClass503_6635))
							.anInt6614)));
		    int i_109_
			= (int) ((float) ((((Class503)
					    ((Class505) this).aClass503_6635)
					   .anInt6621)
					  * 1531456601) * f_107_
				 + ((float) ((((Class503) (((Class505) this)
							   .aClass503_6635))
					      .anInt6618)
					     * 709188769) * f_106_
				    + (float) ((((Class503) (((Class505) this)
							     .aClass503_6635))
						.anInt6615)
					       * -601488629) * f));
		    int i_110_
			= (int) ((float) (-1488927469
					  * (((Class503)
					      ((Class505) this).aClass503_6635)
					     .anInt6622)) * f_107_
				 + (f_106_ * (float) (-1576695729
						      * (((Class503)
							  (((Class505) this)
							   .aClass503_6635))
							 .anInt6624))
				    + (float) (-1056430591
					       * (((Class503)
						   (((Class505) this)
						    .aClass503_6635))
						  .anInt6623)) * f));
		    int i_111_
			= ((1333858919
			    * ((Class505) this).aClass325_6637.anInt4935)
			   + (int) (Math.random()
				    * (double) (1086546799 * (((Class505) this)
							      .aClass325_6637
							      .anInt4936)
						- (1333858919
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4935)))));
		    int i_112_
			= ((103375735
			    * ((Class505) this).aClass325_6637.anInt4993)
			   + (int) (Math.random()
				    * (double) (680609465 * (((Class505) this)
							     .aClass325_6637
							     .anInt4978)
						- (103375735
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4993)))));
		    int i_113_
			= ((-45955699
			    * ((Class505) this).aClass325_6637.anInt4941)
			   + (int) (Math.random()
				    * (double) (((((Class505) this)
						  .aClass325_6637.anInt4957)
						 * -1248350419)
						- (-45955699
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4941)))));
		    int i_114_ = (((Class505) this).aClass325_6637.anInt4955
				  * 1307392903);
		    if (0 != (292885605
			      * ((Class505) this).aClass325_6637.anInt5004)) {
			if ((-1757377113
			     * ((Class505) this).aClass325_6637.anInt4926)
			    == 0)
			    i_114_
				+= (int) (Math.random()
					  * (double) (1 + (292885605
							   * (((Class505) this)
							      .aClass325_6637
							      .anInt5004))));
			else
			    i_114_ += ((int) (Math.random()
					      * (double) (((((Class505) this)
							    .aClass325_6637
							    .anInt4926)
							   * -1757377113)
							  + 1))
				       * ((((Class505) this).aClass325_6637
					   .anInt5004)
					  * 292885605
					  / (-1757377113
					     * (((Class505) this)
						.aClass325_6637.anInt4926))));
		    }
		    int i_115_ = (((Class505) this).aClass325_6637.anInt4960
				  * -335502761);
		    if (0 != (391077559
			      * ((Class505) this).aClass325_6637.anInt5005))
			i_115_ += (int) (Math.random()
					 * (double) ((((Class505) this)
						      .aClass325_6637
						      .anInt5005) * 391077559
						     + 1));
		    int i_116_;
		    if (((Class505) this).aClass325_6637.aBool4947) {
			double d = Math.random();
			i_116_
			    = ((int) ((double) (2039894325
						* (((Class505) this)
						   .aClass325_6637.anInt4945))
				      + (double) (1368691389
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4962)) * d) << 16
			       | (int) ((double) (771755579
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4974)) * d
					+ (double) (-642843419
						    * (((Class505) this)
						       .aClass325_6637
						       .anInt4985))) << 8
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4988)
						  * 1695964871)
					+ (double) (-1857521795
						    * (((Class505) this)
						       .aClass325_6637
						       .anInt4930)) * d)
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4991)
						  * -1837898999)
					+ (Math.random()
					   * (double) ((((Class505) this)
							.aClass325_6637
							.anInt4953)
						       * 1077870337))) << 24);
		    } else
			i_116_
			    = ((int) ((double) (2039894325
						* (((Class505) this)
						   .aClass325_6637.anInt4945))
				      + (Math.random()
					 * (double) ((((Class505) this)
						      .aClass325_6637
						      .anInt4962)
						     * 1368691389))) << 16
			       | (int) ((double) (-642843419
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4985))
					+ (Math.random()
					   * (double) (771755579
						       * (((Class505) this)
							  .aClass325_6637
							  .anInt4974)))) << 8
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4988)
						  * 1695964871)
					+ (Math.random()
					   * (double) (-1857521795
						       * (((Class505) this)
							  .aClass325_6637
							  .anInt4930))))
			       | ((int) ((double) ((((Class505) this)
						    .aClass325_6637.anInt4991)
						   * -1837898999)
					 + (Math.random()
					    * (double) (1077870337
							* (((Class505) this)
							   .aClass325_6637
							   .anInt4953))))
				  << 24));
		    int i_117_
			= (-1474701413
			   * ((Class505) this).aClass325_6637.anInt4931);
		    if (!class103.method2232()
			&& !((Class505) this).aClass325_6637.aBool4976)
			i_117_ = -1;
		    Class247_Sub1_Sub1_Sub1 class247_sub1_sub1_sub1;
		    if (1435230355 * Class487.anInt6473
			!= Class487.anInt6476 * 1515285899) {
			class247_sub1_sub1_sub1
			    = (Class487.aClass247_Sub1_Sub1_Sub1Array6478
			       [Class487.anInt6476 * 1515285899]);
			Class487.anInt6476
			    = (-1790520797
			       * (1 + 1515285899 * Class487.anInt6476
				  & 0x3ff));
			class247_sub1_sub1_sub1.method17646
			    (this, i_108_, i_109_, i_110_, i_96_, i_97_, i_98_,
			     i_111_, i_112_, i_116_, i_113_, i_114_, i_115_,
			     i_117_,
			     ((Class505) this).aClass325_6637.aBool4969,
			     ((Class505) this).aClass325_6637.aBool4977);
		    } else
			class247_sub1_sub1_sub1
			    = (new Class247_Sub1_Sub1_Sub1
			       (this, i_108_, i_109_, i_110_, i_96_, i_97_,
				i_98_, i_111_, i_112_, i_116_, i_113_, i_114_,
				i_115_, i_117_,
				((Class505) this).aClass325_6637.aBool4969,
				((Class505) this).aClass325_6637.aBool4977));
		    if (i_94_ > 256)
			class247_sub1_sub1_sub1.method17648(l, i_94_ >> 8);
		    ((Class505) this).anInt6648 += -1599596327;
		    i_95_++;
		    i_94_ += i_93_;
		}
	    }
	}
	if (!((Class505) this).aClass503_6635
		 .method11460(((Class505) this).aClass503_6644, (byte) 14)) {
	    Class503 class503 = ((Class505) this).aClass503_6644;
	    ((Class505) this).aClass503_6644
		= ((Class505) this).aClass503_6635;
	    ((Class505) this).aClass503_6635 = class503;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6616
		= ((Class505) this).aClass106_6653.anInt1487 * 48887857;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6615
		= ((Class505) this).aClass106_6653.anInt1495 * -1532379311;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6623
		= ((Class505) this).aClass106_6653.anInt1498 * -1284816513;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6617
		= ((Class505) this).aClass106_6653.anInt1497 * 188797131;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6618
		= -1886219871 * ((Class505) this).aClass106_6653.anInt1496;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6624
		= ((Class505) this).aClass106_6653.anInt1499 * -358561697;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6614
		= ((Class505) this).aClass106_6653.anInt1500 * 264343231;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6621
		= ((Class505) this).aClass106_6653.anInt1501 * 373068629;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6622
		= ((Class505) this).aClass106_6653.anInt1502 * -996355931;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6620
		= 1 * ((Class503) ((Class505) this).aClass503_6644).anInt6620;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6619
		= 1 * ((Class503) ((Class505) this).aClass503_6644).anInt6619;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6625
		= ((Class503) ((Class505) this).aClass503_6644).anInt6625 * 1;
	}
	Class487.anInt6470 += ((Class505) this).anInt6648 * 592196213;
    }
    
    void method11476(Class103 class103, long l, int i, boolean bool) {
	if (((Class505) this).aBool6642)
	    bool = false;
	else if (275753719 * Class487.anInt6480
		 < 815444107 * ((Class505) this).aClass325_6637.anInt4968)
	    bool = false;
	else if (1676131937 * Class487.anInt6477
		 > Class90.anIntArray1311[275753719 * Class487.anInt6480])
	    bool = false;
	else if (((Class505) this).aBool6652)
	    bool = false;
	else if (1809874433 * ((Class505) this).aClass325_6637.anInt4967
		 != -1) {
	    int i_118_
		= (int) (l
			 - 895246674369456091L * ((Class505) this).aLong6641);
	    if (!((Class505) this).aClass325_6637.aBool4965
		&& (i_118_
		    > 1809874433 * ((Class505) this).aClass325_6637.anInt4967))
		bool = false;
	    else
		i_118_
		    %= ((Class505) this).aClass325_6637.anInt4967 * 1809874433;
	    if (!((Class505) this).aClass325_6637.aBool4964
		&& i_118_ < (-1523198763
			     * ((Class505) this).aClass325_6637.anInt4966))
		bool = false;
	    if (((Class505) this).aClass325_6637.aBool4964
		&& i_118_ >= (-1523198763
			      * ((Class505) this).aClass325_6637.anInt4966))
		bool = false;
	}
	((Class505) this).anInt6648 = 0;
	for (Class247_Sub1_Sub1_Sub1 class247_sub1_sub1_sub1
		 = ((Class247_Sub1_Sub1_Sub1)
		    ((Class505) this).aClass421_6639.method7525(815091976));
	     null != class247_sub1_sub1_sub1;
	     class247_sub1_sub1_sub1
		 = (Class247_Sub1_Sub1_Sub1) ((Class505) this)
						 .aClass421_6639
						 .method7526(-1800696538)) {
	    class247_sub1_sub1_sub1.method17648(l, i);
	    ((Class505) this).anInt6648 += -1599596327;
	}
	if (bool) {
	    int i_119_
		= (((((Class503) ((Class505) this).aClass503_6635).anInt6614
		     * -1709083431)
		    + (878777913 * ((Class503)
				    ((Class505) this).aClass503_6635).anInt6617
		       + 701732807 * ((Class503) (((Class505) this)
						  .aClass503_6635)).anInt6616))
		   / 3);
	    int i_120_
		= (((1531456601
		     * ((Class503) ((Class505) this).aClass503_6635).anInt6621)
		    + ((((Class503) ((Class505) this).aClass503_6635).anInt6618
			* 709188769)
		       + (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6615) * -601488629))
		   / 3);
	    int i_121_
		= (((((Class503) ((Class505) this).aClass503_6635).anInt6622
		     * -1488927469)
		    + ((((Class503) ((Class505) this).aClass503_6635).anInt6623
			* -1056430591)
		       + (-1576695729
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6624))))
		   / 3);
	    if (1184628225 * (((Class503) ((Class505) this).aClass503_6635)
			      .anInt6620) != i_119_
		|| (((Class503) ((Class505) this).aClass503_6635).anInt6619
		    * -1194700497) != i_120_
		|| (((Class503) ((Class505) this).aClass503_6635).anInt6625
		    * -1125838207) != i_121_
		|| !((Class505) this).aBool6645) {
		((Class503) ((Class505) this).aClass503_6635).anInt6620
		    = i_119_ * 1365770753;
		((Class503) ((Class505) this).aClass503_6635).anInt6619
		    = 89691599 * i_120_;
		((Class503) ((Class505) this).aClass503_6635).anInt6625
		    = i_121_ * -237949567;
		int i_122_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6617
			* 878777913)
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6616) * 701732807);
		int i_123_
		    = (709188769 * ((Class503)
				    ((Class505) this).aClass503_6635).anInt6618
		       - (-601488629
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6615)));
		int i_124_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6624
			* -1576695729)
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6623) * -1056430591);
		int i_125_
		    = (-1709083431 * ((Class503) (((Class505) this)
						  .aClass503_6635)).anInt6614
		       - (((Class503) ((Class505) this).aClass503_6635)
			  .anInt6616) * 701732807);
		int i_126_
		    = (1531456601 * ((Class503) (((Class505) this)
						 .aClass503_6635)).anInt6621
		       - (-601488629
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6615)));
		int i_127_
		    = ((((Class503) ((Class505) this).aClass503_6635).anInt6622
			* -1488927469)
		       - (-1056430591
			  * (((Class503) ((Class505) this).aClass503_6635)
			     .anInt6623)));
		((Class505) this).anInt6638
		    = 75958031 * (i_123_ * i_127_ - i_126_ * i_124_);
		((Class505) this).anInt6646
		    = -718452939 * (i_125_ * i_124_ - i_122_ * i_127_);
		for (((Class505) this).anInt6636
			 = (i_122_ * i_126_ - i_123_ * i_125_) * 39655331;
		     (((Class505) this).anInt6638 * -1756297233 > 32767
		      || 1543377693 * ((Class505) this).anInt6646 > 32767
		      || 581948427 * ((Class505) this).anInt6636 > 32767
		      || ((Class505) this).anInt6638 * -1756297233 < -32767
		      || 1543377693 * ((Class505) this).anInt6646 < -32767
		      || ((Class505) this).anInt6636 * 581948427 < -32767);
		     ((Class505) this).anInt6636
			 = 39655331 * (((Class505) this).anInt6636 * 581948427
				       >> 1)) {
		    ((Class505) this).anInt6638
			= 75958031 * (-1756297233 * ((Class505) this).anInt6638
				      >> 1);
		    ((Class505) this).anInt6646
			= (-718452939
			   * (((Class505) this).anInt6646 * 1543377693 >> 1));
		}
		int i_128_
		    = (int) (Math.sqrt
			     ((double) ((((Class505) this).anInt6636
					 * 581948427
					 * (581948427
					    * ((Class505) this).anInt6636))
					+ ((-1756297233
					    * ((Class505) this).anInt6638
					    * (((Class505) this).anInt6638
					       * -1756297233))
					   + (((Class505) this).anInt6646
					      * 1543377693
					      * (1543377693
						 * (((Class505) this)
						    .anInt6646)))))));
		if (i_128_ <= 0)
		    i_128_ = 1;
		((Class505) this).anInt6638
		    = (-324634607 * ((Class505) this).anInt6638 / i_128_
		       * 75958031);
		((Class505) this).anInt6646
		    = (((Class505) this).anInt6646 * -1383043869 / i_128_
		       * -718452939);
		((Class505) this).anInt6636
		    = 39655331 * (-950686731 * ((Class505) this).anInt6636
				  / i_128_);
		if (((Class505) this).aClass325_6637.aShort4986 > 0
		    || ((Class505) this).aClass325_6637.aShort4934 > 0) {
		    int i_129_ = (int) (Math.atan2((double) ((((Class505) this)
							      .anInt6636)
							     * 581948427),
						   (double) ((((Class505) this)
							      .anInt6638)
							     * -1756297233))
					* 2607.5945876176133);
		    int i_130_
			= (int) ((Math.atan2
				  ((double) (((Class505) this).anInt6646
					     * 1543377693),
				   Math.sqrt((double) ((-1756297233
							* (((Class505) this)
							   .anInt6638)
							* (-1756297233
							   * (((Class505) this)
							      .anInt6638)))
						       + ((((Class505) this)
							   .anInt6636)
							  * 581948427
							  * ((((Class505) this)
							      .anInt6636)
							     * 581948427))))))
				 * 2607.5945876176133);
		    ((Class505) this).anInt6649
			= (-1977864375
			   * (((Class505) this).aClass325_6637.aShort4986
			      - ((Class505) this).aClass325_6637.aShort4951));
		    ((Class505) this).anInt6640
			= (-617520941
			   * (i_129_
			      + ((Class505) this).aClass325_6637.aShort4951
			      - (1338766073 * ((Class505) this).anInt6649
				 >> 1)));
		    ((Class505) this).anInt6651
			= ((((Class505) this).aClass325_6637.aShort4934
			    - ((Class505) this).aClass325_6637.aShort4933)
			   * -1586566881);
		    ((Class505) this).anInt6650
			= (((Class505) this).aClass325_6637.aShort4933 + i_130_
			   - (1147753183 * ((Class505) this).anInt6651
			      >> 1)) * 2033137971;
		}
		((Class505) this).aBool6645 = true;
	    }
	    ((Class505) this).anInt6647
		+= ((int) ((double) i
			   * ((double) (1587926389
					* (((Class505) this).aClass325_6637
					   .anInt4984))
			      + (Math.random()
				 * (double) (546242917 * (((Class505) this)
							  .aClass325_6637
							  .anInt4971)
					     - 1587926389 * (((Class505) this)
							     .aClass325_6637
							     .anInt4984)))))
		    * 547694693);
	    if (((Class505) this).anInt6647 * 796215661 > 63) {
		int i_131_ = ((Class505) this).anInt6647 * 796215661 >> 6;
		((Class505) this).anInt6647
		    = ((796215661 * ((Class505) this).anInt6647 & 0x3f)
		       * 547694693);
		int i_132_ = (i << 8) / i_131_;
		int i_133_ = 0;
		int i_134_ = 0;
		while (i_134_ < i_131_) {
		    int i_135_;
		    int i_136_;
		    int i_137_;
		    if (((Class505) this).aClass325_6637.aShort4986 > 0
			|| ((Class505) this).aClass325_6637.aShort4934 > 0) {
			int i_138_
			    = (((Class505) this).anInt6640 * -293734565
			       + (int) ((double) (((Class505) this).anInt6649
						  * 1338766073)
					* Math.random()));
			i_138_ &= 0x3fff;
			int i_139_ = Class282.anIntArray4430[i_138_];
			int i_140_ = Class282.anIntArray4441[i_138_];
			int i_141_
			    = (818899451 * ((Class505) this).anInt6650
			       + (int) ((double) (((Class505) this).anInt6651
						  * 1147753183)
					* Math.random()));
			i_141_ &= 0x1fff;
			int i_142_ = Class282.anIntArray4430[i_141_];
			int i_143_ = Class282.anIntArray4441[i_141_];
			int i_144_ = 13;
			i_135_ = i_142_ * i_140_ >> i_144_;
			i_136_ = (i_143_ << 1) * -1;
			i_137_ = i_142_ * i_139_ >> i_144_;
		    } else {
			i_135_ = -1756297233 * ((Class505) this).anInt6638;
			i_136_ = 1543377693 * ((Class505) this).anInt6646;
			i_137_ = ((Class505) this).anInt6636 * 581948427;
		    }
		    float f = (float) Math.random();
		    float f_145_ = (float) Math.random();
		    if (f + f_145_ > 1.0F) {
			f = 1.0F - f;
			f_145_ = 1.0F - f_145_;
		    }
		    float f_146_ = 1.0F - (f + f_145_);
		    int i_147_
			= (int) (f * (float) (701732807
					      * (((Class503) (((Class505) this)
							      .aClass503_6635))
						 .anInt6616))
				 + (float) (878777913
					    * (((Class503) (((Class505) this)
							    .aClass503_6635))
					       .anInt6617)) * f_145_
				 + f_146_ * (float) (-1709083431
						     * (((Class503)
							 (((Class505) this)
							  .aClass503_6635))
							.anInt6614)));
		    int i_148_
			= (int) ((float) ((((Class503)
					    ((Class505) this).aClass503_6635)
					   .anInt6621)
					  * 1531456601) * f_146_
				 + ((float) ((((Class503) (((Class505) this)
							   .aClass503_6635))
					      .anInt6618)
					     * 709188769) * f_145_
				    + (float) ((((Class503) (((Class505) this)
							     .aClass503_6635))
						.anInt6615)
					       * -601488629) * f));
		    int i_149_
			= (int) ((float) (-1488927469
					  * (((Class503)
					      ((Class505) this).aClass503_6635)
					     .anInt6622)) * f_146_
				 + (f_145_ * (float) (-1576695729
						      * (((Class503)
							  (((Class505) this)
							   .aClass503_6635))
							 .anInt6624))
				    + (float) (-1056430591
					       * (((Class503)
						   (((Class505) this)
						    .aClass503_6635))
						  .anInt6623)) * f));
		    int i_150_
			= ((1333858919
			    * ((Class505) this).aClass325_6637.anInt4935)
			   + (int) (Math.random()
				    * (double) (1086546799 * (((Class505) this)
							      .aClass325_6637
							      .anInt4936)
						- (1333858919
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4935)))));
		    int i_151_
			= ((103375735
			    * ((Class505) this).aClass325_6637.anInt4993)
			   + (int) (Math.random()
				    * (double) (680609465 * (((Class505) this)
							     .aClass325_6637
							     .anInt4978)
						- (103375735
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4993)))));
		    int i_152_
			= ((-45955699
			    * ((Class505) this).aClass325_6637.anInt4941)
			   + (int) (Math.random()
				    * (double) (((((Class505) this)
						  .aClass325_6637.anInt4957)
						 * -1248350419)
						- (-45955699
						   * (((Class505) this)
						      .aClass325_6637
						      .anInt4941)))));
		    int i_153_ = (((Class505) this).aClass325_6637.anInt4955
				  * 1307392903);
		    if (0 != (292885605
			      * ((Class505) this).aClass325_6637.anInt5004)) {
			if ((-1757377113
			     * ((Class505) this).aClass325_6637.anInt4926)
			    == 0)
			    i_153_
				+= (int) (Math.random()
					  * (double) (1 + (292885605
							   * (((Class505) this)
							      .aClass325_6637
							      .anInt5004))));
			else
			    i_153_ += ((int) (Math.random()
					      * (double) (((((Class505) this)
							    .aClass325_6637
							    .anInt4926)
							   * -1757377113)
							  + 1))
				       * ((((Class505) this).aClass325_6637
					   .anInt5004)
					  * 292885605
					  / (-1757377113
					     * (((Class505) this)
						.aClass325_6637.anInt4926))));
		    }
		    int i_154_ = (((Class505) this).aClass325_6637.anInt4960
				  * -335502761);
		    if (0 != (391077559
			      * ((Class505) this).aClass325_6637.anInt5005))
			i_154_ += (int) (Math.random()
					 * (double) ((((Class505) this)
						      .aClass325_6637
						      .anInt5005) * 391077559
						     + 1));
		    int i_155_;
		    if (((Class505) this).aClass325_6637.aBool4947) {
			double d = Math.random();
			i_155_
			    = ((int) ((double) (2039894325
						* (((Class505) this)
						   .aClass325_6637.anInt4945))
				      + (double) (1368691389
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4962)) * d) << 16
			       | (int) ((double) (771755579
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4974)) * d
					+ (double) (-642843419
						    * (((Class505) this)
						       .aClass325_6637
						       .anInt4985))) << 8
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4988)
						  * 1695964871)
					+ (double) (-1857521795
						    * (((Class505) this)
						       .aClass325_6637
						       .anInt4930)) * d)
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4991)
						  * -1837898999)
					+ (Math.random()
					   * (double) ((((Class505) this)
							.aClass325_6637
							.anInt4953)
						       * 1077870337))) << 24);
		    } else
			i_155_
			    = ((int) ((double) (2039894325
						* (((Class505) this)
						   .aClass325_6637.anInt4945))
				      + (Math.random()
					 * (double) ((((Class505) this)
						      .aClass325_6637
						      .anInt4962)
						     * 1368691389))) << 16
			       | (int) ((double) (-642843419
						  * (((Class505) this)
						     .aClass325_6637
						     .anInt4985))
					+ (Math.random()
					   * (double) (771755579
						       * (((Class505) this)
							  .aClass325_6637
							  .anInt4974)))) << 8
			       | (int) ((double) ((((Class505) this)
						   .aClass325_6637.anInt4988)
						  * 1695964871)
					+ (Math.random()
					   * (double) (-1857521795
						       * (((Class505) this)
							  .aClass325_6637
							  .anInt4930))))
			       | ((int) ((double) ((((Class505) this)
						    .aClass325_6637.anInt4991)
						   * -1837898999)
					 + (Math.random()
					    * (double) (1077870337
							* (((Class505) this)
							   .aClass325_6637
							   .anInt4953))))
				  << 24));
		    int i_156_
			= (-1474701413
			   * ((Class505) this).aClass325_6637.anInt4931);
		    if (!class103.method2232()
			&& !((Class505) this).aClass325_6637.aBool4976)
			i_156_ = -1;
		    Class247_Sub1_Sub1_Sub1 class247_sub1_sub1_sub1;
		    if (1435230355 * Class487.anInt6473
			!= Class487.anInt6476 * 1515285899) {
			class247_sub1_sub1_sub1
			    = (Class487.aClass247_Sub1_Sub1_Sub1Array6478
			       [Class487.anInt6476 * 1515285899]);
			Class487.anInt6476
			    = (-1790520797
			       * (1 + 1515285899 * Class487.anInt6476
				  & 0x3ff));
			class247_sub1_sub1_sub1.method17646
			    (this, i_147_, i_148_, i_149_, i_135_, i_136_,
			     i_137_, i_150_, i_151_, i_155_, i_152_, i_153_,
			     i_154_, i_156_,
			     ((Class505) this).aClass325_6637.aBool4969,
			     ((Class505) this).aClass325_6637.aBool4977);
		    } else
			class247_sub1_sub1_sub1
			    = (new Class247_Sub1_Sub1_Sub1
			       (this, i_147_, i_148_, i_149_, i_135_, i_136_,
				i_137_, i_150_, i_151_, i_155_, i_152_, i_153_,
				i_154_, i_156_,
				((Class505) this).aClass325_6637.aBool4969,
				((Class505) this).aClass325_6637.aBool4977));
		    if (i_133_ > 256)
			class247_sub1_sub1_sub1.method17648(l, i_133_ >> 8);
		    ((Class505) this).anInt6648 += -1599596327;
		    i_134_++;
		    i_133_ += i_132_;
		}
	    }
	}
	if (!((Class505) this).aClass503_6635
		 .method11460(((Class505) this).aClass503_6644, (byte) 15)) {
	    Class503 class503 = ((Class505) this).aClass503_6644;
	    ((Class505) this).aClass503_6644
		= ((Class505) this).aClass503_6635;
	    ((Class505) this).aClass503_6635 = class503;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6616
		= ((Class505) this).aClass106_6653.anInt1487 * 48887857;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6615
		= ((Class505) this).aClass106_6653.anInt1495 * -1532379311;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6623
		= ((Class505) this).aClass106_6653.anInt1498 * -1284816513;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6617
		= ((Class505) this).aClass106_6653.anInt1497 * 188797131;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6618
		= -1886219871 * ((Class505) this).aClass106_6653.anInt1496;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6624
		= ((Class505) this).aClass106_6653.anInt1499 * -358561697;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6614
		= ((Class505) this).aClass106_6653.anInt1500 * 264343231;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6621
		= ((Class505) this).aClass106_6653.anInt1501 * 373068629;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6622
		= ((Class505) this).aClass106_6653.anInt1502 * -996355931;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6620
		= 1 * ((Class503) ((Class505) this).aClass503_6644).anInt6620;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6619
		= 1 * ((Class503) ((Class505) this).aClass503_6644).anInt6619;
	    ((Class503) ((Class505) this).aClass503_6635).anInt6625
		= ((Class503) ((Class505) this).aClass503_6644).anInt6625 * 1;
	}
	Class487.anInt6470 += ((Class505) this).anInt6648 * 592196213;
    }
    
    void method11477(int i) {
	((Class503) ((Class505) this).aClass503_6635).anInt6616
	    = 48887857 * ((Class505) this).aClass106_6653.anInt1487;
	((Class503) ((Class505) this).aClass503_6635).anInt6615
	    = ((Class505) this).aClass106_6653.anInt1495 * -1532379311;
	((Class503) ((Class505) this).aClass503_6635).anInt6623
	    = ((Class505) this).aClass106_6653.anInt1498 * -1284816513;
	((Class503) ((Class505) this).aClass503_6635).anInt6617
	    = 188797131 * ((Class505) this).aClass106_6653.anInt1497;
	((Class503) ((Class505) this).aClass503_6635).anInt6618
	    = ((Class505) this).aClass106_6653.anInt1496 * -1886219871;
	((Class503) ((Class505) this).aClass503_6635).anInt6624
	    = ((Class505) this).aClass106_6653.anInt1499 * -358561697;
	((Class503) ((Class505) this).aClass503_6635).anInt6614
	    = ((Class505) this).aClass106_6653.anInt1500 * 264343231;
	((Class503) ((Class505) this).aClass503_6635).anInt6621
	    = ((Class505) this).aClass106_6653.anInt1501 * 373068629;
	((Class503) ((Class505) this).aClass503_6635).anInt6622
	    = -996355931 * ((Class505) this).aClass106_6653.anInt1502;
	if (((((Class503) ((Class505) this).aClass503_6635).anInt6616
	      * 701732807)
	     == (878777913
		 * ((Class503) ((Class505) this).aClass503_6635).anInt6617))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6614
		 * -1709083431)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6617
		    * 878777913))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6615
		 * -601488629)
		== (709188769
		    * ((Class503) ((Class505) this).aClass503_6635).anInt6618))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6621
		 * 1531456601)
		== (709188769
		    * ((Class503) ((Class505) this).aClass503_6635).anInt6618))
	    && ((-1576695729
		 * ((Class503) ((Class505) this).aClass503_6635).anInt6624)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6623
		    * -1056430591))
	    && ((((Class503) ((Class505) this).aClass503_6635).anInt6622
		 * -1488927469)
		== (((Class503) ((Class505) this).aClass503_6635).anInt6624
		    * -1576695729)))
	    ((Class505) this).aBool6652 = true;
	else if (((Class505) this).aBool6652) {
	    ((Class505) this).aBool6652 = false;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6616
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6616;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6615
		= ((Class503) ((Class505) this).aClass503_6635).anInt6615 * 1;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6623
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6623;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6617
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6617;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6618
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6618;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6624
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6624;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6614
		= ((Class503) ((Class505) this).aClass503_6635).anInt6614 * 1;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6621
		= 1 * ((Class503) ((Class505) this).aClass503_6635).anInt6621;
	    ((Class503) ((Class505) this).aClass503_6644).anInt6622
		= ((Class503) ((Class505) this).aClass503_6635).anInt6622 * 1;
	}
    }
    
    static final void method11478(ClientScriptData class454, int i) {
	int i_157_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_157_, (byte) -30);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_157_ >> 16];
	Class25.method944(class58, class35, class454, -2144085542);
    }
    
    static final void method11479(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1253503617 * Class13.anInt85;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class13.anInt120 * 255640371;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class13.anInt86 * -689272293;
	Class13.anInt85 = -1430349054;
	Class13.anInt120 = -1443950587;
	Class13.anInt86 = -524501011;
    }
    
    static final void method11480(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	IsaacCipher.method7507(class58, class35, class454, 1132656236);
    }
}
