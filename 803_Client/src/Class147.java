/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

import jaggl.OpenGL;

public abstract class Class147
{
    static final int anInt1693 = 34962;
    int anInt1694;
    Class103_Sub1 aClass103_Sub1_1695;
    boolean aBool1696;
    int anInt1697;
    int anInt1698;
    static int[] anIntArray1699 = new int[1];
    boolean aBool1700 = false;
    static final int anInt1701 = 34963;
    
    void method3212() throws Throwable {
	if (!((Class147) this).aBool1700) {
	    ((Class147) this).aClass103_Sub1_1695.method15197
		(((Class147) this).anInt1697, ((Class147) this).anInt1698);
	    ((Class147) this).aBool1700 = true;
	}
	super.finalize();
    }
    
    Class147(Class103_Sub1 class103_sub1, int i, byte[] is, int i_0_,
	     boolean bool) {
	((Class147) this).aClass103_Sub1_1695 = class103_sub1;
	((Class147) this).anInt1694 = i;
	((Class147) this).anInt1698 = i_0_;
	((Class147) this).aBool1696 = bool;
	OpenGL.glGenBuffersARB(1, anIntArray1699, 0);
	((Class147) this).anInt1697 = anIntArray1699[0];
	method3213();
	OpenGL.glBufferDataARBub(i, ((Class147) this).anInt1698, is, 0,
				 ((Class147) this).aBool1696 ? 35040 : 35044);
	((Class103_Sub1) ((Class147) this).aClass103_Sub1_1695).anInt9164
	    += ((Class147) this).anInt1698;
    }
    
    abstract void method3213();
    
    void method3214(byte[] is, int i) {
	method3213();
	if (i > ((Class147) this).anInt1698) {
	    OpenGL.glBufferDataARBub(((Class147) this).anInt1694, i, is, 0,
				     (((Class147) this).aBool1696 ? 35040
				      : 35044));
	    ((Class103_Sub1) ((Class147) this).aClass103_Sub1_1695).anInt9164
		+= i - ((Class147) this).anInt1698;
	    ((Class147) this).anInt1698 = i;
	} else
	    OpenGL.glBufferSubDataARBub(((Class147) this).anInt1694, 0, i, is,
					0);
    }
    
    public void finalize() throws Throwable {
	if (!((Class147) this).aBool1700) {
	    ((Class147) this).aClass103_Sub1_1695.method15197
		(((Class147) this).anInt1697, ((Class147) this).anInt1698);
	    ((Class147) this).aBool1700 = true;
	}
	super.finalize();
    }
    
    void method3215() throws Throwable {
	if (!((Class147) this).aBool1700) {
	    ((Class147) this).aClass103_Sub1_1695.method15197
		(((Class147) this).anInt1697, ((Class147) this).anInt1698);
	    ((Class147) this).aBool1700 = true;
	}
	super.finalize();
    }
    
    void method3216() throws Throwable {
	if (!((Class147) this).aBool1700) {
	    ((Class147) this).aClass103_Sub1_1695.method15197
		(((Class147) this).anInt1697, ((Class147) this).anInt1698);
	    ((Class147) this).aBool1700 = true;
	}
	super.finalize();
    }
    
    abstract void method3217();
    
    void method3218() throws Throwable {
	if (!((Class147) this).aBool1700) {
	    ((Class147) this).aClass103_Sub1_1695.method15197
		(((Class147) this).anInt1697, ((Class147) this).anInt1698);
	    ((Class147) this).aBool1700 = true;
	}
	super.finalize();
    }
    
    abstract void method3219();
    
    Class147(Class103_Sub1 class103_sub1, int i, Buffer buffer, int i_1_,
	     boolean bool) {
	((Class147) this).aClass103_Sub1_1695 = class103_sub1;
	((Class147) this).anInt1694 = i;
	((Class147) this).anInt1698 = i_1_;
	((Class147) this).aBool1696 = bool;
	OpenGL.glGenBuffersARB(1, anIntArray1699, 0);
	((Class147) this).anInt1697 = anIntArray1699[0];
	method3213();
	OpenGL.glBufferDataARBa(i, ((Class147) this).anInt1698,
				buffer.method98(),
				((Class147) this).aBool1696 ? 35040 : 35044);
	((Class103_Sub1) ((Class147) this).aClass103_Sub1_1695).anInt9164
	    += ((Class147) this).anInt1698;
    }
    
    void method3220(byte[] is, int i) {
	method3213();
	if (i > ((Class147) this).anInt1698) {
	    OpenGL.glBufferDataARBub(((Class147) this).anInt1694, i, is, 0,
				     (((Class147) this).aBool1696 ? 35040
				      : 35044));
	    ((Class103_Sub1) ((Class147) this).aClass103_Sub1_1695).anInt9164
		+= i - ((Class147) this).anInt1698;
	    ((Class147) this).anInt1698 = i;
	} else
	    OpenGL.glBufferSubDataARBub(((Class147) this).anInt1694, 0, i, is,
					0);
    }
    
    void method3221(byte[] is, int i) {
	method3213();
	if (i > ((Class147) this).anInt1698) {
	    OpenGL.glBufferDataARBub(((Class147) this).anInt1694, i, is, 0,
				     (((Class147) this).aBool1696 ? 35040
				      : 35044));
	    ((Class103_Sub1) ((Class147) this).aClass103_Sub1_1695).anInt9164
		+= i - ((Class147) this).anInt1698;
	    ((Class147) this).anInt1698 = i;
	} else
	    OpenGL.glBufferSubDataARBub(((Class147) this).anInt1694, 0, i, is,
					0);
    }
    
    abstract void method3222();
    
    void method3223(byte[] is, int i) {
	method3213();
	if (i > ((Class147) this).anInt1698) {
	    OpenGL.glBufferDataARBub(((Class147) this).anInt1694, i, is, 0,
				     (((Class147) this).aBool1696 ? 35040
				      : 35044));
	    ((Class103_Sub1) ((Class147) this).aClass103_Sub1_1695).anInt9164
		+= i - ((Class147) this).anInt1698;
	    ((Class147) this).anInt1698 = i;
	} else
	    OpenGL.glBufferSubDataARBub(((Class147) this).anInt1694, 0, i, is,
					0);
    }
}
