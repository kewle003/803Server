/* Class263_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class263_Sub3 extends Class263 implements Interface41
{
    int anInt10470;
    int anInt10471;
    float aFloat10472;
    boolean aBool10473;
    boolean aBool10474;
    float aFloat10475;
    
    public void method232(boolean bool, boolean bool_0_) {
	((Class263_Sub3) this).aBool10474 = bool;
	((Class263_Sub3) this).aBool10473 = bool_0_;
    }
    
    Class263_Sub3(Class103_Sub3_Sub1 class103_sub3_sub1, Class175 class175,
		  Class102 class102, int i, int i_1_, int i_2_, int i_3_) {
	super(class103_sub3_sub1, class175, class102, false, i * i_1_);
	if (!((Class103_Sub3_Sub1)
	      ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319).aBool11100) {
	    ((Class263_Sub3) this).anInt10470
		= Class480.method11001(i, (byte) -82);
	    ((Class263_Sub3) this).anInt10471
		= Class480.method11001(i_1_, (byte) -43);
	    ((Class263_Sub3) this).aFloat10475
		= (float) i / (float) ((Class263_Sub3) this).anInt10470;
	    ((Class263_Sub3) this).aFloat10472
		= (float) i_1_ / (float) ((Class263_Sub3) this).anInt10471;
	} else {
	    ((Class263_Sub3) this).anInt10470 = i;
	    ((Class263_Sub3) this).anInt10471 = i_1_;
	    ((Class263_Sub3) this).aFloat10475 = 1.0F;
	    ((Class263_Sub3) this).aFloat10472 = 1.0F;
	}
	((Class263_Sub3) this).aLong4322
	    = (IDirect3DDevice.CreateTexture
	       (((Class103_Sub3_Sub1)
		 ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319).aLong11097,
		((Class263_Sub3) this).anInt10470,
		((Class263_Sub3) this).anInt10471, 0, i_2_,
		Class103_Sub3_Sub1.method17486((((Class263_Sub3) this)
						.aClass175_4321),
					       (((Class263_Sub3) this)
						.aClass102_4318)),
		i_3_));
    }
    
    public float method259() {
	return ((Class263_Sub3) this).aFloat10472;
    }
    
    Class263_Sub3(Class103_Sub3_Sub1 class103_sub3_sub1, int i, int i_4_,
		  boolean bool, int[] is, int i_5_, int i_6_) {
	super(class103_sub3_sub1, Class175.aClass175_2110,
	      Class102.aClass102_1440,
	      bool && ((Class103_Sub3_Sub1) class103_sub3_sub1).aBool11101,
	      i * i_4_);
	if (!((Class103_Sub3_Sub1)
	      ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319).aBool11100) {
	    ((Class263_Sub3) this).anInt10470
		= Class480.method11001(i, (byte) 20);
	    ((Class263_Sub3) this).anInt10471
		= Class480.method11001(i_4_, (byte) 20);
	    ((Class263_Sub3) this).aFloat10475
		= (float) i / (float) ((Class263_Sub3) this).anInt10470;
	    ((Class263_Sub3) this).aFloat10472
		= (float) i_4_ / (float) ((Class263_Sub3) this).anInt10471;
	    if (i != ((Class263_Sub3) this).anInt10470
		|| i_4_ != ((Class263_Sub3) this).anInt10471) {
		is = (((Class263_Sub3) this).aClass103_Sub3_Sub1_4319
			  .method2339
		      (i, i_4_, ((Class263_Sub3) this).anInt10470,
		       ((Class263_Sub3) this).anInt10471, is, i_5_, i_6_,
		       (short) -7159));
		i_5_ = 0;
		i_6_ = ((Class263_Sub3) this).anInt10470;
	    }
	} else {
	    ((Class263_Sub3) this).anInt10470 = i;
	    ((Class263_Sub3) this).anInt10471 = i_4_;
	    ((Class263_Sub3) this).aFloat10475 = 1.0F;
	    ((Class263_Sub3) this).aFloat10472 = 1.0F;
	}
	if (bool)
	    ((Class263_Sub3) this).aLong4322
		= (IDirect3DDevice.CreateTexture
		   ((((Class103_Sub3_Sub1)
		      ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319)
		     .aLong11097),
		    ((Class263_Sub3) this).anInt10470,
		    ((Class263_Sub3) this).anInt10471, 0, 1024, 21, 1));
	else
	    ((Class263_Sub3) this).aLong4322
		= (IDirect3DDevice.CreateTexture
		   ((((Class103_Sub3_Sub1)
		      ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319)
		     .aLong11097),
		    ((Class263_Sub3) this).anInt10470,
		    ((Class263_Sub3) this).anInt10471, 1, 0, 21, 1));
	if (i_6_ == 0)
	    i_6_ = ((Class263_Sub3) this).anInt10470;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_5_,
				     i_6_ * ((Class263_Sub3) this).anInt10471);
	IDirect3DTexture.Upload(((Class263_Sub3) this).aLong4322, 0, 0, 0,
				((Class263_Sub3) this).anInt10470,
				((Class263_Sub3) this).anInt10471,
				i_6_ * ((((Class263_Sub3) this).aClass175_4321
					 .anInt2121)
					* 1893442799),
				0,
				(((Class263_Sub3) this)
				 .aClass103_Sub3_Sub1_4319.aLong9491));
    }
    
    Class263_Sub3(Class103_Sub3_Sub1 class103_sub3_sub1, Class175 class175,
		  int i, int i_7_, boolean bool, float[] fs, int i_8_,
		  int i_9_) {
	super(class103_sub3_sub1, class175, Class102.aClass102_1440,
	      bool && ((Class103_Sub3_Sub1) class103_sub3_sub1).aBool11101,
	      i * i_7_);
	if (!((Class103_Sub3_Sub1)
	      ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319).aBool11100) {
	    ((Class263_Sub3) this).anInt10470
		= Class480.method11001(i, (byte) -31);
	    ((Class263_Sub3) this).anInt10471
		= Class480.method11001(i_7_, (byte) -92);
	    ((Class263_Sub3) this).aFloat10475
		= (float) i / (float) ((Class263_Sub3) this).anInt10470;
	    ((Class263_Sub3) this).aFloat10472
		= (float) i_7_ / (float) ((Class263_Sub3) this).anInt10471;
	    if (i != ((Class263_Sub3) this).anInt10470
		|| i_7_ != ((Class263_Sub3) this).anInt10471) {
		fs = (((Class263_Sub3) this).aClass103_Sub3_Sub1_4319
			  .method2340
		      (i, i_7_, ((Class263_Sub3) this).anInt10470,
		       ((Class263_Sub3) this).anInt10471, fs, i_8_, i_9_,
		       class175.anInt2121 * 1893442799, 1697181524));
		i_8_ = 0;
		i_9_ = ((Class263_Sub3) this).anInt10470;
	    }
	} else {
	    ((Class263_Sub3) this).anInt10470 = i;
	    ((Class263_Sub3) this).anInt10471 = i_7_;
	    ((Class263_Sub3) this).aFloat10475 = 1.0F;
	    ((Class263_Sub3) this).aFloat10472 = 1.0F;
	}
	if (bool)
	    ((Class263_Sub3) this).aLong4322
		= (IDirect3DDevice.CreateTexture
		   ((((Class103_Sub3_Sub1)
		      ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319)
		     .aLong11097),
		    ((Class263_Sub3) this).anInt10470,
		    ((Class263_Sub3) this).anInt10471, 0, 1024,
		    Class103_Sub3_Sub1.method17486((((Class263_Sub3) this)
						    .aClass175_4321),
						   Class102.aClass102_1443),
		    1));
	else
	    ((Class263_Sub3) this).aLong4322
		= (IDirect3DDevice.CreateTexture
		   ((((Class103_Sub3_Sub1)
		      ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319)
		     .aLong11097),
		    ((Class263_Sub3) this).anInt10470,
		    ((Class263_Sub3) this).anInt10471, 1, 0,
		    Class103_Sub3_Sub1.method17486((((Class263_Sub3) this)
						    .aClass175_4321),
						   Class102.aClass102_1443),
		    1));
	if (i_9_ == 0)
	    i_9_ = ((Class263_Sub3) this).anInt10470;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.asFloatBuffer().put(fs, i_8_,
				       (i_9_
					* ((Class263_Sub3) this).anInt10471
					* ((((Class263_Sub3) this)
					    .aClass175_4321.anInt2121)
					   * 1893442799)));
	IDirect3DTexture.Upload(((Class263_Sub3) this).aLong4322, 0, 0, 0,
				((Class263_Sub3) this).anInt10470,
				((Class263_Sub3) this).anInt10471,
				i_9_ * ((((Class263_Sub3) this).aClass175_4321
					 .anInt2121)
					* 1893442799) * 4,
				0,
				(((Class263_Sub3) this)
				 .aClass103_Sub3_Sub1_4319.aLong9491));
    }
    
    public int method55() {
	return ((Class263_Sub3) this).anInt10470;
    }
    
    public int method49() {
	return ((Class263_Sub3) this).anInt10471;
    }
    
    public void method28() {
	super.method28();
    }
    
    public float method226(float f) {
	return f / (float) ((Class263_Sub3) this).anInt10471;
    }
    
    public float method242() {
	return ((Class263_Sub3) this).aFloat10475;
    }
    
    public void method176(Class312 class312) {
	super.method176(class312);
    }
    
    public float method233() {
	return ((Class263_Sub3) this).aFloat10472;
    }
    
    long method5103() {
	return ((Class263_Sub3) this).aLong4322;
    }
    
    public void method251(int i, int i_10_, int i_11_, int i_12_, byte[] is,
			  Class175 class175, int i_13_, int i_14_) {
	if (((Class263_Sub3) this).aClass175_4321 != class175
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	if (i_14_ == 0)
	    i_14_ = i_11_;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.put(is, i_13_, i_14_ * i_12_);
	IDirect3DTexture.Upload
	    (((Class263_Sub3) this).aLong4322, 0, i, i_10_, i_11_, i_12_,
	     i_14_ * (((Class263_Sub3) this).aClass175_4321.anInt2121
		      * 1893442799),
	     0, ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aLong9491);
    }
    
    public void method228(boolean bool, boolean bool_15_) {
	((Class263_Sub3) this).aBool10474 = bool;
	((Class263_Sub3) this).aBool10473 = bool_15_;
    }
    
    public void method256(int i, int i_16_, int i_17_, int i_18_, int[] is,
			  int i_19_, int i_20_) {
	if (((Class263_Sub3) this).aClass175_4321 != Class175.aClass175_2110
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	if (i_20_ == 0)
	    i_20_ = i_17_;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_19_, i_20_ * i_18_);
	IDirect3DTexture.Upload
	    (((Class263_Sub3) this).aLong4322, 0, i, i_16_, i_17_, i_18_,
	     i_20_ * (((Class263_Sub3) this).aClass175_4321.anInt2121
		      * 1893442799),
	     0, ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aLong9491);
    }
    
    public void method247(boolean bool, boolean bool_21_) {
	((Class263_Sub3) this).aBool10474 = bool;
	((Class263_Sub3) this).aBool10473 = bool_21_;
    }
    
    public void method231(int i, int i_22_, int i_23_, int i_24_, int[] is,
			  int i_25_) {
	if (((Class263_Sub3) this).aClass175_4321 != Class175.aClass175_2110
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	IDirect3DTexture.Download(((Class263_Sub3) this).aLong4322, 0, i,
				  i_22_, i_23_, i_24_, i_23_ * 4, 0,
				  (((Class263_Sub3) this)
				   .aClass103_Sub3_Sub1_4319.aLong9491));
	bytebuffer.asIntBuffer().get(is, i_25_, i_23_ * i_24_);
    }
    
    public float method260(float f) {
	return f / (float) ((Class263_Sub3) this).anInt10471;
    }
    
    public boolean method150() {
	return false;
    }
    
    long method5105() {
	return ((Class263_Sub3) this).aLong4322;
    }
    
    public void method27() {
	super.method28();
    }
    
    public void method29() {
	super.method28();
    }
    
    public void method248(int i, int i_26_, int i_27_, int i_28_, int[] is,
			  int i_29_, int i_30_) {
	if (((Class263_Sub3) this).aClass175_4321 != Class175.aClass175_2110
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	if (i_30_ == 0)
	    i_30_ = i_27_;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_29_, i_30_ * i_28_);
	IDirect3DTexture.Upload
	    (((Class263_Sub3) this).aLong4322, 0, i, i_26_, i_27_, i_28_,
	     i_30_ * (((Class263_Sub3) this).aClass175_4321.anInt2121
		      * 1893442799),
	     0, ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aLong9491);
    }
    
    public int method235() {
	return ((Class263_Sub3) this).anInt10470;
    }
    
    public float method225(float f) {
	return f / (float) ((Class263_Sub3) this).anInt10470;
    }
    
    public int method237() {
	return ((Class263_Sub3) this).anInt10471;
    }
    
    public void method234(int i, int i_31_, int i_32_, int i_33_, byte[] is,
			  Class175 class175, int i_34_, int i_35_) {
	if (((Class263_Sub3) this).aClass175_4321 != class175
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	if (i_35_ == 0)
	    i_35_ = i_32_;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.put(is, i_34_, i_35_ * i_33_);
	IDirect3DTexture.Upload
	    (((Class263_Sub3) this).aLong4322, 0, i, i_31_, i_32_, i_33_,
	     i_35_ * (((Class263_Sub3) this).aClass175_4321.anInt2121
		      * 1893442799),
	     0, ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aLong9491);
    }
    
    public float method239(float f) {
	return f / (float) ((Class263_Sub3) this).anInt10470;
    }
    
    public boolean method243() {
	return true;
    }
    
    Class263_Sub3(Class103_Sub3_Sub1 class103_sub3_sub1, Class175 class175,
		  int i, int i_36_, boolean bool, byte[] is, int i_37_,
		  int i_38_) {
	super(class103_sub3_sub1, class175, Class102.aClass102_1440,
	      bool && ((Class103_Sub3_Sub1) class103_sub3_sub1).aBool11101,
	      i * i_36_);
	if (!((Class103_Sub3_Sub1)
	      ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319).aBool11100) {
	    ((Class263_Sub3) this).anInt10470
		= Class480.method11001(i, (byte) 26);
	    ((Class263_Sub3) this).anInt10471
		= Class480.method11001(i_36_, (byte) -52);
	    ((Class263_Sub3) this).aFloat10475
		= (float) i / (float) ((Class263_Sub3) this).anInt10470;
	    ((Class263_Sub3) this).aFloat10472
		= (float) i_36_ / (float) ((Class263_Sub3) this).anInt10471;
	    if (i != ((Class263_Sub3) this).anInt10470
		|| i_36_ != ((Class263_Sub3) this).anInt10471) {
		is = (((Class263_Sub3) this).aClass103_Sub3_Sub1_4319
			  .method2341
		      (i, i_36_, ((Class263_Sub3) this).anInt10470,
		       ((Class263_Sub3) this).anInt10471, is, i_37_, i_38_,
		       class175.anInt2121 * 1893442799, (byte) 50));
		i_37_ = 0;
		i_38_ = ((Class263_Sub3) this).anInt10470;
	    }
	} else {
	    ((Class263_Sub3) this).anInt10470 = i;
	    ((Class263_Sub3) this).anInt10471 = i_36_;
	    ((Class263_Sub3) this).aFloat10475 = 1.0F;
	    ((Class263_Sub3) this).aFloat10472 = 1.0F;
	}
	if (bool)
	    ((Class263_Sub3) this).aLong4322
		= (IDirect3DDevice.CreateTexture
		   ((((Class103_Sub3_Sub1)
		      ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319)
		     .aLong11097),
		    ((Class263_Sub3) this).anInt10470,
		    ((Class263_Sub3) this).anInt10471, 0, 1024,
		    Class103_Sub3_Sub1.method17486((((Class263_Sub3) this)
						    .aClass175_4321),
						   Class102.aClass102_1440),
		    1));
	else
	    ((Class263_Sub3) this).aLong4322
		= (IDirect3DDevice.CreateTexture
		   ((((Class103_Sub3_Sub1)
		      ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319)
		     .aLong11097),
		    ((Class263_Sub3) this).anInt10470,
		    ((Class263_Sub3) this).anInt10471, 1, 0,
		    Class103_Sub3_Sub1.method17486((((Class263_Sub3) this)
						    .aClass175_4321),
						   Class102.aClass102_1440),
		    1));
	if (i_38_ == 0)
	    i_38_ = ((Class263_Sub3) this).anInt10470;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	if (((Class263_Sub3) this).aClass175_4321 == Class175.aClass175_2118) {
	    bytebuffer.put(is, i_37_,
			   (((Class263_Sub3) this).anInt10471
			    * ((Class263_Sub3) this).anInt10470 / 2));
	    IDirect3DTexture.Upload(((Class263_Sub3) this).aLong4322, 0, 0, 0,
				    ((Class263_Sub3) this).anInt10470,
				    ((Class263_Sub3) this).anInt10471 / 4,
				    ((Class263_Sub3) this).anInt10470 / 4 * 8,
				    0,
				    (((Class263_Sub3) this)
				     .aClass103_Sub3_Sub1_4319.aLong9491));
	} else if (((Class263_Sub3) this).aClass175_4321
		   == Class175.aClass175_2119) {
	    bytebuffer.put(is, i_37_, (((Class263_Sub3) this).anInt10471
				       * ((Class263_Sub3) this).anInt10470));
	    IDirect3DTexture.Upload(((Class263_Sub3) this).aLong4322, 0, 0, 0,
				    ((Class263_Sub3) this).anInt10470,
				    ((Class263_Sub3) this).anInt10471 / 4,
				    ((Class263_Sub3) this).anInt10470 / 4 * 16,
				    0,
				    (((Class263_Sub3) this)
				     .aClass103_Sub3_Sub1_4319.aLong9491));
	} else {
	    bytebuffer.put(is, i_37_,
			   i_38_ * ((Class263_Sub3) this).anInt10471);
	    IDirect3DTexture.Upload(((Class263_Sub3) this).aLong4322, 0, 0, 0,
				    ((Class263_Sub3) this).anInt10470,
				    ((Class263_Sub3) this).anInt10471,
				    i_38_ * ((((Class263_Sub3) this)
					      .aClass175_4321.anInt2121)
					     * 1893442799),
				    0,
				    (((Class263_Sub3) this)
				     .aClass103_Sub3_Sub1_4319.aLong9491));
	}
    }
    
    public void method252(int i, int i_39_, int i_40_, int i_41_, byte[] is,
			  Class175 class175, int i_42_, int i_43_) {
	if (((Class263_Sub3) this).aClass175_4321 != class175
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	if (i_43_ == 0)
	    i_43_ = i_40_;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.put(is, i_42_, i_43_ * i_41_);
	IDirect3DTexture.Upload
	    (((Class263_Sub3) this).aLong4322, 0, i, i_39_, i_40_, i_41_,
	     i_43_ * (((Class263_Sub3) this).aClass175_4321.anInt2121
		      * 1893442799),
	     0, ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aLong9491);
    }
    
    public void method230(int i, int i_44_, int i_45_, int i_46_, byte[] is,
			  Class175 class175, int i_47_, int i_48_) {
	if (((Class263_Sub3) this).aClass175_4321 != class175
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	if (i_48_ == 0)
	    i_48_ = i_45_;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.put(is, i_47_, i_48_ * i_46_);
	IDirect3DTexture.Upload
	    (((Class263_Sub3) this).aLong4322, 0, i, i_44_, i_45_, i_46_,
	     i_48_ * (((Class263_Sub3) this).aClass175_4321.anInt2121
		      * 1893442799),
	     0, ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aLong9491);
    }
    
    public void method180() {
	((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.method17466(this);
    }
    
    public int method223() {
	return ((Class263_Sub3) this).anInt10470;
    }
    
    public void method245(boolean bool, boolean bool_49_) {
	((Class263_Sub3) this).aBool10474 = bool;
	((Class263_Sub3) this).aBool10473 = bool_49_;
    }
    
    public float method246(float f) {
	return f / (float) ((Class263_Sub3) this).anInt10471;
    }
    
    public void method236(int i, int i_50_, int i_51_, int i_52_, int[] is,
			  int i_53_, int i_54_) {
	if (((Class263_Sub3) this).aClass175_4321 != Class175.aClass175_2110
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	if (i_54_ == 0)
	    i_54_ = i_51_;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_53_, i_54_ * i_52_);
	IDirect3DTexture.Upload
	    (((Class263_Sub3) this).aLong4322, 0, i, i_50_, i_51_, i_52_,
	     i_54_ * (((Class263_Sub3) this).aClass175_4321.anInt2121
		      * 1893442799),
	     0, ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aLong9491);
    }
    
    public float method240(float f) {
	return f / (float) ((Class263_Sub3) this).anInt10471;
    }
    
    public boolean method244() {
	return true;
    }
    
    public void method229(int i, int i_55_, int i_56_, int i_57_, int[] is,
			  int i_58_, int i_59_) {
	if (((Class263_Sub3) this).aClass175_4321 != Class175.aClass175_2110
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	if (i_59_ == 0)
	    i_59_ = i_56_;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_58_, i_59_ * i_57_);
	IDirect3DTexture.Upload
	    (((Class263_Sub3) this).aLong4322, 0, i, i_55_, i_56_, i_57_,
	     i_59_ * (((Class263_Sub3) this).aClass175_4321.anInt2121
		      * 1893442799),
	     0, ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aLong9491);
    }
    
    public int method238() {
	return ((Class263_Sub3) this).anInt10471;
    }
    
    public void method178() {
	((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.method17466(this);
    }
    
    public int method241() {
	return ((Class263_Sub3) this).anInt10470;
    }
    
    public void method253(int i, int i_60_, int i_61_, int i_62_, byte[] is,
			  Class175 class175, int i_63_, int i_64_) {
	if (((Class263_Sub3) this).aClass175_4321 != class175
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	if (i_64_ == 0)
	    i_64_ = i_61_;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.put(is, i_63_, i_64_ * i_62_);
	IDirect3DTexture.Upload
	    (((Class263_Sub3) this).aLong4322, 0, i, i_60_, i_61_, i_62_,
	     i_64_ * (((Class263_Sub3) this).aClass175_4321.anInt2121
		      * 1893442799),
	     0, ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aLong9491);
    }
    
    public void method254(int i, int i_65_, int i_66_, int i_67_, int[] is,
			  int i_68_) {
	if (((Class263_Sub3) this).aClass175_4321 != Class175.aClass175_2110
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	IDirect3DTexture.Download(((Class263_Sub3) this).aLong4322, 0, i,
				  i_65_, i_66_, i_67_, i_66_ * 4, 0,
				  (((Class263_Sub3) this)
				   .aClass103_Sub3_Sub1_4319.aLong9491));
	bytebuffer.asIntBuffer().get(is, i_68_, i_66_ * i_67_);
    }
    
    public void method255(int i, int i_69_, int i_70_, int i_71_, int[] is,
			  int i_72_) {
	if (((Class263_Sub3) this).aClass175_4321 != Class175.aClass175_2110
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	IDirect3DTexture.Download(((Class263_Sub3) this).aLong4322, 0, i,
				  i_69_, i_70_, i_71_, i_70_ * 4, 0,
				  (((Class263_Sub3) this)
				   .aClass103_Sub3_Sub1_4319.aLong9491));
	bytebuffer.asIntBuffer().get(is, i_72_, i_70_ * i_71_);
    }
    
    public float method257() {
	return ((Class263_Sub3) this).aFloat10472;
    }
    
    public float method250() {
	return ((Class263_Sub3) this).aFloat10472;
    }
    
    public float method258() {
	return ((Class263_Sub3) this).aFloat10472;
    }
    
    public void method224(int i, int i_73_, int i_74_, int i_75_, int[] is,
			  int i_76_, int i_77_) {
	if (((Class263_Sub3) this).aClass175_4321 != Class175.aClass175_2110
	    || (((Class263_Sub3) this).aClass102_4318
		!= Class102.aClass102_1440))
	    throw new RuntimeException();
	if (i_77_ == 0)
	    i_77_ = i_74_;
	ByteBuffer bytebuffer
	    = ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_76_, i_77_ * i_75_);
	IDirect3DTexture.Upload
	    (((Class263_Sub3) this).aLong4322, 0, i, i_73_, i_74_, i_75_,
	     i_77_ * (((Class263_Sub3) this).aClass175_4321.anInt2121
		      * 1893442799),
	     0, ((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.aLong9491);
    }
    
    public void method177() {
	((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.method17466(this);
    }
    
    Class263_Sub3(Class103_Sub3_Sub1 class103_sub3_sub1, Class175 class175,
		  Class102 class102, int i, int i_78_) {
	this(class103_sub3_sub1, class175, class102, i, i_78_, 0, 1);
    }
    
    public void method175() {
	((Class263_Sub3) this).aClass103_Sub3_Sub1_4319.method17466(this);
    }
    
    public void method179(Class312 class312) {
	super.method176(class312);
    }
    
    public void method181(Class312 class312) {
	super.method176(class312);
    }
    
    long method5099() {
	return ((Class263_Sub3) this).aLong4322;
    }
    
    public boolean method227() {
	return true;
    }
    
    public float method249() {
	return ((Class263_Sub3) this).aFloat10475;
    }
    
    public boolean method261() {
	return false;
    }
}
