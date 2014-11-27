/* Class587 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class587
{
    static void method12856(int i, int i_0_, int i_1_, int i_2_,
			    Class586 class586, float f, float f_3_, float f_4_,
			    float f_5_, float f_6_, byte[] is, int i_7_) {
	for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
	    method12857(i_8_, i, i_0_, i_1_, i_2_, class586, f, f_3_, f_4_,
			f_5_, f_6_, is, i_7_);
	    i_7_ += i * i_0_;
	}
    }
    
    static void method12857(int i, int i_9_, int i_10_, int i_11_, int i_12_,
			    Class586 class586, float f, float f_13_,
			    float f_14_, float f_15_, float f_16_, byte[] is,
			    int i_17_) {
	int i_18_ = i_9_ * i_10_;
	float[] fs = new float[i_18_];
	for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
	    int i_20_ = i_17_;
	    class586.method12853(i, i_9_, i_10_, i_11_, f / (float) i_9_,
				 f_13_ / (float) i_10_, f_14_ / (float) i_11_,
				 f_15_ * 127.0F, fs, 0);
	    for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
		is[i_20_] += fs[i_21_];
		i_20_++;
	    }
	    f *= 2.0F;
	    f_13_ *= 2.0F;
	    f_14_ *= 2.0F;
	    f_15_ *= f_16_;
	}
	int i_22_ = i_17_;
	for (int i_23_ = 0; i_23_ < i_18_; i_23_++) {
	    is[i_22_] = (byte) (is[i_22_] + 127);
	    i_22_++;
	}
    }
    
    public static byte[] method12858(int i, int i_24_, int i_25_, int i_26_,
				     Class586 class586, float f, float f_27_,
				     float f_28_, float f_29_, float f_30_) {
	byte[] is = new byte[i * i_24_ * i_25_];
	method12856(i, i_24_, i_25_, i_26_, class586, f, f_27_, f_28_, f_29_,
		    f_30_, is, 0);
	return is;
    }
    
    Class587() throws Throwable {
	throw new Error();
    }
    
    static void method12859(int i, int i_31_, int i_32_, int i_33_, int i_34_,
			    Class586 class586, float f, float f_35_,
			    float f_36_, float f_37_, float f_38_, byte[] is,
			    int i_39_) {
	int i_40_ = i_31_ * i_32_;
	float[] fs = new float[i_40_];
	for (int i_41_ = 0; i_41_ < i_34_; i_41_++) {
	    int i_42_ = i_39_;
	    class586.method12853(i, i_31_, i_32_, i_33_, f / (float) i_31_,
				 f_35_ / (float) i_32_, f_36_ / (float) i_33_,
				 f_37_ * 127.0F, fs, 0);
	    for (int i_43_ = 0; i_43_ < i_40_; i_43_++) {
		is[i_42_] += fs[i_43_];
		i_42_++;
	    }
	    f *= 2.0F;
	    f_35_ *= 2.0F;
	    f_36_ *= 2.0F;
	    f_37_ *= f_38_;
	}
	int i_44_ = i_39_;
	for (int i_45_ = 0; i_45_ < i_40_; i_45_++) {
	    is[i_44_] = (byte) (is[i_44_] + 127);
	    i_44_++;
	}
    }
    
    static void method12860(int i, int i_46_, int i_47_, int i_48_,
			    Class586 class586, float f, float f_49_,
			    float f_50_, float f_51_, float f_52_, byte[] is,
			    int i_53_) {
	for (int i_54_ = 0; i_54_ < i_47_; i_54_++) {
	    method12857(i_54_, i, i_46_, i_47_, i_48_, class586, f, f_49_,
			f_50_, f_51_, f_52_, is, i_53_);
	    i_53_ += i * i_46_;
	}
    }
    
    public static byte[] method12861(int i, int i_55_, int i_56_, int i_57_,
				     Class586 class586, float f, float f_58_,
				     float f_59_, float f_60_, float f_61_) {
	byte[] is = new byte[i * i_55_ * i_56_];
	method12856(i, i_55_, i_56_, i_57_, class586, f, f_58_, f_59_, f_60_,
		    f_61_, is, 0);
	return is;
    }
    
    static void method12862(int i, int i_62_, int i_63_, int i_64_,
			    Class586 class586, float f, float f_65_,
			    float f_66_, float f_67_, float f_68_, byte[] is,
			    int i_69_) {
	for (int i_70_ = 0; i_70_ < i_63_; i_70_++) {
	    method12857(i_70_, i, i_62_, i_63_, i_64_, class586, f, f_65_,
			f_66_, f_67_, f_68_, is, i_69_);
	    i_69_ += i * i_62_;
	}
    }
    
    public static byte[] method12863(int i, int i_71_, int i_72_, int i_73_,
				     Class586 class586, float f, float f_74_,
				     float f_75_, float f_76_, float f_77_) {
	byte[] is = new byte[i * i_71_ * i_72_];
	method12856(i, i_71_, i_72_, i_73_, class586, f, f_74_, f_75_, f_76_,
		    f_77_, is, 0);
	return is;
    }
    
    static void method12864(int i, int i_78_, int i_79_, int i_80_,
			    Class586 class586, float f, float f_81_,
			    float f_82_, float f_83_, float f_84_, byte[] is,
			    int i_85_) {
	for (int i_86_ = 0; i_86_ < i_79_; i_86_++) {
	    method12857(i_86_, i, i_78_, i_79_, i_80_, class586, f, f_81_,
			f_82_, f_83_, f_84_, is, i_85_);
	    i_85_ += i * i_78_;
	}
    }
}
