/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class94 implements Interface20
{
    SoundManager this$0;
    static int anInt1327;
    
    public void method123(Object object, float[] fs, Object[] objects, int i) {
	Class221 class221 = (Class221) object;
	Class287 class287 = class221.method4408(1204109648);
	float f = class221.method4409(-1013679783);
	float f_0_ = class221.method4406(-1537695724);
	Class287 class287_1_
	    = Class287.method5578(class287, ((Class94) this).this$0
						.method1140(515282379));
	float f_2_ = 0.0F;
	float f_3_ = class287_1_.method5559();
	if (f_3_ >= f_0_)
	    f_2_ = 0.0F;
	if (f_3_ <= f)
	    f_2_ = 1.0F;
	else {
	    float f_4_ = 1.0F - 1.0F / (f_0_ - f) * (f_3_ - f);
	    if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
		f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
	    f_2_ = f_4_;
	}
	int i_5_ = 8192;
	float f_6_ = 0.0F;
	if (115241065 * Class296.anInt4513 == 4) {
	    float f_7_
		= Class445_Sub16.aClass351_Sub1_8660.method6292((byte) 6);
	    if (0.0F != class287_1_.aFloat4477
		|| class287_1_.aFloat4479 != 0.0F) {
		int i_8_
		    = (((int) ((double) (-1.0F * f_7_) * 2607.5945876176133)
			- (int) (Math.atan2((double) class287_1_.aFloat4477,
					    (double) class287_1_.aFloat4479)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_8_ > 8192)
		    i_8_ = 16384 - i_8_;
		int i_9_;
		if (f_3_ <= 0.0F)
		    i_9_ = 8192;
		else if (f_3_ >= 4096.0F)
		    i_9_ = 16384;
		else
		    i_9_ = (int) (f_3_ * 8192.0F / 4096.0F + 8192.0F);
		i_5_ = i_8_ * i_9_ / 8192 + (16384 - i_9_ >> 1);
	    }
	    f_6_ = (float) i_5_ * 6.1035156E-5F;
	} else {
	    if (0.0F != class287_1_.aFloat4477
		|| class287_1_.aFloat4479 != 0.0F) {
		int i_10_
		    = ((-(-2112344687 * Class322.anInt4909)
			- (int) (Math.atan2((double) class287_1_.aFloat4477,
					    (double) class287_1_.aFloat4479)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_10_ > 8192)
		    i_10_ = 16384 - i_10_;
		int i_11_;
		if (f_3_ <= 0.0F)
		    i_11_ = 8192;
		else if (f_3_ >= 4096.0F)
		    i_11_ = 16384;
		else
		    i_11_ = (int) (8192.0F * f_3_ / 4096.0F + 8192.0F);
		i_5_ = i_11_ * i_10_ / 8192 + (16384 - i_11_ >> 1);
	    }
	    f_6_ = 6.1035156E-5F * (float) i_5_;
	}
	fs[0] = (float) (i_5_ < 0 ? (double) f_2_
			 : (double) f_2_ * Math.sqrt((double) ((1.0F - f_6_)
							       * 2.0F)));
	fs[1] = (float) (i_5_ < 0 ? (double) -f_2_
			 : (double) f_2_ * Math.sqrt((double) (f_6_ * 2.0F)));
    }
    
    public void method122(Object object, float[] fs, Object[] objects) {
	Class221 class221 = (Class221) object;
	Class287 class287 = class221.method4408(-871979778);
	float f = class221.method4409(441346685);
	float f_12_ = class221.method4406(-1537695724);
	Class287 class287_13_
	    = Class287.method5578(class287, ((Class94) this).this$0
						.method1140(515282379));
	float f_14_ = 0.0F;
	float f_15_ = class287_13_.method5559();
	if (f_15_ >= f_12_)
	    f_14_ = 0.0F;
	if (f_15_ <= f)
	    f_14_ = 1.0F;
	else {
	    float f_16_ = 1.0F - 1.0F / (f_12_ - f) * (f_15_ - f);
	    if ((double) f_16_ < 0.0 || (double) f_16_ > 1.0)
		f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
	    f_14_ = f_16_;
	}
	int i = 8192;
	float f_17_ = 0.0F;
	if (115241065 * Class296.anInt4513 == 4) {
	    float f_18_
		= Class445_Sub16.aClass351_Sub1_8660.method6292((byte) 50);
	    if (0.0F != class287_13_.aFloat4477
		|| class287_13_.aFloat4479 != 0.0F) {
		int i_19_
		    = (((int) ((double) (-1.0F * f_18_) * 2607.5945876176133)
			- (int) (Math.atan2((double) class287_13_.aFloat4477,
					    (double) class287_13_.aFloat4479)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_19_ > 8192)
		    i_19_ = 16384 - i_19_;
		int i_20_;
		if (f_15_ <= 0.0F)
		    i_20_ = 8192;
		else if (f_15_ >= 4096.0F)
		    i_20_ = 16384;
		else
		    i_20_ = (int) (f_15_ * 8192.0F / 4096.0F + 8192.0F);
		i = i_19_ * i_20_ / 8192 + (16384 - i_20_ >> 1);
	    }
	    f_17_ = (float) i * 6.1035156E-5F;
	} else {
	    if (0.0F != class287_13_.aFloat4477
		|| class287_13_.aFloat4479 != 0.0F) {
		int i_21_
		    = ((-(-2112344687 * Class322.anInt4909)
			- (int) (Math.atan2((double) class287_13_.aFloat4477,
					    (double) class287_13_.aFloat4479)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_21_ > 8192)
		    i_21_ = 16384 - i_21_;
		int i_22_;
		if (f_15_ <= 0.0F)
		    i_22_ = 8192;
		else if (f_15_ >= 4096.0F)
		    i_22_ = 16384;
		else
		    i_22_ = (int) (8192.0F * f_15_ / 4096.0F + 8192.0F);
		i = i_22_ * i_21_ / 8192 + (16384 - i_22_ >> 1);
	    }
	    f_17_ = 6.1035156E-5F * (float) i;
	}
	fs[0] = (float) (i < 0 ? (double) f_14_
			 : (double) f_14_ * Math.sqrt((double) ((1.0F - f_17_)
								* 2.0F)));
	fs[1]
	    = (float) (i < 0 ? (double) -f_14_
		       : (double) f_14_ * Math.sqrt((double) (f_17_ * 2.0F)));
    }
    
    Class94(SoundManager class49) {
	((Class94) this).this$0 = class49;
    }
    
    static final void method2097(ClientScriptData class454, byte i) {
	int i_23_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (JS5.itemDefLoader.list(i_23_, (short) 5899)
	       .equipSlotID) * -16072637;
    }
    
    static final void method2098(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_24_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_25_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	ParamType class603
	    = Class621.paramTypeList.list(i_25_, 1510474505);
	if (class603.method13186(-181964761))
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= MasterIndex.npcDefLoader.getNpcDefinition(i_24_, -1555762058)
		      .method7149(i_25_, class603.defaultstr, (byte) -118);
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= (MasterIndex.npcDefLoader.getNpcDefinition(i_24_, -2013044456)
		       .method7148
		   (i_25_, class603.defaultint * 2015998927, (byte) -68));
    }
}
