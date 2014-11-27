/* Class434_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class434_Sub3_Sub1 extends Class434_Sub3
{
    float[] aFloatArray10744;
    float[] aFloatArray10745;
    int anInt10746 = 0;
    
    void method14078(RSByteBuffer class241_sub3, int i, byte i_0_) {
	((Class434_Sub3_Sub1) this).aFloatArray10745 = new float[i];
	((Class434_Sub3_Sub1) this).aFloatArray10744 = new float[i];
	((Class434_Sub3_Sub1) this).anInt10746 = 0;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    ((Class434_Sub3_Sub1) this).aFloatArray10745[i_1_]
		= class241_sub3.method14650(-732557204);
	    ((Class434_Sub3_Sub1) this).aFloatArray10744[i_1_]
		= class241_sub3.method14650(-1459073507);
	}
    }
    
    float method14077(float f, float f_2_, float f_3_) {
	float f_4_ = (((Class434_Sub3_Sub1) this).aFloat8615
		      / (float) ((Class434_Sub3_Sub1) this)
				    .aClass283Array8614
				    [(((Class434_Sub3_Sub1) this).anInt10746
				      * -1515005231)]
				    .method5517());
	float f_5_
	    = ((((((Class434_Sub3_Sub1) this).aFloatArray10744
		  [-1515005231 * ((Class434_Sub3_Sub1) this).anInt10746])
		 - (((Class434_Sub3_Sub1) this).aFloatArray10745
		    [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]))
		* f_4_)
	       + (((Class434_Sub3_Sub1) this).aFloatArray10745
		  [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]));
	return f_5_;
    }
    
    double[] method14080(int i) {
	return ((Class434_Sub3_Sub1) this).aClass283Array8614
		   [-1515005231 * ((Class434_Sub3_Sub1) this).anInt10746]
		   .method5499(((Class434_Sub3_Sub1) this).aFloat8615);
    }
    
    void method14087(float f, float f_6_, int i) {
	((Class434_Sub3_Sub1) this).aFloat8615 += f;
	if (((Class434_Sub3_Sub1) this).aFloat8615
	    > (float) ((Class434_Sub3_Sub1) this).aClass283Array8614
			  [(((Class434_Sub3_Sub1) this).anInt10746
			    * -1515005231)]
			  .method5517())
	    ((Class434_Sub3_Sub1) this).aFloat8615
		= (float) ((Class434_Sub3_Sub1) this).aClass283Array8614
			      [(((Class434_Sub3_Sub1) this).anInt10746
				* -1515005231)]
			      .method5517();
    }
    
    void method14076(int i) {
	((Class434_Sub3_Sub1) this).anInt10746 += -2117222863;
    }
    
    float method14088(float f, float f_7_, float f_8_, byte i) {
	float f_9_ = (((Class434_Sub3_Sub1) this).aFloat8615
		      / (float) ((Class434_Sub3_Sub1) this)
				    .aClass283Array8614
				    [(((Class434_Sub3_Sub1) this).anInt10746
				      * -1515005231)]
				    .method5517());
	float f_10_
	    = ((((((Class434_Sub3_Sub1) this).aFloatArray10744
		  [-1515005231 * ((Class434_Sub3_Sub1) this).anInt10746])
		 - (((Class434_Sub3_Sub1) this).aFloatArray10745
		    [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]))
		* f_9_)
	       + (((Class434_Sub3_Sub1) this).aFloatArray10745
		  [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]));
	return f_10_;
    }
    
    public Class287 method7769() {
	Class287 class287 = Class287.method5560();
	double[] ds
	    = ((Class434_Sub3_Sub1) this).aClass283Array8614
		  [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]
		  .method5499(((Class434_Sub3_Sub1) this).aFloat8615);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public Class287 method7753(short i) {
	Class287 class287 = Class287.method5560();
	double[] ds
	    = ((Class434_Sub3_Sub1) this).aClass283Array8614
		  [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]
		  .method5499(((Class434_Sub3_Sub1) this).aFloat8615);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    float method14075(float f, float f_11_, float f_12_) {
	float f_13_ = (((Class434_Sub3_Sub1) this).aFloat8615
		       / (float) ((Class434_Sub3_Sub1) this)
				     .aClass283Array8614
				     [(((Class434_Sub3_Sub1) this).anInt10746
				       * -1515005231)]
				     .method5517());
	float f_14_
	    = ((((((Class434_Sub3_Sub1) this).aFloatArray10744
		  [-1515005231 * ((Class434_Sub3_Sub1) this).anInt10746])
		 - (((Class434_Sub3_Sub1) this).aFloatArray10745
		    [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]))
		* f_13_)
	       + (((Class434_Sub3_Sub1) this).aFloatArray10745
		  [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]));
	return f_14_;
    }
    
    public Class287 method7765() {
	Class287 class287 = Class287.method5560();
	double[] ds
	    = ((Class434_Sub3_Sub1) this).aClass283Array8614
		  [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]
		  .method5499(((Class434_Sub3_Sub1) this).aFloat8615);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    float method14074(float f, float f_15_, float f_16_) {
	float f_17_ = (((Class434_Sub3_Sub1) this).aFloat8615
		       / (float) ((Class434_Sub3_Sub1) this)
				     .aClass283Array8614
				     [(((Class434_Sub3_Sub1) this).anInt10746
				       * -1515005231)]
				     .method5517());
	float f_18_
	    = ((((((Class434_Sub3_Sub1) this).aFloatArray10744
		  [-1515005231 * ((Class434_Sub3_Sub1) this).anInt10746])
		 - (((Class434_Sub3_Sub1) this).aFloatArray10745
		    [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]))
		* f_17_)
	       + (((Class434_Sub3_Sub1) this).aFloatArray10745
		  [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]));
	return f_18_;
    }
    
    void method14086() {
	((Class434_Sub3_Sub1) this).anInt10746 += -2117222863;
    }
    
    void method14082() {
	((Class434_Sub3_Sub1) this).anInt10746 += -2117222863;
    }
    
    void method14083() {
	((Class434_Sub3_Sub1) this).anInt10746 += -2117222863;
    }
    
    void method14084(RSByteBuffer class241_sub3, int i) {
	((Class434_Sub3_Sub1) this).aFloatArray10745 = new float[i];
	((Class434_Sub3_Sub1) this).aFloatArray10744 = new float[i];
	((Class434_Sub3_Sub1) this).anInt10746 = 0;
	for (int i_19_ = 0; i_19_ < i; i_19_++) {
	    ((Class434_Sub3_Sub1) this).aFloatArray10745[i_19_]
		= class241_sub3.method14650(-725407660);
	    ((Class434_Sub3_Sub1) this).aFloatArray10744[i_19_]
		= class241_sub3.method14650(-2095116350);
	}
    }
    
    void method14085(RSByteBuffer class241_sub3, int i) {
	((Class434_Sub3_Sub1) this).aFloatArray10745 = new float[i];
	((Class434_Sub3_Sub1) this).aFloatArray10744 = new float[i];
	((Class434_Sub3_Sub1) this).anInt10746 = 0;
	for (int i_20_ = 0; i_20_ < i; i_20_++) {
	    ((Class434_Sub3_Sub1) this).aFloatArray10745[i_20_]
		= class241_sub3.method14650(-1181614285);
	    ((Class434_Sub3_Sub1) this).aFloatArray10744[i_20_]
		= class241_sub3.method14650(-1848265704);
	}
    }
    
    public Class287 method7752() {
	return method7753((short) 128);
    }
    
    public Class287 method7763() {
	return method7753((short) 128);
    }
    
    public Class287 method7767(byte i) {
	return method7753((short) 128);
    }
    
    public Class287 method7766() {
	Class287 class287 = Class287.method5560();
	double[] ds
	    = ((Class434_Sub3_Sub1) this).aClass283Array8614
		  [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]
		  .method5499(((Class434_Sub3_Sub1) this).aFloat8615);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public Class287 method7768() {
	Class287 class287 = Class287.method5560();
	double[] ds
	    = ((Class434_Sub3_Sub1) this).aClass283Array8614
		  [((Class434_Sub3_Sub1) this).anInt10746 * -1515005231]
		  .method5499(((Class434_Sub3_Sub1) this).aFloat8615);
	class287.aFloat4477 = (float) ds[0];
	class287.aFloat4474 = (float) ds[1];
	class287.aFloat4479 = (float) ds[2];
	return class287;
    }
    
    public Class434_Sub3_Sub1(Class351 class351) {
	super(class351);
    }
    
    void method14090(float f, float f_21_) {
	((Class434_Sub3_Sub1) this).aFloat8615 += f;
	if (((Class434_Sub3_Sub1) this).aFloat8615
	    > (float) ((Class434_Sub3_Sub1) this).aClass283Array8614
			  [(((Class434_Sub3_Sub1) this).anInt10746
			    * -1515005231)]
			  .method5517())
	    ((Class434_Sub3_Sub1) this).aFloat8615
		= (float) ((Class434_Sub3_Sub1) this).aClass283Array8614
			      [(((Class434_Sub3_Sub1) this).anInt10746
				* -1515005231)]
			      .method5517();
    }
    
    double[] method14079() {
	return ((Class434_Sub3_Sub1) this).aClass283Array8614
		   [-1515005231 * ((Class434_Sub3_Sub1) this).anInt10746]
		   .method5499(((Class434_Sub3_Sub1) this).aFloat8615);
    }
}
