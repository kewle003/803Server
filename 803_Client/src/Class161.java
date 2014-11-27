/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class161
{
    static final int anInt1786 = 26;
    public float[] aFloatArray1787;
    static final int anInt1788 = 1;
    public int anInt1789 = 12;
    public int anInt1790 = 0;
    public int[] anIntArray1791;
    public short[] aShortArray1792;
    public byte[] aByteArray1793;
    public byte[] aByteArray1794;
    public int[] anIntArray1795;
    public short[] aShortArray1796;
    public short[] aShortArray1797;
    int anInt1798;
    public int[] anIntArray1799;
    public float[] aFloatArray1800;
    static final int anInt1801 = 3;
    public int anInt1802;
    public byte[] aByteArray1803;
    public short[] aShortArray1804;
    public int anInt1805 = 0;
    public int[] anIntArray1806;
    public byte[] aByteArray1807;
    public byte[] aByteArray1808;
    public byte[] aByteArray1809;
    public short[] aShortArray1810;
    public short[] aShortArray1811;
    public short[] aShortArray1812;
    public int[] anIntArray1813;
    public int[] anIntArray1814;
    byte aByte1815;
    public int[] anIntArray1816;
    public static final short aShort1817 = -1;
    public short[] aShortArray1818;
    int anInt1819;
    public byte[] aByteArray1820;
    public short[] aShortArray1821;
    public short[] aShortArray1822;
    public short[] aShortArray1823;
    public int[] anIntArray1824;
    public int[] anIntArray1825;
    public int[] anIntArray1826;
    public byte[] aByteArray1827;
    public int[] anIntArray1828;
    public static final short aShort1829 = 32766;
    byte[] aByteArray1830;
    public int[] anIntArray1831;
    public Class106[] aClass106Array1832;
    public Class167[] aClass167Array1833;
    public Class95[] aClass95Array1834;
    
    public void method3446(float f) {
	for (int i = 0; i < anInt1790; i++) {
	    anIntArray1831[i] *= f;
	    anIntArray1791[i] *= f;
	    anIntArray1816[i] *= f;
	}
	if (((Class161) this).anInt1819 > 0 && anIntArray1824 != null) {
	    for (int i = 0; i < anIntArray1824.length; i++) {
		anIntArray1824[i] *= f;
		anIntArray1825[i] *= f;
		if (aByteArray1820[i] != 1)
		    anIntArray1826[i] *= f;
	    }
	}
    }
    
    public Class161(Class161[] class161s, int i) {
	anInt1802 = 0;
	((Class161) this).aByte1815 = (byte) 0;
	((Class161) this).anInt1819 = 0;
	anInt1790 = 0;
	anInt1802 = 0;
	((Class161) this).anInt1819 = 0;
	((Class161) this).anInt1798 = 0;
	int i_0_ = 0;
	int i_1_ = 0;
	int i_2_ = 0;
	boolean bool = false;
	boolean bool_3_ = false;
	boolean bool_4_ = false;
	boolean bool_5_ = false;
	boolean bool_6_ = false;
	boolean bool_7_ = false;
	((Class161) this).aByte1815 = (byte) -1;
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    Class161 class161_9_ = class161s[i_8_];
	    if (class161_9_ != null) {
		anInt1790 += class161_9_.anInt1790;
		anInt1802 += class161_9_.anInt1802;
		((Class161) this).anInt1819
		    += ((Class161) class161_9_).anInt1819;
		((Class161) this).anInt1798
		    += ((Class161) class161_9_).anInt1798;
		if (class161_9_.aClass106Array1832 != null)
		    i_0_ += class161_9_.aClass106Array1832.length;
		if (class161_9_.aClass167Array1833 != null)
		    i_1_ += class161_9_.aClass167Array1833.length;
		if (class161_9_.aClass95Array1834 != null)
		    i_2_ += class161_9_.aClass95Array1834.length;
		bool = bool | class161_9_.aByteArray1808 != null;
		if (class161_9_.aByteArray1809 != null)
		    bool_3_ = true;
		else {
		    if (((Class161) this).aByte1815 == -1)
			((Class161) this).aByte1815
			    = ((Class161) class161_9_).aByte1815;
		    if (((Class161) this).aByte1815
			!= ((Class161) class161_9_).aByte1815)
			bool_3_ = true;
		}
		bool_4_ = bool_4_ | class161_9_.aByteArray1793 != null;
		bool_5_ = bool_5_ | class161_9_.aShortArray1811 != null;
		bool_6_ = bool_6_ | class161_9_.aShortArray1792 != null;
		bool_7_ = bool_7_ | class161_9_.anIntArray1814 != null;
	    }
	}
	anIntArray1831 = new int[anInt1790];
	anIntArray1791 = new int[anInt1790];
	anIntArray1816 = new int[anInt1790];
	anIntArray1799 = new int[anInt1790];
	aShortArray1797 = new short[anInt1790];
	aShortArray1818 = new short[anInt1802];
	aShortArray1796 = new short[anInt1802];
	aShortArray1804 = new short[anInt1802];
	if (bool)
	    aByteArray1808 = new byte[anInt1802];
	if (bool_3_)
	    aByteArray1809 = new byte[anInt1802];
	if (bool_4_)
	    aByteArray1793 = new byte[anInt1802];
	if (bool_5_)
	    aShortArray1811 = new short[anInt1802];
	aShortArray1812 = new short[anInt1802];
	if (bool_6_)
	    aShortArray1792 = new short[anInt1802];
	if (bool_7_)
	    anIntArray1814 = new int[anInt1802];
	aShortArray1810 = new short[anInt1802];
	if (((Class161) this).anInt1819 > 0) {
	    aByteArray1820 = new byte[((Class161) this).anInt1819];
	    aShortArray1821 = new short[((Class161) this).anInt1819];
	    aShortArray1822 = new short[((Class161) this).anInt1819];
	    aShortArray1823 = new short[((Class161) this).anInt1819];
	    anIntArray1824 = new int[((Class161) this).anInt1819];
	    anIntArray1825 = new int[((Class161) this).anInt1819];
	    anIntArray1826 = new int[((Class161) this).anInt1819];
	    ((Class161) this).aByteArray1830
		= new byte[((Class161) this).anInt1819];
	    aByteArray1827 = new byte[((Class161) this).anInt1819];
	    anIntArray1813 = new int[((Class161) this).anInt1819];
	    anIntArray1828 = new int[((Class161) this).anInt1819];
	    anIntArray1806 = new int[((Class161) this).anInt1819];
	}
	if (i_2_ > 0)
	    aClass95Array1834 = new Class95[i_2_];
	if (i_0_ > 0)
	    aClass106Array1832 = new Class106[i_0_];
	if (i_1_ > 0)
	    aClass167Array1833 = new Class167[i_1_];
	if (((Class161) this).anInt1798 > 0) {
	    aFloatArray1787 = new float[((Class161) this).anInt1798];
	    aFloatArray1800 = new float[((Class161) this).anInt1798];
	    anIntArray1795 = new int[anInt1790];
	    aByteArray1803 = new byte[anInt1802];
	    aByteArray1794 = new byte[anInt1802];
	    aByteArray1807 = new byte[anInt1802];
	}
	int[] is = new int[anInt1790];
	int[] is_10_ = new int[((Class161) this).anInt1798];
	int[] is_11_ = new int[anInt1790];
	int[] is_12_ = new int[anInt1790];
	int[] is_13_ = new int[3];
	anInt1790 = 0;
	anInt1802 = 0;
	((Class161) this).anInt1819 = 0;
	((Class161) this).anInt1798 = 0;
	i_0_ = 0;
	i_1_ = 0;
	i_2_ = 0;
	for (int i_14_ = 0; i_14_ < i; i_14_++) {
	    short i_15_ = (short) (1 << i_14_);
	    Class161 class161_16_ = class161s[i_14_];
	    int i_17_ = anInt1802;
	    if (class161_16_ != null) {
		if (class161_16_.aClass95Array1834 != null) {
		    for (int i_18_ = 0;
			 i_18_ < class161_16_.aClass95Array1834.length;
			 i_18_++) {
			Class95 class95
			    = class161_16_.aClass95Array1834[i_18_];
			aClass95Array1834[i_2_++]
			    = class95.method2100((class95.anInt1328 * 855950689
						  + anInt1802),
						 112936250);
		    }
		}
		for (int i_19_ = 0; i_19_ < class161_16_.anInt1802; i_19_++) {
		    is_13_[0] = class161_16_.aShortArray1818[i_19_];
		    is_13_[1] = class161_16_.aShortArray1796[i_19_];
		    is_13_[2] = class161_16_.aShortArray1804[i_19_];
		    for (int i_20_ = 0; i_20_ < 3; i_20_++) {
			int i_21_ = is_13_[i_20_];
			int i_22_ = class161_16_.anIntArray1831[i_21_];
			int i_23_ = class161_16_.anIntArray1791[i_21_];
			int i_24_ = class161_16_.anIntArray1816[i_21_];
			int i_25_;
			for (i_25_ = 0; i_25_ < anInt1790; i_25_++) {
			    if (i_22_ == anIntArray1831[i_25_]
				&& i_23_ == anIntArray1791[i_25_]
				&& i_24_ == anIntArray1816[i_25_]) {
				aShortArray1797[i_25_] |= i_15_;
				is_11_[i_21_] = i_25_;
				break;
			    }
			}
			if (i_25_ >= anInt1790) {
			    if (((Class161) class161_16_).anInt1798 > 0) {
				int i_26_
				    = ((i_21_ < class161_16_.anInt1790 - 1
					? (class161_16_.anIntArray1795
					   [i_21_ + 1])
					: ((Class161) class161_16_).anInt1798)
				       - class161_16_.anIntArray1795[i_21_]);
				for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
				    aFloatArray1787[(((Class161) this)
						     .anInt1798)]
					= (class161_16_.aFloatArray1787
					   [(class161_16_.anIntArray1795[i_21_]
					     + i_27_)]);
				    aFloatArray1800[(((Class161) this)
						     .anInt1798)]
					= (class161_16_.aFloatArray1800
					   [(class161_16_.anIntArray1795[i_21_]
					     + i_27_)]);
				    is_10_[((Class161) this).anInt1798]
					= i_25_ << 16 | is[i_25_] + i_27_;
				    ((Class161) this).anInt1798++;
				}
				is_12_[i_21_] = is[i_25_];
				is[i_25_] += i_26_;
			    }
			    anIntArray1831[anInt1790] = i_22_;
			    anIntArray1791[anInt1790] = i_23_;
			    anIntArray1816[anInt1790] = i_24_;
			    aShortArray1797[anInt1790] = i_15_;
			    anIntArray1799[anInt1790]
				= (class161_16_.anIntArray1799 != null
				   ? class161_16_.anIntArray1799[i_21_] : -1);
			    is_11_[i_21_] = anInt1790;
			    anInt1790++;
			}
		    }
		}
		for (int i_28_ = 0; i_28_ < class161_16_.anInt1802; i_28_++) {
		    if (bool && class161_16_.aByteArray1808 != null)
			aByteArray1808[anInt1802]
			    = class161_16_.aByteArray1808[i_28_];
		    if (bool_3_) {
			if (class161_16_.aByteArray1809 != null)
			    aByteArray1809[anInt1802]
				= class161_16_.aByteArray1809[i_28_];
			else
			    aByteArray1809[anInt1802]
				= ((Class161) class161_16_).aByte1815;
		    }
		    if (bool_4_ && class161_16_.aByteArray1793 != null)
			aByteArray1793[anInt1802]
			    = class161_16_.aByteArray1793[i_28_];
		    if (bool_6_) {
			if (class161_16_.aShortArray1792 != null)
			    aShortArray1792[anInt1802]
				= class161_16_.aShortArray1792[i_28_];
			else
			    aShortArray1792[anInt1802] = (short) -1;
		    }
		    if (bool_7_) {
			if (class161_16_.anIntArray1814 != null)
			    anIntArray1814[anInt1802]
				= class161_16_.anIntArray1814[i_28_];
			else
			    anIntArray1814[anInt1802] = -1;
		    }
		    if (((Class161) class161_16_).anInt1798 > 0) {
			aByteArray1803[anInt1802]
			    = (byte) (class161_16_.aByteArray1803[i_28_]
				      + is_12_[(class161_16_.aShortArray1818
						[i_28_])]);
			aByteArray1794[anInt1802]
			    = (byte) (class161_16_.aByteArray1794[i_28_]
				      + is_12_[(class161_16_.aShortArray1796
						[i_28_])]);
			aByteArray1807[anInt1802]
			    = (byte) (class161_16_.aByteArray1807[i_28_]
				      + is_12_[(class161_16_.aShortArray1804
						[i_28_])]);
		    }
		    aShortArray1818[anInt1802]
			= (short) is_11_[class161_16_.aShortArray1818[i_28_]];
		    aShortArray1796[anInt1802]
			= (short) is_11_[class161_16_.aShortArray1796[i_28_]];
		    aShortArray1804[anInt1802]
			= (short) is_11_[class161_16_.aShortArray1804[i_28_]];
		    aShortArray1810[anInt1802] = i_15_;
		    aShortArray1812[anInt1802]
			= class161_16_.aShortArray1812[i_28_];
		    anInt1802++;
		}
		if (class161_16_.aClass106Array1832 != null) {
		    for (int i_29_ = 0;
			 i_29_ < class161_16_.aClass106Array1832.length;
			 i_29_++) {
			int i_30_ = is_11_[(class161_16_.aClass106Array1832
					    [i_29_].anInt1490) * 844698029];
			int i_31_ = is_11_[(class161_16_.aClass106Array1832
					    [i_29_].anInt1491) * -142222581];
			int i_32_ = is_11_[(class161_16_.aClass106Array1832
					    [i_29_].anInt1492) * 1756482407];
			aClass106Array1832[i_0_]
			    = (class161_16_.aClass106Array1832[i_29_]
				   .method2666
			       ((class161_16_.aClass106Array1832[i_29_]
				 .anInt1489) * -143674399 + i_17_,
				i_30_, i_31_, i_32_, (byte) -26));
			i_0_++;
		    }
		}
		if (class161_16_.aClass167Array1833 != null) {
		    for (int i_33_ = 0;
			 i_33_ < class161_16_.aClass167Array1833.length;
			 i_33_++) {
			int i_34_ = is_11_[(class161_16_.aClass167Array1833
					    [i_33_].anInt2058) * 294413539];
			aClass167Array1833[i_1_]
			    = class161_16_.aClass167Array1833[i_33_]
				  .method3595(i_34_, -1942747345);
			i_1_++;
		    }
		}
	    }
	}
	anInt1805 = anInt1790;
	if (((Class161) this).anInt1798 > 0) {
	    Class26.method946(is_10_, aFloatArray1787, aFloatArray1800,
			      (byte) -38);
	    int i_35_ = 0;
	    int i_36_ = 0;
	    for (/**/; i_35_ < anInt1790; i_35_++) {
		anIntArray1795[i_35_] = i_36_;
		i_36_ += is[i_35_];
	    }
	}
	int i_37_ = 0;
	int i_38_ = 0;
	for (/**/; i_37_ < i; i_37_++) {
	    short i_39_ = (short) (1 << i_37_);
	    Class161 class161_40_ = class161s[i_37_];
	    if (class161_40_ != null) {
		if (bool_5_) {
		    int i_41_ = 0;
		    while (i_41_ < class161_40_.anInt1802) {
			aShortArray1811[i_38_]
			    = (class161_40_.aShortArray1811 != null
			       ? class161_40_.aShortArray1811[i_41_]
			       : (short) -1);
			if (aShortArray1811[i_38_] > -1
			    && aShortArray1811[i_38_] < 32766)
			    aShortArray1811[i_38_]
				= (short) (aShortArray1811[i_38_]
					   + ((Class161) this).anInt1819);
			i_41_++;
			i_38_++;
		    }
		}
		for (int i_42_ = 0;
		     i_42_ < ((Class161) class161_40_).anInt1819; i_42_++) {
		    byte i_43_ = (aByteArray1820[((Class161) this).anInt1819]
				  = class161_40_.aByteArray1820[i_42_]);
		    if (i_43_ == 0) {
			aShortArray1821[((Class161) this).anInt1819]
			    = (short) method3449(class161_40_,
						 (class161_40_.aShortArray1821
						  [i_42_]),
						 i_39_);
			aShortArray1822[((Class161) this).anInt1819]
			    = (short) method3449(class161_40_,
						 (class161_40_.aShortArray1822
						  [i_42_]),
						 i_39_);
			aShortArray1823[((Class161) this).anInt1819]
			    = (short) method3449(class161_40_,
						 (class161_40_.aShortArray1823
						  [i_42_]),
						 i_39_);
		    } else if (i_43_ >= 1 && i_43_ <= 3) {
			aShortArray1821[((Class161) this).anInt1819]
			    = class161_40_.aShortArray1821[i_42_];
			aShortArray1822[((Class161) this).anInt1819]
			    = class161_40_.aShortArray1822[i_42_];
			aShortArray1823[((Class161) this).anInt1819]
			    = class161_40_.aShortArray1823[i_42_];
			anIntArray1824[((Class161) this).anInt1819]
			    = class161_40_.anIntArray1824[i_42_];
			anIntArray1825[((Class161) this).anInt1819]
			    = class161_40_.anIntArray1825[i_42_];
			anIntArray1826[((Class161) this).anInt1819]
			    = class161_40_.anIntArray1826[i_42_];
			((Class161) this).aByteArray1830[(((Class161) this)
							  .anInt1819)]
			    = ((Class161) class161_40_).aByteArray1830[i_42_];
			aByteArray1827[((Class161) this).anInt1819]
			    = class161_40_.aByteArray1827[i_42_];
			anIntArray1813[((Class161) this).anInt1819]
			    = class161_40_.anIntArray1813[i_42_];
		    } else if (i_43_ == 2) {
			anIntArray1828[((Class161) this).anInt1819]
			    = class161_40_.anIntArray1828[i_42_];
			anIntArray1806[((Class161) this).anInt1819]
			    = class161_40_.anIntArray1806[i_42_];
		    }
		    ((Class161) this).anInt1819++;
		}
	    }
	}
    }
    
    public void method3447(short i, short i_44_) {
	if (aShortArray1792 != null) {
	    for (int i_45_ = 0; i_45_ < anInt1802; i_45_++) {
		if (aShortArray1792[i_45_] == i)
		    aShortArray1792[i_45_] = i_44_;
	    }
	}
    }
    
    public static Class161 method3448(JS5 class210, int i, int i_46_) {
	byte[] is = class210.getfile(i, i_46_, -588753512);
	if (is == null)
	    return null;
	return new Class161(is);
    }
    
    final int method3449(Class161 class161_47_, int i, short i_48_) {
	int i_49_ = class161_47_.anIntArray1831[i];
	int i_50_ = class161_47_.anIntArray1791[i];
	int i_51_ = class161_47_.anIntArray1816[i];
	for (int i_52_ = 0; i_52_ < anInt1790; i_52_++) {
	    if (i_49_ == anIntArray1831[i_52_]
		&& i_50_ == anIntArray1791[i_52_]
		&& i_51_ == anIntArray1816[i_52_]) {
		aShortArray1797[i_52_] |= i_48_;
		return i_52_;
	    }
	}
	anIntArray1831[anInt1790] = i_49_;
	anIntArray1791[anInt1790] = i_50_;
	anIntArray1816[anInt1790] = i_51_;
	aShortArray1797[anInt1790] = i_48_;
	anIntArray1799[anInt1790] = (class161_47_.anIntArray1799 != null
				     ? class161_47_.anIntArray1799[i] : -1);
	return anInt1790++;
    }
    
    void method3450(RSByteBuffer class241_sub3,
		    RSByteBuffer class241_sub3_53_,
		    RSByteBuffer class241_sub3_54_) {
	short i = 0;
	short i_55_ = 0;
	short i_56_ = 0;
	int i_57_ = 0;
	for (int i_58_ = 0; i_58_ < anInt1802; i_58_++) {
	    int i_59_ = class241_sub3_53_.readUnsignedByte((byte) -8);
	    int i_60_ = i_59_ & 0x7;
	    if (i_60_ == 1) {
		aShortArray1818[i_58_] = i
		    = (short) (class241_sub3.readSmart49152(-321353313) + i_57_);
		i_57_ = i;
		aShortArray1796[i_58_] = i_55_
		    = (short) (class241_sub3.readSmart49152(94808518) + i_57_);
		i_57_ = i_55_;
		aShortArray1804[i_58_] = i_56_
		    = (short) (class241_sub3.readSmart49152(-1761317080) + i_57_);
		i_57_ = i_56_;
		if (i > anInt1805)
		    anInt1805 = i;
		if (i_55_ > anInt1805)
		    anInt1805 = i_55_;
		if (i_56_ > anInt1805)
		    anInt1805 = i_56_;
	    }
	    if (i_60_ == 2) {
		i_55_ = i_56_;
		i_56_
		    = (short) (class241_sub3.readSmart49152(-1793347291) + i_57_);
		i_57_ = i_56_;
		aShortArray1818[i_58_] = i;
		aShortArray1796[i_58_] = i_55_;
		aShortArray1804[i_58_] = i_56_;
		if (i_56_ > anInt1805)
		    anInt1805 = i_56_;
	    }
	    if (i_60_ == 3) {
		i = i_56_;
		i_56_
		    = (short) (class241_sub3.readSmart49152(1022386900) + i_57_);
		i_57_ = i_56_;
		aShortArray1818[i_58_] = i;
		aShortArray1796[i_58_] = i_55_;
		aShortArray1804[i_58_] = i_56_;
		if (i_56_ > anInt1805)
		    anInt1805 = i_56_;
	    }
	    if (i_60_ == 4) {
		short i_61_ = i;
		i = i_55_;
		i_55_ = i_61_;
		i_56_
		    = (short) (class241_sub3.readSmart49152(1331613634) + i_57_);
		i_57_ = i_56_;
		aShortArray1818[i_58_] = i;
		aShortArray1796[i_58_] = i_55_;
		aShortArray1804[i_58_] = i_56_;
		if (i_56_ > anInt1805)
		    anInt1805 = i_56_;
	    }
	    if (((Class161) this).anInt1798 > 0 && (i_59_ & 0x8) != 0) {
		aByteArray1803[i_58_]
		    = (byte) class241_sub3_54_.readUnsignedByte((byte) 42);
		aByteArray1794[i_58_]
		    = (byte) class241_sub3_54_.readUnsignedByte((byte) -115);
		aByteArray1807[i_58_]
		    = (byte) class241_sub3_54_.readUnsignedByte((byte) 63);
	    }
	}
	anInt1805++;
    }
    
    Class161(byte[] is) {
	anInt1802 = 0;
	((Class161) this).aByte1815 = (byte) 0;
	((Class161) this).anInt1819 = 0;
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	RSByteBuffer class241_sub3_62_ = new RSByteBuffer(is);
	RSByteBuffer class241_sub3_63_ = new RSByteBuffer(is);
	RSByteBuffer class241_sub3_64_ = new RSByteBuffer(is);
	RSByteBuffer class241_sub3_65_ = new RSByteBuffer(is);
	RSByteBuffer class241_sub3_66_ = new RSByteBuffer(is);
	RSByteBuffer class241_sub3_67_ = new RSByteBuffer(is);
	int i = class241_sub3.readUnsignedByte((byte) 47);
	if (i != 1)
	    System.out
		.println(new StringBuilder().append("").append(i).toString());
	else {
	    class241_sub3.readUnsignedByte((byte) 16);
	    anInt1789 = class241_sub3.readUnsignedByte((byte) -23);
	    class241_sub3.pointer = (is.length - 26) * -681042949;
	    anInt1790 = class241_sub3.readUnsignedShort(1162222719);
	    anInt1802 = class241_sub3.readUnsignedShort(1162222719);
	    ((Class161) this).anInt1819
		= class241_sub3.readUnsignedShort(1162222719);
	    int i_68_ = class241_sub3.readUnsignedByte((byte) -70);
	    boolean bool = (i_68_ & 0x1) == 1;
	    boolean bool_69_ = (i_68_ & 0x2) == 2;
	    boolean bool_70_ = (i_68_ & 0x4) == 4;
	    boolean bool_71_ = (i_68_ & 0x10) == 16;
	    boolean bool_72_ = (i_68_ & 0x20) == 32;
	    boolean bool_73_ = (i_68_ & 0x40) == 64;
	    boolean bool_74_ = (i_68_ & 0x80) == 128;
	    int i_75_ = class241_sub3.readUnsignedByte((byte) -27);
	    int i_76_ = class241_sub3.readUnsignedByte((byte) 65);
	    int i_77_ = class241_sub3.readUnsignedByte((byte) 17);
	    int i_78_ = class241_sub3.readUnsignedByte((byte) -54);
	    int i_79_ = class241_sub3.readUnsignedByte((byte) -106);
	    int i_80_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_81_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_82_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_83_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_84_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_85_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_86_ = class241_sub3.readUnsignedShort(1162222719);
	    if (!bool_71_) {
		if (i_79_ == 1)
		    i_85_ = anInt1790;
		else
		    i_85_ = 0;
	    }
	    if (!bool_72_) {
		if (i_77_ == 1)
		    i_86_ = anInt1802;
		else
		    i_86_ = 0;
	    }
	    int i_87_ = 0;
	    int i_88_ = 0;
	    int i_89_ = 0;
	    if (((Class161) this).anInt1819 > 0) {
		aByteArray1820 = new byte[((Class161) this).anInt1819];
		class241_sub3.pointer = -2043128847;
		for (int i_90_ = 0; i_90_ < ((Class161) this).anInt1819;
		     i_90_++) {
		    byte i_91_ = (aByteArray1820[i_90_]
				  = class241_sub3.getByte(839221653));
		    if (i_91_ == 0)
			i_87_++;
		    if (i_91_ >= 1 && i_91_ <= 3)
			i_88_++;
		    if (i_91_ == 2)
			i_89_++;
		}
	    }
	    int i_92_ = 3 + ((Class161) this).anInt1819;
	    int i_93_ = i_92_;
	    i_92_ += anInt1790;
	    int i_94_ = i_92_;
	    if (bool)
		i_92_ += anInt1802;
	    int i_95_ = i_92_;
	    i_92_ += anInt1802;
	    int i_96_ = i_92_;
	    if (i_75_ == 255)
		i_92_ += anInt1802;
	    int i_97_ = i_92_;
	    i_92_ += i_86_;
	    int i_98_ = i_92_;
	    i_92_ += i_85_;
	    int i_99_ = i_92_;
	    if (i_76_ == 1)
		i_92_ += anInt1802;
	    int i_100_ = i_92_;
	    i_92_ += i_83_;
	    int i_101_ = i_92_;
	    if (i_78_ == 1)
		i_92_ += anInt1802 * 2;
	    int i_102_ = i_92_;
	    i_92_ += i_84_;
	    int i_103_ = i_92_;
	    i_92_ += anInt1802 * 2;
	    int i_104_ = i_92_;
	    i_92_ += i_80_;
	    int i_105_ = i_92_;
	    i_92_ += i_81_;
	    int i_106_ = i_92_;
	    i_92_ += i_82_;
	    int i_107_ = i_92_;
	    i_92_ += i_87_ * 6;
	    int i_108_ = i_92_;
	    i_92_ += i_88_ * 6;
	    int i_109_ = 6;
	    if (anInt1789 == 14)
		i_109_ = 7;
	    else if (anInt1789 >= 15)
		i_109_ = 9;
	    int i_110_ = i_92_;
	    i_92_ += i_88_ * i_109_;
	    int i_111_ = i_92_;
	    i_92_ += i_88_;
	    int i_112_ = i_92_;
	    i_92_ += i_88_;
	    int i_113_ = i_92_;
	    i_92_ += i_88_ + i_89_ * 2;
	    int i_114_ = i_92_;
	    int i_115_ = is.length;
	    int i_116_ = is.length;
	    int i_117_ = is.length;
	    int i_118_ = is.length;
	    if (bool_74_) {
		RSByteBuffer class241_sub3_119_ = new RSByteBuffer(is);
		class241_sub3_119_.pointer = (is.length - 26) * -681042949;
		class241_sub3_119_.pointer
		    -= (is[class241_sub3_119_.pointer * 421967667 - 1]
			* -681042949);
		((Class161) this).anInt1798
		    = class241_sub3_119_.readUnsignedShort(1162222719);
		int i_120_ = class241_sub3_119_.readUnsignedShort(1162222719);
		int i_121_ = class241_sub3_119_.readUnsignedShort(1162222719);
		i_115_ = i_114_ + i_120_;
		i_116_ = i_115_ + i_121_;
		i_117_ = i_116_ + anInt1790;
		i_118_ = i_117_ + ((Class161) this).anInt1798 * 2;
	    }
	    anIntArray1831 = new int[anInt1790];
	    anIntArray1791 = new int[anInt1790];
	    anIntArray1816 = new int[anInt1790];
	    aShortArray1818 = new short[anInt1802];
	    aShortArray1796 = new short[anInt1802];
	    aShortArray1804 = new short[anInt1802];
	    if (i_79_ == 1)
		anIntArray1799 = new int[anInt1790];
	    if (bool)
		aByteArray1808 = new byte[anInt1802];
	    if (i_75_ == 255)
		aByteArray1809 = new byte[anInt1802];
	    else
		((Class161) this).aByte1815 = (byte) i_75_;
	    if (i_76_ == 1)
		aByteArray1793 = new byte[anInt1802];
	    if (i_77_ == 1)
		anIntArray1814 = new int[anInt1802];
	    if (i_78_ == 1)
		aShortArray1792 = new short[anInt1802];
	    if (i_78_ == 1 && (((Class161) this).anInt1819 > 0
			       || ((Class161) this).anInt1798 > 0))
		aShortArray1811 = new short[anInt1802];
	    aShortArray1812 = new short[anInt1802];
	    if (((Class161) this).anInt1819 > 0) {
		aShortArray1821 = new short[((Class161) this).anInt1819];
		aShortArray1822 = new short[((Class161) this).anInt1819];
		aShortArray1823 = new short[((Class161) this).anInt1819];
		if (i_88_ > 0) {
		    anIntArray1824 = new int[i_88_];
		    anIntArray1825 = new int[i_88_];
		    anIntArray1826 = new int[i_88_];
		    ((Class161) this).aByteArray1830 = new byte[i_88_];
		    aByteArray1827 = new byte[i_88_];
		    anIntArray1813 = new int[i_88_];
		}
		if (i_89_ > 0) {
		    anIntArray1828 = new int[i_89_];
		    anIntArray1806 = new int[i_89_];
		}
	    }
	    class241_sub3.pointer = i_93_ * -681042949;
	    class241_sub3_62_.pointer = i_104_ * -681042949;
	    class241_sub3_63_.pointer = i_105_ * -681042949;
	    class241_sub3_64_.pointer = i_106_ * -681042949;
	    class241_sub3_65_.pointer = i_98_ * -681042949;
	    int i_122_ = 0;
	    int i_123_ = 0;
	    int i_124_ = 0;
	    for (int i_125_ = 0; i_125_ < anInt1790; i_125_++) {
		int i_126_ = class241_sub3.readUnsignedByte((byte) 30);
		int i_127_ = 0;
		if ((i_126_ & 0x1) != 0)
		    i_127_ = class241_sub3_62_.readSmart49152(-1749406286);
		int i_128_ = 0;
		if ((i_126_ & 0x2) != 0)
		    i_128_ = class241_sub3_63_.readSmart49152(1539434273);
		int i_129_ = 0;
		if ((i_126_ & 0x4) != 0)
		    i_129_ = class241_sub3_64_.readSmart49152(-1391105552);
		anIntArray1831[i_125_] = i_122_ + i_127_;
		anIntArray1791[i_125_] = i_123_ + i_128_;
		anIntArray1816[i_125_] = i_124_ + i_129_;
		i_122_ = anIntArray1831[i_125_];
		i_123_ = anIntArray1791[i_125_];
		i_124_ = anIntArray1816[i_125_];
		if (i_79_ == 1) {
		    if (bool_71_)
			anIntArray1799[i_125_]
			    = class241_sub3_65_.method14638(-1822151255);
		    else {
			anIntArray1799[i_125_]
			    = class241_sub3_65_.readUnsignedByte((byte) -94);
			if (anIntArray1799[i_125_] == 255)
			    anIntArray1799[i_125_] = -1;
		    }
		}
	    }
	    if (((Class161) this).anInt1798 > 0) {
		class241_sub3.pointer = i_116_ * -681042949;
		class241_sub3_62_.pointer = i_117_ * -681042949;
		class241_sub3_63_.pointer = i_118_ * -681042949;
		anIntArray1795 = new int[anInt1790];
		int i_130_ = 0;
		int i_131_ = 0;
		for (/**/; i_130_ < anInt1790; i_130_++) {
		    anIntArray1795[i_130_] = i_131_;
		    i_131_ += class241_sub3.readUnsignedByte((byte) -78);
		}
		aByteArray1803 = new byte[anInt1802];
		aByteArray1794 = new byte[anInt1802];
		aByteArray1807 = new byte[anInt1802];
		aFloatArray1787 = new float[((Class161) this).anInt1798];
		aFloatArray1800 = new float[((Class161) this).anInt1798];
		for (i_130_ = 0; i_130_ < ((Class161) this).anInt1798;
		     i_130_++) {
		    aFloatArray1787[i_130_]
			= ((float) class241_sub3_62_.readShort((byte) 44)
			   / 4096.0F);
		    aFloatArray1800[i_130_]
			= ((float) class241_sub3_63_.readShort((byte) 106)
			   / 4096.0F);
		}
	    }
	    class241_sub3.pointer = i_103_ * -681042949;
	    class241_sub3_62_.pointer = i_94_ * -681042949;
	    class241_sub3_63_.pointer = i_96_ * -681042949;
	    class241_sub3_64_.pointer = i_99_ * -681042949;
	    class241_sub3_65_.pointer = i_97_ * -681042949;
	    class241_sub3_66_.pointer = i_101_ * -681042949;
	    class241_sub3_67_.pointer = i_102_ * -681042949;
	    for (int i_132_ = 0; i_132_ < anInt1802; i_132_++) {
		aShortArray1812[i_132_]
		    = (short) class241_sub3.readUnsignedShort(1162222719);
		if (bool)
		    aByteArray1808[i_132_]
			= class241_sub3_62_.getByte(929529789);
		if (i_75_ == 255)
		    aByteArray1809[i_132_]
			= class241_sub3_63_.getByte(27924449);
		if (i_76_ == 1)
		    aByteArray1793[i_132_]
			= class241_sub3_64_.getByte(422202210);
		if (i_77_ == 1) {
		    if (bool_72_)
			anIntArray1814[i_132_]
			    = class241_sub3_65_.method14638(1361268152);
		    else {
			anIntArray1814[i_132_]
			    = class241_sub3_65_.readUnsignedByte((byte) -73);
			if (anIntArray1814[i_132_] == 255)
			    anIntArray1814[i_132_] = -1;
		    }
		}
		if (i_78_ == 1)
		    aShortArray1792[i_132_]
			= (short) (class241_sub3_66_.readUnsignedShort(1162222719)
				   - 1);
		if (aShortArray1811 != null) {
		    if (aShortArray1792[i_132_] != -1) {
			if (anInt1789 >= 16)
			    aShortArray1811[i_132_]
				= (short) (class241_sub3_67_
					       .readSmart((short) -31869)
					   - 1);
			else
			    aShortArray1811[i_132_]
				= (short) (class241_sub3_67_
					       .readUnsignedByte((byte) -108)
					   - 1);
		    } else
			aShortArray1811[i_132_] = (short) -1;
		}
	    }
	    anInt1805 = -1;
	    class241_sub3.pointer = i_100_ * -681042949;
	    class241_sub3_62_.pointer = i_95_ * -681042949;
	    class241_sub3_63_.pointer = i_115_ * -681042949;
	    method3450(class241_sub3, class241_sub3_62_, class241_sub3_63_);
	    class241_sub3.pointer = i_107_ * -681042949;
	    class241_sub3_62_.pointer = i_108_ * -681042949;
	    class241_sub3_63_.pointer = i_110_ * -681042949;
	    class241_sub3_64_.pointer = i_111_ * -681042949;
	    class241_sub3_65_.pointer = i_112_ * -681042949;
	    class241_sub3_66_.pointer = i_113_ * -681042949;
	    method3461(class241_sub3, class241_sub3_62_, class241_sub3_63_,
		       class241_sub3_64_, class241_sub3_65_,
		       class241_sub3_66_);
	    class241_sub3.pointer = i_114_ * -681042949;
	    if (bool_69_) {
		int i_133_ = class241_sub3.readUnsignedByte((byte) -30);
		if (i_133_ > 0) {
		    aClass106Array1832 = new Class106[i_133_];
		    for (int i_134_ = 0; i_134_ < i_133_; i_134_++) {
			int i_135_ = class241_sub3.readUnsignedShort(1162222719);
			int i_136_ = class241_sub3.readUnsignedShort(1162222719);
			byte i_137_;
			if (i_75_ == 255)
			    i_137_ = aByteArray1809[i_136_];
			else
			    i_137_ = (byte) i_75_;
			aClass106Array1832[i_134_]
			    = new Class106(i_135_, i_136_,
					   aShortArray1818[i_136_],
					   aShortArray1796[i_136_],
					   aShortArray1804[i_136_], i_137_);
		    }
		}
		int i_138_ = class241_sub3.readUnsignedByte((byte) 98);
		if (i_138_ > 0) {
		    aClass167Array1833 = new Class167[i_138_];
		    for (int i_139_ = 0; i_139_ < i_138_; i_139_++) {
			int i_140_ = class241_sub3.readUnsignedShort(1162222719);
			int i_141_ = class241_sub3.readUnsignedShort(1162222719);
			aClass167Array1833[i_139_]
			    = new Class167(i_140_, i_141_);
		    }
		}
	    }
	    if (bool_70_) {
		int i_142_ = class241_sub3.readUnsignedByte((byte) 40);
		if (i_142_ > 0) {
		    aClass95Array1834 = new Class95[i_142_];
		    for (int i_143_ = 0; i_143_ < i_142_; i_143_++) {
			int i_144_ = class241_sub3.readUnsignedShort(1162222719);
			int i_145_ = class241_sub3.readUnsignedShort(1162222719);
			int i_146_;
			if (bool_73_)
			    i_146_ = class241_sub3.method14638(444371561);
			else {
			    i_146_ = class241_sub3.readUnsignedByte((byte) -6);
			    if (i_146_ == 255)
				i_146_ = -1;
			}
			byte i_147_ = class241_sub3.getByte(1257617508);
			aClass95Array1834[i_143_]
			    = new Class95(i_144_, i_145_, i_146_, i_147_);
		    }
		}
	    }
	}
    }
    
    public int method3451(int i, int i_148_, int i_149_) {
	for (int i_150_ = 0; i_150_ < anInt1790; i_150_++) {
	    if (anIntArray1831[i_150_] == i && anIntArray1791[i_150_] == i_148_
		&& anIntArray1816[i_150_] == i_149_)
		return i_150_;
	}
	anIntArray1831[anInt1790] = i;
	anIntArray1791[anInt1790] = i_148_;
	anIntArray1816[anInt1790] = i_149_;
	anInt1805 = anInt1790 + 1;
	return anInt1790++;
    }
    
    public int method3452(int i, int i_151_, int i_152_, byte i_153_,
			  byte i_154_, short i_155_, byte i_156_,
			  short i_157_) {
	aShortArray1818[anInt1802] = (short) i;
	aShortArray1796[anInt1802] = (short) i_151_;
	aShortArray1804[anInt1802] = (short) i_152_;
	aByteArray1808[anInt1802] = i_153_;
	aShortArray1811[anInt1802] = (short) i_154_;
	aShortArray1812[anInt1802] = i_155_;
	aByteArray1793[anInt1802] = i_156_;
	aShortArray1792[anInt1802] = i_157_;
	return anInt1802++;
    }
    
    final int method3453(Class161 class161_158_, int i, short i_159_) {
	int i_160_ = class161_158_.anIntArray1831[i];
	int i_161_ = class161_158_.anIntArray1791[i];
	int i_162_ = class161_158_.anIntArray1816[i];
	for (int i_163_ = 0; i_163_ < anInt1790; i_163_++) {
	    if (i_160_ == anIntArray1831[i_163_]
		&& i_161_ == anIntArray1791[i_163_]
		&& i_162_ == anIntArray1816[i_163_]) {
		aShortArray1797[i_163_] |= i_159_;
		return i_163_;
	    }
	}
	anIntArray1831[anInt1790] = i_160_;
	anIntArray1791[anInt1790] = i_161_;
	anIntArray1816[anInt1790] = i_162_;
	aShortArray1797[anInt1790] = i_159_;
	anIntArray1799[anInt1790] = (class161_158_.anIntArray1799 != null
				     ? class161_158_.anIntArray1799[i] : -1);
	return anInt1790++;
    }
    
    public byte method3454(short i, short i_164_, short i_165_, short i_166_,
			   short i_167_, short i_168_, byte i_169_,
			   byte i_170_, byte i_171_) {
	if (((Class161) this).anInt1819 >= 255)
	    throw new IllegalStateException();
	aByteArray1820[((Class161) this).anInt1819] = (byte) 3;
	aShortArray1821[((Class161) this).anInt1819] = i;
	aShortArray1822[((Class161) this).anInt1819] = i_164_;
	aShortArray1823[((Class161) this).anInt1819] = i_165_;
	anIntArray1824[((Class161) this).anInt1819] = i_166_;
	anIntArray1825[((Class161) this).anInt1819] = i_167_;
	anIntArray1826[((Class161) this).anInt1819] = i_168_;
	((Class161) this).aByteArray1830[((Class161) this).anInt1819] = i_169_;
	aByteArray1827[((Class161) this).anInt1819] = i_170_;
	anIntArray1813[((Class161) this).anInt1819] = i_171_;
	return (byte) ((Class161) this).anInt1819++;
    }
    
    public int[][] method3455(boolean bool) {
	int[] is = new int[400];
	int i = 0;
	int i_172_ = bool ? anInt1790 : anInt1805;
	for (int i_173_ = 0; i_173_ < i_172_; i_173_++) {
	    int i_174_ = anIntArray1799[i_173_];
	    if (i_174_ >= 0) {
		is[i_174_]++;
		if (i_174_ > i)
		    i = i_174_;
	    }
	}
	int[][] is_175_ = new int[i + 1][];
	for (int i_176_ = 0; i_176_ <= i; i_176_++) {
	    is_175_[i_176_] = new int[is[i_176_]];
	    is[i_176_] = 0;
	}
	for (int i_177_ = 0; i_177_ < i_172_; i_177_++) {
	    int i_178_ = anIntArray1799[i_177_];
	    if (i_178_ >= 0)
		is_175_[i_178_][is[i_178_]++] = i_177_;
	}
	return is_175_;
    }
    
    public int[][] method3456() {
	int[] is = new int[256];
	int i = 0;
	for (int i_179_ = 0; i_179_ < anInt1802; i_179_++) {
	    int i_180_ = anIntArray1814[i_179_];
	    if (i_180_ >= 0) {
		is[i_180_]++;
		if (i_180_ > i)
		    i = i_180_;
	    }
	}
	int[][] is_181_ = new int[i + 1][];
	for (int i_182_ = 0; i_182_ <= i; i_182_++) {
	    is_181_[i_182_] = new int[is[i_182_]];
	    is[i_182_] = 0;
	}
	for (int i_183_ = 0; i_183_ < anInt1802; i_183_++) {
	    int i_184_ = anIntArray1814[i_183_];
	    if (i_184_ >= 0)
		is_181_[i_184_][is[i_184_]++] = i_183_;
	}
	return is_181_;
    }
    
    public Class161(int i, int i_185_, int i_186_) {
	anInt1802 = 0;
	((Class161) this).aByte1815 = (byte) 0;
	((Class161) this).anInt1819 = 0;
	anIntArray1831 = new int[i];
	anIntArray1791 = new int[i];
	anIntArray1816 = new int[i];
	anIntArray1799 = new int[i];
	aShortArray1818 = new short[i_185_];
	aShortArray1796 = new short[i_185_];
	aShortArray1804 = new short[i_185_];
	aByteArray1808 = new byte[i_185_];
	aByteArray1809 = new byte[i_185_];
	aByteArray1793 = new byte[i_185_];
	aShortArray1811 = new short[i_185_];
	aShortArray1812 = new short[i_185_];
	aShortArray1792 = new short[i_185_];
	anIntArray1814 = new int[i_185_];
	if (i_186_ > 0) {
	    aByteArray1820 = new byte[i_186_];
	    aShortArray1821 = new short[i_186_];
	    aShortArray1822 = new short[i_186_];
	    aShortArray1823 = new short[i_186_];
	    anIntArray1824 = new int[i_186_];
	    anIntArray1825 = new int[i_186_];
	    anIntArray1826 = new int[i_186_];
	    ((Class161) this).aByteArray1830 = new byte[i_186_];
	    aByteArray1827 = new byte[i_186_];
	    anIntArray1813 = new int[i_186_];
	    anIntArray1828 = new int[i_186_];
	    anIntArray1806 = new int[i_186_];
	}
    }
    
    public void method3457(short i, short i_187_) {
	for (int i_188_ = 0; i_188_ < anInt1802; i_188_++) {
	    if (aShortArray1812[i_188_] == i)
		aShortArray1812[i_188_] = i_187_;
	}
    }
    
    public void method3458(short i, short i_189_) {
	if (aShortArray1792 != null) {
	    for (int i_190_ = 0; i_190_ < anInt1802; i_190_++) {
		if (aShortArray1792[i_190_] == i)
		    aShortArray1792[i_190_] = i_189_;
	    }
	}
    }
    
    public void method3459(int i, int i_191_, int i_192_) {
	for (int i_193_ = 0; i_193_ < anInt1790; i_193_++) {
	    anIntArray1831[i_193_] += i;
	    anIntArray1791[i_193_] += i_191_;
	    anIntArray1816[i_193_] += i_192_;
	}
    }
    
    public void method3460(short i, short i_194_) {
	if (aShortArray1792 != null) {
	    for (int i_195_ = 0; i_195_ < anInt1802; i_195_++) {
		if (aShortArray1792[i_195_] == i)
		    aShortArray1792[i_195_] = i_194_;
	    }
	}
    }
    
    void method3461
	(RSByteBuffer class241_sub3, RSByteBuffer class241_sub3_196_,
	 RSByteBuffer class241_sub3_197_, RSByteBuffer class241_sub3_198_,
	 RSByteBuffer class241_sub3_199_, RSByteBuffer class241_sub3_200_) {
	for (int i = 0; i < ((Class161) this).anInt1819; i++) {
	    int i_201_ = aByteArray1820[i] & 0xff;
	    if (i_201_ == 0) {
		aShortArray1821[i]
		    = (short) class241_sub3.readUnsignedShort(1162222719);
		aShortArray1822[i]
		    = (short) class241_sub3.readUnsignedShort(1162222719);
		aShortArray1823[i]
		    = (short) class241_sub3.readUnsignedShort(1162222719);
	    }
	    if (i_201_ == 1) {
		aShortArray1821[i]
		    = (short) class241_sub3_196_.readUnsignedShort(1162222719);
		aShortArray1822[i]
		    = (short) class241_sub3_196_.readUnsignedShort(1162222719);
		aShortArray1823[i]
		    = (short) class241_sub3_196_.readUnsignedShort(1162222719);
		if (anInt1789 < 15) {
		    anIntArray1824[i]
			= class241_sub3_197_.readUnsignedShort(1162222719);
		    if (anInt1789 < 14)
			anIntArray1825[i]
			    = class241_sub3_197_.readUnsignedShort(1162222719);
		    else
			anIntArray1825[i]
			    = class241_sub3_197_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_197_.readUnsignedShort(1162222719);
		} else {
		    anIntArray1824[i]
			= class241_sub3_197_.readTriByte(1771646547);
		    anIntArray1825[i]
			= class241_sub3_197_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_197_.readTriByte(1771646547);
		}
		((Class161) this).aByteArray1830[i]
		    = class241_sub3_198_.getByte(1686698205);
		aByteArray1827[i]
		    = class241_sub3_199_.getByte(-1001715009);
		anIntArray1813[i]
		    = class241_sub3_200_.getByte(-1519595638);
	    }
	    if (i_201_ == 2) {
		aShortArray1821[i]
		    = (short) class241_sub3_196_.readUnsignedShort(1162222719);
		aShortArray1822[i]
		    = (short) class241_sub3_196_.readUnsignedShort(1162222719);
		aShortArray1823[i]
		    = (short) class241_sub3_196_.readUnsignedShort(1162222719);
		if (anInt1789 < 15) {
		    anIntArray1824[i]
			= class241_sub3_197_.readUnsignedShort(1162222719);
		    if (anInt1789 < 14)
			anIntArray1825[i]
			    = class241_sub3_197_.readUnsignedShort(1162222719);
		    else
			anIntArray1825[i]
			    = class241_sub3_197_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_197_.readUnsignedShort(1162222719);
		} else {
		    anIntArray1824[i]
			= class241_sub3_197_.readTriByte(1771646547);
		    anIntArray1825[i]
			= class241_sub3_197_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_197_.readTriByte(1771646547);
		}
		((Class161) this).aByteArray1830[i]
		    = class241_sub3_198_.getByte(432881108);
		aByteArray1827[i] = class241_sub3_199_.getByte(-463000284);
		anIntArray1813[i] = class241_sub3_200_.getByte(-62757610);
		anIntArray1828[i] = class241_sub3_200_.getByte(1564757532);
		anIntArray1806[i] = class241_sub3_200_.getByte(1391473958);
	    }
	    if (i_201_ == 3) {
		aShortArray1821[i]
		    = (short) class241_sub3_196_.readUnsignedShort(1162222719);
		aShortArray1822[i]
		    = (short) class241_sub3_196_.readUnsignedShort(1162222719);
		aShortArray1823[i]
		    = (short) class241_sub3_196_.readUnsignedShort(1162222719);
		if (anInt1789 < 15) {
		    anIntArray1824[i]
			= class241_sub3_197_.readUnsignedShort(1162222719);
		    if (anInt1789 < 14)
			anIntArray1825[i]
			    = class241_sub3_197_.readUnsignedShort(1162222719);
		    else
			anIntArray1825[i]
			    = class241_sub3_197_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_197_.readUnsignedShort(1162222719);
		} else {
		    anIntArray1824[i]
			= class241_sub3_197_.readTriByte(1771646547);
		    anIntArray1825[i]
			= class241_sub3_197_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_197_.readTriByte(1771646547);
		}
		((Class161) this).aByteArray1830[i]
		    = class241_sub3_198_.getByte(1311321577);
		aByteArray1827[i] = class241_sub3_199_.getByte(1444740612);
		anIntArray1813[i] = class241_sub3_200_.getByte(-292835237);
	    }
	}
    }
    
    public int[][] method3462(boolean bool) {
	int[] is = new int[400];
	int i = 0;
	int i_202_ = bool ? anInt1790 : anInt1805;
	for (int i_203_ = 0; i_203_ < i_202_; i_203_++) {
	    int i_204_ = anIntArray1799[i_203_];
	    if (i_204_ >= 0) {
		is[i_204_]++;
		if (i_204_ > i)
		    i = i_204_;
	    }
	}
	int[][] is_205_ = new int[i + 1][];
	for (int i_206_ = 0; i_206_ <= i; i_206_++) {
	    is_205_[i_206_] = new int[is[i_206_]];
	    is[i_206_] = 0;
	}
	for (int i_207_ = 0; i_207_ < i_202_; i_207_++) {
	    int i_208_ = anIntArray1799[i_207_];
	    if (i_208_ >= 0)
		is_205_[i_208_][is[i_208_]++] = i_207_;
	}
	return is_205_;
    }
    
    public byte method3463(short i, short i_209_, short i_210_) {
	if (((Class161) this).anInt1819 >= 255)
	    throw new IllegalStateException();
	aByteArray1820[((Class161) this).anInt1819] = (byte) 0;
	aShortArray1821[((Class161) this).anInt1819] = i;
	aShortArray1822[((Class161) this).anInt1819] = i_209_;
	aShortArray1823[((Class161) this).anInt1819] = i_210_;
	return (byte) ((Class161) this).anInt1819++;
    }
    
    public void method3464(int i) {
	for (int i_211_ = 0; i_211_ < anInt1790; i_211_++) {
	    anIntArray1831[i_211_] <<= i;
	    anIntArray1791[i_211_] <<= i;
	    anIntArray1816[i_211_] <<= i;
	}
	if (((Class161) this).anInt1819 > 0 && anIntArray1824 != null) {
	    for (int i_212_ = 0; i_212_ < anIntArray1824.length; i_212_++) {
		anIntArray1824[i_212_] <<= i;
		anIntArray1825[i_212_] <<= i;
		if (aByteArray1820[i_212_] != 1)
		    anIntArray1826[i_212_] <<= i;
	    }
	}
    }
    
    public static Class161 method3465(JS5 class210, int i, int i_213_) {
	byte[] is = class210.getfile(i, i_213_, 1631578797);
	if (is == null)
	    return null;
	return new Class161(is);
    }
    
    public static Class161 method3466(JS5 class210, int i, int i_214_) {
	byte[] is = class210.getfile(i, i_214_, -67011843);
	if (is == null)
	    return null;
	return new Class161(is);
    }
    
    final int method3467(Class161 class161_215_, int i, short i_216_) {
	int i_217_ = class161_215_.anIntArray1831[i];
	int i_218_ = class161_215_.anIntArray1791[i];
	int i_219_ = class161_215_.anIntArray1816[i];
	for (int i_220_ = 0; i_220_ < anInt1790; i_220_++) {
	    if (i_217_ == anIntArray1831[i_220_]
		&& i_218_ == anIntArray1791[i_220_]
		&& i_219_ == anIntArray1816[i_220_]) {
		aShortArray1797[i_220_] |= i_216_;
		return i_220_;
	    }
	}
	anIntArray1831[anInt1790] = i_217_;
	anIntArray1791[anInt1790] = i_218_;
	anIntArray1816[anInt1790] = i_219_;
	aShortArray1797[anInt1790] = i_216_;
	anIntArray1799[anInt1790] = (class161_215_.anIntArray1799 != null
				     ? class161_215_.anIntArray1799[i] : -1);
	return anInt1790++;
    }
    
    public byte method3468(short i, short i_221_, short i_222_) {
	if (((Class161) this).anInt1819 >= 255)
	    throw new IllegalStateException();
	aByteArray1820[((Class161) this).anInt1819] = (byte) 0;
	aShortArray1821[((Class161) this).anInt1819] = i;
	aShortArray1822[((Class161) this).anInt1819] = i_221_;
	aShortArray1823[((Class161) this).anInt1819] = i_222_;
	return (byte) ((Class161) this).anInt1819++;
    }
    
    public int[][] method3469(boolean bool) {
	int[] is = new int[400];
	int i = 0;
	int i_223_ = bool ? anInt1790 : anInt1805;
	for (int i_224_ = 0; i_224_ < i_223_; i_224_++) {
	    int i_225_ = anIntArray1799[i_224_];
	    if (i_225_ >= 0) {
		is[i_225_]++;
		if (i_225_ > i)
		    i = i_225_;
	    }
	}
	int[][] is_226_ = new int[i + 1][];
	for (int i_227_ = 0; i_227_ <= i; i_227_++) {
	    is_226_[i_227_] = new int[is[i_227_]];
	    is[i_227_] = 0;
	}
	for (int i_228_ = 0; i_228_ < i_223_; i_228_++) {
	    int i_229_ = anIntArray1799[i_228_];
	    if (i_229_ >= 0)
		is_226_[i_229_][is[i_229_]++] = i_228_;
	}
	return is_226_;
    }
    
    final int method3470(Class161 class161_230_, int i, short i_231_) {
	int i_232_ = class161_230_.anIntArray1831[i];
	int i_233_ = class161_230_.anIntArray1791[i];
	int i_234_ = class161_230_.anIntArray1816[i];
	for (int i_235_ = 0; i_235_ < anInt1790; i_235_++) {
	    if (i_232_ == anIntArray1831[i_235_]
		&& i_233_ == anIntArray1791[i_235_]
		&& i_234_ == anIntArray1816[i_235_]) {
		aShortArray1797[i_235_] |= i_231_;
		return i_235_;
	    }
	}
	anIntArray1831[anInt1790] = i_232_;
	anIntArray1791[anInt1790] = i_233_;
	anIntArray1816[anInt1790] = i_234_;
	aShortArray1797[anInt1790] = i_231_;
	anIntArray1799[anInt1790] = (class161_230_.anIntArray1799 != null
				     ? class161_230_.anIntArray1799[i] : -1);
	return anInt1790++;
    }
    
    void method3471
	(RSByteBuffer class241_sub3, RSByteBuffer class241_sub3_236_,
	 RSByteBuffer class241_sub3_237_, RSByteBuffer class241_sub3_238_,
	 RSByteBuffer class241_sub3_239_, RSByteBuffer class241_sub3_240_) {
	for (int i = 0; i < ((Class161) this).anInt1819; i++) {
	    int i_241_ = aByteArray1820[i] & 0xff;
	    if (i_241_ == 0) {
		aShortArray1821[i]
		    = (short) class241_sub3.readUnsignedShort(1162222719);
		aShortArray1822[i]
		    = (short) class241_sub3.readUnsignedShort(1162222719);
		aShortArray1823[i]
		    = (short) class241_sub3.readUnsignedShort(1162222719);
	    }
	    if (i_241_ == 1) {
		aShortArray1821[i]
		    = (short) class241_sub3_236_.readUnsignedShort(1162222719);
		aShortArray1822[i]
		    = (short) class241_sub3_236_.readUnsignedShort(1162222719);
		aShortArray1823[i]
		    = (short) class241_sub3_236_.readUnsignedShort(1162222719);
		if (anInt1789 < 15) {
		    anIntArray1824[i]
			= class241_sub3_237_.readUnsignedShort(1162222719);
		    if (anInt1789 < 14)
			anIntArray1825[i]
			    = class241_sub3_237_.readUnsignedShort(1162222719);
		    else
			anIntArray1825[i]
			    = class241_sub3_237_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_237_.readUnsignedShort(1162222719);
		} else {
		    anIntArray1824[i]
			= class241_sub3_237_.readTriByte(1771646547);
		    anIntArray1825[i]
			= class241_sub3_237_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_237_.readTriByte(1771646547);
		}
		((Class161) this).aByteArray1830[i]
		    = class241_sub3_238_.getByte(-1221213666);
		aByteArray1827[i] = class241_sub3_239_.getByte(1455715757);
		anIntArray1813[i]
		    = class241_sub3_240_.getByte(-1166175062);
	    }
	    if (i_241_ == 2) {
		aShortArray1821[i]
		    = (short) class241_sub3_236_.readUnsignedShort(1162222719);
		aShortArray1822[i]
		    = (short) class241_sub3_236_.readUnsignedShort(1162222719);
		aShortArray1823[i]
		    = (short) class241_sub3_236_.readUnsignedShort(1162222719);
		if (anInt1789 < 15) {
		    anIntArray1824[i]
			= class241_sub3_237_.readUnsignedShort(1162222719);
		    if (anInt1789 < 14)
			anIntArray1825[i]
			    = class241_sub3_237_.readUnsignedShort(1162222719);
		    else
			anIntArray1825[i]
			    = class241_sub3_237_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_237_.readUnsignedShort(1162222719);
		} else {
		    anIntArray1824[i]
			= class241_sub3_237_.readTriByte(1771646547);
		    anIntArray1825[i]
			= class241_sub3_237_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_237_.readTriByte(1771646547);
		}
		((Class161) this).aByteArray1830[i]
		    = class241_sub3_238_.getByte(1121545569);
		aByteArray1827[i] = class241_sub3_239_.getByte(1665264866);
		anIntArray1813[i] = class241_sub3_240_.getByte(1210051272);
		anIntArray1828[i]
		    = class241_sub3_240_.getByte(-1929052993);
		anIntArray1806[i] = class241_sub3_240_.getByte(820940295);
	    }
	    if (i_241_ == 3) {
		aShortArray1821[i]
		    = (short) class241_sub3_236_.readUnsignedShort(1162222719);
		aShortArray1822[i]
		    = (short) class241_sub3_236_.readUnsignedShort(1162222719);
		aShortArray1823[i]
		    = (short) class241_sub3_236_.readUnsignedShort(1162222719);
		if (anInt1789 < 15) {
		    anIntArray1824[i]
			= class241_sub3_237_.readUnsignedShort(1162222719);
		    if (anInt1789 < 14)
			anIntArray1825[i]
			    = class241_sub3_237_.readUnsignedShort(1162222719);
		    else
			anIntArray1825[i]
			    = class241_sub3_237_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_237_.readUnsignedShort(1162222719);
		} else {
		    anIntArray1824[i]
			= class241_sub3_237_.readTriByte(1771646547);
		    anIntArray1825[i]
			= class241_sub3_237_.readTriByte(1771646547);
		    anIntArray1826[i]
			= class241_sub3_237_.readTriByte(1771646547);
		}
		((Class161) this).aByteArray1830[i]
		    = class241_sub3_238_.getByte(1192907147);
		aByteArray1827[i] = class241_sub3_239_.getByte(-781902784);
		anIntArray1813[i] = class241_sub3_240_.getByte(1550202125);
	    }
	}
    }
    
    public int method3472(int i, int i_242_, int i_243_, byte i_244_,
			  byte i_245_, short i_246_, byte i_247_,
			  short i_248_) {
	aShortArray1818[anInt1802] = (short) i;
	aShortArray1796[anInt1802] = (short) i_242_;
	aShortArray1804[anInt1802] = (short) i_243_;
	aByteArray1808[anInt1802] = i_244_;
	aShortArray1811[anInt1802] = (short) i_245_;
	aShortArray1812[anInt1802] = i_246_;
	aByteArray1793[anInt1802] = i_247_;
	aShortArray1792[anInt1802] = i_248_;
	return anInt1802++;
    }
    
    public int method3473(int i, int i_249_, int i_250_, byte i_251_,
			  byte i_252_, short i_253_, byte i_254_,
			  short i_255_) {
	aShortArray1818[anInt1802] = (short) i;
	aShortArray1796[anInt1802] = (short) i_249_;
	aShortArray1804[anInt1802] = (short) i_250_;
	aByteArray1808[anInt1802] = i_251_;
	aShortArray1811[anInt1802] = (short) i_252_;
	aShortArray1812[anInt1802] = i_253_;
	aByteArray1793[anInt1802] = i_254_;
	aShortArray1792[anInt1802] = i_255_;
	return anInt1802++;
    }
    
    public int method3474(int i, int i_256_, int i_257_, byte i_258_,
			  byte i_259_, short i_260_, byte i_261_,
			  short i_262_) {
	aShortArray1818[anInt1802] = (short) i;
	aShortArray1796[anInt1802] = (short) i_256_;
	aShortArray1804[anInt1802] = (short) i_257_;
	aByteArray1808[anInt1802] = i_258_;
	aShortArray1811[anInt1802] = (short) i_259_;
	aShortArray1812[anInt1802] = i_260_;
	aByteArray1793[anInt1802] = i_261_;
	aShortArray1792[anInt1802] = i_262_;
	return anInt1802++;
    }
    
    public static Class161 method3475(JS5 class210, int i, int i_263_) {
	byte[] is = class210.getfile(i, i_263_, 1718996935);
	if (is == null)
	    return null;
	return new Class161(is);
    }
    
    public byte method3476(short i, short i_264_, short i_265_) {
	if (((Class161) this).anInt1819 >= 255)
	    throw new IllegalStateException();
	aByteArray1820[((Class161) this).anInt1819] = (byte) 0;
	aShortArray1821[((Class161) this).anInt1819] = i;
	aShortArray1822[((Class161) this).anInt1819] = i_264_;
	aShortArray1823[((Class161) this).anInt1819] = i_265_;
	return (byte) ((Class161) this).anInt1819++;
    }
    
    public int[][] method3477() {
	int[] is = new int[256];
	int i = 0;
	for (int i_266_ = 0; i_266_ < aClass95Array1834.length; i_266_++) {
	    int i_267_ = (((Class95) aClass95Array1834[i_266_]).anInt1330
			  * -1464816515);
	    if (i_267_ >= 0) {
		is[i_267_]++;
		if (i_267_ > i)
		    i = i_267_;
	    }
	}
	int[][] is_268_ = new int[i + 1][];
	for (int i_269_ = 0; i_269_ <= i; i_269_++) {
	    is_268_[i_269_] = new int[is[i_269_]];
	    is[i_269_] = 0;
	}
	for (int i_270_ = 0; i_270_ < aClass95Array1834.length; i_270_++) {
	    int i_271_ = (((Class95) aClass95Array1834[i_270_]).anInt1330
			  * -1464816515);
	    if (i_271_ >= 0)
		is_268_[i_271_][is[i_271_]++] = i_270_;
	}
	return is_268_;
    }
    
    public int[][] method3478(boolean bool) {
	int[] is = new int[400];
	int i = 0;
	int i_272_ = bool ? anInt1790 : anInt1805;
	for (int i_273_ = 0; i_273_ < i_272_; i_273_++) {
	    int i_274_ = anIntArray1799[i_273_];
	    if (i_274_ >= 0) {
		is[i_274_]++;
		if (i_274_ > i)
		    i = i_274_;
	    }
	}
	int[][] is_275_ = new int[i + 1][];
	for (int i_276_ = 0; i_276_ <= i; i_276_++) {
	    is_275_[i_276_] = new int[is[i_276_]];
	    is[i_276_] = 0;
	}
	for (int i_277_ = 0; i_277_ < i_272_; i_277_++) {
	    int i_278_ = anIntArray1799[i_277_];
	    if (i_278_ >= 0)
		is_275_[i_278_][is[i_278_]++] = i_277_;
	}
	return is_275_;
    }
    
    public void method3479(int i, int i_279_, int i_280_) {
	for (int i_281_ = 0; i_281_ < anInt1790; i_281_++) {
	    anIntArray1831[i_281_] += i;
	    anIntArray1791[i_281_] += i_279_;
	    anIntArray1816[i_281_] += i_280_;
	}
    }
    
    public int[][] method3480() {
	int[] is = new int[256];
	int i = 0;
	for (int i_282_ = 0; i_282_ < anInt1802; i_282_++) {
	    int i_283_ = anIntArray1814[i_282_];
	    if (i_283_ >= 0) {
		is[i_283_]++;
		if (i_283_ > i)
		    i = i_283_;
	    }
	}
	int[][] is_284_ = new int[i + 1][];
	for (int i_285_ = 0; i_285_ <= i; i_285_++) {
	    is_284_[i_285_] = new int[is[i_285_]];
	    is[i_285_] = 0;
	}
	for (int i_286_ = 0; i_286_ < anInt1802; i_286_++) {
	    int i_287_ = anIntArray1814[i_286_];
	    if (i_287_ >= 0)
		is_284_[i_287_][is[i_287_]++] = i_286_;
	}
	return is_284_;
    }
    
    public int[][] method3481() {
	int[] is = new int[256];
	int i = 0;
	for (int i_288_ = 0; i_288_ < aClass95Array1834.length; i_288_++) {
	    int i_289_ = (((Class95) aClass95Array1834[i_288_]).anInt1330
			  * -1464816515);
	    if (i_289_ >= 0) {
		is[i_289_]++;
		if (i_289_ > i)
		    i = i_289_;
	    }
	}
	int[][] is_290_ = new int[i + 1][];
	for (int i_291_ = 0; i_291_ <= i; i_291_++) {
	    is_290_[i_291_] = new int[is[i_291_]];
	    is[i_291_] = 0;
	}
	for (int i_292_ = 0; i_292_ < aClass95Array1834.length; i_292_++) {
	    int i_293_ = (((Class95) aClass95Array1834[i_292_]).anInt1330
			  * -1464816515);
	    if (i_293_ >= 0)
		is_290_[i_293_][is[i_293_]++] = i_292_;
	}
	return is_290_;
    }
    
    public int[][] method3482() {
	int[] is = new int[256];
	int i = 0;
	for (int i_294_ = 0; i_294_ < aClass95Array1834.length; i_294_++) {
	    int i_295_ = (((Class95) aClass95Array1834[i_294_]).anInt1330
			  * -1464816515);
	    if (i_295_ >= 0) {
		is[i_295_]++;
		if (i_295_ > i)
		    i = i_295_;
	    }
	}
	int[][] is_296_ = new int[i + 1][];
	for (int i_297_ = 0; i_297_ <= i; i_297_++) {
	    is_296_[i_297_] = new int[is[i_297_]];
	    is[i_297_] = 0;
	}
	for (int i_298_ = 0; i_298_ < aClass95Array1834.length; i_298_++) {
	    int i_299_ = (((Class95) aClass95Array1834[i_298_]).anInt1330
			  * -1464816515);
	    if (i_299_ >= 0)
		is_296_[i_299_][is[i_299_]++] = i_298_;
	}
	return is_296_;
    }
    
    public int[][] method3483() {
	int[] is = new int[256];
	int i = 0;
	for (int i_300_ = 0; i_300_ < aClass95Array1834.length; i_300_++) {
	    int i_301_ = (((Class95) aClass95Array1834[i_300_]).anInt1330
			  * -1464816515);
	    if (i_301_ >= 0) {
		is[i_301_]++;
		if (i_301_ > i)
		    i = i_301_;
	    }
	}
	int[][] is_302_ = new int[i + 1][];
	for (int i_303_ = 0; i_303_ <= i; i_303_++) {
	    is_302_[i_303_] = new int[is[i_303_]];
	    is[i_303_] = 0;
	}
	for (int i_304_ = 0; i_304_ < aClass95Array1834.length; i_304_++) {
	    int i_305_ = (((Class95) aClass95Array1834[i_304_]).anInt1330
			  * -1464816515);
	    if (i_305_ >= 0)
		is_302_[i_305_][is[i_305_]++] = i_304_;
	}
	return is_302_;
    }
    
    public void method3484(short i, short i_306_) {
	for (int i_307_ = 0; i_307_ < anInt1802; i_307_++) {
	    if (aShortArray1812[i_307_] == i)
		aShortArray1812[i_307_] = i_306_;
	}
    }
    
    final int method3485(Class161 class161_308_, int i, short i_309_) {
	int i_310_ = class161_308_.anIntArray1831[i];
	int i_311_ = class161_308_.anIntArray1791[i];
	int i_312_ = class161_308_.anIntArray1816[i];
	for (int i_313_ = 0; i_313_ < anInt1790; i_313_++) {
	    if (i_310_ == anIntArray1831[i_313_]
		&& i_311_ == anIntArray1791[i_313_]
		&& i_312_ == anIntArray1816[i_313_]) {
		aShortArray1797[i_313_] |= i_309_;
		return i_313_;
	    }
	}
	anIntArray1831[anInt1790] = i_310_;
	anIntArray1791[anInt1790] = i_311_;
	anIntArray1816[anInt1790] = i_312_;
	aShortArray1797[anInt1790] = i_309_;
	anIntArray1799[anInt1790] = (class161_308_.anIntArray1799 != null
				     ? class161_308_.anIntArray1799[i] : -1);
	return anInt1790++;
    }
    
    void method3486(RSByteBuffer class241_sub3,
		    RSByteBuffer class241_sub3_314_,
		    RSByteBuffer class241_sub3_315_) {
	short i = 0;
	short i_316_ = 0;
	short i_317_ = 0;
	int i_318_ = 0;
	for (int i_319_ = 0; i_319_ < anInt1802; i_319_++) {
	    int i_320_ = class241_sub3_314_.readUnsignedByte((byte) 51);
	    int i_321_ = i_320_ & 0x7;
	    if (i_321_ == 1) {
		aShortArray1818[i_319_] = i
		    = (short) (class241_sub3.readSmart49152(628241804) + i_318_);
		i_318_ = i;
		aShortArray1796[i_319_] = i_316_
		    = (short) (class241_sub3.readSmart49152(1025095786) + i_318_);
		i_318_ = i_316_;
		aShortArray1804[i_319_] = i_317_
		    = (short) (class241_sub3.readSmart49152(2141072851) + i_318_);
		i_318_ = i_317_;
		if (i > anInt1805)
		    anInt1805 = i;
		if (i_316_ > anInt1805)
		    anInt1805 = i_316_;
		if (i_317_ > anInt1805)
		    anInt1805 = i_317_;
	    }
	    if (i_321_ == 2) {
		i_316_ = i_317_;
		i_317_ = (short) (class241_sub3.readSmart49152(-1744011956)
				  + i_318_);
		i_318_ = i_317_;
		aShortArray1818[i_319_] = i;
		aShortArray1796[i_319_] = i_316_;
		aShortArray1804[i_319_] = i_317_;
		if (i_317_ > anInt1805)
		    anInt1805 = i_317_;
	    }
	    if (i_321_ == 3) {
		i = i_317_;
		i_317_
		    = (short) (class241_sub3.readSmart49152(1179624601) + i_318_);
		i_318_ = i_317_;
		aShortArray1818[i_319_] = i;
		aShortArray1796[i_319_] = i_316_;
		aShortArray1804[i_319_] = i_317_;
		if (i_317_ > anInt1805)
		    anInt1805 = i_317_;
	    }
	    if (i_321_ == 4) {
		short i_322_ = i;
		i = i_316_;
		i_316_ = i_322_;
		i_317_ = (short) (class241_sub3.readSmart49152(-2110389937)
				  + i_318_);
		i_318_ = i_317_;
		aShortArray1818[i_319_] = i;
		aShortArray1796[i_319_] = i_316_;
		aShortArray1804[i_319_] = i_317_;
		if (i_317_ > anInt1805)
		    anInt1805 = i_317_;
	    }
	    if (((Class161) this).anInt1798 > 0 && (i_320_ & 0x8) != 0) {
		aByteArray1803[i_319_]
		    = (byte) class241_sub3_315_.readUnsignedByte((byte) -33);
		aByteArray1794[i_319_]
		    = (byte) class241_sub3_315_.readUnsignedByte((byte) 2);
		aByteArray1807[i_319_]
		    = (byte) class241_sub3_315_.readUnsignedByte((byte) 10);
	    }
	}
	anInt1805++;
    }
    
    public void method3487(short i, short i_323_) {
	for (int i_324_ = 0; i_324_ < anInt1802; i_324_++) {
	    if (aShortArray1812[i_324_] == i)
		aShortArray1812[i_324_] = i_323_;
	}
    }
    
    public void method3488(int i, int i_325_, int i_326_) {
	for (int i_327_ = 0; i_327_ < anInt1790; i_327_++) {
	    anIntArray1831[i_327_] += i;
	    anIntArray1791[i_327_] += i_325_;
	    anIntArray1816[i_327_] += i_326_;
	}
    }
    
    public void method3489(int i, int i_328_, int i_329_) {
	if (i_329_ != 0) {
	    int i_330_ = Class282.anIntArray4430[i_329_];
	    int i_331_ = Class282.anIntArray4441[i_329_];
	    for (int i_332_ = 0; i_332_ < anInt1790; i_332_++) {
		int i_333_ = ((anIntArray1791[i_332_] * i_330_
			       + anIntArray1831[i_332_] * i_331_)
			      >> 14);
		anIntArray1791[i_332_]
		    = (anIntArray1791[i_332_] * i_331_
		       - anIntArray1831[i_332_] * i_330_) >> 14;
		anIntArray1831[i_332_] = i_333_;
	    }
	}
	if (i != 0) {
	    int i_334_ = Class282.anIntArray4430[i];
	    int i_335_ = Class282.anIntArray4441[i];
	    for (int i_336_ = 0; i_336_ < anInt1790; i_336_++) {
		int i_337_ = ((anIntArray1791[i_336_] * i_335_
			       - anIntArray1816[i_336_] * i_334_)
			      >> 14);
		anIntArray1816[i_336_]
		    = (anIntArray1791[i_336_] * i_334_
		       + anIntArray1816[i_336_] * i_335_) >> 14;
		anIntArray1791[i_336_] = i_337_;
	    }
	}
	if (i_328_ != 0) {
	    int i_338_ = Class282.anIntArray4430[i_328_];
	    int i_339_ = Class282.anIntArray4441[i_328_];
	    for (int i_340_ = 0; i_340_ < anInt1790; i_340_++) {
		int i_341_ = ((anIntArray1816[i_340_] * i_338_
			       + anIntArray1831[i_340_] * i_339_)
			      >> 14);
		anIntArray1816[i_340_]
		    = (anIntArray1816[i_340_] * i_339_
		       - anIntArray1831[i_340_] * i_338_) >> 14;
		anIntArray1831[i_340_] = i_341_;
	    }
	}
    }
    
    public void method3490(int i, int i_342_, int i_343_) {
	if (i_343_ != 0) {
	    int i_344_ = Class282.anIntArray4430[i_343_];
	    int i_345_ = Class282.anIntArray4441[i_343_];
	    for (int i_346_ = 0; i_346_ < anInt1790; i_346_++) {
		int i_347_ = ((anIntArray1791[i_346_] * i_344_
			       + anIntArray1831[i_346_] * i_345_)
			      >> 14);
		anIntArray1791[i_346_]
		    = (anIntArray1791[i_346_] * i_345_
		       - anIntArray1831[i_346_] * i_344_) >> 14;
		anIntArray1831[i_346_] = i_347_;
	    }
	}
	if (i != 0) {
	    int i_348_ = Class282.anIntArray4430[i];
	    int i_349_ = Class282.anIntArray4441[i];
	    for (int i_350_ = 0; i_350_ < anInt1790; i_350_++) {
		int i_351_ = ((anIntArray1791[i_350_] * i_349_
			       - anIntArray1816[i_350_] * i_348_)
			      >> 14);
		anIntArray1816[i_350_]
		    = (anIntArray1791[i_350_] * i_348_
		       + anIntArray1816[i_350_] * i_349_) >> 14;
		anIntArray1791[i_350_] = i_351_;
	    }
	}
	if (i_342_ != 0) {
	    int i_352_ = Class282.anIntArray4430[i_342_];
	    int i_353_ = Class282.anIntArray4441[i_342_];
	    for (int i_354_ = 0; i_354_ < anInt1790; i_354_++) {
		int i_355_ = ((anIntArray1816[i_354_] * i_352_
			       + anIntArray1831[i_354_] * i_353_)
			      >> 14);
		anIntArray1816[i_354_]
		    = (anIntArray1816[i_354_] * i_353_
		       - anIntArray1831[i_354_] * i_352_) >> 14;
		anIntArray1831[i_354_] = i_355_;
	    }
	}
    }
    
    public void method3491(int i) {
	for (int i_356_ = 0; i_356_ < anInt1790; i_356_++) {
	    anIntArray1831[i_356_] <<= i;
	    anIntArray1791[i_356_] <<= i;
	    anIntArray1816[i_356_] <<= i;
	}
	if (((Class161) this).anInt1819 > 0 && anIntArray1824 != null) {
	    for (int i_357_ = 0; i_357_ < anIntArray1824.length; i_357_++) {
		anIntArray1824[i_357_] <<= i;
		anIntArray1825[i_357_] <<= i;
		if (aByteArray1820[i_357_] != 1)
		    anIntArray1826[i_357_] <<= i;
	    }
	}
    }
    
    public void method3492(int i) {
	for (int i_358_ = 0; i_358_ < anInt1790; i_358_++) {
	    anIntArray1831[i_358_] <<= i;
	    anIntArray1791[i_358_] <<= i;
	    anIntArray1816[i_358_] <<= i;
	}
	if (((Class161) this).anInt1819 > 0 && anIntArray1824 != null) {
	    for (int i_359_ = 0; i_359_ < anIntArray1824.length; i_359_++) {
		anIntArray1824[i_359_] <<= i;
		anIntArray1825[i_359_] <<= i;
		if (aByteArray1820[i_359_] != 1)
		    anIntArray1826[i_359_] <<= i;
	    }
	}
    }
    
    public void method3493(int i) {
	for (int i_360_ = 0; i_360_ < anInt1790; i_360_++) {
	    anIntArray1831[i_360_] <<= i;
	    anIntArray1791[i_360_] <<= i;
	    anIntArray1816[i_360_] <<= i;
	}
	if (((Class161) this).anInt1819 > 0 && anIntArray1824 != null) {
	    for (int i_361_ = 0; i_361_ < anIntArray1824.length; i_361_++) {
		anIntArray1824[i_361_] <<= i;
		anIntArray1825[i_361_] <<= i;
		if (aByteArray1820[i_361_] != 1)
		    anIntArray1826[i_361_] <<= i;
	    }
	}
    }
    
    public void method3494(float f) {
	for (int i = 0; i < anInt1790; i++) {
	    anIntArray1831[i] *= f;
	    anIntArray1791[i] *= f;
	    anIntArray1816[i] *= f;
	}
	if (((Class161) this).anInt1819 > 0 && anIntArray1824 != null) {
	    for (int i = 0; i < anIntArray1824.length; i++) {
		anIntArray1824[i] *= f;
		anIntArray1825[i] *= f;
		if (aByteArray1820[i] != 1)
		    anIntArray1826[i] *= f;
	    }
	}
    }
    
    public void method3495(float f) {
	for (int i = 0; i < anInt1790; i++) {
	    anIntArray1831[i] *= f;
	    anIntArray1791[i] *= f;
	    anIntArray1816[i] *= f;
	}
	if (((Class161) this).anInt1819 > 0 && anIntArray1824 != null) {
	    for (int i = 0; i < anIntArray1824.length; i++) {
		anIntArray1824[i] *= f;
		anIntArray1825[i] *= f;
		if (aByteArray1820[i] != 1)
		    anIntArray1826[i] *= f;
	    }
	}
    }
}
