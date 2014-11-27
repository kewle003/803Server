/* Class263_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class263_Sub3_Sub1 extends Class263_Sub3 implements Interface43
{
    public void method245(boolean bool, boolean bool_0_) {
	super.method228(bool, bool_0_);
    }
    
    public Interface4 method274(int i) {
	return new Class342(this, i);
    }
    
    public void method231(int i, int i_1_, int i_2_, int i_3_, int[] is,
			  int i_4_) {
	long l
	    = IDirect3DTexture
		  .GetSurfaceLevel(((Class263_Sub3_Sub1) this).aLong4322, 0);
	long l_5_
	    = IDirect3DDevice.CreateRenderTarget((((Class103_Sub3_Sub1)
						   (((Class263_Sub3_Sub1) this)
						    .aClass103_Sub3_Sub1_4319))
						  .aLong11097),
						 i_2_, i_3_, 21, 0, 0, true);
	if (Class28.method958
	    (IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1)
					   (((Class263_Sub3_Sub1) this)
					    .aClass103_Sub3_Sub1_4319))
					  .aLong11097),
					 l, i, i_1_, i_2_, i_3_, l_5_, 0, 0,
					 i_2_, i_3_, 1))) {
	    IDirect3DSurface.Download(l_5_, 0, 0, i_2_, i_3_, i_2_ * 4, 16,
				      (((Class263_Sub3_Sub1) this)
				       .aClass103_Sub3_Sub1_4319.aLong9491));
	    ((Class263_Sub3_Sub1) this).aClass103_Sub3_Sub1_4319
		.aByteBuffer9490.clear();
	    ((Class263_Sub3_Sub1) this).aClass103_Sub3_Sub1_4319
		.aByteBuffer9490.asIntBuffer
		().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_5_);
    }
    
    public int method55() {
	return super.method55();
    }
    
    public int method223() {
	return super.method55();
    }
    
    public float method225(float f) {
	return super.method225(f);
    }
    
    public int method237() {
	return super.method49();
    }
    
    public boolean method227() {
	return super.method227();
    }
    
    public float method239(float f) {
	return super.method225(f);
    }
    
    public void method256(int i, int i_6_, int i_7_, int i_8_, int[] is,
			  int i_9_, int i_10_) {
	super.method256(i, i_6_, i_7_, i_8_, is, i_9_, i_10_);
    }
    
    public void method230(int i, int i_11_, int i_12_, int i_13_, byte[] is,
			  Class175 class175, int i_14_, int i_15_) {
	super.method230(i, i_11_, i_12_, i_13_, is, class175, i_14_, i_15_);
    }
    
    public float method242() {
	return super.method242();
    }
    
    public void method236(int i, int i_16_, int i_17_, int i_18_, int[] is,
			  int i_19_, int i_20_) {
	super.method256(i, i_16_, i_17_, i_18_, is, i_19_, i_20_);
    }
    
    public boolean method150() {
	return super.method150();
    }
    
    public void method224(int i, int i_21_, int i_22_, int i_23_, int[] is,
			  int i_24_, int i_25_) {
	super.method256(i, i_21_, i_22_, i_23_, is, i_24_, i_25_);
    }
    
    public void method176(Class312 class312) {
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
    
    public void method178() {
	super.method178();
    }
    
    public void method247(boolean bool, boolean bool_26_) {
	super.method228(bool, bool_26_);
    }
    
    public void method252(int i, int i_27_, int i_28_, int i_29_, byte[] is,
			  Class175 class175, int i_30_, int i_31_) {
	super.method230(i, i_27_, i_28_, i_29_, is, class175, i_30_, i_31_);
    }
    
    public float method257() {
	return super.method233();
    }
    
    Class263_Sub3_Sub1(Class103_Sub3_Sub1 class103_sub3_sub1,
		       Class175 class175, Class102 class102, int i,
		       int i_32_) {
	super(class103_sub3_sub1, class175, class102, i, i_32_, 1025, 0);
    }
    
    public int method238() {
	return super.method49();
    }
    
    public float method260(float f) {
	return super.method226(f);
    }
    
    public void method253(int i, int i_33_, int i_34_, int i_35_, byte[] is,
			  Class175 class175, int i_36_, int i_37_) {
	super.method230(i, i_33_, i_34_, i_35_, is, class175, i_36_, i_37_);
    }
    
    public float method246(float f) {
	return super.method226(f);
    }
    
    public Interface4 method275(int i) {
	return new Class342(this, i);
    }
    
    public boolean method244() {
	return super.method227();
    }
    
    public float method258() {
	return super.method233();
    }
    
    public void method248(int i, int i_38_, int i_39_, int i_40_, int[] is,
			  int i_41_, int i_42_) {
	super.method256(i, i_38_, i_39_, i_40_, is, i_41_, i_42_);
    }
    
    public void method232(boolean bool, boolean bool_43_) {
	super.method228(bool, bool_43_);
    }
    
    public int method49() {
	return super.method49();
    }
    
    public float method226(float f) {
	return super.method226(f);
    }
    
    public void method228(boolean bool, boolean bool_44_) {
	super.method228(bool, bool_44_);
    }
    
    public void method229(int i, int i_45_, int i_46_, int i_47_, int[] is,
			  int i_48_, int i_49_) {
	super.method256(i, i_45_, i_46_, i_47_, is, i_48_, i_49_);
    }
    
    public void method234(int i, int i_50_, int i_51_, int i_52_, byte[] is,
			  Class175 class175, int i_53_, int i_54_) {
	super.method230(i, i_50_, i_51_, i_52_, is, class175, i_53_, i_54_);
    }
    
    public float method240(float f) {
	return super.method226(f);
    }
    
    public boolean method243() {
	return super.method227();
    }
    
    public float method233() {
	return super.method233();
    }
    
    public void method254(int i, int i_55_, int i_56_, int i_57_, int[] is,
			  int i_58_) {
	long l
	    = IDirect3DTexture
		  .GetSurfaceLevel(((Class263_Sub3_Sub1) this).aLong4322, 0);
	long l_59_
	    = IDirect3DDevice.CreateRenderTarget((((Class103_Sub3_Sub1)
						   (((Class263_Sub3_Sub1) this)
						    .aClass103_Sub3_Sub1_4319))
						  .aLong11097),
						 i_56_, i_57_, 21, 0, 0, true);
	if (Class28.method958
	    (IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1)
					   (((Class263_Sub3_Sub1) this)
					    .aClass103_Sub3_Sub1_4319))
					  .aLong11097),
					 l, i, i_55_, i_56_, i_57_, l_59_, 0,
					 0, i_56_, i_57_, 1))) {
	    IDirect3DSurface.Download(l_59_, 0, 0, i_56_, i_57_, i_56_ * 4, 16,
				      (((Class263_Sub3_Sub1) this)
				       .aClass103_Sub3_Sub1_4319.aLong9491));
	    ((Class263_Sub3_Sub1) this).aClass103_Sub3_Sub1_4319
		.aByteBuffer9490.clear();
	    ((Class263_Sub3_Sub1) this).aClass103_Sub3_Sub1_4319
		.aByteBuffer9490.asIntBuffer
		().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_59_);
    }
    
    public void method255(int i, int i_60_, int i_61_, int i_62_, int[] is,
			  int i_63_) {
	long l
	    = IDirect3DTexture
		  .GetSurfaceLevel(((Class263_Sub3_Sub1) this).aLong4322, 0);
	long l_64_
	    = IDirect3DDevice.CreateRenderTarget((((Class103_Sub3_Sub1)
						   (((Class263_Sub3_Sub1) this)
						    .aClass103_Sub3_Sub1_4319))
						  .aLong11097),
						 i_61_, i_62_, 21, 0, 0, true);
	if (Class28.method958
	    (IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1)
					   (((Class263_Sub3_Sub1) this)
					    .aClass103_Sub3_Sub1_4319))
					  .aLong11097),
					 l, i, i_60_, i_61_, i_62_, l_64_, 0,
					 0, i_61_, i_62_, 1))) {
	    IDirect3DSurface.Download(l_64_, 0, 0, i_61_, i_62_, i_61_ * 4, 16,
				      (((Class263_Sub3_Sub1) this)
				       .aClass103_Sub3_Sub1_4319.aLong9491));
	    ((Class263_Sub3_Sub1) this).aClass103_Sub3_Sub1_4319
		.aByteBuffer9490.clear();
	    ((Class263_Sub3_Sub1) this).aClass103_Sub3_Sub1_4319
		.aByteBuffer9490.asIntBuffer
		().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_64_);
    }
    
    public void method251(int i, int i_65_, int i_66_, int i_67_, byte[] is,
			  Class175 class175, int i_68_, int i_69_) {
	super.method230(i, i_65_, i_66_, i_67_, is, class175, i_68_, i_69_);
    }
    
    public float method250() {
	return super.method233();
    }
    
    public void method180() {
	super.method178();
    }
    
    public float method259() {
	return super.method233();
    }
    
    public void method177() {
	super.method178();
    }
    
    public int method241() {
	return super.method55();
    }
    
    public void method175() {
	super.method178();
    }
    
    public void method179(Class312 class312) {
	super.method176(class312);
    }
    
    public void method181(Class312 class312) {
	super.method176(class312);
    }
    
    public int method235() {
	return super.method55();
    }
    
    public Interface4 method277(int i) {
	return new Class342(this, i);
    }
    
    public Interface4 method276(int i) {
	return new Class342(this, i);
    }
    
    public float method249() {
	return super.method242();
    }
    
    public boolean method261() {
	return super.method150();
    }
}
