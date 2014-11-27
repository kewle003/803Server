/* Class434_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class434_Sub3_Sub2 extends Class434_Sub3
{
    int anInt10786 = 0;
    float[] aFloatArray10787;
    float[] aFloatArray10788;
    float[] aFloatArray10789;
    
    public Class434_Sub3_Sub2(Class351 class351) {
	super(class351);
    }
    
    float method14088(float f, float f_0_, float f_1_, byte i) {
	float f_2_ = ((Class434_Sub3_Sub2) this).aFloat8615 / f;
	if (f_2_ < 0.0F)
	    f_2_ = 0.0F;
	if (f_2_ > 1.0F)
	    f_2_ = 1.0F;
	return (f
		/ (((Class434_Sub3_Sub2) this).aFloatArray10789
		   [-94329151 * ((Class434_Sub3_Sub2) this).anInt10786])
		* ((((Class434_Sub3_Sub2) this).aFloatArray10788
		    [((Class434_Sub3_Sub2) this).anInt10786 * -94329151])
		   + (f_2_
		      * ((((Class434_Sub3_Sub2) this).aFloatArray10787
			  [-94329151 * ((Class434_Sub3_Sub2) this).anInt10786])
			 - (((Class434_Sub3_Sub2) this).aFloatArray10788
			    [(((Class434_Sub3_Sub2) this).anInt10786
			      * -94329151)])))));
    }
    
    float method14075(float f, float f_3_, float f_4_) {
	float f_5_ = ((Class434_Sub3_Sub2) this).aFloat8615 / f;
	if (f_5_ < 0.0F)
	    f_5_ = 0.0F;
	if (f_5_ > 1.0F)
	    f_5_ = 1.0F;
	return (f
		/ (((Class434_Sub3_Sub2) this).aFloatArray10789
		   [-94329151 * ((Class434_Sub3_Sub2) this).anInt10786])
		* ((((Class434_Sub3_Sub2) this).aFloatArray10788
		    [((Class434_Sub3_Sub2) this).anInt10786 * -94329151])
		   + (f_5_
		      * ((((Class434_Sub3_Sub2) this).aFloatArray10787
			  [-94329151 * ((Class434_Sub3_Sub2) this).anInt10786])
			 - (((Class434_Sub3_Sub2) this).aFloatArray10788
			    [(((Class434_Sub3_Sub2) this).anInt10786
			      * -94329151)])))));
    }
    
    void method14078(RSByteBuffer class241_sub3, int i, byte i_6_) {
	((Class434_Sub3_Sub2) this).aFloatArray10788 = new float[i];
	((Class434_Sub3_Sub2) this).aFloatArray10787 = new float[i];
	((Class434_Sub3_Sub2) this).aFloatArray10789 = new float[i];
	((Class434_Sub3_Sub2) this).anInt10786 = 0;
	for (int i_7_ = 0; i_7_ < i; i_7_++) {
	    ((Class434_Sub3_Sub2) this).aFloatArray10788[i_7_]
		= class241_sub3.method14650(-765139304);
	    ((Class434_Sub3_Sub2) this).aFloatArray10787[i_7_]
		= class241_sub3.method14650(-2059345131);
	    ((Class434_Sub3_Sub2) this).aFloatArray10789[i_7_]
		= class241_sub3.method14650(-2025737357);
	}
    }
    
    float method14074(float f, float f_8_, float f_9_) {
	float f_10_ = ((Class434_Sub3_Sub2) this).aFloat8615 / f;
	if (f_10_ < 0.0F)
	    f_10_ = 0.0F;
	if (f_10_ > 1.0F)
	    f_10_ = 1.0F;
	return (f
		/ (((Class434_Sub3_Sub2) this).aFloatArray10789
		   [-94329151 * ((Class434_Sub3_Sub2) this).anInt10786])
		* ((((Class434_Sub3_Sub2) this).aFloatArray10788
		    [((Class434_Sub3_Sub2) this).anInt10786 * -94329151])
		   + (f_10_
		      * ((((Class434_Sub3_Sub2) this).aFloatArray10787
			  [-94329151 * ((Class434_Sub3_Sub2) this).anInt10786])
			 - (((Class434_Sub3_Sub2) this).aFloatArray10788
			    [(((Class434_Sub3_Sub2) this).anInt10786
			      * -94329151)])))));
    }
    
    float method14077(float f, float f_11_, float f_12_) {
	float f_13_ = ((Class434_Sub3_Sub2) this).aFloat8615 / f;
	if (f_13_ < 0.0F)
	    f_13_ = 0.0F;
	if (f_13_ > 1.0F)
	    f_13_ = 1.0F;
	return (f
		/ (((Class434_Sub3_Sub2) this).aFloatArray10789
		   [-94329151 * ((Class434_Sub3_Sub2) this).anInt10786])
		* ((((Class434_Sub3_Sub2) this).aFloatArray10788
		    [((Class434_Sub3_Sub2) this).anInt10786 * -94329151])
		   + (f_13_
		      * ((((Class434_Sub3_Sub2) this).aFloatArray10787
			  [-94329151 * ((Class434_Sub3_Sub2) this).anInt10786])
			 - (((Class434_Sub3_Sub2) this).aFloatArray10788
			    [(((Class434_Sub3_Sub2) this).anInt10786
			      * -94329151)])))));
    }
    
    void method14076(int i) {
	((Class434_Sub3_Sub2) this).anInt10786 += 296806721;
    }
    
    void method14086() {
	((Class434_Sub3_Sub2) this).anInt10786 += 296806721;
    }
    
    void method14082() {
	((Class434_Sub3_Sub2) this).anInt10786 += 296806721;
    }
    
    void method14083() {
	((Class434_Sub3_Sub2) this).anInt10786 += 296806721;
    }
    
    void method14084(RSByteBuffer class241_sub3, int i) {
	((Class434_Sub3_Sub2) this).aFloatArray10788 = new float[i];
	((Class434_Sub3_Sub2) this).aFloatArray10787 = new float[i];
	((Class434_Sub3_Sub2) this).aFloatArray10789 = new float[i];
	((Class434_Sub3_Sub2) this).anInt10786 = 0;
	for (int i_14_ = 0; i_14_ < i; i_14_++) {
	    ((Class434_Sub3_Sub2) this).aFloatArray10788[i_14_]
		= class241_sub3.method14650(-706080487);
	    ((Class434_Sub3_Sub2) this).aFloatArray10787[i_14_]
		= class241_sub3.method14650(-1372835686);
	    ((Class434_Sub3_Sub2) this).aFloatArray10789[i_14_]
		= class241_sub3.method14650(-1761475755);
	}
    }
    
    void method14085(RSByteBuffer class241_sub3, int i) {
	((Class434_Sub3_Sub2) this).aFloatArray10788 = new float[i];
	((Class434_Sub3_Sub2) this).aFloatArray10787 = new float[i];
	((Class434_Sub3_Sub2) this).aFloatArray10789 = new float[i];
	((Class434_Sub3_Sub2) this).anInt10786 = 0;
	for (int i_15_ = 0; i_15_ < i; i_15_++) {
	    ((Class434_Sub3_Sub2) this).aFloatArray10788[i_15_]
		= class241_sub3.method14650(-302238908);
	    ((Class434_Sub3_Sub2) this).aFloatArray10787[i_15_]
		= class241_sub3.method14650(-702336659);
	    ((Class434_Sub3_Sub2) this).aFloatArray10789[i_15_]
		= class241_sub3.method14650(-2025488784);
	}
    }
    
    static final String method17023(String string, String string_16_,
				    String string_17_, int i) {
	for (int i_18_ = string.indexOf(string_16_); -1 != i_18_;
	     i_18_ = string.indexOf(string_16_, i_18_ + string_17_.length()))
	    string
		= new StringBuilder().append(string.substring(0, i_18_)).append
		      (string_17_).append
		      (string.substring(i_18_ + string_16_.length()))
		      .toString();
	return string;
    }
}
