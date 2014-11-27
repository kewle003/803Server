/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class125 implements Interface20
{
    static Class241_Sub39_Sub11 aClass241_Sub39_Sub11_1582;
    SoundManager this$0;
    
    Class125(SoundManager class49) {
	((Class125) this).this$0 = class49;
    }
    
    public void method123(Object object, float[] fs, Object[] objects, int i) {
	Class221 class221 = (Class221) object;
	Class287 class287 = class221.method4408(-39121957);
	float f = class221.method4409(1808098798);
	float f_0_ = class221.method4406(-1537695724);
	Class287 class287_1_ = ((Class125) this).this$0.method1140(515282379);
	Class287 class287_2_ = Class287.method5578(class287, class287_1_);
	float f_3_ = 0.0F;
	int i_4_ = 8192;
	float f_5_ = class287_2_.method5559();
	float f_6_ = 0.0F;
	if (f_5_ >= f_0_)
	    f_3_ = 0.0F;
	else {
	    float f_7_ = ((Float) objects[0]).floatValue();
	    float f_8_ = ((Float) objects[1]).floatValue();
	    if (class287_1_.aFloat4477 > class287.aFloat4477 - f_7_ / 2.0F
		&& class287_1_.aFloat4477 < class287.aFloat4477 + f_7_ / 2.0F
		&& class287_1_.aFloat4479 > class287.aFloat4479 - f_8_ / 2.0F
		&& (class287_1_.aFloat4479
		    < class287.aFloat4479 + f_8_ / 2.0F)) {
		float f_9_ = Math.abs(class287_1_.aFloat4477
				      - (f_7_ / 2.0F + class287.aFloat4477));
		float f_10_
		    = Math.abs(class287_1_.aFloat4477 - (class287.aFloat4477
							 - f_7_ / 2.0F));
		float f_11_ = Math.abs(class287_1_.aFloat4479
				       - (f_8_ / 2.0F + class287.aFloat4477));
		float f_12_
		    = Math.abs(class287_1_.aFloat4479 - (class287.aFloat4477
							 - f_8_ / 2.0F));
		float f_13_ = f_0_ - f;
		float f_14_ = Math.min(f_9_, f_10_);
		float f_15_ = Math.min(f_11_, f_12_);
		float f_16_ = 1.0F / f_13_ * f_14_;
		float f_17_ = 1.0F / f_13_ * f_15_;
		f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
		f_17_ = Math.min(Math.max(f_17_, 0.0F), 1.0F);
		f_3_ = Math.min(f_16_, f_17_);
	    }
	    if (0.0F != class287_2_.aFloat4477
		|| class287_2_.aFloat4479 != 0.0F) {
		if (4 == 115241065 * Class296.anInt4513) {
		    float f_18_ = Class445_Sub16.aClass351_Sub1_8660
				      .method6292((byte) 83);
		    if (class287_2_.aFloat4477 != 0.0F
			|| 0.0F != class287_2_.aFloat4479) {
			int i_19_
			    = (((int) (2607.5945876176133
				       * (double) (f_18_ * -1.0F))
				- (int) (Math.atan2((double) (class287_2_
							      .aFloat4477),
						    (double) (class287_2_
							      .aFloat4479))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_19_ > 8192)
			    i_19_ = 16384 - i_19_;
			int i_20_;
			if (f_5_ <= 0.0F)
			    i_20_ = 8192;
			else if (f_5_ >= 4096.0F)
			    i_20_ = 16384;
			else
			    i_20_ = (int) (8192.0F + f_5_ * 8192.0F / 4096.0F);
			i_4_ = (16384 - i_20_ >> 1) + i_20_ * i_19_ / 8192;
		    }
		    f_6_ = 6.1035156E-5F * (float) i_4_;
		} else {
		    int i_21_
			= (-(-2112344687 * Class322.anInt4909)
			   - (int) (Math.atan2((double) class287_2_.aFloat4477,
					       (double) class287_2_.aFloat4479)
				    * 2607.5945876176133)
			   - 4096) & 0x3fff;
		    if (i_21_ > 8192)
			i_21_ = 16384 - i_21_;
		    int i_22_;
		    if (f_5_ <= 0.0F)
			i_22_ = 8192;
		    else if (f_5_ >= 4096.0F)
			i_22_ = 16384;
		    else
			i_22_ = (int) (8192.0F + 8192.0F * f_5_ / 4096.0F);
		    i_4_ = (16384 - i_22_ >> 1) + i_21_ * i_22_ / 8192;
		    f_6_ = (float) i_4_ * 6.1035156E-5F;
		}
	    }
	}
	fs[0] = (float) (i_4_ < 0 ? (double) f_3_
			 : (double) f_3_ * Math.sqrt((double) (1.0F - f_6_)));
	fs[1] = (float) (i_4_ < 0 ? (double) -f_3_
			 : (double) f_3_ * Math.sqrt((double) f_6_));
    }
    
    public void method122(Object object, float[] fs, Object[] objects) {
	Class221 class221 = (Class221) object;
	Class287 class287 = class221.method4408(953095311);
	float f = class221.method4409(696139386);
	float f_23_ = class221.method4406(-1537695724);
	Class287 class287_24_ = ((Class125) this).this$0.method1140(515282379);
	Class287 class287_25_ = Class287.method5578(class287, class287_24_);
	float f_26_ = 0.0F;
	int i = 8192;
	float f_27_ = class287_25_.method5559();
	float f_28_ = 0.0F;
	if (f_27_ >= f_23_)
	    f_26_ = 0.0F;
	else {
	    float f_29_ = ((Float) objects[0]).floatValue();
	    float f_30_ = ((Float) objects[1]).floatValue();
	    if (class287_24_.aFloat4477 > class287.aFloat4477 - f_29_ / 2.0F
		&& class287_24_.aFloat4477 < class287.aFloat4477 + f_29_ / 2.0F
		&& class287_24_.aFloat4479 > class287.aFloat4479 - f_30_ / 2.0F
		&& (class287_24_.aFloat4479
		    < class287.aFloat4479 + f_30_ / 2.0F)) {
		float f_31_ = Math.abs(class287_24_.aFloat4477
				       - (f_29_ / 2.0F + class287.aFloat4477));
		float f_32_
		    = Math.abs(class287_24_.aFloat4477 - (class287.aFloat4477
							  - f_29_ / 2.0F));
		float f_33_ = Math.abs(class287_24_.aFloat4479
				       - (f_30_ / 2.0F + class287.aFloat4477));
		float f_34_
		    = Math.abs(class287_24_.aFloat4479 - (class287.aFloat4477
							  - f_30_ / 2.0F));
		float f_35_ = f_23_ - f;
		float f_36_ = Math.min(f_31_, f_32_);
		float f_37_ = Math.min(f_33_, f_34_);
		float f_38_ = 1.0F / f_35_ * f_36_;
		float f_39_ = 1.0F / f_35_ * f_37_;
		f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
		f_39_ = Math.min(Math.max(f_39_, 0.0F), 1.0F);
		f_26_ = Math.min(f_38_, f_39_);
	    }
	    if (0.0F != class287_25_.aFloat4477
		|| class287_25_.aFloat4479 != 0.0F) {
		if (4 == 115241065 * Class296.anInt4513) {
		    float f_40_ = Class445_Sub16.aClass351_Sub1_8660
				      .method6292((byte) 90);
		    if (class287_25_.aFloat4477 != 0.0F
			|| 0.0F != class287_25_.aFloat4479) {
			int i_41_
			    = (((int) (2607.5945876176133
				       * (double) (f_40_ * -1.0F))
				- (int) (Math.atan2((double) (class287_25_
							      .aFloat4477),
						    (double) (class287_25_
							      .aFloat4479))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_41_ > 8192)
			    i_41_ = 16384 - i_41_;
			int i_42_;
			if (f_27_ <= 0.0F)
			    i_42_ = 8192;
			else if (f_27_ >= 4096.0F)
			    i_42_ = 16384;
			else
			    i_42_
				= (int) (8192.0F + f_27_ * 8192.0F / 4096.0F);
			i = (16384 - i_42_ >> 1) + i_42_ * i_41_ / 8192;
		    }
		    f_28_ = 6.1035156E-5F * (float) i;
		} else {
		    int i_43_ = ((-(-2112344687 * Class322.anInt4909)
				  - (int) (Math.atan2((double) (class287_25_
								.aFloat4477),
						      (double) (class287_25_
								.aFloat4479))
					   * 2607.5945876176133)
				  - 4096)
				 & 0x3fff);
		    if (i_43_ > 8192)
			i_43_ = 16384 - i_43_;
		    int i_44_;
		    if (f_27_ <= 0.0F)
			i_44_ = 8192;
		    else if (f_27_ >= 4096.0F)
			i_44_ = 16384;
		    else
			i_44_ = (int) (8192.0F + 8192.0F * f_27_ / 4096.0F);
		    i = (16384 - i_44_ >> 1) + i_43_ * i_44_ / 8192;
		    f_28_ = (float) i * 6.1035156E-5F;
		}
	    }
	}
	fs[0]
	    = (float) (i < 0 ? (double) f_26_
		       : (double) f_26_ * Math.sqrt((double) (1.0F - f_28_)));
	fs[1] = (float) (i < 0 ? (double) -f_26_
			 : (double) f_26_ * Math.sqrt((double) f_28_));
    }
    
    public static void method2999(int i, int i_45_, int i_46_, int i_47_) {
	Class223.method4490
	    (new Class413_Sub1(i, i_45_, i_46_, client.anInt8322 * -414507387,
			       -1805229461 * Class117.aClass209_1552.anInt2472,
			       191175519 * Class117.aClass209_1552.anInt2473,
			       Class117.aClass209_1552.method4141(21451655),
			       Class117.aClass209_1552.method4149(16777215),
			       Class506.aClass291_6661
				   .method5670((byte) -121)),
	     -271852291);
    }
    
    static final void method3000(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 93836723;
	int i_48_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_49_ = (((ClientScriptData) class454).integerStack
		     [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_50_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	int i_51_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 3]);
	int i_52_ = (((ClientScriptData) class454).integerStack
		     [4 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (i_50_ == -1)
	    throw new RuntimeException();
	ClientScriptMap class406
	    = Class105_Sub1.cs2MapsList.list(i_50_, (byte) -17);
	if (i_49_ != class406.type)
	    throw new RuntimeException();
	if (i_48_ != class406.aChar5898)
	    throw new RuntimeException();
	int[] is = class406.method7248(Integer.valueOf(i_51_), -50522569);
	if (i_52_ < 0 || null == is || is.length <= i_52_)
	    throw new RuntimeException();
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = is[i_52_];
    }
    
    public static boolean method3001(int i) {
	return Class68.aBool1064;
    }
    
    static final void method3002(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub21_8853
		  .method14294(-16261253) ? 1 : 0;
    }
    
    static final void method3003(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_53_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_54_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	if (null == Class187.aClass35Array2203[i_53_])
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= (Class187.aClass35Array2203[i_53_].components[i_54_]
		   .anInt835) * -173165225;
    }
    
    public static int method3004(int i, int i_55_, int i_56_, int i_57_) {
	if (Class573_Sub1.anInt8787 * -16261253 < 100)
	    return -2;
	int i_58_ = -2;
	int i_59_ = 2147483647;
	int i_60_ = i_55_ - Class573_Sub1.anInt7388;
	int i_61_ = i_56_ - Class573_Sub1.anInt7389;
	for (Class241_Sub41 class241_sub41
		 = ((Class241_Sub41)
		    Class573_Sub1.aClass429_7387.method7694(16711935));
	     class241_sub41 != null;
	     class241_sub41 = (Class241_Sub41) Class573_Sub1.aClass429_7387
						   .method7692(102334448)) {
	    if (-1454932011 * class241_sub41.anInt10158 == i) {
		int i_62_ = class241_sub41.anInt10154 * 669485685;
		int i_63_ = -1535798317 * class241_sub41.anInt10152;
		int i_64_ = (i_62_ + Class573_Sub1.anInt7388 << 14
			     | Class573_Sub1.anInt7389 + i_63_);
		int i_65_ = ((i_60_ - i_62_) * (i_60_ - i_62_)
			     + (i_61_ - i_63_) * (i_61_ - i_63_));
		if (i_58_ < 0 || i_65_ < i_59_) {
		    i_58_ = i_64_;
		    i_59_ = i_65_;
		}
	    }
	}
	return i_58_;
    }
}
