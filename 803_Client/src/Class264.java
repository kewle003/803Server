/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class264 implements Interface35
{
    int anInt4323;
    Class102 aClass102_4324;
    Class175 aClass175_4325;
    Class103_Sub3_Sub1 aClass103_Sub3_Sub1_4326;
    int anInt4327;
    long aLong4328;
    
    public void method27() {
	if (((Class264) this).aLong4328 != 0L) {
	    IUnknown.Release(((Class264) this).aLong4328);
	    ((Class264) this).aLong4328 = 0L;
	}
	((Class264) this).aClass103_Sub3_Sub1_4326.method15617(this);
    }
    
    public int method55() {
	return ((Class264) this).anInt4327;
    }
    
    public int method49() {
	return ((Class264) this).anInt4323;
    }
    
    Class264(Class103_Sub3_Sub1 class103_sub3_sub1, Class175 class175,
	     Class102 class102, int i, int i_0_, int i_1_) {
	((Class264) this).aClass103_Sub3_Sub1_4326 = class103_sub3_sub1;
	((Class264) this).anInt4327 = i;
	((Class264) this).anInt4323 = i_0_;
	((Class264) this).aClass175_4325 = class175;
	((Class264) this).aClass102_4324 = class102;
	((Class264) this).aLong4328
	    = (IDirect3DDevice.CreateRenderTarget
	       (((Class103_Sub3_Sub1)
		 ((Class264) this).aClass103_Sub3_Sub1_4326).aLong11097,
		i, i_0_,
		Class103_Sub3_Sub1.method17486((((Class264) this)
						.aClass175_4325),
					       (((Class264) this)
						.aClass102_4324)),
		0 + i_1_, 0, false));
	((Class264) this).aClass103_Sub3_Sub1_4326.method16005(this);
    }
    
    public void method28() {
	if (((Class264) this).aLong4328 != 0L) {
	    IUnknown.Release(((Class264) this).aLong4328);
	    ((Class264) this).aLong4328 = 0L;
	}
	((Class264) this).aClass103_Sub3_Sub1_4326.method15617(this);
    }
    
    public void method192() {
	if (((Class264) this).aLong4328 != 0L) {
	    ((Class264) this).aClass103_Sub3_Sub1_4326
		.method17463(((Class264) this).aLong4328);
	    ((Class264) this).aLong4328 = 0L;
	}
    }
    
    public void finalize() {
	method192();
    }
    
    void method5107() {
	method192();
    }
    
    public int method52() {
	return ((Class264) this).anInt4327;
    }
    
    public int method53() {
	return ((Class264) this).anInt4327;
    }
    
    public int method54() {
	return ((Class264) this).anInt4323;
    }
    
    public void method148() {
	if (((Class264) this).aLong4328 != 0L) {
	    ((Class264) this).aClass103_Sub3_Sub1_4326
		.method17463(((Class264) this).aLong4328);
	    ((Class264) this).aLong4328 = 0L;
	}
    }
    
    public long method57() {
	return ((Class264) this).aLong4328;
    }
    
    void method5108() {
	method192();
    }
    
    void method5109() {
	method192();
    }
    
    public void method29() {
	if (((Class264) this).aLong4328 != 0L) {
	    IUnknown.Release(((Class264) this).aLong4328);
	    ((Class264) this).aLong4328 = 0L;
	}
	((Class264) this).aClass103_Sub3_Sub1_4326.method15617(this);
    }
    
    void method5110() {
	method192();
    }
    
    public long method193() {
	return ((Class264) this).aLong4328;
    }
    
    public int method64() {
	return ((Class264) this).anInt4327;
    }
    
    public void method149() {
	if (((Class264) this).aLong4328 != 0L) {
	    ((Class264) this).aClass103_Sub3_Sub1_4326
		.method17463(((Class264) this).aLong4328);
	    ((Class264) this).aLong4328 = 0L;
	}
    }
}
