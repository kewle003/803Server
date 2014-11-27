/* Class89_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

import jaggl.OpenGL;

public class Class89_Sub2 extends Class89
{
    static final int anInt9394 = 7;
    int[] anIntArray9395;
    static final int anInt9396 = 1;
    static final int anInt9397 = 2;
    static final int anInt9398 = 4;
    static final int anInt9399 = 8;
    static final int anInt9400 = 16;
    static int anInt9401;
    int anInt9402;
    short aShort9403;
    byte aByte9404;
    short aShort9405;
    short aShort9406;
    short[] aShortArray9407;
    byte[] aByteArray9408;
    int anInt9409;
    int anInt9410;
    int[] anIntArray9411;
    int[] anIntArray9412;
    int[] anIntArray9413;
    short[] aShortArray9414;
    short[] aShortArray9415;
    int anInt9416;
    short[] aShortArray9417;
    short[] aShortArray9418;
    short[] aShortArray9419;
    byte[] aByteArray9420;
    int anInt9421;
    float[] aFloatArray9422;
    float[] aFloatArray9423;
    int anInt9424;
    boolean aBool9425;
    static int anInt9426;
    int anInt9427;
    short[] aShortArray9428;
    static int[] anIntArray9429;
    static final int anInt9430 = 4;
    boolean aBool9431;
    int[][] anIntArrayArray9432;
    Class151 aClass151_9433;
    Class151 aClass151_9434;
    short aShort9435;
    Class151 aClass151_9436;
    Class151 aClass151_9437;
    Class146 aClass146_9438;
    Interface14 anInterface14_9439;
    Interface8 anInterface8_9440;
    int anInt9441;
    short[] aShortArray9442;
    int anInt9443;
    boolean aBool9444;
    Class106[] aClass106Array9445;
    short aShort9446;
    short aShort9447;
    short aShort9448;
    short aShort9449;
    short aShort9450;
    boolean aBool9451;
    boolean aBool9452 = false;
    int[] anIntArray9453;
    Class167[] aClass167Array9454;
    short[] aShortArray9455;
    Class178 aClass178_9456;
    Class103_Sub1 aClass103_Sub1_9457;
    static long[] aLongArray9458;
    Class171[] aClass171Array9459;
    Class140[] aClass140Array9460;
    int[][] anIntArrayArray9461;
    short[] aShortArray9462;
    static float[] aFloatArray9463 = new float[2];
    static int[] anIntArray9464 = new int[8];
    short[] aShortArray9465;
    static int[] anIntArray9466;
    int[][] anIntArrayArray9467;
    static int anInt9468;
    int anInt9469;
    static boolean aBool9470;
    
    static float[] method15529(float[] fs, int i) {
	float[] fs_0_ = new float[i];
	System.arraycopy(fs, 0, fs_0_, 0, i);
	return fs_0_;
    }
    
    Class89_Sub2(Class103_Sub1 class103_sub1, Class161 class161, int i,
		 int i_1_, int i_2_, int i_3_) {
	((Class89_Sub2) this).aBool9425 = false;
	((Class89_Sub2) this).anInt9409 = 0;
	((Class89_Sub2) this).anInt9410 = 0;
	((Class89_Sub2) this).anInt9416 = 0;
	((Class89_Sub2) this).anInt9424 = 0;
	((Class89_Sub2) this).anInt9441 = 0;
	((Class89_Sub2) this).aBool9431 = true;
	((Class89_Sub2) this).aBool9444 = false;
	((Class89_Sub2) this).aBool9451 = false;
	((Class89_Sub2) this).aClass103_Sub1_9457 = class103_sub1;
	((Class89_Sub2) this).anInt9402 = i;
	((Class89_Sub2) this).anInt9469 = i_3_;
	if (Class154.method3255(i, i_3_))
	    ((Class89_Sub2) this).aClass151_9434
		= new Class151(null, 5126, 3, 0);
	if (Class154.method3283(i, i_3_))
	    ((Class89_Sub2) this).aClass151_9437
		= new Class151(null, 5126, 2, 0);
	if (Class154.method3301(i, i_3_))
	    ((Class89_Sub2) this).aClass151_9436
		= new Class151(null, 5126, 3, 0);
	if (Class154.method3257(i, i_3_))
	    ((Class89_Sub2) this).aClass151_9433
		= new Class151(null, 5121, 4, 0);
	if (Class154.method3307(i, i_3_))
	    ((Class89_Sub2) this).aClass146_9438 = new Class146();
	Class107 class107 = class103_sub1.aClass107_1458;
	int[] is = new int[class161.anInt1802];
	((Class89_Sub2) this).anIntArray9395 = new int[class161.anInt1805 + 1];
	for (int i_4_ = 0; i_4_ < class161.anInt1802; i_4_++) {
	    if (class161.aByteArray1808 == null
		|| class161.aByteArray1808[i_4_] != 2) {
		if (class161.aShortArray1792 != null
		    && class161.aShortArray1792[i_4_] != -1) {
		    Class101 class101
			= class107.method2680((class161.aShortArray1792[i_4_]
					       & 0xffff),
					      1327214496);
		    if (((((Class89_Sub2) this).anInt9469 & 0x40) == 0
			 || !class101.aBool1434)
			&& class101.aBool1408)
			continue;
		}
		is[((Class89_Sub2) this).anInt9424++] = i_4_;
		((Class89_Sub2) this).anIntArray9395[(class161.aShortArray1818
						      [i_4_])]++;
		((Class89_Sub2) this).anIntArray9395[(class161.aShortArray1796
						      [i_4_])]++;
		((Class89_Sub2) this).anIntArray9395[(class161.aShortArray1804
						      [i_4_])]++;
	    }
	}
	((Class89_Sub2) this).anInt9441 = ((Class89_Sub2) this).anInt9424;
	long[] ls = new long[((Class89_Sub2) this).anInt9424];
	boolean bool = (((Class89_Sub2) this).anInt9402 & 0x100) != 0;
	for (int i_5_ = 0; i_5_ < ((Class89_Sub2) this).anInt9424; i_5_++) {
	    int i_6_ = is[i_5_];
	    Class101 class101 = null;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    int i_9_ = 0;
	    int i_10_ = 0;
	    if (class161.aClass95Array1834 != null) {
		boolean bool_11_ = false;
		for (int i_12_ = 0; i_12_ < class161.aClass95Array1834.length;
		     i_12_++) {
		    Class95 class95 = class161.aClass95Array1834[i_12_];
		    if (i_6_ == class95.anInt1328 * 855950689) {
			Class332 class332
			    = Class279.method5466((class95.anInt1331
						   * 264591637),
						  -594612991);
			if (class332.aBool5054)
			    bool_11_ = true;
			if (class332.anInt5051 * 73195809 != -1) {
			    Class101 class101_13_
				= class107.method2680((class332.anInt5051
						       * 73195809),
						      1996903812);
			    if (class101_13_.aClass529_1391
				== Class529.aClass529_6944)
				((Class89_Sub2) this).aBool9452 = true;
			}
		    }
		}
		if (bool_11_) {
		    ls[i_5_] = 9223372036854775807L;
		    ((Class89_Sub2) this).anInt9441--;
		    continue;
		}
	    }
	    if (class161.aClass106Array1832 != null) {
		boolean bool_14_ = false;
		for (int i_15_ = 0; i_15_ < class161.aClass106Array1832.length;
		     i_15_++) {
		    Class106 class106 = class161.aClass106Array1832[i_15_];
		    if (i_6_ == class106.anInt1489 * -143674399) {
			Class325 class325
			    = Class530.method11844((class106.anInt1494
						    * 357275585),
						   351604150);
			if (class325.aBool4980)
			    bool_14_ = true;
		    }
		}
		if (bool_14_) {
		    ls[i_5_] = 9223372036854775807L;
		    ((Class89_Sub2) this).anInt9441--;
		    continue;
		}
	    }
	    int i_16_ = -1;
	    if (class161.aShortArray1792 != null) {
		i_16_ = class161.aShortArray1792[i_6_];
		if (i_16_ != -1) {
		    class101 = class107.method2680(i_16_ & 0xffff, 918625692);
		    if ((((Class89_Sub2) this).anInt9469 & 0x40) == 0
			|| !class101.aBool1434) {
			i_9_ = class101.aByte1427;
			i_10_ = class101.aByte1428;
			if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
			    ((Class89_Sub2) this).aBool9425 = true;
		    } else {
			i_16_ = -1;
			class101 = null;
		    }
		}
	    }
	    boolean bool_17_
		= ((class161.aByteArray1793 != null
		    && class161.aByteArray1793[i_6_] != 0)
		   || (class101 != null
		       && class101.aClass529_1391 != Class529.aClass529_6942));
	    if ((bool || bool_17_) && class161.aByteArray1809 != null)
		i_7_ += class161.aByteArray1809[i_6_] << 17;
	    if (bool_17_)
		i_7_ += 65536;
	    i_7_ += (i_9_ & 0xff) << 8;
	    i_7_ += i_10_ & 0xff;
	    i_8_ += (i_16_ & 0xffff) << 16;
	    i_8_ += i_5_ & 0xffff;
	    ls[i_5_] = ((long) i_7_ << 32) + (long) i_8_;
	    ((Class89_Sub2) this).aBool9452 |= bool_17_;
	    Class89_Sub2 class89_sub2_18_ = this;
	    ((Class89_Sub2) class89_sub2_18_).aBool9425
		= (((Class89_Sub2) class89_sub2_18_).aBool9425
		   | (class101 != null && (class101.aByte1376 != 0
					   || class101.aByte1396 != 0)));
	}
	Class46.method1125(ls, is, (byte) 0);
	((Class89_Sub2) this).anInt9409 = class161.anInt1790;
	((Class89_Sub2) this).anInt9410 = class161.anInt1805;
	((Class89_Sub2) this).anIntArray9411 = class161.anIntArray1831;
	((Class89_Sub2) this).anIntArray9412 = class161.anIntArray1791;
	((Class89_Sub2) this).anIntArray9413 = class161.anIntArray1816;
	((Class89_Sub2) this).aShortArray9465 = class161.aShortArray1797;
	Class145[] class145s = new Class145[((Class89_Sub2) this).anInt9410];
	((Class89_Sub2) this).aClass106Array9445 = class161.aClass106Array1832;
	((Class89_Sub2) this).aClass167Array9454 = class161.aClass167Array1833;
	if (class161.aClass95Array1834 != null) {
	    ((Class89_Sub2) this).anInt9427
		= class161.aClass95Array1834.length;
	    ((Class89_Sub2) this).aClass171Array9459
		= new Class171[((Class89_Sub2) this).anInt9427];
	    ((Class89_Sub2) this).aClass140Array9460
		= new Class140[((Class89_Sub2) this).anInt9427];
	    for (int i_19_ = 0; i_19_ < ((Class89_Sub2) this).anInt9427;
		 i_19_++) {
		Class95 class95 = class161.aClass95Array1834[i_19_];
		Class332 class332
		    = Class279.method5466(class95.anInt1331 * 264591637,
					  354284357);
		int i_20_ = -1;
		for (int i_21_ = 0; i_21_ < ((Class89_Sub2) this).anInt9424;
		     i_21_++) {
		    if (is[i_21_] == class95.anInt1328 * 855950689) {
			i_20_ = i_21_;
			break;
		    }
		}
		if (i_20_ == -1)
		    throw new RuntimeException();
		int i_22_ = ((Class474.anIntArray6383
			      [(class161.aShortArray1812
				[class95.anInt1328 * 855950689]) & 0xffff])
			     & 0xffffff);
		i_22_ = i_22_ | 255 - (class161.aByteArray1793 != null
				       ? (class161.aByteArray1793
					  [class95.anInt1328 * 855950689])
				       : 0) << 24;
		((Class89_Sub2) this).aClass171Array9459[i_19_]
		    = new Class171(i_20_,
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
		((Class89_Sub2) this).aClass140Array9460[i_19_]
		    = new Class140(i_22_);
	    }
	}
	int i_23_ = ((Class89_Sub2) this).anInt9424 * 3;
	((Class89_Sub2) this).aShortArray9417 = new short[i_23_];
	((Class89_Sub2) this).aShortArray9418 = new short[i_23_];
	((Class89_Sub2) this).aShortArray9419 = new short[i_23_];
	((Class89_Sub2) this).aByteArray9420 = new byte[i_23_];
	((Class89_Sub2) this).aFloatArray9422 = new float[i_23_];
	((Class89_Sub2) this).aFloatArray9423 = new float[i_23_];
	((Class89_Sub2) this).aShortArray9442
	    = new short[((Class89_Sub2) this).anInt9424];
	((Class89_Sub2) this).aByteArray9408
	    = new byte[((Class89_Sub2) this).anInt9424];
	((Class89_Sub2) this).aShortArray9428
	    = new short[((Class89_Sub2) this).anInt9424];
	((Class89_Sub2) this).aShortArray9462
	    = new short[((Class89_Sub2) this).anInt9424];
	((Class89_Sub2) this).aShortArray9407
	    = new short[((Class89_Sub2) this).anInt9424];
	((Class89_Sub2) this).aShortArray9414
	    = new short[((Class89_Sub2) this).anInt9424];
	if (class161.aShortArray1810 != null)
	    ((Class89_Sub2) this).aShortArray9415
		= new short[((Class89_Sub2) this).anInt9424];
	((Class89_Sub2) this).aShort9405 = (short) i_1_;
	((Class89_Sub2) this).aShort9406 = (short) i_2_;
	((Class89_Sub2) this).aShortArray9455 = new short[i_23_];
	aLongArray9458 = new long[i_23_];
	int i_24_ = 0;
	for (int i_25_ = 0; i_25_ < class161.anInt1805; i_25_++) {
	    int i_26_ = ((Class89_Sub2) this).anIntArray9395[i_25_];
	    ((Class89_Sub2) this).anIntArray9395[i_25_] = i_24_;
	    i_24_ += i_26_;
	    class145s[i_25_] = new Class145();
	}
	((Class89_Sub2) this).anIntArray9395[class161.anInt1805] = i_24_;
	Class100 class100
	    = method1896(class161, is, ((Class89_Sub2) this).anInt9424);
	Class139[] class139s = new Class139[class161.anInt1802];
	for (int i_27_ = 0; i_27_ < class161.anInt1802; i_27_++) {
	    short i_28_ = class161.aShortArray1818[i_27_];
	    short i_29_ = class161.aShortArray1796[i_27_];
	    short i_30_ = class161.aShortArray1804[i_27_];
	    int i_31_ = (((Class89_Sub2) this).anIntArray9411[i_29_]
			 - ((Class89_Sub2) this).anIntArray9411[i_28_]);
	    int i_32_ = (((Class89_Sub2) this).anIntArray9412[i_29_]
			 - ((Class89_Sub2) this).anIntArray9412[i_28_]);
	    int i_33_ = (((Class89_Sub2) this).anIntArray9413[i_29_]
			 - ((Class89_Sub2) this).anIntArray9413[i_28_]);
	    int i_34_ = (((Class89_Sub2) this).anIntArray9411[i_30_]
			 - ((Class89_Sub2) this).anIntArray9411[i_28_]);
	    int i_35_ = (((Class89_Sub2) this).anIntArray9412[i_30_]
			 - ((Class89_Sub2) this).anIntArray9412[i_28_]);
	    int i_36_ = (((Class89_Sub2) this).anIntArray9413[i_30_]
			 - ((Class89_Sub2) this).anIntArray9413[i_28_]);
	    int i_37_ = i_32_ * i_36_ - i_35_ * i_33_;
	    int i_38_ = i_33_ * i_34_ - i_36_ * i_31_;
	    int i_39_;
	    for (i_39_ = i_31_ * i_35_ - i_34_ * i_32_;
		 (i_37_ > 8192 || i_38_ > 8192 || i_39_ > 8192 || i_37_ < -8192
		  || i_38_ < -8192 || i_39_ < -8192);
		 i_39_ >>= 1) {
		i_37_ >>= 1;
		i_38_ >>= 1;
	    }
	    int i_40_ = (int) Math.sqrt((double) (i_37_ * i_37_ + i_38_ * i_38_
						  + i_39_ * i_39_));
	    if (i_40_ <= 0)
		i_40_ = 1;
	    i_37_ = i_37_ * 256 / i_40_;
	    i_38_ = i_38_ * 256 / i_40_;
	    i_39_ = i_39_ * 256 / i_40_;
	    byte i_41_ = (class161.aByteArray1808 == null ? (byte) 0
			  : class161.aByteArray1808[i_27_]);
	    if (i_41_ == 0) {
		Class145 class145 = class145s[i_28_];
		((Class145) class145).anInt1689 += i_37_;
		((Class145) class145).anInt1688 += i_38_;
		((Class145) class145).anInt1690 += i_39_;
		((Class145) class145).anInt1691++;
		class145 = class145s[i_29_];
		((Class145) class145).anInt1689 += i_37_;
		((Class145) class145).anInt1688 += i_38_;
		((Class145) class145).anInt1690 += i_39_;
		((Class145) class145).anInt1691++;
		class145 = class145s[i_30_];
		((Class145) class145).anInt1689 += i_37_;
		((Class145) class145).anInt1688 += i_38_;
		((Class145) class145).anInt1690 += i_39_;
		((Class145) class145).anInt1691++;
	    } else if (i_41_ == 1) {
		Class139 class139 = class139s[i_27_] = new Class139();
		((Class139) class139).anInt1624 = i_37_;
		((Class139) class139).anInt1622 = i_38_;
		((Class139) class139).anInt1623 = i_39_;
	    }
	}
	for (int i_42_ = 0; i_42_ < ((Class89_Sub2) this).anInt9424; i_42_++) {
	    int i_43_ = is[i_42_];
	    int i_44_ = class161.aShortArray1812[i_43_] & 0xffff;
	    int i_45_ = (class161.aByteArray1793 != null
			 ? class161.aByteArray1793[i_43_] & 0xff : 0);
	    short i_46_ = (class161.aShortArray1792 == null ? (short) -1
			   : class161.aShortArray1792[i_43_]);
	    if (i_46_ != -1 && (((Class89_Sub2) this).anInt9469 & 0x40) != 0
		&& class107.method2680(i_46_, 2144486552).aBool1434)
		i_46_ = (short) -1;
	    float f = 0.0F;
	    float f_47_ = 0.0F;
	    float f_48_ = 0.0F;
	    float f_49_ = 0.0F;
	    float f_50_ = 0.0F;
	    float f_51_ = 0.0F;
	    long l;
	    long l_52_;
	    long l_53_;
	    if (i_46_ != -1) {
		int i_54_ = (class161.aShortArray1811 != null
			     ? class161.aShortArray1811[i_43_] : -1);
		if (i_54_ == 32766) {
		    int i_55_ = class161.aByteArray1803[i_43_] & 0xff;
		    int i_56_ = class161.aByteArray1794[i_43_] & 0xff;
		    int i_57_ = class161.aByteArray1807[i_43_] & 0xff;
		    i_55_ += (class161.anIntArray1795
			      [class161.aShortArray1818[i_43_]]);
		    l_53_ = (long) i_55_;
		    i_56_ += (class161.anIntArray1795
			      [class161.aShortArray1796[i_43_]]);
		    l_52_ = (long) i_55_;
		    i_57_ += (class161.anIntArray1795
			      [class161.aShortArray1804[i_43_]]);
		    l = (long) i_55_;
		    f = class161.aFloatArray1787[i_55_];
		    f_47_ = class161.aFloatArray1800[i_55_];
		    f_48_ = class161.aFloatArray1787[i_56_];
		    f_49_ = class161.aFloatArray1800[i_56_];
		    f_50_ = class161.aFloatArray1787[i_57_];
		    f_51_ = class161.aFloatArray1800[i_57_];
		} else if (i_54_ == -1) {
		    f = 0.0F;
		    f_47_ = 1.0F;
		    l_53_ = 65535L;
		    f_48_ = 1.0F;
		    f_49_ = 1.0F;
		    l_52_ = 131071L;
		    f_50_ = 0.0F;
		    f_51_ = 0.0F;
		    l = 196607L;
		} else {
		    i_54_ &= 0xffff;
		    int i_58_ = 0;
		    int i_59_ = 0;
		    int i_60_ = 0;
		    byte i_61_ = class161.aByteArray1820[i_54_];
		    if (i_61_ == 0) {
			short i_62_ = class161.aShortArray1818[i_43_];
			short i_63_ = class161.aShortArray1796[i_43_];
			short i_64_ = class161.aShortArray1804[i_43_];
			short i_65_ = class161.aShortArray1821[i_54_];
			short i_66_ = class161.aShortArray1822[i_54_];
			short i_67_ = class161.aShortArray1823[i_54_];
			float f_68_ = (float) class161.anIntArray1831[i_65_];
			float f_69_ = (float) class161.anIntArray1791[i_65_];
			float f_70_ = (float) class161.anIntArray1816[i_65_];
			float f_71_
			    = (float) class161.anIntArray1831[i_66_] - f_68_;
			float f_72_
			    = (float) class161.anIntArray1791[i_66_] - f_69_;
			float f_73_
			    = (float) class161.anIntArray1816[i_66_] - f_70_;
			float f_74_
			    = (float) class161.anIntArray1831[i_67_] - f_68_;
			float f_75_
			    = (float) class161.anIntArray1791[i_67_] - f_69_;
			float f_76_
			    = (float) class161.anIntArray1816[i_67_] - f_70_;
			float f_77_
			    = (float) class161.anIntArray1831[i_62_] - f_68_;
			float f_78_
			    = (float) class161.anIntArray1791[i_62_] - f_69_;
			float f_79_
			    = (float) class161.anIntArray1816[i_62_] - f_70_;
			float f_80_
			    = (float) class161.anIntArray1831[i_63_] - f_68_;
			float f_81_
			    = (float) class161.anIntArray1791[i_63_] - f_69_;
			float f_82_
			    = (float) class161.anIntArray1816[i_63_] - f_70_;
			float f_83_
			    = (float) class161.anIntArray1831[i_64_] - f_68_;
			float f_84_
			    = (float) class161.anIntArray1791[i_64_] - f_69_;
			float f_85_
			    = (float) class161.anIntArray1816[i_64_] - f_70_;
			float f_86_ = f_72_ * f_76_ - f_73_ * f_75_;
			float f_87_ = f_73_ * f_74_ - f_71_ * f_76_;
			float f_88_ = f_71_ * f_75_ - f_72_ * f_74_;
			float f_89_ = f_75_ * f_88_ - f_76_ * f_87_;
			float f_90_ = f_76_ * f_86_ - f_74_ * f_88_;
			float f_91_ = f_74_ * f_87_ - f_75_ * f_86_;
			float f_92_ = 1.0F / (f_89_ * f_71_ + f_90_ * f_72_
					      + f_91_ * f_73_);
			f = ((f_89_ * f_77_ + f_90_ * f_78_ + f_91_ * f_79_)
			     * f_92_);
			f_48_ = (f_89_ * f_80_ + f_90_ * f_81_
				 + f_91_ * f_82_) * f_92_;
			f_50_ = (f_89_ * f_83_ + f_90_ * f_84_
				 + f_91_ * f_85_) * f_92_;
			f_89_ = f_72_ * f_88_ - f_73_ * f_87_;
			f_90_ = f_73_ * f_86_ - f_71_ * f_88_;
			f_91_ = f_71_ * f_87_ - f_72_ * f_86_;
			f_92_ = 1.0F / (f_89_ * f_74_ + f_90_ * f_75_
					+ f_91_ * f_76_);
			f_47_ = (f_89_ * f_77_ + f_90_ * f_78_
				 + f_91_ * f_79_) * f_92_;
			f_49_ = (f_89_ * f_80_ + f_90_ * f_81_
				 + f_91_ * f_82_) * f_92_;
			f_51_ = (f_89_ * f_83_ + f_90_ * f_84_
				 + f_91_ * f_85_) * f_92_;
		    } else {
			short i_93_ = class161.aShortArray1818[i_43_];
			short i_94_ = class161.aShortArray1796[i_43_];
			short i_95_ = class161.aShortArray1804[i_43_];
			int i_96_ = class100.anIntArray1365[i_54_];
			int i_97_ = class100.anIntArray1363[i_54_];
			int i_98_ = class100.anIntArray1364[i_54_];
			float[] fs = class100.aFloatArrayArray1366[i_54_];
			byte i_99_ = class161.aByteArray1827[i_54_];
			float f_100_
			    = (float) class161.anIntArray1813[i_54_] / 256.0F;
			if (i_61_ == 1) {
			    float f_101_
				= ((float) class161.anIntArray1826[i_54_]
				   / 1024.0F);
			    method1859(class161.anIntArray1831[i_93_],
				       class161.anIntArray1791[i_93_],
				       class161.anIntArray1816[i_93_], i_96_,
				       i_97_, i_98_, fs, f_101_, i_99_, f_100_,
				       aFloatArray9463);
			    f = aFloatArray9463[0];
			    f_47_ = aFloatArray9463[1];
			    method1859(class161.anIntArray1831[i_94_],
				       class161.anIntArray1791[i_94_],
				       class161.anIntArray1816[i_94_], i_96_,
				       i_97_, i_98_, fs, f_101_, i_99_, f_100_,
				       aFloatArray9463);
			    f_48_ = aFloatArray9463[0];
			    f_49_ = aFloatArray9463[1];
			    method1859(class161.anIntArray1831[i_95_],
				       class161.anIntArray1791[i_95_],
				       class161.anIntArray1816[i_95_], i_96_,
				       i_97_, i_98_, fs, f_101_, i_99_, f_100_,
				       aFloatArray9463);
			    f_50_ = aFloatArray9463[0];
			    f_51_ = aFloatArray9463[1];
			    float f_102_ = f_101_ / 2.0F;
			    if ((i_99_ & 0x1) == 0) {
				if (f_48_ - f > f_102_) {
				    f_48_ -= f_101_;
				    i_59_ = 1;
				} else if (f - f_48_ > f_102_) {
				    f_48_ += f_101_;
				    i_59_ = 2;
				}
				if (f_50_ - f > f_102_) {
				    f_50_ -= f_101_;
				    i_60_ = 1;
				} else if (f - f_50_ > f_102_) {
				    f_50_ += f_101_;
				    i_60_ = 2;
				}
			    } else {
				if (f_49_ - f_47_ > f_102_) {
				    f_49_ -= f_101_;
				    i_59_ = 1;
				} else if (f_47_ - f_49_ > f_102_) {
				    f_49_ += f_101_;
				    i_59_ = 2;
				}
				if (f_51_ - f_47_ > f_102_) {
				    f_51_ -= f_101_;
				    i_60_ = 1;
				} else if (f_47_ - f_51_ > f_102_) {
				    f_51_ += f_101_;
				    i_60_ = 2;
				}
			    }
			} else if (i_61_ == 2) {
			    float f_103_
				= ((float) class161.anIntArray1828[i_54_]
				   / 256.0F);
			    float f_104_
				= ((float) class161.anIntArray1806[i_54_]
				   / 256.0F);
			    int i_105_ = (class161.anIntArray1831[i_94_]
					  - class161.anIntArray1831[i_93_]);
			    int i_106_ = (class161.anIntArray1791[i_94_]
					  - class161.anIntArray1791[i_93_]);
			    int i_107_ = (class161.anIntArray1816[i_94_]
					  - class161.anIntArray1816[i_93_]);
			    int i_108_ = (class161.anIntArray1831[i_95_]
					  - class161.anIntArray1831[i_93_]);
			    int i_109_ = (class161.anIntArray1791[i_95_]
					  - class161.anIntArray1791[i_93_]);
			    int i_110_ = (class161.anIntArray1816[i_95_]
					  - class161.anIntArray1816[i_93_]);
			    int i_111_ = i_106_ * i_110_ - i_109_ * i_107_;
			    int i_112_ = i_107_ * i_108_ - i_110_ * i_105_;
			    int i_113_ = i_105_ * i_109_ - i_108_ * i_106_;
			    float f_114_
				= (64.0F
				   / (float) class161.anIntArray1824[i_54_]);
			    float f_115_
				= (64.0F
				   / (float) class161.anIntArray1825[i_54_]);
			    float f_116_
				= (64.0F
				   / (float) class161.anIntArray1826[i_54_]);
			    float f_117_ = (((float) i_111_ * fs[0]
					     + (float) i_112_ * fs[1]
					     + (float) i_113_ * fs[2])
					    / f_114_);
			    float f_118_ = (((float) i_111_ * fs[3]
					     + (float) i_112_ * fs[4]
					     + (float) i_113_ * fs[5])
					    / f_115_);
			    float f_119_ = (((float) i_111_ * fs[6]
					     + (float) i_112_ * fs[7]
					     + (float) i_113_ * fs[8])
					    / f_116_);
			    i_58_ = method1860(f_117_, f_118_, f_119_);
			    method1861(class161.anIntArray1831[i_93_],
				       class161.anIntArray1791[i_93_],
				       class161.anIntArray1816[i_93_], i_96_,
				       i_97_, i_98_, i_58_, fs, i_99_, f_100_,
				       f_103_, f_104_, aFloatArray9463);
			    f = aFloatArray9463[0];
			    f_47_ = aFloatArray9463[1];
			    method1861(class161.anIntArray1831[i_94_],
				       class161.anIntArray1791[i_94_],
				       class161.anIntArray1816[i_94_], i_96_,
				       i_97_, i_98_, i_58_, fs, i_99_, f_100_,
				       f_103_, f_104_, aFloatArray9463);
			    f_48_ = aFloatArray9463[0];
			    f_49_ = aFloatArray9463[1];
			    method1861(class161.anIntArray1831[i_95_],
				       class161.anIntArray1791[i_95_],
				       class161.anIntArray1816[i_95_], i_96_,
				       i_97_, i_98_, i_58_, fs, i_99_, f_100_,
				       f_103_, f_104_, aFloatArray9463);
			    f_50_ = aFloatArray9463[0];
			    f_51_ = aFloatArray9463[1];
			} else if (i_61_ == 3) {
			    method1858(class161.anIntArray1831[i_93_],
				       class161.anIntArray1791[i_93_],
				       class161.anIntArray1816[i_93_], i_96_,
				       i_97_, i_98_, fs, i_99_, f_100_,
				       aFloatArray9463);
			    f = aFloatArray9463[0];
			    f_47_ = aFloatArray9463[1];
			    method1858(class161.anIntArray1831[i_94_],
				       class161.anIntArray1791[i_94_],
				       class161.anIntArray1816[i_94_], i_96_,
				       i_97_, i_98_, fs, i_99_, f_100_,
				       aFloatArray9463);
			    f_48_ = aFloatArray9463[0];
			    f_49_ = aFloatArray9463[1];
			    method1858(class161.anIntArray1831[i_95_],
				       class161.anIntArray1791[i_95_],
				       class161.anIntArray1816[i_95_], i_96_,
				       i_97_, i_98_, fs, i_99_, f_100_,
				       aFloatArray9463);
			    f_50_ = aFloatArray9463[0];
			    f_51_ = aFloatArray9463[1];
			    if ((i_99_ & 0x1) == 0) {
				if (f_48_ - f > 0.5F) {
				    f_48_--;
				    i_59_ = 1;
				} else if (f - f_48_ > 0.5F) {
				    f_48_++;
				    i_59_ = 2;
				}
				if (f_50_ - f > 0.5F) {
				    f_50_--;
				    i_60_ = 1;
				} else if (f - f_50_ > 0.5F) {
				    f_50_++;
				    i_60_ = 2;
				}
			    } else {
				if (f_49_ - f_47_ > 0.5F) {
				    f_49_--;
				    i_59_ = 1;
				} else if (f_47_ - f_49_ > 0.5F) {
				    f_49_++;
				    i_59_ = 2;
				}
				if (f_51_ - f_47_ > 0.5F) {
				    f_51_--;
				    i_60_ = 1;
				} else if (f_47_ - f_51_ > 0.5F) {
				    f_51_++;
				    i_60_ = 2;
				}
			    }
			}
		    }
		    l_53_ = (long) (i_58_ << 16 | i_54_);
		    l_52_ = (long) (i_59_ << 19) | l_53_;
		    l = (long) (i_60_ << 19) | l_53_;
		}
	    } else {
		l = 0L;
		l_52_ = 0L;
		l_53_ = 0L;
	    }
	    byte i_120_ = (class161.aByteArray1808 != null
			   ? class161.aByteArray1808[i_43_] : (byte) 0);
	    if (i_120_ == 0) {
		long l_121_ = (long) ((i_44_ << 8) + i_45_);
		short i_122_ = class161.aShortArray1818[i_43_];
		short i_123_ = class161.aShortArray1796[i_43_];
		short i_124_ = class161.aShortArray1804[i_43_];
		Class145 class145 = class145s[i_122_];
		((Class89_Sub2) this).aShortArray9428[i_42_]
		    = method15550(class161, i_122_, l_121_ | l_53_ << 24,
				  ((Class145) class145).anInt1689,
				  ((Class145) class145).anInt1688,
				  ((Class145) class145).anInt1690,
				  ((Class145) class145).anInt1691, f, f_47_);
		class145 = class145s[i_123_];
		((Class89_Sub2) this).aShortArray9462[i_42_]
		    = method15550(class161, i_123_, l_121_ | l_52_ << 24,
				  ((Class145) class145).anInt1689,
				  ((Class145) class145).anInt1688,
				  ((Class145) class145).anInt1690,
				  ((Class145) class145).anInt1691, f_48_,
				  f_49_);
		class145 = class145s[i_124_];
		((Class89_Sub2) this).aShortArray9407[i_42_]
		    = method15550(class161, i_124_, l_121_ | l << 24,
				  ((Class145) class145).anInt1689,
				  ((Class145) class145).anInt1688,
				  ((Class145) class145).anInt1690,
				  ((Class145) class145).anInt1691, f_50_,
				  f_51_);
	    } else if (i_120_ == 1) {
		Class139 class139 = class139s[i_43_];
		long l_125_
		    = (((long) (((Class139) class139).anInt1624 & ~0x7fffffff)
			<< 9)
		       + ((long) (((Class139) class139).anInt1622 + 256) << 32)
		       + ((long) (((Class139) class139).anInt1623 + 256) << 24)
		       + (long) (i_44_ << 8) + (long) i_45_);
		((Class89_Sub2) this).aShortArray9428[i_42_]
		    = method15550(class161, class161.aShortArray1818[i_43_],
				  l_125_ | l_53_ << 41,
				  ((Class139) class139).anInt1624,
				  ((Class139) class139).anInt1622,
				  ((Class139) class139).anInt1623, 0, f,
				  f_47_);
		((Class89_Sub2) this).aShortArray9462[i_42_]
		    = method15550(class161, class161.aShortArray1796[i_43_],
				  l_125_ | l_53_ << 41,
				  ((Class139) class139).anInt1624,
				  ((Class139) class139).anInt1622,
				  ((Class139) class139).anInt1623, 0, f_48_,
				  f_49_);
		((Class89_Sub2) this).aShortArray9407[i_42_]
		    = method15550(class161, class161.aShortArray1804[i_43_],
				  l_125_ | l_53_ << 41,
				  ((Class139) class139).anInt1624,
				  ((Class139) class139).anInt1622,
				  ((Class139) class139).anInt1623, 0, f_50_,
				  f_51_);
	    }
	    if (class161.aByteArray1793 != null)
		((Class89_Sub2) this).aByteArray9408[i_42_]
		    = class161.aByteArray1793[i_43_];
	    if (class161.aShortArray1810 != null)
		((Class89_Sub2) this).aShortArray9415[i_42_]
		    = class161.aShortArray1810[i_43_];
	    ((Class89_Sub2) this).aShortArray9442[i_42_]
		= class161.aShortArray1812[i_43_];
	    ((Class89_Sub2) this).aShortArray9414[i_42_] = i_46_;
	}
	int i_126_ = 0;
	short i_127_ = -10000;
	for (int i_128_ = 0; i_128_ < ((Class89_Sub2) this).anInt9441;
	     i_128_++) {
	    short i_129_ = ((Class89_Sub2) this).aShortArray9414[i_128_];
	    if (i_129_ != i_127_) {
		i_126_++;
		i_127_ = i_129_;
	    }
	}
	((Class89_Sub2) this).anIntArray9453 = new int[i_126_ + 1];
	i_126_ = 0;
	i_127_ = (short) -10000;
	for (int i_130_ = 0; i_130_ < ((Class89_Sub2) this).anInt9441;
	     i_130_++) {
	    short i_131_ = ((Class89_Sub2) this).aShortArray9414[i_130_];
	    if (i_131_ != i_127_) {
		((Class89_Sub2) this).anIntArray9453[i_126_++] = i_130_;
		i_127_ = i_131_;
	    }
	}
	((Class89_Sub2) this).anIntArray9453[i_126_]
	    = ((Class89_Sub2) this).anInt9441;
	aLongArray9458 = null;
	((Class89_Sub2) this).aShortArray9417
	    = method15531(((Class89_Sub2) this).aShortArray9417,
			  ((Class89_Sub2) this).anInt9416);
	((Class89_Sub2) this).aShortArray9418
	    = method15531(((Class89_Sub2) this).aShortArray9418,
			  ((Class89_Sub2) this).anInt9416);
	((Class89_Sub2) this).aShortArray9419
	    = method15531(((Class89_Sub2) this).aShortArray9419,
			  ((Class89_Sub2) this).anInt9416);
	((Class89_Sub2) this).aByteArray9420
	    = method15530(((Class89_Sub2) this).aByteArray9420,
			  ((Class89_Sub2) this).anInt9416);
	((Class89_Sub2) this).aFloatArray9422
	    = method15532(((Class89_Sub2) this).aFloatArray9422,
			  ((Class89_Sub2) this).anInt9416);
	((Class89_Sub2) this).aFloatArray9423
	    = method15532(((Class89_Sub2) this).aFloatArray9423,
			  ((Class89_Sub2) this).anInt9416);
	if (class161.anIntArray1799 != null
	    && Class154.method3273(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) this).anIntArrayArray9467
		= class161.method3455(false);
	if (class161.aClass95Array1834 != null
	    && Class154.method3311(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) this).anIntArrayArray9461 = class161.method3477();
	if (class161.anIntArray1814 != null
	    && Class154.method3272(i, ((Class89_Sub2) this).anInt9469)) {
	    int i_132_ = 0;
	    int[] is_133_ = new int[256];
	    for (int i_134_ = 0; i_134_ < ((Class89_Sub2) this).anInt9424;
		 i_134_++) {
		int i_135_ = class161.anIntArray1814[is[i_134_]];
		if (i_135_ >= 0) {
		    is_133_[i_135_]++;
		    if (i_135_ > i_132_)
			i_132_ = i_135_;
		}
	    }
	    ((Class89_Sub2) this).anIntArrayArray9432 = new int[i_132_ + 1][];
	    for (int i_136_ = 0; i_136_ <= i_132_; i_136_++) {
		((Class89_Sub2) this).anIntArrayArray9432[i_136_]
		    = new int[is_133_[i_136_]];
		is_133_[i_136_] = 0;
	    }
	    for (int i_137_ = 0; i_137_ < ((Class89_Sub2) this).anInt9424;
		 i_137_++) {
		int i_138_ = class161.anIntArray1814[is[i_137_]];
		if (i_138_ >= 0)
		    ((Class89_Sub2) this).anIntArrayArray9432[i_138_]
			[is_133_[i_138_]++]
			= i_137_;
	    }
	}
    }
    
    void method2002(int i, int[] is, int i_139_, int i_140_, int i_141_,
		    int i_142_, boolean bool) {
	int i_143_ = is.length;
	if (i == 0) {
	    i_139_ <<= 4;
	    i_140_ <<= 4;
	    i_141_ <<= 4;
	    int i_144_ = 0;
	    anInt9426 = 0;
	    anInt9468 = 0;
	    anInt9401 = 0;
	    for (int i_145_ = 0; i_145_ < i_143_; i_145_++) {
		int i_146_ = is[i_145_];
		if (i_146_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_147_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_146_];
		    for (int i_148_ = 0; i_148_ < is_147_.length; i_148_++) {
			int i_149_ = is_147_[i_148_];
			anInt9426
			    += ((Class89_Sub2) this).anIntArray9411[i_149_];
			anInt9468
			    += ((Class89_Sub2) this).anIntArray9412[i_149_];
			anInt9401
			    += ((Class89_Sub2) this).anIntArray9413[i_149_];
			i_144_++;
		    }
		}
	    }
	    if (i_144_ > 0) {
		anInt9426 = anInt9426 / i_144_ + i_139_;
		anInt9468 = anInt9468 / i_144_ + i_140_;
		anInt9401 = anInt9401 / i_144_ + i_141_;
	    } else {
		anInt9426 = i_139_;
		anInt9468 = i_140_;
		anInt9401 = i_141_;
	    }
	} else if (i == 1) {
	    i_139_ <<= 4;
	    i_140_ <<= 4;
	    i_141_ <<= 4;
	    for (int i_150_ = 0; i_150_ < i_143_; i_150_++) {
		int i_151_ = is[i_150_];
		if (i_151_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_152_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_151_];
		    for (int i_153_ = 0; i_153_ < is_152_.length; i_153_++) {
			int i_154_ = is_152_[i_153_];
			((Class89_Sub2) this).anIntArray9411[i_154_] += i_139_;
			((Class89_Sub2) this).anIntArray9412[i_154_] += i_140_;
			((Class89_Sub2) this).anIntArray9413[i_154_] += i_141_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_155_ = 0; i_155_ < i_143_; i_155_++) {
		int i_156_ = is[i_155_];
		if (i_156_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_157_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_156_];
		    if ((i_142_ & 0x1) == 0) {
			for (int i_158_ = 0; i_158_ < is_157_.length;
			     i_158_++) {
			    int i_159_ = is_157_[i_158_];
			    ((Class89_Sub2) this).anIntArray9411[i_159_]
				-= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_159_]
				-= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_159_]
				-= anInt9401;
			    if (i_141_ != 0) {
				int i_160_ = Class282.anIntArray4430[i_141_];
				int i_161_ = Class282.anIntArray4441[i_141_];
				int i_162_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_159_]) * i_160_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_159_]) * i_161_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9412[i_159_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_159_]) * i_161_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_159_]) * i_160_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_159_]
				    = i_162_;
			    }
			    if (i_139_ != 0) {
				int i_163_ = Class282.anIntArray4430[i_139_];
				int i_164_ = Class282.anIntArray4441[i_139_];
				int i_165_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_159_]) * i_164_
					- (((Class89_Sub2) this).anIntArray9413
					   [i_159_]) * i_163_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_159_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_159_]) * i_163_
				       + (((Class89_Sub2) this).anIntArray9413
					  [i_159_]) * i_164_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9412[i_159_]
				    = i_165_;
			    }
			    if (i_140_ != 0) {
				int i_166_ = Class282.anIntArray4430[i_140_];
				int i_167_ = Class282.anIntArray4441[i_140_];
				int i_168_
				    = (((((Class89_Sub2) this).anIntArray9413
					 [i_159_]) * i_166_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_159_]) * i_167_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_159_]
				    = ((((Class89_Sub2) this).anIntArray9413
					[i_159_]) * i_167_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_159_]) * i_166_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_159_]
				    = i_168_;
			    }
			    ((Class89_Sub2) this).anIntArray9411[i_159_]
				+= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_159_]
				+= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_159_]
				+= anInt9401;
			}
		    } else {
			for (int i_169_ = 0; i_169_ < is_157_.length;
			     i_169_++) {
			    int i_170_ = is_157_[i_169_];
			    ((Class89_Sub2) this).anIntArray9411[i_170_]
				-= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_170_]
				-= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_170_]
				-= anInt9401;
			    if (i_139_ != 0) {
				int i_171_ = Class282.anIntArray4430[i_139_];
				int i_172_ = Class282.anIntArray4441[i_139_];
				int i_173_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_170_]) * i_172_
					- (((Class89_Sub2) this).anIntArray9413
					   [i_170_]) * i_171_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_170_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_170_]) * i_171_
				       + (((Class89_Sub2) this).anIntArray9413
					  [i_170_]) * i_172_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9412[i_170_]
				    = i_173_;
			    }
			    if (i_141_ != 0) {
				int i_174_ = Class282.anIntArray4430[i_141_];
				int i_175_ = Class282.anIntArray4441[i_141_];
				int i_176_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_170_]) * i_174_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_170_]) * i_175_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9412[i_170_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_170_]) * i_175_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_170_]) * i_174_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_170_]
				    = i_176_;
			    }
			    if (i_140_ != 0) {
				int i_177_ = Class282.anIntArray4430[i_140_];
				int i_178_ = Class282.anIntArray4441[i_140_];
				int i_179_
				    = (((((Class89_Sub2) this).anIntArray9413
					 [i_170_]) * i_177_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_170_]) * i_178_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_170_]
				    = ((((Class89_Sub2) this).anIntArray9413
					[i_170_]) * i_178_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_170_]) * i_177_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_170_]
				    = i_179_;
			    }
			    ((Class89_Sub2) this).anIntArray9411[i_170_]
				+= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_170_]
				+= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_170_]
				+= anInt9401;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_180_ = 0; i_180_ < i_143_; i_180_++) {
		    int i_181_ = is[i_180_];
		    if (i_181_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_182_ = (((Class89_Sub2) this)
					 .anIntArrayArray9467[i_181_]);
			for (int i_183_ = 0; i_183_ < is_182_.length;
			     i_183_++) {
			    int i_184_ = is_182_[i_183_];
			    int i_185_
				= ((Class89_Sub2) this).anIntArray9395[i_184_];
			    int i_186_ = (((Class89_Sub2) this).anIntArray9395
					  [i_184_ + 1]);
			    for (int i_187_ = i_185_;
				 (i_187_ < i_186_
				  && (((Class89_Sub2) this).aShortArray9455
				      [i_187_]) != 0);
				 i_187_++) {
				int i_188_ = (((((Class89_Sub2) this)
						.aShortArray9455[i_187_])
					       & 0xffff)
					      - 1);
				if (i_141_ != 0) {
				    int i_189_
					= Class282.anIntArray4430[i_141_];
				    int i_190_
					= Class282.anIntArray4441[i_141_];
				    int i_191_
					= (((((Class89_Sub2) this)
					     .aShortArray9418[i_188_]) * i_189_
					    + ((((Class89_Sub2) this)
						.aShortArray9417[i_188_])
					       * i_190_)
					    + 16383)
					   >> 14);
				    ((Class89_Sub2) this).aShortArray9418
					[i_188_]
					= (short) ((((((Class89_Sub2) this)
						      .aShortArray9418[i_188_])
						     * i_190_)
						    - (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_188_]) * i_189_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9417
					[i_188_]
					= (short) i_191_;
				}
				if (i_139_ != 0) {
				    int i_192_
					= Class282.anIntArray4430[i_139_];
				    int i_193_
					= Class282.anIntArray4441[i_139_];
				    int i_194_
					= (((((Class89_Sub2) this)
					     .aShortArray9418[i_188_]) * i_193_
					    - ((((Class89_Sub2) this)
						.aShortArray9419[i_188_])
					       * i_192_)
					    + 16383)
					   >> 14);
				    ((Class89_Sub2) this).aShortArray9419
					[i_188_]
					= (short) ((((((Class89_Sub2) this)
						      .aShortArray9418[i_188_])
						     * i_192_)
						    + (((Class89_Sub2) this)
						       .aShortArray9419
						       [i_188_]) * i_193_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9418
					[i_188_]
					= (short) i_194_;
				}
				if (i_140_ != 0) {
				    int i_195_
					= Class282.anIntArray4430[i_140_];
				    int i_196_
					= Class282.anIntArray4441[i_140_];
				    int i_197_
					= (((((Class89_Sub2) this)
					     .aShortArray9419[i_188_]) * i_195_
					    + ((((Class89_Sub2) this)
						.aShortArray9417[i_188_])
					       * i_196_)
					    + 16383)
					   >> 14);
				    ((Class89_Sub2) this).aShortArray9419
					[i_188_]
					= (short) ((((((Class89_Sub2) this)
						      .aShortArray9419[i_188_])
						     * i_196_)
						    - (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_188_]) * i_195_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9417
					[i_188_]
					= (short) i_197_;
				}
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass151_9436 == null
		    && ((Class89_Sub2) this).aClass151_9433 != null)
		    ((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713
			= null;
		if (((Class89_Sub2) this).aClass151_9436 != null)
		    ((Class151) ((Class89_Sub2) this).aClass151_9436)
			.anInterface8_1713
			= null;
	    }
	} else if (i == 3) {
	    for (int i_198_ = 0; i_198_ < i_143_; i_198_++) {
		int i_199_ = is[i_198_];
		if (i_199_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_200_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_199_];
		    for (int i_201_ = 0; i_201_ < is_200_.length; i_201_++) {
			int i_202_ = is_200_[i_201_];
			((Class89_Sub2) this).anIntArray9411[i_202_]
			    -= anInt9426;
			((Class89_Sub2) this).anIntArray9412[i_202_]
			    -= anInt9468;
			((Class89_Sub2) this).anIntArray9413[i_202_]
			    -= anInt9401;
			((Class89_Sub2) this).anIntArray9411[i_202_]
			    = (((Class89_Sub2) this).anIntArray9411[i_202_]
			       * i_139_) >> 7;
			((Class89_Sub2) this).anIntArray9412[i_202_]
			    = (((Class89_Sub2) this).anIntArray9412[i_202_]
			       * i_140_) >> 7;
			((Class89_Sub2) this).anIntArray9413[i_202_]
			    = (((Class89_Sub2) this).anIntArray9413[i_202_]
			       * i_141_) >> 7;
			((Class89_Sub2) this).anIntArray9411[i_202_]
			    += anInt9426;
			((Class89_Sub2) this).anIntArray9412[i_202_]
			    += anInt9468;
			((Class89_Sub2) this).anIntArray9413[i_202_]
			    += anInt9401;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_203_ = 0; i_203_ < i_143_; i_203_++) {
		    int i_204_ = is[i_203_];
		    if (i_204_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_205_ = (((Class89_Sub2) this)
					 .anIntArrayArray9432[i_204_]);
			for (int i_206_ = 0; i_206_ < is_205_.length;
			     i_206_++) {
			    int i_207_ = is_205_[i_206_];
			    int i_208_
				= (((Class89_Sub2) this).aByteArray9408[i_207_]
				   & 0xff) + i_139_ * 8;
			    if (i_208_ < 0)
				i_208_ = 0;
			    else if (i_208_ > 255)
				i_208_ = 255;
			    ((Class89_Sub2) this).aByteArray9408[i_207_]
				= (byte) i_208_;
			}
			if (is_205_.length > 0
			    && ((Class89_Sub2) this).aClass151_9433 != null)
			    ((Class151) ((Class89_Sub2) this).aClass151_9433)
				.anInterface8_1713
				= null;
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_209_ = 0;
			 i_209_ < ((Class89_Sub2) this).anInt9427; i_209_++) {
			Class171 class171
			    = ((Class89_Sub2) this).aClass171Array9459[i_209_];
			Class140 class140
			    = ((Class89_Sub2) this).aClass140Array9460[i_209_];
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & 0xffffff
			       | 255 - ((((Class89_Sub2) this).aByteArray9408
					 [((Class171) class171).anInt2069])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_210_ = 0; i_210_ < i_143_; i_210_++) {
		    int i_211_ = is[i_210_];
		    if (i_211_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_212_ = (((Class89_Sub2) this)
					 .anIntArrayArray9432[i_211_]);
			for (int i_213_ = 0; i_213_ < is_212_.length;
			     i_213_++) {
			    int i_214_ = is_212_[i_213_];
			    int i_215_ = ((((Class89_Sub2) this)
					   .aShortArray9442[i_214_])
					  & 0xffff);
			    int i_216_ = i_215_ >> 10 & 0x3f;
			    int i_217_ = i_215_ >> 7 & 0x7;
			    int i_218_ = i_215_ & 0x7f;
			    i_216_ = i_216_ + i_139_ & 0x3f;
			    i_217_ += i_140_ / 4;
			    if (i_217_ < 0)
				i_217_ = 0;
			    else if (i_217_ > 7)
				i_217_ = 7;
			    i_218_ += i_141_;
			    if (i_218_ < 0)
				i_218_ = 0;
			    else if (i_218_ > 127)
				i_218_ = 127;
			    ((Class89_Sub2) this).aShortArray9442[i_214_]
				= (short) (i_216_ << 10 | i_217_ << 7
					   | i_218_);
			}
			if (is_212_.length > 0
			    && ((Class89_Sub2) this).aClass151_9433 != null)
			    ((Class151) ((Class89_Sub2) this).aClass151_9433)
				.anInterface8_1713
				= null;
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_219_ = 0;
			 i_219_ < ((Class89_Sub2) this).anInt9427; i_219_++) {
			Class171 class171
			    = ((Class89_Sub2) this).aClass171Array9459[i_219_];
			Class140 class140
			    = ((Class89_Sub2) this).aClass140Array9460[i_219_];
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & ~0xffffff
			       | (Class474.anIntArray6383
				  [((((Class89_Sub2) this).aShortArray9442
				     [((Class171) class171).anInt2069])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_220_ = 0; i_220_ < i_143_; i_220_++) {
		    int i_221_ = is[i_220_];
		    if (i_221_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_222_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_221_]);
			for (int i_223_ = 0; i_223_ < is_222_.length;
			     i_223_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_222_[i_223_]]);
			    ((Class140) class140).anInt1628 += i_139_;
			    ((Class140) class140).anInt1629 += i_140_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_224_ = 0; i_224_ < i_143_; i_224_++) {
		    int i_225_ = is[i_224_];
		    if (i_225_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_226_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_225_]);
			for (int i_227_ = 0; i_227_ < is_226_.length;
			     i_227_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_226_[i_227_]]);
			    ((Class140) class140).anInt1626
				= (((Class140) class140).anInt1626 * i_139_
				   >> 7);
			    ((Class140) class140).anInt1627
				= (((Class140) class140).anInt1627 * i_140_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_228_ = 0; i_228_ < i_143_; i_228_++) {
		    int i_229_ = is[i_228_];
		    if (i_229_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_230_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_229_]);
			for (int i_231_ = 0; i_231_ < is_230_.length;
			     i_231_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_230_[i_231_]]);
			    ((Class140) class140).anInt1625
				= (((Class140) class140).anInt1625 + i_139_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    static byte[] method15530(byte[] is, int i) {
	byte[] is_232_ = new byte[i];
	System.arraycopy(is, 0, is_232_, 0, i);
	return is_232_;
    }
    
    static short[] method15531(short[] is, int i) {
	short[] is_233_ = new short[i];
	System.arraycopy(is, 0, is_233_, 0, i);
	return is_233_;
    }
    
    static float[] method15532(float[] fs, int i) {
	float[] fs_234_ = new float[i];
	System.arraycopy(fs, 0, fs_234_, 0, i);
	return fs_234_;
    }
    
    public int method1889() {
	return ((Class89_Sub2) this).anInt9402;
    }
    
    public void method1928(int i) {
	((Class89_Sub2) this).anInt9402 = i;
	if (((Class89_Sub2) this).aClass178_9456 != null
	    && (((Class89_Sub2) this).anInt9402 & 0x10000) == 0) {
	    ((Class89_Sub2) this).aShortArray9417
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aShortArray2129);
	    ((Class89_Sub2) this).aShortArray9418
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aShortArray2127);
	    ((Class89_Sub2) this).aShortArray9419
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aShortArray2126);
	    ((Class89_Sub2) this).aByteArray9420
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aByteArray2128);
	    ((Class89_Sub2) this).aClass178_9456 = null;
	}
	((Class89_Sub2) this).aBool9431 = true;
	method15544();
    }
    
    public void method1997(Class89 class89, int i, int i_235_, int i_236_,
			   boolean bool) {
	Class89_Sub2 class89_sub2_237_ = (Class89_Sub2) class89;
	if (((Class89_Sub2) this).anInt9424 != 0
	    && ((Class89_Sub2) class89_sub2_237_).anInt9424 != 0) {
	    int i_238_ = ((Class89_Sub2) class89_sub2_237_).anInt9410;
	    int[] is = ((Class89_Sub2) class89_sub2_237_).anIntArray9411;
	    int[] is_239_ = ((Class89_Sub2) class89_sub2_237_).anIntArray9412;
	    int[] is_240_ = ((Class89_Sub2) class89_sub2_237_).anIntArray9413;
	    short[] is_241_
		= ((Class89_Sub2) class89_sub2_237_).aShortArray9417;
	    short[] is_242_
		= ((Class89_Sub2) class89_sub2_237_).aShortArray9418;
	    short[] is_243_
		= ((Class89_Sub2) class89_sub2_237_).aShortArray9419;
	    byte[] is_244_ = ((Class89_Sub2) class89_sub2_237_).aByteArray9420;
	    short[] is_245_;
	    short[] is_246_;
	    short[] is_247_;
	    byte[] is_248_;
	    if (((Class89_Sub2) this).aClass178_9456 != null) {
		is_245_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2129);
		is_246_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2127);
		is_247_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2126);
		is_248_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aByteArray2128);
	    } else {
		is_245_ = null;
		is_246_ = null;
		is_247_ = null;
		is_248_ = null;
	    }
	    short[] is_249_;
	    short[] is_250_;
	    short[] is_251_;
	    byte[] is_252_;
	    if (((Class89_Sub2) class89_sub2_237_).aClass178_9456 != null) {
		is_249_ = ((Class178) (((Class89_Sub2) class89_sub2_237_)
				       .aClass178_9456)).aShortArray2129;
		is_250_ = ((Class178) (((Class89_Sub2) class89_sub2_237_)
				       .aClass178_9456)).aShortArray2127;
		is_251_ = ((Class178) (((Class89_Sub2) class89_sub2_237_)
				       .aClass178_9456)).aShortArray2126;
		is_252_ = ((Class178) (((Class89_Sub2) class89_sub2_237_)
				       .aClass178_9456)).aByteArray2128;
	    } else {
		is_249_ = null;
		is_250_ = null;
		is_251_ = null;
		is_252_ = null;
	    }
	    int[] is_253_ = ((Class89_Sub2) class89_sub2_237_).anIntArray9395;
	    short[] is_254_
		= ((Class89_Sub2) class89_sub2_237_).aShortArray9455;
	    if (!((Class89_Sub2) class89_sub2_237_).aBool9444)
		class89_sub2_237_.method15537();
	    int i_255_ = ((Class89_Sub2) class89_sub2_237_).aShort9403;
	    int i_256_ = ((Class89_Sub2) class89_sub2_237_).aShort9446;
	    int i_257_ = ((Class89_Sub2) class89_sub2_237_).aShort9447;
	    int i_258_ = ((Class89_Sub2) class89_sub2_237_).aShort9448;
	    int i_259_ = ((Class89_Sub2) class89_sub2_237_).aShort9449;
	    int i_260_ = ((Class89_Sub2) class89_sub2_237_).aShort9450;
	    for (int i_261_ = 0; i_261_ < ((Class89_Sub2) this).anInt9410;
		 i_261_++) {
		int i_262_
		    = ((Class89_Sub2) this).anIntArray9412[i_261_] - i_235_;
		if (i_262_ >= i_255_ && i_262_ <= i_256_) {
		    int i_263_
			= ((Class89_Sub2) this).anIntArray9411[i_261_] - i;
		    if (i_263_ >= i_257_ && i_263_ <= i_258_) {
			int i_264_
			    = (((Class89_Sub2) this).anIntArray9413[i_261_]
			       - i_236_);
			if (i_264_ >= i_259_ && i_264_ <= i_260_) {
			    int i_265_ = -1;
			    int i_266_
				= ((Class89_Sub2) this).anIntArray9395[i_261_];
			    int i_267_ = (((Class89_Sub2) this).anIntArray9395
					  [i_261_ + 1]);
			    for (int i_268_ = i_266_;
				 (i_268_ < i_267_
				  && (((Class89_Sub2) this).aShortArray9455
				      [i_268_]) != 0);
				 i_268_++) {
				i_265_ = ((((Class89_Sub2) this)
					   .aShortArray9455[i_268_])
					  & 0xffff) - 1;
				if ((((Class89_Sub2) this).aByteArray9420
				     [i_265_])
				    != 0)
				    break;
			    }
			    if (i_265_ != -1) {
				for (int i_269_ = 0; i_269_ < i_238_;
				     i_269_++) {
				    if (i_263_ == is[i_269_]
					&& i_264_ == is_240_[i_269_]
					&& i_262_ == is_239_[i_269_]) {
					int i_270_ = -1;
					i_266_ = is_253_[i_269_];
					i_267_ = is_253_[i_269_ + 1];
					for (int i_271_ = i_266_;
					     (i_271_ < i_267_
					      && is_254_[i_271_] != 0);
					     i_271_++) {
					    i_270_ = (is_254_[i_271_]
						      & 0xffff) - 1;
					    if (is_244_[i_270_] != 0)
						break;
					}
					if (i_270_ != -1) {
					    if (is_245_ == null) {
						((Class89_Sub2) this)
						    .aClass178_9456
						    = new Class178();
						is_245_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2129
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9417),
							-1966905887));
						is_246_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2127
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9418),
							-1485820384));
						is_247_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2126
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9419),
							-979604429));
						is_248_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aByteArray2128
						    = (Class554.method12275
						       ((((Class89_Sub2) this)
							 .aByteArray9420),
							-841739618));
					    }
					    if (is_249_ == null) {
						Class178 class178
						    = (((Class89_Sub2)
							class89_sub2_237_)
							   .aClass178_9456
						       = new Class178());
						is_249_
						    = ((Class178) class178)
							  .aShortArray2129
						    = (Class518.method11659
						       (is_241_, -1057649504));
						is_250_
						    = ((Class178) class178)
							  .aShortArray2127
						    = (Class518.method11659
						       (is_242_, -2101528375));
						is_251_
						    = ((Class178) class178)
							  .aShortArray2126
						    = (Class518.method11659
						       (is_243_, -561372848));
						is_252_
						    = ((Class178) class178)
							  .aByteArray2128
						    = (Class554.method12275
						       (is_244_, -841739618));
					    }
					    short i_272_
						= (((Class89_Sub2) this)
						   .aShortArray9417[i_265_]);
					    short i_273_
						= (((Class89_Sub2) this)
						   .aShortArray9418[i_265_]);
					    short i_274_
						= (((Class89_Sub2) this)
						   .aShortArray9419[i_265_]);
					    byte i_275_
						= (((Class89_Sub2) this)
						   .aByteArray9420[i_265_]);
					    i_266_ = is_253_[i_269_];
					    i_267_ = is_253_[i_269_ + 1];
					    for (int i_276_ = i_266_;
						 i_276_ < i_267_; i_276_++) {
						int i_277_
						    = is_254_[i_276_] - 1;
						if (i_277_ == -1)
						    break;
						if (is_252_[i_277_] != 0) {
						    is_249_[i_277_] += i_272_;
						    is_250_[i_277_] += i_273_;
						    is_251_[i_277_] += i_274_;
						    is_252_[i_277_] += i_275_;
						}
					    }
					    i_272_ = is_241_[i_270_];
					    i_273_ = is_242_[i_270_];
					    i_274_ = is_243_[i_270_];
					    i_275_ = is_244_[i_270_];
					    i_266_ = (((Class89_Sub2) this)
						      .anIntArray9395[i_261_]);
					    i_267_ = (((Class89_Sub2) this)
						      .anIntArray9395
						      [i_261_ + 1]);
					    for (int i_278_ = i_266_;
						 (i_278_ < i_267_
						  && (((Class89_Sub2) this)
						      .aShortArray9455
						      [i_278_]) != 0);
						 i_278_++) {
						int i_279_
						    = (((((Class89_Sub2) this)
							 .aShortArray9455
							 [i_278_])
							& 0xffff)
						       - 1);
						if (is_248_[i_279_] != 0) {
						    is_245_[i_279_] += i_272_;
						    is_246_[i_279_] += i_273_;
						    is_247_[i_279_] += i_274_;
						    is_248_[i_279_] += i_275_;
						}
					    }
					    if ((((Class89_Sub2) this)
						 .aClass151_9436) == null
						&& (((Class89_Sub2) this)
						    .aClass151_9433) != null)
						((Class151)
						 (((Class89_Sub2) this)
						  .aClass151_9433))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2) this)
						 .aClass151_9436)
						!= null)
						((Class151)
						 (((Class89_Sub2) this)
						  .aClass151_9436))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2)
						  class89_sub2_237_)
						 .aClass151_9436) == null
						&& (((Class89_Sub2)
						     class89_sub2_237_)
						    .aClass151_9433) != null)
						((Class151)
						 (((Class89_Sub2)
						   class89_sub2_237_)
						  .aClass151_9433))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2)
						  class89_sub2_237_)
						 .aClass151_9436)
						!= null)
						((Class151)
						 (((Class89_Sub2)
						   class89_sub2_237_)
						  .aClass151_9436))
						    .anInterface8_1713
						    = null;
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
    
    public Class89 method2019(byte i, int i_280_, boolean bool) {
	boolean bool_281_ = false;
	Class89_Sub2 class89_sub2_282_;
	Class89_Sub2 class89_sub2_283_;
	if (i > 0 && i <= 8) {
	    class89_sub2_283_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass89_Sub2Array9200[i - 1]);
	    class89_sub2_282_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass89_Sub2Array9223[i - 1]);
	    bool_281_ = true;
	} else
	    class89_sub2_282_ = class89_sub2_283_
		= new Class89_Sub2(((Class89_Sub2) this).aClass103_Sub1_9457);
	return method15533(class89_sub2_282_, class89_sub2_283_, i_280_,
			   bool_281_, bool);
    }
    
    Class89 method15533(Class89_Sub2 class89_sub2_284_,
			Class89_Sub2 class89_sub2_285_, int i, boolean bool,
			boolean bool_286_) {
	((Class89_Sub2) class89_sub2_284_).aByte9404 = (byte) 0;
	((Class89_Sub2) class89_sub2_284_).anInt9402 = i;
	((Class89_Sub2) class89_sub2_284_).anInt9469
	    = ((Class89_Sub2) this).anInt9469;
	((Class89_Sub2) class89_sub2_284_).aShort9405
	    = ((Class89_Sub2) this).aShort9405;
	((Class89_Sub2) class89_sub2_284_).aShort9406
	    = ((Class89_Sub2) this).aShort9406;
	((Class89_Sub2) class89_sub2_284_).anInt9409
	    = ((Class89_Sub2) this).anInt9409;
	((Class89_Sub2) class89_sub2_284_).anInt9410
	    = ((Class89_Sub2) this).anInt9410;
	((Class89_Sub2) class89_sub2_284_).anInt9416
	    = ((Class89_Sub2) this).anInt9416;
	((Class89_Sub2) class89_sub2_284_).anInt9424
	    = ((Class89_Sub2) this).anInt9424;
	((Class89_Sub2) class89_sub2_284_).anInt9441
	    = ((Class89_Sub2) this).anInt9441;
	((Class89_Sub2) class89_sub2_284_).anInt9427
	    = ((Class89_Sub2) this).anInt9427;
	if ((i & 0x100) != 0)
	    ((Class89_Sub2) class89_sub2_284_).aBool9452 = true;
	else
	    ((Class89_Sub2) class89_sub2_284_).aBool9452
		= ((Class89_Sub2) this).aBool9452;
	((Class89_Sub2) class89_sub2_284_).aBool9425
	    = ((Class89_Sub2) this).aBool9425;
	boolean bool_287_
	    = Class154.method3248(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_288_
	    = Class154.method3244(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_289_
	    = Class154.method3245(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_290_ = bool_287_ | bool_288_ | bool_289_;
	if (bool_290_) {
	    if (bool_287_) {
		if (((Class89_Sub2) class89_sub2_285_).anIntArray9411 == null
		    || ((((Class89_Sub2) class89_sub2_285_)
			 .anIntArray9411).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_284_).anIntArray9411
			= ((Class89_Sub2) class89_sub2_285_).anIntArray9411
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_284_).anIntArray9411
			= ((Class89_Sub2) class89_sub2_285_).anIntArray9411;
	    } else
		((Class89_Sub2) class89_sub2_284_).anIntArray9411
		    = ((Class89_Sub2) this).anIntArray9411;
	    if (bool_288_) {
		if (((Class89_Sub2) class89_sub2_285_).anIntArray9412 == null
		    || ((((Class89_Sub2) class89_sub2_285_)
			 .anIntArray9412).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_284_).anIntArray9412
			= ((Class89_Sub2) class89_sub2_285_).anIntArray9412
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_284_).anIntArray9412
			= ((Class89_Sub2) class89_sub2_285_).anIntArray9412;
	    } else
		((Class89_Sub2) class89_sub2_284_).anIntArray9412
		    = ((Class89_Sub2) this).anIntArray9412;
	    if (bool_289_) {
		if (((Class89_Sub2) class89_sub2_285_).anIntArray9413 == null
		    || ((((Class89_Sub2) class89_sub2_285_)
			 .anIntArray9413).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_284_).anIntArray9413
			= ((Class89_Sub2) class89_sub2_285_).anIntArray9413
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_284_).anIntArray9413
			= ((Class89_Sub2) class89_sub2_285_).anIntArray9413;
	    } else
		((Class89_Sub2) class89_sub2_284_).anIntArray9413
		    = ((Class89_Sub2) this).anIntArray9413;
	    for (int i_291_ = 0; i_291_ < ((Class89_Sub2) this).anInt9409;
		 i_291_++) {
		if (bool_287_)
		    ((Class89_Sub2) class89_sub2_284_).anIntArray9411[i_291_]
			= ((Class89_Sub2) this).anIntArray9411[i_291_];
		if (bool_288_)
		    ((Class89_Sub2) class89_sub2_284_).anIntArray9412[i_291_]
			= ((Class89_Sub2) this).anIntArray9412[i_291_];
		if (bool_289_)
		    ((Class89_Sub2) class89_sub2_284_).anIntArray9413[i_291_]
			= ((Class89_Sub2) this).anIntArray9413[i_291_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_284_).anIntArray9411
		= ((Class89_Sub2) this).anIntArray9411;
	    ((Class89_Sub2) class89_sub2_284_).anIntArray9412
		= ((Class89_Sub2) this).anIntArray9412;
	    ((Class89_Sub2) class89_sub2_284_).anIntArray9413
		= ((Class89_Sub2) this).anIntArray9413;
	}
	if (Class154.method3260(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_284_).aByte9404 |= 0x1;
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9434
		= ((Class89_Sub2) class89_sub2_285_).aClass151_9434;
	    ((Class151) ((Class89_Sub2) class89_sub2_284_).aClass151_9434)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9434).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_284_).aClass151_9434)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9434)
		   .anInterface8_1713);
	} else if (Class154.method3255(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9434
		= ((Class89_Sub2) this).aClass151_9434;
	else
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9434 = null;
	if (Class154.method3300(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_285_).aShortArray9442 == null
		|| (((Class89_Sub2) class89_sub2_285_).aShortArray9442.length
		    < ((Class89_Sub2) this).anInt9424))
		((Class89_Sub2) class89_sub2_284_).aShortArray9442
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9442
		    = new short[((Class89_Sub2) this).anInt9424];
	    else
		((Class89_Sub2) class89_sub2_284_).aShortArray9442
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9442;
	    for (int i_292_ = 0; i_292_ < ((Class89_Sub2) this).anInt9424;
		 i_292_++)
		((Class89_Sub2) class89_sub2_284_).aShortArray9442[i_292_]
		    = ((Class89_Sub2) this).aShortArray9442[i_292_];
	} else
	    ((Class89_Sub2) class89_sub2_284_).aShortArray9442
		= ((Class89_Sub2) this).aShortArray9442;
	if (Class154.method3249(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_285_).aByteArray9408 == null
		|| (((Class89_Sub2) class89_sub2_285_).aByteArray9408.length
		    < ((Class89_Sub2) this).anInt9424))
		((Class89_Sub2) class89_sub2_284_).aByteArray9408
		    = ((Class89_Sub2) class89_sub2_285_).aByteArray9408
		    = new byte[((Class89_Sub2) this).anInt9424];
	    else
		((Class89_Sub2) class89_sub2_284_).aByteArray9408
		    = ((Class89_Sub2) class89_sub2_285_).aByteArray9408;
	    for (int i_293_ = 0; i_293_ < ((Class89_Sub2) this).anInt9424;
		 i_293_++)
		((Class89_Sub2) class89_sub2_284_).aByteArray9408[i_293_]
		    = ((Class89_Sub2) this).aByteArray9408[i_293_];
	} else
	    ((Class89_Sub2) class89_sub2_284_).aByteArray9408
		= ((Class89_Sub2) this).aByteArray9408;
	if (Class154.method3262(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_284_).aByte9404 |= 0x2;
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9433
		= ((Class89_Sub2) class89_sub2_285_).aClass151_9433;
	    ((Class151) ((Class89_Sub2) class89_sub2_284_).aClass151_9433)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9433).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_284_).aClass151_9433)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9433)
		   .anInterface8_1713);
	} else if (Class154.method3257(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9433
		= ((Class89_Sub2) this).aClass151_9433;
	else
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9433 = null;
	if (Class154.method3247(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_285_).aShortArray9417 == null
		|| (((Class89_Sub2) class89_sub2_285_).aShortArray9417.length
		    < ((Class89_Sub2) this).anInt9416)) {
		int i_294_ = ((Class89_Sub2) this).anInt9416;
		((Class89_Sub2) class89_sub2_284_).aShortArray9417
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9417
		    = new short[i_294_];
		((Class89_Sub2) class89_sub2_284_).aShortArray9418
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9418
		    = new short[i_294_];
		((Class89_Sub2) class89_sub2_284_).aShortArray9419
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9419
		    = new short[i_294_];
	    } else {
		((Class89_Sub2) class89_sub2_284_).aShortArray9417
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9417;
		((Class89_Sub2) class89_sub2_284_).aShortArray9418
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9418;
		((Class89_Sub2) class89_sub2_284_).aShortArray9419
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9419;
	    }
	    if (((Class89_Sub2) this).aClass178_9456 != null) {
		if (((Class89_Sub2) class89_sub2_285_).aClass178_9456 == null)
		    ((Class89_Sub2) class89_sub2_285_).aClass178_9456
			= new Class178();
		Class178 class178
		    = (((Class89_Sub2) class89_sub2_284_).aClass178_9456
		       = ((Class89_Sub2) class89_sub2_285_).aClass178_9456);
		if (((Class178) class178).aShortArray2129 == null
		    || (((Class178) class178).aShortArray2129.length
			< ((Class89_Sub2) this).anInt9416)) {
		    int i_295_ = ((Class89_Sub2) this).anInt9416;
		    ((Class178) class178).aShortArray2129 = new short[i_295_];
		    ((Class178) class178).aShortArray2127 = new short[i_295_];
		    ((Class178) class178).aShortArray2126 = new short[i_295_];
		    ((Class178) class178).aByteArray2128 = new byte[i_295_];
		}
		for (int i_296_ = 0; i_296_ < ((Class89_Sub2) this).anInt9416;
		     i_296_++) {
		    ((Class89_Sub2) class89_sub2_284_).aShortArray9417[i_296_]
			= ((Class89_Sub2) this).aShortArray9417[i_296_];
		    ((Class89_Sub2) class89_sub2_284_).aShortArray9418[i_296_]
			= ((Class89_Sub2) this).aShortArray9418[i_296_];
		    ((Class89_Sub2) class89_sub2_284_).aShortArray9419[i_296_]
			= ((Class89_Sub2) this).aShortArray9419[i_296_];
		    ((Class178) class178).aShortArray2129[i_296_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2129[i_296_]);
		    ((Class178) class178).aShortArray2127[i_296_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2127[i_296_]);
		    ((Class178) class178).aShortArray2126[i_296_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2126[i_296_]);
		    ((Class178) class178).aByteArray2128[i_296_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aByteArray2128[i_296_]);
		}
	    } else {
		for (int i_297_ = 0; i_297_ < ((Class89_Sub2) this).anInt9416;
		     i_297_++) {
		    ((Class89_Sub2) class89_sub2_284_).aShortArray9417[i_297_]
			= ((Class89_Sub2) this).aShortArray9417[i_297_];
		    ((Class89_Sub2) class89_sub2_284_).aShortArray9418[i_297_]
			= ((Class89_Sub2) this).aShortArray9418[i_297_];
		    ((Class89_Sub2) class89_sub2_284_).aShortArray9419[i_297_]
			= ((Class89_Sub2) this).aShortArray9419[i_297_];
		}
	    }
	    ((Class89_Sub2) class89_sub2_284_).aByteArray9420
		= ((Class89_Sub2) this).aByteArray9420;
	} else {
	    ((Class89_Sub2) class89_sub2_284_).aClass178_9456
		= ((Class89_Sub2) this).aClass178_9456;
	    ((Class89_Sub2) class89_sub2_284_).aShortArray9417
		= ((Class89_Sub2) this).aShortArray9417;
	    ((Class89_Sub2) class89_sub2_284_).aShortArray9418
		= ((Class89_Sub2) this).aShortArray9418;
	    ((Class89_Sub2) class89_sub2_284_).aShortArray9419
		= ((Class89_Sub2) this).aShortArray9419;
	    ((Class89_Sub2) class89_sub2_284_).aByteArray9420
		= ((Class89_Sub2) this).aByteArray9420;
	}
	if (Class154.method3342(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_284_).aByte9404 |= 0x4;
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9436
		= ((Class89_Sub2) class89_sub2_285_).aClass151_9436;
	    ((Class151) ((Class89_Sub2) class89_sub2_284_).aClass151_9436)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9436).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_284_).aClass151_9436)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9436)
		   .anInterface8_1713);
	} else if (Class154.method3301(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9436
		= ((Class89_Sub2) this).aClass151_9436;
	else
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9436 = null;
	if (Class154.method3329(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_285_).aFloatArray9422 == null
		|| (((Class89_Sub2) class89_sub2_285_).aFloatArray9422.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_298_ = ((Class89_Sub2) this).anInt9416;
		((Class89_Sub2) class89_sub2_284_).aFloatArray9422
		    = ((Class89_Sub2) class89_sub2_285_).aFloatArray9422
		    = new float[i_298_];
		((Class89_Sub2) class89_sub2_284_).aFloatArray9423
		    = ((Class89_Sub2) class89_sub2_285_).aFloatArray9423
		    = new float[i_298_];
	    } else {
		((Class89_Sub2) class89_sub2_284_).aFloatArray9422
		    = ((Class89_Sub2) class89_sub2_285_).aFloatArray9422;
		((Class89_Sub2) class89_sub2_284_).aFloatArray9423
		    = ((Class89_Sub2) class89_sub2_285_).aFloatArray9423;
	    }
	    for (int i_299_ = 0; i_299_ < ((Class89_Sub2) this).anInt9416;
		 i_299_++) {
		((Class89_Sub2) class89_sub2_284_).aFloatArray9422[i_299_]
		    = ((Class89_Sub2) this).aFloatArray9422[i_299_];
		((Class89_Sub2) class89_sub2_284_).aFloatArray9423[i_299_]
		    = ((Class89_Sub2) this).aFloatArray9423[i_299_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_284_).aFloatArray9422
		= ((Class89_Sub2) this).aFloatArray9422;
	    ((Class89_Sub2) class89_sub2_284_).aFloatArray9423
		= ((Class89_Sub2) this).aFloatArray9423;
	}
	if (Class154.method3263(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_284_).aByte9404 |= 0x8;
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9437
		= ((Class89_Sub2) class89_sub2_285_).aClass151_9437;
	    ((Class151) ((Class89_Sub2) class89_sub2_284_).aClass151_9437)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9437).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_284_).aClass151_9437)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9437)
		   .anInterface8_1713);
	} else if (Class154.method3283(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9437
		= ((Class89_Sub2) this).aClass151_9437;
	else
	    ((Class89_Sub2) class89_sub2_284_).aClass151_9437 = null;
	if (Class154.method3308(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_285_).aShortArray9428 == null
		|| (((Class89_Sub2) class89_sub2_285_).aShortArray9428.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_300_ = ((Class89_Sub2) this).anInt9424;
		((Class89_Sub2) class89_sub2_284_).aShortArray9428
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9428
		    = new short[i_300_];
		((Class89_Sub2) class89_sub2_284_).aShortArray9462
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9462
		    = new short[i_300_];
		((Class89_Sub2) class89_sub2_284_).aShortArray9407
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9407
		    = new short[i_300_];
	    } else {
		((Class89_Sub2) class89_sub2_284_).aShortArray9428
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9428;
		((Class89_Sub2) class89_sub2_284_).aShortArray9462
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9462;
		((Class89_Sub2) class89_sub2_284_).aShortArray9407
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9407;
	    }
	    for (int i_301_ = 0; i_301_ < ((Class89_Sub2) this).anInt9424;
		 i_301_++) {
		((Class89_Sub2) class89_sub2_284_).aShortArray9428[i_301_]
		    = ((Class89_Sub2) this).aShortArray9428[i_301_];
		((Class89_Sub2) class89_sub2_284_).aShortArray9462[i_301_]
		    = ((Class89_Sub2) this).aShortArray9462[i_301_];
		((Class89_Sub2) class89_sub2_284_).aShortArray9407[i_301_]
		    = ((Class89_Sub2) this).aShortArray9407[i_301_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_284_).aShortArray9428
		= ((Class89_Sub2) this).aShortArray9428;
	    ((Class89_Sub2) class89_sub2_284_).aShortArray9462
		= ((Class89_Sub2) this).aShortArray9462;
	    ((Class89_Sub2) class89_sub2_284_).aShortArray9407
		= ((Class89_Sub2) this).aShortArray9407;
	}
	if (Class154.method3264(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_284_).aByte9404 |= 0x10;
	    ((Class89_Sub2) class89_sub2_284_).aClass146_9438
		= ((Class89_Sub2) class89_sub2_285_).aClass146_9438;
	    ((Class146) ((Class89_Sub2) class89_sub2_284_).aClass146_9438)
		.anInterface14_1692
		= (((Class146) ((Class89_Sub2) this).aClass146_9438)
		   .anInterface14_1692);
	} else if (Class154.method3307(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_284_).aClass146_9438
		= ((Class89_Sub2) this).aClass146_9438;
	else
	    ((Class89_Sub2) class89_sub2_284_).aClass146_9438 = null;
	if (Class154.method3252(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_285_).aShortArray9414 == null
		|| (((Class89_Sub2) class89_sub2_285_).aShortArray9414.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_302_ = ((Class89_Sub2) this).anInt9424;
		((Class89_Sub2) class89_sub2_284_).aShortArray9414
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9414
		    = new short[i_302_];
	    } else
		((Class89_Sub2) class89_sub2_284_).aShortArray9414
		    = ((Class89_Sub2) class89_sub2_285_).aShortArray9414;
	    for (int i_303_ = 0; i_303_ < ((Class89_Sub2) this).anInt9424;
		 i_303_++)
		((Class89_Sub2) class89_sub2_284_).aShortArray9414[i_303_]
		    = ((Class89_Sub2) this).aShortArray9414[i_303_];
	} else
	    ((Class89_Sub2) class89_sub2_284_).aShortArray9414
		= ((Class89_Sub2) this).aShortArray9414;
	if (Class154.method3253(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_285_).aClass140Array9460 == null
		|| ((((Class89_Sub2) class89_sub2_285_)
		     .aClass140Array9460).length
		    < ((Class89_Sub2) this).anInt9427)) {
		int i_304_ = ((Class89_Sub2) this).anInt9427;
		((Class89_Sub2) class89_sub2_284_).aClass140Array9460
		    = ((Class89_Sub2) class89_sub2_285_).aClass140Array9460
		    = new Class140[i_304_];
		for (int i_305_ = 0; i_305_ < ((Class89_Sub2) this).anInt9427;
		     i_305_++)
		    ((Class89_Sub2) class89_sub2_284_).aClass140Array9460
			[i_305_]
			= ((Class89_Sub2) this).aClass140Array9460[i_305_]
			      .method3141();
	    } else {
		((Class89_Sub2) class89_sub2_284_).aClass140Array9460
		    = ((Class89_Sub2) class89_sub2_285_).aClass140Array9460;
		for (int i_306_ = 0; i_306_ < ((Class89_Sub2) this).anInt9427;
		     i_306_++)
		    ((Class89_Sub2) class89_sub2_284_).aClass140Array9460
			[i_306_].method3142
			(((Class89_Sub2) this).aClass140Array9460[i_306_]);
	    }
	} else
	    ((Class89_Sub2) class89_sub2_284_).aClass140Array9460
		= ((Class89_Sub2) this).aClass140Array9460;
	((Class89_Sub2) class89_sub2_284_).aClass171Array9459
	    = ((Class89_Sub2) this).aClass171Array9459;
	if (((Class89_Sub2) this).aBool9444) {
	    ((Class89_Sub2) class89_sub2_284_).anInt9443
		= ((Class89_Sub2) this).anInt9443;
	    ((Class89_Sub2) class89_sub2_284_).anInt9421
		= ((Class89_Sub2) this).anInt9421;
	    ((Class89_Sub2) class89_sub2_284_).aShort9447
		= ((Class89_Sub2) this).aShort9447;
	    ((Class89_Sub2) class89_sub2_284_).aShort9448
		= ((Class89_Sub2) this).aShort9448;
	    ((Class89_Sub2) class89_sub2_284_).aShort9403
		= ((Class89_Sub2) this).aShort9403;
	    ((Class89_Sub2) class89_sub2_284_).aShort9446
		= ((Class89_Sub2) this).aShort9446;
	    ((Class89_Sub2) class89_sub2_284_).aShort9449
		= ((Class89_Sub2) this).aShort9449;
	    ((Class89_Sub2) class89_sub2_284_).aShort9450
		= ((Class89_Sub2) this).aShort9450;
	    ((Class89_Sub2) class89_sub2_284_).aBool9444 = true;
	} else
	    ((Class89_Sub2) class89_sub2_284_).aBool9444 = false;
	if (((Class89_Sub2) this).aBool9451) {
	    ((Class89_Sub2) class89_sub2_284_).aShort9435
		= ((Class89_Sub2) this).aShort9435;
	    ((Class89_Sub2) class89_sub2_284_).aBool9451 = true;
	} else
	    ((Class89_Sub2) class89_sub2_284_).aBool9451 = false;
	((Class89_Sub2) class89_sub2_284_).anIntArrayArray9467
	    = ((Class89_Sub2) this).anIntArrayArray9467;
	((Class89_Sub2) class89_sub2_284_).anIntArrayArray9432
	    = ((Class89_Sub2) this).anIntArrayArray9432;
	((Class89_Sub2) class89_sub2_284_).anIntArrayArray9461
	    = ((Class89_Sub2) this).anIntArrayArray9461;
	((Class89_Sub2) class89_sub2_284_).aShortArray9455
	    = ((Class89_Sub2) this).aShortArray9455;
	((Class89_Sub2) class89_sub2_284_).anIntArray9395
	    = ((Class89_Sub2) this).anIntArray9395;
	((Class89_Sub2) class89_sub2_284_).aShortArray9465
	    = ((Class89_Sub2) this).aShortArray9465;
	((Class89_Sub2) class89_sub2_284_).aShortArray9415
	    = ((Class89_Sub2) this).aShortArray9415;
	((Class89_Sub2) class89_sub2_284_).anIntArray9453
	    = ((Class89_Sub2) this).anIntArray9453;
	((Class89_Sub2) class89_sub2_284_).aClass106Array9445
	    = ((Class89_Sub2) this).aClass106Array9445;
	((Class89_Sub2) class89_sub2_284_).aClass167Array9454
	    = ((Class89_Sub2) this).aClass167Array9454;
	return class89_sub2_284_;
    }
    
    public int method1880() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9450;
    }
    
    boolean method15534(int i, int i_307_, int i_308_, int i_309_, int i_310_,
			int i_311_, int i_312_, int i_313_) {
	if (i_307_ < i_308_ && i_307_ < i_309_ && i_307_ < i_310_)
	    return false;
	if (i_307_ > i_308_ && i_307_ > i_309_ && i_307_ > i_310_)
	    return false;
	if (i < i_311_ && i < i_312_ && i < i_313_)
	    return false;
	if (i > i_311_ && i > i_312_ && i > i_313_)
	    return false;
	return true;
    }
    
    public void method1869(int i) {
	int i_314_ = Class282.anIntArray4430[i];
	int i_315_ = Class282.anIntArray4441[i];
	for (int i_316_ = 0; i_316_ < ((Class89_Sub2) this).anInt9410;
	     i_316_++) {
	    int i_317_
		= ((((Class89_Sub2) this).anIntArray9413[i_316_] * i_314_
		    + ((Class89_Sub2) this).anIntArray9411[i_316_] * i_315_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9413[i_316_]
		= ((((Class89_Sub2) this).anIntArray9413[i_316_] * i_315_
		    - ((Class89_Sub2) this).anIntArray9411[i_316_] * i_314_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9411[i_316_] = i_317_;
	}
	for (int i_318_ = 0; i_318_ < ((Class89_Sub2) this).anInt9416;
	     i_318_++) {
	    int i_319_
		= ((((Class89_Sub2) this).aShortArray9419[i_318_] * i_314_
		    + ((Class89_Sub2) this).aShortArray9417[i_318_] * i_315_)
		   >> 14);
	    ((Class89_Sub2) this).aShortArray9419[i_318_]
		= (short) (((((Class89_Sub2) this).aShortArray9419[i_318_]
			     * i_315_)
			    - (((Class89_Sub2) this).aShortArray9417[i_318_]
			       * i_314_))
			   >> 14);
	    ((Class89_Sub2) this).aShortArray9417[i_318_] = (short) i_319_;
	}
	if (((Class89_Sub2) this).aClass151_9436 == null
	    && ((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9436 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9436).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    void method1897(int i, int[] is, int i_320_, int i_321_, int i_322_,
		    int i_323_, boolean bool) {
	int i_324_ = is.length;
	if (i == 0) {
	    i_320_ <<= 4;
	    i_321_ <<= 4;
	    i_322_ <<= 4;
	    int i_325_ = 0;
	    anInt9426 = 0;
	    anInt9468 = 0;
	    anInt9401 = 0;
	    for (int i_326_ = 0; i_326_ < i_324_; i_326_++) {
		int i_327_ = is[i_326_];
		if (i_327_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_328_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_327_];
		    for (int i_329_ = 0; i_329_ < is_328_.length; i_329_++) {
			int i_330_ = is_328_[i_329_];
			anInt9426
			    += ((Class89_Sub2) this).anIntArray9411[i_330_];
			anInt9468
			    += ((Class89_Sub2) this).anIntArray9412[i_330_];
			anInt9401
			    += ((Class89_Sub2) this).anIntArray9413[i_330_];
			i_325_++;
		    }
		}
	    }
	    if (i_325_ > 0) {
		anInt9426 = anInt9426 / i_325_ + i_320_;
		anInt9468 = anInt9468 / i_325_ + i_321_;
		anInt9401 = anInt9401 / i_325_ + i_322_;
	    } else {
		anInt9426 = i_320_;
		anInt9468 = i_321_;
		anInt9401 = i_322_;
	    }
	} else if (i == 1) {
	    i_320_ <<= 4;
	    i_321_ <<= 4;
	    i_322_ <<= 4;
	    for (int i_331_ = 0; i_331_ < i_324_; i_331_++) {
		int i_332_ = is[i_331_];
		if (i_332_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_333_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_332_];
		    for (int i_334_ = 0; i_334_ < is_333_.length; i_334_++) {
			int i_335_ = is_333_[i_334_];
			((Class89_Sub2) this).anIntArray9411[i_335_] += i_320_;
			((Class89_Sub2) this).anIntArray9412[i_335_] += i_321_;
			((Class89_Sub2) this).anIntArray9413[i_335_] += i_322_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_336_ = 0; i_336_ < i_324_; i_336_++) {
		int i_337_ = is[i_336_];
		if (i_337_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_338_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_337_];
		    if ((i_323_ & 0x1) == 0) {
			for (int i_339_ = 0; i_339_ < is_338_.length;
			     i_339_++) {
			    int i_340_ = is_338_[i_339_];
			    ((Class89_Sub2) this).anIntArray9411[i_340_]
				-= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_340_]
				-= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_340_]
				-= anInt9401;
			    if (i_322_ != 0) {
				int i_341_ = Class282.anIntArray4430[i_322_];
				int i_342_ = Class282.anIntArray4441[i_322_];
				int i_343_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_340_]) * i_341_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_340_]) * i_342_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9412[i_340_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_340_]) * i_342_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_340_]) * i_341_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_340_]
				    = i_343_;
			    }
			    if (i_320_ != 0) {
				int i_344_ = Class282.anIntArray4430[i_320_];
				int i_345_ = Class282.anIntArray4441[i_320_];
				int i_346_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_340_]) * i_345_
					- (((Class89_Sub2) this).anIntArray9413
					   [i_340_]) * i_344_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_340_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_340_]) * i_344_
				       + (((Class89_Sub2) this).anIntArray9413
					  [i_340_]) * i_345_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9412[i_340_]
				    = i_346_;
			    }
			    if (i_321_ != 0) {
				int i_347_ = Class282.anIntArray4430[i_321_];
				int i_348_ = Class282.anIntArray4441[i_321_];
				int i_349_
				    = (((((Class89_Sub2) this).anIntArray9413
					 [i_340_]) * i_347_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_340_]) * i_348_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_340_]
				    = ((((Class89_Sub2) this).anIntArray9413
					[i_340_]) * i_348_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_340_]) * i_347_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_340_]
				    = i_349_;
			    }
			    ((Class89_Sub2) this).anIntArray9411[i_340_]
				+= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_340_]
				+= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_340_]
				+= anInt9401;
			}
		    } else {
			for (int i_350_ = 0; i_350_ < is_338_.length;
			     i_350_++) {
			    int i_351_ = is_338_[i_350_];
			    ((Class89_Sub2) this).anIntArray9411[i_351_]
				-= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_351_]
				-= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_351_]
				-= anInt9401;
			    if (i_320_ != 0) {
				int i_352_ = Class282.anIntArray4430[i_320_];
				int i_353_ = Class282.anIntArray4441[i_320_];
				int i_354_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_351_]) * i_353_
					- (((Class89_Sub2) this).anIntArray9413
					   [i_351_]) * i_352_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_351_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_351_]) * i_352_
				       + (((Class89_Sub2) this).anIntArray9413
					  [i_351_]) * i_353_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9412[i_351_]
				    = i_354_;
			    }
			    if (i_322_ != 0) {
				int i_355_ = Class282.anIntArray4430[i_322_];
				int i_356_ = Class282.anIntArray4441[i_322_];
				int i_357_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_351_]) * i_355_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_351_]) * i_356_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9412[i_351_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_351_]) * i_356_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_351_]) * i_355_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_351_]
				    = i_357_;
			    }
			    if (i_321_ != 0) {
				int i_358_ = Class282.anIntArray4430[i_321_];
				int i_359_ = Class282.anIntArray4441[i_321_];
				int i_360_
				    = (((((Class89_Sub2) this).anIntArray9413
					 [i_351_]) * i_358_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_351_]) * i_359_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_351_]
				    = ((((Class89_Sub2) this).anIntArray9413
					[i_351_]) * i_359_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_351_]) * i_358_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_351_]
				    = i_360_;
			    }
			    ((Class89_Sub2) this).anIntArray9411[i_351_]
				+= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_351_]
				+= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_351_]
				+= anInt9401;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_361_ = 0; i_361_ < i_324_; i_361_++) {
		    int i_362_ = is[i_361_];
		    if (i_362_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_363_ = (((Class89_Sub2) this)
					 .anIntArrayArray9467[i_362_]);
			for (int i_364_ = 0; i_364_ < is_363_.length;
			     i_364_++) {
			    int i_365_ = is_363_[i_364_];
			    int i_366_
				= ((Class89_Sub2) this).anIntArray9395[i_365_];
			    int i_367_ = (((Class89_Sub2) this).anIntArray9395
					  [i_365_ + 1]);
			    for (int i_368_ = i_366_;
				 (i_368_ < i_367_
				  && (((Class89_Sub2) this).aShortArray9455
				      [i_368_]) != 0);
				 i_368_++) {
				int i_369_ = (((((Class89_Sub2) this)
						.aShortArray9455[i_368_])
					       & 0xffff)
					      - 1);
				if (i_322_ != 0) {
				    int i_370_
					= Class282.anIntArray4430[i_322_];
				    int i_371_
					= Class282.anIntArray4441[i_322_];
				    int i_372_
					= (((((Class89_Sub2) this)
					     .aShortArray9418[i_369_]) * i_370_
					    + ((((Class89_Sub2) this)
						.aShortArray9417[i_369_])
					       * i_371_)
					    + 16383)
					   >> 14);
				    ((Class89_Sub2) this).aShortArray9418
					[i_369_]
					= (short) ((((((Class89_Sub2) this)
						      .aShortArray9418[i_369_])
						     * i_371_)
						    - (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_369_]) * i_370_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9417
					[i_369_]
					= (short) i_372_;
				}
				if (i_320_ != 0) {
				    int i_373_
					= Class282.anIntArray4430[i_320_];
				    int i_374_
					= Class282.anIntArray4441[i_320_];
				    int i_375_
					= (((((Class89_Sub2) this)
					     .aShortArray9418[i_369_]) * i_374_
					    - ((((Class89_Sub2) this)
						.aShortArray9419[i_369_])
					       * i_373_)
					    + 16383)
					   >> 14);
				    ((Class89_Sub2) this).aShortArray9419
					[i_369_]
					= (short) ((((((Class89_Sub2) this)
						      .aShortArray9418[i_369_])
						     * i_373_)
						    + (((Class89_Sub2) this)
						       .aShortArray9419
						       [i_369_]) * i_374_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9418
					[i_369_]
					= (short) i_375_;
				}
				if (i_321_ != 0) {
				    int i_376_
					= Class282.anIntArray4430[i_321_];
				    int i_377_
					= Class282.anIntArray4441[i_321_];
				    int i_378_
					= (((((Class89_Sub2) this)
					     .aShortArray9419[i_369_]) * i_376_
					    + ((((Class89_Sub2) this)
						.aShortArray9417[i_369_])
					       * i_377_)
					    + 16383)
					   >> 14);
				    ((Class89_Sub2) this).aShortArray9419
					[i_369_]
					= (short) ((((((Class89_Sub2) this)
						      .aShortArray9419[i_369_])
						     * i_377_)
						    - (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_369_]) * i_376_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9417
					[i_369_]
					= (short) i_378_;
				}
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass151_9436 == null
		    && ((Class89_Sub2) this).aClass151_9433 != null)
		    ((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713
			= null;
		if (((Class89_Sub2) this).aClass151_9436 != null)
		    ((Class151) ((Class89_Sub2) this).aClass151_9436)
			.anInterface8_1713
			= null;
	    }
	} else if (i == 3) {
	    for (int i_379_ = 0; i_379_ < i_324_; i_379_++) {
		int i_380_ = is[i_379_];
		if (i_380_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_381_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_380_];
		    for (int i_382_ = 0; i_382_ < is_381_.length; i_382_++) {
			int i_383_ = is_381_[i_382_];
			((Class89_Sub2) this).anIntArray9411[i_383_]
			    -= anInt9426;
			((Class89_Sub2) this).anIntArray9412[i_383_]
			    -= anInt9468;
			((Class89_Sub2) this).anIntArray9413[i_383_]
			    -= anInt9401;
			((Class89_Sub2) this).anIntArray9411[i_383_]
			    = (((Class89_Sub2) this).anIntArray9411[i_383_]
			       * i_320_) >> 7;
			((Class89_Sub2) this).anIntArray9412[i_383_]
			    = (((Class89_Sub2) this).anIntArray9412[i_383_]
			       * i_321_) >> 7;
			((Class89_Sub2) this).anIntArray9413[i_383_]
			    = (((Class89_Sub2) this).anIntArray9413[i_383_]
			       * i_322_) >> 7;
			((Class89_Sub2) this).anIntArray9411[i_383_]
			    += anInt9426;
			((Class89_Sub2) this).anIntArray9412[i_383_]
			    += anInt9468;
			((Class89_Sub2) this).anIntArray9413[i_383_]
			    += anInt9401;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_384_ = 0; i_384_ < i_324_; i_384_++) {
		    int i_385_ = is[i_384_];
		    if (i_385_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_386_ = (((Class89_Sub2) this)
					 .anIntArrayArray9432[i_385_]);
			for (int i_387_ = 0; i_387_ < is_386_.length;
			     i_387_++) {
			    int i_388_ = is_386_[i_387_];
			    int i_389_
				= (((Class89_Sub2) this).aByteArray9408[i_388_]
				   & 0xff) + i_320_ * 8;
			    if (i_389_ < 0)
				i_389_ = 0;
			    else if (i_389_ > 255)
				i_389_ = 255;
			    ((Class89_Sub2) this).aByteArray9408[i_388_]
				= (byte) i_389_;
			}
			if (is_386_.length > 0
			    && ((Class89_Sub2) this).aClass151_9433 != null)
			    ((Class151) ((Class89_Sub2) this).aClass151_9433)
				.anInterface8_1713
				= null;
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_390_ = 0;
			 i_390_ < ((Class89_Sub2) this).anInt9427; i_390_++) {
			Class171 class171
			    = ((Class89_Sub2) this).aClass171Array9459[i_390_];
			Class140 class140
			    = ((Class89_Sub2) this).aClass140Array9460[i_390_];
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & 0xffffff
			       | 255 - ((((Class89_Sub2) this).aByteArray9408
					 [((Class171) class171).anInt2069])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_391_ = 0; i_391_ < i_324_; i_391_++) {
		    int i_392_ = is[i_391_];
		    if (i_392_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_393_ = (((Class89_Sub2) this)
					 .anIntArrayArray9432[i_392_]);
			for (int i_394_ = 0; i_394_ < is_393_.length;
			     i_394_++) {
			    int i_395_ = is_393_[i_394_];
			    int i_396_ = ((((Class89_Sub2) this)
					   .aShortArray9442[i_395_])
					  & 0xffff);
			    int i_397_ = i_396_ >> 10 & 0x3f;
			    int i_398_ = i_396_ >> 7 & 0x7;
			    int i_399_ = i_396_ & 0x7f;
			    i_397_ = i_397_ + i_320_ & 0x3f;
			    i_398_ += i_321_ / 4;
			    if (i_398_ < 0)
				i_398_ = 0;
			    else if (i_398_ > 7)
				i_398_ = 7;
			    i_399_ += i_322_;
			    if (i_399_ < 0)
				i_399_ = 0;
			    else if (i_399_ > 127)
				i_399_ = 127;
			    ((Class89_Sub2) this).aShortArray9442[i_395_]
				= (short) (i_397_ << 10 | i_398_ << 7
					   | i_399_);
			}
			if (is_393_.length > 0
			    && ((Class89_Sub2) this).aClass151_9433 != null)
			    ((Class151) ((Class89_Sub2) this).aClass151_9433)
				.anInterface8_1713
				= null;
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_400_ = 0;
			 i_400_ < ((Class89_Sub2) this).anInt9427; i_400_++) {
			Class171 class171
			    = ((Class89_Sub2) this).aClass171Array9459[i_400_];
			Class140 class140
			    = ((Class89_Sub2) this).aClass140Array9460[i_400_];
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & ~0xffffff
			       | (Class474.anIntArray6383
				  [((((Class89_Sub2) this).aShortArray9442
				     [((Class171) class171).anInt2069])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_401_ = 0; i_401_ < i_324_; i_401_++) {
		    int i_402_ = is[i_401_];
		    if (i_402_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_403_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_402_]);
			for (int i_404_ = 0; i_404_ < is_403_.length;
			     i_404_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_403_[i_404_]]);
			    ((Class140) class140).anInt1628 += i_320_;
			    ((Class140) class140).anInt1629 += i_321_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_405_ = 0; i_405_ < i_324_; i_405_++) {
		    int i_406_ = is[i_405_];
		    if (i_406_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_407_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_406_]);
			for (int i_408_ = 0; i_408_ < is_407_.length;
			     i_408_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_407_[i_408_]]);
			    ((Class140) class140).anInt1626
				= (((Class140) class140).anInt1626 * i_320_
				   >> 7);
			    ((Class140) class140).anInt1627
				= (((Class140) class140).anInt1627 * i_321_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_409_ = 0; i_409_ < i_324_; i_409_++) {
		    int i_410_ = is[i_409_];
		    if (i_410_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_411_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_410_]);
			for (int i_412_ = 0; i_412_ < is_411_.length;
			     i_412_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_411_[i_412_]]);
			    ((Class140) class140).anInt1625
				= (((Class140) class140).anInt1625 + i_320_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public void method1980(int i) {
	int i_413_ = Class282.anIntArray4430[i];
	int i_414_ = Class282.anIntArray4441[i];
	for (int i_415_ = 0; i_415_ < ((Class89_Sub2) this).anInt9410;
	     i_415_++) {
	    int i_416_
		= ((((Class89_Sub2) this).anIntArray9412[i_415_] * i_413_
		    + ((Class89_Sub2) this).anIntArray9411[i_415_] * i_414_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9412[i_415_]
		= ((((Class89_Sub2) this).anIntArray9412[i_415_] * i_414_
		    - ((Class89_Sub2) this).anIntArray9411[i_415_] * i_413_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9411[i_415_] = i_416_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public boolean method2021() {
	return ((Class89_Sub2) this).aBool9425;
    }
    
    public void method1873() {
	for (int i = 0; i < ((Class89_Sub2) this).anInt9410; i++)
	    ((Class89_Sub2) this).anIntArray9413[i]
		= -((Class89_Sub2) this).anIntArray9413[i];
	for (int i = 0; i < ((Class89_Sub2) this).anInt9416; i++)
	    ((Class89_Sub2) this).aShortArray9419[i]
		= (short) -((Class89_Sub2) this).aShortArray9419[i];
	for (int i = 0; i < ((Class89_Sub2) this).anInt9424; i++) {
	    short i_417_ = ((Class89_Sub2) this).aShortArray9428[i];
	    ((Class89_Sub2) this).aShortArray9428[i]
		= ((Class89_Sub2) this).aShortArray9407[i];
	    ((Class89_Sub2) this).aShortArray9407[i] = i_417_;
	}
	if (((Class89_Sub2) this).aClass151_9436 == null
	    && ((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9436 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9436).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass146_9438 != null)
	    ((Class146) ((Class89_Sub2) this).aClass146_9438)
		.anInterface14_1692
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1863(int i, int i_418_, int i_419_) {
	for (int i_420_ = 0; i_420_ < ((Class89_Sub2) this).anInt9410;
	     i_420_++) {
	    if (i != 128)
		((Class89_Sub2) this).anIntArray9411[i_420_]
		    = ((Class89_Sub2) this).anIntArray9411[i_420_] * i >> 7;
	    if (i_418_ != 128)
		((Class89_Sub2) this).anIntArray9412[i_420_]
		    = (((Class89_Sub2) this).anIntArray9412[i_420_] * i_418_
		       >> 7);
	    if (i_419_ != 128)
		((Class89_Sub2) this).anIntArray9413[i_420_]
		    = (((Class89_Sub2) this).anIntArray9413[i_420_] * i_419_
		       >> 7);
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    boolean method15535(int i, int i_421_, int i_422_, int i_423_, int i_424_,
			int i_425_, int i_426_, int i_427_) {
	if (i_421_ < i_422_ && i_421_ < i_423_ && i_421_ < i_424_)
	    return false;
	if (i_421_ > i_422_ && i_421_ > i_423_ && i_421_ > i_424_)
	    return false;
	if (i < i_425_ && i < i_426_ && i < i_427_)
	    return false;
	if (i > i_425_ && i > i_426_ && i > i_427_)
	    return false;
	return true;
    }
    
    public boolean method2023() {
	return ((Class89_Sub2) this).aBool9425;
    }
    
    public void method1922() {
	if (!((Class89_Sub2) this).aBool9451) {
	    if (!((Class89_Sub2) this).aBool9444)
		method15537();
	    ((Class89_Sub2) this).aShort9435
		= ((Class89_Sub2) this).aShort9403;
	    ((Class89_Sub2) this).aBool9451 = true;
	}
    }
    
    public int method1893() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).anInt9421;
    }
    
    public void method1990(int i) {
	int i_428_ = Class282.anIntArray4430[i];
	int i_429_ = Class282.anIntArray4441[i];
	for (int i_430_ = 0; i_430_ < ((Class89_Sub2) this).anInt9410;
	     i_430_++) {
	    int i_431_
		= ((((Class89_Sub2) this).anIntArray9412[i_430_] * i_428_
		    + ((Class89_Sub2) this).anIntArray9411[i_430_] * i_429_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9412[i_430_]
		= ((((Class89_Sub2) this).anIntArray9412[i_430_] * i_429_
		    - ((Class89_Sub2) this).anIntArray9411[i_430_] * i_428_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9411[i_430_] = i_431_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public int method1895() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9447;
    }
    
    public int method1906() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9448;
    }
    
    public int method1902() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9403;
    }
    
    public int method1865() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9446;
    }
    
    public int method1899() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9449;
    }
    
    public int method2004() {
	return ((Class89_Sub2) this).aShort9406;
    }
    
    public boolean method2025() {
	return ((Class89_Sub2) this).aBool9452;
    }
    
    void method15536(boolean bool) {
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .aClass241_Sub3_Sub2_9231.payload).length
	    < ((Class89_Sub2) this).anInt9441 * 6)
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.aClass241_Sub3_Sub2_9231
		= new Class241_Sub3_Sub2((((Class89_Sub2) this).anInt9441
					  + 100) * 6);
	else
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.aClass241_Sub3_Sub2_9231.pointer
		= 0;
	Class241_Sub3_Sub2 class241_sub3_sub2
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass241_Sub3_Sub2_9231);
	if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	    .aBool9144) {
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9428[i]),
					       -484048531);
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9462[i]),
					       -484048531);
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9407[i]),
					       -484048531);
	    }
	} else {
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9428[i]),
					       (byte) -61);
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9462[i]),
					       (byte) 76);
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9407[i]),
					       (byte) 39);
	    }
	}
	if (class241_sub3_sub2.pointer * 421967667 != 0) {
	    if (bool) {
		if (((Class89_Sub2) this).anInterface14_9439 == null)
		    ((Class89_Sub2) this).anInterface14_9439
			= (((Class89_Sub2) this).aClass103_Sub1_9457
			       .method15200
			   (5123, class241_sub3_sub2.payload,
			    class241_sub3_sub2.pointer * 421967667, true));
		else
		    ((Class89_Sub2) this).anInterface14_9439.method99
			(5123, class241_sub3_sub2.payload,
			 class241_sub3_sub2.pointer * 421967667);
		((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692
		    = ((Class89_Sub2) this).anInterface14_9439;
	    } else
		((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692
		    = (((Class89_Sub2) this).aClass103_Sub1_9457.method15200
		       (5123, class241_sub3_sub2.payload,
			class241_sub3_sub2.pointer * 421967667, false));
	    if (!bool)
		((Class89_Sub2) this).aBool9431 = true;
	}
    }
    
    void method15537() {
	int i = 32767;
	int i_432_ = 32767;
	int i_433_ = 32767;
	int i_434_ = -32768;
	int i_435_ = -32768;
	int i_436_ = -32768;
	int i_437_ = 0;
	int i_438_ = 0;
	for (int i_439_ = 0; i_439_ < ((Class89_Sub2) this).anInt9410;
	     i_439_++) {
	    int i_440_ = ((Class89_Sub2) this).anIntArray9411[i_439_];
	    int i_441_ = ((Class89_Sub2) this).anIntArray9412[i_439_];
	    int i_442_ = ((Class89_Sub2) this).anIntArray9413[i_439_];
	    if (i_440_ < i)
		i = i_440_;
	    if (i_440_ > i_434_)
		i_434_ = i_440_;
	    if (i_441_ < i_432_)
		i_432_ = i_441_;
	    if (i_441_ > i_435_)
		i_435_ = i_441_;
	    if (i_442_ < i_433_)
		i_433_ = i_442_;
	    if (i_442_ > i_436_)
		i_436_ = i_442_;
	    int i_443_ = i_440_ * i_440_ + i_442_ * i_442_;
	    if (i_443_ > i_437_)
		i_437_ = i_443_;
	    i_443_ = i_440_ * i_440_ + i_442_ * i_442_ + i_441_ * i_441_;
	    if (i_443_ > i_438_)
		i_438_ = i_443_;
	}
	((Class89_Sub2) this).aShort9447 = (short) i;
	((Class89_Sub2) this).aShort9448 = (short) i_434_;
	((Class89_Sub2) this).aShort9403 = (short) i_432_;
	((Class89_Sub2) this).aShort9446 = (short) i_435_;
	((Class89_Sub2) this).aShort9449 = (short) i_433_;
	((Class89_Sub2) this).aShort9450 = (short) i_436_;
	((Class89_Sub2) this).anInt9421
	    = (int) (Math.sqrt((double) i_437_) + 0.99);
	((Class89_Sub2) this).anInt9443
	    = (int) (Math.sqrt((double) i_438_) + 0.99);
	((Class89_Sub2) this).aBool9444 = true;
    }
    
    public void method2057(int i) {
	((Class89_Sub2) this).aShort9406 = (short) i;
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9436 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9436).anInterface8_1713
		= null;
    }
    
    public int method1905() {
	return ((Class89_Sub2) this).aShort9405;
    }
    
    void method1962(int i, int[] is, int i_444_, int i_445_, int i_446_,
		    boolean bool, int i_447_, int[] is_448_) {
	int i_449_ = is.length;
	if (i == 0) {
	    i_444_ <<= 4;
	    i_445_ <<= 4;
	    i_446_ <<= 4;
	    int i_450_ = 0;
	    anInt9426 = 0;
	    anInt9468 = 0;
	    anInt9401 = 0;
	    for (int i_451_ = 0; i_451_ < i_449_; i_451_++) {
		int i_452_ = is[i_451_];
		if (i_452_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_453_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_452_];
		    for (int i_454_ = 0; i_454_ < is_453_.length; i_454_++) {
			int i_455_ = is_453_[i_454_];
			if (((Class89_Sub2) this).aShortArray9465 == null
			    || (i_447_ & (((Class89_Sub2) this).aShortArray9465
					  [i_455_])) != 0) {
			    anInt9426 += (((Class89_Sub2) this).anIntArray9411
					  [i_455_]);
			    anInt9468 += (((Class89_Sub2) this).anIntArray9412
					  [i_455_]);
			    anInt9401 += (((Class89_Sub2) this).anIntArray9413
					  [i_455_]);
			    i_450_++;
			}
		    }
		}
	    }
	    if (i_450_ > 0) {
		anInt9426 = anInt9426 / i_450_ + i_444_;
		anInt9468 = anInt9468 / i_450_ + i_445_;
		anInt9401 = anInt9401 / i_450_ + i_446_;
		aBool9470 = true;
	    } else {
		anInt9426 = i_444_;
		anInt9468 = i_445_;
		anInt9401 = i_446_;
	    }
	} else if (i == 1) {
	    if (is_448_ != null) {
		int i_456_ = ((is_448_[0] * i_444_ + is_448_[1] * i_445_
			       + is_448_[2] * i_446_ + 8192)
			      >> 14);
		int i_457_ = ((is_448_[3] * i_444_ + is_448_[4] * i_445_
			       + is_448_[5] * i_446_ + 8192)
			      >> 14);
		int i_458_ = ((is_448_[6] * i_444_ + is_448_[7] * i_445_
			       + is_448_[8] * i_446_ + 8192)
			      >> 14);
		i_444_ = i_456_;
		i_445_ = i_457_;
		i_446_ = i_458_;
	    }
	    i_444_ <<= 4;
	    i_445_ <<= 4;
	    i_446_ <<= 4;
	    for (int i_459_ = 0; i_459_ < i_449_; i_459_++) {
		int i_460_ = is[i_459_];
		if (i_460_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_461_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_460_];
		    for (int i_462_ = 0; i_462_ < is_461_.length; i_462_++) {
			int i_463_ = is_461_[i_462_];
			if (((Class89_Sub2) this).aShortArray9465 == null
			    || (i_447_ & (((Class89_Sub2) this).aShortArray9465
					  [i_463_])) != 0) {
			    ((Class89_Sub2) this).anIntArray9411[i_463_]
				+= i_444_;
			    ((Class89_Sub2) this).anIntArray9412[i_463_]
				+= i_445_;
			    ((Class89_Sub2) this).anIntArray9413[i_463_]
				+= i_446_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_448_ != null) {
		int i_464_ = is_448_[9] << 4;
		int i_465_ = is_448_[10] << 4;
		int i_466_ = is_448_[11] << 4;
		int i_467_ = is_448_[12] << 4;
		int i_468_ = is_448_[13] << 4;
		int i_469_ = is_448_[14] << 4;
		if (aBool9470) {
		    int i_470_
			= ((is_448_[0] * anInt9426 + is_448_[3] * anInt9468
			    + is_448_[6] * anInt9401 + 8192)
			   >> 14);
		    int i_471_
			= ((is_448_[1] * anInt9426 + is_448_[4] * anInt9468
			    + is_448_[7] * anInt9401 + 8192)
			   >> 14);
		    int i_472_
			= ((is_448_[2] * anInt9426 + is_448_[5] * anInt9468
			    + is_448_[8] * anInt9401 + 8192)
			   >> 14);
		    i_470_ += i_467_;
		    i_471_ += i_468_;
		    i_472_ += i_469_;
		    anInt9426 = i_470_;
		    anInt9468 = i_471_;
		    anInt9401 = i_472_;
		    aBool9470 = false;
		}
		int[] is_473_ = new int[9];
		int i_474_ = Class282.anIntArray4441[i_444_];
		int i_475_ = Class282.anIntArray4430[i_444_];
		int i_476_ = Class282.anIntArray4441[i_445_];
		int i_477_ = Class282.anIntArray4430[i_445_];
		int i_478_ = Class282.anIntArray4441[i_446_];
		int i_479_ = Class282.anIntArray4430[i_446_];
		int i_480_ = i_475_ * i_478_ + 8192 >> 14;
		int i_481_ = i_475_ * i_479_ + 8192 >> 14;
		is_473_[0] = i_476_ * i_478_ + i_477_ * i_481_ + 8192 >> 14;
		is_473_[1] = -i_476_ * i_479_ + i_477_ * i_480_ + 8192 >> 14;
		is_473_[2] = i_477_ * i_474_ + 8192 >> 14;
		is_473_[3] = i_474_ * i_479_ + 8192 >> 14;
		is_473_[4] = i_474_ * i_478_ + 8192 >> 14;
		is_473_[5] = -i_475_;
		is_473_[6] = -i_477_ * i_478_ + i_476_ * i_481_ + 8192 >> 14;
		is_473_[7] = i_477_ * i_479_ + i_476_ * i_480_ + 8192 >> 14;
		is_473_[8] = i_476_ * i_474_ + 8192 >> 14;
		int i_482_ = (is_473_[0] * -anInt9426 + is_473_[1] * -anInt9468
			      + is_473_[2] * -anInt9401 + 8192) >> 14;
		int i_483_ = (is_473_[3] * -anInt9426 + is_473_[4] * -anInt9468
			      + is_473_[5] * -anInt9401 + 8192) >> 14;
		int i_484_ = (is_473_[6] * -anInt9426 + is_473_[7] * -anInt9468
			      + is_473_[8] * -anInt9401 + 8192) >> 14;
		int i_485_ = i_482_ + anInt9426;
		int i_486_ = i_483_ + anInt9468;
		int i_487_ = i_484_ + anInt9401;
		int[] is_488_ = new int[9];
		for (int i_489_ = 0; i_489_ < 3; i_489_++) {
		    for (int i_490_ = 0; i_490_ < 3; i_490_++) {
			int i_491_ = 0;
			for (int i_492_ = 0; i_492_ < 3; i_492_++)
			    i_491_ += (is_473_[i_489_ * 3 + i_492_]
				       * is_448_[i_490_ * 3 + i_492_]);
			is_488_[i_489_ * 3 + i_490_] = i_491_ + 8192 >> 14;
		    }
		}
		int i_493_ = ((is_473_[0] * i_467_ + is_473_[1] * i_468_
			       + is_473_[2] * i_469_ + 8192)
			      >> 14);
		int i_494_ = ((is_473_[3] * i_467_ + is_473_[4] * i_468_
			       + is_473_[5] * i_469_ + 8192)
			      >> 14);
		int i_495_ = ((is_473_[6] * i_467_ + is_473_[7] * i_468_
			       + is_473_[8] * i_469_ + 8192)
			      >> 14);
		i_493_ += i_485_;
		i_494_ += i_486_;
		i_495_ += i_487_;
		int[] is_496_ = new int[9];
		for (int i_497_ = 0; i_497_ < 3; i_497_++) {
		    for (int i_498_ = 0; i_498_ < 3; i_498_++) {
			int i_499_ = 0;
			for (int i_500_ = 0; i_500_ < 3; i_500_++)
			    i_499_ += (is_448_[i_497_ * 3 + i_500_]
				       * is_488_[i_498_ + i_500_ * 3]);
			is_496_[i_497_ * 3 + i_498_] = i_499_ + 8192 >> 14;
		    }
		}
		int i_501_ = ((is_448_[0] * i_493_ + is_448_[1] * i_494_
			       + is_448_[2] * i_495_ + 8192)
			      >> 14);
		int i_502_ = ((is_448_[3] * i_493_ + is_448_[4] * i_494_
			       + is_448_[5] * i_495_ + 8192)
			      >> 14);
		int i_503_ = ((is_448_[6] * i_493_ + is_448_[7] * i_494_
			       + is_448_[8] * i_495_ + 8192)
			      >> 14);
		i_501_ += i_464_;
		i_502_ += i_465_;
		i_503_ += i_466_;
		for (int i_504_ = 0; i_504_ < i_449_; i_504_++) {
		    int i_505_ = is[i_504_];
		    if (i_505_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_506_ = (((Class89_Sub2) this)
					 .anIntArrayArray9467[i_505_]);
			for (int i_507_ = 0; i_507_ < is_506_.length;
			     i_507_++) {
			    int i_508_ = is_506_[i_507_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_447_ & (((Class89_Sub2) this)
					       .aShortArray9465[i_508_]))
				    != 0)) {
				int i_509_
				    = (is_496_[0] * (((Class89_Sub2) this)
						     .anIntArray9411[i_508_])
				       + is_496_[1] * (((Class89_Sub2) this)
						       .anIntArray9412[i_508_])
				       + is_496_[2] * (((Class89_Sub2) this)
						       .anIntArray9413[i_508_])
				       + 8192) >> 14;
				int i_510_
				    = (is_496_[3] * (((Class89_Sub2) this)
						     .anIntArray9411[i_508_])
				       + is_496_[4] * (((Class89_Sub2) this)
						       .anIntArray9412[i_508_])
				       + is_496_[5] * (((Class89_Sub2) this)
						       .anIntArray9413[i_508_])
				       + 8192) >> 14;
				int i_511_
				    = (is_496_[6] * (((Class89_Sub2) this)
						     .anIntArray9411[i_508_])
				       + is_496_[7] * (((Class89_Sub2) this)
						       .anIntArray9412[i_508_])
				       + is_496_[8] * (((Class89_Sub2) this)
						       .anIntArray9413[i_508_])
				       + 8192) >> 14;
				i_509_ += i_501_;
				i_510_ += i_502_;
				i_511_ += i_503_;
				((Class89_Sub2) this).anIntArray9411[i_508_]
				    = i_509_;
				((Class89_Sub2) this).anIntArray9412[i_508_]
				    = i_510_;
				((Class89_Sub2) this).anIntArray9413[i_508_]
				    = i_511_;
			    }
			}
		    }
		}
	    } else {
		for (int i_512_ = 0; i_512_ < i_449_; i_512_++) {
		    int i_513_ = is[i_512_];
		    if (i_513_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_514_ = (((Class89_Sub2) this)
					 .anIntArrayArray9467[i_513_]);
			for (int i_515_ = 0; i_515_ < is_514_.length;
			     i_515_++) {
			    int i_516_ = is_514_[i_515_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_447_ & (((Class89_Sub2) this)
					       .aShortArray9465[i_516_]))
				    != 0)) {
				((Class89_Sub2) this).anIntArray9411[i_516_]
				    -= anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_516_]
				    -= anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_516_]
				    -= anInt9401;
				if (i_446_ != 0) {
				    int i_517_
					= Class282.anIntArray4430[i_446_];
				    int i_518_
					= Class282.anIntArray4441[i_446_];
				    int i_519_
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_516_]) * i_517_
					   + (((Class89_Sub2) this)
					      .anIntArray9411[i_516_]) * i_518_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9412
					[i_516_]
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_516_]) * i_518_
					   - (((Class89_Sub2) this)
					      .anIntArray9411[i_516_]) * i_517_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9411
					[i_516_]
					= i_519_;
				}
				if (i_444_ != 0) {
				    int i_520_
					= Class282.anIntArray4430[i_444_];
				    int i_521_
					= Class282.anIntArray4441[i_444_];
				    int i_522_
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_516_]) * i_521_
					   - (((Class89_Sub2) this)
					      .anIntArray9413[i_516_]) * i_520_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9413
					[i_516_]
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_516_]) * i_520_
					   + (((Class89_Sub2) this)
					      .anIntArray9413[i_516_]) * i_521_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9412
					[i_516_]
					= i_522_;
				}
				if (i_445_ != 0) {
				    int i_523_
					= Class282.anIntArray4430[i_445_];
				    int i_524_
					= Class282.anIntArray4441[i_445_];
				    int i_525_
					= ((((Class89_Sub2) this)
					    .anIntArray9413[i_516_]) * i_523_
					   + (((Class89_Sub2) this)
					      .anIntArray9411[i_516_]) * i_524_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9413
					[i_516_]
					= ((((Class89_Sub2) this)
					    .anIntArray9413[i_516_]) * i_524_
					   - (((Class89_Sub2) this)
					      .anIntArray9411[i_516_]) * i_523_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9411
					[i_516_]
					= i_525_;
				}
				((Class89_Sub2) this).anIntArray9411[i_516_]
				    += anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_516_]
				    += anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_516_]
				    += anInt9401;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_526_ = 0; i_526_ < i_449_; i_526_++) {
			int i_527_ = is[i_526_];
			if (i_527_ < (((Class89_Sub2) this)
				      .anIntArrayArray9467).length) {
			    int[] is_528_ = (((Class89_Sub2) this)
					     .anIntArrayArray9467[i_527_]);
			    for (int i_529_ = 0; i_529_ < is_528_.length;
				 i_529_++) {
				int i_530_ = is_528_[i_529_];
				if ((((Class89_Sub2) this).aShortArray9465
				     == null)
				    || ((i_447_ & (((Class89_Sub2) this)
						   .aShortArray9465[i_530_]))
					!= 0)) {
				    int i_531_ = (((Class89_Sub2) this)
						  .anIntArray9395[i_530_]);
				    int i_532_ = (((Class89_Sub2) this)
						  .anIntArray9395[i_530_ + 1]);
				    for (int i_533_ = i_531_;
					 (i_533_ < i_532_
					  && (((Class89_Sub2) this)
					      .aShortArray9455[i_533_]) != 0);
					 i_533_++) {
					int i_534_
					    = (((((Class89_Sub2) this)
						 .aShortArray9455[i_533_])
						& 0xffff)
					       - 1);
					if (i_446_ != 0) {
					    int i_535_
						= (Class282.anIntArray4430
						   [i_446_]);
					    int i_536_
						= (Class282.anIntArray4441
						   [i_446_]);
					    int i_537_
						= ((((((Class89_Sub2) this)
						      .aShortArray9418[i_534_])
						     * i_535_)
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_534_]) * i_536_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9418[i_534_]
						= (short) (((((Class89_Sub2)
							      this)
							     .aShortArray9418
							     [i_534_]) * i_536_
							    - ((((Class89_Sub2)
								 this)
								.aShortArray9417
								[i_534_])
							       * i_535_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9417[i_534_]
						= (short) i_537_;
					}
					if (i_444_ != 0) {
					    int i_538_
						= (Class282.anIntArray4430
						   [i_444_]);
					    int i_539_
						= (Class282.anIntArray4441
						   [i_444_]);
					    int i_540_
						= ((((((Class89_Sub2) this)
						      .aShortArray9418[i_534_])
						     * i_539_)
						    - (((Class89_Sub2) this)
						       .aShortArray9419
						       [i_534_]) * i_538_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9419[i_534_]
						= (short) (((((Class89_Sub2)
							      this)
							     .aShortArray9418
							     [i_534_]) * i_538_
							    + ((((Class89_Sub2)
								 this)
								.aShortArray9419
								[i_534_])
							       * i_539_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9418[i_534_]
						= (short) i_540_;
					}
					if (i_445_ != 0) {
					    int i_541_
						= (Class282.anIntArray4430
						   [i_445_]);
					    int i_542_
						= (Class282.anIntArray4441
						   [i_445_]);
					    int i_543_
						= ((((((Class89_Sub2) this)
						      .aShortArray9419[i_534_])
						     * i_541_)
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_534_]) * i_542_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9419[i_534_]
						= (short) (((((Class89_Sub2)
							      this)
							     .aShortArray9419
							     [i_534_]) * i_542_
							    - ((((Class89_Sub2)
								 this)
								.aShortArray9417
								[i_534_])
							       * i_541_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9417[i_534_]
						= (short) i_543_;
					}
				    }
				}
			    }
			}
		    }
		    if (((Class89_Sub2) this).aClass151_9436 == null
			&& ((Class89_Sub2) this).aClass151_9433 != null)
			((Class151) ((Class89_Sub2) this).aClass151_9433)
			    .anInterface8_1713
			    = null;
		    if (((Class89_Sub2) this).aClass151_9436 != null)
			((Class151) ((Class89_Sub2) this).aClass151_9436)
			    .anInterface8_1713
			    = null;
		}
	    }
	} else if (i == 3) {
	    if (is_448_ != null) {
		int i_544_ = is_448_[9] << 4;
		int i_545_ = is_448_[10] << 4;
		int i_546_ = is_448_[11] << 4;
		int i_547_ = is_448_[12] << 4;
		int i_548_ = is_448_[13] << 4;
		int i_549_ = is_448_[14] << 4;
		if (aBool9470) {
		    int i_550_
			= ((is_448_[0] * anInt9426 + is_448_[3] * anInt9468
			    + is_448_[6] * anInt9401 + 8192)
			   >> 14);
		    int i_551_
			= ((is_448_[1] * anInt9426 + is_448_[4] * anInt9468
			    + is_448_[7] * anInt9401 + 8192)
			   >> 14);
		    int i_552_
			= ((is_448_[2] * anInt9426 + is_448_[5] * anInt9468
			    + is_448_[8] * anInt9401 + 8192)
			   >> 14);
		    i_550_ += i_547_;
		    i_551_ += i_548_;
		    i_552_ += i_549_;
		    anInt9426 = i_550_;
		    anInt9468 = i_551_;
		    anInt9401 = i_552_;
		    aBool9470 = false;
		}
		int i_553_ = i_444_ << 15 >> 7;
		int i_554_ = i_445_ << 15 >> 7;
		int i_555_ = i_446_ << 15 >> 7;
		int i_556_ = i_553_ * -anInt9426 + 8192 >> 14;
		int i_557_ = i_554_ * -anInt9468 + 8192 >> 14;
		int i_558_ = i_555_ * -anInt9401 + 8192 >> 14;
		int i_559_ = i_556_ + anInt9426;
		int i_560_ = i_557_ + anInt9468;
		int i_561_ = i_558_ + anInt9401;
		int[] is_562_ = new int[9];
		is_562_[0] = i_553_ * is_448_[0] + 8192 >> 14;
		is_562_[1] = i_553_ * is_448_[3] + 8192 >> 14;
		is_562_[2] = i_553_ * is_448_[6] + 8192 >> 14;
		is_562_[3] = i_554_ * is_448_[1] + 8192 >> 14;
		is_562_[4] = i_554_ * is_448_[4] + 8192 >> 14;
		is_562_[5] = i_554_ * is_448_[7] + 8192 >> 14;
		is_562_[6] = i_555_ * is_448_[2] + 8192 >> 14;
		is_562_[7] = i_555_ * is_448_[5] + 8192 >> 14;
		is_562_[8] = i_555_ * is_448_[8] + 8192 >> 14;
		int i_563_ = i_553_ * i_547_ + 8192 >> 14;
		int i_564_ = i_554_ * i_548_ + 8192 >> 14;
		int i_565_ = i_555_ * i_549_ + 8192 >> 14;
		i_563_ += i_559_;
		i_564_ += i_560_;
		i_565_ += i_561_;
		int[] is_566_ = new int[9];
		for (int i_567_ = 0; i_567_ < 3; i_567_++) {
		    for (int i_568_ = 0; i_568_ < 3; i_568_++) {
			int i_569_ = 0;
			for (int i_570_ = 0; i_570_ < 3; i_570_++)
			    i_569_ += (is_448_[i_567_ * 3 + i_570_]
				       * is_562_[i_568_ + i_570_ * 3]);
			is_566_[i_567_ * 3 + i_568_] = i_569_ + 8192 >> 14;
		    }
		}
		int i_571_ = ((is_448_[0] * i_563_ + is_448_[1] * i_564_
			       + is_448_[2] * i_565_ + 8192)
			      >> 14);
		int i_572_ = ((is_448_[3] * i_563_ + is_448_[4] * i_564_
			       + is_448_[5] * i_565_ + 8192)
			      >> 14);
		int i_573_ = ((is_448_[6] * i_563_ + is_448_[7] * i_564_
			       + is_448_[8] * i_565_ + 8192)
			      >> 14);
		i_571_ += i_544_;
		i_572_ += i_545_;
		i_573_ += i_546_;
		for (int i_574_ = 0; i_574_ < i_449_; i_574_++) {
		    int i_575_ = is[i_574_];
		    if (i_575_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_576_ = (((Class89_Sub2) this)
					 .anIntArrayArray9467[i_575_]);
			for (int i_577_ = 0; i_577_ < is_576_.length;
			     i_577_++) {
			    int i_578_ = is_576_[i_577_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_447_ & (((Class89_Sub2) this)
					       .aShortArray9465[i_578_]))
				    != 0)) {
				int i_579_
				    = (is_566_[0] * (((Class89_Sub2) this)
						     .anIntArray9411[i_578_])
				       + is_566_[1] * (((Class89_Sub2) this)
						       .anIntArray9412[i_578_])
				       + is_566_[2] * (((Class89_Sub2) this)
						       .anIntArray9413[i_578_])
				       + 8192) >> 14;
				int i_580_
				    = (is_566_[3] * (((Class89_Sub2) this)
						     .anIntArray9411[i_578_])
				       + is_566_[4] * (((Class89_Sub2) this)
						       .anIntArray9412[i_578_])
				       + is_566_[5] * (((Class89_Sub2) this)
						       .anIntArray9413[i_578_])
				       + 8192) >> 14;
				int i_581_
				    = (is_566_[6] * (((Class89_Sub2) this)
						     .anIntArray9411[i_578_])
				       + is_566_[7] * (((Class89_Sub2) this)
						       .anIntArray9412[i_578_])
				       + is_566_[8] * (((Class89_Sub2) this)
						       .anIntArray9413[i_578_])
				       + 8192) >> 14;
				i_579_ += i_571_;
				i_580_ += i_572_;
				i_581_ += i_573_;
				((Class89_Sub2) this).anIntArray9411[i_578_]
				    = i_579_;
				((Class89_Sub2) this).anIntArray9412[i_578_]
				    = i_580_;
				((Class89_Sub2) this).anIntArray9413[i_578_]
				    = i_581_;
			    }
			}
		    }
		}
	    } else {
		for (int i_582_ = 0; i_582_ < i_449_; i_582_++) {
		    int i_583_ = is[i_582_];
		    if (i_583_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_584_ = (((Class89_Sub2) this)
					 .anIntArrayArray9467[i_583_]);
			for (int i_585_ = 0; i_585_ < is_584_.length;
			     i_585_++) {
			    int i_586_ = is_584_[i_585_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_447_ & (((Class89_Sub2) this)
					       .aShortArray9465[i_586_]))
				    != 0)) {
				((Class89_Sub2) this).anIntArray9411[i_586_]
				    -= anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_586_]
				    -= anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_586_]
				    -= anInt9401;
				((Class89_Sub2) this).anIntArray9411[i_586_]
				    = (((Class89_Sub2) this).anIntArray9411
				       [i_586_]) * i_444_ >> 7;
				((Class89_Sub2) this).anIntArray9412[i_586_]
				    = (((Class89_Sub2) this).anIntArray9412
				       [i_586_]) * i_445_ >> 7;
				((Class89_Sub2) this).anIntArray9413[i_586_]
				    = (((Class89_Sub2) this).anIntArray9413
				       [i_586_]) * i_446_ >> 7;
				((Class89_Sub2) this).anIntArray9411[i_586_]
				    += anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_586_]
				    += anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_586_]
				    += anInt9401;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_587_ = 0; i_587_ < i_449_; i_587_++) {
		    int i_588_ = is[i_587_];
		    if (i_588_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_589_ = (((Class89_Sub2) this)
					 .anIntArrayArray9432[i_588_]);
			for (int i_590_ = 0; i_590_ < is_589_.length;
			     i_590_++) {
			    int i_591_ = is_589_[i_590_];
			    if (((Class89_Sub2) this).aShortArray9415 == null
				|| ((i_447_ & (((Class89_Sub2) this)
					       .aShortArray9415[i_591_]))
				    != 0)) {
				int i_592_ = (((((Class89_Sub2) this)
						.aByteArray9408[i_591_])
					       & 0xff)
					      + i_444_ * 8);
				if (i_592_ < 0)
				    i_592_ = 0;
				else if (i_592_ > 255)
				    i_592_ = 255;
				((Class89_Sub2) this).aByteArray9408[i_591_]
				    = (byte) i_592_;
				if (((Class89_Sub2) this).aClass151_9433
				    != null)
				    ((Class151)
				     ((Class89_Sub2) this).aClass151_9433)
					.anInterface8_1713
					= null;
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_593_ = 0;
			 i_593_ < ((Class89_Sub2) this).anInt9427; i_593_++) {
			Class171 class171
			    = ((Class89_Sub2) this).aClass171Array9459[i_593_];
			Class140 class140
			    = ((Class89_Sub2) this).aClass140Array9460[i_593_];
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & 0xffffff
			       | 255 - ((((Class89_Sub2) this).aByteArray9408
					 [((Class171) class171).anInt2069])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_594_ = 0; i_594_ < i_449_; i_594_++) {
		    int i_595_ = is[i_594_];
		    if (i_595_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_596_ = (((Class89_Sub2) this)
					 .anIntArrayArray9432[i_595_]);
			for (int i_597_ = 0; i_597_ < is_596_.length;
			     i_597_++) {
			    int i_598_ = is_596_[i_597_];
			    if (((Class89_Sub2) this).aShortArray9415 == null
				|| ((i_447_ & (((Class89_Sub2) this)
					       .aShortArray9415[i_598_]))
				    != 0)) {
				int i_599_ = ((((Class89_Sub2) this)
					       .aShortArray9442[i_598_])
					      & 0xffff);
				int i_600_ = i_599_ >> 10 & 0x3f;
				int i_601_ = i_599_ >> 7 & 0x7;
				int i_602_ = i_599_ & 0x7f;
				i_600_ = i_600_ + i_444_ & 0x3f;
				i_601_ += i_445_ / 4;
				if (i_601_ < 0)
				    i_601_ = 0;
				else if (i_601_ > 7)
				    i_601_ = 7;
				i_602_ += i_446_;
				if (i_602_ < 0)
				    i_602_ = 0;
				else if (i_602_ > 127)
				    i_602_ = 127;
				((Class89_Sub2) this).aShortArray9442[i_598_]
				    = (short) (i_600_ << 10 | i_601_ << 7
					       | i_602_);
				if (((Class89_Sub2) this).aClass151_9433
				    != null)
				    ((Class151)
				     ((Class89_Sub2) this).aClass151_9433)
					.anInterface8_1713
					= null;
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_603_ = 0;
			 i_603_ < ((Class89_Sub2) this).anInt9427; i_603_++) {
			Class171 class171
			    = ((Class89_Sub2) this).aClass171Array9459[i_603_];
			Class140 class140
			    = ((Class89_Sub2) this).aClass140Array9460[i_603_];
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & ~0xffffff
			       | (Class474.anIntArray6383
				  [((((Class89_Sub2) this).aShortArray9442
				     [((Class171) class171).anInt2069])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_604_ = 0; i_604_ < i_449_; i_604_++) {
		    int i_605_ = is[i_604_];
		    if (i_605_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_606_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_605_]);
			for (int i_607_ = 0; i_607_ < is_606_.length;
			     i_607_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_606_[i_607_]]);
			    ((Class140) class140).anInt1628 += i_444_;
			    ((Class140) class140).anInt1629 += i_445_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_608_ = 0; i_608_ < i_449_; i_608_++) {
		    int i_609_ = is[i_608_];
		    if (i_609_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_610_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_609_]);
			for (int i_611_ = 0; i_611_ < is_610_.length;
			     i_611_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_610_[i_611_]]);
			    ((Class140) class140).anInt1626
				= (((Class140) class140).anInt1626 * i_444_
				   >> 7);
			    ((Class140) class140).anInt1627
				= (((Class140) class140).anInt1627 * i_445_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_612_ = 0; i_612_ < i_449_; i_612_++) {
		    int i_613_ = is[i_612_];
		    if (i_613_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_614_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_613_]);
			for (int i_615_ = 0; i_615_ < is_614_.length;
			     i_615_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_614_[i_615_]]);
			    ((Class140) class140).anInt1625
				= (((Class140) class140).anInt1625 + i_444_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public byte[] method1907() {
	return ((Class89_Sub2) this).aByteArray9408;
    }
    
    public void method1977() {
	if (((Class89_Sub2) this).anInt9416 > 0
	    && ((Class89_Sub2) this).anInt9441 > 0) {
	    method15541(false);
	    if ((((Class89_Sub2) this).aByte9404 & 0x10) == 0
		&& (((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692) == null)
		method15536(false);
	    method15544();
	}
    }
    
    public void method1909(byte i, byte[] is) {
	if (is == null) {
	    for (int i_616_ = 0; i_616_ < ((Class89_Sub2) this).anInt9424;
		 i_616_++)
		((Class89_Sub2) this).aByteArray9408[i_616_] = i;
	} else {
	    for (int i_617_ = 0; i_617_ < ((Class89_Sub2) this).anInt9424;
		 i_617_++) {
		int i_618_ = 255 - ((255 - (is[i_617_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		((Class89_Sub2) this).aByteArray9408[i_617_] = (byte) i_618_;
	    }
	}
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
    }
    
    public void method1985(short i, short i_619_) {
	Class107 class107
	    = ((Class89_Sub2) this).aClass103_Sub1_9457.aClass107_1458;
	for (int i_620_ = 0; i_620_ < ((Class89_Sub2) this).anInt9424;
	     i_620_++) {
	    if (((Class89_Sub2) this).aShortArray9414[i_620_] == i)
		((Class89_Sub2) this).aShortArray9414[i_620_] = i_619_;
	}
	byte i_621_ = 0;
	byte i_622_ = 0;
	if (i != -1) {
	    Class101 class101 = class107.method2680(i & 0xffff, 1891509025);
	    i_621_ = class101.aByte1430;
	    i_622_ = class101.aByte1433;
	}
	byte i_623_ = 0;
	byte i_624_ = 0;
	if (i_619_ != -1) {
	    Class101 class101
		= class107.method2680(i_619_ & 0xffff, -166159470);
	    i_623_ = class101.aByte1430;
	    i_624_ = class101.aByte1433;
	    if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
		((Class89_Sub2) this).aBool9425 = true;
	}
	if (i_621_ != i_623_ | i_622_ != i_624_) {
	    if (((Class89_Sub2) this).aClass171Array9459 != null) {
		for (int i_625_ = 0; i_625_ < ((Class89_Sub2) this).anInt9427;
		     i_625_++) {
		    Class171 class171
			= ((Class89_Sub2) this).aClass171Array9459[i_625_];
		    Class140 class140
			= ((Class89_Sub2) this).aClass140Array9460[i_625_];
		    ((Class140) class140).anInt1630
			= (((Class140) class140).anInt1630 & ~0xffffff
			   | ((Class474.anIntArray6383
			       [(((Class89_Sub2) this).aShortArray9442
				 [((Class171) class171).anInt2069]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (((Class89_Sub2) this).aClass151_9433 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9433)
		    .anInterface8_1713
		    = null;
	}
    }
    
    public void method1911(int i, int i_626_, int i_627_, int i_628_) {
	for (int i_629_ = 0; i_629_ < ((Class89_Sub2) this).anInt9424;
	     i_629_++) {
	    int i_630_
		= ((Class89_Sub2) this).aShortArray9442[i_629_] & 0xffff;
	    int i_631_ = i_630_ >> 10 & 0x3f;
	    int i_632_ = i_630_ >> 7 & 0x7;
	    int i_633_ = i_630_ & 0x7f;
	    if (i != -1)
		i_631_ += (i - i_631_) * i_628_ >> 7;
	    if (i_626_ != -1)
		i_632_ += (i_626_ - i_632_) * i_628_ >> 7;
	    if (i_627_ != -1)
		i_633_ += (i_627_ - i_633_) * i_628_ >> 7;
	    ((Class89_Sub2) this).aShortArray9442[i_629_]
		= (short) (i_631_ << 10 | i_632_ << 7 | i_633_);
	}
	if (((Class89_Sub2) this).aClass171Array9459 != null) {
	    for (int i_634_ = 0; i_634_ < ((Class89_Sub2) this).anInt9427;
		 i_634_++) {
		Class171 class171
		    = ((Class89_Sub2) this).aClass171Array9459[i_634_];
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i_634_];
		((Class140) class140).anInt1630
		    = (((Class140) class140).anInt1630 & ~0xffffff
		       | ((Class474.anIntArray6383
			   [(((Class89_Sub2) this).aShortArray9442
			     [((Class171) class171).anInt2069]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
    }
    
    public boolean method1912() {
	if (((Class89_Sub2) this).aShortArray9414 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub2) this).aShortArray9414.length;
	     i++) {
	    if (((Class89_Sub2) this).aShortArray9414[i] != -1) {
		Class101 class101
		    = (((Class89_Sub2) this).aClass103_Sub1_9457
			   .aClass107_1458.method2680
		       (((Class89_Sub2) this).aShortArray9414[i] & 0xffff,
			572762373));
		if (class101.anInt1403 * 218388063 != -1
		    && !((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457)
			    .aClass173_9080.method3719(class101, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method2052() {
	return ((Class89_Sub2) this).aBool9452;
    }
    
    public void method1956() {
	if (!((Class89_Sub2) this).aBool9451) {
	    if (!((Class89_Sub2) this).aBool9444)
		method15537();
	    ((Class89_Sub2) this).aShort9435
		= ((Class89_Sub2) this).aShort9403;
	    ((Class89_Sub2) this).aBool9451 = true;
	}
    }
    
    void method1877() {
	/* empty */
    }
    
    public int method1894() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).anInt9443;
    }
    
    public void method1944(short i, short i_635_) {
	Class107 class107
	    = ((Class89_Sub2) this).aClass103_Sub1_9457.aClass107_1458;
	for (int i_636_ = 0; i_636_ < ((Class89_Sub2) this).anInt9424;
	     i_636_++) {
	    if (((Class89_Sub2) this).aShortArray9414[i_636_] == i)
		((Class89_Sub2) this).aShortArray9414[i_636_] = i_635_;
	}
	byte i_637_ = 0;
	byte i_638_ = 0;
	if (i != -1) {
	    Class101 class101 = class107.method2680(i & 0xffff, -1538126301);
	    i_637_ = class101.aByte1430;
	    i_638_ = class101.aByte1433;
	}
	byte i_639_ = 0;
	byte i_640_ = 0;
	if (i_635_ != -1) {
	    Class101 class101
		= class107.method2680(i_635_ & 0xffff, 624913856);
	    i_639_ = class101.aByte1430;
	    i_640_ = class101.aByte1433;
	    if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
		((Class89_Sub2) this).aBool9425 = true;
	}
	if (i_637_ != i_639_ | i_638_ != i_640_) {
	    if (((Class89_Sub2) this).aClass171Array9459 != null) {
		for (int i_641_ = 0; i_641_ < ((Class89_Sub2) this).anInt9427;
		     i_641_++) {
		    Class171 class171
			= ((Class89_Sub2) this).aClass171Array9459[i_641_];
		    Class140 class140
			= ((Class89_Sub2) this).aClass140Array9460[i_641_];
		    ((Class140) class140).anInt1630
			= (((Class140) class140).anInt1630 & ~0xffffff
			   | ((Class474.anIntArray6383
			       [(((Class89_Sub2) this).aShortArray9442
				 [((Class171) class171).anInt2069]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (((Class89_Sub2) this).aClass151_9433 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9433)
		    .anInterface8_1713
		    = null;
	}
    }
    
    void method1872(int i, int[] is, int i_642_, int i_643_, int i_644_,
		    boolean bool, int i_645_, int[] is_646_) {
	int i_647_ = is.length;
	if (i == 0) {
	    i_642_ <<= 4;
	    i_643_ <<= 4;
	    i_644_ <<= 4;
	    int i_648_ = 0;
	    anInt9426 = 0;
	    anInt9468 = 0;
	    anInt9401 = 0;
	    for (int i_649_ = 0; i_649_ < i_647_; i_649_++) {
		int i_650_ = is[i_649_];
		if (i_650_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_651_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_650_];
		    for (int i_652_ = 0; i_652_ < is_651_.length; i_652_++) {
			int i_653_ = is_651_[i_652_];
			if (((Class89_Sub2) this).aShortArray9465 == null
			    || (i_645_ & (((Class89_Sub2) this).aShortArray9465
					  [i_653_])) != 0) {
			    anInt9426 += (((Class89_Sub2) this).anIntArray9411
					  [i_653_]);
			    anInt9468 += (((Class89_Sub2) this).anIntArray9412
					  [i_653_]);
			    anInt9401 += (((Class89_Sub2) this).anIntArray9413
					  [i_653_]);
			    i_648_++;
			}
		    }
		}
	    }
	    if (i_648_ > 0) {
		anInt9426 = anInt9426 / i_648_ + i_642_;
		anInt9468 = anInt9468 / i_648_ + i_643_;
		anInt9401 = anInt9401 / i_648_ + i_644_;
		aBool9470 = true;
	    } else {
		anInt9426 = i_642_;
		anInt9468 = i_643_;
		anInt9401 = i_644_;
	    }
	} else if (i == 1) {
	    if (is_646_ != null) {
		int i_654_ = ((is_646_[0] * i_642_ + is_646_[1] * i_643_
			       + is_646_[2] * i_644_ + 8192)
			      >> 14);
		int i_655_ = ((is_646_[3] * i_642_ + is_646_[4] * i_643_
			       + is_646_[5] * i_644_ + 8192)
			      >> 14);
		int i_656_ = ((is_646_[6] * i_642_ + is_646_[7] * i_643_
			       + is_646_[8] * i_644_ + 8192)
			      >> 14);
		i_642_ = i_654_;
		i_643_ = i_655_;
		i_644_ = i_656_;
	    }
	    i_642_ <<= 4;
	    i_643_ <<= 4;
	    i_644_ <<= 4;
	    for (int i_657_ = 0; i_657_ < i_647_; i_657_++) {
		int i_658_ = is[i_657_];
		if (i_658_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_659_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_658_];
		    for (int i_660_ = 0; i_660_ < is_659_.length; i_660_++) {
			int i_661_ = is_659_[i_660_];
			if (((Class89_Sub2) this).aShortArray9465 == null
			    || (i_645_ & (((Class89_Sub2) this).aShortArray9465
					  [i_661_])) != 0) {
			    ((Class89_Sub2) this).anIntArray9411[i_661_]
				+= i_642_;
			    ((Class89_Sub2) this).anIntArray9412[i_661_]
				+= i_643_;
			    ((Class89_Sub2) this).anIntArray9413[i_661_]
				+= i_644_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_646_ != null) {
		int i_662_ = is_646_[9] << 4;
		int i_663_ = is_646_[10] << 4;
		int i_664_ = is_646_[11] << 4;
		int i_665_ = is_646_[12] << 4;
		int i_666_ = is_646_[13] << 4;
		int i_667_ = is_646_[14] << 4;
		if (aBool9470) {
		    int i_668_
			= ((is_646_[0] * anInt9426 + is_646_[3] * anInt9468
			    + is_646_[6] * anInt9401 + 8192)
			   >> 14);
		    int i_669_
			= ((is_646_[1] * anInt9426 + is_646_[4] * anInt9468
			    + is_646_[7] * anInt9401 + 8192)
			   >> 14);
		    int i_670_
			= ((is_646_[2] * anInt9426 + is_646_[5] * anInt9468
			    + is_646_[8] * anInt9401 + 8192)
			   >> 14);
		    i_668_ += i_665_;
		    i_669_ += i_666_;
		    i_670_ += i_667_;
		    anInt9426 = i_668_;
		    anInt9468 = i_669_;
		    anInt9401 = i_670_;
		    aBool9470 = false;
		}
		int[] is_671_ = new int[9];
		int i_672_ = Class282.anIntArray4441[i_642_];
		int i_673_ = Class282.anIntArray4430[i_642_];
		int i_674_ = Class282.anIntArray4441[i_643_];
		int i_675_ = Class282.anIntArray4430[i_643_];
		int i_676_ = Class282.anIntArray4441[i_644_];
		int i_677_ = Class282.anIntArray4430[i_644_];
		int i_678_ = i_673_ * i_676_ + 8192 >> 14;
		int i_679_ = i_673_ * i_677_ + 8192 >> 14;
		is_671_[0] = i_674_ * i_676_ + i_675_ * i_679_ + 8192 >> 14;
		is_671_[1] = -i_674_ * i_677_ + i_675_ * i_678_ + 8192 >> 14;
		is_671_[2] = i_675_ * i_672_ + 8192 >> 14;
		is_671_[3] = i_672_ * i_677_ + 8192 >> 14;
		is_671_[4] = i_672_ * i_676_ + 8192 >> 14;
		is_671_[5] = -i_673_;
		is_671_[6] = -i_675_ * i_676_ + i_674_ * i_679_ + 8192 >> 14;
		is_671_[7] = i_675_ * i_677_ + i_674_ * i_678_ + 8192 >> 14;
		is_671_[8] = i_674_ * i_672_ + 8192 >> 14;
		int i_680_ = (is_671_[0] * -anInt9426 + is_671_[1] * -anInt9468
			      + is_671_[2] * -anInt9401 + 8192) >> 14;
		int i_681_ = (is_671_[3] * -anInt9426 + is_671_[4] * -anInt9468
			      + is_671_[5] * -anInt9401 + 8192) >> 14;
		int i_682_ = (is_671_[6] * -anInt9426 + is_671_[7] * -anInt9468
			      + is_671_[8] * -anInt9401 + 8192) >> 14;
		int i_683_ = i_680_ + anInt9426;
		int i_684_ = i_681_ + anInt9468;
		int i_685_ = i_682_ + anInt9401;
		int[] is_686_ = new int[9];
		for (int i_687_ = 0; i_687_ < 3; i_687_++) {
		    for (int i_688_ = 0; i_688_ < 3; i_688_++) {
			int i_689_ = 0;
			for (int i_690_ = 0; i_690_ < 3; i_690_++)
			    i_689_ += (is_671_[i_687_ * 3 + i_690_]
				       * is_646_[i_688_ * 3 + i_690_]);
			is_686_[i_687_ * 3 + i_688_] = i_689_ + 8192 >> 14;
		    }
		}
		int i_691_ = ((is_671_[0] * i_665_ + is_671_[1] * i_666_
			       + is_671_[2] * i_667_ + 8192)
			      >> 14);
		int i_692_ = ((is_671_[3] * i_665_ + is_671_[4] * i_666_
			       + is_671_[5] * i_667_ + 8192)
			      >> 14);
		int i_693_ = ((is_671_[6] * i_665_ + is_671_[7] * i_666_
			       + is_671_[8] * i_667_ + 8192)
			      >> 14);
		i_691_ += i_683_;
		i_692_ += i_684_;
		i_693_ += i_685_;
		int[] is_694_ = new int[9];
		for (int i_695_ = 0; i_695_ < 3; i_695_++) {
		    for (int i_696_ = 0; i_696_ < 3; i_696_++) {
			int i_697_ = 0;
			for (int i_698_ = 0; i_698_ < 3; i_698_++)
			    i_697_ += (is_646_[i_695_ * 3 + i_698_]
				       * is_686_[i_696_ + i_698_ * 3]);
			is_694_[i_695_ * 3 + i_696_] = i_697_ + 8192 >> 14;
		    }
		}
		int i_699_ = ((is_646_[0] * i_691_ + is_646_[1] * i_692_
			       + is_646_[2] * i_693_ + 8192)
			      >> 14);
		int i_700_ = ((is_646_[3] * i_691_ + is_646_[4] * i_692_
			       + is_646_[5] * i_693_ + 8192)
			      >> 14);
		int i_701_ = ((is_646_[6] * i_691_ + is_646_[7] * i_692_
			       + is_646_[8] * i_693_ + 8192)
			      >> 14);
		i_699_ += i_662_;
		i_700_ += i_663_;
		i_701_ += i_664_;
		for (int i_702_ = 0; i_702_ < i_647_; i_702_++) {
		    int i_703_ = is[i_702_];
		    if (i_703_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_704_ = (((Class89_Sub2) this)
					 .anIntArrayArray9467[i_703_]);
			for (int i_705_ = 0; i_705_ < is_704_.length;
			     i_705_++) {
			    int i_706_ = is_704_[i_705_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_645_ & (((Class89_Sub2) this)
					       .aShortArray9465[i_706_]))
				    != 0)) {
				int i_707_
				    = (is_694_[0] * (((Class89_Sub2) this)
						     .anIntArray9411[i_706_])
				       + is_694_[1] * (((Class89_Sub2) this)
						       .anIntArray9412[i_706_])
				       + is_694_[2] * (((Class89_Sub2) this)
						       .anIntArray9413[i_706_])
				       + 8192) >> 14;
				int i_708_
				    = (is_694_[3] * (((Class89_Sub2) this)
						     .anIntArray9411[i_706_])
				       + is_694_[4] * (((Class89_Sub2) this)
						       .anIntArray9412[i_706_])
				       + is_694_[5] * (((Class89_Sub2) this)
						       .anIntArray9413[i_706_])
				       + 8192) >> 14;
				int i_709_
				    = (is_694_[6] * (((Class89_Sub2) this)
						     .anIntArray9411[i_706_])
				       + is_694_[7] * (((Class89_Sub2) this)
						       .anIntArray9412[i_706_])
				       + is_694_[8] * (((Class89_Sub2) this)
						       .anIntArray9413[i_706_])
				       + 8192) >> 14;
				i_707_ += i_699_;
				i_708_ += i_700_;
				i_709_ += i_701_;
				((Class89_Sub2) this).anIntArray9411[i_706_]
				    = i_707_;
				((Class89_Sub2) this).anIntArray9412[i_706_]
				    = i_708_;
				((Class89_Sub2) this).anIntArray9413[i_706_]
				    = i_709_;
			    }
			}
		    }
		}
	    } else {
		for (int i_710_ = 0; i_710_ < i_647_; i_710_++) {
		    int i_711_ = is[i_710_];
		    if (i_711_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_712_ = (((Class89_Sub2) this)
					 .anIntArrayArray9467[i_711_]);
			for (int i_713_ = 0; i_713_ < is_712_.length;
			     i_713_++) {
			    int i_714_ = is_712_[i_713_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_645_ & (((Class89_Sub2) this)
					       .aShortArray9465[i_714_]))
				    != 0)) {
				((Class89_Sub2) this).anIntArray9411[i_714_]
				    -= anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_714_]
				    -= anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_714_]
				    -= anInt9401;
				if (i_644_ != 0) {
				    int i_715_
					= Class282.anIntArray4430[i_644_];
				    int i_716_
					= Class282.anIntArray4441[i_644_];
				    int i_717_
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_714_]) * i_715_
					   + (((Class89_Sub2) this)
					      .anIntArray9411[i_714_]) * i_716_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9412
					[i_714_]
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_714_]) * i_716_
					   - (((Class89_Sub2) this)
					      .anIntArray9411[i_714_]) * i_715_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9411
					[i_714_]
					= i_717_;
				}
				if (i_642_ != 0) {
				    int i_718_
					= Class282.anIntArray4430[i_642_];
				    int i_719_
					= Class282.anIntArray4441[i_642_];
				    int i_720_
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_714_]) * i_719_
					   - (((Class89_Sub2) this)
					      .anIntArray9413[i_714_]) * i_718_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9413
					[i_714_]
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_714_]) * i_718_
					   + (((Class89_Sub2) this)
					      .anIntArray9413[i_714_]) * i_719_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9412
					[i_714_]
					= i_720_;
				}
				if (i_643_ != 0) {
				    int i_721_
					= Class282.anIntArray4430[i_643_];
				    int i_722_
					= Class282.anIntArray4441[i_643_];
				    int i_723_
					= ((((Class89_Sub2) this)
					    .anIntArray9413[i_714_]) * i_721_
					   + (((Class89_Sub2) this)
					      .anIntArray9411[i_714_]) * i_722_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9413
					[i_714_]
					= ((((Class89_Sub2) this)
					    .anIntArray9413[i_714_]) * i_722_
					   - (((Class89_Sub2) this)
					      .anIntArray9411[i_714_]) * i_721_
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9411
					[i_714_]
					= i_723_;
				}
				((Class89_Sub2) this).anIntArray9411[i_714_]
				    += anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_714_]
				    += anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_714_]
				    += anInt9401;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_724_ = 0; i_724_ < i_647_; i_724_++) {
			int i_725_ = is[i_724_];
			if (i_725_ < (((Class89_Sub2) this)
				      .anIntArrayArray9467).length) {
			    int[] is_726_ = (((Class89_Sub2) this)
					     .anIntArrayArray9467[i_725_]);
			    for (int i_727_ = 0; i_727_ < is_726_.length;
				 i_727_++) {
				int i_728_ = is_726_[i_727_];
				if ((((Class89_Sub2) this).aShortArray9465
				     == null)
				    || ((i_645_ & (((Class89_Sub2) this)
						   .aShortArray9465[i_728_]))
					!= 0)) {
				    int i_729_ = (((Class89_Sub2) this)
						  .anIntArray9395[i_728_]);
				    int i_730_ = (((Class89_Sub2) this)
						  .anIntArray9395[i_728_ + 1]);
				    for (int i_731_ = i_729_;
					 (i_731_ < i_730_
					  && (((Class89_Sub2) this)
					      .aShortArray9455[i_731_]) != 0);
					 i_731_++) {
					int i_732_
					    = (((((Class89_Sub2) this)
						 .aShortArray9455[i_731_])
						& 0xffff)
					       - 1);
					if (i_644_ != 0) {
					    int i_733_
						= (Class282.anIntArray4430
						   [i_644_]);
					    int i_734_
						= (Class282.anIntArray4441
						   [i_644_]);
					    int i_735_
						= ((((((Class89_Sub2) this)
						      .aShortArray9418[i_732_])
						     * i_733_)
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_732_]) * i_734_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9418[i_732_]
						= (short) (((((Class89_Sub2)
							      this)
							     .aShortArray9418
							     [i_732_]) * i_734_
							    - ((((Class89_Sub2)
								 this)
								.aShortArray9417
								[i_732_])
							       * i_733_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9417[i_732_]
						= (short) i_735_;
					}
					if (i_642_ != 0) {
					    int i_736_
						= (Class282.anIntArray4430
						   [i_642_]);
					    int i_737_
						= (Class282.anIntArray4441
						   [i_642_]);
					    int i_738_
						= ((((((Class89_Sub2) this)
						      .aShortArray9418[i_732_])
						     * i_737_)
						    - (((Class89_Sub2) this)
						       .aShortArray9419
						       [i_732_]) * i_736_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9419[i_732_]
						= (short) (((((Class89_Sub2)
							      this)
							     .aShortArray9418
							     [i_732_]) * i_736_
							    + ((((Class89_Sub2)
								 this)
								.aShortArray9419
								[i_732_])
							       * i_737_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9418[i_732_]
						= (short) i_738_;
					}
					if (i_643_ != 0) {
					    int i_739_
						= (Class282.anIntArray4430
						   [i_643_]);
					    int i_740_
						= (Class282.anIntArray4441
						   [i_643_]);
					    int i_741_
						= ((((((Class89_Sub2) this)
						      .aShortArray9419[i_732_])
						     * i_739_)
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_732_]) * i_740_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9419[i_732_]
						= (short) (((((Class89_Sub2)
							      this)
							     .aShortArray9419
							     [i_732_]) * i_740_
							    - ((((Class89_Sub2)
								 this)
								.aShortArray9417
								[i_732_])
							       * i_739_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9417[i_732_]
						= (short) i_741_;
					}
				    }
				}
			    }
			}
		    }
		    if (((Class89_Sub2) this).aClass151_9436 == null
			&& ((Class89_Sub2) this).aClass151_9433 != null)
			((Class151) ((Class89_Sub2) this).aClass151_9433)
			    .anInterface8_1713
			    = null;
		    if (((Class89_Sub2) this).aClass151_9436 != null)
			((Class151) ((Class89_Sub2) this).aClass151_9436)
			    .anInterface8_1713
			    = null;
		}
	    }
	} else if (i == 3) {
	    if (is_646_ != null) {
		int i_742_ = is_646_[9] << 4;
		int i_743_ = is_646_[10] << 4;
		int i_744_ = is_646_[11] << 4;
		int i_745_ = is_646_[12] << 4;
		int i_746_ = is_646_[13] << 4;
		int i_747_ = is_646_[14] << 4;
		if (aBool9470) {
		    int i_748_
			= ((is_646_[0] * anInt9426 + is_646_[3] * anInt9468
			    + is_646_[6] * anInt9401 + 8192)
			   >> 14);
		    int i_749_
			= ((is_646_[1] * anInt9426 + is_646_[4] * anInt9468
			    + is_646_[7] * anInt9401 + 8192)
			   >> 14);
		    int i_750_
			= ((is_646_[2] * anInt9426 + is_646_[5] * anInt9468
			    + is_646_[8] * anInt9401 + 8192)
			   >> 14);
		    i_748_ += i_745_;
		    i_749_ += i_746_;
		    i_750_ += i_747_;
		    anInt9426 = i_748_;
		    anInt9468 = i_749_;
		    anInt9401 = i_750_;
		    aBool9470 = false;
		}
		int i_751_ = i_642_ << 15 >> 7;
		int i_752_ = i_643_ << 15 >> 7;
		int i_753_ = i_644_ << 15 >> 7;
		int i_754_ = i_751_ * -anInt9426 + 8192 >> 14;
		int i_755_ = i_752_ * -anInt9468 + 8192 >> 14;
		int i_756_ = i_753_ * -anInt9401 + 8192 >> 14;
		int i_757_ = i_754_ + anInt9426;
		int i_758_ = i_755_ + anInt9468;
		int i_759_ = i_756_ + anInt9401;
		int[] is_760_ = new int[9];
		is_760_[0] = i_751_ * is_646_[0] + 8192 >> 14;
		is_760_[1] = i_751_ * is_646_[3] + 8192 >> 14;
		is_760_[2] = i_751_ * is_646_[6] + 8192 >> 14;
		is_760_[3] = i_752_ * is_646_[1] + 8192 >> 14;
		is_760_[4] = i_752_ * is_646_[4] + 8192 >> 14;
		is_760_[5] = i_752_ * is_646_[7] + 8192 >> 14;
		is_760_[6] = i_753_ * is_646_[2] + 8192 >> 14;
		is_760_[7] = i_753_ * is_646_[5] + 8192 >> 14;
		is_760_[8] = i_753_ * is_646_[8] + 8192 >> 14;
		int i_761_ = i_751_ * i_745_ + 8192 >> 14;
		int i_762_ = i_752_ * i_746_ + 8192 >> 14;
		int i_763_ = i_753_ * i_747_ + 8192 >> 14;
		i_761_ += i_757_;
		i_762_ += i_758_;
		i_763_ += i_759_;
		int[] is_764_ = new int[9];
		for (int i_765_ = 0; i_765_ < 3; i_765_++) {
		    for (int i_766_ = 0; i_766_ < 3; i_766_++) {
			int i_767_ = 0;
			for (int i_768_ = 0; i_768_ < 3; i_768_++)
			    i_767_ += (is_646_[i_765_ * 3 + i_768_]
				       * is_760_[i_766_ + i_768_ * 3]);
			is_764_[i_765_ * 3 + i_766_] = i_767_ + 8192 >> 14;
		    }
		}
		int i_769_ = ((is_646_[0] * i_761_ + is_646_[1] * i_762_
			       + is_646_[2] * i_763_ + 8192)
			      >> 14);
		int i_770_ = ((is_646_[3] * i_761_ + is_646_[4] * i_762_
			       + is_646_[5] * i_763_ + 8192)
			      >> 14);
		int i_771_ = ((is_646_[6] * i_761_ + is_646_[7] * i_762_
			       + is_646_[8] * i_763_ + 8192)
			      >> 14);
		i_769_ += i_742_;
		i_770_ += i_743_;
		i_771_ += i_744_;
		for (int i_772_ = 0; i_772_ < i_647_; i_772_++) {
		    int i_773_ = is[i_772_];
		    if (i_773_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_774_ = (((Class89_Sub2) this)
					 .anIntArrayArray9467[i_773_]);
			for (int i_775_ = 0; i_775_ < is_774_.length;
			     i_775_++) {
			    int i_776_ = is_774_[i_775_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_645_ & (((Class89_Sub2) this)
					       .aShortArray9465[i_776_]))
				    != 0)) {
				int i_777_
				    = (is_764_[0] * (((Class89_Sub2) this)
						     .anIntArray9411[i_776_])
				       + is_764_[1] * (((Class89_Sub2) this)
						       .anIntArray9412[i_776_])
				       + is_764_[2] * (((Class89_Sub2) this)
						       .anIntArray9413[i_776_])
				       + 8192) >> 14;
				int i_778_
				    = (is_764_[3] * (((Class89_Sub2) this)
						     .anIntArray9411[i_776_])
				       + is_764_[4] * (((Class89_Sub2) this)
						       .anIntArray9412[i_776_])
				       + is_764_[5] * (((Class89_Sub2) this)
						       .anIntArray9413[i_776_])
				       + 8192) >> 14;
				int i_779_
				    = (is_764_[6] * (((Class89_Sub2) this)
						     .anIntArray9411[i_776_])
				       + is_764_[7] * (((Class89_Sub2) this)
						       .anIntArray9412[i_776_])
				       + is_764_[8] * (((Class89_Sub2) this)
						       .anIntArray9413[i_776_])
				       + 8192) >> 14;
				i_777_ += i_769_;
				i_778_ += i_770_;
				i_779_ += i_771_;
				((Class89_Sub2) this).anIntArray9411[i_776_]
				    = i_777_;
				((Class89_Sub2) this).anIntArray9412[i_776_]
				    = i_778_;
				((Class89_Sub2) this).anIntArray9413[i_776_]
				    = i_779_;
			    }
			}
		    }
		}
	    } else {
		for (int i_780_ = 0; i_780_ < i_647_; i_780_++) {
		    int i_781_ = is[i_780_];
		    if (i_781_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_782_ = (((Class89_Sub2) this)
					 .anIntArrayArray9467[i_781_]);
			for (int i_783_ = 0; i_783_ < is_782_.length;
			     i_783_++) {
			    int i_784_ = is_782_[i_783_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_645_ & (((Class89_Sub2) this)
					       .aShortArray9465[i_784_]))
				    != 0)) {
				((Class89_Sub2) this).anIntArray9411[i_784_]
				    -= anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_784_]
				    -= anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_784_]
				    -= anInt9401;
				((Class89_Sub2) this).anIntArray9411[i_784_]
				    = (((Class89_Sub2) this).anIntArray9411
				       [i_784_]) * i_642_ >> 7;
				((Class89_Sub2) this).anIntArray9412[i_784_]
				    = (((Class89_Sub2) this).anIntArray9412
				       [i_784_]) * i_643_ >> 7;
				((Class89_Sub2) this).anIntArray9413[i_784_]
				    = (((Class89_Sub2) this).anIntArray9413
				       [i_784_]) * i_644_ >> 7;
				((Class89_Sub2) this).anIntArray9411[i_784_]
				    += anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_784_]
				    += anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_784_]
				    += anInt9401;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_785_ = 0; i_785_ < i_647_; i_785_++) {
		    int i_786_ = is[i_785_];
		    if (i_786_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_787_ = (((Class89_Sub2) this)
					 .anIntArrayArray9432[i_786_]);
			for (int i_788_ = 0; i_788_ < is_787_.length;
			     i_788_++) {
			    int i_789_ = is_787_[i_788_];
			    if (((Class89_Sub2) this).aShortArray9415 == null
				|| ((i_645_ & (((Class89_Sub2) this)
					       .aShortArray9415[i_789_]))
				    != 0)) {
				int i_790_ = (((((Class89_Sub2) this)
						.aByteArray9408[i_789_])
					       & 0xff)
					      + i_642_ * 8);
				if (i_790_ < 0)
				    i_790_ = 0;
				else if (i_790_ > 255)
				    i_790_ = 255;
				((Class89_Sub2) this).aByteArray9408[i_789_]
				    = (byte) i_790_;
				if (((Class89_Sub2) this).aClass151_9433
				    != null)
				    ((Class151)
				     ((Class89_Sub2) this).aClass151_9433)
					.anInterface8_1713
					= null;
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_791_ = 0;
			 i_791_ < ((Class89_Sub2) this).anInt9427; i_791_++) {
			Class171 class171
			    = ((Class89_Sub2) this).aClass171Array9459[i_791_];
			Class140 class140
			    = ((Class89_Sub2) this).aClass140Array9460[i_791_];
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & 0xffffff
			       | 255 - ((((Class89_Sub2) this).aByteArray9408
					 [((Class171) class171).anInt2069])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_792_ = 0; i_792_ < i_647_; i_792_++) {
		    int i_793_ = is[i_792_];
		    if (i_793_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_794_ = (((Class89_Sub2) this)
					 .anIntArrayArray9432[i_793_]);
			for (int i_795_ = 0; i_795_ < is_794_.length;
			     i_795_++) {
			    int i_796_ = is_794_[i_795_];
			    if (((Class89_Sub2) this).aShortArray9415 == null
				|| ((i_645_ & (((Class89_Sub2) this)
					       .aShortArray9415[i_796_]))
				    != 0)) {
				int i_797_ = ((((Class89_Sub2) this)
					       .aShortArray9442[i_796_])
					      & 0xffff);
				int i_798_ = i_797_ >> 10 & 0x3f;
				int i_799_ = i_797_ >> 7 & 0x7;
				int i_800_ = i_797_ & 0x7f;
				i_798_ = i_798_ + i_642_ & 0x3f;
				i_799_ += i_643_ / 4;
				if (i_799_ < 0)
				    i_799_ = 0;
				else if (i_799_ > 7)
				    i_799_ = 7;
				i_800_ += i_644_;
				if (i_800_ < 0)
				    i_800_ = 0;
				else if (i_800_ > 127)
				    i_800_ = 127;
				((Class89_Sub2) this).aShortArray9442[i_796_]
				    = (short) (i_798_ << 10 | i_799_ << 7
					       | i_800_);
				if (((Class89_Sub2) this).aClass151_9433
				    != null)
				    ((Class151)
				     ((Class89_Sub2) this).aClass151_9433)
					.anInterface8_1713
					= null;
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_801_ = 0;
			 i_801_ < ((Class89_Sub2) this).anInt9427; i_801_++) {
			Class171 class171
			    = ((Class89_Sub2) this).aClass171Array9459[i_801_];
			Class140 class140
			    = ((Class89_Sub2) this).aClass140Array9460[i_801_];
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & ~0xffffff
			       | (Class474.anIntArray6383
				  [((((Class89_Sub2) this).aShortArray9442
				     [((Class171) class171).anInt2069])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_802_ = 0; i_802_ < i_647_; i_802_++) {
		    int i_803_ = is[i_802_];
		    if (i_803_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_804_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_803_]);
			for (int i_805_ = 0; i_805_ < is_804_.length;
			     i_805_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_804_[i_805_]]);
			    ((Class140) class140).anInt1628 += i_642_;
			    ((Class140) class140).anInt1629 += i_643_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_806_ = 0; i_806_ < i_647_; i_806_++) {
		    int i_807_ = is[i_806_];
		    if (i_807_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_808_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_807_]);
			for (int i_809_ = 0; i_809_ < is_808_.length;
			     i_809_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_808_[i_809_]]);
			    ((Class140) class140).anInt1626
				= (((Class140) class140).anInt1626 * i_642_
				   >> 7);
			    ((Class140) class140).anInt1627
				= (((Class140) class140).anInt1627 * i_643_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_810_ = 0; i_810_ < i_647_; i_810_++) {
		    int i_811_ = is[i_810_];
		    if (i_811_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_812_ = (((Class89_Sub2) this)
					 .anIntArrayArray9461[i_811_]);
			for (int i_813_ = 0; i_813_ < is_812_.length;
			     i_813_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_812_[i_813_]]);
			    ((Class140) class140).anInt1625
				= (((Class140) class140).anInt1625 + i_642_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method1887(int i, int i_814_, int i_815_, int i_816_) {
	if (i == 0) {
	    int i_817_ = 0;
	    anInt9426 = 0;
	    anInt9468 = 0;
	    anInt9401 = 0;
	    for (int i_818_ = 0; i_818_ < ((Class89_Sub2) this).anInt9410;
		 i_818_++) {
		anInt9426 += ((Class89_Sub2) this).anIntArray9411[i_818_];
		anInt9468 += ((Class89_Sub2) this).anIntArray9412[i_818_];
		anInt9401 += ((Class89_Sub2) this).anIntArray9413[i_818_];
		i_817_++;
	    }
	    if (i_817_ > 0) {
		anInt9426 = anInt9426 / i_817_ + i_814_;
		anInt9468 = anInt9468 / i_817_ + i_815_;
		anInt9401 = anInt9401 / i_817_ + i_816_;
	    } else {
		anInt9426 = i_814_;
		anInt9468 = i_815_;
		anInt9401 = i_816_;
	    }
	} else if (i == 1) {
	    for (int i_819_ = 0; i_819_ < ((Class89_Sub2) this).anInt9410;
		 i_819_++) {
		((Class89_Sub2) this).anIntArray9411[i_819_] += i_814_;
		((Class89_Sub2) this).anIntArray9412[i_819_] += i_815_;
		((Class89_Sub2) this).anIntArray9413[i_819_] += i_816_;
	    }
	} else if (i == 2) {
	    for (int i_820_ = 0; i_820_ < ((Class89_Sub2) this).anInt9410;
		 i_820_++) {
		((Class89_Sub2) this).anIntArray9411[i_820_] -= anInt9426;
		((Class89_Sub2) this).anIntArray9412[i_820_] -= anInt9468;
		((Class89_Sub2) this).anIntArray9413[i_820_] -= anInt9401;
		if (i_816_ != 0) {
		    int i_821_ = Class282.anIntArray4430[i_816_];
		    int i_822_ = Class282.anIntArray4441[i_816_];
		    int i_823_
			= (((((Class89_Sub2) this).anIntArray9412[i_820_]
			     * i_821_)
			    + (((Class89_Sub2) this).anIntArray9411[i_820_]
			       * i_822_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub2) this).anIntArray9412[i_820_]
			= ((((Class89_Sub2) this).anIntArray9412[i_820_]
			    * i_822_)
			   - (((Class89_Sub2) this).anIntArray9411[i_820_]
			      * i_821_)
			   + 16383) >> 14;
		    ((Class89_Sub2) this).anIntArray9411[i_820_] = i_823_;
		}
		if (i_814_ != 0) {
		    int i_824_ = Class282.anIntArray4430[i_814_];
		    int i_825_ = Class282.anIntArray4441[i_814_];
		    int i_826_
			= (((((Class89_Sub2) this).anIntArray9412[i_820_]
			     * i_825_)
			    - (((Class89_Sub2) this).anIntArray9413[i_820_]
			       * i_824_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub2) this).anIntArray9413[i_820_]
			= ((((Class89_Sub2) this).anIntArray9412[i_820_]
			    * i_824_)
			   + (((Class89_Sub2) this).anIntArray9413[i_820_]
			      * i_825_)
			   + 16383) >> 14;
		    ((Class89_Sub2) this).anIntArray9412[i_820_] = i_826_;
		}
		if (i_815_ != 0) {
		    int i_827_ = Class282.anIntArray4430[i_815_];
		    int i_828_ = Class282.anIntArray4441[i_815_];
		    int i_829_
			= (((((Class89_Sub2) this).anIntArray9413[i_820_]
			     * i_827_)
			    + (((Class89_Sub2) this).anIntArray9411[i_820_]
			       * i_828_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub2) this).anIntArray9413[i_820_]
			= ((((Class89_Sub2) this).anIntArray9413[i_820_]
			    * i_828_)
			   - (((Class89_Sub2) this).anIntArray9411[i_820_]
			      * i_827_)
			   + 16383) >> 14;
		    ((Class89_Sub2) this).anIntArray9411[i_820_] = i_829_;
		}
		((Class89_Sub2) this).anIntArray9411[i_820_] += anInt9426;
		((Class89_Sub2) this).anIntArray9412[i_820_] += anInt9468;
		((Class89_Sub2) this).anIntArray9413[i_820_] += anInt9401;
	    }
	} else if (i == 3) {
	    for (int i_830_ = 0; i_830_ < ((Class89_Sub2) this).anInt9410;
		 i_830_++) {
		((Class89_Sub2) this).anIntArray9411[i_830_] -= anInt9426;
		((Class89_Sub2) this).anIntArray9412[i_830_] -= anInt9468;
		((Class89_Sub2) this).anIntArray9413[i_830_] -= anInt9401;
		((Class89_Sub2) this).anIntArray9411[i_830_]
		    = (((Class89_Sub2) this).anIntArray9411[i_830_] * i_814_
		       / 128);
		((Class89_Sub2) this).anIntArray9412[i_830_]
		    = (((Class89_Sub2) this).anIntArray9412[i_830_] * i_815_
		       / 128);
		((Class89_Sub2) this).anIntArray9413[i_830_]
		    = (((Class89_Sub2) this).anIntArray9413[i_830_] * i_816_
		       / 128);
		((Class89_Sub2) this).anIntArray9411[i_830_] += anInt9426;
		((Class89_Sub2) this).anIntArray9412[i_830_] += anInt9468;
		((Class89_Sub2) this).anIntArray9413[i_830_] += anInt9401;
	    }
	} else if (i == 5) {
	    for (int i_831_ = 0; i_831_ < ((Class89_Sub2) this).anInt9424;
		 i_831_++) {
		int i_832_
		    = ((((Class89_Sub2) this).aByteArray9408[i_831_] & 0xff)
		       + i_814_ * 8);
		if (i_832_ < 0)
		    i_832_ = 0;
		else if (i_832_ > 255)
		    i_832_ = 255;
		((Class89_Sub2) this).aByteArray9408[i_831_] = (byte) i_832_;
	    }
	    if (((Class89_Sub2) this).aClass151_9433 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9433)
		    .anInterface8_1713
		    = null;
	    if (((Class89_Sub2) this).aClass171Array9459 != null) {
		for (int i_833_ = 0; i_833_ < ((Class89_Sub2) this).anInt9427;
		     i_833_++) {
		    Class171 class171
			= ((Class89_Sub2) this).aClass171Array9459[i_833_];
		    Class140 class140
			= ((Class89_Sub2) this).aClass140Array9460[i_833_];
		    ((Class140) class140).anInt1630
			= (((Class140) class140).anInt1630 & 0xffffff
			   | 255 - ((((Class89_Sub2) this).aByteArray9408
				     [((Class171) class171).anInt2069])
				    & 0xff) << 24);
		}
	    }
	} else if (i == 7) {
	    for (int i_834_ = 0; i_834_ < ((Class89_Sub2) this).anInt9424;
		 i_834_++) {
		int i_835_
		    = ((Class89_Sub2) this).aShortArray9442[i_834_] & 0xffff;
		int i_836_ = i_835_ >> 10 & 0x3f;
		int i_837_ = i_835_ >> 7 & 0x7;
		int i_838_ = i_835_ & 0x7f;
		i_836_ = i_836_ + i_814_ & 0x3f;
		i_837_ += i_815_ / 4;
		if (i_837_ < 0)
		    i_837_ = 0;
		else if (i_837_ > 7)
		    i_837_ = 7;
		i_838_ += i_816_;
		if (i_838_ < 0)
		    i_838_ = 0;
		else if (i_838_ > 127)
		    i_838_ = 127;
		((Class89_Sub2) this).aShortArray9442[i_834_]
		    = (short) (i_836_ << 10 | i_837_ << 7 | i_838_);
	    }
	    if (((Class89_Sub2) this).aClass151_9433 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9433)
		    .anInterface8_1713
		    = null;
	    if (((Class89_Sub2) this).aClass171Array9459 != null) {
		for (int i_839_ = 0; i_839_ < ((Class89_Sub2) this).anInt9427;
		     i_839_++) {
		    Class171 class171
			= ((Class89_Sub2) this).aClass171Array9459[i_839_];
		    Class140 class140
			= ((Class89_Sub2) this).aClass140Array9460[i_839_];
		    ((Class140) class140).anInt1630
			= (((Class140) class140).anInt1630 & ~0xffffff
			   | ((Class474.anIntArray6383
			       [(((Class89_Sub2) this).aShortArray9442
				 [((Class171) class171).anInt2069]) & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_840_ = 0; i_840_ < ((Class89_Sub2) this).anInt9427;
		 i_840_++) {
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i_840_];
		((Class140) class140).anInt1628 += i_814_;
		((Class140) class140).anInt1629 += i_815_;
	    }
	} else if (i == 10) {
	    for (int i_841_ = 0; i_841_ < ((Class89_Sub2) this).anInt9427;
		 i_841_++) {
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i_841_];
		((Class140) class140).anInt1626
		    = ((Class140) class140).anInt1626 * i_814_ >> 7;
		((Class140) class140).anInt1627
		    = ((Class140) class140).anInt1627 * i_815_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_842_ = 0; i_842_ < ((Class89_Sub2) this).anInt9427;
		 i_842_++) {
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i_842_];
		((Class140) class140).anInt1625
		    = ((Class140) class140).anInt1625 + i_814_ & 0x3fff;
	    }
	}
    }
    
    public void method1875(int i, int i_843_, Class166 class166,
			   Class166 class166_844_, int i_845_, int i_846_,
			   int i_847_) {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i_848_ = i_845_ + ((Class89_Sub2) this).aShort9447;
	int i_849_ = i_845_ + ((Class89_Sub2) this).aShort9448;
	int i_850_ = i_847_ + ((Class89_Sub2) this).aShort9449;
	int i_851_ = i_847_ + ((Class89_Sub2) this).aShort9450;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_848_ >= 0
		&& ((i_849_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2055 * 266270313)
		&& i_850_ >= 0
		&& ((i_851_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2052 * -14610189))) {
	    if (i == 4 || i == 5) {
		if (class166_844_ == null
		    || (i_848_ < 0
			|| ((i_849_ + class166_844_.anInt2053 * 2039042417
			     >> class166_844_.anInt2054 * -122333825)
			    >= class166_844_.anInt2055 * 266270313)
			|| i_850_ < 0
			|| ((i_851_ + class166_844_.anInt2053 * 2039042417
			     >> class166_844_.anInt2054 * -122333825)
			    >= class166_844_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_848_ >>= class166.anInt2054 * -122333825;
		i_849_ = (i_849_ + (class166.anInt2053 * 2039042417 - 1)
			  >> class166.anInt2054 * -122333825);
		i_850_ >>= class166.anInt2054 * -122333825;
		i_851_ = (i_851_ + (class166.anInt2053 * 2039042417 - 1)
			  >> class166.anInt2054 * -122333825);
		if (class166.method3551(i_848_, i_850_, 248440063) == i_846_
		    && class166.method3551(i_849_, i_850_, 485171893) == i_846_
		    && class166.method3551(i_848_, i_851_, 63605597) == i_846_
		    && (class166.method3551(i_849_, i_851_, -701218896)
			== i_846_))
		    return;
	    }
	    if (i == 1) {
		for (int i_852_ = 0; i_852_ < ((Class89_Sub2) this).anInt9410;
		     i_852_++)
		    ((Class89_Sub2) this).anIntArray9412[i_852_]
			= (((Class89_Sub2) this).anIntArray9412[i_852_]
			   + class166.method3550(((((Class89_Sub2) this)
						   .anIntArray9411[i_852_])
						  + i_845_),
						 ((((Class89_Sub2) this)
						   .anIntArray9413[i_852_])
						  + i_847_),
						 349171810)
			   - i_846_);
	    } else if (i == 2) {
		int i_853_ = ((Class89_Sub2) this).aShort9403;
		if (i_853_ == 0)
		    return;
		for (int i_854_ = 0; i_854_ < ((Class89_Sub2) this).anInt9410;
		     i_854_++) {
		    int i_855_
			= ((((Class89_Sub2) this).anIntArray9412[i_854_] << 16)
			   / i_853_);
		    if (i_855_ < i_843_)
			((Class89_Sub2) this).anIntArray9412[i_854_]
			    = (((Class89_Sub2) this).anIntArray9412[i_854_]
			       + (class166.method3550((((Class89_Sub2) this)
						       .anIntArray9411
						       [i_854_]) + i_845_,
						      (((Class89_Sub2) this)
						       .anIntArray9413
						       [i_854_]) + i_847_,
						      -2040694221)
				  - i_846_) * (i_843_ - i_855_) / i_843_);
		}
	    } else if (i == 3) {
		int i_856_ = (i_843_ & 0xff) * 4;
		int i_857_ = (i_843_ >> 8 & 0xff) * 4;
		int i_858_ = (i_843_ >> 16 & 0xff) << 6;
		int i_859_ = (i_843_ >> 24 & 0xff) << 6;
		if (i_845_ - (i_856_ >> 1) < 0
		    || ((i_845_ + (i_856_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2055 * 266270313
			    << class166.anInt2054 * -122333825))
		    || i_847_ - (i_857_ >> 1) < 0
		    || ((i_847_ + (i_857_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2052 * -14610189
			    << class166.anInt2054 * -122333825)))
		    return;
		method2041(class166, i_845_, i_846_, i_847_, i_856_, i_857_,
			   i_858_, i_859_);
	    } else if (i == 4) {
		int i_860_ = (((Class89_Sub2) this).aShort9446
			      - ((Class89_Sub2) this).aShort9403);
		for (int i_861_ = 0; i_861_ < ((Class89_Sub2) this).anInt9410;
		     i_861_++)
		    ((Class89_Sub2) this).anIntArray9412[i_861_]
			= (((Class89_Sub2) this).anIntArray9412[i_861_]
			   + (class166_844_.method3550((((Class89_Sub2) this)
							.anIntArray9411
							[i_861_]) + i_845_,
						       (((Class89_Sub2) this)
							.anIntArray9413
							[i_861_]) + i_847_,
						       -157464477)
			      - i_846_)
			   + i_860_);
	    } else if (i == 5) {
		int i_862_ = (((Class89_Sub2) this).aShort9446
			      - ((Class89_Sub2) this).aShort9403);
		for (int i_863_ = 0; i_863_ < ((Class89_Sub2) this).anInt9410;
		     i_863_++) {
		    int i_864_ = (((Class89_Sub2) this).anIntArray9411[i_863_]
				  + i_845_);
		    int i_865_ = (((Class89_Sub2) this).anIntArray9413[i_863_]
				  + i_847_);
		    int i_866_
			= class166.method3550(i_864_, i_865_, -965258650);
		    int i_867_
			= class166_844_.method3550(i_864_, i_865_, 155553039);
		    int i_868_ = i_866_ - i_867_ - i_843_;
		    ((Class89_Sub2) this).anIntArray9412[i_863_]
			= (((((Class89_Sub2) this).anIntArray9412[i_863_] << 8)
			    / i_862_ * i_868_)
			   >> 8) - (i_846_ - i_866_);
		}
	    }
	    if (((Class89_Sub2) this).aClass151_9434 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9434)
		    .anInterface8_1713
		    = null;
	    ((Class89_Sub2) this).aBool9444 = false;
	}
    }
    
    void method1888() {
	for (int i = 0; i < ((Class89_Sub2) this).anInt9409; i++) {
	    ((Class89_Sub2) this).anIntArray9411[i]
		= ((Class89_Sub2) this).anIntArray9411[i] + 7 >> 4;
	    ((Class89_Sub2) this).anIntArray9412[i]
		= ((Class89_Sub2) this).anIntArray9412[i] + 7 >> 4;
	    ((Class89_Sub2) this).anIntArray9413[i]
		= ((Class89_Sub2) this).anIntArray9413[i] + 7 >> 4;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public boolean method2018() {
	if (((Class89_Sub2) this).aShortArray9414 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub2) this).aShortArray9414.length;
	     i++) {
	    if (((Class89_Sub2) this).aShortArray9414[i] != -1) {
		Class101 class101
		    = (((Class89_Sub2) this).aClass103_Sub1_9457
			   .aClass107_1458.method2680
		       (((Class89_Sub2) this).aShortArray9414[i] & 0xffff,
			176818284));
		if (class101.anInt1403 * 218388063 != -1
		    && !((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457)
			    .aClass173_9080.method3719(class101, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public Class167[] method1917() {
	return ((Class89_Sub2) this).aClass167Array9454;
    }
    
    public Class106[] method2051() {
	return ((Class89_Sub2) this).aClass106Array9445;
    }
    
    public void method1946(int i, int i_869_, int i_870_) {
	for (int i_871_ = 0; i_871_ < ((Class89_Sub2) this).anInt9410;
	     i_871_++) {
	    if (i != 128)
		((Class89_Sub2) this).anIntArray9411[i_871_]
		    = ((Class89_Sub2) this).anIntArray9411[i_871_] * i >> 7;
	    if (i_869_ != 128)
		((Class89_Sub2) this).anIntArray9412[i_871_]
		    = (((Class89_Sub2) this).anIntArray9412[i_871_] * i_869_
		       >> 7);
	    if (i_870_ != 128)
		((Class89_Sub2) this).anIntArray9413[i_871_]
		    = (((Class89_Sub2) this).anIntArray9413[i_871_] * i_870_
		       >> 7);
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1931(int i) {
	int i_872_ = Class282.anIntArray4430[i];
	int i_873_ = Class282.anIntArray4441[i];
	for (int i_874_ = 0; i_874_ < ((Class89_Sub2) this).anInt9410;
	     i_874_++) {
	    int i_875_
		= ((((Class89_Sub2) this).anIntArray9413[i_874_] * i_872_
		    + ((Class89_Sub2) this).anIntArray9411[i_874_] * i_873_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9413[i_874_]
		= ((((Class89_Sub2) this).anIntArray9413[i_874_] * i_873_
		    - ((Class89_Sub2) this).anIntArray9411[i_874_] * i_872_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9411[i_874_] = i_875_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    static float[] method15538(float[] fs, int i) {
	float[] fs_876_ = new float[i];
	System.arraycopy(fs, 0, fs_876_, 0, i);
	return fs_876_;
    }
    
    void method1952() {
	/* empty */
    }
    
    void method15539(Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2) {
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .anIntArray9232).length
	    < ((Class89_Sub2) this).anInt9416) {
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.anIntArray9232
		= new int[((Class89_Sub2) this).anInt9416];
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.anIntArray9175
		= new int[((Class89_Sub2) this).anInt9416];
	}
	int[] is = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .anIntArray9232);
	int[] is_877_
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .anIntArray9175);
	for (int i = 0; i < ((Class89_Sub2) this).anInt9410; i++) {
	    int i_878_
		= (((((Class89_Sub2) this).anIntArray9411[i]
		     - ((((Class89_Sub2) this).anIntArray9412[i]
			 * ((Class103_Sub1) (((Class89_Sub2) this)
					     .aClass103_Sub1_9457)).anInt9181)
			>> 8))
		    >> ((Class103_Sub1)
			((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093)
		   - (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11479));
	    int i_879_
		= (((((Class89_Sub2) this).anIntArray9413[i]
		     - ((((Class89_Sub2) this).anIntArray9412[i]
			 * ((Class103_Sub1) (((Class89_Sub2) this)
					     .aClass103_Sub1_9457)).anInt9169)
			>> 8))
		    >> ((Class103_Sub1)
			((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093)
		   - (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11476));
	    int i_880_ = ((Class89_Sub2) this).anIntArray9395[i];
	    int i_881_ = ((Class89_Sub2) this).anIntArray9395[i + 1];
	    for (int i_882_ = i_880_;
		 (i_882_ < i_881_
		  && ((Class89_Sub2) this).aShortArray9455[i_882_] != 0);
		 i_882_++) {
		int i_883_
		    = ((((Class89_Sub2) this).aShortArray9455[i_882_] & 0xffff)
		       - 1);
		is[i_883_] = i_878_;
		is_877_[i_883_] = i_879_;
	    }
	}
	for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
	    if (((Class89_Sub2) this).aByteArray9408 == null
		|| ((Class89_Sub2) this).aByteArray9408[i] <= 128) {
		int i_884_ = ((Class89_Sub2) this).aShortArray9428[i] & 0xffff;
		int i_885_ = ((Class89_Sub2) this).aShortArray9462[i] & 0xffff;
		int i_886_ = ((Class89_Sub2) this).aShortArray9407[i] & 0xffff;
		int i_887_ = is[i_884_];
		int i_888_ = is[i_885_];
		int i_889_ = is[i_886_];
		int i_890_ = is_877_[i_884_];
		int i_891_ = is_877_[i_885_];
		int i_892_ = is_877_[i_886_];
		if (((i_887_ - i_888_) * (i_891_ - i_892_)
		     - (i_891_ - i_890_) * (i_889_ - i_888_))
		    > 0)
		    class241_sub39_sub17_sub2.method17914(i_890_, i_891_,
							  i_892_, i_887_,
							  i_888_, i_889_);
	    }
	}
    }
    
    public void method1890(Class266 class266, Class97 class97, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (((Class89_Sub2) this).anInt9416 != 0) {
	    Class268 class268
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9122);
	    Class268 class268_893_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9136);
	    Class268 class268_894_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9161);
	    class268_893_.method5203(class266);
	    class268_894_.method5199(class268_893_);
	    class268_894_.method5202(((Class103_Sub1) (((Class89_Sub2) this)
						       .aClass103_Sub1_9457))
				     .aClass268_9105);
	    if (!((Class89_Sub2) this).aBool9444)
		method15537();
	    float[] fs
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aFloatArray9126);
	    class268_893_.method5208(0.0F,
				     (float) ((Class89_Sub2) this).aShort9403,
				     0.0F, fs);
	    float f = fs[0];
	    float f_895_ = fs[1];
	    float f_896_ = fs[2];
	    class268_893_.method5208(0.0F,
				     (float) ((Class89_Sub2) this).aShort9446,
				     0.0F, fs);
	    float f_897_ = fs[0];
	    float f_898_ = fs[1];
	    float f_899_ = fs[2];
	    for (int i_900_ = 0; i_900_ < 6; i_900_++) {
		float[] fs_901_ = (((Class103_Sub1)
				    ((Class89_Sub2) this).aClass103_Sub1_9457)
				   .aFloatArrayArray9139[i_900_]);
		float f_902_ = (fs_901_[0] * f + fs_901_[1] * f_895_
				+ fs_901_[2] * f_896_ + fs_901_[3]
				+ (float) ((Class89_Sub2) this).anInt9421);
		float f_903_ = (fs_901_[0] * f_897_ + fs_901_[1] * f_898_
				+ fs_901_[2] * f_899_ + fs_901_[3]
				+ (float) ((Class89_Sub2) this).anInt9421);
		if (f_902_ < 0.0F && f_903_ < 0.0F)
		    return;
	    }
	    if (class97 != null) {
		boolean bool = false;
		boolean bool_904_ = true;
		int i_905_ = ((((Class89_Sub2) this).aShort9447
			       + ((Class89_Sub2) this).aShort9448)
			      >> 1);
		int i_906_ = ((((Class89_Sub2) this).aShort9449
			       + ((Class89_Sub2) this).aShort9450)
			      >> 1);
		int i_907_ = i_905_;
		short i_908_ = ((Class89_Sub2) this).aShort9403;
		int i_909_ = i_906_;
		float f_910_
		    = (class268_894_.aFloatArray4353[0] * (float) i_907_
		       + class268_894_.aFloatArray4353[4] * (float) i_908_
		       + class268_894_.aFloatArray4353[8] * (float) i_909_
		       + class268_894_.aFloatArray4353[12]);
		float f_911_
		    = (class268_894_.aFloatArray4353[1] * (float) i_907_
		       + class268_894_.aFloatArray4353[5] * (float) i_908_
		       + class268_894_.aFloatArray4353[9] * (float) i_909_
		       + class268_894_.aFloatArray4353[13]);
		float f_912_
		    = (class268_894_.aFloatArray4353[2] * (float) i_907_
		       + class268_894_.aFloatArray4353[6] * (float) i_908_
		       + class268_894_.aFloatArray4353[10] * (float) i_909_
		       + class268_894_.aFloatArray4353[14]);
		float f_913_
		    = (class268_894_.aFloatArray4353[3] * (float) i_907_
		       + class268_894_.aFloatArray4353[7] * (float) i_908_
		       + class268_894_.aFloatArray4353[11] * (float) i_909_
		       + class268_894_.aFloatArray4353[15]);
		if (f_912_ >= -f_913_) {
		    class97.anInt1349
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9127)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9128) * f_910_ / f_913_);
		    class97.anInt1347
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9129)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9130) * f_911_ / f_913_);
		} else
		    bool = true;
		i_907_ = i_905_;
		i_908_ = ((Class89_Sub2) this).aShort9446;
		i_909_ = i_906_;
		float f_914_
		    = (class268_894_.aFloatArray4353[0] * (float) i_907_
		       + class268_894_.aFloatArray4353[4] * (float) i_908_
		       + class268_894_.aFloatArray4353[8] * (float) i_909_
		       + class268_894_.aFloatArray4353[12]);
		float f_915_
		    = (class268_894_.aFloatArray4353[1] * (float) i_907_
		       + class268_894_.aFloatArray4353[5] * (float) i_908_
		       + class268_894_.aFloatArray4353[9] * (float) i_909_
		       + class268_894_.aFloatArray4353[13]);
		float f_916_
		    = (class268_894_.aFloatArray4353[2] * (float) i_907_
		       + class268_894_.aFloatArray4353[6] * (float) i_908_
		       + class268_894_.aFloatArray4353[10] * (float) i_909_
		       + class268_894_.aFloatArray4353[14]);
		float f_917_
		    = (class268_894_.aFloatArray4353[3] * (float) i_907_
		       + class268_894_.aFloatArray4353[7] * (float) i_908_
		       + class268_894_.aFloatArray4353[11] * (float) i_909_
		       + class268_894_.aFloatArray4353[15]);
		if (f_916_ >= -f_917_) {
		    class97.anInt1350
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9127)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9128) * f_914_ / f_917_);
		    class97.anInt1351
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9129)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9130) * f_915_ / f_917_);
		} else
		    bool = true;
		if (bool) {
		    if (f_912_ < -f_913_ && f_916_ < -f_917_)
			bool_904_ = false;
		    else if (f_912_ < -f_913_) {
			float f_918_
			    = (f_912_ + f_913_) / (f_916_ + f_917_) - 1.0F;
			float f_919_ = f_910_ + f_918_ * (f_914_ - f_910_);
			float f_920_ = f_911_ + f_918_ * (f_915_ - f_911_);
			float f_921_ = f_913_ + f_918_ * (f_917_ - f_913_);
			class97.anInt1349
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_919_ / f_921_));
			class97.anInt1347
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9129)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9130
					* f_920_ / f_921_));
		    } else if (f_916_ < -f_917_) {
			float f_922_
			    = (f_916_ + f_917_) / (f_912_ + f_913_) - 1.0F;
			float f_923_ = f_914_ + f_922_ * (f_910_ - f_914_);
			float f_924_ = f_915_ + f_922_ * (f_911_ - f_915_);
			float f_925_ = f_917_ + f_922_ * (f_913_ - f_917_);
			class97.anInt1350
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_923_ / f_925_));
			class97.anInt1351
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9129)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9130
					* f_924_ / f_925_));
		    }
		}
		if (bool_904_) {
		    if (f_912_ / f_913_ > f_916_ / f_917_) {
			float f_926_
			    = (f_910_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[12]);
			float f_927_
			    = (f_913_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     - (float) class97.anInt1349
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_926_ / f_927_));
		    } else {
			float f_928_
			    = (f_914_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[12]);
			float f_929_
			    = (f_917_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     - (float) class97.anInt1350
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_928_ / f_929_));
		    }
		    class97.aBool1352 = true;
		}
	    }
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15259();
	    ((Class89_Sub2) this).aClass103_Sub1_9457
		.method15151(class268_893_);
	    method15540();
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15144();
	    class268_893_.method5202(((Class103_Sub1) (((Class89_Sub2) this)
						       .aClass103_Sub1_9457))
				     .aClass268_9150);
	    method15567(class268_893_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    void method15540() {
	if (((Class89_Sub2) this).anInt9441 != 0) {
	    if (((Class89_Sub2) this).aByte9404 != 0)
		method15541(true);
	    method15541(false);
	    if (((Class89_Sub2) this).aClass146_9438 != null) {
		if ((((Class146) ((Class89_Sub2) this).aClass146_9438)
		     .anInterface14_1692)
		    == null)
		    method15536((((Class89_Sub2) this).aByte9404 & 0x10) != 0);
		if ((((Class146) ((Class89_Sub2) this).aClass146_9438)
		     .anInterface14_1692)
		    != null) {
		    ((Class89_Sub2) this).aClass103_Sub1_9457.method15186
			(((Class89_Sub2) this).aClass151_9436 != null);
		    ((Class89_Sub2) this).aClass103_Sub1_9457.method15168
			(((Class89_Sub2) this).aClass151_9434,
			 ((Class89_Sub2) this).aClass151_9436,
			 ((Class89_Sub2) this).aClass151_9433,
			 ((Class89_Sub2) this).aClass151_9437);
		    int i = ((Class89_Sub2) this).anIntArray9453.length - 1;
		    for (int i_930_ = 0; i_930_ < i; i_930_++) {
			int i_931_
			    = ((Class89_Sub2) this).anIntArray9453[i_930_];
			int i_932_
			    = ((Class89_Sub2) this).anIntArray9453[i_930_ + 1];
			int i_933_
			    = ((((Class89_Sub2) this).aShortArray9414[i_931_]
				== -1)
			       ? -1
			       : (((Class89_Sub2) this).aShortArray9414[i_931_]
				  & 0xffff));
			((Class89_Sub2) this).aClass103_Sub1_9457.method15174
			    (i_933_,
			     ((Class89_Sub2) this).aClass151_9436 != null);
			((Class89_Sub2) this).aClass103_Sub1_9457.method15265
			    ((((Class146) ((Class89_Sub2) this).aClass146_9438)
			      .anInterface14_1692),
			     4, i_931_ * 3, (i_932_ - i_931_) * 3);
		    }
		}
	    }
	    method15544();
	}
    }
    
    void method1878() {
	/* empty */
    }
    
    public void method1995(int i) {
	((Class89_Sub2) this).aShort9406 = (short) i;
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9436 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9436).anInterface8_1713
		= null;
    }
    
    void method15541(boolean bool) {
	boolean bool_934_
	    = (((Class89_Sub2) this).aClass151_9433 != null
	       && (((Class151) ((Class89_Sub2) this).aClass151_9433)
		   .anInterface8_1713) == null);
	boolean bool_935_
	    = (((Class89_Sub2) this).aClass151_9436 != null
	       && (((Class151) ((Class89_Sub2) this).aClass151_9436)
		   .anInterface8_1713) == null);
	boolean bool_936_
	    = (((Class89_Sub2) this).aClass151_9434 != null
	       && (((Class151) ((Class89_Sub2) this).aClass151_9434)
		   .anInterface8_1713) == null);
	boolean bool_937_
	    = (((Class89_Sub2) this).aClass151_9437 != null
	       && (((Class151) ((Class89_Sub2) this).aClass151_9437)
		   .anInterface8_1713) == null);
	if (bool) {
	    bool_934_
		= bool_934_ & (((Class89_Sub2) this).aByte9404 & 0x2) != 0;
	    bool_935_
		= bool_935_ & (((Class89_Sub2) this).aByte9404 & 0x4) != 0;
	    bool_936_
		= bool_936_ & (((Class89_Sub2) this).aByte9404 & 0x1) != 0;
	    bool_937_
		= bool_937_ & (((Class89_Sub2) this).aByte9404 & 0x8) != 0;
	}
	byte i = 0;
	byte i_938_ = 0;
	byte i_939_ = 0;
	byte i_940_ = 0;
	byte i_941_ = 0;
	if (bool_936_) {
	    i_938_ = i;
	    i += 12;
	}
	if (bool_934_) {
	    i_939_ = i;
	    i += 4;
	}
	if (bool_935_) {
	    i_940_ = i;
	    i += 12;
	}
	if (bool_937_) {
	    i_941_ = i;
	    i += 8;
	}
	if (i != 0) {
	    if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		 .aClass241_Sub3_Sub2_9231.payload).length
		< ((Class89_Sub2) this).anInt9416 * i)
		((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .aClass241_Sub3_Sub2_9231
		    = new Class241_Sub3_Sub2((((Class89_Sub2) this).anInt9416
					      + 100) * i);
	    else
		((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .aClass241_Sub3_Sub2_9231.pointer
		    = 0;
	    Class241_Sub3_Sub2 class241_sub3_sub2
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass241_Sub3_Sub2_9231);
	    if (bool_936_) {
		if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .aBool9144) {
		    for (int i_942_ = 0;
			 i_942_ < ((Class89_Sub2) this).anInt9410; i_942_++) {
			int i_943_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9411
							       [i_942_]);
			int i_944_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9412
							       [i_942_]);
			int i_945_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9413
							       [i_942_]);
			int i_946_
			    = ((Class89_Sub2) this).anIntArray9395[i_942_];
			int i_947_
			    = ((Class89_Sub2) this).anIntArray9395[i_942_ + 1];
			for (int i_948_ = i_946_;
			     (i_948_ < i_947_
			      && (((Class89_Sub2) this).aShortArray9455[i_948_]
				  != 0));
			     i_948_++) {
			    int i_949_ = (((((Class89_Sub2) this)
					    .aShortArray9455[i_948_])
					   & 0xffff)
					  - 1);
			    class241_sub3_sub2.pointer
				= i_949_ * i * -681042949;
			    class241_sub3_sub2.writeInt(i_943_, 475782006);
			    class241_sub3_sub2.writeInt(i_944_,
							   -1160277238);
			    class241_sub3_sub2.writeInt(i_945_,
							   -1614099605);
			}
		    }
		} else {
		    for (int i_950_ = 0;
			 i_950_ < ((Class89_Sub2) this).anInt9410; i_950_++) {
			int i_951_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9411
							       [i_950_]);
			int i_952_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9412
							       [i_950_]);
			int i_953_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9413
							       [i_950_]);
			int i_954_
			    = ((Class89_Sub2) this).anIntArray9395[i_950_];
			int i_955_
			    = ((Class89_Sub2) this).anIntArray9395[i_950_ + 1];
			for (int i_956_ = i_954_;
			     (i_956_ < i_955_
			      && (((Class89_Sub2) this).aShortArray9455[i_956_]
				  != 0));
			     i_956_++) {
			    int i_957_ = (((((Class89_Sub2) this)
					    .aShortArray9455[i_956_])
					   & 0xffff)
					  - 1);
			    class241_sub3_sub2.pointer
				= i_957_ * i * -681042949;
			    class241_sub3_sub2.method14687(i_951_, -211923687);
			    class241_sub3_sub2.method14687(i_952_, 1254861502);
			    class241_sub3_sub2.method14687(i_953_, 1500160159);
			}
		    }
		}
	    }
	    if (bool_934_) {
		if (((Class89_Sub2) this).aClass151_9436 == null) {
		    short[] is;
		    short[] is_958_;
		    short[] is_959_;
		    byte[] is_960_;
		    if (((Class89_Sub2) this).aClass178_9456 != null) {
			is = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			      .aShortArray2129);
			is_958_
			    = ((Class178) (((Class89_Sub2) this)
					   .aClass178_9456)).aShortArray2127;
			is_959_
			    = ((Class178) (((Class89_Sub2) this)
					   .aClass178_9456)).aShortArray2126;
			is_960_
			    = ((Class178) (((Class89_Sub2) this)
					   .aClass178_9456)).aByteArray2128;
		    } else {
			is = ((Class89_Sub2) this).aShortArray9417;
			is_958_ = ((Class89_Sub2) this).aShortArray9418;
			is_959_ = ((Class89_Sub2) this).aShortArray9419;
			is_960_ = ((Class89_Sub2) this).aByteArray9420;
		    }
		    float f = (((Class103_Sub1)
				((Class89_Sub2) this).aClass103_Sub1_9457)
			       .aFloatArray9156[0]);
		    float f_961_ = (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloatArray9156[1]);
		    float f_962_ = (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloatArray9156[2]);
		    float f_963_ = (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9162);
		    float f_964_
			= (((Class103_Sub1) (((Class89_Sub2) this)
					     .aClass103_Sub1_9457)).aFloat9153
			   * 768.0F
			   / (float) ((Class89_Sub2) this).aShort9406);
		    float f_965_
			= (((Class103_Sub1) (((Class89_Sub2) this)
					     .aClass103_Sub1_9457)).aFloat9171
			   * 768.0F
			   / (float) ((Class89_Sub2) this).aShort9406);
		    for (int i_966_ = 0;
			 i_966_ < ((Class89_Sub2) this).anInt9424; i_966_++) {
			int i_967_
			    = (method15542
			       (((Class89_Sub2) this).aShortArray9442[i_966_],
				((Class89_Sub2) this).aShortArray9414[i_966_],
				((Class89_Sub2) this).aShort9405,
				((Class89_Sub2) this).aByteArray9408[i_966_]));
			float f_968_
			    = ((float) (i_967_ >>> 24)
			       * (((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9110));
			float f_969_
			    = ((float) (i_967_ >> 16 & 0xff)
			       * (((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9160));
			float f_970_
			    = ((float) (i_967_ >> 8 & 0xff)
			       * (((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9203));
			int i_971_
			    = (((Class89_Sub2) this).aShortArray9428[i_966_]
			       & 0xffff);
			short i_972_ = (short) is_960_[i_971_];
			float f_973_;
			if (i_972_ == 0)
			    f_973_ = ((f * (float) is[i_971_]
				       + f_961_ * (float) is_958_[i_971_]
				       + f_962_ * (float) is_959_[i_971_])
				      * 0.0026041667F);
			else
			    f_973_ = ((f * (float) is[i_971_]
				       + f_961_ * (float) is_958_[i_971_]
				       + f_962_ * (float) is_959_[i_971_])
				      / (float) (i_972_ * 256));
			float f_974_ = f_963_ + f_973_ * (f_973_ < 0.0F
							  ? f_965_ : f_964_);
			int i_975_ = (int) (f_968_ * f_974_);
			if (i_975_ < 0)
			    i_975_ = 0;
			else if (i_975_ > 255)
			    i_975_ = 255;
			int i_976_ = (int) (f_969_ * f_974_);
			if (i_976_ < 0)
			    i_976_ = 0;
			else if (i_976_ > 255)
			    i_976_ = 255;
			int i_977_ = (int) (f_970_ * f_974_);
			if (i_977_ < 0)
			    i_977_ = 0;
			else if (i_977_ > 255)
			    i_977_ = 255;
			class241_sub3_sub2.pointer
			    = (i_939_ + i_971_ * i) * -681042949;
			class241_sub3_sub2.writeByte(i_975_, 1020963678);
			class241_sub3_sub2.writeByte(i_976_, -1123052686);
			class241_sub3_sub2.writeByte(i_977_, 1189782982);
			class241_sub3_sub2.writeByte(255 - ((((Class89_Sub2)
								this)
							       .aByteArray9408
							       [i_966_])
							      & 0xff),
						       1433622938);
			i_971_ = (((Class89_Sub2) this).aShortArray9462[i_966_]
				  & 0xffff);
			i_972_ = (short) is_960_[i_971_];
			if (i_972_ == 0)
			    f_973_ = ((f * (float) is[i_971_]
				       + f_961_ * (float) is_958_[i_971_]
				       + f_962_ * (float) is_959_[i_971_])
				      * 0.0026041667F);
			else
			    f_973_ = ((f * (float) is[i_971_]
				       + f_961_ * (float) is_958_[i_971_]
				       + f_962_ * (float) is_959_[i_971_])
				      / (float) (i_972_ * 256));
			f_974_ = f_963_ + f_973_ * (f_973_ < 0.0F ? f_965_
						    : f_964_);
			i_975_ = (int) (f_968_ * f_974_);
			if (i_975_ < 0)
			    i_975_ = 0;
			else if (i_975_ > 255)
			    i_975_ = 255;
			i_976_ = (int) (f_969_ * f_974_);
			if (i_976_ < 0)
			    i_976_ = 0;
			else if (i_976_ > 255)
			    i_976_ = 255;
			i_977_ = (int) (f_970_ * f_974_);
			if (i_977_ < 0)
			    i_977_ = 0;
			else if (i_977_ > 255)
			    i_977_ = 255;
			class241_sub3_sub2.pointer
			    = (i_939_ + i_971_ * i) * -681042949;
			class241_sub3_sub2.writeByte(i_975_, -472741411);
			class241_sub3_sub2.writeByte(i_976_, 215212457);
			class241_sub3_sub2.writeByte(i_977_, -117148995);
			class241_sub3_sub2.writeByte(255 - ((((Class89_Sub2)
								this)
							       .aByteArray9408
							       [i_966_])
							      & 0xff),
						       -1918057480);
			i_971_ = (((Class89_Sub2) this).aShortArray9407[i_966_]
				  & 0xffff);
			i_972_ = (short) is_960_[i_971_];
			if (i_972_ == 0)
			    f_973_ = ((f * (float) is[i_971_]
				       + f_961_ * (float) is_958_[i_971_]
				       + f_962_ * (float) is_959_[i_971_])
				      * 0.0026041667F);
			else
			    f_973_ = ((f * (float) is[i_971_]
				       + f_961_ * (float) is_958_[i_971_]
				       + f_962_ * (float) is_959_[i_971_])
				      / (float) (i_972_ * 256));
			f_974_ = f_963_ + f_973_ * (f_973_ < 0.0F ? f_965_
						    : f_964_);
			i_975_ = (int) (f_968_ * f_974_);
			if (i_975_ < 0)
			    i_975_ = 0;
			else if (i_975_ > 255)
			    i_975_ = 255;
			i_976_ = (int) (f_969_ * f_974_);
			if (i_976_ < 0)
			    i_976_ = 0;
			else if (i_976_ > 255)
			    i_976_ = 255;
			i_977_ = (int) (f_970_ * f_974_);
			if (i_977_ < 0)
			    i_977_ = 0;
			else if (i_977_ > 255)
			    i_977_ = 255;
			class241_sub3_sub2.pointer
			    = (i_939_ + i_971_ * i) * -681042949;
			class241_sub3_sub2.writeByte(i_975_, -1621709818);
			class241_sub3_sub2.writeByte(i_976_, 1137082406);
			class241_sub3_sub2.writeByte(i_977_, 851217412);
			class241_sub3_sub2.writeByte(255 - ((((Class89_Sub2)
								this)
							       .aByteArray9408
							       [i_966_])
							      & 0xff),
						       -813384944);
		    }
		} else {
		    for (int i_978_ = 0;
			 i_978_ < ((Class89_Sub2) this).anInt9424; i_978_++) {
			int i_979_
			    = (method15542
			       (((Class89_Sub2) this).aShortArray9442[i_978_],
				((Class89_Sub2) this).aShortArray9414[i_978_],
				((Class89_Sub2) this).aShort9405,
				((Class89_Sub2) this).aByteArray9408[i_978_]));
			class241_sub3_sub2.pointer
			    = (i_939_
			       + (((Class89_Sub2) this).aShortArray9428[i_978_]
				  & 0xffff) * i) * -681042949;
			class241_sub3_sub2.writeInt(i_979_, 42559579);
			class241_sub3_sub2.pointer
			    = (i_939_
			       + (((Class89_Sub2) this).aShortArray9462[i_978_]
				  & 0xffff) * i) * -681042949;
			class241_sub3_sub2.writeInt(i_979_, 842686152);
			class241_sub3_sub2.pointer
			    = (i_939_
			       + (((Class89_Sub2) this).aShortArray9407[i_978_]
				  & 0xffff) * i) * -681042949;
			class241_sub3_sub2.writeInt(i_979_, 588620281);
		    }
		}
	    }
	    if (bool_935_) {
		short[] is;
		short[] is_980_;
		short[] is_981_;
		byte[] is_982_;
		if (((Class89_Sub2) this).aClass178_9456 != null) {
		    is = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			  .aShortArray2129);
		    is_980_
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2127);
		    is_981_
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2126);
		    is_982_
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aByteArray2128);
		} else {
		    is = ((Class89_Sub2) this).aShortArray9417;
		    is_980_ = ((Class89_Sub2) this).aShortArray9418;
		    is_981_ = ((Class89_Sub2) this).aShortArray9419;
		    is_982_ = ((Class89_Sub2) this).aByteArray9420;
		}
		float f = 3.0F / (float) ((Class89_Sub2) this).aShort9406;
		float f_983_
		    = 3.0F / (float) (((Class89_Sub2) this).aShort9406
				      + ((Class89_Sub2) this).aShort9406 / 2);
		class241_sub3_sub2.pointer = i_940_ * -681042949;
		if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .aBool9144) {
		    for (int i_984_ = 0;
			 i_984_ < ((Class89_Sub2) this).anInt9416; i_984_++) {
			int i_985_ = is_982_[i_984_] & 0xff;
			if (i_985_ == 0) {
			    class241_sub3_sub2
				.method17060((float) is[i_984_] * f_983_);
			    class241_sub3_sub2
				.method17060((float) is_980_[i_984_] * f_983_);
			    class241_sub3_sub2
				.method17060((float) is_981_[i_984_] * f_983_);
			} else {
			    float f_986_ = f / (float) i_985_;
			    class241_sub3_sub2
				.method17060((float) is[i_984_] * f_986_);
			    class241_sub3_sub2
				.method17060((float) is_980_[i_984_] * f_986_);
			    class241_sub3_sub2
				.method17060((float) is_981_[i_984_] * f_986_);
			}
			class241_sub3_sub2.pointer += (i - 12) * -681042949;
		    }
		} else {
		    for (int i_987_ = 0;
			 i_987_ < ((Class89_Sub2) this).anInt9416; i_987_++) {
			int i_988_ = is_982_[i_987_] & 0xff;
			if (i_988_ == 0) {
			    class241_sub3_sub2
				.method17064((float) is[i_987_] * f_983_);
			    class241_sub3_sub2
				.method17064((float) is_980_[i_987_] * f_983_);
			    class241_sub3_sub2
				.method17064((float) is_981_[i_987_] * f_983_);
			} else {
			    float f_989_ = f / (float) i_988_;
			    class241_sub3_sub2
				.method17064((float) is[i_987_] * f_989_);
			    class241_sub3_sub2
				.method17064((float) is_980_[i_987_] * f_989_);
			    class241_sub3_sub2
				.method17064((float) is_981_[i_987_] * f_989_);
			}
			class241_sub3_sub2.pointer += (i - 12) * -681042949;
		    }
		}
	    }
	    if (bool_937_) {
		class241_sub3_sub2.pointer = i_941_ * -681042949;
		if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .aBool9144) {
		    for (int i_990_ = 0;
			 i_990_ < ((Class89_Sub2) this).anInt9416; i_990_++) {
			class241_sub3_sub2.method17060(((Class89_Sub2) this)
						       .aFloatArray9422
						       [i_990_]);
			class241_sub3_sub2.method17060(((Class89_Sub2) this)
						       .aFloatArray9423
						       [i_990_]);
			class241_sub3_sub2.pointer += (i - 8) * -681042949;
		    }
		} else {
		    for (int i_991_ = 0;
			 i_991_ < ((Class89_Sub2) this).anInt9416; i_991_++) {
			class241_sub3_sub2.method17064(((Class89_Sub2) this)
						       .aFloatArray9422
						       [i_991_]);
			class241_sub3_sub2.method17064(((Class89_Sub2) this)
						       .aFloatArray9423
						       [i_991_]);
			class241_sub3_sub2.pointer += (i - 8) * -681042949;
		    }
		}
	    }
	    class241_sub3_sub2.pointer
		= i * ((Class89_Sub2) this).anInt9416 * -681042949;
	    Interface8 interface8;
	    if (bool) {
		if (((Class89_Sub2) this).anInterface8_9440 == null)
		    ((Class89_Sub2) this).anInterface8_9440
			= (((Class89_Sub2) this).aClass103_Sub1_9457
			       .method15165
			   (i, class241_sub3_sub2.payload,
			    class241_sub3_sub2.pointer * 421967667, true));
		else
		    ((Class89_Sub2) this).anInterface8_9440.method51
			(i, class241_sub3_sub2.payload,
			 class241_sub3_sub2.pointer * 421967667);
		interface8 = ((Class89_Sub2) this).anInterface8_9440;
		((Class89_Sub2) this).aByte9404 = (byte) 0;
	    } else {
		interface8
		    = (((Class89_Sub2) this).aClass103_Sub1_9457.method15165
		       (i, class241_sub3_sub2.payload,
			class241_sub3_sub2.pointer * 421967667, false));
		((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (bool_936_) {
		((Class151) ((Class89_Sub2) this).aClass151_9434)
		    .anInterface8_1713
		    = interface8;
		((Class151) ((Class89_Sub2) this).aClass151_9434).aByte1712
		    = i_938_;
	    }
	    if (bool_937_) {
		((Class151) ((Class89_Sub2) this).aClass151_9437)
		    .anInterface8_1713
		    = interface8;
		((Class151) ((Class89_Sub2) this).aClass151_9437).aByte1712
		    = i_941_;
	    }
	    if (bool_934_) {
		((Class151) ((Class89_Sub2) this).aClass151_9433)
		    .anInterface8_1713
		    = interface8;
		((Class151) ((Class89_Sub2) this).aClass151_9433).aByte1712
		    = i_939_;
	    }
	    if (bool_935_) {
		((Class151) ((Class89_Sub2) this).aClass151_9436)
		    .anInterface8_1713
		    = interface8;
		((Class151) ((Class89_Sub2) this).aClass151_9436).aByte1712
		    = i_940_;
	    }
	}
    }
    
    int method15542(int i, short i_992_, int i_993_, byte i_994_) {
	int i_995_ = Class474.anIntArray6383[method15568(i, i_993_)];
	if (i_992_ != -1) {
	    Class101 class101
		= ((Class89_Sub2) this).aClass103_Sub1_9457.aClass107_1458
		      .method2680(i_992_ & 0xffff, 52375313);
	    int i_996_ = class101.aByte1430 & 0xff;
	    if (i_996_ != 0) {
		int i_997_;
		if (i_993_ < 0)
		    i_997_ = 0;
		else if (i_993_ > 127)
		    i_997_ = 16777215;
		else
		    i_997_ = 131586 * i_993_;
		if (i_996_ == 256)
		    i_995_ = i_997_;
		else {
		    int i_998_ = i_996_;
		    int i_999_ = 256 - i_996_;
		    i_995_ = ((((i_997_ & 0xff00ff) * i_998_
				+ (i_995_ & 0xff00ff) * i_999_)
			       & ~0xff00ff)
			      + (((i_997_ & 0xff00) * i_998_
				  + (i_995_ & 0xff00) * i_999_)
				 & 0xff0000)) >> 8;
		}
	    }
	    int i_1000_ = class101.aByte1433 & 0xff;
	    if (i_1000_ != 0) {
		i_1000_ += 256;
		int i_1001_ = ((i_995_ & 0xff0000) >> 16) * i_1000_;
		if (i_1001_ > 65535)
		    i_1001_ = 65535;
		int i_1002_ = ((i_995_ & 0xff00) >> 8) * i_1000_;
		if (i_1002_ > 65535)
		    i_1002_ = 65535;
		int i_1003_ = (i_995_ & 0xff) * i_1000_;
		if (i_1003_ > 65535)
		    i_1003_ = 65535;
		i_995_
		    = (i_1001_ << 8 & 0xff0000) + (i_1002_ & 0xff00) + (i_1003_
									>> 8);
	    }
	}
	return i_995_ << 8 | 255 - (i_994_ & 0xff);
    }
    
    public int method2000() {
	return ((Class89_Sub2) this).aShort9405;
    }
    
    static {
	anIntArray9429 = new int[8];
	anIntArray9466 = new int[8];
    }
    
    Class89 method15543(Class89_Sub2 class89_sub2_1004_,
			Class89_Sub2 class89_sub2_1005_, int i, boolean bool,
			boolean bool_1006_) {
	((Class89_Sub2) class89_sub2_1004_).aByte9404 = (byte) 0;
	((Class89_Sub2) class89_sub2_1004_).anInt9402 = i;
	((Class89_Sub2) class89_sub2_1004_).anInt9469
	    = ((Class89_Sub2) this).anInt9469;
	((Class89_Sub2) class89_sub2_1004_).aShort9405
	    = ((Class89_Sub2) this).aShort9405;
	((Class89_Sub2) class89_sub2_1004_).aShort9406
	    = ((Class89_Sub2) this).aShort9406;
	((Class89_Sub2) class89_sub2_1004_).anInt9409
	    = ((Class89_Sub2) this).anInt9409;
	((Class89_Sub2) class89_sub2_1004_).anInt9410
	    = ((Class89_Sub2) this).anInt9410;
	((Class89_Sub2) class89_sub2_1004_).anInt9416
	    = ((Class89_Sub2) this).anInt9416;
	((Class89_Sub2) class89_sub2_1004_).anInt9424
	    = ((Class89_Sub2) this).anInt9424;
	((Class89_Sub2) class89_sub2_1004_).anInt9441
	    = ((Class89_Sub2) this).anInt9441;
	((Class89_Sub2) class89_sub2_1004_).anInt9427
	    = ((Class89_Sub2) this).anInt9427;
	if ((i & 0x100) != 0)
	    ((Class89_Sub2) class89_sub2_1004_).aBool9452 = true;
	else
	    ((Class89_Sub2) class89_sub2_1004_).aBool9452
		= ((Class89_Sub2) this).aBool9452;
	((Class89_Sub2) class89_sub2_1004_).aBool9425
	    = ((Class89_Sub2) this).aBool9425;
	boolean bool_1007_
	    = Class154.method3248(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_1008_
	    = Class154.method3244(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_1009_
	    = Class154.method3245(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_1010_ = bool_1007_ | bool_1008_ | bool_1009_;
	if (bool_1010_) {
	    if (bool_1007_) {
		if (((Class89_Sub2) class89_sub2_1005_).anIntArray9411 == null
		    || ((((Class89_Sub2) class89_sub2_1005_)
			 .anIntArray9411).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_1004_).anIntArray9411
			= ((Class89_Sub2) class89_sub2_1005_).anIntArray9411
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_1004_).anIntArray9411
			= ((Class89_Sub2) class89_sub2_1005_).anIntArray9411;
	    } else
		((Class89_Sub2) class89_sub2_1004_).anIntArray9411
		    = ((Class89_Sub2) this).anIntArray9411;
	    if (bool_1008_) {
		if (((Class89_Sub2) class89_sub2_1005_).anIntArray9412 == null
		    || ((((Class89_Sub2) class89_sub2_1005_)
			 .anIntArray9412).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_1004_).anIntArray9412
			= ((Class89_Sub2) class89_sub2_1005_).anIntArray9412
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_1004_).anIntArray9412
			= ((Class89_Sub2) class89_sub2_1005_).anIntArray9412;
	    } else
		((Class89_Sub2) class89_sub2_1004_).anIntArray9412
		    = ((Class89_Sub2) this).anIntArray9412;
	    if (bool_1009_) {
		if (((Class89_Sub2) class89_sub2_1005_).anIntArray9413 == null
		    || ((((Class89_Sub2) class89_sub2_1005_)
			 .anIntArray9413).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_1004_).anIntArray9413
			= ((Class89_Sub2) class89_sub2_1005_).anIntArray9413
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_1004_).anIntArray9413
			= ((Class89_Sub2) class89_sub2_1005_).anIntArray9413;
	    } else
		((Class89_Sub2) class89_sub2_1004_).anIntArray9413
		    = ((Class89_Sub2) this).anIntArray9413;
	    for (int i_1011_ = 0; i_1011_ < ((Class89_Sub2) this).anInt9409;
		 i_1011_++) {
		if (bool_1007_)
		    ((Class89_Sub2) class89_sub2_1004_).anIntArray9411[i_1011_]
			= ((Class89_Sub2) this).anIntArray9411[i_1011_];
		if (bool_1008_)
		    ((Class89_Sub2) class89_sub2_1004_).anIntArray9412[i_1011_]
			= ((Class89_Sub2) this).anIntArray9412[i_1011_];
		if (bool_1009_)
		    ((Class89_Sub2) class89_sub2_1004_).anIntArray9413[i_1011_]
			= ((Class89_Sub2) this).anIntArray9413[i_1011_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_1004_).anIntArray9411
		= ((Class89_Sub2) this).anIntArray9411;
	    ((Class89_Sub2) class89_sub2_1004_).anIntArray9412
		= ((Class89_Sub2) this).anIntArray9412;
	    ((Class89_Sub2) class89_sub2_1004_).anIntArray9413
		= ((Class89_Sub2) this).anIntArray9413;
	}
	if (Class154.method3260(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_1004_).aByte9404 |= 0x1;
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9434
		= ((Class89_Sub2) class89_sub2_1005_).aClass151_9434;
	    ((Class151) ((Class89_Sub2) class89_sub2_1004_).aClass151_9434)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9434).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_1004_).aClass151_9434)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9434)
		   .anInterface8_1713);
	} else if (Class154.method3255(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9434
		= ((Class89_Sub2) this).aClass151_9434;
	else
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9434 = null;
	if (Class154.method3300(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1005_).aShortArray9442 == null
		|| (((Class89_Sub2) class89_sub2_1005_).aShortArray9442.length
		    < ((Class89_Sub2) this).anInt9424))
		((Class89_Sub2) class89_sub2_1004_).aShortArray9442
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9442
		    = new short[((Class89_Sub2) this).anInt9424];
	    else
		((Class89_Sub2) class89_sub2_1004_).aShortArray9442
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9442;
	    for (int i_1012_ = 0; i_1012_ < ((Class89_Sub2) this).anInt9424;
		 i_1012_++)
		((Class89_Sub2) class89_sub2_1004_).aShortArray9442[i_1012_]
		    = ((Class89_Sub2) this).aShortArray9442[i_1012_];
	} else
	    ((Class89_Sub2) class89_sub2_1004_).aShortArray9442
		= ((Class89_Sub2) this).aShortArray9442;
	if (Class154.method3249(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1005_).aByteArray9408 == null
		|| (((Class89_Sub2) class89_sub2_1005_).aByteArray9408.length
		    < ((Class89_Sub2) this).anInt9424))
		((Class89_Sub2) class89_sub2_1004_).aByteArray9408
		    = ((Class89_Sub2) class89_sub2_1005_).aByteArray9408
		    = new byte[((Class89_Sub2) this).anInt9424];
	    else
		((Class89_Sub2) class89_sub2_1004_).aByteArray9408
		    = ((Class89_Sub2) class89_sub2_1005_).aByteArray9408;
	    for (int i_1013_ = 0; i_1013_ < ((Class89_Sub2) this).anInt9424;
		 i_1013_++)
		((Class89_Sub2) class89_sub2_1004_).aByteArray9408[i_1013_]
		    = ((Class89_Sub2) this).aByteArray9408[i_1013_];
	} else
	    ((Class89_Sub2) class89_sub2_1004_).aByteArray9408
		= ((Class89_Sub2) this).aByteArray9408;
	if (Class154.method3262(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_1004_).aByte9404 |= 0x2;
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9433
		= ((Class89_Sub2) class89_sub2_1005_).aClass151_9433;
	    ((Class151) ((Class89_Sub2) class89_sub2_1004_).aClass151_9433)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9433).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_1004_).aClass151_9433)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9433)
		   .anInterface8_1713);
	} else if (Class154.method3257(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9433
		= ((Class89_Sub2) this).aClass151_9433;
	else
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9433 = null;
	if (Class154.method3247(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1005_).aShortArray9417 == null
		|| (((Class89_Sub2) class89_sub2_1005_).aShortArray9417.length
		    < ((Class89_Sub2) this).anInt9416)) {
		int i_1014_ = ((Class89_Sub2) this).anInt9416;
		((Class89_Sub2) class89_sub2_1004_).aShortArray9417
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9417
		    = new short[i_1014_];
		((Class89_Sub2) class89_sub2_1004_).aShortArray9418
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9418
		    = new short[i_1014_];
		((Class89_Sub2) class89_sub2_1004_).aShortArray9419
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9419
		    = new short[i_1014_];
	    } else {
		((Class89_Sub2) class89_sub2_1004_).aShortArray9417
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9417;
		((Class89_Sub2) class89_sub2_1004_).aShortArray9418
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9418;
		((Class89_Sub2) class89_sub2_1004_).aShortArray9419
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9419;
	    }
	    if (((Class89_Sub2) this).aClass178_9456 != null) {
		if (((Class89_Sub2) class89_sub2_1005_).aClass178_9456 == null)
		    ((Class89_Sub2) class89_sub2_1005_).aClass178_9456
			= new Class178();
		Class178 class178
		    = (((Class89_Sub2) class89_sub2_1004_).aClass178_9456
		       = ((Class89_Sub2) class89_sub2_1005_).aClass178_9456);
		if (((Class178) class178).aShortArray2129 == null
		    || (((Class178) class178).aShortArray2129.length
			< ((Class89_Sub2) this).anInt9416)) {
		    int i_1015_ = ((Class89_Sub2) this).anInt9416;
		    ((Class178) class178).aShortArray2129 = new short[i_1015_];
		    ((Class178) class178).aShortArray2127 = new short[i_1015_];
		    ((Class178) class178).aShortArray2126 = new short[i_1015_];
		    ((Class178) class178).aByteArray2128 = new byte[i_1015_];
		}
		for (int i_1016_ = 0;
		     i_1016_ < ((Class89_Sub2) this).anInt9416; i_1016_++) {
		    ((Class89_Sub2) class89_sub2_1004_).aShortArray9417
			[i_1016_]
			= ((Class89_Sub2) this).aShortArray9417[i_1016_];
		    ((Class89_Sub2) class89_sub2_1004_).aShortArray9418
			[i_1016_]
			= ((Class89_Sub2) this).aShortArray9418[i_1016_];
		    ((Class89_Sub2) class89_sub2_1004_).aShortArray9419
			[i_1016_]
			= ((Class89_Sub2) this).aShortArray9419[i_1016_];
		    ((Class178) class178).aShortArray2129[i_1016_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2129[i_1016_]);
		    ((Class178) class178).aShortArray2127[i_1016_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2127[i_1016_]);
		    ((Class178) class178).aShortArray2126[i_1016_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2126[i_1016_]);
		    ((Class178) class178).aByteArray2128[i_1016_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aByteArray2128[i_1016_]);
		}
	    } else {
		for (int i_1017_ = 0;
		     i_1017_ < ((Class89_Sub2) this).anInt9416; i_1017_++) {
		    ((Class89_Sub2) class89_sub2_1004_).aShortArray9417
			[i_1017_]
			= ((Class89_Sub2) this).aShortArray9417[i_1017_];
		    ((Class89_Sub2) class89_sub2_1004_).aShortArray9418
			[i_1017_]
			= ((Class89_Sub2) this).aShortArray9418[i_1017_];
		    ((Class89_Sub2) class89_sub2_1004_).aShortArray9419
			[i_1017_]
			= ((Class89_Sub2) this).aShortArray9419[i_1017_];
		}
	    }
	    ((Class89_Sub2) class89_sub2_1004_).aByteArray9420
		= ((Class89_Sub2) this).aByteArray9420;
	} else {
	    ((Class89_Sub2) class89_sub2_1004_).aClass178_9456
		= ((Class89_Sub2) this).aClass178_9456;
	    ((Class89_Sub2) class89_sub2_1004_).aShortArray9417
		= ((Class89_Sub2) this).aShortArray9417;
	    ((Class89_Sub2) class89_sub2_1004_).aShortArray9418
		= ((Class89_Sub2) this).aShortArray9418;
	    ((Class89_Sub2) class89_sub2_1004_).aShortArray9419
		= ((Class89_Sub2) this).aShortArray9419;
	    ((Class89_Sub2) class89_sub2_1004_).aByteArray9420
		= ((Class89_Sub2) this).aByteArray9420;
	}
	if (Class154.method3342(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_1004_).aByte9404 |= 0x4;
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9436
		= ((Class89_Sub2) class89_sub2_1005_).aClass151_9436;
	    ((Class151) ((Class89_Sub2) class89_sub2_1004_).aClass151_9436)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9436).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_1004_).aClass151_9436)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9436)
		   .anInterface8_1713);
	} else if (Class154.method3301(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9436
		= ((Class89_Sub2) this).aClass151_9436;
	else
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9436 = null;
	if (Class154.method3329(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1005_).aFloatArray9422 == null
		|| (((Class89_Sub2) class89_sub2_1005_).aFloatArray9422.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_1018_ = ((Class89_Sub2) this).anInt9416;
		((Class89_Sub2) class89_sub2_1004_).aFloatArray9422
		    = ((Class89_Sub2) class89_sub2_1005_).aFloatArray9422
		    = new float[i_1018_];
		((Class89_Sub2) class89_sub2_1004_).aFloatArray9423
		    = ((Class89_Sub2) class89_sub2_1005_).aFloatArray9423
		    = new float[i_1018_];
	    } else {
		((Class89_Sub2) class89_sub2_1004_).aFloatArray9422
		    = ((Class89_Sub2) class89_sub2_1005_).aFloatArray9422;
		((Class89_Sub2) class89_sub2_1004_).aFloatArray9423
		    = ((Class89_Sub2) class89_sub2_1005_).aFloatArray9423;
	    }
	    for (int i_1019_ = 0; i_1019_ < ((Class89_Sub2) this).anInt9416;
		 i_1019_++) {
		((Class89_Sub2) class89_sub2_1004_).aFloatArray9422[i_1019_]
		    = ((Class89_Sub2) this).aFloatArray9422[i_1019_];
		((Class89_Sub2) class89_sub2_1004_).aFloatArray9423[i_1019_]
		    = ((Class89_Sub2) this).aFloatArray9423[i_1019_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_1004_).aFloatArray9422
		= ((Class89_Sub2) this).aFloatArray9422;
	    ((Class89_Sub2) class89_sub2_1004_).aFloatArray9423
		= ((Class89_Sub2) this).aFloatArray9423;
	}
	if (Class154.method3263(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_1004_).aByte9404 |= 0x8;
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9437
		= ((Class89_Sub2) class89_sub2_1005_).aClass151_9437;
	    ((Class151) ((Class89_Sub2) class89_sub2_1004_).aClass151_9437)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9437).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_1004_).aClass151_9437)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9437)
		   .anInterface8_1713);
	} else if (Class154.method3283(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9437
		= ((Class89_Sub2) this).aClass151_9437;
	else
	    ((Class89_Sub2) class89_sub2_1004_).aClass151_9437 = null;
	if (Class154.method3308(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1005_).aShortArray9428 == null
		|| (((Class89_Sub2) class89_sub2_1005_).aShortArray9428.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_1020_ = ((Class89_Sub2) this).anInt9424;
		((Class89_Sub2) class89_sub2_1004_).aShortArray9428
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9428
		    = new short[i_1020_];
		((Class89_Sub2) class89_sub2_1004_).aShortArray9462
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9462
		    = new short[i_1020_];
		((Class89_Sub2) class89_sub2_1004_).aShortArray9407
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9407
		    = new short[i_1020_];
	    } else {
		((Class89_Sub2) class89_sub2_1004_).aShortArray9428
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9428;
		((Class89_Sub2) class89_sub2_1004_).aShortArray9462
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9462;
		((Class89_Sub2) class89_sub2_1004_).aShortArray9407
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9407;
	    }
	    for (int i_1021_ = 0; i_1021_ < ((Class89_Sub2) this).anInt9424;
		 i_1021_++) {
		((Class89_Sub2) class89_sub2_1004_).aShortArray9428[i_1021_]
		    = ((Class89_Sub2) this).aShortArray9428[i_1021_];
		((Class89_Sub2) class89_sub2_1004_).aShortArray9462[i_1021_]
		    = ((Class89_Sub2) this).aShortArray9462[i_1021_];
		((Class89_Sub2) class89_sub2_1004_).aShortArray9407[i_1021_]
		    = ((Class89_Sub2) this).aShortArray9407[i_1021_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_1004_).aShortArray9428
		= ((Class89_Sub2) this).aShortArray9428;
	    ((Class89_Sub2) class89_sub2_1004_).aShortArray9462
		= ((Class89_Sub2) this).aShortArray9462;
	    ((Class89_Sub2) class89_sub2_1004_).aShortArray9407
		= ((Class89_Sub2) this).aShortArray9407;
	}
	if (Class154.method3264(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_1004_).aByte9404 |= 0x10;
	    ((Class89_Sub2) class89_sub2_1004_).aClass146_9438
		= ((Class89_Sub2) class89_sub2_1005_).aClass146_9438;
	    ((Class146) ((Class89_Sub2) class89_sub2_1004_).aClass146_9438)
		.anInterface14_1692
		= (((Class146) ((Class89_Sub2) this).aClass146_9438)
		   .anInterface14_1692);
	} else if (Class154.method3307(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_1004_).aClass146_9438
		= ((Class89_Sub2) this).aClass146_9438;
	else
	    ((Class89_Sub2) class89_sub2_1004_).aClass146_9438 = null;
	if (Class154.method3252(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1005_).aShortArray9414 == null
		|| (((Class89_Sub2) class89_sub2_1005_).aShortArray9414.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_1022_ = ((Class89_Sub2) this).anInt9424;
		((Class89_Sub2) class89_sub2_1004_).aShortArray9414
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9414
		    = new short[i_1022_];
	    } else
		((Class89_Sub2) class89_sub2_1004_).aShortArray9414
		    = ((Class89_Sub2) class89_sub2_1005_).aShortArray9414;
	    for (int i_1023_ = 0; i_1023_ < ((Class89_Sub2) this).anInt9424;
		 i_1023_++)
		((Class89_Sub2) class89_sub2_1004_).aShortArray9414[i_1023_]
		    = ((Class89_Sub2) this).aShortArray9414[i_1023_];
	} else
	    ((Class89_Sub2) class89_sub2_1004_).aShortArray9414
		= ((Class89_Sub2) this).aShortArray9414;
	if (Class154.method3253(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1005_).aClass140Array9460 == null
		|| ((((Class89_Sub2) class89_sub2_1005_)
		     .aClass140Array9460).length
		    < ((Class89_Sub2) this).anInt9427)) {
		int i_1024_ = ((Class89_Sub2) this).anInt9427;
		((Class89_Sub2) class89_sub2_1004_).aClass140Array9460
		    = ((Class89_Sub2) class89_sub2_1005_).aClass140Array9460
		    = new Class140[i_1024_];
		for (int i_1025_ = 0;
		     i_1025_ < ((Class89_Sub2) this).anInt9427; i_1025_++)
		    ((Class89_Sub2) class89_sub2_1004_).aClass140Array9460
			[i_1025_]
			= ((Class89_Sub2) this).aClass140Array9460[i_1025_]
			      .method3141();
	    } else {
		((Class89_Sub2) class89_sub2_1004_).aClass140Array9460
		    = ((Class89_Sub2) class89_sub2_1005_).aClass140Array9460;
		for (int i_1026_ = 0;
		     i_1026_ < ((Class89_Sub2) this).anInt9427; i_1026_++)
		    ((Class89_Sub2) class89_sub2_1004_).aClass140Array9460
			[i_1026_].method3142
			(((Class89_Sub2) this).aClass140Array9460[i_1026_]);
	    }
	} else
	    ((Class89_Sub2) class89_sub2_1004_).aClass140Array9460
		= ((Class89_Sub2) this).aClass140Array9460;
	((Class89_Sub2) class89_sub2_1004_).aClass171Array9459
	    = ((Class89_Sub2) this).aClass171Array9459;
	if (((Class89_Sub2) this).aBool9444) {
	    ((Class89_Sub2) class89_sub2_1004_).anInt9443
		= ((Class89_Sub2) this).anInt9443;
	    ((Class89_Sub2) class89_sub2_1004_).anInt9421
		= ((Class89_Sub2) this).anInt9421;
	    ((Class89_Sub2) class89_sub2_1004_).aShort9447
		= ((Class89_Sub2) this).aShort9447;
	    ((Class89_Sub2) class89_sub2_1004_).aShort9448
		= ((Class89_Sub2) this).aShort9448;
	    ((Class89_Sub2) class89_sub2_1004_).aShort9403
		= ((Class89_Sub2) this).aShort9403;
	    ((Class89_Sub2) class89_sub2_1004_).aShort9446
		= ((Class89_Sub2) this).aShort9446;
	    ((Class89_Sub2) class89_sub2_1004_).aShort9449
		= ((Class89_Sub2) this).aShort9449;
	    ((Class89_Sub2) class89_sub2_1004_).aShort9450
		= ((Class89_Sub2) this).aShort9450;
	    ((Class89_Sub2) class89_sub2_1004_).aBool9444 = true;
	} else
	    ((Class89_Sub2) class89_sub2_1004_).aBool9444 = false;
	if (((Class89_Sub2) this).aBool9451) {
	    ((Class89_Sub2) class89_sub2_1004_).aShort9435
		= ((Class89_Sub2) this).aShort9435;
	    ((Class89_Sub2) class89_sub2_1004_).aBool9451 = true;
	} else
	    ((Class89_Sub2) class89_sub2_1004_).aBool9451 = false;
	((Class89_Sub2) class89_sub2_1004_).anIntArrayArray9467
	    = ((Class89_Sub2) this).anIntArrayArray9467;
	((Class89_Sub2) class89_sub2_1004_).anIntArrayArray9432
	    = ((Class89_Sub2) this).anIntArrayArray9432;
	((Class89_Sub2) class89_sub2_1004_).anIntArrayArray9461
	    = ((Class89_Sub2) this).anIntArrayArray9461;
	((Class89_Sub2) class89_sub2_1004_).aShortArray9455
	    = ((Class89_Sub2) this).aShortArray9455;
	((Class89_Sub2) class89_sub2_1004_).anIntArray9395
	    = ((Class89_Sub2) this).anIntArray9395;
	((Class89_Sub2) class89_sub2_1004_).aShortArray9465
	    = ((Class89_Sub2) this).aShortArray9465;
	((Class89_Sub2) class89_sub2_1004_).aShortArray9415
	    = ((Class89_Sub2) this).aShortArray9415;
	((Class89_Sub2) class89_sub2_1004_).anIntArray9453
	    = ((Class89_Sub2) this).anIntArray9453;
	((Class89_Sub2) class89_sub2_1004_).aClass106Array9445
	    = ((Class89_Sub2) this).aClass106Array9445;
	((Class89_Sub2) class89_sub2_1004_).aClass167Array9454
	    = ((Class89_Sub2) this).aClass167Array9454;
	return class89_sub2_1004_;
    }
    
    void method15544() {
	if (((Class89_Sub2) this).aBool9431) {
	    ((Class89_Sub2) this).aBool9431 = false;
	    if (((Class89_Sub2) this).aClass106Array9445 == null
		&& ((Class89_Sub2) this).aClass167Array9454 == null
		&& ((Class89_Sub2) this).aClass171Array9459 == null
		&& !Class154.method3293(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		boolean bool = false;
		boolean bool_1027_ = false;
		boolean bool_1028_ = false;
		if (((Class89_Sub2) this).anIntArray9411 != null
		    && !Class154.method3265(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (((Class89_Sub2) this).anIntArray9412 != null
		    && !Class154.method3266(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool_1027_ = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (((Class89_Sub2) this).anIntArray9413 != null
		    && !Class154.method3333(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool_1028_ = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (bool)
		    ((Class89_Sub2) this).anIntArray9411 = null;
		if (bool_1027_)
		    ((Class89_Sub2) this).anIntArray9412 = null;
		if (bool_1028_)
		    ((Class89_Sub2) this).anIntArray9413 = null;
	    }
	    if (((Class89_Sub2) this).aShortArray9455 != null
		&& ((Class89_Sub2) this).anIntArray9411 == null
		&& ((Class89_Sub2) this).anIntArray9412 == null
		&& ((Class89_Sub2) this).anIntArray9413 == null) {
		((Class89_Sub2) this).aShortArray9455 = null;
		((Class89_Sub2) this).anIntArray9395 = null;
	    }
	    if (((Class89_Sub2) this).aByteArray9420 != null
		&& !Class154.method3242(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9436 != null) {
		    if ((((Class151) ((Class89_Sub2) this).aClass151_9436)
			 .anInterface8_1713)
			!= null) {
			((Class89_Sub2) this).aShortArray9419 = null;
			((Class89_Sub2) this).aShortArray9418 = null;
			((Class89_Sub2) this).aShortArray9417 = null;
			((Class89_Sub2) this).aByteArray9420 = null;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		} else if (((Class89_Sub2) this).aClass151_9433 == null
			   || (((Class151) (((Class89_Sub2) this)
					    .aClass151_9433)).anInterface8_1713
			       != null)) {
		    ((Class89_Sub2) this).aShortArray9419 = null;
		    ((Class89_Sub2) this).aShortArray9418 = null;
		    ((Class89_Sub2) this).aShortArray9417 = null;
		    ((Class89_Sub2) this).aByteArray9420 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9442 != null
		&& !Class154.method3269(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aShortArray9442 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aByteArray9408 != null
		&& !Class154.method3270(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aByteArray9408 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aFloatArray9422 != null
		&& !Class154.method3271(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9437 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9437)
			.anInterface8_1713) != null) {
		    ((Class89_Sub2) this).aFloatArray9423 = null;
		    ((Class89_Sub2) this).aFloatArray9422 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9414 != null
		&& !Class154.method3276(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aShortArray9414 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9428 != null
		&& !Class154.method3275(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if ((((Class89_Sub2) this).aClass146_9438 == null
		     || (((Class146) ((Class89_Sub2) this).aClass146_9438)
			 .anInterface14_1692) != null)
		    && (((Class89_Sub2) this).aClass151_9433 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9433)
			    .anInterface8_1713) != null)) {
		    ((Class89_Sub2) this).aShortArray9407 = null;
		    ((Class89_Sub2) this).aShortArray9462 = null;
		    ((Class89_Sub2) this).aShortArray9428 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null
		&& !Class154.method3272(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		((Class89_Sub2) this).anIntArrayArray9432 = null;
		((Class89_Sub2) this).aShortArray9415 = null;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9467 != null
		&& !Class154.method3273(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		((Class89_Sub2) this).anIntArrayArray9467 = null;
		((Class89_Sub2) this).aShortArray9465 = null;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null
		&& !Class154.method3311(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469))
		((Class89_Sub2) this).anIntArrayArray9461 = null;
	    if (((Class89_Sub2) this).anIntArray9453 != null
		&& (((Class89_Sub2) this).anInt9402 & 0x800) == 0
		&& (((Class89_Sub2) this).anInt9402 & 0x40000) == 0)
		((Class89_Sub2) this).anIntArray9453 = null;
	}
    }
    
    public void method1943(int i, int i_1029_, int i_1030_) {
	for (int i_1031_ = 0; i_1031_ < ((Class89_Sub2) this).anInt9410;
	     i_1031_++) {
	    if (i != 0)
		((Class89_Sub2) this).anIntArray9411[i_1031_] += i;
	    if (i_1029_ != 0)
		((Class89_Sub2) this).anIntArray9412[i_1031_] += i_1029_;
	    if (i_1030_ != 0)
		((Class89_Sub2) this).anIntArray9413[i_1031_] += i_1030_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public Class89 method1886(byte i, int i_1032_, boolean bool) {
	boolean bool_1033_ = false;
	Class89_Sub2 class89_sub2_1034_;
	Class89_Sub2 class89_sub2_1035_;
	if (i > 0 && i <= 8) {
	    class89_sub2_1035_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass89_Sub2Array9200[i - 1]);
	    class89_sub2_1034_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass89_Sub2Array9223[i - 1]);
	    bool_1033_ = true;
	} else
	    class89_sub2_1034_ = class89_sub2_1035_
		= new Class89_Sub2(((Class89_Sub2) this).aClass103_Sub1_9457);
	return method15533(class89_sub2_1034_, class89_sub2_1035_, i_1032_,
			   bool_1033_, bool);
    }
    
    public Class89 method1923(byte i, int i_1036_, boolean bool) {
	boolean bool_1037_ = false;
	Class89_Sub2 class89_sub2_1038_;
	Class89_Sub2 class89_sub2_1039_;
	if (i > 0 && i <= 8) {
	    class89_sub2_1039_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass89_Sub2Array9200[i - 1]);
	    class89_sub2_1038_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass89_Sub2Array9223[i - 1]);
	    bool_1037_ = true;
	} else
	    class89_sub2_1038_ = class89_sub2_1039_
		= new Class89_Sub2(((Class89_Sub2) this).aClass103_Sub1_9457);
	return method15533(class89_sub2_1038_, class89_sub2_1039_, i_1036_,
			   bool_1037_, bool);
    }
    
    static byte[] method15545(byte[] is, int i) {
	byte[] is_1040_ = new byte[i];
	System.arraycopy(is, 0, is_1040_, 0, i);
	return is_1040_;
    }
    
    public int method1925() {
	return ((Class89_Sub2) this).anInt9402;
    }
    
    public int method1926() {
	return ((Class89_Sub2) this).anInt9402;
    }
    
    public int method1971() {
	return ((Class89_Sub2) this).anInt9402;
    }
    
    public void method1961(int i) {
	int i_1041_ = Class282.anIntArray4430[i];
	int i_1042_ = Class282.anIntArray4441[i];
	for (int i_1043_ = 0; i_1043_ < ((Class89_Sub2) this).anInt9410;
	     i_1043_++) {
	    int i_1044_
		= ((((Class89_Sub2) this).anIntArray9413[i_1043_] * i_1041_
		    + ((Class89_Sub2) this).anIntArray9411[i_1043_] * i_1042_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9413[i_1043_]
		= ((((Class89_Sub2) this).anIntArray9413[i_1043_] * i_1042_
		    - ((Class89_Sub2) this).anIntArray9411[i_1043_] * i_1041_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9411[i_1043_] = i_1044_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1929(int i) {
	((Class89_Sub2) this).anInt9402 = i;
	if (((Class89_Sub2) this).aClass178_9456 != null
	    && (((Class89_Sub2) this).anInt9402 & 0x10000) == 0) {
	    ((Class89_Sub2) this).aShortArray9417
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aShortArray2129);
	    ((Class89_Sub2) this).aShortArray9418
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aShortArray2127);
	    ((Class89_Sub2) this).aShortArray9419
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aShortArray2126);
	    ((Class89_Sub2) this).aByteArray9420
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aByteArray2128);
	    ((Class89_Sub2) this).aClass178_9456 = null;
	}
	((Class89_Sub2) this).aBool9431 = true;
	method15544();
    }
    
    public void method1930(int i) {
	((Class89_Sub2) this).anInt9402 = i;
	if (((Class89_Sub2) this).aClass178_9456 != null
	    && (((Class89_Sub2) this).anInt9402 & 0x10000) == 0) {
	    ((Class89_Sub2) this).aShortArray9417
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aShortArray2129);
	    ((Class89_Sub2) this).aShortArray9418
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aShortArray2127);
	    ((Class89_Sub2) this).aShortArray9419
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aShortArray2126);
	    ((Class89_Sub2) this).aByteArray9420
		= (((Class178) ((Class89_Sub2) this).aClass178_9456)
		   .aByteArray2128);
	    ((Class89_Sub2) this).aClass178_9456 = null;
	}
	((Class89_Sub2) this).aBool9431 = true;
	method15544();
    }
    
    public void method2042(int i, int i_1045_, Class166 class166,
			   Class166 class166_1046_, int i_1047_, int i_1048_,
			   int i_1049_) {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i_1050_ = i_1047_ + ((Class89_Sub2) this).aShort9447;
	int i_1051_ = i_1047_ + ((Class89_Sub2) this).aShort9448;
	int i_1052_ = i_1049_ + ((Class89_Sub2) this).aShort9449;
	int i_1053_ = i_1049_ + ((Class89_Sub2) this).aShort9450;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1050_ >= 0
		&& ((i_1051_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2055 * 266270313)
		&& i_1052_ >= 0
		&& ((i_1053_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2052 * -14610189))) {
	    if (i == 4 || i == 5) {
		if (class166_1046_ == null
		    || (i_1050_ < 0
			|| ((i_1051_ + class166_1046_.anInt2053 * 2039042417
			     >> class166_1046_.anInt2054 * -122333825)
			    >= class166_1046_.anInt2055 * 266270313)
			|| i_1052_ < 0
			|| ((i_1053_ + class166_1046_.anInt2053 * 2039042417
			     >> class166_1046_.anInt2054 * -122333825)
			    >= class166_1046_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_1050_ >>= class166.anInt2054 * -122333825;
		i_1051_ = (i_1051_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_1052_ >>= class166.anInt2054 * -122333825;
		i_1053_ = (i_1053_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if (class166.method3551(i_1050_, i_1052_, 741422471) == i_1048_
		    && (class166.method3551(i_1051_, i_1052_, -856421671)
			== i_1048_)
		    && (class166.method3551(i_1050_, i_1053_, -1930120569)
			== i_1048_)
		    && (class166.method3551(i_1051_, i_1053_, 27029601)
			== i_1048_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1054_ = 0;
		     i_1054_ < ((Class89_Sub2) this).anInt9410; i_1054_++)
		    ((Class89_Sub2) this).anIntArray9412[i_1054_]
			= (((Class89_Sub2) this).anIntArray9412[i_1054_]
			   + class166.method3550(((((Class89_Sub2) this)
						   .anIntArray9411[i_1054_])
						  + i_1047_),
						 ((((Class89_Sub2) this)
						   .anIntArray9413[i_1054_])
						  + i_1049_),
						 -933235378)
			   - i_1048_);
	    } else if (i == 2) {
		int i_1055_ = ((Class89_Sub2) this).aShort9403;
		if (i_1055_ == 0)
		    return;
		for (int i_1056_ = 0;
		     i_1056_ < ((Class89_Sub2) this).anInt9410; i_1056_++) {
		    int i_1057_
			= ((((Class89_Sub2) this).anIntArray9412[i_1056_]
			    << 16)
			   / i_1055_);
		    if (i_1057_ < i_1045_)
			((Class89_Sub2) this).anIntArray9412[i_1056_]
			    = (((Class89_Sub2) this).anIntArray9412[i_1056_]
			       + (class166.method3550((((Class89_Sub2) this)
						       .anIntArray9411
						       [i_1056_]) + i_1047_,
						      (((Class89_Sub2) this)
						       .anIntArray9413
						       [i_1056_]) + i_1049_,
						      -2015685718)
				  - i_1048_) * (i_1045_ - i_1057_) / i_1045_);
		}
	    } else if (i == 3) {
		int i_1058_ = (i_1045_ & 0xff) * 4;
		int i_1059_ = (i_1045_ >> 8 & 0xff) * 4;
		int i_1060_ = (i_1045_ >> 16 & 0xff) << 6;
		int i_1061_ = (i_1045_ >> 24 & 0xff) << 6;
		if (i_1047_ - (i_1058_ >> 1) < 0
		    || ((i_1047_ + (i_1058_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2055 * 266270313
			    << class166.anInt2054 * -122333825))
		    || i_1049_ - (i_1059_ >> 1) < 0
		    || ((i_1049_ + (i_1059_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2052 * -14610189
			    << class166.anInt2054 * -122333825)))
		    return;
		method2041(class166, i_1047_, i_1048_, i_1049_, i_1058_,
			   i_1059_, i_1060_, i_1061_);
	    } else if (i == 4) {
		int i_1062_ = (((Class89_Sub2) this).aShort9446
			       - ((Class89_Sub2) this).aShort9403);
		for (int i_1063_ = 0;
		     i_1063_ < ((Class89_Sub2) this).anInt9410; i_1063_++)
		    ((Class89_Sub2) this).anIntArray9412[i_1063_]
			= (((Class89_Sub2) this).anIntArray9412[i_1063_]
			   + (class166_1046_.method3550((((Class89_Sub2) this)
							 .anIntArray9411
							 [i_1063_]) + i_1047_,
							(((Class89_Sub2) this)
							 .anIntArray9413
							 [i_1063_]) + i_1049_,
							-1185044086)
			      - i_1048_)
			   + i_1062_);
	    } else if (i == 5) {
		int i_1064_ = (((Class89_Sub2) this).aShort9446
			       - ((Class89_Sub2) this).aShort9403);
		for (int i_1065_ = 0;
		     i_1065_ < ((Class89_Sub2) this).anInt9410; i_1065_++) {
		    int i_1066_
			= (((Class89_Sub2) this).anIntArray9411[i_1065_]
			   + i_1047_);
		    int i_1067_
			= (((Class89_Sub2) this).anIntArray9413[i_1065_]
			   + i_1049_);
		    int i_1068_
			= class166.method3550(i_1066_, i_1067_, 357496553);
		    int i_1069_ = class166_1046_.method3550(i_1066_, i_1067_,
							    -402000359);
		    int i_1070_ = i_1068_ - i_1069_ - i_1045_;
		    ((Class89_Sub2) this).anIntArray9412[i_1065_]
			= ((((Class89_Sub2) this).anIntArray9412[i_1065_]
			    << 8) / i_1064_ * i_1070_
			   >> 8) - (i_1048_ - i_1068_);
		}
	    }
	    if (((Class89_Sub2) this).aClass151_9434 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9434)
		    .anInterface8_1713
		    = null;
	    ((Class89_Sub2) this).aBool9444 = false;
	}
    }
    
    public void method1857(Class266 class266, int i, boolean bool) {
	if (((Class89_Sub2) this).aShortArray9465 != null) {
	    Class266 class266_1071_ = class266;
	    if (bool) {
		class266_1071_
		    = ((Class103_Sub1) (((Class89_Sub2) this)
					.aClass103_Sub1_9457)).aClass266_9073;
		class266_1071_.method5153(class266);
	    }
	    float[] fs = new float[3];
	    for (int i_1072_ = 0; i_1072_ < ((Class89_Sub2) this).anInt9410;
		 i_1072_++) {
		if ((i & ((Class89_Sub2) this).aShortArray9465[i_1072_])
		    != 0) {
		    class266_1071_.method5119
			((float) ((Class89_Sub2) this).anIntArray9411[i_1072_],
			 (float) ((Class89_Sub2) this).anIntArray9412[i_1072_],
			 (float) ((Class89_Sub2) this).anIntArray9413[i_1072_],
			 fs);
		    ((Class89_Sub2) this).anIntArray9411[i_1072_]
			= (int) fs[0];
		    ((Class89_Sub2) this).anIntArray9412[i_1072_]
			= (int) fs[1];
		    ((Class89_Sub2) this).anIntArray9413[i_1072_]
			= (int) fs[2];
		}
	    }
	}
    }
    
    public void method1933(int i) {
	int i_1073_ = Class282.anIntArray4430[i];
	int i_1074_ = Class282.anIntArray4441[i];
	for (int i_1075_ = 0; i_1075_ < ((Class89_Sub2) this).anInt9410;
	     i_1075_++) {
	    int i_1076_
		= ((((Class89_Sub2) this).anIntArray9413[i_1075_] * i_1073_
		    + ((Class89_Sub2) this).anIntArray9411[i_1075_] * i_1074_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9413[i_1075_]
		= ((((Class89_Sub2) this).anIntArray9413[i_1075_] * i_1074_
		    - ((Class89_Sub2) this).anIntArray9411[i_1075_] * i_1073_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9411[i_1075_] = i_1076_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1934(int i) {
	int i_1077_ = Class282.anIntArray4430[i];
	int i_1078_ = Class282.anIntArray4441[i];
	for (int i_1079_ = 0; i_1079_ < ((Class89_Sub2) this).anInt9410;
	     i_1079_++) {
	    int i_1080_
		= ((((Class89_Sub2) this).anIntArray9413[i_1079_] * i_1077_
		    + ((Class89_Sub2) this).anIntArray9411[i_1079_] * i_1078_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9413[i_1079_]
		= ((((Class89_Sub2) this).anIntArray9413[i_1079_] * i_1078_
		    - ((Class89_Sub2) this).anIntArray9411[i_1079_] * i_1077_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9411[i_1079_] = i_1080_;
	}
	for (int i_1081_ = 0; i_1081_ < ((Class89_Sub2) this).anInt9416;
	     i_1081_++) {
	    int i_1082_
		= ((((Class89_Sub2) this).aShortArray9419[i_1081_] * i_1077_
		    + ((Class89_Sub2) this).aShortArray9417[i_1081_] * i_1078_)
		   >> 14);
	    ((Class89_Sub2) this).aShortArray9419[i_1081_]
		= (short) (((((Class89_Sub2) this).aShortArray9419[i_1081_]
			     * i_1078_)
			    - (((Class89_Sub2) this).aShortArray9417[i_1081_]
			       * i_1077_))
			   >> 14);
	    ((Class89_Sub2) this).aShortArray9417[i_1081_] = (short) i_1082_;
	}
	if (((Class89_Sub2) this).aClass151_9436 == null
	    && ((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9436 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9436).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1935(int i) {
	int i_1083_ = Class282.anIntArray4430[i];
	int i_1084_ = Class282.anIntArray4441[i];
	for (int i_1085_ = 0; i_1085_ < ((Class89_Sub2) this).anInt9410;
	     i_1085_++) {
	    int i_1086_
		= ((((Class89_Sub2) this).anIntArray9412[i_1085_] * i_1084_
		    - ((Class89_Sub2) this).anIntArray9413[i_1085_] * i_1083_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9413[i_1085_]
		= ((((Class89_Sub2) this).anIntArray9412[i_1085_] * i_1083_
		    + ((Class89_Sub2) this).anIntArray9413[i_1085_] * i_1084_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9412[i_1085_] = i_1086_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1936(int i) {
	int i_1087_ = Class282.anIntArray4430[i];
	int i_1088_ = Class282.anIntArray4441[i];
	for (int i_1089_ = 0; i_1089_ < ((Class89_Sub2) this).anInt9410;
	     i_1089_++) {
	    int i_1090_
		= ((((Class89_Sub2) this).anIntArray9412[i_1089_] * i_1088_
		    - ((Class89_Sub2) this).anIntArray9413[i_1089_] * i_1087_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9413[i_1089_]
		= ((((Class89_Sub2) this).anIntArray9412[i_1089_] * i_1087_
		    + ((Class89_Sub2) this).anIntArray9413[i_1089_] * i_1088_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9412[i_1089_] = i_1090_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public boolean method1968() {
	return ((Class89_Sub2) this).aBool9452;
    }
    
    public void method1938(int i) {
	int i_1091_ = Class282.anIntArray4430[i];
	int i_1092_ = Class282.anIntArray4441[i];
	for (int i_1093_ = 0; i_1093_ < ((Class89_Sub2) this).anInt9410;
	     i_1093_++) {
	    int i_1094_
		= ((((Class89_Sub2) this).anIntArray9412[i_1093_] * i_1091_
		    + ((Class89_Sub2) this).anIntArray9411[i_1093_] * i_1092_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9412[i_1093_]
		= ((((Class89_Sub2) this).anIntArray9412[i_1093_] * i_1092_
		    - ((Class89_Sub2) this).anIntArray9411[i_1093_] * i_1091_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9411[i_1093_] = i_1094_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1939(int i, int i_1095_, int i_1096_) {
	for (int i_1097_ = 0; i_1097_ < ((Class89_Sub2) this).anInt9410;
	     i_1097_++) {
	    if (i != 0)
		((Class89_Sub2) this).anIntArray9411[i_1097_] += i;
	    if (i_1095_ != 0)
		((Class89_Sub2) this).anIntArray9412[i_1097_] += i_1095_;
	    if (i_1096_ != 0)
		((Class89_Sub2) this).anIntArray9413[i_1097_] += i_1096_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public int method1979() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).anInt9443;
    }
    
    public void method1941(int i, int i_1098_, int i_1099_) {
	for (int i_1100_ = 0; i_1100_ < ((Class89_Sub2) this).anInt9410;
	     i_1100_++) {
	    if (i != 0)
		((Class89_Sub2) this).anIntArray9411[i_1100_] += i;
	    if (i_1098_ != 0)
		((Class89_Sub2) this).anIntArray9412[i_1100_] += i_1098_;
	    if (i_1099_ != 0)
		((Class89_Sub2) this).anIntArray9413[i_1100_] += i_1099_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public int method1900() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).anInt9443;
    }
    
    public void method1910() {
	for (int i = 0; i < ((Class89_Sub2) this).anInt9410; i++)
	    ((Class89_Sub2) this).anIntArray9413[i]
		= -((Class89_Sub2) this).anIntArray9413[i];
	for (int i = 0; i < ((Class89_Sub2) this).anInt9416; i++)
	    ((Class89_Sub2) this).aShortArray9419[i]
		= (short) -((Class89_Sub2) this).aShortArray9419[i];
	for (int i = 0; i < ((Class89_Sub2) this).anInt9424; i++) {
	    short i_1101_ = ((Class89_Sub2) this).aShortArray9428[i];
	    ((Class89_Sub2) this).aShortArray9428[i]
		= ((Class89_Sub2) this).aShortArray9407[i];
	    ((Class89_Sub2) this).aShortArray9407[i] = i_1101_;
	}
	if (((Class89_Sub2) this).aClass151_9436 == null
	    && ((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9436 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9436).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass146_9438 != null)
	    ((Class146) ((Class89_Sub2) this).aClass146_9438)
		.anInterface14_1692
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method2024(int i, int i_1102_, int i_1103_) {
	for (int i_1104_ = 0; i_1104_ < ((Class89_Sub2) this).anInt9410;
	     i_1104_++) {
	    if (i != 128)
		((Class89_Sub2) this).anIntArray9411[i_1104_]
		    = ((Class89_Sub2) this).anIntArray9411[i_1104_] * i >> 7;
	    if (i_1102_ != 128)
		((Class89_Sub2) this).anIntArray9412[i_1104_]
		    = (((Class89_Sub2) this).anIntArray9412[i_1104_] * i_1102_
		       >> 7);
	    if (i_1103_ != 128)
		((Class89_Sub2) this).anIntArray9413[i_1104_]
		    = (((Class89_Sub2) this).anIntArray9413[i_1104_] * i_1103_
		       >> 7);
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1945(int i, int i_1105_, int i_1106_) {
	for (int i_1107_ = 0; i_1107_ < ((Class89_Sub2) this).anInt9410;
	     i_1107_++) {
	    if (i != 128)
		((Class89_Sub2) this).anIntArray9411[i_1107_]
		    = ((Class89_Sub2) this).anIntArray9411[i_1107_] * i >> 7;
	    if (i_1105_ != 128)
		((Class89_Sub2) this).anIntArray9412[i_1107_]
		    = (((Class89_Sub2) this).anIntArray9412[i_1107_] * i_1105_
		       >> 7);
	    if (i_1106_ != 128)
		((Class89_Sub2) this).anIntArray9413[i_1107_]
		    = (((Class89_Sub2) this).anIntArray9413[i_1107_] * i_1106_
		       >> 7);
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public Class241_Sub39_Sub17 method2038
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	if (((Class89_Sub2) this).anInt9416 == 0)
	    return null;
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i;
	int i_1108_;
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .anInt9181)
	    > 0) {
	    i = ((((Class89_Sub2) this).aShort9447
		  - ((((Class89_Sub2) this).aShort9446
		      * ((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9181)
		     >> 8))
		 >> ((Class103_Sub1)
		     ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1108_
		= ((((Class89_Sub2) this).aShort9448
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9181)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	} else {
	    i = ((((Class89_Sub2) this).aShort9447
		  - ((((Class89_Sub2) this).aShort9403
		      * ((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9181)
		     >> 8))
		 >> ((Class103_Sub1)
		     ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1108_
		= ((((Class89_Sub2) this).aShort9448
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9181)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	}
	int i_1109_;
	int i_1110_;
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .anInt9169)
	    > 0) {
	    i_1109_
		= ((((Class89_Sub2) this).aShort9449
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1110_
		= ((((Class89_Sub2) this).aShort9450
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	} else {
	    i_1109_
		= ((((Class89_Sub2) this).aShort9449
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1110_
		= ((((Class89_Sub2) this).aShort9450
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	}
	int i_1111_ = i_1108_ - i + 1;
	int i_1112_ = i_1110_ - i_1109_ + 1;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2_1113_;
	if (class241_sub39_sub17_sub2 != null
	    && class241_sub39_sub17_sub2.method17912(i_1111_, i_1112_)) {
	    class241_sub39_sub17_sub2_1113_ = class241_sub39_sub17_sub2;
	    class241_sub39_sub17_sub2_1113_.method17913();
	} else
	    class241_sub39_sub17_sub2_1113_
		= new Class241_Sub39_Sub17_Sub2((((Class89_Sub2) this)
						 .aClass103_Sub1_9457),
						i_1111_, i_1112_);
	class241_sub39_sub17_sub2_1113_.method17911(i, i_1109_, i_1108_,
						    i_1110_);
	method15539(class241_sub39_sub17_sub2_1113_);
	return class241_sub39_sub17_sub2_1113_;
    }
    
    public void method1947(int i, int i_1114_, Class166 class166,
			   Class166 class166_1115_, int i_1116_, int i_1117_,
			   int i_1118_) {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i_1119_ = i_1116_ + ((Class89_Sub2) this).aShort9447;
	int i_1120_ = i_1116_ + ((Class89_Sub2) this).aShort9448;
	int i_1121_ = i_1118_ + ((Class89_Sub2) this).aShort9449;
	int i_1122_ = i_1118_ + ((Class89_Sub2) this).aShort9450;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1119_ >= 0
		&& ((i_1120_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2055 * 266270313)
		&& i_1121_ >= 0
		&& ((i_1122_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2052 * -14610189))) {
	    if (i == 4 || i == 5) {
		if (class166_1115_ == null
		    || (i_1119_ < 0
			|| ((i_1120_ + class166_1115_.anInt2053 * 2039042417
			     >> class166_1115_.anInt2054 * -122333825)
			    >= class166_1115_.anInt2055 * 266270313)
			|| i_1121_ < 0
			|| ((i_1122_ + class166_1115_.anInt2053 * 2039042417
			     >> class166_1115_.anInt2054 * -122333825)
			    >= class166_1115_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_1119_ >>= class166.anInt2054 * -122333825;
		i_1120_ = (i_1120_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_1121_ >>= class166.anInt2054 * -122333825;
		i_1122_ = (i_1122_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if ((class166.method3551(i_1119_, i_1121_, -1870761085)
		     == i_1117_)
		    && (class166.method3551(i_1120_, i_1121_, -1529474393)
			== i_1117_)
		    && (class166.method3551(i_1119_, i_1122_, -816976264)
			== i_1117_)
		    && (class166.method3551(i_1120_, i_1122_, -40271858)
			== i_1117_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1123_ = 0;
		     i_1123_ < ((Class89_Sub2) this).anInt9410; i_1123_++)
		    ((Class89_Sub2) this).anIntArray9412[i_1123_]
			= (((Class89_Sub2) this).anIntArray9412[i_1123_]
			   + class166.method3550(((((Class89_Sub2) this)
						   .anIntArray9411[i_1123_])
						  + i_1116_),
						 ((((Class89_Sub2) this)
						   .anIntArray9413[i_1123_])
						  + i_1118_),
						 -155380073)
			   - i_1117_);
	    } else if (i == 2) {
		int i_1124_ = ((Class89_Sub2) this).aShort9403;
		if (i_1124_ == 0)
		    return;
		for (int i_1125_ = 0;
		     i_1125_ < ((Class89_Sub2) this).anInt9410; i_1125_++) {
		    int i_1126_
			= ((((Class89_Sub2) this).anIntArray9412[i_1125_]
			    << 16)
			   / i_1124_);
		    if (i_1126_ < i_1114_)
			((Class89_Sub2) this).anIntArray9412[i_1125_]
			    = (((Class89_Sub2) this).anIntArray9412[i_1125_]
			       + (class166.method3550((((Class89_Sub2) this)
						       .anIntArray9411
						       [i_1125_]) + i_1116_,
						      (((Class89_Sub2) this)
						       .anIntArray9413
						       [i_1125_]) + i_1118_,
						      -1833169916)
				  - i_1117_) * (i_1114_ - i_1126_) / i_1114_);
		}
	    } else if (i == 3) {
		int i_1127_ = (i_1114_ & 0xff) * 4;
		int i_1128_ = (i_1114_ >> 8 & 0xff) * 4;
		int i_1129_ = (i_1114_ >> 16 & 0xff) << 6;
		int i_1130_ = (i_1114_ >> 24 & 0xff) << 6;
		if (i_1116_ - (i_1127_ >> 1) < 0
		    || ((i_1116_ + (i_1127_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2055 * 266270313
			    << class166.anInt2054 * -122333825))
		    || i_1118_ - (i_1128_ >> 1) < 0
		    || ((i_1118_ + (i_1128_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2052 * -14610189
			    << class166.anInt2054 * -122333825)))
		    return;
		method2041(class166, i_1116_, i_1117_, i_1118_, i_1127_,
			   i_1128_, i_1129_, i_1130_);
	    } else if (i == 4) {
		int i_1131_ = (((Class89_Sub2) this).aShort9446
			       - ((Class89_Sub2) this).aShort9403);
		for (int i_1132_ = 0;
		     i_1132_ < ((Class89_Sub2) this).anInt9410; i_1132_++)
		    ((Class89_Sub2) this).anIntArray9412[i_1132_]
			= (((Class89_Sub2) this).anIntArray9412[i_1132_]
			   + (class166_1115_.method3550((((Class89_Sub2) this)
							 .anIntArray9411
							 [i_1132_]) + i_1116_,
							(((Class89_Sub2) this)
							 .anIntArray9413
							 [i_1132_]) + i_1118_,
							-450189337)
			      - i_1117_)
			   + i_1131_);
	    } else if (i == 5) {
		int i_1133_ = (((Class89_Sub2) this).aShort9446
			       - ((Class89_Sub2) this).aShort9403);
		for (int i_1134_ = 0;
		     i_1134_ < ((Class89_Sub2) this).anInt9410; i_1134_++) {
		    int i_1135_
			= (((Class89_Sub2) this).anIntArray9411[i_1134_]
			   + i_1116_);
		    int i_1136_
			= (((Class89_Sub2) this).anIntArray9413[i_1134_]
			   + i_1118_);
		    int i_1137_
			= class166.method3550(i_1135_, i_1136_, -165718010);
		    int i_1138_ = class166_1115_.method3550(i_1135_, i_1136_,
							    -1993880576);
		    int i_1139_ = i_1137_ - i_1138_ - i_1114_;
		    ((Class89_Sub2) this).anIntArray9412[i_1134_]
			= ((((Class89_Sub2) this).anIntArray9412[i_1134_]
			    << 8) / i_1133_ * i_1139_
			   >> 8) - (i_1117_ - i_1137_);
		}
	    }
	    if (((Class89_Sub2) this).aClass151_9434 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9434)
		    .anInterface8_1713
		    = null;
	    ((Class89_Sub2) this).aBool9444 = false;
	}
    }
    
    public Class241_Sub39_Sub17 method1904
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	if (((Class89_Sub2) this).anInt9416 == 0)
	    return null;
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i;
	int i_1140_;
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .anInt9181)
	    > 0) {
	    i = ((((Class89_Sub2) this).aShort9447
		  - ((((Class89_Sub2) this).aShort9446
		      * ((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9181)
		     >> 8))
		 >> ((Class103_Sub1)
		     ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1140_
		= ((((Class89_Sub2) this).aShort9448
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9181)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	} else {
	    i = ((((Class89_Sub2) this).aShort9447
		  - ((((Class89_Sub2) this).aShort9403
		      * ((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9181)
		     >> 8))
		 >> ((Class103_Sub1)
		     ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1140_
		= ((((Class89_Sub2) this).aShort9448
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9181)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	}
	int i_1141_;
	int i_1142_;
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .anInt9169)
	    > 0) {
	    i_1141_
		= ((((Class89_Sub2) this).aShort9449
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1142_
		= ((((Class89_Sub2) this).aShort9450
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	} else {
	    i_1141_
		= ((((Class89_Sub2) this).aShort9449
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1142_
		= ((((Class89_Sub2) this).aShort9450
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	}
	int i_1143_ = i_1140_ - i + 1;
	int i_1144_ = i_1142_ - i_1141_ + 1;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2_1145_;
	if (class241_sub39_sub17_sub2 != null
	    && class241_sub39_sub17_sub2.method17912(i_1143_, i_1144_)) {
	    class241_sub39_sub17_sub2_1145_ = class241_sub39_sub17_sub2;
	    class241_sub39_sub17_sub2_1145_.method17913();
	} else
	    class241_sub39_sub17_sub2_1145_
		= new Class241_Sub39_Sub17_Sub2((((Class89_Sub2) this)
						 .aClass103_Sub1_9457),
						i_1143_, i_1144_);
	class241_sub39_sub17_sub2_1145_.method17911(i, i_1141_, i_1140_,
						    i_1142_);
	method15539(class241_sub39_sub17_sub2_1145_);
	return class241_sub39_sub17_sub2_1145_;
    }
    
    public void method1960(int i, int i_1146_, Class166 class166,
			   Class166 class166_1147_, int i_1148_, int i_1149_,
			   int i_1150_) {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i_1151_ = i_1148_ + ((Class89_Sub2) this).aShort9447;
	int i_1152_ = i_1148_ + ((Class89_Sub2) this).aShort9448;
	int i_1153_ = i_1150_ + ((Class89_Sub2) this).aShort9449;
	int i_1154_ = i_1150_ + ((Class89_Sub2) this).aShort9450;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1151_ >= 0
		&& ((i_1152_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2055 * 266270313)
		&& i_1153_ >= 0
		&& ((i_1154_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2052 * -14610189))) {
	    if (i == 4 || i == 5) {
		if (class166_1147_ == null
		    || (i_1151_ < 0
			|| ((i_1152_ + class166_1147_.anInt2053 * 2039042417
			     >> class166_1147_.anInt2054 * -122333825)
			    >= class166_1147_.anInt2055 * 266270313)
			|| i_1153_ < 0
			|| ((i_1154_ + class166_1147_.anInt2053 * 2039042417
			     >> class166_1147_.anInt2054 * -122333825)
			    >= class166_1147_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_1151_ >>= class166.anInt2054 * -122333825;
		i_1152_ = (i_1152_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_1153_ >>= class166.anInt2054 * -122333825;
		i_1154_ = (i_1154_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if ((class166.method3551(i_1151_, i_1153_, -1550844102)
		     == i_1149_)
		    && (class166.method3551(i_1152_, i_1153_, 888143051)
			== i_1149_)
		    && (class166.method3551(i_1151_, i_1154_, -911365928)
			== i_1149_)
		    && (class166.method3551(i_1152_, i_1154_, 468726688)
			== i_1149_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1155_ = 0;
		     i_1155_ < ((Class89_Sub2) this).anInt9410; i_1155_++)
		    ((Class89_Sub2) this).anIntArray9412[i_1155_]
			= (((Class89_Sub2) this).anIntArray9412[i_1155_]
			   + class166.method3550(((((Class89_Sub2) this)
						   .anIntArray9411[i_1155_])
						  + i_1148_),
						 ((((Class89_Sub2) this)
						   .anIntArray9413[i_1155_])
						  + i_1150_),
						 -1743789853)
			   - i_1149_);
	    } else if (i == 2) {
		int i_1156_ = ((Class89_Sub2) this).aShort9403;
		if (i_1156_ == 0)
		    return;
		for (int i_1157_ = 0;
		     i_1157_ < ((Class89_Sub2) this).anInt9410; i_1157_++) {
		    int i_1158_
			= ((((Class89_Sub2) this).anIntArray9412[i_1157_]
			    << 16)
			   / i_1156_);
		    if (i_1158_ < i_1146_)
			((Class89_Sub2) this).anIntArray9412[i_1157_]
			    = (((Class89_Sub2) this).anIntArray9412[i_1157_]
			       + (class166.method3550((((Class89_Sub2) this)
						       .anIntArray9411
						       [i_1157_]) + i_1148_,
						      (((Class89_Sub2) this)
						       .anIntArray9413
						       [i_1157_]) + i_1150_,
						      -522314380)
				  - i_1149_) * (i_1146_ - i_1158_) / i_1146_);
		}
	    } else if (i == 3) {
		int i_1159_ = (i_1146_ & 0xff) * 4;
		int i_1160_ = (i_1146_ >> 8 & 0xff) * 4;
		int i_1161_ = (i_1146_ >> 16 & 0xff) << 6;
		int i_1162_ = (i_1146_ >> 24 & 0xff) << 6;
		if (i_1148_ - (i_1159_ >> 1) < 0
		    || ((i_1148_ + (i_1159_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2055 * 266270313
			    << class166.anInt2054 * -122333825))
		    || i_1150_ - (i_1160_ >> 1) < 0
		    || ((i_1150_ + (i_1160_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2052 * -14610189
			    << class166.anInt2054 * -122333825)))
		    return;
		method2041(class166, i_1148_, i_1149_, i_1150_, i_1159_,
			   i_1160_, i_1161_, i_1162_);
	    } else if (i == 4) {
		int i_1163_ = (((Class89_Sub2) this).aShort9446
			       - ((Class89_Sub2) this).aShort9403);
		for (int i_1164_ = 0;
		     i_1164_ < ((Class89_Sub2) this).anInt9410; i_1164_++)
		    ((Class89_Sub2) this).anIntArray9412[i_1164_]
			= (((Class89_Sub2) this).anIntArray9412[i_1164_]
			   + (class166_1147_.method3550((((Class89_Sub2) this)
							 .anIntArray9411
							 [i_1164_]) + i_1148_,
							(((Class89_Sub2) this)
							 .anIntArray9413
							 [i_1164_]) + i_1150_,
							-1634134575)
			      - i_1149_)
			   + i_1163_);
	    } else if (i == 5) {
		int i_1165_ = (((Class89_Sub2) this).aShort9446
			       - ((Class89_Sub2) this).aShort9403);
		for (int i_1166_ = 0;
		     i_1166_ < ((Class89_Sub2) this).anInt9410; i_1166_++) {
		    int i_1167_
			= (((Class89_Sub2) this).anIntArray9411[i_1166_]
			   + i_1148_);
		    int i_1168_
			= (((Class89_Sub2) this).anIntArray9413[i_1166_]
			   + i_1150_);
		    int i_1169_
			= class166.method3550(i_1167_, i_1168_, 84564702);
		    int i_1170_ = class166_1147_.method3550(i_1167_, i_1168_,
							    -766310783);
		    int i_1171_ = i_1169_ - i_1170_ - i_1146_;
		    ((Class89_Sub2) this).anIntArray9412[i_1166_]
			= ((((Class89_Sub2) this).anIntArray9412[i_1166_]
			    << 8) / i_1165_ * i_1171_
			   >> 8) - (i_1149_ - i_1169_);
		}
	    }
	    if (((Class89_Sub2) this).aClass151_9434 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9434)
		    .anInterface8_1713
		    = null;
	    ((Class89_Sub2) this).aBool9444 = false;
	}
    }
    
    public void method1870(int i) {
	int i_1172_ = Class282.anIntArray4430[i];
	int i_1173_ = Class282.anIntArray4441[i];
	for (int i_1174_ = 0; i_1174_ < ((Class89_Sub2) this).anInt9410;
	     i_1174_++) {
	    int i_1175_
		= ((((Class89_Sub2) this).anIntArray9412[i_1174_] * i_1173_
		    - ((Class89_Sub2) this).anIntArray9413[i_1174_] * i_1172_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9413[i_1174_]
		= ((((Class89_Sub2) this).anIntArray9412[i_1174_] * i_1172_
		    + ((Class89_Sub2) this).anIntArray9413[i_1174_] * i_1173_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9412[i_1174_] = i_1175_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    void method1951() {
	/* empty */
    }
    
    public void method1867() {
	if (((Class89_Sub2) this).anInt9416 > 0
	    && ((Class89_Sub2) this).anInt9441 > 0) {
	    method15541(false);
	    if ((((Class89_Sub2) this).aByte9404 & 0x10) == 0
		&& (((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692) == null)
		method15536(false);
	    method15544();
	}
    }
    
    void method1953() {
	/* empty */
    }
    
    boolean method1954() {
	if (((Class89_Sub2) this).anIntArrayArray9467 == null)
	    return false;
	for (int i = 0; i < ((Class89_Sub2) this).anInt9409; i++) {
	    ((Class89_Sub2) this).anIntArray9411[i] <<= 4;
	    ((Class89_Sub2) this).anIntArray9412[i] <<= 4;
	    ((Class89_Sub2) this).anIntArray9413[i] <<= 4;
	}
	anInt9426 = 0;
	anInt9468 = 0;
	anInt9401 = 0;
	return true;
    }
    
    void method15546(boolean bool) {
	boolean bool_1176_
	    = (((Class89_Sub2) this).aClass151_9433 != null
	       && (((Class151) ((Class89_Sub2) this).aClass151_9433)
		   .anInterface8_1713) == null);
	boolean bool_1177_
	    = (((Class89_Sub2) this).aClass151_9436 != null
	       && (((Class151) ((Class89_Sub2) this).aClass151_9436)
		   .anInterface8_1713) == null);
	boolean bool_1178_
	    = (((Class89_Sub2) this).aClass151_9434 != null
	       && (((Class151) ((Class89_Sub2) this).aClass151_9434)
		   .anInterface8_1713) == null);
	boolean bool_1179_
	    = (((Class89_Sub2) this).aClass151_9437 != null
	       && (((Class151) ((Class89_Sub2) this).aClass151_9437)
		   .anInterface8_1713) == null);
	if (bool) {
	    bool_1176_
		= bool_1176_ & (((Class89_Sub2) this).aByte9404 & 0x2) != 0;
	    bool_1177_
		= bool_1177_ & (((Class89_Sub2) this).aByte9404 & 0x4) != 0;
	    bool_1178_
		= bool_1178_ & (((Class89_Sub2) this).aByte9404 & 0x1) != 0;
	    bool_1179_
		= bool_1179_ & (((Class89_Sub2) this).aByte9404 & 0x8) != 0;
	}
	byte i = 0;
	byte i_1180_ = 0;
	byte i_1181_ = 0;
	byte i_1182_ = 0;
	byte i_1183_ = 0;
	if (bool_1178_) {
	    i_1180_ = i;
	    i += 12;
	}
	if (bool_1176_) {
	    i_1181_ = i;
	    i += 4;
	}
	if (bool_1177_) {
	    i_1182_ = i;
	    i += 12;
	}
	if (bool_1179_) {
	    i_1183_ = i;
	    i += 8;
	}
	if (i != 0) {
	    if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		 .aClass241_Sub3_Sub2_9231.payload).length
		< ((Class89_Sub2) this).anInt9416 * i)
		((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .aClass241_Sub3_Sub2_9231
		    = new Class241_Sub3_Sub2((((Class89_Sub2) this).anInt9416
					      + 100) * i);
	    else
		((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .aClass241_Sub3_Sub2_9231.pointer
		    = 0;
	    Class241_Sub3_Sub2 class241_sub3_sub2
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass241_Sub3_Sub2_9231);
	    if (bool_1178_) {
		if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .aBool9144) {
		    for (int i_1184_ = 0;
			 i_1184_ < ((Class89_Sub2) this).anInt9410;
			 i_1184_++) {
			int i_1185_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9411
							       [i_1184_]);
			int i_1186_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9412
							       [i_1184_]);
			int i_1187_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9413
							       [i_1184_]);
			int i_1188_
			    = ((Class89_Sub2) this).anIntArray9395[i_1184_];
			int i_1189_ = (((Class89_Sub2) this).anIntArray9395
				       [i_1184_ + 1]);
			for (int i_1190_ = i_1188_;
			     (i_1190_ < i_1189_
			      && (((Class89_Sub2) this).aShortArray9455
				  [i_1190_]) != 0);
			     i_1190_++) {
			    int i_1191_ = (((((Class89_Sub2) this)
					     .aShortArray9455[i_1190_])
					    & 0xffff)
					   - 1);
			    class241_sub3_sub2.pointer
				= i_1191_ * i * -681042949;
			    class241_sub3_sub2.writeInt(i_1185_, 661664341);
			    class241_sub3_sub2.writeInt(i_1186_,
							   -574573464);
			    class241_sub3_sub2.writeInt(i_1187_, 95232135);
			}
		    }
		} else {
		    for (int i_1192_ = 0;
			 i_1192_ < ((Class89_Sub2) this).anInt9410;
			 i_1192_++) {
			int i_1193_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9411
							       [i_1192_]);
			int i_1194_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9412
							       [i_1192_]);
			int i_1195_
			    = Stream.floatToRawIntBits((float) ((Class89_Sub2)
								this)
							       .anIntArray9413
							       [i_1192_]);
			int i_1196_
			    = ((Class89_Sub2) this).anIntArray9395[i_1192_];
			int i_1197_ = (((Class89_Sub2) this).anIntArray9395
				       [i_1192_ + 1]);
			for (int i_1198_ = i_1196_;
			     (i_1198_ < i_1197_
			      && (((Class89_Sub2) this).aShortArray9455
				  [i_1198_]) != 0);
			     i_1198_++) {
			    int i_1199_ = (((((Class89_Sub2) this)
					     .aShortArray9455[i_1198_])
					    & 0xffff)
					   - 1);
			    class241_sub3_sub2.pointer
				= i_1199_ * i * -681042949;
			    class241_sub3_sub2.method14687(i_1193_,
							   2106457547);
			    class241_sub3_sub2.method14687(i_1194_,
							   -721358096);
			    class241_sub3_sub2.method14687(i_1195_,
							   1481973880);
			}
		    }
		}
	    }
	    if (bool_1176_) {
		if (((Class89_Sub2) this).aClass151_9436 == null) {
		    short[] is;
		    short[] is_1200_;
		    short[] is_1201_;
		    byte[] is_1202_;
		    if (((Class89_Sub2) this).aClass178_9456 != null) {
			is = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			      .aShortArray2129);
			is_1200_
			    = ((Class178) (((Class89_Sub2) this)
					   .aClass178_9456)).aShortArray2127;
			is_1201_
			    = ((Class178) (((Class89_Sub2) this)
					   .aClass178_9456)).aShortArray2126;
			is_1202_
			    = ((Class178) (((Class89_Sub2) this)
					   .aClass178_9456)).aByteArray2128;
		    } else {
			is = ((Class89_Sub2) this).aShortArray9417;
			is_1200_ = ((Class89_Sub2) this).aShortArray9418;
			is_1201_ = ((Class89_Sub2) this).aShortArray9419;
			is_1202_ = ((Class89_Sub2) this).aByteArray9420;
		    }
		    float f = (((Class103_Sub1)
				((Class89_Sub2) this).aClass103_Sub1_9457)
			       .aFloatArray9156[0]);
		    float f_1203_ = (((Class103_Sub1) (((Class89_Sub2) this)
						       .aClass103_Sub1_9457))
				     .aFloatArray9156[1]);
		    float f_1204_ = (((Class103_Sub1) (((Class89_Sub2) this)
						       .aClass103_Sub1_9457))
				     .aFloatArray9156[2]);
		    float f_1205_ = (((Class103_Sub1) (((Class89_Sub2) this)
						       .aClass103_Sub1_9457))
				     .aFloat9162);
		    float f_1206_
			= (((Class103_Sub1) (((Class89_Sub2) this)
					     .aClass103_Sub1_9457)).aFloat9153
			   * 768.0F
			   / (float) ((Class89_Sub2) this).aShort9406);
		    float f_1207_
			= (((Class103_Sub1) (((Class89_Sub2) this)
					     .aClass103_Sub1_9457)).aFloat9171
			   * 768.0F
			   / (float) ((Class89_Sub2) this).aShort9406);
		    for (int i_1208_ = 0;
			 i_1208_ < ((Class89_Sub2) this).anInt9424;
			 i_1208_++) {
			int i_1209_
			    = method15542((((Class89_Sub2) this)
					   .aShortArray9442[i_1208_]),
					  (((Class89_Sub2) this)
					   .aShortArray9414[i_1208_]),
					  ((Class89_Sub2) this).aShort9405,
					  (((Class89_Sub2) this).aByteArray9408
					   [i_1208_]));
			float f_1210_
			    = ((float) (i_1209_ >>> 24)
			       * (((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9110));
			float f_1211_
			    = ((float) (i_1209_ >> 16 & 0xff)
			       * (((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9160));
			float f_1212_
			    = ((float) (i_1209_ >> 8 & 0xff)
			       * (((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9203));
			int i_1213_
			    = (((Class89_Sub2) this).aShortArray9428[i_1208_]
			       & 0xffff);
			short i_1214_ = (short) is_1202_[i_1213_];
			float f_1215_;
			if (i_1214_ == 0)
			    f_1215_ = ((f * (float) is[i_1213_]
					+ f_1203_ * (float) is_1200_[i_1213_]
					+ f_1204_ * (float) is_1201_[i_1213_])
				       * 0.0026041667F);
			else
			    f_1215_ = ((f * (float) is[i_1213_]
					+ f_1203_ * (float) is_1200_[i_1213_]
					+ f_1204_ * (float) is_1201_[i_1213_])
				       / (float) (i_1214_ * 256));
			float f_1216_
			    = f_1205_ + f_1215_ * (f_1215_ < 0.0F ? f_1207_
						   : f_1206_);
			int i_1217_ = (int) (f_1210_ * f_1216_);
			if (i_1217_ < 0)
			    i_1217_ = 0;
			else if (i_1217_ > 255)
			    i_1217_ = 255;
			int i_1218_ = (int) (f_1211_ * f_1216_);
			if (i_1218_ < 0)
			    i_1218_ = 0;
			else if (i_1218_ > 255)
			    i_1218_ = 255;
			int i_1219_ = (int) (f_1212_ * f_1216_);
			if (i_1219_ < 0)
			    i_1219_ = 0;
			else if (i_1219_ > 255)
			    i_1219_ = 255;
			class241_sub3_sub2.pointer
			    = (i_1181_ + i_1213_ * i) * -681042949;
			class241_sub3_sub2.writeByte(i_1217_, 505729323);
			class241_sub3_sub2.writeByte(i_1218_, 609615328);
			class241_sub3_sub2.writeByte(i_1219_, -362197054);
			class241_sub3_sub2.writeByte(255 - ((((Class89_Sub2)
								this)
							       .aByteArray9408
							       [i_1208_])
							      & 0xff),
						       1097461531);
			i_1213_
			    = (((Class89_Sub2) this).aShortArray9462[i_1208_]
			       & 0xffff);
			i_1214_ = (short) is_1202_[i_1213_];
			if (i_1214_ == 0)
			    f_1215_ = ((f * (float) is[i_1213_]
					+ f_1203_ * (float) is_1200_[i_1213_]
					+ f_1204_ * (float) is_1201_[i_1213_])
				       * 0.0026041667F);
			else
			    f_1215_ = ((f * (float) is[i_1213_]
					+ f_1203_ * (float) is_1200_[i_1213_]
					+ f_1204_ * (float) is_1201_[i_1213_])
				       / (float) (i_1214_ * 256));
			f_1216_ = f_1205_ + f_1215_ * (f_1215_ < 0.0F ? f_1207_
						       : f_1206_);
			i_1217_ = (int) (f_1210_ * f_1216_);
			if (i_1217_ < 0)
			    i_1217_ = 0;
			else if (i_1217_ > 255)
			    i_1217_ = 255;
			i_1218_ = (int) (f_1211_ * f_1216_);
			if (i_1218_ < 0)
			    i_1218_ = 0;
			else if (i_1218_ > 255)
			    i_1218_ = 255;
			i_1219_ = (int) (f_1212_ * f_1216_);
			if (i_1219_ < 0)
			    i_1219_ = 0;
			else if (i_1219_ > 255)
			    i_1219_ = 255;
			class241_sub3_sub2.pointer
			    = (i_1181_ + i_1213_ * i) * -681042949;
			class241_sub3_sub2.writeByte(i_1217_, -195909380);
			class241_sub3_sub2.writeByte(i_1218_, 568562332);
			class241_sub3_sub2.writeByte(i_1219_, -1861000014);
			class241_sub3_sub2.writeByte(255 - ((((Class89_Sub2)
								this)
							       .aByteArray9408
							       [i_1208_])
							      & 0xff),
						       444257220);
			i_1213_
			    = (((Class89_Sub2) this).aShortArray9407[i_1208_]
			       & 0xffff);
			i_1214_ = (short) is_1202_[i_1213_];
			if (i_1214_ == 0)
			    f_1215_ = ((f * (float) is[i_1213_]
					+ f_1203_ * (float) is_1200_[i_1213_]
					+ f_1204_ * (float) is_1201_[i_1213_])
				       * 0.0026041667F);
			else
			    f_1215_ = ((f * (float) is[i_1213_]
					+ f_1203_ * (float) is_1200_[i_1213_]
					+ f_1204_ * (float) is_1201_[i_1213_])
				       / (float) (i_1214_ * 256));
			f_1216_ = f_1205_ + f_1215_ * (f_1215_ < 0.0F ? f_1207_
						       : f_1206_);
			i_1217_ = (int) (f_1210_ * f_1216_);
			if (i_1217_ < 0)
			    i_1217_ = 0;
			else if (i_1217_ > 255)
			    i_1217_ = 255;
			i_1218_ = (int) (f_1211_ * f_1216_);
			if (i_1218_ < 0)
			    i_1218_ = 0;
			else if (i_1218_ > 255)
			    i_1218_ = 255;
			i_1219_ = (int) (f_1212_ * f_1216_);
			if (i_1219_ < 0)
			    i_1219_ = 0;
			else if (i_1219_ > 255)
			    i_1219_ = 255;
			class241_sub3_sub2.pointer
			    = (i_1181_ + i_1213_ * i) * -681042949;
			class241_sub3_sub2.writeByte(i_1217_, -1941447429);
			class241_sub3_sub2.writeByte(i_1218_, -1938412824);
			class241_sub3_sub2.writeByte(i_1219_, 962458528);
			class241_sub3_sub2.writeByte(255 - ((((Class89_Sub2)
								this)
							       .aByteArray9408
							       [i_1208_])
							      & 0xff),
						       -511199871);
		    }
		} else {
		    for (int i_1220_ = 0;
			 i_1220_ < ((Class89_Sub2) this).anInt9424;
			 i_1220_++) {
			int i_1221_
			    = method15542((((Class89_Sub2) this)
					   .aShortArray9442[i_1220_]),
					  (((Class89_Sub2) this)
					   .aShortArray9414[i_1220_]),
					  ((Class89_Sub2) this).aShort9405,
					  (((Class89_Sub2) this).aByteArray9408
					   [i_1220_]));
			class241_sub3_sub2.pointer
			    = (i_1181_ + ((((Class89_Sub2) this)
					   .aShortArray9428[i_1220_])
					  & 0xffff) * i) * -681042949;
			class241_sub3_sub2.writeInt(i_1221_, 942067805);
			class241_sub3_sub2.pointer
			    = (i_1181_ + ((((Class89_Sub2) this)
					   .aShortArray9462[i_1220_])
					  & 0xffff) * i) * -681042949;
			class241_sub3_sub2.writeInt(i_1221_, 1653678598);
			class241_sub3_sub2.pointer
			    = (i_1181_ + ((((Class89_Sub2) this)
					   .aShortArray9407[i_1220_])
					  & 0xffff) * i) * -681042949;
			class241_sub3_sub2.writeInt(i_1221_, 90587755);
		    }
		}
	    }
	    if (bool_1177_) {
		short[] is;
		short[] is_1222_;
		short[] is_1223_;
		byte[] is_1224_;
		if (((Class89_Sub2) this).aClass178_9456 != null) {
		    is = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			  .aShortArray2129);
		    is_1222_
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2127);
		    is_1223_
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2126);
		    is_1224_
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aByteArray2128);
		} else {
		    is = ((Class89_Sub2) this).aShortArray9417;
		    is_1222_ = ((Class89_Sub2) this).aShortArray9418;
		    is_1223_ = ((Class89_Sub2) this).aShortArray9419;
		    is_1224_ = ((Class89_Sub2) this).aByteArray9420;
		}
		float f = 3.0F / (float) ((Class89_Sub2) this).aShort9406;
		float f_1225_
		    = 3.0F / (float) (((Class89_Sub2) this).aShort9406
				      + ((Class89_Sub2) this).aShort9406 / 2);
		class241_sub3_sub2.pointer = i_1182_ * -681042949;
		if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .aBool9144) {
		    for (int i_1226_ = 0;
			 i_1226_ < ((Class89_Sub2) this).anInt9416;
			 i_1226_++) {
			int i_1227_ = is_1224_[i_1226_] & 0xff;
			if (i_1227_ == 0) {
			    class241_sub3_sub2
				.method17060((float) is[i_1226_] * f_1225_);
			    class241_sub3_sub2.method17060((float) (is_1222_
								    [i_1226_])
							   * f_1225_);
			    class241_sub3_sub2.method17060((float) (is_1223_
								    [i_1226_])
							   * f_1225_);
			} else {
			    float f_1228_ = f / (float) i_1227_;
			    class241_sub3_sub2
				.method17060((float) is[i_1226_] * f_1228_);
			    class241_sub3_sub2.method17060((float) (is_1222_
								    [i_1226_])
							   * f_1228_);
			    class241_sub3_sub2.method17060((float) (is_1223_
								    [i_1226_])
							   * f_1228_);
			}
			class241_sub3_sub2.pointer += (i - 12) * -681042949;
		    }
		} else {
		    for (int i_1229_ = 0;
			 i_1229_ < ((Class89_Sub2) this).anInt9416;
			 i_1229_++) {
			int i_1230_ = is_1224_[i_1229_] & 0xff;
			if (i_1230_ == 0) {
			    class241_sub3_sub2
				.method17064((float) is[i_1229_] * f_1225_);
			    class241_sub3_sub2.method17064((float) (is_1222_
								    [i_1229_])
							   * f_1225_);
			    class241_sub3_sub2.method17064((float) (is_1223_
								    [i_1229_])
							   * f_1225_);
			} else {
			    float f_1231_ = f / (float) i_1230_;
			    class241_sub3_sub2
				.method17064((float) is[i_1229_] * f_1231_);
			    class241_sub3_sub2.method17064((float) (is_1222_
								    [i_1229_])
							   * f_1231_);
			    class241_sub3_sub2.method17064((float) (is_1223_
								    [i_1229_])
							   * f_1231_);
			}
			class241_sub3_sub2.pointer += (i - 12) * -681042949;
		    }
		}
	    }
	    if (bool_1179_) {
		class241_sub3_sub2.pointer = i_1183_ * -681042949;
		if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .aBool9144) {
		    for (int i_1232_ = 0;
			 i_1232_ < ((Class89_Sub2) this).anInt9416;
			 i_1232_++) {
			class241_sub3_sub2.method17060(((Class89_Sub2) this)
						       .aFloatArray9422
						       [i_1232_]);
			class241_sub3_sub2.method17060(((Class89_Sub2) this)
						       .aFloatArray9423
						       [i_1232_]);
			class241_sub3_sub2.pointer += (i - 8) * -681042949;
		    }
		} else {
		    for (int i_1233_ = 0;
			 i_1233_ < ((Class89_Sub2) this).anInt9416;
			 i_1233_++) {
			class241_sub3_sub2.method17064(((Class89_Sub2) this)
						       .aFloatArray9422
						       [i_1233_]);
			class241_sub3_sub2.method17064(((Class89_Sub2) this)
						       .aFloatArray9423
						       [i_1233_]);
			class241_sub3_sub2.pointer += (i - 8) * -681042949;
		    }
		}
	    }
	    class241_sub3_sub2.pointer
		= i * ((Class89_Sub2) this).anInt9416 * -681042949;
	    Interface8 interface8;
	    if (bool) {
		if (((Class89_Sub2) this).anInterface8_9440 == null)
		    ((Class89_Sub2) this).anInterface8_9440
			= (((Class89_Sub2) this).aClass103_Sub1_9457
			       .method15165
			   (i, class241_sub3_sub2.payload,
			    class241_sub3_sub2.pointer * 421967667, true));
		else
		    ((Class89_Sub2) this).anInterface8_9440.method51
			(i, class241_sub3_sub2.payload,
			 class241_sub3_sub2.pointer * 421967667);
		interface8 = ((Class89_Sub2) this).anInterface8_9440;
		((Class89_Sub2) this).aByte9404 = (byte) 0;
	    } else {
		interface8
		    = (((Class89_Sub2) this).aClass103_Sub1_9457.method15165
		       (i, class241_sub3_sub2.payload,
			class241_sub3_sub2.pointer * 421967667, false));
		((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (bool_1178_) {
		((Class151) ((Class89_Sub2) this).aClass151_9434)
		    .anInterface8_1713
		    = interface8;
		((Class151) ((Class89_Sub2) this).aClass151_9434).aByte1712
		    = i_1180_;
	    }
	    if (bool_1179_) {
		((Class151) ((Class89_Sub2) this).aClass151_9437)
		    .anInterface8_1713
		    = interface8;
		((Class151) ((Class89_Sub2) this).aClass151_9437).aByte1712
		    = i_1183_;
	    }
	    if (bool_1176_) {
		((Class151) ((Class89_Sub2) this).aClass151_9433)
		    .anInterface8_1713
		    = interface8;
		((Class151) ((Class89_Sub2) this).aClass151_9433).aByte1712
		    = i_1181_;
	    }
	    if (bool_1177_) {
		((Class151) ((Class89_Sub2) this).aClass151_9436)
		    .anInterface8_1713
		    = interface8;
		((Class151) ((Class89_Sub2) this).aClass151_9436).aByte1712
		    = i_1182_;
	    }
	}
    }
    
    void method2009() {
	for (int i = 0; i < ((Class89_Sub2) this).anInt9409; i++) {
	    ((Class89_Sub2) this).anIntArray9411[i]
		= ((Class89_Sub2) this).anIntArray9411[i] + 7 >> 4;
	    ((Class89_Sub2) this).anIntArray9412[i]
		= ((Class89_Sub2) this).anIntArray9412[i] + 7 >> 4;
	    ((Class89_Sub2) this).anIntArray9413[i]
		= ((Class89_Sub2) this).anIntArray9413[i] + 7 >> 4;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    void method1957() {
	for (int i = 0; i < ((Class89_Sub2) this).anInt9409; i++) {
	    ((Class89_Sub2) this).anIntArray9411[i]
		= ((Class89_Sub2) this).anIntArray9411[i] + 7 >> 4;
	    ((Class89_Sub2) this).anIntArray9412[i]
		= ((Class89_Sub2) this).anIntArray9412[i] + 7 >> 4;
	    ((Class89_Sub2) this).anIntArray9413[i]
		= ((Class89_Sub2) this).anIntArray9413[i] + 7 >> 4;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    void method1958() {
	for (int i = 0; i < ((Class89_Sub2) this).anInt9409; i++) {
	    ((Class89_Sub2) this).anIntArray9411[i]
		= ((Class89_Sub2) this).anIntArray9411[i] + 7 >> 4;
	    ((Class89_Sub2) this).anIntArray9412[i]
		= ((Class89_Sub2) this).anIntArray9412[i] + 7 >> 4;
	    ((Class89_Sub2) this).anIntArray9413[i]
		= ((Class89_Sub2) this).anIntArray9413[i] + 7 >> 4;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1868(int i) {
	int i_1234_ = Class282.anIntArray4430[i];
	int i_1235_ = Class282.anIntArray4441[i];
	for (int i_1236_ = 0; i_1236_ < ((Class89_Sub2) this).anInt9410;
	     i_1236_++) {
	    int i_1237_
		= ((((Class89_Sub2) this).anIntArray9413[i_1236_] * i_1234_
		    + ((Class89_Sub2) this).anIntArray9411[i_1236_] * i_1235_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9413[i_1236_]
		= ((((Class89_Sub2) this).anIntArray9413[i_1236_] * i_1235_
		    - ((Class89_Sub2) this).anIntArray9411[i_1236_] * i_1234_)
		   >> 14);
	    ((Class89_Sub2) this).anIntArray9411[i_1236_] = i_1237_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    void method1916(int i, int[] is, int i_1238_, int i_1239_, int i_1240_,
		    int i_1241_, boolean bool) {
	int i_1242_ = is.length;
	if (i == 0) {
	    i_1238_ <<= 4;
	    i_1239_ <<= 4;
	    i_1240_ <<= 4;
	    int i_1243_ = 0;
	    anInt9426 = 0;
	    anInt9468 = 0;
	    anInt9401 = 0;
	    for (int i_1244_ = 0; i_1244_ < i_1242_; i_1244_++) {
		int i_1245_ = is[i_1244_];
		if (i_1245_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_1246_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_1245_];
		    for (int i_1247_ = 0; i_1247_ < is_1246_.length;
			 i_1247_++) {
			int i_1248_ = is_1246_[i_1247_];
			anInt9426
			    += ((Class89_Sub2) this).anIntArray9411[i_1248_];
			anInt9468
			    += ((Class89_Sub2) this).anIntArray9412[i_1248_];
			anInt9401
			    += ((Class89_Sub2) this).anIntArray9413[i_1248_];
			i_1243_++;
		    }
		}
	    }
	    if (i_1243_ > 0) {
		anInt9426 = anInt9426 / i_1243_ + i_1238_;
		anInt9468 = anInt9468 / i_1243_ + i_1239_;
		anInt9401 = anInt9401 / i_1243_ + i_1240_;
	    } else {
		anInt9426 = i_1238_;
		anInt9468 = i_1239_;
		anInt9401 = i_1240_;
	    }
	} else if (i == 1) {
	    i_1238_ <<= 4;
	    i_1239_ <<= 4;
	    i_1240_ <<= 4;
	    for (int i_1249_ = 0; i_1249_ < i_1242_; i_1249_++) {
		int i_1250_ = is[i_1249_];
		if (i_1250_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_1251_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_1250_];
		    for (int i_1252_ = 0; i_1252_ < is_1251_.length;
			 i_1252_++) {
			int i_1253_ = is_1251_[i_1252_];
			((Class89_Sub2) this).anIntArray9411[i_1253_]
			    += i_1238_;
			((Class89_Sub2) this).anIntArray9412[i_1253_]
			    += i_1239_;
			((Class89_Sub2) this).anIntArray9413[i_1253_]
			    += i_1240_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1254_ = 0; i_1254_ < i_1242_; i_1254_++) {
		int i_1255_ = is[i_1254_];
		if (i_1255_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_1256_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_1255_];
		    if ((i_1241_ & 0x1) == 0) {
			for (int i_1257_ = 0; i_1257_ < is_1256_.length;
			     i_1257_++) {
			    int i_1258_ = is_1256_[i_1257_];
			    ((Class89_Sub2) this).anIntArray9411[i_1258_]
				-= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_1258_]
				-= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_1258_]
				-= anInt9401;
			    if (i_1240_ != 0) {
				int i_1259_ = Class282.anIntArray4430[i_1240_];
				int i_1260_ = Class282.anIntArray4441[i_1240_];
				int i_1261_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_1258_]) * i_1259_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_1258_]) * i_1260_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9412[i_1258_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_1258_]) * i_1260_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_1258_]) * i_1259_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_1258_]
				    = i_1261_;
			    }
			    if (i_1238_ != 0) {
				int i_1262_ = Class282.anIntArray4430[i_1238_];
				int i_1263_ = Class282.anIntArray4441[i_1238_];
				int i_1264_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_1258_]) * i_1263_
					- (((Class89_Sub2) this).anIntArray9413
					   [i_1258_]) * i_1262_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_1258_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_1258_]) * i_1262_
				       + (((Class89_Sub2) this).anIntArray9413
					  [i_1258_]) * i_1263_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9412[i_1258_]
				    = i_1264_;
			    }
			    if (i_1239_ != 0) {
				int i_1265_ = Class282.anIntArray4430[i_1239_];
				int i_1266_ = Class282.anIntArray4441[i_1239_];
				int i_1267_
				    = (((((Class89_Sub2) this).anIntArray9413
					 [i_1258_]) * i_1265_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_1258_]) * i_1266_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_1258_]
				    = ((((Class89_Sub2) this).anIntArray9413
					[i_1258_]) * i_1266_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_1258_]) * i_1265_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_1258_]
				    = i_1267_;
			    }
			    ((Class89_Sub2) this).anIntArray9411[i_1258_]
				+= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_1258_]
				+= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_1258_]
				+= anInt9401;
			}
		    } else {
			for (int i_1268_ = 0; i_1268_ < is_1256_.length;
			     i_1268_++) {
			    int i_1269_ = is_1256_[i_1268_];
			    ((Class89_Sub2) this).anIntArray9411[i_1269_]
				-= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_1269_]
				-= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_1269_]
				-= anInt9401;
			    if (i_1238_ != 0) {
				int i_1270_ = Class282.anIntArray4430[i_1238_];
				int i_1271_ = Class282.anIntArray4441[i_1238_];
				int i_1272_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_1269_]) * i_1271_
					- (((Class89_Sub2) this).anIntArray9413
					   [i_1269_]) * i_1270_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_1269_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_1269_]) * i_1270_
				       + (((Class89_Sub2) this).anIntArray9413
					  [i_1269_]) * i_1271_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9412[i_1269_]
				    = i_1272_;
			    }
			    if (i_1240_ != 0) {
				int i_1273_ = Class282.anIntArray4430[i_1240_];
				int i_1274_ = Class282.anIntArray4441[i_1240_];
				int i_1275_
				    = (((((Class89_Sub2) this).anIntArray9412
					 [i_1269_]) * i_1273_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_1269_]) * i_1274_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9412[i_1269_]
				    = ((((Class89_Sub2) this).anIntArray9412
					[i_1269_]) * i_1274_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_1269_]) * i_1273_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_1269_]
				    = i_1275_;
			    }
			    if (i_1239_ != 0) {
				int i_1276_ = Class282.anIntArray4430[i_1239_];
				int i_1277_ = Class282.anIntArray4441[i_1239_];
				int i_1278_
				    = (((((Class89_Sub2) this).anIntArray9413
					 [i_1269_]) * i_1276_
					+ (((Class89_Sub2) this).anIntArray9411
					   [i_1269_]) * i_1277_
					+ 16383)
				       >> 14);
				((Class89_Sub2) this).anIntArray9413[i_1269_]
				    = ((((Class89_Sub2) this).anIntArray9413
					[i_1269_]) * i_1277_
				       - (((Class89_Sub2) this).anIntArray9411
					  [i_1269_]) * i_1276_
				       + 16383) >> 14;
				((Class89_Sub2) this).anIntArray9411[i_1269_]
				    = i_1278_;
			    }
			    ((Class89_Sub2) this).anIntArray9411[i_1269_]
				+= anInt9426;
			    ((Class89_Sub2) this).anIntArray9412[i_1269_]
				+= anInt9468;
			    ((Class89_Sub2) this).anIntArray9413[i_1269_]
				+= anInt9401;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1279_ = 0; i_1279_ < i_1242_; i_1279_++) {
		    int i_1280_ = is[i_1279_];
		    if (i_1280_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_1281_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_1280_]);
			for (int i_1282_ = 0; i_1282_ < is_1281_.length;
			     i_1282_++) {
			    int i_1283_ = is_1281_[i_1282_];
			    int i_1284_ = (((Class89_Sub2) this).anIntArray9395
					   [i_1283_]);
			    int i_1285_ = (((Class89_Sub2) this).anIntArray9395
					   [i_1283_ + 1]);
			    for (int i_1286_ = i_1284_;
				 (i_1286_ < i_1285_
				  && (((Class89_Sub2) this).aShortArray9455
				      [i_1286_]) != 0);
				 i_1286_++) {
				int i_1287_ = (((((Class89_Sub2) this)
						 .aShortArray9455[i_1286_])
						& 0xffff)
					       - 1);
				if (i_1240_ != 0) {
				    int i_1288_
					= Class282.anIntArray4430[i_1240_];
				    int i_1289_
					= Class282.anIntArray4441[i_1240_];
				    int i_1290_ = (((((Class89_Sub2) this)
						     .aShortArray9418
						     [i_1287_]) * i_1288_
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_1287_]) * i_1289_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9418
					[i_1287_]
					= (short) (((((Class89_Sub2) this)
						     .aShortArray9418
						     [i_1287_]) * i_1289_
						    - (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_1287_]) * i_1288_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9417
					[i_1287_]
					= (short) i_1290_;
				}
				if (i_1238_ != 0) {
				    int i_1291_
					= Class282.anIntArray4430[i_1238_];
				    int i_1292_
					= Class282.anIntArray4441[i_1238_];
				    int i_1293_ = (((((Class89_Sub2) this)
						     .aShortArray9418
						     [i_1287_]) * i_1292_
						    - (((Class89_Sub2) this)
						       .aShortArray9419
						       [i_1287_]) * i_1291_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9419
					[i_1287_]
					= (short) (((((Class89_Sub2) this)
						     .aShortArray9418
						     [i_1287_]) * i_1291_
						    + (((Class89_Sub2) this)
						       .aShortArray9419
						       [i_1287_]) * i_1292_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9418
					[i_1287_]
					= (short) i_1293_;
				}
				if (i_1239_ != 0) {
				    int i_1294_
					= Class282.anIntArray4430[i_1239_];
				    int i_1295_
					= Class282.anIntArray4441[i_1239_];
				    int i_1296_ = (((((Class89_Sub2) this)
						     .aShortArray9419
						     [i_1287_]) * i_1294_
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_1287_]) * i_1295_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9419
					[i_1287_]
					= (short) (((((Class89_Sub2) this)
						     .aShortArray9419
						     [i_1287_]) * i_1295_
						    - (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_1287_]) * i_1294_
						    + 16383)
						   >> 14);
				    ((Class89_Sub2) this).aShortArray9417
					[i_1287_]
					= (short) i_1296_;
				}
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass151_9436 == null
		    && ((Class89_Sub2) this).aClass151_9433 != null)
		    ((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713
			= null;
		if (((Class89_Sub2) this).aClass151_9436 != null)
		    ((Class151) ((Class89_Sub2) this).aClass151_9436)
			.anInterface8_1713
			= null;
	    }
	} else if (i == 3) {
	    for (int i_1297_ = 0; i_1297_ < i_1242_; i_1297_++) {
		int i_1298_ = is[i_1297_];
		if (i_1298_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_1299_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_1298_];
		    for (int i_1300_ = 0; i_1300_ < is_1299_.length;
			 i_1300_++) {
			int i_1301_ = is_1299_[i_1300_];
			((Class89_Sub2) this).anIntArray9411[i_1301_]
			    -= anInt9426;
			((Class89_Sub2) this).anIntArray9412[i_1301_]
			    -= anInt9468;
			((Class89_Sub2) this).anIntArray9413[i_1301_]
			    -= anInt9401;
			((Class89_Sub2) this).anIntArray9411[i_1301_]
			    = (((Class89_Sub2) this).anIntArray9411[i_1301_]
			       * i_1238_) >> 7;
			((Class89_Sub2) this).anIntArray9412[i_1301_]
			    = (((Class89_Sub2) this).anIntArray9412[i_1301_]
			       * i_1239_) >> 7;
			((Class89_Sub2) this).anIntArray9413[i_1301_]
			    = (((Class89_Sub2) this).anIntArray9413[i_1301_]
			       * i_1240_) >> 7;
			((Class89_Sub2) this).anIntArray9411[i_1301_]
			    += anInt9426;
			((Class89_Sub2) this).anIntArray9412[i_1301_]
			    += anInt9468;
			((Class89_Sub2) this).anIntArray9413[i_1301_]
			    += anInt9401;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_1302_ = 0; i_1302_ < i_1242_; i_1302_++) {
		    int i_1303_ = is[i_1302_];
		    if (i_1303_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_1304_ = (((Class89_Sub2) this)
					  .anIntArrayArray9432[i_1303_]);
			for (int i_1305_ = 0; i_1305_ < is_1304_.length;
			     i_1305_++) {
			    int i_1306_ = is_1304_[i_1305_];
			    int i_1307_ = (((((Class89_Sub2) this)
					     .aByteArray9408[i_1306_])
					    & 0xff)
					   + i_1238_ * 8);
			    if (i_1307_ < 0)
				i_1307_ = 0;
			    else if (i_1307_ > 255)
				i_1307_ = 255;
			    ((Class89_Sub2) this).aByteArray9408[i_1306_]
				= (byte) i_1307_;
			}
			if (is_1304_.length > 0
			    && ((Class89_Sub2) this).aClass151_9433 != null)
			    ((Class151) ((Class89_Sub2) this).aClass151_9433)
				.anInterface8_1713
				= null;
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_1308_ = 0;
			 i_1308_ < ((Class89_Sub2) this).anInt9427;
			 i_1308_++) {
			Class171 class171 = (((Class89_Sub2) this)
					     .aClass171Array9459[i_1308_]);
			Class140 class140 = (((Class89_Sub2) this)
					     .aClass140Array9460[i_1308_]);
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & 0xffffff
			       | 255 - ((((Class89_Sub2) this).aByteArray9408
					 [((Class171) class171).anInt2069])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_1309_ = 0; i_1309_ < i_1242_; i_1309_++) {
		    int i_1310_ = is[i_1309_];
		    if (i_1310_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_1311_ = (((Class89_Sub2) this)
					  .anIntArrayArray9432[i_1310_]);
			for (int i_1312_ = 0; i_1312_ < is_1311_.length;
			     i_1312_++) {
			    int i_1313_ = is_1311_[i_1312_];
			    int i_1314_ = ((((Class89_Sub2) this)
					    .aShortArray9442[i_1313_])
					   & 0xffff);
			    int i_1315_ = i_1314_ >> 10 & 0x3f;
			    int i_1316_ = i_1314_ >> 7 & 0x7;
			    int i_1317_ = i_1314_ & 0x7f;
			    i_1315_ = i_1315_ + i_1238_ & 0x3f;
			    i_1316_ += i_1239_ / 4;
			    if (i_1316_ < 0)
				i_1316_ = 0;
			    else if (i_1316_ > 7)
				i_1316_ = 7;
			    i_1317_ += i_1240_;
			    if (i_1317_ < 0)
				i_1317_ = 0;
			    else if (i_1317_ > 127)
				i_1317_ = 127;
			    ((Class89_Sub2) this).aShortArray9442[i_1313_]
				= (short) (i_1315_ << 10 | i_1316_ << 7
					   | i_1317_);
			}
			if (is_1311_.length > 0
			    && ((Class89_Sub2) this).aClass151_9433 != null)
			    ((Class151) ((Class89_Sub2) this).aClass151_9433)
				.anInterface8_1713
				= null;
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_1318_ = 0;
			 i_1318_ < ((Class89_Sub2) this).anInt9427;
			 i_1318_++) {
			Class171 class171 = (((Class89_Sub2) this)
					     .aClass171Array9459[i_1318_]);
			Class140 class140 = (((Class89_Sub2) this)
					     .aClass140Array9460[i_1318_]);
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & ~0xffffff
			       | (Class474.anIntArray6383
				  [((((Class89_Sub2) this).aShortArray9442
				     [((Class171) class171).anInt2069])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_1319_ = 0; i_1319_ < i_1242_; i_1319_++) {
		    int i_1320_ = is[i_1319_];
		    if (i_1320_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_1321_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_1320_]);
			for (int i_1322_ = 0; i_1322_ < is_1321_.length;
			     i_1322_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_1321_[i_1322_]]);
			    ((Class140) class140).anInt1628 += i_1238_;
			    ((Class140) class140).anInt1629 += i_1239_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_1323_ = 0; i_1323_ < i_1242_; i_1323_++) {
		    int i_1324_ = is[i_1323_];
		    if (i_1324_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_1325_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_1324_]);
			for (int i_1326_ = 0; i_1326_ < is_1325_.length;
			     i_1326_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_1325_[i_1326_]]);
			    ((Class140) class140).anInt1626
				= (((Class140) class140).anInt1626 * i_1238_
				   >> 7);
			    ((Class140) class140).anInt1627
				= (((Class140) class140).anInt1627 * i_1239_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_1327_ = 0; i_1327_ < i_1242_; i_1327_++) {
		    int i_1328_ = is[i_1327_];
		    if (i_1328_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_1329_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_1328_]);
			for (int i_1330_ = 0; i_1330_ < is_1329_.length;
			     i_1330_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_1329_[i_1330_]]);
			    ((Class140) class140).anInt1625
				= (((Class140) class140).anInt1625 + i_1238_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method1955(int i, int[] is, int i_1331_, int i_1332_, int i_1333_,
		    boolean bool, int i_1334_, int[] is_1335_) {
	int i_1336_ = is.length;
	if (i == 0) {
	    i_1331_ <<= 4;
	    i_1332_ <<= 4;
	    i_1333_ <<= 4;
	    int i_1337_ = 0;
	    anInt9426 = 0;
	    anInt9468 = 0;
	    anInt9401 = 0;
	    for (int i_1338_ = 0; i_1338_ < i_1336_; i_1338_++) {
		int i_1339_ = is[i_1338_];
		if (i_1339_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_1340_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_1339_];
		    for (int i_1341_ = 0; i_1341_ < is_1340_.length;
			 i_1341_++) {
			int i_1342_ = is_1340_[i_1341_];
			if (((Class89_Sub2) this).aShortArray9465 == null
			    || (i_1334_ & (((Class89_Sub2) this)
					   .aShortArray9465[i_1342_])) != 0) {
			    anInt9426 += (((Class89_Sub2) this).anIntArray9411
					  [i_1342_]);
			    anInt9468 += (((Class89_Sub2) this).anIntArray9412
					  [i_1342_]);
			    anInt9401 += (((Class89_Sub2) this).anIntArray9413
					  [i_1342_]);
			    i_1337_++;
			}
		    }
		}
	    }
	    if (i_1337_ > 0) {
		anInt9426 = anInt9426 / i_1337_ + i_1331_;
		anInt9468 = anInt9468 / i_1337_ + i_1332_;
		anInt9401 = anInt9401 / i_1337_ + i_1333_;
		aBool9470 = true;
	    } else {
		anInt9426 = i_1331_;
		anInt9468 = i_1332_;
		anInt9401 = i_1333_;
	    }
	} else if (i == 1) {
	    if (is_1335_ != null) {
		int i_1343_ = ((is_1335_[0] * i_1331_ + is_1335_[1] * i_1332_
				+ is_1335_[2] * i_1333_ + 8192)
			       >> 14);
		int i_1344_ = ((is_1335_[3] * i_1331_ + is_1335_[4] * i_1332_
				+ is_1335_[5] * i_1333_ + 8192)
			       >> 14);
		int i_1345_ = ((is_1335_[6] * i_1331_ + is_1335_[7] * i_1332_
				+ is_1335_[8] * i_1333_ + 8192)
			       >> 14);
		i_1331_ = i_1343_;
		i_1332_ = i_1344_;
		i_1333_ = i_1345_;
	    }
	    i_1331_ <<= 4;
	    i_1332_ <<= 4;
	    i_1333_ <<= 4;
	    for (int i_1346_ = 0; i_1346_ < i_1336_; i_1346_++) {
		int i_1347_ = is[i_1346_];
		if (i_1347_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_1348_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_1347_];
		    for (int i_1349_ = 0; i_1349_ < is_1348_.length;
			 i_1349_++) {
			int i_1350_ = is_1348_[i_1349_];
			if (((Class89_Sub2) this).aShortArray9465 == null
			    || (i_1334_ & (((Class89_Sub2) this)
					   .aShortArray9465[i_1350_])) != 0) {
			    ((Class89_Sub2) this).anIntArray9411[i_1350_]
				+= i_1331_;
			    ((Class89_Sub2) this).anIntArray9412[i_1350_]
				+= i_1332_;
			    ((Class89_Sub2) this).anIntArray9413[i_1350_]
				+= i_1333_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1335_ != null) {
		int i_1351_ = is_1335_[9] << 4;
		int i_1352_ = is_1335_[10] << 4;
		int i_1353_ = is_1335_[11] << 4;
		int i_1354_ = is_1335_[12] << 4;
		int i_1355_ = is_1335_[13] << 4;
		int i_1356_ = is_1335_[14] << 4;
		if (aBool9470) {
		    int i_1357_
			= ((is_1335_[0] * anInt9426 + is_1335_[3] * anInt9468
			    + is_1335_[6] * anInt9401 + 8192)
			   >> 14);
		    int i_1358_
			= ((is_1335_[1] * anInt9426 + is_1335_[4] * anInt9468
			    + is_1335_[7] * anInt9401 + 8192)
			   >> 14);
		    int i_1359_
			= ((is_1335_[2] * anInt9426 + is_1335_[5] * anInt9468
			    + is_1335_[8] * anInt9401 + 8192)
			   >> 14);
		    i_1357_ += i_1354_;
		    i_1358_ += i_1355_;
		    i_1359_ += i_1356_;
		    anInt9426 = i_1357_;
		    anInt9468 = i_1358_;
		    anInt9401 = i_1359_;
		    aBool9470 = false;
		}
		int[] is_1360_ = new int[9];
		int i_1361_ = Class282.anIntArray4441[i_1331_];
		int i_1362_ = Class282.anIntArray4430[i_1331_];
		int i_1363_ = Class282.anIntArray4441[i_1332_];
		int i_1364_ = Class282.anIntArray4430[i_1332_];
		int i_1365_ = Class282.anIntArray4441[i_1333_];
		int i_1366_ = Class282.anIntArray4430[i_1333_];
		int i_1367_ = i_1362_ * i_1365_ + 8192 >> 14;
		int i_1368_ = i_1362_ * i_1366_ + 8192 >> 14;
		is_1360_[0]
		    = i_1363_ * i_1365_ + i_1364_ * i_1368_ + 8192 >> 14;
		is_1360_[1]
		    = -i_1363_ * i_1366_ + i_1364_ * i_1367_ + 8192 >> 14;
		is_1360_[2] = i_1364_ * i_1361_ + 8192 >> 14;
		is_1360_[3] = i_1361_ * i_1366_ + 8192 >> 14;
		is_1360_[4] = i_1361_ * i_1365_ + 8192 >> 14;
		is_1360_[5] = -i_1362_;
		is_1360_[6]
		    = -i_1364_ * i_1365_ + i_1363_ * i_1368_ + 8192 >> 14;
		is_1360_[7]
		    = i_1364_ * i_1366_ + i_1363_ * i_1367_ + 8192 >> 14;
		is_1360_[8] = i_1363_ * i_1361_ + 8192 >> 14;
		int i_1369_
		    = ((is_1360_[0] * -anInt9426 + is_1360_[1] * -anInt9468
			+ is_1360_[2] * -anInt9401 + 8192)
		       >> 14);
		int i_1370_
		    = ((is_1360_[3] * -anInt9426 + is_1360_[4] * -anInt9468
			+ is_1360_[5] * -anInt9401 + 8192)
		       >> 14);
		int i_1371_
		    = ((is_1360_[6] * -anInt9426 + is_1360_[7] * -anInt9468
			+ is_1360_[8] * -anInt9401 + 8192)
		       >> 14);
		int i_1372_ = i_1369_ + anInt9426;
		int i_1373_ = i_1370_ + anInt9468;
		int i_1374_ = i_1371_ + anInt9401;
		int[] is_1375_ = new int[9];
		for (int i_1376_ = 0; i_1376_ < 3; i_1376_++) {
		    for (int i_1377_ = 0; i_1377_ < 3; i_1377_++) {
			int i_1378_ = 0;
			for (int i_1379_ = 0; i_1379_ < 3; i_1379_++)
			    i_1378_ += (is_1360_[i_1376_ * 3 + i_1379_]
					* is_1335_[i_1377_ * 3 + i_1379_]);
			is_1375_[i_1376_ * 3 + i_1377_] = i_1378_ + 8192 >> 14;
		    }
		}
		int i_1380_ = ((is_1360_[0] * i_1354_ + is_1360_[1] * i_1355_
				+ is_1360_[2] * i_1356_ + 8192)
			       >> 14);
		int i_1381_ = ((is_1360_[3] * i_1354_ + is_1360_[4] * i_1355_
				+ is_1360_[5] * i_1356_ + 8192)
			       >> 14);
		int i_1382_ = ((is_1360_[6] * i_1354_ + is_1360_[7] * i_1355_
				+ is_1360_[8] * i_1356_ + 8192)
			       >> 14);
		i_1380_ += i_1372_;
		i_1381_ += i_1373_;
		i_1382_ += i_1374_;
		int[] is_1383_ = new int[9];
		for (int i_1384_ = 0; i_1384_ < 3; i_1384_++) {
		    for (int i_1385_ = 0; i_1385_ < 3; i_1385_++) {
			int i_1386_ = 0;
			for (int i_1387_ = 0; i_1387_ < 3; i_1387_++)
			    i_1386_ += (is_1335_[i_1384_ * 3 + i_1387_]
					* is_1375_[i_1385_ + i_1387_ * 3]);
			is_1383_[i_1384_ * 3 + i_1385_] = i_1386_ + 8192 >> 14;
		    }
		}
		int i_1388_ = ((is_1335_[0] * i_1380_ + is_1335_[1] * i_1381_
				+ is_1335_[2] * i_1382_ + 8192)
			       >> 14);
		int i_1389_ = ((is_1335_[3] * i_1380_ + is_1335_[4] * i_1381_
				+ is_1335_[5] * i_1382_ + 8192)
			       >> 14);
		int i_1390_ = ((is_1335_[6] * i_1380_ + is_1335_[7] * i_1381_
				+ is_1335_[8] * i_1382_ + 8192)
			       >> 14);
		i_1388_ += i_1351_;
		i_1389_ += i_1352_;
		i_1390_ += i_1353_;
		for (int i_1391_ = 0; i_1391_ < i_1336_; i_1391_++) {
		    int i_1392_ = is[i_1391_];
		    if (i_1392_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_1393_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_1392_]);
			for (int i_1394_ = 0; i_1394_ < is_1393_.length;
			     i_1394_++) {
			    int i_1395_ = is_1393_[i_1394_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_1334_ & (((Class89_Sub2) this)
						.aShortArray9465[i_1395_]))
				    != 0)) {
				int i_1396_
				    = (is_1383_[0] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1395_])
				       + is_1383_[1] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1395_])
				       + is_1383_[2] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1395_])
				       + 8192) >> 14;
				int i_1397_
				    = (is_1383_[3] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1395_])
				       + is_1383_[4] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1395_])
				       + is_1383_[5] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1395_])
				       + 8192) >> 14;
				int i_1398_
				    = (is_1383_[6] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1395_])
				       + is_1383_[7] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1395_])
				       + is_1383_[8] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1395_])
				       + 8192) >> 14;
				i_1396_ += i_1388_;
				i_1397_ += i_1389_;
				i_1398_ += i_1390_;
				((Class89_Sub2) this).anIntArray9411[i_1395_]
				    = i_1396_;
				((Class89_Sub2) this).anIntArray9412[i_1395_]
				    = i_1397_;
				((Class89_Sub2) this).anIntArray9413[i_1395_]
				    = i_1398_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1399_ = 0; i_1399_ < i_1336_; i_1399_++) {
		    int i_1400_ = is[i_1399_];
		    if (i_1400_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_1401_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_1400_]);
			for (int i_1402_ = 0; i_1402_ < is_1401_.length;
			     i_1402_++) {
			    int i_1403_ = is_1401_[i_1402_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_1334_ & (((Class89_Sub2) this)
						.aShortArray9465[i_1403_]))
				    != 0)) {
				((Class89_Sub2) this).anIntArray9411[i_1403_]
				    -= anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_1403_]
				    -= anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_1403_]
				    -= anInt9401;
				if (i_1333_ != 0) {
				    int i_1404_
					= Class282.anIntArray4430[i_1333_];
				    int i_1405_
					= Class282.anIntArray4441[i_1333_];
				    int i_1406_
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_1403_]) * i_1404_
					   + ((((Class89_Sub2) this)
					       .anIntArray9411[i_1403_])
					      * i_1405_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9412
					[i_1403_]
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_1403_]) * i_1405_
					   - ((((Class89_Sub2) this)
					       .anIntArray9411[i_1403_])
					      * i_1404_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9411
					[i_1403_]
					= i_1406_;
				}
				if (i_1331_ != 0) {
				    int i_1407_
					= Class282.anIntArray4430[i_1331_];
				    int i_1408_
					= Class282.anIntArray4441[i_1331_];
				    int i_1409_
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_1403_]) * i_1408_
					   - ((((Class89_Sub2) this)
					       .anIntArray9413[i_1403_])
					      * i_1407_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9413
					[i_1403_]
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_1403_]) * i_1407_
					   + ((((Class89_Sub2) this)
					       .anIntArray9413[i_1403_])
					      * i_1408_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9412
					[i_1403_]
					= i_1409_;
				}
				if (i_1332_ != 0) {
				    int i_1410_
					= Class282.anIntArray4430[i_1332_];
				    int i_1411_
					= Class282.anIntArray4441[i_1332_];
				    int i_1412_
					= ((((Class89_Sub2) this)
					    .anIntArray9413[i_1403_]) * i_1410_
					   + ((((Class89_Sub2) this)
					       .anIntArray9411[i_1403_])
					      * i_1411_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9413
					[i_1403_]
					= ((((Class89_Sub2) this)
					    .anIntArray9413[i_1403_]) * i_1411_
					   - ((((Class89_Sub2) this)
					       .anIntArray9411[i_1403_])
					      * i_1410_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9411
					[i_1403_]
					= i_1412_;
				}
				((Class89_Sub2) this).anIntArray9411[i_1403_]
				    += anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_1403_]
				    += anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_1403_]
				    += anInt9401;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1413_ = 0; i_1413_ < i_1336_; i_1413_++) {
			int i_1414_ = is[i_1413_];
			if (i_1414_ < (((Class89_Sub2) this)
				       .anIntArrayArray9467).length) {
			    int[] is_1415_ = (((Class89_Sub2) this)
					      .anIntArrayArray9467[i_1414_]);
			    for (int i_1416_ = 0; i_1416_ < is_1415_.length;
				 i_1416_++) {
				int i_1417_ = is_1415_[i_1416_];
				if ((((Class89_Sub2) this).aShortArray9465
				     == null)
				    || ((i_1334_ & (((Class89_Sub2) this)
						    .aShortArray9465[i_1417_]))
					!= 0)) {
				    int i_1418_ = (((Class89_Sub2) this)
						   .anIntArray9395[i_1417_]);
				    int i_1419_
					= (((Class89_Sub2) this).anIntArray9395
					   [i_1417_ + 1]);
				    for (int i_1420_ = i_1418_;
					 (i_1420_ < i_1419_
					  && (((Class89_Sub2) this)
					      .aShortArray9455[i_1420_]) != 0);
					 i_1420_++) {
					int i_1421_
					    = (((((Class89_Sub2) this)
						 .aShortArray9455[i_1420_])
						& 0xffff)
					       - 1);
					if (i_1333_ != 0) {
					    int i_1422_
						= (Class282.anIntArray4430
						   [i_1333_]);
					    int i_1423_
						= (Class282.anIntArray4441
						   [i_1333_]);
					    int i_1424_
						= (((((Class89_Sub2) this)
						     .aShortArray9418
						     [i_1421_]) * i_1422_
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_1421_]) * i_1423_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9418[i_1421_]
						= (short) ((((((Class89_Sub2)
							       this)
							      .aShortArray9418
							      [i_1421_])
							     * i_1423_)
							    - ((((Class89_Sub2)
								 this)
								.aShortArray9417
								[i_1421_])
							       * i_1422_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9417[i_1421_]
						= (short) i_1424_;
					}
					if (i_1331_ != 0) {
					    int i_1425_
						= (Class282.anIntArray4430
						   [i_1331_]);
					    int i_1426_
						= (Class282.anIntArray4441
						   [i_1331_]);
					    int i_1427_
						= (((((Class89_Sub2) this)
						     .aShortArray9418
						     [i_1421_]) * i_1426_
						    - (((Class89_Sub2) this)
						       .aShortArray9419
						       [i_1421_]) * i_1425_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9419[i_1421_]
						= (short) ((((((Class89_Sub2)
							       this)
							      .aShortArray9418
							      [i_1421_])
							     * i_1425_)
							    + ((((Class89_Sub2)
								 this)
								.aShortArray9419
								[i_1421_])
							       * i_1426_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9418[i_1421_]
						= (short) i_1427_;
					}
					if (i_1332_ != 0) {
					    int i_1428_
						= (Class282.anIntArray4430
						   [i_1332_]);
					    int i_1429_
						= (Class282.anIntArray4441
						   [i_1332_]);
					    int i_1430_
						= (((((Class89_Sub2) this)
						     .aShortArray9419
						     [i_1421_]) * i_1428_
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_1421_]) * i_1429_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9419[i_1421_]
						= (short) ((((((Class89_Sub2)
							       this)
							      .aShortArray9419
							      [i_1421_])
							     * i_1429_)
							    - ((((Class89_Sub2)
								 this)
								.aShortArray9417
								[i_1421_])
							       * i_1428_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9417[i_1421_]
						= (short) i_1430_;
					}
				    }
				}
			    }
			}
		    }
		    if (((Class89_Sub2) this).aClass151_9436 == null
			&& ((Class89_Sub2) this).aClass151_9433 != null)
			((Class151) ((Class89_Sub2) this).aClass151_9433)
			    .anInterface8_1713
			    = null;
		    if (((Class89_Sub2) this).aClass151_9436 != null)
			((Class151) ((Class89_Sub2) this).aClass151_9436)
			    .anInterface8_1713
			    = null;
		}
	    }
	} else if (i == 3) {
	    if (is_1335_ != null) {
		int i_1431_ = is_1335_[9] << 4;
		int i_1432_ = is_1335_[10] << 4;
		int i_1433_ = is_1335_[11] << 4;
		int i_1434_ = is_1335_[12] << 4;
		int i_1435_ = is_1335_[13] << 4;
		int i_1436_ = is_1335_[14] << 4;
		if (aBool9470) {
		    int i_1437_
			= ((is_1335_[0] * anInt9426 + is_1335_[3] * anInt9468
			    + is_1335_[6] * anInt9401 + 8192)
			   >> 14);
		    int i_1438_
			= ((is_1335_[1] * anInt9426 + is_1335_[4] * anInt9468
			    + is_1335_[7] * anInt9401 + 8192)
			   >> 14);
		    int i_1439_
			= ((is_1335_[2] * anInt9426 + is_1335_[5] * anInt9468
			    + is_1335_[8] * anInt9401 + 8192)
			   >> 14);
		    i_1437_ += i_1434_;
		    i_1438_ += i_1435_;
		    i_1439_ += i_1436_;
		    anInt9426 = i_1437_;
		    anInt9468 = i_1438_;
		    anInt9401 = i_1439_;
		    aBool9470 = false;
		}
		int i_1440_ = i_1331_ << 15 >> 7;
		int i_1441_ = i_1332_ << 15 >> 7;
		int i_1442_ = i_1333_ << 15 >> 7;
		int i_1443_ = i_1440_ * -anInt9426 + 8192 >> 14;
		int i_1444_ = i_1441_ * -anInt9468 + 8192 >> 14;
		int i_1445_ = i_1442_ * -anInt9401 + 8192 >> 14;
		int i_1446_ = i_1443_ + anInt9426;
		int i_1447_ = i_1444_ + anInt9468;
		int i_1448_ = i_1445_ + anInt9401;
		int[] is_1449_ = new int[9];
		is_1449_[0] = i_1440_ * is_1335_[0] + 8192 >> 14;
		is_1449_[1] = i_1440_ * is_1335_[3] + 8192 >> 14;
		is_1449_[2] = i_1440_ * is_1335_[6] + 8192 >> 14;
		is_1449_[3] = i_1441_ * is_1335_[1] + 8192 >> 14;
		is_1449_[4] = i_1441_ * is_1335_[4] + 8192 >> 14;
		is_1449_[5] = i_1441_ * is_1335_[7] + 8192 >> 14;
		is_1449_[6] = i_1442_ * is_1335_[2] + 8192 >> 14;
		is_1449_[7] = i_1442_ * is_1335_[5] + 8192 >> 14;
		is_1449_[8] = i_1442_ * is_1335_[8] + 8192 >> 14;
		int i_1450_ = i_1440_ * i_1434_ + 8192 >> 14;
		int i_1451_ = i_1441_ * i_1435_ + 8192 >> 14;
		int i_1452_ = i_1442_ * i_1436_ + 8192 >> 14;
		i_1450_ += i_1446_;
		i_1451_ += i_1447_;
		i_1452_ += i_1448_;
		int[] is_1453_ = new int[9];
		for (int i_1454_ = 0; i_1454_ < 3; i_1454_++) {
		    for (int i_1455_ = 0; i_1455_ < 3; i_1455_++) {
			int i_1456_ = 0;
			for (int i_1457_ = 0; i_1457_ < 3; i_1457_++)
			    i_1456_ += (is_1335_[i_1454_ * 3 + i_1457_]
					* is_1449_[i_1455_ + i_1457_ * 3]);
			is_1453_[i_1454_ * 3 + i_1455_] = i_1456_ + 8192 >> 14;
		    }
		}
		int i_1458_ = ((is_1335_[0] * i_1450_ + is_1335_[1] * i_1451_
				+ is_1335_[2] * i_1452_ + 8192)
			       >> 14);
		int i_1459_ = ((is_1335_[3] * i_1450_ + is_1335_[4] * i_1451_
				+ is_1335_[5] * i_1452_ + 8192)
			       >> 14);
		int i_1460_ = ((is_1335_[6] * i_1450_ + is_1335_[7] * i_1451_
				+ is_1335_[8] * i_1452_ + 8192)
			       >> 14);
		i_1458_ += i_1431_;
		i_1459_ += i_1432_;
		i_1460_ += i_1433_;
		for (int i_1461_ = 0; i_1461_ < i_1336_; i_1461_++) {
		    int i_1462_ = is[i_1461_];
		    if (i_1462_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_1463_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_1462_]);
			for (int i_1464_ = 0; i_1464_ < is_1463_.length;
			     i_1464_++) {
			    int i_1465_ = is_1463_[i_1464_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_1334_ & (((Class89_Sub2) this)
						.aShortArray9465[i_1465_]))
				    != 0)) {
				int i_1466_
				    = (is_1453_[0] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1465_])
				       + is_1453_[1] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1465_])
				       + is_1453_[2] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1465_])
				       + 8192) >> 14;
				int i_1467_
				    = (is_1453_[3] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1465_])
				       + is_1453_[4] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1465_])
				       + is_1453_[5] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1465_])
				       + 8192) >> 14;
				int i_1468_
				    = (is_1453_[6] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1465_])
				       + is_1453_[7] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1465_])
				       + is_1453_[8] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1465_])
				       + 8192) >> 14;
				i_1466_ += i_1458_;
				i_1467_ += i_1459_;
				i_1468_ += i_1460_;
				((Class89_Sub2) this).anIntArray9411[i_1465_]
				    = i_1466_;
				((Class89_Sub2) this).anIntArray9412[i_1465_]
				    = i_1467_;
				((Class89_Sub2) this).anIntArray9413[i_1465_]
				    = i_1468_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1469_ = 0; i_1469_ < i_1336_; i_1469_++) {
		    int i_1470_ = is[i_1469_];
		    if (i_1470_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_1471_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_1470_]);
			for (int i_1472_ = 0; i_1472_ < is_1471_.length;
			     i_1472_++) {
			    int i_1473_ = is_1471_[i_1472_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_1334_ & (((Class89_Sub2) this)
						.aShortArray9465[i_1473_]))
				    != 0)) {
				((Class89_Sub2) this).anIntArray9411[i_1473_]
				    -= anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_1473_]
				    -= anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_1473_]
				    -= anInt9401;
				((Class89_Sub2) this).anIntArray9411[i_1473_]
				    = (((Class89_Sub2) this).anIntArray9411
				       [i_1473_]) * i_1331_ >> 7;
				((Class89_Sub2) this).anIntArray9412[i_1473_]
				    = (((Class89_Sub2) this).anIntArray9412
				       [i_1473_]) * i_1332_ >> 7;
				((Class89_Sub2) this).anIntArray9413[i_1473_]
				    = (((Class89_Sub2) this).anIntArray9413
				       [i_1473_]) * i_1333_ >> 7;
				((Class89_Sub2) this).anIntArray9411[i_1473_]
				    += anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_1473_]
				    += anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_1473_]
				    += anInt9401;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_1474_ = 0; i_1474_ < i_1336_; i_1474_++) {
		    int i_1475_ = is[i_1474_];
		    if (i_1475_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_1476_ = (((Class89_Sub2) this)
					  .anIntArrayArray9432[i_1475_]);
			for (int i_1477_ = 0; i_1477_ < is_1476_.length;
			     i_1477_++) {
			    int i_1478_ = is_1476_[i_1477_];
			    if (((Class89_Sub2) this).aShortArray9415 == null
				|| ((i_1334_ & (((Class89_Sub2) this)
						.aShortArray9415[i_1478_]))
				    != 0)) {
				int i_1479_ = (((((Class89_Sub2) this)
						 .aByteArray9408[i_1478_])
						& 0xff)
					       + i_1331_ * 8);
				if (i_1479_ < 0)
				    i_1479_ = 0;
				else if (i_1479_ > 255)
				    i_1479_ = 255;
				((Class89_Sub2) this).aByteArray9408[i_1478_]
				    = (byte) i_1479_;
				if (((Class89_Sub2) this).aClass151_9433
				    != null)
				    ((Class151)
				     ((Class89_Sub2) this).aClass151_9433)
					.anInterface8_1713
					= null;
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_1480_ = 0;
			 i_1480_ < ((Class89_Sub2) this).anInt9427;
			 i_1480_++) {
			Class171 class171 = (((Class89_Sub2) this)
					     .aClass171Array9459[i_1480_]);
			Class140 class140 = (((Class89_Sub2) this)
					     .aClass140Array9460[i_1480_]);
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & 0xffffff
			       | 255 - ((((Class89_Sub2) this).aByteArray9408
					 [((Class171) class171).anInt2069])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_1481_ = 0; i_1481_ < i_1336_; i_1481_++) {
		    int i_1482_ = is[i_1481_];
		    if (i_1482_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_1483_ = (((Class89_Sub2) this)
					  .anIntArrayArray9432[i_1482_]);
			for (int i_1484_ = 0; i_1484_ < is_1483_.length;
			     i_1484_++) {
			    int i_1485_ = is_1483_[i_1484_];
			    if (((Class89_Sub2) this).aShortArray9415 == null
				|| ((i_1334_ & (((Class89_Sub2) this)
						.aShortArray9415[i_1485_]))
				    != 0)) {
				int i_1486_ = ((((Class89_Sub2) this)
						.aShortArray9442[i_1485_])
					       & 0xffff);
				int i_1487_ = i_1486_ >> 10 & 0x3f;
				int i_1488_ = i_1486_ >> 7 & 0x7;
				int i_1489_ = i_1486_ & 0x7f;
				i_1487_ = i_1487_ + i_1331_ & 0x3f;
				i_1488_ += i_1332_ / 4;
				if (i_1488_ < 0)
				    i_1488_ = 0;
				else if (i_1488_ > 7)
				    i_1488_ = 7;
				i_1489_ += i_1333_;
				if (i_1489_ < 0)
				    i_1489_ = 0;
				else if (i_1489_ > 127)
				    i_1489_ = 127;
				((Class89_Sub2) this).aShortArray9442[i_1485_]
				    = (short) (i_1487_ << 10 | i_1488_ << 7
					       | i_1489_);
				if (((Class89_Sub2) this).aClass151_9433
				    != null)
				    ((Class151)
				     ((Class89_Sub2) this).aClass151_9433)
					.anInterface8_1713
					= null;
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_1490_ = 0;
			 i_1490_ < ((Class89_Sub2) this).anInt9427;
			 i_1490_++) {
			Class171 class171 = (((Class89_Sub2) this)
					     .aClass171Array9459[i_1490_]);
			Class140 class140 = (((Class89_Sub2) this)
					     .aClass140Array9460[i_1490_]);
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & ~0xffffff
			       | (Class474.anIntArray6383
				  [((((Class89_Sub2) this).aShortArray9442
				     [((Class171) class171).anInt2069])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_1491_ = 0; i_1491_ < i_1336_; i_1491_++) {
		    int i_1492_ = is[i_1491_];
		    if (i_1492_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_1493_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_1492_]);
			for (int i_1494_ = 0; i_1494_ < is_1493_.length;
			     i_1494_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_1493_[i_1494_]]);
			    ((Class140) class140).anInt1628 += i_1331_;
			    ((Class140) class140).anInt1629 += i_1332_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_1495_ = 0; i_1495_ < i_1336_; i_1495_++) {
		    int i_1496_ = is[i_1495_];
		    if (i_1496_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_1497_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_1496_]);
			for (int i_1498_ = 0; i_1498_ < is_1497_.length;
			     i_1498_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_1497_[i_1498_]]);
			    ((Class140) class140).anInt1626
				= (((Class140) class140).anInt1626 * i_1331_
				   >> 7);
			    ((Class140) class140).anInt1627
				= (((Class140) class140).anInt1627 * i_1332_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_1499_ = 0; i_1499_ < i_1336_; i_1499_++) {
		    int i_1500_ = is[i_1499_];
		    if (i_1500_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_1501_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_1500_]);
			for (int i_1502_ = 0; i_1502_ < is_1501_.length;
			     i_1502_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_1501_[i_1502_]]);
			    ((Class140) class140).anInt1625
				= (((Class140) class140).anInt1625 + i_1331_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    boolean method15547(int i, int i_1503_, int i_1504_, int i_1505_,
			int i_1506_, int i_1507_, int i_1508_, int i_1509_) {
	if (i_1503_ < i_1504_ && i_1503_ < i_1505_ && i_1503_ < i_1506_)
	    return false;
	if (i_1503_ > i_1504_ && i_1503_ > i_1505_ && i_1503_ > i_1506_)
	    return false;
	if (i < i_1507_ && i < i_1508_ && i < i_1509_)
	    return false;
	if (i > i_1507_ && i > i_1508_ && i > i_1509_)
	    return false;
	return true;
    }
    
    void method15548(boolean bool) {
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .aClass241_Sub3_Sub2_9231.payload).length
	    < ((Class89_Sub2) this).anInt9441 * 6)
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.aClass241_Sub3_Sub2_9231
		= new Class241_Sub3_Sub2((((Class89_Sub2) this).anInt9441
					  + 100) * 6);
	else
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.aClass241_Sub3_Sub2_9231.pointer
		= 0;
	Class241_Sub3_Sub2 class241_sub3_sub2
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass241_Sub3_Sub2_9231);
	if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	    .aBool9144) {
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9428[i]),
					       -484048531);
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9462[i]),
					       -484048531);
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9407[i]),
					       -484048531);
	    }
	} else {
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9428[i]),
					       (byte) -23);
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9462[i]),
					       (byte) 34);
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9407[i]),
					       (byte) -10);
	    }
	}
	if (class241_sub3_sub2.pointer * 421967667 != 0) {
	    if (bool) {
		if (((Class89_Sub2) this).anInterface14_9439 == null)
		    ((Class89_Sub2) this).anInterface14_9439
			= (((Class89_Sub2) this).aClass103_Sub1_9457
			       .method15200
			   (5123, class241_sub3_sub2.payload,
			    class241_sub3_sub2.pointer * 421967667, true));
		else
		    ((Class89_Sub2) this).anInterface14_9439.method99
			(5123, class241_sub3_sub2.payload,
			 class241_sub3_sub2.pointer * 421967667);
		((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692
		    = ((Class89_Sub2) this).anInterface14_9439;
	    } else
		((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692
		    = (((Class89_Sub2) this).aClass103_Sub1_9457.method15200
		       (5123, class241_sub3_sub2.payload,
			class241_sub3_sub2.pointer * 421967667, false));
	    if (!bool)
		((Class89_Sub2) this).aBool9431 = true;
	}
    }
    
    void method1964(int i, int[] is, int i_1510_, int i_1511_, int i_1512_,
		    boolean bool, int i_1513_, int[] is_1514_) {
	int i_1515_ = is.length;
	if (i == 0) {
	    i_1510_ <<= 4;
	    i_1511_ <<= 4;
	    i_1512_ <<= 4;
	    int i_1516_ = 0;
	    anInt9426 = 0;
	    anInt9468 = 0;
	    anInt9401 = 0;
	    for (int i_1517_ = 0; i_1517_ < i_1515_; i_1517_++) {
		int i_1518_ = is[i_1517_];
		if (i_1518_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_1519_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_1518_];
		    for (int i_1520_ = 0; i_1520_ < is_1519_.length;
			 i_1520_++) {
			int i_1521_ = is_1519_[i_1520_];
			if (((Class89_Sub2) this).aShortArray9465 == null
			    || (i_1513_ & (((Class89_Sub2) this)
					   .aShortArray9465[i_1521_])) != 0) {
			    anInt9426 += (((Class89_Sub2) this).anIntArray9411
					  [i_1521_]);
			    anInt9468 += (((Class89_Sub2) this).anIntArray9412
					  [i_1521_]);
			    anInt9401 += (((Class89_Sub2) this).anIntArray9413
					  [i_1521_]);
			    i_1516_++;
			}
		    }
		}
	    }
	    if (i_1516_ > 0) {
		anInt9426 = anInt9426 / i_1516_ + i_1510_;
		anInt9468 = anInt9468 / i_1516_ + i_1511_;
		anInt9401 = anInt9401 / i_1516_ + i_1512_;
		aBool9470 = true;
	    } else {
		anInt9426 = i_1510_;
		anInt9468 = i_1511_;
		anInt9401 = i_1512_;
	    }
	} else if (i == 1) {
	    if (is_1514_ != null) {
		int i_1522_ = ((is_1514_[0] * i_1510_ + is_1514_[1] * i_1511_
				+ is_1514_[2] * i_1512_ + 8192)
			       >> 14);
		int i_1523_ = ((is_1514_[3] * i_1510_ + is_1514_[4] * i_1511_
				+ is_1514_[5] * i_1512_ + 8192)
			       >> 14);
		int i_1524_ = ((is_1514_[6] * i_1510_ + is_1514_[7] * i_1511_
				+ is_1514_[8] * i_1512_ + 8192)
			       >> 14);
		i_1510_ = i_1522_;
		i_1511_ = i_1523_;
		i_1512_ = i_1524_;
	    }
	    i_1510_ <<= 4;
	    i_1511_ <<= 4;
	    i_1512_ <<= 4;
	    for (int i_1525_ = 0; i_1525_ < i_1515_; i_1525_++) {
		int i_1526_ = is[i_1525_];
		if (i_1526_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_1527_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_1526_];
		    for (int i_1528_ = 0; i_1528_ < is_1527_.length;
			 i_1528_++) {
			int i_1529_ = is_1527_[i_1528_];
			if (((Class89_Sub2) this).aShortArray9465 == null
			    || (i_1513_ & (((Class89_Sub2) this)
					   .aShortArray9465[i_1529_])) != 0) {
			    ((Class89_Sub2) this).anIntArray9411[i_1529_]
				+= i_1510_;
			    ((Class89_Sub2) this).anIntArray9412[i_1529_]
				+= i_1511_;
			    ((Class89_Sub2) this).anIntArray9413[i_1529_]
				+= i_1512_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1514_ != null) {
		int i_1530_ = is_1514_[9] << 4;
		int i_1531_ = is_1514_[10] << 4;
		int i_1532_ = is_1514_[11] << 4;
		int i_1533_ = is_1514_[12] << 4;
		int i_1534_ = is_1514_[13] << 4;
		int i_1535_ = is_1514_[14] << 4;
		if (aBool9470) {
		    int i_1536_
			= ((is_1514_[0] * anInt9426 + is_1514_[3] * anInt9468
			    + is_1514_[6] * anInt9401 + 8192)
			   >> 14);
		    int i_1537_
			= ((is_1514_[1] * anInt9426 + is_1514_[4] * anInt9468
			    + is_1514_[7] * anInt9401 + 8192)
			   >> 14);
		    int i_1538_
			= ((is_1514_[2] * anInt9426 + is_1514_[5] * anInt9468
			    + is_1514_[8] * anInt9401 + 8192)
			   >> 14);
		    i_1536_ += i_1533_;
		    i_1537_ += i_1534_;
		    i_1538_ += i_1535_;
		    anInt9426 = i_1536_;
		    anInt9468 = i_1537_;
		    anInt9401 = i_1538_;
		    aBool9470 = false;
		}
		int[] is_1539_ = new int[9];
		int i_1540_ = Class282.anIntArray4441[i_1510_];
		int i_1541_ = Class282.anIntArray4430[i_1510_];
		int i_1542_ = Class282.anIntArray4441[i_1511_];
		int i_1543_ = Class282.anIntArray4430[i_1511_];
		int i_1544_ = Class282.anIntArray4441[i_1512_];
		int i_1545_ = Class282.anIntArray4430[i_1512_];
		int i_1546_ = i_1541_ * i_1544_ + 8192 >> 14;
		int i_1547_ = i_1541_ * i_1545_ + 8192 >> 14;
		is_1539_[0]
		    = i_1542_ * i_1544_ + i_1543_ * i_1547_ + 8192 >> 14;
		is_1539_[1]
		    = -i_1542_ * i_1545_ + i_1543_ * i_1546_ + 8192 >> 14;
		is_1539_[2] = i_1543_ * i_1540_ + 8192 >> 14;
		is_1539_[3] = i_1540_ * i_1545_ + 8192 >> 14;
		is_1539_[4] = i_1540_ * i_1544_ + 8192 >> 14;
		is_1539_[5] = -i_1541_;
		is_1539_[6]
		    = -i_1543_ * i_1544_ + i_1542_ * i_1547_ + 8192 >> 14;
		is_1539_[7]
		    = i_1543_ * i_1545_ + i_1542_ * i_1546_ + 8192 >> 14;
		is_1539_[8] = i_1542_ * i_1540_ + 8192 >> 14;
		int i_1548_
		    = ((is_1539_[0] * -anInt9426 + is_1539_[1] * -anInt9468
			+ is_1539_[2] * -anInt9401 + 8192)
		       >> 14);
		int i_1549_
		    = ((is_1539_[3] * -anInt9426 + is_1539_[4] * -anInt9468
			+ is_1539_[5] * -anInt9401 + 8192)
		       >> 14);
		int i_1550_
		    = ((is_1539_[6] * -anInt9426 + is_1539_[7] * -anInt9468
			+ is_1539_[8] * -anInt9401 + 8192)
		       >> 14);
		int i_1551_ = i_1548_ + anInt9426;
		int i_1552_ = i_1549_ + anInt9468;
		int i_1553_ = i_1550_ + anInt9401;
		int[] is_1554_ = new int[9];
		for (int i_1555_ = 0; i_1555_ < 3; i_1555_++) {
		    for (int i_1556_ = 0; i_1556_ < 3; i_1556_++) {
			int i_1557_ = 0;
			for (int i_1558_ = 0; i_1558_ < 3; i_1558_++)
			    i_1557_ += (is_1539_[i_1555_ * 3 + i_1558_]
					* is_1514_[i_1556_ * 3 + i_1558_]);
			is_1554_[i_1555_ * 3 + i_1556_] = i_1557_ + 8192 >> 14;
		    }
		}
		int i_1559_ = ((is_1539_[0] * i_1533_ + is_1539_[1] * i_1534_
				+ is_1539_[2] * i_1535_ + 8192)
			       >> 14);
		int i_1560_ = ((is_1539_[3] * i_1533_ + is_1539_[4] * i_1534_
				+ is_1539_[5] * i_1535_ + 8192)
			       >> 14);
		int i_1561_ = ((is_1539_[6] * i_1533_ + is_1539_[7] * i_1534_
				+ is_1539_[8] * i_1535_ + 8192)
			       >> 14);
		i_1559_ += i_1551_;
		i_1560_ += i_1552_;
		i_1561_ += i_1553_;
		int[] is_1562_ = new int[9];
		for (int i_1563_ = 0; i_1563_ < 3; i_1563_++) {
		    for (int i_1564_ = 0; i_1564_ < 3; i_1564_++) {
			int i_1565_ = 0;
			for (int i_1566_ = 0; i_1566_ < 3; i_1566_++)
			    i_1565_ += (is_1514_[i_1563_ * 3 + i_1566_]
					* is_1554_[i_1564_ + i_1566_ * 3]);
			is_1562_[i_1563_ * 3 + i_1564_] = i_1565_ + 8192 >> 14;
		    }
		}
		int i_1567_ = ((is_1514_[0] * i_1559_ + is_1514_[1] * i_1560_
				+ is_1514_[2] * i_1561_ + 8192)
			       >> 14);
		int i_1568_ = ((is_1514_[3] * i_1559_ + is_1514_[4] * i_1560_
				+ is_1514_[5] * i_1561_ + 8192)
			       >> 14);
		int i_1569_ = ((is_1514_[6] * i_1559_ + is_1514_[7] * i_1560_
				+ is_1514_[8] * i_1561_ + 8192)
			       >> 14);
		i_1567_ += i_1530_;
		i_1568_ += i_1531_;
		i_1569_ += i_1532_;
		for (int i_1570_ = 0; i_1570_ < i_1515_; i_1570_++) {
		    int i_1571_ = is[i_1570_];
		    if (i_1571_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_1572_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_1571_]);
			for (int i_1573_ = 0; i_1573_ < is_1572_.length;
			     i_1573_++) {
			    int i_1574_ = is_1572_[i_1573_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_1513_ & (((Class89_Sub2) this)
						.aShortArray9465[i_1574_]))
				    != 0)) {
				int i_1575_
				    = (is_1562_[0] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1574_])
				       + is_1562_[1] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1574_])
				       + is_1562_[2] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1574_])
				       + 8192) >> 14;
				int i_1576_
				    = (is_1562_[3] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1574_])
				       + is_1562_[4] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1574_])
				       + is_1562_[5] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1574_])
				       + 8192) >> 14;
				int i_1577_
				    = (is_1562_[6] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1574_])
				       + is_1562_[7] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1574_])
				       + is_1562_[8] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1574_])
				       + 8192) >> 14;
				i_1575_ += i_1567_;
				i_1576_ += i_1568_;
				i_1577_ += i_1569_;
				((Class89_Sub2) this).anIntArray9411[i_1574_]
				    = i_1575_;
				((Class89_Sub2) this).anIntArray9412[i_1574_]
				    = i_1576_;
				((Class89_Sub2) this).anIntArray9413[i_1574_]
				    = i_1577_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1578_ = 0; i_1578_ < i_1515_; i_1578_++) {
		    int i_1579_ = is[i_1578_];
		    if (i_1579_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_1580_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_1579_]);
			for (int i_1581_ = 0; i_1581_ < is_1580_.length;
			     i_1581_++) {
			    int i_1582_ = is_1580_[i_1581_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_1513_ & (((Class89_Sub2) this)
						.aShortArray9465[i_1582_]))
				    != 0)) {
				((Class89_Sub2) this).anIntArray9411[i_1582_]
				    -= anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_1582_]
				    -= anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_1582_]
				    -= anInt9401;
				if (i_1512_ != 0) {
				    int i_1583_
					= Class282.anIntArray4430[i_1512_];
				    int i_1584_
					= Class282.anIntArray4441[i_1512_];
				    int i_1585_
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_1582_]) * i_1583_
					   + ((((Class89_Sub2) this)
					       .anIntArray9411[i_1582_])
					      * i_1584_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9412
					[i_1582_]
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_1582_]) * i_1584_
					   - ((((Class89_Sub2) this)
					       .anIntArray9411[i_1582_])
					      * i_1583_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9411
					[i_1582_]
					= i_1585_;
				}
				if (i_1510_ != 0) {
				    int i_1586_
					= Class282.anIntArray4430[i_1510_];
				    int i_1587_
					= Class282.anIntArray4441[i_1510_];
				    int i_1588_
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_1582_]) * i_1587_
					   - ((((Class89_Sub2) this)
					       .anIntArray9413[i_1582_])
					      * i_1586_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9413
					[i_1582_]
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_1582_]) * i_1586_
					   + ((((Class89_Sub2) this)
					       .anIntArray9413[i_1582_])
					      * i_1587_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9412
					[i_1582_]
					= i_1588_;
				}
				if (i_1511_ != 0) {
				    int i_1589_
					= Class282.anIntArray4430[i_1511_];
				    int i_1590_
					= Class282.anIntArray4441[i_1511_];
				    int i_1591_
					= ((((Class89_Sub2) this)
					    .anIntArray9413[i_1582_]) * i_1589_
					   + ((((Class89_Sub2) this)
					       .anIntArray9411[i_1582_])
					      * i_1590_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9413
					[i_1582_]
					= ((((Class89_Sub2) this)
					    .anIntArray9413[i_1582_]) * i_1590_
					   - ((((Class89_Sub2) this)
					       .anIntArray9411[i_1582_])
					      * i_1589_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9411
					[i_1582_]
					= i_1591_;
				}
				((Class89_Sub2) this).anIntArray9411[i_1582_]
				    += anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_1582_]
				    += anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_1582_]
				    += anInt9401;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1592_ = 0; i_1592_ < i_1515_; i_1592_++) {
			int i_1593_ = is[i_1592_];
			if (i_1593_ < (((Class89_Sub2) this)
				       .anIntArrayArray9467).length) {
			    int[] is_1594_ = (((Class89_Sub2) this)
					      .anIntArrayArray9467[i_1593_]);
			    for (int i_1595_ = 0; i_1595_ < is_1594_.length;
				 i_1595_++) {
				int i_1596_ = is_1594_[i_1595_];
				if ((((Class89_Sub2) this).aShortArray9465
				     == null)
				    || ((i_1513_ & (((Class89_Sub2) this)
						    .aShortArray9465[i_1596_]))
					!= 0)) {
				    int i_1597_ = (((Class89_Sub2) this)
						   .anIntArray9395[i_1596_]);
				    int i_1598_
					= (((Class89_Sub2) this).anIntArray9395
					   [i_1596_ + 1]);
				    for (int i_1599_ = i_1597_;
					 (i_1599_ < i_1598_
					  && (((Class89_Sub2) this)
					      .aShortArray9455[i_1599_]) != 0);
					 i_1599_++) {
					int i_1600_
					    = (((((Class89_Sub2) this)
						 .aShortArray9455[i_1599_])
						& 0xffff)
					       - 1);
					if (i_1512_ != 0) {
					    int i_1601_
						= (Class282.anIntArray4430
						   [i_1512_]);
					    int i_1602_
						= (Class282.anIntArray4441
						   [i_1512_]);
					    int i_1603_
						= (((((Class89_Sub2) this)
						     .aShortArray9418
						     [i_1600_]) * i_1601_
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_1600_]) * i_1602_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9418[i_1600_]
						= (short) ((((((Class89_Sub2)
							       this)
							      .aShortArray9418
							      [i_1600_])
							     * i_1602_)
							    - ((((Class89_Sub2)
								 this)
								.aShortArray9417
								[i_1600_])
							       * i_1601_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9417[i_1600_]
						= (short) i_1603_;
					}
					if (i_1510_ != 0) {
					    int i_1604_
						= (Class282.anIntArray4430
						   [i_1510_]);
					    int i_1605_
						= (Class282.anIntArray4441
						   [i_1510_]);
					    int i_1606_
						= (((((Class89_Sub2) this)
						     .aShortArray9418
						     [i_1600_]) * i_1605_
						    - (((Class89_Sub2) this)
						       .aShortArray9419
						       [i_1600_]) * i_1604_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9419[i_1600_]
						= (short) ((((((Class89_Sub2)
							       this)
							      .aShortArray9418
							      [i_1600_])
							     * i_1604_)
							    + ((((Class89_Sub2)
								 this)
								.aShortArray9419
								[i_1600_])
							       * i_1605_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9418[i_1600_]
						= (short) i_1606_;
					}
					if (i_1511_ != 0) {
					    int i_1607_
						= (Class282.anIntArray4430
						   [i_1511_]);
					    int i_1608_
						= (Class282.anIntArray4441
						   [i_1511_]);
					    int i_1609_
						= (((((Class89_Sub2) this)
						     .aShortArray9419
						     [i_1600_]) * i_1607_
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_1600_]) * i_1608_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9419[i_1600_]
						= (short) ((((((Class89_Sub2)
							       this)
							      .aShortArray9419
							      [i_1600_])
							     * i_1608_)
							    - ((((Class89_Sub2)
								 this)
								.aShortArray9417
								[i_1600_])
							       * i_1607_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9417[i_1600_]
						= (short) i_1609_;
					}
				    }
				}
			    }
			}
		    }
		    if (((Class89_Sub2) this).aClass151_9436 == null
			&& ((Class89_Sub2) this).aClass151_9433 != null)
			((Class151) ((Class89_Sub2) this).aClass151_9433)
			    .anInterface8_1713
			    = null;
		    if (((Class89_Sub2) this).aClass151_9436 != null)
			((Class151) ((Class89_Sub2) this).aClass151_9436)
			    .anInterface8_1713
			    = null;
		}
	    }
	} else if (i == 3) {
	    if (is_1514_ != null) {
		int i_1610_ = is_1514_[9] << 4;
		int i_1611_ = is_1514_[10] << 4;
		int i_1612_ = is_1514_[11] << 4;
		int i_1613_ = is_1514_[12] << 4;
		int i_1614_ = is_1514_[13] << 4;
		int i_1615_ = is_1514_[14] << 4;
		if (aBool9470) {
		    int i_1616_
			= ((is_1514_[0] * anInt9426 + is_1514_[3] * anInt9468
			    + is_1514_[6] * anInt9401 + 8192)
			   >> 14);
		    int i_1617_
			= ((is_1514_[1] * anInt9426 + is_1514_[4] * anInt9468
			    + is_1514_[7] * anInt9401 + 8192)
			   >> 14);
		    int i_1618_
			= ((is_1514_[2] * anInt9426 + is_1514_[5] * anInt9468
			    + is_1514_[8] * anInt9401 + 8192)
			   >> 14);
		    i_1616_ += i_1613_;
		    i_1617_ += i_1614_;
		    i_1618_ += i_1615_;
		    anInt9426 = i_1616_;
		    anInt9468 = i_1617_;
		    anInt9401 = i_1618_;
		    aBool9470 = false;
		}
		int i_1619_ = i_1510_ << 15 >> 7;
		int i_1620_ = i_1511_ << 15 >> 7;
		int i_1621_ = i_1512_ << 15 >> 7;
		int i_1622_ = i_1619_ * -anInt9426 + 8192 >> 14;
		int i_1623_ = i_1620_ * -anInt9468 + 8192 >> 14;
		int i_1624_ = i_1621_ * -anInt9401 + 8192 >> 14;
		int i_1625_ = i_1622_ + anInt9426;
		int i_1626_ = i_1623_ + anInt9468;
		int i_1627_ = i_1624_ + anInt9401;
		int[] is_1628_ = new int[9];
		is_1628_[0] = i_1619_ * is_1514_[0] + 8192 >> 14;
		is_1628_[1] = i_1619_ * is_1514_[3] + 8192 >> 14;
		is_1628_[2] = i_1619_ * is_1514_[6] + 8192 >> 14;
		is_1628_[3] = i_1620_ * is_1514_[1] + 8192 >> 14;
		is_1628_[4] = i_1620_ * is_1514_[4] + 8192 >> 14;
		is_1628_[5] = i_1620_ * is_1514_[7] + 8192 >> 14;
		is_1628_[6] = i_1621_ * is_1514_[2] + 8192 >> 14;
		is_1628_[7] = i_1621_ * is_1514_[5] + 8192 >> 14;
		is_1628_[8] = i_1621_ * is_1514_[8] + 8192 >> 14;
		int i_1629_ = i_1619_ * i_1613_ + 8192 >> 14;
		int i_1630_ = i_1620_ * i_1614_ + 8192 >> 14;
		int i_1631_ = i_1621_ * i_1615_ + 8192 >> 14;
		i_1629_ += i_1625_;
		i_1630_ += i_1626_;
		i_1631_ += i_1627_;
		int[] is_1632_ = new int[9];
		for (int i_1633_ = 0; i_1633_ < 3; i_1633_++) {
		    for (int i_1634_ = 0; i_1634_ < 3; i_1634_++) {
			int i_1635_ = 0;
			for (int i_1636_ = 0; i_1636_ < 3; i_1636_++)
			    i_1635_ += (is_1514_[i_1633_ * 3 + i_1636_]
					* is_1628_[i_1634_ + i_1636_ * 3]);
			is_1632_[i_1633_ * 3 + i_1634_] = i_1635_ + 8192 >> 14;
		    }
		}
		int i_1637_ = ((is_1514_[0] * i_1629_ + is_1514_[1] * i_1630_
				+ is_1514_[2] * i_1631_ + 8192)
			       >> 14);
		int i_1638_ = ((is_1514_[3] * i_1629_ + is_1514_[4] * i_1630_
				+ is_1514_[5] * i_1631_ + 8192)
			       >> 14);
		int i_1639_ = ((is_1514_[6] * i_1629_ + is_1514_[7] * i_1630_
				+ is_1514_[8] * i_1631_ + 8192)
			       >> 14);
		i_1637_ += i_1610_;
		i_1638_ += i_1611_;
		i_1639_ += i_1612_;
		for (int i_1640_ = 0; i_1640_ < i_1515_; i_1640_++) {
		    int i_1641_ = is[i_1640_];
		    if (i_1641_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_1642_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_1641_]);
			for (int i_1643_ = 0; i_1643_ < is_1642_.length;
			     i_1643_++) {
			    int i_1644_ = is_1642_[i_1643_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_1513_ & (((Class89_Sub2) this)
						.aShortArray9465[i_1644_]))
				    != 0)) {
				int i_1645_
				    = (is_1632_[0] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1644_])
				       + is_1632_[1] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1644_])
				       + is_1632_[2] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1644_])
				       + 8192) >> 14;
				int i_1646_
				    = (is_1632_[3] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1644_])
				       + is_1632_[4] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1644_])
				       + is_1632_[5] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1644_])
				       + 8192) >> 14;
				int i_1647_
				    = (is_1632_[6] * (((Class89_Sub2) this)
						      .anIntArray9411[i_1644_])
				       + is_1632_[7] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_1644_])
				       + is_1632_[8] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_1644_])
				       + 8192) >> 14;
				i_1645_ += i_1637_;
				i_1646_ += i_1638_;
				i_1647_ += i_1639_;
				((Class89_Sub2) this).anIntArray9411[i_1644_]
				    = i_1645_;
				((Class89_Sub2) this).anIntArray9412[i_1644_]
				    = i_1646_;
				((Class89_Sub2) this).anIntArray9413[i_1644_]
				    = i_1647_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1648_ = 0; i_1648_ < i_1515_; i_1648_++) {
		    int i_1649_ = is[i_1648_];
		    if (i_1649_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_1650_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_1649_]);
			for (int i_1651_ = 0; i_1651_ < is_1650_.length;
			     i_1651_++) {
			    int i_1652_ = is_1650_[i_1651_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_1513_ & (((Class89_Sub2) this)
						.aShortArray9465[i_1652_]))
				    != 0)) {
				((Class89_Sub2) this).anIntArray9411[i_1652_]
				    -= anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_1652_]
				    -= anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_1652_]
				    -= anInt9401;
				((Class89_Sub2) this).anIntArray9411[i_1652_]
				    = (((Class89_Sub2) this).anIntArray9411
				       [i_1652_]) * i_1510_ >> 7;
				((Class89_Sub2) this).anIntArray9412[i_1652_]
				    = (((Class89_Sub2) this).anIntArray9412
				       [i_1652_]) * i_1511_ >> 7;
				((Class89_Sub2) this).anIntArray9413[i_1652_]
				    = (((Class89_Sub2) this).anIntArray9413
				       [i_1652_]) * i_1512_ >> 7;
				((Class89_Sub2) this).anIntArray9411[i_1652_]
				    += anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_1652_]
				    += anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_1652_]
				    += anInt9401;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_1653_ = 0; i_1653_ < i_1515_; i_1653_++) {
		    int i_1654_ = is[i_1653_];
		    if (i_1654_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_1655_ = (((Class89_Sub2) this)
					  .anIntArrayArray9432[i_1654_]);
			for (int i_1656_ = 0; i_1656_ < is_1655_.length;
			     i_1656_++) {
			    int i_1657_ = is_1655_[i_1656_];
			    if (((Class89_Sub2) this).aShortArray9415 == null
				|| ((i_1513_ & (((Class89_Sub2) this)
						.aShortArray9415[i_1657_]))
				    != 0)) {
				int i_1658_ = (((((Class89_Sub2) this)
						 .aByteArray9408[i_1657_])
						& 0xff)
					       + i_1510_ * 8);
				if (i_1658_ < 0)
				    i_1658_ = 0;
				else if (i_1658_ > 255)
				    i_1658_ = 255;
				((Class89_Sub2) this).aByteArray9408[i_1657_]
				    = (byte) i_1658_;
				if (((Class89_Sub2) this).aClass151_9433
				    != null)
				    ((Class151)
				     ((Class89_Sub2) this).aClass151_9433)
					.anInterface8_1713
					= null;
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_1659_ = 0;
			 i_1659_ < ((Class89_Sub2) this).anInt9427;
			 i_1659_++) {
			Class171 class171 = (((Class89_Sub2) this)
					     .aClass171Array9459[i_1659_]);
			Class140 class140 = (((Class89_Sub2) this)
					     .aClass140Array9460[i_1659_]);
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & 0xffffff
			       | 255 - ((((Class89_Sub2) this).aByteArray9408
					 [((Class171) class171).anInt2069])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_1660_ = 0; i_1660_ < i_1515_; i_1660_++) {
		    int i_1661_ = is[i_1660_];
		    if (i_1661_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_1662_ = (((Class89_Sub2) this)
					  .anIntArrayArray9432[i_1661_]);
			for (int i_1663_ = 0; i_1663_ < is_1662_.length;
			     i_1663_++) {
			    int i_1664_ = is_1662_[i_1663_];
			    if (((Class89_Sub2) this).aShortArray9415 == null
				|| ((i_1513_ & (((Class89_Sub2) this)
						.aShortArray9415[i_1664_]))
				    != 0)) {
				int i_1665_ = ((((Class89_Sub2) this)
						.aShortArray9442[i_1664_])
					       & 0xffff);
				int i_1666_ = i_1665_ >> 10 & 0x3f;
				int i_1667_ = i_1665_ >> 7 & 0x7;
				int i_1668_ = i_1665_ & 0x7f;
				i_1666_ = i_1666_ + i_1510_ & 0x3f;
				i_1667_ += i_1511_ / 4;
				if (i_1667_ < 0)
				    i_1667_ = 0;
				else if (i_1667_ > 7)
				    i_1667_ = 7;
				i_1668_ += i_1512_;
				if (i_1668_ < 0)
				    i_1668_ = 0;
				else if (i_1668_ > 127)
				    i_1668_ = 127;
				((Class89_Sub2) this).aShortArray9442[i_1664_]
				    = (short) (i_1666_ << 10 | i_1667_ << 7
					       | i_1668_);
				if (((Class89_Sub2) this).aClass151_9433
				    != null)
				    ((Class151)
				     ((Class89_Sub2) this).aClass151_9433)
					.anInterface8_1713
					= null;
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_1669_ = 0;
			 i_1669_ < ((Class89_Sub2) this).anInt9427;
			 i_1669_++) {
			Class171 class171 = (((Class89_Sub2) this)
					     .aClass171Array9459[i_1669_]);
			Class140 class140 = (((Class89_Sub2) this)
					     .aClass140Array9460[i_1669_]);
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & ~0xffffff
			       | (Class474.anIntArray6383
				  [((((Class89_Sub2) this).aShortArray9442
				     [((Class171) class171).anInt2069])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_1670_ = 0; i_1670_ < i_1515_; i_1670_++) {
		    int i_1671_ = is[i_1670_];
		    if (i_1671_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_1672_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_1671_]);
			for (int i_1673_ = 0; i_1673_ < is_1672_.length;
			     i_1673_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_1672_[i_1673_]]);
			    ((Class140) class140).anInt1628 += i_1510_;
			    ((Class140) class140).anInt1629 += i_1511_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_1674_ = 0; i_1674_ < i_1515_; i_1674_++) {
		    int i_1675_ = is[i_1674_];
		    if (i_1675_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_1676_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_1675_]);
			for (int i_1677_ = 0; i_1677_ < is_1676_.length;
			     i_1677_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_1676_[i_1677_]]);
			    ((Class140) class140).anInt1626
				= (((Class140) class140).anInt1626 * i_1510_
				   >> 7);
			    ((Class140) class140).anInt1627
				= (((Class140) class140).anInt1627 * i_1511_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_1678_ = 0; i_1678_ < i_1515_; i_1678_++) {
		    int i_1679_ = is[i_1678_];
		    if (i_1679_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_1680_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_1679_]);
			for (int i_1681_ = 0; i_1681_ < is_1680_.length;
			     i_1681_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_1680_[i_1681_]]);
			    ((Class140) class140).anInt1625
				= (((Class140) class140).anInt1625 + i_1510_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public int method1866() {
	return ((Class89_Sub2) this).anInt9402;
    }
    
    public int method2001() {
	return ((Class89_Sub2) this).aShort9405;
    }
    
    public void method1967(Class266 class266, Class97 class97, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (((Class89_Sub2) this).anInt9416 != 0) {
	    Class268 class268
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9122);
	    Class268 class268_1682_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9136);
	    Class268 class268_1683_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9161);
	    class268_1682_.method5203(class266);
	    class268_1683_.method5199(class268_1682_);
	    class268_1683_.method5202(((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aClass268_9105);
	    if (!((Class89_Sub2) this).aBool9444)
		method15537();
	    float[] fs
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aFloatArray9126);
	    class268_1682_.method5208(0.0F,
				      (float) ((Class89_Sub2) this).aShort9403,
				      0.0F, fs);
	    float f = fs[0];
	    float f_1684_ = fs[1];
	    float f_1685_ = fs[2];
	    class268_1682_.method5208(0.0F,
				      (float) ((Class89_Sub2) this).aShort9446,
				      0.0F, fs);
	    float f_1686_ = fs[0];
	    float f_1687_ = fs[1];
	    float f_1688_ = fs[2];
	    for (int i_1689_ = 0; i_1689_ < 6; i_1689_++) {
		float[] fs_1690_ = (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloatArrayArray9139[i_1689_]);
		float f_1691_ = (fs_1690_[0] * f + fs_1690_[1] * f_1684_
				 + fs_1690_[2] * f_1685_ + fs_1690_[3]
				 + (float) ((Class89_Sub2) this).anInt9421);
		float f_1692_ = (fs_1690_[0] * f_1686_ + fs_1690_[1] * f_1687_
				 + fs_1690_[2] * f_1688_ + fs_1690_[3]
				 + (float) ((Class89_Sub2) this).anInt9421);
		if (f_1691_ < 0.0F && f_1692_ < 0.0F)
		    return;
	    }
	    if (class97 != null) {
		boolean bool = false;
		boolean bool_1693_ = true;
		int i_1694_ = ((((Class89_Sub2) this).aShort9447
				+ ((Class89_Sub2) this).aShort9448)
			       >> 1);
		int i_1695_ = ((((Class89_Sub2) this).aShort9449
				+ ((Class89_Sub2) this).aShort9450)
			       >> 1);
		int i_1696_ = i_1694_;
		short i_1697_ = ((Class89_Sub2) this).aShort9403;
		int i_1698_ = i_1695_;
		float f_1699_
		    = (class268_1683_.aFloatArray4353[0] * (float) i_1696_
		       + class268_1683_.aFloatArray4353[4] * (float) i_1697_
		       + class268_1683_.aFloatArray4353[8] * (float) i_1698_
		       + class268_1683_.aFloatArray4353[12]);
		float f_1700_
		    = (class268_1683_.aFloatArray4353[1] * (float) i_1696_
		       + class268_1683_.aFloatArray4353[5] * (float) i_1697_
		       + class268_1683_.aFloatArray4353[9] * (float) i_1698_
		       + class268_1683_.aFloatArray4353[13]);
		float f_1701_
		    = (class268_1683_.aFloatArray4353[2] * (float) i_1696_
		       + class268_1683_.aFloatArray4353[6] * (float) i_1697_
		       + class268_1683_.aFloatArray4353[10] * (float) i_1698_
		       + class268_1683_.aFloatArray4353[14]);
		float f_1702_
		    = (class268_1683_.aFloatArray4353[3] * (float) i_1696_
		       + class268_1683_.aFloatArray4353[7] * (float) i_1697_
		       + class268_1683_.aFloatArray4353[11] * (float) i_1698_
		       + class268_1683_.aFloatArray4353[15]);
		if (f_1701_ >= -f_1702_) {
		    class97.anInt1349
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9127)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9128) * f_1699_ / f_1702_);
		    class97.anInt1347
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9129)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9130) * f_1700_ / f_1702_);
		} else
		    bool = true;
		i_1696_ = i_1694_;
		i_1697_ = ((Class89_Sub2) this).aShort9446;
		i_1698_ = i_1695_;
		float f_1703_
		    = (class268_1683_.aFloatArray4353[0] * (float) i_1696_
		       + class268_1683_.aFloatArray4353[4] * (float) i_1697_
		       + class268_1683_.aFloatArray4353[8] * (float) i_1698_
		       + class268_1683_.aFloatArray4353[12]);
		float f_1704_
		    = (class268_1683_.aFloatArray4353[1] * (float) i_1696_
		       + class268_1683_.aFloatArray4353[5] * (float) i_1697_
		       + class268_1683_.aFloatArray4353[9] * (float) i_1698_
		       + class268_1683_.aFloatArray4353[13]);
		float f_1705_
		    = (class268_1683_.aFloatArray4353[2] * (float) i_1696_
		       + class268_1683_.aFloatArray4353[6] * (float) i_1697_
		       + class268_1683_.aFloatArray4353[10] * (float) i_1698_
		       + class268_1683_.aFloatArray4353[14]);
		float f_1706_
		    = (class268_1683_.aFloatArray4353[3] * (float) i_1696_
		       + class268_1683_.aFloatArray4353[7] * (float) i_1697_
		       + class268_1683_.aFloatArray4353[11] * (float) i_1698_
		       + class268_1683_.aFloatArray4353[15]);
		if (f_1705_ >= -f_1706_) {
		    class97.anInt1350
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9127)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9128) * f_1703_ / f_1706_);
		    class97.anInt1351
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9129)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9130) * f_1704_ / f_1706_);
		} else
		    bool = true;
		if (bool) {
		    if (f_1701_ < -f_1702_ && f_1705_ < -f_1706_)
			bool_1693_ = false;
		    else if (f_1701_ < -f_1702_) {
			float f_1707_
			    = (f_1701_ + f_1702_) / (f_1705_ + f_1706_) - 1.0F;
			float f_1708_
			    = f_1699_ + f_1707_ * (f_1703_ - f_1699_);
			float f_1709_
			    = f_1700_ + f_1707_ * (f_1704_ - f_1700_);
			float f_1710_
			    = f_1702_ + f_1707_ * (f_1706_ - f_1702_);
			class97.anInt1349
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_1708_ / f_1710_));
			class97.anInt1347
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9129)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9130
					* f_1709_ / f_1710_));
		    } else if (f_1705_ < -f_1706_) {
			float f_1711_
			    = (f_1705_ + f_1706_) / (f_1701_ + f_1702_) - 1.0F;
			float f_1712_
			    = f_1703_ + f_1711_ * (f_1699_ - f_1703_);
			float f_1713_
			    = f_1704_ + f_1711_ * (f_1700_ - f_1704_);
			float f_1714_
			    = f_1706_ + f_1711_ * (f_1702_ - f_1706_);
			class97.anInt1350
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_1712_ / f_1714_));
			class97.anInt1351
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9129)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9130
					* f_1713_ / f_1714_));
		    }
		}
		if (bool_1693_) {
		    if (f_1701_ / f_1702_ > f_1705_ / f_1706_) {
			float f_1715_
			    = (f_1699_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[12]);
			float f_1716_
			    = (f_1702_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     - (float) class97.anInt1349
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_1715_ / f_1716_));
		    } else {
			float f_1717_
			    = (f_1703_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[12]);
			float f_1718_
			    = (f_1706_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     - (float) class97.anInt1350
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_1717_ / f_1718_));
		    }
		    class97.aBool1352 = true;
		}
	    }
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15259();
	    ((Class89_Sub2) this).aClass103_Sub1_9457
		.method15151(class268_1682_);
	    method15540();
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15144();
	    class268_1682_.method5202(((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aClass268_9150);
	    method15567(class268_1682_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    public void method2006(Class266 class266, Class97 class97, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (((Class89_Sub2) this).anInt9416 != 0) {
	    Class268 class268
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9122);
	    Class268 class268_1719_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9136);
	    Class268 class268_1720_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9161);
	    class268_1719_.method5203(class266);
	    class268_1720_.method5199(class268_1719_);
	    class268_1720_.method5202(((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aClass268_9105);
	    if (!((Class89_Sub2) this).aBool9444)
		method15537();
	    float[] fs
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aFloatArray9126);
	    class268_1719_.method5208(0.0F,
				      (float) ((Class89_Sub2) this).aShort9403,
				      0.0F, fs);
	    float f = fs[0];
	    float f_1721_ = fs[1];
	    float f_1722_ = fs[2];
	    class268_1719_.method5208(0.0F,
				      (float) ((Class89_Sub2) this).aShort9446,
				      0.0F, fs);
	    float f_1723_ = fs[0];
	    float f_1724_ = fs[1];
	    float f_1725_ = fs[2];
	    for (int i_1726_ = 0; i_1726_ < 6; i_1726_++) {
		float[] fs_1727_ = (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloatArrayArray9139[i_1726_]);
		float f_1728_ = (fs_1727_[0] * f + fs_1727_[1] * f_1721_
				 + fs_1727_[2] * f_1722_ + fs_1727_[3]
				 + (float) ((Class89_Sub2) this).anInt9421);
		float f_1729_ = (fs_1727_[0] * f_1723_ + fs_1727_[1] * f_1724_
				 + fs_1727_[2] * f_1725_ + fs_1727_[3]
				 + (float) ((Class89_Sub2) this).anInt9421);
		if (f_1728_ < 0.0F && f_1729_ < 0.0F)
		    return;
	    }
	    if (class97 != null) {
		boolean bool = false;
		boolean bool_1730_ = true;
		int i_1731_ = ((((Class89_Sub2) this).aShort9447
				+ ((Class89_Sub2) this).aShort9448)
			       >> 1);
		int i_1732_ = ((((Class89_Sub2) this).aShort9449
				+ ((Class89_Sub2) this).aShort9450)
			       >> 1);
		int i_1733_ = i_1731_;
		short i_1734_ = ((Class89_Sub2) this).aShort9403;
		int i_1735_ = i_1732_;
		float f_1736_
		    = (class268_1720_.aFloatArray4353[0] * (float) i_1733_
		       + class268_1720_.aFloatArray4353[4] * (float) i_1734_
		       + class268_1720_.aFloatArray4353[8] * (float) i_1735_
		       + class268_1720_.aFloatArray4353[12]);
		float f_1737_
		    = (class268_1720_.aFloatArray4353[1] * (float) i_1733_
		       + class268_1720_.aFloatArray4353[5] * (float) i_1734_
		       + class268_1720_.aFloatArray4353[9] * (float) i_1735_
		       + class268_1720_.aFloatArray4353[13]);
		float f_1738_
		    = (class268_1720_.aFloatArray4353[2] * (float) i_1733_
		       + class268_1720_.aFloatArray4353[6] * (float) i_1734_
		       + class268_1720_.aFloatArray4353[10] * (float) i_1735_
		       + class268_1720_.aFloatArray4353[14]);
		float f_1739_
		    = (class268_1720_.aFloatArray4353[3] * (float) i_1733_
		       + class268_1720_.aFloatArray4353[7] * (float) i_1734_
		       + class268_1720_.aFloatArray4353[11] * (float) i_1735_
		       + class268_1720_.aFloatArray4353[15]);
		if (f_1738_ >= -f_1739_) {
		    class97.anInt1349
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9127)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9128) * f_1736_ / f_1739_);
		    class97.anInt1347
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9129)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9130) * f_1737_ / f_1739_);
		} else
		    bool = true;
		i_1733_ = i_1731_;
		i_1734_ = ((Class89_Sub2) this).aShort9446;
		i_1735_ = i_1732_;
		float f_1740_
		    = (class268_1720_.aFloatArray4353[0] * (float) i_1733_
		       + class268_1720_.aFloatArray4353[4] * (float) i_1734_
		       + class268_1720_.aFloatArray4353[8] * (float) i_1735_
		       + class268_1720_.aFloatArray4353[12]);
		float f_1741_
		    = (class268_1720_.aFloatArray4353[1] * (float) i_1733_
		       + class268_1720_.aFloatArray4353[5] * (float) i_1734_
		       + class268_1720_.aFloatArray4353[9] * (float) i_1735_
		       + class268_1720_.aFloatArray4353[13]);
		float f_1742_
		    = (class268_1720_.aFloatArray4353[2] * (float) i_1733_
		       + class268_1720_.aFloatArray4353[6] * (float) i_1734_
		       + class268_1720_.aFloatArray4353[10] * (float) i_1735_
		       + class268_1720_.aFloatArray4353[14]);
		float f_1743_
		    = (class268_1720_.aFloatArray4353[3] * (float) i_1733_
		       + class268_1720_.aFloatArray4353[7] * (float) i_1734_
		       + class268_1720_.aFloatArray4353[11] * (float) i_1735_
		       + class268_1720_.aFloatArray4353[15]);
		if (f_1742_ >= -f_1743_) {
		    class97.anInt1350
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9127)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9128) * f_1740_ / f_1743_);
		    class97.anInt1351
			= (int) ((((Class103_Sub1)
				   ((Class89_Sub2) this).aClass103_Sub1_9457)
				  .aFloat9129)
				 + (((Class103_Sub1)
				     ((Class89_Sub2) this).aClass103_Sub1_9457)
				    .aFloat9130) * f_1741_ / f_1743_);
		} else
		    bool = true;
		if (bool) {
		    if (f_1738_ < -f_1739_ && f_1742_ < -f_1743_)
			bool_1730_ = false;
		    else if (f_1738_ < -f_1739_) {
			float f_1744_
			    = (f_1738_ + f_1739_) / (f_1742_ + f_1743_) - 1.0F;
			float f_1745_
			    = f_1736_ + f_1744_ * (f_1740_ - f_1736_);
			float f_1746_
			    = f_1737_ + f_1744_ * (f_1741_ - f_1737_);
			float f_1747_
			    = f_1739_ + f_1744_ * (f_1743_ - f_1739_);
			class97.anInt1349
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_1745_ / f_1747_));
			class97.anInt1347
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9129)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9130
					* f_1746_ / f_1747_));
		    } else if (f_1742_ < -f_1743_) {
			float f_1748_
			    = (f_1742_ + f_1743_) / (f_1738_ + f_1739_) - 1.0F;
			float f_1749_
			    = f_1740_ + f_1748_ * (f_1736_ - f_1740_);
			float f_1750_
			    = f_1741_ + f_1748_ * (f_1737_ - f_1741_);
			float f_1751_
			    = f_1743_ + f_1748_ * (f_1739_ - f_1743_);
			class97.anInt1350
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_1749_ / f_1751_));
			class97.anInt1351
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9129)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9130
					* f_1750_ / f_1751_));
		    }
		}
		if (bool_1730_) {
		    if (f_1738_ / f_1739_ > f_1742_ / f_1743_) {
			float f_1752_
			    = (f_1736_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[12]);
			float f_1753_
			    = (f_1739_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     - (float) class97.anInt1349
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_1752_ / f_1753_));
		    } else {
			float f_1754_
			    = (f_1740_
			       + (class268.aFloatArray4353[0]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[12]);
			float f_1755_
			    = (f_1743_
			       + (class268.aFloatArray4353[3]
				  * (float) ((Class89_Sub2) this).anInt9421)
			       + class268.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     - (float) class97.anInt1350
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_1754_ / f_1755_));
		    }
		    class97.aBool1352 = true;
		}
	    }
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15259();
	    ((Class89_Sub2) this).aClass103_Sub1_9457
		.method15151(class268_1719_);
	    method15540();
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15144();
	    class268_1719_.method5202(((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aClass268_9150);
	    method15567(class268_1719_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    public boolean method1969(int i, int i_1756_, Class266 class266,
			      boolean bool, int i_1757_) {
	Class268 class268
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass268_9136);
	class268.method5203(class266);
	class268.method5202(((Class103_Sub1)
			     ((Class89_Sub2) this).aClass103_Sub1_9457)
			    .aClass268_9105);
	boolean bool_1758_ = false;
	int i_1759_ = 2147483647;
	int i_1760_ = -2147483648;
	int i_1761_ = 2147483647;
	int i_1762_ = -2147483648;
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i_1763_ = ((((Class89_Sub2) this).aShort9448
			- ((Class89_Sub2) this).aShort9447)
		       >> 1);
	int i_1764_ = ((((Class89_Sub2) this).aShort9446
			- ((Class89_Sub2) this).aShort9403)
		       >> 1);
	int i_1765_ = ((((Class89_Sub2) this).aShort9450
			- ((Class89_Sub2) this).aShort9449)
		       >> 1);
	int i_1766_ = ((Class89_Sub2) this).aShort9447 + i_1763_;
	int i_1767_ = ((Class89_Sub2) this).aShort9403 + i_1764_;
	int i_1768_ = ((Class89_Sub2) this).aShort9449 + i_1765_;
	int i_1769_ = i_1766_ - (i_1763_ << i_1757_);
	int i_1770_ = i_1767_ - (i_1764_ << i_1757_);
	int i_1771_ = i_1768_ - (i_1765_ << i_1757_);
	int i_1772_ = i_1766_ + (i_1763_ << i_1757_);
	int i_1773_ = i_1767_ + (i_1764_ << i_1757_);
	int i_1774_ = i_1768_ + (i_1765_ << i_1757_);
	anIntArray9464[0] = i_1769_;
	anIntArray9429[0] = i_1770_;
	anIntArray9466[0] = i_1771_;
	anIntArray9464[1] = i_1772_;
	anIntArray9429[1] = i_1770_;
	anIntArray9466[1] = i_1771_;
	anIntArray9464[2] = i_1769_;
	anIntArray9429[2] = i_1773_;
	anIntArray9466[2] = i_1771_;
	anIntArray9464[3] = i_1772_;
	anIntArray9429[3] = i_1773_;
	anIntArray9466[3] = i_1771_;
	anIntArray9464[4] = i_1769_;
	anIntArray9429[4] = i_1770_;
	anIntArray9466[4] = i_1774_;
	anIntArray9464[5] = i_1772_;
	anIntArray9429[5] = i_1770_;
	anIntArray9466[5] = i_1774_;
	anIntArray9464[6] = i_1769_;
	anIntArray9429[6] = i_1773_;
	anIntArray9466[6] = i_1774_;
	anIntArray9464[7] = i_1772_;
	anIntArray9429[7] = i_1773_;
	anIntArray9466[7] = i_1774_;
	for (int i_1775_ = 0; i_1775_ < 8; i_1775_++) {
	    int i_1776_ = anIntArray9464[i_1775_];
	    int i_1777_ = anIntArray9429[i_1775_];
	    int i_1778_ = anIntArray9466[i_1775_];
	    float f = (class268.aFloatArray4353[2] * (float) i_1776_
		       + class268.aFloatArray4353[6] * (float) i_1777_
		       + class268.aFloatArray4353[10] * (float) i_1778_
		       + class268.aFloatArray4353[14]);
	    float f_1779_ = (class268.aFloatArray4353[3] * (float) i_1776_
			     + class268.aFloatArray4353[7] * (float) i_1777_
			     + class268.aFloatArray4353[11] * (float) i_1778_
			     + class268.aFloatArray4353[15]);
	    if (f >= -f_1779_) {
		float f_1780_
		    = (class268.aFloatArray4353[0] * (float) i_1776_
		       + class268.aFloatArray4353[4] * (float) i_1777_
		       + class268.aFloatArray4353[8] * (float) i_1778_
		       + class268.aFloatArray4353[12]);
		float f_1781_
		    = (class268.aFloatArray4353[1] * (float) i_1776_
		       + class268.aFloatArray4353[5] * (float) i_1777_
		       + class268.aFloatArray4353[9] * (float) i_1778_
		       + class268.aFloatArray4353[13]);
		int i_1782_
		    = (int) ((((Class103_Sub1)
			       ((Class89_Sub2) this).aClass103_Sub1_9457)
			      .aFloat9127)
			     + (((Class103_Sub1)
				 ((Class89_Sub2) this).aClass103_Sub1_9457)
				.aFloat9128) * f_1780_ / f_1779_);
		int i_1783_
		    = (int) ((((Class103_Sub1)
			       ((Class89_Sub2) this).aClass103_Sub1_9457)
			      .aFloat9129)
			     + (((Class103_Sub1)
				 ((Class89_Sub2) this).aClass103_Sub1_9457)
				.aFloat9130) * f_1781_ / f_1779_);
		if (i_1782_ < i_1759_)
		    i_1759_ = i_1782_;
		if (i_1782_ > i_1760_)
		    i_1760_ = i_1782_;
		if (i_1783_ < i_1761_)
		    i_1761_ = i_1783_;
		if (i_1783_ > i_1762_)
		    i_1762_ = i_1783_;
		bool_1758_ = true;
	    }
	}
	if (bool_1758_ && i > i_1759_ && i < i_1760_ && i_1756_ > i_1761_
	    && i_1756_ < i_1762_) {
	    if (bool)
		return true;
	    if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		 .anIntArray9232).length
		< ((Class89_Sub2) this).anInt9416) {
		((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .anIntArray9232
		    = new int[((Class89_Sub2) this).anInt9416];
		((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .anIntArray9175
		    = new int[((Class89_Sub2) this).anInt9416];
	    }
	    int[] is
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .anIntArray9232);
	    int[] is_1784_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .anIntArray9175);
	    for (int i_1785_ = 0; i_1785_ < ((Class89_Sub2) this).anInt9410;
		 i_1785_++) {
		int i_1786_ = ((Class89_Sub2) this).anIntArray9411[i_1785_];
		int i_1787_ = ((Class89_Sub2) this).anIntArray9412[i_1785_];
		int i_1788_ = ((Class89_Sub2) this).anIntArray9413[i_1785_];
		float f = (class268.aFloatArray4353[2] * (float) i_1786_
			   + class268.aFloatArray4353[6] * (float) i_1787_
			   + class268.aFloatArray4353[10] * (float) i_1788_
			   + class268.aFloatArray4353[14]);
		float f_1789_
		    = (class268.aFloatArray4353[3] * (float) i_1786_
		       + class268.aFloatArray4353[7] * (float) i_1787_
		       + class268.aFloatArray4353[11] * (float) i_1788_
		       + class268.aFloatArray4353[15]);
		if (f >= -f_1789_) {
		    float f_1790_
			= (class268.aFloatArray4353[0] * (float) i_1786_
			   + class268.aFloatArray4353[4] * (float) i_1787_
			   + class268.aFloatArray4353[8] * (float) i_1788_
			   + class268.aFloatArray4353[12]);
		    float f_1791_
			= (class268.aFloatArray4353[1] * (float) i_1786_
			   + class268.aFloatArray4353[5] * (float) i_1787_
			   + class268.aFloatArray4353[9] * (float) i_1788_
			   + class268.aFloatArray4353[13]);
		    int i_1792_
			= ((Class89_Sub2) this).anIntArray9395[i_1785_];
		    int i_1793_
			= ((Class89_Sub2) this).anIntArray9395[i_1785_ + 1];
		    for (int i_1794_ = i_1792_;
			 (i_1794_ < i_1793_
			  && (((Class89_Sub2) this).aShortArray9455[i_1794_]
			      != 0));
			 i_1794_++) {
			int i_1795_
			    = ((((Class89_Sub2) this).aShortArray9455[i_1794_]
				& 0xffff)
			       - 1);
			is[i_1795_]
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_1790_ / f_1789_));
			is_1784_[i_1795_]
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9129)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9130
					* f_1791_ / f_1789_));
		    }
		} else {
		    int i_1796_
			= ((Class89_Sub2) this).anIntArray9395[i_1785_];
		    int i_1797_
			= ((Class89_Sub2) this).anIntArray9395[i_1785_ + 1];
		    for (int i_1798_ = i_1796_;
			 (i_1798_ < i_1797_
			  && (((Class89_Sub2) this).aShortArray9455[i_1798_]
			      != 0));
			 i_1798_++) {
			int i_1799_
			    = ((((Class89_Sub2) this).aShortArray9455[i_1798_]
				& 0xffff)
			       - 1);
			is[i_1799_] = -999999;
		    }
		}
	    }
	    for (int i_1800_ = 0; i_1800_ < ((Class89_Sub2) this).anInt9424;
		 i_1800_++) {
		if (is[(((Class89_Sub2) this).aShortArray9428[i_1800_]
			& 0xffff)] != -999999
		    && is[(((Class89_Sub2) this).aShortArray9462[i_1800_]
			   & 0xffff)] != -999999
		    && is[(((Class89_Sub2) this).aShortArray9407[i_1800_]
			   & 0xffff)] != -999999
		    && method15535(i, i_1756_,
				   is_1784_[((((Class89_Sub2) this)
					      .aShortArray9428[i_1800_])
					     & 0xffff)],
				   is_1784_[((((Class89_Sub2) this)
					      .aShortArray9462[i_1800_])
					     & 0xffff)],
				   is_1784_[((((Class89_Sub2) this)
					      .aShortArray9407[i_1800_])
					     & 0xffff)],
				   is[(((Class89_Sub2) this).aShortArray9428
				       [i_1800_]) & 0xffff],
				   is[(((Class89_Sub2) this).aShortArray9462
				       [i_1800_]) & 0xffff],
				   is[(((Class89_Sub2) this).aShortArray9407
				       [i_1800_]) & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    public void method1970(Class266 class266) {
	Class268 class268
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass268_9136);
	class268.method5203(class266);
	if (((Class89_Sub2) this).aClass106Array9445 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub2) this).aClass106Array9445.length; i++) {
		Class106 class106
		    = ((Class89_Sub2) this).aClass106Array9445[i];
		Class106 class106_1801_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_1801_ = class106.aClass106_1488;
		class106_1801_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_1801_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_1801_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_1801_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_1801_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_1801_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_1801_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_1801_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_1801_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub2) this).aClass167Array9454 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub2) this).aClass167Array9454.length; i++) {
		Class167 class167
		    = ((Class89_Sub2) this).aClass167Array9454[i];
		Class167 class167_1802_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_1802_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_1802_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_1802_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_1802_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    public void method2011(Class266 class266) {
	Class268 class268
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass268_9136);
	class268.method5203(class266);
	if (((Class89_Sub2) this).aClass106Array9445 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub2) this).aClass106Array9445.length; i++) {
		Class106 class106
		    = ((Class89_Sub2) this).aClass106Array9445[i];
		Class106 class106_1803_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_1803_ = class106.aClass106_1488;
		class106_1803_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_1803_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_1803_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_1803_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_1803_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_1803_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_1803_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_1803_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_1803_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub2) this).aClass167Array9454 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub2) this).aClass167Array9454.length; i++) {
		Class167 class167
		    = ((Class89_Sub2) this).aClass167Array9454[i];
		Class167 class167_1804_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_1804_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_1804_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_1804_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_1804_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    static short[] method15549(short[] is, int i) {
	short[] is_1805_ = new short[i];
	System.arraycopy(is, 0, is_1805_, 0, i);
	return is_1805_;
    }
    
    public void method1874(Class266 class266) {
	Class268 class268
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass268_9136);
	class268.method5203(class266);
	if (((Class89_Sub2) this).aClass106Array9445 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub2) this).aClass106Array9445.length; i++) {
		Class106 class106
		    = ((Class89_Sub2) this).aClass106Array9445[i];
		Class106 class106_1806_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_1806_ = class106.aClass106_1488;
		class106_1806_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_1806_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_1806_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_1806_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_1806_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_1806_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_1806_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_1806_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_1806_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub2) this).aClass167Array9454 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub2) this).aClass167Array9454.length; i++) {
		Class167 class167
		    = ((Class89_Sub2) this).aClass167Array9454[i];
		Class167 class167_1807_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_1807_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_1807_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_1807_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_1807_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    public Class241_Sub39_Sub17 method1898
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	if (((Class89_Sub2) this).anInt9416 == 0)
	    return null;
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i;
	int i_1808_;
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .anInt9181)
	    > 0) {
	    i = ((((Class89_Sub2) this).aShort9447
		  - ((((Class89_Sub2) this).aShort9446
		      * ((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9181)
		     >> 8))
		 >> ((Class103_Sub1)
		     ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1808_
		= ((((Class89_Sub2) this).aShort9448
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9181)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	} else {
	    i = ((((Class89_Sub2) this).aShort9447
		  - ((((Class89_Sub2) this).aShort9403
		      * ((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9181)
		     >> 8))
		 >> ((Class103_Sub1)
		     ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1808_
		= ((((Class89_Sub2) this).aShort9448
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9181)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	}
	int i_1809_;
	int i_1810_;
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .anInt9169)
	    > 0) {
	    i_1809_
		= ((((Class89_Sub2) this).aShort9449
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1810_
		= ((((Class89_Sub2) this).aShort9450
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	} else {
	    i_1809_
		= ((((Class89_Sub2) this).aShort9449
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1810_
		= ((((Class89_Sub2) this).aShort9450
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	}
	int i_1811_ = i_1808_ - i + 1;
	int i_1812_ = i_1810_ - i_1809_ + 1;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2_1813_;
	if (class241_sub39_sub17_sub2 != null
	    && class241_sub39_sub17_sub2.method17912(i_1811_, i_1812_)) {
	    class241_sub39_sub17_sub2_1813_ = class241_sub39_sub17_sub2;
	    class241_sub39_sub17_sub2_1813_.method17913();
	} else
	    class241_sub39_sub17_sub2_1813_
		= new Class241_Sub39_Sub17_Sub2((((Class89_Sub2) this)
						 .aClass103_Sub1_9457),
						i_1811_, i_1812_);
	class241_sub39_sub17_sub2_1813_.method17911(i, i_1809_, i_1808_,
						    i_1810_);
	method15539(class241_sub39_sub17_sub2_1813_);
	return class241_sub39_sub17_sub2_1813_;
    }
    
    public void method1908(short i, short i_1814_) {
	for (int i_1815_ = 0; i_1815_ < ((Class89_Sub2) this).anInt9424;
	     i_1815_++) {
	    if (((Class89_Sub2) this).aShortArray9442[i_1815_] == i)
		((Class89_Sub2) this).aShortArray9442[i_1815_] = i_1814_;
	}
	if (((Class89_Sub2) this).aClass171Array9459 != null) {
	    for (int i_1816_ = 0; i_1816_ < ((Class89_Sub2) this).anInt9427;
		 i_1816_++) {
		Class171 class171
		    = ((Class89_Sub2) this).aClass171Array9459[i_1816_];
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i_1816_];
		((Class140) class140).anInt1630
		    = (((Class140) class140).anInt1630 & ~0xffffff
		       | ((Class474.anIntArray6383
			   [(((Class89_Sub2) this).aShortArray9442
			     [((Class171) class171).anInt2069]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
    }
    
    void method2032() {
	for (int i = 0; i < ((Class89_Sub2) this).anInt9409; i++) {
	    ((Class89_Sub2) this).anIntArray9411[i]
		= ((Class89_Sub2) this).anIntArray9411[i] + 7 >> 4;
	    ((Class89_Sub2) this).anIntArray9412[i]
		= ((Class89_Sub2) this).anIntArray9412[i] + 7 >> 4;
	    ((Class89_Sub2) this).anIntArray9413[i]
		= ((Class89_Sub2) this).anIntArray9413[i] + 7 >> 4;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1972(Class266 class266) {
	Class268 class268
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass268_9136);
	class268.method5203(class266);
	if (((Class89_Sub2) this).aClass106Array9445 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub2) this).aClass106Array9445.length; i++) {
		Class106 class106
		    = ((Class89_Sub2) this).aClass106Array9445[i];
		Class106 class106_1817_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_1817_ = class106.aClass106_1488;
		class106_1817_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_1817_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_1817_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_1817_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_1817_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_1817_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_1817_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_1817_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_1817_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub2) this).aClass167Array9454 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub2) this).aClass167Array9454.length; i++) {
		Class167 class167
		    = ((Class89_Sub2) this).aClass167Array9454[i];
		Class167 class167_1818_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_1818_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_1818_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_1818_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_1818_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    public int method1978() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).anInt9421;
    }
    
    public void method1966(Class266 class266, int i, boolean bool) {
	if (((Class89_Sub2) this).aShortArray9465 != null) {
	    Class266 class266_1819_ = class266;
	    if (bool) {
		class266_1819_
		    = ((Class103_Sub1) (((Class89_Sub2) this)
					.aClass103_Sub1_9457)).aClass266_9073;
		class266_1819_.method5153(class266);
	    }
	    float[] fs = new float[3];
	    for (int i_1820_ = 0; i_1820_ < ((Class89_Sub2) this).anInt9410;
		 i_1820_++) {
		if ((i & ((Class89_Sub2) this).aShortArray9465[i_1820_])
		    != 0) {
		    class266_1819_.method5119
			((float) ((Class89_Sub2) this).anIntArray9411[i_1820_],
			 (float) ((Class89_Sub2) this).anIntArray9412[i_1820_],
			 (float) ((Class89_Sub2) this).anIntArray9413[i_1820_],
			 fs);
		    ((Class89_Sub2) this).anIntArray9411[i_1820_]
			= (int) fs[0];
		    ((Class89_Sub2) this).anIntArray9412[i_1820_]
			= (int) fs[1];
		    ((Class89_Sub2) this).anIntArray9413[i_1820_]
			= (int) fs[2];
		}
	    }
	}
    }
    
    public Class241_Sub39_Sub17 method1892
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	if (((Class89_Sub2) this).anInt9416 == 0)
	    return null;
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i;
	int i_1821_;
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .anInt9181)
	    > 0) {
	    i = ((((Class89_Sub2) this).aShort9447
		  - ((((Class89_Sub2) this).aShort9446
		      * ((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9181)
		     >> 8))
		 >> ((Class103_Sub1)
		     ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1821_
		= ((((Class89_Sub2) this).aShort9448
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9181)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	} else {
	    i = ((((Class89_Sub2) this).aShort9447
		  - ((((Class89_Sub2) this).aShort9403
		      * ((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9181)
		     >> 8))
		 >> ((Class103_Sub1)
		     ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1821_
		= ((((Class89_Sub2) this).aShort9448
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9181)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	}
	int i_1822_;
	int i_1823_;
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .anInt9169)
	    > 0) {
	    i_1822_
		= ((((Class89_Sub2) this).aShort9449
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1823_
		= ((((Class89_Sub2) this).aShort9450
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	} else {
	    i_1822_
		= ((((Class89_Sub2) this).aShort9449
		    - ((((Class89_Sub2) this).aShort9403
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	    i_1823_
		= ((((Class89_Sub2) this).aShort9450
		    - ((((Class89_Sub2) this).aShort9446
			* ((Class103_Sub1) (((Class89_Sub2) this)
					    .aClass103_Sub1_9457)).anInt9169)
		       >> 8))
		   >> ((Class103_Sub1)
		       ((Class89_Sub2) this).aClass103_Sub1_9457).anInt9093);
	}
	int i_1824_ = i_1821_ - i + 1;
	int i_1825_ = i_1823_ - i_1822_ + 1;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2_1826_;
	if (class241_sub39_sub17_sub2 != null
	    && class241_sub39_sub17_sub2.method17912(i_1824_, i_1825_)) {
	    class241_sub39_sub17_sub2_1826_ = class241_sub39_sub17_sub2;
	    class241_sub39_sub17_sub2_1826_.method17913();
	} else
	    class241_sub39_sub17_sub2_1826_
		= new Class241_Sub39_Sub17_Sub2((((Class89_Sub2) this)
						 .aClass103_Sub1_9457),
						i_1824_, i_1825_);
	class241_sub39_sub17_sub2_1826_.method17911(i, i_1822_, i_1821_,
						    i_1823_);
	method15539(class241_sub39_sub17_sub2_1826_);
	return class241_sub39_sub17_sub2_1826_;
    }
    
    public int method1981() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9447;
    }
    
    public int method1982() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9448;
    }
    
    public Class106[] method2015() {
	return ((Class89_Sub2) this).aClass106Array9445;
    }
    
    public int method2005() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9403;
    }
    
    public int method1940() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9403;
    }
    
    public int method1986() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9446;
    }
    
    public int method1987() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9449;
    }
    
    public int method1988() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9449;
    }
    
    public boolean method2026() {
	return ((Class89_Sub2) this).aBool9452;
    }
    
    Class89_Sub2(Class103_Sub1 class103_sub1) {
	((Class89_Sub2) this).aBool9425 = false;
	((Class89_Sub2) this).anInt9409 = 0;
	((Class89_Sub2) this).anInt9410 = 0;
	((Class89_Sub2) this).anInt9416 = 0;
	((Class89_Sub2) this).anInt9424 = 0;
	((Class89_Sub2) this).anInt9441 = 0;
	((Class89_Sub2) this).aBool9431 = true;
	((Class89_Sub2) this).aBool9444 = false;
	((Class89_Sub2) this).aBool9451 = false;
	((Class89_Sub2) this).aClass103_Sub1_9457 = class103_sub1;
	((Class89_Sub2) this).aClass151_9434 = new Class151(null, 5126, 3, 0);
	((Class89_Sub2) this).aClass151_9437 = new Class151(null, 5126, 2, 0);
	((Class89_Sub2) this).aClass151_9436 = new Class151(null, 5126, 3, 0);
	((Class89_Sub2) this).aClass151_9433 = new Class151(null, 5121, 4, 0);
	((Class89_Sub2) this).aClass146_9438 = new Class146();
    }
    
    public int method1991() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9450;
    }
    
    public int method1992() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9450;
    }
    
    short method15550(Class161 class161, int i, long l, int i_1827_,
		      int i_1828_, int i_1829_, int i_1830_, float f,
		      float f_1831_) {
	int i_1832_ = ((Class89_Sub2) this).anIntArray9395[i];
	int i_1833_ = ((Class89_Sub2) this).anIntArray9395[i + 1];
	int i_1834_ = 0;
	for (int i_1835_ = i_1832_; i_1835_ < i_1833_; i_1835_++) {
	    if (((Class89_Sub2) this).aShortArray9455[i_1835_] == 0) {
		i_1834_ = i_1835_;
		break;
	    }
	    int i_1836_
		= ((((Class89_Sub2) this).aShortArray9455[i_1835_] & 0xffff)
		   - 1);
	    if (aLongArray9458[i_1835_] == l)
		return (short) i_1836_;
	}
	((Class89_Sub2) this).aShortArray9455[i_1834_]
	    = (short) (((Class89_Sub2) this).anInt9416 + 1);
	aLongArray9458[i_1834_] = l;
	((Class89_Sub2) this).aShortArray9417[((Class89_Sub2) this).anInt9416]
	    = (short) i_1827_;
	((Class89_Sub2) this).aShortArray9418[((Class89_Sub2) this).anInt9416]
	    = (short) i_1828_;
	((Class89_Sub2) this).aShortArray9419[((Class89_Sub2) this).anInt9416]
	    = (short) i_1829_;
	((Class89_Sub2) this).aByteArray9420[((Class89_Sub2) this).anInt9416]
	    = (byte) i_1830_;
	((Class89_Sub2) this).aFloatArray9422[((Class89_Sub2) this).anInt9416]
	    = f;
	((Class89_Sub2) this).aFloatArray9423[((Class89_Sub2) this).anInt9416]
	    = f_1831_;
	return (short) ((Class89_Sub2) this).anInt9416++;
    }
    
    public boolean method2020() {
	if (((Class89_Sub2) this).aShortArray9414 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub2) this).aShortArray9414.length;
	     i++) {
	    if (((Class89_Sub2) this).aShortArray9414[i] != -1) {
		Class101 class101
		    = (((Class89_Sub2) this).aClass103_Sub1_9457
			   .aClass107_1458.method2680
		       (((Class89_Sub2) this).aShortArray9414[i] & 0xffff,
			-974387147));
		if (class101.anInt1403 * 218388063 != -1
		    && !((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457)
			    .aClass173_9080.method3719(class101, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public int method1989() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9449;
    }
    
    public void method1885(int i) {
	((Class89_Sub2) this).aShort9406 = (short) i;
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9436 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9436).anInterface8_1713
		= null;
    }
    
    public void method1973(int i) {
	((Class89_Sub2) this).aShort9406 = (short) i;
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9436 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9436).anInterface8_1713
		= null;
    }
    
    public int method1998() {
	return ((Class89_Sub2) this).aShort9405;
    }
    
    public int method1999() {
	return ((Class89_Sub2) this).aShort9405;
    }
    
    public void method2034() {
	for (int i = 0; i < ((Class89_Sub2) this).anInt9410; i++)
	    ((Class89_Sub2) this).anIntArray9413[i]
		= -((Class89_Sub2) this).anIntArray9413[i];
	for (int i = 0; i < ((Class89_Sub2) this).anInt9416; i++)
	    ((Class89_Sub2) this).aShortArray9419[i]
		= (short) -((Class89_Sub2) this).aShortArray9419[i];
	for (int i = 0; i < ((Class89_Sub2) this).anInt9424; i++) {
	    short i_1837_ = ((Class89_Sub2) this).aShortArray9428[i];
	    ((Class89_Sub2) this).aShortArray9428[i]
		= ((Class89_Sub2) this).aShortArray9407[i];
	    ((Class89_Sub2) this).aShortArray9407[i] = i_1837_;
	}
	if (((Class89_Sub2) this).aClass151_9436 == null
	    && ((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9436 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9436).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	if (((Class89_Sub2) this).aClass146_9438 != null)
	    ((Class146) ((Class89_Sub2) this).aClass146_9438)
		.anInterface14_1692
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public byte[] method1913() {
	return ((Class89_Sub2) this).aByteArray9408;
    }
    
    public int method1974() {
	return ((Class89_Sub2) this).aShort9405;
    }
    
    public int method2003() {
	return ((Class89_Sub2) this).aShort9406;
    }
    
    public void method1921(Class89 class89, int i, int i_1838_, int i_1839_,
			   boolean bool) {
	Class89_Sub2 class89_sub2_1840_ = (Class89_Sub2) class89;
	if (((Class89_Sub2) this).anInt9424 != 0
	    && ((Class89_Sub2) class89_sub2_1840_).anInt9424 != 0) {
	    int i_1841_ = ((Class89_Sub2) class89_sub2_1840_).anInt9410;
	    int[] is = ((Class89_Sub2) class89_sub2_1840_).anIntArray9411;
	    int[] is_1842_
		= ((Class89_Sub2) class89_sub2_1840_).anIntArray9412;
	    int[] is_1843_
		= ((Class89_Sub2) class89_sub2_1840_).anIntArray9413;
	    short[] is_1844_
		= ((Class89_Sub2) class89_sub2_1840_).aShortArray9417;
	    short[] is_1845_
		= ((Class89_Sub2) class89_sub2_1840_).aShortArray9418;
	    short[] is_1846_
		= ((Class89_Sub2) class89_sub2_1840_).aShortArray9419;
	    byte[] is_1847_
		= ((Class89_Sub2) class89_sub2_1840_).aByteArray9420;
	    short[] is_1848_;
	    short[] is_1849_;
	    short[] is_1850_;
	    byte[] is_1851_;
	    if (((Class89_Sub2) this).aClass178_9456 != null) {
		is_1848_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aShortArray2129);
		is_1849_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aShortArray2127);
		is_1850_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aShortArray2126);
		is_1851_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aByteArray2128);
	    } else {
		is_1848_ = null;
		is_1849_ = null;
		is_1850_ = null;
		is_1851_ = null;
	    }
	    short[] is_1852_;
	    short[] is_1853_;
	    short[] is_1854_;
	    byte[] is_1855_;
	    if (((Class89_Sub2) class89_sub2_1840_).aClass178_9456 != null) {
		is_1852_ = ((Class178) (((Class89_Sub2) class89_sub2_1840_)
					.aClass178_9456)).aShortArray2129;
		is_1853_ = ((Class178) (((Class89_Sub2) class89_sub2_1840_)
					.aClass178_9456)).aShortArray2127;
		is_1854_ = ((Class178) (((Class89_Sub2) class89_sub2_1840_)
					.aClass178_9456)).aShortArray2126;
		is_1855_ = ((Class178) (((Class89_Sub2) class89_sub2_1840_)
					.aClass178_9456)).aByteArray2128;
	    } else {
		is_1852_ = null;
		is_1853_ = null;
		is_1854_ = null;
		is_1855_ = null;
	    }
	    int[] is_1856_
		= ((Class89_Sub2) class89_sub2_1840_).anIntArray9395;
	    short[] is_1857_
		= ((Class89_Sub2) class89_sub2_1840_).aShortArray9455;
	    if (!((Class89_Sub2) class89_sub2_1840_).aBool9444)
		class89_sub2_1840_.method15537();
	    int i_1858_ = ((Class89_Sub2) class89_sub2_1840_).aShort9403;
	    int i_1859_ = ((Class89_Sub2) class89_sub2_1840_).aShort9446;
	    int i_1860_ = ((Class89_Sub2) class89_sub2_1840_).aShort9447;
	    int i_1861_ = ((Class89_Sub2) class89_sub2_1840_).aShort9448;
	    int i_1862_ = ((Class89_Sub2) class89_sub2_1840_).aShort9449;
	    int i_1863_ = ((Class89_Sub2) class89_sub2_1840_).aShort9450;
	    for (int i_1864_ = 0; i_1864_ < ((Class89_Sub2) this).anInt9410;
		 i_1864_++) {
		int i_1865_
		    = ((Class89_Sub2) this).anIntArray9412[i_1864_] - i_1838_;
		if (i_1865_ >= i_1858_ && i_1865_ <= i_1859_) {
		    int i_1866_
			= ((Class89_Sub2) this).anIntArray9411[i_1864_] - i;
		    if (i_1866_ >= i_1860_ && i_1866_ <= i_1861_) {
			int i_1867_
			    = (((Class89_Sub2) this).anIntArray9413[i_1864_]
			       - i_1839_);
			if (i_1867_ >= i_1862_ && i_1867_ <= i_1863_) {
			    int i_1868_ = -1;
			    int i_1869_ = (((Class89_Sub2) this).anIntArray9395
					   [i_1864_]);
			    int i_1870_ = (((Class89_Sub2) this).anIntArray9395
					   [i_1864_ + 1]);
			    for (int i_1871_ = i_1869_;
				 (i_1871_ < i_1870_
				  && (((Class89_Sub2) this).aShortArray9455
				      [i_1871_]) != 0);
				 i_1871_++) {
				i_1868_ = ((((Class89_Sub2) this)
					    .aShortArray9455[i_1871_])
					   & 0xffff) - 1;
				if ((((Class89_Sub2) this).aByteArray9420
				     [i_1868_])
				    != 0)
				    break;
			    }
			    if (i_1868_ != -1) {
				for (int i_1872_ = 0; i_1872_ < i_1841_;
				     i_1872_++) {
				    if (i_1866_ == is[i_1872_]
					&& i_1867_ == is_1843_[i_1872_]
					&& i_1865_ == is_1842_[i_1872_]) {
					int i_1873_ = -1;
					i_1869_ = is_1856_[i_1872_];
					i_1870_ = is_1856_[i_1872_ + 1];
					for (int i_1874_ = i_1869_;
					     (i_1874_ < i_1870_
					      && is_1857_[i_1874_] != 0);
					     i_1874_++) {
					    i_1873_ = (is_1857_[i_1874_]
						       & 0xffff) - 1;
					    if (is_1847_[i_1873_] != 0)
						break;
					}
					if (i_1873_ != -1) {
					    if (is_1848_ == null) {
						((Class89_Sub2) this)
						    .aClass178_9456
						    = new Class178();
						is_1848_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2129
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9417),
							-1039704265));
						is_1849_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2127
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9418),
							-1729289175));
						is_1850_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2126
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9419),
							-1027718488));
						is_1851_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aByteArray2128
						    = (Class554.method12275
						       ((((Class89_Sub2) this)
							 .aByteArray9420),
							-841739618));
					    }
					    if (is_1852_ == null) {
						Class178 class178
						    = (((Class89_Sub2)
							class89_sub2_1840_)
							   .aClass178_9456
						       = new Class178());
						is_1852_
						    = ((Class178) class178)
							  .aShortArray2129
						    = (Class518.method11659
						       (is_1844_,
							-1773026214));
						is_1853_
						    = ((Class178) class178)
							  .aShortArray2127
						    = (Class518.method11659
						       (is_1845_, -711193234));
						is_1854_
						    = ((Class178) class178)
							  .aShortArray2126
						    = (Class518.method11659
						       (is_1846_,
							-1936772516));
						is_1855_
						    = ((Class178) class178)
							  .aByteArray2128
						    = (Class554.method12275
						       (is_1847_, -841739618));
					    }
					    short i_1875_
						= (((Class89_Sub2) this)
						   .aShortArray9417[i_1868_]);
					    short i_1876_
						= (((Class89_Sub2) this)
						   .aShortArray9418[i_1868_]);
					    short i_1877_
						= (((Class89_Sub2) this)
						   .aShortArray9419[i_1868_]);
					    byte i_1878_
						= (((Class89_Sub2) this)
						   .aByteArray9420[i_1868_]);
					    i_1869_ = is_1856_[i_1872_];
					    i_1870_ = is_1856_[i_1872_ + 1];
					    for (int i_1879_ = i_1869_;
						 i_1879_ < i_1870_;
						 i_1879_++) {
						int i_1880_
						    = is_1857_[i_1879_] - 1;
						if (i_1880_ == -1)
						    break;
						if (is_1855_[i_1880_] != 0) {
						    is_1852_[i_1880_]
							+= i_1875_;
						    is_1853_[i_1880_]
							+= i_1876_;
						    is_1854_[i_1880_]
							+= i_1877_;
						    is_1855_[i_1880_]
							+= i_1878_;
						}
					    }
					    i_1875_ = is_1844_[i_1873_];
					    i_1876_ = is_1845_[i_1873_];
					    i_1877_ = is_1846_[i_1873_];
					    i_1878_ = is_1847_[i_1873_];
					    i_1869_
						= (((Class89_Sub2) this)
						   .anIntArray9395[i_1864_]);
					    i_1870_ = (((Class89_Sub2) this)
						       .anIntArray9395
						       [i_1864_ + 1]);
					    for (int i_1881_ = i_1869_;
						 (i_1881_ < i_1870_
						  && (((Class89_Sub2) this)
						      .aShortArray9455
						      [i_1881_]) != 0);
						 i_1881_++) {
						int i_1882_
						    = (((((Class89_Sub2) this)
							 .aShortArray9455
							 [i_1881_])
							& 0xffff)
						       - 1);
						if (is_1851_[i_1882_] != 0) {
						    is_1848_[i_1882_]
							+= i_1875_;
						    is_1849_[i_1882_]
							+= i_1876_;
						    is_1850_[i_1882_]
							+= i_1877_;
						    is_1851_[i_1882_]
							+= i_1878_;
						}
					    }
					    if ((((Class89_Sub2) this)
						 .aClass151_9436) == null
						&& (((Class89_Sub2) this)
						    .aClass151_9433) != null)
						((Class151)
						 (((Class89_Sub2) this)
						  .aClass151_9433))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2) this)
						 .aClass151_9436)
						!= null)
						((Class151)
						 (((Class89_Sub2) this)
						  .aClass151_9436))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2)
						  class89_sub2_1840_)
						 .aClass151_9436) == null
						&& (((Class89_Sub2)
						     class89_sub2_1840_)
						    .aClass151_9433) != null)
						((Class151)
						 (((Class89_Sub2)
						   class89_sub2_1840_)
						  .aClass151_9433))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2)
						  class89_sub2_1840_)
						 .aClass151_9436)
						!= null)
						((Class151)
						 (((Class89_Sub2)
						   class89_sub2_1840_)
						  .aClass151_9436))
						    .anInterface8_1713
						    = null;
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
    
    public byte[] method2054() {
	return ((Class89_Sub2) this).aByteArray9408;
    }
    
    public int method1924() {
	return ((Class89_Sub2) this).anInt9402;
    }
    
    public byte[] method2007() {
	return ((Class89_Sub2) this).aByteArray9408;
    }
    
    Class89 method15551(Class89_Sub2 class89_sub2_1883_,
			Class89_Sub2 class89_sub2_1884_, int i, boolean bool,
			boolean bool_1885_) {
	((Class89_Sub2) class89_sub2_1883_).aByte9404 = (byte) 0;
	((Class89_Sub2) class89_sub2_1883_).anInt9402 = i;
	((Class89_Sub2) class89_sub2_1883_).anInt9469
	    = ((Class89_Sub2) this).anInt9469;
	((Class89_Sub2) class89_sub2_1883_).aShort9405
	    = ((Class89_Sub2) this).aShort9405;
	((Class89_Sub2) class89_sub2_1883_).aShort9406
	    = ((Class89_Sub2) this).aShort9406;
	((Class89_Sub2) class89_sub2_1883_).anInt9409
	    = ((Class89_Sub2) this).anInt9409;
	((Class89_Sub2) class89_sub2_1883_).anInt9410
	    = ((Class89_Sub2) this).anInt9410;
	((Class89_Sub2) class89_sub2_1883_).anInt9416
	    = ((Class89_Sub2) this).anInt9416;
	((Class89_Sub2) class89_sub2_1883_).anInt9424
	    = ((Class89_Sub2) this).anInt9424;
	((Class89_Sub2) class89_sub2_1883_).anInt9441
	    = ((Class89_Sub2) this).anInt9441;
	((Class89_Sub2) class89_sub2_1883_).anInt9427
	    = ((Class89_Sub2) this).anInt9427;
	if ((i & 0x100) != 0)
	    ((Class89_Sub2) class89_sub2_1883_).aBool9452 = true;
	else
	    ((Class89_Sub2) class89_sub2_1883_).aBool9452
		= ((Class89_Sub2) this).aBool9452;
	((Class89_Sub2) class89_sub2_1883_).aBool9425
	    = ((Class89_Sub2) this).aBool9425;
	boolean bool_1886_
	    = Class154.method3248(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_1887_
	    = Class154.method3244(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_1888_
	    = Class154.method3245(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_1889_ = bool_1886_ | bool_1887_ | bool_1888_;
	if (bool_1889_) {
	    if (bool_1886_) {
		if (((Class89_Sub2) class89_sub2_1884_).anIntArray9411 == null
		    || ((((Class89_Sub2) class89_sub2_1884_)
			 .anIntArray9411).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_1883_).anIntArray9411
			= ((Class89_Sub2) class89_sub2_1884_).anIntArray9411
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_1883_).anIntArray9411
			= ((Class89_Sub2) class89_sub2_1884_).anIntArray9411;
	    } else
		((Class89_Sub2) class89_sub2_1883_).anIntArray9411
		    = ((Class89_Sub2) this).anIntArray9411;
	    if (bool_1887_) {
		if (((Class89_Sub2) class89_sub2_1884_).anIntArray9412 == null
		    || ((((Class89_Sub2) class89_sub2_1884_)
			 .anIntArray9412).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_1883_).anIntArray9412
			= ((Class89_Sub2) class89_sub2_1884_).anIntArray9412
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_1883_).anIntArray9412
			= ((Class89_Sub2) class89_sub2_1884_).anIntArray9412;
	    } else
		((Class89_Sub2) class89_sub2_1883_).anIntArray9412
		    = ((Class89_Sub2) this).anIntArray9412;
	    if (bool_1888_) {
		if (((Class89_Sub2) class89_sub2_1884_).anIntArray9413 == null
		    || ((((Class89_Sub2) class89_sub2_1884_)
			 .anIntArray9413).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_1883_).anIntArray9413
			= ((Class89_Sub2) class89_sub2_1884_).anIntArray9413
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_1883_).anIntArray9413
			= ((Class89_Sub2) class89_sub2_1884_).anIntArray9413;
	    } else
		((Class89_Sub2) class89_sub2_1883_).anIntArray9413
		    = ((Class89_Sub2) this).anIntArray9413;
	    for (int i_1890_ = 0; i_1890_ < ((Class89_Sub2) this).anInt9409;
		 i_1890_++) {
		if (bool_1886_)
		    ((Class89_Sub2) class89_sub2_1883_).anIntArray9411[i_1890_]
			= ((Class89_Sub2) this).anIntArray9411[i_1890_];
		if (bool_1887_)
		    ((Class89_Sub2) class89_sub2_1883_).anIntArray9412[i_1890_]
			= ((Class89_Sub2) this).anIntArray9412[i_1890_];
		if (bool_1888_)
		    ((Class89_Sub2) class89_sub2_1883_).anIntArray9413[i_1890_]
			= ((Class89_Sub2) this).anIntArray9413[i_1890_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_1883_).anIntArray9411
		= ((Class89_Sub2) this).anIntArray9411;
	    ((Class89_Sub2) class89_sub2_1883_).anIntArray9412
		= ((Class89_Sub2) this).anIntArray9412;
	    ((Class89_Sub2) class89_sub2_1883_).anIntArray9413
		= ((Class89_Sub2) this).anIntArray9413;
	}
	if (Class154.method3260(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_1883_).aByte9404 |= 0x1;
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9434
		= ((Class89_Sub2) class89_sub2_1884_).aClass151_9434;
	    ((Class151) ((Class89_Sub2) class89_sub2_1883_).aClass151_9434)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9434).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_1883_).aClass151_9434)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9434)
		   .anInterface8_1713);
	} else if (Class154.method3255(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9434
		= ((Class89_Sub2) this).aClass151_9434;
	else
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9434 = null;
	if (Class154.method3300(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1884_).aShortArray9442 == null
		|| (((Class89_Sub2) class89_sub2_1884_).aShortArray9442.length
		    < ((Class89_Sub2) this).anInt9424))
		((Class89_Sub2) class89_sub2_1883_).aShortArray9442
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9442
		    = new short[((Class89_Sub2) this).anInt9424];
	    else
		((Class89_Sub2) class89_sub2_1883_).aShortArray9442
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9442;
	    for (int i_1891_ = 0; i_1891_ < ((Class89_Sub2) this).anInt9424;
		 i_1891_++)
		((Class89_Sub2) class89_sub2_1883_).aShortArray9442[i_1891_]
		    = ((Class89_Sub2) this).aShortArray9442[i_1891_];
	} else
	    ((Class89_Sub2) class89_sub2_1883_).aShortArray9442
		= ((Class89_Sub2) this).aShortArray9442;
	if (Class154.method3249(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1884_).aByteArray9408 == null
		|| (((Class89_Sub2) class89_sub2_1884_).aByteArray9408.length
		    < ((Class89_Sub2) this).anInt9424))
		((Class89_Sub2) class89_sub2_1883_).aByteArray9408
		    = ((Class89_Sub2) class89_sub2_1884_).aByteArray9408
		    = new byte[((Class89_Sub2) this).anInt9424];
	    else
		((Class89_Sub2) class89_sub2_1883_).aByteArray9408
		    = ((Class89_Sub2) class89_sub2_1884_).aByteArray9408;
	    for (int i_1892_ = 0; i_1892_ < ((Class89_Sub2) this).anInt9424;
		 i_1892_++)
		((Class89_Sub2) class89_sub2_1883_).aByteArray9408[i_1892_]
		    = ((Class89_Sub2) this).aByteArray9408[i_1892_];
	} else
	    ((Class89_Sub2) class89_sub2_1883_).aByteArray9408
		= ((Class89_Sub2) this).aByteArray9408;
	if (Class154.method3262(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_1883_).aByte9404 |= 0x2;
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9433
		= ((Class89_Sub2) class89_sub2_1884_).aClass151_9433;
	    ((Class151) ((Class89_Sub2) class89_sub2_1883_).aClass151_9433)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9433).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_1883_).aClass151_9433)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9433)
		   .anInterface8_1713);
	} else if (Class154.method3257(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9433
		= ((Class89_Sub2) this).aClass151_9433;
	else
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9433 = null;
	if (Class154.method3247(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1884_).aShortArray9417 == null
		|| (((Class89_Sub2) class89_sub2_1884_).aShortArray9417.length
		    < ((Class89_Sub2) this).anInt9416)) {
		int i_1893_ = ((Class89_Sub2) this).anInt9416;
		((Class89_Sub2) class89_sub2_1883_).aShortArray9417
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9417
		    = new short[i_1893_];
		((Class89_Sub2) class89_sub2_1883_).aShortArray9418
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9418
		    = new short[i_1893_];
		((Class89_Sub2) class89_sub2_1883_).aShortArray9419
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9419
		    = new short[i_1893_];
	    } else {
		((Class89_Sub2) class89_sub2_1883_).aShortArray9417
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9417;
		((Class89_Sub2) class89_sub2_1883_).aShortArray9418
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9418;
		((Class89_Sub2) class89_sub2_1883_).aShortArray9419
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9419;
	    }
	    if (((Class89_Sub2) this).aClass178_9456 != null) {
		if (((Class89_Sub2) class89_sub2_1884_).aClass178_9456 == null)
		    ((Class89_Sub2) class89_sub2_1884_).aClass178_9456
			= new Class178();
		Class178 class178
		    = (((Class89_Sub2) class89_sub2_1883_).aClass178_9456
		       = ((Class89_Sub2) class89_sub2_1884_).aClass178_9456);
		if (((Class178) class178).aShortArray2129 == null
		    || (((Class178) class178).aShortArray2129.length
			< ((Class89_Sub2) this).anInt9416)) {
		    int i_1894_ = ((Class89_Sub2) this).anInt9416;
		    ((Class178) class178).aShortArray2129 = new short[i_1894_];
		    ((Class178) class178).aShortArray2127 = new short[i_1894_];
		    ((Class178) class178).aShortArray2126 = new short[i_1894_];
		    ((Class178) class178).aByteArray2128 = new byte[i_1894_];
		}
		for (int i_1895_ = 0;
		     i_1895_ < ((Class89_Sub2) this).anInt9416; i_1895_++) {
		    ((Class89_Sub2) class89_sub2_1883_).aShortArray9417
			[i_1895_]
			= ((Class89_Sub2) this).aShortArray9417[i_1895_];
		    ((Class89_Sub2) class89_sub2_1883_).aShortArray9418
			[i_1895_]
			= ((Class89_Sub2) this).aShortArray9418[i_1895_];
		    ((Class89_Sub2) class89_sub2_1883_).aShortArray9419
			[i_1895_]
			= ((Class89_Sub2) this).aShortArray9419[i_1895_];
		    ((Class178) class178).aShortArray2129[i_1895_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2129[i_1895_]);
		    ((Class178) class178).aShortArray2127[i_1895_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2127[i_1895_]);
		    ((Class178) class178).aShortArray2126[i_1895_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2126[i_1895_]);
		    ((Class178) class178).aByteArray2128[i_1895_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aByteArray2128[i_1895_]);
		}
	    } else {
		for (int i_1896_ = 0;
		     i_1896_ < ((Class89_Sub2) this).anInt9416; i_1896_++) {
		    ((Class89_Sub2) class89_sub2_1883_).aShortArray9417
			[i_1896_]
			= ((Class89_Sub2) this).aShortArray9417[i_1896_];
		    ((Class89_Sub2) class89_sub2_1883_).aShortArray9418
			[i_1896_]
			= ((Class89_Sub2) this).aShortArray9418[i_1896_];
		    ((Class89_Sub2) class89_sub2_1883_).aShortArray9419
			[i_1896_]
			= ((Class89_Sub2) this).aShortArray9419[i_1896_];
		}
	    }
	    ((Class89_Sub2) class89_sub2_1883_).aByteArray9420
		= ((Class89_Sub2) this).aByteArray9420;
	} else {
	    ((Class89_Sub2) class89_sub2_1883_).aClass178_9456
		= ((Class89_Sub2) this).aClass178_9456;
	    ((Class89_Sub2) class89_sub2_1883_).aShortArray9417
		= ((Class89_Sub2) this).aShortArray9417;
	    ((Class89_Sub2) class89_sub2_1883_).aShortArray9418
		= ((Class89_Sub2) this).aShortArray9418;
	    ((Class89_Sub2) class89_sub2_1883_).aShortArray9419
		= ((Class89_Sub2) this).aShortArray9419;
	    ((Class89_Sub2) class89_sub2_1883_).aByteArray9420
		= ((Class89_Sub2) this).aByteArray9420;
	}
	if (Class154.method3342(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_1883_).aByte9404 |= 0x4;
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9436
		= ((Class89_Sub2) class89_sub2_1884_).aClass151_9436;
	    ((Class151) ((Class89_Sub2) class89_sub2_1883_).aClass151_9436)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9436).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_1883_).aClass151_9436)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9436)
		   .anInterface8_1713);
	} else if (Class154.method3301(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9436
		= ((Class89_Sub2) this).aClass151_9436;
	else
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9436 = null;
	if (Class154.method3329(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1884_).aFloatArray9422 == null
		|| (((Class89_Sub2) class89_sub2_1884_).aFloatArray9422.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_1897_ = ((Class89_Sub2) this).anInt9416;
		((Class89_Sub2) class89_sub2_1883_).aFloatArray9422
		    = ((Class89_Sub2) class89_sub2_1884_).aFloatArray9422
		    = new float[i_1897_];
		((Class89_Sub2) class89_sub2_1883_).aFloatArray9423
		    = ((Class89_Sub2) class89_sub2_1884_).aFloatArray9423
		    = new float[i_1897_];
	    } else {
		((Class89_Sub2) class89_sub2_1883_).aFloatArray9422
		    = ((Class89_Sub2) class89_sub2_1884_).aFloatArray9422;
		((Class89_Sub2) class89_sub2_1883_).aFloatArray9423
		    = ((Class89_Sub2) class89_sub2_1884_).aFloatArray9423;
	    }
	    for (int i_1898_ = 0; i_1898_ < ((Class89_Sub2) this).anInt9416;
		 i_1898_++) {
		((Class89_Sub2) class89_sub2_1883_).aFloatArray9422[i_1898_]
		    = ((Class89_Sub2) this).aFloatArray9422[i_1898_];
		((Class89_Sub2) class89_sub2_1883_).aFloatArray9423[i_1898_]
		    = ((Class89_Sub2) this).aFloatArray9423[i_1898_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_1883_).aFloatArray9422
		= ((Class89_Sub2) this).aFloatArray9422;
	    ((Class89_Sub2) class89_sub2_1883_).aFloatArray9423
		= ((Class89_Sub2) this).aFloatArray9423;
	}
	if (Class154.method3263(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_1883_).aByte9404 |= 0x8;
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9437
		= ((Class89_Sub2) class89_sub2_1884_).aClass151_9437;
	    ((Class151) ((Class89_Sub2) class89_sub2_1883_).aClass151_9437)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9437).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_1883_).aClass151_9437)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9437)
		   .anInterface8_1713);
	} else if (Class154.method3283(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9437
		= ((Class89_Sub2) this).aClass151_9437;
	else
	    ((Class89_Sub2) class89_sub2_1883_).aClass151_9437 = null;
	if (Class154.method3308(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1884_).aShortArray9428 == null
		|| (((Class89_Sub2) class89_sub2_1884_).aShortArray9428.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_1899_ = ((Class89_Sub2) this).anInt9424;
		((Class89_Sub2) class89_sub2_1883_).aShortArray9428
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9428
		    = new short[i_1899_];
		((Class89_Sub2) class89_sub2_1883_).aShortArray9462
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9462
		    = new short[i_1899_];
		((Class89_Sub2) class89_sub2_1883_).aShortArray9407
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9407
		    = new short[i_1899_];
	    } else {
		((Class89_Sub2) class89_sub2_1883_).aShortArray9428
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9428;
		((Class89_Sub2) class89_sub2_1883_).aShortArray9462
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9462;
		((Class89_Sub2) class89_sub2_1883_).aShortArray9407
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9407;
	    }
	    for (int i_1900_ = 0; i_1900_ < ((Class89_Sub2) this).anInt9424;
		 i_1900_++) {
		((Class89_Sub2) class89_sub2_1883_).aShortArray9428[i_1900_]
		    = ((Class89_Sub2) this).aShortArray9428[i_1900_];
		((Class89_Sub2) class89_sub2_1883_).aShortArray9462[i_1900_]
		    = ((Class89_Sub2) this).aShortArray9462[i_1900_];
		((Class89_Sub2) class89_sub2_1883_).aShortArray9407[i_1900_]
		    = ((Class89_Sub2) this).aShortArray9407[i_1900_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_1883_).aShortArray9428
		= ((Class89_Sub2) this).aShortArray9428;
	    ((Class89_Sub2) class89_sub2_1883_).aShortArray9462
		= ((Class89_Sub2) this).aShortArray9462;
	    ((Class89_Sub2) class89_sub2_1883_).aShortArray9407
		= ((Class89_Sub2) this).aShortArray9407;
	}
	if (Class154.method3264(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_1883_).aByte9404 |= 0x10;
	    ((Class89_Sub2) class89_sub2_1883_).aClass146_9438
		= ((Class89_Sub2) class89_sub2_1884_).aClass146_9438;
	    ((Class146) ((Class89_Sub2) class89_sub2_1883_).aClass146_9438)
		.anInterface14_1692
		= (((Class146) ((Class89_Sub2) this).aClass146_9438)
		   .anInterface14_1692);
	} else if (Class154.method3307(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_1883_).aClass146_9438
		= ((Class89_Sub2) this).aClass146_9438;
	else
	    ((Class89_Sub2) class89_sub2_1883_).aClass146_9438 = null;
	if (Class154.method3252(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1884_).aShortArray9414 == null
		|| (((Class89_Sub2) class89_sub2_1884_).aShortArray9414.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_1901_ = ((Class89_Sub2) this).anInt9424;
		((Class89_Sub2) class89_sub2_1883_).aShortArray9414
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9414
		    = new short[i_1901_];
	    } else
		((Class89_Sub2) class89_sub2_1883_).aShortArray9414
		    = ((Class89_Sub2) class89_sub2_1884_).aShortArray9414;
	    for (int i_1902_ = 0; i_1902_ < ((Class89_Sub2) this).anInt9424;
		 i_1902_++)
		((Class89_Sub2) class89_sub2_1883_).aShortArray9414[i_1902_]
		    = ((Class89_Sub2) this).aShortArray9414[i_1902_];
	} else
	    ((Class89_Sub2) class89_sub2_1883_).aShortArray9414
		= ((Class89_Sub2) this).aShortArray9414;
	if (Class154.method3253(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_1884_).aClass140Array9460 == null
		|| ((((Class89_Sub2) class89_sub2_1884_)
		     .aClass140Array9460).length
		    < ((Class89_Sub2) this).anInt9427)) {
		int i_1903_ = ((Class89_Sub2) this).anInt9427;
		((Class89_Sub2) class89_sub2_1883_).aClass140Array9460
		    = ((Class89_Sub2) class89_sub2_1884_).aClass140Array9460
		    = new Class140[i_1903_];
		for (int i_1904_ = 0;
		     i_1904_ < ((Class89_Sub2) this).anInt9427; i_1904_++)
		    ((Class89_Sub2) class89_sub2_1883_).aClass140Array9460
			[i_1904_]
			= ((Class89_Sub2) this).aClass140Array9460[i_1904_]
			      .method3141();
	    } else {
		((Class89_Sub2) class89_sub2_1883_).aClass140Array9460
		    = ((Class89_Sub2) class89_sub2_1884_).aClass140Array9460;
		for (int i_1905_ = 0;
		     i_1905_ < ((Class89_Sub2) this).anInt9427; i_1905_++)
		    ((Class89_Sub2) class89_sub2_1883_).aClass140Array9460
			[i_1905_].method3142
			(((Class89_Sub2) this).aClass140Array9460[i_1905_]);
	    }
	} else
	    ((Class89_Sub2) class89_sub2_1883_).aClass140Array9460
		= ((Class89_Sub2) this).aClass140Array9460;
	((Class89_Sub2) class89_sub2_1883_).aClass171Array9459
	    = ((Class89_Sub2) this).aClass171Array9459;
	if (((Class89_Sub2) this).aBool9444) {
	    ((Class89_Sub2) class89_sub2_1883_).anInt9443
		= ((Class89_Sub2) this).anInt9443;
	    ((Class89_Sub2) class89_sub2_1883_).anInt9421
		= ((Class89_Sub2) this).anInt9421;
	    ((Class89_Sub2) class89_sub2_1883_).aShort9447
		= ((Class89_Sub2) this).aShort9447;
	    ((Class89_Sub2) class89_sub2_1883_).aShort9448
		= ((Class89_Sub2) this).aShort9448;
	    ((Class89_Sub2) class89_sub2_1883_).aShort9403
		= ((Class89_Sub2) this).aShort9403;
	    ((Class89_Sub2) class89_sub2_1883_).aShort9446
		= ((Class89_Sub2) this).aShort9446;
	    ((Class89_Sub2) class89_sub2_1883_).aShort9449
		= ((Class89_Sub2) this).aShort9449;
	    ((Class89_Sub2) class89_sub2_1883_).aShort9450
		= ((Class89_Sub2) this).aShort9450;
	    ((Class89_Sub2) class89_sub2_1883_).aBool9444 = true;
	} else
	    ((Class89_Sub2) class89_sub2_1883_).aBool9444 = false;
	if (((Class89_Sub2) this).aBool9451) {
	    ((Class89_Sub2) class89_sub2_1883_).aShort9435
		= ((Class89_Sub2) this).aShort9435;
	    ((Class89_Sub2) class89_sub2_1883_).aBool9451 = true;
	} else
	    ((Class89_Sub2) class89_sub2_1883_).aBool9451 = false;
	((Class89_Sub2) class89_sub2_1883_).anIntArrayArray9467
	    = ((Class89_Sub2) this).anIntArrayArray9467;
	((Class89_Sub2) class89_sub2_1883_).anIntArrayArray9432
	    = ((Class89_Sub2) this).anIntArrayArray9432;
	((Class89_Sub2) class89_sub2_1883_).anIntArrayArray9461
	    = ((Class89_Sub2) this).anIntArrayArray9461;
	((Class89_Sub2) class89_sub2_1883_).aShortArray9455
	    = ((Class89_Sub2) this).aShortArray9455;
	((Class89_Sub2) class89_sub2_1883_).anIntArray9395
	    = ((Class89_Sub2) this).anIntArray9395;
	((Class89_Sub2) class89_sub2_1883_).aShortArray9465
	    = ((Class89_Sub2) this).aShortArray9465;
	((Class89_Sub2) class89_sub2_1883_).aShortArray9415
	    = ((Class89_Sub2) this).aShortArray9415;
	((Class89_Sub2) class89_sub2_1883_).anIntArray9453
	    = ((Class89_Sub2) this).anIntArray9453;
	((Class89_Sub2) class89_sub2_1883_).aClass106Array9445
	    = ((Class89_Sub2) this).aClass106Array9445;
	((Class89_Sub2) class89_sub2_1883_).aClass167Array9454
	    = ((Class89_Sub2) this).aClass167Array9454;
	return class89_sub2_1883_;
    }
    
    public void method1993(short i, short i_1906_) {
	for (int i_1907_ = 0; i_1907_ < ((Class89_Sub2) this).anInt9424;
	     i_1907_++) {
	    if (((Class89_Sub2) this).aShortArray9442[i_1907_] == i)
		((Class89_Sub2) this).aShortArray9442[i_1907_] = i_1906_;
	}
	if (((Class89_Sub2) this).aClass171Array9459 != null) {
	    for (int i_1908_ = 0; i_1908_ < ((Class89_Sub2) this).anInt9427;
		 i_1908_++) {
		Class171 class171
		    = ((Class89_Sub2) this).aClass171Array9459[i_1908_];
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i_1908_];
		((Class140) class140).anInt1630
		    = (((Class140) class140).anInt1630 & ~0xffffff
		       | ((Class474.anIntArray6383
			   [(((Class89_Sub2) this).aShortArray9442
			     [((Class171) class171).anInt2069]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
    }
    
    public void method2010(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1909_ = 0; i_1909_ < ((Class89_Sub2) this).anInt9424;
		 i_1909_++)
		((Class89_Sub2) this).aByteArray9408[i_1909_] = i;
	} else {
	    for (int i_1910_ = 0; i_1910_ < ((Class89_Sub2) this).anInt9424;
		 i_1910_++) {
		int i_1911_ = 255 - ((255 - (is[i_1910_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class89_Sub2) this).aByteArray9408[i_1910_] = (byte) i_1911_;
	    }
	}
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
    }
    
    public void method1932(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1912_ = 0; i_1912_ < ((Class89_Sub2) this).anInt9424;
		 i_1912_++)
		((Class89_Sub2) this).aByteArray9408[i_1912_] = i;
	} else {
	    for (int i_1913_ = 0; i_1913_ < ((Class89_Sub2) this).anInt9424;
		 i_1913_++) {
		int i_1914_ = 255 - ((255 - (is[i_1913_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class89_Sub2) this).aByteArray9408[i_1913_] = (byte) i_1914_;
	    }
	}
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
    }
    
    public int method1983() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9448;
    }
    
    public void method2045(short i, short i_1915_) {
	Class107 class107
	    = ((Class89_Sub2) this).aClass103_Sub1_9457.aClass107_1458;
	for (int i_1916_ = 0; i_1916_ < ((Class89_Sub2) this).anInt9424;
	     i_1916_++) {
	    if (((Class89_Sub2) this).aShortArray9414[i_1916_] == i)
		((Class89_Sub2) this).aShortArray9414[i_1916_] = i_1915_;
	}
	byte i_1917_ = 0;
	byte i_1918_ = 0;
	if (i != -1) {
	    Class101 class101 = class107.method2680(i & 0xffff, -493329751);
	    i_1917_ = class101.aByte1430;
	    i_1918_ = class101.aByte1433;
	}
	byte i_1919_ = 0;
	byte i_1920_ = 0;
	if (i_1915_ != -1) {
	    Class101 class101
		= class107.method2680(i_1915_ & 0xffff, 1283904550);
	    i_1919_ = class101.aByte1430;
	    i_1920_ = class101.aByte1433;
	    if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
		((Class89_Sub2) this).aBool9425 = true;
	}
	if (i_1917_ != i_1919_ | i_1918_ != i_1920_) {
	    if (((Class89_Sub2) this).aClass171Array9459 != null) {
		for (int i_1921_ = 0;
		     i_1921_ < ((Class89_Sub2) this).anInt9427; i_1921_++) {
		    Class171 class171
			= ((Class89_Sub2) this).aClass171Array9459[i_1921_];
		    Class140 class140
			= ((Class89_Sub2) this).aClass140Array9460[i_1921_];
		    ((Class140) class140).anInt1630
			= (((Class140) class140).anInt1630 & ~0xffffff
			   | ((Class474.anIntArray6383
			       [(((Class89_Sub2) this).aShortArray9442
				 [((Class171) class171).anInt2069]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (((Class89_Sub2) this).aClass151_9433 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9433)
		    .anInterface8_1713
		    = null;
	}
    }
    
    public void method2014(int i, int i_1922_, int i_1923_, int i_1924_) {
	for (int i_1925_ = 0; i_1925_ < ((Class89_Sub2) this).anInt9424;
	     i_1925_++) {
	    int i_1926_
		= ((Class89_Sub2) this).aShortArray9442[i_1925_] & 0xffff;
	    int i_1927_ = i_1926_ >> 10 & 0x3f;
	    int i_1928_ = i_1926_ >> 7 & 0x7;
	    int i_1929_ = i_1926_ & 0x7f;
	    if (i != -1)
		i_1927_ += (i - i_1927_) * i_1924_ >> 7;
	    if (i_1922_ != -1)
		i_1928_ += (i_1922_ - i_1928_) * i_1924_ >> 7;
	    if (i_1923_ != -1)
		i_1929_ += (i_1923_ - i_1929_) * i_1924_ >> 7;
	    ((Class89_Sub2) this).aShortArray9442[i_1925_]
		= (short) (i_1927_ << 10 | i_1928_ << 7 | i_1929_);
	}
	if (((Class89_Sub2) this).aClass171Array9459 != null) {
	    for (int i_1930_ = 0; i_1930_ < ((Class89_Sub2) this).anInt9427;
		 i_1930_++) {
		Class171 class171
		    = ((Class89_Sub2) this).aClass171Array9459[i_1930_];
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i_1930_];
		((Class140) class140).anInt1630
		    = (((Class140) class140).anInt1630 & ~0xffffff
		       | ((Class474.anIntArray6383
			   [(((Class89_Sub2) this).aShortArray9442
			     [((Class171) class171).anInt2069]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
    }
    
    static byte[] method15552(byte[] is, int i) {
	byte[] is_1931_ = new byte[i];
	System.arraycopy(is, 0, is_1931_, 0, i);
	return is_1931_;
    }
    
    public Class167[] method2016() {
	return ((Class89_Sub2) this).aClass167Array9454;
    }
    
    public Class167[] method2029() {
	return ((Class89_Sub2) this).aClass167Array9454;
    }
    
    public boolean method1891(int i, int i_1932_, Class266 class266,
			      boolean bool, int i_1933_) {
	Class268 class268
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass268_9136);
	class268.method5203(class266);
	class268.method5202(((Class103_Sub1)
			     ((Class89_Sub2) this).aClass103_Sub1_9457)
			    .aClass268_9105);
	boolean bool_1934_ = false;
	int i_1935_ = 2147483647;
	int i_1936_ = -2147483648;
	int i_1937_ = 2147483647;
	int i_1938_ = -2147483648;
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i_1939_ = ((((Class89_Sub2) this).aShort9448
			- ((Class89_Sub2) this).aShort9447)
		       >> 1);
	int i_1940_ = ((((Class89_Sub2) this).aShort9446
			- ((Class89_Sub2) this).aShort9403)
		       >> 1);
	int i_1941_ = ((((Class89_Sub2) this).aShort9450
			- ((Class89_Sub2) this).aShort9449)
		       >> 1);
	int i_1942_ = ((Class89_Sub2) this).aShort9447 + i_1939_;
	int i_1943_ = ((Class89_Sub2) this).aShort9403 + i_1940_;
	int i_1944_ = ((Class89_Sub2) this).aShort9449 + i_1941_;
	int i_1945_ = i_1942_ - (i_1939_ << i_1933_);
	int i_1946_ = i_1943_ - (i_1940_ << i_1933_);
	int i_1947_ = i_1944_ - (i_1941_ << i_1933_);
	int i_1948_ = i_1942_ + (i_1939_ << i_1933_);
	int i_1949_ = i_1943_ + (i_1940_ << i_1933_);
	int i_1950_ = i_1944_ + (i_1941_ << i_1933_);
	anIntArray9464[0] = i_1945_;
	anIntArray9429[0] = i_1946_;
	anIntArray9466[0] = i_1947_;
	anIntArray9464[1] = i_1948_;
	anIntArray9429[1] = i_1946_;
	anIntArray9466[1] = i_1947_;
	anIntArray9464[2] = i_1945_;
	anIntArray9429[2] = i_1949_;
	anIntArray9466[2] = i_1947_;
	anIntArray9464[3] = i_1948_;
	anIntArray9429[3] = i_1949_;
	anIntArray9466[3] = i_1947_;
	anIntArray9464[4] = i_1945_;
	anIntArray9429[4] = i_1946_;
	anIntArray9466[4] = i_1950_;
	anIntArray9464[5] = i_1948_;
	anIntArray9429[5] = i_1946_;
	anIntArray9466[5] = i_1950_;
	anIntArray9464[6] = i_1945_;
	anIntArray9429[6] = i_1949_;
	anIntArray9466[6] = i_1950_;
	anIntArray9464[7] = i_1948_;
	anIntArray9429[7] = i_1949_;
	anIntArray9466[7] = i_1950_;
	for (int i_1951_ = 0; i_1951_ < 8; i_1951_++) {
	    int i_1952_ = anIntArray9464[i_1951_];
	    int i_1953_ = anIntArray9429[i_1951_];
	    int i_1954_ = anIntArray9466[i_1951_];
	    float f = (class268.aFloatArray4353[2] * (float) i_1952_
		       + class268.aFloatArray4353[6] * (float) i_1953_
		       + class268.aFloatArray4353[10] * (float) i_1954_
		       + class268.aFloatArray4353[14]);
	    float f_1955_ = (class268.aFloatArray4353[3] * (float) i_1952_
			     + class268.aFloatArray4353[7] * (float) i_1953_
			     + class268.aFloatArray4353[11] * (float) i_1954_
			     + class268.aFloatArray4353[15]);
	    if (f >= -f_1955_) {
		float f_1956_
		    = (class268.aFloatArray4353[0] * (float) i_1952_
		       + class268.aFloatArray4353[4] * (float) i_1953_
		       + class268.aFloatArray4353[8] * (float) i_1954_
		       + class268.aFloatArray4353[12]);
		float f_1957_
		    = (class268.aFloatArray4353[1] * (float) i_1952_
		       + class268.aFloatArray4353[5] * (float) i_1953_
		       + class268.aFloatArray4353[9] * (float) i_1954_
		       + class268.aFloatArray4353[13]);
		int i_1958_
		    = (int) ((((Class103_Sub1)
			       ((Class89_Sub2) this).aClass103_Sub1_9457)
			      .aFloat9127)
			     + (((Class103_Sub1)
				 ((Class89_Sub2) this).aClass103_Sub1_9457)
				.aFloat9128) * f_1956_ / f_1955_);
		int i_1959_
		    = (int) ((((Class103_Sub1)
			       ((Class89_Sub2) this).aClass103_Sub1_9457)
			      .aFloat9129)
			     + (((Class103_Sub1)
				 ((Class89_Sub2) this).aClass103_Sub1_9457)
				.aFloat9130) * f_1957_ / f_1955_);
		if (i_1958_ < i_1935_)
		    i_1935_ = i_1958_;
		if (i_1958_ > i_1936_)
		    i_1936_ = i_1958_;
		if (i_1959_ < i_1937_)
		    i_1937_ = i_1959_;
		if (i_1959_ > i_1938_)
		    i_1938_ = i_1959_;
		bool_1934_ = true;
	    }
	}
	if (bool_1934_ && i > i_1935_ && i < i_1936_ && i_1932_ > i_1937_
	    && i_1932_ < i_1938_) {
	    if (bool)
		return true;
	    if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		 .anIntArray9232).length
		< ((Class89_Sub2) this).anInt9416) {
		((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .anIntArray9232
		    = new int[((Class89_Sub2) this).anInt9416];
		((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		    .anIntArray9175
		    = new int[((Class89_Sub2) this).anInt9416];
	    }
	    int[] is
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .anIntArray9232);
	    int[] is_1960_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .anIntArray9175);
	    for (int i_1961_ = 0; i_1961_ < ((Class89_Sub2) this).anInt9410;
		 i_1961_++) {
		int i_1962_ = ((Class89_Sub2) this).anIntArray9411[i_1961_];
		int i_1963_ = ((Class89_Sub2) this).anIntArray9412[i_1961_];
		int i_1964_ = ((Class89_Sub2) this).anIntArray9413[i_1961_];
		float f = (class268.aFloatArray4353[2] * (float) i_1962_
			   + class268.aFloatArray4353[6] * (float) i_1963_
			   + class268.aFloatArray4353[10] * (float) i_1964_
			   + class268.aFloatArray4353[14]);
		float f_1965_
		    = (class268.aFloatArray4353[3] * (float) i_1962_
		       + class268.aFloatArray4353[7] * (float) i_1963_
		       + class268.aFloatArray4353[11] * (float) i_1964_
		       + class268.aFloatArray4353[15]);
		if (f >= -f_1965_) {
		    float f_1966_
			= (class268.aFloatArray4353[0] * (float) i_1962_
			   + class268.aFloatArray4353[4] * (float) i_1963_
			   + class268.aFloatArray4353[8] * (float) i_1964_
			   + class268.aFloatArray4353[12]);
		    float f_1967_
			= (class268.aFloatArray4353[1] * (float) i_1962_
			   + class268.aFloatArray4353[5] * (float) i_1963_
			   + class268.aFloatArray4353[9] * (float) i_1964_
			   + class268.aFloatArray4353[13]);
		    int i_1968_
			= ((Class89_Sub2) this).anIntArray9395[i_1961_];
		    int i_1969_
			= ((Class89_Sub2) this).anIntArray9395[i_1961_ + 1];
		    for (int i_1970_ = i_1968_;
			 (i_1970_ < i_1969_
			  && (((Class89_Sub2) this).aShortArray9455[i_1970_]
			      != 0));
			 i_1970_++) {
			int i_1971_
			    = ((((Class89_Sub2) this).aShortArray9455[i_1970_]
				& 0xffff)
			       - 1);
			is[i_1971_]
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9127)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9128
					* f_1966_ / f_1965_));
			is_1960_[i_1971_]
			    = (int) ((((Class103_Sub1) (((Class89_Sub2) this)
							.aClass103_Sub1_9457))
				      .aFloat9129)
				     + (((Class103_Sub1)
					 (((Class89_Sub2) this)
					  .aClass103_Sub1_9457)).aFloat9130
					* f_1967_ / f_1965_));
		    }
		} else {
		    int i_1972_
			= ((Class89_Sub2) this).anIntArray9395[i_1961_];
		    int i_1973_
			= ((Class89_Sub2) this).anIntArray9395[i_1961_ + 1];
		    for (int i_1974_ = i_1972_;
			 (i_1974_ < i_1973_
			  && (((Class89_Sub2) this).aShortArray9455[i_1974_]
			      != 0));
			 i_1974_++) {
			int i_1975_
			    = ((((Class89_Sub2) this).aShortArray9455[i_1974_]
				& 0xffff)
			       - 1);
			is[i_1975_] = -999999;
		    }
		}
	    }
	    for (int i_1976_ = 0; i_1976_ < ((Class89_Sub2) this).anInt9424;
		 i_1976_++) {
		if (is[(((Class89_Sub2) this).aShortArray9428[i_1976_]
			& 0xffff)] != -999999
		    && is[(((Class89_Sub2) this).aShortArray9462[i_1976_]
			   & 0xffff)] != -999999
		    && is[(((Class89_Sub2) this).aShortArray9407[i_1976_]
			   & 0xffff)] != -999999
		    && method15535(i, i_1932_,
				   is_1960_[((((Class89_Sub2) this)
					      .aShortArray9428[i_1976_])
					     & 0xffff)],
				   is_1960_[((((Class89_Sub2) this)
					      .aShortArray9462[i_1976_])
					     & 0xffff)],
				   is_1960_[((((Class89_Sub2) this)
					      .aShortArray9407[i_1976_])
					     & 0xffff)],
				   is[(((Class89_Sub2) this).aShortArray9428
				       [i_1976_]) & 0xffff],
				   is[(((Class89_Sub2) this).aShortArray9462
				       [i_1976_]) & 0xffff],
				   is[(((Class89_Sub2) this).aShortArray9407
				       [i_1976_]) & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method1965() {
	if (((Class89_Sub2) this).aShortArray9414 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub2) this).aShortArray9414.length;
	     i++) {
	    if (((Class89_Sub2) this).aShortArray9414[i] != -1) {
		Class101 class101
		    = (((Class89_Sub2) this).aClass103_Sub1_9457
			   .aClass107_1458.method2680
		       (((Class89_Sub2) this).aShortArray9414[i] & 0xffff,
			-468136586));
		if (class101.anInt1403 * 218388063 != -1
		    && !((Class103_Sub1)
			 ((Class89_Sub2) this).aClass103_Sub1_9457)
			    .aClass173_9080.method3719(class101, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method1914() {
	return ((Class89_Sub2) this).aBool9425;
    }
    
    public void method1942(Class89 class89, int i, int i_1977_, int i_1978_,
			   boolean bool) {
	Class89_Sub2 class89_sub2_1979_ = (Class89_Sub2) class89;
	if (((Class89_Sub2) this).anInt9424 != 0
	    && ((Class89_Sub2) class89_sub2_1979_).anInt9424 != 0) {
	    int i_1980_ = ((Class89_Sub2) class89_sub2_1979_).anInt9410;
	    int[] is = ((Class89_Sub2) class89_sub2_1979_).anIntArray9411;
	    int[] is_1981_
		= ((Class89_Sub2) class89_sub2_1979_).anIntArray9412;
	    int[] is_1982_
		= ((Class89_Sub2) class89_sub2_1979_).anIntArray9413;
	    short[] is_1983_
		= ((Class89_Sub2) class89_sub2_1979_).aShortArray9417;
	    short[] is_1984_
		= ((Class89_Sub2) class89_sub2_1979_).aShortArray9418;
	    short[] is_1985_
		= ((Class89_Sub2) class89_sub2_1979_).aShortArray9419;
	    byte[] is_1986_
		= ((Class89_Sub2) class89_sub2_1979_).aByteArray9420;
	    short[] is_1987_;
	    short[] is_1988_;
	    short[] is_1989_;
	    byte[] is_1990_;
	    if (((Class89_Sub2) this).aClass178_9456 != null) {
		is_1987_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aShortArray2129);
		is_1988_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aShortArray2127);
		is_1989_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aShortArray2126);
		is_1990_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aByteArray2128);
	    } else {
		is_1987_ = null;
		is_1988_ = null;
		is_1989_ = null;
		is_1990_ = null;
	    }
	    short[] is_1991_;
	    short[] is_1992_;
	    short[] is_1993_;
	    byte[] is_1994_;
	    if (((Class89_Sub2) class89_sub2_1979_).aClass178_9456 != null) {
		is_1991_ = ((Class178) (((Class89_Sub2) class89_sub2_1979_)
					.aClass178_9456)).aShortArray2129;
		is_1992_ = ((Class178) (((Class89_Sub2) class89_sub2_1979_)
					.aClass178_9456)).aShortArray2127;
		is_1993_ = ((Class178) (((Class89_Sub2) class89_sub2_1979_)
					.aClass178_9456)).aShortArray2126;
		is_1994_ = ((Class178) (((Class89_Sub2) class89_sub2_1979_)
					.aClass178_9456)).aByteArray2128;
	    } else {
		is_1991_ = null;
		is_1992_ = null;
		is_1993_ = null;
		is_1994_ = null;
	    }
	    int[] is_1995_
		= ((Class89_Sub2) class89_sub2_1979_).anIntArray9395;
	    short[] is_1996_
		= ((Class89_Sub2) class89_sub2_1979_).aShortArray9455;
	    if (!((Class89_Sub2) class89_sub2_1979_).aBool9444)
		class89_sub2_1979_.method15537();
	    int i_1997_ = ((Class89_Sub2) class89_sub2_1979_).aShort9403;
	    int i_1998_ = ((Class89_Sub2) class89_sub2_1979_).aShort9446;
	    int i_1999_ = ((Class89_Sub2) class89_sub2_1979_).aShort9447;
	    int i_2000_ = ((Class89_Sub2) class89_sub2_1979_).aShort9448;
	    int i_2001_ = ((Class89_Sub2) class89_sub2_1979_).aShort9449;
	    int i_2002_ = ((Class89_Sub2) class89_sub2_1979_).aShort9450;
	    for (int i_2003_ = 0; i_2003_ < ((Class89_Sub2) this).anInt9410;
		 i_2003_++) {
		int i_2004_
		    = ((Class89_Sub2) this).anIntArray9412[i_2003_] - i_1977_;
		if (i_2004_ >= i_1997_ && i_2004_ <= i_1998_) {
		    int i_2005_
			= ((Class89_Sub2) this).anIntArray9411[i_2003_] - i;
		    if (i_2005_ >= i_1999_ && i_2005_ <= i_2000_) {
			int i_2006_
			    = (((Class89_Sub2) this).anIntArray9413[i_2003_]
			       - i_1978_);
			if (i_2006_ >= i_2001_ && i_2006_ <= i_2002_) {
			    int i_2007_ = -1;
			    int i_2008_ = (((Class89_Sub2) this).anIntArray9395
					   [i_2003_]);
			    int i_2009_ = (((Class89_Sub2) this).anIntArray9395
					   [i_2003_ + 1]);
			    for (int i_2010_ = i_2008_;
				 (i_2010_ < i_2009_
				  && (((Class89_Sub2) this).aShortArray9455
				      [i_2010_]) != 0);
				 i_2010_++) {
				i_2007_ = ((((Class89_Sub2) this)
					    .aShortArray9455[i_2010_])
					   & 0xffff) - 1;
				if ((((Class89_Sub2) this).aByteArray9420
				     [i_2007_])
				    != 0)
				    break;
			    }
			    if (i_2007_ != -1) {
				for (int i_2011_ = 0; i_2011_ < i_1980_;
				     i_2011_++) {
				    if (i_2005_ == is[i_2011_]
					&& i_2006_ == is_1982_[i_2011_]
					&& i_2004_ == is_1981_[i_2011_]) {
					int i_2012_ = -1;
					i_2008_ = is_1995_[i_2011_];
					i_2009_ = is_1995_[i_2011_ + 1];
					for (int i_2013_ = i_2008_;
					     (i_2013_ < i_2009_
					      && is_1996_[i_2013_] != 0);
					     i_2013_++) {
					    i_2012_ = (is_1996_[i_2013_]
						       & 0xffff) - 1;
					    if (is_1986_[i_2012_] != 0)
						break;
					}
					if (i_2012_ != -1) {
					    if (is_1987_ == null) {
						((Class89_Sub2) this)
						    .aClass178_9456
						    = new Class178();
						is_1987_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2129
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9417),
							-514597120));
						is_1988_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2127
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9418),
							-583956483));
						is_1989_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2126
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9419),
							-1553435390));
						is_1990_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aByteArray2128
						    = (Class554.method12275
						       ((((Class89_Sub2) this)
							 .aByteArray9420),
							-841739618));
					    }
					    if (is_1991_ == null) {
						Class178 class178
						    = (((Class89_Sub2)
							class89_sub2_1979_)
							   .aClass178_9456
						       = new Class178());
						is_1991_
						    = ((Class178) class178)
							  .aShortArray2129
						    = (Class518.method11659
						       (is_1983_, -692427392));
						is_1992_
						    = ((Class178) class178)
							  .aShortArray2127
						    = (Class518.method11659
						       (is_1984_, -672891055));
						is_1993_
						    = ((Class178) class178)
							  .aShortArray2126
						    = (Class518.method11659
						       (is_1985_,
							-1815578497));
						is_1994_
						    = ((Class178) class178)
							  .aByteArray2128
						    = (Class554.method12275
						       (is_1986_, -841739618));
					    }
					    short i_2014_
						= (((Class89_Sub2) this)
						   .aShortArray9417[i_2007_]);
					    short i_2015_
						= (((Class89_Sub2) this)
						   .aShortArray9418[i_2007_]);
					    short i_2016_
						= (((Class89_Sub2) this)
						   .aShortArray9419[i_2007_]);
					    byte i_2017_
						= (((Class89_Sub2) this)
						   .aByteArray9420[i_2007_]);
					    i_2008_ = is_1995_[i_2011_];
					    i_2009_ = is_1995_[i_2011_ + 1];
					    for (int i_2018_ = i_2008_;
						 i_2018_ < i_2009_;
						 i_2018_++) {
						int i_2019_
						    = is_1996_[i_2018_] - 1;
						if (i_2019_ == -1)
						    break;
						if (is_1994_[i_2019_] != 0) {
						    is_1991_[i_2019_]
							+= i_2014_;
						    is_1992_[i_2019_]
							+= i_2015_;
						    is_1993_[i_2019_]
							+= i_2016_;
						    is_1994_[i_2019_]
							+= i_2017_;
						}
					    }
					    i_2014_ = is_1983_[i_2012_];
					    i_2015_ = is_1984_[i_2012_];
					    i_2016_ = is_1985_[i_2012_];
					    i_2017_ = is_1986_[i_2012_];
					    i_2008_
						= (((Class89_Sub2) this)
						   .anIntArray9395[i_2003_]);
					    i_2009_ = (((Class89_Sub2) this)
						       .anIntArray9395
						       [i_2003_ + 1]);
					    for (int i_2020_ = i_2008_;
						 (i_2020_ < i_2009_
						  && (((Class89_Sub2) this)
						      .aShortArray9455
						      [i_2020_]) != 0);
						 i_2020_++) {
						int i_2021_
						    = (((((Class89_Sub2) this)
							 .aShortArray9455
							 [i_2020_])
							& 0xffff)
						       - 1);
						if (is_1990_[i_2021_] != 0) {
						    is_1987_[i_2021_]
							+= i_2014_;
						    is_1988_[i_2021_]
							+= i_2015_;
						    is_1989_[i_2021_]
							+= i_2016_;
						    is_1990_[i_2021_]
							+= i_2017_;
						}
					    }
					    if ((((Class89_Sub2) this)
						 .aClass151_9436) == null
						&& (((Class89_Sub2) this)
						    .aClass151_9433) != null)
						((Class151)
						 (((Class89_Sub2) this)
						  .aClass151_9433))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2) this)
						 .aClass151_9436)
						!= null)
						((Class151)
						 (((Class89_Sub2) this)
						  .aClass151_9436))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2)
						  class89_sub2_1979_)
						 .aClass151_9436) == null
						&& (((Class89_Sub2)
						     class89_sub2_1979_)
						    .aClass151_9433) != null)
						((Class151)
						 (((Class89_Sub2)
						   class89_sub2_1979_)
						  .aClass151_9433))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2)
						  class89_sub2_1979_)
						 .aClass151_9436)
						!= null)
						((Class151)
						 (((Class89_Sub2)
						   class89_sub2_1979_)
						  .aClass151_9436))
						    .anInterface8_1713
						    = null;
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
    
    public boolean method2022() {
	return ((Class89_Sub2) this).aBool9425;
    }
    
    boolean method1884() {
	if (((Class89_Sub2) this).anIntArrayArray9467 == null)
	    return false;
	for (int i = 0; i < ((Class89_Sub2) this).anInt9409; i++) {
	    ((Class89_Sub2) this).anIntArray9411[i] <<= 4;
	    ((Class89_Sub2) this).anIntArray9412[i] <<= 4;
	    ((Class89_Sub2) this).anIntArray9413[i] <<= 4;
	}
	anInt9426 = 0;
	anInt9468 = 0;
	anInt9401 = 0;
	return true;
    }
    
    short method15553(Class161 class161, int i, long l, int i_2022_,
		      int i_2023_, int i_2024_, int i_2025_, float f,
		      float f_2026_) {
	int i_2027_ = ((Class89_Sub2) this).anIntArray9395[i];
	int i_2028_ = ((Class89_Sub2) this).anIntArray9395[i + 1];
	int i_2029_ = 0;
	for (int i_2030_ = i_2027_; i_2030_ < i_2028_; i_2030_++) {
	    if (((Class89_Sub2) this).aShortArray9455[i_2030_] == 0) {
		i_2029_ = i_2030_;
		break;
	    }
	    int i_2031_
		= ((((Class89_Sub2) this).aShortArray9455[i_2030_] & 0xffff)
		   - 1);
	    if (aLongArray9458[i_2030_] == l)
		return (short) i_2031_;
	}
	((Class89_Sub2) this).aShortArray9455[i_2029_]
	    = (short) (((Class89_Sub2) this).anInt9416 + 1);
	aLongArray9458[i_2029_] = l;
	((Class89_Sub2) this).aShortArray9417[((Class89_Sub2) this).anInt9416]
	    = (short) i_2022_;
	((Class89_Sub2) this).aShortArray9418[((Class89_Sub2) this).anInt9416]
	    = (short) i_2023_;
	((Class89_Sub2) this).aShortArray9419[((Class89_Sub2) this).anInt9416]
	    = (short) i_2024_;
	((Class89_Sub2) this).aByteArray9420[((Class89_Sub2) this).anInt9416]
	    = (byte) i_2025_;
	((Class89_Sub2) this).aFloatArray9422[((Class89_Sub2) this).anInt9416]
	    = f;
	((Class89_Sub2) this).aFloatArray9423[((Class89_Sub2) this).anInt9416]
	    = f_2026_;
	return (short) ((Class89_Sub2) this).anInt9416++;
    }
    
    short method15554(Class161 class161, int i, long l, int i_2032_,
		      int i_2033_, int i_2034_, int i_2035_, float f,
		      float f_2036_) {
	int i_2037_ = ((Class89_Sub2) this).anIntArray9395[i];
	int i_2038_ = ((Class89_Sub2) this).anIntArray9395[i + 1];
	int i_2039_ = 0;
	for (int i_2040_ = i_2037_; i_2040_ < i_2038_; i_2040_++) {
	    if (((Class89_Sub2) this).aShortArray9455[i_2040_] == 0) {
		i_2039_ = i_2040_;
		break;
	    }
	    int i_2041_
		= ((((Class89_Sub2) this).aShortArray9455[i_2040_] & 0xffff)
		   - 1);
	    if (aLongArray9458[i_2040_] == l)
		return (short) i_2041_;
	}
	((Class89_Sub2) this).aShortArray9455[i_2039_]
	    = (short) (((Class89_Sub2) this).anInt9416 + 1);
	aLongArray9458[i_2039_] = l;
	((Class89_Sub2) this).aShortArray9417[((Class89_Sub2) this).anInt9416]
	    = (short) i_2032_;
	((Class89_Sub2) this).aShortArray9418[((Class89_Sub2) this).anInt9416]
	    = (short) i_2033_;
	((Class89_Sub2) this).aShortArray9419[((Class89_Sub2) this).anInt9416]
	    = (short) i_2034_;
	((Class89_Sub2) this).aByteArray9420[((Class89_Sub2) this).anInt9416]
	    = (byte) i_2035_;
	((Class89_Sub2) this).aFloatArray9422[((Class89_Sub2) this).anInt9416]
	    = f;
	((Class89_Sub2) this).aFloatArray9423[((Class89_Sub2) this).anInt9416]
	    = f_2036_;
	return (short) ((Class89_Sub2) this).anInt9416++;
    }
    
    static byte[] method15555(byte[] is, int i) {
	byte[] is_2042_ = new byte[i];
	System.arraycopy(is, 0, is_2042_, 0, i);
	return is_2042_;
    }
    
    public void method1903(int i) {
	((Class89_Sub2) this).aShort9405 = (short) i;
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
    }
    
    void method1876(int i, int i_2043_, int i_2044_, int i_2045_) {
	if (i == 0) {
	    int i_2046_ = 0;
	    anInt9426 = 0;
	    anInt9468 = 0;
	    anInt9401 = 0;
	    for (int i_2047_ = 0; i_2047_ < ((Class89_Sub2) this).anInt9410;
		 i_2047_++) {
		anInt9426 += ((Class89_Sub2) this).anIntArray9411[i_2047_];
		anInt9468 += ((Class89_Sub2) this).anIntArray9412[i_2047_];
		anInt9401 += ((Class89_Sub2) this).anIntArray9413[i_2047_];
		i_2046_++;
	    }
	    if (i_2046_ > 0) {
		anInt9426 = anInt9426 / i_2046_ + i_2043_;
		anInt9468 = anInt9468 / i_2046_ + i_2044_;
		anInt9401 = anInt9401 / i_2046_ + i_2045_;
	    } else {
		anInt9426 = i_2043_;
		anInt9468 = i_2044_;
		anInt9401 = i_2045_;
	    }
	} else if (i == 1) {
	    for (int i_2048_ = 0; i_2048_ < ((Class89_Sub2) this).anInt9410;
		 i_2048_++) {
		((Class89_Sub2) this).anIntArray9411[i_2048_] += i_2043_;
		((Class89_Sub2) this).anIntArray9412[i_2048_] += i_2044_;
		((Class89_Sub2) this).anIntArray9413[i_2048_] += i_2045_;
	    }
	} else if (i == 2) {
	    for (int i_2049_ = 0; i_2049_ < ((Class89_Sub2) this).anInt9410;
		 i_2049_++) {
		((Class89_Sub2) this).anIntArray9411[i_2049_] -= anInt9426;
		((Class89_Sub2) this).anIntArray9412[i_2049_] -= anInt9468;
		((Class89_Sub2) this).anIntArray9413[i_2049_] -= anInt9401;
		if (i_2045_ != 0) {
		    int i_2050_ = Class282.anIntArray4430[i_2045_];
		    int i_2051_ = Class282.anIntArray4441[i_2045_];
		    int i_2052_
			= (((((Class89_Sub2) this).anIntArray9412[i_2049_]
			     * i_2050_)
			    + (((Class89_Sub2) this).anIntArray9411[i_2049_]
			       * i_2051_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub2) this).anIntArray9412[i_2049_]
			= ((((Class89_Sub2) this).anIntArray9412[i_2049_]
			    * i_2051_)
			   - (((Class89_Sub2) this).anIntArray9411[i_2049_]
			      * i_2050_)
			   + 16383) >> 14;
		    ((Class89_Sub2) this).anIntArray9411[i_2049_] = i_2052_;
		}
		if (i_2043_ != 0) {
		    int i_2053_ = Class282.anIntArray4430[i_2043_];
		    int i_2054_ = Class282.anIntArray4441[i_2043_];
		    int i_2055_
			= (((((Class89_Sub2) this).anIntArray9412[i_2049_]
			     * i_2054_)
			    - (((Class89_Sub2) this).anIntArray9413[i_2049_]
			       * i_2053_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub2) this).anIntArray9413[i_2049_]
			= ((((Class89_Sub2) this).anIntArray9412[i_2049_]
			    * i_2053_)
			   + (((Class89_Sub2) this).anIntArray9413[i_2049_]
			      * i_2054_)
			   + 16383) >> 14;
		    ((Class89_Sub2) this).anIntArray9412[i_2049_] = i_2055_;
		}
		if (i_2044_ != 0) {
		    int i_2056_ = Class282.anIntArray4430[i_2044_];
		    int i_2057_ = Class282.anIntArray4441[i_2044_];
		    int i_2058_
			= (((((Class89_Sub2) this).anIntArray9413[i_2049_]
			     * i_2056_)
			    + (((Class89_Sub2) this).anIntArray9411[i_2049_]
			       * i_2057_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub2) this).anIntArray9413[i_2049_]
			= ((((Class89_Sub2) this).anIntArray9413[i_2049_]
			    * i_2057_)
			   - (((Class89_Sub2) this).anIntArray9411[i_2049_]
			      * i_2056_)
			   + 16383) >> 14;
		    ((Class89_Sub2) this).anIntArray9411[i_2049_] = i_2058_;
		}
		((Class89_Sub2) this).anIntArray9411[i_2049_] += anInt9426;
		((Class89_Sub2) this).anIntArray9412[i_2049_] += anInt9468;
		((Class89_Sub2) this).anIntArray9413[i_2049_] += anInt9401;
	    }
	} else if (i == 3) {
	    for (int i_2059_ = 0; i_2059_ < ((Class89_Sub2) this).anInt9410;
		 i_2059_++) {
		((Class89_Sub2) this).anIntArray9411[i_2059_] -= anInt9426;
		((Class89_Sub2) this).anIntArray9412[i_2059_] -= anInt9468;
		((Class89_Sub2) this).anIntArray9413[i_2059_] -= anInt9401;
		((Class89_Sub2) this).anIntArray9411[i_2059_]
		    = (((Class89_Sub2) this).anIntArray9411[i_2059_] * i_2043_
		       / 128);
		((Class89_Sub2) this).anIntArray9412[i_2059_]
		    = (((Class89_Sub2) this).anIntArray9412[i_2059_] * i_2044_
		       / 128);
		((Class89_Sub2) this).anIntArray9413[i_2059_]
		    = (((Class89_Sub2) this).anIntArray9413[i_2059_] * i_2045_
		       / 128);
		((Class89_Sub2) this).anIntArray9411[i_2059_] += anInt9426;
		((Class89_Sub2) this).anIntArray9412[i_2059_] += anInt9468;
		((Class89_Sub2) this).anIntArray9413[i_2059_] += anInt9401;
	    }
	} else if (i == 5) {
	    for (int i_2060_ = 0; i_2060_ < ((Class89_Sub2) this).anInt9424;
		 i_2060_++) {
		int i_2061_
		    = ((((Class89_Sub2) this).aByteArray9408[i_2060_] & 0xff)
		       + i_2043_ * 8);
		if (i_2061_ < 0)
		    i_2061_ = 0;
		else if (i_2061_ > 255)
		    i_2061_ = 255;
		((Class89_Sub2) this).aByteArray9408[i_2060_] = (byte) i_2061_;
	    }
	    if (((Class89_Sub2) this).aClass151_9433 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9433)
		    .anInterface8_1713
		    = null;
	    if (((Class89_Sub2) this).aClass171Array9459 != null) {
		for (int i_2062_ = 0;
		     i_2062_ < ((Class89_Sub2) this).anInt9427; i_2062_++) {
		    Class171 class171
			= ((Class89_Sub2) this).aClass171Array9459[i_2062_];
		    Class140 class140
			= ((Class89_Sub2) this).aClass140Array9460[i_2062_];
		    ((Class140) class140).anInt1630
			= (((Class140) class140).anInt1630 & 0xffffff
			   | 255 - ((((Class89_Sub2) this).aByteArray9408
				     [((Class171) class171).anInt2069])
				    & 0xff) << 24);
		}
	    }
	} else if (i == 7) {
	    for (int i_2063_ = 0; i_2063_ < ((Class89_Sub2) this).anInt9424;
		 i_2063_++) {
		int i_2064_
		    = ((Class89_Sub2) this).aShortArray9442[i_2063_] & 0xffff;
		int i_2065_ = i_2064_ >> 10 & 0x3f;
		int i_2066_ = i_2064_ >> 7 & 0x7;
		int i_2067_ = i_2064_ & 0x7f;
		i_2065_ = i_2065_ + i_2043_ & 0x3f;
		i_2066_ += i_2044_ / 4;
		if (i_2066_ < 0)
		    i_2066_ = 0;
		else if (i_2066_ > 7)
		    i_2066_ = 7;
		i_2067_ += i_2045_;
		if (i_2067_ < 0)
		    i_2067_ = 0;
		else if (i_2067_ > 127)
		    i_2067_ = 127;
		((Class89_Sub2) this).aShortArray9442[i_2063_]
		    = (short) (i_2065_ << 10 | i_2066_ << 7 | i_2067_);
	    }
	    if (((Class89_Sub2) this).aClass151_9433 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9433)
		    .anInterface8_1713
		    = null;
	    if (((Class89_Sub2) this).aClass171Array9459 != null) {
		for (int i_2068_ = 0;
		     i_2068_ < ((Class89_Sub2) this).anInt9427; i_2068_++) {
		    Class171 class171
			= ((Class89_Sub2) this).aClass171Array9459[i_2068_];
		    Class140 class140
			= ((Class89_Sub2) this).aClass140Array9460[i_2068_];
		    ((Class140) class140).anInt1630
			= (((Class140) class140).anInt1630 & ~0xffffff
			   | ((Class474.anIntArray6383
			       [(((Class89_Sub2) this).aShortArray9442
				 [((Class171) class171).anInt2069]) & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_2069_ = 0; i_2069_ < ((Class89_Sub2) this).anInt9427;
		 i_2069_++) {
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i_2069_];
		((Class140) class140).anInt1628 += i_2043_;
		((Class140) class140).anInt1629 += i_2044_;
	    }
	} else if (i == 10) {
	    for (int i_2070_ = 0; i_2070_ < ((Class89_Sub2) this).anInt9427;
		 i_2070_++) {
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i_2070_];
		((Class140) class140).anInt1626
		    = ((Class140) class140).anInt1626 * i_2043_ >> 7;
		((Class140) class140).anInt1627
		    = ((Class140) class140).anInt1627 * i_2044_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_2071_ = 0; i_2071_ < ((Class89_Sub2) this).anInt9427;
		 i_2071_++) {
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i_2071_];
		((Class140) class140).anInt1625
		    = ((Class140) class140).anInt1625 + i_2043_ & 0x3fff;
	    }
	}
    }
    
    static short[] method15556(short[] is, int i) {
	short[] is_2072_ = new short[i];
	System.arraycopy(is, 0, is_2072_, 0, i);
	return is_2072_;
    }
    
    void method15557() {
	int i = 32767;
	int i_2073_ = 32767;
	int i_2074_ = 32767;
	int i_2075_ = -32768;
	int i_2076_ = -32768;
	int i_2077_ = -32768;
	int i_2078_ = 0;
	int i_2079_ = 0;
	for (int i_2080_ = 0; i_2080_ < ((Class89_Sub2) this).anInt9410;
	     i_2080_++) {
	    int i_2081_ = ((Class89_Sub2) this).anIntArray9411[i_2080_];
	    int i_2082_ = ((Class89_Sub2) this).anIntArray9412[i_2080_];
	    int i_2083_ = ((Class89_Sub2) this).anIntArray9413[i_2080_];
	    if (i_2081_ < i)
		i = i_2081_;
	    if (i_2081_ > i_2075_)
		i_2075_ = i_2081_;
	    if (i_2082_ < i_2073_)
		i_2073_ = i_2082_;
	    if (i_2082_ > i_2076_)
		i_2076_ = i_2082_;
	    if (i_2083_ < i_2074_)
		i_2074_ = i_2083_;
	    if (i_2083_ > i_2077_)
		i_2077_ = i_2083_;
	    int i_2084_ = i_2081_ * i_2081_ + i_2083_ * i_2083_;
	    if (i_2084_ > i_2078_)
		i_2078_ = i_2084_;
	    i_2084_
		= i_2081_ * i_2081_ + i_2083_ * i_2083_ + i_2082_ * i_2082_;
	    if (i_2084_ > i_2079_)
		i_2079_ = i_2084_;
	}
	((Class89_Sub2) this).aShort9447 = (short) i;
	((Class89_Sub2) this).aShort9448 = (short) i_2075_;
	((Class89_Sub2) this).aShort9403 = (short) i_2073_;
	((Class89_Sub2) this).aShort9446 = (short) i_2076_;
	((Class89_Sub2) this).aShort9449 = (short) i_2074_;
	((Class89_Sub2) this).aShort9450 = (short) i_2077_;
	((Class89_Sub2) this).anInt9421
	    = (int) (Math.sqrt((double) i_2078_) + 0.99);
	((Class89_Sub2) this).anInt9443
	    = (int) (Math.sqrt((double) i_2079_) + 0.99);
	((Class89_Sub2) this).aBool9444 = true;
    }
    
    static short[] method15558(short[] is, int i) {
	short[] is_2085_ = new short[i];
	System.arraycopy(is, 0, is_2085_, 0, i);
	return is_2085_;
    }
    
    static float[] method15559(float[] fs, int i) {
	float[] fs_2086_ = new float[i];
	System.arraycopy(fs, 0, fs_2086_, 0, i);
	return fs_2086_;
    }
    
    static float[] method15560(float[] fs, int i) {
	float[] fs_2087_ = new float[i];
	System.arraycopy(fs, 0, fs_2087_, 0, i);
	return fs_2087_;
    }
    
    void method1963(int i, int[] is, int i_2088_, int i_2089_, int i_2090_,
		    boolean bool, int i_2091_, int[] is_2092_) {
	int i_2093_ = is.length;
	if (i == 0) {
	    i_2088_ <<= 4;
	    i_2089_ <<= 4;
	    i_2090_ <<= 4;
	    int i_2094_ = 0;
	    anInt9426 = 0;
	    anInt9468 = 0;
	    anInt9401 = 0;
	    for (int i_2095_ = 0; i_2095_ < i_2093_; i_2095_++) {
		int i_2096_ = is[i_2095_];
		if (i_2096_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_2097_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_2096_];
		    for (int i_2098_ = 0; i_2098_ < is_2097_.length;
			 i_2098_++) {
			int i_2099_ = is_2097_[i_2098_];
			if (((Class89_Sub2) this).aShortArray9465 == null
			    || (i_2091_ & (((Class89_Sub2) this)
					   .aShortArray9465[i_2099_])) != 0) {
			    anInt9426 += (((Class89_Sub2) this).anIntArray9411
					  [i_2099_]);
			    anInt9468 += (((Class89_Sub2) this).anIntArray9412
					  [i_2099_]);
			    anInt9401 += (((Class89_Sub2) this).anIntArray9413
					  [i_2099_]);
			    i_2094_++;
			}
		    }
		}
	    }
	    if (i_2094_ > 0) {
		anInt9426 = anInt9426 / i_2094_ + i_2088_;
		anInt9468 = anInt9468 / i_2094_ + i_2089_;
		anInt9401 = anInt9401 / i_2094_ + i_2090_;
		aBool9470 = true;
	    } else {
		anInt9426 = i_2088_;
		anInt9468 = i_2089_;
		anInt9401 = i_2090_;
	    }
	} else if (i == 1) {
	    if (is_2092_ != null) {
		int i_2100_ = ((is_2092_[0] * i_2088_ + is_2092_[1] * i_2089_
				+ is_2092_[2] * i_2090_ + 8192)
			       >> 14);
		int i_2101_ = ((is_2092_[3] * i_2088_ + is_2092_[4] * i_2089_
				+ is_2092_[5] * i_2090_ + 8192)
			       >> 14);
		int i_2102_ = ((is_2092_[6] * i_2088_ + is_2092_[7] * i_2089_
				+ is_2092_[8] * i_2090_ + 8192)
			       >> 14);
		i_2088_ = i_2100_;
		i_2089_ = i_2101_;
		i_2090_ = i_2102_;
	    }
	    i_2088_ <<= 4;
	    i_2089_ <<= 4;
	    i_2090_ <<= 4;
	    for (int i_2103_ = 0; i_2103_ < i_2093_; i_2103_++) {
		int i_2104_ = is[i_2103_];
		if (i_2104_
		    < ((Class89_Sub2) this).anIntArrayArray9467.length) {
		    int[] is_2105_
			= ((Class89_Sub2) this).anIntArrayArray9467[i_2104_];
		    for (int i_2106_ = 0; i_2106_ < is_2105_.length;
			 i_2106_++) {
			int i_2107_ = is_2105_[i_2106_];
			if (((Class89_Sub2) this).aShortArray9465 == null
			    || (i_2091_ & (((Class89_Sub2) this)
					   .aShortArray9465[i_2107_])) != 0) {
			    ((Class89_Sub2) this).anIntArray9411[i_2107_]
				+= i_2088_;
			    ((Class89_Sub2) this).anIntArray9412[i_2107_]
				+= i_2089_;
			    ((Class89_Sub2) this).anIntArray9413[i_2107_]
				+= i_2090_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_2092_ != null) {
		int i_2108_ = is_2092_[9] << 4;
		int i_2109_ = is_2092_[10] << 4;
		int i_2110_ = is_2092_[11] << 4;
		int i_2111_ = is_2092_[12] << 4;
		int i_2112_ = is_2092_[13] << 4;
		int i_2113_ = is_2092_[14] << 4;
		if (aBool9470) {
		    int i_2114_
			= ((is_2092_[0] * anInt9426 + is_2092_[3] * anInt9468
			    + is_2092_[6] * anInt9401 + 8192)
			   >> 14);
		    int i_2115_
			= ((is_2092_[1] * anInt9426 + is_2092_[4] * anInt9468
			    + is_2092_[7] * anInt9401 + 8192)
			   >> 14);
		    int i_2116_
			= ((is_2092_[2] * anInt9426 + is_2092_[5] * anInt9468
			    + is_2092_[8] * anInt9401 + 8192)
			   >> 14);
		    i_2114_ += i_2111_;
		    i_2115_ += i_2112_;
		    i_2116_ += i_2113_;
		    anInt9426 = i_2114_;
		    anInt9468 = i_2115_;
		    anInt9401 = i_2116_;
		    aBool9470 = false;
		}
		int[] is_2117_ = new int[9];
		int i_2118_ = Class282.anIntArray4441[i_2088_];
		int i_2119_ = Class282.anIntArray4430[i_2088_];
		int i_2120_ = Class282.anIntArray4441[i_2089_];
		int i_2121_ = Class282.anIntArray4430[i_2089_];
		int i_2122_ = Class282.anIntArray4441[i_2090_];
		int i_2123_ = Class282.anIntArray4430[i_2090_];
		int i_2124_ = i_2119_ * i_2122_ + 8192 >> 14;
		int i_2125_ = i_2119_ * i_2123_ + 8192 >> 14;
		is_2117_[0]
		    = i_2120_ * i_2122_ + i_2121_ * i_2125_ + 8192 >> 14;
		is_2117_[1]
		    = -i_2120_ * i_2123_ + i_2121_ * i_2124_ + 8192 >> 14;
		is_2117_[2] = i_2121_ * i_2118_ + 8192 >> 14;
		is_2117_[3] = i_2118_ * i_2123_ + 8192 >> 14;
		is_2117_[4] = i_2118_ * i_2122_ + 8192 >> 14;
		is_2117_[5] = -i_2119_;
		is_2117_[6]
		    = -i_2121_ * i_2122_ + i_2120_ * i_2125_ + 8192 >> 14;
		is_2117_[7]
		    = i_2121_ * i_2123_ + i_2120_ * i_2124_ + 8192 >> 14;
		is_2117_[8] = i_2120_ * i_2118_ + 8192 >> 14;
		int i_2126_
		    = ((is_2117_[0] * -anInt9426 + is_2117_[1] * -anInt9468
			+ is_2117_[2] * -anInt9401 + 8192)
		       >> 14);
		int i_2127_
		    = ((is_2117_[3] * -anInt9426 + is_2117_[4] * -anInt9468
			+ is_2117_[5] * -anInt9401 + 8192)
		       >> 14);
		int i_2128_
		    = ((is_2117_[6] * -anInt9426 + is_2117_[7] * -anInt9468
			+ is_2117_[8] * -anInt9401 + 8192)
		       >> 14);
		int i_2129_ = i_2126_ + anInt9426;
		int i_2130_ = i_2127_ + anInt9468;
		int i_2131_ = i_2128_ + anInt9401;
		int[] is_2132_ = new int[9];
		for (int i_2133_ = 0; i_2133_ < 3; i_2133_++) {
		    for (int i_2134_ = 0; i_2134_ < 3; i_2134_++) {
			int i_2135_ = 0;
			for (int i_2136_ = 0; i_2136_ < 3; i_2136_++)
			    i_2135_ += (is_2117_[i_2133_ * 3 + i_2136_]
					* is_2092_[i_2134_ * 3 + i_2136_]);
			is_2132_[i_2133_ * 3 + i_2134_] = i_2135_ + 8192 >> 14;
		    }
		}
		int i_2137_ = ((is_2117_[0] * i_2111_ + is_2117_[1] * i_2112_
				+ is_2117_[2] * i_2113_ + 8192)
			       >> 14);
		int i_2138_ = ((is_2117_[3] * i_2111_ + is_2117_[4] * i_2112_
				+ is_2117_[5] * i_2113_ + 8192)
			       >> 14);
		int i_2139_ = ((is_2117_[6] * i_2111_ + is_2117_[7] * i_2112_
				+ is_2117_[8] * i_2113_ + 8192)
			       >> 14);
		i_2137_ += i_2129_;
		i_2138_ += i_2130_;
		i_2139_ += i_2131_;
		int[] is_2140_ = new int[9];
		for (int i_2141_ = 0; i_2141_ < 3; i_2141_++) {
		    for (int i_2142_ = 0; i_2142_ < 3; i_2142_++) {
			int i_2143_ = 0;
			for (int i_2144_ = 0; i_2144_ < 3; i_2144_++)
			    i_2143_ += (is_2092_[i_2141_ * 3 + i_2144_]
					* is_2132_[i_2142_ + i_2144_ * 3]);
			is_2140_[i_2141_ * 3 + i_2142_] = i_2143_ + 8192 >> 14;
		    }
		}
		int i_2145_ = ((is_2092_[0] * i_2137_ + is_2092_[1] * i_2138_
				+ is_2092_[2] * i_2139_ + 8192)
			       >> 14);
		int i_2146_ = ((is_2092_[3] * i_2137_ + is_2092_[4] * i_2138_
				+ is_2092_[5] * i_2139_ + 8192)
			       >> 14);
		int i_2147_ = ((is_2092_[6] * i_2137_ + is_2092_[7] * i_2138_
				+ is_2092_[8] * i_2139_ + 8192)
			       >> 14);
		i_2145_ += i_2108_;
		i_2146_ += i_2109_;
		i_2147_ += i_2110_;
		for (int i_2148_ = 0; i_2148_ < i_2093_; i_2148_++) {
		    int i_2149_ = is[i_2148_];
		    if (i_2149_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_2150_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_2149_]);
			for (int i_2151_ = 0; i_2151_ < is_2150_.length;
			     i_2151_++) {
			    int i_2152_ = is_2150_[i_2151_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_2091_ & (((Class89_Sub2) this)
						.aShortArray9465[i_2152_]))
				    != 0)) {
				int i_2153_
				    = (is_2140_[0] * (((Class89_Sub2) this)
						      .anIntArray9411[i_2152_])
				       + is_2140_[1] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_2152_])
				       + is_2140_[2] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_2152_])
				       + 8192) >> 14;
				int i_2154_
				    = (is_2140_[3] * (((Class89_Sub2) this)
						      .anIntArray9411[i_2152_])
				       + is_2140_[4] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_2152_])
				       + is_2140_[5] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_2152_])
				       + 8192) >> 14;
				int i_2155_
				    = (is_2140_[6] * (((Class89_Sub2) this)
						      .anIntArray9411[i_2152_])
				       + is_2140_[7] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_2152_])
				       + is_2140_[8] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_2152_])
				       + 8192) >> 14;
				i_2153_ += i_2145_;
				i_2154_ += i_2146_;
				i_2155_ += i_2147_;
				((Class89_Sub2) this).anIntArray9411[i_2152_]
				    = i_2153_;
				((Class89_Sub2) this).anIntArray9412[i_2152_]
				    = i_2154_;
				((Class89_Sub2) this).anIntArray9413[i_2152_]
				    = i_2155_;
			    }
			}
		    }
		}
	    } else {
		for (int i_2156_ = 0; i_2156_ < i_2093_; i_2156_++) {
		    int i_2157_ = is[i_2156_];
		    if (i_2157_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_2158_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_2157_]);
			for (int i_2159_ = 0; i_2159_ < is_2158_.length;
			     i_2159_++) {
			    int i_2160_ = is_2158_[i_2159_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_2091_ & (((Class89_Sub2) this)
						.aShortArray9465[i_2160_]))
				    != 0)) {
				((Class89_Sub2) this).anIntArray9411[i_2160_]
				    -= anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_2160_]
				    -= anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_2160_]
				    -= anInt9401;
				if (i_2090_ != 0) {
				    int i_2161_
					= Class282.anIntArray4430[i_2090_];
				    int i_2162_
					= Class282.anIntArray4441[i_2090_];
				    int i_2163_
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_2160_]) * i_2161_
					   + ((((Class89_Sub2) this)
					       .anIntArray9411[i_2160_])
					      * i_2162_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9412
					[i_2160_]
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_2160_]) * i_2162_
					   - ((((Class89_Sub2) this)
					       .anIntArray9411[i_2160_])
					      * i_2161_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9411
					[i_2160_]
					= i_2163_;
				}
				if (i_2088_ != 0) {
				    int i_2164_
					= Class282.anIntArray4430[i_2088_];
				    int i_2165_
					= Class282.anIntArray4441[i_2088_];
				    int i_2166_
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_2160_]) * i_2165_
					   - ((((Class89_Sub2) this)
					       .anIntArray9413[i_2160_])
					      * i_2164_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9413
					[i_2160_]
					= ((((Class89_Sub2) this)
					    .anIntArray9412[i_2160_]) * i_2164_
					   + ((((Class89_Sub2) this)
					       .anIntArray9413[i_2160_])
					      * i_2165_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9412
					[i_2160_]
					= i_2166_;
				}
				if (i_2089_ != 0) {
				    int i_2167_
					= Class282.anIntArray4430[i_2089_];
				    int i_2168_
					= Class282.anIntArray4441[i_2089_];
				    int i_2169_
					= ((((Class89_Sub2) this)
					    .anIntArray9413[i_2160_]) * i_2167_
					   + ((((Class89_Sub2) this)
					       .anIntArray9411[i_2160_])
					      * i_2168_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9413
					[i_2160_]
					= ((((Class89_Sub2) this)
					    .anIntArray9413[i_2160_]) * i_2168_
					   - ((((Class89_Sub2) this)
					       .anIntArray9411[i_2160_])
					      * i_2167_)
					   + 16383) >> 14;
				    ((Class89_Sub2) this).anIntArray9411
					[i_2160_]
					= i_2169_;
				}
				((Class89_Sub2) this).anIntArray9411[i_2160_]
				    += anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_2160_]
				    += anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_2160_]
				    += anInt9401;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_2170_ = 0; i_2170_ < i_2093_; i_2170_++) {
			int i_2171_ = is[i_2170_];
			if (i_2171_ < (((Class89_Sub2) this)
				       .anIntArrayArray9467).length) {
			    int[] is_2172_ = (((Class89_Sub2) this)
					      .anIntArrayArray9467[i_2171_]);
			    for (int i_2173_ = 0; i_2173_ < is_2172_.length;
				 i_2173_++) {
				int i_2174_ = is_2172_[i_2173_];
				if ((((Class89_Sub2) this).aShortArray9465
				     == null)
				    || ((i_2091_ & (((Class89_Sub2) this)
						    .aShortArray9465[i_2174_]))
					!= 0)) {
				    int i_2175_ = (((Class89_Sub2) this)
						   .anIntArray9395[i_2174_]);
				    int i_2176_
					= (((Class89_Sub2) this).anIntArray9395
					   [i_2174_ + 1]);
				    for (int i_2177_ = i_2175_;
					 (i_2177_ < i_2176_
					  && (((Class89_Sub2) this)
					      .aShortArray9455[i_2177_]) != 0);
					 i_2177_++) {
					int i_2178_
					    = (((((Class89_Sub2) this)
						 .aShortArray9455[i_2177_])
						& 0xffff)
					       - 1);
					if (i_2090_ != 0) {
					    int i_2179_
						= (Class282.anIntArray4430
						   [i_2090_]);
					    int i_2180_
						= (Class282.anIntArray4441
						   [i_2090_]);
					    int i_2181_
						= (((((Class89_Sub2) this)
						     .aShortArray9418
						     [i_2178_]) * i_2179_
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_2178_]) * i_2180_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9418[i_2178_]
						= (short) ((((((Class89_Sub2)
							       this)
							      .aShortArray9418
							      [i_2178_])
							     * i_2180_)
							    - ((((Class89_Sub2)
								 this)
								.aShortArray9417
								[i_2178_])
							       * i_2179_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9417[i_2178_]
						= (short) i_2181_;
					}
					if (i_2088_ != 0) {
					    int i_2182_
						= (Class282.anIntArray4430
						   [i_2088_]);
					    int i_2183_
						= (Class282.anIntArray4441
						   [i_2088_]);
					    int i_2184_
						= (((((Class89_Sub2) this)
						     .aShortArray9418
						     [i_2178_]) * i_2183_
						    - (((Class89_Sub2) this)
						       .aShortArray9419
						       [i_2178_]) * i_2182_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9419[i_2178_]
						= (short) ((((((Class89_Sub2)
							       this)
							      .aShortArray9418
							      [i_2178_])
							     * i_2182_)
							    + ((((Class89_Sub2)
								 this)
								.aShortArray9419
								[i_2178_])
							       * i_2183_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9418[i_2178_]
						= (short) i_2184_;
					}
					if (i_2089_ != 0) {
					    int i_2185_
						= (Class282.anIntArray4430
						   [i_2089_]);
					    int i_2186_
						= (Class282.anIntArray4441
						   [i_2089_]);
					    int i_2187_
						= (((((Class89_Sub2) this)
						     .aShortArray9419
						     [i_2178_]) * i_2185_
						    + (((Class89_Sub2) this)
						       .aShortArray9417
						       [i_2178_]) * i_2186_
						    + 16383)
						   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9419[i_2178_]
						= (short) ((((((Class89_Sub2)
							       this)
							      .aShortArray9419
							      [i_2178_])
							     * i_2186_)
							    - ((((Class89_Sub2)
								 this)
								.aShortArray9417
								[i_2178_])
							       * i_2185_)
							    + 16383)
							   >> 14);
					    ((Class89_Sub2) this)
						.aShortArray9417[i_2178_]
						= (short) i_2187_;
					}
				    }
				}
			    }
			}
		    }
		    if (((Class89_Sub2) this).aClass151_9436 == null
			&& ((Class89_Sub2) this).aClass151_9433 != null)
			((Class151) ((Class89_Sub2) this).aClass151_9433)
			    .anInterface8_1713
			    = null;
		    if (((Class89_Sub2) this).aClass151_9436 != null)
			((Class151) ((Class89_Sub2) this).aClass151_9436)
			    .anInterface8_1713
			    = null;
		}
	    }
	} else if (i == 3) {
	    if (is_2092_ != null) {
		int i_2188_ = is_2092_[9] << 4;
		int i_2189_ = is_2092_[10] << 4;
		int i_2190_ = is_2092_[11] << 4;
		int i_2191_ = is_2092_[12] << 4;
		int i_2192_ = is_2092_[13] << 4;
		int i_2193_ = is_2092_[14] << 4;
		if (aBool9470) {
		    int i_2194_
			= ((is_2092_[0] * anInt9426 + is_2092_[3] * anInt9468
			    + is_2092_[6] * anInt9401 + 8192)
			   >> 14);
		    int i_2195_
			= ((is_2092_[1] * anInt9426 + is_2092_[4] * anInt9468
			    + is_2092_[7] * anInt9401 + 8192)
			   >> 14);
		    int i_2196_
			= ((is_2092_[2] * anInt9426 + is_2092_[5] * anInt9468
			    + is_2092_[8] * anInt9401 + 8192)
			   >> 14);
		    i_2194_ += i_2191_;
		    i_2195_ += i_2192_;
		    i_2196_ += i_2193_;
		    anInt9426 = i_2194_;
		    anInt9468 = i_2195_;
		    anInt9401 = i_2196_;
		    aBool9470 = false;
		}
		int i_2197_ = i_2088_ << 15 >> 7;
		int i_2198_ = i_2089_ << 15 >> 7;
		int i_2199_ = i_2090_ << 15 >> 7;
		int i_2200_ = i_2197_ * -anInt9426 + 8192 >> 14;
		int i_2201_ = i_2198_ * -anInt9468 + 8192 >> 14;
		int i_2202_ = i_2199_ * -anInt9401 + 8192 >> 14;
		int i_2203_ = i_2200_ + anInt9426;
		int i_2204_ = i_2201_ + anInt9468;
		int i_2205_ = i_2202_ + anInt9401;
		int[] is_2206_ = new int[9];
		is_2206_[0] = i_2197_ * is_2092_[0] + 8192 >> 14;
		is_2206_[1] = i_2197_ * is_2092_[3] + 8192 >> 14;
		is_2206_[2] = i_2197_ * is_2092_[6] + 8192 >> 14;
		is_2206_[3] = i_2198_ * is_2092_[1] + 8192 >> 14;
		is_2206_[4] = i_2198_ * is_2092_[4] + 8192 >> 14;
		is_2206_[5] = i_2198_ * is_2092_[7] + 8192 >> 14;
		is_2206_[6] = i_2199_ * is_2092_[2] + 8192 >> 14;
		is_2206_[7] = i_2199_ * is_2092_[5] + 8192 >> 14;
		is_2206_[8] = i_2199_ * is_2092_[8] + 8192 >> 14;
		int i_2207_ = i_2197_ * i_2191_ + 8192 >> 14;
		int i_2208_ = i_2198_ * i_2192_ + 8192 >> 14;
		int i_2209_ = i_2199_ * i_2193_ + 8192 >> 14;
		i_2207_ += i_2203_;
		i_2208_ += i_2204_;
		i_2209_ += i_2205_;
		int[] is_2210_ = new int[9];
		for (int i_2211_ = 0; i_2211_ < 3; i_2211_++) {
		    for (int i_2212_ = 0; i_2212_ < 3; i_2212_++) {
			int i_2213_ = 0;
			for (int i_2214_ = 0; i_2214_ < 3; i_2214_++)
			    i_2213_ += (is_2092_[i_2211_ * 3 + i_2214_]
					* is_2206_[i_2212_ + i_2214_ * 3]);
			is_2210_[i_2211_ * 3 + i_2212_] = i_2213_ + 8192 >> 14;
		    }
		}
		int i_2215_ = ((is_2092_[0] * i_2207_ + is_2092_[1] * i_2208_
				+ is_2092_[2] * i_2209_ + 8192)
			       >> 14);
		int i_2216_ = ((is_2092_[3] * i_2207_ + is_2092_[4] * i_2208_
				+ is_2092_[5] * i_2209_ + 8192)
			       >> 14);
		int i_2217_ = ((is_2092_[6] * i_2207_ + is_2092_[7] * i_2208_
				+ is_2092_[8] * i_2209_ + 8192)
			       >> 14);
		i_2215_ += i_2188_;
		i_2216_ += i_2189_;
		i_2217_ += i_2190_;
		for (int i_2218_ = 0; i_2218_ < i_2093_; i_2218_++) {
		    int i_2219_ = is[i_2218_];
		    if (i_2219_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_2220_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_2219_]);
			for (int i_2221_ = 0; i_2221_ < is_2220_.length;
			     i_2221_++) {
			    int i_2222_ = is_2220_[i_2221_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_2091_ & (((Class89_Sub2) this)
						.aShortArray9465[i_2222_]))
				    != 0)) {
				int i_2223_
				    = (is_2210_[0] * (((Class89_Sub2) this)
						      .anIntArray9411[i_2222_])
				       + is_2210_[1] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_2222_])
				       + is_2210_[2] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_2222_])
				       + 8192) >> 14;
				int i_2224_
				    = (is_2210_[3] * (((Class89_Sub2) this)
						      .anIntArray9411[i_2222_])
				       + is_2210_[4] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_2222_])
				       + is_2210_[5] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_2222_])
				       + 8192) >> 14;
				int i_2225_
				    = (is_2210_[6] * (((Class89_Sub2) this)
						      .anIntArray9411[i_2222_])
				       + is_2210_[7] * (((Class89_Sub2) this)
							.anIntArray9412
							[i_2222_])
				       + is_2210_[8] * (((Class89_Sub2) this)
							.anIntArray9413
							[i_2222_])
				       + 8192) >> 14;
				i_2223_ += i_2215_;
				i_2224_ += i_2216_;
				i_2225_ += i_2217_;
				((Class89_Sub2) this).anIntArray9411[i_2222_]
				    = i_2223_;
				((Class89_Sub2) this).anIntArray9412[i_2222_]
				    = i_2224_;
				((Class89_Sub2) this).anIntArray9413[i_2222_]
				    = i_2225_;
			    }
			}
		    }
		}
	    } else {
		for (int i_2226_ = 0; i_2226_ < i_2093_; i_2226_++) {
		    int i_2227_ = is[i_2226_];
		    if (i_2227_
			< ((Class89_Sub2) this).anIntArrayArray9467.length) {
			int[] is_2228_ = (((Class89_Sub2) this)
					  .anIntArrayArray9467[i_2227_]);
			for (int i_2229_ = 0; i_2229_ < is_2228_.length;
			     i_2229_++) {
			    int i_2230_ = is_2228_[i_2229_];
			    if (((Class89_Sub2) this).aShortArray9465 == null
				|| ((i_2091_ & (((Class89_Sub2) this)
						.aShortArray9465[i_2230_]))
				    != 0)) {
				((Class89_Sub2) this).anIntArray9411[i_2230_]
				    -= anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_2230_]
				    -= anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_2230_]
				    -= anInt9401;
				((Class89_Sub2) this).anIntArray9411[i_2230_]
				    = (((Class89_Sub2) this).anIntArray9411
				       [i_2230_]) * i_2088_ >> 7;
				((Class89_Sub2) this).anIntArray9412[i_2230_]
				    = (((Class89_Sub2) this).anIntArray9412
				       [i_2230_]) * i_2089_ >> 7;
				((Class89_Sub2) this).anIntArray9413[i_2230_]
				    = (((Class89_Sub2) this).anIntArray9413
				       [i_2230_]) * i_2090_ >> 7;
				((Class89_Sub2) this).anIntArray9411[i_2230_]
				    += anInt9426;
				((Class89_Sub2) this).anIntArray9412[i_2230_]
				    += anInt9468;
				((Class89_Sub2) this).anIntArray9413[i_2230_]
				    += anInt9401;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_2231_ = 0; i_2231_ < i_2093_; i_2231_++) {
		    int i_2232_ = is[i_2231_];
		    if (i_2232_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_2233_ = (((Class89_Sub2) this)
					  .anIntArrayArray9432[i_2232_]);
			for (int i_2234_ = 0; i_2234_ < is_2233_.length;
			     i_2234_++) {
			    int i_2235_ = is_2233_[i_2234_];
			    if (((Class89_Sub2) this).aShortArray9415 == null
				|| ((i_2091_ & (((Class89_Sub2) this)
						.aShortArray9415[i_2235_]))
				    != 0)) {
				int i_2236_ = (((((Class89_Sub2) this)
						 .aByteArray9408[i_2235_])
						& 0xff)
					       + i_2088_ * 8);
				if (i_2236_ < 0)
				    i_2236_ = 0;
				else if (i_2236_ > 255)
				    i_2236_ = 255;
				((Class89_Sub2) this).aByteArray9408[i_2235_]
				    = (byte) i_2236_;
				if (((Class89_Sub2) this).aClass151_9433
				    != null)
				    ((Class151)
				     ((Class89_Sub2) this).aClass151_9433)
					.anInterface8_1713
					= null;
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_2237_ = 0;
			 i_2237_ < ((Class89_Sub2) this).anInt9427;
			 i_2237_++) {
			Class171 class171 = (((Class89_Sub2) this)
					     .aClass171Array9459[i_2237_]);
			Class140 class140 = (((Class89_Sub2) this)
					     .aClass140Array9460[i_2237_]);
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & 0xffffff
			       | 255 - ((((Class89_Sub2) this).aByteArray9408
					 [((Class171) class171).anInt2069])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null) {
		for (int i_2238_ = 0; i_2238_ < i_2093_; i_2238_++) {
		    int i_2239_ = is[i_2238_];
		    if (i_2239_
			< ((Class89_Sub2) this).anIntArrayArray9432.length) {
			int[] is_2240_ = (((Class89_Sub2) this)
					  .anIntArrayArray9432[i_2239_]);
			for (int i_2241_ = 0; i_2241_ < is_2240_.length;
			     i_2241_++) {
			    int i_2242_ = is_2240_[i_2241_];
			    if (((Class89_Sub2) this).aShortArray9415 == null
				|| ((i_2091_ & (((Class89_Sub2) this)
						.aShortArray9415[i_2242_]))
				    != 0)) {
				int i_2243_ = ((((Class89_Sub2) this)
						.aShortArray9442[i_2242_])
					       & 0xffff);
				int i_2244_ = i_2243_ >> 10 & 0x3f;
				int i_2245_ = i_2243_ >> 7 & 0x7;
				int i_2246_ = i_2243_ & 0x7f;
				i_2244_ = i_2244_ + i_2088_ & 0x3f;
				i_2245_ += i_2089_ / 4;
				if (i_2245_ < 0)
				    i_2245_ = 0;
				else if (i_2245_ > 7)
				    i_2245_ = 7;
				i_2246_ += i_2090_;
				if (i_2246_ < 0)
				    i_2246_ = 0;
				else if (i_2246_ > 127)
				    i_2246_ = 127;
				((Class89_Sub2) this).aShortArray9442[i_2242_]
				    = (short) (i_2244_ << 10 | i_2245_ << 7
					       | i_2246_);
				if (((Class89_Sub2) this).aClass151_9433
				    != null)
				    ((Class151)
				     ((Class89_Sub2) this).aClass151_9433)
					.anInterface8_1713
					= null;
			    }
			}
		    }
		}
		if (((Class89_Sub2) this).aClass171Array9459 != null) {
		    for (int i_2247_ = 0;
			 i_2247_ < ((Class89_Sub2) this).anInt9427;
			 i_2247_++) {
			Class171 class171 = (((Class89_Sub2) this)
					     .aClass171Array9459[i_2247_]);
			Class140 class140 = (((Class89_Sub2) this)
					     .aClass140Array9460[i_2247_]);
			((Class140) class140).anInt1630
			    = (((Class140) class140).anInt1630 & ~0xffffff
			       | (Class474.anIntArray6383
				  [((((Class89_Sub2) this).aShortArray9442
				     [((Class171) class171).anInt2069])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_2248_ = 0; i_2248_ < i_2093_; i_2248_++) {
		    int i_2249_ = is[i_2248_];
		    if (i_2249_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_2250_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_2249_]);
			for (int i_2251_ = 0; i_2251_ < is_2250_.length;
			     i_2251_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_2250_[i_2251_]]);
			    ((Class140) class140).anInt1628 += i_2088_;
			    ((Class140) class140).anInt1629 += i_2089_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_2252_ = 0; i_2252_ < i_2093_; i_2252_++) {
		    int i_2253_ = is[i_2252_];
		    if (i_2253_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_2254_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_2253_]);
			for (int i_2255_ = 0; i_2255_ < is_2254_.length;
			     i_2255_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_2254_[i_2255_]]);
			    ((Class140) class140).anInt1626
				= (((Class140) class140).anInt1626 * i_2088_
				   >> 7);
			    ((Class140) class140).anInt1627
				= (((Class140) class140).anInt1627 * i_2089_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null) {
		for (int i_2256_ = 0; i_2256_ < i_2093_; i_2256_++) {
		    int i_2257_ = is[i_2256_];
		    if (i_2257_
			< ((Class89_Sub2) this).anIntArrayArray9461.length) {
			int[] is_2258_ = (((Class89_Sub2) this)
					  .anIntArrayArray9461[i_2257_]);
			for (int i_2259_ = 0; i_2259_ < is_2258_.length;
			     i_2259_++) {
			    Class140 class140
				= (((Class89_Sub2) this).aClass140Array9460
				   [is_2258_[i_2259_]]);
			    ((Class140) class140).anInt1625
				= (((Class140) class140).anInt1625 + i_2088_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public int method1901() {
	if (!((Class89_Sub2) this).aBool9451)
	    method1922();
	return ((Class89_Sub2) this).aShort9435;
    }
    
    public int method1996() {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	return ((Class89_Sub2) this).aShort9450;
    }
    
    public void method1915(Class266 class266) {
	Class268 class268
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass268_9136);
	class268.method5203(class266);
	if (((Class89_Sub2) this).aClass106Array9445 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub2) this).aClass106Array9445.length; i++) {
		Class106 class106
		    = ((Class89_Sub2) this).aClass106Array9445[i];
		Class106 class106_2260_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_2260_ = class106.aClass106_1488;
		class106_2260_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_2260_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_2260_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_2260_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_2260_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_2260_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_2260_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_2260_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_2260_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub2) this).aClass167Array9454 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub2) this).aClass167Array9454.length; i++) {
		Class167 class167
		    = ((Class89_Sub2) this).aClass167Array9454[i];
		Class167 class167_2261_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_2261_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_2261_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub2) this)
					     .anIntArray9411
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9412
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub2) this)
					       .anIntArray9413
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_2261_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_2261_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub2) this)
					    .anIntArray9411
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9412
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub2) this)
					      .anIntArray9413
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    Class89 method15561(Class89_Sub2 class89_sub2_2262_,
			Class89_Sub2 class89_sub2_2263_, int i, boolean bool,
			boolean bool_2264_) {
	((Class89_Sub2) class89_sub2_2262_).aByte9404 = (byte) 0;
	((Class89_Sub2) class89_sub2_2262_).anInt9402 = i;
	((Class89_Sub2) class89_sub2_2262_).anInt9469
	    = ((Class89_Sub2) this).anInt9469;
	((Class89_Sub2) class89_sub2_2262_).aShort9405
	    = ((Class89_Sub2) this).aShort9405;
	((Class89_Sub2) class89_sub2_2262_).aShort9406
	    = ((Class89_Sub2) this).aShort9406;
	((Class89_Sub2) class89_sub2_2262_).anInt9409
	    = ((Class89_Sub2) this).anInt9409;
	((Class89_Sub2) class89_sub2_2262_).anInt9410
	    = ((Class89_Sub2) this).anInt9410;
	((Class89_Sub2) class89_sub2_2262_).anInt9416
	    = ((Class89_Sub2) this).anInt9416;
	((Class89_Sub2) class89_sub2_2262_).anInt9424
	    = ((Class89_Sub2) this).anInt9424;
	((Class89_Sub2) class89_sub2_2262_).anInt9441
	    = ((Class89_Sub2) this).anInt9441;
	((Class89_Sub2) class89_sub2_2262_).anInt9427
	    = ((Class89_Sub2) this).anInt9427;
	if ((i & 0x100) != 0)
	    ((Class89_Sub2) class89_sub2_2262_).aBool9452 = true;
	else
	    ((Class89_Sub2) class89_sub2_2262_).aBool9452
		= ((Class89_Sub2) this).aBool9452;
	((Class89_Sub2) class89_sub2_2262_).aBool9425
	    = ((Class89_Sub2) this).aBool9425;
	boolean bool_2265_
	    = Class154.method3248(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_2266_
	    = Class154.method3244(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_2267_
	    = Class154.method3245(i, ((Class89_Sub2) this).anInt9469);
	boolean bool_2268_ = bool_2265_ | bool_2266_ | bool_2267_;
	if (bool_2268_) {
	    if (bool_2265_) {
		if (((Class89_Sub2) class89_sub2_2263_).anIntArray9411 == null
		    || ((((Class89_Sub2) class89_sub2_2263_)
			 .anIntArray9411).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_2262_).anIntArray9411
			= ((Class89_Sub2) class89_sub2_2263_).anIntArray9411
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_2262_).anIntArray9411
			= ((Class89_Sub2) class89_sub2_2263_).anIntArray9411;
	    } else
		((Class89_Sub2) class89_sub2_2262_).anIntArray9411
		    = ((Class89_Sub2) this).anIntArray9411;
	    if (bool_2266_) {
		if (((Class89_Sub2) class89_sub2_2263_).anIntArray9412 == null
		    || ((((Class89_Sub2) class89_sub2_2263_)
			 .anIntArray9412).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_2262_).anIntArray9412
			= ((Class89_Sub2) class89_sub2_2263_).anIntArray9412
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_2262_).anIntArray9412
			= ((Class89_Sub2) class89_sub2_2263_).anIntArray9412;
	    } else
		((Class89_Sub2) class89_sub2_2262_).anIntArray9412
		    = ((Class89_Sub2) this).anIntArray9412;
	    if (bool_2267_) {
		if (((Class89_Sub2) class89_sub2_2263_).anIntArray9413 == null
		    || ((((Class89_Sub2) class89_sub2_2263_)
			 .anIntArray9413).length
			< ((Class89_Sub2) this).anInt9409))
		    ((Class89_Sub2) class89_sub2_2262_).anIntArray9413
			= ((Class89_Sub2) class89_sub2_2263_).anIntArray9413
			= new int[((Class89_Sub2) this).anInt9409];
		else
		    ((Class89_Sub2) class89_sub2_2262_).anIntArray9413
			= ((Class89_Sub2) class89_sub2_2263_).anIntArray9413;
	    } else
		((Class89_Sub2) class89_sub2_2262_).anIntArray9413
		    = ((Class89_Sub2) this).anIntArray9413;
	    for (int i_2269_ = 0; i_2269_ < ((Class89_Sub2) this).anInt9409;
		 i_2269_++) {
		if (bool_2265_)
		    ((Class89_Sub2) class89_sub2_2262_).anIntArray9411[i_2269_]
			= ((Class89_Sub2) this).anIntArray9411[i_2269_];
		if (bool_2266_)
		    ((Class89_Sub2) class89_sub2_2262_).anIntArray9412[i_2269_]
			= ((Class89_Sub2) this).anIntArray9412[i_2269_];
		if (bool_2267_)
		    ((Class89_Sub2) class89_sub2_2262_).anIntArray9413[i_2269_]
			= ((Class89_Sub2) this).anIntArray9413[i_2269_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_2262_).anIntArray9411
		= ((Class89_Sub2) this).anIntArray9411;
	    ((Class89_Sub2) class89_sub2_2262_).anIntArray9412
		= ((Class89_Sub2) this).anIntArray9412;
	    ((Class89_Sub2) class89_sub2_2262_).anIntArray9413
		= ((Class89_Sub2) this).anIntArray9413;
	}
	if (Class154.method3260(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_2262_).aByte9404 |= 0x1;
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9434
		= ((Class89_Sub2) class89_sub2_2263_).aClass151_9434;
	    ((Class151) ((Class89_Sub2) class89_sub2_2262_).aClass151_9434)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9434).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_2262_).aClass151_9434)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9434)
		   .anInterface8_1713);
	} else if (Class154.method3255(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9434
		= ((Class89_Sub2) this).aClass151_9434;
	else
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9434 = null;
	if (Class154.method3300(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_2263_).aShortArray9442 == null
		|| (((Class89_Sub2) class89_sub2_2263_).aShortArray9442.length
		    < ((Class89_Sub2) this).anInt9424))
		((Class89_Sub2) class89_sub2_2262_).aShortArray9442
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9442
		    = new short[((Class89_Sub2) this).anInt9424];
	    else
		((Class89_Sub2) class89_sub2_2262_).aShortArray9442
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9442;
	    for (int i_2270_ = 0; i_2270_ < ((Class89_Sub2) this).anInt9424;
		 i_2270_++)
		((Class89_Sub2) class89_sub2_2262_).aShortArray9442[i_2270_]
		    = ((Class89_Sub2) this).aShortArray9442[i_2270_];
	} else
	    ((Class89_Sub2) class89_sub2_2262_).aShortArray9442
		= ((Class89_Sub2) this).aShortArray9442;
	if (Class154.method3249(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_2263_).aByteArray9408 == null
		|| (((Class89_Sub2) class89_sub2_2263_).aByteArray9408.length
		    < ((Class89_Sub2) this).anInt9424))
		((Class89_Sub2) class89_sub2_2262_).aByteArray9408
		    = ((Class89_Sub2) class89_sub2_2263_).aByteArray9408
		    = new byte[((Class89_Sub2) this).anInt9424];
	    else
		((Class89_Sub2) class89_sub2_2262_).aByteArray9408
		    = ((Class89_Sub2) class89_sub2_2263_).aByteArray9408;
	    for (int i_2271_ = 0; i_2271_ < ((Class89_Sub2) this).anInt9424;
		 i_2271_++)
		((Class89_Sub2) class89_sub2_2262_).aByteArray9408[i_2271_]
		    = ((Class89_Sub2) this).aByteArray9408[i_2271_];
	} else
	    ((Class89_Sub2) class89_sub2_2262_).aByteArray9408
		= ((Class89_Sub2) this).aByteArray9408;
	if (Class154.method3262(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_2262_).aByte9404 |= 0x2;
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9433
		= ((Class89_Sub2) class89_sub2_2263_).aClass151_9433;
	    ((Class151) ((Class89_Sub2) class89_sub2_2262_).aClass151_9433)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9433).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_2262_).aClass151_9433)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9433)
		   .anInterface8_1713);
	} else if (Class154.method3257(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9433
		= ((Class89_Sub2) this).aClass151_9433;
	else
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9433 = null;
	if (Class154.method3247(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_2263_).aShortArray9417 == null
		|| (((Class89_Sub2) class89_sub2_2263_).aShortArray9417.length
		    < ((Class89_Sub2) this).anInt9416)) {
		int i_2272_ = ((Class89_Sub2) this).anInt9416;
		((Class89_Sub2) class89_sub2_2262_).aShortArray9417
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9417
		    = new short[i_2272_];
		((Class89_Sub2) class89_sub2_2262_).aShortArray9418
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9418
		    = new short[i_2272_];
		((Class89_Sub2) class89_sub2_2262_).aShortArray9419
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9419
		    = new short[i_2272_];
	    } else {
		((Class89_Sub2) class89_sub2_2262_).aShortArray9417
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9417;
		((Class89_Sub2) class89_sub2_2262_).aShortArray9418
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9418;
		((Class89_Sub2) class89_sub2_2262_).aShortArray9419
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9419;
	    }
	    if (((Class89_Sub2) this).aClass178_9456 != null) {
		if (((Class89_Sub2) class89_sub2_2263_).aClass178_9456 == null)
		    ((Class89_Sub2) class89_sub2_2263_).aClass178_9456
			= new Class178();
		Class178 class178
		    = (((Class89_Sub2) class89_sub2_2262_).aClass178_9456
		       = ((Class89_Sub2) class89_sub2_2263_).aClass178_9456);
		if (((Class178) class178).aShortArray2129 == null
		    || (((Class178) class178).aShortArray2129.length
			< ((Class89_Sub2) this).anInt9416)) {
		    int i_2273_ = ((Class89_Sub2) this).anInt9416;
		    ((Class178) class178).aShortArray2129 = new short[i_2273_];
		    ((Class178) class178).aShortArray2127 = new short[i_2273_];
		    ((Class178) class178).aShortArray2126 = new short[i_2273_];
		    ((Class178) class178).aByteArray2128 = new byte[i_2273_];
		}
		for (int i_2274_ = 0;
		     i_2274_ < ((Class89_Sub2) this).anInt9416; i_2274_++) {
		    ((Class89_Sub2) class89_sub2_2262_).aShortArray9417
			[i_2274_]
			= ((Class89_Sub2) this).aShortArray9417[i_2274_];
		    ((Class89_Sub2) class89_sub2_2262_).aShortArray9418
			[i_2274_]
			= ((Class89_Sub2) this).aShortArray9418[i_2274_];
		    ((Class89_Sub2) class89_sub2_2262_).aShortArray9419
			[i_2274_]
			= ((Class89_Sub2) this).aShortArray9419[i_2274_];
		    ((Class178) class178).aShortArray2129[i_2274_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2129[i_2274_]);
		    ((Class178) class178).aShortArray2127[i_2274_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2127[i_2274_]);
		    ((Class178) class178).aShortArray2126[i_2274_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aShortArray2126[i_2274_]);
		    ((Class178) class178).aByteArray2128[i_2274_]
			= (((Class178) ((Class89_Sub2) this).aClass178_9456)
			   .aByteArray2128[i_2274_]);
		}
	    } else {
		for (int i_2275_ = 0;
		     i_2275_ < ((Class89_Sub2) this).anInt9416; i_2275_++) {
		    ((Class89_Sub2) class89_sub2_2262_).aShortArray9417
			[i_2275_]
			= ((Class89_Sub2) this).aShortArray9417[i_2275_];
		    ((Class89_Sub2) class89_sub2_2262_).aShortArray9418
			[i_2275_]
			= ((Class89_Sub2) this).aShortArray9418[i_2275_];
		    ((Class89_Sub2) class89_sub2_2262_).aShortArray9419
			[i_2275_]
			= ((Class89_Sub2) this).aShortArray9419[i_2275_];
		}
	    }
	    ((Class89_Sub2) class89_sub2_2262_).aByteArray9420
		= ((Class89_Sub2) this).aByteArray9420;
	} else {
	    ((Class89_Sub2) class89_sub2_2262_).aClass178_9456
		= ((Class89_Sub2) this).aClass178_9456;
	    ((Class89_Sub2) class89_sub2_2262_).aShortArray9417
		= ((Class89_Sub2) this).aShortArray9417;
	    ((Class89_Sub2) class89_sub2_2262_).aShortArray9418
		= ((Class89_Sub2) this).aShortArray9418;
	    ((Class89_Sub2) class89_sub2_2262_).aShortArray9419
		= ((Class89_Sub2) this).aShortArray9419;
	    ((Class89_Sub2) class89_sub2_2262_).aByteArray9420
		= ((Class89_Sub2) this).aByteArray9420;
	}
	if (Class154.method3342(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_2262_).aByte9404 |= 0x4;
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9436
		= ((Class89_Sub2) class89_sub2_2263_).aClass151_9436;
	    ((Class151) ((Class89_Sub2) class89_sub2_2262_).aClass151_9436)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9436).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_2262_).aClass151_9436)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9436)
		   .anInterface8_1713);
	} else if (Class154.method3301(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9436
		= ((Class89_Sub2) this).aClass151_9436;
	else
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9436 = null;
	if (Class154.method3329(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_2263_).aFloatArray9422 == null
		|| (((Class89_Sub2) class89_sub2_2263_).aFloatArray9422.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_2276_ = ((Class89_Sub2) this).anInt9416;
		((Class89_Sub2) class89_sub2_2262_).aFloatArray9422
		    = ((Class89_Sub2) class89_sub2_2263_).aFloatArray9422
		    = new float[i_2276_];
		((Class89_Sub2) class89_sub2_2262_).aFloatArray9423
		    = ((Class89_Sub2) class89_sub2_2263_).aFloatArray9423
		    = new float[i_2276_];
	    } else {
		((Class89_Sub2) class89_sub2_2262_).aFloatArray9422
		    = ((Class89_Sub2) class89_sub2_2263_).aFloatArray9422;
		((Class89_Sub2) class89_sub2_2262_).aFloatArray9423
		    = ((Class89_Sub2) class89_sub2_2263_).aFloatArray9423;
	    }
	    for (int i_2277_ = 0; i_2277_ < ((Class89_Sub2) this).anInt9416;
		 i_2277_++) {
		((Class89_Sub2) class89_sub2_2262_).aFloatArray9422[i_2277_]
		    = ((Class89_Sub2) this).aFloatArray9422[i_2277_];
		((Class89_Sub2) class89_sub2_2262_).aFloatArray9423[i_2277_]
		    = ((Class89_Sub2) this).aFloatArray9423[i_2277_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_2262_).aFloatArray9422
		= ((Class89_Sub2) this).aFloatArray9422;
	    ((Class89_Sub2) class89_sub2_2262_).aFloatArray9423
		= ((Class89_Sub2) this).aFloatArray9423;
	}
	if (Class154.method3263(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_2262_).aByte9404 |= 0x8;
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9437
		= ((Class89_Sub2) class89_sub2_2263_).aClass151_9437;
	    ((Class151) ((Class89_Sub2) class89_sub2_2262_).aClass151_9437)
		.aByte1712
		= ((Class151) ((Class89_Sub2) this).aClass151_9437).aByte1712;
	    ((Class151) ((Class89_Sub2) class89_sub2_2262_).aClass151_9437)
		.anInterface8_1713
		= (((Class151) ((Class89_Sub2) this).aClass151_9437)
		   .anInterface8_1713);
	} else if (Class154.method3283(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9437
		= ((Class89_Sub2) this).aClass151_9437;
	else
	    ((Class89_Sub2) class89_sub2_2262_).aClass151_9437 = null;
	if (Class154.method3308(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_2263_).aShortArray9428 == null
		|| (((Class89_Sub2) class89_sub2_2263_).aShortArray9428.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_2278_ = ((Class89_Sub2) this).anInt9424;
		((Class89_Sub2) class89_sub2_2262_).aShortArray9428
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9428
		    = new short[i_2278_];
		((Class89_Sub2) class89_sub2_2262_).aShortArray9462
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9462
		    = new short[i_2278_];
		((Class89_Sub2) class89_sub2_2262_).aShortArray9407
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9407
		    = new short[i_2278_];
	    } else {
		((Class89_Sub2) class89_sub2_2262_).aShortArray9428
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9428;
		((Class89_Sub2) class89_sub2_2262_).aShortArray9462
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9462;
		((Class89_Sub2) class89_sub2_2262_).aShortArray9407
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9407;
	    }
	    for (int i_2279_ = 0; i_2279_ < ((Class89_Sub2) this).anInt9424;
		 i_2279_++) {
		((Class89_Sub2) class89_sub2_2262_).aShortArray9428[i_2279_]
		    = ((Class89_Sub2) this).aShortArray9428[i_2279_];
		((Class89_Sub2) class89_sub2_2262_).aShortArray9462[i_2279_]
		    = ((Class89_Sub2) this).aShortArray9462[i_2279_];
		((Class89_Sub2) class89_sub2_2262_).aShortArray9407[i_2279_]
		    = ((Class89_Sub2) this).aShortArray9407[i_2279_];
	    }
	} else {
	    ((Class89_Sub2) class89_sub2_2262_).aShortArray9428
		= ((Class89_Sub2) this).aShortArray9428;
	    ((Class89_Sub2) class89_sub2_2262_).aShortArray9462
		= ((Class89_Sub2) this).aShortArray9462;
	    ((Class89_Sub2) class89_sub2_2262_).aShortArray9407
		= ((Class89_Sub2) this).aShortArray9407;
	}
	if (Class154.method3264(i, ((Class89_Sub2) this).anInt9469)) {
	    if (bool)
		((Class89_Sub2) class89_sub2_2262_).aByte9404 |= 0x10;
	    ((Class89_Sub2) class89_sub2_2262_).aClass146_9438
		= ((Class89_Sub2) class89_sub2_2263_).aClass146_9438;
	    ((Class146) ((Class89_Sub2) class89_sub2_2262_).aClass146_9438)
		.anInterface14_1692
		= (((Class146) ((Class89_Sub2) this).aClass146_9438)
		   .anInterface14_1692);
	} else if (Class154.method3307(i, ((Class89_Sub2) this).anInt9469))
	    ((Class89_Sub2) class89_sub2_2262_).aClass146_9438
		= ((Class89_Sub2) this).aClass146_9438;
	else
	    ((Class89_Sub2) class89_sub2_2262_).aClass146_9438 = null;
	if (Class154.method3252(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_2263_).aShortArray9414 == null
		|| (((Class89_Sub2) class89_sub2_2263_).aShortArray9414.length
		    < ((Class89_Sub2) this).anInt9424)) {
		int i_2280_ = ((Class89_Sub2) this).anInt9424;
		((Class89_Sub2) class89_sub2_2262_).aShortArray9414
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9414
		    = new short[i_2280_];
	    } else
		((Class89_Sub2) class89_sub2_2262_).aShortArray9414
		    = ((Class89_Sub2) class89_sub2_2263_).aShortArray9414;
	    for (int i_2281_ = 0; i_2281_ < ((Class89_Sub2) this).anInt9424;
		 i_2281_++)
		((Class89_Sub2) class89_sub2_2262_).aShortArray9414[i_2281_]
		    = ((Class89_Sub2) this).aShortArray9414[i_2281_];
	} else
	    ((Class89_Sub2) class89_sub2_2262_).aShortArray9414
		= ((Class89_Sub2) this).aShortArray9414;
	if (Class154.method3253(i, ((Class89_Sub2) this).anInt9469)) {
	    if (((Class89_Sub2) class89_sub2_2263_).aClass140Array9460 == null
		|| ((((Class89_Sub2) class89_sub2_2263_)
		     .aClass140Array9460).length
		    < ((Class89_Sub2) this).anInt9427)) {
		int i_2282_ = ((Class89_Sub2) this).anInt9427;
		((Class89_Sub2) class89_sub2_2262_).aClass140Array9460
		    = ((Class89_Sub2) class89_sub2_2263_).aClass140Array9460
		    = new Class140[i_2282_];
		for (int i_2283_ = 0;
		     i_2283_ < ((Class89_Sub2) this).anInt9427; i_2283_++)
		    ((Class89_Sub2) class89_sub2_2262_).aClass140Array9460
			[i_2283_]
			= ((Class89_Sub2) this).aClass140Array9460[i_2283_]
			      .method3141();
	    } else {
		((Class89_Sub2) class89_sub2_2262_).aClass140Array9460
		    = ((Class89_Sub2) class89_sub2_2263_).aClass140Array9460;
		for (int i_2284_ = 0;
		     i_2284_ < ((Class89_Sub2) this).anInt9427; i_2284_++)
		    ((Class89_Sub2) class89_sub2_2262_).aClass140Array9460
			[i_2284_].method3142
			(((Class89_Sub2) this).aClass140Array9460[i_2284_]);
	    }
	} else
	    ((Class89_Sub2) class89_sub2_2262_).aClass140Array9460
		= ((Class89_Sub2) this).aClass140Array9460;
	((Class89_Sub2) class89_sub2_2262_).aClass171Array9459
	    = ((Class89_Sub2) this).aClass171Array9459;
	if (((Class89_Sub2) this).aBool9444) {
	    ((Class89_Sub2) class89_sub2_2262_).anInt9443
		= ((Class89_Sub2) this).anInt9443;
	    ((Class89_Sub2) class89_sub2_2262_).anInt9421
		= ((Class89_Sub2) this).anInt9421;
	    ((Class89_Sub2) class89_sub2_2262_).aShort9447
		= ((Class89_Sub2) this).aShort9447;
	    ((Class89_Sub2) class89_sub2_2262_).aShort9448
		= ((Class89_Sub2) this).aShort9448;
	    ((Class89_Sub2) class89_sub2_2262_).aShort9403
		= ((Class89_Sub2) this).aShort9403;
	    ((Class89_Sub2) class89_sub2_2262_).aShort9446
		= ((Class89_Sub2) this).aShort9446;
	    ((Class89_Sub2) class89_sub2_2262_).aShort9449
		= ((Class89_Sub2) this).aShort9449;
	    ((Class89_Sub2) class89_sub2_2262_).aShort9450
		= ((Class89_Sub2) this).aShort9450;
	    ((Class89_Sub2) class89_sub2_2262_).aBool9444 = true;
	} else
	    ((Class89_Sub2) class89_sub2_2262_).aBool9444 = false;
	if (((Class89_Sub2) this).aBool9451) {
	    ((Class89_Sub2) class89_sub2_2262_).aShort9435
		= ((Class89_Sub2) this).aShort9435;
	    ((Class89_Sub2) class89_sub2_2262_).aBool9451 = true;
	} else
	    ((Class89_Sub2) class89_sub2_2262_).aBool9451 = false;
	((Class89_Sub2) class89_sub2_2262_).anIntArrayArray9467
	    = ((Class89_Sub2) this).anIntArrayArray9467;
	((Class89_Sub2) class89_sub2_2262_).anIntArrayArray9432
	    = ((Class89_Sub2) this).anIntArrayArray9432;
	((Class89_Sub2) class89_sub2_2262_).anIntArrayArray9461
	    = ((Class89_Sub2) this).anIntArrayArray9461;
	((Class89_Sub2) class89_sub2_2262_).aShortArray9455
	    = ((Class89_Sub2) this).aShortArray9455;
	((Class89_Sub2) class89_sub2_2262_).anIntArray9395
	    = ((Class89_Sub2) this).anIntArray9395;
	((Class89_Sub2) class89_sub2_2262_).aShortArray9465
	    = ((Class89_Sub2) this).aShortArray9465;
	((Class89_Sub2) class89_sub2_2262_).aShortArray9415
	    = ((Class89_Sub2) this).aShortArray9415;
	((Class89_Sub2) class89_sub2_2262_).anIntArray9453
	    = ((Class89_Sub2) this).anIntArray9453;
	((Class89_Sub2) class89_sub2_2262_).aClass106Array9445
	    = ((Class89_Sub2) this).aClass106Array9445;
	((Class89_Sub2) class89_sub2_2262_).aClass167Array9454
	    = ((Class89_Sub2) this).aClass167Array9454;
	return class89_sub2_2262_;
    }
    
    void method15562() {
	if (((Class89_Sub2) this).aBool9431) {
	    ((Class89_Sub2) this).aBool9431 = false;
	    if (((Class89_Sub2) this).aClass106Array9445 == null
		&& ((Class89_Sub2) this).aClass167Array9454 == null
		&& ((Class89_Sub2) this).aClass171Array9459 == null
		&& !Class154.method3293(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		boolean bool = false;
		boolean bool_2285_ = false;
		boolean bool_2286_ = false;
		if (((Class89_Sub2) this).anIntArray9411 != null
		    && !Class154.method3265(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (((Class89_Sub2) this).anIntArray9412 != null
		    && !Class154.method3266(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool_2285_ = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (((Class89_Sub2) this).anIntArray9413 != null
		    && !Class154.method3333(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool_2286_ = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (bool)
		    ((Class89_Sub2) this).anIntArray9411 = null;
		if (bool_2285_)
		    ((Class89_Sub2) this).anIntArray9412 = null;
		if (bool_2286_)
		    ((Class89_Sub2) this).anIntArray9413 = null;
	    }
	    if (((Class89_Sub2) this).aShortArray9455 != null
		&& ((Class89_Sub2) this).anIntArray9411 == null
		&& ((Class89_Sub2) this).anIntArray9412 == null
		&& ((Class89_Sub2) this).anIntArray9413 == null) {
		((Class89_Sub2) this).aShortArray9455 = null;
		((Class89_Sub2) this).anIntArray9395 = null;
	    }
	    if (((Class89_Sub2) this).aByteArray9420 != null
		&& !Class154.method3242(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9436 != null) {
		    if ((((Class151) ((Class89_Sub2) this).aClass151_9436)
			 .anInterface8_1713)
			!= null) {
			((Class89_Sub2) this).aShortArray9419 = null;
			((Class89_Sub2) this).aShortArray9418 = null;
			((Class89_Sub2) this).aShortArray9417 = null;
			((Class89_Sub2) this).aByteArray9420 = null;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		} else if (((Class89_Sub2) this).aClass151_9433 == null
			   || (((Class151) (((Class89_Sub2) this)
					    .aClass151_9433)).anInterface8_1713
			       != null)) {
		    ((Class89_Sub2) this).aShortArray9419 = null;
		    ((Class89_Sub2) this).aShortArray9418 = null;
		    ((Class89_Sub2) this).aShortArray9417 = null;
		    ((Class89_Sub2) this).aByteArray9420 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9442 != null
		&& !Class154.method3269(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aShortArray9442 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aByteArray9408 != null
		&& !Class154.method3270(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aByteArray9408 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aFloatArray9422 != null
		&& !Class154.method3271(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9437 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9437)
			.anInterface8_1713) != null) {
		    ((Class89_Sub2) this).aFloatArray9423 = null;
		    ((Class89_Sub2) this).aFloatArray9422 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9414 != null
		&& !Class154.method3276(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aShortArray9414 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9428 != null
		&& !Class154.method3275(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if ((((Class89_Sub2) this).aClass146_9438 == null
		     || (((Class146) ((Class89_Sub2) this).aClass146_9438)
			 .anInterface14_1692) != null)
		    && (((Class89_Sub2) this).aClass151_9433 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9433)
			    .anInterface8_1713) != null)) {
		    ((Class89_Sub2) this).aShortArray9407 = null;
		    ((Class89_Sub2) this).aShortArray9462 = null;
		    ((Class89_Sub2) this).aShortArray9428 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null
		&& !Class154.method3272(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		((Class89_Sub2) this).anIntArrayArray9432 = null;
		((Class89_Sub2) this).aShortArray9415 = null;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9467 != null
		&& !Class154.method3273(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		((Class89_Sub2) this).anIntArrayArray9467 = null;
		((Class89_Sub2) this).aShortArray9465 = null;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null
		&& !Class154.method3311(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469))
		((Class89_Sub2) this).anIntArrayArray9461 = null;
	    if (((Class89_Sub2) this).anIntArray9453 != null
		&& (((Class89_Sub2) this).anInt9402 & 0x800) == 0
		&& (((Class89_Sub2) this).anInt9402 & 0x40000) == 0)
		((Class89_Sub2) this).anIntArray9453 = null;
	}
    }
    
    void method15563() {
	if (((Class89_Sub2) this).aBool9431) {
	    ((Class89_Sub2) this).aBool9431 = false;
	    if (((Class89_Sub2) this).aClass106Array9445 == null
		&& ((Class89_Sub2) this).aClass167Array9454 == null
		&& ((Class89_Sub2) this).aClass171Array9459 == null
		&& !Class154.method3293(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		boolean bool = false;
		boolean bool_2287_ = false;
		boolean bool_2288_ = false;
		if (((Class89_Sub2) this).anIntArray9411 != null
		    && !Class154.method3265(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (((Class89_Sub2) this).anIntArray9412 != null
		    && !Class154.method3266(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool_2287_ = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (((Class89_Sub2) this).anIntArray9413 != null
		    && !Class154.method3333(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool_2288_ = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (bool)
		    ((Class89_Sub2) this).anIntArray9411 = null;
		if (bool_2287_)
		    ((Class89_Sub2) this).anIntArray9412 = null;
		if (bool_2288_)
		    ((Class89_Sub2) this).anIntArray9413 = null;
	    }
	    if (((Class89_Sub2) this).aShortArray9455 != null
		&& ((Class89_Sub2) this).anIntArray9411 == null
		&& ((Class89_Sub2) this).anIntArray9412 == null
		&& ((Class89_Sub2) this).anIntArray9413 == null) {
		((Class89_Sub2) this).aShortArray9455 = null;
		((Class89_Sub2) this).anIntArray9395 = null;
	    }
	    if (((Class89_Sub2) this).aByteArray9420 != null
		&& !Class154.method3242(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9436 != null) {
		    if ((((Class151) ((Class89_Sub2) this).aClass151_9436)
			 .anInterface8_1713)
			!= null) {
			((Class89_Sub2) this).aShortArray9419 = null;
			((Class89_Sub2) this).aShortArray9418 = null;
			((Class89_Sub2) this).aShortArray9417 = null;
			((Class89_Sub2) this).aByteArray9420 = null;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		} else if (((Class89_Sub2) this).aClass151_9433 == null
			   || (((Class151) (((Class89_Sub2) this)
					    .aClass151_9433)).anInterface8_1713
			       != null)) {
		    ((Class89_Sub2) this).aShortArray9419 = null;
		    ((Class89_Sub2) this).aShortArray9418 = null;
		    ((Class89_Sub2) this).aShortArray9417 = null;
		    ((Class89_Sub2) this).aByteArray9420 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9442 != null
		&& !Class154.method3269(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aShortArray9442 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aByteArray9408 != null
		&& !Class154.method3270(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aByteArray9408 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aFloatArray9422 != null
		&& !Class154.method3271(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9437 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9437)
			.anInterface8_1713) != null) {
		    ((Class89_Sub2) this).aFloatArray9423 = null;
		    ((Class89_Sub2) this).aFloatArray9422 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9414 != null
		&& !Class154.method3276(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aShortArray9414 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9428 != null
		&& !Class154.method3275(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if ((((Class89_Sub2) this).aClass146_9438 == null
		     || (((Class146) ((Class89_Sub2) this).aClass146_9438)
			 .anInterface14_1692) != null)
		    && (((Class89_Sub2) this).aClass151_9433 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9433)
			    .anInterface8_1713) != null)) {
		    ((Class89_Sub2) this).aShortArray9407 = null;
		    ((Class89_Sub2) this).aShortArray9462 = null;
		    ((Class89_Sub2) this).aShortArray9428 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null
		&& !Class154.method3272(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		((Class89_Sub2) this).anIntArrayArray9432 = null;
		((Class89_Sub2) this).aShortArray9415 = null;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9467 != null
		&& !Class154.method3273(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		((Class89_Sub2) this).anIntArrayArray9467 = null;
		((Class89_Sub2) this).aShortArray9465 = null;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null
		&& !Class154.method3311(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469))
		((Class89_Sub2) this).anIntArrayArray9461 = null;
	    if (((Class89_Sub2) this).anIntArray9453 != null
		&& (((Class89_Sub2) this).anInt9402 & 0x800) == 0
		&& (((Class89_Sub2) this).anInt9402 & 0x40000) == 0)
		((Class89_Sub2) this).anIntArray9453 = null;
	}
    }
    
    void method15564() {
	if (((Class89_Sub2) this).aBool9431) {
	    ((Class89_Sub2) this).aBool9431 = false;
	    if (((Class89_Sub2) this).aClass106Array9445 == null
		&& ((Class89_Sub2) this).aClass167Array9454 == null
		&& ((Class89_Sub2) this).aClass171Array9459 == null
		&& !Class154.method3293(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		boolean bool = false;
		boolean bool_2289_ = false;
		boolean bool_2290_ = false;
		if (((Class89_Sub2) this).anIntArray9411 != null
		    && !Class154.method3265(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (((Class89_Sub2) this).anIntArray9412 != null
		    && !Class154.method3266(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool_2289_ = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (((Class89_Sub2) this).anIntArray9413 != null
		    && !Class154.method3333(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool_2290_ = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (bool)
		    ((Class89_Sub2) this).anIntArray9411 = null;
		if (bool_2289_)
		    ((Class89_Sub2) this).anIntArray9412 = null;
		if (bool_2290_)
		    ((Class89_Sub2) this).anIntArray9413 = null;
	    }
	    if (((Class89_Sub2) this).aShortArray9455 != null
		&& ((Class89_Sub2) this).anIntArray9411 == null
		&& ((Class89_Sub2) this).anIntArray9412 == null
		&& ((Class89_Sub2) this).anIntArray9413 == null) {
		((Class89_Sub2) this).aShortArray9455 = null;
		((Class89_Sub2) this).anIntArray9395 = null;
	    }
	    if (((Class89_Sub2) this).aByteArray9420 != null
		&& !Class154.method3242(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9436 != null) {
		    if ((((Class151) ((Class89_Sub2) this).aClass151_9436)
			 .anInterface8_1713)
			!= null) {
			((Class89_Sub2) this).aShortArray9419 = null;
			((Class89_Sub2) this).aShortArray9418 = null;
			((Class89_Sub2) this).aShortArray9417 = null;
			((Class89_Sub2) this).aByteArray9420 = null;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		} else if (((Class89_Sub2) this).aClass151_9433 == null
			   || (((Class151) (((Class89_Sub2) this)
					    .aClass151_9433)).anInterface8_1713
			       != null)) {
		    ((Class89_Sub2) this).aShortArray9419 = null;
		    ((Class89_Sub2) this).aShortArray9418 = null;
		    ((Class89_Sub2) this).aShortArray9417 = null;
		    ((Class89_Sub2) this).aByteArray9420 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9442 != null
		&& !Class154.method3269(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aShortArray9442 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aByteArray9408 != null
		&& !Class154.method3270(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aByteArray9408 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aFloatArray9422 != null
		&& !Class154.method3271(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9437 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9437)
			.anInterface8_1713) != null) {
		    ((Class89_Sub2) this).aFloatArray9423 = null;
		    ((Class89_Sub2) this).aFloatArray9422 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9414 != null
		&& !Class154.method3276(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aShortArray9414 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9428 != null
		&& !Class154.method3275(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if ((((Class89_Sub2) this).aClass146_9438 == null
		     || (((Class146) ((Class89_Sub2) this).aClass146_9438)
			 .anInterface14_1692) != null)
		    && (((Class89_Sub2) this).aClass151_9433 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9433)
			    .anInterface8_1713) != null)) {
		    ((Class89_Sub2) this).aShortArray9407 = null;
		    ((Class89_Sub2) this).aShortArray9462 = null;
		    ((Class89_Sub2) this).aShortArray9428 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null
		&& !Class154.method3272(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		((Class89_Sub2) this).anIntArrayArray9432 = null;
		((Class89_Sub2) this).aShortArray9415 = null;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9467 != null
		&& !Class154.method3273(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		((Class89_Sub2) this).anIntArrayArray9467 = null;
		((Class89_Sub2) this).aShortArray9465 = null;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null
		&& !Class154.method3311(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469))
		((Class89_Sub2) this).anIntArrayArray9461 = null;
	    if (((Class89_Sub2) this).anIntArray9453 != null
		&& (((Class89_Sub2) this).anInt9402 & 0x800) == 0
		&& (((Class89_Sub2) this).anInt9402 & 0x40000) == 0)
		((Class89_Sub2) this).anIntArray9453 = null;
	}
    }
    
    void method15565() {
	if (((Class89_Sub2) this).aBool9431) {
	    ((Class89_Sub2) this).aBool9431 = false;
	    if (((Class89_Sub2) this).aClass106Array9445 == null
		&& ((Class89_Sub2) this).aClass167Array9454 == null
		&& ((Class89_Sub2) this).aClass171Array9459 == null
		&& !Class154.method3293(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		boolean bool = false;
		boolean bool_2291_ = false;
		boolean bool_2292_ = false;
		if (((Class89_Sub2) this).anIntArray9411 != null
		    && !Class154.method3265(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (((Class89_Sub2) this).anIntArray9412 != null
		    && !Class154.method3266(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool_2291_ = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (((Class89_Sub2) this).anIntArray9413 != null
		    && !Class154.method3333(((Class89_Sub2) this).anInt9402,
					    ((Class89_Sub2) this).anInt9469)) {
		    if (((Class89_Sub2) this).aClass151_9434 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9434)
			    .anInterface8_1713) != null) {
			if (!((Class89_Sub2) this).aBool9444)
			    method15537();
			bool_2292_ = true;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		}
		if (bool)
		    ((Class89_Sub2) this).anIntArray9411 = null;
		if (bool_2291_)
		    ((Class89_Sub2) this).anIntArray9412 = null;
		if (bool_2292_)
		    ((Class89_Sub2) this).anIntArray9413 = null;
	    }
	    if (((Class89_Sub2) this).aShortArray9455 != null
		&& ((Class89_Sub2) this).anIntArray9411 == null
		&& ((Class89_Sub2) this).anIntArray9412 == null
		&& ((Class89_Sub2) this).anIntArray9413 == null) {
		((Class89_Sub2) this).aShortArray9455 = null;
		((Class89_Sub2) this).anIntArray9395 = null;
	    }
	    if (((Class89_Sub2) this).aByteArray9420 != null
		&& !Class154.method3242(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9436 != null) {
		    if ((((Class151) ((Class89_Sub2) this).aClass151_9436)
			 .anInterface8_1713)
			!= null) {
			((Class89_Sub2) this).aShortArray9419 = null;
			((Class89_Sub2) this).aShortArray9418 = null;
			((Class89_Sub2) this).aShortArray9417 = null;
			((Class89_Sub2) this).aByteArray9420 = null;
		    } else
			((Class89_Sub2) this).aBool9431 = true;
		} else if (((Class89_Sub2) this).aClass151_9433 == null
			   || (((Class151) (((Class89_Sub2) this)
					    .aClass151_9433)).anInterface8_1713
			       != null)) {
		    ((Class89_Sub2) this).aShortArray9419 = null;
		    ((Class89_Sub2) this).aShortArray9418 = null;
		    ((Class89_Sub2) this).aShortArray9417 = null;
		    ((Class89_Sub2) this).aByteArray9420 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9442 != null
		&& !Class154.method3269(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aShortArray9442 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aByteArray9408 != null
		&& !Class154.method3270(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aByteArray9408 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aFloatArray9422 != null
		&& !Class154.method3271(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9437 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9437)
			.anInterface8_1713) != null) {
		    ((Class89_Sub2) this).aFloatArray9423 = null;
		    ((Class89_Sub2) this).aFloatArray9422 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9414 != null
		&& !Class154.method3276(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if (((Class89_Sub2) this).aClass151_9433 == null
		    || (((Class151) ((Class89_Sub2) this).aClass151_9433)
			.anInterface8_1713) != null)
		    ((Class89_Sub2) this).aShortArray9414 = null;
		else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).aShortArray9428 != null
		&& !Class154.method3275(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		if ((((Class89_Sub2) this).aClass146_9438 == null
		     || (((Class146) ((Class89_Sub2) this).aClass146_9438)
			 .anInterface14_1692) != null)
		    && (((Class89_Sub2) this).aClass151_9433 == null
			|| (((Class151) ((Class89_Sub2) this).aClass151_9433)
			    .anInterface8_1713) != null)) {
		    ((Class89_Sub2) this).aShortArray9407 = null;
		    ((Class89_Sub2) this).aShortArray9462 = null;
		    ((Class89_Sub2) this).aShortArray9428 = null;
		} else
		    ((Class89_Sub2) this).aBool9431 = true;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9432 != null
		&& !Class154.method3272(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		((Class89_Sub2) this).anIntArrayArray9432 = null;
		((Class89_Sub2) this).aShortArray9415 = null;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9467 != null
		&& !Class154.method3273(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469)) {
		((Class89_Sub2) this).anIntArrayArray9467 = null;
		((Class89_Sub2) this).aShortArray9465 = null;
	    }
	    if (((Class89_Sub2) this).anIntArrayArray9461 != null
		&& !Class154.method3311(((Class89_Sub2) this).anInt9402,
					((Class89_Sub2) this).anInt9469))
		((Class89_Sub2) this).anIntArrayArray9461 = null;
	    if (((Class89_Sub2) this).anIntArray9453 != null
		&& (((Class89_Sub2) this).anInt9402 & 0x800) == 0
		&& (((Class89_Sub2) this).anInt9402 & 0x40000) == 0)
		((Class89_Sub2) this).anIntArray9453 = null;
	}
    }
    
    void method15566() {
	int i = 32767;
	int i_2293_ = 32767;
	int i_2294_ = 32767;
	int i_2295_ = -32768;
	int i_2296_ = -32768;
	int i_2297_ = -32768;
	int i_2298_ = 0;
	int i_2299_ = 0;
	for (int i_2300_ = 0; i_2300_ < ((Class89_Sub2) this).anInt9410;
	     i_2300_++) {
	    int i_2301_ = ((Class89_Sub2) this).anIntArray9411[i_2300_];
	    int i_2302_ = ((Class89_Sub2) this).anIntArray9412[i_2300_];
	    int i_2303_ = ((Class89_Sub2) this).anIntArray9413[i_2300_];
	    if (i_2301_ < i)
		i = i_2301_;
	    if (i_2301_ > i_2295_)
		i_2295_ = i_2301_;
	    if (i_2302_ < i_2293_)
		i_2293_ = i_2302_;
	    if (i_2302_ > i_2296_)
		i_2296_ = i_2302_;
	    if (i_2303_ < i_2294_)
		i_2294_ = i_2303_;
	    if (i_2303_ > i_2297_)
		i_2297_ = i_2303_;
	    int i_2304_ = i_2301_ * i_2301_ + i_2303_ * i_2303_;
	    if (i_2304_ > i_2298_)
		i_2298_ = i_2304_;
	    i_2304_
		= i_2301_ * i_2301_ + i_2303_ * i_2303_ + i_2302_ * i_2302_;
	    if (i_2304_ > i_2299_)
		i_2299_ = i_2304_;
	}
	((Class89_Sub2) this).aShort9447 = (short) i;
	((Class89_Sub2) this).aShort9448 = (short) i_2295_;
	((Class89_Sub2) this).aShort9403 = (short) i_2293_;
	((Class89_Sub2) this).aShort9446 = (short) i_2296_;
	((Class89_Sub2) this).aShort9449 = (short) i_2294_;
	((Class89_Sub2) this).aShort9450 = (short) i_2297_;
	((Class89_Sub2) this).anInt9421
	    = (int) (Math.sqrt((double) i_2298_) + 0.99);
	((Class89_Sub2) this).anInt9443
	    = (int) (Math.sqrt((double) i_2299_) + 0.99);
	((Class89_Sub2) this).aBool9444 = true;
    }
    
    public int method1919() {
	if (!((Class89_Sub2) this).aBool9451)
	    method1922();
	return ((Class89_Sub2) this).aShort9435;
    }
    
    public void method1927(int i, int i_2305_, int i_2306_) {
	for (int i_2307_ = 0; i_2307_ < ((Class89_Sub2) this).anInt9410;
	     i_2307_++) {
	    if (i != 0)
		((Class89_Sub2) this).anIntArray9411[i_2307_] += i;
	    if (i_2305_ != 0)
		((Class89_Sub2) this).anIntArray9412[i_2307_] += i_2305_;
	    if (i_2306_ != 0)
		((Class89_Sub2) this).anIntArray9413[i_2307_] += i_2306_;
	}
	if (((Class89_Sub2) this).aClass151_9434 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9434).anInterface8_1713
		= null;
	((Class89_Sub2) this).aBool9444 = false;
    }
    
    public void method1920(Class89 class89, int i, int i_2308_, int i_2309_,
			   boolean bool) {
	Class89_Sub2 class89_sub2_2310_ = (Class89_Sub2) class89;
	if (((Class89_Sub2) this).anInt9424 != 0
	    && ((Class89_Sub2) class89_sub2_2310_).anInt9424 != 0) {
	    int i_2311_ = ((Class89_Sub2) class89_sub2_2310_).anInt9410;
	    int[] is = ((Class89_Sub2) class89_sub2_2310_).anIntArray9411;
	    int[] is_2312_
		= ((Class89_Sub2) class89_sub2_2310_).anIntArray9412;
	    int[] is_2313_
		= ((Class89_Sub2) class89_sub2_2310_).anIntArray9413;
	    short[] is_2314_
		= ((Class89_Sub2) class89_sub2_2310_).aShortArray9417;
	    short[] is_2315_
		= ((Class89_Sub2) class89_sub2_2310_).aShortArray9418;
	    short[] is_2316_
		= ((Class89_Sub2) class89_sub2_2310_).aShortArray9419;
	    byte[] is_2317_
		= ((Class89_Sub2) class89_sub2_2310_).aByteArray9420;
	    short[] is_2318_;
	    short[] is_2319_;
	    short[] is_2320_;
	    byte[] is_2321_;
	    if (((Class89_Sub2) this).aClass178_9456 != null) {
		is_2318_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aShortArray2129);
		is_2319_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aShortArray2127);
		is_2320_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aShortArray2126);
		is_2321_ = (((Class178) ((Class89_Sub2) this).aClass178_9456)
			    .aByteArray2128);
	    } else {
		is_2318_ = null;
		is_2319_ = null;
		is_2320_ = null;
		is_2321_ = null;
	    }
	    short[] is_2322_;
	    short[] is_2323_;
	    short[] is_2324_;
	    byte[] is_2325_;
	    if (((Class89_Sub2) class89_sub2_2310_).aClass178_9456 != null) {
		is_2322_ = ((Class178) (((Class89_Sub2) class89_sub2_2310_)
					.aClass178_9456)).aShortArray2129;
		is_2323_ = ((Class178) (((Class89_Sub2) class89_sub2_2310_)
					.aClass178_9456)).aShortArray2127;
		is_2324_ = ((Class178) (((Class89_Sub2) class89_sub2_2310_)
					.aClass178_9456)).aShortArray2126;
		is_2325_ = ((Class178) (((Class89_Sub2) class89_sub2_2310_)
					.aClass178_9456)).aByteArray2128;
	    } else {
		is_2322_ = null;
		is_2323_ = null;
		is_2324_ = null;
		is_2325_ = null;
	    }
	    int[] is_2326_
		= ((Class89_Sub2) class89_sub2_2310_).anIntArray9395;
	    short[] is_2327_
		= ((Class89_Sub2) class89_sub2_2310_).aShortArray9455;
	    if (!((Class89_Sub2) class89_sub2_2310_).aBool9444)
		class89_sub2_2310_.method15537();
	    int i_2328_ = ((Class89_Sub2) class89_sub2_2310_).aShort9403;
	    int i_2329_ = ((Class89_Sub2) class89_sub2_2310_).aShort9446;
	    int i_2330_ = ((Class89_Sub2) class89_sub2_2310_).aShort9447;
	    int i_2331_ = ((Class89_Sub2) class89_sub2_2310_).aShort9448;
	    int i_2332_ = ((Class89_Sub2) class89_sub2_2310_).aShort9449;
	    int i_2333_ = ((Class89_Sub2) class89_sub2_2310_).aShort9450;
	    for (int i_2334_ = 0; i_2334_ < ((Class89_Sub2) this).anInt9410;
		 i_2334_++) {
		int i_2335_
		    = ((Class89_Sub2) this).anIntArray9412[i_2334_] - i_2308_;
		if (i_2335_ >= i_2328_ && i_2335_ <= i_2329_) {
		    int i_2336_
			= ((Class89_Sub2) this).anIntArray9411[i_2334_] - i;
		    if (i_2336_ >= i_2330_ && i_2336_ <= i_2331_) {
			int i_2337_
			    = (((Class89_Sub2) this).anIntArray9413[i_2334_]
			       - i_2309_);
			if (i_2337_ >= i_2332_ && i_2337_ <= i_2333_) {
			    int i_2338_ = -1;
			    int i_2339_ = (((Class89_Sub2) this).anIntArray9395
					   [i_2334_]);
			    int i_2340_ = (((Class89_Sub2) this).anIntArray9395
					   [i_2334_ + 1]);
			    for (int i_2341_ = i_2339_;
				 (i_2341_ < i_2340_
				  && (((Class89_Sub2) this).aShortArray9455
				      [i_2341_]) != 0);
				 i_2341_++) {
				i_2338_ = ((((Class89_Sub2) this)
					    .aShortArray9455[i_2341_])
					   & 0xffff) - 1;
				if ((((Class89_Sub2) this).aByteArray9420
				     [i_2338_])
				    != 0)
				    break;
			    }
			    if (i_2338_ != -1) {
				for (int i_2342_ = 0; i_2342_ < i_2311_;
				     i_2342_++) {
				    if (i_2336_ == is[i_2342_]
					&& i_2337_ == is_2313_[i_2342_]
					&& i_2335_ == is_2312_[i_2342_]) {
					int i_2343_ = -1;
					i_2339_ = is_2326_[i_2342_];
					i_2340_ = is_2326_[i_2342_ + 1];
					for (int i_2344_ = i_2339_;
					     (i_2344_ < i_2340_
					      && is_2327_[i_2344_] != 0);
					     i_2344_++) {
					    i_2343_ = (is_2327_[i_2344_]
						       & 0xffff) - 1;
					    if (is_2317_[i_2343_] != 0)
						break;
					}
					if (i_2343_ != -1) {
					    if (is_2318_ == null) {
						((Class89_Sub2) this)
						    .aClass178_9456
						    = new Class178();
						is_2318_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2129
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9417),
							-509936667));
						is_2319_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2127
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9418),
							-1812655562));
						is_2320_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aShortArray2126
						    = (Class518.method11659
						       ((((Class89_Sub2) this)
							 .aShortArray9419),
							-1770533010));
						is_2321_
						    = ((Class178)
						       (((Class89_Sub2) this)
							.aClass178_9456))
							  .aByteArray2128
						    = (Class554.method12275
						       ((((Class89_Sub2) this)
							 .aByteArray9420),
							-841739618));
					    }
					    if (is_2322_ == null) {
						Class178 class178
						    = (((Class89_Sub2)
							class89_sub2_2310_)
							   .aClass178_9456
						       = new Class178());
						is_2322_
						    = ((Class178) class178)
							  .aShortArray2129
						    = (Class518.method11659
						       (is_2314_, -744781193));
						is_2323_
						    = ((Class178) class178)
							  .aShortArray2127
						    = (Class518.method11659
						       (is_2315_,
							-1767422728));
						is_2324_
						    = ((Class178) class178)
							  .aShortArray2126
						    = (Class518.method11659
						       (is_2316_,
							-1622592021));
						is_2325_
						    = ((Class178) class178)
							  .aByteArray2128
						    = (Class554.method12275
						       (is_2317_, -841739618));
					    }
					    short i_2345_
						= (((Class89_Sub2) this)
						   .aShortArray9417[i_2338_]);
					    short i_2346_
						= (((Class89_Sub2) this)
						   .aShortArray9418[i_2338_]);
					    short i_2347_
						= (((Class89_Sub2) this)
						   .aShortArray9419[i_2338_]);
					    byte i_2348_
						= (((Class89_Sub2) this)
						   .aByteArray9420[i_2338_]);
					    i_2339_ = is_2326_[i_2342_];
					    i_2340_ = is_2326_[i_2342_ + 1];
					    for (int i_2349_ = i_2339_;
						 i_2349_ < i_2340_;
						 i_2349_++) {
						int i_2350_
						    = is_2327_[i_2349_] - 1;
						if (i_2350_ == -1)
						    break;
						if (is_2325_[i_2350_] != 0) {
						    is_2322_[i_2350_]
							+= i_2345_;
						    is_2323_[i_2350_]
							+= i_2346_;
						    is_2324_[i_2350_]
							+= i_2347_;
						    is_2325_[i_2350_]
							+= i_2348_;
						}
					    }
					    i_2345_ = is_2314_[i_2343_];
					    i_2346_ = is_2315_[i_2343_];
					    i_2347_ = is_2316_[i_2343_];
					    i_2348_ = is_2317_[i_2343_];
					    i_2339_
						= (((Class89_Sub2) this)
						   .anIntArray9395[i_2334_]);
					    i_2340_ = (((Class89_Sub2) this)
						       .anIntArray9395
						       [i_2334_ + 1]);
					    for (int i_2351_ = i_2339_;
						 (i_2351_ < i_2340_
						  && (((Class89_Sub2) this)
						      .aShortArray9455
						      [i_2351_]) != 0);
						 i_2351_++) {
						int i_2352_
						    = (((((Class89_Sub2) this)
							 .aShortArray9455
							 [i_2351_])
							& 0xffff)
						       - 1);
						if (is_2321_[i_2352_] != 0) {
						    is_2318_[i_2352_]
							+= i_2345_;
						    is_2319_[i_2352_]
							+= i_2346_;
						    is_2320_[i_2352_]
							+= i_2347_;
						    is_2321_[i_2352_]
							+= i_2348_;
						}
					    }
					    if ((((Class89_Sub2) this)
						 .aClass151_9436) == null
						&& (((Class89_Sub2) this)
						    .aClass151_9433) != null)
						((Class151)
						 (((Class89_Sub2) this)
						  .aClass151_9433))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2) this)
						 .aClass151_9436)
						!= null)
						((Class151)
						 (((Class89_Sub2) this)
						  .aClass151_9436))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2)
						  class89_sub2_2310_)
						 .aClass151_9436) == null
						&& (((Class89_Sub2)
						     class89_sub2_2310_)
						    .aClass151_9433) != null)
						((Class151)
						 (((Class89_Sub2)
						   class89_sub2_2310_)
						  .aClass151_9433))
						    .anInterface8_1713
						    = null;
					    if ((((Class89_Sub2)
						  class89_sub2_2310_)
						 .aClass151_9436)
						!= null)
						((Class151)
						 (((Class89_Sub2)
						   class89_sub2_2310_)
						  .aClass151_9436))
						    .anInterface8_1713
						    = null;
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
    
    public void method2013(int i, int i_2353_, Class166 class166,
			   Class166 class166_2354_, int i_2355_, int i_2356_,
			   int i_2357_) {
	if (!((Class89_Sub2) this).aBool9444)
	    method15537();
	int i_2358_ = i_2355_ + ((Class89_Sub2) this).aShort9447;
	int i_2359_ = i_2355_ + ((Class89_Sub2) this).aShort9448;
	int i_2360_ = i_2357_ + ((Class89_Sub2) this).aShort9449;
	int i_2361_ = i_2357_ + ((Class89_Sub2) this).aShort9450;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_2358_ >= 0
		&& ((i_2359_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2055 * 266270313)
		&& i_2360_ >= 0
		&& ((i_2361_ + class166.anInt2053 * 2039042417
		     >> class166.anInt2054 * -122333825)
		    < class166.anInt2052 * -14610189))) {
	    if (i == 4 || i == 5) {
		if (class166_2354_ == null
		    || (i_2358_ < 0
			|| ((i_2359_ + class166_2354_.anInt2053 * 2039042417
			     >> class166_2354_.anInt2054 * -122333825)
			    >= class166_2354_.anInt2055 * 266270313)
			|| i_2360_ < 0
			|| ((i_2361_ + class166_2354_.anInt2053 * 2039042417
			     >> class166_2354_.anInt2054 * -122333825)
			    >= class166_2354_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_2358_ >>= class166.anInt2054 * -122333825;
		i_2359_ = (i_2359_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_2360_ >>= class166.anInt2054 * -122333825;
		i_2361_ = (i_2361_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if ((class166.method3551(i_2358_, i_2360_, -384888037)
		     == i_2356_)
		    && (class166.method3551(i_2359_, i_2360_, 920196589)
			== i_2356_)
		    && (class166.method3551(i_2358_, i_2361_, -1588281796)
			== i_2356_)
		    && (class166.method3551(i_2359_, i_2361_, 79717866)
			== i_2356_))
		    return;
	    }
	    if (i == 1) {
		for (int i_2362_ = 0;
		     i_2362_ < ((Class89_Sub2) this).anInt9410; i_2362_++)
		    ((Class89_Sub2) this).anIntArray9412[i_2362_]
			= (((Class89_Sub2) this).anIntArray9412[i_2362_]
			   + class166.method3550(((((Class89_Sub2) this)
						   .anIntArray9411[i_2362_])
						  + i_2355_),
						 ((((Class89_Sub2) this)
						   .anIntArray9413[i_2362_])
						  + i_2357_),
						 39131077)
			   - i_2356_);
	    } else if (i == 2) {
		int i_2363_ = ((Class89_Sub2) this).aShort9403;
		if (i_2363_ == 0)
		    return;
		for (int i_2364_ = 0;
		     i_2364_ < ((Class89_Sub2) this).anInt9410; i_2364_++) {
		    int i_2365_
			= ((((Class89_Sub2) this).anIntArray9412[i_2364_]
			    << 16)
			   / i_2363_);
		    if (i_2365_ < i_2353_)
			((Class89_Sub2) this).anIntArray9412[i_2364_]
			    = (((Class89_Sub2) this).anIntArray9412[i_2364_]
			       + (class166.method3550((((Class89_Sub2) this)
						       .anIntArray9411
						       [i_2364_]) + i_2355_,
						      (((Class89_Sub2) this)
						       .anIntArray9413
						       [i_2364_]) + i_2357_,
						      310742336)
				  - i_2356_) * (i_2353_ - i_2365_) / i_2353_);
		}
	    } else if (i == 3) {
		int i_2366_ = (i_2353_ & 0xff) * 4;
		int i_2367_ = (i_2353_ >> 8 & 0xff) * 4;
		int i_2368_ = (i_2353_ >> 16 & 0xff) << 6;
		int i_2369_ = (i_2353_ >> 24 & 0xff) << 6;
		if (i_2355_ - (i_2366_ >> 1) < 0
		    || ((i_2355_ + (i_2366_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2055 * 266270313
			    << class166.anInt2054 * -122333825))
		    || i_2357_ - (i_2367_ >> 1) < 0
		    || ((i_2357_ + (i_2367_ >> 1)
			 + class166.anInt2053 * 2039042417)
			>= (class166.anInt2052 * -14610189
			    << class166.anInt2054 * -122333825)))
		    return;
		method2041(class166, i_2355_, i_2356_, i_2357_, i_2366_,
			   i_2367_, i_2368_, i_2369_);
	    } else if (i == 4) {
		int i_2370_ = (((Class89_Sub2) this).aShort9446
			       - ((Class89_Sub2) this).aShort9403);
		for (int i_2371_ = 0;
		     i_2371_ < ((Class89_Sub2) this).anInt9410; i_2371_++)
		    ((Class89_Sub2) this).anIntArray9412[i_2371_]
			= (((Class89_Sub2) this).anIntArray9412[i_2371_]
			   + (class166_2354_.method3550((((Class89_Sub2) this)
							 .anIntArray9411
							 [i_2371_]) + i_2355_,
							(((Class89_Sub2) this)
							 .anIntArray9413
							 [i_2371_]) + i_2357_,
							-1928792223)
			      - i_2356_)
			   + i_2370_);
	    } else if (i == 5) {
		int i_2372_ = (((Class89_Sub2) this).aShort9446
			       - ((Class89_Sub2) this).aShort9403);
		for (int i_2373_ = 0;
		     i_2373_ < ((Class89_Sub2) this).anInt9410; i_2373_++) {
		    int i_2374_
			= (((Class89_Sub2) this).anIntArray9411[i_2373_]
			   + i_2355_);
		    int i_2375_
			= (((Class89_Sub2) this).anIntArray9413[i_2373_]
			   + i_2357_);
		    int i_2376_
			= class166.method3550(i_2374_, i_2375_, -1079109865);
		    int i_2377_ = class166_2354_.method3550(i_2374_, i_2375_,
							    -661021098);
		    int i_2378_ = i_2376_ - i_2377_ - i_2353_;
		    ((Class89_Sub2) this).anIntArray9412[i_2373_]
			= ((((Class89_Sub2) this).anIntArray9412[i_2373_]
			    << 8) / i_2372_ * i_2378_
			   >> 8) - (i_2356_ - i_2376_);
		}
	    }
	    if (((Class89_Sub2) this).aClass151_9434 != null)
		((Class151) ((Class89_Sub2) this).aClass151_9434)
		    .anInterface8_1713
		    = null;
	    ((Class89_Sub2) this).aBool9444 = false;
	}
    }
    
    public boolean method2027() {
	return ((Class89_Sub2) this).aBool9452;
    }
    
    void method15567(Class268 class268) {
	if (((Class89_Sub2) this).aClass171Array9459 != null) {
	    Class268 class268_2379_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9088);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15141();
	    ((Class89_Sub2) this).aClass103_Sub1_9457
		.method2308(!((Class89_Sub2) this).aBool9452);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15186(false);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15168
		((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		  .aClass151_9226),
		 null, null,
		 (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		  .aClass151_9227));
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9427; i++) {
		Class171 class171
		    = ((Class89_Sub2) this).aClass171Array9459[i];
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i];
		if (!((Class171) class171).aBool2072
		    || !((Class89_Sub2) this).aClass103_Sub1_9457
			    .method2331()) {
		    float f = ((float) ((((Class89_Sub2) this).anIntArray9411
					 [((Class171) class171).anInt2071])
					+ (((Class89_Sub2) this).anIntArray9411
					   [((Class171) class171).anInt2067])
					+ (((Class89_Sub2) this).anIntArray9411
					   [((Class171) class171).anInt2068]))
			       * 0.3333333F);
		    float f_2380_
			= ((float) ((((Class89_Sub2) this).anIntArray9412
				     [((Class171) class171).anInt2071])
				    + (((Class89_Sub2) this).anIntArray9412
				       [((Class171) class171).anInt2067])
				    + (((Class89_Sub2) this).anIntArray9412
				       [((Class171) class171).anInt2068]))
			   * 0.3333333F);
		    float f_2381_
			= ((float) ((((Class89_Sub2) this).anIntArray9413
				     [((Class171) class171).anInt2071])
				    + (((Class89_Sub2) this).anIntArray9413
				       [((Class171) class171).anInt2067])
				    + (((Class89_Sub2) this).anIntArray9413
				       [((Class171) class171).anInt2068]))
			   * 0.3333333F);
		    float f_2382_ = (class268.aFloatArray4353[0] * f
				     + class268.aFloatArray4353[4] * f_2380_
				     + class268.aFloatArray4353[8] * f_2381_
				     + class268.aFloatArray4353[12]);
		    float f_2383_ = (class268.aFloatArray4353[1] * f
				     + class268.aFloatArray4353[5] * f_2380_
				     + class268.aFloatArray4353[9] * f_2381_
				     + class268.aFloatArray4353[13]);
		    float f_2384_ = (class268.aFloatArray4353[2] * f
				     + class268.aFloatArray4353[6] * f_2380_
				     + class268.aFloatArray4353[10] * f_2381_
				     + class268.aFloatArray4353[14]);
		    float f_2385_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2382_ * f_2382_
							  + f_2383_ * f_2383_
							  + (f_2384_
							     * f_2384_))))
			   * (float) ((Class171) class171).anInt2075);
		    class268_2379_.method5232
			(((Class140) class140).anInt1625,
			 (((Class140) class140).anInt1626
			  * ((Class171) class171).aShort2070) >> 7,
			 (((Class140) class140).anInt1627
			  * ((Class171) class171).aShort2074) >> 7,
			 (f_2382_ + (float) ((Class140) class140).anInt1628
			  - f_2382_ * f_2385_),
			 (f_2383_ + (float) ((Class140) class140).anInt1629
			  - f_2383_ * f_2385_),
			 f_2384_ - f_2384_ * f_2385_);
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15143(class268_2379_);
		    int i_2386_ = ((Class140) class140).anInt1630;
		    OpenGL.glColor4ub((byte) (i_2386_ >> 16),
				      (byte) (i_2386_ >> 8), (byte) i_2386_,
				      (byte) (i_2386_ >> 24));
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15173(((Class171) class171).aShort2073);
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15192(((Class171) class171).aByte2066);
		    ((Class89_Sub2) this).aClass103_Sub1_9457.method15169(7, 0,
									  4);
		}
	    }
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method2308(true);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15144();
	}
    }
    
    static final int method15568(int i, int i_2387_) {
	i_2387_ = i_2387_ * (i & 0x7f) >> 7;
	if (i_2387_ < 2)
	    i_2387_ = 2;
	else if (i_2387_ > 126)
	    i_2387_ = 126;
	return (i & 0xff80) + i_2387_;
    }
    
    boolean method15569(int i, int i_2388_, int i_2389_, int i_2390_,
			int i_2391_, int i_2392_, int i_2393_, int i_2394_) {
	if (i_2388_ < i_2389_ && i_2388_ < i_2390_ && i_2388_ < i_2391_)
	    return false;
	if (i_2388_ > i_2389_ && i_2388_ > i_2390_ && i_2388_ > i_2391_)
	    return false;
	if (i < i_2392_ && i < i_2393_ && i < i_2394_)
	    return false;
	if (i > i_2392_ && i > i_2393_ && i > i_2394_)
	    return false;
	return true;
    }
    
    void method15570() {
	if (((Class89_Sub2) this).anInt9441 != 0) {
	    if (((Class89_Sub2) this).aByte9404 != 0)
		method15541(true);
	    method15541(false);
	    if (((Class89_Sub2) this).aClass146_9438 != null) {
		if ((((Class146) ((Class89_Sub2) this).aClass146_9438)
		     .anInterface14_1692)
		    == null)
		    method15536((((Class89_Sub2) this).aByte9404 & 0x10) != 0);
		if ((((Class146) ((Class89_Sub2) this).aClass146_9438)
		     .anInterface14_1692)
		    != null) {
		    ((Class89_Sub2) this).aClass103_Sub1_9457.method15186
			(((Class89_Sub2) this).aClass151_9436 != null);
		    ((Class89_Sub2) this).aClass103_Sub1_9457.method15168
			(((Class89_Sub2) this).aClass151_9434,
			 ((Class89_Sub2) this).aClass151_9436,
			 ((Class89_Sub2) this).aClass151_9433,
			 ((Class89_Sub2) this).aClass151_9437);
		    int i = ((Class89_Sub2) this).anIntArray9453.length - 1;
		    for (int i_2395_ = 0; i_2395_ < i; i_2395_++) {
			int i_2396_
			    = ((Class89_Sub2) this).anIntArray9453[i_2395_];
			int i_2397_ = (((Class89_Sub2) this).anIntArray9453
				       [i_2395_ + 1]);
			int i_2398_
			    = ((((Class89_Sub2) this).aShortArray9414[i_2396_]
				== -1)
			       ? -1
			       : (((Class89_Sub2) this).aShortArray9414
				  [i_2396_]) & 0xffff);
			((Class89_Sub2) this).aClass103_Sub1_9457.method15174
			    (i_2398_,
			     ((Class89_Sub2) this).aClass151_9436 != null);
			((Class89_Sub2) this).aClass103_Sub1_9457.method15265
			    ((((Class146) ((Class89_Sub2) this).aClass146_9438)
			      .anInterface14_1692),
			     4, i_2396_ * 3, (i_2397_ - i_2396_) * 3);
		    }
		}
	    }
	    method15544();
	}
    }
    
    void method15571(Class268 class268) {
	if (((Class89_Sub2) this).aClass171Array9459 != null) {
	    Class268 class268_2399_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9088);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15141();
	    ((Class89_Sub2) this).aClass103_Sub1_9457
		.method2308(!((Class89_Sub2) this).aBool9452);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15186(false);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15168
		((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		  .aClass151_9226),
		 null, null,
		 (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		  .aClass151_9227));
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9427; i++) {
		Class171 class171
		    = ((Class89_Sub2) this).aClass171Array9459[i];
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i];
		if (!((Class171) class171).aBool2072
		    || !((Class89_Sub2) this).aClass103_Sub1_9457
			    .method2331()) {
		    float f = ((float) ((((Class89_Sub2) this).anIntArray9411
					 [((Class171) class171).anInt2071])
					+ (((Class89_Sub2) this).anIntArray9411
					   [((Class171) class171).anInt2067])
					+ (((Class89_Sub2) this).anIntArray9411
					   [((Class171) class171).anInt2068]))
			       * 0.3333333F);
		    float f_2400_
			= ((float) ((((Class89_Sub2) this).anIntArray9412
				     [((Class171) class171).anInt2071])
				    + (((Class89_Sub2) this).anIntArray9412
				       [((Class171) class171).anInt2067])
				    + (((Class89_Sub2) this).anIntArray9412
				       [((Class171) class171).anInt2068]))
			   * 0.3333333F);
		    float f_2401_
			= ((float) ((((Class89_Sub2) this).anIntArray9413
				     [((Class171) class171).anInt2071])
				    + (((Class89_Sub2) this).anIntArray9413
				       [((Class171) class171).anInt2067])
				    + (((Class89_Sub2) this).anIntArray9413
				       [((Class171) class171).anInt2068]))
			   * 0.3333333F);
		    float f_2402_ = (class268.aFloatArray4353[0] * f
				     + class268.aFloatArray4353[4] * f_2400_
				     + class268.aFloatArray4353[8] * f_2401_
				     + class268.aFloatArray4353[12]);
		    float f_2403_ = (class268.aFloatArray4353[1] * f
				     + class268.aFloatArray4353[5] * f_2400_
				     + class268.aFloatArray4353[9] * f_2401_
				     + class268.aFloatArray4353[13]);
		    float f_2404_ = (class268.aFloatArray4353[2] * f
				     + class268.aFloatArray4353[6] * f_2400_
				     + class268.aFloatArray4353[10] * f_2401_
				     + class268.aFloatArray4353[14]);
		    float f_2405_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2402_ * f_2402_
							  + f_2403_ * f_2403_
							  + (f_2404_
							     * f_2404_))))
			   * (float) ((Class171) class171).anInt2075);
		    class268_2399_.method5232
			(((Class140) class140).anInt1625,
			 (((Class140) class140).anInt1626
			  * ((Class171) class171).aShort2070) >> 7,
			 (((Class140) class140).anInt1627
			  * ((Class171) class171).aShort2074) >> 7,
			 (f_2402_ + (float) ((Class140) class140).anInt1628
			  - f_2402_ * f_2405_),
			 (f_2403_ + (float) ((Class140) class140).anInt1629
			  - f_2403_ * f_2405_),
			 f_2404_ - f_2404_ * f_2405_);
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15143(class268_2399_);
		    int i_2406_ = ((Class140) class140).anInt1630;
		    OpenGL.glColor4ub((byte) (i_2406_ >> 16),
				      (byte) (i_2406_ >> 8), (byte) i_2406_,
				      (byte) (i_2406_ >> 24));
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15173(((Class171) class171).aShort2073);
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15192(((Class171) class171).aByte2066);
		    ((Class89_Sub2) this).aClass103_Sub1_9457.method15169(7, 0,
									  4);
		}
	    }
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method2308(true);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15144();
	}
    }
    
    void method15572(Class268 class268) {
	if (((Class89_Sub2) this).aClass171Array9459 != null) {
	    Class268 class268_2407_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9088);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15141();
	    ((Class89_Sub2) this).aClass103_Sub1_9457
		.method2308(!((Class89_Sub2) this).aBool9452);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15186(false);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15168
		((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		  .aClass151_9226),
		 null, null,
		 (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		  .aClass151_9227));
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9427; i++) {
		Class171 class171
		    = ((Class89_Sub2) this).aClass171Array9459[i];
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i];
		if (!((Class171) class171).aBool2072
		    || !((Class89_Sub2) this).aClass103_Sub1_9457
			    .method2331()) {
		    float f = ((float) ((((Class89_Sub2) this).anIntArray9411
					 [((Class171) class171).anInt2071])
					+ (((Class89_Sub2) this).anIntArray9411
					   [((Class171) class171).anInt2067])
					+ (((Class89_Sub2) this).anIntArray9411
					   [((Class171) class171).anInt2068]))
			       * 0.3333333F);
		    float f_2408_
			= ((float) ((((Class89_Sub2) this).anIntArray9412
				     [((Class171) class171).anInt2071])
				    + (((Class89_Sub2) this).anIntArray9412
				       [((Class171) class171).anInt2067])
				    + (((Class89_Sub2) this).anIntArray9412
				       [((Class171) class171).anInt2068]))
			   * 0.3333333F);
		    float f_2409_
			= ((float) ((((Class89_Sub2) this).anIntArray9413
				     [((Class171) class171).anInt2071])
				    + (((Class89_Sub2) this).anIntArray9413
				       [((Class171) class171).anInt2067])
				    + (((Class89_Sub2) this).anIntArray9413
				       [((Class171) class171).anInt2068]))
			   * 0.3333333F);
		    float f_2410_ = (class268.aFloatArray4353[0] * f
				     + class268.aFloatArray4353[4] * f_2408_
				     + class268.aFloatArray4353[8] * f_2409_
				     + class268.aFloatArray4353[12]);
		    float f_2411_ = (class268.aFloatArray4353[1] * f
				     + class268.aFloatArray4353[5] * f_2408_
				     + class268.aFloatArray4353[9] * f_2409_
				     + class268.aFloatArray4353[13]);
		    float f_2412_ = (class268.aFloatArray4353[2] * f
				     + class268.aFloatArray4353[6] * f_2408_
				     + class268.aFloatArray4353[10] * f_2409_
				     + class268.aFloatArray4353[14]);
		    float f_2413_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2410_ * f_2410_
							  + f_2411_ * f_2411_
							  + (f_2412_
							     * f_2412_))))
			   * (float) ((Class171) class171).anInt2075);
		    class268_2407_.method5232
			(((Class140) class140).anInt1625,
			 (((Class140) class140).anInt1626
			  * ((Class171) class171).aShort2070) >> 7,
			 (((Class140) class140).anInt1627
			  * ((Class171) class171).aShort2074) >> 7,
			 (f_2410_ + (float) ((Class140) class140).anInt1628
			  - f_2410_ * f_2413_),
			 (f_2411_ + (float) ((Class140) class140).anInt1629
			  - f_2411_ * f_2413_),
			 f_2412_ - f_2412_ * f_2413_);
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15143(class268_2407_);
		    int i_2414_ = ((Class140) class140).anInt1630;
		    OpenGL.glColor4ub((byte) (i_2414_ >> 16),
				      (byte) (i_2414_ >> 8), (byte) i_2414_,
				      (byte) (i_2414_ >> 24));
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15173(((Class171) class171).aShort2073);
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15192(((Class171) class171).aByte2066);
		    ((Class89_Sub2) this).aClass103_Sub1_9457.method15169(7, 0,
									  4);
		}
	    }
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method2308(true);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15144();
	}
    }
    
    void method15573(Class268 class268) {
	if (((Class89_Sub2) this).aClass171Array9459 != null) {
	    Class268 class268_2415_
		= (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		   .aClass268_9088);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15141();
	    ((Class89_Sub2) this).aClass103_Sub1_9457
		.method2308(!((Class89_Sub2) this).aBool9452);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15186(false);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15168
		((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		  .aClass151_9226),
		 null, null,
		 (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		  .aClass151_9227));
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9427; i++) {
		Class171 class171
		    = ((Class89_Sub2) this).aClass171Array9459[i];
		Class140 class140
		    = ((Class89_Sub2) this).aClass140Array9460[i];
		if (!((Class171) class171).aBool2072
		    || !((Class89_Sub2) this).aClass103_Sub1_9457
			    .method2331()) {
		    float f = ((float) ((((Class89_Sub2) this).anIntArray9411
					 [((Class171) class171).anInt2071])
					+ (((Class89_Sub2) this).anIntArray9411
					   [((Class171) class171).anInt2067])
					+ (((Class89_Sub2) this).anIntArray9411
					   [((Class171) class171).anInt2068]))
			       * 0.3333333F);
		    float f_2416_
			= ((float) ((((Class89_Sub2) this).anIntArray9412
				     [((Class171) class171).anInt2071])
				    + (((Class89_Sub2) this).anIntArray9412
				       [((Class171) class171).anInt2067])
				    + (((Class89_Sub2) this).anIntArray9412
				       [((Class171) class171).anInt2068]))
			   * 0.3333333F);
		    float f_2417_
			= ((float) ((((Class89_Sub2) this).anIntArray9413
				     [((Class171) class171).anInt2071])
				    + (((Class89_Sub2) this).anIntArray9413
				       [((Class171) class171).anInt2067])
				    + (((Class89_Sub2) this).anIntArray9413
				       [((Class171) class171).anInt2068]))
			   * 0.3333333F);
		    float f_2418_ = (class268.aFloatArray4353[0] * f
				     + class268.aFloatArray4353[4] * f_2416_
				     + class268.aFloatArray4353[8] * f_2417_
				     + class268.aFloatArray4353[12]);
		    float f_2419_ = (class268.aFloatArray4353[1] * f
				     + class268.aFloatArray4353[5] * f_2416_
				     + class268.aFloatArray4353[9] * f_2417_
				     + class268.aFloatArray4353[13]);
		    float f_2420_ = (class268.aFloatArray4353[2] * f
				     + class268.aFloatArray4353[6] * f_2416_
				     + class268.aFloatArray4353[10] * f_2417_
				     + class268.aFloatArray4353[14]);
		    float f_2421_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2418_ * f_2418_
							  + f_2419_ * f_2419_
							  + (f_2420_
							     * f_2420_))))
			   * (float) ((Class171) class171).anInt2075);
		    class268_2415_.method5232
			(((Class140) class140).anInt1625,
			 (((Class140) class140).anInt1626
			  * ((Class171) class171).aShort2070) >> 7,
			 (((Class140) class140).anInt1627
			  * ((Class171) class171).aShort2074) >> 7,
			 (f_2418_ + (float) ((Class140) class140).anInt1628
			  - f_2418_ * f_2421_),
			 (f_2419_ + (float) ((Class140) class140).anInt1629
			  - f_2419_ * f_2421_),
			 f_2420_ - f_2420_ * f_2421_);
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15143(class268_2415_);
		    int i_2422_ = ((Class140) class140).anInt1630;
		    OpenGL.glColor4ub((byte) (i_2422_ >> 16),
				      (byte) (i_2422_ >> 8), (byte) i_2422_,
				      (byte) (i_2422_ >> 24));
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15173(((Class171) class171).aShort2073);
		    ((Class89_Sub2) this).aClass103_Sub1_9457
			.method15192(((Class171) class171).aByte2066);
		    ((Class89_Sub2) this).aClass103_Sub1_9457.method15169(7, 0,
									  4);
		}
	    }
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method2308(true);
	    ((Class89_Sub2) this).aClass103_Sub1_9457.method15144();
	}
    }
    
    void method15574(boolean bool) {
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .aClass241_Sub3_Sub2_9231.payload).length
	    < ((Class89_Sub2) this).anInt9441 * 6)
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.aClass241_Sub3_Sub2_9231
		= new Class241_Sub3_Sub2((((Class89_Sub2) this).anInt9441
					  + 100) * 6);
	else
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.aClass241_Sub3_Sub2_9231.pointer
		= 0;
	Class241_Sub3_Sub2 class241_sub3_sub2
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass241_Sub3_Sub2_9231);
	if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	    .aBool9144) {
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9428[i]),
					       -484048531);
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9462[i]),
					       -484048531);
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9407[i]),
					       -484048531);
	    }
	} else {
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9428[i]),
					       (byte) -82);
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9462[i]),
					       (byte) 34);
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9407[i]),
					       (byte) 42);
	    }
	}
	if (class241_sub3_sub2.pointer * 421967667 != 0) {
	    if (bool) {
		if (((Class89_Sub2) this).anInterface14_9439 == null)
		    ((Class89_Sub2) this).anInterface14_9439
			= (((Class89_Sub2) this).aClass103_Sub1_9457
			       .method15200
			   (5123, class241_sub3_sub2.payload,
			    class241_sub3_sub2.pointer * 421967667, true));
		else
		    ((Class89_Sub2) this).anInterface14_9439.method99
			(5123, class241_sub3_sub2.payload,
			 class241_sub3_sub2.pointer * 421967667);
		((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692
		    = ((Class89_Sub2) this).anInterface14_9439;
	    } else
		((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692
		    = (((Class89_Sub2) this).aClass103_Sub1_9457.method15200
		       (5123, class241_sub3_sub2.payload,
			class241_sub3_sub2.pointer * 421967667, false));
	    if (!bool)
		((Class89_Sub2) this).aBool9431 = true;
	}
    }
    
    public byte[] method1976() {
	return ((Class89_Sub2) this).aByteArray9408;
    }
    
    void method15575(boolean bool) {
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .aClass241_Sub3_Sub2_9231.payload).length
	    < ((Class89_Sub2) this).anInt9441 * 6)
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.aClass241_Sub3_Sub2_9231
		= new Class241_Sub3_Sub2((((Class89_Sub2) this).anInt9441
					  + 100) * 6);
	else
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.aClass241_Sub3_Sub2_9231.pointer
		= 0;
	Class241_Sub3_Sub2 class241_sub3_sub2
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass241_Sub3_Sub2_9231);
	if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	    .aBool9144) {
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9428[i]),
					       -484048531);
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9462[i]),
					       -484048531);
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9407[i]),
					       -484048531);
	    }
	} else {
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9428[i]),
					       (byte) 22);
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9462[i]),
					       (byte) 114);
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9407[i]),
					       (byte) -42);
	    }
	}
	if (class241_sub3_sub2.pointer * 421967667 != 0) {
	    if (bool) {
		if (((Class89_Sub2) this).anInterface14_9439 == null)
		    ((Class89_Sub2) this).anInterface14_9439
			= (((Class89_Sub2) this).aClass103_Sub1_9457
			       .method15200
			   (5123, class241_sub3_sub2.payload,
			    class241_sub3_sub2.pointer * 421967667, true));
		else
		    ((Class89_Sub2) this).anInterface14_9439.method99
			(5123, class241_sub3_sub2.payload,
			 class241_sub3_sub2.pointer * 421967667);
		((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692
		    = ((Class89_Sub2) this).anInterface14_9439;
	    } else
		((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692
		    = (((Class89_Sub2) this).aClass103_Sub1_9457.method15200
		       (5123, class241_sub3_sub2.payload,
			class241_sub3_sub2.pointer * 421967667, false));
	    if (!bool)
		((Class89_Sub2) this).aBool9431 = true;
	}
    }
    
    void method15576(boolean bool) {
	if ((((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	     .aClass241_Sub3_Sub2_9231.payload).length
	    < ((Class89_Sub2) this).anInt9441 * 6)
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.aClass241_Sub3_Sub2_9231
		= new Class241_Sub3_Sub2((((Class89_Sub2) this).anInt9441
					  + 100) * 6);
	else
	    ((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
		.aClass241_Sub3_Sub2_9231.pointer
		= 0;
	Class241_Sub3_Sub2 class241_sub3_sub2
	    = (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	       .aClass241_Sub3_Sub2_9231);
	if (((Class103_Sub1) ((Class89_Sub2) this).aClass103_Sub1_9457)
	    .aBool9144) {
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9428[i]),
					       -484048531);
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9462[i]),
					       -484048531);
		class241_sub3_sub2.writeShort((((Class89_Sub2) this)
						.aShortArray9407[i]),
					       -484048531);
	    }
	} else {
	    for (int i = 0; i < ((Class89_Sub2) this).anInt9441; i++) {
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9428[i]),
					       (byte) -93);
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9462[i]),
					       (byte) -23);
		class241_sub3_sub2.method14621((((Class89_Sub2) this)
						.aShortArray9407[i]),
					       (byte) -20);
	    }
	}
	if (class241_sub3_sub2.pointer * 421967667 != 0) {
	    if (bool) {
		if (((Class89_Sub2) this).anInterface14_9439 == null)
		    ((Class89_Sub2) this).anInterface14_9439
			= (((Class89_Sub2) this).aClass103_Sub1_9457
			       .method15200
			   (5123, class241_sub3_sub2.payload,
			    class241_sub3_sub2.pointer * 421967667, true));
		else
		    ((Class89_Sub2) this).anInterface14_9439.method99
			(5123, class241_sub3_sub2.payload,
			 class241_sub3_sub2.pointer * 421967667);
		((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692
		    = ((Class89_Sub2) this).anInterface14_9439;
	    } else
		((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692
		    = (((Class89_Sub2) this).aClass103_Sub1_9457.method15200
		       (5123, class241_sub3_sub2.payload,
			class241_sub3_sub2.pointer * 421967667, false));
	    if (!bool)
		((Class89_Sub2) this).aBool9431 = true;
	}
    }
    
    public void method1984(int i) {
	((Class89_Sub2) this).aShort9405 = (short) i;
	if (((Class89_Sub2) this).aClass151_9433 != null)
	    ((Class151) ((Class89_Sub2) this).aClass151_9433).anInterface8_1713
		= null;
    }
    
    static final int method15577(int i, int i_2423_) {
	i_2423_ = i_2423_ * (i & 0x7f) >> 7;
	if (i_2423_ < 2)
	    i_2423_ = 2;
	else if (i_2423_ > 126)
	    i_2423_ = 126;
	return (i & 0xff80) + i_2423_;
    }
    
    static final int method15578(int i, int i_2424_) {
	i_2424_ = i_2424_ * (i & 0x7f) >> 7;
	if (i_2424_ < 2)
	    i_2424_ = 2;
	else if (i_2424_ > 126)
	    i_2424_ = 126;
	return (i & 0xff80) + i_2424_;
    }
    
    static final int method15579(int i, int i_2425_) {
	i_2425_ = i_2425_ * (i & 0x7f) >> 7;
	if (i_2425_ < 2)
	    i_2425_ = 2;
	else if (i_2425_ > 126)
	    i_2425_ = 126;
	return (i & 0xff80) + i_2425_;
    }
    
    static final int method15580(int i, int i_2426_) {
	i_2426_ = i_2426_ * (i & 0x7f) >> 7;
	if (i_2426_ < 2)
	    i_2426_ = 2;
	else if (i_2426_ > 126)
	    i_2426_ = 126;
	return (i & 0xff80) + i_2426_;
    }
    
    public void method1949() {
	if (((Class89_Sub2) this).anInt9416 > 0
	    && ((Class89_Sub2) this).anInt9441 > 0) {
	    method15541(false);
	    if ((((Class89_Sub2) this).aByte9404 & 0x10) == 0
		&& (((Class146) ((Class89_Sub2) this).aClass146_9438)
		    .anInterface14_1692) == null)
		method15536(false);
	    method15544();
	}
    }
    
    public int method1862() {
	return ((Class89_Sub2) this).aShort9406;
    }
}
