/* Class89_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

@SuppressWarnings("restriction")
public class Class89_Sub1 extends Class89
{
    static Class365 aClass365_9317;
    static final int anInt9318 = 7;
    Class103_Sub3 aClass103_Sub3_9319;
    short[] aShortArray9320;
    int anInt9321;
    short aShort9322;
    boolean aBool9323;
    int anInt9324 = 0;
    int anInt9325 = 0;
    int[] anIntArray9326;
    int[] anIntArray9327;
    short[] aShortArray9328;
    int[][] anIntArrayArray9329;
    short[] aShortArray9330;
    int anInt9331;
    int anInt9332;
    Class315[] aClass315Array9333;
    short[] aShortArray9334;
    short[] aShortArray9335;
    int anInt9336;
    int[][] anIntArrayArray9337;
    float[] aFloatArray9338;
    float[] aFloatArray9339;
    Class307 aClass307_9340;
    Class311 aClass311_9341;
    int anInt9342;
    static final int anInt9343 = 4;
    byte[] aByteArray9344;
    short[] aShortArray9345;
    short[] aShortArray9346;
    int[] anIntArray9347;
    short[] aShortArray9348;
    int[] anIntArray9349;
    short[] aShortArray9350;
    Class386 aClass386_9351;
    Class311 aClass311_9352;
    Class311 aClass311_9353;
    Class311 aClass311_9354;
    short[] aShortArray9355;
    float[] aFloatArray9356;
    boolean aBool9357;
    boolean aBool9358;
    int anInt9359;
    int[] anIntArray9360;
    short[] aShortArray9361;
    byte[] aByteArray9362;
    int anInt9363;
    int anInt9364;
    int anInt9365;
    int anInt9366;
    int anInt9367;
    short[] aShortArray9368;
    boolean aBool9369;
    int anInt9370;
    short[] aShortArray9371;
    long[] aLongArray9372;
    int[] anIntArray9373;
    int[] anIntArray9374;
    int anInt9375;
    Class106[] aClass106Array9376;
    Class167[] aClass167Array9377;
    int anInt9378 = 0;
    Class381[] aClass381Array9379;
    int anInt9380;
    int[][] anIntArrayArray9381;
    boolean aBool9382;
    short aShort9383;
    int[] anIntArray9384;
    int[] anIntArray9385;
    int[] anIntArray9386;
    int[] anIntArray9387;
    int[] anIntArray9388;
    int anInt9389;
    int anInt9390;
    int anInt9391;
    boolean aBool9392;
    boolean aBool9393;
    
    public void method2013(int i, int i_0_, Class166 class166,
			   Class166 class166_1_, int i_2_, int i_3_,
			   int i_4_) {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i_5_ = i_2_ + ((Class89_Sub1) this).anInt9365;
	int i_6_ = i_2_ + ((Class89_Sub1) this).anInt9366;
	int i_7_ = i_4_ + ((Class89_Sub1) this).anInt9332;
	int i_8_ = i_4_ + ((Class89_Sub1) this).anInt9359;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_5_ >= 0
		&& ((i_6_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2055 * 266270313)
		&& i_7_ >= 0
		&& ((i_8_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2052 * -14610189))) {
	    if (i == 4 || i == 5) {
		if (class166_1_ == null
		    || (i_5_ < 0
			|| ((i_6_ + class166_1_.anInt2053 * 2039042417
			     >> class166_1_.anInt2054 * -122333825)
			    >= class166_1_.anInt2055 * 266270313)
			|| i_7_ < 0
			|| ((i_8_ + class166_1_.anInt2053 * 2039042417
			     >> class166_1_.anInt2054 * -122333825)
			    >= class166_1_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_5_ >>= class166.anInt2054 * -122333825;
		i_6_ = (i_6_ + (class166.anInt2053 * 2039042417 - 1)
			>> class166.anInt2054 * -122333825);
		i_7_ >>= class166.anInt2054 * -122333825;
		i_8_ = (i_8_ + (class166.anInt2053 * 2039042417 - 1)
			>> class166.anInt2054 * -122333825);
		if (class166.method3551(i_5_, i_7_, -1941292559) == i_3_
		    && class166.method3551(i_6_, i_7_, -1439414959) == i_3_
		    && class166.method3551(i_5_, i_8_, -1705002478) == i_3_
		    && class166.method3551(i_6_, i_8_, -2067505977) == i_3_)
		    return;
	    }
	    if (i == 1) {
		for (int i_9_ = 0; i_9_ < ((Class89_Sub1) this).anInt9325;
		     i_9_++)
		    ((Class89_Sub1) this).anIntArray9327[i_9_]
			= (((Class89_Sub1) this).anIntArray9327[i_9_]
			   + class166.method3550(((((Class89_Sub1) this)
						   .anIntArray9326[i_9_])
						  + i_2_),
						 ((((Class89_Sub1) this)
						   .anIntArray9360[i_9_])
						  + i_4_),
						 -308437506)
			   - i_3_);
	    } else if (i == 2) {
		int i_10_ = ((Class89_Sub1) this).anInt9363;
		if (i_10_ == 0)
		    return;
		for (int i_11_ = 0; i_11_ < ((Class89_Sub1) this).anInt9325;
		     i_11_++) {
		    int i_12_
			= ((((Class89_Sub1) this).anIntArray9327[i_11_] << 16)
			   / i_10_);
		    if (i_12_ < i_0_)
			((Class89_Sub1) this).anIntArray9327[i_11_]
			    = (((Class89_Sub1) this).anIntArray9327[i_11_]
			       + (class166.method3550(((((Class89_Sub1) this)
							.anIntArray9326[i_11_])
						       + i_2_),
						      ((((Class89_Sub1) this)
							.anIntArray9360[i_11_])
						       + i_4_),
						      363137544)
				  - i_3_) * (i_0_ - i_12_) / i_0_);
		}
	    } else if (i == 3) {
		int i_13_ = (i_0_ & 0xff) * 4;
		int i_14_ = (i_0_ >> 8 & 0xff) * 4;
		int i_15_ = (i_0_ >> 16 & 0xff) << 6;
		int i_16_ = (i_0_ >> 24 & 0xff) << 6;
		if (i_2_ - (i_13_ >> 1) < 0
		    || (i_2_ + (i_13_ >> 1) + class166.anInt2053 * 2039042417
			>= (class166.anInt2055 * 266270313
			    << class166.anInt2054 * -122333825))
		    || i_4_ - (i_14_ >> 1) < 0
		    || (i_4_ + (i_14_ >> 1) + class166.anInt2053 * 2039042417
			>= (class166.anInt2052 * -14610189
			    << class166.anInt2054 * -122333825)))
		    return;
		method2041(class166, i_2_, i_3_, i_4_, i_13_, i_14_, i_15_,
			   i_16_);
	    } else if (i == 4) {
		int i_17_ = (((Class89_Sub1) this).anInt9364
			     - ((Class89_Sub1) this).anInt9363);
		for (int i_18_ = 0; i_18_ < ((Class89_Sub1) this).anInt9325;
		     i_18_++)
		    ((Class89_Sub1) this).anIntArray9327[i_18_]
			= (((Class89_Sub1) this).anIntArray9327[i_18_]
			   + (class166_1_.method3550(((((Class89_Sub1) this)
						       .anIntArray9326[i_18_])
						      + i_2_),
						     ((((Class89_Sub1) this)
						       .anIntArray9360[i_18_])
						      + i_4_),
						     -79405567)
			      - i_3_)
			   + i_17_);
	    } else if (i == 5) {
		int i_19_ = (((Class89_Sub1) this).anInt9364
			     - ((Class89_Sub1) this).anInt9363);
		for (int i_20_ = 0; i_20_ < ((Class89_Sub1) this).anInt9325;
		     i_20_++) {
		    int i_21_
			= ((Class89_Sub1) this).anIntArray9326[i_20_] + i_2_;
		    int i_22_
			= ((Class89_Sub1) this).anIntArray9360[i_20_] + i_4_;
		    int i_23_ = class166.method3550(i_21_, i_22_, -1689373445);
		    int i_24_
			= class166_1_.method3550(i_21_, i_22_, 271945683);
		    int i_25_ = i_23_ - i_24_ - i_0_;
		    ((Class89_Sub1) this).anIntArray9327[i_20_]
			= (((((Class89_Sub1) this).anIntArray9327[i_20_] << 8)
			    / i_19_ * i_25_)
			   >> 8) - (i_3_ - i_23_);
		}
	    }
	    method15480();
	    ((Class89_Sub1) this).aBool9323 = false;
	}
    }
    
    Class89_Sub1(Class103_Sub3 class103_sub3, Class161 class161, int i,
		 int i_26_, int i_27_, int i_28_) {
	this(class103_sub3, i, i_28_, true, false);
	Class107 class107 = class103_sub3.aClass107_1458;
	int[] is = new int[class161.anInt1802];
	((Class89_Sub1) this).anIntArray9374 = new int[class161.anInt1805 + 1];
	for (int i_29_ = 0; i_29_ < class161.anInt1802; i_29_++) {
	    if (class161.aByteArray1808 == null
		|| class161.aByteArray1808[i_29_] != 2) {
		if (class161.aShortArray1792 != null
		    && class161.aShortArray1792[i_29_] != -1) {
		    Class101 class101
			= class107.method2680((class161.aShortArray1792[i_29_]
					       & 0xffff),
					      400281958);
		    if (((((Class89_Sub1) this).anInt9321 & 0x40) == 0
			 || !class101.aBool1434)
			&& class101.aBool1408)
			continue;
		}
		is[((Class89_Sub1) this).anInt9331++] = i_29_;
		((Class89_Sub1) this).anIntArray9374[(class161.aShortArray1818
						      [i_29_])]++;
		((Class89_Sub1) this).anIntArray9374[(class161.aShortArray1796
						      [i_29_])]++;
		((Class89_Sub1) this).anIntArray9374[(class161.aShortArray1804
						      [i_29_])]++;
	    }
	}
	((Class89_Sub1) this).anInt9342 = ((Class89_Sub1) this).anInt9331;
	long[] ls = new long[((Class89_Sub1) this).anInt9331];
	boolean bool = (((Class89_Sub1) this).anInt9367 & 0x100) != 0;
	for (int i_30_ = 0; i_30_ < ((Class89_Sub1) this).anInt9331; i_30_++) {
	    int i_31_ = is[i_30_];
	    Class101 class101 = null;
	    int i_32_ = 0;
	    int i_33_ = 0;
	    int i_34_ = 0;
	    int i_35_ = 0;
	    if (class161.aClass95Array1834 != null) {
		boolean bool_36_ = false;
		for (int i_37_ = 0; i_37_ < class161.aClass95Array1834.length;
		     i_37_++) {
		    Class95 class95 = class161.aClass95Array1834[i_37_];
		    if (i_31_ == class95.anInt1328 * 855950689) {
			Class332 class332
			    = Class279.method5466((class95.anInt1331
						   * 264591637),
						  -1486875526);
			if (class332.aBool5054)
			    bool_36_ = true;
			if (class332.anInt5051 * 73195809 != -1) {
			    Class101 class101_38_
				= class107.method2680((class332.anInt5051
						       * 73195809),
						      -2069485);
			    if (class101_38_.aClass529_1391
				== Class529.aClass529_6944)
				((Class89_Sub1) this).aBool9358 = true;
			}
		    }
		}
		if (bool_36_) {
		    ls[i_30_] = 9223372036854775807L;
		    ((Class89_Sub1) this).anInt9342--;
		    continue;
		}
	    }
	    if (class161.aClass106Array1832 != null) {
		boolean bool_39_ = false;
		for (int i_40_ = 0; i_40_ < class161.aClass106Array1832.length;
		     i_40_++) {
		    Class106 class106 = class161.aClass106Array1832[i_40_];
		    if (i_31_ == class106.anInt1489 * -143674399) {
			Class325 class325
			    = Class530.method11844((class106.anInt1494
						    * 357275585),
						   -660067450);
			if (class325.aBool4980)
			    bool_39_ = true;
		    }
		}
		if (bool_39_) {
		    ls[i_30_] = 9223372036854775807L;
		    ((Class89_Sub1) this).anInt9342--;
		    continue;
		}
	    }
	    int i_41_ = -1;
	    if (class161.aShortArray1792 != null) {
		i_41_ = class161.aShortArray1792[i_31_];
		if (i_41_ != -1) {
		    class101
			= class107.method2680(i_41_ & 0xffff, -2100785422);
		    if ((((Class89_Sub1) this).anInt9321 & 0x40) == 0
			|| !class101.aBool1434) {
			i_34_ = class101.aByte1427;
			i_35_ = class101.aByte1428;
		    } else {
			i_41_ = -1;
			class101 = null;
		    }
		}
	    }
	    boolean bool_42_
		= ((class161.aByteArray1793 != null
		    && class161.aByteArray1793[i_31_] != 0)
		   || (class101 != null
		       && class101.aClass529_1391 != Class529.aClass529_6942));
	    if ((bool || bool_42_) && class161.aByteArray1809 != null)
		i_32_ += class161.aByteArray1809[i_31_] << 17;
	    if (bool_42_)
		i_32_ += 65536;
	    i_32_ += (i_34_ & 0xff) << 8;
	    i_32_ += i_35_ & 0xff;
	    i_33_ += (i_41_ & 0xffff) << 16;
	    i_33_ += i_30_ & 0xffff;
	    ls[i_30_] = ((long) i_32_ << 32) + (long) i_33_;
	    ((Class89_Sub1) this).aBool9358 |= bool_42_;
	    Class89_Sub1 class89_sub1_43_ = this;
	    ((Class89_Sub1) class89_sub1_43_).aBool9369
		= (((Class89_Sub1) class89_sub1_43_).aBool9369
		   | (class101 != null && (class101.aByte1376 != 0
					   || class101.aByte1396 != 0)));
	}
	Class46.method1125(ls, is, (byte) 0);
	((Class89_Sub1) this).anInt9324 = class161.anInt1790;
	((Class89_Sub1) this).anInt9325 = class161.anInt1805;
	((Class89_Sub1) this).anIntArray9326 = class161.anIntArray1831;
	((Class89_Sub1) this).anIntArray9327 = class161.anIntArray1791;
	((Class89_Sub1) this).anIntArray9360 = class161.anIntArray1816;
	((Class89_Sub1) this).aShortArray9330 = class161.aShortArray1797;
	Class313[] class313s = new Class313[((Class89_Sub1) this).anInt9325];
	((Class89_Sub1) this).aClass106Array9376 = class161.aClass106Array1832;
	((Class89_Sub1) this).aClass167Array9377 = class161.aClass167Array1833;
	if (class161.aClass95Array1834 != null) {
	    ((Class89_Sub1) this).anInt9375
		= class161.aClass95Array1834.length;
	    ((Class89_Sub1) this).aClass315Array9333
		= new Class315[((Class89_Sub1) this).anInt9375];
	    ((Class89_Sub1) this).aClass381Array9379
		= new Class381[((Class89_Sub1) this).anInt9375];
	    for (int i_44_ = 0; i_44_ < ((Class89_Sub1) this).anInt9375;
		 i_44_++) {
		Class95 class95 = class161.aClass95Array1834[i_44_];
		Class332 class332
		    = Class279.method5466(class95.anInt1331 * 264591637,
					  -1105514992);
		int i_45_ = -1;
		for (int i_46_ = 0; i_46_ < ((Class89_Sub1) this).anInt9331;
		     i_46_++) {
		    if (is[i_46_] == class95.anInt1328 * 855950689) {
			i_45_ = i_46_;
			break;
		    }
		}
		if (i_45_ == -1)
		    throw new RuntimeException();
		int i_47_ = ((Class474.anIntArray6383
			      [(class161.aShortArray1812
				[class95.anInt1328 * 855950689]) & 0xffff])
			     & 0xffffff);
		i_47_ = i_47_ | 255 - (class161.aByteArray1793 != null
				       ? (class161.aByteArray1793
					  [class95.anInt1328 * 855950689])
				       : 0) << 24;
		((Class89_Sub1) this).aClass315Array9333[i_44_]
		    = new Class315(i_45_,
				   (class161.aShortArray1818
				    [class95.anInt1328 * 855950689]),
				   (class161.aShortArray1796
				    [class95.anInt1328 * 855950689]),
				   (class161.aShortArray1804
				    [class95.anInt1328 * 855950689]),
				   class332.anInt5052 * 1125026619,
				   class332.anInt5053 * 710944347,
				   class332.anInt5051 * 73195809,
				   class332.anInt5055 * -984464111,
				   class332.anInt5057 * -1886928841,
				   class332.aBool5054, class332.aBool5056,
				   class95.anInt1329 * -933656211);
		((Class89_Sub1) this).aClass381Array9379[i_44_]
		    = new Class381(i_47_);
	    }
	}
	int i_48_ = ((Class89_Sub1) this).anInt9331 * 3;
	((Class89_Sub1) this).aShortArray9350 = new short[i_48_];
	((Class89_Sub1) this).aShortArray9355 = new short[i_48_];
	((Class89_Sub1) this).aShortArray9334 = new short[i_48_];
	((Class89_Sub1) this).aShortArray9335 = new short[i_48_];
	((Class89_Sub1) this).aShortArray9371 = new short[i_48_];
	((Class89_Sub1) this).aByteArray9362 = new byte[i_48_];
	((Class89_Sub1) this).aFloatArray9338 = new float[i_48_];
	((Class89_Sub1) this).aFloatArray9339 = new float[i_48_];
	((Class89_Sub1) this).aShortArray9361
	    = new short[((Class89_Sub1) this).anInt9331];
	((Class89_Sub1) this).aByteArray9344
	    = new byte[((Class89_Sub1) this).anInt9331];
	((Class89_Sub1) this).aShortArray9345
	    = new short[((Class89_Sub1) this).anInt9331];
	((Class89_Sub1) this).aShortArray9346
	    = new short[((Class89_Sub1) this).anInt9331];
	((Class89_Sub1) this).aShortArray9368
	    = new short[((Class89_Sub1) this).anInt9331];
	((Class89_Sub1) this).aShortArray9348
	    = new short[((Class89_Sub1) this).anInt9331];
	if (class161.aShortArray1810 != null)
	    ((Class89_Sub1) this).aShortArray9320
		= new short[((Class89_Sub1) this).anInt9331];
	((Class89_Sub1) this).aShort9322 = (short) i_26_;
	((Class89_Sub1) this).aShort9383 = (short) i_27_;
	((Class89_Sub1) this).aShortArray9328 = new short[i_48_];
	((Class89_Sub1) this).aLongArray9372 = new long[i_48_];
	int i_49_ = 0;
	for (int i_50_ = 0; i_50_ < class161.anInt1805; i_50_++) {
	    int i_51_ = ((Class89_Sub1) this).anIntArray9374[i_50_];
	    ((Class89_Sub1) this).anIntArray9374[i_50_] = i_49_;
	    i_49_ += i_51_;
	    class313s[i_50_] = new Class313();
	}
	((Class89_Sub1) this).anIntArray9374[class161.anInt1805] = i_49_;
	Class100 class100
	    = method1896(class161, is, ((Class89_Sub1) this).anInt9331);
	Class389[] class389s = new Class389[class161.anInt1802];
	for (int i_52_ = 0; i_52_ < class161.anInt1802; i_52_++) {
	    short i_53_ = class161.aShortArray1818[i_52_];
	    short i_54_ = class161.aShortArray1796[i_52_];
	    short i_55_ = class161.aShortArray1804[i_52_];
	    int i_56_ = (((Class89_Sub1) this).anIntArray9326[i_54_]
			 - ((Class89_Sub1) this).anIntArray9326[i_53_]);
	    int i_57_ = (((Class89_Sub1) this).anIntArray9327[i_54_]
			 - ((Class89_Sub1) this).anIntArray9327[i_53_]);
	    int i_58_ = (((Class89_Sub1) this).anIntArray9360[i_54_]
			 - ((Class89_Sub1) this).anIntArray9360[i_53_]);
	    int i_59_ = (((Class89_Sub1) this).anIntArray9326[i_55_]
			 - ((Class89_Sub1) this).anIntArray9326[i_53_]);
	    int i_60_ = (((Class89_Sub1) this).anIntArray9327[i_55_]
			 - ((Class89_Sub1) this).anIntArray9327[i_53_]);
	    int i_61_ = (((Class89_Sub1) this).anIntArray9360[i_55_]
			 - ((Class89_Sub1) this).anIntArray9360[i_53_]);
	    int i_62_ = i_57_ * i_61_ - i_60_ * i_58_;
	    int i_63_ = i_58_ * i_59_ - i_61_ * i_56_;
	    int i_64_;
	    for (i_64_ = i_56_ * i_60_ - i_59_ * i_57_;
		 (i_62_ > 8192 || i_63_ > 8192 || i_64_ > 8192 || i_62_ < -8192
		  || i_63_ < -8192 || i_64_ < -8192);
		 i_64_ >>= 1) {
		i_62_ >>= 1;
		i_63_ >>= 1;
	    }
	    int i_65_ = (int) Math.sqrt((double) (i_62_ * i_62_ + i_63_ * i_63_
						  + i_64_ * i_64_));
	    if (i_65_ <= 0)
		i_65_ = 1;
	    i_62_ = i_62_ * 256 / i_65_;
	    i_63_ = i_63_ * 256 / i_65_;
	    i_64_ = i_64_ * 256 / i_65_;
	    byte i_66_ = (class161.aByteArray1808 == null ? (byte) 0
			  : class161.aByteArray1808[i_52_]);
	    if (i_66_ == 0) {
		Class313 class313 = class313s[i_53_];
		((Class313) class313).anInt4834 += i_62_;
		((Class313) class313).anInt4833 += i_63_;
		((Class313) class313).anInt4832 += i_64_;
		((Class313) class313).anInt4835++;
		class313 = class313s[i_54_];
		((Class313) class313).anInt4834 += i_62_;
		((Class313) class313).anInt4833 += i_63_;
		((Class313) class313).anInt4832 += i_64_;
		((Class313) class313).anInt4835++;
		class313 = class313s[i_55_];
		((Class313) class313).anInt4834 += i_62_;
		((Class313) class313).anInt4833 += i_63_;
		((Class313) class313).anInt4832 += i_64_;
		((Class313) class313).anInt4835++;
	    } else if (i_66_ == 1) {
		Class389 class389 = class389s[i_52_] = new Class389();
		((Class389) class389).anInt5720 = i_62_;
		((Class389) class389).anInt5719 = i_63_;
		((Class389) class389).anInt5721 = i_64_;
	    }
	}
	for (int i_67_ = 0; i_67_ < ((Class89_Sub1) this).anInt9331; i_67_++) {
	    int i_68_ = is[i_67_];
	    int i_69_ = class161.aShortArray1812[i_68_] & 0xffff;
	    int i_70_ = (class161.aByteArray1793 != null
			 ? class161.aByteArray1793[i_68_] & 0xff : 0);
	    short i_71_ = (class161.aShortArray1792 == null ? (short) -1
			   : class161.aShortArray1792[i_68_]);
	    if (i_71_ != -1 && (((Class89_Sub1) this).anInt9321 & 0x40) != 0
		&& class107.method2680(i_71_, -922030423).aBool1434)
		i_71_ = (short) -1;
	    float f = 0.0F;
	    float f_72_ = 0.0F;
	    float f_73_ = 0.0F;
	    float f_74_ = 0.0F;
	    float f_75_ = 0.0F;
	    float f_76_ = 0.0F;
	    long l;
	    long l_77_;
	    long l_78_;
	    if (i_71_ != -1) {
		int i_79_ = (class161.aShortArray1811 != null
			     ? class161.aShortArray1811[i_68_] : -1);
		if (i_79_ == 32766) {
		    int i_80_ = class161.aByteArray1803[i_68_] & 0xff;
		    int i_81_ = class161.aByteArray1794[i_68_] & 0xff;
		    int i_82_ = class161.aByteArray1807[i_68_] & 0xff;
		    i_80_ += (class161.anIntArray1795
			      [class161.aShortArray1818[i_68_]]);
		    l_78_ = (long) i_80_;
		    i_81_ += (class161.anIntArray1795
			      [class161.aShortArray1796[i_68_]]);
		    l_77_ = (long) i_80_;
		    i_82_ += (class161.anIntArray1795
			      [class161.aShortArray1804[i_68_]]);
		    l = (long) i_80_;
		    f = class161.aFloatArray1787[i_80_];
		    f_72_ = class161.aFloatArray1800[i_80_];
		    f_73_ = class161.aFloatArray1787[i_81_];
		    f_74_ = class161.aFloatArray1800[i_81_];
		    f_75_ = class161.aFloatArray1787[i_82_];
		    f_76_ = class161.aFloatArray1800[i_82_];
		} else if (i_79_ == -1) {
		    f = 0.0F;
		    f_72_ = 1.0F;
		    l_78_ = 65535L;
		    f_73_ = 1.0F;
		    f_74_ = 1.0F;
		    l_77_ = 131071L;
		    f_75_ = 0.0F;
		    f_76_ = 0.0F;
		    l = 196607L;
		} else {
		    i_79_ &= 0xffff;
		    int i_83_ = 0;
		    int i_84_ = 0;
		    int i_85_ = 0;
		    byte i_86_ = class161.aByteArray1820[i_79_];
		    if (i_86_ == 0) {
			short i_87_ = class161.aShortArray1818[i_68_];
			short i_88_ = class161.aShortArray1796[i_68_];
			short i_89_ = class161.aShortArray1804[i_68_];
			short i_90_ = class161.aShortArray1821[i_79_];
			short i_91_ = class161.aShortArray1822[i_79_];
			short i_92_ = class161.aShortArray1823[i_79_];
			float f_93_ = (float) class161.anIntArray1831[i_90_];
			float f_94_ = (float) class161.anIntArray1791[i_90_];
			float f_95_ = (float) class161.anIntArray1816[i_90_];
			float f_96_
			    = (float) class161.anIntArray1831[i_91_] - f_93_;
			float f_97_
			    = (float) class161.anIntArray1791[i_91_] - f_94_;
			float f_98_
			    = (float) class161.anIntArray1816[i_91_] - f_95_;
			float f_99_
			    = (float) class161.anIntArray1831[i_92_] - f_93_;
			float f_100_
			    = (float) class161.anIntArray1791[i_92_] - f_94_;
			float f_101_
			    = (float) class161.anIntArray1816[i_92_] - f_95_;
			float f_102_
			    = (float) class161.anIntArray1831[i_87_] - f_93_;
			float f_103_
			    = (float) class161.anIntArray1791[i_87_] - f_94_;
			float f_104_
			    = (float) class161.anIntArray1816[i_87_] - f_95_;
			float f_105_
			    = (float) class161.anIntArray1831[i_88_] - f_93_;
			float f_106_
			    = (float) class161.anIntArray1791[i_88_] - f_94_;
			float f_107_
			    = (float) class161.anIntArray1816[i_88_] - f_95_;
			float f_108_
			    = (float) class161.anIntArray1831[i_89_] - f_93_;
			float f_109_
			    = (float) class161.anIntArray1791[i_89_] - f_94_;
			float f_110_
			    = (float) class161.anIntArray1816[i_89_] - f_95_;
			float f_111_ = f_97_ * f_101_ - f_98_ * f_100_;
			float f_112_ = f_98_ * f_99_ - f_96_ * f_101_;
			float f_113_ = f_96_ * f_100_ - f_97_ * f_99_;
			float f_114_ = f_100_ * f_113_ - f_101_ * f_112_;
			float f_115_ = f_101_ * f_111_ - f_99_ * f_113_;
			float f_116_ = f_99_ * f_112_ - f_100_ * f_111_;
			float f_117_ = 1.0F / (f_114_ * f_96_ + f_115_ * f_97_
					       + f_116_ * f_98_);
			f = (f_114_ * f_102_ + f_115_ * f_103_
			     + f_116_ * f_104_) * f_117_;
			f_73_ = (f_114_ * f_105_ + f_115_ * f_106_
				 + f_116_ * f_107_) * f_117_;
			f_75_ = (f_114_ * f_108_ + f_115_ * f_109_
				 + f_116_ * f_110_) * f_117_;
			f_114_ = f_97_ * f_113_ - f_98_ * f_112_;
			f_115_ = f_98_ * f_111_ - f_96_ * f_113_;
			f_116_ = f_96_ * f_112_ - f_97_ * f_111_;
			f_117_ = 1.0F / (f_114_ * f_99_ + f_115_ * f_100_
					 + f_116_ * f_101_);
			f_72_ = (f_114_ * f_102_ + f_115_ * f_103_
				 + f_116_ * f_104_) * f_117_;
			f_74_ = (f_114_ * f_105_ + f_115_ * f_106_
				 + f_116_ * f_107_) * f_117_;
			f_76_ = (f_114_ * f_108_ + f_115_ * f_109_
				 + f_116_ * f_110_) * f_117_;
		    } else {
			short i_118_ = class161.aShortArray1818[i_68_];
			short i_119_ = class161.aShortArray1796[i_68_];
			short i_120_ = class161.aShortArray1804[i_68_];
			int i_121_ = class100.anIntArray1365[i_79_];
			int i_122_ = class100.anIntArray1363[i_79_];
			int i_123_ = class100.anIntArray1364[i_79_];
			float[] fs = class100.aFloatArrayArray1366[i_79_];
			byte i_124_ = class161.aByteArray1827[i_79_];
			float f_125_
			    = (float) class161.anIntArray1813[i_79_] / 256.0F;
			if (i_86_ == 1) {
			    float f_126_
				= ((float) class161.anIntArray1826[i_79_]
				   / 1024.0F);
			    method1859(class161.anIntArray1831[i_118_],
				       class161.anIntArray1791[i_118_],
				       class161.anIntArray1816[i_118_], i_121_,
				       i_122_, i_123_, fs, f_126_, i_124_,
				       f_125_,
				       ((Class89_Sub1) this).aFloatArray9356);
			    f = ((Class89_Sub1) this).aFloatArray9356[0];
			    f_72_ = ((Class89_Sub1) this).aFloatArray9356[1];
			    method1859(class161.anIntArray1831[i_119_],
				       class161.anIntArray1791[i_119_],
				       class161.anIntArray1816[i_119_], i_121_,
				       i_122_, i_123_, fs, f_126_, i_124_,
				       f_125_,
				       ((Class89_Sub1) this).aFloatArray9356);
			    f_73_ = ((Class89_Sub1) this).aFloatArray9356[0];
			    f_74_ = ((Class89_Sub1) this).aFloatArray9356[1];
			    method1859(class161.anIntArray1831[i_120_],
				       class161.anIntArray1791[i_120_],
				       class161.anIntArray1816[i_120_], i_121_,
				       i_122_, i_123_, fs, f_126_, i_124_,
				       f_125_,
				       ((Class89_Sub1) this).aFloatArray9356);
			    f_75_ = ((Class89_Sub1) this).aFloatArray9356[0];
			    f_76_ = ((Class89_Sub1) this).aFloatArray9356[1];
			    float f_127_ = f_126_ / 2.0F;
			    if ((i_124_ & 0x1) == 0) {
				if (f_73_ - f > f_127_) {
				    f_73_ -= f_126_;
				    i_84_ = 1;
				} else if (f - f_73_ > f_127_) {
				    f_73_ += f_126_;
				    i_84_ = 2;
				}
				if (f_75_ - f > f_127_) {
				    f_75_ -= f_126_;
				    i_85_ = 1;
				} else if (f - f_75_ > f_127_) {
				    f_75_ += f_126_;
				    i_85_ = 2;
				}
			    } else {
				if (f_74_ - f_72_ > f_127_) {
				    f_74_ -= f_126_;
				    i_84_ = 1;
				} else if (f_72_ - f_74_ > f_127_) {
				    f_74_ += f_126_;
				    i_84_ = 2;
				}
				if (f_76_ - f_72_ > f_127_) {
				    f_76_ -= f_126_;
				    i_85_ = 1;
				} else if (f_72_ - f_76_ > f_127_) {
				    f_76_ += f_126_;
				    i_85_ = 2;
				}
			    }
			} else if (i_86_ == 2) {
			    float f_128_
				= ((float) class161.anIntArray1828[i_79_]
				   / 256.0F);
			    float f_129_
				= ((float) class161.anIntArray1806[i_79_]
				   / 256.0F);
			    int i_130_ = (class161.anIntArray1831[i_119_]
					  - class161.anIntArray1831[i_118_]);
			    int i_131_ = (class161.anIntArray1791[i_119_]
					  - class161.anIntArray1791[i_118_]);
			    int i_132_ = (class161.anIntArray1816[i_119_]
					  - class161.anIntArray1816[i_118_]);
			    int i_133_ = (class161.anIntArray1831[i_120_]
					  - class161.anIntArray1831[i_118_]);
			    int i_134_ = (class161.anIntArray1791[i_120_]
					  - class161.anIntArray1791[i_118_]);
			    int i_135_ = (class161.anIntArray1816[i_120_]
					  - class161.anIntArray1816[i_118_]);
			    int i_136_ = i_131_ * i_135_ - i_134_ * i_132_;
			    int i_137_ = i_132_ * i_133_ - i_135_ * i_130_;
			    int i_138_ = i_130_ * i_134_ - i_133_ * i_131_;
			    float f_139_
				= (64.0F
				   / (float) class161.anIntArray1824[i_79_]);
			    float f_140_
				= (64.0F
				   / (float) class161.anIntArray1825[i_79_]);
			    float f_141_
				= (64.0F
				   / (float) class161.anIntArray1826[i_79_]);
			    float f_142_ = (((float) i_136_ * fs[0]
					     + (float) i_137_ * fs[1]
					     + (float) i_138_ * fs[2])
					    / f_139_);
			    float f_143_ = (((float) i_136_ * fs[3]
					     + (float) i_137_ * fs[4]
					     + (float) i_138_ * fs[5])
					    / f_140_);
			    float f_144_ = (((float) i_136_ * fs[6]
					     + (float) i_137_ * fs[7]
					     + (float) i_138_ * fs[8])
					    / f_141_);
			    i_83_ = method1860(f_142_, f_143_, f_144_);
			    method1861(class161.anIntArray1831[i_118_],
				       class161.anIntArray1791[i_118_],
				       class161.anIntArray1816[i_118_], i_121_,
				       i_122_, i_123_, i_83_, fs, i_124_,
				       f_125_, f_128_, f_129_,
				       ((Class89_Sub1) this).aFloatArray9356);
			    f = ((Class89_Sub1) this).aFloatArray9356[0];
			    f_72_ = ((Class89_Sub1) this).aFloatArray9356[1];
			    method1861(class161.anIntArray1831[i_119_],
				       class161.anIntArray1791[i_119_],
				       class161.anIntArray1816[i_119_], i_121_,
				       i_122_, i_123_, i_83_, fs, i_124_,
				       f_125_, f_128_, f_129_,
				       ((Class89_Sub1) this).aFloatArray9356);
			    f_73_ = ((Class89_Sub1) this).aFloatArray9356[0];
			    f_74_ = ((Class89_Sub1) this).aFloatArray9356[1];
			    method1861(class161.anIntArray1831[i_120_],
				       class161.anIntArray1791[i_120_],
				       class161.anIntArray1816[i_120_], i_121_,
				       i_122_, i_123_, i_83_, fs, i_124_,
				       f_125_, f_128_, f_129_,
				       ((Class89_Sub1) this).aFloatArray9356);
			    f_75_ = ((Class89_Sub1) this).aFloatArray9356[0];
			    f_76_ = ((Class89_Sub1) this).aFloatArray9356[1];
			} else if (i_86_ == 3) {
			    method1858(class161.anIntArray1831[i_118_],
				       class161.anIntArray1791[i_118_],
				       class161.anIntArray1816[i_118_], i_121_,
				       i_122_, i_123_, fs, i_124_, f_125_,
				       ((Class89_Sub1) this).aFloatArray9356);
			    f = ((Class89_Sub1) this).aFloatArray9356[0];
			    f_72_ = ((Class89_Sub1) this).aFloatArray9356[1];
			    method1858(class161.anIntArray1831[i_119_],
				       class161.anIntArray1791[i_119_],
				       class161.anIntArray1816[i_119_], i_121_,
				       i_122_, i_123_, fs, i_124_, f_125_,
				       ((Class89_Sub1) this).aFloatArray9356);
			    f_73_ = ((Class89_Sub1) this).aFloatArray9356[0];
			    f_74_ = ((Class89_Sub1) this).aFloatArray9356[1];
			    method1858(class161.anIntArray1831[i_120_],
				       class161.anIntArray1791[i_120_],
				       class161.anIntArray1816[i_120_], i_121_,
				       i_122_, i_123_, fs, i_124_, f_125_,
				       ((Class89_Sub1) this).aFloatArray9356);
			    f_75_ = ((Class89_Sub1) this).aFloatArray9356[0];
			    f_76_ = ((Class89_Sub1) this).aFloatArray9356[1];
			    if ((i_124_ & 0x1) == 0) {
				if (f_73_ - f > 0.5F) {
				    f_73_--;
				    i_84_ = 1;
				} else if (f - f_73_ > 0.5F) {
				    f_73_++;
				    i_84_ = 2;
				}
				if (f_75_ - f > 0.5F) {
				    f_75_--;
				    i_85_ = 1;
				} else if (f - f_75_ > 0.5F) {
				    f_75_++;
				    i_85_ = 2;
				}
			    } else {
				if (f_74_ - f_72_ > 0.5F) {
				    f_74_--;
				    i_84_ = 1;
				} else if (f_72_ - f_74_ > 0.5F) {
				    f_74_++;
				    i_84_ = 2;
				}
				if (f_76_ - f_72_ > 0.5F) {
				    f_76_--;
				    i_85_ = 1;
				} else if (f_72_ - f_76_ > 0.5F) {
				    f_76_++;
				    i_85_ = 2;
				}
			    }
			}
		    }
		    l_78_ = (long) (i_83_ << 16 | i_79_);
		    l_77_ = (long) (i_84_ << 19) | l_78_;
		    l = (long) (i_85_ << 19) | l_78_;
		}
	    } else {
		l = 0L;
		l_77_ = 0L;
		l_78_ = 0L;
	    }
	    byte i_145_ = (class161.aByteArray1808 != null
			   ? class161.aByteArray1808[i_68_] : (byte) 0);
	    if (i_145_ == 0) {
		long l_146_ = (long) ((i_69_ << 8) + i_70_);
		short i_147_ = class161.aShortArray1818[i_68_];
		short i_148_ = class161.aShortArray1796[i_68_];
		short i_149_ = class161.aShortArray1804[i_68_];
		Class313 class313 = class313s[i_147_];
		((Class89_Sub1) this).aShortArray9345[i_67_]
		    = method15465(class161, i_147_, i_67_,
				  l_146_ | l_78_ << 24,
				  ((Class313) class313).anInt4834,
				  ((Class313) class313).anInt4833,
				  ((Class313) class313).anInt4832,
				  ((Class313) class313).anInt4835, f, f_72_);
		class313 = class313s[i_148_];
		((Class89_Sub1) this).aShortArray9346[i_67_]
		    = method15465(class161, i_148_, i_67_,
				  l_146_ | l_77_ << 24,
				  ((Class313) class313).anInt4834,
				  ((Class313) class313).anInt4833,
				  ((Class313) class313).anInt4832,
				  ((Class313) class313).anInt4835, f_73_,
				  f_74_);
		class313 = class313s[i_149_];
		((Class89_Sub1) this).aShortArray9368[i_67_]
		    = method15465(class161, i_149_, i_67_, l_146_ | l << 24,
				  ((Class313) class313).anInt4834,
				  ((Class313) class313).anInt4833,
				  ((Class313) class313).anInt4832,
				  ((Class313) class313).anInt4835, f_75_,
				  f_76_);
	    } else if (i_145_ == 1) {
		Class389 class389 = class389s[i_68_];
		long l_150_
		    = (((long) (((Class389) class389).anInt5720 & ~0x7fffffff)
			<< 9)
		       + ((long) (((Class389) class389).anInt5719 + 256) << 32)
		       + ((long) (((Class389) class389).anInt5721 + 256) << 24)
		       + (long) (i_69_ << 8) + (long) i_70_);
		((Class89_Sub1) this).aShortArray9345[i_67_]
		    = method15465(class161, class161.aShortArray1818[i_68_],
				  i_67_, l_150_ | l_78_ << 41,
				  ((Class389) class389).anInt5720,
				  ((Class389) class389).anInt5719,
				  ((Class389) class389).anInt5721, 0, f,
				  f_72_);
		((Class89_Sub1) this).aShortArray9346[i_67_]
		    = method15465(class161, class161.aShortArray1796[i_68_],
				  i_67_, l_150_ | l_78_ << 41,
				  ((Class389) class389).anInt5720,
				  ((Class389) class389).anInt5719,
				  ((Class389) class389).anInt5721, 0, f_73_,
				  f_74_);
		((Class89_Sub1) this).aShortArray9368[i_67_]
		    = method15465(class161, class161.aShortArray1804[i_68_],
				  i_67_, l_150_ | l_78_ << 41,
				  ((Class389) class389).anInt5720,
				  ((Class389) class389).anInt5719,
				  ((Class389) class389).anInt5721, 0, f_75_,
				  f_76_);
	    }
	    if (class161.aByteArray1793 != null)
		((Class89_Sub1) this).aByteArray9344[i_67_]
		    = class161.aByteArray1793[i_68_];
	    if (class161.aShortArray1810 != null)
		((Class89_Sub1) this).aShortArray9320[i_67_]
		    = class161.aShortArray1810[i_68_];
	    ((Class89_Sub1) this).aShortArray9361[i_67_]
		= class161.aShortArray1812[i_68_];
	    ((Class89_Sub1) this).aShortArray9348[i_67_] = i_71_;
	}
	if (((Class89_Sub1) this).anInt9342 > 0) {
	    int i_151_ = 1;
	    short i_152_ = ((Class89_Sub1) this).aShortArray9348[0];
	    for (int i_153_ = 0; i_153_ < ((Class89_Sub1) this).anInt9342;
		 i_153_++) {
		short i_154_ = ((Class89_Sub1) this).aShortArray9348[i_153_];
		if (i_154_ != i_152_) {
		    i_151_++;
		    i_152_ = i_154_;
		}
	    }
	    ((Class89_Sub1) this).anIntArray9386 = new int[i_151_];
	    ((Class89_Sub1) this).anIntArray9373 = new int[i_151_];
	    ((Class89_Sub1) this).anIntArray9347 = new int[i_151_ + 1];
	    ((Class89_Sub1) this).anIntArray9347[0] = 0;
	    int i_155_ = ((Class89_Sub1) this).anInt9378;
	    int i_156_ = 0;
	    i_151_ = 0;
	    i_152_ = ((Class89_Sub1) this).aShortArray9348[0];
	    for (int i_157_ = 0; i_157_ < ((Class89_Sub1) this).anInt9342;
		 i_157_++) {
		short i_158_ = ((Class89_Sub1) this).aShortArray9348[i_157_];
		if (i_158_ != i_152_) {
		    ((Class89_Sub1) this).anIntArray9386[i_151_] = i_155_;
		    ((Class89_Sub1) this).anIntArray9373[i_151_]
			= i_156_ - i_155_ + 1;
		    ((Class89_Sub1) this).anIntArray9347[++i_151_] = i_157_;
		    i_155_ = ((Class89_Sub1) this).anInt9378;
		    i_156_ = 0;
		    i_152_ = i_158_;
		}
		int i_159_
		    = ((Class89_Sub1) this).aShortArray9345[i_157_] & 0xffff;
		if (i_159_ < i_155_)
		    i_155_ = i_159_;
		if (i_159_ > i_156_)
		    i_156_ = i_159_;
		i_159_
		    = ((Class89_Sub1) this).aShortArray9346[i_157_] & 0xffff;
		if (i_159_ < i_155_)
		    i_155_ = i_159_;
		if (i_159_ > i_156_)
		    i_156_ = i_159_;
		i_159_
		    = ((Class89_Sub1) this).aShortArray9368[i_157_] & 0xffff;
		if (i_159_ < i_155_)
		    i_155_ = i_159_;
		if (i_159_ > i_156_)
		    i_156_ = i_159_;
	    }
	    ((Class89_Sub1) this).anIntArray9386[i_151_] = i_155_;
	    ((Class89_Sub1) this).anIntArray9373[i_151_] = i_156_ - i_155_ + 1;
	    ((Class89_Sub1) this).anIntArray9347[++i_151_]
		= ((Class89_Sub1) this).anInt9342;
	}
	((Class89_Sub1) this).aLongArray9372 = null;
	((Class89_Sub1) this).aShortArray9350
	    = method15494(((Class89_Sub1) this).aShortArray9350,
			  ((Class89_Sub1) this).anInt9378);
	((Class89_Sub1) this).aShortArray9355
	    = method15494(((Class89_Sub1) this).aShortArray9355,
			  ((Class89_Sub1) this).anInt9378);
	((Class89_Sub1) this).aShortArray9334
	    = method15494(((Class89_Sub1) this).aShortArray9334,
			  ((Class89_Sub1) this).anInt9378);
	((Class89_Sub1) this).aShortArray9335
	    = method15494(((Class89_Sub1) this).aShortArray9335,
			  ((Class89_Sub1) this).anInt9378);
	((Class89_Sub1) this).aShortArray9371
	    = method15494(((Class89_Sub1) this).aShortArray9371,
			  ((Class89_Sub1) this).anInt9378);
	((Class89_Sub1) this).aByteArray9362
	    = method15466(((Class89_Sub1) this).aByteArray9362,
			  ((Class89_Sub1) this).anInt9378);
	((Class89_Sub1) this).aFloatArray9338
	    = method15484(((Class89_Sub1) this).aFloatArray9338,
			  ((Class89_Sub1) this).anInt9378);
	((Class89_Sub1) this).aFloatArray9339
	    = method15484(((Class89_Sub1) this).aFloatArray9339,
			  ((Class89_Sub1) this).anInt9378);
	if (class161.anIntArray1799 != null
	    && Class377.method6757(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) this).anIntArrayArray9329
		= class161.method3455(false);
	if (class161.aClass95Array1834 != null
	    && Class377.method6758(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) this).anIntArrayArray9381 = class161.method3477();
	if (class161.anIntArray1814 != null
	    && Class377.method6756(i, ((Class89_Sub1) this).anInt9321)) {
	    int i_160_ = 0;
	    int[] is_161_ = new int[256];
	    for (int i_162_ = 0; i_162_ < ((Class89_Sub1) this).anInt9331;
		 i_162_++) {
		int i_163_ = class161.anIntArray1814[is[i_162_]];
		if (i_163_ >= 0) {
		    is_161_[i_163_]++;
		    if (i_163_ > i_160_)
			i_160_ = i_163_;
		}
	    }
	    ((Class89_Sub1) this).anIntArrayArray9337 = new int[i_160_ + 1][];
	    for (int i_164_ = 0; i_164_ <= i_160_; i_164_++) {
		((Class89_Sub1) this).anIntArrayArray9337[i_164_]
		    = new int[is_161_[i_164_]];
		is_161_[i_164_] = 0;
	    }
	    for (int i_165_ = 0; i_165_ < ((Class89_Sub1) this).anInt9331;
		 i_165_++) {
		int i_166_ = class161.anIntArray1814[is[i_165_]];
		if (i_166_ >= 0)
		    ((Class89_Sub1) this).anIntArrayArray9337[i_166_]
			[is_161_[i_166_]++]
			= i_165_;
	    }
	}
    }
    
    short method15465(Class161 class161, int i, int i_167_, long l, int i_168_,
		      int i_169_, int i_170_, int i_171_, float f,
		      float f_172_) {
	int i_173_ = ((Class89_Sub1) this).anIntArray9374[i];
	int i_174_ = ((Class89_Sub1) this).anIntArray9374[i + 1];
	int i_175_ = 0;
	for (int i_176_ = i_173_; i_176_ < i_174_; i_176_++) {
	    if (((Class89_Sub1) this).aShortArray9328[i_176_] == 0) {
		i_175_ = i_176_;
		break;
	    }
	    int i_177_
		= (((Class89_Sub1) this).aShortArray9328[i_176_] & 0xffff) - 1;
	    if (((Class89_Sub1) this).aLongArray9372[i_176_] == l)
		return (short) i_177_;
	}
	((Class89_Sub1) this).aShortArray9328[i_175_]
	    = (short) (((Class89_Sub1) this).anInt9378 + 1);
	((Class89_Sub1) this).aLongArray9372[i_175_] = l;
	((Class89_Sub1) this).aShortArray9355[((Class89_Sub1) this).anInt9378]
	    = (short) i_167_;
	((Class89_Sub1) this).aShortArray9350[((Class89_Sub1) this).anInt9378]
	    = (short) i;
	((Class89_Sub1) this).aShortArray9334[((Class89_Sub1) this).anInt9378]
	    = (short) i_168_;
	((Class89_Sub1) this).aShortArray9335[((Class89_Sub1) this).anInt9378]
	    = (short) i_169_;
	((Class89_Sub1) this).aShortArray9371[((Class89_Sub1) this).anInt9378]
	    = (short) i_170_;
	((Class89_Sub1) this).aByteArray9362[((Class89_Sub1) this).anInt9378]
	    = (byte) i_171_;
	((Class89_Sub1) this).aFloatArray9338[((Class89_Sub1) this).anInt9378]
	    = f;
	((Class89_Sub1) this).aFloatArray9339[((Class89_Sub1) this).anInt9378]
	    = f_172_;
	return (short) ((Class89_Sub1) this).anInt9378++;
    }
    
    static byte[] method15466(byte[] is, int i) {
	byte[] is_178_ = new byte[i];
	System.arraycopy(is, 0, is_178_, 0, i);
	return is_178_;
    }
    
    public int method1900() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9380;
    }
    
    public int method1906() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9366;
    }
    
    public int method1866() {
	return ((Class89_Sub1) this).anInt9367;
    }
    
    public void method1920(Class89 class89, int i, int i_179_, int i_180_,
			   boolean bool) {
	Class89_Sub1 class89_sub1_181_ = (Class89_Sub1) class89;
	if (((Class89_Sub1) this).anInt9331 != 0
	    && ((Class89_Sub1) class89_sub1_181_).anInt9331 != 0) {
	    int i_182_ = ((Class89_Sub1) class89_sub1_181_).anInt9325;
	    int[] is = ((Class89_Sub1) class89_sub1_181_).anIntArray9326;
	    int[] is_183_ = ((Class89_Sub1) class89_sub1_181_).anIntArray9327;
	    int[] is_184_ = ((Class89_Sub1) class89_sub1_181_).anIntArray9360;
	    short[] is_185_
		= ((Class89_Sub1) class89_sub1_181_).aShortArray9334;
	    short[] is_186_
		= ((Class89_Sub1) class89_sub1_181_).aShortArray9335;
	    short[] is_187_
		= ((Class89_Sub1) class89_sub1_181_).aShortArray9371;
	    byte[] is_188_ = ((Class89_Sub1) class89_sub1_181_).aByteArray9362;
	    short[] is_189_;
	    short[] is_190_;
	    short[] is_191_;
	    byte[] is_192_;
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		is_189_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4811);
		is_190_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4813);
		is_191_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4812);
		is_192_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aByteArray4814);
	    } else {
		is_189_ = null;
		is_190_ = null;
		is_191_ = null;
		is_192_ = null;
	    }
	    short[] is_193_;
	    short[] is_194_;
	    short[] is_195_;
	    byte[] is_196_;
	    if (((Class89_Sub1) class89_sub1_181_).aClass307_9340 != null) {
		is_193_ = ((Class307) (((Class89_Sub1) class89_sub1_181_)
				       .aClass307_9340)).aShortArray4811;
		is_194_ = ((Class307) (((Class89_Sub1) class89_sub1_181_)
				       .aClass307_9340)).aShortArray4813;
		is_195_ = ((Class307) (((Class89_Sub1) class89_sub1_181_)
				       .aClass307_9340)).aShortArray4812;
		is_196_ = ((Class307) (((Class89_Sub1) class89_sub1_181_)
				       .aClass307_9340)).aByteArray4814;
	    } else {
		is_193_ = null;
		is_194_ = null;
		is_195_ = null;
		is_196_ = null;
	    }
	    int[] is_197_ = ((Class89_Sub1) class89_sub1_181_).anIntArray9374;
	    short[] is_198_
		= ((Class89_Sub1) class89_sub1_181_).aShortArray9328;
	    if (!((Class89_Sub1) class89_sub1_181_).aBool9323)
		class89_sub1_181_.method15471();
	    int i_199_ = ((Class89_Sub1) class89_sub1_181_).anInt9363;
	    int i_200_ = ((Class89_Sub1) class89_sub1_181_).anInt9364;
	    int i_201_ = ((Class89_Sub1) class89_sub1_181_).anInt9365;
	    int i_202_ = ((Class89_Sub1) class89_sub1_181_).anInt9366;
	    int i_203_ = ((Class89_Sub1) class89_sub1_181_).anInt9332;
	    int i_204_ = ((Class89_Sub1) class89_sub1_181_).anInt9359;
	    for (int i_205_ = 0; i_205_ < ((Class89_Sub1) this).anInt9325;
		 i_205_++) {
		int i_206_
		    = ((Class89_Sub1) this).anIntArray9327[i_205_] - i_179_;
		if (i_206_ >= i_199_ && i_206_ <= i_200_) {
		    int i_207_
			= ((Class89_Sub1) this).anIntArray9326[i_205_] - i;
		    if (i_207_ >= i_201_ && i_207_ <= i_202_) {
			int i_208_
			    = (((Class89_Sub1) this).anIntArray9360[i_205_]
			       - i_180_);
			if (i_208_ >= i_203_ && i_208_ <= i_204_) {
			    int i_209_ = -1;
			    int i_210_
				= ((Class89_Sub1) this).anIntArray9374[i_205_];
			    int i_211_ = (((Class89_Sub1) this).anIntArray9374
					  [i_205_ + 1]);
			    for (int i_212_ = i_210_;
				 (i_212_ < i_211_
				  && (((Class89_Sub1) this).aShortArray9328
				      [i_212_]) != 0);
				 i_212_++) {
				i_209_ = ((((Class89_Sub1) this)
					   .aShortArray9328[i_212_])
					  & 0xffff) - 1;
				if ((((Class89_Sub1) this).aByteArray9362
				     [i_209_])
				    != 0)
				    break;
			    }
			    if (i_209_ != -1) {
				for (int i_213_ = 0; i_213_ < i_182_;
				     i_213_++) {
				    if (i_207_ == is[i_213_]
					&& i_208_ == is_184_[i_213_]
					&& i_206_ == is_183_[i_213_]) {
					int i_214_ = -1;
					i_210_ = is_197_[i_213_];
					i_211_ = is_197_[i_213_ + 1];
					for (int i_215_ = i_210_;
					     (i_215_ < i_211_
					      && is_198_[i_215_] != 0);
					     i_215_++) {
					    i_214_
						= is_198_[i_215_] - 1 & 0xffff;
					    if (is_188_[i_214_] != 0)
						break;
					}
					if (i_214_ != -1) {
					    if (is_189_ == null) {
						((Class89_Sub1) this)
						    .aClass307_9340
						    = new Class307();
						is_189_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4811
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9334),
							-958881320));
						is_190_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4813
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9335),
							-1643481751));
						is_191_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4812
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9371),
							-1243034595));
						is_192_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aByteArray4814
						    = (Class554.method12275
						       ((((Class89_Sub1) this)
							 .aByteArray9362),
							-841739618));
					    }
					    if (is_193_ == null) {
						Class307 class307
						    = (((Class89_Sub1)
							class89_sub1_181_)
							   .aClass307_9340
						       = new Class307());
						is_193_
						    = ((Class307) class307)
							  .aShortArray4811
						    = (Class518.method11659
						       (is_185_, -924610209));
						is_194_
						    = ((Class307) class307)
							  .aShortArray4813
						    = (Class518.method11659
						       (is_186_, -762343153));
						is_195_
						    = ((Class307) class307)
							  .aShortArray4812
						    = (Class518.method11659
						       (is_187_, -1035439946));
						is_196_
						    = ((Class307) class307)
							  .aByteArray4814
						    = (Class554.method12275
						       (is_188_, -841739618));
					    }
					    short i_216_
						= (((Class89_Sub1) this)
						   .aShortArray9334[i_209_]);
					    short i_217_
						= (((Class89_Sub1) this)
						   .aShortArray9335[i_209_]);
					    short i_218_
						= (((Class89_Sub1) this)
						   .aShortArray9371[i_209_]);
					    byte i_219_
						= (((Class89_Sub1) this)
						   .aByteArray9362[i_209_]);
					    i_210_ = is_197_[i_213_];
					    i_211_ = is_197_[i_213_ + 1];
					    for (int i_220_ = i_210_;
						 i_220_ < i_211_; i_220_++) {
						int i_221_
						    = is_198_[i_220_] - 1;
						if (i_221_ == -1)
						    break;
						if (is_196_[i_221_] != 0) {
						    is_193_[i_221_] += i_216_;
						    is_194_[i_221_] += i_217_;
						    is_195_[i_221_] += i_218_;
						    is_196_[i_221_] += i_219_;
						}
					    }
					    i_216_ = is_185_[i_214_];
					    i_217_ = is_186_[i_214_];
					    i_218_ = is_187_[i_214_];
					    i_219_ = is_188_[i_214_];
					    i_210_ = (((Class89_Sub1) this)
						      .anIntArray9374[i_205_]);
					    i_211_ = (((Class89_Sub1) this)
						      .anIntArray9374
						      [i_205_ + 1]);
					    for (int i_222_ = i_210_;
						 (i_222_ < i_211_
						  && (((Class89_Sub1) this)
						      .aShortArray9328
						      [i_222_]) != 0);
						 i_222_++) {
						int i_223_
						    = (((((Class89_Sub1) this)
							 .aShortArray9328
							 [i_222_])
							& 0xffff)
						       - 1);
						if (is_192_[i_223_] != 0) {
						    is_189_[i_223_] += i_216_;
						    is_190_[i_223_] += i_217_;
						    is_191_[i_223_] += i_218_;
						    is_192_[i_223_] += i_219_;
						}
					    }
					    class89_sub1_181_.method15493();
					    method15493();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    int method15467(int i, int i_224_) {
	i_224_ = i_224_ * (i & 0x7f) >> 7;
	if (i_224_ < 2)
	    i_224_ = 2;
	else if (i_224_ > 126)
	    i_224_ = 126;
	return (i & 0xff80) + i_224_;
    }
    
    void method15468() {
	if (((Class89_Sub1) this).aClass311_9352 != null)
	    ((Class89_Sub1) this).aClass311_9352.method5880();
	if (((Class89_Sub1) this).aClass311_9341 != null)
	    ((Class89_Sub1) this).aClass311_9341.method5880();
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class89_Sub1) this).aClass311_9353.method5880();
	if (((Class89_Sub1) this).aClass311_9354 != null)
	    ((Class89_Sub1) this).aClass311_9354.method5880();
	if (((Class89_Sub1) this).aClass386_9351 != null)
	    ((Class89_Sub1) this).aClass386_9351.method6951();
    }
    
    Class89 method15469(Class89_Sub1 class89_sub1_225_,
			Class89_Sub1 class89_sub1_226_, int i, boolean bool,
			boolean bool_227_) {
	((Class89_Sub1) class89_sub1_225_).anInt9367 = i;
	((Class89_Sub1) class89_sub1_225_).anInt9321
	    = ((Class89_Sub1) this).anInt9321;
	((Class89_Sub1) class89_sub1_225_).aShort9322
	    = ((Class89_Sub1) this).aShort9322;
	((Class89_Sub1) class89_sub1_225_).aShort9383
	    = ((Class89_Sub1) this).aShort9383;
	((Class89_Sub1) class89_sub1_225_).anInt9324
	    = ((Class89_Sub1) this).anInt9324;
	((Class89_Sub1) class89_sub1_225_).anInt9325
	    = ((Class89_Sub1) this).anInt9325;
	((Class89_Sub1) class89_sub1_225_).anInt9378
	    = ((Class89_Sub1) this).anInt9378;
	((Class89_Sub1) class89_sub1_225_).anInt9331
	    = ((Class89_Sub1) this).anInt9331;
	((Class89_Sub1) class89_sub1_225_).anInt9342
	    = ((Class89_Sub1) this).anInt9342;
	((Class89_Sub1) class89_sub1_225_).anInt9375
	    = ((Class89_Sub1) this).anInt9375;
	if ((i & 0x100) != 0)
	    ((Class89_Sub1) class89_sub1_225_).aBool9358 = true;
	else
	    ((Class89_Sub1) class89_sub1_225_).aBool9358
		= ((Class89_Sub1) this).aBool9358;
	((Class89_Sub1) class89_sub1_225_).aBool9369
	    = ((Class89_Sub1) this).aBool9369;
	boolean bool_228_
	    = Class377.method6728(i, ((Class89_Sub1) this).anInt9321);
	boolean bool_229_
	    = Class377.method6729(i, ((Class89_Sub1) this).anInt9321);
	boolean bool_230_
	    = Class377.method6730(i, ((Class89_Sub1) this).anInt9321);
	boolean bool_231_ = bool_228_ | bool_229_ | bool_230_;
	if (bool_231_) {
	    if (bool_228_) {
		if (((Class89_Sub1) class89_sub1_226_).anIntArray9326 == null
		    || ((((Class89_Sub1) class89_sub1_226_)
			 .anIntArray9326).length
			< ((Class89_Sub1) this).anInt9324))
		    ((Class89_Sub1) class89_sub1_225_).anIntArray9326
			= ((Class89_Sub1) class89_sub1_226_).anIntArray9326
			= new int[((Class89_Sub1) this).anInt9324];
		else
		    ((Class89_Sub1) class89_sub1_225_).anIntArray9326
			= ((Class89_Sub1) class89_sub1_226_).anIntArray9326;
	    } else
		((Class89_Sub1) class89_sub1_225_).anIntArray9326
		    = ((Class89_Sub1) this).anIntArray9326;
	    if (bool_229_) {
		if (((Class89_Sub1) class89_sub1_226_).anIntArray9327 == null
		    || ((((Class89_Sub1) class89_sub1_226_)
			 .anIntArray9327).length
			< ((Class89_Sub1) this).anInt9324))
		    ((Class89_Sub1) class89_sub1_225_).anIntArray9327
			= ((Class89_Sub1) class89_sub1_226_).anIntArray9327
			= new int[((Class89_Sub1) this).anInt9324];
		else
		    ((Class89_Sub1) class89_sub1_225_).anIntArray9327
			= ((Class89_Sub1) class89_sub1_226_).anIntArray9327;
	    } else
		((Class89_Sub1) class89_sub1_225_).anIntArray9327
		    = ((Class89_Sub1) this).anIntArray9327;
	    if (bool_230_) {
		if (((Class89_Sub1) class89_sub1_226_).anIntArray9360 == null
		    || ((((Class89_Sub1) class89_sub1_226_)
			 .anIntArray9360).length
			< ((Class89_Sub1) this).anInt9324))
		    ((Class89_Sub1) class89_sub1_225_).anIntArray9360
			= ((Class89_Sub1) class89_sub1_226_).anIntArray9360
			= new int[((Class89_Sub1) this).anInt9324];
		else
		    ((Class89_Sub1) class89_sub1_225_).anIntArray9360
			= ((Class89_Sub1) class89_sub1_226_).anIntArray9360;
	    } else
		((Class89_Sub1) class89_sub1_225_).anIntArray9360
		    = ((Class89_Sub1) this).anIntArray9360;
	    for (int i_232_ = 0; i_232_ < ((Class89_Sub1) this).anInt9324;
		 i_232_++) {
		if (bool_228_)
		    ((Class89_Sub1) class89_sub1_225_).anIntArray9326[i_232_]
			= ((Class89_Sub1) this).anIntArray9326[i_232_];
		if (bool_229_)
		    ((Class89_Sub1) class89_sub1_225_).anIntArray9327[i_232_]
			= ((Class89_Sub1) this).anIntArray9327[i_232_];
		if (bool_230_)
		    ((Class89_Sub1) class89_sub1_225_).anIntArray9360[i_232_]
			= ((Class89_Sub1) this).anIntArray9360[i_232_];
	    }
	} else {
	    ((Class89_Sub1) class89_sub1_225_).anIntArray9326
		= ((Class89_Sub1) this).anIntArray9326;
	    ((Class89_Sub1) class89_sub1_225_).anIntArray9327
		= ((Class89_Sub1) this).anIntArray9327;
	    ((Class89_Sub1) class89_sub1_225_).anIntArray9360
		= ((Class89_Sub1) this).anIntArray9360;
	}
	if (Class377.method6744(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9352
		= ((Class89_Sub1) class89_sub1_226_).aClass311_9352;
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9352)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9352)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9352)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9352)
		.aBool4827
		= true;
	} else if (Class377.method6740(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9352
		= ((Class89_Sub1) this).aClass311_9352;
	else
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9352 = null;
	if (Class377.method6737(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_226_).aShortArray9361 == null
		|| (((Class89_Sub1) class89_sub1_226_).aShortArray9361.length
		    < ((Class89_Sub1) this).anInt9331))
		((Class89_Sub1) class89_sub1_225_).aShortArray9361
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9361
		    = new short[((Class89_Sub1) this).anInt9331];
	    else
		((Class89_Sub1) class89_sub1_225_).aShortArray9361
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9361;
	    for (int i_233_ = 0; i_233_ < ((Class89_Sub1) this).anInt9331;
		 i_233_++)
		((Class89_Sub1) class89_sub1_225_).aShortArray9361[i_233_]
		    = ((Class89_Sub1) this).aShortArray9361[i_233_];
	} else
	    ((Class89_Sub1) class89_sub1_225_).aShortArray9361
		= ((Class89_Sub1) this).aShortArray9361;
	if (Class377.method6820(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_226_).aByteArray9344 == null
		|| (((Class89_Sub1) class89_sub1_226_).aByteArray9344.length
		    < ((Class89_Sub1) this).anInt9331))
		((Class89_Sub1) class89_sub1_225_).aByteArray9344
		    = ((Class89_Sub1) class89_sub1_226_).aByteArray9344
		    = new byte[((Class89_Sub1) this).anInt9331];
	    else
		((Class89_Sub1) class89_sub1_225_).aByteArray9344
		    = ((Class89_Sub1) class89_sub1_226_).aByteArray9344;
	    for (int i_234_ = 0; i_234_ < ((Class89_Sub1) this).anInt9331;
		 i_234_++)
		((Class89_Sub1) class89_sub1_225_).aByteArray9344[i_234_]
		    = ((Class89_Sub1) this).aByteArray9344[i_234_];
	} else
	    ((Class89_Sub1) class89_sub1_225_).aByteArray9344
		= ((Class89_Sub1) this).aByteArray9344;
	if (Class377.method6789(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9353
		= ((Class89_Sub1) class89_sub1_226_).aClass311_9353;
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9353)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9353)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9353)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9353)
		.aBool4827
		= true;
	} else if (Class377.method6742(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9353
		= ((Class89_Sub1) this).aClass311_9353;
	else
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9353 = null;
	if (Class377.method6793(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_226_).aShortArray9334 == null
		|| (((Class89_Sub1) class89_sub1_226_).aShortArray9334.length
		    < ((Class89_Sub1) this).anInt9378)) {
		int i_235_ = ((Class89_Sub1) this).anInt9378;
		((Class89_Sub1) class89_sub1_225_).aShortArray9334
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9334
		    = new short[i_235_];
		((Class89_Sub1) class89_sub1_225_).aShortArray9335
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9335
		    = new short[i_235_];
		((Class89_Sub1) class89_sub1_225_).aShortArray9371
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9371
		    = new short[i_235_];
	    } else {
		((Class89_Sub1) class89_sub1_225_).aShortArray9334
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9334;
		((Class89_Sub1) class89_sub1_225_).aShortArray9335
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9335;
		((Class89_Sub1) class89_sub1_225_).aShortArray9371
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9371;
	    }
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		if (((Class89_Sub1) class89_sub1_226_).aClass307_9340 == null)
		    ((Class89_Sub1) class89_sub1_226_).aClass307_9340
			= new Class307();
		Class307 class307
		    = (((Class89_Sub1) class89_sub1_225_).aClass307_9340
		       = ((Class89_Sub1) class89_sub1_226_).aClass307_9340);
		if (((Class307) class307).aShortArray4811 == null
		    || (((Class307) class307).aShortArray4811.length
			< ((Class89_Sub1) this).anInt9378)) {
		    int i_236_ = ((Class89_Sub1) this).anInt9378;
		    ((Class307) class307).aShortArray4811 = new short[i_236_];
		    ((Class307) class307).aShortArray4813 = new short[i_236_];
		    ((Class307) class307).aShortArray4812 = new short[i_236_];
		    ((Class307) class307).aByteArray4814 = new byte[i_236_];
		}
		for (int i_237_ = 0; i_237_ < ((Class89_Sub1) this).anInt9378;
		     i_237_++) {
		    ((Class89_Sub1) class89_sub1_225_).aShortArray9334[i_237_]
			= ((Class89_Sub1) this).aShortArray9334[i_237_];
		    ((Class89_Sub1) class89_sub1_225_).aShortArray9335[i_237_]
			= ((Class89_Sub1) this).aShortArray9335[i_237_];
		    ((Class89_Sub1) class89_sub1_225_).aShortArray9371[i_237_]
			= ((Class89_Sub1) this).aShortArray9371[i_237_];
		    ((Class307) class307).aShortArray4811[i_237_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4811[i_237_]);
		    ((Class307) class307).aShortArray4813[i_237_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4813[i_237_]);
		    ((Class307) class307).aShortArray4812[i_237_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4812[i_237_]);
		    ((Class307) class307).aByteArray4814[i_237_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aByteArray4814[i_237_]);
		}
	    } else {
		((Class89_Sub1) class89_sub1_225_).aClass307_9340 = null;
		for (int i_238_ = 0; i_238_ < ((Class89_Sub1) this).anInt9378;
		     i_238_++) {
		    ((Class89_Sub1) class89_sub1_225_).aShortArray9334[i_238_]
			= ((Class89_Sub1) this).aShortArray9334[i_238_];
		    ((Class89_Sub1) class89_sub1_225_).aShortArray9335[i_238_]
			= ((Class89_Sub1) this).aShortArray9335[i_238_];
		    ((Class89_Sub1) class89_sub1_225_).aShortArray9371[i_238_]
			= ((Class89_Sub1) this).aShortArray9371[i_238_];
		}
	    }
	    ((Class89_Sub1) class89_sub1_225_).aByteArray9362
		= ((Class89_Sub1) this).aByteArray9362;
	} else {
	    ((Class89_Sub1) class89_sub1_225_).aClass307_9340
		= ((Class89_Sub1) this).aClass307_9340;
	    ((Class89_Sub1) class89_sub1_225_).aShortArray9334
		= ((Class89_Sub1) this).aShortArray9334;
	    ((Class89_Sub1) class89_sub1_225_).aShortArray9335
		= ((Class89_Sub1) this).aShortArray9335;
	    ((Class89_Sub1) class89_sub1_225_).aShortArray9371
		= ((Class89_Sub1) this).aShortArray9371;
	    ((Class89_Sub1) class89_sub1_225_).aByteArray9362
		= ((Class89_Sub1) this).aByteArray9362;
	}
	if (Class377.method6792(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9354
		= ((Class89_Sub1) class89_sub1_226_).aClass311_9354;
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9354)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9354)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9354)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9354)
		.aBool4827
		= true;
	} else if (Class377.method6741(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9354
		= ((Class89_Sub1) this).aClass311_9354;
	else
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9354 = null;
	if (Class377.method6735(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_226_).aFloatArray9338 == null
		|| (((Class89_Sub1) class89_sub1_226_).aFloatArray9338.length
		    < ((Class89_Sub1) this).anInt9331)) {
		int i_239_ = ((Class89_Sub1) this).anInt9378;
		((Class89_Sub1) class89_sub1_225_).aFloatArray9338
		    = ((Class89_Sub1) class89_sub1_226_).aFloatArray9338
		    = new float[i_239_];
		((Class89_Sub1) class89_sub1_225_).aFloatArray9339
		    = ((Class89_Sub1) class89_sub1_226_).aFloatArray9339
		    = new float[i_239_];
	    } else {
		((Class89_Sub1) class89_sub1_225_).aFloatArray9338
		    = ((Class89_Sub1) class89_sub1_226_).aFloatArray9338;
		((Class89_Sub1) class89_sub1_225_).aFloatArray9339
		    = ((Class89_Sub1) class89_sub1_226_).aFloatArray9339;
	    }
	    for (int i_240_ = 0; i_240_ < ((Class89_Sub1) this).anInt9378;
		 i_240_++) {
		((Class89_Sub1) class89_sub1_225_).aFloatArray9338[i_240_]
		    = ((Class89_Sub1) this).aFloatArray9338[i_240_];
		((Class89_Sub1) class89_sub1_225_).aFloatArray9339[i_240_]
		    = ((Class89_Sub1) this).aFloatArray9339[i_240_];
	    }
	} else {
	    ((Class89_Sub1) class89_sub1_225_).aFloatArray9338
		= ((Class89_Sub1) this).aFloatArray9338;
	    ((Class89_Sub1) class89_sub1_225_).aFloatArray9339
		= ((Class89_Sub1) this).aFloatArray9339;
	}
	if (Class377.method6747(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9341
		= ((Class89_Sub1) class89_sub1_226_).aClass311_9341;
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9341)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9341)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9341)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_225_).aClass311_9341)
		.aBool4827
		= true;
	} else if (Class377.method6743(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9341
		= ((Class89_Sub1) this).aClass311_9341;
	else
	    ((Class89_Sub1) class89_sub1_225_).aClass311_9341 = null;
	if (Class377.method6736(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_226_).aShortArray9345 == null
		|| (((Class89_Sub1) class89_sub1_226_).aShortArray9345.length
		    < ((Class89_Sub1) this).anInt9331)) {
		int i_241_ = ((Class89_Sub1) this).anInt9331;
		((Class89_Sub1) class89_sub1_225_).aShortArray9345
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9345
		    = new short[i_241_];
		((Class89_Sub1) class89_sub1_225_).aShortArray9346
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9346
		    = new short[i_241_];
		((Class89_Sub1) class89_sub1_225_).aShortArray9368
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9368
		    = new short[i_241_];
	    } else {
		((Class89_Sub1) class89_sub1_225_).aShortArray9345
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9345;
		((Class89_Sub1) class89_sub1_225_).aShortArray9346
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9346;
		((Class89_Sub1) class89_sub1_225_).aShortArray9368
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9368;
	    }
	    for (int i_242_ = 0; i_242_ < ((Class89_Sub1) this).anInt9331;
		 i_242_++) {
		((Class89_Sub1) class89_sub1_225_).aShortArray9345[i_242_]
		    = ((Class89_Sub1) this).aShortArray9345[i_242_];
		((Class89_Sub1) class89_sub1_225_).aShortArray9346[i_242_]
		    = ((Class89_Sub1) this).aShortArray9346[i_242_];
		((Class89_Sub1) class89_sub1_225_).aShortArray9368[i_242_]
		    = ((Class89_Sub1) this).aShortArray9368[i_242_];
	    }
	} else {
	    ((Class89_Sub1) class89_sub1_225_).aShortArray9345
		= ((Class89_Sub1) this).aShortArray9345;
	    ((Class89_Sub1) class89_sub1_225_).aShortArray9346
		= ((Class89_Sub1) this).aShortArray9346;
	    ((Class89_Sub1) class89_sub1_225_).aShortArray9368
		= ((Class89_Sub1) this).aShortArray9368;
	}
	if (Class377.method6748(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_225_).aClass386_9351
		= ((Class89_Sub1) class89_sub1_226_).aClass386_9351;
	    ((Class386) ((Class89_Sub1) class89_sub1_225_).aClass386_9351)
		.anInterface33_5708
		= (((Class386) ((Class89_Sub1) this).aClass386_9351)
		   .anInterface33_5708);
	    ((Class386) ((Class89_Sub1) class89_sub1_225_).aClass386_9351)
		.aBool5707
		= ((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707;
	    ((Class386) ((Class89_Sub1) class89_sub1_225_).aClass386_9351)
		.aBool5709
		= true;
	} else if (Class377.method6790(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_225_).aClass386_9351
		= ((Class89_Sub1) this).aClass386_9351;
	else
	    ((Class89_Sub1) class89_sub1_225_).aClass386_9351 = null;
	if (Class377.method6769(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_226_).aShortArray9348 == null
		|| (((Class89_Sub1) class89_sub1_226_).aShortArray9348.length
		    < ((Class89_Sub1) this).anInt9331)) {
		int i_243_ = ((Class89_Sub1) this).anInt9331;
		((Class89_Sub1) class89_sub1_225_).aShortArray9348
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9348
		    = new short[i_243_];
	    } else
		((Class89_Sub1) class89_sub1_225_).aShortArray9348
		    = ((Class89_Sub1) class89_sub1_226_).aShortArray9348;
	    for (int i_244_ = 0; i_244_ < ((Class89_Sub1) this).anInt9331;
		 i_244_++)
		((Class89_Sub1) class89_sub1_225_).aShortArray9348[i_244_]
		    = ((Class89_Sub1) this).aShortArray9348[i_244_];
	} else
	    ((Class89_Sub1) class89_sub1_225_).aShortArray9348
		= ((Class89_Sub1) this).aShortArray9348;
	if (Class377.method6738(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_226_).aClass381Array9379 == null
		|| ((((Class89_Sub1) class89_sub1_226_)
		     .aClass381Array9379).length
		    < ((Class89_Sub1) this).anInt9375)) {
		int i_245_ = ((Class89_Sub1) this).anInt9375;
		((Class89_Sub1) class89_sub1_225_).aClass381Array9379
		    = ((Class89_Sub1) class89_sub1_226_).aClass381Array9379
		    = new Class381[i_245_];
		for (int i_246_ = 0; i_246_ < ((Class89_Sub1) this).anInt9375;
		     i_246_++)
		    ((Class89_Sub1) class89_sub1_225_).aClass381Array9379
			[i_246_]
			= ((Class89_Sub1) this).aClass381Array9379[i_246_]
			      .method6885();
	    } else {
		((Class89_Sub1) class89_sub1_225_).aClass381Array9379
		    = ((Class89_Sub1) class89_sub1_226_).aClass381Array9379;
		for (int i_247_ = 0; i_247_ < ((Class89_Sub1) this).anInt9375;
		     i_247_++)
		    ((Class89_Sub1) class89_sub1_225_).aClass381Array9379
			[i_247_].method6886
			(((Class89_Sub1) this).aClass381Array9379[i_247_]);
	    }
	} else
	    ((Class89_Sub1) class89_sub1_225_).aClass381Array9379
		= ((Class89_Sub1) this).aClass381Array9379;
	((Class89_Sub1) class89_sub1_225_).aClass315Array9333
	    = ((Class89_Sub1) this).aClass315Array9333;
	if (((Class89_Sub1) this).aBool9323) {
	    ((Class89_Sub1) class89_sub1_225_).anInt9380
		= ((Class89_Sub1) this).anInt9380;
	    ((Class89_Sub1) class89_sub1_225_).anInt9336
		= ((Class89_Sub1) this).anInt9336;
	    ((Class89_Sub1) class89_sub1_225_).anInt9365
		= ((Class89_Sub1) this).anInt9365;
	    ((Class89_Sub1) class89_sub1_225_).anInt9366
		= ((Class89_Sub1) this).anInt9366;
	    ((Class89_Sub1) class89_sub1_225_).anInt9363
		= ((Class89_Sub1) this).anInt9363;
	    ((Class89_Sub1) class89_sub1_225_).anInt9364
		= ((Class89_Sub1) this).anInt9364;
	    ((Class89_Sub1) class89_sub1_225_).anInt9332
		= ((Class89_Sub1) this).anInt9332;
	    ((Class89_Sub1) class89_sub1_225_).anInt9359
		= ((Class89_Sub1) this).anInt9359;
	    ((Class89_Sub1) class89_sub1_225_).aBool9323 = true;
	} else
	    ((Class89_Sub1) class89_sub1_225_).aBool9323 = false;
	if (((Class89_Sub1) this).aBool9382) {
	    ((Class89_Sub1) class89_sub1_225_).anInt9370
		= ((Class89_Sub1) this).anInt9370;
	    ((Class89_Sub1) class89_sub1_225_).aBool9382 = true;
	} else
	    ((Class89_Sub1) class89_sub1_225_).aBool9382 = false;
	((Class89_Sub1) class89_sub1_225_).anIntArrayArray9329
	    = ((Class89_Sub1) this).anIntArrayArray9329;
	((Class89_Sub1) class89_sub1_225_).anIntArrayArray9337
	    = ((Class89_Sub1) this).anIntArrayArray9337;
	((Class89_Sub1) class89_sub1_225_).anIntArrayArray9381
	    = ((Class89_Sub1) this).anIntArrayArray9381;
	((Class89_Sub1) class89_sub1_225_).aShortArray9328
	    = ((Class89_Sub1) this).aShortArray9328;
	((Class89_Sub1) class89_sub1_225_).anIntArray9374
	    = ((Class89_Sub1) this).anIntArray9374;
	((Class89_Sub1) class89_sub1_225_).aShortArray9350
	    = ((Class89_Sub1) this).aShortArray9350;
	((Class89_Sub1) class89_sub1_225_).aShortArray9355
	    = ((Class89_Sub1) this).aShortArray9355;
	((Class89_Sub1) class89_sub1_225_).aShortArray9330
	    = ((Class89_Sub1) this).aShortArray9330;
	((Class89_Sub1) class89_sub1_225_).aShortArray9320
	    = ((Class89_Sub1) this).aShortArray9320;
	((Class89_Sub1) class89_sub1_225_).anIntArray9347
	    = ((Class89_Sub1) this).anIntArray9347;
	((Class89_Sub1) class89_sub1_225_).anIntArray9373
	    = ((Class89_Sub1) this).anIntArray9373;
	((Class89_Sub1) class89_sub1_225_).anIntArray9386
	    = ((Class89_Sub1) this).anIntArray9386;
	((Class89_Sub1) class89_sub1_225_).aClass106Array9376
	    = ((Class89_Sub1) this).aClass106Array9376;
	((Class89_Sub1) class89_sub1_225_).aClass167Array9377
	    = ((Class89_Sub1) this).aClass167Array9377;
	return class89_sub1_225_;
    }
    
    void method15470() {
	if (((Class89_Sub1) this).aClass386_9351 != null)
	    ((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707
		= false;
    }
    
    public void method1927(int i, int i_248_, int i_249_) {
	for (int i_250_ = 0; i_250_ < ((Class89_Sub1) this).anInt9325;
	     i_250_++) {
	    if (i != 0)
		((Class89_Sub1) this).anIntArray9326[i_250_] += i;
	    if (i_248_ != 0)
		((Class89_Sub1) this).anIntArray9327[i_250_] += i_248_;
	    if (i_249_ != 0)
		((Class89_Sub1) this).anIntArray9360[i_250_] += i_249_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1985(short i, short i_251_) {
	Class107 class107
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass107_1458;
	for (int i_252_ = 0; i_252_ < ((Class89_Sub1) this).anInt9331;
	     i_252_++) {
	    if (((Class89_Sub1) this).aShortArray9348[i_252_] == i)
		((Class89_Sub1) this).aShortArray9348[i_252_] = i_251_;
	}
	byte i_253_ = 0;
	byte i_254_ = 0;
	if (i != -1) {
	    Class101 class101 = class107.method2680(i & 0xffff, 785314870);
	    i_253_ = class101.aByte1430;
	    i_254_ = class101.aByte1433;
	}
	byte i_255_ = 0;
	byte i_256_ = 0;
	if (i_251_ != -1) {
	    Class101 class101
		= class107.method2680(i_251_ & 0xffff, 1825525631);
	    i_255_ = class101.aByte1430;
	    i_256_ = class101.aByte1433;
	    if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
		((Class89_Sub1) this).aBool9369 = true;
	}
	if (i_253_ != i_255_ | i_254_ != i_256_) {
	    if (((Class89_Sub1) this).aClass315Array9333 != null) {
		for (int i_257_ = 0; i_257_ < ((Class89_Sub1) this).anInt9375;
		     i_257_++) {
		    Class315 class315
			= ((Class89_Sub1) this).aClass315Array9333[i_257_];
		    Class381 class381
			= ((Class89_Sub1) this).aClass381Array9379[i_257_];
		    ((Class381) class381).anInt5661
			= (((Class381) class381).anInt5661 & ~0xffffff
			   | ((Class474.anIntArray6383
			       [(((Class89_Sub1) this).aShortArray9361
				 [((Class315) class315).anInt4841]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15474();
	}
    }
    
    public void method1868(int i) {
	int i_258_ = Class282.anIntArray4430[i];
	int i_259_ = Class282.anIntArray4441[i];
	for (int i_260_ = 0; i_260_ < ((Class89_Sub1) this).anInt9325;
	     i_260_++) {
	    int i_261_
		= ((((Class89_Sub1) this).anIntArray9360[i_260_] * i_258_
		    + ((Class89_Sub1) this).anIntArray9326[i_260_] * i_259_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9360[i_260_]
		= ((((Class89_Sub1) this).anIntArray9360[i_260_] * i_259_
		    - ((Class89_Sub1) this).anIntArray9326[i_260_] * i_258_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9326[i_260_] = i_261_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public int method1981() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9365;
    }
    
    public void method1956() {
	if (!((Class89_Sub1) this).aBool9382) {
	    if (!((Class89_Sub1) this).aBool9323)
		method15471();
	    ((Class89_Sub1) this).anInt9370 = ((Class89_Sub1) this).anInt9363;
	    ((Class89_Sub1) this).aBool9382 = true;
	}
    }
    
    public void method1869(int i) {
	int i_262_ = Class282.anIntArray4430[i];
	int i_263_ = Class282.anIntArray4441[i];
	for (int i_264_ = 0; i_264_ < ((Class89_Sub1) this).anInt9325;
	     i_264_++) {
	    int i_265_
		= ((((Class89_Sub1) this).anIntArray9360[i_264_] * i_262_
		    + ((Class89_Sub1) this).anIntArray9326[i_264_] * i_263_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9360[i_264_]
		= ((((Class89_Sub1) this).anIntArray9360[i_264_] * i_263_
		    - ((Class89_Sub1) this).anIntArray9326[i_264_] * i_262_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9326[i_264_] = i_265_;
	}
	for (int i_266_ = 0; i_266_ < ((Class89_Sub1) this).anInt9378;
	     i_266_++) {
	    int i_267_
		= ((((Class89_Sub1) this).aShortArray9371[i_266_] * i_262_
		    + ((Class89_Sub1) this).aShortArray9334[i_266_] * i_263_)
		   >> 14);
	    ((Class89_Sub1) this).aShortArray9371[i_266_]
		= (short) (((((Class89_Sub1) this).aShortArray9371[i_266_]
			     * i_263_)
			    - (((Class89_Sub1) this).aShortArray9334[i_266_]
			       * i_262_))
			   >> 14);
	    ((Class89_Sub1) this).aShortArray9334[i_266_] = (short) i_267_;
	}
	method15480();
	method15493();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1870(int i) {
	int i_268_ = Class282.anIntArray4430[i];
	int i_269_ = Class282.anIntArray4441[i];
	for (int i_270_ = 0; i_270_ < ((Class89_Sub1) this).anInt9325;
	     i_270_++) {
	    int i_271_
		= ((((Class89_Sub1) this).anIntArray9327[i_270_] * i_269_
		    - ((Class89_Sub1) this).anIntArray9360[i_270_] * i_268_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9360[i_270_]
		= ((((Class89_Sub1) this).anIntArray9327[i_270_] * i_268_
		    + ((Class89_Sub1) this).anIntArray9360[i_270_] * i_269_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9327[i_270_] = i_271_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1980(int i) {
	int i_272_ = Class282.anIntArray4430[i];
	int i_273_ = Class282.anIntArray4441[i];
	for (int i_274_ = 0; i_274_ < ((Class89_Sub1) this).anInt9325;
	     i_274_++) {
	    int i_275_
		= ((((Class89_Sub1) this).anIntArray9327[i_274_] * i_272_
		    + ((Class89_Sub1) this).anIntArray9326[i_274_] * i_273_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9327[i_274_]
		= ((((Class89_Sub1) this).anIntArray9327[i_274_] * i_273_
		    - ((Class89_Sub1) this).anIntArray9326[i_274_] * i_272_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9326[i_274_] = i_275_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public int method2001() {
	return ((Class89_Sub1) this).aShort9322;
    }
    
    public void method1873() {
	for (int i = 0; i < ((Class89_Sub1) this).anInt9325; i++)
	    ((Class89_Sub1) this).anIntArray9360[i]
		= -((Class89_Sub1) this).anIntArray9360[i];
	for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++)
	    ((Class89_Sub1) this).aShortArray9371[i]
		= (short) -((Class89_Sub1) this).aShortArray9371[i];
	for (int i = 0; i < ((Class89_Sub1) this).anInt9331; i++) {
	    short i_276_ = ((Class89_Sub1) this).aShortArray9345[i];
	    ((Class89_Sub1) this).aShortArray9345[i]
		= ((Class89_Sub1) this).aShortArray9368[i];
	    ((Class89_Sub1) this).aShortArray9368[i] = i_276_;
	}
	method15480();
	method15493();
	method15470();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1863(int i, int i_277_, int i_278_) {
	for (int i_279_ = 0; i_279_ < ((Class89_Sub1) this).anInt9325;
	     i_279_++) {
	    if (i != 128)
		((Class89_Sub1) this).anIntArray9326[i_279_]
		    = ((Class89_Sub1) this).anIntArray9326[i_279_] * i >> 7;
	    if (i_277_ != 128)
		((Class89_Sub1) this).anIntArray9327[i_279_]
		    = (((Class89_Sub1) this).anIntArray9327[i_279_] * i_277_
		       >> 7);
	    if (i_278_ != 128)
		((Class89_Sub1) this).anIntArray9360[i_279_]
		    = (((Class89_Sub1) this).anIntArray9360[i_279_] * i_278_
		       >> 7);
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1875(int i, int i_280_, Class166 class166,
			   Class166 class166_281_, int i_282_, int i_283_,
			   int i_284_) {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i_285_ = i_282_ + ((Class89_Sub1) this).anInt9365;
	int i_286_ = i_282_ + ((Class89_Sub1) this).anInt9366;
	int i_287_ = i_284_ + ((Class89_Sub1) this).anInt9332;
	int i_288_ = i_284_ + ((Class89_Sub1) this).anInt9359;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_285_ >= 0
		&& ((i_286_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2055 * 266270313)
		&& i_287_ >= 0
		&& ((i_288_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2052 * -14610189))) {
	    if (i == 4 || i == 5) {
		if (class166_281_ == null
		    || (i_285_ < 0
			|| ((i_286_ + class166_281_.anInt2053 * 2039042417
			     >> class166_281_.anInt2054 * -122333825)
			    >= class166_281_.anInt2055 * 266270313)
			|| i_287_ < 0
			|| ((i_288_ + class166_281_.anInt2053 * 2039042417
			     >> class166_281_.anInt2054 * -122333825)
			    >= class166_281_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_285_ >>= class166.anInt2054 * -122333825;
		i_286_ = (i_286_ + (class166.anInt2053 * 2039042417 - 1)
			  >> class166.anInt2054 * -122333825);
		i_287_ >>= class166.anInt2054 * -122333825;
		i_288_ = (i_288_ + (class166.anInt2053 * 2039042417 - 1)
			  >> class166.anInt2054 * -122333825);
		if (class166.method3551(i_285_, i_287_, -1904770744) == i_283_
		    && (class166.method3551(i_286_, i_287_, -890783323)
			== i_283_)
		    && (class166.method3551(i_285_, i_288_, -1425050289)
			== i_283_)
		    && (class166.method3551(i_286_, i_288_, -323050121)
			== i_283_))
		    return;
	    }
	    if (i == 1) {
		for (int i_289_ = 0; i_289_ < ((Class89_Sub1) this).anInt9325;
		     i_289_++)
		    ((Class89_Sub1) this).anIntArray9327[i_289_]
			= (((Class89_Sub1) this).anIntArray9327[i_289_]
			   + class166.method3550(((((Class89_Sub1) this)
						   .anIntArray9326[i_289_])
						  + i_282_),
						 ((((Class89_Sub1) this)
						   .anIntArray9360[i_289_])
						  + i_284_),
						 -2069649735)
			   - i_283_);
	    } else if (i == 2) {
		int i_290_ = ((Class89_Sub1) this).anInt9363;
		if (i_290_ == 0)
		    return;
		for (int i_291_ = 0; i_291_ < ((Class89_Sub1) this).anInt9325;
		     i_291_++) {
		    int i_292_
			= ((((Class89_Sub1) this).anIntArray9327[i_291_] << 16)
			   / i_290_);
		    if (i_292_ < i_280_)
			((Class89_Sub1) this).anIntArray9327[i_291_]
			    = (((Class89_Sub1) this).anIntArray9327[i_291_]
			       + (class166.method3550((((Class89_Sub1) this)
						       .anIntArray9326
						       [i_291_]) + i_282_,
						      (((Class89_Sub1) this)
						       .anIntArray9360
						       [i_291_]) + i_284_,
						      -2043878169)
				  - i_283_) * (i_280_ - i_292_) / i_280_);
		}
	    } else if (i == 3) {
		int i_293_ = (i_280_ & 0xff) * 4;
		int i_294_ = (i_280_ >> 8 & 0xff) * 4;
		int i_295_ = (i_280_ >> 16 & 0xff) << 6;
		int i_296_ = (i_280_ >> 24 & 0xff) << 6;
		if (i_282_ - (i_293_ >> 1) < 0
		    || ((i_282_ + (i_293_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2055 * 266270313
			    << class166.anInt2054 * -122333825))
		    || i_284_ - (i_294_ >> 1) < 0
		    || ((i_284_ + (i_294_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2052 * -14610189
			    << class166.anInt2054 * -122333825)))
		    return;
		method2041(class166, i_282_, i_283_, i_284_, i_293_, i_294_,
			   i_295_, i_296_);
	    } else if (i == 4) {
		int i_297_ = (((Class89_Sub1) this).anInt9364
			      - ((Class89_Sub1) this).anInt9363);
		for (int i_298_ = 0; i_298_ < ((Class89_Sub1) this).anInt9325;
		     i_298_++)
		    ((Class89_Sub1) this).anIntArray9327[i_298_]
			= (((Class89_Sub1) this).anIntArray9327[i_298_]
			   + (class166_281_.method3550((((Class89_Sub1) this)
							.anIntArray9326
							[i_298_]) + i_282_,
						       (((Class89_Sub1) this)
							.anIntArray9360
							[i_298_]) + i_284_,
						       -1229868579)
			      - i_283_)
			   + i_297_);
	    } else if (i == 5) {
		int i_299_ = (((Class89_Sub1) this).anInt9364
			      - ((Class89_Sub1) this).anInt9363);
		for (int i_300_ = 0; i_300_ < ((Class89_Sub1) this).anInt9325;
		     i_300_++) {
		    int i_301_ = (((Class89_Sub1) this).anIntArray9326[i_300_]
				  + i_282_);
		    int i_302_ = (((Class89_Sub1) this).anIntArray9360[i_300_]
				  + i_284_);
		    int i_303_
			= class166.method3550(i_301_, i_302_, -2109228209);
		    int i_304_
			= class166_281_.method3550(i_301_, i_302_, -268492285);
		    int i_305_ = i_303_ - i_304_ - i_280_;
		    ((Class89_Sub1) this).anIntArray9327[i_300_]
			= (((((Class89_Sub1) this).anIntArray9327[i_300_] << 8)
			    / i_299_ * i_305_)
			   >> 8) - (i_283_ - i_303_);
		}
	    }
	    method15480();
	    ((Class89_Sub1) this).aBool9323 = false;
	}
    }
    
    void method15471() {
	int i = 32767;
	int i_306_ = 32767;
	int i_307_ = 32767;
	int i_308_ = -32768;
	int i_309_ = -32768;
	int i_310_ = -32768;
	int i_311_ = 0;
	int i_312_ = 0;
	for (int i_313_ = 0; i_313_ < ((Class89_Sub1) this).anInt9325;
	     i_313_++) {
	    int i_314_ = ((Class89_Sub1) this).anIntArray9326[i_313_];
	    int i_315_ = ((Class89_Sub1) this).anIntArray9327[i_313_];
	    int i_316_ = ((Class89_Sub1) this).anIntArray9360[i_313_];
	    if (i_314_ < i)
		i = i_314_;
	    if (i_314_ > i_308_)
		i_308_ = i_314_;
	    if (i_315_ < i_306_)
		i_306_ = i_315_;
	    if (i_315_ > i_309_)
		i_309_ = i_315_;
	    if (i_316_ < i_307_)
		i_307_ = i_316_;
	    if (i_316_ > i_310_)
		i_310_ = i_316_;
	    int i_317_ = i_314_ * i_314_ + i_316_ * i_316_;
	    if (i_317_ > i_311_)
		i_311_ = i_317_;
	    i_317_ = i_314_ * i_314_ + i_316_ * i_316_ + i_315_ * i_315_;
	    if (i_317_ > i_312_)
		i_312_ = i_317_;
	}
	((Class89_Sub1) this).anInt9365 = i;
	((Class89_Sub1) this).anInt9366 = i_308_;
	((Class89_Sub1) this).anInt9363 = i_306_;
	((Class89_Sub1) this).anInt9364 = i_309_;
	((Class89_Sub1) this).anInt9332 = i_307_;
	((Class89_Sub1) this).anInt9359 = i_310_;
	((Class89_Sub1) this).anInt9336
	    = (int) (Math.sqrt((double) i_311_) + 0.99);
	((Class89_Sub1) this).anInt9380
	    = (int) (Math.sqrt((double) i_312_) + 0.99);
	((Class89_Sub1) this).aBool9323 = true;
    }
    
    public Class106[] method2051() {
	return ((Class89_Sub1) this).aClass106Array9376;
    }
    
    public int method1893() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9336;
    }
    
    public int method1894() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9380;
    }
    
    public byte[] method2007() {
	return ((Class89_Sub1) this).aByteArray9344;
    }
    
    public void method1909(byte i, byte[] is) {
	if (is == null) {
	    for (int i_318_ = 0; i_318_ < ((Class89_Sub1) this).anInt9331;
		 i_318_++)
		((Class89_Sub1) this).aByteArray9344[i_318_] = i;
	} else {
	    for (int i_319_ = 0; i_319_ < ((Class89_Sub1) this).anInt9331;
		 i_319_++) {
		int i_320_ = 255 - ((255 - (is[i_319_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		((Class89_Sub1) this).aByteArray9344[i_319_] = (byte) i_320_;
	    }
	}
	method15474();
    }
    
    public int method1902() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9363;
    }
    
    public int method1865() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9364;
    }
    
    public int method1899() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9332;
    }
    
    public void method1908(short i, short i_321_) {
	for (int i_322_ = 0; i_322_ < ((Class89_Sub1) this).anInt9331;
	     i_322_++) {
	    if (((Class89_Sub1) this).aShortArray9361[i_322_] == i)
		((Class89_Sub1) this).aShortArray9361[i_322_] = i_321_;
	}
	if (((Class89_Sub1) this).aClass315Array9333 != null) {
	    for (int i_323_ = 0; i_323_ < ((Class89_Sub1) this).anInt9375;
		 i_323_++) {
		Class315 class315
		    = ((Class89_Sub1) this).aClass315Array9333[i_323_];
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i_323_];
		((Class381) class381).anInt5661
		    = (((Class381) class381).anInt5661 & ~0xffffff
		       | ((Class474.anIntArray6383
			   [(((Class89_Sub1) this).aShortArray9361
			     [((Class315) class315).anInt4841]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method15474();
    }
    
    public int method1901() {
	if (!((Class89_Sub1) this).aBool9382)
	    method1922();
	return ((Class89_Sub1) this).anInt9370;
    }
    
    void method15472() {
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826
		= false;
    }
    
    public void method1903(int i) {
	((Class89_Sub1) this).aShort9322 = (short) i;
	method15474();
    }
    
    public void method2057(int i) {
	((Class89_Sub1) this).aShort9383 = (short) i;
	method15480();
	method15493();
    }
    
    public int method1905() {
	return ((Class89_Sub1) this).aShort9322;
    }
    
    public int method1862() {
	return ((Class89_Sub1) this).aShort9383;
    }
    
    public byte[] method1907() {
	return ((Class89_Sub1) this).aByteArray9344;
    }
    
    public void method1929(int i) {
	if (((Class89_Sub1) this).aClass311_9352 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4827
		= Class377.method6744(i, ((Class89_Sub1) this).anInt9321);
	if (((Class89_Sub1) this).aClass311_9341 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4827
		= Class377.method6747(i, ((Class89_Sub1) this).anInt9321);
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4827
		= Class377.method6789(i, ((Class89_Sub1) this).anInt9321);
	if (((Class89_Sub1) this).aClass311_9354 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4827
		= Class377.method6792(i, ((Class89_Sub1) this).anInt9321);
	((Class89_Sub1) this).anInt9367 = i;
	if (((Class89_Sub1) this).aClass307_9340 != null
	    && (((Class89_Sub1) this).anInt9367 & 0x10000) == 0) {
	    ((Class89_Sub1) this).aShortArray9334
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aShortArray4811);
	    ((Class89_Sub1) this).aShortArray9335
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aShortArray4813);
	    ((Class89_Sub1) this).aShortArray9371
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aShortArray4812);
	    ((Class89_Sub1) this).aByteArray9362
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aByteArray4814);
	    ((Class89_Sub1) this).aClass307_9340 = null;
	}
	((Class89_Sub1) this).aBool9357 = true;
	method15489();
    }
    
    public int method1925() {
	return ((Class89_Sub1) this).anInt9367;
    }
    
    boolean method15473() {
	boolean bool
	    = !((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826;
	boolean bool_324_
	    = ((((Class89_Sub1) this).anInt9321 & 0x37) != 0
	       && !(((Class311) ((Class89_Sub1) this).aClass311_9354)
		    .aBool4826));
	boolean bool_325_
	    = !((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826;
	boolean bool_326_
	    = !((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826;
	if (!bool_325_ && !bool && !bool_324_ && !bool_326_)
	    return true;
	boolean bool_327_ = true;
	if (bool_325_ && ((Class89_Sub1) this).aShortArray9350 != null) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9352)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9352)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9352)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 12, 12);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 12;
		long l = interface40.method262(0, i);
		for (int i_328_ = 0; i_328_ < ((Class89_Sub1) this).anInt9378;
		     i_328_++) {
		    short i_329_
			= ((Class89_Sub1) this).aShortArray9350[i_328_];
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9326[i_329_]));
		    l += 4L;
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9327[i_329_]));
		    l += 4L;
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9360[i_329_]));
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9326
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9327
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9360
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9352)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826 = true;
	}
	if (bool) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9353)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9353)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9353)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 4, 4);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 4;
		long l = interface40.method262(0, i);
		if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		    short[] is;
		    short[] is_330_;
		    short[] is_331_;
		    byte[] is_332_;
		    if (((Class89_Sub1) this).aClass307_9340 != null) {
			is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			      .aShortArray4811);
			is_330_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4813;
			is_331_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4812;
			is_332_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aByteArray4814;
		    } else {
			is = ((Class89_Sub1) this).aShortArray9334;
			is_330_ = ((Class89_Sub1) this).aShortArray9335;
			is_331_ = ((Class89_Sub1) this).aShortArray9371;
			is_332_ = ((Class89_Sub1) this).aByteArray9362;
		    }
		    float f
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    float f_333_
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    for (int i_334_ = 0;
			 i_334_ < ((Class89_Sub1) this).anInt9378; i_334_++) {
			short i_335_
			    = ((Class89_Sub1) this).aShortArray9355[i_334_];
			int i_336_
			    = method15483((((Class89_Sub1) this)
					   .aShortArray9361[i_335_]) & 0xffff,
					  (((Class89_Sub1) this)
					   .aShortArray9348[i_335_]),
					  ((Class89_Sub1) this).aShort9322);
			float f_337_ = ((float) (i_336_ >> 16 & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9563));
			float f_338_ = ((float) (i_336_ >> 8 & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9564));
			float f_339_ = ((float) (i_336_ & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9556));
			byte i_340_ = is_332_[i_334_];
			float f_341_;
			if (i_340_ == 0)
			    f_341_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i_334_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_330_[i_334_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_331_[i_334_])
				   * 0.0026041667F);
			else
			    f_341_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i_334_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_330_[i_334_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_331_[i_334_])
				   / ((float) i_340_ * 256.0F));
			float f_342_
			    = ((((Class89_Sub1) this).aClass103_Sub3_9319
				.aFloat9566)
			       + f_341_ * (f_341_ < 0.0F ? f_333_ : f));
			int i_343_ = (int) (f_337_ * f_342_);
			if (i_343_ < 0)
			    i_343_ = 0;
			else if (i_343_ > 255)
			    i_343_ = 255;
			int i_344_ = (int) (f_338_ * f_342_);
			if (i_344_ < 0)
			    i_344_ = 0;
			else if (i_344_ > 255)
			    i_344_ = 255;
			int i_345_ = (int) (f_339_ * f_342_);
			if (i_345_ < 0)
			    i_345_ = 0;
			else if (i_345_ > 255)
			    i_345_ = 255;
			unsafe.putInt(l,
				      (255 - (((Class89_Sub1) this)
					      .aByteArray9344[i_335_]) << 24
				       | i_343_ << 16 | i_344_ << 8 | i_345_));
			l += 4L;
		    }
		} else {
		    for (int i_346_ = 0;
			 i_346_ < ((Class89_Sub1) this).anInt9378; i_346_++) {
			short i_347_
			    = ((Class89_Sub1) this).aShortArray9355[i_346_];
			int i_348_ = (255 - (((Class89_Sub1) this)
					     .aByteArray9344[i_347_]) << 24
				      | method15483(((((Class89_Sub1) this)
						      .aShortArray9361[i_347_])
						     & 0xffff),
						    (((Class89_Sub1) this)
						     .aShortArray9348[i_347_]),
						    (((Class89_Sub1) this)
						     .aShort9322)));
			unsafe.putInt(l, i_348_);
			l += 4L;
		    }
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		    short[] is;
		    short[] is_349_;
		    short[] is_350_;
		    byte[] is_351_;
		    if (((Class89_Sub1) this).aClass307_9340 != null) {
			is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			      .aShortArray4811);
			is_349_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4813;
			is_350_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4812;
			is_351_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aByteArray4814;
		    } else {
			is = ((Class89_Sub1) this).aShortArray9334;
			is_349_ = ((Class89_Sub1) this).aShortArray9335;
			is_350_ = ((Class89_Sub1) this).aShortArray9371;
			is_351_ = ((Class89_Sub1) this).aByteArray9362;
		    }
		    float f
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    float f_352_
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
			short i_353_
			    = ((Class89_Sub1) this).aShortArray9355[i];
			int i_354_
			    = method15483((((Class89_Sub1) this)
					   .aShortArray9361[i_353_]) & 0xffff,
					  (((Class89_Sub1) this)
					   .aShortArray9348[i_353_]),
					  ((Class89_Sub1) this).aShort9322);
			float f_355_ = ((float) (i_354_ >> 16 & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9563));
			float f_356_ = ((float) (i_354_ >> 8 & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9564));
			float f_357_ = ((float) (i_354_ & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9556));
			byte i_358_ = is_351_[i];
			float f_359_;
			if (i_358_ == 0)
			    f_359_
				= ((((Class89_Sub1) this).aClass103_Sub3_9319
				    .aFloatArray9558[0]) * (float) is[i]
				   + (((Class89_Sub1) this).aClass103_Sub3_9319
				      .aFloatArray9558[1]) * (float) is_349_[i]
				   + ((((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558[2])
				      * (float) is_350_[i])) * 0.0026041667F;
			else
			    f_359_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_349_[i]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_350_[i])
				   / ((float) i_358_ * 256.0F));
			float f_360_
			    = ((((Class89_Sub1) this).aClass103_Sub3_9319
				.aFloat9566)
			       + f_359_ * (f_359_ < 0.0F ? f_352_ : f));
			int i_361_ = (int) (f_355_ * f_360_);
			if (i_361_ < 0)
			    i_361_ = 0;
			else if (i_361_ > 255)
			    i_361_ = 255;
			int i_362_ = (int) (f_356_ * f_360_);
			if (i_362_ < 0)
			    i_362_ = 0;
			else if (i_362_ > 255)
			    i_362_ = 255;
			int i_363_ = (int) (f_357_ * f_360_);
			if (i_363_ < 0)
			    i_363_ = 0;
			else if (i_363_ > 255)
			    i_363_ = 255;
			bytebuffer.putInt(255 - (((Class89_Sub1) this)
						 .aByteArray9344[i_353_]) << 24
					  | i_361_ << 16 | i_362_ << 8
					  | i_363_);
		    }
		} else {
		    for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
			short i_364_
			    = ((Class89_Sub1) this).aShortArray9355[i];
			int i_365_ = (255 - (((Class89_Sub1) this)
					     .aByteArray9344[i_364_]) << 24
				      | method15483(((((Class89_Sub1) this)
						      .aShortArray9361[i_364_])
						     & 0xffff),
						    (((Class89_Sub1) this)
						     .aShortArray9348[i_364_]),
						    (((Class89_Sub1) this)
						     .aShort9322)));
			bytebuffer.putInt(i_365_);
		    }
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9353)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826 = true;
	}
	if (bool_324_) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9354)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9354)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9354)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 12, 12);
	    short[] is;
	    short[] is_366_;
	    short[] is_367_;
	    byte[] is_368_;
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
		      .aShortArray4811);
		is_366_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4813);
		is_367_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4812);
		is_368_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aByteArray4814);
	    } else {
		is = ((Class89_Sub1) this).aShortArray9334;
		is_366_ = ((Class89_Sub1) this).aShortArray9335;
		is_367_ = ((Class89_Sub1) this).aShortArray9371;
		is_368_ = ((Class89_Sub1) this).aByteArray9362;
	    }
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 12;
		long l = interface40.method262(0, i);
		for (int i_369_ = 0; i_369_ < ((Class89_Sub1) this).anInt9378;
		     i_369_++) {
		    Class287 class287 = new Class287((float) is[i_369_],
						     (float) is_366_[i_369_],
						     (float) is_367_[i_369_]);
		    if (class287.method5559() != 0.0F) {
			if (is_368_[i_369_] > 1)
			    class287.method5588((float) is_368_[i_369_]);
			class287.method5573();
		    }
		    unsafe.putFloat(l, class287.aFloat4477);
		    l += 4L;
		    unsafe.putFloat(l, class287.aFloat4474);
		    l += 4L;
		    unsafe.putFloat(l, class287.aFloat4479);
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    Class287 class287
			= new Class287((float) is[i], (float) is_366_[i],
				       (float) is_367_[i]);
		    if (class287.method5559() != 0.0F) {
			if (is_368_[i] > 1)
			    class287.method5588((float) is_368_[i]);
			class287.method5573();
		    }
		    bytebuffer.putFloat(class287.aFloat4477);
		    bytebuffer.putFloat(class287.aFloat4474);
		    bytebuffer.putFloat(class287.aFloat4479);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9354)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4826 = true;
	}
	if (bool_326_) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9341)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9341)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9341)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 8, 8);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 8;
		long l = interface40.method262(0, i);
		for (int i_370_ = 0; i_370_ < ((Class89_Sub1) this).anInt9378;
		     i_370_++) {
		    unsafe.putFloat(l, (((Class89_Sub1) this).aFloatArray9338
					[i_370_]));
		    l += 4L;
		    unsafe.putFloat(l, (((Class89_Sub1) this).aFloatArray9339
					[i_370_]));
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    bytebuffer
			.putFloat(((Class89_Sub1) this).aFloatArray9338[i]);
		    bytebuffer
			.putFloat(((Class89_Sub1) this).aFloatArray9339[i]);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9341)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826 = true;
	}
	return bool_327_;
    }
    
    public void method1911(int i, int i_371_, int i_372_, int i_373_) {
	for (int i_374_ = 0; i_374_ < ((Class89_Sub1) this).anInt9331;
	     i_374_++) {
	    int i_375_
		= ((Class89_Sub1) this).aShortArray9361[i_374_] & 0xffff;
	    int i_376_ = i_375_ >> 10 & 0x3f;
	    int i_377_ = i_375_ >> 7 & 0x7;
	    int i_378_ = i_375_ & 0x7f;
	    if (i != -1)
		i_376_ += (i - i_376_) * i_373_ >> 7;
	    if (i_371_ != -1)
		i_377_ += (i_371_ - i_377_) * i_373_ >> 7;
	    if (i_372_ != -1)
		i_378_ += (i_372_ - i_378_) * i_373_ >> 7;
	    ((Class89_Sub1) this).aShortArray9361[i_374_]
		= (short) (i_376_ << 10 | i_377_ << 7 | i_378_);
	}
	if (((Class89_Sub1) this).aClass315Array9333 != null) {
	    for (int i_379_ = 0; i_379_ < ((Class89_Sub1) this).anInt9375;
		 i_379_++) {
		Class315 class315
		    = ((Class89_Sub1) this).aClass315Array9333[i_379_];
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i_379_];
		((Class381) class381).anInt5661
		    = (((Class381) class381).anInt5661 & ~0xffffff
		       | ((Class474.anIntArray6383
			   [(((Class89_Sub1) this).aShortArray9361
			     [((Class315) class315).anInt4841]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method15474();
    }
    
    public boolean method1912() {
	if (((Class89_Sub1) this).aShortArray9348 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub1) this).aShortArray9348.length;
	     i++) {
	    if (((Class89_Sub1) this).aShortArray9348[i] != -1
		&& !(((Class103_Sub3)
		      ((Class89_Sub1) this).aClass103_Sub3_9319)
			 .aClass379_9518.method6846
		     ((((Class89_Sub1) this).aClass103_Sub3_9319
			   .aClass107_1458.method2680
		       (((Class89_Sub1) this).aShortArray9348[i],
			-1733172421)),
		      -1)))
		return false;
	}
	return true;
    }
    
    public boolean method2052() {
	return ((Class89_Sub1) this).aBool9358;
    }
    
    public void method1890(Class266 class266, Class97 class97, int i) {
	if (aClass365_9317 != null)
	    aClass365_9317.method6557();
	if (class97 != null)
	    class97.aBool1352 = false;
	if (((Class89_Sub1) this).anInt9378 != 0) {
	    Class268 class268
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass268_9521);
	    Class268 class268_380_
		= ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	    Class268 class268_381_
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass268_9646);
	    class268_380_.method5203(class266);
	    class268_381_.method5199(class268_380_);
	    class268_381_.method5202(((Class103_Sub3) (((Class89_Sub1) this)
						       .aClass103_Sub3_9319))
				     .aClass268_9525);
	    if (!((Class89_Sub1) this).aBool9323)
		method15471();
	    float[] fs
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aFloatArray9514);
	    class268_380_.method5208(0.0F,
				     (float) ((Class89_Sub1) this).anInt9363,
				     0.0F, fs);
	    float f = fs[0];
	    float f_382_ = fs[1];
	    float f_383_ = fs[2];
	    class268_380_.method5208(0.0F,
				     (float) ((Class89_Sub1) this).anInt9364,
				     0.0F, fs);
	    float f_384_ = fs[0];
	    float f_385_ = fs[1];
	    float f_386_ = fs[2];
	    for (int i_387_ = 0; i_387_ < 6; i_387_++) {
		float[] fs_388_ = (((Class103_Sub3)
				    ((Class89_Sub1) this).aClass103_Sub3_9319)
				   .aFloatArrayArray9527[i_387_]);
		float f_389_ = (fs_388_[0] * f + fs_388_[1] * f_382_
				+ fs_388_[2] * f_383_ + fs_388_[3]
				+ (float) ((Class89_Sub1) this).anInt9336);
		float f_390_ = (fs_388_[0] * f_384_ + fs_388_[1] * f_385_
				+ fs_388_[2] * f_386_ + fs_388_[3]
				+ (float) ((Class89_Sub1) this).anInt9336);
		if (f_389_ < 0.0F && f_390_ < 0.0F)
		    return;
	    }
	    if (class97 != null) {
		boolean bool = false;
		boolean bool_391_ = true;
		int i_392_ = ((((Class89_Sub1) this).anInt9365
			       + ((Class89_Sub1) this).anInt9366)
			      >> 1);
		int i_393_ = ((((Class89_Sub1) this).anInt9332
			       + ((Class89_Sub1) this).anInt9359)
			      >> 1);
		int i_394_ = i_392_;
		int i_395_ = ((Class89_Sub1) this).anInt9363;
		int i_396_ = i_393_;
		float f_397_
		    = (class268_381_.aFloatArray4353[0] * (float) i_394_
		       + class268_381_.aFloatArray4353[4] * (float) i_395_
		       + class268_381_.aFloatArray4353[8] * (float) i_396_
		       + class268_381_.aFloatArray4353[12]);
		float f_398_
		    = (class268_381_.aFloatArray4353[1] * (float) i_394_
		       + class268_381_.aFloatArray4353[5] * (float) i_395_
		       + class268_381_.aFloatArray4353[9] * (float) i_396_
		       + class268_381_.aFloatArray4353[13]);
		float f_399_
		    = (class268_381_.aFloatArray4353[2] * (float) i_394_
		       + class268_381_.aFloatArray4353[6] * (float) i_395_
		       + class268_381_.aFloatArray4353[10] * (float) i_396_
		       + class268_381_.aFloatArray4353[14]);
		float f_400_
		    = (class268_381_.aFloatArray4353[3] * (float) i_394_
		       + class268_381_.aFloatArray4353[7] * (float) i_395_
		       + class268_381_.aFloatArray4353[11] * (float) i_396_
		       + class268_381_.aFloatArray4353[15]);
		if (f_399_ >= -f_400_) {
		    class97.anInt1349
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9528)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9529) * f_397_ / f_400_);
		    class97.anInt1347
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9530)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9531) * f_398_ / f_400_);
		} else
		    bool = true;
		i_394_ = i_392_;
		i_395_ = ((Class89_Sub1) this).anInt9364;
		i_396_ = i_393_;
		float f_401_
		    = (class268_381_.aFloatArray4353[0] * (float) i_394_
		       + class268_381_.aFloatArray4353[4] * (float) i_395_
		       + class268_381_.aFloatArray4353[8] * (float) i_396_
		       + class268_381_.aFloatArray4353[12]);
		float f_402_
		    = (class268_381_.aFloatArray4353[1] * (float) i_394_
		       + class268_381_.aFloatArray4353[5] * (float) i_395_
		       + class268_381_.aFloatArray4353[9] * (float) i_396_
		       + class268_381_.aFloatArray4353[13]);
		float f_403_
		    = (class268_381_.aFloatArray4353[2] * (float) i_394_
		       + class268_381_.aFloatArray4353[6] * (float) i_395_
		       + class268_381_.aFloatArray4353[10] * (float) i_396_
		       + class268_381_.aFloatArray4353[14]);
		float f_404_
		    = (class268_381_.aFloatArray4353[3] * (float) i_394_
		       + class268_381_.aFloatArray4353[7] * (float) i_395_
		       + class268_381_.aFloatArray4353[11] * (float) i_396_
		       + class268_381_.aFloatArray4353[15]);
		if (f_403_ >= -f_404_) {
		    class97.anInt1350
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9528)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9529) * f_401_ / f_404_);
		    class97.anInt1351
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9530)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9531) * f_402_ / f_404_);
		} else
		    bool = true;
		if (bool) {
		    if (f_399_ < -f_400_ && f_403_ < -f_404_)
			bool_391_ = false;
		    else if (f_399_ < -f_400_) {
			float f_405_
			    = (f_399_ + f_400_) / (f_403_ + f_404_) - 1.0F;
			float f_406_ = f_397_ + f_405_ * (f_401_ - f_397_);
			float f_407_ = f_398_ + f_405_ * (f_402_ - f_398_);
			float f_408_ = f_400_ + f_405_ * (f_404_ - f_400_);
			class97.anInt1349
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_406_ / f_408_));
			class97.anInt1347
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9530)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9531
					* f_407_ / f_408_));
		    } else if (f_403_ < -f_404_) {
			float f_409_
			    = (f_403_ + f_404_) / (f_399_ + f_400_) - 1.0F;
			float f_410_ = f_401_ + f_409_ * (f_397_ - f_401_);
			float f_411_ = f_402_ + f_409_ * (f_398_ - f_402_);
			float f_412_ = f_404_ + f_409_ * (f_400_ - f_404_);
			class97.anInt1350
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_410_ / f_412_));
			class97.anInt1351
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9530)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9531
					* f_411_ / f_412_));
		    }
		}
		if (bool_391_) {
		    if (f_399_ / f_400_ > f_403_ / f_404_) {
			float f_413_
			    = (f_397_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[12]);
			float f_414_
			    = (f_400_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     - (float) class97.anInt1349
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_413_ / f_414_));
		    } else {
			float f_415_
			    = (f_401_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[12]);
			float f_416_
			    = (f_404_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     - (float) class97.anInt1350
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_415_ / f_416_));
		    }
		    class97.aBool1352 = true;
		}
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15815(i);
	    method15479(class266);
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15815(0);
	    class268_380_.method5203(class266);
	    class268_380_.method5202(((Class89_Sub1) this).aClass103_Sub3_9319
				     .aClass268_9504);
	    method15495(class268_380_);
	}
    }
    
    void method1877() {
	/* empty */
    }
    
    public boolean method2022() {
	return ((Class89_Sub1) this).aBool9369;
    }
    
    void method15474() {
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826
		= false;
    }
    
    void method1872(int i, int[] is, int i_417_, int i_418_, int i_419_,
		    boolean bool, int i_420_, int[] is_421_) {
	int i_422_ = is.length;
	if (i == 0) {
	    i_417_ <<= 4;
	    i_418_ <<= 4;
	    i_419_ <<= 4;
	    int i_423_ = 0;
	    ((Class89_Sub1) this).anInt9389 = 0;
	    ((Class89_Sub1) this).anInt9390 = 0;
	    ((Class89_Sub1) this).anInt9391 = 0;
	    for (int i_424_ = 0; i_424_ < i_422_; i_424_++) {
		int i_425_ = is[i_424_];
		if (i_425_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_426_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_425_];
		    for (int i_427_ = 0; i_427_ < is_426_.length; i_427_++) {
			int i_428_ = is_426_[i_427_];
			if (((Class89_Sub1) this).aShortArray9330 == null
			    || (i_420_ & (((Class89_Sub1) this).aShortArray9330
					  [i_428_])) != 0) {
			    ((Class89_Sub1) this).anInt9389
				+= (((Class89_Sub1) this).anIntArray9326
				    [i_428_]);
			    ((Class89_Sub1) this).anInt9390
				+= (((Class89_Sub1) this).anIntArray9327
				    [i_428_]);
			    ((Class89_Sub1) this).anInt9391
				+= (((Class89_Sub1) this).anIntArray9360
				    [i_428_]);
			    i_423_++;
			}
		    }
		}
	    }
	    if (i_423_ > 0) {
		((Class89_Sub1) this).anInt9389
		    = ((Class89_Sub1) this).anInt9389 / i_423_ + i_417_;
		((Class89_Sub1) this).anInt9390
		    = ((Class89_Sub1) this).anInt9390 / i_423_ + i_418_;
		((Class89_Sub1) this).anInt9391
		    = ((Class89_Sub1) this).anInt9391 / i_423_ + i_419_;
		((Class89_Sub1) this).aBool9392 = true;
	    } else {
		((Class89_Sub1) this).anInt9389 = i_417_;
		((Class89_Sub1) this).anInt9390 = i_418_;
		((Class89_Sub1) this).anInt9391 = i_419_;
	    }
	} else if (i == 1) {
	    if (is_421_ != null) {
		int i_429_ = ((is_421_[0] * i_417_ + is_421_[1] * i_418_
			       + is_421_[2] * i_419_ + 8192)
			      >> 14);
		int i_430_ = ((is_421_[3] * i_417_ + is_421_[4] * i_418_
			       + is_421_[5] * i_419_ + 8192)
			      >> 14);
		int i_431_ = ((is_421_[6] * i_417_ + is_421_[7] * i_418_
			       + is_421_[8] * i_419_ + 8192)
			      >> 14);
		i_417_ = i_429_;
		i_418_ = i_430_;
		i_419_ = i_431_;
	    }
	    i_417_ <<= 4;
	    i_418_ <<= 4;
	    i_419_ <<= 4;
	    for (int i_432_ = 0; i_432_ < i_422_; i_432_++) {
		int i_433_ = is[i_432_];
		if (i_433_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_434_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_433_];
		    for (int i_435_ = 0; i_435_ < is_434_.length; i_435_++) {
			int i_436_ = is_434_[i_435_];
			if (((Class89_Sub1) this).aShortArray9330 == null
			    || (i_420_ & (((Class89_Sub1) this).aShortArray9330
					  [i_436_])) != 0) {
			    ((Class89_Sub1) this).anIntArray9326[i_436_]
				+= i_417_;
			    ((Class89_Sub1) this).anIntArray9327[i_436_]
				+= i_418_;
			    ((Class89_Sub1) this).anIntArray9360[i_436_]
				+= i_419_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_421_ != null) {
		int i_437_ = is_421_[9] << 4;
		int i_438_ = is_421_[10] << 4;
		int i_439_ = is_421_[11] << 4;
		int i_440_ = is_421_[12] << 4;
		int i_441_ = is_421_[13] << 4;
		int i_442_ = is_421_[14] << 4;
		if (((Class89_Sub1) this).aBool9392) {
		    int i_443_
			= ((is_421_[0] * ((Class89_Sub1) this).anInt9389
			    + is_421_[3] * ((Class89_Sub1) this).anInt9390
			    + is_421_[6] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_444_
			= ((is_421_[1] * ((Class89_Sub1) this).anInt9389
			    + is_421_[4] * ((Class89_Sub1) this).anInt9390
			    + is_421_[7] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_445_
			= ((is_421_[2] * ((Class89_Sub1) this).anInt9389
			    + is_421_[5] * ((Class89_Sub1) this).anInt9390
			    + is_421_[8] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    i_443_ += i_440_;
		    i_444_ += i_441_;
		    i_445_ += i_442_;
		    ((Class89_Sub1) this).anInt9389 = i_443_;
		    ((Class89_Sub1) this).anInt9390 = i_444_;
		    ((Class89_Sub1) this).anInt9391 = i_445_;
		    ((Class89_Sub1) this).aBool9392 = false;
		}
		int[] is_446_ = new int[9];
		int i_447_ = Class282.anIntArray4441[i_417_];
		int i_448_ = Class282.anIntArray4430[i_417_];
		int i_449_ = Class282.anIntArray4441[i_418_];
		int i_450_ = Class282.anIntArray4430[i_418_];
		int i_451_ = Class282.anIntArray4441[i_419_];
		int i_452_ = Class282.anIntArray4430[i_419_];
		int i_453_ = i_448_ * i_451_ + 8192 >> 14;
		int i_454_ = i_448_ * i_452_ + 8192 >> 14;
		is_446_[0] = i_449_ * i_451_ + i_450_ * i_454_ + 8192 >> 14;
		is_446_[1] = -i_449_ * i_452_ + i_450_ * i_453_ + 8192 >> 14;
		is_446_[2] = i_450_ * i_447_ + 8192 >> 14;
		is_446_[3] = i_447_ * i_452_ + 8192 >> 14;
		is_446_[4] = i_447_ * i_451_ + 8192 >> 14;
		is_446_[5] = -i_448_;
		is_446_[6] = -i_450_ * i_451_ + i_449_ * i_454_ + 8192 >> 14;
		is_446_[7] = i_450_ * i_452_ + i_449_ * i_453_ + 8192 >> 14;
		is_446_[8] = i_449_ * i_447_ + 8192 >> 14;
		int i_455_
		    = ((is_446_[0] * -((Class89_Sub1) this).anInt9389
			+ is_446_[1] * -((Class89_Sub1) this).anInt9390
			+ is_446_[2] * -((Class89_Sub1) this).anInt9391 + 8192)
		       >> 14);
		int i_456_
		    = ((is_446_[3] * -((Class89_Sub1) this).anInt9389
			+ is_446_[4] * -((Class89_Sub1) this).anInt9390
			+ is_446_[5] * -((Class89_Sub1) this).anInt9391 + 8192)
		       >> 14);
		int i_457_
		    = ((is_446_[6] * -((Class89_Sub1) this).anInt9389
			+ is_446_[7] * -((Class89_Sub1) this).anInt9390
			+ is_446_[8] * -((Class89_Sub1) this).anInt9391 + 8192)
		       >> 14);
		int i_458_ = i_455_ + ((Class89_Sub1) this).anInt9389;
		int i_459_ = i_456_ + ((Class89_Sub1) this).anInt9390;
		int i_460_ = i_457_ + ((Class89_Sub1) this).anInt9391;
		int[] is_461_ = new int[9];
		for (int i_462_ = 0; i_462_ < 3; i_462_++) {
		    for (int i_463_ = 0; i_463_ < 3; i_463_++) {
			int i_464_ = 0;
			for (int i_465_ = 0; i_465_ < 3; i_465_++)
			    i_464_ += (is_446_[i_462_ * 3 + i_465_]
				       * is_421_[i_463_ * 3 + i_465_]);
			is_461_[i_462_ * 3 + i_463_] = i_464_ + 8192 >> 14;
		    }
		}
		int i_466_ = ((is_446_[0] * i_440_ + is_446_[1] * i_441_
			       + is_446_[2] * i_442_ + 8192)
			      >> 14);
		int i_467_ = ((is_446_[3] * i_440_ + is_446_[4] * i_441_
			       + is_446_[5] * i_442_ + 8192)
			      >> 14);
		int i_468_ = ((is_446_[6] * i_440_ + is_446_[7] * i_441_
			       + is_446_[8] * i_442_ + 8192)
			      >> 14);
		i_466_ += i_458_;
		i_467_ += i_459_;
		i_468_ += i_460_;
		int[] is_469_ = new int[9];
		for (int i_470_ = 0; i_470_ < 3; i_470_++) {
		    for (int i_471_ = 0; i_471_ < 3; i_471_++) {
			int i_472_ = 0;
			for (int i_473_ = 0; i_473_ < 3; i_473_++)
			    i_472_ += (is_421_[i_470_ * 3 + i_473_]
				       * is_461_[i_471_ + i_473_ * 3]);
			is_469_[i_470_ * 3 + i_471_] = i_472_ + 8192 >> 14;
		    }
		}
		int i_474_ = ((is_421_[0] * i_466_ + is_421_[1] * i_467_
			       + is_421_[2] * i_468_ + 8192)
			      >> 14);
		int i_475_ = ((is_421_[3] * i_466_ + is_421_[4] * i_467_
			       + is_421_[5] * i_468_ + 8192)
			      >> 14);
		int i_476_ = ((is_421_[6] * i_466_ + is_421_[7] * i_467_
			       + is_421_[8] * i_468_ + 8192)
			      >> 14);
		i_474_ += i_437_;
		i_475_ += i_438_;
		i_476_ += i_439_;
		for (int i_477_ = 0; i_477_ < i_422_; i_477_++) {
		    int i_478_ = is[i_477_];
		    if (i_478_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_479_ = (((Class89_Sub1) this)
					 .anIntArrayArray9329[i_478_]);
			for (int i_480_ = 0; i_480_ < is_479_.length;
			     i_480_++) {
			    int i_481_ = is_479_[i_480_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_420_ & (((Class89_Sub1) this)
					       .aShortArray9330[i_481_]))
				    != 0)) {
				int i_482_
				    = (is_469_[0] * (((Class89_Sub1) this)
						     .anIntArray9326[i_481_])
				       + is_469_[1] * (((Class89_Sub1) this)
						       .anIntArray9327[i_481_])
				       + is_469_[2] * (((Class89_Sub1) this)
						       .anIntArray9360[i_481_])
				       + 8192) >> 14;
				int i_483_
				    = (is_469_[3] * (((Class89_Sub1) this)
						     .anIntArray9326[i_481_])
				       + is_469_[4] * (((Class89_Sub1) this)
						       .anIntArray9327[i_481_])
				       + is_469_[5] * (((Class89_Sub1) this)
						       .anIntArray9360[i_481_])
				       + 8192) >> 14;
				int i_484_
				    = (is_469_[6] * (((Class89_Sub1) this)
						     .anIntArray9326[i_481_])
				       + is_469_[7] * (((Class89_Sub1) this)
						       .anIntArray9327[i_481_])
				       + is_469_[8] * (((Class89_Sub1) this)
						       .anIntArray9360[i_481_])
				       + 8192) >> 14;
				i_482_ += i_474_;
				i_483_ += i_475_;
				i_484_ += i_476_;
				((Class89_Sub1) this).anIntArray9326[i_481_]
				    = i_482_;
				((Class89_Sub1) this).anIntArray9327[i_481_]
				    = i_483_;
				((Class89_Sub1) this).anIntArray9360[i_481_]
				    = i_484_;
			    }
			}
		    }
		}
	    } else {
		for (int i_485_ = 0; i_485_ < i_422_; i_485_++) {
		    int i_486_ = is[i_485_];
		    if (i_486_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_487_ = (((Class89_Sub1) this)
					 .anIntArrayArray9329[i_486_]);
			for (int i_488_ = 0; i_488_ < is_487_.length;
			     i_488_++) {
			    int i_489_ = is_487_[i_488_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_420_ & (((Class89_Sub1) this)
					       .aShortArray9330[i_489_]))
				    != 0)) {
				((Class89_Sub1) this).anIntArray9326[i_489_]
				    -= ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_489_]
				    -= ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_489_]
				    -= ((Class89_Sub1) this).anInt9391;
				if (i_419_ != 0) {
				    int i_490_
					= Class282.anIntArray4430[i_419_];
				    int i_491_
					= Class282.anIntArray4441[i_419_];
				    int i_492_
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_489_]) * i_490_
					   + (((Class89_Sub1) this)
					      .anIntArray9326[i_489_]) * i_491_
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9327
					[i_489_]
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_489_]) * i_491_
					   - (((Class89_Sub1) this)
					      .anIntArray9326[i_489_]) * i_490_
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9326
					[i_489_]
					= i_492_;
				}
				if (i_417_ != 0) {
				    int i_493_
					= Class282.anIntArray4430[i_417_];
				    int i_494_
					= Class282.anIntArray4441[i_417_];
				    int i_495_
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_489_]) * i_494_
					   - (((Class89_Sub1) this)
					      .anIntArray9360[i_489_]) * i_493_
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9360
					[i_489_]
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_489_]) * i_493_
					   + (((Class89_Sub1) this)
					      .anIntArray9360[i_489_]) * i_494_
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9327
					[i_489_]
					= i_495_;
				}
				if (i_418_ != 0) {
				    int i_496_
					= Class282.anIntArray4430[i_418_];
				    int i_497_
					= Class282.anIntArray4441[i_418_];
				    int i_498_
					= ((((Class89_Sub1) this)
					    .anIntArray9360[i_489_]) * i_496_
					   + (((Class89_Sub1) this)
					      .anIntArray9326[i_489_]) * i_497_
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9360
					[i_489_]
					= ((((Class89_Sub1) this)
					    .anIntArray9360[i_489_]) * i_497_
					   - (((Class89_Sub1) this)
					      .anIntArray9326[i_489_]) * i_496_
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9326
					[i_489_]
					= i_498_;
				}
				((Class89_Sub1) this).anIntArray9326[i_489_]
				    += ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_489_]
				    += ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_489_]
				    += ((Class89_Sub1) this).anInt9391;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_499_ = 0; i_499_ < i_422_; i_499_++) {
			int i_500_ = is[i_499_];
			if (i_500_ < (((Class89_Sub1) this)
				      .anIntArrayArray9329).length) {
			    int[] is_501_ = (((Class89_Sub1) this)
					     .anIntArrayArray9329[i_500_]);
			    for (int i_502_ = 0; i_502_ < is_501_.length;
				 i_502_++) {
				int i_503_ = is_501_[i_502_];
				if ((((Class89_Sub1) this).aShortArray9330
				     == null)
				    || ((i_420_ & (((Class89_Sub1) this)
						   .aShortArray9330[i_503_]))
					!= 0)) {
				    int i_504_ = (((Class89_Sub1) this)
						  .anIntArray9374[i_503_]);
				    int i_505_ = (((Class89_Sub1) this)
						  .anIntArray9374[i_503_ + 1]);
				    for (int i_506_ = i_504_;
					 (i_506_ < i_505_
					  && (((Class89_Sub1) this)
					      .aShortArray9328[i_506_]) != 0);
					 i_506_++) {
					int i_507_
					    = (((((Class89_Sub1) this)
						 .aShortArray9328[i_506_])
						& 0xffff)
					       - 1);
					if (i_419_ != 0) {
					    int i_508_
						= (Class282.anIntArray4430
						   [i_419_]);
					    int i_509_
						= (Class282.anIntArray4441
						   [i_419_]);
					    int i_510_
						= ((((((Class89_Sub1) this)
						      .aShortArray9335[i_507_])
						     * i_508_)
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_507_]) * i_509_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9335[i_507_]
						= (short) (((((Class89_Sub1)
							      this)
							     .aShortArray9335
							     [i_507_]) * i_509_
							    - ((((Class89_Sub1)
								 this)
								.aShortArray9334
								[i_507_])
							       * i_508_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9334[i_507_]
						= (short) i_510_;
					}
					if (i_417_ != 0) {
					    int i_511_
						= (Class282.anIntArray4430
						   [i_417_]);
					    int i_512_
						= (Class282.anIntArray4441
						   [i_417_]);
					    int i_513_
						= ((((((Class89_Sub1) this)
						      .aShortArray9335[i_507_])
						     * i_512_)
						    - (((Class89_Sub1) this)
						       .aShortArray9371
						       [i_507_]) * i_511_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9371[i_507_]
						= (short) (((((Class89_Sub1)
							      this)
							     .aShortArray9335
							     [i_507_]) * i_511_
							    + ((((Class89_Sub1)
								 this)
								.aShortArray9371
								[i_507_])
							       * i_512_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9335[i_507_]
						= (short) i_513_;
					}
					if (i_418_ != 0) {
					    int i_514_
						= (Class282.anIntArray4430
						   [i_418_]);
					    int i_515_
						= (Class282.anIntArray4441
						   [i_418_]);
					    int i_516_
						= ((((((Class89_Sub1) this)
						      .aShortArray9371[i_507_])
						     * i_514_)
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_507_]) * i_515_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9371[i_507_]
						= (short) (((((Class89_Sub1)
							      this)
							     .aShortArray9371
							     [i_507_]) * i_515_
							    - ((((Class89_Sub1)
								 this)
								.aShortArray9334
								[i_507_])
							       * i_514_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9334[i_507_]
						= (short) i_516_;
					}
				    }
				}
			    }
			}
		    }
		    method15493();
		}
	    }
	} else if (i == 3) {
	    if (is_421_ != null) {
		int i_517_ = is_421_[9] << 4;
		int i_518_ = is_421_[10] << 4;
		int i_519_ = is_421_[11] << 4;
		int i_520_ = is_421_[12] << 4;
		int i_521_ = is_421_[13] << 4;
		int i_522_ = is_421_[14] << 4;
		if (((Class89_Sub1) this).aBool9392) {
		    int i_523_
			= ((is_421_[0] * ((Class89_Sub1) this).anInt9389
			    + is_421_[3] * ((Class89_Sub1) this).anInt9390
			    + is_421_[6] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_524_
			= ((is_421_[1] * ((Class89_Sub1) this).anInt9389
			    + is_421_[4] * ((Class89_Sub1) this).anInt9390
			    + is_421_[7] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_525_
			= ((is_421_[2] * ((Class89_Sub1) this).anInt9389
			    + is_421_[5] * ((Class89_Sub1) this).anInt9390
			    + is_421_[8] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    i_523_ += i_520_;
		    i_524_ += i_521_;
		    i_525_ += i_522_;
		    ((Class89_Sub1) this).anInt9389 = i_523_;
		    ((Class89_Sub1) this).anInt9390 = i_524_;
		    ((Class89_Sub1) this).anInt9391 = i_525_;
		    ((Class89_Sub1) this).aBool9392 = false;
		}
		int i_526_ = i_417_ << 15 >> 7;
		int i_527_ = i_418_ << 15 >> 7;
		int i_528_ = i_419_ << 15 >> 7;
		int i_529_
		    = i_526_ * -((Class89_Sub1) this).anInt9389 + 8192 >> 14;
		int i_530_
		    = i_527_ * -((Class89_Sub1) this).anInt9390 + 8192 >> 14;
		int i_531_
		    = i_528_ * -((Class89_Sub1) this).anInt9391 + 8192 >> 14;
		int i_532_ = i_529_ + ((Class89_Sub1) this).anInt9389;
		int i_533_ = i_530_ + ((Class89_Sub1) this).anInt9390;
		int i_534_ = i_531_ + ((Class89_Sub1) this).anInt9391;
		int[] is_535_ = new int[9];
		is_535_[0] = i_526_ * is_421_[0] + 8192 >> 14;
		is_535_[1] = i_526_ * is_421_[3] + 8192 >> 14;
		is_535_[2] = i_526_ * is_421_[6] + 8192 >> 14;
		is_535_[3] = i_527_ * is_421_[1] + 8192 >> 14;
		is_535_[4] = i_527_ * is_421_[4] + 8192 >> 14;
		is_535_[5] = i_527_ * is_421_[7] + 8192 >> 14;
		is_535_[6] = i_528_ * is_421_[2] + 8192 >> 14;
		is_535_[7] = i_528_ * is_421_[5] + 8192 >> 14;
		is_535_[8] = i_528_ * is_421_[8] + 8192 >> 14;
		int i_536_ = i_526_ * i_520_ + 8192 >> 14;
		int i_537_ = i_527_ * i_521_ + 8192 >> 14;
		int i_538_ = i_528_ * i_522_ + 8192 >> 14;
		i_536_ += i_532_;
		i_537_ += i_533_;
		i_538_ += i_534_;
		int[] is_539_ = new int[9];
		for (int i_540_ = 0; i_540_ < 3; i_540_++) {
		    for (int i_541_ = 0; i_541_ < 3; i_541_++) {
			int i_542_ = 0;
			for (int i_543_ = 0; i_543_ < 3; i_543_++)
			    i_542_ += (is_421_[i_540_ * 3 + i_543_]
				       * is_535_[i_541_ + i_543_ * 3]);
			is_539_[i_540_ * 3 + i_541_] = i_542_ + 8192 >> 14;
		    }
		}
		int i_544_ = ((is_421_[0] * i_536_ + is_421_[1] * i_537_
			       + is_421_[2] * i_538_ + 8192)
			      >> 14);
		int i_545_ = ((is_421_[3] * i_536_ + is_421_[4] * i_537_
			       + is_421_[5] * i_538_ + 8192)
			      >> 14);
		int i_546_ = ((is_421_[6] * i_536_ + is_421_[7] * i_537_
			       + is_421_[8] * i_538_ + 8192)
			      >> 14);
		i_544_ += i_517_;
		i_545_ += i_518_;
		i_546_ += i_519_;
		for (int i_547_ = 0; i_547_ < i_422_; i_547_++) {
		    int i_548_ = is[i_547_];
		    if (i_548_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_549_ = (((Class89_Sub1) this)
					 .anIntArrayArray9329[i_548_]);
			for (int i_550_ = 0; i_550_ < is_549_.length;
			     i_550_++) {
			    int i_551_ = is_549_[i_550_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_420_ & (((Class89_Sub1) this)
					       .aShortArray9330[i_551_]))
				    != 0)) {
				int i_552_
				    = (is_539_[0] * (((Class89_Sub1) this)
						     .anIntArray9326[i_551_])
				       + is_539_[1] * (((Class89_Sub1) this)
						       .anIntArray9327[i_551_])
				       + is_539_[2] * (((Class89_Sub1) this)
						       .anIntArray9360[i_551_])
				       + 8192) >> 14;
				int i_553_
				    = (is_539_[3] * (((Class89_Sub1) this)
						     .anIntArray9326[i_551_])
				       + is_539_[4] * (((Class89_Sub1) this)
						       .anIntArray9327[i_551_])
				       + is_539_[5] * (((Class89_Sub1) this)
						       .anIntArray9360[i_551_])
				       + 8192) >> 14;
				int i_554_
				    = (is_539_[6] * (((Class89_Sub1) this)
						     .anIntArray9326[i_551_])
				       + is_539_[7] * (((Class89_Sub1) this)
						       .anIntArray9327[i_551_])
				       + is_539_[8] * (((Class89_Sub1) this)
						       .anIntArray9360[i_551_])
				       + 8192) >> 14;
				i_552_ += i_544_;
				i_553_ += i_545_;
				i_554_ += i_546_;
				((Class89_Sub1) this).anIntArray9326[i_551_]
				    = i_552_;
				((Class89_Sub1) this).anIntArray9327[i_551_]
				    = i_553_;
				((Class89_Sub1) this).anIntArray9360[i_551_]
				    = i_554_;
			    }
			}
		    }
		}
	    } else {
		for (int i_555_ = 0; i_555_ < i_422_; i_555_++) {
		    int i_556_ = is[i_555_];
		    if (i_556_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_557_ = (((Class89_Sub1) this)
					 .anIntArrayArray9329[i_556_]);
			for (int i_558_ = 0; i_558_ < is_557_.length;
			     i_558_++) {
			    int i_559_ = is_557_[i_558_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_420_ & (((Class89_Sub1) this)
					       .aShortArray9330[i_559_]))
				    != 0)) {
				((Class89_Sub1) this).anIntArray9326[i_559_]
				    -= ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_559_]
				    -= ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_559_]
				    -= ((Class89_Sub1) this).anInt9391;
				((Class89_Sub1) this).anIntArray9326[i_559_]
				    = (((Class89_Sub1) this).anIntArray9326
				       [i_559_]) * i_417_ >> 7;
				((Class89_Sub1) this).anIntArray9327[i_559_]
				    = (((Class89_Sub1) this).anIntArray9327
				       [i_559_]) * i_418_ >> 7;
				((Class89_Sub1) this).anIntArray9360[i_559_]
				    = (((Class89_Sub1) this).anIntArray9360
				       [i_559_]) * i_419_ >> 7;
				((Class89_Sub1) this).anIntArray9326[i_559_]
				    += ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_559_]
				    += ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_559_]
				    += ((Class89_Sub1) this).anInt9391;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_560_ = false;
		for (int i_561_ = 0; i_561_ < i_422_; i_561_++) {
		    int i_562_ = is[i_561_];
		    if (i_562_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_563_ = (((Class89_Sub1) this)
					 .anIntArrayArray9337[i_562_]);
			for (int i_564_ = 0; i_564_ < is_563_.length;
			     i_564_++) {
			    int i_565_ = is_563_[i_564_];
			    if (((Class89_Sub1) this).aShortArray9320 == null
				|| ((i_420_ & (((Class89_Sub1) this)
					       .aShortArray9320[i_565_]))
				    != 0)) {
				int i_566_ = (((((Class89_Sub1) this)
						.aByteArray9344[i_565_])
					       & 0xff)
					      + i_417_ * 8);
				if (i_566_ < 0)
				    i_566_ = 0;
				else if (i_566_ > 255)
				    i_566_ = 255;
				((Class89_Sub1) this).aByteArray9344[i_565_]
				    = (byte) i_566_;
			    }
			}
			bool_560_ = bool_560_ | is_563_.length > 0;
		    }
		}
		if (bool_560_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_567_ = 0;
			     i_567_ < ((Class89_Sub1) this).anInt9375;
			     i_567_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_567_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_567_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & 0xffffff
				   | 255 - ((((Class89_Sub1) this)
					     .aByteArray9344
					     [((Class315) class315).anInt4841])
					    & 0xff) << 24);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_568_ = false;
		for (int i_569_ = 0; i_569_ < i_422_; i_569_++) {
		    int i_570_ = is[i_569_];
		    if (i_570_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_571_ = (((Class89_Sub1) this)
					 .anIntArrayArray9337[i_570_]);
			for (int i_572_ = 0; i_572_ < is_571_.length;
			     i_572_++) {
			    int i_573_ = is_571_[i_572_];
			    if (((Class89_Sub1) this).aShortArray9320 == null
				|| ((i_420_ & (((Class89_Sub1) this)
					       .aShortArray9320[i_573_]))
				    != 0)) {
				int i_574_ = ((((Class89_Sub1) this)
					       .aShortArray9361[i_573_])
					      & 0xffff);
				int i_575_ = i_574_ >> 10 & 0x3f;
				int i_576_ = i_574_ >> 7 & 0x7;
				int i_577_ = i_574_ & 0x7f;
				i_575_ = i_575_ + i_417_ & 0x3f;
				i_576_ += i_418_ / 4;
				if (i_576_ < 0)
				    i_576_ = 0;
				else if (i_576_ > 7)
				    i_576_ = 7;
				i_577_ += i_419_;
				if (i_577_ < 0)
				    i_577_ = 0;
				else if (i_577_ > 127)
				    i_577_ = 127;
				((Class89_Sub1) this).aShortArray9361[i_573_]
				    = (short) (i_575_ << 10 | i_576_ << 7
					       | i_577_);
			    }
			}
			bool_568_ = bool_568_ | is_571_.length > 0;
		    }
		}
		if (bool_568_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_578_ = 0;
			     i_578_ < ((Class89_Sub1) this).anInt9375;
			     i_578_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_578_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_578_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & ~0xffffff
				   | (Class474.anIntArray6383
				      [((((Class89_Sub1) this).aShortArray9361
					 [((Class315) class315).anInt4841])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_579_ = 0; i_579_ < i_422_; i_579_++) {
		    int i_580_ = is[i_579_];
		    if (i_580_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_581_ = (((Class89_Sub1) this)
					 .anIntArrayArray9381[i_580_]);
			for (int i_582_ = 0; i_582_ < is_581_.length;
			     i_582_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_581_[i_582_]]);
			    ((Class381) class381).anInt5664 += i_417_;
			    ((Class381) class381).anInt5665 += i_418_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_583_ = 0; i_583_ < i_422_; i_583_++) {
		    int i_584_ = is[i_583_];
		    if (i_584_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_585_ = (((Class89_Sub1) this)
					 .anIntArrayArray9381[i_584_]);
			for (int i_586_ = 0; i_586_ < is_585_.length;
			     i_586_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_585_[i_586_]]);
			    ((Class381) class381).anInt5662
				= (((Class381) class381).anInt5662 * i_417_
				   >> 7);
			    ((Class381) class381).anInt5663
				= (((Class381) class381).anInt5663 * i_418_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_587_ = 0; i_587_ < i_422_; i_587_++) {
		    int i_588_ = is[i_587_];
		    if (i_588_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_589_ = (((Class89_Sub1) this)
					 .anIntArrayArray9381[i_588_]);
			for (int i_590_ = 0; i_590_ < is_589_.length;
			     i_590_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_589_[i_590_]]);
			    ((Class381) class381).anInt5666
				= (((Class381) class381).anInt5666 + i_417_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method15475() {
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826
		= false;
    }
    
    void method2002(int i, int[] is, int i_591_, int i_592_, int i_593_,
		    int i_594_, boolean bool) {
	int i_595_ = is.length;
	if (i == 0) {
	    i_591_ <<= 4;
	    i_592_ <<= 4;
	    i_593_ <<= 4;
	    int i_596_ = 0;
	    ((Class89_Sub1) this).anInt9389 = 0;
	    ((Class89_Sub1) this).anInt9390 = 0;
	    ((Class89_Sub1) this).anInt9391 = 0;
	    for (int i_597_ = 0; i_597_ < i_595_; i_597_++) {
		int i_598_ = is[i_597_];
		if (i_598_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_599_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_598_];
		    for (int i_600_ = 0; i_600_ < is_599_.length; i_600_++) {
			int i_601_ = is_599_[i_600_];
			((Class89_Sub1) this).anInt9389
			    += ((Class89_Sub1) this).anIntArray9326[i_601_];
			((Class89_Sub1) this).anInt9390
			    += ((Class89_Sub1) this).anIntArray9327[i_601_];
			((Class89_Sub1) this).anInt9391
			    += ((Class89_Sub1) this).anIntArray9360[i_601_];
			i_596_++;
		    }
		}
	    }
	    if (i_596_ > 0) {
		((Class89_Sub1) this).anInt9389
		    = ((Class89_Sub1) this).anInt9389 / i_596_ + i_591_;
		((Class89_Sub1) this).anInt9390
		    = ((Class89_Sub1) this).anInt9390 / i_596_ + i_592_;
		((Class89_Sub1) this).anInt9391
		    = ((Class89_Sub1) this).anInt9391 / i_596_ + i_593_;
	    } else {
		((Class89_Sub1) this).anInt9389 = i_591_;
		((Class89_Sub1) this).anInt9390 = i_592_;
		((Class89_Sub1) this).anInt9391 = i_593_;
	    }
	} else if (i == 1) {
	    i_591_ <<= 4;
	    i_592_ <<= 4;
	    i_593_ <<= 4;
	    for (int i_602_ = 0; i_602_ < i_595_; i_602_++) {
		int i_603_ = is[i_602_];
		if (i_603_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_604_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_603_];
		    for (int i_605_ = 0; i_605_ < is_604_.length; i_605_++) {
			int i_606_ = is_604_[i_605_];
			((Class89_Sub1) this).anIntArray9326[i_606_] += i_591_;
			((Class89_Sub1) this).anIntArray9327[i_606_] += i_592_;
			((Class89_Sub1) this).anIntArray9360[i_606_] += i_593_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_607_ = 0; i_607_ < i_595_; i_607_++) {
		int i_608_ = is[i_607_];
		if (i_608_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_609_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_608_];
		    if ((i_594_ & 0x1) == 0) {
			for (int i_610_ = 0; i_610_ < is_609_.length;
			     i_610_++) {
			    int i_611_ = is_609_[i_610_];
			    ((Class89_Sub1) this).anIntArray9326[i_611_]
				-= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_611_]
				-= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_611_]
				-= ((Class89_Sub1) this).anInt9391;
			    if (i_593_ != 0) {
				int i_612_ = Class282.anIntArray4430[i_593_];
				int i_613_ = Class282.anIntArray4441[i_593_];
				int i_614_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_611_]) * i_612_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_611_]) * i_613_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9327[i_611_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_611_]) * i_613_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_611_]) * i_612_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_611_]
				    = i_614_;
			    }
			    if (i_591_ != 0) {
				int i_615_ = Class282.anIntArray4430[i_591_];
				int i_616_ = Class282.anIntArray4441[i_591_];
				int i_617_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_611_]) * i_616_
					- (((Class89_Sub1) this).anIntArray9360
					   [i_611_]) * i_615_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_611_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_611_]) * i_615_
				       + (((Class89_Sub1) this).anIntArray9360
					  [i_611_]) * i_616_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9327[i_611_]
				    = i_617_;
			    }
			    if (i_592_ != 0) {
				int i_618_ = Class282.anIntArray4430[i_592_];
				int i_619_ = Class282.anIntArray4441[i_592_];
				int i_620_
				    = (((((Class89_Sub1) this).anIntArray9360
					 [i_611_]) * i_618_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_611_]) * i_619_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_611_]
				    = ((((Class89_Sub1) this).anIntArray9360
					[i_611_]) * i_619_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_611_]) * i_618_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_611_]
				    = i_620_;
			    }
			    ((Class89_Sub1) this).anIntArray9326[i_611_]
				+= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_611_]
				+= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_611_]
				+= ((Class89_Sub1) this).anInt9391;
			}
		    } else {
			for (int i_621_ = 0; i_621_ < is_609_.length;
			     i_621_++) {
			    int i_622_ = is_609_[i_621_];
			    ((Class89_Sub1) this).anIntArray9326[i_622_]
				-= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_622_]
				-= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_622_]
				-= ((Class89_Sub1) this).anInt9391;
			    if (i_591_ != 0) {
				int i_623_ = Class282.anIntArray4430[i_591_];
				int i_624_ = Class282.anIntArray4441[i_591_];
				int i_625_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_622_]) * i_624_
					- (((Class89_Sub1) this).anIntArray9360
					   [i_622_]) * i_623_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_622_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_622_]) * i_623_
				       + (((Class89_Sub1) this).anIntArray9360
					  [i_622_]) * i_624_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9327[i_622_]
				    = i_625_;
			    }
			    if (i_593_ != 0) {
				int i_626_ = Class282.anIntArray4430[i_593_];
				int i_627_ = Class282.anIntArray4441[i_593_];
				int i_628_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_622_]) * i_626_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_622_]) * i_627_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9327[i_622_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_622_]) * i_627_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_622_]) * i_626_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_622_]
				    = i_628_;
			    }
			    if (i_592_ != 0) {
				int i_629_ = Class282.anIntArray4430[i_592_];
				int i_630_ = Class282.anIntArray4441[i_592_];
				int i_631_
				    = (((((Class89_Sub1) this).anIntArray9360
					 [i_622_]) * i_629_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_622_]) * i_630_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_622_]
				    = ((((Class89_Sub1) this).anIntArray9360
					[i_622_]) * i_630_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_622_]) * i_629_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_622_]
				    = i_631_;
			    }
			    ((Class89_Sub1) this).anIntArray9326[i_622_]
				+= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_622_]
				+= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_622_]
				+= ((Class89_Sub1) this).anInt9391;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_632_ = 0; i_632_ < i_595_; i_632_++) {
		    int i_633_ = is[i_632_];
		    if (i_633_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_634_ = (((Class89_Sub1) this)
					 .anIntArrayArray9329[i_633_]);
			for (int i_635_ = 0; i_635_ < is_634_.length;
			     i_635_++) {
			    int i_636_ = is_634_[i_635_];
			    int i_637_
				= ((Class89_Sub1) this).anIntArray9374[i_636_];
			    int i_638_ = (((Class89_Sub1) this).anIntArray9374
					  [i_636_ + 1]);
			    for (int i_639_ = i_637_;
				 (i_639_ < i_638_
				  && (((Class89_Sub1) this).aShortArray9328
				      [i_639_]) != 0);
				 i_639_++) {
				int i_640_ = (((((Class89_Sub1) this)
						.aShortArray9328[i_639_])
					       & 0xffff)
					      - 1);
				if (i_593_ != 0) {
				    int i_641_
					= Class282.anIntArray4430[i_593_];
				    int i_642_
					= Class282.anIntArray4441[i_593_];
				    int i_643_
					= (((((Class89_Sub1) this)
					     .aShortArray9335[i_640_]) * i_641_
					    + ((((Class89_Sub1) this)
						.aShortArray9334[i_640_])
					       * i_642_)
					    + 16383)
					   >> 14);
				    ((Class89_Sub1) this).aShortArray9335
					[i_640_]
					= (short) ((((((Class89_Sub1) this)
						      .aShortArray9335[i_640_])
						     * i_642_)
						    - (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_640_]) * i_641_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9334
					[i_640_]
					= (short) i_643_;
				}
				if (i_591_ != 0) {
				    int i_644_
					= Class282.anIntArray4430[i_591_];
				    int i_645_
					= Class282.anIntArray4441[i_591_];
				    int i_646_
					= (((((Class89_Sub1) this)
					     .aShortArray9335[i_640_]) * i_645_
					    - ((((Class89_Sub1) this)
						.aShortArray9371[i_640_])
					       * i_644_)
					    + 16383)
					   >> 14);
				    ((Class89_Sub1) this).aShortArray9371
					[i_640_]
					= (short) ((((((Class89_Sub1) this)
						      .aShortArray9335[i_640_])
						     * i_644_)
						    + (((Class89_Sub1) this)
						       .aShortArray9371
						       [i_640_]) * i_645_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9335
					[i_640_]
					= (short) i_646_;
				}
				if (i_592_ != 0) {
				    int i_647_
					= Class282.anIntArray4430[i_592_];
				    int i_648_
					= Class282.anIntArray4441[i_592_];
				    int i_649_
					= (((((Class89_Sub1) this)
					     .aShortArray9371[i_640_]) * i_647_
					    + ((((Class89_Sub1) this)
						.aShortArray9334[i_640_])
					       * i_648_)
					    + 16383)
					   >> 14);
				    ((Class89_Sub1) this).aShortArray9371
					[i_640_]
					= (short) ((((((Class89_Sub1) this)
						      .aShortArray9371[i_640_])
						     * i_648_)
						    - (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_640_]) * i_647_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9334
					[i_640_]
					= (short) i_649_;
				}
			    }
			}
		    }
		}
		method15493();
	    }
	} else if (i == 3) {
	    for (int i_650_ = 0; i_650_ < i_595_; i_650_++) {
		int i_651_ = is[i_650_];
		if (i_651_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_652_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_651_];
		    for (int i_653_ = 0; i_653_ < is_652_.length; i_653_++) {
			int i_654_ = is_652_[i_653_];
			((Class89_Sub1) this).anIntArray9326[i_654_]
			    -= ((Class89_Sub1) this).anInt9389;
			((Class89_Sub1) this).anIntArray9327[i_654_]
			    -= ((Class89_Sub1) this).anInt9390;
			((Class89_Sub1) this).anIntArray9360[i_654_]
			    -= ((Class89_Sub1) this).anInt9391;
			((Class89_Sub1) this).anIntArray9326[i_654_]
			    = (((Class89_Sub1) this).anIntArray9326[i_654_]
			       * i_591_) >> 7;
			((Class89_Sub1) this).anIntArray9327[i_654_]
			    = (((Class89_Sub1) this).anIntArray9327[i_654_]
			       * i_592_) >> 7;
			((Class89_Sub1) this).anIntArray9360[i_654_]
			    = (((Class89_Sub1) this).anIntArray9360[i_654_]
			       * i_593_) >> 7;
			((Class89_Sub1) this).anIntArray9326[i_654_]
			    += ((Class89_Sub1) this).anInt9389;
			((Class89_Sub1) this).anIntArray9327[i_654_]
			    += ((Class89_Sub1) this).anInt9390;
			((Class89_Sub1) this).anIntArray9360[i_654_]
			    += ((Class89_Sub1) this).anInt9391;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_655_ = false;
		for (int i_656_ = 0; i_656_ < i_595_; i_656_++) {
		    int i_657_ = is[i_656_];
		    if (i_657_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_658_ = (((Class89_Sub1) this)
					 .anIntArrayArray9337[i_657_]);
			for (int i_659_ = 0; i_659_ < is_658_.length;
			     i_659_++) {
			    int i_660_ = is_658_[i_659_];
			    int i_661_
				= (((Class89_Sub1) this).aByteArray9344[i_660_]
				   & 0xff) + i_591_ * 8;
			    if (i_661_ < 0)
				i_661_ = 0;
			    else if (i_661_ > 255)
				i_661_ = 255;
			    ((Class89_Sub1) this).aByteArray9344[i_660_]
				= (byte) i_661_;
			}
			bool_655_ = bool_655_ | is_658_.length > 0;
		    }
		}
		if (bool_655_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_662_ = 0;
			     i_662_ < ((Class89_Sub1) this).anInt9375;
			     i_662_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_662_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_662_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & 0xffffff
				   | 255 - ((((Class89_Sub1) this)
					     .aByteArray9344
					     [((Class315) class315).anInt4841])
					    & 0xff) << 24);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_663_ = false;
		for (int i_664_ = 0; i_664_ < i_595_; i_664_++) {
		    int i_665_ = is[i_664_];
		    if (i_665_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_666_ = (((Class89_Sub1) this)
					 .anIntArrayArray9337[i_665_]);
			for (int i_667_ = 0; i_667_ < is_666_.length;
			     i_667_++) {
			    int i_668_ = is_666_[i_667_];
			    int i_669_ = ((((Class89_Sub1) this)
					   .aShortArray9361[i_668_])
					  & 0xffff);
			    int i_670_ = i_669_ >> 10 & 0x3f;
			    int i_671_ = i_669_ >> 7 & 0x7;
			    int i_672_ = i_669_ & 0x7f;
			    i_670_ = i_670_ + i_591_ & 0x3f;
			    i_671_ += i_592_ / 4;
			    if (i_671_ < 0)
				i_671_ = 0;
			    else if (i_671_ > 7)
				i_671_ = 7;
			    i_672_ += i_593_;
			    if (i_672_ < 0)
				i_672_ = 0;
			    else if (i_672_ > 127)
				i_672_ = 127;
			    ((Class89_Sub1) this).aShortArray9361[i_668_]
				= (short) (i_670_ << 10 | i_671_ << 7
					   | i_672_);
			}
			bool_663_ = bool_663_ | is_666_.length > 0;
		    }
		}
		if (bool_663_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_673_ = 0;
			     i_673_ < ((Class89_Sub1) this).anInt9375;
			     i_673_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_673_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_673_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & ~0xffffff
				   | (Class474.anIntArray6383
				      [((((Class89_Sub1) this).aShortArray9361
					 [((Class315) class315).anInt4841])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_674_ = 0; i_674_ < i_595_; i_674_++) {
		    int i_675_ = is[i_674_];
		    if (i_675_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_676_ = (((Class89_Sub1) this)
					 .anIntArrayArray9381[i_675_]);
			for (int i_677_ = 0; i_677_ < is_676_.length;
			     i_677_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_676_[i_677_]]);
			    ((Class381) class381).anInt5664 += i_591_;
			    ((Class381) class381).anInt5665 += i_592_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_678_ = 0; i_678_ < i_595_; i_678_++) {
		    int i_679_ = is[i_678_];
		    if (i_679_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_680_ = (((Class89_Sub1) this)
					 .anIntArrayArray9381[i_679_]);
			for (int i_681_ = 0; i_681_ < is_680_.length;
			     i_681_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_680_[i_681_]]);
			    ((Class381) class381).anInt5662
				= (((Class381) class381).anInt5662 * i_591_
				   >> 7);
			    ((Class381) class381).anInt5663
				= (((Class381) class381).anInt5663 * i_592_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_682_ = 0; i_682_ < i_595_; i_682_++) {
		    int i_683_ = is[i_682_];
		    if (i_683_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_684_ = (((Class89_Sub1) this)
					 .anIntArrayArray9381[i_683_]);
			for (int i_685_ = 0; i_685_ < is_684_.length;
			     i_685_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_684_[i_685_]]);
			    ((Class381) class381).anInt5666
				= (((Class381) class381).anInt5666 + i_591_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public boolean method1914() {
	return ((Class89_Sub1) this).aBool9369;
    }
    
    public void method1857(Class266 class266, int i, boolean bool) {
	if (((Class89_Sub1) this).aShortArray9330 != null) {
	    Class266 class266_686_ = class266;
	    if (bool) {
		class266_686_
		    = ((Class103_Sub3) (((Class89_Sub1) this)
					.aClass103_Sub3_9319)).aClass266_9588;
		class266_686_.method5153(class266);
	    }
	    float[] fs = new float[3];
	    for (int i_687_ = 0; i_687_ < ((Class89_Sub1) this).anInt9325;
		 i_687_++) {
		if ((i & ((Class89_Sub1) this).aShortArray9330[i_687_]) != 0) {
		    class266_686_.method5119
			((float) ((Class89_Sub1) this).anIntArray9326[i_687_],
			 (float) ((Class89_Sub1) this).anIntArray9327[i_687_],
			 (float) ((Class89_Sub1) this).anIntArray9360[i_687_],
			 fs);
		    ((Class89_Sub1) this).anIntArray9326[i_687_] = (int) fs[0];
		    ((Class89_Sub1) this).anIntArray9327[i_687_] = (int) fs[1];
		    ((Class89_Sub1) this).anIntArray9360[i_687_] = (int) fs[2];
		}
	    }
	}
    }
    
    public Class167[] method1917() {
	return ((Class89_Sub1) this).aClass167Array9377;
    }
    
    public void method2034() {
	for (int i = 0; i < ((Class89_Sub1) this).anInt9325; i++)
	    ((Class89_Sub1) this).anIntArray9360[i]
		= -((Class89_Sub1) this).anIntArray9360[i];
	for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++)
	    ((Class89_Sub1) this).aShortArray9371[i]
		= (short) -((Class89_Sub1) this).aShortArray9371[i];
	for (int i = 0; i < ((Class89_Sub1) this).anInt9331; i++) {
	    short i_688_ = ((Class89_Sub1) this).aShortArray9345[i];
	    ((Class89_Sub1) this).aShortArray9345[i]
		= ((Class89_Sub1) this).aShortArray9368[i];
	    ((Class89_Sub1) this).aShortArray9368[i] = i_688_;
	}
	method15480();
	method15493();
	method15470();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public int method1979() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9380;
    }
    
    public boolean method1891(int i, int i_689_, Class266 class266,
			      boolean bool, int i_690_) {
	return method15476(i, i_689_, 0, 0, class266, bool, i_690_);
    }
    
    boolean method15476(int i, int i_691_, int i_692_, int i_693_,
			Class266 class266, boolean bool, int i_694_) {
	Class268 class268
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3)
			     ((Class89_Sub1) this).aClass103_Sub3_9319)
			    .aClass268_9525);
	boolean bool_695_ = false;
	float f = 3.4028235E38F;
	float f_696_ = -3.4028235E38F;
	float f_697_ = 3.4028235E38F;
	float f_698_ = -3.4028235E38F;
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i_699_ = ((((Class89_Sub1) this).anInt9366
		       - ((Class89_Sub1) this).anInt9365)
		      >> 1);
	int i_700_ = ((((Class89_Sub1) this).anInt9364
		       - ((Class89_Sub1) this).anInt9363)
		      >> 1);
	int i_701_ = ((((Class89_Sub1) this).anInt9359
		       - ((Class89_Sub1) this).anInt9332)
		      >> 1);
	int i_702_ = ((Class89_Sub1) this).anInt9365 + i_699_;
	int i_703_ = ((Class89_Sub1) this).anInt9363 + i_700_;
	int i_704_ = ((Class89_Sub1) this).anInt9332 + i_701_;
	int i_705_ = i_702_ - (i_699_ << i_694_);
	int i_706_ = i_703_ - (i_700_ << i_694_);
	int i_707_ = i_704_ - (i_701_ << i_694_);
	int i_708_ = i_702_ + (i_699_ << i_694_);
	int i_709_ = i_703_ + (i_700_ << i_694_);
	int i_710_ = i_704_ + (i_701_ << i_694_);
	((Class89_Sub1) this).anIntArray9349[0] = i_705_;
	((Class89_Sub1) this).anIntArray9387[0] = i_706_;
	((Class89_Sub1) this).anIntArray9388[0] = i_707_;
	((Class89_Sub1) this).anIntArray9349[1] = i_708_;
	((Class89_Sub1) this).anIntArray9387[1] = i_706_;
	((Class89_Sub1) this).anIntArray9388[1] = i_707_;
	((Class89_Sub1) this).anIntArray9349[2] = i_705_;
	((Class89_Sub1) this).anIntArray9387[2] = i_709_;
	((Class89_Sub1) this).anIntArray9388[2] = i_707_;
	((Class89_Sub1) this).anIntArray9349[3] = i_708_;
	((Class89_Sub1) this).anIntArray9387[3] = i_709_;
	((Class89_Sub1) this).anIntArray9388[3] = i_707_;
	((Class89_Sub1) this).anIntArray9349[4] = i_705_;
	((Class89_Sub1) this).anIntArray9387[4] = i_706_;
	((Class89_Sub1) this).anIntArray9388[4] = i_710_;
	((Class89_Sub1) this).anIntArray9349[5] = i_708_;
	((Class89_Sub1) this).anIntArray9387[5] = i_706_;
	((Class89_Sub1) this).anIntArray9388[5] = i_710_;
	((Class89_Sub1) this).anIntArray9349[6] = i_705_;
	((Class89_Sub1) this).anIntArray9387[6] = i_709_;
	((Class89_Sub1) this).anIntArray9388[6] = i_710_;
	((Class89_Sub1) this).anIntArray9349[7] = i_708_;
	((Class89_Sub1) this).anIntArray9387[7] = i_709_;
	((Class89_Sub1) this).anIntArray9388[7] = i_710_;
	for (int i_711_ = 0; i_711_ < 8; i_711_++) {
	    float f_712_
		= (float) ((Class89_Sub1) this).anIntArray9349[i_711_];
	    float f_713_
		= (float) ((Class89_Sub1) this).anIntArray9387[i_711_];
	    float f_714_
		= (float) ((Class89_Sub1) this).anIntArray9388[i_711_];
	    float f_715_ = (class268.aFloatArray4353[2] * f_712_
			    + class268.aFloatArray4353[6] * f_713_
			    + class268.aFloatArray4353[10] * f_714_
			    + class268.aFloatArray4353[14]);
	    float f_716_ = (class268.aFloatArray4353[3] * f_712_
			    + class268.aFloatArray4353[7] * f_713_
			    + class268.aFloatArray4353[11] * f_714_
			    + class268.aFloatArray4353[15]);
	    if (f_715_ >= -f_716_) {
		float f_717_ = (class268.aFloatArray4353[0] * f_712_
				+ class268.aFloatArray4353[4] * f_713_
				+ class268.aFloatArray4353[8] * f_714_
				+ class268.aFloatArray4353[12]);
		float f_718_ = (class268.aFloatArray4353[1] * f_712_
				+ class268.aFloatArray4353[5] * f_713_
				+ class268.aFloatArray4353[9] * f_714_
				+ class268.aFloatArray4353[13]);
		float f_719_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).aFloat9528
		       + (((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).aFloat9529
			  * f_717_ / f_716_));
		float f_720_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).aFloat9530
		       + (((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).aFloat9531
			  * f_718_ / f_716_));
		if (f_719_ < f)
		    f = f_719_;
		if (f_719_ > f_696_)
		    f_696_ = f_719_;
		if (f_720_ < f_697_)
		    f_697_ = f_720_;
		if (f_720_ > f_698_)
		    f_698_ = f_720_;
		bool_695_ = true;
	    }
	}
	int i_721_ = i + i_692_;
	int i_722_ = i_691_ + i_693_;
	if (bool_695_ && (float) i_721_ > f && (float) i < f_696_
	    && (float) i_722_ > f_697_ && (float) i_691_ < f_698_) {
	    if (bool)
		return true;
	    if (((Class89_Sub1) this).anIntArray9384.length
		< ((Class89_Sub1) this).anInt9378) {
		((Class89_Sub1) this).anIntArray9384
		    = new int[((Class89_Sub1) this).anInt9378];
		((Class89_Sub1) this).anIntArray9385
		    = new int[((Class89_Sub1) this).anInt9378];
	    }
	    for (int i_723_ = 0; i_723_ < ((Class89_Sub1) this).anInt9325;
		 i_723_++) {
		float f_724_
		    = (float) ((Class89_Sub1) this).anIntArray9326[i_723_];
		float f_725_
		    = (float) ((Class89_Sub1) this).anIntArray9327[i_723_];
		float f_726_
		    = (float) ((Class89_Sub1) this).anIntArray9360[i_723_];
		float f_727_ = (class268.aFloatArray4353[2] * f_724_
				+ class268.aFloatArray4353[6] * f_725_
				+ class268.aFloatArray4353[10] * f_726_
				+ class268.aFloatArray4353[14]);
		float f_728_ = (class268.aFloatArray4353[3] * f_724_
				+ class268.aFloatArray4353[7] * f_725_
				+ class268.aFloatArray4353[11] * f_726_
				+ class268.aFloatArray4353[15]);
		if (f_727_ >= -f_728_) {
		    float f_729_ = (class268.aFloatArray4353[0] * f_724_
				    + class268.aFloatArray4353[4] * f_725_
				    + class268.aFloatArray4353[8] * f_726_
				    + class268.aFloatArray4353[12]);
		    float f_730_ = (class268.aFloatArray4353[1] * f_724_
				    + class268.aFloatArray4353[5] * f_725_
				    + class268.aFloatArray4353[9] * f_726_
				    + class268.aFloatArray4353[13]);
		    int i_731_ = ((Class89_Sub1) this).anIntArray9374[i_723_];
		    int i_732_
			= ((Class89_Sub1) this).anIntArray9374[i_723_ + 1];
		    for (int i_733_ = i_731_;
			 (i_733_ < i_732_
			  && (((Class89_Sub1) this).aShortArray9328[i_733_]
			      != 0));
			 i_733_++) {
			int i_734_
			    = ((((Class89_Sub1) this).aShortArray9328[i_733_]
				& 0xffff)
			       - 1);
			((Class89_Sub1) this).anIntArray9384[i_734_]
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_729_ / f_728_));
			((Class89_Sub1) this).anIntArray9385[i_734_]
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9530)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9531
					* f_730_ / f_728_));
		    }
		} else {
		    int i_735_ = ((Class89_Sub1) this).anIntArray9374[i_723_];
		    int i_736_
			= ((Class89_Sub1) this).anIntArray9374[i_723_ + 1];
		    for (int i_737_ = i_735_;
			 (i_737_ < i_736_
			  && (((Class89_Sub1) this).aShortArray9328[i_737_]
			      != 0));
			 i_737_++) {
			int i_738_
			    = ((((Class89_Sub1) this).aShortArray9328[i_737_]
				& 0xffff)
			       - 1);
			((Class89_Sub1) this).anIntArray9384[i_738_] = -999999;
		    }
		}
	    }
	    for (int i_739_ = 0; i_739_ < ((Class89_Sub1) this).anInt9331;
		 i_739_++) {
		if (((((Class89_Sub1) this).anIntArray9384
		      [((Class89_Sub1) this).aShortArray9345[i_739_] & 0xffff])
		     != -999999)
		    && (((Class89_Sub1) this).anIntArray9384
			[(((Class89_Sub1) this).aShortArray9346[i_739_]
			  & 0xffff)]) != -999999
		    && (((Class89_Sub1) this).anIntArray9384
			[(((Class89_Sub1) this).aShortArray9368[i_739_]
			  & 0xffff)]) != -999999
		    && method15477(i, i_691_, i_721_, i_722_,
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9345
				      [i_739_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9346
				      [i_739_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9368
				      [i_739_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9345
				      [i_739_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9346
				      [i_739_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9368
				      [i_739_]) & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method15477(int i, int i_740_, int i_741_, int i_742_, int i_743_,
			int i_744_, int i_745_, int i_746_, int i_747_,
			int i_748_) {
	if (i_742_ < i_743_ && i_742_ < i_744_ && i_742_ < i_745_)
	    return false;
	if (i_740_ > i_743_ && i_740_ > i_744_ && i_740_ > i_745_)
	    return false;
	if (i_741_ < i_746_ && i_741_ < i_747_ && i_741_ < i_748_)
	    return false;
	if (i > i_746_ && i > i_747_ && i > i_748_)
	    return false;
	return true;
    }
    
    public Class241_Sub39_Sub17 method1892
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	if (((Class89_Sub1) this).anInt9378 == 0)
	    return null;
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i;
	int i_749_;
	if ((((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
	     .anInt9520)
	    > 0) {
	    i = ((((Class89_Sub1) this).anInt9365
		  - ((((Class89_Sub1) this).anInt9364
		      * ((Class103_Sub3)
			 ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9520)
		     >> 8))
		 >> ((Class103_Sub3)
		     ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_749_
		= ((((Class89_Sub1) this).anInt9366
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9520)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	} else {
	    i = ((((Class89_Sub1) this).anInt9365
		  - ((((Class89_Sub1) this).anInt9363
		      * ((Class103_Sub3)
			 ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9520)
		     >> 8))
		 >> ((Class103_Sub3)
		     ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_749_
		= ((((Class89_Sub1) this).anInt9366
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9520)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	}
	int i_750_;
	int i_751_;
	if ((((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
	     .anInt9627)
	    > 0) {
	    i_750_
		= ((((Class89_Sub1) this).anInt9332
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_751_
		= ((((Class89_Sub1) this).anInt9359
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	} else {
	    i_750_
		= ((((Class89_Sub1) this).anInt9332
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_751_
		= ((((Class89_Sub1) this).anInt9359
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	}
	int i_752_ = i_749_ - i + 1;
	int i_753_ = i_751_ - i_750_ + 1;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1_754_;
	if (class241_sub39_sub17_sub1 != null
	    && class241_sub39_sub17_sub1.method17674(i_752_, i_753_)) {
	    class241_sub39_sub17_sub1_754_ = class241_sub39_sub17_sub1;
	    class241_sub39_sub17_sub1_754_.method17669();
	} else
	    class241_sub39_sub17_sub1_754_
		= new Class241_Sub39_Sub17_Sub1((((Class89_Sub1) this)
						 .aClass103_Sub3_9319),
						i_752_, i_753_);
	class241_sub39_sub17_sub1_754_.method17670(i, i_750_, i_749_, i_751_);
	method15478(class241_sub39_sub17_sub1_754_);
	return class241_sub39_sub17_sub1_754_;
    }
    
    void method15478(Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1) {
	if (((Class89_Sub1) this).anIntArray9384.length
	    < ((Class89_Sub1) this).anInt9378) {
	    ((Class89_Sub1) this).anIntArray9384
		= new int[((Class89_Sub1) this).anInt9378];
	    ((Class89_Sub1) this).anIntArray9385
		= new int[((Class89_Sub1) this).anInt9378];
	}
	for (int i = 0; i < ((Class89_Sub1) this).anInt9325; i++) {
	    int i_755_
		= (((((Class89_Sub1) this).anIntArray9326[i]
		     - ((((Class89_Sub1) this).anIntArray9327[i]
			 * ((Class103_Sub3) (((Class89_Sub1) this)
					     .aClass103_Sub3_9319)).anInt9520)
			>> 8))
		    >> ((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489)
		   - (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11291));
	    int i_756_
		= (((((Class89_Sub1) this).anIntArray9360[i]
		     - ((((Class89_Sub1) this).anIntArray9327[i]
			 * ((Class103_Sub3) (((Class89_Sub1) this)
					     .aClass103_Sub3_9319)).anInt9627)
			>> 8))
		    >> ((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489)
		   - (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11290));
	    int i_757_ = ((Class89_Sub1) this).anIntArray9374[i];
	    int i_758_ = ((Class89_Sub1) this).anIntArray9374[i + 1];
	    for (int i_759_ = i_757_;
		 (i_759_ < i_758_
		  && ((Class89_Sub1) this).aShortArray9328[i_759_] != 0);
		 i_759_++) {
		int i_760_
		    = ((((Class89_Sub1) this).aShortArray9328[i_759_] & 0xffff)
		       - 1);
		((Class89_Sub1) this).anIntArray9384[i_760_] = i_755_;
		((Class89_Sub1) this).anIntArray9385[i_760_] = i_756_;
	    }
	}
	for (int i = 0; i < ((Class89_Sub1) this).anInt9342; i++) {
	    if (((Class89_Sub1) this).aByteArray9344 == null
		|| ((Class89_Sub1) this).aByteArray9344[i] <= 128) {
		int i_761_ = ((Class89_Sub1) this).aShortArray9345[i] & 0xffff;
		int i_762_ = ((Class89_Sub1) this).aShortArray9346[i] & 0xffff;
		int i_763_ = ((Class89_Sub1) this).aShortArray9368[i] & 0xffff;
		int i_764_ = ((Class89_Sub1) this).anIntArray9384[i_761_];
		int i_765_ = ((Class89_Sub1) this).anIntArray9384[i_762_];
		int i_766_ = ((Class89_Sub1) this).anIntArray9384[i_763_];
		int i_767_ = ((Class89_Sub1) this).anIntArray9385[i_761_];
		int i_768_ = ((Class89_Sub1) this).anIntArray9385[i_762_];
		int i_769_ = ((Class89_Sub1) this).anIntArray9385[i_763_];
		if (((i_764_ - i_765_) * (i_768_ - i_769_)
		     - (i_768_ - i_767_) * (i_766_ - i_765_))
		    > 0)
		    class241_sub39_sub17_sub1.method17676(i_767_, i_768_,
							  i_769_, i_764_,
							  i_765_, i_766_);
	    }
	}
    }
    
    public void method1932(byte i, byte[] is) {
	if (is == null) {
	    for (int i_770_ = 0; i_770_ < ((Class89_Sub1) this).anInt9331;
		 i_770_++)
		((Class89_Sub1) this).aByteArray9344[i_770_] = i;
	} else {
	    for (int i_771_ = 0; i_771_ < ((Class89_Sub1) this).anInt9331;
		 i_771_++) {
		int i_772_ = 255 - ((255 - (is[i_771_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		((Class89_Sub1) this).aByteArray9344[i_771_] = (byte) i_772_;
	    }
	}
	method15474();
    }
    
    void method15479(Class266 class266) {
	if (((Class89_Sub1) this).anInt9342 != 0
	    && (method15481() && method15522())) {
	    if (aClass365_9317 == null) {
		/* empty */
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15728();
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15710();
	    Class361 class361
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass361_9540);
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		(0, (((Class311) ((Class89_Sub1) this).aClass311_9352)
		     .anInterface40_4828));
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		(1, (((Class311) ((Class89_Sub1) this).aClass311_9353)
		     .anInterface40_4828));
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		(2, (((Class311) ((Class89_Sub1) this).aClass311_9341)
		     .anInterface40_4828));
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15718
		(((Class386) ((Class89_Sub1) this).aClass386_9351)
		 .anInterface33_5708);
	    ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		.method5203(class266);
	    class361.method6494(((Class89_Sub1) this).aClass103_Sub3_9319
				.aClass268_9511);
	    class361.aClass268_5510.method5198();
	    if (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		.aBool9565) {
		Class86 class86
		    = ((Class89_Sub1) this).aClass103_Sub3_9319.method15633();
		class361.aClass285_5514.method5548
		    (0.0F, 1.0F, 0.0F,
		     (float) -(((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
			       .anInt9608));
		class361.aClass285_5514.method5531(3.0F
						   / (float) (class86.anInt1252
							      * -1282025259));
		class361.aClass287_5515.method5568
		    (((float) (class86.anInt1251 * 1897985763 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (class86.anInt1251 * 1897985763 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (class86.anInt1251 * 1897985763 >> 0 & 0xff)
		      / 255.0F));
	    } else {
		class361.aClass285_5514.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5515.method5568(0.0F, 0.0F, 0.0F);
	    }
	    if (((Class89_Sub1) this).aClass103_Sub3_9319.anInt9613 > 0) {
		class361.aClass285_5516.method5548(0.0F, 0.0F, 1.0F,
						   -(((Class89_Sub1) this)
						     .aClass103_Sub3_9319
						     .aFloat9615));
		class361.aClass287_5507.method5568
		    ((float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 0
			      & 0xff) / 255.0F);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5203(class266);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5223();
		class361.aClass285_5514.method5543(((Class89_Sub1) this)
						   .aClass103_Sub3_9319
						   .aClass268_9511);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5203(class266);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5202
		    (((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9504);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5223();
		class361.aClass285_5516.method5543(((Class89_Sub1) this)
						   .aClass103_Sub3_9319
						   .aClass268_9511);
		class361.aClass285_5516.method5531(1.0F
						   / ((((Class89_Sub1) this)
						       .aClass103_Sub3_9319
						       .aFloat9616)
						      - (((Class89_Sub1) this)
							 .aClass103_Sub3_9319
							 .aFloat9615)));
	    } else {
		class361.aClass285_5516.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5507.method5568(0.0F, 0.0F, 0.0F);
	    }
	    if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		((Class89_Sub1) this).aClass103_Sub3_9319.method15716
		    (((Class103_Sub3) (((Class89_Sub1) this)
				       .aClass103_Sub3_9319)).aClass366_9641);
		if (((Class89_Sub1) this).aClass103_Sub3_9319.aBool9488)
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15889(false);
		for (int i = 0;
		     i < ((Class89_Sub1) this).anIntArray9386.length; i++) {
		    int i_773_ = ((Class89_Sub1) this).anIntArray9347[i];
		    int i_774_ = ((Class89_Sub1) this).anIntArray9347[i + 1];
		    int i_775_ = ((Class89_Sub1) this).aShortArray9348[i_773_];
		    boolean bool = false;
		    byte i_776_ = 0;
		    if (i_775_ != -1) {
			Class101 class101
			    = ((Class89_Sub1) this).aClass103_Sub3_9319
				  .aClass107_1458
				  .method2680(i_775_ & 0xffff, -1451320238);
			class361.anInterface41_5525
			    = ((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aClass379_9518.method6844(class101);
			bool = !Class628.method13474(class101.aByte1427,
						     -768281831);
			class361.aClass268_5510.aFloatArray4353[12]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1376 / 64.0F
			       % 1.0F);
			class361.aClass268_5510.aFloatArray4353[13]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1396 / 64.0F
			       % 1.0F);
			if (class101.aClass529_1391 == Class529.aClass529_6943)
			    i_776_ = class101.aByte1372;
		    } else {
			class361.anInterface41_5525
			    = (((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInterface41_9584);
			float[] fs = class361.aClass268_5510.aFloatArray4353;
			class361.aClass268_5510.aFloatArray4353[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15707(i_776_);
		    class361.anInt5522
			= ((Class89_Sub1) this).anIntArray9386[i];
		    class361.anInt5523
			= ((Class89_Sub1) this).anIntArray9373[i];
		    class361.anInt5506 = i_773_ * 3;
		    class361.anInt5517 = i_774_ - i_773_;
		    class361.method6495(bool);
		}
	    } else {
		((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		    (3, (((Class311) ((Class89_Sub1) this).aClass311_9354)
			 .anInterface40_4828));
		((Class89_Sub1) this).aClass103_Sub3_9319.method15716
		    (((Class103_Sub3) (((Class89_Sub1) this)
				       .aClass103_Sub3_9319)).aClass366_9602);
		Class266 class266_777_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319)
		       .aClass266_9588);
		class266_777_.method5175(class266);
		class266_777_.method5124();
		int i = 0;
		if (((Class89_Sub1) this).aClass103_Sub3_9319.aBool9488)
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15889(true);
		else {
		    class361.aClass287_5518.method5568((((Class89_Sub1) this)
							.aClass103_Sub3_9319
							.aFloatArray9558[0]),
						       (((Class89_Sub1) this)
							.aClass103_Sub3_9319
							.aFloatArray9558[1]),
						       (((Class89_Sub1) this)
							.aClass103_Sub3_9319
							.aFloatArray9558[2]));
		    class361.aClass287_5518.method5594(class266_777_);
		    class361.aClass287_5519.method5568
			((((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9563)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9564)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9556)));
		    class361.aClass287_5520.method5568
			((-((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9563)),
			 (-((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9564)),
			 (-((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9556)));
		    class361.aClass287_5521.method5568
			((((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9566
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9563)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9566
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9564)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9566
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9556)));
		    if (((Class89_Sub1) this).aClass103_Sub3_9319.anInt9570
			> 0) {
			i = (((Class89_Sub1) this).aClass103_Sub3_9319
			     .anInt9570);
			Class287 class287
			    = (((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
			       .aClass287_9513);
			for (int i_778_ = 0; i_778_ < i; i_778_++) {
			    Class241_Sub43 class241_sub43
				= (((Class89_Sub1) this).aClass103_Sub3_9319
				   .aClass241_Sub43Array9569[i_778_]);
			    int i_779_
				= class241_sub43.method16461(1698158297);
			    class287
				.method5655(class241_sub43.aClass287_10177);
			    class287.method5600(class266_777_);
			    class361.aFloatArray5504[i_778_ * 4 + 0]
				= class287.aFloat4477;
			    class361.aFloatArray5504[i_778_ * 4 + 1]
				= class287.aFloat4474;
			    class361.aFloatArray5504[i_778_ * 4 + 2]
				= class287.aFloat4479;
			    class361.aFloatArray5504[i_778_ * 4 + 3]
				= 1.0F / ((float) class241_sub43
						      .method16468(1143403757)
					  * 2.5F);
			    float f = (class241_sub43.method16458(1857659024)
				       / 255.0F);
			    class361.aFloatArray5524[i_778_ * 4 + 0]
				= (float) (i_779_ >> 16 & 0xff) * f;
			    class361.aFloatArray5524[i_778_ * 4 + 1]
				= (float) (i_779_ >> 8 & 0xff) * f;
			    class361.aFloatArray5524[i_778_ * 4 + 2]
				= (float) (i_779_ & 0xff) * f;
			    class361.aFloatArray5524[i_778_ * 4 + 3] = 1.0F;
			}
		    }
		}
		for (int i_780_ = 0;
		     i_780_ < ((Class89_Sub1) this).anIntArray9386.length;
		     i_780_++) {
		    int i_781_ = ((Class89_Sub1) this).anIntArray9347[i_780_];
		    int i_782_
			= ((Class89_Sub1) this).anIntArray9347[i_780_ + 1];
		    int i_783_ = ((Class89_Sub1) this).aShortArray9348[i_781_];
		    byte i_784_ = 11;
		    Class101 class101 = null;
		    byte i_785_ = 0;
		    if (i_783_ != -1) {
			class101
			    = ((Class89_Sub1) this).aClass103_Sub3_9319
				  .aClass107_1458
				  .method2680(i_783_ & 0xffff, 1031234504);
			class361.anInterface41_5525
			    = ((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aClass379_9518.method6844(class101);
			i_784_ = class101.aByte1427;
			class361.method6493(class101.aByte1428);
			class361.aClass268_5510.aFloatArray4353[12]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1376 / 64.0F
			       % 1.0F);
			class361.aClass268_5510.aFloatArray4353[13]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1396 / 64.0F
			       % 1.0F);
			if (class101.aClass529_1391 == Class529.aClass529_6943)
			    i_785_ = class101.aByte1372;
		    } else {
			class361.anInterface41_5525
			    = (((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInterface41_9584);
			float[] fs = class361.aClass268_5510.aFloatArray4353;
			class361.aClass268_5510.aFloatArray4353[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15707(i_785_);
		    class361.anInt5522
			= ((Class89_Sub1) this).anIntArray9386[i_780_];
		    class361.anInt5523
			= ((Class89_Sub1) this).anIntArray9373[i_780_];
		    class361.anInt5506 = i_781_ * 3;
		    class361.anInt5517 = i_782_ - i_781_;
		    switch (i_784_) {
		    case 6:
			class361.method6495(!Class628.method13474(i_784_,
								  -768281831));
			break;
		    case 1:
			class361.aClass287_5508.method5568
			    ((((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[12]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[13]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[14]));
			class361.aClass287_5508.method5600(class266_777_);
			class361.method6507(i);
			break;
		    case 7:
			class361.aClass287_5508.method5568
			    ((((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[12]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[13]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[14]));
			class361.aClass287_5508.method5600(class266_777_);
			class361.aClass268_5511.method5203(class266);
			class361.anInterface30_5509
			    = ((Class89_Sub1) this).aClass103_Sub3_9319
				  .method15636();
			class361.method6506(i);
			break;
		    case 5:
			if (!((Class89_Sub1) this).aClass103_Sub3_9319
			     .aBool9488) {
			    Class369_Sub1_Sub1 class369_sub1_sub1
				= (((Class103_Sub3)
				    ((Class89_Sub1) this).aClass103_Sub3_9319)
				   .aClass369_Sub1_Sub1_9605);
			    class369_sub1_sub1.method16926(class101.aByte1428,
							   (class101.anInt1429
							    * 133353543),
							   -1385867979);
			    class369_sub1_sub1.aClass268_10675
				.method5203(class266);
			    class369_sub1_sub1.aClass268_10673
				.method5203(class266);
			    class369_sub1_sub1.aClass268_10673.method5202
				(((Class89_Sub1) this).aClass103_Sub3_9319
				 .aClass268_9526);
			    class369_sub1_sub1.anInt10680
				= (((Class89_Sub1) this).anIntArray9386[i_780_]
				   * 338980157);
			    class369_sub1_sub1.anInt10682
				= (((Class89_Sub1) this).anIntArray9373[i_780_]
				   * 653452521);
			    class369_sub1_sub1.anInt10669
				= i_781_ * -1348869755;
			    class369_sub1_sub1.anInt10684
				= (i_782_ - i_781_) * 2090018719;
			    class369_sub1_sub1.method16925(-1309862297);
			} else
			    class361.method6496(i);
			break;
		    default:
			class361.method6496(i);
		    }
		}
	    }
	    method15489();
	}
    }
    
    void method1951() {
	/* empty */
    }
    
    void method15480() {
	if (((Class89_Sub1) this).aClass311_9352 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826
		= false;
    }
    
    boolean method15481() {
	boolean bool
	    = !((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826;
	boolean bool_786_
	    = ((((Class89_Sub1) this).anInt9321 & 0x37) != 0
	       && !(((Class311) ((Class89_Sub1) this).aClass311_9354)
		    .aBool4826));
	boolean bool_787_
	    = !((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826;
	boolean bool_788_
	    = !((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826;
	if (!bool_787_ && !bool && !bool_786_ && !bool_788_)
	    return true;
	boolean bool_789_ = true;
	if (bool_787_ && ((Class89_Sub1) this).aShortArray9350 != null) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9352)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9352)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9352)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 12, 12);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 12;
		long l = interface40.method262(0, i);
		for (int i_790_ = 0; i_790_ < ((Class89_Sub1) this).anInt9378;
		     i_790_++) {
		    short i_791_
			= ((Class89_Sub1) this).aShortArray9350[i_790_];
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9326[i_791_]));
		    l += 4L;
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9327[i_791_]));
		    l += 4L;
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9360[i_791_]));
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9326
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9327
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9360
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9352)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826 = true;
	}
	if (bool) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9353)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9353)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9353)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 4, 4);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 4;
		long l = interface40.method262(0, i);
		if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		    short[] is;
		    short[] is_792_;
		    short[] is_793_;
		    byte[] is_794_;
		    if (((Class89_Sub1) this).aClass307_9340 != null) {
			is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			      .aShortArray4811);
			is_792_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4813;
			is_793_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4812;
			is_794_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aByteArray4814;
		    } else {
			is = ((Class89_Sub1) this).aShortArray9334;
			is_792_ = ((Class89_Sub1) this).aShortArray9335;
			is_793_ = ((Class89_Sub1) this).aShortArray9371;
			is_794_ = ((Class89_Sub1) this).aByteArray9362;
		    }
		    float f
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    float f_795_
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    for (int i_796_ = 0;
			 i_796_ < ((Class89_Sub1) this).anInt9378; i_796_++) {
			short i_797_
			    = ((Class89_Sub1) this).aShortArray9355[i_796_];
			int i_798_
			    = method15483((((Class89_Sub1) this)
					   .aShortArray9361[i_797_]) & 0xffff,
					  (((Class89_Sub1) this)
					   .aShortArray9348[i_797_]),
					  ((Class89_Sub1) this).aShort9322);
			float f_799_ = ((float) (i_798_ >> 16 & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9563));
			float f_800_ = ((float) (i_798_ >> 8 & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9564));
			float f_801_ = ((float) (i_798_ & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9556));
			byte i_802_ = is_794_[i_796_];
			float f_803_;
			if (i_802_ == 0)
			    f_803_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i_796_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_792_[i_796_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_793_[i_796_])
				   * 0.0026041667F);
			else
			    f_803_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i_796_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_792_[i_796_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_793_[i_796_])
				   / ((float) i_802_ * 256.0F));
			float f_804_
			    = ((((Class89_Sub1) this).aClass103_Sub3_9319
				.aFloat9566)
			       + f_803_ * (f_803_ < 0.0F ? f_795_ : f));
			int i_805_ = (int) (f_799_ * f_804_);
			if (i_805_ < 0)
			    i_805_ = 0;
			else if (i_805_ > 255)
			    i_805_ = 255;
			int i_806_ = (int) (f_800_ * f_804_);
			if (i_806_ < 0)
			    i_806_ = 0;
			else if (i_806_ > 255)
			    i_806_ = 255;
			int i_807_ = (int) (f_801_ * f_804_);
			if (i_807_ < 0)
			    i_807_ = 0;
			else if (i_807_ > 255)
			    i_807_ = 255;
			unsafe.putInt(l,
				      (255 - (((Class89_Sub1) this)
					      .aByteArray9344[i_797_]) << 24
				       | i_805_ << 16 | i_806_ << 8 | i_807_));
			l += 4L;
		    }
		} else {
		    for (int i_808_ = 0;
			 i_808_ < ((Class89_Sub1) this).anInt9378; i_808_++) {
			short i_809_
			    = ((Class89_Sub1) this).aShortArray9355[i_808_];
			int i_810_ = (255 - (((Class89_Sub1) this)
					     .aByteArray9344[i_809_]) << 24
				      | method15483(((((Class89_Sub1) this)
						      .aShortArray9361[i_809_])
						     & 0xffff),
						    (((Class89_Sub1) this)
						     .aShortArray9348[i_809_]),
						    (((Class89_Sub1) this)
						     .aShort9322)));
			unsafe.putInt(l, i_810_);
			l += 4L;
		    }
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		    short[] is;
		    short[] is_811_;
		    short[] is_812_;
		    byte[] is_813_;
		    if (((Class89_Sub1) this).aClass307_9340 != null) {
			is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			      .aShortArray4811);
			is_811_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4813;
			is_812_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4812;
			is_813_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aByteArray4814;
		    } else {
			is = ((Class89_Sub1) this).aShortArray9334;
			is_811_ = ((Class89_Sub1) this).aShortArray9335;
			is_812_ = ((Class89_Sub1) this).aShortArray9371;
			is_813_ = ((Class89_Sub1) this).aByteArray9362;
		    }
		    float f
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    float f_814_
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
			short i_815_
			    = ((Class89_Sub1) this).aShortArray9355[i];
			int i_816_
			    = method15483((((Class89_Sub1) this)
					   .aShortArray9361[i_815_]) & 0xffff,
					  (((Class89_Sub1) this)
					   .aShortArray9348[i_815_]),
					  ((Class89_Sub1) this).aShort9322);
			float f_817_ = ((float) (i_816_ >> 16 & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9563));
			float f_818_ = ((float) (i_816_ >> 8 & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9564));
			float f_819_ = ((float) (i_816_ & 0xff)
					* (((Class89_Sub1) this)
					   .aClass103_Sub3_9319.aFloat9556));
			byte i_820_ = is_813_[i];
			float f_821_;
			if (i_820_ == 0)
			    f_821_
				= ((((Class89_Sub1) this).aClass103_Sub3_9319
				    .aFloatArray9558[0]) * (float) is[i]
				   + (((Class89_Sub1) this).aClass103_Sub3_9319
				      .aFloatArray9558[1]) * (float) is_811_[i]
				   + ((((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558[2])
				      * (float) is_812_[i])) * 0.0026041667F;
			else
			    f_821_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_811_[i]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_812_[i])
				   / ((float) i_820_ * 256.0F));
			float f_822_
			    = ((((Class89_Sub1) this).aClass103_Sub3_9319
				.aFloat9566)
			       + f_821_ * (f_821_ < 0.0F ? f_814_ : f));
			int i_823_ = (int) (f_817_ * f_822_);
			if (i_823_ < 0)
			    i_823_ = 0;
			else if (i_823_ > 255)
			    i_823_ = 255;
			int i_824_ = (int) (f_818_ * f_822_);
			if (i_824_ < 0)
			    i_824_ = 0;
			else if (i_824_ > 255)
			    i_824_ = 255;
			int i_825_ = (int) (f_819_ * f_822_);
			if (i_825_ < 0)
			    i_825_ = 0;
			else if (i_825_ > 255)
			    i_825_ = 255;
			bytebuffer.putInt(255 - (((Class89_Sub1) this)
						 .aByteArray9344[i_815_]) << 24
					  | i_823_ << 16 | i_824_ << 8
					  | i_825_);
		    }
		} else {
		    for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
			short i_826_
			    = ((Class89_Sub1) this).aShortArray9355[i];
			int i_827_ = (255 - (((Class89_Sub1) this)
					     .aByteArray9344[i_826_]) << 24
				      | method15483(((((Class89_Sub1) this)
						      .aShortArray9361[i_826_])
						     & 0xffff),
						    (((Class89_Sub1) this)
						     .aShortArray9348[i_826_]),
						    (((Class89_Sub1) this)
						     .aShort9322)));
			bytebuffer.putInt(i_827_);
		    }
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9353)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826 = true;
	}
	if (bool_786_) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9354)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9354)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9354)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 12, 12);
	    short[] is;
	    short[] is_828_;
	    short[] is_829_;
	    byte[] is_830_;
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
		      .aShortArray4811);
		is_828_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4813);
		is_829_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4812);
		is_830_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aByteArray4814);
	    } else {
		is = ((Class89_Sub1) this).aShortArray9334;
		is_828_ = ((Class89_Sub1) this).aShortArray9335;
		is_829_ = ((Class89_Sub1) this).aShortArray9371;
		is_830_ = ((Class89_Sub1) this).aByteArray9362;
	    }
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 12;
		long l = interface40.method262(0, i);
		for (int i_831_ = 0; i_831_ < ((Class89_Sub1) this).anInt9378;
		     i_831_++) {
		    Class287 class287 = new Class287((float) is[i_831_],
						     (float) is_828_[i_831_],
						     (float) is_829_[i_831_]);
		    if (class287.method5559() != 0.0F) {
			if (is_830_[i_831_] > 1)
			    class287.method5588((float) is_830_[i_831_]);
			class287.method5573();
		    }
		    unsafe.putFloat(l, class287.aFloat4477);
		    l += 4L;
		    unsafe.putFloat(l, class287.aFloat4474);
		    l += 4L;
		    unsafe.putFloat(l, class287.aFloat4479);
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    Class287 class287
			= new Class287((float) is[i], (float) is_828_[i],
				       (float) is_829_[i]);
		    if (class287.method5559() != 0.0F) {
			if (is_830_[i] > 1)
			    class287.method5588((float) is_830_[i]);
			class287.method5573();
		    }
		    bytebuffer.putFloat(class287.aFloat4477);
		    bytebuffer.putFloat(class287.aFloat4474);
		    bytebuffer.putFloat(class287.aFloat4479);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9354)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4826 = true;
	}
	if (bool_788_) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9341)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9341)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9341)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 8, 8);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 8;
		long l = interface40.method262(0, i);
		for (int i_832_ = 0; i_832_ < ((Class89_Sub1) this).anInt9378;
		     i_832_++) {
		    unsafe.putFloat(l, (((Class89_Sub1) this).aFloatArray9338
					[i_832_]));
		    l += 4L;
		    unsafe.putFloat(l, (((Class89_Sub1) this).aFloatArray9339
					[i_832_]));
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    bytebuffer
			.putFloat(((Class89_Sub1) this).aFloatArray9338[i]);
		    bytebuffer
			.putFloat(((Class89_Sub1) this).aFloatArray9339[i]);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9341)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826 = true;
	}
	return bool_789_;
    }
    
    boolean method1884() {
	if (((Class89_Sub1) this).anIntArrayArray9329 == null)
	    return false;
	for (int i = 0; i < ((Class89_Sub1) this).anInt9324; i++) {
	    ((Class89_Sub1) this).anIntArray9326[i] <<= 4;
	    ((Class89_Sub1) this).anIntArray9327[i] <<= 4;
	    ((Class89_Sub1) this).anIntArray9360[i] <<= 4;
	}
	((Class89_Sub1) this).anInt9389 = 0;
	((Class89_Sub1) this).anInt9390 = 0;
	((Class89_Sub1) this).anInt9391 = 0;
	return true;
    }
    
    public void method1885(int i) {
	((Class89_Sub1) this).aShort9383 = (short) i;
	method15480();
	method15493();
    }
    
    public int method1895() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9365;
    }
    
    public Class167[] method2016() {
	return ((Class89_Sub1) this).aClass167Array9377;
    }
    
    public void method1942(Class89 class89, int i, int i_833_, int i_834_,
			   boolean bool) {
	Class89_Sub1 class89_sub1_835_ = (Class89_Sub1) class89;
	if (((Class89_Sub1) this).anInt9331 != 0
	    && ((Class89_Sub1) class89_sub1_835_).anInt9331 != 0) {
	    int i_836_ = ((Class89_Sub1) class89_sub1_835_).anInt9325;
	    int[] is = ((Class89_Sub1) class89_sub1_835_).anIntArray9326;
	    int[] is_837_ = ((Class89_Sub1) class89_sub1_835_).anIntArray9327;
	    int[] is_838_ = ((Class89_Sub1) class89_sub1_835_).anIntArray9360;
	    short[] is_839_
		= ((Class89_Sub1) class89_sub1_835_).aShortArray9334;
	    short[] is_840_
		= ((Class89_Sub1) class89_sub1_835_).aShortArray9335;
	    short[] is_841_
		= ((Class89_Sub1) class89_sub1_835_).aShortArray9371;
	    byte[] is_842_ = ((Class89_Sub1) class89_sub1_835_).aByteArray9362;
	    short[] is_843_;
	    short[] is_844_;
	    short[] is_845_;
	    byte[] is_846_;
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		is_843_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4811);
		is_844_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4813);
		is_845_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4812);
		is_846_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aByteArray4814);
	    } else {
		is_843_ = null;
		is_844_ = null;
		is_845_ = null;
		is_846_ = null;
	    }
	    short[] is_847_;
	    short[] is_848_;
	    short[] is_849_;
	    byte[] is_850_;
	    if (((Class89_Sub1) class89_sub1_835_).aClass307_9340 != null) {
		is_847_ = ((Class307) (((Class89_Sub1) class89_sub1_835_)
				       .aClass307_9340)).aShortArray4811;
		is_848_ = ((Class307) (((Class89_Sub1) class89_sub1_835_)
				       .aClass307_9340)).aShortArray4813;
		is_849_ = ((Class307) (((Class89_Sub1) class89_sub1_835_)
				       .aClass307_9340)).aShortArray4812;
		is_850_ = ((Class307) (((Class89_Sub1) class89_sub1_835_)
				       .aClass307_9340)).aByteArray4814;
	    } else {
		is_847_ = null;
		is_848_ = null;
		is_849_ = null;
		is_850_ = null;
	    }
	    int[] is_851_ = ((Class89_Sub1) class89_sub1_835_).anIntArray9374;
	    short[] is_852_
		= ((Class89_Sub1) class89_sub1_835_).aShortArray9328;
	    if (!((Class89_Sub1) class89_sub1_835_).aBool9323)
		class89_sub1_835_.method15471();
	    int i_853_ = ((Class89_Sub1) class89_sub1_835_).anInt9363;
	    int i_854_ = ((Class89_Sub1) class89_sub1_835_).anInt9364;
	    int i_855_ = ((Class89_Sub1) class89_sub1_835_).anInt9365;
	    int i_856_ = ((Class89_Sub1) class89_sub1_835_).anInt9366;
	    int i_857_ = ((Class89_Sub1) class89_sub1_835_).anInt9332;
	    int i_858_ = ((Class89_Sub1) class89_sub1_835_).anInt9359;
	    for (int i_859_ = 0; i_859_ < ((Class89_Sub1) this).anInt9325;
		 i_859_++) {
		int i_860_
		    = ((Class89_Sub1) this).anIntArray9327[i_859_] - i_833_;
		if (i_860_ >= i_853_ && i_860_ <= i_854_) {
		    int i_861_
			= ((Class89_Sub1) this).anIntArray9326[i_859_] - i;
		    if (i_861_ >= i_855_ && i_861_ <= i_856_) {
			int i_862_
			    = (((Class89_Sub1) this).anIntArray9360[i_859_]
			       - i_834_);
			if (i_862_ >= i_857_ && i_862_ <= i_858_) {
			    int i_863_ = -1;
			    int i_864_
				= ((Class89_Sub1) this).anIntArray9374[i_859_];
			    int i_865_ = (((Class89_Sub1) this).anIntArray9374
					  [i_859_ + 1]);
			    for (int i_866_ = i_864_;
				 (i_866_ < i_865_
				  && (((Class89_Sub1) this).aShortArray9328
				      [i_866_]) != 0);
				 i_866_++) {
				i_863_ = ((((Class89_Sub1) this)
					   .aShortArray9328[i_866_])
					  & 0xffff) - 1;
				if ((((Class89_Sub1) this).aByteArray9362
				     [i_863_])
				    != 0)
				    break;
			    }
			    if (i_863_ != -1) {
				for (int i_867_ = 0; i_867_ < i_836_;
				     i_867_++) {
				    if (i_861_ == is[i_867_]
					&& i_862_ == is_838_[i_867_]
					&& i_860_ == is_837_[i_867_]) {
					int i_868_ = -1;
					i_864_ = is_851_[i_867_];
					i_865_ = is_851_[i_867_ + 1];
					for (int i_869_ = i_864_;
					     (i_869_ < i_865_
					      && is_852_[i_869_] != 0);
					     i_869_++) {
					    i_868_
						= is_852_[i_869_] - 1 & 0xffff;
					    if (is_842_[i_868_] != 0)
						break;
					}
					if (i_868_ != -1) {
					    if (is_843_ == null) {
						((Class89_Sub1) this)
						    .aClass307_9340
						    = new Class307();
						is_843_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4811
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9334),
							-603759570));
						is_844_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4813
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9335),
							-888868455));
						is_845_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4812
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9371),
							-659414272));
						is_846_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aByteArray4814
						    = (Class554.method12275
						       ((((Class89_Sub1) this)
							 .aByteArray9362),
							-841739618));
					    }
					    if (is_847_ == null) {
						Class307 class307
						    = (((Class89_Sub1)
							class89_sub1_835_)
							   .aClass307_9340
						       = new Class307());
						is_847_
						    = ((Class307) class307)
							  .aShortArray4811
						    = (Class518.method11659
						       (is_839_, -1229852861));
						is_848_
						    = ((Class307) class307)
							  .aShortArray4813
						    = (Class518.method11659
						       (is_840_, -1873597561));
						is_849_
						    = ((Class307) class307)
							  .aShortArray4812
						    = (Class518.method11659
						       (is_841_, -796434430));
						is_850_
						    = ((Class307) class307)
							  .aByteArray4814
						    = (Class554.method12275
						       (is_842_, -841739618));
					    }
					    short i_870_
						= (((Class89_Sub1) this)
						   .aShortArray9334[i_863_]);
					    short i_871_
						= (((Class89_Sub1) this)
						   .aShortArray9335[i_863_]);
					    short i_872_
						= (((Class89_Sub1) this)
						   .aShortArray9371[i_863_]);
					    byte i_873_
						= (((Class89_Sub1) this)
						   .aByteArray9362[i_863_]);
					    i_864_ = is_851_[i_867_];
					    i_865_ = is_851_[i_867_ + 1];
					    for (int i_874_ = i_864_;
						 i_874_ < i_865_; i_874_++) {
						int i_875_
						    = is_852_[i_874_] - 1;
						if (i_875_ == -1)
						    break;
						if (is_850_[i_875_] != 0) {
						    is_847_[i_875_] += i_870_;
						    is_848_[i_875_] += i_871_;
						    is_849_[i_875_] += i_872_;
						    is_850_[i_875_] += i_873_;
						}
					    }
					    i_870_ = is_839_[i_868_];
					    i_871_ = is_840_[i_868_];
					    i_872_ = is_841_[i_868_];
					    i_873_ = is_842_[i_868_];
					    i_864_ = (((Class89_Sub1) this)
						      .anIntArray9374[i_859_]);
					    i_865_ = (((Class89_Sub1) this)
						      .anIntArray9374
						      [i_859_ + 1]);
					    for (int i_876_ = i_864_;
						 (i_876_ < i_865_
						  && (((Class89_Sub1) this)
						      .aShortArray9328
						      [i_876_]) != 0);
						 i_876_++) {
						int i_877_
						    = (((((Class89_Sub1) this)
							 .aShortArray9328
							 [i_876_])
							& 0xffff)
						       - 1);
						if (is_846_[i_877_] != 0) {
						    is_843_[i_877_] += i_870_;
						    is_844_[i_877_] += i_871_;
						    is_845_[i_877_] += i_872_;
						    is_846_[i_877_] += i_873_;
						}
					    }
					    class89_sub1_835_.method15493();
					    method15493();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method1921(Class89 class89, int i, int i_878_, int i_879_,
			   boolean bool) {
	Class89_Sub1 class89_sub1_880_ = (Class89_Sub1) class89;
	if (((Class89_Sub1) this).anInt9331 != 0
	    && ((Class89_Sub1) class89_sub1_880_).anInt9331 != 0) {
	    int i_881_ = ((Class89_Sub1) class89_sub1_880_).anInt9325;
	    int[] is = ((Class89_Sub1) class89_sub1_880_).anIntArray9326;
	    int[] is_882_ = ((Class89_Sub1) class89_sub1_880_).anIntArray9327;
	    int[] is_883_ = ((Class89_Sub1) class89_sub1_880_).anIntArray9360;
	    short[] is_884_
		= ((Class89_Sub1) class89_sub1_880_).aShortArray9334;
	    short[] is_885_
		= ((Class89_Sub1) class89_sub1_880_).aShortArray9335;
	    short[] is_886_
		= ((Class89_Sub1) class89_sub1_880_).aShortArray9371;
	    byte[] is_887_ = ((Class89_Sub1) class89_sub1_880_).aByteArray9362;
	    short[] is_888_;
	    short[] is_889_;
	    short[] is_890_;
	    byte[] is_891_;
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		is_888_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4811);
		is_889_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4813);
		is_890_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4812);
		is_891_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aByteArray4814);
	    } else {
		is_888_ = null;
		is_889_ = null;
		is_890_ = null;
		is_891_ = null;
	    }
	    short[] is_892_;
	    short[] is_893_;
	    short[] is_894_;
	    byte[] is_895_;
	    if (((Class89_Sub1) class89_sub1_880_).aClass307_9340 != null) {
		is_892_ = ((Class307) (((Class89_Sub1) class89_sub1_880_)
				       .aClass307_9340)).aShortArray4811;
		is_893_ = ((Class307) (((Class89_Sub1) class89_sub1_880_)
				       .aClass307_9340)).aShortArray4813;
		is_894_ = ((Class307) (((Class89_Sub1) class89_sub1_880_)
				       .aClass307_9340)).aShortArray4812;
		is_895_ = ((Class307) (((Class89_Sub1) class89_sub1_880_)
				       .aClass307_9340)).aByteArray4814;
	    } else {
		is_892_ = null;
		is_893_ = null;
		is_894_ = null;
		is_895_ = null;
	    }
	    int[] is_896_ = ((Class89_Sub1) class89_sub1_880_).anIntArray9374;
	    short[] is_897_
		= ((Class89_Sub1) class89_sub1_880_).aShortArray9328;
	    if (!((Class89_Sub1) class89_sub1_880_).aBool9323)
		class89_sub1_880_.method15471();
	    int i_898_ = ((Class89_Sub1) class89_sub1_880_).anInt9363;
	    int i_899_ = ((Class89_Sub1) class89_sub1_880_).anInt9364;
	    int i_900_ = ((Class89_Sub1) class89_sub1_880_).anInt9365;
	    int i_901_ = ((Class89_Sub1) class89_sub1_880_).anInt9366;
	    int i_902_ = ((Class89_Sub1) class89_sub1_880_).anInt9332;
	    int i_903_ = ((Class89_Sub1) class89_sub1_880_).anInt9359;
	    for (int i_904_ = 0; i_904_ < ((Class89_Sub1) this).anInt9325;
		 i_904_++) {
		int i_905_
		    = ((Class89_Sub1) this).anIntArray9327[i_904_] - i_878_;
		if (i_905_ >= i_898_ && i_905_ <= i_899_) {
		    int i_906_
			= ((Class89_Sub1) this).anIntArray9326[i_904_] - i;
		    if (i_906_ >= i_900_ && i_906_ <= i_901_) {
			int i_907_
			    = (((Class89_Sub1) this).anIntArray9360[i_904_]
			       - i_879_);
			if (i_907_ >= i_902_ && i_907_ <= i_903_) {
			    int i_908_ = -1;
			    int i_909_
				= ((Class89_Sub1) this).anIntArray9374[i_904_];
			    int i_910_ = (((Class89_Sub1) this).anIntArray9374
					  [i_904_ + 1]);
			    for (int i_911_ = i_909_;
				 (i_911_ < i_910_
				  && (((Class89_Sub1) this).aShortArray9328
				      [i_911_]) != 0);
				 i_911_++) {
				i_908_ = ((((Class89_Sub1) this)
					   .aShortArray9328[i_911_])
					  & 0xffff) - 1;
				if ((((Class89_Sub1) this).aByteArray9362
				     [i_908_])
				    != 0)
				    break;
			    }
			    if (i_908_ != -1) {
				for (int i_912_ = 0; i_912_ < i_881_;
				     i_912_++) {
				    if (i_906_ == is[i_912_]
					&& i_907_ == is_883_[i_912_]
					&& i_905_ == is_882_[i_912_]) {
					int i_913_ = -1;
					i_909_ = is_896_[i_912_];
					i_910_ = is_896_[i_912_ + 1];
					for (int i_914_ = i_909_;
					     (i_914_ < i_910_
					      && is_897_[i_914_] != 0);
					     i_914_++) {
					    i_913_
						= is_897_[i_914_] - 1 & 0xffff;
					    if (is_887_[i_913_] != 0)
						break;
					}
					if (i_913_ != -1) {
					    if (is_888_ == null) {
						((Class89_Sub1) this)
						    .aClass307_9340
						    = new Class307();
						is_888_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4811
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9334),
							-585403883));
						is_889_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4813
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9335),
							-2072650551));
						is_890_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4812
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9371),
							-2132317191));
						is_891_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aByteArray4814
						    = (Class554.method12275
						       ((((Class89_Sub1) this)
							 .aByteArray9362),
							-841739618));
					    }
					    if (is_892_ == null) {
						Class307 class307
						    = (((Class89_Sub1)
							class89_sub1_880_)
							   .aClass307_9340
						       = new Class307());
						is_892_
						    = ((Class307) class307)
							  .aShortArray4811
						    = (Class518.method11659
						       (is_884_, -1134708370));
						is_893_
						    = ((Class307) class307)
							  .aShortArray4813
						    = (Class518.method11659
						       (is_885_, -1879999239));
						is_894_
						    = ((Class307) class307)
							  .aShortArray4812
						    = (Class518.method11659
						       (is_886_, -2127850547));
						is_895_
						    = ((Class307) class307)
							  .aByteArray4814
						    = (Class554.method12275
						       (is_887_, -841739618));
					    }
					    short i_915_
						= (((Class89_Sub1) this)
						   .aShortArray9334[i_908_]);
					    short i_916_
						= (((Class89_Sub1) this)
						   .aShortArray9335[i_908_]);
					    short i_917_
						= (((Class89_Sub1) this)
						   .aShortArray9371[i_908_]);
					    byte i_918_
						= (((Class89_Sub1) this)
						   .aByteArray9362[i_908_]);
					    i_909_ = is_896_[i_912_];
					    i_910_ = is_896_[i_912_ + 1];
					    for (int i_919_ = i_909_;
						 i_919_ < i_910_; i_919_++) {
						int i_920_
						    = is_897_[i_919_] - 1;
						if (i_920_ == -1)
						    break;
						if (is_895_[i_920_] != 0) {
						    is_892_[i_920_] += i_915_;
						    is_893_[i_920_] += i_916_;
						    is_894_[i_920_] += i_917_;
						    is_895_[i_920_] += i_918_;
						}
					    }
					    i_915_ = is_884_[i_913_];
					    i_916_ = is_885_[i_913_];
					    i_917_ = is_886_[i_913_];
					    i_918_ = is_887_[i_913_];
					    i_909_ = (((Class89_Sub1) this)
						      .anIntArray9374[i_904_]);
					    i_910_ = (((Class89_Sub1) this)
						      .anIntArray9374
						      [i_904_ + 1]);
					    for (int i_921_ = i_909_;
						 (i_921_ < i_910_
						  && (((Class89_Sub1) this)
						      .aShortArray9328
						      [i_921_]) != 0);
						 i_921_++) {
						int i_922_
						    = (((((Class89_Sub1) this)
							 .aShortArray9328
							 [i_921_])
							& 0xffff)
						       - 1);
						if (is_891_[i_922_] != 0) {
						    is_888_[i_922_] += i_915_;
						    is_889_[i_922_] += i_916_;
						    is_890_[i_922_] += i_917_;
						    is_891_[i_922_] += i_918_;
						}
					    }
					    class89_sub1_880_.method15493();
					    method15493();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public Class89 method1886(byte i, int i_923_, boolean bool) {
	boolean bool_924_ = false;
	Class89_Sub1 class89_sub1_925_;
	Class89_Sub1 class89_sub1_926_;
	if (i > 0 && i <= 8) {
	    class89_sub1_926_
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass89_Sub1Array9499[i - 1]);
	    class89_sub1_925_
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass89_Sub1Array9650[i - 1]);
	    bool_924_ = true;
	} else
	    class89_sub1_925_ = class89_sub1_926_
		= new Class89_Sub1(((Class89_Sub1) this).aClass103_Sub3_9319,
				   0, 0, true, false);
	return method15469(class89_sub1_925_, class89_sub1_926_, i_923_,
			   bool_924_, bool);
    }
    
    public Class89 method1923(byte i, int i_927_, boolean bool) {
	boolean bool_928_ = false;
	Class89_Sub1 class89_sub1_929_;
	Class89_Sub1 class89_sub1_930_;
	if (i > 0 && i <= 8) {
	    class89_sub1_930_
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass89_Sub1Array9499[i - 1]);
	    class89_sub1_929_
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass89_Sub1Array9650[i - 1]);
	    bool_928_ = true;
	} else
	    class89_sub1_929_ = class89_sub1_930_
		= new Class89_Sub1(((Class89_Sub1) this).aClass103_Sub3_9319,
				   0, 0, true, false);
	return method15469(class89_sub1_929_, class89_sub1_930_, i_927_,
			   bool_928_, bool);
    }
    
    public int method1924() {
	return ((Class89_Sub1) this).anInt9367;
    }
    
    boolean method15482(int i, int i_931_, int i_932_, int i_933_, int i_934_,
			int i_935_, int i_936_, int i_937_, int i_938_,
			int i_939_) {
	if (i_933_ < i_934_ && i_933_ < i_935_ && i_933_ < i_936_)
	    return false;
	if (i_931_ > i_934_ && i_931_ > i_935_ && i_931_ > i_936_)
	    return false;
	if (i_932_ < i_937_ && i_932_ < i_938_ && i_932_ < i_939_)
	    return false;
	if (i > i_937_ && i > i_938_ && i > i_939_)
	    return false;
	return true;
    }
    
    public int method1926() {
	return ((Class89_Sub1) this).anInt9367;
    }
    
    public int method1971() {
	return ((Class89_Sub1) this).anInt9367;
    }
    
    public int method1889() {
	return ((Class89_Sub1) this).anInt9367;
    }
    
    public void method1967(Class266 class266, Class97 class97, int i) {
	if (aClass365_9317 != null)
	    aClass365_9317.method6557();
	if (class97 != null)
	    class97.aBool1352 = false;
	if (((Class89_Sub1) this).anInt9378 != 0) {
	    Class268 class268
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass268_9521);
	    Class268 class268_940_
		= ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	    Class268 class268_941_
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass268_9646);
	    class268_940_.method5203(class266);
	    class268_941_.method5199(class268_940_);
	    class268_941_.method5202(((Class103_Sub3) (((Class89_Sub1) this)
						       .aClass103_Sub3_9319))
				     .aClass268_9525);
	    if (!((Class89_Sub1) this).aBool9323)
		method15471();
	    float[] fs
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aFloatArray9514);
	    class268_940_.method5208(0.0F,
				     (float) ((Class89_Sub1) this).anInt9363,
				     0.0F, fs);
	    float f = fs[0];
	    float f_942_ = fs[1];
	    float f_943_ = fs[2];
	    class268_940_.method5208(0.0F,
				     (float) ((Class89_Sub1) this).anInt9364,
				     0.0F, fs);
	    float f_944_ = fs[0];
	    float f_945_ = fs[1];
	    float f_946_ = fs[2];
	    for (int i_947_ = 0; i_947_ < 6; i_947_++) {
		float[] fs_948_ = (((Class103_Sub3)
				    ((Class89_Sub1) this).aClass103_Sub3_9319)
				   .aFloatArrayArray9527[i_947_]);
		float f_949_ = (fs_948_[0] * f + fs_948_[1] * f_942_
				+ fs_948_[2] * f_943_ + fs_948_[3]
				+ (float) ((Class89_Sub1) this).anInt9336);
		float f_950_ = (fs_948_[0] * f_944_ + fs_948_[1] * f_945_
				+ fs_948_[2] * f_946_ + fs_948_[3]
				+ (float) ((Class89_Sub1) this).anInt9336);
		if (f_949_ < 0.0F && f_950_ < 0.0F)
		    return;
	    }
	    if (class97 != null) {
		boolean bool = false;
		boolean bool_951_ = true;
		int i_952_ = ((((Class89_Sub1) this).anInt9365
			       + ((Class89_Sub1) this).anInt9366)
			      >> 1);
		int i_953_ = ((((Class89_Sub1) this).anInt9332
			       + ((Class89_Sub1) this).anInt9359)
			      >> 1);
		int i_954_ = i_952_;
		int i_955_ = ((Class89_Sub1) this).anInt9363;
		int i_956_ = i_953_;
		float f_957_
		    = (class268_941_.aFloatArray4353[0] * (float) i_954_
		       + class268_941_.aFloatArray4353[4] * (float) i_955_
		       + class268_941_.aFloatArray4353[8] * (float) i_956_
		       + class268_941_.aFloatArray4353[12]);
		float f_958_
		    = (class268_941_.aFloatArray4353[1] * (float) i_954_
		       + class268_941_.aFloatArray4353[5] * (float) i_955_
		       + class268_941_.aFloatArray4353[9] * (float) i_956_
		       + class268_941_.aFloatArray4353[13]);
		float f_959_
		    = (class268_941_.aFloatArray4353[2] * (float) i_954_
		       + class268_941_.aFloatArray4353[6] * (float) i_955_
		       + class268_941_.aFloatArray4353[10] * (float) i_956_
		       + class268_941_.aFloatArray4353[14]);
		float f_960_
		    = (class268_941_.aFloatArray4353[3] * (float) i_954_
		       + class268_941_.aFloatArray4353[7] * (float) i_955_
		       + class268_941_.aFloatArray4353[11] * (float) i_956_
		       + class268_941_.aFloatArray4353[15]);
		if (f_959_ >= -f_960_) {
		    class97.anInt1349
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9528)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9529) * f_957_ / f_960_);
		    class97.anInt1347
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9530)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9531) * f_958_ / f_960_);
		} else
		    bool = true;
		i_954_ = i_952_;
		i_955_ = ((Class89_Sub1) this).anInt9364;
		i_956_ = i_953_;
		float f_961_
		    = (class268_941_.aFloatArray4353[0] * (float) i_954_
		       + class268_941_.aFloatArray4353[4] * (float) i_955_
		       + class268_941_.aFloatArray4353[8] * (float) i_956_
		       + class268_941_.aFloatArray4353[12]);
		float f_962_
		    = (class268_941_.aFloatArray4353[1] * (float) i_954_
		       + class268_941_.aFloatArray4353[5] * (float) i_955_
		       + class268_941_.aFloatArray4353[9] * (float) i_956_
		       + class268_941_.aFloatArray4353[13]);
		float f_963_
		    = (class268_941_.aFloatArray4353[2] * (float) i_954_
		       + class268_941_.aFloatArray4353[6] * (float) i_955_
		       + class268_941_.aFloatArray4353[10] * (float) i_956_
		       + class268_941_.aFloatArray4353[14]);
		float f_964_
		    = (class268_941_.aFloatArray4353[3] * (float) i_954_
		       + class268_941_.aFloatArray4353[7] * (float) i_955_
		       + class268_941_.aFloatArray4353[11] * (float) i_956_
		       + class268_941_.aFloatArray4353[15]);
		if (f_963_ >= -f_964_) {
		    class97.anInt1350
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9528)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9529) * f_961_ / f_964_);
		    class97.anInt1351
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9530)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9531) * f_962_ / f_964_);
		} else
		    bool = true;
		if (bool) {
		    if (f_959_ < -f_960_ && f_963_ < -f_964_)
			bool_951_ = false;
		    else if (f_959_ < -f_960_) {
			float f_965_
			    = (f_959_ + f_960_) / (f_963_ + f_964_) - 1.0F;
			float f_966_ = f_957_ + f_965_ * (f_961_ - f_957_);
			float f_967_ = f_958_ + f_965_ * (f_962_ - f_958_);
			float f_968_ = f_960_ + f_965_ * (f_964_ - f_960_);
			class97.anInt1349
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_966_ / f_968_));
			class97.anInt1347
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9530)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9531
					* f_967_ / f_968_));
		    } else if (f_963_ < -f_964_) {
			float f_969_
			    = (f_963_ + f_964_) / (f_959_ + f_960_) - 1.0F;
			float f_970_ = f_961_ + f_969_ * (f_957_ - f_961_);
			float f_971_ = f_962_ + f_969_ * (f_958_ - f_962_);
			float f_972_ = f_964_ + f_969_ * (f_960_ - f_964_);
			class97.anInt1350
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_970_ / f_972_));
			class97.anInt1351
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9530)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9531
					* f_971_ / f_972_));
		    }
		}
		if (bool_951_) {
		    if (f_959_ / f_960_ > f_963_ / f_964_) {
			float f_973_
			    = (f_957_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[12]);
			float f_974_
			    = (f_960_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     - (float) class97.anInt1349
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_973_ / f_974_));
		    } else {
			float f_975_
			    = (f_961_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[12]);
			float f_976_
			    = (f_964_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     - (float) class97.anInt1350
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_975_ / f_976_));
		    }
		    class97.aBool1352 = true;
		}
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15815(i);
	    method15479(class266);
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15815(0);
	    class268_940_.method5203(class266);
	    class268_940_.method5202(((Class89_Sub1) this).aClass103_Sub3_9319
				     .aClass268_9504);
	    method15495(class268_940_);
	}
    }
    
    int method15483(int i, short i_977_, int i_978_) {
	int i_979_
	    = (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
	       .anIntArray9510[method15467(i, i_978_)]);
	if (i_977_ != -1) {
	    Class101 class101
		= ((Class89_Sub1) this).aClass103_Sub3_9319.aClass107_1458
		      .method2680(i_977_ & 0xffff, -518512082);
	    int i_980_ = class101.aByte1430 & 0xff;
	    if (i_980_ != 0) {
		int i_981_ = 131586 * i_978_;
		if (i_978_ < 0)
		    i_981_ = 0;
		else if (i_978_ > 127)
		    i_981_ = 16777215;
		else
		    i_981_ = 131586 * i_978_;
		if (i_980_ == 256)
		    i_979_ = i_981_;
		else {
		    int i_982_ = i_980_;
		    int i_983_ = 256 - i_980_;
		    i_979_ = ((((i_981_ & 0xff00ff) * i_982_
				+ (i_979_ & 0xff00ff) * i_983_)
			       & ~0xff00ff)
			      + (((i_981_ & 0xff00) * i_982_
				  + (i_979_ & 0xff00) * i_983_)
				 & 0xff0000)) >> 8;
		}
	    }
	    int i_984_ = class101.aByte1433 & 0xff;
	    if (i_984_ != 0) {
		i_984_ += 256;
		int i_985_ = ((i_979_ & 0xff0000) >> 16) * i_984_;
		if (i_985_ > 65535)
		    i_985_ = 65535;
		int i_986_ = ((i_979_ & 0xff00) >> 8) * i_984_;
		if (i_986_ > 65535)
		    i_986_ = 65535;
		int i_987_ = (i_979_ & 0xff) * i_984_;
		if (i_987_ > 65535)
		    i_987_ = 65535;
		i_979_ = (i_985_ << 8 & 0xff0000) + (i_986_ & 0xff00) + (i_987_
									 >> 8);
	    }
	}
	return i_979_ & 0xffffff;
    }
    
    public void method1931(int i) {
	int i_988_ = Class282.anIntArray4430[i];
	int i_989_ = Class282.anIntArray4441[i];
	for (int i_990_ = 0; i_990_ < ((Class89_Sub1) this).anInt9325;
	     i_990_++) {
	    int i_991_
		= ((((Class89_Sub1) this).anIntArray9360[i_990_] * i_988_
		    + ((Class89_Sub1) this).anIntArray9326[i_990_] * i_989_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9360[i_990_]
		= ((((Class89_Sub1) this).anIntArray9360[i_990_] * i_989_
		    - ((Class89_Sub1) this).anIntArray9326[i_990_] * i_988_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9326[i_990_] = i_991_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1961(int i) {
	int i_992_ = Class282.anIntArray4430[i];
	int i_993_ = Class282.anIntArray4441[i];
	for (int i_994_ = 0; i_994_ < ((Class89_Sub1) this).anInt9325;
	     i_994_++) {
	    int i_995_
		= ((((Class89_Sub1) this).anIntArray9360[i_994_] * i_992_
		    + ((Class89_Sub1) this).anIntArray9326[i_994_] * i_993_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9360[i_994_]
		= ((((Class89_Sub1) this).anIntArray9360[i_994_] * i_993_
		    - ((Class89_Sub1) this).anIntArray9326[i_994_] * i_992_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9326[i_994_] = i_995_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public boolean method2023() {
	return ((Class89_Sub1) this).aBool9369;
    }
    
    public void method1934(int i) {
	int i_996_ = Class282.anIntArray4430[i];
	int i_997_ = Class282.anIntArray4441[i];
	for (int i_998_ = 0; i_998_ < ((Class89_Sub1) this).anInt9325;
	     i_998_++) {
	    int i_999_
		= ((((Class89_Sub1) this).anIntArray9360[i_998_] * i_996_
		    + ((Class89_Sub1) this).anIntArray9326[i_998_] * i_997_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9360[i_998_]
		= ((((Class89_Sub1) this).anIntArray9360[i_998_] * i_997_
		    - ((Class89_Sub1) this).anIntArray9326[i_998_] * i_996_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9326[i_998_] = i_999_;
	}
	for (int i_1000_ = 0; i_1000_ < ((Class89_Sub1) this).anInt9378;
	     i_1000_++) {
	    int i_1001_
		= ((((Class89_Sub1) this).aShortArray9371[i_1000_] * i_996_
		    + ((Class89_Sub1) this).aShortArray9334[i_1000_] * i_997_)
		   >> 14);
	    ((Class89_Sub1) this).aShortArray9371[i_1000_]
		= (short) (((((Class89_Sub1) this).aShortArray9371[i_1000_]
			     * i_997_)
			    - (((Class89_Sub1) this).aShortArray9334[i_1000_]
			       * i_996_))
			   >> 14);
	    ((Class89_Sub1) this).aShortArray9334[i_1000_] = (short) i_1001_;
	}
	method15480();
	method15493();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public Class241_Sub39_Sub17 method1904
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	if (((Class89_Sub1) this).anInt9378 == 0)
	    return null;
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i;
	int i_1002_;
	if ((((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
	     .anInt9520)
	    > 0) {
	    i = ((((Class89_Sub1) this).anInt9365
		  - ((((Class89_Sub1) this).anInt9364
		      * ((Class103_Sub3)
			 ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9520)
		     >> 8))
		 >> ((Class103_Sub3)
		     ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1002_
		= ((((Class89_Sub1) this).anInt9366
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9520)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	} else {
	    i = ((((Class89_Sub1) this).anInt9365
		  - ((((Class89_Sub1) this).anInt9363
		      * ((Class103_Sub3)
			 ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9520)
		     >> 8))
		 >> ((Class103_Sub3)
		     ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1002_
		= ((((Class89_Sub1) this).anInt9366
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9520)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	}
	int i_1003_;
	int i_1004_;
	if ((((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
	     .anInt9627)
	    > 0) {
	    i_1003_
		= ((((Class89_Sub1) this).anInt9332
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1004_
		= ((((Class89_Sub1) this).anInt9359
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	} else {
	    i_1003_
		= ((((Class89_Sub1) this).anInt9332
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1004_
		= ((((Class89_Sub1) this).anInt9359
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	}
	int i_1005_ = i_1002_ - i + 1;
	int i_1006_ = i_1004_ - i_1003_ + 1;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1_1007_;
	if (class241_sub39_sub17_sub1 != null
	    && class241_sub39_sub17_sub1.method17674(i_1005_, i_1006_)) {
	    class241_sub39_sub17_sub1_1007_ = class241_sub39_sub17_sub1;
	    class241_sub39_sub17_sub1_1007_.method17669();
	} else
	    class241_sub39_sub17_sub1_1007_
		= new Class241_Sub39_Sub17_Sub1((((Class89_Sub1) this)
						 .aClass103_Sub3_9319),
						i_1005_, i_1006_);
	class241_sub39_sub17_sub1_1007_.method17670(i, i_1003_, i_1002_,
						    i_1004_);
	method15478(class241_sub39_sub17_sub1_1007_);
	return class241_sub39_sub17_sub1_1007_;
    }
    
    public void method1936(int i) {
	int i_1008_ = Class282.anIntArray4430[i];
	int i_1009_ = Class282.anIntArray4441[i];
	for (int i_1010_ = 0; i_1010_ < ((Class89_Sub1) this).anInt9325;
	     i_1010_++) {
	    int i_1011_
		= ((((Class89_Sub1) this).anIntArray9327[i_1010_] * i_1009_
		    - ((Class89_Sub1) this).anIntArray9360[i_1010_] * i_1008_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9360[i_1010_]
		= ((((Class89_Sub1) this).anIntArray9327[i_1010_] * i_1008_
		    + ((Class89_Sub1) this).anIntArray9360[i_1010_] * i_1009_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9327[i_1010_] = i_1011_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1990(int i) {
	int i_1012_ = Class282.anIntArray4430[i];
	int i_1013_ = Class282.anIntArray4441[i];
	for (int i_1014_ = 0; i_1014_ < ((Class89_Sub1) this).anInt9325;
	     i_1014_++) {
	    int i_1015_
		= ((((Class89_Sub1) this).anIntArray9327[i_1014_] * i_1012_
		    + ((Class89_Sub1) this).anIntArray9326[i_1014_] * i_1013_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9327[i_1014_]
		= ((((Class89_Sub1) this).anIntArray9327[i_1014_] * i_1013_
		    - ((Class89_Sub1) this).anIntArray9326[i_1014_] * i_1012_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9326[i_1014_] = i_1015_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1938(int i) {
	int i_1016_ = Class282.anIntArray4430[i];
	int i_1017_ = Class282.anIntArray4441[i];
	for (int i_1018_ = 0; i_1018_ < ((Class89_Sub1) this).anInt9325;
	     i_1018_++) {
	    int i_1019_
		= ((((Class89_Sub1) this).anIntArray9327[i_1018_] * i_1016_
		    + ((Class89_Sub1) this).anIntArray9326[i_1018_] * i_1017_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9327[i_1018_]
		= ((((Class89_Sub1) this).anIntArray9327[i_1018_] * i_1017_
		    - ((Class89_Sub1) this).anIntArray9326[i_1018_] * i_1016_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9326[i_1018_] = i_1019_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1939(int i, int i_1020_, int i_1021_) {
	for (int i_1022_ = 0; i_1022_ < ((Class89_Sub1) this).anInt9325;
	     i_1022_++) {
	    if (i != 0)
		((Class89_Sub1) this).anIntArray9326[i_1022_] += i;
	    if (i_1020_ != 0)
		((Class89_Sub1) this).anIntArray9327[i_1022_] += i_1020_;
	    if (i_1021_ != 0)
		((Class89_Sub1) this).anIntArray9360[i_1022_] += i_1021_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1943(int i, int i_1023_, int i_1024_) {
	for (int i_1025_ = 0; i_1025_ < ((Class89_Sub1) this).anInt9325;
	     i_1025_++) {
	    if (i != 0)
		((Class89_Sub1) this).anIntArray9326[i_1025_] += i;
	    if (i_1023_ != 0)
		((Class89_Sub1) this).anIntArray9327[i_1025_] += i_1023_;
	    if (i_1024_ != 0)
		((Class89_Sub1) this).anIntArray9360[i_1025_] += i_1024_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1941(int i, int i_1026_, int i_1027_) {
	for (int i_1028_ = 0; i_1028_ < ((Class89_Sub1) this).anInt9325;
	     i_1028_++) {
	    if (i != 0)
		((Class89_Sub1) this).anIntArray9326[i_1028_] += i;
	    if (i_1026_ != 0)
		((Class89_Sub1) this).anIntArray9327[i_1028_] += i_1026_;
	    if (i_1027_ != 0)
		((Class89_Sub1) this).anIntArray9360[i_1028_] += i_1027_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    static float[] method15484(float[] fs, int i) {
	float[] fs_1029_ = new float[i];
	System.arraycopy(fs, 0, fs_1029_, 0, i);
	return fs_1029_;
    }
    
    public int method1940() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9363;
    }
    
    public void method2024(int i, int i_1030_, int i_1031_) {
	for (int i_1032_ = 0; i_1032_ < ((Class89_Sub1) this).anInt9325;
	     i_1032_++) {
	    if (i != 128)
		((Class89_Sub1) this).anIntArray9326[i_1032_]
		    = ((Class89_Sub1) this).anIntArray9326[i_1032_] * i >> 7;
	    if (i_1030_ != 128)
		((Class89_Sub1) this).anIntArray9327[i_1032_]
		    = (((Class89_Sub1) this).anIntArray9327[i_1032_] * i_1030_
		       >> 7);
	    if (i_1031_ != 128)
		((Class89_Sub1) this).anIntArray9360[i_1032_]
		    = (((Class89_Sub1) this).anIntArray9360[i_1032_] * i_1031_
		       >> 7);
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1945(int i, int i_1033_, int i_1034_) {
	for (int i_1035_ = 0; i_1035_ < ((Class89_Sub1) this).anInt9325;
	     i_1035_++) {
	    if (i != 128)
		((Class89_Sub1) this).anIntArray9326[i_1035_]
		    = ((Class89_Sub1) this).anIntArray9326[i_1035_] * i >> 7;
	    if (i_1033_ != 128)
		((Class89_Sub1) this).anIntArray9327[i_1035_]
		    = (((Class89_Sub1) this).anIntArray9327[i_1035_] * i_1033_
		       >> 7);
	    if (i_1034_ != 128)
		((Class89_Sub1) this).anIntArray9360[i_1035_]
		    = (((Class89_Sub1) this).anIntArray9360[i_1035_] * i_1034_
		       >> 7);
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    void method15485() {
	if (((Class89_Sub1) this).aClass311_9352 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826
		= false;
    }
    
    public void method1947(int i, int i_1036_, Class166 class166,
			   Class166 class166_1037_, int i_1038_, int i_1039_,
			   int i_1040_) {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i_1041_ = i_1038_ + ((Class89_Sub1) this).anInt9365;
	int i_1042_ = i_1038_ + ((Class89_Sub1) this).anInt9366;
	int i_1043_ = i_1040_ + ((Class89_Sub1) this).anInt9332;
	int i_1044_ = i_1040_ + ((Class89_Sub1) this).anInt9359;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1041_ >= 0
		&& ((i_1042_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2055 * 266270313)
		&& i_1043_ >= 0
		&& ((i_1044_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2052 * -14610189))) {
	    if (i == 4 || i == 5) {
		if (class166_1037_ == null
		    || (i_1041_ < 0
			|| ((i_1042_ + class166_1037_.anInt2053 * 2039042417
			     >> class166_1037_.anInt2054 * -122333825)
			    >= class166_1037_.anInt2055 * 266270313)
			|| i_1043_ < 0
			|| ((i_1044_ + class166_1037_.anInt2053 * 2039042417
			     >> class166_1037_.anInt2054 * -122333825)
			    >= class166_1037_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_1041_ >>= class166.anInt2054 * -122333825;
		i_1042_ = (i_1042_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_1043_ >>= class166.anInt2054 * -122333825;
		i_1044_ = (i_1044_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if (class166.method3551(i_1041_, i_1043_, 222134223) == i_1039_
		    && (class166.method3551(i_1042_, i_1043_, -1505272995)
			== i_1039_)
		    && (class166.method3551(i_1041_, i_1044_, -531975025)
			== i_1039_)
		    && (class166.method3551(i_1042_, i_1044_, -972176370)
			== i_1039_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1045_ = 0;
		     i_1045_ < ((Class89_Sub1) this).anInt9325; i_1045_++)
		    ((Class89_Sub1) this).anIntArray9327[i_1045_]
			= (((Class89_Sub1) this).anIntArray9327[i_1045_]
			   + class166.method3550(((((Class89_Sub1) this)
						   .anIntArray9326[i_1045_])
						  + i_1038_),
						 ((((Class89_Sub1) this)
						   .anIntArray9360[i_1045_])
						  + i_1040_),
						 -362162033)
			   - i_1039_);
	    } else if (i == 2) {
		int i_1046_ = ((Class89_Sub1) this).anInt9363;
		if (i_1046_ == 0)
		    return;
		for (int i_1047_ = 0;
		     i_1047_ < ((Class89_Sub1) this).anInt9325; i_1047_++) {
		    int i_1048_
			= ((((Class89_Sub1) this).anIntArray9327[i_1047_]
			    << 16)
			   / i_1046_);
		    if (i_1048_ < i_1036_)
			((Class89_Sub1) this).anIntArray9327[i_1047_]
			    = (((Class89_Sub1) this).anIntArray9327[i_1047_]
			       + (class166.method3550((((Class89_Sub1) this)
						       .anIntArray9326
						       [i_1047_]) + i_1038_,
						      (((Class89_Sub1) this)
						       .anIntArray9360
						       [i_1047_]) + i_1040_,
						      -174348182)
				  - i_1039_) * (i_1036_ - i_1048_) / i_1036_);
		}
	    } else if (i == 3) {
		int i_1049_ = (i_1036_ & 0xff) * 4;
		int i_1050_ = (i_1036_ >> 8 & 0xff) * 4;
		int i_1051_ = (i_1036_ >> 16 & 0xff) << 6;
		int i_1052_ = (i_1036_ >> 24 & 0xff) << 6;
		if (i_1038_ - (i_1049_ >> 1) < 0
		    || ((i_1038_ + (i_1049_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2055 * 266270313
			    << class166.anInt2054 * -122333825))
		    || i_1040_ - (i_1050_ >> 1) < 0
		    || ((i_1040_ + (i_1050_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2052 * -14610189
			    << class166.anInt2054 * -122333825)))
		    return;
		method2041(class166, i_1038_, i_1039_, i_1040_, i_1049_,
			   i_1050_, i_1051_, i_1052_);
	    } else if (i == 4) {
		int i_1053_ = (((Class89_Sub1) this).anInt9364
			       - ((Class89_Sub1) this).anInt9363);
		for (int i_1054_ = 0;
		     i_1054_ < ((Class89_Sub1) this).anInt9325; i_1054_++)
		    ((Class89_Sub1) this).anIntArray9327[i_1054_]
			= (((Class89_Sub1) this).anIntArray9327[i_1054_]
			   + (class166_1037_.method3550((((Class89_Sub1) this)
							 .anIntArray9326
							 [i_1054_]) + i_1038_,
							(((Class89_Sub1) this)
							 .anIntArray9360
							 [i_1054_]) + i_1040_,
							-721778092)
			      - i_1039_)
			   + i_1053_);
	    } else if (i == 5) {
		int i_1055_ = (((Class89_Sub1) this).anInt9364
			       - ((Class89_Sub1) this).anInt9363);
		for (int i_1056_ = 0;
		     i_1056_ < ((Class89_Sub1) this).anInt9325; i_1056_++) {
		    int i_1057_
			= (((Class89_Sub1) this).anIntArray9326[i_1056_]
			   + i_1038_);
		    int i_1058_
			= (((Class89_Sub1) this).anIntArray9360[i_1056_]
			   + i_1040_);
		    int i_1059_
			= class166.method3550(i_1057_, i_1058_, -1821760759);
		    int i_1060_ = class166_1037_.method3550(i_1057_, i_1058_,
							    51026550);
		    int i_1061_ = i_1059_ - i_1060_ - i_1036_;
		    ((Class89_Sub1) this).anIntArray9327[i_1056_]
			= ((((Class89_Sub1) this).anIntArray9327[i_1056_]
			    << 8) / i_1055_ * i_1061_
			   >> 8) - (i_1039_ - i_1059_);
		}
	    }
	    method15480();
	    ((Class89_Sub1) this).aBool9323 = false;
	}
    }
    
    public void method2042(int i, int i_1062_, Class166 class166,
			   Class166 class166_1063_, int i_1064_, int i_1065_,
			   int i_1066_) {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i_1067_ = i_1064_ + ((Class89_Sub1) this).anInt9365;
	int i_1068_ = i_1064_ + ((Class89_Sub1) this).anInt9366;
	int i_1069_ = i_1066_ + ((Class89_Sub1) this).anInt9332;
	int i_1070_ = i_1066_ + ((Class89_Sub1) this).anInt9359;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1067_ >= 0
		&& ((i_1068_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2055 * 266270313)
		&& i_1069_ >= 0
		&& ((i_1070_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2052 * -14610189))) {
	    if (i == 4 || i == 5) {
		if (class166_1063_ == null
		    || (i_1067_ < 0
			|| ((i_1068_ + class166_1063_.anInt2053 * 2039042417
			     >> class166_1063_.anInt2054 * -122333825)
			    >= class166_1063_.anInt2055 * 266270313)
			|| i_1069_ < 0
			|| ((i_1070_ + class166_1063_.anInt2053 * 2039042417
			     >> class166_1063_.anInt2054 * -122333825)
			    >= class166_1063_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_1067_ >>= class166.anInt2054 * -122333825;
		i_1068_ = (i_1068_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_1069_ >>= class166.anInt2054 * -122333825;
		i_1070_ = (i_1070_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if ((class166.method3551(i_1067_, i_1069_, -403316660)
		     == i_1065_)
		    && (class166.method3551(i_1068_, i_1069_, 58641863)
			== i_1065_)
		    && (class166.method3551(i_1067_, i_1070_, -136893873)
			== i_1065_)
		    && (class166.method3551(i_1068_, i_1070_, 769781833)
			== i_1065_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1071_ = 0;
		     i_1071_ < ((Class89_Sub1) this).anInt9325; i_1071_++)
		    ((Class89_Sub1) this).anIntArray9327[i_1071_]
			= (((Class89_Sub1) this).anIntArray9327[i_1071_]
			   + class166.method3550(((((Class89_Sub1) this)
						   .anIntArray9326[i_1071_])
						  + i_1064_),
						 ((((Class89_Sub1) this)
						   .anIntArray9360[i_1071_])
						  + i_1066_),
						 -1823874806)
			   - i_1065_);
	    } else if (i == 2) {
		int i_1072_ = ((Class89_Sub1) this).anInt9363;
		if (i_1072_ == 0)
		    return;
		for (int i_1073_ = 0;
		     i_1073_ < ((Class89_Sub1) this).anInt9325; i_1073_++) {
		    int i_1074_
			= ((((Class89_Sub1) this).anIntArray9327[i_1073_]
			    << 16)
			   / i_1072_);
		    if (i_1074_ < i_1062_)
			((Class89_Sub1) this).anIntArray9327[i_1073_]
			    = (((Class89_Sub1) this).anIntArray9327[i_1073_]
			       + (class166.method3550((((Class89_Sub1) this)
						       .anIntArray9326
						       [i_1073_]) + i_1064_,
						      (((Class89_Sub1) this)
						       .anIntArray9360
						       [i_1073_]) + i_1066_,
						      -429932128)
				  - i_1065_) * (i_1062_ - i_1074_) / i_1062_);
		}
	    } else if (i == 3) {
		int i_1075_ = (i_1062_ & 0xff) * 4;
		int i_1076_ = (i_1062_ >> 8 & 0xff) * 4;
		int i_1077_ = (i_1062_ >> 16 & 0xff) << 6;
		int i_1078_ = (i_1062_ >> 24 & 0xff) << 6;
		if (i_1064_ - (i_1075_ >> 1) < 0
		    || ((i_1064_ + (i_1075_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2055 * 266270313
			    << class166.anInt2054 * -122333825))
		    || i_1066_ - (i_1076_ >> 1) < 0
		    || ((i_1066_ + (i_1076_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2052 * -14610189
			    << class166.anInt2054 * -122333825)))
		    return;
		method2041(class166, i_1064_, i_1065_, i_1066_, i_1075_,
			   i_1076_, i_1077_, i_1078_);
	    } else if (i == 4) {
		int i_1079_ = (((Class89_Sub1) this).anInt9364
			       - ((Class89_Sub1) this).anInt9363);
		for (int i_1080_ = 0;
		     i_1080_ < ((Class89_Sub1) this).anInt9325; i_1080_++)
		    ((Class89_Sub1) this).anIntArray9327[i_1080_]
			= (((Class89_Sub1) this).anIntArray9327[i_1080_]
			   + (class166_1063_.method3550((((Class89_Sub1) this)
							 .anIntArray9326
							 [i_1080_]) + i_1064_,
							(((Class89_Sub1) this)
							 .anIntArray9360
							 [i_1080_]) + i_1066_,
							335728643)
			      - i_1065_)
			   + i_1079_);
	    } else if (i == 5) {
		int i_1081_ = (((Class89_Sub1) this).anInt9364
			       - ((Class89_Sub1) this).anInt9363);
		for (int i_1082_ = 0;
		     i_1082_ < ((Class89_Sub1) this).anInt9325; i_1082_++) {
		    int i_1083_
			= (((Class89_Sub1) this).anIntArray9326[i_1082_]
			   + i_1064_);
		    int i_1084_
			= (((Class89_Sub1) this).anIntArray9360[i_1082_]
			   + i_1066_);
		    int i_1085_
			= class166.method3550(i_1083_, i_1084_, 266788215);
		    int i_1086_ = class166_1063_.method3550(i_1083_, i_1084_,
							    -478825593);
		    int i_1087_ = i_1085_ - i_1086_ - i_1062_;
		    ((Class89_Sub1) this).anIntArray9327[i_1082_]
			= ((((Class89_Sub1) this).anIntArray9327[i_1082_]
			    << 8) / i_1081_ * i_1087_
			   >> 8) - (i_1065_ - i_1085_);
		}
	    }
	    method15480();
	    ((Class89_Sub1) this).aBool9323 = false;
	}
    }
    
    public void method1960(int i, int i_1088_, Class166 class166,
			   Class166 class166_1089_, int i_1090_, int i_1091_,
			   int i_1092_) {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i_1093_ = i_1090_ + ((Class89_Sub1) this).anInt9365;
	int i_1094_ = i_1090_ + ((Class89_Sub1) this).anInt9366;
	int i_1095_ = i_1092_ + ((Class89_Sub1) this).anInt9332;
	int i_1096_ = i_1092_ + ((Class89_Sub1) this).anInt9359;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1093_ >= 0
		&& ((i_1094_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2055 * 266270313)
		&& i_1095_ >= 0
		&& ((i_1096_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2052 * -14610189))) {
	    if (i == 4 || i == 5) {
		if (class166_1089_ == null
		    || (i_1093_ < 0
			|| ((i_1094_ + class166_1089_.anInt2053 * 2039042417
			     >> class166_1089_.anInt2054 * -122333825)
			    >= class166_1089_.anInt2055 * 266270313)
			|| i_1095_ < 0
			|| ((i_1096_ + class166_1089_.anInt2053 * 2039042417
			     >> class166_1089_.anInt2054 * -122333825)
			    >= class166_1089_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_1093_ >>= class166.anInt2054 * -122333825;
		i_1094_ = (i_1094_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_1095_ >>= class166.anInt2054 * -122333825;
		i_1096_ = (i_1096_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if ((class166.method3551(i_1093_, i_1095_, -2013663398)
		     == i_1091_)
		    && (class166.method3551(i_1094_, i_1095_, 673295377)
			== i_1091_)
		    && (class166.method3551(i_1093_, i_1096_, 524997752)
			== i_1091_)
		    && (class166.method3551(i_1094_, i_1096_, 59715693)
			== i_1091_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1097_ = 0;
		     i_1097_ < ((Class89_Sub1) this).anInt9325; i_1097_++)
		    ((Class89_Sub1) this).anIntArray9327[i_1097_]
			= (((Class89_Sub1) this).anIntArray9327[i_1097_]
			   + class166.method3550(((((Class89_Sub1) this)
						   .anIntArray9326[i_1097_])
						  + i_1090_),
						 ((((Class89_Sub1) this)
						   .anIntArray9360[i_1097_])
						  + i_1092_),
						 -141491249)
			   - i_1091_);
	    } else if (i == 2) {
		int i_1098_ = ((Class89_Sub1) this).anInt9363;
		if (i_1098_ == 0)
		    return;
		for (int i_1099_ = 0;
		     i_1099_ < ((Class89_Sub1) this).anInt9325; i_1099_++) {
		    int i_1100_
			= ((((Class89_Sub1) this).anIntArray9327[i_1099_]
			    << 16)
			   / i_1098_);
		    if (i_1100_ < i_1088_)
			((Class89_Sub1) this).anIntArray9327[i_1099_]
			    = (((Class89_Sub1) this).anIntArray9327[i_1099_]
			       + (class166.method3550((((Class89_Sub1) this)
						       .anIntArray9326
						       [i_1099_]) + i_1090_,
						      (((Class89_Sub1) this)
						       .anIntArray9360
						       [i_1099_]) + i_1092_,
						      -897812006)
				  - i_1091_) * (i_1088_ - i_1100_) / i_1088_);
		}
	    } else if (i == 3) {
		int i_1101_ = (i_1088_ & 0xff) * 4;
		int i_1102_ = (i_1088_ >> 8 & 0xff) * 4;
		int i_1103_ = (i_1088_ >> 16 & 0xff) << 6;
		int i_1104_ = (i_1088_ >> 24 & 0xff) << 6;
		if (i_1090_ - (i_1101_ >> 1) < 0
		    || ((i_1090_ + (i_1101_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2055 * 266270313
			    << class166.anInt2054 * -122333825))
		    || i_1092_ - (i_1102_ >> 1) < 0
		    || ((i_1092_ + (i_1102_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2052 * -14610189
			    << class166.anInt2054 * -122333825)))
		    return;
		method2041(class166, i_1090_, i_1091_, i_1092_, i_1101_,
			   i_1102_, i_1103_, i_1104_);
	    } else if (i == 4) {
		int i_1105_ = (((Class89_Sub1) this).anInt9364
			       - ((Class89_Sub1) this).anInt9363);
		for (int i_1106_ = 0;
		     i_1106_ < ((Class89_Sub1) this).anInt9325; i_1106_++)
		    ((Class89_Sub1) this).anIntArray9327[i_1106_]
			= (((Class89_Sub1) this).anIntArray9327[i_1106_]
			   + (class166_1089_.method3550((((Class89_Sub1) this)
							 .anIntArray9326
							 [i_1106_]) + i_1090_,
							(((Class89_Sub1) this)
							 .anIntArray9360
							 [i_1106_]) + i_1092_,
							-1129484251)
			      - i_1091_)
			   + i_1105_);
	    } else if (i == 5) {
		int i_1107_ = (((Class89_Sub1) this).anInt9364
			       - ((Class89_Sub1) this).anInt9363);
		for (int i_1108_ = 0;
		     i_1108_ < ((Class89_Sub1) this).anInt9325; i_1108_++) {
		    int i_1109_
			= (((Class89_Sub1) this).anIntArray9326[i_1108_]
			   + i_1090_);
		    int i_1110_
			= (((Class89_Sub1) this).anIntArray9360[i_1108_]
			   + i_1092_);
		    int i_1111_
			= class166.method3550(i_1109_, i_1110_, -482101519);
		    int i_1112_ = class166_1089_.method3550(i_1109_, i_1110_,
							    -1379563578);
		    int i_1113_ = i_1111_ - i_1112_ - i_1088_;
		    ((Class89_Sub1) this).anIntArray9327[i_1108_]
			= ((((Class89_Sub1) this).anIntArray9327[i_1108_]
			    << 8) / i_1107_ * i_1113_
			   >> 8) - (i_1091_ - i_1111_);
		}
	    }
	    method15480();
	    ((Class89_Sub1) this).aBool9323 = false;
	}
    }
    
    public void method1922() {
	if (!((Class89_Sub1) this).aBool9382) {
	    if (!((Class89_Sub1) this).aBool9323)
		method15471();
	    ((Class89_Sub1) this).anInt9370 = ((Class89_Sub1) this).anInt9363;
	    ((Class89_Sub1) this).aBool9382 = true;
	}
    }
    
    void method15486() {
	if (((Class89_Sub1) this).aClass311_9352 != null)
	    ((Class89_Sub1) this).aClass311_9352.method5880();
	if (((Class89_Sub1) this).aClass311_9341 != null)
	    ((Class89_Sub1) this).aClass311_9341.method5880();
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class89_Sub1) this).aClass311_9353.method5880();
	if (((Class89_Sub1) this).aClass311_9354 != null)
	    ((Class89_Sub1) this).aClass311_9354.method5880();
	if (((Class89_Sub1) this).aClass386_9351 != null)
	    ((Class89_Sub1) this).aClass386_9351.method6951();
    }
    
    boolean method15487() {
	if (((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707)
	    return true;
	if ((((Class386) ((Class89_Sub1) this).aClass386_9351)
	     .anInterface33_5706)
	    == null)
	    ((Class386) ((Class89_Sub1) this).aClass386_9351)
		.anInterface33_5706
		= ((Class89_Sub1) this).aClass103_Sub3_9319.method15714(false);
	Interface33 interface33
	    = (((Class386) ((Class89_Sub1) this).aClass386_9351)
	       .anInterface33_5706);
	interface33.method185(((Class89_Sub1) this).anInt9342 * 6);
	Unsafe unsafe = ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	if (unsafe != null) {
	    int i = ((Class89_Sub1) this).anInt9342 * 6;
	    long l = interface33.method262(0, i);
	    if (l == 0L)
		return false;
	    for (int i_1114_ = 0; i_1114_ < ((Class89_Sub1) this).anInt9342;
		 i_1114_++) {
		unsafe.putShort(l, (((Class89_Sub1) this).aShortArray9345
				    [i_1114_]));
		l += 2L;
		unsafe.putShort(l, (((Class89_Sub1) this).aShortArray9346
				    [i_1114_]));
		l += 2L;
		unsafe.putShort(l, (((Class89_Sub1) this).aShortArray9368
				    [i_1114_]));
		l += 2L;
	    }
	    interface33.method192();
	    ((Class386) ((Class89_Sub1) this).aClass386_9351)
		.anInterface33_5708
		= interface33;
	    ((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707 = true;
	    ((Class89_Sub1) this).aBool9357 = true;
	    return true;
	}
	ByteBuffer bytebuffer
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aByteBuffer9490;
	bytebuffer.clear();
	for (int i = 0; i < ((Class89_Sub1) this).anInt9342; i++) {
	    bytebuffer.putShort(((Class89_Sub1) this).aShortArray9345[i]);
	    bytebuffer.putShort(((Class89_Sub1) this).aShortArray9346[i]);
	    bytebuffer.putShort(((Class89_Sub1) this).aShortArray9368[i]);
	}
	if (interface33.method268(0, bytebuffer.position(),
				  (((Class89_Sub1) this).aClass103_Sub3_9319
				   .aLong9491))) {
	    ((Class386) ((Class89_Sub1) this).aClass386_9351)
		.anInterface33_5708
		= interface33;
	    ((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707 = true;
	    ((Class89_Sub1) this).aBool9357 = true;
	    return true;
	}
	return false;
    }
    
    void method1953() {
	/* empty */
    }
    
    boolean method1954() {
	if (((Class89_Sub1) this).anIntArrayArray9329 == null)
	    return false;
	for (int i = 0; i < ((Class89_Sub1) this).anInt9324; i++) {
	    ((Class89_Sub1) this).anIntArray9326[i] <<= 4;
	    ((Class89_Sub1) this).anIntArray9327[i] <<= 4;
	    ((Class89_Sub1) this).anIntArray9360[i] <<= 4;
	}
	((Class89_Sub1) this).anInt9389 = 0;
	((Class89_Sub1) this).anInt9390 = 0;
	((Class89_Sub1) this).anInt9391 = 0;
	return true;
    }
    
    void method2032() {
	for (int i = 0; i < ((Class89_Sub1) this).anInt9324; i++) {
	    ((Class89_Sub1) this).anIntArray9326[i]
		= ((Class89_Sub1) this).anIntArray9326[i] + 7 >> 4;
	    ((Class89_Sub1) this).anIntArray9327[i]
		= ((Class89_Sub1) this).anIntArray9327[i] + 7 >> 4;
	    ((Class89_Sub1) this).anIntArray9360[i]
		= ((Class89_Sub1) this).anIntArray9360[i] + 7 >> 4;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    void method2009() {
	for (int i = 0; i < ((Class89_Sub1) this).anInt9324; i++) {
	    ((Class89_Sub1) this).anIntArray9326[i]
		= ((Class89_Sub1) this).anIntArray9326[i] + 7 >> 4;
	    ((Class89_Sub1) this).anIntArray9327[i]
		= ((Class89_Sub1) this).anIntArray9327[i] + 7 >> 4;
	    ((Class89_Sub1) this).anIntArray9360[i]
		= ((Class89_Sub1) this).anIntArray9360[i] + 7 >> 4;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    void method1957() {
	for (int i = 0; i < ((Class89_Sub1) this).anInt9324; i++) {
	    ((Class89_Sub1) this).anIntArray9326[i]
		= ((Class89_Sub1) this).anIntArray9326[i] + 7 >> 4;
	    ((Class89_Sub1) this).anIntArray9327[i]
		= ((Class89_Sub1) this).anIntArray9327[i] + 7 >> 4;
	    ((Class89_Sub1) this).anIntArray9360[i]
		= ((Class89_Sub1) this).anIntArray9360[i] + 7 >> 4;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    void method1958() {
	for (int i = 0; i < ((Class89_Sub1) this).anInt9324; i++) {
	    ((Class89_Sub1) this).anIntArray9326[i]
		= ((Class89_Sub1) this).anIntArray9326[i] + 7 >> 4;
	    ((Class89_Sub1) this).anIntArray9327[i]
		= ((Class89_Sub1) this).anIntArray9327[i] + 7 >> 4;
	    ((Class89_Sub1) this).anIntArray9360[i]
		= ((Class89_Sub1) this).anIntArray9360[i] + 7 >> 4;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    void method1897(int i, int[] is, int i_1115_, int i_1116_, int i_1117_,
		    int i_1118_, boolean bool) {
	int i_1119_ = is.length;
	if (i == 0) {
	    i_1115_ <<= 4;
	    i_1116_ <<= 4;
	    i_1117_ <<= 4;
	    int i_1120_ = 0;
	    ((Class89_Sub1) this).anInt9389 = 0;
	    ((Class89_Sub1) this).anInt9390 = 0;
	    ((Class89_Sub1) this).anInt9391 = 0;
	    for (int i_1121_ = 0; i_1121_ < i_1119_; i_1121_++) {
		int i_1122_ = is[i_1121_];
		if (i_1122_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1123_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1122_];
		    for (int i_1124_ = 0; i_1124_ < is_1123_.length;
			 i_1124_++) {
			int i_1125_ = is_1123_[i_1124_];
			((Class89_Sub1) this).anInt9389
			    += ((Class89_Sub1) this).anIntArray9326[i_1125_];
			((Class89_Sub1) this).anInt9390
			    += ((Class89_Sub1) this).anIntArray9327[i_1125_];
			((Class89_Sub1) this).anInt9391
			    += ((Class89_Sub1) this).anIntArray9360[i_1125_];
			i_1120_++;
		    }
		}
	    }
	    if (i_1120_ > 0) {
		((Class89_Sub1) this).anInt9389
		    = ((Class89_Sub1) this).anInt9389 / i_1120_ + i_1115_;
		((Class89_Sub1) this).anInt9390
		    = ((Class89_Sub1) this).anInt9390 / i_1120_ + i_1116_;
		((Class89_Sub1) this).anInt9391
		    = ((Class89_Sub1) this).anInt9391 / i_1120_ + i_1117_;
	    } else {
		((Class89_Sub1) this).anInt9389 = i_1115_;
		((Class89_Sub1) this).anInt9390 = i_1116_;
		((Class89_Sub1) this).anInt9391 = i_1117_;
	    }
	} else if (i == 1) {
	    i_1115_ <<= 4;
	    i_1116_ <<= 4;
	    i_1117_ <<= 4;
	    for (int i_1126_ = 0; i_1126_ < i_1119_; i_1126_++) {
		int i_1127_ = is[i_1126_];
		if (i_1127_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1128_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1127_];
		    for (int i_1129_ = 0; i_1129_ < is_1128_.length;
			 i_1129_++) {
			int i_1130_ = is_1128_[i_1129_];
			((Class89_Sub1) this).anIntArray9326[i_1130_]
			    += i_1115_;
			((Class89_Sub1) this).anIntArray9327[i_1130_]
			    += i_1116_;
			((Class89_Sub1) this).anIntArray9360[i_1130_]
			    += i_1117_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1131_ = 0; i_1131_ < i_1119_; i_1131_++) {
		int i_1132_ = is[i_1131_];
		if (i_1132_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1133_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1132_];
		    if ((i_1118_ & 0x1) == 0) {
			for (int i_1134_ = 0; i_1134_ < is_1133_.length;
			     i_1134_++) {
			    int i_1135_ = is_1133_[i_1134_];
			    ((Class89_Sub1) this).anIntArray9326[i_1135_]
				-= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_1135_]
				-= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_1135_]
				-= ((Class89_Sub1) this).anInt9391;
			    if (i_1117_ != 0) {
				int i_1136_ = Class282.anIntArray4430[i_1117_];
				int i_1137_ = Class282.anIntArray4441[i_1117_];
				int i_1138_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_1135_]) * i_1136_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_1135_]) * i_1137_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9327[i_1135_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_1135_]) * i_1137_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_1135_]) * i_1136_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_1135_]
				    = i_1138_;
			    }
			    if (i_1115_ != 0) {
				int i_1139_ = Class282.anIntArray4430[i_1115_];
				int i_1140_ = Class282.anIntArray4441[i_1115_];
				int i_1141_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_1135_]) * i_1140_
					- (((Class89_Sub1) this).anIntArray9360
					   [i_1135_]) * i_1139_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_1135_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_1135_]) * i_1139_
				       + (((Class89_Sub1) this).anIntArray9360
					  [i_1135_]) * i_1140_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9327[i_1135_]
				    = i_1141_;
			    }
			    if (i_1116_ != 0) {
				int i_1142_ = Class282.anIntArray4430[i_1116_];
				int i_1143_ = Class282.anIntArray4441[i_1116_];
				int i_1144_
				    = (((((Class89_Sub1) this).anIntArray9360
					 [i_1135_]) * i_1142_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_1135_]) * i_1143_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_1135_]
				    = ((((Class89_Sub1) this).anIntArray9360
					[i_1135_]) * i_1143_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_1135_]) * i_1142_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_1135_]
				    = i_1144_;
			    }
			    ((Class89_Sub1) this).anIntArray9326[i_1135_]
				+= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_1135_]
				+= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_1135_]
				+= ((Class89_Sub1) this).anInt9391;
			}
		    } else {
			for (int i_1145_ = 0; i_1145_ < is_1133_.length;
			     i_1145_++) {
			    int i_1146_ = is_1133_[i_1145_];
			    ((Class89_Sub1) this).anIntArray9326[i_1146_]
				-= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_1146_]
				-= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_1146_]
				-= ((Class89_Sub1) this).anInt9391;
			    if (i_1115_ != 0) {
				int i_1147_ = Class282.anIntArray4430[i_1115_];
				int i_1148_ = Class282.anIntArray4441[i_1115_];
				int i_1149_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_1146_]) * i_1148_
					- (((Class89_Sub1) this).anIntArray9360
					   [i_1146_]) * i_1147_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_1146_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_1146_]) * i_1147_
				       + (((Class89_Sub1) this).anIntArray9360
					  [i_1146_]) * i_1148_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9327[i_1146_]
				    = i_1149_;
			    }
			    if (i_1117_ != 0) {
				int i_1150_ = Class282.anIntArray4430[i_1117_];
				int i_1151_ = Class282.anIntArray4441[i_1117_];
				int i_1152_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_1146_]) * i_1150_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_1146_]) * i_1151_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9327[i_1146_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_1146_]) * i_1151_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_1146_]) * i_1150_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_1146_]
				    = i_1152_;
			    }
			    if (i_1116_ != 0) {
				int i_1153_ = Class282.anIntArray4430[i_1116_];
				int i_1154_ = Class282.anIntArray4441[i_1116_];
				int i_1155_
				    = (((((Class89_Sub1) this).anIntArray9360
					 [i_1146_]) * i_1153_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_1146_]) * i_1154_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_1146_]
				    = ((((Class89_Sub1) this).anIntArray9360
					[i_1146_]) * i_1154_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_1146_]) * i_1153_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_1146_]
				    = i_1155_;
			    }
			    ((Class89_Sub1) this).anIntArray9326[i_1146_]
				+= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_1146_]
				+= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_1146_]
				+= ((Class89_Sub1) this).anInt9391;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1156_ = 0; i_1156_ < i_1119_; i_1156_++) {
		    int i_1157_ = is[i_1156_];
		    if (i_1157_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1158_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1157_]);
			for (int i_1159_ = 0; i_1159_ < is_1158_.length;
			     i_1159_++) {
			    int i_1160_ = is_1158_[i_1159_];
			    int i_1161_ = (((Class89_Sub1) this).anIntArray9374
					   [i_1160_]);
			    int i_1162_ = (((Class89_Sub1) this).anIntArray9374
					   [i_1160_ + 1]);
			    for (int i_1163_ = i_1161_;
				 (i_1163_ < i_1162_
				  && (((Class89_Sub1) this).aShortArray9328
				      [i_1163_]) != 0);
				 i_1163_++) {
				int i_1164_ = (((((Class89_Sub1) this)
						 .aShortArray9328[i_1163_])
						& 0xffff)
					       - 1);
				if (i_1117_ != 0) {
				    int i_1165_
					= Class282.anIntArray4430[i_1117_];
				    int i_1166_
					= Class282.anIntArray4441[i_1117_];
				    int i_1167_ = (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1164_]) * i_1165_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1164_]) * i_1166_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9335
					[i_1164_]
					= (short) (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1164_]) * i_1166_
						    - (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1164_]) * i_1165_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9334
					[i_1164_]
					= (short) i_1167_;
				}
				if (i_1115_ != 0) {
				    int i_1168_
					= Class282.anIntArray4430[i_1115_];
				    int i_1169_
					= Class282.anIntArray4441[i_1115_];
				    int i_1170_ = (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1164_]) * i_1169_
						    - (((Class89_Sub1) this)
						       .aShortArray9371
						       [i_1164_]) * i_1168_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9371
					[i_1164_]
					= (short) (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1164_]) * i_1168_
						    + (((Class89_Sub1) this)
						       .aShortArray9371
						       [i_1164_]) * i_1169_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9335
					[i_1164_]
					= (short) i_1170_;
				}
				if (i_1116_ != 0) {
				    int i_1171_
					= Class282.anIntArray4430[i_1116_];
				    int i_1172_
					= Class282.anIntArray4441[i_1116_];
				    int i_1173_ = (((((Class89_Sub1) this)
						     .aShortArray9371
						     [i_1164_]) * i_1171_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1164_]) * i_1172_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9371
					[i_1164_]
					= (short) (((((Class89_Sub1) this)
						     .aShortArray9371
						     [i_1164_]) * i_1172_
						    - (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1164_]) * i_1171_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9334
					[i_1164_]
					= (short) i_1173_;
				}
			    }
			}
		    }
		}
		method15493();
	    }
	} else if (i == 3) {
	    for (int i_1174_ = 0; i_1174_ < i_1119_; i_1174_++) {
		int i_1175_ = is[i_1174_];
		if (i_1175_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1176_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1175_];
		    for (int i_1177_ = 0; i_1177_ < is_1176_.length;
			 i_1177_++) {
			int i_1178_ = is_1176_[i_1177_];
			((Class89_Sub1) this).anIntArray9326[i_1178_]
			    -= ((Class89_Sub1) this).anInt9389;
			((Class89_Sub1) this).anIntArray9327[i_1178_]
			    -= ((Class89_Sub1) this).anInt9390;
			((Class89_Sub1) this).anIntArray9360[i_1178_]
			    -= ((Class89_Sub1) this).anInt9391;
			((Class89_Sub1) this).anIntArray9326[i_1178_]
			    = (((Class89_Sub1) this).anIntArray9326[i_1178_]
			       * i_1115_) >> 7;
			((Class89_Sub1) this).anIntArray9327[i_1178_]
			    = (((Class89_Sub1) this).anIntArray9327[i_1178_]
			       * i_1116_) >> 7;
			((Class89_Sub1) this).anIntArray9360[i_1178_]
			    = (((Class89_Sub1) this).anIntArray9360[i_1178_]
			       * i_1117_) >> 7;
			((Class89_Sub1) this).anIntArray9326[i_1178_]
			    += ((Class89_Sub1) this).anInt9389;
			((Class89_Sub1) this).anIntArray9327[i_1178_]
			    += ((Class89_Sub1) this).anInt9390;
			((Class89_Sub1) this).anIntArray9360[i_1178_]
			    += ((Class89_Sub1) this).anInt9391;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_1179_ = false;
		for (int i_1180_ = 0; i_1180_ < i_1119_; i_1180_++) {
		    int i_1181_ = is[i_1180_];
		    if (i_1181_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_1182_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_1181_]);
			for (int i_1183_ = 0; i_1183_ < is_1182_.length;
			     i_1183_++) {
			    int i_1184_ = is_1182_[i_1183_];
			    int i_1185_ = (((((Class89_Sub1) this)
					     .aByteArray9344[i_1184_])
					    & 0xff)
					   + i_1115_ * 8);
			    if (i_1185_ < 0)
				i_1185_ = 0;
			    else if (i_1185_ > 255)
				i_1185_ = 255;
			    ((Class89_Sub1) this).aByteArray9344[i_1184_]
				= (byte) i_1185_;
			}
			bool_1179_ = bool_1179_ | is_1182_.length > 0;
		    }
		}
		if (bool_1179_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_1186_ = 0;
			     i_1186_ < ((Class89_Sub1) this).anInt9375;
			     i_1186_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_1186_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_1186_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & 0xffffff
				   | 255 - ((((Class89_Sub1) this)
					     .aByteArray9344
					     [((Class315) class315).anInt4841])
					    & 0xff) << 24);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_1187_ = false;
		for (int i_1188_ = 0; i_1188_ < i_1119_; i_1188_++) {
		    int i_1189_ = is[i_1188_];
		    if (i_1189_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_1190_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_1189_]);
			for (int i_1191_ = 0; i_1191_ < is_1190_.length;
			     i_1191_++) {
			    int i_1192_ = is_1190_[i_1191_];
			    int i_1193_ = ((((Class89_Sub1) this)
					    .aShortArray9361[i_1192_])
					   & 0xffff);
			    int i_1194_ = i_1193_ >> 10 & 0x3f;
			    int i_1195_ = i_1193_ >> 7 & 0x7;
			    int i_1196_ = i_1193_ & 0x7f;
			    i_1194_ = i_1194_ + i_1115_ & 0x3f;
			    i_1195_ += i_1116_ / 4;
			    if (i_1195_ < 0)
				i_1195_ = 0;
			    else if (i_1195_ > 7)
				i_1195_ = 7;
			    i_1196_ += i_1117_;
			    if (i_1196_ < 0)
				i_1196_ = 0;
			    else if (i_1196_ > 127)
				i_1196_ = 127;
			    ((Class89_Sub1) this).aShortArray9361[i_1192_]
				= (short) (i_1194_ << 10 | i_1195_ << 7
					   | i_1196_);
			}
			bool_1187_ = bool_1187_ | is_1190_.length > 0;
		    }
		}
		if (bool_1187_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_1197_ = 0;
			     i_1197_ < ((Class89_Sub1) this).anInt9375;
			     i_1197_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_1197_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_1197_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & ~0xffffff
				   | (Class474.anIntArray6383
				      [((((Class89_Sub1) this).aShortArray9361
					 [((Class315) class315).anInt4841])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1198_ = 0; i_1198_ < i_1119_; i_1198_++) {
		    int i_1199_ = is[i_1198_];
		    if (i_1199_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1200_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1199_]);
			for (int i_1201_ = 0; i_1201_ < is_1200_.length;
			     i_1201_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1200_[i_1201_]]);
			    ((Class381) class381).anInt5664 += i_1115_;
			    ((Class381) class381).anInt5665 += i_1116_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1202_ = 0; i_1202_ < i_1119_; i_1202_++) {
		    int i_1203_ = is[i_1202_];
		    if (i_1203_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1204_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1203_]);
			for (int i_1205_ = 0; i_1205_ < is_1204_.length;
			     i_1205_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1204_[i_1205_]]);
			    ((Class381) class381).anInt5662
				= (((Class381) class381).anInt5662 * i_1115_
				   >> 7);
			    ((Class381) class381).anInt5663
				= (((Class381) class381).anInt5663 * i_1116_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1206_ = 0; i_1206_ < i_1119_; i_1206_++) {
		    int i_1207_ = is[i_1206_];
		    if (i_1207_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1208_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1207_]);
			for (int i_1209_ = 0; i_1209_ < is_1208_.length;
			     i_1209_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1208_[i_1209_]]);
			    ((Class381) class381).anInt5666
				= (((Class381) class381).anInt5666 + i_1115_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method1916(int i, int[] is, int i_1210_, int i_1211_, int i_1212_,
		    int i_1213_, boolean bool) {
	int i_1214_ = is.length;
	if (i == 0) {
	    i_1210_ <<= 4;
	    i_1211_ <<= 4;
	    i_1212_ <<= 4;
	    int i_1215_ = 0;
	    ((Class89_Sub1) this).anInt9389 = 0;
	    ((Class89_Sub1) this).anInt9390 = 0;
	    ((Class89_Sub1) this).anInt9391 = 0;
	    for (int i_1216_ = 0; i_1216_ < i_1214_; i_1216_++) {
		int i_1217_ = is[i_1216_];
		if (i_1217_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1218_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1217_];
		    for (int i_1219_ = 0; i_1219_ < is_1218_.length;
			 i_1219_++) {
			int i_1220_ = is_1218_[i_1219_];
			((Class89_Sub1) this).anInt9389
			    += ((Class89_Sub1) this).anIntArray9326[i_1220_];
			((Class89_Sub1) this).anInt9390
			    += ((Class89_Sub1) this).anIntArray9327[i_1220_];
			((Class89_Sub1) this).anInt9391
			    += ((Class89_Sub1) this).anIntArray9360[i_1220_];
			i_1215_++;
		    }
		}
	    }
	    if (i_1215_ > 0) {
		((Class89_Sub1) this).anInt9389
		    = ((Class89_Sub1) this).anInt9389 / i_1215_ + i_1210_;
		((Class89_Sub1) this).anInt9390
		    = ((Class89_Sub1) this).anInt9390 / i_1215_ + i_1211_;
		((Class89_Sub1) this).anInt9391
		    = ((Class89_Sub1) this).anInt9391 / i_1215_ + i_1212_;
	    } else {
		((Class89_Sub1) this).anInt9389 = i_1210_;
		((Class89_Sub1) this).anInt9390 = i_1211_;
		((Class89_Sub1) this).anInt9391 = i_1212_;
	    }
	} else if (i == 1) {
	    i_1210_ <<= 4;
	    i_1211_ <<= 4;
	    i_1212_ <<= 4;
	    for (int i_1221_ = 0; i_1221_ < i_1214_; i_1221_++) {
		int i_1222_ = is[i_1221_];
		if (i_1222_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1223_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1222_];
		    for (int i_1224_ = 0; i_1224_ < is_1223_.length;
			 i_1224_++) {
			int i_1225_ = is_1223_[i_1224_];
			((Class89_Sub1) this).anIntArray9326[i_1225_]
			    += i_1210_;
			((Class89_Sub1) this).anIntArray9327[i_1225_]
			    += i_1211_;
			((Class89_Sub1) this).anIntArray9360[i_1225_]
			    += i_1212_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1226_ = 0; i_1226_ < i_1214_; i_1226_++) {
		int i_1227_ = is[i_1226_];
		if (i_1227_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1228_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1227_];
		    if ((i_1213_ & 0x1) == 0) {
			for (int i_1229_ = 0; i_1229_ < is_1228_.length;
			     i_1229_++) {
			    int i_1230_ = is_1228_[i_1229_];
			    ((Class89_Sub1) this).anIntArray9326[i_1230_]
				-= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_1230_]
				-= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_1230_]
				-= ((Class89_Sub1) this).anInt9391;
			    if (i_1212_ != 0) {
				int i_1231_ = Class282.anIntArray4430[i_1212_];
				int i_1232_ = Class282.anIntArray4441[i_1212_];
				int i_1233_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_1230_]) * i_1231_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_1230_]) * i_1232_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9327[i_1230_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_1230_]) * i_1232_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_1230_]) * i_1231_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_1230_]
				    = i_1233_;
			    }
			    if (i_1210_ != 0) {
				int i_1234_ = Class282.anIntArray4430[i_1210_];
				int i_1235_ = Class282.anIntArray4441[i_1210_];
				int i_1236_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_1230_]) * i_1235_
					- (((Class89_Sub1) this).anIntArray9360
					   [i_1230_]) * i_1234_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_1230_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_1230_]) * i_1234_
				       + (((Class89_Sub1) this).anIntArray9360
					  [i_1230_]) * i_1235_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9327[i_1230_]
				    = i_1236_;
			    }
			    if (i_1211_ != 0) {
				int i_1237_ = Class282.anIntArray4430[i_1211_];
				int i_1238_ = Class282.anIntArray4441[i_1211_];
				int i_1239_
				    = (((((Class89_Sub1) this).anIntArray9360
					 [i_1230_]) * i_1237_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_1230_]) * i_1238_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_1230_]
				    = ((((Class89_Sub1) this).anIntArray9360
					[i_1230_]) * i_1238_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_1230_]) * i_1237_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_1230_]
				    = i_1239_;
			    }
			    ((Class89_Sub1) this).anIntArray9326[i_1230_]
				+= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_1230_]
				+= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_1230_]
				+= ((Class89_Sub1) this).anInt9391;
			}
		    } else {
			for (int i_1240_ = 0; i_1240_ < is_1228_.length;
			     i_1240_++) {
			    int i_1241_ = is_1228_[i_1240_];
			    ((Class89_Sub1) this).anIntArray9326[i_1241_]
				-= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_1241_]
				-= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_1241_]
				-= ((Class89_Sub1) this).anInt9391;
			    if (i_1210_ != 0) {
				int i_1242_ = Class282.anIntArray4430[i_1210_];
				int i_1243_ = Class282.anIntArray4441[i_1210_];
				int i_1244_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_1241_]) * i_1243_
					- (((Class89_Sub1) this).anIntArray9360
					   [i_1241_]) * i_1242_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_1241_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_1241_]) * i_1242_
				       + (((Class89_Sub1) this).anIntArray9360
					  [i_1241_]) * i_1243_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9327[i_1241_]
				    = i_1244_;
			    }
			    if (i_1212_ != 0) {
				int i_1245_ = Class282.anIntArray4430[i_1212_];
				int i_1246_ = Class282.anIntArray4441[i_1212_];
				int i_1247_
				    = (((((Class89_Sub1) this).anIntArray9327
					 [i_1241_]) * i_1245_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_1241_]) * i_1246_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9327[i_1241_]
				    = ((((Class89_Sub1) this).anIntArray9327
					[i_1241_]) * i_1246_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_1241_]) * i_1245_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_1241_]
				    = i_1247_;
			    }
			    if (i_1211_ != 0) {
				int i_1248_ = Class282.anIntArray4430[i_1211_];
				int i_1249_ = Class282.anIntArray4441[i_1211_];
				int i_1250_
				    = (((((Class89_Sub1) this).anIntArray9360
					 [i_1241_]) * i_1248_
					+ (((Class89_Sub1) this).anIntArray9326
					   [i_1241_]) * i_1249_
					+ 16383)
				       >> 14);
				((Class89_Sub1) this).anIntArray9360[i_1241_]
				    = ((((Class89_Sub1) this).anIntArray9360
					[i_1241_]) * i_1249_
				       - (((Class89_Sub1) this).anIntArray9326
					  [i_1241_]) * i_1248_
				       + 16383) >> 14;
				((Class89_Sub1) this).anIntArray9326[i_1241_]
				    = i_1250_;
			    }
			    ((Class89_Sub1) this).anIntArray9326[i_1241_]
				+= ((Class89_Sub1) this).anInt9389;
			    ((Class89_Sub1) this).anIntArray9327[i_1241_]
				+= ((Class89_Sub1) this).anInt9390;
			    ((Class89_Sub1) this).anIntArray9360[i_1241_]
				+= ((Class89_Sub1) this).anInt9391;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1251_ = 0; i_1251_ < i_1214_; i_1251_++) {
		    int i_1252_ = is[i_1251_];
		    if (i_1252_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1253_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1252_]);
			for (int i_1254_ = 0; i_1254_ < is_1253_.length;
			     i_1254_++) {
			    int i_1255_ = is_1253_[i_1254_];
			    int i_1256_ = (((Class89_Sub1) this).anIntArray9374
					   [i_1255_]);
			    int i_1257_ = (((Class89_Sub1) this).anIntArray9374
					   [i_1255_ + 1]);
			    for (int i_1258_ = i_1256_;
				 (i_1258_ < i_1257_
				  && (((Class89_Sub1) this).aShortArray9328
				      [i_1258_]) != 0);
				 i_1258_++) {
				int i_1259_ = (((((Class89_Sub1) this)
						 .aShortArray9328[i_1258_])
						& 0xffff)
					       - 1);
				if (i_1212_ != 0) {
				    int i_1260_
					= Class282.anIntArray4430[i_1212_];
				    int i_1261_
					= Class282.anIntArray4441[i_1212_];
				    int i_1262_ = (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1259_]) * i_1260_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1259_]) * i_1261_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9335
					[i_1259_]
					= (short) (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1259_]) * i_1261_
						    - (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1259_]) * i_1260_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9334
					[i_1259_]
					= (short) i_1262_;
				}
				if (i_1210_ != 0) {
				    int i_1263_
					= Class282.anIntArray4430[i_1210_];
				    int i_1264_
					= Class282.anIntArray4441[i_1210_];
				    int i_1265_ = (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1259_]) * i_1264_
						    - (((Class89_Sub1) this)
						       .aShortArray9371
						       [i_1259_]) * i_1263_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9371
					[i_1259_]
					= (short) (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1259_]) * i_1263_
						    + (((Class89_Sub1) this)
						       .aShortArray9371
						       [i_1259_]) * i_1264_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9335
					[i_1259_]
					= (short) i_1265_;
				}
				if (i_1211_ != 0) {
				    int i_1266_
					= Class282.anIntArray4430[i_1211_];
				    int i_1267_
					= Class282.anIntArray4441[i_1211_];
				    int i_1268_ = (((((Class89_Sub1) this)
						     .aShortArray9371
						     [i_1259_]) * i_1266_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1259_]) * i_1267_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9371
					[i_1259_]
					= (short) (((((Class89_Sub1) this)
						     .aShortArray9371
						     [i_1259_]) * i_1267_
						    - (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1259_]) * i_1266_
						    + 16383)
						   >> 14);
				    ((Class89_Sub1) this).aShortArray9334
					[i_1259_]
					= (short) i_1268_;
				}
			    }
			}
		    }
		}
		method15493();
	    }
	} else if (i == 3) {
	    for (int i_1269_ = 0; i_1269_ < i_1214_; i_1269_++) {
		int i_1270_ = is[i_1269_];
		if (i_1270_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1271_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1270_];
		    for (int i_1272_ = 0; i_1272_ < is_1271_.length;
			 i_1272_++) {
			int i_1273_ = is_1271_[i_1272_];
			((Class89_Sub1) this).anIntArray9326[i_1273_]
			    -= ((Class89_Sub1) this).anInt9389;
			((Class89_Sub1) this).anIntArray9327[i_1273_]
			    -= ((Class89_Sub1) this).anInt9390;
			((Class89_Sub1) this).anIntArray9360[i_1273_]
			    -= ((Class89_Sub1) this).anInt9391;
			((Class89_Sub1) this).anIntArray9326[i_1273_]
			    = (((Class89_Sub1) this).anIntArray9326[i_1273_]
			       * i_1210_) >> 7;
			((Class89_Sub1) this).anIntArray9327[i_1273_]
			    = (((Class89_Sub1) this).anIntArray9327[i_1273_]
			       * i_1211_) >> 7;
			((Class89_Sub1) this).anIntArray9360[i_1273_]
			    = (((Class89_Sub1) this).anIntArray9360[i_1273_]
			       * i_1212_) >> 7;
			((Class89_Sub1) this).anIntArray9326[i_1273_]
			    += ((Class89_Sub1) this).anInt9389;
			((Class89_Sub1) this).anIntArray9327[i_1273_]
			    += ((Class89_Sub1) this).anInt9390;
			((Class89_Sub1) this).anIntArray9360[i_1273_]
			    += ((Class89_Sub1) this).anInt9391;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_1274_ = false;
		for (int i_1275_ = 0; i_1275_ < i_1214_; i_1275_++) {
		    int i_1276_ = is[i_1275_];
		    if (i_1276_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_1277_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_1276_]);
			for (int i_1278_ = 0; i_1278_ < is_1277_.length;
			     i_1278_++) {
			    int i_1279_ = is_1277_[i_1278_];
			    int i_1280_ = (((((Class89_Sub1) this)
					     .aByteArray9344[i_1279_])
					    & 0xff)
					   + i_1210_ * 8);
			    if (i_1280_ < 0)
				i_1280_ = 0;
			    else if (i_1280_ > 255)
				i_1280_ = 255;
			    ((Class89_Sub1) this).aByteArray9344[i_1279_]
				= (byte) i_1280_;
			}
			bool_1274_ = bool_1274_ | is_1277_.length > 0;
		    }
		}
		if (bool_1274_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_1281_ = 0;
			     i_1281_ < ((Class89_Sub1) this).anInt9375;
			     i_1281_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_1281_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_1281_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & 0xffffff
				   | 255 - ((((Class89_Sub1) this)
					     .aByteArray9344
					     [((Class315) class315).anInt4841])
					    & 0xff) << 24);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_1282_ = false;
		for (int i_1283_ = 0; i_1283_ < i_1214_; i_1283_++) {
		    int i_1284_ = is[i_1283_];
		    if (i_1284_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_1285_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_1284_]);
			for (int i_1286_ = 0; i_1286_ < is_1285_.length;
			     i_1286_++) {
			    int i_1287_ = is_1285_[i_1286_];
			    int i_1288_ = ((((Class89_Sub1) this)
					    .aShortArray9361[i_1287_])
					   & 0xffff);
			    int i_1289_ = i_1288_ >> 10 & 0x3f;
			    int i_1290_ = i_1288_ >> 7 & 0x7;
			    int i_1291_ = i_1288_ & 0x7f;
			    i_1289_ = i_1289_ + i_1210_ & 0x3f;
			    i_1290_ += i_1211_ / 4;
			    if (i_1290_ < 0)
				i_1290_ = 0;
			    else if (i_1290_ > 7)
				i_1290_ = 7;
			    i_1291_ += i_1212_;
			    if (i_1291_ < 0)
				i_1291_ = 0;
			    else if (i_1291_ > 127)
				i_1291_ = 127;
			    ((Class89_Sub1) this).aShortArray9361[i_1287_]
				= (short) (i_1289_ << 10 | i_1290_ << 7
					   | i_1291_);
			}
			bool_1282_ = bool_1282_ | is_1285_.length > 0;
		    }
		}
		if (bool_1282_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_1292_ = 0;
			     i_1292_ < ((Class89_Sub1) this).anInt9375;
			     i_1292_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_1292_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_1292_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & ~0xffffff
				   | (Class474.anIntArray6383
				      [((((Class89_Sub1) this).aShortArray9361
					 [((Class315) class315).anInt4841])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1293_ = 0; i_1293_ < i_1214_; i_1293_++) {
		    int i_1294_ = is[i_1293_];
		    if (i_1294_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1295_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1294_]);
			for (int i_1296_ = 0; i_1296_ < is_1295_.length;
			     i_1296_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1295_[i_1296_]]);
			    ((Class381) class381).anInt5664 += i_1210_;
			    ((Class381) class381).anInt5665 += i_1211_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1297_ = 0; i_1297_ < i_1214_; i_1297_++) {
		    int i_1298_ = is[i_1297_];
		    if (i_1298_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1299_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1298_]);
			for (int i_1300_ = 0; i_1300_ < is_1299_.length;
			     i_1300_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1299_[i_1300_]]);
			    ((Class381) class381).anInt5662
				= (((Class381) class381).anInt5662 * i_1210_
				   >> 7);
			    ((Class381) class381).anInt5663
				= (((Class381) class381).anInt5663 * i_1211_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1301_ = 0; i_1301_ < i_1214_; i_1301_++) {
		    int i_1302_ = is[i_1301_];
		    if (i_1302_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1303_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1302_]);
			for (int i_1304_ = 0; i_1304_ < is_1303_.length;
			     i_1304_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1303_[i_1304_]]);
			    ((Class381) class381).anInt5666
				= (((Class381) class381).anInt5666 + i_1210_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public int method1978() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9336;
    }
    
    void method15488() {
	int i = 32767;
	int i_1305_ = 32767;
	int i_1306_ = 32767;
	int i_1307_ = -32768;
	int i_1308_ = -32768;
	int i_1309_ = -32768;
	int i_1310_ = 0;
	int i_1311_ = 0;
	for (int i_1312_ = 0; i_1312_ < ((Class89_Sub1) this).anInt9325;
	     i_1312_++) {
	    int i_1313_ = ((Class89_Sub1) this).anIntArray9326[i_1312_];
	    int i_1314_ = ((Class89_Sub1) this).anIntArray9327[i_1312_];
	    int i_1315_ = ((Class89_Sub1) this).anIntArray9360[i_1312_];
	    if (i_1313_ < i)
		i = i_1313_;
	    if (i_1313_ > i_1307_)
		i_1307_ = i_1313_;
	    if (i_1314_ < i_1305_)
		i_1305_ = i_1314_;
	    if (i_1314_ > i_1308_)
		i_1308_ = i_1314_;
	    if (i_1315_ < i_1306_)
		i_1306_ = i_1315_;
	    if (i_1315_ > i_1309_)
		i_1309_ = i_1315_;
	    int i_1316_ = i_1313_ * i_1313_ + i_1315_ * i_1315_;
	    if (i_1316_ > i_1310_)
		i_1310_ = i_1316_;
	    i_1316_
		= i_1313_ * i_1313_ + i_1315_ * i_1315_ + i_1314_ * i_1314_;
	    if (i_1316_ > i_1311_)
		i_1311_ = i_1316_;
	}
	((Class89_Sub1) this).anInt9365 = i;
	((Class89_Sub1) this).anInt9366 = i_1307_;
	((Class89_Sub1) this).anInt9363 = i_1305_;
	((Class89_Sub1) this).anInt9364 = i_1308_;
	((Class89_Sub1) this).anInt9332 = i_1306_;
	((Class89_Sub1) this).anInt9359 = i_1309_;
	((Class89_Sub1) this).anInt9336
	    = (int) (Math.sqrt((double) i_1310_) + 0.99);
	((Class89_Sub1) this).anInt9380
	    = (int) (Math.sqrt((double) i_1311_) + 0.99);
	((Class89_Sub1) this).aBool9323 = true;
    }
    
    void method1963(int i, int[] is, int i_1317_, int i_1318_, int i_1319_,
		    boolean bool, int i_1320_, int[] is_1321_) {
	int i_1322_ = is.length;
	if (i == 0) {
	    i_1317_ <<= 4;
	    i_1318_ <<= 4;
	    i_1319_ <<= 4;
	    int i_1323_ = 0;
	    ((Class89_Sub1) this).anInt9389 = 0;
	    ((Class89_Sub1) this).anInt9390 = 0;
	    ((Class89_Sub1) this).anInt9391 = 0;
	    for (int i_1324_ = 0; i_1324_ < i_1322_; i_1324_++) {
		int i_1325_ = is[i_1324_];
		if (i_1325_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1326_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1325_];
		    for (int i_1327_ = 0; i_1327_ < is_1326_.length;
			 i_1327_++) {
			int i_1328_ = is_1326_[i_1327_];
			if (((Class89_Sub1) this).aShortArray9330 == null
			    || (i_1320_ & (((Class89_Sub1) this)
					   .aShortArray9330[i_1328_])) != 0) {
			    ((Class89_Sub1) this).anInt9389
				+= (((Class89_Sub1) this).anIntArray9326
				    [i_1328_]);
			    ((Class89_Sub1) this).anInt9390
				+= (((Class89_Sub1) this).anIntArray9327
				    [i_1328_]);
			    ((Class89_Sub1) this).anInt9391
				+= (((Class89_Sub1) this).anIntArray9360
				    [i_1328_]);
			    i_1323_++;
			}
		    }
		}
	    }
	    if (i_1323_ > 0) {
		((Class89_Sub1) this).anInt9389
		    = ((Class89_Sub1) this).anInt9389 / i_1323_ + i_1317_;
		((Class89_Sub1) this).anInt9390
		    = ((Class89_Sub1) this).anInt9390 / i_1323_ + i_1318_;
		((Class89_Sub1) this).anInt9391
		    = ((Class89_Sub1) this).anInt9391 / i_1323_ + i_1319_;
		((Class89_Sub1) this).aBool9392 = true;
	    } else {
		((Class89_Sub1) this).anInt9389 = i_1317_;
		((Class89_Sub1) this).anInt9390 = i_1318_;
		((Class89_Sub1) this).anInt9391 = i_1319_;
	    }
	} else if (i == 1) {
	    if (is_1321_ != null) {
		int i_1329_ = ((is_1321_[0] * i_1317_ + is_1321_[1] * i_1318_
				+ is_1321_[2] * i_1319_ + 8192)
			       >> 14);
		int i_1330_ = ((is_1321_[3] * i_1317_ + is_1321_[4] * i_1318_
				+ is_1321_[5] * i_1319_ + 8192)
			       >> 14);
		int i_1331_ = ((is_1321_[6] * i_1317_ + is_1321_[7] * i_1318_
				+ is_1321_[8] * i_1319_ + 8192)
			       >> 14);
		i_1317_ = i_1329_;
		i_1318_ = i_1330_;
		i_1319_ = i_1331_;
	    }
	    i_1317_ <<= 4;
	    i_1318_ <<= 4;
	    i_1319_ <<= 4;
	    for (int i_1332_ = 0; i_1332_ < i_1322_; i_1332_++) {
		int i_1333_ = is[i_1332_];
		if (i_1333_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1334_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1333_];
		    for (int i_1335_ = 0; i_1335_ < is_1334_.length;
			 i_1335_++) {
			int i_1336_ = is_1334_[i_1335_];
			if (((Class89_Sub1) this).aShortArray9330 == null
			    || (i_1320_ & (((Class89_Sub1) this)
					   .aShortArray9330[i_1336_])) != 0) {
			    ((Class89_Sub1) this).anIntArray9326[i_1336_]
				+= i_1317_;
			    ((Class89_Sub1) this).anIntArray9327[i_1336_]
				+= i_1318_;
			    ((Class89_Sub1) this).anIntArray9360[i_1336_]
				+= i_1319_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1321_ != null) {
		int i_1337_ = is_1321_[9] << 4;
		int i_1338_ = is_1321_[10] << 4;
		int i_1339_ = is_1321_[11] << 4;
		int i_1340_ = is_1321_[12] << 4;
		int i_1341_ = is_1321_[13] << 4;
		int i_1342_ = is_1321_[14] << 4;
		if (((Class89_Sub1) this).aBool9392) {
		    int i_1343_
			= ((is_1321_[0] * ((Class89_Sub1) this).anInt9389
			    + is_1321_[3] * ((Class89_Sub1) this).anInt9390
			    + is_1321_[6] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1344_
			= ((is_1321_[1] * ((Class89_Sub1) this).anInt9389
			    + is_1321_[4] * ((Class89_Sub1) this).anInt9390
			    + is_1321_[7] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1345_
			= ((is_1321_[2] * ((Class89_Sub1) this).anInt9389
			    + is_1321_[5] * ((Class89_Sub1) this).anInt9390
			    + is_1321_[8] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    i_1343_ += i_1340_;
		    i_1344_ += i_1341_;
		    i_1345_ += i_1342_;
		    ((Class89_Sub1) this).anInt9389 = i_1343_;
		    ((Class89_Sub1) this).anInt9390 = i_1344_;
		    ((Class89_Sub1) this).anInt9391 = i_1345_;
		    ((Class89_Sub1) this).aBool9392 = false;
		}
		int[] is_1346_ = new int[9];
		int i_1347_ = Class282.anIntArray4441[i_1317_];
		int i_1348_ = Class282.anIntArray4430[i_1317_];
		int i_1349_ = Class282.anIntArray4441[i_1318_];
		int i_1350_ = Class282.anIntArray4430[i_1318_];
		int i_1351_ = Class282.anIntArray4441[i_1319_];
		int i_1352_ = Class282.anIntArray4430[i_1319_];
		int i_1353_ = i_1348_ * i_1351_ + 8192 >> 14;
		int i_1354_ = i_1348_ * i_1352_ + 8192 >> 14;
		is_1346_[0]
		    = i_1349_ * i_1351_ + i_1350_ * i_1354_ + 8192 >> 14;
		is_1346_[1]
		    = -i_1349_ * i_1352_ + i_1350_ * i_1353_ + 8192 >> 14;
		is_1346_[2] = i_1350_ * i_1347_ + 8192 >> 14;
		is_1346_[3] = i_1347_ * i_1352_ + 8192 >> 14;
		is_1346_[4] = i_1347_ * i_1351_ + 8192 >> 14;
		is_1346_[5] = -i_1348_;
		is_1346_[6]
		    = -i_1350_ * i_1351_ + i_1349_ * i_1354_ + 8192 >> 14;
		is_1346_[7]
		    = i_1350_ * i_1352_ + i_1349_ * i_1353_ + 8192 >> 14;
		is_1346_[8] = i_1349_ * i_1347_ + 8192 >> 14;
		int i_1355_ = (is_1346_[0] * -((Class89_Sub1) this).anInt9389
			       + is_1346_[1] * -((Class89_Sub1) this).anInt9390
			       + is_1346_[2] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_1356_ = (is_1346_[3] * -((Class89_Sub1) this).anInt9389
			       + is_1346_[4] * -((Class89_Sub1) this).anInt9390
			       + is_1346_[5] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_1357_ = (is_1346_[6] * -((Class89_Sub1) this).anInt9389
			       + is_1346_[7] * -((Class89_Sub1) this).anInt9390
			       + is_1346_[8] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_1358_ = i_1355_ + ((Class89_Sub1) this).anInt9389;
		int i_1359_ = i_1356_ + ((Class89_Sub1) this).anInt9390;
		int i_1360_ = i_1357_ + ((Class89_Sub1) this).anInt9391;
		int[] is_1361_ = new int[9];
		for (int i_1362_ = 0; i_1362_ < 3; i_1362_++) {
		    for (int i_1363_ = 0; i_1363_ < 3; i_1363_++) {
			int i_1364_ = 0;
			for (int i_1365_ = 0; i_1365_ < 3; i_1365_++)
			    i_1364_ += (is_1346_[i_1362_ * 3 + i_1365_]
					* is_1321_[i_1363_ * 3 + i_1365_]);
			is_1361_[i_1362_ * 3 + i_1363_] = i_1364_ + 8192 >> 14;
		    }
		}
		int i_1366_ = ((is_1346_[0] * i_1340_ + is_1346_[1] * i_1341_
				+ is_1346_[2] * i_1342_ + 8192)
			       >> 14);
		int i_1367_ = ((is_1346_[3] * i_1340_ + is_1346_[4] * i_1341_
				+ is_1346_[5] * i_1342_ + 8192)
			       >> 14);
		int i_1368_ = ((is_1346_[6] * i_1340_ + is_1346_[7] * i_1341_
				+ is_1346_[8] * i_1342_ + 8192)
			       >> 14);
		i_1366_ += i_1358_;
		i_1367_ += i_1359_;
		i_1368_ += i_1360_;
		int[] is_1369_ = new int[9];
		for (int i_1370_ = 0; i_1370_ < 3; i_1370_++) {
		    for (int i_1371_ = 0; i_1371_ < 3; i_1371_++) {
			int i_1372_ = 0;
			for (int i_1373_ = 0; i_1373_ < 3; i_1373_++)
			    i_1372_ += (is_1321_[i_1370_ * 3 + i_1373_]
					* is_1361_[i_1371_ + i_1373_ * 3]);
			is_1369_[i_1370_ * 3 + i_1371_] = i_1372_ + 8192 >> 14;
		    }
		}
		int i_1374_ = ((is_1321_[0] * i_1366_ + is_1321_[1] * i_1367_
				+ is_1321_[2] * i_1368_ + 8192)
			       >> 14);
		int i_1375_ = ((is_1321_[3] * i_1366_ + is_1321_[4] * i_1367_
				+ is_1321_[5] * i_1368_ + 8192)
			       >> 14);
		int i_1376_ = ((is_1321_[6] * i_1366_ + is_1321_[7] * i_1367_
				+ is_1321_[8] * i_1368_ + 8192)
			       >> 14);
		i_1374_ += i_1337_;
		i_1375_ += i_1338_;
		i_1376_ += i_1339_;
		for (int i_1377_ = 0; i_1377_ < i_1322_; i_1377_++) {
		    int i_1378_ = is[i_1377_];
		    if (i_1378_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1379_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1378_]);
			for (int i_1380_ = 0; i_1380_ < is_1379_.length;
			     i_1380_++) {
			    int i_1381_ = is_1379_[i_1380_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1320_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1381_]))
				    != 0)) {
				int i_1382_
				    = (is_1369_[0] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1381_])
				       + is_1369_[1] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1381_])
				       + is_1369_[2] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1381_])
				       + 8192) >> 14;
				int i_1383_
				    = (is_1369_[3] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1381_])
				       + is_1369_[4] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1381_])
				       + is_1369_[5] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1381_])
				       + 8192) >> 14;
				int i_1384_
				    = (is_1369_[6] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1381_])
				       + is_1369_[7] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1381_])
				       + is_1369_[8] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1381_])
				       + 8192) >> 14;
				i_1382_ += i_1374_;
				i_1383_ += i_1375_;
				i_1384_ += i_1376_;
				((Class89_Sub1) this).anIntArray9326[i_1381_]
				    = i_1382_;
				((Class89_Sub1) this).anIntArray9327[i_1381_]
				    = i_1383_;
				((Class89_Sub1) this).anIntArray9360[i_1381_]
				    = i_1384_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1385_ = 0; i_1385_ < i_1322_; i_1385_++) {
		    int i_1386_ = is[i_1385_];
		    if (i_1386_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1387_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1386_]);
			for (int i_1388_ = 0; i_1388_ < is_1387_.length;
			     i_1388_++) {
			    int i_1389_ = is_1387_[i_1388_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1320_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1389_]))
				    != 0)) {
				((Class89_Sub1) this).anIntArray9326[i_1389_]
				    -= ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1389_]
				    -= ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1389_]
				    -= ((Class89_Sub1) this).anInt9391;
				if (i_1319_ != 0) {
				    int i_1390_
					= Class282.anIntArray4430[i_1319_];
				    int i_1391_
					= Class282.anIntArray4441[i_1319_];
				    int i_1392_
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1389_]) * i_1390_
					   + ((((Class89_Sub1) this)
					       .anIntArray9326[i_1389_])
					      * i_1391_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9327
					[i_1389_]
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1389_]) * i_1391_
					   - ((((Class89_Sub1) this)
					       .anIntArray9326[i_1389_])
					      * i_1390_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9326
					[i_1389_]
					= i_1392_;
				}
				if (i_1317_ != 0) {
				    int i_1393_
					= Class282.anIntArray4430[i_1317_];
				    int i_1394_
					= Class282.anIntArray4441[i_1317_];
				    int i_1395_
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1389_]) * i_1394_
					   - ((((Class89_Sub1) this)
					       .anIntArray9360[i_1389_])
					      * i_1393_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9360
					[i_1389_]
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1389_]) * i_1393_
					   + ((((Class89_Sub1) this)
					       .anIntArray9360[i_1389_])
					      * i_1394_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9327
					[i_1389_]
					= i_1395_;
				}
				if (i_1318_ != 0) {
				    int i_1396_
					= Class282.anIntArray4430[i_1318_];
				    int i_1397_
					= Class282.anIntArray4441[i_1318_];
				    int i_1398_
					= ((((Class89_Sub1) this)
					    .anIntArray9360[i_1389_]) * i_1396_
					   + ((((Class89_Sub1) this)
					       .anIntArray9326[i_1389_])
					      * i_1397_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9360
					[i_1389_]
					= ((((Class89_Sub1) this)
					    .anIntArray9360[i_1389_]) * i_1397_
					   - ((((Class89_Sub1) this)
					       .anIntArray9326[i_1389_])
					      * i_1396_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9326
					[i_1389_]
					= i_1398_;
				}
				((Class89_Sub1) this).anIntArray9326[i_1389_]
				    += ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1389_]
				    += ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1389_]
				    += ((Class89_Sub1) this).anInt9391;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1399_ = 0; i_1399_ < i_1322_; i_1399_++) {
			int i_1400_ = is[i_1399_];
			if (i_1400_ < (((Class89_Sub1) this)
				       .anIntArrayArray9329).length) {
			    int[] is_1401_ = (((Class89_Sub1) this)
					      .anIntArrayArray9329[i_1400_]);
			    for (int i_1402_ = 0; i_1402_ < is_1401_.length;
				 i_1402_++) {
				int i_1403_ = is_1401_[i_1402_];
				if ((((Class89_Sub1) this).aShortArray9330
				     == null)
				    || ((i_1320_ & (((Class89_Sub1) this)
						    .aShortArray9330[i_1403_]))
					!= 0)) {
				    int i_1404_ = (((Class89_Sub1) this)
						   .anIntArray9374[i_1403_]);
				    int i_1405_
					= (((Class89_Sub1) this).anIntArray9374
					   [i_1403_ + 1]);
				    for (int i_1406_ = i_1404_;
					 (i_1406_ < i_1405_
					  && (((Class89_Sub1) this)
					      .aShortArray9328[i_1406_]) != 0);
					 i_1406_++) {
					int i_1407_
					    = (((((Class89_Sub1) this)
						 .aShortArray9328[i_1406_])
						& 0xffff)
					       - 1);
					if (i_1319_ != 0) {
					    int i_1408_
						= (Class282.anIntArray4430
						   [i_1319_]);
					    int i_1409_
						= (Class282.anIntArray4441
						   [i_1319_]);
					    int i_1410_
						= (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1407_]) * i_1408_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1407_]) * i_1409_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9335[i_1407_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9335
							      [i_1407_])
							     * i_1409_)
							    - ((((Class89_Sub1)
								 this)
								.aShortArray9334
								[i_1407_])
							       * i_1408_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9334[i_1407_]
						= (short) i_1410_;
					}
					if (i_1317_ != 0) {
					    int i_1411_
						= (Class282.anIntArray4430
						   [i_1317_]);
					    int i_1412_
						= (Class282.anIntArray4441
						   [i_1317_]);
					    int i_1413_
						= (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1407_]) * i_1412_
						    - (((Class89_Sub1) this)
						       .aShortArray9371
						       [i_1407_]) * i_1411_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9371[i_1407_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9335
							      [i_1407_])
							     * i_1411_)
							    + ((((Class89_Sub1)
								 this)
								.aShortArray9371
								[i_1407_])
							       * i_1412_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9335[i_1407_]
						= (short) i_1413_;
					}
					if (i_1318_ != 0) {
					    int i_1414_
						= (Class282.anIntArray4430
						   [i_1318_]);
					    int i_1415_
						= (Class282.anIntArray4441
						   [i_1318_]);
					    int i_1416_
						= (((((Class89_Sub1) this)
						     .aShortArray9371
						     [i_1407_]) * i_1414_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1407_]) * i_1415_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9371[i_1407_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9371
							      [i_1407_])
							     * i_1415_)
							    - ((((Class89_Sub1)
								 this)
								.aShortArray9334
								[i_1407_])
							       * i_1414_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9334[i_1407_]
						= (short) i_1416_;
					}
				    }
				}
			    }
			}
		    }
		    method15493();
		}
	    }
	} else if (i == 3) {
	    if (is_1321_ != null) {
		int i_1417_ = is_1321_[9] << 4;
		int i_1418_ = is_1321_[10] << 4;
		int i_1419_ = is_1321_[11] << 4;
		int i_1420_ = is_1321_[12] << 4;
		int i_1421_ = is_1321_[13] << 4;
		int i_1422_ = is_1321_[14] << 4;
		if (((Class89_Sub1) this).aBool9392) {
		    int i_1423_
			= ((is_1321_[0] * ((Class89_Sub1) this).anInt9389
			    + is_1321_[3] * ((Class89_Sub1) this).anInt9390
			    + is_1321_[6] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1424_
			= ((is_1321_[1] * ((Class89_Sub1) this).anInt9389
			    + is_1321_[4] * ((Class89_Sub1) this).anInt9390
			    + is_1321_[7] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1425_
			= ((is_1321_[2] * ((Class89_Sub1) this).anInt9389
			    + is_1321_[5] * ((Class89_Sub1) this).anInt9390
			    + is_1321_[8] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    i_1423_ += i_1420_;
		    i_1424_ += i_1421_;
		    i_1425_ += i_1422_;
		    ((Class89_Sub1) this).anInt9389 = i_1423_;
		    ((Class89_Sub1) this).anInt9390 = i_1424_;
		    ((Class89_Sub1) this).anInt9391 = i_1425_;
		    ((Class89_Sub1) this).aBool9392 = false;
		}
		int i_1426_ = i_1317_ << 15 >> 7;
		int i_1427_ = i_1318_ << 15 >> 7;
		int i_1428_ = i_1319_ << 15 >> 7;
		int i_1429_
		    = i_1426_ * -((Class89_Sub1) this).anInt9389 + 8192 >> 14;
		int i_1430_
		    = i_1427_ * -((Class89_Sub1) this).anInt9390 + 8192 >> 14;
		int i_1431_
		    = i_1428_ * -((Class89_Sub1) this).anInt9391 + 8192 >> 14;
		int i_1432_ = i_1429_ + ((Class89_Sub1) this).anInt9389;
		int i_1433_ = i_1430_ + ((Class89_Sub1) this).anInt9390;
		int i_1434_ = i_1431_ + ((Class89_Sub1) this).anInt9391;
		int[] is_1435_ = new int[9];
		is_1435_[0] = i_1426_ * is_1321_[0] + 8192 >> 14;
		is_1435_[1] = i_1426_ * is_1321_[3] + 8192 >> 14;
		is_1435_[2] = i_1426_ * is_1321_[6] + 8192 >> 14;
		is_1435_[3] = i_1427_ * is_1321_[1] + 8192 >> 14;
		is_1435_[4] = i_1427_ * is_1321_[4] + 8192 >> 14;
		is_1435_[5] = i_1427_ * is_1321_[7] + 8192 >> 14;
		is_1435_[6] = i_1428_ * is_1321_[2] + 8192 >> 14;
		is_1435_[7] = i_1428_ * is_1321_[5] + 8192 >> 14;
		is_1435_[8] = i_1428_ * is_1321_[8] + 8192 >> 14;
		int i_1436_ = i_1426_ * i_1420_ + 8192 >> 14;
		int i_1437_ = i_1427_ * i_1421_ + 8192 >> 14;
		int i_1438_ = i_1428_ * i_1422_ + 8192 >> 14;
		i_1436_ += i_1432_;
		i_1437_ += i_1433_;
		i_1438_ += i_1434_;
		int[] is_1439_ = new int[9];
		for (int i_1440_ = 0; i_1440_ < 3; i_1440_++) {
		    for (int i_1441_ = 0; i_1441_ < 3; i_1441_++) {
			int i_1442_ = 0;
			for (int i_1443_ = 0; i_1443_ < 3; i_1443_++)
			    i_1442_ += (is_1321_[i_1440_ * 3 + i_1443_]
					* is_1435_[i_1441_ + i_1443_ * 3]);
			is_1439_[i_1440_ * 3 + i_1441_] = i_1442_ + 8192 >> 14;
		    }
		}
		int i_1444_ = ((is_1321_[0] * i_1436_ + is_1321_[1] * i_1437_
				+ is_1321_[2] * i_1438_ + 8192)
			       >> 14);
		int i_1445_ = ((is_1321_[3] * i_1436_ + is_1321_[4] * i_1437_
				+ is_1321_[5] * i_1438_ + 8192)
			       >> 14);
		int i_1446_ = ((is_1321_[6] * i_1436_ + is_1321_[7] * i_1437_
				+ is_1321_[8] * i_1438_ + 8192)
			       >> 14);
		i_1444_ += i_1417_;
		i_1445_ += i_1418_;
		i_1446_ += i_1419_;
		for (int i_1447_ = 0; i_1447_ < i_1322_; i_1447_++) {
		    int i_1448_ = is[i_1447_];
		    if (i_1448_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1449_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1448_]);
			for (int i_1450_ = 0; i_1450_ < is_1449_.length;
			     i_1450_++) {
			    int i_1451_ = is_1449_[i_1450_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1320_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1451_]))
				    != 0)) {
				int i_1452_
				    = (is_1439_[0] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1451_])
				       + is_1439_[1] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1451_])
				       + is_1439_[2] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1451_])
				       + 8192) >> 14;
				int i_1453_
				    = (is_1439_[3] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1451_])
				       + is_1439_[4] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1451_])
				       + is_1439_[5] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1451_])
				       + 8192) >> 14;
				int i_1454_
				    = (is_1439_[6] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1451_])
				       + is_1439_[7] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1451_])
				       + is_1439_[8] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1451_])
				       + 8192) >> 14;
				i_1452_ += i_1444_;
				i_1453_ += i_1445_;
				i_1454_ += i_1446_;
				((Class89_Sub1) this).anIntArray9326[i_1451_]
				    = i_1452_;
				((Class89_Sub1) this).anIntArray9327[i_1451_]
				    = i_1453_;
				((Class89_Sub1) this).anIntArray9360[i_1451_]
				    = i_1454_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1455_ = 0; i_1455_ < i_1322_; i_1455_++) {
		    int i_1456_ = is[i_1455_];
		    if (i_1456_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1457_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1456_]);
			for (int i_1458_ = 0; i_1458_ < is_1457_.length;
			     i_1458_++) {
			    int i_1459_ = is_1457_[i_1458_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1320_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1459_]))
				    != 0)) {
				((Class89_Sub1) this).anIntArray9326[i_1459_]
				    -= ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1459_]
				    -= ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1459_]
				    -= ((Class89_Sub1) this).anInt9391;
				((Class89_Sub1) this).anIntArray9326[i_1459_]
				    = (((Class89_Sub1) this).anIntArray9326
				       [i_1459_]) * i_1317_ >> 7;
				((Class89_Sub1) this).anIntArray9327[i_1459_]
				    = (((Class89_Sub1) this).anIntArray9327
				       [i_1459_]) * i_1318_ >> 7;
				((Class89_Sub1) this).anIntArray9360[i_1459_]
				    = (((Class89_Sub1) this).anIntArray9360
				       [i_1459_]) * i_1319_ >> 7;
				((Class89_Sub1) this).anIntArray9326[i_1459_]
				    += ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1459_]
				    += ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1459_]
				    += ((Class89_Sub1) this).anInt9391;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_1460_ = false;
		for (int i_1461_ = 0; i_1461_ < i_1322_; i_1461_++) {
		    int i_1462_ = is[i_1461_];
		    if (i_1462_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_1463_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_1462_]);
			for (int i_1464_ = 0; i_1464_ < is_1463_.length;
			     i_1464_++) {
			    int i_1465_ = is_1463_[i_1464_];
			    if (((Class89_Sub1) this).aShortArray9320 == null
				|| ((i_1320_ & (((Class89_Sub1) this)
						.aShortArray9320[i_1465_]))
				    != 0)) {
				int i_1466_ = (((((Class89_Sub1) this)
						 .aByteArray9344[i_1465_])
						& 0xff)
					       + i_1317_ * 8);
				if (i_1466_ < 0)
				    i_1466_ = 0;
				else if (i_1466_ > 255)
				    i_1466_ = 255;
				((Class89_Sub1) this).aByteArray9344[i_1465_]
				    = (byte) i_1466_;
			    }
			}
			bool_1460_ = bool_1460_ | is_1463_.length > 0;
		    }
		}
		if (bool_1460_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_1467_ = 0;
			     i_1467_ < ((Class89_Sub1) this).anInt9375;
			     i_1467_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_1467_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_1467_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & 0xffffff
				   | 255 - ((((Class89_Sub1) this)
					     .aByteArray9344
					     [((Class315) class315).anInt4841])
					    & 0xff) << 24);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_1468_ = false;
		for (int i_1469_ = 0; i_1469_ < i_1322_; i_1469_++) {
		    int i_1470_ = is[i_1469_];
		    if (i_1470_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_1471_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_1470_]);
			for (int i_1472_ = 0; i_1472_ < is_1471_.length;
			     i_1472_++) {
			    int i_1473_ = is_1471_[i_1472_];
			    if (((Class89_Sub1) this).aShortArray9320 == null
				|| ((i_1320_ & (((Class89_Sub1) this)
						.aShortArray9320[i_1473_]))
				    != 0)) {
				int i_1474_ = ((((Class89_Sub1) this)
						.aShortArray9361[i_1473_])
					       & 0xffff);
				int i_1475_ = i_1474_ >> 10 & 0x3f;
				int i_1476_ = i_1474_ >> 7 & 0x7;
				int i_1477_ = i_1474_ & 0x7f;
				i_1475_ = i_1475_ + i_1317_ & 0x3f;
				i_1476_ += i_1318_ / 4;
				if (i_1476_ < 0)
				    i_1476_ = 0;
				else if (i_1476_ > 7)
				    i_1476_ = 7;
				i_1477_ += i_1319_;
				if (i_1477_ < 0)
				    i_1477_ = 0;
				else if (i_1477_ > 127)
				    i_1477_ = 127;
				((Class89_Sub1) this).aShortArray9361[i_1473_]
				    = (short) (i_1475_ << 10 | i_1476_ << 7
					       | i_1477_);
			    }
			}
			bool_1468_ = bool_1468_ | is_1471_.length > 0;
		    }
		}
		if (bool_1468_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_1478_ = 0;
			     i_1478_ < ((Class89_Sub1) this).anInt9375;
			     i_1478_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_1478_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_1478_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & ~0xffffff
				   | (Class474.anIntArray6383
				      [((((Class89_Sub1) this).aShortArray9361
					 [((Class315) class315).anInt4841])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1479_ = 0; i_1479_ < i_1322_; i_1479_++) {
		    int i_1480_ = is[i_1479_];
		    if (i_1480_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1481_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1480_]);
			for (int i_1482_ = 0; i_1482_ < is_1481_.length;
			     i_1482_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1481_[i_1482_]]);
			    ((Class381) class381).anInt5664 += i_1317_;
			    ((Class381) class381).anInt5665 += i_1318_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1483_ = 0; i_1483_ < i_1322_; i_1483_++) {
		    int i_1484_ = is[i_1483_];
		    if (i_1484_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1485_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1484_]);
			for (int i_1486_ = 0; i_1486_ < is_1485_.length;
			     i_1486_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1485_[i_1486_]]);
			    ((Class381) class381).anInt5662
				= (((Class381) class381).anInt5662 * i_1317_
				   >> 7);
			    ((Class381) class381).anInt5663
				= (((Class381) class381).anInt5663 * i_1318_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1487_ = 0; i_1487_ < i_1322_; i_1487_++) {
		    int i_1488_ = is[i_1487_];
		    if (i_1488_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1489_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1488_]);
			for (int i_1490_ = 0; i_1490_ < is_1489_.length;
			     i_1490_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1489_[i_1490_]]);
			    ((Class381) class381).anInt5666
				= (((Class381) class381).anInt5666 + i_1317_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method1964(int i, int[] is, int i_1491_, int i_1492_, int i_1493_,
		    boolean bool, int i_1494_, int[] is_1495_) {
	int i_1496_ = is.length;
	if (i == 0) {
	    i_1491_ <<= 4;
	    i_1492_ <<= 4;
	    i_1493_ <<= 4;
	    int i_1497_ = 0;
	    ((Class89_Sub1) this).anInt9389 = 0;
	    ((Class89_Sub1) this).anInt9390 = 0;
	    ((Class89_Sub1) this).anInt9391 = 0;
	    for (int i_1498_ = 0; i_1498_ < i_1496_; i_1498_++) {
		int i_1499_ = is[i_1498_];
		if (i_1499_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1500_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1499_];
		    for (int i_1501_ = 0; i_1501_ < is_1500_.length;
			 i_1501_++) {
			int i_1502_ = is_1500_[i_1501_];
			if (((Class89_Sub1) this).aShortArray9330 == null
			    || (i_1494_ & (((Class89_Sub1) this)
					   .aShortArray9330[i_1502_])) != 0) {
			    ((Class89_Sub1) this).anInt9389
				+= (((Class89_Sub1) this).anIntArray9326
				    [i_1502_]);
			    ((Class89_Sub1) this).anInt9390
				+= (((Class89_Sub1) this).anIntArray9327
				    [i_1502_]);
			    ((Class89_Sub1) this).anInt9391
				+= (((Class89_Sub1) this).anIntArray9360
				    [i_1502_]);
			    i_1497_++;
			}
		    }
		}
	    }
	    if (i_1497_ > 0) {
		((Class89_Sub1) this).anInt9389
		    = ((Class89_Sub1) this).anInt9389 / i_1497_ + i_1491_;
		((Class89_Sub1) this).anInt9390
		    = ((Class89_Sub1) this).anInt9390 / i_1497_ + i_1492_;
		((Class89_Sub1) this).anInt9391
		    = ((Class89_Sub1) this).anInt9391 / i_1497_ + i_1493_;
		((Class89_Sub1) this).aBool9392 = true;
	    } else {
		((Class89_Sub1) this).anInt9389 = i_1491_;
		((Class89_Sub1) this).anInt9390 = i_1492_;
		((Class89_Sub1) this).anInt9391 = i_1493_;
	    }
	} else if (i == 1) {
	    if (is_1495_ != null) {
		int i_1503_ = ((is_1495_[0] * i_1491_ + is_1495_[1] * i_1492_
				+ is_1495_[2] * i_1493_ + 8192)
			       >> 14);
		int i_1504_ = ((is_1495_[3] * i_1491_ + is_1495_[4] * i_1492_
				+ is_1495_[5] * i_1493_ + 8192)
			       >> 14);
		int i_1505_ = ((is_1495_[6] * i_1491_ + is_1495_[7] * i_1492_
				+ is_1495_[8] * i_1493_ + 8192)
			       >> 14);
		i_1491_ = i_1503_;
		i_1492_ = i_1504_;
		i_1493_ = i_1505_;
	    }
	    i_1491_ <<= 4;
	    i_1492_ <<= 4;
	    i_1493_ <<= 4;
	    for (int i_1506_ = 0; i_1506_ < i_1496_; i_1506_++) {
		int i_1507_ = is[i_1506_];
		if (i_1507_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1508_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1507_];
		    for (int i_1509_ = 0; i_1509_ < is_1508_.length;
			 i_1509_++) {
			int i_1510_ = is_1508_[i_1509_];
			if (((Class89_Sub1) this).aShortArray9330 == null
			    || (i_1494_ & (((Class89_Sub1) this)
					   .aShortArray9330[i_1510_])) != 0) {
			    ((Class89_Sub1) this).anIntArray9326[i_1510_]
				+= i_1491_;
			    ((Class89_Sub1) this).anIntArray9327[i_1510_]
				+= i_1492_;
			    ((Class89_Sub1) this).anIntArray9360[i_1510_]
				+= i_1493_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1495_ != null) {
		int i_1511_ = is_1495_[9] << 4;
		int i_1512_ = is_1495_[10] << 4;
		int i_1513_ = is_1495_[11] << 4;
		int i_1514_ = is_1495_[12] << 4;
		int i_1515_ = is_1495_[13] << 4;
		int i_1516_ = is_1495_[14] << 4;
		if (((Class89_Sub1) this).aBool9392) {
		    int i_1517_
			= ((is_1495_[0] * ((Class89_Sub1) this).anInt9389
			    + is_1495_[3] * ((Class89_Sub1) this).anInt9390
			    + is_1495_[6] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1518_
			= ((is_1495_[1] * ((Class89_Sub1) this).anInt9389
			    + is_1495_[4] * ((Class89_Sub1) this).anInt9390
			    + is_1495_[7] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1519_
			= ((is_1495_[2] * ((Class89_Sub1) this).anInt9389
			    + is_1495_[5] * ((Class89_Sub1) this).anInt9390
			    + is_1495_[8] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    i_1517_ += i_1514_;
		    i_1518_ += i_1515_;
		    i_1519_ += i_1516_;
		    ((Class89_Sub1) this).anInt9389 = i_1517_;
		    ((Class89_Sub1) this).anInt9390 = i_1518_;
		    ((Class89_Sub1) this).anInt9391 = i_1519_;
		    ((Class89_Sub1) this).aBool9392 = false;
		}
		int[] is_1520_ = new int[9];
		int i_1521_ = Class282.anIntArray4441[i_1491_];
		int i_1522_ = Class282.anIntArray4430[i_1491_];
		int i_1523_ = Class282.anIntArray4441[i_1492_];
		int i_1524_ = Class282.anIntArray4430[i_1492_];
		int i_1525_ = Class282.anIntArray4441[i_1493_];
		int i_1526_ = Class282.anIntArray4430[i_1493_];
		int i_1527_ = i_1522_ * i_1525_ + 8192 >> 14;
		int i_1528_ = i_1522_ * i_1526_ + 8192 >> 14;
		is_1520_[0]
		    = i_1523_ * i_1525_ + i_1524_ * i_1528_ + 8192 >> 14;
		is_1520_[1]
		    = -i_1523_ * i_1526_ + i_1524_ * i_1527_ + 8192 >> 14;
		is_1520_[2] = i_1524_ * i_1521_ + 8192 >> 14;
		is_1520_[3] = i_1521_ * i_1526_ + 8192 >> 14;
		is_1520_[4] = i_1521_ * i_1525_ + 8192 >> 14;
		is_1520_[5] = -i_1522_;
		is_1520_[6]
		    = -i_1524_ * i_1525_ + i_1523_ * i_1528_ + 8192 >> 14;
		is_1520_[7]
		    = i_1524_ * i_1526_ + i_1523_ * i_1527_ + 8192 >> 14;
		is_1520_[8] = i_1523_ * i_1521_ + 8192 >> 14;
		int i_1529_ = (is_1520_[0] * -((Class89_Sub1) this).anInt9389
			       + is_1520_[1] * -((Class89_Sub1) this).anInt9390
			       + is_1520_[2] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_1530_ = (is_1520_[3] * -((Class89_Sub1) this).anInt9389
			       + is_1520_[4] * -((Class89_Sub1) this).anInt9390
			       + is_1520_[5] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_1531_ = (is_1520_[6] * -((Class89_Sub1) this).anInt9389
			       + is_1520_[7] * -((Class89_Sub1) this).anInt9390
			       + is_1520_[8] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_1532_ = i_1529_ + ((Class89_Sub1) this).anInt9389;
		int i_1533_ = i_1530_ + ((Class89_Sub1) this).anInt9390;
		int i_1534_ = i_1531_ + ((Class89_Sub1) this).anInt9391;
		int[] is_1535_ = new int[9];
		for (int i_1536_ = 0; i_1536_ < 3; i_1536_++) {
		    for (int i_1537_ = 0; i_1537_ < 3; i_1537_++) {
			int i_1538_ = 0;
			for (int i_1539_ = 0; i_1539_ < 3; i_1539_++)
			    i_1538_ += (is_1520_[i_1536_ * 3 + i_1539_]
					* is_1495_[i_1537_ * 3 + i_1539_]);
			is_1535_[i_1536_ * 3 + i_1537_] = i_1538_ + 8192 >> 14;
		    }
		}
		int i_1540_ = ((is_1520_[0] * i_1514_ + is_1520_[1] * i_1515_
				+ is_1520_[2] * i_1516_ + 8192)
			       >> 14);
		int i_1541_ = ((is_1520_[3] * i_1514_ + is_1520_[4] * i_1515_
				+ is_1520_[5] * i_1516_ + 8192)
			       >> 14);
		int i_1542_ = ((is_1520_[6] * i_1514_ + is_1520_[7] * i_1515_
				+ is_1520_[8] * i_1516_ + 8192)
			       >> 14);
		i_1540_ += i_1532_;
		i_1541_ += i_1533_;
		i_1542_ += i_1534_;
		int[] is_1543_ = new int[9];
		for (int i_1544_ = 0; i_1544_ < 3; i_1544_++) {
		    for (int i_1545_ = 0; i_1545_ < 3; i_1545_++) {
			int i_1546_ = 0;
			for (int i_1547_ = 0; i_1547_ < 3; i_1547_++)
			    i_1546_ += (is_1495_[i_1544_ * 3 + i_1547_]
					* is_1535_[i_1545_ + i_1547_ * 3]);
			is_1543_[i_1544_ * 3 + i_1545_] = i_1546_ + 8192 >> 14;
		    }
		}
		int i_1548_ = ((is_1495_[0] * i_1540_ + is_1495_[1] * i_1541_
				+ is_1495_[2] * i_1542_ + 8192)
			       >> 14);
		int i_1549_ = ((is_1495_[3] * i_1540_ + is_1495_[4] * i_1541_
				+ is_1495_[5] * i_1542_ + 8192)
			       >> 14);
		int i_1550_ = ((is_1495_[6] * i_1540_ + is_1495_[7] * i_1541_
				+ is_1495_[8] * i_1542_ + 8192)
			       >> 14);
		i_1548_ += i_1511_;
		i_1549_ += i_1512_;
		i_1550_ += i_1513_;
		for (int i_1551_ = 0; i_1551_ < i_1496_; i_1551_++) {
		    int i_1552_ = is[i_1551_];
		    if (i_1552_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1553_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1552_]);
			for (int i_1554_ = 0; i_1554_ < is_1553_.length;
			     i_1554_++) {
			    int i_1555_ = is_1553_[i_1554_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1494_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1555_]))
				    != 0)) {
				int i_1556_
				    = (is_1543_[0] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1555_])
				       + is_1543_[1] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1555_])
				       + is_1543_[2] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1555_])
				       + 8192) >> 14;
				int i_1557_
				    = (is_1543_[3] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1555_])
				       + is_1543_[4] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1555_])
				       + is_1543_[5] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1555_])
				       + 8192) >> 14;
				int i_1558_
				    = (is_1543_[6] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1555_])
				       + is_1543_[7] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1555_])
				       + is_1543_[8] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1555_])
				       + 8192) >> 14;
				i_1556_ += i_1548_;
				i_1557_ += i_1549_;
				i_1558_ += i_1550_;
				((Class89_Sub1) this).anIntArray9326[i_1555_]
				    = i_1556_;
				((Class89_Sub1) this).anIntArray9327[i_1555_]
				    = i_1557_;
				((Class89_Sub1) this).anIntArray9360[i_1555_]
				    = i_1558_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1559_ = 0; i_1559_ < i_1496_; i_1559_++) {
		    int i_1560_ = is[i_1559_];
		    if (i_1560_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1561_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1560_]);
			for (int i_1562_ = 0; i_1562_ < is_1561_.length;
			     i_1562_++) {
			    int i_1563_ = is_1561_[i_1562_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1494_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1563_]))
				    != 0)) {
				((Class89_Sub1) this).anIntArray9326[i_1563_]
				    -= ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1563_]
				    -= ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1563_]
				    -= ((Class89_Sub1) this).anInt9391;
				if (i_1493_ != 0) {
				    int i_1564_
					= Class282.anIntArray4430[i_1493_];
				    int i_1565_
					= Class282.anIntArray4441[i_1493_];
				    int i_1566_
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1563_]) * i_1564_
					   + ((((Class89_Sub1) this)
					       .anIntArray9326[i_1563_])
					      * i_1565_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9327
					[i_1563_]
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1563_]) * i_1565_
					   - ((((Class89_Sub1) this)
					       .anIntArray9326[i_1563_])
					      * i_1564_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9326
					[i_1563_]
					= i_1566_;
				}
				if (i_1491_ != 0) {
				    int i_1567_
					= Class282.anIntArray4430[i_1491_];
				    int i_1568_
					= Class282.anIntArray4441[i_1491_];
				    int i_1569_
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1563_]) * i_1568_
					   - ((((Class89_Sub1) this)
					       .anIntArray9360[i_1563_])
					      * i_1567_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9360
					[i_1563_]
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1563_]) * i_1567_
					   + ((((Class89_Sub1) this)
					       .anIntArray9360[i_1563_])
					      * i_1568_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9327
					[i_1563_]
					= i_1569_;
				}
				if (i_1492_ != 0) {
				    int i_1570_
					= Class282.anIntArray4430[i_1492_];
				    int i_1571_
					= Class282.anIntArray4441[i_1492_];
				    int i_1572_
					= ((((Class89_Sub1) this)
					    .anIntArray9360[i_1563_]) * i_1570_
					   + ((((Class89_Sub1) this)
					       .anIntArray9326[i_1563_])
					      * i_1571_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9360
					[i_1563_]
					= ((((Class89_Sub1) this)
					    .anIntArray9360[i_1563_]) * i_1571_
					   - ((((Class89_Sub1) this)
					       .anIntArray9326[i_1563_])
					      * i_1570_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9326
					[i_1563_]
					= i_1572_;
				}
				((Class89_Sub1) this).anIntArray9326[i_1563_]
				    += ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1563_]
				    += ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1563_]
				    += ((Class89_Sub1) this).anInt9391;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1573_ = 0; i_1573_ < i_1496_; i_1573_++) {
			int i_1574_ = is[i_1573_];
			if (i_1574_ < (((Class89_Sub1) this)
				       .anIntArrayArray9329).length) {
			    int[] is_1575_ = (((Class89_Sub1) this)
					      .anIntArrayArray9329[i_1574_]);
			    for (int i_1576_ = 0; i_1576_ < is_1575_.length;
				 i_1576_++) {
				int i_1577_ = is_1575_[i_1576_];
				if ((((Class89_Sub1) this).aShortArray9330
				     == null)
				    || ((i_1494_ & (((Class89_Sub1) this)
						    .aShortArray9330[i_1577_]))
					!= 0)) {
				    int i_1578_ = (((Class89_Sub1) this)
						   .anIntArray9374[i_1577_]);
				    int i_1579_
					= (((Class89_Sub1) this).anIntArray9374
					   [i_1577_ + 1]);
				    for (int i_1580_ = i_1578_;
					 (i_1580_ < i_1579_
					  && (((Class89_Sub1) this)
					      .aShortArray9328[i_1580_]) != 0);
					 i_1580_++) {
					int i_1581_
					    = (((((Class89_Sub1) this)
						 .aShortArray9328[i_1580_])
						& 0xffff)
					       - 1);
					if (i_1493_ != 0) {
					    int i_1582_
						= (Class282.anIntArray4430
						   [i_1493_]);
					    int i_1583_
						= (Class282.anIntArray4441
						   [i_1493_]);
					    int i_1584_
						= (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1581_]) * i_1582_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1581_]) * i_1583_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9335[i_1581_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9335
							      [i_1581_])
							     * i_1583_)
							    - ((((Class89_Sub1)
								 this)
								.aShortArray9334
								[i_1581_])
							       * i_1582_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9334[i_1581_]
						= (short) i_1584_;
					}
					if (i_1491_ != 0) {
					    int i_1585_
						= (Class282.anIntArray4430
						   [i_1491_]);
					    int i_1586_
						= (Class282.anIntArray4441
						   [i_1491_]);
					    int i_1587_
						= (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1581_]) * i_1586_
						    - (((Class89_Sub1) this)
						       .aShortArray9371
						       [i_1581_]) * i_1585_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9371[i_1581_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9335
							      [i_1581_])
							     * i_1585_)
							    + ((((Class89_Sub1)
								 this)
								.aShortArray9371
								[i_1581_])
							       * i_1586_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9335[i_1581_]
						= (short) i_1587_;
					}
					if (i_1492_ != 0) {
					    int i_1588_
						= (Class282.anIntArray4430
						   [i_1492_]);
					    int i_1589_
						= (Class282.anIntArray4441
						   [i_1492_]);
					    int i_1590_
						= (((((Class89_Sub1) this)
						     .aShortArray9371
						     [i_1581_]) * i_1588_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1581_]) * i_1589_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9371[i_1581_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9371
							      [i_1581_])
							     * i_1589_)
							    - ((((Class89_Sub1)
								 this)
								.aShortArray9334
								[i_1581_])
							       * i_1588_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9334[i_1581_]
						= (short) i_1590_;
					}
				    }
				}
			    }
			}
		    }
		    method15493();
		}
	    }
	} else if (i == 3) {
	    if (is_1495_ != null) {
		int i_1591_ = is_1495_[9] << 4;
		int i_1592_ = is_1495_[10] << 4;
		int i_1593_ = is_1495_[11] << 4;
		int i_1594_ = is_1495_[12] << 4;
		int i_1595_ = is_1495_[13] << 4;
		int i_1596_ = is_1495_[14] << 4;
		if (((Class89_Sub1) this).aBool9392) {
		    int i_1597_
			= ((is_1495_[0] * ((Class89_Sub1) this).anInt9389
			    + is_1495_[3] * ((Class89_Sub1) this).anInt9390
			    + is_1495_[6] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1598_
			= ((is_1495_[1] * ((Class89_Sub1) this).anInt9389
			    + is_1495_[4] * ((Class89_Sub1) this).anInt9390
			    + is_1495_[7] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1599_
			= ((is_1495_[2] * ((Class89_Sub1) this).anInt9389
			    + is_1495_[5] * ((Class89_Sub1) this).anInt9390
			    + is_1495_[8] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    i_1597_ += i_1594_;
		    i_1598_ += i_1595_;
		    i_1599_ += i_1596_;
		    ((Class89_Sub1) this).anInt9389 = i_1597_;
		    ((Class89_Sub1) this).anInt9390 = i_1598_;
		    ((Class89_Sub1) this).anInt9391 = i_1599_;
		    ((Class89_Sub1) this).aBool9392 = false;
		}
		int i_1600_ = i_1491_ << 15 >> 7;
		int i_1601_ = i_1492_ << 15 >> 7;
		int i_1602_ = i_1493_ << 15 >> 7;
		int i_1603_
		    = i_1600_ * -((Class89_Sub1) this).anInt9389 + 8192 >> 14;
		int i_1604_
		    = i_1601_ * -((Class89_Sub1) this).anInt9390 + 8192 >> 14;
		int i_1605_
		    = i_1602_ * -((Class89_Sub1) this).anInt9391 + 8192 >> 14;
		int i_1606_ = i_1603_ + ((Class89_Sub1) this).anInt9389;
		int i_1607_ = i_1604_ + ((Class89_Sub1) this).anInt9390;
		int i_1608_ = i_1605_ + ((Class89_Sub1) this).anInt9391;
		int[] is_1609_ = new int[9];
		is_1609_[0] = i_1600_ * is_1495_[0] + 8192 >> 14;
		is_1609_[1] = i_1600_ * is_1495_[3] + 8192 >> 14;
		is_1609_[2] = i_1600_ * is_1495_[6] + 8192 >> 14;
		is_1609_[3] = i_1601_ * is_1495_[1] + 8192 >> 14;
		is_1609_[4] = i_1601_ * is_1495_[4] + 8192 >> 14;
		is_1609_[5] = i_1601_ * is_1495_[7] + 8192 >> 14;
		is_1609_[6] = i_1602_ * is_1495_[2] + 8192 >> 14;
		is_1609_[7] = i_1602_ * is_1495_[5] + 8192 >> 14;
		is_1609_[8] = i_1602_ * is_1495_[8] + 8192 >> 14;
		int i_1610_ = i_1600_ * i_1594_ + 8192 >> 14;
		int i_1611_ = i_1601_ * i_1595_ + 8192 >> 14;
		int i_1612_ = i_1602_ * i_1596_ + 8192 >> 14;
		i_1610_ += i_1606_;
		i_1611_ += i_1607_;
		i_1612_ += i_1608_;
		int[] is_1613_ = new int[9];
		for (int i_1614_ = 0; i_1614_ < 3; i_1614_++) {
		    for (int i_1615_ = 0; i_1615_ < 3; i_1615_++) {
			int i_1616_ = 0;
			for (int i_1617_ = 0; i_1617_ < 3; i_1617_++)
			    i_1616_ += (is_1495_[i_1614_ * 3 + i_1617_]
					* is_1609_[i_1615_ + i_1617_ * 3]);
			is_1613_[i_1614_ * 3 + i_1615_] = i_1616_ + 8192 >> 14;
		    }
		}
		int i_1618_ = ((is_1495_[0] * i_1610_ + is_1495_[1] * i_1611_
				+ is_1495_[2] * i_1612_ + 8192)
			       >> 14);
		int i_1619_ = ((is_1495_[3] * i_1610_ + is_1495_[4] * i_1611_
				+ is_1495_[5] * i_1612_ + 8192)
			       >> 14);
		int i_1620_ = ((is_1495_[6] * i_1610_ + is_1495_[7] * i_1611_
				+ is_1495_[8] * i_1612_ + 8192)
			       >> 14);
		i_1618_ += i_1591_;
		i_1619_ += i_1592_;
		i_1620_ += i_1593_;
		for (int i_1621_ = 0; i_1621_ < i_1496_; i_1621_++) {
		    int i_1622_ = is[i_1621_];
		    if (i_1622_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1623_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1622_]);
			for (int i_1624_ = 0; i_1624_ < is_1623_.length;
			     i_1624_++) {
			    int i_1625_ = is_1623_[i_1624_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1494_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1625_]))
				    != 0)) {
				int i_1626_
				    = (is_1613_[0] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1625_])
				       + is_1613_[1] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1625_])
				       + is_1613_[2] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1625_])
				       + 8192) >> 14;
				int i_1627_
				    = (is_1613_[3] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1625_])
				       + is_1613_[4] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1625_])
				       + is_1613_[5] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1625_])
				       + 8192) >> 14;
				int i_1628_
				    = (is_1613_[6] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1625_])
				       + is_1613_[7] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1625_])
				       + is_1613_[8] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1625_])
				       + 8192) >> 14;
				i_1626_ += i_1618_;
				i_1627_ += i_1619_;
				i_1628_ += i_1620_;
				((Class89_Sub1) this).anIntArray9326[i_1625_]
				    = i_1626_;
				((Class89_Sub1) this).anIntArray9327[i_1625_]
				    = i_1627_;
				((Class89_Sub1) this).anIntArray9360[i_1625_]
				    = i_1628_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1629_ = 0; i_1629_ < i_1496_; i_1629_++) {
		    int i_1630_ = is[i_1629_];
		    if (i_1630_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1631_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1630_]);
			for (int i_1632_ = 0; i_1632_ < is_1631_.length;
			     i_1632_++) {
			    int i_1633_ = is_1631_[i_1632_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1494_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1633_]))
				    != 0)) {
				((Class89_Sub1) this).anIntArray9326[i_1633_]
				    -= ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1633_]
				    -= ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1633_]
				    -= ((Class89_Sub1) this).anInt9391;
				((Class89_Sub1) this).anIntArray9326[i_1633_]
				    = (((Class89_Sub1) this).anIntArray9326
				       [i_1633_]) * i_1491_ >> 7;
				((Class89_Sub1) this).anIntArray9327[i_1633_]
				    = (((Class89_Sub1) this).anIntArray9327
				       [i_1633_]) * i_1492_ >> 7;
				((Class89_Sub1) this).anIntArray9360[i_1633_]
				    = (((Class89_Sub1) this).anIntArray9360
				       [i_1633_]) * i_1493_ >> 7;
				((Class89_Sub1) this).anIntArray9326[i_1633_]
				    += ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1633_]
				    += ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1633_]
				    += ((Class89_Sub1) this).anInt9391;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_1634_ = false;
		for (int i_1635_ = 0; i_1635_ < i_1496_; i_1635_++) {
		    int i_1636_ = is[i_1635_];
		    if (i_1636_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_1637_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_1636_]);
			for (int i_1638_ = 0; i_1638_ < is_1637_.length;
			     i_1638_++) {
			    int i_1639_ = is_1637_[i_1638_];
			    if (((Class89_Sub1) this).aShortArray9320 == null
				|| ((i_1494_ & (((Class89_Sub1) this)
						.aShortArray9320[i_1639_]))
				    != 0)) {
				int i_1640_ = (((((Class89_Sub1) this)
						 .aByteArray9344[i_1639_])
						& 0xff)
					       + i_1491_ * 8);
				if (i_1640_ < 0)
				    i_1640_ = 0;
				else if (i_1640_ > 255)
				    i_1640_ = 255;
				((Class89_Sub1) this).aByteArray9344[i_1639_]
				    = (byte) i_1640_;
			    }
			}
			bool_1634_ = bool_1634_ | is_1637_.length > 0;
		    }
		}
		if (bool_1634_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_1641_ = 0;
			     i_1641_ < ((Class89_Sub1) this).anInt9375;
			     i_1641_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_1641_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_1641_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & 0xffffff
				   | 255 - ((((Class89_Sub1) this)
					     .aByteArray9344
					     [((Class315) class315).anInt4841])
					    & 0xff) << 24);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_1642_ = false;
		for (int i_1643_ = 0; i_1643_ < i_1496_; i_1643_++) {
		    int i_1644_ = is[i_1643_];
		    if (i_1644_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_1645_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_1644_]);
			for (int i_1646_ = 0; i_1646_ < is_1645_.length;
			     i_1646_++) {
			    int i_1647_ = is_1645_[i_1646_];
			    if (((Class89_Sub1) this).aShortArray9320 == null
				|| ((i_1494_ & (((Class89_Sub1) this)
						.aShortArray9320[i_1647_]))
				    != 0)) {
				int i_1648_ = ((((Class89_Sub1) this)
						.aShortArray9361[i_1647_])
					       & 0xffff);
				int i_1649_ = i_1648_ >> 10 & 0x3f;
				int i_1650_ = i_1648_ >> 7 & 0x7;
				int i_1651_ = i_1648_ & 0x7f;
				i_1649_ = i_1649_ + i_1491_ & 0x3f;
				i_1650_ += i_1492_ / 4;
				if (i_1650_ < 0)
				    i_1650_ = 0;
				else if (i_1650_ > 7)
				    i_1650_ = 7;
				i_1651_ += i_1493_;
				if (i_1651_ < 0)
				    i_1651_ = 0;
				else if (i_1651_ > 127)
				    i_1651_ = 127;
				((Class89_Sub1) this).aShortArray9361[i_1647_]
				    = (short) (i_1649_ << 10 | i_1650_ << 7
					       | i_1651_);
			    }
			}
			bool_1642_ = bool_1642_ | is_1645_.length > 0;
		    }
		}
		if (bool_1642_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_1652_ = 0;
			     i_1652_ < ((Class89_Sub1) this).anInt9375;
			     i_1652_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_1652_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_1652_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & ~0xffffff
				   | (Class474.anIntArray6383
				      [((((Class89_Sub1) this).aShortArray9361
					 [((Class315) class315).anInt4841])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1653_ = 0; i_1653_ < i_1496_; i_1653_++) {
		    int i_1654_ = is[i_1653_];
		    if (i_1654_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1655_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1654_]);
			for (int i_1656_ = 0; i_1656_ < is_1655_.length;
			     i_1656_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1655_[i_1656_]]);
			    ((Class381) class381).anInt5664 += i_1491_;
			    ((Class381) class381).anInt5665 += i_1492_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1657_ = 0; i_1657_ < i_1496_; i_1657_++) {
		    int i_1658_ = is[i_1657_];
		    if (i_1658_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1659_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1658_]);
			for (int i_1660_ = 0; i_1660_ < is_1659_.length;
			     i_1660_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1659_[i_1660_]]);
			    ((Class381) class381).anInt5662
				= (((Class381) class381).anInt5662 * i_1491_
				   >> 7);
			    ((Class381) class381).anInt5663
				= (((Class381) class381).anInt5663 * i_1492_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1661_ = 0; i_1661_ < i_1496_; i_1661_++) {
		    int i_1662_ = is[i_1661_];
		    if (i_1662_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1663_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1662_]);
			for (int i_1664_ = 0; i_1664_ < is_1663_.length;
			     i_1664_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1663_[i_1664_]]);
			    ((Class381) class381).anInt5666
				= (((Class381) class381).anInt5666 + i_1491_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method1876(int i, int i_1665_, int i_1666_, int i_1667_) {
	if (i == 0) {
	    int i_1668_ = 0;
	    ((Class89_Sub1) this).anInt9389 = 0;
	    ((Class89_Sub1) this).anInt9390 = 0;
	    ((Class89_Sub1) this).anInt9391 = 0;
	    for (int i_1669_ = 0; i_1669_ < ((Class89_Sub1) this).anInt9325;
		 i_1669_++) {
		((Class89_Sub1) this).anInt9389
		    += ((Class89_Sub1) this).anIntArray9326[i_1669_];
		((Class89_Sub1) this).anInt9390
		    += ((Class89_Sub1) this).anIntArray9327[i_1669_];
		((Class89_Sub1) this).anInt9391
		    += ((Class89_Sub1) this).anIntArray9360[i_1669_];
		i_1668_++;
	    }
	    if (i_1668_ > 0) {
		((Class89_Sub1) this).anInt9389
		    = ((Class89_Sub1) this).anInt9389 / i_1668_ + i_1665_;
		((Class89_Sub1) this).anInt9390
		    = ((Class89_Sub1) this).anInt9390 / i_1668_ + i_1666_;
		((Class89_Sub1) this).anInt9391
		    = ((Class89_Sub1) this).anInt9391 / i_1668_ + i_1667_;
	    } else {
		((Class89_Sub1) this).anInt9389 = i_1665_;
		((Class89_Sub1) this).anInt9390 = i_1666_;
		((Class89_Sub1) this).anInt9391 = i_1667_;
	    }
	} else if (i == 1) {
	    for (int i_1670_ = 0; i_1670_ < ((Class89_Sub1) this).anInt9325;
		 i_1670_++) {
		((Class89_Sub1) this).anIntArray9326[i_1670_] += i_1665_;
		((Class89_Sub1) this).anIntArray9327[i_1670_] += i_1666_;
		((Class89_Sub1) this).anIntArray9360[i_1670_] += i_1667_;
	    }
	} else if (i == 2) {
	    for (int i_1671_ = 0; i_1671_ < ((Class89_Sub1) this).anInt9325;
		 i_1671_++) {
		((Class89_Sub1) this).anIntArray9326[i_1671_]
		    -= ((Class89_Sub1) this).anInt9389;
		((Class89_Sub1) this).anIntArray9327[i_1671_]
		    -= ((Class89_Sub1) this).anInt9390;
		((Class89_Sub1) this).anIntArray9360[i_1671_]
		    -= ((Class89_Sub1) this).anInt9391;
		if (i_1667_ != 0) {
		    int i_1672_ = Class282.anIntArray4430[i_1667_];
		    int i_1673_ = Class282.anIntArray4441[i_1667_];
		    int i_1674_
			= (((((Class89_Sub1) this).anIntArray9327[i_1671_]
			     * i_1672_)
			    + (((Class89_Sub1) this).anIntArray9326[i_1671_]
			       * i_1673_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub1) this).anIntArray9327[i_1671_]
			= ((((Class89_Sub1) this).anIntArray9327[i_1671_]
			    * i_1673_)
			   - (((Class89_Sub1) this).anIntArray9326[i_1671_]
			      * i_1672_)
			   + 16383) >> 14;
		    ((Class89_Sub1) this).anIntArray9326[i_1671_] = i_1674_;
		}
		if (i_1665_ != 0) {
		    int i_1675_ = Class282.anIntArray4430[i_1665_];
		    int i_1676_ = Class282.anIntArray4441[i_1665_];
		    int i_1677_
			= (((((Class89_Sub1) this).anIntArray9327[i_1671_]
			     * i_1676_)
			    - (((Class89_Sub1) this).anIntArray9360[i_1671_]
			       * i_1675_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub1) this).anIntArray9360[i_1671_]
			= ((((Class89_Sub1) this).anIntArray9327[i_1671_]
			    * i_1675_)
			   + (((Class89_Sub1) this).anIntArray9360[i_1671_]
			      * i_1676_)
			   + 16383) >> 14;
		    ((Class89_Sub1) this).anIntArray9327[i_1671_] = i_1677_;
		}
		if (i_1666_ != 0) {
		    int i_1678_ = Class282.anIntArray4430[i_1666_];
		    int i_1679_ = Class282.anIntArray4441[i_1666_];
		    int i_1680_
			= (((((Class89_Sub1) this).anIntArray9360[i_1671_]
			     * i_1678_)
			    + (((Class89_Sub1) this).anIntArray9326[i_1671_]
			       * i_1679_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub1) this).anIntArray9360[i_1671_]
			= ((((Class89_Sub1) this).anIntArray9360[i_1671_]
			    * i_1679_)
			   - (((Class89_Sub1) this).anIntArray9326[i_1671_]
			      * i_1678_)
			   + 16383) >> 14;
		    ((Class89_Sub1) this).anIntArray9326[i_1671_] = i_1680_;
		}
		((Class89_Sub1) this).anIntArray9326[i_1671_]
		    += ((Class89_Sub1) this).anInt9389;
		((Class89_Sub1) this).anIntArray9327[i_1671_]
		    += ((Class89_Sub1) this).anInt9390;
		((Class89_Sub1) this).anIntArray9360[i_1671_]
		    += ((Class89_Sub1) this).anInt9391;
	    }
	} else if (i == 3) {
	    for (int i_1681_ = 0; i_1681_ < ((Class89_Sub1) this).anInt9325;
		 i_1681_++) {
		((Class89_Sub1) this).anIntArray9326[i_1681_]
		    -= ((Class89_Sub1) this).anInt9389;
		((Class89_Sub1) this).anIntArray9327[i_1681_]
		    -= ((Class89_Sub1) this).anInt9390;
		((Class89_Sub1) this).anIntArray9360[i_1681_]
		    -= ((Class89_Sub1) this).anInt9391;
		((Class89_Sub1) this).anIntArray9326[i_1681_]
		    = (((Class89_Sub1) this).anIntArray9326[i_1681_] * i_1665_
		       / 128);
		((Class89_Sub1) this).anIntArray9327[i_1681_]
		    = (((Class89_Sub1) this).anIntArray9327[i_1681_] * i_1666_
		       / 128);
		((Class89_Sub1) this).anIntArray9360[i_1681_]
		    = (((Class89_Sub1) this).anIntArray9360[i_1681_] * i_1667_
		       / 128);
		((Class89_Sub1) this).anIntArray9326[i_1681_]
		    += ((Class89_Sub1) this).anInt9389;
		((Class89_Sub1) this).anIntArray9327[i_1681_]
		    += ((Class89_Sub1) this).anInt9390;
		((Class89_Sub1) this).anIntArray9360[i_1681_]
		    += ((Class89_Sub1) this).anInt9391;
	    }
	} else if (i == 5) {
	    for (int i_1682_ = 0; i_1682_ < ((Class89_Sub1) this).anInt9331;
		 i_1682_++) {
		int i_1683_
		    = ((((Class89_Sub1) this).aByteArray9344[i_1682_] & 0xff)
		       + i_1665_ * 8);
		if (i_1683_ < 0)
		    i_1683_ = 0;
		else if (i_1683_ > 255)
		    i_1683_ = 255;
		((Class89_Sub1) this).aByteArray9344[i_1682_] = (byte) i_1683_;
	    }
	    if (((Class89_Sub1) this).aClass315Array9333 != null) {
		for (int i_1684_ = 0;
		     i_1684_ < ((Class89_Sub1) this).anInt9375; i_1684_++) {
		    Class315 class315
			= ((Class89_Sub1) this).aClass315Array9333[i_1684_];
		    Class381 class381
			= ((Class89_Sub1) this).aClass381Array9379[i_1684_];
		    ((Class381) class381).anInt5661
			= (((Class381) class381).anInt5661 & 0xffffff
			   | 255 - ((((Class89_Sub1) this).aByteArray9344
				     [((Class315) class315).anInt4841])
				    & 0xff) << 24);
		}
	    }
	    method15474();
	} else if (i == 7) {
	    for (int i_1685_ = 0; i_1685_ < ((Class89_Sub1) this).anInt9331;
		 i_1685_++) {
		int i_1686_
		    = ((Class89_Sub1) this).aShortArray9361[i_1685_] & 0xffff;
		int i_1687_ = i_1686_ >> 10 & 0x3f;
		int i_1688_ = i_1686_ >> 7 & 0x7;
		int i_1689_ = i_1686_ & 0x7f;
		i_1687_ = i_1687_ + i_1665_ & 0x3f;
		i_1688_ += i_1666_ / 4;
		if (i_1688_ < 0)
		    i_1688_ = 0;
		else if (i_1688_ > 7)
		    i_1688_ = 7;
		i_1689_ += i_1667_;
		if (i_1689_ < 0)
		    i_1689_ = 0;
		else if (i_1689_ > 127)
		    i_1689_ = 127;
		((Class89_Sub1) this).aShortArray9361[i_1685_]
		    = (short) (i_1687_ << 10 | i_1688_ << 7 | i_1689_);
	    }
	    if (((Class89_Sub1) this).aClass315Array9333 != null) {
		for (int i_1690_ = 0;
		     i_1690_ < ((Class89_Sub1) this).anInt9375; i_1690_++) {
		    Class315 class315
			= ((Class89_Sub1) this).aClass315Array9333[i_1690_];
		    Class381 class381
			= ((Class89_Sub1) this).aClass381Array9379[i_1690_];
		    ((Class381) class381).anInt5661
			= (((Class381) class381).anInt5661 & ~0xffffff
			   | ((Class474.anIntArray6383
			       [(((Class89_Sub1) this).aShortArray9361
				 [((Class315) class315).anInt4841]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15474();
	} else if (i == 8) {
	    for (int i_1691_ = 0; i_1691_ < ((Class89_Sub1) this).anInt9375;
		 i_1691_++) {
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i_1691_];
		((Class381) class381).anInt5664 += i_1665_;
		((Class381) class381).anInt5665 += i_1666_;
	    }
	} else if (i == 10) {
	    for (int i_1692_ = 0; i_1692_ < ((Class89_Sub1) this).anInt9375;
		 i_1692_++) {
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i_1692_];
		((Class381) class381).anInt5662
		    = ((Class381) class381).anInt5662 * i_1665_ >> 7;
		((Class381) class381).anInt5663
		    = ((Class381) class381).anInt5663 * i_1666_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_1693_ = 0; i_1693_ < ((Class89_Sub1) this).anInt9375;
		 i_1693_++) {
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i_1693_];
		((Class381) class381).anInt5666
		    = ((Class381) class381).anInt5666 + i_1665_ & 0x3fff;
	    }
	}
    }
    
    public void method1966(Class266 class266, int i, boolean bool) {
	if (((Class89_Sub1) this).aShortArray9330 != null) {
	    Class266 class266_1694_ = class266;
	    if (bool) {
		class266_1694_
		    = ((Class103_Sub3) (((Class89_Sub1) this)
					.aClass103_Sub3_9319)).aClass266_9588;
		class266_1694_.method5153(class266);
	    }
	    float[] fs = new float[3];
	    for (int i_1695_ = 0; i_1695_ < ((Class89_Sub1) this).anInt9325;
		 i_1695_++) {
		if ((i & ((Class89_Sub1) this).aShortArray9330[i_1695_])
		    != 0) {
		    class266_1694_.method5119
			((float) ((Class89_Sub1) this).anIntArray9326[i_1695_],
			 (float) ((Class89_Sub1) this).anIntArray9327[i_1695_],
			 (float) ((Class89_Sub1) this).anIntArray9360[i_1695_],
			 fs);
		    ((Class89_Sub1) this).anIntArray9326[i_1695_]
			= (int) fs[0];
		    ((Class89_Sub1) this).anIntArray9327[i_1695_]
			= (int) fs[1];
		    ((Class89_Sub1) this).anIntArray9360[i_1695_]
			= (int) fs[2];
		}
	    }
	}
    }
    
    public void method1933(int i) {
	int i_1696_ = Class282.anIntArray4430[i];
	int i_1697_ = Class282.anIntArray4441[i];
	for (int i_1698_ = 0; i_1698_ < ((Class89_Sub1) this).anInt9325;
	     i_1698_++) {
	    int i_1699_
		= ((((Class89_Sub1) this).anIntArray9360[i_1698_] * i_1696_
		    + ((Class89_Sub1) this).anIntArray9326[i_1698_] * i_1697_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9360[i_1698_]
		= ((((Class89_Sub1) this).anIntArray9360[i_1698_] * i_1697_
		    - ((Class89_Sub1) this).anIntArray9326[i_1698_] * i_1696_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9326[i_1698_] = i_1699_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method2006(Class266 class266, Class97 class97, int i) {
	if (aClass365_9317 != null)
	    aClass365_9317.method6557();
	if (class97 != null)
	    class97.aBool1352 = false;
	if (((Class89_Sub1) this).anInt9378 != 0) {
	    Class268 class268
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass268_9521);
	    Class268 class268_1700_
		= ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	    Class268 class268_1701_
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass268_9646);
	    class268_1700_.method5203(class266);
	    class268_1701_.method5199(class268_1700_);
	    class268_1701_.method5202(((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aClass268_9525);
	    if (!((Class89_Sub1) this).aBool9323)
		method15471();
	    float[] fs
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aFloatArray9514);
	    class268_1700_.method5208(0.0F,
				      (float) ((Class89_Sub1) this).anInt9363,
				      0.0F, fs);
	    float f = fs[0];
	    float f_1702_ = fs[1];
	    float f_1703_ = fs[2];
	    class268_1700_.method5208(0.0F,
				      (float) ((Class89_Sub1) this).anInt9364,
				      0.0F, fs);
	    float f_1704_ = fs[0];
	    float f_1705_ = fs[1];
	    float f_1706_ = fs[2];
	    for (int i_1707_ = 0; i_1707_ < 6; i_1707_++) {
		float[] fs_1708_ = (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloatArrayArray9527[i_1707_]);
		float f_1709_ = (fs_1708_[0] * f + fs_1708_[1] * f_1702_
				 + fs_1708_[2] * f_1703_ + fs_1708_[3]
				 + (float) ((Class89_Sub1) this).anInt9336);
		float f_1710_ = (fs_1708_[0] * f_1704_ + fs_1708_[1] * f_1705_
				 + fs_1708_[2] * f_1706_ + fs_1708_[3]
				 + (float) ((Class89_Sub1) this).anInt9336);
		if (f_1709_ < 0.0F && f_1710_ < 0.0F)
		    return;
	    }
	    if (class97 != null) {
		boolean bool = false;
		boolean bool_1711_ = true;
		int i_1712_ = ((((Class89_Sub1) this).anInt9365
				+ ((Class89_Sub1) this).anInt9366)
			       >> 1);
		int i_1713_ = ((((Class89_Sub1) this).anInt9332
				+ ((Class89_Sub1) this).anInt9359)
			       >> 1);
		int i_1714_ = i_1712_;
		int i_1715_ = ((Class89_Sub1) this).anInt9363;
		int i_1716_ = i_1713_;
		float f_1717_
		    = (class268_1701_.aFloatArray4353[0] * (float) i_1714_
		       + class268_1701_.aFloatArray4353[4] * (float) i_1715_
		       + class268_1701_.aFloatArray4353[8] * (float) i_1716_
		       + class268_1701_.aFloatArray4353[12]);
		float f_1718_
		    = (class268_1701_.aFloatArray4353[1] * (float) i_1714_
		       + class268_1701_.aFloatArray4353[5] * (float) i_1715_
		       + class268_1701_.aFloatArray4353[9] * (float) i_1716_
		       + class268_1701_.aFloatArray4353[13]);
		float f_1719_
		    = (class268_1701_.aFloatArray4353[2] * (float) i_1714_
		       + class268_1701_.aFloatArray4353[6] * (float) i_1715_
		       + class268_1701_.aFloatArray4353[10] * (float) i_1716_
		       + class268_1701_.aFloatArray4353[14]);
		float f_1720_
		    = (class268_1701_.aFloatArray4353[3] * (float) i_1714_
		       + class268_1701_.aFloatArray4353[7] * (float) i_1715_
		       + class268_1701_.aFloatArray4353[11] * (float) i_1716_
		       + class268_1701_.aFloatArray4353[15]);
		if (f_1719_ >= -f_1720_) {
		    class97.anInt1349
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9528)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9529) * f_1717_ / f_1720_);
		    class97.anInt1347
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9530)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9531) * f_1718_ / f_1720_);
		} else
		    bool = true;
		i_1714_ = i_1712_;
		i_1715_ = ((Class89_Sub1) this).anInt9364;
		i_1716_ = i_1713_;
		float f_1721_
		    = (class268_1701_.aFloatArray4353[0] * (float) i_1714_
		       + class268_1701_.aFloatArray4353[4] * (float) i_1715_
		       + class268_1701_.aFloatArray4353[8] * (float) i_1716_
		       + class268_1701_.aFloatArray4353[12]);
		float f_1722_
		    = (class268_1701_.aFloatArray4353[1] * (float) i_1714_
		       + class268_1701_.aFloatArray4353[5] * (float) i_1715_
		       + class268_1701_.aFloatArray4353[9] * (float) i_1716_
		       + class268_1701_.aFloatArray4353[13]);
		float f_1723_
		    = (class268_1701_.aFloatArray4353[2] * (float) i_1714_
		       + class268_1701_.aFloatArray4353[6] * (float) i_1715_
		       + class268_1701_.aFloatArray4353[10] * (float) i_1716_
		       + class268_1701_.aFloatArray4353[14]);
		float f_1724_
		    = (class268_1701_.aFloatArray4353[3] * (float) i_1714_
		       + class268_1701_.aFloatArray4353[7] * (float) i_1715_
		       + class268_1701_.aFloatArray4353[11] * (float) i_1716_
		       + class268_1701_.aFloatArray4353[15]);
		if (f_1723_ >= -f_1724_) {
		    class97.anInt1350
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9528)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9529) * f_1721_ / f_1724_);
		    class97.anInt1351
			= (int) ((((Class103_Sub3)
				   ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aFloat9530)
				 + (((Class103_Sub3)
				     ((Class89_Sub1) this).aClass103_Sub3_9319)
				    .aFloat9531) * f_1722_ / f_1724_);
		} else
		    bool = true;
		if (bool) {
		    if (f_1719_ < -f_1720_ && f_1723_ < -f_1724_)
			bool_1711_ = false;
		    else if (f_1719_ < -f_1720_) {
			float f_1725_
			    = (f_1719_ + f_1720_) / (f_1723_ + f_1724_) - 1.0F;
			float f_1726_
			    = f_1717_ + f_1725_ * (f_1721_ - f_1717_);
			float f_1727_
			    = f_1718_ + f_1725_ * (f_1722_ - f_1718_);
			float f_1728_
			    = f_1720_ + f_1725_ * (f_1724_ - f_1720_);
			class97.anInt1349
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_1726_ / f_1728_));
			class97.anInt1347
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9530)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9531
					* f_1727_ / f_1728_));
		    } else if (f_1723_ < -f_1724_) {
			float f_1729_
			    = (f_1723_ + f_1724_) / (f_1719_ + f_1720_) - 1.0F;
			float f_1730_
			    = f_1721_ + f_1729_ * (f_1717_ - f_1721_);
			float f_1731_
			    = f_1722_ + f_1729_ * (f_1718_ - f_1722_);
			float f_1732_
			    = f_1724_ + f_1729_ * (f_1720_ - f_1724_);
			class97.anInt1350
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_1730_ / f_1732_));
			class97.anInt1351
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9530)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9531
					* f_1731_ / f_1732_));
		    }
		}
		if (bool_1711_) {
		    if (f_1719_ / f_1720_ > f_1723_ / f_1724_) {
			float f_1733_
			    = (f_1717_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[12]);
			float f_1734_
			    = (f_1720_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     - (float) class97.anInt1349
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_1733_ / f_1734_));
		    } else {
			float f_1735_
			    = (f_1721_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[12]);
			float f_1736_
			    = (f_1724_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub1) this).anInt9336)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     - (float) class97.anInt1350
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_1735_ / f_1736_));
		    }
		    class97.aBool1352 = true;
		}
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15815(i);
	    method15479(class266);
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15815(0);
	    class268_1700_.method5203(class266);
	    class268_1700_.method5202(((Class89_Sub1) this).aClass103_Sub3_9319
				      .aClass268_9504);
	    method15495(class268_1700_);
	}
    }
    
    public void method1972(Class266 class266) {
	Class268 class268
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	class268.method5203(class266);
	if (((Class89_Sub1) this).aClass106Array9376 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub1) this).aClass106Array9376.length; i++) {
		Class106 class106
		    = ((Class89_Sub1) this).aClass106Array9376[i];
		Class106 class106_1737_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_1737_ = class106.aClass106_1488;
		class106_1737_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_1737_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_1737_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_1737_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_1737_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_1737_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_1737_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_1737_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_1737_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub1) this).aClass167Array9377 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub1) this).aClass167Array9377.length; i++) {
		Class167 class167
		    = ((Class89_Sub1) this).aClass167Array9377[i];
		Class167 class167_1738_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_1738_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_1738_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_1738_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_1738_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    public void method1970(Class266 class266) {
	Class268 class268
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	class268.method5203(class266);
	if (((Class89_Sub1) this).aClass106Array9376 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub1) this).aClass106Array9376.length; i++) {
		Class106 class106
		    = ((Class89_Sub1) this).aClass106Array9376[i];
		Class106 class106_1739_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_1739_ = class106.aClass106_1488;
		class106_1739_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_1739_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_1739_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_1739_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_1739_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_1739_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_1739_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_1739_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_1739_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub1) this).aClass167Array9377 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub1) this).aClass167Array9377.length; i++) {
		Class167 class167
		    = ((Class89_Sub1) this).aClass167Array9377[i];
		Class167 class167_1740_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_1740_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_1740_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_1740_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_1740_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    public void method2011(Class266 class266) {
	Class268 class268
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	class268.method5203(class266);
	if (((Class89_Sub1) this).aClass106Array9376 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub1) this).aClass106Array9376.length; i++) {
		Class106 class106
		    = ((Class89_Sub1) this).aClass106Array9376[i];
		Class106 class106_1741_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_1741_ = class106.aClass106_1488;
		class106_1741_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_1741_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_1741_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_1741_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_1741_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_1741_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_1741_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_1741_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_1741_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub1) this).aClass167Array9377 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub1) this).aClass167Array9377.length; i++) {
		Class167 class167
		    = ((Class89_Sub1) this).aClass167Array9377[i];
		Class167 class167_1742_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_1742_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_1742_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_1742_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_1742_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    void method15489() {
	if (((Class89_Sub1) this).aBool9357) {
	    ((Class89_Sub1) this).aBool9357 = false;
	    if (((Class89_Sub1) this).aClass106Array9376 == null
		&& ((Class89_Sub1) this).aClass167Array9377 == null
		&& ((Class89_Sub1) this).aClass315Array9333 == null
		&& !Class377.method6731(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		boolean bool = false;
		boolean bool_1743_ = false;
		boolean bool_1744_ = false;
		if (((Class89_Sub1) this).anIntArray9326 != null
		    && !Class377.method6749(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    if (((Class89_Sub1) this).aClass311_9352 == null
			|| ((Class89_Sub1) this).aClass311_9352.method5881()) {
			if (!((Class89_Sub1) this).aBool9323)
			    method15471();
			bool = true;
		    } else
			((Class89_Sub1) this).aBool9357 = true;
		}
		if (((Class89_Sub1) this).anIntArray9327 != null
		    && !Class377.method6750(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    if (((Class89_Sub1) this).aClass311_9352 == null
			|| ((Class89_Sub1) this).aClass311_9352.method5881()) {
			if (!((Class89_Sub1) this).aBool9323)
			    method15471();
			bool_1743_ = true;
		    } else
			((Class89_Sub1) this).aBool9357 = true;
		}
		if (((Class89_Sub1) this).anIntArray9360 != null
		    && !Class377.method6824(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    if (((Class89_Sub1) this).aClass311_9352 == null
			|| ((Class89_Sub1) this).aClass311_9352.method5881()) {
			if (!((Class89_Sub1) this).aBool9323)
			    method15471();
			bool_1744_ = true;
		    } else
			((Class89_Sub1) this).aBool9357 = true;
		}
		if (bool)
		    ((Class89_Sub1) this).anIntArray9326 = null;
		if (bool_1743_)
		    ((Class89_Sub1) this).anIntArray9327 = null;
		if (bool_1744_)
		    ((Class89_Sub1) this).anIntArray9360 = null;
	    }
	    if (((Class89_Sub1) this).aShortArray9328 != null
		&& ((Class89_Sub1) this).anIntArray9326 == null
		&& ((Class89_Sub1) this).anIntArray9327 == null
		&& ((Class89_Sub1) this).anIntArray9360 == null) {
		((Class89_Sub1) this).aShortArray9328 = null;
		((Class89_Sub1) this).anIntArray9374 = null;
	    }
	while_77_:
	    do {
		if (((Class89_Sub1) this).aByteArray9362 != null
		    && !Class377.method6774(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    do {
			if ((((Class89_Sub1) this).anInt9321 & 0x37) != 0) {
			    if (((Class89_Sub1) this).aClass311_9354 != null
				&& !((Class89_Sub1) this).aClass311_9354
					.method5881())
				break;
			} else if (((Class89_Sub1) this).aClass311_9353 != null
				   && !((Class89_Sub1) this).aClass311_9353
					   .method5881())
			    break;
			((Class89_Sub1) this).aShortArray9371 = null;
			((Class89_Sub1) this).aShortArray9335 = null;
			((Class89_Sub1) this).aShortArray9334 = null;
			((Class89_Sub1) this).aByteArray9362 = null;
			break while_77_;
		    } while (false);
		    ((Class89_Sub1) this).aBool9357 = true;
		}
	    } while (false);
	    if (((Class89_Sub1) this).aShortArray9361 != null
		&& !Class377.method6734(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aShortArray9361 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aByteArray9344 != null
		&& !Class377.method6746(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aByteArray9344 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aFloatArray9338 != null
		&& !Class377.method6755(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9341 == null
		    || ((Class89_Sub1) this).aClass311_9341.method5881()) {
		    ((Class89_Sub1) this).aFloatArray9339 = null;
		    ((Class89_Sub1) this).aFloatArray9338 = null;
		} else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9348 != null
		&& !Class377.method6760(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aShortArray9348 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9345 != null
		&& !Class377.method6759(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if ((((Class89_Sub1) this).aClass386_9351 == null
		     || ((Class89_Sub1) this).aClass386_9351.method6952())
		    && (((Class89_Sub1) this).aClass311_9353 == null
			|| ((Class89_Sub1) this).aClass311_9353
			       .method5881())) {
		    ((Class89_Sub1) this).aShortArray9368 = null;
		    ((Class89_Sub1) this).aShortArray9346 = null;
		    ((Class89_Sub1) this).aShortArray9345 = null;
		} else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9350 != null) {
		if (((Class89_Sub1) this).aClass311_9352 == null
		    || ((Class89_Sub1) this).aClass311_9352.method5881())
		    ((Class89_Sub1) this).aShortArray9350 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9355 != null) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aShortArray9355 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null
		&& !Class377.method6756(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		((Class89_Sub1) this).anIntArrayArray9337 = null;
		((Class89_Sub1) this).aShortArray9320 = null;
	    }
	    if (((Class89_Sub1) this).anIntArrayArray9329 != null
		&& !Class377.method6757(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		((Class89_Sub1) this).anIntArrayArray9329 = null;
		((Class89_Sub1) this).aShortArray9330 = null;
	    }
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null
		&& !Class377.method6758(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321))
		((Class89_Sub1) this).anIntArrayArray9381 = null;
	    if (((Class89_Sub1) this).anIntArray9347 != null
		&& (((Class89_Sub1) this).anInt9367 & 0x800) == 0
		&& (((Class89_Sub1) this).anInt9367 & 0x40000) == 0) {
		((Class89_Sub1) this).anIntArray9347 = null;
		((Class89_Sub1) this).anIntArray9373 = null;
		((Class89_Sub1) this).anIntArray9386 = null;
	    }
	}
    }
    
    public void method1874(Class266 class266) {
	Class268 class268
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	class268.method5203(class266);
	if (((Class89_Sub1) this).aClass106Array9376 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub1) this).aClass106Array9376.length; i++) {
		Class106 class106
		    = ((Class89_Sub1) this).aClass106Array9376[i];
		Class106 class106_1745_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_1745_ = class106.aClass106_1488;
		class106_1745_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_1745_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_1745_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_1745_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_1745_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_1745_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_1745_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_1745_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_1745_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub1) this).aClass167Array9377 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub1) this).aClass167Array9377.length; i++) {
		Class167 class167
		    = ((Class89_Sub1) this).aClass167Array9377[i];
		Class167 class167_1746_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_1746_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_1746_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_1746_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_1746_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    public Class241_Sub39_Sub17 method1898
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	if (((Class89_Sub1) this).anInt9378 == 0)
	    return null;
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i;
	int i_1747_;
	if ((((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
	     .anInt9520)
	    > 0) {
	    i = ((((Class89_Sub1) this).anInt9365
		  - ((((Class89_Sub1) this).anInt9364
		      * ((Class103_Sub3)
			 ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9520)
		     >> 8))
		 >> ((Class103_Sub3)
		     ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1747_
		= ((((Class89_Sub1) this).anInt9366
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9520)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	} else {
	    i = ((((Class89_Sub1) this).anInt9365
		  - ((((Class89_Sub1) this).anInt9363
		      * ((Class103_Sub3)
			 ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9520)
		     >> 8))
		 >> ((Class103_Sub3)
		     ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1747_
		= ((((Class89_Sub1) this).anInt9366
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9520)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	}
	int i_1748_;
	int i_1749_;
	if ((((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
	     .anInt9627)
	    > 0) {
	    i_1748_
		= ((((Class89_Sub1) this).anInt9332
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1749_
		= ((((Class89_Sub1) this).anInt9359
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	} else {
	    i_1748_
		= ((((Class89_Sub1) this).anInt9332
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1749_
		= ((((Class89_Sub1) this).anInt9359
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	}
	int i_1750_ = i_1747_ - i + 1;
	int i_1751_ = i_1749_ - i_1748_ + 1;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1_1752_;
	if (class241_sub39_sub17_sub1 != null
	    && class241_sub39_sub17_sub1.method17674(i_1750_, i_1751_)) {
	    class241_sub39_sub17_sub1_1752_ = class241_sub39_sub17_sub1;
	    class241_sub39_sub17_sub1_1752_.method17669();
	} else
	    class241_sub39_sub17_sub1_1752_
		= new Class241_Sub39_Sub17_Sub1((((Class89_Sub1) this)
						 .aClass103_Sub3_9319),
						i_1750_, i_1751_);
	class241_sub39_sub17_sub1_1752_.method17670(i, i_1748_, i_1747_,
						    i_1749_);
	method15478(class241_sub39_sub17_sub1_1752_);
	return class241_sub39_sub17_sub1_1752_;
    }
    
    public Class241_Sub39_Sub17 method2038
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	if (((Class89_Sub1) this).anInt9378 == 0)
	    return null;
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i;
	int i_1753_;
	if ((((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
	     .anInt9520)
	    > 0) {
	    i = ((((Class89_Sub1) this).anInt9365
		  - ((((Class89_Sub1) this).anInt9364
		      * ((Class103_Sub3)
			 ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9520)
		     >> 8))
		 >> ((Class103_Sub3)
		     ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1753_
		= ((((Class89_Sub1) this).anInt9366
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9520)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	} else {
	    i = ((((Class89_Sub1) this).anInt9365
		  - ((((Class89_Sub1) this).anInt9363
		      * ((Class103_Sub3)
			 ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9520)
		     >> 8))
		 >> ((Class103_Sub3)
		     ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1753_
		= ((((Class89_Sub1) this).anInt9366
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9520)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	}
	int i_1754_;
	int i_1755_;
	if ((((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
	     .anInt9627)
	    > 0) {
	    i_1754_
		= ((((Class89_Sub1) this).anInt9332
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1755_
		= ((((Class89_Sub1) this).anInt9359
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	} else {
	    i_1754_
		= ((((Class89_Sub1) this).anInt9332
		    - ((((Class89_Sub1) this).anInt9363
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	    i_1755_
		= ((((Class89_Sub1) this).anInt9359
		    - ((((Class89_Sub1) this).anInt9364
			* ((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).anInt9627)
		       >> 8))
		   >> ((Class103_Sub3)
		       ((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489);
	}
	int i_1756_ = i_1753_ - i + 1;
	int i_1757_ = i_1755_ - i_1754_ + 1;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1_1758_;
	if (class241_sub39_sub17_sub1 != null
	    && class241_sub39_sub17_sub1.method17674(i_1756_, i_1757_)) {
	    class241_sub39_sub17_sub1_1758_ = class241_sub39_sub17_sub1;
	    class241_sub39_sub17_sub1_1758_.method17669();
	} else
	    class241_sub39_sub17_sub1_1758_
		= new Class241_Sub39_Sub17_Sub1((((Class89_Sub1) this)
						 .aClass103_Sub3_9319),
						i_1756_, i_1757_);
	class241_sub39_sub17_sub1_1758_.method17670(i, i_1754_, i_1753_,
						    i_1755_);
	method15478(class241_sub39_sub17_sub1_1758_);
	return class241_sub39_sub17_sub1_1758_;
    }
    
    void method1878() {
	/* empty */
    }
    
    public Class89 method2019(byte i, int i_1759_, boolean bool) {
	boolean bool_1760_ = false;
	Class89_Sub1 class89_sub1_1761_;
	Class89_Sub1 class89_sub1_1762_;
	if (i > 0 && i <= 8) {
	    class89_sub1_1762_
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass89_Sub1Array9499[i - 1]);
	    class89_sub1_1761_
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass89_Sub1Array9650[i - 1]);
	    bool_1760_ = true;
	} else
	    class89_sub1_1761_ = class89_sub1_1762_
		= new Class89_Sub1(((Class89_Sub1) this).aClass103_Sub3_9319,
				   0, 0, true, false);
	return method15469(class89_sub1_1761_, class89_sub1_1762_, i_1759_,
			   bool_1760_, bool);
    }
    
    public boolean method1968() {
	return ((Class89_Sub1) this).aBool9358;
    }
    
    public void method1928(int i) {
	if (((Class89_Sub1) this).aClass311_9352 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4827
		= Class377.method6744(i, ((Class89_Sub1) this).anInt9321);
	if (((Class89_Sub1) this).aClass311_9341 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4827
		= Class377.method6747(i, ((Class89_Sub1) this).anInt9321);
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4827
		= Class377.method6789(i, ((Class89_Sub1) this).anInt9321);
	if (((Class89_Sub1) this).aClass311_9354 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4827
		= Class377.method6792(i, ((Class89_Sub1) this).anInt9321);
	((Class89_Sub1) this).anInt9367 = i;
	if (((Class89_Sub1) this).aClass307_9340 != null
	    && (((Class89_Sub1) this).anInt9367 & 0x10000) == 0) {
	    ((Class89_Sub1) this).aShortArray9334
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aShortArray4811);
	    ((Class89_Sub1) this).aShortArray9335
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aShortArray4813);
	    ((Class89_Sub1) this).aShortArray9371
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aShortArray4812);
	    ((Class89_Sub1) this).aByteArray9362
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aByteArray4814);
	    ((Class89_Sub1) this).aClass307_9340 = null;
	}
	((Class89_Sub1) this).aBool9357 = true;
	method15489();
    }
    
    public int method2000() {
	return ((Class89_Sub1) this).aShort9322;
    }
    
    public int method1996() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9359;
    }
    
    void method1888() {
	for (int i = 0; i < ((Class89_Sub1) this).anInt9324; i++) {
	    ((Class89_Sub1) this).anIntArray9326[i]
		= ((Class89_Sub1) this).anIntArray9326[i] + 7 >> 4;
	    ((Class89_Sub1) this).anIntArray9327[i]
		= ((Class89_Sub1) this).anIntArray9327[i] + 7 >> 4;
	    ((Class89_Sub1) this).anIntArray9360[i]
		= ((Class89_Sub1) this).anIntArray9360[i] + 7 >> 4;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public void method1946(int i, int i_1763_, int i_1764_) {
	for (int i_1765_ = 0; i_1765_ < ((Class89_Sub1) this).anInt9325;
	     i_1765_++) {
	    if (i != 128)
		((Class89_Sub1) this).anIntArray9326[i_1765_]
		    = ((Class89_Sub1) this).anIntArray9326[i_1765_] * i >> 7;
	    if (i_1763_ != 128)
		((Class89_Sub1) this).anIntArray9327[i_1765_]
		    = (((Class89_Sub1) this).anIntArray9327[i_1765_] * i_1763_
		       >> 7);
	    if (i_1764_ != 128)
		((Class89_Sub1) this).anIntArray9360[i_1765_]
		    = (((Class89_Sub1) this).anIntArray9360[i_1765_] * i_1764_
		       >> 7);
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    public int method2005() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9363;
    }
    
    boolean method15490(int i, int i_1766_, int i_1767_, int i_1768_,
			Class266 class266, boolean bool, int i_1769_) {
	Class268 class268
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3)
			     ((Class89_Sub1) this).aClass103_Sub3_9319)
			    .aClass268_9525);
	boolean bool_1770_ = false;
	float f = 3.4028235E38F;
	float f_1771_ = -3.4028235E38F;
	float f_1772_ = 3.4028235E38F;
	float f_1773_ = -3.4028235E38F;
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i_1774_ = ((((Class89_Sub1) this).anInt9366
			- ((Class89_Sub1) this).anInt9365)
		       >> 1);
	int i_1775_ = ((((Class89_Sub1) this).anInt9364
			- ((Class89_Sub1) this).anInt9363)
		       >> 1);
	int i_1776_ = ((((Class89_Sub1) this).anInt9359
			- ((Class89_Sub1) this).anInt9332)
		       >> 1);
	int i_1777_ = ((Class89_Sub1) this).anInt9365 + i_1774_;
	int i_1778_ = ((Class89_Sub1) this).anInt9363 + i_1775_;
	int i_1779_ = ((Class89_Sub1) this).anInt9332 + i_1776_;
	int i_1780_ = i_1777_ - (i_1774_ << i_1769_);
	int i_1781_ = i_1778_ - (i_1775_ << i_1769_);
	int i_1782_ = i_1779_ - (i_1776_ << i_1769_);
	int i_1783_ = i_1777_ + (i_1774_ << i_1769_);
	int i_1784_ = i_1778_ + (i_1775_ << i_1769_);
	int i_1785_ = i_1779_ + (i_1776_ << i_1769_);
	((Class89_Sub1) this).anIntArray9349[0] = i_1780_;
	((Class89_Sub1) this).anIntArray9387[0] = i_1781_;
	((Class89_Sub1) this).anIntArray9388[0] = i_1782_;
	((Class89_Sub1) this).anIntArray9349[1] = i_1783_;
	((Class89_Sub1) this).anIntArray9387[1] = i_1781_;
	((Class89_Sub1) this).anIntArray9388[1] = i_1782_;
	((Class89_Sub1) this).anIntArray9349[2] = i_1780_;
	((Class89_Sub1) this).anIntArray9387[2] = i_1784_;
	((Class89_Sub1) this).anIntArray9388[2] = i_1782_;
	((Class89_Sub1) this).anIntArray9349[3] = i_1783_;
	((Class89_Sub1) this).anIntArray9387[3] = i_1784_;
	((Class89_Sub1) this).anIntArray9388[3] = i_1782_;
	((Class89_Sub1) this).anIntArray9349[4] = i_1780_;
	((Class89_Sub1) this).anIntArray9387[4] = i_1781_;
	((Class89_Sub1) this).anIntArray9388[4] = i_1785_;
	((Class89_Sub1) this).anIntArray9349[5] = i_1783_;
	((Class89_Sub1) this).anIntArray9387[5] = i_1781_;
	((Class89_Sub1) this).anIntArray9388[5] = i_1785_;
	((Class89_Sub1) this).anIntArray9349[6] = i_1780_;
	((Class89_Sub1) this).anIntArray9387[6] = i_1784_;
	((Class89_Sub1) this).anIntArray9388[6] = i_1785_;
	((Class89_Sub1) this).anIntArray9349[7] = i_1783_;
	((Class89_Sub1) this).anIntArray9387[7] = i_1784_;
	((Class89_Sub1) this).anIntArray9388[7] = i_1785_;
	for (int i_1786_ = 0; i_1786_ < 8; i_1786_++) {
	    float f_1787_
		= (float) ((Class89_Sub1) this).anIntArray9349[i_1786_];
	    float f_1788_
		= (float) ((Class89_Sub1) this).anIntArray9387[i_1786_];
	    float f_1789_
		= (float) ((Class89_Sub1) this).anIntArray9388[i_1786_];
	    float f_1790_ = (class268.aFloatArray4353[2] * f_1787_
			     + class268.aFloatArray4353[6] * f_1788_
			     + class268.aFloatArray4353[10] * f_1789_
			     + class268.aFloatArray4353[14]);
	    float f_1791_ = (class268.aFloatArray4353[3] * f_1787_
			     + class268.aFloatArray4353[7] * f_1788_
			     + class268.aFloatArray4353[11] * f_1789_
			     + class268.aFloatArray4353[15]);
	    if (f_1790_ >= -f_1791_) {
		float f_1792_ = (class268.aFloatArray4353[0] * f_1787_
				 + class268.aFloatArray4353[4] * f_1788_
				 + class268.aFloatArray4353[8] * f_1789_
				 + class268.aFloatArray4353[12]);
		float f_1793_ = (class268.aFloatArray4353[1] * f_1787_
				 + class268.aFloatArray4353[5] * f_1788_
				 + class268.aFloatArray4353[9] * f_1789_
				 + class268.aFloatArray4353[13]);
		float f_1794_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).aFloat9528
		       + (((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).aFloat9529
			  * f_1792_ / f_1791_));
		float f_1795_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).aFloat9530
		       + (((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).aFloat9531
			  * f_1793_ / f_1791_));
		if (f_1794_ < f)
		    f = f_1794_;
		if (f_1794_ > f_1771_)
		    f_1771_ = f_1794_;
		if (f_1795_ < f_1772_)
		    f_1772_ = f_1795_;
		if (f_1795_ > f_1773_)
		    f_1773_ = f_1795_;
		bool_1770_ = true;
	    }
	}
	int i_1796_ = i + i_1767_;
	int i_1797_ = i_1766_ + i_1768_;
	if (bool_1770_ && (float) i_1796_ > f && (float) i < f_1771_
	    && (float) i_1797_ > f_1772_ && (float) i_1766_ < f_1773_) {
	    if (bool)
		return true;
	    if (((Class89_Sub1) this).anIntArray9384.length
		< ((Class89_Sub1) this).anInt9378) {
		((Class89_Sub1) this).anIntArray9384
		    = new int[((Class89_Sub1) this).anInt9378];
		((Class89_Sub1) this).anIntArray9385
		    = new int[((Class89_Sub1) this).anInt9378];
	    }
	    for (int i_1798_ = 0; i_1798_ < ((Class89_Sub1) this).anInt9325;
		 i_1798_++) {
		float f_1799_
		    = (float) ((Class89_Sub1) this).anIntArray9326[i_1798_];
		float f_1800_
		    = (float) ((Class89_Sub1) this).anIntArray9327[i_1798_];
		float f_1801_
		    = (float) ((Class89_Sub1) this).anIntArray9360[i_1798_];
		float f_1802_ = (class268.aFloatArray4353[2] * f_1799_
				 + class268.aFloatArray4353[6] * f_1800_
				 + class268.aFloatArray4353[10] * f_1801_
				 + class268.aFloatArray4353[14]);
		float f_1803_ = (class268.aFloatArray4353[3] * f_1799_
				 + class268.aFloatArray4353[7] * f_1800_
				 + class268.aFloatArray4353[11] * f_1801_
				 + class268.aFloatArray4353[15]);
		if (f_1802_ >= -f_1803_) {
		    float f_1804_ = (class268.aFloatArray4353[0] * f_1799_
				     + class268.aFloatArray4353[4] * f_1800_
				     + class268.aFloatArray4353[8] * f_1801_
				     + class268.aFloatArray4353[12]);
		    float f_1805_ = (class268.aFloatArray4353[1] * f_1799_
				     + class268.aFloatArray4353[5] * f_1800_
				     + class268.aFloatArray4353[9] * f_1801_
				     + class268.aFloatArray4353[13]);
		    int i_1806_
			= ((Class89_Sub1) this).anIntArray9374[i_1798_];
		    int i_1807_
			= ((Class89_Sub1) this).anIntArray9374[i_1798_ + 1];
		    for (int i_1808_ = i_1806_;
			 (i_1808_ < i_1807_
			  && (((Class89_Sub1) this).aShortArray9328[i_1808_]
			      != 0));
			 i_1808_++) {
			int i_1809_
			    = ((((Class89_Sub1) this).aShortArray9328[i_1808_]
				& 0xffff)
			       - 1);
			((Class89_Sub1) this).anIntArray9384[i_1809_]
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_1804_ / f_1803_));
			((Class89_Sub1) this).anIntArray9385[i_1809_]
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9530)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9531
					* f_1805_ / f_1803_));
		    }
		} else {
		    int i_1810_
			= ((Class89_Sub1) this).anIntArray9374[i_1798_];
		    int i_1811_
			= ((Class89_Sub1) this).anIntArray9374[i_1798_ + 1];
		    for (int i_1812_ = i_1810_;
			 (i_1812_ < i_1811_
			  && (((Class89_Sub1) this).aShortArray9328[i_1812_]
			      != 0));
			 i_1812_++) {
			int i_1813_
			    = ((((Class89_Sub1) this).aShortArray9328[i_1812_]
				& 0xffff)
			       - 1);
			((Class89_Sub1) this).anIntArray9384[i_1813_]
			    = -999999;
		    }
		}
	    }
	    for (int i_1814_ = 0; i_1814_ < ((Class89_Sub1) this).anInt9331;
		 i_1814_++) {
		if ((((Class89_Sub1) this).anIntArray9384
		     [(((Class89_Sub1) this).aShortArray9345[i_1814_]
		       & 0xffff)]) != -999999
		    && (((Class89_Sub1) this).anIntArray9384
			[(((Class89_Sub1) this).aShortArray9346[i_1814_]
			  & 0xffff)]) != -999999
		    && (((Class89_Sub1) this).anIntArray9384
			[(((Class89_Sub1) this).aShortArray9368[i_1814_]
			  & 0xffff)]) != -999999
		    && method15477(i, i_1766_, i_1796_, i_1797_,
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9345
				      [i_1814_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9346
				      [i_1814_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9368
				      [i_1814_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9345
				      [i_1814_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9346
				      [i_1814_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9368
				      [i_1814_]) & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    public int method1992() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9359;
    }
    
    public int method1987() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9332;
    }
    
    public int method1988() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9332;
    }
    
    public int method1989() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9332;
    }
    
    public int method1880() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9359;
    }
    
    short method15491(Class161 class161, int i, int i_1815_, long l,
		      int i_1816_, int i_1817_, int i_1818_, int i_1819_,
		      float f, float f_1820_) {
	int i_1821_ = ((Class89_Sub1) this).anIntArray9374[i];
	int i_1822_ = ((Class89_Sub1) this).anIntArray9374[i + 1];
	int i_1823_ = 0;
	for (int i_1824_ = i_1821_; i_1824_ < i_1822_; i_1824_++) {
	    if (((Class89_Sub1) this).aShortArray9328[i_1824_] == 0) {
		i_1823_ = i_1824_;
		break;
	    }
	    int i_1825_
		= ((((Class89_Sub1) this).aShortArray9328[i_1824_] & 0xffff)
		   - 1);
	    if (((Class89_Sub1) this).aLongArray9372[i_1824_] == l)
		return (short) i_1825_;
	}
	((Class89_Sub1) this).aShortArray9328[i_1823_]
	    = (short) (((Class89_Sub1) this).anInt9378 + 1);
	((Class89_Sub1) this).aLongArray9372[i_1823_] = l;
	((Class89_Sub1) this).aShortArray9355[((Class89_Sub1) this).anInt9378]
	    = (short) i_1815_;
	((Class89_Sub1) this).aShortArray9350[((Class89_Sub1) this).anInt9378]
	    = (short) i;
	((Class89_Sub1) this).aShortArray9334[((Class89_Sub1) this).anInt9378]
	    = (short) i_1816_;
	((Class89_Sub1) this).aShortArray9335[((Class89_Sub1) this).anInt9378]
	    = (short) i_1817_;
	((Class89_Sub1) this).aShortArray9371[((Class89_Sub1) this).anInt9378]
	    = (short) i_1818_;
	((Class89_Sub1) this).aByteArray9362[((Class89_Sub1) this).anInt9378]
	    = (byte) i_1819_;
	((Class89_Sub1) this).aFloatArray9338[((Class89_Sub1) this).anInt9378]
	    = f;
	((Class89_Sub1) this).aFloatArray9339[((Class89_Sub1) this).anInt9378]
	    = f_1820_;
	return (short) ((Class89_Sub1) this).anInt9378++;
    }
    
    void method1955(int i, int[] is, int i_1826_, int i_1827_, int i_1828_,
		    boolean bool, int i_1829_, int[] is_1830_) {
	int i_1831_ = is.length;
	if (i == 0) {
	    i_1826_ <<= 4;
	    i_1827_ <<= 4;
	    i_1828_ <<= 4;
	    int i_1832_ = 0;
	    ((Class89_Sub1) this).anInt9389 = 0;
	    ((Class89_Sub1) this).anInt9390 = 0;
	    ((Class89_Sub1) this).anInt9391 = 0;
	    for (int i_1833_ = 0; i_1833_ < i_1831_; i_1833_++) {
		int i_1834_ = is[i_1833_];
		if (i_1834_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1835_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1834_];
		    for (int i_1836_ = 0; i_1836_ < is_1835_.length;
			 i_1836_++) {
			int i_1837_ = is_1835_[i_1836_];
			if (((Class89_Sub1) this).aShortArray9330 == null
			    || (i_1829_ & (((Class89_Sub1) this)
					   .aShortArray9330[i_1837_])) != 0) {
			    ((Class89_Sub1) this).anInt9389
				+= (((Class89_Sub1) this).anIntArray9326
				    [i_1837_]);
			    ((Class89_Sub1) this).anInt9390
				+= (((Class89_Sub1) this).anIntArray9327
				    [i_1837_]);
			    ((Class89_Sub1) this).anInt9391
				+= (((Class89_Sub1) this).anIntArray9360
				    [i_1837_]);
			    i_1832_++;
			}
		    }
		}
	    }
	    if (i_1832_ > 0) {
		((Class89_Sub1) this).anInt9389
		    = ((Class89_Sub1) this).anInt9389 / i_1832_ + i_1826_;
		((Class89_Sub1) this).anInt9390
		    = ((Class89_Sub1) this).anInt9390 / i_1832_ + i_1827_;
		((Class89_Sub1) this).anInt9391
		    = ((Class89_Sub1) this).anInt9391 / i_1832_ + i_1828_;
		((Class89_Sub1) this).aBool9392 = true;
	    } else {
		((Class89_Sub1) this).anInt9389 = i_1826_;
		((Class89_Sub1) this).anInt9390 = i_1827_;
		((Class89_Sub1) this).anInt9391 = i_1828_;
	    }
	} else if (i == 1) {
	    if (is_1830_ != null) {
		int i_1838_ = ((is_1830_[0] * i_1826_ + is_1830_[1] * i_1827_
				+ is_1830_[2] * i_1828_ + 8192)
			       >> 14);
		int i_1839_ = ((is_1830_[3] * i_1826_ + is_1830_[4] * i_1827_
				+ is_1830_[5] * i_1828_ + 8192)
			       >> 14);
		int i_1840_ = ((is_1830_[6] * i_1826_ + is_1830_[7] * i_1827_
				+ is_1830_[8] * i_1828_ + 8192)
			       >> 14);
		i_1826_ = i_1838_;
		i_1827_ = i_1839_;
		i_1828_ = i_1840_;
	    }
	    i_1826_ <<= 4;
	    i_1827_ <<= 4;
	    i_1828_ <<= 4;
	    for (int i_1841_ = 0; i_1841_ < i_1831_; i_1841_++) {
		int i_1842_ = is[i_1841_];
		if (i_1842_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_1843_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_1842_];
		    for (int i_1844_ = 0; i_1844_ < is_1843_.length;
			 i_1844_++) {
			int i_1845_ = is_1843_[i_1844_];
			if (((Class89_Sub1) this).aShortArray9330 == null
			    || (i_1829_ & (((Class89_Sub1) this)
					   .aShortArray9330[i_1845_])) != 0) {
			    ((Class89_Sub1) this).anIntArray9326[i_1845_]
				+= i_1826_;
			    ((Class89_Sub1) this).anIntArray9327[i_1845_]
				+= i_1827_;
			    ((Class89_Sub1) this).anIntArray9360[i_1845_]
				+= i_1828_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1830_ != null) {
		int i_1846_ = is_1830_[9] << 4;
		int i_1847_ = is_1830_[10] << 4;
		int i_1848_ = is_1830_[11] << 4;
		int i_1849_ = is_1830_[12] << 4;
		int i_1850_ = is_1830_[13] << 4;
		int i_1851_ = is_1830_[14] << 4;
		if (((Class89_Sub1) this).aBool9392) {
		    int i_1852_
			= ((is_1830_[0] * ((Class89_Sub1) this).anInt9389
			    + is_1830_[3] * ((Class89_Sub1) this).anInt9390
			    + is_1830_[6] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1853_
			= ((is_1830_[1] * ((Class89_Sub1) this).anInt9389
			    + is_1830_[4] * ((Class89_Sub1) this).anInt9390
			    + is_1830_[7] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1854_
			= ((is_1830_[2] * ((Class89_Sub1) this).anInt9389
			    + is_1830_[5] * ((Class89_Sub1) this).anInt9390
			    + is_1830_[8] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    i_1852_ += i_1849_;
		    i_1853_ += i_1850_;
		    i_1854_ += i_1851_;
		    ((Class89_Sub1) this).anInt9389 = i_1852_;
		    ((Class89_Sub1) this).anInt9390 = i_1853_;
		    ((Class89_Sub1) this).anInt9391 = i_1854_;
		    ((Class89_Sub1) this).aBool9392 = false;
		}
		int[] is_1855_ = new int[9];
		int i_1856_ = Class282.anIntArray4441[i_1826_];
		int i_1857_ = Class282.anIntArray4430[i_1826_];
		int i_1858_ = Class282.anIntArray4441[i_1827_];
		int i_1859_ = Class282.anIntArray4430[i_1827_];
		int i_1860_ = Class282.anIntArray4441[i_1828_];
		int i_1861_ = Class282.anIntArray4430[i_1828_];
		int i_1862_ = i_1857_ * i_1860_ + 8192 >> 14;
		int i_1863_ = i_1857_ * i_1861_ + 8192 >> 14;
		is_1855_[0]
		    = i_1858_ * i_1860_ + i_1859_ * i_1863_ + 8192 >> 14;
		is_1855_[1]
		    = -i_1858_ * i_1861_ + i_1859_ * i_1862_ + 8192 >> 14;
		is_1855_[2] = i_1859_ * i_1856_ + 8192 >> 14;
		is_1855_[3] = i_1856_ * i_1861_ + 8192 >> 14;
		is_1855_[4] = i_1856_ * i_1860_ + 8192 >> 14;
		is_1855_[5] = -i_1857_;
		is_1855_[6]
		    = -i_1859_ * i_1860_ + i_1858_ * i_1863_ + 8192 >> 14;
		is_1855_[7]
		    = i_1859_ * i_1861_ + i_1858_ * i_1862_ + 8192 >> 14;
		is_1855_[8] = i_1858_ * i_1856_ + 8192 >> 14;
		int i_1864_ = (is_1855_[0] * -((Class89_Sub1) this).anInt9389
			       + is_1855_[1] * -((Class89_Sub1) this).anInt9390
			       + is_1855_[2] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_1865_ = (is_1855_[3] * -((Class89_Sub1) this).anInt9389
			       + is_1855_[4] * -((Class89_Sub1) this).anInt9390
			       + is_1855_[5] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_1866_ = (is_1855_[6] * -((Class89_Sub1) this).anInt9389
			       + is_1855_[7] * -((Class89_Sub1) this).anInt9390
			       + is_1855_[8] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_1867_ = i_1864_ + ((Class89_Sub1) this).anInt9389;
		int i_1868_ = i_1865_ + ((Class89_Sub1) this).anInt9390;
		int i_1869_ = i_1866_ + ((Class89_Sub1) this).anInt9391;
		int[] is_1870_ = new int[9];
		for (int i_1871_ = 0; i_1871_ < 3; i_1871_++) {
		    for (int i_1872_ = 0; i_1872_ < 3; i_1872_++) {
			int i_1873_ = 0;
			for (int i_1874_ = 0; i_1874_ < 3; i_1874_++)
			    i_1873_ += (is_1855_[i_1871_ * 3 + i_1874_]
					* is_1830_[i_1872_ * 3 + i_1874_]);
			is_1870_[i_1871_ * 3 + i_1872_] = i_1873_ + 8192 >> 14;
		    }
		}
		int i_1875_ = ((is_1855_[0] * i_1849_ + is_1855_[1] * i_1850_
				+ is_1855_[2] * i_1851_ + 8192)
			       >> 14);
		int i_1876_ = ((is_1855_[3] * i_1849_ + is_1855_[4] * i_1850_
				+ is_1855_[5] * i_1851_ + 8192)
			       >> 14);
		int i_1877_ = ((is_1855_[6] * i_1849_ + is_1855_[7] * i_1850_
				+ is_1855_[8] * i_1851_ + 8192)
			       >> 14);
		i_1875_ += i_1867_;
		i_1876_ += i_1868_;
		i_1877_ += i_1869_;
		int[] is_1878_ = new int[9];
		for (int i_1879_ = 0; i_1879_ < 3; i_1879_++) {
		    for (int i_1880_ = 0; i_1880_ < 3; i_1880_++) {
			int i_1881_ = 0;
			for (int i_1882_ = 0; i_1882_ < 3; i_1882_++)
			    i_1881_ += (is_1830_[i_1879_ * 3 + i_1882_]
					* is_1870_[i_1880_ + i_1882_ * 3]);
			is_1878_[i_1879_ * 3 + i_1880_] = i_1881_ + 8192 >> 14;
		    }
		}
		int i_1883_ = ((is_1830_[0] * i_1875_ + is_1830_[1] * i_1876_
				+ is_1830_[2] * i_1877_ + 8192)
			       >> 14);
		int i_1884_ = ((is_1830_[3] * i_1875_ + is_1830_[4] * i_1876_
				+ is_1830_[5] * i_1877_ + 8192)
			       >> 14);
		int i_1885_ = ((is_1830_[6] * i_1875_ + is_1830_[7] * i_1876_
				+ is_1830_[8] * i_1877_ + 8192)
			       >> 14);
		i_1883_ += i_1846_;
		i_1884_ += i_1847_;
		i_1885_ += i_1848_;
		for (int i_1886_ = 0; i_1886_ < i_1831_; i_1886_++) {
		    int i_1887_ = is[i_1886_];
		    if (i_1887_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1888_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1887_]);
			for (int i_1889_ = 0; i_1889_ < is_1888_.length;
			     i_1889_++) {
			    int i_1890_ = is_1888_[i_1889_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1829_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1890_]))
				    != 0)) {
				int i_1891_
				    = (is_1878_[0] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1890_])
				       + is_1878_[1] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1890_])
				       + is_1878_[2] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1890_])
				       + 8192) >> 14;
				int i_1892_
				    = (is_1878_[3] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1890_])
				       + is_1878_[4] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1890_])
				       + is_1878_[5] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1890_])
				       + 8192) >> 14;
				int i_1893_
				    = (is_1878_[6] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1890_])
				       + is_1878_[7] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1890_])
				       + is_1878_[8] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1890_])
				       + 8192) >> 14;
				i_1891_ += i_1883_;
				i_1892_ += i_1884_;
				i_1893_ += i_1885_;
				((Class89_Sub1) this).anIntArray9326[i_1890_]
				    = i_1891_;
				((Class89_Sub1) this).anIntArray9327[i_1890_]
				    = i_1892_;
				((Class89_Sub1) this).anIntArray9360[i_1890_]
				    = i_1893_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1894_ = 0; i_1894_ < i_1831_; i_1894_++) {
		    int i_1895_ = is[i_1894_];
		    if (i_1895_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1896_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1895_]);
			for (int i_1897_ = 0; i_1897_ < is_1896_.length;
			     i_1897_++) {
			    int i_1898_ = is_1896_[i_1897_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1829_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1898_]))
				    != 0)) {
				((Class89_Sub1) this).anIntArray9326[i_1898_]
				    -= ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1898_]
				    -= ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1898_]
				    -= ((Class89_Sub1) this).anInt9391;
				if (i_1828_ != 0) {
				    int i_1899_
					= Class282.anIntArray4430[i_1828_];
				    int i_1900_
					= Class282.anIntArray4441[i_1828_];
				    int i_1901_
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1898_]) * i_1899_
					   + ((((Class89_Sub1) this)
					       .anIntArray9326[i_1898_])
					      * i_1900_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9327
					[i_1898_]
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1898_]) * i_1900_
					   - ((((Class89_Sub1) this)
					       .anIntArray9326[i_1898_])
					      * i_1899_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9326
					[i_1898_]
					= i_1901_;
				}
				if (i_1826_ != 0) {
				    int i_1902_
					= Class282.anIntArray4430[i_1826_];
				    int i_1903_
					= Class282.anIntArray4441[i_1826_];
				    int i_1904_
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1898_]) * i_1903_
					   - ((((Class89_Sub1) this)
					       .anIntArray9360[i_1898_])
					      * i_1902_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9360
					[i_1898_]
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_1898_]) * i_1902_
					   + ((((Class89_Sub1) this)
					       .anIntArray9360[i_1898_])
					      * i_1903_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9327
					[i_1898_]
					= i_1904_;
				}
				if (i_1827_ != 0) {
				    int i_1905_
					= Class282.anIntArray4430[i_1827_];
				    int i_1906_
					= Class282.anIntArray4441[i_1827_];
				    int i_1907_
					= ((((Class89_Sub1) this)
					    .anIntArray9360[i_1898_]) * i_1905_
					   + ((((Class89_Sub1) this)
					       .anIntArray9326[i_1898_])
					      * i_1906_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9360
					[i_1898_]
					= ((((Class89_Sub1) this)
					    .anIntArray9360[i_1898_]) * i_1906_
					   - ((((Class89_Sub1) this)
					       .anIntArray9326[i_1898_])
					      * i_1905_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9326
					[i_1898_]
					= i_1907_;
				}
				((Class89_Sub1) this).anIntArray9326[i_1898_]
				    += ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1898_]
				    += ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1898_]
				    += ((Class89_Sub1) this).anInt9391;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1908_ = 0; i_1908_ < i_1831_; i_1908_++) {
			int i_1909_ = is[i_1908_];
			if (i_1909_ < (((Class89_Sub1) this)
				       .anIntArrayArray9329).length) {
			    int[] is_1910_ = (((Class89_Sub1) this)
					      .anIntArrayArray9329[i_1909_]);
			    for (int i_1911_ = 0; i_1911_ < is_1910_.length;
				 i_1911_++) {
				int i_1912_ = is_1910_[i_1911_];
				if ((((Class89_Sub1) this).aShortArray9330
				     == null)
				    || ((i_1829_ & (((Class89_Sub1) this)
						    .aShortArray9330[i_1912_]))
					!= 0)) {
				    int i_1913_ = (((Class89_Sub1) this)
						   .anIntArray9374[i_1912_]);
				    int i_1914_
					= (((Class89_Sub1) this).anIntArray9374
					   [i_1912_ + 1]);
				    for (int i_1915_ = i_1913_;
					 (i_1915_ < i_1914_
					  && (((Class89_Sub1) this)
					      .aShortArray9328[i_1915_]) != 0);
					 i_1915_++) {
					int i_1916_
					    = (((((Class89_Sub1) this)
						 .aShortArray9328[i_1915_])
						& 0xffff)
					       - 1);
					if (i_1828_ != 0) {
					    int i_1917_
						= (Class282.anIntArray4430
						   [i_1828_]);
					    int i_1918_
						= (Class282.anIntArray4441
						   [i_1828_]);
					    int i_1919_
						= (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1916_]) * i_1917_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1916_]) * i_1918_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9335[i_1916_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9335
							      [i_1916_])
							     * i_1918_)
							    - ((((Class89_Sub1)
								 this)
								.aShortArray9334
								[i_1916_])
							       * i_1917_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9334[i_1916_]
						= (short) i_1919_;
					}
					if (i_1826_ != 0) {
					    int i_1920_
						= (Class282.anIntArray4430
						   [i_1826_]);
					    int i_1921_
						= (Class282.anIntArray4441
						   [i_1826_]);
					    int i_1922_
						= (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_1916_]) * i_1921_
						    - (((Class89_Sub1) this)
						       .aShortArray9371
						       [i_1916_]) * i_1920_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9371[i_1916_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9335
							      [i_1916_])
							     * i_1920_)
							    + ((((Class89_Sub1)
								 this)
								.aShortArray9371
								[i_1916_])
							       * i_1921_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9335[i_1916_]
						= (short) i_1922_;
					}
					if (i_1827_ != 0) {
					    int i_1923_
						= (Class282.anIntArray4430
						   [i_1827_]);
					    int i_1924_
						= (Class282.anIntArray4441
						   [i_1827_]);
					    int i_1925_
						= (((((Class89_Sub1) this)
						     .aShortArray9371
						     [i_1916_]) * i_1923_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_1916_]) * i_1924_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9371[i_1916_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9371
							      [i_1916_])
							     * i_1924_)
							    - ((((Class89_Sub1)
								 this)
								.aShortArray9334
								[i_1916_])
							       * i_1923_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9334[i_1916_]
						= (short) i_1925_;
					}
				    }
				}
			    }
			}
		    }
		    method15493();
		}
	    }
	} else if (i == 3) {
	    if (is_1830_ != null) {
		int i_1926_ = is_1830_[9] << 4;
		int i_1927_ = is_1830_[10] << 4;
		int i_1928_ = is_1830_[11] << 4;
		int i_1929_ = is_1830_[12] << 4;
		int i_1930_ = is_1830_[13] << 4;
		int i_1931_ = is_1830_[14] << 4;
		if (((Class89_Sub1) this).aBool9392) {
		    int i_1932_
			= ((is_1830_[0] * ((Class89_Sub1) this).anInt9389
			    + is_1830_[3] * ((Class89_Sub1) this).anInt9390
			    + is_1830_[6] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1933_
			= ((is_1830_[1] * ((Class89_Sub1) this).anInt9389
			    + is_1830_[4] * ((Class89_Sub1) this).anInt9390
			    + is_1830_[7] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_1934_
			= ((is_1830_[2] * ((Class89_Sub1) this).anInt9389
			    + is_1830_[5] * ((Class89_Sub1) this).anInt9390
			    + is_1830_[8] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    i_1932_ += i_1929_;
		    i_1933_ += i_1930_;
		    i_1934_ += i_1931_;
		    ((Class89_Sub1) this).anInt9389 = i_1932_;
		    ((Class89_Sub1) this).anInt9390 = i_1933_;
		    ((Class89_Sub1) this).anInt9391 = i_1934_;
		    ((Class89_Sub1) this).aBool9392 = false;
		}
		int i_1935_ = i_1826_ << 15 >> 7;
		int i_1936_ = i_1827_ << 15 >> 7;
		int i_1937_ = i_1828_ << 15 >> 7;
		int i_1938_
		    = i_1935_ * -((Class89_Sub1) this).anInt9389 + 8192 >> 14;
		int i_1939_
		    = i_1936_ * -((Class89_Sub1) this).anInt9390 + 8192 >> 14;
		int i_1940_
		    = i_1937_ * -((Class89_Sub1) this).anInt9391 + 8192 >> 14;
		int i_1941_ = i_1938_ + ((Class89_Sub1) this).anInt9389;
		int i_1942_ = i_1939_ + ((Class89_Sub1) this).anInt9390;
		int i_1943_ = i_1940_ + ((Class89_Sub1) this).anInt9391;
		int[] is_1944_ = new int[9];
		is_1944_[0] = i_1935_ * is_1830_[0] + 8192 >> 14;
		is_1944_[1] = i_1935_ * is_1830_[3] + 8192 >> 14;
		is_1944_[2] = i_1935_ * is_1830_[6] + 8192 >> 14;
		is_1944_[3] = i_1936_ * is_1830_[1] + 8192 >> 14;
		is_1944_[4] = i_1936_ * is_1830_[4] + 8192 >> 14;
		is_1944_[5] = i_1936_ * is_1830_[7] + 8192 >> 14;
		is_1944_[6] = i_1937_ * is_1830_[2] + 8192 >> 14;
		is_1944_[7] = i_1937_ * is_1830_[5] + 8192 >> 14;
		is_1944_[8] = i_1937_ * is_1830_[8] + 8192 >> 14;
		int i_1945_ = i_1935_ * i_1929_ + 8192 >> 14;
		int i_1946_ = i_1936_ * i_1930_ + 8192 >> 14;
		int i_1947_ = i_1937_ * i_1931_ + 8192 >> 14;
		i_1945_ += i_1941_;
		i_1946_ += i_1942_;
		i_1947_ += i_1943_;
		int[] is_1948_ = new int[9];
		for (int i_1949_ = 0; i_1949_ < 3; i_1949_++) {
		    for (int i_1950_ = 0; i_1950_ < 3; i_1950_++) {
			int i_1951_ = 0;
			for (int i_1952_ = 0; i_1952_ < 3; i_1952_++)
			    i_1951_ += (is_1830_[i_1949_ * 3 + i_1952_]
					* is_1944_[i_1950_ + i_1952_ * 3]);
			is_1948_[i_1949_ * 3 + i_1950_] = i_1951_ + 8192 >> 14;
		    }
		}
		int i_1953_ = ((is_1830_[0] * i_1945_ + is_1830_[1] * i_1946_
				+ is_1830_[2] * i_1947_ + 8192)
			       >> 14);
		int i_1954_ = ((is_1830_[3] * i_1945_ + is_1830_[4] * i_1946_
				+ is_1830_[5] * i_1947_ + 8192)
			       >> 14);
		int i_1955_ = ((is_1830_[6] * i_1945_ + is_1830_[7] * i_1946_
				+ is_1830_[8] * i_1947_ + 8192)
			       >> 14);
		i_1953_ += i_1926_;
		i_1954_ += i_1927_;
		i_1955_ += i_1928_;
		for (int i_1956_ = 0; i_1956_ < i_1831_; i_1956_++) {
		    int i_1957_ = is[i_1956_];
		    if (i_1957_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1958_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1957_]);
			for (int i_1959_ = 0; i_1959_ < is_1958_.length;
			     i_1959_++) {
			    int i_1960_ = is_1958_[i_1959_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1829_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1960_]))
				    != 0)) {
				int i_1961_
				    = (is_1948_[0] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1960_])
				       + is_1948_[1] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1960_])
				       + is_1948_[2] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1960_])
				       + 8192) >> 14;
				int i_1962_
				    = (is_1948_[3] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1960_])
				       + is_1948_[4] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1960_])
				       + is_1948_[5] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1960_])
				       + 8192) >> 14;
				int i_1963_
				    = (is_1948_[6] * (((Class89_Sub1) this)
						      .anIntArray9326[i_1960_])
				       + is_1948_[7] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_1960_])
				       + is_1948_[8] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_1960_])
				       + 8192) >> 14;
				i_1961_ += i_1953_;
				i_1962_ += i_1954_;
				i_1963_ += i_1955_;
				((Class89_Sub1) this).anIntArray9326[i_1960_]
				    = i_1961_;
				((Class89_Sub1) this).anIntArray9327[i_1960_]
				    = i_1962_;
				((Class89_Sub1) this).anIntArray9360[i_1960_]
				    = i_1963_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1964_ = 0; i_1964_ < i_1831_; i_1964_++) {
		    int i_1965_ = is[i_1964_];
		    if (i_1965_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_1966_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_1965_]);
			for (int i_1967_ = 0; i_1967_ < is_1966_.length;
			     i_1967_++) {
			    int i_1968_ = is_1966_[i_1967_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_1829_ & (((Class89_Sub1) this)
						.aShortArray9330[i_1968_]))
				    != 0)) {
				((Class89_Sub1) this).anIntArray9326[i_1968_]
				    -= ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1968_]
				    -= ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1968_]
				    -= ((Class89_Sub1) this).anInt9391;
				((Class89_Sub1) this).anIntArray9326[i_1968_]
				    = (((Class89_Sub1) this).anIntArray9326
				       [i_1968_]) * i_1826_ >> 7;
				((Class89_Sub1) this).anIntArray9327[i_1968_]
				    = (((Class89_Sub1) this).anIntArray9327
				       [i_1968_]) * i_1827_ >> 7;
				((Class89_Sub1) this).anIntArray9360[i_1968_]
				    = (((Class89_Sub1) this).anIntArray9360
				       [i_1968_]) * i_1828_ >> 7;
				((Class89_Sub1) this).anIntArray9326[i_1968_]
				    += ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_1968_]
				    += ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_1968_]
				    += ((Class89_Sub1) this).anInt9391;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_1969_ = false;
		for (int i_1970_ = 0; i_1970_ < i_1831_; i_1970_++) {
		    int i_1971_ = is[i_1970_];
		    if (i_1971_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_1972_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_1971_]);
			for (int i_1973_ = 0; i_1973_ < is_1972_.length;
			     i_1973_++) {
			    int i_1974_ = is_1972_[i_1973_];
			    if (((Class89_Sub1) this).aShortArray9320 == null
				|| ((i_1829_ & (((Class89_Sub1) this)
						.aShortArray9320[i_1974_]))
				    != 0)) {
				int i_1975_ = (((((Class89_Sub1) this)
						 .aByteArray9344[i_1974_])
						& 0xff)
					       + i_1826_ * 8);
				if (i_1975_ < 0)
				    i_1975_ = 0;
				else if (i_1975_ > 255)
				    i_1975_ = 255;
				((Class89_Sub1) this).aByteArray9344[i_1974_]
				    = (byte) i_1975_;
			    }
			}
			bool_1969_ = bool_1969_ | is_1972_.length > 0;
		    }
		}
		if (bool_1969_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_1976_ = 0;
			     i_1976_ < ((Class89_Sub1) this).anInt9375;
			     i_1976_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_1976_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_1976_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & 0xffffff
				   | 255 - ((((Class89_Sub1) this)
					     .aByteArray9344
					     [((Class315) class315).anInt4841])
					    & 0xff) << 24);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_1977_ = false;
		for (int i_1978_ = 0; i_1978_ < i_1831_; i_1978_++) {
		    int i_1979_ = is[i_1978_];
		    if (i_1979_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_1980_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_1979_]);
			for (int i_1981_ = 0; i_1981_ < is_1980_.length;
			     i_1981_++) {
			    int i_1982_ = is_1980_[i_1981_];
			    if (((Class89_Sub1) this).aShortArray9320 == null
				|| ((i_1829_ & (((Class89_Sub1) this)
						.aShortArray9320[i_1982_]))
				    != 0)) {
				int i_1983_ = ((((Class89_Sub1) this)
						.aShortArray9361[i_1982_])
					       & 0xffff);
				int i_1984_ = i_1983_ >> 10 & 0x3f;
				int i_1985_ = i_1983_ >> 7 & 0x7;
				int i_1986_ = i_1983_ & 0x7f;
				i_1984_ = i_1984_ + i_1826_ & 0x3f;
				i_1985_ += i_1827_ / 4;
				if (i_1985_ < 0)
				    i_1985_ = 0;
				else if (i_1985_ > 7)
				    i_1985_ = 7;
				i_1986_ += i_1828_;
				if (i_1986_ < 0)
				    i_1986_ = 0;
				else if (i_1986_ > 127)
				    i_1986_ = 127;
				((Class89_Sub1) this).aShortArray9361[i_1982_]
				    = (short) (i_1984_ << 10 | i_1985_ << 7
					       | i_1986_);
			    }
			}
			bool_1977_ = bool_1977_ | is_1980_.length > 0;
		    }
		}
		if (bool_1977_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_1987_ = 0;
			     i_1987_ < ((Class89_Sub1) this).anInt9375;
			     i_1987_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_1987_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_1987_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & ~0xffffff
				   | (Class474.anIntArray6383
				      [((((Class89_Sub1) this).aShortArray9361
					 [((Class315) class315).anInt4841])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1988_ = 0; i_1988_ < i_1831_; i_1988_++) {
		    int i_1989_ = is[i_1988_];
		    if (i_1989_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1990_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1989_]);
			for (int i_1991_ = 0; i_1991_ < is_1990_.length;
			     i_1991_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1990_[i_1991_]]);
			    ((Class381) class381).anInt5664 += i_1826_;
			    ((Class381) class381).anInt5665 += i_1827_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1992_ = 0; i_1992_ < i_1831_; i_1992_++) {
		    int i_1993_ = is[i_1992_];
		    if (i_1993_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1994_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1993_]);
			for (int i_1995_ = 0; i_1995_ < is_1994_.length;
			     i_1995_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1994_[i_1995_]]);
			    ((Class381) class381).anInt5662
				= (((Class381) class381).anInt5662 * i_1826_
				   >> 7);
			    ((Class381) class381).anInt5663
				= (((Class381) class381).anInt5663 * i_1827_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_1996_ = 0; i_1996_ < i_1831_; i_1996_++) {
		    int i_1997_ = is[i_1996_];
		    if (i_1997_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_1998_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_1997_]);
			for (int i_1999_ = 0; i_1999_ < is_1998_.length;
			     i_1999_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_1998_[i_1999_]]);
			    ((Class381) class381).anInt5666
				= (((Class381) class381).anInt5666 + i_1826_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method15492(Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1) {
	if (((Class89_Sub1) this).anIntArray9384.length
	    < ((Class89_Sub1) this).anInt9378) {
	    ((Class89_Sub1) this).anIntArray9384
		= new int[((Class89_Sub1) this).anInt9378];
	    ((Class89_Sub1) this).anIntArray9385
		= new int[((Class89_Sub1) this).anInt9378];
	}
	for (int i = 0; i < ((Class89_Sub1) this).anInt9325; i++) {
	    int i_2000_
		= (((((Class89_Sub1) this).anIntArray9326[i]
		     - ((((Class89_Sub1) this).anIntArray9327[i]
			 * ((Class103_Sub3) (((Class89_Sub1) this)
					     .aClass103_Sub3_9319)).anInt9520)
			>> 8))
		    >> ((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489)
		   - (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11291));
	    int i_2001_
		= (((((Class89_Sub1) this).anIntArray9360[i]
		     - ((((Class89_Sub1) this).anIntArray9327[i]
			 * ((Class103_Sub3) (((Class89_Sub1) this)
					     .aClass103_Sub3_9319)).anInt9627)
			>> 8))
		    >> ((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489)
		   - (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11290));
	    int i_2002_ = ((Class89_Sub1) this).anIntArray9374[i];
	    int i_2003_ = ((Class89_Sub1) this).anIntArray9374[i + 1];
	    for (int i_2004_ = i_2002_;
		 (i_2004_ < i_2003_
		  && ((Class89_Sub1) this).aShortArray9328[i_2004_] != 0);
		 i_2004_++) {
		int i_2005_ = ((((Class89_Sub1) this).aShortArray9328[i_2004_]
				& 0xffff)
			       - 1);
		((Class89_Sub1) this).anIntArray9384[i_2005_] = i_2000_;
		((Class89_Sub1) this).anIntArray9385[i_2005_] = i_2001_;
	    }
	}
	for (int i = 0; i < ((Class89_Sub1) this).anInt9342; i++) {
	    if (((Class89_Sub1) this).aByteArray9344 == null
		|| ((Class89_Sub1) this).aByteArray9344[i] <= 128) {
		int i_2006_
		    = ((Class89_Sub1) this).aShortArray9345[i] & 0xffff;
		int i_2007_
		    = ((Class89_Sub1) this).aShortArray9346[i] & 0xffff;
		int i_2008_
		    = ((Class89_Sub1) this).aShortArray9368[i] & 0xffff;
		int i_2009_ = ((Class89_Sub1) this).anIntArray9384[i_2006_];
		int i_2010_ = ((Class89_Sub1) this).anIntArray9384[i_2007_];
		int i_2011_ = ((Class89_Sub1) this).anIntArray9384[i_2008_];
		int i_2012_ = ((Class89_Sub1) this).anIntArray9385[i_2006_];
		int i_2013_ = ((Class89_Sub1) this).anIntArray9385[i_2007_];
		int i_2014_ = ((Class89_Sub1) this).anIntArray9385[i_2008_];
		if (((i_2009_ - i_2010_) * (i_2013_ - i_2014_)
		     - (i_2013_ - i_2012_) * (i_2011_ - i_2010_))
		    > 0)
		    class241_sub39_sub17_sub1.method17676(i_2012_, i_2013_,
							  i_2014_, i_2009_,
							  i_2010_, i_2011_);
	    }
	}
    }
    
    public void method1984(int i) {
	((Class89_Sub1) this).aShort9322 = (short) i;
	method15474();
    }
    
    void method15493() {
	if ((((Class89_Sub1) this).anInt9321 & 0x37) != 0) {
	    if (((Class89_Sub1) this).aClass311_9354 != null)
		((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4826
		    = false;
	} else if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826
		= false;
    }
    
    public void method1977() {
	if (((Class89_Sub1) this).anInt9378 > 0
	    && ((Class89_Sub1) this).anInt9342 > 0) {
	    method15481();
	    method15522();
	    method15489();
	}
    }
    
    public void method1973(int i) {
	((Class89_Sub1) this).aShort9383 = (short) i;
	method15480();
	method15493();
    }
    
    public int method1998() {
	return ((Class89_Sub1) this).aShort9322;
    }
    
    public int method1999() {
	return ((Class89_Sub1) this).aShort9322;
    }
    
    public void method1935(int i) {
	int i_2015_ = Class282.anIntArray4430[i];
	int i_2016_ = Class282.anIntArray4441[i];
	for (int i_2017_ = 0; i_2017_ < ((Class89_Sub1) this).anInt9325;
	     i_2017_++) {
	    int i_2018_
		= ((((Class89_Sub1) this).anIntArray9327[i_2017_] * i_2016_
		    - ((Class89_Sub1) this).anIntArray9360[i_2017_] * i_2015_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9360[i_2017_]
		= ((((Class89_Sub1) this).anIntArray9327[i_2017_] * i_2015_
		    + ((Class89_Sub1) this).anIntArray9360[i_2017_] * i_2016_)
		   >> 14);
	    ((Class89_Sub1) this).anIntArray9327[i_2017_] = i_2018_;
	}
	method15480();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    static short[] method15494(short[] is, int i) {
	short[] is_2019_ = new short[i];
	System.arraycopy(is, 0, is_2019_, 0, i);
	return is_2019_;
    }
    
    public int method1974() {
	return ((Class89_Sub1) this).aShort9322;
    }
    
    public int method2003() {
	return ((Class89_Sub1) this).aShort9383;
    }
    
    public int method2004() {
	return ((Class89_Sub1) this).aShort9383;
    }
    
    public byte[] method2054() {
	return ((Class89_Sub1) this).aByteArray9344;
    }
    
    public byte[] method1976() {
	return ((Class89_Sub1) this).aByteArray9344;
    }
    
    public void method1915(Class266 class266) {
	Class268 class268
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	class268.method5203(class266);
	if (((Class89_Sub1) this).aClass106Array9376 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub1) this).aClass106Array9376.length; i++) {
		Class106 class106
		    = ((Class89_Sub1) this).aClass106Array9376[i];
		Class106 class106_2020_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_2020_ = class106.aClass106_1488;
		class106_2020_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_2020_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_2020_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_2020_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_2020_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_2020_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_2020_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_2020_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_2020_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub1) this).aClass167Array9377 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub1) this).aClass167Array9377.length; i++) {
		Class167 class167
		    = ((Class89_Sub1) this).aClass167Array9377[i];
		Class167 class167_2021_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_2021_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_2021_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub1) this)
					     .anIntArray9326
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9327
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub1) this)
					       .anIntArray9360
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_2021_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_2021_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub1) this)
					    .anIntArray9326
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9327
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub1) this)
					      .anIntArray9360
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    Class89_Sub1(Class103_Sub3 class103_sub3, int i, int i_2022_, boolean bool,
		 boolean bool_2023_) {
	((Class89_Sub1) this).anInt9331 = 0;
	((Class89_Sub1) this).anInt9342 = 0;
	((Class89_Sub1) this).aBool9393 = false;
	((Class89_Sub1) this).aBool9357 = true;
	((Class89_Sub1) this).aBool9358 = false;
	((Class89_Sub1) this).aBool9369 = false;
	((Class89_Sub1) this).aBool9323 = false;
	((Class89_Sub1) this).aBool9382 = false;
	((Class89_Sub1) this).aFloatArray9356 = new float[2];
	((Class89_Sub1) this).anIntArray9384 = new int[1];
	((Class89_Sub1) this).anIntArray9385 = new int[1];
	((Class89_Sub1) this).anIntArray9349 = new int[8];
	((Class89_Sub1) this).anIntArray9387 = new int[8];
	((Class89_Sub1) this).anIntArray9388 = new int[8];
	((Class89_Sub1) this).aClass103_Sub3_9319 = class103_sub3;
	((Class89_Sub1) this).anInt9367 = i;
	((Class89_Sub1) this).anInt9321 = i_2022_;
	((Class89_Sub1) this).aBool9393 = bool_2023_;
	if (bool || Class377.method6740(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) this).aClass311_9352
		= new Class311(Class377.method6744((((Class89_Sub1) this)
						    .anInt9367),
						   (((Class89_Sub1) this)
						    .anInt9321)));
	if (bool || Class377.method6743(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) this).aClass311_9341
		= new Class311(Class377.method6747((((Class89_Sub1) this)
						    .anInt9367),
						   (((Class89_Sub1) this)
						    .anInt9321)));
	if (bool || Class377.method6742(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) this).aClass311_9353
		= new Class311(Class377.method6789((((Class89_Sub1) this)
						    .anInt9367),
						   (((Class89_Sub1) this)
						    .anInt9321)));
	if (bool || Class377.method6741(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) this).aClass311_9354
		= new Class311(Class377.method6792((((Class89_Sub1) this)
						    .anInt9367),
						   (((Class89_Sub1) this)
						    .anInt9321)));
	if (bool || Class377.method6790(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) this).aClass386_9351
		= new Class386(Class377.method6748((((Class89_Sub1) this)
						    .anInt9367),
						   (((Class89_Sub1) this)
						    .anInt9321)));
	if (bool && bool_2023_) {
	    ((Class311) ((Class89_Sub1) this).aClass311_9352)
		.anInterface40_4829
		= ((Class311) ((Class89_Sub1) this).aClass311_9352)
		      .anInterface40_4828
		= ((Class89_Sub1) this).aClass103_Sub3_9319
		      .method15752(((Class89_Sub1) this).aBool9393);
	    ((Class311) ((Class89_Sub1) this).aClass311_9341)
		.anInterface40_4829
		= ((Class311) ((Class89_Sub1) this).aClass311_9341)
		      .anInterface40_4828
		= ((Class89_Sub1) this).aClass103_Sub3_9319
		      .method15752(((Class89_Sub1) this).aBool9393);
	    ((Class311) ((Class89_Sub1) this).aClass311_9353)
		.anInterface40_4829
		= ((Class311) ((Class89_Sub1) this).aClass311_9353)
		      .anInterface40_4828
		= ((Class89_Sub1) this).aClass103_Sub3_9319
		      .method15752(((Class89_Sub1) this).aBool9393);
	    ((Class311) ((Class89_Sub1) this).aClass311_9354)
		.anInterface40_4829
		= ((Class311) ((Class89_Sub1) this).aClass311_9354)
		      .anInterface40_4828
		= ((Class89_Sub1) this).aClass103_Sub3_9319
		      .method15752(((Class89_Sub1) this).aBool9393);
	}
    }
    
    public int method1983() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9366;
    }
    
    public void method2010(byte i, byte[] is) {
	if (is == null) {
	    for (int i_2024_ = 0; i_2024_ < ((Class89_Sub1) this).anInt9331;
		 i_2024_++)
		((Class89_Sub1) this).aByteArray9344[i_2024_] = i;
	} else {
	    for (int i_2025_ = 0; i_2025_ < ((Class89_Sub1) this).anInt9331;
		 i_2025_++) {
		int i_2026_ = 255 - ((255 - (is[i_2025_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class89_Sub1) this).aByteArray9344[i_2025_] = (byte) i_2026_;
	    }
	}
	method15474();
    }
    
    public void method2014(int i, int i_2027_, int i_2028_, int i_2029_) {
	for (int i_2030_ = 0; i_2030_ < ((Class89_Sub1) this).anInt9331;
	     i_2030_++) {
	    int i_2031_
		= ((Class89_Sub1) this).aShortArray9361[i_2030_] & 0xffff;
	    int i_2032_ = i_2031_ >> 10 & 0x3f;
	    int i_2033_ = i_2031_ >> 7 & 0x7;
	    int i_2034_ = i_2031_ & 0x7f;
	    if (i != -1)
		i_2032_ += (i - i_2032_) * i_2029_ >> 7;
	    if (i_2027_ != -1)
		i_2033_ += (i_2027_ - i_2033_) * i_2029_ >> 7;
	    if (i_2028_ != -1)
		i_2034_ += (i_2028_ - i_2034_) * i_2029_ >> 7;
	    ((Class89_Sub1) this).aShortArray9361[i_2030_]
		= (short) (i_2032_ << 10 | i_2033_ << 7 | i_2034_);
	}
	if (((Class89_Sub1) this).aClass315Array9333 != null) {
	    for (int i_2035_ = 0; i_2035_ < ((Class89_Sub1) this).anInt9375;
		 i_2035_++) {
		Class315 class315
		    = ((Class89_Sub1) this).aClass315Array9333[i_2035_];
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i_2035_];
		((Class381) class381).anInt5661
		    = (((Class381) class381).anInt5661 & ~0xffffff
		       | ((Class474.anIntArray6383
			   [(((Class89_Sub1) this).aShortArray9361
			     [((Class315) class315).anInt4841]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method15474();
    }
    
    public void method1944(short i, short i_2036_) {
	Class107 class107
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass107_1458;
	for (int i_2037_ = 0; i_2037_ < ((Class89_Sub1) this).anInt9331;
	     i_2037_++) {
	    if (((Class89_Sub1) this).aShortArray9348[i_2037_] == i)
		((Class89_Sub1) this).aShortArray9348[i_2037_] = i_2036_;
	}
	byte i_2038_ = 0;
	byte i_2039_ = 0;
	if (i != -1) {
	    Class101 class101 = class107.method2680(i & 0xffff, 1799660239);
	    i_2038_ = class101.aByte1430;
	    i_2039_ = class101.aByte1433;
	}
	byte i_2040_ = 0;
	byte i_2041_ = 0;
	if (i_2036_ != -1) {
	    Class101 class101
		= class107.method2680(i_2036_ & 0xffff, -604632290);
	    i_2040_ = class101.aByte1430;
	    i_2041_ = class101.aByte1433;
	    if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
		((Class89_Sub1) this).aBool9369 = true;
	}
	if (i_2038_ != i_2040_ | i_2039_ != i_2041_) {
	    if (((Class89_Sub1) this).aClass315Array9333 != null) {
		for (int i_2042_ = 0;
		     i_2042_ < ((Class89_Sub1) this).anInt9375; i_2042_++) {
		    Class315 class315
			= ((Class89_Sub1) this).aClass315Array9333[i_2042_];
		    Class381 class381
			= ((Class89_Sub1) this).aClass381Array9379[i_2042_];
		    ((Class381) class381).anInt5661
			= (((Class381) class381).anInt5661 & ~0xffffff
			   | ((Class474.anIntArray6383
			       [(((Class89_Sub1) this).aShortArray9361
				 [((Class315) class315).anInt4841]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15474();
	}
    }
    
    public void method2045(short i, short i_2043_) {
	Class107 class107
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass107_1458;
	for (int i_2044_ = 0; i_2044_ < ((Class89_Sub1) this).anInt9331;
	     i_2044_++) {
	    if (((Class89_Sub1) this).aShortArray9348[i_2044_] == i)
		((Class89_Sub1) this).aShortArray9348[i_2044_] = i_2043_;
	}
	byte i_2045_ = 0;
	byte i_2046_ = 0;
	if (i != -1) {
	    Class101 class101 = class107.method2680(i & 0xffff, 1425684684);
	    i_2045_ = class101.aByte1430;
	    i_2046_ = class101.aByte1433;
	}
	byte i_2047_ = 0;
	byte i_2048_ = 0;
	if (i_2043_ != -1) {
	    Class101 class101
		= class107.method2680(i_2043_ & 0xffff, -1152461709);
	    i_2047_ = class101.aByte1430;
	    i_2048_ = class101.aByte1433;
	    if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
		((Class89_Sub1) this).aBool9369 = true;
	}
	if (i_2045_ != i_2047_ | i_2046_ != i_2048_) {
	    if (((Class89_Sub1) this).aClass315Array9333 != null) {
		for (int i_2049_ = 0;
		     i_2049_ < ((Class89_Sub1) this).anInt9375; i_2049_++) {
		    Class315 class315
			= ((Class89_Sub1) this).aClass315Array9333[i_2049_];
		    Class381 class381
			= ((Class89_Sub1) this).aClass381Array9379[i_2049_];
		    ((Class381) class381).anInt5661
			= (((Class381) class381).anInt5661 & ~0xffffff
			   | ((Class474.anIntArray6383
			       [(((Class89_Sub1) this).aShortArray9361
				 [((Class315) class315).anInt4841]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15474();
	}
    }
    
    void method1887(int i, int i_2050_, int i_2051_, int i_2052_) {
	if (i == 0) {
	    int i_2053_ = 0;
	    ((Class89_Sub1) this).anInt9389 = 0;
	    ((Class89_Sub1) this).anInt9390 = 0;
	    ((Class89_Sub1) this).anInt9391 = 0;
	    for (int i_2054_ = 0; i_2054_ < ((Class89_Sub1) this).anInt9325;
		 i_2054_++) {
		((Class89_Sub1) this).anInt9389
		    += ((Class89_Sub1) this).anIntArray9326[i_2054_];
		((Class89_Sub1) this).anInt9390
		    += ((Class89_Sub1) this).anIntArray9327[i_2054_];
		((Class89_Sub1) this).anInt9391
		    += ((Class89_Sub1) this).anIntArray9360[i_2054_];
		i_2053_++;
	    }
	    if (i_2053_ > 0) {
		((Class89_Sub1) this).anInt9389
		    = ((Class89_Sub1) this).anInt9389 / i_2053_ + i_2050_;
		((Class89_Sub1) this).anInt9390
		    = ((Class89_Sub1) this).anInt9390 / i_2053_ + i_2051_;
		((Class89_Sub1) this).anInt9391
		    = ((Class89_Sub1) this).anInt9391 / i_2053_ + i_2052_;
	    } else {
		((Class89_Sub1) this).anInt9389 = i_2050_;
		((Class89_Sub1) this).anInt9390 = i_2051_;
		((Class89_Sub1) this).anInt9391 = i_2052_;
	    }
	} else if (i == 1) {
	    for (int i_2055_ = 0; i_2055_ < ((Class89_Sub1) this).anInt9325;
		 i_2055_++) {
		((Class89_Sub1) this).anIntArray9326[i_2055_] += i_2050_;
		((Class89_Sub1) this).anIntArray9327[i_2055_] += i_2051_;
		((Class89_Sub1) this).anIntArray9360[i_2055_] += i_2052_;
	    }
	} else if (i == 2) {
	    for (int i_2056_ = 0; i_2056_ < ((Class89_Sub1) this).anInt9325;
		 i_2056_++) {
		((Class89_Sub1) this).anIntArray9326[i_2056_]
		    -= ((Class89_Sub1) this).anInt9389;
		((Class89_Sub1) this).anIntArray9327[i_2056_]
		    -= ((Class89_Sub1) this).anInt9390;
		((Class89_Sub1) this).anIntArray9360[i_2056_]
		    -= ((Class89_Sub1) this).anInt9391;
		if (i_2052_ != 0) {
		    int i_2057_ = Class282.anIntArray4430[i_2052_];
		    int i_2058_ = Class282.anIntArray4441[i_2052_];
		    int i_2059_
			= (((((Class89_Sub1) this).anIntArray9327[i_2056_]
			     * i_2057_)
			    + (((Class89_Sub1) this).anIntArray9326[i_2056_]
			       * i_2058_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub1) this).anIntArray9327[i_2056_]
			= ((((Class89_Sub1) this).anIntArray9327[i_2056_]
			    * i_2058_)
			   - (((Class89_Sub1) this).anIntArray9326[i_2056_]
			      * i_2057_)
			   + 16383) >> 14;
		    ((Class89_Sub1) this).anIntArray9326[i_2056_] = i_2059_;
		}
		if (i_2050_ != 0) {
		    int i_2060_ = Class282.anIntArray4430[i_2050_];
		    int i_2061_ = Class282.anIntArray4441[i_2050_];
		    int i_2062_
			= (((((Class89_Sub1) this).anIntArray9327[i_2056_]
			     * i_2061_)
			    - (((Class89_Sub1) this).anIntArray9360[i_2056_]
			       * i_2060_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub1) this).anIntArray9360[i_2056_]
			= ((((Class89_Sub1) this).anIntArray9327[i_2056_]
			    * i_2060_)
			   + (((Class89_Sub1) this).anIntArray9360[i_2056_]
			      * i_2061_)
			   + 16383) >> 14;
		    ((Class89_Sub1) this).anIntArray9327[i_2056_] = i_2062_;
		}
		if (i_2051_ != 0) {
		    int i_2063_ = Class282.anIntArray4430[i_2051_];
		    int i_2064_ = Class282.anIntArray4441[i_2051_];
		    int i_2065_
			= (((((Class89_Sub1) this).anIntArray9360[i_2056_]
			     * i_2063_)
			    + (((Class89_Sub1) this).anIntArray9326[i_2056_]
			       * i_2064_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub1) this).anIntArray9360[i_2056_]
			= ((((Class89_Sub1) this).anIntArray9360[i_2056_]
			    * i_2064_)
			   - (((Class89_Sub1) this).anIntArray9326[i_2056_]
			      * i_2063_)
			   + 16383) >> 14;
		    ((Class89_Sub1) this).anIntArray9326[i_2056_] = i_2065_;
		}
		((Class89_Sub1) this).anIntArray9326[i_2056_]
		    += ((Class89_Sub1) this).anInt9389;
		((Class89_Sub1) this).anIntArray9327[i_2056_]
		    += ((Class89_Sub1) this).anInt9390;
		((Class89_Sub1) this).anIntArray9360[i_2056_]
		    += ((Class89_Sub1) this).anInt9391;
	    }
	} else if (i == 3) {
	    for (int i_2066_ = 0; i_2066_ < ((Class89_Sub1) this).anInt9325;
		 i_2066_++) {
		((Class89_Sub1) this).anIntArray9326[i_2066_]
		    -= ((Class89_Sub1) this).anInt9389;
		((Class89_Sub1) this).anIntArray9327[i_2066_]
		    -= ((Class89_Sub1) this).anInt9390;
		((Class89_Sub1) this).anIntArray9360[i_2066_]
		    -= ((Class89_Sub1) this).anInt9391;
		((Class89_Sub1) this).anIntArray9326[i_2066_]
		    = (((Class89_Sub1) this).anIntArray9326[i_2066_] * i_2050_
		       / 128);
		((Class89_Sub1) this).anIntArray9327[i_2066_]
		    = (((Class89_Sub1) this).anIntArray9327[i_2066_] * i_2051_
		       / 128);
		((Class89_Sub1) this).anIntArray9360[i_2066_]
		    = (((Class89_Sub1) this).anIntArray9360[i_2066_] * i_2052_
		       / 128);
		((Class89_Sub1) this).anIntArray9326[i_2066_]
		    += ((Class89_Sub1) this).anInt9389;
		((Class89_Sub1) this).anIntArray9327[i_2066_]
		    += ((Class89_Sub1) this).anInt9390;
		((Class89_Sub1) this).anIntArray9360[i_2066_]
		    += ((Class89_Sub1) this).anInt9391;
	    }
	} else if (i == 5) {
	    for (int i_2067_ = 0; i_2067_ < ((Class89_Sub1) this).anInt9331;
		 i_2067_++) {
		int i_2068_
		    = ((((Class89_Sub1) this).aByteArray9344[i_2067_] & 0xff)
		       + i_2050_ * 8);
		if (i_2068_ < 0)
		    i_2068_ = 0;
		else if (i_2068_ > 255)
		    i_2068_ = 255;
		((Class89_Sub1) this).aByteArray9344[i_2067_] = (byte) i_2068_;
	    }
	    if (((Class89_Sub1) this).aClass315Array9333 != null) {
		for (int i_2069_ = 0;
		     i_2069_ < ((Class89_Sub1) this).anInt9375; i_2069_++) {
		    Class315 class315
			= ((Class89_Sub1) this).aClass315Array9333[i_2069_];
		    Class381 class381
			= ((Class89_Sub1) this).aClass381Array9379[i_2069_];
		    ((Class381) class381).anInt5661
			= (((Class381) class381).anInt5661 & 0xffffff
			   | 255 - ((((Class89_Sub1) this).aByteArray9344
				     [((Class315) class315).anInt4841])
				    & 0xff) << 24);
		}
	    }
	    method15474();
	} else if (i == 7) {
	    for (int i_2070_ = 0; i_2070_ < ((Class89_Sub1) this).anInt9331;
		 i_2070_++) {
		int i_2071_
		    = ((Class89_Sub1) this).aShortArray9361[i_2070_] & 0xffff;
		int i_2072_ = i_2071_ >> 10 & 0x3f;
		int i_2073_ = i_2071_ >> 7 & 0x7;
		int i_2074_ = i_2071_ & 0x7f;
		i_2072_ = i_2072_ + i_2050_ & 0x3f;
		i_2073_ += i_2051_ / 4;
		if (i_2073_ < 0)
		    i_2073_ = 0;
		else if (i_2073_ > 7)
		    i_2073_ = 7;
		i_2074_ += i_2052_;
		if (i_2074_ < 0)
		    i_2074_ = 0;
		else if (i_2074_ > 127)
		    i_2074_ = 127;
		((Class89_Sub1) this).aShortArray9361[i_2070_]
		    = (short) (i_2072_ << 10 | i_2073_ << 7 | i_2074_);
	    }
	    if (((Class89_Sub1) this).aClass315Array9333 != null) {
		for (int i_2075_ = 0;
		     i_2075_ < ((Class89_Sub1) this).anInt9375; i_2075_++) {
		    Class315 class315
			= ((Class89_Sub1) this).aClass315Array9333[i_2075_];
		    Class381 class381
			= ((Class89_Sub1) this).aClass381Array9379[i_2075_];
		    ((Class381) class381).anInt5661
			= (((Class381) class381).anInt5661 & ~0xffffff
			   | ((Class474.anIntArray6383
			       [(((Class89_Sub1) this).aShortArray9361
				 [((Class315) class315).anInt4841]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15474();
	} else if (i == 8) {
	    for (int i_2076_ = 0; i_2076_ < ((Class89_Sub1) this).anInt9375;
		 i_2076_++) {
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i_2076_];
		((Class381) class381).anInt5664 += i_2050_;
		((Class381) class381).anInt5665 += i_2051_;
	    }
	} else if (i == 10) {
	    for (int i_2077_ = 0; i_2077_ < ((Class89_Sub1) this).anInt9375;
		 i_2077_++) {
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i_2077_];
		((Class381) class381).anInt5662
		    = ((Class381) class381).anInt5662 * i_2050_ >> 7;
		((Class381) class381).anInt5663
		    = ((Class381) class381).anInt5663 * i_2051_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_2078_ = 0; i_2078_ < ((Class89_Sub1) this).anInt9375;
		 i_2078_++) {
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i_2078_];
		((Class381) class381).anInt5666
		    = ((Class381) class381).anInt5666 + i_2050_ & 0x3fff;
	    }
	}
    }
    
    public Class106[] method2015() {
	return ((Class89_Sub1) this).aClass106Array9376;
    }
    
    public boolean method2027() {
	return ((Class89_Sub1) this).aBool9358;
    }
    
    public Class167[] method2029() {
	return ((Class89_Sub1) this).aClass167Array9377;
    }
    
    public boolean method2018() {
	if (((Class89_Sub1) this).aShortArray9348 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub1) this).aShortArray9348.length;
	     i++) {
	    if (((Class89_Sub1) this).aShortArray9348[i] != -1
		&& !(((Class103_Sub3)
		      ((Class89_Sub1) this).aClass103_Sub3_9319)
			 .aClass379_9518.method6846
		     ((((Class89_Sub1) this).aClass103_Sub3_9319
			   .aClass107_1458.method2680
		       (((Class89_Sub1) this).aShortArray9348[i],
			-1931036401)),
		      -1)))
		return false;
	}
	return true;
    }
    
    public boolean method1965() {
	if (((Class89_Sub1) this).aShortArray9348 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub1) this).aShortArray9348.length;
	     i++) {
	    if (((Class89_Sub1) this).aShortArray9348[i] != -1
		&& !(((Class103_Sub3)
		      ((Class89_Sub1) this).aClass103_Sub3_9319)
			 .aClass379_9518.method6846
		     ((((Class89_Sub1) this).aClass103_Sub3_9319
			   .aClass107_1458.method2680
		       (((Class89_Sub1) this).aShortArray9348[i],
			-1654897910)),
		      -1)))
		return false;
	}
	return true;
    }
    
    public boolean method2020() {
	if (((Class89_Sub1) this).aShortArray9348 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub1) this).aShortArray9348.length;
	     i++) {
	    if (((Class89_Sub1) this).aShortArray9348[i] != -1
		&& !(((Class103_Sub3)
		      ((Class89_Sub1) this).aClass103_Sub3_9319)
			 .aClass379_9518.method6846
		     ((((Class89_Sub1) this).aClass103_Sub3_9319
			   .aClass107_1458.method2680
		       (((Class89_Sub1) this).aShortArray9348[i],
			-1302699252)),
		      -1)))
		return false;
	}
	return true;
    }
    
    public boolean method2021() {
	return ((Class89_Sub1) this).aBool9369;
    }
    
    public void method1867() {
	if (((Class89_Sub1) this).anInt9378 > 0
	    && ((Class89_Sub1) this).anInt9342 > 0) {
	    method15481();
	    method15522();
	    method15489();
	}
    }
    
    public void method1910() {
	for (int i = 0; i < ((Class89_Sub1) this).anInt9325; i++)
	    ((Class89_Sub1) this).anIntArray9360[i]
		= -((Class89_Sub1) this).anIntArray9360[i];
	for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++)
	    ((Class89_Sub1) this).aShortArray9371[i]
		= (short) -((Class89_Sub1) this).aShortArray9371[i];
	for (int i = 0; i < ((Class89_Sub1) this).anInt9331; i++) {
	    short i_2079_ = ((Class89_Sub1) this).aShortArray9345[i];
	    ((Class89_Sub1) this).aShortArray9345[i]
		= ((Class89_Sub1) this).aShortArray9368[i];
	    ((Class89_Sub1) this).aShortArray9368[i] = i_2079_;
	}
	method15480();
	method15493();
	method15470();
	((Class89_Sub1) this).aBool9323 = false;
    }
    
    void method15495(Class268 class268) {
	if (((Class89_Sub1) this).aClass315Array9333 != null) {
	    ((Class89_Sub1) this).aClass103_Sub3_9319
		.method2308(!((Class89_Sub1) this).aBool9358);
	    Class266 class266
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass266_9588);
	    Class358 class358
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass358_9595);
	    boolean bool
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anInt9613 > 0;
	    if (bool)
		class358.aClass287_5473.method5568
		    ((float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 0
			      & 0xff) / 255.0F);
	    else
		class358.aClass287_5473.method5568(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < ((Class89_Sub1) this).anInt9375; i++) {
		Class315 class315
		    = ((Class89_Sub1) this).aClass315Array9333[i];
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i];
		if (!((Class315) class315).aBool4845
		    || !((Class89_Sub1) this).aClass103_Sub3_9319
			    .method2331()) {
		    float f = ((float) ((((Class89_Sub1) this).anIntArray9326
					 [((Class315) class315).anInt4843])
					+ (((Class89_Sub1) this).anIntArray9326
					   [((Class315) class315).anInt4839])
					+ (((Class89_Sub1) this).anIntArray9326
					   [((Class315) class315).anInt4840]))
			       * 0.3333333F);
		    float f_2080_
			= ((float) ((((Class89_Sub1) this).anIntArray9327
				     [((Class315) class315).anInt4843])
				    + (((Class89_Sub1) this).anIntArray9327
				       [((Class315) class315).anInt4839])
				    + (((Class89_Sub1) this).anIntArray9327
				       [((Class315) class315).anInt4840]))
			   * 0.3333333F);
		    float f_2081_
			= ((float) ((((Class89_Sub1) this).anIntArray9360
				     [((Class315) class315).anInt4843])
				    + (((Class89_Sub1) this).anIntArray9360
				       [((Class315) class315).anInt4839])
				    + (((Class89_Sub1) this).anIntArray9360
				       [((Class315) class315).anInt4840]))
			   * 0.3333333F);
		    float f_2082_ = (class268.aFloatArray4353[0] * f
				     + class268.aFloatArray4353[4] * f_2080_
				     + class268.aFloatArray4353[8] * f_2081_
				     + class268.aFloatArray4353[12]);
		    float f_2083_ = (class268.aFloatArray4353[1] * f
				     + class268.aFloatArray4353[5] * f_2080_
				     + class268.aFloatArray4353[9] * f_2081_
				     + class268.aFloatArray4353[13]);
		    float f_2084_ = (class268.aFloatArray4353[2] * f
				     + class268.aFloatArray4353[6] * f_2080_
				     + class268.aFloatArray4353[10] * f_2081_
				     + class268.aFloatArray4353[14]);
		    float f_2085_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2082_ * f_2082_
							  + f_2083_ * f_2083_
							  + (f_2084_
							     * f_2084_))))
			   * (float) ((Class315) class315).anInt4846);
		    class266.method5121
			(((Class381) class381).anInt5666,
			 (((Class381) class381).anInt5662
			  * ((Class315) class315).aShort4838) >> 7,
			 (((Class381) class381).anInt5663
			  * ((Class315) class315).aShort4842) >> 7,
			 (f_2082_ + (float) ((Class381) class381).anInt5664
			  - f_2082_ * f_2085_),
			 (f_2083_ + (float) ((Class381) class381).anInt5665
			  - f_2083_ * f_2085_),
			 f_2084_ - f_2084_ * f_2085_);
		    class266.method5134(((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319))
					.aClass266_9503);
		    ((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
			.aClass268_9646.method5203(class266);
		    class358.method6476(((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319))
					.aClass268_9646);
		    class358.aClass268_5474.method5198();
		    class358.anInt5471 = ((Class381) class381).anInt5661;
		    if (bool)
			class358.aFloat5468
			    = 1.0F - (((((Class89_Sub1) this)
					.aClass103_Sub3_9319.aFloat9616)
				       - f_2084_)
				      / ((((Class89_Sub1) this)
					  .aClass103_Sub3_9319.aFloat9616)
					 - (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9615)));
		    class358.anInterface41_5470 = null;
		    if (((Class315) class315).aShort4844 != -1)
			class358.anInterface41_5470
			    = (((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
				   .aClass379_9518.method6844
			       (((Class89_Sub1) this).aClass103_Sub3_9319
				    .aClass107_1458.method2680
				(((Class315) class315).aShort4844 & 0xffff,
				 55426917)));
		    class358.method6469(bool);
		}
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method2308(true);
	}
    }
    
    public boolean method2025() {
	return ((Class89_Sub1) this).aBool9358;
    }
    
    public boolean method2026() {
	return ((Class89_Sub1) this).aBool9358;
    }
    
    void method1962(int i, int[] is, int i_2086_, int i_2087_, int i_2088_,
		    boolean bool, int i_2089_, int[] is_2090_) {
	int i_2091_ = is.length;
	if (i == 0) {
	    i_2086_ <<= 4;
	    i_2087_ <<= 4;
	    i_2088_ <<= 4;
	    int i_2092_ = 0;
	    ((Class89_Sub1) this).anInt9389 = 0;
	    ((Class89_Sub1) this).anInt9390 = 0;
	    ((Class89_Sub1) this).anInt9391 = 0;
	    for (int i_2093_ = 0; i_2093_ < i_2091_; i_2093_++) {
		int i_2094_ = is[i_2093_];
		if (i_2094_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_2095_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_2094_];
		    for (int i_2096_ = 0; i_2096_ < is_2095_.length;
			 i_2096_++) {
			int i_2097_ = is_2095_[i_2096_];
			if (((Class89_Sub1) this).aShortArray9330 == null
			    || (i_2089_ & (((Class89_Sub1) this)
					   .aShortArray9330[i_2097_])) != 0) {
			    ((Class89_Sub1) this).anInt9389
				+= (((Class89_Sub1) this).anIntArray9326
				    [i_2097_]);
			    ((Class89_Sub1) this).anInt9390
				+= (((Class89_Sub1) this).anIntArray9327
				    [i_2097_]);
			    ((Class89_Sub1) this).anInt9391
				+= (((Class89_Sub1) this).anIntArray9360
				    [i_2097_]);
			    i_2092_++;
			}
		    }
		}
	    }
	    if (i_2092_ > 0) {
		((Class89_Sub1) this).anInt9389
		    = ((Class89_Sub1) this).anInt9389 / i_2092_ + i_2086_;
		((Class89_Sub1) this).anInt9390
		    = ((Class89_Sub1) this).anInt9390 / i_2092_ + i_2087_;
		((Class89_Sub1) this).anInt9391
		    = ((Class89_Sub1) this).anInt9391 / i_2092_ + i_2088_;
		((Class89_Sub1) this).aBool9392 = true;
	    } else {
		((Class89_Sub1) this).anInt9389 = i_2086_;
		((Class89_Sub1) this).anInt9390 = i_2087_;
		((Class89_Sub1) this).anInt9391 = i_2088_;
	    }
	} else if (i == 1) {
	    if (is_2090_ != null) {
		int i_2098_ = ((is_2090_[0] * i_2086_ + is_2090_[1] * i_2087_
				+ is_2090_[2] * i_2088_ + 8192)
			       >> 14);
		int i_2099_ = ((is_2090_[3] * i_2086_ + is_2090_[4] * i_2087_
				+ is_2090_[5] * i_2088_ + 8192)
			       >> 14);
		int i_2100_ = ((is_2090_[6] * i_2086_ + is_2090_[7] * i_2087_
				+ is_2090_[8] * i_2088_ + 8192)
			       >> 14);
		i_2086_ = i_2098_;
		i_2087_ = i_2099_;
		i_2088_ = i_2100_;
	    }
	    i_2086_ <<= 4;
	    i_2087_ <<= 4;
	    i_2088_ <<= 4;
	    for (int i_2101_ = 0; i_2101_ < i_2091_; i_2101_++) {
		int i_2102_ = is[i_2101_];
		if (i_2102_
		    < ((Class89_Sub1) this).anIntArrayArray9329.length) {
		    int[] is_2103_
			= ((Class89_Sub1) this).anIntArrayArray9329[i_2102_];
		    for (int i_2104_ = 0; i_2104_ < is_2103_.length;
			 i_2104_++) {
			int i_2105_ = is_2103_[i_2104_];
			if (((Class89_Sub1) this).aShortArray9330 == null
			    || (i_2089_ & (((Class89_Sub1) this)
					   .aShortArray9330[i_2105_])) != 0) {
			    ((Class89_Sub1) this).anIntArray9326[i_2105_]
				+= i_2086_;
			    ((Class89_Sub1) this).anIntArray9327[i_2105_]
				+= i_2087_;
			    ((Class89_Sub1) this).anIntArray9360[i_2105_]
				+= i_2088_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_2090_ != null) {
		int i_2106_ = is_2090_[9] << 4;
		int i_2107_ = is_2090_[10] << 4;
		int i_2108_ = is_2090_[11] << 4;
		int i_2109_ = is_2090_[12] << 4;
		int i_2110_ = is_2090_[13] << 4;
		int i_2111_ = is_2090_[14] << 4;
		if (((Class89_Sub1) this).aBool9392) {
		    int i_2112_
			= ((is_2090_[0] * ((Class89_Sub1) this).anInt9389
			    + is_2090_[3] * ((Class89_Sub1) this).anInt9390
			    + is_2090_[6] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_2113_
			= ((is_2090_[1] * ((Class89_Sub1) this).anInt9389
			    + is_2090_[4] * ((Class89_Sub1) this).anInt9390
			    + is_2090_[7] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_2114_
			= ((is_2090_[2] * ((Class89_Sub1) this).anInt9389
			    + is_2090_[5] * ((Class89_Sub1) this).anInt9390
			    + is_2090_[8] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    i_2112_ += i_2109_;
		    i_2113_ += i_2110_;
		    i_2114_ += i_2111_;
		    ((Class89_Sub1) this).anInt9389 = i_2112_;
		    ((Class89_Sub1) this).anInt9390 = i_2113_;
		    ((Class89_Sub1) this).anInt9391 = i_2114_;
		    ((Class89_Sub1) this).aBool9392 = false;
		}
		int[] is_2115_ = new int[9];
		int i_2116_ = Class282.anIntArray4441[i_2086_];
		int i_2117_ = Class282.anIntArray4430[i_2086_];
		int i_2118_ = Class282.anIntArray4441[i_2087_];
		int i_2119_ = Class282.anIntArray4430[i_2087_];
		int i_2120_ = Class282.anIntArray4441[i_2088_];
		int i_2121_ = Class282.anIntArray4430[i_2088_];
		int i_2122_ = i_2117_ * i_2120_ + 8192 >> 14;
		int i_2123_ = i_2117_ * i_2121_ + 8192 >> 14;
		is_2115_[0]
		    = i_2118_ * i_2120_ + i_2119_ * i_2123_ + 8192 >> 14;
		is_2115_[1]
		    = -i_2118_ * i_2121_ + i_2119_ * i_2122_ + 8192 >> 14;
		is_2115_[2] = i_2119_ * i_2116_ + 8192 >> 14;
		is_2115_[3] = i_2116_ * i_2121_ + 8192 >> 14;
		is_2115_[4] = i_2116_ * i_2120_ + 8192 >> 14;
		is_2115_[5] = -i_2117_;
		is_2115_[6]
		    = -i_2119_ * i_2120_ + i_2118_ * i_2123_ + 8192 >> 14;
		is_2115_[7]
		    = i_2119_ * i_2121_ + i_2118_ * i_2122_ + 8192 >> 14;
		is_2115_[8] = i_2118_ * i_2116_ + 8192 >> 14;
		int i_2124_ = (is_2115_[0] * -((Class89_Sub1) this).anInt9389
			       + is_2115_[1] * -((Class89_Sub1) this).anInt9390
			       + is_2115_[2] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_2125_ = (is_2115_[3] * -((Class89_Sub1) this).anInt9389
			       + is_2115_[4] * -((Class89_Sub1) this).anInt9390
			       + is_2115_[5] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_2126_ = (is_2115_[6] * -((Class89_Sub1) this).anInt9389
			       + is_2115_[7] * -((Class89_Sub1) this).anInt9390
			       + is_2115_[8] * -((Class89_Sub1) this).anInt9391
			       + 8192) >> 14;
		int i_2127_ = i_2124_ + ((Class89_Sub1) this).anInt9389;
		int i_2128_ = i_2125_ + ((Class89_Sub1) this).anInt9390;
		int i_2129_ = i_2126_ + ((Class89_Sub1) this).anInt9391;
		int[] is_2130_ = new int[9];
		for (int i_2131_ = 0; i_2131_ < 3; i_2131_++) {
		    for (int i_2132_ = 0; i_2132_ < 3; i_2132_++) {
			int i_2133_ = 0;
			for (int i_2134_ = 0; i_2134_ < 3; i_2134_++)
			    i_2133_ += (is_2115_[i_2131_ * 3 + i_2134_]
					* is_2090_[i_2132_ * 3 + i_2134_]);
			is_2130_[i_2131_ * 3 + i_2132_] = i_2133_ + 8192 >> 14;
		    }
		}
		int i_2135_ = ((is_2115_[0] * i_2109_ + is_2115_[1] * i_2110_
				+ is_2115_[2] * i_2111_ + 8192)
			       >> 14);
		int i_2136_ = ((is_2115_[3] * i_2109_ + is_2115_[4] * i_2110_
				+ is_2115_[5] * i_2111_ + 8192)
			       >> 14);
		int i_2137_ = ((is_2115_[6] * i_2109_ + is_2115_[7] * i_2110_
				+ is_2115_[8] * i_2111_ + 8192)
			       >> 14);
		i_2135_ += i_2127_;
		i_2136_ += i_2128_;
		i_2137_ += i_2129_;
		int[] is_2138_ = new int[9];
		for (int i_2139_ = 0; i_2139_ < 3; i_2139_++) {
		    for (int i_2140_ = 0; i_2140_ < 3; i_2140_++) {
			int i_2141_ = 0;
			for (int i_2142_ = 0; i_2142_ < 3; i_2142_++)
			    i_2141_ += (is_2090_[i_2139_ * 3 + i_2142_]
					* is_2130_[i_2140_ + i_2142_ * 3]);
			is_2138_[i_2139_ * 3 + i_2140_] = i_2141_ + 8192 >> 14;
		    }
		}
		int i_2143_ = ((is_2090_[0] * i_2135_ + is_2090_[1] * i_2136_
				+ is_2090_[2] * i_2137_ + 8192)
			       >> 14);
		int i_2144_ = ((is_2090_[3] * i_2135_ + is_2090_[4] * i_2136_
				+ is_2090_[5] * i_2137_ + 8192)
			       >> 14);
		int i_2145_ = ((is_2090_[6] * i_2135_ + is_2090_[7] * i_2136_
				+ is_2090_[8] * i_2137_ + 8192)
			       >> 14);
		i_2143_ += i_2106_;
		i_2144_ += i_2107_;
		i_2145_ += i_2108_;
		for (int i_2146_ = 0; i_2146_ < i_2091_; i_2146_++) {
		    int i_2147_ = is[i_2146_];
		    if (i_2147_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_2148_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_2147_]);
			for (int i_2149_ = 0; i_2149_ < is_2148_.length;
			     i_2149_++) {
			    int i_2150_ = is_2148_[i_2149_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_2089_ & (((Class89_Sub1) this)
						.aShortArray9330[i_2150_]))
				    != 0)) {
				int i_2151_
				    = (is_2138_[0] * (((Class89_Sub1) this)
						      .anIntArray9326[i_2150_])
				       + is_2138_[1] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_2150_])
				       + is_2138_[2] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_2150_])
				       + 8192) >> 14;
				int i_2152_
				    = (is_2138_[3] * (((Class89_Sub1) this)
						      .anIntArray9326[i_2150_])
				       + is_2138_[4] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_2150_])
				       + is_2138_[5] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_2150_])
				       + 8192) >> 14;
				int i_2153_
				    = (is_2138_[6] * (((Class89_Sub1) this)
						      .anIntArray9326[i_2150_])
				       + is_2138_[7] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_2150_])
				       + is_2138_[8] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_2150_])
				       + 8192) >> 14;
				i_2151_ += i_2143_;
				i_2152_ += i_2144_;
				i_2153_ += i_2145_;
				((Class89_Sub1) this).anIntArray9326[i_2150_]
				    = i_2151_;
				((Class89_Sub1) this).anIntArray9327[i_2150_]
				    = i_2152_;
				((Class89_Sub1) this).anIntArray9360[i_2150_]
				    = i_2153_;
			    }
			}
		    }
		}
	    } else {
		for (int i_2154_ = 0; i_2154_ < i_2091_; i_2154_++) {
		    int i_2155_ = is[i_2154_];
		    if (i_2155_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_2156_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_2155_]);
			for (int i_2157_ = 0; i_2157_ < is_2156_.length;
			     i_2157_++) {
			    int i_2158_ = is_2156_[i_2157_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_2089_ & (((Class89_Sub1) this)
						.aShortArray9330[i_2158_]))
				    != 0)) {
				((Class89_Sub1) this).anIntArray9326[i_2158_]
				    -= ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_2158_]
				    -= ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_2158_]
				    -= ((Class89_Sub1) this).anInt9391;
				if (i_2088_ != 0) {
				    int i_2159_
					= Class282.anIntArray4430[i_2088_];
				    int i_2160_
					= Class282.anIntArray4441[i_2088_];
				    int i_2161_
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_2158_]) * i_2159_
					   + ((((Class89_Sub1) this)
					       .anIntArray9326[i_2158_])
					      * i_2160_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9327
					[i_2158_]
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_2158_]) * i_2160_
					   - ((((Class89_Sub1) this)
					       .anIntArray9326[i_2158_])
					      * i_2159_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9326
					[i_2158_]
					= i_2161_;
				}
				if (i_2086_ != 0) {
				    int i_2162_
					= Class282.anIntArray4430[i_2086_];
				    int i_2163_
					= Class282.anIntArray4441[i_2086_];
				    int i_2164_
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_2158_]) * i_2163_
					   - ((((Class89_Sub1) this)
					       .anIntArray9360[i_2158_])
					      * i_2162_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9360
					[i_2158_]
					= ((((Class89_Sub1) this)
					    .anIntArray9327[i_2158_]) * i_2162_
					   + ((((Class89_Sub1) this)
					       .anIntArray9360[i_2158_])
					      * i_2163_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9327
					[i_2158_]
					= i_2164_;
				}
				if (i_2087_ != 0) {
				    int i_2165_
					= Class282.anIntArray4430[i_2087_];
				    int i_2166_
					= Class282.anIntArray4441[i_2087_];
				    int i_2167_
					= ((((Class89_Sub1) this)
					    .anIntArray9360[i_2158_]) * i_2165_
					   + ((((Class89_Sub1) this)
					       .anIntArray9326[i_2158_])
					      * i_2166_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9360
					[i_2158_]
					= ((((Class89_Sub1) this)
					    .anIntArray9360[i_2158_]) * i_2166_
					   - ((((Class89_Sub1) this)
					       .anIntArray9326[i_2158_])
					      * i_2165_)
					   + 16383) >> 14;
				    ((Class89_Sub1) this).anIntArray9326
					[i_2158_]
					= i_2167_;
				}
				((Class89_Sub1) this).anIntArray9326[i_2158_]
				    += ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_2158_]
				    += ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_2158_]
				    += ((Class89_Sub1) this).anInt9391;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_2168_ = 0; i_2168_ < i_2091_; i_2168_++) {
			int i_2169_ = is[i_2168_];
			if (i_2169_ < (((Class89_Sub1) this)
				       .anIntArrayArray9329).length) {
			    int[] is_2170_ = (((Class89_Sub1) this)
					      .anIntArrayArray9329[i_2169_]);
			    for (int i_2171_ = 0; i_2171_ < is_2170_.length;
				 i_2171_++) {
				int i_2172_ = is_2170_[i_2171_];
				if ((((Class89_Sub1) this).aShortArray9330
				     == null)
				    || ((i_2089_ & (((Class89_Sub1) this)
						    .aShortArray9330[i_2172_]))
					!= 0)) {
				    int i_2173_ = (((Class89_Sub1) this)
						   .anIntArray9374[i_2172_]);
				    int i_2174_
					= (((Class89_Sub1) this).anIntArray9374
					   [i_2172_ + 1]);
				    for (int i_2175_ = i_2173_;
					 (i_2175_ < i_2174_
					  && (((Class89_Sub1) this)
					      .aShortArray9328[i_2175_]) != 0);
					 i_2175_++) {
					int i_2176_
					    = (((((Class89_Sub1) this)
						 .aShortArray9328[i_2175_])
						& 0xffff)
					       - 1);
					if (i_2088_ != 0) {
					    int i_2177_
						= (Class282.anIntArray4430
						   [i_2088_]);
					    int i_2178_
						= (Class282.anIntArray4441
						   [i_2088_]);
					    int i_2179_
						= (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_2176_]) * i_2177_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_2176_]) * i_2178_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9335[i_2176_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9335
							      [i_2176_])
							     * i_2178_)
							    - ((((Class89_Sub1)
								 this)
								.aShortArray9334
								[i_2176_])
							       * i_2177_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9334[i_2176_]
						= (short) i_2179_;
					}
					if (i_2086_ != 0) {
					    int i_2180_
						= (Class282.anIntArray4430
						   [i_2086_]);
					    int i_2181_
						= (Class282.anIntArray4441
						   [i_2086_]);
					    int i_2182_
						= (((((Class89_Sub1) this)
						     .aShortArray9335
						     [i_2176_]) * i_2181_
						    - (((Class89_Sub1) this)
						       .aShortArray9371
						       [i_2176_]) * i_2180_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9371[i_2176_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9335
							      [i_2176_])
							     * i_2180_)
							    + ((((Class89_Sub1)
								 this)
								.aShortArray9371
								[i_2176_])
							       * i_2181_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9335[i_2176_]
						= (short) i_2182_;
					}
					if (i_2087_ != 0) {
					    int i_2183_
						= (Class282.anIntArray4430
						   [i_2087_]);
					    int i_2184_
						= (Class282.anIntArray4441
						   [i_2087_]);
					    int i_2185_
						= (((((Class89_Sub1) this)
						     .aShortArray9371
						     [i_2176_]) * i_2183_
						    + (((Class89_Sub1) this)
						       .aShortArray9334
						       [i_2176_]) * i_2184_
						    + 16383)
						   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9371[i_2176_]
						= (short) ((((((Class89_Sub1)
							       this)
							      .aShortArray9371
							      [i_2176_])
							     * i_2184_)
							    - ((((Class89_Sub1)
								 this)
								.aShortArray9334
								[i_2176_])
							       * i_2183_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub1) this)
						.aShortArray9334[i_2176_]
						= (short) i_2185_;
					}
				    }
				}
			    }
			}
		    }
		    method15493();
		}
	    }
	} else if (i == 3) {
	    if (is_2090_ != null) {
		int i_2186_ = is_2090_[9] << 4;
		int i_2187_ = is_2090_[10] << 4;
		int i_2188_ = is_2090_[11] << 4;
		int i_2189_ = is_2090_[12] << 4;
		int i_2190_ = is_2090_[13] << 4;
		int i_2191_ = is_2090_[14] << 4;
		if (((Class89_Sub1) this).aBool9392) {
		    int i_2192_
			= ((is_2090_[0] * ((Class89_Sub1) this).anInt9389
			    + is_2090_[3] * ((Class89_Sub1) this).anInt9390
			    + is_2090_[6] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_2193_
			= ((is_2090_[1] * ((Class89_Sub1) this).anInt9389
			    + is_2090_[4] * ((Class89_Sub1) this).anInt9390
			    + is_2090_[7] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    int i_2194_
			= ((is_2090_[2] * ((Class89_Sub1) this).anInt9389
			    + is_2090_[5] * ((Class89_Sub1) this).anInt9390
			    + is_2090_[8] * ((Class89_Sub1) this).anInt9391
			    + 8192)
			   >> 14);
		    i_2192_ += i_2189_;
		    i_2193_ += i_2190_;
		    i_2194_ += i_2191_;
		    ((Class89_Sub1) this).anInt9389 = i_2192_;
		    ((Class89_Sub1) this).anInt9390 = i_2193_;
		    ((Class89_Sub1) this).anInt9391 = i_2194_;
		    ((Class89_Sub1) this).aBool9392 = false;
		}
		int i_2195_ = i_2086_ << 15 >> 7;
		int i_2196_ = i_2087_ << 15 >> 7;
		int i_2197_ = i_2088_ << 15 >> 7;
		int i_2198_
		    = i_2195_ * -((Class89_Sub1) this).anInt9389 + 8192 >> 14;
		int i_2199_
		    = i_2196_ * -((Class89_Sub1) this).anInt9390 + 8192 >> 14;
		int i_2200_
		    = i_2197_ * -((Class89_Sub1) this).anInt9391 + 8192 >> 14;
		int i_2201_ = i_2198_ + ((Class89_Sub1) this).anInt9389;
		int i_2202_ = i_2199_ + ((Class89_Sub1) this).anInt9390;
		int i_2203_ = i_2200_ + ((Class89_Sub1) this).anInt9391;
		int[] is_2204_ = new int[9];
		is_2204_[0] = i_2195_ * is_2090_[0] + 8192 >> 14;
		is_2204_[1] = i_2195_ * is_2090_[3] + 8192 >> 14;
		is_2204_[2] = i_2195_ * is_2090_[6] + 8192 >> 14;
		is_2204_[3] = i_2196_ * is_2090_[1] + 8192 >> 14;
		is_2204_[4] = i_2196_ * is_2090_[4] + 8192 >> 14;
		is_2204_[5] = i_2196_ * is_2090_[7] + 8192 >> 14;
		is_2204_[6] = i_2197_ * is_2090_[2] + 8192 >> 14;
		is_2204_[7] = i_2197_ * is_2090_[5] + 8192 >> 14;
		is_2204_[8] = i_2197_ * is_2090_[8] + 8192 >> 14;
		int i_2205_ = i_2195_ * i_2189_ + 8192 >> 14;
		int i_2206_ = i_2196_ * i_2190_ + 8192 >> 14;
		int i_2207_ = i_2197_ * i_2191_ + 8192 >> 14;
		i_2205_ += i_2201_;
		i_2206_ += i_2202_;
		i_2207_ += i_2203_;
		int[] is_2208_ = new int[9];
		for (int i_2209_ = 0; i_2209_ < 3; i_2209_++) {
		    for (int i_2210_ = 0; i_2210_ < 3; i_2210_++) {
			int i_2211_ = 0;
			for (int i_2212_ = 0; i_2212_ < 3; i_2212_++)
			    i_2211_ += (is_2090_[i_2209_ * 3 + i_2212_]
					* is_2204_[i_2210_ + i_2212_ * 3]);
			is_2208_[i_2209_ * 3 + i_2210_] = i_2211_ + 8192 >> 14;
		    }
		}
		int i_2213_ = ((is_2090_[0] * i_2205_ + is_2090_[1] * i_2206_
				+ is_2090_[2] * i_2207_ + 8192)
			       >> 14);
		int i_2214_ = ((is_2090_[3] * i_2205_ + is_2090_[4] * i_2206_
				+ is_2090_[5] * i_2207_ + 8192)
			       >> 14);
		int i_2215_ = ((is_2090_[6] * i_2205_ + is_2090_[7] * i_2206_
				+ is_2090_[8] * i_2207_ + 8192)
			       >> 14);
		i_2213_ += i_2186_;
		i_2214_ += i_2187_;
		i_2215_ += i_2188_;
		for (int i_2216_ = 0; i_2216_ < i_2091_; i_2216_++) {
		    int i_2217_ = is[i_2216_];
		    if (i_2217_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_2218_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_2217_]);
			for (int i_2219_ = 0; i_2219_ < is_2218_.length;
			     i_2219_++) {
			    int i_2220_ = is_2218_[i_2219_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_2089_ & (((Class89_Sub1) this)
						.aShortArray9330[i_2220_]))
				    != 0)) {
				int i_2221_
				    = (is_2208_[0] * (((Class89_Sub1) this)
						      .anIntArray9326[i_2220_])
				       + is_2208_[1] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_2220_])
				       + is_2208_[2] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_2220_])
				       + 8192) >> 14;
				int i_2222_
				    = (is_2208_[3] * (((Class89_Sub1) this)
						      .anIntArray9326[i_2220_])
				       + is_2208_[4] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_2220_])
				       + is_2208_[5] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_2220_])
				       + 8192) >> 14;
				int i_2223_
				    = (is_2208_[6] * (((Class89_Sub1) this)
						      .anIntArray9326[i_2220_])
				       + is_2208_[7] * (((Class89_Sub1) this)
							.anIntArray9327
							[i_2220_])
				       + is_2208_[8] * (((Class89_Sub1) this)
							.anIntArray9360
							[i_2220_])
				       + 8192) >> 14;
				i_2221_ += i_2213_;
				i_2222_ += i_2214_;
				i_2223_ += i_2215_;
				((Class89_Sub1) this).anIntArray9326[i_2220_]
				    = i_2221_;
				((Class89_Sub1) this).anIntArray9327[i_2220_]
				    = i_2222_;
				((Class89_Sub1) this).anIntArray9360[i_2220_]
				    = i_2223_;
			    }
			}
		    }
		}
	    } else {
		for (int i_2224_ = 0; i_2224_ < i_2091_; i_2224_++) {
		    int i_2225_ = is[i_2224_];
		    if (i_2225_
			< ((Class89_Sub1) this).anIntArrayArray9329.length) {
			int[] is_2226_ = (((Class89_Sub1) this)
					  .anIntArrayArray9329[i_2225_]);
			for (int i_2227_ = 0; i_2227_ < is_2226_.length;
			     i_2227_++) {
			    int i_2228_ = is_2226_[i_2227_];
			    if (((Class89_Sub1) this).aShortArray9330 == null
				|| ((i_2089_ & (((Class89_Sub1) this)
						.aShortArray9330[i_2228_]))
				    != 0)) {
				((Class89_Sub1) this).anIntArray9326[i_2228_]
				    -= ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_2228_]
				    -= ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_2228_]
				    -= ((Class89_Sub1) this).anInt9391;
				((Class89_Sub1) this).anIntArray9326[i_2228_]
				    = (((Class89_Sub1) this).anIntArray9326
				       [i_2228_]) * i_2086_ >> 7;
				((Class89_Sub1) this).anIntArray9327[i_2228_]
				    = (((Class89_Sub1) this).anIntArray9327
				       [i_2228_]) * i_2087_ >> 7;
				((Class89_Sub1) this).anIntArray9360[i_2228_]
				    = (((Class89_Sub1) this).anIntArray9360
				       [i_2228_]) * i_2088_ >> 7;
				((Class89_Sub1) this).anIntArray9326[i_2228_]
				    += ((Class89_Sub1) this).anInt9389;
				((Class89_Sub1) this).anIntArray9327[i_2228_]
				    += ((Class89_Sub1) this).anInt9390;
				((Class89_Sub1) this).anIntArray9360[i_2228_]
				    += ((Class89_Sub1) this).anInt9391;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_2229_ = false;
		for (int i_2230_ = 0; i_2230_ < i_2091_; i_2230_++) {
		    int i_2231_ = is[i_2230_];
		    if (i_2231_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_2232_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_2231_]);
			for (int i_2233_ = 0; i_2233_ < is_2232_.length;
			     i_2233_++) {
			    int i_2234_ = is_2232_[i_2233_];
			    if (((Class89_Sub1) this).aShortArray9320 == null
				|| ((i_2089_ & (((Class89_Sub1) this)
						.aShortArray9320[i_2234_]))
				    != 0)) {
				int i_2235_ = (((((Class89_Sub1) this)
						 .aByteArray9344[i_2234_])
						& 0xff)
					       + i_2086_ * 8);
				if (i_2235_ < 0)
				    i_2235_ = 0;
				else if (i_2235_ > 255)
				    i_2235_ = 255;
				((Class89_Sub1) this).aByteArray9344[i_2234_]
				    = (byte) i_2235_;
			    }
			}
			bool_2229_ = bool_2229_ | is_2232_.length > 0;
		    }
		}
		if (bool_2229_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_2236_ = 0;
			     i_2236_ < ((Class89_Sub1) this).anInt9375;
			     i_2236_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_2236_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_2236_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & 0xffffff
				   | 255 - ((((Class89_Sub1) this)
					     .aByteArray9344
					     [((Class315) class315).anInt4841])
					    & 0xff) << 24);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null) {
		boolean bool_2237_ = false;
		for (int i_2238_ = 0; i_2238_ < i_2091_; i_2238_++) {
		    int i_2239_ = is[i_2238_];
		    if (i_2239_
			< ((Class89_Sub1) this).anIntArrayArray9337.length) {
			int[] is_2240_ = (((Class89_Sub1) this)
					  .anIntArrayArray9337[i_2239_]);
			for (int i_2241_ = 0; i_2241_ < is_2240_.length;
			     i_2241_++) {
			    int i_2242_ = is_2240_[i_2241_];
			    if (((Class89_Sub1) this).aShortArray9320 == null
				|| ((i_2089_ & (((Class89_Sub1) this)
						.aShortArray9320[i_2242_]))
				    != 0)) {
				int i_2243_ = ((((Class89_Sub1) this)
						.aShortArray9361[i_2242_])
					       & 0xffff);
				int i_2244_ = i_2243_ >> 10 & 0x3f;
				int i_2245_ = i_2243_ >> 7 & 0x7;
				int i_2246_ = i_2243_ & 0x7f;
				i_2244_ = i_2244_ + i_2086_ & 0x3f;
				i_2245_ += i_2087_ / 4;
				if (i_2245_ < 0)
				    i_2245_ = 0;
				else if (i_2245_ > 7)
				    i_2245_ = 7;
				i_2246_ += i_2088_;
				if (i_2246_ < 0)
				    i_2246_ = 0;
				else if (i_2246_ > 127)
				    i_2246_ = 127;
				((Class89_Sub1) this).aShortArray9361[i_2242_]
				    = (short) (i_2244_ << 10 | i_2245_ << 7
					       | i_2246_);
			    }
			}
			bool_2237_ = bool_2237_ | is_2240_.length > 0;
		    }
		}
		if (bool_2237_) {
		    if (((Class89_Sub1) this).aClass315Array9333 != null) {
			for (int i_2247_ = 0;
			     i_2247_ < ((Class89_Sub1) this).anInt9375;
			     i_2247_++) {
			    Class315 class315 = (((Class89_Sub1) this)
						 .aClass315Array9333[i_2247_]);
			    Class381 class381 = (((Class89_Sub1) this)
						 .aClass381Array9379[i_2247_]);
			    ((Class381) class381).anInt5661
				= (((Class381) class381).anInt5661 & ~0xffffff
				   | (Class474.anIntArray6383
				      [((((Class89_Sub1) this).aShortArray9361
					 [((Class315) class315).anInt4841])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15474();
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_2248_ = 0; i_2248_ < i_2091_; i_2248_++) {
		    int i_2249_ = is[i_2248_];
		    if (i_2249_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_2250_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_2249_]);
			for (int i_2251_ = 0; i_2251_ < is_2250_.length;
			     i_2251_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_2250_[i_2251_]]);
			    ((Class381) class381).anInt5664 += i_2086_;
			    ((Class381) class381).anInt5665 += i_2087_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_2252_ = 0; i_2252_ < i_2091_; i_2252_++) {
		    int i_2253_ = is[i_2252_];
		    if (i_2253_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_2254_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_2253_]);
			for (int i_2255_ = 0; i_2255_ < is_2254_.length;
			     i_2255_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_2254_[i_2255_]]);
			    ((Class381) class381).anInt5662
				= (((Class381) class381).anInt5662 * i_2086_
				   >> 7);
			    ((Class381) class381).anInt5663
				= (((Class381) class381).anInt5663 * i_2087_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null) {
		for (int i_2256_ = 0; i_2256_ < i_2091_; i_2256_++) {
		    int i_2257_ = is[i_2256_];
		    if (i_2257_
			< ((Class89_Sub1) this).anIntArrayArray9381.length) {
			int[] is_2258_ = (((Class89_Sub1) this)
					  .anIntArrayArray9381[i_2257_]);
			for (int i_2259_ = 0; i_2259_ < is_2258_.length;
			     i_2259_++) {
			    Class381 class381
				= (((Class89_Sub1) this).aClass381Array9379
				   [is_2258_[i_2259_]]);
			    ((Class381) class381).anInt5666
				= (((Class381) class381).anInt5666 + i_2086_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public void method1949() {
	if (((Class89_Sub1) this).anInt9378 > 0
	    && ((Class89_Sub1) this).anInt9342 > 0) {
	    method15481();
	    method15522();
	    method15489();
	}
    }
    
    public int method1919() {
	if (!((Class89_Sub1) this).aBool9382)
	    method1922();
	return ((Class89_Sub1) this).anInt9370;
    }
    
    short method15496(Class161 class161, int i, int i_2260_, long l,
		      int i_2261_, int i_2262_, int i_2263_, int i_2264_,
		      float f, float f_2265_) {
	int i_2266_ = ((Class89_Sub1) this).anIntArray9374[i];
	int i_2267_ = ((Class89_Sub1) this).anIntArray9374[i + 1];
	int i_2268_ = 0;
	for (int i_2269_ = i_2266_; i_2269_ < i_2267_; i_2269_++) {
	    if (((Class89_Sub1) this).aShortArray9328[i_2269_] == 0) {
		i_2268_ = i_2269_;
		break;
	    }
	    int i_2270_
		= ((((Class89_Sub1) this).aShortArray9328[i_2269_] & 0xffff)
		   - 1);
	    if (((Class89_Sub1) this).aLongArray9372[i_2269_] == l)
		return (short) i_2270_;
	}
	((Class89_Sub1) this).aShortArray9328[i_2268_]
	    = (short) (((Class89_Sub1) this).anInt9378 + 1);
	((Class89_Sub1) this).aLongArray9372[i_2268_] = l;
	((Class89_Sub1) this).aShortArray9355[((Class89_Sub1) this).anInt9378]
	    = (short) i_2260_;
	((Class89_Sub1) this).aShortArray9350[((Class89_Sub1) this).anInt9378]
	    = (short) i;
	((Class89_Sub1) this).aShortArray9334[((Class89_Sub1) this).anInt9378]
	    = (short) i_2261_;
	((Class89_Sub1) this).aShortArray9335[((Class89_Sub1) this).anInt9378]
	    = (short) i_2262_;
	((Class89_Sub1) this).aShortArray9371[((Class89_Sub1) this).anInt9378]
	    = (short) i_2263_;
	((Class89_Sub1) this).aByteArray9362[((Class89_Sub1) this).anInt9378]
	    = (byte) i_2264_;
	((Class89_Sub1) this).aFloatArray9338[((Class89_Sub1) this).anInt9378]
	    = f;
	((Class89_Sub1) this).aFloatArray9339[((Class89_Sub1) this).anInt9378]
	    = f_2265_;
	return (short) ((Class89_Sub1) this).anInt9378++;
    }
    
    short method15497(Class161 class161, int i, int i_2271_, long l,
		      int i_2272_, int i_2273_, int i_2274_, int i_2275_,
		      float f, float f_2276_) {
	int i_2277_ = ((Class89_Sub1) this).anIntArray9374[i];
	int i_2278_ = ((Class89_Sub1) this).anIntArray9374[i + 1];
	int i_2279_ = 0;
	for (int i_2280_ = i_2277_; i_2280_ < i_2278_; i_2280_++) {
	    if (((Class89_Sub1) this).aShortArray9328[i_2280_] == 0) {
		i_2279_ = i_2280_;
		break;
	    }
	    int i_2281_
		= ((((Class89_Sub1) this).aShortArray9328[i_2280_] & 0xffff)
		   - 1);
	    if (((Class89_Sub1) this).aLongArray9372[i_2280_] == l)
		return (short) i_2281_;
	}
	((Class89_Sub1) this).aShortArray9328[i_2279_]
	    = (short) (((Class89_Sub1) this).anInt9378 + 1);
	((Class89_Sub1) this).aLongArray9372[i_2279_] = l;
	((Class89_Sub1) this).aShortArray9355[((Class89_Sub1) this).anInt9378]
	    = (short) i_2271_;
	((Class89_Sub1) this).aShortArray9350[((Class89_Sub1) this).anInt9378]
	    = (short) i;
	((Class89_Sub1) this).aShortArray9334[((Class89_Sub1) this).anInt9378]
	    = (short) i_2272_;
	((Class89_Sub1) this).aShortArray9335[((Class89_Sub1) this).anInt9378]
	    = (short) i_2273_;
	((Class89_Sub1) this).aShortArray9371[((Class89_Sub1) this).anInt9378]
	    = (short) i_2274_;
	((Class89_Sub1) this).aByteArray9362[((Class89_Sub1) this).anInt9378]
	    = (byte) i_2275_;
	((Class89_Sub1) this).aFloatArray9338[((Class89_Sub1) this).anInt9378]
	    = f;
	((Class89_Sub1) this).aFloatArray9339[((Class89_Sub1) this).anInt9378]
	    = f_2276_;
	return (short) ((Class89_Sub1) this).anInt9378++;
    }
    
    short method15498(Class161 class161, int i, int i_2282_, long l,
		      int i_2283_, int i_2284_, int i_2285_, int i_2286_,
		      float f, float f_2287_) {
	int i_2288_ = ((Class89_Sub1) this).anIntArray9374[i];
	int i_2289_ = ((Class89_Sub1) this).anIntArray9374[i + 1];
	int i_2290_ = 0;
	for (int i_2291_ = i_2288_; i_2291_ < i_2289_; i_2291_++) {
	    if (((Class89_Sub1) this).aShortArray9328[i_2291_] == 0) {
		i_2290_ = i_2291_;
		break;
	    }
	    int i_2292_
		= ((((Class89_Sub1) this).aShortArray9328[i_2291_] & 0xffff)
		   - 1);
	    if (((Class89_Sub1) this).aLongArray9372[i_2291_] == l)
		return (short) i_2292_;
	}
	((Class89_Sub1) this).aShortArray9328[i_2290_]
	    = (short) (((Class89_Sub1) this).anInt9378 + 1);
	((Class89_Sub1) this).aLongArray9372[i_2290_] = l;
	((Class89_Sub1) this).aShortArray9355[((Class89_Sub1) this).anInt9378]
	    = (short) i_2282_;
	((Class89_Sub1) this).aShortArray9350[((Class89_Sub1) this).anInt9378]
	    = (short) i;
	((Class89_Sub1) this).aShortArray9334[((Class89_Sub1) this).anInt9378]
	    = (short) i_2283_;
	((Class89_Sub1) this).aShortArray9335[((Class89_Sub1) this).anInt9378]
	    = (short) i_2284_;
	((Class89_Sub1) this).aShortArray9371[((Class89_Sub1) this).anInt9378]
	    = (short) i_2285_;
	((Class89_Sub1) this).aByteArray9362[((Class89_Sub1) this).anInt9378]
	    = (byte) i_2286_;
	((Class89_Sub1) this).aFloatArray9338[((Class89_Sub1) this).anInt9378]
	    = f;
	((Class89_Sub1) this).aFloatArray9339[((Class89_Sub1) this).anInt9378]
	    = f_2287_;
	return (short) ((Class89_Sub1) this).anInt9378++;
    }
    
    public int method1986() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9364;
    }
    
    short method15499(Class161 class161, int i, int i_2293_, long l,
		      int i_2294_, int i_2295_, int i_2296_, int i_2297_,
		      float f, float f_2298_) {
	int i_2299_ = ((Class89_Sub1) this).anIntArray9374[i];
	int i_2300_ = ((Class89_Sub1) this).anIntArray9374[i + 1];
	int i_2301_ = 0;
	for (int i_2302_ = i_2299_; i_2302_ < i_2300_; i_2302_++) {
	    if (((Class89_Sub1) this).aShortArray9328[i_2302_] == 0) {
		i_2301_ = i_2302_;
		break;
	    }
	    int i_2303_
		= ((((Class89_Sub1) this).aShortArray9328[i_2302_] & 0xffff)
		   - 1);
	    if (((Class89_Sub1) this).aLongArray9372[i_2302_] == l)
		return (short) i_2303_;
	}
	((Class89_Sub1) this).aShortArray9328[i_2301_]
	    = (short) (((Class89_Sub1) this).anInt9378 + 1);
	((Class89_Sub1) this).aLongArray9372[i_2301_] = l;
	((Class89_Sub1) this).aShortArray9355[((Class89_Sub1) this).anInt9378]
	    = (short) i_2293_;
	((Class89_Sub1) this).aShortArray9350[((Class89_Sub1) this).anInt9378]
	    = (short) i;
	((Class89_Sub1) this).aShortArray9334[((Class89_Sub1) this).anInt9378]
	    = (short) i_2294_;
	((Class89_Sub1) this).aShortArray9335[((Class89_Sub1) this).anInt9378]
	    = (short) i_2295_;
	((Class89_Sub1) this).aShortArray9371[((Class89_Sub1) this).anInt9378]
	    = (short) i_2296_;
	((Class89_Sub1) this).aByteArray9362[((Class89_Sub1) this).anInt9378]
	    = (byte) i_2297_;
	((Class89_Sub1) this).aFloatArray9338[((Class89_Sub1) this).anInt9378]
	    = f;
	((Class89_Sub1) this).aFloatArray9339[((Class89_Sub1) this).anInt9378]
	    = f_2298_;
	return (short) ((Class89_Sub1) this).anInt9378++;
    }
    
    static float[] method15500(float[] fs, int i) {
	float[] fs_2304_ = new float[i];
	System.arraycopy(fs, 0, fs_2304_, 0, i);
	return fs_2304_;
    }
    
    Class89 method15501(Class89_Sub1 class89_sub1_2305_,
			Class89_Sub1 class89_sub1_2306_, int i, boolean bool,
			boolean bool_2307_) {
	((Class89_Sub1) class89_sub1_2305_).anInt9367 = i;
	((Class89_Sub1) class89_sub1_2305_).anInt9321
	    = ((Class89_Sub1) this).anInt9321;
	((Class89_Sub1) class89_sub1_2305_).aShort9322
	    = ((Class89_Sub1) this).aShort9322;
	((Class89_Sub1) class89_sub1_2305_).aShort9383
	    = ((Class89_Sub1) this).aShort9383;
	((Class89_Sub1) class89_sub1_2305_).anInt9324
	    = ((Class89_Sub1) this).anInt9324;
	((Class89_Sub1) class89_sub1_2305_).anInt9325
	    = ((Class89_Sub1) this).anInt9325;
	((Class89_Sub1) class89_sub1_2305_).anInt9378
	    = ((Class89_Sub1) this).anInt9378;
	((Class89_Sub1) class89_sub1_2305_).anInt9331
	    = ((Class89_Sub1) this).anInt9331;
	((Class89_Sub1) class89_sub1_2305_).anInt9342
	    = ((Class89_Sub1) this).anInt9342;
	((Class89_Sub1) class89_sub1_2305_).anInt9375
	    = ((Class89_Sub1) this).anInt9375;
	if ((i & 0x100) != 0)
	    ((Class89_Sub1) class89_sub1_2305_).aBool9358 = true;
	else
	    ((Class89_Sub1) class89_sub1_2305_).aBool9358
		= ((Class89_Sub1) this).aBool9358;
	((Class89_Sub1) class89_sub1_2305_).aBool9369
	    = ((Class89_Sub1) this).aBool9369;
	boolean bool_2308_
	    = Class377.method6728(i, ((Class89_Sub1) this).anInt9321);
	boolean bool_2309_
	    = Class377.method6729(i, ((Class89_Sub1) this).anInt9321);
	boolean bool_2310_
	    = Class377.method6730(i, ((Class89_Sub1) this).anInt9321);
	boolean bool_2311_ = bool_2308_ | bool_2309_ | bool_2310_;
	if (bool_2311_) {
	    if (bool_2308_) {
		if (((Class89_Sub1) class89_sub1_2306_).anIntArray9326 == null
		    || ((((Class89_Sub1) class89_sub1_2306_)
			 .anIntArray9326).length
			< ((Class89_Sub1) this).anInt9324))
		    ((Class89_Sub1) class89_sub1_2305_).anIntArray9326
			= ((Class89_Sub1) class89_sub1_2306_).anIntArray9326
			= new int[((Class89_Sub1) this).anInt9324];
		else
		    ((Class89_Sub1) class89_sub1_2305_).anIntArray9326
			= ((Class89_Sub1) class89_sub1_2306_).anIntArray9326;
	    } else
		((Class89_Sub1) class89_sub1_2305_).anIntArray9326
		    = ((Class89_Sub1) this).anIntArray9326;
	    if (bool_2309_) {
		if (((Class89_Sub1) class89_sub1_2306_).anIntArray9327 == null
		    || ((((Class89_Sub1) class89_sub1_2306_)
			 .anIntArray9327).length
			< ((Class89_Sub1) this).anInt9324))
		    ((Class89_Sub1) class89_sub1_2305_).anIntArray9327
			= ((Class89_Sub1) class89_sub1_2306_).anIntArray9327
			= new int[((Class89_Sub1) this).anInt9324];
		else
		    ((Class89_Sub1) class89_sub1_2305_).anIntArray9327
			= ((Class89_Sub1) class89_sub1_2306_).anIntArray9327;
	    } else
		((Class89_Sub1) class89_sub1_2305_).anIntArray9327
		    = ((Class89_Sub1) this).anIntArray9327;
	    if (bool_2310_) {
		if (((Class89_Sub1) class89_sub1_2306_).anIntArray9360 == null
		    || ((((Class89_Sub1) class89_sub1_2306_)
			 .anIntArray9360).length
			< ((Class89_Sub1) this).anInt9324))
		    ((Class89_Sub1) class89_sub1_2305_).anIntArray9360
			= ((Class89_Sub1) class89_sub1_2306_).anIntArray9360
			= new int[((Class89_Sub1) this).anInt9324];
		else
		    ((Class89_Sub1) class89_sub1_2305_).anIntArray9360
			= ((Class89_Sub1) class89_sub1_2306_).anIntArray9360;
	    } else
		((Class89_Sub1) class89_sub1_2305_).anIntArray9360
		    = ((Class89_Sub1) this).anIntArray9360;
	    for (int i_2312_ = 0; i_2312_ < ((Class89_Sub1) this).anInt9324;
		 i_2312_++) {
		if (bool_2308_)
		    ((Class89_Sub1) class89_sub1_2305_).anIntArray9326[i_2312_]
			= ((Class89_Sub1) this).anIntArray9326[i_2312_];
		if (bool_2309_)
		    ((Class89_Sub1) class89_sub1_2305_).anIntArray9327[i_2312_]
			= ((Class89_Sub1) this).anIntArray9327[i_2312_];
		if (bool_2310_)
		    ((Class89_Sub1) class89_sub1_2305_).anIntArray9360[i_2312_]
			= ((Class89_Sub1) this).anIntArray9360[i_2312_];
	    }
	} else {
	    ((Class89_Sub1) class89_sub1_2305_).anIntArray9326
		= ((Class89_Sub1) this).anIntArray9326;
	    ((Class89_Sub1) class89_sub1_2305_).anIntArray9327
		= ((Class89_Sub1) this).anIntArray9327;
	    ((Class89_Sub1) class89_sub1_2305_).anIntArray9360
		= ((Class89_Sub1) this).anIntArray9360;
	}
	if (Class377.method6744(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9352
		= ((Class89_Sub1) class89_sub1_2306_).aClass311_9352;
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9352)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9352)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9352)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9352)
		.aBool4827
		= true;
	} else if (Class377.method6740(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9352
		= ((Class89_Sub1) this).aClass311_9352;
	else
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9352 = null;
	if (Class377.method6737(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2306_).aShortArray9361 == null
		|| (((Class89_Sub1) class89_sub1_2306_).aShortArray9361.length
		    < ((Class89_Sub1) this).anInt9331))
		((Class89_Sub1) class89_sub1_2305_).aShortArray9361
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9361
		    = new short[((Class89_Sub1) this).anInt9331];
	    else
		((Class89_Sub1) class89_sub1_2305_).aShortArray9361
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9361;
	    for (int i_2313_ = 0; i_2313_ < ((Class89_Sub1) this).anInt9331;
		 i_2313_++)
		((Class89_Sub1) class89_sub1_2305_).aShortArray9361[i_2313_]
		    = ((Class89_Sub1) this).aShortArray9361[i_2313_];
	} else
	    ((Class89_Sub1) class89_sub1_2305_).aShortArray9361
		= ((Class89_Sub1) this).aShortArray9361;
	if (Class377.method6820(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2306_).aByteArray9344 == null
		|| (((Class89_Sub1) class89_sub1_2306_).aByteArray9344.length
		    < ((Class89_Sub1) this).anInt9331))
		((Class89_Sub1) class89_sub1_2305_).aByteArray9344
		    = ((Class89_Sub1) class89_sub1_2306_).aByteArray9344
		    = new byte[((Class89_Sub1) this).anInt9331];
	    else
		((Class89_Sub1) class89_sub1_2305_).aByteArray9344
		    = ((Class89_Sub1) class89_sub1_2306_).aByteArray9344;
	    for (int i_2314_ = 0; i_2314_ < ((Class89_Sub1) this).anInt9331;
		 i_2314_++)
		((Class89_Sub1) class89_sub1_2305_).aByteArray9344[i_2314_]
		    = ((Class89_Sub1) this).aByteArray9344[i_2314_];
	} else
	    ((Class89_Sub1) class89_sub1_2305_).aByteArray9344
		= ((Class89_Sub1) this).aByteArray9344;
	if (Class377.method6789(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9353
		= ((Class89_Sub1) class89_sub1_2306_).aClass311_9353;
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9353)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9353)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9353)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9353)
		.aBool4827
		= true;
	} else if (Class377.method6742(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9353
		= ((Class89_Sub1) this).aClass311_9353;
	else
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9353 = null;
	if (Class377.method6793(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2306_).aShortArray9334 == null
		|| (((Class89_Sub1) class89_sub1_2306_).aShortArray9334.length
		    < ((Class89_Sub1) this).anInt9378)) {
		int i_2315_ = ((Class89_Sub1) this).anInt9378;
		((Class89_Sub1) class89_sub1_2305_).aShortArray9334
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9334
		    = new short[i_2315_];
		((Class89_Sub1) class89_sub1_2305_).aShortArray9335
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9335
		    = new short[i_2315_];
		((Class89_Sub1) class89_sub1_2305_).aShortArray9371
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9371
		    = new short[i_2315_];
	    } else {
		((Class89_Sub1) class89_sub1_2305_).aShortArray9334
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9334;
		((Class89_Sub1) class89_sub1_2305_).aShortArray9335
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9335;
		((Class89_Sub1) class89_sub1_2305_).aShortArray9371
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9371;
	    }
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		if (((Class89_Sub1) class89_sub1_2306_).aClass307_9340 == null)
		    ((Class89_Sub1) class89_sub1_2306_).aClass307_9340
			= new Class307();
		Class307 class307
		    = (((Class89_Sub1) class89_sub1_2305_).aClass307_9340
		       = ((Class89_Sub1) class89_sub1_2306_).aClass307_9340);
		if (((Class307) class307).aShortArray4811 == null
		    || (((Class307) class307).aShortArray4811.length
			< ((Class89_Sub1) this).anInt9378)) {
		    int i_2316_ = ((Class89_Sub1) this).anInt9378;
		    ((Class307) class307).aShortArray4811 = new short[i_2316_];
		    ((Class307) class307).aShortArray4813 = new short[i_2316_];
		    ((Class307) class307).aShortArray4812 = new short[i_2316_];
		    ((Class307) class307).aByteArray4814 = new byte[i_2316_];
		}
		for (int i_2317_ = 0;
		     i_2317_ < ((Class89_Sub1) this).anInt9378; i_2317_++) {
		    ((Class89_Sub1) class89_sub1_2305_).aShortArray9334
			[i_2317_]
			= ((Class89_Sub1) this).aShortArray9334[i_2317_];
		    ((Class89_Sub1) class89_sub1_2305_).aShortArray9335
			[i_2317_]
			= ((Class89_Sub1) this).aShortArray9335[i_2317_];
		    ((Class89_Sub1) class89_sub1_2305_).aShortArray9371
			[i_2317_]
			= ((Class89_Sub1) this).aShortArray9371[i_2317_];
		    ((Class307) class307).aShortArray4811[i_2317_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4811[i_2317_]);
		    ((Class307) class307).aShortArray4813[i_2317_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4813[i_2317_]);
		    ((Class307) class307).aShortArray4812[i_2317_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4812[i_2317_]);
		    ((Class307) class307).aByteArray4814[i_2317_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aByteArray4814[i_2317_]);
		}
	    } else {
		((Class89_Sub1) class89_sub1_2305_).aClass307_9340 = null;
		for (int i_2318_ = 0;
		     i_2318_ < ((Class89_Sub1) this).anInt9378; i_2318_++) {
		    ((Class89_Sub1) class89_sub1_2305_).aShortArray9334
			[i_2318_]
			= ((Class89_Sub1) this).aShortArray9334[i_2318_];
		    ((Class89_Sub1) class89_sub1_2305_).aShortArray9335
			[i_2318_]
			= ((Class89_Sub1) this).aShortArray9335[i_2318_];
		    ((Class89_Sub1) class89_sub1_2305_).aShortArray9371
			[i_2318_]
			= ((Class89_Sub1) this).aShortArray9371[i_2318_];
		}
	    }
	    ((Class89_Sub1) class89_sub1_2305_).aByteArray9362
		= ((Class89_Sub1) this).aByteArray9362;
	} else {
	    ((Class89_Sub1) class89_sub1_2305_).aClass307_9340
		= ((Class89_Sub1) this).aClass307_9340;
	    ((Class89_Sub1) class89_sub1_2305_).aShortArray9334
		= ((Class89_Sub1) this).aShortArray9334;
	    ((Class89_Sub1) class89_sub1_2305_).aShortArray9335
		= ((Class89_Sub1) this).aShortArray9335;
	    ((Class89_Sub1) class89_sub1_2305_).aShortArray9371
		= ((Class89_Sub1) this).aShortArray9371;
	    ((Class89_Sub1) class89_sub1_2305_).aByteArray9362
		= ((Class89_Sub1) this).aByteArray9362;
	}
	if (Class377.method6792(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9354
		= ((Class89_Sub1) class89_sub1_2306_).aClass311_9354;
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9354)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9354)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9354)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9354)
		.aBool4827
		= true;
	} else if (Class377.method6741(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9354
		= ((Class89_Sub1) this).aClass311_9354;
	else
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9354 = null;
	if (Class377.method6735(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2306_).aFloatArray9338 == null
		|| (((Class89_Sub1) class89_sub1_2306_).aFloatArray9338.length
		    < ((Class89_Sub1) this).anInt9331)) {
		int i_2319_ = ((Class89_Sub1) this).anInt9378;
		((Class89_Sub1) class89_sub1_2305_).aFloatArray9338
		    = ((Class89_Sub1) class89_sub1_2306_).aFloatArray9338
		    = new float[i_2319_];
		((Class89_Sub1) class89_sub1_2305_).aFloatArray9339
		    = ((Class89_Sub1) class89_sub1_2306_).aFloatArray9339
		    = new float[i_2319_];
	    } else {
		((Class89_Sub1) class89_sub1_2305_).aFloatArray9338
		    = ((Class89_Sub1) class89_sub1_2306_).aFloatArray9338;
		((Class89_Sub1) class89_sub1_2305_).aFloatArray9339
		    = ((Class89_Sub1) class89_sub1_2306_).aFloatArray9339;
	    }
	    for (int i_2320_ = 0; i_2320_ < ((Class89_Sub1) this).anInt9378;
		 i_2320_++) {
		((Class89_Sub1) class89_sub1_2305_).aFloatArray9338[i_2320_]
		    = ((Class89_Sub1) this).aFloatArray9338[i_2320_];
		((Class89_Sub1) class89_sub1_2305_).aFloatArray9339[i_2320_]
		    = ((Class89_Sub1) this).aFloatArray9339[i_2320_];
	    }
	} else {
	    ((Class89_Sub1) class89_sub1_2305_).aFloatArray9338
		= ((Class89_Sub1) this).aFloatArray9338;
	    ((Class89_Sub1) class89_sub1_2305_).aFloatArray9339
		= ((Class89_Sub1) this).aFloatArray9339;
	}
	if (Class377.method6747(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9341
		= ((Class89_Sub1) class89_sub1_2306_).aClass311_9341;
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9341)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9341)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9341)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_2305_).aClass311_9341)
		.aBool4827
		= true;
	} else if (Class377.method6743(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9341
		= ((Class89_Sub1) this).aClass311_9341;
	else
	    ((Class89_Sub1) class89_sub1_2305_).aClass311_9341 = null;
	if (Class377.method6736(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2306_).aShortArray9345 == null
		|| (((Class89_Sub1) class89_sub1_2306_).aShortArray9345.length
		    < ((Class89_Sub1) this).anInt9331)) {
		int i_2321_ = ((Class89_Sub1) this).anInt9331;
		((Class89_Sub1) class89_sub1_2305_).aShortArray9345
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9345
		    = new short[i_2321_];
		((Class89_Sub1) class89_sub1_2305_).aShortArray9346
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9346
		    = new short[i_2321_];
		((Class89_Sub1) class89_sub1_2305_).aShortArray9368
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9368
		    = new short[i_2321_];
	    } else {
		((Class89_Sub1) class89_sub1_2305_).aShortArray9345
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9345;
		((Class89_Sub1) class89_sub1_2305_).aShortArray9346
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9346;
		((Class89_Sub1) class89_sub1_2305_).aShortArray9368
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9368;
	    }
	    for (int i_2322_ = 0; i_2322_ < ((Class89_Sub1) this).anInt9331;
		 i_2322_++) {
		((Class89_Sub1) class89_sub1_2305_).aShortArray9345[i_2322_]
		    = ((Class89_Sub1) this).aShortArray9345[i_2322_];
		((Class89_Sub1) class89_sub1_2305_).aShortArray9346[i_2322_]
		    = ((Class89_Sub1) this).aShortArray9346[i_2322_];
		((Class89_Sub1) class89_sub1_2305_).aShortArray9368[i_2322_]
		    = ((Class89_Sub1) this).aShortArray9368[i_2322_];
	    }
	} else {
	    ((Class89_Sub1) class89_sub1_2305_).aShortArray9345
		= ((Class89_Sub1) this).aShortArray9345;
	    ((Class89_Sub1) class89_sub1_2305_).aShortArray9346
		= ((Class89_Sub1) this).aShortArray9346;
	    ((Class89_Sub1) class89_sub1_2305_).aShortArray9368
		= ((Class89_Sub1) this).aShortArray9368;
	}
	if (Class377.method6748(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_2305_).aClass386_9351
		= ((Class89_Sub1) class89_sub1_2306_).aClass386_9351;
	    ((Class386) ((Class89_Sub1) class89_sub1_2305_).aClass386_9351)
		.anInterface33_5708
		= (((Class386) ((Class89_Sub1) this).aClass386_9351)
		   .anInterface33_5708);
	    ((Class386) ((Class89_Sub1) class89_sub1_2305_).aClass386_9351)
		.aBool5707
		= ((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707;
	    ((Class386) ((Class89_Sub1) class89_sub1_2305_).aClass386_9351)
		.aBool5709
		= true;
	} else if (Class377.method6790(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_2305_).aClass386_9351
		= ((Class89_Sub1) this).aClass386_9351;
	else
	    ((Class89_Sub1) class89_sub1_2305_).aClass386_9351 = null;
	if (Class377.method6769(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2306_).aShortArray9348 == null
		|| (((Class89_Sub1) class89_sub1_2306_).aShortArray9348.length
		    < ((Class89_Sub1) this).anInt9331)) {
		int i_2323_ = ((Class89_Sub1) this).anInt9331;
		((Class89_Sub1) class89_sub1_2305_).aShortArray9348
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9348
		    = new short[i_2323_];
	    } else
		((Class89_Sub1) class89_sub1_2305_).aShortArray9348
		    = ((Class89_Sub1) class89_sub1_2306_).aShortArray9348;
	    for (int i_2324_ = 0; i_2324_ < ((Class89_Sub1) this).anInt9331;
		 i_2324_++)
		((Class89_Sub1) class89_sub1_2305_).aShortArray9348[i_2324_]
		    = ((Class89_Sub1) this).aShortArray9348[i_2324_];
	} else
	    ((Class89_Sub1) class89_sub1_2305_).aShortArray9348
		= ((Class89_Sub1) this).aShortArray9348;
	if (Class377.method6738(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2306_).aClass381Array9379 == null
		|| ((((Class89_Sub1) class89_sub1_2306_)
		     .aClass381Array9379).length
		    < ((Class89_Sub1) this).anInt9375)) {
		int i_2325_ = ((Class89_Sub1) this).anInt9375;
		((Class89_Sub1) class89_sub1_2305_).aClass381Array9379
		    = ((Class89_Sub1) class89_sub1_2306_).aClass381Array9379
		    = new Class381[i_2325_];
		for (int i_2326_ = 0;
		     i_2326_ < ((Class89_Sub1) this).anInt9375; i_2326_++)
		    ((Class89_Sub1) class89_sub1_2305_).aClass381Array9379
			[i_2326_]
			= ((Class89_Sub1) this).aClass381Array9379[i_2326_]
			      .method6885();
	    } else {
		((Class89_Sub1) class89_sub1_2305_).aClass381Array9379
		    = ((Class89_Sub1) class89_sub1_2306_).aClass381Array9379;
		for (int i_2327_ = 0;
		     i_2327_ < ((Class89_Sub1) this).anInt9375; i_2327_++)
		    ((Class89_Sub1) class89_sub1_2305_).aClass381Array9379
			[i_2327_].method6886
			(((Class89_Sub1) this).aClass381Array9379[i_2327_]);
	    }
	} else
	    ((Class89_Sub1) class89_sub1_2305_).aClass381Array9379
		= ((Class89_Sub1) this).aClass381Array9379;
	((Class89_Sub1) class89_sub1_2305_).aClass315Array9333
	    = ((Class89_Sub1) this).aClass315Array9333;
	if (((Class89_Sub1) this).aBool9323) {
	    ((Class89_Sub1) class89_sub1_2305_).anInt9380
		= ((Class89_Sub1) this).anInt9380;
	    ((Class89_Sub1) class89_sub1_2305_).anInt9336
		= ((Class89_Sub1) this).anInt9336;
	    ((Class89_Sub1) class89_sub1_2305_).anInt9365
		= ((Class89_Sub1) this).anInt9365;
	    ((Class89_Sub1) class89_sub1_2305_).anInt9366
		= ((Class89_Sub1) this).anInt9366;
	    ((Class89_Sub1) class89_sub1_2305_).anInt9363
		= ((Class89_Sub1) this).anInt9363;
	    ((Class89_Sub1) class89_sub1_2305_).anInt9364
		= ((Class89_Sub1) this).anInt9364;
	    ((Class89_Sub1) class89_sub1_2305_).anInt9332
		= ((Class89_Sub1) this).anInt9332;
	    ((Class89_Sub1) class89_sub1_2305_).anInt9359
		= ((Class89_Sub1) this).anInt9359;
	    ((Class89_Sub1) class89_sub1_2305_).aBool9323 = true;
	} else
	    ((Class89_Sub1) class89_sub1_2305_).aBool9323 = false;
	if (((Class89_Sub1) this).aBool9382) {
	    ((Class89_Sub1) class89_sub1_2305_).anInt9370
		= ((Class89_Sub1) this).anInt9370;
	    ((Class89_Sub1) class89_sub1_2305_).aBool9382 = true;
	} else
	    ((Class89_Sub1) class89_sub1_2305_).aBool9382 = false;
	((Class89_Sub1) class89_sub1_2305_).anIntArrayArray9329
	    = ((Class89_Sub1) this).anIntArrayArray9329;
	((Class89_Sub1) class89_sub1_2305_).anIntArrayArray9337
	    = ((Class89_Sub1) this).anIntArrayArray9337;
	((Class89_Sub1) class89_sub1_2305_).anIntArrayArray9381
	    = ((Class89_Sub1) this).anIntArrayArray9381;
	((Class89_Sub1) class89_sub1_2305_).aShortArray9328
	    = ((Class89_Sub1) this).aShortArray9328;
	((Class89_Sub1) class89_sub1_2305_).anIntArray9374
	    = ((Class89_Sub1) this).anIntArray9374;
	((Class89_Sub1) class89_sub1_2305_).aShortArray9350
	    = ((Class89_Sub1) this).aShortArray9350;
	((Class89_Sub1) class89_sub1_2305_).aShortArray9355
	    = ((Class89_Sub1) this).aShortArray9355;
	((Class89_Sub1) class89_sub1_2305_).aShortArray9330
	    = ((Class89_Sub1) this).aShortArray9330;
	((Class89_Sub1) class89_sub1_2305_).aShortArray9320
	    = ((Class89_Sub1) this).aShortArray9320;
	((Class89_Sub1) class89_sub1_2305_).anIntArray9347
	    = ((Class89_Sub1) this).anIntArray9347;
	((Class89_Sub1) class89_sub1_2305_).anIntArray9373
	    = ((Class89_Sub1) this).anIntArray9373;
	((Class89_Sub1) class89_sub1_2305_).anIntArray9386
	    = ((Class89_Sub1) this).anIntArray9386;
	((Class89_Sub1) class89_sub1_2305_).aClass106Array9376
	    = ((Class89_Sub1) this).aClass106Array9376;
	((Class89_Sub1) class89_sub1_2305_).aClass167Array9377
	    = ((Class89_Sub1) this).aClass167Array9377;
	return class89_sub1_2305_;
    }
    
    Class89 method15502(Class89_Sub1 class89_sub1_2328_,
			Class89_Sub1 class89_sub1_2329_, int i, boolean bool,
			boolean bool_2330_) {
	((Class89_Sub1) class89_sub1_2328_).anInt9367 = i;
	((Class89_Sub1) class89_sub1_2328_).anInt9321
	    = ((Class89_Sub1) this).anInt9321;
	((Class89_Sub1) class89_sub1_2328_).aShort9322
	    = ((Class89_Sub1) this).aShort9322;
	((Class89_Sub1) class89_sub1_2328_).aShort9383
	    = ((Class89_Sub1) this).aShort9383;
	((Class89_Sub1) class89_sub1_2328_).anInt9324
	    = ((Class89_Sub1) this).anInt9324;
	((Class89_Sub1) class89_sub1_2328_).anInt9325
	    = ((Class89_Sub1) this).anInt9325;
	((Class89_Sub1) class89_sub1_2328_).anInt9378
	    = ((Class89_Sub1) this).anInt9378;
	((Class89_Sub1) class89_sub1_2328_).anInt9331
	    = ((Class89_Sub1) this).anInt9331;
	((Class89_Sub1) class89_sub1_2328_).anInt9342
	    = ((Class89_Sub1) this).anInt9342;
	((Class89_Sub1) class89_sub1_2328_).anInt9375
	    = ((Class89_Sub1) this).anInt9375;
	if ((i & 0x100) != 0)
	    ((Class89_Sub1) class89_sub1_2328_).aBool9358 = true;
	else
	    ((Class89_Sub1) class89_sub1_2328_).aBool9358
		= ((Class89_Sub1) this).aBool9358;
	((Class89_Sub1) class89_sub1_2328_).aBool9369
	    = ((Class89_Sub1) this).aBool9369;
	boolean bool_2331_
	    = Class377.method6728(i, ((Class89_Sub1) this).anInt9321);
	boolean bool_2332_
	    = Class377.method6729(i, ((Class89_Sub1) this).anInt9321);
	boolean bool_2333_
	    = Class377.method6730(i, ((Class89_Sub1) this).anInt9321);
	boolean bool_2334_ = bool_2331_ | bool_2332_ | bool_2333_;
	if (bool_2334_) {
	    if (bool_2331_) {
		if (((Class89_Sub1) class89_sub1_2329_).anIntArray9326 == null
		    || ((((Class89_Sub1) class89_sub1_2329_)
			 .anIntArray9326).length
			< ((Class89_Sub1) this).anInt9324))
		    ((Class89_Sub1) class89_sub1_2328_).anIntArray9326
			= ((Class89_Sub1) class89_sub1_2329_).anIntArray9326
			= new int[((Class89_Sub1) this).anInt9324];
		else
		    ((Class89_Sub1) class89_sub1_2328_).anIntArray9326
			= ((Class89_Sub1) class89_sub1_2329_).anIntArray9326;
	    } else
		((Class89_Sub1) class89_sub1_2328_).anIntArray9326
		    = ((Class89_Sub1) this).anIntArray9326;
	    if (bool_2332_) {
		if (((Class89_Sub1) class89_sub1_2329_).anIntArray9327 == null
		    || ((((Class89_Sub1) class89_sub1_2329_)
			 .anIntArray9327).length
			< ((Class89_Sub1) this).anInt9324))
		    ((Class89_Sub1) class89_sub1_2328_).anIntArray9327
			= ((Class89_Sub1) class89_sub1_2329_).anIntArray9327
			= new int[((Class89_Sub1) this).anInt9324];
		else
		    ((Class89_Sub1) class89_sub1_2328_).anIntArray9327
			= ((Class89_Sub1) class89_sub1_2329_).anIntArray9327;
	    } else
		((Class89_Sub1) class89_sub1_2328_).anIntArray9327
		    = ((Class89_Sub1) this).anIntArray9327;
	    if (bool_2333_) {
		if (((Class89_Sub1) class89_sub1_2329_).anIntArray9360 == null
		    || ((((Class89_Sub1) class89_sub1_2329_)
			 .anIntArray9360).length
			< ((Class89_Sub1) this).anInt9324))
		    ((Class89_Sub1) class89_sub1_2328_).anIntArray9360
			= ((Class89_Sub1) class89_sub1_2329_).anIntArray9360
			= new int[((Class89_Sub1) this).anInt9324];
		else
		    ((Class89_Sub1) class89_sub1_2328_).anIntArray9360
			= ((Class89_Sub1) class89_sub1_2329_).anIntArray9360;
	    } else
		((Class89_Sub1) class89_sub1_2328_).anIntArray9360
		    = ((Class89_Sub1) this).anIntArray9360;
	    for (int i_2335_ = 0; i_2335_ < ((Class89_Sub1) this).anInt9324;
		 i_2335_++) {
		if (bool_2331_)
		    ((Class89_Sub1) class89_sub1_2328_).anIntArray9326[i_2335_]
			= ((Class89_Sub1) this).anIntArray9326[i_2335_];
		if (bool_2332_)
		    ((Class89_Sub1) class89_sub1_2328_).anIntArray9327[i_2335_]
			= ((Class89_Sub1) this).anIntArray9327[i_2335_];
		if (bool_2333_)
		    ((Class89_Sub1) class89_sub1_2328_).anIntArray9360[i_2335_]
			= ((Class89_Sub1) this).anIntArray9360[i_2335_];
	    }
	} else {
	    ((Class89_Sub1) class89_sub1_2328_).anIntArray9326
		= ((Class89_Sub1) this).anIntArray9326;
	    ((Class89_Sub1) class89_sub1_2328_).anIntArray9327
		= ((Class89_Sub1) this).anIntArray9327;
	    ((Class89_Sub1) class89_sub1_2328_).anIntArray9360
		= ((Class89_Sub1) this).anIntArray9360;
	}
	if (Class377.method6744(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9352
		= ((Class89_Sub1) class89_sub1_2329_).aClass311_9352;
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9352)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9352)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9352)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9352)
		.aBool4827
		= true;
	} else if (Class377.method6740(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9352
		= ((Class89_Sub1) this).aClass311_9352;
	else
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9352 = null;
	if (Class377.method6737(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2329_).aShortArray9361 == null
		|| (((Class89_Sub1) class89_sub1_2329_).aShortArray9361.length
		    < ((Class89_Sub1) this).anInt9331))
		((Class89_Sub1) class89_sub1_2328_).aShortArray9361
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9361
		    = new short[((Class89_Sub1) this).anInt9331];
	    else
		((Class89_Sub1) class89_sub1_2328_).aShortArray9361
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9361;
	    for (int i_2336_ = 0; i_2336_ < ((Class89_Sub1) this).anInt9331;
		 i_2336_++)
		((Class89_Sub1) class89_sub1_2328_).aShortArray9361[i_2336_]
		    = ((Class89_Sub1) this).aShortArray9361[i_2336_];
	} else
	    ((Class89_Sub1) class89_sub1_2328_).aShortArray9361
		= ((Class89_Sub1) this).aShortArray9361;
	if (Class377.method6820(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2329_).aByteArray9344 == null
		|| (((Class89_Sub1) class89_sub1_2329_).aByteArray9344.length
		    < ((Class89_Sub1) this).anInt9331))
		((Class89_Sub1) class89_sub1_2328_).aByteArray9344
		    = ((Class89_Sub1) class89_sub1_2329_).aByteArray9344
		    = new byte[((Class89_Sub1) this).anInt9331];
	    else
		((Class89_Sub1) class89_sub1_2328_).aByteArray9344
		    = ((Class89_Sub1) class89_sub1_2329_).aByteArray9344;
	    for (int i_2337_ = 0; i_2337_ < ((Class89_Sub1) this).anInt9331;
		 i_2337_++)
		((Class89_Sub1) class89_sub1_2328_).aByteArray9344[i_2337_]
		    = ((Class89_Sub1) this).aByteArray9344[i_2337_];
	} else
	    ((Class89_Sub1) class89_sub1_2328_).aByteArray9344
		= ((Class89_Sub1) this).aByteArray9344;
	if (Class377.method6789(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9353
		= ((Class89_Sub1) class89_sub1_2329_).aClass311_9353;
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9353)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9353)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9353)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9353)
		.aBool4827
		= true;
	} else if (Class377.method6742(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9353
		= ((Class89_Sub1) this).aClass311_9353;
	else
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9353 = null;
	if (Class377.method6793(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2329_).aShortArray9334 == null
		|| (((Class89_Sub1) class89_sub1_2329_).aShortArray9334.length
		    < ((Class89_Sub1) this).anInt9378)) {
		int i_2338_ = ((Class89_Sub1) this).anInt9378;
		((Class89_Sub1) class89_sub1_2328_).aShortArray9334
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9334
		    = new short[i_2338_];
		((Class89_Sub1) class89_sub1_2328_).aShortArray9335
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9335
		    = new short[i_2338_];
		((Class89_Sub1) class89_sub1_2328_).aShortArray9371
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9371
		    = new short[i_2338_];
	    } else {
		((Class89_Sub1) class89_sub1_2328_).aShortArray9334
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9334;
		((Class89_Sub1) class89_sub1_2328_).aShortArray9335
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9335;
		((Class89_Sub1) class89_sub1_2328_).aShortArray9371
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9371;
	    }
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		if (((Class89_Sub1) class89_sub1_2329_).aClass307_9340 == null)
		    ((Class89_Sub1) class89_sub1_2329_).aClass307_9340
			= new Class307();
		Class307 class307
		    = (((Class89_Sub1) class89_sub1_2328_).aClass307_9340
		       = ((Class89_Sub1) class89_sub1_2329_).aClass307_9340);
		if (((Class307) class307).aShortArray4811 == null
		    || (((Class307) class307).aShortArray4811.length
			< ((Class89_Sub1) this).anInt9378)) {
		    int i_2339_ = ((Class89_Sub1) this).anInt9378;
		    ((Class307) class307).aShortArray4811 = new short[i_2339_];
		    ((Class307) class307).aShortArray4813 = new short[i_2339_];
		    ((Class307) class307).aShortArray4812 = new short[i_2339_];
		    ((Class307) class307).aByteArray4814 = new byte[i_2339_];
		}
		for (int i_2340_ = 0;
		     i_2340_ < ((Class89_Sub1) this).anInt9378; i_2340_++) {
		    ((Class89_Sub1) class89_sub1_2328_).aShortArray9334
			[i_2340_]
			= ((Class89_Sub1) this).aShortArray9334[i_2340_];
		    ((Class89_Sub1) class89_sub1_2328_).aShortArray9335
			[i_2340_]
			= ((Class89_Sub1) this).aShortArray9335[i_2340_];
		    ((Class89_Sub1) class89_sub1_2328_).aShortArray9371
			[i_2340_]
			= ((Class89_Sub1) this).aShortArray9371[i_2340_];
		    ((Class307) class307).aShortArray4811[i_2340_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4811[i_2340_]);
		    ((Class307) class307).aShortArray4813[i_2340_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4813[i_2340_]);
		    ((Class307) class307).aShortArray4812[i_2340_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aShortArray4812[i_2340_]);
		    ((Class307) class307).aByteArray4814[i_2340_]
			= (((Class307) ((Class89_Sub1) this).aClass307_9340)
			   .aByteArray4814[i_2340_]);
		}
	    } else {
		((Class89_Sub1) class89_sub1_2328_).aClass307_9340 = null;
		for (int i_2341_ = 0;
		     i_2341_ < ((Class89_Sub1) this).anInt9378; i_2341_++) {
		    ((Class89_Sub1) class89_sub1_2328_).aShortArray9334
			[i_2341_]
			= ((Class89_Sub1) this).aShortArray9334[i_2341_];
		    ((Class89_Sub1) class89_sub1_2328_).aShortArray9335
			[i_2341_]
			= ((Class89_Sub1) this).aShortArray9335[i_2341_];
		    ((Class89_Sub1) class89_sub1_2328_).aShortArray9371
			[i_2341_]
			= ((Class89_Sub1) this).aShortArray9371[i_2341_];
		}
	    }
	    ((Class89_Sub1) class89_sub1_2328_).aByteArray9362
		= ((Class89_Sub1) this).aByteArray9362;
	} else {
	    ((Class89_Sub1) class89_sub1_2328_).aClass307_9340
		= ((Class89_Sub1) this).aClass307_9340;
	    ((Class89_Sub1) class89_sub1_2328_).aShortArray9334
		= ((Class89_Sub1) this).aShortArray9334;
	    ((Class89_Sub1) class89_sub1_2328_).aShortArray9335
		= ((Class89_Sub1) this).aShortArray9335;
	    ((Class89_Sub1) class89_sub1_2328_).aShortArray9371
		= ((Class89_Sub1) this).aShortArray9371;
	    ((Class89_Sub1) class89_sub1_2328_).aByteArray9362
		= ((Class89_Sub1) this).aByteArray9362;
	}
	if (Class377.method6792(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9354
		= ((Class89_Sub1) class89_sub1_2329_).aClass311_9354;
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9354)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9354)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9354)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9354)
		.aBool4827
		= true;
	} else if (Class377.method6741(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9354
		= ((Class89_Sub1) this).aClass311_9354;
	else
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9354 = null;
	if (Class377.method6735(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2329_).aFloatArray9338 == null
		|| (((Class89_Sub1) class89_sub1_2329_).aFloatArray9338.length
		    < ((Class89_Sub1) this).anInt9331)) {
		int i_2342_ = ((Class89_Sub1) this).anInt9378;
		((Class89_Sub1) class89_sub1_2328_).aFloatArray9338
		    = ((Class89_Sub1) class89_sub1_2329_).aFloatArray9338
		    = new float[i_2342_];
		((Class89_Sub1) class89_sub1_2328_).aFloatArray9339
		    = ((Class89_Sub1) class89_sub1_2329_).aFloatArray9339
		    = new float[i_2342_];
	    } else {
		((Class89_Sub1) class89_sub1_2328_).aFloatArray9338
		    = ((Class89_Sub1) class89_sub1_2329_).aFloatArray9338;
		((Class89_Sub1) class89_sub1_2328_).aFloatArray9339
		    = ((Class89_Sub1) class89_sub1_2329_).aFloatArray9339;
	    }
	    for (int i_2343_ = 0; i_2343_ < ((Class89_Sub1) this).anInt9378;
		 i_2343_++) {
		((Class89_Sub1) class89_sub1_2328_).aFloatArray9338[i_2343_]
		    = ((Class89_Sub1) this).aFloatArray9338[i_2343_];
		((Class89_Sub1) class89_sub1_2328_).aFloatArray9339[i_2343_]
		    = ((Class89_Sub1) this).aFloatArray9339[i_2343_];
	    }
	} else {
	    ((Class89_Sub1) class89_sub1_2328_).aFloatArray9338
		= ((Class89_Sub1) this).aFloatArray9338;
	    ((Class89_Sub1) class89_sub1_2328_).aFloatArray9339
		= ((Class89_Sub1) this).aFloatArray9339;
	}
	if (Class377.method6747(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9341
		= ((Class89_Sub1) class89_sub1_2329_).aClass311_9341;
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9341)
		.anInterface40_4828
		= (((Class311) ((Class89_Sub1) this).aClass311_9341)
		   .anInterface40_4828);
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9341)
		.aBool4826
		= ((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826;
	    ((Class311) ((Class89_Sub1) class89_sub1_2328_).aClass311_9341)
		.aBool4827
		= true;
	} else if (Class377.method6743(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9341
		= ((Class89_Sub1) this).aClass311_9341;
	else
	    ((Class89_Sub1) class89_sub1_2328_).aClass311_9341 = null;
	if (Class377.method6736(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2329_).aShortArray9345 == null
		|| (((Class89_Sub1) class89_sub1_2329_).aShortArray9345.length
		    < ((Class89_Sub1) this).anInt9331)) {
		int i_2344_ = ((Class89_Sub1) this).anInt9331;
		((Class89_Sub1) class89_sub1_2328_).aShortArray9345
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9345
		    = new short[i_2344_];
		((Class89_Sub1) class89_sub1_2328_).aShortArray9346
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9346
		    = new short[i_2344_];
		((Class89_Sub1) class89_sub1_2328_).aShortArray9368
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9368
		    = new short[i_2344_];
	    } else {
		((Class89_Sub1) class89_sub1_2328_).aShortArray9345
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9345;
		((Class89_Sub1) class89_sub1_2328_).aShortArray9346
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9346;
		((Class89_Sub1) class89_sub1_2328_).aShortArray9368
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9368;
	    }
	    for (int i_2345_ = 0; i_2345_ < ((Class89_Sub1) this).anInt9331;
		 i_2345_++) {
		((Class89_Sub1) class89_sub1_2328_).aShortArray9345[i_2345_]
		    = ((Class89_Sub1) this).aShortArray9345[i_2345_];
		((Class89_Sub1) class89_sub1_2328_).aShortArray9346[i_2345_]
		    = ((Class89_Sub1) this).aShortArray9346[i_2345_];
		((Class89_Sub1) class89_sub1_2328_).aShortArray9368[i_2345_]
		    = ((Class89_Sub1) this).aShortArray9368[i_2345_];
	    }
	} else {
	    ((Class89_Sub1) class89_sub1_2328_).aShortArray9345
		= ((Class89_Sub1) this).aShortArray9345;
	    ((Class89_Sub1) class89_sub1_2328_).aShortArray9346
		= ((Class89_Sub1) this).aShortArray9346;
	    ((Class89_Sub1) class89_sub1_2328_).aShortArray9368
		= ((Class89_Sub1) this).aShortArray9368;
	}
	if (Class377.method6748(i, ((Class89_Sub1) this).anInt9321)) {
	    ((Class89_Sub1) class89_sub1_2328_).aClass386_9351
		= ((Class89_Sub1) class89_sub1_2329_).aClass386_9351;
	    ((Class386) ((Class89_Sub1) class89_sub1_2328_).aClass386_9351)
		.anInterface33_5708
		= (((Class386) ((Class89_Sub1) this).aClass386_9351)
		   .anInterface33_5708);
	    ((Class386) ((Class89_Sub1) class89_sub1_2328_).aClass386_9351)
		.aBool5707
		= ((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707;
	    ((Class386) ((Class89_Sub1) class89_sub1_2328_).aClass386_9351)
		.aBool5709
		= true;
	} else if (Class377.method6790(i, ((Class89_Sub1) this).anInt9321))
	    ((Class89_Sub1) class89_sub1_2328_).aClass386_9351
		= ((Class89_Sub1) this).aClass386_9351;
	else
	    ((Class89_Sub1) class89_sub1_2328_).aClass386_9351 = null;
	if (Class377.method6769(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2329_).aShortArray9348 == null
		|| (((Class89_Sub1) class89_sub1_2329_).aShortArray9348.length
		    < ((Class89_Sub1) this).anInt9331)) {
		int i_2346_ = ((Class89_Sub1) this).anInt9331;
		((Class89_Sub1) class89_sub1_2328_).aShortArray9348
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9348
		    = new short[i_2346_];
	    } else
		((Class89_Sub1) class89_sub1_2328_).aShortArray9348
		    = ((Class89_Sub1) class89_sub1_2329_).aShortArray9348;
	    for (int i_2347_ = 0; i_2347_ < ((Class89_Sub1) this).anInt9331;
		 i_2347_++)
		((Class89_Sub1) class89_sub1_2328_).aShortArray9348[i_2347_]
		    = ((Class89_Sub1) this).aShortArray9348[i_2347_];
	} else
	    ((Class89_Sub1) class89_sub1_2328_).aShortArray9348
		= ((Class89_Sub1) this).aShortArray9348;
	if (Class377.method6738(i, ((Class89_Sub1) this).anInt9321)) {
	    if (((Class89_Sub1) class89_sub1_2329_).aClass381Array9379 == null
		|| ((((Class89_Sub1) class89_sub1_2329_)
		     .aClass381Array9379).length
		    < ((Class89_Sub1) this).anInt9375)) {
		int i_2348_ = ((Class89_Sub1) this).anInt9375;
		((Class89_Sub1) class89_sub1_2328_).aClass381Array9379
		    = ((Class89_Sub1) class89_sub1_2329_).aClass381Array9379
		    = new Class381[i_2348_];
		for (int i_2349_ = 0;
		     i_2349_ < ((Class89_Sub1) this).anInt9375; i_2349_++)
		    ((Class89_Sub1) class89_sub1_2328_).aClass381Array9379
			[i_2349_]
			= ((Class89_Sub1) this).aClass381Array9379[i_2349_]
			      .method6885();
	    } else {
		((Class89_Sub1) class89_sub1_2328_).aClass381Array9379
		    = ((Class89_Sub1) class89_sub1_2329_).aClass381Array9379;
		for (int i_2350_ = 0;
		     i_2350_ < ((Class89_Sub1) this).anInt9375; i_2350_++)
		    ((Class89_Sub1) class89_sub1_2328_).aClass381Array9379
			[i_2350_].method6886
			(((Class89_Sub1) this).aClass381Array9379[i_2350_]);
	    }
	} else
	    ((Class89_Sub1) class89_sub1_2328_).aClass381Array9379
		= ((Class89_Sub1) this).aClass381Array9379;
	((Class89_Sub1) class89_sub1_2328_).aClass315Array9333
	    = ((Class89_Sub1) this).aClass315Array9333;
	if (((Class89_Sub1) this).aBool9323) {
	    ((Class89_Sub1) class89_sub1_2328_).anInt9380
		= ((Class89_Sub1) this).anInt9380;
	    ((Class89_Sub1) class89_sub1_2328_).anInt9336
		= ((Class89_Sub1) this).anInt9336;
	    ((Class89_Sub1) class89_sub1_2328_).anInt9365
		= ((Class89_Sub1) this).anInt9365;
	    ((Class89_Sub1) class89_sub1_2328_).anInt9366
		= ((Class89_Sub1) this).anInt9366;
	    ((Class89_Sub1) class89_sub1_2328_).anInt9363
		= ((Class89_Sub1) this).anInt9363;
	    ((Class89_Sub1) class89_sub1_2328_).anInt9364
		= ((Class89_Sub1) this).anInt9364;
	    ((Class89_Sub1) class89_sub1_2328_).anInt9332
		= ((Class89_Sub1) this).anInt9332;
	    ((Class89_Sub1) class89_sub1_2328_).anInt9359
		= ((Class89_Sub1) this).anInt9359;
	    ((Class89_Sub1) class89_sub1_2328_).aBool9323 = true;
	} else
	    ((Class89_Sub1) class89_sub1_2328_).aBool9323 = false;
	if (((Class89_Sub1) this).aBool9382) {
	    ((Class89_Sub1) class89_sub1_2328_).anInt9370
		= ((Class89_Sub1) this).anInt9370;
	    ((Class89_Sub1) class89_sub1_2328_).aBool9382 = true;
	} else
	    ((Class89_Sub1) class89_sub1_2328_).aBool9382 = false;
	((Class89_Sub1) class89_sub1_2328_).anIntArrayArray9329
	    = ((Class89_Sub1) this).anIntArrayArray9329;
	((Class89_Sub1) class89_sub1_2328_).anIntArrayArray9337
	    = ((Class89_Sub1) this).anIntArrayArray9337;
	((Class89_Sub1) class89_sub1_2328_).anIntArrayArray9381
	    = ((Class89_Sub1) this).anIntArrayArray9381;
	((Class89_Sub1) class89_sub1_2328_).aShortArray9328
	    = ((Class89_Sub1) this).aShortArray9328;
	((Class89_Sub1) class89_sub1_2328_).anIntArray9374
	    = ((Class89_Sub1) this).anIntArray9374;
	((Class89_Sub1) class89_sub1_2328_).aShortArray9350
	    = ((Class89_Sub1) this).aShortArray9350;
	((Class89_Sub1) class89_sub1_2328_).aShortArray9355
	    = ((Class89_Sub1) this).aShortArray9355;
	((Class89_Sub1) class89_sub1_2328_).aShortArray9330
	    = ((Class89_Sub1) this).aShortArray9330;
	((Class89_Sub1) class89_sub1_2328_).aShortArray9320
	    = ((Class89_Sub1) this).aShortArray9320;
	((Class89_Sub1) class89_sub1_2328_).anIntArray9347
	    = ((Class89_Sub1) this).anIntArray9347;
	((Class89_Sub1) class89_sub1_2328_).anIntArray9373
	    = ((Class89_Sub1) this).anIntArray9373;
	((Class89_Sub1) class89_sub1_2328_).anIntArray9386
	    = ((Class89_Sub1) this).anIntArray9386;
	((Class89_Sub1) class89_sub1_2328_).aClass106Array9376
	    = ((Class89_Sub1) this).aClass106Array9376;
	((Class89_Sub1) class89_sub1_2328_).aClass167Array9377
	    = ((Class89_Sub1) this).aClass167Array9377;
	return class89_sub1_2328_;
    }
    
    void method15503() {
	if (((Class89_Sub1) this).aBool9357) {
	    ((Class89_Sub1) this).aBool9357 = false;
	    if (((Class89_Sub1) this).aClass106Array9376 == null
		&& ((Class89_Sub1) this).aClass167Array9377 == null
		&& ((Class89_Sub1) this).aClass315Array9333 == null
		&& !Class377.method6731(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		boolean bool = false;
		boolean bool_2351_ = false;
		boolean bool_2352_ = false;
		if (((Class89_Sub1) this).anIntArray9326 != null
		    && !Class377.method6749(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    if (((Class89_Sub1) this).aClass311_9352 == null
			|| ((Class89_Sub1) this).aClass311_9352.method5881()) {
			if (!((Class89_Sub1) this).aBool9323)
			    method15471();
			bool = true;
		    } else
			((Class89_Sub1) this).aBool9357 = true;
		}
		if (((Class89_Sub1) this).anIntArray9327 != null
		    && !Class377.method6750(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    if (((Class89_Sub1) this).aClass311_9352 == null
			|| ((Class89_Sub1) this).aClass311_9352.method5881()) {
			if (!((Class89_Sub1) this).aBool9323)
			    method15471();
			bool_2351_ = true;
		    } else
			((Class89_Sub1) this).aBool9357 = true;
		}
		if (((Class89_Sub1) this).anIntArray9360 != null
		    && !Class377.method6824(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    if (((Class89_Sub1) this).aClass311_9352 == null
			|| ((Class89_Sub1) this).aClass311_9352.method5881()) {
			if (!((Class89_Sub1) this).aBool9323)
			    method15471();
			bool_2352_ = true;
		    } else
			((Class89_Sub1) this).aBool9357 = true;
		}
		if (bool)
		    ((Class89_Sub1) this).anIntArray9326 = null;
		if (bool_2351_)
		    ((Class89_Sub1) this).anIntArray9327 = null;
		if (bool_2352_)
		    ((Class89_Sub1) this).anIntArray9360 = null;
	    }
	    if (((Class89_Sub1) this).aShortArray9328 != null
		&& ((Class89_Sub1) this).anIntArray9326 == null
		&& ((Class89_Sub1) this).anIntArray9327 == null
		&& ((Class89_Sub1) this).anIntArray9360 == null) {
		((Class89_Sub1) this).aShortArray9328 = null;
		((Class89_Sub1) this).anIntArray9374 = null;
	    }
	while_78_:
	    do {
		if (((Class89_Sub1) this).aByteArray9362 != null
		    && !Class377.method6774(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    do {
			if ((((Class89_Sub1) this).anInt9321 & 0x37) != 0) {
			    if (((Class89_Sub1) this).aClass311_9354 != null
				&& !((Class89_Sub1) this).aClass311_9354
					.method5881())
				break;
			} else if (((Class89_Sub1) this).aClass311_9353 != null
				   && !((Class89_Sub1) this).aClass311_9353
					   .method5881())
			    break;
			((Class89_Sub1) this).aShortArray9371 = null;
			((Class89_Sub1) this).aShortArray9335 = null;
			((Class89_Sub1) this).aShortArray9334 = null;
			((Class89_Sub1) this).aByteArray9362 = null;
			break while_78_;
		    } while (false);
		    ((Class89_Sub1) this).aBool9357 = true;
		}
	    } while (false);
	    if (((Class89_Sub1) this).aShortArray9361 != null
		&& !Class377.method6734(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aShortArray9361 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aByteArray9344 != null
		&& !Class377.method6746(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aByteArray9344 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aFloatArray9338 != null
		&& !Class377.method6755(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9341 == null
		    || ((Class89_Sub1) this).aClass311_9341.method5881()) {
		    ((Class89_Sub1) this).aFloatArray9339 = null;
		    ((Class89_Sub1) this).aFloatArray9338 = null;
		} else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9348 != null
		&& !Class377.method6760(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aShortArray9348 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9345 != null
		&& !Class377.method6759(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if ((((Class89_Sub1) this).aClass386_9351 == null
		     || ((Class89_Sub1) this).aClass386_9351.method6952())
		    && (((Class89_Sub1) this).aClass311_9353 == null
			|| ((Class89_Sub1) this).aClass311_9353
			       .method5881())) {
		    ((Class89_Sub1) this).aShortArray9368 = null;
		    ((Class89_Sub1) this).aShortArray9346 = null;
		    ((Class89_Sub1) this).aShortArray9345 = null;
		} else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9350 != null) {
		if (((Class89_Sub1) this).aClass311_9352 == null
		    || ((Class89_Sub1) this).aClass311_9352.method5881())
		    ((Class89_Sub1) this).aShortArray9350 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9355 != null) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aShortArray9355 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null
		&& !Class377.method6756(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		((Class89_Sub1) this).anIntArrayArray9337 = null;
		((Class89_Sub1) this).aShortArray9320 = null;
	    }
	    if (((Class89_Sub1) this).anIntArrayArray9329 != null
		&& !Class377.method6757(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		((Class89_Sub1) this).anIntArrayArray9329 = null;
		((Class89_Sub1) this).aShortArray9330 = null;
	    }
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null
		&& !Class377.method6758(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321))
		((Class89_Sub1) this).anIntArrayArray9381 = null;
	    if (((Class89_Sub1) this).anIntArray9347 != null
		&& (((Class89_Sub1) this).anInt9367 & 0x800) == 0
		&& (((Class89_Sub1) this).anInt9367 & 0x40000) == 0) {
		((Class89_Sub1) this).anIntArray9347 = null;
		((Class89_Sub1) this).anIntArray9373 = null;
		((Class89_Sub1) this).anIntArray9386 = null;
	    }
	}
    }
    
    void method15504() {
	if (((Class89_Sub1) this).aBool9357) {
	    ((Class89_Sub1) this).aBool9357 = false;
	    if (((Class89_Sub1) this).aClass106Array9376 == null
		&& ((Class89_Sub1) this).aClass167Array9377 == null
		&& ((Class89_Sub1) this).aClass315Array9333 == null
		&& !Class377.method6731(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		boolean bool = false;
		boolean bool_2353_ = false;
		boolean bool_2354_ = false;
		if (((Class89_Sub1) this).anIntArray9326 != null
		    && !Class377.method6749(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    if (((Class89_Sub1) this).aClass311_9352 == null
			|| ((Class89_Sub1) this).aClass311_9352.method5881()) {
			if (!((Class89_Sub1) this).aBool9323)
			    method15471();
			bool = true;
		    } else
			((Class89_Sub1) this).aBool9357 = true;
		}
		if (((Class89_Sub1) this).anIntArray9327 != null
		    && !Class377.method6750(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    if (((Class89_Sub1) this).aClass311_9352 == null
			|| ((Class89_Sub1) this).aClass311_9352.method5881()) {
			if (!((Class89_Sub1) this).aBool9323)
			    method15471();
			bool_2353_ = true;
		    } else
			((Class89_Sub1) this).aBool9357 = true;
		}
		if (((Class89_Sub1) this).anIntArray9360 != null
		    && !Class377.method6824(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    if (((Class89_Sub1) this).aClass311_9352 == null
			|| ((Class89_Sub1) this).aClass311_9352.method5881()) {
			if (!((Class89_Sub1) this).aBool9323)
			    method15471();
			bool_2354_ = true;
		    } else
			((Class89_Sub1) this).aBool9357 = true;
		}
		if (bool)
		    ((Class89_Sub1) this).anIntArray9326 = null;
		if (bool_2353_)
		    ((Class89_Sub1) this).anIntArray9327 = null;
		if (bool_2354_)
		    ((Class89_Sub1) this).anIntArray9360 = null;
	    }
	    if (((Class89_Sub1) this).aShortArray9328 != null
		&& ((Class89_Sub1) this).anIntArray9326 == null
		&& ((Class89_Sub1) this).anIntArray9327 == null
		&& ((Class89_Sub1) this).anIntArray9360 == null) {
		((Class89_Sub1) this).aShortArray9328 = null;
		((Class89_Sub1) this).anIntArray9374 = null;
	    }
	while_79_:
	    do {
		if (((Class89_Sub1) this).aByteArray9362 != null
		    && !Class377.method6774(((Class89_Sub1) this).anInt9367,
					    ((Class89_Sub1) this).anInt9321)) {
		    do {
			if ((((Class89_Sub1) this).anInt9321 & 0x37) != 0) {
			    if (((Class89_Sub1) this).aClass311_9354 != null
				&& !((Class89_Sub1) this).aClass311_9354
					.method5881())
				break;
			} else if (((Class89_Sub1) this).aClass311_9353 != null
				   && !((Class89_Sub1) this).aClass311_9353
					   .method5881())
			    break;
			((Class89_Sub1) this).aShortArray9371 = null;
			((Class89_Sub1) this).aShortArray9335 = null;
			((Class89_Sub1) this).aShortArray9334 = null;
			((Class89_Sub1) this).aByteArray9362 = null;
			break while_79_;
		    } while (false);
		    ((Class89_Sub1) this).aBool9357 = true;
		}
	    } while (false);
	    if (((Class89_Sub1) this).aShortArray9361 != null
		&& !Class377.method6734(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aShortArray9361 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aByteArray9344 != null
		&& !Class377.method6746(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aByteArray9344 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aFloatArray9338 != null
		&& !Class377.method6755(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9341 == null
		    || ((Class89_Sub1) this).aClass311_9341.method5881()) {
		    ((Class89_Sub1) this).aFloatArray9339 = null;
		    ((Class89_Sub1) this).aFloatArray9338 = null;
		} else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9348 != null
		&& !Class377.method6760(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aShortArray9348 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9345 != null
		&& !Class377.method6759(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		if ((((Class89_Sub1) this).aClass386_9351 == null
		     || ((Class89_Sub1) this).aClass386_9351.method6952())
		    && (((Class89_Sub1) this).aClass311_9353 == null
			|| ((Class89_Sub1) this).aClass311_9353
			       .method5881())) {
		    ((Class89_Sub1) this).aShortArray9368 = null;
		    ((Class89_Sub1) this).aShortArray9346 = null;
		    ((Class89_Sub1) this).aShortArray9345 = null;
		} else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9350 != null) {
		if (((Class89_Sub1) this).aClass311_9352 == null
		    || ((Class89_Sub1) this).aClass311_9352.method5881())
		    ((Class89_Sub1) this).aShortArray9350 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).aShortArray9355 != null) {
		if (((Class89_Sub1) this).aClass311_9353 == null
		    || ((Class89_Sub1) this).aClass311_9353.method5881())
		    ((Class89_Sub1) this).aShortArray9355 = null;
		else
		    ((Class89_Sub1) this).aBool9357 = true;
	    }
	    if (((Class89_Sub1) this).anIntArrayArray9337 != null
		&& !Class377.method6756(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		((Class89_Sub1) this).anIntArrayArray9337 = null;
		((Class89_Sub1) this).aShortArray9320 = null;
	    }
	    if (((Class89_Sub1) this).anIntArrayArray9329 != null
		&& !Class377.method6757(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321)) {
		((Class89_Sub1) this).anIntArrayArray9329 = null;
		((Class89_Sub1) this).aShortArray9330 = null;
	    }
	    if (((Class89_Sub1) this).anIntArrayArray9381 != null
		&& !Class377.method6758(((Class89_Sub1) this).anInt9367,
					((Class89_Sub1) this).anInt9321))
		((Class89_Sub1) this).anIntArrayArray9381 = null;
	    if (((Class89_Sub1) this).anIntArray9347 != null
		&& (((Class89_Sub1) this).anInt9367 & 0x800) == 0
		&& (((Class89_Sub1) this).anInt9367 & 0x40000) == 0) {
		((Class89_Sub1) this).anIntArray9347 = null;
		((Class89_Sub1) this).anIntArray9373 = null;
		((Class89_Sub1) this).anIntArray9386 = null;
	    }
	}
    }
    
    public byte[] method1913() {
	return ((Class89_Sub1) this).aByteArray9344;
    }
    
    boolean method15505() {
	boolean bool
	    = !((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826;
	boolean bool_2355_
	    = ((((Class89_Sub1) this).anInt9321 & 0x37) != 0
	       && !(((Class311) ((Class89_Sub1) this).aClass311_9354)
		    .aBool4826));
	boolean bool_2356_
	    = !((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826;
	boolean bool_2357_
	    = !((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826;
	if (!bool_2356_ && !bool && !bool_2355_ && !bool_2357_)
	    return true;
	boolean bool_2358_ = true;
	if (bool_2356_ && ((Class89_Sub1) this).aShortArray9350 != null) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9352)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9352)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9352)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 12, 12);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 12;
		long l = interface40.method262(0, i);
		for (int i_2359_ = 0;
		     i_2359_ < ((Class89_Sub1) this).anInt9378; i_2359_++) {
		    short i_2360_
			= ((Class89_Sub1) this).aShortArray9350[i_2359_];
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9326[i_2360_]));
		    l += 4L;
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9327[i_2360_]));
		    l += 4L;
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9360[i_2360_]));
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9326
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9327
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9360
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9352)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826 = true;
	}
	if (bool) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9353)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9353)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9353)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 4, 4);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 4;
		long l = interface40.method262(0, i);
		if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		    short[] is;
		    short[] is_2361_;
		    short[] is_2362_;
		    byte[] is_2363_;
		    if (((Class89_Sub1) this).aClass307_9340 != null) {
			is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			      .aShortArray4811);
			is_2361_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4813;
			is_2362_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4812;
			is_2363_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aByteArray4814;
		    } else {
			is = ((Class89_Sub1) this).aShortArray9334;
			is_2361_ = ((Class89_Sub1) this).aShortArray9335;
			is_2362_ = ((Class89_Sub1) this).aShortArray9371;
			is_2363_ = ((Class89_Sub1) this).aByteArray9362;
		    }
		    float f
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    float f_2364_
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    for (int i_2365_ = 0;
			 i_2365_ < ((Class89_Sub1) this).anInt9378;
			 i_2365_++) {
			short i_2366_
			    = ((Class89_Sub1) this).aShortArray9355[i_2365_];
			int i_2367_
			    = method15483((((Class89_Sub1) this)
					   .aShortArray9361[i_2366_]) & 0xffff,
					  (((Class89_Sub1) this)
					   .aShortArray9348[i_2366_]),
					  ((Class89_Sub1) this).aShort9322);
			float f_2368_ = ((float) (i_2367_ >> 16 & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9563));
			float f_2369_ = ((float) (i_2367_ >> 8 & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9564));
			float f_2370_ = ((float) (i_2367_ & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9556));
			byte i_2371_ = is_2363_[i_2365_];
			float f_2372_;
			if (i_2371_ == 0)
			    f_2372_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i_2365_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_2361_[i_2365_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_2362_[i_2365_])
				   * 0.0026041667F);
			else
			    f_2372_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i_2365_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_2361_[i_2365_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_2362_[i_2365_])
				   / ((float) i_2371_ * 256.0F));
			float f_2373_
			    = ((((Class89_Sub1) this).aClass103_Sub3_9319
				.aFloat9566)
			       + f_2372_ * (f_2372_ < 0.0F ? f_2364_ : f));
			int i_2374_ = (int) (f_2368_ * f_2373_);
			if (i_2374_ < 0)
			    i_2374_ = 0;
			else if (i_2374_ > 255)
			    i_2374_ = 255;
			int i_2375_ = (int) (f_2369_ * f_2373_);
			if (i_2375_ < 0)
			    i_2375_ = 0;
			else if (i_2375_ > 255)
			    i_2375_ = 255;
			int i_2376_ = (int) (f_2370_ * f_2373_);
			if (i_2376_ < 0)
			    i_2376_ = 0;
			else if (i_2376_ > 255)
			    i_2376_ = 255;
			unsafe.putInt(l,
				      (255 - (((Class89_Sub1) this)
					      .aByteArray9344[i_2366_]) << 24
				       | i_2374_ << 16 | i_2375_ << 8
				       | i_2376_));
			l += 4L;
		    }
		} else {
		    for (int i_2377_ = 0;
			 i_2377_ < ((Class89_Sub1) this).anInt9378;
			 i_2377_++) {
			short i_2378_
			    = ((Class89_Sub1) this).aShortArray9355[i_2377_];
			int i_2379_
			    = (255 - (((Class89_Sub1) this).aByteArray9344
				      [i_2378_]) << 24
			       | method15483(((((Class89_Sub1) this)
					       .aShortArray9361[i_2378_])
					      & 0xffff),
					     (((Class89_Sub1) this)
					      .aShortArray9348[i_2378_]),
					     (((Class89_Sub1) this)
					      .aShort9322)));
			unsafe.putInt(l, i_2379_);
			l += 4L;
		    }
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		    short[] is;
		    short[] is_2380_;
		    short[] is_2381_;
		    byte[] is_2382_;
		    if (((Class89_Sub1) this).aClass307_9340 != null) {
			is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			      .aShortArray4811);
			is_2380_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4813;
			is_2381_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4812;
			is_2382_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aByteArray4814;
		    } else {
			is = ((Class89_Sub1) this).aShortArray9334;
			is_2380_ = ((Class89_Sub1) this).aShortArray9335;
			is_2381_ = ((Class89_Sub1) this).aShortArray9371;
			is_2382_ = ((Class89_Sub1) this).aByteArray9362;
		    }
		    float f
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    float f_2383_
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
			short i_2384_
			    = ((Class89_Sub1) this).aShortArray9355[i];
			int i_2385_
			    = method15483((((Class89_Sub1) this)
					   .aShortArray9361[i_2384_]) & 0xffff,
					  (((Class89_Sub1) this)
					   .aShortArray9348[i_2384_]),
					  ((Class89_Sub1) this).aShort9322);
			float f_2386_ = ((float) (i_2385_ >> 16 & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9563));
			float f_2387_ = ((float) (i_2385_ >> 8 & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9564));
			float f_2388_ = ((float) (i_2385_ & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9556));
			byte i_2389_ = is_2382_[i];
			float f_2390_;
			if (i_2389_ == 0)
			    f_2390_
				= ((((Class89_Sub1) this).aClass103_Sub3_9319
				    .aFloatArray9558[0]) * (float) is[i]
				   + ((((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558[1])
				      * (float) is_2380_[i])
				   + ((((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558[2])
				      * (float) is_2381_[i])) * 0.0026041667F;
			else
			    f_2390_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_2380_[i]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_2381_[i])
				   / ((float) i_2389_ * 256.0F));
			float f_2391_
			    = ((((Class89_Sub1) this).aClass103_Sub3_9319
				.aFloat9566)
			       + f_2390_ * (f_2390_ < 0.0F ? f_2383_ : f));
			int i_2392_ = (int) (f_2386_ * f_2391_);
			if (i_2392_ < 0)
			    i_2392_ = 0;
			else if (i_2392_ > 255)
			    i_2392_ = 255;
			int i_2393_ = (int) (f_2387_ * f_2391_);
			if (i_2393_ < 0)
			    i_2393_ = 0;
			else if (i_2393_ > 255)
			    i_2393_ = 255;
			int i_2394_ = (int) (f_2388_ * f_2391_);
			if (i_2394_ < 0)
			    i_2394_ = 0;
			else if (i_2394_ > 255)
			    i_2394_ = 255;
			bytebuffer.putInt((255 - (((Class89_Sub1) this)
						  .aByteArray9344[i_2384_])
					   << 24)
					  | i_2392_ << 16 | i_2393_ << 8
					  | i_2394_);
		    }
		} else {
		    for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
			short i_2395_
			    = ((Class89_Sub1) this).aShortArray9355[i];
			int i_2396_
			    = (255 - (((Class89_Sub1) this).aByteArray9344
				      [i_2395_]) << 24
			       | method15483(((((Class89_Sub1) this)
					       .aShortArray9361[i_2395_])
					      & 0xffff),
					     (((Class89_Sub1) this)
					      .aShortArray9348[i_2395_]),
					     (((Class89_Sub1) this)
					      .aShort9322)));
			bytebuffer.putInt(i_2396_);
		    }
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9353)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826 = true;
	}
	if (bool_2355_) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9354)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9354)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9354)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 12, 12);
	    short[] is;
	    short[] is_2397_;
	    short[] is_2398_;
	    byte[] is_2399_;
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
		      .aShortArray4811);
		is_2397_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			    .aShortArray4813);
		is_2398_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			    .aShortArray4812);
		is_2399_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			    .aByteArray4814);
	    } else {
		is = ((Class89_Sub1) this).aShortArray9334;
		is_2397_ = ((Class89_Sub1) this).aShortArray9335;
		is_2398_ = ((Class89_Sub1) this).aShortArray9371;
		is_2399_ = ((Class89_Sub1) this).aByteArray9362;
	    }
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 12;
		long l = interface40.method262(0, i);
		for (int i_2400_ = 0;
		     i_2400_ < ((Class89_Sub1) this).anInt9378; i_2400_++) {
		    Class287 class287
			= new Class287((float) is[i_2400_],
				       (float) is_2397_[i_2400_],
				       (float) is_2398_[i_2400_]);
		    if (class287.method5559() != 0.0F) {
			if (is_2399_[i_2400_] > 1)
			    class287.method5588((float) is_2399_[i_2400_]);
			class287.method5573();
		    }
		    unsafe.putFloat(l, class287.aFloat4477);
		    l += 4L;
		    unsafe.putFloat(l, class287.aFloat4474);
		    l += 4L;
		    unsafe.putFloat(l, class287.aFloat4479);
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    Class287 class287
			= new Class287((float) is[i], (float) is_2397_[i],
				       (float) is_2398_[i]);
		    if (class287.method5559() != 0.0F) {
			if (is_2399_[i] > 1)
			    class287.method5588((float) is_2399_[i]);
			class287.method5573();
		    }
		    bytebuffer.putFloat(class287.aFloat4477);
		    bytebuffer.putFloat(class287.aFloat4474);
		    bytebuffer.putFloat(class287.aFloat4479);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9354)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4826 = true;
	}
	if (bool_2357_) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9341)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9341)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9341)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 8, 8);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 8;
		long l = interface40.method262(0, i);
		for (int i_2401_ = 0;
		     i_2401_ < ((Class89_Sub1) this).anInt9378; i_2401_++) {
		    unsafe.putFloat(l, (((Class89_Sub1) this).aFloatArray9338
					[i_2401_]));
		    l += 4L;
		    unsafe.putFloat(l, (((Class89_Sub1) this).aFloatArray9339
					[i_2401_]));
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    bytebuffer
			.putFloat(((Class89_Sub1) this).aFloatArray9338[i]);
		    bytebuffer
			.putFloat(((Class89_Sub1) this).aFloatArray9339[i]);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9341)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826 = true;
	}
	return bool_2358_;
    }
    
    void method15506() {
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826
		= false;
    }
    
    public void method1995(int i) {
	((Class89_Sub1) this).aShort9383 = (short) i;
	method15480();
	method15493();
    }
    
    void method15507() {
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826
		= false;
    }
    
    void method15508() {
	if ((((Class89_Sub1) this).anInt9321 & 0x37) != 0) {
	    if (((Class89_Sub1) this).aClass311_9354 != null)
		((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4826
		    = false;
	} else if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826
		= false;
    }
    
    public void method1993(short i, short i_2402_) {
	for (int i_2403_ = 0; i_2403_ < ((Class89_Sub1) this).anInt9331;
	     i_2403_++) {
	    if (((Class89_Sub1) this).aShortArray9361[i_2403_] == i)
		((Class89_Sub1) this).aShortArray9361[i_2403_] = i_2402_;
	}
	if (((Class89_Sub1) this).aClass315Array9333 != null) {
	    for (int i_2404_ = 0; i_2404_ < ((Class89_Sub1) this).anInt9375;
		 i_2404_++) {
		Class315 class315
		    = ((Class89_Sub1) this).aClass315Array9333[i_2404_];
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i_2404_];
		((Class381) class381).anInt5661
		    = (((Class381) class381).anInt5661 & ~0xffffff
		       | ((Class474.anIntArray6383
			   [(((Class89_Sub1) this).aShortArray9361
			     [((Class315) class315).anInt4841]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method15474();
    }
    
    void method15509() {
	int i = 32767;
	int i_2405_ = 32767;
	int i_2406_ = 32767;
	int i_2407_ = -32768;
	int i_2408_ = -32768;
	int i_2409_ = -32768;
	int i_2410_ = 0;
	int i_2411_ = 0;
	for (int i_2412_ = 0; i_2412_ < ((Class89_Sub1) this).anInt9325;
	     i_2412_++) {
	    int i_2413_ = ((Class89_Sub1) this).anIntArray9326[i_2412_];
	    int i_2414_ = ((Class89_Sub1) this).anIntArray9327[i_2412_];
	    int i_2415_ = ((Class89_Sub1) this).anIntArray9360[i_2412_];
	    if (i_2413_ < i)
		i = i_2413_;
	    if (i_2413_ > i_2407_)
		i_2407_ = i_2413_;
	    if (i_2414_ < i_2405_)
		i_2405_ = i_2414_;
	    if (i_2414_ > i_2408_)
		i_2408_ = i_2414_;
	    if (i_2415_ < i_2406_)
		i_2406_ = i_2415_;
	    if (i_2415_ > i_2409_)
		i_2409_ = i_2415_;
	    int i_2416_ = i_2413_ * i_2413_ + i_2415_ * i_2415_;
	    if (i_2416_ > i_2410_)
		i_2410_ = i_2416_;
	    i_2416_
		= i_2413_ * i_2413_ + i_2415_ * i_2415_ + i_2414_ * i_2414_;
	    if (i_2416_ > i_2411_)
		i_2411_ = i_2416_;
	}
	((Class89_Sub1) this).anInt9365 = i;
	((Class89_Sub1) this).anInt9366 = i_2407_;
	((Class89_Sub1) this).anInt9363 = i_2405_;
	((Class89_Sub1) this).anInt9364 = i_2408_;
	((Class89_Sub1) this).anInt9332 = i_2406_;
	((Class89_Sub1) this).anInt9359 = i_2409_;
	((Class89_Sub1) this).anInt9336
	    = (int) (Math.sqrt((double) i_2410_) + 0.99);
	((Class89_Sub1) this).anInt9380
	    = (int) (Math.sqrt((double) i_2411_) + 0.99);
	((Class89_Sub1) this).aBool9323 = true;
    }
    
    public void method1930(int i) {
	if (((Class89_Sub1) this).aClass311_9352 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4827
		= Class377.method6744(i, ((Class89_Sub1) this).anInt9321);
	if (((Class89_Sub1) this).aClass311_9341 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4827
		= Class377.method6747(i, ((Class89_Sub1) this).anInt9321);
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4827
		= Class377.method6789(i, ((Class89_Sub1) this).anInt9321);
	if (((Class89_Sub1) this).aClass311_9354 != null)
	    ((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4827
		= Class377.method6792(i, ((Class89_Sub1) this).anInt9321);
	((Class89_Sub1) this).anInt9367 = i;
	if (((Class89_Sub1) this).aClass307_9340 != null
	    && (((Class89_Sub1) this).anInt9367 & 0x10000) == 0) {
	    ((Class89_Sub1) this).aShortArray9334
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aShortArray4811);
	    ((Class89_Sub1) this).aShortArray9335
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aShortArray4813);
	    ((Class89_Sub1) this).aShortArray9371
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aShortArray4812);
	    ((Class89_Sub1) this).aByteArray9362
		= (((Class307) ((Class89_Sub1) this).aClass307_9340)
		   .aByteArray4814);
	    ((Class89_Sub1) this).aClass307_9340 = null;
	}
	((Class89_Sub1) this).aBool9357 = true;
	method15489();
    }
    
    boolean method15510(int i, int i_2417_, int i_2418_, int i_2419_,
			Class266 class266, boolean bool, int i_2420_) {
	Class268 class268
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3)
			     ((Class89_Sub1) this).aClass103_Sub3_9319)
			    .aClass268_9525);
	boolean bool_2421_ = false;
	float f = 3.4028235E38F;
	float f_2422_ = -3.4028235E38F;
	float f_2423_ = 3.4028235E38F;
	float f_2424_ = -3.4028235E38F;
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i_2425_ = ((((Class89_Sub1) this).anInt9366
			- ((Class89_Sub1) this).anInt9365)
		       >> 1);
	int i_2426_ = ((((Class89_Sub1) this).anInt9364
			- ((Class89_Sub1) this).anInt9363)
		       >> 1);
	int i_2427_ = ((((Class89_Sub1) this).anInt9359
			- ((Class89_Sub1) this).anInt9332)
		       >> 1);
	int i_2428_ = ((Class89_Sub1) this).anInt9365 + i_2425_;
	int i_2429_ = ((Class89_Sub1) this).anInt9363 + i_2426_;
	int i_2430_ = ((Class89_Sub1) this).anInt9332 + i_2427_;
	int i_2431_ = i_2428_ - (i_2425_ << i_2420_);
	int i_2432_ = i_2429_ - (i_2426_ << i_2420_);
	int i_2433_ = i_2430_ - (i_2427_ << i_2420_);
	int i_2434_ = i_2428_ + (i_2425_ << i_2420_);
	int i_2435_ = i_2429_ + (i_2426_ << i_2420_);
	int i_2436_ = i_2430_ + (i_2427_ << i_2420_);
	((Class89_Sub1) this).anIntArray9349[0] = i_2431_;
	((Class89_Sub1) this).anIntArray9387[0] = i_2432_;
	((Class89_Sub1) this).anIntArray9388[0] = i_2433_;
	((Class89_Sub1) this).anIntArray9349[1] = i_2434_;
	((Class89_Sub1) this).anIntArray9387[1] = i_2432_;
	((Class89_Sub1) this).anIntArray9388[1] = i_2433_;
	((Class89_Sub1) this).anIntArray9349[2] = i_2431_;
	((Class89_Sub1) this).anIntArray9387[2] = i_2435_;
	((Class89_Sub1) this).anIntArray9388[2] = i_2433_;
	((Class89_Sub1) this).anIntArray9349[3] = i_2434_;
	((Class89_Sub1) this).anIntArray9387[3] = i_2435_;
	((Class89_Sub1) this).anIntArray9388[3] = i_2433_;
	((Class89_Sub1) this).anIntArray9349[4] = i_2431_;
	((Class89_Sub1) this).anIntArray9387[4] = i_2432_;
	((Class89_Sub1) this).anIntArray9388[4] = i_2436_;
	((Class89_Sub1) this).anIntArray9349[5] = i_2434_;
	((Class89_Sub1) this).anIntArray9387[5] = i_2432_;
	((Class89_Sub1) this).anIntArray9388[5] = i_2436_;
	((Class89_Sub1) this).anIntArray9349[6] = i_2431_;
	((Class89_Sub1) this).anIntArray9387[6] = i_2435_;
	((Class89_Sub1) this).anIntArray9388[6] = i_2436_;
	((Class89_Sub1) this).anIntArray9349[7] = i_2434_;
	((Class89_Sub1) this).anIntArray9387[7] = i_2435_;
	((Class89_Sub1) this).anIntArray9388[7] = i_2436_;
	for (int i_2437_ = 0; i_2437_ < 8; i_2437_++) {
	    float f_2438_
		= (float) ((Class89_Sub1) this).anIntArray9349[i_2437_];
	    float f_2439_
		= (float) ((Class89_Sub1) this).anIntArray9387[i_2437_];
	    float f_2440_
		= (float) ((Class89_Sub1) this).anIntArray9388[i_2437_];
	    float f_2441_ = (class268.aFloatArray4353[2] * f_2438_
			     + class268.aFloatArray4353[6] * f_2439_
			     + class268.aFloatArray4353[10] * f_2440_
			     + class268.aFloatArray4353[14]);
	    float f_2442_ = (class268.aFloatArray4353[3] * f_2438_
			     + class268.aFloatArray4353[7] * f_2439_
			     + class268.aFloatArray4353[11] * f_2440_
			     + class268.aFloatArray4353[15]);
	    if (f_2441_ >= -f_2442_) {
		float f_2443_ = (class268.aFloatArray4353[0] * f_2438_
				 + class268.aFloatArray4353[4] * f_2439_
				 + class268.aFloatArray4353[8] * f_2440_
				 + class268.aFloatArray4353[12]);
		float f_2444_ = (class268.aFloatArray4353[1] * f_2438_
				 + class268.aFloatArray4353[5] * f_2439_
				 + class268.aFloatArray4353[9] * f_2440_
				 + class268.aFloatArray4353[13]);
		float f_2445_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).aFloat9528
		       + (((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).aFloat9529
			  * f_2443_ / f_2442_));
		float f_2446_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).aFloat9530
		       + (((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).aFloat9531
			  * f_2444_ / f_2442_));
		if (f_2445_ < f)
		    f = f_2445_;
		if (f_2445_ > f_2422_)
		    f_2422_ = f_2445_;
		if (f_2446_ < f_2423_)
		    f_2423_ = f_2446_;
		if (f_2446_ > f_2424_)
		    f_2424_ = f_2446_;
		bool_2421_ = true;
	    }
	}
	int i_2447_ = i + i_2418_;
	int i_2448_ = i_2417_ + i_2419_;
	if (bool_2421_ && (float) i_2447_ > f && (float) i < f_2422_
	    && (float) i_2448_ > f_2423_ && (float) i_2417_ < f_2424_) {
	    if (bool)
		return true;
	    if (((Class89_Sub1) this).anIntArray9384.length
		< ((Class89_Sub1) this).anInt9378) {
		((Class89_Sub1) this).anIntArray9384
		    = new int[((Class89_Sub1) this).anInt9378];
		((Class89_Sub1) this).anIntArray9385
		    = new int[((Class89_Sub1) this).anInt9378];
	    }
	    for (int i_2449_ = 0; i_2449_ < ((Class89_Sub1) this).anInt9325;
		 i_2449_++) {
		float f_2450_
		    = (float) ((Class89_Sub1) this).anIntArray9326[i_2449_];
		float f_2451_
		    = (float) ((Class89_Sub1) this).anIntArray9327[i_2449_];
		float f_2452_
		    = (float) ((Class89_Sub1) this).anIntArray9360[i_2449_];
		float f_2453_ = (class268.aFloatArray4353[2] * f_2450_
				 + class268.aFloatArray4353[6] * f_2451_
				 + class268.aFloatArray4353[10] * f_2452_
				 + class268.aFloatArray4353[14]);
		float f_2454_ = (class268.aFloatArray4353[3] * f_2450_
				 + class268.aFloatArray4353[7] * f_2451_
				 + class268.aFloatArray4353[11] * f_2452_
				 + class268.aFloatArray4353[15]);
		if (f_2453_ >= -f_2454_) {
		    float f_2455_ = (class268.aFloatArray4353[0] * f_2450_
				     + class268.aFloatArray4353[4] * f_2451_
				     + class268.aFloatArray4353[8] * f_2452_
				     + class268.aFloatArray4353[12]);
		    float f_2456_ = (class268.aFloatArray4353[1] * f_2450_
				     + class268.aFloatArray4353[5] * f_2451_
				     + class268.aFloatArray4353[9] * f_2452_
				     + class268.aFloatArray4353[13]);
		    int i_2457_
			= ((Class89_Sub1) this).anIntArray9374[i_2449_];
		    int i_2458_
			= ((Class89_Sub1) this).anIntArray9374[i_2449_ + 1];
		    for (int i_2459_ = i_2457_;
			 (i_2459_ < i_2458_
			  && (((Class89_Sub1) this).aShortArray9328[i_2459_]
			      != 0));
			 i_2459_++) {
			int i_2460_
			    = ((((Class89_Sub1) this).aShortArray9328[i_2459_]
				& 0xffff)
			       - 1);
			((Class89_Sub1) this).anIntArray9384[i_2460_]
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_2455_ / f_2454_));
			((Class89_Sub1) this).anIntArray9385[i_2460_]
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9530)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9531
					* f_2456_ / f_2454_));
		    }
		} else {
		    int i_2461_
			= ((Class89_Sub1) this).anIntArray9374[i_2449_];
		    int i_2462_
			= ((Class89_Sub1) this).anIntArray9374[i_2449_ + 1];
		    for (int i_2463_ = i_2461_;
			 (i_2463_ < i_2462_
			  && (((Class89_Sub1) this).aShortArray9328[i_2463_]
			      != 0));
			 i_2463_++) {
			int i_2464_
			    = ((((Class89_Sub1) this).aShortArray9328[i_2463_]
				& 0xffff)
			       - 1);
			((Class89_Sub1) this).anIntArray9384[i_2464_]
			    = -999999;
		    }
		}
	    }
	    for (int i_2465_ = 0; i_2465_ < ((Class89_Sub1) this).anInt9331;
		 i_2465_++) {
		if ((((Class89_Sub1) this).anIntArray9384
		     [(((Class89_Sub1) this).aShortArray9345[i_2465_]
		       & 0xffff)]) != -999999
		    && (((Class89_Sub1) this).anIntArray9384
			[(((Class89_Sub1) this).aShortArray9346[i_2465_]
			  & 0xffff)]) != -999999
		    && (((Class89_Sub1) this).anIntArray9384
			[(((Class89_Sub1) this).aShortArray9368[i_2465_]
			  & 0xffff)]) != -999999
		    && method15477(i, i_2417_, i_2447_, i_2448_,
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9345
				      [i_2465_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9346
				      [i_2465_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9368
				      [i_2465_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9345
				      [i_2465_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9346
				      [i_2465_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9368
				      [i_2465_]) & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method15511(int i, int i_2466_, int i_2467_, int i_2468_,
			Class266 class266, boolean bool, int i_2469_) {
	Class268 class268
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3)
			     ((Class89_Sub1) this).aClass103_Sub3_9319)
			    .aClass268_9525);
	boolean bool_2470_ = false;
	float f = 3.4028235E38F;
	float f_2471_ = -3.4028235E38F;
	float f_2472_ = 3.4028235E38F;
	float f_2473_ = -3.4028235E38F;
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	int i_2474_ = ((((Class89_Sub1) this).anInt9366
			- ((Class89_Sub1) this).anInt9365)
		       >> 1);
	int i_2475_ = ((((Class89_Sub1) this).anInt9364
			- ((Class89_Sub1) this).anInt9363)
		       >> 1);
	int i_2476_ = ((((Class89_Sub1) this).anInt9359
			- ((Class89_Sub1) this).anInt9332)
		       >> 1);
	int i_2477_ = ((Class89_Sub1) this).anInt9365 + i_2474_;
	int i_2478_ = ((Class89_Sub1) this).anInt9363 + i_2475_;
	int i_2479_ = ((Class89_Sub1) this).anInt9332 + i_2476_;
	int i_2480_ = i_2477_ - (i_2474_ << i_2469_);
	int i_2481_ = i_2478_ - (i_2475_ << i_2469_);
	int i_2482_ = i_2479_ - (i_2476_ << i_2469_);
	int i_2483_ = i_2477_ + (i_2474_ << i_2469_);
	int i_2484_ = i_2478_ + (i_2475_ << i_2469_);
	int i_2485_ = i_2479_ + (i_2476_ << i_2469_);
	((Class89_Sub1) this).anIntArray9349[0] = i_2480_;
	((Class89_Sub1) this).anIntArray9387[0] = i_2481_;
	((Class89_Sub1) this).anIntArray9388[0] = i_2482_;
	((Class89_Sub1) this).anIntArray9349[1] = i_2483_;
	((Class89_Sub1) this).anIntArray9387[1] = i_2481_;
	((Class89_Sub1) this).anIntArray9388[1] = i_2482_;
	((Class89_Sub1) this).anIntArray9349[2] = i_2480_;
	((Class89_Sub1) this).anIntArray9387[2] = i_2484_;
	((Class89_Sub1) this).anIntArray9388[2] = i_2482_;
	((Class89_Sub1) this).anIntArray9349[3] = i_2483_;
	((Class89_Sub1) this).anIntArray9387[3] = i_2484_;
	((Class89_Sub1) this).anIntArray9388[3] = i_2482_;
	((Class89_Sub1) this).anIntArray9349[4] = i_2480_;
	((Class89_Sub1) this).anIntArray9387[4] = i_2481_;
	((Class89_Sub1) this).anIntArray9388[4] = i_2485_;
	((Class89_Sub1) this).anIntArray9349[5] = i_2483_;
	((Class89_Sub1) this).anIntArray9387[5] = i_2481_;
	((Class89_Sub1) this).anIntArray9388[5] = i_2485_;
	((Class89_Sub1) this).anIntArray9349[6] = i_2480_;
	((Class89_Sub1) this).anIntArray9387[6] = i_2484_;
	((Class89_Sub1) this).anIntArray9388[6] = i_2485_;
	((Class89_Sub1) this).anIntArray9349[7] = i_2483_;
	((Class89_Sub1) this).anIntArray9387[7] = i_2484_;
	((Class89_Sub1) this).anIntArray9388[7] = i_2485_;
	for (int i_2486_ = 0; i_2486_ < 8; i_2486_++) {
	    float f_2487_
		= (float) ((Class89_Sub1) this).anIntArray9349[i_2486_];
	    float f_2488_
		= (float) ((Class89_Sub1) this).anIntArray9387[i_2486_];
	    float f_2489_
		= (float) ((Class89_Sub1) this).anIntArray9388[i_2486_];
	    float f_2490_ = (class268.aFloatArray4353[2] * f_2487_
			     + class268.aFloatArray4353[6] * f_2488_
			     + class268.aFloatArray4353[10] * f_2489_
			     + class268.aFloatArray4353[14]);
	    float f_2491_ = (class268.aFloatArray4353[3] * f_2487_
			     + class268.aFloatArray4353[7] * f_2488_
			     + class268.aFloatArray4353[11] * f_2489_
			     + class268.aFloatArray4353[15]);
	    if (f_2490_ >= -f_2491_) {
		float f_2492_ = (class268.aFloatArray4353[0] * f_2487_
				 + class268.aFloatArray4353[4] * f_2488_
				 + class268.aFloatArray4353[8] * f_2489_
				 + class268.aFloatArray4353[12]);
		float f_2493_ = (class268.aFloatArray4353[1] * f_2487_
				 + class268.aFloatArray4353[5] * f_2488_
				 + class268.aFloatArray4353[9] * f_2489_
				 + class268.aFloatArray4353[13]);
		float f_2494_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).aFloat9528
		       + (((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).aFloat9529
			  * f_2492_ / f_2491_));
		float f_2495_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).aFloat9530
		       + (((Class103_Sub3) (((Class89_Sub1) this)
					    .aClass103_Sub3_9319)).aFloat9531
			  * f_2493_ / f_2491_));
		if (f_2494_ < f)
		    f = f_2494_;
		if (f_2494_ > f_2471_)
		    f_2471_ = f_2494_;
		if (f_2495_ < f_2472_)
		    f_2472_ = f_2495_;
		if (f_2495_ > f_2473_)
		    f_2473_ = f_2495_;
		bool_2470_ = true;
	    }
	}
	int i_2496_ = i + i_2467_;
	int i_2497_ = i_2466_ + i_2468_;
	if (bool_2470_ && (float) i_2496_ > f && (float) i < f_2471_
	    && (float) i_2497_ > f_2472_ && (float) i_2466_ < f_2473_) {
	    if (bool)
		return true;
	    if (((Class89_Sub1) this).anIntArray9384.length
		< ((Class89_Sub1) this).anInt9378) {
		((Class89_Sub1) this).anIntArray9384
		    = new int[((Class89_Sub1) this).anInt9378];
		((Class89_Sub1) this).anIntArray9385
		    = new int[((Class89_Sub1) this).anInt9378];
	    }
	    for (int i_2498_ = 0; i_2498_ < ((Class89_Sub1) this).anInt9325;
		 i_2498_++) {
		float f_2499_
		    = (float) ((Class89_Sub1) this).anIntArray9326[i_2498_];
		float f_2500_
		    = (float) ((Class89_Sub1) this).anIntArray9327[i_2498_];
		float f_2501_
		    = (float) ((Class89_Sub1) this).anIntArray9360[i_2498_];
		float f_2502_ = (class268.aFloatArray4353[2] * f_2499_
				 + class268.aFloatArray4353[6] * f_2500_
				 + class268.aFloatArray4353[10] * f_2501_
				 + class268.aFloatArray4353[14]);
		float f_2503_ = (class268.aFloatArray4353[3] * f_2499_
				 + class268.aFloatArray4353[7] * f_2500_
				 + class268.aFloatArray4353[11] * f_2501_
				 + class268.aFloatArray4353[15]);
		if (f_2502_ >= -f_2503_) {
		    float f_2504_ = (class268.aFloatArray4353[0] * f_2499_
				     + class268.aFloatArray4353[4] * f_2500_
				     + class268.aFloatArray4353[8] * f_2501_
				     + class268.aFloatArray4353[12]);
		    float f_2505_ = (class268.aFloatArray4353[1] * f_2499_
				     + class268.aFloatArray4353[5] * f_2500_
				     + class268.aFloatArray4353[9] * f_2501_
				     + class268.aFloatArray4353[13]);
		    int i_2506_
			= ((Class89_Sub1) this).anIntArray9374[i_2498_];
		    int i_2507_
			= ((Class89_Sub1) this).anIntArray9374[i_2498_ + 1];
		    for (int i_2508_ = i_2506_;
			 (i_2508_ < i_2507_
			  && (((Class89_Sub1) this).aShortArray9328[i_2508_]
			      != 0));
			 i_2508_++) {
			int i_2509_
			    = ((((Class89_Sub1) this).aShortArray9328[i_2508_]
				& 0xffff)
			       - 1);
			((Class89_Sub1) this).anIntArray9384[i_2509_]
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9528)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9529
					* f_2504_ / f_2503_));
			((Class89_Sub1) this).anIntArray9385[i_2509_]
			    = (int) ((((Class103_Sub3) (((Class89_Sub1) this)
							.aClass103_Sub3_9319))
				      .aFloat9530)
				     + (((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319)).aFloat9531
					* f_2505_ / f_2503_));
		    }
		} else {
		    int i_2510_
			= ((Class89_Sub1) this).anIntArray9374[i_2498_];
		    int i_2511_
			= ((Class89_Sub1) this).anIntArray9374[i_2498_ + 1];
		    for (int i_2512_ = i_2510_;
			 (i_2512_ < i_2511_
			  && (((Class89_Sub1) this).aShortArray9328[i_2512_]
			      != 0));
			 i_2512_++) {
			int i_2513_
			    = ((((Class89_Sub1) this).aShortArray9328[i_2512_]
				& 0xffff)
			       - 1);
			((Class89_Sub1) this).anIntArray9384[i_2513_]
			    = -999999;
		    }
		}
	    }
	    for (int i_2514_ = 0; i_2514_ < ((Class89_Sub1) this).anInt9331;
		 i_2514_++) {
		if ((((Class89_Sub1) this).anIntArray9384
		     [(((Class89_Sub1) this).aShortArray9345[i_2514_]
		       & 0xffff)]) != -999999
		    && (((Class89_Sub1) this).anIntArray9384
			[(((Class89_Sub1) this).aShortArray9346[i_2514_]
			  & 0xffff)]) != -999999
		    && (((Class89_Sub1) this).anIntArray9384
			[(((Class89_Sub1) this).aShortArray9368[i_2514_]
			  & 0xffff)]) != -999999
		    && method15477(i, i_2466_, i_2496_, i_2497_,
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9345
				      [i_2514_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9346
				      [i_2514_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9385
				    [(((Class89_Sub1) this).aShortArray9368
				      [i_2514_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9345
				      [i_2514_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9346
				      [i_2514_]) & 0xffff]),
				   (((Class89_Sub1) this).anIntArray9384
				    [(((Class89_Sub1) this).aShortArray9368
				      [i_2514_]) & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method15512(int i, int i_2515_, int i_2516_, int i_2517_,
			int i_2518_, int i_2519_, int i_2520_, int i_2521_,
			int i_2522_, int i_2523_) {
	if (i_2517_ < i_2518_ && i_2517_ < i_2519_ && i_2517_ < i_2520_)
	    return false;
	if (i_2515_ > i_2518_ && i_2515_ > i_2519_ && i_2515_ > i_2520_)
	    return false;
	if (i_2516_ < i_2521_ && i_2516_ < i_2522_ && i_2516_ < i_2523_)
	    return false;
	if (i > i_2521_ && i > i_2522_ && i > i_2523_)
	    return false;
	return true;
    }
    
    public int method1982() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9366;
    }
    
    public void method1997(Class89 class89, int i, int i_2524_, int i_2525_,
			   boolean bool) {
	Class89_Sub1 class89_sub1_2526_ = (Class89_Sub1) class89;
	if (((Class89_Sub1) this).anInt9331 != 0
	    && ((Class89_Sub1) class89_sub1_2526_).anInt9331 != 0) {
	    int i_2527_ = ((Class89_Sub1) class89_sub1_2526_).anInt9325;
	    int[] is = ((Class89_Sub1) class89_sub1_2526_).anIntArray9326;
	    int[] is_2528_
		= ((Class89_Sub1) class89_sub1_2526_).anIntArray9327;
	    int[] is_2529_
		= ((Class89_Sub1) class89_sub1_2526_).anIntArray9360;
	    short[] is_2530_
		= ((Class89_Sub1) class89_sub1_2526_).aShortArray9334;
	    short[] is_2531_
		= ((Class89_Sub1) class89_sub1_2526_).aShortArray9335;
	    short[] is_2532_
		= ((Class89_Sub1) class89_sub1_2526_).aShortArray9371;
	    byte[] is_2533_
		= ((Class89_Sub1) class89_sub1_2526_).aByteArray9362;
	    short[] is_2534_;
	    short[] is_2535_;
	    short[] is_2536_;
	    byte[] is_2537_;
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		is_2534_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			    .aShortArray4811);
		is_2535_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			    .aShortArray4813);
		is_2536_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			    .aShortArray4812);
		is_2537_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			    .aByteArray4814);
	    } else {
		is_2534_ = null;
		is_2535_ = null;
		is_2536_ = null;
		is_2537_ = null;
	    }
	    short[] is_2538_;
	    short[] is_2539_;
	    short[] is_2540_;
	    byte[] is_2541_;
	    if (((Class89_Sub1) class89_sub1_2526_).aClass307_9340 != null) {
		is_2538_ = ((Class307) (((Class89_Sub1) class89_sub1_2526_)
					.aClass307_9340)).aShortArray4811;
		is_2539_ = ((Class307) (((Class89_Sub1) class89_sub1_2526_)
					.aClass307_9340)).aShortArray4813;
		is_2540_ = ((Class307) (((Class89_Sub1) class89_sub1_2526_)
					.aClass307_9340)).aShortArray4812;
		is_2541_ = ((Class307) (((Class89_Sub1) class89_sub1_2526_)
					.aClass307_9340)).aByteArray4814;
	    } else {
		is_2538_ = null;
		is_2539_ = null;
		is_2540_ = null;
		is_2541_ = null;
	    }
	    int[] is_2542_
		= ((Class89_Sub1) class89_sub1_2526_).anIntArray9374;
	    short[] is_2543_
		= ((Class89_Sub1) class89_sub1_2526_).aShortArray9328;
	    if (!((Class89_Sub1) class89_sub1_2526_).aBool9323)
		class89_sub1_2526_.method15471();
	    int i_2544_ = ((Class89_Sub1) class89_sub1_2526_).anInt9363;
	    int i_2545_ = ((Class89_Sub1) class89_sub1_2526_).anInt9364;
	    int i_2546_ = ((Class89_Sub1) class89_sub1_2526_).anInt9365;
	    int i_2547_ = ((Class89_Sub1) class89_sub1_2526_).anInt9366;
	    int i_2548_ = ((Class89_Sub1) class89_sub1_2526_).anInt9332;
	    int i_2549_ = ((Class89_Sub1) class89_sub1_2526_).anInt9359;
	    for (int i_2550_ = 0; i_2550_ < ((Class89_Sub1) this).anInt9325;
		 i_2550_++) {
		int i_2551_
		    = ((Class89_Sub1) this).anIntArray9327[i_2550_] - i_2524_;
		if (i_2551_ >= i_2544_ && i_2551_ <= i_2545_) {
		    int i_2552_
			= ((Class89_Sub1) this).anIntArray9326[i_2550_] - i;
		    if (i_2552_ >= i_2546_ && i_2552_ <= i_2547_) {
			int i_2553_
			    = (((Class89_Sub1) this).anIntArray9360[i_2550_]
			       - i_2525_);
			if (i_2553_ >= i_2548_ && i_2553_ <= i_2549_) {
			    int i_2554_ = -1;
			    int i_2555_ = (((Class89_Sub1) this).anIntArray9374
					   [i_2550_]);
			    int i_2556_ = (((Class89_Sub1) this).anIntArray9374
					   [i_2550_ + 1]);
			    for (int i_2557_ = i_2555_;
				 (i_2557_ < i_2556_
				  && (((Class89_Sub1) this).aShortArray9328
				      [i_2557_]) != 0);
				 i_2557_++) {
				i_2554_ = ((((Class89_Sub1) this)
					    .aShortArray9328[i_2557_])
					   & 0xffff) - 1;
				if ((((Class89_Sub1) this).aByteArray9362
				     [i_2554_])
				    != 0)
				    break;
			    }
			    if (i_2554_ != -1) {
				for (int i_2558_ = 0; i_2558_ < i_2527_;
				     i_2558_++) {
				    if (i_2552_ == is[i_2558_]
					&& i_2553_ == is_2529_[i_2558_]
					&& i_2551_ == is_2528_[i_2558_]) {
					int i_2559_ = -1;
					i_2555_ = is_2542_[i_2558_];
					i_2556_ = is_2542_[i_2558_ + 1];
					for (int i_2560_ = i_2555_;
					     (i_2560_ < i_2556_
					      && is_2543_[i_2560_] != 0);
					     i_2560_++) {
					    i_2559_ = (is_2543_[i_2560_] - 1
						       & 0xffff);
					    if (is_2533_[i_2559_] != 0)
						break;
					}
					if (i_2559_ != -1) {
					    if (is_2534_ == null) {
						((Class89_Sub1) this)
						    .aClass307_9340
						    = new Class307();
						is_2534_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4811
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9334),
							-2138656043));
						is_2535_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4813
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9335),
							-570036147));
						is_2536_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aShortArray4812
						    = (Class518.method11659
						       ((((Class89_Sub1) this)
							 .aShortArray9371),
							-1273440002));
						is_2537_
						    = ((Class307)
						       (((Class89_Sub1) this)
							.aClass307_9340))
							  .aByteArray4814
						    = (Class554.method12275
						       ((((Class89_Sub1) this)
							 .aByteArray9362),
							-841739618));
					    }
					    if (is_2538_ == null) {
						Class307 class307
						    = (((Class89_Sub1)
							class89_sub1_2526_)
							   .aClass307_9340
						       = new Class307());
						is_2538_
						    = ((Class307) class307)
							  .aShortArray4811
						    = (Class518.method11659
						       (is_2530_,
							-1441237752));
						is_2539_
						    = ((Class307) class307)
							  .aShortArray4813
						    = (Class518.method11659
						       (is_2531_,
							-1683096356));
						is_2540_
						    = ((Class307) class307)
							  .aShortArray4812
						    = (Class518.method11659
						       (is_2532_,
							-1612446834));
						is_2541_
						    = ((Class307) class307)
							  .aByteArray4814
						    = (Class554.method12275
						       (is_2533_, -841739618));
					    }
					    short i_2561_
						= (((Class89_Sub1) this)
						   .aShortArray9334[i_2554_]);
					    short i_2562_
						= (((Class89_Sub1) this)
						   .aShortArray9335[i_2554_]);
					    short i_2563_
						= (((Class89_Sub1) this)
						   .aShortArray9371[i_2554_]);
					    byte i_2564_
						= (((Class89_Sub1) this)
						   .aByteArray9362[i_2554_]);
					    i_2555_ = is_2542_[i_2558_];
					    i_2556_ = is_2542_[i_2558_ + 1];
					    for (int i_2565_ = i_2555_;
						 i_2565_ < i_2556_;
						 i_2565_++) {
						int i_2566_
						    = is_2543_[i_2565_] - 1;
						if (i_2566_ == -1)
						    break;
						if (is_2541_[i_2566_] != 0) {
						    is_2538_[i_2566_]
							+= i_2561_;
						    is_2539_[i_2566_]
							+= i_2562_;
						    is_2540_[i_2566_]
							+= i_2563_;
						    is_2541_[i_2566_]
							+= i_2564_;
						}
					    }
					    i_2561_ = is_2530_[i_2559_];
					    i_2562_ = is_2531_[i_2559_];
					    i_2563_ = is_2532_[i_2559_];
					    i_2564_ = is_2533_[i_2559_];
					    i_2555_
						= (((Class89_Sub1) this)
						   .anIntArray9374[i_2550_]);
					    i_2556_ = (((Class89_Sub1) this)
						       .anIntArray9374
						       [i_2550_ + 1]);
					    for (int i_2567_ = i_2555_;
						 (i_2567_ < i_2556_
						  && (((Class89_Sub1) this)
						      .aShortArray9328
						      [i_2567_]) != 0);
						 i_2567_++) {
						int i_2568_
						    = (((((Class89_Sub1) this)
							 .aShortArray9328
							 [i_2567_])
							& 0xffff)
						       - 1);
						if (is_2537_[i_2568_] != 0) {
						    is_2534_[i_2568_]
							+= i_2561_;
						    is_2535_[i_2568_]
							+= i_2562_;
						    is_2536_[i_2568_]
							+= i_2563_;
						    is_2537_[i_2568_]
							+= i_2564_;
						}
					    }
					    class89_sub1_2526_.method15493();
					    method15493();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method15513(Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1) {
	if (((Class89_Sub1) this).anIntArray9384.length
	    < ((Class89_Sub1) this).anInt9378) {
	    ((Class89_Sub1) this).anIntArray9384
		= new int[((Class89_Sub1) this).anInt9378];
	    ((Class89_Sub1) this).anIntArray9385
		= new int[((Class89_Sub1) this).anInt9378];
	}
	for (int i = 0; i < ((Class89_Sub1) this).anInt9325; i++) {
	    int i_2569_
		= (((((Class89_Sub1) this).anIntArray9326[i]
		     - ((((Class89_Sub1) this).anIntArray9327[i]
			 * ((Class103_Sub3) (((Class89_Sub1) this)
					     .aClass103_Sub3_9319)).anInt9520)
			>> 8))
		    >> ((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489)
		   - (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11291));
	    int i_2570_
		= (((((Class89_Sub1) this).anIntArray9360[i]
		     - ((((Class89_Sub1) this).anIntArray9327[i]
			 * ((Class103_Sub3) (((Class89_Sub1) this)
					     .aClass103_Sub3_9319)).anInt9627)
			>> 8))
		    >> ((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319).anInt9489)
		   - (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11290));
	    int i_2571_ = ((Class89_Sub1) this).anIntArray9374[i];
	    int i_2572_ = ((Class89_Sub1) this).anIntArray9374[i + 1];
	    for (int i_2573_ = i_2571_;
		 (i_2573_ < i_2572_
		  && ((Class89_Sub1) this).aShortArray9328[i_2573_] != 0);
		 i_2573_++) {
		int i_2574_ = ((((Class89_Sub1) this).aShortArray9328[i_2573_]
				& 0xffff)
			       - 1);
		((Class89_Sub1) this).anIntArray9384[i_2574_] = i_2569_;
		((Class89_Sub1) this).anIntArray9385[i_2574_] = i_2570_;
	    }
	}
	for (int i = 0; i < ((Class89_Sub1) this).anInt9342; i++) {
	    if (((Class89_Sub1) this).aByteArray9344 == null
		|| ((Class89_Sub1) this).aByteArray9344[i] <= 128) {
		int i_2575_
		    = ((Class89_Sub1) this).aShortArray9345[i] & 0xffff;
		int i_2576_
		    = ((Class89_Sub1) this).aShortArray9346[i] & 0xffff;
		int i_2577_
		    = ((Class89_Sub1) this).aShortArray9368[i] & 0xffff;
		int i_2578_ = ((Class89_Sub1) this).anIntArray9384[i_2575_];
		int i_2579_ = ((Class89_Sub1) this).anIntArray9384[i_2576_];
		int i_2580_ = ((Class89_Sub1) this).anIntArray9384[i_2577_];
		int i_2581_ = ((Class89_Sub1) this).anIntArray9385[i_2575_];
		int i_2582_ = ((Class89_Sub1) this).anIntArray9385[i_2576_];
		int i_2583_ = ((Class89_Sub1) this).anIntArray9385[i_2577_];
		if (((i_2578_ - i_2579_) * (i_2582_ - i_2583_)
		     - (i_2582_ - i_2581_) * (i_2580_ - i_2579_))
		    > 0)
		    class241_sub39_sub17_sub1.method17676(i_2581_, i_2582_,
							  i_2583_, i_2578_,
							  i_2579_, i_2580_);
	    }
	}
    }
    
    void method15514(Class266 class266) {
	if (((Class89_Sub1) this).anInt9342 != 0
	    && (method15481() && method15522())) {
	    if (aClass365_9317 == null) {
		/* empty */
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15728();
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15710();
	    Class361 class361
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass361_9540);
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		(0, (((Class311) ((Class89_Sub1) this).aClass311_9352)
		     .anInterface40_4828));
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		(1, (((Class311) ((Class89_Sub1) this).aClass311_9353)
		     .anInterface40_4828));
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		(2, (((Class311) ((Class89_Sub1) this).aClass311_9341)
		     .anInterface40_4828));
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15718
		(((Class386) ((Class89_Sub1) this).aClass386_9351)
		 .anInterface33_5708);
	    ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		.method5203(class266);
	    class361.method6494(((Class89_Sub1) this).aClass103_Sub3_9319
				.aClass268_9511);
	    class361.aClass268_5510.method5198();
	    if (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		.aBool9565) {
		Class86 class86
		    = ((Class89_Sub1) this).aClass103_Sub3_9319.method15633();
		class361.aClass285_5514.method5548
		    (0.0F, 1.0F, 0.0F,
		     (float) -(((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
			       .anInt9608));
		class361.aClass285_5514.method5531(3.0F
						   / (float) (class86.anInt1252
							      * -1282025259));
		class361.aClass287_5515.method5568
		    (((float) (class86.anInt1251 * 1897985763 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (class86.anInt1251 * 1897985763 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (class86.anInt1251 * 1897985763 >> 0 & 0xff)
		      / 255.0F));
	    } else {
		class361.aClass285_5514.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5515.method5568(0.0F, 0.0F, 0.0F);
	    }
	    if (((Class89_Sub1) this).aClass103_Sub3_9319.anInt9613 > 0) {
		class361.aClass285_5516.method5548(0.0F, 0.0F, 1.0F,
						   -(((Class89_Sub1) this)
						     .aClass103_Sub3_9319
						     .aFloat9615));
		class361.aClass287_5507.method5568
		    ((float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 0
			      & 0xff) / 255.0F);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5203(class266);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5223();
		class361.aClass285_5514.method5543(((Class89_Sub1) this)
						   .aClass103_Sub3_9319
						   .aClass268_9511);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5203(class266);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5202
		    (((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9504);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5223();
		class361.aClass285_5516.method5543(((Class89_Sub1) this)
						   .aClass103_Sub3_9319
						   .aClass268_9511);
		class361.aClass285_5516.method5531(1.0F
						   / ((((Class89_Sub1) this)
						       .aClass103_Sub3_9319
						       .aFloat9616)
						      - (((Class89_Sub1) this)
							 .aClass103_Sub3_9319
							 .aFloat9615)));
	    } else {
		class361.aClass285_5516.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5507.method5568(0.0F, 0.0F, 0.0F);
	    }
	    if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		((Class89_Sub1) this).aClass103_Sub3_9319.method15716
		    (((Class103_Sub3) (((Class89_Sub1) this)
				       .aClass103_Sub3_9319)).aClass366_9641);
		if (((Class89_Sub1) this).aClass103_Sub3_9319.aBool9488)
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15889(false);
		for (int i = 0;
		     i < ((Class89_Sub1) this).anIntArray9386.length; i++) {
		    int i_2584_ = ((Class89_Sub1) this).anIntArray9347[i];
		    int i_2585_ = ((Class89_Sub1) this).anIntArray9347[i + 1];
		    int i_2586_
			= ((Class89_Sub1) this).aShortArray9348[i_2584_];
		    boolean bool = false;
		    byte i_2587_ = 0;
		    if (i_2586_ != -1) {
			Class101 class101
			    = ((Class89_Sub1) this).aClass103_Sub3_9319
				  .aClass107_1458
				  .method2680(i_2586_ & 0xffff, -115278456);
			class361.anInterface41_5525
			    = ((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aClass379_9518.method6844(class101);
			bool = !Class628.method13474(class101.aByte1427,
						     -768281831);
			class361.aClass268_5510.aFloatArray4353[12]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1376 / 64.0F
			       % 1.0F);
			class361.aClass268_5510.aFloatArray4353[13]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1396 / 64.0F
			       % 1.0F);
			if (class101.aClass529_1391 == Class529.aClass529_6943)
			    i_2587_ = class101.aByte1372;
		    } else {
			class361.anInterface41_5525
			    = (((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInterface41_9584);
			float[] fs = class361.aClass268_5510.aFloatArray4353;
			class361.aClass268_5510.aFloatArray4353[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15707(i_2587_);
		    class361.anInt5522
			= ((Class89_Sub1) this).anIntArray9386[i];
		    class361.anInt5523
			= ((Class89_Sub1) this).anIntArray9373[i];
		    class361.anInt5506 = i_2584_ * 3;
		    class361.anInt5517 = i_2585_ - i_2584_;
		    class361.method6495(bool);
		}
	    } else {
		((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		    (3, (((Class311) ((Class89_Sub1) this).aClass311_9354)
			 .anInterface40_4828));
		((Class89_Sub1) this).aClass103_Sub3_9319.method15716
		    (((Class103_Sub3) (((Class89_Sub1) this)
				       .aClass103_Sub3_9319)).aClass366_9602);
		Class266 class266_2588_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319)
		       .aClass266_9588);
		class266_2588_.method5175(class266);
		class266_2588_.method5124();
		int i = 0;
		if (((Class89_Sub1) this).aClass103_Sub3_9319.aBool9488)
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15889(true);
		else {
		    class361.aClass287_5518.method5568((((Class89_Sub1) this)
							.aClass103_Sub3_9319
							.aFloatArray9558[0]),
						       (((Class89_Sub1) this)
							.aClass103_Sub3_9319
							.aFloatArray9558[1]),
						       (((Class89_Sub1) this)
							.aClass103_Sub3_9319
							.aFloatArray9558[2]));
		    class361.aClass287_5518.method5594(class266_2588_);
		    class361.aClass287_5519.method5568
			((((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9563)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9564)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9556)));
		    class361.aClass287_5520.method5568
			((-((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9563)),
			 (-((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9564)),
			 (-((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9556)));
		    class361.aClass287_5521.method5568
			((((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9566
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9563)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9566
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9564)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9566
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9556)));
		    if (((Class89_Sub1) this).aClass103_Sub3_9319.anInt9570
			> 0) {
			i = (((Class89_Sub1) this).aClass103_Sub3_9319
			     .anInt9570);
			Class287 class287
			    = (((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
			       .aClass287_9513);
			for (int i_2589_ = 0; i_2589_ < i; i_2589_++) {
			    Class241_Sub43 class241_sub43
				= (((Class89_Sub1) this).aClass103_Sub3_9319
				   .aClass241_Sub43Array9569[i_2589_]);
			    int i_2590_
				= class241_sub43.method16461(-46576557);
			    class287
				.method5655(class241_sub43.aClass287_10177);
			    class287.method5600(class266_2588_);
			    class361.aFloatArray5504[i_2589_ * 4 + 0]
				= class287.aFloat4477;
			    class361.aFloatArray5504[i_2589_ * 4 + 1]
				= class287.aFloat4474;
			    class361.aFloatArray5504[i_2589_ * 4 + 2]
				= class287.aFloat4479;
			    class361.aFloatArray5504[i_2589_ * 4 + 3]
				= 1.0F / ((float) class241_sub43
						      .method16468(1143403757)
					  * 2.5F);
			    float f = (class241_sub43.method16458(1970488141)
				       / 255.0F);
			    class361.aFloatArray5524[i_2589_ * 4 + 0]
				= (float) (i_2590_ >> 16 & 0xff) * f;
			    class361.aFloatArray5524[i_2589_ * 4 + 1]
				= (float) (i_2590_ >> 8 & 0xff) * f;
			    class361.aFloatArray5524[i_2589_ * 4 + 2]
				= (float) (i_2590_ & 0xff) * f;
			    class361.aFloatArray5524[i_2589_ * 4 + 3] = 1.0F;
			}
		    }
		}
		for (int i_2591_ = 0;
		     i_2591_ < ((Class89_Sub1) this).anIntArray9386.length;
		     i_2591_++) {
		    int i_2592_
			= ((Class89_Sub1) this).anIntArray9347[i_2591_];
		    int i_2593_
			= ((Class89_Sub1) this).anIntArray9347[i_2591_ + 1];
		    int i_2594_
			= ((Class89_Sub1) this).aShortArray9348[i_2592_];
		    byte i_2595_ = 11;
		    Class101 class101 = null;
		    byte i_2596_ = 0;
		    if (i_2594_ != -1) {
			class101
			    = ((Class89_Sub1) this).aClass103_Sub3_9319
				  .aClass107_1458
				  .method2680(i_2594_ & 0xffff, 2025592143);
			class361.anInterface41_5525
			    = ((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aClass379_9518.method6844(class101);
			i_2595_ = class101.aByte1427;
			class361.method6493(class101.aByte1428);
			class361.aClass268_5510.aFloatArray4353[12]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1376 / 64.0F
			       % 1.0F);
			class361.aClass268_5510.aFloatArray4353[13]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1396 / 64.0F
			       % 1.0F);
			if (class101.aClass529_1391 == Class529.aClass529_6943)
			    i_2596_ = class101.aByte1372;
		    } else {
			class361.anInterface41_5525
			    = (((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInterface41_9584);
			float[] fs = class361.aClass268_5510.aFloatArray4353;
			class361.aClass268_5510.aFloatArray4353[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15707(i_2596_);
		    class361.anInt5522
			= ((Class89_Sub1) this).anIntArray9386[i_2591_];
		    class361.anInt5523
			= ((Class89_Sub1) this).anIntArray9373[i_2591_];
		    class361.anInt5506 = i_2592_ * 3;
		    class361.anInt5517 = i_2593_ - i_2592_;
		    switch (i_2595_) {
		    case 6:
			class361.method6495(!Class628.method13474(i_2595_,
								  -768281831));
			break;
		    case 1:
			class361.aClass287_5508.method5568
			    ((((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[12]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[13]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[14]));
			class361.aClass287_5508.method5600(class266_2588_);
			class361.method6507(i);
			break;
		    case 7:
			class361.aClass287_5508.method5568
			    ((((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[12]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[13]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[14]));
			class361.aClass287_5508.method5600(class266_2588_);
			class361.aClass268_5511.method5203(class266);
			class361.anInterface30_5509
			    = ((Class89_Sub1) this).aClass103_Sub3_9319
				  .method15636();
			class361.method6506(i);
			break;
		    case 5:
			if (!((Class89_Sub1) this).aClass103_Sub3_9319
			     .aBool9488) {
			    Class369_Sub1_Sub1 class369_sub1_sub1
				= (((Class103_Sub3)
				    ((Class89_Sub1) this).aClass103_Sub3_9319)
				   .aClass369_Sub1_Sub1_9605);
			    class369_sub1_sub1.method16926(class101.aByte1428,
							   (class101.anInt1429
							    * 133353543),
							   -393322627);
			    class369_sub1_sub1.aClass268_10675
				.method5203(class266);
			    class369_sub1_sub1.aClass268_10673
				.method5203(class266);
			    class369_sub1_sub1.aClass268_10673.method5202
				(((Class89_Sub1) this).aClass103_Sub3_9319
				 .aClass268_9526);
			    class369_sub1_sub1.anInt10680
				= (((Class89_Sub1) this).anIntArray9386
				   [i_2591_]) * 338980157;
			    class369_sub1_sub1.anInt10682
				= (((Class89_Sub1) this).anIntArray9373
				   [i_2591_]) * 653452521;
			    class369_sub1_sub1.anInt10669
				= i_2592_ * -1348869755;
			    class369_sub1_sub1.anInt10684
				= (i_2593_ - i_2592_) * 2090018719;
			    class369_sub1_sub1.method16925(-1309862297);
			} else
			    class361.method6496(i);
			break;
		    default:
			class361.method6496(i);
		    }
		}
	    }
	    method15489();
	}
    }
    
    void method15515(Class266 class266) {
	if (((Class89_Sub1) this).anInt9342 != 0
	    && (method15481() && method15522())) {
	    if (aClass365_9317 == null) {
		/* empty */
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15728();
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15710();
	    Class361 class361
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass361_9540);
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		(0, (((Class311) ((Class89_Sub1) this).aClass311_9352)
		     .anInterface40_4828));
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		(1, (((Class311) ((Class89_Sub1) this).aClass311_9353)
		     .anInterface40_4828));
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		(2, (((Class311) ((Class89_Sub1) this).aClass311_9341)
		     .anInterface40_4828));
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method15718
		(((Class386) ((Class89_Sub1) this).aClass386_9351)
		 .anInterface33_5708);
	    ((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		.method5203(class266);
	    class361.method6494(((Class89_Sub1) this).aClass103_Sub3_9319
				.aClass268_9511);
	    class361.aClass268_5510.method5198();
	    if (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		.aBool9565) {
		Class86 class86
		    = ((Class89_Sub1) this).aClass103_Sub3_9319.method15633();
		class361.aClass285_5514.method5548
		    (0.0F, 1.0F, 0.0F,
		     (float) -(((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
			       .anInt9608));
		class361.aClass285_5514.method5531(3.0F
						   / (float) (class86.anInt1252
							      * -1282025259));
		class361.aClass287_5515.method5568
		    (((float) (class86.anInt1251 * 1897985763 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (class86.anInt1251 * 1897985763 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (class86.anInt1251 * 1897985763 >> 0 & 0xff)
		      / 255.0F));
	    } else {
		class361.aClass285_5514.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5515.method5568(0.0F, 0.0F, 0.0F);
	    }
	    if (((Class89_Sub1) this).aClass103_Sub3_9319.anInt9613 > 0) {
		class361.aClass285_5516.method5548(0.0F, 0.0F, 1.0F,
						   -(((Class89_Sub1) this)
						     .aClass103_Sub3_9319
						     .aFloat9615));
		class361.aClass287_5507.method5568
		    ((float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 0
			      & 0xff) / 255.0F);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5203(class266);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5223();
		class361.aClass285_5514.method5543(((Class89_Sub1) this)
						   .aClass103_Sub3_9319
						   .aClass268_9511);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5203(class266);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5202
		    (((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9504);
		((Class89_Sub1) this).aClass103_Sub3_9319.aClass268_9511
		    .method5223();
		class361.aClass285_5516.method5543(((Class89_Sub1) this)
						   .aClass103_Sub3_9319
						   .aClass268_9511);
		class361.aClass285_5516.method5531(1.0F
						   / ((((Class89_Sub1) this)
						       .aClass103_Sub3_9319
						       .aFloat9616)
						      - (((Class89_Sub1) this)
							 .aClass103_Sub3_9319
							 .aFloat9615)));
	    } else {
		class361.aClass285_5516.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5507.method5568(0.0F, 0.0F, 0.0F);
	    }
	    if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		((Class89_Sub1) this).aClass103_Sub3_9319.method15716
		    (((Class103_Sub3) (((Class89_Sub1) this)
				       .aClass103_Sub3_9319)).aClass366_9641);
		if (((Class89_Sub1) this).aClass103_Sub3_9319.aBool9488)
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15889(false);
		for (int i = 0;
		     i < ((Class89_Sub1) this).anIntArray9386.length; i++) {
		    int i_2597_ = ((Class89_Sub1) this).anIntArray9347[i];
		    int i_2598_ = ((Class89_Sub1) this).anIntArray9347[i + 1];
		    int i_2599_
			= ((Class89_Sub1) this).aShortArray9348[i_2597_];
		    boolean bool = false;
		    byte i_2600_ = 0;
		    if (i_2599_ != -1) {
			Class101 class101
			    = ((Class89_Sub1) this).aClass103_Sub3_9319
				  .aClass107_1458
				  .method2680(i_2599_ & 0xffff, -788677584);
			class361.anInterface41_5525
			    = ((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aClass379_9518.method6844(class101);
			bool = !Class628.method13474(class101.aByte1427,
						     -768281831);
			class361.aClass268_5510.aFloatArray4353[12]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1376 / 64.0F
			       % 1.0F);
			class361.aClass268_5510.aFloatArray4353[13]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1396 / 64.0F
			       % 1.0F);
			if (class101.aClass529_1391 == Class529.aClass529_6943)
			    i_2600_ = class101.aByte1372;
		    } else {
			class361.anInterface41_5525
			    = (((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInterface41_9584);
			float[] fs = class361.aClass268_5510.aFloatArray4353;
			class361.aClass268_5510.aFloatArray4353[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15707(i_2600_);
		    class361.anInt5522
			= ((Class89_Sub1) this).anIntArray9386[i];
		    class361.anInt5523
			= ((Class89_Sub1) this).anIntArray9373[i];
		    class361.anInt5506 = i_2597_ * 3;
		    class361.anInt5517 = i_2598_ - i_2597_;
		    class361.method6495(bool);
		}
	    } else {
		((Class89_Sub1) this).aClass103_Sub3_9319.method15955
		    (3, (((Class311) ((Class89_Sub1) this).aClass311_9354)
			 .anInterface40_4828));
		((Class89_Sub1) this).aClass103_Sub3_9319.method15716
		    (((Class103_Sub3) (((Class89_Sub1) this)
				       .aClass103_Sub3_9319)).aClass366_9602);
		Class266 class266_2601_
		    = (((Class103_Sub3)
			((Class89_Sub1) this).aClass103_Sub3_9319)
		       .aClass266_9588);
		class266_2601_.method5175(class266);
		class266_2601_.method5124();
		int i = 0;
		if (((Class89_Sub1) this).aClass103_Sub3_9319.aBool9488)
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15889(true);
		else {
		    class361.aClass287_5518.method5568((((Class89_Sub1) this)
							.aClass103_Sub3_9319
							.aFloatArray9558[0]),
						       (((Class89_Sub1) this)
							.aClass103_Sub3_9319
							.aFloatArray9558[1]),
						       (((Class89_Sub1) this)
							.aClass103_Sub3_9319
							.aFloatArray9558[2]));
		    class361.aClass287_5518.method5594(class266_2601_);
		    class361.aClass287_5519.method5568
			((((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9563)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9564)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9556)));
		    class361.aClass287_5520.method5568
			((-((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9563)),
			 (-((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9564)),
			 (-((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9556)));
		    class361.aClass287_5521.method5568
			((((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9566
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9563)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9566
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9564)),
			 (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9566
			  * (((Class89_Sub1) this).aClass103_Sub3_9319
			     .aFloat9556)));
		    if (((Class89_Sub1) this).aClass103_Sub3_9319.anInt9570
			> 0) {
			i = (((Class89_Sub1) this).aClass103_Sub3_9319
			     .anInt9570);
			Class287 class287
			    = (((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
			       .aClass287_9513);
			for (int i_2602_ = 0; i_2602_ < i; i_2602_++) {
			    Class241_Sub43 class241_sub43
				= (((Class89_Sub1) this).aClass103_Sub3_9319
				   .aClass241_Sub43Array9569[i_2602_]);
			    int i_2603_
				= class241_sub43.method16461(-2114880259);
			    class287
				.method5655(class241_sub43.aClass287_10177);
			    class287.method5600(class266_2601_);
			    class361.aFloatArray5504[i_2602_ * 4 + 0]
				= class287.aFloat4477;
			    class361.aFloatArray5504[i_2602_ * 4 + 1]
				= class287.aFloat4474;
			    class361.aFloatArray5504[i_2602_ * 4 + 2]
				= class287.aFloat4479;
			    class361.aFloatArray5504[i_2602_ * 4 + 3]
				= 1.0F / ((float) class241_sub43
						      .method16468(1143403757)
					  * 2.5F);
			    float f = (class241_sub43.method16458(1990727560)
				       / 255.0F);
			    class361.aFloatArray5524[i_2602_ * 4 + 0]
				= (float) (i_2603_ >> 16 & 0xff) * f;
			    class361.aFloatArray5524[i_2602_ * 4 + 1]
				= (float) (i_2603_ >> 8 & 0xff) * f;
			    class361.aFloatArray5524[i_2602_ * 4 + 2]
				= (float) (i_2603_ & 0xff) * f;
			    class361.aFloatArray5524[i_2602_ * 4 + 3] = 1.0F;
			}
		    }
		}
		for (int i_2604_ = 0;
		     i_2604_ < ((Class89_Sub1) this).anIntArray9386.length;
		     i_2604_++) {
		    int i_2605_
			= ((Class89_Sub1) this).anIntArray9347[i_2604_];
		    int i_2606_
			= ((Class89_Sub1) this).anIntArray9347[i_2604_ + 1];
		    int i_2607_
			= ((Class89_Sub1) this).aShortArray9348[i_2605_];
		    byte i_2608_ = 11;
		    Class101 class101 = null;
		    byte i_2609_ = 0;
		    if (i_2607_ != -1) {
			class101
			    = ((Class89_Sub1) this).aClass103_Sub3_9319
				  .aClass107_1458
				  .method2680(i_2607_ & 0xffff, 1754794441);
			class361.anInterface41_5525
			    = ((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
				  .aClass379_9518.method6844(class101);
			i_2608_ = class101.aByte1427;
			class361.method6493(class101.aByte1428);
			class361.aClass268_5510.aFloatArray4353[12]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1376 / 64.0F
			       % 1.0F);
			class361.aClass268_5510.aFloatArray4353[13]
			    = ((float) ((((Class89_Sub1) this)
					 .aClass103_Sub3_9319.anInt9601)
					% 128000)
			       / 1000.0F * (float) class101.aByte1396 / 64.0F
			       % 1.0F);
			if (class101.aClass529_1391 == Class529.aClass529_6943)
			    i_2609_ = class101.aByte1372;
		    } else {
			class361.anInterface41_5525
			    = (((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInterface41_9584);
			float[] fs = class361.aClass268_5510.aFloatArray4353;
			class361.aClass268_5510.aFloatArray4353[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    ((Class89_Sub1) this).aClass103_Sub3_9319
			.method15707(i_2609_);
		    class361.anInt5522
			= ((Class89_Sub1) this).anIntArray9386[i_2604_];
		    class361.anInt5523
			= ((Class89_Sub1) this).anIntArray9373[i_2604_];
		    class361.anInt5506 = i_2605_ * 3;
		    class361.anInt5517 = i_2606_ - i_2605_;
		    switch (i_2608_) {
		    case 6:
			class361.method6495(!Class628.method13474(i_2608_,
								  -768281831));
			break;
		    case 1:
			class361.aClass287_5508.method5568
			    ((((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[12]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[13]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[14]));
			class361.aClass287_5508.method5600(class266_2601_);
			class361.method6507(i);
			break;
		    case 7:
			class361.aClass287_5508.method5568
			    ((((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[12]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[13]),
			     (((Class103_Sub3)
			       ((Class89_Sub1) this).aClass103_Sub3_9319)
			      .aClass268_9505.aFloatArray4353[14]));
			class361.aClass287_5508.method5600(class266_2601_);
			class361.aClass268_5511.method5203(class266);
			class361.anInterface30_5509
			    = ((Class89_Sub1) this).aClass103_Sub3_9319
				  .method15636();
			class361.method6506(i);
			break;
		    case 5:
			if (!((Class89_Sub1) this).aClass103_Sub3_9319
			     .aBool9488) {
			    Class369_Sub1_Sub1 class369_sub1_sub1
				= (((Class103_Sub3)
				    ((Class89_Sub1) this).aClass103_Sub3_9319)
				   .aClass369_Sub1_Sub1_9605);
			    class369_sub1_sub1.method16926(class101.aByte1428,
							   (class101.anInt1429
							    * 133353543),
							   -1087373524);
			    class369_sub1_sub1.aClass268_10675
				.method5203(class266);
			    class369_sub1_sub1.aClass268_10673
				.method5203(class266);
			    class369_sub1_sub1.aClass268_10673.method5202
				(((Class89_Sub1) this).aClass103_Sub3_9319
				 .aClass268_9526);
			    class369_sub1_sub1.anInt10680
				= (((Class89_Sub1) this).anIntArray9386
				   [i_2604_]) * 338980157;
			    class369_sub1_sub1.anInt10682
				= (((Class89_Sub1) this).anIntArray9373
				   [i_2604_]) * 653452521;
			    class369_sub1_sub1.anInt10669
				= i_2605_ * -1348869755;
			    class369_sub1_sub1.anInt10684
				= (i_2606_ - i_2605_) * 2090018719;
			    class369_sub1_sub1.method16925(-1309862297);
			} else
			    class361.method6496(i);
			break;
		    default:
			class361.method6496(i);
		    }
		}
	    }
	    method15489();
	}
    }
    
    void method15516(Class268 class268) {
	if (((Class89_Sub1) this).aClass315Array9333 != null) {
	    ((Class89_Sub1) this).aClass103_Sub3_9319
		.method2308(!((Class89_Sub1) this).aBool9358);
	    Class266 class266
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass266_9588);
	    Class358 class358
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass358_9595);
	    boolean bool
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anInt9613 > 0;
	    if (bool)
		class358.aClass287_5473.method5568
		    ((float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 0
			      & 0xff) / 255.0F);
	    else
		class358.aClass287_5473.method5568(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < ((Class89_Sub1) this).anInt9375; i++) {
		Class315 class315
		    = ((Class89_Sub1) this).aClass315Array9333[i];
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i];
		if (!((Class315) class315).aBool4845
		    || !((Class89_Sub1) this).aClass103_Sub3_9319
			    .method2331()) {
		    float f = ((float) ((((Class89_Sub1) this).anIntArray9326
					 [((Class315) class315).anInt4843])
					+ (((Class89_Sub1) this).anIntArray9326
					   [((Class315) class315).anInt4839])
					+ (((Class89_Sub1) this).anIntArray9326
					   [((Class315) class315).anInt4840]))
			       * 0.3333333F);
		    float f_2610_
			= ((float) ((((Class89_Sub1) this).anIntArray9327
				     [((Class315) class315).anInt4843])
				    + (((Class89_Sub1) this).anIntArray9327
				       [((Class315) class315).anInt4839])
				    + (((Class89_Sub1) this).anIntArray9327
				       [((Class315) class315).anInt4840]))
			   * 0.3333333F);
		    float f_2611_
			= ((float) ((((Class89_Sub1) this).anIntArray9360
				     [((Class315) class315).anInt4843])
				    + (((Class89_Sub1) this).anIntArray9360
				       [((Class315) class315).anInt4839])
				    + (((Class89_Sub1) this).anIntArray9360
				       [((Class315) class315).anInt4840]))
			   * 0.3333333F);
		    float f_2612_ = (class268.aFloatArray4353[0] * f
				     + class268.aFloatArray4353[4] * f_2610_
				     + class268.aFloatArray4353[8] * f_2611_
				     + class268.aFloatArray4353[12]);
		    float f_2613_ = (class268.aFloatArray4353[1] * f
				     + class268.aFloatArray4353[5] * f_2610_
				     + class268.aFloatArray4353[9] * f_2611_
				     + class268.aFloatArray4353[13]);
		    float f_2614_ = (class268.aFloatArray4353[2] * f
				     + class268.aFloatArray4353[6] * f_2610_
				     + class268.aFloatArray4353[10] * f_2611_
				     + class268.aFloatArray4353[14]);
		    float f_2615_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2612_ * f_2612_
							  + f_2613_ * f_2613_
							  + (f_2614_
							     * f_2614_))))
			   * (float) ((Class315) class315).anInt4846);
		    class266.method5121
			(((Class381) class381).anInt5666,
			 (((Class381) class381).anInt5662
			  * ((Class315) class315).aShort4838) >> 7,
			 (((Class381) class381).anInt5663
			  * ((Class315) class315).aShort4842) >> 7,
			 (f_2612_ + (float) ((Class381) class381).anInt5664
			  - f_2612_ * f_2615_),
			 (f_2613_ + (float) ((Class381) class381).anInt5665
			  - f_2613_ * f_2615_),
			 f_2614_ - f_2614_ * f_2615_);
		    class266.method5134(((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319))
					.aClass266_9503);
		    ((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
			.aClass268_9646.method5203(class266);
		    class358.method6476(((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319))
					.aClass268_9646);
		    class358.aClass268_5474.method5198();
		    class358.anInt5471 = ((Class381) class381).anInt5661;
		    if (bool)
			class358.aFloat5468
			    = 1.0F - (((((Class89_Sub1) this)
					.aClass103_Sub3_9319.aFloat9616)
				       - f_2614_)
				      / ((((Class89_Sub1) this)
					  .aClass103_Sub3_9319.aFloat9616)
					 - (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9615)));
		    class358.anInterface41_5470 = null;
		    if (((Class315) class315).aShort4844 != -1)
			class358.anInterface41_5470
			    = (((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
				   .aClass379_9518.method6844
			       (((Class89_Sub1) this).aClass103_Sub3_9319
				    .aClass107_1458.method2680
				(((Class315) class315).aShort4844 & 0xffff,
				 1394058676)));
		    class358.method6469(bool);
		}
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method2308(true);
	}
    }
    
    void method15517(Class268 class268) {
	if (((Class89_Sub1) this).aClass315Array9333 != null) {
	    ((Class89_Sub1) this).aClass103_Sub3_9319
		.method2308(!((Class89_Sub1) this).aBool9358);
	    Class266 class266
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass266_9588);
	    Class358 class358
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass358_9595);
	    boolean bool
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anInt9613 > 0;
	    if (bool)
		class358.aClass287_5473.method5568
		    ((float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 0
			      & 0xff) / 255.0F);
	    else
		class358.aClass287_5473.method5568(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < ((Class89_Sub1) this).anInt9375; i++) {
		Class315 class315
		    = ((Class89_Sub1) this).aClass315Array9333[i];
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i];
		if (!((Class315) class315).aBool4845
		    || !((Class89_Sub1) this).aClass103_Sub3_9319
			    .method2331()) {
		    float f = ((float) ((((Class89_Sub1) this).anIntArray9326
					 [((Class315) class315).anInt4843])
					+ (((Class89_Sub1) this).anIntArray9326
					   [((Class315) class315).anInt4839])
					+ (((Class89_Sub1) this).anIntArray9326
					   [((Class315) class315).anInt4840]))
			       * 0.3333333F);
		    float f_2616_
			= ((float) ((((Class89_Sub1) this).anIntArray9327
				     [((Class315) class315).anInt4843])
				    + (((Class89_Sub1) this).anIntArray9327
				       [((Class315) class315).anInt4839])
				    + (((Class89_Sub1) this).anIntArray9327
				       [((Class315) class315).anInt4840]))
			   * 0.3333333F);
		    float f_2617_
			= ((float) ((((Class89_Sub1) this).anIntArray9360
				     [((Class315) class315).anInt4843])
				    + (((Class89_Sub1) this).anIntArray9360
				       [((Class315) class315).anInt4839])
				    + (((Class89_Sub1) this).anIntArray9360
				       [((Class315) class315).anInt4840]))
			   * 0.3333333F);
		    float f_2618_ = (class268.aFloatArray4353[0] * f
				     + class268.aFloatArray4353[4] * f_2616_
				     + class268.aFloatArray4353[8] * f_2617_
				     + class268.aFloatArray4353[12]);
		    float f_2619_ = (class268.aFloatArray4353[1] * f
				     + class268.aFloatArray4353[5] * f_2616_
				     + class268.aFloatArray4353[9] * f_2617_
				     + class268.aFloatArray4353[13]);
		    float f_2620_ = (class268.aFloatArray4353[2] * f
				     + class268.aFloatArray4353[6] * f_2616_
				     + class268.aFloatArray4353[10] * f_2617_
				     + class268.aFloatArray4353[14]);
		    float f_2621_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2618_ * f_2618_
							  + f_2619_ * f_2619_
							  + (f_2620_
							     * f_2620_))))
			   * (float) ((Class315) class315).anInt4846);
		    class266.method5121
			(((Class381) class381).anInt5666,
			 (((Class381) class381).anInt5662
			  * ((Class315) class315).aShort4838) >> 7,
			 (((Class381) class381).anInt5663
			  * ((Class315) class315).aShort4842) >> 7,
			 (f_2618_ + (float) ((Class381) class381).anInt5664
			  - f_2618_ * f_2621_),
			 (f_2619_ + (float) ((Class381) class381).anInt5665
			  - f_2619_ * f_2621_),
			 f_2620_ - f_2620_ * f_2621_);
		    class266.method5134(((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319))
					.aClass266_9503);
		    ((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
			.aClass268_9646.method5203(class266);
		    class358.method6476(((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319))
					.aClass268_9646);
		    class358.aClass268_5474.method5198();
		    class358.anInt5471 = ((Class381) class381).anInt5661;
		    if (bool)
			class358.aFloat5468
			    = 1.0F - (((((Class89_Sub1) this)
					.aClass103_Sub3_9319.aFloat9616)
				       - f_2620_)
				      / ((((Class89_Sub1) this)
					  .aClass103_Sub3_9319.aFloat9616)
					 - (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9615)));
		    class358.anInterface41_5470 = null;
		    if (((Class315) class315).aShort4844 != -1)
			class358.anInterface41_5470
			    = (((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
				   .aClass379_9518.method6844
			       (((Class89_Sub1) this).aClass103_Sub3_9319
				    .aClass107_1458.method2680
				(((Class315) class315).aShort4844 & 0xffff,
				 -1220802784)));
		    class358.method6469(bool);
		}
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method2308(true);
	}
    }
    
    void method15518(Class268 class268) {
	if (((Class89_Sub1) this).aClass315Array9333 != null) {
	    ((Class89_Sub1) this).aClass103_Sub3_9319
		.method2308(!((Class89_Sub1) this).aBool9358);
	    Class266 class266
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass266_9588);
	    Class358 class358
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass358_9595);
	    boolean bool
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anInt9613 > 0;
	    if (bool)
		class358.aClass287_5473.method5568
		    ((float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 0
			      & 0xff) / 255.0F);
	    else
		class358.aClass287_5473.method5568(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < ((Class89_Sub1) this).anInt9375; i++) {
		Class315 class315
		    = ((Class89_Sub1) this).aClass315Array9333[i];
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i];
		if (!((Class315) class315).aBool4845
		    || !((Class89_Sub1) this).aClass103_Sub3_9319
			    .method2331()) {
		    float f = ((float) ((((Class89_Sub1) this).anIntArray9326
					 [((Class315) class315).anInt4843])
					+ (((Class89_Sub1) this).anIntArray9326
					   [((Class315) class315).anInt4839])
					+ (((Class89_Sub1) this).anIntArray9326
					   [((Class315) class315).anInt4840]))
			       * 0.3333333F);
		    float f_2622_
			= ((float) ((((Class89_Sub1) this).anIntArray9327
				     [((Class315) class315).anInt4843])
				    + (((Class89_Sub1) this).anIntArray9327
				       [((Class315) class315).anInt4839])
				    + (((Class89_Sub1) this).anIntArray9327
				       [((Class315) class315).anInt4840]))
			   * 0.3333333F);
		    float f_2623_
			= ((float) ((((Class89_Sub1) this).anIntArray9360
				     [((Class315) class315).anInt4843])
				    + (((Class89_Sub1) this).anIntArray9360
				       [((Class315) class315).anInt4839])
				    + (((Class89_Sub1) this).anIntArray9360
				       [((Class315) class315).anInt4840]))
			   * 0.3333333F);
		    float f_2624_ = (class268.aFloatArray4353[0] * f
				     + class268.aFloatArray4353[4] * f_2622_
				     + class268.aFloatArray4353[8] * f_2623_
				     + class268.aFloatArray4353[12]);
		    float f_2625_ = (class268.aFloatArray4353[1] * f
				     + class268.aFloatArray4353[5] * f_2622_
				     + class268.aFloatArray4353[9] * f_2623_
				     + class268.aFloatArray4353[13]);
		    float f_2626_ = (class268.aFloatArray4353[2] * f
				     + class268.aFloatArray4353[6] * f_2622_
				     + class268.aFloatArray4353[10] * f_2623_
				     + class268.aFloatArray4353[14]);
		    float f_2627_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2624_ * f_2624_
							  + f_2625_ * f_2625_
							  + (f_2626_
							     * f_2626_))))
			   * (float) ((Class315) class315).anInt4846);
		    class266.method5121
			(((Class381) class381).anInt5666,
			 (((Class381) class381).anInt5662
			  * ((Class315) class315).aShort4838) >> 7,
			 (((Class381) class381).anInt5663
			  * ((Class315) class315).aShort4842) >> 7,
			 (f_2624_ + (float) ((Class381) class381).anInt5664
			  - f_2624_ * f_2627_),
			 (f_2625_ + (float) ((Class381) class381).anInt5665
			  - f_2625_ * f_2627_),
			 f_2626_ - f_2626_ * f_2627_);
		    class266.method5134(((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319))
					.aClass266_9503);
		    ((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
			.aClass268_9646.method5203(class266);
		    class358.method6476(((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319))
					.aClass268_9646);
		    class358.aClass268_5474.method5198();
		    class358.anInt5471 = ((Class381) class381).anInt5661;
		    if (bool)
			class358.aFloat5468
			    = 1.0F - (((((Class89_Sub1) this)
					.aClass103_Sub3_9319.aFloat9616)
				       - f_2626_)
				      / ((((Class89_Sub1) this)
					  .aClass103_Sub3_9319.aFloat9616)
					 - (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9615)));
		    class358.anInterface41_5470 = null;
		    if (((Class315) class315).aShort4844 != -1)
			class358.anInterface41_5470
			    = (((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
				   .aClass379_9518.method6844
			       (((Class89_Sub1) this).aClass103_Sub3_9319
				    .aClass107_1458.method2680
				(((Class315) class315).aShort4844 & 0xffff,
				 542484738)));
		    class358.method6469(bool);
		}
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method2308(true);
	}
    }
    
    void method15519(Class268 class268) {
	if (((Class89_Sub1) this).aClass315Array9333 != null) {
	    ((Class89_Sub1) this).aClass103_Sub3_9319
		.method2308(!((Class89_Sub1) this).aBool9358);
	    Class266 class266
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass266_9588);
	    Class358 class358
		= (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
		   .aClass358_9595);
	    boolean bool
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anInt9613 > 0;
	    if (bool)
		class358.aClass287_5473.method5568
		    ((float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class89_Sub1) this).aClass103_Sub3_9319
			       .anInt9589) >> 0
			      & 0xff) / 255.0F);
	    else
		class358.aClass287_5473.method5568(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < ((Class89_Sub1) this).anInt9375; i++) {
		Class315 class315
		    = ((Class89_Sub1) this).aClass315Array9333[i];
		Class381 class381
		    = ((Class89_Sub1) this).aClass381Array9379[i];
		if (!((Class315) class315).aBool4845
		    || !((Class89_Sub1) this).aClass103_Sub3_9319
			    .method2331()) {
		    float f = ((float) ((((Class89_Sub1) this).anIntArray9326
					 [((Class315) class315).anInt4843])
					+ (((Class89_Sub1) this).anIntArray9326
					   [((Class315) class315).anInt4839])
					+ (((Class89_Sub1) this).anIntArray9326
					   [((Class315) class315).anInt4840]))
			       * 0.3333333F);
		    float f_2628_
			= ((float) ((((Class89_Sub1) this).anIntArray9327
				     [((Class315) class315).anInt4843])
				    + (((Class89_Sub1) this).anIntArray9327
				       [((Class315) class315).anInt4839])
				    + (((Class89_Sub1) this).anIntArray9327
				       [((Class315) class315).anInt4840]))
			   * 0.3333333F);
		    float f_2629_
			= ((float) ((((Class89_Sub1) this).anIntArray9360
				     [((Class315) class315).anInt4843])
				    + (((Class89_Sub1) this).anIntArray9360
				       [((Class315) class315).anInt4839])
				    + (((Class89_Sub1) this).anIntArray9360
				       [((Class315) class315).anInt4840]))
			   * 0.3333333F);
		    float f_2630_ = (class268.aFloatArray4353[0] * f
				     + class268.aFloatArray4353[4] * f_2628_
				     + class268.aFloatArray4353[8] * f_2629_
				     + class268.aFloatArray4353[12]);
		    float f_2631_ = (class268.aFloatArray4353[1] * f
				     + class268.aFloatArray4353[5] * f_2628_
				     + class268.aFloatArray4353[9] * f_2629_
				     + class268.aFloatArray4353[13]);
		    float f_2632_ = (class268.aFloatArray4353[2] * f
				     + class268.aFloatArray4353[6] * f_2628_
				     + class268.aFloatArray4353[10] * f_2629_
				     + class268.aFloatArray4353[14]);
		    float f_2633_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2630_ * f_2630_
							  + f_2631_ * f_2631_
							  + (f_2632_
							     * f_2632_))))
			   * (float) ((Class315) class315).anInt4846);
		    class266.method5121
			(((Class381) class381).anInt5666,
			 (((Class381) class381).anInt5662
			  * ((Class315) class315).aShort4838) >> 7,
			 (((Class381) class381).anInt5663
			  * ((Class315) class315).aShort4842) >> 7,
			 (f_2630_ + (float) ((Class381) class381).anInt5664
			  - f_2630_ * f_2633_),
			 (f_2631_ + (float) ((Class381) class381).anInt5665
			  - f_2631_ * f_2633_),
			 f_2632_ - f_2632_ * f_2633_);
		    class266.method5134(((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319))
					.aClass266_9503);
		    ((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
			.aClass268_9646.method5203(class266);
		    class358.method6476(((Class103_Sub3)
					 (((Class89_Sub1) this)
					  .aClass103_Sub3_9319))
					.aClass268_9646);
		    class358.aClass268_5474.method5198();
		    class358.anInt5471 = ((Class381) class381).anInt5661;
		    if (bool)
			class358.aFloat5468
			    = 1.0F - (((((Class89_Sub1) this)
					.aClass103_Sub3_9319.aFloat9616)
				       - f_2632_)
				      / ((((Class89_Sub1) this)
					  .aClass103_Sub3_9319.aFloat9616)
					 - (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9615)));
		    class358.anInterface41_5470 = null;
		    if (((Class315) class315).aShort4844 != -1)
			class358.anInterface41_5470
			    = (((Class103_Sub3)
				((Class89_Sub1) this).aClass103_Sub3_9319)
				   .aClass379_9518.method6844
			       (((Class89_Sub1) this).aClass103_Sub3_9319
				    .aClass107_1458.method2680
				(((Class315) class315).aShort4844 & 0xffff,
				 941840124)));
		    class358.method6469(bool);
		}
	    }
	    ((Class89_Sub1) this).aClass103_Sub3_9319.method2308(true);
	}
    }
    
    boolean method15520() {
	if (((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707)
	    return true;
	if ((((Class386) ((Class89_Sub1) this).aClass386_9351)
	     .anInterface33_5706)
	    == null)
	    ((Class386) ((Class89_Sub1) this).aClass386_9351)
		.anInterface33_5706
		= ((Class89_Sub1) this).aClass103_Sub3_9319.method15714(false);
	Interface33 interface33
	    = (((Class386) ((Class89_Sub1) this).aClass386_9351)
	       .anInterface33_5706);
	interface33.method185(((Class89_Sub1) this).anInt9342 * 6);
	Unsafe unsafe = ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	if (unsafe != null) {
	    int i = ((Class89_Sub1) this).anInt9342 * 6;
	    long l = interface33.method262(0, i);
	    if (l == 0L)
		return false;
	    for (int i_2634_ = 0; i_2634_ < ((Class89_Sub1) this).anInt9342;
		 i_2634_++) {
		unsafe.putShort(l, (((Class89_Sub1) this).aShortArray9345
				    [i_2634_]));
		l += 2L;
		unsafe.putShort(l, (((Class89_Sub1) this).aShortArray9346
				    [i_2634_]));
		l += 2L;
		unsafe.putShort(l, (((Class89_Sub1) this).aShortArray9368
				    [i_2634_]));
		l += 2L;
	    }
	    interface33.method192();
	    ((Class386) ((Class89_Sub1) this).aClass386_9351)
		.anInterface33_5708
		= interface33;
	    ((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707 = true;
	    ((Class89_Sub1) this).aBool9357 = true;
	    return true;
	}
	ByteBuffer bytebuffer
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aByteBuffer9490;
	bytebuffer.clear();
	for (int i = 0; i < ((Class89_Sub1) this).anInt9342; i++) {
	    bytebuffer.putShort(((Class89_Sub1) this).aShortArray9345[i]);
	    bytebuffer.putShort(((Class89_Sub1) this).aShortArray9346[i]);
	    bytebuffer.putShort(((Class89_Sub1) this).aShortArray9368[i]);
	}
	if (interface33.method268(0, bytebuffer.position(),
				  (((Class89_Sub1) this).aClass103_Sub3_9319
				   .aLong9491))) {
	    ((Class386) ((Class89_Sub1) this).aClass386_9351)
		.anInterface33_5708
		= interface33;
	    ((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707 = true;
	    ((Class89_Sub1) this).aBool9357 = true;
	    return true;
	}
	return false;
    }
    
    void method1952() {
	/* empty */
    }
    
    public boolean method1969(int i, int i_2635_, Class266 class266,
			      boolean bool, int i_2636_) {
	return method15476(i, i_2635_, 0, 0, class266, bool, i_2636_);
    }
    
    boolean method15521() {
	boolean bool
	    = !((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826;
	boolean bool_2637_
	    = ((((Class89_Sub1) this).anInt9321 & 0x37) != 0
	       && !(((Class311) ((Class89_Sub1) this).aClass311_9354)
		    .aBool4826));
	boolean bool_2638_
	    = !((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826;
	boolean bool_2639_
	    = !((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826;
	if (!bool_2638_ && !bool && !bool_2637_ && !bool_2639_)
	    return true;
	boolean bool_2640_ = true;
	if (bool_2638_ && ((Class89_Sub1) this).aShortArray9350 != null) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9352)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9352)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9352)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 12, 12);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 12;
		long l = interface40.method262(0, i);
		for (int i_2641_ = 0;
		     i_2641_ < ((Class89_Sub1) this).anInt9378; i_2641_++) {
		    short i_2642_
			= ((Class89_Sub1) this).aShortArray9350[i_2641_];
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9326[i_2642_]));
		    l += 4L;
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9327[i_2642_]));
		    l += 4L;
		    unsafe.putFloat(l, (float) (((Class89_Sub1) this)
						.anIntArray9360[i_2642_]));
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9326
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9327
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		    bytebuffer.putFloat((float) ((Class89_Sub1) this)
						.anIntArray9360
						[(((Class89_Sub1) this)
						  .aShortArray9350[i])]);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9352)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9352).aBool4826 = true;
	}
	if (bool) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9353)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9353)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9353)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 4, 4);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 4;
		long l = interface40.method262(0, i);
		if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		    short[] is;
		    short[] is_2643_;
		    short[] is_2644_;
		    byte[] is_2645_;
		    if (((Class89_Sub1) this).aClass307_9340 != null) {
			is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			      .aShortArray4811);
			is_2643_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4813;
			is_2644_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4812;
			is_2645_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aByteArray4814;
		    } else {
			is = ((Class89_Sub1) this).aShortArray9334;
			is_2643_ = ((Class89_Sub1) this).aShortArray9335;
			is_2644_ = ((Class89_Sub1) this).aShortArray9371;
			is_2645_ = ((Class89_Sub1) this).aByteArray9362;
		    }
		    float f
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    float f_2646_
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    for (int i_2647_ = 0;
			 i_2647_ < ((Class89_Sub1) this).anInt9378;
			 i_2647_++) {
			short i_2648_
			    = ((Class89_Sub1) this).aShortArray9355[i_2647_];
			int i_2649_
			    = method15483((((Class89_Sub1) this)
					   .aShortArray9361[i_2648_]) & 0xffff,
					  (((Class89_Sub1) this)
					   .aShortArray9348[i_2648_]),
					  ((Class89_Sub1) this).aShort9322);
			float f_2650_ = ((float) (i_2649_ >> 16 & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9563));
			float f_2651_ = ((float) (i_2649_ >> 8 & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9564));
			float f_2652_ = ((float) (i_2649_ & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9556));
			byte i_2653_ = is_2645_[i_2647_];
			float f_2654_;
			if (i_2653_ == 0)
			    f_2654_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i_2647_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_2643_[i_2647_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_2644_[i_2647_])
				   * 0.0026041667F);
			else
			    f_2654_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i_2647_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_2643_[i_2647_]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_2644_[i_2647_])
				   / ((float) i_2653_ * 256.0F));
			float f_2655_
			    = ((((Class89_Sub1) this).aClass103_Sub3_9319
				.aFloat9566)
			       + f_2654_ * (f_2654_ < 0.0F ? f_2646_ : f));
			int i_2656_ = (int) (f_2650_ * f_2655_);
			if (i_2656_ < 0)
			    i_2656_ = 0;
			else if (i_2656_ > 255)
			    i_2656_ = 255;
			int i_2657_ = (int) (f_2651_ * f_2655_);
			if (i_2657_ < 0)
			    i_2657_ = 0;
			else if (i_2657_ > 255)
			    i_2657_ = 255;
			int i_2658_ = (int) (f_2652_ * f_2655_);
			if (i_2658_ < 0)
			    i_2658_ = 0;
			else if (i_2658_ > 255)
			    i_2658_ = 255;
			unsafe.putInt(l,
				      (255 - (((Class89_Sub1) this)
					      .aByteArray9344[i_2648_]) << 24
				       | i_2656_ << 16 | i_2657_ << 8
				       | i_2658_));
			l += 4L;
		    }
		} else {
		    for (int i_2659_ = 0;
			 i_2659_ < ((Class89_Sub1) this).anInt9378;
			 i_2659_++) {
			short i_2660_
			    = ((Class89_Sub1) this).aShortArray9355[i_2659_];
			int i_2661_
			    = (255 - (((Class89_Sub1) this).aByteArray9344
				      [i_2660_]) << 24
			       | method15483(((((Class89_Sub1) this)
					       .aShortArray9361[i_2660_])
					      & 0xffff),
					     (((Class89_Sub1) this)
					      .aShortArray9348[i_2660_]),
					     (((Class89_Sub1) this)
					      .aShort9322)));
			unsafe.putInt(l, i_2661_);
			l += 4L;
		    }
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		if ((((Class89_Sub1) this).anInt9321 & 0x37) == 0) {
		    short[] is;
		    short[] is_2662_;
		    short[] is_2663_;
		    byte[] is_2664_;
		    if (((Class89_Sub1) this).aClass307_9340 != null) {
			is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			      .aShortArray4811);
			is_2662_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4813;
			is_2663_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aShortArray4812;
			is_2664_
			    = ((Class307) (((Class89_Sub1) this)
					   .aClass307_9340)).aByteArray4814;
		    } else {
			is = ((Class89_Sub1) this).aShortArray9334;
			is_2662_ = ((Class89_Sub1) this).aShortArray9335;
			is_2663_ = ((Class89_Sub1) this).aShortArray9371;
			is_2664_ = ((Class89_Sub1) this).aByteArray9362;
		    }
		    float f
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9609
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    float f_2665_
			= (((Class89_Sub1) this).aClass103_Sub3_9319.aFloat9568
			   * 768.0F
			   / (float) ((Class89_Sub1) this).aShort9383);
		    for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
			short i_2666_
			    = ((Class89_Sub1) this).aShortArray9355[i];
			int i_2667_
			    = method15483((((Class89_Sub1) this)
					   .aShortArray9361[i_2666_]) & 0xffff,
					  (((Class89_Sub1) this)
					   .aShortArray9348[i_2666_]),
					  ((Class89_Sub1) this).aShort9322);
			float f_2668_ = ((float) (i_2667_ >> 16 & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9563));
			float f_2669_ = ((float) (i_2667_ >> 8 & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9564));
			float f_2670_ = ((float) (i_2667_ & 0xff)
					 * (((Class89_Sub1) this)
					    .aClass103_Sub3_9319.aFloat9556));
			byte i_2671_ = is_2664_[i];
			float f_2672_;
			if (i_2671_ == 0)
			    f_2672_
				= ((((Class89_Sub1) this).aClass103_Sub3_9319
				    .aFloatArray9558[0]) * (float) is[i]
				   + ((((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558[1])
				      * (float) is_2662_[i])
				   + ((((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558[2])
				      * (float) is_2663_[i])) * 0.0026041667F;
			else
			    f_2672_
				= (((((Class89_Sub1) this).aClass103_Sub3_9319
				     .aFloatArray9558[0]) * (float) is[i]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [1]) * (float) is_2662_[i]
				    + (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aFloatArray9558
				       [2]) * (float) is_2663_[i])
				   / ((float) i_2671_ * 256.0F));
			float f_2673_
			    = ((((Class89_Sub1) this).aClass103_Sub3_9319
				.aFloat9566)
			       + f_2672_ * (f_2672_ < 0.0F ? f_2665_ : f));
			int i_2674_ = (int) (f_2668_ * f_2673_);
			if (i_2674_ < 0)
			    i_2674_ = 0;
			else if (i_2674_ > 255)
			    i_2674_ = 255;
			int i_2675_ = (int) (f_2669_ * f_2673_);
			if (i_2675_ < 0)
			    i_2675_ = 0;
			else if (i_2675_ > 255)
			    i_2675_ = 255;
			int i_2676_ = (int) (f_2670_ * f_2673_);
			if (i_2676_ < 0)
			    i_2676_ = 0;
			else if (i_2676_ > 255)
			    i_2676_ = 255;
			bytebuffer.putInt((255 - (((Class89_Sub1) this)
						  .aByteArray9344[i_2666_])
					   << 24)
					  | i_2674_ << 16 | i_2675_ << 8
					  | i_2676_);
		    }
		} else {
		    for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
			short i_2677_
			    = ((Class89_Sub1) this).aShortArray9355[i];
			int i_2678_
			    = (255 - (((Class89_Sub1) this).aByteArray9344
				      [i_2677_]) << 24
			       | method15483(((((Class89_Sub1) this)
					       .aShortArray9361[i_2677_])
					      & 0xffff),
					     (((Class89_Sub1) this)
					      .aShortArray9348[i_2677_]),
					     (((Class89_Sub1) this)
					      .aShort9322)));
			bytebuffer.putInt(i_2678_);
		    }
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9353)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9353).aBool4826 = true;
	}
	if (bool_2637_) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9354)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9354)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9354)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 12, 12);
	    short[] is;
	    short[] is_2679_;
	    short[] is_2680_;
	    byte[] is_2681_;
	    if (((Class89_Sub1) this).aClass307_9340 != null) {
		is = (((Class307) ((Class89_Sub1) this).aClass307_9340)
		      .aShortArray4811);
		is_2679_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			    .aShortArray4813);
		is_2680_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			    .aShortArray4812);
		is_2681_ = (((Class307) ((Class89_Sub1) this).aClass307_9340)
			    .aByteArray4814);
	    } else {
		is = ((Class89_Sub1) this).aShortArray9334;
		is_2679_ = ((Class89_Sub1) this).aShortArray9335;
		is_2680_ = ((Class89_Sub1) this).aShortArray9371;
		is_2681_ = ((Class89_Sub1) this).aByteArray9362;
	    }
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 12;
		long l = interface40.method262(0, i);
		for (int i_2682_ = 0;
		     i_2682_ < ((Class89_Sub1) this).anInt9378; i_2682_++) {
		    Class287 class287
			= new Class287((float) is[i_2682_],
				       (float) is_2679_[i_2682_],
				       (float) is_2680_[i_2682_]);
		    if (class287.method5559() != 0.0F) {
			if (is_2681_[i_2682_] > 1)
			    class287.method5588((float) is_2681_[i_2682_]);
			class287.method5573();
		    }
		    unsafe.putFloat(l, class287.aFloat4477);
		    l += 4L;
		    unsafe.putFloat(l, class287.aFloat4474);
		    l += 4L;
		    unsafe.putFloat(l, class287.aFloat4479);
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    Class287 class287
			= new Class287((float) is[i], (float) is_2679_[i],
				       (float) is_2680_[i]);
		    if (class287.method5559() != 0.0F) {
			if (is_2681_[i] > 1)
			    class287.method5588((float) is_2681_[i]);
			class287.method5573();
		    }
		    bytebuffer.putFloat(class287.aFloat4477);
		    bytebuffer.putFloat(class287.aFloat4474);
		    bytebuffer.putFloat(class287.aFloat4479);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9354)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9354).aBool4826 = true;
	}
	if (bool_2639_) {
	    if ((((Class311) ((Class89_Sub1) this).aClass311_9341)
		 .anInterface40_4829)
		== null)
		((Class311) ((Class89_Sub1) this).aClass311_9341)
		    .anInterface40_4829
		    = ((Class89_Sub1) this).aClass103_Sub3_9319
			  .method15752(((Class89_Sub1) this).aBool9393);
	    Interface40 interface40
		= (((Class311) ((Class89_Sub1) this).aClass311_9341)
		   .anInterface40_4829);
	    interface40.method221(((Class89_Sub1) this).anInt9378 * 8, 8);
	    Unsafe unsafe
		= ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	    if (unsafe != null) {
		int i = ((Class89_Sub1) this).anInt9378 * 8;
		long l = interface40.method262(0, i);
		for (int i_2683_ = 0;
		     i_2683_ < ((Class89_Sub1) this).anInt9378; i_2683_++) {
		    unsafe.putFloat(l, (((Class89_Sub1) this).aFloatArray9338
					[i_2683_]));
		    l += 4L;
		    unsafe.putFloat(l, (((Class89_Sub1) this).aFloatArray9339
					[i_2683_]));
		    l += 4L;
		}
		interface40.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class89_Sub1) this)
					 .aClass103_Sub3_9319.aByteBuffer9490);
		bytebuffer.clear();
		for (int i = 0; i < ((Class89_Sub1) this).anInt9378; i++) {
		    bytebuffer
			.putFloat(((Class89_Sub1) this).aFloatArray9338[i]);
		    bytebuffer
			.putFloat(((Class89_Sub1) this).aFloatArray9339[i]);
		}
		interface40.method268(0, bytebuffer.position(),
				      (((Class89_Sub1) this)
				       .aClass103_Sub3_9319.aLong9491));
	    }
	    ((Class311) ((Class89_Sub1) this).aClass311_9341)
		.anInterface40_4828
		= interface40;
	    ((Class311) ((Class89_Sub1) this).aClass311_9341).aBool4826 = true;
	}
	return bool_2640_;
    }
    
    boolean method15522() {
	if (((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707)
	    return true;
	if ((((Class386) ((Class89_Sub1) this).aClass386_9351)
	     .anInterface33_5706)
	    == null)
	    ((Class386) ((Class89_Sub1) this).aClass386_9351)
		.anInterface33_5706
		= ((Class89_Sub1) this).aClass103_Sub3_9319.method15714(false);
	Interface33 interface33
	    = (((Class386) ((Class89_Sub1) this).aClass386_9351)
	       .anInterface33_5706);
	interface33.method185(((Class89_Sub1) this).anInt9342 * 6);
	Unsafe unsafe = ((Class89_Sub1) this).aClass103_Sub3_9319.anUnsafe9493;
	if (unsafe != null) {
	    int i = ((Class89_Sub1) this).anInt9342 * 6;
	    long l = interface33.method262(0, i);
	    if (l == 0L)
		return false;
	    for (int i_2684_ = 0; i_2684_ < ((Class89_Sub1) this).anInt9342;
		 i_2684_++) {
		unsafe.putShort(l, (((Class89_Sub1) this).aShortArray9345
				    [i_2684_]));
		l += 2L;
		unsafe.putShort(l, (((Class89_Sub1) this).aShortArray9346
				    [i_2684_]));
		l += 2L;
		unsafe.putShort(l, (((Class89_Sub1) this).aShortArray9368
				    [i_2684_]));
		l += 2L;
	    }
	    interface33.method192();
	    ((Class386) ((Class89_Sub1) this).aClass386_9351)
		.anInterface33_5708
		= interface33;
	    ((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707 = true;
	    ((Class89_Sub1) this).aBool9357 = true;
	    return true;
	}
	ByteBuffer bytebuffer
	    = ((Class89_Sub1) this).aClass103_Sub3_9319.aByteBuffer9490;
	bytebuffer.clear();
	for (int i = 0; i < ((Class89_Sub1) this).anInt9342; i++) {
	    bytebuffer.putShort(((Class89_Sub1) this).aShortArray9345[i]);
	    bytebuffer.putShort(((Class89_Sub1) this).aShortArray9346[i]);
	    bytebuffer.putShort(((Class89_Sub1) this).aShortArray9368[i]);
	}
	if (interface33.method268(0, bytebuffer.position(),
				  (((Class89_Sub1) this).aClass103_Sub3_9319
				   .aLong9491))) {
	    ((Class386) ((Class89_Sub1) this).aClass386_9351)
		.anInterface33_5708
		= interface33;
	    ((Class386) ((Class89_Sub1) this).aClass386_9351).aBool5707 = true;
	    ((Class89_Sub1) this).aBool9357 = true;
	    return true;
	}
	return false;
    }
    
    void method15523() {
	if (((Class89_Sub1) this).aClass311_9352 != null)
	    ((Class89_Sub1) this).aClass311_9352.method5880();
	if (((Class89_Sub1) this).aClass311_9341 != null)
	    ((Class89_Sub1) this).aClass311_9341.method5880();
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class89_Sub1) this).aClass311_9353.method5880();
	if (((Class89_Sub1) this).aClass311_9354 != null)
	    ((Class89_Sub1) this).aClass311_9354.method5880();
	if (((Class89_Sub1) this).aClass386_9351 != null)
	    ((Class89_Sub1) this).aClass386_9351.method6951();
    }
    
    void method15524() {
	if (((Class89_Sub1) this).aClass311_9352 != null)
	    ((Class89_Sub1) this).aClass311_9352.method5880();
	if (((Class89_Sub1) this).aClass311_9341 != null)
	    ((Class89_Sub1) this).aClass311_9341.method5880();
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class89_Sub1) this).aClass311_9353.method5880();
	if (((Class89_Sub1) this).aClass311_9354 != null)
	    ((Class89_Sub1) this).aClass311_9354.method5880();
	if (((Class89_Sub1) this).aClass386_9351 != null)
	    ((Class89_Sub1) this).aClass386_9351.method6951();
    }
    
    public int method1991() {
	if (!((Class89_Sub1) this).aBool9323)
	    method15471();
	return ((Class89_Sub1) this).anInt9359;
    }
    
    void method15525() {
	if (((Class89_Sub1) this).aClass311_9352 != null)
	    ((Class89_Sub1) this).aClass311_9352.method5880();
	if (((Class89_Sub1) this).aClass311_9341 != null)
	    ((Class89_Sub1) this).aClass311_9341.method5880();
	if (((Class89_Sub1) this).aClass311_9353 != null)
	    ((Class89_Sub1) this).aClass311_9353.method5880();
	if (((Class89_Sub1) this).aClass311_9354 != null)
	    ((Class89_Sub1) this).aClass311_9354.method5880();
	if (((Class89_Sub1) this).aClass386_9351 != null)
	    ((Class89_Sub1) this).aClass386_9351.method6951();
    }
    
    int method15526(int i, int i_2685_) {
	i_2685_ = i_2685_ * (i & 0x7f) >> 7;
	if (i_2685_ < 2)
	    i_2685_ = 2;
	else if (i_2685_ > 126)
	    i_2685_ = 126;
	return (i & 0xff80) + i_2685_;
    }
    
    int method15527(int i, int i_2686_) {
	i_2686_ = i_2686_ * (i & 0x7f) >> 7;
	if (i_2686_ < 2)
	    i_2686_ = 2;
	else if (i_2686_ > 126)
	    i_2686_ = 126;
	return (i & 0xff80) + i_2686_;
    }
    
    int method15528(int i, short i_2687_, int i_2688_) {
	int i_2689_
	    = (((Class103_Sub3) ((Class89_Sub1) this).aClass103_Sub3_9319)
	       .anIntArray9510[method15467(i, i_2688_)]);
	if (i_2687_ != -1) {
	    Class101 class101
		= ((Class89_Sub1) this).aClass103_Sub3_9319.aClass107_1458
		      .method2680(i_2687_ & 0xffff, 659006484);
	    int i_2690_ = class101.aByte1430 & 0xff;
	    if (i_2690_ != 0) {
		int i_2691_ = 131586 * i_2688_;
		if (i_2688_ < 0)
		    i_2691_ = 0;
		else if (i_2688_ > 127)
		    i_2691_ = 16777215;
		else
		    i_2691_ = 131586 * i_2688_;
		if (i_2690_ == 256)
		    i_2689_ = i_2691_;
		else {
		    int i_2692_ = i_2690_;
		    int i_2693_ = 256 - i_2690_;
		    i_2689_ = ((((i_2691_ & 0xff00ff) * i_2692_
				 + (i_2689_ & 0xff00ff) * i_2693_)
				& ~0xff00ff)
			       + (((i_2691_ & 0xff00) * i_2692_
				   + (i_2689_ & 0xff00) * i_2693_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_2694_ = class101.aByte1433 & 0xff;
	    if (i_2694_ != 0) {
		i_2694_ += 256;
		int i_2695_ = ((i_2689_ & 0xff0000) >> 16) * i_2694_;
		if (i_2695_ > 65535)
		    i_2695_ = 65535;
		int i_2696_ = ((i_2689_ & 0xff00) >> 8) * i_2694_;
		if (i_2696_ > 65535)
		    i_2696_ = 65535;
		int i_2697_ = (i_2689_ & 0xff) * i_2694_;
		if (i_2697_ > 65535)
		    i_2697_ = 65535;
		i_2689_
		    = (i_2695_ << 8 & 0xff0000) + (i_2696_ & 0xff00) + (i_2697_
									>> 8);
	    }
	}
	return i_2689_ & 0xffffff;
    }
}
