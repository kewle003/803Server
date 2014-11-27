/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class259 implements Interface40
{
    boolean aBool4211;
    int anInt4212;
    Class103_Sub3_Sub1 aClass103_Sub3_Sub1_4213;
    int anInt4214;
    long aLong4215 = 0L;
    byte aByte4216;
    
    int method5070() {
	return ((Class259) this).aByte4216;
    }
    
    public int method53() {
	return ((Class259) this).anInt4214;
    }
    
    public void method29() {
	if (((Class259) this).aLong4215 != 0L) {
	    IUnknown.Release(((Class259) this).aLong4215);
	    ((Class259) this).aLong4215 = 0L;
	}
	((Class259) this).anInt4212 = 0;
	((Class259) this).anInt4214 = 0;
	((Class259) this).aClass103_Sub3_Sub1_4213.method15617(this);
    }
    
    void method5071() {
	if (((Class259) this).aLong4215 != 0L) {
	    ((Class259) this).aClass103_Sub3_Sub1_4213
		.method17463(((Class259) this).aLong4215);
	    ((Class259) this).aLong4215 = 0L;
	    ((Class259) this).anInt4212 = 0;
	    ((Class259) this).anInt4214 = 0;
	}
    }
    
    public long method262(int i, int i_0_) {
	return IDirect3DVertexBuffer.Lock(((Class259) this).aLong4215, i, i_0_,
					  (((Class259) this).aBool4211 ? 8192
					   : 0));
    }
    
    public void method192() {
	IDirect3DVertexBuffer.Unlock(((Class259) this).aLong4215);
    }
    
    public boolean method268(int i, int i_1_, long l) {
	return Class28.method958(IDirect3DVertexBuffer.Upload
				 (((Class259) this).aLong4215, i, i_1_,
				  ((Class259) this).aBool4211 ? 8192 : 0, l));
    }
    
    public void method28() {
	if (((Class259) this).aLong4215 != 0L) {
	    IUnknown.Release(((Class259) this).aLong4215);
	    ((Class259) this).aLong4215 = 0L;
	}
	((Class259) this).anInt4212 = 0;
	((Class259) this).anInt4214 = 0;
	((Class259) this).aClass103_Sub3_Sub1_4213.method15617(this);
    }
    
    public long method267(int i, int i_2_) {
	return IDirect3DVertexBuffer.Lock(((Class259) this).aLong4215, i, i_2_,
					  (((Class259) this).aBool4211 ? 8192
					   : 0));
    }
    
    public void finalize() {
	method5071();
    }
    
    public void method27() {
	if (((Class259) this).aLong4215 != 0L) {
	    IUnknown.Release(((Class259) this).aLong4215);
	    ((Class259) this).aLong4215 = 0L;
	}
	((Class259) this).anInt4212 = 0;
	((Class259) this).anInt4214 = 0;
	((Class259) this).aClass103_Sub3_Sub1_4213.method15617(this);
    }
    
    public int method265() {
	return ((Class259) this).anInt4214;
    }
    
    public long method269(int i, int i_3_) {
	return IDirect3DVertexBuffer.Lock(((Class259) this).aLong4215, i, i_3_,
					  (((Class259) this).aBool4211 ? 8192
					   : 0));
    }
    
    void method5072() {
	method5071();
    }
    
    void method5073() {
	method5071();
    }
    
    void method5074() {
	method5071();
    }
    
    public boolean method220(int i, int i_4_) {
	((Class259) this).anInt4214 = i;
	((Class259) this).aByte4216 = (byte) i_4_;
	if (((Class259) this).anInt4214 > ((Class259) this).anInt4212) {
	    int i_5_ = 8;
	    int i_6_;
	    if (((Class259) this).aBool4211) {
		i_6_ = 0;
		i_5_ |= 0x200;
	    } else
		i_6_ = 1;
	    if (((Class259) this).aLong4215 != 0L)
		IUnknown.Release(((Class259) this).aLong4215);
	    ((Class259) this).aLong4215
		= (IDirect3DDevice.CreateVertexBuffer
		   (((Class103_Sub3_Sub1)
		     ((Class259) this).aClass103_Sub3_Sub1_4213).aLong11097,
		    ((Class259) this).anInt4214, i_5_, 0, i_6_));
	    ((Class259) this).anInt4212 = ((Class259) this).anInt4214;
	}
	return ((Class259) this).aLong4215 != 0L;
    }
    
    public boolean method219(int i, int i_7_) {
	((Class259) this).anInt4214 = i;
	((Class259) this).aByte4216 = (byte) i_7_;
	if (((Class259) this).anInt4214 > ((Class259) this).anInt4212) {
	    int i_8_ = 8;
	    int i_9_;
	    if (((Class259) this).aBool4211) {
		i_9_ = 0;
		i_8_ |= 0x200;
	    } else
		i_9_ = 1;
	    if (((Class259) this).aLong4215 != 0L)
		IUnknown.Release(((Class259) this).aLong4215);
	    ((Class259) this).aLong4215
		= (IDirect3DDevice.CreateVertexBuffer
		   (((Class103_Sub3_Sub1)
		     ((Class259) this).aClass103_Sub3_Sub1_4213).aLong11097,
		    ((Class259) this).anInt4214, i_8_, 0, i_9_));
	    ((Class259) this).anInt4212 = ((Class259) this).anInt4214;
	}
	return ((Class259) this).aLong4215 != 0L;
    }
    
    int method5075() {
	return ((Class259) this).aByte4216;
    }
    
    public int method147() {
	return ((Class259) this).anInt4214;
    }
    
    int method5076() {
	return ((Class259) this).aByte4216;
    }
    
    public int method266() {
	return ((Class259) this).anInt4214;
    }
    
    public boolean method222(int i, int i_10_) {
	((Class259) this).anInt4214 = i;
	((Class259) this).aByte4216 = (byte) i_10_;
	if (((Class259) this).anInt4214 > ((Class259) this).anInt4212) {
	    int i_11_ = 8;
	    int i_12_;
	    if (((Class259) this).aBool4211) {
		i_12_ = 0;
		i_11_ |= 0x200;
	    } else
		i_12_ = 1;
	    if (((Class259) this).aLong4215 != 0L)
		IUnknown.Release(((Class259) this).aLong4215);
	    ((Class259) this).aLong4215
		= (IDirect3DDevice.CreateVertexBuffer
		   (((Class103_Sub3_Sub1)
		     ((Class259) this).aClass103_Sub3_Sub1_4213).aLong11097,
		    ((Class259) this).anInt4214, i_11_, 0, i_12_));
	    ((Class259) this).anInt4212 = ((Class259) this).anInt4214;
	}
	return ((Class259) this).aLong4215 != 0L;
    }
    
    public boolean method263(int i, int i_13_, long l) {
	return Class28.method958(IDirect3DVertexBuffer.Upload
				 (((Class259) this).aLong4215, i, i_13_,
				  ((Class259) this).aBool4211 ? 8192 : 0, l));
    }
    
    void method5077() {
	method5071();
    }
    
    public boolean method221(int i, int i_14_) {
	((Class259) this).anInt4214 = i;
	((Class259) this).aByte4216 = (byte) i_14_;
	if (((Class259) this).anInt4214 > ((Class259) this).anInt4212) {
	    int i_15_ = 8;
	    int i_16_;
	    if (((Class259) this).aBool4211) {
		i_16_ = 0;
		i_15_ |= 0x200;
	    } else
		i_16_ = 1;
	    if (((Class259) this).aLong4215 != 0L)
		IUnknown.Release(((Class259) this).aLong4215);
	    ((Class259) this).aLong4215
		= (IDirect3DDevice.CreateVertexBuffer
		   (((Class103_Sub3_Sub1)
		     ((Class259) this).aClass103_Sub3_Sub1_4213).aLong11097,
		    ((Class259) this).anInt4214, i_15_, 0, i_16_));
	    ((Class259) this).anInt4212 = ((Class259) this).anInt4214;
	}
	return ((Class259) this).aLong4215 != 0L;
    }
    
    public boolean method264(int i, int i_17_, long l) {
	return Class28.method958(IDirect3DVertexBuffer.Upload
				 (((Class259) this).aLong4215, i, i_17_,
				  ((Class259) this).aBool4211 ? 8192 : 0, l));
    }
    
    public long method271(int i, int i_18_) {
	return IDirect3DVertexBuffer.Lock(((Class259) this).aLong4215, i,
					  i_18_,
					  (((Class259) this).aBool4211 ? 8192
					   : 0));
    }
    
    public void method40() {
	IDirect3DVertexBuffer.Unlock(((Class259) this).aLong4215);
    }
    
    public void method272() {
	IDirect3DVertexBuffer.Unlock(((Class259) this).aLong4215);
    }
    
    public void method273() {
	IDirect3DVertexBuffer.Unlock(((Class259) this).aLong4215);
    }
    
    public boolean method270(int i, int i_19_, long l) {
	return Class28.method958(IDirect3DVertexBuffer.Upload
				 (((Class259) this).aLong4215, i, i_19_,
				  ((Class259) this).aBool4211 ? 8192 : 0, l));
    }
    
    Class259(Class103_Sub3_Sub1 class103_sub3_sub1, boolean bool) {
	((Class259) this).aClass103_Sub3_Sub1_4213 = class103_sub3_sub1;
	((Class259) this).aBool4211 = bool;
	((Class259) this).aClass103_Sub3_Sub1_4213.method16005(this);
    }
    
    void method5078() {
	if (((Class259) this).aLong4215 != 0L) {
	    ((Class259) this).aClass103_Sub3_Sub1_4213
		.method17463(((Class259) this).aLong4215);
	    ((Class259) this).aLong4215 = 0L;
	    ((Class259) this).anInt4212 = 0;
	    ((Class259) this).anInt4214 = 0;
	}
    }
    
    void method5079() {
	if (((Class259) this).aLong4215 != 0L) {
	    ((Class259) this).aClass103_Sub3_Sub1_4213
		.method17463(((Class259) this).aLong4215);
	    ((Class259) this).aLong4215 = 0L;
	    ((Class259) this).anInt4212 = 0;
	    ((Class259) this).anInt4214 = 0;
	}
    }
}
