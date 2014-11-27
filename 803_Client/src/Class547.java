/* Class547 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class547
{
    public static JS5 CS2_ARCHIVE;//aClass210_7052
    
    Class547() throws Throwable {
	throw new Error();
    }
    
    public static void method11995
	(float f, Class287 class287, Class278 class278, Class287 class287_0_,
	 Class287 class287_1_, Class287 class287_2_, Class287 class287_3_,
	 float f_4_, float f_5_, float f_6_, float f_7_) {
	if (!class287_0_.method5601(class287)) {
	    Class287 class287_8_ = Class287.method5561(0.0F, 0.0F, 0.0F);
	    Class287 class287_9_
		= Class287.method5562(Class287.method5578(class287_0_,
							  class287));
	    class287_9_.method5592(class278);
	    Class287 class287_10_
		= Class287.method5578(class287_9_, class287_8_);
	    float f_11_ = class287_10_.method5559();
	    if (f_4_ > 0.0F) {
		class287_2_ = Class287.method5562(class287_2_);
		class287_2_.method5587(f_5_ * (f_11_ / f_4_));
	    }
	    if (class287_2_.aFloat4477 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class287.aFloat4477) || f_11_ > f_6_
		|| f_11_ < f_7_) {
		class287.method5655(class287_0_);
		class287_1_.method5645();
	    } else {
		class278.method5390();
		Class287 class287_12_ = Class287.method5561(1.0F, 0.0F, 0.0F);
		Class287 class287_13_ = Class287.method5561(0.0F, 1.0F, 0.0F);
		Class287 class287_14_ = Class287.method5561(0.0F, 0.0F, 1.0F);
		class287_12_.method5592(class278);
		class287_13_.method5592(class278);
		class287_14_.method5592(class278);
		Class287 class287_15_
		    = Class287.method5561(Class287.method5580(class287_12_,
							      class287_1_),
					  Class287.method5580(class287_13_,
							      class287_1_),
					  Class287.method5580(class287_14_,
							      class287_1_));
		Class287 class287_16_ = Class287.method5562(class287_15_);
		class287_16_.method5584();
		Class287 class287_17_
		    = Class287.method5589(Class287.method5586(class287_16_,
							      class287_16_),
					  Class287.method5591(class287_2_,
							      2.0F));
		Class287 class287_18_ = Class287.method5562(class287_10_);
		class287_18_.method5584();
		Class287 class287_19_ = Class287.method5562(class287_15_);
		if (class287_17_.aFloat4477 > class287_18_.aFloat4477) {
		    if (class287_10_.aFloat4477 < 0.0F) {
			class287_19_.aFloat4477 += class287_2_.aFloat4477 * f;
			if (class287_19_.aFloat4477 > 0.0F)
			    class287_19_.aFloat4477 = 0.0F;
		    } else {
			class287_19_.aFloat4477 -= f * class287_2_.aFloat4477;
			if (class287_19_.aFloat4477 < 0.0F)
			    class287_19_.aFloat4477 = 0.0F;
		    }
		} else if (class287_16_.aFloat4477 < class287_3_.aFloat4477) {
		    if (class287_10_.aFloat4477 < 0.0F) {
			class287_19_.aFloat4477 -= class287_2_.aFloat4477 * f;
			if (class287_19_.aFloat4477 < -class287_3_.aFloat4477)
			    class287_19_.aFloat4477 = -class287_3_.aFloat4477;
		    } else {
			class287_19_.aFloat4477 += f * class287_2_.aFloat4477;
			if (class287_19_.aFloat4477 > class287_3_.aFloat4477)
			    class287_19_.aFloat4477 = class287_3_.aFloat4477;
		    }
		}
		if (class287_17_.aFloat4474 > class287_18_.aFloat4474) {
		    if (class287_10_.aFloat4474 < 0.0F) {
			class287_19_.aFloat4474 += f * class287_2_.aFloat4474;
			if (class287_19_.aFloat4474 > 0.0F)
			    class287_19_.aFloat4474 = 0.0F;
		    } else {
			class287_19_.aFloat4474 -= f * class287_2_.aFloat4474;
			if (class287_19_.aFloat4474 < 0.0F)
			    class287_19_.aFloat4474 = 0.0F;
		    }
		} else if (class287_16_.aFloat4474 < class287_3_.aFloat4474) {
		    if (class287_10_.aFloat4474 < 0.0F) {
			class287_19_.aFloat4474 -= class287_2_.aFloat4474 * f;
			if (class287_19_.aFloat4474 < -class287_3_.aFloat4474)
			    class287_19_.aFloat4474 = -class287_3_.aFloat4474;
		    } else {
			class287_19_.aFloat4474 += f * class287_2_.aFloat4474;
			if (class287_19_.aFloat4474 > class287_3_.aFloat4474)
			    class287_19_.aFloat4474 = class287_3_.aFloat4474;
		    }
		}
		if (class287_17_.aFloat4479 > class287_18_.aFloat4479) {
		    if (class287_10_.aFloat4479 < 0.0F) {
			class287_19_.aFloat4479 += class287_2_.aFloat4479 * f;
			if (class287_19_.aFloat4479 > 0.0F)
			    class287_19_.aFloat4479 = 0.0F;
		    } else {
			class287_19_.aFloat4479 -= f * class287_2_.aFloat4479;
			if (class287_19_.aFloat4479 < 0.0F)
			    class287_19_.aFloat4479 = 0.0F;
		    }
		} else if (class287_16_.aFloat4479 < class287_3_.aFloat4479) {
		    if (class287_10_.aFloat4479 < 0.0F) {
			class287_19_.aFloat4479 -= class287_2_.aFloat4479 * f;
			if (class287_19_.aFloat4479 < -class287_3_.aFloat4479)
			    class287_19_.aFloat4479 = -class287_3_.aFloat4479;
		    } else {
			class287_19_.aFloat4479 += f * class287_2_.aFloat4479;
			if (class287_19_.aFloat4479 > class287_3_.aFloat4479)
			    class287_19_.aFloat4479 = class287_3_.aFloat4479;
		    }
		}
		Class287 class287_20_
		    = Class287.method5591(class287_12_,
					  class287_19_.aFloat4477);
		class287_20_.method5651(class287_13_, class287_19_.aFloat4474);
		class287_20_.method5651(class287_14_, class287_19_.aFloat4479);
		class287_1_.method5595(class287_20_, 0.8F);
		class287.method5574(Class287.method5591(class287_1_, f));
		class287_16_.method5564();
		class287_19_.method5564();
		class287_18_.method5564();
	    }
	}
    }
    
    public static void method11996
	(float f, Class287 class287, Class278 class278, Class287 class287_21_,
	 Class287 class287_22_, Class287 class287_23_, Class287 class287_24_,
	 float f_25_, float f_26_, float f_27_, float f_28_) {
	if (!class287_21_.method5601(class287)) {
	    Class287 class287_29_ = Class287.method5561(0.0F, 0.0F, 0.0F);
	    Class287 class287_30_
		= Class287.method5562(Class287.method5578(class287_21_,
							  class287));
	    class287_30_.method5592(class278);
	    Class287 class287_31_
		= Class287.method5578(class287_30_, class287_29_);
	    float f_32_ = class287_31_.method5559();
	    if (f_25_ > 0.0F) {
		class287_23_ = Class287.method5562(class287_23_);
		class287_23_.method5587(f_26_ * (f_32_ / f_25_));
	    }
	    if (class287_23_.aFloat4477 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class287.aFloat4477) || f_32_ > f_27_
		|| f_32_ < f_28_) {
		class287.method5655(class287_21_);
		class287_22_.method5645();
	    } else {
		class278.method5390();
		Class287 class287_33_ = Class287.method5561(1.0F, 0.0F, 0.0F);
		Class287 class287_34_ = Class287.method5561(0.0F, 1.0F, 0.0F);
		Class287 class287_35_ = Class287.method5561(0.0F, 0.0F, 1.0F);
		class287_33_.method5592(class278);
		class287_34_.method5592(class278);
		class287_35_.method5592(class278);
		Class287 class287_36_
		    = Class287.method5561(Class287.method5580(class287_33_,
							      class287_22_),
					  Class287.method5580(class287_34_,
							      class287_22_),
					  Class287.method5580(class287_35_,
							      class287_22_));
		Class287 class287_37_ = Class287.method5562(class287_36_);
		class287_37_.method5584();
		Class287 class287_38_
		    = Class287.method5589(Class287.method5586(class287_37_,
							      class287_37_),
					  Class287.method5591(class287_23_,
							      2.0F));
		Class287 class287_39_ = Class287.method5562(class287_31_);
		class287_39_.method5584();
		Class287 class287_40_ = Class287.method5562(class287_36_);
		if (class287_38_.aFloat4477 > class287_39_.aFloat4477) {
		    if (class287_31_.aFloat4477 < 0.0F) {
			class287_40_.aFloat4477 += class287_23_.aFloat4477 * f;
			if (class287_40_.aFloat4477 > 0.0F)
			    class287_40_.aFloat4477 = 0.0F;
		    } else {
			class287_40_.aFloat4477 -= f * class287_23_.aFloat4477;
			if (class287_40_.aFloat4477 < 0.0F)
			    class287_40_.aFloat4477 = 0.0F;
		    }
		} else if (class287_37_.aFloat4477 < class287_24_.aFloat4477) {
		    if (class287_31_.aFloat4477 < 0.0F) {
			class287_40_.aFloat4477 -= class287_23_.aFloat4477 * f;
			if (class287_40_.aFloat4477 < -class287_24_.aFloat4477)
			    class287_40_.aFloat4477 = -class287_24_.aFloat4477;
		    } else {
			class287_40_.aFloat4477 += f * class287_23_.aFloat4477;
			if (class287_40_.aFloat4477 > class287_24_.aFloat4477)
			    class287_40_.aFloat4477 = class287_24_.aFloat4477;
		    }
		}
		if (class287_38_.aFloat4474 > class287_39_.aFloat4474) {
		    if (class287_31_.aFloat4474 < 0.0F) {
			class287_40_.aFloat4474 += f * class287_23_.aFloat4474;
			if (class287_40_.aFloat4474 > 0.0F)
			    class287_40_.aFloat4474 = 0.0F;
		    } else {
			class287_40_.aFloat4474 -= f * class287_23_.aFloat4474;
			if (class287_40_.aFloat4474 < 0.0F)
			    class287_40_.aFloat4474 = 0.0F;
		    }
		} else if (class287_37_.aFloat4474 < class287_24_.aFloat4474) {
		    if (class287_31_.aFloat4474 < 0.0F) {
			class287_40_.aFloat4474 -= class287_23_.aFloat4474 * f;
			if (class287_40_.aFloat4474 < -class287_24_.aFloat4474)
			    class287_40_.aFloat4474 = -class287_24_.aFloat4474;
		    } else {
			class287_40_.aFloat4474 += f * class287_23_.aFloat4474;
			if (class287_40_.aFloat4474 > class287_24_.aFloat4474)
			    class287_40_.aFloat4474 = class287_24_.aFloat4474;
		    }
		}
		if (class287_38_.aFloat4479 > class287_39_.aFloat4479) {
		    if (class287_31_.aFloat4479 < 0.0F) {
			class287_40_.aFloat4479 += class287_23_.aFloat4479 * f;
			if (class287_40_.aFloat4479 > 0.0F)
			    class287_40_.aFloat4479 = 0.0F;
		    } else {
			class287_40_.aFloat4479 -= f * class287_23_.aFloat4479;
			if (class287_40_.aFloat4479 < 0.0F)
			    class287_40_.aFloat4479 = 0.0F;
		    }
		} else if (class287_37_.aFloat4479 < class287_24_.aFloat4479) {
		    if (class287_31_.aFloat4479 < 0.0F) {
			class287_40_.aFloat4479 -= class287_23_.aFloat4479 * f;
			if (class287_40_.aFloat4479 < -class287_24_.aFloat4479)
			    class287_40_.aFloat4479 = -class287_24_.aFloat4479;
		    } else {
			class287_40_.aFloat4479 += f * class287_23_.aFloat4479;
			if (class287_40_.aFloat4479 > class287_24_.aFloat4479)
			    class287_40_.aFloat4479 = class287_24_.aFloat4479;
		    }
		}
		Class287 class287_41_
		    = Class287.method5591(class287_33_,
					  class287_40_.aFloat4477);
		class287_41_.method5651(class287_34_, class287_40_.aFloat4474);
		class287_41_.method5651(class287_35_, class287_40_.aFloat4479);
		class287_22_.method5595(class287_41_, 0.8F);
		class287.method5574(Class287.method5591(class287_22_, f));
		class287_37_.method5564();
		class287_40_.method5564();
		class287_39_.method5564();
	    }
	}
    }
    
    public static void method11997
	(float f, Class287 class287, Class278 class278, Class287 class287_42_,
	 Class287 class287_43_, Class287 class287_44_, Class287 class287_45_,
	 float f_46_, float f_47_, float f_48_, float f_49_) {
	if (!class287_42_.method5601(class287)) {
	    Class287 class287_50_ = Class287.method5561(0.0F, 0.0F, 0.0F);
	    Class287 class287_51_
		= Class287.method5562(Class287.method5578(class287_42_,
							  class287));
	    class287_51_.method5592(class278);
	    Class287 class287_52_
		= Class287.method5578(class287_51_, class287_50_);
	    float f_53_ = class287_52_.method5559();
	    if (f_46_ > 0.0F) {
		class287_44_ = Class287.method5562(class287_44_);
		class287_44_.method5587(f_47_ * (f_53_ / f_46_));
	    }
	    if (class287_44_.aFloat4477 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class287.aFloat4477) || f_53_ > f_48_
		|| f_53_ < f_49_) {
		class287.method5655(class287_42_);
		class287_43_.method5645();
	    } else {
		class278.method5390();
		Class287 class287_54_ = Class287.method5561(1.0F, 0.0F, 0.0F);
		Class287 class287_55_ = Class287.method5561(0.0F, 1.0F, 0.0F);
		Class287 class287_56_ = Class287.method5561(0.0F, 0.0F, 1.0F);
		class287_54_.method5592(class278);
		class287_55_.method5592(class278);
		class287_56_.method5592(class278);
		Class287 class287_57_
		    = Class287.method5561(Class287.method5580(class287_54_,
							      class287_43_),
					  Class287.method5580(class287_55_,
							      class287_43_),
					  Class287.method5580(class287_56_,
							      class287_43_));
		Class287 class287_58_ = Class287.method5562(class287_57_);
		class287_58_.method5584();
		Class287 class287_59_
		    = Class287.method5589(Class287.method5586(class287_58_,
							      class287_58_),
					  Class287.method5591(class287_44_,
							      2.0F));
		Class287 class287_60_ = Class287.method5562(class287_52_);
		class287_60_.method5584();
		Class287 class287_61_ = Class287.method5562(class287_57_);
		if (class287_59_.aFloat4477 > class287_60_.aFloat4477) {
		    if (class287_52_.aFloat4477 < 0.0F) {
			class287_61_.aFloat4477 += class287_44_.aFloat4477 * f;
			if (class287_61_.aFloat4477 > 0.0F)
			    class287_61_.aFloat4477 = 0.0F;
		    } else {
			class287_61_.aFloat4477 -= f * class287_44_.aFloat4477;
			if (class287_61_.aFloat4477 < 0.0F)
			    class287_61_.aFloat4477 = 0.0F;
		    }
		} else if (class287_58_.aFloat4477 < class287_45_.aFloat4477) {
		    if (class287_52_.aFloat4477 < 0.0F) {
			class287_61_.aFloat4477 -= class287_44_.aFloat4477 * f;
			if (class287_61_.aFloat4477 < -class287_45_.aFloat4477)
			    class287_61_.aFloat4477 = -class287_45_.aFloat4477;
		    } else {
			class287_61_.aFloat4477 += f * class287_44_.aFloat4477;
			if (class287_61_.aFloat4477 > class287_45_.aFloat4477)
			    class287_61_.aFloat4477 = class287_45_.aFloat4477;
		    }
		}
		if (class287_59_.aFloat4474 > class287_60_.aFloat4474) {
		    if (class287_52_.aFloat4474 < 0.0F) {
			class287_61_.aFloat4474 += f * class287_44_.aFloat4474;
			if (class287_61_.aFloat4474 > 0.0F)
			    class287_61_.aFloat4474 = 0.0F;
		    } else {
			class287_61_.aFloat4474 -= f * class287_44_.aFloat4474;
			if (class287_61_.aFloat4474 < 0.0F)
			    class287_61_.aFloat4474 = 0.0F;
		    }
		} else if (class287_58_.aFloat4474 < class287_45_.aFloat4474) {
		    if (class287_52_.aFloat4474 < 0.0F) {
			class287_61_.aFloat4474 -= class287_44_.aFloat4474 * f;
			if (class287_61_.aFloat4474 < -class287_45_.aFloat4474)
			    class287_61_.aFloat4474 = -class287_45_.aFloat4474;
		    } else {
			class287_61_.aFloat4474 += f * class287_44_.aFloat4474;
			if (class287_61_.aFloat4474 > class287_45_.aFloat4474)
			    class287_61_.aFloat4474 = class287_45_.aFloat4474;
		    }
		}
		if (class287_59_.aFloat4479 > class287_60_.aFloat4479) {
		    if (class287_52_.aFloat4479 < 0.0F) {
			class287_61_.aFloat4479 += class287_44_.aFloat4479 * f;
			if (class287_61_.aFloat4479 > 0.0F)
			    class287_61_.aFloat4479 = 0.0F;
		    } else {
			class287_61_.aFloat4479 -= f * class287_44_.aFloat4479;
			if (class287_61_.aFloat4479 < 0.0F)
			    class287_61_.aFloat4479 = 0.0F;
		    }
		} else if (class287_58_.aFloat4479 < class287_45_.aFloat4479) {
		    if (class287_52_.aFloat4479 < 0.0F) {
			class287_61_.aFloat4479 -= class287_44_.aFloat4479 * f;
			if (class287_61_.aFloat4479 < -class287_45_.aFloat4479)
			    class287_61_.aFloat4479 = -class287_45_.aFloat4479;
		    } else {
			class287_61_.aFloat4479 += f * class287_44_.aFloat4479;
			if (class287_61_.aFloat4479 > class287_45_.aFloat4479)
			    class287_61_.aFloat4479 = class287_45_.aFloat4479;
		    }
		}
		Class287 class287_62_
		    = Class287.method5591(class287_54_,
					  class287_61_.aFloat4477);
		class287_62_.method5651(class287_55_, class287_61_.aFloat4474);
		class287_62_.method5651(class287_56_, class287_61_.aFloat4479);
		class287_43_.method5595(class287_62_, 0.8F);
		class287.method5574(Class287.method5591(class287_43_, f));
		class287_58_.method5564();
		class287_61_.method5564();
		class287_60_.method5564();
	    }
	}
    }
    
    public static void method11998
	(float f, Class287 class287, Class278 class278, Class287 class287_63_,
	 Class287 class287_64_, Class287 class287_65_, Class287 class287_66_,
	 float f_67_, float f_68_, float f_69_, float f_70_) {
	if (!class287_63_.method5601(class287)) {
	    Class287 class287_71_ = Class287.method5561(0.0F, 0.0F, 0.0F);
	    Class287 class287_72_
		= Class287.method5562(Class287.method5578(class287_63_,
							  class287));
	    class287_72_.method5592(class278);
	    Class287 class287_73_
		= Class287.method5578(class287_72_, class287_71_);
	    float f_74_ = class287_73_.method5559();
	    if (f_67_ > 0.0F) {
		class287_65_ = Class287.method5562(class287_65_);
		class287_65_.method5587(f_68_ * (f_74_ / f_67_));
	    }
	    if (class287_65_.aFloat4477 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class287.aFloat4477) || f_74_ > f_69_
		|| f_74_ < f_70_) {
		class287.method5655(class287_63_);
		class287_64_.method5645();
	    } else {
		class278.method5390();
		Class287 class287_75_ = Class287.method5561(1.0F, 0.0F, 0.0F);
		Class287 class287_76_ = Class287.method5561(0.0F, 1.0F, 0.0F);
		Class287 class287_77_ = Class287.method5561(0.0F, 0.0F, 1.0F);
		class287_75_.method5592(class278);
		class287_76_.method5592(class278);
		class287_77_.method5592(class278);
		Class287 class287_78_
		    = Class287.method5561(Class287.method5580(class287_75_,
							      class287_64_),
					  Class287.method5580(class287_76_,
							      class287_64_),
					  Class287.method5580(class287_77_,
							      class287_64_));
		Class287 class287_79_ = Class287.method5562(class287_78_);
		class287_79_.method5584();
		Class287 class287_80_
		    = Class287.method5589(Class287.method5586(class287_79_,
							      class287_79_),
					  Class287.method5591(class287_65_,
							      2.0F));
		Class287 class287_81_ = Class287.method5562(class287_73_);
		class287_81_.method5584();
		Class287 class287_82_ = Class287.method5562(class287_78_);
		if (class287_80_.aFloat4477 > class287_81_.aFloat4477) {
		    if (class287_73_.aFloat4477 < 0.0F) {
			class287_82_.aFloat4477 += class287_65_.aFloat4477 * f;
			if (class287_82_.aFloat4477 > 0.0F)
			    class287_82_.aFloat4477 = 0.0F;
		    } else {
			class287_82_.aFloat4477 -= f * class287_65_.aFloat4477;
			if (class287_82_.aFloat4477 < 0.0F)
			    class287_82_.aFloat4477 = 0.0F;
		    }
		} else if (class287_79_.aFloat4477 < class287_66_.aFloat4477) {
		    if (class287_73_.aFloat4477 < 0.0F) {
			class287_82_.aFloat4477 -= class287_65_.aFloat4477 * f;
			if (class287_82_.aFloat4477 < -class287_66_.aFloat4477)
			    class287_82_.aFloat4477 = -class287_66_.aFloat4477;
		    } else {
			class287_82_.aFloat4477 += f * class287_65_.aFloat4477;
			if (class287_82_.aFloat4477 > class287_66_.aFloat4477)
			    class287_82_.aFloat4477 = class287_66_.aFloat4477;
		    }
		}
		if (class287_80_.aFloat4474 > class287_81_.aFloat4474) {
		    if (class287_73_.aFloat4474 < 0.0F) {
			class287_82_.aFloat4474 += f * class287_65_.aFloat4474;
			if (class287_82_.aFloat4474 > 0.0F)
			    class287_82_.aFloat4474 = 0.0F;
		    } else {
			class287_82_.aFloat4474 -= f * class287_65_.aFloat4474;
			if (class287_82_.aFloat4474 < 0.0F)
			    class287_82_.aFloat4474 = 0.0F;
		    }
		} else if (class287_79_.aFloat4474 < class287_66_.aFloat4474) {
		    if (class287_73_.aFloat4474 < 0.0F) {
			class287_82_.aFloat4474 -= class287_65_.aFloat4474 * f;
			if (class287_82_.aFloat4474 < -class287_66_.aFloat4474)
			    class287_82_.aFloat4474 = -class287_66_.aFloat4474;
		    } else {
			class287_82_.aFloat4474 += f * class287_65_.aFloat4474;
			if (class287_82_.aFloat4474 > class287_66_.aFloat4474)
			    class287_82_.aFloat4474 = class287_66_.aFloat4474;
		    }
		}
		if (class287_80_.aFloat4479 > class287_81_.aFloat4479) {
		    if (class287_73_.aFloat4479 < 0.0F) {
			class287_82_.aFloat4479 += class287_65_.aFloat4479 * f;
			if (class287_82_.aFloat4479 > 0.0F)
			    class287_82_.aFloat4479 = 0.0F;
		    } else {
			class287_82_.aFloat4479 -= f * class287_65_.aFloat4479;
			if (class287_82_.aFloat4479 < 0.0F)
			    class287_82_.aFloat4479 = 0.0F;
		    }
		} else if (class287_79_.aFloat4479 < class287_66_.aFloat4479) {
		    if (class287_73_.aFloat4479 < 0.0F) {
			class287_82_.aFloat4479 -= class287_65_.aFloat4479 * f;
			if (class287_82_.aFloat4479 < -class287_66_.aFloat4479)
			    class287_82_.aFloat4479 = -class287_66_.aFloat4479;
		    } else {
			class287_82_.aFloat4479 += f * class287_65_.aFloat4479;
			if (class287_82_.aFloat4479 > class287_66_.aFloat4479)
			    class287_82_.aFloat4479 = class287_66_.aFloat4479;
		    }
		}
		Class287 class287_83_
		    = Class287.method5591(class287_75_,
					  class287_82_.aFloat4477);
		class287_83_.method5651(class287_76_, class287_82_.aFloat4474);
		class287_83_.method5651(class287_77_, class287_82_.aFloat4479);
		class287_64_.method5595(class287_83_, 0.8F);
		class287.method5574(Class287.method5591(class287_64_, f));
		class287_79_.method5564();
		class287_82_.method5564();
		class287_81_.method5564();
	    }
	}
    }
    
    static final void method11999(ClientScriptData class454, byte i) {
	int i_84_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851
		  .method7880(i_84_, 996762312);
    }
}
