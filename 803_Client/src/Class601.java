/* Class601 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class601
{
    public boolean aBool7726 = false;
    public int anInt7727;
    Class598 aClass598_7728;
    public int anInt7729;
    int[] anIntArray7730;
    public static JS5 ANIMATIONS_ARCHIVE;//aClass210_7731
    
    public int[] method13155(Class103 class103, int i, boolean bool,
			     byte i_0_) {
	if (((Class601) this).anIntArray7730 != null)
	    return ((Class601) this).anIntArray7730;
	long l = (long) (1186810875 * anInt7729 | i << 16 | (bool ? 262144 : 0)
			 | 1931687493 * class103.anInt1456 << 19);
	method13159(class103, i, bool, l);
	return ((Class601) this).anIntArray7730;
    }
    
    public int[] method13156(Class103 class103, int i, boolean bool) {
	if (((Class601) this).anIntArray7730 != null)
	    return ((Class601) this).anIntArray7730;
	long l = (long) (1186810875 * anInt7729 | i << 16 | (bool ? 262144 : 0)
			 | 1931687493 * class103.anInt1456 << 19);
	method13159(class103, i, bool, l);
	return ((Class601) this).anIntArray7730;
    }
    
    public Class168 method13157(Class103 class103, int i, boolean bool,
				byte i_1_) {
	long l = (long) (1186810875 * anInt7729 | i << 16 | (bool ? 262144 : 0)
			 | 1931687493 * class103.anInt1456 << 19);
	Class168 class168
	    = (Class168) ((Class598) ((Class601) this).aClass598_7728)
			     .aClass129_7709.get(l);
	if (class168 != null)
	    return class168;
	method13159(class103, i, bool, l);
	return (Class168) ((Class598) ((Class601) this).aClass598_7728)
			      .aClass129_7709.get(l);
    }
    
    void method13158(RSByteBuffer class241_sub3, int i, byte i_2_) {
	if (i == 1)
	    anInt7729 = class241_sub3.readBigSmart((byte) -78) * -977139917;
	else if (2 == i)
	    anInt7727 = class241_sub3.readTriByte(1771646547) * -908165309;
	else if (i == 3)
	    aBool7726 = true;
	else if (4 == i)
	    anInt7729 = 977139917;
    }
    
    void method13159(Class103 class103, int i, boolean bool, long l) {
	if (((Class598) ((Class601) this).aClass598_7728).aClass210_7706
		.method4250(anInt7729 * 1186810875, -327040491)) {
	    Class108 class108
		= Class160.method3437((((Class598)
					((Class601) this).aClass598_7728)
				       .aClass210_7706),
				      anInt7729 * 1186810875, 0);
	    if (class108 != null) {
		class108.method2724();
		if (bool)
		    class108.method2747();
		for (int i_3_ = 0; i_3_ < i; i_3_++)
		    class108.method2706();
		((Class601) this).anIntArray7730 = class108.method2707(false);
		if (987858283 * anInt7727 != 0) {
		    int i_4_ = (987858283 * anInt7727 & 0xff0000) >> 16;
		    int i_5_ = (anInt7727 * 987858283 & 0xff00) >> 8;
		    int i_6_ = anInt7727 * 987858283 & 0xff;
		    for (int i_7_ = 0;
			 i_7_ < ((Class601) this).anIntArray7730.length;
			 i_7_++) {
			int i_8_
			    = (((Class601) this).anIntArray7730[i_7_] >> 24
			       & 0xff);
			int i_9_ = 256 - i_8_;
			if (i_8_ != 0) {
			    int i_10_
				= (i_4_
				   * (((Class601) this).anIntArray7730[i_7_]
				      & 0xff0000)
				   * -16777216);
			    int i_11_
				= (i_5_
				   * (((Class601) this).anIntArray7730[i_7_]
				      & 0xff00)
				   * 16711680);
			    int i_12_ = (((Class601) this).anIntArray7730[i_7_]
					 & 0xff) * i_6_ * 65280;
			    int i_13_ = (i_10_ | i_11_ | i_12_) >>> 8;
			    if (255 == i_8_)
				((Class601) this).anIntArray7730[i_7_] = i_13_;
			    else {
				int i_14_
				    = ((Class601) this).anIntArray7730[i_7_];
				((Class601) this).anIntArray7730[i_7_]
				    = (i_8_ << 24
				       | (((i_8_ * (i_14_ & 0xff00ff)
					    + (i_13_ & 0xff00ff) * i_9_)
					   & ~0xff00ff)
					  + ((i_9_ * (i_13_ & 0xff00)
					      + (i_14_ & 0xff00) * i_8_)
					     & 0xff0000)) >> 8);
			    }
			}
		    }
		}
	    }
	    Class168 class168 = class103.method2289(class108, true);
	    if (class168 != null)
		((Class598) ((Class601) this).aClass598_7728)
		    .aClass129_7709.put(class168, l);
	}
    }
    
    void method13160(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_15_ = class241_sub3.readUnsignedByte((byte) -56);
	    if (0 == i_15_)
		break;
	    method13158(class241_sub3, i_15_, (byte) -126);
	}
    }
    
    public boolean method13161(int i) {
	return ((Class598) ((Class601) this).aClass598_7728).aClass210_7706
		   .method4250(1186810875 * anInt7729, -404484802);
    }
    
    void method13162(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -39);
	    if (0 == i)
		break;
	    method13158(class241_sub3, i, (byte) -57);
	}
    }
    
    void method13163(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt7729 = class241_sub3.readBigSmart((byte) 71) * -977139917;
	else if (2 == i)
	    anInt7727 = class241_sub3.readTriByte(1771646547) * -908165309;
	else if (i == 3)
	    aBool7726 = true;
	else if (4 == i)
	    anInt7729 = 977139917;
    }
    
    void method13164(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt7729 = class241_sub3.readBigSmart((byte) 33) * -977139917;
	else if (2 == i)
	    anInt7727 = class241_sub3.readTriByte(1771646547) * -908165309;
	else if (i == 3)
	    aBool7726 = true;
	else if (4 == i)
	    anInt7729 = 977139917;
    }
    
    public Class168 method13165(Class103 class103, int i, boolean bool) {
	long l = (long) (1186810875 * anInt7729 | i << 16 | (bool ? 262144 : 0)
			 | 1931687493 * class103.anInt1456 << 19);
	Class168 class168
	    = (Class168) ((Class598) ((Class601) this).aClass598_7728)
			     .aClass129_7709.get(l);
	if (class168 != null)
	    return class168;
	method13159(class103, i, bool, l);
	return (Class168) ((Class598) ((Class601) this).aClass598_7728)
			      .aClass129_7709.get(l);
    }
    
    public int[] method13166(Class103 class103, int i, boolean bool) {
	if (((Class601) this).anIntArray7730 != null)
	    return ((Class601) this).anIntArray7730;
	long l = (long) (1186810875 * anInt7729 | i << 16 | (bool ? 262144 : 0)
			 | 1931687493 * class103.anInt1456 << 19);
	method13159(class103, i, bool, l);
	return ((Class601) this).anIntArray7730;
    }
    
    Class601() {
	/* empty */
    }
    
    void method13167(Class103 class103, int i, boolean bool, long l) {
	if (((Class598) ((Class601) this).aClass598_7728).aClass210_7706
		.method4250(anInt7729 * 1186810875, -106468088)) {
	    Class108 class108
		= Class160.method3437((((Class598)
					((Class601) this).aClass598_7728)
				       .aClass210_7706),
				      anInt7729 * 1186810875, 0);
	    if (class108 != null) {
		class108.method2724();
		if (bool)
		    class108.method2747();
		for (int i_16_ = 0; i_16_ < i; i_16_++)
		    class108.method2706();
		((Class601) this).anIntArray7730 = class108.method2707(false);
		if (987858283 * anInt7727 != 0) {
		    int i_17_ = (987858283 * anInt7727 & 0xff0000) >> 16;
		    int i_18_ = (anInt7727 * 987858283 & 0xff00) >> 8;
		    int i_19_ = anInt7727 * 987858283 & 0xff;
		    for (int i_20_ = 0;
			 i_20_ < ((Class601) this).anIntArray7730.length;
			 i_20_++) {
			int i_21_
			    = (((Class601) this).anIntArray7730[i_20_] >> 24
			       & 0xff);
			int i_22_ = 256 - i_21_;
			if (i_21_ != 0) {
			    int i_23_
				= (i_17_
				   * (((Class601) this).anIntArray7730[i_20_]
				      & 0xff0000)
				   * -16777216);
			    int i_24_
				= (i_18_
				   * (((Class601) this).anIntArray7730[i_20_]
				      & 0xff00)
				   * 16711680);
			    int i_25_
				= ((((Class601) this).anIntArray7730[i_20_]
				    & 0xff)
				   * i_19_ * 65280);
			    int i_26_ = (i_23_ | i_24_ | i_25_) >>> 8;
			    if (255 == i_21_)
				((Class601) this).anIntArray7730[i_20_]
				    = i_26_;
			    else {
				int i_27_
				    = ((Class601) this).anIntArray7730[i_20_];
				((Class601) this).anIntArray7730[i_20_]
				    = (i_21_ << 24
				       | (((i_21_ * (i_27_ & 0xff00ff)
					    + (i_26_ & 0xff00ff) * i_22_)
					   & ~0xff00ff)
					  + ((i_22_ * (i_26_ & 0xff00)
					      + (i_27_ & 0xff00) * i_21_)
					     & 0xff0000)) >> 8);
			    }
			}
		    }
		}
	    }
	    Class168 class168 = class103.method2289(class108, true);
	    if (class168 != null)
		((Class598) ((Class601) this).aClass598_7728)
		    .aClass129_7709.put(class168, l);
	}
    }
    
    void method13168(Class103 class103, int i, boolean bool, long l) {
	if (((Class598) ((Class601) this).aClass598_7728).aClass210_7706
		.method4250(anInt7729 * 1186810875, -519721898)) {
	    Class108 class108
		= Class160.method3437((((Class598)
					((Class601) this).aClass598_7728)
				       .aClass210_7706),
				      anInt7729 * 1186810875, 0);
	    if (class108 != null) {
		class108.method2724();
		if (bool)
		    class108.method2747();
		for (int i_28_ = 0; i_28_ < i; i_28_++)
		    class108.method2706();
		((Class601) this).anIntArray7730 = class108.method2707(false);
		if (987858283 * anInt7727 != 0) {
		    int i_29_ = (987858283 * anInt7727 & 0xff0000) >> 16;
		    int i_30_ = (anInt7727 * 987858283 & 0xff00) >> 8;
		    int i_31_ = anInt7727 * 987858283 & 0xff;
		    for (int i_32_ = 0;
			 i_32_ < ((Class601) this).anIntArray7730.length;
			 i_32_++) {
			int i_33_
			    = (((Class601) this).anIntArray7730[i_32_] >> 24
			       & 0xff);
			int i_34_ = 256 - i_33_;
			if (i_33_ != 0) {
			    int i_35_
				= (i_29_
				   * (((Class601) this).anIntArray7730[i_32_]
				      & 0xff0000)
				   * -16777216);
			    int i_36_
				= (i_30_
				   * (((Class601) this).anIntArray7730[i_32_]
				      & 0xff00)
				   * 16711680);
			    int i_37_
				= ((((Class601) this).anIntArray7730[i_32_]
				    & 0xff)
				   * i_31_ * 65280);
			    int i_38_ = (i_35_ | i_36_ | i_37_) >>> 8;
			    if (255 == i_33_)
				((Class601) this).anIntArray7730[i_32_]
				    = i_38_;
			    else {
				int i_39_
				    = ((Class601) this).anIntArray7730[i_32_];
				((Class601) this).anIntArray7730[i_32_]
				    = (i_33_ << 24
				       | (((i_33_ * (i_39_ & 0xff00ff)
					    + (i_38_ & 0xff00ff) * i_34_)
					   & ~0xff00ff)
					  + ((i_34_ * (i_38_ & 0xff00)
					      + (i_39_ & 0xff00) * i_33_)
					     & 0xff0000)) >> 8);
			    }
			}
		    }
		}
	    }
	    Class168 class168 = class103.method2289(class108, true);
	    if (class168 != null)
		((Class598) ((Class601) this).aClass598_7728)
		    .aClass129_7709.put(class168, l);
	}
    }
    
    public boolean method13169() {
	return ((Class598) ((Class601) this).aClass598_7728).aClass210_7706
		   .method4250(1186810875 * anInt7729, 579656378);
    }
}
