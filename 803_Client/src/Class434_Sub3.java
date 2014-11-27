/* Class434_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class434_Sub3 extends Class434
{
    int anInt8612 = 0;
    float[] aFloatArray8613;
    Class283[] aClass283Array8614;
    float aFloat8615 = 0.0F;
    int[] anIntArray8616;
    float aFloat8617 = 0.0F;
    
    public Class287 method7753(short i) {
	Class287 class287 = Class287.method5560();
	double[] ds = ((Class434_Sub3) this).aClass283Array8614
			  [((Class434_Sub3) this).anInt8612 * -1813628205]
			  .method5497(((Class434_Sub3) this).aFloat8615);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public void method7750(Class79 class79, Class266 class266, int i, int i_0_,
			   float f) {
	double[] ds
	    = ((Class434_Sub3) this).aClass351_6119.method6289(-1856971545);
	ds[0] -= (double) i;
	ds[2] -= (double) i_0_;
	double[] ds_1_ = method14080(-1358163988);
	ds_1_[0] -= (double) i;
	ds_1_[2] -= (double) i_0_;
	ds[1] *= -1.0;
	ds_1_[1] *= -1.0;
	Class287 class287 = Class287.method5560();
	class287.aFloat4477 = (float) (ds_1_[0] - ds[0]);
	class287.aFloat4474 = (float) (ds_1_[1] - ds[1]);
	class287.aFloat4479 = (float) (ds_1_[2] - ds[2]);
	class287.method5573();
	Class278 class278 = new Class278();
	class278.method5385(class287, f);
	Class287 class287_2_ = Class287.method5561(0.0F, 1.0F, 0.0F);
	Class287 class287_3_ = Class287.method5582(class287, class287_2_);
	class287_2_ = Class287.method5582(class287_3_, class287);
	class287_2_.method5592(class278);
	class266.method5117(ds[0], ds[1], ds[2], ds_1_[0], ds_1_[1], ds_1_[2],
			    class287_2_.aFloat4477, class287_2_.aFloat4474,
			    class287_2_.aFloat4479);
	class287_2_.method5564();
    }
    
    public void method7751(float f, byte i) {
	Class283 class283 = (((Class434_Sub3) this).aClass283Array8614
			     [((Class434_Sub3) this).anInt8612 * -1813628205]);
	if ((((Class434_Sub3) this).aFloatArray8613
	     [((Class434_Sub3) this).anInt8612 * -1813628205])
	    > 0.0F) {
	    if ((((Class434_Sub3) this).aFloatArray8613
		 [((Class434_Sub3) this).anInt8612 * -1813628205])
		>= f) {
		((Class434_Sub3) this).aFloatArray8613
		    [-1813628205 * ((Class434_Sub3) this).anInt8612]
		    -= f;
		return;
	    }
	    f -= (((Class434_Sub3) this).aFloatArray8613
		  [((Class434_Sub3) this).anInt8612 * -1813628205]);
	    ((Class434_Sub3) this).aFloatArray8613
		[-1813628205 * ((Class434_Sub3) this).anInt8612]
		= 0.0F;
	}
	float f_4_ = 1.0F / (float) Class70.method1725(-1494246893);
	while (f > 0.0F) {
	    float f_5_ = class283.method5495();
	    if (((Class434_Sub3) this).aFloat8615 >= f_5_) {
		if (((Class434_Sub3) this).aClass283Array8614.length
		    == 1 + ((Class434_Sub3) this).anInt8612 * -1813628205)
		    break;
		if ((((Class434_Sub3) this).aFloatArray8613
		     [1 + -1813628205 * ((Class434_Sub3) this).anInt8612])
		    >= f) {
		    ((Class434_Sub3) this).aFloatArray8613
			[1 + ((Class434_Sub3) this).anInt8612 * -1813628205]
			-= f;
		    break;
		}
		((Class434_Sub3) this).anInt8612 += -257544869;
		f -= (((Class434_Sub3) this).aFloatArray8613
		      [-1813628205 * ((Class434_Sub3) this).anInt8612]);
		((Class434_Sub3) this).aFloatArray8613
		    [((Class434_Sub3) this).anInt8612 * -1813628205]
		    = 0.0F;
		method14076(-713565774);
		((Class434_Sub3) this).aFloat8615 = 0.0F;
		((Class434_Sub3) this).aFloat8617 = 0.0F;
		class283 = (((Class434_Sub3) this).aClass283Array8614
			    [-1813628205 * ((Class434_Sub3) this).anInt8612]);
		f_5_ = class283.method5495();
	    }
	    while (f > 0.0F && ((Class434_Sub3) this).aFloat8615 < f_5_) {
		((Class434_Sub3) this).aFloat8617
		    = method14088(f_5_, ((Class434_Sub3) this).aFloat8617,
				  Math.min(f, f_4_), (byte) -65);
		f -= f_4_;
		method14087(((Class434_Sub3) this).aFloat8617, f_5_,
			    854526327);
	    }
	}
    }
    
    abstract float method14074(float f, float f_6_, float f_7_);
    
    abstract float method14075(float f, float f_8_, float f_9_);
    
    abstract void method14076(int i);
    
    public Class287 method7765() {
	Class287 class287 = Class287.method5560();
	double[] ds = ((Class434_Sub3) this).aClass283Array8614
			  [((Class434_Sub3) this).anInt8612 * -1813628205]
			  .method5497(((Class434_Sub3) this).aFloat8615);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    abstract float method14077(float f, float f_10_, float f_11_);
    
    public Class287 method7766() {
	Class287 class287 = Class287.method5560();
	double[] ds = ((Class434_Sub3) this).aClass283Array8614
			  [((Class434_Sub3) this).anInt8612 * -1813628205]
			  .method5497(((Class434_Sub3) this).aFloat8615);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public Class287 method7767(byte i) {
	return method7753((short) 128);
    }
    
    public void method7754(Class79 class79, Class266 class266, int i,
			   int i_12_, float f, int i_13_) {
	double[] ds
	    = ((Class434_Sub3) this).aClass351_6119.method6289(-2009207074);
	ds[0] -= (double) i;
	ds[2] -= (double) i_12_;
	double[] ds_14_ = method14080(-1358163988);
	ds_14_[0] -= (double) i;
	ds_14_[2] -= (double) i_12_;
	ds[1] *= -1.0;
	ds_14_[1] *= -1.0;
	Class287 class287 = Class287.method5560();
	class287.aFloat4477 = (float) (ds_14_[0] - ds[0]);
	class287.aFloat4474 = (float) (ds_14_[1] - ds[1]);
	class287.aFloat4479 = (float) (ds_14_[2] - ds[2]);
	class287.method5573();
	Class278 class278 = new Class278();
	class278.method5385(class287, f);
	Class287 class287_15_ = Class287.method5561(0.0F, 1.0F, 0.0F);
	Class287 class287_16_ = Class287.method5582(class287, class287_15_);
	class287_15_ = Class287.method5582(class287_16_, class287);
	class287_15_.method5592(class278);
	class266.method5117(ds[0], ds[1], ds[2], ds_14_[0], ds_14_[1],
			    ds_14_[2], class287_15_.aFloat4477,
			    class287_15_.aFloat4474, class287_15_.aFloat4479);
	class287_15_.method5564();
    }
    
    public void method7755(RSByteBuffer class241_sub3, int i) {
	((Class434_Sub3) this).aFloat8615 = 0.0F;
	((Class434_Sub3) this).aFloat8617 = 0.0F;
	((Class434_Sub3) this).anInt8612 = 0;
	int i_17_ = class241_sub3.readUnsignedByte((byte) -44);
	((Class434_Sub3) this).aClass283Array8614 = new Class283[i_17_];
	((Class434_Sub3) this).aFloatArray8613 = new float[i_17_];
	for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
	    ((Class434_Sub3) this).aClass283Array8614[i_18_]
		= new Class283(class241_sub3);
	    ((Class434_Sub3) this).aFloatArray8613[i_18_]
		= class241_sub3.method14650(-1958238391);
	}
	method14078(class241_sub3, i_17_, (byte) -108);
    }
    
    abstract void method14078(RSByteBuffer class241_sub3, int i, byte i_19_);
    
    double[] method14079() {
	return ((Class434_Sub3) this).aClass283Array8614
		   [-1813628205 * ((Class434_Sub3) this).anInt8612]
		   .method5497(((Class434_Sub3) this).aFloat8615);
    }
    
    public Class287 method7769() {
	Class287 class287 = Class287.method5560();
	double[] ds = ((Class434_Sub3) this).aClass283Array8614
			  [((Class434_Sub3) this).anInt8612 * -1813628205]
			  .method5497(((Class434_Sub3) this).aFloat8615);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    double[] method14080(int i) {
	return ((Class434_Sub3) this).aClass283Array8614
		   [-1813628205 * ((Class434_Sub3) this).anInt8612]
		   .method5497(((Class434_Sub3) this).aFloat8615);
    }
    
    public void method14081(Class283 class283, int i, float f, short i_20_) {
	if (null == ((Class434_Sub3) this).aClass283Array8614) {
	    ((Class434_Sub3) this).aClass283Array8614
		= new Class283[] { class283 };
	    ((Class434_Sub3) this).aFloatArray8613 = new float[] { f };
	    ((Class434_Sub3) this).anIntArray8616 = new int[] { i };
	} else {
	    Class283[] class283s
		= (new Class283
		   [((Class434_Sub3) this).aClass283Array8614.length + 1]);
	    float[] fs
		= (new float
		   [1 + ((Class434_Sub3) this).aClass283Array8614.length]);
	    int[] is
		= (new int
		   [1 + ((Class434_Sub3) this).aClass283Array8614.length]);
	    System.arraycopy(((Class434_Sub3) this).aClass283Array8614, 0,
			     class283s, 0,
			     ((Class434_Sub3) this).aClass283Array8614.length);
	    System.arraycopy(((Class434_Sub3) this).aFloatArray8613, 0, fs, 0,
			     ((Class434_Sub3) this).aClass283Array8614.length);
	    System.arraycopy(((Class434_Sub3) this).anIntArray8616, 0, is, 0,
			     ((Class434_Sub3) this).aClass283Array8614.length);
	    ((Class434_Sub3) this).aClass283Array8614 = class283s;
	    ((Class434_Sub3) this).aFloatArray8613 = fs;
	    ((Class434_Sub3) this).anIntArray8616 = is;
	    ((Class434_Sub3) this).aClass283Array8614
		[((Class434_Sub3) this).aClass283Array8614.length - 1]
		= class283;
	    ((Class434_Sub3) this).aFloatArray8613
		[((Class434_Sub3) this).aFloatArray8613.length - 1]
		= f;
	    ((Class434_Sub3) this).anIntArray8616
		[((Class434_Sub3) this).anIntArray8616.length - 1]
		= i;
	}
    }
    
    abstract void method14082();
    
    abstract void method14083();
    
    abstract void method14084(RSByteBuffer class241_sub3, int i);
    
    abstract void method14085(RSByteBuffer class241_sub3, int i);
    
    public void method7761(float f) {
	Class283 class283 = (((Class434_Sub3) this).aClass283Array8614
			     [((Class434_Sub3) this).anInt8612 * -1813628205]);
	if ((((Class434_Sub3) this).aFloatArray8613
	     [((Class434_Sub3) this).anInt8612 * -1813628205])
	    > 0.0F) {
	    if ((((Class434_Sub3) this).aFloatArray8613
		 [((Class434_Sub3) this).anInt8612 * -1813628205])
		>= f) {
		((Class434_Sub3) this).aFloatArray8613
		    [-1813628205 * ((Class434_Sub3) this).anInt8612]
		    -= f;
		return;
	    }
	    f -= (((Class434_Sub3) this).aFloatArray8613
		  [((Class434_Sub3) this).anInt8612 * -1813628205]);
	    ((Class434_Sub3) this).aFloatArray8613
		[-1813628205 * ((Class434_Sub3) this).anInt8612]
		= 0.0F;
	}
	float f_21_ = 1.0F / (float) Class70.method1725(-755836716);
	while (f > 0.0F) {
	    float f_22_ = class283.method5495();
	    if (((Class434_Sub3) this).aFloat8615 >= f_22_) {
		if (((Class434_Sub3) this).aClass283Array8614.length
		    == 1 + ((Class434_Sub3) this).anInt8612 * -1813628205)
		    break;
		if ((((Class434_Sub3) this).aFloatArray8613
		     [1 + -1813628205 * ((Class434_Sub3) this).anInt8612])
		    >= f) {
		    ((Class434_Sub3) this).aFloatArray8613
			[1 + ((Class434_Sub3) this).anInt8612 * -1813628205]
			-= f;
		    break;
		}
		((Class434_Sub3) this).anInt8612 += -257544869;
		f -= (((Class434_Sub3) this).aFloatArray8613
		      [-1813628205 * ((Class434_Sub3) this).anInt8612]);
		((Class434_Sub3) this).aFloatArray8613
		    [((Class434_Sub3) this).anInt8612 * -1813628205]
		    = 0.0F;
		method14076(-308695360);
		((Class434_Sub3) this).aFloat8615 = 0.0F;
		((Class434_Sub3) this).aFloat8617 = 0.0F;
		class283 = (((Class434_Sub3) this).aClass283Array8614
			    [-1813628205 * ((Class434_Sub3) this).anInt8612]);
		f_22_ = class283.method5495();
	    }
	    while (f > 0.0F && ((Class434_Sub3) this).aFloat8615 < f_22_) {
		((Class434_Sub3) this).aFloat8617
		    = method14088(f_22_, ((Class434_Sub3) this).aFloat8617,
				  Math.min(f, f_21_), (byte) -16);
		f -= f_21_;
		method14087(((Class434_Sub3) this).aFloat8617, f_22_,
			    -436584938);
	    }
	}
    }
    
    public void method7757(float f) {
	Class283 class283 = (((Class434_Sub3) this).aClass283Array8614
			     [((Class434_Sub3) this).anInt8612 * -1813628205]);
	if ((((Class434_Sub3) this).aFloatArray8613
	     [((Class434_Sub3) this).anInt8612 * -1813628205])
	    > 0.0F) {
	    if ((((Class434_Sub3) this).aFloatArray8613
		 [((Class434_Sub3) this).anInt8612 * -1813628205])
		>= f) {
		((Class434_Sub3) this).aFloatArray8613
		    [-1813628205 * ((Class434_Sub3) this).anInt8612]
		    -= f;
		return;
	    }
	    f -= (((Class434_Sub3) this).aFloatArray8613
		  [((Class434_Sub3) this).anInt8612 * -1813628205]);
	    ((Class434_Sub3) this).aFloatArray8613
		[-1813628205 * ((Class434_Sub3) this).anInt8612]
		= 0.0F;
	}
	float f_23_ = 1.0F / (float) Class70.method1725(-787102383);
	while (f > 0.0F) {
	    float f_24_ = class283.method5495();
	    if (((Class434_Sub3) this).aFloat8615 >= f_24_) {
		if (((Class434_Sub3) this).aClass283Array8614.length
		    == 1 + ((Class434_Sub3) this).anInt8612 * -1813628205)
		    break;
		if ((((Class434_Sub3) this).aFloatArray8613
		     [1 + -1813628205 * ((Class434_Sub3) this).anInt8612])
		    >= f) {
		    ((Class434_Sub3) this).aFloatArray8613
			[1 + ((Class434_Sub3) this).anInt8612 * -1813628205]
			-= f;
		    break;
		}
		((Class434_Sub3) this).anInt8612 += -257544869;
		f -= (((Class434_Sub3) this).aFloatArray8613
		      [-1813628205 * ((Class434_Sub3) this).anInt8612]);
		((Class434_Sub3) this).aFloatArray8613
		    [((Class434_Sub3) this).anInt8612 * -1813628205]
		    = 0.0F;
		method14076(-732801303);
		((Class434_Sub3) this).aFloat8615 = 0.0F;
		((Class434_Sub3) this).aFloat8617 = 0.0F;
		class283 = (((Class434_Sub3) this).aClass283Array8614
			    [-1813628205 * ((Class434_Sub3) this).anInt8612]);
		f_24_ = class283.method5495();
	    }
	    while (f > 0.0F && ((Class434_Sub3) this).aFloat8615 < f_24_) {
		((Class434_Sub3) this).aFloat8617
		    = method14088(f_24_, ((Class434_Sub3) this).aFloat8617,
				  Math.min(f, f_23_), (byte) -118);
		f -= f_23_;
		method14087(((Class434_Sub3) this).aFloat8617, f_24_,
			    859624835);
	    }
	}
    }
    
    public boolean method7758() {
	return null != ((Class434_Sub3) this).aClass283Array8614;
    }
    
    public boolean method7759() {
	return null != ((Class434_Sub3) this).aClass283Array8614;
    }
    
    public void method7760(Class79 class79, Class266 class266, int i,
			   int i_25_, float f) {
	double[] ds
	    = ((Class434_Sub3) this).aClass351_6119.method6289(-2097852353);
	ds[0] -= (double) i;
	ds[2] -= (double) i_25_;
	double[] ds_26_ = method14080(-1358163988);
	ds_26_[0] -= (double) i;
	ds_26_[2] -= (double) i_25_;
	ds[1] *= -1.0;
	ds_26_[1] *= -1.0;
	Class287 class287 = Class287.method5560();
	class287.aFloat4477 = (float) (ds_26_[0] - ds[0]);
	class287.aFloat4474 = (float) (ds_26_[1] - ds[1]);
	class287.aFloat4479 = (float) (ds_26_[2] - ds[2]);
	class287.method5573();
	Class278 class278 = new Class278();
	class278.method5385(class287, f);
	Class287 class287_27_ = Class287.method5561(0.0F, 1.0F, 0.0F);
	Class287 class287_28_ = Class287.method5582(class287, class287_27_);
	class287_27_ = Class287.method5582(class287_28_, class287);
	class287_27_.method5592(class278);
	class266.method5117(ds[0], ds[1], ds[2], ds_26_[0], ds_26_[1],
			    ds_26_[2], class287_27_.aFloat4477,
			    class287_27_.aFloat4474, class287_27_.aFloat4479);
	class287_27_.method5564();
    }
    
    abstract void method14086();
    
    public Class287 method7752() {
	return method7753((short) 128);
    }
    
    public boolean method7762(int i) {
	return null != ((Class434_Sub3) this).aClass283Array8614;
    }
    
    public void method7764(RSByteBuffer class241_sub3) {
	((Class434_Sub3) this).aFloat8615 = 0.0F;
	((Class434_Sub3) this).aFloat8617 = 0.0F;
	((Class434_Sub3) this).anInt8612 = 0;
	int i = class241_sub3.readUnsignedByte((byte) 8);
	((Class434_Sub3) this).aClass283Array8614 = new Class283[i];
	((Class434_Sub3) this).aFloatArray8613 = new float[i];
	for (int i_29_ = 0; i_29_ < i; i_29_++) {
	    ((Class434_Sub3) this).aClass283Array8614[i_29_]
		= new Class283(class241_sub3);
	    ((Class434_Sub3) this).aFloatArray8613[i_29_]
		= class241_sub3.method14650(-705643815);
	}
	method14078(class241_sub3, i, (byte) -114);
    }
    
    public void method7756(RSByteBuffer class241_sub3) {
	((Class434_Sub3) this).aFloat8615 = 0.0F;
	((Class434_Sub3) this).aFloat8617 = 0.0F;
	((Class434_Sub3) this).anInt8612 = 0;
	int i = class241_sub3.readUnsignedByte((byte) -27);
	((Class434_Sub3) this).aClass283Array8614 = new Class283[i];
	((Class434_Sub3) this).aFloatArray8613 = new float[i];
	for (int i_30_ = 0; i_30_ < i; i_30_++) {
	    ((Class434_Sub3) this).aClass283Array8614[i_30_]
		= new Class283(class241_sub3);
	    ((Class434_Sub3) this).aFloatArray8613[i_30_]
		= class241_sub3.method14650(-1120550454);
	}
	method14078(class241_sub3, i, (byte) -43);
    }
    
    void method14087(float f, float f_31_, int i) {
	((Class434_Sub3) this).aFloat8615 += f;
	if (((Class434_Sub3) this).aFloat8615 > f_31_)
	    ((Class434_Sub3) this).aFloat8615 = f_31_;
    }
    
    public Class287 method7763() {
	return method7753((short) 128);
    }
    
    public Class287 method7768() {
	Class287 class287 = Class287.method5560();
	double[] ds = ((Class434_Sub3) this).aClass283Array8614
			  [((Class434_Sub3) this).anInt8612 * -1813628205]
			  .method5497(((Class434_Sub3) this).aFloat8615);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    abstract float method14088(float f, float f_32_, float f_33_, byte i);
    
    public void method14089(Class283 class283, int i, float f) {
	if (null == ((Class434_Sub3) this).aClass283Array8614) {
	    ((Class434_Sub3) this).aClass283Array8614
		= new Class283[] { class283 };
	    ((Class434_Sub3) this).aFloatArray8613 = new float[] { f };
	    ((Class434_Sub3) this).anIntArray8616 = new int[] { i };
	} else {
	    Class283[] class283s
		= (new Class283
		   [((Class434_Sub3) this).aClass283Array8614.length + 1]);
	    float[] fs
		= (new float
		   [1 + ((Class434_Sub3) this).aClass283Array8614.length]);
	    int[] is
		= (new int
		   [1 + ((Class434_Sub3) this).aClass283Array8614.length]);
	    System.arraycopy(((Class434_Sub3) this).aClass283Array8614, 0,
			     class283s, 0,
			     ((Class434_Sub3) this).aClass283Array8614.length);
	    System.arraycopy(((Class434_Sub3) this).aFloatArray8613, 0, fs, 0,
			     ((Class434_Sub3) this).aClass283Array8614.length);
	    System.arraycopy(((Class434_Sub3) this).anIntArray8616, 0, is, 0,
			     ((Class434_Sub3) this).aClass283Array8614.length);
	    ((Class434_Sub3) this).aClass283Array8614 = class283s;
	    ((Class434_Sub3) this).aFloatArray8613 = fs;
	    ((Class434_Sub3) this).anIntArray8616 = is;
	    ((Class434_Sub3) this).aClass283Array8614
		[((Class434_Sub3) this).aClass283Array8614.length - 1]
		= class283;
	    ((Class434_Sub3) this).aFloatArray8613
		[((Class434_Sub3) this).aFloatArray8613.length - 1]
		= f;
	    ((Class434_Sub3) this).anIntArray8616
		[((Class434_Sub3) this).anIntArray8616.length - 1]
		= i;
	}
    }
    
    void method14090(float f, float f_34_) {
	((Class434_Sub3) this).aFloat8615 += f;
	if (((Class434_Sub3) this).aFloat8615 > f_34_)
	    ((Class434_Sub3) this).aFloat8615 = f_34_;
    }
    
    Class434_Sub3(Class351 class351) {
	super(class351);
    }
    
    static final void method14091(ClientScriptData class454, short i) {
	int i_35_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (i_35_ > 255 || i_35_ < 0)
	    i_35_ = 0;
	if (i_35_ != Class241_Sub5_Sub9.aClass241_Sub9_11043
			 .aClass445_Sub9_8883.method14178(2036576884)) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub9_8883,
		 i_35_, (byte) 2);
	    Class167.method3600((short) -1408);
	    client.aBool8297 = false;
	}
    }
}
