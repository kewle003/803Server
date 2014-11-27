/* Class342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class342 implements Interface35, Interface36
{
    Class263_Sub3_Sub1 aClass263_Sub3_Sub1_5314;
    long aLong5315;
    int anInt5316;
    
    public int method49() {
	return ((Class342) this).aClass263_Sub3_Sub1_5314.method49();
    }
    
    public void method148() {
	if (((Class342) this).aLong5315 != 0L) {
	    ((Class263_Sub3_Sub1) ((Class342) this).aClass263_Sub3_Sub1_5314)
		.aClass103_Sub3_Sub1_4319
		.method17463(((Class342) this).aLong5315);
	    ((Class342) this).aLong5315 = 0L;
	}
    }
    
    void method6128() {
	method192();
    }
    
    public int method64() {
	return ((Class342) this).aClass263_Sub3_Sub1_5314.method55();
    }
    
    public void method28() {
	if (((Class342) this).aLong5315 != 0L) {
	    IUnknown.Release(((Class342) this).aLong5315);
	    ((Class342) this).aLong5315 = 0L;
	}
	((Class263_Sub3_Sub1) ((Class342) this).aClass263_Sub3_Sub1_5314)
	    .aClass103_Sub3_Sub1_4319.method15617(this);
    }
    
    public void method192() {
	if (((Class342) this).aLong5315 != 0L) {
	    ((Class263_Sub3_Sub1) ((Class342) this).aClass263_Sub3_Sub1_5314)
		.aClass103_Sub3_Sub1_4319
		.method17463(((Class342) this).aLong5315);
	    ((Class342) this).aLong5315 = 0L;
	}
    }
    
    public void finalize() {
	method192();
    }
    
    void method6129() {
	method192();
    }
    
    public int method52() {
	return ((Class342) this).aClass263_Sub3_Sub1_5314.method55();
    }
    
    public int method53() {
	return ((Class342) this).aClass263_Sub3_Sub1_5314.method55();
    }
    
    public int method54() {
	return ((Class342) this).aClass263_Sub3_Sub1_5314.method49();
    }
    
    public void method27() {
	if (((Class342) this).aLong5315 != 0L) {
	    IUnknown.Release(((Class342) this).aLong5315);
	    ((Class342) this).aLong5315 = 0L;
	}
	((Class263_Sub3_Sub1) ((Class342) this).aClass263_Sub3_Sub1_5314)
	    .aClass103_Sub3_Sub1_4319.method15617(this);
    }
    
    public void method29() {
	if (((Class342) this).aLong5315 != 0L) {
	    IUnknown.Release(((Class342) this).aLong5315);
	    ((Class342) this).aLong5315 = 0L;
	}
	((Class263_Sub3_Sub1) ((Class342) this).aClass263_Sub3_Sub1_5314)
	    .aClass103_Sub3_Sub1_4319.method15617(this);
    }
    
    public int method55() {
	return ((Class342) this).aClass263_Sub3_Sub1_5314.method55();
    }
    
    public long method57() {
	if (((Class342) this).aLong5315 == 0L)
	    ((Class342) this).aLong5315
		= (IDirect3DTexture.GetSurfaceLevel
		   (((Class263_Sub3_Sub1)
		     ((Class342) this).aClass263_Sub3_Sub1_5314).aLong4322,
		    ((Class342) this).anInt5316));
	return ((Class342) this).aLong5315;
    }
    
    void method6130() {
	method192();
    }
    
    Class342(Class263_Sub3_Sub1 class263_sub3_sub1, int i) {
	((Class342) this).anInt5316 = i;
	((Class342) this).aClass263_Sub3_Sub1_5314 = class263_sub3_sub1;
	((Class263_Sub3_Sub1) ((Class342) this).aClass263_Sub3_Sub1_5314)
	    .aClass103_Sub3_Sub1_4319.method16005(this);
    }
    
    public long method193() {
	if (((Class342) this).aLong5315 == 0L)
	    ((Class342) this).aLong5315
		= (IDirect3DTexture.GetSurfaceLevel
		   (((Class263_Sub3_Sub1)
		     ((Class342) this).aClass263_Sub3_Sub1_5314).aLong4322,
		    ((Class342) this).anInt5316));
	return ((Class342) this).aLong5315;
    }
    
    void method6131() {
	method192();
    }
    
    public void method149() {
	if (((Class342) this).aLong5315 != 0L) {
	    ((Class263_Sub3_Sub1) ((Class342) this).aClass263_Sub3_Sub1_5314)
		.aClass103_Sub3_Sub1_4319
		.method17463(((Class342) this).aLong5315);
	    ((Class342) this).aLong5315 = 0L;
	}
    }
}
