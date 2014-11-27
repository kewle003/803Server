/* Class168_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class168_Sub3 extends Class168
{
    int anInt9940;
    Class103_Sub1 aClass103_Sub1_9941;
    Class142_Sub4_Sub1 aClass142_Sub4_Sub1_9942;
    int anInt9943 = 0;
    Class142_Sub4_Sub1 aClass142_Sub4_Sub1_9944;
    int anInt9945;
    int anInt9946;
    boolean aBool9947 = false;
    int anInt9948;
    
    public int method3657() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		.anInt10703);
    }
    
    Class168_Sub3(Class103_Sub1 class103_sub1, int i, int i_0_, int i_1_,
		  int i_2_) {
	((Class168_Sub3) this).anInt9945 = 0;
	((Class168_Sub3) this).anInt9946 = 0;
	((Class168_Sub3) this).anInt9948 = 0;
	((Class168_Sub3) this).anInt9940 = 0;
	((Class168_Sub3) this).aClass103_Sub1_9941 = class103_sub1;
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    = Class142_Sub4_Sub1.method16948(class103_sub1, i, i_0_, i_1_,
					     i_2_);
    }
    
    Class168_Sub3(Class103_Sub1 class103_sub1, int i, int i_3_, int[] is,
		  int i_4_, int i_5_) {
	((Class168_Sub3) this).anInt9945 = 0;
	((Class168_Sub3) this).anInt9946 = 0;
	((Class168_Sub3) this).anInt9948 = 0;
	((Class168_Sub3) this).anInt9940 = 0;
	((Class168_Sub3) this).aClass103_Sub1_9941 = class103_sub1;
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    = Class142_Sub4_Sub1.method16947(class103_sub1, i, i_3_, false, is,
					     i_5_, i_4_);
    }
    
    public void method3638(int i, int i_6_, Class135 class135, int i_7_,
			   int i_8_) {
	Class135_Sub3 class135_sub3 = (Class135_Sub3) class135;
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = ((Class135_Sub3) class135_sub3).aClass142_Sub4_Sub1_10030;
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method3168(false);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(class142_sub4_sub1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(7681, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(1);
	i += ((Class168_Sub3) this).anInt9946;
	i_6_ += ((Class168_Sub3) this).anInt9945;
	int i_9_
	    = i + ((Class142_Sub4_Sub1)
		   ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699;
	int i_10_ = i_6_ + (((Class142_Sub4_Sub1)
			     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			    .anInt10703);
	float f
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_11_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	float f_12_ = (float) (i - i_7_) * f;
	float f_13_ = (float) (i_9_ - i_7_) * f;
	float f_14_ = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
		       - (float) (i_6_ - i_8_) * f_11_);
	float f_15_ = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
		       - (float) (i_10_ - i_8_) * f_11_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_12_, f_14_);
	OpenGL.glVertex2i(i, i_6_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_12_, f_15_);
	OpenGL.glVertex2i(i, i_6_ + ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).anInt10703);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_13_, f_15_);
	OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
			       (((Class168_Sub3) this)
				.aClass142_Sub4_Sub1_9942)).anInt10699,
			  i_6_ + ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).anInt10703);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_13_, f_14_);
	OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
			       (((Class168_Sub3) this)
				.aClass142_Sub4_Sub1_9942)).anInt10699,
			  i_6_);
	OpenGL.glEnd();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 5890, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
    }
    
    public void method3639(int i, int i_16_, int i_17_, int i_18_, int i_19_,
			   int i_20_) {
	if (((Class103_Sub1) ((Class168_Sub3) this).aClass103_Sub1_9941)
	    .aBool9043) {
	    int[] is = ((Class168_Sub3) this).aClass103_Sub1_9941
			   .method2251(i_19_, i_20_, i_17_, i_18_);
	    if (is != null) {
		for (int i_21_ = 0; i_21_ < is.length; i_21_++)
		    is[i_21_] |= ~0xffffff;
		method16231(i, i_16_, i_17_, i_18_, is, 0, i_17_);
	    }
	} else
	    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
		.method16905(i, i_16_, i_17_, i_18_, i_19_, i_20_);
    }
    
    public int method3631() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		.anInt10699);
    }
    
    public int method64() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699
		+ ((Class168_Sub3) this).anInt9946
		+ ((Class168_Sub3) this).anInt9940);
    }
    
    public int method3606() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		.anInt10703);
    }
    
    public void method3658(int i, int i_22_, int i_23_, int i_24_, int i_25_) {
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method3168(false);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_25_);
	OpenGL.glColor4ub((byte) (i_24_ >> 16), (byte) (i_24_ >> 8),
			  (byte) i_24_, (byte) (i_24_ >> 24));
	i += ((Class168_Sub3) this).anInt9946;
	i_22_ += ((Class168_Sub3) this).anInt9945;
	if (((Class168_Sub3) this).aClass142_Sub4_Sub1_9944 == null) {
	    ((Class168_Sub3) this).aClass103_Sub1_9941
		.method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_23_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_22_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_22_ + (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .anInt10703));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_22_ + (((Class142_Sub4_Sub1)
					(((Class168_Sub3) this)
					 .aClass142_Sub4_Sub1_9942))
				       .anInt10703));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_22_);
	    OpenGL.glEnd();
	} else {
	    method16233(i_23_);
	    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9944.method3168(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_22_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_22_ + (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .anInt10703));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_22_ + (((Class142_Sub4_Sub1)
					(((Class168_Sub3) this)
					 .aClass142_Sub4_Sub1_9942))
				       .anInt10703));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_22_);
	    OpenGL.glEnd();
	    method16232();
	}
    }
    
    void method3648(float f, float f_26_, float f_27_, float f_28_,
		    float f_29_, float f_30_, int i, int i_31_, int i_32_,
		    int i_33_) {
	if (((Class168_Sub3) this).aBool9947) {
	    float f_34_ = (float) method64();
	    float f_35_ = (float) method3616();
	    float f_36_ = (f_27_ - f) / f_34_;
	    float f_37_ = (f_28_ - f_26_) / f_34_;
	    float f_38_ = (f_29_ - f) / f_35_;
	    float f_39_ = (f_30_ - f_26_) / f_35_;
	    float f_40_ = f_38_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_41_ = f_39_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_42_ = f_36_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_43_ = f_37_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_44_ = -f_36_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_45_ = -f_37_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_46_ = -f_38_ * (float) ((Class168_Sub3) this).anInt9948;
	    float f_47_ = -f_39_ * (float) ((Class168_Sub3) this).anInt9948;
	    f = f + f_42_ + f_40_;
	    f_26_ = f_26_ + f_43_ + f_41_;
	    f_27_ = f_27_ + f_44_ + f_40_;
	    f_28_ = f_28_ + f_45_ + f_41_;
	    f_29_ = f_29_ + f_42_ + f_46_;
	    f_30_ = f_30_ + f_43_ + f_47_;
	}
	float f_48_ = f_29_ + (f_27_ - f);
	float f_49_ = f_28_ + (f_30_ - f_26_);
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method3168((i_33_ & 0x1) != 0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_32_);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i);
	OpenGL.glColor4ub((byte) (i_31_ >> 16), (byte) (i_31_ >> 8),
			  (byte) i_31_, (byte) (i_31_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F,
			    (((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10700));
	OpenGL.glVertex2f(f, f_26_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_29_, f_30_);
	OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10701),
			    0.0F);
	OpenGL.glVertex2f(f_48_, f_49_);
	OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10701),
			    (((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10700));
	OpenGL.glVertex2f(f_27_, f_28_);
	OpenGL.glEnd();
    }
    
    public void method3675(int i, int i_50_, int i_51_, int i_52_, int i_53_,
			   int i_54_) {
	if (((Class103_Sub1) ((Class168_Sub3) this).aClass103_Sub1_9941)
	    .aBool9043) {
	    int[] is = ((Class168_Sub3) this).aClass103_Sub1_9941
			   .method2251(i_53_, i_54_, i_51_, i_52_);
	    if (is != null) {
		for (int i_55_ = 0; i_55_ < is.length; i_55_++)
		    is[i_55_] |= ~0xffffff;
		method16231(i, i_50_, i_51_, i_52_, is, 0, i_51_);
	    }
	} else
	    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
		.method16905(i, i_50_, i_51_, i_52_, i_53_, i_54_);
    }
    
    public void method3610(int i, int i_56_, int i_57_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9944
	    = (Class142_Sub4_Sub1.method16948
	       (((Class168_Sub3) this).aClass103_Sub1_9941, i, i_56_,
		((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699,
		((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10703));
	((Class168_Sub3) this).anInt9943 = i_57_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    void method16231(int i, int i_58_, int i_59_, int i_60_, int[] is,
		     int i_61_, int i_62_) {
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method16904(i, i_58_, i_59_, i_60_, is, i_61_, i_62_, true);
    }
    
    public Interface4 method3608() {
	return ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method16902(0);
    }
    
    void method16232() {
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(8448, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15352(0, 5890, 770);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34168, 768);
    }
    
    public void method3666(int i, int i_63_, int i_64_, int i_65_, int i_66_) {
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method3168(false);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_66_);
	OpenGL.glColor4ub((byte) (i_65_ >> 16), (byte) (i_65_ >> 8),
			  (byte) i_65_, (byte) (i_65_ >> 24));
	i += ((Class168_Sub3) this).anInt9946;
	i_63_ += ((Class168_Sub3) this).anInt9945;
	if (((Class168_Sub3) this).aClass142_Sub4_Sub1_9944 == null) {
	    ((Class168_Sub3) this).aClass103_Sub1_9941
		.method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_64_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_63_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_63_ + (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .anInt10703));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_63_ + (((Class142_Sub4_Sub1)
					(((Class168_Sub3) this)
					 .aClass142_Sub4_Sub1_9942))
				       .anInt10703));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_63_);
	    OpenGL.glEnd();
	} else {
	    method16233(i_64_);
	    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9944.method3168(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_63_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_63_ + (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .anInt10703));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_63_ + (((Class142_Sub4_Sub1)
					(((Class168_Sub3) this)
					 .aClass142_Sub4_Sub1_9942))
				       .anInt10703));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_63_);
	    OpenGL.glEnd();
	    method16232();
	}
    }
    
    public void method3679(int i, int i_67_, Class135 class135, int i_68_,
			   int i_69_) {
	Class135_Sub3 class135_sub3 = (Class135_Sub3) class135;
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = ((Class135_Sub3) class135_sub3).aClass142_Sub4_Sub1_10030;
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method3168(false);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(class142_sub4_sub1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(7681, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(1);
	i += ((Class168_Sub3) this).anInt9946;
	i_67_ += ((Class168_Sub3) this).anInt9945;
	int i_70_
	    = i + ((Class142_Sub4_Sub1)
		   ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699;
	int i_71_ = i_67_ + (((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .anInt10703);
	float f
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_72_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	float f_73_ = (float) (i - i_68_) * f;
	float f_74_ = (float) (i_70_ - i_68_) * f;
	float f_75_ = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
		       - (float) (i_67_ - i_69_) * f_72_);
	float f_76_ = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
		       - (float) (i_71_ - i_69_) * f_72_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_73_, f_75_);
	OpenGL.glVertex2i(i, i_67_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_73_, f_76_);
	OpenGL.glVertex2i(i, i_67_ + ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).anInt10703);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_74_, f_76_);
	OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
			       (((Class168_Sub3) this)
				.aClass142_Sub4_Sub1_9942)).anInt10699,
			  i_67_ + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10703);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_74_, f_75_);
	OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
			       (((Class168_Sub3) this)
				.aClass142_Sub4_Sub1_9942)).anInt10699,
			  i_67_);
	OpenGL.glEnd();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 5890, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
    }
    
    public Interface4 method3654() {
	return ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method16902(0);
    }
    
    public void method3618(int i, int i_77_, int i_78_, int i_79_, int i_80_,
			   int i_81_, int i_82_) {
	int i_83_ = i + i_78_;
	int i_84_ = i_77_ + i_79_;
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method3168(false);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_82_);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_80_);
	OpenGL.glColor4ub((byte) (i_81_ >> 16), (byte) (i_81_ >> 8),
			  (byte) i_81_, (byte) (i_81_ >> 24));
	if (((Class142_Sub4_Sub1)
	     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).aBool10702
	    && !((Class168_Sub3) this).aBool9947
	    && i_79_ >= (((Class142_Sub4_Sub1)
			  ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			 .anInt10703)
	    && i_78_ >= (((Class142_Sub4_Sub1)
			  ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			 .anInt10699)) {
	    float f
		= ((((Class142_Sub4_Sub1)
		     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		    .aFloat10700)
		   * (float) i_79_
		   / (float) (((Class142_Sub4_Sub1)
			       ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			      .anInt10703));
	    float f_85_
		= ((((Class142_Sub4_Sub1)
		     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		    .aFloat10701)
		   * (float) i_78_
		   / (float) (((Class142_Sub4_Sub1)
			       ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			      .anInt10699));
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_77_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_84_);
	    OpenGL.glTexCoord2f(f_85_, 0.0F);
	    OpenGL.glVertex2i(i_83_, i_84_);
	    OpenGL.glTexCoord2f(f_85_, f);
	    OpenGL.glVertex2i(i_83_, i_77_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) ((Class168_Sub3) this).anInt9946,
				(float) ((Class168_Sub3) this).anInt9945,
				0.0F);
	    int i_86_ = method64();
	    int i_87_ = method3616();
	    int i_88_
		= i_77_ + (((Class142_Sub4_Sub1)
			    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			   .anInt10703);
	    OpenGL.glBegin(7);
	    int i_89_ = i_77_;
	    for (/**/; i_88_ <= i_84_; i_88_ += i_87_) {
		int i_90_
		    = i + (((Class142_Sub4_Sub1)
			    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			   .anInt10699);
		int i_91_ = i;
		while (i_90_ <= i_83_) {
		    OpenGL.glTexCoord2f(0.0F, (((Class142_Sub4_Sub1)
						(((Class168_Sub3) this)
						 .aClass142_Sub4_Sub1_9942))
					       .aFloat10700));
		    OpenGL.glVertex2i(i_91_, i_89_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_91_, i_88_);
		    OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10701),
					0.0F);
		    OpenGL.glVertex2i(i_90_, i_88_);
		    OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10701),
					(((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10700));
		    OpenGL.glVertex2i(i_90_, i_89_);
		    i_90_ += i_86_;
		    i_91_ += i_86_;
		}
		if (i_91_ < i_83_) {
		    float f
			= ((((Class142_Sub4_Sub1)
			     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			    .aFloat10701)
			   * (float) (i_83_ - i_91_)
			   / (float) ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).anInt10699);
		    OpenGL.glTexCoord2f(0.0F, (((Class142_Sub4_Sub1)
						(((Class168_Sub3) this)
						 .aClass142_Sub4_Sub1_9942))
					       .aFloat10700));
		    OpenGL.glVertex2i(i_91_, i_89_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_91_, i_88_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_83_, i_88_);
		    OpenGL.glTexCoord2f(f, (((Class142_Sub4_Sub1)
					     (((Class168_Sub3) this)
					      .aClass142_Sub4_Sub1_9942))
					    .aFloat10700));
		    OpenGL.glVertex2i(i_83_, i_89_);
		}
		i_89_ += i_87_;
	    }
	    if (i_89_ < i_84_) {
		float f = ((((Class142_Sub4_Sub1)
			     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			    .aFloat10700)
			   * (float) (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942)).anInt10703
				      - (i_84_ - i_89_))
			   / (float) ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).anInt10703);
		int i_92_
		    = i + (((Class142_Sub4_Sub1)
			    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			   .anInt10699);
		int i_93_ = i;
		while (i_92_ <= i_83_) {
		    OpenGL.glTexCoord2f(0.0F, (((Class142_Sub4_Sub1)
						(((Class168_Sub3) this)
						 .aClass142_Sub4_Sub1_9942))
					       .aFloat10700));
		    OpenGL.glVertex2i(i_93_, i_89_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_93_, i_84_);
		    OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10701),
					f);
		    OpenGL.glVertex2i(i_92_, i_84_);
		    OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10701),
					(((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10700));
		    OpenGL.glVertex2i(i_92_, i_89_);
		    i_92_ += i_86_;
		    i_93_ += i_86_;
		}
		if (i_93_ < i_83_) {
		    float f_94_
			= ((((Class142_Sub4_Sub1)
			     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			    .aFloat10701)
			   * (float) (i_83_ - i_93_)
			   / (float) ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).anInt10699);
		    OpenGL.glTexCoord2f(0.0F, (((Class142_Sub4_Sub1)
						(((Class168_Sub3) this)
						 .aClass142_Sub4_Sub1_9942))
					       .aFloat10700));
		    OpenGL.glVertex2i(i_93_, i_89_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_93_, i_84_);
		    OpenGL.glTexCoord2f(f_94_, f);
		    OpenGL.glVertex2i(i_83_, i_84_);
		    OpenGL.glTexCoord2f(f_94_, (((Class142_Sub4_Sub1)
						 (((Class168_Sub3) this)
						  .aClass142_Sub4_Sub1_9942))
						.aFloat10700));
		    OpenGL.glVertex2i(i_83_, i_89_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    void method3627(float f, float f_95_, float f_96_, float f_97_,
		    float f_98_, float f_99_, int i, int i_100_, int i_101_,
		    int i_102_) {
	if (((Class168_Sub3) this).aBool9947) {
	    float f_103_ = (float) method64();
	    float f_104_ = (float) method3616();
	    float f_105_ = (f_96_ - f) / f_103_;
	    float f_106_ = (f_97_ - f_95_) / f_103_;
	    float f_107_ = (f_98_ - f) / f_104_;
	    float f_108_ = (f_99_ - f_95_) / f_104_;
	    float f_109_ = f_107_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_110_ = f_108_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_111_ = f_105_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_112_ = f_106_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_113_ = -f_105_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_114_ = -f_106_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_115_ = -f_107_ * (float) ((Class168_Sub3) this).anInt9948;
	    float f_116_ = -f_108_ * (float) ((Class168_Sub3) this).anInt9948;
	    f = f + f_111_ + f_109_;
	    f_95_ = f_95_ + f_112_ + f_110_;
	    f_96_ = f_96_ + f_113_ + f_109_;
	    f_97_ = f_97_ + f_114_ + f_110_;
	    f_98_ = f_98_ + f_111_ + f_115_;
	    f_99_ = f_99_ + f_112_ + f_116_;
	}
	float f_117_ = f_98_ + (f_96_ - f);
	float f_118_ = f_97_ + (f_99_ - f_95_);
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method3168((i_102_ & 0x1) != 0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_101_);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i);
	OpenGL.glColor4ub((byte) (i_100_ >> 16), (byte) (i_100_ >> 8),
			  (byte) i_100_, (byte) (i_100_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F,
			    (((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10700));
	OpenGL.glVertex2f(f, f_95_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_98_, f_99_);
	OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10701),
			    0.0F);
	OpenGL.glVertex2f(f_117_, f_118_);
	OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10701),
			    (((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10700));
	OpenGL.glVertex2f(f_96_, f_97_);
	OpenGL.glEnd();
    }
    
    void method3647(float f, float f_119_, float f_120_, float f_121_,
		    float f_122_, float f_123_, int i, Class135 class135,
		    int i_124_, int i_125_) {
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = (((Class135_Sub3) (Class135_Sub3) class135)
	       .aClass142_Sub4_Sub1_10030);
	if (((Class168_Sub3) this).aBool9947) {
	    float f_126_ = (float) method64();
	    float f_127_ = (float) method3616();
	    float f_128_ = (f_120_ - f) / f_126_;
	    float f_129_ = (f_121_ - f_119_) / f_126_;
	    float f_130_ = (f_122_ - f) / f_127_;
	    float f_131_ = (f_123_ - f_119_) / f_127_;
	    float f_132_ = f_130_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_133_ = f_131_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_134_ = f_128_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_135_ = f_129_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_136_ = -f_128_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_137_ = -f_129_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_138_ = -f_130_ * (float) ((Class168_Sub3) this).anInt9948;
	    float f_139_ = -f_131_ * (float) ((Class168_Sub3) this).anInt9948;
	    f = f + f_134_ + f_132_;
	    f_119_ = f_119_ + f_135_ + f_133_;
	    f_120_ = f_120_ + f_136_ + f_132_;
	    f_121_ = f_121_ + f_137_ + f_133_;
	    f_122_ = f_122_ + f_134_ + f_138_;
	    f_123_ = f_123_ + f_135_ + f_139_;
	}
	float f_140_ = f_122_ + (f_120_ - f);
	float f_141_ = f_121_ + (f_123_ - f_119_);
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method3168((i & 0x1) != 0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(class142_sub4_sub1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(7681, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(1);
	float f_142_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_143_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_142_ * (f - (float) i_124_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_143_ * (f_119_ - (float) i_125_)));
	OpenGL.glVertex2f(f, f_119_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_142_ * (f_122_ - (float) i_124_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_143_ * (f_123_ - (float) i_125_)));
	OpenGL.glVertex2f(f_122_, f_123_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_142_ * (f_140_ - (float) i_124_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_143_ * (f_141_ - (float) i_125_)));
	OpenGL.glVertex2f(f_140_, f_141_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_142_ * (f_120_ - (float) i_124_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_143_ * (f_121_ - (float) i_125_)));
	OpenGL.glVertex2f(f_120_, f_121_);
	OpenGL.glEnd();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 5890, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
    }
    
    public int method3645() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10703
		+ ((Class168_Sub3) this).anInt9945
		+ ((Class168_Sub3) this).anInt9948);
    }
    
    public void method3635(int i, int i_144_, int i_145_, int i_146_,
			   int i_147_) {
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method3168(false);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_147_);
	OpenGL.glColor4ub((byte) (i_146_ >> 16), (byte) (i_146_ >> 8),
			  (byte) i_146_, (byte) (i_146_ >> 24));
	i += ((Class168_Sub3) this).anInt9946;
	i_144_ += ((Class168_Sub3) this).anInt9945;
	if (((Class168_Sub3) this).aClass142_Sub4_Sub1_9944 == null) {
	    ((Class168_Sub3) this).aClass103_Sub1_9941
		.method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_145_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_144_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_144_ + (((Class142_Sub4_Sub1)
					    (((Class168_Sub3) this)
					     .aClass142_Sub4_Sub1_9942))
					   .anInt10703));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_144_ + (((Class142_Sub4_Sub1)
					 (((Class168_Sub3) this)
					  .aClass142_Sub4_Sub1_9942))
					.anInt10703));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_144_);
	    OpenGL.glEnd();
	} else {
	    method16233(i_145_);
	    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9944.method3168(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_144_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_144_ + (((Class142_Sub4_Sub1)
					    (((Class168_Sub3) this)
					     .aClass142_Sub4_Sub1_9942))
					   .anInt10703));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_144_ + (((Class142_Sub4_Sub1)
					 (((Class168_Sub3) this)
					  .aClass142_Sub4_Sub1_9942))
					.anInt10703));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
				   (((Class168_Sub3) this)
				    .aClass142_Sub4_Sub1_9942)).anInt10699,
			      i_144_);
	    OpenGL.glEnd();
	    method16232();
	}
    }
    
    public void method3653(int i, int i_148_, int i_149_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9944
	    = (Class142_Sub4_Sub1.method16948
	       (((Class168_Sub3) this).aClass103_Sub1_9941, i, i_148_,
		((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699,
		((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10703));
	((Class168_Sub3) this).anInt9943 = i_149_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    public Interface4 method3636() {
	return ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method16902(0);
    }
    
    public Interface4 method3633() {
	return ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method16902(0);
    }
    
    public int method3616() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10703
		+ ((Class168_Sub3) this).anInt9945
		+ ((Class168_Sub3) this).anInt9948);
    }
    
    public Interface4 method3634() {
	return ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method16902(0);
    }
    
    void method16233(int i) {
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180
	    (((Class168_Sub3) this).aClass103_Sub1_9941.method15179(i), 7681);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34167, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15352(0, 34168, 770);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9944);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(34479, 7681);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34166, 768);
	if (((Class168_Sub3) this).anInt9943 == 0)
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15182(1.0F, 0.5F,
								   0.5F, 0.0F);
	else if (((Class168_Sub3) this).anInt9943 == 1)
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15182(0.5F, 1.0F,
								   0.5F, 0.0F);
	else if (((Class168_Sub3) this).anInt9943 == 2)
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15182(0.5F, 0.5F,
								   1.0F, 0.0F);
	else if (((Class168_Sub3) this).anInt9943 == 3)
	    ((Class168_Sub3) this).aClass103_Sub1_9941
		.method15182(128.5F, 128.5F, 128.5F, 0.0F);
    }
    
    void method3611(float f, float f_150_, float f_151_, float f_152_,
		    float f_153_, float f_154_, int i, int i_155_, int i_156_,
		    int i_157_) {
	if (((Class168_Sub3) this).aBool9947) {
	    float f_158_ = (float) method64();
	    float f_159_ = (float) method3616();
	    float f_160_ = (f_151_ - f) / f_158_;
	    float f_161_ = (f_152_ - f_150_) / f_158_;
	    float f_162_ = (f_153_ - f) / f_159_;
	    float f_163_ = (f_154_ - f_150_) / f_159_;
	    float f_164_ = f_162_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_165_ = f_163_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_166_ = f_160_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_167_ = f_161_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_168_ = -f_160_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_169_ = -f_161_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_170_ = -f_162_ * (float) ((Class168_Sub3) this).anInt9948;
	    float f_171_ = -f_163_ * (float) ((Class168_Sub3) this).anInt9948;
	    f = f + f_166_ + f_164_;
	    f_150_ = f_150_ + f_167_ + f_165_;
	    f_151_ = f_151_ + f_168_ + f_164_;
	    f_152_ = f_152_ + f_169_ + f_165_;
	    f_153_ = f_153_ + f_166_ + f_170_;
	    f_154_ = f_154_ + f_167_ + f_171_;
	}
	float f_172_ = f_153_ + (f_151_ - f);
	float f_173_ = f_152_ + (f_154_ - f_150_);
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method3168((i_157_ & 0x1) != 0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_156_);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i);
	OpenGL.glColor4ub((byte) (i_155_ >> 16), (byte) (i_155_ >> 8),
			  (byte) i_155_, (byte) (i_155_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F,
			    (((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10700));
	OpenGL.glVertex2f(f, f_150_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_153_, f_154_);
	OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10701),
			    0.0F);
	OpenGL.glVertex2f(f_172_, f_173_);
	OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10701),
			    (((Class142_Sub4_Sub1)
			      ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			     .aFloat10700));
	OpenGL.glVertex2f(f_151_, f_152_);
	OpenGL.glEnd();
    }
    
    public void method3637(int i, int i_174_, Class135 class135, int i_175_,
			   int i_176_) {
	Class135_Sub3 class135_sub3 = (Class135_Sub3) class135;
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = ((Class135_Sub3) class135_sub3).aClass142_Sub4_Sub1_10030;
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method3168(false);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(class142_sub4_sub1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(7681, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(1);
	i += ((Class168_Sub3) this).anInt9946;
	i_174_ += ((Class168_Sub3) this).anInt9945;
	int i_177_
	    = i + ((Class142_Sub4_Sub1)
		   ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699;
	int i_178_
	    = (i_174_
	       + ((Class142_Sub4_Sub1)
		  ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10703);
	float f
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_179_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	float f_180_ = (float) (i - i_175_) * f;
	float f_181_ = (float) (i_177_ - i_175_) * f;
	float f_182_ = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
			- (float) (i_174_ - i_176_) * f_179_);
	float f_183_ = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
			- (float) (i_178_ - i_176_) * f_179_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_180_, f_182_);
	OpenGL.glVertex2i(i, i_174_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_180_, f_183_);
	OpenGL.glVertex2i(i,
			  i_174_ + ((Class142_Sub4_Sub1)
				    (((Class168_Sub3) this)
				     .aClass142_Sub4_Sub1_9942)).anInt10703);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_181_, f_183_);
	OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
			       (((Class168_Sub3) this)
				.aClass142_Sub4_Sub1_9942)).anInt10699,
			  i_174_ + ((Class142_Sub4_Sub1)
				    (((Class168_Sub3) this)
				     .aClass142_Sub4_Sub1_9942)).anInt10703);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_181_, f_182_);
	OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
			       (((Class168_Sub3) this)
				.aClass142_Sub4_Sub1_9942)).anInt10699,
			  i_174_);
	OpenGL.glEnd();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 5890, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
    }
    
    Class168_Sub3(Class103_Sub1 class103_sub1, int i, int i_184_,
		  boolean bool) {
	((Class168_Sub3) this).anInt9945 = 0;
	((Class168_Sub3) this).anInt9946 = 0;
	((Class168_Sub3) this).anInt9948 = 0;
	((Class168_Sub3) this).anInt9940 = 0;
	((Class168_Sub3) this).aClass103_Sub1_9941 = class103_sub1;
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    = Class142_Sub4_Sub1.method16949(class103_sub1,
					     (bool ? Class175.aClass175_2110
					      : Class175.aClass175_2111),
					     Class102.aClass102_1440, i,
					     i_184_);
    }
    
    public void method3607(int i, int i_185_, Class135 class135, int i_186_,
			   int i_187_) {
	Class135_Sub3 class135_sub3 = (Class135_Sub3) class135;
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = ((Class135_Sub3) class135_sub3).aClass142_Sub4_Sub1_10030;
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method3168(false);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(class142_sub4_sub1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(7681, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(1);
	i += ((Class168_Sub3) this).anInt9946;
	i_185_ += ((Class168_Sub3) this).anInt9945;
	int i_188_
	    = i + ((Class142_Sub4_Sub1)
		   ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699;
	int i_189_
	    = (i_185_
	       + ((Class142_Sub4_Sub1)
		  ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10703);
	float f
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_190_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	float f_191_ = (float) (i - i_186_) * f;
	float f_192_ = (float) (i_188_ - i_186_) * f;
	float f_193_ = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
			- (float) (i_185_ - i_187_) * f_190_);
	float f_194_ = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
			- (float) (i_189_ - i_187_) * f_190_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_191_, f_193_);
	OpenGL.glVertex2i(i, i_185_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_191_, f_194_);
	OpenGL.glVertex2i(i,
			  i_185_ + ((Class142_Sub4_Sub1)
				    (((Class168_Sub3) this)
				     .aClass142_Sub4_Sub1_9942)).anInt10703);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_192_, f_194_);
	OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
			       (((Class168_Sub3) this)
				.aClass142_Sub4_Sub1_9942)).anInt10699,
			  i_185_ + ((Class142_Sub4_Sub1)
				    (((Class168_Sub3) this)
				     .aClass142_Sub4_Sub1_9942)).anInt10703);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_192_, f_193_);
	OpenGL.glVertex2i(i + ((Class142_Sub4_Sub1)
			       (((Class168_Sub3) this)
				.aClass142_Sub4_Sub1_9942)).anInt10699,
			  i_185_);
	OpenGL.glEnd();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 5890, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
    }
    
    void method3640(int i, int i_195_, int i_196_, int i_197_, int i_198_,
		    int i_199_, int i_200_, int i_201_) {
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method3168((i_201_ & 0x1) != 0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_200_);
	OpenGL.glColor4ub((byte) (i_199_ >> 16), (byte) (i_199_ >> 8),
			  (byte) i_199_, (byte) (i_199_ >> 24));
	if (((Class168_Sub3) this).aBool9947) {
	    float f = (float) i_196_ / (float) method64();
	    float f_202_ = (float) i_197_ / (float) method3616();
	    float f_203_
		= (float) i + (float) ((Class168_Sub3) this).anInt9946 * f;
	    float f_204_
		= ((float) i_195_
		   + (float) ((Class168_Sub3) this).anInt9945 * f_202_);
	    float f_205_
		= (f_203_
		   + (float) (((Class142_Sub4_Sub1)
			       ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			      .anInt10699) * f);
	    float f_206_
		= (f_204_
		   + (float) (((Class142_Sub4_Sub1)
			       ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			      .anInt10703) * f_202_);
	    if (((Class168_Sub3) this).aClass142_Sub4_Sub1_9944 == null) {
		((Class168_Sub3) this).aClass103_Sub1_9941.method15177
		    (((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
		((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_198_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_203_, f_204_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_203_, f_206_);
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    0.0F);
		OpenGL.glVertex2f(f_205_, f_206_);
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_205_, f_204_);
		OpenGL.glEnd();
	    } else {
		method16233(i_198_);
		((Class168_Sub3) this).aClass142_Sub4_Sub1_9944
		    .method3168(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .aFloat10700));
		OpenGL.glTexCoord2f(0.0F,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_203_, f_204_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_203_, f_206_);
		OpenGL.glMultiTexCoord2f(33985, (((Class142_Sub4_Sub1)
						  (((Class168_Sub3) this)
						   .aClass142_Sub4_Sub1_9942))
						 .aFloat10701), 0.0F);
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    0.0F);
		OpenGL.glVertex2f(f_205_, f_206_);
		OpenGL.glMultiTexCoord2f(33985,
					 (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .aFloat10701),
					 (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .aFloat10700));
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_205_, f_204_);
		OpenGL.glEnd();
		method16232();
	    }
	} else if (((Class168_Sub3) this).aClass142_Sub4_Sub1_9944 == null) {
	    ((Class168_Sub3) this).aClass103_Sub1_9941
		.method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_198_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_195_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_195_ + i_197_);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + i_196_, i_195_ + i_197_);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + i_196_, i_195_);
	    OpenGL.glEnd();
	} else {
	    method16233(i_198_);
	    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9944.method3168(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_195_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_195_ + i_197_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + i_196_, i_195_ + i_197_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + i_196_, i_195_);
	    OpenGL.glEnd();
	    method16232();
	}
    }
    
    void method3641(int i, int i_207_, int i_208_, int i_209_, int i_210_,
		    int i_211_, int i_212_, int i_213_) {
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method3168((i_213_ & 0x1) != 0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_212_);
	OpenGL.glColor4ub((byte) (i_211_ >> 16), (byte) (i_211_ >> 8),
			  (byte) i_211_, (byte) (i_211_ >> 24));
	if (((Class168_Sub3) this).aBool9947) {
	    float f = (float) i_208_ / (float) method64();
	    float f_214_ = (float) i_209_ / (float) method3616();
	    float f_215_
		= (float) i + (float) ((Class168_Sub3) this).anInt9946 * f;
	    float f_216_
		= ((float) i_207_
		   + (float) ((Class168_Sub3) this).anInt9945 * f_214_);
	    float f_217_
		= (f_215_
		   + (float) (((Class142_Sub4_Sub1)
			       ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			      .anInt10699) * f);
	    float f_218_
		= (f_216_
		   + (float) (((Class142_Sub4_Sub1)
			       ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			      .anInt10703) * f_214_);
	    if (((Class168_Sub3) this).aClass142_Sub4_Sub1_9944 == null) {
		((Class168_Sub3) this).aClass103_Sub1_9941.method15177
		    (((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
		((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_210_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_215_, f_216_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_215_, f_218_);
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    0.0F);
		OpenGL.glVertex2f(f_217_, f_218_);
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_217_, f_216_);
		OpenGL.glEnd();
	    } else {
		method16233(i_210_);
		((Class168_Sub3) this).aClass142_Sub4_Sub1_9944
		    .method3168(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .aFloat10700));
		OpenGL.glTexCoord2f(0.0F,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_215_, f_216_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_215_, f_218_);
		OpenGL.glMultiTexCoord2f(33985, (((Class142_Sub4_Sub1)
						  (((Class168_Sub3) this)
						   .aClass142_Sub4_Sub1_9942))
						 .aFloat10701), 0.0F);
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    0.0F);
		OpenGL.glVertex2f(f_217_, f_218_);
		OpenGL.glMultiTexCoord2f(33985,
					 (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .aFloat10701),
					 (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .aFloat10700));
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_217_, f_216_);
		OpenGL.glEnd();
		method16232();
	    }
	} else if (((Class168_Sub3) this).aClass142_Sub4_Sub1_9944 == null) {
	    ((Class168_Sub3) this).aClass103_Sub1_9941
		.method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_210_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_207_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_207_ + i_209_);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + i_208_, i_207_ + i_209_);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + i_208_, i_207_);
	    OpenGL.glEnd();
	} else {
	    method16233(i_210_);
	    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9944.method3168(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_207_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_207_ + i_209_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + i_208_, i_207_ + i_209_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + i_208_, i_207_);
	    OpenGL.glEnd();
	    method16232();
	}
    }
    
    void method3670(int i, int i_219_, int i_220_, int i_221_, int i_222_,
		    int i_223_, int i_224_, int i_225_) {
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method3168((i_225_ & 0x1) != 0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_224_);
	OpenGL.glColor4ub((byte) (i_223_ >> 16), (byte) (i_223_ >> 8),
			  (byte) i_223_, (byte) (i_223_ >> 24));
	if (((Class168_Sub3) this).aBool9947) {
	    float f = (float) i_220_ / (float) method64();
	    float f_226_ = (float) i_221_ / (float) method3616();
	    float f_227_
		= (float) i + (float) ((Class168_Sub3) this).anInt9946 * f;
	    float f_228_
		= ((float) i_219_
		   + (float) ((Class168_Sub3) this).anInt9945 * f_226_);
	    float f_229_
		= (f_227_
		   + (float) (((Class142_Sub4_Sub1)
			       ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			      .anInt10699) * f);
	    float f_230_
		= (f_228_
		   + (float) (((Class142_Sub4_Sub1)
			       ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			      .anInt10703) * f_226_);
	    if (((Class168_Sub3) this).aClass142_Sub4_Sub1_9944 == null) {
		((Class168_Sub3) this).aClass103_Sub1_9941.method15177
		    (((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
		((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_222_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_227_, f_228_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_227_, f_230_);
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    0.0F);
		OpenGL.glVertex2f(f_229_, f_230_);
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_229_, f_228_);
		OpenGL.glEnd();
	    } else {
		method16233(i_222_);
		((Class168_Sub3) this).aClass142_Sub4_Sub1_9944
		    .method3168(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .aFloat10700));
		OpenGL.glTexCoord2f(0.0F,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_227_, f_228_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_227_, f_230_);
		OpenGL.glMultiTexCoord2f(33985, (((Class142_Sub4_Sub1)
						  (((Class168_Sub3) this)
						   .aClass142_Sub4_Sub1_9942))
						 .aFloat10701), 0.0F);
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    0.0F);
		OpenGL.glVertex2f(f_229_, f_230_);
		OpenGL.glMultiTexCoord2f(33985,
					 (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .aFloat10701),
					 (((Class142_Sub4_Sub1)
					   (((Class168_Sub3) this)
					    .aClass142_Sub4_Sub1_9942))
					  .aFloat10700));
		OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10701,
				    ((Class142_Sub4_Sub1)
				     (((Class168_Sub3) this)
				      .aClass142_Sub4_Sub1_9942)).aFloat10700);
		OpenGL.glVertex2f(f_229_, f_228_);
		OpenGL.glEnd();
		method16232();
	    }
	} else if (((Class168_Sub3) this).aClass142_Sub4_Sub1_9944 == null) {
	    ((Class168_Sub3) this).aClass103_Sub1_9941
		.method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_222_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_219_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_219_ + i_221_);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + i_220_, i_219_ + i_221_);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + i_220_, i_219_);
	    OpenGL.glEnd();
	} else {
	    method16233(i_222_);
	    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9944.method3168(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(0.0F,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i, i_219_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_219_ + i_221_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				0.0F);
	    OpenGL.glVertex2i(i + i_220_, i_219_ + i_221_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).aFloat10701,
				     (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942))
				      .aFloat10700));
	    OpenGL.glTexCoord2f(((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10701,
				((Class142_Sub4_Sub1)
				 (((Class168_Sub3) this)
				  .aClass142_Sub4_Sub1_9942)).aFloat10700);
	    OpenGL.glVertex2i(i + i_220_, i_219_);
	    OpenGL.glEnd();
	    method16232();
	}
    }
    
    public void method3643(int[] is) {
	is[0] = ((Class168_Sub3) this).anInt9946;
	is[1] = ((Class168_Sub3) this).anInt9945;
	is[2] = ((Class168_Sub3) this).anInt9940;
	is[3] = ((Class168_Sub3) this).anInt9948;
    }
    
    public void method3602(int i, int i_231_, int i_232_, int i_233_) {
	((Class168_Sub3) this).anInt9946 = i;
	((Class168_Sub3) this).anInt9945 = i_231_;
	((Class168_Sub3) this).anInt9940 = i_232_;
	((Class168_Sub3) this).anInt9948 = i_233_;
	((Class168_Sub3) this).aBool9947
	    = (((Class168_Sub3) this).anInt9946 != 0
	       || ((Class168_Sub3) this).anInt9945 != 0
	       || ((Class168_Sub3) this).anInt9940 != 0
	       || ((Class168_Sub3) this).anInt9948 != 0);
    }
    
    public int method444() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699
		+ ((Class168_Sub3) this).anInt9946
		+ ((Class168_Sub3) this).anInt9940);
    }
    
    public int method445() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699
		+ ((Class168_Sub3) this).anInt9946
		+ ((Class168_Sub3) this).anInt9940);
    }
    
    public void method3613(int i, int i_234_, int i_235_, int i_236_,
			   int i_237_, int i_238_, int i_239_) {
	int i_240_ = i + i_235_;
	int i_241_ = i_234_ + i_236_;
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942.method3168(false);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(i_239_);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(i_237_);
	OpenGL.glColor4ub((byte) (i_238_ >> 16), (byte) (i_238_ >> 8),
			  (byte) i_238_, (byte) (i_238_ >> 24));
	if (((Class142_Sub4_Sub1)
	     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).aBool10702
	    && !((Class168_Sub3) this).aBool9947
	    && i_236_ >= (((Class142_Sub4_Sub1)
			   ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			  .anInt10703)
	    && i_235_ >= (((Class142_Sub4_Sub1)
			   ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			  .anInt10699)) {
	    float f
		= ((((Class142_Sub4_Sub1)
		     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		    .aFloat10700)
		   * (float) i_236_
		   / (float) (((Class142_Sub4_Sub1)
			       ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			      .anInt10703));
	    float f_242_
		= ((((Class142_Sub4_Sub1)
		     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		    .aFloat10701)
		   * (float) i_235_
		   / (float) (((Class142_Sub4_Sub1)
			       ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			      .anInt10699));
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_234_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_241_);
	    OpenGL.glTexCoord2f(f_242_, 0.0F);
	    OpenGL.glVertex2i(i_240_, i_241_);
	    OpenGL.glTexCoord2f(f_242_, f);
	    OpenGL.glVertex2i(i_240_, i_234_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) ((Class168_Sub3) this).anInt9946,
				(float) ((Class168_Sub3) this).anInt9945,
				0.0F);
	    int i_243_ = method64();
	    int i_244_ = method3616();
	    int i_245_
		= i_234_ + (((Class142_Sub4_Sub1)
			     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			    .anInt10703);
	    OpenGL.glBegin(7);
	    int i_246_ = i_234_;
	    for (/**/; i_245_ <= i_241_; i_245_ += i_244_) {
		int i_247_
		    = i + (((Class142_Sub4_Sub1)
			    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			   .anInt10699);
		int i_248_ = i;
		while (i_247_ <= i_240_) {
		    OpenGL.glTexCoord2f(0.0F, (((Class142_Sub4_Sub1)
						(((Class168_Sub3) this)
						 .aClass142_Sub4_Sub1_9942))
					       .aFloat10700));
		    OpenGL.glVertex2i(i_248_, i_246_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_248_, i_245_);
		    OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10701),
					0.0F);
		    OpenGL.glVertex2i(i_247_, i_245_);
		    OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10701),
					(((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10700));
		    OpenGL.glVertex2i(i_247_, i_246_);
		    i_247_ += i_243_;
		    i_248_ += i_243_;
		}
		if (i_248_ < i_240_) {
		    float f
			= ((((Class142_Sub4_Sub1)
			     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			    .aFloat10701)
			   * (float) (i_240_ - i_248_)
			   / (float) ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).anInt10699);
		    OpenGL.glTexCoord2f(0.0F, (((Class142_Sub4_Sub1)
						(((Class168_Sub3) this)
						 .aClass142_Sub4_Sub1_9942))
					       .aFloat10700));
		    OpenGL.glVertex2i(i_248_, i_246_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_248_, i_245_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_240_, i_245_);
		    OpenGL.glTexCoord2f(f, (((Class142_Sub4_Sub1)
					     (((Class168_Sub3) this)
					      .aClass142_Sub4_Sub1_9942))
					    .aFloat10700));
		    OpenGL.glVertex2i(i_240_, i_246_);
		}
		i_246_ += i_244_;
	    }
	    if (i_246_ < i_241_) {
		float f = ((((Class142_Sub4_Sub1)
			     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			    .aFloat10700)
			   * (float) (((Class142_Sub4_Sub1)
				       (((Class168_Sub3) this)
					.aClass142_Sub4_Sub1_9942)).anInt10703
				      - (i_241_ - i_246_))
			   / (float) ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).anInt10703);
		int i_249_
		    = i + (((Class142_Sub4_Sub1)
			    ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			   .anInt10699);
		int i_250_ = i;
		while (i_249_ <= i_240_) {
		    OpenGL.glTexCoord2f(0.0F, (((Class142_Sub4_Sub1)
						(((Class168_Sub3) this)
						 .aClass142_Sub4_Sub1_9942))
					       .aFloat10700));
		    OpenGL.glVertex2i(i_250_, i_246_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_250_, i_241_);
		    OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10701),
					f);
		    OpenGL.glVertex2i(i_249_, i_241_);
		    OpenGL.glTexCoord2f((((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10701),
					(((Class142_Sub4_Sub1)
					  (((Class168_Sub3) this)
					   .aClass142_Sub4_Sub1_9942))
					 .aFloat10700));
		    OpenGL.glVertex2i(i_249_, i_246_);
		    i_249_ += i_243_;
		    i_250_ += i_243_;
		}
		if (i_250_ < i_240_) {
		    float f_251_
			= ((((Class142_Sub4_Sub1)
			     ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
			    .aFloat10701)
			   * (float) (i_240_ - i_250_)
			   / (float) ((Class142_Sub4_Sub1)
				      (((Class168_Sub3) this)
				       .aClass142_Sub4_Sub1_9942)).anInt10699);
		    OpenGL.glTexCoord2f(0.0F, (((Class142_Sub4_Sub1)
						(((Class168_Sub3) this)
						 .aClass142_Sub4_Sub1_9942))
					       .aFloat10700));
		    OpenGL.glVertex2i(i_250_, i_246_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_250_, i_241_);
		    OpenGL.glTexCoord2f(f_251_, f);
		    OpenGL.glVertex2i(i_240_, i_241_);
		    OpenGL.glTexCoord2f(f_251_, (((Class142_Sub4_Sub1)
						  (((Class168_Sub3) this)
						   .aClass142_Sub4_Sub1_9942))
						 .aFloat10700));
		    OpenGL.glVertex2i(i_240_, i_246_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    public void method3656(int i, int i_252_, int i_253_, int i_254_) {
	((Class168_Sub3) this).anInt9946 = i;
	((Class168_Sub3) this).anInt9945 = i_252_;
	((Class168_Sub3) this).anInt9940 = i_253_;
	((Class168_Sub3) this).anInt9948 = i_254_;
	((Class168_Sub3) this).aBool9947
	    = (((Class168_Sub3) this).anInt9946 != 0
	       || ((Class168_Sub3) this).anInt9945 != 0
	       || ((Class168_Sub3) this).anInt9940 != 0
	       || ((Class168_Sub3) this).anInt9948 != 0);
    }
    
    public int method397() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699
		+ ((Class168_Sub3) this).anInt9946
		+ ((Class168_Sub3) this).anInt9940);
    }
    
    public void method3612(int[] is) {
	is[0] = ((Class168_Sub3) this).anInt9946;
	is[1] = ((Class168_Sub3) this).anInt9945;
	is[2] = ((Class168_Sub3) this).anInt9940;
	is[3] = ((Class168_Sub3) this).anInt9948;
    }
    
    void method3649(float f, float f_255_, float f_256_, float f_257_,
		    float f_258_, float f_259_, int i, Class135 class135,
		    int i_260_, int i_261_) {
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = (((Class135_Sub3) (Class135_Sub3) class135)
	       .aClass142_Sub4_Sub1_10030);
	if (((Class168_Sub3) this).aBool9947) {
	    float f_262_ = (float) method64();
	    float f_263_ = (float) method3616();
	    float f_264_ = (f_256_ - f) / f_262_;
	    float f_265_ = (f_257_ - f_255_) / f_262_;
	    float f_266_ = (f_258_ - f) / f_263_;
	    float f_267_ = (f_259_ - f_255_) / f_263_;
	    float f_268_ = f_266_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_269_ = f_267_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_270_ = f_264_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_271_ = f_265_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_272_ = -f_264_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_273_ = -f_265_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_274_ = -f_266_ * (float) ((Class168_Sub3) this).anInt9948;
	    float f_275_ = -f_267_ * (float) ((Class168_Sub3) this).anInt9948;
	    f = f + f_270_ + f_268_;
	    f_255_ = f_255_ + f_271_ + f_269_;
	    f_256_ = f_256_ + f_272_ + f_268_;
	    f_257_ = f_257_ + f_273_ + f_269_;
	    f_258_ = f_258_ + f_270_ + f_274_;
	    f_259_ = f_259_ + f_271_ + f_275_;
	}
	float f_276_ = f_258_ + (f_256_ - f);
	float f_277_ = f_257_ + (f_259_ - f_255_);
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method3168((i & 0x1) != 0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(class142_sub4_sub1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(7681, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(1);
	float f_278_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_279_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_278_ * (f - (float) i_260_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_279_ * (f_255_ - (float) i_261_)));
	OpenGL.glVertex2f(f, f_255_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_278_ * (f_258_ - (float) i_260_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_279_ * (f_259_ - (float) i_261_)));
	OpenGL.glVertex2f(f_258_, f_259_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_278_ * (f_276_ - (float) i_260_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_279_ * (f_277_ - (float) i_261_)));
	OpenGL.glVertex2f(f_276_, f_277_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_278_ * (f_256_ - (float) i_260_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_279_ * (f_257_ - (float) i_261_)));
	OpenGL.glVertex2f(f_256_, f_257_);
	OpenGL.glEnd();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 5890, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
    }
    
    void method3650(float f, float f_280_, float f_281_, float f_282_,
		    float f_283_, float f_284_, int i, Class135 class135,
		    int i_285_, int i_286_) {
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = (((Class135_Sub3) (Class135_Sub3) class135)
	       .aClass142_Sub4_Sub1_10030);
	if (((Class168_Sub3) this).aBool9947) {
	    float f_287_ = (float) method64();
	    float f_288_ = (float) method3616();
	    float f_289_ = (f_281_ - f) / f_287_;
	    float f_290_ = (f_282_ - f_280_) / f_287_;
	    float f_291_ = (f_283_ - f) / f_288_;
	    float f_292_ = (f_284_ - f_280_) / f_288_;
	    float f_293_ = f_291_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_294_ = f_292_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_295_ = f_289_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_296_ = f_290_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_297_ = -f_289_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_298_ = -f_290_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_299_ = -f_291_ * (float) ((Class168_Sub3) this).anInt9948;
	    float f_300_ = -f_292_ * (float) ((Class168_Sub3) this).anInt9948;
	    f = f + f_295_ + f_293_;
	    f_280_ = f_280_ + f_296_ + f_294_;
	    f_281_ = f_281_ + f_297_ + f_293_;
	    f_282_ = f_282_ + f_298_ + f_294_;
	    f_283_ = f_283_ + f_295_ + f_299_;
	    f_284_ = f_284_ + f_296_ + f_300_;
	}
	float f_301_ = f_283_ + (f_281_ - f);
	float f_302_ = f_282_ + (f_284_ - f_280_);
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method3168((i & 0x1) != 0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(class142_sub4_sub1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(7681, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(1);
	float f_303_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_304_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_303_ * (f - (float) i_285_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_304_ * (f_280_ - (float) i_286_)));
	OpenGL.glVertex2f(f, f_280_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_303_ * (f_283_ - (float) i_285_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_304_ * (f_284_ - (float) i_286_)));
	OpenGL.glVertex2f(f_283_, f_284_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_303_ * (f_301_ - (float) i_285_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_304_ * (f_302_ - (float) i_286_)));
	OpenGL.glVertex2f(f_301_, f_302_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_303_ * (f_281_ - (float) i_285_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_304_ * (f_282_ - (float) i_286_)));
	OpenGL.glVertex2f(f_281_, f_282_);
	OpenGL.glEnd();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 5890, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
    }
    
    void method3651(float f, float f_305_, float f_306_, float f_307_,
		    float f_308_, float f_309_, int i, Class135 class135,
		    int i_310_, int i_311_) {
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = (((Class135_Sub3) (Class135_Sub3) class135)
	       .aClass142_Sub4_Sub1_10030);
	if (((Class168_Sub3) this).aBool9947) {
	    float f_312_ = (float) method64();
	    float f_313_ = (float) method3616();
	    float f_314_ = (f_306_ - f) / f_312_;
	    float f_315_ = (f_307_ - f_305_) / f_312_;
	    float f_316_ = (f_308_ - f) / f_313_;
	    float f_317_ = (f_309_ - f_305_) / f_313_;
	    float f_318_ = f_316_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_319_ = f_317_ * (float) ((Class168_Sub3) this).anInt9945;
	    float f_320_ = f_314_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_321_ = f_315_ * (float) ((Class168_Sub3) this).anInt9946;
	    float f_322_ = -f_314_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_323_ = -f_315_ * (float) ((Class168_Sub3) this).anInt9940;
	    float f_324_ = -f_316_ * (float) ((Class168_Sub3) this).anInt9948;
	    float f_325_ = -f_317_ * (float) ((Class168_Sub3) this).anInt9948;
	    f = f + f_320_ + f_318_;
	    f_305_ = f_305_ + f_321_ + f_319_;
	    f_306_ = f_306_ + f_322_ + f_318_;
	    f_307_ = f_307_ + f_323_ + f_319_;
	    f_308_ = f_308_ + f_320_ + f_324_;
	    f_309_ = f_309_ + f_321_ + f_325_;
	}
	float f_326_ = f_308_ + (f_306_ - f);
	float f_327_ = f_307_ + (f_309_ - f_305_);
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9942
	    .method3168((i & 0x1) != 0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15171();
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(class142_sub4_sub1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(7681, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15192(1);
	float f_328_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_329_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_328_ * (f - (float) i_310_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_329_ * (f_305_ - (float) i_311_)));
	OpenGL.glVertex2f(f, f_305_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_328_ * (f_308_ - (float) i_310_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_329_ * (f_309_ - (float) i_311_)));
	OpenGL.glVertex2f(f_308_, f_309_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_328_ * (f_326_ - (float) i_310_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_329_ * (f_327_ - (float) i_311_)));
	OpenGL.glVertex2f(f_326_, f_327_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10701,
				 ((Class142_Sub4_Sub1)
				  (((Class168_Sub3) this)
				   .aClass142_Sub4_Sub1_9942)).aFloat10700);
	OpenGL.glMultiTexCoord2f(33985, f_328_ * (f_306_ - (float) i_310_),
				 ((((Class142_Sub4_Sub1) class142_sub4_sub1)
				   .aFloat10700)
				  - f_329_ * (f_307_ - (float) i_311_)));
	OpenGL.glVertex2f(f_306_, f_307_);
	OpenGL.glEnd();
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(0, 5890, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15178(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
    }
    
    public int method3652() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		.anInt10699);
    }
    
    public int method3601() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		.anInt10699);
    }
    
    void method16234(int i) {
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9942);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180
	    (((Class168_Sub3) this).aClass103_Sub1_9941.method15179(i), 7681);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34167, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15352(0, 34168, 770);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
	((Class168_Sub3) this).aClass103_Sub1_9941
	    .method15177(((Class168_Sub3) this).aClass142_Sub4_Sub1_9944);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(34479, 7681);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34166, 768);
	if (((Class168_Sub3) this).anInt9943 == 0)
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15182(1.0F, 0.5F,
								   0.5F, 0.0F);
	else if (((Class168_Sub3) this).anInt9943 == 1)
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15182(0.5F, 1.0F,
								   0.5F, 0.0F);
	else if (((Class168_Sub3) this).anInt9943 == 2)
	    ((Class168_Sub3) this).aClass103_Sub1_9941.method15182(0.5F, 0.5F,
								   1.0F, 0.0F);
	else if (((Class168_Sub3) this).anInt9943 == 3)
	    ((Class168_Sub3) this).aClass103_Sub1_9941
		.method15182(128.5F, 128.5F, 128.5F, 0.0F);
    }
    
    void method16235() {
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(8448, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15352(0, 5890, 770);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34168, 768);
    }
    
    void method16236() {
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(8448, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15352(0, 5890, 770);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34168, 768);
    }
    
    void method16237() {
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(1);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15177(null);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15180(8448, 8448);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34168, 768);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15352(0, 5890, 770);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15225(0);
	((Class168_Sub3) this).aClass103_Sub1_9941.method15181(1, 34168, 768);
    }
    
    public void method3630(int i, int i_330_, int i_331_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	((Class168_Sub3) this).aClass142_Sub4_Sub1_9944
	    = (Class142_Sub4_Sub1.method16948
	       (((Class168_Sub3) this).aClass103_Sub1_9941, i, i_330_,
		((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10699,
		((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942).anInt10703));
	((Class168_Sub3) this).anInt9943 = i_331_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    public int method3655() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		.anInt10703);
    }
    
    public int method3604() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		.anInt10703);
    }
    
    public int method3642() {
	return (((Class142_Sub4_Sub1)
		 ((Class168_Sub3) this).aClass142_Sub4_Sub1_9942)
		.anInt10703);
    }
}
