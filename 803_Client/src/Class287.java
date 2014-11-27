/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class287
{
    public float aFloat4474;
    static int anInt4475;
    static int anInt4476;
    public float aFloat4477;
    static Class287[] aClass287Array4478;
    public float aFloat4479;
    
    public final float method5559() {
	return (float) Math.sqrt((double) (aFloat4477 * aFloat4477
					   + aFloat4474 * aFloat4474
					   + aFloat4479 * aFloat4479));
    }
    
    public static Class287 method5560() {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287();
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5645();
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    public static Class287 method5561(float f, float f_0_, float f_1_) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287(f, f_0_, f_1_);
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5568(f, f_0_, f_1_);
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    public static Class287 method5562(Class287 class287) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287_2_ = new Class287(class287);
		return class287_2_;
	    }
	    aClass287Array4478[--anInt4475].method5655(class287);
	    Class287 class287_3_ = aClass287Array4478[anInt4475];
	    return class287_3_;
	}
    }
    
    public static Class287 method5563(RSByteBuffer class241_sub3) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287(class241_sub3);
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5602(class241_sub3);
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    public void method5564() {
	synchronized (aClass287Array4478) {
	    if (anInt4475 < anInt4476 - 1)
		aClass287Array4478[anInt4475++] = this;
	}
    }
    
    public Class287() {
	/* empty */
    }
    
    public final void method5565() {
	if (aFloat4477 < 0.0F)
	    aFloat4477 *= -1.0F;
	if (aFloat4474 < 0.0F)
	    aFloat4474 *= -1.0F;
	if (aFloat4479 < 0.0F)
	    aFloat4479 *= -1.0F;
    }
    
    public Class287(float f, float f_4_, float f_5_) {
	aFloat4477 = f;
	aFloat4474 = f_4_;
	aFloat4479 = f_5_;
    }
    
    public String method5566() {
	return new StringBuilder().append(aFloat4477).append(", ").append
		   (aFloat4474).append
		   (", ").append
		   (aFloat4479).toString();
    }
    
    public static final Class287 method5567(Class287 class287, float f) {
	Class287 class287_6_ = method5562(class287);
	class287_6_.method5587(f);
	return class287_6_;
    }
    
    public void method5568(float f, float f_7_, float f_8_) {
	aFloat4477 = f;
	aFloat4474 = f_7_;
	aFloat4479 = f_8_;
    }
    
    public static Class287 method5569(float f, float f_9_, float f_10_) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287(f, f_9_, f_10_);
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5568(f, f_9_, f_10_);
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    public final void method5570(Class287 class287_11_, float f) {
	method5587(1.0F - f);
	method5574(method5591(class287_11_, f));
    }
    
    final void method5571(Class287 class287_12_) {
	aFloat4477 /= class287_12_.aFloat4477;
	aFloat4474 /= class287_12_.aFloat4474;
	aFloat4479 /= class287_12_.aFloat4479;
    }
    
    final void method5572(Class287 class287_13_) {
	method5568((aFloat4474 * class287_13_.aFloat4479
		    - aFloat4479 * class287_13_.aFloat4474),
		   (aFloat4479 * class287_13_.aFloat4477
		    - aFloat4477 * class287_13_.aFloat4479),
		   (aFloat4477 * class287_13_.aFloat4474
		    - aFloat4474 * class287_13_.aFloat4477));
    }
    
    public final void method5573() {
	float f = 1.0F / method5559();
	aFloat4477 *= f;
	aFloat4474 *= f;
	aFloat4479 *= f;
    }
    
    public final void method5574(Class287 class287_14_) {
	aFloat4477 += class287_14_.aFloat4477;
	aFloat4474 += class287_14_.aFloat4474;
	aFloat4479 += class287_14_.aFloat4479;
    }
    
    public final void method5575(Class287 class287_15_, float f) {
	aFloat4477 += class287_15_.aFloat4477 * f;
	aFloat4474 += class287_15_.aFloat4474 * f;
	aFloat4479 += class287_15_.aFloat4479 * f;
    }
    
    public static final Class287 method5576(Class287 class287,
					    Class287 class287_16_) {
	Class287 class287_17_ = method5562(class287);
	class287_17_.method5574(class287_16_);
	return class287_17_;
    }
    
    public final void method5577(Class287 class287_18_) {
	aFloat4477 -= class287_18_.aFloat4477;
	aFloat4474 -= class287_18_.aFloat4474;
	aFloat4479 -= class287_18_.aFloat4479;
    }
    
    public static final Class287 method5578(Class287 class287,
					    Class287 class287_19_) {
	Class287 class287_20_ = method5562(class287);
	class287_20_.method5577(class287_19_);
	return class287_20_;
    }
    
    public final float method5579(Class287 class287_21_) {
	return (aFloat4477 * class287_21_.aFloat4477
		+ aFloat4474 * class287_21_.aFloat4474
		+ aFloat4479 * class287_21_.aFloat4479);
    }
    
    public static final float method5580(Class287 class287,
					 Class287 class287_22_) {
	return class287.method5579(class287_22_);
    }
    
    public static void method5581(int i) {
	anInt4476 = i;
	aClass287Array4478 = new Class287[i];
	anInt4475 = 0;
    }
    
    public static final Class287 method5582(Class287 class287,
					    Class287 class287_23_) {
	Class287 class287_24_ = method5562(class287);
	class287_24_.method5572(class287_23_);
	return class287_24_;
    }
    
    final void method5583(Class287 class287_25_) {
	aFloat4477 *= class287_25_.aFloat4477;
	aFloat4474 *= class287_25_.aFloat4474;
	aFloat4479 *= class287_25_.aFloat4479;
    }
    
    public final void method5584() {
	if (aFloat4477 < 0.0F)
	    aFloat4477 *= -1.0F;
	if (aFloat4474 < 0.0F)
	    aFloat4474 *= -1.0F;
	if (aFloat4479 < 0.0F)
	    aFloat4479 *= -1.0F;
    }
    
    final void method5585(Class287 class287_26_) {
	aFloat4477 /= class287_26_.aFloat4477;
	aFloat4474 /= class287_26_.aFloat4474;
	aFloat4479 /= class287_26_.aFloat4479;
    }
    
    public static final Class287 method5586(Class287 class287,
					    Class287 class287_27_) {
	Class287 class287_28_ = method5562(class287);
	class287_28_.method5583(class287_27_);
	return class287_28_;
    }
    
    public final void method5587(float f) {
	aFloat4477 *= f;
	aFloat4474 *= f;
	aFloat4479 *= f;
    }
    
    public final void method5588(float f) {
	aFloat4477 /= f;
	aFloat4474 /= f;
	aFloat4479 /= f;
    }
    
    public static final Class287 method5589(Class287 class287,
					    Class287 class287_29_) {
	Class287 class287_30_ = method5562(class287);
	class287_30_.method5623(class287_29_);
	return class287_30_;
    }
    
    public static final Class287 method5590(Class287 class287,
					    Class287 class287_31_) {
	Class287 class287_32_ = method5562(class287);
	class287_32_.method5583(class287_31_);
	return class287_32_;
    }
    
    public static final Class287 method5591(Class287 class287, float f) {
	Class287 class287_33_ = method5562(class287);
	class287_33_.method5587(f);
	return class287_33_;
    }
    
    public final void method5592(Class278 class278) {
	Class278 class278_34_
	    = Class278.method5445(aFloat4477, aFloat4474, aFloat4479, 0.0F);
	Class278 class278_35_ = Class278.method5391(class278);
	Class278 class278_36_
	    = Class278.method5397(class278_35_, class278_34_);
	class278_36_.method5396(class278);
	method5568(class278_36_.aFloat4393, class278_36_.aFloat4390,
		   class278_36_.aFloat4391);
	class278_34_.method5375();
	class278_35_.method5375();
	class278_36_.method5375();
    }
    
    public final void method5593(Class287 class287_37_) {
	aFloat4477 -= class287_37_.aFloat4477;
	aFloat4474 -= class287_37_.aFloat4474;
	aFloat4479 -= class287_37_.aFloat4479;
    }
    
    public final void method5594(Class266 class266) {
	float f = aFloat4477;
	float f_38_ = aFloat4474;
	aFloat4477 = (((Class266) class266).aFloat4335 * f
		      + ((Class266) class266).aFloat4343 * f_38_
		      + ((Class266) class266).aFloat4341 * aFloat4479);
	aFloat4474 = (((Class266) class266).aFloat4336 * f
		      + ((Class266) class266).aFloat4339 * f_38_
		      + ((Class266) class266).aFloat4338 * aFloat4479);
	aFloat4479 = (((Class266) class266).aFloat4344 * f
		      + ((Class266) class266).aFloat4340 * f_38_
		      + ((Class266) class266).aFloat4337 * aFloat4479);
    }
    
    public final void method5595(Class287 class287_39_, float f) {
	method5587(1.0F - f);
	method5574(method5591(class287_39_, f));
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4477).append(", ").append
		   (aFloat4474).append
		   (", ").append
		   (aFloat4479).toString();
    }
    
    public static final float method5596(Class287 class287,
					 Class287 class287_40_) {
	return class287.method5579(class287_40_);
    }
    
    public String method5597() {
	return new StringBuilder().append(aFloat4477).append(", ").append
		   (aFloat4474).append
		   (", ").append
		   (aFloat4479).toString();
    }
    
    public String method5598() {
	return new StringBuilder().append(aFloat4477).append(", ").append
		   (aFloat4474).append
		   (", ").append
		   (aFloat4479).toString();
    }
    
    public final void method5599(float f) {
	aFloat4477 *= f;
	aFloat4474 *= f;
	aFloat4479 *= f;
    }
    
    public final void method5600(Class266 class266) {
	float f = aFloat4477;
	float f_41_ = aFloat4474;
	aFloat4477 = (((Class266) class266).aFloat4335 * f
		      + ((Class266) class266).aFloat4343 * f_41_
		      + ((Class266) class266).aFloat4341 * aFloat4479
		      + ((Class266) class266).aFloat4334);
	aFloat4474 = (((Class266) class266).aFloat4336 * f
		      + ((Class266) class266).aFloat4339 * f_41_
		      + ((Class266) class266).aFloat4338 * aFloat4479
		      + ((Class266) class266).aFloat4345);
	aFloat4479 = (((Class266) class266).aFloat4344 * f
		      + ((Class266) class266).aFloat4340 * f_41_
		      + ((Class266) class266).aFloat4337 * aFloat4479
		      + ((Class266) class266).aFloat4346);
    }
    
    public boolean method5601(Class287 class287_42_) {
	if (aFloat4477 != class287_42_.aFloat4477
	    || aFloat4474 != class287_42_.aFloat4474
	    || aFloat4479 != class287_42_.aFloat4479)
	    return false;
	return true;
    }
    
    public void method5602(RSByteBuffer class241_sub3) {
	aFloat4477 = class241_sub3.method14650(-515658749);
	aFloat4474 = class241_sub3.method14650(-297158299);
	aFloat4479 = class241_sub3.method14650(-1856478361);
    }
    
    public final void method5603() {
	aFloat4477 = -aFloat4477;
	aFloat4474 = -aFloat4474;
	aFloat4479 = -aFloat4479;
    }
    
    final void method5604(Class287 class287_43_) {
	method5568((aFloat4474 * class287_43_.aFloat4479
		    - aFloat4479 * class287_43_.aFloat4474),
		   (aFloat4479 * class287_43_.aFloat4477
		    - aFloat4477 * class287_43_.aFloat4479),
		   (aFloat4477 * class287_43_.aFloat4474
		    - aFloat4474 * class287_43_.aFloat4477));
    }
    
    public static Class287 method5605(float f, float f_44_, float f_45_) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287(f, f_44_, f_45_);
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5568(f, f_44_, f_45_);
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    public static Class287 method5606(Class287 class287) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287_46_ = new Class287(class287);
		return class287_46_;
	    }
	    aClass287Array4478[--anInt4475].method5655(class287);
	    Class287 class287_47_ = aClass287Array4478[anInt4475];
	    return class287_47_;
	}
    }
    
    public final void method5607(Class278 class278) {
	Class278 class278_48_
	    = Class278.method5445(aFloat4477, aFloat4474, aFloat4479, 0.0F);
	Class278 class278_49_ = Class278.method5391(class278);
	Class278 class278_50_
	    = Class278.method5397(class278_49_, class278_48_);
	class278_50_.method5396(class278);
	method5568(class278_50_.aFloat4393, class278_50_.aFloat4390,
		   class278_50_.aFloat4391);
	class278_48_.method5375();
	class278_49_.method5375();
	class278_50_.method5375();
    }
    
    public static Class287 method5608(RSByteBuffer class241_sub3) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287(class241_sub3);
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5602(class241_sub3);
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    public final void method5609() {
	float f = 1.0F / method5559();
	aFloat4477 *= f;
	aFloat4474 *= f;
	aFloat4479 *= f;
    }
    
    public Class287(Class287 class287_51_) {
	aFloat4477 = class287_51_.aFloat4477;
	aFloat4474 = class287_51_.aFloat4474;
	aFloat4479 = class287_51_.aFloat4479;
    }
    
    public void method5610(RSByteBuffer class241_sub3) {
	aFloat4477 = class241_sub3.method14650(-628877321);
	aFloat4474 = class241_sub3.method14650(-2108793437);
	aFloat4479 = class241_sub3.method14650(-1844393672);
    }
    
    public void method5611(float f, float f_52_, float f_53_) {
	aFloat4477 = f;
	aFloat4474 = f_52_;
	aFloat4479 = f_53_;
    }
    
    public void method5612(float f, float f_54_, float f_55_) {
	aFloat4477 = f;
	aFloat4474 = f_54_;
	aFloat4479 = f_55_;
    }
    
    public void method5613(Class287 class287_56_) {
	method5568(class287_56_.aFloat4477, class287_56_.aFloat4474,
		   class287_56_.aFloat4479);
    }
    
    public final void method5614() {
	aFloat4479 = 0.0F;
	aFloat4474 = 0.0F;
	aFloat4477 = 0.0F;
    }
    
    public final void method5615() {
	aFloat4477 = -aFloat4477;
	aFloat4474 = -aFloat4474;
	aFloat4479 = -aFloat4479;
    }
    
    public final void method5616() {
	aFloat4477 = -aFloat4477;
	aFloat4474 = -aFloat4474;
	aFloat4479 = -aFloat4479;
    }
    
    public static Class287 method5617(RSByteBuffer class241_sub3) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287(class241_sub3);
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5602(class241_sub3);
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    public final void method5618() {
	float f = 1.0F / method5559();
	aFloat4477 *= f;
	aFloat4474 *= f;
	aFloat4479 *= f;
    }
    
    public final void method5619() {
	float f = 1.0F / method5559();
	aFloat4477 *= f;
	aFloat4474 *= f;
	aFloat4479 *= f;
    }
    
    public final void method5620(Class287 class287_57_, float f) {
	aFloat4477 += class287_57_.aFloat4477 * f;
	aFloat4474 += class287_57_.aFloat4474 * f;
	aFloat4479 += class287_57_.aFloat4479 * f;
    }
    
    public static Class287 method5621() {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287();
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5645();
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    public static final Class287 method5622(Class287 class287,
					    Class287 class287_58_) {
	Class287 class287_59_ = method5562(class287);
	class287_59_.method5574(class287_58_);
	return class287_59_;
    }
    
    final void method5623(Class287 class287_60_) {
	aFloat4477 /= class287_60_.aFloat4477;
	aFloat4474 /= class287_60_.aFloat4474;
	aFloat4479 /= class287_60_.aFloat4479;
    }
    
    public static void method5624(int i) {
	anInt4476 = i;
	aClass287Array4478 = new Class287[i];
	anInt4475 = 0;
    }
    
    public final void method5625(Class266 class266) {
	float f = aFloat4477;
	float f_61_ = aFloat4474;
	aFloat4477 = (((Class266) class266).aFloat4335 * f
		      + ((Class266) class266).aFloat4343 * f_61_
		      + ((Class266) class266).aFloat4341 * aFloat4479);
	aFloat4474 = (((Class266) class266).aFloat4336 * f
		      + ((Class266) class266).aFloat4339 * f_61_
		      + ((Class266) class266).aFloat4338 * aFloat4479);
	aFloat4479 = (((Class266) class266).aFloat4344 * f
		      + ((Class266) class266).aFloat4340 * f_61_
		      + ((Class266) class266).aFloat4337 * aFloat4479);
    }
    
    public static final float method5626(Class287 class287,
					 Class287 class287_62_) {
	return class287.method5579(class287_62_);
    }
    
    public static final float method5627(Class287 class287,
					 Class287 class287_63_) {
	return class287.method5579(class287_63_);
    }
    
    final void method5628(Class287 class287_64_) {
	method5568((aFloat4474 * class287_64_.aFloat4479
		    - aFloat4479 * class287_64_.aFloat4474),
		   (aFloat4479 * class287_64_.aFloat4477
		    - aFloat4477 * class287_64_.aFloat4479),
		   (aFloat4477 * class287_64_.aFloat4474
		    - aFloat4474 * class287_64_.aFloat4477));
    }
    
    public static final Class287 method5629(Class287 class287,
					    Class287 class287_65_) {
	Class287 class287_66_ = method5562(class287);
	class287_66_.method5572(class287_65_);
	return class287_66_;
    }
    
    final void method5630(Class287 class287_67_) {
	method5568((aFloat4474 * class287_67_.aFloat4479
		    - aFloat4479 * class287_67_.aFloat4474),
		   (aFloat4479 * class287_67_.aFloat4477
		    - aFloat4477 * class287_67_.aFloat4479),
		   (aFloat4477 * class287_67_.aFloat4474
		    - aFloat4474 * class287_67_.aFloat4477));
    }
    
    static {
	new Class287(0.0F, 0.0F, 0.0F);
	aClass287Array4478 = new Class287[0];
    }
    
    public final void method5631() {
	if (aFloat4477 < 0.0F)
	    aFloat4477 *= -1.0F;
	if (aFloat4474 < 0.0F)
	    aFloat4474 *= -1.0F;
	if (aFloat4479 < 0.0F)
	    aFloat4479 *= -1.0F;
    }
    
    public final void method5632() {
	if (aFloat4477 < 0.0F)
	    aFloat4477 *= -1.0F;
	if (aFloat4474 < 0.0F)
	    aFloat4474 *= -1.0F;
	if (aFloat4479 < 0.0F)
	    aFloat4479 *= -1.0F;
    }
    
    public static Class287 method5633(RSByteBuffer class241_sub3) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287(class241_sub3);
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5602(class241_sub3);
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    final void method5634(Class287 class287_68_) {
	aFloat4477 *= class287_68_.aFloat4477;
	aFloat4474 *= class287_68_.aFloat4474;
	aFloat4479 *= class287_68_.aFloat4479;
    }
    
    public static final Class287 method5635(Class287 class287,
					    Class287 class287_69_) {
	Class287 class287_70_ = method5562(class287);
	class287_70_.method5577(class287_69_);
	return class287_70_;
    }
    
    public static final Class287 method5636(Class287 class287,
					    Class287 class287_71_) {
	Class287 class287_72_ = method5562(class287);
	class287_72_.method5583(class287_71_);
	return class287_72_;
    }
    
    public static final Class287 method5637(Class287 class287,
					    Class287 class287_73_) {
	Class287 class287_74_ = method5562(class287);
	class287_74_.method5583(class287_73_);
	return class287_74_;
    }
    
    public static final Class287 method5638(Class287 class287,
					    Class287 class287_75_) {
	Class287 class287_76_ = method5562(class287);
	class287_76_.method5583(class287_75_);
	return class287_76_;
    }
    
    public static final Class287 method5639(Class287 class287,
					    Class287 class287_77_) {
	Class287 class287_78_ = method5562(class287);
	class287_78_.method5583(class287_77_);
	return class287_78_;
    }
    
    public final void method5640(float f) {
	aFloat4477 *= f;
	aFloat4474 *= f;
	aFloat4479 *= f;
    }
    
    public static void method5641(int i) {
	anInt4476 = i;
	aClass287Array4478 = new Class287[i];
	anInt4475 = 0;
    }
    
    public final void method5642(float f) {
	aFloat4477 *= f;
	aFloat4474 *= f;
	aFloat4479 *= f;
    }
    
    public final void method5643(float f) {
	aFloat4477 *= f;
	aFloat4474 *= f;
	aFloat4479 *= f;
    }
    
    public static Class287 method5644(RSByteBuffer class241_sub3) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287(class241_sub3);
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5602(class241_sub3);
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    public final void method5645() {
	aFloat4479 = 0.0F;
	aFloat4474 = 0.0F;
	aFloat4477 = 0.0F;
    }
    
    public static final Class287 method5646(Class287 class287,
					    Class287 class287_79_) {
	Class287 class287_80_ = method5562(class287);
	class287_80_.method5623(class287_79_);
	return class287_80_;
    }
    
    public static final Class287 method5647(Class287 class287,
					    Class287 class287_81_) {
	Class287 class287_82_ = method5562(class287);
	class287_82_.method5623(class287_81_);
	return class287_82_;
    }
    
    public static final Class287 method5648(Class287 class287,
					    Class287 class287_83_) {
	Class287 class287_84_ = method5562(class287);
	class287_84_.method5623(class287_83_);
	return class287_84_;
    }
    
    public final void method5649(float f) {
	aFloat4477 /= f;
	aFloat4474 /= f;
	aFloat4479 /= f;
    }
    
    public final void method5650(float f) {
	aFloat4477 /= f;
	aFloat4474 /= f;
	aFloat4479 /= f;
    }
    
    public final void method5651(Class287 class287_85_, float f) {
	aFloat4477 += class287_85_.aFloat4477 * f;
	aFloat4474 += class287_85_.aFloat4474 * f;
	aFloat4479 += class287_85_.aFloat4479 * f;
    }
    
    public static final Class287 method5652(Class287 class287, float f) {
	Class287 class287_86_ = method5562(class287);
	class287_86_.method5587(f);
	return class287_86_;
    }
    
    public static Class287 method5653(float f, float f_87_, float f_88_) {
	synchronized (aClass287Array4478) {
	    if (anInt4475 == 0) {
		Class287 class287 = new Class287(f, f_87_, f_88_);
		return class287;
	    }
	    aClass287Array4478[--anInt4475].method5568(f, f_87_, f_88_);
	    Class287 class287 = aClass287Array4478[anInt4475];
	    return class287;
	}
    }
    
    public final void method5654(Class266 class266) {
	float f = aFloat4477;
	float f_89_ = aFloat4474;
	aFloat4477 = (((Class266) class266).aFloat4335 * f
		      + ((Class266) class266).aFloat4343 * f_89_
		      + ((Class266) class266).aFloat4341 * aFloat4479
		      + ((Class266) class266).aFloat4334);
	aFloat4474 = (((Class266) class266).aFloat4336 * f
		      + ((Class266) class266).aFloat4339 * f_89_
		      + ((Class266) class266).aFloat4338 * aFloat4479
		      + ((Class266) class266).aFloat4345);
	aFloat4479 = (((Class266) class266).aFloat4344 * f
		      + ((Class266) class266).aFloat4340 * f_89_
		      + ((Class266) class266).aFloat4337 * aFloat4479
		      + ((Class266) class266).aFloat4346);
    }
    
    public void method5655(Class287 class287_90_) {
	method5568(class287_90_.aFloat4477, class287_90_.aFloat4474,
		   class287_90_.aFloat4479);
    }
    
    public final void method5656(Class287 class287_91_, float f) {
	method5587(1.0F - f);
	method5574(method5591(class287_91_, f));
    }
    
    Class287(RSByteBuffer class241_sub3) {
	aFloat4477 = class241_sub3.method14650(-2068203254);
	aFloat4474 = class241_sub3.method14650(-1016966773);
	aFloat4479 = class241_sub3.method14650(-264034329);
    }
}
