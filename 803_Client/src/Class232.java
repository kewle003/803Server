/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public abstract class Class232 implements Interface42
{
    Class103_Sub3_Sub2 aClass103_Sub3_Sub2_2687;
    static final int anInt2688 = 34963;
    boolean aBool2689;
    int anInt2690;
    int anInt2691;
    int anInt2692 = -1;
    static final int anInt2693 = 34962;
    int anInt2694;
    NativeHeapBuffer aNativeHeapBuffer2695;
    static int[] anIntArray2696 = new int[1];
    
    void method28() {
	if (((Class232) this).anInt2692 > 0) {
	    ((Class232) this).aClass103_Sub3_Sub2_2687.method17544
		(((Class232) this).anInt2692, ((Class232) this).anInt2691);
	    ((Class232) this).anInt2692 = -1;
	}
    }
    
    void method4673() {
	if (((Class232) this).anInt2692 < 0) {
	    if (((Class103_Sub3_Sub2)
		 ((Class232) this).aClass103_Sub3_Sub2_2687)
		.aBool11161) {
		OpenGL.glGenBuffersARB(1, anIntArray2696, 0);
		((Class232) this).anInt2692 = anIntArray2696[0];
		OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				       ((Class232) this).anInt2692);
	    } else
		((Class232) this).anInt2692 = 0;
	}
    }
    
    public long method262(int i, int i_0_) {
	OpenGL.glBindBufferARB(((Class232) this).anInt2690,
			       ((Class232) this).anInt2692);
	return (OpenGL.glMapBufferARB(((Class232) this).anInt2690, 35001)
		+ (long) i);
    }
    
    long method4674() {
	return (((Class232) this).anInt2692 == 0
		? ((Class232) this).aNativeHeapBuffer2695.method98() : 0L);
    }
    
    public void method40() {
	OpenGL.glUnmapBufferARB(((Class232) this).anInt2690);
    }
    
    public long method269(int i, int i_1_) {
	OpenGL.glBindBufferARB(((Class232) this).anInt2690,
			       ((Class232) this).anInt2692);
	return (OpenGL.glMapBufferARB(((Class232) this).anInt2690, 35001)
		+ (long) i);
    }
    
    public boolean method263(int i, int i_2_, long l) {
	method4673();
	if (((Class232) this).anInt2692 > 0) {
	    OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				   ((Class232) this).anInt2692);
	    OpenGL.glBufferSubDataARBa(((Class232) this).anInt2690, i, i_2_,
				       l);
	} else
	    ((Class232) this).aNativeHeapBuffer2695.aNativeHeap1074.copy
		(((Class232) this).aNativeHeapBuffer2695.method98() + (long) i,
		 l, i_2_);
	return true;
    }
    
    public void method192() {
	OpenGL.glUnmapBufferARB(((Class232) this).anInt2690);
    }
    
    public boolean method268(int i, int i_3_, long l) {
	method4673();
	if (((Class232) this).anInt2692 > 0) {
	    OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				   ((Class232) this).anInt2692);
	    OpenGL.glBufferSubDataARBa(((Class232) this).anInt2690, i, i_3_,
				       l);
	} else
	    ((Class232) this).aNativeHeapBuffer2695.aNativeHeap1074.copy
		(((Class232) this).aNativeHeapBuffer2695.method98() + (long) i,
		 l, i_3_);
	return true;
    }
    
    void method185(int i) {
	if (i > ((Class232) this).anInt2694) {
	    method4673();
	    if (((Class232) this).anInt2692 > 0) {
		OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				       ((Class232) this).anInt2692);
		OpenGL.glBufferDataARBub(((Class232) this).anInt2690, i, null,
					 0,
					 (((Class232) this).aBool2689 ? 35040
					  : 35044));
		((Class232) this).aClass103_Sub3_Sub2_2687.anInt9506
		    += i - ((Class232) this).anInt2694;
	    } else
		((Class232) this).aNativeHeapBuffer2695
		    = ((Class232) this).aClass103_Sub3_Sub2_2687
			  .method15946(i, false);
	    ((Class232) this).anInt2694 = i;
	}
	((Class232) this).anInt2691 = i;
    }
    
    public void finalize() throws Throwable {
	method28();
	super.finalize();
    }
    
    void method27() {
	if (((Class232) this).anInt2692 > 0) {
	    ((Class232) this).aClass103_Sub3_Sub2_2687.method17544
		(((Class232) this).anInt2692, ((Class232) this).anInt2691);
	    ((Class232) this).anInt2692 = -1;
	}
    }
    
    void method29() {
	if (((Class232) this).anInt2692 > 0) {
	    ((Class232) this).aClass103_Sub3_Sub2_2687.method17544
		(((Class232) this).anInt2692, ((Class232) this).anInt2691);
	    ((Class232) this).anInt2692 = -1;
	}
    }
    
    void method4675() throws Throwable {
	method28();
	super.finalize();
    }
    
    void method4676() throws Throwable {
	method28();
	super.finalize();
    }
    
    void method4677() throws Throwable {
	method28();
	super.finalize();
    }
    
    void method4678() throws Throwable {
	method28();
	super.finalize();
    }
    
    public int method147() {
	return ((Class232) this).anInt2691;
    }
    
    public int method53() {
	return ((Class232) this).anInt2691;
    }
    
    public int method266() {
	return ((Class232) this).anInt2691;
    }
    
    public boolean method270(int i, int i_4_, long l) {
	method4673();
	if (((Class232) this).anInt2692 > 0) {
	    OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				   ((Class232) this).anInt2692);
	    OpenGL.glBufferSubDataARBa(((Class232) this).anInt2690, i, i_4_,
				       l);
	} else
	    ((Class232) this).aNativeHeapBuffer2695.aNativeHeap1074.copy
		(((Class232) this).aNativeHeapBuffer2695.method98() + (long) i,
		 l, i_4_);
	return true;
    }
    
    void method4679() {
	if (((Class103_Sub3_Sub2) ((Class232) this).aClass103_Sub3_Sub2_2687)
	    .aBool11161)
	    OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				   ((Class232) this).anInt2692);
    }
    
    public boolean method264(int i, int i_5_, long l) {
	method4673();
	if (((Class232) this).anInt2692 > 0) {
	    OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				   ((Class232) this).anInt2692);
	    OpenGL.glBufferSubDataARBa(((Class232) this).anInt2690, i, i_5_,
				       l);
	} else
	    ((Class232) this).aNativeHeapBuffer2695.aNativeHeap1074.copy
		(((Class232) this).aNativeHeapBuffer2695.method98() + (long) i,
		 l, i_5_);
	return true;
    }
    
    void method4680() {
	if (((Class232) this).anInt2692 < 0) {
	    if (((Class103_Sub3_Sub2)
		 ((Class232) this).aClass103_Sub3_Sub2_2687)
		.aBool11161) {
		OpenGL.glGenBuffersARB(1, anIntArray2696, 0);
		((Class232) this).anInt2692 = anIntArray2696[0];
		OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				       ((Class232) this).anInt2692);
	    } else
		((Class232) this).anInt2692 = 0;
	}
    }
    
    public long method267(int i, int i_6_) {
	OpenGL.glBindBufferARB(((Class232) this).anInt2690,
			       ((Class232) this).anInt2692);
	return (OpenGL.glMapBufferARB(((Class232) this).anInt2690, 35001)
		+ (long) i);
    }
    
    public long method271(int i, int i_7_) {
	OpenGL.glBindBufferARB(((Class232) this).anInt2690,
			       ((Class232) this).anInt2692);
	return (OpenGL.glMapBufferARB(((Class232) this).anInt2690, 35001)
		+ (long) i);
    }
    
    void method4681() {
	if (((Class232) this).anInt2692 < 0) {
	    if (((Class103_Sub3_Sub2)
		 ((Class232) this).aClass103_Sub3_Sub2_2687)
		.aBool11161) {
		OpenGL.glGenBuffersARB(1, anIntArray2696, 0);
		((Class232) this).anInt2692 = anIntArray2696[0];
		OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				       ((Class232) this).anInt2692);
	    } else
		((Class232) this).anInt2692 = 0;
	}
    }
    
    public void method272() {
	OpenGL.glUnmapBufferARB(((Class232) this).anInt2690);
    }
    
    public void method273() {
	OpenGL.glUnmapBufferARB(((Class232) this).anInt2690);
    }
    
    long method4682() {
	return (((Class232) this).anInt2692 == 0
		? ((Class232) this).aNativeHeapBuffer2695.method98() : 0L);
    }
    
    Class232(Class103_Sub3_Sub2 class103_sub3_sub2, int i, boolean bool) {
	((Class232) this).aClass103_Sub3_Sub2_2687 = class103_sub3_sub2;
	((Class232) this).anInt2690 = i;
	((Class232) this).aBool2689 = bool;
    }
    
    void method4683() {
	if (((Class232) this).anInt2692 < 0) {
	    if (((Class103_Sub3_Sub2)
		 ((Class232) this).aClass103_Sub3_Sub2_2687)
		.aBool11161) {
		OpenGL.glGenBuffersARB(1, anIntArray2696, 0);
		((Class232) this).anInt2692 = anIntArray2696[0];
		OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				       ((Class232) this).anInt2692);
	    } else
		((Class232) this).anInt2692 = 0;
	}
    }
    
    public int method265() {
	return ((Class232) this).anInt2691;
    }
    
    void method189(int i) {
	if (i > ((Class232) this).anInt2694) {
	    method4673();
	    if (((Class232) this).anInt2692 > 0) {
		OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				       ((Class232) this).anInt2692);
		OpenGL.glBufferDataARBub(((Class232) this).anInt2690, i, null,
					 0,
					 (((Class232) this).aBool2689 ? 35040
					  : 35044));
		((Class232) this).aClass103_Sub3_Sub2_2687.anInt9506
		    += i - ((Class232) this).anInt2694;
	    } else
		((Class232) this).aNativeHeapBuffer2695
		    = ((Class232) this).aClass103_Sub3_Sub2_2687
			  .method15946(i, false);
	    ((Class232) this).anInt2694 = i;
	}
	((Class232) this).anInt2691 = i;
    }
    
    long method4684() {
	return (((Class232) this).anInt2692 == 0
		? ((Class232) this).aNativeHeapBuffer2695.method98() : 0L);
    }
    
    void method4685() {
	if (((Class103_Sub3_Sub2) ((Class232) this).aClass103_Sub3_Sub2_2687)
	    .aBool11161)
	    OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				   ((Class232) this).anInt2692);
    }
    
    void method4686() {
	if (((Class103_Sub3_Sub2) ((Class232) this).aClass103_Sub3_Sub2_2687)
	    .aBool11161)
	    OpenGL.glBindBufferARB(((Class232) this).anInt2690,
				   ((Class232) this).anInt2692);
    }
}
