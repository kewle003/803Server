/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class255 implements Interface33
{
    Class103_Sub3_Sub1 aClass103_Sub3_Sub1_4135;
    int anInt4136;
    int anInt4137;
    boolean aBool4138;
    Class102 aClass102_4139;
    long aLong4140 = 0L;
    
    void method5041() {
	if (((Class255) this).aLong4140 != 0L) {
	    ((Class255) this).aClass103_Sub3_Sub1_4135
		.method17463(((Class255) this).aLong4140);
	    ((Class255) this).aLong4140 = 0L;
	}
	((Class255) this).anInt4137 = 0;
	((Class255) this).anInt4136 = 0;
    }
    
    public int method53() {
	return ((Class255) this).anInt4136;
    }
    
    public Class102 method186() {
	return ((Class255) this).aClass102_4139;
    }
    
    public void method185(int i) {
	((Class255) this).anInt4136
	    = ((Class255) this).aClass102_4139.anInt1447 * -387243519 * i;
	if (((Class255) this).anInt4136 > ((Class255) this).anInt4137) {
	    if (((Class255) this).aLong4140 != 0L)
		IUnknown.Release(((Class255) this).aLong4140);
	    int i_0_ = 8;
	    int i_1_;
	    if (((Class255) this).aBool4138) {
		i_1_ = 0;
		i_0_ |= 0x200;
	    } else
		i_1_ = 1;
	    ((Class255) this).aLong4140
		= (IDirect3DDevice.CreateIndexBuffer
		   (((Class103_Sub3_Sub1)
		     ((Class255) this).aClass103_Sub3_Sub1_4135).aLong11097,
		    ((Class255) this).anInt4136, i_0_,
		    (((Class255) this).aClass102_4139
		     == Class102.aClass102_1441) ? 101 : 102,
		    i_1_));
	    ((Class255) this).anInt4137 = ((Class255) this).anInt4136;
	}
    }
    
    public long method262(int i, int i_2_) {
	return IDirect3DIndexBuffer.Lock(((Class255) this).aLong4140, i, i_2_,
					 (((Class255) this).aBool4138 ? 8192
					  : 0));
    }
    
    public boolean method264(int i, int i_3_, long l) {
	return Class28.method958(IDirect3DIndexBuffer.Upload
				 (((Class255) this).aLong4140, i, i_3_,
				  ((Class255) this).aBool4138 ? 8192 : 0, l));
    }
    
    void method5042() {
	if (((Class255) this).aLong4140 != 0L) {
	    ((Class255) this).aClass103_Sub3_Sub1_4135
		.method17463(((Class255) this).aLong4140);
	    ((Class255) this).aLong4140 = 0L;
	}
	((Class255) this).anInt4137 = 0;
	((Class255) this).anInt4136 = 0;
    }
    
    public void method28() {
	if (((Class255) this).aLong4140 != 0L) {
	    IUnknown.Release(((Class255) this).aLong4140);
	    ((Class255) this).aLong4140 = 0L;
	}
	((Class255) this).anInt4137 = 0;
	((Class255) this).anInt4136 = 0;
	((Class255) this).aClass103_Sub3_Sub1_4135.method15617(this);
    }
    
    Class255(Class103_Sub3_Sub1 class103_sub3_sub1, Class102 class102,
	     boolean bool) {
	((Class255) this).aClass103_Sub3_Sub1_4135 = class103_sub3_sub1;
	((Class255) this).aClass102_4139 = class102;
	((Class255) this).aBool4138 = bool;
	((Class255) this).aClass103_Sub3_Sub1_4135.method16005(this);
    }
    
    public void method29() {
	if (((Class255) this).aLong4140 != 0L) {
	    IUnknown.Release(((Class255) this).aLong4140);
	    ((Class255) this).aLong4140 = 0L;
	}
	((Class255) this).anInt4137 = 0;
	((Class255) this).anInt4136 = 0;
	((Class255) this).aClass103_Sub3_Sub1_4135.method15617(this);
    }
    
    public void finalize() {
	method5041();
    }
    
    public int method265() {
	return ((Class255) this).anInt4136;
    }
    
    void method5043() {
	method5041();
    }
    
    void method5044() {
	method5041();
    }
    
    void method5045() {
	method5041();
    }
    
    public boolean method268(int i, int i_4_, long l) {
	return Class28.method958(IDirect3DIndexBuffer.Upload
				 (((Class255) this).aLong4140, i, i_4_,
				  ((Class255) this).aBool4138 ? 8192 : 0, l));
    }
    
    public int method147() {
	return ((Class255) this).anInt4136;
    }
    
    public void method192() {
	IDirect3DIndexBuffer.Unlock(((Class255) this).aLong4140);
    }
    
    public int method266() {
	return ((Class255) this).anInt4136;
    }
    
    public boolean method270(int i, int i_5_, long l) {
	return Class28.method958(IDirect3DIndexBuffer.Upload
				 (((Class255) this).aLong4140, i, i_5_,
				  ((Class255) this).aBool4138 ? 8192 : 0, l));
    }
    
    public boolean method263(int i, int i_6_, long l) {
	return Class28.method958(IDirect3DIndexBuffer.Upload
				 (((Class255) this).aLong4140, i, i_6_,
				  ((Class255) this).aBool4138 ? 8192 : 0, l));
    }
    
    void method5046() {
	method5041();
    }
    
    public long method269(int i, int i_7_) {
	return IDirect3DIndexBuffer.Lock(((Class255) this).aLong4140, i, i_7_,
					 (((Class255) this).aBool4138 ? 8192
					  : 0));
    }
    
    public long method267(int i, int i_8_) {
	return IDirect3DIndexBuffer.Lock(((Class255) this).aLong4140, i, i_8_,
					 (((Class255) this).aBool4138 ? 8192
					  : 0));
    }
    
    public long method271(int i, int i_9_) {
	return IDirect3DIndexBuffer.Lock(((Class255) this).aLong4140, i, i_9_,
					 (((Class255) this).aBool4138 ? 8192
					  : 0));
    }
    
    public void method40() {
	IDirect3DIndexBuffer.Unlock(((Class255) this).aLong4140);
    }
    
    public void method272() {
	IDirect3DIndexBuffer.Unlock(((Class255) this).aLong4140);
    }
    
    public void method273() {
	IDirect3DIndexBuffer.Unlock(((Class255) this).aLong4140);
    }
    
    public Class102 method187() {
	return ((Class255) this).aClass102_4139;
    }
    
    public Class102 method188() {
	return ((Class255) this).aClass102_4139;
    }
    
    public void method27() {
	if (((Class255) this).aLong4140 != 0L) {
	    IUnknown.Release(((Class255) this).aLong4140);
	    ((Class255) this).aLong4140 = 0L;
	}
	((Class255) this).anInt4137 = 0;
	((Class255) this).anInt4136 = 0;
	((Class255) this).aClass103_Sub3_Sub1_4135.method15617(this);
    }
    
    public void method189(int i) {
	((Class255) this).anInt4136
	    = ((Class255) this).aClass102_4139.anInt1447 * -387243519 * i;
	if (((Class255) this).anInt4136 > ((Class255) this).anInt4137) {
	    if (((Class255) this).aLong4140 != 0L)
		IUnknown.Release(((Class255) this).aLong4140);
	    int i_10_ = 8;
	    int i_11_;
	    if (((Class255) this).aBool4138) {
		i_11_ = 0;
		i_10_ |= 0x200;
	    } else
		i_11_ = 1;
	    ((Class255) this).aLong4140
		= (IDirect3DDevice.CreateIndexBuffer
		   (((Class103_Sub3_Sub1)
		     ((Class255) this).aClass103_Sub3_Sub1_4135).aLong11097,
		    ((Class255) this).anInt4136, i_10_,
		    (((Class255) this).aClass102_4139
		     == Class102.aClass102_1441) ? 101 : 102,
		    i_11_));
	    ((Class255) this).anInt4137 = ((Class255) this).anInt4136;
	}
    }
    
    void method5047() {
	if (((Class255) this).aLong4140 != 0L) {
	    ((Class255) this).aClass103_Sub3_Sub1_4135
		.method17463(((Class255) this).aLong4140);
	    ((Class255) this).aLong4140 = 0L;
	}
	((Class255) this).anInt4137 = 0;
	((Class255) this).anInt4136 = 0;
    }
}
