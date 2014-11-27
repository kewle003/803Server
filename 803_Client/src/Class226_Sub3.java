/* Class226_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class226_Sub3 extends Class226 implements Interface43
{
    float aFloat10410;
    int anInt10411;
    int anInt10412;
    float aFloat10413;
    
    Class226_Sub3(Class103_Sub3_Sub2 class103_sub3_sub2, int i, int i_0_,
		  boolean bool, int[] is, int i_1_, int i_2_) {
	super(class103_sub3_sub2, 3553, Class175.aClass175_2110,
	      Class102.aClass102_1440, i * i_0_, bool);
	if (!((Class103_Sub3_Sub2)
	      ((Class226_Sub3) this).aClass103_Sub3_Sub2_2668).aBool11160) {
	    ((Class226_Sub3) this).anInt10412
		= Class480.method11001(i, (byte) -96);
	    ((Class226_Sub3) this).anInt10411
		= Class480.method11001(i_0_, (byte) -107);
	    ((Class226_Sub3) this).aFloat10410
		= (float) i / (float) ((Class226_Sub3) this).anInt10412;
	    ((Class226_Sub3) this).aFloat10413
		= (float) i_0_ / (float) ((Class226_Sub3) this).anInt10411;
	    if (i != ((Class226_Sub3) this).anInt10412
		|| i_0_ != ((Class226_Sub3) this).anInt10411) {
		is = (((Class226_Sub3) this).aClass103_Sub3_Sub2_2668
			  .method2339
		      (i, i_0_, ((Class226_Sub3) this).anInt10412,
		       ((Class226_Sub3) this).anInt10411, is, i_1_, i_2_,
		       (short) -10764));
		i_1_ = 0;
		i_2_ = ((Class226_Sub3) this).anInt10412;
	    }
	} else {
	    ((Class226_Sub3) this).anInt10412 = i;
	    ((Class226_Sub3) this).anInt10411 = i_0_;
	    ((Class226_Sub3) this).aFloat10410 = 1.0F;
	    ((Class226_Sub3) this).aFloat10413 = 1.0F;
	}
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	if (!bool || i_2_ != 0 || i_1_ != 0) {
	    OpenGL.glPixelStorei(3314, i_2_);
	    OpenGL.glTexImage2Di(((Class226_Sub3) this).anInt2660, 0, 6408,
				 ((Class226_Sub3) this).anInt10412,
				 ((Class226_Sub3) this).anInt10411, 0, 32993,
				 ((Class103_Sub3_Sub2)
				  (((Class226_Sub3) this)
				   .aClass103_Sub3_Sub2_2668)).anInt11165,
				 is, i_1_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method4633(((Class226_Sub3) this).anInt2660, i, i_0_, is);
    }
    
    public void method245(boolean bool, boolean bool_3_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glTexParameteri(((Class226_Sub3) this).anInt2660, 10242,
			       bool ? 10497 : 33071);
	OpenGL.glTexParameteri(((Class226_Sub3) this).anInt2660, 10243,
			       bool_3_ ? 10497 : 33071);
    }
    
    Class226_Sub3(Class103_Sub3_Sub2 class103_sub3_sub2, Class175 class175,
		  int i, int i_4_, boolean bool, byte[] is, int i_5_,
		  int i_6_) {
	super(class103_sub3_sub2, 3553, class175, Class102.aClass102_1440,
	      i * i_4_, bool);
	if (!((Class103_Sub3_Sub2)
	      ((Class226_Sub3) this).aClass103_Sub3_Sub2_2668).aBool11160) {
	    ((Class226_Sub3) this).anInt10412
		= Class480.method11001(i, (byte) 4);
	    ((Class226_Sub3) this).anInt10411
		= Class480.method11001(i_4_, (byte) -109);
	    ((Class226_Sub3) this).aFloat10410
		= (float) i / (float) ((Class226_Sub3) this).anInt10412;
	    ((Class226_Sub3) this).aFloat10413
		= (float) i_4_ / (float) ((Class226_Sub3) this).anInt10411;
	    if (i != ((Class226_Sub3) this).anInt10412
		|| i_4_ != ((Class226_Sub3) this).anInt10411) {
		is = (((Class226_Sub3) this).aClass103_Sub3_Sub2_2668
			  .method2341
		      (i, i_4_, ((Class226_Sub3) this).anInt10412,
		       ((Class226_Sub3) this).anInt10411, is, i_5_, i_6_,
		       class175.anInt2121 * 1893442799, (byte) 50));
		i_5_ = 0;
		i_6_ = ((Class226_Sub3) this).anInt10412;
	    }
	} else {
	    ((Class226_Sub3) this).anInt10412 = i;
	    ((Class226_Sub3) this).anInt10411 = i_4_;
	    ((Class226_Sub3) this).aFloat10410 = 1.0F;
	    ((Class226_Sub3) this).aFloat10413 = 1.0F;
	}
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3317, 1);
	if (!bool || i_6_ != 0 || i_5_ != 0) {
	    OpenGL.glPixelStorei(3314, i_6_);
	    if (((Class226_Sub3) this).aClass175_2663
		== Class175.aClass175_2118)
		OpenGL.glCompressedTexImage2Dub((((Class226_Sub3) this)
						 .anInt2660),
						0, 33777, i, i_4_, 0,
						i * i_4_ / 2, is, i_5_);
	    else if (((Class226_Sub3) this).aClass175_2663
		     == Class175.aClass175_2119)
		OpenGL.glCompressedTexImage2Dub((((Class226_Sub3) this)
						 .anInt2660),
						0, 33779, i, i_4_, 0, i * i_4_,
						is, i_5_);
	    else
		OpenGL.glTexImage2Dub
		    (((Class226_Sub3) this).anInt2660, 0,
		     Class103_Sub3_Sub2.method17559((((Class226_Sub3) this)
						     .aClass175_2663),
						    (((Class226_Sub3) this)
						     .aClass102_2664)),
		     i, i_4_, 0,
		     Class103_Sub3_Sub2
			 .method17571(((Class226_Sub3) this).aClass175_2663),
		     5121, is, i_5_);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method4646(((Class226_Sub3) this).anInt2660, i, i_4_, is);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    Class226_Sub3(Class103_Sub3_Sub2 class103_sub3_sub2, Class175 class175,
		  int i, int i_7_, boolean bool, float[] fs, int i_8_,
		  int i_9_) {
	super(class103_sub3_sub2, 3553, class175, Class102.aClass102_1443,
	      i * i_7_, bool);
	if (!((Class103_Sub3_Sub2)
	      ((Class226_Sub3) this).aClass103_Sub3_Sub2_2668).aBool11160) {
	    ((Class226_Sub3) this).anInt10412
		= Class480.method11001(i, (byte) -2);
	    ((Class226_Sub3) this).anInt10411
		= Class480.method11001(i_7_, (byte) -82);
	    ((Class226_Sub3) this).aFloat10410
		= (float) i / (float) ((Class226_Sub3) this).anInt10412;
	    ((Class226_Sub3) this).aFloat10413
		= (float) i_7_ / (float) ((Class226_Sub3) this).anInt10411;
	    if (i != ((Class226_Sub3) this).anInt10412
		|| i_7_ != ((Class226_Sub3) this).anInt10411) {
		fs = (((Class226_Sub3) this).aClass103_Sub3_Sub2_2668
			  .method2340
		      (i, i_7_, ((Class226_Sub3) this).anInt10412,
		       ((Class226_Sub3) this).anInt10411, fs, i_8_, i_9_,
		       class175.anInt2121 * 1893442799, 1895483015));
		i_8_ = 0;
		i_9_ = ((Class226_Sub3) this).anInt10412;
	    }
	} else {
	    ((Class226_Sub3) this).anInt10412 = i;
	    ((Class226_Sub3) this).anInt10411 = i_7_;
	    ((Class226_Sub3) this).aFloat10410 = 1.0F;
	    ((Class226_Sub3) this).aFloat10413 = 1.0F;
	}
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	if (!bool || i_9_ != 0 || i_8_ != 0) {
	    OpenGL.glPixelStorei(3314, i_9_);
	    OpenGL.glTexImage2Df
		(((Class226_Sub3) this).anInt2660, 0,
		 Class103_Sub3_Sub2.method17559((((Class226_Sub3) this)
						 .aClass175_2663),
						(((Class226_Sub3) this)
						 .aClass102_2664)),
		 i, i_7_, 0,
		 Class103_Sub3_Sub2
		     .method17571(((Class226_Sub3) this).aClass175_2663),
		 5126, fs, i_8_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method4640(((Class226_Sub3) this).anInt2660, i, i_7_, fs);
    }
    
    public int method55() {
	return ((Class226_Sub3) this).anInt10412;
    }
    
    public int method49() {
	return ((Class226_Sub3) this).anInt10411;
    }
    
    public float method225(float f) {
	return f / (float) ((Class226_Sub3) this).anInt10412;
    }
    
    public float method226(float f) {
	return f / (float) ((Class226_Sub3) this).anInt10411;
    }
    
    public float method242() {
	return ((Class226_Sub3) this).aFloat10410;
    }
    
    public void method234(int i, int i_10_, int i_11_, int i_12_, byte[] is,
			  Class175 class175, int i_13_, int i_14_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_14_);
	OpenGL.glTexSubImage2Dub(((Class226_Sub3) this).anInt2660, 0, i, i_10_,
				 i_11_, i_12_,
				 Class103_Sub3_Sub2.method17571(class175),
				 5121, is, i_13_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public boolean method227() {
	return true;
    }
    
    public void method177() {
	super.method178();
    }
    
    public void method179(Class312 class312) {
	super.method176(class312);
    }
    
    public void method230(int i, int i_15_, int i_16_, int i_17_, byte[] is,
			  Class175 class175, int i_18_, int i_19_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_19_);
	OpenGL.glTexSubImage2Dub(((Class226_Sub3) this).anInt2660, 0, i, i_15_,
				 i_16_, i_17_,
				 Class103_Sub3_Sub2.method17571(class175),
				 5121, is, i_18_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public void method231(int i, int i_20_, int i_21_, int i_22_, int[] is,
			  int i_23_) {
	int[] is_24_ = new int[(((Class226_Sub3) this).anInt10412
				* ((Class226_Sub3) this).anInt10411)];
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glGetTexImagei(((Class226_Sub3) this).anInt2660, 0, 32993, 5121,
			      is_24_, 0);
	for (int i_25_ = 0; i_25_ < i_22_; i_25_++)
	    System.arraycopy(is_24_,
			     ((i_20_ + (i_22_ - 1) - i_25_)
			      * ((Class226_Sub3) this).anInt10412),
			     is, i_23_ + i_25_ * i_21_, i_21_);
    }
    
    public Interface4 method274(int i) {
	return new Class231(this, i);
    }
    
    public boolean method150() {
	return super.method150();
    }
    
    public void method178() {
	super.method178();
    }
    
    public void method181(Class312 class312) {
	super.method176(class312);
    }
    
    public void method28() {
	super.method28();
    }
    
    public void method27() {
	super.method28();
    }
    
    public void method29() {
	super.method28();
    }
    
    public int method241() {
	return ((Class226_Sub3) this).anInt10412;
    }
    
    Class226_Sub3(Class103_Sub3_Sub2 class103_sub3_sub2, Class175 class175,
		  Class102 class102, int i, int i_26_) {
	super(class103_sub3_sub2, 3553, class175, class102, i * i_26_, false);
	if (!((Class103_Sub3_Sub2)
	      ((Class226_Sub3) this).aClass103_Sub3_Sub2_2668).aBool11160) {
	    ((Class226_Sub3) this).anInt10412
		= Class480.method11001(i, (byte) 53);
	    ((Class226_Sub3) this).anInt10411
		= Class480.method11001(i_26_, (byte) -87);
	    ((Class226_Sub3) this).aFloat10410
		= (float) i / (float) ((Class226_Sub3) this).anInt10412;
	    ((Class226_Sub3) this).aFloat10413
		= (float) i_26_ / (float) ((Class226_Sub3) this).anInt10411;
	} else {
	    ((Class226_Sub3) this).anInt10412 = i;
	    ((Class226_Sub3) this).anInt10411 = i_26_;
	    ((Class226_Sub3) this).aFloat10410 = 1.0F;
	    ((Class226_Sub3) this).aFloat10413 = 1.0F;
	}
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glTexImage2Dub
	    (((Class226_Sub3) this).anInt2660, 0,
	     Class103_Sub3_Sub2.method17559((((Class226_Sub3) this)
					     .aClass175_2663),
					    (((Class226_Sub3) this)
					     .aClass102_2664)),
	     i, i_26_, 0,
	     Class103_Sub3_Sub2
		 .method17571(((Class226_Sub3) this).aClass175_2663),
	     Class103_Sub3_Sub2
		 .method17553(((Class226_Sub3) this).aClass102_2664),
	     null, 0);
    }
    
    public int method223() {
	return ((Class226_Sub3) this).anInt10412;
    }
    
    public int method237() {
	return ((Class226_Sub3) this).anInt10411;
    }
    
    public int method238() {
	return ((Class226_Sub3) this).anInt10411;
    }
    
    public float method239(float f) {
	return f / (float) ((Class226_Sub3) this).anInt10412;
    }
    
    public float method246(float f) {
	return f / (float) ((Class226_Sub3) this).anInt10411;
    }
    
    public float method259() {
	return ((Class226_Sub3) this).aFloat10413;
    }
    
    public void method176(Class312 class312) {
	super.method176(class312);
    }
    
    public void method232(boolean bool, boolean bool_27_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glTexParameteri(((Class226_Sub3) this).anInt2660, 10242,
			       bool ? 10497 : 33071);
	OpenGL.glTexParameteri(((Class226_Sub3) this).anInt2660, 10243,
			       bool_27_ ? 10497 : 33071);
    }
    
    public boolean method244() {
	return true;
    }
    
    public boolean method261() {
	return super.method150();
    }
    
    public void method247(boolean bool, boolean bool_28_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glTexParameteri(((Class226_Sub3) this).anInt2660, 10242,
			       bool ? 10497 : 33071);
	OpenGL.glTexParameteri(((Class226_Sub3) this).anInt2660, 10243,
			       bool_28_ ? 10497 : 33071);
    }
    
    public int method235() {
	return ((Class226_Sub3) this).anInt10412;
    }
    
    public void method236(int i, int i_29_, int i_30_, int i_31_, int[] is,
			  int i_32_, int i_33_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3314, i_33_);
	OpenGL.glTexSubImage2Di(((Class226_Sub3) this).anInt2660, 0, i, i_29_,
				i_30_, i_31_, 32993,
				((Class103_Sub3_Sub2)
				 (((Class226_Sub3) this)
				  .aClass103_Sub3_Sub2_2668)).anInt11165,
				is, i_32_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public void method224(int i, int i_34_, int i_35_, int i_36_, int[] is,
			  int i_37_, int i_38_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3314, i_38_);
	OpenGL.glTexSubImage2Di(((Class226_Sub3) this).anInt2660, 0, i, i_34_,
				i_35_, i_36_, 32993,
				((Class103_Sub3_Sub2)
				 (((Class226_Sub3) this)
				  .aClass103_Sub3_Sub2_2668)).anInt11165,
				is, i_37_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public void method248(int i, int i_39_, int i_40_, int i_41_, int[] is,
			  int i_42_, int i_43_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3314, i_43_);
	OpenGL.glTexSubImage2Di(((Class226_Sub3) this).anInt2660, 0, i, i_39_,
				i_40_, i_41_, 32993,
				((Class103_Sub3_Sub2)
				 (((Class226_Sub3) this)
				  .aClass103_Sub3_Sub2_2668)).anInt11165,
				is, i_42_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public void method229(int i, int i_44_, int i_45_, int i_46_, int[] is,
			  int i_47_, int i_48_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3314, i_48_);
	OpenGL.glTexSubImage2Di(((Class226_Sub3) this).anInt2660, 0, i, i_44_,
				i_45_, i_46_, 32993,
				((Class103_Sub3_Sub2)
				 (((Class226_Sub3) this)
				  .aClass103_Sub3_Sub2_2668)).anInt11165,
				is, i_47_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public float method260(float f) {
	return f / (float) ((Class226_Sub3) this).anInt10411;
    }
    
    public void method251(int i, int i_49_, int i_50_, int i_51_, byte[] is,
			  Class175 class175, int i_52_, int i_53_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_53_);
	OpenGL.glTexSubImage2Dub(((Class226_Sub3) this).anInt2660, 0, i, i_49_,
				 i_50_, i_51_,
				 Class103_Sub3_Sub2.method17571(class175),
				 5121, is, i_52_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public void method252(int i, int i_54_, int i_55_, int i_56_, byte[] is,
			  Class175 class175, int i_57_, int i_58_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_58_);
	OpenGL.glTexSubImage2Dub(((Class226_Sub3) this).anInt2660, 0, i, i_54_,
				 i_55_, i_56_,
				 Class103_Sub3_Sub2.method17571(class175),
				 5121, is, i_57_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public float method233() {
	return ((Class226_Sub3) this).aFloat10413;
    }
    
    public void method254(int i, int i_59_, int i_60_, int i_61_, int[] is,
			  int i_62_) {
	int[] is_63_ = new int[(((Class226_Sub3) this).anInt10412
				* ((Class226_Sub3) this).anInt10411)];
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glGetTexImagei(((Class226_Sub3) this).anInt2660, 0, 32993, 5121,
			      is_63_, 0);
	for (int i_64_ = 0; i_64_ < i_61_; i_64_++)
	    System.arraycopy(is_63_,
			     ((i_59_ + (i_61_ - 1) - i_64_)
			      * ((Class226_Sub3) this).anInt10412),
			     is, i_62_ + i_64_ * i_60_, i_60_);
    }
    
    public void method255(int i, int i_65_, int i_66_, int i_67_, int[] is,
			  int i_68_) {
	int[] is_69_ = new int[(((Class226_Sub3) this).anInt10412
				* ((Class226_Sub3) this).anInt10411)];
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glGetTexImagei(((Class226_Sub3) this).anInt2660, 0, 32993, 5121,
			      is_69_, 0);
	for (int i_70_ = 0; i_70_ < i_67_; i_70_++)
	    System.arraycopy(is_69_,
			     ((i_65_ + (i_67_ - 1) - i_70_)
			      * ((Class226_Sub3) this).anInt10412),
			     is, i_68_ + i_70_ * i_66_, i_66_);
    }
    
    public void method256(int i, int i_71_, int i_72_, int i_73_, int[] is,
			  int i_74_, int i_75_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3314, i_75_);
	OpenGL.glTexSubImage2Di(((Class226_Sub3) this).anInt2660, 0, i, i_71_,
				i_72_, i_73_, 32993,
				((Class103_Sub3_Sub2)
				 (((Class226_Sub3) this)
				  .aClass103_Sub3_Sub2_2668)).anInt11165,
				is, i_74_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public float method250() {
	return ((Class226_Sub3) this).aFloat10413;
    }
    
    public float method258() {
	return ((Class226_Sub3) this).aFloat10413;
    }
    
    public void method228(boolean bool, boolean bool_76_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glTexParameteri(((Class226_Sub3) this).anInt2660, 10242,
			       bool ? 10497 : 33071);
	OpenGL.glTexParameteri(((Class226_Sub3) this).anInt2660, 10243,
			       bool_76_ ? 10497 : 33071);
    }
    
    public float method240(float f) {
	return f / (float) ((Class226_Sub3) this).anInt10411;
    }
    
    public void method180() {
	super.method178();
    }
    
    public void method175() {
	super.method178();
    }
    
    public void method253(int i, int i_77_, int i_78_, int i_79_, byte[] is,
			  Class175 class175, int i_80_, int i_81_) {
	((Class226_Sub3) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_81_);
	OpenGL.glTexSubImage2Dub(((Class226_Sub3) this).anInt2660, 0, i, i_77_,
				 i_78_, i_79_,
				 Class103_Sub3_Sub2.method17571(class175),
				 5121, is, i_80_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public boolean method243() {
	return true;
    }
    
    public Interface4 method275(int i) {
	return new Class231(this, i);
    }
    
    public Interface4 method277(int i) {
	return new Class231(this, i);
    }
    
    public Interface4 method276(int i) {
	return new Class231(this, i);
    }
    
    public float method249() {
	return ((Class226_Sub3) this).aFloat10410;
    }
    
    public float method257() {
	return ((Class226_Sub3) this).aFloat10413;
    }
}
