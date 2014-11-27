/* Class116_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class116_Sub1 extends Class116
{
    Class55_Sub2 aClass55_Sub2_10512;
    Class103_Sub3_Sub2 aClass103_Sub3_Sub2_10513;
    int anInt10514;
    
    void method16781() throws Throwable {
	method2856();
	super.finalize();
    }
    
    Class55 method2812(Class103_Sub3 class103_sub3, Class117 class117) {
	return new Class55_Sub2((Class103_Sub3_Sub2) class103_sub3, this,
				class117);
    }
    
    public boolean method2895(Class55 class55) {
	if (((Class116_Sub1) this).aClass55_Sub2_10512 == class55)
	    return true;
	if (!class55.method1311())
	    return false;
	boolean bool = method2874();
	((Class116_Sub1) this).aClass55_Sub2_10512 = (Class55_Sub2) class55;
	anInt1543 = method2813(class55, (byte) -50) * 1106389913;
	if (anInt1543 * -1423050583 == -1)
	    throw new IllegalArgumentException();
	((Class116_Sub1) this).anInt10514
	    = (((Class55_Sub2) ((Class116_Sub1) this).aClass55_Sub2_10512)
	       .anInt10548);
	if (bool) {
	    OpenGL.glUseProgram(((Class116_Sub1) this).anInt10514);
	    ((Class103_Sub3_Sub2)
	     ((Class116_Sub1) this).aClass103_Sub3_Sub2_10513)
		.aClass55_Sub2_11136
		= ((Class116_Sub1) this).aClass55_Sub2_10512;
	}
	return true;
    }
    
    Class241_Sub23_Sub1 method2896(Class115 class115) {
	return new Class241_Sub23_Sub1_Sub2(this, class115);
    }
    
    public boolean method2874() {
	return ((((Class103_Sub3_Sub2)
		  ((Class116_Sub1) this).aClass103_Sub3_Sub2_10513)
		 .aClass55_Sub2_11136)
		== ((Class116_Sub1) this).aClass55_Sub2_10512);
    }
    
    void method2914() {
	for (int i = 0; i < method2806(1863277660); i++)
	    ((Class55_Sub2) method2898(i, -1028110605)).method28();
	super.method2856();
    }
    
    public boolean method2860(Class55 class55) {
	if (((Class116_Sub1) this).aClass55_Sub2_10512 == class55)
	    return true;
	if (!class55.method1311())
	    return false;
	boolean bool = method2874();
	((Class116_Sub1) this).aClass55_Sub2_10512 = (Class55_Sub2) class55;
	anInt1543 = method2813(class55, (byte) -119) * 1106389913;
	if (anInt1543 * -1423050583 == -1)
	    throw new IllegalArgumentException();
	((Class116_Sub1) this).anInt10514
	    = (((Class55_Sub2) ((Class116_Sub1) this).aClass55_Sub2_10512)
	       .anInt10548);
	if (bool) {
	    OpenGL.glUseProgram(((Class116_Sub1) this).anInt10514);
	    ((Class103_Sub3_Sub2)
	     ((Class116_Sub1) this).aClass103_Sub3_Sub2_10513)
		.aClass55_Sub2_11136
		= ((Class116_Sub1) this).aClass55_Sub2_10512;
	}
	return true;
    }
    
    void method2856() {
	for (int i = 0; i < method2806(640362870); i++)
	    ((Class55_Sub2) method2898(i, 1787783755)).method28();
	super.method2856();
    }
    
    public void finalize() throws Throwable {
	method2856();
	super.finalize();
    }
    
    public void method2805() {
	if ((((Class103_Sub3_Sub2)
	      ((Class116_Sub1) this).aClass103_Sub3_Sub2_10513)
	     .aClass55_Sub2_11136)
	    != ((Class116_Sub1) this).aClass55_Sub2_10512) {
	    if (((Class116_Sub1) this).aClass55_Sub2_10512 == null)
		throw new RuntimeException_Sub5();
	    OpenGL.glUseProgram(((Class116_Sub1) this).anInt10514);
	    ((Class103_Sub3_Sub2)
	     ((Class116_Sub1) this).aClass103_Sub3_Sub2_10513)
		.aClass55_Sub2_11136
		= ((Class116_Sub1) this).aClass55_Sub2_10512;
	}
    }
    
    void method16782() throws Throwable {
	method2856();
	super.finalize();
    }
    
    void method16783() throws Throwable {
	method2856();
	super.finalize();
    }
    
    void method16784() throws Throwable {
	method2856();
	super.finalize();
    }
    
    public void method2844() {
	if ((((Class103_Sub3_Sub2)
	      ((Class116_Sub1) this).aClass103_Sub3_Sub2_10513)
	     .aClass55_Sub2_11136)
	    != ((Class116_Sub1) this).aClass55_Sub2_10512) {
	    if (((Class116_Sub1) this).aClass55_Sub2_10512 == null)
		throw new RuntimeException_Sub5();
	    OpenGL.glUseProgram(((Class116_Sub1) this).anInt10514);
	    ((Class103_Sub3_Sub2)
	     ((Class116_Sub1) this).aClass103_Sub3_Sub2_10513)
		.aClass55_Sub2_11136
		= ((Class116_Sub1) this).aClass55_Sub2_10512;
	}
    }
    
    public void method2845() {
	/* empty */
    }
    
    public boolean method2846() {
	return ((((Class103_Sub3_Sub2)
		  ((Class116_Sub1) this).aClass103_Sub3_Sub2_10513)
		 .aClass55_Sub2_11136)
		== ((Class116_Sub1) this).aClass55_Sub2_10512);
    }
    
    Class55 method2836(Class103_Sub3 class103_sub3, Class117 class117) {
	return new Class55_Sub2((Class103_Sub3_Sub2) class103_sub3, this,
				class117);
    }
    
    void method2915() {
	for (int i = 0; i < method2806(-1772127813); i++)
	    ((Class55_Sub2) method2898(i, 1784030725)).method28();
	super.method2856();
    }
    
    Class116_Sub1(Class103_Sub3_Sub2 class103_sub3_sub2, Class47 class47) {
	super((Class103_Sub3) class103_sub3_sub2, class47);
	((Class116_Sub1) this).aClass103_Sub3_Sub2_10513 = class103_sub3_sub2;
    }
    
    Class241_Sub23_Sub1 method2863(Class115 class115) {
	return new Class241_Sub23_Sub1_Sub2(this, class115);
    }
    
    public void method2911() {
	/* empty */
    }
    
    public boolean method2855(Class55 class55) {
	if (((Class116_Sub1) this).aClass55_Sub2_10512 == class55)
	    return true;
	if (!class55.method1311())
	    return false;
	boolean bool = method2874();
	((Class116_Sub1) this).aClass55_Sub2_10512 = (Class55_Sub2) class55;
	anInt1543 = method2813(class55, (byte) -12) * 1106389913;
	if (anInt1543 * -1423050583 == -1)
	    throw new IllegalArgumentException();
	((Class116_Sub1) this).anInt10514
	    = (((Class55_Sub2) ((Class116_Sub1) this).aClass55_Sub2_10512)
	       .anInt10548);
	if (bool) {
	    OpenGL.glUseProgram(((Class116_Sub1) this).anInt10514);
	    ((Class103_Sub3_Sub2)
	     ((Class116_Sub1) this).aClass103_Sub3_Sub2_10513)
		.aClass55_Sub2_11136
		= ((Class116_Sub1) this).aClass55_Sub2_10512;
	}
	return true;
    }
    
    void method2916() {
	for (int i = 0; i < method2806(957440113); i++)
	    ((Class55_Sub2) method2898(i, 329249494)).method28();
	super.method2856();
    }
}
