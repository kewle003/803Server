/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class184
{
    int anInt2164;
    static final int anInt2165 = 128;
    Class142_Sub4 aClass142_Sub4_2166;
    Class103_Sub1 aClass103_Sub1_2167;
    int anInt2168;
    static final int anInt2169 = 7;
    boolean aBool2170 = true;
    Class159 aClass159_2171;
    int anInt2172 = -1;
    Interface14 anInterface14_2173;
    Class149_Sub1 aClass149_Sub1_2174;
    int anInt2175;
    
    void method3799(Interface14 interface14, int i) {
	if (i != 0) {
	    method3802();
	    ((Class184) this).aClass103_Sub1_2167
		.method15177(((Class184) this).aClass142_Sub4_2166);
	    ((Class184) this).aClass103_Sub1_2167.method15265(interface14, 4,
							      0, i);
	}
    }
    
    Class184(Class103_Sub1 class103_sub1, Class159 class159,
	     Class166_Sub2 class166_sub2, int i, int i_0_, int i_1_, int i_2_,
	     int i_3_) {
	((Class184) this).aClass103_Sub1_2167 = class103_sub1;
	((Class184) this).aClass159_2171 = class159;
	((Class184) this).anInt2168 = i_2_;
	((Class184) this).anInt2164 = i_3_;
	int i_4_ = 1 << i_1_;
	int i_5_ = 0;
	int i_6_ = i << i_1_;
	int i_7_ = i_0_ << i_1_;
	for (int i_8_ = 0; i_8_ < i_4_; i_8_++) {
	    int i_9_
		= (i_7_ + i_8_) * (class166_sub2.anInt2055 * 266270313) + i_6_;
	    for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
		short[] is = (((Class166_Sub2) class166_sub2)
			      .aShortArrayArray9829[i_9_++]);
		if (is != null)
		    i_5_ += is.length;
	    }
	}
	((Class184) this).anInt2175 = i_5_;
	if (i_5_ > 0) {
	    RSByteBuffer class241_sub3 = new RSByteBuffer(i_5_ * 2);
	    if (((Class103_Sub1) ((Class184) this).aClass103_Sub1_2167)
		.aBool9144) {
		for (int i_11_ = 0; i_11_ < i_4_; i_11_++) {
		    int i_12_ = ((i_7_ + i_11_) * (class166_sub2.anInt2055
						   * 266270313)
				 + i_6_);
		    for (int i_13_ = 0; i_13_ < i_4_; i_13_++) {
			short[] is = (((Class166_Sub2) class166_sub2)
				      .aShortArrayArray9829[i_12_++]);
			if (is != null) {
			    for (int i_14_ = 0; i_14_ < is.length; i_14_++)
				class241_sub3.writeShort(is[i_14_] & 0xffff,
							  -484048531);
			}
		    }
		}
	    } else {
		for (int i_15_ = 0; i_15_ < i_4_; i_15_++) {
		    int i_16_ = ((i_7_ + i_15_) * (class166_sub2.anInt2055
						   * 266270313)
				 + i_6_);
		    for (int i_17_ = 0; i_17_ < i_4_; i_17_++) {
			short[] is = (((Class166_Sub2) class166_sub2)
				      .aShortArrayArray9829[i_16_++]);
			if (is != null) {
			    for (int i_18_ = 0; i_18_ < is.length; i_18_++)
				class241_sub3.method14621(is[i_18_] & 0xffff,
							  (byte) -10);
			}
		    }
		}
	    }
	    ((Class184) this).anInterface14_2173
		= (((Class184) this).aClass103_Sub1_2167.method15200
		   (5123, class241_sub3.payload,
		    class241_sub3.pointer * 421967667, false));
	    ((Class184) this).aClass149_Sub1_2174
		= new Class149_Sub1(((Class184) this).aClass103_Sub1_2167,
				    5123, null, 1);
	} else
	    ((Class184) this).aClass142_Sub4_2166 = null;
    }
    
    void method3800(byte[] is, int i) {
	((Class184) this).aClass149_Sub1_2174.method99(5123, is, i * 2);
	method3801(((Class184) this).aClass149_Sub1_2174, i);
    }
    
    void method3801(Interface14 interface14, int i) {
	if (i != 0) {
	    method3802();
	    ((Class184) this).aClass103_Sub1_2167
		.method15177(((Class184) this).aClass142_Sub4_2166);
	    ((Class184) this).aClass103_Sub1_2167.method15265(interface14, 4,
							      0, i);
	}
    }
    
    void method3802() {
	if (((Class184) this).aBool2170) {
	    ((Class184) this).aBool2170 = false;
	    byte[] is
		= ((Class159) ((Class184) this).aClass159_2171).aByteArray1778;
	    byte[] is_19_
		= (((Class103_Sub1) ((Class184) this).aClass103_Sub1_2167)
		   .aByteArray9235);
	    int i = 0;
	    int i_20_
		= ((Class159) ((Class184) this).aClass159_2171).anInt1779;
	    int i_21_ = (((Class184) this).anInt2168
			 + (((Class184) this).anInt2164
			    * (((Class159) ((Class184) this).aClass159_2171)
			       .anInt1779)));
	    for (int i_22_ = -128; i_22_ < 0; i_22_++) {
		i = (i << 8) - i;
		for (int i_23_ = -128; i_23_ < 0; i_23_++) {
		    if (is[i_21_++] != 0)
			i++;
		}
		i_21_ += i_20_ - 128;
	    }
	    if (((Class184) this).aClass142_Sub4_2166 != null
		&& ((Class184) this).anInt2172 == i)
		((Class184) this).aBool2170 = false;
	    else {
		((Class184) this).anInt2172 = i;
		int i_24_ = 0;
		i_21_ = (((Class184) this).anInt2168
			 + ((Class184) this).anInt2164 * i_20_);
		for (int i_25_ = -128; i_25_ < 0; i_25_++) {
		    for (int i_26_ = -128; i_26_ < 0; i_26_++) {
			if (is[i_21_] != 0)
			    is_19_[i_24_++] = (byte) 68;
			else {
			    int i_27_ = 0;
			    if (is[i_21_ - 1] != 0)
				i_27_++;
			    if (is[i_21_ + 1] != 0)
				i_27_++;
			    if (is[i_21_ - i_20_] != 0)
				i_27_++;
			    if (is[i_21_ + i_20_] != 0)
				i_27_++;
			    is_19_[i_24_++] = (byte) (17 * i_27_);
			}
			i_21_++;
		    }
		    i_21_ += (((Class159) ((Class184) this).aClass159_2171)
			      .anInt1779) - 128;
		}
		if (((Class184) this).aClass142_Sub4_2166 == null) {
		    ((Class184) this).aClass142_Sub4_2166
			= new Class142_Sub4((((Class184) this)
					     .aClass103_Sub1_2167),
					    3553, Class175.aClass175_2112,
					    Class102.aClass102_1440, 128, 128,
					    false,
					    (((Class103_Sub1)
					      (((Class184) this)
					       .aClass103_Sub1_2167))
					     .aByteArray9235),
					    Class175.aClass175_2112, false);
		    ((Class184) this).aClass142_Sub4_2166.method16906(false,
								      false);
		    ((Class184) this).aClass142_Sub4_2166.method3168(true);
		} else
		    ((Class184) this).aClass142_Sub4_2166.method16903
			(0, 0, 128, 128,
			 (((Class103_Sub1)
			   ((Class184) this).aClass103_Sub1_2167)
			  .aByteArray9235),
			 Class175.aClass175_2112, 0, 0, false);
	    }
	}
    }
    
    void method3803() {
	method3801(((Class184) this).anInterface14_2173,
		   ((Class184) this).anInt2175);
    }
    
    void method3804() {
	method3801(((Class184) this).anInterface14_2173,
		   ((Class184) this).anInt2175);
    }
    
    void method3805() {
	method3801(((Class184) this).anInterface14_2173,
		   ((Class184) this).anInt2175);
    }
    
    void method3806() {
	method3801(((Class184) this).anInterface14_2173,
		   ((Class184) this).anInt2175);
    }
    
    void method3807(Interface14 interface14, int i) {
	if (i != 0) {
	    method3802();
	    ((Class184) this).aClass103_Sub1_2167
		.method15177(((Class184) this).aClass142_Sub4_2166);
	    ((Class184) this).aClass103_Sub1_2167.method15265(interface14, 4,
							      0, i);
	}
    }
    
    void method3808(byte[] is, int i) {
	((Class184) this).aClass149_Sub1_2174.method99(5123, is, i * 2);
	method3801(((Class184) this).aClass149_Sub1_2174, i);
    }
    
    void method3809(byte[] is, int i) {
	((Class184) this).aClass149_Sub1_2174.method99(5123, is, i * 2);
	method3801(((Class184) this).aClass149_Sub1_2174, i);
    }
    
    void method3810() {
	method3801(((Class184) this).anInterface14_2173,
		   ((Class184) this).anInt2175);
    }
    
    void method3811() {
	if (((Class184) this).aBool2170) {
	    ((Class184) this).aBool2170 = false;
	    byte[] is
		= ((Class159) ((Class184) this).aClass159_2171).aByteArray1778;
	    byte[] is_28_
		= (((Class103_Sub1) ((Class184) this).aClass103_Sub1_2167)
		   .aByteArray9235);
	    int i = 0;
	    int i_29_
		= ((Class159) ((Class184) this).aClass159_2171).anInt1779;
	    int i_30_ = (((Class184) this).anInt2168
			 + (((Class184) this).anInt2164
			    * (((Class159) ((Class184) this).aClass159_2171)
			       .anInt1779)));
	    for (int i_31_ = -128; i_31_ < 0; i_31_++) {
		i = (i << 8) - i;
		for (int i_32_ = -128; i_32_ < 0; i_32_++) {
		    if (is[i_30_++] != 0)
			i++;
		}
		i_30_ += i_29_ - 128;
	    }
	    if (((Class184) this).aClass142_Sub4_2166 != null
		&& ((Class184) this).anInt2172 == i)
		((Class184) this).aBool2170 = false;
	    else {
		((Class184) this).anInt2172 = i;
		int i_33_ = 0;
		i_30_ = (((Class184) this).anInt2168
			 + ((Class184) this).anInt2164 * i_29_);
		for (int i_34_ = -128; i_34_ < 0; i_34_++) {
		    for (int i_35_ = -128; i_35_ < 0; i_35_++) {
			if (is[i_30_] != 0)
			    is_28_[i_33_++] = (byte) 68;
			else {
			    int i_36_ = 0;
			    if (is[i_30_ - 1] != 0)
				i_36_++;
			    if (is[i_30_ + 1] != 0)
				i_36_++;
			    if (is[i_30_ - i_29_] != 0)
				i_36_++;
			    if (is[i_30_ + i_29_] != 0)
				i_36_++;
			    is_28_[i_33_++] = (byte) (17 * i_36_);
			}
			i_30_++;
		    }
		    i_30_ += (((Class159) ((Class184) this).aClass159_2171)
			      .anInt1779) - 128;
		}
		if (((Class184) this).aClass142_Sub4_2166 == null) {
		    ((Class184) this).aClass142_Sub4_2166
			= new Class142_Sub4((((Class184) this)
					     .aClass103_Sub1_2167),
					    3553, Class175.aClass175_2112,
					    Class102.aClass102_1440, 128, 128,
					    false,
					    (((Class103_Sub1)
					      (((Class184) this)
					       .aClass103_Sub1_2167))
					     .aByteArray9235),
					    Class175.aClass175_2112, false);
		    ((Class184) this).aClass142_Sub4_2166.method16906(false,
								      false);
		    ((Class184) this).aClass142_Sub4_2166.method3168(true);
		} else
		    ((Class184) this).aClass142_Sub4_2166.method16903
			(0, 0, 128, 128,
			 (((Class103_Sub1)
			   ((Class184) this).aClass103_Sub1_2167)
			  .aByteArray9235),
			 Class175.aClass175_2112, 0, 0, false);
	    }
	}
    }
    
    void method3812() {
	if (((Class184) this).aBool2170) {
	    ((Class184) this).aBool2170 = false;
	    byte[] is
		= ((Class159) ((Class184) this).aClass159_2171).aByteArray1778;
	    byte[] is_37_
		= (((Class103_Sub1) ((Class184) this).aClass103_Sub1_2167)
		   .aByteArray9235);
	    int i = 0;
	    int i_38_
		= ((Class159) ((Class184) this).aClass159_2171).anInt1779;
	    int i_39_ = (((Class184) this).anInt2168
			 + (((Class184) this).anInt2164
			    * (((Class159) ((Class184) this).aClass159_2171)
			       .anInt1779)));
	    for (int i_40_ = -128; i_40_ < 0; i_40_++) {
		i = (i << 8) - i;
		for (int i_41_ = -128; i_41_ < 0; i_41_++) {
		    if (is[i_39_++] != 0)
			i++;
		}
		i_39_ += i_38_ - 128;
	    }
	    if (((Class184) this).aClass142_Sub4_2166 != null
		&& ((Class184) this).anInt2172 == i)
		((Class184) this).aBool2170 = false;
	    else {
		((Class184) this).anInt2172 = i;
		int i_42_ = 0;
		i_39_ = (((Class184) this).anInt2168
			 + ((Class184) this).anInt2164 * i_38_);
		for (int i_43_ = -128; i_43_ < 0; i_43_++) {
		    for (int i_44_ = -128; i_44_ < 0; i_44_++) {
			if (is[i_39_] != 0)
			    is_37_[i_42_++] = (byte) 68;
			else {
			    int i_45_ = 0;
			    if (is[i_39_ - 1] != 0)
				i_45_++;
			    if (is[i_39_ + 1] != 0)
				i_45_++;
			    if (is[i_39_ - i_38_] != 0)
				i_45_++;
			    if (is[i_39_ + i_38_] != 0)
				i_45_++;
			    is_37_[i_42_++] = (byte) (17 * i_45_);
			}
			i_39_++;
		    }
		    i_39_ += (((Class159) ((Class184) this).aClass159_2171)
			      .anInt1779) - 128;
		}
		if (((Class184) this).aClass142_Sub4_2166 == null) {
		    ((Class184) this).aClass142_Sub4_2166
			= new Class142_Sub4((((Class184) this)
					     .aClass103_Sub1_2167),
					    3553, Class175.aClass175_2112,
					    Class102.aClass102_1440, 128, 128,
					    false,
					    (((Class103_Sub1)
					      (((Class184) this)
					       .aClass103_Sub1_2167))
					     .aByteArray9235),
					    Class175.aClass175_2112, false);
		    ((Class184) this).aClass142_Sub4_2166.method16906(false,
								      false);
		    ((Class184) this).aClass142_Sub4_2166.method3168(true);
		} else
		    ((Class184) this).aClass142_Sub4_2166.method16903
			(0, 0, 128, 128,
			 (((Class103_Sub1)
			   ((Class184) this).aClass103_Sub1_2167)
			  .aByteArray9235),
			 Class175.aClass175_2112, 0, 0, false);
	    }
	}
    }
}
