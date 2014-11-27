/* Class103_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.Date;

public class Class103_Sub2 extends Class103
{
    boolean aBool9242;
    int anInt9243;
    Class129 aClass129_9244;
    int[] anIntArray9245;
    boolean aBool9246 = false;
    Class129 aClass129_9247;
    float[] aFloatArray9248;
    int anInt9249;
    int anInt9250;
    int anInt9251;
    int anInt9252;
    int anInt9253;
    int anInt9254;
    int anInt9255;
    int anInt9256;
    int anInt9257;
    int anInt9258;
    Class266 aClass266_9259;
    int anInt9260;
    Class268 aClass268_9261;
    Class268 aClass268_9262;
    float[][] aFloatArrayArray9263;
    int anInt9264;
    int anInt9265;
    int anInt9266;
    int anInt9267;
    float aFloat9268;
    Class168 aClass168_9269;
    float aFloat9270;
    float aFloat9271;
    float aFloat9272;
    int anInt9273;
    int anInt9274;
    Class189[] aClass189Array9275;
    float aFloat9276;
    float aFloat9277;
    int anInt9278;
    Class268 aClass268_9279;
    
    public void method2433(Class266 class266, Class97 class97,
			   Class272 class272) {
	Class268 class268 = method2226();
	class268.method5203(class266);
	class268.method5202(((Class103_Sub2) this).aClass268_9262);
	class97.method2172(class272, ((Class103_Sub2) this).aClass268_9261,
			   class268, ((Class103_Sub2) this).aFloat9277,
			   ((Class103_Sub2) this).aFloat9271,
			   ((Class103_Sub2) this).aFloat9268,
			   ((Class103_Sub2) this).aFloat9270);
    }
    
    Class103_Sub2(Class107 class107, Interface6 interface6) {
	super(class107, interface6);
	((Class103_Sub2) this).aBool9242 = false;
	((Class103_Sub2) this).anInt9249 = 0;
	((Class103_Sub2) this).anInt9250 = 0;
	((Class103_Sub2) this).anInt9254 = 0;
	((Class103_Sub2) this).anInt9252 = 0;
	((Class103_Sub2) this).anInt9256 = 2064076279;
	((Class103_Sub2) this).anInt9257 = -2077442274;
	((Class103_Sub2) this).anInt9255 = 451555742;
	((Class103_Sub2) this).aFloatArrayArray9263 = new float[6][4];
	((Class103_Sub2) this).aFloat9272 = 1.0F;
	((Class103_Sub2) this).aFloat9276 = 0.0F;
	((Class103_Sub2) this).aClass129_9247 = new Class129(16);
	((Class103_Sub2) this).anInt9253 = -1418390367;
	try {
	    ((Class103_Sub2) this).aClass129_9244 = new Class129(6291456, 256);
	    ((Class103_Sub2) this).aClass266_9259 = new Class266();
	    ((Class103_Sub2) this).aClass268_9279 = new Class268();
	    ((Class103_Sub2) this).aClass268_9261 = new Class268();
	    ((Class103_Sub2) this).aClass268_9262 = new Class268();
	    method15376(1);
	    method15375(0);
	    Class81.method1812(true, true, 953486904);
	    ((Class103_Sub2) this).aBool9242 = true;
	    ((Class103_Sub2) this).anInt9243
		= (int) Class50.method1249((byte) 1) * 1444866889;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method2220((byte) 0);
	    throw new RuntimeException("");
	}
    }
    
    public Class174 method2623() {
	return new Class174(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    public void method2359(float f, float f_0_, float f_1_, float f_2_,
			   float f_3_) {
	/* empty */
    }
    
    public void method2436() {
	/* empty */
    }
    
    void method2221() {
	if (((Class103_Sub2) this).aBool9242) {
	    Class238.method4876(true, false, -126437489);
	    ((Class103_Sub2) this).aBool9242 = false;
	}
	((Class103_Sub2) this).aBool9246 = true;
    }
    
    public void method2222(int i) {
	int i_4_ = i - ((Class103_Sub2) this).anInt9243 * -634521863;
	for (Class241_Sub29 class241_sub29
		 = (Class241_Sub29) ((Class103_Sub2) this).aClass129_9244
					.method3033((byte) 2);
	     null != class241_sub29;
	     class241_sub29
		 = (Class241_Sub29) ((Class103_Sub2) this).aClass129_9244
					.method3034(1638462798)) {
	    if (((Class241_Sub29) class241_sub29).aBool10035) {
		((Class241_Sub29) class241_sub29).anInt10031 += i_4_;
		int i_5_ = ((Class241_Sub29) class241_sub29).anInt10031 / 50;
		if (i_5_ > 0) {
		    Class101 class101
			= aClass107_1458.method2680((((Class241_Sub29)
						      class241_sub29)
						     .anInt10034),
						    -79048354);
		    float f = (float) (class101.anInt1406 * 608905203);
		    class241_sub29.method16290
			((int) (f * ((float) i_4_ / 1000.0F
				     * (float) class101.aByte1376 / 64.0F)),
			 (int) ((float) i_4_ / 1000.0F
				* (float) class101.aByte1396 / 64.0F * f));
		    ((Class241_Sub29) class241_sub29).anInt10031 -= i_5_ * 50;
		}
		((Class241_Sub29) class241_sub29).aBool10035 = false;
	    }
	}
	((Class103_Sub2) this).anInt9243 = 1444866889 * i;
	((Class103_Sub2) this).aClass129_9247.clean(5, -2081224003);
	((Class103_Sub2) this).aClass129_9244.clean(5, -2054511434);
    }
    
    public int method2342() {
	return 0;
    }
    
    public void method2631(Class241_Sub47 class241_sub47) {
	/* empty */
    }
    
    public void method2466() {
	for (int i = 0; i < ((Class103_Sub2) this).aClass189Array9275.length;
	     i++) {
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i]).anInt2215
		= 143650433 * ((Class189) (((Class103_Sub2) this)
					   .aClass189Array9275[i])).anInt2240;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i]).aBool2217
		= false;
	}
    }
    
    public Class168 method2275(int i, int i_6_, boolean bool,
			       boolean bool_7_) {
	if (bool)
	    return new Class168_Sub2_Sub2(this, i, i_6_);
	return new Class168_Sub2_Sub1(this, i, i_6_);
    }
    
    public void method2479(int i, float f, float f_8_, float f_9_, float f_10_,
			   float f_11_) {
	((Class103_Sub2) this).anInt9256 = 1424358665 * (int) (f * 65535.0F);
	((Class103_Sub2) this).anInt9257
	    = (int) (65535.0F * f_8_) * 1922501479;
	float f_12_
	    = (float) Math.sqrt((double) (f_11_ * f_11_
					  + (f_9_ * f_9_ + f_10_ * f_10_)));
	((Class103_Sub2) this).anInt9266
	    = -1310794753 * (int) (f_9_ * 65535.0F / f_12_);
	((Class103_Sub2) this).anInt9258
	    = (int) (65535.0F * f_10_ / f_12_) * -1554926105;
	((Class103_Sub2) this).anInt9273
	    = -1389466273 * (int) (f_11_ * 65535.0F / f_12_);
    }
    
    int method15365(int i) {
	return aClass107_1458.method2680(i, 340699280).anInt1406 * 608905203;
    }
    
    Class529 method15366(int i) {
	return aClass107_1458.method2680(i, 1449247801).aClass529_1391;
    }
    
    byte method15367(int i) {
	return aClass107_1458.method2680(i, 746646658).aByte1372;
    }
    
    int method15368(int i) {
	return aClass107_1458.method2680(i, 999653417).aShort1436 & 0xffff;
    }
    
    public void method2396(int i, int i_13_, int i_14_, int i_15_, int i_16_,
			   int i_17_) {
	if (((Class103_Sub2) this).anIntArray9245 != null) {
	    if (i < 1298750001 * ((Class103_Sub2) this).anInt9249) {
		i_14_ -= 1298750001 * ((Class103_Sub2) this).anInt9249 - i;
		i = ((Class103_Sub2) this).anInt9249 * 1298750001;
	    }
	    if (i_13_ < ((Class103_Sub2) this).anInt9254 * -788450385) {
		i_15_ -= ((Class103_Sub2) this).anInt9254 * -788450385 - i_13_;
		i_13_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    }
	    if (i + i_14_ > 325436811 * ((Class103_Sub2) this).anInt9250)
		i_14_ = 325436811 * ((Class103_Sub2) this).anInt9250 - i;
	    if (i_13_ + i_15_ > 1546170165 * ((Class103_Sub2) this).anInt9252)
		i_15_ = 1546170165 * ((Class103_Sub2) this).anInt9252 - i_13_;
	    if (i_14_ > 0 && i_15_ > 0
		&& i <= ((Class103_Sub2) this).anInt9250 * 325436811
		&& i_13_ <= ((Class103_Sub2) this).anInt9252 * 1546170165) {
		int i_18_
		    = ((Class103_Sub2) this).anInt9260 * -1826993761 - i_14_;
		int i_19_ = i + (((Class103_Sub2) this).anInt9260 * -1826993761
				 * i_13_);
		int i_20_ = i_16_ >>> 24;
		if (0 == i_17_ || 1 == i_17_ && i_20_ == 255) {
		    int i_21_ = i_14_ >> 3;
		    int i_22_ = i_14_ & 0x7;
		    i_14_ = i_19_ - 1;
		    for (int i_23_ = -i_15_; i_23_ < 0; i_23_++) {
			if (i_21_ > 0) {
			    i = i_21_;
			    do {
				((Class103_Sub2) this).anIntArray9245[++i_14_]
				    = i_16_;
				((Class103_Sub2) this).anIntArray9245[++i_14_]
				    = i_16_;
				((Class103_Sub2) this).anIntArray9245[++i_14_]
				    = i_16_;
				((Class103_Sub2) this).anIntArray9245[++i_14_]
				    = i_16_;
				((Class103_Sub2) this).anIntArray9245[++i_14_]
				    = i_16_;
				((Class103_Sub2) this).anIntArray9245[++i_14_]
				    = i_16_;
				((Class103_Sub2) this).anIntArray9245[++i_14_]
				    = i_16_;
				((Class103_Sub2) this).anIntArray9245[++i_14_]
				    = i_16_;
			    } while (--i > 0);
			}
			if (i_22_ > 0) {
			    i = i_22_;
			    do
				((Class103_Sub2) this).anIntArray9245[++i_14_]
				    = i_16_;
			    while (--i > 0);
			}
			i_14_ += i_18_;
		    }
		} else if (i_17_ == 1) {
		    i_16_ = ((i_20_ * ((i_16_ & ~0xff00ff) >>> 8) & ~0xff00ff)
			     + (i_20_ * (i_16_ & 0xff00ff) >> 8 & 0xff00ff));
		    int i_24_ = 256 - i_20_;
		    for (int i_25_ = 0; i_25_ < i_15_; i_25_++) {
			for (int i_26_ = -i_14_; i_26_ < 0; i_26_++) {
			    int i_27_
				= ((Class103_Sub2) this).anIntArray9245[i_19_];
			    i_27_
				= ((i_24_ * (i_27_ & 0xff00ff) >> 8 & 0xff00ff)
				   + (((i_27_ & ~0xff00ff) >>> 8) * i_24_
				      & ~0xff00ff));
			    ((Class103_Sub2) this).anIntArray9245[i_19_++]
				= i_16_ + i_27_;
			}
			i_19_ += i_18_;
		    }
		} else if (2 == i_17_) {
		    for (int i_28_ = 0; i_28_ < i_15_; i_28_++) {
			for (int i_29_ = -i_14_; i_29_ < 0; i_29_++) {
			    int i_30_
				= ((Class103_Sub2) this).anIntArray9245[i_19_];
			    int i_31_ = i_30_ + i_16_;
			    int i_32_
				= (i_16_ & 0xff00ff) + (i_30_ & 0xff00ff);
			    i_30_ = (i_31_ - i_32_ & 0x10000) + (i_32_
								 & 0x1000100);
			    ((Class103_Sub2) this).anIntArray9245[i_19_++]
				= i_31_ - i_30_ | i_30_ - (i_30_ >>> 8);
			}
			i_19_ += i_18_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2367(float f, float f_33_, float f_34_, float f_35_,
			   float f_36_) {
	/* empty */
    }
    
    public boolean method2584() {
	return false;
    }
    
    public int[] method2565(int i, int i_37_, int i_38_, int i_39_) {
	if (((Class103_Sub2) this).anIntArray9245 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_38_ * i_39_];
	int i_40_ = 0;
	for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
	    int i_42_ = ((i_41_ + i_37_) * (-1826993761
					    * ((Class103_Sub2) this).anInt9260)
			 + i);
	    for (int i_43_ = 0; i_43_ < i_38_; i_43_++)
		is[i_40_++]
		    = ((Class103_Sub2) this).anIntArray9245[i_43_ + i_42_];
	}
	return is;
    }
    
    public int method2301(int i, int i_44_) {
	i |= 0x20800;
	return i & i_44_ ^ i_44_;
    }
    
    public boolean method2286() {
	return false;
    }
    
    public boolean method2382() {
	return false;
    }
    
    public boolean method2215() {
	return false;
    }
    
    public boolean method2232() {
	return false;
    }
    
    public boolean method2573() {
	return false;
    }
    
    public boolean method2234() {
	return true;
    }
    
    public String method2284() {
	return "";
    }
    
    public void method2442(boolean bool) {
	/* empty */
    }
    
    Class105_Sub1 method2246(Canvas canvas, int i, int i_45_) {
	return CursorTypeList.method13211(this, canvas, i, i_45_, -498960104);
    }
    
    void method15369(int i, int i_46_, int[] is, float[] fs) {
	((Class103_Sub2) this).anInt9260 = i * 1904120415;
	((Class103_Sub2) this).anInt9278 = i_46_ * -710038965;
	((Class103_Sub2) this).anIntArray9245 = is;
	((Class103_Sub2) this).aFloatArray9248 = fs;
	for (int i_47_ = 0;
	     i_47_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_47_++)
	    ((Class103_Sub2) this).aClass189Array9275[i_47_]
		.method3871(907761963);
	method2572();
	method2295();
    }
    
    public Class135 method2250(int i, int i_48_, int[] is, int[] is_49_) {
	return new Class135_Sub1(i, i_48_, is, is_49_);
    }
    
    public void method2475(Class268 class268) {
	((Class103_Sub2) this).aClass268_9261.method5199(class268);
	method15382();
    }
    
    public void method2236(int[] is) {
	is[0] = -1826993761 * ((Class103_Sub2) this).anInt9260;
	is[1] = ((Class103_Sub2) this).anInt9278 * -2069999773;
    }
    
    boolean method15370(int i, int i_50_) {
	return anInterface6_1457.method31(i, Class537.aClass537_6990, 0.7F,
					  i_50_, i_50_, true, 826217215);
    }
    
    int method15371(int i) {
	return aClass107_1458.method2680(i, -1554977964).aShort1436 & 0xffff;
    }
    
    public void method2544(int i, int i_51_, int i_52_, int i_53_, int i_54_,
			   int i_55_, Class135 class135, int i_56_, int i_57_,
			   int i_58_, int i_59_, int i_60_) {
	if (((Class103_Sub2) this).anIntArray9245 != null) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    int[] is = ((Class135_Sub1) class135_sub1).anIntArray9874;
	    int[] is_61_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	    int i_62_
		= (-788450385 * ((Class103_Sub2) this).anInt9254 > i_57_
		   ? ((Class103_Sub2) this).anInt9254 * -788450385 : i_57_);
	    int i_63_ = ((((Class103_Sub2) this).anInt9252 * 1546170165
			  < i_57_ + is.length)
			 ? 1546170165 * ((Class103_Sub2) this).anInt9252
			 : i_57_ + is.length);
	    i_60_ <<= 8;
	    i_58_ <<= 8;
	    i_59_ <<= 8;
	    int i_64_ = i_58_ + i_59_;
	    i_60_ %= i_64_;
	    i_52_ -= i;
	    i_53_ -= i_51_;
	    if (i_52_ + i_53_ < 0) {
		int i_65_ = (int) (Math.sqrt((double) (i_52_ * i_52_
						       + i_53_ * i_53_))
				   * 256.0);
		int i_66_ = i_65_ % i_64_;
		i_60_ = i_58_ + i_64_ - i_60_ - i_66_;
		i_60_ %= i_64_;
		if (i_60_ < 0)
		    i_60_ += i_64_;
		i += i_52_;
		i_52_ = -i_52_;
		i_51_ += i_53_;
		i_53_ = -i_53_;
	    }
	    if (i_52_ > i_53_) {
		i_51_ <<= 16;
		i_51_ += 32768;
		i_53_ <<= 16;
		int i_67_
		    = (int) Math.floor((double) i_53_ / (double) i_52_ + 0.5);
		i_52_ += i;
		int i_68_ = i_54_ >>> 24;
		int i_69_
		    = (int) Math.sqrt((double) (65536
						+ (i_67_ >> 8) * (i_67_
								  >> 8)));
		if (i_55_ == 0 || 1 == i_55_ && i_68_ == 255) {
		    while (i <= i_52_) {
			int i_70_ = i_51_ >> 16;
			int i_71_ = i_70_ - i_57_;
			if (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
			    && i < 325436811 * ((Class103_Sub2) this).anInt9250
			    && i_70_ >= i_62_ && i_70_ < i_63_
			    && i_60_ < i_58_) {
			    int i_72_ = is[i_71_] + i_56_;
			    if (i >= i_72_ && i < i_72_ + is_61_[i_71_])
				((Class103_Sub2) this).anIntArray9245
				    [(((Class103_Sub2) this).anInt9260
				      * -1826993761 * i_70_) + i]
				    = i_54_;
			}
			i_51_ += i_67_;
			i++;
			i_60_ += i_69_;
			i_60_ %= i_64_;
		    }
		} else if (1 == i_55_) {
		    i_54_ = (((i_54_ & 0xff00ff) * i_68_ >> 8 & 0xff00ff)
			     + (i_68_ * (i_54_ & 0xff00) >> 8 & 0xff00)
			     + (i_68_ << 24));
		    int i_73_ = 256 - i_68_;
		    while (i <= i_52_) {
			int i_74_ = i_51_ >> 16;
			int i_75_ = i_74_ - i_57_;
			if (i >= 1298750001 * ((Class103_Sub2) this).anInt9249
			    && i < 325436811 * ((Class103_Sub2) this).anInt9250
			    && i_74_ >= i_62_ && i_74_ < i_63_
			    && i_60_ < i_58_) {
			    int i_76_ = is[i_75_] + i_56_;
			    if (i >= i_76_ && i < is_61_[i_75_] + i_76_) {
				int i_77_
				    = i + (i_74_
					   * (((Class103_Sub2) this).anInt9260
					      * -1826993761));
				int i_78_ = (((Class103_Sub2) this)
					     .anIntArray9245[i_77_]);
				i_78_
				    = (((i_78_ & 0xff00) * i_73_ >> 8 & 0xff00)
				       + (i_73_ * (i_78_ & 0xff00ff) >> 8
					  & 0xff00ff));
				((Class103_Sub2) this).anIntArray9245[i_77_]
				    = i_54_ + i_78_;
			    }
			}
			i_51_ += i_67_;
			i++;
			i_60_ += i_69_;
			i_60_ %= i_64_;
		    }
		} else if (2 == i_55_) {
		    while (i <= i_52_) {
			int i_79_ = i_51_ >> 16;
			int i_80_ = i_79_ - i_57_;
			if (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
			    && i < ((Class103_Sub2) this).anInt9250 * 325436811
			    && i_79_ >= i_62_ && i_79_ < i_63_
			    && i_60_ < i_58_) {
			    int i_81_ = is[i_80_] + i_56_;
			    if (i >= i_81_ && i < i_81_ + is_61_[i_80_]) {
				int i_82_
				    = i + (-1826993761
					   * ((Class103_Sub2) this).anInt9260
					   * i_79_);
				int i_83_ = (((Class103_Sub2) this)
					     .anIntArray9245[i_82_]);
				int i_84_ = i_54_ + i_83_;
				int i_85_
				    = (i_83_ & 0xff00ff) + (i_54_ & 0xff00ff);
				i_83_ = (i_85_ & 0x1000100) + (i_84_ - i_85_
							       & 0x10000);
				((Class103_Sub2) this).anIntArray9245[i_82_]
				    = i_84_ - i_83_ | i_83_ - (i_83_ >>> 8);
			    }
			}
			i_51_ += i_67_;
			i++;
			i_60_ += i_69_;
			i_60_ %= i_64_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_52_ <<= 16;
		int i_86_
		    = (int) Math.floor(0.5 + (double) i_52_ / (double) i_53_);
		int i_87_
		    = (int) Math.sqrt((double) ((i_86_ >> 8) * (i_86_ >> 8)
						+ 65536));
		i_53_ += i_51_;
		int i_88_ = i_54_ >>> 24;
		if (0 == i_55_ || i_55_ == 1 && i_88_ == 255) {
		    while (i_51_ <= i_53_) {
			int i_89_ = i >> 16;
			int i_90_ = i_51_ - i_57_;
			if (i_51_ >= i_62_ && i_51_ < i_63_
			    && i_89_ >= (1298750001
					 * ((Class103_Sub2) this).anInt9249)
			    && (i_89_
				< ((Class103_Sub2) this).anInt9250 * 325436811)
			    && i_60_ < i_58_ && i_89_ >= is[i_90_] + i_56_
			    && i_89_ < is_61_[i_90_] + (is[i_90_] + i_56_))
			    ((Class103_Sub2) this).anIntArray9245
				[((-1826993761
				   * ((Class103_Sub2) this).anInt9260 * i_51_)
				  + i_89_)]
				= i_54_;
			i += i_86_;
			i_51_++;
			i_60_ += i_87_;
			i_60_ %= i_64_;
		    }
		} else if (i_55_ == 1) {
		    i_54_ = (i_88_ << 24) + (((i_54_ & 0xff00) * i_88_ >> 8
					      & 0xff00)
					     + (i_88_ * (i_54_ & 0xff00ff) >> 8
						& 0xff00ff));
		    int i_91_ = 256 - i_88_;
		    while (i_51_ <= i_53_) {
			int i_92_ = i >> 16;
			int i_93_ = i_51_ - i_57_;
			if (i_51_ >= i_62_ && i_51_ < i_63_
			    && i_92_ >= (1298750001
					 * ((Class103_Sub2) this).anInt9249)
			    && (i_92_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_60_ < i_58_ && i_92_ >= i_56_ + is[i_93_]
			    && i_92_ < i_56_ + is[i_93_] + is_61_[i_93_]) {
			    int i_94_
				= (i_51_ * (((Class103_Sub2) this).anInt9260
					    * -1826993761)
				   + i_92_);
			    int i_95_
				= ((Class103_Sub2) this).anIntArray9245[i_94_];
			    i_95_
				= (((i_95_ & 0xff00ff) * i_91_ >> 8 & 0xff00ff)
				   + ((i_95_ & 0xff00) * i_91_ >> 8 & 0xff00));
			    ((Class103_Sub2) this).anIntArray9245
				[i_51_ * (((Class103_Sub2) this).anInt9260
					  * -1826993761) + i_92_]
				= i_54_ + i_95_;
			}
			i += i_86_;
			i_51_++;
			i_60_ += i_87_;
			i_60_ %= i_64_;
		    }
		} else if (i_55_ == 2) {
		    while (i_51_ <= i_53_) {
			int i_96_ = i >> 16;
			int i_97_ = i_51_ - i_57_;
			if (i_51_ >= i_62_ && i_51_ < i_63_
			    && i_96_ >= (1298750001
					 * ((Class103_Sub2) this).anInt9249)
			    && (i_96_
				< ((Class103_Sub2) this).anInt9250 * 325436811)
			    && i_60_ < i_58_ && i_96_ >= i_56_ + is[i_97_]
			    && i_96_ < i_56_ + is[i_97_] + is_61_[i_97_]) {
			    int i_98_ = ((((Class103_Sub2) this).anInt9260
					  * -1826993761 * i_51_)
					 + i_96_);
			    int i_99_
				= ((Class103_Sub2) this).anIntArray9245[i_98_];
			    int i_100_ = i_99_ + i_54_;
			    int i_101_
				= (i_99_ & 0xff00ff) + (i_54_ & 0xff00ff);
			    i_99_
				= (i_100_ - i_101_ & 0x10000) + (i_101_
								 & 0x1000100);
			    ((Class103_Sub2) this).anIntArray9245[i_98_]
				= i_100_ - i_99_ | i_99_ - (i_99_ >>> 8);
			}
			i += i_86_;
			i_51_++;
			i_60_ += i_87_;
			i_60_ %= i_64_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2522(int i, int i_102_, float f, int i_103_, int i_104_,
			   float f_105_, int i_106_, int i_107_, float f_108_,
			   int i_109_, int i_110_, int i_111_, int i_112_) {
	boolean bool = null != ((Class103_Sub2) this).anIntArray9245;
	boolean bool_113_ = ((Class103_Sub2) this).aFloatArray9248 != null;
	if (bool || bool_113_) {
	    Class189 class189 = method15377(Thread.currentThread());
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aBool1721 = false;
	    i -= 1298750001 * ((Class103_Sub2) this).anInt9249;
	    i_103_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_106_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_102_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_104_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_107_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    ((Class155) class155).aBool1748
		= (i < 0 || i > ((Class155) class155).anInt1733 || i_103_ < 0
		   || i_103_ > ((Class155) class155).anInt1733 || i_106_ < 0
		   || i_106_ > ((Class155) class155).anInt1733);
	    int i_114_ = i_109_ >>> 24;
	    if (0 == i_112_ || i_112_ == 1 && 255 == i_114_) {
		((Class155) class155).anInt1723 = 0;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_113_, false, (float) i_102_,
				    (float) i_104_, (float) i_107_, (float) i,
				    (float) i_103_, (float) i_106_, f, f_105_,
				    f_108_, i_109_, i_110_, i_111_);
	    } else if (1 == i_112_) {
		((Class155) class155).anInt1723 = 255 - i_114_;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_113_, false, (float) i_102_,
				    (float) i_104_, (float) i_107_, (float) i,
				    (float) i_103_, (float) i_106_, f, f_105_,
				    f_108_, i_109_, i_110_, i_111_);
	    } else if (i_112_ == 2) {
		((Class155) class155).anInt1723 = 128;
		((Class155) class155).aBool1722 = true;
		class155.method3385(bool, bool_113_, false, (float) i_102_,
				    (float) i_104_, (float) i_107_, (float) i,
				    (float) i_103_, (float) i_106_, f, f_105_,
				    f_108_, i_109_, i_110_, i_111_);
	    } else
		throw new IllegalArgumentException();
	    ((Class155) class155).aBool1721 = true;
	}
    }
    
    public void method2255(float f, float f_115_) {
	((Class103_Sub2) this).aFloat9272 = f_115_ - f;
	((Class103_Sub2) this).aFloat9276 = f_115_ + f - 1.0F;
	for (int i = 0; i < ((Class103_Sub2) this).anInt9274 * 592623211;
	     i++) {
	    Class189 class189 = ((Class103_Sub2) this).aClass189Array9275[i];
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aFloat1732
		= ((Class103_Sub2) this).aFloat9272;
	    ((Class155) class155).aFloat1720
		= ((Class103_Sub2) this).aFloat9276;
	}
    }
    
    void method15372() {
	int i = (325436811 * ((Class103_Sub2) this).anInt9250
		 - ((Class103_Sub2) this).anInt9249 * 1298750001);
	int i_116_ = (1546170165 * ((Class103_Sub2) this).anInt9252
		      - -788450385 * ((Class103_Sub2) this).anInt9254);
	float f = (((Class103_Sub2) this).aFloat9268
		   = ((float) (-1144298619 * ((Class103_Sub2) this).anInt9251)
		      / 2.0F));
	float f_117_ = (((Class103_Sub2) this).aFloat9270
			= (float) (-762379487
				   * ((Class103_Sub2) this).anInt9267) / 2.0F);
	((Class103_Sub2) this).aFloat9277
	    = f + (float) (((Class103_Sub2) this).anInt9264 * -771006449);
	((Class103_Sub2) this).aFloat9271
	    = (float) (534835081 * ((Class103_Sub2) this).anInt9265) + f_117_;
	for (int i_118_ = 0;
	     i_118_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_118_++) {
	    Class189 class189
		= ((Class103_Sub2) this).aClass189Array9275[i_118_];
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aFloat1728 = f;
	    ((Class155) class155).aFloat1729 = f_117_;
	    ((Class155) class155).aFloat1727
		= (((Class103_Sub2) this).aFloat9277
		   - (float) (1298750001 * ((Class103_Sub2) this).anInt9249));
	    ((Class155) class155).aFloat1731
		= (((Class103_Sub2) this).aFloat9271
		   - (float) (-788450385 * ((Class103_Sub2) this).anInt9254));
	    ((Class155) class155).anInt1733 = i;
	    ((Class155) class155).anInt1726 = i_116_;
	}
	int i_119_ = ((-1826993761 * ((Class103_Sub2) this).anInt9260
		       * (-788450385 * ((Class103_Sub2) this).anInt9254))
		      + ((Class103_Sub2) this).anInt9249 * 1298750001);
	for (int i_120_ = -788450385 * ((Class103_Sub2) this).anInt9254;
	     i_120_ < ((Class103_Sub2) this).anInt9252 * 1546170165;
	     i_120_++) {
	    for (int i_121_ = 0;
		 i_121_ < ((Class103_Sub2) this).anInt9274 * 592623211;
		 i_121_++)
		((Class155) (((Class189) (((Class103_Sub2) this)
					  .aClass189Array9275[i_121_]))
			     .aClass155_2223))
		    .anIntArray1730
		    [i_120_ - -788450385 * ((Class103_Sub2) this).anInt9254]
		    = i_119_;
	    i_119_ += -1826993761 * ((Class103_Sub2) this).anInt9260;
	}
    }
    
    public void method2572() {
	((Class103_Sub2) this).anInt9249 = 0;
	((Class103_Sub2) this).anInt9254 = 0;
	((Class103_Sub2) this).anInt9250
	    = ((Class103_Sub2) this).anInt9260 * 1957205693;
	((Class103_Sub2) this).anInt9252
	    = ((Class103_Sub2) this).anInt9278 * -219390153;
	method15372();
    }
    
    public void method2401(int i, int i_122_, int i_123_, int i_124_) {
	if (1298750001 * ((Class103_Sub2) this).anInt9249 < i)
	    ((Class103_Sub2) this).anInt9249 = i * 211664593;
	if (((Class103_Sub2) this).anInt9254 * -788450385 < i_122_)
	    ((Class103_Sub2) this).anInt9254 = i_122_ * -1495661745;
	if (((Class103_Sub2) this).anInt9250 * 325436811 > i_123_)
	    ((Class103_Sub2) this).anInt9250 = 244169251 * i_123_;
	if (((Class103_Sub2) this).anInt9252 * 1546170165 > i_124_)
	    ((Class103_Sub2) this).anInt9252 = i_124_ * 1034251037;
	method15372();
    }
    
    public void method2258(int i, int i_125_, int i_126_, int i_127_) {
	if (1298750001 * ((Class103_Sub2) this).anInt9249 < i)
	    ((Class103_Sub2) this).anInt9249 = i * 211664593;
	if (((Class103_Sub2) this).anInt9254 * -788450385 < i_125_)
	    ((Class103_Sub2) this).anInt9254 = i_125_ * -1495661745;
	if (((Class103_Sub2) this).anInt9250 * 325436811 > i_126_)
	    ((Class103_Sub2) this).anInt9250 = 244169251 * i_126_;
	if (((Class103_Sub2) this).anInt9252 * 1546170165 > i_127_)
	    ((Class103_Sub2) this).anInt9252 = i_127_ * 1034251037;
	method15372();
    }
    
    public Class96 method2414(Class639 class639, Class108[] class108s,
			      boolean bool) {
	int[] is = new int[class108s.length];
	int[] is_128_ = new int[class108s.length];
	boolean bool_129_ = false;
	boolean bool_130_ = false;
	for (int i = 0; i < class108s.length; i++) {
	    is[i] = class108s[i].method2698();
	    is_128_[i] = class108s[i].method2694();
	    if (class108s[i].method2692())
		bool_129_ = true;
	    if (class108s[i].method2691())
		bool_130_ = true;
	}
	if (bool) {
	    if (bool_130_) {
		if (bool_129_)
		    return new Class96_Sub1(this, class639,
					    (Class108_Sub2[]) class108s, is,
					    is_128_);
		return new Class96_Sub3(this, class639,
					(Class108_Sub2[]) class108s, is,
					is_128_);
	    }
	    if (bool_129_)
		return new Class96_Sub1(this, class639,
					(Class108_Sub1[]) class108s, is,
					is_128_);
	    return new Class96_Sub3(this, class639,
				    (Class108_Sub1[]) class108s, is, is_128_);
	}
	if (bool_130_) {
	    if (bool_129_)
		throw new IllegalArgumentException("");
	    return new Class96_Sub5(this, class639,
				    (Class108_Sub2[]) class108s, is, is_128_);
	}
	return new Class96_Sub2(this, class639, (Class108_Sub1[]) class108s,
				is, is_128_);
    }
    
    public void method2450(int i, int i_131_) {
	if ((i & 0x1) != 0)
	    method2396(0, 0, -1826993761 * ((Class103_Sub2) this).anInt9260,
		       -2069999773 * ((Class103_Sub2) this).anInt9278, i_131_,
		       0);
	if (0 != (i & 0x2))
	    method15424();
    }
    
    public void method2492(int i, int i_132_, int i_133_, int i_134_) {
	/* empty */
    }
    
    boolean method2547(int i, int i_135_, int i_136_, int i_137_,
		       Class266 class266, Class272 class272) {
	Class268 class268 = method2226();
	class268.method5203(class266);
	class268.method5202(((Class103_Sub2) this).aClass268_9262);
	return class272.method5317(i, i_135_, i_136_, i_137_, class268,
				   ((Class103_Sub2) this).aFloat9277,
				   ((Class103_Sub2) this).aFloat9271,
				   ((Class103_Sub2) this).aFloat9268,
				   ((Class103_Sub2) this).aFloat9270);
    }
    
    void method2543(int i, int i_138_, int i_139_, int i_140_, int i_141_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    if (i_139_ < 0)
		i_139_ = -i_139_;
	    int i_142_ = i_138_ - i_139_;
	    if (i_142_ < ((Class103_Sub2) this).anInt9254 * -788450385)
		i_142_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    int i_143_ = 1 + (i_138_ + i_139_);
	    if (i_143_ > ((Class103_Sub2) this).anInt9252 * 1546170165)
		i_143_ = ((Class103_Sub2) this).anInt9252 * 1546170165;
	    int i_144_ = i_142_;
	    int i_145_ = i_139_ * i_139_;
	    int i_146_ = 0;
	    int i_147_ = i_138_ - i_144_;
	    int i_148_ = i_147_ * i_147_;
	    int i_149_ = i_148_ - i_147_;
	    if (i_138_ > i_143_)
		i_138_ = i_143_;
	    int i_150_ = i_140_ >>> 24;
	    if (i_141_ == 0 || i_141_ == 1 && 255 == i_150_) {
		while (i_144_ < i_138_) {
		    for (/**/; i_149_ <= i_145_ || i_148_ <= i_145_;
			 i_149_ += i_146_++ + i_146_)
			i_148_ += i_146_ + i_146_;
		    int i_151_ = i - i_146_ + 1;
		    if (i_151_ < ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_151_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_152_ = i_146_ + i;
		    if (i_152_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_152_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_153_ = ((-1826993761
				   * ((Class103_Sub2) this).anInt9260 * i_144_)
				  + i_151_);
		    for (int i_154_ = i_151_; i_154_ < i_152_; i_154_++)
			((Class103_Sub2) this).anIntArray9245[i_153_++]
			    = i_140_;
		    i_144_++;
		    i_148_ -= i_147_-- + i_147_;
		    i_149_ -= i_147_ + i_147_;
		}
		i_146_ = i_139_;
		i_147_ = i_144_ - i_138_;
		i_149_ = i_145_ + i_147_ * i_147_;
		i_148_ = i_149_ - i_146_;
		i_149_ -= i_147_;
		while (i_144_ < i_143_) {
		    for (/**/; i_149_ > i_145_ && i_148_ > i_145_;
			 i_148_ -= i_146_ + i_146_)
			i_149_ -= i_146_-- + i_146_;
		    int i_155_ = i - i_146_;
		    if (i_155_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_155_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_156_ = i + i_146_;
		    if (i_156_
			> ((Class103_Sub2) this).anInt9250 * 325436811 - 1)
			i_156_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_157_ = i_155_ + (((Class103_Sub2) this).anInt9260
					   * -1826993761 * i_144_);
		    for (int i_158_ = i_155_; i_158_ <= i_156_; i_158_++)
			((Class103_Sub2) this).anIntArray9245[i_157_++]
			    = i_140_;
		    i_144_++;
		    i_149_ += i_147_ + i_147_;
		    i_148_ += i_147_++ + i_147_;
		}
	    } else if (i_141_ == 1) {
		i_140_ = (((i_140_ & 0xff00ff) * i_150_ >> 8 & 0xff00ff)
			  + ((i_140_ & 0xff00) * i_150_ >> 8 & 0xff00)
			  + (i_150_ << 24));
		int i_159_ = 256 - i_150_;
		while (i_144_ < i_138_) {
		    for (/**/; i_149_ <= i_145_ || i_148_ <= i_145_;
			 i_149_ += i_146_++ + i_146_)
			i_148_ += i_146_ + i_146_;
		    int i_160_ = i - i_146_ + 1;
		    if (i_160_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_160_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_161_ = i + i_146_;
		    if (i_161_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_161_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_162_ = i_160_ + (((Class103_Sub2) this).anInt9260
					   * -1826993761 * i_144_);
		    for (int i_163_ = i_160_; i_163_ < i_161_; i_163_++) {
			int i_164_
			    = ((Class103_Sub2) this).anIntArray9245[i_162_];
			i_164_ = ((i_159_ * (i_164_ & 0xff00) >> 8 & 0xff00)
				  + ((i_164_ & 0xff00ff) * i_159_ >> 8
				     & 0xff00ff));
			((Class103_Sub2) this).anIntArray9245[i_162_++]
			    = i_140_ + i_164_;
		    }
		    i_144_++;
		    i_148_ -= i_147_-- + i_147_;
		    i_149_ -= i_147_ + i_147_;
		}
		i_146_ = i_139_;
		i_147_ = -i_147_;
		i_149_ = i_147_ * i_147_ + i_145_;
		i_148_ = i_149_ - i_146_;
		i_149_ -= i_147_;
		while (i_144_ < i_143_) {
		    for (/**/; i_149_ > i_145_ && i_148_ > i_145_;
			 i_148_ -= i_146_ + i_146_)
			i_149_ -= i_146_-- + i_146_;
		    int i_165_ = i - i_146_;
		    if (i_165_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_165_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_166_ = i_146_ + i;
		    if (i_166_
			> 325436811 * ((Class103_Sub2) this).anInt9250 - 1)
			i_166_
			    = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		    int i_167_
			= (i_165_
			   + i_144_ * (-1826993761
				       * ((Class103_Sub2) this).anInt9260));
		    for (int i_168_ = i_165_; i_168_ <= i_166_; i_168_++) {
			int i_169_
			    = ((Class103_Sub2) this).anIntArray9245[i_167_];
			i_169_
			    = ((i_159_ * (i_169_ & 0xff00ff) >> 8 & 0xff00ff)
			       + ((i_169_ & 0xff00) * i_159_ >> 8 & 0xff00));
			((Class103_Sub2) this).anIntArray9245[i_167_++]
			    = i_140_ + i_169_;
		    }
		    i_144_++;
		    i_149_ += i_147_ + i_147_;
		    i_148_ += i_147_++ + i_147_;
		}
	    } else if (2 == i_141_) {
		while (i_144_ < i_138_) {
		    for (/**/; i_149_ <= i_145_ || i_148_ <= i_145_;
			 i_149_ += i_146_++ + i_146_)
			i_148_ += i_146_ + i_146_;
		    int i_170_ = 1 + (i - i_146_);
		    if (i_170_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_170_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_171_ = i + i_146_;
		    if (i_171_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_171_ = 325436811 * ((Class103_Sub2) this).anInt9250;
		    int i_172_ = ((((Class103_Sub2) this).anInt9260
				   * -1826993761 * i_144_)
				  + i_170_);
		    for (int i_173_ = i_170_; i_173_ < i_171_; i_173_++) {
			int i_174_
			    = ((Class103_Sub2) this).anIntArray9245[i_172_];
			int i_175_ = i_174_ + i_140_;
			int i_176_ = (i_174_ & 0xff00ff) + (i_140_ & 0xff00ff);
			i_174_ = (i_176_ & 0x1000100) + (i_175_ - i_176_
							 & 0x10000);
			((Class103_Sub2) this).anIntArray9245[i_172_++]
			    = i_175_ - i_174_ | i_174_ - (i_174_ >>> 8);
		    }
		    i_144_++;
		    i_148_ -= i_147_-- + i_147_;
		    i_149_ -= i_147_ + i_147_;
		}
		i_146_ = i_139_;
		i_147_ = -i_147_;
		i_149_ = i_147_ * i_147_ + i_145_;
		i_148_ = i_149_ - i_146_;
		i_149_ -= i_147_;
		while (i_144_ < i_143_) {
		    for (/**/; i_149_ > i_145_ && i_148_ > i_145_;
			 i_148_ -= i_146_ + i_146_)
			i_149_ -= i_146_-- + i_146_;
		    int i_177_ = i - i_146_;
		    if (i_177_ < ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_177_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_178_ = i_146_ + i;
		    if (i_178_
			> ((Class103_Sub2) this).anInt9250 * 325436811 - 1)
			i_178_
			    = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		    int i_179_
			= (i_177_
			   + i_144_ * (-1826993761
				       * ((Class103_Sub2) this).anInt9260));
		    for (int i_180_ = i_177_; i_180_ <= i_178_; i_180_++) {
			int i_181_
			    = ((Class103_Sub2) this).anIntArray9245[i_179_];
			int i_182_ = i_140_ + i_181_;
			int i_183_ = (i_181_ & 0xff00ff) + (i_140_ & 0xff00ff);
			i_181_ = (i_182_ - i_183_ & 0x10000) + (i_183_
								& 0x1000100);
			((Class103_Sub2) this).anIntArray9245[i_179_++]
			    = i_182_ - i_181_ | i_181_ - (i_181_ >>> 8);
		    }
		    i_144_++;
		    i_149_ += i_147_ + i_147_;
		    i_148_ += i_147_++ + i_147_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method2272(int i, int i_184_, int i_185_, int i_186_, int i_187_) {
	if (null != ((Class103_Sub2) this).anIntArray9245
	    && (i_184_ >= -788450385 * ((Class103_Sub2) this).anInt9254
		&& i_184_ < ((Class103_Sub2) this).anInt9252 * 1546170165)) {
	    if (i < ((Class103_Sub2) this).anInt9249 * 1298750001) {
		i_185_ -= ((Class103_Sub2) this).anInt9249 * 1298750001 - i;
		i = ((Class103_Sub2) this).anInt9249 * 1298750001;
	    }
	    if (i + i_185_ > 325436811 * ((Class103_Sub2) this).anInt9250)
		i_185_ = ((Class103_Sub2) this).anInt9250 * 325436811 - i;
	    int i_188_
		= i + ((Class103_Sub2) this).anInt9260 * -1826993761 * i_184_;
	    int i_189_ = i_186_ >>> 24;
	    if (i_187_ == 0 || i_187_ == 1 && i_189_ == 255) {
		for (int i_190_ = 0; i_190_ < i_185_; i_190_++)
		    ((Class103_Sub2) this).anIntArray9245[i_190_ + i_188_]
			= i_186_;
	    } else if (1 == i_187_) {
		i_186_ = (((i_186_ & 0xff00) * i_189_ >> 8 & 0xff00)
			  + (i_189_ * (i_186_ & 0xff00ff) >> 8 & 0xff00ff)
			  + (i_189_ << 24));
		int i_191_ = 256 - i_189_;
		for (int i_192_ = 0; i_192_ < i_185_; i_192_++) {
		    int i_193_ = (((Class103_Sub2) this).anIntArray9245
				  [i_192_ + i_188_]);
		    i_193_ = (((i_193_ & 0xff00ff) * i_191_ >> 8 & 0xff00ff)
			      + (i_191_ * (i_193_ & 0xff00) >> 8 & 0xff00));
		    ((Class103_Sub2) this).anIntArray9245[i_192_ + i_188_]
			= i_193_ + i_186_;
		}
	    } else if (i_187_ == 2) {
		for (int i_194_ = 0; i_194_ < i_185_; i_194_++) {
		    int i_195_ = (((Class103_Sub2) this).anIntArray9245
				  [i_194_ + i_188_]);
		    int i_196_ = i_186_ + i_195_;
		    int i_197_ = (i_186_ & 0xff00ff) + (i_195_ & 0xff00ff);
		    i_195_
			= (i_197_ & 0x1000100) + (i_196_ - i_197_ & 0x10000);
		    ((Class103_Sub2) this).anIntArray9245[i_194_ + i_188_]
			= i_196_ - i_195_ | i_195_ - (i_195_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15373(int i, int i_198_, int i_199_, int i_200_, int i_201_,
		     int i_202_, int i_203_, int i_204_) {
	if (null != ((Class103_Sub2) this).anIntArray9245
	    && (i_198_ >= ((Class103_Sub2) this).anInt9254 * -788450385
		&& i_198_ < 1546170165 * ((Class103_Sub2) this).anInt9252)) {
	    int i_205_
		= (i_198_ * (-1826993761 * ((Class103_Sub2) this).anInt9260)
		   + i);
	    int i_206_ = i_200_ >>> 24;
	    int i_207_ = i_202_ + i_203_;
	    int i_208_ = i_204_ % i_207_;
	    if (i_201_ == 0 || i_201_ == 1 && 255 == i_206_) {
		int i_209_ = 0;
		while (i_209_ < i_199_) {
		    if ((i + i_209_
			 >= ((Class103_Sub2) this).anInt9249 * 1298750001)
			&& (i + i_209_
			    < ((Class103_Sub2) this).anInt9250 * 325436811)
			&& i_208_ < i_202_)
			((Class103_Sub2) this).anIntArray9245[i_209_ + i_205_]
			    = i_200_;
		    i_209_++;
		    i_208_ = ++i_208_ % i_207_;
		}
	    } else if (i_201_ == 1) {
		i_200_ = ((i_206_ << 24)
			  + ((i_206_ * (i_200_ & 0xff00ff) >> 8 & 0xff00ff)
			     + (i_206_ * (i_200_ & 0xff00) >> 8 & 0xff00)));
		int i_210_ = 256 - i_206_;
		int i_211_ = 0;
		while (i_211_ < i_199_) {
		    if ((i_211_ + i
			 >= ((Class103_Sub2) this).anInt9249 * 1298750001)
			&& (i_211_ + i
			    < 325436811 * ((Class103_Sub2) this).anInt9250)
			&& i_208_ < i_202_) {
			int i_212_ = (((Class103_Sub2) this).anIntArray9245
				      [i_205_ + i_211_]);
			i_212_ = ((i_210_ * (i_212_ & 0xff00) >> 8 & 0xff00)
				  + ((i_212_ & 0xff00ff) * i_210_ >> 8
				     & 0xff00ff));
			((Class103_Sub2) this).anIntArray9245[i_205_ + i_211_]
			    = i_212_ + i_200_;
		    }
		    i_211_++;
		    i_208_ = ++i_208_ % i_207_;
		}
	    } else if (i_201_ == 2) {
		int i_213_ = 0;
		while (i_213_ < i_199_) {
		    if ((i_213_ + i
			 >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			&& (i + i_213_
			    < 325436811 * ((Class103_Sub2) this).anInt9250)
			&& i_208_ < i_202_) {
			int i_214_ = (((Class103_Sub2) this).anIntArray9245
				      [i_213_ + i_205_]);
			int i_215_ = i_214_ + i_200_;
			int i_216_ = (i_200_ & 0xff00ff) + (i_214_ & 0xff00ff);
			i_214_ = (i_215_ - i_216_ & 0x10000) + (i_216_
								& 0x1000100);
			((Class103_Sub2) this).anIntArray9245[i_205_ + i_213_]
			    = i_215_ - i_214_ | i_214_ - (i_214_ >>> 8);
		    }
		    i_213_++;
		    i_208_ = ++i_208_ % i_207_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method2273(int i, int i_217_, int i_218_, int i_219_, int i_220_) {
	if (((Class103_Sub2) this).anIntArray9245 != null
	    && (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
		&& i < ((Class103_Sub2) this).anInt9250 * 325436811)) {
	    if (i_217_ < -788450385 * ((Class103_Sub2) this).anInt9254) {
		i_218_
		    -= ((Class103_Sub2) this).anInt9254 * -788450385 - i_217_;
		i_217_ = -788450385 * ((Class103_Sub2) this).anInt9254;
	    }
	    if (i_218_ + i_217_
		> ((Class103_Sub2) this).anInt9252 * 1546170165)
		i_218_
		    = ((Class103_Sub2) this).anInt9252 * 1546170165 - i_217_;
	    int i_221_
		= -1826993761 * ((Class103_Sub2) this).anInt9260 * i_217_ + i;
	    int i_222_ = i_219_ >>> 24;
	    if (0 == i_220_ || i_220_ == 1 && i_222_ == 255) {
		for (int i_223_ = 0; i_223_ < i_218_; i_223_++)
		    ((Class103_Sub2) this).anIntArray9245
			[i_221_ + (((Class103_Sub2) this).anInt9260
				   * -1826993761 * i_223_)]
			= i_219_;
	    } else if (1 == i_220_) {
		i_219_ = (((i_219_ & 0xff00ff) * i_222_ >> 8 & 0xff00ff)
			  + (i_222_ * (i_219_ & 0xff00) >> 8 & 0xff00)
			  + (i_222_ << 24));
		int i_224_ = 256 - i_222_;
		for (int i_225_ = 0; i_225_ < i_218_; i_225_++) {
		    int i_226_ = i_221_ + (-1826993761
					   * ((Class103_Sub2) this).anInt9260
					   * i_225_);
		    int i_227_ = ((Class103_Sub2) this).anIntArray9245[i_226_];
		    i_227_ = ((i_224_ * (i_227_ & 0xff00ff) >> 8 & 0xff00ff)
			      + ((i_227_ & 0xff00) * i_224_ >> 8 & 0xff00));
		    ((Class103_Sub2) this).anIntArray9245[i_226_]
			= i_219_ + i_227_;
		}
	    } else if (i_220_ == 2) {
		for (int i_228_ = 0; i_228_ < i_218_; i_228_++) {
		    int i_229_ = ((-1826993761
				   * ((Class103_Sub2) this).anInt9260 * i_228_)
				  + i_221_);
		    int i_230_ = ((Class103_Sub2) this).anIntArray9245[i_229_];
		    int i_231_ = i_230_ + i_219_;
		    int i_232_ = (i_219_ & 0xff00ff) + (i_230_ & 0xff00ff);
		    i_230_
			= (i_232_ & 0x1000100) + (i_231_ - i_232_ & 0x10000);
		    ((Class103_Sub2) this).anIntArray9245[i_229_]
			= i_231_ - i_230_ | i_230_ - (i_230_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2535(boolean bool) {
	Class189 class189 = method15377(Thread.currentThread());
	((Class189) class189).aBool2220 = bool;
    }
    
    public void method2274(int i, int i_233_, int i_234_, int i_235_,
			   int i_236_, int i_237_) {
	if (((Class103_Sub2) this).anIntArray9245 != null) {
	    i_234_ -= i;
	    i_235_ -= i_233_;
	    if (0 == i_235_) {
		if (i_234_ >= 0)
		    method2272(i, i_233_, 1 + i_234_, i_236_, i_237_);
		else
		    method2272(i_234_ + i, i_233_, 1 + -i_234_, i_236_,
			       i_237_);
	    } else if (i_234_ == 0) {
		if (i_235_ >= 0)
		    method2273(i, i_233_, i_235_ + 1, i_236_, i_237_);
		else
		    method2273(i, i_233_ + i_235_, 1 + -i_235_, i_236_,
			       i_237_);
	    } else {
		if (i_234_ + i_235_ < 0) {
		    i += i_234_;
		    i_234_ = -i_234_;
		    i_233_ += i_235_;
		    i_235_ = -i_235_;
		}
		if (i_234_ > i_235_) {
		    i_233_ <<= 16;
		    i_233_ += 32768;
		    i_235_ <<= 16;
		    int i_238_ = (int) Math.floor(0.5 + ((double) i_235_
							 / (double) i_234_));
		    i_234_ += i;
		    if (i < 1298750001 * ((Class103_Sub2) this).anInt9249) {
			i_233_ += i_238_ * ((((Class103_Sub2) this).anInt9249
					     * 1298750001)
					    - i);
			i = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    }
		    if (i_234_ >= 325436811 * ((Class103_Sub2) this).anInt9250)
			i_234_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_239_ = i_236_ >>> 24;
		    if (0 == i_237_ || i_237_ == 1 && i_239_ == 255) {
			for (/**/; i <= i_234_; i++) {
			    int i_240_ = i_233_ >> 16;
			    if (i_240_ >= (((Class103_Sub2) this).anInt9254
					   * -788450385)
				&& i_240_ < 1546170165 * ((Class103_Sub2)
							  this).anInt9252)
				((Class103_Sub2) this).anIntArray9245
				    [(((Class103_Sub2) this).anInt9260
				      * -1826993761 * i_240_) + i]
				    = i_236_;
			    i_233_ += i_238_;
			}
		    } else if (1 == i_237_) {
			i_236_ = ((i_239_ << 24)
				  + ((i_239_ * (i_236_ & 0xff00) >> 8 & 0xff00)
				     + (i_239_ * (i_236_ & 0xff00ff) >> 8
					& 0xff00ff)));
			int i_241_ = 256 - i_239_;
			for (/**/; i <= i_234_; i++) {
			    int i_242_ = i_233_ >> 16;
			    if (i_242_ >= (-788450385
					   * ((Class103_Sub2) this).anInt9254)
				&& i_242_ < 1546170165 * ((Class103_Sub2)
							  this).anInt9252) {
				int i_243_ = ((((Class103_Sub2) this).anInt9260
					       * -1826993761 * i_242_)
					      + i);
				int i_244_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_243_]);
				i_244_ = (((i_244_ & 0xff00) * i_241_ >> 8
					   & 0xff00)
					  + (i_241_ * (i_244_ & 0xff00ff) >> 8
					     & 0xff00ff));
				((Class103_Sub2) this).anIntArray9245[i_243_]
				    = i_236_ + i_244_;
			    }
			    i_233_ += i_238_;
			}
		    } else if (2 == i_237_) {
			for (/**/; i <= i_234_; i++) {
			    int i_245_ = i_233_ >> 16;
			    if (i_245_ >= (((Class103_Sub2) this).anInt9254
					   * -788450385)
				&& i_245_ < 1546170165 * ((Class103_Sub2)
							  this).anInt9252) {
				int i_246_
				    = i + i_245_ * (-1826993761
						    * (((Class103_Sub2) this)
						       .anInt9260));
				int i_247_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_246_]);
				int i_248_ = i_236_ + i_247_;
				int i_249_ = ((i_247_ & 0xff00ff)
					      + (i_236_ & 0xff00ff));
				i_247_
				    = (i_249_ & 0x1000100) + (i_248_ - i_249_
							      & 0x10000);
				((Class103_Sub2) this).anIntArray9245[i_246_]
				    = i_248_ - i_247_ | i_247_ - (i_247_
								  >>> 8);
			    }
			    i_233_ += i_238_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_234_ <<= 16;
		    int i_250_ = (int) Math.floor(0.5 + ((double) i_234_
							 / (double) i_235_));
		    i_235_ += i_233_;
		    if (i_233_
			< -788450385 * ((Class103_Sub2) this).anInt9254) {
			i += (i_250_
			      * (((Class103_Sub2) this).anInt9254 * -788450385
				 - i_233_));
			i_233_ = -788450385 * ((Class103_Sub2) this).anInt9254;
		    }
		    if (i_235_
			>= 1546170165 * ((Class103_Sub2) this).anInt9252)
			i_235_ = (((Class103_Sub2) this).anInt9252 * 1546170165
				  - 1);
		    int i_251_ = i_236_ >>> 24;
		    if (0 == i_237_ || i_237_ == 1 && 255 == i_251_) {
			for (/**/; i_233_ <= i_235_; i_233_++) {
			    int i_252_ = i >> 16;
			    if (i_252_ >= (1298750001
					   * ((Class103_Sub2) this).anInt9249)
				&& i_252_ < 325436811 * (((Class103_Sub2) this)
							 .anInt9250))
				((Class103_Sub2) this).anIntArray9245
				    [(((Class103_Sub2) this).anInt9260
				      * -1826993761 * i_233_) + i_252_]
				    = i_236_;
			    i += i_250_;
			}
		    } else if (1 == i_237_) {
			i_236_
			    = (((i_236_ & 0xff00ff) * i_251_ >> 8 & 0xff00ff)
			       + ((i_236_ & 0xff00) * i_251_ >> 8 & 0xff00)
			       + (i_251_ << 24));
			int i_253_ = 256 - i_251_;
			for (/**/; i_233_ <= i_235_; i_233_++) {
			    int i_254_ = i >> 16;
			    if (i_254_ >= (((Class103_Sub2) this).anInt9249
					   * 1298750001)
				&& i_254_ < 325436811 * (((Class103_Sub2) this)
							 .anInt9250)) {
				int i_255_
				    = ((i_233_
					* (-1826993761
					   * ((Class103_Sub2) this).anInt9260))
				       + i_254_);
				int i_256_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_255_]);
				i_256_ = (((i_256_ & 0xff00) * i_253_ >> 8
					   & 0xff00)
					  + ((i_256_ & 0xff00ff) * i_253_ >> 8
					     & 0xff00ff));
				((Class103_Sub2) this).anIntArray9245
				    [(((Class103_Sub2) this).anInt9260
				      * -1826993761 * i_233_) + i_254_]
				    = i_256_ + i_236_;
			    }
			    i += i_250_;
			}
		    } else if (i_237_ == 2) {
			for (/**/; i_233_ <= i_235_; i_233_++) {
			    int i_257_ = i >> 16;
			    if (i_257_ >= (((Class103_Sub2) this).anInt9249
					   * 1298750001)
				&& i_257_ < (((Class103_Sub2) this).anInt9250
					     * 325436811)) {
				int i_258_
				    = ((i_233_
					* (-1826993761
					   * ((Class103_Sub2) this).anInt9260))
				       + i_257_);
				int i_259_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_258_]);
				int i_260_ = i_236_ + i_259_;
				int i_261_ = ((i_236_ & 0xff00ff)
					      + (i_259_ & 0xff00ff));
				i_259_
				    = (i_261_ & 0x1000100) + (i_260_ - i_261_
							      & 0x10000);
				((Class103_Sub2) this).anIntArray9245[i_258_]
				    = i_260_ - i_259_ | i_259_ - (i_259_
								  >>> 8);
			    }
			    i += i_250_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method2276(int i, int i_262_, int i_263_, int i_264_,
			   int i_265_, int i_266_, int i_267_, int i_268_,
			   int i_269_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    i_263_ -= i;
	    i_264_ -= i_262_;
	    if (i_264_ == 0) {
		if (i_263_ >= 0)
		    method15373(i, i_262_, 1 + i_263_, i_265_, i_266_, i_267_,
				i_268_, i_269_);
		else {
		    int i_270_ = i_268_ + i_267_;
		    i_269_ %= i_270_;
		    i_269_ = i_267_ + i_270_ - i_269_ - (1 + -i_263_) % i_270_;
		    i_269_ %= i_270_;
		    if (i_269_ < 0)
			i_269_ += i_270_;
		    method15373(i + i_263_, i_262_, 1 + -i_263_, i_265_,
				i_266_, i_267_, i_268_, i_269_);
		}
	    } else if (i_263_ == 0) {
		if (i_264_ >= 0)
		    method15426(i, i_262_, i_264_ + 1, i_265_, i_266_, i_267_,
				i_268_, i_269_);
		else {
		    int i_271_ = i_267_ + i_268_;
		    i_269_ %= i_271_;
		    i_269_ = i_267_ + i_271_ - i_269_ - (1 + -i_264_) % i_271_;
		    i_269_ %= i_271_;
		    if (i_269_ < 0)
			i_269_ += i_271_;
		    method15426(i, i_262_ + i_264_, 1 + -i_264_, i_265_,
				i_266_, i_267_, i_268_, i_269_);
		}
	    } else {
		i_269_ <<= 8;
		i_267_ <<= 8;
		i_268_ <<= 8;
		int i_272_ = i_267_ + i_268_;
		i_269_ %= i_272_;
		if (i_263_ + i_264_ < 0) {
		    int i_273_ = (int) (Math.sqrt((double) (i_263_ * i_263_
							    + i_264_ * i_264_))
					* 256.0);
		    int i_274_ = i_273_ % i_272_;
		    i_269_ = i_267_ + i_272_ - i_269_ - i_274_;
		    i_269_ %= i_272_;
		    if (i_269_ < 0)
			i_269_ += i_272_;
		    i += i_263_;
		    i_263_ = -i_263_;
		    i_262_ += i_264_;
		    i_264_ = -i_264_;
		}
		if (i_263_ > i_264_) {
		    i_262_ <<= 16;
		    i_262_ += 32768;
		    i_264_ <<= 16;
		    int i_275_ = (int) Math.floor(0.5 + ((double) i_264_
							 / (double) i_263_));
		    i_263_ += i;
		    int i_276_ = i_265_ >>> 24;
		    int i_277_
			= (int) Math.sqrt((double) (65536
						    + (i_275_ >> 8) * (i_275_
								       >> 8)));
		    if (0 == i_266_ || i_266_ == 1 && i_276_ == 255) {
			while (i <= i_263_) {
			    int i_278_ = i_262_ >> 16;
			    if (i >= (1298750001
				      * ((Class103_Sub2) this).anInt9249)
				&& i < (((Class103_Sub2) this).anInt9250
					* 325436811)
				&& i_278_ >= -788450385 * ((Class103_Sub2)
							   this).anInt9254
				&& i_278_ < 1546170165 * ((Class103_Sub2)
							  this).anInt9252
				&& i_269_ < i_267_)
				((Class103_Sub2) this).anIntArray9245
				    [i_278_ * (-1826993761
					       * (((Class103_Sub2) this)
						  .anInt9260)) + i]
				    = i_265_;
			    i_262_ += i_275_;
			    i++;
			    i_269_ += i_277_;
			    i_269_ %= i_272_;
			}
		    } else if (1 == i_266_) {
			i_265_
			    = ((i_276_ * (i_265_ & 0xff00) >> 8 & 0xff00)
			       + (i_276_ * (i_265_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_276_ << 24));
			int i_279_ = 256 - i_276_;
			while (i <= i_263_) {
			    int i_280_ = i_262_ >> 16;
			    if (i >= (1298750001
				      * ((Class103_Sub2) this).anInt9249)
				&& i < (325436811
					* ((Class103_Sub2) this).anInt9250)
				&& i_280_ >= -788450385 * ((Class103_Sub2)
							   this).anInt9254
				&& i_280_ < (((Class103_Sub2) this).anInt9252
					     * 1546170165)
				&& i_269_ < i_267_) {
				int i_281_
				    = ((i_280_
					* (-1826993761
					   * ((Class103_Sub2) this).anInt9260))
				       + i);
				int i_282_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_281_]);
				i_282_ = ((i_279_ * (i_282_ & 0xff00ff) >> 8
					   & 0xff00ff)
					  + ((i_282_ & 0xff00) * i_279_ >> 8
					     & 0xff00));
				((Class103_Sub2) this).anIntArray9245[i_281_]
				    = i_282_ + i_265_;
			    }
			    i_262_ += i_275_;
			    i++;
			    i_269_ += i_277_;
			    i_269_ %= i_272_;
			}
		    } else if (2 == i_266_) {
			while (i <= i_263_) {
			    int i_283_ = i_262_ >> 16;
			    if (i >= (1298750001
				      * ((Class103_Sub2) this).anInt9249)
				&& i < (((Class103_Sub2) this).anInt9250
					* 325436811)
				&& i_283_ >= (((Class103_Sub2) this).anInt9254
					      * -788450385)
				&& i_283_ < 1546170165 * ((Class103_Sub2)
							  this).anInt9252
				&& i_269_ < i_267_) {
				int i_284_
				    = i + (-1826993761
					   * ((Class103_Sub2) this).anInt9260
					   * i_283_);
				int i_285_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_284_]);
				int i_286_ = i_285_ + i_265_;
				int i_287_ = ((i_285_ & 0xff00ff)
					      + (i_265_ & 0xff00ff));
				i_285_ = ((i_286_ - i_287_ & 0x10000)
					  + (i_287_ & 0x1000100));
				((Class103_Sub2) this).anIntArray9245[i_284_]
				    = i_286_ - i_285_ | i_285_ - (i_285_
								  >>> 8);
			    }
			    i_262_ += i_275_;
			    i++;
			    i_269_ += i_277_;
			    i_269_ %= i_272_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_263_ <<= 16;
		    int i_288_ = (int) Math.floor(0.5 + ((double) i_263_
							 / (double) i_264_));
		    i_264_ += i_262_;
		    int i_289_ = i_265_ >>> 24;
		    int i_290_
			= (int) Math.sqrt((double) (65536
						    + (i_288_ >> 8) * (i_288_
								       >> 8)));
		    if (i_266_ == 0 || i_266_ == 1 && i_289_ == 255) {
			while (i_262_ <= i_264_) {
			    int i_291_ = i >> 16;
			    if (i_262_ >= (-788450385
					   * ((Class103_Sub2) this).anInt9254)
				&& i_262_ < (((Class103_Sub2) this).anInt9252
					     * 1546170165)
				&& i_291_ >= 1298750001 * ((Class103_Sub2)
							   this).anInt9249
				&& i_291_ < (((Class103_Sub2) this).anInt9250
					     * 325436811)
				&& i_269_ < i_267_)
				((Class103_Sub2) this).anIntArray9245
				    [(i_291_
				      + (-1826993761
					 * ((Class103_Sub2) this).anInt9260
					 * i_262_))]
				    = i_265_;
			    i += i_288_;
			    i_262_++;
			    i_269_ += i_290_;
			    i_269_ %= i_272_;
			}
		    } else if (i_266_ == 1) {
			i_265_
			    = ((i_289_ * (i_265_ & 0xff00) >> 8 & 0xff00)
			       + (i_289_ * (i_265_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_289_ << 24));
			int i_292_ = 256 - i_289_;
			while (i_262_ <= i_264_) {
			    int i_293_ = i >> 16;
			    if (i_262_ >= (-788450385
					   * ((Class103_Sub2) this).anInt9254)
				&& i_262_ < (((Class103_Sub2) this).anInt9252
					     * 1546170165)
				&& i_293_ >= 1298750001 * ((Class103_Sub2)
							   this).anInt9249
				&& i_293_ < (((Class103_Sub2) this).anInt9250
					     * 325436811)
				&& i_269_ < i_267_) {
				int i_294_
				    = (i_293_
				       + (((Class103_Sub2) this).anInt9260
					  * -1826993761 * i_262_));
				int i_295_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_294_]);
				i_295_ = (((i_295_ & 0xff00ff) * i_292_ >> 8
					   & 0xff00ff)
					  + (i_292_ * (i_295_ & 0xff00) >> 8
					     & 0xff00));
				((Class103_Sub2) this).anIntArray9245
				    [i_262_ * (((Class103_Sub2) this).anInt9260
					       * -1826993761) + i_293_]
				    = i_295_ + i_265_;
			    }
			    i += i_288_;
			    i_262_++;
			    i_269_ += i_290_;
			    i_269_ %= i_272_;
			}
		    } else if (2 == i_266_) {
			while (i_262_ <= i_264_) {
			    int i_296_ = i >> 16;
			    if (i_262_ >= (-788450385
					   * ((Class103_Sub2) this).anInt9254)
				&& i_262_ < 1546170165 * ((Class103_Sub2)
							  this).anInt9252
				&& i_296_ >= 1298750001 * ((Class103_Sub2)
							   this).anInt9249
				&& i_296_ < (((Class103_Sub2) this).anInt9250
					     * 325436811)
				&& i_269_ < i_267_) {
				int i_297_
				    = (i_296_
				       + i_262_ * (-1826993761
						   * (((Class103_Sub2) this)
						      .anInt9260)));
				int i_298_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_297_]);
				int i_299_ = i_298_ + i_265_;
				int i_300_ = ((i_298_ & 0xff00ff)
					      + (i_265_ & 0xff00ff));
				i_298_ = ((i_299_ - i_300_ & 0x10000)
					  + (i_300_ & 0x1000100));
				((Class103_Sub2) this).anIntArray9245[i_297_]
				    = i_299_ - i_298_ | i_298_ - (i_298_
								  >>> 8);
			    }
			    i += i_288_;
			    i_262_++;
			    i_269_ += i_290_;
			    i_269_ %= i_272_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method2380(int i, int i_301_, int i_302_, int i_303_,
			   int i_304_, int i_305_, Class135 class135,
			   int i_306_, int i_307_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    int[] is = ((Class135_Sub1) class135_sub1).anIntArray9874;
	    int[] is_308_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	    int i_309_
		= (((Class103_Sub2) this).anInt9254 * -788450385 > i_307_
		   ? ((Class103_Sub2) this).anInt9254 * -788450385 : i_307_);
	    int i_310_ = ((((Class103_Sub2) this).anInt9252 * 1546170165
			   < is.length + i_307_)
			  ? 1546170165 * ((Class103_Sub2) this).anInt9252
			  : i_307_ + is.length);
	    i_302_ -= i;
	    i_303_ -= i_301_;
	    if (i_303_ + i_302_ < 0) {
		i += i_302_;
		i_302_ = -i_302_;
		i_301_ += i_303_;
		i_303_ = -i_303_;
	    }
	    if (i_302_ > i_303_) {
		i_301_ <<= 16;
		i_301_ += 32768;
		i_303_ <<= 16;
		int i_311_ = (int) Math.floor((double) i_303_ / (double) i_302_
					      + 0.5);
		i_302_ += i;
		if (i < 1298750001 * ((Class103_Sub2) this).anInt9249) {
		    i_301_ += (((Class103_Sub2) this).anInt9249 * 1298750001
			       - i) * i_311_;
		    i = ((Class103_Sub2) this).anInt9249 * 1298750001;
		}
		if (i_302_ >= 325436811 * ((Class103_Sub2) this).anInt9250)
		    i_302_ = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		int i_312_ = i_304_ >>> 24;
		if (i_305_ == 0 || 1 == i_305_ && 255 == i_312_) {
		    for (/**/; i <= i_302_; i++) {
			int i_313_ = i_301_ >> 16;
			int i_314_ = i_313_ - i_307_;
			if (i_313_ >= i_309_ && i_313_ < i_310_) {
			    int i_315_ = i_306_ + is[i_314_];
			    if (i >= i_315_ && i < is_308_[i_314_] + i_315_)
				((Class103_Sub2) this).anIntArray9245
				    [i + i_313_ * (-1826993761
						   * (((Class103_Sub2) this)
						      .anInt9260))]
				    = i_304_;
			}
			i_301_ += i_311_;
		    }
		} else if (1 == i_305_) {
		    i_304_ = ((i_312_ * (i_304_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_312_ * (i_304_ & 0xff00) >> 8 & 0xff00)
			      + (i_312_ << 24));
		    int i_316_ = 256 - i_312_;
		    for (/**/; i <= i_302_; i++) {
			int i_317_ = i_301_ >> 16;
			int i_318_ = i_317_ - i_307_;
			if (i_317_ >= i_309_ && i_317_ < i_310_) {
			    int i_319_ = is[i_318_] + i_306_;
			    if (i >= i_319_ && i < i_319_ + is_308_[i_318_]) {
				int i_320_
				    = ((-1826993761
					* ((Class103_Sub2) this).anInt9260
					* i_317_)
				       + i);
				int i_321_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_320_]);
				i_321_ = ((i_316_ * (i_321_ & 0xff00ff) >> 8
					   & 0xff00ff)
					  + ((i_321_ & 0xff00) * i_316_ >> 8
					     & 0xff00));
				((Class103_Sub2) this).anIntArray9245[i_320_]
				    = i_321_ + i_304_;
			    }
			}
			i_301_ += i_311_;
		    }
		} else if (i_305_ == 2) {
		    for (/**/; i <= i_302_; i++) {
			int i_322_ = i_301_ >> 16;
			int i_323_ = i_322_ - i_307_;
			if (i_322_ >= i_309_ && i_322_ < i_310_) {
			    int i_324_ = is[i_323_] + i_306_;
			    if (i >= i_324_ && i < is_308_[i_323_] + i_324_) {
				int i_325_ = ((((Class103_Sub2) this).anInt9260
					       * -1826993761 * i_322_)
					      + i);
				int i_326_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_325_]);
				int i_327_ = i_304_ + i_326_;
				int i_328_ = ((i_304_ & 0xff00ff)
					      + (i_326_ & 0xff00ff));
				i_326_ = ((i_327_ - i_328_ & 0x10000)
					  + (i_328_ & 0x1000100));
				((Class103_Sub2) this).anIntArray9245[i_325_]
				    = i_327_ - i_326_ | i_326_ - (i_326_
								  >>> 8);
			    }
			}
			i_301_ += i_311_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_302_ <<= 16;
		int i_329_ = (int) Math.floor(0.5 + ((double) i_302_
						     / (double) i_303_));
		i_303_ += i_301_;
		if (i_301_ < i_309_) {
		    i += (i_309_ - i_301_) * i_329_;
		    i_301_ = i_309_;
		}
		if (i_303_ >= i_310_)
		    i_303_ = i_310_ - 1;
		int i_330_ = i_304_ >>> 24;
		if (i_305_ == 0 || i_305_ == 1 && 255 == i_330_) {
		    for (/**/; i_301_ <= i_303_; i_301_++) {
			int i_331_ = i >> 16;
			int i_332_ = i_301_ - i_307_;
			int i_333_ = i_306_ + is[i_332_];
			if ((i_331_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_331_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_331_ >= i_333_
			    && i_331_ < is_308_[i_332_] + i_333_)
			    ((Class103_Sub2) this).anIntArray9245
				[(i_331_
				  + i_301_ * (((Class103_Sub2) this).anInt9260
					      * -1826993761))]
				= i_304_;
			i += i_329_;
		    }
		} else if (1 == i_305_) {
		    i_304_ = ((i_330_ << 24)
			      + (((i_304_ & 0xff00) * i_330_ >> 8 & 0xff00)
				 + ((i_304_ & 0xff00ff) * i_330_ >> 8
				    & 0xff00ff)));
		    int i_334_ = 256 - i_330_;
		    for (/**/; i_301_ <= i_303_; i_301_++) {
			int i_335_ = i >> 16;
			int i_336_ = i_301_ - i_307_;
			int i_337_ = i_306_ + is[i_336_];
			if ((i_335_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_335_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_335_ >= i_337_
			    && i_335_ < i_337_ + is_308_[i_336_]) {
			    int i_338_
				= i_335_ + i_301_ * (-1826993761
						     * (((Class103_Sub2) this)
							.anInt9260));
			    int i_339_ = (((Class103_Sub2) this).anIntArray9245
					  [i_338_]);
			    i_339_ = (((i_339_ & 0xff00ff) * i_334_ >> 8
				       & 0xff00ff)
				      + ((i_339_ & 0xff00) * i_334_ >> 8
					 & 0xff00));
			    ((Class103_Sub2) this).anIntArray9245
				[i_301_ * (((Class103_Sub2) this).anInt9260
					   * -1826993761) + i_335_]
				= i_304_ + i_339_;
			}
			i += i_329_;
		    }
		} else if (i_305_ == 2) {
		    for (/**/; i_301_ <= i_303_; i_301_++) {
			int i_340_ = i >> 16;
			int i_341_ = i_301_ - i_307_;
			int i_342_ = is[i_341_] + i_306_;
			if ((i_340_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_340_
				< ((Class103_Sub2) this).anInt9250 * 325436811)
			    && i_340_ >= i_342_
			    && i_340_ < i_342_ + is_308_[i_341_]) {
			    int i_343_
				= (i_340_
				   + i_301_ * (((Class103_Sub2) this).anInt9260
					       * -1826993761));
			    int i_344_ = (((Class103_Sub2) this).anIntArray9245
					  [i_343_]);
			    int i_345_ = i_304_ + i_344_;
			    int i_346_
				= (i_344_ & 0xff00ff) + (i_304_ & 0xff00ff);
			    i_344_
				= (i_345_ - i_346_ & 0x10000) + (i_346_
								 & 0x1000100);
			    ((Class103_Sub2) this).anIntArray9245[i_343_]
				= i_345_ - i_344_ | i_344_ - (i_344_ >>> 8);
			}
			i += i_329_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    int method15374(int i) {
	return aClass107_1458.method2680(i, -1154990064).anInt1406 * 608905203;
    }
    
    public void method2278(int i, int i_347_, int i_348_, int i_349_,
			   int i_350_, int i_351_, int i_352_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class189 class189 = method15377(Thread.currentThread());
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    int i_353_ = i_348_ - i;
	    int i_354_ = i_349_ - i_347_;
	    int i_355_ = i_353_ >= 0 ? i_353_ : -i_353_;
	    int i_356_ = i_354_ >= 0 ? i_354_ : -i_354_;
	    int i_357_ = i_355_;
	    if (i_357_ < i_356_)
		i_357_ = i_356_;
	    if (0 != i_357_) {
		int i_358_ = (i_353_ << 16) / i_357_;
		int i_359_ = (i_354_ << 16) / i_357_;
		i_353_ += i_358_ >> 16;
		i_354_ += i_359_ >> 16;
		if (i_359_ <= i_358_)
		    i_358_ = -i_358_;
		else
		    i_359_ = -i_359_;
		int i_360_ = i_351_ * i_359_ >> 17;
		int i_361_ = 1 + i_351_ * i_359_ >> 17;
		int i_362_ = i_351_ * i_358_ >> 17;
		int i_363_ = i_358_ * i_351_ + 1 >> 17;
		i -= class155.method3344();
		i_347_ -= class155.method3371();
		int i_364_ = i_360_ + i;
		int i_365_ = i - i_361_;
		int i_366_ = i + i_353_ - i_361_;
		int i_367_ = i_360_ + (i + i_353_);
		int i_368_ = i_362_ + i_347_;
		int i_369_ = i_347_ - i_363_;
		int i_370_ = i_347_ + i_354_ - i_363_;
		int i_371_ = i_354_ + i_347_ + i_362_;
		if (0 == i_352_)
		    ((Class155) class155).anInt1723 = 0;
		else if (1 == i_352_)
		    ((Class155) class155).anInt1723 = 255 - (i_350_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method2308(false);
		((Class155) class155).aBool1748
		    = (i_364_ < 0 || i_364_ > ((Class155) class155).anInt1733
		       || i_365_ < 0
		       || i_365_ > ((Class155) class155).anInt1733
		       || i_366_ < 0
		       || i_366_ > ((Class155) class155).anInt1733);
		class155.method3377(true, false, false, (float) i_368_,
				    (float) i_369_, (float) i_370_,
				    (float) i_364_, (float) i_365_,
				    (float) i_366_, 100.0F, 100.0F, 100.0F,
				    i_350_);
		((Class155) class155).aBool1748
		    = (i_364_ < 0 || i_364_ > ((Class155) class155).anInt1733
		       || i_366_ < 0
		       || i_366_ > ((Class155) class155).anInt1733
		       || i_367_ < 0
		       || i_367_ > ((Class155) class155).anInt1733);
		class155.method3377(true, false, false, (float) i_368_,
				    (float) i_370_, (float) i_371_,
				    (float) i_364_, (float) i_366_,
				    (float) i_367_, 100.0F, 100.0F, 100.0F,
				    i_350_);
		method2308(true);
	    }
	}
    }
    
    public int method2412(int i, int i_372_, int i_373_, int i_374_,
			  int i_375_, int i_376_) {
	int i_377_ = 0;
	float f
	    = (((float) i_373_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[2]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[6]
		     * (float) i_372_)));
	float f_378_
	    = (((float) i_376_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (float) i_374_ * (((Class103_Sub2) this).aClass268_9262
				      .aFloatArray4353[2])
		  + (float) i_375_ * (((Class103_Sub2) this).aClass268_9262
				      .aFloatArray4353[6])));
	float f_379_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + ((float) i
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7]
		  * (float) i_372_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		  * (float) i_373_));
	float f_380_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		* (float) i_376_)
	       + (((float) i_374_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
		  + (float) i_375_ * (((Class103_Sub2) this).aClass268_9262
				      .aFloatArray4353[7])));
	if (f < -f_379_ && f_378_ < -f_380_)
	    i_377_ |= 0x10;
	else if (f > f_379_ && f_378_ > f_380_)
	    i_377_ |= 0x20;
	float f_381_
	    = (((float) i_373_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8])
	       + (((float) i_372_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[0]
		      * (float) i)
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[12]))));
	float f_382_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		* (float) i_376_)
	       + (((float) i_375_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[12]
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[0]) * (float) i_374_)));
	if (f_381_ < -f_379_ && f_382_ < -f_380_)
	    i_377_ |= 0x1;
	if (f_381_ > f_379_ && f_382_ > f_380_)
	    i_377_ |= 0x2;
	float f_383_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]
		* (float) i_373_)
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		     * (float) i_372_)));
	float f_384_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
	       + ((float) i_374_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		  * (float) i_375_)
	       + ((float) i_376_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]));
	if (f_383_ < -f_379_ && f_384_ < -f_380_)
	    i_377_ |= 0x4;
	if (f_383_ > f_379_ && f_384_ > f_380_)
	    i_377_ |= 0x8;
	return i_377_;
    }
    
    public Class168 method2496(Class108 class108, boolean bool) {
	int i = class108.method2698();
	int i_385_ = class108.method2694();
	Class168_Sub2 class168_sub2;
	if (bool && !class108.method2692() && class108.method2691()) {
	    Class108_Sub2 class108_sub2 = (Class108_Sub2) class108;
	    int[] is = new int[class108_sub2.anIntArray9308.length];
	    byte[] is_386_ = new byte[i * i_385_];
	    for (int i_387_ = 0; i_387_ < i_385_; i_387_++) {
		int i_388_ = i * i_387_;
		for (int i_389_ = 0; i_389_ < i; i_389_++)
		    is_386_[i_388_ + i_389_]
			= class108_sub2.aByteArray9309[i_388_ + i_389_];
	    }
	    for (int i_390_ = 0; i_390_ < class108_sub2.anIntArray9308.length;
		 i_390_++)
		is[i_390_] = class108_sub2.anIntArray9308[i_390_];
	    class168_sub2
		= new Class168_Sub2_Sub3(this, is_386_, is, i, i_385_);
	} else {
	    int[] is = class108.method2707(false);
	    if (class108.method2692())
		class168_sub2 = new Class168_Sub2_Sub2(this, is, i, i_385_);
	    else
		class168_sub2 = new Class168_Sub2_Sub1(this, is, i, i_385_);
	}
	class168_sub2.method3602(class108.method2695(), class108.method2697(),
				 class108.method2696(), class108.method2742());
	return class168_sub2;
    }
    
    public void method2282(Class266 class266, Class97 class97,
			   Class272 class272) {
	Class268 class268 = method2226();
	class268.method5203(class266);
	class268.method5202(((Class103_Sub2) this).aClass268_9262);
	class97.method2172(class272, ((Class103_Sub2) this).aClass268_9261,
			   class268, ((Class103_Sub2) this).aFloat9277,
			   ((Class103_Sub2) this).aFloat9271,
			   ((Class103_Sub2) this).aFloat9268,
			   ((Class103_Sub2) this).aFloat9270);
    }
    
    public Class241_Sub47 method2283(int i) {
	return null;
    }
    
    public void method2228(Class241_Sub47 class241_sub47) {
	/* empty */
    }
    
    public void method2254(int i, int i_391_, int i_392_, int i_393_) {
	((Class103_Sub2) this).anInt9264 = i * -581464337;
	((Class103_Sub2) this).anInt9265 = i_391_ * 495728313;
	((Class103_Sub2) this).anInt9251 = i_392_ * -2006377139;
	((Class103_Sub2) this).anInt9267 = 1153843425 * i_393_;
	method15372();
    }
    
    public Class168 method2287(int[] is, int i, int i_394_, int i_395_,
			       int i_396_, boolean bool) {
	boolean bool_397_ = false;
	int i_398_ = i;
    while_99_:
	for (int i_399_ = 0; i_399_ < i_396_; i_399_++) {
	    for (int i_400_ = 0; i_400_ < i_395_; i_400_++) {
		int i_401_ = is[i_398_++] >>> 24;
		if (0 != i_401_ && i_401_ != 255) {
		    bool_397_ = true;
		    break while_99_;
		}
	    }
	}
	if (bool_397_)
	    return new Class168_Sub2_Sub2(this, is, i, i_394_, i_395_, i_396_,
					  bool);
	return new Class168_Sub2_Sub1(this, is, i, i_394_, i_395_, i_396_,
				      bool);
    }
    
    public Class168 method2289(Class108 class108, boolean bool) {
	int i = class108.method2698();
	int i_402_ = class108.method2694();
	Class168_Sub2 class168_sub2;
	if (bool && !class108.method2692() && class108.method2691()) {
	    Class108_Sub2 class108_sub2 = (Class108_Sub2) class108;
	    int[] is = new int[class108_sub2.anIntArray9308.length];
	    byte[] is_403_ = new byte[i * i_402_];
	    for (int i_404_ = 0; i_404_ < i_402_; i_404_++) {
		int i_405_ = i * i_404_;
		for (int i_406_ = 0; i_406_ < i; i_406_++)
		    is_403_[i_405_ + i_406_]
			= class108_sub2.aByteArray9309[i_405_ + i_406_];
	    }
	    for (int i_407_ = 0; i_407_ < class108_sub2.anIntArray9308.length;
		 i_407_++)
		is[i_407_] = class108_sub2.anIntArray9308[i_407_];
	    class168_sub2
		= new Class168_Sub2_Sub3(this, is_403_, is, i, i_402_);
	} else {
	    int[] is = class108.method2707(false);
	    if (class108.method2692())
		class168_sub2 = new Class168_Sub2_Sub2(this, is, i, i_402_);
	    else
		class168_sub2 = new Class168_Sub2_Sub1(this, is, i, i_402_);
	}
	class168_sub2.method3602(class108.method2695(), class108.method2697(),
				 class108.method2696(), class108.method2742());
	return class168_sub2;
    }
    
    public Class168 method2290(int i, int i_408_, int i_409_, int i_410_,
			       boolean bool) {
	if (((Class103_Sub2) this).anIntArray9245 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_410_ * i_409_];
	int i_411_
	    = i + i_408_ * (-1826993761 * ((Class103_Sub2) this).anInt9260);
	int i_412_ = -1826993761 * ((Class103_Sub2) this).anInt9260 - i_409_;
	for (int i_413_ = 0; i_413_ < i_410_; i_413_++) {
	    int i_414_ = i_413_ * i_409_;
	    for (int i_415_ = 0; i_415_ < i_409_; i_415_++)
		is[i_415_ + i_414_]
		    = ((Class103_Sub2) this).anIntArray9245[i_411_++];
	    i_411_ += i_412_;
	}
	if (bool)
	    return new Class168_Sub2_Sub2(this, is, i_409_, i_410_);
	return new Class168_Sub2_Sub1(this, is, i_409_, i_410_);
    }
    
    public boolean method2360() {
	return false;
    }
    
    public void method2495(int i, Class135 class135, int i_416_, int i_417_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    int[] is = ((Class135_Sub1) class135_sub1).anIntArray9874;
	    int[] is_418_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	    int i_419_;
	    if (1546170165 * ((Class103_Sub2) this).anInt9252
		< is.length + i_417_)
		i_419_
		    = ((Class103_Sub2) this).anInt9252 * 1546170165 - i_417_;
	    else
		i_419_ = is.length;
	    int i_420_;
	    if (((Class103_Sub2) this).anInt9254 * -788450385 > i_417_) {
		i_420_
		    = ((Class103_Sub2) this).anInt9254 * -788450385 - i_417_;
		i_417_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    } else
		i_420_ = 0;
	    if (i_419_ - i_420_ > 0) {
		int i_421_ = i_417_ * (((Class103_Sub2) this).anInt9260
				       * -1826993761);
		for (int i_422_ = i_420_; i_422_ < i_419_; i_422_++) {
		    int i_423_ = i_416_ + is[i_422_];
		    int i_424_ = is_418_[i_422_];
		    if (((Class103_Sub2) this).anInt9249 * 1298750001
			> i_423_) {
			i_424_
			    -= (1298750001 * ((Class103_Sub2) this).anInt9249
				- i_423_);
			i_423_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    }
		    if (((Class103_Sub2) this).anInt9250 * 325436811
			< i_423_ + i_424_)
			i_424_ = (((Class103_Sub2) this).anInt9250 * 325436811
				  - i_423_);
		    i_423_ += i_421_;
		    for (int i_425_ = -i_424_; i_425_ < 0; i_425_++)
			((Class103_Sub2) this).anIntArray9245[i_423_++] = i;
		    i_421_ += ((Class103_Sub2) this).anInt9260 * -1826993761;
		}
	    }
	}
    }
    
    public Class96 method2552(Class639 class639, Class108[] class108s,
			      boolean bool) {
	int[] is = new int[class108s.length];
	int[] is_426_ = new int[class108s.length];
	boolean bool_427_ = false;
	boolean bool_428_ = false;
	for (int i = 0; i < class108s.length; i++) {
	    is[i] = class108s[i].method2698();
	    is_426_[i] = class108s[i].method2694();
	    if (class108s[i].method2692())
		bool_427_ = true;
	    if (class108s[i].method2691())
		bool_428_ = true;
	}
	if (bool) {
	    if (bool_428_) {
		if (bool_427_)
		    return new Class96_Sub1(this, class639,
					    (Class108_Sub2[]) class108s, is,
					    is_426_);
		return new Class96_Sub3(this, class639,
					(Class108_Sub2[]) class108s, is,
					is_426_);
	    }
	    if (bool_427_)
		return new Class96_Sub1(this, class639,
					(Class108_Sub1[]) class108s, is,
					is_426_);
	    return new Class96_Sub3(this, class639,
				    (Class108_Sub1[]) class108s, is, is_426_);
	}
	if (bool_428_) {
	    if (bool_427_)
		throw new IllegalArgumentException("");
	    return new Class96_Sub5(this, class639,
				    (Class108_Sub2[]) class108s, is, is_426_);
	}
	return new Class96_Sub2(this, class639, (Class108_Sub1[]) class108s,
				is, is_426_);
    }
    
    public void method2299(int i) {
	Class89_Sub3.anInt9676 = Class89_Sub3.anInt9689 = i;
	if (592623211 * ((Class103_Sub2) this).anInt9274 > 1)
	    throw new IllegalStateException();
	method15376(592623211 * ((Class103_Sub2) this).anInt9274);
	method15375(0);
    }
    
    public Class89 method2356(Class161 class161, int i, int i_429_, int i_430_,
			      int i_431_) {
	return new Class89_Sub3(this, class161, i, i_430_, i_431_, i_429_);
    }
    
    public void method2520(int i, int i_432_, float f, int i_433_, int i_434_,
			   float f_435_, int i_436_, int i_437_, float f_438_,
			   int i_439_, int i_440_, int i_441_, int i_442_) {
	boolean bool = null != ((Class103_Sub2) this).anIntArray9245;
	boolean bool_443_ = ((Class103_Sub2) this).aFloatArray9248 != null;
	if (bool || bool_443_) {
	    Class189 class189 = method15377(Thread.currentThread());
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aBool1721 = false;
	    i -= 1298750001 * ((Class103_Sub2) this).anInt9249;
	    i_433_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_436_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_432_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_434_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_437_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    ((Class155) class155).aBool1748
		= (i < 0 || i > ((Class155) class155).anInt1733 || i_433_ < 0
		   || i_433_ > ((Class155) class155).anInt1733 || i_436_ < 0
		   || i_436_ > ((Class155) class155).anInt1733);
	    int i_444_ = i_439_ >>> 24;
	    if (0 == i_442_ || i_442_ == 1 && 255 == i_444_) {
		((Class155) class155).anInt1723 = 0;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_443_, false, (float) i_432_,
				    (float) i_434_, (float) i_437_, (float) i,
				    (float) i_433_, (float) i_436_, f, f_435_,
				    f_438_, i_439_, i_440_, i_441_);
	    } else if (1 == i_442_) {
		((Class155) class155).anInt1723 = 255 - i_444_;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_443_, false, (float) i_432_,
				    (float) i_434_, (float) i_437_, (float) i,
				    (float) i_433_, (float) i_436_, f, f_435_,
				    f_438_, i_439_, i_440_, i_441_);
	    } else if (i_442_ == 2) {
		((Class155) class155).anInt1723 = 128;
		((Class155) class155).aBool1722 = true;
		class155.method3385(bool, bool_443_, false, (float) i_432_,
				    (float) i_434_, (float) i_437_, (float) i,
				    (float) i_433_, (float) i_436_, f, f_435_,
				    f_438_, i_439_, i_440_, i_441_);
	    } else
		throw new IllegalArgumentException();
	    ((Class155) class155).aBool1721 = true;
	}
    }
    
    public int method2302(int i, int i_445_) {
	return i | i_445_;
    }
    
    public Class166 method2303(int i, int i_446_, int[][] is, int[][] is_447_,
			       int i_448_, int i_449_, int i_450_) {
	return new Class166_Sub3(this, i_449_, i_450_, i, i_446_, is, is_447_,
				 i_448_);
    }
    
    public Class268 method2226() {
	Class189 class189 = method15377(Thread.currentThread());
	return ((Class189) class189).aClass268_2221;
    }
    
    public Class266 method2595() {
	Class189 class189 = method15377(Thread.currentThread());
	return ((Class189) class189).aClass266_2222;
    }
    
    public int method2315() {
	return 0;
    }
    
    public Class241_Sub43 method2316(int i, int i_451_, int i_452_, int i_453_,
				     int i_454_, float f) {
	return null;
    }
    
    public void method2317(int i, Class241_Sub43[] class241_sub43s) {
	/* empty */
    }
    
    void method15375(int i) {
	((Class103_Sub2) this).aClass189Array9275[i]
	    .method3872(Thread.currentThread(), (byte) -126);
    }
    
    void method15376(int i) {
	((Class103_Sub2) this).anInt9274 = i * 1588282947;
	((Class103_Sub2) this).aClass189Array9275
	    = new Class189[((Class103_Sub2) this).anInt9274 * 592623211];
	for (int i_455_ = 0;
	     i_455_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_455_++)
	    ((Class103_Sub2) this).aClass189Array9275[i_455_]
		= new Class189(this);
    }
    
    Class189 method15377(Runnable runnable) {
	for (int i = 0; i < ((Class103_Sub2) this).anInt9274 * 592623211;
	     i++) {
	    if (runnable
		== (((Class189) ((Class103_Sub2) this).aClass189Array9275[i])
		    .aRunnable2210))
		return ((Class103_Sub2) this).aClass189Array9275[i];
	}
	return null;
    }
    
    public void method2260(int[] is) {
	is[0] = ((Class103_Sub2) this).anInt9249 * 1298750001;
	is[1] = -788450385 * ((Class103_Sub2) this).anInt9254;
	is[2] = 325436811 * ((Class103_Sub2) this).anInt9250;
	is[3] = 1546170165 * ((Class103_Sub2) this).anInt9252;
    }
    
    void method15378(boolean bool, boolean bool_456_, boolean bool_457_,
		     Class98 class98) {
	Class189 class189 = method15377(Thread.currentThread());
	for (Class247_Sub1_Sub1 class247_sub1_sub1
		 = ((Class247_Sub1_Sub1)
		    class98.aClass441_1353.method7837(-1795121604));
	     null != class247_sub1_sub1;
	     class247_sub1_sub1
		 = ((Class247_Sub1_Sub1)
		    class98.aClass441_1353.method7836(1256557480))) {
	    int i = class247_sub1_sub1.anInt11064 >> 12;
	    int i_458_ = class247_sub1_sub1.anInt11061 >> 12;
	    int i_459_ = class247_sub1_sub1.anInt11060 >> 12;
	    float f
		= (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		   + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
		       [10]) * (float) i_459_
		      + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			  [6]) * (float) i_458_
			 + (float) i * (((Class103_Sub2) this).aClass268_9262
					.aFloatArray4353[2]))));
	    float f_460_
		= (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
		   + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
		       [11]) * (float) i_459_
		      + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			  [3]) * (float) i
			 + (float) i_458_ * (((Class103_Sub2) this)
					     .aClass268_9262.aFloatArray4353
					     [7]))));
	    if (!(f < -f_460_)) {
		float f_461_ = (((Class103_Sub2) this).aFloat9272 * f / f_460_
				+ ((Class103_Sub2) this).aFloat9276);
		if (!(f > ((Class189) class189).aFloat2213)) {
		    float f_462_ = ((float) i_459_ * (((Class103_Sub2) this)
						      .aClass268_9262
						      .aFloatArray4353[8])
				    + ((((Class103_Sub2) this).aClass268_9262
					.aFloatArray4353[4]) * (float) i_458_
				       + (((Class103_Sub2) this).aClass268_9262
					  .aFloatArray4353[0]) * (float) i)
				    + (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[12]));
		    float f_463_ = ((((Class103_Sub2) this).aClass268_9262
				     .aFloatArray4353[9]) * (float) i_459_
				    + ((((Class103_Sub2) this).aClass268_9262
					.aFloatArray4353[5]) * (float) i_458_
				       + (float) i * (((Class103_Sub2) this)
						      .aClass268_9262
						      .aFloatArray4353[1]))
				    + (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[13]));
		    if (!(f_462_ < -f_460_) && !(f_462_ > f_460_)
			&& !(f_463_ < -f_460_) && !(f_463_ > f_460_)) {
			float f_464_
			    = (float) class247_sub1_sub1.anInt11058 / 4096.0F;
			float f_465_ = ((((Class103_Sub2) this).aClass268_9261
					 .aFloatArray4353[0]) * f_464_
					+ f_462_);
			float f_466_
			    = f_460_ + (((Class103_Sub2) this).aClass268_9261
					.aFloatArray4353[3]) * f_464_;
			float f_467_ = ((((Class103_Sub2) this).aFloat9268
					 * f_462_ / f_460_)
					+ ((Class103_Sub2) this).aFloat9277);
			float f_468_ = ((((Class103_Sub2) this).aFloat9270
					 * f_463_ / f_460_)
					+ ((Class103_Sub2) this).aFloat9271);
			float f_469_
			    = ((f_465_ * ((Class103_Sub2) this).aFloat9268
				/ f_466_)
			       + ((Class103_Sub2) this).aFloat9277);
			method15379(bool, bool_456_, bool_457_,
				    class247_sub1_sub1, (int) f_467_,
				    (int) f_468_, f_461_,
				    (int) (f_469_ < f_467_ ? f_467_ - f_469_
					   : f_469_ - f_467_));
		    }
		}
	    }
	}
    }
    
    void method15379(boolean bool, boolean bool_470_, boolean bool_471_,
		     Class247_Sub1_Sub1 class247_sub1_sub1, int i, int i_472_,
		     float f, int i_473_) {
	int i_474_ = class247_sub1_sub1.anInt11062;
	int i_475_ = i_473_;
	i_473_ <<= 1;
	if (-1 == i_474_)
	    method15381(bool_470_, i, i_472_, f, i_475_,
			class247_sub1_sub1.anInt11065, 1);
	else {
	    if (i_474_ != ((Class103_Sub2) this).anInt9253 * -1406521185) {
		Class168 class168
		    = (Class168) ((Class103_Sub2) this).aClass129_9247
				     .get((long) i_474_);
		if (null == class168) {
		    Class101 class101
			= aClass107_1458.method2680(i_474_, -1215326418);
		    int[] is
			= method15389(i_474_, 218388063 * class101.anInt1403);
		    if (is != null) {
			int i_476_ = 608905203 * class101.anInt1406;
			class168 = method2259(is, 0, i_476_, i_476_, i_476_,
					      (byte) -22);
			((Class103_Sub2) this).aClass129_9247
			    .put(class168, (long) i_474_);
		    } else
			return;
		}
		((Class103_Sub2) this).anInt9253 = 1418390367 * i_474_;
		((Class103_Sub2) this).aClass168_9269 = class168;
	    }
	    i_473_++;
	    ((Class168_Sub2) ((Class103_Sub2) this).aClass168_9269).method16221
		(bool, bool_470_, bool_471_, i - i_475_, i_472_ - i_475_, f,
		 i_473_, i_473_, 0, class247_sub1_sub1.anInt11065, 1, 1,
		 false);
	}
    }
    
    void method15380(boolean bool, boolean bool_477_, boolean bool_478_, int i,
		     int i_479_, float f, int i_480_, int i_481_, short i_482_,
		     int i_483_, int i_484_, int i_485_) {
	if (i_480_ != 0 && 0 != i_481_) {
	    if (-1 != i_482_) {
		Class101 class101
		    = aClass107_1458.method2680(i_482_, -162780378);
		if (!class101.aBool1434) {
		    if (-1406521185 * ((Class103_Sub2) this).anInt9253
			!= i_482_) {
			Class168 class168
			    = (Class168) ((Class103_Sub2) this)
					     .aClass129_9247
					     .get((long) i_482_);
			if (class168 == null) {
			    int[] is
				= method15389(i_482_,
					      218388063 * class101.anInt1403);
			    if (null == is)
				return;
			    int i_486_ = class101.anInt1406 * 608905203;
			    class168 = method2259(is, 0, i_486_, i_486_,
						  i_486_, (byte) -123);
			    ((Class103_Sub2) this).aClass129_9247
				.put(class168, (long) i_482_);
			}
			((Class103_Sub2) this).anInt9253 = i_482_ * 1418390367;
			((Class103_Sub2) this).aClass168_9269 = class168;
		    }
		    ((Class168_Sub2) ((Class103_Sub2) this).aClass168_9269)
			.method16221
			(bool, bool_477_, bool_478_, i - i_480_,
			 i_479_ - i_481_, f, i_480_ << 1, i_481_ << 1, i_484_,
			 i_483_, i_485_, 1,
			 class101.aClass529_1391 != Class529.aClass529_6944);
		    return;
		}
	    }
	    method15381(bool_477_, i, i_479_, f, i_480_, i_483_, i_485_);
	}
    }
    
    void method15381(boolean bool, int i, int i_487_, float f, int i_488_,
		     int i_489_, int i_490_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    if (i_488_ < 0)
		i_488_ = -i_488_;
	    int i_491_ = i_487_ - i_488_;
	    if (i_491_ < -788450385 * ((Class103_Sub2) this).anInt9254)
		i_491_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    int i_492_ = 1 + (i_488_ + i_487_);
	    if (i_492_ > 1546170165 * ((Class103_Sub2) this).anInt9252)
		i_492_ = 1546170165 * ((Class103_Sub2) this).anInt9252;
	    int i_493_ = i_491_;
	    int i_494_ = i_488_ * i_488_;
	    int i_495_ = 0;
	    int i_496_ = i_487_ - i_493_;
	    int i_497_ = i_496_ * i_496_;
	    int i_498_ = i_497_ - i_496_;
	    if (i_487_ > i_492_)
		i_487_ = i_492_;
	    int i_499_ = i_489_ >>> 24;
	    if (i_490_ == 0 || i_490_ == 1 && 255 == i_499_) {
		while (i_493_ < i_487_) {
		    for (/**/; i_498_ <= i_494_ || i_497_ <= i_494_;
			 i_498_ += i_495_++ + i_495_)
			i_497_ += i_495_ + i_495_;
		    int i_500_ = 1 + (i - i_495_);
		    if (i_500_ < ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_500_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_501_ = i_495_ + i;
		    if (i_501_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_501_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_502_
			= (i_500_
			   + i_493_ * (-1826993761
				       * ((Class103_Sub2) this).anInt9260));
		    for (int i_503_ = i_500_; i_503_ < i_501_; i_503_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_502_]))
			    ((Class103_Sub2) this).anIntArray9245[i_502_]
				= i_489_;
			i_502_++;
		    }
		    i_493_++;
		    i_497_ -= i_496_-- + i_496_;
		    i_498_ -= i_496_ + i_496_;
		}
		i_495_ = i_488_;
		i_496_ = i_493_ - i_487_;
		i_498_ = i_494_ + i_496_ * i_496_;
		i_497_ = i_498_ - i_495_;
		i_498_ -= i_496_;
		while (i_493_ < i_492_) {
		    for (/**/; i_498_ > i_494_ && i_497_ > i_494_;
			 i_497_ -= i_495_ + i_495_)
			i_498_ -= i_495_-- + i_495_;
		    int i_504_ = i - i_495_;
		    if (i_504_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_504_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_505_ = i_495_ + i;
		    if (i_505_
			> 325436811 * ((Class103_Sub2) this).anInt9250 - 1)
			i_505_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_506_ = (i_493_ * (((Class103_Sub2) this).anInt9260
					    * -1826993761)
				  + i_504_);
		    for (int i_507_ = i_504_; i_507_ <= i_505_; i_507_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_506_]))
			    ((Class103_Sub2) this).anIntArray9245[i_506_]
				= i_489_;
			i_506_++;
		    }
		    i_493_++;
		    i_498_ += i_496_ + i_496_;
		    i_497_ += i_496_++ + i_496_;
		}
	    } else if (1 == i_490_) {
		i_489_ = (i_499_ << 24) + ((i_499_ * (i_489_ & 0xff00) >> 8
					    & 0xff00)
					   + (i_499_ * (i_489_ & 0xff00ff) >> 8
					      & 0xff00ff));
		int i_508_ = 256 - i_499_;
		while (i_493_ < i_487_) {
		    for (/**/; i_498_ <= i_494_ || i_497_ <= i_494_;
			 i_498_ += i_495_++ + i_495_)
			i_497_ += i_495_ + i_495_;
		    int i_509_ = 1 + (i - i_495_);
		    if (i_509_ < ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_509_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_510_ = i_495_ + i;
		    if (i_510_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_510_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_511_
			= (i_509_
			   + i_493_ * (-1826993761
				       * ((Class103_Sub2) this).anInt9260));
		    for (int i_512_ = i_509_; i_512_ < i_510_; i_512_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_511_])) {
			    int i_513_ = (((Class103_Sub2) this).anIntArray9245
					  [i_511_]);
			    i_513_ = ((i_508_ * (i_513_ & 0xff00ff) >> 8
				       & 0xff00ff)
				      + ((i_513_ & 0xff00) * i_508_ >> 8
					 & 0xff00));
			    ((Class103_Sub2) this).anIntArray9245[i_511_]
				= i_489_ + i_513_;
			}
			i_511_++;
		    }
		    i_493_++;
		    i_497_ -= i_496_-- + i_496_;
		    i_498_ -= i_496_ + i_496_;
		}
		i_495_ = i_488_;
		i_496_ = -i_496_;
		i_498_ = i_496_ * i_496_ + i_494_;
		i_497_ = i_498_ - i_495_;
		i_498_ -= i_496_;
		while (i_493_ < i_492_) {
		    for (/**/; i_498_ > i_494_ && i_497_ > i_494_;
			 i_497_ -= i_495_ + i_495_)
			i_498_ -= i_495_-- + i_495_;
		    int i_514_ = i - i_495_;
		    if (i_514_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_514_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_515_ = i_495_ + i;
		    if (i_515_
			> 325436811 * ((Class103_Sub2) this).anInt9250 - 1)
			i_515_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_516_ = ((-1826993761
				   * ((Class103_Sub2) this).anInt9260 * i_493_)
				  + i_514_);
		    for (int i_517_ = i_514_; i_517_ <= i_515_; i_517_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_516_])) {
			    int i_518_ = (((Class103_Sub2) this).anIntArray9245
					  [i_516_]);
			    i_518_
				= ((i_508_ * (i_518_ & 0xff00) >> 8 & 0xff00)
				   + (i_508_ * (i_518_ & 0xff00ff) >> 8
				      & 0xff00ff));
			    ((Class103_Sub2) this).anIntArray9245[i_516_]
				= i_489_ + i_518_;
			}
			i_516_++;
		    }
		    i_493_++;
		    i_498_ += i_496_ + i_496_;
		    i_497_ += i_496_++ + i_496_;
		}
	    } else if (2 == i_490_) {
		while (i_493_ < i_487_) {
		    for (/**/; i_498_ <= i_494_ || i_497_ <= i_494_;
			 i_498_ += i_495_++ + i_495_)
			i_497_ += i_495_ + i_495_;
		    int i_519_ = i - i_495_ + 1;
		    if (i_519_ < ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_519_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_520_ = i + i_495_;
		    if (i_520_ > 325436811 * ((Class103_Sub2) this).anInt9250)
			i_520_ = 325436811 * ((Class103_Sub2) this).anInt9250;
		    int i_521_ = ((((Class103_Sub2) this).anInt9260
				   * -1826993761 * i_493_)
				  + i_519_);
		    for (int i_522_ = i_519_; i_522_ < i_520_; i_522_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_521_])) {
			    int i_523_ = (((Class103_Sub2) this).anIntArray9245
					  [i_521_]);
			    int i_524_ = i_489_ + i_523_;
			    int i_525_
				= (i_523_ & 0xff00ff) + (i_489_ & 0xff00ff);
			    i_523_
				= (i_524_ - i_525_ & 0x10000) + (i_525_
								 & 0x1000100);
			    ((Class103_Sub2) this).anIntArray9245[i_521_]
				= i_524_ - i_523_ | i_523_ - (i_523_ >>> 8);
			}
			i_521_++;
		    }
		    i_493_++;
		    i_497_ -= i_496_-- + i_496_;
		    i_498_ -= i_496_ + i_496_;
		}
		i_495_ = i_488_;
		i_496_ = -i_496_;
		i_498_ = i_494_ + i_496_ * i_496_;
		i_497_ = i_498_ - i_495_;
		i_498_ -= i_496_;
		while (i_493_ < i_492_) {
		    for (/**/; i_498_ > i_494_ && i_497_ > i_494_;
			 i_497_ -= i_495_ + i_495_)
			i_498_ -= i_495_-- + i_495_;
		    int i_526_ = i - i_495_;
		    if (i_526_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_526_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_527_ = i + i_495_;
		    if (i_527_
			> ((Class103_Sub2) this).anInt9250 * 325436811 - 1)
			i_527_
			    = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		    int i_528_ = ((((Class103_Sub2) this).anInt9260
				   * -1826993761 * i_493_)
				  + i_526_);
		    for (int i_529_ = i_526_; i_529_ <= i_527_; i_529_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_528_])) {
			    int i_530_ = (((Class103_Sub2) this).anIntArray9245
					  [i_528_]);
			    int i_531_ = i_530_ + i_489_;
			    int i_532_
				= (i_530_ & 0xff00ff) + (i_489_ & 0xff00ff);
			    i_530_ = (i_532_ & 0x1000100) + (i_531_ - i_532_
							     & 0x10000);
			    ((Class103_Sub2) this).anIntArray9245[i_528_]
				= i_531_ - i_530_ | i_530_ - (i_530_ >>> 8);
			}
			i_528_++;
		    }
		    i_493_++;
		    i_498_ += i_496_ + i_496_;
		    i_497_ += i_496_++ + i_496_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2512(Class266 class266) {
	((Class103_Sub2) this).aClass266_9259 = class266;
	method15382();
    }
    
    public Class266 method2307() {
	return new Class266(((Class103_Sub2) this).aClass266_9259);
    }
    
    public void method2309(Class268 class268) {
	((Class103_Sub2) this).aClass268_9261.method5199(class268);
	method15382();
    }
    
    public Class268 method2310() {
	return new Class268(((Class103_Sub2) this).aClass268_9261);
    }
    
    public void method2311(float f) {
	((Class103_Sub2) this).anInt9255 = 765977265 * (int) (f * 65535.0F);
    }
    
    public void method2227(int i, float f, float f_533_, float f_534_,
			   float f_535_, float f_536_) {
	((Class103_Sub2) this).anInt9256 = 1424358665 * (int) (f * 65535.0F);
	((Class103_Sub2) this).anInt9257
	    = (int) (65535.0F * f_533_) * 1922501479;
	float f_537_ = (float) Math.sqrt((double) (f_536_ * f_536_
						   + (f_534_ * f_534_
						      + f_535_ * f_535_)));
	((Class103_Sub2) this).anInt9266
	    = -1310794753 * (int) (f_534_ * 65535.0F / f_537_);
	((Class103_Sub2) this).anInt9258
	    = (int) (65535.0F * f_535_ / f_537_) * -1554926105;
	((Class103_Sub2) this).anInt9273
	    = -1389466273 * (int) (f_536_ * 65535.0F / f_537_);
    }
    
    public void method2313(int i) {
	/* empty */
    }
    
    public void method2314(int i, int i_538_, int i_539_) {
	for (int i_540_ = 0;
	     i_540_ < ((Class103_Sub2) this).aClass189Array9275.length;
	     i_540_++) {
	    Class189 class189
		= ((Class103_Sub2) this).aClass189Array9275[i_540_];
	    ((Class189) class189).anInt2215 = -1407607783 * (i & 0xffffff);
	    int i_541_
		= ((Class189) class189).anInt2215 * -338296791 >>> 16 & 0xff;
	    if (i_541_ < 2)
		i_541_ = 2;
	    int i_542_
		= ((Class189) class189).anInt2215 * -338296791 >> 8 & 0xff;
	    if (i_542_ < 2)
		i_542_ = 2;
	    int i_543_ = -338296791 * ((Class189) class189).anInt2215 & 0xff;
	    if (i_543_ < 2)
		i_543_ = 2;
	    ((Class189) class189).anInt2215
		= -1407607783 * (i_541_ << 16 | i_542_ << 8 | i_543_);
	    if (i_538_ < 0)
		((Class189) class189).aBool2209 = false;
	    else
		((Class189) class189).aBool2209 = true;
	}
    }
    
    void method15382() {
	((Class103_Sub2) this).aClass268_9279
	    .method5203(((Class103_Sub2) this).aClass266_9259);
	((Class103_Sub2) this).aClass268_9262
	    .method5199(((Class103_Sub2) this).aClass268_9279);
	((Class103_Sub2) this).aClass268_9262
	    .method5202(((Class103_Sub2) this).aClass268_9261);
	((Class103_Sub2) this).aClass268_9262
	    .method5257(((Class103_Sub2) this).aFloatArrayArray9263[0]);
	((Class103_Sub2) this).aClass268_9262
	    .method5226(((Class103_Sub2) this).aFloatArrayArray9263[1]);
	((Class103_Sub2) this).aClass268_9262
	    .method5219(((Class103_Sub2) this).aFloatArrayArray9263[2]);
	((Class103_Sub2) this).aClass268_9262
	    .method5271(((Class103_Sub2) this).aFloatArrayArray9263[3]);
	((Class103_Sub2) this).aClass268_9262
	    .method5238(((Class103_Sub2) this).aFloatArrayArray9263[4]);
	((Class103_Sub2) this).aClass268_9262
	    .method5222(((Class103_Sub2) this).aFloatArrayArray9263[5]);
	float f = ((Class103_Sub2) this).aClass268_9261.method5218();
	float f_544_
	    = (((Class103_Sub2) this).aClass268_9261.aFloatArray4353[14]
	       + (((Class103_Sub2) this).aClass268_9261.aFloatArray4353[10]
		  * (f - 255.0F)));
	float f_545_
	    = (f * ((Class103_Sub2) this).aClass268_9261.aFloatArray4353[10]
	       + ((Class103_Sub2) this).aClass268_9261.aFloatArray4353[14]);
	float f_546_ = f_545_ - f_544_;
	for (int i = 0; i < 592623211 * ((Class103_Sub2) this).anInt9274;
	     i++) {
	    Class189 class189 = ((Class103_Sub2) this).aClass189Array9275[i];
	    ((Class189) class189).aFloat2213 = f_544_;
	    ((Class189) class189).aFloat2214 = f_546_;
	}
    }
    
    public Class88 method2611(int i) {
	return null;
    }
    
    public boolean method2271() {
	return false;
    }
    
    public void method2456(Class88 class88) {
	/* empty */
    }
    
    public void method2321(int i, int i_547_, int i_548_, int i_549_) {
	/* empty */
    }
    
    public void method2322() {
	/* empty */
    }
    
    public boolean method2323() {
	return false;
    }
    
    public boolean method2224() {
	return false;
    }
    
    public void method2305(Class98 class98) {
	method15378(((Class103_Sub2) this).anIntArray9245 != null,
		    null != ((Class103_Sub2) this).aFloatArray9248, false,
		    class98);
    }
    
    public int[] method2418(int i, int i_550_, int i_551_, int i_552_) {
	if (((Class103_Sub2) this).anIntArray9245 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_551_ * i_552_];
	int i_553_ = 0;
	for (int i_554_ = 0; i_554_ < i_552_; i_554_++) {
	    int i_555_
		= ((i_554_ + i_550_) * (-1826993761
					* ((Class103_Sub2) this).anInt9260)
		   + i);
	    for (int i_556_ = 0; i_556_ < i_551_; i_556_++)
		is[i_553_++]
		    = ((Class103_Sub2) this).anIntArray9245[i_556_ + i_555_];
	}
	return is;
    }
    
    boolean method15383(int i) {
	Class101 class101 = aClass107_1458.method2680(i, -1012773654);
	return method15370(class101.anInt1403 * 218388063,
			   608905203 * class101.anInt1406);
    }
    
    public void method2384(int[] is) {
	is[0] = -1826993761 * ((Class103_Sub2) this).anInt9260;
	is[1] = ((Class103_Sub2) this).anInt9278 * -2069999773;
    }
    
    public boolean method2329() {
	return false;
    }
    
    public void method2235() {
	/* empty */
    }
    
    public boolean method2331() {
	return false;
    }
    
    void method2333(float f, float f_557_, float f_558_, float f_559_,
		    float f_560_, float f_561_) {
	/* empty */
    }
    
    public void method2334(int i, Class86 class86) {
	for (int i_562_ = 0;
	     i_562_ < ((Class103_Sub2) this).aClass189Array9275.length;
	     i_562_++) {
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_562_])
		.anInt2240
		= 1208111489 * (((Class189) (((Class103_Sub2) this)
					     .aClass189Array9275[i_562_]))
				.anInt2215);
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_562_])
		.anInt2218
		= i * 134228485;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_562_])
		.anInt2215
		= class86.anInt1251 * -1026199509;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_562_])
		.anInt2230
		= class86.anInt1252 * -516828645;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_562_])
		.aBool2217
		= true;
	}
    }
    
    public Class96 method2296(Class639 class639, Class108[] class108s,
			      boolean bool) {
	int[] is = new int[class108s.length];
	int[] is_563_ = new int[class108s.length];
	boolean bool_564_ = false;
	boolean bool_565_ = false;
	for (int i = 0; i < class108s.length; i++) {
	    is[i] = class108s[i].method2698();
	    is_563_[i] = class108s[i].method2694();
	    if (class108s[i].method2692())
		bool_564_ = true;
	    if (class108s[i].method2691())
		bool_565_ = true;
	}
	if (bool) {
	    if (bool_565_) {
		if (bool_564_)
		    return new Class96_Sub1(this, class639,
					    (Class108_Sub2[]) class108s, is,
					    is_563_);
		return new Class96_Sub3(this, class639,
					(Class108_Sub2[]) class108s, is,
					is_563_);
	    }
	    if (bool_564_)
		return new Class96_Sub1(this, class639,
					(Class108_Sub1[]) class108s, is,
					is_563_);
	    return new Class96_Sub3(this, class639,
				    (Class108_Sub1[]) class108s, is, is_563_);
	}
	if (bool_565_) {
	    if (bool_564_)
		throw new IllegalArgumentException("");
	    return new Class96_Sub5(this, class639,
				    (Class108_Sub2[]) class108s, is, is_563_);
	}
	return new Class96_Sub2(this, class639, (Class108_Sub1[]) class108s,
				is, is_563_);
    }
    
    public void method2336() {
	for (int i = 0; i < ((Class103_Sub2) this).aClass189Array9275.length;
	     i++) {
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i]).anInt2215
		= 143650433 * ((Class189) (((Class103_Sub2) this)
					   .aClass189Array9275[i])).anInt2240;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i]).aBool2217
		= false;
	}
    }
    
    public Class268 method2457() {
	Class189 class189 = method15377(Thread.currentThread());
	return ((Class189) class189).aClass268_2221;
    }
    
    public void method2338(float f, float f_566_, float f_567_, float[] fs) {
	float f_568_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3] * f
	       + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + (f_566_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		  * f_567_));
	float f_569_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		* f_567_)
	       + (f * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[0]
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[12]
		  + f_566_ * (((Class103_Sub2) this).aClass268_9262
			      .aFloatArray4353[4])));
	float f_570_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]
		* f_567_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1] * f
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
		  + f_566_ * (((Class103_Sub2) this).aClass268_9262
			      .aFloatArray4353[5])));
	float f_571_
	    = (((Class103_Sub2) this).aClass268_9279.aFloatArray4353[2] * f
	       + ((Class103_Sub2) this).aClass268_9279.aFloatArray4353[14]
	       + (((Class103_Sub2) this).aClass268_9279.aFloatArray4353[6]
		  * f_566_)
	       + f_567_ * (((Class103_Sub2) this).aClass268_9279
			   .aFloatArray4353[10]));
	fs[0] = (f_569_ * ((Class103_Sub2) this).aFloat9268 / f_568_
		 + ((Class103_Sub2) this).aFloat9277);
	fs[1] = (((Class103_Sub2) this).aFloat9271
		 + ((Class103_Sub2) this).aFloat9270 * f_570_ / f_568_);
	fs[2] = f_571_;
    }
    
    public void method2231(int i, int i_572_, int i_573_, int i_574_,
			   int i_575_, int i_576_, Class135 class135,
			   int i_577_, int i_578_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    int[] is = ((Class135_Sub1) class135_sub1).anIntArray9874;
	    int[] is_579_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	    int i_580_
		= (((Class103_Sub2) this).anInt9254 * -788450385 > i_578_
		   ? ((Class103_Sub2) this).anInt9254 * -788450385 : i_578_);
	    int i_581_ = ((((Class103_Sub2) this).anInt9252 * 1546170165
			   < is.length + i_578_)
			  ? 1546170165 * ((Class103_Sub2) this).anInt9252
			  : i_578_ + is.length);
	    i_573_ -= i;
	    i_574_ -= i_572_;
	    if (i_574_ + i_573_ < 0) {
		i += i_573_;
		i_573_ = -i_573_;
		i_572_ += i_574_;
		i_574_ = -i_574_;
	    }
	    if (i_573_ > i_574_) {
		i_572_ <<= 16;
		i_572_ += 32768;
		i_574_ <<= 16;
		int i_582_ = (int) Math.floor((double) i_574_ / (double) i_573_
					      + 0.5);
		i_573_ += i;
		if (i < 1298750001 * ((Class103_Sub2) this).anInt9249) {
		    i_572_ += (((Class103_Sub2) this).anInt9249 * 1298750001
			       - i) * i_582_;
		    i = ((Class103_Sub2) this).anInt9249 * 1298750001;
		}
		if (i_573_ >= 325436811 * ((Class103_Sub2) this).anInt9250)
		    i_573_ = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		int i_583_ = i_575_ >>> 24;
		if (i_576_ == 0 || 1 == i_576_ && 255 == i_583_) {
		    for (/**/; i <= i_573_; i++) {
			int i_584_ = i_572_ >> 16;
			int i_585_ = i_584_ - i_578_;
			if (i_584_ >= i_580_ && i_584_ < i_581_) {
			    int i_586_ = i_577_ + is[i_585_];
			    if (i >= i_586_ && i < is_579_[i_585_] + i_586_)
				((Class103_Sub2) this).anIntArray9245
				    [i + i_584_ * (-1826993761
						   * (((Class103_Sub2) this)
						      .anInt9260))]
				    = i_575_;
			}
			i_572_ += i_582_;
		    }
		} else if (1 == i_576_) {
		    i_575_ = ((i_583_ * (i_575_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_583_ * (i_575_ & 0xff00) >> 8 & 0xff00)
			      + (i_583_ << 24));
		    int i_587_ = 256 - i_583_;
		    for (/**/; i <= i_573_; i++) {
			int i_588_ = i_572_ >> 16;
			int i_589_ = i_588_ - i_578_;
			if (i_588_ >= i_580_ && i_588_ < i_581_) {
			    int i_590_ = is[i_589_] + i_577_;
			    if (i >= i_590_ && i < i_590_ + is_579_[i_589_]) {
				int i_591_
				    = ((-1826993761
					* ((Class103_Sub2) this).anInt9260
					* i_588_)
				       + i);
				int i_592_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_591_]);
				i_592_ = ((i_587_ * (i_592_ & 0xff00ff) >> 8
					   & 0xff00ff)
					  + ((i_592_ & 0xff00) * i_587_ >> 8
					     & 0xff00));
				((Class103_Sub2) this).anIntArray9245[i_591_]
				    = i_592_ + i_575_;
			    }
			}
			i_572_ += i_582_;
		    }
		} else if (i_576_ == 2) {
		    for (/**/; i <= i_573_; i++) {
			int i_593_ = i_572_ >> 16;
			int i_594_ = i_593_ - i_578_;
			if (i_593_ >= i_580_ && i_593_ < i_581_) {
			    int i_595_ = is[i_594_] + i_577_;
			    if (i >= i_595_ && i < is_579_[i_594_] + i_595_) {
				int i_596_ = ((((Class103_Sub2) this).anInt9260
					       * -1826993761 * i_593_)
					      + i);
				int i_597_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_596_]);
				int i_598_ = i_575_ + i_597_;
				int i_599_ = ((i_575_ & 0xff00ff)
					      + (i_597_ & 0xff00ff));
				i_597_ = ((i_598_ - i_599_ & 0x10000)
					  + (i_599_ & 0x1000100));
				((Class103_Sub2) this).anIntArray9245[i_596_]
				    = i_598_ - i_597_ | i_597_ - (i_597_
								  >>> 8);
			    }
			}
			i_572_ += i_582_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_573_ <<= 16;
		int i_600_ = (int) Math.floor(0.5 + ((double) i_573_
						     / (double) i_574_));
		i_574_ += i_572_;
		if (i_572_ < i_580_) {
		    i += (i_580_ - i_572_) * i_600_;
		    i_572_ = i_580_;
		}
		if (i_574_ >= i_581_)
		    i_574_ = i_581_ - 1;
		int i_601_ = i_575_ >>> 24;
		if (i_576_ == 0 || i_576_ == 1 && 255 == i_601_) {
		    for (/**/; i_572_ <= i_574_; i_572_++) {
			int i_602_ = i >> 16;
			int i_603_ = i_572_ - i_578_;
			int i_604_ = i_577_ + is[i_603_];
			if ((i_602_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_602_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_602_ >= i_604_
			    && i_602_ < is_579_[i_603_] + i_604_)
			    ((Class103_Sub2) this).anIntArray9245
				[(i_602_
				  + i_572_ * (((Class103_Sub2) this).anInt9260
					      * -1826993761))]
				= i_575_;
			i += i_600_;
		    }
		} else if (1 == i_576_) {
		    i_575_ = ((i_601_ << 24)
			      + (((i_575_ & 0xff00) * i_601_ >> 8 & 0xff00)
				 + ((i_575_ & 0xff00ff) * i_601_ >> 8
				    & 0xff00ff)));
		    int i_605_ = 256 - i_601_;
		    for (/**/; i_572_ <= i_574_; i_572_++) {
			int i_606_ = i >> 16;
			int i_607_ = i_572_ - i_578_;
			int i_608_ = i_577_ + is[i_607_];
			if ((i_606_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_606_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_606_ >= i_608_
			    && i_606_ < i_608_ + is_579_[i_607_]) {
			    int i_609_
				= i_606_ + i_572_ * (-1826993761
						     * (((Class103_Sub2) this)
							.anInt9260));
			    int i_610_ = (((Class103_Sub2) this).anIntArray9245
					  [i_609_]);
			    i_610_ = (((i_610_ & 0xff00ff) * i_605_ >> 8
				       & 0xff00ff)
				      + ((i_610_ & 0xff00) * i_605_ >> 8
					 & 0xff00));
			    ((Class103_Sub2) this).anIntArray9245
				[i_572_ * (((Class103_Sub2) this).anInt9260
					   * -1826993761) + i_606_]
				= i_575_ + i_610_;
			}
			i += i_600_;
		    }
		} else if (i_576_ == 2) {
		    for (/**/; i_572_ <= i_574_; i_572_++) {
			int i_611_ = i >> 16;
			int i_612_ = i_572_ - i_578_;
			int i_613_ = is[i_612_] + i_577_;
			if ((i_611_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_611_
				< ((Class103_Sub2) this).anInt9250 * 325436811)
			    && i_611_ >= i_613_
			    && i_611_ < i_613_ + is_579_[i_612_]) {
			    int i_614_
				= (i_611_
				   + i_572_ * (((Class103_Sub2) this).anInt9260
					       * -1826993761));
			    int i_615_ = (((Class103_Sub2) this).anIntArray9245
					  [i_614_]);
			    int i_616_ = i_575_ + i_615_;
			    int i_617_
				= (i_615_ & 0xff00ff) + (i_575_ & 0xff00ff);
			    i_615_
				= (i_616_ - i_617_ & 0x10000) + (i_617_
								 & 0x1000100);
			    ((Class103_Sub2) this).anIntArray9245[i_614_]
				= i_616_ - i_615_ | i_615_ - (i_615_ >>> 8);
			}
			i += i_600_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Class105_Sub2 method2248() {
	return new Class105_Sub2_Sub2(this);
    }
    
    public boolean method2225() {
	return false;
    }
    
    public Interface4 method2461(int i, int i_618_, Class175 class175,
				 Class102 class102, int i_619_) {
	return method15425(i, i_618_);
    }
    
    public Interface5 method2249(int i, int i_620_) {
	return new Class158(i, i_620_);
    }
    
    public Interface5 method2550(int i, int i_621_, int i_622_) {
	return new Class158(i, i_621_);
    }
    
    public int[] method2378(int i, int i_623_, int i_624_, int i_625_) {
	if (((Class103_Sub2) this).anIntArray9245 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_624_ * i_625_];
	int i_626_ = 0;
	for (int i_627_ = 0; i_627_ < i_625_; i_627_++) {
	    int i_628_
		= ((i_627_ + i_623_) * (-1826993761
					* ((Class103_Sub2) this).anInt9260)
		   + i);
	    for (int i_629_ = 0; i_629_ < i_624_; i_629_++)
		is[i_626_++]
		    = ((Class103_Sub2) this).anIntArray9245[i_629_ + i_628_];
	}
	return is;
    }
    
    public void method2608() {
	/* empty */
    }
    
    public int method2554(int i, int i_630_) {
	i |= 0x20800;
	return i & i_630_ ^ i_630_;
    }
    
    public void method2270(int i, int i_631_, float f, int i_632_, int i_633_,
			   float f_634_, int i_635_, int i_636_, float f_637_,
			   int i_638_, int i_639_, int i_640_, int i_641_) {
	boolean bool = null != ((Class103_Sub2) this).anIntArray9245;
	boolean bool_642_ = ((Class103_Sub2) this).aFloatArray9248 != null;
	if (bool || bool_642_) {
	    Class189 class189 = method15377(Thread.currentThread());
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aBool1721 = false;
	    i -= 1298750001 * ((Class103_Sub2) this).anInt9249;
	    i_632_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_635_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_631_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_633_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_636_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    ((Class155) class155).aBool1748
		= (i < 0 || i > ((Class155) class155).anInt1733 || i_632_ < 0
		   || i_632_ > ((Class155) class155).anInt1733 || i_635_ < 0
		   || i_635_ > ((Class155) class155).anInt1733);
	    int i_643_ = i_638_ >>> 24;
	    if (0 == i_641_ || i_641_ == 1 && 255 == i_643_) {
		((Class155) class155).anInt1723 = 0;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_642_, false, (float) i_631_,
				    (float) i_633_, (float) i_636_, (float) i,
				    (float) i_632_, (float) i_635_, f, f_634_,
				    f_637_, i_638_, i_639_, i_640_);
	    } else if (1 == i_641_) {
		((Class155) class155).anInt1723 = 255 - i_643_;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_642_, false, (float) i_631_,
				    (float) i_633_, (float) i_636_, (float) i,
				    (float) i_632_, (float) i_635_, f, f_634_,
				    f_637_, i_638_, i_639_, i_640_);
	    } else if (i_641_ == 2) {
		((Class155) class155).anInt1723 = 128;
		((Class155) class155).aBool1722 = true;
		class155.method3385(bool, bool_642_, false, (float) i_631_,
				    (float) i_633_, (float) i_636_, (float) i,
				    (float) i_632_, (float) i_635_, f, f_634_,
				    f_637_, i_638_, i_639_, i_640_);
	    } else
		throw new IllegalArgumentException();
	    ((Class155) class155).aBool1721 = true;
	}
    }
    
    public int method2347() {
	return 0;
    }
    
    public int method2408() {
	return 0;
    }
    
    public int method2440() {
	return 0;
    }
    
    public int method2306() {
	return 0;
    }
    
    boolean method15384() {
	return ((Class103_Sub2) this).aBool9246;
    }
    
    public boolean method2598() {
	return false;
    }
    
    int[] method15385(int i, int i_644_) {
	Class241_Sub29 class241_sub29;
	synchronized (((Class103_Sub2) this).aClass129_9244) {
	    class241_sub29 = ((Class241_Sub29)
			      (((Class103_Sub2) this).aClass129_9244.get
			       ((long) (i_644_ & 0xffff | (i & 0xffff) << 16)
				| ~0x7fffffffffffffffL)));
	    if (null == class241_sub29) {
		Class101 class101 = aClass107_1458.method2680(i, -1340468831);
		int i_645_ = 608905203 * class101.anInt1406;
		if (!anInterface6_1457.method31(i_644_,
						Class537.aClass537_6990, 0.7F,
						i_645_, i_645_, true,
						-898984567)) {
		    int[] is = null;
		    return is;
		}
		int[] is;
		if (Class529.aClass529_6942 != class101.aClass529_1391)
		    is = anInterface6_1457.method30(i_644_, 0.7F, i_645_,
						    i_645_, true, -2086874277);
		else
		    is = anInterface6_1457.method37(i_644_, 0.7F, i_645_,
						    i_645_, true, 1367286003);
		class241_sub29
		    = new Class241_Sub29(i, i_644_, i_645_, is,
					 (Class529.aClass529_6943
					  != class101.aClass529_1391));
		((Class103_Sub2) this).aClass129_9244.method3026
		    (class241_sub29,
		     ((long) (i_644_ & 0xffff | (i & 0xffff) << 16)
		      | ~0x7fffffffffffffffL),
		     i_645_ * i_645_, 930994235);
	    }
	}
	((Class241_Sub29) class241_sub29).aBool10035 = true;
	return class241_sub29.method16289();
    }
    
    public void method2411(int i, int i_646_, int i_647_, int i_648_,
			   int i_649_, int i_650_) {
	if (((Class103_Sub2) this).anIntArray9245 != null) {
	    if (i < 1298750001 * ((Class103_Sub2) this).anInt9249) {
		i_647_ -= 1298750001 * ((Class103_Sub2) this).anInt9249 - i;
		i = ((Class103_Sub2) this).anInt9249 * 1298750001;
	    }
	    if (i_646_ < ((Class103_Sub2) this).anInt9254 * -788450385) {
		i_648_
		    -= ((Class103_Sub2) this).anInt9254 * -788450385 - i_646_;
		i_646_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    }
	    if (i + i_647_ > 325436811 * ((Class103_Sub2) this).anInt9250)
		i_647_ = 325436811 * ((Class103_Sub2) this).anInt9250 - i;
	    if (i_646_ + i_648_
		> 1546170165 * ((Class103_Sub2) this).anInt9252)
		i_648_
		    = 1546170165 * ((Class103_Sub2) this).anInt9252 - i_646_;
	    if (i_647_ > 0 && i_648_ > 0
		&& i <= ((Class103_Sub2) this).anInt9250 * 325436811
		&& i_646_ <= ((Class103_Sub2) this).anInt9252 * 1546170165) {
		int i_651_
		    = ((Class103_Sub2) this).anInt9260 * -1826993761 - i_647_;
		int i_652_ = i + (((Class103_Sub2) this).anInt9260
				  * -1826993761 * i_646_);
		int i_653_ = i_649_ >>> 24;
		if (0 == i_650_ || 1 == i_650_ && i_653_ == 255) {
		    int i_654_ = i_647_ >> 3;
		    int i_655_ = i_647_ & 0x7;
		    i_647_ = i_652_ - 1;
		    for (int i_656_ = -i_648_; i_656_ < 0; i_656_++) {
			if (i_654_ > 0) {
			    i = i_654_;
			    do {
				((Class103_Sub2) this).anIntArray9245[++i_647_]
				    = i_649_;
				((Class103_Sub2) this).anIntArray9245[++i_647_]
				    = i_649_;
				((Class103_Sub2) this).anIntArray9245[++i_647_]
				    = i_649_;
				((Class103_Sub2) this).anIntArray9245[++i_647_]
				    = i_649_;
				((Class103_Sub2) this).anIntArray9245[++i_647_]
				    = i_649_;
				((Class103_Sub2) this).anIntArray9245[++i_647_]
				    = i_649_;
				((Class103_Sub2) this).anIntArray9245[++i_647_]
				    = i_649_;
				((Class103_Sub2) this).anIntArray9245[++i_647_]
				    = i_649_;
			    } while (--i > 0);
			}
			if (i_655_ > 0) {
			    i = i_655_;
			    do
				((Class103_Sub2) this).anIntArray9245[++i_647_]
				    = i_649_;
			    while (--i > 0);
			}
			i_647_ += i_651_;
		    }
		} else if (i_650_ == 1) {
		    i_649_
			= ((i_653_ * ((i_649_ & ~0xff00ff) >>> 8) & ~0xff00ff)
			   + (i_653_ * (i_649_ & 0xff00ff) >> 8 & 0xff00ff));
		    int i_657_ = 256 - i_653_;
		    for (int i_658_ = 0; i_658_ < i_648_; i_658_++) {
			for (int i_659_ = -i_647_; i_659_ < 0; i_659_++) {
			    int i_660_ = (((Class103_Sub2) this).anIntArray9245
					  [i_652_]);
			    i_660_ = ((i_657_ * (i_660_ & 0xff00ff) >> 8
				       & 0xff00ff)
				      + (((i_660_ & ~0xff00ff) >>> 8) * i_657_
					 & ~0xff00ff));
			    ((Class103_Sub2) this).anIntArray9245[i_652_++]
				= i_649_ + i_660_;
			}
			i_652_ += i_651_;
		    }
		} else if (2 == i_650_) {
		    for (int i_661_ = 0; i_661_ < i_648_; i_661_++) {
			for (int i_662_ = -i_647_; i_662_ < 0; i_662_++) {
			    int i_663_ = (((Class103_Sub2) this).anIntArray9245
					  [i_652_]);
			    int i_664_ = i_663_ + i_649_;
			    int i_665_
				= (i_649_ & 0xff00ff) + (i_663_ & 0xff00ff);
			    i_663_
				= (i_664_ - i_665_ & 0x10000) + (i_665_
								 & 0x1000100);
			    ((Class103_Sub2) this).anIntArray9245[i_652_++]
				= i_664_ - i_663_ | i_663_ - (i_663_ >>> 8);
			}
			i_652_ += i_651_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    boolean method15386(int i, int i_666_) {
	return anInterface6_1457.method31(i, Class537.aClass537_6990, 0.7F,
					  i_666_, i_666_, true, 1974515064);
    }
    
    boolean method15387(int i) {
	Class101 class101 = aClass107_1458.method2680(i, -1082279012);
	return method15370(class101.anInt1403 * 218388063,
			   608905203 * class101.anInt1406);
    }
    
    boolean method15388(int i) {
	Class101 class101 = aClass107_1458.method2680(i, 1293288206);
	return method15370(class101.anInt1403 * 218388063,
			   608905203 * class101.anInt1406);
    }
    
    int[] method15389(int i, int i_667_) {
	Class241_Sub29 class241_sub29;
	synchronized (((Class103_Sub2) this).aClass129_9244) {
	    class241_sub29 = ((Class241_Sub29)
			      (((Class103_Sub2) this).aClass129_9244.get
			       ((long) (i_667_ & 0xffff | (i & 0xffff) << 16)
				| ~0x7fffffffffffffffL)));
	    if (null == class241_sub29) {
		Class101 class101 = aClass107_1458.method2680(i, 1353131969);
		int i_668_ = 608905203 * class101.anInt1406;
		if (!anInterface6_1457.method31(i_667_,
						Class537.aClass537_6990, 0.7F,
						i_668_, i_668_, true,
						-2107651244)) {
		    int[] is = null;
		    return is;
		}
		int[] is;
		if (Class529.aClass529_6942 != class101.aClass529_1391)
		    is = anInterface6_1457.method30(i_667_, 0.7F, i_668_,
						    i_668_, true, -2086874277);
		else
		    is = anInterface6_1457.method37(i_667_, 0.7F, i_668_,
						    i_668_, true, 2098768427);
		class241_sub29
		    = new Class241_Sub29(i, i_667_, i_668_, is,
					 (Class529.aClass529_6943
					  != class101.aClass529_1391));
		((Class103_Sub2) this).aClass129_9244.method3026
		    (class241_sub29,
		     ((long) (i_667_ & 0xffff | (i & 0xffff) << 16)
		      | ~0x7fffffffffffffffL),
		     i_668_ * i_668_, 1938611644);
	    }
	}
	((Class241_Sub29) class241_sub29).aBool10035 = true;
	return class241_sub29.method16289();
    }
    
    int method15390(int i) {
	return aClass107_1458.method2680(i, 925952136).anInt1406 * 608905203;
    }
    
    void method2218(int i, int i_669_) throws Exception_Sub2 {
	aClass105_Sub1_1452.method15435(i, i_669_);
	if (null != anInterface6_1457)
	    anInterface6_1457.method34(-602503007);
    }
    
    public void method2523(int i, int i_670_, float f, int i_671_, int i_672_,
			   float f_673_, int i_674_, int i_675_, float f_676_,
			   int i_677_, int i_678_, int i_679_, int i_680_) {
	boolean bool = null != ((Class103_Sub2) this).anIntArray9245;
	boolean bool_681_ = ((Class103_Sub2) this).aFloatArray9248 != null;
	if (bool || bool_681_) {
	    Class189 class189 = method15377(Thread.currentThread());
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aBool1721 = false;
	    i -= 1298750001 * ((Class103_Sub2) this).anInt9249;
	    i_671_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_674_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_670_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_672_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_675_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    ((Class155) class155).aBool1748
		= (i < 0 || i > ((Class155) class155).anInt1733 || i_671_ < 0
		   || i_671_ > ((Class155) class155).anInt1733 || i_674_ < 0
		   || i_674_ > ((Class155) class155).anInt1733);
	    int i_682_ = i_677_ >>> 24;
	    if (0 == i_680_ || i_680_ == 1 && 255 == i_682_) {
		((Class155) class155).anInt1723 = 0;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_681_, false, (float) i_670_,
				    (float) i_672_, (float) i_675_, (float) i,
				    (float) i_671_, (float) i_674_, f, f_673_,
				    f_676_, i_677_, i_678_, i_679_);
	    } else if (1 == i_680_) {
		((Class155) class155).anInt1723 = 255 - i_682_;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_681_, false, (float) i_670_,
				    (float) i_672_, (float) i_675_, (float) i,
				    (float) i_671_, (float) i_674_, f, f_673_,
				    f_676_, i_677_, i_678_, i_679_);
	    } else if (i_680_ == 2) {
		((Class155) class155).anInt1723 = 128;
		((Class155) class155).aBool1722 = true;
		class155.method3385(bool, bool_681_, false, (float) i_670_,
				    (float) i_672_, (float) i_675_, (float) i,
				    (float) i_671_, (float) i_674_, f, f_673_,
				    f_676_, i_677_, i_678_, i_679_);
	    } else
		throw new IllegalArgumentException();
	    ((Class155) class155).aBool1721 = true;
	}
    }
    
    byte method15391(int i) {
	return aClass107_1458.method2680(i, -1316446031).aByte1372;
    }
    
    byte method15392(int i) {
	return aClass107_1458.method2680(i, 2062756964).aByte1372;
    }
    
    byte method15393(int i) {
	return aClass107_1458.method2680(i, -1502377364).aByte1372;
    }
    
    void method15394(boolean bool, boolean bool_683_, boolean bool_684_,
		     Class98 class98) {
	Class189 class189 = method15377(Thread.currentThread());
	for (Class247_Sub1_Sub1 class247_sub1_sub1
		 = ((Class247_Sub1_Sub1)
		    class98.aClass441_1353.method7837(2097132849));
	     null != class247_sub1_sub1;
	     class247_sub1_sub1
		 = ((Class247_Sub1_Sub1)
		    class98.aClass441_1353.method7836(1256557480))) {
	    int i = class247_sub1_sub1.anInt11064 >> 12;
	    int i_685_ = class247_sub1_sub1.anInt11061 >> 12;
	    int i_686_ = class247_sub1_sub1.anInt11060 >> 12;
	    float f
		= (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		   + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
		       [10]) * (float) i_686_
		      + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			  [6]) * (float) i_685_
			 + (float) i * (((Class103_Sub2) this).aClass268_9262
					.aFloatArray4353[2]))));
	    float f_687_
		= (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
		   + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
		       [11]) * (float) i_686_
		      + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			  [3]) * (float) i
			 + (float) i_685_ * (((Class103_Sub2) this)
					     .aClass268_9262.aFloatArray4353
					     [7]))));
	    if (!(f < -f_687_)) {
		float f_688_ = (((Class103_Sub2) this).aFloat9272 * f / f_687_
				+ ((Class103_Sub2) this).aFloat9276);
		if (!(f > ((Class189) class189).aFloat2213)) {
		    float f_689_ = ((float) i_686_ * (((Class103_Sub2) this)
						      .aClass268_9262
						      .aFloatArray4353[8])
				    + ((((Class103_Sub2) this).aClass268_9262
					.aFloatArray4353[4]) * (float) i_685_
				       + (((Class103_Sub2) this).aClass268_9262
					  .aFloatArray4353[0]) * (float) i)
				    + (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[12]));
		    float f_690_ = ((((Class103_Sub2) this).aClass268_9262
				     .aFloatArray4353[9]) * (float) i_686_
				    + ((((Class103_Sub2) this).aClass268_9262
					.aFloatArray4353[5]) * (float) i_685_
				       + (float) i * (((Class103_Sub2) this)
						      .aClass268_9262
						      .aFloatArray4353[1]))
				    + (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[13]));
		    if (!(f_689_ < -f_687_) && !(f_689_ > f_687_)
			&& !(f_690_ < -f_687_) && !(f_690_ > f_687_)) {
			float f_691_
			    = (float) class247_sub1_sub1.anInt11058 / 4096.0F;
			float f_692_ = ((((Class103_Sub2) this).aClass268_9261
					 .aFloatArray4353[0]) * f_691_
					+ f_689_);
			float f_693_
			    = f_687_ + (((Class103_Sub2) this).aClass268_9261
					.aFloatArray4353[3]) * f_691_;
			float f_694_ = ((((Class103_Sub2) this).aFloat9268
					 * f_689_ / f_687_)
					+ ((Class103_Sub2) this).aFloat9277);
			float f_695_ = ((((Class103_Sub2) this).aFloat9270
					 * f_690_ / f_687_)
					+ ((Class103_Sub2) this).aFloat9271);
			float f_696_
			    = ((f_692_ * ((Class103_Sub2) this).aFloat9268
				/ f_693_)
			       + ((Class103_Sub2) this).aFloat9277);
			method15379(bool, bool_683_, bool_684_,
				    class247_sub1_sub1, (int) f_694_,
				    (int) f_695_, f_688_,
				    (int) (f_696_ < f_694_ ? f_694_ - f_696_
					   : f_696_ - f_694_));
		    }
		}
	    }
	}
    }
    
    public boolean method2502() {
	return false;
    }
    
    public void method2308(boolean bool) {
	Class189 class189 = method15377(Thread.currentThread());
	((Class189) class189).aBool2220 = bool;
    }
    
    void method15395() {
	int i = (325436811 * ((Class103_Sub2) this).anInt9250
		 - ((Class103_Sub2) this).anInt9249 * 1298750001);
	int i_697_ = (1546170165 * ((Class103_Sub2) this).anInt9252
		      - -788450385 * ((Class103_Sub2) this).anInt9254);
	float f = (((Class103_Sub2) this).aFloat9268
		   = ((float) (-1144298619 * ((Class103_Sub2) this).anInt9251)
		      / 2.0F));
	float f_698_ = (((Class103_Sub2) this).aFloat9270
			= (float) (-762379487
				   * ((Class103_Sub2) this).anInt9267) / 2.0F);
	((Class103_Sub2) this).aFloat9277
	    = f + (float) (((Class103_Sub2) this).anInt9264 * -771006449);
	((Class103_Sub2) this).aFloat9271
	    = (float) (534835081 * ((Class103_Sub2) this).anInt9265) + f_698_;
	for (int i_699_ = 0;
	     i_699_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_699_++) {
	    Class189 class189
		= ((Class103_Sub2) this).aClass189Array9275[i_699_];
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aFloat1728 = f;
	    ((Class155) class155).aFloat1729 = f_698_;
	    ((Class155) class155).aFloat1727
		= (((Class103_Sub2) this).aFloat9277
		   - (float) (1298750001 * ((Class103_Sub2) this).anInt9249));
	    ((Class155) class155).aFloat1731
		= (((Class103_Sub2) this).aFloat9271
		   - (float) (-788450385 * ((Class103_Sub2) this).anInt9254));
	    ((Class155) class155).anInt1733 = i;
	    ((Class155) class155).anInt1726 = i_697_;
	}
	int i_700_ = ((-1826993761 * ((Class103_Sub2) this).anInt9260
		       * (-788450385 * ((Class103_Sub2) this).anInt9254))
		      + ((Class103_Sub2) this).anInt9249 * 1298750001);
	for (int i_701_ = -788450385 * ((Class103_Sub2) this).anInt9254;
	     i_701_ < ((Class103_Sub2) this).anInt9252 * 1546170165;
	     i_701_++) {
	    for (int i_702_ = 0;
		 i_702_ < ((Class103_Sub2) this).anInt9274 * 592623211;
		 i_702_++)
		((Class155) (((Class189) (((Class103_Sub2) this)
					  .aClass189Array9275[i_702_]))
			     .aClass155_2223))
		    .anIntArray1730
		    [i_701_ - -788450385 * ((Class103_Sub2) this).anInt9254]
		    = i_700_;
	    i_700_ += -1826993761 * ((Class103_Sub2) this).anInt9260;
	}
    }
    
    public Class180 method2326(int[] is) {
	return null;
    }
    
    Class105_Sub1 method2511(Canvas canvas, int i, int i_703_) {
	return CursorTypeList.method13211(this, canvas, i, i_703_, -498960104);
    }
    
    public boolean method2355() {
	return false;
    }
    
    boolean method15396(int i) {
	Class101 class101 = aClass107_1458.method2680(i, -1893235227);
	return class101.aByte1395 != 0 || class101.aByte1370 != 0;
    }
    
    public void method2473(int i) {
	/* empty */
    }
    
    public boolean method2358() {
	return false;
    }
    
    public boolean method2606() {
	return false;
    }
    
    public void method2593(Class88 class88) {
	/* empty */
    }
    
    public boolean method2256() {
	return false;
    }
    
    public boolean method2362() {
	return false;
    }
    
    public boolean method2363() {
	return false;
    }
    
    public void method2490(Class88 class88) {
	/* empty */
    }
    
    public boolean method2365() {
	return false;
    }
    
    Class529 method15397(int i) {
	return aClass107_1458.method2680(i, 1974442998).aClass529_1391;
    }
    
    public boolean method2253() {
	return false;
    }
    
    public boolean method2368() {
	return true;
    }
    
    public boolean method2288() {
	return true;
    }
    
    public String method2369() {
	return "";
    }
    
    public Class241_Sub43 method2494(int i, int i_704_, int i_705_, int i_706_,
				     int i_707_, float f) {
	return null;
    }
    
    public void method2491(float f, float f_708_, float f_709_, float[] fs) {
	float f_710_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3] * f
	       + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + (f_708_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		  * f_709_));
	float f_711_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		* f_709_)
	       + (f * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[0]
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[12]
		  + f_708_ * (((Class103_Sub2) this).aClass268_9262
			      .aFloatArray4353[4])));
	float f_712_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]
		* f_709_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1] * f
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
		  + f_708_ * (((Class103_Sub2) this).aClass268_9262
			      .aFloatArray4353[5])));
	float f_713_
	    = (((Class103_Sub2) this).aClass268_9279.aFloatArray4353[2] * f
	       + ((Class103_Sub2) this).aClass268_9279.aFloatArray4353[14]
	       + (((Class103_Sub2) this).aClass268_9279.aFloatArray4353[6]
		  * f_708_)
	       + f_709_ * (((Class103_Sub2) this).aClass268_9279
			   .aFloatArray4353[10]));
	fs[0] = (f_711_ * ((Class103_Sub2) this).aFloat9268 / f_710_
		 + ((Class103_Sub2) this).aFloat9277);
	fs[1] = (((Class103_Sub2) this).aFloat9271
		 + ((Class103_Sub2) this).aFloat9270 * f_712_ / f_710_);
	fs[2] = f_713_;
    }
    
    Class105_Sub1 method2372(Canvas canvas, int i, int i_714_) {
	return CursorTypeList.method13211(this, canvas, i, i_714_, -498960104);
    }
    
    Class105_Sub1 method2277(Canvas canvas, int i, int i_715_) {
	return CursorTypeList.method13211(this, canvas, i, i_715_, -498960104);
    }
    
    Class105_Sub1 method2374(Canvas canvas, int i, int i_716_) {
	return CursorTypeList.method13211(this, canvas, i, i_716_, -498960104);
    }
    
    public boolean method2524() {
	return false;
    }
    
    void method15398(int i, int i_717_, int[] is, float[] fs) {
	((Class103_Sub2) this).anInt9260 = i * 1904120415;
	((Class103_Sub2) this).anInt9278 = i_717_ * -710038965;
	((Class103_Sub2) this).anIntArray9245 = is;
	((Class103_Sub2) this).aFloatArray9248 = fs;
	for (int i_718_ = 0;
	     i_718_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_718_++)
	    ((Class103_Sub2) this).aClass189Array9275[i_718_]
		.method3871(767752249);
	method2572();
	method2295();
    }
    
    public Class88 method2319(Class88 class88, Class88 class88_719_, float f,
			      Class88 class88_720_) {
	return null;
    }
    
    void method15399(boolean bool, int i, int i_721_, float f, int i_722_,
		     int i_723_, int i_724_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    if (i_722_ < 0)
		i_722_ = -i_722_;
	    int i_725_ = i_721_ - i_722_;
	    if (i_725_ < -788450385 * ((Class103_Sub2) this).anInt9254)
		i_725_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    int i_726_ = 1 + (i_722_ + i_721_);
	    if (i_726_ > 1546170165 * ((Class103_Sub2) this).anInt9252)
		i_726_ = 1546170165 * ((Class103_Sub2) this).anInt9252;
	    int i_727_ = i_725_;
	    int i_728_ = i_722_ * i_722_;
	    int i_729_ = 0;
	    int i_730_ = i_721_ - i_727_;
	    int i_731_ = i_730_ * i_730_;
	    int i_732_ = i_731_ - i_730_;
	    if (i_721_ > i_726_)
		i_721_ = i_726_;
	    int i_733_ = i_723_ >>> 24;
	    if (i_724_ == 0 || i_724_ == 1 && 255 == i_733_) {
		while (i_727_ < i_721_) {
		    for (/**/; i_732_ <= i_728_ || i_731_ <= i_728_;
			 i_732_ += i_729_++ + i_729_)
			i_731_ += i_729_ + i_729_;
		    int i_734_ = 1 + (i - i_729_);
		    if (i_734_ < ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_734_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_735_ = i_729_ + i;
		    if (i_735_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_735_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_736_
			= (i_734_
			   + i_727_ * (-1826993761
				       * ((Class103_Sub2) this).anInt9260));
		    for (int i_737_ = i_734_; i_737_ < i_735_; i_737_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_736_]))
			    ((Class103_Sub2) this).anIntArray9245[i_736_]
				= i_723_;
			i_736_++;
		    }
		    i_727_++;
		    i_731_ -= i_730_-- + i_730_;
		    i_732_ -= i_730_ + i_730_;
		}
		i_729_ = i_722_;
		i_730_ = i_727_ - i_721_;
		i_732_ = i_728_ + i_730_ * i_730_;
		i_731_ = i_732_ - i_729_;
		i_732_ -= i_730_;
		while (i_727_ < i_726_) {
		    for (/**/; i_732_ > i_728_ && i_731_ > i_728_;
			 i_731_ -= i_729_ + i_729_)
			i_732_ -= i_729_-- + i_729_;
		    int i_738_ = i - i_729_;
		    if (i_738_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_738_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_739_ = i_729_ + i;
		    if (i_739_
			> 325436811 * ((Class103_Sub2) this).anInt9250 - 1)
			i_739_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_740_ = (i_727_ * (((Class103_Sub2) this).anInt9260
					    * -1826993761)
				  + i_738_);
		    for (int i_741_ = i_738_; i_741_ <= i_739_; i_741_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_740_]))
			    ((Class103_Sub2) this).anIntArray9245[i_740_]
				= i_723_;
			i_740_++;
		    }
		    i_727_++;
		    i_732_ += i_730_ + i_730_;
		    i_731_ += i_730_++ + i_730_;
		}
	    } else if (1 == i_724_) {
		i_723_ = (i_733_ << 24) + ((i_733_ * (i_723_ & 0xff00) >> 8
					    & 0xff00)
					   + (i_733_ * (i_723_ & 0xff00ff) >> 8
					      & 0xff00ff));
		int i_742_ = 256 - i_733_;
		while (i_727_ < i_721_) {
		    for (/**/; i_732_ <= i_728_ || i_731_ <= i_728_;
			 i_732_ += i_729_++ + i_729_)
			i_731_ += i_729_ + i_729_;
		    int i_743_ = 1 + (i - i_729_);
		    if (i_743_ < ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_743_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_744_ = i_729_ + i;
		    if (i_744_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_744_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_745_
			= (i_743_
			   + i_727_ * (-1826993761
				       * ((Class103_Sub2) this).anInt9260));
		    for (int i_746_ = i_743_; i_746_ < i_744_; i_746_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_745_])) {
			    int i_747_ = (((Class103_Sub2) this).anIntArray9245
					  [i_745_]);
			    i_747_ = ((i_742_ * (i_747_ & 0xff00ff) >> 8
				       & 0xff00ff)
				      + ((i_747_ & 0xff00) * i_742_ >> 8
					 & 0xff00));
			    ((Class103_Sub2) this).anIntArray9245[i_745_]
				= i_723_ + i_747_;
			}
			i_745_++;
		    }
		    i_727_++;
		    i_731_ -= i_730_-- + i_730_;
		    i_732_ -= i_730_ + i_730_;
		}
		i_729_ = i_722_;
		i_730_ = -i_730_;
		i_732_ = i_730_ * i_730_ + i_728_;
		i_731_ = i_732_ - i_729_;
		i_732_ -= i_730_;
		while (i_727_ < i_726_) {
		    for (/**/; i_732_ > i_728_ && i_731_ > i_728_;
			 i_731_ -= i_729_ + i_729_)
			i_732_ -= i_729_-- + i_729_;
		    int i_748_ = i - i_729_;
		    if (i_748_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_748_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_749_ = i_729_ + i;
		    if (i_749_
			> 325436811 * ((Class103_Sub2) this).anInt9250 - 1)
			i_749_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_750_ = ((-1826993761
				   * ((Class103_Sub2) this).anInt9260 * i_727_)
				  + i_748_);
		    for (int i_751_ = i_748_; i_751_ <= i_749_; i_751_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_750_])) {
			    int i_752_ = (((Class103_Sub2) this).anIntArray9245
					  [i_750_]);
			    i_752_
				= ((i_742_ * (i_752_ & 0xff00) >> 8 & 0xff00)
				   + (i_742_ * (i_752_ & 0xff00ff) >> 8
				      & 0xff00ff));
			    ((Class103_Sub2) this).anIntArray9245[i_750_]
				= i_723_ + i_752_;
			}
			i_750_++;
		    }
		    i_727_++;
		    i_732_ += i_730_ + i_730_;
		    i_731_ += i_730_++ + i_730_;
		}
	    } else if (2 == i_724_) {
		while (i_727_ < i_721_) {
		    for (/**/; i_732_ <= i_728_ || i_731_ <= i_728_;
			 i_732_ += i_729_++ + i_729_)
			i_731_ += i_729_ + i_729_;
		    int i_753_ = i - i_729_ + 1;
		    if (i_753_ < ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_753_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_754_ = i + i_729_;
		    if (i_754_ > 325436811 * ((Class103_Sub2) this).anInt9250)
			i_754_ = 325436811 * ((Class103_Sub2) this).anInt9250;
		    int i_755_ = ((((Class103_Sub2) this).anInt9260
				   * -1826993761 * i_727_)
				  + i_753_);
		    for (int i_756_ = i_753_; i_756_ < i_754_; i_756_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_755_])) {
			    int i_757_ = (((Class103_Sub2) this).anIntArray9245
					  [i_755_]);
			    int i_758_ = i_723_ + i_757_;
			    int i_759_
				= (i_757_ & 0xff00ff) + (i_723_ & 0xff00ff);
			    i_757_
				= (i_758_ - i_759_ & 0x10000) + (i_759_
								 & 0x1000100);
			    ((Class103_Sub2) this).anIntArray9245[i_755_]
				= i_758_ - i_757_ | i_757_ - (i_757_ >>> 8);
			}
			i_755_++;
		    }
		    i_727_++;
		    i_731_ -= i_730_-- + i_730_;
		    i_732_ -= i_730_ + i_730_;
		}
		i_729_ = i_722_;
		i_730_ = -i_730_;
		i_732_ = i_728_ + i_730_ * i_730_;
		i_731_ = i_732_ - i_729_;
		i_732_ -= i_730_;
		while (i_727_ < i_726_) {
		    for (/**/; i_732_ > i_728_ && i_731_ > i_728_;
			 i_731_ -= i_729_ + i_729_)
			i_732_ -= i_729_-- + i_729_;
		    int i_760_ = i - i_729_;
		    if (i_760_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_760_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_761_ = i + i_729_;
		    if (i_761_
			> ((Class103_Sub2) this).anInt9250 * 325436811 - 1)
			i_761_
			    = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		    int i_762_ = ((((Class103_Sub2) this).anInt9260
				   * -1826993761 * i_727_)
				  + i_760_);
		    for (int i_763_ = i_760_; i_763_ <= i_761_; i_763_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_762_])) {
			    int i_764_ = (((Class103_Sub2) this).anIntArray9245
					  [i_762_]);
			    int i_765_ = i_764_ + i_723_;
			    int i_766_
				= (i_764_ & 0xff00ff) + (i_723_ & 0xff00ff);
			    i_764_ = (i_766_ & 0x1000100) + (i_765_ - i_766_
							     & 0x10000);
			    ((Class103_Sub2) this).anIntArray9245[i_762_]
				= i_765_ - i_764_ | i_764_ - (i_764_ >>> 8);
			}
			i_762_++;
		    }
		    i_727_++;
		    i_732_ += i_730_ + i_730_;
		    i_731_ += i_730_++ + i_730_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public Class241_Sub43 method2576(int i, int i_767_, int i_768_, int i_769_,
				     int i_770_, float f) {
	return null;
    }
    
    void method15400(int i, int i_771_, int[] is, float[] fs) {
	((Class103_Sub2) this).anInt9260 = i * 1904120415;
	((Class103_Sub2) this).anInt9278 = i_771_ * -710038965;
	((Class103_Sub2) this).anIntArray9245 = is;
	((Class103_Sub2) this).aFloatArray9248 = fs;
	for (int i_772_ = 0;
	     i_772_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_772_++)
	    ((Class103_Sub2) this).aClass189Array9275[i_772_]
		.method3871(1589134845);
	method2572();
	method2295();
    }
    
    void method15401(int i, int i_773_, int[] is, float[] fs) {
	((Class103_Sub2) this).anInt9260 = i * 1904120415;
	((Class103_Sub2) this).anInt9278 = i_773_ * -710038965;
	((Class103_Sub2) this).anIntArray9245 = is;
	((Class103_Sub2) this).aFloatArray9248 = fs;
	for (int i_774_ = 0;
	     i_774_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_774_++)
	    ((Class103_Sub2) this).aClass189Array9275[i_774_]
		.method3871(1571916884);
	method2572();
	method2295();
    }
    
    public void method2268(int i, int i_775_, int i_776_, int i_777_,
			   int i_778_, int i_779_) {
	method2272(i, i_775_, i_776_, i_778_, i_779_);
	method2272(i, i_775_ + i_777_ - 1, i_776_, i_778_, i_779_);
	method2273(i, 1 + i_775_, i_777_ - 2, i_778_, i_779_);
	method2273(i + i_776_ - 1, i_775_ + 1, i_777_ - 2, i_778_, i_779_);
    }
    
    public int[] method2377(int i, int i_780_, int i_781_, int i_782_) {
	if (((Class103_Sub2) this).anIntArray9245 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_781_ * i_782_];
	int i_783_ = 0;
	for (int i_784_ = 0; i_784_ < i_782_; i_784_++) {
	    int i_785_
		= ((i_784_ + i_780_) * (-1826993761
					* ((Class103_Sub2) this).anInt9260)
		   + i);
	    for (int i_786_ = 0; i_786_ < i_781_; i_786_++)
		is[i_783_++]
		    = ((Class103_Sub2) this).anIntArray9245[i_786_ + i_785_];
	}
	return is;
    }
    
    void method2507(float f, float f_787_, float f_788_, float f_789_,
		    float f_790_, float f_791_) {
	/* empty */
    }
    
    public Class135 method2521(int i, int i_792_, int[] is, int[] is_793_) {
	return new Class135_Sub1(i, i_792_, is, is_793_);
    }
    
    public void method2261() {
	/* empty */
    }
    
    public void method2381() {
	/* empty */
    }
    
    void method15402(int i, int i_794_, int[] is, float[] fs) {
	((Class103_Sub2) this).anInt9260 = i * 1904120415;
	((Class103_Sub2) this).anInt9278 = i_794_ * -710038965;
	((Class103_Sub2) this).anIntArray9245 = is;
	((Class103_Sub2) this).aFloatArray9248 = fs;
	for (int i_795_ = 0;
	     i_795_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_795_++)
	    ((Class103_Sub2) this).aClass189Array9275[i_795_]
		.method3871(1019853989);
	method2572();
	method2295();
    }
    
    public void method2383(int[] is) {
	is[0] = -1826993761 * ((Class103_Sub2) this).anInt9260;
	is[1] = ((Class103_Sub2) this).anInt9278 * -2069999773;
    }
    
    public void method2404(int[] is) {
	is[0] = ((Class103_Sub2) this).anInt9249 * 1298750001;
	is[1] = -788450385 * ((Class103_Sub2) this).anInt9254;
	is[2] = 325436811 * ((Class103_Sub2) this).anInt9250;
	is[3] = 1546170165 * ((Class103_Sub2) this).anInt9252;
    }
    
    public Class168 method2443(int i, int i_796_, int i_797_, int i_798_,
			       boolean bool) {
	if (((Class103_Sub2) this).anIntArray9245 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_798_ * i_797_];
	int i_799_
	    = i + i_796_ * (-1826993761 * ((Class103_Sub2) this).anInt9260);
	int i_800_ = -1826993761 * ((Class103_Sub2) this).anInt9260 - i_797_;
	for (int i_801_ = 0; i_801_ < i_798_; i_801_++) {
	    int i_802_ = i_801_ * i_797_;
	    for (int i_803_ = 0; i_803_ < i_797_; i_803_++)
		is[i_803_ + i_802_]
		    = ((Class103_Sub2) this).anIntArray9245[i_799_++];
	    i_799_ += i_800_;
	}
	if (bool)
	    return new Class168_Sub2_Sub2(this, is, i_797_, i_798_);
	return new Class168_Sub2_Sub1(this, is, i_797_, i_798_);
    }
    
    public void method2409(int i, int i_804_, int i_805_, int i_806_,
			   int i_807_, int i_808_) {
	method2272(i, i_804_, i_805_, i_807_, i_808_);
	method2272(i, i_804_ + i_806_ - 1, i_805_, i_807_, i_808_);
	method2273(i, 1 + i_804_, i_806_ - 2, i_807_, i_808_);
	method2273(i + i_805_ - 1, i_804_ + 1, i_806_ - 2, i_807_, i_808_);
    }
    
    public void method2375(boolean bool) {
	Class189 class189 = method15377(Thread.currentThread());
	((Class189) class189).aBool2220 = bool;
    }
    
    public void method2390() {
	((Class103_Sub2) this).anInt9264 = 0;
	((Class103_Sub2) this).anInt9265 = 0;
	((Class103_Sub2) this).anInt9251
	    = -478795821 * ((Class103_Sub2) this).anInt9260;
	((Class103_Sub2) this).anInt9267
	    = -712079869 * ((Class103_Sub2) this).anInt9278;
	method15372();
    }
    
    public void method2388(boolean bool) {
	Class189 class189 = method15377(Thread.currentThread());
	((Class189) class189).aBool2220 = bool;
    }
    
    public boolean method2453() {
	return false;
    }
    
    boolean method15403() {
	return ((Class103_Sub2) this).aBool9246;
    }
    
    public void method2526() {
	((Class103_Sub2) this).anInt9264 = 0;
	((Class103_Sub2) this).anInt9265 = 0;
	((Class103_Sub2) this).anInt9251
	    = -478795821 * ((Class103_Sub2) this).anInt9260;
	((Class103_Sub2) this).anInt9267
	    = -712079869 * ((Class103_Sub2) this).anInt9278;
	method15372();
    }
    
    public void method2392() {
	((Class103_Sub2) this).anInt9264 = 0;
	((Class103_Sub2) this).anInt9265 = 0;
	((Class103_Sub2) this).anInt9251
	    = -478795821 * ((Class103_Sub2) this).anInt9260;
	((Class103_Sub2) this).anInt9267
	    = -712079869 * ((Class103_Sub2) this).anInt9278;
	method15372();
    }
    
    public void method2393(int i, int i_809_, int i_810_, int i_811_) {
	((Class103_Sub2) this).anInt9264 = i * -581464337;
	((Class103_Sub2) this).anInt9265 = i_809_ * 495728313;
	((Class103_Sub2) this).anInt9251 = i_810_ * -2006377139;
	((Class103_Sub2) this).anInt9267 = 1153843425 * i_811_;
	method15372();
    }
    
    public void method2394(int i, int i_812_, int i_813_, int i_814_) {
	((Class103_Sub2) this).anInt9264 = i * -581464337;
	((Class103_Sub2) this).anInt9265 = i_812_ * 495728313;
	((Class103_Sub2) this).anInt9251 = i_813_ * -2006377139;
	((Class103_Sub2) this).anInt9267 = 1153843425 * i_814_;
	method15372();
    }
    
    public void method2324(int i, int i_815_, int i_816_, int i_817_) {
	((Class103_Sub2) this).anInt9264 = i * -581464337;
	((Class103_Sub2) this).anInt9265 = i_815_ * 495728313;
	((Class103_Sub2) this).anInt9251 = i_816_ * -2006377139;
	((Class103_Sub2) this).anInt9267 = 1153843425 * i_817_;
	method15372();
    }
    
    public void method2345() {
	/* empty */
    }
    
    public void method2397(float f, float f_818_) {
	((Class103_Sub2) this).aFloat9272 = f_818_ - f;
	((Class103_Sub2) this).aFloat9276 = f_818_ + f - 1.0F;
	for (int i = 0; i < ((Class103_Sub2) this).anInt9274 * 592623211;
	     i++) {
	    Class189 class189 = ((Class103_Sub2) this).aClass189Array9275[i];
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aFloat1732
		= ((Class103_Sub2) this).aFloat9272;
	    ((Class155) class155).aFloat1720
		= ((Class103_Sub2) this).aFloat9276;
	}
    }
    
    public Class266 method2556() {
	return new Class266(((Class103_Sub2) this).aClass266_9259);
    }
    
    public void method2297(int i, int i_819_, int i_820_, int i_821_,
			   int i_822_, int i_823_, Class135 class135,
			   int i_824_, int i_825_, int i_826_, int i_827_,
			   int i_828_) {
	if (((Class103_Sub2) this).anIntArray9245 != null) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    int[] is = ((Class135_Sub1) class135_sub1).anIntArray9874;
	    int[] is_829_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	    int i_830_
		= (-788450385 * ((Class103_Sub2) this).anInt9254 > i_825_
		   ? ((Class103_Sub2) this).anInt9254 * -788450385 : i_825_);
	    int i_831_ = ((((Class103_Sub2) this).anInt9252 * 1546170165
			   < i_825_ + is.length)
			  ? 1546170165 * ((Class103_Sub2) this).anInt9252
			  : i_825_ + is.length);
	    i_828_ <<= 8;
	    i_826_ <<= 8;
	    i_827_ <<= 8;
	    int i_832_ = i_826_ + i_827_;
	    i_828_ %= i_832_;
	    i_820_ -= i;
	    i_821_ -= i_819_;
	    if (i_820_ + i_821_ < 0) {
		int i_833_ = (int) (Math.sqrt((double) (i_820_ * i_820_
							+ i_821_ * i_821_))
				    * 256.0);
		int i_834_ = i_833_ % i_832_;
		i_828_ = i_826_ + i_832_ - i_828_ - i_834_;
		i_828_ %= i_832_;
		if (i_828_ < 0)
		    i_828_ += i_832_;
		i += i_820_;
		i_820_ = -i_820_;
		i_819_ += i_821_;
		i_821_ = -i_821_;
	    }
	    if (i_820_ > i_821_) {
		i_819_ <<= 16;
		i_819_ += 32768;
		i_821_ <<= 16;
		int i_835_ = (int) Math.floor((double) i_821_ / (double) i_820_
					      + 0.5);
		i_820_ += i;
		int i_836_ = i_822_ >>> 24;
		int i_837_
		    = (int) Math.sqrt((double) (65536
						+ (i_835_ >> 8) * (i_835_
								   >> 8)));
		if (i_823_ == 0 || 1 == i_823_ && i_836_ == 255) {
		    while (i <= i_820_) {
			int i_838_ = i_819_ >> 16;
			int i_839_ = i_838_ - i_825_;
			if (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
			    && i < 325436811 * ((Class103_Sub2) this).anInt9250
			    && i_838_ >= i_830_ && i_838_ < i_831_
			    && i_828_ < i_826_) {
			    int i_840_ = is[i_839_] + i_824_;
			    if (i >= i_840_ && i < i_840_ + is_829_[i_839_])
				((Class103_Sub2) this).anIntArray9245
				    [(((Class103_Sub2) this).anInt9260
				      * -1826993761 * i_838_) + i]
				    = i_822_;
			}
			i_819_ += i_835_;
			i++;
			i_828_ += i_837_;
			i_828_ %= i_832_;
		    }
		} else if (1 == i_823_) {
		    i_822_ = (((i_822_ & 0xff00ff) * i_836_ >> 8 & 0xff00ff)
			      + (i_836_ * (i_822_ & 0xff00) >> 8 & 0xff00)
			      + (i_836_ << 24));
		    int i_841_ = 256 - i_836_;
		    while (i <= i_820_) {
			int i_842_ = i_819_ >> 16;
			int i_843_ = i_842_ - i_825_;
			if (i >= 1298750001 * ((Class103_Sub2) this).anInt9249
			    && i < 325436811 * ((Class103_Sub2) this).anInt9250
			    && i_842_ >= i_830_ && i_842_ < i_831_
			    && i_828_ < i_826_) {
			    int i_844_ = is[i_843_] + i_824_;
			    if (i >= i_844_ && i < is_829_[i_843_] + i_844_) {
				int i_845_
				    = i + (i_842_
					   * (((Class103_Sub2) this).anInt9260
					      * -1826993761));
				int i_846_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_845_]);
				i_846_ = (((i_846_ & 0xff00) * i_841_ >> 8
					   & 0xff00)
					  + (i_841_ * (i_846_ & 0xff00ff) >> 8
					     & 0xff00ff));
				((Class103_Sub2) this).anIntArray9245[i_845_]
				    = i_822_ + i_846_;
			    }
			}
			i_819_ += i_835_;
			i++;
			i_828_ += i_837_;
			i_828_ %= i_832_;
		    }
		} else if (2 == i_823_) {
		    while (i <= i_820_) {
			int i_847_ = i_819_ >> 16;
			int i_848_ = i_847_ - i_825_;
			if (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
			    && i < ((Class103_Sub2) this).anInt9250 * 325436811
			    && i_847_ >= i_830_ && i_847_ < i_831_
			    && i_828_ < i_826_) {
			    int i_849_ = is[i_848_] + i_824_;
			    if (i >= i_849_ && i < i_849_ + is_829_[i_848_]) {
				int i_850_
				    = i + (-1826993761
					   * ((Class103_Sub2) this).anInt9260
					   * i_847_);
				int i_851_ = (((Class103_Sub2) this)
					      .anIntArray9245[i_850_]);
				int i_852_ = i_822_ + i_851_;
				int i_853_ = ((i_851_ & 0xff00ff)
					      + (i_822_ & 0xff00ff));
				i_851_
				    = (i_853_ & 0x1000100) + (i_852_ - i_853_
							      & 0x10000);
				((Class103_Sub2) this).anIntArray9245[i_850_]
				    = i_852_ - i_851_ | i_851_ - (i_851_
								  >>> 8);
			    }
			}
			i_819_ += i_835_;
			i++;
			i_828_ += i_837_;
			i_828_ %= i_832_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_820_ <<= 16;
		int i_854_ = (int) Math.floor(0.5 + ((double) i_820_
						     / (double) i_821_));
		int i_855_
		    = (int) Math.sqrt((double) ((i_854_ >> 8) * (i_854_ >> 8)
						+ 65536));
		i_821_ += i_819_;
		int i_856_ = i_822_ >>> 24;
		if (0 == i_823_ || i_823_ == 1 && i_856_ == 255) {
		    while (i_819_ <= i_821_) {
			int i_857_ = i >> 16;
			int i_858_ = i_819_ - i_825_;
			if (i_819_ >= i_830_ && i_819_ < i_831_
			    && i_857_ >= (1298750001
					  * ((Class103_Sub2) this).anInt9249)
			    && (i_857_
				< ((Class103_Sub2) this).anInt9250 * 325436811)
			    && i_828_ < i_826_ && i_857_ >= is[i_858_] + i_824_
			    && i_857_ < is_829_[i_858_] + (is[i_858_]
							   + i_824_))
			    ((Class103_Sub2) this).anIntArray9245
				[((-1826993761
				   * ((Class103_Sub2) this).anInt9260 * i_819_)
				  + i_857_)]
				= i_822_;
			i += i_854_;
			i_819_++;
			i_828_ += i_855_;
			i_828_ %= i_832_;
		    }
		} else if (i_823_ == 1) {
		    i_822_ = ((i_856_ << 24)
			      + (((i_822_ & 0xff00) * i_856_ >> 8 & 0xff00)
				 + (i_856_ * (i_822_ & 0xff00ff) >> 8
				    & 0xff00ff)));
		    int i_859_ = 256 - i_856_;
		    while (i_819_ <= i_821_) {
			int i_860_ = i >> 16;
			int i_861_ = i_819_ - i_825_;
			if (i_819_ >= i_830_ && i_819_ < i_831_
			    && i_860_ >= (1298750001
					  * ((Class103_Sub2) this).anInt9249)
			    && (i_860_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_828_ < i_826_ && i_860_ >= i_824_ + is[i_861_]
			    && (i_860_
				< i_824_ + is[i_861_] + is_829_[i_861_])) {
			    int i_862_
				= (i_819_ * (((Class103_Sub2) this).anInt9260
					     * -1826993761)
				   + i_860_);
			    int i_863_ = (((Class103_Sub2) this).anIntArray9245
					  [i_862_]);
			    i_863_ = (((i_863_ & 0xff00ff) * i_859_ >> 8
				       & 0xff00ff)
				      + ((i_863_ & 0xff00) * i_859_ >> 8
					 & 0xff00));
			    ((Class103_Sub2) this).anIntArray9245
				[i_819_ * (((Class103_Sub2) this).anInt9260
					   * -1826993761) + i_860_]
				= i_822_ + i_863_;
			}
			i += i_854_;
			i_819_++;
			i_828_ += i_855_;
			i_828_ %= i_832_;
		    }
		} else if (i_823_ == 2) {
		    while (i_819_ <= i_821_) {
			int i_864_ = i >> 16;
			int i_865_ = i_819_ - i_825_;
			if (i_819_ >= i_830_ && i_819_ < i_831_
			    && i_864_ >= (1298750001
					  * ((Class103_Sub2) this).anInt9249)
			    && (i_864_
				< ((Class103_Sub2) this).anInt9250 * 325436811)
			    && i_828_ < i_826_ && i_864_ >= i_824_ + is[i_865_]
			    && (i_864_
				< i_824_ + is[i_865_] + is_829_[i_865_])) {
			    int i_866_ = ((((Class103_Sub2) this).anInt9260
					   * -1826993761 * i_819_)
					  + i_864_);
			    int i_867_ = (((Class103_Sub2) this).anIntArray9245
					  [i_866_]);
			    int i_868_ = i_867_ + i_822_;
			    int i_869_
				= (i_867_ & 0xff00ff) + (i_822_ & 0xff00ff);
			    i_867_
				= (i_868_ - i_869_ & 0x10000) + (i_869_
								 & 0x1000100);
			    ((Class103_Sub2) this).anIntArray9245[i_866_]
				= i_868_ - i_867_ | i_867_ - (i_867_ >>> 8);
			}
			i += i_854_;
			i_819_++;
			i_828_ += i_855_;
			i_828_ %= i_832_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method15404() {
	int i = (325436811 * ((Class103_Sub2) this).anInt9250
		 - ((Class103_Sub2) this).anInt9249 * 1298750001);
	int i_870_ = (1546170165 * ((Class103_Sub2) this).anInt9252
		      - -788450385 * ((Class103_Sub2) this).anInt9254);
	float f = (((Class103_Sub2) this).aFloat9268
		   = ((float) (-1144298619 * ((Class103_Sub2) this).anInt9251)
		      / 2.0F));
	float f_871_ = (((Class103_Sub2) this).aFloat9270
			= (float) (-762379487
				   * ((Class103_Sub2) this).anInt9267) / 2.0F);
	((Class103_Sub2) this).aFloat9277
	    = f + (float) (((Class103_Sub2) this).anInt9264 * -771006449);
	((Class103_Sub2) this).aFloat9271
	    = (float) (534835081 * ((Class103_Sub2) this).anInt9265) + f_871_;
	for (int i_872_ = 0;
	     i_872_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_872_++) {
	    Class189 class189
		= ((Class103_Sub2) this).aClass189Array9275[i_872_];
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aFloat1728 = f;
	    ((Class155) class155).aFloat1729 = f_871_;
	    ((Class155) class155).aFloat1727
		= (((Class103_Sub2) this).aFloat9277
		   - (float) (1298750001 * ((Class103_Sub2) this).anInt9249));
	    ((Class155) class155).aFloat1731
		= (((Class103_Sub2) this).aFloat9271
		   - (float) (-788450385 * ((Class103_Sub2) this).anInt9254));
	    ((Class155) class155).anInt1733 = i;
	    ((Class155) class155).anInt1726 = i_870_;
	}
	int i_873_ = ((-1826993761 * ((Class103_Sub2) this).anInt9260
		       * (-788450385 * ((Class103_Sub2) this).anInt9254))
		      + ((Class103_Sub2) this).anInt9249 * 1298750001);
	for (int i_874_ = -788450385 * ((Class103_Sub2) this).anInt9254;
	     i_874_ < ((Class103_Sub2) this).anInt9252 * 1546170165;
	     i_874_++) {
	    for (int i_875_ = 0;
		 i_875_ < ((Class103_Sub2) this).anInt9274 * 592623211;
		 i_875_++)
		((Class155) (((Class189) (((Class103_Sub2) this)
					  .aClass189Array9275[i_875_]))
			     .aClass155_2223))
		    .anIntArray1730
		    [i_874_ - -788450385 * ((Class103_Sub2) this).anInt9254]
		    = i_873_;
	    i_873_ += -1826993761 * ((Class103_Sub2) this).anInt9260;
	}
    }
    
    public void method2398() {
	((Class103_Sub2) this).anInt9249 = 0;
	((Class103_Sub2) this).anInt9254 = 0;
	((Class103_Sub2) this).anInt9250
	    = ((Class103_Sub2) this).anInt9260 * 1957205693;
	((Class103_Sub2) this).anInt9252
	    = ((Class103_Sub2) this).anInt9278 * -219390153;
	method15372();
    }
    
    public void method2399(int i, int i_876_, int i_877_, int i_878_) {
	if (i < 0)
	    i = 0;
	if (i_876_ < 0)
	    i_876_ = 0;
	if (i_877_ > ((Class103_Sub2) this).anInt9260 * -1826993761)
	    i_877_ = ((Class103_Sub2) this).anInt9260 * -1826993761;
	if (i_878_ > -2069999773 * ((Class103_Sub2) this).anInt9278)
	    i_878_ = -2069999773 * ((Class103_Sub2) this).anInt9278;
	((Class103_Sub2) this).anInt9249 = 211664593 * i;
	((Class103_Sub2) this).anInt9250 = 244169251 * i_877_;
	((Class103_Sub2) this).anInt9254 = -1495661745 * i_876_;
	((Class103_Sub2) this).anInt9252 = 1034251037 * i_878_;
	method15372();
    }
    
    void method2415(int i, int i_879_, int i_880_, int i_881_, int i_882_) {
	if (null != ((Class103_Sub2) this).anIntArray9245
	    && (i_879_ >= -788450385 * ((Class103_Sub2) this).anInt9254
		&& i_879_ < ((Class103_Sub2) this).anInt9252 * 1546170165)) {
	    if (i < ((Class103_Sub2) this).anInt9249 * 1298750001) {
		i_880_ -= ((Class103_Sub2) this).anInt9249 * 1298750001 - i;
		i = ((Class103_Sub2) this).anInt9249 * 1298750001;
	    }
	    if (i + i_880_ > 325436811 * ((Class103_Sub2) this).anInt9250)
		i_880_ = ((Class103_Sub2) this).anInt9250 * 325436811 - i;
	    int i_883_
		= i + ((Class103_Sub2) this).anInt9260 * -1826993761 * i_879_;
	    int i_884_ = i_881_ >>> 24;
	    if (i_882_ == 0 || i_882_ == 1 && i_884_ == 255) {
		for (int i_885_ = 0; i_885_ < i_880_; i_885_++)
		    ((Class103_Sub2) this).anIntArray9245[i_885_ + i_883_]
			= i_881_;
	    } else if (1 == i_882_) {
		i_881_ = (((i_881_ & 0xff00) * i_884_ >> 8 & 0xff00)
			  + (i_884_ * (i_881_ & 0xff00ff) >> 8 & 0xff00ff)
			  + (i_884_ << 24));
		int i_886_ = 256 - i_884_;
		for (int i_887_ = 0; i_887_ < i_880_; i_887_++) {
		    int i_888_ = (((Class103_Sub2) this).anIntArray9245
				  [i_887_ + i_883_]);
		    i_888_ = (((i_888_ & 0xff00ff) * i_886_ >> 8 & 0xff00ff)
			      + (i_886_ * (i_888_ & 0xff00) >> 8 & 0xff00));
		    ((Class103_Sub2) this).anIntArray9245[i_887_ + i_883_]
			= i_888_ + i_881_;
		}
	    } else if (i_882_ == 2) {
		for (int i_889_ = 0; i_889_ < i_880_; i_889_++) {
		    int i_890_ = (((Class103_Sub2) this).anIntArray9245
				  [i_889_ + i_883_]);
		    int i_891_ = i_881_ + i_890_;
		    int i_892_ = (i_881_ & 0xff00ff) + (i_890_ & 0xff00ff);
		    i_890_
			= (i_892_ & 0x1000100) + (i_891_ - i_892_ & 0x10000);
		    ((Class103_Sub2) this).anIntArray9245[i_889_ + i_883_]
			= i_891_ - i_890_ | i_890_ - (i_890_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public Class168 method2437(int i, int i_893_, boolean bool,
			       boolean bool_894_) {
	if (bool)
	    return new Class168_Sub2_Sub2(this, i, i_893_);
	return new Class168_Sub2_Sub1(this, i, i_893_);
    }
    
    public void method2402(int i, int i_895_, int i_896_, int i_897_) {
	if (1298750001 * ((Class103_Sub2) this).anInt9249 < i)
	    ((Class103_Sub2) this).anInt9249 = i * 211664593;
	if (((Class103_Sub2) this).anInt9254 * -788450385 < i_895_)
	    ((Class103_Sub2) this).anInt9254 = i_895_ * -1495661745;
	if (((Class103_Sub2) this).anInt9250 * 325436811 > i_896_)
	    ((Class103_Sub2) this).anInt9250 = 244169251 * i_896_;
	if (((Class103_Sub2) this).anInt9252 * 1546170165 > i_897_)
	    ((Class103_Sub2) this).anInt9252 = i_897_ * 1034251037;
	method15372();
    }
    
    public boolean method2498() {
	return false;
    }
    
    public void method2252() {
	/* empty */
    }
    
    public void method2389() {
	((Class103_Sub2) this).anInt9264 = 0;
	((Class103_Sub2) this).anInt9265 = 0;
	((Class103_Sub2) this).anInt9251
	    = -478795821 * ((Class103_Sub2) this).anInt9260;
	((Class103_Sub2) this).anInt9267
	    = -712079869 * ((Class103_Sub2) this).anInt9278;
	method15372();
    }
    
    public void method2406(int i, int i_898_) {
	if ((i & 0x1) != 0)
	    method2396(0, 0, -1826993761 * ((Class103_Sub2) this).anInt9260,
		       -2069999773 * ((Class103_Sub2) this).anInt9278, i_898_,
		       0);
	if (0 != (i & 0x2))
	    method15424();
    }
    
    public void method2532(int i, Class241_Sub43[] class241_sub43s) {
	/* empty */
    }
    
    public void method2373(int i, int i_899_, int i_900_, int i_901_,
			   int i_902_, int i_903_) {
	method2272(i, i_899_, i_900_, i_902_, i_903_);
	method2272(i, i_899_ + i_901_ - 1, i_900_, i_902_, i_903_);
	method2273(i, 1 + i_899_, i_901_ - 2, i_902_, i_903_);
	method2273(i + i_900_ - 1, i_899_ + 1, i_901_ - 2, i_902_, i_903_);
    }
    
    public boolean method2361() {
	return false;
    }
    
    public void method2410(int i, int i_904_, int i_905_, int i_906_,
			   int i_907_, int i_908_) {
	method2272(i, i_904_, i_905_, i_907_, i_908_);
	method2272(i, i_904_ + i_906_ - 1, i_905_, i_907_, i_908_);
	method2273(i, 1 + i_904_, i_906_ - 2, i_907_, i_908_);
	method2273(i + i_905_ - 1, i_904_ + 1, i_906_ - 2, i_907_, i_908_);
    }
    
    public boolean method2352() {
	return false;
    }
    
    public void method2462(int i, int i_909_, int i_910_, int i_911_,
			   int i_912_, int i_913_) {
	if (((Class103_Sub2) this).anIntArray9245 != null) {
	    if (i < 1298750001 * ((Class103_Sub2) this).anInt9249) {
		i_910_ -= 1298750001 * ((Class103_Sub2) this).anInt9249 - i;
		i = ((Class103_Sub2) this).anInt9249 * 1298750001;
	    }
	    if (i_909_ < ((Class103_Sub2) this).anInt9254 * -788450385) {
		i_911_
		    -= ((Class103_Sub2) this).anInt9254 * -788450385 - i_909_;
		i_909_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    }
	    if (i + i_910_ > 325436811 * ((Class103_Sub2) this).anInt9250)
		i_910_ = 325436811 * ((Class103_Sub2) this).anInt9250 - i;
	    if (i_909_ + i_911_
		> 1546170165 * ((Class103_Sub2) this).anInt9252)
		i_911_
		    = 1546170165 * ((Class103_Sub2) this).anInt9252 - i_909_;
	    if (i_910_ > 0 && i_911_ > 0
		&& i <= ((Class103_Sub2) this).anInt9250 * 325436811
		&& i_909_ <= ((Class103_Sub2) this).anInt9252 * 1546170165) {
		int i_914_
		    = ((Class103_Sub2) this).anInt9260 * -1826993761 - i_910_;
		int i_915_ = i + (((Class103_Sub2) this).anInt9260
				  * -1826993761 * i_909_);
		int i_916_ = i_912_ >>> 24;
		if (0 == i_913_ || 1 == i_913_ && i_916_ == 255) {
		    int i_917_ = i_910_ >> 3;
		    int i_918_ = i_910_ & 0x7;
		    i_910_ = i_915_ - 1;
		    for (int i_919_ = -i_911_; i_919_ < 0; i_919_++) {
			if (i_917_ > 0) {
			    i = i_917_;
			    do {
				((Class103_Sub2) this).anIntArray9245[++i_910_]
				    = i_912_;
				((Class103_Sub2) this).anIntArray9245[++i_910_]
				    = i_912_;
				((Class103_Sub2) this).anIntArray9245[++i_910_]
				    = i_912_;
				((Class103_Sub2) this).anIntArray9245[++i_910_]
				    = i_912_;
				((Class103_Sub2) this).anIntArray9245[++i_910_]
				    = i_912_;
				((Class103_Sub2) this).anIntArray9245[++i_910_]
				    = i_912_;
				((Class103_Sub2) this).anIntArray9245[++i_910_]
				    = i_912_;
				((Class103_Sub2) this).anIntArray9245[++i_910_]
				    = i_912_;
			    } while (--i > 0);
			}
			if (i_918_ > 0) {
			    i = i_918_;
			    do
				((Class103_Sub2) this).anIntArray9245[++i_910_]
				    = i_912_;
			    while (--i > 0);
			}
			i_910_ += i_914_;
		    }
		} else if (i_913_ == 1) {
		    i_912_
			= ((i_916_ * ((i_912_ & ~0xff00ff) >>> 8) & ~0xff00ff)
			   + (i_916_ * (i_912_ & 0xff00ff) >> 8 & 0xff00ff));
		    int i_920_ = 256 - i_916_;
		    for (int i_921_ = 0; i_921_ < i_911_; i_921_++) {
			for (int i_922_ = -i_910_; i_922_ < 0; i_922_++) {
			    int i_923_ = (((Class103_Sub2) this).anIntArray9245
					  [i_915_]);
			    i_923_ = ((i_920_ * (i_923_ & 0xff00ff) >> 8
				       & 0xff00ff)
				      + (((i_923_ & ~0xff00ff) >>> 8) * i_920_
					 & ~0xff00ff));
			    ((Class103_Sub2) this).anIntArray9245[i_915_++]
				= i_912_ + i_923_;
			}
			i_915_ += i_914_;
		    }
		} else if (2 == i_913_) {
		    for (int i_924_ = 0; i_924_ < i_911_; i_924_++) {
			for (int i_925_ = -i_910_; i_925_ < 0; i_925_++) {
			    int i_926_ = (((Class103_Sub2) this).anIntArray9245
					  [i_915_]);
			    int i_927_ = i_926_ + i_912_;
			    int i_928_
				= (i_912_ & 0xff00ff) + (i_926_ & 0xff00ff);
			    i_926_
				= (i_927_ - i_928_ & 0x10000) + (i_928_
								 & 0x1000100);
			    ((Class103_Sub2) this).anIntArray9245[i_915_++]
				= i_927_ - i_926_ | i_926_ - (i_926_ >>> 8);
			}
			i_915_ += i_914_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method15405(boolean bool, boolean bool_929_, boolean bool_930_,
		     Class247_Sub1_Sub1 class247_sub1_sub1, int i, int i_931_,
		     float f, int i_932_) {
	int i_933_ = class247_sub1_sub1.anInt11062;
	int i_934_ = i_932_;
	i_932_ <<= 1;
	if (-1 == i_933_)
	    method15381(bool_929_, i, i_931_, f, i_934_,
			class247_sub1_sub1.anInt11065, 1);
	else {
	    if (i_933_ != ((Class103_Sub2) this).anInt9253 * -1406521185) {
		Class168 class168
		    = (Class168) ((Class103_Sub2) this).aClass129_9247
				     .get((long) i_933_);
		if (null == class168) {
		    Class101 class101
			= aClass107_1458.method2680(i_933_, 1209794316);
		    int[] is
			= method15389(i_933_, 218388063 * class101.anInt1403);
		    if (is != null) {
			int i_935_ = 608905203 * class101.anInt1406;
			class168 = method2259(is, 0, i_935_, i_935_, i_935_,
					      (byte) -19);
			((Class103_Sub2) this).aClass129_9247
			    .put(class168, (long) i_933_);
		    } else
			return;
		}
		((Class103_Sub2) this).anInt9253 = 1418390367 * i_933_;
		((Class103_Sub2) this).aClass168_9269 = class168;
	    }
	    i_932_++;
	    ((Class168_Sub2) ((Class103_Sub2) this).aClass168_9269).method16221
		(bool, bool_929_, bool_930_, i - i_934_, i_931_ - i_934_, f,
		 i_932_, i_932_, 0, class247_sub1_sub1.anInt11065, 1, 1,
		 false);
	}
    }
    
    void method2559(int i, int i_936_, int i_937_, int i_938_, int i_939_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    if (i_937_ < 0)
		i_937_ = -i_937_;
	    int i_940_ = i_936_ - i_937_;
	    if (i_940_ < ((Class103_Sub2) this).anInt9254 * -788450385)
		i_940_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    int i_941_ = 1 + (i_936_ + i_937_);
	    if (i_941_ > ((Class103_Sub2) this).anInt9252 * 1546170165)
		i_941_ = ((Class103_Sub2) this).anInt9252 * 1546170165;
	    int i_942_ = i_940_;
	    int i_943_ = i_937_ * i_937_;
	    int i_944_ = 0;
	    int i_945_ = i_936_ - i_942_;
	    int i_946_ = i_945_ * i_945_;
	    int i_947_ = i_946_ - i_945_;
	    if (i_936_ > i_941_)
		i_936_ = i_941_;
	    int i_948_ = i_938_ >>> 24;
	    if (i_939_ == 0 || i_939_ == 1 && 255 == i_948_) {
		while (i_942_ < i_936_) {
		    for (/**/; i_947_ <= i_943_ || i_946_ <= i_943_;
			 i_947_ += i_944_++ + i_944_)
			i_946_ += i_944_ + i_944_;
		    int i_949_ = i - i_944_ + 1;
		    if (i_949_ < ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_949_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_950_ = i_944_ + i;
		    if (i_950_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_950_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_951_ = ((-1826993761
				   * ((Class103_Sub2) this).anInt9260 * i_942_)
				  + i_949_);
		    for (int i_952_ = i_949_; i_952_ < i_950_; i_952_++)
			((Class103_Sub2) this).anIntArray9245[i_951_++]
			    = i_938_;
		    i_942_++;
		    i_946_ -= i_945_-- + i_945_;
		    i_947_ -= i_945_ + i_945_;
		}
		i_944_ = i_937_;
		i_945_ = i_942_ - i_936_;
		i_947_ = i_943_ + i_945_ * i_945_;
		i_946_ = i_947_ - i_944_;
		i_947_ -= i_945_;
		while (i_942_ < i_941_) {
		    for (/**/; i_947_ > i_943_ && i_946_ > i_943_;
			 i_946_ -= i_944_ + i_944_)
			i_947_ -= i_944_-- + i_944_;
		    int i_953_ = i - i_944_;
		    if (i_953_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_953_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_954_ = i + i_944_;
		    if (i_954_
			> ((Class103_Sub2) this).anInt9250 * 325436811 - 1)
			i_954_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_955_ = i_953_ + (((Class103_Sub2) this).anInt9260
					   * -1826993761 * i_942_);
		    for (int i_956_ = i_953_; i_956_ <= i_954_; i_956_++)
			((Class103_Sub2) this).anIntArray9245[i_955_++]
			    = i_938_;
		    i_942_++;
		    i_947_ += i_945_ + i_945_;
		    i_946_ += i_945_++ + i_945_;
		}
	    } else if (i_939_ == 1) {
		i_938_ = (((i_938_ & 0xff00ff) * i_948_ >> 8 & 0xff00ff)
			  + ((i_938_ & 0xff00) * i_948_ >> 8 & 0xff00)
			  + (i_948_ << 24));
		int i_957_ = 256 - i_948_;
		while (i_942_ < i_936_) {
		    for (/**/; i_947_ <= i_943_ || i_946_ <= i_943_;
			 i_947_ += i_944_++ + i_944_)
			i_946_ += i_944_ + i_944_;
		    int i_958_ = i - i_944_ + 1;
		    if (i_958_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_958_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_959_ = i + i_944_;
		    if (i_959_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_959_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_960_ = i_958_ + (((Class103_Sub2) this).anInt9260
					   * -1826993761 * i_942_);
		    for (int i_961_ = i_958_; i_961_ < i_959_; i_961_++) {
			int i_962_
			    = ((Class103_Sub2) this).anIntArray9245[i_960_];
			i_962_ = ((i_957_ * (i_962_ & 0xff00) >> 8 & 0xff00)
				  + ((i_962_ & 0xff00ff) * i_957_ >> 8
				     & 0xff00ff));
			((Class103_Sub2) this).anIntArray9245[i_960_++]
			    = i_938_ + i_962_;
		    }
		    i_942_++;
		    i_946_ -= i_945_-- + i_945_;
		    i_947_ -= i_945_ + i_945_;
		}
		i_944_ = i_937_;
		i_945_ = -i_945_;
		i_947_ = i_945_ * i_945_ + i_943_;
		i_946_ = i_947_ - i_944_;
		i_947_ -= i_945_;
		while (i_942_ < i_941_) {
		    for (/**/; i_947_ > i_943_ && i_946_ > i_943_;
			 i_946_ -= i_944_ + i_944_)
			i_947_ -= i_944_-- + i_944_;
		    int i_963_ = i - i_944_;
		    if (i_963_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_963_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_964_ = i_944_ + i;
		    if (i_964_
			> 325436811 * ((Class103_Sub2) this).anInt9250 - 1)
			i_964_
			    = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		    int i_965_
			= (i_963_
			   + i_942_ * (-1826993761
				       * ((Class103_Sub2) this).anInt9260));
		    for (int i_966_ = i_963_; i_966_ <= i_964_; i_966_++) {
			int i_967_
			    = ((Class103_Sub2) this).anIntArray9245[i_965_];
			i_967_
			    = ((i_957_ * (i_967_ & 0xff00ff) >> 8 & 0xff00ff)
			       + ((i_967_ & 0xff00) * i_957_ >> 8 & 0xff00));
			((Class103_Sub2) this).anIntArray9245[i_965_++]
			    = i_938_ + i_967_;
		    }
		    i_942_++;
		    i_947_ += i_945_ + i_945_;
		    i_946_ += i_945_++ + i_945_;
		}
	    } else if (2 == i_939_) {
		while (i_942_ < i_936_) {
		    for (/**/; i_947_ <= i_943_ || i_946_ <= i_943_;
			 i_947_ += i_944_++ + i_944_)
			i_946_ += i_944_ + i_944_;
		    int i_968_ = 1 + (i - i_944_);
		    if (i_968_ < 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_968_ = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_969_ = i + i_944_;
		    if (i_969_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_969_ = 325436811 * ((Class103_Sub2) this).anInt9250;
		    int i_970_ = ((((Class103_Sub2) this).anInt9260
				   * -1826993761 * i_942_)
				  + i_968_);
		    for (int i_971_ = i_968_; i_971_ < i_969_; i_971_++) {
			int i_972_
			    = ((Class103_Sub2) this).anIntArray9245[i_970_];
			int i_973_ = i_972_ + i_938_;
			int i_974_ = (i_972_ & 0xff00ff) + (i_938_ & 0xff00ff);
			i_972_ = (i_974_ & 0x1000100) + (i_973_ - i_974_
							 & 0x10000);
			((Class103_Sub2) this).anIntArray9245[i_970_++]
			    = i_973_ - i_972_ | i_972_ - (i_972_ >>> 8);
		    }
		    i_942_++;
		    i_946_ -= i_945_-- + i_945_;
		    i_947_ -= i_945_ + i_945_;
		}
		i_944_ = i_937_;
		i_945_ = -i_945_;
		i_947_ = i_945_ * i_945_ + i_943_;
		i_946_ = i_947_ - i_944_;
		i_947_ -= i_945_;
		while (i_942_ < i_941_) {
		    for (/**/; i_947_ > i_943_ && i_946_ > i_943_;
			 i_946_ -= i_944_ + i_944_)
			i_947_ -= i_944_-- + i_944_;
		    int i_975_ = i - i_944_;
		    if (i_975_ < ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_975_ = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_976_ = i_944_ + i;
		    if (i_976_
			> ((Class103_Sub2) this).anInt9250 * 325436811 - 1)
			i_976_
			    = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		    int i_977_
			= (i_975_
			   + i_942_ * (-1826993761
				       * ((Class103_Sub2) this).anInt9260));
		    for (int i_978_ = i_975_; i_978_ <= i_976_; i_978_++) {
			int i_979_
			    = ((Class103_Sub2) this).anIntArray9245[i_977_];
			int i_980_ = i_938_ + i_979_;
			int i_981_ = (i_979_ & 0xff00ff) + (i_938_ & 0xff00ff);
			i_979_ = (i_980_ - i_981_ & 0x10000) + (i_981_
								& 0x1000100);
			((Class103_Sub2) this).anIntArray9245[i_977_++]
			    = i_980_ - i_979_ | i_979_ - (i_979_ >>> 8);
		    }
		    i_942_++;
		    i_947_ += i_945_ + i_945_;
		    i_946_ += i_945_++ + i_945_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15406(int i, int i_982_, int i_983_, int i_984_, int i_985_,
		     int i_986_, int i_987_, int i_988_) {
	if (null != ((Class103_Sub2) this).anIntArray9245
	    && (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
		&& i < ((Class103_Sub2) this).anInt9250 * 325436811)) {
	    int i_989_
		= (i_982_ * (((Class103_Sub2) this).anInt9260 * -1826993761)
		   + i);
	    int i_990_ = i_984_ >>> 24;
	    int i_991_ = i_987_ + i_986_;
	    int i_992_ = i_988_ % i_991_;
	    if (i_985_ == 0 || i_985_ == 1 && 255 == i_990_) {
		int i_993_ = 0;
		while (i_993_ < i_983_) {
		    if ((i_993_ + i_982_
			 >= -788450385 * ((Class103_Sub2) this).anInt9254)
			&& (i_993_ + i_982_
			    < 1546170165 * ((Class103_Sub2) this).anInt9252)
			&& i_992_ < i_986_)
			((Class103_Sub2) this).anIntArray9245
			    [(i_993_ * (-1826993761
					* ((Class103_Sub2) this).anInt9260)
			      + i_989_)]
			    = i_984_;
		    i_993_++;
		    i_992_ = ++i_992_ % i_991_;
		}
	    } else if (1 == i_985_) {
		i_984_ = ((i_990_ << 24)
			  + (((i_984_ & 0xff00ff) * i_990_ >> 8 & 0xff00ff)
			     + ((i_984_ & 0xff00) * i_990_ >> 8 & 0xff00)));
		int i_994_ = 256 - i_990_;
		int i_995_ = 0;
		while (i_995_ < i_983_) {
		    if ((i_995_ + i_982_
			 >= ((Class103_Sub2) this).anInt9254 * -788450385)
			&& (i_982_ + i_995_
			    < ((Class103_Sub2) this).anInt9252 * 1546170165)
			&& i_992_ < i_986_) {
			int i_996_ = ((((Class103_Sub2) this).anInt9260
				       * -1826993761 * i_995_)
				      + i_989_);
			int i_997_
			    = ((Class103_Sub2) this).anIntArray9245[i_996_];
			i_997_
			    = (((i_997_ & 0xff00ff) * i_994_ >> 8 & 0xff00ff)
			       + (i_994_ * (i_997_ & 0xff00) >> 8 & 0xff00));
			((Class103_Sub2) this).anIntArray9245[i_996_]
			    = i_984_ + i_997_;
		    }
		    i_995_++;
		    i_992_ = ++i_992_ % i_991_;
		}
	    } else if (i_985_ == 2) {
		int i_998_ = 0;
		while (i_998_ < i_983_) {
		    if ((i_998_ + i_982_
			 >= -788450385 * ((Class103_Sub2) this).anInt9254)
			&& (i_982_ + i_998_
			    < 1546170165 * ((Class103_Sub2) this).anInt9252)
			&& i_992_ < i_986_) {
			int i_999_
			    = ((-1826993761 * ((Class103_Sub2) this).anInt9260
				* i_998_)
			       + i_989_);
			int i_1000_
			    = ((Class103_Sub2) this).anIntArray9245[i_999_];
			int i_1001_ = i_1000_ + i_984_;
			int i_1002_
			    = (i_1000_ & 0xff00ff) + (i_984_ & 0xff00ff);
			i_1000_
			    = (i_1001_ - i_1002_ & 0x10000) + (i_1002_
							       & 0x1000100);
			((Class103_Sub2) this).anIntArray9245[i_999_]
			    = i_1001_ - i_1000_ | i_1000_ - (i_1000_ >>> 8);
		    }
		    i_998_++;
		    i_992_ = ++i_992_ % i_991_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method2416(int i, int i_1003_, int i_1004_, int i_1005_,
		    int i_1006_) {
	if (null != ((Class103_Sub2) this).anIntArray9245
	    && (i_1003_ >= -788450385 * ((Class103_Sub2) this).anInt9254
		&& i_1003_ < ((Class103_Sub2) this).anInt9252 * 1546170165)) {
	    if (i < ((Class103_Sub2) this).anInt9249 * 1298750001) {
		i_1004_ -= ((Class103_Sub2) this).anInt9249 * 1298750001 - i;
		i = ((Class103_Sub2) this).anInt9249 * 1298750001;
	    }
	    if (i + i_1004_ > 325436811 * ((Class103_Sub2) this).anInt9250)
		i_1004_ = ((Class103_Sub2) this).anInt9250 * 325436811 - i;
	    int i_1007_
		= i + ((Class103_Sub2) this).anInt9260 * -1826993761 * i_1003_;
	    int i_1008_ = i_1005_ >>> 24;
	    if (i_1006_ == 0 || i_1006_ == 1 && i_1008_ == 255) {
		for (int i_1009_ = 0; i_1009_ < i_1004_; i_1009_++)
		    ((Class103_Sub2) this).anIntArray9245[i_1009_ + i_1007_]
			= i_1005_;
	    } else if (1 == i_1006_) {
		i_1005_ = (((i_1005_ & 0xff00) * i_1008_ >> 8 & 0xff00)
			   + (i_1008_ * (i_1005_ & 0xff00ff) >> 8 & 0xff00ff)
			   + (i_1008_ << 24));
		int i_1010_ = 256 - i_1008_;
		for (int i_1011_ = 0; i_1011_ < i_1004_; i_1011_++) {
		    int i_1012_ = (((Class103_Sub2) this).anIntArray9245
				   [i_1011_ + i_1007_]);
		    i_1012_ = (((i_1012_ & 0xff00ff) * i_1010_ >> 8 & 0xff00ff)
			       + (i_1010_ * (i_1012_ & 0xff00) >> 8 & 0xff00));
		    ((Class103_Sub2) this).anIntArray9245[i_1011_ + i_1007_]
			= i_1012_ + i_1005_;
		}
	    } else if (i_1006_ == 2) {
		for (int i_1013_ = 0; i_1013_ < i_1004_; i_1013_++) {
		    int i_1014_ = (((Class103_Sub2) this).anIntArray9245
				   [i_1013_ + i_1007_]);
		    int i_1015_ = i_1005_ + i_1014_;
		    int i_1016_ = (i_1005_ & 0xff00ff) + (i_1014_ & 0xff00ff);
		    i_1014_ = (i_1016_ & 0x1000100) + (i_1015_ - i_1016_
						       & 0x10000);
		    ((Class103_Sub2) this).anIntArray9245[i_1013_ + i_1007_]
			= i_1015_ - i_1014_ | i_1014_ - (i_1014_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15407(int i, int i_1017_, int i_1018_, int i_1019_, int i_1020_,
		     int i_1021_, int i_1022_, int i_1023_) {
	if (null != ((Class103_Sub2) this).anIntArray9245
	    && (i_1017_ >= ((Class103_Sub2) this).anInt9254 * -788450385
		&& i_1017_ < 1546170165 * ((Class103_Sub2) this).anInt9252)) {
	    int i_1024_
		= (i_1017_ * (-1826993761 * ((Class103_Sub2) this).anInt9260)
		   + i);
	    int i_1025_ = i_1019_ >>> 24;
	    int i_1026_ = i_1021_ + i_1022_;
	    int i_1027_ = i_1023_ % i_1026_;
	    if (i_1020_ == 0 || i_1020_ == 1 && 255 == i_1025_) {
		int i_1028_ = 0;
		while (i_1028_ < i_1018_) {
		    if ((i + i_1028_
			 >= ((Class103_Sub2) this).anInt9249 * 1298750001)
			&& (i + i_1028_
			    < ((Class103_Sub2) this).anInt9250 * 325436811)
			&& i_1027_ < i_1021_)
			((Class103_Sub2) this).anIntArray9245[(i_1028_
							       + i_1024_)]
			    = i_1019_;
		    i_1028_++;
		    i_1027_ = ++i_1027_ % i_1026_;
		}
	    } else if (i_1020_ == 1) {
		i_1019_ = ((i_1025_ << 24)
			   + ((i_1025_ * (i_1019_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_1025_ * (i_1019_ & 0xff00) >> 8 & 0xff00)));
		int i_1029_ = 256 - i_1025_;
		int i_1030_ = 0;
		while (i_1030_ < i_1018_) {
		    if ((i_1030_ + i
			 >= ((Class103_Sub2) this).anInt9249 * 1298750001)
			&& (i_1030_ + i
			    < 325436811 * ((Class103_Sub2) this).anInt9250)
			&& i_1027_ < i_1021_) {
			int i_1031_ = (((Class103_Sub2) this).anIntArray9245
				       [i_1024_ + i_1030_]);
			i_1031_ = ((i_1029_ * (i_1031_ & 0xff00) >> 8 & 0xff00)
				   + ((i_1031_ & 0xff00ff) * i_1029_ >> 8
				      & 0xff00ff));
			((Class103_Sub2) this).anIntArray9245[(i_1024_
							       + i_1030_)]
			    = i_1031_ + i_1019_;
		    }
		    i_1030_++;
		    i_1027_ = ++i_1027_ % i_1026_;
		}
	    } else if (i_1020_ == 2) {
		int i_1032_ = 0;
		while (i_1032_ < i_1018_) {
		    if ((i_1032_ + i
			 >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			&& (i + i_1032_
			    < 325436811 * ((Class103_Sub2) this).anInt9250)
			&& i_1027_ < i_1021_) {
			int i_1033_ = (((Class103_Sub2) this).anIntArray9245
				       [i_1032_ + i_1024_]);
			int i_1034_ = i_1033_ + i_1019_;
			int i_1035_
			    = (i_1019_ & 0xff00ff) + (i_1033_ & 0xff00ff);
			i_1033_
			    = (i_1034_ - i_1035_ & 0x10000) + (i_1035_
							       & 0x1000100);
			((Class103_Sub2) this).anIntArray9245[(i_1024_
							       + i_1032_)]
			    = i_1034_ - i_1033_ | i_1033_ - (i_1033_ >>> 8);
		    }
		    i_1032_++;
		    i_1027_ = ++i_1027_ % i_1026_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method2417(int i, int i_1036_, int i_1037_, int i_1038_,
		    int i_1039_) {
	if (((Class103_Sub2) this).anIntArray9245 != null
	    && (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
		&& i < ((Class103_Sub2) this).anInt9250 * 325436811)) {
	    if (i_1036_ < -788450385 * ((Class103_Sub2) this).anInt9254) {
		i_1037_
		    -= ((Class103_Sub2) this).anInt9254 * -788450385 - i_1036_;
		i_1036_ = -788450385 * ((Class103_Sub2) this).anInt9254;
	    }
	    if (i_1037_ + i_1036_
		> ((Class103_Sub2) this).anInt9252 * 1546170165)
		i_1037_
		    = ((Class103_Sub2) this).anInt9252 * 1546170165 - i_1036_;
	    int i_1040_
		= -1826993761 * ((Class103_Sub2) this).anInt9260 * i_1036_ + i;
	    int i_1041_ = i_1038_ >>> 24;
	    if (0 == i_1039_ || i_1039_ == 1 && i_1041_ == 255) {
		for (int i_1042_ = 0; i_1042_ < i_1037_; i_1042_++)
		    ((Class103_Sub2) this).anIntArray9245
			[i_1040_ + (((Class103_Sub2) this).anInt9260
				    * -1826993761 * i_1042_)]
			= i_1038_;
	    } else if (1 == i_1039_) {
		i_1038_ = (((i_1038_ & 0xff00ff) * i_1041_ >> 8 & 0xff00ff)
			   + (i_1041_ * (i_1038_ & 0xff00) >> 8 & 0xff00)
			   + (i_1041_ << 24));
		int i_1043_ = 256 - i_1041_;
		for (int i_1044_ = 0; i_1044_ < i_1037_; i_1044_++) {
		    int i_1045_ = i_1040_ + (-1826993761
					     * ((Class103_Sub2) this).anInt9260
					     * i_1044_);
		    int i_1046_
			= ((Class103_Sub2) this).anIntArray9245[i_1045_];
		    i_1046_ = ((i_1043_ * (i_1046_ & 0xff00ff) >> 8 & 0xff00ff)
			       + ((i_1046_ & 0xff00) * i_1043_ >> 8 & 0xff00));
		    ((Class103_Sub2) this).anIntArray9245[i_1045_]
			= i_1038_ + i_1046_;
		}
	    } else if (i_1039_ == 2) {
		for (int i_1047_ = 0; i_1047_ < i_1037_; i_1047_++) {
		    int i_1048_
			= ((-1826993761 * ((Class103_Sub2) this).anInt9260
			    * i_1047_)
			   + i_1040_);
		    int i_1049_
			= ((Class103_Sub2) this).anIntArray9245[i_1048_];
		    int i_1050_ = i_1049_ + i_1038_;
		    int i_1051_ = (i_1038_ & 0xff00ff) + (i_1049_ & 0xff00ff);
		    i_1049_ = (i_1051_ & 0x1000100) + (i_1050_ - i_1051_
						       & 0x10000);
		    ((Class103_Sub2) this).anIntArray9245[i_1048_]
			= i_1050_ - i_1049_ | i_1049_ - (i_1049_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15408(int i, int i_1052_, int i_1053_, int i_1054_, int i_1055_,
		     int i_1056_, int i_1057_, int i_1058_) {
	if (null != ((Class103_Sub2) this).anIntArray9245
	    && (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
		&& i < ((Class103_Sub2) this).anInt9250 * 325436811)) {
	    int i_1059_
		= (i_1052_ * (((Class103_Sub2) this).anInt9260 * -1826993761)
		   + i);
	    int i_1060_ = i_1054_ >>> 24;
	    int i_1061_ = i_1057_ + i_1056_;
	    int i_1062_ = i_1058_ % i_1061_;
	    if (i_1055_ == 0 || i_1055_ == 1 && 255 == i_1060_) {
		int i_1063_ = 0;
		while (i_1063_ < i_1053_) {
		    if ((i_1063_ + i_1052_
			 >= -788450385 * ((Class103_Sub2) this).anInt9254)
			&& (i_1063_ + i_1052_
			    < 1546170165 * ((Class103_Sub2) this).anInt9252)
			&& i_1062_ < i_1056_)
			((Class103_Sub2) this).anIntArray9245
			    [(i_1063_ * (-1826993761
					 * ((Class103_Sub2) this).anInt9260)
			      + i_1059_)]
			    = i_1054_;
		    i_1063_++;
		    i_1062_ = ++i_1062_ % i_1061_;
		}
	    } else if (1 == i_1055_) {
		i_1054_ = ((i_1060_ << 24)
			   + (((i_1054_ & 0xff00ff) * i_1060_ >> 8 & 0xff00ff)
			      + ((i_1054_ & 0xff00) * i_1060_ >> 8 & 0xff00)));
		int i_1064_ = 256 - i_1060_;
		int i_1065_ = 0;
		while (i_1065_ < i_1053_) {
		    if ((i_1065_ + i_1052_
			 >= ((Class103_Sub2) this).anInt9254 * -788450385)
			&& (i_1052_ + i_1065_
			    < ((Class103_Sub2) this).anInt9252 * 1546170165)
			&& i_1062_ < i_1056_) {
			int i_1066_ = ((((Class103_Sub2) this).anInt9260
					* -1826993761 * i_1065_)
				       + i_1059_);
			int i_1067_
			    = ((Class103_Sub2) this).anIntArray9245[i_1066_];
			i_1067_
			    = (((i_1067_ & 0xff00ff) * i_1064_ >> 8 & 0xff00ff)
			       + (i_1064_ * (i_1067_ & 0xff00) >> 8 & 0xff00));
			((Class103_Sub2) this).anIntArray9245[i_1066_]
			    = i_1054_ + i_1067_;
		    }
		    i_1065_++;
		    i_1062_ = ++i_1062_ % i_1061_;
		}
	    } else if (i_1055_ == 2) {
		int i_1068_ = 0;
		while (i_1068_ < i_1053_) {
		    if ((i_1068_ + i_1052_
			 >= -788450385 * ((Class103_Sub2) this).anInt9254)
			&& (i_1052_ + i_1068_
			    < 1546170165 * ((Class103_Sub2) this).anInt9252)
			&& i_1062_ < i_1056_) {
			int i_1069_
			    = ((-1826993761 * ((Class103_Sub2) this).anInt9260
				* i_1068_)
			       + i_1059_);
			int i_1070_
			    = ((Class103_Sub2) this).anIntArray9245[i_1069_];
			int i_1071_ = i_1070_ + i_1054_;
			int i_1072_
			    = (i_1070_ & 0xff00ff) + (i_1054_ & 0xff00ff);
			i_1070_
			    = (i_1071_ - i_1072_ & 0x10000) + (i_1072_
							       & 0x1000100);
			((Class103_Sub2) this).anIntArray9245[i_1069_]
			    = i_1071_ - i_1070_ | i_1070_ - (i_1070_ >>> 8);
		    }
		    i_1068_++;
		    i_1062_ = ++i_1062_ % i_1061_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2325(float f, float f_1073_, float f_1074_,
			   float f_1075_, float f_1076_) {
	/* empty */
    }
    
    void method15409(int i, int i_1077_, int[] is, float[] fs) {
	((Class103_Sub2) this).anInt9260 = i * 1904120415;
	((Class103_Sub2) this).anInt9278 = i_1077_ * -710038965;
	((Class103_Sub2) this).anIntArray9245 = is;
	((Class103_Sub2) this).aFloatArray9248 = fs;
	for (int i_1078_ = 0;
	     i_1078_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_1078_++)
	    ((Class103_Sub2) this).aClass189Array9275[i_1078_]
		.method3871(1754745636);
	method2572();
	method2295();
    }
    
    public void method2419(int i, int i_1079_, int i_1080_, int i_1081_,
			   int i_1082_, int i_1083_, int i_1084_, int i_1085_,
			   int i_1086_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    i_1080_ -= i;
	    i_1081_ -= i_1079_;
	    if (i_1081_ == 0) {
		if (i_1080_ >= 0)
		    method15373(i, i_1079_, 1 + i_1080_, i_1082_, i_1083_,
				i_1084_, i_1085_, i_1086_);
		else {
		    int i_1087_ = i_1085_ + i_1084_;
		    i_1086_ %= i_1087_;
		    i_1086_ = (i_1084_ + i_1087_ - i_1086_
			       - (1 + -i_1080_) % i_1087_);
		    i_1086_ %= i_1087_;
		    if (i_1086_ < 0)
			i_1086_ += i_1087_;
		    method15373(i + i_1080_, i_1079_, 1 + -i_1080_, i_1082_,
				i_1083_, i_1084_, i_1085_, i_1086_);
		}
	    } else if (i_1080_ == 0) {
		if (i_1081_ >= 0)
		    method15426(i, i_1079_, i_1081_ + 1, i_1082_, i_1083_,
				i_1084_, i_1085_, i_1086_);
		else {
		    int i_1088_ = i_1084_ + i_1085_;
		    i_1086_ %= i_1088_;
		    i_1086_ = (i_1084_ + i_1088_ - i_1086_
			       - (1 + -i_1081_) % i_1088_);
		    i_1086_ %= i_1088_;
		    if (i_1086_ < 0)
			i_1086_ += i_1088_;
		    method15426(i, i_1079_ + i_1081_, 1 + -i_1081_, i_1082_,
				i_1083_, i_1084_, i_1085_, i_1086_);
		}
	    } else {
		i_1086_ <<= 8;
		i_1084_ <<= 8;
		i_1085_ <<= 8;
		int i_1089_ = i_1084_ + i_1085_;
		i_1086_ %= i_1089_;
		if (i_1080_ + i_1081_ < 0) {
		    int i_1090_
			= (int) (Math.sqrt((double) (i_1080_ * i_1080_
						     + i_1081_ * i_1081_))
				 * 256.0);
		    int i_1091_ = i_1090_ % i_1089_;
		    i_1086_ = i_1084_ + i_1089_ - i_1086_ - i_1091_;
		    i_1086_ %= i_1089_;
		    if (i_1086_ < 0)
			i_1086_ += i_1089_;
		    i += i_1080_;
		    i_1080_ = -i_1080_;
		    i_1079_ += i_1081_;
		    i_1081_ = -i_1081_;
		}
		if (i_1080_ > i_1081_) {
		    i_1079_ <<= 16;
		    i_1079_ += 32768;
		    i_1081_ <<= 16;
		    int i_1092_ = (int) Math.floor(0.5 + ((double) i_1081_
							  / (double) i_1080_));
		    i_1080_ += i;
		    int i_1093_ = i_1082_ >>> 24;
		    int i_1094_
			= (int) Math.sqrt((double) (65536
						    + ((i_1092_ >> 8)
						       * (i_1092_ >> 8))));
		    if (0 == i_1083_ || i_1083_ == 1 && i_1093_ == 255) {
			while (i <= i_1080_) {
			    int i_1095_ = i_1079_ >> 16;
			    if (i >= (1298750001
				      * ((Class103_Sub2) this).anInt9249)
				&& i < (((Class103_Sub2) this).anInt9250
					* 325436811)
				&& i_1095_ >= -788450385 * ((Class103_Sub2)
							    this).anInt9254
				&& i_1095_ < 1546170165 * ((Class103_Sub2)
							   this).anInt9252
				&& i_1086_ < i_1084_)
				((Class103_Sub2) this).anIntArray9245
				    [i_1095_ * (-1826993761
						* (((Class103_Sub2) this)
						   .anInt9260)) + i]
				    = i_1082_;
			    i_1079_ += i_1092_;
			    i++;
			    i_1086_ += i_1094_;
			    i_1086_ %= i_1089_;
			}
		    } else if (1 == i_1083_) {
			i_1082_ = ((i_1093_ * (i_1082_ & 0xff00) >> 8 & 0xff00)
				   + (i_1093_ * (i_1082_ & 0xff00ff) >> 8
				      & 0xff00ff)
				   + (i_1093_ << 24));
			int i_1096_ = 256 - i_1093_;
			while (i <= i_1080_) {
			    int i_1097_ = i_1079_ >> 16;
			    if (i >= (1298750001
				      * ((Class103_Sub2) this).anInt9249)
				&& i < (325436811
					* ((Class103_Sub2) this).anInt9250)
				&& i_1097_ >= -788450385 * ((Class103_Sub2)
							    this).anInt9254
				&& i_1097_ < (((Class103_Sub2) this).anInt9252
					      * 1546170165)
				&& i_1086_ < i_1084_) {
				int i_1098_
				    = ((i_1097_
					* (-1826993761
					   * ((Class103_Sub2) this).anInt9260))
				       + i);
				int i_1099_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1098_]);
				i_1099_ = ((i_1096_ * (i_1099_ & 0xff00ff) >> 8
					    & 0xff00ff)
					   + ((i_1099_ & 0xff00) * i_1096_ >> 8
					      & 0xff00));
				((Class103_Sub2) this).anIntArray9245[i_1098_]
				    = i_1099_ + i_1082_;
			    }
			    i_1079_ += i_1092_;
			    i++;
			    i_1086_ += i_1094_;
			    i_1086_ %= i_1089_;
			}
		    } else if (2 == i_1083_) {
			while (i <= i_1080_) {
			    int i_1100_ = i_1079_ >> 16;
			    if (i >= (1298750001
				      * ((Class103_Sub2) this).anInt9249)
				&& i < (((Class103_Sub2) this).anInt9250
					* 325436811)
				&& i_1100_ >= (((Class103_Sub2) this).anInt9254
					       * -788450385)
				&& i_1100_ < 1546170165 * ((Class103_Sub2)
							   this).anInt9252
				&& i_1086_ < i_1084_) {
				int i_1101_
				    = i + (-1826993761
					   * ((Class103_Sub2) this).anInt9260
					   * i_1100_);
				int i_1102_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1101_]);
				int i_1103_ = i_1102_ + i_1082_;
				int i_1104_ = ((i_1102_ & 0xff00ff)
					       + (i_1082_ & 0xff00ff));
				i_1102_ = ((i_1103_ - i_1104_ & 0x10000)
					   + (i_1104_ & 0x1000100));
				((Class103_Sub2) this).anIntArray9245[i_1101_]
				    = i_1103_ - i_1102_ | i_1102_ - (i_1102_
								     >>> 8);
			    }
			    i_1079_ += i_1092_;
			    i++;
			    i_1086_ += i_1094_;
			    i_1086_ %= i_1089_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_1080_ <<= 16;
		    int i_1105_ = (int) Math.floor(0.5 + ((double) i_1080_
							  / (double) i_1081_));
		    i_1081_ += i_1079_;
		    int i_1106_ = i_1082_ >>> 24;
		    int i_1107_
			= (int) Math.sqrt((double) (65536
						    + ((i_1105_ >> 8)
						       * (i_1105_ >> 8))));
		    if (i_1083_ == 0 || i_1083_ == 1 && i_1106_ == 255) {
			while (i_1079_ <= i_1081_) {
			    int i_1108_ = i >> 16;
			    if (i_1079_ >= (-788450385
					    * ((Class103_Sub2) this).anInt9254)
				&& i_1079_ < (((Class103_Sub2) this).anInt9252
					      * 1546170165)
				&& i_1108_ >= 1298750001 * ((Class103_Sub2)
							    this).anInt9249
				&& i_1108_ < (((Class103_Sub2) this).anInt9250
					      * 325436811)
				&& i_1086_ < i_1084_)
				((Class103_Sub2) this).anIntArray9245
				    [(i_1108_
				      + (-1826993761
					 * ((Class103_Sub2) this).anInt9260
					 * i_1079_))]
				    = i_1082_;
			    i += i_1105_;
			    i_1079_++;
			    i_1086_ += i_1107_;
			    i_1086_ %= i_1089_;
			}
		    } else if (i_1083_ == 1) {
			i_1082_ = ((i_1106_ * (i_1082_ & 0xff00) >> 8 & 0xff00)
				   + (i_1106_ * (i_1082_ & 0xff00ff) >> 8
				      & 0xff00ff)
				   + (i_1106_ << 24));
			int i_1109_ = 256 - i_1106_;
			while (i_1079_ <= i_1081_) {
			    int i_1110_ = i >> 16;
			    if (i_1079_ >= (-788450385
					    * ((Class103_Sub2) this).anInt9254)
				&& i_1079_ < (((Class103_Sub2) this).anInt9252
					      * 1546170165)
				&& i_1110_ >= 1298750001 * ((Class103_Sub2)
							    this).anInt9249
				&& i_1110_ < (((Class103_Sub2) this).anInt9250
					      * 325436811)
				&& i_1086_ < i_1084_) {
				int i_1111_
				    = (i_1110_
				       + (((Class103_Sub2) this).anInt9260
					  * -1826993761 * i_1079_));
				int i_1112_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1111_]);
				i_1112_ = (((i_1112_ & 0xff00ff) * i_1109_ >> 8
					    & 0xff00ff)
					   + (i_1109_ * (i_1112_ & 0xff00) >> 8
					      & 0xff00));
				((Class103_Sub2) this).anIntArray9245
				    [(i_1079_
				      * (((Class103_Sub2) this).anInt9260
					 * -1826993761)) + i_1110_]
				    = i_1112_ + i_1082_;
			    }
			    i += i_1105_;
			    i_1079_++;
			    i_1086_ += i_1107_;
			    i_1086_ %= i_1089_;
			}
		    } else if (2 == i_1083_) {
			while (i_1079_ <= i_1081_) {
			    int i_1113_ = i >> 16;
			    if (i_1079_ >= (-788450385
					    * ((Class103_Sub2) this).anInt9254)
				&& i_1079_ < 1546170165 * ((Class103_Sub2)
							   this).anInt9252
				&& i_1113_ >= 1298750001 * ((Class103_Sub2)
							    this).anInt9249
				&& i_1113_ < (((Class103_Sub2) this).anInt9250
					      * 325436811)
				&& i_1086_ < i_1084_) {
				int i_1114_
				    = (i_1113_
				       + i_1079_ * (-1826993761
						    * (((Class103_Sub2) this)
						       .anInt9260)));
				int i_1115_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1114_]);
				int i_1116_ = i_1115_ + i_1082_;
				int i_1117_ = ((i_1115_ & 0xff00ff)
					       + (i_1082_ & 0xff00ff));
				i_1115_ = ((i_1116_ - i_1117_ & 0x10000)
					   + (i_1117_ & 0x1000100));
				((Class103_Sub2) this).anIntArray9245[i_1114_]
				    = i_1116_ - i_1115_ | i_1115_ - (i_1115_
								     >>> 8);
			    }
			    i += i_1105_;
			    i_1079_++;
			    i_1086_ += i_1107_;
			    i_1086_ %= i_1089_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method2420(int i, int i_1118_, int i_1119_, int i_1120_,
			   int i_1121_, int i_1122_, Class135 class135,
			   int i_1123_, int i_1124_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    int[] is = ((Class135_Sub1) class135_sub1).anIntArray9874;
	    int[] is_1125_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	    int i_1126_
		= (((Class103_Sub2) this).anInt9254 * -788450385 > i_1124_
		   ? ((Class103_Sub2) this).anInt9254 * -788450385 : i_1124_);
	    int i_1127_ = ((((Class103_Sub2) this).anInt9252 * 1546170165
			    < is.length + i_1124_)
			   ? 1546170165 * ((Class103_Sub2) this).anInt9252
			   : i_1124_ + is.length);
	    i_1119_ -= i;
	    i_1120_ -= i_1118_;
	    if (i_1120_ + i_1119_ < 0) {
		i += i_1119_;
		i_1119_ = -i_1119_;
		i_1118_ += i_1120_;
		i_1120_ = -i_1120_;
	    }
	    if (i_1119_ > i_1120_) {
		i_1118_ <<= 16;
		i_1118_ += 32768;
		i_1120_ <<= 16;
		int i_1128_
		    = (int) Math.floor((double) i_1120_ / (double) i_1119_
				       + 0.5);
		i_1119_ += i;
		if (i < 1298750001 * ((Class103_Sub2) this).anInt9249) {
		    i_1118_ += (((Class103_Sub2) this).anInt9249 * 1298750001
				- i) * i_1128_;
		    i = ((Class103_Sub2) this).anInt9249 * 1298750001;
		}
		if (i_1119_ >= 325436811 * ((Class103_Sub2) this).anInt9250)
		    i_1119_ = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		int i_1129_ = i_1121_ >>> 24;
		if (i_1122_ == 0 || 1 == i_1122_ && 255 == i_1129_) {
		    for (/**/; i <= i_1119_; i++) {
			int i_1130_ = i_1118_ >> 16;
			int i_1131_ = i_1130_ - i_1124_;
			if (i_1130_ >= i_1126_ && i_1130_ < i_1127_) {
			    int i_1132_ = i_1123_ + is[i_1131_];
			    if (i >= i_1132_
				&& i < is_1125_[i_1131_] + i_1132_)
				((Class103_Sub2) this).anIntArray9245
				    [i + i_1130_ * (-1826993761
						    * (((Class103_Sub2) this)
						       .anInt9260))]
				    = i_1121_;
			}
			i_1118_ += i_1128_;
		    }
		} else if (1 == i_1122_) {
		    i_1121_ = ((i_1129_ * (i_1121_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_1129_ * (i_1121_ & 0xff00) >> 8 & 0xff00)
			       + (i_1129_ << 24));
		    int i_1133_ = 256 - i_1129_;
		    for (/**/; i <= i_1119_; i++) {
			int i_1134_ = i_1118_ >> 16;
			int i_1135_ = i_1134_ - i_1124_;
			if (i_1134_ >= i_1126_ && i_1134_ < i_1127_) {
			    int i_1136_ = is[i_1135_] + i_1123_;
			    if (i >= i_1136_
				&& i < i_1136_ + is_1125_[i_1135_]) {
				int i_1137_
				    = ((-1826993761
					* ((Class103_Sub2) this).anInt9260
					* i_1134_)
				       + i);
				int i_1138_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1137_]);
				i_1138_ = ((i_1133_ * (i_1138_ & 0xff00ff) >> 8
					    & 0xff00ff)
					   + ((i_1138_ & 0xff00) * i_1133_ >> 8
					      & 0xff00));
				((Class103_Sub2) this).anIntArray9245[i_1137_]
				    = i_1138_ + i_1121_;
			    }
			}
			i_1118_ += i_1128_;
		    }
		} else if (i_1122_ == 2) {
		    for (/**/; i <= i_1119_; i++) {
			int i_1139_ = i_1118_ >> 16;
			int i_1140_ = i_1139_ - i_1124_;
			if (i_1139_ >= i_1126_ && i_1139_ < i_1127_) {
			    int i_1141_ = is[i_1140_] + i_1123_;
			    if (i >= i_1141_
				&& i < is_1125_[i_1140_] + i_1141_) {
				int i_1142_ = (((Class103_Sub2) this).anInt9260
					       * -1826993761 * i_1139_) + i;
				int i_1143_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1142_]);
				int i_1144_ = i_1121_ + i_1143_;
				int i_1145_ = ((i_1121_ & 0xff00ff)
					       + (i_1143_ & 0xff00ff));
				i_1143_ = ((i_1144_ - i_1145_ & 0x10000)
					   + (i_1145_ & 0x1000100));
				((Class103_Sub2) this).anIntArray9245[i_1142_]
				    = i_1144_ - i_1143_ | i_1143_ - (i_1143_
								     >>> 8);
			    }
			}
			i_1118_ += i_1128_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_1119_ <<= 16;
		int i_1146_ = (int) Math.floor(0.5 + ((double) i_1119_
						      / (double) i_1120_));
		i_1120_ += i_1118_;
		if (i_1118_ < i_1126_) {
		    i += (i_1126_ - i_1118_) * i_1146_;
		    i_1118_ = i_1126_;
		}
		if (i_1120_ >= i_1127_)
		    i_1120_ = i_1127_ - 1;
		int i_1147_ = i_1121_ >>> 24;
		if (i_1122_ == 0 || i_1122_ == 1 && 255 == i_1147_) {
		    for (/**/; i_1118_ <= i_1120_; i_1118_++) {
			int i_1148_ = i >> 16;
			int i_1149_ = i_1118_ - i_1124_;
			int i_1150_ = i_1123_ + is[i_1149_];
			if ((i_1148_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_1148_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_1148_ >= i_1150_
			    && i_1148_ < is_1125_[i_1149_] + i_1150_)
			    ((Class103_Sub2) this).anIntArray9245
				[(i_1148_
				  + i_1118_ * (((Class103_Sub2) this).anInt9260
					       * -1826993761))]
				= i_1121_;
			i += i_1146_;
		    }
		} else if (1 == i_1122_) {
		    i_1121_ = ((i_1147_ << 24)
			       + (((i_1121_ & 0xff00) * i_1147_ >> 8 & 0xff00)
				  + ((i_1121_ & 0xff00ff) * i_1147_ >> 8
				     & 0xff00ff)));
		    int i_1151_ = 256 - i_1147_;
		    for (/**/; i_1118_ <= i_1120_; i_1118_++) {
			int i_1152_ = i >> 16;
			int i_1153_ = i_1118_ - i_1124_;
			int i_1154_ = i_1123_ + is[i_1153_];
			if ((i_1152_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_1152_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_1152_ >= i_1154_
			    && i_1152_ < i_1154_ + is_1125_[i_1153_]) {
			    int i_1155_
				= (i_1152_
				   + (i_1118_
				      * (-1826993761
					 * ((Class103_Sub2) this).anInt9260)));
			    int i_1156_ = (((Class103_Sub2) this)
					   .anIntArray9245[i_1155_]);
			    i_1156_ = (((i_1156_ & 0xff00ff) * i_1151_ >> 8
					& 0xff00ff)
				       + ((i_1156_ & 0xff00) * i_1151_ >> 8
					  & 0xff00));
			    ((Class103_Sub2) this).anIntArray9245
				[i_1118_ * (((Class103_Sub2) this).anInt9260
					    * -1826993761) + i_1152_]
				= i_1121_ + i_1156_;
			}
			i += i_1146_;
		    }
		} else if (i_1122_ == 2) {
		    for (/**/; i_1118_ <= i_1120_; i_1118_++) {
			int i_1157_ = i >> 16;
			int i_1158_ = i_1118_ - i_1124_;
			int i_1159_ = is[i_1158_] + i_1123_;
			if ((i_1157_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_1157_
				< ((Class103_Sub2) this).anInt9250 * 325436811)
			    && i_1157_ >= i_1159_
			    && i_1157_ < i_1159_ + is_1125_[i_1158_]) {
			    int i_1160_
				= i_1157_ + i_1118_ * ((((Class103_Sub2) this)
							.anInt9260)
						       * -1826993761);
			    int i_1161_ = (((Class103_Sub2) this)
					   .anIntArray9245[i_1160_]);
			    int i_1162_ = i_1121_ + i_1161_;
			    int i_1163_
				= (i_1161_ & 0xff00ff) + (i_1121_ & 0xff00ff);
			    i_1161_ = ((i_1162_ - i_1163_ & 0x10000)
				       + (i_1163_ & 0x1000100));
			    ((Class103_Sub2) this).anIntArray9245[i_1160_]
				= i_1162_ - i_1161_ | i_1161_ - (i_1161_
								 >>> 8);
			}
			i += i_1146_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2229(int i, int i_1164_, int i_1165_, int i_1166_,
			   int i_1167_, int i_1168_, Class135 class135,
			   int i_1169_, int i_1170_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    int[] is = ((Class135_Sub1) class135_sub1).anIntArray9874;
	    int[] is_1171_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	    int i_1172_
		= (((Class103_Sub2) this).anInt9254 * -788450385 > i_1170_
		   ? ((Class103_Sub2) this).anInt9254 * -788450385 : i_1170_);
	    int i_1173_ = ((((Class103_Sub2) this).anInt9252 * 1546170165
			    < is.length + i_1170_)
			   ? 1546170165 * ((Class103_Sub2) this).anInt9252
			   : i_1170_ + is.length);
	    i_1165_ -= i;
	    i_1166_ -= i_1164_;
	    if (i_1166_ + i_1165_ < 0) {
		i += i_1165_;
		i_1165_ = -i_1165_;
		i_1164_ += i_1166_;
		i_1166_ = -i_1166_;
	    }
	    if (i_1165_ > i_1166_) {
		i_1164_ <<= 16;
		i_1164_ += 32768;
		i_1166_ <<= 16;
		int i_1174_
		    = (int) Math.floor((double) i_1166_ / (double) i_1165_
				       + 0.5);
		i_1165_ += i;
		if (i < 1298750001 * ((Class103_Sub2) this).anInt9249) {
		    i_1164_ += (((Class103_Sub2) this).anInt9249 * 1298750001
				- i) * i_1174_;
		    i = ((Class103_Sub2) this).anInt9249 * 1298750001;
		}
		if (i_1165_ >= 325436811 * ((Class103_Sub2) this).anInt9250)
		    i_1165_ = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		int i_1175_ = i_1167_ >>> 24;
		if (i_1168_ == 0 || 1 == i_1168_ && 255 == i_1175_) {
		    for (/**/; i <= i_1165_; i++) {
			int i_1176_ = i_1164_ >> 16;
			int i_1177_ = i_1176_ - i_1170_;
			if (i_1176_ >= i_1172_ && i_1176_ < i_1173_) {
			    int i_1178_ = i_1169_ + is[i_1177_];
			    if (i >= i_1178_
				&& i < is_1171_[i_1177_] + i_1178_)
				((Class103_Sub2) this).anIntArray9245
				    [i + i_1176_ * (-1826993761
						    * (((Class103_Sub2) this)
						       .anInt9260))]
				    = i_1167_;
			}
			i_1164_ += i_1174_;
		    }
		} else if (1 == i_1168_) {
		    i_1167_ = ((i_1175_ * (i_1167_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_1175_ * (i_1167_ & 0xff00) >> 8 & 0xff00)
			       + (i_1175_ << 24));
		    int i_1179_ = 256 - i_1175_;
		    for (/**/; i <= i_1165_; i++) {
			int i_1180_ = i_1164_ >> 16;
			int i_1181_ = i_1180_ - i_1170_;
			if (i_1180_ >= i_1172_ && i_1180_ < i_1173_) {
			    int i_1182_ = is[i_1181_] + i_1169_;
			    if (i >= i_1182_
				&& i < i_1182_ + is_1171_[i_1181_]) {
				int i_1183_
				    = ((-1826993761
					* ((Class103_Sub2) this).anInt9260
					* i_1180_)
				       + i);
				int i_1184_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1183_]);
				i_1184_ = ((i_1179_ * (i_1184_ & 0xff00ff) >> 8
					    & 0xff00ff)
					   + ((i_1184_ & 0xff00) * i_1179_ >> 8
					      & 0xff00));
				((Class103_Sub2) this).anIntArray9245[i_1183_]
				    = i_1184_ + i_1167_;
			    }
			}
			i_1164_ += i_1174_;
		    }
		} else if (i_1168_ == 2) {
		    for (/**/; i <= i_1165_; i++) {
			int i_1185_ = i_1164_ >> 16;
			int i_1186_ = i_1185_ - i_1170_;
			if (i_1185_ >= i_1172_ && i_1185_ < i_1173_) {
			    int i_1187_ = is[i_1186_] + i_1169_;
			    if (i >= i_1187_
				&& i < is_1171_[i_1186_] + i_1187_) {
				int i_1188_ = (((Class103_Sub2) this).anInt9260
					       * -1826993761 * i_1185_) + i;
				int i_1189_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1188_]);
				int i_1190_ = i_1167_ + i_1189_;
				int i_1191_ = ((i_1167_ & 0xff00ff)
					       + (i_1189_ & 0xff00ff));
				i_1189_ = ((i_1190_ - i_1191_ & 0x10000)
					   + (i_1191_ & 0x1000100));
				((Class103_Sub2) this).anIntArray9245[i_1188_]
				    = i_1190_ - i_1189_ | i_1189_ - (i_1189_
								     >>> 8);
			    }
			}
			i_1164_ += i_1174_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_1165_ <<= 16;
		int i_1192_ = (int) Math.floor(0.5 + ((double) i_1165_
						      / (double) i_1166_));
		i_1166_ += i_1164_;
		if (i_1164_ < i_1172_) {
		    i += (i_1172_ - i_1164_) * i_1192_;
		    i_1164_ = i_1172_;
		}
		if (i_1166_ >= i_1173_)
		    i_1166_ = i_1173_ - 1;
		int i_1193_ = i_1167_ >>> 24;
		if (i_1168_ == 0 || i_1168_ == 1 && 255 == i_1193_) {
		    for (/**/; i_1164_ <= i_1166_; i_1164_++) {
			int i_1194_ = i >> 16;
			int i_1195_ = i_1164_ - i_1170_;
			int i_1196_ = i_1169_ + is[i_1195_];
			if ((i_1194_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_1194_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_1194_ >= i_1196_
			    && i_1194_ < is_1171_[i_1195_] + i_1196_)
			    ((Class103_Sub2) this).anIntArray9245
				[(i_1194_
				  + i_1164_ * (((Class103_Sub2) this).anInt9260
					       * -1826993761))]
				= i_1167_;
			i += i_1192_;
		    }
		} else if (1 == i_1168_) {
		    i_1167_ = ((i_1193_ << 24)
			       + (((i_1167_ & 0xff00) * i_1193_ >> 8 & 0xff00)
				  + ((i_1167_ & 0xff00ff) * i_1193_ >> 8
				     & 0xff00ff)));
		    int i_1197_ = 256 - i_1193_;
		    for (/**/; i_1164_ <= i_1166_; i_1164_++) {
			int i_1198_ = i >> 16;
			int i_1199_ = i_1164_ - i_1170_;
			int i_1200_ = i_1169_ + is[i_1199_];
			if ((i_1198_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_1198_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_1198_ >= i_1200_
			    && i_1198_ < i_1200_ + is_1171_[i_1199_]) {
			    int i_1201_
				= (i_1198_
				   + (i_1164_
				      * (-1826993761
					 * ((Class103_Sub2) this).anInt9260)));
			    int i_1202_ = (((Class103_Sub2) this)
					   .anIntArray9245[i_1201_]);
			    i_1202_ = (((i_1202_ & 0xff00ff) * i_1197_ >> 8
					& 0xff00ff)
				       + ((i_1202_ & 0xff00) * i_1197_ >> 8
					  & 0xff00));
			    ((Class103_Sub2) this).anIntArray9245
				[i_1164_ * (((Class103_Sub2) this).anInt9260
					    * -1826993761) + i_1198_]
				= i_1167_ + i_1202_;
			}
			i += i_1192_;
		    }
		} else if (i_1168_ == 2) {
		    for (/**/; i_1164_ <= i_1166_; i_1164_++) {
			int i_1203_ = i >> 16;
			int i_1204_ = i_1164_ - i_1170_;
			int i_1205_ = is[i_1204_] + i_1169_;
			if ((i_1203_
			     >= 1298750001 * ((Class103_Sub2) this).anInt9249)
			    && (i_1203_
				< ((Class103_Sub2) this).anInt9250 * 325436811)
			    && i_1203_ >= i_1205_
			    && i_1203_ < i_1205_ + is_1171_[i_1204_]) {
			    int i_1206_
				= i_1203_ + i_1164_ * ((((Class103_Sub2) this)
							.anInt9260)
						       * -1826993761);
			    int i_1207_ = (((Class103_Sub2) this)
					   .anIntArray9245[i_1206_]);
			    int i_1208_ = i_1167_ + i_1207_;
			    int i_1209_
				= (i_1207_ & 0xff00ff) + (i_1167_ & 0xff00ff);
			    i_1207_ = ((i_1208_ - i_1209_ & 0x10000)
				       + (i_1209_ & 0x1000100));
			    ((Class103_Sub2) this).anIntArray9245[i_1206_]
				= i_1208_ - i_1207_ | i_1207_ - (i_1207_
								 >>> 8);
			}
			i += i_1192_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2223(int i, int i_1210_, int i_1211_) {
	for (int i_1212_ = 0;
	     i_1212_ < ((Class103_Sub2) this).aClass189Array9275.length;
	     i_1212_++) {
	    Class189 class189
		= ((Class103_Sub2) this).aClass189Array9275[i_1212_];
	    ((Class189) class189).anInt2215 = -1407607783 * (i & 0xffffff);
	    int i_1213_
		= ((Class189) class189).anInt2215 * -338296791 >>> 16 & 0xff;
	    if (i_1213_ < 2)
		i_1213_ = 2;
	    int i_1214_
		= ((Class189) class189).anInt2215 * -338296791 >> 8 & 0xff;
	    if (i_1214_ < 2)
		i_1214_ = 2;
	    int i_1215_ = -338296791 * ((Class189) class189).anInt2215 & 0xff;
	    if (i_1215_ < 2)
		i_1215_ = 2;
	    ((Class189) class189).anInt2215
		= -1407607783 * (i_1213_ << 16 | i_1214_ << 8 | i_1215_);
	    if (i_1210_ < 0)
		((Class189) class189).aBool2209 = false;
	    else
		((Class189) class189).aBool2209 = true;
	}
    }
    
    public void method2423(int i, int i_1216_, int i_1217_, int i_1218_,
			   int i_1219_, int i_1220_, int i_1221_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class189 class189 = method15377(Thread.currentThread());
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    int i_1222_ = i_1217_ - i;
	    int i_1223_ = i_1218_ - i_1216_;
	    int i_1224_ = i_1222_ >= 0 ? i_1222_ : -i_1222_;
	    int i_1225_ = i_1223_ >= 0 ? i_1223_ : -i_1223_;
	    int i_1226_ = i_1224_;
	    if (i_1226_ < i_1225_)
		i_1226_ = i_1225_;
	    if (0 != i_1226_) {
		int i_1227_ = (i_1222_ << 16) / i_1226_;
		int i_1228_ = (i_1223_ << 16) / i_1226_;
		i_1222_ += i_1227_ >> 16;
		i_1223_ += i_1228_ >> 16;
		if (i_1228_ <= i_1227_)
		    i_1227_ = -i_1227_;
		else
		    i_1228_ = -i_1228_;
		int i_1229_ = i_1220_ * i_1228_ >> 17;
		int i_1230_ = 1 + i_1220_ * i_1228_ >> 17;
		int i_1231_ = i_1220_ * i_1227_ >> 17;
		int i_1232_ = i_1227_ * i_1220_ + 1 >> 17;
		i -= class155.method3344();
		i_1216_ -= class155.method3371();
		int i_1233_ = i_1229_ + i;
		int i_1234_ = i - i_1230_;
		int i_1235_ = i + i_1222_ - i_1230_;
		int i_1236_ = i_1229_ + (i + i_1222_);
		int i_1237_ = i_1231_ + i_1216_;
		int i_1238_ = i_1216_ - i_1232_;
		int i_1239_ = i_1216_ + i_1223_ - i_1232_;
		int i_1240_ = i_1223_ + i_1216_ + i_1231_;
		if (0 == i_1221_)
		    ((Class155) class155).anInt1723 = 0;
		else if (1 == i_1221_)
		    ((Class155) class155).anInt1723 = 255 - (i_1219_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method2308(false);
		((Class155) class155).aBool1748
		    = (i_1233_ < 0 || i_1233_ > ((Class155) class155).anInt1733
		       || i_1234_ < 0
		       || i_1234_ > ((Class155) class155).anInt1733
		       || i_1235_ < 0
		       || i_1235_ > ((Class155) class155).anInt1733);
		class155.method3377(true, false, false, (float) i_1237_,
				    (float) i_1238_, (float) i_1239_,
				    (float) i_1233_, (float) i_1234_,
				    (float) i_1235_, 100.0F, 100.0F, 100.0F,
				    i_1219_);
		((Class155) class155).aBool1748
		    = (i_1233_ < 0 || i_1233_ > ((Class155) class155).anInt1733
		       || i_1235_ < 0
		       || i_1235_ > ((Class155) class155).anInt1733
		       || i_1236_ < 0
		       || i_1236_ > ((Class155) class155).anInt1733);
		class155.method3377(true, false, false, (float) i_1237_,
				    (float) i_1239_, (float) i_1240_,
				    (float) i_1233_, (float) i_1235_,
				    (float) i_1236_, 100.0F, 100.0F, 100.0F,
				    i_1219_);
		method2308(true);
	    }
	}
    }
    
    public void method2344(int i, int i_1241_, int i_1242_, int i_1243_,
			   int i_1244_, int i_1245_, int i_1246_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class189 class189 = method15377(Thread.currentThread());
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    int i_1247_ = i_1242_ - i;
	    int i_1248_ = i_1243_ - i_1241_;
	    int i_1249_ = i_1247_ >= 0 ? i_1247_ : -i_1247_;
	    int i_1250_ = i_1248_ >= 0 ? i_1248_ : -i_1248_;
	    int i_1251_ = i_1249_;
	    if (i_1251_ < i_1250_)
		i_1251_ = i_1250_;
	    if (0 != i_1251_) {
		int i_1252_ = (i_1247_ << 16) / i_1251_;
		int i_1253_ = (i_1248_ << 16) / i_1251_;
		i_1247_ += i_1252_ >> 16;
		i_1248_ += i_1253_ >> 16;
		if (i_1253_ <= i_1252_)
		    i_1252_ = -i_1252_;
		else
		    i_1253_ = -i_1253_;
		int i_1254_ = i_1245_ * i_1253_ >> 17;
		int i_1255_ = 1 + i_1245_ * i_1253_ >> 17;
		int i_1256_ = i_1245_ * i_1252_ >> 17;
		int i_1257_ = i_1252_ * i_1245_ + 1 >> 17;
		i -= class155.method3344();
		i_1241_ -= class155.method3371();
		int i_1258_ = i_1254_ + i;
		int i_1259_ = i - i_1255_;
		int i_1260_ = i + i_1247_ - i_1255_;
		int i_1261_ = i_1254_ + (i + i_1247_);
		int i_1262_ = i_1256_ + i_1241_;
		int i_1263_ = i_1241_ - i_1257_;
		int i_1264_ = i_1241_ + i_1248_ - i_1257_;
		int i_1265_ = i_1248_ + i_1241_ + i_1256_;
		if (0 == i_1246_)
		    ((Class155) class155).anInt1723 = 0;
		else if (1 == i_1246_)
		    ((Class155) class155).anInt1723 = 255 - (i_1244_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method2308(false);
		((Class155) class155).aBool1748
		    = (i_1258_ < 0 || i_1258_ > ((Class155) class155).anInt1733
		       || i_1259_ < 0
		       || i_1259_ > ((Class155) class155).anInt1733
		       || i_1260_ < 0
		       || i_1260_ > ((Class155) class155).anInt1733);
		class155.method3377(true, false, false, (float) i_1262_,
				    (float) i_1263_, (float) i_1264_,
				    (float) i_1258_, (float) i_1259_,
				    (float) i_1260_, 100.0F, 100.0F, 100.0F,
				    i_1244_);
		((Class155) class155).aBool1748
		    = (i_1258_ < 0 || i_1258_ > ((Class155) class155).anInt1733
		       || i_1260_ < 0
		       || i_1260_ > ((Class155) class155).anInt1733
		       || i_1261_ < 0
		       || i_1261_ > ((Class155) class155).anInt1733);
		class155.method3377(true, false, false, (float) i_1262_,
				    (float) i_1264_, (float) i_1265_,
				    (float) i_1258_, (float) i_1260_,
				    (float) i_1261_, 100.0F, 100.0F, 100.0F,
				    i_1244_);
		method2308(true);
	    }
	}
    }
    
    public void method2425(int i, int i_1266_, int i_1267_, int i_1268_,
			   int i_1269_, int i_1270_, int i_1271_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class189 class189 = method15377(Thread.currentThread());
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    int i_1272_ = i_1267_ - i;
	    int i_1273_ = i_1268_ - i_1266_;
	    int i_1274_ = i_1272_ >= 0 ? i_1272_ : -i_1272_;
	    int i_1275_ = i_1273_ >= 0 ? i_1273_ : -i_1273_;
	    int i_1276_ = i_1274_;
	    if (i_1276_ < i_1275_)
		i_1276_ = i_1275_;
	    if (0 != i_1276_) {
		int i_1277_ = (i_1272_ << 16) / i_1276_;
		int i_1278_ = (i_1273_ << 16) / i_1276_;
		i_1272_ += i_1277_ >> 16;
		i_1273_ += i_1278_ >> 16;
		if (i_1278_ <= i_1277_)
		    i_1277_ = -i_1277_;
		else
		    i_1278_ = -i_1278_;
		int i_1279_ = i_1270_ * i_1278_ >> 17;
		int i_1280_ = 1 + i_1270_ * i_1278_ >> 17;
		int i_1281_ = i_1270_ * i_1277_ >> 17;
		int i_1282_ = i_1277_ * i_1270_ + 1 >> 17;
		i -= class155.method3344();
		i_1266_ -= class155.method3371();
		int i_1283_ = i_1279_ + i;
		int i_1284_ = i - i_1280_;
		int i_1285_ = i + i_1272_ - i_1280_;
		int i_1286_ = i_1279_ + (i + i_1272_);
		int i_1287_ = i_1281_ + i_1266_;
		int i_1288_ = i_1266_ - i_1282_;
		int i_1289_ = i_1266_ + i_1273_ - i_1282_;
		int i_1290_ = i_1273_ + i_1266_ + i_1281_;
		if (0 == i_1271_)
		    ((Class155) class155).anInt1723 = 0;
		else if (1 == i_1271_)
		    ((Class155) class155).anInt1723 = 255 - (i_1269_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method2308(false);
		((Class155) class155).aBool1748
		    = (i_1283_ < 0 || i_1283_ > ((Class155) class155).anInt1733
		       || i_1284_ < 0
		       || i_1284_ > ((Class155) class155).anInt1733
		       || i_1285_ < 0
		       || i_1285_ > ((Class155) class155).anInt1733);
		class155.method3377(true, false, false, (float) i_1287_,
				    (float) i_1288_, (float) i_1289_,
				    (float) i_1283_, (float) i_1284_,
				    (float) i_1285_, 100.0F, 100.0F, 100.0F,
				    i_1269_);
		((Class155) class155).aBool1748
		    = (i_1283_ < 0 || i_1283_ > ((Class155) class155).anInt1733
		       || i_1285_ < 0
		       || i_1285_ > ((Class155) class155).anInt1733
		       || i_1286_ < 0
		       || i_1286_ > ((Class155) class155).anInt1733);
		class155.method3377(true, false, false, (float) i_1287_,
				    (float) i_1289_, (float) i_1290_,
				    (float) i_1283_, (float) i_1285_,
				    (float) i_1286_, 100.0F, 100.0F, 100.0F,
				    i_1269_);
		method2308(true);
	    }
	}
    }
    
    void method15410(boolean bool, int i, int i_1291_, float f, int i_1292_,
		     int i_1293_, int i_1294_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    if (i_1292_ < 0)
		i_1292_ = -i_1292_;
	    int i_1295_ = i_1291_ - i_1292_;
	    if (i_1295_ < -788450385 * ((Class103_Sub2) this).anInt9254)
		i_1295_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    int i_1296_ = 1 + (i_1292_ + i_1291_);
	    if (i_1296_ > 1546170165 * ((Class103_Sub2) this).anInt9252)
		i_1296_ = 1546170165 * ((Class103_Sub2) this).anInt9252;
	    int i_1297_ = i_1295_;
	    int i_1298_ = i_1292_ * i_1292_;
	    int i_1299_ = 0;
	    int i_1300_ = i_1291_ - i_1297_;
	    int i_1301_ = i_1300_ * i_1300_;
	    int i_1302_ = i_1301_ - i_1300_;
	    if (i_1291_ > i_1296_)
		i_1291_ = i_1296_;
	    int i_1303_ = i_1293_ >>> 24;
	    if (i_1294_ == 0 || i_1294_ == 1 && 255 == i_1303_) {
		while (i_1297_ < i_1291_) {
		    for (/**/; i_1302_ <= i_1298_ || i_1301_ <= i_1298_;
			 i_1302_ += i_1299_++ + i_1299_)
			i_1301_ += i_1299_ + i_1299_;
		    int i_1304_ = 1 + (i - i_1299_);
		    if (i_1304_
			< ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_1304_
			    = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_1305_ = i_1299_ + i;
		    if (i_1305_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_1305_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_1306_
			= (i_1304_
			   + i_1297_ * (-1826993761
					* ((Class103_Sub2) this).anInt9260));
		    for (int i_1307_ = i_1304_; i_1307_ < i_1305_; i_1307_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_1306_]))
			    ((Class103_Sub2) this).anIntArray9245[i_1306_]
				= i_1293_;
			i_1306_++;
		    }
		    i_1297_++;
		    i_1301_ -= i_1300_-- + i_1300_;
		    i_1302_ -= i_1300_ + i_1300_;
		}
		i_1299_ = i_1292_;
		i_1300_ = i_1297_ - i_1291_;
		i_1302_ = i_1298_ + i_1300_ * i_1300_;
		i_1301_ = i_1302_ - i_1299_;
		i_1302_ -= i_1300_;
		while (i_1297_ < i_1296_) {
		    for (/**/; i_1302_ > i_1298_ && i_1301_ > i_1298_;
			 i_1301_ -= i_1299_ + i_1299_)
			i_1302_ -= i_1299_-- + i_1299_;
		    int i_1308_ = i - i_1299_;
		    if (i_1308_
			< 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_1308_
			    = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_1309_ = i_1299_ + i;
		    if (i_1309_
			> 325436811 * ((Class103_Sub2) this).anInt9250 - 1)
			i_1309_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_1310_ = (i_1297_ * (((Class103_Sub2) this).anInt9260
					      * -1826993761)
				   + i_1308_);
		    for (int i_1311_ = i_1308_; i_1311_ <= i_1309_;
			 i_1311_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_1310_]))
			    ((Class103_Sub2) this).anIntArray9245[i_1310_]
				= i_1293_;
			i_1310_++;
		    }
		    i_1297_++;
		    i_1302_ += i_1300_ + i_1300_;
		    i_1301_ += i_1300_++ + i_1300_;
		}
	    } else if (1 == i_1294_) {
		i_1293_
		    = ((i_1303_ << 24)
		       + ((i_1303_ * (i_1293_ & 0xff00) >> 8 & 0xff00)
			  + (i_1303_ * (i_1293_ & 0xff00ff) >> 8 & 0xff00ff)));
		int i_1312_ = 256 - i_1303_;
		while (i_1297_ < i_1291_) {
		    for (/**/; i_1302_ <= i_1298_ || i_1301_ <= i_1298_;
			 i_1302_ += i_1299_++ + i_1299_)
			i_1301_ += i_1299_ + i_1299_;
		    int i_1313_ = 1 + (i - i_1299_);
		    if (i_1313_
			< ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_1313_
			    = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_1314_ = i_1299_ + i;
		    if (i_1314_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_1314_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_1315_
			= (i_1313_
			   + i_1297_ * (-1826993761
					* ((Class103_Sub2) this).anInt9260));
		    for (int i_1316_ = i_1313_; i_1316_ < i_1314_; i_1316_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_1315_])) {
			    int i_1317_ = (((Class103_Sub2) this)
					   .anIntArray9245[i_1315_]);
			    i_1317_ = ((i_1312_ * (i_1317_ & 0xff00ff) >> 8
					& 0xff00ff)
				       + ((i_1317_ & 0xff00) * i_1312_ >> 8
					  & 0xff00));
			    ((Class103_Sub2) this).anIntArray9245[i_1315_]
				= i_1293_ + i_1317_;
			}
			i_1315_++;
		    }
		    i_1297_++;
		    i_1301_ -= i_1300_-- + i_1300_;
		    i_1302_ -= i_1300_ + i_1300_;
		}
		i_1299_ = i_1292_;
		i_1300_ = -i_1300_;
		i_1302_ = i_1300_ * i_1300_ + i_1298_;
		i_1301_ = i_1302_ - i_1299_;
		i_1302_ -= i_1300_;
		while (i_1297_ < i_1296_) {
		    for (/**/; i_1302_ > i_1298_ && i_1301_ > i_1298_;
			 i_1301_ -= i_1299_ + i_1299_)
			i_1302_ -= i_1299_-- + i_1299_;
		    int i_1318_ = i - i_1299_;
		    if (i_1318_
			< 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_1318_
			    = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_1319_ = i_1299_ + i;
		    if (i_1319_
			> 325436811 * ((Class103_Sub2) this).anInt9250 - 1)
			i_1319_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_1320_
			= ((-1826993761 * ((Class103_Sub2) this).anInt9260
			    * i_1297_)
			   + i_1318_);
		    for (int i_1321_ = i_1318_; i_1321_ <= i_1319_;
			 i_1321_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_1320_])) {
			    int i_1322_ = (((Class103_Sub2) this)
					   .anIntArray9245[i_1320_]);
			    i_1322_
				= ((i_1312_ * (i_1322_ & 0xff00) >> 8 & 0xff00)
				   + (i_1312_ * (i_1322_ & 0xff00ff) >> 8
				      & 0xff00ff));
			    ((Class103_Sub2) this).anIntArray9245[i_1320_]
				= i_1293_ + i_1322_;
			}
			i_1320_++;
		    }
		    i_1297_++;
		    i_1302_ += i_1300_ + i_1300_;
		    i_1301_ += i_1300_++ + i_1300_;
		}
	    } else if (2 == i_1294_) {
		while (i_1297_ < i_1291_) {
		    for (/**/; i_1302_ <= i_1298_ || i_1301_ <= i_1298_;
			 i_1302_ += i_1299_++ + i_1299_)
			i_1301_ += i_1299_ + i_1299_;
		    int i_1323_ = i - i_1299_ + 1;
		    if (i_1323_
			< ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_1323_
			    = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_1324_ = i + i_1299_;
		    if (i_1324_ > 325436811 * ((Class103_Sub2) this).anInt9250)
			i_1324_ = 325436811 * ((Class103_Sub2) this).anInt9250;
		    int i_1325_ = ((((Class103_Sub2) this).anInt9260
				    * -1826993761 * i_1297_)
				   + i_1323_);
		    for (int i_1326_ = i_1323_; i_1326_ < i_1324_; i_1326_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_1325_])) {
			    int i_1327_ = (((Class103_Sub2) this)
					   .anIntArray9245[i_1325_]);
			    int i_1328_ = i_1293_ + i_1327_;
			    int i_1329_
				= (i_1327_ & 0xff00ff) + (i_1293_ & 0xff00ff);
			    i_1327_ = ((i_1328_ - i_1329_ & 0x10000)
				       + (i_1329_ & 0x1000100));
			    ((Class103_Sub2) this).anIntArray9245[i_1325_]
				= i_1328_ - i_1327_ | i_1327_ - (i_1327_
								 >>> 8);
			}
			i_1325_++;
		    }
		    i_1297_++;
		    i_1301_ -= i_1300_-- + i_1300_;
		    i_1302_ -= i_1300_ + i_1300_;
		}
		i_1299_ = i_1292_;
		i_1300_ = -i_1300_;
		i_1302_ = i_1298_ + i_1300_ * i_1300_;
		i_1301_ = i_1302_ - i_1299_;
		i_1302_ -= i_1300_;
		while (i_1297_ < i_1296_) {
		    for (/**/; i_1302_ > i_1298_ && i_1301_ > i_1298_;
			 i_1301_ -= i_1299_ + i_1299_)
			i_1302_ -= i_1299_-- + i_1299_;
		    int i_1330_ = i - i_1299_;
		    if (i_1330_
			< 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_1330_
			    = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_1331_ = i + i_1299_;
		    if (i_1331_
			> ((Class103_Sub2) this).anInt9250 * 325436811 - 1)
			i_1331_
			    = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		    int i_1332_ = ((((Class103_Sub2) this).anInt9260
				    * -1826993761 * i_1297_)
				   + i_1330_);
		    for (int i_1333_ = i_1330_; i_1333_ <= i_1331_;
			 i_1333_++) {
			if (!bool || f < (((Class103_Sub2) this)
					  .aFloatArray9248[i_1332_])) {
			    int i_1334_ = (((Class103_Sub2) this)
					   .anIntArray9245[i_1332_]);
			    int i_1335_ = i_1334_ + i_1293_;
			    int i_1336_
				= (i_1334_ & 0xff00ff) + (i_1293_ & 0xff00ff);
			    i_1334_
				= (i_1336_ & 0x1000100) + (i_1335_ - i_1336_
							   & 0x10000);
			    ((Class103_Sub2) this).anIntArray9245[i_1332_]
				= i_1335_ - i_1334_ | i_1334_ - (i_1334_
								 >>> 8);
			}
			i_1332_++;
		    }
		    i_1297_++;
		    i_1302_ += i_1300_ + i_1300_;
		    i_1301_ += i_1300_++ + i_1300_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public int method2427(int i, int i_1337_, int i_1338_, int i_1339_,
			  int i_1340_, int i_1341_) {
	int i_1342_ = 0;
	float f
	    = (((float) i_1338_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[2]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[6]
		     * (float) i_1337_)));
	float f_1343_
	    = (((float) i_1341_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (float) i_1339_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[2])
		  + (float) i_1340_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[6])));
	float f_1344_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + ((float) i
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7]
		  * (float) i_1337_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		  * (float) i_1338_));
	float f_1345_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		* (float) i_1341_)
	       + (((float) i_1339_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
		  + (float) i_1340_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[7])));
	if (f < -f_1344_ && f_1343_ < -f_1345_)
	    i_1342_ |= 0x10;
	else if (f > f_1344_ && f_1343_ > f_1345_)
	    i_1342_ |= 0x20;
	float f_1346_
	    = (((float) i_1338_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8])
	       + (((float) i_1337_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[0]
		      * (float) i)
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[12]))));
	float f_1347_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		* (float) i_1341_)
	       + (((float) i_1340_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[12]
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[0]) * (float) i_1339_)));
	if (f_1346_ < -f_1344_ && f_1347_ < -f_1345_)
	    i_1342_ |= 0x1;
	if (f_1346_ > f_1344_ && f_1347_ > f_1345_)
	    i_1342_ |= 0x2;
	float f_1348_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]
		* (float) i_1338_)
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		     * (float) i_1337_)));
	float f_1349_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
	       + ((float) i_1339_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		  * (float) i_1340_)
	       + ((float) i_1341_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]));
	if (f_1348_ < -f_1344_ && f_1349_ < -f_1345_)
	    i_1342_ |= 0x4;
	if (f_1348_ > f_1344_ && f_1349_ > f_1345_)
	    i_1342_ |= 0x8;
	return i_1342_;
    }
    
    public void method2471(int i, int i_1350_, int i_1351_, int i_1352_) {
	((Class103_Sub2) this).anInt9264 = i * -581464337;
	((Class103_Sub2) this).anInt9265 = i_1350_ * 495728313;
	((Class103_Sub2) this).anInt9251 = i_1351_ * -2006377139;
	((Class103_Sub2) this).anInt9267 = 1153843425 * i_1352_;
	method15372();
    }
    
    public void method2335(int i, Class86 class86) {
	Class189 class189 = method15377(Thread.currentThread());
	((Class189) class189).anInt2218 = i * 134228485;
	((Class189) class189).anInt2215 = -1026199509 * class86.anInt1251;
	((Class189) class189).anInt2230 = -516828645 * class86.anInt1252;
    }
    
    public int method2430(int i, int i_1353_, int i_1354_, int i_1355_,
			  int i_1356_, int i_1357_) {
	int i_1358_ = 0;
	float f
	    = (((float) i_1354_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[2]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[6]
		     * (float) i_1353_)));
	float f_1359_
	    = (((float) i_1357_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (float) i_1355_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[2])
		  + (float) i_1356_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[6])));
	float f_1360_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + ((float) i
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7]
		  * (float) i_1353_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		  * (float) i_1354_));
	float f_1361_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		* (float) i_1357_)
	       + (((float) i_1355_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
		  + (float) i_1356_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[7])));
	if (f < -f_1360_ && f_1359_ < -f_1361_)
	    i_1358_ |= 0x10;
	else if (f > f_1360_ && f_1359_ > f_1361_)
	    i_1358_ |= 0x20;
	float f_1362_
	    = (((float) i_1354_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8])
	       + (((float) i_1353_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[0]
		      * (float) i)
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[12]))));
	float f_1363_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		* (float) i_1357_)
	       + (((float) i_1356_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[12]
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[0]) * (float) i_1355_)));
	if (f_1362_ < -f_1360_ && f_1363_ < -f_1361_)
	    i_1358_ |= 0x1;
	if (f_1362_ > f_1360_ && f_1363_ > f_1361_)
	    i_1358_ |= 0x2;
	float f_1364_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]
		* (float) i_1354_)
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		     * (float) i_1353_)));
	float f_1365_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
	       + ((float) i_1355_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		  * (float) i_1356_)
	       + ((float) i_1357_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]));
	if (f_1364_ < -f_1360_ && f_1365_ < -f_1361_)
	    i_1358_ |= 0x4;
	if (f_1364_ > f_1360_ && f_1365_ > f_1361_)
	    i_1358_ |= 0x8;
	return i_1358_;
    }
    
    Class103_Sub2(Canvas canvas, Class107 class107, Interface6 interface6,
		  int i, int i_1366_) {
	this(class107, interface6);
	try {
	    method2239(canvas, i, i_1366_, 2046920301);
	    method2242(canvas, 1934733445);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method2220((byte) 0);
	    throw new RuntimeException("");
	}
    }
    
    public void method2432(Class266 class266, Class97 class97,
			   Class272 class272) {
	Class268 class268 = method2226();
	class268.method5203(class266);
	class268.method5202(((Class103_Sub2) this).aClass268_9262);
	class97.method2172(class272, ((Class103_Sub2) this).aClass268_9261,
			   class268, ((Class103_Sub2) this).aFloat9277,
			   ((Class103_Sub2) this).aFloat9271,
			   ((Class103_Sub2) this).aFloat9268,
			   ((Class103_Sub2) this).aFloat9270);
    }
    
    public void method2482(int i) {
	/* empty */
    }
    
    public Class241_Sub47 method2391(int i) {
	return null;
    }
    
    public Class168 method2435(int i, int i_1367_, boolean bool,
			       boolean bool_1368_) {
	if (bool)
	    return new Class168_Sub2_Sub2(this, i, i_1367_);
	return new Class168_Sub2_Sub1(this, i, i_1367_);
    }
    
    public void method2582(int i, int i_1369_, int i_1370_, int i_1371_,
			   int i_1372_, int i_1373_) {
	if (((Class103_Sub2) this).anIntArray9245 != null) {
	    i_1370_ -= i;
	    i_1371_ -= i_1369_;
	    if (0 == i_1371_) {
		if (i_1370_ >= 0)
		    method2272(i, i_1369_, 1 + i_1370_, i_1372_, i_1373_);
		else
		    method2272(i_1370_ + i, i_1369_, 1 + -i_1370_, i_1372_,
			       i_1373_);
	    } else if (i_1370_ == 0) {
		if (i_1371_ >= 0)
		    method2273(i, i_1369_, i_1371_ + 1, i_1372_, i_1373_);
		else
		    method2273(i, i_1369_ + i_1371_, 1 + -i_1371_, i_1372_,
			       i_1373_);
	    } else {
		if (i_1370_ + i_1371_ < 0) {
		    i += i_1370_;
		    i_1370_ = -i_1370_;
		    i_1369_ += i_1371_;
		    i_1371_ = -i_1371_;
		}
		if (i_1370_ > i_1371_) {
		    i_1369_ <<= 16;
		    i_1369_ += 32768;
		    i_1371_ <<= 16;
		    int i_1374_ = (int) Math.floor(0.5 + ((double) i_1371_
							  / (double) i_1370_));
		    i_1370_ += i;
		    if (i < 1298750001 * ((Class103_Sub2) this).anInt9249) {
			i_1369_ += i_1374_ * ((((Class103_Sub2) this).anInt9249
					       * 1298750001)
					      - i);
			i = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    }
		    if (i_1370_
			>= 325436811 * ((Class103_Sub2) this).anInt9250)
			i_1370_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_1375_ = i_1372_ >>> 24;
		    if (0 == i_1373_ || i_1373_ == 1 && i_1375_ == 255) {
			for (/**/; i <= i_1370_; i++) {
			    int i_1376_ = i_1369_ >> 16;
			    if (i_1376_ >= (((Class103_Sub2) this).anInt9254
					    * -788450385)
				&& i_1376_ < 1546170165 * ((Class103_Sub2)
							   this).anInt9252)
				((Class103_Sub2) this).anIntArray9245
				    [(((Class103_Sub2) this).anInt9260
				      * -1826993761 * i_1376_) + i]
				    = i_1372_;
			    i_1369_ += i_1374_;
			}
		    } else if (1 == i_1373_) {
			i_1372_
			    = ((i_1375_ << 24)
			       + ((i_1375_ * (i_1372_ & 0xff00) >> 8 & 0xff00)
				  + (i_1375_ * (i_1372_ & 0xff00ff) >> 8
				     & 0xff00ff)));
			int i_1377_ = 256 - i_1375_;
			for (/**/; i <= i_1370_; i++) {
			    int i_1378_ = i_1369_ >> 16;
			    if (i_1378_ >= (-788450385
					    * ((Class103_Sub2) this).anInt9254)
				&& i_1378_ < 1546170165 * ((Class103_Sub2)
							   this).anInt9252) {
				int i_1379_ = (((Class103_Sub2) this).anInt9260
					       * -1826993761 * i_1378_) + i;
				int i_1380_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1379_]);
				i_1380_
				    = (((i_1380_ & 0xff00) * i_1377_ >> 8
					& 0xff00)
				       + (i_1377_ * (i_1380_ & 0xff00ff) >> 8
					  & 0xff00ff));
				((Class103_Sub2) this).anIntArray9245[i_1379_]
				    = i_1372_ + i_1380_;
			    }
			    i_1369_ += i_1374_;
			}
		    } else if (2 == i_1373_) {
			for (/**/; i <= i_1370_; i++) {
			    int i_1381_ = i_1369_ >> 16;
			    if (i_1381_ >= (((Class103_Sub2) this).anInt9254
					    * -788450385)
				&& i_1381_ < 1546170165 * ((Class103_Sub2)
							   this).anInt9252) {
				int i_1382_
				    = i + i_1381_ * (-1826993761
						     * (((Class103_Sub2) this)
							.anInt9260));
				int i_1383_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1382_]);
				int i_1384_ = i_1372_ + i_1383_;
				int i_1385_ = ((i_1383_ & 0xff00ff)
					       + (i_1372_ & 0xff00ff));
				i_1383_ = ((i_1385_ & 0x1000100)
					   + (i_1384_ - i_1385_ & 0x10000));
				((Class103_Sub2) this).anIntArray9245[i_1382_]
				    = i_1384_ - i_1383_ | i_1383_ - (i_1383_
								     >>> 8);
			    }
			    i_1369_ += i_1374_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_1370_ <<= 16;
		    int i_1386_ = (int) Math.floor(0.5 + ((double) i_1370_
							  / (double) i_1371_));
		    i_1371_ += i_1369_;
		    if (i_1369_
			< -788450385 * ((Class103_Sub2) this).anInt9254) {
			i += (i_1386_
			      * (((Class103_Sub2) this).anInt9254 * -788450385
				 - i_1369_));
			i_1369_
			    = -788450385 * ((Class103_Sub2) this).anInt9254;
		    }
		    if (i_1371_
			>= 1546170165 * ((Class103_Sub2) this).anInt9252)
			i_1371_
			    = (((Class103_Sub2) this).anInt9252 * 1546170165
			       - 1);
		    int i_1387_ = i_1372_ >>> 24;
		    if (0 == i_1373_ || i_1373_ == 1 && 255 == i_1387_) {
			for (/**/; i_1369_ <= i_1371_; i_1369_++) {
			    int i_1388_ = i >> 16;
			    if (i_1388_ >= (1298750001
					    * ((Class103_Sub2) this).anInt9249)
				&& i_1388_ < 325436811 * ((Class103_Sub2)
							  this).anInt9250)
				((Class103_Sub2) this).anIntArray9245
				    [(((Class103_Sub2) this).anInt9260
				      * -1826993761 * i_1369_) + i_1388_]
				    = i_1372_;
			    i += i_1386_;
			}
		    } else if (1 == i_1373_) {
			i_1372_
			    = (((i_1372_ & 0xff00ff) * i_1387_ >> 8 & 0xff00ff)
			       + ((i_1372_ & 0xff00) * i_1387_ >> 8 & 0xff00)
			       + (i_1387_ << 24));
			int i_1389_ = 256 - i_1387_;
			for (/**/; i_1369_ <= i_1371_; i_1369_++) {
			    int i_1390_ = i >> 16;
			    if (i_1390_ >= (((Class103_Sub2) this).anInt9249
					    * 1298750001)
				&& i_1390_ < 325436811 * ((Class103_Sub2)
							  this).anInt9250) {
				int i_1391_
				    = ((i_1369_
					* (-1826993761
					   * ((Class103_Sub2) this).anInt9260))
				       + i_1390_);
				int i_1392_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1391_]);
				i_1392_
				    = (((i_1392_ & 0xff00) * i_1389_ >> 8
					& 0xff00)
				       + ((i_1392_ & 0xff00ff) * i_1389_ >> 8
					  & 0xff00ff));
				((Class103_Sub2) this).anIntArray9245
				    [(((Class103_Sub2) this).anInt9260
				      * -1826993761 * i_1369_) + i_1390_]
				    = i_1392_ + i_1372_;
			    }
			    i += i_1386_;
			}
		    } else if (i_1373_ == 2) {
			for (/**/; i_1369_ <= i_1371_; i_1369_++) {
			    int i_1393_ = i >> 16;
			    if (i_1393_ >= (((Class103_Sub2) this).anInt9249
					    * 1298750001)
				&& i_1393_ < (((Class103_Sub2) this).anInt9250
					      * 325436811)) {
				int i_1394_
				    = ((i_1369_
					* (-1826993761
					   * ((Class103_Sub2) this).anInt9260))
				       + i_1393_);
				int i_1395_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1394_]);
				int i_1396_ = i_1372_ + i_1395_;
				int i_1397_ = ((i_1372_ & 0xff00ff)
					       + (i_1395_ & 0xff00ff));
				i_1395_ = ((i_1397_ & 0x1000100)
					   + (i_1396_ - i_1397_ & 0x10000));
				((Class103_Sub2) this).anIntArray9245[i_1394_]
				    = i_1396_ - i_1395_ | i_1395_ - (i_1395_
								     >>> 8);
			    }
			    i += i_1386_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method2618(Class266 class266, Class97 class97,
			   Class272 class272) {
	Class268 class268 = method2226();
	class268.method5203(class266);
	class268.method5202(((Class103_Sub2) this).aClass268_9262);
	class97.method2172(class272, ((Class103_Sub2) this).aClass268_9261,
			   class268, ((Class103_Sub2) this).aFloat9277,
			   ((Class103_Sub2) this).aFloat9271,
			   ((Class103_Sub2) this).aFloat9268,
			   ((Class103_Sub2) this).aFloat9270);
    }
    
    public void method2337(float f, float f_1398_, float f_1399_, float[] fs) {
	float f_1400_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10]
		* f_1399_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + f * (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			 [2])
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[6]
		     * f_1398_)));
	float f_1401_
	    = (f * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3]
	       + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + (f_1398_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7])
	       + f_1399_ * (((Class103_Sub2) this).aClass268_9262
			    .aFloatArray4353[11]));
	if (f_1400_ < -f_1401_ || f_1400_ > f_1401_) {
	    float[] fs_1402_ = fs;
	    float[] fs_1403_ = fs;
	    fs[2] = Float.NaN;
	    fs_1403_[1] = Float.NaN;
	    fs_1402_[0] = Float.NaN;
	} else {
	    float f_1404_
		= ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		    * f_1399_)
		   + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4]
		       * f_1398_)
		      + (f * (((Class103_Sub2) this).aClass268_9262
			      .aFloatArray4353[0])
			 + (((Class103_Sub2) this).aClass268_9262
			    .aFloatArray4353[12]))));
	    if (f_1404_ < -f_1401_ || f_1404_ > f_1401_) {
		float[] fs_1405_ = fs;
		float[] fs_1406_ = fs;
		fs[2] = Float.NaN;
		fs_1406_[1] = Float.NaN;
		fs_1405_[0] = Float.NaN;
	    } else {
		float f_1407_
		    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[9]) * f_1399_
		       + ((((Class103_Sub2) this).aClass268_9262
			   .aFloatArray4353[1]) * f
			  + (((Class103_Sub2) this).aClass268_9262
			     .aFloatArray4353[13])
			  + f_1398_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[5])));
		if (f_1407_ < -f_1401_ || f_1407_ > f_1401_) {
		    float[] fs_1408_ = fs;
		    float[] fs_1409_ = fs;
		    fs[2] = Float.NaN;
		    fs_1409_[1] = Float.NaN;
		    fs_1408_[0] = Float.NaN;
		} else {
		    float f_1410_
			= ((((Class103_Sub2) this).aClass268_9279
			    .aFloatArray4353[2]) * f
			   + (((Class103_Sub2) this).aClass268_9279
			      .aFloatArray4353[14])
			   + f_1398_ * (((Class103_Sub2) this).aClass268_9279
					.aFloatArray4353[6])
			   + f_1399_ * (((Class103_Sub2) this).aClass268_9279
					.aFloatArray4353[10]));
		    fs[0] = (((Class103_Sub2) this).aFloat9277
			     + (f_1404_ * ((Class103_Sub2) this).aFloat9268
				/ f_1401_));
		    fs[1] = (((Class103_Sub2) this).aFloat9271
			     + (((Class103_Sub2) this).aFloat9270 * f_1407_
				/ f_1401_));
		    fs[2] = f_1410_;
		}
	    }
	}
    }
    
    public Class168 method2439(int[] is, int i, int i_1411_, int i_1412_,
			       int i_1413_, boolean bool) {
	boolean bool_1414_ = false;
	int i_1415_ = i;
    while_100_:
	for (int i_1416_ = 0; i_1416_ < i_1413_; i_1416_++) {
	    for (int i_1417_ = 0; i_1417_ < i_1412_; i_1417_++) {
		int i_1418_ = is[i_1415_++] >>> 24;
		if (0 != i_1418_ && i_1418_ != 255) {
		    bool_1414_ = true;
		    break while_100_;
		}
	    }
	}
	if (bool_1414_)
	    return new Class168_Sub2_Sub2(this, is, i, i_1411_, i_1412_,
					  i_1413_, bool);
	return new Class168_Sub2_Sub1(this, is, i, i_1411_, i_1412_, i_1413_,
				      bool);
    }
    
    public void method2387(boolean bool) {
	Class189 class189 = method15377(Thread.currentThread());
	((Class189) class189).aBool2220 = bool;
    }
    
    public int method2370(int i, int i_1419_, int i_1420_, int i_1421_,
			  int i_1422_, int i_1423_) {
	int i_1424_ = 0;
	float f
	    = (((float) i_1420_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[2]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[6]
		     * (float) i_1419_)));
	float f_1425_
	    = (((float) i_1423_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (float) i_1421_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[2])
		  + (float) i_1422_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[6])));
	float f_1426_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + ((float) i
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7]
		  * (float) i_1419_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		  * (float) i_1420_));
	float f_1427_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		* (float) i_1423_)
	       + (((float) i_1421_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
		  + (float) i_1422_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[7])));
	if (f < -f_1426_ && f_1425_ < -f_1427_)
	    i_1424_ |= 0x10;
	else if (f > f_1426_ && f_1425_ > f_1427_)
	    i_1424_ |= 0x20;
	float f_1428_
	    = (((float) i_1420_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8])
	       + (((float) i_1419_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[0]
		      * (float) i)
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[12]))));
	float f_1429_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		* (float) i_1423_)
	       + (((float) i_1422_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[12]
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[0]) * (float) i_1421_)));
	if (f_1428_ < -f_1426_ && f_1429_ < -f_1427_)
	    i_1424_ |= 0x1;
	if (f_1428_ > f_1426_ && f_1429_ > f_1427_)
	    i_1424_ |= 0x2;
	float f_1430_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]
		* (float) i_1420_)
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		     * (float) i_1419_)));
	float f_1431_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
	       + ((float) i_1421_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		  * (float) i_1422_)
	       + ((float) i_1423_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]));
	if (f_1430_ < -f_1426_ && f_1431_ < -f_1427_)
	    i_1424_ |= 0x4;
	if (f_1430_ > f_1426_ && f_1431_ > f_1427_)
	    i_1424_ |= 0x8;
	return i_1424_;
    }
    
    public Class168 method2294(int i, int i_1432_, int i_1433_, int i_1434_,
			       boolean bool) {
	if (((Class103_Sub2) this).anIntArray9245 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_1434_ * i_1433_];
	int i_1435_
	    = i + i_1432_ * (-1826993761 * ((Class103_Sub2) this).anInt9260);
	int i_1436_ = -1826993761 * ((Class103_Sub2) this).anInt9260 - i_1433_;
	for (int i_1437_ = 0; i_1437_ < i_1434_; i_1437_++) {
	    int i_1438_ = i_1437_ * i_1433_;
	    for (int i_1439_ = 0; i_1439_ < i_1433_; i_1439_++)
		is[i_1439_ + i_1438_]
		    = ((Class103_Sub2) this).anIntArray9245[i_1435_++];
	    i_1435_ += i_1436_;
	}
	if (bool)
	    return new Class168_Sub2_Sub2(this, is, i_1433_, i_1434_);
	return new Class168_Sub2_Sub1(this, is, i_1433_, i_1434_);
    }
    
    public Class266 method2555() {
	return new Class266(((Class103_Sub2) this).aClass266_9259);
    }
    
    public void method2405(int[] is) {
	is[0] = ((Class103_Sub2) this).anInt9249 * 1298750001;
	is[1] = -788450385 * ((Class103_Sub2) this).anInt9254;
	is[2] = 325436811 * ((Class103_Sub2) this).anInt9250;
	is[3] = 1546170165 * ((Class103_Sub2) this).anInt9252;
    }
    
    public Interface5 method2538(int i, int i_1440_, int i_1441_) {
	return new Class158(i, i_1440_);
    }
    
    public Class135 method2446(int i, int i_1442_, int[] is, int[] is_1443_) {
	return new Class135_Sub1(i, i_1442_, is, is_1443_);
    }
    
    public Class135 method2444(int i, int i_1444_, int[] is, int[] is_1445_) {
	return new Class135_Sub1(i, i_1444_, is, is_1445_);
    }
    
    public void method2448(int i, Class135 class135, int i_1446_,
			   int i_1447_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    int[] is = ((Class135_Sub1) class135_sub1).anIntArray9874;
	    int[] is_1448_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	    int i_1449_;
	    if (1546170165 * ((Class103_Sub2) this).anInt9252
		< is.length + i_1447_)
		i_1449_
		    = ((Class103_Sub2) this).anInt9252 * 1546170165 - i_1447_;
	    else
		i_1449_ = is.length;
	    int i_1450_;
	    if (((Class103_Sub2) this).anInt9254 * -788450385 > i_1447_) {
		i_1450_
		    = ((Class103_Sub2) this).anInt9254 * -788450385 - i_1447_;
		i_1447_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    } else
		i_1450_ = 0;
	    if (i_1449_ - i_1450_ > 0) {
		int i_1451_ = i_1447_ * (((Class103_Sub2) this).anInt9260
					 * -1826993761);
		for (int i_1452_ = i_1450_; i_1452_ < i_1449_; i_1452_++) {
		    int i_1453_ = i_1446_ + is[i_1452_];
		    int i_1454_ = is_1448_[i_1452_];
		    if (((Class103_Sub2) this).anInt9249 * 1298750001
			> i_1453_) {
			i_1454_
			    -= (1298750001 * ((Class103_Sub2) this).anInt9249
				- i_1453_);
			i_1453_
			    = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    }
		    if (((Class103_Sub2) this).anInt9250 * 325436811
			< i_1453_ + i_1454_)
			i_1454_ = (((Class103_Sub2) this).anInt9250 * 325436811
				   - i_1453_);
		    i_1453_ += i_1451_;
		    for (int i_1455_ = -i_1454_; i_1455_ < 0; i_1455_++)
			((Class103_Sub2) this).anIntArray9245[i_1453_++] = i;
		    i_1451_ += ((Class103_Sub2) this).anInt9260 * -1826993761;
		}
	    }
	}
    }
    
    public void method2449(int i, Class135 class135, int i_1456_,
			   int i_1457_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    int[] is = ((Class135_Sub1) class135_sub1).anIntArray9874;
	    int[] is_1458_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	    int i_1459_;
	    if (1546170165 * ((Class103_Sub2) this).anInt9252
		< is.length + i_1457_)
		i_1459_
		    = ((Class103_Sub2) this).anInt9252 * 1546170165 - i_1457_;
	    else
		i_1459_ = is.length;
	    int i_1460_;
	    if (((Class103_Sub2) this).anInt9254 * -788450385 > i_1457_) {
		i_1460_
		    = ((Class103_Sub2) this).anInt9254 * -788450385 - i_1457_;
		i_1457_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    } else
		i_1460_ = 0;
	    if (i_1459_ - i_1460_ > 0) {
		int i_1461_ = i_1457_ * (((Class103_Sub2) this).anInt9260
					 * -1826993761);
		for (int i_1462_ = i_1460_; i_1462_ < i_1459_; i_1462_++) {
		    int i_1463_ = i_1456_ + is[i_1462_];
		    int i_1464_ = is_1458_[i_1462_];
		    if (((Class103_Sub2) this).anInt9249 * 1298750001
			> i_1463_) {
			i_1464_
			    -= (1298750001 * ((Class103_Sub2) this).anInt9249
				- i_1463_);
			i_1463_
			    = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    }
		    if (((Class103_Sub2) this).anInt9250 * 325436811
			< i_1463_ + i_1464_)
			i_1464_ = (((Class103_Sub2) this).anInt9250 * 325436811
				   - i_1463_);
		    i_1463_ += i_1461_;
		    for (int i_1465_ = -i_1464_; i_1465_ < 0; i_1465_++)
			((Class103_Sub2) this).anIntArray9245[i_1463_++] = i;
		    i_1461_ += ((Class103_Sub2) this).anInt9260 * -1826993761;
		}
	    }
	}
    }
    
    public void method2499(int i) {
	Class89_Sub3.anInt9676 = Class89_Sub3.anInt9689 = i;
	if (592623211 * ((Class103_Sub2) this).anInt9274 > 1)
	    throw new IllegalStateException();
	method15376(592623211 * ((Class103_Sub2) this).anInt9274);
	method15375(0);
    }
    
    public void method2451(int i) {
	Class89_Sub3.anInt9676 = Class89_Sub3.anInt9689 = i;
	if (592623211 * ((Class103_Sub2) this).anInt9274 > 1)
	    throw new IllegalStateException();
	method15376(592623211 * ((Class103_Sub2) this).anInt9274);
	method15375(0);
    }
    
    public Class89 method2452(Class161 class161, int i, int i_1466_,
			      int i_1467_, int i_1468_) {
	return new Class89_Sub3(this, class161, i, i_1467_, i_1468_, i_1466_);
    }
    
    public Class89 method2503(Class161 class161, int i, int i_1469_,
			      int i_1470_, int i_1471_) {
	return new Class89_Sub3(this, class161, i, i_1470_, i_1471_, i_1469_);
    }
    
    public Class89 method2454(Class161 class161, int i, int i_1472_,
			      int i_1473_, int i_1474_) {
	return new Class89_Sub3(this, class161, i, i_1473_, i_1474_, i_1472_);
    }
    
    public int method2379(int i, int i_1475_) {
	return i | i_1475_;
    }
    
    public boolean method2353() {
	return true;
    }
    
    void method15411() {
	int i = (325436811 * ((Class103_Sub2) this).anInt9250
		 - ((Class103_Sub2) this).anInt9249 * 1298750001);
	int i_1476_ = (1546170165 * ((Class103_Sub2) this).anInt9252
		       - -788450385 * ((Class103_Sub2) this).anInt9254);
	float f = (((Class103_Sub2) this).aFloat9268
		   = ((float) (-1144298619 * ((Class103_Sub2) this).anInt9251)
		      / 2.0F));
	float f_1477_
	    = (((Class103_Sub2) this).aFloat9270
	       = ((float) (-762379487 * ((Class103_Sub2) this).anInt9267)
		  / 2.0F));
	((Class103_Sub2) this).aFloat9277
	    = f + (float) (((Class103_Sub2) this).anInt9264 * -771006449);
	((Class103_Sub2) this).aFloat9271
	    = (float) (534835081 * ((Class103_Sub2) this).anInt9265) + f_1477_;
	for (int i_1478_ = 0;
	     i_1478_ < ((Class103_Sub2) this).anInt9274 * 592623211;
	     i_1478_++) {
	    Class189 class189
		= ((Class103_Sub2) this).aClass189Array9275[i_1478_];
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aFloat1728 = f;
	    ((Class155) class155).aFloat1729 = f_1477_;
	    ((Class155) class155).aFloat1727
		= (((Class103_Sub2) this).aFloat9277
		   - (float) (1298750001 * ((Class103_Sub2) this).anInt9249));
	    ((Class155) class155).aFloat1731
		= (((Class103_Sub2) this).aFloat9271
		   - (float) (-788450385 * ((Class103_Sub2) this).anInt9254));
	    ((Class155) class155).anInt1733 = i;
	    ((Class155) class155).anInt1726 = i_1476_;
	}
	int i_1479_ = ((-1826993761 * ((Class103_Sub2) this).anInt9260
			* (-788450385 * ((Class103_Sub2) this).anInt9254))
		       + ((Class103_Sub2) this).anInt9249 * 1298750001);
	for (int i_1480_ = -788450385 * ((Class103_Sub2) this).anInt9254;
	     i_1480_ < ((Class103_Sub2) this).anInt9252 * 1546170165;
	     i_1480_++) {
	    for (int i_1481_ = 0;
		 i_1481_ < ((Class103_Sub2) this).anInt9274 * 592623211;
		 i_1481_++)
		((Class155) (((Class189) (((Class103_Sub2) this)
					  .aClass189Array9275[i_1481_]))
			     .aClass155_2223))
		    .anIntArray1730
		    [i_1480_ - -788450385 * ((Class103_Sub2) this).anInt9254]
		    = i_1479_;
	    i_1479_ += -1826993761 * ((Class103_Sub2) this).anInt9260;
	}
    }
    
    public Class266 method2458() {
	Class189 class189 = method15377(Thread.currentThread());
	return ((Class189) class189).aClass266_2222;
    }
    
    public Class266 method2233() {
	Class189 class189 = method15377(Thread.currentThread());
	return ((Class189) class189).aClass266_2222;
    }
    
    public Class266 method2318() {
	Class189 class189 = method15377(Thread.currentThread());
	return ((Class189) class189).aClass266_2222;
    }
    
    public Class96 method2551(Class639 class639, Class108[] class108s,
			      boolean bool) {
	int[] is = new int[class108s.length];
	int[] is_1482_ = new int[class108s.length];
	boolean bool_1483_ = false;
	boolean bool_1484_ = false;
	for (int i = 0; i < class108s.length; i++) {
	    is[i] = class108s[i].method2698();
	    is_1482_[i] = class108s[i].method2694();
	    if (class108s[i].method2692())
		bool_1483_ = true;
	    if (class108s[i].method2691())
		bool_1484_ = true;
	}
	if (bool) {
	    if (bool_1484_) {
		if (bool_1483_)
		    return new Class96_Sub1(this, class639,
					    (Class108_Sub2[]) class108s, is,
					    is_1482_);
		return new Class96_Sub3(this, class639,
					(Class108_Sub2[]) class108s, is,
					is_1482_);
	    }
	    if (bool_1483_)
		return new Class96_Sub1(this, class639,
					(Class108_Sub1[]) class108s, is,
					is_1482_);
	    return new Class96_Sub3(this, class639,
				    (Class108_Sub1[]) class108s, is, is_1482_);
	}
	if (bool_1484_) {
	    if (bool_1483_)
		throw new IllegalArgumentException("");
	    return new Class96_Sub5(this, class639,
				    (Class108_Sub2[]) class108s, is, is_1482_);
	}
	return new Class96_Sub2(this, class639, (Class108_Sub1[]) class108s,
				is, is_1482_);
    }
    
    public int method2470() {
	return 0;
    }
    
    public int method2463() {
	return 0;
    }
    
    public int method2464() {
	return 0;
    }
    
    public Class241_Sub43 method2465(int i, int i_1485_, int i_1486_,
				     int i_1487_, int i_1488_, float f) {
	return null;
    }
    
    public void method2493(int i, int i_1489_, int i_1490_, int i_1491_) {
	/* empty */
    }
    
    void method15412(int i, int i_1492_, int[] is, float[] fs) {
	((Class103_Sub2) this).anInt9260 = i * 1904120415;
	((Class103_Sub2) this).anInt9278 = i_1492_ * -710038965;
	((Class103_Sub2) this).anIntArray9245 = is;
	((Class103_Sub2) this).aFloatArray9248 = fs;
	for (int i_1493_ = 0;
	     i_1493_ < ((Class103_Sub2) this).anInt9274 * 592623211; i_1493_++)
	    ((Class103_Sub2) this).aClass189Array9275[i_1493_]
		.method3871(1262128896);
	method2572();
	method2295();
    }
    
    public Class241_Sub43 method2468(int i, int i_1494_, int i_1495_,
				     int i_1496_, int i_1497_, float f) {
	return null;
    }
    
    public boolean method2364() {
	return false;
    }
    
    public void method2400(int i, int i_1498_, int i_1499_, int i_1500_) {
	if (i < 0)
	    i = 0;
	if (i_1498_ < 0)
	    i_1498_ = 0;
	if (i_1499_ > ((Class103_Sub2) this).anInt9260 * -1826993761)
	    i_1499_ = ((Class103_Sub2) this).anInt9260 * -1826993761;
	if (i_1500_ > -2069999773 * ((Class103_Sub2) this).anInt9278)
	    i_1500_ = -2069999773 * ((Class103_Sub2) this).anInt9278;
	((Class103_Sub2) this).anInt9249 = 211664593 * i;
	((Class103_Sub2) this).anInt9250 = 244169251 * i_1499_;
	((Class103_Sub2) this).anInt9254 = -1495661745 * i_1498_;
	((Class103_Sub2) this).anInt9252 = 1034251037 * i_1500_;
	method15372();
    }
    
    public void method2426(int i, Class86 class86) {
	for (int i_1501_ = 0;
	     i_1501_ < ((Class103_Sub2) this).aClass189Array9275.length;
	     i_1501_++) {
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1501_])
		.anInt2240
		= 1208111489 * (((Class189) (((Class103_Sub2) this)
					     .aClass189Array9275[i_1501_]))
				.anInt2215);
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1501_])
		.anInt2218
		= i * 134228485;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1501_])
		.anInt2215
		= class86.anInt1251 * -1026199509;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1501_])
		.anInt2230
		= class86.anInt1252 * -516828645;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1501_])
		.aBool2217
		= true;
	}
    }
    
    Class189 method15413(Runnable runnable) {
	for (int i = 0; i < ((Class103_Sub2) this).anInt9274 * 592623211;
	     i++) {
	    if (runnable
		== (((Class189) ((Class103_Sub2) this).aClass189Array9275[i])
		    .aRunnable2210))
		return ((Class103_Sub2) this).aClass189Array9275[i];
	}
	return null;
    }
    
    public int method2350(int i, int i_1502_, int i_1503_, int i_1504_,
			  int i_1505_, int i_1506_) {
	int i_1507_ = 0;
	float f
	    = (((float) i_1503_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[2]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[6]
		     * (float) i_1502_)));
	float f_1508_
	    = (((float) i_1506_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (float) i_1504_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[2])
		  + (float) i_1505_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[6])));
	float f_1509_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + ((float) i
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7]
		  * (float) i_1502_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		  * (float) i_1503_));
	float f_1510_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		* (float) i_1506_)
	       + (((float) i_1504_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
		  + (float) i_1505_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[7])));
	if (f < -f_1509_ && f_1508_ < -f_1510_)
	    i_1507_ |= 0x10;
	else if (f > f_1509_ && f_1508_ > f_1510_)
	    i_1507_ |= 0x20;
	float f_1511_
	    = (((float) i_1503_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8])
	       + (((float) i_1502_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[0]
		      * (float) i)
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[12]))));
	float f_1512_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		* (float) i_1506_)
	       + (((float) i_1505_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[12]
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[0]) * (float) i_1504_)));
	if (f_1511_ < -f_1509_ && f_1512_ < -f_1510_)
	    i_1507_ |= 0x1;
	if (f_1511_ > f_1509_ && f_1512_ > f_1510_)
	    i_1507_ |= 0x2;
	float f_1513_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]
		* (float) i_1503_)
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		     * (float) i_1502_)));
	float f_1514_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
	       + ((float) i_1504_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		  * (float) i_1505_)
	       + ((float) i_1506_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]));
	if (f_1513_ < -f_1509_ && f_1514_ < -f_1510_)
	    i_1507_ |= 0x4;
	if (f_1513_ > f_1509_ && f_1514_ > f_1510_)
	    i_1507_ |= 0x8;
	return i_1507_;
    }
    
    boolean method15414(int i, int i_1515_) {
	return anInterface6_1457.method31(i, Class537.aClass537_6990, 0.7F,
					  i_1515_, i_1515_, true, 1105440618);
    }
    
    void method15415(boolean bool, boolean bool_1516_, boolean bool_1517_,
		     Class98 class98) {
	Class189 class189 = method15377(Thread.currentThread());
	for (Class247_Sub1_Sub1 class247_sub1_sub1
		 = ((Class247_Sub1_Sub1)
		    class98.aClass441_1353.method7837(-1646186464));
	     null != class247_sub1_sub1;
	     class247_sub1_sub1
		 = ((Class247_Sub1_Sub1)
		    class98.aClass441_1353.method7836(1256557480))) {
	    int i = class247_sub1_sub1.anInt11064 >> 12;
	    int i_1518_ = class247_sub1_sub1.anInt11061 >> 12;
	    int i_1519_ = class247_sub1_sub1.anInt11060 >> 12;
	    float f
		= (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		   + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
		       [10]) * (float) i_1519_
		      + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			  [6]) * (float) i_1518_
			 + (float) i * (((Class103_Sub2) this).aClass268_9262
					.aFloatArray4353[2]))));
	    float f_1520_
		= (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
		   + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
		       [11]) * (float) i_1519_
		      + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			  [3]) * (float) i
			 + (float) i_1518_ * (((Class103_Sub2) this)
					      .aClass268_9262.aFloatArray4353
					      [7]))));
	    if (!(f < -f_1520_)) {
		float f_1521_
		    = (((Class103_Sub2) this).aFloat9272 * f / f_1520_
		       + ((Class103_Sub2) this).aFloat9276);
		if (!(f > ((Class189) class189).aFloat2213)) {
		    float f_1522_
			= ((float) i_1519_ * (((Class103_Sub2) this)
					      .aClass268_9262.aFloatArray4353
					      [8])
			   + ((((Class103_Sub2) this).aClass268_9262
			       .aFloatArray4353[4]) * (float) i_1518_
			      + (((Class103_Sub2) this).aClass268_9262
				 .aFloatArray4353[0]) * (float) i)
			   + (((Class103_Sub2) this).aClass268_9262
			      .aFloatArray4353[12]));
		    float f_1523_ = ((((Class103_Sub2) this).aClass268_9262
				      .aFloatArray4353[9]) * (float) i_1519_
				     + ((((Class103_Sub2) this).aClass268_9262
					 .aFloatArray4353[5]) * (float) i_1518_
					+ (float) i * (((Class103_Sub2) this)
						       .aClass268_9262
						       .aFloatArray4353[1]))
				     + (((Class103_Sub2) this).aClass268_9262
					.aFloatArray4353[13]));
		    if (!(f_1522_ < -f_1520_) && !(f_1522_ > f_1520_)
			&& !(f_1523_ < -f_1520_) && !(f_1523_ > f_1520_)) {
			float f_1524_
			    = (float) class247_sub1_sub1.anInt11058 / 4096.0F;
			float f_1525_ = ((((Class103_Sub2) this).aClass268_9261
					  .aFloatArray4353[0]) * f_1524_
					 + f_1522_);
			float f_1526_
			    = f_1520_ + (((Class103_Sub2) this).aClass268_9261
					 .aFloatArray4353[3]) * f_1524_;
			float f_1527_ = ((((Class103_Sub2) this).aFloat9268
					  * f_1522_ / f_1520_)
					 + ((Class103_Sub2) this).aFloat9277);
			float f_1528_ = ((((Class103_Sub2) this).aFloat9270
					  * f_1523_ / f_1520_)
					 + ((Class103_Sub2) this).aFloat9271);
			float f_1529_
			    = ((f_1525_ * ((Class103_Sub2) this).aFloat9268
				/ f_1526_)
			       + ((Class103_Sub2) this).aFloat9277);
			method15379(bool, bool_1516_, bool_1517_,
				    class247_sub1_sub1, (int) f_1527_,
				    (int) f_1528_, f_1521_,
				    (int) (f_1529_ < f_1527_
					   ? f_1527_ - f_1529_
					   : f_1529_ - f_1527_));
		    }
		}
	    }
	}
    }
    
    void method2509(float f, float f_1530_, float f_1531_, float f_1532_,
		    float f_1533_, float f_1534_) {
	/* empty */
    }
    
    public void method2371(boolean bool) {
	/* empty */
    }
    
    void method15416(boolean bool, boolean bool_1535_, boolean bool_1536_,
		     Class247_Sub1_Sub1 class247_sub1_sub1, int i, int i_1537_,
		     float f, int i_1538_) {
	int i_1539_ = class247_sub1_sub1.anInt11062;
	int i_1540_ = i_1538_;
	i_1538_ <<= 1;
	if (-1 == i_1539_)
	    method15381(bool_1535_, i, i_1537_, f, i_1540_,
			class247_sub1_sub1.anInt11065, 1);
	else {
	    if (i_1539_ != ((Class103_Sub2) this).anInt9253 * -1406521185) {
		Class168 class168
		    = (Class168) ((Class103_Sub2) this).aClass129_9247
				     .get((long) i_1539_);
		if (null == class168) {
		    Class101 class101
			= aClass107_1458.method2680(i_1539_, 1273158825);
		    int[] is
			= method15389(i_1539_, 218388063 * class101.anInt1403);
		    if (is != null) {
			int i_1541_ = 608905203 * class101.anInt1406;
			class168 = method2259(is, 0, i_1541_, i_1541_, i_1541_,
					      (byte) -55);
			((Class103_Sub2) this).aClass129_9247
			    .put(class168, (long) i_1539_);
		    } else
			return;
		}
		((Class103_Sub2) this).anInt9253 = 1418390367 * i_1539_;
		((Class103_Sub2) this).aClass168_9269 = class168;
	    }
	    i_1538_++;
	    ((Class168_Sub2) ((Class103_Sub2) this).aClass168_9269).method16221
		(bool, bool_1535_, bool_1536_, i - i_1540_, i_1537_ - i_1540_,
		 f, i_1538_, i_1538_, 0, class247_sub1_sub1.anInt11065, 1, 1,
		 false);
	}
    }
    
    void method15417(boolean bool, boolean bool_1542_, boolean bool_1543_,
		     int i, int i_1544_, float f, int i_1545_, int i_1546_,
		     short i_1547_, int i_1548_, int i_1549_, int i_1550_) {
	if (i_1545_ != 0 && 0 != i_1546_) {
	    if (-1 != i_1547_) {
		Class101 class101
		    = aClass107_1458.method2680(i_1547_, -430716441);
		if (!class101.aBool1434) {
		    if (-1406521185 * ((Class103_Sub2) this).anInt9253
			!= i_1547_) {
			Class168 class168
			    = (Class168) ((Class103_Sub2) this)
					     .aClass129_9247
					     .get((long) i_1547_);
			if (class168 == null) {
			    int[] is
				= method15389(i_1547_,
					      218388063 * class101.anInt1403);
			    if (null == is)
				return;
			    int i_1551_ = class101.anInt1406 * 608905203;
			    class168 = method2259(is, 0, i_1551_, i_1551_,
						  i_1551_, (byte) -28);
			    ((Class103_Sub2) this).aClass129_9247
				.put(class168, (long) i_1547_);
			}
			((Class103_Sub2) this).anInt9253
			    = i_1547_ * 1418390367;
			((Class103_Sub2) this).aClass168_9269 = class168;
		    }
		    ((Class168_Sub2) ((Class103_Sub2) this).aClass168_9269)
			.method16221
			(bool, bool_1542_, bool_1543_, i - i_1545_,
			 i_1544_ - i_1546_, f, i_1545_ << 1, i_1546_ << 1,
			 i_1549_, i_1548_, i_1550_, 1,
			 class101.aClass529_1391 != Class529.aClass529_6944);
		    return;
		}
	    }
	    method15381(bool_1542_, i, i_1544_, f, i_1545_, i_1548_, i_1550_);
	}
    }
    
    public void method2505() {
	/* empty */
    }
    
    public boolean method2504() {
	return false;
    }
    
    public void method2518(Class266 class266) {
	((Class103_Sub2) this).aClass266_9259 = class266;
	method15382();
    }
    
    public void method2474(Class268 class268) {
	((Class103_Sub2) this).aClass268_9261.method5199(class268);
	method15382();
    }
    
    public void method2429(int i, Class86 class86) {
	Class189 class189 = method15377(Thread.currentThread());
	((Class189) class189).anInt2218 = i * 134228485;
	((Class189) class189).anInt2215 = -1026199509 * class86.anInt1251;
	((Class189) class189).anInt2230 = -516828645 * class86.anInt1252;
    }
    
    public void method2476(float f) {
	((Class103_Sub2) this).anInt9255 = 765977265 * (int) (f * 65535.0F);
    }
    
    public void method2386(float f) {
	((Class103_Sub2) this).anInt9255 = 765977265 * (int) (f * 65535.0F);
    }
    
    public void method2483(int i, int i_1552_, int i_1553_) {
	for (int i_1554_ = 0;
	     i_1554_ < ((Class103_Sub2) this).aClass189Array9275.length;
	     i_1554_++) {
	    Class189 class189
		= ((Class103_Sub2) this).aClass189Array9275[i_1554_];
	    ((Class189) class189).anInt2215 = -1407607783 * (i & 0xffffff);
	    int i_1555_
		= ((Class189) class189).anInt2215 * -338296791 >>> 16 & 0xff;
	    if (i_1555_ < 2)
		i_1555_ = 2;
	    int i_1556_
		= ((Class189) class189).anInt2215 * -338296791 >> 8 & 0xff;
	    if (i_1556_ < 2)
		i_1556_ = 2;
	    int i_1557_ = -338296791 * ((Class189) class189).anInt2215 & 0xff;
	    if (i_1557_ < 2)
		i_1557_ = 2;
	    ((Class189) class189).anInt2215
		= -1407607783 * (i_1555_ << 16 | i_1556_ << 8 | i_1557_);
	    if (i_1552_ < 0)
		((Class189) class189).aBool2209 = false;
	    else
		((Class189) class189).aBool2209 = true;
	}
    }
    
    public Class168 method2590(int i, int i_1558_, boolean bool,
			       boolean bool_1559_) {
	if (bool)
	    return new Class168_Sub2_Sub2(this, i, i_1558_);
	return new Class168_Sub2_Sub1(this, i, i_1558_);
    }
    
    boolean method2434(int i, int i_1560_, int i_1561_, int i_1562_,
		       Class266 class266, Class272 class272) {
	Class268 class268 = method2226();
	class268.method5203(class266);
	class268.method5202(((Class103_Sub2) this).aClass268_9262);
	return class272.method5317(i, i_1560_, i_1561_, i_1562_, class268,
				   ((Class103_Sub2) this).aFloat9277,
				   ((Class103_Sub2) this).aFloat9271,
				   ((Class103_Sub2) this).aFloat9268,
				   ((Class103_Sub2) this).aFloat9270);
    }
    
    Interface4 method15418(int i, int i_1563_) {
	return new Class186(i, i_1563_);
    }
    
    public int[] method2251(int i, int i_1564_, int i_1565_, int i_1566_) {
	if (((Class103_Sub2) this).anIntArray9245 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_1565_ * i_1566_];
	int i_1567_ = 0;
	for (int i_1568_ = 0; i_1568_ < i_1566_; i_1568_++) {
	    int i_1569_
		= ((i_1568_ + i_1564_) * (-1826993761
					  * ((Class103_Sub2) this).anInt9260)
		   + i);
	    for (int i_1570_ = 0; i_1570_ < i_1565_; i_1570_++)
		is[i_1567_++]
		    = ((Class103_Sub2) this).anIntArray9245[i_1570_ + i_1569_];
	}
	return is;
    }
    
    public void method2515(int i, Class86 class86) {
	for (int i_1571_ = 0;
	     i_1571_ < ((Class103_Sub2) this).aClass189Array9275.length;
	     i_1571_++) {
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1571_])
		.anInt2240
		= 1208111489 * (((Class189) (((Class103_Sub2) this)
					     .aClass189Array9275[i_1571_]))
				.anInt2215);
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1571_])
		.anInt2218
		= i * 134228485;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1571_])
		.anInt2215
		= class86.anInt1251 * -1026199509;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1571_])
		.anInt2230
		= class86.anInt1252 * -516828645;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1571_])
		.aBool2217
		= true;
	}
    }
    
    public void method2477(int i, int i_1572_, int i_1573_) {
	for (int i_1574_ = 0;
	     i_1574_ < ((Class103_Sub2) this).aClass189Array9275.length;
	     i_1574_++) {
	    Class189 class189
		= ((Class103_Sub2) this).aClass189Array9275[i_1574_];
	    ((Class189) class189).anInt2215 = -1407607783 * (i & 0xffffff);
	    int i_1575_
		= ((Class189) class189).anInt2215 * -338296791 >>> 16 & 0xff;
	    if (i_1575_ < 2)
		i_1575_ = 2;
	    int i_1576_
		= ((Class189) class189).anInt2215 * -338296791 >> 8 & 0xff;
	    if (i_1576_ < 2)
		i_1576_ = 2;
	    int i_1577_ = -338296791 * ((Class189) class189).anInt2215 & 0xff;
	    if (i_1577_ < 2)
		i_1577_ = 2;
	    ((Class189) class189).anInt2215
		= -1407607783 * (i_1575_ << 16 | i_1576_ << 8 | i_1577_);
	    if (i_1572_ < 0)
		((Class189) class189).aBool2209 = false;
	    else
		((Class189) class189).aBool2209 = true;
	}
    }
    
    void method15419() {
	((Class103_Sub2) this).aClass268_9279
	    .method5203(((Class103_Sub2) this).aClass266_9259);
	((Class103_Sub2) this).aClass268_9262
	    .method5199(((Class103_Sub2) this).aClass268_9279);
	((Class103_Sub2) this).aClass268_9262
	    .method5202(((Class103_Sub2) this).aClass268_9261);
	((Class103_Sub2) this).aClass268_9262
	    .method5257(((Class103_Sub2) this).aFloatArrayArray9263[0]);
	((Class103_Sub2) this).aClass268_9262
	    .method5226(((Class103_Sub2) this).aFloatArrayArray9263[1]);
	((Class103_Sub2) this).aClass268_9262
	    .method5219(((Class103_Sub2) this).aFloatArrayArray9263[2]);
	((Class103_Sub2) this).aClass268_9262
	    .method5271(((Class103_Sub2) this).aFloatArrayArray9263[3]);
	((Class103_Sub2) this).aClass268_9262
	    .method5238(((Class103_Sub2) this).aFloatArrayArray9263[4]);
	((Class103_Sub2) this).aClass268_9262
	    .method5222(((Class103_Sub2) this).aFloatArrayArray9263[5]);
	float f = ((Class103_Sub2) this).aClass268_9261.method5218();
	float f_1578_
	    = (((Class103_Sub2) this).aClass268_9261.aFloatArray4353[14]
	       + (((Class103_Sub2) this).aClass268_9261.aFloatArray4353[10]
		  * (f - 255.0F)));
	float f_1579_
	    = (f * ((Class103_Sub2) this).aClass268_9261.aFloatArray4353[10]
	       + ((Class103_Sub2) this).aClass268_9261.aFloatArray4353[14]);
	float f_1580_ = f_1579_ - f_1578_;
	for (int i = 0; i < 592623211 * ((Class103_Sub2) this).anInt9274;
	     i++) {
	    Class189 class189 = ((Class103_Sub2) this).aClass189Array9275[i];
	    ((Class189) class189).aFloat2213 = f_1578_;
	    ((Class189) class189).aFloat2214 = f_1580_;
	}
    }
    
    void method15420() {
	((Class103_Sub2) this).aClass268_9279
	    .method5203(((Class103_Sub2) this).aClass266_9259);
	((Class103_Sub2) this).aClass268_9262
	    .method5199(((Class103_Sub2) this).aClass268_9279);
	((Class103_Sub2) this).aClass268_9262
	    .method5202(((Class103_Sub2) this).aClass268_9261);
	((Class103_Sub2) this).aClass268_9262
	    .method5257(((Class103_Sub2) this).aFloatArrayArray9263[0]);
	((Class103_Sub2) this).aClass268_9262
	    .method5226(((Class103_Sub2) this).aFloatArrayArray9263[1]);
	((Class103_Sub2) this).aClass268_9262
	    .method5219(((Class103_Sub2) this).aFloatArrayArray9263[2]);
	((Class103_Sub2) this).aClass268_9262
	    .method5271(((Class103_Sub2) this).aFloatArrayArray9263[3]);
	((Class103_Sub2) this).aClass268_9262
	    .method5238(((Class103_Sub2) this).aFloatArrayArray9263[4]);
	((Class103_Sub2) this).aClass268_9262
	    .method5222(((Class103_Sub2) this).aFloatArrayArray9263[5]);
	float f = ((Class103_Sub2) this).aClass268_9261.method5218();
	float f_1581_
	    = (((Class103_Sub2) this).aClass268_9261.aFloatArray4353[14]
	       + (((Class103_Sub2) this).aClass268_9261.aFloatArray4353[10]
		  * (f - 255.0F)));
	float f_1582_
	    = (f * ((Class103_Sub2) this).aClass268_9261.aFloatArray4353[10]
	       + ((Class103_Sub2) this).aClass268_9261.aFloatArray4353[14]);
	float f_1583_ = f_1582_ - f_1581_;
	for (int i = 0; i < 592623211 * ((Class103_Sub2) this).anInt9274;
	     i++) {
	    Class189 class189 = ((Class103_Sub2) this).aClass189Array9275[i];
	    ((Class189) class189).aFloat2213 = f_1581_;
	    ((Class189) class189).aFloat2214 = f_1583_;
	}
    }
    
    public Class88 method2485(int i) {
	return null;
    }
    
    public Class88 method2566(int i) {
	return null;
    }
    
    public Class88 method2487(Class88 class88, Class88 class88_1584_, float f,
			      Class88 class88_1585_) {
	return null;
    }
    
    public Class88 method2610(Class88 class88, Class88 class88_1586_, float f,
			      Class88 class88_1587_) {
	return null;
    }
    
    public Class88 method2489(Class88 class88, Class88 class88_1588_, float f,
			      Class88 class88_1589_) {
	return null;
    }
    
    int method15421(int i) {
	return aClass107_1458.method2680(i, 1255438445).aShort1436 & 0xffff;
    }
    
    public boolean method2366() {
	return false;
    }
    
    public void method2469(int i, Class241_Sub43[] class241_sub43s) {
	/* empty */
    }
    
    public void method2407(int i, int i_1590_, int i_1591_, int i_1592_,
			   int i_1593_, int i_1594_) {
	method2272(i, i_1590_, i_1591_, i_1593_, i_1594_);
	method2272(i, i_1590_ + i_1592_ - 1, i_1591_, i_1593_, i_1594_);
	method2273(i, 1 + i_1590_, i_1592_ - 2, i_1593_, i_1594_);
	method2273(i + i_1591_ - 1, i_1590_ + 1, i_1592_ - 2, i_1593_,
		   i_1594_);
    }
    
    public void method2530() {
	/* empty */
    }
    
    void method15422() {
	if (((Class103_Sub2) this).aFloatArray9248 != null) {
	    if (0 == ((Class103_Sub2) this).anInt9249 * 1298750001
		&& (((Class103_Sub2) this).anInt9250 * 325436811
		    == -1826993761 * ((Class103_Sub2) this).anInt9260)
		&& 0 == -788450385 * ((Class103_Sub2) this).anInt9254
		&& (1546170165 * ((Class103_Sub2) this).anInt9252
		    == ((Class103_Sub2) this).anInt9278 * -2069999773)) {
		int i = ((Class103_Sub2) this).aFloatArray9248.length;
		int i_1595_ = i - (i & 0x7);
		int i_1596_ = 0;
		while (i_1596_ < i_1595_) {
		    ((Class103_Sub2) this).aFloatArray9248[i_1596_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1596_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1596_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1596_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1596_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1596_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1596_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1596_++]
			= 2.14748365E9F;
		}
		while (i_1596_ < i)
		    ((Class103_Sub2) this).aFloatArray9248[i_1596_++]
			= 2.14748365E9F;
	    } else {
		int i = (325436811 * ((Class103_Sub2) this).anInt9250
			 - 1298750001 * ((Class103_Sub2) this).anInt9249);
		int i_1597_
		    = (1546170165 * ((Class103_Sub2) this).anInt9252
		       - ((Class103_Sub2) this).anInt9254 * -788450385);
		int i_1598_
		    = -1826993761 * ((Class103_Sub2) this).anInt9260 - i;
		int i_1599_
		    = ((-1826993761 * ((Class103_Sub2) this).anInt9260
			* (((Class103_Sub2) this).anInt9254 * -788450385))
		       + ((Class103_Sub2) this).anInt9249 * 1298750001);
		int i_1600_ = i >> 3;
		int i_1601_ = i & 0x7;
		i = i_1599_ - 1;
		for (int i_1602_ = -i_1597_; i_1602_ < 0; i_1602_++) {
		    if (i_1600_ > 0) {
			int i_1603_ = i_1600_;
			do {
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			} while (--i_1603_ > 0);
		    }
		    if (i_1601_ > 0) {
			int i_1604_ = i_1601_;
			do
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			while (--i_1604_ > 0);
		    }
		    i += i_1598_;
		}
	    }
	}
    }
    
    void method15423(int i) {
	((Class103_Sub2) this).aClass189Array9275[i]
	    .method3872(Thread.currentThread(), (byte) -29);
    }
    
    public boolean method2497() {
	return false;
    }
    
    public Class180 method2327(int[] is) {
	return null;
    }
    
    public boolean method2441() {
	return false;
    }
    
    public void method2500(Class180 class180, float f, Class180 class180_1605_,
			   float f_1606_, Class180 class180_1607_,
			   float f_1608_) {
	/* empty */
    }
    
    public void method2501(Class180 class180, float f, Class180 class180_1609_,
			   float f_1610_, Class180 class180_1611_,
			   float f_1612_) {
	/* empty */
    }
    
    public void method2413(Class180 class180, float f, Class180 class180_1613_,
			   float f_1614_, Class180 class180_1615_,
			   float f_1616_) {
	/* empty */
    }
    
    void method15424() {
	if (((Class103_Sub2) this).aFloatArray9248 != null) {
	    if (0 == ((Class103_Sub2) this).anInt9249 * 1298750001
		&& (((Class103_Sub2) this).anInt9250 * 325436811
		    == -1826993761 * ((Class103_Sub2) this).anInt9260)
		&& 0 == -788450385 * ((Class103_Sub2) this).anInt9254
		&& (1546170165 * ((Class103_Sub2) this).anInt9252
		    == ((Class103_Sub2) this).anInt9278 * -2069999773)) {
		int i = ((Class103_Sub2) this).aFloatArray9248.length;
		int i_1617_ = i - (i & 0x7);
		int i_1618_ = 0;
		while (i_1618_ < i_1617_) {
		    ((Class103_Sub2) this).aFloatArray9248[i_1618_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1618_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1618_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1618_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1618_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1618_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1618_++]
			= 2.14748365E9F;
		    ((Class103_Sub2) this).aFloatArray9248[i_1618_++]
			= 2.14748365E9F;
		}
		while (i_1618_ < i)
		    ((Class103_Sub2) this).aFloatArray9248[i_1618_++]
			= 2.14748365E9F;
	    } else {
		int i = (325436811 * ((Class103_Sub2) this).anInt9250
			 - 1298750001 * ((Class103_Sub2) this).anInt9249);
		int i_1619_
		    = (1546170165 * ((Class103_Sub2) this).anInt9252
		       - ((Class103_Sub2) this).anInt9254 * -788450385);
		int i_1620_
		    = -1826993761 * ((Class103_Sub2) this).anInt9260 - i;
		int i_1621_
		    = ((-1826993761 * ((Class103_Sub2) this).anInt9260
			* (((Class103_Sub2) this).anInt9254 * -788450385))
		       + ((Class103_Sub2) this).anInt9249 * 1298750001);
		int i_1622_ = i >> 3;
		int i_1623_ = i & 0x7;
		i = i_1621_ - 1;
		for (int i_1624_ = -i_1619_; i_1624_ < 0; i_1624_++) {
		    if (i_1622_ > 0) {
			int i_1625_ = i_1622_;
			do {
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			} while (--i_1625_ > 0);
		    }
		    if (i_1623_ > 0) {
			int i_1626_ = i_1623_;
			do
			    ((Class103_Sub2) this).aFloatArray9248[++i]
				= 2.14748365E9F;
			while (--i_1626_ > 0);
		    }
		    i += i_1620_;
		}
	    }
	}
    }
    
    public void method2478(int i, float f, float f_1627_, float f_1628_,
			   float f_1629_, float f_1630_) {
	((Class103_Sub2) this).anInt9256 = 1424358665 * (int) (f * 65535.0F);
	((Class103_Sub2) this).anInt9257
	    = (int) (65535.0F * f_1627_) * 1922501479;
	float f_1631_ = (float) Math.sqrt((double) (f_1630_ * f_1630_
						    + (f_1628_ * f_1628_
						       + f_1629_ * f_1629_)));
	((Class103_Sub2) this).anInt9266
	    = -1310794753 * (int) (f_1628_ * 65535.0F / f_1631_);
	((Class103_Sub2) this).anInt9258
	    = (int) (65535.0F * f_1629_ / f_1631_) * -1554926105;
	((Class103_Sub2) this).anInt9273
	    = -1389466273 * (int) (f_1630_ * 65535.0F / f_1631_);
    }
    
    public boolean method2351() {
	return false;
    }
    
    public boolean method2549() {
	return false;
    }
    
    void method2267(int i, int i_1632_, int i_1633_, int i_1634_,
		    int i_1635_) {
	if (null != ((Class103_Sub2) this).anIntArray9245) {
	    if (i_1633_ < 0)
		i_1633_ = -i_1633_;
	    int i_1636_ = i_1632_ - i_1633_;
	    if (i_1636_ < ((Class103_Sub2) this).anInt9254 * -788450385)
		i_1636_ = ((Class103_Sub2) this).anInt9254 * -788450385;
	    int i_1637_ = 1 + (i_1632_ + i_1633_);
	    if (i_1637_ > ((Class103_Sub2) this).anInt9252 * 1546170165)
		i_1637_ = ((Class103_Sub2) this).anInt9252 * 1546170165;
	    int i_1638_ = i_1636_;
	    int i_1639_ = i_1633_ * i_1633_;
	    int i_1640_ = 0;
	    int i_1641_ = i_1632_ - i_1638_;
	    int i_1642_ = i_1641_ * i_1641_;
	    int i_1643_ = i_1642_ - i_1641_;
	    if (i_1632_ > i_1637_)
		i_1632_ = i_1637_;
	    int i_1644_ = i_1634_ >>> 24;
	    if (i_1635_ == 0 || i_1635_ == 1 && 255 == i_1644_) {
		while (i_1638_ < i_1632_) {
		    for (/**/; i_1643_ <= i_1639_ || i_1642_ <= i_1639_;
			 i_1643_ += i_1640_++ + i_1640_)
			i_1642_ += i_1640_ + i_1640_;
		    int i_1645_ = i - i_1640_ + 1;
		    if (i_1645_
			< ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_1645_
			    = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_1646_ = i_1640_ + i;
		    if (i_1646_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_1646_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_1647_
			= ((-1826993761 * ((Class103_Sub2) this).anInt9260
			    * i_1638_)
			   + i_1645_);
		    for (int i_1648_ = i_1645_; i_1648_ < i_1646_; i_1648_++)
			((Class103_Sub2) this).anIntArray9245[i_1647_++]
			    = i_1634_;
		    i_1638_++;
		    i_1642_ -= i_1641_-- + i_1641_;
		    i_1643_ -= i_1641_ + i_1641_;
		}
		i_1640_ = i_1633_;
		i_1641_ = i_1638_ - i_1632_;
		i_1643_ = i_1639_ + i_1641_ * i_1641_;
		i_1642_ = i_1643_ - i_1640_;
		i_1643_ -= i_1641_;
		while (i_1638_ < i_1637_) {
		    for (/**/; i_1643_ > i_1639_ && i_1642_ > i_1639_;
			 i_1642_ -= i_1640_ + i_1640_)
			i_1643_ -= i_1640_-- + i_1640_;
		    int i_1649_ = i - i_1640_;
		    if (i_1649_
			< 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_1649_
			    = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_1650_ = i + i_1640_;
		    if (i_1650_
			> ((Class103_Sub2) this).anInt9250 * 325436811 - 1)
			i_1650_
			    = ((Class103_Sub2) this).anInt9250 * 325436811 - 1;
		    int i_1651_ = i_1649_ + (((Class103_Sub2) this).anInt9260
					     * -1826993761 * i_1638_);
		    for (int i_1652_ = i_1649_; i_1652_ <= i_1650_; i_1652_++)
			((Class103_Sub2) this).anIntArray9245[i_1651_++]
			    = i_1634_;
		    i_1638_++;
		    i_1643_ += i_1641_ + i_1641_;
		    i_1642_ += i_1641_++ + i_1641_;
		}
	    } else if (i_1635_ == 1) {
		i_1634_ = (((i_1634_ & 0xff00ff) * i_1644_ >> 8 & 0xff00ff)
			   + ((i_1634_ & 0xff00) * i_1644_ >> 8 & 0xff00)
			   + (i_1644_ << 24));
		int i_1653_ = 256 - i_1644_;
		while (i_1638_ < i_1632_) {
		    for (/**/; i_1643_ <= i_1639_ || i_1642_ <= i_1639_;
			 i_1643_ += i_1640_++ + i_1640_)
			i_1642_ += i_1640_ + i_1640_;
		    int i_1654_ = i - i_1640_ + 1;
		    if (i_1654_
			< 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_1654_
			    = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_1655_ = i + i_1640_;
		    if (i_1655_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_1655_ = ((Class103_Sub2) this).anInt9250 * 325436811;
		    int i_1656_ = i_1654_ + (((Class103_Sub2) this).anInt9260
					     * -1826993761 * i_1638_);
		    for (int i_1657_ = i_1654_; i_1657_ < i_1655_; i_1657_++) {
			int i_1658_
			    = ((Class103_Sub2) this).anIntArray9245[i_1656_];
			i_1658_ = ((i_1653_ * (i_1658_ & 0xff00) >> 8 & 0xff00)
				   + ((i_1658_ & 0xff00ff) * i_1653_ >> 8
				      & 0xff00ff));
			((Class103_Sub2) this).anIntArray9245[i_1656_++]
			    = i_1634_ + i_1658_;
		    }
		    i_1638_++;
		    i_1642_ -= i_1641_-- + i_1641_;
		    i_1643_ -= i_1641_ + i_1641_;
		}
		i_1640_ = i_1633_;
		i_1641_ = -i_1641_;
		i_1643_ = i_1641_ * i_1641_ + i_1639_;
		i_1642_ = i_1643_ - i_1640_;
		i_1643_ -= i_1641_;
		while (i_1638_ < i_1637_) {
		    for (/**/; i_1643_ > i_1639_ && i_1642_ > i_1639_;
			 i_1642_ -= i_1640_ + i_1640_)
			i_1643_ -= i_1640_-- + i_1640_;
		    int i_1659_ = i - i_1640_;
		    if (i_1659_
			< 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_1659_
			    = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_1660_ = i_1640_ + i;
		    if (i_1660_
			> 325436811 * ((Class103_Sub2) this).anInt9250 - 1)
			i_1660_
			    = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		    int i_1661_
			= (i_1659_
			   + i_1638_ * (-1826993761
					* ((Class103_Sub2) this).anInt9260));
		    for (int i_1662_ = i_1659_; i_1662_ <= i_1660_;
			 i_1662_++) {
			int i_1663_
			    = ((Class103_Sub2) this).anIntArray9245[i_1661_];
			i_1663_
			    = ((i_1653_ * (i_1663_ & 0xff00ff) >> 8 & 0xff00ff)
			       + ((i_1663_ & 0xff00) * i_1653_ >> 8 & 0xff00));
			((Class103_Sub2) this).anIntArray9245[i_1661_++]
			    = i_1634_ + i_1663_;
		    }
		    i_1638_++;
		    i_1643_ += i_1641_ + i_1641_;
		    i_1642_ += i_1641_++ + i_1641_;
		}
	    } else if (2 == i_1635_) {
		while (i_1638_ < i_1632_) {
		    for (/**/; i_1643_ <= i_1639_ || i_1642_ <= i_1639_;
			 i_1643_ += i_1640_++ + i_1640_)
			i_1642_ += i_1640_ + i_1640_;
		    int i_1664_ = 1 + (i - i_1640_);
		    if (i_1664_
			< 1298750001 * ((Class103_Sub2) this).anInt9249)
			i_1664_
			    = 1298750001 * ((Class103_Sub2) this).anInt9249;
		    int i_1665_ = i + i_1640_;
		    if (i_1665_ > ((Class103_Sub2) this).anInt9250 * 325436811)
			i_1665_ = 325436811 * ((Class103_Sub2) this).anInt9250;
		    int i_1666_ = ((((Class103_Sub2) this).anInt9260
				    * -1826993761 * i_1638_)
				   + i_1664_);
		    for (int i_1667_ = i_1664_; i_1667_ < i_1665_; i_1667_++) {
			int i_1668_
			    = ((Class103_Sub2) this).anIntArray9245[i_1666_];
			int i_1669_ = i_1668_ + i_1634_;
			int i_1670_
			    = (i_1668_ & 0xff00ff) + (i_1634_ & 0xff00ff);
			i_1668_ = (i_1670_ & 0x1000100) + (i_1669_ - i_1670_
							   & 0x10000);
			((Class103_Sub2) this).anIntArray9245[i_1666_++]
			    = i_1669_ - i_1668_ | i_1668_ - (i_1668_ >>> 8);
		    }
		    i_1638_++;
		    i_1642_ -= i_1641_-- + i_1641_;
		    i_1643_ -= i_1641_ + i_1641_;
		}
		i_1640_ = i_1633_;
		i_1641_ = -i_1641_;
		i_1643_ = i_1641_ * i_1641_ + i_1639_;
		i_1642_ = i_1643_ - i_1640_;
		i_1643_ -= i_1641_;
		while (i_1638_ < i_1637_) {
		    for (/**/; i_1643_ > i_1639_ && i_1642_ > i_1639_;
			 i_1642_ -= i_1640_ + i_1640_)
			i_1643_ -= i_1640_-- + i_1640_;
		    int i_1671_ = i - i_1640_;
		    if (i_1671_
			< ((Class103_Sub2) this).anInt9249 * 1298750001)
			i_1671_
			    = ((Class103_Sub2) this).anInt9249 * 1298750001;
		    int i_1672_ = i_1640_ + i;
		    if (i_1672_
			> ((Class103_Sub2) this).anInt9250 * 325436811 - 1)
			i_1672_
			    = 325436811 * ((Class103_Sub2) this).anInt9250 - 1;
		    int i_1673_
			= (i_1671_
			   + i_1638_ * (-1826993761
					* ((Class103_Sub2) this).anInt9260));
		    for (int i_1674_ = i_1671_; i_1674_ <= i_1672_;
			 i_1674_++) {
			int i_1675_
			    = ((Class103_Sub2) this).anIntArray9245[i_1673_];
			int i_1676_ = i_1634_ + i_1675_;
			int i_1677_
			    = (i_1675_ & 0xff00ff) + (i_1634_ & 0xff00ff);
			i_1675_
			    = (i_1676_ - i_1677_ & 0x10000) + (i_1677_
							       & 0x1000100);
			((Class103_Sub2) this).anIntArray9245[i_1673_++]
			    = i_1676_ - i_1675_ | i_1675_ - (i_1675_ >>> 8);
		    }
		    i_1638_++;
		    i_1643_ += i_1641_ + i_1641_;
		    i_1642_ += i_1641_++ + i_1641_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method2508(float f, float f_1678_, float f_1679_, float f_1680_,
		    float f_1681_, float f_1682_) {
	/* empty */
    }
    
    public Class266 method2230() {
	Class189 class189 = method15377(Thread.currentThread());
	return ((Class189) class189).aClass266_2222;
    }
    
    void method2510(float f, float f_1683_, float f_1684_, float f_1685_,
		    float f_1686_, float f_1687_) {
	/* empty */
    }
    
    void method2312(float f, float f_1688_, float f_1689_, float f_1690_,
		    float f_1691_, float f_1692_) {
	/* empty */
    }
    
    public Class168 method2438(int i, int i_1693_, boolean bool,
			       boolean bool_1694_) {
	if (bool)
	    return new Class168_Sub2_Sub2(this, i, i_1693_);
	return new Class168_Sub2_Sub1(this, i, i_1693_);
    }
    
    public void method2513(int i, Class86 class86) {
	for (int i_1695_ = 0;
	     i_1695_ < ((Class103_Sub2) this).aClass189Array9275.length;
	     i_1695_++) {
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1695_])
		.anInt2240
		= 1208111489 * (((Class189) (((Class103_Sub2) this)
					     .aClass189Array9275[i_1695_]))
				.anInt2215);
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1695_])
		.anInt2218
		= i * 134228485;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1695_])
		.anInt2215
		= class86.anInt1251 * -1026199509;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1695_])
		.anInt2230
		= class86.anInt1252 * -516828645;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1695_])
		.aBool2217
		= true;
	}
    }
    
    public void method2514(int i, Class86 class86) {
	for (int i_1696_ = 0;
	     i_1696_ < ((Class103_Sub2) this).aClass189Array9275.length;
	     i_1696_++) {
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1696_])
		.anInt2240
		= 1208111489 * (((Class189) (((Class103_Sub2) this)
					     .aClass189Array9275[i_1696_]))
				.anInt2215);
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1696_])
		.anInt2218
		= i * 134228485;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1696_])
		.anInt2215
		= class86.anInt1251 * -1026199509;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1696_])
		.anInt2230
		= class86.anInt1252 * -516828645;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i_1696_])
		.aBool2217
		= true;
	}
    }
    
    public void method2445(int i, int i_1697_, int i_1698_, int i_1699_) {
	if (i < 0)
	    i = 0;
	if (i_1697_ < 0)
	    i_1697_ = 0;
	if (i_1698_ > ((Class103_Sub2) this).anInt9260 * -1826993761)
	    i_1698_ = ((Class103_Sub2) this).anInt9260 * -1826993761;
	if (i_1699_ > -2069999773 * ((Class103_Sub2) this).anInt9278)
	    i_1699_ = -2069999773 * ((Class103_Sub2) this).anInt9278;
	((Class103_Sub2) this).anInt9249 = 211664593 * i;
	((Class103_Sub2) this).anInt9250 = 244169251 * i_1698_;
	((Class103_Sub2) this).anInt9254 = -1495661745 * i_1697_;
	((Class103_Sub2) this).anInt9252 = 1034251037 * i_1699_;
	method15372();
    }
    
    Interface4 method15425(int i, int i_1700_) {
	return new Class186(i, i_1700_);
    }
    
    public void method2480() {
	for (int i = 0; i < ((Class103_Sub2) this).aClass189Array9275.length;
	     i++) {
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i]).anInt2215
		= 143650433 * ((Class189) (((Class103_Sub2) this)
					   .aClass189Array9275[i])).anInt2240;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i]).aBool2217
		= false;
	}
    }
    
    public void method2560() {
	for (int i = 0; i < ((Class103_Sub2) this).aClass189Array9275.length;
	     i++) {
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i]).anInt2215
		= 143650433 * ((Class189) (((Class103_Sub2) this)
					   .aClass189Array9275[i])).anInt2240;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i]).aBool2217
		= false;
	}
    }
    
    public void method2519() {
	for (int i = 0; i < ((Class103_Sub2) this).aClass189Array9275.length;
	     i++) {
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i]).anInt2215
		= 143650433 * ((Class189) (((Class103_Sub2) this)
					   .aClass189Array9275[i])).anInt2240;
	    ((Class189) ((Class103_Sub2) this).aClass189Array9275[i]).aBool2217
		= false;
	}
    }
    
    public boolean method2481() {
	return false;
    }
    
    public void method2506(Class98 class98) {
	method15378(((Class103_Sub2) this).anIntArray9245 != null,
		    null != ((Class103_Sub2) this).aFloatArray9248, false,
		    class98);
    }
    
    public void method2403(int[] is) {
	is[0] = ((Class103_Sub2) this).anInt9249 * 1298750001;
	is[1] = -788450385 * ((Class103_Sub2) this).anInt9254;
	is[2] = 325436811 * ((Class103_Sub2) this).anInt9250;
	is[3] = 1546170165 * ((Class103_Sub2) this).anInt9252;
    }
    
    public Class135 method2467(int i, int i_1701_, int[] is, int[] is_1702_) {
	return new Class135_Sub1(i, i_1701_, is, is_1702_);
    }
    
    public void method2298(int i, int i_1703_, float f, int i_1704_,
			   int i_1705_, float f_1706_, int i_1707_,
			   int i_1708_, float f_1709_, int i_1710_,
			   int i_1711_, int i_1712_, int i_1713_) {
	boolean bool = null != ((Class103_Sub2) this).anIntArray9245;
	boolean bool_1714_ = ((Class103_Sub2) this).aFloatArray9248 != null;
	if (bool || bool_1714_) {
	    Class189 class189 = method15377(Thread.currentThread());
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aBool1721 = false;
	    i -= 1298750001 * ((Class103_Sub2) this).anInt9249;
	    i_1704_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_1707_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_1703_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_1705_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_1708_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    ((Class155) class155).aBool1748
		= (i < 0 || i > ((Class155) class155).anInt1733 || i_1704_ < 0
		   || i_1704_ > ((Class155) class155).anInt1733 || i_1707_ < 0
		   || i_1707_ > ((Class155) class155).anInt1733);
	    int i_1715_ = i_1710_ >>> 24;
	    if (0 == i_1713_ || i_1713_ == 1 && 255 == i_1715_) {
		((Class155) class155).anInt1723 = 0;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_1714_, false, (float) i_1703_,
				    (float) i_1705_, (float) i_1708_,
				    (float) i, (float) i_1704_,
				    (float) i_1707_, f, f_1706_, f_1709_,
				    i_1710_, i_1711_, i_1712_);
	    } else if (1 == i_1713_) {
		((Class155) class155).anInt1723 = 255 - i_1715_;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_1714_, false, (float) i_1703_,
				    (float) i_1705_, (float) i_1708_,
				    (float) i, (float) i_1704_,
				    (float) i_1707_, f, f_1706_, f_1709_,
				    i_1710_, i_1711_, i_1712_);
	    } else if (i_1713_ == 2) {
		((Class155) class155).anInt1723 = 128;
		((Class155) class155).aBool1722 = true;
		class155.method3385(bool, bool_1714_, false, (float) i_1703_,
				    (float) i_1705_, (float) i_1708_,
				    (float) i, (float) i_1704_,
				    (float) i_1707_, f, f_1706_, f_1709_,
				    i_1710_, i_1711_, i_1712_);
	    } else
		throw new IllegalArgumentException();
	    ((Class155) class155).aBool1721 = true;
	}
    }
    
    public void method2525(int i, int i_1716_, float f, int i_1717_,
			   int i_1718_, float f_1719_, int i_1720_,
			   int i_1721_, float f_1722_, int i_1723_,
			   int i_1724_, int i_1725_, int i_1726_) {
	boolean bool = null != ((Class103_Sub2) this).anIntArray9245;
	boolean bool_1727_ = ((Class103_Sub2) this).aFloatArray9248 != null;
	if (bool || bool_1727_) {
	    Class189 class189 = method15377(Thread.currentThread());
	    Class155 class155 = ((Class189) class189).aClass155_2223;
	    ((Class155) class155).aBool1721 = false;
	    i -= 1298750001 * ((Class103_Sub2) this).anInt9249;
	    i_1717_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_1720_ -= ((Class103_Sub2) this).anInt9249 * 1298750001;
	    i_1716_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_1718_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    i_1721_ -= ((Class103_Sub2) this).anInt9254 * -788450385;
	    ((Class155) class155).aBool1748
		= (i < 0 || i > ((Class155) class155).anInt1733 || i_1717_ < 0
		   || i_1717_ > ((Class155) class155).anInt1733 || i_1720_ < 0
		   || i_1720_ > ((Class155) class155).anInt1733);
	    int i_1728_ = i_1723_ >>> 24;
	    if (0 == i_1726_ || i_1726_ == 1 && 255 == i_1728_) {
		((Class155) class155).anInt1723 = 0;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_1727_, false, (float) i_1716_,
				    (float) i_1718_, (float) i_1721_,
				    (float) i, (float) i_1717_,
				    (float) i_1720_, f, f_1719_, f_1722_,
				    i_1723_, i_1724_, i_1725_);
	    } else if (1 == i_1726_) {
		((Class155) class155).anInt1723 = 255 - i_1728_;
		((Class155) class155).aBool1722 = false;
		class155.method3385(bool, bool_1727_, false, (float) i_1716_,
				    (float) i_1718_, (float) i_1721_,
				    (float) i, (float) i_1717_,
				    (float) i_1720_, f, f_1719_, f_1722_,
				    i_1723_, i_1724_, i_1725_);
	    } else if (i_1726_ == 2) {
		((Class155) class155).anInt1723 = 128;
		((Class155) class155).aBool1722 = true;
		class155.method3385(bool, bool_1727_, false, (float) i_1716_,
				    (float) i_1718_, (float) i_1721_,
				    (float) i, (float) i_1717_,
				    (float) i_1720_, f, f_1719_, f_1722_,
				    i_1723_, i_1724_, i_1725_);
	    } else
		throw new IllegalArgumentException();
	    ((Class155) class155).aBool1721 = true;
	}
    }
    
    void method15426(int i, int i_1729_, int i_1730_, int i_1731_, int i_1732_,
		     int i_1733_, int i_1734_, int i_1735_) {
	if (null != ((Class103_Sub2) this).anIntArray9245
	    && (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
		&& i < ((Class103_Sub2) this).anInt9250 * 325436811)) {
	    int i_1736_
		= (i_1729_ * (((Class103_Sub2) this).anInt9260 * -1826993761)
		   + i);
	    int i_1737_ = i_1731_ >>> 24;
	    int i_1738_ = i_1734_ + i_1733_;
	    int i_1739_ = i_1735_ % i_1738_;
	    if (i_1732_ == 0 || i_1732_ == 1 && 255 == i_1737_) {
		int i_1740_ = 0;
		while (i_1740_ < i_1730_) {
		    if ((i_1740_ + i_1729_
			 >= -788450385 * ((Class103_Sub2) this).anInt9254)
			&& (i_1740_ + i_1729_
			    < 1546170165 * ((Class103_Sub2) this).anInt9252)
			&& i_1739_ < i_1733_)
			((Class103_Sub2) this).anIntArray9245
			    [(i_1740_ * (-1826993761
					 * ((Class103_Sub2) this).anInt9260)
			      + i_1736_)]
			    = i_1731_;
		    i_1740_++;
		    i_1739_ = ++i_1739_ % i_1738_;
		}
	    } else if (1 == i_1732_) {
		i_1731_ = ((i_1737_ << 24)
			   + (((i_1731_ & 0xff00ff) * i_1737_ >> 8 & 0xff00ff)
			      + ((i_1731_ & 0xff00) * i_1737_ >> 8 & 0xff00)));
		int i_1741_ = 256 - i_1737_;
		int i_1742_ = 0;
		while (i_1742_ < i_1730_) {
		    if ((i_1742_ + i_1729_
			 >= ((Class103_Sub2) this).anInt9254 * -788450385)
			&& (i_1729_ + i_1742_
			    < ((Class103_Sub2) this).anInt9252 * 1546170165)
			&& i_1739_ < i_1733_) {
			int i_1743_ = ((((Class103_Sub2) this).anInt9260
					* -1826993761 * i_1742_)
				       + i_1736_);
			int i_1744_
			    = ((Class103_Sub2) this).anIntArray9245[i_1743_];
			i_1744_
			    = (((i_1744_ & 0xff00ff) * i_1741_ >> 8 & 0xff00ff)
			       + (i_1741_ * (i_1744_ & 0xff00) >> 8 & 0xff00));
			((Class103_Sub2) this).anIntArray9245[i_1743_]
			    = i_1731_ + i_1744_;
		    }
		    i_1742_++;
		    i_1739_ = ++i_1739_ % i_1738_;
		}
	    } else if (i_1732_ == 2) {
		int i_1745_ = 0;
		while (i_1745_ < i_1730_) {
		    if ((i_1745_ + i_1729_
			 >= -788450385 * ((Class103_Sub2) this).anInt9254)
			&& (i_1729_ + i_1745_
			    < 1546170165 * ((Class103_Sub2) this).anInt9252)
			&& i_1739_ < i_1733_) {
			int i_1746_
			    = ((-1826993761 * ((Class103_Sub2) this).anInt9260
				* i_1745_)
			       + i_1736_);
			int i_1747_
			    = ((Class103_Sub2) this).anIntArray9245[i_1746_];
			int i_1748_ = i_1747_ + i_1731_;
			int i_1749_
			    = (i_1747_ & 0xff00ff) + (i_1731_ & 0xff00ff);
			i_1747_
			    = (i_1748_ - i_1749_ & 0x10000) + (i_1749_
							       & 0x1000100);
			((Class103_Sub2) this).anIntArray9245[i_1746_]
			    = i_1748_ - i_1747_ | i_1747_ - (i_1747_ >>> 8);
		    }
		    i_1745_++;
		    i_1739_ = ++i_1739_ % i_1738_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2320(float f, float f_1750_, float f_1751_, float[] fs) {
	float f_1752_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10]
		* f_1751_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + f * (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			 [2])
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[6]
		     * f_1750_)));
	float f_1753_
	    = (f * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3]
	       + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + (f_1750_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7])
	       + f_1751_ * (((Class103_Sub2) this).aClass268_9262
			    .aFloatArray4353[11]));
	if (f_1752_ < -f_1753_ || f_1752_ > f_1753_) {
	    float[] fs_1754_ = fs;
	    float[] fs_1755_ = fs;
	    fs[2] = Float.NaN;
	    fs_1755_[1] = Float.NaN;
	    fs_1754_[0] = Float.NaN;
	} else {
	    float f_1756_
		= ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		    * f_1751_)
		   + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4]
		       * f_1750_)
		      + (f * (((Class103_Sub2) this).aClass268_9262
			      .aFloatArray4353[0])
			 + (((Class103_Sub2) this).aClass268_9262
			    .aFloatArray4353[12]))));
	    if (f_1756_ < -f_1753_ || f_1756_ > f_1753_) {
		float[] fs_1757_ = fs;
		float[] fs_1758_ = fs;
		fs[2] = Float.NaN;
		fs_1758_[1] = Float.NaN;
		fs_1757_[0] = Float.NaN;
	    } else {
		float f_1759_
		    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[9]) * f_1751_
		       + ((((Class103_Sub2) this).aClass268_9262
			   .aFloatArray4353[1]) * f
			  + (((Class103_Sub2) this).aClass268_9262
			     .aFloatArray4353[13])
			  + f_1750_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[5])));
		if (f_1759_ < -f_1753_ || f_1759_ > f_1753_) {
		    float[] fs_1760_ = fs;
		    float[] fs_1761_ = fs;
		    fs[2] = Float.NaN;
		    fs_1761_[1] = Float.NaN;
		    fs_1760_[0] = Float.NaN;
		} else {
		    float f_1762_
			= ((((Class103_Sub2) this).aClass268_9279
			    .aFloatArray4353[2]) * f
			   + (((Class103_Sub2) this).aClass268_9279
			      .aFloatArray4353[14])
			   + f_1750_ * (((Class103_Sub2) this).aClass268_9279
					.aFloatArray4353[6])
			   + f_1751_ * (((Class103_Sub2) this).aClass268_9279
					.aFloatArray4353[10]));
		    fs[0] = (((Class103_Sub2) this).aFloat9277
			     + (f_1756_ * ((Class103_Sub2) this).aFloat9268
				/ f_1753_));
		    fs[1] = (((Class103_Sub2) this).aFloat9271
			     + (((Class103_Sub2) this).aFloat9270 * f_1759_
				/ f_1753_));
		    fs[2] = f_1762_;
		}
	    }
	}
    }
    
    public void method2528(float f, float f_1763_, float f_1764_, float[] fs) {
	float f_1765_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10]
		* f_1764_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + f * (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			 [2])
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[6]
		     * f_1763_)));
	float f_1766_
	    = (f * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3]
	       + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + (f_1763_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7])
	       + f_1764_ * (((Class103_Sub2) this).aClass268_9262
			    .aFloatArray4353[11]));
	if (f_1765_ < -f_1766_ || f_1765_ > f_1766_) {
	    float[] fs_1767_ = fs;
	    float[] fs_1768_ = fs;
	    fs[2] = Float.NaN;
	    fs_1768_[1] = Float.NaN;
	    fs_1767_[0] = Float.NaN;
	} else {
	    float f_1769_
		= ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		    * f_1764_)
		   + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4]
		       * f_1763_)
		      + (f * (((Class103_Sub2) this).aClass268_9262
			      .aFloatArray4353[0])
			 + (((Class103_Sub2) this).aClass268_9262
			    .aFloatArray4353[12]))));
	    if (f_1769_ < -f_1766_ || f_1769_ > f_1766_) {
		float[] fs_1770_ = fs;
		float[] fs_1771_ = fs;
		fs[2] = Float.NaN;
		fs_1771_[1] = Float.NaN;
		fs_1770_[0] = Float.NaN;
	    } else {
		float f_1772_
		    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[9]) * f_1764_
		       + ((((Class103_Sub2) this).aClass268_9262
			   .aFloatArray4353[1]) * f
			  + (((Class103_Sub2) this).aClass268_9262
			     .aFloatArray4353[13])
			  + f_1763_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[5])));
		if (f_1772_ < -f_1766_ || f_1772_ > f_1766_) {
		    float[] fs_1773_ = fs;
		    float[] fs_1774_ = fs;
		    fs[2] = Float.NaN;
		    fs_1774_[1] = Float.NaN;
		    fs_1773_[0] = Float.NaN;
		} else {
		    float f_1775_
			= ((((Class103_Sub2) this).aClass268_9279
			    .aFloatArray4353[2]) * f
			   + (((Class103_Sub2) this).aClass268_9279
			      .aFloatArray4353[14])
			   + f_1763_ * (((Class103_Sub2) this).aClass268_9279
					.aFloatArray4353[6])
			   + f_1764_ * (((Class103_Sub2) this).aClass268_9279
					.aFloatArray4353[10]));
		    fs[0] = (((Class103_Sub2) this).aFloat9277
			     + (f_1769_ * ((Class103_Sub2) this).aFloat9268
				/ f_1766_));
		    fs[1] = (((Class103_Sub2) this).aFloat9271
			     + (((Class103_Sub2) this).aFloat9270 * f_1772_
				/ f_1766_));
		    fs[2] = f_1775_;
		}
	    }
	}
    }
    
    public Class105_Sub2 method2529() {
	return new Class105_Sub2_Sub2(this);
    }
    
    Interface4 method15427(int i, int i_1776_) {
	return new Class186(i, i_1776_);
    }
    
    public void method2472(Class98 class98) {
	method15378(((Class103_Sub2) this).anIntArray9245 != null,
		    null != ((Class103_Sub2) this).aFloatArray9248, false,
		    class98);
    }
    
    public int method2536(int i, int i_1777_, int i_1778_, int i_1779_,
			  int i_1780_, int i_1781_) {
	int i_1782_ = 0;
	float f
	    = (((float) i_1778_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[2]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[6]
		     * (float) i_1777_)));
	float f_1783_
	    = (((float) i_1781_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[10])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[14]
		  + (float) i_1779_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[2])
		  + (float) i_1780_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[6])));
	float f_1784_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
	       + ((float) i
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[7]
		  * (float) i_1777_)
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		  * (float) i_1778_));
	float f_1785_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[11]
		* (float) i_1781_)
	       + (((float) i_1779_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[3])
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[15]
		  + (float) i_1780_ * (((Class103_Sub2) this).aClass268_9262
				       .aFloatArray4353[7])));
	if (f < -f_1784_ && f_1783_ < -f_1785_)
	    i_1782_ |= 0x10;
	else if (f > f_1784_ && f_1783_ > f_1785_)
	    i_1782_ |= 0x20;
	float f_1786_
	    = (((float) i_1778_
		* ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8])
	       + (((float) i_1777_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[0]
		      * (float) i)
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[12]))));
	float f_1787_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[8]
		* (float) i_1781_)
	       + (((float) i_1780_
		   * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[4])
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[12]
		     + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353
			[0]) * (float) i_1779_)));
	if (f_1786_ < -f_1784_ && f_1787_ < -f_1785_)
	    i_1782_ |= 0x1;
	if (f_1786_ > f_1784_ && f_1787_ > f_1785_)
	    i_1782_ |= 0x2;
	float f_1788_
	    = ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]
		* (float) i_1778_)
	       + ((((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1]
		   * (float) i)
		  + ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
		  + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		     * (float) i_1777_)));
	float f_1789_
	    = (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[13]
	       + ((float) i_1779_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[1])
	       + (((Class103_Sub2) this).aClass268_9262.aFloatArray4353[5]
		  * (float) i_1780_)
	       + ((float) i_1781_
		  * ((Class103_Sub2) this).aClass268_9262.aFloatArray4353[9]));
	if (f_1788_ < -f_1784_ && f_1789_ < -f_1785_)
	    i_1782_ |= 0x4;
	if (f_1788_ > f_1784_ && f_1789_ > f_1785_)
	    i_1782_ |= 0x8;
	return i_1782_;
    }
    
    public Interface4 method2486(int i, int i_1790_, Class175 class175,
				 Class102 class102, int i_1791_) {
	return method15425(i, i_1790_);
    }
    
    public Interface4 method2531(int i, int i_1792_, Class175 class175,
				 Class102 class102, int i_1793_) {
	return method15425(i, i_1792_);
    }
    
    public Interface4 method2568(int i, int i_1794_, Class175 class175,
				 Class102 class102, int i_1795_) {
	return method15425(i, i_1794_);
    }
    
    public Interface4 method2533(int i, int i_1796_, Class175 class175,
				 Class102 class102, int i_1797_) {
	return method15425(i, i_1796_);
    }
    
    public Interface5 method2534(int i, int i_1798_) {
	return new Class158(i, i_1798_);
    }
    
    public Interface5 method2621(int i, int i_1799_) {
	return new Class158(i, i_1799_);
    }
    
    public Interface5 method2447(int i, int i_1800_) {
	return new Class158(i, i_1800_);
    }
    
    public Interface5 method2354(int i, int i_1801_) {
	return new Class158(i, i_1801_);
    }
    
    Interface4 method15428(int i, int i_1802_) {
	return new Class186(i, i_1802_);
    }
    
    public void method2561(int i) {
	int i_1803_ = i - ((Class103_Sub2) this).anInt9243 * -634521863;
	for (Class241_Sub29 class241_sub29
		 = (Class241_Sub29) ((Class103_Sub2) this).aClass129_9244
					.method3033((byte) 2);
	     null != class241_sub29;
	     class241_sub29
		 = (Class241_Sub29) ((Class103_Sub2) this).aClass129_9244
					.method3034(1638462798)) {
	    if (((Class241_Sub29) class241_sub29).aBool10035) {
		((Class241_Sub29) class241_sub29).anInt10031 += i_1803_;
		int i_1804_
		    = ((Class241_Sub29) class241_sub29).anInt10031 / 50;
		if (i_1804_ > 0) {
		    Class101 class101
			= aClass107_1458.method2680((((Class241_Sub29)
						      class241_sub29)
						     .anInt10034),
						    -21782602);
		    float f = (float) (class101.anInt1406 * 608905203);
		    class241_sub29.method16290
			((int) (f * ((float) i_1803_ / 1000.0F
				     * (float) class101.aByte1376 / 64.0F)),
			 (int) ((float) i_1803_ / 1000.0F
				* (float) class101.aByte1396 / 64.0F * f));
		    ((Class241_Sub29) class241_sub29).anInt10031
			-= i_1804_ * 50;
		}
		((Class241_Sub29) class241_sub29).aBool10035 = false;
	    }
	}
	((Class103_Sub2) this).anInt9243 = 1444866889 * i;
	((Class103_Sub2) this).aClass129_9247.clean(5, -2078668024);
	((Class103_Sub2) this).aClass129_9244.clean(5, -2123929082);
    }
    
    public void method2545(int i, int i_1805_, int i_1806_, int i_1807_,
			   int i_1808_, int i_1809_, Class135 class135,
			   int i_1810_, int i_1811_, int i_1812_, int i_1813_,
			   int i_1814_) {
	if (((Class103_Sub2) this).anIntArray9245 != null) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    int[] is = ((Class135_Sub1) class135_sub1).anIntArray9874;
	    int[] is_1815_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	    int i_1816_
		= (-788450385 * ((Class103_Sub2) this).anInt9254 > i_1811_
		   ? ((Class103_Sub2) this).anInt9254 * -788450385 : i_1811_);
	    int i_1817_ = ((((Class103_Sub2) this).anInt9252 * 1546170165
			    < i_1811_ + is.length)
			   ? 1546170165 * ((Class103_Sub2) this).anInt9252
			   : i_1811_ + is.length);
	    i_1814_ <<= 8;
	    i_1812_ <<= 8;
	    i_1813_ <<= 8;
	    int i_1818_ = i_1812_ + i_1813_;
	    i_1814_ %= i_1818_;
	    i_1806_ -= i;
	    i_1807_ -= i_1805_;
	    if (i_1806_ + i_1807_ < 0) {
		int i_1819_ = (int) (Math.sqrt((double) (i_1806_ * i_1806_
							 + i_1807_ * i_1807_))
				     * 256.0);
		int i_1820_ = i_1819_ % i_1818_;
		i_1814_ = i_1812_ + i_1818_ - i_1814_ - i_1820_;
		i_1814_ %= i_1818_;
		if (i_1814_ < 0)
		    i_1814_ += i_1818_;
		i += i_1806_;
		i_1806_ = -i_1806_;
		i_1805_ += i_1807_;
		i_1807_ = -i_1807_;
	    }
	    if (i_1806_ > i_1807_) {
		i_1805_ <<= 16;
		i_1805_ += 32768;
		i_1807_ <<= 16;
		int i_1821_
		    = (int) Math.floor((double) i_1807_ / (double) i_1806_
				       + 0.5);
		i_1806_ += i;
		int i_1822_ = i_1808_ >>> 24;
		int i_1823_
		    = (int) Math.sqrt((double) (65536
						+ (i_1821_ >> 8) * (i_1821_
								    >> 8)));
		if (i_1809_ == 0 || 1 == i_1809_ && i_1822_ == 255) {
		    while (i <= i_1806_) {
			int i_1824_ = i_1805_ >> 16;
			int i_1825_ = i_1824_ - i_1811_;
			if (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
			    && i < 325436811 * ((Class103_Sub2) this).anInt9250
			    && i_1824_ >= i_1816_ && i_1824_ < i_1817_
			    && i_1814_ < i_1812_) {
			    int i_1826_ = is[i_1825_] + i_1810_;
			    if (i >= i_1826_
				&& i < i_1826_ + is_1815_[i_1825_])
				((Class103_Sub2) this).anIntArray9245
				    [(((Class103_Sub2) this).anInt9260
				      * -1826993761 * i_1824_) + i]
				    = i_1808_;
			}
			i_1805_ += i_1821_;
			i++;
			i_1814_ += i_1823_;
			i_1814_ %= i_1818_;
		    }
		} else if (1 == i_1809_) {
		    i_1808_ = (((i_1808_ & 0xff00ff) * i_1822_ >> 8 & 0xff00ff)
			       + (i_1822_ * (i_1808_ & 0xff00) >> 8 & 0xff00)
			       + (i_1822_ << 24));
		    int i_1827_ = 256 - i_1822_;
		    while (i <= i_1806_) {
			int i_1828_ = i_1805_ >> 16;
			int i_1829_ = i_1828_ - i_1811_;
			if (i >= 1298750001 * ((Class103_Sub2) this).anInt9249
			    && i < 325436811 * ((Class103_Sub2) this).anInt9250
			    && i_1828_ >= i_1816_ && i_1828_ < i_1817_
			    && i_1814_ < i_1812_) {
			    int i_1830_ = is[i_1829_] + i_1810_;
			    if (i >= i_1830_
				&& i < is_1815_[i_1829_] + i_1830_) {
				int i_1831_
				    = i + (i_1828_
					   * (((Class103_Sub2) this).anInt9260
					      * -1826993761));
				int i_1832_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1831_]);
				i_1832_
				    = (((i_1832_ & 0xff00) * i_1827_ >> 8
					& 0xff00)
				       + (i_1827_ * (i_1832_ & 0xff00ff) >> 8
					  & 0xff00ff));
				((Class103_Sub2) this).anIntArray9245[i_1831_]
				    = i_1808_ + i_1832_;
			    }
			}
			i_1805_ += i_1821_;
			i++;
			i_1814_ += i_1823_;
			i_1814_ %= i_1818_;
		    }
		} else if (2 == i_1809_) {
		    while (i <= i_1806_) {
			int i_1833_ = i_1805_ >> 16;
			int i_1834_ = i_1833_ - i_1811_;
			if (i >= ((Class103_Sub2) this).anInt9249 * 1298750001
			    && i < ((Class103_Sub2) this).anInt9250 * 325436811
			    && i_1833_ >= i_1816_ && i_1833_ < i_1817_
			    && i_1814_ < i_1812_) {
			    int i_1835_ = is[i_1834_] + i_1810_;
			    if (i >= i_1835_
				&& i < i_1835_ + is_1815_[i_1834_]) {
				int i_1836_
				    = i + (-1826993761
					   * ((Class103_Sub2) this).anInt9260
					   * i_1833_);
				int i_1837_ = (((Class103_Sub2) this)
					       .anIntArray9245[i_1836_]);
				int i_1838_ = i_1808_ + i_1837_;
				int i_1839_ = ((i_1837_ & 0xff00ff)
					       + (i_1808_ & 0xff00ff));
				i_1837_ = ((i_1839_ & 0x1000100)
					   + (i_1838_ - i_1839_ & 0x10000));
				((Class103_Sub2) this).anIntArray9245[i_1836_]
				    = i_1838_ - i_1837_ | i_1837_ - (i_1837_
								     >>> 8);
			    }
			}
			i_1805_ += i_1821_;
			i++;
			i_1814_ += i_1823_;
			i_1814_ %= i_1818_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_1806_ <<= 16;
		int i_1840_ = (int) Math.floor(0.5 + ((double) i_1806_
						      / (double) i_1807_));
		int i_1841_
		    = (int) Math.sqrt((double) ((i_1840_ >> 8) * (i_1840_ >> 8)
						+ 65536));
		i_1807_ += i_1805_;
		int i_1842_ = i_1808_ >>> 24;
		if (0 == i_1809_ || i_1809_ == 1 && i_1842_ == 255) {
		    while (i_1805_ <= i_1807_) {
			int i_1843_ = i >> 16;
			int i_1844_ = i_1805_ - i_1811_;
			if (i_1805_ >= i_1816_ && i_1805_ < i_1817_
			    && i_1843_ >= (1298750001
					   * ((Class103_Sub2) this).anInt9249)
			    && (i_1843_
				< ((Class103_Sub2) this).anInt9250 * 325436811)
			    && i_1814_ < i_1812_
			    && i_1843_ >= is[i_1844_] + i_1810_
			    && i_1843_ < is_1815_[i_1844_] + (is[i_1844_]
							      + i_1810_))
			    ((Class103_Sub2) this).anIntArray9245
				[(-1826993761
				  * ((Class103_Sub2) this).anInt9260
				  * i_1805_) + i_1843_]
				= i_1808_;
			i += i_1840_;
			i_1805_++;
			i_1814_ += i_1841_;
			i_1814_ %= i_1818_;
		    }
		} else if (i_1809_ == 1) {
		    i_1808_ = ((i_1842_ << 24)
			       + (((i_1808_ & 0xff00) * i_1842_ >> 8 & 0xff00)
				  + (i_1842_ * (i_1808_ & 0xff00ff) >> 8
				     & 0xff00ff)));
		    int i_1845_ = 256 - i_1842_;
		    while (i_1805_ <= i_1807_) {
			int i_1846_ = i >> 16;
			int i_1847_ = i_1805_ - i_1811_;
			if (i_1805_ >= i_1816_ && i_1805_ < i_1817_
			    && i_1846_ >= (1298750001
					   * ((Class103_Sub2) this).anInt9249)
			    && (i_1846_
				< 325436811 * ((Class103_Sub2) this).anInt9250)
			    && i_1814_ < i_1812_
			    && i_1846_ >= i_1810_ + is[i_1847_]
			    && (i_1846_
				< i_1810_ + is[i_1847_] + is_1815_[i_1847_])) {
			    int i_1848_
				= (i_1805_ * (((Class103_Sub2) this).anInt9260
					      * -1826993761)
				   + i_1846_);
			    int i_1849_ = (((Class103_Sub2) this)
					   .anIntArray9245[i_1848_]);
			    i_1849_ = (((i_1849_ & 0xff00ff) * i_1845_ >> 8
					& 0xff00ff)
				       + ((i_1849_ & 0xff00) * i_1845_ >> 8
					  & 0xff00));
			    ((Class103_Sub2) this).anIntArray9245
				[i_1805_ * (((Class103_Sub2) this).anInt9260
					    * -1826993761) + i_1846_]
				= i_1808_ + i_1849_;
			}
			i += i_1840_;
			i_1805_++;
			i_1814_ += i_1841_;
			i_1814_ %= i_1818_;
		    }
		} else if (i_1809_ == 2) {
		    while (i_1805_ <= i_1807_) {
			int i_1850_ = i >> 16;
			int i_1851_ = i_1805_ - i_1811_;
			if (i_1805_ >= i_1816_ && i_1805_ < i_1817_
			    && i_1850_ >= (1298750001
					   * ((Class103_Sub2) this).anInt9249)
			    && (i_1850_
				< ((Class103_Sub2) this).anInt9250 * 325436811)
			    && i_1814_ < i_1812_
			    && i_1850_ >= i_1810_ + is[i_1851_]
			    && (i_1850_
				< i_1810_ + is[i_1851_] + is_1815_[i_1851_])) {
			    int i_1852_ = ((((Class103_Sub2) this).anInt9260
					    * -1826993761 * i_1805_)
					   + i_1850_);
			    int i_1853_ = (((Class103_Sub2) this)
					   .anIntArray9245[i_1852_]);
			    int i_1854_ = i_1853_ + i_1808_;
			    int i_1855_
				= (i_1853_ & 0xff00ff) + (i_1808_ & 0xff00ff);
			    i_1853_ = ((i_1854_ - i_1855_ & 0x10000)
				       + (i_1855_ & 0x1000100));
			    ((Class103_Sub2) this).anIntArray9245[i_1852_]
				= i_1854_ - i_1853_ | i_1853_ - (i_1853_
								 >>> 8);
			}
			i += i_1840_;
			i_1805_++;
			i_1814_ += i_1841_;
			i_1814_ %= i_1818_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Class174 method2343() {
	return new Class174(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    boolean method2546(int i, int i_1856_, int i_1857_, int i_1858_,
		       Class266 class266, Class272 class272) {
	Class268 class268 = method2226();
	class268.method5203(class266);
	class268.method5202(((Class103_Sub2) this).aClass268_9262);
	return class272.method5317(i, i_1856_, i_1857_, i_1858_, class268,
				   ((Class103_Sub2) this).aFloat9277,
				   ((Class103_Sub2) this).aFloat9271,
				   ((Class103_Sub2) this).aFloat9268,
				   ((Class103_Sub2) this).aFloat9270);
    }
    
    public void method2328(Class180 class180, float f, Class180 class180_1859_,
			   float f_1860_, Class180 class180_1861_,
			   float f_1862_) {
	/* empty */
    }
    
    public void method2295() {
	((Class103_Sub2) this).anInt9264 = 0;
	((Class103_Sub2) this).anInt9265 = 0;
	((Class103_Sub2) this).anInt9251
	    = -478795821 * ((Class103_Sub2) this).anInt9260;
	((Class103_Sub2) this).anInt9267
	    = -712079869 * ((Class103_Sub2) this).anInt9278;
	method15372();
    }
    
    void method2346() {
	if (((Class103_Sub2) this).aBool9242) {
	    Class238.method4876(true, false, 1237050869);
	    ((Class103_Sub2) this).aBool9242 = false;
	}
	((Class103_Sub2) this).aBool9246 = true;
    }
    
    public String method2562() {
	return "";
    }
    
    public boolean method2330() {
	return true;
    }
    
    public void method2558(float f, float f_1863_, float f_1864_,
			   float f_1865_, float f_1866_) {
	/* empty */
    }
    
    public Class96 method2553(Class639 class639, Class108[] class108s,
			      boolean bool) {
	int[] is = new int[class108s.length];
	int[] is_1867_ = new int[class108s.length];
	boolean bool_1868_ = false;
	boolean bool_1869_ = false;
	for (int i = 0; i < class108s.length; i++) {
	    is[i] = class108s[i].method2698();
	    is_1867_[i] = class108s[i].method2694();
	    if (class108s[i].method2692())
		bool_1868_ = true;
	    if (class108s[i].method2691())
		bool_1869_ = true;
	}
	if (bool) {
	    if (bool_1869_) {
		if (bool_1868_)
		    return new Class96_Sub1(this, class639,
					    (Class108_Sub2[]) class108s, is,
					    is_1867_);
		return new Class96_Sub3(this, class639,
					(Class108_Sub2[]) class108s, is,
					is_1867_);
	    }
	    if (bool_1868_)
		return new Class96_Sub1(this, class639,
					(Class108_Sub1[]) class108s, is,
					is_1867_);
	    return new Class96_Sub3(this, class639,
				    (Class108_Sub1[]) class108s, is, is_1867_);
	}
	if (bool_1869_) {
	    if (bool_1868_)
		throw new IllegalArgumentException("");
	    return new Class96_Sub5(this, class639,
				    (Class108_Sub2[]) class108s, is, is_1867_);
	}
	return new Class96_Sub2(this, class639, (Class108_Sub1[]) class108s,
				is, is_1867_);
    }
    
    public void method2607() {
	/* empty */
    }
    
    int method15429(int i) {
	return aClass107_1458.method2680(i, -1039220385).anInt1406 * 608905203;
    }
    
    public Class166 method2257(int i, int i_1870_, int[][] is,
			       int[][] is_1871_, int i_1872_, int i_1873_,
			       int i_1874_) {
	return new Class166_Sub3(this, i_1873_, i_1874_, i, i_1870_, is,
				 is_1871_, i_1872_);
    }
    
    public Class268 method2557() {
	return new Class268(((Class103_Sub2) this).aClass268_9261);
    }
    
    boolean method15430() {
	return ((Class103_Sub2) this).aBool9246;
    }
    
    public void method2548(Class241_Sub47 class241_sub47) {
	/* empty */
    }
    
    public Class168 method2540(int[] is, int i, int i_1875_, int i_1876_,
			       int i_1877_, boolean bool) {
	boolean bool_1878_ = false;
	int i_1879_ = i;
    while_101_:
	for (int i_1880_ = 0; i_1880_ < i_1877_; i_1880_++) {
	    for (int i_1881_ = 0; i_1881_ < i_1876_; i_1881_++) {
		int i_1882_ = is[i_1879_++] >>> 24;
		if (0 != i_1882_ && i_1882_ != 255) {
		    bool_1878_ = true;
		    break while_101_;
		}
	    }
	}
	if (bool_1878_)
	    return new Class168_Sub2_Sub2(this, is, i, i_1875_, i_1876_,
					  i_1877_, bool);
	return new Class168_Sub2_Sub1(this, is, i, i_1875_, i_1876_, i_1877_,
				      bool);
    }
    
    public boolean method2527() {
	return true;
    }
    
    void method2630(int i, int i_1883_) throws Exception_Sub2 {
	aClass105_Sub1_1452.method15435(i, i_1883_);
	if (null != anInterface6_1457)
	    anInterface6_1457.method34(-602503007);
    }
    
    void method2421(int i, int i_1884_) throws Exception_Sub2 {
	aClass105_Sub1_1452.method15435(i, i_1884_);
	if (null != anInterface6_1457)
	    anInterface6_1457.method34(-602503007);
    }
    
    static final void method15431(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852
		  .method14189((byte) -6);
    }
    
    static void method15432(long l) {
	Class638.aCalendar8253.setTime(new Date(l));
    }
}
