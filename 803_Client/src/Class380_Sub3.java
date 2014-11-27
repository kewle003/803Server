/* Class380_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class380_Sub3 extends Class380
{
    int[] anIntArray10415;
    float aFloat10416;
    int anInt10417 = 0;
    float aFloat10418 = 0.0F;
    float[] aFloatArray10419;
    Class283[] aClass283Array10420;
    
    void method16724(float f, float f_0_) {
	((Class380_Sub3) this).aFloat10418 += f;
	if (((Class380_Sub3) this).aFloat10418 > f_0_)
	    ((Class380_Sub3) this).aFloat10418 = f_0_;
    }
    
    public void method16725(Class283 class283, int i, float f, int i_1_) {
	if (((Class380_Sub3) this).aClass283Array10420 == null) {
	    ((Class380_Sub3) this).aClass283Array10420
		= new Class283[] { class283 };
	    ((Class380_Sub3) this).aFloatArray10419 = new float[] { f };
	    ((Class380_Sub3) this).anIntArray10415 = new int[] { i };
	} else {
	    Class283[] class283s
		= (new Class283
		   [((Class380_Sub3) this).aClass283Array10420.length + 1]);
	    float[] fs
		= (new float
		   [1 + ((Class380_Sub3) this).aClass283Array10420.length]);
	    int[] is
		= (new int
		   [((Class380_Sub3) this).aClass283Array10420.length + 1]);
	    System.arraycopy(((Class380_Sub3) this).aClass283Array10420, 0,
			     class283s, 0,
			     (((Class380_Sub3) this)
			      .aClass283Array10420).length);
	    System.arraycopy(((Class380_Sub3) this).aFloatArray10419, 0, fs, 0,
			     (((Class380_Sub3) this)
			      .aClass283Array10420).length);
	    System.arraycopy(((Class380_Sub3) this).anIntArray10415, 0, is, 0,
			     (((Class380_Sub3) this)
			      .aClass283Array10420).length);
	    ((Class380_Sub3) this).aClass283Array10420 = class283s;
	    ((Class380_Sub3) this).aFloatArray10419 = fs;
	    ((Class380_Sub3) this).anIntArray10415 = is;
	    ((Class380_Sub3) this).aClass283Array10420
		[((Class380_Sub3) this).aClass283Array10420.length - 1]
		= class283;
	    ((Class380_Sub3) this).aFloatArray10419
		[((Class380_Sub3) this).aFloatArray10419.length - 1]
		= f;
	    ((Class380_Sub3) this).anIntArray10415
		[((Class380_Sub3) this).anIntArray10415.length - 1]
		= i;
	}
    }
    
    public float method16726() {
	return ((Class380_Sub3) this).aClass283Array10420
		   [-1018317461 * ((Class380_Sub3) this).anInt10417]
		   .method5515(((Class380_Sub3) this).aFloat10418);
    }
    
    void method16727(float f, float f_2_, byte i) {
	((Class380_Sub3) this).aFloat10418 += f;
	if (((Class380_Sub3) this).aFloat10418 > f_2_)
	    ((Class380_Sub3) this).aFloat10418 = f_2_;
    }
    
    abstract float method16728(float f, float f_3_, float f_4_, int i);
    
    public void method6865(float f, int[][][] is, Class215 class215, int i,
			   int i_5_) {
	Class283 class283
	    = (((Class380_Sub3) this).aClass283Array10420
	       [-1018317461 * ((Class380_Sub3) this).anInt10417]);
	if ((((Class380_Sub3) this).aFloatArray10419
	     [-1018317461 * ((Class380_Sub3) this).anInt10417])
	    > 0.0F) {
	    if ((((Class380_Sub3) this).aFloatArray10419
		 [((Class380_Sub3) this).anInt10417 * -1018317461])
		>= f) {
		((Class380_Sub3) this).aFloatArray10419
		    [((Class380_Sub3) this).anInt10417 * -1018317461]
		    -= f;
		return;
	    }
	    f -= (((Class380_Sub3) this).aFloatArray10419
		  [((Class380_Sub3) this).anInt10417 * -1018317461]);
	    ((Class380_Sub3) this).aFloatArray10419
		[-1018317461 * ((Class380_Sub3) this).anInt10417]
		= 0.0F;
	}
	float f_6_ = 1.0F / (float) Class70.method1725(268270663);
	while (f > 0.0F) {
	    float f_7_ = class283.method5495();
	    if (((Class380_Sub3) this).aFloat10418 >= f_7_) {
		if (((Class380_Sub3) this).anInt10417 * -1018317461 + 1
		    == ((Class380_Sub3) this).aClass283Array10420.length)
		    break;
		if ((((Class380_Sub3) this).aFloatArray10419
		     [-1018317461 * ((Class380_Sub3) this).anInt10417 + 1])
		    >= f) {
		    ((Class380_Sub3) this).aFloatArray10419
			[1 + ((Class380_Sub3) this).anInt10417 * -1018317461]
			-= f;
		    break;
		}
		((Class380_Sub3) this).anInt10417 += -320286909;
		f -= (((Class380_Sub3) this).aFloatArray10419
		      [((Class380_Sub3) this).anInt10417 * -1018317461]);
		((Class380_Sub3) this).aFloatArray10419
		    [((Class380_Sub3) this).anInt10417 * -1018317461]
		    = 0.0F;
		method16730(1541785582);
		((Class380_Sub3) this).aFloat10418 = 0.0F;
		((Class380_Sub3) this).aFloat10416 = 0.0F;
		class283 = (((Class380_Sub3) this).aClass283Array10420
			    [-1018317461 * ((Class380_Sub3) this).anInt10417]);
		f_7_ = class283.method5495();
	    }
	    while (f > 0.0F && ((Class380_Sub3) this).aFloat10418 < f_7_) {
		((Class380_Sub3) this).aFloat10416
		    = method16728(f_7_, ((Class380_Sub3) this).aFloat10416,
				  Math.min(f, f_6_), -1444017447);
		f -= f_6_;
		method16727(((Class380_Sub3) this).aFloat10416, f_7_,
			    (byte) 35);
	    }
	}
    }
    
    abstract void method16729(RSByteBuffer class241_sub3, int i);
    
    abstract void method16730(int i);
    
    public Class287 method6878() {
	Class287 class287 = Class287.method5560();
	double[] ds = ((Class380_Sub3) this).aClass283Array10420
			  [-1018317461 * ((Class380_Sub3) this).anInt10417]
			  .method5497(((Class380_Sub3) this).aFloat10418);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public Class241_Sub16 method6857(int i) {
	Class287 class287 = method6867(255754568);
	return new Class241_Sub16(0, (int) class287.aFloat4477,
				  (int) class287.aFloat4474,
				  (int) class287.aFloat4479);
    }
    
    Class380_Sub3(Class351 class351) {
	super(class351);
	((Class380_Sub3) this).aFloat10416 = 0.0F;
    }
    
    public float method6862(short i) {
	return ((Class380_Sub3) this).aClass283Array10420
		   [-1018317461 * ((Class380_Sub3) this).anInt10417]
		   .method5500(((Class380_Sub3) this).aFloat10418);
    }
    
    public Class287 method6868() {
	Class287 class287 = Class287.method5560();
	double[] ds = ((Class380_Sub3) this).aClass283Array10420
			  [-1018317461 * ((Class380_Sub3) this).anInt10417]
			  .method5497(((Class380_Sub3) this).aFloat10418);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public double[] method6860(short i) {
	return ((Class380_Sub3) this).aClass283Array10420
		   [((Class380_Sub3) this).anInt10417 * -1018317461]
		   .method5497(((Class380_Sub3) this).aFloat10418);
    }
    
    public boolean method6872() {
	return ((Class380_Sub3) this).aClass283Array10420 != null;
    }
    
    abstract float method16731(float f, float f_8_, float f_9_);
    
    abstract float method16732(float f, float f_10_, float f_11_);
    
    abstract float method16733(float f, float f_12_, float f_13_);
    
    public void method6858(float f, int[][][] is, Class215 class215, int i,
			   int i_14_, int i_15_) {
	Class283 class283
	    = (((Class380_Sub3) this).aClass283Array10420
	       [-1018317461 * ((Class380_Sub3) this).anInt10417]);
	if ((((Class380_Sub3) this).aFloatArray10419
	     [-1018317461 * ((Class380_Sub3) this).anInt10417])
	    > 0.0F) {
	    if ((((Class380_Sub3) this).aFloatArray10419
		 [((Class380_Sub3) this).anInt10417 * -1018317461])
		>= f) {
		((Class380_Sub3) this).aFloatArray10419
		    [((Class380_Sub3) this).anInt10417 * -1018317461]
		    -= f;
		return;
	    }
	    f -= (((Class380_Sub3) this).aFloatArray10419
		  [((Class380_Sub3) this).anInt10417 * -1018317461]);
	    ((Class380_Sub3) this).aFloatArray10419
		[-1018317461 * ((Class380_Sub3) this).anInt10417]
		= 0.0F;
	}
	float f_16_ = 1.0F / (float) Class70.method1725(-1033303336);
	while (f > 0.0F) {
	    float f_17_ = class283.method5495();
	    if (((Class380_Sub3) this).aFloat10418 >= f_17_) {
		if (((Class380_Sub3) this).anInt10417 * -1018317461 + 1
		    == ((Class380_Sub3) this).aClass283Array10420.length)
		    break;
		if ((((Class380_Sub3) this).aFloatArray10419
		     [-1018317461 * ((Class380_Sub3) this).anInt10417 + 1])
		    >= f) {
		    ((Class380_Sub3) this).aFloatArray10419
			[1 + ((Class380_Sub3) this).anInt10417 * -1018317461]
			-= f;
		    break;
		}
		((Class380_Sub3) this).anInt10417 += -320286909;
		f -= (((Class380_Sub3) this).aFloatArray10419
		      [((Class380_Sub3) this).anInt10417 * -1018317461]);
		((Class380_Sub3) this).aFloatArray10419
		    [((Class380_Sub3) this).anInt10417 * -1018317461]
		    = 0.0F;
		method16730(353027101);
		((Class380_Sub3) this).aFloat10418 = 0.0F;
		((Class380_Sub3) this).aFloat10416 = 0.0F;
		class283 = (((Class380_Sub3) this).aClass283Array10420
			    [-1018317461 * ((Class380_Sub3) this).anInt10417]);
		f_17_ = class283.method5495();
	    }
	    while (f > 0.0F && ((Class380_Sub3) this).aFloat10418 < f_17_) {
		((Class380_Sub3) this).aFloat10416
		    = method16728(f_17_, ((Class380_Sub3) this).aFloat10416,
				  Math.min(f, f_16_), -2070488641);
		f -= f_16_;
		method16727(((Class380_Sub3) this).aFloat10416, f_17_,
			    (byte) -14);
	    }
	}
    }
    
    abstract void method16734();
    
    abstract void method16735();
    
    public void method6863(Class79 class79, int i, int i_18_, byte i_19_) {
	Class287 class287 = method6867(-1552946472);
	class79.anInt1137 = ((int) class287.aFloat4477 - i) * 2139849275;
	class79.anInt1136 = (int) -class287.aFloat4474 * 1289480665;
	class79.anInt1135 = ((int) class287.aFloat4479 - i_18_) * 279197473;
    }
    
    abstract void method16736(RSByteBuffer class241_sub3, int i);
    
    abstract void method16737(RSByteBuffer class241_sub3, int i);
    
    abstract void method16738(RSByteBuffer class241_sub3, int i);
    
    public float method6876() {
	return ((Class380_Sub3) this).aClass283Array10420
		   [-1018317461 * ((Class380_Sub3) this).anInt10417]
		   .method5500(((Class380_Sub3) this).aFloat10418);
    }
    
    public void method6866(float f, int[][][] is, Class215 class215, int i,
			   int i_20_) {
	Class283 class283
	    = (((Class380_Sub3) this).aClass283Array10420
	       [-1018317461 * ((Class380_Sub3) this).anInt10417]);
	if ((((Class380_Sub3) this).aFloatArray10419
	     [-1018317461 * ((Class380_Sub3) this).anInt10417])
	    > 0.0F) {
	    if ((((Class380_Sub3) this).aFloatArray10419
		 [((Class380_Sub3) this).anInt10417 * -1018317461])
		>= f) {
		((Class380_Sub3) this).aFloatArray10419
		    [((Class380_Sub3) this).anInt10417 * -1018317461]
		    -= f;
		return;
	    }
	    f -= (((Class380_Sub3) this).aFloatArray10419
		  [((Class380_Sub3) this).anInt10417 * -1018317461]);
	    ((Class380_Sub3) this).aFloatArray10419
		[-1018317461 * ((Class380_Sub3) this).anInt10417]
		= 0.0F;
	}
	float f_21_ = 1.0F / (float) Class70.method1725(269421116);
	while (f > 0.0F) {
	    float f_22_ = class283.method5495();
	    if (((Class380_Sub3) this).aFloat10418 >= f_22_) {
		if (((Class380_Sub3) this).anInt10417 * -1018317461 + 1
		    == ((Class380_Sub3) this).aClass283Array10420.length)
		    break;
		if ((((Class380_Sub3) this).aFloatArray10419
		     [-1018317461 * ((Class380_Sub3) this).anInt10417 + 1])
		    >= f) {
		    ((Class380_Sub3) this).aFloatArray10419
			[1 + ((Class380_Sub3) this).anInt10417 * -1018317461]
			-= f;
		    break;
		}
		((Class380_Sub3) this).anInt10417 += -320286909;
		f -= (((Class380_Sub3) this).aFloatArray10419
		      [((Class380_Sub3) this).anInt10417 * -1018317461]);
		((Class380_Sub3) this).aFloatArray10419
		    [((Class380_Sub3) this).anInt10417 * -1018317461]
		    = 0.0F;
		method16730(-1838824234);
		((Class380_Sub3) this).aFloat10418 = 0.0F;
		((Class380_Sub3) this).aFloat10416 = 0.0F;
		class283 = (((Class380_Sub3) this).aClass283Array10420
			    [-1018317461 * ((Class380_Sub3) this).anInt10417]);
		f_22_ = class283.method5495();
	    }
	    while (f > 0.0F && ((Class380_Sub3) this).aFloat10418 < f_22_) {
		((Class380_Sub3) this).aFloat10416
		    = method16728(f_22_, ((Class380_Sub3) this).aFloat10416,
				  Math.min(f, f_21_), -1119432197);
		f -= f_21_;
		method16727(((Class380_Sub3) this).aFloat10416, f_22_,
			    (byte) -118);
	    }
	}
    }
    
    abstract void method16739(RSByteBuffer class241_sub3, int i, byte i_23_);
    
    public boolean method6869() {
	return ((Class380_Sub3) this).aClass283Array10420 != null;
    }
    
    public Class287 method6867(int i) {
	Class287 class287 = Class287.method5560();
	double[] ds = ((Class380_Sub3) this).aClass283Array10420
			  [-1018317461 * ((Class380_Sub3) this).anInt10417]
			  .method5497(((Class380_Sub3) this).aFloat10418);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    abstract float method16740(float f, float f_24_, float f_25_);
    
    public Class287 method6871() {
	Class287 class287 = Class287.method5560();
	double[] ds = ((Class380_Sub3) this).aClass283Array10420
			  [-1018317461 * ((Class380_Sub3) this).anInt10417]
			  .method5497(((Class380_Sub3) this).aFloat10418);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public double[] method6879() {
	return ((Class380_Sub3) this).aClass283Array10420
		   [((Class380_Sub3) this).anInt10417 * -1018317461]
		   .method5497(((Class380_Sub3) this).aFloat10418);
    }
    
    public Class241_Sub16 method6873() {
	Class287 class287 = method6867(-1581564798);
	return new Class241_Sub16(0, (int) class287.aFloat4477,
				  (int) class287.aFloat4474,
				  (int) class287.aFloat4479);
    }
    
    public Class241_Sub16 method6874() {
	Class287 class287 = method6867(-525252137);
	return new Class241_Sub16(0, (int) class287.aFloat4477,
				  (int) class287.aFloat4474,
				  (int) class287.aFloat4479);
    }
    
    public float method6875() {
	return ((Class380_Sub3) this).aClass283Array10420
		   [-1018317461 * ((Class380_Sub3) this).anInt10417]
		   .method5500(((Class380_Sub3) this).aFloat10418);
    }
    
    public boolean method6859(byte i) {
	return ((Class380_Sub3) this).aClass283Array10420 != null;
    }
    
    public void method6877(Class79 class79, int i, int i_26_) {
	Class287 class287 = method6867(275172783);
	class79.anInt1137 = ((int) class287.aFloat4477 - i) * 2139849275;
	class79.anInt1136 = (int) -class287.aFloat4474 * 1289480665;
	class79.anInt1135 = ((int) class287.aFloat4479 - i_26_) * 279197473;
    }
    
    public void method6870(RSByteBuffer class241_sub3) {
	((Class380_Sub3) this).aFloat10418 = 0.0F;
	((Class380_Sub3) this).aFloat10416 = 0.0F;
	((Class380_Sub3) this).anInt10417 = 0;
	int i = class241_sub3.readUnsignedByte((byte) -44);
	((Class380_Sub3) this).aClass283Array10420 = new Class283[i];
	((Class380_Sub3) this).aFloatArray10419 = new float[i];
	for (int i_27_ = 0; i_27_ < i; i_27_++) {
	    ((Class380_Sub3) this).aClass283Array10420[i_27_]
		= new Class283(class241_sub3);
	    ((Class380_Sub3) this).aFloatArray10419[i_27_]
		= class241_sub3.method14650(-1852276771);
	}
	method16739(class241_sub3, i, (byte) -25);
    }
    
    public void method6861(RSByteBuffer class241_sub3) {
	((Class380_Sub3) this).aFloat10418 = 0.0F;
	((Class380_Sub3) this).aFloat10416 = 0.0F;
	((Class380_Sub3) this).anInt10417 = 0;
	int i = class241_sub3.readUnsignedByte((byte) 49);
	((Class380_Sub3) this).aClass283Array10420 = new Class283[i];
	((Class380_Sub3) this).aFloatArray10419 = new float[i];
	for (int i_28_ = 0; i_28_ < i; i_28_++) {
	    ((Class380_Sub3) this).aClass283Array10420[i_28_]
		= new Class283(class241_sub3);
	    ((Class380_Sub3) this).aFloatArray10419[i_28_]
		= class241_sub3.method14650(-1639866793);
	}
	method16739(class241_sub3, i, (byte) -3);
    }
    
    public float method16741(int i) {
	return ((Class380_Sub3) this).aClass283Array10420
		   [-1018317461 * ((Class380_Sub3) this).anInt10417]
		   .method5515(((Class380_Sub3) this).aFloat10418);
    }
    
    public float method16742() {
	return ((Class380_Sub3) this).aClass283Array10420
		   [-1018317461 * ((Class380_Sub3) this).anInt10417]
		   .method5515(((Class380_Sub3) this).aFloat10418);
    }
    
    public float method16743() {
	return ((Class380_Sub3) this).aClass283Array10420
		   [-1018317461 * ((Class380_Sub3) this).anInt10417]
		   .method5515(((Class380_Sub3) this).aFloat10418);
    }
    
    public void method6864(RSByteBuffer class241_sub3, byte i) {
	((Class380_Sub3) this).aFloat10418 = 0.0F;
	((Class380_Sub3) this).aFloat10416 = 0.0F;
	((Class380_Sub3) this).anInt10417 = 0;
	int i_29_ = class241_sub3.readUnsignedByte((byte) -105);
	((Class380_Sub3) this).aClass283Array10420 = new Class283[i_29_];
	((Class380_Sub3) this).aFloatArray10419 = new float[i_29_];
	for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
	    ((Class380_Sub3) this).aClass283Array10420[i_30_]
		= new Class283(class241_sub3);
	    ((Class380_Sub3) this).aFloatArray10419[i_30_]
		= class241_sub3.method14650(-392789764);
	}
	method16739(class241_sub3, i_29_, (byte) -45);
    }
    
    public float method16744() {
	return ((Class380_Sub3) this).aClass283Array10420
		   [-1018317461 * ((Class380_Sub3) this).anInt10417]
		   .method5515(((Class380_Sub3) this).aFloat10418);
    }
    
    public void method16745(Class283 class283, int i, float f) {
	if (((Class380_Sub3) this).aClass283Array10420 == null) {
	    ((Class380_Sub3) this).aClass283Array10420
		= new Class283[] { class283 };
	    ((Class380_Sub3) this).aFloatArray10419 = new float[] { f };
	    ((Class380_Sub3) this).anIntArray10415 = new int[] { i };
	} else {
	    Class283[] class283s
		= (new Class283
		   [((Class380_Sub3) this).aClass283Array10420.length + 1]);
	    float[] fs
		= (new float
		   [1 + ((Class380_Sub3) this).aClass283Array10420.length]);
	    int[] is
		= (new int
		   [((Class380_Sub3) this).aClass283Array10420.length + 1]);
	    System.arraycopy(((Class380_Sub3) this).aClass283Array10420, 0,
			     class283s, 0,
			     (((Class380_Sub3) this)
			      .aClass283Array10420).length);
	    System.arraycopy(((Class380_Sub3) this).aFloatArray10419, 0, fs, 0,
			     (((Class380_Sub3) this)
			      .aClass283Array10420).length);
	    System.arraycopy(((Class380_Sub3) this).anIntArray10415, 0, is, 0,
			     (((Class380_Sub3) this)
			      .aClass283Array10420).length);
	    ((Class380_Sub3) this).aClass283Array10420 = class283s;
	    ((Class380_Sub3) this).aFloatArray10419 = fs;
	    ((Class380_Sub3) this).anIntArray10415 = is;
	    ((Class380_Sub3) this).aClass283Array10420
		[((Class380_Sub3) this).aClass283Array10420.length - 1]
		= class283;
	    ((Class380_Sub3) this).aFloatArray10419
		[((Class380_Sub3) this).aFloatArray10419.length - 1]
		= f;
	    ((Class380_Sub3) this).anIntArray10415
		[((Class380_Sub3) this).anIntArray10415.length - 1]
		= i;
	}
    }
}
