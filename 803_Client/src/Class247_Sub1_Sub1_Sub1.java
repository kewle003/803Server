/* Class247_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class247_Sub1_Sub1_Sub1 extends Class247_Sub1_Sub1
{
    short aShort11271;
    short aShort11272;
    short aShort11273;
    int anInt11274;
    int anInt11275;
    Class505 aClass505_11276;
    short aShort11277;
    short aShort11278;
    short aShort11279;
    short aShort11280;
    
    void method17645(long l, int i) {
	((Class247_Sub1_Sub1_Sub1) this).aShort11277 -= i;
	if (((Class247_Sub1_Sub1_Sub1) this).aShort11277 <= 0)
	    method17650();
	else {
	    int i_0_ = anInt11064 >> 12;
	    int i_1_ = anInt11061 >> 12;
	    int i_2_ = anInt11060 >> 12;
	    Class489 class489 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass489_6643);
	    Class325 class325 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass325_6637);
	    if (class325.anInt4948 * 1436413983 != 0) {
		if ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt4994 * 533618847) {
		    int i_3_
			= ((anInt11065 >> 8 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 16
			      & 0xff)
			   + class325.anInt4996 * -17377091 * i);
		    int i_4_
			= ((anInt11065 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 8
			      & 0xff)
			   + class325.anInt4997 * -1843785 * i);
		    int i_5_ = ((anInt11065 << 8 & 0xff00)
				+ (((Class247_Sub1_Sub1_Sub1) this).anInt11275
				   & 0xff)
				+ class325.anInt4982 * 1934823691 * i);
		    if (i_3_ < 0)
			i_3_ = 0;
		    else if (i_3_ > 65535)
			i_3_ = 65535;
		    if (i_4_ < 0)
			i_4_ = 0;
		    else if (i_4_ > 65535)
			i_4_ = 65535;
		    if (i_5_ < 0)
			i_5_ = 0;
		    else if (i_5_ > 65535)
			i_5_ = 65535;
		    anInt11065 &= ~0xffffff;
		    anInt11065 |= (((i_3_ & 0xff00) << 8) + (i_4_ & 0xff00)
				   + ((i_5_ & 0xff00) >> 8));
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275 &= ~0xffffff;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275
			|= (((i_3_ & 0xff) << 16) + ((i_4_ & 0xff) << 8)
			    + (i_5_ & 0xff));
		}
		if ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt4972 * -1498515167) {
		    int i_6_
			= ((anInt11065 >> 16 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 24
			      & 0xff)
			   + class325.anInt4999 * -1205940835 * i);
		    if (i_6_ < 0)
			i_6_ = 0;
		    else if (i_6_ > 65535)
			i_6_ = 65535;
		    anInt11065 &= 0xffffff;
		    anInt11065 |= (i_6_ & 0xff00) << 16;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275 &= 0xffffff;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275
			|= (i_6_ & 0xff) << 24;
		}
	    }
	    if (class325.anInt4943 * 1642850419 != -1
		&& ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt5000 * 113795445))
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    += class325.anInt5001 * 1512913547 * i;
	    if (class325.anInt4987 * 366807495 != -1
		&& ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt5002 * -516446423))
		anInt11058 += class325.anInt5003 * -1802673875 * i;
	    if (((Class247_Sub1_Sub1_Sub1) this).aShort11273 != 0)
		aShort11066
		    = (short) (aShort11066 + (((Class247_Sub1_Sub1_Sub1) this)
					      .aShort11273) * i
			       & 0x3fff);
	    double d = (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11280;
	    double d_7_
		= (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11278;
	    double d_8_
		= (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11279;
	    boolean bool = false;
	    if (class325.anInt4937 * 1497508197 == 1) {
		int i_9_
		    = i_0_ - (((Class503)
			       ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					    .aClass505_11276)).aClass503_6635)
			      .anInt6620) * 1184628225;
		int i_10_
		    = i_1_ - (((Class503)
			       ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					    .aClass505_11276)).aClass503_6635)
			      .anInt6619) * -1194700497;
		int i_11_
		    = i_2_ - (((Class503)
			       ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					    .aClass505_11276)).aClass503_6635)
			      .anInt6625) * -1125838207;
		int i_12_
		    = ((int) Math.sqrt((double) (i_9_ * i_9_ + i_10_ * i_10_
						 + i_11_ * i_11_))
		       >> 2);
		long l_13_
		    = (long) (class325.anInt4938 * 2047224083 * i_12_ * i);
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    -= ((long) ((Class247_Sub1_Sub1_Sub1) this).anInt11274
			* l_13_) >> 18;
	    } else if (class325.anInt4937 * 1497508197 == 2) {
		int i_14_
		    = i_0_ - (((Class503)
			       ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					    .aClass505_11276)).aClass503_6635)
			      .anInt6620) * 1184628225;
		int i_15_
		    = i_1_ - (((Class503)
			       ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					    .aClass505_11276)).aClass503_6635)
			      .anInt6619) * -1194700497;
		int i_16_
		    = i_2_ - (((Class503)
			       ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					    .aClass505_11276)).aClass503_6635)
			      .anInt6625) * -1125838207;
		int i_17_ = i_14_ * i_14_ + i_15_ * i_15_ + i_16_ * i_16_;
		long l_18_
		    = (long) (class325.anInt4938 * 2047224083 * i_17_ * i);
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    -= ((long) ((Class247_Sub1_Sub1_Sub1) this).anInt11274
			* l_18_) >> 28;
	    }
	    if (class325.anIntArray4956 != null) {
		Iterator iterator = ((Class489) class489).aList6495.iterator();
		while (iterator.hasNext()) {
		    Class241_Sub4 class241_sub4
			= (Class241_Sub4) iterator.next();
		    Class338 class338
			= ((Class241_Sub4) class241_sub4).aClass338_8810;
		    if (class338.anInt5092 * 2676085 != 1) {
			boolean bool_19_ = false;
			for (int i_20_ = 0;
			     i_20_ < class325.anIntArray4956.length; i_20_++) {
			    if (class325.anIntArray4956[i_20_]
				== class338.anInt5093 * -1512815471) {
				bool_19_ = true;
				break;
			    }
			}
			if (bool_19_) {
			    double d_21_
				= (double) (i_0_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8811) * -1331940757);
			    double d_22_
				= (double) (i_1_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8812) * 214623495);
			    double d_23_
				= (double) (i_2_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8815) * -958400809);
			    double d_24_ = (d_21_ * d_21_ + d_22_ * d_22_
					    + d_23_ * d_23_);
			    if (!(d_24_
				  > (double) (class338.aLong5104
					      * -2669198612719589729L))) {
				double d_25_ = Math.sqrt(d_24_);
				if (d_25_ == 0.0)
				    d_25_ = 1.0;
				double d_26_
				    = ((d_21_ * (double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8814)
					+ d_22_ * (double) (class338.anInt5096
							    * 1684111005)
					+ d_23_ * (double) (((Class241_Sub4)
							     class241_sub4)
							    .aFloat8813))
				       * 65535.0
				       / ((double) (class338.anInt5086
						    * -1400248607)
					  * d_25_));
				if (!(d_26_ < (double) (class338.anInt5105
							* -1437571039))) {
				    double d_27_ = 0.0;
				    if (class338.anInt5098 * 1066833957 == 1)
					d_27_ = (d_25_ / 16.0
						 * (double) (class338.anInt5099
							     * 933168033));
				    else if (class338.anInt5098 * 1066833957
					     == 2)
					d_27_ = (d_25_ / 16.0 * (d_25_ / 16.0)
						 * (double) (class338.anInt5099
							     * 933168033));
				    if (class338.anInt5101 * -1674274517
					== 0) {
					if (class338.anInt5100 * -437942469
					    == 0) {
					    d += ((double) (((Class241_Sub4)
							     class241_sub4)
							    .aFloat8814)
						  - d_27_) * (double) i;
					    d_7_ += ((double) ((class338
								.anInt5096)
							       * 1684111005)
						     - d_27_) * (double) i;
					    d_8_ += ((double) (((Class241_Sub4)
								class241_sub4)
							       .aFloat8813)
						     - d_27_) * (double) i;
					    bool = true;
					} else {
					    anInt11064
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8814)
						    - d_27_) * (double) i;
					    anInt11061
						+= ((double) ((class338
							       .anInt5096)
							      * 1684111005)
						    - d_27_) * (double) i;
					    anInt11060
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8813)
						    - d_27_) * (double) i;
					}
				    } else {
					double d_28_
					    = (d_21_ / d_25_
					       * (double) (class338.anInt5086
							   * -1400248607));
					double d_29_
					    = (d_22_ / d_25_
					       * (double) (class338.anInt5086
							   * -1400248607));
					double d_30_
					    = (d_23_ / d_25_
					       * (double) (class338.anInt5086
							   * -1400248607));
					if (class338.anInt5100 * -437942469
					    == 0) {
					    d += d_28_ * (double) i;
					    d_7_ += d_29_ * (double) i;
					    d_8_ += d_30_ * (double) i;
					    bool = true;
					} else {
					    anInt11064 += d_28_ * (double) i;
					    anInt11061 += d_29_ * (double) i;
					    anInt11060 += d_30_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class325.anIntArray4954 != null) {
		for (int i_31_ = 0; i_31_ < class325.anIntArray4954.length;
		     i_31_++) {
		    Class241_Sub4 class241_sub4
			= ((Class241_Sub4)
			   (Class487.aClass407_6471.get
			    ((long) class325.anIntArray4954[i_31_])));
		    while (class241_sub4 != null) {
			Class338 class338
			    = ((Class241_Sub4) class241_sub4).aClass338_8810;
			double d_32_
			    = (double) (i_0_ - (((Class241_Sub4) class241_sub4)
						.anInt8811) * -1331940757);
			double d_33_
			    = (double) (i_1_ - (((Class241_Sub4) class241_sub4)
						.anInt8812) * 214623495);
			double d_34_
			    = (double) (i_2_ - (((Class241_Sub4) class241_sub4)
						.anInt8815) * -958400809);
			double d_35_
			    = d_32_ * d_32_ + d_33_ * d_33_ + d_34_ * d_34_;
			if (d_35_ > (double) (class338.aLong5104
					      * -2669198612719589729L))
			    class241_sub4
				= (Class241_Sub4) Class487.aClass407_6471
						      .method7289((byte) -38);
			else {
			    double d_36_ = Math.sqrt(d_35_);
			    if (d_36_ == 0.0)
				d_36_ = 1.0;
			    double d_37_
				= ((d_32_ * (double) ((Class241_Sub4)
						      class241_sub4).aFloat8814
				    + d_33_ * (double) (class338.anInt5096
							* 1684111005)
				    + d_34_ * (double) (((Class241_Sub4)
							 class241_sub4)
							.aFloat8813))
				   * 65535.0
				   / ((double) (class338.anInt5086
						* -1400248607)
				      * d_36_));
			    if (d_37_
				< (double) (class338.anInt5105 * -1437571039))
				class241_sub4 = ((Class241_Sub4)
						 Class487.aClass407_6471
						     .method7289((byte) 48));
			    else {
				double d_38_ = 0.0;
				if (class338.anInt5098 * 1066833957 == 1)
				    d_38_ = (d_36_ / 16.0
					     * (double) (class338.anInt5099
							 * 933168033));
				else if (class338.anInt5098 * 1066833957 == 2)
				    d_38_ = (d_36_ / 16.0 * (d_36_ / 16.0)
					     * (double) (class338.anInt5099
							 * 933168033));
				if (class338.anInt5101 * -1674274517 == 0) {
				    if (class338.anInt5100 * -437942469 == 0) {
					d += ((double) (((Class241_Sub4)
							 class241_sub4)
							.aFloat8814)
					      - d_38_) * (double) i;
					d_7_ += ((double) (class338.anInt5096
							   * 1684111005)
						 - d_38_) * (double) i;
					d_8_ += ((double) (((Class241_Sub4)
							    class241_sub4)
							   .aFloat8813)
						 - d_38_) * (double) i;
					bool = true;
				    } else {
					anInt11064
					    += ((double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8814)
						- d_38_) * (double) i;
					anInt11061
					    += ((double) (class338.anInt5096
							  * 1684111005)
						- d_38_) * (double) i;
					anInt11060
					    += ((double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8813)
						- d_38_) * (double) i;
				    }
				} else {
				    double d_39_
					= (d_32_ / d_36_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    double d_40_
					= (d_33_ / d_36_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    double d_41_
					= (d_34_ / d_36_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    if (class338.anInt5100 * -437942469 == 0) {
					d += d_39_ * (double) i;
					d_7_ += d_40_ * (double) i;
					d_8_ += d_41_ * (double) i;
					bool = true;
				    } else {
					anInt11064 += d_39_ * (double) i;
					anInt11061 += d_40_ * (double) i;
					anInt11060 += d_41_ * (double) i;
				    }
				}
				class241_sub4 = ((Class241_Sub4)
						 Class487.aClass407_6471
						     .method7289((byte) 44));
			    }
			}
		    }
		}
	    }
	    if (class325.anIntArray4958 != null) {
		if (class325.anIntArray4959 == null) {
		    class325.anIntArray4959
			= new int[class325.anIntArray4958.length];
		    for (int i_42_ = 0; i_42_ < class325.anIntArray4958.length;
			 i_42_++) {
			Class475_Sub1_Sub1_Sub2.method17767((class325
							     .anIntArray4958
							     [i_42_]),
							    (byte) -27);
			class325.anIntArray4959[i_42_]
			    = (((IntegerNode)
				(Class338.aClass407_5090.get
				 ((long) class325.anIntArray4958[i_42_])))
			       .intValue) * -1859754807;
		    }
		}
		for (int i_43_ = 0; i_43_ < class325.anIntArray4959.length;
		     i_43_++) {
		    Class338 class338 = (Class338.aClass338Array5088
					 [class325.anIntArray4959[i_43_]]);
		    if (class338.anInt5100 * -437942469 == 0) {
			d += (double) (class338.anInt5095 * -54747725 * i);
			d_7_ += (double) (class338.anInt5096 * 1684111005 * i);
			d_8_ += (double) (class338.anInt5097 * -529083375 * i);
			bool = true;
		    } else {
			anInt11064 += class338.anInt5095 * -54747725 * i;
			anInt11061 += class338.anInt5096 * 1684111005 * i;
			anInt11060 += class338.anInt5097 * -529083375 * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_7_ > 32767.0 || d_8_ > 32767.0
		       || d < -32767.0 || d_7_ < -32767.0 || d_8_ < -32767.0) {
		    d /= 2.0;
		    d_7_ /= 2.0;
		    d_8_ /= 2.0;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11274 <<= 1;
		}
		((Class247_Sub1_Sub1_Sub1) this).aShort11280 = (short) (int) d;
		((Class247_Sub1_Sub1_Sub1) this).aShort11278
		    = (short) (int) d_7_;
		((Class247_Sub1_Sub1_Sub1) this).aShort11279
		    = (short) (int) d_8_;
	    }
	    anInt11064
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11280
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	    anInt11061
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11278
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	    anInt11060
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11279
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	}
    }
    
    void method17646(Class505 class505, int i, int i_44_, int i_45_, int i_46_,
		     int i_47_, int i_48_, int i_49_, int i_50_, int i_51_,
		     int i_52_, int i_53_, int i_54_, int i_55_, boolean bool,
		     boolean bool_56_) {
	((Class247_Sub1_Sub1_Sub1) this).aClass505_11276 = class505;
	anInt11064 = i << 12;
	anInt11061 = i_44_ << 12;
	anInt11060 = i_45_ << 12;
	anInt11065 = i_51_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11271
	    = ((Class247_Sub1_Sub1_Sub1) this).aShort11277 = (short) i_50_;
	anInt11058 = i_52_;
	aShort11066 = (short) i_53_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11273 = (short) i_54_;
	anInt11062 = i_55_;
	aBool11067 = bool_56_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11280 = (short) i_46_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11278 = (short) i_47_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11279 = (short) i_48_;
	((Class247_Sub1_Sub1_Sub1) this).anInt11274 = i_49_;
	method17647();
    }
    
    void method17647() {
	int i = (((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					  .aClass505_11276)).aClass489_6643)
		 .anInt6494);
	if ((((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
				      .aClass505_11276)).aClass489_6643)
	     .aClass247_Sub1_Sub1_Sub1Array6491[i])
	    != null)
	    ((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
				     .aClass505_11276)).aClass489_6643)
		.aClass247_Sub1_Sub1_Sub1Array6491[i].method17650();
	((Class489)
	 (((Class505) ((Class247_Sub1_Sub1_Sub1) this).aClass505_11276)
	  .aClass489_6643)).aClass247_Sub1_Sub1_Sub1Array6491[i]
	    = this;
	((Class247_Sub1_Sub1_Sub1) this).aShort11272
	    = (short) ((Class489) (((Class505) ((Class247_Sub1_Sub1_Sub1)
						this).aClass505_11276)
				   .aClass489_6643)).anInt6494;
	((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
				 .aClass505_11276)).aClass489_6643).anInt6494
	    = i + 1 & 0x1fff;
	((Class505) ((Class247_Sub1_Sub1_Sub1) this).aClass505_11276)
	    .aClass421_6639.method7522(this, -1665299415);
    }
    
    void method17648(long l, int i) {
	((Class247_Sub1_Sub1_Sub1) this).aShort11277 -= i;
	if (((Class247_Sub1_Sub1_Sub1) this).aShort11277 <= 0)
	    method17650();
	else {
	    int i_57_ = anInt11064 >> 12;
	    int i_58_ = anInt11061 >> 12;
	    int i_59_ = anInt11060 >> 12;
	    Class489 class489 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass489_6643);
	    Class325 class325 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass325_6637);
	    if (class325.anInt4948 * 1436413983 != 0) {
		if ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt4994 * 533618847) {
		    int i_60_
			= ((anInt11065 >> 8 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 16
			      & 0xff)
			   + class325.anInt4996 * -17377091 * i);
		    int i_61_
			= ((anInt11065 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 8
			      & 0xff)
			   + class325.anInt4997 * -1843785 * i);
		    int i_62_ = ((anInt11065 << 8 & 0xff00)
				 + (((Class247_Sub1_Sub1_Sub1) this).anInt11275
				    & 0xff)
				 + class325.anInt4982 * 1934823691 * i);
		    if (i_60_ < 0)
			i_60_ = 0;
		    else if (i_60_ > 65535)
			i_60_ = 65535;
		    if (i_61_ < 0)
			i_61_ = 0;
		    else if (i_61_ > 65535)
			i_61_ = 65535;
		    if (i_62_ < 0)
			i_62_ = 0;
		    else if (i_62_ > 65535)
			i_62_ = 65535;
		    anInt11065 &= ~0xffffff;
		    anInt11065 |= (((i_60_ & 0xff00) << 8) + (i_61_ & 0xff00)
				   + ((i_62_ & 0xff00) >> 8));
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275 &= ~0xffffff;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275
			|= (((i_60_ & 0xff) << 16) + ((i_61_ & 0xff) << 8)
			    + (i_62_ & 0xff));
		}
		if ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt4972 * -1498515167) {
		    int i_63_
			= ((anInt11065 >> 16 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 24
			      & 0xff)
			   + class325.anInt4999 * -1205940835 * i);
		    if (i_63_ < 0)
			i_63_ = 0;
		    else if (i_63_ > 65535)
			i_63_ = 65535;
		    anInt11065 &= 0xffffff;
		    anInt11065 |= (i_63_ & 0xff00) << 16;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275 &= 0xffffff;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275
			|= (i_63_ & 0xff) << 24;
		}
	    }
	    if (class325.anInt4943 * 1642850419 != -1
		&& ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt5000 * 113795445))
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    += class325.anInt5001 * 1512913547 * i;
	    if (class325.anInt4987 * 366807495 != -1
		&& ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt5002 * -516446423))
		anInt11058 += class325.anInt5003 * -1802673875 * i;
	    if (((Class247_Sub1_Sub1_Sub1) this).aShort11273 != 0)
		aShort11066
		    = (short) (aShort11066 + (((Class247_Sub1_Sub1_Sub1) this)
					      .aShort11273) * i
			       & 0x3fff);
	    double d = (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11280;
	    double d_64_
		= (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11278;
	    double d_65_
		= (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11279;
	    boolean bool = false;
	    if (class325.anInt4937 * 1497508197 == 1) {
		int i_66_
		    = i_57_ - (((Class503)
				((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					     .aClass505_11276)).aClass503_6635)
			       .anInt6620) * 1184628225;
		int i_67_
		    = i_58_ - (((Class503)
				((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					     .aClass505_11276)).aClass503_6635)
			       .anInt6619) * -1194700497;
		int i_68_
		    = i_59_ - (((Class503)
				((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					     .aClass505_11276)).aClass503_6635)
			       .anInt6625) * -1125838207;
		int i_69_
		    = ((int) Math.sqrt((double) (i_66_ * i_66_ + i_67_ * i_67_
						 + i_68_ * i_68_))
		       >> 2);
		long l_70_
		    = (long) (class325.anInt4938 * 2047224083 * i_69_ * i);
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    -= ((long) ((Class247_Sub1_Sub1_Sub1) this).anInt11274
			* l_70_) >> 18;
	    } else if (class325.anInt4937 * 1497508197 == 2) {
		int i_71_
		    = i_57_ - (((Class503)
				((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					     .aClass505_11276)).aClass503_6635)
			       .anInt6620) * 1184628225;
		int i_72_
		    = i_58_ - (((Class503)
				((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					     .aClass505_11276)).aClass503_6635)
			       .anInt6619) * -1194700497;
		int i_73_
		    = i_59_ - (((Class503)
				((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					     .aClass505_11276)).aClass503_6635)
			       .anInt6625) * -1125838207;
		int i_74_ = i_71_ * i_71_ + i_72_ * i_72_ + i_73_ * i_73_;
		long l_75_
		    = (long) (class325.anInt4938 * 2047224083 * i_74_ * i);
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    -= ((long) ((Class247_Sub1_Sub1_Sub1) this).anInt11274
			* l_75_) >> 28;
	    }
	    if (class325.anIntArray4956 != null) {
		Iterator iterator = ((Class489) class489).aList6495.iterator();
		while (iterator.hasNext()) {
		    Class241_Sub4 class241_sub4
			= (Class241_Sub4) iterator.next();
		    Class338 class338
			= ((Class241_Sub4) class241_sub4).aClass338_8810;
		    if (class338.anInt5092 * 2676085 != 1) {
			boolean bool_76_ = false;
			for (int i_77_ = 0;
			     i_77_ < class325.anIntArray4956.length; i_77_++) {
			    if (class325.anIntArray4956[i_77_]
				== class338.anInt5093 * -1512815471) {
				bool_76_ = true;
				break;
			    }
			}
			if (bool_76_) {
			    double d_78_
				= (double) (i_57_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8811) * -1331940757);
			    double d_79_
				= (double) (i_58_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8812) * 214623495);
			    double d_80_
				= (double) (i_59_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8815) * -958400809);
			    double d_81_ = (d_78_ * d_78_ + d_79_ * d_79_
					    + d_80_ * d_80_);
			    if (!(d_81_
				  > (double) (class338.aLong5104
					      * -2669198612719589729L))) {
				double d_82_ = Math.sqrt(d_81_);
				if (d_82_ == 0.0)
				    d_82_ = 1.0;
				double d_83_
				    = ((d_78_ * (double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8814)
					+ d_79_ * (double) (class338.anInt5096
							    * 1684111005)
					+ d_80_ * (double) (((Class241_Sub4)
							     class241_sub4)
							    .aFloat8813))
				       * 65535.0
				       / ((double) (class338.anInt5086
						    * -1400248607)
					  * d_82_));
				if (!(d_83_ < (double) (class338.anInt5105
							* -1437571039))) {
				    double d_84_ = 0.0;
				    if (class338.anInt5098 * 1066833957 == 1)
					d_84_ = (d_82_ / 16.0
						 * (double) (class338.anInt5099
							     * 933168033));
				    else if (class338.anInt5098 * 1066833957
					     == 2)
					d_84_ = (d_82_ / 16.0 * (d_82_ / 16.0)
						 * (double) (class338.anInt5099
							     * 933168033));
				    if (class338.anInt5101 * -1674274517
					== 0) {
					if (class338.anInt5100 * -437942469
					    == 0) {
					    d += ((double) (((Class241_Sub4)
							     class241_sub4)
							    .aFloat8814)
						  - d_84_) * (double) i;
					    d_64_ += ((double) ((class338
								 .anInt5096)
								* 1684111005)
						      - d_84_) * (double) i;
					    d_65_
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8813)
						    - d_84_) * (double) i;
					    bool = true;
					} else {
					    anInt11064
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8814)
						    - d_84_) * (double) i;
					    anInt11061
						+= ((double) ((class338
							       .anInt5096)
							      * 1684111005)
						    - d_84_) * (double) i;
					    anInt11060
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8813)
						    - d_84_) * (double) i;
					}
				    } else {
					double d_85_
					    = (d_78_ / d_82_
					       * (double) (class338.anInt5086
							   * -1400248607));
					double d_86_
					    = (d_79_ / d_82_
					       * (double) (class338.anInt5086
							   * -1400248607));
					double d_87_
					    = (d_80_ / d_82_
					       * (double) (class338.anInt5086
							   * -1400248607));
					if (class338.anInt5100 * -437942469
					    == 0) {
					    d += d_85_ * (double) i;
					    d_64_ += d_86_ * (double) i;
					    d_65_ += d_87_ * (double) i;
					    bool = true;
					} else {
					    anInt11064 += d_85_ * (double) i;
					    anInt11061 += d_86_ * (double) i;
					    anInt11060 += d_87_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class325.anIntArray4954 != null) {
		for (int i_88_ = 0; i_88_ < class325.anIntArray4954.length;
		     i_88_++) {
		    Class241_Sub4 class241_sub4
			= ((Class241_Sub4)
			   (Class487.aClass407_6471.get
			    ((long) class325.anIntArray4954[i_88_])));
		    while (class241_sub4 != null) {
			Class338 class338
			    = ((Class241_Sub4) class241_sub4).aClass338_8810;
			double d_89_
			    = (double) (i_57_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8811) * -1331940757);
			double d_90_
			    = (double) (i_58_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8812) * 214623495);
			double d_91_
			    = (double) (i_59_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8815) * -958400809);
			double d_92_
			    = d_89_ * d_89_ + d_90_ * d_90_ + d_91_ * d_91_;
			if (d_92_ > (double) (class338.aLong5104
					      * -2669198612719589729L))
			    class241_sub4
				= (Class241_Sub4) Class487.aClass407_6471
						      .method7289((byte) 67);
			else {
			    double d_93_ = Math.sqrt(d_92_);
			    if (d_93_ == 0.0)
				d_93_ = 1.0;
			    double d_94_
				= ((d_89_ * (double) ((Class241_Sub4)
						      class241_sub4).aFloat8814
				    + d_90_ * (double) (class338.anInt5096
							* 1684111005)
				    + d_91_ * (double) (((Class241_Sub4)
							 class241_sub4)
							.aFloat8813))
				   * 65535.0
				   / ((double) (class338.anInt5086
						* -1400248607)
				      * d_93_));
			    if (d_94_
				< (double) (class338.anInt5105 * -1437571039))
				class241_sub4 = ((Class241_Sub4)
						 Class487.aClass407_6471
						     .method7289((byte) -38));
			    else {
				double d_95_ = 0.0;
				if (class338.anInt5098 * 1066833957 == 1)
				    d_95_ = (d_93_ / 16.0
					     * (double) (class338.anInt5099
							 * 933168033));
				else if (class338.anInt5098 * 1066833957 == 2)
				    d_95_ = (d_93_ / 16.0 * (d_93_ / 16.0)
					     * (double) (class338.anInt5099
							 * 933168033));
				if (class338.anInt5101 * -1674274517 == 0) {
				    if (class338.anInt5100 * -437942469 == 0) {
					d += ((double) (((Class241_Sub4)
							 class241_sub4)
							.aFloat8814)
					      - d_95_) * (double) i;
					d_64_ += ((double) (class338.anInt5096
							    * 1684111005)
						  - d_95_) * (double) i;
					d_65_ += ((double) (((Class241_Sub4)
							     class241_sub4)
							    .aFloat8813)
						  - d_95_) * (double) i;
					bool = true;
				    } else {
					anInt11064
					    += ((double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8814)
						- d_95_) * (double) i;
					anInt11061
					    += ((double) (class338.anInt5096
							  * 1684111005)
						- d_95_) * (double) i;
					anInt11060
					    += ((double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8813)
						- d_95_) * (double) i;
				    }
				} else {
				    double d_96_
					= (d_89_ / d_93_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    double d_97_
					= (d_90_ / d_93_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    double d_98_
					= (d_91_ / d_93_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    if (class338.anInt5100 * -437942469 == 0) {
					d += d_96_ * (double) i;
					d_64_ += d_97_ * (double) i;
					d_65_ += d_98_ * (double) i;
					bool = true;
				    } else {
					anInt11064 += d_96_ * (double) i;
					anInt11061 += d_97_ * (double) i;
					anInt11060 += d_98_ * (double) i;
				    }
				}
				class241_sub4 = ((Class241_Sub4)
						 Class487.aClass407_6471
						     .method7289((byte) 5));
			    }
			}
		    }
		}
	    }
	    if (class325.anIntArray4958 != null) {
		if (class325.anIntArray4959 == null) {
		    class325.anIntArray4959
			= new int[class325.anIntArray4958.length];
		    for (int i_99_ = 0; i_99_ < class325.anIntArray4958.length;
			 i_99_++) {
			Class475_Sub1_Sub1_Sub2.method17767((class325
							     .anIntArray4958
							     [i_99_]),
							    (byte) 30);
			class325.anIntArray4959[i_99_]
			    = (((IntegerNode)
				(Class338.aClass407_5090.get
				 ((long) class325.anIntArray4958[i_99_])))
			       .intValue) * -1859754807;
		    }
		}
		for (int i_100_ = 0; i_100_ < class325.anIntArray4959.length;
		     i_100_++) {
		    Class338 class338 = (Class338.aClass338Array5088
					 [class325.anIntArray4959[i_100_]]);
		    if (class338.anInt5100 * -437942469 == 0) {
			d += (double) (class338.anInt5095 * -54747725 * i);
			d_64_
			    += (double) (class338.anInt5096 * 1684111005 * i);
			d_65_
			    += (double) (class338.anInt5097 * -529083375 * i);
			bool = true;
		    } else {
			anInt11064 += class338.anInt5095 * -54747725 * i;
			anInt11061 += class338.anInt5096 * 1684111005 * i;
			anInt11060 += class338.anInt5097 * -529083375 * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_64_ > 32767.0 || d_65_ > 32767.0
		       || d < -32767.0 || d_64_ < -32767.0
		       || d_65_ < -32767.0) {
		    d /= 2.0;
		    d_64_ /= 2.0;
		    d_65_ /= 2.0;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11274 <<= 1;
		}
		((Class247_Sub1_Sub1_Sub1) this).aShort11280 = (short) (int) d;
		((Class247_Sub1_Sub1_Sub1) this).aShort11278
		    = (short) (int) d_64_;
		((Class247_Sub1_Sub1_Sub1) this).aShort11279
		    = (short) (int) d_65_;
	    }
	    anInt11064
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11280
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	    anInt11061
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11278
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	    anInt11060
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11279
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	}
    }
    
    void method17649(Class552 class552, Class103 class103, long l) {
	int i = anInt11064 >> 12 + class552.anInt7123 * 1591782305;
	int i_101_ = anInt11060 >> 12 + class552.anInt7123 * 1591782305;
	int i_102_ = anInt11061 >> 12;
	if (i_102_ > 262144 || i_102_ < -262144 || i < 0
	    || i >= class552.anInt7138 * 120442351 || i_101_ < 0
	    || i_101_ >= class552.anInt7142 * -2069974325)
	    method17650();
	else {
	    Class489 class489 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass489_6643);
	    Class325 class325 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass325_6637);
	    Class166[] class166s = class552.aClass166Array7184;
	    int i_103_ = ((Class489) class489).anInt6496;
	    Class548 class548 = (class552.aClass548ArrayArrayArray7169
				 [((Class489) class489).anInt6496][i][i_101_]);
	    if (class548 != null)
		i_103_ = class548.aByte7054;
	    int i_104_ = class166s[i_103_].method3551(i, i_101_, -1863311016);
	    int i_105_;
	    if (i_103_ < class552.anInt7132 * 532429613 - 1)
		i_105_
		    = class166s[i_103_ + 1].method3551(i, i_101_, -585946579);
	    else
		i_105_ = i_104_ - (8 << class552.anInt7123 * 1591782305);
	    if (class325.aBool4981) {
		if (class325.anInt4961 * 736372665 == -1 && i_102_ > i_104_) {
		    method17650();
		    return;
		}
		if (class325.anInt4961 * 736372665 >= 0
		    && i_102_ > class166s[class325.anInt4961 * 736372665]
				    .method3551(i, i_101_, -1332804535)) {
		    method17650();
		    return;
		}
		if (class325.anInt4998 * -530465999 == -1 && i_102_ < i_105_) {
		    method17650();
		    return;
		}
		if (class325.anInt4998 * -530465999 >= 0
		    && i_102_ < class166s
				    [class325.anInt4998 * -530465999 + 1]
				    .method3551(i, i_101_, 919462270)) {
		    method17650();
		    return;
		}
	    }
	    int i_106_;
	    for (i_106_ = class552.anInt7132 * 532429613 - 1;
		 (i_106_ > 0
		  && i_102_ > class166s[i_106_].method3551(i, i_101_,
							   600935138));
		 i_106_--) {
		/* empty */
	    }
	    if (class325.aBool4979 && i_106_ == 0
		&& i_102_ > class166s[0].method3551(i, i_101_, 803197647))
		method17650();
	    else if (i_106_ == class552.anInt7132 * 532429613 - 1
		     && (class166s[i_106_].method3551(i, i_101_, -66896381)
			 - i_102_) > 8 << class552.anInt7123 * 1591782305)
		method17650();
	    else {
		class548
		    = class552.aClass548ArrayArrayArray7169[i_106_][i][i_101_];
		if (class548 == null) {
		    if (i_106_ == 0
			|| (class552.aClass548ArrayArrayArray7169[0][i][i_101_]
			    == null))
			class548 = class552.aClass548ArrayArrayArray7169[0]
				       [i][i_101_] = new Class548(0);
		    boolean bool = ((class552.aClass548ArrayArrayArray7169[0]
				     [i][i_101_].aClass548_7063)
				    != null);
		    if (i_106_ == 3 && bool)
			i_106_--;
		    for (int i_107_ = 1; i_107_ <= i_106_; i_107_++) {
			if ((class552.aClass548ArrayArrayArray7169[i_107_][i]
			     [i_101_])
			    == null) {
			    class548
				= class552.aClass548ArrayArrayArray7169
				      [i_107_][i][i_101_]
				= new Class548(i_107_);
			    if (bool)
				class548.aByte7054++;
			}
		    }
		    if (class548 == null)
			class548 = (class552.aClass548ArrayArrayArray7169
				    [i_106_][i][i_101_]);
		}
		if (class325.aBool4942) {
		    int i_108_ = anInt11064 >> 12;
		    int i_109_ = anInt11060 >> 12;
		    if (class548.aClass475_Sub1_Sub3_7055 != null) {
			Class535 class535
			    = class548.aClass475_Sub1_Sub3_7055
				  .method14457(class103, 1696196813);
			if (class535 != null
			    && class535.method11885(i_108_, i_102_, i_109_)) {
			    method17650();
			    return;
			}
		    }
		    if (class548.aClass475_Sub1_Sub3_7056 != null) {
			Class535 class535
			    = class548.aClass475_Sub1_Sub3_7056
				  .method14457(class103, 1777395858);
			if (class535 != null
			    && class535.method11885(i_108_, i_102_, i_109_)) {
			    method17650();
			    return;
			}
		    }
		    if (class548.aClass475_Sub1_Sub4_7058 != null) {
			Class535 class535
			    = class548.aClass475_Sub1_Sub4_7058
				  .method14457(class103, 1712336849);
			if (class535 != null
			    && class535.method11885(i_108_, i_102_, i_109_)) {
			    method17650();
			    return;
			}
		    }
		    for (Class541 class541 = class548.aClass541_7053;
			 class541 != null;
			 class541 = class541.aClass541_7005) {
			Class535 class535
			    = class541.aClass475_Sub1_Sub1_7004
				  .method14457(class103, 1893400035);
			if (class535 != null
			    && class535.method11885(i_108_, i_102_, i_109_)) {
			    method17650();
			    return;
			}
		    }
		}
		((Class489) class489).aClass98_6497.aClass441_1353
		    .method7834(this, 1839322399);
	    }
	}
    }
    
    void method17650() {
	((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
				 .aClass505_11276)).aClass489_6643)
	    .aClass247_Sub1_Sub1_Sub1Array6491
	    [((Class247_Sub1_Sub1_Sub1) this).aShort11272]
	    = null;
	Class487.aClass247_Sub1_Sub1_Sub1Array6478[(Class487.anInt6473
						    * 1435230355)]
	    = this;
	Class487.anInt6473
	    = (Class487.anInt6473 * 1435230355 + 1 & 0x3ff) * 478428571;
	method4944((byte) -26);
	method16297(-1994785871);
    }
    
    void method17651(Class505 class505, int i, int i_110_, int i_111_,
		     int i_112_, int i_113_, int i_114_, int i_115_,
		     int i_116_, int i_117_, int i_118_, int i_119_,
		     int i_120_, int i_121_, boolean bool, boolean bool_122_) {
	((Class247_Sub1_Sub1_Sub1) this).aClass505_11276 = class505;
	anInt11064 = i << 12;
	anInt11061 = i_110_ << 12;
	anInt11060 = i_111_ << 12;
	anInt11065 = i_117_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11271
	    = ((Class247_Sub1_Sub1_Sub1) this).aShort11277 = (short) i_116_;
	anInt11058 = i_118_;
	aShort11066 = (short) i_119_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11273 = (short) i_120_;
	anInt11062 = i_121_;
	aBool11067 = bool_122_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11280 = (short) i_112_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11278 = (short) i_113_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11279 = (short) i_114_;
	((Class247_Sub1_Sub1_Sub1) this).anInt11274 = i_115_;
	method17647();
    }
    
    void method17652(long l, int i) {
	((Class247_Sub1_Sub1_Sub1) this).aShort11277 -= i;
	if (((Class247_Sub1_Sub1_Sub1) this).aShort11277 <= 0)
	    method17650();
	else {
	    int i_123_ = anInt11064 >> 12;
	    int i_124_ = anInt11061 >> 12;
	    int i_125_ = anInt11060 >> 12;
	    Class489 class489 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass489_6643);
	    Class325 class325 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass325_6637);
	    if (class325.anInt4948 * 1436413983 != 0) {
		if ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt4994 * 533618847) {
		    int i_126_
			= ((anInt11065 >> 8 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 16
			      & 0xff)
			   + class325.anInt4996 * -17377091 * i);
		    int i_127_
			= ((anInt11065 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 8
			      & 0xff)
			   + class325.anInt4997 * -1843785 * i);
		    int i_128_
			= ((anInt11065 << 8 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275
			      & 0xff)
			   + class325.anInt4982 * 1934823691 * i);
		    if (i_126_ < 0)
			i_126_ = 0;
		    else if (i_126_ > 65535)
			i_126_ = 65535;
		    if (i_127_ < 0)
			i_127_ = 0;
		    else if (i_127_ > 65535)
			i_127_ = 65535;
		    if (i_128_ < 0)
			i_128_ = 0;
		    else if (i_128_ > 65535)
			i_128_ = 65535;
		    anInt11065 &= ~0xffffff;
		    anInt11065 |= (((i_126_ & 0xff00) << 8) + (i_127_ & 0xff00)
				   + ((i_128_ & 0xff00) >> 8));
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275 &= ~0xffffff;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275
			|= (((i_126_ & 0xff) << 16) + ((i_127_ & 0xff) << 8)
			    + (i_128_ & 0xff));
		}
		if ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt4972 * -1498515167) {
		    int i_129_
			= ((anInt11065 >> 16 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 24
			      & 0xff)
			   + class325.anInt4999 * -1205940835 * i);
		    if (i_129_ < 0)
			i_129_ = 0;
		    else if (i_129_ > 65535)
			i_129_ = 65535;
		    anInt11065 &= 0xffffff;
		    anInt11065 |= (i_129_ & 0xff00) << 16;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275 &= 0xffffff;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275
			|= (i_129_ & 0xff) << 24;
		}
	    }
	    if (class325.anInt4943 * 1642850419 != -1
		&& ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt5000 * 113795445))
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    += class325.anInt5001 * 1512913547 * i;
	    if (class325.anInt4987 * 366807495 != -1
		&& ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt5002 * -516446423))
		anInt11058 += class325.anInt5003 * -1802673875 * i;
	    if (((Class247_Sub1_Sub1_Sub1) this).aShort11273 != 0)
		aShort11066
		    = (short) (aShort11066 + (((Class247_Sub1_Sub1_Sub1) this)
					      .aShort11273) * i
			       & 0x3fff);
	    double d = (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11280;
	    double d_130_
		= (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11278;
	    double d_131_
		= (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11279;
	    boolean bool = false;
	    if (class325.anInt4937 * 1497508197 == 1) {
		int i_132_
		    = i_123_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6620 * 1184628225;
		int i_133_
		    = i_124_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6619 * -1194700497;
		int i_134_
		    = i_125_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6625 * -1125838207;
		int i_135_ = ((int) Math.sqrt((double) (i_132_ * i_132_
							+ i_133_ * i_133_
							+ i_134_ * i_134_))
			      >> 2);
		long l_136_
		    = (long) (class325.anInt4938 * 2047224083 * i_135_ * i);
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    -= ((long) ((Class247_Sub1_Sub1_Sub1) this).anInt11274
			* l_136_) >> 18;
	    } else if (class325.anInt4937 * 1497508197 == 2) {
		int i_137_
		    = i_123_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6620 * 1184628225;
		int i_138_
		    = i_124_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6619 * -1194700497;
		int i_139_
		    = i_125_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6625 * -1125838207;
		int i_140_
		    = i_137_ * i_137_ + i_138_ * i_138_ + i_139_ * i_139_;
		long l_141_
		    = (long) (class325.anInt4938 * 2047224083 * i_140_ * i);
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    -= ((long) ((Class247_Sub1_Sub1_Sub1) this).anInt11274
			* l_141_) >> 28;
	    }
	    if (class325.anIntArray4956 != null) {
		Iterator iterator = ((Class489) class489).aList6495.iterator();
		while (iterator.hasNext()) {
		    Class241_Sub4 class241_sub4
			= (Class241_Sub4) iterator.next();
		    Class338 class338
			= ((Class241_Sub4) class241_sub4).aClass338_8810;
		    if (class338.anInt5092 * 2676085 != 1) {
			boolean bool_142_ = false;
			for (int i_143_ = 0;
			     i_143_ < class325.anIntArray4956.length;
			     i_143_++) {
			    if (class325.anIntArray4956[i_143_]
				== class338.anInt5093 * -1512815471) {
				bool_142_ = true;
				break;
			    }
			}
			if (bool_142_) {
			    double d_144_
				= (double) (i_123_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8811) * -1331940757);
			    double d_145_
				= (double) (i_124_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8812) * 214623495);
			    double d_146_
				= (double) (i_125_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8815) * -958400809);
			    double d_147_ = (d_144_ * d_144_ + d_145_ * d_145_
					     + d_146_ * d_146_);
			    if (!(d_147_
				  > (double) (class338.aLong5104
					      * -2669198612719589729L))) {
				double d_148_ = Math.sqrt(d_147_);
				if (d_148_ == 0.0)
				    d_148_ = 1.0;
				double d_149_
				    = ((d_144_ * (double) (((Class241_Sub4)
							    class241_sub4)
							   .aFloat8814)
					+ d_145_ * (double) (class338.anInt5096
							     * 1684111005)
					+ d_146_ * (double) (((Class241_Sub4)
							      class241_sub4)
							     .aFloat8813))
				       * 65535.0
				       / ((double) (class338.anInt5086
						    * -1400248607)
					  * d_148_));
				if (!(d_149_ < (double) (class338.anInt5105
							 * -1437571039))) {
				    double d_150_ = 0.0;
				    if (class338.anInt5098 * 1066833957 == 1)
					d_150_
					    = (d_148_ / 16.0
					       * (double) (class338.anInt5099
							   * 933168033));
				    else if (class338.anInt5098 * 1066833957
					     == 2)
					d_150_
					    = (d_148_ / 16.0 * (d_148_ / 16.0)
					       * (double) (class338.anInt5099
							   * 933168033));
				    if (class338.anInt5101 * -1674274517
					== 0) {
					if (class338.anInt5100 * -437942469
					    == 0) {
					    d += ((double) (((Class241_Sub4)
							     class241_sub4)
							    .aFloat8814)
						  - d_150_) * (double) i;
					    d_130_ += ((double) ((class338
								  .anInt5096)
								 * 1684111005)
						       - d_150_) * (double) i;
					    d_131_
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8813)
						    - d_150_) * (double) i;
					    bool = true;
					} else {
					    anInt11064
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8814)
						    - d_150_) * (double) i;
					    anInt11061
						+= ((double) ((class338
							       .anInt5096)
							      * 1684111005)
						    - d_150_) * (double) i;
					    anInt11060
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8813)
						    - d_150_) * (double) i;
					}
				    } else {
					double d_151_
					    = (d_144_ / d_148_
					       * (double) (class338.anInt5086
							   * -1400248607));
					double d_152_
					    = (d_145_ / d_148_
					       * (double) (class338.anInt5086
							   * -1400248607));
					double d_153_
					    = (d_146_ / d_148_
					       * (double) (class338.anInt5086
							   * -1400248607));
					if (class338.anInt5100 * -437942469
					    == 0) {
					    d += d_151_ * (double) i;
					    d_130_ += d_152_ * (double) i;
					    d_131_ += d_153_ * (double) i;
					    bool = true;
					} else {
					    anInt11064 += d_151_ * (double) i;
					    anInt11061 += d_152_ * (double) i;
					    anInt11060 += d_153_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class325.anIntArray4954 != null) {
		for (int i_154_ = 0; i_154_ < class325.anIntArray4954.length;
		     i_154_++) {
		    Class241_Sub4 class241_sub4
			= ((Class241_Sub4)
			   (Class487.aClass407_6471.get
			    ((long) class325.anIntArray4954[i_154_])));
		    while (class241_sub4 != null) {
			Class338 class338
			    = ((Class241_Sub4) class241_sub4).aClass338_8810;
			double d_155_
			    = (double) (i_123_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8811) * -1331940757);
			double d_156_
			    = (double) (i_124_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8812) * 214623495);
			double d_157_
			    = (double) (i_125_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8815) * -958400809);
			double d_158_ = (d_155_ * d_155_ + d_156_ * d_156_
					 + d_157_ * d_157_);
			if (d_158_ > (double) (class338.aLong5104
					       * -2669198612719589729L))
			    class241_sub4
				= (Class241_Sub4) Class487.aClass407_6471
						      .method7289((byte) 8);
			else {
			    double d_159_ = Math.sqrt(d_158_);
			    if (d_159_ == 0.0)
				d_159_ = 1.0;
			    double d_160_
				= ((d_155_ * (double) (((Class241_Sub4)
							class241_sub4)
						       .aFloat8814)
				    + d_156_ * (double) (class338.anInt5096
							 * 1684111005)
				    + d_157_ * (double) (((Class241_Sub4)
							  class241_sub4)
							 .aFloat8813))
				   * 65535.0
				   / ((double) (class338.anInt5086
						* -1400248607)
				      * d_159_));
			    if (d_160_
				< (double) (class338.anInt5105 * -1437571039))
				class241_sub4 = ((Class241_Sub4)
						 Class487.aClass407_6471
						     .method7289((byte) -22));
			    else {
				double d_161_ = 0.0;
				if (class338.anInt5098 * 1066833957 == 1)
				    d_161_ = (d_159_ / 16.0
					      * (double) (class338.anInt5099
							  * 933168033));
				else if (class338.anInt5098 * 1066833957 == 2)
				    d_161_ = (d_159_ / 16.0 * (d_159_ / 16.0)
					      * (double) (class338.anInt5099
							  * 933168033));
				if (class338.anInt5101 * -1674274517 == 0) {
				    if (class338.anInt5100 * -437942469 == 0) {
					d += ((double) (((Class241_Sub4)
							 class241_sub4)
							.aFloat8814)
					      - d_161_) * (double) i;
					d_130_ += ((double) (class338.anInt5096
							     * 1684111005)
						   - d_161_) * (double) i;
					d_131_ += ((double) (((Class241_Sub4)
							      class241_sub4)
							     .aFloat8813)
						   - d_161_) * (double) i;
					bool = true;
				    } else {
					anInt11064
					    += ((double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8814)
						- d_161_) * (double) i;
					anInt11061
					    += ((double) (class338.anInt5096
							  * 1684111005)
						- d_161_) * (double) i;
					anInt11060
					    += ((double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8813)
						- d_161_) * (double) i;
				    }
				} else {
				    double d_162_
					= (d_155_ / d_159_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    double d_163_
					= (d_156_ / d_159_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    double d_164_
					= (d_157_ / d_159_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    if (class338.anInt5100 * -437942469 == 0) {
					d += d_162_ * (double) i;
					d_130_ += d_163_ * (double) i;
					d_131_ += d_164_ * (double) i;
					bool = true;
				    } else {
					anInt11064 += d_162_ * (double) i;
					anInt11061 += d_163_ * (double) i;
					anInt11060 += d_164_ * (double) i;
				    }
				}
				class241_sub4 = ((Class241_Sub4)
						 Class487.aClass407_6471
						     .method7289((byte) -21));
			    }
			}
		    }
		}
	    }
	    if (class325.anIntArray4958 != null) {
		if (class325.anIntArray4959 == null) {
		    class325.anIntArray4959
			= new int[class325.anIntArray4958.length];
		    for (int i_165_ = 0;
			 i_165_ < class325.anIntArray4958.length; i_165_++) {
			Class475_Sub1_Sub1_Sub2.method17767((class325
							     .anIntArray4958
							     [i_165_]),
							    (byte) -26);
			class325.anIntArray4959[i_165_]
			    = (((IntegerNode)
				(Class338.aClass407_5090.get
				 ((long) class325.anIntArray4958[i_165_])))
			       .intValue) * -1859754807;
		    }
		}
		for (int i_166_ = 0; i_166_ < class325.anIntArray4959.length;
		     i_166_++) {
		    Class338 class338 = (Class338.aClass338Array5088
					 [class325.anIntArray4959[i_166_]]);
		    if (class338.anInt5100 * -437942469 == 0) {
			d += (double) (class338.anInt5095 * -54747725 * i);
			d_130_
			    += (double) (class338.anInt5096 * 1684111005 * i);
			d_131_
			    += (double) (class338.anInt5097 * -529083375 * i);
			bool = true;
		    } else {
			anInt11064 += class338.anInt5095 * -54747725 * i;
			anInt11061 += class338.anInt5096 * 1684111005 * i;
			anInt11060 += class338.anInt5097 * -529083375 * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_130_ > 32767.0 || d_131_ > 32767.0
		       || d < -32767.0 || d_130_ < -32767.0
		       || d_131_ < -32767.0) {
		    d /= 2.0;
		    d_130_ /= 2.0;
		    d_131_ /= 2.0;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11274 <<= 1;
		}
		((Class247_Sub1_Sub1_Sub1) this).aShort11280 = (short) (int) d;
		((Class247_Sub1_Sub1_Sub1) this).aShort11278
		    = (short) (int) d_130_;
		((Class247_Sub1_Sub1_Sub1) this).aShort11279
		    = (short) (int) d_131_;
	    }
	    anInt11064
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11280
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	    anInt11061
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11278
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	    anInt11060
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11279
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	}
    }
    
    void method17653(Class505 class505, int i, int i_167_, int i_168_,
		     int i_169_, int i_170_, int i_171_, int i_172_,
		     int i_173_, int i_174_, int i_175_, int i_176_,
		     int i_177_, int i_178_, boolean bool, boolean bool_179_) {
	((Class247_Sub1_Sub1_Sub1) this).aClass505_11276 = class505;
	anInt11064 = i << 12;
	anInt11061 = i_167_ << 12;
	anInt11060 = i_168_ << 12;
	anInt11065 = i_174_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11271
	    = ((Class247_Sub1_Sub1_Sub1) this).aShort11277 = (short) i_173_;
	anInt11058 = i_175_;
	aShort11066 = (short) i_176_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11273 = (short) i_177_;
	anInt11062 = i_178_;
	aBool11067 = bool_179_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11280 = (short) i_169_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11278 = (short) i_170_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11279 = (short) i_171_;
	((Class247_Sub1_Sub1_Sub1) this).anInt11274 = i_172_;
	method17647();
    }
    
    void method17654(long l, int i) {
	((Class247_Sub1_Sub1_Sub1) this).aShort11277 -= i;
	if (((Class247_Sub1_Sub1_Sub1) this).aShort11277 <= 0)
	    method17650();
	else {
	    int i_180_ = anInt11064 >> 12;
	    int i_181_ = anInt11061 >> 12;
	    int i_182_ = anInt11060 >> 12;
	    Class489 class489 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass489_6643);
	    Class325 class325 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass325_6637);
	    if (class325.anInt4948 * 1436413983 != 0) {
		if ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt4994 * 533618847) {
		    int i_183_
			= ((anInt11065 >> 8 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 16
			      & 0xff)
			   + class325.anInt4996 * -17377091 * i);
		    int i_184_
			= ((anInt11065 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 8
			      & 0xff)
			   + class325.anInt4997 * -1843785 * i);
		    int i_185_
			= ((anInt11065 << 8 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275
			      & 0xff)
			   + class325.anInt4982 * 1934823691 * i);
		    if (i_183_ < 0)
			i_183_ = 0;
		    else if (i_183_ > 65535)
			i_183_ = 65535;
		    if (i_184_ < 0)
			i_184_ = 0;
		    else if (i_184_ > 65535)
			i_184_ = 65535;
		    if (i_185_ < 0)
			i_185_ = 0;
		    else if (i_185_ > 65535)
			i_185_ = 65535;
		    anInt11065 &= ~0xffffff;
		    anInt11065 |= (((i_183_ & 0xff00) << 8) + (i_184_ & 0xff00)
				   + ((i_185_ & 0xff00) >> 8));
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275 &= ~0xffffff;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275
			|= (((i_183_ & 0xff) << 16) + ((i_184_ & 0xff) << 8)
			    + (i_185_ & 0xff));
		}
		if ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt4972 * -1498515167) {
		    int i_186_
			= ((anInt11065 >> 16 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 24
			      & 0xff)
			   + class325.anInt4999 * -1205940835 * i);
		    if (i_186_ < 0)
			i_186_ = 0;
		    else if (i_186_ > 65535)
			i_186_ = 65535;
		    anInt11065 &= 0xffffff;
		    anInt11065 |= (i_186_ & 0xff00) << 16;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275 &= 0xffffff;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275
			|= (i_186_ & 0xff) << 24;
		}
	    }
	    if (class325.anInt4943 * 1642850419 != -1
		&& ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt5000 * 113795445))
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    += class325.anInt5001 * 1512913547 * i;
	    if (class325.anInt4987 * 366807495 != -1
		&& ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt5002 * -516446423))
		anInt11058 += class325.anInt5003 * -1802673875 * i;
	    if (((Class247_Sub1_Sub1_Sub1) this).aShort11273 != 0)
		aShort11066
		    = (short) (aShort11066 + (((Class247_Sub1_Sub1_Sub1) this)
					      .aShort11273) * i
			       & 0x3fff);
	    double d = (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11280;
	    double d_187_
		= (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11278;
	    double d_188_
		= (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11279;
	    boolean bool = false;
	    if (class325.anInt4937 * 1497508197 == 1) {
		int i_189_
		    = i_180_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6620 * 1184628225;
		int i_190_
		    = i_181_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6619 * -1194700497;
		int i_191_
		    = i_182_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6625 * -1125838207;
		int i_192_ = ((int) Math.sqrt((double) (i_189_ * i_189_
							+ i_190_ * i_190_
							+ i_191_ * i_191_))
			      >> 2);
		long l_193_
		    = (long) (class325.anInt4938 * 2047224083 * i_192_ * i);
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    -= ((long) ((Class247_Sub1_Sub1_Sub1) this).anInt11274
			* l_193_) >> 18;
	    } else if (class325.anInt4937 * 1497508197 == 2) {
		int i_194_
		    = i_180_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6620 * 1184628225;
		int i_195_
		    = i_181_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6619 * -1194700497;
		int i_196_
		    = i_182_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6625 * -1125838207;
		int i_197_
		    = i_194_ * i_194_ + i_195_ * i_195_ + i_196_ * i_196_;
		long l_198_
		    = (long) (class325.anInt4938 * 2047224083 * i_197_ * i);
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    -= ((long) ((Class247_Sub1_Sub1_Sub1) this).anInt11274
			* l_198_) >> 28;
	    }
	    if (class325.anIntArray4956 != null) {
		Iterator iterator = ((Class489) class489).aList6495.iterator();
		while (iterator.hasNext()) {
		    Class241_Sub4 class241_sub4
			= (Class241_Sub4) iterator.next();
		    Class338 class338
			= ((Class241_Sub4) class241_sub4).aClass338_8810;
		    if (class338.anInt5092 * 2676085 != 1) {
			boolean bool_199_ = false;
			for (int i_200_ = 0;
			     i_200_ < class325.anIntArray4956.length;
			     i_200_++) {
			    if (class325.anIntArray4956[i_200_]
				== class338.anInt5093 * -1512815471) {
				bool_199_ = true;
				break;
			    }
			}
			if (bool_199_) {
			    double d_201_
				= (double) (i_180_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8811) * -1331940757);
			    double d_202_
				= (double) (i_181_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8812) * 214623495);
			    double d_203_
				= (double) (i_182_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8815) * -958400809);
			    double d_204_ = (d_201_ * d_201_ + d_202_ * d_202_
					     + d_203_ * d_203_);
			    if (!(d_204_
				  > (double) (class338.aLong5104
					      * -2669198612719589729L))) {
				double d_205_ = Math.sqrt(d_204_);
				if (d_205_ == 0.0)
				    d_205_ = 1.0;
				double d_206_
				    = ((d_201_ * (double) (((Class241_Sub4)
							    class241_sub4)
							   .aFloat8814)
					+ d_202_ * (double) (class338.anInt5096
							     * 1684111005)
					+ d_203_ * (double) (((Class241_Sub4)
							      class241_sub4)
							     .aFloat8813))
				       * 65535.0
				       / ((double) (class338.anInt5086
						    * -1400248607)
					  * d_205_));
				if (!(d_206_ < (double) (class338.anInt5105
							 * -1437571039))) {
				    double d_207_ = 0.0;
				    if (class338.anInt5098 * 1066833957 == 1)
					d_207_
					    = (d_205_ / 16.0
					       * (double) (class338.anInt5099
							   * 933168033));
				    else if (class338.anInt5098 * 1066833957
					     == 2)
					d_207_
					    = (d_205_ / 16.0 * (d_205_ / 16.0)
					       * (double) (class338.anInt5099
							   * 933168033));
				    if (class338.anInt5101 * -1674274517
					== 0) {
					if (class338.anInt5100 * -437942469
					    == 0) {
					    d += ((double) (((Class241_Sub4)
							     class241_sub4)
							    .aFloat8814)
						  - d_207_) * (double) i;
					    d_187_ += ((double) ((class338
								  .anInt5096)
								 * 1684111005)
						       - d_207_) * (double) i;
					    d_188_
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8813)
						    - d_207_) * (double) i;
					    bool = true;
					} else {
					    anInt11064
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8814)
						    - d_207_) * (double) i;
					    anInt11061
						+= ((double) ((class338
							       .anInt5096)
							      * 1684111005)
						    - d_207_) * (double) i;
					    anInt11060
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8813)
						    - d_207_) * (double) i;
					}
				    } else {
					double d_208_
					    = (d_201_ / d_205_
					       * (double) (class338.anInt5086
							   * -1400248607));
					double d_209_
					    = (d_202_ / d_205_
					       * (double) (class338.anInt5086
							   * -1400248607));
					double d_210_
					    = (d_203_ / d_205_
					       * (double) (class338.anInt5086
							   * -1400248607));
					if (class338.anInt5100 * -437942469
					    == 0) {
					    d += d_208_ * (double) i;
					    d_187_ += d_209_ * (double) i;
					    d_188_ += d_210_ * (double) i;
					    bool = true;
					} else {
					    anInt11064 += d_208_ * (double) i;
					    anInt11061 += d_209_ * (double) i;
					    anInt11060 += d_210_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class325.anIntArray4954 != null) {
		for (int i_211_ = 0; i_211_ < class325.anIntArray4954.length;
		     i_211_++) {
		    Class241_Sub4 class241_sub4
			= ((Class241_Sub4)
			   (Class487.aClass407_6471.get
			    ((long) class325.anIntArray4954[i_211_])));
		    while (class241_sub4 != null) {
			Class338 class338
			    = ((Class241_Sub4) class241_sub4).aClass338_8810;
			double d_212_
			    = (double) (i_180_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8811) * -1331940757);
			double d_213_
			    = (double) (i_181_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8812) * 214623495);
			double d_214_
			    = (double) (i_182_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8815) * -958400809);
			double d_215_ = (d_212_ * d_212_ + d_213_ * d_213_
					 + d_214_ * d_214_);
			if (d_215_ > (double) (class338.aLong5104
					       * -2669198612719589729L))
			    class241_sub4
				= (Class241_Sub4) Class487.aClass407_6471
						      .method7289((byte) -9);
			else {
			    double d_216_ = Math.sqrt(d_215_);
			    if (d_216_ == 0.0)
				d_216_ = 1.0;
			    double d_217_
				= ((d_212_ * (double) (((Class241_Sub4)
							class241_sub4)
						       .aFloat8814)
				    + d_213_ * (double) (class338.anInt5096
							 * 1684111005)
				    + d_214_ * (double) (((Class241_Sub4)
							  class241_sub4)
							 .aFloat8813))
				   * 65535.0
				   / ((double) (class338.anInt5086
						* -1400248607)
				      * d_216_));
			    if (d_217_
				< (double) (class338.anInt5105 * -1437571039))
				class241_sub4 = ((Class241_Sub4)
						 Class487.aClass407_6471
						     .method7289((byte) -55));
			    else {
				double d_218_ = 0.0;
				if (class338.anInt5098 * 1066833957 == 1)
				    d_218_ = (d_216_ / 16.0
					      * (double) (class338.anInt5099
							  * 933168033));
				else if (class338.anInt5098 * 1066833957 == 2)
				    d_218_ = (d_216_ / 16.0 * (d_216_ / 16.0)
					      * (double) (class338.anInt5099
							  * 933168033));
				if (class338.anInt5101 * -1674274517 == 0) {
				    if (class338.anInt5100 * -437942469 == 0) {
					d += ((double) (((Class241_Sub4)
							 class241_sub4)
							.aFloat8814)
					      - d_218_) * (double) i;
					d_187_ += ((double) (class338.anInt5096
							     * 1684111005)
						   - d_218_) * (double) i;
					d_188_ += ((double) (((Class241_Sub4)
							      class241_sub4)
							     .aFloat8813)
						   - d_218_) * (double) i;
					bool = true;
				    } else {
					anInt11064
					    += ((double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8814)
						- d_218_) * (double) i;
					anInt11061
					    += ((double) (class338.anInt5096
							  * 1684111005)
						- d_218_) * (double) i;
					anInt11060
					    += ((double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8813)
						- d_218_) * (double) i;
				    }
				} else {
				    double d_219_
					= (d_212_ / d_216_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    double d_220_
					= (d_213_ / d_216_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    double d_221_
					= (d_214_ / d_216_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    if (class338.anInt5100 * -437942469 == 0) {
					d += d_219_ * (double) i;
					d_187_ += d_220_ * (double) i;
					d_188_ += d_221_ * (double) i;
					bool = true;
				    } else {
					anInt11064 += d_219_ * (double) i;
					anInt11061 += d_220_ * (double) i;
					anInt11060 += d_221_ * (double) i;
				    }
				}
				class241_sub4 = ((Class241_Sub4)
						 Class487.aClass407_6471
						     .method7289((byte) -52));
			    }
			}
		    }
		}
	    }
	    if (class325.anIntArray4958 != null) {
		if (class325.anIntArray4959 == null) {
		    class325.anIntArray4959
			= new int[class325.anIntArray4958.length];
		    for (int i_222_ = 0;
			 i_222_ < class325.anIntArray4958.length; i_222_++) {
			Class475_Sub1_Sub1_Sub2.method17767((class325
							     .anIntArray4958
							     [i_222_]),
							    (byte) -21);
			class325.anIntArray4959[i_222_]
			    = (((IntegerNode)
				(Class338.aClass407_5090.get
				 ((long) class325.anIntArray4958[i_222_])))
			       .intValue) * -1859754807;
		    }
		}
		for (int i_223_ = 0; i_223_ < class325.anIntArray4959.length;
		     i_223_++) {
		    Class338 class338 = (Class338.aClass338Array5088
					 [class325.anIntArray4959[i_223_]]);
		    if (class338.anInt5100 * -437942469 == 0) {
			d += (double) (class338.anInt5095 * -54747725 * i);
			d_187_
			    += (double) (class338.anInt5096 * 1684111005 * i);
			d_188_
			    += (double) (class338.anInt5097 * -529083375 * i);
			bool = true;
		    } else {
			anInt11064 += class338.anInt5095 * -54747725 * i;
			anInt11061 += class338.anInt5096 * 1684111005 * i;
			anInt11060 += class338.anInt5097 * -529083375 * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_187_ > 32767.0 || d_188_ > 32767.0
		       || d < -32767.0 || d_187_ < -32767.0
		       || d_188_ < -32767.0) {
		    d /= 2.0;
		    d_187_ /= 2.0;
		    d_188_ /= 2.0;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11274 <<= 1;
		}
		((Class247_Sub1_Sub1_Sub1) this).aShort11280 = (short) (int) d;
		((Class247_Sub1_Sub1_Sub1) this).aShort11278
		    = (short) (int) d_187_;
		((Class247_Sub1_Sub1_Sub1) this).aShort11279
		    = (short) (int) d_188_;
	    }
	    anInt11064
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11280
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	    anInt11061
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11278
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	    anInt11060
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11279
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	}
    }
    
    Class247_Sub1_Sub1_Sub1(Class505 class505, int i, int i_224_, int i_225_,
			    int i_226_, int i_227_, int i_228_, int i_229_,
			    int i_230_, int i_231_, int i_232_, int i_233_,
			    int i_234_, int i_235_, boolean bool,
			    boolean bool_236_) {
	((Class247_Sub1_Sub1_Sub1) this).aClass505_11276 = class505;
	anInt11064 = i << 12;
	anInt11061 = i_224_ << 12;
	anInt11060 = i_225_ << 12;
	anInt11065 = i_231_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11271
	    = ((Class247_Sub1_Sub1_Sub1) this).aShort11277 = (short) i_230_;
	anInt11058 = i_232_;
	aShort11066 = (short) i_233_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11273 = (short) i_234_;
	anInt11062 = i_235_;
	aBool11067 = bool_236_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11280 = (short) i_226_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11278 = (short) i_227_;
	((Class247_Sub1_Sub1_Sub1) this).aShort11279 = (short) i_228_;
	((Class247_Sub1_Sub1_Sub1) this).anInt11274 = i_229_;
	method17647();
    }
    
    void method17655() {
	int i = (((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					  .aClass505_11276)).aClass489_6643)
		 .anInt6494);
	if ((((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
				      .aClass505_11276)).aClass489_6643)
	     .aClass247_Sub1_Sub1_Sub1Array6491[i])
	    != null)
	    ((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
				     .aClass505_11276)).aClass489_6643)
		.aClass247_Sub1_Sub1_Sub1Array6491[i].method17650();
	((Class489)
	 (((Class505) ((Class247_Sub1_Sub1_Sub1) this).aClass505_11276)
	  .aClass489_6643)).aClass247_Sub1_Sub1_Sub1Array6491[i]
	    = this;
	((Class247_Sub1_Sub1_Sub1) this).aShort11272
	    = (short) ((Class489) (((Class505) ((Class247_Sub1_Sub1_Sub1)
						this).aClass505_11276)
				   .aClass489_6643)).anInt6494;
	((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
				 .aClass505_11276)).aClass489_6643).anInt6494
	    = i + 1 & 0x1fff;
	((Class505) ((Class247_Sub1_Sub1_Sub1) this).aClass505_11276)
	    .aClass421_6639.method7522(this, -1665299415);
    }
    
    void method17656(long l, int i) {
	((Class247_Sub1_Sub1_Sub1) this).aShort11277 -= i;
	if (((Class247_Sub1_Sub1_Sub1) this).aShort11277 <= 0)
	    method17650();
	else {
	    int i_237_ = anInt11064 >> 12;
	    int i_238_ = anInt11061 >> 12;
	    int i_239_ = anInt11060 >> 12;
	    Class489 class489 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass489_6643);
	    Class325 class325 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass325_6637);
	    if (class325.anInt4948 * 1436413983 != 0) {
		if ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt4994 * 533618847) {
		    int i_240_
			= ((anInt11065 >> 8 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 16
			      & 0xff)
			   + class325.anInt4996 * -17377091 * i);
		    int i_241_
			= ((anInt11065 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 8
			      & 0xff)
			   + class325.anInt4997 * -1843785 * i);
		    int i_242_
			= ((anInt11065 << 8 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275
			      & 0xff)
			   + class325.anInt4982 * 1934823691 * i);
		    if (i_240_ < 0)
			i_240_ = 0;
		    else if (i_240_ > 65535)
			i_240_ = 65535;
		    if (i_241_ < 0)
			i_241_ = 0;
		    else if (i_241_ > 65535)
			i_241_ = 65535;
		    if (i_242_ < 0)
			i_242_ = 0;
		    else if (i_242_ > 65535)
			i_242_ = 65535;
		    anInt11065 &= ~0xffffff;
		    anInt11065 |= (((i_240_ & 0xff00) << 8) + (i_241_ & 0xff00)
				   + ((i_242_ & 0xff00) >> 8));
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275 &= ~0xffffff;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275
			|= (((i_240_ & 0xff) << 16) + ((i_241_ & 0xff) << 8)
			    + (i_242_ & 0xff));
		}
		if ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt4972 * -1498515167) {
		    int i_243_
			= ((anInt11065 >> 16 & 0xff00)
			   + (((Class247_Sub1_Sub1_Sub1) this).anInt11275 >> 24
			      & 0xff)
			   + class325.anInt4999 * -1205940835 * i);
		    if (i_243_ < 0)
			i_243_ = 0;
		    else if (i_243_ > 65535)
			i_243_ = 65535;
		    anInt11065 &= 0xffffff;
		    anInt11065 |= (i_243_ & 0xff00) << 16;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275 &= 0xffffff;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11275
			|= (i_243_ & 0xff) << 24;
		}
	    }
	    if (class325.anInt4943 * 1642850419 != -1
		&& ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt5000 * 113795445))
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    += class325.anInt5001 * 1512913547 * i;
	    if (class325.anInt4987 * 366807495 != -1
		&& ((((Class247_Sub1_Sub1_Sub1) this).aShort11271
		     - ((Class247_Sub1_Sub1_Sub1) this).aShort11277)
		    <= class325.anInt5002 * -516446423))
		anInt11058 += class325.anInt5003 * -1802673875 * i;
	    if (((Class247_Sub1_Sub1_Sub1) this).aShort11273 != 0)
		aShort11066
		    = (short) (aShort11066 + (((Class247_Sub1_Sub1_Sub1) this)
					      .aShort11273) * i
			       & 0x3fff);
	    double d = (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11280;
	    double d_244_
		= (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11278;
	    double d_245_
		= (double) ((Class247_Sub1_Sub1_Sub1) this).aShort11279;
	    boolean bool = false;
	    if (class325.anInt4937 * 1497508197 == 1) {
		int i_246_
		    = i_237_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6620 * 1184628225;
		int i_247_
		    = i_238_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6619 * -1194700497;
		int i_248_
		    = i_239_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6625 * -1125838207;
		int i_249_ = ((int) Math.sqrt((double) (i_246_ * i_246_
							+ i_247_ * i_247_
							+ i_248_ * i_248_))
			      >> 2);
		long l_250_
		    = (long) (class325.anInt4938 * 2047224083 * i_249_ * i);
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    -= ((long) ((Class247_Sub1_Sub1_Sub1) this).anInt11274
			* l_250_) >> 18;
	    } else if (class325.anInt4937 * 1497508197 == 2) {
		int i_251_
		    = i_237_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6620 * 1184628225;
		int i_252_
		    = i_238_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6619 * -1194700497;
		int i_253_
		    = i_239_ - ((Class503)
				(((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass503_6635)).anInt6625 * -1125838207;
		int i_254_
		    = i_251_ * i_251_ + i_252_ * i_252_ + i_253_ * i_253_;
		long l_255_
		    = (long) (class325.anInt4938 * 2047224083 * i_254_ * i);
		((Class247_Sub1_Sub1_Sub1) this).anInt11274
		    -= ((long) ((Class247_Sub1_Sub1_Sub1) this).anInt11274
			* l_255_) >> 28;
	    }
	    if (class325.anIntArray4956 != null) {
		Iterator iterator = ((Class489) class489).aList6495.iterator();
		while (iterator.hasNext()) {
		    Class241_Sub4 class241_sub4
			= (Class241_Sub4) iterator.next();
		    Class338 class338
			= ((Class241_Sub4) class241_sub4).aClass338_8810;
		    if (class338.anInt5092 * 2676085 != 1) {
			boolean bool_256_ = false;
			for (int i_257_ = 0;
			     i_257_ < class325.anIntArray4956.length;
			     i_257_++) {
			    if (class325.anIntArray4956[i_257_]
				== class338.anInt5093 * -1512815471) {
				bool_256_ = true;
				break;
			    }
			}
			if (bool_256_) {
			    double d_258_
				= (double) (i_237_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8811) * -1331940757);
			    double d_259_
				= (double) (i_238_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8812) * 214623495);
			    double d_260_
				= (double) (i_239_
					    - (((Class241_Sub4) class241_sub4)
					       .anInt8815) * -958400809);
			    double d_261_ = (d_258_ * d_258_ + d_259_ * d_259_
					     + d_260_ * d_260_);
			    if (!(d_261_
				  > (double) (class338.aLong5104
					      * -2669198612719589729L))) {
				double d_262_ = Math.sqrt(d_261_);
				if (d_262_ == 0.0)
				    d_262_ = 1.0;
				double d_263_
				    = ((d_258_ * (double) (((Class241_Sub4)
							    class241_sub4)
							   .aFloat8814)
					+ d_259_ * (double) (class338.anInt5096
							     * 1684111005)
					+ d_260_ * (double) (((Class241_Sub4)
							      class241_sub4)
							     .aFloat8813))
				       * 65535.0
				       / ((double) (class338.anInt5086
						    * -1400248607)
					  * d_262_));
				if (!(d_263_ < (double) (class338.anInt5105
							 * -1437571039))) {
				    double d_264_ = 0.0;
				    if (class338.anInt5098 * 1066833957 == 1)
					d_264_
					    = (d_262_ / 16.0
					       * (double) (class338.anInt5099
							   * 933168033));
				    else if (class338.anInt5098 * 1066833957
					     == 2)
					d_264_
					    = (d_262_ / 16.0 * (d_262_ / 16.0)
					       * (double) (class338.anInt5099
							   * 933168033));
				    if (class338.anInt5101 * -1674274517
					== 0) {
					if (class338.anInt5100 * -437942469
					    == 0) {
					    d += ((double) (((Class241_Sub4)
							     class241_sub4)
							    .aFloat8814)
						  - d_264_) * (double) i;
					    d_244_ += ((double) ((class338
								  .anInt5096)
								 * 1684111005)
						       - d_264_) * (double) i;
					    d_245_
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8813)
						    - d_264_) * (double) i;
					    bool = true;
					} else {
					    anInt11064
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8814)
						    - d_264_) * (double) i;
					    anInt11061
						+= ((double) ((class338
							       .anInt5096)
							      * 1684111005)
						    - d_264_) * (double) i;
					    anInt11060
						+= ((double) (((Class241_Sub4)
							       class241_sub4)
							      .aFloat8813)
						    - d_264_) * (double) i;
					}
				    } else {
					double d_265_
					    = (d_258_ / d_262_
					       * (double) (class338.anInt5086
							   * -1400248607));
					double d_266_
					    = (d_259_ / d_262_
					       * (double) (class338.anInt5086
							   * -1400248607));
					double d_267_
					    = (d_260_ / d_262_
					       * (double) (class338.anInt5086
							   * -1400248607));
					if (class338.anInt5100 * -437942469
					    == 0) {
					    d += d_265_ * (double) i;
					    d_244_ += d_266_ * (double) i;
					    d_245_ += d_267_ * (double) i;
					    bool = true;
					} else {
					    anInt11064 += d_265_ * (double) i;
					    anInt11061 += d_266_ * (double) i;
					    anInt11060 += d_267_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class325.anIntArray4954 != null) {
		for (int i_268_ = 0; i_268_ < class325.anIntArray4954.length;
		     i_268_++) {
		    Class241_Sub4 class241_sub4
			= ((Class241_Sub4)
			   (Class487.aClass407_6471.get
			    ((long) class325.anIntArray4954[i_268_])));
		    while (class241_sub4 != null) {
			Class338 class338
			    = ((Class241_Sub4) class241_sub4).aClass338_8810;
			double d_269_
			    = (double) (i_237_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8811) * -1331940757);
			double d_270_
			    = (double) (i_238_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8812) * 214623495);
			double d_271_
			    = (double) (i_239_
					- (((Class241_Sub4) class241_sub4)
					   .anInt8815) * -958400809);
			double d_272_ = (d_269_ * d_269_ + d_270_ * d_270_
					 + d_271_ * d_271_);
			if (d_272_ > (double) (class338.aLong5104
					       * -2669198612719589729L))
			    class241_sub4
				= (Class241_Sub4) Class487.aClass407_6471
						      .method7289((byte) -74);
			else {
			    double d_273_ = Math.sqrt(d_272_);
			    if (d_273_ == 0.0)
				d_273_ = 1.0;
			    double d_274_
				= ((d_269_ * (double) (((Class241_Sub4)
							class241_sub4)
						       .aFloat8814)
				    + d_270_ * (double) (class338.anInt5096
							 * 1684111005)
				    + d_271_ * (double) (((Class241_Sub4)
							  class241_sub4)
							 .aFloat8813))
				   * 65535.0
				   / ((double) (class338.anInt5086
						* -1400248607)
				      * d_273_));
			    if (d_274_
				< (double) (class338.anInt5105 * -1437571039))
				class241_sub4 = ((Class241_Sub4)
						 Class487.aClass407_6471
						     .method7289((byte) -82));
			    else {
				double d_275_ = 0.0;
				if (class338.anInt5098 * 1066833957 == 1)
				    d_275_ = (d_273_ / 16.0
					      * (double) (class338.anInt5099
							  * 933168033));
				else if (class338.anInt5098 * 1066833957 == 2)
				    d_275_ = (d_273_ / 16.0 * (d_273_ / 16.0)
					      * (double) (class338.anInt5099
							  * 933168033));
				if (class338.anInt5101 * -1674274517 == 0) {
				    if (class338.anInt5100 * -437942469 == 0) {
					d += ((double) (((Class241_Sub4)
							 class241_sub4)
							.aFloat8814)
					      - d_275_) * (double) i;
					d_244_ += ((double) (class338.anInt5096
							     * 1684111005)
						   - d_275_) * (double) i;
					d_245_ += ((double) (((Class241_Sub4)
							      class241_sub4)
							     .aFloat8813)
						   - d_275_) * (double) i;
					bool = true;
				    } else {
					anInt11064
					    += ((double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8814)
						- d_275_) * (double) i;
					anInt11061
					    += ((double) (class338.anInt5096
							  * 1684111005)
						- d_275_) * (double) i;
					anInt11060
					    += ((double) (((Class241_Sub4)
							   class241_sub4)
							  .aFloat8813)
						- d_275_) * (double) i;
				    }
				} else {
				    double d_276_
					= (d_269_ / d_273_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    double d_277_
					= (d_270_ / d_273_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    double d_278_
					= (d_271_ / d_273_
					   * (double) (class338.anInt5086
						       * -1400248607));
				    if (class338.anInt5100 * -437942469 == 0) {
					d += d_276_ * (double) i;
					d_244_ += d_277_ * (double) i;
					d_245_ += d_278_ * (double) i;
					bool = true;
				    } else {
					anInt11064 += d_276_ * (double) i;
					anInt11061 += d_277_ * (double) i;
					anInt11060 += d_278_ * (double) i;
				    }
				}
				class241_sub4 = ((Class241_Sub4)
						 Class487.aClass407_6471
						     .method7289((byte) 5));
			    }
			}
		    }
		}
	    }
	    if (class325.anIntArray4958 != null) {
		if (class325.anIntArray4959 == null) {
		    class325.anIntArray4959
			= new int[class325.anIntArray4958.length];
		    for (int i_279_ = 0;
			 i_279_ < class325.anIntArray4958.length; i_279_++) {
			Class475_Sub1_Sub1_Sub2.method17767((class325
							     .anIntArray4958
							     [i_279_]),
							    (byte) -67);
			class325.anIntArray4959[i_279_]
			    = (((IntegerNode)
				(Class338.aClass407_5090.get
				 ((long) class325.anIntArray4958[i_279_])))
			       .intValue) * -1859754807;
		    }
		}
		for (int i_280_ = 0; i_280_ < class325.anIntArray4959.length;
		     i_280_++) {
		    Class338 class338 = (Class338.aClass338Array5088
					 [class325.anIntArray4959[i_280_]]);
		    if (class338.anInt5100 * -437942469 == 0) {
			d += (double) (class338.anInt5095 * -54747725 * i);
			d_244_
			    += (double) (class338.anInt5096 * 1684111005 * i);
			d_245_
			    += (double) (class338.anInt5097 * -529083375 * i);
			bool = true;
		    } else {
			anInt11064 += class338.anInt5095 * -54747725 * i;
			anInt11061 += class338.anInt5096 * 1684111005 * i;
			anInt11060 += class338.anInt5097 * -529083375 * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_244_ > 32767.0 || d_245_ > 32767.0
		       || d < -32767.0 || d_244_ < -32767.0
		       || d_245_ < -32767.0) {
		    d /= 2.0;
		    d_244_ /= 2.0;
		    d_245_ /= 2.0;
		    ((Class247_Sub1_Sub1_Sub1) this).anInt11274 <<= 1;
		}
		((Class247_Sub1_Sub1_Sub1) this).aShort11280 = (short) (int) d;
		((Class247_Sub1_Sub1_Sub1) this).aShort11278
		    = (short) (int) d_244_;
		((Class247_Sub1_Sub1_Sub1) this).aShort11279
		    = (short) (int) d_245_;
	    }
	    anInt11064
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11280
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	    anInt11061
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11278
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	    anInt11060
		+= (((long) ((Class247_Sub1_Sub1_Sub1) this).aShort11279
		     * (long) (((Class247_Sub1_Sub1_Sub1) this).anInt11274
			       << 2))
		    >> 23) * (long) i;
	}
    }
    
    void method17657(Class552 class552, Class103 class103, long l) {
	int i = anInt11064 >> 12 + class552.anInt7123 * 1591782305;
	int i_281_ = anInt11060 >> 12 + class552.anInt7123 * 1591782305;
	int i_282_ = anInt11061 >> 12;
	if (i_282_ > 262144 || i_282_ < -262144 || i < 0
	    || i >= class552.anInt7138 * 120442351 || i_281_ < 0
	    || i_281_ >= class552.anInt7142 * -2069974325)
	    method17650();
	else {
	    Class489 class489 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass489_6643);
	    Class325 class325 = (((Class505) (((Class247_Sub1_Sub1_Sub1) this)
					      .aClass505_11276))
				 .aClass325_6637);
	    Class166[] class166s = class552.aClass166Array7184;
	    int i_283_ = ((Class489) class489).anInt6496;
	    Class548 class548 = (class552.aClass548ArrayArrayArray7169
				 [((Class489) class489).anInt6496][i][i_281_]);
	    if (class548 != null)
		i_283_ = class548.aByte7054;
	    int i_284_ = class166s[i_283_].method3551(i, i_281_, -215832847);
	    int i_285_;
	    if (i_283_ < class552.anInt7132 * 532429613 - 1)
		i_285_
		    = class166s[i_283_ + 1].method3551(i, i_281_, -1649235113);
	    else
		i_285_ = i_284_ - (8 << class552.anInt7123 * 1591782305);
	    if (class325.aBool4981) {
		if (class325.anInt4961 * 736372665 == -1 && i_282_ > i_284_) {
		    method17650();
		    return;
		}
		if (class325.anInt4961 * 736372665 >= 0
		    && i_282_ > class166s[class325.anInt4961 * 736372665]
				    .method3551(i, i_281_, -1239224652)) {
		    method17650();
		    return;
		}
		if (class325.anInt4998 * -530465999 == -1 && i_282_ < i_285_) {
		    method17650();
		    return;
		}
		if (class325.anInt4998 * -530465999 >= 0
		    && i_282_ < class166s
				    [class325.anInt4998 * -530465999 + 1]
				    .method3551(i, i_281_, -1366958809)) {
		    method17650();
		    return;
		}
	    }
	    int i_286_;
	    for (i_286_ = class552.anInt7132 * 532429613 - 1;
		 (i_286_ > 0
		  && i_282_ > class166s[i_286_].method3551(i, i_281_,
							   -1229131160));
		 i_286_--) {
		/* empty */
	    }
	    if (class325.aBool4979 && i_286_ == 0
		&& i_282_ > class166s[0].method3551(i, i_281_, 153580730))
		method17650();
	    else if (i_286_ == class552.anInt7132 * 532429613 - 1
		     && (class166s[i_286_].method3551(i, i_281_, -531288151)
			 - i_282_) > 8 << class552.anInt7123 * 1591782305)
		method17650();
	    else {
		class548
		    = class552.aClass548ArrayArrayArray7169[i_286_][i][i_281_];
		if (class548 == null) {
		    if (i_286_ == 0
			|| (class552.aClass548ArrayArrayArray7169[0][i][i_281_]
			    == null))
			class548 = class552.aClass548ArrayArrayArray7169[0]
				       [i][i_281_] = new Class548(0);
		    boolean bool = ((class552.aClass548ArrayArrayArray7169[0]
				     [i][i_281_].aClass548_7063)
				    != null);
		    if (i_286_ == 3 && bool)
			i_286_--;
		    for (int i_287_ = 1; i_287_ <= i_286_; i_287_++) {
			if ((class552.aClass548ArrayArrayArray7169[i_287_][i]
			     [i_281_])
			    == null) {
			    class548
				= class552.aClass548ArrayArrayArray7169
				      [i_287_][i][i_281_]
				= new Class548(i_287_);
			    if (bool)
				class548.aByte7054++;
			}
		    }
		    if (class548 == null)
			class548 = (class552.aClass548ArrayArrayArray7169
				    [i_286_][i][i_281_]);
		}
		if (class325.aBool4942) {
		    int i_288_ = anInt11064 >> 12;
		    int i_289_ = anInt11060 >> 12;
		    if (class548.aClass475_Sub1_Sub3_7055 != null) {
			Class535 class535
			    = class548.aClass475_Sub1_Sub3_7055
				  .method14457(class103, 1472700920);
			if (class535 != null
			    && class535.method11885(i_288_, i_282_, i_289_)) {
			    method17650();
			    return;
			}
		    }
		    if (class548.aClass475_Sub1_Sub3_7056 != null) {
			Class535 class535
			    = class548.aClass475_Sub1_Sub3_7056
				  .method14457(class103, 1794515791);
			if (class535 != null
			    && class535.method11885(i_288_, i_282_, i_289_)) {
			    method17650();
			    return;
			}
		    }
		    if (class548.aClass475_Sub1_Sub4_7058 != null) {
			Class535 class535
			    = class548.aClass475_Sub1_Sub4_7058
				  .method14457(class103, 1400865738);
			if (class535 != null
			    && class535.method11885(i_288_, i_282_, i_289_)) {
			    method17650();
			    return;
			}
		    }
		    for (Class541 class541 = class548.aClass541_7053;
			 class541 != null;
			 class541 = class541.aClass541_7005) {
			Class535 class535
			    = class541.aClass475_Sub1_Sub1_7004
				  .method14457(class103, 1487705497);
			if (class535 != null
			    && class535.method11885(i_288_, i_282_, i_289_)) {
			    method17650();
			    return;
			}
		    }
		}
		((Class489) class489).aClass98_6497.aClass441_1353
		    .method7834(this, 2086796185);
	    }
	}
    }
    
    void method17658() {
	((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
				 .aClass505_11276)).aClass489_6643)
	    .aClass247_Sub1_Sub1_Sub1Array6491
	    [((Class247_Sub1_Sub1_Sub1) this).aShort11272]
	    = null;
	Class487.aClass247_Sub1_Sub1_Sub1Array6478[(Class487.anInt6473
						    * 1435230355)]
	    = this;
	Class487.anInt6473
	    = (Class487.anInt6473 * 1435230355 + 1 & 0x3ff) * 478428571;
	method4944((byte) 2);
	method16297(-2058469887);
    }
    
    void method17659() {
	((Class489) ((Class505) (((Class247_Sub1_Sub1_Sub1) this)
				 .aClass505_11276)).aClass489_6643)
	    .aClass247_Sub1_Sub1_Sub1Array6491
	    [((Class247_Sub1_Sub1_Sub1) this).aShort11272]
	    = null;
	Class487.aClass247_Sub1_Sub1_Sub1Array6478[(Class487.anInt6473
						    * 1435230355)]
	    = this;
	Class487.anInt6473
	    = (Class487.anInt6473 * 1435230355 + 1 & 0x3ff) * 478428571;
	method4944((byte) 105);
	method16297(-1130149164);
    }
}
