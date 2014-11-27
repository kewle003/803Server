/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class110 implements Interface20
{
    SoundManager this$0;
    static int[] anIntArray1512;
    
    public void method123(Object object, float[] fs, Object[] objects, int i) {
	Class221 class221 = (Class221) object;
	Class287 class287 = class221.method4408(-670506741);
	float f = class221.method4409(-878951731);
	float f_0_ = class221.method4406(-1537695724);
	Class287 class287_1_
	    = Class287.method5578(class287, ((Class110) this).this$0
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
	fs[0] = f_2_;
	fs[1] = f_2_;
    }
    
    Class110(SoundManager class49) {
	((Class110) this).this$0 = class49;
    }
    
    public void method122(Object object, float[] fs, Object[] objects) {
	Class221 class221 = (Class221) object;
	Class287 class287 = class221.method4408(837045719);
	float f = class221.method4409(635412271);
	float f_5_ = class221.method4406(-1537695724);
	Class287 class287_6_
	    = Class287.method5578(class287, ((Class110) this).this$0
						.method1140(515282379));
	float f_7_ = 0.0F;
	float f_8_ = class287_6_.method5559();
	if (f_8_ >= f_5_)
	    f_7_ = 0.0F;
	if (f_8_ <= f)
	    f_7_ = 1.0F;
	else {
	    float f_9_ = 1.0F - 1.0F / (f_5_ - f) * (f_8_ - f);
	    if ((double) f_9_ < 0.0 || (double) f_9_ > 1.0)
		f_9_ = Math.min(Math.max(f_9_, 0.0F), 1.0F);
	    f_7_ = f_9_;
	}
	fs[0] = f_7_;
	fs[1] = f_7_;
    }
    
    static final void method2771(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	Class525.method11755(class58, class454, 1736754263);
    }
    
    static final void method2772(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub1_8874,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      != 0) ? 1 : 0,
	     (byte) 2);
	Class167.method3600((short) -26877);
    }
}
