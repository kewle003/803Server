/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class265 implements Interface36
{
    long aLong4329;
    Class102 aClass102_4330;
    int anInt4331;
    Class103_Sub3_Sub1 aClass103_Sub3_Sub1_4332;
    int anInt4333;
    
    void method5111() {
	method192();
    }
    
    public int method55() {
	return ((Class265) this).anInt4331;
    }
    
    public void method192() {
	if (((Class265) this).aLong4329 != 0L) {
	    ((Class265) this).aClass103_Sub3_Sub1_4332
		.method17463(((Class265) this).aLong4329);
	    ((Class265) this).aLong4329 = 0L;
	}
    }
    
    void method5112() {
	method192();
    }
    
    public void method28() {
	if (((Class265) this).aLong4329 != 0L) {
	    IUnknown.Release(((Class265) this).aLong4329);
	    ((Class265) this).aLong4329 = 0L;
	}
	((Class265) this).aClass103_Sub3_Sub1_4332.method15617(this);
    }
    
    public int method64() {
	return ((Class265) this).anInt4331;
    }
    
    public void finalize() {
	method192();
    }
    
    public int method49() {
	return ((Class265) this).anInt4333;
    }
    
    public int method52() {
	return ((Class265) this).anInt4331;
    }
    
    public int method53() {
	return ((Class265) this).anInt4331;
    }
    
    void method5113() {
	method192();
    }
    
    public void method27() {
	if (((Class265) this).aLong4329 != 0L) {
	    IUnknown.Release(((Class265) this).aLong4329);
	    ((Class265) this).aLong4329 = 0L;
	}
	((Class265) this).aClass103_Sub3_Sub1_4332.method15617(this);
    }
    
    public void method29() {
	if (((Class265) this).aLong4329 != 0L) {
	    IUnknown.Release(((Class265) this).aLong4329);
	    ((Class265) this).aLong4329 = 0L;
	}
	((Class265) this).aClass103_Sub3_Sub1_4332.method15617(this);
    }
    
    void method5114() {
	method192();
    }
    
    public long method57() {
	return ((Class265) this).aLong4329;
    }
    
    Class265(Class103_Sub3_Sub1 class103_sub3_sub1, Class102 class102, int i,
	     int i_0_, int i_1_) {
	((Class265) this).aClass103_Sub3_Sub1_4332 = class103_sub3_sub1;
	((Class265) this).anInt4331 = i;
	((Class265) this).anInt4333 = i_0_;
	((Class265) this).aClass102_4330 = class102;
	((Class265) this).aLong4329
	    = (IDirect3DDevice.CreateDepthStencilSurface
	       (((Class103_Sub3_Sub1)
		 ((Class265) this).aClass103_Sub3_Sub1_4332).aLong11097,
		i, i_0_,
		Class103_Sub3_Sub1
		    .method17472(((Class265) this).aClass102_4330),
		0 + i_1_, 0, false));
	((Class265) this).aClass103_Sub3_Sub1_4332.method16005(this);
    }
    
    public int method54() {
	return ((Class265) this).anInt4333;
    }
    
    public long method193() {
	return ((Class265) this).aLong4329;
    }
    
    public void method148() {
	if (((Class265) this).aLong4329 != 0L) {
	    ((Class265) this).aClass103_Sub3_Sub1_4332
		.method17463(((Class265) this).aLong4329);
	    ((Class265) this).aLong4329 = 0L;
	}
    }
    
    public void method149() {
	if (((Class265) this).aLong4329 != 0L) {
	    ((Class265) this).aClass103_Sub3_Sub1_4332
		.method17463(((Class265) this).aLong4329);
	    ((Class265) this).aLong4329 = 0L;
	}
    }
}
