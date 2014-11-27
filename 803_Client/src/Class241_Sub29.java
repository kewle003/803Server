/* Class241_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub29 extends Node
{
    int anInt10031;
    int anInt10032;
    static int[] anIntArray10033;
    int anInt10034;
    boolean aBool10035;
    int[] anIntArray10036;
    
    int[] method16288() {
	return ((Class241_Sub29) this).anIntArray10036;
    }
    
    int[] method16289() {
	return ((Class241_Sub29) this).anIntArray10036;
    }
    
    void method16290(int i, int i_0_) {
	if (i != 0 || i_0_ != 0) {
	    if (anIntArray10033 == null
		|| (anIntArray10033.length
		    != ((Class241_Sub29) this).anIntArray10036.length))
		anIntArray10033
		    = new int[((Class241_Sub29) this).anIntArray10036.length];
	    int i_1_ = ((Class241_Sub29) this).anIntArray10036.length;
	    int i_2_ = i;
	    int i_3_ = ((Class241_Sub29) this).anInt10032 - 1;
	    int i_4_ = ((Class241_Sub29) this).anInt10032 * i_0_;
	    int i_5_ = i_1_ - 1;
	    for (int i_6_ = 0; i_6_ < i_1_;
		 i_6_ += ((Class241_Sub29) this).anInt10032) {
		int i_7_ = i_6_ + i_4_ & i_5_;
		for (int i_8_ = 0; i_8_ < ((Class241_Sub29) this).anInt10032;
		     i_8_++) {
		    int i_9_ = i_6_ + i_8_;
		    int i_10_ = i_7_ + (i_8_ + i_2_ & i_3_);
		    anIntArray10033[i_9_]
			= ((Class241_Sub29) this).anIntArray10036[i_10_];
		}
	    }
	    int[] is = ((Class241_Sub29) this).anIntArray10036;
	    ((Class241_Sub29) this).anIntArray10036 = anIntArray10033;
	    anIntArray10033 = is;
	}
    }
    
    int[] method16291() {
	return ((Class241_Sub29) this).anIntArray10036;
    }
    
    int[] method16292() {
	return ((Class241_Sub29) this).anIntArray10036;
    }
    
    Class241_Sub29(int i, int i_11_, int i_12_, int[] is, boolean bool) {
	((Class241_Sub29) this).anInt10034 = i;
	((Class241_Sub29) this).anInt10032 = i_12_;
	((Class241_Sub29) this).anIntArray10036 = is;
	if (bool) {
	    int[] is_13_ = new int[((Class241_Sub29) this).anInt10032];
	    int[] is_14_ = new int[((Class241_Sub29) this).anInt10032];
	    int[] is_15_ = new int[((Class241_Sub29) this).anInt10032];
	    int[] is_16_ = new int[((Class241_Sub29) this).anInt10032];
	    if (anIntArray10033 == null
		|| (anIntArray10033.length
		    != ((Class241_Sub29) this).anIntArray10036.length))
		anIntArray10033
		    = new int[((Class241_Sub29) this).anIntArray10036.length];
	    int i_17_ = ((Class241_Sub29) this).anInt10032;
	    int i_18_ = ((Class241_Sub29) this).anInt10032;
	    int i_19_ = i_17_ - 1;
	    int i_20_ = i_18_ - 1;
	    int i_21_ = i_17_ * i_18_;
	    int i_23_;
	    int i_22_ = i_23_ = 1 * i_17_;
	    for (int i_24_ = 2; i_24_ >= 0; i_24_--) {
		for (int i_25_ = i_19_; i_25_ >= 0; i_25_--) {
		    int i_26_
			= ((Class241_Sub29) this).anIntArray10036[--i_23_];
		    is_13_[i_25_] += i_26_ >> 24 & 0xff;
		    is_14_[i_25_] += i_26_ >> 16 & 0xff;
		    is_15_[i_25_] += i_26_ >> 8 & 0xff;
		    is_16_[i_25_] += i_26_ & 0xff;
		}
		if (i_23_ == 0)
		    i_23_ = i_21_;
	    }
	    int i_27_ = i_21_;
	    for (int i_28_ = i_20_; i_28_ >= 0; i_28_--) {
		int i_29_ = 1;
		int i_30_ = 1;
		int i_31_ = 0;
		int i_32_ = 0;
		int i_33_ = 0;
		int i_34_ = 0;
		for (int i_35_ = 2; i_35_ >= 0; i_35_--) {
		    i_30_--;
		    i_34_ += is_13_[i_30_];
		    i_33_ += is_14_[i_30_];
		    i_31_ += is_15_[i_30_];
		    i_32_ += is_16_[i_30_];
		    if (i_30_ == 0)
			i_30_ = i_17_;
		}
		for (int i_36_ = i_19_; i_36_ >= 0; i_36_--) {
		    i_30_--;
		    i_29_--;
		    int i_37_ = i_34_ / 9;
		    int i_38_ = i_33_ / 9;
		    int i_39_ = i_31_ / 9;
		    int i_40_ = i_32_ / 9;
		    anIntArray10033[--i_27_]
			= i_37_ << 24 | i_38_ << 16 | i_39_ << 8 | i_40_;
		    i_34_ += is_13_[i_30_] - is_13_[i_29_];
		    i_33_ += is_14_[i_30_] - is_14_[i_29_];
		    i_32_ += is_16_[i_30_] - is_16_[i_29_];
		    i_31_ += is_15_[i_30_] - is_15_[i_29_];
		    if (i_30_ == 0)
			i_30_ = i_17_;
		    if (i_29_ == 0)
			i_29_ = i_17_;
		}
		for (int i_41_ = i_19_; i_41_ >= 0; i_41_--) {
		    int i_42_
			= ((Class241_Sub29) this).anIntArray10036[--i_23_];
		    int i_43_
			= ((Class241_Sub29) this).anIntArray10036[--i_22_];
		    is_13_[i_41_]
			+= (i_42_ >> 24 & 0xff) - (i_43_ >> 24 & 0xff);
		    is_14_[i_41_]
			+= (i_42_ >> 16 & 0xff) - (i_43_ >> 16 & 0xff);
		    is_15_[i_41_] += (i_42_ >> 8 & 0xff) - (i_43_ >> 8 & 0xff);
		    is_16_[i_41_] += (i_42_ & 0xff) - (i_43_ & 0xff);
		}
		if (i_23_ == 0)
		    i_23_ = i_21_;
		if (i_22_ == 0)
		    i_22_ = i_21_;
	    }
	    int[] is_44_ = ((Class241_Sub29) this).anIntArray10036;
	    ((Class241_Sub29) this).anIntArray10036 = anIntArray10033;
	    anIntArray10033 = is_44_;
	}
    }
    
    void method16293(int i, int i_45_) {
	if (i != 0 || i_45_ != 0) {
	    if (anIntArray10033 == null
		|| (anIntArray10033.length
		    != ((Class241_Sub29) this).anIntArray10036.length))
		anIntArray10033
		    = new int[((Class241_Sub29) this).anIntArray10036.length];
	    int i_46_ = ((Class241_Sub29) this).anIntArray10036.length;
	    int i_47_ = i;
	    int i_48_ = ((Class241_Sub29) this).anInt10032 - 1;
	    int i_49_ = ((Class241_Sub29) this).anInt10032 * i_45_;
	    int i_50_ = i_46_ - 1;
	    for (int i_51_ = 0; i_51_ < i_46_;
		 i_51_ += ((Class241_Sub29) this).anInt10032) {
		int i_52_ = i_51_ + i_49_ & i_50_;
		for (int i_53_ = 0; i_53_ < ((Class241_Sub29) this).anInt10032;
		     i_53_++) {
		    int i_54_ = i_51_ + i_53_;
		    int i_55_ = i_52_ + (i_53_ + i_47_ & i_48_);
		    anIntArray10033[i_54_]
			= ((Class241_Sub29) this).anIntArray10036[i_55_];
		}
	    }
	    int[] is = ((Class241_Sub29) this).anIntArray10036;
	    ((Class241_Sub29) this).anIntArray10036 = anIntArray10033;
	    anIntArray10033 = is;
	}
    }
    
    void method16294(int i, int i_56_) {
	if (i != 0 || i_56_ != 0) {
	    if (anIntArray10033 == null
		|| (anIntArray10033.length
		    != ((Class241_Sub29) this).anIntArray10036.length))
		anIntArray10033
		    = new int[((Class241_Sub29) this).anIntArray10036.length];
	    int i_57_ = ((Class241_Sub29) this).anIntArray10036.length;
	    int i_58_ = i;
	    int i_59_ = ((Class241_Sub29) this).anInt10032 - 1;
	    int i_60_ = ((Class241_Sub29) this).anInt10032 * i_56_;
	    int i_61_ = i_57_ - 1;
	    for (int i_62_ = 0; i_62_ < i_57_;
		 i_62_ += ((Class241_Sub29) this).anInt10032) {
		int i_63_ = i_62_ + i_60_ & i_61_;
		for (int i_64_ = 0; i_64_ < ((Class241_Sub29) this).anInt10032;
		     i_64_++) {
		    int i_65_ = i_62_ + i_64_;
		    int i_66_ = i_63_ + (i_64_ + i_58_ & i_59_);
		    anIntArray10033[i_65_]
			= ((Class241_Sub29) this).anIntArray10036[i_66_];
		}
	    }
	    int[] is = ((Class241_Sub29) this).anIntArray10036;
	    ((Class241_Sub29) this).anIntArray10036 = anIntArray10033;
	    anIntArray10033 = is;
	}
    }
    
    void method16295(int i, int i_67_) {
	if (i != 0 || i_67_ != 0) {
	    if (anIntArray10033 == null
		|| (anIntArray10033.length
		    != ((Class241_Sub29) this).anIntArray10036.length))
		anIntArray10033
		    = new int[((Class241_Sub29) this).anIntArray10036.length];
	    int i_68_ = ((Class241_Sub29) this).anIntArray10036.length;
	    int i_69_ = i;
	    int i_70_ = ((Class241_Sub29) this).anInt10032 - 1;
	    int i_71_ = ((Class241_Sub29) this).anInt10032 * i_67_;
	    int i_72_ = i_68_ - 1;
	    for (int i_73_ = 0; i_73_ < i_68_;
		 i_73_ += ((Class241_Sub29) this).anInt10032) {
		int i_74_ = i_73_ + i_71_ & i_72_;
		for (int i_75_ = 0; i_75_ < ((Class241_Sub29) this).anInt10032;
		     i_75_++) {
		    int i_76_ = i_73_ + i_75_;
		    int i_77_ = i_74_ + (i_75_ + i_69_ & i_70_);
		    anIntArray10033[i_76_]
			= ((Class241_Sub29) this).anIntArray10036[i_77_];
		}
	    }
	    int[] is = ((Class241_Sub29) this).anIntArray10036;
	    ((Class241_Sub29) this).anIntArray10036 = anIntArray10033;
	    anIntArray10033 = is;
	}
    }
}
