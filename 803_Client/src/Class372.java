/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class372 implements Interface15
{
    short[] aShortArray5574;
    int[] anIntArray5575;
    byte[] aByteArray5576;
    short[] aShortArray5577;
    Class350 aClass350_5578;
    short[] aShortArray5579;
    short[] aShortArray5580;
    byte[] aByteArray5581;
    int[] anIntArray5582 = { -1, -1, -1, -1, -1 };
    public static int[] anIntArray5583 = { 0, 1, 2, 3, 4, 5, 6, 14 };
    public static int[] anIntArray5584 = { 7, 8, 9, 10, 11, 12, 13, 15 };
    
    public boolean method6632(int i) {
	boolean bool = true;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i_0_ = 0; i_0_ < 5; i_0_++) {
		if (-1 != ((Class372) this).anIntArray5582[i_0_]
		    && !(((Class350) ((Class372) this).aClass350_5578)
			     .aClass210_5386.method4188
			 (((Class372) this).anIntArray5582[i_0_], 0,
			  -1273787436)))
		    bool = false;
	    }
	}
	return bool;
    }
    
    void method6633(RSByteBuffer class241_sub3, byte i) {
	for (;;) {
	    int i_1_ = class241_sub3.readUnsignedByte((byte) -15);
	    if (0 == i_1_)
		break;
	    method6645(class241_sub3, i_1_, 1449551662);
	}
    }
    
    public Class161 method6634() {
	if (null == ((Class372) this).anIntArray5575)
	    return null;
	Class161[] class161s
	    = new Class161[((Class372) this).anIntArray5575.length];
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i = 0; i < ((Class372) this).anIntArray5575.length; i++)
		class161s[i]
		    = Class161.method3448((((Class350)
					    ((Class372) this).aClass350_5578)
					   .aClass210_5386),
					  ((Class372) this).anIntArray5575[i],
					  0);
	}
	for (int i = 0; i < ((Class372) this).anIntArray5575.length; i++) {
	    if (class161s[i].anInt1789 < 13)
		class161s[i].method3464(2);
	}
	Class161 class161;
	if (1 == class161s.length)
	    class161 = class161s[0];
	else
	    class161 = new Class161(class161s, class161s.length);
	if (class161 == null)
	    return null;
	if (null != ((Class372) this).aShortArray5580) {
	    for (int i = 0; i < ((Class372) this).aShortArray5580.length; i++)
		class161.method3457(((Class372) this).aShortArray5580[i],
				    ((Class372) this).aShortArray5577[i]);
	}
	if (null != ((Class372) this).aShortArray5574) {
	    for (int i = 0; i < ((Class372) this).aShortArray5574.length; i++)
		class161.method3458(((Class372) this).aShortArray5574[i],
				    ((Class372) this).aShortArray5579[i]);
	}
	return class161;
    }
    
    void method6635(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -38);
	    if (0 == i)
		break;
	    method6645(class241_sub3, i, 1449551662);
	}
    }
    
    public boolean method6636() {
	boolean bool = true;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i = 0; i < 5; i++) {
		if (-1 != ((Class372) this).anIntArray5582[i]
		    && !(((Class350) ((Class372) this).aClass350_5578)
			     .aClass210_5386.method4188
			 (((Class372) this).anIntArray5582[i], 0,
			  -1319885592)))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method6637() {
	boolean bool = true;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i = 0; i < 5; i++) {
		if (-1 != ((Class372) this).anIntArray5582[i]
		    && !(((Class350) ((Class372) this).aClass350_5578)
			     .aClass210_5386.method4188
			 (((Class372) this).anIntArray5582[i], 0, -975346521)))
		    bool = false;
	    }
	}
	return bool;
    }
    
    Class372() {
	/* empty */
    }
    
    public Class161 method6638(int i) {
	if (null == ((Class372) this).anIntArray5575)
	    return null;
	Class161[] class161s
	    = new Class161[((Class372) this).anIntArray5575.length];
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i_2_ = 0; i_2_ < ((Class372) this).anIntArray5575.length;
		 i_2_++)
		class161s[i_2_]
		    = Class161.method3448((((Class350)
					    ((Class372) this).aClass350_5578)
					   .aClass210_5386),
					  (((Class372) this).anIntArray5575
					   [i_2_]),
					  0);
	}
	for (int i_3_ = 0; i_3_ < ((Class372) this).anIntArray5575.length;
	     i_3_++) {
	    if (class161s[i_3_].anInt1789 < 13)
		class161s[i_3_].method3464(2);
	}
	Class161 class161;
	if (1 == class161s.length)
	    class161 = class161s[0];
	else
	    class161 = new Class161(class161s, class161s.length);
	if (class161 == null)
	    return null;
	if (null != ((Class372) this).aShortArray5580) {
	    for (int i_4_ = 0; i_4_ < ((Class372) this).aShortArray5580.length;
		 i_4_++)
		class161.method3457(((Class372) this).aShortArray5580[i_4_],
				    ((Class372) this).aShortArray5577[i_4_]);
	}
	if (null != ((Class372) this).aShortArray5574) {
	    for (int i_5_ = 0; i_5_ < ((Class372) this).aShortArray5574.length;
		 i_5_++)
		class161.method3458(((Class372) this).aShortArray5574[i_5_],
				    ((Class372) this).aShortArray5579[i_5_]);
	}
	return class161;
    }
    
    void method6639(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -47);
	    if (0 == i)
		break;
	    method6645(class241_sub3, i, 1449551662);
	}
    }
    
    void method6640(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 36);
	    if (0 == i)
		break;
	    method6645(class241_sub3, i, 1449551662);
	}
    }
    
    void method6641(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -67);
	    if (0 == i)
		break;
	    method6645(class241_sub3, i, 1449551662);
	}
    }
    
    void method6642(RSByteBuffer class241_sub3, int i) {
	if (1 == i)
	    class241_sub3.readUnsignedByte((byte) 90);
	else if (2 == i) {
	    int i_6_ = class241_sub3.readUnsignedByte((byte) 30);
	    ((Class372) this).anIntArray5575 = new int[i_6_];
	    for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
		((Class372) this).anIntArray5575[i_7_]
		    = class241_sub3.readBigSmart((byte) 30);
	} else if (3 != i) {
	    if (i == 40) {
		int i_8_ = class241_sub3.readUnsignedByte((byte) -72);
		((Class372) this).aShortArray5580 = new short[i_8_];
		((Class372) this).aShortArray5577 = new short[i_8_];
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
		    ((Class372) this).aShortArray5580[i_9_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    ((Class372) this).aShortArray5577[i_9_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (41 == i) {
		int i_10_ = class241_sub3.readUnsignedByte((byte) -14);
		((Class372) this).aShortArray5574 = new short[i_10_];
		((Class372) this).aShortArray5579 = new short[i_10_];
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
		    ((Class372) this).aShortArray5574[i_11_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    ((Class372) this).aShortArray5579[i_11_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (44 == i) {
		int i_12_ = class241_sub3.readUnsignedShort(1162222719);
		int i_13_ = 0;
		for (int i_14_ = i_12_; i_14_ > 0; i_14_ >>= 1)
		    i_13_++;
		((Class372) this).aByteArray5581 = new byte[i_13_];
		byte i_15_ = 0;
		for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
		    if ((i_12_ & 1 << i_16_) > 0) {
			((Class372) this).aByteArray5581[i_16_] = i_15_;
			i_15_++;
		    } else
			((Class372) this).aByteArray5581[i_16_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_17_ = class241_sub3.readUnsignedShort(1162222719);
		int i_18_ = 0;
		for (int i_19_ = i_17_; i_19_ > 0; i_19_ >>= 1)
		    i_18_++;
		((Class372) this).aByteArray5576 = new byte[i_18_];
		byte i_20_ = 0;
		for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
		    if ((i_17_ & 1 << i_21_) > 0) {
			((Class372) this).aByteArray5576[i_21_] = i_20_;
			i_20_++;
		    } else
			((Class372) this).aByteArray5576[i_21_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		((Class372) this).anIntArray5582[i - 60]
		    = class241_sub3.readBigSmart((byte) -39);
	}
    }
    
    void method6643(RSByteBuffer class241_sub3, int i) {
	if (1 == i)
	    class241_sub3.readUnsignedByte((byte) 38);
	else if (2 == i) {
	    int i_22_ = class241_sub3.readUnsignedByte((byte) 63);
	    ((Class372) this).anIntArray5575 = new int[i_22_];
	    for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
		((Class372) this).anIntArray5575[i_23_]
		    = class241_sub3.readBigSmart((byte) 63);
	} else if (3 != i) {
	    if (i == 40) {
		int i_24_ = class241_sub3.readUnsignedByte((byte) 55);
		((Class372) this).aShortArray5580 = new short[i_24_];
		((Class372) this).aShortArray5577 = new short[i_24_];
		for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
		    ((Class372) this).aShortArray5580[i_25_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    ((Class372) this).aShortArray5577[i_25_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (41 == i) {
		int i_26_ = class241_sub3.readUnsignedByte((byte) 62);
		((Class372) this).aShortArray5574 = new short[i_26_];
		((Class372) this).aShortArray5579 = new short[i_26_];
		for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
		    ((Class372) this).aShortArray5574[i_27_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    ((Class372) this).aShortArray5579[i_27_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (44 == i) {
		int i_28_ = class241_sub3.readUnsignedShort(1162222719);
		int i_29_ = 0;
		for (int i_30_ = i_28_; i_30_ > 0; i_30_ >>= 1)
		    i_29_++;
		((Class372) this).aByteArray5581 = new byte[i_29_];
		byte i_31_ = 0;
		for (int i_32_ = 0; i_32_ < i_29_; i_32_++) {
		    if ((i_28_ & 1 << i_32_) > 0) {
			((Class372) this).aByteArray5581[i_32_] = i_31_;
			i_31_++;
		    } else
			((Class372) this).aByteArray5581[i_32_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_33_ = class241_sub3.readUnsignedShort(1162222719);
		int i_34_ = 0;
		for (int i_35_ = i_33_; i_35_ > 0; i_35_ >>= 1)
		    i_34_++;
		((Class372) this).aByteArray5576 = new byte[i_34_];
		byte i_36_ = 0;
		for (int i_37_ = 0; i_37_ < i_34_; i_37_++) {
		    if ((i_33_ & 1 << i_37_) > 0) {
			((Class372) this).aByteArray5576[i_37_] = i_36_;
			i_36_++;
		    } else
			((Class372) this).aByteArray5576[i_37_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		((Class372) this).anIntArray5582[i - 60]
		    = class241_sub3.readBigSmart((byte) 95);
	}
    }
    
    void method6644(RSByteBuffer class241_sub3, int i) {
	if (1 == i)
	    class241_sub3.readUnsignedByte((byte) -30);
	else if (2 == i) {
	    int i_38_ = class241_sub3.readUnsignedByte((byte) 37);
	    ((Class372) this).anIntArray5575 = new int[i_38_];
	    for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
		((Class372) this).anIntArray5575[i_39_]
		    = class241_sub3.readBigSmart((byte) -12);
	} else if (3 != i) {
	    if (i == 40) {
		int i_40_ = class241_sub3.readUnsignedByte((byte) -66);
		((Class372) this).aShortArray5580 = new short[i_40_];
		((Class372) this).aShortArray5577 = new short[i_40_];
		for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
		    ((Class372) this).aShortArray5580[i_41_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    ((Class372) this).aShortArray5577[i_41_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (41 == i) {
		int i_42_ = class241_sub3.readUnsignedByte((byte) -53);
		((Class372) this).aShortArray5574 = new short[i_42_];
		((Class372) this).aShortArray5579 = new short[i_42_];
		for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
		    ((Class372) this).aShortArray5574[i_43_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    ((Class372) this).aShortArray5579[i_43_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (44 == i) {
		int i_44_ = class241_sub3.readUnsignedShort(1162222719);
		int i_45_ = 0;
		for (int i_46_ = i_44_; i_46_ > 0; i_46_ >>= 1)
		    i_45_++;
		((Class372) this).aByteArray5581 = new byte[i_45_];
		byte i_47_ = 0;
		for (int i_48_ = 0; i_48_ < i_45_; i_48_++) {
		    if ((i_44_ & 1 << i_48_) > 0) {
			((Class372) this).aByteArray5581[i_48_] = i_47_;
			i_47_++;
		    } else
			((Class372) this).aByteArray5581[i_48_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_49_ = class241_sub3.readUnsignedShort(1162222719);
		int i_50_ = 0;
		for (int i_51_ = i_49_; i_51_ > 0; i_51_ >>= 1)
		    i_50_++;
		((Class372) this).aByteArray5576 = new byte[i_50_];
		byte i_52_ = 0;
		for (int i_53_ = 0; i_53_ < i_50_; i_53_++) {
		    if ((i_49_ & 1 << i_53_) > 0) {
			((Class372) this).aByteArray5576[i_53_] = i_52_;
			i_52_++;
		    } else
			((Class372) this).aByteArray5576[i_53_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		((Class372) this).anIntArray5582[i - 60]
		    = class241_sub3.readBigSmart((byte) -17);
	}
    }
    
    void method6645(RSByteBuffer class241_sub3, int i, int i_54_) {
	if (1 == i)
	    class241_sub3.readUnsignedByte((byte) -68);
	else if (2 == i) {
	    int i_55_ = class241_sub3.readUnsignedByte((byte) 22);
	    ((Class372) this).anIntArray5575 = new int[i_55_];
	    for (int i_56_ = 0; i_56_ < i_55_; i_56_++)
		((Class372) this).anIntArray5575[i_56_]
		    = class241_sub3.readBigSmart((byte) -102);
	} else if (3 != i) {
	    if (i == 40) {
		int i_57_ = class241_sub3.readUnsignedByte((byte) -102);
		((Class372) this).aShortArray5580 = new short[i_57_];
		((Class372) this).aShortArray5577 = new short[i_57_];
		for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
		    ((Class372) this).aShortArray5580[i_58_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    ((Class372) this).aShortArray5577[i_58_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (41 == i) {
		int i_59_ = class241_sub3.readUnsignedByte((byte) -11);
		((Class372) this).aShortArray5574 = new short[i_59_];
		((Class372) this).aShortArray5579 = new short[i_59_];
		for (int i_60_ = 0; i_60_ < i_59_; i_60_++) {
		    ((Class372) this).aShortArray5574[i_60_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    ((Class372) this).aShortArray5579[i_60_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (44 == i) {
		int i_61_ = class241_sub3.readUnsignedShort(1162222719);
		int i_62_ = 0;
		for (int i_63_ = i_61_; i_63_ > 0; i_63_ >>= 1)
		    i_62_++;
		((Class372) this).aByteArray5581 = new byte[i_62_];
		byte i_64_ = 0;
		for (int i_65_ = 0; i_65_ < i_62_; i_65_++) {
		    if ((i_61_ & 1 << i_65_) > 0) {
			((Class372) this).aByteArray5581[i_65_] = i_64_;
			i_64_++;
		    } else
			((Class372) this).aByteArray5581[i_65_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_66_ = class241_sub3.readUnsignedShort(1162222719);
		int i_67_ = 0;
		for (int i_68_ = i_66_; i_68_ > 0; i_68_ >>= 1)
		    i_67_++;
		((Class372) this).aByteArray5576 = new byte[i_67_];
		byte i_69_ = 0;
		for (int i_70_ = 0; i_70_ < i_67_; i_70_++) {
		    if ((i_66_ & 1 << i_70_) > 0) {
			((Class372) this).aByteArray5576[i_70_] = i_69_;
			i_69_++;
		    } else
			((Class372) this).aByteArray5576[i_70_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		((Class372) this).anIntArray5582[i - 60]
		    = class241_sub3.readBigSmart((byte) 49);
	}
    }
    
    public boolean method6646() {
	if (null == ((Class372) this).anIntArray5575)
	    return true;
	boolean bool = true;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i = 0; i < ((Class372) this).anIntArray5575.length; i++) {
		if (!((Class350) ((Class372) this).aClass350_5578)
			 .aClass210_5386.method4188
		     (((Class372) this).anIntArray5575[i], 0, -533829730))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method6647() {
	if (null == ((Class372) this).anIntArray5575)
	    return true;
	boolean bool = true;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i = 0; i < ((Class372) this).anIntArray5575.length; i++) {
		if (!((Class350) ((Class372) this).aClass350_5578)
			 .aClass210_5386.method4188
		     (((Class372) this).anIntArray5575[i], 0, -803295838))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method6648() {
	boolean bool = true;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i = 0; i < 5; i++) {
		if (-1 != ((Class372) this).anIntArray5582[i]
		    && !(((Class350) ((Class372) this).aClass350_5578)
			     .aClass210_5386.method4188
			 (((Class372) this).anIntArray5582[i], 0,
			  -1891546469)))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public Class161 method6649() {
	if (null == ((Class372) this).anIntArray5575)
	    return null;
	Class161[] class161s
	    = new Class161[((Class372) this).anIntArray5575.length];
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i = 0; i < ((Class372) this).anIntArray5575.length; i++)
		class161s[i]
		    = Class161.method3448((((Class350)
					    ((Class372) this).aClass350_5578)
					   .aClass210_5386),
					  ((Class372) this).anIntArray5575[i],
					  0);
	}
	for (int i = 0; i < ((Class372) this).anIntArray5575.length; i++) {
	    if (class161s[i].anInt1789 < 13)
		class161s[i].method3464(2);
	}
	Class161 class161;
	if (1 == class161s.length)
	    class161 = class161s[0];
	else
	    class161 = new Class161(class161s, class161s.length);
	if (class161 == null)
	    return null;
	if (null != ((Class372) this).aShortArray5580) {
	    for (int i = 0; i < ((Class372) this).aShortArray5580.length; i++)
		class161.method3457(((Class372) this).aShortArray5580[i],
				    ((Class372) this).aShortArray5577[i]);
	}
	if (null != ((Class372) this).aShortArray5574) {
	    for (int i = 0; i < ((Class372) this).aShortArray5574.length; i++)
		class161.method3458(((Class372) this).aShortArray5574[i],
				    ((Class372) this).aShortArray5579[i]);
	}
	return class161;
    }
    
    public Class161 method6650() {
	if (null == ((Class372) this).anIntArray5575)
	    return null;
	Class161[] class161s
	    = new Class161[((Class372) this).anIntArray5575.length];
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i = 0; i < ((Class372) this).anIntArray5575.length; i++)
		class161s[i]
		    = Class161.method3448((((Class350)
					    ((Class372) this).aClass350_5578)
					   .aClass210_5386),
					  ((Class372) this).anIntArray5575[i],
					  0);
	}
	for (int i = 0; i < ((Class372) this).anIntArray5575.length; i++) {
	    if (class161s[i].anInt1789 < 13)
		class161s[i].method3464(2);
	}
	Class161 class161;
	if (1 == class161s.length)
	    class161 = class161s[0];
	else
	    class161 = new Class161(class161s, class161s.length);
	if (class161 == null)
	    return null;
	if (null != ((Class372) this).aShortArray5580) {
	    for (int i = 0; i < ((Class372) this).aShortArray5580.length; i++)
		class161.method3457(((Class372) this).aShortArray5580[i],
				    ((Class372) this).aShortArray5577[i]);
	}
	if (null != ((Class372) this).aShortArray5574) {
	    for (int i = 0; i < ((Class372) this).aShortArray5574.length; i++)
		class161.method3458(((Class372) this).aShortArray5574[i],
				    ((Class372) this).aShortArray5579[i]);
	}
	return class161;
    }
    
    void method6651(RSByteBuffer class241_sub3, int i) {
	if (1 == i)
	    class241_sub3.readUnsignedByte((byte) -38);
	else if (2 == i) {
	    int i_71_ = class241_sub3.readUnsignedByte((byte) -23);
	    ((Class372) this).anIntArray5575 = new int[i_71_];
	    for (int i_72_ = 0; i_72_ < i_71_; i_72_++)
		((Class372) this).anIntArray5575[i_72_]
		    = class241_sub3.readBigSmart((byte) 70);
	} else if (3 != i) {
	    if (i == 40) {
		int i_73_ = class241_sub3.readUnsignedByte((byte) 33);
		((Class372) this).aShortArray5580 = new short[i_73_];
		((Class372) this).aShortArray5577 = new short[i_73_];
		for (int i_74_ = 0; i_74_ < i_73_; i_74_++) {
		    ((Class372) this).aShortArray5580[i_74_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    ((Class372) this).aShortArray5577[i_74_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (41 == i) {
		int i_75_ = class241_sub3.readUnsignedByte((byte) 35);
		((Class372) this).aShortArray5574 = new short[i_75_];
		((Class372) this).aShortArray5579 = new short[i_75_];
		for (int i_76_ = 0; i_76_ < i_75_; i_76_++) {
		    ((Class372) this).aShortArray5574[i_76_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    ((Class372) this).aShortArray5579[i_76_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (44 == i) {
		int i_77_ = class241_sub3.readUnsignedShort(1162222719);
		int i_78_ = 0;
		for (int i_79_ = i_77_; i_79_ > 0; i_79_ >>= 1)
		    i_78_++;
		((Class372) this).aByteArray5581 = new byte[i_78_];
		byte i_80_ = 0;
		for (int i_81_ = 0; i_81_ < i_78_; i_81_++) {
		    if ((i_77_ & 1 << i_81_) > 0) {
			((Class372) this).aByteArray5581[i_81_] = i_80_;
			i_80_++;
		    } else
			((Class372) this).aByteArray5581[i_81_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_82_ = class241_sub3.readUnsignedShort(1162222719);
		int i_83_ = 0;
		for (int i_84_ = i_82_; i_84_ > 0; i_84_ >>= 1)
		    i_83_++;
		((Class372) this).aByteArray5576 = new byte[i_83_];
		byte i_85_ = 0;
		for (int i_86_ = 0; i_86_ < i_83_; i_86_++) {
		    if ((i_82_ & 1 << i_86_) > 0) {
			((Class372) this).aByteArray5576[i_86_] = i_85_;
			i_85_++;
		    } else
			((Class372) this).aByteArray5576[i_86_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		((Class372) this).anIntArray5582[i - 60]
		    = class241_sub3.readBigSmart((byte) -52);
	}
    }
    
    public boolean method6652(int i) {
	if (null == ((Class372) this).anIntArray5575)
	    return true;
	boolean bool = true;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i_87_ = 0;
		 i_87_ < ((Class372) this).anIntArray5575.length; i_87_++) {
		if (!((Class350) ((Class372) this).aClass350_5578)
			 .aClass210_5386.method4188
		     (((Class372) this).anIntArray5575[i_87_], 0, -1328834973))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method6653() {
	boolean bool = true;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i = 0; i < 5; i++) {
		if (-1 != ((Class372) this).anIntArray5582[i]
		    && !(((Class350) ((Class372) this).aClass350_5578)
			     .aClass210_5386.method4188
			 (((Class372) this).anIntArray5582[i], 0,
			  -1805997461)))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public Class161 method6654(int i) {
	Class161[] class161s = new Class161[5];
	int i_88_ = 0;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i_89_ = 0; i_89_ < 5; i_89_++) {
		if (-1 != ((Class372) this).anIntArray5582[i_89_])
		    class161s[i_88_++]
			= Class161.method3448((((Class350) (((Class372) this)
							    .aClass350_5578))
					       .aClass210_5386),
					      (((Class372) this).anIntArray5582
					       [i_89_]),
					      0);
	    }
	}
	for (int i_90_ = 0; i_90_ < 5; i_90_++) {
	    if (class161s[i_90_] != null && class161s[i_90_].anInt1789 < 13)
		class161s[i_90_].method3464(2);
	}
	Class161 class161 = new Class161(class161s, i_88_);
	if (((Class372) this).aShortArray5580 != null) {
	    for (int i_91_ = 0;
		 i_91_ < ((Class372) this).aShortArray5580.length; i_91_++)
		class161.method3457(((Class372) this).aShortArray5580[i_91_],
				    ((Class372) this).aShortArray5577[i_91_]);
	}
	if (null != ((Class372) this).aShortArray5574) {
	    for (int i_92_ = 0;
		 i_92_ < ((Class372) this).aShortArray5574.length; i_92_++)
		class161.method3458(((Class372) this).aShortArray5574[i_92_],
				    ((Class372) this).aShortArray5579[i_92_]);
	}
	return class161;
    }
    
    public Class161 method6655() {
	Class161[] class161s = new Class161[5];
	int i = 0;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i_93_ = 0; i_93_ < 5; i_93_++) {
		if (-1 != ((Class372) this).anIntArray5582[i_93_])
		    class161s[i++]
			= Class161.method3448((((Class350) (((Class372) this)
							    .aClass350_5578))
					       .aClass210_5386),
					      (((Class372) this).anIntArray5582
					       [i_93_]),
					      0);
	    }
	}
	for (int i_94_ = 0; i_94_ < 5; i_94_++) {
	    if (class161s[i_94_] != null && class161s[i_94_].anInt1789 < 13)
		class161s[i_94_].method3464(2);
	}
	Class161 class161 = new Class161(class161s, i);
	if (((Class372) this).aShortArray5580 != null) {
	    for (int i_95_ = 0;
		 i_95_ < ((Class372) this).aShortArray5580.length; i_95_++)
		class161.method3457(((Class372) this).aShortArray5580[i_95_],
				    ((Class372) this).aShortArray5577[i_95_]);
	}
	if (null != ((Class372) this).aShortArray5574) {
	    for (int i_96_ = 0;
		 i_96_ < ((Class372) this).aShortArray5574.length; i_96_++)
		class161.method3458(((Class372) this).aShortArray5574[i_96_],
				    ((Class372) this).aShortArray5579[i_96_]);
	}
	return class161;
    }
    
    public Class161 method6656() {
	Class161[] class161s = new Class161[5];
	int i = 0;
	synchronized (((Class350) ((Class372) this).aClass350_5578)
		      .aClass210_5386) {
	    for (int i_97_ = 0; i_97_ < 5; i_97_++) {
		if (-1 != ((Class372) this).anIntArray5582[i_97_])
		    class161s[i++]
			= Class161.method3448((((Class350) (((Class372) this)
							    .aClass350_5578))
					       .aClass210_5386),
					      (((Class372) this).anIntArray5582
					       [i_97_]),
					      0);
	    }
	}
	for (int i_98_ = 0; i_98_ < 5; i_98_++) {
	    if (class161s[i_98_] != null && class161s[i_98_].anInt1789 < 13)
		class161s[i_98_].method3464(2);
	}
	Class161 class161 = new Class161(class161s, i);
	if (((Class372) this).aShortArray5580 != null) {
	    for (int i_99_ = 0;
		 i_99_ < ((Class372) this).aShortArray5580.length; i_99_++)
		class161.method3457(((Class372) this).aShortArray5580[i_99_],
				    ((Class372) this).aShortArray5577[i_99_]);
	}
	if (null != ((Class372) this).aShortArray5574) {
	    for (int i_100_ = 0;
		 i_100_ < ((Class372) this).aShortArray5574.length; i_100_++)
		class161.method3458(((Class372) this).aShortArray5574[i_100_],
				    ((Class372) this).aShortArray5579[i_100_]);
	}
	return class161;
    }
    
    static final void sendIntInput/*method6657*/(ClientScriptData scriptData, int i) {
		String text = (String) scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331];
		int intValue = 0;
		if (Class551.method12096(text, 652586496)) {
			intValue = Class324.method5975(text, -952789660);
		}
		Class241_Sub27 packet = Class445_Sub26.makePacket(
				OutgoingOpcode.INT_INPUT_PACKET,
				client.aClass190_8340.packetCipher, 16711935);
		packet.data.writeInt(intValue, -516640367);
		client.aClass190_8340.sendPacket(packet, -1840039928);
    }
    
    static final void method6658(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881
		  .method14189((byte) 13);
    }
    
    public static Class241_Sub39_Sub12 method6659(byte i) {
	return Class573_Sub1.aClass241_Sub39_Sub12_7405;
    }
}
