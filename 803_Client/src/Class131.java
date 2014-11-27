/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class131 implements Interface20
{
    SoundManager this$0;
    
    public void method122(Object object, float[] fs, Object[] objects) {
	Class221 class221 = (Class221) object;
	Class287 class287 = class221.method4408(76916034);
	float f = class221.method4409(400487080);
	float f_0_ = class221.method4406(-1537695724);
	Class287 class287_1_ = ((Class131) this).this$0.method1140(515282379);
	Class287 class287_2_ = Class287.method5578(class287, class287_1_);
	float f_3_ = 0.0F;
	float f_4_ = class287_2_.method5559();
	if (f_4_ >= f_0_)
	    f_3_ = 0.0F;
	else {
	    float f_5_ = ((Float) objects[0]).floatValue();
	    float f_6_ = ((Float) objects[1]).floatValue();
	    if (class287_1_.aFloat4477 > class287.aFloat4477 - f_5_ / 2.0F
		&& class287_1_.aFloat4477 < f_5_ / 2.0F + class287.aFloat4477
		&& class287_1_.aFloat4479 > class287.aFloat4479 - f_6_ / 2.0F
		&& (class287_1_.aFloat4479
		    < class287.aFloat4479 + f_6_ / 2.0F)) {
		float f_7_ = Math.abs(class287_1_.aFloat4477
				      - (f_5_ / 2.0F + class287.aFloat4477));
		float f_8_
		    = Math.abs(class287_1_.aFloat4477 - (class287.aFloat4477
							 - f_5_ / 2.0F));
		float f_9_
		    = Math.abs(class287_1_.aFloat4479 - (class287.aFloat4477
							 + f_6_ / 2.0F));
		float f_10_
		    = Math.abs(class287_1_.aFloat4479 - (class287.aFloat4477
							 - f_6_ / 2.0F));
		float f_11_ = f_0_ - f;
		float f_12_ = Math.min(f_7_, f_8_);
		float f_13_ = Math.min(f_9_, f_10_);
		float f_14_ = 1.0F / f_11_ * f_12_;
		float f_15_ = f_13_ * (1.0F / f_11_);
		f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
		f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
		f_3_ = Math.min(f_14_, f_15_);
	    }
	}
	fs[0] = f_3_;
	fs[1] = f_3_;
    }
    
    Class131(SoundManager class49) {
	((Class131) this).this$0 = class49;
    }
    
    public void method123(Object object, float[] fs, Object[] objects, int i) {
	Class221 class221 = (Class221) object;
	Class287 class287 = class221.method4408(-1856254770);
	float f = class221.method4409(-1019984516);
	float f_16_ = class221.method4406(-1537695724);
	Class287 class287_17_ = ((Class131) this).this$0.method1140(515282379);
	Class287 class287_18_ = Class287.method5578(class287, class287_17_);
	float f_19_ = 0.0F;
	float f_20_ = class287_18_.method5559();
	if (f_20_ >= f_16_)
	    f_19_ = 0.0F;
	else {
	    float f_21_ = ((Float) objects[0]).floatValue();
	    float f_22_ = ((Float) objects[1]).floatValue();
	    if (class287_17_.aFloat4477 > class287.aFloat4477 - f_21_ / 2.0F
		&& class287_17_.aFloat4477 < f_21_ / 2.0F + class287.aFloat4477
		&& class287_17_.aFloat4479 > class287.aFloat4479 - f_22_ / 2.0F
		&& (class287_17_.aFloat4479
		    < class287.aFloat4479 + f_22_ / 2.0F)) {
		float f_23_ = Math.abs(class287_17_.aFloat4477
				       - (f_21_ / 2.0F + class287.aFloat4477));
		float f_24_
		    = Math.abs(class287_17_.aFloat4477 - (class287.aFloat4477
							  - f_21_ / 2.0F));
		float f_25_
		    = Math.abs(class287_17_.aFloat4479 - (class287.aFloat4477
							  + f_22_ / 2.0F));
		float f_26_
		    = Math.abs(class287_17_.aFloat4479 - (class287.aFloat4477
							  - f_22_ / 2.0F));
		float f_27_ = f_16_ - f;
		float f_28_ = Math.min(f_23_, f_24_);
		float f_29_ = Math.min(f_25_, f_26_);
		float f_30_ = 1.0F / f_27_ * f_28_;
		float f_31_ = f_29_ * (1.0F / f_27_);
		f_30_ = Math.min(Math.max(f_30_, 0.0F), 1.0F);
		f_31_ = Math.min(Math.max(f_31_, 0.0F), 1.0F);
		f_19_ = Math.min(f_30_, f_31_);
	    }
	}
	fs[0] = f_19_;
	fs[1] = f_19_;
    }
    
    static final void method3073(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	int i_32_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_33_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_34_ = (((ClientScriptData) class454).integerStack
		     [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_35_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 3]);
	int i_36_ = 256;
	Class402.soundManager.method1162(Class112.aClass112_1522, i_32_,
					  i_33_, i_35_,
					  Class130.aClass130_1597
					      .method3067(-960497231),
					  Class127.aClass127_1587, 0.0F, 0.0F,
					  null, 0, i_36_, i_34_, 1809187888);
    }
    
    static final void method3074(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_37_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	boolean bool
	    = 1 == (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	if (!Class351_Sub1.method16842(i_37_, bool, -1889161305))
	    throw new RuntimeException();
    }
    
    static final void method3075(ClientScriptData class454, short i) {
	int i_38_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871
		  .method7880(i_38_, 996762312);
    }
}
