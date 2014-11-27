/* Class380_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class380_Sub3_Sub3 extends Class380_Sub3
{
    int anInt11076 = 0;
    float[] aFloatArray11077;
    float[] aFloatArray11078;
    
    public Class287 method6871() {
	Class287 class287 = Class287.method5560();
	double[] ds
	    = ((Class380_Sub3_Sub3) this).aClass283Array10420
		  [-1935458313 * ((Class380_Sub3_Sub3) this).anInt11076]
		  .method5499(((Class380_Sub3_Sub3) this).aFloat10418);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    void method16730(int i) {
	((Class380_Sub3_Sub3) this).anInt11076 += 1346187719;
    }
    
    float method16728(float f, float f_0_, float f_1_, int i) {
	float f_2_ = (((Class380_Sub3_Sub3) this).aFloat10418
		      / (float) ((Class380_Sub3_Sub3) this)
				    .aClass283Array10420
				    [(((Class380_Sub3_Sub3) this).anInt11076
				      * -1935458313)]
				    .method5517());
	float f_3_
	    = ((((((Class380_Sub3_Sub3) this).aFloatArray11077
		  [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313])
		 - (((Class380_Sub3_Sub3) this).aFloatArray11078
		    [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]))
		* f_2_)
	       + (((Class380_Sub3_Sub3) this).aFloatArray11078
		  [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]));
	return f_3_;
    }
    
    void method16727(float f, float f_4_, byte i) {
	((Class380_Sub3_Sub3) this).aFloat10418 += f;
	if (((Class380_Sub3_Sub3) this).aFloat10418
	    > (float) ((Class380_Sub3_Sub3) this).aClass283Array10420
			  [(((Class380_Sub3_Sub3) this).anInt11076
			    * -1935458313)]
			  .method5517())
	    ((Class380_Sub3_Sub3) this).aFloat10418
		= (float) ((Class380_Sub3_Sub3) this).aClass283Array10420
			      [(((Class380_Sub3_Sub3) this).anInt11076
				* -1935458313)]
			      .method5517();
    }
    
    float method16733(float f, float f_5_, float f_6_) {
	float f_7_ = (((Class380_Sub3_Sub3) this).aFloat10418
		      / (float) ((Class380_Sub3_Sub3) this)
				    .aClass283Array10420
				    [(((Class380_Sub3_Sub3) this).anInt11076
				      * -1935458313)]
				    .method5517());
	float f_8_
	    = ((((((Class380_Sub3_Sub3) this).aFloatArray11077
		  [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313])
		 - (((Class380_Sub3_Sub3) this).aFloatArray11078
		    [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]))
		* f_7_)
	       + (((Class380_Sub3_Sub3) this).aFloatArray11078
		  [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]));
	return f_8_;
    }
    
    public double[] method6860(short i) {
	return ((Class380_Sub3_Sub3) this).aClass283Array10420
		   [-1935458313 * ((Class380_Sub3_Sub3) this).anInt11076]
		   .method5499(((Class380_Sub3_Sub3) this).aFloat10418);
    }
    
    public Class287 method6867(int i) {
	Class287 class287 = Class287.method5560();
	double[] ds
	    = ((Class380_Sub3_Sub3) this).aClass283Array10420
		  [-1935458313 * ((Class380_Sub3_Sub3) this).anInt11076]
		  .method5499(((Class380_Sub3_Sub3) this).aFloat10418);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public float method6862(short i) {
	return ((Class380_Sub3_Sub3) this).aClass283Array10420
		   [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]
		   .method5501(((Class380_Sub3_Sub3) this).aFloat10418);
    }
    
    void method16739(RSByteBuffer class241_sub3, int i, byte i_9_) {
	((Class380_Sub3_Sub3) this).aFloatArray11078 = new float[i];
	((Class380_Sub3_Sub3) this).aFloatArray11077 = new float[i];
	((Class380_Sub3_Sub3) this).anInt11076 = 0;
	for (int i_10_ = 0; i_10_ < i; i_10_++) {
	    ((Class380_Sub3_Sub3) this).aFloatArray11078[i_10_]
		= class241_sub3.method14650(-2103719325);
	    ((Class380_Sub3_Sub3) this).aFloatArray11077[i_10_]
		= class241_sub3.method14650(-2091207554);
	}
    }
    
    public Class380_Sub3_Sub3(Class351 class351) {
	super(class351);
    }
    
    float method16732(float f, float f_11_, float f_12_) {
	float f_13_
	    = (((Class380_Sub3_Sub3) this).aFloat10418
	       / (float) ((Class380_Sub3_Sub3) this).aClass283Array10420
			     [(((Class380_Sub3_Sub3) this).anInt11076
			       * -1935458313)]
			     .method5517());
	float f_14_
	    = ((((((Class380_Sub3_Sub3) this).aFloatArray11077
		  [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313])
		 - (((Class380_Sub3_Sub3) this).aFloatArray11078
		    [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]))
		* f_13_)
	       + (((Class380_Sub3_Sub3) this).aFloatArray11078
		  [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]));
	return f_14_;
    }
    
    void method16724(float f, float f_15_) {
	((Class380_Sub3_Sub3) this).aFloat10418 += f;
	if (((Class380_Sub3_Sub3) this).aFloat10418
	    > (float) ((Class380_Sub3_Sub3) this).aClass283Array10420
			  [(((Class380_Sub3_Sub3) this).anInt11076
			    * -1935458313)]
			  .method5517())
	    ((Class380_Sub3_Sub3) this).aFloat10418
		= (float) ((Class380_Sub3_Sub3) this).aClass283Array10420
			      [(((Class380_Sub3_Sub3) this).anInt11076
				* -1935458313)]
			      .method5517();
    }
    
    float method16740(float f, float f_16_, float f_17_) {
	float f_18_
	    = (((Class380_Sub3_Sub3) this).aFloat10418
	       / (float) ((Class380_Sub3_Sub3) this).aClass283Array10420
			     [(((Class380_Sub3_Sub3) this).anInt11076
			       * -1935458313)]
			     .method5517());
	float f_19_
	    = ((((((Class380_Sub3_Sub3) this).aFloatArray11077
		  [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313])
		 - (((Class380_Sub3_Sub3) this).aFloatArray11078
		    [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]))
		* f_18_)
	       + (((Class380_Sub3_Sub3) this).aFloatArray11078
		  [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]));
	return f_19_;
    }
    
    void method16734() {
	((Class380_Sub3_Sub3) this).anInt11076 += 1346187719;
    }
    
    void method16735() {
	((Class380_Sub3_Sub3) this).anInt11076 += 1346187719;
    }
    
    void method16729(RSByteBuffer class241_sub3, int i) {
	((Class380_Sub3_Sub3) this).aFloatArray11078 = new float[i];
	((Class380_Sub3_Sub3) this).aFloatArray11077 = new float[i];
	((Class380_Sub3_Sub3) this).anInt11076 = 0;
	for (int i_20_ = 0; i_20_ < i; i_20_++) {
	    ((Class380_Sub3_Sub3) this).aFloatArray11078[i_20_]
		= class241_sub3.method14650(-1898815771);
	    ((Class380_Sub3_Sub3) this).aFloatArray11077[i_20_]
		= class241_sub3.method14650(-1636351354);
	}
    }
    
    public double[] method6879() {
	return ((Class380_Sub3_Sub3) this).aClass283Array10420
		   [-1935458313 * ((Class380_Sub3_Sub3) this).anInt11076]
		   .method5499(((Class380_Sub3_Sub3) this).aFloat10418);
    }
    
    void method16737(RSByteBuffer class241_sub3, int i) {
	((Class380_Sub3_Sub3) this).aFloatArray11078 = new float[i];
	((Class380_Sub3_Sub3) this).aFloatArray11077 = new float[i];
	((Class380_Sub3_Sub3) this).anInt11076 = 0;
	for (int i_21_ = 0; i_21_ < i; i_21_++) {
	    ((Class380_Sub3_Sub3) this).aFloatArray11078[i_21_]
		= class241_sub3.method14650(-733220207);
	    ((Class380_Sub3_Sub3) this).aFloatArray11077[i_21_]
		= class241_sub3.method14650(-1986793733);
	}
    }
    
    void method16738(RSByteBuffer class241_sub3, int i) {
	((Class380_Sub3_Sub3) this).aFloatArray11078 = new float[i];
	((Class380_Sub3_Sub3) this).aFloatArray11077 = new float[i];
	((Class380_Sub3_Sub3) this).anInt11076 = 0;
	for (int i_22_ = 0; i_22_ < i; i_22_++) {
	    ((Class380_Sub3_Sub3) this).aFloatArray11078[i_22_]
		= class241_sub3.method14650(-1714688211);
	    ((Class380_Sub3_Sub3) this).aFloatArray11077[i_22_]
		= class241_sub3.method14650(-257165660);
	}
    }
    
    public Class287 method6868() {
	Class287 class287 = Class287.method5560();
	double[] ds
	    = ((Class380_Sub3_Sub3) this).aClass283Array10420
		  [-1935458313 * ((Class380_Sub3_Sub3) this).anInt11076]
		  .method5499(((Class380_Sub3_Sub3) this).aFloat10418);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public float method16742() {
	return ((Class380_Sub3_Sub3) this).aFloat10418;
    }
    
    public float method16726() {
	return ((Class380_Sub3_Sub3) this).aFloat10418;
    }
    
    public float method16741(int i) {
	return ((Class380_Sub3_Sub3) this).aFloat10418;
    }
    
    public float method6875() {
	return ((Class380_Sub3_Sub3) this).aClass283Array10420
		   [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]
		   .method5501(((Class380_Sub3_Sub3) this).aFloat10418);
    }
    
    public float method6876() {
	return ((Class380_Sub3_Sub3) this).aClass283Array10420
		   [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]
		   .method5501(((Class380_Sub3_Sub3) this).aFloat10418);
    }
    
    public float method16744() {
	return ((Class380_Sub3_Sub3) this).aFloat10418;
    }
    
    float method16731(float f, float f_23_, float f_24_) {
	float f_25_
	    = (((Class380_Sub3_Sub3) this).aFloat10418
	       / (float) ((Class380_Sub3_Sub3) this).aClass283Array10420
			     [(((Class380_Sub3_Sub3) this).anInt11076
			       * -1935458313)]
			     .method5517());
	float f_26_
	    = ((((((Class380_Sub3_Sub3) this).aFloatArray11077
		  [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313])
		 - (((Class380_Sub3_Sub3) this).aFloatArray11078
		    [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]))
		* f_25_)
	       + (((Class380_Sub3_Sub3) this).aFloatArray11078
		  [((Class380_Sub3_Sub3) this).anInt11076 * -1935458313]));
	return f_26_;
    }
    
    public float method16743() {
	return ((Class380_Sub3_Sub3) this).aFloat10418;
    }
    
    void method16736(RSByteBuffer class241_sub3, int i) {
	((Class380_Sub3_Sub3) this).aFloatArray11078 = new float[i];
	((Class380_Sub3_Sub3) this).aFloatArray11077 = new float[i];
	((Class380_Sub3_Sub3) this).anInt11076 = 0;
	for (int i_27_ = 0; i_27_ < i; i_27_++) {
	    ((Class380_Sub3_Sub3) this).aFloatArray11078[i_27_]
		= class241_sub3.method14650(-1194467683);
	    ((Class380_Sub3_Sub3) this).aFloatArray11077[i_27_]
		= class241_sub3.method14650(-1771348826);
	}
    }
    
    public Class287 method6878() {
	Class287 class287 = Class287.method5560();
	double[] ds
	    = ((Class380_Sub3_Sub3) this).aClass283Array10420
		  [-1935458313 * ((Class380_Sub3_Sub3) this).anInt11076]
		  .method5499(((Class380_Sub3_Sub3) this).aFloat10418);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public static void method17455(JS5 class210, int i) {
	Class487.anInt6476 = 0;
	Class487.anInt6473 = 0;
	Class487.aList6475 = new LinkedList();
	Class487.aClass247_Sub1_Sub1_Sub1Array6478
	    = new Class247_Sub1_Sub1_Sub1[1024];
	Class42.aClass489Array602
	    = (new Class489
	       [1 + Class90.anIntArray1300[275753719 * Class487.anInt6480]]);
	Class487.anInt6474 = 0;
	Class487.anInt6472 = 0;
	Class75.method1763(class210, -581752548);
	Class25.method936(class210, -644010490);
    }
}
