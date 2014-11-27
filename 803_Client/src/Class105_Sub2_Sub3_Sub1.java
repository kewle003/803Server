/* Class105_Sub2_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class105_Sub2_Sub3_Sub1 extends Class105_Sub2_Sub3
{
    Interface36 anInterface36_11228 = null;
    Class103_Sub3_Sub1 aClass103_Sub3_Sub1_11229;
    int anInt11230;
    int anInt11231;
    Interface35[] anInterface35Array11232 = new Interface35[4];
    boolean aBool11233;
    static final int anInt11234 = 16;
    int anInt11235;
    
    void method17616() throws Throwable {
	method17621();
	super.finalize();
    }
    
    public int method2655() {
	return ((Class105_Sub2_Sub3_Sub1) this).anInt11230;
    }
    
    public int method2654() {
	return ((Class105_Sub2_Sub3_Sub1) this).anInt11231;
    }
    
    public void method15584(Interface5 interface5) {
	Interface36 interface36 = (Interface36) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface36.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface36.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface36.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface36.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = interface36;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(interface36.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    public void method15585(int i, Interface4 interface4) {
	int i_0_ = 1 << i;
	Interface35 interface35 = (Interface35) interface4;
	if (interface4 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface35.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface35.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface35.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface35.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= i_0_;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		= interface35;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17617(i, interface35.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= i_0_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i] = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17617(i, 0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    boolean method17617(int i, long l) {
	return Class28.method958(IDirect3DDevice.SetRenderTarget
				 (((Class103_Sub3_Sub1)
				   (((Class105_Sub2_Sub3_Sub1) this)
				    .aClass103_Sub3_Sub1_11229)).aLong11097,
				  i, l));
    }
    
    Class105_Sub2_Sub3_Sub1(Class103_Sub3_Sub1 class103_sub3_sub1) {
	super((Class103_Sub3) class103_sub3_sub1);
	((Class105_Sub2_Sub3_Sub1) this).aClass103_Sub3_Sub1_11229
	    = class103_sub3_sub1;
    }
    
    public boolean method15586() {
	return (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[0]
		!= null);
    }
    
    boolean method162() {
	for (int i = 0; i < 4; i++) {
	    Interface35 interface35
		= ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i];
	    if (interface35 != null) {
		long l = interface35.method57();
		method17617(i, l);
	    }
	}
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    method17620(((Class105_Sub2_Sub3_Sub1) this)
			    .anInterface36_11228.method57());
	((Class105_Sub2_Sub3_Sub1) this).aBool11233 = true;
	return super.method162();
    }
    
    boolean method17618(long l) {
	return Class28.method958(IDirect3DDevice.SetDepthStencilSurface
				 (((Class103_Sub3_Sub1)
				   (((Class105_Sub2_Sub3_Sub1) this)
				    .aClass103_Sub3_Sub1_11229)).aLong11097,
				  l));
    }
    
    void method17619() throws Throwable {
	method17621();
	super.finalize();
    }
    
    boolean method17620(long l) {
	return Class28.method958(IDirect3DDevice.SetDepthStencilSurface
				 (((Class103_Sub3_Sub1)
				   (((Class105_Sub2_Sub3_Sub1) this)
				    .aClass103_Sub3_Sub1_11229)).aLong11097,
				  l));
    }
    
    public int method2653() {
	return ((Class105_Sub2_Sub3_Sub1) this).anInt11230;
    }
    
    public void finalize() throws Throwable {
	method17621();
	super.finalize();
    }
    
    public int method2656() {
	return ((Class105_Sub2_Sub3_Sub1) this).anInt11230;
    }
    
    public void method149() {
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228.method28();
	for (int i = 0; i < (((Class105_Sub2_Sub3_Sub1) this)
			     .anInterface35Array11232).length; i++) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		!= null)
		((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		    .method28();
	}
    }
    
    public int method2657() {
	return ((Class105_Sub2_Sub3_Sub1) this).anInt11230;
    }
    
    public void method15588(int i, Interface4 interface4) {
	int i_1_ = 1 << i;
	Interface35 interface35 = (Interface35) interface4;
	if (interface4 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface35.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface35.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface35.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface35.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= i_1_;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		= interface35;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17617(i, interface35.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= i_1_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i] = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17617(i, 0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    public void method15598(int i, Interface4 interface4) {
	int i_2_ = 1 << i;
	Interface35 interface35 = (Interface35) interface4;
	if (interface4 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface35.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface35.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface35.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface35.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= i_2_;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		= interface35;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17617(i, interface35.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= i_2_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i] = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17617(i, 0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    void method17621() {
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228.method192();
	for (int i = 0; i < (((Class105_Sub2_Sub3_Sub1) this)
			     .anInterface35Array11232).length; i++) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		!= null)
		((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		    .method192();
	}
    }
    
    public void method15583(int i, Interface4 interface4) {
	int i_3_ = 1 << i;
	Interface35 interface35 = (Interface35) interface4;
	if (interface4 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface35.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface35.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface35.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface35.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= i_3_;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		= interface35;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17617(i, interface35.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= i_3_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i] = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17617(i, 0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    public void method15591(Interface5 interface5) {
	Interface36 interface36 = (Interface36) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface36.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface36.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface36.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface36.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = interface36;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(interface36.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    public void method15592(Interface5 interface5) {
	Interface36 interface36 = (Interface36) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface36.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface36.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface36.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface36.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = interface36;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(interface36.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    public void method15593(Interface5 interface5) {
	Interface36 interface36 = (Interface36) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface36.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface36.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface36.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface36.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = interface36;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(interface36.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    public void method15590(Interface5 interface5) {
	Interface36 interface36 = (Interface36) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface36.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface36.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface36.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface36.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = interface36;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(interface36.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    public boolean method15596() {
	return (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[0]
		!= null);
    }
    
    void method17622() throws Throwable {
	method17621();
	super.finalize();
    }
    
    boolean method115() {
	for (int i = 0; i < 4; i++) {
	    Interface35 interface35
		= ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i];
	    if (interface35 != null) {
		long l = interface35.method57();
		method17617(i, l);
	    }
	}
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    method17620(((Class105_Sub2_Sub3_Sub1) this)
			    .anInterface36_11228.method57());
	((Class105_Sub2_Sub3_Sub1) this).aBool11233 = true;
	return super.method162();
    }
    
    boolean method114() {
	for (int i = 0; i < 4; i++) {
	    Interface35 interface35
		= ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i];
	    if (interface35 != null) {
		long l = interface35.method57();
		method17617(i, l);
	    }
	}
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    method17620(((Class105_Sub2_Sub3_Sub1) this)
			    .anInterface36_11228.method57());
	((Class105_Sub2_Sub3_Sub1) this).aBool11233 = true;
	return super.method162();
    }
    
    public void method15589(int i, Interface4 interface4) {
	int i_4_ = 1 << i;
	Interface35 interface35 = (Interface35) interface4;
	if (interface4 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface35.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface35.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface35.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface35.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= i_4_;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		= interface35;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17617(i, interface35.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= i_4_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i] = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17617(i, 0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    void method17623() {
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228.method192();
	for (int i = 0; i < (((Class105_Sub2_Sub3_Sub1) this)
			     .anInterface35Array11232).length; i++) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		!= null)
		((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		    .method192();
	}
    }
    
    public void method15595(int i, int i_5_, int i_6_, int i_7_, int i_8_,
			    int i_9_, boolean bool, boolean bool_10_) {
	if (bool) {
	    long l = (IDirect3DDevice.GetRenderTarget
		      ((((Class103_Sub3_Sub1) (((Class105_Sub2_Sub3_Sub1) this)
					       .aClass103_Sub3_Sub1_11229))
			.aLong11097),
		       0));
	    IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1)
					  (((Class105_Sub2_Sub3_Sub1) this)
					   .aClass103_Sub3_Sub1_11229))
					 .aLong11097),
					((Class105_Sub2_Sub3_Sub1) this)
					    .anInterface35Array11232[0]
					    .method57(),
					i, i_5_, i_6_, i_7_, l, i_8_, i_9_,
					i_6_, i_7_, 0);
	    IUnknown.Release(l);
	}
    }
    
    public void method15599(int i, int i_11_, int i_12_, int i_13_, int i_14_,
			    int i_15_, boolean bool, boolean bool_16_) {
	if (bool) {
	    long l = (IDirect3DDevice.GetRenderTarget
		      ((((Class103_Sub3_Sub1) (((Class105_Sub2_Sub3_Sub1) this)
					       .aClass103_Sub3_Sub1_11229))
			.aLong11097),
		       0));
	    IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1)
					  (((Class105_Sub2_Sub3_Sub1) this)
					   .aClass103_Sub3_Sub1_11229))
					 .aLong11097),
					((Class105_Sub2_Sub3_Sub1) this)
					    .anInterface35Array11232[0]
					    .method57(),
					i, i_11_, i_12_, i_13_, l, i_14_,
					i_15_, i_12_, i_13_, 0);
	    IUnknown.Release(l);
	}
    }
    
    public void method15600(int i, int i_17_, int i_18_, int i_19_, int i_20_,
			    int i_21_, boolean bool, boolean bool_22_) {
	if (bool) {
	    long l = (IDirect3DDevice.GetRenderTarget
		      ((((Class103_Sub3_Sub1) (((Class105_Sub2_Sub3_Sub1) this)
					       .aClass103_Sub3_Sub1_11229))
			.aLong11097),
		       0));
	    IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1)
					  (((Class105_Sub2_Sub3_Sub1) this)
					   .aClass103_Sub3_Sub1_11229))
					 .aLong11097),
					((Class105_Sub2_Sub3_Sub1) this)
					    .anInterface35Array11232[0]
					    .method57(),
					i, i_17_, i_18_, i_19_, l, i_20_,
					i_21_, i_18_, i_19_, 0);
	    IUnknown.Release(l);
	}
    }
    
    public void method28() {
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228.method28();
	for (int i = 0; i < (((Class105_Sub2_Sub3_Sub1) this)
			     .anInterface35Array11232).length; i++) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		!= null)
		((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		    .method28();
	}
    }
    
    public void method148() {
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228.method28();
	for (int i = 0; i < (((Class105_Sub2_Sub3_Sub1) this)
			     .anInterface35Array11232).length; i++) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		!= null)
		((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		    .method28();
	}
    }
    
    boolean method2658() {
	for (int i = 1; i < 4; i++) {
	    Interface35 interface35
		= ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i];
	    if (interface35 != null)
		method17617(i, 0L);
	}
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    method17620(0L);
	((Class105_Sub2_Sub3_Sub1) this).aBool11233 = false;
	return true;
    }
    
    public int method2660() {
	return ((Class105_Sub2_Sub3_Sub1) this).anInt11231;
    }
    
    public void method15594(Interface5 interface5) {
	Interface36 interface36 = (Interface36) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 != 0) {
		if ((((Class105_Sub2_Sub3_Sub1) this).anInt11230
		     != interface36.method55())
		    || (((Class105_Sub2_Sub3_Sub1) this).anInt11231
			!= interface36.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231
		    = interface36.method49();
		((Class105_Sub2_Sub3_Sub1) this).anInt11230
		    = interface36.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = interface36;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(interface36.method57());
	} else {
	    ((Class105_Sub2_Sub3_Sub1) this).anInt11235 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 = null;
	    if (((Class105_Sub2_Sub3_Sub1) this).aBool11233)
		method17620(0L);
	    if (((Class105_Sub2_Sub3_Sub1) this).anInt11235 == 0) {
		((Class105_Sub2_Sub3_Sub1) this).anInt11231 = 0;
		((Class105_Sub2_Sub3_Sub1) this).anInt11230 = 0;
	    }
	}
    }
    
    public void method15587(int i, int i_23_, int i_24_, int i_25_, int i_26_,
			    int i_27_, boolean bool, boolean bool_28_) {
	if (bool) {
	    long l = (IDirect3DDevice.GetRenderTarget
		      ((((Class103_Sub3_Sub1) (((Class105_Sub2_Sub3_Sub1) this)
					       .aClass103_Sub3_Sub1_11229))
			.aLong11097),
		       0));
	    IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1)
					  (((Class105_Sub2_Sub3_Sub1) this)
					   .aClass103_Sub3_Sub1_11229))
					 .aLong11097),
					((Class105_Sub2_Sub3_Sub1) this)
					    .anInterface35Array11232[0]
					    .method57(),
					i, i_23_, i_24_, i_25_, l, i_26_,
					i_27_, i_24_, i_25_, 0);
	    IUnknown.Release(l);
	}
    }
    
    boolean method2659() {
	for (int i = 1; i < 4; i++) {
	    Interface35 interface35
		= ((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i];
	    if (interface35 != null)
		method17617(i, 0L);
	}
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    method17620(0L);
	((Class105_Sub2_Sub3_Sub1) this).aBool11233 = false;
	return true;
    }
    
    void method17624() throws Throwable {
	method17621();
	super.finalize();
    }
    
    boolean method17625(int i, long l) {
	return Class28.method958(IDirect3DDevice.SetRenderTarget
				 (((Class103_Sub3_Sub1)
				   (((Class105_Sub2_Sub3_Sub1) this)
				    .aClass103_Sub3_Sub1_11229)).aLong11097,
				  i, l));
    }
    
    boolean method17626(int i, long l) {
	return Class28.method958(IDirect3DDevice.SetRenderTarget
				 (((Class103_Sub3_Sub1)
				   (((Class105_Sub2_Sub3_Sub1) this)
				    .aClass103_Sub3_Sub1_11229)).aLong11097,
				  i, l));
    }
    
    void method17627() {
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228.method192();
	for (int i = 0; i < (((Class105_Sub2_Sub3_Sub1) this)
			     .anInterface35Array11232).length; i++) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		!= null)
		((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		    .method192();
	}
    }
    
    boolean method17628(long l) {
	return Class28.method958(IDirect3DDevice.SetDepthStencilSurface
				 (((Class103_Sub3_Sub1)
				   (((Class105_Sub2_Sub3_Sub1) this)
				    .aClass103_Sub3_Sub1_11229)).aLong11097,
				  l));
    }
    
    boolean method17629(long l) {
	return Class28.method958(IDirect3DDevice.SetDepthStencilSurface
				 (((Class103_Sub3_Sub1)
				   (((Class105_Sub2_Sub3_Sub1) this)
				    .aClass103_Sub3_Sub1_11229)).aLong11097,
				  l));
    }
    
    boolean method17630(long l) {
	return Class28.method958(IDirect3DDevice.SetDepthStencilSurface
				 (((Class103_Sub3_Sub1)
				   (((Class105_Sub2_Sub3_Sub1) this)
				    .aClass103_Sub3_Sub1_11229)).aLong11097,
				  l));
    }
    
    public void method15597(int i, int i_29_, int i_30_, int i_31_, int i_32_,
			    int i_33_, boolean bool, boolean bool_34_) {
	if (bool) {
	    long l = (IDirect3DDevice.GetRenderTarget
		      ((((Class103_Sub3_Sub1) (((Class105_Sub2_Sub3_Sub1) this)
					       .aClass103_Sub3_Sub1_11229))
			.aLong11097),
		       0));
	    IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1)
					  (((Class105_Sub2_Sub3_Sub1) this)
					   .aClass103_Sub3_Sub1_11229))
					 .aLong11097),
					((Class105_Sub2_Sub3_Sub1) this)
					    .anInterface35Array11232[0]
					    .method57(),
					i, i_29_, i_30_, i_31_, l, i_32_,
					i_33_, i_30_, i_31_, 0);
	    IUnknown.Release(l);
	}
    }
    
    void method17631() {
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228.method192();
	for (int i = 0; i < (((Class105_Sub2_Sub3_Sub1) this)
			     .anInterface35Array11232).length; i++) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		!= null)
		((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		    .method192();
	}
    }
    
    void method17632() {
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228.method192();
	for (int i = 0; i < (((Class105_Sub2_Sub3_Sub1) this)
			     .anInterface35Array11232).length; i++) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		!= null)
		((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		    .method192();
	}
    }
    
    public void method164() {
	if (((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228 != null)
	    ((Class105_Sub2_Sub3_Sub1) this).anInterface36_11228.method28();
	for (int i = 0; i < (((Class105_Sub2_Sub3_Sub1) this)
			     .anInterface35Array11232).length; i++) {
	    if (((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		!= null)
		((Class105_Sub2_Sub3_Sub1) this).anInterface35Array11232[i]
		    .method28();
	}
    }
}
