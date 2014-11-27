/* Class241_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub36 extends Node
{
    int anInt10090;
    int anInt10091;
    Class241_Sub43 aClass241_Sub43_10092;
    Class151 aClass151_10093;
    int anInt10094;
    float[][] aFloatArrayArray10095;
    float[][] aFloatArrayArray10096;
    int anInt10097;
    int anInt10098;
    int anInt10099;
    Interface8 anInterface8_10100;
    Interface14 anInterface14_10101;
    Class151 aClass151_10102;
    Class166_Sub2 aClass166_Sub2_10103;
    Class103_Sub1 aClass103_Sub1_10104;
    float[][] aFloatArrayArray10105;
    RSByteBuffer aClass241_Sub3_10106;
    Class241_Sub3_Sub2 aClass241_Sub3_Sub2_10107;
    HashTable aClass407_10108;
    
    void method16409(int i, int i_0_, int i_1_, boolean[][] bools) {
	if (((Class241_Sub36) this).anInterface14_10101 != null
	    && ((Class241_Sub36) this).anInt10091 <= i + i_1_
	    && ((Class241_Sub36) this).anInt10094 >= i - i_1_
	    && ((Class241_Sub36) this).anInt10090 <= i_0_ + i_1_
	    && ((Class241_Sub36) this).anInt10099 >= i_0_ - i_1_) {
	    for (int i_2_ = ((Class241_Sub36) this).anInt10090;
		 i_2_ <= ((Class241_Sub36) this).anInt10099; i_2_++) {
		for (int i_3_ = ((Class241_Sub36) this).anInt10091;
		     i_3_ <= ((Class241_Sub36) this).anInt10094; i_3_++) {
		    int i_4_ = i_3_ - i;
		    int i_5_ = i_2_ - i_0_;
		    if (i_4_ > -i_1_ && i_4_ < i_1_ && i_5_ > -i_1_
			&& i_5_ < i_1_ && bools[i_4_ + i_1_][i_5_ + i_1_]) {
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15211
			    ((int) (((Class241_Sub36) this)
					.aClass241_Sub43_10092
					.method16458(726421611)
				    * 255.0F) << 24);
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15168
			    (((Class241_Sub36) this).aClass151_10093, null,
			     ((Class241_Sub36) this).aClass151_10102, null);
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15265
			    (((Class241_Sub36) this).anInterface14_10101, 4, 0,
			     ((Class241_Sub36) this).anInt10098);
			return;
		    }
		}
	    }
	}
    }
    
    void method16410(short i) {
	if (((Class103_Sub1) ((Class241_Sub36) this).aClass103_Sub1_10104)
	    .aBool9144)
	    ((Class241_Sub36) this).aClass241_Sub3_10106
		.writeShort(i, -484048531);
	else
	    ((Class241_Sub36) this).aClass241_Sub3_10106
		.method14621(i, (byte) -42);
    }
    
    void method16411(int i, int i_6_, int i_7_, int i_8_, int i_9_,
		     int i_10_) {
	long l = -1L;
	int i_11_
	    = i_9_ + (i_7_ << (((Class241_Sub36) this).aClass166_Sub2_10103
			       .anInt2054) * -122333825);
	int i_12_
	    = i_10_ + (i_8_ << (((Class241_Sub36) this).aClass166_Sub2_10103
				.anInt2054) * -122333825);
	int i_13_ = ((Class241_Sub36) this).aClass166_Sub2_10103
			.method3574(i_11_, i_12_, -1559251339);
	if ((i_9_ & 0x7f) == 0 || (i_10_ & 0x7f) == 0) {
	    l = ((long) i_12_ & 0xffffL) << 16 | (long) i_11_ & 0xffffL;
	    Class241_Sub7 class241_sub7
		= ((Class241_Sub7)
		   ((Class241_Sub36) this).aClass407_10108.get(l));
	    if (class241_sub7 != null) {
		method16410(class241_sub7.aShort8826);
		return;
	    }
	}
	short i_14_ = (short) ((Class241_Sub36) this).anInt10097++;
	if (l != -1L)
	    ((Class241_Sub36) this).aClass407_10108
		.put(new Class241_Sub7(i_14_), l);
	float f;
	float f_15_;
	float f_16_;
	if (i_9_ == 0 && i_10_ == 0) {
	    f = ((Class241_Sub36) this).aFloatArrayArray10095[i][i_6_];
	    f_15_ = ((Class241_Sub36) this).aFloatArrayArray10096[i][i_6_];
	    f_16_ = ((Class241_Sub36) this).aFloatArrayArray10105[i][i_6_];
	} else if (i_9_ == (((Class241_Sub36) this).aClass166_Sub2_10103
			    .anInt2053) * 2039042417
		   && i_10_ == 0) {
	    f = ((Class241_Sub36) this).aFloatArrayArray10095[i + 1][i_6_];
	    f_15_ = ((Class241_Sub36) this).aFloatArrayArray10096[i + 1][i_6_];
	    f_16_ = ((Class241_Sub36) this).aFloatArrayArray10105[i + 1][i_6_];
	} else if (i_9_ == (((Class241_Sub36) this).aClass166_Sub2_10103
			    .anInt2053) * 2039042417
		   && i_10_ == (((Class241_Sub36) this).aClass166_Sub2_10103
				.anInt2053) * 2039042417) {
	    f = ((Class241_Sub36) this).aFloatArrayArray10095[i + 1][i_6_ + 1];
	    f_15_ = (((Class241_Sub36) this).aFloatArrayArray10096[i + 1]
		     [i_6_ + 1]);
	    f_16_ = (((Class241_Sub36) this).aFloatArrayArray10105[i + 1]
		     [i_6_ + 1]);
	} else if (i_9_ == 0
		   && i_10_ == (((Class241_Sub36) this).aClass166_Sub2_10103
				.anInt2053) * 2039042417) {
	    f = ((Class241_Sub36) this).aFloatArrayArray10095[i][i_6_ + 1];
	    f_15_ = ((Class241_Sub36) this).aFloatArrayArray10096[i][i_6_ + 1];
	    f_16_ = ((Class241_Sub36) this).aFloatArrayArray10105[i][i_6_ + 1];
	} else {
	    float f_17_
		= (float) i_9_ / (float) ((((Class241_Sub36) this)
					   .aClass166_Sub2_10103.anInt2053)
					  * 2039042417);
	    float f_18_
		= (float) i_10_ / (float) ((((Class241_Sub36) this)
					    .aClass166_Sub2_10103.anInt2053)
					   * 2039042417);
	    float f_19_
		= ((Class241_Sub36) this).aFloatArrayArray10095[i][i_6_];
	    float f_20_
		= ((Class241_Sub36) this).aFloatArrayArray10096[i][i_6_];
	    float f_21_
		= ((Class241_Sub36) this).aFloatArrayArray10105[i][i_6_];
	    float f_22_
		= ((Class241_Sub36) this).aFloatArrayArray10095[i + 1][i_6_];
	    float f_23_
		= ((Class241_Sub36) this).aFloatArrayArray10096[i + 1][i_6_];
	    float f_24_
		= ((Class241_Sub36) this).aFloatArrayArray10105[i + 1][i_6_];
	    f_19_
		+= (((Class241_Sub36) this).aFloatArrayArray10095[i][i_6_ + 1]
		    - f_19_) * f_17_;
	    f_20_
		+= (((Class241_Sub36) this).aFloatArrayArray10096[i][i_6_ + 1]
		    - f_20_) * f_17_;
	    f_21_
		+= (((Class241_Sub36) this).aFloatArrayArray10105[i][i_6_ + 1]
		    - f_21_) * f_17_;
	    f_22_ += ((((Class241_Sub36) this).aFloatArrayArray10095[i + 1]
		       [i_6_ + 1])
		      - f_22_) * f_17_;
	    f_23_ += ((((Class241_Sub36) this).aFloatArrayArray10096[i + 1]
		       [i_6_ + 1])
		      - f_23_) * f_17_;
	    f_24_ += ((((Class241_Sub36) this).aFloatArrayArray10105[i + 1]
		       [i_6_ + 1])
		      - f_24_) * f_17_;
	    f = f_19_ + (f_22_ - f_19_) * f_18_;
	    f_15_ = f_20_ + (f_23_ - f_20_) * f_18_;
	    f_16_ = f_21_ + (f_24_ - f_21_) * f_18_;
	}
	float f_25_ = (float) (((Class241_Sub36) this)
				   .aClass241_Sub43_10092
				   .method16453((byte) -18)
			       - i_11_);
	float f_26_ = (float) (((Class241_Sub36) this)
				   .aClass241_Sub43_10092
				   .method16454(-1874096036)
			       - i_13_);
	float f_27_ = (float) (((Class241_Sub36) this)
				   .aClass241_Sub43_10092
				   .method16455(626523592)
			       - i_12_);
	float f_28_ = (float) Math.sqrt((double) (f_25_ * f_25_ + f_26_ * f_26_
						  + f_27_ * f_27_));
	float f_29_ = 1.0F / f_28_;
	f_25_ *= f_29_;
	f_26_ *= f_29_;
	f_27_ *= f_29_;
	float f_30_
	    = f_28_ / (float) ((Class241_Sub36) this).aClass241_Sub43_10092
				  .method16468(1143403757);
	float f_31_ = 1.0F - f_30_ * f_30_;
	if (f_31_ < 0.0F)
	    f_31_ = 0.0F;
	float f_32_ = f_25_ * f + f_26_ * f_15_ + f_27_ * f_16_;
	if (f_32_ < 0.0F)
	    f_32_ = 0.0F;
	float f_33_ = f_32_ * f_31_ * 2.0F;
	if (f_33_ > 1.0F)
	    f_33_ = 1.0F;
	int i_34_ = ((Class241_Sub36) this).aClass241_Sub43_10092
			.method16461(240791552);
	int i_35_ = (int) (f_33_ * (float) (i_34_ >> 16 & 0xff));
	if (i_35_ > 255)
	    i_35_ = 255;
	int i_36_ = (int) (f_33_ * (float) (i_34_ >> 8 & 0xff));
	if (i_36_ > 255)
	    i_36_ = 255;
	int i_37_ = (int) (f_33_ * (float) (i_34_ & 0xff));
	if (i_37_ > 255)
	    i_37_ = 255;
	if (((Class103_Sub1) ((Class241_Sub36) this).aClass103_Sub1_10104)
	    .aBool9144) {
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17060((float) i_11_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17060((float) i_13_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17060((float) i_12_);
	} else {
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17064((float) i_11_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17064((float) i_13_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17064((float) i_12_);
	}
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(i_35_, 713858535);
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(i_36_, 1637006989);
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(i_37_, 1210914363);
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(255, -80698172);
	method16410(i_14_);
    }
    
    void method16412(int i, int i_38_, int i_39_, boolean[][] bools) {
	if (((Class241_Sub36) this).anInterface14_10101 != null
	    && ((Class241_Sub36) this).anInt10091 <= i + i_39_
	    && ((Class241_Sub36) this).anInt10094 >= i - i_39_
	    && ((Class241_Sub36) this).anInt10090 <= i_38_ + i_39_
	    && ((Class241_Sub36) this).anInt10099 >= i_38_ - i_39_) {
	    for (int i_40_ = ((Class241_Sub36) this).anInt10090;
		 i_40_ <= ((Class241_Sub36) this).anInt10099; i_40_++) {
		for (int i_41_ = ((Class241_Sub36) this).anInt10091;
		     i_41_ <= ((Class241_Sub36) this).anInt10094; i_41_++) {
		    int i_42_ = i_41_ - i;
		    int i_43_ = i_40_ - i_38_;
		    if (i_42_ > -i_39_ && i_42_ < i_39_ && i_43_ > -i_39_
			&& i_43_ < i_39_
			&& bools[i_42_ + i_39_][i_43_ + i_39_]) {
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15211
			    ((int) (((Class241_Sub36) this)
					.aClass241_Sub43_10092
					.method16458(1783723941)
				    * 255.0F) << 24);
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15168
			    (((Class241_Sub36) this).aClass151_10093, null,
			     ((Class241_Sub36) this).aClass151_10102, null);
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15265
			    (((Class241_Sub36) this).anInterface14_10101, 4, 0,
			     ((Class241_Sub36) this).anInt10098);
			return;
		    }
		}
	    }
	}
    }
    
    void method16413(short i) {
	if (((Class103_Sub1) ((Class241_Sub36) this).aClass103_Sub1_10104)
	    .aBool9144)
	    ((Class241_Sub36) this).aClass241_Sub3_10106
		.writeShort(i, -484048531);
	else
	    ((Class241_Sub36) this).aClass241_Sub3_10106
		.method14621(i, (byte) 101);
    }
    
    void method16414(int i, int i_44_, int i_45_, boolean[][] bools) {
	if (((Class241_Sub36) this).anInterface14_10101 != null
	    && ((Class241_Sub36) this).anInt10091 <= i + i_45_
	    && ((Class241_Sub36) this).anInt10094 >= i - i_45_
	    && ((Class241_Sub36) this).anInt10090 <= i_44_ + i_45_
	    && ((Class241_Sub36) this).anInt10099 >= i_44_ - i_45_) {
	    for (int i_46_ = ((Class241_Sub36) this).anInt10090;
		 i_46_ <= ((Class241_Sub36) this).anInt10099; i_46_++) {
		for (int i_47_ = ((Class241_Sub36) this).anInt10091;
		     i_47_ <= ((Class241_Sub36) this).anInt10094; i_47_++) {
		    int i_48_ = i_47_ - i;
		    int i_49_ = i_46_ - i_44_;
		    if (i_48_ > -i_45_ && i_48_ < i_45_ && i_49_ > -i_45_
			&& i_49_ < i_45_
			&& bools[i_48_ + i_45_][i_49_ + i_45_]) {
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15211
			    ((int) (((Class241_Sub36) this)
					.aClass241_Sub43_10092
					.method16458(192124744)
				    * 255.0F) << 24);
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15168
			    (((Class241_Sub36) this).aClass151_10093, null,
			     ((Class241_Sub36) this).aClass151_10102, null);
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15265
			    (((Class241_Sub36) this).anInterface14_10101, 4, 0,
			     ((Class241_Sub36) this).anInt10098);
			return;
		    }
		}
	    }
	}
    }
    
    void method16415(int i, int i_50_, int i_51_, int i_52_, int i_53_,
		     int i_54_) {
	long l = -1L;
	int i_55_
	    = i_53_ + (i_51_ << (((Class241_Sub36) this).aClass166_Sub2_10103
				 .anInt2054) * -122333825);
	int i_56_
	    = i_54_ + (i_52_ << (((Class241_Sub36) this).aClass166_Sub2_10103
				 .anInt2054) * -122333825);
	int i_57_ = ((Class241_Sub36) this).aClass166_Sub2_10103
			.method3574(i_55_, i_56_, 288494901);
	if ((i_53_ & 0x7f) == 0 || (i_54_ & 0x7f) == 0) {
	    l = ((long) i_56_ & 0xffffL) << 16 | (long) i_55_ & 0xffffL;
	    Class241_Sub7 class241_sub7
		= ((Class241_Sub7)
		   ((Class241_Sub36) this).aClass407_10108.get(l));
	    if (class241_sub7 != null) {
		method16410(class241_sub7.aShort8826);
		return;
	    }
	}
	short i_58_ = (short) ((Class241_Sub36) this).anInt10097++;
	if (l != -1L)
	    ((Class241_Sub36) this).aClass407_10108
		.put(new Class241_Sub7(i_58_), l);
	float f;
	float f_59_;
	float f_60_;
	if (i_53_ == 0 && i_54_ == 0) {
	    f = ((Class241_Sub36) this).aFloatArrayArray10095[i][i_50_];
	    f_59_ = ((Class241_Sub36) this).aFloatArrayArray10096[i][i_50_];
	    f_60_ = ((Class241_Sub36) this).aFloatArrayArray10105[i][i_50_];
	} else if (i_53_ == (((Class241_Sub36) this).aClass166_Sub2_10103
			     .anInt2053) * 2039042417
		   && i_54_ == 0) {
	    f = ((Class241_Sub36) this).aFloatArrayArray10095[i + 1][i_50_];
	    f_59_
		= ((Class241_Sub36) this).aFloatArrayArray10096[i + 1][i_50_];
	    f_60_
		= ((Class241_Sub36) this).aFloatArrayArray10105[i + 1][i_50_];
	} else if (i_53_ == (((Class241_Sub36) this).aClass166_Sub2_10103
			     .anInt2053) * 2039042417
		   && i_54_ == (((Class241_Sub36) this).aClass166_Sub2_10103
				.anInt2053) * 2039042417) {
	    f = (((Class241_Sub36) this).aFloatArrayArray10095[i + 1]
		 [i_50_ + 1]);
	    f_59_ = (((Class241_Sub36) this).aFloatArrayArray10096[i + 1]
		     [i_50_ + 1]);
	    f_60_ = (((Class241_Sub36) this).aFloatArrayArray10105[i + 1]
		     [i_50_ + 1]);
	} else if (i_53_ == 0
		   && i_54_ == (((Class241_Sub36) this).aClass166_Sub2_10103
				.anInt2053) * 2039042417) {
	    f = ((Class241_Sub36) this).aFloatArrayArray10095[i][i_50_ + 1];
	    f_59_
		= ((Class241_Sub36) this).aFloatArrayArray10096[i][i_50_ + 1];
	    f_60_
		= ((Class241_Sub36) this).aFloatArrayArray10105[i][i_50_ + 1];
	} else {
	    float f_61_
		= (float) i_53_ / (float) ((((Class241_Sub36) this)
					    .aClass166_Sub2_10103.anInt2053)
					   * 2039042417);
	    float f_62_
		= (float) i_54_ / (float) ((((Class241_Sub36) this)
					    .aClass166_Sub2_10103.anInt2053)
					   * 2039042417);
	    float f_63_
		= ((Class241_Sub36) this).aFloatArrayArray10095[i][i_50_];
	    float f_64_
		= ((Class241_Sub36) this).aFloatArrayArray10096[i][i_50_];
	    float f_65_
		= ((Class241_Sub36) this).aFloatArrayArray10105[i][i_50_];
	    float f_66_
		= ((Class241_Sub36) this).aFloatArrayArray10095[i + 1][i_50_];
	    float f_67_
		= ((Class241_Sub36) this).aFloatArrayArray10096[i + 1][i_50_];
	    float f_68_
		= ((Class241_Sub36) this).aFloatArrayArray10105[i + 1][i_50_];
	    f_63_
		+= (((Class241_Sub36) this).aFloatArrayArray10095[i][i_50_ + 1]
		    - f_63_) * f_61_;
	    f_64_
		+= (((Class241_Sub36) this).aFloatArrayArray10096[i][i_50_ + 1]
		    - f_64_) * f_61_;
	    f_65_
		+= (((Class241_Sub36) this).aFloatArrayArray10105[i][i_50_ + 1]
		    - f_65_) * f_61_;
	    f_66_ += ((((Class241_Sub36) this).aFloatArrayArray10095[i + 1]
		       [i_50_ + 1])
		      - f_66_) * f_61_;
	    f_67_ += ((((Class241_Sub36) this).aFloatArrayArray10096[i + 1]
		       [i_50_ + 1])
		      - f_67_) * f_61_;
	    f_68_ += ((((Class241_Sub36) this).aFloatArrayArray10105[i + 1]
		       [i_50_ + 1])
		      - f_68_) * f_61_;
	    f = f_63_ + (f_66_ - f_63_) * f_62_;
	    f_59_ = f_64_ + (f_67_ - f_64_) * f_62_;
	    f_60_ = f_65_ + (f_68_ - f_65_) * f_62_;
	}
	float f_69_ = (float) (((Class241_Sub36) this)
				   .aClass241_Sub43_10092
				   .method16453((byte) -40)
			       - i_55_);
	float f_70_ = (float) (((Class241_Sub36) this)
				   .aClass241_Sub43_10092
				   .method16454(-1874096036)
			       - i_57_);
	float f_71_ = (float) (((Class241_Sub36) this)
				   .aClass241_Sub43_10092
				   .method16455(626523592)
			       - i_56_);
	float f_72_ = (float) Math.sqrt((double) (f_69_ * f_69_ + f_70_ * f_70_
						  + f_71_ * f_71_));
	float f_73_ = 1.0F / f_72_;
	f_69_ *= f_73_;
	f_70_ *= f_73_;
	f_71_ *= f_73_;
	float f_74_
	    = f_72_ / (float) ((Class241_Sub36) this).aClass241_Sub43_10092
				  .method16468(1143403757);
	float f_75_ = 1.0F - f_74_ * f_74_;
	if (f_75_ < 0.0F)
	    f_75_ = 0.0F;
	float f_76_ = f_69_ * f + f_70_ * f_59_ + f_71_ * f_60_;
	if (f_76_ < 0.0F)
	    f_76_ = 0.0F;
	float f_77_ = f_76_ * f_75_ * 2.0F;
	if (f_77_ > 1.0F)
	    f_77_ = 1.0F;
	int i_78_ = ((Class241_Sub36) this).aClass241_Sub43_10092
			.method16461(505203338);
	int i_79_ = (int) (f_77_ * (float) (i_78_ >> 16 & 0xff));
	if (i_79_ > 255)
	    i_79_ = 255;
	int i_80_ = (int) (f_77_ * (float) (i_78_ >> 8 & 0xff));
	if (i_80_ > 255)
	    i_80_ = 255;
	int i_81_ = (int) (f_77_ * (float) (i_78_ & 0xff));
	if (i_81_ > 255)
	    i_81_ = 255;
	if (((Class103_Sub1) ((Class241_Sub36) this).aClass103_Sub1_10104)
	    .aBool9144) {
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17060((float) i_55_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17060((float) i_57_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17060((float) i_56_);
	} else {
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17064((float) i_55_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17064((float) i_57_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17064((float) i_56_);
	}
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(i_79_, -1366930029);
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(i_80_, -1639658834);
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(i_81_, 486875610);
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(255, 27108131);
	method16410(i_58_);
    }
    
    void method16416(int i, int i_82_, int i_83_, int i_84_, int i_85_,
		     int i_86_) {
	long l = -1L;
	int i_87_
	    = i_85_ + (i_83_ << (((Class241_Sub36) this).aClass166_Sub2_10103
				 .anInt2054) * -122333825);
	int i_88_
	    = i_86_ + (i_84_ << (((Class241_Sub36) this).aClass166_Sub2_10103
				 .anInt2054) * -122333825);
	int i_89_ = ((Class241_Sub36) this).aClass166_Sub2_10103
			.method3574(i_87_, i_88_, 641372349);
	if ((i_85_ & 0x7f) == 0 || (i_86_ & 0x7f) == 0) {
	    l = ((long) i_88_ & 0xffffL) << 16 | (long) i_87_ & 0xffffL;
	    Class241_Sub7 class241_sub7
		= ((Class241_Sub7)
		   ((Class241_Sub36) this).aClass407_10108.get(l));
	    if (class241_sub7 != null) {
		method16410(class241_sub7.aShort8826);
		return;
	    }
	}
	short i_90_ = (short) ((Class241_Sub36) this).anInt10097++;
	if (l != -1L)
	    ((Class241_Sub36) this).aClass407_10108
		.put(new Class241_Sub7(i_90_), l);
	float f;
	float f_91_;
	float f_92_;
	if (i_85_ == 0 && i_86_ == 0) {
	    f = ((Class241_Sub36) this).aFloatArrayArray10095[i][i_82_];
	    f_91_ = ((Class241_Sub36) this).aFloatArrayArray10096[i][i_82_];
	    f_92_ = ((Class241_Sub36) this).aFloatArrayArray10105[i][i_82_];
	} else if (i_85_ == (((Class241_Sub36) this).aClass166_Sub2_10103
			     .anInt2053) * 2039042417
		   && i_86_ == 0) {
	    f = ((Class241_Sub36) this).aFloatArrayArray10095[i + 1][i_82_];
	    f_91_
		= ((Class241_Sub36) this).aFloatArrayArray10096[i + 1][i_82_];
	    f_92_
		= ((Class241_Sub36) this).aFloatArrayArray10105[i + 1][i_82_];
	} else if (i_85_ == (((Class241_Sub36) this).aClass166_Sub2_10103
			     .anInt2053) * 2039042417
		   && i_86_ == (((Class241_Sub36) this).aClass166_Sub2_10103
				.anInt2053) * 2039042417) {
	    f = (((Class241_Sub36) this).aFloatArrayArray10095[i + 1]
		 [i_82_ + 1]);
	    f_91_ = (((Class241_Sub36) this).aFloatArrayArray10096[i + 1]
		     [i_82_ + 1]);
	    f_92_ = (((Class241_Sub36) this).aFloatArrayArray10105[i + 1]
		     [i_82_ + 1]);
	} else if (i_85_ == 0
		   && i_86_ == (((Class241_Sub36) this).aClass166_Sub2_10103
				.anInt2053) * 2039042417) {
	    f = ((Class241_Sub36) this).aFloatArrayArray10095[i][i_82_ + 1];
	    f_91_
		= ((Class241_Sub36) this).aFloatArrayArray10096[i][i_82_ + 1];
	    f_92_
		= ((Class241_Sub36) this).aFloatArrayArray10105[i][i_82_ + 1];
	} else {
	    float f_93_
		= (float) i_85_ / (float) ((((Class241_Sub36) this)
					    .aClass166_Sub2_10103.anInt2053)
					   * 2039042417);
	    float f_94_
		= (float) i_86_ / (float) ((((Class241_Sub36) this)
					    .aClass166_Sub2_10103.anInt2053)
					   * 2039042417);
	    float f_95_
		= ((Class241_Sub36) this).aFloatArrayArray10095[i][i_82_];
	    float f_96_
		= ((Class241_Sub36) this).aFloatArrayArray10096[i][i_82_];
	    float f_97_
		= ((Class241_Sub36) this).aFloatArrayArray10105[i][i_82_];
	    float f_98_
		= ((Class241_Sub36) this).aFloatArrayArray10095[i + 1][i_82_];
	    float f_99_
		= ((Class241_Sub36) this).aFloatArrayArray10096[i + 1][i_82_];
	    float f_100_
		= ((Class241_Sub36) this).aFloatArrayArray10105[i + 1][i_82_];
	    f_95_
		+= (((Class241_Sub36) this).aFloatArrayArray10095[i][i_82_ + 1]
		    - f_95_) * f_93_;
	    f_96_
		+= (((Class241_Sub36) this).aFloatArrayArray10096[i][i_82_ + 1]
		    - f_96_) * f_93_;
	    f_97_
		+= (((Class241_Sub36) this).aFloatArrayArray10105[i][i_82_ + 1]
		    - f_97_) * f_93_;
	    f_98_ += ((((Class241_Sub36) this).aFloatArrayArray10095[i + 1]
		       [i_82_ + 1])
		      - f_98_) * f_93_;
	    f_99_ += ((((Class241_Sub36) this).aFloatArrayArray10096[i + 1]
		       [i_82_ + 1])
		      - f_99_) * f_93_;
	    f_100_ += ((((Class241_Sub36) this).aFloatArrayArray10105[i + 1]
			[i_82_ + 1])
		       - f_100_) * f_93_;
	    f = f_95_ + (f_98_ - f_95_) * f_94_;
	    f_91_ = f_96_ + (f_99_ - f_96_) * f_94_;
	    f_92_ = f_97_ + (f_100_ - f_97_) * f_94_;
	}
	float f_101_ = (float) (((Class241_Sub36) this)
				    .aClass241_Sub43_10092
				    .method16453((byte) -18)
				- i_87_);
	float f_102_ = (float) (((Class241_Sub36) this)
				    .aClass241_Sub43_10092
				    .method16454(-1874096036)
				- i_89_);
	float f_103_ = (float) (((Class241_Sub36) this)
				    .aClass241_Sub43_10092
				    .method16455(626523592)
				- i_88_);
	float f_104_
	    = (float) Math.sqrt((double) (f_101_ * f_101_ + f_102_ * f_102_
					  + f_103_ * f_103_));
	float f_105_ = 1.0F / f_104_;
	f_101_ *= f_105_;
	f_102_ *= f_105_;
	f_103_ *= f_105_;
	float f_106_
	    = f_104_ / (float) ((Class241_Sub36) this)
				   .aClass241_Sub43_10092
				   .method16468(1143403757);
	float f_107_ = 1.0F - f_106_ * f_106_;
	if (f_107_ < 0.0F)
	    f_107_ = 0.0F;
	float f_108_ = f_101_ * f + f_102_ * f_91_ + f_103_ * f_92_;
	if (f_108_ < 0.0F)
	    f_108_ = 0.0F;
	float f_109_ = f_108_ * f_107_ * 2.0F;
	if (f_109_ > 1.0F)
	    f_109_ = 1.0F;
	int i_110_ = ((Class241_Sub36) this).aClass241_Sub43_10092
			 .method16461(-1426358386);
	int i_111_ = (int) (f_109_ * (float) (i_110_ >> 16 & 0xff));
	if (i_111_ > 255)
	    i_111_ = 255;
	int i_112_ = (int) (f_109_ * (float) (i_110_ >> 8 & 0xff));
	if (i_112_ > 255)
	    i_112_ = 255;
	int i_113_ = (int) (f_109_ * (float) (i_110_ & 0xff));
	if (i_113_ > 255)
	    i_113_ = 255;
	if (((Class103_Sub1) ((Class241_Sub36) this).aClass103_Sub1_10104)
	    .aBool9144) {
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17060((float) i_87_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17060((float) i_89_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17060((float) i_88_);
	} else {
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17064((float) i_87_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17064((float) i_89_);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		.method17064((float) i_88_);
	}
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(i_111_, -2076073100);
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(i_112_, -1900083909);
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(i_113_, -373627856);
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
	    .writeByte(255, 118608758);
	method16410(i_90_);
    }
    
    void method16417(int i, int i_114_, int i_115_, boolean[][] bools) {
	if (((Class241_Sub36) this).anInterface14_10101 != null
	    && ((Class241_Sub36) this).anInt10091 <= i + i_115_
	    && ((Class241_Sub36) this).anInt10094 >= i - i_115_
	    && ((Class241_Sub36) this).anInt10090 <= i_114_ + i_115_
	    && ((Class241_Sub36) this).anInt10099 >= i_114_ - i_115_) {
	    for (int i_116_ = ((Class241_Sub36) this).anInt10090;
		 i_116_ <= ((Class241_Sub36) this).anInt10099; i_116_++) {
		for (int i_117_ = ((Class241_Sub36) this).anInt10091;
		     i_117_ <= ((Class241_Sub36) this).anInt10094; i_117_++) {
		    int i_118_ = i_117_ - i;
		    int i_119_ = i_116_ - i_114_;
		    if (i_118_ > -i_115_ && i_118_ < i_115_ && i_119_ > -i_115_
			&& i_119_ < i_115_
			&& bools[i_118_ + i_115_][i_119_ + i_115_]) {
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15211
			    ((int) (((Class241_Sub36) this)
					.aClass241_Sub43_10092
					.method16458(1026887963)
				    * 255.0F) << 24);
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15168
			    (((Class241_Sub36) this).aClass151_10093, null,
			     ((Class241_Sub36) this).aClass151_10102, null);
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15265
			    (((Class241_Sub36) this).anInterface14_10101, 4, 0,
			     ((Class241_Sub36) this).anInt10098);
			return;
		    }
		}
	    }
	}
    }
    
    void method16418(int i, int i_120_, int i_121_, boolean[][] bools) {
	if (((Class241_Sub36) this).anInterface14_10101 != null
	    && ((Class241_Sub36) this).anInt10091 <= i + i_121_
	    && ((Class241_Sub36) this).anInt10094 >= i - i_121_
	    && ((Class241_Sub36) this).anInt10090 <= i_120_ + i_121_
	    && ((Class241_Sub36) this).anInt10099 >= i_120_ - i_121_) {
	    for (int i_122_ = ((Class241_Sub36) this).anInt10090;
		 i_122_ <= ((Class241_Sub36) this).anInt10099; i_122_++) {
		for (int i_123_ = ((Class241_Sub36) this).anInt10091;
		     i_123_ <= ((Class241_Sub36) this).anInt10094; i_123_++) {
		    int i_124_ = i_123_ - i;
		    int i_125_ = i_122_ - i_120_;
		    if (i_124_ > -i_121_ && i_124_ < i_121_ && i_125_ > -i_121_
			&& i_125_ < i_121_
			&& bools[i_124_ + i_121_][i_125_ + i_121_]) {
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15211
			    ((int) (((Class241_Sub36) this)
					.aClass241_Sub43_10092
					.method16458(117447779)
				    * 255.0F) << 24);
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15168
			    (((Class241_Sub36) this).aClass151_10093, null,
			     ((Class241_Sub36) this).aClass151_10102, null);
			((Class241_Sub36) this).aClass103_Sub1_10104
			    .method15265
			    (((Class241_Sub36) this).anInterface14_10101, 4, 0,
			     ((Class241_Sub36) this).anInt10098);
			return;
		    }
		}
	    }
	}
    }
    
    void method16419(short i) {
	if (((Class103_Sub1) ((Class241_Sub36) this).aClass103_Sub1_10104)
	    .aBool9144)
	    ((Class241_Sub36) this).aClass241_Sub3_10106
		.writeShort(i, -484048531);
	else
	    ((Class241_Sub36) this).aClass241_Sub3_10106
		.method14621(i, (byte) -112);
    }
    
    Class241_Sub36(Class103_Sub1 class103_sub1, Class166_Sub2 class166_sub2,
		   Class241_Sub43 class241_sub43, int[] is) {
	((Class241_Sub36) this).aClass103_Sub1_10104 = class103_sub1;
	((Class241_Sub36) this).aClass241_Sub43_10092 = class241_sub43;
	((Class241_Sub36) this).aClass166_Sub2_10103 = class166_sub2;
	int i = (((Class241_Sub36) this).aClass241_Sub43_10092
		     .method16468(1143403757)
		 - (class166_sub2.anInt2053 * 2039042417 >> 1));
	((Class241_Sub36) this).anInt10091
	    = (((Class241_Sub36) this).aClass241_Sub43_10092
		   .method16453((byte) -60) - i
	       >> class166_sub2.anInt2054 * -122333825);
	((Class241_Sub36) this).anInt10094
	    = (((Class241_Sub36) this).aClass241_Sub43_10092
		   .method16453((byte) -21) + i
	       >> class166_sub2.anInt2054 * -122333825);
	((Class241_Sub36) this).anInt10090
	    = (((Class241_Sub36) this).aClass241_Sub43_10092
		   .method16455(626523592) - i
	       >> class166_sub2.anInt2054 * -122333825);
	((Class241_Sub36) this).anInt10099
	    = (((Class241_Sub36) this).aClass241_Sub43_10092
		   .method16455(626523592) + i
	       >> class166_sub2.anInt2054 * -122333825);
	int i_126_ = (((Class241_Sub36) this).anInt10094
		      - ((Class241_Sub36) this).anInt10091 + 1);
	int i_127_ = (((Class241_Sub36) this).anInt10099
		      - ((Class241_Sub36) this).anInt10090 + 1);
	((Class241_Sub36) this).aFloatArrayArray10095
	    = new float[i_126_ + 1][i_127_ + 1];
	((Class241_Sub36) this).aFloatArrayArray10096
	    = new float[i_126_ + 1][i_127_ + 1];
	((Class241_Sub36) this).aFloatArrayArray10105
	    = new float[i_126_ + 1][i_127_ + 1];
	for (int i_128_ = 0; i_128_ <= i_127_; i_128_++) {
	    int i_129_ = i_128_ + ((Class241_Sub36) this).anInt10090;
	    if (i_129_ > 0
		&& i_129_ < (((Class241_Sub36) this).aClass166_Sub2_10103
			     .anInt2052) * -14610189 - 1) {
		for (int i_130_ = 0; i_130_ <= i_126_; i_130_++) {
		    int i_131_ = i_130_ + ((Class241_Sub36) this).anInt10091;
		    if (i_131_ > 0 && i_131_ < (((Class241_Sub36) this)
						.aClass166_Sub2_10103
						.anInt2055) * 266270313 - 1) {
			int i_132_
			    = (class166_sub2.method3551(i_131_ + 1, i_129_,
							-300663129)
			       - class166_sub2.method3551(i_131_ - 1, i_129_,
							  155070306));
			int i_133_
			    = (class166_sub2.method3551(i_131_, i_129_ + 1,
							-1154380540)
			       - class166_sub2.method3551(i_131_, i_129_ - 1,
							  -1665861092));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_132_ * i_132_
							     + 65536
							     + (i_133_
								* i_133_))));
			((Class241_Sub36) this).aFloatArrayArray10095
			    [i_130_][i_128_]
			    = (float) i_132_ * f;
			((Class241_Sub36) this).aFloatArrayArray10096
			    [i_130_][i_128_]
			    = -256.0F * f;
			((Class241_Sub36) this).aFloatArrayArray10105
			    [i_130_][i_128_]
			    = (float) i_133_ * f;
		    }
		}
	    }
	}
	int i_134_ = 0;
	for (int i_135_ = ((Class241_Sub36) this).anInt10090;
	     i_135_ <= ((Class241_Sub36) this).anInt10099; i_135_++) {
	    if (i_135_ >= 0 && i_135_ < class166_sub2.anInt2052 * -14610189) {
		for (int i_136_ = ((Class241_Sub36) this).anInt10091;
		     i_136_ <= ((Class241_Sub36) this).anInt10094; i_136_++) {
		    if (i_136_ >= 0
			&& i_136_ < class166_sub2.anInt2055 * 266270313) {
			int i_137_ = is[i_134_];
			int[] is_138_
			    = (((Class166_Sub2) class166_sub2)
			       .anIntArrayArrayArray9815[i_136_][i_135_]);
			if (is_138_ != null && i_137_ != 0) {
			    if (i_137_ == 1) {
				for (int i_139_ = 0; i_139_ < is_138_.length;
				     i_139_ += 3) {
				    if (is_138_[i_139_] != -1
					&& is_138_[i_139_ + 1] != -1
					&& is_138_[i_139_ + 2] != -1)
					((Class241_Sub36) this).anInt10098
					    += 3;
				}
			    } else
				((Class241_Sub36) this).anInt10098 += 3;
			}
		    }
		    i_134_++;
		}
	    } else
		i_134_ += (((Class241_Sub36) this).anInt10094
			   - ((Class241_Sub36) this).anInt10091);
	}
	if (((Class241_Sub36) this).anInt10098 > 0) {
	    ((Class241_Sub36) this).aClass241_Sub3_10106
		= new RSByteBuffer(((Class241_Sub36) this).anInt10098 * 2);
	    ((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		= new Class241_Sub3_Sub2(((Class241_Sub36) this).anInt10098
					 * 16);
	    ((Class241_Sub36) this).aClass407_10108
		= new HashTable(Class480.method11001((((Class241_Sub36) this)
						     .anInt10098),
						    (byte) 56));
	    int i_140_ = 0;
	    i_134_ = 0;
	    for (int i_141_ = ((Class241_Sub36) this).anInt10090;
		 i_141_ <= ((Class241_Sub36) this).anInt10099; i_141_++) {
		if (i_141_ >= 0
		    && i_141_ < class166_sub2.anInt2052 * -14610189) {
		    int i_142_ = 0;
		    for (int i_143_ = ((Class241_Sub36) this).anInt10091;
			 i_143_ <= ((Class241_Sub36) this).anInt10094;
			 i_143_++) {
			if (i_143_ >= 0
			    && i_143_ < class166_sub2.anInt2055 * 266270313) {
			    int i_144_ = is[i_134_];
			    int[] is_145_
				= (((Class166_Sub2) class166_sub2)
				   .anIntArrayArrayArray9815[i_143_][i_141_]);
			    if (is_145_ != null && i_144_ != 0) {
				if (i_144_ == 1) {
				    int[] is_146_
					= (((Class166_Sub2) class166_sub2)
					   .anIntArrayArrayArray9816[i_143_]
					   [i_141_]);
				    int[] is_147_
					= (((Class166_Sub2) class166_sub2)
					   .anIntArrayArrayArray9818[i_143_]
					   [i_141_]);
				    int i_148_ = 0;
				    while (i_148_ < is_145_.length) {
					if (is_145_[i_148_] != -1
					    && is_145_[i_148_ + 1] != -1
					    && is_145_[i_148_ + 2] != -1) {
					    method16411(i_142_, i_140_, i_143_,
							i_141_,
							is_146_[i_148_],
							is_147_[i_148_]);
					    i_148_++;
					    method16411(i_142_, i_140_, i_143_,
							i_141_,
							is_146_[i_148_],
							is_147_[i_148_]);
					    i_148_++;
					    method16411(i_142_, i_140_, i_143_,
							i_141_,
							is_146_[i_148_],
							is_147_[i_148_]);
					    i_148_++;
					} else
					    i_148_ += 3;
				    }
				} else if (i_144_ == 3) {
				    method16411(i_142_, i_140_, i_143_, i_141_,
						0, 0);
				    method16411(i_142_, i_140_, i_143_, i_141_,
						(class166_sub2.anInt2053
						 * 2039042417),
						0);
				    method16411(i_142_, i_140_, i_143_, i_141_,
						0,
						(class166_sub2.anInt2053
						 * 2039042417));
				} else if (i_144_ == 2) {
				    method16411(i_142_, i_140_, i_143_, i_141_,
						(class166_sub2.anInt2053
						 * 2039042417),
						0);
				    method16411(i_142_, i_140_, i_143_, i_141_,
						(class166_sub2.anInt2053
						 * 2039042417),
						(class166_sub2.anInt2053
						 * 2039042417));
				    method16411(i_142_, i_140_, i_143_, i_141_,
						0, 0);
				} else if (i_144_ == 5) {
				    method16411(i_142_, i_140_, i_143_, i_141_,
						(class166_sub2.anInt2053
						 * 2039042417),
						(class166_sub2.anInt2053
						 * 2039042417));
				    method16411(i_142_, i_140_, i_143_, i_141_,
						0,
						(class166_sub2.anInt2053
						 * 2039042417));
				    method16411(i_142_, i_140_, i_143_, i_141_,
						(class166_sub2.anInt2053
						 * 2039042417),
						0);
				} else if (i_144_ == 4) {
				    method16411(i_142_, i_140_, i_143_, i_141_,
						0,
						(class166_sub2.anInt2053
						 * 2039042417));
				    method16411(i_142_, i_140_, i_143_, i_141_,
						0, 0);
				    method16411(i_142_, i_140_, i_143_, i_141_,
						(class166_sub2.anInt2053
						 * 2039042417),
						(class166_sub2.anInt2053
						 * 2039042417));
				}
			    }
			}
			i_134_++;
			i_142_++;
		    }
		} else
		    i_134_ += (((Class241_Sub36) this).anInt10094
			       - ((Class241_Sub36) this).anInt10091);
		i_140_++;
	    }
	    ((Class241_Sub36) this).anInterface14_10101
		= (((Class241_Sub36) this).aClass103_Sub1_10104.method15200
		   (5123,
		    (((Class241_Sub36) this).aClass241_Sub3_10106
		     .payload),
		    (((Class241_Sub36) this).aClass241_Sub3_10106.pointer
		     * 421967667),
		    false));
	    ((Class241_Sub36) this).anInterface8_10100
		= (((Class241_Sub36) this).aClass103_Sub1_10104.method15165
		   (16,
		    (((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		     .payload),
		    (((Class241_Sub36) this).aClass241_Sub3_Sub2_10107
		     .pointer) * 421967667,
		    false));
	    ((Class241_Sub36) this).aClass151_10093
		= new Class151(((Class241_Sub36) this).anInterface8_10100,
			       5126, 3, 0);
	    ((Class241_Sub36) this).aClass151_10102
		= new Class151(((Class241_Sub36) this).anInterface8_10100,
			       5121, 4, 12);
	} else {
	    ((Class241_Sub36) this).anInterface14_10101 = null;
	    ((Class241_Sub36) this).anInterface8_10100 = null;
	    ((Class241_Sub36) this).aClass151_10093 = null;
	    ((Class241_Sub36) this).aClass151_10102 = null;
	}
	((Class241_Sub36) this).aClass241_Sub3_Sub2_10107 = null;
	((Class241_Sub36) this).aClass241_Sub3_10106 = null;
	((Class241_Sub36) this).aClass407_10108 = null;
	((Class241_Sub36) this).aFloatArrayArray10105 = null;
	((Class241_Sub36) this).aFloatArrayArray10096 = null;
	((Class241_Sub36) this).aFloatArrayArray10095 = null;
    }
}
