/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IUnknown;

public abstract class Class263 implements Interface45
{
    Class102 aClass102_4318;
    Class103_Sub3_Sub1 aClass103_Sub3_Sub1_4319;
    boolean aBool4320;
    Class175 aClass175_4321;
    long aLong4322 = 0L;
    
    void method5098() {
	method5102();
    }
    
    Class263(Class103_Sub3_Sub1 class103_sub3_sub1, Class175 class175,
	     Class102 class102, boolean bool, int i) {
	((Class263) this).aClass103_Sub3_Sub1_4319 = class103_sub3_sub1;
	((Class263) this).aClass175_4321 = class175;
	((Class263) this).aClass102_4318 = class102;
	((Class263) this).aBool4320 = bool;
	((Class263) this).aClass103_Sub3_Sub1_4319.method16005(this);
    }
    
    public void method176(Class312 class312) {
	/* empty */
    }
    
    public void method28() {
	if (((Class263) this).aLong4322 != 0L) {
	    IUnknown.Release(((Class263) this).aLong4322);
	    ((Class263) this).aLong4322 = 0L;
	}
	((Class263) this).aClass103_Sub3_Sub1_4319.method15617(this);
    }
    
    public void method181(Class312 class312) {
	/* empty */
    }
    
    public void finalize() {
	method5102();
    }
    
    public void method27() {
	if (((Class263) this).aLong4322 != 0L) {
	    IUnknown.Release(((Class263) this).aLong4322);
	    ((Class263) this).aLong4322 = 0L;
	}
	((Class263) this).aClass103_Sub3_Sub1_4319.method15617(this);
    }
    
    long method5099() {
	return ((Class263) this).aLong4322;
    }
    
    void method5100() {
	method5102();
    }
    
    void method5101() {
	method5102();
    }
    
    void method5102() {
	if (((Class263) this).aLong4322 != 0L) {
	    ((Class263) this).aClass103_Sub3_Sub1_4319
		.method17463(((Class263) this).aLong4322);
	    ((Class263) this).aLong4322 = 0L;
	}
    }
    
    long method5103() {
	return ((Class263) this).aLong4322;
    }
    
    public void method179(Class312 class312) {
	/* empty */
    }
    
    void method5104() {
	method5102();
    }
    
    public void method29() {
	if (((Class263) this).aLong4322 != 0L) {
	    IUnknown.Release(((Class263) this).aLong4322);
	    ((Class263) this).aLong4322 = 0L;
	}
	((Class263) this).aClass103_Sub3_Sub1_4319.method15617(this);
    }
    
    long method5105() {
	return ((Class263) this).aLong4322;
    }
    
    void method5106() {
	if (((Class263) this).aLong4322 != 0L) {
	    ((Class263) this).aClass103_Sub3_Sub1_4319
		.method17463(((Class263) this).aLong4322);
	    ((Class263) this).aLong4322 = 0L;
	}
    }
}
