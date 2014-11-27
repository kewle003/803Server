/* Class105_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class105_Sub2_Sub1 extends Class105_Sub2
{
    int anInt10648;
    Class103_Sub1 aClass103_Sub1_10649;
    int anInt10650;
    Interface9[] anInterface9Array10651 = new Interface9[4];
    int anInt10652;
    int anInt10653;
    static final int anInt10654 = 16;
    Interface9 anInterface9_10655;
    int anInt10656;
    
    public void method15592(Interface5 interface5) {
	Interface9 interface9 = (Interface9) interface5;
	if (interface5 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | 0x10) != 16) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= 0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= ~0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16914();
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= 0x10;
    }
    
    Class105_Sub2_Sub1(Class103_Sub1 class103_sub1) {
	if (!((Class103_Sub1) class103_sub1).aBool9201)
	    throw new IllegalStateException("");
	((Class105_Sub2_Sub1) this).aClass103_Sub1_10649 = class103_sub1;
	int[] is = new int[1];
	OpenGL.glGenFramebuffersEXT(1, is, 0);
	((Class105_Sub2_Sub1) this).anInt10648 = is[0];
    }
    
    public int method2654() {
	return ((Class105_Sub2_Sub1) this).anInt10652;
    }
    
    public void method15585(int i, Interface4 interface4) {
	int i_0_ = 1 << i;
	Interface9 interface9 = (Interface9) interface4;
	if (interface4 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | i_0_) != i_0_) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= i_0_;
	    ((Class105_Sub2_Sub1) this).anInterface9Array10651[i] = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= i_0_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub1) this).anInterface9Array10651[i] = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16913(i);
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= i_0_;
    }
    
    public void method15584(Interface5 interface5) {
	Interface9 interface9 = (Interface9) interface5;
	if (interface5 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | 0x10) != 16) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= 0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= ~0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16914();
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= 0x10;
    }
    
    void method16913(int i) {
	Interface9 interface9
	    = ((Class105_Sub2_Sub1) this).anInterface9Array10651[i];
	if (interface9 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface9.method59(36064 + i);
    }
    
    public void method15593(Interface5 interface5) {
	Interface9 interface9 = (Interface9) interface5;
	if (interface5 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | 0x10) != 16) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= 0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= ~0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16914();
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= 0x10;
    }
    
    void method16914() {
	if (((Class105_Sub2_Sub1) this).anInterface9_10655 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    ((Class105_Sub2_Sub1) this).anInterface9_10655.method59(36096);
    }
    
    boolean method162() {
	OpenGL.glBindFramebufferEXT(36160,
				    ((Class105_Sub2_Sub1) this).anInt10648);
	for (int i = 0; i < 4; i++) {
	    if ((((Class105_Sub2_Sub1) this).anInt10650 & 1 << i) != 0)
		method16913(i);
	}
	if ((((Class105_Sub2_Sub1) this).anInt10650 & 0x10) != 0)
	    method16914();
	((Class105_Sub2_Sub1) this).anInt10650 = 0;
	((Class105_Sub2_Sub1) this).aClass103_Sub1_10649.method15156();
	return true;
    }
    
    public int method2655() {
	return ((Class105_Sub2_Sub1) this).anInt10656;
    }
    
    void method16915(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    public boolean method15586() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public void method28() {
	if (((Class105_Sub2_Sub1) this).anInt10648 != 0) {
	    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
		.method15199(((Class105_Sub2_Sub1) this).anInt10648);
	    ((Class105_Sub2_Sub1) this).anInt10648 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	super.finalize();
	method28();
    }
    
    void method16916() throws Throwable {
	super.finalize();
	method28();
    }
    
    public int method2653() {
	return ((Class105_Sub2_Sub1) this).anInt10656;
    }
    
    public int method2657() {
	return ((Class105_Sub2_Sub1) this).anInt10656;
    }
    
    public void method15588(int i, Interface4 interface4) {
	int i_1_ = 1 << i;
	Interface9 interface9 = (Interface9) interface4;
	if (interface4 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | i_1_) != i_1_) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= i_1_;
	    ((Class105_Sub2_Sub1) this).anInterface9Array10651[i] = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= i_1_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub1) this).anInterface9Array10651[i] = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16913(i);
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= i_1_;
    }
    
    public void method15598(int i, Interface4 interface4) {
	int i_2_ = 1 << i;
	Interface9 interface9 = (Interface9) interface4;
	if (interface4 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | i_2_) != i_2_) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= i_2_;
	    ((Class105_Sub2_Sub1) this).anInterface9Array10651[i] = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= i_2_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub1) this).anInterface9Array10651[i] = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16913(i);
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= i_2_;
    }
    
    public void method15589(int i, Interface4 interface4) {
	int i_3_ = 1 << i;
	Interface9 interface9 = (Interface9) interface4;
	if (interface4 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | i_3_) != i_3_) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= i_3_;
	    ((Class105_Sub2_Sub1) this).anInterface9Array10651[i] = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= i_3_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub1) this).anInterface9Array10651[i] = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16913(i);
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= i_3_;
    }
    
    public int method2660() {
	return ((Class105_Sub2_Sub1) this).anInt10652;
    }
    
    public void method15587(int i, int i_4_, int i_5_, int i_6_, int i_7_,
			    int i_8_, boolean bool, boolean bool_9_) {
	if (bool | bool_9_) {
	    int i_10_ = ((Class105_Sub2_Sub1) this).anInt10652;
	    int i_11_
		= ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649.method2237
		      ((byte) 4).method2654();
	    int i_12_ = 0;
	    if (bool_9_)
		i_12_ |= 0x100;
	    if (bool)
		i_12_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, (((Class105_Sub2_Sub1) this)
						.anInt10648));
	    OpenGL.glBlitFramebufferEXT(i, i_10_ - i_4_ - i_6_, i + i_5_,
					i_10_ - i_4_, i_7_,
					i_11_ - i_8_ - i_6_, i_7_ + i_5_,
					i_11_ - i_8_, i_12_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    void method16917(int i) {
	Interface9 interface9
	    = ((Class105_Sub2_Sub1) this).anInterface9Array10651[i];
	if (interface9 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface9.method59(36064 + i);
    }
    
    public int method2656() {
	return ((Class105_Sub2_Sub1) this).anInt10656;
    }
    
    public void method15590(Interface5 interface5) {
	Interface9 interface9 = (Interface9) interface5;
	if (interface5 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | 0x10) != 16) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= 0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= ~0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16914();
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= 0x10;
    }
    
    public void method15594(Interface5 interface5) {
	Interface9 interface9 = (Interface9) interface5;
	if (interface5 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | 0x10) != 16) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= 0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= ~0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16914();
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= 0x10;
    }
    
    public boolean method15596() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method2659() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    boolean method114() {
	OpenGL.glBindFramebufferEXT(36160,
				    ((Class105_Sub2_Sub1) this).anInt10648);
	for (int i = 0; i < 4; i++) {
	    if ((((Class105_Sub2_Sub1) this).anInt10650 & 1 << i) != 0)
		method16913(i);
	}
	if ((((Class105_Sub2_Sub1) this).anInt10650 & 0x10) != 0)
	    method16914();
	((Class105_Sub2_Sub1) this).anInt10650 = 0;
	((Class105_Sub2_Sub1) this).aClass103_Sub1_10649.method15156();
	return true;
    }
    
    public void method148() {
	if (((Class105_Sub2_Sub1) this).anInt10648 != 0) {
	    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
		.method15199(((Class105_Sub2_Sub1) this).anInt10648);
	    ((Class105_Sub2_Sub1) this).anInt10648 = 0;
	}
    }
    
    public void method15597(int i, int i_13_, int i_14_, int i_15_, int i_16_,
			    int i_17_, boolean bool, boolean bool_18_) {
	if (bool | bool_18_) {
	    int i_19_ = ((Class105_Sub2_Sub1) this).anInt10652;
	    int i_20_
		= ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649.method2237
		      ((byte) 4).method2654();
	    int i_21_ = 0;
	    if (bool_18_)
		i_21_ |= 0x100;
	    if (bool)
		i_21_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, (((Class105_Sub2_Sub1) this)
						.anInt10648));
	    OpenGL.glBlitFramebufferEXT(i, i_19_ - i_13_ - i_15_, i + i_14_,
					i_19_ - i_13_, i_16_,
					i_20_ - i_17_ - i_15_, i_16_ + i_14_,
					i_20_ - i_17_, i_21_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method15595(int i, int i_22_, int i_23_, int i_24_, int i_25_,
			    int i_26_, boolean bool, boolean bool_27_) {
	if (bool | bool_27_) {
	    int i_28_ = ((Class105_Sub2_Sub1) this).anInt10652;
	    int i_29_
		= ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649.method2237
		      ((byte) 4).method2654();
	    int i_30_ = 0;
	    if (bool_27_)
		i_30_ |= 0x100;
	    if (bool)
		i_30_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, (((Class105_Sub2_Sub1) this)
						.anInt10648));
	    OpenGL.glBlitFramebufferEXT(i, i_28_ - i_22_ - i_24_, i + i_23_,
					i_28_ - i_22_, i_25_,
					i_29_ - i_26_ - i_24_, i_25_ + i_23_,
					i_29_ - i_26_, i_30_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method15599(int i, int i_31_, int i_32_, int i_33_, int i_34_,
			    int i_35_, boolean bool, boolean bool_36_) {
	if (bool | bool_36_) {
	    int i_37_ = ((Class105_Sub2_Sub1) this).anInt10652;
	    int i_38_
		= ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649.method2237
		      ((byte) 4).method2654();
	    int i_39_ = 0;
	    if (bool_36_)
		i_39_ |= 0x100;
	    if (bool)
		i_39_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, (((Class105_Sub2_Sub1) this)
						.anInt10648));
	    OpenGL.glBlitFramebufferEXT(i, i_37_ - i_31_ - i_33_, i + i_32_,
					i_37_ - i_31_, i_34_,
					i_38_ - i_35_ - i_33_, i_34_ + i_32_,
					i_38_ - i_35_, i_39_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method15600(int i, int i_40_, int i_41_, int i_42_, int i_43_,
			    int i_44_, boolean bool, boolean bool_45_) {
	if (bool | bool_45_) {
	    int i_46_ = ((Class105_Sub2_Sub1) this).anInt10652;
	    int i_47_
		= ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649.method2237
		      ((byte) 4).method2654();
	    int i_48_ = 0;
	    if (bool_45_)
		i_48_ |= 0x100;
	    if (bool)
		i_48_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, (((Class105_Sub2_Sub1) this)
						.anInt10648));
	    OpenGL.glBlitFramebufferEXT(i, i_46_ - i_40_ - i_42_, i + i_41_,
					i_46_ - i_40_, i_43_,
					i_47_ - i_44_ - i_42_, i_43_ + i_41_,
					i_47_ - i_44_, i_48_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method15583(int i, Interface4 interface4) {
	int i_49_ = 1 << i;
	Interface9 interface9 = (Interface9) interface4;
	if (interface4 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | i_49_) != i_49_) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= i_49_;
	    ((Class105_Sub2_Sub1) this).anInterface9Array10651[i] = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= i_49_ ^ 0xffffffff;
	    ((Class105_Sub2_Sub1) this).anInterface9Array10651[i] = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16913(i);
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= i_49_;
    }
    
    boolean method2658() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public void method149() {
	if (((Class105_Sub2_Sub1) this).anInt10648 != 0) {
	    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
		.method15199(((Class105_Sub2_Sub1) this).anInt10648);
	    ((Class105_Sub2_Sub1) this).anInt10648 = 0;
	}
    }
    
    public void method15591(Interface5 interface5) {
	Interface9 interface9 = (Interface9) interface5;
	if (interface5 != null) {
	    if ((((Class105_Sub2_Sub1) this).anInt10653 | 0x10) != 16) {
		if ((((Class105_Sub2_Sub1) this).anInt10656
		     != interface9.method55())
		    || (((Class105_Sub2_Sub1) this).anInt10652
			!= interface9.method49()))
		    throw new RuntimeException();
	    } else {
		((Class105_Sub2_Sub1) this).anInt10652 = interface9.method49();
		((Class105_Sub2_Sub1) this).anInt10656 = interface9.method55();
		if (this == ((Class105_Sub2_Sub1) this)
				.aClass103_Sub1_10649.method2237((byte) 4))
		    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method15133();
	    }
	    ((Class105_Sub2_Sub1) this).anInt10653 |= 0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = interface9;
	} else {
	    ((Class105_Sub2_Sub1) this).anInt10653 &= ~0x10;
	    ((Class105_Sub2_Sub1) this).anInterface9_10655 = null;
	    if (((Class105_Sub2_Sub1) this).anInt10653 == 0) {
		((Class105_Sub2_Sub1) this).anInt10652 = 0;
		((Class105_Sub2_Sub1) this).anInt10656 = 0;
	    }
	}
	if (this == ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
			.method2237((byte) 4))
	    method16914();
	else
	    ((Class105_Sub2_Sub1) this).anInt10650 |= 0x10;
    }
    
    void method16918() throws Throwable {
	super.finalize();
	method28();
    }
    
    void method16919() throws Throwable {
	super.finalize();
	method28();
    }
    
    boolean method115() {
	OpenGL.glBindFramebufferEXT(36160,
				    ((Class105_Sub2_Sub1) this).anInt10648);
	for (int i = 0; i < 4; i++) {
	    if ((((Class105_Sub2_Sub1) this).anInt10650 & 1 << i) != 0)
		method16913(i);
	}
	if ((((Class105_Sub2_Sub1) this).anInt10650 & 0x10) != 0)
	    method16914();
	((Class105_Sub2_Sub1) this).anInt10650 = 0;
	((Class105_Sub2_Sub1) this).aClass103_Sub1_10649.method15156();
	return true;
    }
    
    void method16920() throws Throwable {
	super.finalize();
	method28();
    }
    
    void method16921(int i) {
	Interface9 interface9
	    = ((Class105_Sub2_Sub1) this).anInterface9Array10651[i];
	if (interface9 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface9.method59(36064 + i);
    }
    
    public void method164() {
	if (((Class105_Sub2_Sub1) this).anInt10648 != 0) {
	    ((Class105_Sub2_Sub1) this).aClass103_Sub1_10649
		.method15199(((Class105_Sub2_Sub1) this).anInt10648);
	    ((Class105_Sub2_Sub1) this).anInt10648 = 0;
	}
    }
    
    void method16922(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    void method16923(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
}
