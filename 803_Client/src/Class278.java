/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class278
{
    public float aFloat4390;
    public float aFloat4391;
    static Class278[] aClass278Array4392 = new Class278[0];
    public float aFloat4393;
    static int anInt4394;
    static int anInt4395;
    public float aFloat4396;
    
    public void method5375() {
	synchronized (aClass278Array4392) {
	    if (anInt4395 < anInt4394 - 1)
		aClass278Array4392[anInt4395++] = this;
	}
    }
    
    public static Class278 method5376() {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278 = new Class278();
		return class278;
	    }
	    aClass278Array4392[--anInt4395].method5387();
	    Class278 class278 = aClass278Array4392[anInt4395];
	    return class278;
	}
    }
    
    static final float method5377(Class278 class278, Class278 class278_0_) {
	return class278.method5400(class278_0_);
    }
    
    public static void method5378(int i) {
	anInt4394 = i;
	aClass278Array4392 = new Class278[i];
	anInt4395 = 0;
    }
    
    final void method5379(float f) {
	aFloat4393 *= f;
	aFloat4390 *= f;
	aFloat4391 *= f;
	aFloat4396 *= f;
    }
    
    public Class278() {
	method5387();
    }
    
    public Class278(float f, float f_1_, float f_2_, float f_3_) {
	method5383(f, f_1_, f_2_, f_3_);
    }
    
    final void method5380() {
	aFloat4391 = 0.0F;
	aFloat4390 = 0.0F;
	aFloat4393 = 0.0F;
	aFloat4396 = 1.0F;
    }
    
    public void method5381(RSByteBuffer class241_sub3) {
	aFloat4393 = class241_sub3.method14650(-669460486);
	aFloat4390 = class241_sub3.method14650(-2118517076);
	aFloat4391 = class241_sub3.method14650(-1168872052);
	aFloat4396 = class241_sub3.method14650(-1909485516);
    }
    
    public static Class278 method5382(Class278 class278) {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278_4_ = new Class278(class278);
		return class278_4_;
	    }
	    aClass278Array4392[--anInt4395].method5424(class278);
	    Class278 class278_5_ = aClass278Array4392[anInt4395];
	    return class278_5_;
	}
    }
    
    void method5383(float f, float f_6_, float f_7_, float f_8_) {
	aFloat4393 = f;
	aFloat4390 = f_6_;
	aFloat4391 = f_7_;
	aFloat4396 = f_8_;
    }
    
    static final float method5384(Class278 class278) {
	return (float) Math.sqrt((double) method5377(class278, class278));
    }
    
    public void method5385(Class287 class287, float f) {
	method5409(class287.aFloat4477, class287.aFloat4474,
		   class287.aFloat4479, f);
    }
    
    public final void method5386() {
	float f = 1.0F / method5384(this);
	aFloat4393 *= f;
	aFloat4390 *= f;
	aFloat4391 *= f;
	aFloat4396 *= f;
    }
    
    final void method5387() {
	aFloat4391 = 0.0F;
	aFloat4390 = 0.0F;
	aFloat4393 = 0.0F;
	aFloat4396 = 1.0F;
    }
    
    final float method5388(Class278 class278_9_) {
	return (aFloat4393 * class278_9_.aFloat4393
		+ aFloat4390 * class278_9_.aFloat4390
		+ aFloat4391 * class278_9_.aFloat4391
		+ aFloat4396 * class278_9_.aFloat4396);
    }
    
    public static void method5389(int i) {
	anInt4394 = i;
	aClass278Array4392 = new Class278[i];
	anInt4395 = 0;
    }
    
    public final void method5390() {
	aFloat4393 = -aFloat4393;
	aFloat4390 = -aFloat4390;
	aFloat4391 = -aFloat4391;
    }
    
    public static final Class278 method5391(Class278 class278) {
	Class278 class278_10_ = method5444(class278);
	class278_10_.method5390();
	return class278_10_;
    }
    
    public final void method5392() {
	float f = 1.0F / method5384(this);
	aFloat4393 *= f;
	aFloat4390 *= f;
	aFloat4391 *= f;
	aFloat4396 *= f;
    }
    
    final void method5393(Class278 class278_11_) {
	aFloat4393 += class278_11_.aFloat4393;
	aFloat4390 += class278_11_.aFloat4390;
	aFloat4391 += class278_11_.aFloat4391;
	aFloat4396 += class278_11_.aFloat4396;
    }
    
    static final float method5394(Class278 class278, Class278 class278_12_) {
	return class278.method5400(class278_12_);
    }
    
    public void method5395(float f, float f_13_, float f_14_) {
	method5409(0.0F, 1.0F, 0.0F, f);
	Class278 class278_15_ = method5414();
	class278_15_.method5409(1.0F, 0.0F, 0.0F, f_13_);
	method5396(class278_15_);
	class278_15_.method5409(0.0F, 0.0F, 1.0F, f_14_);
	method5396(class278_15_);
	class278_15_.method5375();
    }
    
    public final void method5396(Class278 class278_16_) {
	method5383((class278_16_.aFloat4396 * aFloat4393
		    + class278_16_.aFloat4393 * aFloat4396
		    + class278_16_.aFloat4390 * aFloat4391
		    - class278_16_.aFloat4391 * aFloat4390),
		   (class278_16_.aFloat4396 * aFloat4390
		    - class278_16_.aFloat4393 * aFloat4391
		    + class278_16_.aFloat4390 * aFloat4396
		    + class278_16_.aFloat4391 * aFloat4393),
		   (class278_16_.aFloat4396 * aFloat4391
		    + class278_16_.aFloat4393 * aFloat4390
		    - class278_16_.aFloat4390 * aFloat4393
		    + class278_16_.aFloat4391 * aFloat4396),
		   (class278_16_.aFloat4396 * aFloat4396
		    - class278_16_.aFloat4393 * aFloat4393
		    - class278_16_.aFloat4390 * aFloat4390
		    - class278_16_.aFloat4391 * aFloat4391));
    }
    
    public Class278(float f, float f_17_, float f_18_) {
	method5395(f, f_17_, f_18_);
    }
    
    static final Class278 method5397(Class278 class278,
				     Class278 class278_19_) {
	Class278 class278_20_ = method5444(class278);
	class278_20_.method5396(class278_19_);
	return class278_20_;
    }
    
    final void method5398(float f) {
	aFloat4393 *= f;
	aFloat4390 *= f;
	aFloat4391 *= f;
	aFloat4396 *= f;
    }
    
    static final Class278 method5399(Class278 class278, float f) {
	Class278 class278_21_ = method5444(class278);
	class278_21_.method5398(f);
	return class278_21_;
    }
    
    final float method5400(Class278 class278_22_) {
	return (aFloat4393 * class278_22_.aFloat4393
		+ aFloat4390 * class278_22_.aFloat4390
		+ aFloat4391 * class278_22_.aFloat4391
		+ aFloat4396 * class278_22_.aFloat4396);
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4393).append(",").append
		   (aFloat4390).append
		   (",").append
		   (aFloat4391).append
		   (",").append
		   (aFloat4396).toString();
    }
    
    static {
	new Class278();
    }
    
    final void method5401() {
	aFloat4393 = -aFloat4393;
	aFloat4390 = -aFloat4390;
	aFloat4391 = -aFloat4391;
	aFloat4396 = -aFloat4396;
    }
    
    static Class278 method5402(float f, float f_23_, float f_24_,
			       float f_25_) {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278 = new Class278(f, f_23_, f_24_, f_25_);
		return class278;
	    }
	    aClass278Array4392[--anInt4395].method5383(f, f_23_, f_24_, f_25_);
	    Class278 class278 = aClass278Array4392[anInt4395];
	    return class278;
	}
    }
    
    static Class278 method5403(float f, float f_26_, float f_27_,
			       float f_28_) {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278 = new Class278(f, f_26_, f_27_, f_28_);
		return class278;
	    }
	    aClass278Array4392[--anInt4395].method5383(f, f_26_, f_27_, f_28_);
	    Class278 class278 = aClass278Array4392[anInt4395];
	    return class278;
	}
    }
    
    public static void method5404(int i) {
	anInt4394 = i;
	aClass278Array4392 = new Class278[i];
	anInt4395 = 0;
    }
    
    public static void method5405(int i) {
	anInt4394 = i;
	aClass278Array4392 = new Class278[i];
	anInt4395 = 0;
    }
    
    public final void method5406(Class278 class278_29_, float f) {
	if (method5400(class278_29_) < 0.0F)
	    method5401();
	method5398(1.0F - f);
	Class278 class278_30_ = method5399(class278_29_, f);
	method5393(class278_30_);
	class278_30_.method5375();
	method5392();
    }
    
    static Class278 method5407(float f, float f_31_, float f_32_,
			       float f_33_) {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278 = new Class278(f, f_31_, f_32_, f_33_);
		return class278;
	    }
	    aClass278Array4392[--anInt4395].method5383(f, f_31_, f_32_, f_33_);
	    Class278 class278 = aClass278Array4392[anInt4395];
	    return class278;
	}
    }
    
    public static void method5408(int i) {
	anInt4394 = i;
	aClass278Array4392 = new Class278[i];
	anInt4395 = 0;
    }
    
    public void method5409(float f, float f_34_, float f_35_, float f_36_) {
	float f_37_ = (float) Math.sin((double) (f_36_ * 0.5F));
	float f_38_ = (float) Math.cos((double) (f_36_ * 0.5F));
	aFloat4393 = f * f_37_;
	aFloat4390 = f_34_ * f_37_;
	aFloat4391 = f_35_ * f_37_;
	aFloat4396 = f_38_;
    }
    
    final float method5410(Class278 class278_39_) {
	return (aFloat4393 * class278_39_.aFloat4393
		+ aFloat4390 * class278_39_.aFloat4390
		+ aFloat4391 * class278_39_.aFloat4391
		+ aFloat4396 * class278_39_.aFloat4396);
    }
    
    public static Class278 method5411() {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278 = new Class278();
		return class278;
	    }
	    aClass278Array4392[--anInt4395].method5387();
	    Class278 class278 = aClass278Array4392[anInt4395];
	    return class278;
	}
    }
    
    public static Class278 method5412() {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278 = new Class278();
		return class278;
	    }
	    aClass278Array4392[--anInt4395].method5387();
	    Class278 class278 = aClass278Array4392[anInt4395];
	    return class278;
	}
    }
    
    static Class278 method5413(float f, float f_40_, float f_41_,
			       float f_42_) {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278 = new Class278(f, f_40_, f_41_, f_42_);
		return class278;
	    }
	    aClass278Array4392[--anInt4395].method5383(f, f_40_, f_41_, f_42_);
	    Class278 class278 = aClass278Array4392[anInt4395];
	    return class278;
	}
    }
    
    public static Class278 method5414() {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278 = new Class278();
		return class278;
	    }
	    aClass278Array4392[--anInt4395].method5387();
	    Class278 class278 = aClass278Array4392[anInt4395];
	    return class278;
	}
    }
    
    public String method5415() {
	return new StringBuilder().append(aFloat4393).append(",").append
		   (aFloat4390).append
		   (",").append
		   (aFloat4391).append
		   (",").append
		   (aFloat4396).toString();
    }
    
    public void method5416(Class278 class278_43_) {
	aFloat4393 = class278_43_.aFloat4393;
	aFloat4390 = class278_43_.aFloat4390;
	aFloat4391 = class278_43_.aFloat4391;
	aFloat4396 = class278_43_.aFloat4396;
    }
    
    public static Class278 method5417(Class278 class278) {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278_44_ = new Class278(class278);
		return class278_44_;
	    }
	    aClass278Array4392[--anInt4395].method5424(class278);
	    Class278 class278_45_ = aClass278Array4392[anInt4395];
	    return class278_45_;
	}
    }
    
    public static void method5418(int i) {
	anInt4394 = i;
	aClass278Array4392 = new Class278[i];
	anInt4395 = 0;
    }
    
    public void method5419() {
	synchronized (aClass278Array4392) {
	    if (anInt4395 < anInt4394 - 1)
		aClass278Array4392[anInt4395++] = this;
	}
    }
    
    public void method5420() {
	synchronized (aClass278Array4392) {
	    if (anInt4395 < anInt4394 - 1)
		aClass278Array4392[anInt4395++] = this;
	}
    }
    
    public void method5421() {
	synchronized (aClass278Array4392) {
	    if (anInt4395 < anInt4394 - 1)
		aClass278Array4392[anInt4395++] = this;
	}
    }
    
    public void method5422(RSByteBuffer class241_sub3) {
	aFloat4393 = class241_sub3.method14650(-2095336089);
	aFloat4390 = class241_sub3.method14650(-1577232559);
	aFloat4391 = class241_sub3.method14650(-1953081209);
	aFloat4396 = class241_sub3.method14650(-267293824);
    }
    
    void method5423(float f, float f_46_, float f_47_, float f_48_) {
	aFloat4393 = f;
	aFloat4390 = f_46_;
	aFloat4391 = f_47_;
	aFloat4396 = f_48_;
    }
    
    public void method5424(Class278 class278_49_) {
	aFloat4393 = class278_49_.aFloat4393;
	aFloat4390 = class278_49_.aFloat4390;
	aFloat4391 = class278_49_.aFloat4391;
	aFloat4396 = class278_49_.aFloat4396;
    }
    
    public static void method5425(int i) {
	anInt4394 = i;
	aClass278Array4392 = new Class278[i];
	anInt4395 = 0;
    }
    
    public void method5426(float f, float f_50_, float f_51_, float f_52_) {
	float f_53_ = (float) Math.sin((double) (f_52_ * 0.5F));
	float f_54_ = (float) Math.cos((double) (f_52_ * 0.5F));
	aFloat4393 = f * f_53_;
	aFloat4390 = f_50_ * f_53_;
	aFloat4391 = f_51_ * f_53_;
	aFloat4396 = f_54_;
    }
    
    public void method5427(float f, float f_55_, float f_56_, float f_57_) {
	float f_58_ = (float) Math.sin((double) (f_57_ * 0.5F));
	float f_59_ = (float) Math.cos((double) (f_57_ * 0.5F));
	aFloat4393 = f * f_58_;
	aFloat4390 = f_55_ * f_58_;
	aFloat4391 = f_56_ * f_58_;
	aFloat4396 = f_59_;
    }
    
    public void method5428(float f, float f_60_, float f_61_, float f_62_) {
	float f_63_ = (float) Math.sin((double) (f_62_ * 0.5F));
	float f_64_ = (float) Math.cos((double) (f_62_ * 0.5F));
	aFloat4393 = f * f_63_;
	aFloat4390 = f_60_ * f_63_;
	aFloat4391 = f_61_ * f_63_;
	aFloat4396 = f_64_;
    }
    
    public void method5429(float f, float f_65_, float f_66_, float f_67_) {
	float f_68_ = (float) Math.sin((double) (f_67_ * 0.5F));
	float f_69_ = (float) Math.cos((double) (f_67_ * 0.5F));
	aFloat4393 = f * f_68_;
	aFloat4390 = f_65_ * f_68_;
	aFloat4391 = f_66_ * f_68_;
	aFloat4396 = f_69_;
    }
    
    public void method5430(float f, float f_70_, float f_71_) {
	method5409(0.0F, 1.0F, 0.0F, f);
	Class278 class278_72_ = method5414();
	class278_72_.method5409(1.0F, 0.0F, 0.0F, f_70_);
	method5396(class278_72_);
	class278_72_.method5409(0.0F, 0.0F, 1.0F, f_71_);
	method5396(class278_72_);
	class278_72_.method5375();
    }
    
    public void method5431(float f, float f_73_, float f_74_) {
	method5409(0.0F, 1.0F, 0.0F, f);
	Class278 class278_75_ = method5414();
	class278_75_.method5409(1.0F, 0.0F, 0.0F, f_73_);
	method5396(class278_75_);
	class278_75_.method5409(0.0F, 0.0F, 1.0F, f_74_);
	method5396(class278_75_);
	class278_75_.method5375();
    }
    
    public void method5432(float f, float f_76_, float f_77_) {
	method5409(0.0F, 1.0F, 0.0F, f);
	Class278 class278_78_ = method5414();
	class278_78_.method5409(1.0F, 0.0F, 0.0F, f_76_);
	method5396(class278_78_);
	class278_78_.method5409(0.0F, 0.0F, 1.0F, f_77_);
	method5396(class278_78_);
	class278_78_.method5375();
    }
    
    final void method5433() {
	aFloat4391 = 0.0F;
	aFloat4390 = 0.0F;
	aFloat4393 = 0.0F;
	aFloat4396 = 1.0F;
    }
    
    public Class278(Class278 class278_79_) {
	method5424(class278_79_);
    }
    
    final void method5434() {
	aFloat4391 = 0.0F;
	aFloat4390 = 0.0F;
	aFloat4393 = 0.0F;
	aFloat4396 = 1.0F;
    }
    
    public final void method5435() {
	aFloat4393 = -aFloat4393;
	aFloat4390 = -aFloat4390;
	aFloat4391 = -aFloat4391;
    }
    
    public final void method5436() {
	aFloat4393 = -aFloat4393;
	aFloat4390 = -aFloat4390;
	aFloat4391 = -aFloat4391;
    }
    
    public static final Class278 method5437(Class278 class278) {
	Class278 class278_80_ = method5444(class278);
	class278_80_.method5390();
	return class278_80_;
    }
    
    public static final Class278 method5438(Class278 class278) {
	Class278 class278_81_ = method5444(class278);
	class278_81_.method5390();
	return class278_81_;
    }
    
    public static final Class278 method5439(Class278 class278) {
	Class278 class278_82_ = method5444(class278);
	class278_82_.method5390();
	return class278_82_;
    }
    
    public final void method5440() {
	float f = 1.0F / method5384(this);
	aFloat4393 *= f;
	aFloat4390 *= f;
	aFloat4391 *= f;
	aFloat4396 *= f;
    }
    
    public final void method5441() {
	float f = 1.0F / method5384(this);
	aFloat4393 *= f;
	aFloat4390 *= f;
	aFloat4391 *= f;
	aFloat4396 *= f;
    }
    
    public void method5442(Class287 class287, float f) {
	method5409(class287.aFloat4477, class287.aFloat4474,
		   class287.aFloat4479, f);
    }
    
    final void method5443(Class278 class278_83_) {
	aFloat4393 += class278_83_.aFloat4393;
	aFloat4390 += class278_83_.aFloat4390;
	aFloat4391 += class278_83_.aFloat4391;
	aFloat4396 += class278_83_.aFloat4396;
    }
    
    public static Class278 method5444(Class278 class278) {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278_84_ = new Class278(class278);
		return class278_84_;
	    }
	    aClass278Array4392[--anInt4395].method5424(class278);
	    Class278 class278_85_ = aClass278Array4392[anInt4395];
	    return class278_85_;
	}
    }
    
    static Class278 method5445(float f, float f_86_, float f_87_,
			       float f_88_) {
	synchronized (aClass278Array4392) {
	    if (anInt4395 == 0) {
		Class278 class278 = new Class278(f, f_86_, f_87_, f_88_);
		return class278;
	    }
	    aClass278Array4392[--anInt4395].method5383(f, f_86_, f_87_, f_88_);
	    Class278 class278 = aClass278Array4392[anInt4395];
	    return class278;
	}
    }
    
    final float method5446(Class278 class278_89_) {
	return (aFloat4393 * class278_89_.aFloat4393
		+ aFloat4390 * class278_89_.aFloat4390
		+ aFloat4391 * class278_89_.aFloat4391
		+ aFloat4396 * class278_89_.aFloat4396);
    }
    
    final float method5447(Class278 class278_90_) {
	return (aFloat4393 * class278_90_.aFloat4393
		+ aFloat4390 * class278_90_.aFloat4390
		+ aFloat4391 * class278_90_.aFloat4391
		+ aFloat4396 * class278_90_.aFloat4396);
    }
    
    public String method5448() {
	return new StringBuilder().append(aFloat4393).append(",").append
		   (aFloat4390).append
		   (",").append
		   (aFloat4391).append
		   (",").append
		   (aFloat4396).toString();
    }
    
    static final float method5449(Class278 class278) {
	return (float) Math.sqrt((double) method5377(class278, class278));
    }
    
    public final void method5450(Class278 class278_91_) {
	method5383((class278_91_.aFloat4396 * aFloat4393
		    + class278_91_.aFloat4393 * aFloat4396
		    + class278_91_.aFloat4390 * aFloat4391
		    - class278_91_.aFloat4391 * aFloat4390),
		   (class278_91_.aFloat4396 * aFloat4390
		    - class278_91_.aFloat4393 * aFloat4391
		    + class278_91_.aFloat4390 * aFloat4396
		    + class278_91_.aFloat4391 * aFloat4393),
		   (class278_91_.aFloat4396 * aFloat4391
		    + class278_91_.aFloat4393 * aFloat4390
		    - class278_91_.aFloat4390 * aFloat4393
		    + class278_91_.aFloat4391 * aFloat4396),
		   (class278_91_.aFloat4396 * aFloat4396
		    - class278_91_.aFloat4393 * aFloat4393
		    - class278_91_.aFloat4390 * aFloat4390
		    - class278_91_.aFloat4391 * aFloat4391));
    }
    
    public String method5451() {
	return new StringBuilder().append(aFloat4393).append(",").append
		   (aFloat4390).append
		   (",").append
		   (aFloat4391).append
		   (",").append
		   (aFloat4396).toString();
    }
    
    static final Class278 method5452(Class278 class278, float f) {
	Class278 class278_92_ = method5444(class278);
	class278_92_.method5398(f);
	return class278_92_;
    }
    
    public final void method5453(Class278 class278_93_, float f) {
	if (method5400(class278_93_) < 0.0F)
	    method5401();
	method5398(1.0F - f);
	Class278 class278_94_ = method5399(class278_93_, f);
	method5393(class278_94_);
	class278_94_.method5375();
	method5392();
    }
    
    public final void method5454(Class278 class278_95_, float f) {
	if (method5400(class278_95_) < 0.0F)
	    method5401();
	method5398(1.0F - f);
	Class278 class278_96_ = method5399(class278_95_, f);
	method5393(class278_96_);
	class278_96_.method5375();
	method5392();
    }
    
    public final void method5455(Class278 class278_97_, float f) {
	if (method5400(class278_97_) < 0.0F)
	    method5401();
	method5398(1.0F - f);
	Class278 class278_98_ = method5399(class278_97_, f);
	method5393(class278_98_);
	class278_98_.method5375();
	method5392();
    }
}
