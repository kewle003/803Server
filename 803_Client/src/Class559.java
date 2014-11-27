/* Class559 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class559
{
    static final int anInt7262 = 12;
    int anInt7263 = 0;
    static final int anInt7264 = 8;
    static final int anInt7265 = 1;
    static final int anInt7266 = 2;
    Class550 aClass550_7267;
    int anInt7268;
    static final int anInt7269 = 38912;
    static final int anInt7270 = 2004;
    static final int anInt7271 = -2004;
    
    Class559(Class550 class550) {
	((Class559) this).aClass550_7267 = class550;
    }
    
    final boolean method12328(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			      int i_4_, int i_5_, int i_6_, int i_7_) {
	if (i > 2004 || i_0_ > 2004 || i_1_ > 2004 || i_2_ > 2004
	    || i_3_ > 2004 || i_4_ > 2004)
	    return false;
	if (i < -2004 || i_0_ < -2004 || i_1_ < -2004 || i_2_ < -2004
	    || i_3_ < -2004 || i_4_ < -2004)
	    return false;
	if (((Class559) this).anInt7268 == 2) {
	    int i_8_
		= i_2_ + i * (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
	    if (i_8_ >= 0
		&& i_8_ < (((Class550) ((Class559) this).aClass550_7267)
			   .anIntArray7114).length
		&& ((i_5_ << 8) - 38912
		    < (((Class550) ((Class559) this).aClass550_7267)
		       .anIntArray7114[i_8_])))
		return false;
	    i_8_ = i_3_ + i_0_ * (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118);
	    if (i_8_ >= 0
		&& i_8_ < (((Class550) ((Class559) this).aClass550_7267)
			   .anIntArray7114).length
		&& ((i_6_ << 8) - 38912
		    < (((Class550) ((Class559) this).aClass550_7267)
		       .anIntArray7114[i_8_])))
		return false;
	    i_8_ = i_4_ + i_1_ * (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118);
	    if (i_8_ >= 0
		&& i_8_ < (((Class550) ((Class559) this).aClass550_7267)
			   .anIntArray7114).length
		&& ((i_7_ << 8) - 38912
		    < (((Class550) ((Class559) this).aClass550_7267)
		       .anIntArray7114[i_8_])))
		return false;
	}
	int i_9_ = i_3_ - i_2_;
	int i_10_ = i_0_ - i;
	int i_11_ = i_4_ - i_2_;
	int i_12_ = i_1_ - i;
	int i_13_ = i_6_ - i_5_;
	int i_14_ = i_7_ - i_5_;
	if (i < i_0_ && i < i_1_) {
	    i--;
	    if (i_0_ > i_1_)
		i_0_++;
	    else
		i_1_++;
	} else if (i_0_ < i_1_) {
	    i_0_--;
	    if (i > i_1_)
		i++;
	    else
		i_1_++;
	} else {
	    i_1_--;
	    if (i > i_0_)
		i++;
	    else
		i_0_++;
	}
	int i_15_ = 0;
	if (i_0_ != i)
	    i_15_ = (i_3_ - i_2_ << 12) / (i_0_ - i);
	int i_16_ = 0;
	if (i_1_ != i_0_)
	    i_16_ = (i_4_ - i_3_ << 12) / (i_1_ - i_0_);
	int i_17_ = 0;
	if (i_1_ != i)
	    i_17_ = (i_2_ - i_4_ << 12) / (i - i_1_);
	int i_18_ = i_9_ * i_12_ - i_11_ * i_10_;
	if (i_18_ == 0)
	    return false;
	int i_19_ = (i_13_ * i_12_ - i_14_ * i_10_ << 8) / i_18_;
	int i_20_ = (i_14_ * i_9_ - i_13_ * i_11_ << 8) / i_18_;
	if (i <= i_0_ && i <= i_1_) {
	    if (i >= ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		return true;
	    if (i_0_ > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i_0_ = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    if (i_1_ > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i_1_ = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    i_5_ = (i_5_ << 8) - i_19_ * i_2_ + i_19_;
	    if (i_0_ < i_1_) {
		i_4_ = i_2_ <<= 12;
		if (i < 0) {
		    i_4_ -= i_17_ * i;
		    i_2_ -= i_15_ * i;
		    i_5_ -= i_20_ * i;
		    i = 0;
		}
		i_3_ <<= 12;
		if (i_0_ < 0) {
		    i_3_ -= i_16_ * i_0_;
		    i_0_ = 0;
		}
		if (i != i_0_ && i_17_ < i_15_ || i == i_0_ && i_17_ > i_16_) {
		    i_1_ -= i_0_;
		    i_0_ -= i;
		    i *= (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		    while (--i_0_ >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i, 0, (i_4_ >> 12) - 1,
					 (i_2_ >> 12) + 1, i_5_, i_19_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_4_ += i_17_;
			i_2_ += i_15_;
			i_5_ += i_20_;
			i += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		    }
		    while (--i_1_ >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i, 0, (i_4_ >> 12) - 1,
					 (i_3_ >> 12) + 1, i_5_, i_19_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_4_ += i_17_;
			i_3_ += i_16_;
			i_5_ += i_20_;
			i += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		    }
		    return true;
		}
		i_1_ -= i_0_;
		i_0_ -= i;
		i *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i_0_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1,
				     i_5_, i_19_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_4_ += i_17_;
		    i_2_ += i_15_;
		    i_5_ += i_20_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		while (--i_1_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1,
				     i_5_, i_19_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_4_ += i_17_;
		    i_3_ += i_16_;
		    i_5_ += i_20_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		return true;
	    }
	    i_3_ = i_2_ <<= 12;
	    if (i < 0) {
		i_3_ -= i_17_ * i;
		i_2_ -= i_15_ * i;
		i_5_ -= i_20_ * i;
		i = 0;
	    }
	    i_4_ <<= 12;
	    if (i_1_ < 0) {
		i_4_ -= i_16_ * i_1_;
		i_1_ = 0;
	    }
	    if (i != i_1_ && i_17_ < i_15_ || i == i_1_ && i_16_ > i_15_) {
		i_0_ -= i_1_;
		i_1_ -= i;
		i *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i_1_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1,
				     i_5_, i_19_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_3_ += i_17_;
		    i_2_ += i_15_;
		    i_5_ += i_20_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		while (--i_0_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1,
				     i_5_, i_19_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_4_ += i_16_;
		    i_2_ += i_15_;
		    i_5_ += i_20_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		return true;
	    }
	    i_0_ -= i_1_;
	    i_1_ -= i;
	    i *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i_1_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1,
				 i_5_, i_19_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_3_ += i_17_;
		i_2_ += i_15_;
		i_5_ += i_20_;
		i += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i_0_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1,
				 i_5_, i_19_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_4_ += i_16_;
		i_2_ += i_15_;
		i_5_ += i_20_;
		i += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	if (i_0_ <= i_1_) {
	    if (i_0_
		>= ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		return true;
	    if (i_1_ > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i_1_ = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    if (i > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    i_6_ = (i_6_ << 8) - i_19_ * i_3_ + i_19_;
	    if (i_1_ < i) {
		i_2_ = i_3_ <<= 12;
		if (i_0_ < 0) {
		    i_2_ -= i_15_ * i_0_;
		    i_3_ -= i_16_ * i_0_;
		    i_6_ -= i_20_ * i_0_;
		    i_0_ = 0;
		}
		i_4_ <<= 12;
		if (i_1_ < 0) {
		    i_4_ -= i_17_ * i_1_;
		    i_1_ = 0;
		}
		if (i_0_ != i_1_ && i_15_ < i_16_
		    || i_0_ == i_1_ && i_15_ > i_17_) {
		    i -= i_1_;
		    i_1_ -= i_0_;
		    i_0_ *= (((Class550) ((Class559) this).aClass550_7267)
			     .anInt7118);
		    while (--i_1_ >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i_0_, 0, (i_2_ >> 12) - 1,
					 (i_3_ >> 12) + 1, i_6_, i_19_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_2_ += i_15_;
			i_3_ += i_16_;
			i_6_ += i_20_;
			i_0_ += (((Class550) ((Class559) this).aClass550_7267)
				 .anInt7118);
		    }
		    while (--i >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i_0_, 0, (i_2_ >> 12) - 1,
					 (i_4_ >> 12) + 1, i_6_, i_19_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_2_ += i_15_;
			i_4_ += i_17_;
			i_6_ += i_20_;
			i_0_ += (((Class550) ((Class559) this).aClass550_7267)
				 .anInt7118);
		    }
		    return true;
		}
		i -= i_1_;
		i_1_ -= i_0_;
		i_0_
		    *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i_1_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_0_, 0, (i_3_ >> 12) - 1,
				     (i_2_ >> 12) + 1, i_6_, i_19_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_2_ += i_15_;
		    i_3_ += i_16_;
		    i_6_ += i_20_;
		    i_0_ += (((Class550) ((Class559) this).aClass550_7267)
			     .anInt7118);
		}
		while (--i >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_0_, 0, (i_4_ >> 12) - 1,
				     (i_2_ >> 12) + 1, i_6_, i_19_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_2_ += i_15_;
		    i_4_ += i_17_;
		    i_6_ += i_20_;
		    i_0_ += (((Class550) ((Class559) this).aClass550_7267)
			     .anInt7118);
		}
		return true;
	    }
	    i_4_ = i_3_ <<= 12;
	    if (i_0_ < 0) {
		i_4_ -= i_15_ * i_0_;
		i_3_ -= i_16_ * i_0_;
		i_6_ -= i_20_ * i_0_;
		i_0_ = 0;
	    }
	    i_2_ <<= 12;
	    if (i < 0) {
		i_2_ -= i_17_ * i;
		i = 0;
	    }
	    if (i_15_ < i_16_) {
		i_1_ -= i;
		i -= i_0_;
		i_0_
		    *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_0_, 0, (i_4_ >> 12) - 1,
				     (i_3_ >> 12) + 1, i_6_, i_19_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_4_ += i_15_;
		    i_3_ += i_16_;
		    i_6_ += i_20_;
		    i_0_ += (((Class550) ((Class559) this).aClass550_7267)
			     .anInt7118);
		}
		while (--i_1_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_0_, 0, (i_2_ >> 12) - 1,
				     (i_3_ >> 12) + 1, i_6_, i_19_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_2_ += i_17_;
		    i_3_ += i_16_;
		    i_6_ += i_20_;
		    i_0_ += (((Class550) ((Class559) this).aClass550_7267)
			     .anInt7118);
		}
		return true;
	    }
	    i_1_ -= i;
	    i -= i_0_;
	    i_0_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_0_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1,
				 i_6_, i_19_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_4_ += i_15_;
		i_3_ += i_16_;
		i_6_ += i_20_;
		i_0_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i_1_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_0_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1,
				 i_6_, i_19_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_2_ += i_17_;
		i_3_ += i_16_;
		i_6_ += i_20_;
		i_0_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	if (i_1_ >= ((Class550) ((Class559) this).aClass550_7267).anInt7113)
	    return true;
	if (i > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
	    i = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	if (i_0_ > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
	    i_0_ = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	i_7_ = (i_7_ << 8) - i_19_ * i_4_ + i_19_;
	if (i < i_0_) {
	    i_3_ = i_4_ <<= 12;
	    if (i_1_ < 0) {
		i_3_ -= i_16_ * i_1_;
		i_4_ -= i_17_ * i_1_;
		i_7_ -= i_20_ * i_1_;
		i_1_ = 0;
	    }
	    i_2_ <<= 12;
	    if (i < 0) {
		i_2_ -= i_15_ * i;
		i = 0;
	    }
	    if (i_16_ < i_17_) {
		i_0_ -= i;
		i -= i_1_;
		i_1_
		    *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_1_, 0, (i_3_ >> 12) - 1,
				     (i_4_ >> 12) + 1, i_7_, i_19_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_3_ += i_16_;
		    i_4_ += i_17_;
		    i_7_ += i_20_;
		    i_1_ += (((Class550) ((Class559) this).aClass550_7267)
			     .anInt7118);
		}
		while (--i_0_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_1_, 0, (i_3_ >> 12) - 1,
				     (i_2_ >> 12) + 1, i_7_, i_19_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_3_ += i_16_;
		    i_2_ += i_15_;
		    i_7_ += i_20_;
		    i_1_ += (((Class550) ((Class559) this).aClass550_7267)
			     .anInt7118);
		}
		return true;
	    }
	    i_0_ -= i;
	    i -= i_1_;
	    i_1_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_1_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1,
				 i_7_, i_19_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_3_ += i_16_;
		i_4_ += i_17_;
		i_7_ += i_20_;
		i_1_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i_0_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_1_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1,
				 i_7_, i_19_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_3_ += i_16_;
		i_2_ += i_15_;
		i_7_ += i_20_;
		i_1_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	i_2_ = i_4_ <<= 12;
	if (i_1_ < 0) {
	    i_2_ -= i_16_ * i_1_;
	    i_4_ -= i_17_ * i_1_;
	    i_7_ -= i_20_ * i_1_;
	    i_1_ = 0;
	}
	i_3_ <<= 12;
	if (i_0_ < 0) {
	    i_3_ -= i_15_ * i_0_;
	    i_0_ = 0;
	}
	if (i_16_ < i_17_) {
	    i -= i_0_;
	    i_0_ -= i_1_;
	    i_1_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i_0_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_1_, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1,
				 i_7_, i_19_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_2_ += i_16_;
		i_4_ += i_17_;
		i_7_ += i_20_;
		i_1_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_1_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1,
				 i_7_, i_19_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_3_ += i_15_;
		i_4_ += i_17_;
		i_7_ += i_20_;
		i_1_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	i -= i_0_;
	i_0_ -= i_1_;
	i_1_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	while (--i_0_ >= 0) {
	    if (!method12329((((Class550) ((Class559) this).aClass550_7267)
			      .anIntArray7114),
			     i_1_, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_7_,
			     i_19_,
			     (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118)))
		return false;
	    i_2_ += i_16_;
	    i_4_ += i_17_;
	    i_7_ += i_20_;
	    i_1_ += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	}
	while (--i >= 0) {
	    if (!method12329((((Class550) ((Class559) this).aClass550_7267)
			      .anIntArray7114),
			     i_1_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_,
			     i_19_,
			     (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118)))
		return false;
	    i_3_ += i_15_;
	    i_4_ += i_17_;
	    i_7_ += i_20_;
	    i_1_ += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	}
	return true;
    }
    
    final boolean method12329(int[] is, int i, int i_21_, int i_22_, int i_23_,
			      int i_24_, int i_25_, int i_26_) {
	if (i_23_ > i_26_)
	    i_23_ = i_26_;
	if (i_22_ < 0)
	    i_22_ = 0;
	if (i_22_ >= i_23_)
	    return true;
	i += i_22_ - 1;
	i_21_ = i_23_ - i_22_ >> 2;
	i_24_ += i_25_ * i_22_;
	if (((Class559) this).anInt7268 == 1) {
	    ((Class559) this).anInt7263 += i_21_;
	    while (--i_21_ >= 0) {
		if (i_24_ < is[++i])
		    is[i] = i_24_;
		i_24_ += i_25_;
		if (i_24_ < is[++i])
		    is[i] = i_24_;
		i_24_ += i_25_;
		if (i_24_ < is[++i])
		    is[i] = i_24_;
		i_24_ += i_25_;
		if (i_24_ < is[++i])
		    is[i] = i_24_;
		i_24_ += i_25_;
	    }
	    i_21_ = i_23_ - i_22_ & 0x3;
	    while (--i_21_ >= 0) {
		if (i_24_ < is[++i])
		    is[i] = i_24_;
		i_24_ += i_25_;
	    }
	} else {
	    i_24_ -= 38912;
	    while (--i_21_ >= 0) {
		if (i_24_ < is[++i])
		    return false;
		i_24_ += i_25_;
		if (i_24_ < is[++i])
		    return false;
		i_24_ += i_25_;
		if (i_24_ < is[++i])
		    return false;
		i_24_ += i_25_;
		if (i_24_ < is[++i])
		    return false;
		i_24_ += i_25_;
	    }
	    i_21_ = i_23_ - i_22_ & 0x3;
	    while (--i_21_ >= 0) {
		if (i_24_ < is[++i])
		    return false;
		i_24_ += i_25_;
	    }
	}
	return true;
    }
    
    final boolean method12330(int i, int i_27_, int i_28_, int i_29_,
			      int i_30_, int i_31_, int i_32_, int i_33_,
			      int i_34_) {
	if (i > 2004 || i_27_ > 2004 || i_28_ > 2004 || i_29_ > 2004
	    || i_30_ > 2004 || i_31_ > 2004)
	    return false;
	if (i < -2004 || i_27_ < -2004 || i_28_ < -2004 || i_29_ < -2004
	    || i_30_ < -2004 || i_31_ < -2004)
	    return false;
	if (((Class559) this).anInt7268 == 2) {
	    int i_35_
		= i_29_ + i * (((Class550) ((Class559) this).aClass550_7267)
			       .anInt7118);
	    if (i_35_ >= 0
		&& i_35_ < (((Class550) ((Class559) this).aClass550_7267)
			    .anIntArray7114).length
		&& ((i_32_ << 8) - 38912
		    < (((Class550) ((Class559) this).aClass550_7267)
		       .anIntArray7114[i_35_])))
		return false;
	    i_35_ = i_30_ + i_27_ * ((Class550) (((Class559) this)
						 .aClass550_7267)).anInt7118;
	    if (i_35_ >= 0
		&& i_35_ < (((Class550) ((Class559) this).aClass550_7267)
			    .anIntArray7114).length
		&& ((i_33_ << 8) - 38912
		    < (((Class550) ((Class559) this).aClass550_7267)
		       .anIntArray7114[i_35_])))
		return false;
	    i_35_ = i_31_ + i_28_ * ((Class550) (((Class559) this)
						 .aClass550_7267)).anInt7118;
	    if (i_35_ >= 0
		&& i_35_ < (((Class550) ((Class559) this).aClass550_7267)
			    .anIntArray7114).length
		&& ((i_34_ << 8) - 38912
		    < (((Class550) ((Class559) this).aClass550_7267)
		       .anIntArray7114[i_35_])))
		return false;
	}
	int i_36_ = i_30_ - i_29_;
	int i_37_ = i_27_ - i;
	int i_38_ = i_31_ - i_29_;
	int i_39_ = i_28_ - i;
	int i_40_ = i_33_ - i_32_;
	int i_41_ = i_34_ - i_32_;
	if (i < i_27_ && i < i_28_) {
	    i--;
	    if (i_27_ > i_28_)
		i_27_++;
	    else
		i_28_++;
	} else if (i_27_ < i_28_) {
	    i_27_--;
	    if (i > i_28_)
		i++;
	    else
		i_28_++;
	} else {
	    i_28_--;
	    if (i > i_27_)
		i++;
	    else
		i_27_++;
	}
	int i_42_ = 0;
	if (i_27_ != i)
	    i_42_ = (i_30_ - i_29_ << 12) / (i_27_ - i);
	int i_43_ = 0;
	if (i_28_ != i_27_)
	    i_43_ = (i_31_ - i_30_ << 12) / (i_28_ - i_27_);
	int i_44_ = 0;
	if (i_28_ != i)
	    i_44_ = (i_29_ - i_31_ << 12) / (i - i_28_);
	int i_45_ = i_36_ * i_39_ - i_38_ * i_37_;
	if (i_45_ == 0)
	    return false;
	int i_46_ = (i_40_ * i_39_ - i_41_ * i_37_ << 8) / i_45_;
	int i_47_ = (i_41_ * i_36_ - i_40_ * i_38_ << 8) / i_45_;
	if (i <= i_27_ && i <= i_28_) {
	    if (i >= ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		return true;
	    if (i_27_
		> ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i_27_
		    = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    if (i_28_
		> ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i_28_
		    = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    i_32_ = (i_32_ << 8) - i_46_ * i_29_ + i_46_;
	    if (i_27_ < i_28_) {
		i_31_ = i_29_ <<= 12;
		if (i < 0) {
		    i_31_ -= i_44_ * i;
		    i_29_ -= i_42_ * i;
		    i_32_ -= i_47_ * i;
		    i = 0;
		}
		i_30_ <<= 12;
		if (i_27_ < 0) {
		    i_30_ -= i_43_ * i_27_;
		    i_27_ = 0;
		}
		if (i != i_27_ && i_44_ < i_42_
		    || i == i_27_ && i_44_ > i_43_) {
		    i_28_ -= i_27_;
		    i_27_ -= i;
		    i *= (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		    while (--i_27_ >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i, 0, (i_31_ >> 12) - 1,
					 (i_29_ >> 12) + 1, i_32_, i_46_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_31_ += i_44_;
			i_29_ += i_42_;
			i_32_ += i_47_;
			i += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		    }
		    while (--i_28_ >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i, 0, (i_31_ >> 12) - 1,
					 (i_30_ >> 12) + 1, i_32_, i_46_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_31_ += i_44_;
			i_30_ += i_43_;
			i_32_ += i_47_;
			i += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		    }
		    return true;
		}
		i_28_ -= i_27_;
		i_27_ -= i;
		i *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i_27_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_29_ >> 12) - 1,
				     (i_31_ >> 12) + 1, i_32_, i_46_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_31_ += i_44_;
		    i_29_ += i_42_;
		    i_32_ += i_47_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		while (--i_28_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_30_ >> 12) - 1,
				     (i_31_ >> 12) + 1, i_32_, i_46_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_31_ += i_44_;
		    i_30_ += i_43_;
		    i_32_ += i_47_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		return true;
	    }
	    i_30_ = i_29_ <<= 12;
	    if (i < 0) {
		i_30_ -= i_44_ * i;
		i_29_ -= i_42_ * i;
		i_32_ -= i_47_ * i;
		i = 0;
	    }
	    i_31_ <<= 12;
	    if (i_28_ < 0) {
		i_31_ -= i_43_ * i_28_;
		i_28_ = 0;
	    }
	    if (i != i_28_ && i_44_ < i_42_ || i == i_28_ && i_43_ > i_42_) {
		i_27_ -= i_28_;
		i_28_ -= i;
		i *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i_28_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_30_ >> 12) - 1,
				     (i_29_ >> 12) + 1, i_32_, i_46_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_30_ += i_44_;
		    i_29_ += i_42_;
		    i_32_ += i_47_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		while (--i_27_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_31_ >> 12) - 1,
				     (i_29_ >> 12) + 1, i_32_, i_46_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_31_ += i_43_;
		    i_29_ += i_42_;
		    i_32_ += i_47_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		return true;
	    }
	    i_27_ -= i_28_;
	    i_28_ -= i;
	    i *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i_28_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i, 0, (i_29_ >> 12) - 1, (i_30_ >> 12) + 1,
				 i_32_, i_46_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_30_ += i_44_;
		i_29_ += i_42_;
		i_32_ += i_47_;
		i += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i_27_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i, 0, (i_29_ >> 12) - 1, (i_31_ >> 12) + 1,
				 i_32_, i_46_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_31_ += i_43_;
		i_29_ += i_42_;
		i_32_ += i_47_;
		i += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	if (i_27_ <= i_28_) {
	    if (i_27_
		>= ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		return true;
	    if (i_28_
		> ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i_28_
		    = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    if (i > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    i_33_ = (i_33_ << 8) - i_46_ * i_30_ + i_46_;
	    if (i_28_ < i) {
		i_29_ = i_30_ <<= 12;
		if (i_27_ < 0) {
		    i_29_ -= i_42_ * i_27_;
		    i_30_ -= i_43_ * i_27_;
		    i_33_ -= i_47_ * i_27_;
		    i_27_ = 0;
		}
		i_31_ <<= 12;
		if (i_28_ < 0) {
		    i_31_ -= i_44_ * i_28_;
		    i_28_ = 0;
		}
		if (i_27_ != i_28_ && i_42_ < i_43_
		    || i_27_ == i_28_ && i_42_ > i_44_) {
		    i -= i_28_;
		    i_28_ -= i_27_;
		    i_27_ *= (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		    while (--i_28_ >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i_27_, 0, (i_29_ >> 12) - 1,
					 (i_30_ >> 12) + 1, i_33_, i_46_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_29_ += i_42_;
			i_30_ += i_43_;
			i_33_ += i_47_;
			i_27_ += (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118);
		    }
		    while (--i >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i_27_, 0, (i_29_ >> 12) - 1,
					 (i_31_ >> 12) + 1, i_33_, i_46_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_29_ += i_42_;
			i_31_ += i_44_;
			i_33_ += i_47_;
			i_27_ += (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118);
		    }
		    return true;
		}
		i -= i_28_;
		i_28_ -= i_27_;
		i_27_
		    *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i_28_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_27_, 0, (i_30_ >> 12) - 1,
				     (i_29_ >> 12) + 1, i_33_, i_46_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_29_ += i_42_;
		    i_30_ += i_43_;
		    i_33_ += i_47_;
		    i_27_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		while (--i >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_27_, 0, (i_31_ >> 12) - 1,
				     (i_29_ >> 12) + 1, i_33_, i_46_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_29_ += i_42_;
		    i_31_ += i_44_;
		    i_33_ += i_47_;
		    i_27_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		return true;
	    }
	    i_31_ = i_30_ <<= 12;
	    if (i_27_ < 0) {
		i_31_ -= i_42_ * i_27_;
		i_30_ -= i_43_ * i_27_;
		i_33_ -= i_47_ * i_27_;
		i_27_ = 0;
	    }
	    i_29_ <<= 12;
	    if (i < 0) {
		i_29_ -= i_44_ * i;
		i = 0;
	    }
	    if (i_42_ < i_43_) {
		i_28_ -= i;
		i -= i_27_;
		i_27_
		    *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_27_, 0, (i_31_ >> 12) - 1,
				     (i_30_ >> 12) + 1, i_33_, i_46_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_31_ += i_42_;
		    i_30_ += i_43_;
		    i_33_ += i_47_;
		    i_27_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		while (--i_28_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_27_, 0, (i_29_ >> 12) - 1,
				     (i_30_ >> 12) + 1, i_33_, i_46_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_29_ += i_44_;
		    i_30_ += i_43_;
		    i_33_ += i_47_;
		    i_27_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		return true;
	    }
	    i_28_ -= i;
	    i -= i_27_;
	    i_27_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_27_, 0, (i_30_ >> 12) - 1,
				 (i_31_ >> 12) + 1, i_33_, i_46_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_31_ += i_42_;
		i_30_ += i_43_;
		i_33_ += i_47_;
		i_27_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i_28_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_27_, 0, (i_30_ >> 12) - 1,
				 (i_29_ >> 12) + 1, i_33_, i_46_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_29_ += i_44_;
		i_30_ += i_43_;
		i_33_ += i_47_;
		i_27_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	if (i_28_ >= ((Class550) ((Class559) this).aClass550_7267).anInt7113)
	    return true;
	if (i > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
	    i = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	if (i_27_ > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
	    i_27_ = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	i_34_ = (i_34_ << 8) - i_46_ * i_31_ + i_46_;
	if (i < i_27_) {
	    i_30_ = i_31_ <<= 12;
	    if (i_28_ < 0) {
		i_30_ -= i_43_ * i_28_;
		i_31_ -= i_44_ * i_28_;
		i_34_ -= i_47_ * i_28_;
		i_28_ = 0;
	    }
	    i_29_ <<= 12;
	    if (i < 0) {
		i_29_ -= i_42_ * i;
		i = 0;
	    }
	    if (i_43_ < i_44_) {
		i_27_ -= i;
		i -= i_28_;
		i_28_
		    *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_28_, 0, (i_30_ >> 12) - 1,
				     (i_31_ >> 12) + 1, i_34_, i_46_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_30_ += i_43_;
		    i_31_ += i_44_;
		    i_34_ += i_47_;
		    i_28_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		while (--i_27_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_28_, 0, (i_30_ >> 12) - 1,
				     (i_29_ >> 12) + 1, i_34_, i_46_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_30_ += i_43_;
		    i_29_ += i_42_;
		    i_34_ += i_47_;
		    i_28_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		return true;
	    }
	    i_27_ -= i;
	    i -= i_28_;
	    i_28_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_28_, 0, (i_31_ >> 12) - 1,
				 (i_30_ >> 12) + 1, i_34_, i_46_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_30_ += i_43_;
		i_31_ += i_44_;
		i_34_ += i_47_;
		i_28_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i_27_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_28_, 0, (i_29_ >> 12) - 1,
				 (i_30_ >> 12) + 1, i_34_, i_46_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_30_ += i_43_;
		i_29_ += i_42_;
		i_34_ += i_47_;
		i_28_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	i_29_ = i_31_ <<= 12;
	if (i_28_ < 0) {
	    i_29_ -= i_43_ * i_28_;
	    i_31_ -= i_44_ * i_28_;
	    i_34_ -= i_47_ * i_28_;
	    i_28_ = 0;
	}
	i_30_ <<= 12;
	if (i_27_ < 0) {
	    i_30_ -= i_42_ * i_27_;
	    i_27_ = 0;
	}
	if (i_43_ < i_44_) {
	    i -= i_27_;
	    i_27_ -= i_28_;
	    i_28_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i_27_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_28_, 0, (i_29_ >> 12) - 1,
				 (i_31_ >> 12) + 1, i_34_, i_46_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_29_ += i_43_;
		i_31_ += i_44_;
		i_34_ += i_47_;
		i_28_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_28_, 0, (i_30_ >> 12) - 1,
				 (i_31_ >> 12) + 1, i_34_, i_46_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_30_ += i_42_;
		i_31_ += i_44_;
		i_34_ += i_47_;
		i_28_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	i -= i_27_;
	i_27_ -= i_28_;
	i_28_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	while (--i_27_ >= 0) {
	    if (!method12329((((Class550) ((Class559) this).aClass550_7267)
			      .anIntArray7114),
			     i_28_, 0, (i_31_ >> 12) - 1, (i_29_ >> 12) + 1,
			     i_34_, i_46_,
			     (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118)))
		return false;
	    i_29_ += i_43_;
	    i_31_ += i_44_;
	    i_34_ += i_47_;
	    i_28_ += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	}
	while (--i >= 0) {
	    if (!method12329((((Class550) ((Class559) this).aClass550_7267)
			      .anIntArray7114),
			     i_28_, 0, (i_31_ >> 12) - 1, (i_30_ >> 12) + 1,
			     i_34_, i_46_,
			     (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118)))
		return false;
	    i_30_ += i_42_;
	    i_31_ += i_44_;
	    i_34_ += i_47_;
	    i_28_ += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	}
	return true;
    }
    
    final boolean method12331(int i, int i_48_, int i_49_, int i_50_,
			      int i_51_, int i_52_, int i_53_, int i_54_,
			      int i_55_) {
	if (i > 2004 || i_48_ > 2004 || i_49_ > 2004 || i_50_ > 2004
	    || i_51_ > 2004 || i_52_ > 2004)
	    return false;
	if (i < -2004 || i_48_ < -2004 || i_49_ < -2004 || i_50_ < -2004
	    || i_51_ < -2004 || i_52_ < -2004)
	    return false;
	if (((Class559) this).anInt7268 == 2) {
	    int i_56_
		= i_50_ + i * (((Class550) ((Class559) this).aClass550_7267)
			       .anInt7118);
	    if (i_56_ >= 0
		&& i_56_ < (((Class550) ((Class559) this).aClass550_7267)
			    .anIntArray7114).length
		&& ((i_53_ << 8) - 38912
		    < (((Class550) ((Class559) this).aClass550_7267)
		       .anIntArray7114[i_56_])))
		return false;
	    i_56_ = i_51_ + i_48_ * ((Class550) (((Class559) this)
						 .aClass550_7267)).anInt7118;
	    if (i_56_ >= 0
		&& i_56_ < (((Class550) ((Class559) this).aClass550_7267)
			    .anIntArray7114).length
		&& ((i_54_ << 8) - 38912
		    < (((Class550) ((Class559) this).aClass550_7267)
		       .anIntArray7114[i_56_])))
		return false;
	    i_56_ = i_52_ + i_49_ * ((Class550) (((Class559) this)
						 .aClass550_7267)).anInt7118;
	    if (i_56_ >= 0
		&& i_56_ < (((Class550) ((Class559) this).aClass550_7267)
			    .anIntArray7114).length
		&& ((i_55_ << 8) - 38912
		    < (((Class550) ((Class559) this).aClass550_7267)
		       .anIntArray7114[i_56_])))
		return false;
	}
	int i_57_ = i_51_ - i_50_;
	int i_58_ = i_48_ - i;
	int i_59_ = i_52_ - i_50_;
	int i_60_ = i_49_ - i;
	int i_61_ = i_54_ - i_53_;
	int i_62_ = i_55_ - i_53_;
	if (i < i_48_ && i < i_49_) {
	    i--;
	    if (i_48_ > i_49_)
		i_48_++;
	    else
		i_49_++;
	} else if (i_48_ < i_49_) {
	    i_48_--;
	    if (i > i_49_)
		i++;
	    else
		i_49_++;
	} else {
	    i_49_--;
	    if (i > i_48_)
		i++;
	    else
		i_48_++;
	}
	int i_63_ = 0;
	if (i_48_ != i)
	    i_63_ = (i_51_ - i_50_ << 12) / (i_48_ - i);
	int i_64_ = 0;
	if (i_49_ != i_48_)
	    i_64_ = (i_52_ - i_51_ << 12) / (i_49_ - i_48_);
	int i_65_ = 0;
	if (i_49_ != i)
	    i_65_ = (i_50_ - i_52_ << 12) / (i - i_49_);
	int i_66_ = i_57_ * i_60_ - i_59_ * i_58_;
	if (i_66_ == 0)
	    return false;
	int i_67_ = (i_61_ * i_60_ - i_62_ * i_58_ << 8) / i_66_;
	int i_68_ = (i_62_ * i_57_ - i_61_ * i_59_ << 8) / i_66_;
	if (i <= i_48_ && i <= i_49_) {
	    if (i >= ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		return true;
	    if (i_48_
		> ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i_48_
		    = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    if (i_49_
		> ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i_49_
		    = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    i_53_ = (i_53_ << 8) - i_67_ * i_50_ + i_67_;
	    if (i_48_ < i_49_) {
		i_52_ = i_50_ <<= 12;
		if (i < 0) {
		    i_52_ -= i_65_ * i;
		    i_50_ -= i_63_ * i;
		    i_53_ -= i_68_ * i;
		    i = 0;
		}
		i_51_ <<= 12;
		if (i_48_ < 0) {
		    i_51_ -= i_64_ * i_48_;
		    i_48_ = 0;
		}
		if (i != i_48_ && i_65_ < i_63_
		    || i == i_48_ && i_65_ > i_64_) {
		    i_49_ -= i_48_;
		    i_48_ -= i;
		    i *= (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		    while (--i_48_ >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i, 0, (i_52_ >> 12) - 1,
					 (i_50_ >> 12) + 1, i_53_, i_67_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_52_ += i_65_;
			i_50_ += i_63_;
			i_53_ += i_68_;
			i += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		    }
		    while (--i_49_ >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i, 0, (i_52_ >> 12) - 1,
					 (i_51_ >> 12) + 1, i_53_, i_67_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_52_ += i_65_;
			i_51_ += i_64_;
			i_53_ += i_68_;
			i += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		    }
		    return true;
		}
		i_49_ -= i_48_;
		i_48_ -= i;
		i *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i_48_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_50_ >> 12) - 1,
				     (i_52_ >> 12) + 1, i_53_, i_67_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_52_ += i_65_;
		    i_50_ += i_63_;
		    i_53_ += i_68_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		while (--i_49_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_51_ >> 12) - 1,
				     (i_52_ >> 12) + 1, i_53_, i_67_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_52_ += i_65_;
		    i_51_ += i_64_;
		    i_53_ += i_68_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		return true;
	    }
	    i_51_ = i_50_ <<= 12;
	    if (i < 0) {
		i_51_ -= i_65_ * i;
		i_50_ -= i_63_ * i;
		i_53_ -= i_68_ * i;
		i = 0;
	    }
	    i_52_ <<= 12;
	    if (i_49_ < 0) {
		i_52_ -= i_64_ * i_49_;
		i_49_ = 0;
	    }
	    if (i != i_49_ && i_65_ < i_63_ || i == i_49_ && i_64_ > i_63_) {
		i_48_ -= i_49_;
		i_49_ -= i;
		i *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i_49_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_51_ >> 12) - 1,
				     (i_50_ >> 12) + 1, i_53_, i_67_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_51_ += i_65_;
		    i_50_ += i_63_;
		    i_53_ += i_68_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		while (--i_48_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i, 0, (i_52_ >> 12) - 1,
				     (i_50_ >> 12) + 1, i_53_, i_67_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_52_ += i_64_;
		    i_50_ += i_63_;
		    i_53_ += i_68_;
		    i += (((Class550) ((Class559) this).aClass550_7267)
			  .anInt7118);
		}
		return true;
	    }
	    i_48_ -= i_49_;
	    i_49_ -= i;
	    i *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i_49_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i, 0, (i_50_ >> 12) - 1, (i_51_ >> 12) + 1,
				 i_53_, i_67_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_51_ += i_65_;
		i_50_ += i_63_;
		i_53_ += i_68_;
		i += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i_48_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i, 0, (i_50_ >> 12) - 1, (i_52_ >> 12) + 1,
				 i_53_, i_67_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_52_ += i_64_;
		i_50_ += i_63_;
		i_53_ += i_68_;
		i += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	if (i_48_ <= i_49_) {
	    if (i_48_
		>= ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		return true;
	    if (i_49_
		> ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i_49_
		    = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    if (i > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
		i = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	    i_54_ = (i_54_ << 8) - i_67_ * i_51_ + i_67_;
	    if (i_49_ < i) {
		i_50_ = i_51_ <<= 12;
		if (i_48_ < 0) {
		    i_50_ -= i_63_ * i_48_;
		    i_51_ -= i_64_ * i_48_;
		    i_54_ -= i_68_ * i_48_;
		    i_48_ = 0;
		}
		i_52_ <<= 12;
		if (i_49_ < 0) {
		    i_52_ -= i_65_ * i_49_;
		    i_49_ = 0;
		}
		if (i_48_ != i_49_ && i_63_ < i_64_
		    || i_48_ == i_49_ && i_63_ > i_65_) {
		    i -= i_49_;
		    i_49_ -= i_48_;
		    i_48_ *= (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		    while (--i_49_ >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i_48_, 0, (i_50_ >> 12) - 1,
					 (i_51_ >> 12) + 1, i_54_, i_67_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_50_ += i_63_;
			i_51_ += i_64_;
			i_54_ += i_68_;
			i_48_ += (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118);
		    }
		    while (--i >= 0) {
			if (!method12329((((Class550)
					   ((Class559) this).aClass550_7267)
					  .anIntArray7114),
					 i_48_, 0, (i_50_ >> 12) - 1,
					 (i_52_ >> 12) + 1, i_54_, i_67_,
					 (((Class550)
					   ((Class559) this).aClass550_7267)
					  .anInt7118)))
			    return false;
			i_50_ += i_63_;
			i_52_ += i_65_;
			i_54_ += i_68_;
			i_48_ += (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118);
		    }
		    return true;
		}
		i -= i_49_;
		i_49_ -= i_48_;
		i_48_
		    *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i_49_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_48_, 0, (i_51_ >> 12) - 1,
				     (i_50_ >> 12) + 1, i_54_, i_67_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_50_ += i_63_;
		    i_51_ += i_64_;
		    i_54_ += i_68_;
		    i_48_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		while (--i >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_48_, 0, (i_52_ >> 12) - 1,
				     (i_50_ >> 12) + 1, i_54_, i_67_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_50_ += i_63_;
		    i_52_ += i_65_;
		    i_54_ += i_68_;
		    i_48_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		return true;
	    }
	    i_52_ = i_51_ <<= 12;
	    if (i_48_ < 0) {
		i_52_ -= i_63_ * i_48_;
		i_51_ -= i_64_ * i_48_;
		i_54_ -= i_68_ * i_48_;
		i_48_ = 0;
	    }
	    i_50_ <<= 12;
	    if (i < 0) {
		i_50_ -= i_65_ * i;
		i = 0;
	    }
	    if (i_63_ < i_64_) {
		i_49_ -= i;
		i -= i_48_;
		i_48_
		    *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_48_, 0, (i_52_ >> 12) - 1,
				     (i_51_ >> 12) + 1, i_54_, i_67_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_52_ += i_63_;
		    i_51_ += i_64_;
		    i_54_ += i_68_;
		    i_48_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		while (--i_49_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_48_, 0, (i_50_ >> 12) - 1,
				     (i_51_ >> 12) + 1, i_54_, i_67_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_50_ += i_65_;
		    i_51_ += i_64_;
		    i_54_ += i_68_;
		    i_48_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		return true;
	    }
	    i_49_ -= i;
	    i -= i_48_;
	    i_48_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_48_, 0, (i_51_ >> 12) - 1,
				 (i_52_ >> 12) + 1, i_54_, i_67_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_52_ += i_63_;
		i_51_ += i_64_;
		i_54_ += i_68_;
		i_48_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i_49_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_48_, 0, (i_51_ >> 12) - 1,
				 (i_50_ >> 12) + 1, i_54_, i_67_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_50_ += i_65_;
		i_51_ += i_64_;
		i_54_ += i_68_;
		i_48_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	if (i_49_ >= ((Class550) ((Class559) this).aClass550_7267).anInt7113)
	    return true;
	if (i > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
	    i = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	if (i_48_ > ((Class550) ((Class559) this).aClass550_7267).anInt7113)
	    i_48_ = ((Class550) ((Class559) this).aClass550_7267).anInt7113;
	i_55_ = (i_55_ << 8) - i_67_ * i_52_ + i_67_;
	if (i < i_48_) {
	    i_51_ = i_52_ <<= 12;
	    if (i_49_ < 0) {
		i_51_ -= i_64_ * i_49_;
		i_52_ -= i_65_ * i_49_;
		i_55_ -= i_68_ * i_49_;
		i_49_ = 0;
	    }
	    i_50_ <<= 12;
	    if (i < 0) {
		i_50_ -= i_63_ * i;
		i = 0;
	    }
	    if (i_64_ < i_65_) {
		i_48_ -= i;
		i -= i_49_;
		i_49_
		    *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
		while (--i >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_49_, 0, (i_51_ >> 12) - 1,
				     (i_52_ >> 12) + 1, i_55_, i_67_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_51_ += i_64_;
		    i_52_ += i_65_;
		    i_55_ += i_68_;
		    i_49_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		while (--i_48_ >= 0) {
		    if (!method12329((((Class550)
				       ((Class559) this).aClass550_7267)
				      .anIntArray7114),
				     i_49_, 0, (i_51_ >> 12) - 1,
				     (i_50_ >> 12) + 1, i_55_, i_67_,
				     ((Class550) (((Class559) this)
						  .aClass550_7267)).anInt7118))
			return false;
		    i_51_ += i_64_;
		    i_50_ += i_63_;
		    i_55_ += i_68_;
		    i_49_ += (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118);
		}
		return true;
	    }
	    i_48_ -= i;
	    i -= i_49_;
	    i_49_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_49_, 0, (i_52_ >> 12) - 1,
				 (i_51_ >> 12) + 1, i_55_, i_67_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_51_ += i_64_;
		i_52_ += i_65_;
		i_55_ += i_68_;
		i_49_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i_48_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_49_, 0, (i_50_ >> 12) - 1,
				 (i_51_ >> 12) + 1, i_55_, i_67_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_51_ += i_64_;
		i_50_ += i_63_;
		i_55_ += i_68_;
		i_49_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	i_50_ = i_52_ <<= 12;
	if (i_49_ < 0) {
	    i_50_ -= i_64_ * i_49_;
	    i_52_ -= i_65_ * i_49_;
	    i_55_ -= i_68_ * i_49_;
	    i_49_ = 0;
	}
	i_51_ <<= 12;
	if (i_48_ < 0) {
	    i_51_ -= i_63_ * i_48_;
	    i_48_ = 0;
	}
	if (i_64_ < i_65_) {
	    i -= i_48_;
	    i_48_ -= i_49_;
	    i_49_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    while (--i_48_ >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_49_, 0, (i_50_ >> 12) - 1,
				 (i_52_ >> 12) + 1, i_55_, i_67_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_50_ += i_64_;
		i_52_ += i_65_;
		i_55_ += i_68_;
		i_49_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    while (--i >= 0) {
		if (!method12329((((Class550) ((Class559) this).aClass550_7267)
				  .anIntArray7114),
				 i_49_, 0, (i_51_ >> 12) - 1,
				 (i_52_ >> 12) + 1, i_55_, i_67_,
				 (((Class550) ((Class559) this).aClass550_7267)
				  .anInt7118)))
		    return false;
		i_51_ += i_63_;
		i_52_ += i_65_;
		i_55_ += i_68_;
		i_49_
		    += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	    }
	    return true;
	}
	i -= i_48_;
	i_48_ -= i_49_;
	i_49_ *= ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	while (--i_48_ >= 0) {
	    if (!method12329((((Class550) ((Class559) this).aClass550_7267)
			      .anIntArray7114),
			     i_49_, 0, (i_52_ >> 12) - 1, (i_50_ >> 12) + 1,
			     i_55_, i_67_,
			     (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118)))
		return false;
	    i_50_ += i_64_;
	    i_52_ += i_65_;
	    i_55_ += i_68_;
	    i_49_ += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	}
	while (--i >= 0) {
	    if (!method12329((((Class550) ((Class559) this).aClass550_7267)
			      .anIntArray7114),
			     i_49_, 0, (i_52_ >> 12) - 1, (i_51_ >> 12) + 1,
			     i_55_, i_67_,
			     (((Class550) ((Class559) this).aClass550_7267)
			      .anInt7118)))
		return false;
	    i_51_ += i_63_;
	    i_52_ += i_65_;
	    i_55_ += i_68_;
	    i_49_ += ((Class550) ((Class559) this).aClass550_7267).anInt7118;
	}
	return true;
    }
    
    final boolean method12332(int[] is, int i, int i_69_, int i_70_, int i_71_,
			      int i_72_, int i_73_, int i_74_) {
	if (i_71_ > i_74_)
	    i_71_ = i_74_;
	if (i_70_ < 0)
	    i_70_ = 0;
	if (i_70_ >= i_71_)
	    return true;
	i += i_70_ - 1;
	i_69_ = i_71_ - i_70_ >> 2;
	i_72_ += i_73_ * i_70_;
	if (((Class559) this).anInt7268 == 1) {
	    ((Class559) this).anInt7263 += i_69_;
	    while (--i_69_ >= 0) {
		if (i_72_ < is[++i])
		    is[i] = i_72_;
		i_72_ += i_73_;
		if (i_72_ < is[++i])
		    is[i] = i_72_;
		i_72_ += i_73_;
		if (i_72_ < is[++i])
		    is[i] = i_72_;
		i_72_ += i_73_;
		if (i_72_ < is[++i])
		    is[i] = i_72_;
		i_72_ += i_73_;
	    }
	    i_69_ = i_71_ - i_70_ & 0x3;
	    while (--i_69_ >= 0) {
		if (i_72_ < is[++i])
		    is[i] = i_72_;
		i_72_ += i_73_;
	    }
	} else {
	    i_72_ -= 38912;
	    while (--i_69_ >= 0) {
		if (i_72_ < is[++i])
		    return false;
		i_72_ += i_73_;
		if (i_72_ < is[++i])
		    return false;
		i_72_ += i_73_;
		if (i_72_ < is[++i])
		    return false;
		i_72_ += i_73_;
		if (i_72_ < is[++i])
		    return false;
		i_72_ += i_73_;
	    }
	    i_69_ = i_71_ - i_70_ & 0x3;
	    while (--i_69_ >= 0) {
		if (i_72_ < is[++i])
		    return false;
		i_72_ += i_73_;
	    }
	}
	return true;
    }
}
