/* Class105_Sub2_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class105_Sub2_Sub3_Sub2 extends Class105_Sub2_Sub3
{
    Interface21[] anInterface21Array11441 = new Interface21[4];
    Class103_Sub3_Sub2 aClass103_Sub3_Sub2_11442;
    int anInt11443;
    int anInt11444;
    int anInt11445;
    int anInt11446;
    int anInt11447;
    Interface21 anInterface21_11448;
    static final int anInt11449 = 16;
    
    public void method149() {
	if (((Class105_Sub2_Sub3_Sub2) this).anInt11443 != 0) {
	    ((Class105_Sub2_Sub3_Sub2) this).aClass103_Sub3_Sub2_11442
		.method17550(((Class105_Sub2_Sub3_Sub2) this).anInt11443);
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11443 = 0;
	}
    }
    
    public int method2655() {
	return ((Class105_Sub2_Sub3_Sub2) this).anInt11444;
    }
    
    Class105_Sub2_Sub3_Sub2(Class103_Sub3_Sub2 class103_sub3_sub2) {
	super((Class103_Sub3) class103_sub3_sub2);
	((Class105_Sub2_Sub3_Sub2) this).aClass103_Sub3_Sub2_11442
	    = class103_sub3_sub2;
	int[] is = new int[1];
	if (!((Class105_Sub2_Sub3_Sub2) this).aClass103_Sub3_Sub2_11442
	     .aBool9549)
	    throw new RuntimeException("");
	OpenGL.glGenFramebuffersEXT(1, is, 0);
	((Class105_Sub2_Sub3_Sub2) this).anInt11443 = is[0];
    }
    
    public void method15585(int i, Interface4 interface4) {
	int i_0_ = 1 << i;
	Interface21 interface21 = (Interface21) interface4;
	if (interface4 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= i_0_;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i]
		= interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= i_0_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i] = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17872(i);
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= i_0_;
    }
    
    public void method15584(Interface5 interface5) {
	Interface21 interface21 = (Interface21) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17873();
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= 0x10;
    }
    
    void method17872(int i) {
	Interface21 interface21
	    = ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i];
	if (interface21 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface21.method59(36064 + i);
    }
    
    void method17873() {
	if (((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448
		.method59(36096);
    }
    
    public boolean method15586() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method115() {
	OpenGL.glBindFramebufferEXT(36160, (((Class105_Sub2_Sub3_Sub2) this)
					    .anInt11443));
	for (int i = 0; i < 4; i++) {
	    if ((((Class105_Sub2_Sub3_Sub2) this).anInt11447 & 1 << i) != 0)
		method17872(i);
	}
	if ((((Class105_Sub2_Sub3_Sub2) this).anInt11447 & 0x10) != 0)
	    method17873();
	((Class105_Sub2_Sub3_Sub2) this).anInt11447 = 0;
	return super.method162();
    }
    
    boolean method2659() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public void method148() {
	if (((Class105_Sub2_Sub3_Sub2) this).anInt11443 != 0) {
	    ((Class105_Sub2_Sub3_Sub2) this).aClass103_Sub3_Sub2_11442
		.method17550(((Class105_Sub2_Sub3_Sub2) this).anInt11443);
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11443 = 0;
	}
    }
    
    public void method28() {
	if (((Class105_Sub2_Sub3_Sub2) this).anInt11443 != 0) {
	    ((Class105_Sub2_Sub3_Sub2) this).aClass103_Sub3_Sub2_11442
		.method17550(((Class105_Sub2_Sub3_Sub2) this).anInt11443);
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11443 = 0;
	}
    }
    
    public void method15589(int i, Interface4 interface4) {
	int i_1_ = 1 << i;
	Interface21 interface21 = (Interface21) interface4;
	if (interface4 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= i_1_;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i]
		= interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= i_1_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i] = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17872(i);
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= i_1_;
    }
    
    public int method2656() {
	return ((Class105_Sub2_Sub3_Sub2) this).anInt11444;
    }
    
    public int method2653() {
	return ((Class105_Sub2_Sub3_Sub2) this).anInt11444;
    }
    
    public int method2657() {
	return ((Class105_Sub2_Sub3_Sub2) this).anInt11444;
    }
    
    public void method15588(int i, Interface4 interface4) {
	int i_2_ = 1 << i;
	Interface21 interface21 = (Interface21) interface4;
	if (interface4 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= i_2_;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i]
		= interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= i_2_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i] = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17872(i);
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= i_2_;
    }
    
    boolean method162() {
	OpenGL.glBindFramebufferEXT(36160, (((Class105_Sub2_Sub3_Sub2) this)
					    .anInt11443));
	for (int i = 0; i < 4; i++) {
	    if ((((Class105_Sub2_Sub3_Sub2) this).anInt11447 & 1 << i) != 0)
		method17872(i);
	}
	if ((((Class105_Sub2_Sub3_Sub2) this).anInt11447 & 0x10) != 0)
	    method17873();
	((Class105_Sub2_Sub3_Sub2) this).anInt11447 = 0;
	return super.method162();
    }
    
    public void method15595(int i, int i_3_, int i_4_, int i_5_, int i_6_,
			    int i_7_, boolean bool, boolean bool_8_) {
	if (bool | bool_8_) {
	    int i_9_ = ((Class105_Sub2_Sub3_Sub2) this).anInt11445;
	    int i_10_ = ((Class105_Sub2_Sub3_Sub2) this)
			    .aClass103_Sub3_Sub2_11442.method2237
			    ((byte) 4).method2654();
	    int i_11_ = 0;
	    if (bool_8_)
		i_11_ |= 0x100;
	    if (bool)
		i_11_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008,
					(((Class105_Sub2_Sub3_Sub2) this)
					 .anInt11443));
	    OpenGL.glBlitFramebufferEXT(i, i_9_ - i_3_ - i_5_, i + i_4_,
					i_9_ - i_3_, i_6_, i_10_ - i_7_ - i_5_,
					i_6_ + i_4_, i_10_ - i_7_, i_11_,
					9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    void method17874() throws Throwable {
	super.finalize();
	method28();
    }
    
    public void method15591(Interface5 interface5) {
	Interface21 interface21 = (Interface21) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17873();
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= 0x10;
    }
    
    public void method15592(Interface5 interface5) {
	Interface21 interface21 = (Interface21) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17873();
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= 0x10;
    }
    
    public void method15593(Interface5 interface5) {
	Interface21 interface21 = (Interface21) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17873();
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= 0x10;
    }
    
    public void method15587(int i, int i_12_, int i_13_, int i_14_, int i_15_,
			    int i_16_, boolean bool, boolean bool_17_) {
	if (bool | bool_17_) {
	    int i_18_ = ((Class105_Sub2_Sub3_Sub2) this).anInt11445;
	    int i_19_ = ((Class105_Sub2_Sub3_Sub2) this)
			    .aClass103_Sub3_Sub2_11442.method2237
			    ((byte) 4).method2654();
	    int i_20_ = 0;
	    if (bool_17_)
		i_20_ |= 0x100;
	    if (bool)
		i_20_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008,
					(((Class105_Sub2_Sub3_Sub2) this)
					 .anInt11443));
	    OpenGL.glBlitFramebufferEXT(i, i_18_ - i_12_ - i_14_, i + i_13_,
					i_18_ - i_12_, i_15_,
					i_19_ - i_16_ - i_14_, i_15_ + i_13_,
					i_19_ - i_16_, i_20_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method15594(Interface5 interface5) {
	Interface21 interface21 = (Interface21) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17873();
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= 0x10;
    }
    
    public boolean method15596() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    void method17875() throws Throwable {
	super.finalize();
	method28();
    }
    
    boolean method114() {
	OpenGL.glBindFramebufferEXT(36160, (((Class105_Sub2_Sub3_Sub2) this)
					    .anInt11443));
	for (int i = 0; i < 4; i++) {
	    if ((((Class105_Sub2_Sub3_Sub2) this).anInt11447 & 1 << i) != 0)
		method17872(i);
	}
	if ((((Class105_Sub2_Sub3_Sub2) this).anInt11447 & 0x10) != 0)
	    method17873();
	((Class105_Sub2_Sub3_Sub2) this).anInt11447 = 0;
	return super.method162();
    }
    
    boolean method2658() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public void method15598(int i, Interface4 interface4) {
	int i_21_ = 1 << i;
	Interface21 interface21 = (Interface21) interface4;
	if (interface4 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= i_21_;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i]
		= interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= i_21_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i] = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17872(i);
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= i_21_;
    }
    
    public void method15590(Interface5 interface5) {
	Interface21 interface21 = (Interface21) interface5;
	if (interface5 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= 0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= ~0x10;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17873();
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= 0x10;
    }
    
    public void method15599(int i, int i_22_, int i_23_, int i_24_, int i_25_,
			    int i_26_, boolean bool, boolean bool_27_) {
	if (bool | bool_27_) {
	    int i_28_ = ((Class105_Sub2_Sub3_Sub2) this).anInt11445;
	    int i_29_ = ((Class105_Sub2_Sub3_Sub2) this)
			    .aClass103_Sub3_Sub2_11442.method2237
			    ((byte) 4).method2654();
	    int i_30_ = 0;
	    if (bool_27_)
		i_30_ |= 0x100;
	    if (bool)
		i_30_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008,
					(((Class105_Sub2_Sub3_Sub2) this)
					 .anInt11443));
	    OpenGL.glBlitFramebufferEXT(i, i_28_ - i_22_ - i_24_, i + i_23_,
					i_28_ - i_22_, i_25_,
					i_29_ - i_26_ - i_24_, i_25_ + i_23_,
					i_29_ - i_26_, i_30_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method15597(int i, int i_31_, int i_32_, int i_33_, int i_34_,
			    int i_35_, boolean bool, boolean bool_36_) {
	if (bool | bool_36_) {
	    int i_37_ = ((Class105_Sub2_Sub3_Sub2) this).anInt11445;
	    int i_38_ = ((Class105_Sub2_Sub3_Sub2) this)
			    .aClass103_Sub3_Sub2_11442.method2237
			    ((byte) 4).method2654();
	    int i_39_ = 0;
	    if (bool_36_)
		i_39_ |= 0x100;
	    if (bool)
		i_39_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008,
					(((Class105_Sub2_Sub3_Sub2) this)
					 .anInt11443));
	    OpenGL.glBlitFramebufferEXT(i, i_37_ - i_31_ - i_33_, i + i_32_,
					i_37_ - i_31_, i_34_,
					i_38_ - i_35_ - i_33_, i_34_ + i_32_,
					i_38_ - i_35_, i_39_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method164() {
	if (((Class105_Sub2_Sub3_Sub2) this).anInt11443 != 0) {
	    ((Class105_Sub2_Sub3_Sub2) this).aClass103_Sub3_Sub2_11442
		.method17550(((Class105_Sub2_Sub3_Sub2) this).anInt11443);
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11443 = 0;
	}
    }
    
    public void method15600(int i, int i_40_, int i_41_, int i_42_, int i_43_,
			    int i_44_, boolean bool, boolean bool_45_) {
	if (bool | bool_45_) {
	    int i_46_ = ((Class105_Sub2_Sub3_Sub2) this).anInt11445;
	    int i_47_ = ((Class105_Sub2_Sub3_Sub2) this)
			    .aClass103_Sub3_Sub2_11442.method2237
			    ((byte) 4).method2654();
	    int i_48_ = 0;
	    if (bool_45_)
		i_48_ |= 0x100;
	    if (bool)
		i_48_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008,
					(((Class105_Sub2_Sub3_Sub2) this)
					 .anInt11443));
	    OpenGL.glBlitFramebufferEXT(i, i_46_ - i_40_ - i_42_, i + i_41_,
					i_46_ - i_40_, i_43_,
					i_47_ - i_44_ - i_42_, i_43_ + i_41_,
					i_47_ - i_44_, i_48_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    void method17876() throws Throwable {
	super.finalize();
	method28();
    }
    
    public int method2660() {
	return ((Class105_Sub2_Sub3_Sub2) this).anInt11445;
    }
    
    void method17877() throws Throwable {
	super.finalize();
	method28();
    }
    
    void method17878() {
	if (((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448
		.method59(36096);
    }
    
    public void method15583(int i, Interface4 interface4) {
	int i_49_ = 1 << i;
	Interface21 interface21 = (Interface21) interface4;
	if (interface4 != null) {
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 != 0) {
		if ((((Class105_Sub2_Sub3_Sub2) this).anInt11444
		     != interface21.method55())
		    || (((Class105_Sub2_Sub3_Sub2) this).anInt11445
			!= interface21.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445
		    = interface21.method49();
		((Class105_Sub2_Sub3_Sub2) this).anInt11444
		    = interface21.method55();
		method16933();
	    }
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 |= i_49_;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i]
		= interface21;
	} else {
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11446 &= i_49_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i] = null;
	    if (((Class105_Sub2_Sub3_Sub2) this).anInt11446 == 0) {
		((Class105_Sub2_Sub3_Sub2) this).anInt11445 = 0;
		((Class105_Sub2_Sub3_Sub2) this).anInt11444 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub3_Sub2) this)
			.aClass103_Sub3_Sub2_11442.method2237((byte) 4))
	    method17872(i);
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInt11447 |= i_49_;
    }
    
    public void finalize() throws Throwable {
	super.finalize();
	method28();
    }
    
    void method17879(int i) {
	Interface21 interface21
	    = ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i];
	if (interface21 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface21.method59(36064 + i);
    }
    
    void method17880(int i) {
	Interface21 interface21
	    = ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i];
	if (interface21 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface21.method59(36064 + i);
    }
    
    public int method2654() {
	return ((Class105_Sub2_Sub3_Sub2) this).anInt11445;
    }
    
    void method17881() {
	if (((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    ((Class105_Sub2_Sub3_Sub2) this).anInterface21_11448
		.method59(36096);
    }
    
    void method17882(int i) {
	Interface21 interface21
	    = ((Class105_Sub2_Sub3_Sub2) this).anInterface21Array11441[i];
	if (interface21 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface21.method59(36064 + i);
    }
}
