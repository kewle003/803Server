/* Class475 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475
{
    Class276 aClass276_6387;
    boolean aBool6388;
    Class276 aClass276_6389;
    boolean aBool6390;
    Class475 aClass475_6391;
    Class266 aClass266_6392;
    boolean aBool6393;
    protected boolean aBool6394;
    Class475 aClass475_6395;
    Class276 aClass276_6396 = new Class276();
    Class475 aClass475_6397;
    
    final void method10872() {
	((Class475) this).aBool6390 = true;
	((Class475) this).aBool6388 = true;
	((Class475) this).aBool6393 = true;
	aBool6394 = true;
    }
    
    public final Class276 method10873() {
	return ((Class475) this).aClass276_6396;
    }
    
    public final Class276 method10874() {
	if (((Class475) this).aBool6390) {
	    ((Class475) this).aBool6390 = false;
	    ((Class475) this).aClass276_6387
		.method5352(((Class475) this).aClass276_6396);
	    if (((Class475) this).aClass475_6395 != null)
		((Class475) this).aClass276_6387.method5354
		    (((Class475) this).aClass475_6395.method10874());
	}
	return ((Class475) this).aClass276_6387;
    }
    
    public final Class276 method10875() {
	return ((Class475) this).aClass276_6396;
    }
    
    final void method10876(Class276 class276) {
	if (((Class475) this).aClass475_6395 != null) {
	    Class276 class276_0_ = new Class276(class276);
	    class276_0_
		.method5354(((Class475) this).aClass475_6395.method10881());
	    method10877(class276_0_);
	} else
	    method10877(class276);
    }
    
    final void method10877(Class276 class276) {
	((Class475) this).aClass276_6396.method5352(class276);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    public final void method10878(Class278 class278) {
	((Class475) this).aClass276_6396.aClass278_4385.method5424(class278);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    final Class266 method10879() {
	if (((Class475) this).aBool6393) {
	    ((Class475) this).aBool6393 = false;
	    ((Class475) this).aClass266_6392.method5168(method10874());
	}
	return ((Class475) this).aClass266_6392;
    }
    
    public final void method10880(float f, float f_1_, float f_2_) {
	((Class475) this).aClass276_6396.aClass287_4386.method5568(f, f_1_,
								   f_2_);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    final Class276 method10881() {
	if (((Class475) this).aBool6388) {
	    ((Class475) this).aBool6388 = false;
	    ((Class475) this).aClass276_6389.method5352(method10874());
	    ((Class475) this).aClass276_6389.method5353();
	}
	return ((Class475) this).aClass276_6387;
    }
    
    final void method10882() {
	((Class475) this).aBool6390 = true;
	((Class475) this).aBool6388 = true;
	((Class475) this).aBool6393 = true;
	aBool6394 = true;
    }
    
    final void method10883(Class276 class276) {
	((Class475) this).aClass276_6396.method5352(class276);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    public final void method10884() {
	if (((Class475) this).aClass475_6395 != null) {
	    Class475 class475_3_
		= ((Class475) ((Class475) this).aClass475_6395).aClass475_6391;
	    if (class475_3_ == this)
		((Class475) ((Class475) this).aClass475_6395).aClass475_6391
		    = ((Class475) this).aClass475_6397;
	    else {
		for (/**/; ((Class475) class475_3_).aClass475_6397 != this;
		     class475_3_ = ((Class475) class475_3_).aClass475_6397) {
		    /* empty */
		}
		((Class475) class475_3_).aClass475_6397
		    = ((Class475) this).aClass475_6397;
	    }
	}
	method10882();
	if (((Class475) this).aClass475_6391 != null) {
	    ((Class475) this).aClass475_6391.method10890();
	    Class475 class475_4_ = ((Class475) this).aClass475_6391;
	    for (;;) {
		((Class475) class475_4_).aClass276_6396
		    .method5354(((Class475) this).aClass276_6396);
		((Class475) class475_4_).aClass475_6395
		    = ((Class475) this).aClass475_6395;
		if (((Class475) class475_4_).aClass475_6397 == null) {
		    ((Class475) class475_4_).aClass475_6397
			= (((Class475) ((Class475) this).aClass475_6395)
			   .aClass475_6391);
		    break;
		}
		class475_4_ = ((Class475) class475_4_).aClass475_6397;
	    }
	    ((Class475) ((Class475) this).aClass475_6395).aClass475_6391
		= ((Class475) this).aClass475_6391;
	}
	((Class475) this).aClass475_6395 = null;
	((Class475) this).aClass475_6397 = null;
	((Class475) this).aClass475_6391 = null;
    }
    
    Class475() {
	((Class475) this).aClass276_6387 = new Class276();
	((Class475) this).aBool6390 = true;
	((Class475) this).aClass276_6389 = new Class276();
	((Class475) this).aBool6388 = true;
	new Class268();
	new Class268();
	((Class475) this).aClass266_6392 = new Class266();
	((Class475) this).aBool6393 = true;
	aBool6394 = true;
	((Class475) this).aClass475_6395 = null;
	((Class475) this).aClass475_6391 = null;
	((Class475) this).aClass475_6397 = null;
    }
    
    public final Class276 method10885() {
	if (((Class475) this).aBool6390) {
	    ((Class475) this).aBool6390 = false;
	    ((Class475) this).aClass276_6387
		.method5352(((Class475) this).aClass276_6396);
	    if (((Class475) this).aClass475_6395 != null)
		((Class475) this).aClass276_6387.method5354
		    (((Class475) this).aClass475_6395.method10874());
	}
	return ((Class475) this).aClass276_6387;
    }
    
    public final Class276 method10886() {
	if (((Class475) this).aBool6390) {
	    ((Class475) this).aBool6390 = false;
	    ((Class475) this).aClass276_6387
		.method5352(((Class475) this).aClass276_6396);
	    if (((Class475) this).aClass475_6395 != null)
		((Class475) this).aClass276_6387.method5354
		    (((Class475) this).aClass475_6395.method10874());
	}
	return ((Class475) this).aClass276_6387;
    }
    
    public final void method10887(Class278 class278) {
	((Class475) this).aClass276_6396.aClass278_4385.method5424(class278);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    final void method10888(Class276 class276) {
	((Class475) this).aClass276_6396.method5352(class276);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    final void method10889(Class276 class276) {
	((Class475) this).aClass276_6396.method5352(class276);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    final void method10890() {
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
	if (((Class475) this).aClass475_6397 != null)
	    ((Class475) this).aClass475_6397.method10890();
    }
    
    public final void method10891(Class278 class278) {
	((Class475) this).aClass276_6396.aClass278_4385.method5424(class278);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    public final void method10892() {
	if (((Class475) this).aClass475_6395 != null) {
	    Class475 class475_5_
		= ((Class475) ((Class475) this).aClass475_6395).aClass475_6391;
	    if (class475_5_ == this)
		((Class475) ((Class475) this).aClass475_6395).aClass475_6391
		    = ((Class475) this).aClass475_6397;
	    else {
		for (/**/; ((Class475) class475_5_).aClass475_6397 != this;
		     class475_5_ = ((Class475) class475_5_).aClass475_6397) {
		    /* empty */
		}
		((Class475) class475_5_).aClass475_6397
		    = ((Class475) this).aClass475_6397;
	    }
	}
	method10882();
	if (((Class475) this).aClass475_6391 != null) {
	    ((Class475) this).aClass475_6391.method10890();
	    Class475 class475_6_ = ((Class475) this).aClass475_6391;
	    for (;;) {
		((Class475) class475_6_).aClass276_6396
		    .method5354(((Class475) this).aClass276_6396);
		((Class475) class475_6_).aClass475_6395
		    = ((Class475) this).aClass475_6395;
		if (((Class475) class475_6_).aClass475_6397 == null) {
		    ((Class475) class475_6_).aClass475_6397
			= (((Class475) ((Class475) this).aClass475_6395)
			   .aClass475_6391);
		    break;
		}
		class475_6_ = ((Class475) class475_6_).aClass475_6397;
	    }
	    ((Class475) ((Class475) this).aClass475_6395).aClass475_6391
		= ((Class475) this).aClass475_6391;
	}
	((Class475) this).aClass475_6395 = null;
	((Class475) this).aClass475_6397 = null;
	((Class475) this).aClass475_6391 = null;
    }
    
    final Class266 method10893() {
	if (((Class475) this).aBool6393) {
	    ((Class475) this).aBool6393 = false;
	    ((Class475) this).aClass266_6392.method5168(method10874());
	}
	return ((Class475) this).aClass266_6392;
    }
    
    public final void method10894(float f, float f_7_, float f_8_) {
	((Class475) this).aClass276_6396.aClass287_4386.method5568(f, f_7_,
								   f_8_);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    public final void method10895(float f, float f_9_, float f_10_) {
	((Class475) this).aClass276_6396.aClass287_4386.method5568(f, f_9_,
								   f_10_);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    public final void method10896(float f, float f_11_, float f_12_) {
	((Class475) this).aClass276_6396.aClass287_4386.method5568(f, f_11_,
								   f_12_);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    final void method10897(Class276 class276) {
	if (((Class475) this).aClass475_6395 != null) {
	    Class276 class276_13_ = new Class276(class276);
	    class276_13_
		.method5354(((Class475) this).aClass475_6395.method10881());
	    method10877(class276_13_);
	} else
	    method10877(class276);
    }
    
    public final void method10898(Class287 class287) {
	((Class475) this).aClass276_6396.aClass287_4386.method5655(class287);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
    
    final void method10899() {
	((Class475) this).aBool6390 = true;
	((Class475) this).aBool6388 = true;
	((Class475) this).aBool6393 = true;
	aBool6394 = true;
    }
    
    final void method10900() {
	((Class475) this).aBool6390 = true;
	((Class475) this).aBool6388 = true;
	((Class475) this).aBool6393 = true;
	aBool6394 = true;
    }
    
    final void method10901() {
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
	if (((Class475) this).aClass475_6397 != null)
	    ((Class475) this).aClass475_6397.method10890();
    }
    
    final void method10902() {
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
	if (((Class475) this).aClass475_6397 != null)
	    ((Class475) this).aClass475_6397.method10890();
    }
    
    public final void method10903() {
	if (((Class475) this).aClass475_6395 != null) {
	    Class475 class475_14_
		= ((Class475) ((Class475) this).aClass475_6395).aClass475_6391;
	    if (class475_14_ == this)
		((Class475) ((Class475) this).aClass475_6395).aClass475_6391
		    = ((Class475) this).aClass475_6397;
	    else {
		for (/**/; ((Class475) class475_14_).aClass475_6397 != this;
		     class475_14_ = ((Class475) class475_14_).aClass475_6397) {
		    /* empty */
		}
		((Class475) class475_14_).aClass475_6397
		    = ((Class475) this).aClass475_6397;
	    }
	}
	method10882();
	if (((Class475) this).aClass475_6391 != null) {
	    ((Class475) this).aClass475_6391.method10890();
	    Class475 class475_15_ = ((Class475) this).aClass475_6391;
	    for (;;) {
		((Class475) class475_15_).aClass276_6396
		    .method5354(((Class475) this).aClass276_6396);
		((Class475) class475_15_).aClass475_6395
		    = ((Class475) this).aClass475_6395;
		if (((Class475) class475_15_).aClass475_6397 == null) {
		    ((Class475) class475_15_).aClass475_6397
			= (((Class475) ((Class475) this).aClass475_6395)
			   .aClass475_6391);
		    break;
		}
		class475_15_ = ((Class475) class475_15_).aClass475_6397;
	    }
	    ((Class475) ((Class475) this).aClass475_6395).aClass475_6391
		= ((Class475) this).aClass475_6391;
	}
	((Class475) this).aClass475_6395 = null;
	((Class475) this).aClass475_6397 = null;
	((Class475) this).aClass475_6391 = null;
    }
    
    final void method10904(Class276 class276) {
	((Class475) this).aClass276_6396.method5352(class276);
	method10882();
	if (((Class475) this).aClass475_6391 != null)
	    ((Class475) this).aClass475_6391.method10890();
    }
}
