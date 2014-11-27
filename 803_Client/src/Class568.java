/* Class568 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public final class Class568
{
    int anInt7332;
    Class414 aClass414_7333 = null;
    Class414 aClass414_7334 = null;
    static byte[] aByteArray7335 = new byte[520];
    int anInt7336 = -1953180040;
    
    public byte[] method12460(int i) {
	synchronized (((Class568) this).aClass414_7333) {
	    byte[] is;
	    try {
		if (((Class568) this).aClass414_7334.method7468((byte) 73)
		    < (long) (i * 6 + 6)) {
		    byte[] is_0_ = null;
		    return is_0_;
		}
		((Class568) this).aClass414_7334.method7463((long) (i * 6));
		((Class568) this).aClass414_7334.method7470(aByteArray7335, 0,
							    6, 1817080518);
		int i_1_ = (((aByteArray7335[1] & 0xff) << 8)
			    + ((aByteArray7335[0] & 0xff) << 16)
			    + (aByteArray7335[2] & 0xff));
		int i_2_ = (((aByteArray7335[3] & 0xff) << 16)
			    + ((aByteArray7335[4] & 0xff) << 8)
			    + (aByteArray7335[5] & 0xff));
		if (i_1_ < 0
		    || i_1_ > ((Class568) this).anInt7336 * -446148685) {
		    byte[] is_3_ = null;
		    return is_3_;
		}
		if (i_2_ <= 0
		    || (long) i_2_ > ((Class568) this).aClass414_7333
					 .method7468((byte) 104) / 520L) {
		    byte[] is_4_ = null;
		    return is_4_;
		}
		byte[] is_5_ = new byte[i_1_];
		int i_6_ = 0;
		int i_7_ = 0;
		while (i_6_ < i_1_) {
		    if (i_2_ == 0) {
			byte[] is_8_ = null;
			return is_8_;
		    }
		    ((Class568) this).aClass414_7333
			.method7463(520L * (long) i_2_);
		    int i_9_ = i_1_ - i_6_;
		    int i_10_;
		    int i_11_;
		    int i_12_;
		    int i_13_;
		    int i_14_;
		    if (i > 65535) {
			if (i_9_ > 510)
			    i_9_ = 510;
			i_10_ = 10;
			((Class568) this).aClass414_7333.method7470
			    (aByteArray7335, 0, i_9_ + i_10_, 1514103022);
			i_11_ = (((aByteArray7335[2] & 0xff) << 8)
				 + (((aByteArray7335[1] & 0xff) << 16)
				    + ((aByteArray7335[0] & 0xff) << 24))
				 + (aByteArray7335[3] & 0xff));
			i_12_ = ((aByteArray7335[5] & 0xff)
				 + ((aByteArray7335[4] & 0xff) << 8));
			i_13_ = (((aByteArray7335[6] & 0xff) << 16)
				 + ((aByteArray7335[7] & 0xff) << 8)
				 + (aByteArray7335[8] & 0xff));
			i_14_ = aByteArray7335[9] & 0xff;
		    } else {
			if (i_9_ > 512)
			    i_9_ = 512;
			i_10_ = 8;
			((Class568) this).aClass414_7333.method7470
			    (aByteArray7335, 0, i_10_ + i_9_, 878435864);
			i_11_ = ((aByteArray7335[1] & 0xff)
				 + ((aByteArray7335[0] & 0xff) << 8));
			i_12_ = (((aByteArray7335[2] & 0xff) << 8)
				 + (aByteArray7335[3] & 0xff));
			i_13_ = (((aByteArray7335[5] & 0xff) << 8)
				 + ((aByteArray7335[4] & 0xff) << 16)
				 + (aByteArray7335[6] & 0xff));
			i_14_ = aByteArray7335[7] & 0xff;
		    }
		    if (i != i_11_ || i_12_ != i_7_
			|| i_14_ != ((Class568) this).anInt7332 * 826090209) {
			byte[] is_15_ = null;
			return is_15_;
		    }
		    if (i_13_ < 0
			|| (long) i_13_ > ((Class568) this).aClass414_7333
					      .method7468((byte) 49) / 520L) {
			byte[] is_16_ = null;
			return is_16_;
		    }
		    int i_17_ = i_9_ + i_10_;
		    for (int i_18_ = i_10_; i_18_ < i_17_; i_18_++)
			is_5_[i_6_++] = aByteArray7335[i_18_];
		    i_2_ = i_13_;
		    i_7_++;
		}
		is = is_5_;
	    } catch (IOException ioexception) {
		byte[] is_19_ = null;
		return is_19_;
	    }
	    return is;
	}
    }
    
    public byte[] method12461(int i, int i_20_) {
	synchronized (((Class568) this).aClass414_7333) {
	    byte[] is;
	    try {
		if (((Class568) this).aClass414_7334.method7468((byte) 2)
		    < (long) (i * 6 + 6)) {
		    byte[] is_21_ = null;
		    return is_21_;
		}
		((Class568) this).aClass414_7334.method7463((long) (i * 6));
		((Class568) this).aClass414_7334.method7470(aByteArray7335, 0,
							    6, 1594994034);
		int i_22_ = (((aByteArray7335[1] & 0xff) << 8)
			     + ((aByteArray7335[0] & 0xff) << 16)
			     + (aByteArray7335[2] & 0xff));
		int i_23_ = (((aByteArray7335[3] & 0xff) << 16)
			     + ((aByteArray7335[4] & 0xff) << 8)
			     + (aByteArray7335[5] & 0xff));
		if (i_22_ < 0
		    || i_22_ > ((Class568) this).anInt7336 * -446148685) {
		    byte[] is_24_ = null;
		    return is_24_;
		}
		if (i_23_ <= 0
		    || (long) i_23_ > ((Class568) this).aClass414_7333
					  .method7468((byte) 12) / 520L) {
		    byte[] is_25_ = null;
		    return is_25_;
		}
		byte[] is_26_ = new byte[i_22_];
		int i_27_ = 0;
		int i_28_ = 0;
		while (i_27_ < i_22_) {
		    if (i_23_ == 0) {
			byte[] is_29_ = null;
			return is_29_;
		    }
		    ((Class568) this).aClass414_7333
			.method7463(520L * (long) i_23_);
		    int i_30_ = i_22_ - i_27_;
		    int i_31_;
		    int i_32_;
		    int i_33_;
		    int i_34_;
		    int i_35_;
		    if (i > 65535) {
			if (i_30_ > 510)
			    i_30_ = 510;
			i_31_ = 10;
			((Class568) this).aClass414_7333.method7470
			    (aByteArray7335, 0, i_30_ + i_31_, 2029529290);
			i_32_ = (((aByteArray7335[2] & 0xff) << 8)
				 + (((aByteArray7335[1] & 0xff) << 16)
				    + ((aByteArray7335[0] & 0xff) << 24))
				 + (aByteArray7335[3] & 0xff));
			i_33_ = ((aByteArray7335[5] & 0xff)
				 + ((aByteArray7335[4] & 0xff) << 8));
			i_34_ = (((aByteArray7335[6] & 0xff) << 16)
				 + ((aByteArray7335[7] & 0xff) << 8)
				 + (aByteArray7335[8] & 0xff));
			i_35_ = aByteArray7335[9] & 0xff;
		    } else {
			if (i_30_ > 512)
			    i_30_ = 512;
			i_31_ = 8;
			((Class568) this).aClass414_7333.method7470
			    (aByteArray7335, 0, i_31_ + i_30_, 1756003099);
			i_32_ = ((aByteArray7335[1] & 0xff)
				 + ((aByteArray7335[0] & 0xff) << 8));
			i_33_ = (((aByteArray7335[2] & 0xff) << 8)
				 + (aByteArray7335[3] & 0xff));
			i_34_ = (((aByteArray7335[5] & 0xff) << 8)
				 + ((aByteArray7335[4] & 0xff) << 16)
				 + (aByteArray7335[6] & 0xff));
			i_35_ = aByteArray7335[7] & 0xff;
		    }
		    if (i != i_32_ || i_33_ != i_28_
			|| i_35_ != ((Class568) this).anInt7332 * 826090209) {
			byte[] is_36_ = null;
			return is_36_;
		    }
		    if (i_34_ < 0
			|| (long) i_34_ > ((Class568) this).aClass414_7333
					      .method7468((byte) 122) / 520L) {
			byte[] is_37_ = null;
			return is_37_;
		    }
		    int i_38_ = i_30_ + i_31_;
		    for (int i_39_ = i_31_; i_39_ < i_38_; i_39_++)
			is_26_[i_27_++] = aByteArray7335[i_39_];
		    i_23_ = i_34_;
		    i_28_++;
		}
		is = is_26_;
	    } catch (IOException ioexception) {
		byte[] is_40_ = null;
		return is_40_;
	    }
	    return is;
	}
    }
    
    public boolean method12462(int i, byte[] is, int i_41_) {
	synchronized (((Class568) this).aClass414_7333) {
	    if (i_41_ < 0 || i_41_ > -446148685 * ((Class568) this).anInt7336)
		throw new IllegalArgumentException
			  (new StringBuilder().append("").append
			       (826090209 * ((Class568) this).anInt7332).append
			       (',').append
			       (i).append
			       (',').append
			       (i_41_).toString());
	    boolean bool = method12463(i, is, i_41_, true, 1413779785);
	    if (!bool)
		bool = method12463(i, is, i_41_, false, -857973265);
	    boolean bool_42_ = bool;
	    return bool_42_;
	}
    }
    
    boolean method12463(int i, byte[] is, int i_43_, boolean bool, int i_44_) {
	synchronized (((Class568) this).aClass414_7333) {
	    boolean bool_45_;
	    try {
		int i_46_;
		if (bool) {
		    if (((Class568) this).aClass414_7334.method7468((byte) 72)
			< (long) (6 + i * 6)) {
			boolean bool_47_ = false;
			return bool_47_;
		    }
		    ((Class568) this).aClass414_7334.method7463((long) (i
									* 6));
		    ((Class568) this).aClass414_7334
			.method7470(aByteArray7335, 0, 6, 575742848);
		    i_46_ = (((aByteArray7335[3] & 0xff) << 16)
			     + ((aByteArray7335[4] & 0xff) << 8)
			     + (aByteArray7335[5] & 0xff));
		    if (i_46_ <= 0
			|| (long) i_46_ > ((Class568) this).aClass414_7333
					      .method7468((byte) 45) / 520L) {
			boolean bool_48_ = false;
			return bool_48_;
		    }
		} else {
		    i_46_ = (int) ((((Class568) this).aClass414_7333
					.method7468((byte) 52)
				    + 519L)
				   / 520L);
		    if (0 == i_46_)
			i_46_ = 1;
		}
		aByteArray7335[0] = (byte) (i_43_ >> 16);
		aByteArray7335[1] = (byte) (i_43_ >> 8);
		aByteArray7335[2] = (byte) i_43_;
		aByteArray7335[3] = (byte) (i_46_ >> 16);
		aByteArray7335[4] = (byte) (i_46_ >> 8);
		aByteArray7335[5] = (byte) i_46_;
		((Class568) this).aClass414_7334.method7463((long) (i * 6));
		((Class568) this).aClass414_7334.method7467(aByteArray7335, 0,
							    6, (short) 28726);
		int i_49_ = 0;
		int i_50_ = 0;
		while (i_49_ < i_43_) {
		    int i_51_ = 0;
		    if (bool) {
			((Class568) this).aClass414_7333
			    .method7463((long) i_46_ * 520L);
			int i_52_;
			int i_53_;
			int i_54_;
			if (i > 65535) {
			    try {
				((Class568) this).aClass414_7333.method7470
				    (aByteArray7335, 0, 10, 743118589);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_52_ = (((aByteArray7335[2] & 0xff) << 8)
				     + (((aByteArray7335[0] & 0xff) << 24)
					+ ((aByteArray7335[1] & 0xff) << 16))
				     + (aByteArray7335[3] & 0xff));
			    i_53_ = (((aByteArray7335[4] & 0xff) << 8)
				     + (aByteArray7335[5] & 0xff));
			    i_51_ = (((aByteArray7335[6] & 0xff) << 16)
				     + ((aByteArray7335[7] & 0xff) << 8)
				     + (aByteArray7335[8] & 0xff));
			    i_54_ = aByteArray7335[9] & 0xff;
			} else {
			    try {
				((Class568) this).aClass414_7333.method7470
				    (aByteArray7335, 0, 8, 842951777);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_52_ = (((aByteArray7335[0] & 0xff) << 8)
				     + (aByteArray7335[1] & 0xff));
			    i_53_ = ((aByteArray7335[3] & 0xff)
				     + ((aByteArray7335[2] & 0xff) << 8));
			    i_51_ = ((aByteArray7335[6] & 0xff)
				     + (((aByteArray7335[4] & 0xff) << 16)
					+ ((aByteArray7335[5] & 0xff) << 8)));
			    i_54_ = aByteArray7335[7] & 0xff;
			}
			if (i_52_ != i || i_50_ != i_53_
			    || (((Class568) this).anInt7332 * 826090209
				!= i_54_)) {
			    boolean bool_55_ = false;
			    return bool_55_;
			}
			if (i_51_ < 0
			    || (long) i_51_ > (((Class568) this)
						   .aClass414_7333
						   .method7468((byte) 6)
					       / 520L)) {
			    boolean bool_56_ = false;
			    return bool_56_;
			}
		    }
		    if (i_51_ == 0) {
			bool = false;
			i_51_ = (int) ((((Class568) this).aClass414_7333
					    .method7468((byte) 107)
					+ 519L)
				       / 520L);
			if (i_51_ == 0)
			    i_51_++;
			if (i_51_ == i_46_)
			    i_51_++;
		    }
		    if (i > 65535) {
			if (i_43_ - i_49_ <= 510)
			    i_51_ = 0;
			aByteArray7335[0] = (byte) (i >> 24);
			aByteArray7335[1] = (byte) (i >> 16);
			aByteArray7335[2] = (byte) (i >> 8);
			aByteArray7335[3] = (byte) i;
			aByteArray7335[4] = (byte) (i_50_ >> 8);
			aByteArray7335[5] = (byte) i_50_;
			aByteArray7335[6] = (byte) (i_51_ >> 16);
			aByteArray7335[7] = (byte) (i_51_ >> 8);
			aByteArray7335[8] = (byte) i_51_;
			aByteArray7335[9]
			    = (byte) (826090209 * ((Class568) this).anInt7332);
			((Class568) this).aClass414_7333
			    .method7463(520L * (long) i_46_);
			((Class568) this).aClass414_7333
			    .method7467(aByteArray7335, 0, 10, (short) 23343);
			int i_57_ = i_43_ - i_49_;
			if (i_57_ > 510)
			    i_57_ = 510;
			((Class568) this).aClass414_7333
			    .method7467(is, i_49_, i_57_, (short) 6741);
			i_49_ += i_57_;
		    } else {
			if (i_43_ - i_49_ <= 512)
			    i_51_ = 0;
			aByteArray7335[0] = (byte) (i >> 8);
			aByteArray7335[1] = (byte) i;
			aByteArray7335[2] = (byte) (i_50_ >> 8);
			aByteArray7335[3] = (byte) i_50_;
			aByteArray7335[4] = (byte) (i_51_ >> 16);
			aByteArray7335[5] = (byte) (i_51_ >> 8);
			aByteArray7335[6] = (byte) i_51_;
			aByteArray7335[7]
			    = (byte) (826090209 * ((Class568) this).anInt7332);
			((Class568) this).aClass414_7333
			    .method7463((long) i_46_ * 520L);
			((Class568) this).aClass414_7333
			    .method7467(aByteArray7335, 0, 8, (short) 1148);
			int i_58_ = i_43_ - i_49_;
			if (i_58_ > 512)
			    i_58_ = 512;
			((Class568) this).aClass414_7333
			    .method7467(is, i_49_, i_58_, (short) 29466);
			i_49_ += i_58_;
		    }
		    i_46_ = i_51_;
		    i_50_++;
		}
		bool_45_ = true;
	    } catch (IOException ioexception) {
		boolean bool_59_ = false;
		return bool_59_;
	    }
	    return bool_45_;
	}
    }
    
    public String toString() {
	return new StringBuilder().append("").append
		   (826090209 * ((Class568) this).anInt7332).toString();
    }
    
    public boolean method12464(int i, byte[] is, int i_60_) {
	synchronized (((Class568) this).aClass414_7333) {
	    if (i_60_ < 0 || i_60_ > -446148685 * ((Class568) this).anInt7336)
		throw new IllegalArgumentException
			  (new StringBuilder().append("").append
			       (826090209 * ((Class568) this).anInt7332).append
			       (',').append
			       (i).append
			       (',').append
			       (i_60_).toString());
	    boolean bool = method12463(i, is, i_60_, true, 1889703141);
	    if (!bool)
		bool = method12463(i, is, i_60_, false, 764113192);
	    boolean bool_61_ = bool;
	    return bool_61_;
	}
    }
    
    public byte[] method12465(int i) {
	synchronized (((Class568) this).aClass414_7333) {
	    byte[] is;
	    try {
		if (((Class568) this).aClass414_7334.method7468((byte) 54)
		    < (long) (i * 6 + 6)) {
		    byte[] is_62_ = null;
		    return is_62_;
		}
		((Class568) this).aClass414_7334.method7463((long) (i * 6));
		((Class568) this).aClass414_7334.method7470(aByteArray7335, 0,
							    6, 1045915913);
		int i_63_ = (((aByteArray7335[1] & 0xff) << 8)
			     + ((aByteArray7335[0] & 0xff) << 16)
			     + (aByteArray7335[2] & 0xff));
		int i_64_ = (((aByteArray7335[3] & 0xff) << 16)
			     + ((aByteArray7335[4] & 0xff) << 8)
			     + (aByteArray7335[5] & 0xff));
		if (i_63_ < 0
		    || i_63_ > ((Class568) this).anInt7336 * -446148685) {
		    byte[] is_65_ = null;
		    return is_65_;
		}
		if (i_64_ <= 0
		    || (long) i_64_ > ((Class568) this).aClass414_7333
					  .method7468((byte) 40) / 520L) {
		    byte[] is_66_ = null;
		    return is_66_;
		}
		byte[] is_67_ = new byte[i_63_];
		int i_68_ = 0;
		int i_69_ = 0;
		while (i_68_ < i_63_) {
		    if (i_64_ == 0) {
			byte[] is_70_ = null;
			return is_70_;
		    }
		    ((Class568) this).aClass414_7333
			.method7463(520L * (long) i_64_);
		    int i_71_ = i_63_ - i_68_;
		    int i_72_;
		    int i_73_;
		    int i_74_;
		    int i_75_;
		    int i_76_;
		    if (i > 65535) {
			if (i_71_ > 510)
			    i_71_ = 510;
			i_72_ = 10;
			((Class568) this).aClass414_7333.method7470
			    (aByteArray7335, 0, i_71_ + i_72_, 1944467526);
			i_73_ = (((aByteArray7335[2] & 0xff) << 8)
				 + (((aByteArray7335[1] & 0xff) << 16)
				    + ((aByteArray7335[0] & 0xff) << 24))
				 + (aByteArray7335[3] & 0xff));
			i_74_ = ((aByteArray7335[5] & 0xff)
				 + ((aByteArray7335[4] & 0xff) << 8));
			i_75_ = (((aByteArray7335[6] & 0xff) << 16)
				 + ((aByteArray7335[7] & 0xff) << 8)
				 + (aByteArray7335[8] & 0xff));
			i_76_ = aByteArray7335[9] & 0xff;
		    } else {
			if (i_71_ > 512)
			    i_71_ = 512;
			i_72_ = 8;
			((Class568) this).aClass414_7333.method7470
			    (aByteArray7335, 0, i_72_ + i_71_, 1408971345);
			i_73_ = ((aByteArray7335[1] & 0xff)
				 + ((aByteArray7335[0] & 0xff) << 8));
			i_74_ = (((aByteArray7335[2] & 0xff) << 8)
				 + (aByteArray7335[3] & 0xff));
			i_75_ = (((aByteArray7335[5] & 0xff) << 8)
				 + ((aByteArray7335[4] & 0xff) << 16)
				 + (aByteArray7335[6] & 0xff));
			i_76_ = aByteArray7335[7] & 0xff;
		    }
		    if (i != i_73_ || i_74_ != i_69_
			|| i_76_ != ((Class568) this).anInt7332 * 826090209) {
			byte[] is_77_ = null;
			return is_77_;
		    }
		    if (i_75_ < 0
			|| (long) i_75_ > ((Class568) this).aClass414_7333
					      .method7468((byte) 52) / 520L) {
			byte[] is_78_ = null;
			return is_78_;
		    }
		    int i_79_ = i_71_ + i_72_;
		    for (int i_80_ = i_72_; i_80_ < i_79_; i_80_++)
			is_67_[i_68_++] = aByteArray7335[i_80_];
		    i_64_ = i_75_;
		    i_69_++;
		}
		is = is_67_;
	    } catch (IOException ioexception) {
		byte[] is_81_ = null;
		return is_81_;
	    }
	    return is;
	}
    }
    
    public String method12466() {
	return new StringBuilder().append("").append
		   (826090209 * ((Class568) this).anInt7332).toString();
    }
    
    public byte[] method12467(int i) {
	synchronized (((Class568) this).aClass414_7333) {
	    byte[] is;
	    try {
		if (((Class568) this).aClass414_7334.method7468((byte) 83)
		    < (long) (i * 6 + 6)) {
		    byte[] is_82_ = null;
		    return is_82_;
		}
		((Class568) this).aClass414_7334.method7463((long) (i * 6));
		((Class568) this).aClass414_7334.method7470(aByteArray7335, 0,
							    6, 733239620);
		int i_83_ = (((aByteArray7335[1] & 0xff) << 8)
			     + ((aByteArray7335[0] & 0xff) << 16)
			     + (aByteArray7335[2] & 0xff));
		int i_84_ = (((aByteArray7335[3] & 0xff) << 16)
			     + ((aByteArray7335[4] & 0xff) << 8)
			     + (aByteArray7335[5] & 0xff));
		if (i_83_ < 0
		    || i_83_ > ((Class568) this).anInt7336 * -446148685) {
		    byte[] is_85_ = null;
		    return is_85_;
		}
		if (i_84_ <= 0
		    || (long) i_84_ > ((Class568) this).aClass414_7333
					  .method7468((byte) 53) / 520L) {
		    byte[] is_86_ = null;
		    return is_86_;
		}
		byte[] is_87_ = new byte[i_83_];
		int i_88_ = 0;
		int i_89_ = 0;
		while (i_88_ < i_83_) {
		    if (i_84_ == 0) {
			byte[] is_90_ = null;
			return is_90_;
		    }
		    ((Class568) this).aClass414_7333
			.method7463(520L * (long) i_84_);
		    int i_91_ = i_83_ - i_88_;
		    int i_92_;
		    int i_93_;
		    int i_94_;
		    int i_95_;
		    int i_96_;
		    if (i > 65535) {
			if (i_91_ > 510)
			    i_91_ = 510;
			i_92_ = 10;
			((Class568) this).aClass414_7333.method7470
			    (aByteArray7335, 0, i_91_ + i_92_, 1847906040);
			i_93_ = (((aByteArray7335[2] & 0xff) << 8)
				 + (((aByteArray7335[1] & 0xff) << 16)
				    + ((aByteArray7335[0] & 0xff) << 24))
				 + (aByteArray7335[3] & 0xff));
			i_94_ = ((aByteArray7335[5] & 0xff)
				 + ((aByteArray7335[4] & 0xff) << 8));
			i_95_ = (((aByteArray7335[6] & 0xff) << 16)
				 + ((aByteArray7335[7] & 0xff) << 8)
				 + (aByteArray7335[8] & 0xff));
			i_96_ = aByteArray7335[9] & 0xff;
		    } else {
			if (i_91_ > 512)
			    i_91_ = 512;
			i_92_ = 8;
			((Class568) this).aClass414_7333.method7470
			    (aByteArray7335, 0, i_92_ + i_91_, 1124601618);
			i_93_ = ((aByteArray7335[1] & 0xff)
				 + ((aByteArray7335[0] & 0xff) << 8));
			i_94_ = (((aByteArray7335[2] & 0xff) << 8)
				 + (aByteArray7335[3] & 0xff));
			i_95_ = (((aByteArray7335[5] & 0xff) << 8)
				 + ((aByteArray7335[4] & 0xff) << 16)
				 + (aByteArray7335[6] & 0xff));
			i_96_ = aByteArray7335[7] & 0xff;
		    }
		    if (i != i_93_ || i_94_ != i_89_
			|| i_96_ != ((Class568) this).anInt7332 * 826090209) {
			byte[] is_97_ = null;
			return is_97_;
		    }
		    if (i_95_ < 0
			|| (long) i_95_ > ((Class568) this).aClass414_7333
					      .method7468((byte) 44) / 520L) {
			byte[] is_98_ = null;
			return is_98_;
		    }
		    int i_99_ = i_91_ + i_92_;
		    for (int i_100_ = i_92_; i_100_ < i_99_; i_100_++)
			is_87_[i_88_++] = aByteArray7335[i_100_];
		    i_84_ = i_95_;
		    i_89_++;
		}
		is = is_87_;
	    } catch (IOException ioexception) {
		byte[] is_101_ = null;
		return is_101_;
	    }
	    return is;
	}
    }
    
    public byte[] method12468(int i) {
	synchronized (((Class568) this).aClass414_7333) {
	    byte[] is;
	    try {
		if (((Class568) this).aClass414_7334.method7468((byte) 4)
		    < (long) (i * 6 + 6)) {
		    byte[] is_102_ = null;
		    return is_102_;
		}
		((Class568) this).aClass414_7334.method7463((long) (i * 6));
		((Class568) this).aClass414_7334.method7470(aByteArray7335, 0,
							    6, 634113503);
		int i_103_ = (((aByteArray7335[1] & 0xff) << 8)
			      + ((aByteArray7335[0] & 0xff) << 16)
			      + (aByteArray7335[2] & 0xff));
		int i_104_ = (((aByteArray7335[3] & 0xff) << 16)
			      + ((aByteArray7335[4] & 0xff) << 8)
			      + (aByteArray7335[5] & 0xff));
		if (i_103_ < 0
		    || i_103_ > ((Class568) this).anInt7336 * -446148685) {
		    byte[] is_105_ = null;
		    return is_105_;
		}
		if (i_104_ <= 0
		    || (long) i_104_ > ((Class568) this).aClass414_7333
					   .method7468((byte) 6) / 520L) {
		    byte[] is_106_ = null;
		    return is_106_;
		}
		byte[] is_107_ = new byte[i_103_];
		int i_108_ = 0;
		int i_109_ = 0;
		while (i_108_ < i_103_) {
		    if (i_104_ == 0) {
			byte[] is_110_ = null;
			return is_110_;
		    }
		    ((Class568) this).aClass414_7333
			.method7463(520L * (long) i_104_);
		    int i_111_ = i_103_ - i_108_;
		    int i_112_;
		    int i_113_;
		    int i_114_;
		    int i_115_;
		    int i_116_;
		    if (i > 65535) {
			if (i_111_ > 510)
			    i_111_ = 510;
			i_112_ = 10;
			((Class568) this).aClass414_7333.method7470
			    (aByteArray7335, 0, i_111_ + i_112_, 1241582534);
			i_113_ = (((aByteArray7335[2] & 0xff) << 8)
				  + (((aByteArray7335[1] & 0xff) << 16)
				     + ((aByteArray7335[0] & 0xff) << 24))
				  + (aByteArray7335[3] & 0xff));
			i_114_ = ((aByteArray7335[5] & 0xff)
				  + ((aByteArray7335[4] & 0xff) << 8));
			i_115_ = (((aByteArray7335[6] & 0xff) << 16)
				  + ((aByteArray7335[7] & 0xff) << 8)
				  + (aByteArray7335[8] & 0xff));
			i_116_ = aByteArray7335[9] & 0xff;
		    } else {
			if (i_111_ > 512)
			    i_111_ = 512;
			i_112_ = 8;
			((Class568) this).aClass414_7333.method7470
			    (aByteArray7335, 0, i_112_ + i_111_, 2112445415);
			i_113_ = ((aByteArray7335[1] & 0xff)
				  + ((aByteArray7335[0] & 0xff) << 8));
			i_114_ = (((aByteArray7335[2] & 0xff) << 8)
				  + (aByteArray7335[3] & 0xff));
			i_115_ = (((aByteArray7335[5] & 0xff) << 8)
				  + ((aByteArray7335[4] & 0xff) << 16)
				  + (aByteArray7335[6] & 0xff));
			i_116_ = aByteArray7335[7] & 0xff;
		    }
		    if (i != i_113_ || i_114_ != i_109_
			|| i_116_ != ((Class568) this).anInt7332 * 826090209) {
			byte[] is_117_ = null;
			return is_117_;
		    }
		    if (i_115_ < 0
			|| (long) i_115_ > ((Class568) this).aClass414_7333
					       .method7468((byte) 62) / 520L) {
			byte[] is_118_ = null;
			return is_118_;
		    }
		    int i_119_ = i_111_ + i_112_;
		    for (int i_120_ = i_112_; i_120_ < i_119_; i_120_++)
			is_107_[i_108_++] = aByteArray7335[i_120_];
		    i_104_ = i_115_;
		    i_109_++;
		}
		is = is_107_;
	    } catch (IOException ioexception) {
		byte[] is_121_ = null;
		return is_121_;
	    }
	    return is;
	}
    }
    
    public String method12469() {
	return new StringBuilder().append("").append
		   (826090209 * ((Class568) this).anInt7332).toString();
    }
    
    boolean method12470(int i, byte[] is, int i_122_, boolean bool) {
	synchronized (((Class568) this).aClass414_7333) {
	    boolean bool_123_;
	    try {
		int i_124_;
		if (bool) {
		    if (((Class568) this).aClass414_7334.method7468((byte) 2)
			< (long) (6 + i * 6)) {
			boolean bool_125_ = false;
			return bool_125_;
		    }
		    ((Class568) this).aClass414_7334.method7463((long) (i
									* 6));
		    ((Class568) this).aClass414_7334
			.method7470(aByteArray7335, 0, 6, 809765530);
		    i_124_ = (((aByteArray7335[3] & 0xff) << 16)
			      + ((aByteArray7335[4] & 0xff) << 8)
			      + (aByteArray7335[5] & 0xff));
		    if (i_124_ <= 0
			|| (long) i_124_ > ((Class568) this).aClass414_7333
					       .method7468((byte) 27) / 520L) {
			boolean bool_126_ = false;
			return bool_126_;
		    }
		} else {
		    i_124_ = (int) ((((Class568) this).aClass414_7333
					 .method7468((byte) 107)
				     + 519L)
				    / 520L);
		    if (0 == i_124_)
			i_124_ = 1;
		}
		aByteArray7335[0] = (byte) (i_122_ >> 16);
		aByteArray7335[1] = (byte) (i_122_ >> 8);
		aByteArray7335[2] = (byte) i_122_;
		aByteArray7335[3] = (byte) (i_124_ >> 16);
		aByteArray7335[4] = (byte) (i_124_ >> 8);
		aByteArray7335[5] = (byte) i_124_;
		((Class568) this).aClass414_7334.method7463((long) (i * 6));
		((Class568) this).aClass414_7334.method7467(aByteArray7335, 0,
							    6, (short) 30283);
		int i_127_ = 0;
		int i_128_ = 0;
		while (i_127_ < i_122_) {
		    int i_129_ = 0;
		    if (bool) {
			((Class568) this).aClass414_7333
			    .method7463((long) i_124_ * 520L);
			int i_130_;
			int i_131_;
			int i_132_;
			if (i > 65535) {
			    try {
				((Class568) this).aClass414_7333.method7470
				    (aByteArray7335, 0, 10, 545024762);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_130_ = (((aByteArray7335[2] & 0xff) << 8)
				      + (((aByteArray7335[0] & 0xff) << 24)
					 + ((aByteArray7335[1] & 0xff) << 16))
				      + (aByteArray7335[3] & 0xff));
			    i_131_ = (((aByteArray7335[4] & 0xff) << 8)
				      + (aByteArray7335[5] & 0xff));
			    i_129_ = (((aByteArray7335[6] & 0xff) << 16)
				      + ((aByteArray7335[7] & 0xff) << 8)
				      + (aByteArray7335[8] & 0xff));
			    i_132_ = aByteArray7335[9] & 0xff;
			} else {
			    try {
				((Class568) this).aClass414_7333.method7470
				    (aByteArray7335, 0, 8, 1851224510);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_130_ = (((aByteArray7335[0] & 0xff) << 8)
				      + (aByteArray7335[1] & 0xff));
			    i_131_ = ((aByteArray7335[3] & 0xff)
				      + ((aByteArray7335[2] & 0xff) << 8));
			    i_129_ = ((aByteArray7335[6] & 0xff)
				      + (((aByteArray7335[4] & 0xff) << 16)
					 + ((aByteArray7335[5] & 0xff) << 8)));
			    i_132_ = aByteArray7335[7] & 0xff;
			}
			if (i_130_ != i || i_128_ != i_131_
			    || (((Class568) this).anInt7332 * 826090209
				!= i_132_)) {
			    boolean bool_133_ = false;
			    return bool_133_;
			}
			if (i_129_ < 0
			    || ((long) i_129_
				> ((Class568) this).aClass414_7333
				      .method7468((byte) 111) / 520L)) {
			    boolean bool_134_ = false;
			    return bool_134_;
			}
		    }
		    if (i_129_ == 0) {
			bool = false;
			i_129_ = (int) ((((Class568) this).aClass414_7333
					     .method7468((byte) 91)
					 + 519L)
					/ 520L);
			if (i_129_ == 0)
			    i_129_++;
			if (i_129_ == i_124_)
			    i_129_++;
		    }
		    if (i > 65535) {
			if (i_122_ - i_127_ <= 510)
			    i_129_ = 0;
			aByteArray7335[0] = (byte) (i >> 24);
			aByteArray7335[1] = (byte) (i >> 16);
			aByteArray7335[2] = (byte) (i >> 8);
			aByteArray7335[3] = (byte) i;
			aByteArray7335[4] = (byte) (i_128_ >> 8);
			aByteArray7335[5] = (byte) i_128_;
			aByteArray7335[6] = (byte) (i_129_ >> 16);
			aByteArray7335[7] = (byte) (i_129_ >> 8);
			aByteArray7335[8] = (byte) i_129_;
			aByteArray7335[9]
			    = (byte) (826090209 * ((Class568) this).anInt7332);
			((Class568) this).aClass414_7333
			    .method7463(520L * (long) i_124_);
			((Class568) this).aClass414_7333
			    .method7467(aByteArray7335, 0, 10, (short) 17467);
			int i_135_ = i_122_ - i_127_;
			if (i_135_ > 510)
			    i_135_ = 510;
			((Class568) this).aClass414_7333
			    .method7467(is, i_127_, i_135_, (short) 24836);
			i_127_ += i_135_;
		    } else {
			if (i_122_ - i_127_ <= 512)
			    i_129_ = 0;
			aByteArray7335[0] = (byte) (i >> 8);
			aByteArray7335[1] = (byte) i;
			aByteArray7335[2] = (byte) (i_128_ >> 8);
			aByteArray7335[3] = (byte) i_128_;
			aByteArray7335[4] = (byte) (i_129_ >> 16);
			aByteArray7335[5] = (byte) (i_129_ >> 8);
			aByteArray7335[6] = (byte) i_129_;
			aByteArray7335[7]
			    = (byte) (826090209 * ((Class568) this).anInt7332);
			((Class568) this).aClass414_7333
			    .method7463((long) i_124_ * 520L);
			((Class568) this).aClass414_7333
			    .method7467(aByteArray7335, 0, 8, (short) 17391);
			int i_136_ = i_122_ - i_127_;
			if (i_136_ > 512)
			    i_136_ = 512;
			((Class568) this).aClass414_7333
			    .method7467(is, i_127_, i_136_, (short) 18771);
			i_127_ += i_136_;
		    }
		    i_124_ = i_129_;
		    i_128_++;
		}
		bool_123_ = true;
	    } catch (IOException ioexception) {
		boolean bool_137_ = false;
		return bool_137_;
	    }
	    return bool_123_;
	}
    }
    
    public boolean method12471(int i, byte[] is, int i_138_, int i_139_) {
	synchronized (((Class568) this).aClass414_7333) {
	    if (i_138_ < 0
		|| i_138_ > -446148685 * ((Class568) this).anInt7336)
		throw new IllegalArgumentException
			  (new StringBuilder().append("").append
			       (826090209 * ((Class568) this).anInt7332).append
			       (',').append
			       (i).append
			       (',').append
			       (i_138_).toString());
	    boolean bool = method12463(i, is, i_138_, true, 1899103801);
	    if (!bool)
		bool = method12463(i, is, i_138_, false, -51011554);
	    boolean bool_140_ = bool;
	    return bool_140_;
	}
    }
    
    public String method12472() {
	return new StringBuilder().append("").append
		   (826090209 * ((Class568) this).anInt7332).toString();
    }
    
    public boolean method12473(int i, byte[] is, int i_141_) {
	synchronized (((Class568) this).aClass414_7333) {
	    if (i_141_ < 0
		|| i_141_ > -446148685 * ((Class568) this).anInt7336)
		throw new IllegalArgumentException
			  (new StringBuilder().append("").append
			       (826090209 * ((Class568) this).anInt7332).append
			       (',').append
			       (i).append
			       (',').append
			       (i_141_).toString());
	    boolean bool = method12463(i, is, i_141_, true, -495377982);
	    if (!bool)
		bool = method12463(i, is, i_141_, false, 1327414639);
	    boolean bool_142_ = bool;
	    return bool_142_;
	}
    }
    
    public boolean method12474(int i, byte[] is, int i_143_) {
	synchronized (((Class568) this).aClass414_7333) {
	    if (i_143_ < 0
		|| i_143_ > -446148685 * ((Class568) this).anInt7336)
		throw new IllegalArgumentException
			  (new StringBuilder().append("").append
			       (826090209 * ((Class568) this).anInt7332).append
			       (',').append
			       (i).append
			       (',').append
			       (i_143_).toString());
	    boolean bool = method12463(i, is, i_143_, true, 1174262819);
	    if (!bool)
		bool = method12463(i, is, i_143_, false, -27662432);
	    boolean bool_144_ = bool;
	    return bool_144_;
	}
    }
    
    public Class568(int i, Class414 class414, Class414 class414_145_,
		    int i_146_) {
	((Class568) this).anInt7332 = i * 1225761057;
	((Class568) this).aClass414_7333 = class414;
	((Class568) this).aClass414_7334 = class414_145_;
	((Class568) this).anInt7336 = i_146_ * 2014639995;
    }
    
    boolean method12475(int i, byte[] is, int i_147_, boolean bool) {
	synchronized (((Class568) this).aClass414_7333) {
	    boolean bool_148_;
	    try {
		int i_149_;
		if (bool) {
		    if (((Class568) this).aClass414_7334.method7468((byte) 59)
			< (long) (6 + i * 6)) {
			boolean bool_150_ = false;
			return bool_150_;
		    }
		    ((Class568) this).aClass414_7334.method7463((long) (i
									* 6));
		    ((Class568) this).aClass414_7334
			.method7470(aByteArray7335, 0, 6, 831426205);
		    i_149_ = (((aByteArray7335[3] & 0xff) << 16)
			      + ((aByteArray7335[4] & 0xff) << 8)
			      + (aByteArray7335[5] & 0xff));
		    if (i_149_ <= 0
			|| (long) i_149_ > ((Class568) this).aClass414_7333
					       .method7468((byte) 13) / 520L) {
			boolean bool_151_ = false;
			return bool_151_;
		    }
		} else {
		    i_149_ = (int) ((((Class568) this).aClass414_7333
					 .method7468((byte) 69)
				     + 519L)
				    / 520L);
		    if (0 == i_149_)
			i_149_ = 1;
		}
		aByteArray7335[0] = (byte) (i_147_ >> 16);
		aByteArray7335[1] = (byte) (i_147_ >> 8);
		aByteArray7335[2] = (byte) i_147_;
		aByteArray7335[3] = (byte) (i_149_ >> 16);
		aByteArray7335[4] = (byte) (i_149_ >> 8);
		aByteArray7335[5] = (byte) i_149_;
		((Class568) this).aClass414_7334.method7463((long) (i * 6));
		((Class568) this).aClass414_7334.method7467(aByteArray7335, 0,
							    6, (short) 28344);
		int i_152_ = 0;
		int i_153_ = 0;
		while (i_152_ < i_147_) {
		    int i_154_ = 0;
		    if (bool) {
			((Class568) this).aClass414_7333
			    .method7463((long) i_149_ * 520L);
			int i_155_;
			int i_156_;
			int i_157_;
			if (i > 65535) {
			    try {
				((Class568) this).aClass414_7333.method7470
				    (aByteArray7335, 0, 10, 569918458);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_155_ = (((aByteArray7335[2] & 0xff) << 8)
				      + (((aByteArray7335[0] & 0xff) << 24)
					 + ((aByteArray7335[1] & 0xff) << 16))
				      + (aByteArray7335[3] & 0xff));
			    i_156_ = (((aByteArray7335[4] & 0xff) << 8)
				      + (aByteArray7335[5] & 0xff));
			    i_154_ = (((aByteArray7335[6] & 0xff) << 16)
				      + ((aByteArray7335[7] & 0xff) << 8)
				      + (aByteArray7335[8] & 0xff));
			    i_157_ = aByteArray7335[9] & 0xff;
			} else {
			    try {
				((Class568) this).aClass414_7333.method7470
				    (aByteArray7335, 0, 8, 1690070819);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_155_ = (((aByteArray7335[0] & 0xff) << 8)
				      + (aByteArray7335[1] & 0xff));
			    i_156_ = ((aByteArray7335[3] & 0xff)
				      + ((aByteArray7335[2] & 0xff) << 8));
			    i_154_ = ((aByteArray7335[6] & 0xff)
				      + (((aByteArray7335[4] & 0xff) << 16)
					 + ((aByteArray7335[5] & 0xff) << 8)));
			    i_157_ = aByteArray7335[7] & 0xff;
			}
			if (i_155_ != i || i_153_ != i_156_
			    || (((Class568) this).anInt7332 * 826090209
				!= i_157_)) {
			    boolean bool_158_ = false;
			    return bool_158_;
			}
			if (i_154_ < 0
			    || ((long) i_154_
				> ((Class568) this).aClass414_7333
				      .method7468((byte) 22) / 520L)) {
			    boolean bool_159_ = false;
			    return bool_159_;
			}
		    }
		    if (i_154_ == 0) {
			bool = false;
			i_154_ = (int) ((((Class568) this).aClass414_7333
					     .method7468((byte) 32)
					 + 519L)
					/ 520L);
			if (i_154_ == 0)
			    i_154_++;
			if (i_154_ == i_149_)
			    i_154_++;
		    }
		    if (i > 65535) {
			if (i_147_ - i_152_ <= 510)
			    i_154_ = 0;
			aByteArray7335[0] = (byte) (i >> 24);
			aByteArray7335[1] = (byte) (i >> 16);
			aByteArray7335[2] = (byte) (i >> 8);
			aByteArray7335[3] = (byte) i;
			aByteArray7335[4] = (byte) (i_153_ >> 8);
			aByteArray7335[5] = (byte) i_153_;
			aByteArray7335[6] = (byte) (i_154_ >> 16);
			aByteArray7335[7] = (byte) (i_154_ >> 8);
			aByteArray7335[8] = (byte) i_154_;
			aByteArray7335[9]
			    = (byte) (826090209 * ((Class568) this).anInt7332);
			((Class568) this).aClass414_7333
			    .method7463(520L * (long) i_149_);
			((Class568) this).aClass414_7333
			    .method7467(aByteArray7335, 0, 10, (short) 15408);
			int i_160_ = i_147_ - i_152_;
			if (i_160_ > 510)
			    i_160_ = 510;
			((Class568) this).aClass414_7333
			    .method7467(is, i_152_, i_160_, (short) 2058);
			i_152_ += i_160_;
		    } else {
			if (i_147_ - i_152_ <= 512)
			    i_154_ = 0;
			aByteArray7335[0] = (byte) (i >> 8);
			aByteArray7335[1] = (byte) i;
			aByteArray7335[2] = (byte) (i_153_ >> 8);
			aByteArray7335[3] = (byte) i_153_;
			aByteArray7335[4] = (byte) (i_154_ >> 16);
			aByteArray7335[5] = (byte) (i_154_ >> 8);
			aByteArray7335[6] = (byte) i_154_;
			aByteArray7335[7]
			    = (byte) (826090209 * ((Class568) this).anInt7332);
			((Class568) this).aClass414_7333
			    .method7463((long) i_149_ * 520L);
			((Class568) this).aClass414_7333
			    .method7467(aByteArray7335, 0, 8, (short) 11578);
			int i_161_ = i_147_ - i_152_;
			if (i_161_ > 512)
			    i_161_ = 512;
			((Class568) this).aClass414_7333
			    .method7467(is, i_152_, i_161_, (short) 1187);
			i_152_ += i_161_;
		    }
		    i_149_ = i_154_;
		    i_153_++;
		}
		bool_148_ = true;
	    } catch (IOException ioexception) {
		boolean bool_162_ = false;
		return bool_162_;
	    }
	    return bool_148_;
	}
    }
    
    static GameDefinition[] method12476(int i) {
	return (new GameDefinition[]
		{ GameDefinition.SCRATCH, GameDefinition.STELLARDAWN,
		  GameDefinition.TRANSFORMERS, GameDefinition.ALTERNATEREALITY,
		  GameDefinition.RUNESCAPE, GameDefinition.aClass471_6354 });
    }
    
    public static int method12477(int i, int i_163_, boolean bool,
				  int i_164_) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, 749013725);
	if (null == class241_sub34)
	    return 0;
	if (i_163_ < 0 || i_163_ >= (((Class241_Sub34) class241_sub34)
				     .anIntArray10086).length)
	    return 0;
	return ((Class241_Sub34) class241_sub34).anIntArray10086[i_163_];
    }
    
    static final void method12478(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_165_ = (((ClientScriptData) class454).integerStack
		      [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_166_ = (((ClientScriptData) class454).integerStack
		      [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	int i_167_ = (((ClientScriptData) class454).integerStack
		      [((ClientScriptData) class454).intStackPointer * 1482319719 + 2]);
	Class402.soundManager.method1174(i_165_, i_166_, i_167_, 1783011183);
    }
}
