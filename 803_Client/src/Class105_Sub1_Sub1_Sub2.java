/* Class105_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

public class Class105_Sub1_Sub1_Sub2 extends Class105_Sub1_Sub1
    implements Interface25
{
    Canvas aCanvas11340;
    int anInt11341;
    boolean aBool11342 = false;
    long aLong11343;
    long aLong11344;
    boolean aBool11345 = false;
    int anInt11346;
    long aLong11347;
    Class103_Sub3_Sub1 aClass103_Sub3_Sub1_11348;
    D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11349;
    
    void method15438(int i, int i_0_) {
	method28();
	((Class105_Sub1_Sub1_Sub2) this).anInt11341 = i;
	((Class105_Sub1_Sub1_Sub2) this).anInt11346 = i_0_;
	if (((Class105_Sub1_Sub1_Sub2) this).aBool11345)
	    ((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
		.method17457
		(((Class105_Sub1_Sub1_Sub2) this).anInt11341,
		 ((Class105_Sub1_Sub1_Sub2) this).anInt11346);
	method163();
	super.method15436(i, i_0_);
    }
    
    public int method15435(int i, int i_1_) {
	return IDirect3DSwapChain
		   .Present(((Class105_Sub1_Sub1_Sub2) this).aLong11347, 0);
    }
    
    public int method2655() {
	return ((Class105_Sub1_Sub1_Sub2) this).anInt11341;
    }
    
    public int method2654() {
	return ((Class105_Sub1_Sub1_Sub2) this).anInt11346;
    }
    
    public boolean method162() {
	((Class105_Sub1_Sub1_Sub2) this).aBool11342 = true;
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11347 == 0L) {
	    if (((Class103_Sub3_Sub1)
		 ((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348)
		.aBool11085)
		return false;
	    method163();
	}
	if (Class28.method957(IDirect3DDevice.SetRenderTarget
			      (((Class103_Sub3_Sub1)
				(((Class105_Sub1_Sub1_Sub2) this)
				 .aClass103_Sub3_Sub1_11348)).aLong11097,
			       0,
			       ((Class105_Sub1_Sub1_Sub2) this).aLong11344)))
	    return false;
	if (Class28.method957(IDirect3DDevice.SetDepthStencilSurface
			      (((Class103_Sub3_Sub1)
				(((Class105_Sub1_Sub1_Sub2) this)
				 .aClass103_Sub3_Sub1_11348)).aLong11097,
			       ((Class105_Sub1_Sub1_Sub2) this).aLong11343)))
	    return false;
	return super.method162();
    }
    
    public boolean method115() {
	((Class105_Sub1_Sub1_Sub2) this).aBool11342 = true;
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11347 == 0L) {
	    if (((Class103_Sub3_Sub1)
		 ((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348)
		.aBool11085)
		return false;
	    method163();
	}
	if (Class28.method957(IDirect3DDevice.SetRenderTarget
			      (((Class103_Sub3_Sub1)
				(((Class105_Sub1_Sub1_Sub2) this)
				 .aClass103_Sub3_Sub1_11348)).aLong11097,
			       0,
			       ((Class105_Sub1_Sub1_Sub2) this).aLong11344)))
	    return false;
	if (Class28.method957(IDirect3DDevice.SetDepthStencilSurface
			      (((Class103_Sub3_Sub1)
				(((Class105_Sub1_Sub1_Sub2) this)
				 .aClass103_Sub3_Sub1_11348)).aLong11097,
			       ((Class105_Sub1_Sub1_Sub2) this).aLong11343)))
	    return false;
	return super.method162();
    }
    
    public int method2657() {
	return ((Class105_Sub1_Sub1_Sub2) this).anInt11341;
    }
    
    void method15436(int i, int i_2_) {
	method28();
	((Class105_Sub1_Sub1_Sub2) this).anInt11341 = i;
	((Class105_Sub1_Sub1_Sub2) this).anInt11346 = i_2_;
	if (((Class105_Sub1_Sub1_Sub2) this).aBool11345)
	    ((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
		.method17457
		(((Class105_Sub1_Sub1_Sub2) this).anInt11341,
		 ((Class105_Sub1_Sub1_Sub2) this).anInt11346);
	method163();
	super.method15436(i, i_2_);
    }
    
    boolean method2658() {
	((Class105_Sub1_Sub1_Sub2) this).aBool11342 = false;
	return Class28.method958(IDirect3DDevice.SetDepthStencilSurface
				 (((Class103_Sub3_Sub1)
				   (((Class105_Sub1_Sub1_Sub2) this)
				    .aClass103_Sub3_Sub1_11348)).aLong11097,
				  0L));
    }
    
    public void method28() {
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11344 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11344);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11344 = 0L;
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11343 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11343);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11343 = 0L;
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11347 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11347);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11347 = 0L;
	}
	((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
	    .method17471(this);
    }
    
    void method17742() {
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11344 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11344);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11344 = 0L;
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11343 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11343);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11343 = 0L;
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11347 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11347);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11347 = 0L;
	}
	((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
	    .method17471(this);
    }
    
    public void finalize() throws Throwable {
	method17742();
	super.finalize();
    }
    
    public int method2656() {
	return ((Class105_Sub1_Sub1_Sub2) this).anInt11341;
    }
    
    public int method2653() {
	return ((Class105_Sub1_Sub1_Sub2) this).anInt11341;
    }
    
    public void method163() {
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11347 == 0L) {
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		= new D3DPRESENT_PARAMETERS(((Class105_Sub1_Sub1_Sub2) this)
					    .aCanvas11340);
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		.Windowed
		= true;
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		.BackBufferCount
		= 1;
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		.PresentationInterval
		= -2147483648;
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		.BackBufferWidth
		= ((Class105_Sub1_Sub1_Sub2) this).anInt11341;
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		.BackBufferHeight
		= ((Class105_Sub1_Sub1_Sub2) this).anInt11346;
	    if (((Class105_Sub1_Sub1_Sub2) this).aBool11345) {
		((Class105_Sub1_Sub1_Sub2) this).aLong11347
		    = (IDirect3DDevice.GetSwapChain
		       (((Class103_Sub3_Sub1)
			 (((Class105_Sub1_Sub1_Sub2) this)
			  .aClass103_Sub3_Sub1_11348)).aLong11097,
			0));
		((Class105_Sub1_Sub1_Sub2) this).aLong11344
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class105_Sub1_Sub1_Sub2) this).aLong11347, 0, 0));
		((Class105_Sub1_Sub1_Sub2) this).aLong11343
		    = (IDirect3DDevice.GetDepthStencilSurface
		       (((Class103_Sub3_Sub1) (((Class105_Sub1_Sub1_Sub2) this)
					       .aClass103_Sub3_Sub1_11348))
			.aLong11097));
	    } else {
		if (!Class103_Sub3_Sub1.method17474
		     ((((Class103_Sub3_Sub1) (((Class105_Sub1_Sub1_Sub2) this)
					      .aClass103_Sub3_Sub1_11348))
		       .anInt11082),
		      (((Class103_Sub3_Sub1) (((Class105_Sub1_Sub1_Sub2) this)
					      .aClass103_Sub3_Sub1_11348))
		       .anInt11080),
		      (((Class103_Sub3_Sub1) (((Class105_Sub1_Sub1_Sub2) this)
					      .aClass103_Sub3_Sub1_11348))
		       .aLong11081),
		      (((Class105_Sub1_Sub1_Sub2) this)
		       .aClass103_Sub3_Sub1_11348.anInt9623),
		      (((Class105_Sub1_Sub1_Sub2) this)
		       .aD3DPRESENT_PARAMETERS11349)))
		    throw new RuntimeException();
		int i = (((Class105_Sub1_Sub1_Sub2) this)
			 .aD3DPRESENT_PARAMETERS11349.AutoDepthStencilFormat);
		((Class105_Sub1_Sub1_Sub2) this).aLong11347
		    = (IDirect3DDevice.CreateAdditionalSwapChain
		       (((Class103_Sub3_Sub1)
			 (((Class105_Sub1_Sub1_Sub2) this)
			  .aClass103_Sub3_Sub1_11348)).aLong11097,
			(((Class105_Sub1_Sub1_Sub2) this)
			 .aD3DPRESENT_PARAMETERS11349)));
		((Class105_Sub1_Sub1_Sub2) this).aLong11344
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class105_Sub1_Sub1_Sub2) this).aLong11347, 0, 0));
		((Class105_Sub1_Sub1_Sub2) this).aLong11343
		    = (IDirect3DDevice.CreateDepthStencilSurface
		       (((Class103_Sub3_Sub1)
			 (((Class105_Sub1_Sub1_Sub2) this)
			  .aClass103_Sub3_Sub1_11348)).aLong11097,
			((Class105_Sub1_Sub1_Sub2) this).anInt11341,
			((Class105_Sub1_Sub1_Sub2) this).anInt11346, i,
			(((Class105_Sub1_Sub1_Sub2) this)
			 .aD3DPRESENT_PARAMETERS11349.MultiSampleType),
			(((Class105_Sub1_Sub1_Sub2) this)
			 .aD3DPRESENT_PARAMETERS11349.MultiSampleQuality),
			false));
	    }
	    ((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
		.method17509(this);
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aBool11342)
	    method162();
    }
    
    void method17743() throws Throwable {
	method17742();
	super.finalize();
    }
    
    public boolean method114() {
	((Class105_Sub1_Sub1_Sub2) this).aBool11342 = true;
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11347 == 0L) {
	    if (((Class103_Sub3_Sub1)
		 ((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348)
		.aBool11085)
		return false;
	    method163();
	}
	if (Class28.method957(IDirect3DDevice.SetRenderTarget
			      (((Class103_Sub3_Sub1)
				(((Class105_Sub1_Sub1_Sub2) this)
				 .aClass103_Sub3_Sub1_11348)).aLong11097,
			       0,
			       ((Class105_Sub1_Sub1_Sub2) this).aLong11344)))
	    return false;
	if (Class28.method957(IDirect3DDevice.SetDepthStencilSurface
			      (((Class103_Sub3_Sub1)
				(((Class105_Sub1_Sub1_Sub2) this)
				 .aClass103_Sub3_Sub1_11348)).aLong11097,
			       ((Class105_Sub1_Sub1_Sub2) this).aLong11343)))
	    return false;
	return super.method162();
    }
    
    Class105_Sub1_Sub1_Sub2(Class103_Sub3_Sub1 class103_sub3_sub1,
			    Canvas canvas, int i, int i_3_, boolean bool) {
	super(class103_sub3_sub1);
	((Class105_Sub1_Sub1_Sub2) this).aCanvas11340 = canvas;
	((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
	    = class103_sub3_sub1;
	((Class105_Sub1_Sub1_Sub2) this).anInt11341 = i;
	((Class105_Sub1_Sub1_Sub2) this).anInt11346 = i_3_;
	((Class105_Sub1_Sub1_Sub2) this).aBool11345 = bool;
	method163();
    }
    
    public void method164() {
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11344 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11344);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11344 = 0L;
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11343 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11343);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11343 = 0L;
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11347 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11347);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11347 = 0L;
	}
	((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
	    .method17471(this);
    }
    
    public void method148() {
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11344 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11344);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11344 = 0L;
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11343 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11343);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11343 = 0L;
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11347 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11347);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11347 = 0L;
	}
	((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
	    .method17471(this);
    }
    
    public void method149() {
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11344 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11344);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11344 = 0L;
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11343 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11343);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11343 = 0L;
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11347 != 0L) {
	    IUnknown.Release(((Class105_Sub1_Sub1_Sub2) this).aLong11347);
	    ((Class105_Sub1_Sub1_Sub2) this).aLong11347 = 0L;
	}
	((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
	    .method17471(this);
    }
    
    void method15440(int i, int i_4_) {
	method28();
	((Class105_Sub1_Sub1_Sub2) this).anInt11341 = i;
	((Class105_Sub1_Sub1_Sub2) this).anInt11346 = i_4_;
	if (((Class105_Sub1_Sub1_Sub2) this).aBool11345)
	    ((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
		.method17457
		(((Class105_Sub1_Sub1_Sub2) this).anInt11341,
		 ((Class105_Sub1_Sub1_Sub2) this).anInt11346);
	method163();
	super.method15436(i, i_4_);
    }
    
    public void method161() {
	if (((Class105_Sub1_Sub1_Sub2) this).aLong11347 == 0L) {
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		= new D3DPRESENT_PARAMETERS(((Class105_Sub1_Sub1_Sub2) this)
					    .aCanvas11340);
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		.Windowed
		= true;
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		.BackBufferCount
		= 1;
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		.PresentationInterval
		= -2147483648;
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		.BackBufferWidth
		= ((Class105_Sub1_Sub1_Sub2) this).anInt11341;
	    ((Class105_Sub1_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11349
		.BackBufferHeight
		= ((Class105_Sub1_Sub1_Sub2) this).anInt11346;
	    if (((Class105_Sub1_Sub1_Sub2) this).aBool11345) {
		((Class105_Sub1_Sub1_Sub2) this).aLong11347
		    = (IDirect3DDevice.GetSwapChain
		       (((Class103_Sub3_Sub1)
			 (((Class105_Sub1_Sub1_Sub2) this)
			  .aClass103_Sub3_Sub1_11348)).aLong11097,
			0));
		((Class105_Sub1_Sub1_Sub2) this).aLong11344
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class105_Sub1_Sub1_Sub2) this).aLong11347, 0, 0));
		((Class105_Sub1_Sub1_Sub2) this).aLong11343
		    = (IDirect3DDevice.GetDepthStencilSurface
		       (((Class103_Sub3_Sub1) (((Class105_Sub1_Sub1_Sub2) this)
					       .aClass103_Sub3_Sub1_11348))
			.aLong11097));
	    } else {
		if (!Class103_Sub3_Sub1.method17474
		     ((((Class103_Sub3_Sub1) (((Class105_Sub1_Sub1_Sub2) this)
					      .aClass103_Sub3_Sub1_11348))
		       .anInt11082),
		      (((Class103_Sub3_Sub1) (((Class105_Sub1_Sub1_Sub2) this)
					      .aClass103_Sub3_Sub1_11348))
		       .anInt11080),
		      (((Class103_Sub3_Sub1) (((Class105_Sub1_Sub1_Sub2) this)
					      .aClass103_Sub3_Sub1_11348))
		       .aLong11081),
		      (((Class105_Sub1_Sub1_Sub2) this)
		       .aClass103_Sub3_Sub1_11348.anInt9623),
		      (((Class105_Sub1_Sub1_Sub2) this)
		       .aD3DPRESENT_PARAMETERS11349)))
		    throw new RuntimeException();
		int i = (((Class105_Sub1_Sub1_Sub2) this)
			 .aD3DPRESENT_PARAMETERS11349.AutoDepthStencilFormat);
		((Class105_Sub1_Sub1_Sub2) this).aLong11347
		    = (IDirect3DDevice.CreateAdditionalSwapChain
		       (((Class103_Sub3_Sub1)
			 (((Class105_Sub1_Sub1_Sub2) this)
			  .aClass103_Sub3_Sub1_11348)).aLong11097,
			(((Class105_Sub1_Sub1_Sub2) this)
			 .aD3DPRESENT_PARAMETERS11349)));
		((Class105_Sub1_Sub1_Sub2) this).aLong11344
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class105_Sub1_Sub1_Sub2) this).aLong11347, 0, 0));
		((Class105_Sub1_Sub1_Sub2) this).aLong11343
		    = (IDirect3DDevice.CreateDepthStencilSurface
		       (((Class103_Sub3_Sub1)
			 (((Class105_Sub1_Sub1_Sub2) this)
			  .aClass103_Sub3_Sub1_11348)).aLong11097,
			((Class105_Sub1_Sub1_Sub2) this).anInt11341,
			((Class105_Sub1_Sub1_Sub2) this).anInt11346, i,
			(((Class105_Sub1_Sub1_Sub2) this)
			 .aD3DPRESENT_PARAMETERS11349.MultiSampleType),
			(((Class105_Sub1_Sub1_Sub2) this)
			 .aD3DPRESENT_PARAMETERS11349.MultiSampleQuality),
			false));
	    }
	    ((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
		.method17509(this);
	}
	if (((Class105_Sub1_Sub1_Sub2) this).aBool11342)
	    method162();
    }
    
    void method15433(int i, int i_5_) {
	method28();
	((Class105_Sub1_Sub1_Sub2) this).anInt11341 = i;
	((Class105_Sub1_Sub1_Sub2) this).anInt11346 = i_5_;
	if (((Class105_Sub1_Sub1_Sub2) this).aBool11345)
	    ((Class105_Sub1_Sub1_Sub2) this).aClass103_Sub3_Sub1_11348
		.method17457
		(((Class105_Sub1_Sub1_Sub2) this).anInt11341,
		 ((Class105_Sub1_Sub1_Sub2) this).anInt11346);
	method163();
	super.method15436(i, i_5_);
    }
    
    public int method2660() {
	return ((Class105_Sub1_Sub1_Sub2) this).anInt11346;
    }
    
    public int method15434() {
	return IDirect3DSwapChain
		   .Present(((Class105_Sub1_Sub1_Sub2) this).aLong11347, 0);
    }
    
    public int method15437() {
	return IDirect3DSwapChain
		   .Present(((Class105_Sub1_Sub1_Sub2) this).aLong11347, 0);
    }
    
    public int method15441(int i, int i_6_) {
	return IDirect3DSwapChain
		   .Present(((Class105_Sub1_Sub1_Sub2) this).aLong11347, 0);
    }
    
    void method17744() throws Throwable {
	method17742();
	super.finalize();
    }
    
    void method17745() throws Throwable {
	method17742();
	super.finalize();
    }
    
    void method17746() throws Throwable {
	method17742();
	super.finalize();
    }
    
    public int method15439() {
	return IDirect3DSwapChain
		   .Present(((Class105_Sub1_Sub1_Sub2) this).aLong11347, 0);
    }
    
    boolean method2659() {
	((Class105_Sub1_Sub1_Sub2) this).aBool11342 = false;
	return Class28.method958(IDirect3DDevice.SetDepthStencilSurface
				 (((Class103_Sub3_Sub1)
				   (((Class105_Sub1_Sub1_Sub2) this)
				    .aClass103_Sub3_Sub1_11348)).aLong11097,
				  0L));
    }
}
