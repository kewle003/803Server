/* Class380_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class380_Sub2 extends Class380
{
    Class287 aClass287_10399 = new Class287();
    Class287 aClass287_10400;
    int anInt10401;
    boolean aBool10402;
    Interface1 anInterface1_10403;
    int anInt10404;
    Class287 aClass287_10405;
    public Class278 aClass278_10406 = new Class278();
    Class287 aClass287_10407;
    Class278 aClass278_10408;
    public static int anInt10409;
    
    public Class287 method16691(int i) {
	return ((Class380_Sub2) this).aClass287_10405;
    }
    
    public void method16692(Interface1 interface1, Class287 class287,
			    Class278 class278, boolean bool, int i,
			    int[][][] is, Class215 class215, int i_0_,
			    int i_1_, int i_2_) {
	((Class380_Sub2) this).anInterface1_10403 = interface1;
	((Class380_Sub2) this).aClass287_10399.method5655(class287);
	aClass278_10406.method5424(class278);
	((Class380_Sub2) this).aBool10402 = bool;
	((Class380_Sub2) this).anInt10401 = -1789523863 * i;
	((Class380_Sub2) this).anInt10404
	    = (((Class380_Sub2) this).anInterface1_10403.method3(-392884138)
	       .anInt8979) * -1150254827;
	method16695(is, class215, i_0_, i_1_, -1109825690);
    }
    
    public void method16693(byte i) {
	if (((Class380_Sub2) this).anInterface1_10403 != null)
	    ((Class380_Sub2) this).anInterface1_10403
		= (((Class380_Sub2) this).aClass351_5656.method6382
		       (-319268321).method23
		   (((Class380_Sub2) this).anInterface1_10403
			.method14(-305935616),
		    ((Class380_Sub2) this).anInterface1_10403
			.method2((byte) 21),
		    -290357331));
    }
    
    public void method6858(float f, int[][][] is, Class215 class215, int i,
			   int i_3_, int i_4_) {
	if (((Class380_Sub2) this).anInterface1_10403 != null) {
	    method16695(is, class215, i, i_3_, -1378686956);
	    Class278 class278 = method16694(-2145526167);
	    ((Class380_Sub2) this).aClass278_10408.method5406
		(class278,
		 ((Class380_Sub2) this).aClass351_5656.method6297(1474362654));
	    if (Float.isNaN(((Class380_Sub2) this).aClass278_10408.aFloat4393))
		((Class380_Sub2) this).aClass278_10408.method5424(class278);
	    class278.method5375();
	    ((Class380_Sub2) this).aClass287_10400.method5655
		(((Class380_Sub2) this).anInterface1_10403.method3
		     (1184242713).method14991((byte) -100));
	    ((Class380_Sub2) this).aClass351_5656.method6256
		(true, f, ((Class380_Sub2) this).aClass287_10405,
		 ((Class380_Sub2) this).aClass351_5656.method6294((byte) 38),
		 ((Class380_Sub2) this).aClass287_10400,
		 ((Class380_Sub2) this).aClass287_10407, (short) -24770);
	}
    }
    
    Class278 method16694(int i) {
	Class278 class278 = Class278.method5444(aClass278_10406);
	if (((Class380_Sub2) this).aBool10402) {
	    Class287 class287
		= ((Class380_Sub2) this).anInterface1_10403.method5((byte) 14);
	    if (class287.method5559()
		< (float) (((Class380_Sub2) this).anInt10401 * 1444415449)) {
		class287 = Class287.method5561(0.0F, 0.0F, 1.0F);
		Class278 class278_5_
		    = ((Class380_Sub2) this).anInterface1_10403
			  .method13(1281192963);
		class287.method5592(class278_5_);
	    }
	    class287.aFloat4474 = 0.0F;
	    float f = (float) Math.atan2((double) class287.aFloat4477,
					 (double) class287.aFloat4479);
	    class287.method5564();
	    Class278 class278_6_ = new Class278();
	    class278_6_.method5409(0.0F, 1.0F, 0.0F, f);
	    class278.method5396(class278_6_);
	}
	return class278;
    }
    
    void method16695(int[][][] is, Class215 class215, int i, int i_7_,
		     int i_8_) {
	if (method6859((byte) 67)
	    && (((Class380_Sub2) this).aClass351_5656.method6345(355596026)
		|| ((Class380_Sub2) this).aClass351_5656
		       .method6401((byte) -85))) {
	    Class241_Sub16 class241_sub16
		= ((Class380_Sub2) this).anInterface1_10403
		      .method3(-1102635389);
	    ((Class380_Sub2) this).anInt10404
		= class241_sub16.anInt8979 * -1150254827;
	    int i_9_ = ((Class380_Sub2) this).anInt10404 * -1885500389;
	    boolean bool = true;
	    if (-1885500389 * ((Class380_Sub2) this).anInt10404 == 3)
		bool = false;
	    else if (class215 != null
		     && (class215.method4331
			 (576500115 * class241_sub16.anInt8982 - i >> 9,
			  class241_sub16.anInt8984 * -989675525 - i_7_ >> 9,
			  440352607))) {
		i_9_ = 1 + ((Class380_Sub2) this).anInt10404 * -1885500389;
		bool = false;
	    }
	    if (((Class380_Sub2) this).aClass351_5656.method6401((byte) 29)
		&& is != null) {
		float f = method16704(is, class215, i, i_7_, i_9_, bool,
				      1337500491);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_10_ = 3.1415927F;
			Class287 class287
			    = Class287.method5561(0.0F, 0.0F, 1.0F);
			class287.method5592(aClass278_10406);
			Class287 class287_11_
			    = Class287.method5561(class287.aFloat4477, 0.0F,
						  class287.aFloat4479);
			class287_11_.method5573();
			float f_12_
			    = Class287.method5580(class287, class287_11_);
			for (int i_13_ = 0; i_13_ < 10; i_13_++) {
			    float f_14_ = (f_12_ + f_10_) / 2.0F - f_12_;
			    float f_15_ = f_14_;
			    if (f > 0.0F)
				f_15_ *= -1.0F;
			    Class287 class287_16_
				= Class287.method5561(1.0F, 0.0F, 0.0F);
			    class287_16_.method5592(aClass278_10406);
			    Class278 class278 = Class278.method5414();
			    class278.method5385(class287_16_, f_15_);
			    aClass278_10406.method5396(class278);
			    aClass278_10406.method5392();
			    class287_16_.method5564();
			    class278.method5375();
			    f = method16704(is, class215, i, i_7_, i_9_, bool,
					    2119612879);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_12_ += f_14_;
			    else
				f_10_ -= f_14_;
			}
		    }
		}
	    }
	}
    }
    
    public void method6861(RSByteBuffer class241_sub3) {
	Class67 class67
	    = Class323.method5962(class241_sub3.readUnsignedByte((byte) -64),
				  -373396851);
	int i = class241_sub3.readUnsignedShort(1162222719);
	((Class380_Sub2) this).aClass287_10399.method5602(class241_sub3);
	aClass278_10406.method5381(class241_sub3);
	if (class241_sub3.readUnsignedByte((byte) 13) == 1)
	    ((Class380_Sub2) this).aBool10402 = true;
	else
	    ((Class380_Sub2) this).aBool10402 = false;
	((Class380_Sub2) this).anInt10401
	    = class241_sub3.readUnsignedShort(1162222719) * -1789523863;
	((Class380_Sub2) this).anInterface1_10403
	    = ((Class380_Sub2) this).aClass351_5656.method6382(291183588)
		  .method23(class67, i, -290357331);
    }
    
    Class287 method16696(Class278 class278, int i) {
	Class287 class287
	    = Class287.method5562(((Class380_Sub2) this).aClass287_10399);
	class287.method5592(class278);
	Class287 class287_17_
	    = Class287.method5576(((Class380_Sub2) this).aClass287_10400,
				  class287);
	class287.method5564();
	return class287_17_;
    }
    
    public Class241_Sub16 method6874() {
	Class287 class287 = method6867(228107522);
	Class241_Sub16 class241_sub16
	    = new Class241_Sub16((-1885500389
				  * ((Class380_Sub2) this).anInt10404),
				 (int) class287.aFloat4477,
				 (int) class287.aFloat4474,
				 (int) class287.aFloat4479);
	class287.method5564();
	return class241_sub16;
    }
    
    public Class287 method6867(int i) {
	Class287 class287
	    = Class287.method5562(((Class380_Sub2) this).aClass287_10399);
	class287.method5592(((Class380_Sub2) this).aClass278_10408);
	Class287 class287_18_
	    = Class287.method5576(((Class380_Sub2) this).aClass287_10405,
				  class287);
	class287.method5564();
	return class287_18_;
    }
    
    public double[] method6860(short i) {
	double[] ds = new double[3];
	Class287 class287 = method6867(194538495);
	ds[0] = (double) class287.aFloat4477;
	ds[1] = (double) class287.aFloat4474;
	ds[2] = (double) class287.aFloat4479;
	return ds;
    }
    
    public Class241_Sub16 method6857(int i) {
	Class287 class287 = method6867(-1015156723);
	Class241_Sub16 class241_sub16
	    = new Class241_Sub16((-1885500389
				  * ((Class380_Sub2) this).anInt10404),
				 (int) class287.aFloat4477,
				 (int) class287.aFloat4474,
				 (int) class287.aFloat4479);
	class287.method5564();
	return class241_sub16;
    }
    
    public float method16697() {
	return JSFunction.method6228(aClass278_10406, 711202736);
    }
    
    public float method16698() {
	return Class193.method3939(aClass278_10406, -924341006);
    }
    
    public Class380_Sub2(Class351 class351) {
	super(class351);
	((Class380_Sub2) this).anInt10401 = -1422487032;
	((Class380_Sub2) this).aClass287_10405
	    = new Class287(Float.NaN, Float.NaN, Float.NaN);
	((Class380_Sub2) this).aClass287_10400
	    = new Class287(Float.NaN, Float.NaN, Float.NaN);
	((Class380_Sub2) this).aClass287_10407 = new Class287();
	((Class380_Sub2) this).aClass278_10408 = new Class278();
    }
    
    public float method16699(int i) {
	return JSFunction.method6228(aClass278_10406, 1719409077);
    }
    
    public float method6862(short i) {
	return 0.0F;
    }
    
    public void method6863(Class79 class79, int i, int i_19_, byte i_20_) {
	Class287 class287 = method6867(-290681823);
	class79.anInt1137 = ((int) class287.aFloat4477 - i) * 2139849275;
	class79.anInt1136 = 1289480665 * (int) -class287.aFloat4474;
	class79.anInt1135 = ((int) class287.aFloat4479 - i_19_) * 279197473;
	class287.method5564();
    }
    
    public void method6864(RSByteBuffer class241_sub3, byte i) {
	Class67 class67
	    = Class323.method5962(class241_sub3.readUnsignedByte((byte) -3),
				  -740612253);
	int i_21_ = class241_sub3.readUnsignedShort(1162222719);
	((Class380_Sub2) this).aClass287_10399.method5602(class241_sub3);
	aClass278_10406.method5381(class241_sub3);
	if (class241_sub3.readUnsignedByte((byte) -53) == 1)
	    ((Class380_Sub2) this).aBool10402 = true;
	else
	    ((Class380_Sub2) this).aBool10402 = false;
	((Class380_Sub2) this).anInt10401
	    = class241_sub3.readUnsignedShort(1162222719) * -1789523863;
	((Class380_Sub2) this).anInterface1_10403
	    = ((Class380_Sub2) this).aClass351_5656.method6382(-2047810830)
		  .method23(class67, i_21_, -290357331);
    }
    
    public float method16700(int i) {
	return Class193.method3939(aClass278_10406, -1255794812);
    }
    
    public boolean method6859(byte i) {
	return !Float.isNaN(((Class380_Sub2) this).aClass287_10405.aFloat4477);
    }
    
    public boolean method6872() {
	return !Float.isNaN(((Class380_Sub2) this).aClass287_10405.aFloat4477);
    }
    
    public Class287 method16701() {
	return ((Class380_Sub2) this).aClass287_10399;
    }
    
    public float method6875() {
	return 0.0F;
    }
    
    public Class287 method6868() {
	Class287 class287
	    = Class287.method5562(((Class380_Sub2) this).aClass287_10399);
	class287.method5592(((Class380_Sub2) this).aClass278_10408);
	Class287 class287_22_
	    = Class287.method5576(((Class380_Sub2) this).aClass287_10405,
				  class287);
	class287.method5564();
	return class287_22_;
    }
    
    public void method16702(Interface1 interface1, Class287 class287,
			    Class278 class278, boolean bool, int i,
			    int[][][] is, Class215 class215, int i_23_,
			    int i_24_) {
	((Class380_Sub2) this).anInterface1_10403 = interface1;
	((Class380_Sub2) this).aClass287_10399.method5655(class287);
	aClass278_10406.method5424(class278);
	((Class380_Sub2) this).aBool10402 = bool;
	((Class380_Sub2) this).anInt10401 = -1789523863 * i;
	((Class380_Sub2) this).anInt10404
	    = (((Class380_Sub2) this).anInterface1_10403.method3(1113383720)
	       .anInt8979) * -1150254827;
	method16695(is, class215, i_23_, i_24_, -481925745);
    }
    
    public double[] method6879() {
	double[] ds = new double[3];
	Class287 class287 = method6867(-352279381);
	ds[0] = (double) class287.aFloat4477;
	ds[1] = (double) class287.aFloat4474;
	ds[2] = (double) class287.aFloat4479;
	return ds;
    }
    
    Class287 method16703(Class278 class278) {
	Class287 class287
	    = Class287.method5562(((Class380_Sub2) this).aClass287_10399);
	class287.method5592(class278);
	Class287 class287_25_
	    = Class287.method5576(((Class380_Sub2) this).aClass287_10400,
				  class287);
	class287.method5564();
	return class287_25_;
    }
    
    public void method6877(Class79 class79, int i, int i_26_) {
	Class287 class287 = method6867(-1995757164);
	class79.anInt1137 = ((int) class287.aFloat4477 - i) * 2139849275;
	class79.anInt1136 = 1289480665 * (int) -class287.aFloat4474;
	class79.anInt1135 = ((int) class287.aFloat4479 - i_26_) * 279197473;
	class287.method5564();
    }
    
    public Class287 method6871() {
	Class287 class287
	    = Class287.method5562(((Class380_Sub2) this).aClass287_10399);
	class287.method5592(((Class380_Sub2) this).aClass278_10408);
	Class287 class287_27_
	    = Class287.method5576(((Class380_Sub2) this).aClass287_10405,
				  class287);
	class287.method5564();
	return class287_27_;
    }
    
    public float method6876() {
	return 0.0F;
    }
    
    public boolean method6869() {
	return !Float.isNaN(((Class380_Sub2) this).aClass287_10405.aFloat4477);
    }
    
    public void method6870(RSByteBuffer class241_sub3) {
	Class67 class67
	    = Class323.method5962(class241_sub3.readUnsignedByte((byte) -2),
				  -648900305);
	int i = class241_sub3.readUnsignedShort(1162222719);
	((Class380_Sub2) this).aClass287_10399.method5602(class241_sub3);
	aClass278_10406.method5381(class241_sub3);
	if (class241_sub3.readUnsignedByte((byte) -32) == 1)
	    ((Class380_Sub2) this).aBool10402 = true;
	else
	    ((Class380_Sub2) this).aBool10402 = false;
	((Class380_Sub2) this).anInt10401
	    = class241_sub3.readUnsignedShort(1162222719) * -1789523863;
	((Class380_Sub2) this).anInterface1_10403
	    = ((Class380_Sub2) this).aClass351_5656.method6382(-909391032)
		  .method23(class67, i, -290357331);
    }
    
    float method16704(int[][][] is, Class215 class215, int i, int i_28_,
		      int i_29_, boolean bool, int i_30_) {
	Class278 class278 = method16694(-2114803046);
	Class287 class287 = method16696(class278, -1478093744);
	class278.method5375();
	int i_31_ = (int) class287.aFloat4477 - i >> 9;
	int i_32_ = (int) class287.aFloat4479 - i_28_ >> 9;
	if (i_31_ >= 0 && i_32_ >= 0 && i_31_ + 1 < is[0].length
	    && i_32_ + 1 < is[0][0].length) {
	    int i_33_ = i_29_;
	    if (bool && class215.method4331(i_31_, i_32_, 1244444592))
		i_33_ = 1 + i_29_;
	    long l = (long) class287.aFloat4477 % 512L;
	    long l_34_ = (long) class287.aFloat4479 % 512L;
	    long l_35_
		= (512L - l) * (long) is[i_33_][i_31_][i_32_] * (512L - l_34_);
	    l_35_ += l * (long) is[i_33_][i_31_ + 1][i_32_] * (512L - l_34_);
	    l_35_ += l_34_ * ((512L - l) * (long) is[i_33_][i_31_][i_32_ + 1]);
	    l_35_ += (long) is[i_33_][1 + i_31_][i_32_ + 1] * l * l_34_;
	    l_35_ /= 262144L;
	    l_35_ -= 1024L;
	    float f = (float) -l_35_ - class287.aFloat4474;
	    class287.method5564();
	    return f;
	}
	class287.method5564();
	return Float.NaN;
    }
    
    public void method16705(Interface1 interface1, Class287 class287,
			    Class278 class278, boolean bool, int i,
			    int[][][] is, Class215 class215, int i_36_,
			    int i_37_) {
	((Class380_Sub2) this).anInterface1_10403 = interface1;
	((Class380_Sub2) this).aClass287_10399.method5655(class287);
	aClass278_10406.method5424(class278);
	((Class380_Sub2) this).aBool10402 = bool;
	((Class380_Sub2) this).anInt10401 = -1789523863 * i;
	((Class380_Sub2) this).anInt10404
	    = (((Class380_Sub2) this).anInterface1_10403.method3(196125822)
	       .anInt8979) * -1150254827;
	method16695(is, class215, i_36_, i_37_, -1387982933);
    }
    
    public void method16706(Interface1 interface1, Class287 class287,
			    Class278 class278, boolean bool, int i,
			    int[][][] is, Class215 class215, int i_38_,
			    int i_39_) {
	((Class380_Sub2) this).anInterface1_10403 = interface1;
	((Class380_Sub2) this).aClass287_10399.method5655(class287);
	aClass278_10406.method5424(class278);
	((Class380_Sub2) this).aBool10402 = bool;
	((Class380_Sub2) this).anInt10401 = -1789523863 * i;
	((Class380_Sub2) this).anInt10404
	    = (((Class380_Sub2) this).anInterface1_10403.method3(-811579237)
	       .anInt8979) * -1150254827;
	method16695(is, class215, i_38_, i_39_, -414188383);
    }
    
    public void method16707(Interface1 interface1, Class287 class287,
			    Class278 class278, boolean bool, int i,
			    int[][][] is, Class215 class215, int i_40_,
			    int i_41_) {
	((Class380_Sub2) this).anInterface1_10403 = interface1;
	((Class380_Sub2) this).aClass287_10399.method5655(class287);
	aClass278_10406.method5424(class278);
	((Class380_Sub2) this).aBool10402 = bool;
	((Class380_Sub2) this).anInt10401 = -1789523863 * i;
	((Class380_Sub2) this).anInt10404
	    = (((Class380_Sub2) this).anInterface1_10403.method3(2088047477)
	       .anInt8979) * -1150254827;
	method16695(is, class215, i_40_, i_41_, -2043806108);
    }
    
    public void method6865(float f, int[][][] is, Class215 class215, int i,
			   int i_42_) {
	if (((Class380_Sub2) this).anInterface1_10403 != null) {
	    method16695(is, class215, i, i_42_, -130496582);
	    Class278 class278 = method16694(-2135707369);
	    ((Class380_Sub2) this).aClass278_10408.method5406
		(class278,
		 ((Class380_Sub2) this).aClass351_5656.method6297(25307316));
	    if (Float.isNaN(((Class380_Sub2) this).aClass278_10408.aFloat4393))
		((Class380_Sub2) this).aClass278_10408.method5424(class278);
	    class278.method5375();
	    ((Class380_Sub2) this).aClass287_10400.method5655
		(((Class380_Sub2) this).anInterface1_10403.method3
		     (1822569797).method14991((byte) -13));
	    ((Class380_Sub2) this).aClass351_5656.method6256
		(true, f, ((Class380_Sub2) this).aClass287_10405,
		 ((Class380_Sub2) this).aClass351_5656.method6294((byte) -2),
		 ((Class380_Sub2) this).aClass287_10400,
		 ((Class380_Sub2) this).aClass287_10407, (short) -29187);
	}
    }
    
    public void method16708() {
	if (((Class380_Sub2) this).anInterface1_10403 != null)
	    ((Class380_Sub2) this).anInterface1_10403
		= (((Class380_Sub2) this).aClass351_5656.method6382
		       (-719995188).method23
		   (((Class380_Sub2) this).anInterface1_10403
			.method14(1845888526),
		    ((Class380_Sub2) this).anInterface1_10403
			.method2((byte) -38),
		    -290357331));
    }
    
    Class278 method16709() {
	Class278 class278 = Class278.method5444(aClass278_10406);
	if (((Class380_Sub2) this).aBool10402) {
	    Class287 class287
		= ((Class380_Sub2) this).anInterface1_10403.method5((byte) 14);
	    if (class287.method5559()
		< (float) (((Class380_Sub2) this).anInt10401 * 1444415449)) {
		class287 = Class287.method5561(0.0F, 0.0F, 1.0F);
		Class278 class278_43_
		    = ((Class380_Sub2) this).anInterface1_10403
			  .method13(901189519);
		class287.method5592(class278_43_);
	    }
	    class287.aFloat4474 = 0.0F;
	    float f = (float) Math.atan2((double) class287.aFloat4477,
					 (double) class287.aFloat4479);
	    class287.method5564();
	    Class278 class278_44_ = new Class278();
	    class278_44_.method5409(0.0F, 1.0F, 0.0F, f);
	    class278.method5396(class278_44_);
	}
	return class278;
    }
    
    Class278 method16710() {
	Class278 class278 = Class278.method5444(aClass278_10406);
	if (((Class380_Sub2) this).aBool10402) {
	    Class287 class287
		= ((Class380_Sub2) this).anInterface1_10403.method5((byte) 14);
	    if (class287.method5559()
		< (float) (((Class380_Sub2) this).anInt10401 * 1444415449)) {
		class287 = Class287.method5561(0.0F, 0.0F, 1.0F);
		Class278 class278_45_
		    = ((Class380_Sub2) this).anInterface1_10403
			  .method13(-899703764);
		class287.method5592(class278_45_);
	    }
	    class287.aFloat4474 = 0.0F;
	    float f = (float) Math.atan2((double) class287.aFloat4477,
					 (double) class287.aFloat4479);
	    class287.method5564();
	    Class278 class278_46_ = new Class278();
	    class278_46_.method5409(0.0F, 1.0F, 0.0F, f);
	    class278.method5396(class278_46_);
	}
	return class278;
    }
    
    void method16711(int[][][] is, Class215 class215, int i, int i_47_) {
	if (method6859((byte) 67)
	    && (((Class380_Sub2) this).aClass351_5656.method6345(773864930)
		|| ((Class380_Sub2) this).aClass351_5656
		       .method6401((byte) 102))) {
	    Class241_Sub16 class241_sub16
		= ((Class380_Sub2) this).anInterface1_10403
		      .method3(-138926115);
	    ((Class380_Sub2) this).anInt10404
		= class241_sub16.anInt8979 * -1150254827;
	    int i_48_ = ((Class380_Sub2) this).anInt10404 * -1885500389;
	    boolean bool = true;
	    if (-1885500389 * ((Class380_Sub2) this).anInt10404 == 3)
		bool = false;
	    else if (class215 != null
		     && (class215.method4331
			 (576500115 * class241_sub16.anInt8982 - i >> 9,
			  class241_sub16.anInt8984 * -989675525 - i_47_ >> 9,
			  -333139509))) {
		i_48_ = 1 + ((Class380_Sub2) this).anInt10404 * -1885500389;
		bool = false;
	    }
	    if (((Class380_Sub2) this).aClass351_5656.method6401((byte) 34)
		&& is != null) {
		float f = method16704(is, class215, i, i_47_, i_48_, bool,
				      -105259772);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_49_ = 3.1415927F;
			Class287 class287
			    = Class287.method5561(0.0F, 0.0F, 1.0F);
			class287.method5592(aClass278_10406);
			Class287 class287_50_
			    = Class287.method5561(class287.aFloat4477, 0.0F,
						  class287.aFloat4479);
			class287_50_.method5573();
			float f_51_
			    = Class287.method5580(class287, class287_50_);
			for (int i_52_ = 0; i_52_ < 10; i_52_++) {
			    float f_53_ = (f_51_ + f_49_) / 2.0F - f_51_;
			    float f_54_ = f_53_;
			    if (f > 0.0F)
				f_54_ *= -1.0F;
			    Class287 class287_55_
				= Class287.method5561(1.0F, 0.0F, 0.0F);
			    class287_55_.method5592(aClass278_10406);
			    Class278 class278 = Class278.method5414();
			    class278.method5385(class287_55_, f_54_);
			    aClass278_10406.method5396(class278);
			    aClass278_10406.method5392();
			    class287_55_.method5564();
			    class278.method5375();
			    f = method16704(is, class215, i, i_47_, i_48_,
					    bool, 1296152901);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_51_ += f_53_;
			    else
				f_49_ -= f_53_;
			}
		    }
		}
	    }
	}
    }
    
    void method16712(int[][][] is, Class215 class215, int i, int i_56_) {
	if (method6859((byte) 67)
	    && (((Class380_Sub2) this).aClass351_5656.method6345(-1704585288)
		|| ((Class380_Sub2) this).aClass351_5656
		       .method6401((byte) -8))) {
	    Class241_Sub16 class241_sub16
		= ((Class380_Sub2) this).anInterface1_10403.method3(812252831);
	    ((Class380_Sub2) this).anInt10404
		= class241_sub16.anInt8979 * -1150254827;
	    int i_57_ = ((Class380_Sub2) this).anInt10404 * -1885500389;
	    boolean bool = true;
	    if (-1885500389 * ((Class380_Sub2) this).anInt10404 == 3)
		bool = false;
	    else if (class215 != null
		     && (class215.method4331
			 (576500115 * class241_sub16.anInt8982 - i >> 9,
			  class241_sub16.anInt8984 * -989675525 - i_56_ >> 9,
			  1059685211))) {
		i_57_ = 1 + ((Class380_Sub2) this).anInt10404 * -1885500389;
		bool = false;
	    }
	    if (((Class380_Sub2) this).aClass351_5656.method6401((byte) 31)
		&& is != null) {
		float f = method16704(is, class215, i, i_56_, i_57_, bool,
				      969756072);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_58_ = 3.1415927F;
			Class287 class287
			    = Class287.method5561(0.0F, 0.0F, 1.0F);
			class287.method5592(aClass278_10406);
			Class287 class287_59_
			    = Class287.method5561(class287.aFloat4477, 0.0F,
						  class287.aFloat4479);
			class287_59_.method5573();
			float f_60_
			    = Class287.method5580(class287, class287_59_);
			for (int i_61_ = 0; i_61_ < 10; i_61_++) {
			    float f_62_ = (f_60_ + f_58_) / 2.0F - f_60_;
			    float f_63_ = f_62_;
			    if (f > 0.0F)
				f_63_ *= -1.0F;
			    Class287 class287_64_
				= Class287.method5561(1.0F, 0.0F, 0.0F);
			    class287_64_.method5592(aClass278_10406);
			    Class278 class278 = Class278.method5414();
			    class278.method5385(class287_64_, f_63_);
			    aClass278_10406.method5396(class278);
			    aClass278_10406.method5392();
			    class287_64_.method5564();
			    class278.method5375();
			    f = method16704(is, class215, i, i_56_, i_57_,
					    bool, -377108740);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_60_ += f_62_;
			    else
				f_58_ -= f_62_;
			}
		    }
		}
	    }
	}
    }
    
    void method16713(int[][][] is, Class215 class215, int i, int i_65_) {
	if (method6859((byte) 67)
	    && (((Class380_Sub2) this).aClass351_5656.method6345(-2100504628)
		|| ((Class380_Sub2) this).aClass351_5656
		       .method6401((byte) -14))) {
	    Class241_Sub16 class241_sub16
		= ((Class380_Sub2) this).anInterface1_10403.method3(795054216);
	    ((Class380_Sub2) this).anInt10404
		= class241_sub16.anInt8979 * -1150254827;
	    int i_66_ = ((Class380_Sub2) this).anInt10404 * -1885500389;
	    boolean bool = true;
	    if (-1885500389 * ((Class380_Sub2) this).anInt10404 == 3)
		bool = false;
	    else if (class215 != null
		     && (class215.method4331
			 (576500115 * class241_sub16.anInt8982 - i >> 9,
			  class241_sub16.anInt8984 * -989675525 - i_65_ >> 9,
			  1224060340))) {
		i_66_ = 1 + ((Class380_Sub2) this).anInt10404 * -1885500389;
		bool = false;
	    }
	    if (((Class380_Sub2) this).aClass351_5656.method6401((byte) -52)
		&& is != null) {
		float f = method16704(is, class215, i, i_65_, i_66_, bool,
				      -40866604);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_67_ = 3.1415927F;
			Class287 class287
			    = Class287.method5561(0.0F, 0.0F, 1.0F);
			class287.method5592(aClass278_10406);
			Class287 class287_68_
			    = Class287.method5561(class287.aFloat4477, 0.0F,
						  class287.aFloat4479);
			class287_68_.method5573();
			float f_69_
			    = Class287.method5580(class287, class287_68_);
			for (int i_70_ = 0; i_70_ < 10; i_70_++) {
			    float f_71_ = (f_69_ + f_67_) / 2.0F - f_69_;
			    float f_72_ = f_71_;
			    if (f > 0.0F)
				f_72_ *= -1.0F;
			    Class287 class287_73_
				= Class287.method5561(1.0F, 0.0F, 0.0F);
			    class287_73_.method5592(aClass278_10406);
			    Class278 class278 = Class278.method5414();
			    class278.method5385(class287_73_, f_72_);
			    aClass278_10406.method5396(class278);
			    aClass278_10406.method5392();
			    class287_73_.method5564();
			    class278.method5375();
			    f = method16704(is, class215, i, i_65_, i_66_,
					    bool, -1816454607);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_69_ += f_71_;
			    else
				f_67_ -= f_71_;
			}
		    }
		}
	    }
	}
    }
    
    void method16714(int[][][] is, Class215 class215, int i, int i_74_) {
	if (method6859((byte) 67)
	    && (((Class380_Sub2) this).aClass351_5656.method6345(-881028570)
		|| ((Class380_Sub2) this).aClass351_5656
		       .method6401((byte) 49))) {
	    Class241_Sub16 class241_sub16
		= ((Class380_Sub2) this).anInterface1_10403.method3(444470998);
	    ((Class380_Sub2) this).anInt10404
		= class241_sub16.anInt8979 * -1150254827;
	    int i_75_ = ((Class380_Sub2) this).anInt10404 * -1885500389;
	    boolean bool = true;
	    if (-1885500389 * ((Class380_Sub2) this).anInt10404 == 3)
		bool = false;
	    else if (class215 != null
		     && (class215.method4331
			 (576500115 * class241_sub16.anInt8982 - i >> 9,
			  class241_sub16.anInt8984 * -989675525 - i_74_ >> 9,
			  41123843))) {
		i_75_ = 1 + ((Class380_Sub2) this).anInt10404 * -1885500389;
		bool = false;
	    }
	    if (((Class380_Sub2) this).aClass351_5656.method6401((byte) 3)
		&& is != null) {
		float f = method16704(is, class215, i, i_74_, i_75_, bool,
				      2027971694);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_76_ = 3.1415927F;
			Class287 class287
			    = Class287.method5561(0.0F, 0.0F, 1.0F);
			class287.method5592(aClass278_10406);
			Class287 class287_77_
			    = Class287.method5561(class287.aFloat4477, 0.0F,
						  class287.aFloat4479);
			class287_77_.method5573();
			float f_78_
			    = Class287.method5580(class287, class287_77_);
			for (int i_79_ = 0; i_79_ < 10; i_79_++) {
			    float f_80_ = (f_78_ + f_76_) / 2.0F - f_78_;
			    float f_81_ = f_80_;
			    if (f > 0.0F)
				f_81_ *= -1.0F;
			    Class287 class287_82_
				= Class287.method5561(1.0F, 0.0F, 0.0F);
			    class287_82_.method5592(aClass278_10406);
			    Class278 class278 = Class278.method5414();
			    class278.method5385(class287_82_, f_81_);
			    aClass278_10406.method5396(class278);
			    aClass278_10406.method5392();
			    class287_82_.method5564();
			    class278.method5375();
			    f = method16704(is, class215, i, i_74_, i_75_,
					    bool, 150004757);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_78_ += f_80_;
			    else
				f_76_ -= f_80_;
			}
		    }
		}
	    }
	}
    }
    
    float method16715(int[][][] is, Class215 class215, int i, int i_83_,
		      int i_84_, boolean bool) {
	Class278 class278 = method16694(-2095969540);
	Class287 class287 = method16696(class278, -1478093744);
	class278.method5375();
	int i_85_ = (int) class287.aFloat4477 - i >> 9;
	int i_86_ = (int) class287.aFloat4479 - i_83_ >> 9;
	if (i_85_ >= 0 && i_86_ >= 0 && i_85_ + 1 < is[0].length
	    && i_86_ + 1 < is[0][0].length) {
	    int i_87_ = i_84_;
	    if (bool && class215.method4331(i_85_, i_86_, 309922176))
		i_87_ = 1 + i_84_;
	    long l = (long) class287.aFloat4477 % 512L;
	    long l_88_ = (long) class287.aFloat4479 % 512L;
	    long l_89_
		= (512L - l) * (long) is[i_87_][i_85_][i_86_] * (512L - l_88_);
	    l_89_ += l * (long) is[i_87_][i_85_ + 1][i_86_] * (512L - l_88_);
	    l_89_ += l_88_ * ((512L - l) * (long) is[i_87_][i_85_][i_86_ + 1]);
	    l_89_ += (long) is[i_87_][1 + i_85_][i_86_ + 1] * l * l_88_;
	    l_89_ /= 262144L;
	    l_89_ -= 1024L;
	    float f = (float) -l_89_ - class287.aFloat4474;
	    class287.method5564();
	    return f;
	}
	class287.method5564();
	return Float.NaN;
    }
    
    float method16716(int[][][] is, Class215 class215, int i, int i_90_,
		      int i_91_, boolean bool) {
	Class278 class278 = method16694(-2128007312);
	Class287 class287 = method16696(class278, -1478093744);
	class278.method5375();
	int i_92_ = (int) class287.aFloat4477 - i >> 9;
	int i_93_ = (int) class287.aFloat4479 - i_90_ >> 9;
	if (i_92_ >= 0 && i_93_ >= 0 && i_92_ + 1 < is[0].length
	    && i_93_ + 1 < is[0][0].length) {
	    int i_94_ = i_91_;
	    if (bool && class215.method4331(i_92_, i_93_, 1694822232))
		i_94_ = 1 + i_91_;
	    long l = (long) class287.aFloat4477 % 512L;
	    long l_95_ = (long) class287.aFloat4479 % 512L;
	    long l_96_
		= (512L - l) * (long) is[i_94_][i_92_][i_93_] * (512L - l_95_);
	    l_96_ += l * (long) is[i_94_][i_92_ + 1][i_93_] * (512L - l_95_);
	    l_96_ += l_95_ * ((512L - l) * (long) is[i_94_][i_92_][i_93_ + 1]);
	    l_96_ += (long) is[i_94_][1 + i_92_][i_93_ + 1] * l * l_95_;
	    l_96_ /= 262144L;
	    l_96_ -= 1024L;
	    float f = (float) -l_96_ - class287.aFloat4474;
	    class287.method5564();
	    return f;
	}
	class287.method5564();
	return Float.NaN;
    }
    
    Class287 method16717(Class278 class278) {
	Class287 class287
	    = Class287.method5562(((Class380_Sub2) this).aClass287_10399);
	class287.method5592(class278);
	Class287 class287_97_
	    = Class287.method5576(((Class380_Sub2) this).aClass287_10400,
				  class287);
	class287.method5564();
	return class287_97_;
    }
    
    public float method16718() {
	return JSFunction.method6228(aClass278_10406, -211277037);
    }
    
    public Class287 method16719() {
	return ((Class380_Sub2) this).aClass287_10405;
    }
    
    public Class287 method16720(int i) {
	return ((Class380_Sub2) this).aClass287_10399;
    }
    
    public Class287 method6878() {
	Class287 class287
	    = Class287.method5562(((Class380_Sub2) this).aClass287_10399);
	class287.method5592(((Class380_Sub2) this).aClass278_10408);
	Class287 class287_98_
	    = Class287.method5576(((Class380_Sub2) this).aClass287_10405,
				  class287);
	class287.method5564();
	return class287_98_;
    }
    
    public float method16721() {
	return Class193.method3939(aClass278_10406, 890336089);
    }
    
    public void method6866(float f, int[][][] is, Class215 class215, int i,
			   int i_99_) {
	if (((Class380_Sub2) this).anInterface1_10403 != null) {
	    method16695(is, class215, i, i_99_, -479845738);
	    Class278 class278 = method16694(-2122618580);
	    ((Class380_Sub2) this).aClass278_10408.method5406
		(class278,
		 ((Class380_Sub2) this).aClass351_5656.method6297(1597864276));
	    if (Float.isNaN(((Class380_Sub2) this).aClass278_10408.aFloat4393))
		((Class380_Sub2) this).aClass278_10408.method5424(class278);
	    class278.method5375();
	    ((Class380_Sub2) this).aClass287_10400.method5655
		(((Class380_Sub2) this).anInterface1_10403.method3
		     (276386669).method14991((byte) -73));
	    ((Class380_Sub2) this).aClass351_5656.method6256
		(true, f, ((Class380_Sub2) this).aClass287_10405,
		 ((Class380_Sub2) this).aClass351_5656.method6294((byte) 10),
		 ((Class380_Sub2) this).aClass287_10400,
		 ((Class380_Sub2) this).aClass287_10407, (short) -19462);
	}
    }
    
    public Class241_Sub16 method6873() {
	Class287 class287 = method6867(-2104835204);
	Class241_Sub16 class241_sub16
	    = new Class241_Sub16((-1885500389
				  * ((Class380_Sub2) this).anInt10404),
				 (int) class287.aFloat4477,
				 (int) class287.aFloat4474,
				 (int) class287.aFloat4479);
	class287.method5564();
	return class241_sub16;
    }
    
    public static final void method16722(long l) {
	if (l > 0L) {
	    if (0L == l % 10L) {
		Class102.method2213(l - 1L);
		Class102.method2213(1L);
	    } else
		Class102.method2213(l);
	}
    }
}
