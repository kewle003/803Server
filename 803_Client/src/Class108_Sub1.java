/* Class108_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class108_Sub1 extends Class108
{
    int[] anIntArray9288;
    boolean aBool9289 = false;
    int anInt9290;
    int anInt9291;
    int anInt9292;
    int anInt9293;
    int anInt9294;
    int anInt9295;
    
    public int[] method2712(boolean bool) {
	if (bool && (getHeight() != ((Class108_Sub1) this).anInt9291
		     || getWidth() != ((Class108_Sub1) this).anInt9290)) {
	    int i = getHeight();
	    int[] is = new int[i * getWidth()];
	    for (int i_0_ = 0; i_0_ < ((Class108_Sub1) this).anInt9290;
		 i_0_++) {
		int i_1_ = i_0_ * ((Class108_Sub1) this).anInt9291;
		int i_2_ = (((Class108_Sub1) this).anInt9294
			    + (i_0_ + ((Class108_Sub1) this).anInt9292) * i);
		for (int i_3_ = 0; i_3_ < ((Class108_Sub1) this).anInt9291;
		     i_3_++) {
		    is[i_2_++] = ((Class108_Sub1) this).anIntArray9288[i_1_];
		    i_1_++;
		}
	    }
	    return is;
	}
	return ((Class108_Sub1) this).anIntArray9288;
    }
    
    public boolean method2691() {
	return false;
    }
    
    public boolean method2692() {
	return ((Class108_Sub1) this).aBool9289;
    }
    
    public void method2740(int i) {
	for (int i_4_ = ((Class108_Sub1) this).anInt9290 - 1; i_4_ > 0;
	     i_4_--) {
	    int i_5_ = i_4_ * ((Class108_Sub1) this).anInt9291;
	    for (int i_6_ = ((Class108_Sub1) this).anInt9291 - 1; i_6_ > 0;
		 i_6_--) {
		if ((((Class108_Sub1) this).anIntArray9288[i_6_ + i_5_]
		     & ~0xffffff) == 0
		    && ((((Class108_Sub1) this).anIntArray9288
			 [i_6_ + i_5_ - 1 - ((Class108_Sub1) this).anInt9291])
			& ~0xffffff) != 0)
		    ((Class108_Sub1) this).anIntArray9288[i_6_ + i_5_] = i;
	    }
	}
    }
    
    public int method2694() {
	return ((Class108_Sub1) this).anInt9290;
    }
    
    public int getHeight() {
	return (((Class108_Sub1) this).anInt9291
		+ ((Class108_Sub1) this).anInt9294
		+ ((Class108_Sub1) this).anInt9295);
    }
    
    public int method2695() {
	return ((Class108_Sub1) this).anInt9294;
    }
    
    public int[] method2707(boolean bool) {
	if (bool && (getHeight() != ((Class108_Sub1) this).anInt9291
		     || getWidth() != ((Class108_Sub1) this).anInt9290)) {
	    int i = getHeight();
	    int[] is = new int[i * getWidth()];
	    for (int i_7_ = 0; i_7_ < ((Class108_Sub1) this).anInt9290;
		 i_7_++) {
		int i_8_ = i_7_ * ((Class108_Sub1) this).anInt9291;
		int i_9_ = (((Class108_Sub1) this).anInt9294
			    + (i_7_ + ((Class108_Sub1) this).anInt9292) * i);
		for (int i_10_ = 0; i_10_ < ((Class108_Sub1) this).anInt9291;
		     i_10_++) {
		    is[i_9_++] = ((Class108_Sub1) this).anIntArray9288[i_8_];
		    i_8_++;
		}
	    }
	    return is;
	}
	return ((Class108_Sub1) this).anIntArray9288;
    }
    
    public int method2690() {
	return ((Class108_Sub1) this).anInt9293;
    }
    
    public int method2742() {
	return ((Class108_Sub1) this).anInt9293;
    }
    
    public int method2696() {
	return ((Class108_Sub1) this).anInt9295;
    }
    
    public void method2724() {
	((Class108_Sub1) this).anInt9293 = 0;
	((Class108_Sub1) this).anInt9292 = 0;
	((Class108_Sub1) this).anInt9295 = 0;
	((Class108_Sub1) this).anInt9294 = 0;
    }
    
    public int method2728() {
	return ((Class108_Sub1) this).anInt9292;
    }
    
    public void method2701(int i) {
	int i_11_ = 0;
	((Class108_Sub1) this).aBool9289 = false;
	int[] is = new int[(((Class108_Sub1) this).anInt9291
			    * ((Class108_Sub1) this).anInt9290)];
	for (int i_12_ = 0; i_12_ < ((Class108_Sub1) this).anInt9290;
	     i_12_++) {
	    for (int i_13_ = 0; i_13_ < ((Class108_Sub1) this).anInt9291;
		 i_13_++) {
		int i_14_ = ((Class108_Sub1) this).anIntArray9288[i_11_];
		if ((i_14_ & ~0xffffff) == 0) {
		    if (i_13_ > 0
			&& (((Class108_Sub1) this).anIntArray9288[i_11_ - 1]
			    & ~0xffffff) != 0)
			i_14_ = i;
		    else if (i_12_ > 0
			     && ((((Class108_Sub1) this).anIntArray9288
				  [i_11_ - ((Class108_Sub1) this).anInt9291])
				 & ~0xffffff) != 0)
			i_14_ = i;
		    else if (i_13_ < ((Class108_Sub1) this).anInt9291 - 1
			     && ((((Class108_Sub1) this).anIntArray9288
				  [i_11_ + 1])
				 & ~0xffffff) != 0)
			i_14_ = i;
		    else if (i_12_ < ((Class108_Sub1) this).anInt9290 - 1
			     && ((((Class108_Sub1) this).anIntArray9288
				  [i_11_ + ((Class108_Sub1) this).anInt9291])
				 & ~0xffffff) != 0)
			i_14_ = i;
		}
		if ((i_14_ & ~0xffffff) != -16777216)
		    ((Class108_Sub1) this).aBool9289 = true;
		is[i_11_++] = i_14_;
	    }
	}
	((Class108_Sub1) this).anIntArray9288 = is;
    }
    
    public int method2711() {
	return ((Class108_Sub1) this).anInt9290;
    }
    
    public void method2705() {
	int[] is = ((Class108_Sub1) this).anIntArray9288;
	for (int i = ((Class108_Sub1) this).anInt9290 - 1; i >= 0; i--) {
	    int i_15_ = i * ((Class108_Sub1) this).anInt9291;
	    for (int i_16_ = (i + 1) * ((Class108_Sub1) this).anInt9291;
		 i_15_ < i_16_; i_15_++) {
		i_16_--;
		int i_17_ = is[i_15_];
		is[i_15_] = is[i_16_];
		is[i_16_] = i_17_;
	    }
	}
	int i = ((Class108_Sub1) this).anInt9294;
	((Class108_Sub1) this).anInt9294 = ((Class108_Sub1) this).anInt9295;
	((Class108_Sub1) this).anInt9295 = i;
    }
    
    public void method2702(int i) {
	int i_18_ = getHeight();
	int i_19_ = getWidth();
	if (((Class108_Sub1) this).anInt9291 != i_18_
	    || ((Class108_Sub1) this).anInt9290 != i_19_) {
	    int i_20_ = i;
	    if (i_20_ > ((Class108_Sub1) this).anInt9294)
		i_20_ = ((Class108_Sub1) this).anInt9294;
	    int i_21_ = i;
	    if ((i_21_ + ((Class108_Sub1) this).anInt9294
		 + ((Class108_Sub1) this).anInt9291)
		> i_18_)
		i_21_ = (i_18_ - ((Class108_Sub1) this).anInt9294
			 - ((Class108_Sub1) this).anInt9291);
	    int i_22_ = i;
	    if (i_22_ > ((Class108_Sub1) this).anInt9292)
		i_22_ = ((Class108_Sub1) this).anInt9292;
	    int i_23_ = i;
	    if ((i_23_ + ((Class108_Sub1) this).anInt9292
		 + ((Class108_Sub1) this).anInt9290)
		> i_19_)
		i_23_ = (i_19_ - ((Class108_Sub1) this).anInt9292
			 - ((Class108_Sub1) this).anInt9290);
	    int i_24_ = ((Class108_Sub1) this).anInt9291 + i_20_ + i_21_;
	    int i_25_ = ((Class108_Sub1) this).anInt9290 + i_22_ + i_23_;
	    int[] is = new int[i_24_ * i_25_];
	    ((Class108_Sub1) this).aBool9289 = false;
	    for (int i_26_ = 0; i_26_ < ((Class108_Sub1) this).anInt9290;
		 i_26_++) {
		int i_27_ = i_26_ * ((Class108_Sub1) this).anInt9291;
		int i_28_ = (i_26_ + i_22_) * i_24_ + i_20_;
		for (int i_29_ = 0; i_29_ < ((Class108_Sub1) this).anInt9291;
		     i_29_++) {
		    if ((((Class108_Sub1) this).anIntArray9288[i_27_]
			 & ~0xffffff)
			!= -16777216)
			((Class108_Sub1) this).aBool9289 = true;
		    is[i_28_++]
			= ((Class108_Sub1) this).anIntArray9288[i_27_++];
		}
	    }
	    ((Class108_Sub1) this).anInt9294 -= i_20_;
	    ((Class108_Sub1) this).anInt9292 -= i_22_;
	    ((Class108_Sub1) this).anInt9295 -= i_21_;
	    ((Class108_Sub1) this).anInt9293 -= i_23_;
	    ((Class108_Sub1) this).anInt9291 = i_24_;
	    ((Class108_Sub1) this).anInt9290 = i_25_;
	    ((Class108_Sub1) this).anIntArray9288 = is;
	}
    }
    
    public void method2706() {
	int[] is = new int[(((Class108_Sub1) this).anInt9291
			    * ((Class108_Sub1) this).anInt9290)];
	int i = 0;
	for (int i_30_ = 0; i_30_ < ((Class108_Sub1) this).anInt9291;
	     i_30_++) {
	    for (int i_31_ = ((Class108_Sub1) this).anInt9290 - 1; i_31_ >= 0;
		 i_31_--)
		is[i++] = (((Class108_Sub1) this).anIntArray9288
			   [i_30_ + i_31_ * ((Class108_Sub1) this).anInt9291]);
	}
	((Class108_Sub1) this).anIntArray9288 = is;
	int i_32_ = ((Class108_Sub1) this).anInt9292;
	((Class108_Sub1) this).anInt9292 = ((Class108_Sub1) this).anInt9294;
	((Class108_Sub1) this).anInt9294 = ((Class108_Sub1) this).anInt9293;
	((Class108_Sub1) this).anInt9293 = ((Class108_Sub1) this).anInt9295;
	((Class108_Sub1) this).anInt9295 = i_32_;
	i_32_ = ((Class108_Sub1) this).anInt9290;
	((Class108_Sub1) this).anInt9290 = ((Class108_Sub1) this).anInt9291;
	((Class108_Sub1) this).anInt9291 = i_32_;
    }
    
    public int method2753(int i, int i_33_) {
	return (((Class108_Sub1) this).anIntArray9288
		[i + i_33_ * ((Class108_Sub1) this).anInt9291]);
    }
    
    public void method2708(int i, int i_34_, int i_35_) {
	for (int i_36_ = 1;
	     i_36_ < ((Class108_Sub1) this).anIntArray9288.length; i_36_++) {
	    int i_37_
		= ((Class108_Sub1) this).anIntArray9288[i_36_] >> 16 & 0xff;
	    i_37_ += i;
	    if (i_37_ < 0)
		i_37_ = 0;
	    else if (i_37_ > 255)
		i_37_ = 255;
	    int i_38_
		= ((Class108_Sub1) this).anIntArray9288[i_36_] >> 8 & 0xff;
	    i_38_ += i_34_;
	    if (i_38_ < 0)
		i_38_ = 0;
	    else if (i_38_ > 255)
		i_38_ = 255;
	    int i_39_
		= ((Class108_Sub1) this).anIntArray9288[i_36_] >> 0 & 0xff;
	    i_39_ += i_35_;
	    if (i_39_ < 0)
		i_39_ = 0;
	    else if (i_39_ > 255)
		i_39_ = 255;
	    ((Class108_Sub1) this).anIntArray9288[i_36_]
		= (((Class108_Sub1) this).anIntArray9288[i_36_] & ~0xffffff
		   | i_37_ << 16 | i_38_ << 8 | i_39_);
	}
    }
    
    public int method2741(int i, int i_40_) {
	return (((Class108_Sub1) this).anIntArray9288
		[i + i_40_ * ((Class108_Sub1) this).anInt9291]);
    }
    
    public int method2726() {
	return ((Class108_Sub1) this).anInt9295;
    }
    
    public boolean method2709() {
	return ((Class108_Sub1) this).aBool9289;
    }
    
    public boolean method2750() {
	return ((Class108_Sub1) this).aBool9289;
    }
    
    public boolean method2713() {
	return ((Class108_Sub1) this).aBool9289;
    }
    
    public int method2714() {
	return ((Class108_Sub1) this).anInt9291;
    }
    
    public int method2717() {
	return ((Class108_Sub1) this).anInt9290;
    }
    
    public int method2722() {
	return (((Class108_Sub1) this).anInt9290
		+ ((Class108_Sub1) this).anInt9292
		+ ((Class108_Sub1) this).anInt9293);
    }
    
    Class108_Sub1(int i, int i_41_, int[] is) {
	((Class108_Sub1) this).anInt9291 = i;
	((Class108_Sub1) this).anInt9290 = i_41_;
	((Class108_Sub1) this).anIntArray9288 = is;
	for (int i_42_ = 0;
	     i_42_ < ((Class108_Sub1) this).anIntArray9288.length; i_42_++) {
	    if ((((Class108_Sub1) this).anIntArray9288[i_42_] & ~0xffffff)
		!= -16777216) {
		((Class108_Sub1) this).aBool9289 = true;
		break;
	    }
	}
    }
    
    public int method2723() {
	return ((Class108_Sub1) this).anInt9294;
    }
    
    public int method2719() {
	return ((Class108_Sub1) this).anInt9290;
    }
    
    public int method2720() {
	return (((Class108_Sub1) this).anInt9291
		+ ((Class108_Sub1) this).anInt9294
		+ ((Class108_Sub1) this).anInt9295);
    }
    
    public int method2721() {
	return (((Class108_Sub1) this).anInt9290
		+ ((Class108_Sub1) this).anInt9292
		+ ((Class108_Sub1) this).anInt9293);
    }
    
    public int method2698() {
	return ((Class108_Sub1) this).anInt9291;
    }
    
    public int method2727() {
	return ((Class108_Sub1) this).anInt9292;
    }
    
    public int method2703() {
	return ((Class108_Sub1) this).anInt9294;
    }
    
    public int method2725() {
	return ((Class108_Sub1) this).anInt9294;
    }
    
    public int method2735(int i, int i_43_) {
	return (((Class108_Sub1) this).anIntArray9288
		[i + i_43_ * ((Class108_Sub1) this).anInt9291]);
    }
    
    public boolean method2710() {
	return false;
    }
    
    public void method2736(int i) {
	int i_44_ = getHeight();
	int i_45_ = getWidth();
	if (((Class108_Sub1) this).anInt9291 != i_44_
	    || ((Class108_Sub1) this).anInt9290 != i_45_) {
	    int i_46_ = i;
	    if (i_46_ > ((Class108_Sub1) this).anInt9294)
		i_46_ = ((Class108_Sub1) this).anInt9294;
	    int i_47_ = i;
	    if ((i_47_ + ((Class108_Sub1) this).anInt9294
		 + ((Class108_Sub1) this).anInt9291)
		> i_44_)
		i_47_ = (i_44_ - ((Class108_Sub1) this).anInt9294
			 - ((Class108_Sub1) this).anInt9291);
	    int i_48_ = i;
	    if (i_48_ > ((Class108_Sub1) this).anInt9292)
		i_48_ = ((Class108_Sub1) this).anInt9292;
	    int i_49_ = i;
	    if ((i_49_ + ((Class108_Sub1) this).anInt9292
		 + ((Class108_Sub1) this).anInt9290)
		> i_45_)
		i_49_ = (i_45_ - ((Class108_Sub1) this).anInt9292
			 - ((Class108_Sub1) this).anInt9290);
	    int i_50_ = ((Class108_Sub1) this).anInt9291 + i_46_ + i_47_;
	    int i_51_ = ((Class108_Sub1) this).anInt9290 + i_48_ + i_49_;
	    int[] is = new int[i_50_ * i_51_];
	    ((Class108_Sub1) this).aBool9289 = false;
	    for (int i_52_ = 0; i_52_ < ((Class108_Sub1) this).anInt9290;
		 i_52_++) {
		int i_53_ = i_52_ * ((Class108_Sub1) this).anInt9291;
		int i_54_ = (i_52_ + i_48_) * i_50_ + i_46_;
		for (int i_55_ = 0; i_55_ < ((Class108_Sub1) this).anInt9291;
		     i_55_++) {
		    if ((((Class108_Sub1) this).anIntArray9288[i_53_]
			 & ~0xffffff)
			!= -16777216)
			((Class108_Sub1) this).aBool9289 = true;
		    is[i_54_++]
			= ((Class108_Sub1) this).anIntArray9288[i_53_++];
		}
	    }
	    ((Class108_Sub1) this).anInt9294 -= i_46_;
	    ((Class108_Sub1) this).anInt9292 -= i_48_;
	    ((Class108_Sub1) this).anInt9295 -= i_47_;
	    ((Class108_Sub1) this).anInt9293 -= i_49_;
	    ((Class108_Sub1) this).anInt9291 = i_50_;
	    ((Class108_Sub1) this).anInt9290 = i_51_;
	    ((Class108_Sub1) this).anIntArray9288 = is;
	}
    }
    
    public int method2718() {
	return ((Class108_Sub1) this).anInt9290;
    }
    
    public int method2730() {
	return ((Class108_Sub1) this).anInt9293;
    }
    
    public void method2731() {
	((Class108_Sub1) this).anInt9293 = 0;
	((Class108_Sub1) this).anInt9292 = 0;
	((Class108_Sub1) this).anInt9295 = 0;
	((Class108_Sub1) this).anInt9294 = 0;
    }
    
    public void method2732() {
	((Class108_Sub1) this).anInt9293 = 0;
	((Class108_Sub1) this).anInt9292 = 0;
	((Class108_Sub1) this).anInt9295 = 0;
	((Class108_Sub1) this).anInt9294 = 0;
    }
    
    public int method2715() {
	return ((Class108_Sub1) this).anInt9290;
    }
    
    public void method2729(int i) {
	int i_56_ = getHeight();
	int i_57_ = getWidth();
	if (((Class108_Sub1) this).anInt9291 != i_56_
	    || ((Class108_Sub1) this).anInt9290 != i_57_) {
	    int i_58_ = i;
	    if (i_58_ > ((Class108_Sub1) this).anInt9294)
		i_58_ = ((Class108_Sub1) this).anInt9294;
	    int i_59_ = i;
	    if ((i_59_ + ((Class108_Sub1) this).anInt9294
		 + ((Class108_Sub1) this).anInt9291)
		> i_56_)
		i_59_ = (i_56_ - ((Class108_Sub1) this).anInt9294
			 - ((Class108_Sub1) this).anInt9291);
	    int i_60_ = i;
	    if (i_60_ > ((Class108_Sub1) this).anInt9292)
		i_60_ = ((Class108_Sub1) this).anInt9292;
	    int i_61_ = i;
	    if ((i_61_ + ((Class108_Sub1) this).anInt9292
		 + ((Class108_Sub1) this).anInt9290)
		> i_57_)
		i_61_ = (i_57_ - ((Class108_Sub1) this).anInt9292
			 - ((Class108_Sub1) this).anInt9290);
	    int i_62_ = ((Class108_Sub1) this).anInt9291 + i_58_ + i_59_;
	    int i_63_ = ((Class108_Sub1) this).anInt9290 + i_60_ + i_61_;
	    int[] is = new int[i_62_ * i_63_];
	    ((Class108_Sub1) this).aBool9289 = false;
	    for (int i_64_ = 0; i_64_ < ((Class108_Sub1) this).anInt9290;
		 i_64_++) {
		int i_65_ = i_64_ * ((Class108_Sub1) this).anInt9291;
		int i_66_ = (i_64_ + i_60_) * i_62_ + i_58_;
		for (int i_67_ = 0; i_67_ < ((Class108_Sub1) this).anInt9291;
		     i_67_++) {
		    if ((((Class108_Sub1) this).anIntArray9288[i_65_]
			 & ~0xffffff)
			!= -16777216)
			((Class108_Sub1) this).aBool9289 = true;
		    is[i_66_++]
			= ((Class108_Sub1) this).anIntArray9288[i_65_++];
		}
	    }
	    ((Class108_Sub1) this).anInt9294 -= i_58_;
	    ((Class108_Sub1) this).anInt9292 -= i_60_;
	    ((Class108_Sub1) this).anInt9295 -= i_59_;
	    ((Class108_Sub1) this).anInt9293 -= i_61_;
	    ((Class108_Sub1) this).anInt9291 = i_62_;
	    ((Class108_Sub1) this).anInt9290 = i_63_;
	    ((Class108_Sub1) this).anIntArray9288 = is;
	}
    }
    
    public void method2743(int i) {
	int i_68_ = getHeight();
	int i_69_ = getWidth();
	if (((Class108_Sub1) this).anInt9291 != i_68_
	    || ((Class108_Sub1) this).anInt9290 != i_69_) {
	    int i_70_ = i;
	    if (i_70_ > ((Class108_Sub1) this).anInt9294)
		i_70_ = ((Class108_Sub1) this).anInt9294;
	    int i_71_ = i;
	    if ((i_71_ + ((Class108_Sub1) this).anInt9294
		 + ((Class108_Sub1) this).anInt9291)
		> i_68_)
		i_71_ = (i_68_ - ((Class108_Sub1) this).anInt9294
			 - ((Class108_Sub1) this).anInt9291);
	    int i_72_ = i;
	    if (i_72_ > ((Class108_Sub1) this).anInt9292)
		i_72_ = ((Class108_Sub1) this).anInt9292;
	    int i_73_ = i;
	    if ((i_73_ + ((Class108_Sub1) this).anInt9292
		 + ((Class108_Sub1) this).anInt9290)
		> i_69_)
		i_73_ = (i_69_ - ((Class108_Sub1) this).anInt9292
			 - ((Class108_Sub1) this).anInt9290);
	    int i_74_ = ((Class108_Sub1) this).anInt9291 + i_70_ + i_71_;
	    int i_75_ = ((Class108_Sub1) this).anInt9290 + i_72_ + i_73_;
	    int[] is = new int[i_74_ * i_75_];
	    ((Class108_Sub1) this).aBool9289 = false;
	    for (int i_76_ = 0; i_76_ < ((Class108_Sub1) this).anInt9290;
		 i_76_++) {
		int i_77_ = i_76_ * ((Class108_Sub1) this).anInt9291;
		int i_78_ = (i_76_ + i_72_) * i_74_ + i_70_;
		for (int i_79_ = 0; i_79_ < ((Class108_Sub1) this).anInt9291;
		     i_79_++) {
		    if ((((Class108_Sub1) this).anIntArray9288[i_77_]
			 & ~0xffffff)
			!= -16777216)
			((Class108_Sub1) this).aBool9289 = true;
		    is[i_78_++]
			= ((Class108_Sub1) this).anIntArray9288[i_77_++];
		}
	    }
	    ((Class108_Sub1) this).anInt9294 -= i_70_;
	    ((Class108_Sub1) this).anInt9292 -= i_72_;
	    ((Class108_Sub1) this).anInt9295 -= i_71_;
	    ((Class108_Sub1) this).anInt9293 -= i_73_;
	    ((Class108_Sub1) this).anInt9291 = i_74_;
	    ((Class108_Sub1) this).anInt9290 = i_75_;
	    ((Class108_Sub1) this).anIntArray9288 = is;
	}
    }
    
    public int method2697() {
	return ((Class108_Sub1) this).anInt9292;
    }
    
    public void method2737(int i) {
	int i_80_ = getHeight();
	int i_81_ = getWidth();
	if (((Class108_Sub1) this).anInt9291 != i_80_
	    || ((Class108_Sub1) this).anInt9290 != i_81_) {
	    int i_82_ = i;
	    if (i_82_ > ((Class108_Sub1) this).anInt9294)
		i_82_ = ((Class108_Sub1) this).anInt9294;
	    int i_83_ = i;
	    if ((i_83_ + ((Class108_Sub1) this).anInt9294
		 + ((Class108_Sub1) this).anInt9291)
		> i_80_)
		i_83_ = (i_80_ - ((Class108_Sub1) this).anInt9294
			 - ((Class108_Sub1) this).anInt9291);
	    int i_84_ = i;
	    if (i_84_ > ((Class108_Sub1) this).anInt9292)
		i_84_ = ((Class108_Sub1) this).anInt9292;
	    int i_85_ = i;
	    if ((i_85_ + ((Class108_Sub1) this).anInt9292
		 + ((Class108_Sub1) this).anInt9290)
		> i_81_)
		i_85_ = (i_81_ - ((Class108_Sub1) this).anInt9292
			 - ((Class108_Sub1) this).anInt9290);
	    int i_86_ = ((Class108_Sub1) this).anInt9291 + i_82_ + i_83_;
	    int i_87_ = ((Class108_Sub1) this).anInt9290 + i_84_ + i_85_;
	    int[] is = new int[i_86_ * i_87_];
	    ((Class108_Sub1) this).aBool9289 = false;
	    for (int i_88_ = 0; i_88_ < ((Class108_Sub1) this).anInt9290;
		 i_88_++) {
		int i_89_ = i_88_ * ((Class108_Sub1) this).anInt9291;
		int i_90_ = (i_88_ + i_84_) * i_86_ + i_82_;
		for (int i_91_ = 0; i_91_ < ((Class108_Sub1) this).anInt9291;
		     i_91_++) {
		    if ((((Class108_Sub1) this).anIntArray9288[i_89_]
			 & ~0xffffff)
			!= -16777216)
			((Class108_Sub1) this).aBool9289 = true;
		    is[i_90_++]
			= ((Class108_Sub1) this).anIntArray9288[i_89_++];
		}
	    }
	    ((Class108_Sub1) this).anInt9294 -= i_82_;
	    ((Class108_Sub1) this).anInt9292 -= i_84_;
	    ((Class108_Sub1) this).anInt9295 -= i_83_;
	    ((Class108_Sub1) this).anInt9293 -= i_85_;
	    ((Class108_Sub1) this).anInt9291 = i_86_;
	    ((Class108_Sub1) this).anInt9290 = i_87_;
	    ((Class108_Sub1) this).anIntArray9288 = is;
	}
    }
    
    public void method2699(int i) {
	int i_92_ = 0;
	((Class108_Sub1) this).aBool9289 = false;
	int[] is = new int[(((Class108_Sub1) this).anInt9291
			    * ((Class108_Sub1) this).anInt9290)];
	for (int i_93_ = 0; i_93_ < ((Class108_Sub1) this).anInt9290;
	     i_93_++) {
	    for (int i_94_ = 0; i_94_ < ((Class108_Sub1) this).anInt9291;
		 i_94_++) {
		int i_95_ = ((Class108_Sub1) this).anIntArray9288[i_92_];
		if ((i_95_ & ~0xffffff) == 0) {
		    if (i_94_ > 0
			&& (((Class108_Sub1) this).anIntArray9288[i_92_ - 1]
			    & ~0xffffff) != 0)
			i_95_ = i;
		    else if (i_93_ > 0
			     && ((((Class108_Sub1) this).anIntArray9288
				  [i_92_ - ((Class108_Sub1) this).anInt9291])
				 & ~0xffffff) != 0)
			i_95_ = i;
		    else if (i_94_ < ((Class108_Sub1) this).anInt9291 - 1
			     && ((((Class108_Sub1) this).anIntArray9288
				  [i_92_ + 1])
				 & ~0xffffff) != 0)
			i_95_ = i;
		    else if (i_93_ < ((Class108_Sub1) this).anInt9290 - 1
			     && ((((Class108_Sub1) this).anIntArray9288
				  [i_92_ + ((Class108_Sub1) this).anInt9291])
				 & ~0xffffff) != 0)
			i_95_ = i;
		}
		if ((i_95_ & ~0xffffff) != -16777216)
		    ((Class108_Sub1) this).aBool9289 = true;
		is[i_92_++] = i_95_;
	    }
	}
	((Class108_Sub1) this).anIntArray9288 = is;
    }
    
    public void method2739(int i) {
	int i_96_ = 0;
	((Class108_Sub1) this).aBool9289 = false;
	int[] is = new int[(((Class108_Sub1) this).anInt9291
			    * ((Class108_Sub1) this).anInt9290)];
	for (int i_97_ = 0; i_97_ < ((Class108_Sub1) this).anInt9290;
	     i_97_++) {
	    for (int i_98_ = 0; i_98_ < ((Class108_Sub1) this).anInt9291;
		 i_98_++) {
		int i_99_ = ((Class108_Sub1) this).anIntArray9288[i_96_];
		if ((i_99_ & ~0xffffff) == 0) {
		    if (i_98_ > 0
			&& (((Class108_Sub1) this).anIntArray9288[i_96_ - 1]
			    & ~0xffffff) != 0)
			i_99_ = i;
		    else if (i_97_ > 0
			     && ((((Class108_Sub1) this).anIntArray9288
				  [i_96_ - ((Class108_Sub1) this).anInt9291])
				 & ~0xffffff) != 0)
			i_99_ = i;
		    else if (i_98_ < ((Class108_Sub1) this).anInt9291 - 1
			     && ((((Class108_Sub1) this).anIntArray9288
				  [i_96_ + 1])
				 & ~0xffffff) != 0)
			i_99_ = i;
		    else if (i_97_ < ((Class108_Sub1) this).anInt9290 - 1
			     && ((((Class108_Sub1) this).anIntArray9288
				  [i_96_ + ((Class108_Sub1) this).anInt9291])
				 & ~0xffffff) != 0)
			i_99_ = i;
		}
		if ((i_99_ & ~0xffffff) != -16777216)
		    ((Class108_Sub1) this).aBool9289 = true;
		is[i_96_++] = i_99_;
	    }
	}
	((Class108_Sub1) this).anIntArray9288 = is;
    }
    
    public void method2747() {
	int[] is = ((Class108_Sub1) this).anIntArray9288;
	for (int i = (((Class108_Sub1) this).anInt9290 >> 1) - 1; i >= 0;
	     i--) {
	    int i_100_ = i * ((Class108_Sub1) this).anInt9291;
	    int i_101_ = ((((Class108_Sub1) this).anInt9290 - i - 1)
			  * ((Class108_Sub1) this).anInt9291);
	    for (int i_102_ = -((Class108_Sub1) this).anInt9291; i_102_ < 0;
		 i_102_++) {
		int i_103_ = is[i_100_];
		is[i_100_] = is[i_101_];
		is[i_101_] = i_103_;
		i_100_++;
		i_101_++;
	    }
	}
	int i = ((Class108_Sub1) this).anInt9292;
	((Class108_Sub1) this).anInt9292 = ((Class108_Sub1) this).anInt9293;
	((Class108_Sub1) this).anInt9293 = i;
    }
    
    public void method2716(int i) {
	for (int i_104_ = ((Class108_Sub1) this).anInt9290 - 1; i_104_ > 0;
	     i_104_--) {
	    int i_105_ = i_104_ * ((Class108_Sub1) this).anInt9291;
	    for (int i_106_ = ((Class108_Sub1) this).anInt9291 - 1; i_106_ > 0;
		 i_106_--) {
		if ((((Class108_Sub1) this).anIntArray9288[i_106_ + i_105_]
		     & ~0xffffff) == 0
		    && ((((Class108_Sub1) this).anIntArray9288
			 [(i_106_ + i_105_ - 1
			   - ((Class108_Sub1) this).anInt9291)])
			& ~0xffffff) != 0)
		    ((Class108_Sub1) this).anIntArray9288[i_106_ + i_105_] = i;
	    }
	}
    }
    
    public void method2734() {
	int[] is = ((Class108_Sub1) this).anIntArray9288;
	for (int i = ((Class108_Sub1) this).anInt9290 - 1; i >= 0; i--) {
	    int i_107_ = i * ((Class108_Sub1) this).anInt9291;
	    for (int i_108_ = (i + 1) * ((Class108_Sub1) this).anInt9291;
		 i_107_ < i_108_; i_107_++) {
		i_108_--;
		int i_109_ = is[i_107_];
		is[i_107_] = is[i_108_];
		is[i_108_] = i_109_;
	    }
	}
	int i = ((Class108_Sub1) this).anInt9294;
	((Class108_Sub1) this).anInt9294 = ((Class108_Sub1) this).anInt9295;
	((Class108_Sub1) this).anInt9295 = i;
    }
    
    public void method2738() {
	int[] is = ((Class108_Sub1) this).anIntArray9288;
	for (int i = (((Class108_Sub1) this).anInt9290 >> 1) - 1; i >= 0;
	     i--) {
	    int i_110_ = i * ((Class108_Sub1) this).anInt9291;
	    int i_111_ = ((((Class108_Sub1) this).anInt9290 - i - 1)
			  * ((Class108_Sub1) this).anInt9291);
	    for (int i_112_ = -((Class108_Sub1) this).anInt9291; i_112_ < 0;
		 i_112_++) {
		int i_113_ = is[i_110_];
		is[i_110_] = is[i_111_];
		is[i_111_] = i_113_;
		i_110_++;
		i_111_++;
	    }
	}
	int i = ((Class108_Sub1) this).anInt9292;
	((Class108_Sub1) this).anInt9292 = ((Class108_Sub1) this).anInt9293;
	((Class108_Sub1) this).anInt9293 = i;
    }
    
    public void method2744() {
	int[] is = ((Class108_Sub1) this).anIntArray9288;
	for (int i = (((Class108_Sub1) this).anInt9290 >> 1) - 1; i >= 0;
	     i--) {
	    int i_114_ = i * ((Class108_Sub1) this).anInt9291;
	    int i_115_ = ((((Class108_Sub1) this).anInt9290 - i - 1)
			  * ((Class108_Sub1) this).anInt9291);
	    for (int i_116_ = -((Class108_Sub1) this).anInt9291; i_116_ < 0;
		 i_116_++) {
		int i_117_ = is[i_114_];
		is[i_114_] = is[i_115_];
		is[i_115_] = i_117_;
		i_114_++;
		i_115_++;
	    }
	}
	int i = ((Class108_Sub1) this).anInt9292;
	((Class108_Sub1) this).anInt9292 = ((Class108_Sub1) this).anInt9293;
	((Class108_Sub1) this).anInt9293 = i;
    }
    
    public void method2745() {
	int[] is = ((Class108_Sub1) this).anIntArray9288;
	for (int i = (((Class108_Sub1) this).anInt9290 >> 1) - 1; i >= 0;
	     i--) {
	    int i_118_ = i * ((Class108_Sub1) this).anInt9291;
	    int i_119_ = ((((Class108_Sub1) this).anInt9290 - i - 1)
			  * ((Class108_Sub1) this).anInt9291);
	    for (int i_120_ = -((Class108_Sub1) this).anInt9291; i_120_ < 0;
		 i_120_++) {
		int i_121_ = is[i_118_];
		is[i_118_] = is[i_119_];
		is[i_119_] = i_121_;
		i_118_++;
		i_119_++;
	    }
	}
	int i = ((Class108_Sub1) this).anInt9292;
	((Class108_Sub1) this).anInt9292 = ((Class108_Sub1) this).anInt9293;
	((Class108_Sub1) this).anInt9293 = i;
    }
    
    public int[] method2746(boolean bool) {
	if (bool && (getHeight() != ((Class108_Sub1) this).anInt9291
		     || getWidth() != ((Class108_Sub1) this).anInt9290)) {
	    int i = getHeight();
	    int[] is = new int[i * getWidth()];
	    for (int i_122_ = 0; i_122_ < ((Class108_Sub1) this).anInt9290;
		 i_122_++) {
		int i_123_ = i_122_ * ((Class108_Sub1) this).anInt9291;
		int i_124_
		    = (((Class108_Sub1) this).anInt9294
		       + (i_122_ + ((Class108_Sub1) this).anInt9292) * i);
		for (int i_125_ = 0; i_125_ < ((Class108_Sub1) this).anInt9291;
		     i_125_++) {
		    is[i_124_++]
			= ((Class108_Sub1) this).anIntArray9288[i_123_];
		    i_123_++;
		}
	    }
	    return is;
	}
	return ((Class108_Sub1) this).anIntArray9288;
    }
    
    public void method2751(int i, int i_126_, int i_127_) {
	for (int i_128_ = 1;
	     i_128_ < ((Class108_Sub1) this).anIntArray9288.length; i_128_++) {
	    int i_129_
		= ((Class108_Sub1) this).anIntArray9288[i_128_] >> 16 & 0xff;
	    i_129_ += i;
	    if (i_129_ < 0)
		i_129_ = 0;
	    else if (i_129_ > 255)
		i_129_ = 255;
	    int i_130_
		= ((Class108_Sub1) this).anIntArray9288[i_128_] >> 8 & 0xff;
	    i_130_ += i_126_;
	    if (i_130_ < 0)
		i_130_ = 0;
	    else if (i_130_ > 255)
		i_130_ = 255;
	    int i_131_
		= ((Class108_Sub1) this).anIntArray9288[i_128_] >> 0 & 0xff;
	    i_131_ += i_127_;
	    if (i_131_ < 0)
		i_131_ = 0;
	    else if (i_131_ > 255)
		i_131_ = 255;
	    ((Class108_Sub1) this).anIntArray9288[i_128_]
		= (((Class108_Sub1) this).anIntArray9288[i_128_] & ~0xffffff
		   | i_129_ << 16 | i_130_ << 8 | i_131_);
	}
    }
    
    public void method2748(int i, int i_132_, int i_133_) {
	for (int i_134_ = 1;
	     i_134_ < ((Class108_Sub1) this).anIntArray9288.length; i_134_++) {
	    int i_135_
		= ((Class108_Sub1) this).anIntArray9288[i_134_] >> 16 & 0xff;
	    i_135_ += i;
	    if (i_135_ < 0)
		i_135_ = 0;
	    else if (i_135_ > 255)
		i_135_ = 255;
	    int i_136_
		= ((Class108_Sub1) this).anIntArray9288[i_134_] >> 8 & 0xff;
	    i_136_ += i_132_;
	    if (i_136_ < 0)
		i_136_ = 0;
	    else if (i_136_ > 255)
		i_136_ = 255;
	    int i_137_
		= ((Class108_Sub1) this).anIntArray9288[i_134_] >> 0 & 0xff;
	    i_137_ += i_133_;
	    if (i_137_ < 0)
		i_137_ = 0;
	    else if (i_137_ > 255)
		i_137_ = 255;
	    ((Class108_Sub1) this).anIntArray9288[i_134_]
		= (((Class108_Sub1) this).anIntArray9288[i_134_] & ~0xffffff
		   | i_135_ << 16 | i_136_ << 8 | i_137_);
	}
    }
    
    public void method2749(int i, int i_138_, int i_139_) {
	for (int i_140_ = 1;
	     i_140_ < ((Class108_Sub1) this).anIntArray9288.length; i_140_++) {
	    int i_141_
		= ((Class108_Sub1) this).anIntArray9288[i_140_] >> 16 & 0xff;
	    i_141_ += i;
	    if (i_141_ < 0)
		i_141_ = 0;
	    else if (i_141_ > 255)
		i_141_ = 255;
	    int i_142_
		= ((Class108_Sub1) this).anIntArray9288[i_140_] >> 8 & 0xff;
	    i_142_ += i_138_;
	    if (i_142_ < 0)
		i_142_ = 0;
	    else if (i_142_ > 255)
		i_142_ = 255;
	    int i_143_
		= ((Class108_Sub1) this).anIntArray9288[i_140_] >> 0 & 0xff;
	    i_143_ += i_139_;
	    if (i_143_ < 0)
		i_143_ = 0;
	    else if (i_143_ > 255)
		i_143_ = 255;
	    ((Class108_Sub1) this).anIntArray9288[i_140_]
		= (((Class108_Sub1) this).anIntArray9288[i_140_] & ~0xffffff
		   | i_141_ << 16 | i_142_ << 8 | i_143_);
	}
    }
    
    public void method2733() {
	((Class108_Sub1) this).anInt9293 = 0;
	((Class108_Sub1) this).anInt9292 = 0;
	((Class108_Sub1) this).anInt9295 = 0;
	((Class108_Sub1) this).anInt9294 = 0;
    }
    
    public int getWidth() {
	return (((Class108_Sub1) this).anInt9290
		+ ((Class108_Sub1) this).anInt9292
		+ ((Class108_Sub1) this).anInt9293);
    }
    
    public void method2704(int i) {
	for (int i_144_ = ((Class108_Sub1) this).anInt9290 - 1; i_144_ > 0;
	     i_144_--) {
	    int i_145_ = i_144_ * ((Class108_Sub1) this).anInt9291;
	    for (int i_146_ = ((Class108_Sub1) this).anInt9291 - 1; i_146_ > 0;
		 i_146_--) {
		if ((((Class108_Sub1) this).anIntArray9288[i_146_ + i_145_]
		     & ~0xffffff) == 0
		    && ((((Class108_Sub1) this).anIntArray9288
			 [(i_146_ + i_145_ - 1
			   - ((Class108_Sub1) this).anInt9291)])
			& ~0xffffff) != 0)
		    ((Class108_Sub1) this).anIntArray9288[i_146_ + i_145_] = i;
	    }
	}
    }
    
    public void method2693() {
	int[] is = new int[(((Class108_Sub1) this).anInt9291
			    * ((Class108_Sub1) this).anInt9290)];
	int i = 0;
	for (int i_147_ = 0; i_147_ < ((Class108_Sub1) this).anInt9291;
	     i_147_++) {
	    for (int i_148_ = ((Class108_Sub1) this).anInt9290 - 1;
		 i_148_ >= 0; i_148_--)
		is[i++]
		    = (((Class108_Sub1) this).anIntArray9288
		       [i_147_ + i_148_ * ((Class108_Sub1) this).anInt9291]);
	}
	((Class108_Sub1) this).anIntArray9288 = is;
	int i_149_ = ((Class108_Sub1) this).anInt9292;
	((Class108_Sub1) this).anInt9292 = ((Class108_Sub1) this).anInt9294;
	((Class108_Sub1) this).anInt9294 = ((Class108_Sub1) this).anInt9293;
	((Class108_Sub1) this).anInt9293 = ((Class108_Sub1) this).anInt9295;
	((Class108_Sub1) this).anInt9295 = i_149_;
	i_149_ = ((Class108_Sub1) this).anInt9290;
	((Class108_Sub1) this).anInt9290 = ((Class108_Sub1) this).anInt9291;
	((Class108_Sub1) this).anInt9291 = i_149_;
    }
}
